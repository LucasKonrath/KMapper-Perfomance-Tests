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
open class KMapperBenchmarkCached {

    private lateinit var mapper: KMapper

    private val from = OriginClass(10, "10", 10.0, 10, 10)
    private val fromWithAnnotation = AnnotatedClass(10, "10", 10.0, 10, 10)

    private val fromComplexClass = ComplexClass(10, "10", 10.0, 10, 10,
        10, "10", 10.0, 10, 10, 10, "10", 10.0, 10, 10,
        10, "10", 10.0, 10, 10,10, "10", 10.0, 10, 10,
        10, "10", 10.0, 10, 10, 10, "10", 10.0, 10, 10, 10, "10", 10.0, 10, 10,
        10, "10", 10.0, 10, 10, 10, "10", 10.0, 10, 10,
        10, "10", 10.0, 10, 10, 10, "10", 10.0, 10, 10)

    @Setup(Level.Iteration)
    fun setupCache(){
        mapper = KMapper()
        //This setups the transformations in cache
        mapper.map(from, DestinationClass::class)
        mapper.map(fromWithAnnotation, DestinationClass::class)
        mapper.map(fromComplexClass, ComplexDestinationClass::class)
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    fun mappingSimpleClass(): DestinationClass {
        return mapper.map(
            from,
            DestinationClass::class
        )
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    fun mappingWithAnnotatedValues(): DestinationClass {
        return mapper.map(
            fromWithAnnotation,
            DestinationClass::class
        )
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    fun mappingComplexClass(): ComplexDestinationClass {
        return mapper.map(
            fromComplexClass,
            ComplexDestinationClass::class
        )
    }

}