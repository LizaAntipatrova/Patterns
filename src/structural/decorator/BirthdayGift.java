package structural.decorator;

public class BirthdayGift extends Gift {
    private String content;

    public BirthdayGift(String content) {
        this.content = content;
    }

    @Override
    Gift packGift() {
        return this;
    }

    @Override
    Gift unpackGift() {
        return this;
    }
}
