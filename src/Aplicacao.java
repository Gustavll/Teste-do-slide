public class Aplicacao {
    public static void main(String[] args) throws Exception {
       
        itemPedido[] itens = new itemPedido[2];



        itens[0] = new itemPedido();
        itens[0].setCodigo(7);
        itens[0].setValor(19.0);
        itens[0].setQuantidade(1);


        itens[1] = new itemPedido();
        itens[1].setCodigo(10);
        itens[1].setValor(33.5);
        itens[1].setQuantidade(5);

      
        Endereco end = new Endereco();
        end.setRua("Rua das flores");
        end.setNumero(50);



        Pedido p = new Pedido();
        p.setEnderecoEntrega(end);
        p.setItensPedido(itens);


        System.out.println("Sera entregue em: ");
        System.out.print(p.getEnderecoEntrega().getRua() + " ");
        System.out.println(p.getEnderecoEntrega().getNumero());



        for (int i = 0; i < p.getItensPedido().length; i++){
            System.out.print (p.getItensPedido()[i].getCodigo() + " - ");
                   
            System.out.print (p.getItensPedido()[i].getValor() + " - ");

            System.out.println(p.getItensPedido()[i].getQuantidade());

        }












        
    }
}
