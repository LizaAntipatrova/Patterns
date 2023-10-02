package prototype;

public class TestPrototype {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit(3, "White", "Angora");
        System.out.println(rabbit);
        Cloneable rabbitClone = rabbit.clone();
        System.out.println(rabbitClone);
    }
}
