import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
          Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM),
          yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
          İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

          Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
          Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
          Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
          Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
          Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
          Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

          İPUCU:
          Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
          Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
          İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
          Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
          Toplam Tutar = (135-27)* 2 = 216 TL
         */
        int yas,yolculukTipi;
        double toplamUcret,mesafe,normalUcret,indirimli,indirimli2, cocukIndirim = 0.50,ortayasIndirim=0.10 , yasliIndirim= 0.30,gidisDonus=0.20;
        Scanner inp = new Scanner(System.in);


        System.out.print("Mesafe'yi Giriniz: ");
        mesafe = inp.nextInt();
        System.out.print("Yaşınızı Giriniz: ");
        yas = inp.nextInt();
        System.out.print("1 - Tek Yön\n2 - Gidiş Dönüş\nLütfen Yolculuk Tipini Seçiniz: ");
        yolculukTipi = inp.nextInt();
        normalUcret = mesafe * 0.10;


        if (yolculukTipi==1 && yas>=1 && mesafe>=1) {
            if (yas<12){
                indirimli = normalUcret*cocukIndirim;
                toplamUcret= normalUcret - indirimli;
                System.out.println("Ücretiniz: " + toplamUcret);
            } else if (yas>=12 && yas<=24) {
            indirimli = normalUcret*ortayasIndirim;
            toplamUcret=normalUcret - indirimli;
            System.out.println("Ücretiniz: " + toplamUcret);

            } else if (yas>=65) {
                indirimli = normalUcret*yasliIndirim;
                toplamUcret = normalUcret - indirimli;
                System.out.println("Ücretiniz: " + toplamUcret);
            }else {
                toplamUcret = normalUcret;
                System.out.println("Ücretiniz: " + toplamUcret);
            }

        } else if (yolculukTipi==2 && yas>1 && mesafe >=1) {
            if(yas<12){
                indirimli= normalUcret*cocukIndirim;
                toplamUcret= (normalUcret - indirimli)*2;
                indirimli2= toplamUcret - (toplamUcret * gidisDonus);
                System.out.println("Ücretiniz: " + indirimli2);
            }else if(yas>=12 && yas<=24){
                indirimli = normalUcret*ortayasIndirim;
                toplamUcret=(normalUcret - indirimli)*2;
                indirimli2= toplamUcret - (toplamUcret*gidisDonus);
                System.out.println("Ücretiniz: " + indirimli2);
            } else if (yas>=65) {
                indirimli = normalUcret*yasliIndirim;
                toplamUcret=(normalUcret - indirimli)*2;
                indirimli2= toplamUcret - (toplamUcret*gidisDonus);
                System.out.println("Ücretiniz: " + indirimli2);
            }
            else{
                toplamUcret = normalUcret*2;
                indirimli2 = toplamUcret - (toplamUcret*gidisDonus);
                System.out.println("Ücretiniz: " + indirimli2);
            }
        } else {
            System.out.println("Hatalı Giriş Yaptınız, Lütfen Tekrar Deneyiniz. ");
        }


    }




    }
