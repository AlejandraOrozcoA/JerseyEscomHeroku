package mx.com.ipn.escom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/alumnos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AlumnoService {
	
	private static Map<Integer,Alumno> alumnos = new HashMap<>();
	
	static {
		
		Alumno ale = new Alumno (201509,"Alejandra","Orozco","ale12orozco@gmail.com");
		Alumno roy = new Alumno (201509,"Alejandra","Orozco","ale12orozco@gmail.com");
		
		alumnos.put(1, ale);
		alumnos.put(2, roy);
	}
	
	@GET
	public List<Alumno> getAlumnos (){
		return new ArrayList<Alumno>(alumnos.values());
	}
	
	@POST
	public void addAlumno(Alumno alumno) {
		alumnos.put(alumnos.size()+1, alumno);
	}
	
	@DELETE
	@Path("/{alumnoId}")
	public void DeleteAlumno(@PathParam("alumnoId") int id) {
		alumnos.remove(id);
	}

}
