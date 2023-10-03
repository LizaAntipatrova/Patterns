package structural.composite;

public class TestComposite {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();

        RoboCat roboCat = new RoboCat(3.5);
        RoboCat roboCat1 = new RoboCat(1.1);
        RoboCat roboCat2 = new RoboCat(4.4);

        box1.add(box2);
        box1.add(box3);
        box2.add(roboCat1);
        box2.add(roboCat2);
        box1.add(roboCat);

        System.out.println(box1.weigh());
    }
}
;
