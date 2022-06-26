package jinny.springboot.webapi.repository;

import jinny.springboot.webapi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
