package com.artificialunintelligent.demo.innerClass;

/**
 * @Author: ArtificialUnintelligent
 * @Description: 成员内部类
 * @Date: 2:41 PM 2019/1/8
 */
public class Body {

    private String arm;
    private String leg;
    private String blood;

    public Body(String arm, String leg, String blood) {
        super();
        this.arm = arm;
        this.leg = leg;
        this.blood = blood;
    }

    //内部类Heart
      class Heart{
        private String name;
        void work() {
            System.out.println("心脏正在给"+arm+leg+"输"+blood);
        }
    }
}
