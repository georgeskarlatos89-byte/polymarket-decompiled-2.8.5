package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import defpackage.lwg;
import defpackage.ny4;
import defpackage.zc7;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFc1rSDK {
    public String AFAdRevenueData;
    private byte[] component3;
    public Map<String, String> getCurrencyIso4217Code;
    String getMediationNetwork;
    public AFe1lSDK getMonetizationNetwork;
    public String getRevenue;

    public AFc1rSDK(char[] cArr) {
        String nextLine;
        Map<String, String> map;
        String obj;
        Scanner scanner = new Scanner(new String(cArr));
        while (scanner.hasNextLine()) {
            try {
                nextLine = scanner.nextLine();
            } catch (Throwable th) {
                try {
                    scanner.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
            if (nextLine.startsWith("url=")) {
                this.getRevenue = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.getMediationNetwork = nextLine.substring(8).trim();
            } else {
                if (nextLine.startsWith("headers=")) {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(Base64.decode(nextLine.substring(8).trim(), 2), Charset.defaultCharset()));
                        if (jSONObject.length() == 0) {
                            map = zc7.a;
                            map.getClass();
                        } else {
                            Iterator<String> keys = jSONObject.keys();
                            keys.getClass();
                            ny4 b = lwg.b(keys);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Iterator it = b.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                Object obj2 = jSONObject.get((String) next);
                                if (Intrinsics.areEqual(obj2, JSONObject.NULL)) {
                                    obj = "null";
                                } else {
                                    obj = obj2.toString();
                                }
                                linkedHashMap.put(next, obj);
                            }
                            map = linkedHashMap;
                        }
                        this.getCurrencyIso4217Code = map;
                    } catch (Exception e) {
                        AFLogger.INSTANCE.e(AFg1cSDK.CACHE, "Error parsing headers", e);
                        this.getCurrencyIso4217Code = new HashMap();
                    }
                } else if (nextLine.startsWith("data=")) {
                    this.component3 = Base64.decode(nextLine.substring(5).trim(), 2);
                } else if (nextLine.startsWith("type=")) {
                    String trim = nextLine.substring(5).trim();
                    try {
                        this.getMonetizationNetwork = AFe1lSDK.valueOf(trim);
                    } catch (Exception e2) {
                        AFLogger.INSTANCE.e(AFg1cSDK.CACHE, "Unknown task type: ".concat(String.valueOf(trim)), e2);
                    }
                }
                scanner.close();
                throw th;
            }
        }
        scanner.close();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AFc1rSDK.class == obj.getClass()) {
            AFc1rSDK aFc1rSDK = (AFc1rSDK) obj;
            if (Objects.equals(this.getMediationNetwork, aFc1rSDK.getMediationNetwork) && Arrays.equals(this.component3, aFc1rSDK.component3) && Objects.equals(this.getRevenue, aFc1rSDK.getRevenue) && Objects.equals(this.AFAdRevenueData, aFc1rSDK.AFAdRevenueData) && Objects.equals(this.getCurrencyIso4217Code, aFc1rSDK.getCurrencyIso4217Code) && this.getMonetizationNetwork == aFc1rSDK.getMonetizationNetwork) {
                return true;
            }
        }
        return false;
    }

    public final byte[] getCurrencyIso4217Code() {
        return this.component3;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.getMediationNetwork;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode = (Arrays.hashCode(this.component3) + (i * 31)) * 31;
        String str2 = this.getRevenue;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 31;
        String str3 = this.AFAdRevenueData;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        AFe1lSDK aFe1lSDK = this.getMonetizationNetwork;
        if (aFe1lSDK != null) {
            i4 = aFe1lSDK.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = (i7 + i4) * 31;
        Map<String, String> map = this.getCurrencyIso4217Code;
        if (map != null) {
            i5 = map.hashCode();
        }
        return i8 + i5;
    }

    public AFc1rSDK(String str, byte[] bArr, String str2, AFe1lSDK aFe1lSDK, Map<String, String> map) {
        this.getRevenue = str;
        this.component3 = bArr;
        this.getMediationNetwork = str2;
        this.getMonetizationNetwork = aFe1lSDK;
        this.getCurrencyIso4217Code = map;
    }
}
