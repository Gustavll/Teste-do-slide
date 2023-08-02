import java.util.*;

public class Pedido {
    private Date data;
    private Endereco enderecoEntrega;
    private itemPedido[] itensPedido;
    
    
    public Pedido (){
        this.data = new Date();
    }

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
