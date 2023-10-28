package behavioral.observer.subscribers.impl;

import behavioral.observer.subscribers.Subscriber;

public class SubscriberAnn implements Subscriber {
    @Override
    public void update(String massage) {
        System.out.println("It’s time to unsubscribe why I need to know " + massage);
    }
}
