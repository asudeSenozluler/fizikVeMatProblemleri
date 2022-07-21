import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Matematik ve Fizik Problemleri Programına Hoş geldiniz...");
        String islemler="İşlemler...\n"
                +"1.Daire Alanı Hesaplama...\n"
                +"2.Üçgen Çevresi Bulma...\n"
                +"3.Vektörün İç Çarpımını Bulma...\n"
                +"Çıkış:q";
        while (true){
            System.out.println(islemler);
            System.out.println("İşlemi seçin: ");
            String islem=scanner.nextLine();

            if(islem.equals("q")){
                System.out.println("Çıkış yapılıyor...");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Yarıçap:");
                int r=scanner.nextInt();
                Problem.Matematik.daireAlan(r);
            }
            else if(islem.equals("2")){

                System.out.println("Kenar 1:");
                int k1=scanner.nextInt();
                System.out.println("Kenar 2:");
                int k2=scanner.nextInt();
                System.out.println("Kenar 3:");
                int k3=scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.ucgenCevresi(k1,k2,k3);
            }
            else if(islem.equals("3")){
                Vector v1=new Vector("Vektor1");
                Vector v2=new Vector("Vektor2");
                Problem.Fizik.icCarpim(v1,v1);
            }
            else {
                System.out.println("Geçersiz İşlem!");
            }


        }

    }
}




