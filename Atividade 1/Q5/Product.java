package Q5;

public class Product {
    private String name;
    private Double price;

    public Product(String productName, double productPrice) {
        this.name = productName;
        this.price = productPrice;
    }

    @Override
    public String toString(){
        return this.name+", $"+this.price;
    }

}
