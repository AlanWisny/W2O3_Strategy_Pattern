package com.company;

import com.company.Interface.*;
import com.company.Service.*;
import com.company.Service.Character;

public class Main {

    public static void main(String[] args) {
        Character K = new King();
        WeaponBehaviour S = new SwordBehaviour();
        K.setWeapon(S);
        K.fight();

        Character Q = new Queen();
        WeaponBehaviour D = new KnifeBehaviour();
        Q.setWeapon(D);
        Q.fight();

        Q.setWeapon(S);
        Q.fight();
    }
}
