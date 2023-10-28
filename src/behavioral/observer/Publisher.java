package behavioral.observer;

import behavioral.observer.subscribers.Subscriber;

import java.util.HashSet;
import java.util.Set;

public abstract class Publisher {
    protected Set<Subscriber> subscribers;

    public Publisher() {
        this.subscribers = new HashSet<>();
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    protected void notifySubscribers(String massage) {
        for (Subscriber sub : subscribers) {
            sub.update(massage);
        }
    }
}
