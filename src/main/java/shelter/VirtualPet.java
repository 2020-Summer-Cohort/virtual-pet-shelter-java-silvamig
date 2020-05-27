package shelter;

public class VirtualPet {

    private String name;
    private String description;
    private int hungerLevel;
    private int thirstLevel;
    private int happinessLevel;

    public VirtualPet(String name, String description, int hungerLevel, int thirstLevel, int happinessLevel) {
        this.name = name;
        this.description = description;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.happinessLevel = happinessLevel;
    }

    public String setName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public String getLevels() {
        String hungerLevelString = String.valueOf(hungerLevel);
        String thirstLevelString = String.valueOf(thirstLevel);
        String happinessLevelString = String.valueOf(happinessLevel);
        return (hungerLevelString + "" + thirstLevelString + "" + happinessLevelString + "");
    }

    public void feed(int hungerLevelNew) {
        hungerLevel = hungerLevel - hungerLevelNew;
    }

    public void water(int thirstLevelNew) {
        thirstLevel = thirstLevel + thirstLevelNew;
    }

    public void cuddle(int happinessLevelNew) {
        happinessLevel = happinessLevel + happinessLevelNew;
    }

    public void increaseLevels() {
        hungerLevel = hungerLevel + 10;
        thirstLevel = thirstLevel + 10;
        happinessLevel = happinessLevel - 3;
    }


}

