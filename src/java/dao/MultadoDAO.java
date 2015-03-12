/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import Modelo.Conectar;
import dto.MultadoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author -ADMIN-
 */
public class MultadoDAO {
     
    private static Connection con = Conectar.getInstance();
    private static PreparedStatement pstm;
    private static ResultSet rs = null;
    
    /*
    public static void calcularValorMulta(){
        
    }
    */
    public static boolean pagoMulta(int idMulta){
        
         String response = null;
         boolean salida = false;
         
        String sql = "UPDATE multas SET FechaPago= now(), estado= 2 WHERE idMulta = ? ";    
        
        try {
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, idMulta);
            int res = pstm.executeUpdate();
            if(res > 0)
                salida = true;
            
            
        } catch (SQLException ex) {
            throw new RuntimeException(" error: "+ex.getMessage());
        }
        
        return salida;
    }
    
    public static String agregarNuevaMulta(MultadoDTO multa ){
        
        String response = null;
        String sql = "INSERT INTO multas (idMulta, prestamoid, FechaMulta, valorTotal, FechaPago, estado) \n" +
            "VALUES ( ?, ?, now(), ?, 0, 1)";
        
        try {
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, multa.getIdMulta());
            pstm.setInt(2, multa.getIdPrestamo());
            pstm.setDouble(3, multa.getValorTotal());
            int x = pstm.executeUpdate();
            if(x > 0){
                response = "Registro exitoso";
            }else{
                response = "No se pudo insertar la multa";
            }
            
        } catch (SQLException ex) {
            response = "Error: "+ex.getMessage();
        }
        
        return response;
    }   
    
    public static int  consultarMultasUsuario(int idUsuario){
        
        int salida = 0;
        
        String sql = "select m.idMulta from multas m\n" +
                      "inner join prestamos on m.prestamoid = prestamos.idprestamo\n" +
                      "join usuarios on prestamos.userId = usuarios.iduser where usuarios.iduser = ? and m.estado = 1";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, idUsuario);
            rs = pstm.executeQuery();
            if(rs != null){
                while(rs.next()){
                    salida = rs.getInt("idMulta");
                }
            }
            
        } catch (SQLException ex) {
            throw new RuntimeException(" error: "+ex.getMessage());
        }
        
        
        
        return salida;
    }
    
    public static MultadoDTO consultarMulta(int idMulta){
            
        MultadoDTO multa = null;
        String sql = "select  m.prestamoid, m.FechaMulta, m.valorTotal from multas m where m.idMulta = ?";
        
        try {
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, idMulta);
            rs = pstm.executeQuery();
            if(rs != null){
                while(rs.next()){
                    multa = new MultadoDTO(rs.getInt("prestamoid"), rs.getString("FechaMulta"), rs.getDouble("valorTotal"));
                }
            }
            
        } catch (SQLException ex) {
            multa = null;
        }
        
        
        return multa;
    }
    
    
}
