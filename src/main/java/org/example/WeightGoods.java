package org.example;

public class WeightGoods extends Product
{
    public WeightGoods()
    {
        super("Name_","description_");
    }

    public WeightGoods(String name,String description)
    {
        super(name,description);
    }
    public WeightGoods(WeightGoods weightGoods)
    {
        super(weightGoods.getName(),weightGoods.getDescription());
    }

    public int hashCode()
    {
        int result = super.hashCode();
        return result;
    }

    public boolean equals(WeightGoods weightGoods)
    {
        if(weightGoods==null)
        {
            return false;
        }
        else
       {
           return super.equals(weightGoods);
       }
    }

    public String toString()
    {
        return super.toString();
    }
}
