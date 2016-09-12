/*
 * Created by Zola on 9/09/2016.
 */
public class ScentedCandle extends Candle
{
    private String scent;
    public String getScent()
    {
        return scent;
    }
    public void setScent(String scent)
    {
        this.scent = scent;
    }
    @Override
    public void setHeight(double h)
    {
        final double PRICE_PER_INCH = 3;
        super.setHeight(h);
        price = h* PRICE_PER_INCH;
    }
}

