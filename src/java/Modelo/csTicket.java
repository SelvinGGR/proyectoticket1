
package Modelo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class csTicket {
    private Connection con; //open y close a la base de datos
private Statement stm;  // permite hacer el insert update delete y select
private ResultSet rs; //contenedor de datos

public csTicket(){
this.con=null;
this.stm=null;

}

//insercion de datos

public int InsertarTicket(int IDMotivo, int IDUsuario, String Fecha, String Hora, String Estado, int IDEstado, int IDAtencion)
{
    int respuesta=0;
    //instancia de la clase conexion
    csConexion c1 = new csConexion();
   con = c1.conectar();
   
    
    try
    {
         stm=con.createStatement();
    respuesta = stm.executeUpdate("insert into Proyectoticket.dbo.Ticket(IDMotivo,IDUsuario,Fecha,Hora,Estado,IDEstado,IDAtencion)"
            + "values("+ IDMotivo + ", " + IDUsuario + ", '" + Fecha + "', '" + Hora + "', '" + Estado + "', " + IDEstado + "," + IDAtencion + ")");
    c1.desconectar();
    con.close();
    stm.close();
    }
    
    catch (Exception ex)
    {
     
        
    }    
    return respuesta;
}   

public int actualizarTicket(int IDMotivo, int IDUsuario, String Fecha, String Hora,String Estado,int IDEstado,int IDAtencion,int IDTicket)

{
    int respuesta =0;
    csConexion c1 = new csConexion();
    con=c1.conectar();
    
    try {
     stm=con.createStatement();
    respuesta = stm.executeUpdate("update Proyectoticket.dbo.Ticket set "
            + "IDMotivo=" + IDMotivo + ", "
            + "IDUsuario = " + IDUsuario + ", "
            + "Fecha = '" + Fecha + "', "
            + "Hora = '" + Hora + "',"
            + "Estado = '" + Estado + "',"
            + "IDEstado = " + IDEstado + ","
            + "IDAtencion = " + IDAtencion + ""
            + "where IDTicket = " + IDTicket + " "); 
    c1.desconectar();
    con.close();
    stm.close();
    }
    catch (Exception ex)
    {
        
    }
    return respuesta;
}
public int eliminarTicket(int IDTicket){
    int respuesta=0;
    csConexion c1 = new csConexion();
    con=c1.conectar();
  
    try {
        stm=con.createStatement();
        respuesta = stm.executeUpdate("delete from Proyectoticket.dbo.Ticket where IDTicket = " 
                + IDTicket + "");
        c1.desconectar();
        con.close();
        stm.close();
    }
    catch (Exception ex)
    {
    
    }
    return respuesta;
}
public ArrayList <ticketact> listarTicket()
{
    ticketact  p = null;
    ArrayList<ticketact> lista = new ArrayList<ticketact>();
    lista=null;
    
    csConexion c1 = new csConexion();
    con=c1.conectar();
    rs=null;
    
    try{
        stm=con.createStatement();
        rs = stm.executeQuery("select * from Proyectoticket.dbo.Ticket");
        
        while (rs.next())
            
        {
            p = new ticketact(rs.getInt("IDMotivo"),rs.getInt("IDUsuario"),rs.getString("Fecha"),rs.getString("Hora"),rs.getString("Estado"),
                    rs.getInt("IDEstado"),rs.getInt("IDAtencion"),
            rs.getInt(1));
            lista.add(p);
        }
        
        c1.desconectar();
        con.close();
        stm.close();
    }
    catch(Exception ex)
    {
    
    }
    return lista;
    
}
public ticketact listarTicketPorID(int IDTicket)
{
    ticketact p = null;
    
    csConexion c1 = new csConexion();
    con=c1.conectar();
    rs=null;
    
    try{
        stm=con.createStatement();
        rs = stm.executeQuery("select * from Proyectoticket.dbo.Ticket where IDTicket = " + IDTicket + "");
        
        while (rs.next())
            
        {
            p = new ticketact(rs.getInt("IDMotivo"),rs.getInt("IDUsuario"),rs.getString("Fecha"),rs.getString("Hora"),rs.getString("Estado"),
                    rs.getInt("IDEstado"),rs.getInt("IDAtencion"),
            rs.getInt(1));
            
        }
        
        c1.desconectar();
        con.close();
        stm.close();
    }
    catch(Exception ex)
    {
    
    }
    return p;
    
}

}


