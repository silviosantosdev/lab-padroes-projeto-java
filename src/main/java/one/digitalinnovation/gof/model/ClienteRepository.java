package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface ClienteRepository extends CrudRepository <Cliente, Long> {
}
