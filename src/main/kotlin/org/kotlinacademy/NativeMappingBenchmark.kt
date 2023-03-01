package org.kotlinacademy

import org.kmapper.KMappedField
import org.kmapper.KMapper
import org.kmapper.converters.Converters
import org.kmapper.generated.ComplexClassToComplexDestinationClassKMapper
import org.kmapper.generated.OriginClassToDestinationClassKMapper
import org.kmapper.generated.OriginalAnnotatedClassToEmptyConstructorClassKMapper
import org.kmapper.testClasses.*
import org.openjdk.jmh.annotations.*
import org.openjdk.jmh.annotations.Scope
import java.util.concurrent.*


@Fork(value = 1, warmups = 3)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@BenchmarkMode(Mode.All)
@Measurement(iterations = 200)
@State(Scope.Thread)
open class NativeMappingBenchmark {

    private val from = OriginClass(10, "10", 10.0, 10, 10)

    private val fromComplexClass = ComplexClass(10, "10", 10.0, 10, 10,
        10, "10", 10.0, 10, 10, 10, "10", 10.0, 10, 10,
        10, "10", 10.0, 10, 10,10, "10", 10.0, 10, 10,
        10, "10", 10.0, 10, 10, 10, "10", 10.0, 10, 10, 10, "10", 10.0, 10, 10,
        10, "10", 10.0, 10, 10, 10, "10", 10.0, 10, 10,
        10, "10", 10.0, 10, 10, 10, "10", 10.0, 10, 10)

    val converters = Converters();

    val originalAnnotatedClass = OriginalAnnotatedClass("10", 10)

    @Benchmark
    @BenchmarkMode(Mode.All)
    fun mappingSimpleEmptyConstructorClass() : EmptyConstructorClass {
        return OriginalAnnotatedClassToEmptyConstructorClassKMapper(originalAnnotatedClass, converters).map()
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    fun mappingSimpleDataClass() : DestinationClass {
        return OriginClassToDestinationClassKMapper(from, converters).map()
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    fun mappingComplexDataClass(): ComplexDestinationClass {
        return ComplexClassToComplexDestinationClassKMapper(fromComplexClass, converters).map()
    }
}