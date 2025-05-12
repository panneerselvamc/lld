package day3.examples;

enum LoggerLevel {
    INFO,
    DEBUG,
    ERROR
}

interface ILogger {
    void log();
}

class ErrorLogger implements ILogger {

    @Override
    public void log() {
        System.out.println("ERROR LOGGER");
    }
}

class DebugLogger implements ILogger {

    @Override
    public void log() {
        System.out.println("DEBUG LOGGER");
    }
}

class InfoLogger implements ILogger {

    @Override
    public void log() {
        System.out.println("INFO LOGGER");
    }
}

class LoggerFactory {
    public static ILogger createLogger(LoggerLevel loggerLevel) {
        if (loggerLevel == LoggerLevel.INFO) {
            return new InfoLogger();
        }
        if (loggerLevel == LoggerLevel.DEBUG) {
            return new DebugLogger();
        }
        if (loggerLevel == LoggerLevel.ERROR) {
            return new ErrorLogger();
        }
        return null;
    }
}

public class SimpleFactory1 {
    public static void main(String[] args) {
        ILogger errorLogger = LoggerFactory.createLogger(LoggerLevel.ERROR);
        ILogger debugLogger = LoggerFactory.createLogger(LoggerLevel.DEBUG);
        ILogger infoLogger = LoggerFactory.createLogger(LoggerLevel.INFO);
        errorLogger.log();
        debugLogger.log();
        infoLogger.log();
    }
}
