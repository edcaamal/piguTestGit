package models;

import java.util.HashMap;

public class Usuario {
    public static HashMap<String, String[]> usuarios = new HashMap<String, String[]>();

    public static void cargarUsuarios(){
        usuarios.put("HarryP", new String[]{"HarryP123","Harry Potter","harry.jpg", "unnamed-0.png"});
        usuarios.put("HermioneG", new String[]{"HermioneG123", "Hermione Granger","hermione.jpeg", "unnamed-1.jpg"});
        usuarios.put("RonW", new String[]{"RonW123","Ron Weasley", "ron.jpg",  "unnamed-2.jpg"});
        usuarios.put("DracoM", new String[]{"DracoM123","Draco Malfoy", "draco.jpg", "unnamed-2.png"});
        usuarios.put("MinervaM", new String[]{"MinervaM123","Minerva McGonagall", "mcgonagall.jpg",  "unnamed-3.jpg" });
        usuarios.put("CedricD", new String[]{"CedricD123", "Cedric Diggory", "cedric.png", "unnamed-4.jpg" });
        
        usuarios.put("SondraG", new String[]{"SondraL123", "Sandra Lizette", "cho.jpg" , "unnamed-15.jpg"});

        usuarios.put("SeverusS", new String[]{"SeverusS123", "Severus Snape", "snape.jpg", "unnamed-6.jpg"});
        usuarios.put("RubeusH", new String[]{"RubeusH123", "Rubeus Hagrid", "hagrid.png", "unnamed-7.jpg"});
        usuarios.put("NevilleL", new String[]{"NevilleL123", "Neville Longbottom","neville.jpg" , "unnamed-8.jpg"});
        usuarios.put("LunaL", new String[]{"LunaL123", "Luna Lovegood", "luna.jpg", "unnamed-9.jpg"});
        usuarios.put("GinnyW", new String[]{"GinnyW123", "Ginny Weasley", "ginny.jpg", "unnamed-10.jpg"});
        usuarios.put("RemusL", new String[]{"RemusL123", "Remus Lupin", "lupin.jpg" , "unnamed-11.jpg"});
        usuarios.put("ArthurW", new String[]{"Arthur123", "Arthur Weasley", "arthur.jpg", "unnamed-12.jpg" });
        usuarios.put("BellatrixL", new String[]{"BellatrixL123", "Bellatrix Lestrange", "arthur.jpg", "unnamed-12.jpg"});
        usuarios.put("LordV", new String[]{"LordV123","Lord Voldemort" ,"voldemort.jpg", "unnamed-14.jpg"});

    }

    public static String[] getUsuario(String idUsuario){
        return usuarios.get(idUsuario);
    } 

    public static String getImage(String idUsuario, int idimage){
        String[] usuario = usuarios.get(idUsuario);
        String imgUser="";
        String codeHtml = "";
        if (usuario != null){
           if (idimage==1){
               imgUser = usuario[2];
               codeHtml = "<html><img src='https://ik.imagekit.io/hpapi/"+imgUser+
                          "' width='125' height='125'></html>";
           }else
               if (idimage ==2){
                  imgUser = usuario[3];
                  codeHtml = "<html><img src='https://raw.githubusercontent.com/edcaamal/UacLp1A/master/images/"+
                             imgUser+"' width='100' height='100'></html>";                   
               }
        }
        return codeHtml;
    } 
    
    
    public static boolean validaUsuario(String idUsaurio, String idPassword){
        String[] usuario = Usuario.getUsuario(idUsaurio);
        if (usuario != null){
            String pass = usuario[0];
            return (idPassword.equals(pass));
        } else return false;
    }
}
