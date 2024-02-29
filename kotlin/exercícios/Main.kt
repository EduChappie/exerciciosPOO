package exercícios

import java.awt.Button

fun main() {
    println("Olá Kotlin")

    // criação de variável
    var name:String = "Eduado"
    var age:Int = 33            // var -> pode mudar tudo, é mutável
    val constant:Double = 3.14  // val -> imutável

    // Tipos primitivos
    /*
    * Byte -> 8 bits
    * Short -> 16 bits
    * Int -> 32 bits
    * Long -> 64 bits
    *
    * Int == Float - 32 bits
    * Long == Double - 64 bits
    *
    * Booleana
    *
    * */

    val yes:Boolean = true
    val no:Boolean = false

    println("Nome: $name")
    println("Idade: $age")
    println(constant)

    // troca do valor de dentro
    name = "bella"

    println(name)




    val mediaPreco:Double = 22.54
    val answer = mediaPreco.toInt()

    println("R$ $answer ")




    val objetcts:String = "Kotlin"
    val feling:String = "love"
    val person:String = "I"
    println("$person $feling $objetcts")
}