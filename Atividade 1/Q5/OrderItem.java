package Q5;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem(int quantity, double productPrice, Product product) {
        this.quantity = quantity;
        this.price = productPrice;
        this.product = product;
    }

    public Double subTotal(){
        return this.quantity*this.price;
    }

    @Override
    public String toString(){
        return this.product.toString()+", Quantity: "+this.quantity+", Subtotal: $"+this.subTotal();
    }

}
