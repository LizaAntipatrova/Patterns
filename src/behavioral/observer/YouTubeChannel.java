package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel extends Publisher {
    private final List<String> releasedVideos;

    public YouTubeChannel() {
        super();
        releasedVideos = new ArrayList<>();
    }

    public void releaseNewVideo(String name) {
        releasedVideos.add(name);
        notifySubscribers("released a new video of \"" + name + "\"");
    }

    public List<String> getReleasedVideos() {
        return releasedVideos;
    }
}
