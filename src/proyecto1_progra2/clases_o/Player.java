/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1_progra2.clases_o;

public class Player {
    private static Player instancia = new Player();//var static, singleton acceso global para no crear insatnica cada vex
    private info[] registro;//¿se podra arraylist?

    private Player() {
        registro=new info[10];
    }

    public static Player getInstancia() {
        return instancia;
    }

    public int disponible() {
        return disponible(0);
    }
    private int disponible(int index) {
        if (index>=registro.length) {//arreglo sin espacio
            return -1;
        }
        if (registro[index]==null) {
            return index;
        }
        return disponible(index + 1);//recursiva busacando indice
    }
    public int buscarUsername(String name) {
        int index=0;
        for (info user : registro) {
            if (user!=null && user.getUsername().equals(name)) {
                return index;
            }
            index++;
        }
        return -1;
    }
    public boolean añadir(String name, String password) {
        if (buscarUsername(name)==-1) {//npo existe en array
            int indice=disponible();
            if (indice!=-1 && password.length()>=5) {//disponibilidad
                registro[indice]=new info(name, password);
                return true;
            } else {
                return false;//no se agrega por arreglo lleno o tamaño contra
            }
        } else {
            return false;//existe
        }
    }
    public boolean login(String name, String password) {
        for (info user:registro) {
            if (user!=null && user.getUsername().equals(name) && user.getPassword().equals(password)) {
                return true; 
            }
        }
        return false; 
    }
    public boolean eliminar(String name, String password) {
        if (login(name, password)) {
            for (int i = 0; i < registro.length; i++) {
                info user=registro[i];
                if (user!=null && user.getUsername().equals(name)) {
                    registro[i] = null;//recordar el ranking leer eso
                    return true;
                }
            }
        }
        return false;
    }
    public boolean cambiarContraseña(String name, String password, String nuevaContra) {
        int index = buscarUsername(name);
        if (index!=-1) {
            info user=registro[index];
            if (user.getPassword().equals(password) && password.length()>=5) {
                user.setPassword(nuevaContra); 
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}

