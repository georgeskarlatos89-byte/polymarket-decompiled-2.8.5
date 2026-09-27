package com.socure.docv.capturesdk.models;

import defpackage.k84;
import defpackage.m51;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class j0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final h e;
    public final String f;
    public final String g;
    public final String h;
    public final a0 i;

    public j0(String str, String str2, String str3, String str4, h hVar, String str5, String str6, String str7, a0 a0Var) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        hVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = hVar;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j0) {
                j0 j0Var = (j0) obj;
                if (!Intrinsics.areEqual(this.a, j0Var.a) || !Intrinsics.areEqual(this.b, j0Var.b) || !Intrinsics.areEqual(this.c, j0Var.c) || !Intrinsics.areEqual(this.d, j0Var.d) || !Intrinsics.areEqual(this.e, j0Var.e) || !Intrinsics.areEqual(this.f, j0Var.f) || !Intrinsics.areEqual(this.g, j0Var.g) || !Intrinsics.areEqual(this.h, j0Var.h) || !Intrinsics.areEqual(this.i, j0Var.i)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.i.hashCode() + com.socure.docv.capturesdk.api.a.a(this.h, com.socure.docv.capturesdk.api.a.a(this.g, com.socure.docv.capturesdk.api.a.a(this.f, (this.e.hashCode() + com.socure.docv.capturesdk.api.a.a(this.d, com.socure.docv.capturesdk.api.a.a(this.c, com.socure.docv.capturesdk.api.a.a(this.b, this.a.hashCode() * 31, 31), 31), 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder r = m51.r("PrimaryModel(color=", this.a, ", backgroundColor=", this.b, ", boundingBoxColor=");
        k84.q(r, this.c, ", fontFamily=", this.d, ", button=");
        r.append(this.e);
        r.append(", progressBarColor=");
        r.append(this.f);
        r.append(", imageThemeColor=");
        k84.q(r, this.g, ", captureSuccessColor=", this.h, ", icon=");
        r.append(this.i);
        r.append(")");
        return r.toString();
    }
}
