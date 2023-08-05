/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1_progra2.clases_o;

/**
 *
 * @author pcast
 */
public class info {
    private String username;
    private String password;

    public info(String username, String password) {//int puntos iniciales
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String newPassword) {
        password = newPassword;
    }
    
}
