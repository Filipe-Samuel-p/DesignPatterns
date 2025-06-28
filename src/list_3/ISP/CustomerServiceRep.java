package list_3.ISP;

class CustomerServiceRep implements CustomerService {
    @Override
    public void attendCustomer() {
        System.out.println("Helping customer with their inquiry...");
    }

    @Override
    public void handleComplaint() {
        System.out.println("Resolving customer complaint...");
    }
}