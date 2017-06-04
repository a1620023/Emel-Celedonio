package cnx;

/**
 *
 * @author Bl4kz0
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.BDatos;
public class Services {
    
   private final String tabla = "usuarios";
   
   
   public void guardar(Connection conexion, BDatos datos) throws SQLException{
       PreparedStatement consulta;
      try{  
            consulta = conexion.prepareStatement("INSERT INTO usuarios (dni, nombre, edad, nivel, distrito, password,celular) VALUES(?, ?, ?, ?, ?, ?, ?)");
            consulta.setString(1, datos.getDni());
            consulta.setString(2, datos.getNombre());
            consulta.setInt(3, datos.getEdad());
            consulta.setInt(4, datos.getNivel());
            consulta.setString(5, datos.getDistrito());
            consulta.setString(6, datos.getPassword());
            consulta.setString(7, datos.getCelular());
         
         consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }
   
   
   public BDatos recuperarPorDni(Connection conexion, String dni) throws SQLException {
      BDatos usuario = null;
      try{
         PreparedStatement consulta = conexion.prepareStatement("SELECT nombre, edad, password, distrito FROM usuarios WHERE dni = ?" );
         consulta.setString(1, dni);
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
            usuario = new BDatos();
            usuario.setDni(dni);
            usuario.setNombre(resultado.getString("nombre"));
            usuario.setEdad(resultado.getInt("edad"));
            usuario.setDistrito(resultado.getString("distrito"));
            usuario.setPassword(resultado.getString("password"));
            //System.out.println(usuario.getDni());
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return usuario;
   }
}
