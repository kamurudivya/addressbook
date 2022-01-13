package org.bridgelabz.addressbookworkshop;

import org.junit.Before;
import org.junit.Test;

public class AddressBookTest {

    Address bookTest = new Address();

    @Before
    public void setUp() throws Exception {
        bookTest = new Address();
    }

    @Test
    public void Initialise() {
        assertTrue(true);
    }

    private void assertTrue(boolean b) {
    }
}
