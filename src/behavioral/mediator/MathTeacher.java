package behavioral.mediator;

public class MathTeacher extends ParticipantsEducationalProcess {
    public MathTeacher(Mediator mediator) {
        super(mediator);
    }


    @Override
    public void getMassage(String massage) {
        System.out.println("I got a message \"" + massage + "\"");
    }
}
