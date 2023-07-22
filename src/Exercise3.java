import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BMI> people = new ArrayList<BMI>();
        int i = 0;
        while (true) {
            System.out.print("名前 -> ");
            String name = sc.next();

            if (Objects.equals(name, "END")) {break;}

            System.out.print("身長[cm] -> ");
            double height = sc.nextDouble();

            System.out.print("体重[kg] -> ");
            double weight = sc.nextDouble();
            System.out.println();

            BMI person = new BMI();
            person.setName(name);
            person.setHeight(height);
            person.setWeight(weight);
            people.add(i,person);
            i++;
        }

        System.out.println();

        double avgh = 0;
        double avgw = 0;
        double avgBMI = 0;

        Iterator<BMI> itr = people.iterator();
        while (itr.hasNext()) {
            BMI person = itr.next();
            avgh += person.getHeight();
            avgw += person.getWeight();
            avgBMI += person.getBMI();
            person.print();
            System.out.println();
        }

        System.out.println();
        System.out.printf("身長[cm]の平均 = %.1f\n",(avgh/(i)));
        System.out.printf("体重[kg]の平均 = %.1f\n",(avgw/(i)));
        System.out.printf("BMIの平均 = %.2f\n",(avgBMI/(i)));
    }
}
