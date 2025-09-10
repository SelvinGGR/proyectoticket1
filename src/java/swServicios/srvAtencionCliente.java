
package swServicios;

import Modelo.csAtencionCliente;
import Modelo.acact;
import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import java.util.ArrayList;

@WebService(serviceName = "srvAtencionCliente")
public class srvAtencionCliente {
    @WebMethod(operationName = "insertarAC")
    public int insertarAC(@WebParam(name = "IDEmpleado") int IDEmpleado,@WebParam(name = "IDUsuario") int IDUsuario
   
    ) 
    {
        csAtencionCliente p = new csAtencionCliente();
        return p.InsertarAC(IDEmpleado,IDUsuario);
    }
    @WebMethod(operationName = "actualizarAC")
    public int actualizarAC(@WebParam(name = "IDEmpleado") int IDEmpleado,@WebParam(name = "IDUsuario") int IDUsuario,
   @WebParam(name = "IDAtencion") int IDAtencion
    ) 
    {
        csAtencionCliente p = new csAtencionCliente();
        return p.actualizarAC(IDEmpleado, IDUsuario, IDAtencion);
    }
    @WebMethod(operationName = "eliminarAC")
    public int eliminarAC( @WebParam(name = "IDAtencion") int IDAtencion
    ) 
    {
        csAtencionCliente p = new csAtencionCliente();
        return p.eliminarAC(IDAtencion);
    }
    @WebMethod(operationName = "listarAC")
    public ArrayList<acact> listarAC(
    ) 
    {
        csAtencionCliente p = new csAtencionCliente();
        return p.listarAC();
        
    }    
    @WebMethod(operationName = "listarACPorID")
    public acact listarACPorID( @WebParam(name = "IDAtencion") int IDAtencion
    )
    {
        csAtencionCliente p = new csAtencionCliente();
        return p.listarACPorID(IDAtencion);
        
    }
}

    

