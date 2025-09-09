
package swServicios;
import Modelo.csMotivo;
import Modelo.motivoact;
import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import java.util.ArrayList;

@WebService(serviceName = "srvMotivo")
public class srvMotivo {
    @WebMethod(operationName = "insertarMotivo")
    public int insertarMotivo(@WebParam(name = "IDUsuario") int IDUsuario,@WebParam(name = "Descripcion") String Descripcion
   
    ) 
    {
        csMotivo p = new csMotivo();
        return p.InsertarMotivo(IDUsuario, Descripcion);
    }
    @WebMethod(operationName = "actualizarMotivo")
    public int actualizarMotivo(@WebParam(name = "IDUsuario") int IDUsuario,@WebParam(name = "Descripcion") String Descripcion,
   @WebParam(name = "IDMotivo") int IDMotivo
    ) 
    {
        csMotivo p = new csMotivo();
        return p.actualizarMotivo(IDUsuario, Descripcion, IDMotivo);
    }
    @WebMethod(operationName = "eliminarMotivo")
    public int eliminarMotivo( @WebParam(name = "IDMotivo") int IDMotivo
    ) 
    {
        csMotivo p = new csMotivo();
        return p.eliminarMotivo(IDMotivo);
    }
    @WebMethod(operationName = "listarMotivo")
    public ArrayList<motivoact> listarMotivo(
    ) 
    {
        csMotivo p = new csMotivo();
        return p.listarMotivo();
        
    }    
    @WebMethod(operationName = "listarMotivoPorID")
    public motivoact listarMotivoPorID( @WebParam(name = "IDMotivo") int IDMotivo
    )
    {
        csMotivo p = new csMotivo();
        return p.listarMotivoPorID(IDMotivo);
        
    }
}
