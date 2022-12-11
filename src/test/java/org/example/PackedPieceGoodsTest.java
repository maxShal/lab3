package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class PackedPieceGoodsTest {

    @Test
    public void getNettoMasUnits()
    {
        PackedPieceGoods n = new PackedPieceGoods(new PieceGoods("n", "n", 100), 100, new PackageOfProduct(100, "n"));
        double nn=10000;
        assertEquals(nn,n.getNettoMasUnits(),0.1);
    }

    @Test
    public void getBruttoMas()
    {
        PackedPieceGoods n = new PackedPieceGoods(new PieceGoods("n", "n", 100), 100, new PackageOfProduct(100, "n"));
        double nn=10000+100;
        assertEquals(nn,n.getBruttoMas(),0.1);
    }
}