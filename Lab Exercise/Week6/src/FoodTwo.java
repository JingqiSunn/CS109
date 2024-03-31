public class FoodTwo {
    private int id;
    private String name;
    private String type;
    private int size;
    private double price;

    public FoodTwo(int id, String name, String type, int size, double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public void getMenu() {
        System.out.printf("%s %s: (%d Inches) %.2f $\n", type, name, size, price * (double) 10);
    }
    public void SetId(int id) {
        this.id = id;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public void SetType(String type) {
        this.type = type;
    }

    public void SetSize(int size) {
        this.size = size;
    }

    public void SetPrice(double price) {
        this.price = price;
    }

    public int GetId() {
        return id;
    }

    public String GetName() {
        return name;
    }

    public String GetType() {
        return type;
    }

    public int GetSize() {
        return size;
    }

    public double GetPrice() {
        return price;
    }
}
