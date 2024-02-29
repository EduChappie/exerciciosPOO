package exercícios

fun main() {
    println("Soma: ${soma(77, 33)}")
    println("Multiplicação: ${multiplicar(2.0, 3.1)}")

    getAge("Eduardo", 21, true)
    getAge("leonardo", 22)
    getAge("Clara", 98)
}

fun soma(a:Int, b:Int): Int {
    return a+b;
}

fun multiplicar(a:Double, b:Double): Double {
    return a*b
}

fun olaMundo() = println("ola mundo");

fun getAge(nome: String, idade: Int, isAdmin: Boolean = false) {
    println("Eu sou $nome \n tenho $idade anos \n e sou admin? $isAdmin")
    if (idade < 18 || idade > 70) println("Não pode dirigir") else println("ta liberado para dirigir")
    println(" ")
}