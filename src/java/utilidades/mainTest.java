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
        
        int rs = PrestamoDAO.consultarPrestamosByUser(1);
        
            System.out.println("-"+rs);
    }
    
}
