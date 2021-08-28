import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    void rightTriangle(){
        double fact = Triangle.triangleS(3, 4 ,5);
        Assertions.assertEquals(6, fact);
    }

    @Test
    void wrongTriangle(){
        double fact = Triangle.triangleS(3, 4 ,5);
        Assertions.assertNotEquals(7, fact);

    }
}
