package list_7.facade.Exercise2;

class TravelFacade {
    private FlightBooking flight = new FlightBooking();
    private HotelBooking hotel = new HotelBooking();
    private TransportService transport = new TransportService();
    private Insurance insurance = new Insurance();

    public void planTrip() {
        flight.bookFlight();
        hotel.bookHotel();
        transport.scheduleTransport();
        insurance.buyInsurance();
    }
}