public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight;
    private String title;

    public Basket(String title) {
        this.title=title;
        items = "Список товаров:" + title ;
        this.limit = 1000000;
        this.totalWeight = 0;
    }



    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
        increaseCount(1);
    }

    public void add(String name, int price, int count) {
        boolean error = false;
        increaseCount(count);
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price + " руб";
        totalPrice = totalPrice + count * price;

    }
    public void add(String name, int price, int count, double weight) {
        add(name, price,count);
        totalWeight = totalWeight + count * weight;
       items = items + " весом "+ weight + "граммов";
    }
    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print() {
        System.out.println(this.title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
