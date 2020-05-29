package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    Map<String, VirtualPet> pets = new HashMap<>();

    public Collection<VirtualPet> getAllPets() {
        return pets.values();
    }

    public String showPets() {
        String namesAndDescriptions = "";
        for (VirtualPet  petToDisplay : getAllPets()){
            namesAndDescriptions += petToDisplay.getName() + petToDisplay.getDescription() + petToDisplay.getLevels() +"\n";
        }
        return namesAndDescriptions;
    }

    public void add(VirtualPet pet) {
        pets.put(pet.getName(), pet);
    }

    public VirtualPet findNewPet(String name) {
        return pets.get(name);
    }

    public void adopt(VirtualPet pet) {
        pets.remove(pet.getName());
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

    public void cuddleOnePet(String name) {
        VirtualPet chosenPet = findNewPet(name);
        chosenPet.cuddle(15);
    }

    public String seeDescription() {
        for (VirtualPet petToDisplay : getAllPets()) {
            System.out.println(petToDisplay.getName() + "" + petToDisplay.getDescription());
        }
        return "";
    }

    public void tick() {
        for (VirtualPet petToDisplay : pets.values()) {
            petToDisplay.increaseLevels();
        }
    }


}
