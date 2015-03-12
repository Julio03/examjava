/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dto;

/**
 *
 * @author -ADMIN-
 */
public class PrestamoDTO {
    
    private int idPrestamo;
    private int usuarioId;
    private int libroId ;
    private int estado ;

    public PrestamoDTO(int usuarioId, int libroId) {
        this.usuarioId = usuarioId;
        this.libroId = libroId;
    }

    public PrestamoDTO() {
    }
    
    public PrestamoDTO(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public PrestamoDTO(int idPrestamo, int usuarioId, int libroId, int estado) {
        this.idPrestamo = idPrestamo;
        this.usuarioId = usuarioId;
        this.libroId = libroId;
        this.estado = estado;
    }
    
    
    //UsuarioDTO user = null;
    //LibroDTO libro = null;

    /**
     * @return the idPrestamo
     */
    public int getIdPrestamo() {
        return idPrestamo;
    }

    /**
     * @param idPrestamo the idPrestamo to set
     */
    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    /**
     * @return the usuarioId
     */
    public int getUsuarioId() {
        return usuarioId;
    }

    /**
     * @param usuarioId the usuarioId to set
     */
    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    /**
     * @return the libroId
     */
    public int getLibroId() {
        return libroId;
    }

    /**
     * @param libroId the libroId to set
     */
    public void setLibroId(int libroId) {
        this.libroId = libroId; 
    }

    /**
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "PrestamoDTO " + "idPrestamo=" + idPrestamo
                + ", usuarioId=" + usuarioId
                + ", libroId=" + libroId
                + ", estado=" + estado;
    }

    
}
