package P02_javaBankATM;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class JavaBankAtm {
   /*      ATM
        Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

        Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.

        Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
        Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,       */

    static String kartNo;
    static int kartSifre = 1234;
    static int bakiye = 2000;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Lutfen 16 haneli kart numaranizi giriniz : ");
        kartNo = scan.nextLine().replace(" ", "");
        System.out.println("Lutfen kart sifrenizi giriniz : ");
        kartSifre = scan.nextInt();


        if (!(kartNo.length() == 16) && !(kartSifre == 4)) {
            System.out.println("Tekrar deneyiniz");


        } else {
            islemSecenek();
        }


    }

    public static void islemSecenek() {
        System.out.println("Hangi islemi yapmak istiyorsunuz? /nBakiye sorgula icin 1 /nPara yatirma icin 2 " +
                "/nPara çekme icin 3 /nPara gönderme icin 4 /nSifre değiştirme icin 5 /nCikis icin 6 ");
        int secenek = scan.nextInt();

        switch (secenek) {
            case 1:
                bakiyeSorgula();
                break;
            case 2:
                paraYatirma();
                break;
            case 3:
                paraCekme();
                break;
            case 4:
                paraGonderme();
                break;
            case 5:
                sifreDegistirme();
                break;
            case 6:
                cikis();
        }
    }


    private static void cikis() {
        System.out.println("Cikis isleminiz yapildi");
        System.out.println("**************");
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
        System.out.println("Iyi gunler dileriz");
    }

    private static void sifreDegistirme() {
        System.out.println("Lutfen eski sifrenizi giriniz");
        int girilenSifre = scan.nextInt();
        if (kartSifre == girilenSifre) {
            System.out.println("Yeni sifrenizi giriniz");
            int yeniSifre = scan.nextInt();
            System.out.println("Yeni sifrenizi tekrar giriniz");
            yeniSifre = scan.nextInt();
            System.out.println("Sifreniz basariyla degistirildi");
            System.out.println("Baska islem yapmak istiyorsaniz 1'i cikis icin 0 'i tuslayiniz");
            int karar = scan.nextInt();
            if (karar == 1) {
                islemSecenek();
            } else if (karar == 0) {
                System.out.println("Cikisiniz yapildi");
                System.out.println("Iyi gunler dileriz");
            }

        } else {
            System.out.println("Eski sifrenizi yanlis girdiniz");
            islemSecenek();
        }

    }

    private static void paraGonderme() {
        System.out.println("Para gondermek istediginiz iban no giriniz : ");
        Scanner scan=new Scanner(System.in);
        String IbanNo = scan.nextLine();

        if (IbanNo.startsWith("TR") && IbanNo.length() == 26) {
            System.out.println("Gondermek istediginiz tutari giriniz ; ");
            int gonderilecekPara = scan.nextInt();
            if (gonderilecekPara < bakiye) {
                bakiye -= gonderilecekPara;
                System.out.println("Para gonderme isleminiz basariyla gerceklestirildi");
                System.out.println("Hesabinizda kalan tutar : " + bakiye + " TL");
                System.out.println("Baska islem yapmak istiyorsaniz 1'i cikis icin 0 'i tuslayiniz");
                int karar = scan.nextInt();
                if (karar == 1) {
                    islemSecenek();
                } else if (karar == 0) {
                    System.out.println("Cikisiniz yapildi");
                    System.out.println("Iyi gunler dileriz");
                }
            } else {
                System.out.println("Yetersiz bakiye");
                islemSecenek();
            }

        } else {
            System.out.println("Iban No TR ile baslamali");
            islemSecenek();

        }
        }

        private static void paraCekme() {
            System.out.println("Lutfen cekmek istediginiz tutari giriniz");
            int cekilecekPara = scan.nextInt();
            if (cekilecekPara > bakiye) {
                System.out.println("Yetersiz bakiye");
                islemSecenek();
            } else {
                bakiye -= cekilecekPara;
                System.out.println("Hesabinizda kalan bakiye : " + bakiye);
                System.out.println("Baska islem yapmak istiyorsaniz 1'i cikis icin 0 'i tuslayiniz");
                int karar = scan.nextInt();
                if (karar == 1) {
                    islemSecenek();
                } else if (karar == 0) {
                    System.out.println("Cikisiniz yapildi");
                    System.out.println("Iyi gunler dileriz");
                }
            }
        }


        private static void paraYatirma() {
            System.out.println("Yatirmak istediginiz miktari giriniz");
            int yatirilacakPara = scan.nextInt();
            bakiye += yatirilacakPara;
            System.out.println("Toplam bakiyeniz : " + bakiye + " TL");
            System.out.println("Baska islem yapmak istiyorsaniz 1'i cikis icin 0 'i tuslayiniz");
            int karar = scan.nextInt();
            if (karar == 1) {
                islemSecenek();
            } else if (karar == 0) {
                System.out.println("Cikisiniz yapildi");
                System.out.println("Iyi gunler dileriz");
            }
        }

        private static void bakiyeSorgula() {
            System.out.println("Bakiyeniz : " + bakiye + " TL");
            System.out.println("*************");
            System.out.println("Baska islem yapmak istiyorsaniz 1'i cikis icin 0 'i tuslayiniz");
            int karar = scan.nextInt();
            if (karar == 1) {
                islemSecenek();
            } else if (karar == 0) {
                System.out.println("Cikisiniz yapildi");
                System.out.println("Iyi gunler dileriz");
            }
        }
    }


