import java.rmi.*;

public interface Interfaces extends Remote{
	
	public Contacto getContacto(String email) throws RemoteException;
	public boolean nuevoContacto(String nombre, String apellido, String email, String numeroTelefonico) throws RemoteException;
	public boolean buscarLista(String email) throws RemoteException; 
//	public boolean buscarLista2(String email) throws RemoteException; 
}
