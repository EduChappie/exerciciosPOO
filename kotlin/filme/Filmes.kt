package filme

// Classe principal
class Filmes constructor(

    // Atributos dados a Classe
    private var name:String = "",
    private var author:String = "",
    private var duration:Int = 0
){
    // Métodos atribuidos a classe
    fun status(): String {
        return """
            
        """.trimIndent()
    }

    fun watch(name:String) = println("Assistindo... $name")

    fun getName(): String = this.name
    fun setName(newName:String) { this.name = newName }


}