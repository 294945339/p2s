package com.example.modules.user.domain;

import cn.hutool.core.util.RandomUtil;
import com.example.common.base.domain.BaseDO;
import com.example.common.enums.RaceEnum;
import com.example.common.utils.ChineseNameUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * @author: dj
 * @create: 2019-12-16 16:07
 * @description:
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "user")
public class UserDO extends BaseDO {

    /**
     * 名字
     */
    private String name;

    /**
     * 种族
     */
    private Integer race;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 生命值
     */
    private Integer hp;

    /**
     * 最大血量
     */
    private Integer maxHp;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 剩余生命
     */
    private Integer life;

    /**
     * 智力
     */
    private Integer spirit;

    /**
     * 体力
     */
    private Integer body;

    /**
     * 运气
     */
    private Integer luck;

    /**
     * 位置
     */
    private String areaId;

    /**
     * 目标
     */
    private String target;

    /**
     * 金币
     */
    private Integer money;

    /**
     * 伤害
     */
    private Integer hurt;

    /**
     * 防御
     */
    private Integer defense;

    /**
     * 好坏
     */
    private Integer goodOrBad;

    /**
     * 速度
     */
    private Integer speed;

    /**
     * 经验
     */
    private Integer xp;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 状态 3(重伤),2(消失),1(死亡),0(正常)
     */
    private Integer status;

    /**
     * 所属地方
     */
    private String buildingId;

    /**
     * 地方贡献
     */
    private Integer buildingContribution;

    /**
     * 区域贡献
     */
    private Integer areaContribution;


    /**
     * "arms", "武器"
     * "armor", "护甲"
     * "drug", "药品"
     * "trump", "法宝"
     */
    private String armsId;

    private String armsName;

    private String armorId;

    private String armorName;

    private String trumpId;

    private String trumpName;

    /**
     * 0me,1you
     */
    private Integer type;


    public UserDO() {
        this.name = ChineseNameUtil.getName();
        RaceEnum raceEnum = RaceEnum.getEnum(RandomUtil.randomInt(1, 4));
        if (null == raceEnum) {
            raceEnum = RaceEnum.human;
        }
        this.race = raceEnum.getId();
        this.sex = RandomUtil.randomInt(1, 2);
        int maxHp = RandomUtil.randomInt(raceEnum.getMinHp(), raceEnum.getMaxHp());
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.age = RandomUtil.randomInt(1, 19);
        this.life = RandomUtil.randomInt(raceEnum.getMinLife(), raceEnum.getMaxLife());
        this.spirit = RandomUtil.randomInt(1, 100);
        this.body = RandomUtil.randomInt(1, 100);
        this.luck = RandomUtil.randomInt(1, 60);
        this.areaId = RandomUtil.randomInt(1, 10) + "";
        this.money = RandomUtil.randomInt(100, 1000);

        this.goodOrBad = 0;
        this.speed = this.body / 2;
        this.level = 0;
        this.status = 0;

        this.xp = 0;
        this.hurt = this.body / 3;
        this.defense = this.body / 4;
        this.type = 1;

        this.buildingContribution = 0;
        this.areaContribution = 0;
    }

}
