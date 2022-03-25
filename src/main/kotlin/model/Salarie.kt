package model

import java.util.*

data class Salarie (
    override val matriculation: Int,
    override val surname: String,
    override val name: String,
    override val age: Int,
    override val birthday: Date)
    : Person(matriculation, surname, name, age, birthday) {
        var fonction : String? = null
        var diplome : String? = null
        var statusCadre : Boolean = false
    override fun toString(): String {
        return "Salarie(matriculation=$matriculation, surname='$surname', name='$name', age=$age, birthday=$birthday, fonction=$fonction, diplome=$diplome, statusCadre=$statusCadre)"
    }

    override fun show(msg: String) {
        when (msg) {
            "fonction" -> println("$msg=$fonction")
            "fonction" -> println("$msg=$diplome")
            "fonction" -> println("$msg=$statusCadre")
            else -> super.show(msg)
        }
    }

}