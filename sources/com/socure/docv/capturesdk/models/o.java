package com.socure.docv.capturesdk.models;

import defpackage.k84;
import defpackage.m51;
import defpackage.woa;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class o {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public o(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o) {
                o oVar = (o) obj;
                if (!Intrinsics.areEqual(this.a, oVar.a) || !Intrinsics.areEqual(this.b, oVar.b) || !Intrinsics.areEqual(this.c, oVar.c) || !Intrinsics.areEqual(this.d, oVar.d) || !Intrinsics.areEqual(this.e, oVar.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + com.socure.docv.capturesdk.api.a.a(this.d, com.socure.docv.capturesdk.api.a.a(this.c, com.socure.docv.capturesdk.api.a.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder r = m51.r("ErrorLabelsModel(desktop=", this.a, ", captureTypeNotSupported=", this.b, ", minimumResolution=");
        k84.q(r, this.c, ", cameraPermission=", this.d, ", unknown=");
        return woa.r(r, this.e, ")");
    }
}
