package GDGoC_study.hello_spring.repository;

import GDGoC_study.hello_spring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

// <User, Long> 은 엔티티 타입과 그 id의 타입
public interface UserRepository extends JpaRepository<User, Long> {
}