package models;

public class Conexion {
    private static String HOST = "LocalHost";
    private static String USERDB = "myDB";
    private static String PASSWORDDB = "123ABCD";
       
    @Override
    public String toString() {
        return "Conexion{" + "HOST=" + HOST + ", USERDB=" + USERDB + ", PASSWORDDB=" + PASSWORDDB + '}';
    }

    public static void Conexion() {
    }
    
    public static boolean conectarDB(){
        System.out.println("Conectando a la DB ...");
        System.out.println("Conexion{" + "HOST=" + HOST + ", USERDB=" + USERDB + ", PASSWORDDB=" + PASSWORDDB + '}');
        return true;
    }

    public static boolean desconectarDB(){
        System.out.println("Desconectando a la DB ...");
        return true;
    }
}
