package com.appsflyer.internal;

import defpackage.p3;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFd1pSDK {
    public static final String AFAdRevenueData(String str) {
        str.getClass();
        return "[Exception Manager]: " + str;
    }

    public static final Pair<Integer, Integer> getCurrencyIso4217Code(String str) {
        Integer num;
        Integer num2;
        Integer num3;
        String str2;
        String str3;
        String str4;
        str.getClass();
        kotlin.text.b c = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").c(str);
        if (c != null) {
            p3 p3Var = c.c;
            MatchGroup a = p3Var.a(1);
            if (a != null && (str4 = a.a) != null) {
                num = StringsKt.toIntOrNull(str4);
            } else {
                num = null;
            }
            MatchGroup a2 = p3Var.a(3);
            if (a2 != null && (str3 = a2.a) != null) {
                num2 = StringsKt.toIntOrNull(str3);
            } else {
                num2 = null;
            }
            MatchGroup a3 = p3Var.a(4);
            if (a3 != null && (str2 = a3.a) != null) {
                num3 = StringsKt.toIntOrNull(str2);
            } else {
                num3 = null;
            }
            if (num != null) {
                return new Pair<>(Integer.valueOf(num.intValue() * 1000000), Integer.valueOf(((num.intValue() + 1) * 1000000) - 1));
            }
            if (num2 != null && num3 != null) {
                return new Pair<>(Integer.valueOf((num3.intValue() * 1000) + (num2.intValue() * 1000000)), Integer.valueOf((((num3.intValue() + 1) * 1000) + (num2.intValue() * 1000000)) - 1));
            }
        }
        return null;
    }

    public static final Pair<Integer, Integer> getMediationNetwork(String str) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        str.getClass();
        kotlin.text.b c = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").c(str);
        if (c != null) {
            p3 p3Var = c.c;
            MatchGroup a = p3Var.a(1);
            if (a != null && (str7 = a.a) != null) {
                num = StringsKt.toIntOrNull(str7);
            } else {
                num = null;
            }
            MatchGroup a2 = p3Var.a(2);
            if (a2 != null && (str6 = a2.a) != null) {
                num2 = StringsKt.toIntOrNull(str6);
            } else {
                num2 = null;
            }
            MatchGroup a3 = p3Var.a(3);
            if (a3 != null && (str5 = a3.a) != null) {
                num3 = StringsKt.toIntOrNull(str5);
            } else {
                num3 = null;
            }
            MatchGroup a4 = p3Var.a(4);
            if (a4 != null && (str4 = a4.a) != null) {
                num4 = StringsKt.toIntOrNull(str4);
            } else {
                num4 = null;
            }
            MatchGroup a5 = p3Var.a(5);
            if (a5 != null && (str3 = a5.a) != null) {
                num5 = StringsKt.toIntOrNull(str3);
            } else {
                num5 = null;
            }
            MatchGroup a6 = p3Var.a(6);
            if (a6 != null && (str2 = a6.a) != null) {
                num6 = StringsKt.toIntOrNull(str2);
            } else {
                num6 = null;
            }
            Integer num7 = num6;
            if (getRevenue(num, num2, num3, num4, num5, num6)) {
                num.getClass();
                int intValue = num.intValue() * 1000000;
                num2.getClass();
                int intValue2 = (num2.intValue() * 1000) + intValue;
                num3.getClass();
                Integer valueOf = Integer.valueOf(num3.intValue() + intValue2);
                num4.getClass();
                int intValue3 = num4.intValue() * 1000000;
                num5.getClass();
                int intValue4 = (num5.intValue() * 1000) + intValue3;
                num7.getClass();
                return new Pair<>(valueOf, Integer.valueOf(num7.intValue() + intValue4));
            }
        }
        return null;
    }

    private static boolean getRevenue(Object... objArr) {
        objArr.getClass();
        if (!ArraysKt.i(null, objArr)) {
            return true;
        }
        return false;
    }

    public static final String getMediationNetwork(String str, String str2) {
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
