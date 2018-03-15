public class Armor {

    private String armorType;
    private String armorLocation;
    private String armorName;
    private int[] damageResist;

    public String getArmorType() {
        return armorType;
    }

    public String getArmorLocation() {
        return armorLocation;
    }

    public void setArmorLocation(String armorLocation) {
        this.armorLocation = armorLocation;
    }

    public String getArmorName() {
        return armorName;
    }

    public int[] getDamageResist() {
        return damageResist;
    }

    public void setDamageResist(int[] damageResist) {
        this.damageResist = damageResist;
    }

    public Armor(String name, String location, String type, int[] barValues) {
        armorLocation = location;
        armorName = name;
        armorType = type;
        damageResist = barValues;
    }
}
