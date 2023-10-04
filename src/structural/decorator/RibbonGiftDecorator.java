package structural.decorator;

public class RibbonGiftDecorator extends GiftDecorator {
    public RibbonGiftDecorator(Gift wrapper) {
        super(wrapper);
    }

    @Override
    Gift packGift() {
        Gift gift = super.packGift();
        System.out.println("tie a gift with a ribbon");
        return gift;


    }

    @Override
    Gift unpackGift() {
        System.out.println("untie the ribbon on the gift");
        return super.unpackGift();
    }
}
