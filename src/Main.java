import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int heat ;
        Scanner alici= new Scanner(System.in);
        System.out.print("Lütfen sıcaklık değerini giriniz:");
        heat = alici.nextInt();
        if (heat<5){
            System.out.println("Kayak yapabilirsiniz");

        } else if (heat>=15&&heat<20) {
            System.out.println("Sinemaya veya pikniğe gidebilirsiniz");

        } else if (heat>5&&heat<15) {
            System.out.println("Sinemaya gidebilirsiniz");
            
        } else if (heat>20&& heat<25) {
            System.out.println("Pikniğe gidebilirsiniz");
            
        }
        else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }

    }
}