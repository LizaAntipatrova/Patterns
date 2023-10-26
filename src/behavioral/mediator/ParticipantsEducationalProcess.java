package behavioral.mediator;

public abstract class ParticipantsEducationalProcess {
    private final Mediator mediator;

    public ParticipantsEducationalProcess(Mediator mediator) {
        this.mediator = mediator;
    }

    public void sendMassage(String massage) {
        mediator.notify(this, massage);
    }

    public abstract void getMassage(String massage);
}
