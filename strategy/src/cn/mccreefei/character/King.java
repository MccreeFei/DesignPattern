package cn.mccreefei.character;

/**
 * Created by Administrator on 2017/3/28.
 */

import cn.mccreefei.weapon.WeaponBehavior;

/**
 * 具体人物国王
 */
public class King implements Character{
    private WeaponBehavior weaponBehavior;
    public King(WeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }

    @Override
    public void fight() {
        System.out.println("King " + weaponBehavior.useWeapon());
    }
}
