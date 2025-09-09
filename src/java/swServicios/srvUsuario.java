
package swServicios;
import Modelo.csUsuario;
import Modelo.usuarioact;
import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import java.util.ArrayList;


@WebService(serviceName = "srvUsuario")
public class srvUsuario {
    @WebMethod(operationName = "insertarUsuario")
    public int insertarUsuario(@WebParam(name = "Usuario") String Usuario,@WebParam(name = "Contrasena") String Contrasena) 
    {
        csUsuario p = new csUsuario();
        return p.InserUsuario(Usuario, Contrasena);
    }
    @WebMethod(operationName = "actualizarUsuario")
    public int actualizarUsuario(@WebParam(name = "Usuario") String Usuario,@WebParam(name = "Contrasena") String Contrasena
            ,@WebParam(name = "IDUsuario") int IDUsuario
    ) 
    {
        csUsuario p = new csUsuario();
        return p.actualizarUsuario(Usuario, Contrasena,IDUsuario);
    }
    @WebMethod(operationName = "eliminarUsuario")
    public int eliminarUsuario( @WebParam(name = "IDUsuario") int IDUsuario
    ) 
    {
        csUsuario p = new csUsuario();
        return p.eliminarUsuario(IDUsuario);
    }
    @WebMethod(operationName = "listar")
    public ArrayList<usuarioact> listarUsuario(
    ) 
    {
        csUsuario p = new csUsuario();
        return p.listarUsuario();
        
    }    
    @WebMethod(operationName = "listarUSuarioID")
    public usuarioact listarUsuarioID( @WebParam(name = "IDUsuario") int IDEmpresa
    )
    {
        csUsuario p = new csUsuario();
        return p.listarUsuarioID(IDEmpresa);
        
    }
    
}
