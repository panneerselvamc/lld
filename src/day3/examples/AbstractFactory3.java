package day3.examples;

enum LogFactoryEnum {
    ERROR,
    INFO
}

interface InFactory {
    InfLogger createLogger();
}

interface InfLogger {
    void log();
}

class ErrorFactoryIm implements InFactory {

    @Override
    public InfLogger createLogger() {
        return new ErrorLoggerIm();
    }
}


class InfoFactoryIm implements InFactory {

    @Override
    public InfLogger createLogger() {
        return new InfoLoggerIm();
    }
}

class ErrorLoggerIm implements InfLogger {

    @Override
    public void log() {
        System.out.println("ERROR LOGGER");
    }
}

class InfoLoggerIm implements InfLogger {

    @Override
    public void log() {
        System.out.println("INFO LOGGER");
    }
}

class LoggerFactoryIm {
    public static InFactory createLoggerFactory(LogFactoryEnum logFactoryEnum) {
        if (logFactoryEnum == LogFactoryEnum.INFO) {
            return new InfoFactoryIm();
        }
        if (logFactoryEnum == LogFactoryEnum.ERROR) {
            return new ErrorFactoryIm();
        }
        return null;
    }
}

public class AbstractFactory3 {
    public static void main(String[] args) {
        InFactory errorLoggerFactory = LoggerFactoryIm.createLoggerFactory(LogFactoryEnum.ERROR);
        InfLogger errorLogger = errorLoggerFactory.createLogger();
        errorLogger.log();

        InFactory infoLoggerFactory = LoggerFactoryIm.createLoggerFactory(LogFactoryEnum.INFO);
        InfLogger infoLogger = infoLoggerFactory.createLogger();
        infoLogger.log();
    }
}
