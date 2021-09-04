package serverwofacade;

public class Start {
    public static void StartFuc(){
        ScheduleServer scheduleServer = new ScheduleServer();

        scheduleServer.startBooting();
	    scheduleServer.readSystemConfigFile();
	    scheduleServer.init();
	    scheduleServer.initializeContext();
	    scheduleServer.initializeListeners();
	    scheduleServer.createSystemObjects();
    }
}
