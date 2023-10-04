package structural.decorator;

public class TestGift {
    public static void main(String[] args) {
        Gift gift = new BirthdayGift("Cat");
        gift = new PaperGiftDecorator(gift);
        gift = new RibbonGiftDecorator(gift);
        gift.packGift();
        gift.unpackGift();
    }
}
