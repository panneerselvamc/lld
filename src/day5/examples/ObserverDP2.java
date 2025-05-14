package day5.examples;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(Order order);
}

class Customer implements Observer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(Order order) {
        System.out.println("Hi-" + name + ", You received an status update for the order -" + order.getStatus());
    }
}

class DeliveryPartner implements Observer {
    private String name;

    public DeliveryPartner(String name) {
        this.name = name;
    }

    @Override
    public void update(Order order) {
        System.out.println("Hi Partner-" + name + ", You received an status update for the order -" + order.getStatus());
    }
}

class Order {
    private String name;
    private String status;

    private List<Observer> observers = new ArrayList<>();

    public Order(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

    public void detachObserver(Observer observer) {
        observers.remove(observer);
    }

    public void updateStatus(String status) {
        this.status = status;
        updateNotifiers();
    }

    private void updateNotifiers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}

public class ObserverDP2 {
    public static void main(String[] args) {
        Order order = new Order("PEN", "ORDERED");
        Customer customer = new Customer("PANNEER");
        DeliveryPartner deliveryPartner = new DeliveryPartner("DELHIVERY");

        order.attachObserver(customer);
        order.attachObserver(deliveryPartner);
        order.updateStatus("DISPATCHED");
        order.detachObserver(customer);
        order.updateStatus("DELIVERED");
    }
}
