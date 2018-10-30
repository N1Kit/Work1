import java.util.Scanner;

public class exOne {
    public static void main(String[] args) {
        String var;
        float res, z = 10;
        Scanner ix = new Scanner(System.in);
        System.out.println("Введите первое число");
        float x = ix.nextFloat();
        Scanner iy = new Scanner(System.in);
        System.out.println("Введите второе число");
        float y = iy.nextFloat();
        if ((z-x) < (z-y)) {
            var = "первое";
            res = x;
        }
        else {
            var = "второе";
            res = y;         }
        System.out.println("Ближайшее к " + z + " " + var + " введенное число " + res);
    }

}
