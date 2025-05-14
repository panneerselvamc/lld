package day5.examples;

class Data {

    // volatile ensures changes made by one thread are visible to others
    private static volatile Data instance = null;


    private Data() {

    }

    public static Data getInstance() {
        if (instance == null) {
            synchronized (Data.class) {
                if (instance == null) {
                    instance = new Data();
                }
            }
        }
        return instance;
    }

}

public class DoubleCheckedLockSingleton1 {
    public static void main(String[] args) {
        Data instance = Data.getInstance();
    }
}
