import com.sun.org.apache.xml.internal.utils.ObjectVector;
import com.sun.org.apache.xpath.internal.objects.XObject;

import javax.jws.Oneway;

public class Vektor2D {
  double x;
  double y;
    public Vektor2D(double x, double y) {
       this.x = x;
       this.y = y;
    }

    public void add(double a, double b){
      this.x = x + a;
      this.y = y + b;
    }

    public void sub(double a, double b){
        this.x = x - a;
        this.y -= b;
    }

    public void mult(double t){
        this.x *= t;
        this.y *= t;
    }

    @Override
    public String toString() {
        return "Vektor2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
