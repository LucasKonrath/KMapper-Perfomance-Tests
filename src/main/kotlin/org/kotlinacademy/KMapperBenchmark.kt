package org.kotlinacademy

import org.kmapper.KMappedField
import org.kmapper.KMapper
import org.openjdk.jmh.annotations.*
import org.openjdk.jmh.infra.Blackhole
import sun.security.krb5.internal.crypto.Des
import java.util.concurrent.*
import java.util.concurrent.*
import java.util.ArrayList

@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
open class KMapperBenchmark {

    private var mapper = KMapper()

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
    fun mappingColdStartSimpleClass(){
        var newKMapper = KMapper()
        val to = newKMapper.map(from, DestinationClass::class)
        println("$to")
    }
    @Benchmark
    @BenchmarkMode(Mode.All)
    fun mappingWithCacheSimpleClass() {
        val to = mapper.map(
            from,
            DestinationClass::class
        )
        println("$to")
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    fun mappingWithAnnotatedValuesNotCached(){
        var newKMapper = KMapper()
        val to = newKMapper.map(
            fromWithAnnotation,
            DestinationClass::class
        )
        println("$to")
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    fun mappingWithAnnotatedValuesCached(){
        val to = mapper.map(
            fromWithAnnotation,
            DestinationClass::class
        )
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    fun mappingColdStartComplexClass(){
        var newKMapper = KMapper()
        val to = newKMapper.map(fromComplexClass, ComplexDestinationClass::class)
        println("$to")
    }
    @Benchmark
    @BenchmarkMode(Mode.All)
    fun mappingWithCacheComplexClass() {
        val to = mapper.map(
            fromComplexClass,
            ComplexDestinationClass::class
        )
        println("$to")
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    fun straightMappingSimpleClass() {
        val to = DestinationClass(10, "10", 10.0, 10, 10)
        println("$to")
    }

    @Benchmark
    @BenchmarkMode(Mode.All)
    fun straightMappingComplexClass(){
        val to = ComplexClass(10, "10", 10.0, 10, 10,
            10, "10", 10.0, 10, 10, 10, "10", 10.0, 10, 10,
            10, "10", 10.0, 10, 10,10, "10", 10.0, 10, 10,
            10, "10", 10.0, 10, 10, 10, "10", 10.0, 10, 10, 10, "10", 10.0, 10, 10,
            10, "10", 10.0, 10, 10, 10, "10", 10.0, 10, 10,
            10, "10", 10.0, 10, 10, 10, "10", 10.0, 10, 10)
        println("$to")
    }

    data class OriginClass(val int:Int, val string:String, val double: Double, val short: Short, val byte: Byte)
    data class AnnotatedClass(
        @property:KMappedField(destinationField = "int") val intAnnotated:Int,
        @property:KMappedField(destinationField = "string") val stringAnnotated:String,
        @property:KMappedField(destinationField = "double") val doubleAnnotated: Double,
        @property:KMappedField(destinationField = "short") val shortAnnotated: Short,
        @property:KMappedField(destinationField = "byte") val byteAnnotated: Byte)

    data class DestinationClass(val int:Int, val string:String, val double: Double, val short: Short, val byte: Byte)

    data class ComplexClass(val intOne: Int, val stringOne: String, val doubleOne: Double, val shortOne: Short, val byteOne: Byte,
                            val intTwo: Int, val stringTwo: String, val doubleTwo: Double, val shortTwo: Short, val byteTwo: Byte,
                            val intThree: Int, val stringThree: String, val doubleThree: Double, val shortThree: Short, val byteThree: Byte,
                            val intFour: Int, val stringFour: String, val doubleFour: Double, val shortFour: Short, val byteFour: Byte,
                            val intFive: Int, val stringFive: String, val doubleFive: Double, val shortFive: Short, val byteFive: Byte,
                            val int6: Int, val string6: String, val double6: Double, val short6: Short, val byte6: Byte,
                            val int7: Int, val string7: String, val double7: Double, val short7: Short, val byte7: Byte,
                            val int8: Int, val string8: String, val double8: Double, val short8: Short, val byte8: Byte,
                            val int9: Int, val string9: String, val double9: Double, val short9: Short, val byte9: Byte,
                            val int10: Int, val string10: String, val double10: Double, val short10: Short, val byte10: Byte,
                            val int11: Int, val string11: String, val double11: Double, val short11: Short, val byte11: Byte,
                            val int12: Int, val string12: String, val double12: Double, val short12: Short, val byte12: Byte
    )

    data class ComplexDestinationClass(val intOne: Int, val stringOne: String, val doubleOne: Double, val shortOne: Short, val byteOne: Byte,
                            val intTwo: Int, val stringTwo: String, val doubleTwo: Double, val shortTwo: Short, val byteTwo: Byte,
                            val intThree: Int, val stringThree: String, val doubleThree: Double, val shortThree: Short, val byteThree: Byte,
                            val intFour: Int, val stringFour: String, val doubleFour: Double, val shortFour: Short, val byteFour: Byte,
                            val intFive: Int, val stringFive: String, val doubleFive: Double, val shortFive: Short, val byteFive: Byte,
                            val int6: Int, val string6: String, val double6: Double, val short6: Short, val byte6: Byte,
                            val int7: Int, val string7: String, val double7: Double, val short7: Short, val byte7: Byte,
                            val int8: Int, val string8: String, val double8: Double, val short8: Short, val byte8: Byte,
                            val int9: Int, val string9: String, val double9: Double, val short9: Short, val byte9: Byte,
                            val int10: Int, val string10: String, val double10: Double, val short10: Short, val byte10: Byte,
                            val int11: Int, val string11: String, val double11: Double, val short11: Short, val byte11: Byte,
                            val int12: Int, val string12: String, val double12: Double, val short12: Short, val byte12: Byte
    )
}