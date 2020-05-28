package shelter;
/*
 * Mignonne, this is really close to being a passing project!  The VirtualPet class looks good other
 * than a couple notes.
 * - The method `setName()` should be named `getName()`.  Getters and setters use the getSomething and
 *   setSomething naming conventions and it is really confusing to seasoned developers when they are
 *   swapped.  We rarely, if ever, use setters and seeing the setName() method confused me for a moment.
 *   Correcting this would also keep a potential employer from questioning whether you meant for a getter
 *   or a setter.  *** USE THE REFACTOR -> RENAME TOOL TO MAKE THIS CHANGE LESS OF A HEADACHE. ***
 * - The method for get levels has some empty strings ("") in the concatenation.  If you replace them with
 *   the tab character ("\t") or maybe a pipe ("|") you might end up with a more readable status line.
 * - Currently the water method increases thirst whenever it is called.  If this is your intent, disregard,
 *   but I usually equate getting water with lowering my thirst level.
 *
 * That's it for this class, it looks pretty great other than those things above.
 */
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

    public String getName() {
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
        return (hungerLevelString + "|" + thirstLevelString + "|" + happinessLevelString + "");
    }

    public void feed(int hungerLevelNew) {
        hungerLevel = hungerLevel - hungerLevelNew;
    }

    public void water(int thirstLevelNew) {
        thirstLevel = thirstLevel - thirstLevelNew;
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

