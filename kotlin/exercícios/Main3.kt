package exercícios/*fun exercícios.main() {
    val filme1 = exercícios.Filme("Bastardos Inglórios", elenco = "all word")
    filme1.status()

    val filme2 = exercícios.Filme("Era uma vez em Hollywood", elenco = "Leonardo DiCaprio", description = "old actor, a beatiful woman. Its is all you need know")
    filme2.status()
    filme2.updateTitulo("Once upon a time in Hollywood")
    filme2.status()

    login(filme1)

    filme2.assistir()
}*/
class Filme constructor(var titulo: String = "", var description: String = "", var elenco: String = "") {

    fun assistir() = println("\nIniciando... \n Assistindo $titulo")

    fun status() = println(" \nTitulo: $titulo \nDescription: $description \nElenco: $elenco")

    fun updateTitulo(newTitulo: String) {
        this.titulo = newTitulo
    }
}

class User(private var nome: String = "Desconhecido") {

    lateinit var lastName: String

    fun pegarNome(): String {
        return this.nome
    }

    fun output(): String = "Meu nome é $nome $lastName, I'm a fuck King"

    fun updateNome(newNome: String) {
        this.nome = newNome
    }
}
