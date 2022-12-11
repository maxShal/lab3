package org.example;

public class PackedPieceGoods extends GoodsHasPackage
{
    protected int unit;
    protected PieceGoods pieceGoods;

    public int getUnit()
    {
        return unit;
    }

    public double getNettoMasUnits()
    {
        return unit*pieceGoods.getMass();
    }

    public double getBruttoMas()
    {
        return unit*pieceGoods.getMass()+ packageOfProduct.getmas();
    }

    public PackedPieceGoods(PieceGoods pieceGoods, int unit, PackageOfProduct packageOfProduct)
    {
        super(pieceGoods,packageOfProduct);
        if(pieceGoods==null)
        {
            throw new IllegalArgumentException();
        }
        this.unit=unit;
        this.pieceGoods=pieceGoods;
    }

    public int hashCode()
    {
       return super.hashCode()+packageOfProduct.hashCode()+unit;
    }

    public boolean equals(PackedPieceGoods packedPieceGoods)
    {
        return hashCode() == packedPieceGoods.hashCode();
    }

    public String toString()
    {
        return String.format("Название: %s Описание: %s Weight: %f Единица: %d Название упаковки: %s Вес " +
                        "Упаковки: %f", name, description, pieceGoods.getMass(), unit, packageOfProduct.getName(),
                packageOfProduct.getmas());
    }
}
