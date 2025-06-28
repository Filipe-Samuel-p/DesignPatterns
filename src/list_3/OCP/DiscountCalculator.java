package list_3.OCP;

class DiscountCalculator {
    public double calculate(DiscountStrategy strategy, double value) {
        return strategy.applyDiscount(value);
    }
}