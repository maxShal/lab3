package org.example;

import java.util.Arrays;

public class BatchOfGoods
{
    protected String description;
    private GoodsHasPackage [] productbatch;

    public String getDescription()
    {
        return description;
    }

    public GoodsHasPackage [] getProduct()
    {
        return productbatch;
    }

    public double getFullMass()
    {
        double mas=0;
        for(GoodsHasPackage prodict : productbatch)
        {
            if(prodict instanceof PackedPieceGoods packedPieceGoods)
            {
                mas+=packedPieceGoods.getBruttoMas();
            }
            if(prodict instanceof PackedWeightGoods packedWeightGoods)
            {
                mas+=packedWeightGoods.getBruttoMas();
            }
        }
        return mas;
    }

    public BatchOfGoods(String description, GoodsHasPackage... productbatch)
    {
        if(description==null)
        {
            throw new IllegalArgumentException();
        }
        this.description=description;
        this.productbatch=productbatch;
    }

    public int hashCode()
    {
        return description.hashCode()+Arrays.hashCode(productbatch);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BatchOfGoods that)) return false;
        return this.hashCode() == that.hashCode();
    }

    public String toString()
    {
        return String.format("Название партии товаров: %s Продукты: %s", description, Arrays.toString(productbatch));
    }
}
