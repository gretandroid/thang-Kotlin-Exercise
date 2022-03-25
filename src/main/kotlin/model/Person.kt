package model

import java.util.*

open class Person (
    open val matriculation : Int,
    open val surname : String,
    open val name : String,
    open val age : Int,
    open val birthday : Date)  : IPersonSupport {

    var salary : Double = 0.0
    private val vehicles : MutableList<Vehicle> = mutableListOf()

    fun addVehicle(vehicle: Vehicle) : Unit {
        vehicles.add(vehicle)
    }

//    fun addVehicles(vehicles: List<Vehicle>) : Unit {
//        vehicles.addAll(vehicles)
//    }

    fun getVehicles() : List<Vehicle> {
        return vehicles;
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Person) return false

        if (matriculation != other.matriculation) return false
        if (surname != other.surname) return false
        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = matriculation
        result = 31 * result + surname.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + age
        return result
    }

    override fun toString(): String {
        return "Person(matriculation=$matriculation, surname='$surname', name='$name', age=$age, birthday=$birthday, salary=$salary)"
    }

    override fun afficher(msg: String) {
        println("$this in ${this.javaClass.simpleName} say $msg")
    }

    override fun getAnciennete(age: Int): Int {
        println("In ${this.javaClass.simpleName} : $age")
        return age * 2
    }

}
