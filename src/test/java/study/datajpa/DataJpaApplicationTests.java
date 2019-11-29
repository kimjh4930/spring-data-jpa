package study.datajpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import study.datajpa.repository.MemberJpaRepository;

@SpringBootTest
class DataJpaApplicationTests {

    @Autowired
    private MemberJpaRepository memberJpaRepository;

    @Test
    void contextLoads() {
    }

}
