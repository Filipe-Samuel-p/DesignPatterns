package list_7.facade.Exercise1;

class PurchaseFacade {
    private Inventory inventory = new Inventory();
    private Shipping shipping = new Shipping();
    private Order order = new Order();
    private EmailService email = new EmailService();

    public void finalizePurchase() {
        inventory.checkStock();
        shipping.calculateShipping();
        order.registerOrder();
        email.sendConfirmation();
    }
}
