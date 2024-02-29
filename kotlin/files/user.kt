data class User(var nome:String, var isAdmin: Boolean) {

    lateinit var ultimoNome: String

    fun output() = println("Nome: $nome $ultimoNome; \nAdmin: $isAdmin;");


}