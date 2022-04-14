package InterviewOuestions5;

public class CountFactors {
    public static void main(String[] args) {
         /*
        Type java code by using while loop,
       Write a program to count the factors of an integer which is entered by user.
       Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
       Factors of 8  = 1, 2, 4, 8 ==> 4
*/

        int sayi=8;
        int bolenler=1;
        int sayac=0;

        while (bolenler<=sayi){
            for (int i = 1; i <=sayi ; i++) {
                if (sayi%i==0){
                    sayac++;
                    System.out.print(i+" ");

                }
                bolenler++;

            }
            System.out.println("Sayinin tam bolenleri : " +sayac+ " adettir." );

        }
    }
}
