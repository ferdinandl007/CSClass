import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("assessment name");

        String assessmet = input.next();

        System.out.println("module Name");
        int number = input.nextInt();

        int total = 0;

        for (int w =0; w < number; w++ ){
            total = total + input.nextInt();
        }
        int bob,fofo,fd;

        bob = 0;

        bob = bob + 3;
        total = total / number;

        if (total < 40){
            System.out.println("fall");
        } else if (total < 50){
            System.out.println("c");
        } else if (total < 60) {
            System.out.println("b");
        } else if (total < 70){
            System.out.println("b+");
        } else if (total >= 70 ){
            System.out.println("a");
        }
        ArrayList<int> predictions = new ArrayList<>();




    }


    public String toString() {
        return
    }
}
