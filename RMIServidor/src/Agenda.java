import java.rmi.*;

public class Agenda extends java.rmi.server.UnicastRemoteObject implements Interfaces{

    Contacto lista;

    public Agenda() throws RemoteException {
        this.lista = null;
    }

    public boolean estaVacio() {
        return this.lista == null;
    }

    public Contacto getContacto(String email) {
        Contacto temp = lista;
        for (temp = lista; temp != null; temp = temp.siguiente) {
            if (email.equals(temp.getEmail())) {
            	System.out.println("Correo encontrado! ");
                //System.out.println("Informacion del contacto de correo <" + temp.getEmail() + ">:");
                System.out.println(" Nombres: " + temp.getNombre());
                System.out.println(" Apellidos: " + temp.getApellido());
                System.out.println(" Numero Telefónico: " + temp.getNumeroTelefonico());
            }
        }
        return temp;
    }

    public boolean nuevoContacto(String nombre, String apellido, String email, String numeroTelefonico) {
        Contacto nuevo = new Contacto(nombre, apellido, email, numeroTelefonico);
        Contacto temp = null;

        if (estaVacio()) {
            this.lista = nuevo;
        } else {
            temp = lista;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
        return true;
    }
    
    public boolean buscarLista(String email) { 
        Contacto temp;
        for (temp = lista; temp != null; temp = temp.getSiguiente()) {
            if (email.equals(temp.getEmail())) {
                return true;
            }
        }
        return false;
    }

}