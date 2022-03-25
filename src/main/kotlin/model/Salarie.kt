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

    override fun afficher(msg: String) {
        println("$this in ${this.javaClass.simpleName} say $msg")
    }

    override fun getAnciennete(age: Int): Int {
        println("In ${this.javaClass.simpleName} : $age")
        return age * 4
    }
}