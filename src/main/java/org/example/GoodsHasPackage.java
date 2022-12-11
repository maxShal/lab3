package org.example;

public class GoodsHasPackage extends Product
{
    public PackageOfProduct packageOfProduct;

    public PackageOfProduct getPackageOfProduct()
    {
        return packageOfProduct;
    }

    public GoodsHasPackage()
    {
        super("name","description");
        this.packageOfProduct=new PackageOfProduct(100,"name");
    }
    public GoodsHasPackage(GoodsHasPackage goodsHasPackage)
    {
        super(goodsHasPackage.getName(),goodsHasPackage.getDescription());
        this.packageOfProduct=goodsHasPackage.getPackageOfProduct();
    }

    public GoodsHasPackage(String name, String description, PackageOfProduct packageOfProduct)
    {
        super(name, description);
        this.packageOfProduct=packageOfProduct;
    }

    public GoodsHasPackage(Product product, PackageOfProduct packageOfProduct)
    {
        super(product);
        this.packageOfProduct=packageOfProduct;
    }

    public int hashCode()
    {
       return super.hashCode()+packageOfProduct.hashCode();
    }

    public String toString()
    {
        return super.toString()+packageOfProduct.toString();
    }

    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoodsHasPackage that = (GoodsHasPackage) o;
        return this.hashCode() == that.hashCode();
    }
}
