public class Weapon {

    private String scale;  // is this heavy weaponry, or handheld?
    private boolean ranged;  // can this weapon be used at a distance (non-melee)
    private char damageType;
    private int armorPierce;
    private int baseDamage;

    public Weapon(String weaponClass, boolean isRanged, char damageType, int pierce, int damage) {
        scale = weaponClass;
        ranged = isRanged;
        this.damageType = damageType;
        armorPierce = pierce;
        baseDamage = damage;
    }

}
