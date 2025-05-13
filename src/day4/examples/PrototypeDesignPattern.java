package day4.examples;

abstract class NetworkDevice{
    protected abstract void display();
    protected abstract void updateName(String name);
    protected abstract NetworkDevice clone();
}
class Router extends NetworkDevice{
    private  String name;
    private String ip;
    private String policy;

    public Router(String name, String ip, String policy){
        this.name=name;
        this.policy=policy;
        this.ip=ip;
    }

    @Override
    protected void display() {
        System.out.println("NAME-"+this.name);
        System.out.println("IP-"+this.ip);
        System.out.println("POLICY-"+this.policy);
    }

    @Override
    protected void updateName(String name) {
        this.name = name;
    }

    @Override
    protected NetworkDevice clone() {
        return new Router(this.name, this.ip, this.policy);
    }
}
public class PrototypeDesignPattern {
    public static void main(String[] args) {
        NetworkDevice networkDevice = new Router("BSNL","12.0.0.1","LOCAL");
        NetworkDevice networkDeviceClone = networkDevice.clone();
        networkDeviceClone.display();
    }
}
