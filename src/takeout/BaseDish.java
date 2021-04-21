package takeout;

public abstract class BaseDish {
    protected String name;
    protected int price;

    public BaseDish(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
