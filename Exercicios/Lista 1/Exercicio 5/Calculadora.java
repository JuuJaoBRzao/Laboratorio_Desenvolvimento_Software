public class Calculadora implements ICalculadora {

    @Override
    public double somar(double n1, double n2) {
        return n1 + n2;
    }

    @Override
    public double subtrair(double n1, double n2) {
        return n1 - n2;
    }

    @Override
    public double multiplicar(double n1, double n2) {
        return n1 * n2;
    }

    @Override
    public double dividir(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("Erro: divisão por zero.");
            return 0;
        }
        return n1 / n2;
    }

    @Override
    public double raizquadrada(double n1, double n2) {
        // raiz de índice n2 do número n1 (ex: n2 = 2 -> raiz quadrada, n2 = 3 -> raiz cúbica)
        return Math.pow(n1, 1.0 / n2);
    }

    @Override
    public double elevarPotencia(double n1, double n2) {
        return Math.pow(n1, n2);
    }

    @Override
    public double logaritmo10(double n1) {
        return Math.log10(n1);
    }
}
