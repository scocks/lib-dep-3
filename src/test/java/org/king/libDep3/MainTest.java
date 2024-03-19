package org.king.libdep3;

import org.junit.jupiter.api.Test;
import org.king.libdep3.Library;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void testGreet() {
        Library library = new Library();
        String result = library.greet("lib-dep-3");
        assertEquals("greet from libdep3, lib-dep-3!", result);
    }
}
