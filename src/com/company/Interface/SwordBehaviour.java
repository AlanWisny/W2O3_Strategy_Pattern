package com.company.Interface;

import com.company.Service.WeaponBehaviour;

public class SwordBehaviour implements WeaponBehaviour {

    @Override
    public void useWeapon() {
        System.out.println("You swing your mighty Axe!");
    }
}
