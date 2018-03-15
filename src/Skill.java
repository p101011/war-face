public class Skill {

    private int level;
    private String[] linkedAttributes;
    private int targetNumber;
    private char complexity;
    private int experience;
    private String subSkill = "";
    private String specialties = "";

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String[] getLinkedAttributes() {
        return linkedAttributes;
    }

    public void setLinkedAttributes(String[] linkedAttributes) {
        this.linkedAttributes = linkedAttributes;
    }

    public int getTargetNumber() {
        return targetNumber;
    }

    public void setTargetNumber(int targetNumber) {
        this.targetNumber = targetNumber;
    }

    public char getComplexity() {
        return complexity;
    }

    public void setComplexity(char complexity) {
        this.complexity = complexity;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getSubSkill() {
        return subSkill;
    }

    public void setSubSkill(String subSkill) {
        this.subSkill = subSkill;
    }

    public String getSpecialties() {
        return specialties;
    }

    public void setSpecialties(String specialties) {
        this.specialties = specialties;
    }

    public Skill(int level, String[] linkedAttributes, int targetNumber, char complexity, int experience) {
        this.level = level;
        this.linkedAttributes = linkedAttributes;
        this.targetNumber = targetNumber;
        this.complexity = complexity;
        this.experience = experience;
    }
}
