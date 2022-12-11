package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void qeuals()
    {
        Product product1=new Product("name","description");
        Product product2=new Product();
        assertEquals(true,product2.qeuals(product1));
    }

    @Test
    public void qeualsNull()
    {
        Product product1=null;
        Product product2=new Product();
        assertEquals(false,product2.qeuals(product1));
    }

    @Test
    public void hashCodeTest()
    {
        Product product=new Product("null","null1");
        assertEquals("null".hashCode()+"null1".hashCode(),product.hashCode());
    }

    @Test
    public void toStringTest()
    {
        Product product=new Product("null","null1");
        assertEquals("Имя null, Описание null1",product.toString());
    }

    @Test
    public void getNameTest()
    {
        Product product=new Product("null","null1");
        assertEquals("null",product.getName());
    }

    @Test
    public void getDescriptionTest()
    {
        Product product=new Product("null","null1");
        assertEquals("null1",product.getDescription());
    }


}