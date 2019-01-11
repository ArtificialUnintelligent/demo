package com.artificialunintelligent.demo.reference;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 * @Author: ArtificialUnintelligent
 * @Description:
 * @Date: 10:45 AM 2018/12/26
 */
public class ReferenceDemo {

    public static void main(String[] args) {
        ReferenceQueue<String> queue = new ReferenceQueue<>();

        String s = "aaaa";
        WeakReference<String> reference = new WeakReference<>(s, queue);
        System.out.println(reference);

        System.gc();

        Reference reference1 = null;
        try {
            reference1 = queue.remove();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(reference1);
    }

}
