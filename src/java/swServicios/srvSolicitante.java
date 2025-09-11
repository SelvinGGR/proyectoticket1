package swServicios;

import Modelo.csSolicitante;
import Modelo.solicitanteact;
import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import java.util.ArrayList;

@WebService(serviceName = "srvSolicitante")
public class srvSolicitante
{
    @WebMethod(operationName = "insertarSolicitante")
    public int insertarSolicitante(
        @WebParam(name = "DPI") String DPI,
        @WebParam(name = "IDUsuario") int IDUsuario,
        @WebParam(name = "Nombre") String Nombre,
        @WebParam(name = "FechaNacimiento") String FechaNacimiento,
        @WebParam(name = "Telefono") String Telefono,
        @WebParam(name = "Direccion") String Direccion,
        @WebParam(name = "Email") String Email
    )
    {
        csSolicitante p = new csSolicitante();
        return p.InsertarSolicitante(DPI, IDUsuario, Nombre, FechaNacimiento, Telefono, Direccion, Email);
    }

    @WebMethod(operationName = "actualizarSolicitante")
    public int actualizarSolicitante(
        @WebParam(name = "DPI") String DPI,
        @WebParam(name = "IDUsuario") int IDUsuario,
        @WebParam(name = "Nombre") String Nombre,
        @WebParam(name = "FechaNacimiento") String FechaNacimiento,
        @WebParam(name = "Telefono") String Telefono,
        @WebParam(name = "Direccion") String Direccion,
        @WebParam(name = "Email") String Email,
        @WebParam(name = "IDSolicitante") int IDSolicitante
    )
    {
        csSolicitante p = new csSolicitante();
        return p.actualizarSolicitante(DPI, IDUsuario, Nombre, FechaNacimiento, Telefono, Direccion, Email, IDSolicitante);
    }

    @WebMethod(operationName = "eliminarSolicitante")
    public int eliminarSolicitante(
        @WebParam(name = "IDSolicitante") int IDSolicitante
    )
    {
        csSolicitante p = new csSolicitante();
        return p.eliminarSolicitante(IDSolicitante);
    }

    @WebMethod(operationName = "listarSolicitante")
    public ArrayList<solicitanteact> listarSolicitante()
    {
        csSolicitante p = new csSolicitante();
        return p.listarSolicitante();
    }

    @WebMethod(operationName = "listarSolicitantePorID")
    public solicitanteact listarSolicitantePorID(
        @WebParam(name = "IDSolicitante") int IDSolicitante
    )
    {
        csSolicitante p = new csSolicitante();
        return p.listarSolicitantePorID(IDSolicitante);
    }
}
