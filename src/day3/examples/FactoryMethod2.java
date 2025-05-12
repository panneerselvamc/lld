package day3.examples;


interface IFactory {
    InLogger createLogger();
}

interface InLogger {
    void log();
}

class ErrorFactory implements IFactory {
    @Override
    public InLogger createLogger() {
        return new ErrorLogger2();
    }
}

class InfoFactory implements IFactory {
    @Override
    public InLogger createLogger() {
        return new InfoLogger2();
    }
}

class ErrorLogger2 implements InLogger {

    @Override
    public void log() {
        System.out.println("ERROR LOGGER");
    }
}

class InfoLogger2 implements InLogger {

    @Override
    public void log() {
        System.out.println("INFO LOGGER");
    }
}

public class FactoryMethod2 {
    public static void main(String[] args) {
        IFactory errorFactory = new ErrorFactory();
        InLogger errorLogger = errorFactory.createLogger();

        IFactory infoFactory = new InfoFactory();
        InLogger infoLogger = infoFactory.createLogger();

        errorLogger.log();
        infoLogger.log();
    }
}
