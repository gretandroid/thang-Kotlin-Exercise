package model

import java.util.*

data class Person(
    val matriculation : Int,
    val surname : String,
    val name : String,
    val age : Int,
    val birthday : Date) {

    var salary : Double = 0.0

}
