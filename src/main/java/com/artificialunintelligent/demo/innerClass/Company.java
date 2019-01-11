package com.artificialunintelligent.demo.innerClass;

/**
 * @Author: ArtificialUnintelligent
 * @Description:
 * @Date: 3:05 PM 2019/1/8
 */
public class Company {

    String companyName;

    static String country;

    static class Staff{

        String name;

        public Staff(){

        }

        public Staff(String name){
            super();
            this.name = name;
        }

        public void work(String name){
            String companyName = new Company().companyName = "联想";
            country = "china";
            System.out.println(name + "在" + companyName + "工作，该公司在" + country);
        }
    }

}
