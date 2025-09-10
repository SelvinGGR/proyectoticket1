
package swServicios;

import Modelo.csEstado;
import Modelo.estadoact;
import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import java.util.ArrayList;

@WebService(serviceName = "srvEstado")
public class srvEstado {
    @WebMethod(operationName = "insertarEstado")
    public int insertarEstado(@WebParam(name = "IDUsuario") int IDUsuario,@WebParam(name = "IDEmpleado") int IDEmpleado,@WebParam(name = "Estado") String Estado
   
    ) 
    {
        csEstado p = new csEstado();
        return p.InsertarEstado(IDUsuario,IDEmpleado,Estado);
    }
    @WebMethod(operationName = "actualizarEstado")
    public int actualizarEstado(@WebParam(name = "IDUsuario") int IDUsuario,@WebParam(name = "IDEmpleado") int IDEmpleado,@WebParam(name = "Estado") String Estado,
   @WebParam(name = "IDEstado") int IDEstado
    ) 
    {
        csEstado p = new csEstado();
        return p.actualizarEstado(IDUsuario, IDEmpleado, Estado,IDEstado);
    }
    @WebMethod(operationName = "eliminarEstado")
    public int eliminarEstado( @WebParam(name = "IDEstado") int IDEstado
    ) 
    {
        csEstado p = new csEstado();
        return p.eliminarEstado(IDEstado);
    }
    @WebMethod(operationName = "listarEstado")
    public ArrayList<estadoact> listarEstado(
    ) 
    {
        csEstado p = new csEstado();
        return p.listarEstado();
        
    }    
    @WebMethod(operationName = "listarEstadoPorID")
    public estadoact listarEstadoPorID( @WebParam(name = "IDEstado") int IDEstado
    )
    {
        csEstado p = new csEstado();
        return p.listarEstadoPorID(IDEstado);
        
    }
}


