package model

interface IPersonSupport {
    fun afficher(msg : String) : Unit
    fun getAnciennete(age : Int) : Int
}