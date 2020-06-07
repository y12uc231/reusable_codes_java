package leetcode.comp1922;

import java.util.Stack;


public class Sol1 {


    public  static  void  main(String[] args) {
        BrowserHistory br = new BrowserHistory("leetcode.com");
        br.visit("leetcode.com");
        br.visit("google.com");
        br.visit("facebook.com");
        br.visit("youtube.com");

        System.out.println(br.back(1));
        System.out.println(br.back(1));
    }


}
