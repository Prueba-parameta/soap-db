package co.com.prueba.soapdb;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends CrudRepository <EmpleadoEntity,Long  > {

}
