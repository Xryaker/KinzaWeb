package googleTest;

import org.junit.*;

public class HillelTest {
    @Before
    public void bef(){
        System.out.println("before");
    }
    @After
    public void af(){
        System.out.println("after");
    }
    @BeforeClass
    public static void beforeClasss(){
        System.out.println("Statrt");
    }
    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }
    @AfterClass
    public static void afterClasss(){
        System.out.println("End");
    }
}
