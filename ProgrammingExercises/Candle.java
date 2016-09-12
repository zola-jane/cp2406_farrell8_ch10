/*
 * Created by Zola on 9/09/2016.
 */
public class Candle
{
    private String colour;
    private double height;
    protected double price;
    public String getColour()
    {
        return colour;
    }
    public double getHeight()
    {
        return height;
    }
    public double getPrice()
    {
        return price;
    }
    public void setColour(String c)
    {
        colour = c;
    }
    public void setHeight(double h)
    {
        final double PRICE_PER_INCH = 2;
        height = h;
        price = height * PRICE_PER_INCH;
    }
}
