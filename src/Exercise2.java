import java.util.Objects;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BMI person = new BMI();

        while (true) {
            System.out.print("名前 -> ");
            String name = sc.next();

            if (Objects.equals(name, "END")) {return;}

            System.out.print("身長[cm] -> ");
            double height = sc.nextDouble();

            System.out.print("体重[kg] -> ");
            double weight = sc.nextDouble();
            System.out.println();

            person.setName(name);
            person.setHeight(height);
            person.setWeight(weight);
            person.print();

            System.out.println();
        }


    }
}
