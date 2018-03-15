public class RangedWeapon extends Weapon {

    private String[] specialEffects;


    public RangedWeapon(String weaponClass, boolean isRanged, char damageType, int pierce, int damage) {
        super(weaponClass, isRanged, damageType, pierce, damage);
    }
}
