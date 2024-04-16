package alkaz;

import static java.lang.Math.abs;

public class Triangle {
    Point vertex1, vertex2, vertex3;

    public Triangle(Point vertex1, Point vertex2, Point vertex3) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
    }

    public double perimeter() {
        return vertex1.distanceTo(vertex2) + vertex2.distanceTo(vertex3) + vertex3.distanceTo(vertex1);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "vertex1=" + vertex1 +
                ", vertex2=" + vertex2 +
                ", vertex3=" + vertex3 +
                '}';
    }

    public double area() {
        double p = perimeter() / 2;
        double ab = vertex1.distanceTo(vertex2);
        double bc = vertex2.distanceTo(vertex3);
        double ac = vertex1.distanceTo(vertex3);
        return Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
//        return 0.5*abs((vertex2.x - vertex1.x)*(vertex3.y- vertex1.y) - (vertex3.x- vertex1.x)*(vertex2.y- vertex1.y));
    }

    public boolean equals(Triangle other) {
        double ab11 = vertex1.distanceTo(vertex2);
        double ac12 = vertex3.distanceTo(vertex1);
        double bc13 = vertex2.distanceTo(vertex3);
        double ab21 = other.vertex1.distanceTo(other.vertex2);
        double ac22 = other.vertex3.distanceTo(other.vertex1);
        double bc23 = other.vertex2.distanceTo(other.vertex3);
        double ab= vertex2.distanceTo(vertex1);
        double ac= vertex2.distanceTo(vertex3);
        double bc= vertex3.distanceTo(vertex2);
        if (ab11 == ab21 && ac12 == ac22 && bc13 == bc23
                || ab11 == ac22 && ac12 == bc23 && bc13 == ab21
                || ab11 == bc23 && ac12 == ab21 && bc13 == ac22
                || ab== ab21&&ac==ac22&&bc==bc23
                || ab == ac22 && ac == bc23 && bc == ab21
                || ab == bc23 && ac == ab21 && bc == ac22)
        {return true;}
        else
        {return false;}
    }
}
