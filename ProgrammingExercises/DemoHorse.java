/*
 * Created by Zola on 8/09/2016.
 */
public class DemoHorse
{
    public static void main(String[] args)
    {
        Horse horse1 = new Horse();
        horse1.setName("Comet");
        horse1.setColour("white");
        horse1.setBirthYear(2011);
        System.out.println(horse1.getName() + " is " + horse1.getColour() + " and was born in " + horse1.getBirthYear() + ".");

        RaceHorse horse2 = new RaceHorse();
        horse2.setName("Bullseye");
        horse2.setColour("brown");
        horse2.setBirthYear(2008);
        horse2.setNumberOfRaces(3);
        System.out.println(horse2.getName() + " is " + horse2.getColour() + ", born in " + horse2.getBirthYear()
                + " and has done " + horse2.getNumberOfRaces() + " races.");
    }
}
