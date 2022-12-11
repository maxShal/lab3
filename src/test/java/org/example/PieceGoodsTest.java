package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class PieceGoodsTest {

    @Test
    public void getMass()
    {
        PieceGoods pieceGoods=new PieceGoods("name","description",100);
        assertEquals(100,pieceGoods.getMass(),0.1);
    }

    @Test
    public void testToString()
    {
        PieceGoods pieceGoods=new PieceGoods("name","description",100);
        assertEquals("Название name, Описание description, Вес 100,000000",pieceGoods.toString());
    }

    @Test
    public void testHashCode()
    {
        Integer n =100;
        PieceGoods pieceGoods=new PieceGoods("name","description",n);
        assertEquals(n.hashCode()+"name".hashCode()+"description".hashCode(),pieceGoods.hashCode());
    }

    @Test
    public void testEquals()
    {
        PieceGoods pieceGoods=new PieceGoods("name","description",100);
        PieceGoods pieceGoods1=new PieceGoods("name","description",100);
        assertEquals(true,pieceGoods.equals(pieceGoods1));
    }

    @Test
    public void testEquals2()
    {
        PieceGoods pieceGoods=new PieceGoods("name","description",100);
        PieceGoods pieceGoods1=null;
        assertEquals(false,pieceGoods.equals(pieceGoods1));
    }
}