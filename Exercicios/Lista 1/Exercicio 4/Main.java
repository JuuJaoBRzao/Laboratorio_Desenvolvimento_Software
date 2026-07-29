package newpackage1;

/**
 *
 * @author laboratorio
 */
public class Main {
    public static void main(String[] args) {

        CartaoCreditoPagamento cartao = new CartaoCreditoPagamento();
        PayPalPagamento paypal = new PayPalPagamento();
        PIXPagamento pix = new PIXPagamento();

        cartao.processaPagamento(150.00);
        cartao.mostraDetalhesPagamento();

        paypal.processaPagamento(89.90);
        paypal.mostraDetalhesPagamento();

        pix.processaPagamento(300.50);
        pix.mostraDetalhesPagamento();
    }
}
