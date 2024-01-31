package Animals;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Peter", "Whiskas");
        Animal dog = new Dog("Rocky", "Meat");
        System.out.println(cat.explainSelf());
        System.out.println(cat.manageSelf());
        System.out.println(dog.explainSelf());
        System.out.println(dog.manageSelf());
    }
}
