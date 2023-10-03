package creational.abstractfactory.petproduct;

public class testAbstractFactory {
    public static void main(String[] args) {
        Purchase purchase = new Purchase();
        purchase.makePurchase(PetSpecies.FROG, ProductTypes.CLOTHING).chooseProduct();
    }

}
