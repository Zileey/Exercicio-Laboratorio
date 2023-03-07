import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        int NP1,NP2,media;
        Scanner entry = new Scanner(System.in);

        System.out.println("Digite a sua NP1:");
        NP1 = entry.nextInt();

        System.out.println("Digite a sua NP2:");
        NP2 = entry.nextInt();

        media = (NP1 + NP2)/2;
        System.out.println("Sua média final é: "+media);
    }
}
