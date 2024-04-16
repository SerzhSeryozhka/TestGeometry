import alkaz.Point;
import alkaz.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TrinagleTest {
    static Point zero;

    @BeforeAll
    public static void initZero() {
        zero = new Point(0, 0);
    }

    static Point a, b, c;

    @BeforeAll
    public static void initABC() {
        a = new Point(123, 100);
        b = new Point(100, 150);
        c = new Point(123, 150);
    }

    @Test
    public void testPerim() {
        Triangle tr = new Triangle(new Point(0, 0), new Point(3, 4), new Point(0, 4));
        Assertions.assertEquals(12, tr.perimeter());

        Triangle tr2 = new Triangle(zero, zero, zero);
        Assertions.assertEquals(0, tr2.perimeter());

        Assertions.assertEquals(new Triangle(a, b, c).perimeter(), new Triangle(b, c, a).perimeter());
    }

    @Test
    public void testArea() {
        Triangle tr = new Triangle(new Point(0, 0), new Point(3, 4), new Point(0, 4));
        Assertions.assertEquals(6, tr.area());
    }

    @Test
    public void testTriangl() {
        Triangle t1 = new Triangle(new Point(0, 0), new Point(0, 2), new Point(2, 0));
        Triangle t2 = new Triangle(new Point(4, 0), new Point(4, 2), new Point(6, 0));
        Triangle t3 = new Triangle(new Point(8, 2), new Point(10, 0), new Point(10, 2));
        Triangle t4 = new Triangle(new Point(0, 0), new Point(1, 1), new Point(3, 0));
        Triangle t5 = new Triangle(new Point(4, 1), new Point(5, 0), new Point(7, 1));
        Triangle t6 = new Triangle(new Point(9, 1), new Point(0,1), new Point(11, 0));
        Triangle t7 = new Triangle(new Point(12, 1), new Point(14, 0), new Point(13, 1));
        Assertions.assertEquals(false, t1.equals(t4));
        Assertions.assertEquals(true, t1.equals(t3));
        Assertions.assertEquals(true, t1.equals(t2));
        Assertions.assertEquals(false, t1.equals(t5));
        Assertions.assertEquals(false, t1.equals(t6));
        Assertions.assertEquals(false, t1.equals(t7));
        Assertions.assertEquals(false, t4.equals(t7));
        Assertions.assertEquals(true, t4.equals(t5));
        Assertions.assertEquals(false, t4.equals(t6));
    }
}
