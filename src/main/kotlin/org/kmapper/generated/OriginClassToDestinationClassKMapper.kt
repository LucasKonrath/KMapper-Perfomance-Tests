package org.kmapper.generated

import kotlin.Any
import kotlin.reflect.KClassifier
import org.kmapper.IKMapper
import org.kmapper.converters.Converters
import org.kmapper.testClasses.DestinationClass
import org.kmapper.testClasses.OriginClass

public class OriginClassToDestinationClassKMapper(
  private val from: OriginClass,
  private val converters: Converters,
) : IKMapper {
  public fun constructClass(): DestinationClass = DestinationClass( convert(from.int,
      from.int!!::class, kotlin.Int::class) as kotlin.Int, convert(from.string,
      from.string!!::class, kotlin.String::class) as kotlin.String, convert(from.double,
      from.double!!::class, kotlin.Double::class) as kotlin.Double, convert(from.short,
      from.short!!::class, kotlin.Short::class) as kotlin.Short, convert(from.byte,
      from.byte!!::class, kotlin.Byte::class) as kotlin.Byte )

  public override fun map(): DestinationClass {
    val to = constructClass()
    return to
  }

  public fun convert(
    from: Any,
    typeClassifier: KClassifier,
    toClassifier: KClassifier,
  ): Any = converters.getConverter(typeClassifier, toClassifier)?.invoke(from)!!
}
