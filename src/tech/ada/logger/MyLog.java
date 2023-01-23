package tech.ada.logger;

public interface MyLog {

    void logInfo(String msg);
    void logWarn(String msg);
    void logError(String msg);
    void logDebug(String msg);

}
