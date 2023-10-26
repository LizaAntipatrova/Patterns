package behavioral.mediator;

public class Students extends ParticipantsEducationalProcess {
    public Students(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void getMassage(String massage) {
        System.out.println("Oh no, we got a message \"" + massage + "\"");
    }
}
