package com.artificialunintelligent.demo.staticExample;

/**
 * @Author: ArtificialUnintelligent
 * @Description:
 * @Date: 11:45 PM 2019/2/26
 */
public class Application {

    int i;

    private static Application go(Application application, int i2){
        i2 = 12;
        application.i = 13;
        return application;
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.i = 11;
        Application application1 = go(application, application.i);
        System.out.println(application1.i);
        System.out.println(application.i);
        System.out.println(application);
        System.out.println(application1);
    }

}
