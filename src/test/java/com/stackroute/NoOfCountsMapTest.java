package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;
public class NoOfCountsMapTest {
    NoOfCountsMap cm = new NoOfCountsMap();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void Test(){
        cm.count("tu hi mera mera mera tu hi mera mera mera tu hi mera mera mera");
    }
}
