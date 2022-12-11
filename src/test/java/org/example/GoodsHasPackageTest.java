package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class GoodsHasPackageTest {

    @Test
    public void testEquals()
    {
        GoodsHasPackage goodsHasPackage=new GoodsHasPackage();
        GoodsHasPackage goodsHasPackage1=new GoodsHasPackage();
        assertEquals(true,goodsHasPackage.equals(goodsHasPackage1));

    }
    @Test
    public void testEqualsFalse()
    {
        GoodsHasPackage goodsHasPackage=new GoodsHasPackage();
        GoodsHasPackage goodsHasPackage1=null;
        assertEquals(false,goodsHasPackage.equals(goodsHasPackage1));

    }
}