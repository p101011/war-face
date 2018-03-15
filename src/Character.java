public class Character {

    //general bio information
    private String name;
    private double height;
    private double weight;
    private String hairColor;
    private String eyeColor;
    private String playerOwner = "NPC";
    private String affiliation;

    //attributes
    private Attribute strength;
    private Attribute body;
    private Attribute reflexes;
    private Attribute dexterity;
    private Attribute intelligence;
    private Attribute willpower;
    private Attribute charisma;
    private Attribute edge;

    private Trait[] traits;

    private Skill[] skills;

    //combat information
    private int health;  // 2x body
    private int stamina;  // 2x will
    private boolean stunned = false;
    private boolean unconcious = false;
    private Weapon[] weapons;
    private Armor[] armor;

    //mobility
    private double walkSpeed;
    private double runSpeed;
    private double sprintSpeed;
    private double crawlSpeed;
    private double climbSpeed;
    private double swimSpeed;
    private double massCarried;

    //history
    private LifeModule[] lifeModules;
    private Item[] inventory;
    private int funds;
    private Vehicle[] vehicles;

    public Character() {
        //totally random character generation!
    }

    public Character(Attribute[] attributes, Trait[] traits, Skill[] skills, String owner) {

    }
}
