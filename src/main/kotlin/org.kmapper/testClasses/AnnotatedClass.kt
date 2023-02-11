package org.kmapper.testClasses

import org.kmapper.KMappedField

data class AnnotatedClass(
        @property:KMappedField(destinationField = "int") val intAnnotated:Int,
        @property:KMappedField(destinationField = "string") val stringAnnotated:String,
        @property:KMappedField(destinationField = "double") val doubleAnnotated: Double,
        @property:KMappedField(destinationField = "short") val shortAnnotated: Short,
        @property:KMappedField(destinationField = "byte") val byteAnnotated: Byte)