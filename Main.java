import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int price1, price2, price3, price4, price5;
        String name;
        System.out.print("Enter your name: ");
        name = S.nextLine();
        System.out.println("Enter the first price:");
        price1= S.nextInt();
        System.out.println("Enter the second price:");
        price2= S.nextInt();
        System.out.println("Enter the third price:");
        price3= S.nextInt();
        System.out.println("Enter the fourth price:");
        price4= S.nextInt();
        System.out.println("Enter the fifth price:");
        price5= S.nextInt();

    }
}