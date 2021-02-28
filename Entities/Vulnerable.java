package Entities;

public class Vulnerable {
    public short health = 1;
    public short maxHealth = health;
    public short takenDamage = 0;
    public short healedDamage = 0;

    public void damage(short dam){
        health -= dam;
        takenDamage += dam;
    }

    public void heal(short hel){
        health += hel;
        healedDamage += hel;
        if (health > maxHealth){
            health = maxHealth;
        }
    }

    public void setMaxHealth(short maxHealth) {
        this.maxHealth = maxHealth;
    }

    public boolean isDead(){
        if (health <= 0){
            return true;
        }
        else{
            return false;
        }
    }
}
