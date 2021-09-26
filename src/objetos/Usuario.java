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




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(int usuarioID) {
        this.usuarioID = usuarioID;
    }
}