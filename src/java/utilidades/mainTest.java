/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilidades;

import Modelo.IMultas;
import dao.MultadoDAO;
import dto.MultadoDTO;



/**
 *
 * @author -ADMIN-
 */
public class mainTest {
    
    public static void main(String []args){
        
        MultadoDTO m = IMultas.buscarMulta(1);
        
          
        
        //int pg = MultadoDAO.consultarMultasUsuario(1);
        
        System.out.println("-"+m.toString());
        
            
    }
    
}
