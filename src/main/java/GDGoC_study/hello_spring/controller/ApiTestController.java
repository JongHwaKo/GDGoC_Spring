package GDGoC_study.hello_spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class ApiTestController {

    // GET: 조회용
    @GetMapping
    public String getData() {
        return "GET 요청 (데이터 조회)";
    }

    // POST: 생성용
    @PostMapping
    public String createData() {
        return "POST 요청 (데이터 생성)";
    }

    // PUT: 수정용
    @PutMapping
    public String updateData() {
        return "PUT 요청 (데이터 수정)";
    }

    // DELETE: 삭제용
    @DeleteMapping
    public String deleteData() {
        return "DELETE 요청 (데이터 삭제)";
    }
}