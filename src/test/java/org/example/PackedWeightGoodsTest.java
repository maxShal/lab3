package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class PackedWeightGoodsTest {

    @Test
    public void getMas()
    {
        PackedWeightGoods packedWeightGoods = new PackedWeightGoods(new Product("name","description"),new PackageOfProduct(100,"name"),100);

        double n=100;
        assertEquals(n,packedWeightGoods.getNettoMas(),0.1);
    }

    @Test
    public void getNettoMas() {
        PackedWeightGoods packedWeightGoods = new PackedWeightGoods(new Product("name","description"),new PackageOfProduct(100,"name"),100);

        double n=100;
        assertEquals(n,packedWeightGoods.getNettoMas(),0.1);
    }

    @Test
    public void getBruttoMas()
    {
        PackedWeightGoods packedWeightGoods = new PackedWeightGoods(new Product("name","description"),new PackageOfProduct(100,"name"),100);

        double n=100+100;
        assertEquals(n,packedWeightGoods.getBruttoMas(),0.1);
    }

}