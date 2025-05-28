package GDGoC_study.hello_spring.controller;

import GDGoC_study.hello_spring.entity.Post;
import GDGoC_study.hello_spring.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/posts")
public class PostController {

    private final PostService service;

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return service.savePost(post);
    }
}
