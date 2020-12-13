package dio.myfirstapi.personapi.repository;

import dio.myfirstapi.personapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long>{
}
