package thymeleafNew.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import thymeleafNew.model.Employee;

@Repository 		//yazmasak da hata vermez
public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

}
