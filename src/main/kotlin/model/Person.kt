package model

import java.util.*

data class Person(
    val matriculation : Int,
    val surname : String,
    val name : String,
    val age : Int,
    val birthday : Date) {

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

}
