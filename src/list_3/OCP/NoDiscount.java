package list_3.OCP;

class NoDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double value) {
        return value;
    }
}
