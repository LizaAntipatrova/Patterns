package structural.decorator;

public class PaperGiftDecorator extends GiftDecorator {
    public PaperGiftDecorator(Gift wrapper) {
        super(wrapper);
    }

    @Override
    Gift packGift() {
        Gift gift = super.packGift();
        System.out.println("pack in gift paper");
        return gift;
    }

    @Override
    Gift unpackGift() {
        System.out.println("rip off the gift paper");
        return super.unpackGift();
    }
}
