/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverwofacade;
public class ServerWOFacade {
    public static void main(String[] args) {
        ScheduleServer scheduleServer = new ScheduleServer();
		
		Start.StartFuc();
		System.out.println("Start working......");
		Shutdown.ShutdownFuc();
		System.out.println("After work done.........");
    }
    
}
