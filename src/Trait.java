public class Trait {

    private int traitPoints;
    private int experience;

    public Trait(int tP, int xp) {
        traitPoints = tP;
        experience = xp;
    }

    public int getTraitPoints() {
        return traitPoints;
    }

    public void setTraitPoints(int traitPoints) {
        this.traitPoints = traitPoints;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public static Trait add(Trait currentTrait, Trait addingTrait) {
        if (currentTrait == null) {
            return addingTrait;
        }
        else {
            int updatedXp = currentTrait.getExperience() + addingTrait.getExperience();
            int traitPoints = currentTrait.getExperience();
            return new Trait(updatedXp, traitPoints);
        }
    }
}
