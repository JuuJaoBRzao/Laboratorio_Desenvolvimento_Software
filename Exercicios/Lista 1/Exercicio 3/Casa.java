package newpackage;

/**
 *
 * @author laboratorio
 */
public class Casa {
    private float tamanho;

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
    
    public float calcularPreco(float tamanho){
        float preco = tamanho * 1500;
        return preco;
    }
    
    public float calcularPreco(float tamanho, int quartos){
        float precoTotal = (tamanho * 1500) + (quartos *10000);
        return precoTotal;
    }
}
