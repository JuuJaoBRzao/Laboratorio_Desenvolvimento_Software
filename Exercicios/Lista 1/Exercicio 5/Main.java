public class Main {

    public static void main(String[] args) {

        ICalculadora calc = new Calculadora();

        System.out.println("Soma: " + calc.somar(10, 5));
        System.out.println("Subtração: " + calc.subtrair(10, 5));
        System.out.println("Multiplicação: " + calc.multiplicar(10, 5));
        System.out.println("Divisão: " + calc.dividir(10, 5));
        System.out.println("Raiz quadrada de 25: " + calc.raizquadrada(25, 2));
        System.out.println("Potência: " + calc.elevarPotencia(2, 8));
        System.out.println("Log10 de 100: " + calc.logaritmo10(100));
    }
}
