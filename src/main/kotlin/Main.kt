fun main() {
    val titulo = readLine() ?: ""
    val autor = readLine() ?: ""

    val slugTitulo = titulo.generateSlug()
    val slugAutor = autor.generateSlug()

    println("Slug gerado para o livro:")

    println("${slugTitulo}_${slugAutor}")
}

fun String.generateSlug(): String {
    var retirandoEpecialChar = this.replace(".", "-")
    var retirandoEspaco = retirandoEpecialChar.replace(" ", "-")
    var retirandoEspacoExtra = retirandoEspaco.replace("--","-")
    var lowCase = retirandoEspacoExtra.lowercase()


    return lowCase
}
