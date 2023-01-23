package tech.ada.logger;

@Service
public class MyLogImpl implements MyLog {
    @Override
    public void logInfo(String msg) {
        log4j.INFO(msg);
    }

    @Override
    public void logWarn(String msg) {

    }

    @Override
    public void logError(String msg) {

    }

    @Override
    public void logDebug(String msg) {

    }
}
