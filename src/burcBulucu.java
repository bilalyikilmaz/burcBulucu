import java.util.Scanner;

public class burcBulucu {
    public static void main(String[] args) {
        // Değişkenler
        String month, burc = "";
        int day;
        Scanner input;
        boolean isError = false;

        //Kullanıcı Veri Girişi
        input = new Scanner(System.in);
        System.out.print("Lütfen Doğduğunuz Ay Bilgisini Giriniz (Ocak, Şubat.. vb.) : ");
        month = input.nextLine();
        System.out.print("Lütfen Doğduğunuz Gün Bilgisini Girin (1,2,3.. vb.) : ");
        day = input.nextInt();

        //Hesaplama Bloğu

        //Ocak
        if (month.equals("Ocak") || month.equals("ocak")) {
            if (day >= 1 && 21 >= day) {
                burc = "Oğlak Burcu";
            } else if (day >= 22 && 31 >= day) {
                burc = "Kova Burcu";
            } else {
                isError = true;
            }
        }
        //Şubat
        else if (month.equals("Şubat") || month.equals("şubat")) {
            if (day >= 1 && 19 >= day) {
                burc = "Kova Burcu";
            } else if (day >= 20 && 29 >= day) {
                burc = "Balık Burcu";
            } else {
                isError = true;
            }
        }
        //Mart
        else if (month.equals("Mart") || month.equals("mart")) {
            if (day >= 1 && 20 >= day) {
                burc = "Balık Burcu";
            } else if (day >= 21 && 31 >= day) {
                burc = "Koç Burcu";
            } else {
                isError = true;
            }
        }
        //Nisan
        else if (month.equals("Nisan") || month.equals("nisan")) {
            if (day >= 1 && 20 >= day) {
                burc = "Koç Burcu";
            } else if (day >= 21 && 31 >= day) {
                burc = "Boğa Burcu";
            } else {
                isError = true;
            }
        }

        //Mayıs
        else if (month.equals("Mayıs") || month.equals("mayıs")) {
            if (day >= 1 && 21 >= day) {
                burc = "Boğa Burcu";
            } else if (day >= 22 && 31 >= day) {
                burc = "İkizler Burcu";
            } else {
                isError = true;
            }
        }
        //Haziran
        else if (month.equals("Haziran") || month.equals("haziran")) {
            if (day >= 1 && 22 >= day) {
                burc = "İkizler Burcu";
            } else if (day >= 23 && 31 >= day) {
                burc = "Yengeç Burcu";
            } else {
                isError = true;
            }
        }
        //Temmuz
        else if (month.equals("Temmuz") || month.equals("temmuz")) {
            if (day >= 1 && 22 >= day) {
                burc = "Yengeç Burcu";
            } else if (day >= 23 && 31 >= day) {
                burc = "Aslan Burcu";
            } else {
                isError = true;
            }
        }
        //Ağustos
        else if (month.equals("Ağustos") || month.equals("ağustos")) {
            if (day >= 1 && 22 >= day) {
                burc = "Aslan Burcu";
            } else if (day >= 23 && 31 >= day) {
                burc = "Başak Burcu";
            } else {
                isError = true;
            }
        }
        //Eylül
        else if (month.equals("Eylül") || month.equals("eylül")) {
            if (day >= 1 && 22 >= day) {
                burc = "Başak Burcu";
            } else if (day >= 23 && 31 >= day) {
                burc = "Terazi Burcu";
            } else {
                isError = true;
            }
        }
        //Ekim
        else if (month.equals("Ekim") || month.equals("ekim")) {
            if (day >= 1 && 22 >= day) {
                burc = "Terazi Burcu";
            } else if (day >= 23 && 31 >= day) {
                burc = "Akrep Burcu";
            } else {
                isError = true;
            }
        }
        //Kasım
        else if (month.equals("Kasım") || month.equals("kasım")) {
            if (day >= 1 && 21 >= day) {
                burc = "Akrep Burcu";
            } else if (day >= 22 && 31 >= day) {
                burc = "Yay Burcu";
            } else {
                isError = true;
            }
        }
        //Aralık
        else if (month.equals("Aralık") || month.equals("aralık")) {
            if (day >= 1 && 21 >= day) {
                burc = "Yay Burcu";
            } else if (day >= 22 && 31 >= day) {
                burc = "Oğlak Burcu";
            } else {
                isError = true;
            }
        }
        if (isError) {
            System.out.println("Hatalı Giriş Yaptınız, Tekrar Deneyiniz!");
        } else {
            System.out.println("Burcunuz : " + burc);
        }

    }
}
