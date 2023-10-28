package behavioral.observer;

import behavioral.observer.subscribers.Subscriber;
import behavioral.observer.subscribers.impl.SubscriberAlex;
import behavioral.observer.subscribers.impl.SubscriberAnn;

public class TestObserver {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel();
        Subscriber Alex = new SubscriberAlex();
        Subscriber Ann = new SubscriberAnn();

        channel.addSubscriber(Alex);
        channel.addSubscriber(Ann);

        channel.releaseNewVideo("I'm so tired");

    }
}
