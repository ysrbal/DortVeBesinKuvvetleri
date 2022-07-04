import java.util.Scanner;

public class SayiKuvvetleri {
    public static void main(String[] args) {
        int n, kuvvetDort = 0, kuvvetBes = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lutfen Bir Sayi Giriniz : ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i *= 4) {
            System.out.println("Dordun" + kuvvetDort + "." + "Kuvveti : " + i);
            kuvvetDort++;


        }
        System.out.println("*********************************");

        for (int k = 1; k <= n; k *= 5) {
            System.out.println("Besin" + kuvvetBes + "." + "Kuvveti : " + k);
            kuvvetBes++;

        }


    }
}

