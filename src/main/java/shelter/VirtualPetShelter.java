package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 * There are a couple changes I would like to see to this class to make it a little bit better.
 * - We always recommend having the System.out.println() methods in the App class.  This is to keep our
 *   class design as extendable as possible.  If we wanted to use this class in a web app we would have to
 *   remove the references to the System.out.println() methods.  You could move the showPets method to the
 *   App class and pass the method a collection of pets in it's parameter list.
 * - A couple more things about the showPets method, the name petLevels for the variable that holds the pets
 *   as the collection of pets is being iterated through could be named better.  Think of using a name as
 *   simple as pet, or petToDisplay.  The use of a plural variable name is usually reserved for collections
 *   of objects.  And the method returns an empty string, it could be changed to a void return method and not
 *   need the return statement.
 * - Same notes as above for the iteration in feedAll, waterAll, and tick methods, consider a different
 *   variable name than petLevels.
 * - There was a requirement to playWith a single pet, I think you're using cuddle instead of play, but
 *   I don't see a similar option to cuddle with a single pet in this class.
 * - The adoptPet method could be simplified, you can pass the name to the method instead of the pet.
 *   The map interface has a method remove that will use the name of the pet to remove it from the collection.
 */

public class VirtualPetShelter {
    Map<String, VirtualPet> pets = new HashMap<>();

    public Collection<VirtualPet> getAllPets() {
        return pets.values();
    }

    public String showPets() {
        for (VirtualPet petToDisplay : getAllPets()) {
            System.out.println(petToDisplay.getName() + "" + petToDisplay.getLevels());
        }
        return "";
    }

    public void add(VirtualPet pet) {
        pets.put(pet.getName(), pet);
    }

    public VirtualPet findNewPet(String name) {
        return pets.get(name);
    }

    public void adopt(VirtualPet pet) {
        pets.remove(pet.getName(), pet);
    }

    public void feedAllPets() {
        for (VirtualPet petToDisplay : pets.values()) {
            petToDisplay.feed(5);
        }
    }

    public void waterAllPets() {
        for (VirtualPet petToDisplay : pets.values()) {
            petToDisplay.water(5);
        }
    }

    public void cuddleAllPets() {
        for (VirtualPet petToDisplay : pets.values()) {
            petToDisplay.cuddle(15);
        }
    }

    public String seeDescription() {
        for (VirtualPet petToDisplay : getAllPets()) {
            System.out.println(petToDisplay.getName() + "|" + petToDisplay.getDescription());
        }
        return "";
    }

    public void tick() {
        for (VirtualPet petToDisplay : pets.values()) {
            petToDisplay.increaseLevels();
        }
    }



}
