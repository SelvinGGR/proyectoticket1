
package swServicios;

import Modelo.csTicket;
import Modelo.ticketact;
import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import java.util.ArrayList;

@WebService(serviceName = "srvTicket")
public class srvTicket {
        @WebMethod(operationName = "insertarTicket")
    public int insertarTicket(@WebParam(name = "IDMotivo") int IDMotivo,@WebParam(name = "IDUsuario") int IDUsuario,
    @WebParam(name = "Fecha") String Fecha,@WebParam(name = "Hora") String Hora,@WebParam(name = "Estado") String Estado,
    @WebParam(name = "IDEstado") int IDEstado,@WebParam(name = "IDAtencion") int IDAtencion
    ) 
    {
        csTicket p = new csTicket();
        return p.InsertarTicket(IDMotivo, IDUsuario, Fecha, Hora, Estado, IDEstado, IDAtencion);
    }
    @WebMethod(operationName = "actualizarTicket")
    public int actualizarTicket(@WebParam(name = "IDMotivo") int IDMotivo,@WebParam(name = "IDUsuario") int IDUsuario,
    @WebParam(name = "Fecha") String Fecha,@WebParam(name = "Hora") String Hora,@WebParam(name = "Estado") String Estado,
    @WebParam(name = "IDEstado") int IDEstado,@WebParam(name = "IDAtencion") int IDAtencion,
    @WebParam(name = "IDTicket") int IDTicket
    ) 
    {
        csTicket p = new csTicket();
        return p.actualizarTicket(IDMotivo, IDUsuario, Fecha, Hora,Estado,IDEstado,IDAtencion,IDTicket);
    }
    @WebMethod(operationName = "eliminarTicket")
    public int eliminarTicket( @WebParam(name = "IDTikcet") int IDTicket
    ) 
    {
        csTicket p = new csTicket();
        return p.eliminarTicket(IDTicket);
    }
    @WebMethod(operationName = "listarTicket")
    public ArrayList<ticketact> listarTicket(
    ) 
    {
        csTicket p = new csTicket();
        return p.listarTicket();
        
    }    
    @WebMethod(operationName = "listarTicketPorID")
    public ticketact listarTicketPorID( @WebParam(name = "IDTicket") int IDTicket
    )
    {
        csTicket p = new csTicket();
        return p.listarTicketPorID(IDTicket);
        
    }
     
}
    

