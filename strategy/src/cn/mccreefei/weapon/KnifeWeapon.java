package cn.mccreefei.weapon;

/**
 * Created by Administrator on 2017/3/28.
 */

/**
 * 具体用小刀战斗策略
 */
public class KnifeWeapon implements WeaponBehavior {
    @Override
    public String useWeapon() {
        return "fight with knife";
    }
}
