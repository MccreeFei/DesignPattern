package cn.mccreefei.weapon;

/**
 * Created by Administrator on 2017/3/28.
 */

/**
 * 具体用枪战斗策略
 */
public class GunWeapon implements WeaponBehavior {
    @Override
    public String useWeapon() {
        return "fight with gun";
    }
}
