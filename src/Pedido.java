//import para usar a data
import java.util.*;

public class Pedido {
    // declaração de atributos
    private Date data;
    private Endereco enderecoEntrega;
    // itemPedido em formato de vetor pois armazena um ou mais pedidos por cliente
    private itemPedido[] itensPedido;
    
    //contrutor de pedido
    public Pedido (){
        this.data = new Date();
    }

    //gets e sets dos atributos em questão

    public Date getData(){
        return data;
    }

    public void setEnderecoEntrega (Endereco e){
        this.enderecoEntrega = e;
    }

    public Endereco getEnderecoEntrega(){
        return enderecoEntrega;
    }
    
    public void setItensPedido(itemPedido[] itens){
        this.itensPedido = itens;
    }

    public itemPedido[] getItensPedido(){
        return itensPedido;
    }















}
