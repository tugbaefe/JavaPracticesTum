package InterviewOuestions5;

import java.util.Scanner;

public class CountsOfRepeatingElement {
    public static void main(String[] args) {
 /*
            How many times a given number is repeated in a sequence
            Create the Java program that finds it.
     */

        int arr[]={5,5,5,85,84,84,12,13,13,9};
        Scanner scan=new Scanner(System.in);
        System.out.print("Istediginiz sayiyi giriniz : ");
        int tekrarliSayi= scan.nextInt();
        int sayac=0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==tekrarliSayi){
                sayac++;

            }
        }
        System.out.println("Listede aradigimiz sayi : " + tekrarliSayi + " ve " + sayac+ " adettir.");




    }
}
