package Q5;

import java.util.Date;

public class Order {
    private Date moment;
    private OrderStatus status;
    private OrderItem[] item;
    private Client client;

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void initOrdemItem(int quant){
        this.item = new OrderItem[quant];
    }

    public void addItem(OrderItem item, int i) {
        this.item[i] = item;
    }

    public void removeItem(OrderItem item){
        for (int i = 0; i < this.item.length; i++) {
            if(this.item[i] == item){
                this.item[i] = null;
                i=this.item.length;
            }
        }

    }

    private Double totalPrice(){
        Double total = 0.0;
        for (OrderItem i : this.item) {
            total = total+i.subTotal();
        }
        return total;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString(){
        String o = "Order moment: "+moment+
        "\nOrder Status: "+status+"\nClient: "+client+"\nOrder items:\n";
        for (OrderItem i : item) {
            o = o+i+"\n";
        }
        o = o+"Total price: "+this.totalPrice();
        return o;
    }

}
