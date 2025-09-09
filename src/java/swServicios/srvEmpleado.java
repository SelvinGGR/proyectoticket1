
package swServicios;
import Modelo.csEmpleado;
import Modelo.empleadoact;
import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import java.util.ArrayList;

@WebService(serviceName = "srvEmpleado")
public class srvEmpleado {
    @WebMethod(operationName = "insertarEmpleado")
    public int insertarEmpleado(@WebParam(name = "Puesto") String Puesto,@WebParam(name = "Departamento") String Departamento,@WebParam(name = "Nombre") String Nombre,
    @WebParam(name = "Correo") String Correo,@WebParam(name = "Telefono") String Telefono,@WebParam(name = "IDEmpresa") int IDEmpresa
    ) 
    {
        csEmpleado p = new csEmpleado();
        return p.InsertarEmpleado(Puesto, Departamento,Nombre, Correo, Telefono,IDEmpresa);
    }
    @WebMethod(operationName = "actualizarEmpleado")
    public int actualizarEmpleado(@WebParam(name = "Puesto") String Puesto,@WebParam(name = "Departamento") String Departamento,@WebParam(name = "Nombre") String Nombre,
    @WebParam(name = "Correo") String Correo,@WebParam(name = "Telefono") String Telefono,@WebParam(name = "IDEmpresa") int IDEmpresa,@WebParam(name = "IDEmpleado") int IDEmpleado
    ) 
    {
        csEmpleado p = new csEmpleado();
        return p.actualizarEmpleado(Puesto, Departamento,Nombre, Correo, Telefono,IDEmpresa,IDEmpleado);
    }
    @WebMethod(operationName = "eliminarEmpleado")
    public int eliminarEmpleado( @WebParam(name = "IDEmpleado") int IDEmpleado
    ) 
    {
        csEmpleado p = new csEmpleado();
        return p.eliminarEmpleado(IDEmpleado);
    }
    @WebMethod(operationName = "listarEmpleado")
    public ArrayList<empleadoact> listarEmpleado(
    ) 
    {
        csEmpleado p = new csEmpleado();
        return p.listarEmpleado();
        
    }    
    @WebMethod(operationName = "listarEmpleadoPorID")
    public empleadoact listarEmpleadoPorID( @WebParam(name = "IDEmpleado") int IDEmpleado
    )
    {
        csEmpleado p = new csEmpleado();
        return p.listarEmpleadoPorID(IDEmpleado);
        
    }
     
    
}
