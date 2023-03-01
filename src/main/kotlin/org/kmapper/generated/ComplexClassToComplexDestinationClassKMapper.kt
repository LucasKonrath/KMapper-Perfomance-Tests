package org.kmapper.generated

import kotlin.Any
import kotlin.reflect.KClassifier
import org.kmapper.IKMapper
import org.kmapper.converters.Converters
import org.kmapper.testClasses.ComplexClass
import org.kmapper.testClasses.ComplexDestinationClass

public class ComplexClassToComplexDestinationClassKMapper(
  private val from: ComplexClass,
  private val converters: Converters,
) : IKMapper {
  public fun constructClass(): ComplexDestinationClass = ComplexDestinationClass(
      convert(from.intOne, from.intOne!!::class, kotlin.Int::class) as kotlin.Int,
      convert(from.stringOne, from.stringOne!!::class, kotlin.String::class) as kotlin.String,
      convert(from.doubleOne, from.doubleOne!!::class, kotlin.Double::class) as kotlin.Double,
      convert(from.shortOne, from.shortOne!!::class, kotlin.Short::class) as kotlin.Short,
      convert(from.byteOne, from.byteOne!!::class, kotlin.Byte::class) as kotlin.Byte,
      convert(from.intTwo, from.intTwo!!::class, kotlin.Int::class) as kotlin.Int,
      convert(from.stringTwo, from.stringTwo!!::class, kotlin.String::class) as kotlin.String,
      convert(from.doubleTwo, from.doubleTwo!!::class, kotlin.Double::class) as kotlin.Double,
      convert(from.shortTwo, from.shortTwo!!::class, kotlin.Short::class) as kotlin.Short,
      convert(from.byteTwo, from.byteTwo!!::class, kotlin.Byte::class) as kotlin.Byte,
      convert(from.intThree, from.intThree!!::class, kotlin.Int::class) as kotlin.Int,
      convert(from.stringThree, from.stringThree!!::class, kotlin.String::class) as kotlin.String,
      convert(from.doubleThree, from.doubleThree!!::class, kotlin.Double::class) as kotlin.Double,
      convert(from.shortThree, from.shortThree!!::class, kotlin.Short::class) as kotlin.Short,
      convert(from.byteThree, from.byteThree!!::class, kotlin.Byte::class) as kotlin.Byte,
      convert(from.intFour, from.intFour!!::class, kotlin.Int::class) as kotlin.Int,
      convert(from.stringFour, from.stringFour!!::class, kotlin.String::class) as kotlin.String,
      convert(from.doubleFour, from.doubleFour!!::class, kotlin.Double::class) as kotlin.Double,
      convert(from.shortFour, from.shortFour!!::class, kotlin.Short::class) as kotlin.Short,
      convert(from.byteFour, from.byteFour!!::class, kotlin.Byte::class) as kotlin.Byte,
      convert(from.intFive, from.intFive!!::class, kotlin.Int::class) as kotlin.Int,
      convert(from.stringFive, from.stringFive!!::class, kotlin.String::class) as kotlin.String,
      convert(from.doubleFive, from.doubleFive!!::class, kotlin.Double::class) as kotlin.Double,
      convert(from.shortFive, from.shortFive!!::class, kotlin.Short::class) as kotlin.Short,
      convert(from.byteFive, from.byteFive!!::class, kotlin.Byte::class) as kotlin.Byte,
      convert(from.int6, from.int6!!::class, kotlin.Int::class) as kotlin.Int, convert(from.string6,
      from.string6!!::class, kotlin.String::class) as kotlin.String, convert(from.double6,
      from.double6!!::class, kotlin.Double::class) as kotlin.Double, convert(from.short6,
      from.short6!!::class, kotlin.Short::class) as kotlin.Short, convert(from.byte6,
      from.byte6!!::class, kotlin.Byte::class) as kotlin.Byte, convert(from.int7,
      from.int7!!::class, kotlin.Int::class) as kotlin.Int, convert(from.string7,
      from.string7!!::class, kotlin.String::class) as kotlin.String, convert(from.double7,
      from.double7!!::class, kotlin.Double::class) as kotlin.Double, convert(from.short7,
      from.short7!!::class, kotlin.Short::class) as kotlin.Short, convert(from.byte7,
      from.byte7!!::class, kotlin.Byte::class) as kotlin.Byte, convert(from.int8,
      from.int8!!::class, kotlin.Int::class) as kotlin.Int, convert(from.string8,
      from.string8!!::class, kotlin.String::class) as kotlin.String, convert(from.double8,
      from.double8!!::class, kotlin.Double::class) as kotlin.Double, convert(from.short8,
      from.short8!!::class, kotlin.Short::class) as kotlin.Short, convert(from.byte8,
      from.byte8!!::class, kotlin.Byte::class) as kotlin.Byte, convert(from.int9,
      from.int9!!::class, kotlin.Int::class) as kotlin.Int, convert(from.string9,
      from.string9!!::class, kotlin.String::class) as kotlin.String, convert(from.double9,
      from.double9!!::class, kotlin.Double::class) as kotlin.Double, convert(from.short9,
      from.short9!!::class, kotlin.Short::class) as kotlin.Short, convert(from.byte9,
      from.byte9!!::class, kotlin.Byte::class) as kotlin.Byte, convert(from.int10,
      from.int10!!::class, kotlin.Int::class) as kotlin.Int, convert(from.string10,
      from.string10!!::class, kotlin.String::class) as kotlin.String, convert(from.double10,
      from.double10!!::class, kotlin.Double::class) as kotlin.Double, convert(from.short10,
      from.short10!!::class, kotlin.Short::class) as kotlin.Short, convert(from.byte10,
      from.byte10!!::class, kotlin.Byte::class) as kotlin.Byte, convert(from.int11,
      from.int11!!::class, kotlin.Int::class) as kotlin.Int, convert(from.string11,
      from.string11!!::class, kotlin.String::class) as kotlin.String, convert(from.double11,
      from.double11!!::class, kotlin.Double::class) as kotlin.Double, convert(from.short11,
      from.short11!!::class, kotlin.Short::class) as kotlin.Short, convert(from.byte11,
      from.byte11!!::class, kotlin.Byte::class) as kotlin.Byte, convert(from.int12,
      from.int12!!::class, kotlin.Int::class) as kotlin.Int, convert(from.string12,
      from.string12!!::class, kotlin.String::class) as kotlin.String, convert(from.double12,
      from.double12!!::class, kotlin.Double::class) as kotlin.Double, convert(from.short12,
      from.short12!!::class, kotlin.Short::class) as kotlin.Short, convert(from.byte12,
      from.byte12!!::class, kotlin.Byte::class) as kotlin.Byte )

  public override fun map(): ComplexDestinationClass {
    val to = constructClass()
    return to
  }

  public fun convert(
    from: Any,
    typeClassifier: KClassifier,
    toClassifier: KClassifier,
  ): Any = converters.getConverter(typeClassifier, toClassifier)?.invoke(from)!!
}
