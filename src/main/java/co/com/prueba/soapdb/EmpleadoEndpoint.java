package co.com.prueba.soapdb;

import localhost._8080.ws.empleados.AgregarEmpleadoRequest;
import localhost._8080.ws.empleados.Empleado;
import localhost._8080.ws.empleados.EmpleadoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.math.BigDecimal;
import java.time.LocalDate;

@Endpoint
public class EmpleadoEndpoint {
    private static final String NAMESPACE_URI = "http://localhost:8080/ws/empleados";
    @Autowired
    private EmpleadoRepository empleadoRepository;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "agregarEmpleadoRequest")
    @ResponsePayload
    public EmpleadoResponse agregarEmpleado(@RequestPayload AgregarEmpleadoRequest request) {


        Empleado empleado1 = request.getEmpleado();
        LocalDate fechaNacimiento = empleado1.getBirthDate().toGregorianCalendar().toZonedDateTime().toLocalDate();
        BigDecimal salario = BigDecimal.valueOf(empleado1.getSalario());

        EmpleadoEntity empleadoEntity=new EmpleadoEntity();
        empleadoEntity.setNombre(empleado1.getNombres());
        empleadoEntity.setApellido(empleado1.getApellidos());
        empleadoEntity.setTipoDoc(empleado1.getTipoDoc());
        empleadoEntity.setNumeroDoc(empleado1.getNumeroDoc());
        empleadoEntity.setFechaNac(fechaNacimiento);

        empleadoEntity.setCargo(empleado1.getCargo());
        empleadoEntity.setSalario(salario);
        empleadoRepository.save(empleadoEntity);




        EmpleadoResponse empleadoResponse = new EmpleadoResponse();
        empleadoResponse.setEmpleado(empleado1);

        return empleadoResponse;
    }

}
