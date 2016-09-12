/*
 * Created by Zola on 12/09/2016.
 */
public class DemoItemsAndPets
{
    public static void main(String[] args) {
        ItemSold item1 = new ItemSold();

        item1.setInvoice(12345);
        item1.setDescription("Dog lead");
        item1.setPrice(12.00);


        PetSold pet1 = new PetSold();
        pet1.setInvoice(213);
        pet1.setDescription("Labrador-Retriever");
        pet1.setPrice(500);
        pet1.setIsVaccinated(true);
        pet1.setIsNeutered(true);
        pet1.setIsHousebroken(false);
        displayItem(item1);
        displayItem(pet1);
        displayPet(pet1);
    }
    public static void displayItem(ItemSold item)
    {
        System.out.println("Item no: " + item.getInvoice());
        System.out.println("Description: " + item.getDescription());
        System.out.println("Price: $" + item.getPrice());
    }
    public static void displayPet(PetSold petData)
    {
        System.out.println("Vaccinated : " + petData.getIsVaccinated());
        System.out.println("Neutered : " + petData.getIsNeutered());
        System.out.println("Housebroken : " + petData.getIsHousebroken());
    }
}
