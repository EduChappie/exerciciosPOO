package files

import java.io.FileWriter
import java.io.IOException


fun main() {

    val userA = Usuario(buscarSistemaLog());
    userA.log("Post 1 familia #toAqui")
}

fun buscarSistemaLog(): LoggerGeneric {
    return SystemFiles();
}


interface LoggerGeneric {
    fun log(msg: String);
}

class SystemConsol(): LoggerGeneric {
    override fun log(msg: String) {
        println(msg);
    }
}

class SystemFiles(): LoggerGeneric {
    override fun log(msg: String) {
        println("escrevendo '$msg' no arquivo");
        val path = "/Users/Windows.lite/Downloads/msg.txt"
        try {
            val fw = FileWriter(path, true)
            fw.write(msg);
            fw.write("\n");
            fw.close();

        } catch (err: IOException) {
            err.printStackTrace()
        }
    }
}




/*fun main() {

    val euA = Usuario();

    euA.createPublish();

    val euB = Usuario();
    euB.createPublish();
}*/

class Usuario(val logger: LoggerGeneric) {

    init {
        log("User created!")
    }

    fun createPublish() {
        log("New post created!")
    }

    fun log(mensagem: String) {
        logger.log(mensagem);
    }
}