package org.kotlinacademy

import org.kmapper.KMappedField
import org.kmapper.KMapper
import org.kmapper.testClasses.*
import org.openjdk.jmh.annotations.*
import org.openjdk.jmh.annotations.Scope
import java.util.concurrent.*


@Fork(value = 1, warmups = 3)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@BenchmarkMode(Mode.All)
@Measurement(iterations = 200)
@State(Scope.Thread)
open class KMapperBenchmarkNoCache {

    private val from = OriginClass(10, "10", 10.0, 10, 10)
    private val fromWithAnnotation = AnnotatedClass(10, "10", 10.0, 10, 10)

    private val fromComplexClass = ComplexClass(10, "10", 10.0, 10, 10,
        10, "10", 10.0, 10, 10, 10, "10", 10.0, 10, 10,
        10, "10", 10.0, 10, 10,10, "10", 10.0, 10, 10,
        10, "10", 10.0, 10, 10, 10, "10", 10.0, 10, 10, 10, "10", 10.0, 10, 10,
        10, "10", 10.0, 10, 10, 10, "10", 10.0, 10, 10,
        10, "10", 10.0, 10, 10, 10, "10", 10.0, 10, 10)

    @Benchmark
    @BenchmarkMode(Mode.All)
    fun mappingSimpleClass(): DestinationClass {
        var newKMapper = KMapper()
        return newKMapper.map(from, DestinationClass::class)
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    fun mappingWithAnnotatedValues(): DestinationClass {
        var newKMapper = KMapper()
        return newKMapper.map(
            fromWithAnnotation,
            DestinationClass::class
        )
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    fun mappingComplexClass(): ComplexDestinationClass {
        var newKMapper = KMapper()
        return newKMapper.map(fromComplexClass, ComplexDestinationClass::class)
    }

}