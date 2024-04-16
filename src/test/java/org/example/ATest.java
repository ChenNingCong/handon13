package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATest {
    @Test
    @DisplayName("Testing f1")
    void f1() {
        assertEquals(2, A.f1(1));
    }

    @Test
    @DisplayName("Testing f2")
    void f2() {
        assertEquals(3, A.test_f2(1));
    }


    @Test
    @DisplayName("Testing f3")
    void f3() {
        assertEquals(4, A.f3(1));
    }

    @Test
    @DisplayName("Testing f4")
    void f4() {
        assertEquals(5, A.test_f4(1));
    }

    @Test
    @DisplayName("Testing f5")
    void f5() {
        assertEquals(1, A.f5(1, 1));
        assertEquals(2, A.f5(2, 1));
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            A.f5(1, 0);
        });
    }

    @Test
    @DisplayName("Testing f6")
    void f6() {
        assertEquals(6, A.f6(1));
        Exception exception = assertThrows(RuntimeException.class, () -> {
            A.f6(-1);
        });
        assertEquals("x can't be negative", exception.getMessage());
    }

    @Test
    @DisplayName("Testing f7")
    void f7() {
        assertEquals(" more stuff", A.f7(""));
        assertNotEquals(" more stuff", A.f7("random"));
    }

    @Test
    @DisplayName("Testing f8")
    void f8() {
        SQL connection = new SQL();
        A a = new A(connection);
        assertEquals(8, a.test_f8(0));
    }
}