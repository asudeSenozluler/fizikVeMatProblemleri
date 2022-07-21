public class Problem {
    public static class Matematik {
        public static void daireAlan(int yaricap) {
            System.out.println("Dairenin alanı: " + (Math.PI * yaricap * yaricap));
        }

        public static void ucgenCevresi(int k1, int k2, int k3) {
            System.out.println("Üçgenin Çevresi: " + (k1 + k2 + k3));

        }
    }
    public static class Fizik {
               public static void icCarpim(Vector v1,Vector v2){
                   int icCarpim=v1.getI()*v2.getI()+v1.getJ()*v2.getJ()+v1.getK()*v2.getK();
                   System.out.println(v1.getIsim()+"ile"+ v2.getIsim()+"in iç çarpımı = "+icCarpim );
               }
    }

}
