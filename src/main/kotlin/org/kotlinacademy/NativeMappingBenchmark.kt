package org.kotlinacademy

import org.kmapper.KMappedField
import org.kmapper.KMapper
import org.kmapper.testClasses.ComplexClass
import org.kmapper.testClasses.ComplexDestinationClass
import org.kmapper.testClasses.DestinationClass
import org.kmapper.testClasses.OriginClass
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

    @Benchmark
    @BenchmarkMode(Mode.All)
    fun mappingSimpleClass() : DestinationClass {
        return DestinationClass(
            from.int,
            from.string,
            from.double,
            from.short,
            from.byte
        )
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    fun mappingComplexClass(): ComplexDestinationClass {
        return ComplexDestinationClass(fromComplexClass)
    }
}