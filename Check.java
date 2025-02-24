import java.util.Scanner;

public class Check {

    public static void main(String[] args) {
        int age;
        System.out.println("Input age");
        Scanner userage = new Scanner(System.in);
        age = userage.nextInt();
        if (age>=18){
            System.out.println("Adult");
        }else{
            System.out.println("child");
        }

    }
}
