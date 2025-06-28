package list_3.OCP;

class RegularCustomerDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double value) {
        return value * 0.95; // 5% discount
    }
}
