import java.rmi.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import

public class ObtenerContactosRemota {

	public static void Main (String[] args) {
	
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		Interfaces ref;
		try {
			
			ref = (Interfaces)Naming.lookup("rmi://localhost:1099/RMIServidor");
			
			System.out.print("Ingrese un email de contacto a consultar: ");
            String correo = teclado.readLine();
            if (ref.buscarLista(correo)!= false) {
            	ref.getContacto(correo);
            	System.out.println("");         
            }
            else {
            	System.out.println("No posee ningun contacto cuyo email sea <"+ correo +">");	
            }
			
		} catch (RemoteException e) {
			System.err.println(" Error de E/S ");
		
		} catch(Exception e) {
			System.out.println(e);
		}

	}
}