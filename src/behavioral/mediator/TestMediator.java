package behavioral.mediator;

public class TestMediator {

    public static void main(String[] args) {
        GroupHead groupHead = new GroupHead();
        MathTeacher teacher = new MathTeacher(groupHead);
        Students group666 = new Students(groupHead);
        groupHead.setMathTeacher(teacher);
        groupHead.setGroup(group666);

        group666.sendMassage("Can we sacrifice the proforg?");

        teacher.sendMassage("No, the degenerates");

    }
}
