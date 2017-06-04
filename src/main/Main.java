package main;

import cnx.Conexion;
import cnx.Services;
import frm.FrmLogin;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.BDatos;

/**
 *
 * @author Bl4kz0
 */
public class Main {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        Connection cnx = Conexion.obtener();
        
  /* INSERTAR USUARIO
        BDatos user;    
        Services srv;
        user =new BDatos("1111","meme",22,2,"lima","12345","232");
        Services save = new Services();
        save.guardar(cnx, user); */
   
/*  SELECT USUARIO
    Services srv= new Services();
    String dni = "48448752";
    BDatos user = new BDatos();
    user=srv.recuperarPorDni(cnx, dni);
    System.out.println(user.getDni()+" "+user.getNombre()+" "+user.getDistrito()); */
  
        FrmLogin lg = new FrmLogin();
        lg.setLocation(400, 200);
        lg.setVisible(true);     
        
    }
    
}
