import java.util.Scanner;

public class posto {
    public static void main(String[] args) {
        int litros,op;
        double gaso = 4.90;
        double alco = 6.00;
        double result = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Álcool ou Gasolina? 1 - Álcool 2 - Gasolina");
        op = teclado.nextInt();

        switch (op){
            case 1:
                System.out.println("Quantos litros vai abastacer?");
                litros = teclado.nextInt();
                if(litros > 20){
                    alco = alco - (alco * 0.05);
                    result = alco * litros;
                } else if (litros <= 20) {
                   alco = alco - (alco *0.03);
                    result = alco * litros;
                }
                break;

            case 2:
                System.out.println("Quantos litros vai abastecer?");
                litros = teclado.nextInt();
                if (litros > 20){
                    gaso = gaso - (gaso - 0.06);
                    result = gaso * litros;
                }else if(litros <= 20){
                    gaso = gaso - (gaso - 0.04);
                    result = gaso * litros;
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + op);
        }
        System.out.println("Total a pagar: R$"+ result);
    }
}
