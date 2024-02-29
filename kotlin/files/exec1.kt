fun main() {

    println("Say my name!")
    var nome = readLine();
    if (nome != null) {
        nome = nome.lowercase();
    }

    // Quando, não tem nada haver com (while)
    when (nome) {
        "heisenberg" -> {
            println("You are God damn right!");
        }
        "walter", "white", "walter white" -> {
            println("I not in danger Skyler! I'm the Danger!!!");
        }
        "jesse", "pinkman" -> {
            println("Let's cook");
        }
        else -> println("poor boy...");
    }

    /*
    if (nome != null) {
        if (nome == "heisenberg") {
            println("You are God damn right!")

        } else if (nome.indexOf("walter") >= 0 || nome.indexOf("white") >= 0) {
            println("I not in danger Skyler! I'm the Danger!!!");

        } else {
            println("poor boy...")
        }
    }*/
}