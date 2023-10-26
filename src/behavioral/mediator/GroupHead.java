package behavioral.mediator;

public class GroupHead implements Mediator {
    private MathTeacher mathTeacher;
    private Students group;


    @Override
    public void notify(ParticipantsEducationalProcess sender, String massage) {
        if (sender.equals(mathTeacher)) {
            group.getMassage(massage);
        } else if (sender.equals(group)) {
            mathTeacher.getMassage(massage);
        }
    }

    public void setMathTeacher(MathTeacher mathTeacher) {
        this.mathTeacher = mathTeacher;
    }

    public void setGroup(Students group) {
        this.group = group;
    }
}
