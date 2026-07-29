package newpackage1;

/**
 *
 * @author laboratorio
 */
public class PayPalPagamento extends MetodoPagamento{
     public PayPalPagamento() {
        super("PayPal");
    }

    @Override
    public void processaPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + valor + " via PayPal.");
    }

    @Override
    public void mostraDetalhesPagamento() {
        System.out.println("Método: " + getNomeMetodo() + " | ID Pagamento: " + getIdPagamento());
    }
}
