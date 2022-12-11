package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class BatchOfGoodsTest
{
    @Test
    public void getFullMass()
    {
        PackedWeightGoods packedWeightGoods = new PackedWeightGoods(new Product("name", "description"),  new PackageOfProduct(100, "name"),100);
        PackedPieceGoods packedPieceGoods = new PackedPieceGoods(new PieceGoods("Product", "Description", 100), 100, new PackageOfProduct(100, "name"));
        BatchOfGoods batchOfGoods= new BatchOfGoods("Description", packedPieceGoods, packedWeightGoods);
        int result =100 + 100 + 100 * 100 + 100;
        assertEquals(result,batchOfGoods.getFullMass(),0.1);
    }
}