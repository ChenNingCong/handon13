package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TestBTest {

    @Test
    void test_g1() {
        SQL connection = mock(SQL.class);
        int x = 1;
        when(connection.query(x)).thenReturn(x);
        A a = new A(connection);
        assertEquals(x + 8, B.g1(x, a));
    }
}