//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.3 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.02.05 a las 11:51:34 PM COT 
//


package localhost._8080.ws.empleados;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the localhost._8080.ws.empleados package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: localhost._8080.ws.empleados
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgregarEmpleadoRequest }
     * 
     */
    public AgregarEmpleadoRequest createAgregarEmpleadoRequest() {
        return new AgregarEmpleadoRequest();
    }

    /**
     * Create an instance of {@link Empleado }
     * 
     */
    public Empleado createEmpleado() {
        return new Empleado();
    }

    /**
     * Create an instance of {@link EmpleadoResponse }
     * 
     */
    public EmpleadoResponse createEmpleadoResponse() {
        return new EmpleadoResponse();
    }

}
