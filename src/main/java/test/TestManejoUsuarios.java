/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import datos.UsuarioDao;
import domain.Usuario;
import java.util.List;

/**
 *
 * @author delga
 */
public class TestManejoUsuarios {
    public static void main(String[] args) {
        UsuarioDao usuarioDao = new UsuarioDao();
        List<Usuario> usuarios = usuarioDao.seleccionar();
        usuarios.forEach(usuario -> System.out.println(usuario.toString()));
    }
}
