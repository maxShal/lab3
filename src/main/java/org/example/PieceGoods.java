package org.example;

public class PieceGoods extends Product
{
    protected double mass;

    public double getMass()
    {
        return mass;
    }

    public PieceGoods(String name, String description, double mass)
    {
        super(name,description);
        this.mass=mass;
    }

    public PieceGoods()
    {
        super("name","descriptoin");
        this.mass=mass;
    }

    public PieceGoods(PieceGoods pieceGoods)
    {
        super(pieceGoods.getName(),pieceGoods.getDescription());
        this.mass=mass;
    }

    public String toString()
    {
        return String.format("Название %s, Описание %s, Вес %f", name,description,mass);
    }

    public int hashCode()
    {
        int result = super.hashCode();
        result+=(int)mass;
        return result;
    }

    public boolean equals(PieceGoods pieceGoods)
    {
        if(pieceGoods==null)
        {
            return false;
        }
        else
        {
            return this.hashCode()==pieceGoods.hashCode();
        }
    }
}
