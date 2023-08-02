public class Endereco {
    // declaração de atributos
    private String Rua;
    private int Numero;

    // construtor de endereco
    public Endereco(){

    }
    // get do atributo rua
    public String getRua(){
        return this.Rua;
    }
    // set do atributo rua
    public void setRua(String R){
        this.Rua = R;
    }
    // get do atributo numero
    public int getNumero(){
        return this.Numero;
    }
    // set do atributo numero
    public void setNumero(int num){
        this.Numero = num;
    }

}
