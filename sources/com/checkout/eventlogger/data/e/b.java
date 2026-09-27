package com.checkout.eventlogger.data.e;

import com.google.gson.annotations.SerializedName;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ace;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class b {

    @SerializedName("productVersion")
    public final String a;

    @SerializedName(ConstantsKt.ENV_FACING_MODE)
    public final String b;

    @SerializedName("appPackageName")
    public final String c;

    @SerializedName("appPackageVersion")
    public final String d;

    @SerializedName("appInstallID")
    public final String e;

    @SerializedName("deviceName")
    public final String f;

    @SerializedName("platform")
    public final String g;

    @SerializedName("osVersion")
    public final String h;

    @SerializedName("event")
    public final Map<String, Object> i;

    public b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, ? extends Object> map) {
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!Intrinsics.areEqual(this.a, bVar.a) || !Intrinsics.areEqual(this.b, bVar.b) || !Intrinsics.areEqual(this.c, bVar.c) || !Intrinsics.areEqual(this.d, bVar.d) || !Intrinsics.areEqual(this.e, bVar.e) || !Intrinsics.areEqual(this.f, bVar.f) || !Intrinsics.areEqual(this.g, bVar.g) || !Intrinsics.areEqual(this.h, bVar.h) || !Intrinsics.areEqual(this.i, bVar.i)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String str = this.a;
        int i9 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i10 = i * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (i10 + i2) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 31;
        String str4 = this.d;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 31;
        String str5 = this.e;
        if (str5 != null) {
            i5 = str5.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 31;
        String str6 = this.f;
        if (str6 != null) {
            i6 = str6.hashCode();
        } else {
            i6 = 0;
        }
        int i15 = (i14 + i6) * 31;
        String str7 = this.g;
        if (str7 != null) {
            i7 = str7.hashCode();
        } else {
            i7 = 0;
        }
        int i16 = (i15 + i7) * 31;
        String str8 = this.h;
        if (str8 != null) {
            i8 = str8.hashCode();
        } else {
            i8 = 0;
        }
        int i17 = (i16 + i8) * 31;
        Map<String, Object> map = this.i;
        if (map != null) {
            i9 = map.hashCode();
        }
        return i17 + i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventDTO(productVersion=");
        sb.append(this.a);
        sb.append(", environment=");
        sb.append(this.b);
        sb.append(", appPackageName=");
        sb.append(this.c);
        sb.append(", appPackageVersion=");
        sb.append(this.d);
        sb.append(", appInstallID=");
        sb.append(this.e);
        sb.append(", deviceName=");
        sb.append(this.f);
        sb.append(", platform=");
        sb.append(this.g);
        sb.append(", osVersion=");
        sb.append(this.h);
        sb.append(", event=");
        return ace.n(sb, this.i, ")");
    }
}
