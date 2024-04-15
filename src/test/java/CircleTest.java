import alkaz.Circle;
import alkaz.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    public void testIntersection(){
        Circle c1 = new Circle(10, new Point(0, 0));
        Circle c2 = new Circle(10, new Point(100, 0));
        Circle c3 = new Circle(10, new Point(6, 0));
        Circle c4 = new Circle(10, new Point(0, 10));
        Circle c5 = new Circle(5, new Point(1, 1) );
        Circle c6 = new Circle(5, new Point(7, 7));
        Assertions.assertEquals(false, c1.intersectsWith(c2));
        Assertions.assertEquals(false, c2.intersectsWith(c1));
        Assertions.assertEquals(true, c3.intersectsWith(c1));
        Assertions.assertEquals(true, c1.intersectsWith(c3));
        Assertions.assertEquals(true, c1.intersectsWith(c4));
        Assertions.assertEquals(true, c4.intersectsWith(c1));
        Assertions.assertEquals(false, c1.intersectsWith(c5));
        Assertions.assertEquals(false, c5.intersectsWith(c1));
        Assertions.assertEquals(true, c1.intersectsWith(c6));
        Assertions.assertEquals(true, c6.intersectsWith(c1));

    }
    @Test
    public void testEquals(){
        Circle c1 = new Circle(10, new Point(0, 0));
        Circle c2 = new Circle(10, new Point(100, 0));
        Circle c3 = new Circle(18, new Point(6, 0));
        Circle c4 = new Circle(18, new Point(0, 10));
        Circle c5 = new Circle(5, new Point(1, 1) );
        Circle c6 = new Circle(5, new Point(7, 7));
        Assertions.assertEquals(true, c1.equals(c2));
        Assertions.assertEquals(true, c2.equals(c1));
        Assertions.assertEquals(false, c3.equals(c1));
        Assertions.assertEquals(false, c1.equals(c3));
        Assertions.assertEquals(false, c1.equals(c4));
        Assertions.assertEquals(true, c3.equals(c4));
        Assertions.assertEquals(false, c4.equals(c1));
        Assertions.assertEquals(false, c1.equals(c5));
        Assertions.assertEquals(false, c5.equals(c1));
        Assertions.assertEquals(false, c1.equals(c6));
        Assertions.assertEquals(false, c6.equals(c1));
    }
}
