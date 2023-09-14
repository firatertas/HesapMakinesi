import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double n1,n2;
       int select;
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Sayıyı giriiz :");
        n1 = sc.nextDouble();
        System.out.print("2. Sayıyı giriiz :");
        n2 = sc.nextDouble();
        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nYapmak istediğiniz işlemi seçin : ");
        select = sc.nextInt();

        switch (select){
            case 1:
                System.out.println("Taplam : "+ (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma : "+ (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma : "+ (n1*n2));
                break;
            case 4:
                switch ((int) n2){
                    case 0:
                        System.out.println("Sayılar 0'a bölünemez!");
                        break;
                        default:
                            System.out.println("Bölme : "+(n1/n2));
                }
                break;
            default:
                System.out.println("Geçersiz bir bilgi girdiniz. Lütfen tekrar deneyiniz!");
        }
    }
}