/*
 * Created by Zola on 9/09/2016.
 */
public class DemoCandles
{
    public static void main(String[] args)
    {
        Candle candle1 = new Candle();
        candle1.setColour("red");
        candle1.setHeight(4.5);
        ScentedCandle candleScent1 = new ScentedCandle();
        candleScent1.setColour("blue");
        candleScent1.setHeight(5);
        candleScent1.setScent("linen");
        System.out.println("The " + candle1.getColour() + " candle is " + candle1.getHeight() + " long and is worth $" + candle1.getPrice());
        System.out.println("The " + candleScent1.getColour() + " candle is " + candleScent1.getScent() + " scented, is " + candleScent1.getHeight() + " and is worth + " + candleScent1.getPrice());


    }

}
