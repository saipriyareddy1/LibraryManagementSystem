package com.spring.demo;

import com.spring.demo.library.controller.MemberController;
import com.spring.demo.library.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = { MemberController.class, MemberService.class})
class LibraryServiceApplicationTests {

    @Test
    void contextLoads() {

    }

}