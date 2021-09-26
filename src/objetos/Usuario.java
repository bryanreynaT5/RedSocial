package objetos;

public class Usuario {

    /**
     * ID del usuario
     */
    private int usuarioID;

    /**
     * Nombre del usuario
     */
    private String nombre;

    /**
     * Apellido del usuario
     */
    private String apellido;

    /**
     * Correo del usuario
     */
    private String correo;

    /**
     * Contraseña del usuario
     */
    private String contrasena;

    /**
     * Genero del usuario
     */
    private String genero;

    /**
     * Fecha de nacimiento del usuario
     */
    private String fechaNacimiento;

    /**
     *
     * @param nombre Nombre del usuario
     * @param apellido Apellido del usuario
     * @param correo Correo electronico del usuario
     */
    public Usuario(String nombre, String apellido, String correo, String contrasena){
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
    }
}