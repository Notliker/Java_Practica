package Hw4;


public class FurnitureShopTest {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop(2);
        shop.add(new Wardrobe(
                "Wardrobe", 0, 2.05, 1, 1, 14540, "Металл+Дерево", 3, 10));
        shop.add(new Table(
                "Table", 4, 1.3, 1, 1, 5999, "Дуб", 2));
        System.out.println(shop.getPrices());
        System.out.println("Check: "+ shop.buy(3));
        System.out.println(shop.getPrices());
    }
}
