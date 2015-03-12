/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilidades;

import Modelo.IMultas;
import dao.LibroDAO;
import dao.MultadoDAO;
import dao.PrestamoDAO;
import dto.MultadoDTO;
import dto.PrestamoDTO;



/**
 *
 * @author -ADMIN-
 */
public class mainTest {
    
    public static void main(String []args){
        
        PrestamoDTO p = PrestamoDAO.consultarPrestamoByUser(2);
        
        System.out.println("-"+p.toString());
        
            
    }
    
}
