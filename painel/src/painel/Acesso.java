/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package painel;

/**
 *
 * @author CAMARGO
 */
public class Acesso {
    
    private String usuario;
    private String senha;

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
    
    protected boolean validarSenha(){
        boolean ok = false;
        if(senha.equals("teste")){
            ok = true;
        }
        return ok;
    }
}
