package com.company.Service;

public abstract class Character {
    private WeaponBehaviour weapon;

    public Character() {
    }

    public void setWeapon(WeaponBehaviour w) {
        weapon = w;
    }

    public void fight(){
        weapon.useWeapon();
    }
}
