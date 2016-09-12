/*
 * Created by Zola on 12/09/2016.
 */
public class PetSold extends ItemSold
{
    private boolean isVaccinated;
    private boolean isNeutered;
    private boolean isHousebroken;
    public boolean getIsVaccinated()
    {
        return isVaccinated;
    }
    public boolean getIsNeutered()
    {
        return isNeutered;
    }
    public boolean getIsHousebroken()
    {
        return isHousebroken;
    }
    public void setIsVaccinated(boolean isVac)
    {
        isVaccinated = isVac;
    }
    public void setIsNeutered(boolean isNeut)
    {
        isNeutered = isNeut;
    }
    public void setIsHousebroken(boolean isBroken)
    {
        isHousebroken = isBroken;
    }
}
