package org.example;

public class PackedWeightGoods extends GoodsHasPackage
{
    private double mas;

    public double getMas()
    {
        return mas;
    }

    public double getNettoMas()
    {
        return mas;
    }

    public double getBruttoMas()
    {
        double result =mas+packageOfProduct.getmas();
        return result;
    }

    public PackedWeightGoods(Product product, PackageOfProduct packageOfProduct, double mas )
    {
        super(product,packageOfProduct);
        this.mas=mas;
    }

    public int hashCode()
    {
        return super.hashCode()+ packageOfProduct.hashCode()+(int)mas;
    }

    public boolean equals(PackedWeightGoods packedWeightGoods)
    {
        return this.hashCode() == packedWeightGoods.hashCode();
    }

    public String toString()
    {
        return super.toString();
    }
}
