package com.appsflyer.internal;

import android.util.Base64;
import defpackage.m51;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0012\u001a\u00020\u00068\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018"}, d2 = {"Lcom/appsflyer/internal/AFc1bSDK;", "", "", "p0", "p1", "p2", "", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lorg/json/JSONObject;", "getMonetizationNetwork", "()Lorg/json/JSONObject;", "getRevenue", "()Ljava/lang/String;", "toString", "AFAdRevenueData", "I", "getMediationNetwork", "Ljava/lang/String;", "AFa1tSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AFc1bSDK {

    /* renamed from: AFa1tSDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    int getRevenue;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    final String getMonetizationNetwork;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    public String AFAdRevenueData;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    public String getMediationNetwork;

    public AFc1bSDK(String str, String str2, String str3, int i) {
        com.fingerprintjs.android.fpjs_pro.g.x(str, str2, str3);
        this.getMediationNetwork = str;
        this.getMonetizationNetwork = str2;
        this.AFAdRevenueData = str3;
        this.getRevenue = i;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AFc1bSDK)) {
            return false;
        }
        AFc1bSDK aFc1bSDK = (AFc1bSDK) p0;
        if (Intrinsics.areEqual(this.getMediationNetwork, aFc1bSDK.getMediationNetwork) && Intrinsics.areEqual(this.getMonetizationNetwork, aFc1bSDK.getMonetizationNetwork) && Intrinsics.areEqual(this.AFAdRevenueData, aFc1bSDK.AFAdRevenueData) && this.getRevenue == aFc1bSDK.getRevenue) {
            return true;
        }
        return false;
    }

    public final JSONObject getMonetizationNetwork() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.getMediationNetwork);
        jSONObject.put("hash_name", this.getMonetizationNetwork);
        jSONObject.put("st", this.AFAdRevenueData);
        jSONObject.put("c", String.valueOf(this.getRevenue));
        return jSONObject;
    }

    public final String getRevenue() {
        String str = this.getMediationNetwork;
        str.getClass();
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        String encodeToString = Base64.encodeToString(bytes, 2);
        String str2 = this.getMonetizationNetwork;
        str2.getClass();
        byte[] bytes2 = str2.getBytes(charset);
        bytes2.getClass();
        String encodeToString2 = Base64.encodeToString(bytes2, 2);
        String str3 = this.AFAdRevenueData;
        str3.getClass();
        byte[] bytes3 = str3.getBytes(charset);
        bytes3.getClass();
        String encodeToString3 = Base64.encodeToString(bytes3, 2);
        int i = this.getRevenue;
        StringBuilder r = m51.r("label=", encodeToString, "\nhashName=", encodeToString2, "\nstackTrace=");
        r.append(encodeToString3);
        r.append("\nc=");
        r.append(i);
        return r.toString();
    }

    public final int hashCode() {
        return Integer.hashCode(this.getRevenue) + ((this.AFAdRevenueData.hashCode() + ((this.getMonetizationNetwork.hashCode() + (this.getMediationNetwork.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str = this.getMediationNetwork;
        String str2 = this.getMonetizationNetwork;
        String str3 = this.AFAdRevenueData;
        int i = this.getRevenue;
        StringBuilder r = m51.r("ExceptionInfo(label=", str, ", hashName=", str2, ", stackTrace=");
        r.append(str3);
        r.append(", counter=");
        r.append(i);
        r.append(")");
        return r.toString();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\r\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFc1bSDK$AFa1tSDK;", "", "<init>", "()V", "", "p0", "", "", "p1", "", "getMediationNetwork", "(Ljava/lang/Integer;[Ljava/lang/String;)Z", "Lcom/appsflyer/internal/AFc1bSDK;", "AFAdRevenueData", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFc1bSDK;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFc1bSDK$AFa1tSDK, reason: from kotlin metadata */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public static AFc1bSDK AFAdRevenueData(String p0) {
            p0.getClass();
            List<String> d0 = StringsKt.d0(p0, new String[]{"\n"}, false, 0, 6);
            if (d0.size() == 4) {
                String str = null;
                String str2 = null;
                String str3 = null;
                Integer num = null;
                for (String str4 : d0) {
                    if (kotlin.text.e.u(str4, "label=", false)) {
                        str = AFAdRevenueData(str4, "label=");
                    } else if (kotlin.text.e.u(str4, "hashName=", false)) {
                        str2 = AFAdRevenueData(str4, "hashName=");
                    } else if (kotlin.text.e.u(str4, "stackTrace=", false)) {
                        str3 = AFAdRevenueData(str4, "stackTrace=");
                    } else {
                        if (!kotlin.text.e.u(str4, "c=", false)) {
                            break;
                        }
                        num = Integer.valueOf(Integer.parseInt(StringsKt.s0(str4.substring(2)).toString()));
                    }
                }
                if (!getMediationNetwork(num, str, str2, str3)) {
                    str.getClass();
                    str2.getClass();
                    str3.getClass();
                    num.getClass();
                    return new AFc1bSDK(str, str2, str3, num.intValue());
                }
            }
            return null;
        }

        private static boolean getMediationNetwork(Integer p0, String... p1) {
            boolean z;
            if (p0 == null) {
                z = true;
            } else {
                z = false;
            }
            int length = p1.length;
            for (int i = 0; i < 3; i++) {
                String str = p1[i];
                if (!z && str != null && str.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
            }
            return z;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static String AFAdRevenueData(String str, String str2) {
            String obj = StringsKt.s0(str.substring(str2.length())).toString();
            obj.getClass();
            Charset charset = Charsets.UTF_8;
            byte[] bytes = obj.getBytes(charset);
            bytes.getClass();
            bytes.getClass();
            byte[] decode = Base64.decode(bytes, 2);
            decode.getClass();
            return new String(decode, charset);
        }
    }

    public /* synthetic */ AFc1bSDK(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? 1 : i);
    }
}
