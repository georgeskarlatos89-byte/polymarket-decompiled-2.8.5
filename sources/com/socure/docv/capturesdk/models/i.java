package com.socure.docv.capturesdk.models;

import defpackage.k84;
import defpackage.m51;
import defpackage.woa;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class i {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i) {
                i iVar = (i) obj;
                if (!Intrinsics.areEqual(this.a, iVar.a) || !Intrinsics.areEqual(this.b, iVar.b) || !Intrinsics.areEqual(this.c, iVar.c) || !Intrinsics.areEqual(this.d, iVar.d) || !Intrinsics.areEqual(this.e, iVar.e) || !Intrinsics.areEqual(this.f, iVar.f) || !Intrinsics.areEqual(this.g, iVar.g) || !Intrinsics.areEqual(this.h, iVar.h) || !Intrinsics.areEqual(this.i, iVar.i)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.i.hashCode() + com.socure.docv.capturesdk.api.a.a(this.h, com.socure.docv.capturesdk.api.a.a(this.g, com.socure.docv.capturesdk.api.a.a(this.f, com.socure.docv.capturesdk.api.a.a(this.e, com.socure.docv.capturesdk.api.a.a(this.d, com.socure.docv.capturesdk.api.a.a(this.c, com.socure.docv.capturesdk.api.a.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder r = m51.r("ButtonStyleModel(color=", this.a, ", backgroundColor=", this.b, ", fontSize=");
        k84.q(r, this.c, ", fontWeight=", this.d, ", borderRadius=");
        k84.q(r, this.e, ", borderColor=", this.f, ", borderWidth=");
        k84.q(r, this.g, ", shadow=", this.h, ", width=");
        return woa.r(r, this.i, ")");
    }
}
