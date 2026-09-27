package com.appsflyer.internal;

import defpackage.p3;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFj1aSDK {
    public static final int AFAdRevenueData(String str) {
        int i;
        int i2;
        String str2;
        Integer intOrNull;
        String str3;
        Integer intOrNull2;
        String str4;
        Integer intOrNull3;
        str.getClass();
        kotlin.text.b c = new Regex("(\\d+).(\\d+).(\\d+).*").c(str);
        if (c != null) {
            p3 p3Var = c.c;
            MatchGroup a = p3Var.a(1);
            int i3 = 0;
            if (a != null && (str4 = a.a) != null && (intOrNull3 = StringsKt.toIntOrNull(str4)) != null) {
                i = intOrNull3.intValue();
            } else {
                i = 0;
            }
            int i4 = i * 1000000;
            MatchGroup a2 = p3Var.a(2);
            if (a2 != null && (str3 = a2.a) != null && (intOrNull2 = StringsKt.toIntOrNull(str3)) != null) {
                i2 = intOrNull2.intValue();
            } else {
                i2 = 0;
            }
            int i5 = (i2 * 1000) + i4;
            MatchGroup a3 = p3Var.a(3);
            if (a3 != null && (str2 = a3.a) != null && (intOrNull = StringsKt.toIntOrNull(str2)) != null) {
                i3 = intOrNull.intValue();
            }
            return i5 + i3;
        }
        return -1;
    }

    public static final String AFAdRevenueData(String str, String str2) {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        byte[] digest = messageDigest.digest(bytes);
        digest.getClass();
        String str3 = "";
        for (byte b : digest) {
            str3 = str3.concat(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
        }
        return str3;
    }
}
