package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;
public class CheckCharacterOccurenceTest {
    CheckCharacterOccurence cco = new CheckCharacterOccurence();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void test(){
        cco.check(new char[]{'a', 'a', 'b', 'b', 'b', 'c', 'd', 'd', 'e'});
    }
}
