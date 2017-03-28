package cn.mccreefei;

import cn.mccreefei.character.Character;
import cn.mccreefei.character.King;
import cn.mccreefei.character.Soldier;
import cn.mccreefei.weapon.GunWeapon;
import cn.mccreefei.weapon.KnifeWeapon;

/**
 * Created by Administrator on 2017/3/28.
 */
public class Main {
    public static void main(String[] args) {
        Character king = new King(new GunWeapon());
        king.fight();

        Character soldier = new Soldier(new KnifeWeapon());
        soldier.fight();
    }
}
