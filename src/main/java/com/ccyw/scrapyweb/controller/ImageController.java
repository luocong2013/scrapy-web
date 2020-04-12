package com.ccyw.scrapyweb.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luocong
 * @version 1.0.0
 * @date 2018/6/13 12:22
 */
@RestController
public class ImageController {
    public static void main(String[] args) {
        String result = add("86359823659809124075932547210325723572356", "16359823659809124075932547210325723572356");
        System.out.println(result);
    }

    private static String add(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        if (lenA > lenB) {
            b = StringUtils.leftPad(b, lenA, "0");
        } else {
            a = StringUtils.leftPad(a, lenB, "0");
        }

        int[] arrC = new int[a.length() + 1];

        for (int i = a.length() - 1; i >= 0; i--) {
            int ai = Integer.parseInt(a.charAt(i) + "");
            int bi = Integer.parseInt(b.charAt(i) + "");
            int ci = arrC[i + 1];
            int t = ai + bi + ci;
            arrC[i + 1] = t % 10;
            arrC[i] = t / 10;
        }

        StringBuffer res = new StringBuffer();
        for (int i = 0; i < arrC.length; i++) {
            if (i == 0 && arrC[i] == 0) {
                continue;
            }
            res.append(arrC[i]);
        }
        return res.toString();
    }

    public String add1() {
        return "future 1";
    }
}
