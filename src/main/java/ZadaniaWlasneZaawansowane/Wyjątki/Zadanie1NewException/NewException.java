package ZadaniaWlasneZaawansowane.Wyjątki.Zadanie1NewException;

import java.util.Scanner;

public class NewException {
    public static void main(String[] args) throws CannotDivideBy0Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("wprowadz a");
        int a = input.nextInt();

        System.out.println("wprowadz b");
        int b = input.nextInt();


        System.out.println("wynik" + divide(a,b));
    }
    public static double divide(int a, int b) throws CannotDivideBy0Exception {
        if (b == 0){
            throw new CannotDivideBy0Exception(b);
        } else{
            return a / b;
        }

    }
}
