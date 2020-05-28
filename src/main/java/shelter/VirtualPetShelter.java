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
        for (VirtualPet petLevels : getAllPets()) {
            System.out.println(petLevels.setName() + petLevels.getDescription()+ "" + petLevels.getLevels());
        }
        return "";
    }

    public void add(VirtualPet pet) {
        pets.put(pet.setName(), pet);
    }

    public VirtualPet findNewPet(String name) {
        return pets.get(name);
    }

    public void adopt(VirtualPet pet) {
        pets.remove(pet.setName(), pet);
    }

    public void feedAllPets() {
        for (VirtualPet petLevels : pets.values()) {
            petLevels.feed(5);
        }
    }

    public void waterAllPets() {
        for (VirtualPet petLevels : pets.values()) {
            petLevels.water(5);
        }
    }

    public void cuddleAllPets() {
        for (VirtualPet petLevels : pets.values()) {
            petLevels.cuddle(15);
        }
    }

    public void cuddleOnePet(String name){
        VirtualPet chosenPet = findNewPet(name);
        chosenPet.cuddle(15);
    }

    public String seeDescription() {
        for (VirtualPet petLevels : getAllPets()) {
            System.out.println(petLevels.setName() + "" + petLevels.getDescription());
        }
        return "";
    }

    public void tick() {
        for (VirtualPet petLevels : pets.values()) {
            petLevels.increaseLevels();
        }
    }


}
