package Hw6;


public class FurnitureTest {
    public static void main(String[] args) {
        Priceable Sofa = new Furniture(15000, "Sofa");
        Priceable Table = new Furniture(80000, "Cocobolo table");
        Priceable Wardrobe = new Furniture(29990, "Wardrobe");
        Sofa.getPrice();
        Table.getPrice();
        Wardrobe.getPrice();
    }
}
