package com.checkout.eventlogger.data.e;

import com.google.gson.annotations.SerializedName;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.k84;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class c {

    @SerializedName("specversion")
    public final String a;

    @SerializedName(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID)
    public final String b;

    @SerializedName("type")
    public final String c;

    @SerializedName("source")
    public final String d;

    @SerializedName("time")
    public final String e;

    @SerializedName(ApiConstant.KEY_DATA)
    public final b f;

    @SerializedName("cko")
    public final a g;

    public c(String str, String str2, String str3, String str4, String str5, b bVar, a aVar) {
        k84.p(str, str2, str3, str4, str5);
        bVar.getClass();
        aVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = bVar;
        this.g = aVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (!Intrinsics.areEqual(this.a, cVar.a) || !Intrinsics.areEqual(this.b, cVar.b) || !Intrinsics.areEqual(this.c, cVar.c) || !Intrinsics.areEqual(this.d, cVar.d) || !Intrinsics.areEqual(this.e, cVar.e) || !Intrinsics.areEqual(this.f, cVar.f) || !Intrinsics.areEqual(this.g, cVar.g)) {
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
        String str = this.a;
        int i7 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i8 = i * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 31;
        String str4 = this.d;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 31;
        String str5 = this.e;
        if (str5 != null) {
            i5 = str5.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 31;
        b bVar = this.f;
        if (bVar != null) {
            i6 = bVar.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 31;
        a aVar = this.g;
        if (aVar != null) {
            i7 = aVar.hashCode();
        }
        return i13 + i7;
    }

    public final String toString() {
        return "LoggingCloudEventDTO(specVersion=" + this.a + ", id=" + this.b + ", type=" + this.c + ", source=" + this.d + ", time=" + this.e + ", data=" + this.f + ", cko=" + this.g + ")";
    }
}
