package exercícios

fun main() {

    if (Constants.DOMAIN != "www.google.com") {
        val userA = User("Anônimo")
        println(userA.pegarNome())
    }
}

object Constants {
    const val DOMAIN = "www.edu.org.edu.br"
    const val IMAGE_PATH = "/src/image"
    const val MAX_LENGTH = 8
}