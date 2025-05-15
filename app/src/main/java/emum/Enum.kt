package emum

/*

Em Kotlin o Enum ele e considerado uma classe

ele é usado quando temos um tipo de dados que consiste em um conjunto de constantes
128 Kbps.
usando ordinal com o enum  println("Status Pedido: $StatusPedidio.Aguardadndo_Aprovacao.ordinal")
* */





enum class StatusPedidio{

    Aguardadndo_Aprovacao,//0
    Pedido_Realizado,//1
    Pagamento_Confirmado,//2
    Pedido_Enviado,//3
    Pedido_Entregue,//4
    Pedido_Cancelado//5



}

class Pedido(
    // Propriedade
    var total: Double = 0.0,
    var itens:String="",
    var statusPedidio:StatusPedidio = StatusPedidio.Aguardadndo_Aprovacao
){


}

fun main() {
val pedido = Pedido(30.0,"Bana, maca")
    pedido.statusPedidio = StatusPedidio.Pedido_Enviado


    // Pagamento com cartao
    pedido.statusPedidio = StatusPedidio.Aguardadndo_Aprovacao




    // Pagamento com pIX

    pedido.statusPedidio = StatusPedidio.Pagamento_Confirmado

println("Statu do Pedido: ${StatusPedidio.Pagamento_Confirmado.ordinal}")

    //  Historico de Compras
    if(pedido.statusPedidio == StatusPedidio.Pedido_Realizado){
        println("o seu pedido foi realizado")
    }else if(pedido.statusPedidio == StatusPedidio.Pagamento_Confirmado ){
        println("pagamento realizado com sucesso")
    }else if(pedido.statusPedidio == StatusPedidio.Pedido_Enviado) {
        println("Pedido em viado chegara em breve ")
    }else{
        pedido.statusPedidio= StatusPedidio.Pedido_Cancelado
        println("Peido cancelado entre em contato com a sua Financiadora")
    }
}