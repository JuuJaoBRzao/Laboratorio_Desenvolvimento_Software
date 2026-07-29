package newpackage1;

/**
 *
 * @author laboratorio
 */
public class PIXPagamento extends MetodoPagamento{
    public PIXPagamento() {
        super("PIX");
    }

    @Override
    public void processaPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + valor + " via PIX.");
    }

    @Override
    public void mostraDetalhesPagamento() {
        System.out.println("Método: " + getNomeMetodo() + " | ID Pagamento: " + getIdPagamento());
    }
}
