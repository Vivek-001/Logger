
import chainResponsibility.*;

public class Main {
    public static void main(String[] args) {

        //LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        LogProcessor logObject = new LogProcessor();
        // for this we will need to make an contstructor inside the LogProcessor
        logObject.log(LogProcessor.ERROR, "Error Handling.....");
        logObject.log(LogProcessor.DEBUG, "Need to Debug it ..... ");
        logObject.log(LogProcessor.INFO, "Just for Info...");
    }
}