import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        double num1,num2,resp;
        int op;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 2 numeros inteiros");

        num1 = teclado.nextInt();
        num2 = teclado.nextInt();

        System.out.println("O que você deseja realizar com eles? 1 - Soma" +"\n2 - Subtração" +"\n3 - Multiplicação" +"\n4 - Divisão" +"\n5 - Exponencial");
        op = teclado.nextInt();

        switch (op) {
            case 1:
                resp = num1 + num2;
                System.out.println("A soma entre os dois números é: " + resp);
                break;

            case 2:
                resp = num1 + num2;
                System.out.println("A subtração dos dois números é: "+resp);
                break;

            case 3:
                resp = num1 * num2;
                System.out.println("A multiplicação dos dois números é: "+ resp);
                break;

            case 4:
                resp = num1 / num2;
                System.out.println("A divisão entre os dois números é: "+ resp);
                break;

            case 5:
                resp = Math.pow(num1,num2);
                System.out.println("A exponencial entre os dois números é: "+ resp);
                break;

            default:
                System.out.println("Digite uma opção válida");
        }
    }
}
