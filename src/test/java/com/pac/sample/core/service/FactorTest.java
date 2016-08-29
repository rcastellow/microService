package com.pac.sample.core.service;

import org.junit.Test;
import com.google.common.collect.Lists;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;



/**
 * Created by RobCastellow on 8/21/16.
 */
public class FactorTest {

    @Test
    public void getId() throws Exception {
        Factor factor = new Factor(123l, 2248) ;
        assertEquals(123l, factor.getId());
    }

    @Test
    public void getValue() throws Exception {
        Factor factor = new Factor(123l, 2248) ;
        assertEquals(2248, factor.getValue());
    }

    @Test
    public void getFactorValues() throws Exception {
        Factor factor = new Factor(123l, 2248) ;
        assertEquals(8, factor.getFactorValues().size());
        assertTrue(factor.getFactorValues().containsAll(
                Lists.newArrayList(1, 2, 4, 8, 281, 562, 1124, 2248)));
    }

}