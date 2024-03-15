package org.libDep3;

import org.junit.jupiter.api.Test;
import org.libDep3.Library;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void testCount() {
        Library library = new Library();
        String[] result = library.count(10);
        assertEquals(10, result.length);
        for (int i = 0; i < 10; i++) {
            assertEquals("i = " + i, result[i]);
        }
    }
    @Test
    void testGreet() {
        Library library = new Library();
        String result = library.greet("lib-dep-3");
        assertEquals("Salutations, lib-dep-3!", result);
    }
}
