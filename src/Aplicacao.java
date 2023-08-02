public class Aplicacao {
    public static void main(String[] args) throws Exception {
       // inicia o item pedido declarando quantos pedidos ele receberá
        itemPedido[] itens = new itemPedido[2];


        // preenche o primeiro espaço do vetor 
        itens[0] = new itemPedido();
        itens[0].setCodigo(7);
        itens[0].setValor(19.0);
        itens[0].setQuantidade(1);

        // preenche o segundo espaço do vetor
        itens[1] = new itemPedido();
        itens[1].setCodigo(10);
        itens[1].setValor(33.5);
        itens[1].setQuantidade(5);

        // inicia e informa o endereco
        Endereco end = new Endereco();
        end.setRua("Rua das flores");
        end.setNumero(50);


        //inicia pedido e preenche seus atributos com as informações já estabelecidas
        Pedido p = new Pedido();
        p.setEnderecoEntrega(end);
        p.setItensPedido(itens);

        // imprime na tela onde será entregue
        System.out.println("Sera entregue em: ");
        System.out.print(p.getEnderecoEntrega().getRua() + " ");
        System.out.println(p.getEnderecoEntrega().getNumero());


        // imprime cada uma das informações estabelecidas
        for (int i = 0; i < p.getItensPedido().length; i++){
            System.out.print (p.getItensPedido()[i].getCodigo() + " - ");
                   
            System.out.print (p.getItensPedido()[i].getValor() + " - ");

            System.out.println(p.getItensPedido()[i].getQuantidade());

        }












        
    }
}
