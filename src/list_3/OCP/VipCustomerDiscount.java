package list_3.OCP;

class VipCustomerDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double value) {
        return value * 0.90; // 10% discount
    }
}