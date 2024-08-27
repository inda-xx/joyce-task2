class Indamon {

  // Indamon fields
  private String name;
  private int hp;
  private int attack;
  private int defense;
  private boolean fainted;

  // Indamon getters
  public String getName() {
    return this.name;
  }
  public int getHp() {
    return this.hp;
  }
  public int getAttack() {
    return this.attack;
  }
  public int getDefense() {
    return this.defense;
  }
  public boolean isFainted() {
    return this.fainted;
  }

  // Indamon setters
  public void setName(String name) {
    this.name = name;
  }
  public void setHp(int hp) {
    this.hp = hp;
  }
  public void setAttack(int attack) {
    this.attack = attack;
  }
  public void setDefense(int defense) {
    this.defense = defense;
  }
  public void setFainted(boolean fainted) {
    this.fainted = fainted;
  }

  // Indamon constructor
  public Indamon(String name, int hp, int attack, int defense, boolean fainted) {
    this.name = name;
    this.hp = hp;
    this.attack = attack;
    this.defense = defense;
    this.fainted = fainted;    
  }

  // prints info about an Indamon
  public void printInfo() {
    System.out.println("INFO");
    System.out.println("Name: " + this.getName());
    System.out.println("Hp: " + this.getHp());
    System.out.println("Attack: " + this.getAttack());
    System.out.println("Defense: " + this.getDefense());
    System.out.println("Fainted: " + this.isFainted());
  } 

  // attacks a given Indamon
  public void attack(Indamon victim) {
    // only allows living indamon to attack
    if (this.isFainted() == false) {
      // removes hp from victim based on attack of attacker and defense on victim
      victim.setHp(
        victim.getHp() - this.getAttack() / victim.getDefense()
      );

      // sets victim as fainted if hp <= 0
      if (victim.getHp() <= 0) {
        victim.setFainted(true);
      }
    }
  }

  public static void main(String[] args) {
    Indamon glassey = new Indamon("Glassey", 10, 5, 5, false);
    Indamon glassey2 = new Indamon("Glassey2", 11, 6, 7, false);
    Indamon vilmer = new Indamon("Vilmer", 99, 99, 99, false);

    // check if things work
    glassey.printInfo();
    vilmer.attack(glassey);
    glassey.printInfo();
  }
}
