import model.Person
import model.Salarie
import model.Vehicle
import java.text.DateFormat
import java.text.SimpleDateFormat

fun main(args: Array<String>) {
    val DATE_FORMATER : DateFormat = SimpleDateFormat("dd/MM/yyyy")
    println("Hello World!")

    // 3 - instantiate 4 persons
    val person1 = Person(1, "PHAM", "Thang", 40, DATE_FORMATER.parse("01/10/1981"))
    person1.salary = 10000.00

    val person2 = Person(1, "PHAM", "Thang", 40, DATE_FORMATER.parse("01/10/1981"))
    person2.salary = 20000.00

    val person3 = Person(3, "TRINH", "Mai", 32, DATE_FORMATER.parse("26/08/1989"))

    val person4 = Person(4, "PHAM", "Alexandre", 8, DATE_FORMATER.parse("14/08/2014"))

    // Create a MultableList
    val persons : MutableList<Person> = mutableListOf(person1, person2, person3, person4)

    for (i in persons.indices) {
        for (j in i+1 until persons.size - 1) {
            if (persons[i] == persons[j]) {
                println("Person $i is identical to Person $j")
            }
        }
    }

    // 4 - add 2 vehicles for each person
    person1.addVehicle(Vehicle(1, "Blue"))
    person1.addVehicle(Vehicle(2, "Green"))

    person2.addVehicle(Vehicle(3, "Red"))
    person2.addVehicle(Vehicle(4, "Yellow"))

    person3.addVehicle(Vehicle(5, "Black"))
    person3.addVehicle(Vehicle(6, "White"))

    person4.addVehicle(Vehicle(6, "Brown"))
    person4.addVehicle(Vehicle(6, "Violette"))

    // 5 - show vehicles of each person
    for (person in persons) {
        println("Person ${person.matriculation} has following vehicles : ")
        for (vehicle in person.getVehicles())
        println("\t $vehicle")
    }

    // 6-8 Salarie -> Person
    val salarie1 = Salarie(1, "PHAM", "Louis", 7, DATE_FORMATER.parse("30/09/2015"))
    salarie1.fonction = "Eleve"
    salarie1.diplome = "Elemetaire"
    salarie1.statusCadre = false

    println(salarie1)

    salarie1.afficher("Hello")
    println("${salarie1.getAnciennete(20)}");
}