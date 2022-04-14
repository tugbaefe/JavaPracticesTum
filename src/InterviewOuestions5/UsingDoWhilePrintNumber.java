package InterviewOuestions5;

import java.util.Scanner;

public class UsingDoWhilePrintNumber {
    public static void main(String[] args) {
         /*
        create one int
        do while int is less then 100
        print the number
        increment by 5
        for example: 0   5   10  15  20
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 100 den kucuk bir sayi giriniz");
        int sayi= scan.nextInt();

        do {
            System.out.print(sayi+" ");
            sayi+=5;

        }while (sayi<100);


    }
}
