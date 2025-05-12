interface Printable {
    void print();
    public static void show(){
        System.out.println("FROM PRINTABLE");
    }
}

interface Showable extends Printable {


    public static void show(){
        System.out.println("FROM SHOWABLE");
    }
}

class Main implements Printable, Showable {
    public void print() {
        System.out.println("Print");
    }

    public void show() {
        Showable.show();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.show();
    }
}