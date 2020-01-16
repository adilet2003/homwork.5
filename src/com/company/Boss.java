package com.company;

public class Boss {
    private int bossHeelth = 500 ;
    private int bossDamage = 50 ;
    private String bossDefensType  ;

    public String getBossDefensType() {
        return bossDefensType;
    }

    public void setBossDefensType(String bossDefensType) {
        this.bossDefensType = bossDefensType;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public int getBossHeelth() {
        return bossHeelth;
    }

    public void setBossHeelth(int bossHeelth) {
        this.bossHeelth = bossHeelth;
    }
}
