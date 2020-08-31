package com.simplilearn.test.enums;

public enum StateCode {

    AL(1,"Alabama"),
    AK(2,"Alaska"),
    AZ(3,"Arizona"),
    AR(4,"Arkansas"),
    CA(5,"California"),
    CO(6,"Colorado"),
    CT(7,"Connecticut"),
    DE(8,"Delaware"),
    DC(51,"District of Columbia"),
    FL(9,"Florida"),
    GA(10,"Georgia"),
    GU(53,"Guam"),
    HI(11,"Hawaii"),
    ID(12,"Idaho"),
    IL(13,"Illinois"),
    IN(14,"Indiana"),
    IA(15,"Iowa"),
    KS(16,"Kansas"),
    KY(17,"Kentucky"),
    LA(18,"Louisiana"),
    ME(19,"Maine"),
    MD(20,"Maryland"),
    MA(21,"Massachusetts"),
    MI(22,"Michigan"),
    MN(23,"Minnesota"),
    MS(24,"Mississippi"),
    MO(25,"Missouri"),
    MT(26,"Montana"),
    NE(27,"Nebraska"),
    NV(28, "Nevada"),
    NH(29,"New Hampshire"),
    NJ(30,"New Jersey"),
    NM(31,"New Mexico"),
    NY(32,"New York"),
    NC(33,"North Carolina"),
    ND(34,"North Dakota"),
    OH(35,"Ohio"),
    OK(36,"Oklahoma"),
    OR(37,"Oregon"),
    PA(38,"Pennsylvania"),
    PR(52,"Puerto Rico"),
    RI(39,"Rhode Island"),
    SC(40,"South Carolina"),
    SD(41,"South Dakota"),
    TN(42,"Tennessee"),
    TX(43,"Texas"),
    UT(44,"Utah"),
    VT(45,"Vermont"),
    VA(46,"Virginia"),
    VI(54,"Virgin Islands"),
    WA(47,"Washington"),
    WV(48,"West Virginia"),
    WI(49,"Wisconsin"),
    WY(50,"Wyoming");

    private final Integer id;
    private final String name;

    private StateCode(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public String getAbbreviation(){
        return this.name();
    }

    public static StateCode getStateCode(String value) {
        return StateCode.valueOf(value);
    }
}
