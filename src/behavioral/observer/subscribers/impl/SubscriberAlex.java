package behavioral.observer.subscribers.impl;

import behavioral.observer.subscribers.Subscriber;

public class SubscriberAlex implements Subscriber {
    @Override
    public void update(String massage) {
        System.out.println("Yay, " + massage);
    }
}
