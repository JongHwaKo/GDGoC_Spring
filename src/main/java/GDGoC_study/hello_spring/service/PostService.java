package GDGoC_study.hello_spring.service;

import GDGoC_study.hello_spring.entity.Post;
import GDGoC_study.hello_spring.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository repository;

    public Post savePost(Post post) {
        return repository.save(post);
    }
}