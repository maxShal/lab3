package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class PackageOfProductTest
{

    @Test
    public void getmas()
    {
        PackageOfProduct product = new PackageOfProduct(100, "null");
        assertEquals(100,product.getmas(),0.1);
    }

    @Test
    public void getName()
    {
        PackageOfProduct product = new PackageOfProduct(100, "null");
        assertEquals("null",product.getName());
    }

    @Test
    public void testToString()
    {
        double n =100;
        PackageOfProduct product = new PackageOfProduct(n, "null");
        assertEquals("Название: null, Вес: 100,000000",product.toString());
    }

    @Test
    public void testHashCode()
    {
        Integer n =100;
        PackageOfProduct product = new PackageOfProduct(n, "null");
        assertEquals(n.hashCode()+"null".hashCode(),product.hashCode());
    }

    @Test
    public void testEquals()
    {
        PackageOfProduct product = new PackageOfProduct(100,"name");
        PackageOfProduct product1;
        product1=product;
        assertEquals(product,product1);
    }

    @Test
    public void testEqualsNull()
    {
        PackageOfProduct product=null;
        PackageOfProduct product1=new PackageOfProduct(100,"name");
        assertEquals(false,product1.equals(product));
    }
}