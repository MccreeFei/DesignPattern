package cn.mccreefei.character;

import cn.mccreefei.weapon.WeaponBehavior;

/**
 * Created by Administrator on 2017/3/28.
 */

/**
 * 具体人物士兵
 */
public class Soldier implements Character {
    private WeaponBehavior weaponBehavior;
    public Soldier(WeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }
    @Override
    public void fight() {
        System.out.println("Soldier " + weaponBehavior.useWeapon());
    }
}
