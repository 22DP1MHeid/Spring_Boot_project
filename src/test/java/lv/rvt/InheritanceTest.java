package lv.rvt;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import rvt.temp.A;
import rvt.temp.B;
import rvt.temp.C;

import org.junit.Test;

public class InheritanceTest {

    @Test
    public void testABC() {

        A a = new A();
        B b = new B();
        C c = new C();

        a.a();
        b.b();
        c.c();
    }
}
