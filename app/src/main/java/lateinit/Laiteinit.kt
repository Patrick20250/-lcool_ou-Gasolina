package lateinit

/*
* late -> tarde,tardio
* init -> iniciar,inicializar
* lateinit  ele e um atributo da class
* */





class Produto{
    lateinit var descricao:String

}

fun main() {
    val produto = Produto()
    produto.descricao = "Iphone"
    println(produto.descricao)

}