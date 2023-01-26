package org.kotlinacademy

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

    // 1 438 909 ns
    var mapper = KMapper()
    val from = OriginClass(10, "10", 10.0, 10, 10)

    @Benchmark
    @BenchmarkMode(Mode.All)
    fun mappingColdStart(){
        var newKMapper = KMapper()
        val to = newKMapper.map(from, DestinationClass::class)
        println("$to")
    }
    @Benchmark
    @BenchmarkMode(Mode.All)
    fun mappingWithCache() {
        val to = mapper.map(
            from,
            DestinationClass::class
        )
        println("$to")
    }

    data class OriginClass(val int:Int, val string:String, val double: Double, val short: Short, val byte: Byte)

    data class DestinationClass(val int:Int, val string:String, val double: Double, val short: Short, val byte: Byte)
}