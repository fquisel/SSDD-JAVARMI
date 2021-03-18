import java.rmi.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IngresoContactosRemota {

	public static void Main (String[] args) {
	
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			Interfaces ref = (Interfaces)Naming.lookup("rmi://localhost:1099/RMIServidor");
			
            System.out.print("Ingrese un email a ingresar: ");
            String correo = teclado.readLine();
            System.out.print("\n Especifique Nombres: ");
            String nombre = teclado.readLine();
            System.out.print(" Especifique Apellidos: ");
            String apellido = teclado.readLine();
            System.out.print(" Especifique número telefónico: ");
            String telefono = teclado.readLine();
            ref.nuevoContacto(nombre, apellido, correo, telefono);
            System.out.println("");
            
			
		} catch (RemoteException e) {
			System.err.println(" Error de E/S ");
		
		} catch(Exception e) {
			System.out.println(e);
		}

	}
}
