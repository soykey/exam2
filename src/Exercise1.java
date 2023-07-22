abstract class Person {
    String name;
    double height;
    double weight;

    Person() {
    }

    Person(String name, double height, double weight){
    }

    abstract void setName(String name);
    abstract void setHeight(double height);
    abstract void setWeight(double weight);
    abstract String getName();
    abstract double getHeight();
    abstract double getWeight();
    abstract public void print();
}

class BMI extends Person {
    void setName(String name) {
        this.name = name;
    }

    void setHeight(double height) {
        this.height = height;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    String getName() {
        return this.name;
    }

    double getHeight() {
        return this.height;
    }

    double getWeight() {
        return this.weight;
    }

    double getBMI() {
        return (getWeight()/Math.pow((getHeight()/100),2));
    }

    public void print() {
        System.out.println("名前 : " + getName());
        System.out.println("身長[cm] : " + getHeight());
        System.out.println("体重[kg] : " + getWeight());
        System.out.printf("BMI : %.2f\n",getBMI());
    }

}

public class Exercise1 {
    public static void main(String[] args) {
        BMI tanaka = new BMI();
        tanaka.setName("田中");
        tanaka.setHeight(170.0);
        tanaka.setWeight(70);

        tanaka.print();
    }
}
