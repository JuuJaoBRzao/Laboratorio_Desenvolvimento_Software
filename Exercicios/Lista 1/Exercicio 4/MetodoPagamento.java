package newpackage1;

/**
 *
 * @author laboratorio
 */
public abstract class MetodoPagamento {
    private String nomeMetodo;
    private int idPagamento;
    
     public MetodoPagamento(String nomeMetodo) {
        this.nomeMetodo = nomeMetodo;
        this.idPagamento = (int) (Math.random() * 100000);
    }
     
     public String getNomeMetodo() {
        return nomeMetodo;
    }

    public void setNomeMetodo(String nomeMetodo) {
        this.nomeMetodo = nomeMetodo;
    }

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }
   
    public abstract void processaPagamento(double valor);

    public abstract void mostraDetalhesPagamento();
}
