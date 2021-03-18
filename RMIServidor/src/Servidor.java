import java.rmi.*;
import java.rmi.server.*; 
 
public class Servidor extends UnicastRemoteObject implements Interfaces{
	
	//private static final long serialVersionUID = 1L;

	public Servidor() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main (String[] argv) {
		   try {
			   Interfaces s = new Agenda();			   		   
			   Naming.rebind("RMIServidor", s);

			   System.out.println("El Servidor está OK");
			   }catch (Exception e) {
				   System.out.println("Error: " + e);
				}
		   }



	
}