package list_3.OCP;

class PremiumCustomerDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double value) {
        return value * 0.85; // 15% discount
    }
}
