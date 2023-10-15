package behavioral.command;

public class Volume {
    private static final int MAX_VOLUME = 100;
    private static final int MIN_VOLUME = 0;
    private int volumeLevel;
    private boolean silentMode;

    public Volume() {
        this.volumeLevel = 50;
        this.silentMode = false;
    }

    public void increaseVolume() {
        if (volumeLevel < MAX_VOLUME) {
            volumeLevel += 5;
        }
        showCurrentVolume();
    }

    public void decreaseVolume() {
        if (volumeLevel > MIN_VOLUME) {
            volumeLevel -= 5;
        }
        showCurrentVolume();
    }

    public void switchToSilentMode() {
        silentMode = !silentMode;
        System.out.println("Silent mode " + (silentMode ? "on" : "off"));
    }

    private void showCurrentVolume() {
        System.out.println("Volume level: " + volumeLevel);
    }


    public int getVolumeLevel() {
        return volumeLevel;
    }

    public boolean isSilentMode() {
        return silentMode;
    }


}
