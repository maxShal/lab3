package org.example;

public class PackageOfProduct
{
    protected double mas;
    protected String name;

    public PackageOfProduct(double mas, String name)
    {
        this.mas=mas;
        this.name=name;
    }

    public double getmas()
    {
        return mas;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return String.format("Название: %s, Вес: %f", name, mas);
    }

    public int hashCode()
    {
        int result = name.hashCode();
        result+=(int)mas;
        return result;
    }
    public boolean equals(PackageOfProduct packageOfProduct)
    {
        if(packageOfProduct ==null)
        {
            return false;
        }
        else
        {
            return hashCode()==packageOfProduct.hashCode();
        }
    }

}
