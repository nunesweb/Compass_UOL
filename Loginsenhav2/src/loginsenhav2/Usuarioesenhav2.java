/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginsenhav2;

/**
 *
 * @author Sergio Ferr
 */
public class Usuarioesenhav2 {
    private String usuario;
    private String senha;
     
    /*modelo de construtor 1 SEM parametro*/
    public Usuarioesenhav2() {
        
    }
    /*modelo de construtor 2 com parametro definido*/
    public Usuarioesenhav2(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    
}
