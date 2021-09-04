package serverwofacade;

public class Shutdown {
    public static void ShutdownFuc(){
        ScheduleServer scheduleServer = new ScheduleServer();

        scheduleServer.releaseProcesses();
		scheduleServer.destory();
		scheduleServer.destroySystemObjects();
		scheduleServer.destoryListeners();
		scheduleServer.destoryContext();
		scheduleServer.shutdown();
    }
}
