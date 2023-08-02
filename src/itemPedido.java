public class itemPedido {
    // declaração de atributos
    private int Codigo;
    private double Valor;
    private int Quantidade;

    //construtor
    public itemPedido(){
        
    }
    //get do atributo codigo
    public int getCodigo(){
       return this.Codigo;
    }
    //set do atributo codigo (void pois não retorna nada)
    public void setCodigo(int cdg){
        this.Codigo = cdg;
    }
    //get do atributo valor
    public double getValor(){
        return this.Valor;
    }
    // set do atributo valor
    public void setValor(double vl){
        this.Valor = vl;
    }
    // get do atributo quantidade
    public int getQuantidade(){
        return this.Quantidade;
    }
    // set do atributo quantidade
    public void setQuantidade(int qnt){
        this.Quantidade = qnt;
    }















}
