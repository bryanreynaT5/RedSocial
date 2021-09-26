package CRUD;

import objetos.Usuario;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class CrudUsuarios {

    public String eliminarUsuario(int usuarioID) {



        return "";
    }

    public String crearUsuario(Usuario usuario) {

        String nombre = usuario.getNombre();
        String apellido = usuario.getApellido();
        String correo = usuario.getCorreo();
        String contrasena = usuario.getContrasena();

        try {
            String ruta = "../database/usuarios.txt";
            String contenido = nombre + ":" +
                    apellido + ":" +
                    correo + ":" +
                    contrasena;

            File file = new File(ruta);

            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter BufferedWriter = new BufferedWriter(fileWriter);
            BufferedWriter.write(contenido + "\n");
            BufferedWriter.close();

            return "[EXITOSO] El usuario ha sido creado y guardado correctamente";
        } catch (Exception e) {
            return "[ERROR] El usuario no pudo ser creado o guardado : " + e.getMessage();
        }
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