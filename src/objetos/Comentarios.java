
package objetos;


public class Comentarios {
    
    /**
     * Lleva el control de la cantidad de comentarios escritos
     */
    private int numComentarios;
    
    private String reacciones, nombreUsuario;
    
    /**
     * 
     * @param numComentarios Total de comentarios escritos
     * @param reacciones Reacciones de los usuarios ante los comentarios
     * @param nombreUsuario Nombre de quien escribió el comentario
     */
    public Comentarios(int numComentarios, String reacciones, String nombreUsuario) {
        this.numComentarios = numComentarios;
        this.reacciones = reacciones;
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * 
     * @return contabiliza los comentarios 
     */
      public int getNumComentarios() 
    {
        return numComentarios;
    }
     /**
     * 
     * @return obtiene las reacciones de los comentarios
     */
    public String getReacciones() 
    {
        return reacciones;
    }

    /**
     * 
     * @return obtiene el nombre de quien escribio el comentario 
     */
      public String getNombreUsuario() 
    {
        return nombreUsuario;
    }

    /**
     *  
     * @param numComentarios establece el total de comentarios 
     */
    public void setNumComentarios(int numComentarios) 
    {
        this.numComentarios = numComentarios;
    }
    
    /**
     * 
     * @param reacciones establece el total de las reacciones del comentario
     */
    public void setReacciones(String reacciones) 
    {
        this.reacciones = reacciones;
    }

    /**
     * 
     * @param nombreUsuario retorna el usuario que escribió el comentar
     */
    public void setNombreUsuario(String nombreUsuario) 
    {
        this.nombreUsuario = nombreUsuario;
    }
      
      
  
    
    
    
       
    
    
    
    
}
