public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket("Для Любы");
        basket.add("Meat", 240);
        basket.add("Milk", 40,9);
        basket.add("Bread", 50,2,600);
        basket.print();
        int totalPrice = basket.getTotalPrice();
        double totalWeight = basket.getTotalWeight();
        int count = basket.getCount();

        System.out.println("полный вес  = "+ totalWeight + "---полная стоимость = " + totalPrice
        + " всего единиц - " + count);


        Basket basket2 = new Basket("Для Оли");
        basket2.add("Meat", 340);
        basket2.add("Milk", 45,3);
        basket2.add("Bread", 50,4,600);
        basket2.print();
         totalPrice = basket2.getTotalPrice();
         totalWeight = basket2.getTotalWeight();
         count = basket2.getCount();

        System.out.println("поный вес  = "+ totalWeight + "полная стоимость = " + totalPrice
                + " всего единиц - " + count);
    }
}