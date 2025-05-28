package GDGoC_study.hello_spring.repository;

import GDGoC_study.hello_spring.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}