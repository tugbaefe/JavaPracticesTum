package InterviewOuestions5;

import java.util.Scanner;

public class PrintVowelsOfString {
    public static void main(String[] args) {

        //Get String from user and print just vowels(aeiou) inside String on the console

        System.out.println("1. Yol");
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir cumle ya da kelime giriniz : ");
        String ifade= scan.nextLine().toLowerCase();


        for (int i = 0; i <ifade.length() ; i++) {
            char sesliHarf=ifade.charAt(i);
            if (sesliHarf=='a' || sesliHarf=='e'|| sesliHarf=='i'|| sesliHarf=='o'|| sesliHarf=='u'){
                System.out.print(sesliHarf);
            }

        }
        System.out.println(" ");
        System.out.println("2. Yol");

        String yeniIfade=ifade.replaceAll("[^aeiou]","");
        System.out.println(yeniIfade);


    }
}
