package structural.decorator;

public class GiftDecorator extends Gift {
    Gift wrapper;

    public GiftDecorator(Gift wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    Gift packGift() {
        return wrapper.packGift();
    }

    @Override
    Gift unpackGift() {
        return wrapper.unpackGift();
    }
}
