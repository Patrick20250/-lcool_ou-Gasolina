package desafios

class Contato(
    // propriedades
    val nomePessoa: String,
    val telefone:String,
    val email: String?= null) {
}


private fun cadastrarContato(contatos: MutableList<Contato>){

    println("Nome: ")
    val nomePessoa = readLine()?: "Nome Desconhecido"

    println("Contato: ")
    val telefone = readLine()?: "Telefone desconhecido"

    println("email:")
    val emailImput=readLine()?:"Email desconhecido"
    val email = if (emailImput.isNotBlank()) emailImput else null

    
    
    val contato = Contato(nomePessoa,telefone,email)
    contatos.add(contato)
        println("Contato adicionado com sucesso")

    

}


private fun listarContato(contatos: List<Contato>){


    if(contatos.isEmpty()){
        println("Nenhum contato em contrado")
    }else{
        println("Lista de contatos: ")

        for (contato in contatos){
            println("nome: ${contato.nomePessoa} telefone: ${contato.telefone} email: ${contato.email?: "Sem email"}" )
        }
    }

}

private fun listaContatoPeloNOme(contatos: List<Contato>){
    println("Digite o nome: ")
    val nomeBusca = readLine()

    val encontrado = contatos.find { it.nomePessoa == nomeBusca }

    if (encontrado != null){
        println("Contado encontrado : nome: ${encontrado.nomePessoa} telefone: ${encontrado.telefone} email: ${encontrado.email?: "Sem email"}")
    }else{
        println("contato nao encontrado.")
    }
}






private fun menu(): String{


println("========= Menu ==========")

    println("1 Cadastrar contato")
    println("2 Listar contato")
    println("3 Buscar Contato por nome")
    println("4 Sair")
    println("Escolha a opcao")
    println("===================")
    return readLine()?:"0"




}

fun executarOpcao(opcao: String, contatos: MutableList<Contato>){
    when (opcao){
        "1"-> cadastrarContato(contatos)
        "2"-> listarContato(contatos)
        "3"-> listaContatoPeloNOme(contatos)
        "4"->  println("Saindo do Sistema")
        else-> println(" opcao Invalida. tente Novamente")
    }
}





fun main() {
    val contatos = mutableListOf<Contato>()
    var opcao: String

    do{
        opcao = menu()
        executarOpcao(opcao,contatos)
    }while (opcao!= "4")

}