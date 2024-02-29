package exercícios

fun main() {

    val a:String = "1"
    val b:String = "1"

    println("A exercícios.soma de $a + $b = ${a+b}")

    //Caracteres visuais
    /*
    *  /n -> quebra de linha
    *  /t -> da um espaço de TAB
    * */

    // Operadores
    /* + exercícios.soma
    *  - subtração
    *  * vezes
    *  / divisão
    * */

    val name = "Eduardo Fabrício" // string é uma sequência de Char
    val idade = 31
    val firtsLetter = 'E'  // Char

    println(firtsLetter::class)
    println(name::class)
    println(" ")


    val msg = "Seu produto chegou!"
    val welcome = """
        Olá meu amigo
        seu produto chegou
    """.trimIndent() // aparar arestas
    val cod = """
        valor 1,
        valor 2
    """.replaceIndent("R$ ")

    println(name)
    println("Tamanho: " + name.length)
    println(name.uppercase())
    println(name.lowercase())

    println(cod)

    if (idade >= 18 && idade <= 20) {
        println("Você é maior de idade \npode dirigir")

    } else if (idade > 40) {
        println("You are a big lier")

    } else {
        println("Você é de menor \nvai estudar")
    }

        if (idade > 30) println("It's work")

        println("terminou")
        println(" ")

        val endereco:String? = "null"

        println(endereco?.length ?: "sem valor")

        // ?: Elvis, kaskdak parece o Elvis
    }