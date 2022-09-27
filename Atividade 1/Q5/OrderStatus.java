package Q5;

public enum OrderStatus {
    PENDING_PAYMENT(0), PROCESSING(1), SHIPPED(2), DELIVERED(3);

    private int os;

    OrderStatus(int os) {
        this.os = os;
    }

    public static OrderStatus getStatus(int next) {
        switch(next){
            case 0:
            return PENDING_PAYMENT;
            case 1:
            return PROCESSING;
            case 2:
            return SHIPPED;
            case 3:
            return DELIVERED;
        }
        return null;
    }

    
    
}
