package day4.examples;

class Hotel {

    private static Hotel hotel;

    private Hotel() {

    }

    public static Hotel getInstance() {
        if (hotel == null) {
            hotel = new Hotel();
        }
        return hotel;
    }

    public void print() {
        System.out.println("HOTEL");
    }
}

public class SingletonPattern3 {
    public static void main(String[] args) {
        Hotel hotel = Hotel.getInstance();
        hotel.print();
    }
}
