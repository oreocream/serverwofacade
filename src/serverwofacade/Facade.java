package serverwofacade;

public class Facade {
    public void Strat(){
        Start app = new Start();
        app.StartFuc();
    }
    public void Shutdown(){
        Shutdown app = new Shutdown();
        app.ShutdownFuc();
    }
}
