package one.dio.project.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author jardeljj
 */


@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}