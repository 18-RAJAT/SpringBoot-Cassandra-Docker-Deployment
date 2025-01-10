package springboot_cassandra_integration.springboot_cassandra_integration.repo;

import org.springframework.data.cassandra.repository.CassandraRepository;
import springboot_cassandra_integration.springboot_cassandra_integration.model.Student;

//spring-data-cassandra library
public interface StudentRepository extends CassandraRepository<Student,Integer> {

}
