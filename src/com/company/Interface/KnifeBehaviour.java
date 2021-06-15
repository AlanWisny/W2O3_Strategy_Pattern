package com.company.Interface;

import com.company.Service.WeaponBehaviour;

public class KnifeBehaviour implements WeaponBehaviour{

    @Override
    public void useWeapon() {
        System.out.println("You stab with your pointy Knife!");
    }
}
