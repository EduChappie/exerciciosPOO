data class User(var nome:String, var lastName: String, var isAdmin: Boolean) {

    companion object {
        private val users = mutableListOf<User>()
        fun createUsers(count: Int) : List<User> {
            for (i in 0 until count) {
                users.add(User("${i+1}", "Desconhecido", false));
            }
            return users;
        }
    }

    lateinit var ultimoNome: String

    fun output() = println("Nome: $nome $ultimoNome; \nAdmin: $isAdmin;");


}