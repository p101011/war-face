public class Attribute {

    private int score;
    private int linkMod;
    private int experience;

    public Attribute(int newScore, int newLinkMod, int newXp) {
        score = newScore;
        linkMod = newLinkMod;
        experience = newXp;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLinkMod() {
        return linkMod;
    }

    public void setLinkMod(int linkMod) {
        this.linkMod = linkMod;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
