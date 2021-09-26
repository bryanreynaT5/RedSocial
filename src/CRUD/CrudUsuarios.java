package CRUD;

import objetos.Usuario;

import java.util.ArrayList;

public class CrudUsuarios {

    public String eliminarUsuario(int usuarioID) {



        return "";
    }

    public String crearUsuario(String nombre, String apellido, String correo, String contrasena) {


        return "";
    }

    public Usuario obtenerUsuario(int usuarioID) {

        Usuario usuario = new Usuario("Juan", "Perez", "juan_perez@gmail.com", "juanitoperezz");

        return usuario;
    }

    public ArrayList<Usuario> obtenerUsuarios() {

        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        usuarios.add(new Usuario("Juan", "Perez", "juan_perez@gmail.com", "juanitoperezz"));
        usuarios.add(new Usuario("Blanca", "Herrera", "blanquita_herr@gmail.com", "blaherrca"));

        return usuarios;
    }

    public String actualizarNombreUsuario(int usuarioID, String nuevoNombre){


        return "";
    }

    public String actualizarApellidoUsuario(int usuarioID, String nuevoApellido){


        return "";
    }

    public String actualizarCorreoUsuario(int usuarioID, String nuevoCorreo){


        return "";
    }

    public String actualizarContrasenaUsuario(int usuarioID, String nuevaContrasena){


        return "";
    }

    public String actualizarGeneroUsuario(int usuarioID, String nuevoGenero){


        return "";
    }

    public String actualizarFechaNacimientoUsuario(int usuarioID, String nuevaFechaNacimiento){


        return "";
    }

}