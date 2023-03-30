package aplicacionswing;

import models.Conexion;
import models.Usuario;
import views.Login;
import views.Principal;

public class AplicacionSwing {
    public static Login login = new Login();
    public static Principal principal = new Principal();

    public static void main(String[] args) {
        Conexion.Conexion();
        Usuario.cargarUsuarios();
        
        if (Conexion.conectarDB()){
            login.setVisible(true);
            login.setLocationRelativeTo(null);

            principal.setVisible(false);
            principal.setLocationRelativeTo(null);
        } else {
            System.out.println("Conexion a la BD No establecida");
        }
    }
    
}
