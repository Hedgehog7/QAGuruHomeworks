package lessons;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstJUnitTest {
    @BeforeEach
    void beforeEach(){
        System.out.println("1");
    }

    @Test
    void firstTest(){
        System.out.println("2");
    }

    @AfterEach
    void afterEach(){
        System.out.println("3");
    }
}
