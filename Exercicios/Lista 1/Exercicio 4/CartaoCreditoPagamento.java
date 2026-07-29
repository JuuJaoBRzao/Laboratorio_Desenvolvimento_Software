package newpackage1;

/**
 *
 * @author laboratorio
 */
public class CartaoCreditoPagamento extends MetodoPagamento{
    
    public CartaoCreditoPagamento() {
        super("Cartão de Crédito");
    }

    @Override
    public void processaPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + valor + " via Cartão de Crédito.");
    }

    @Override
    public void mostraDetalhesPagamento() {
        System.out.println("Método: " + getNomeMetodo() + " | ID Pagamento: " + getIdPagamento());
    }
}
