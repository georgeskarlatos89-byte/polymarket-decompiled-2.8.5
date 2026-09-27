package com.socure.docv.capturesdk.models;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class w0 {
    public final String a;
    public final c0 b;
    public final x c;

    public w0(String str, c0 c0Var, x xVar) {
        str.getClass();
        c0Var.getClass();
        xVar.getClass();
        this.a = str;
        this.b = c0Var;
        this.c = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (Intrinsics.areEqual(this.a, w0Var.a) && Intrinsics.areEqual(this.b, w0Var.b) && Intrinsics.areEqual(this.c, w0Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "StartSessionModel(sessionToken=" + this.a + ", nextModule=" + this.b + ", globalConfig=" + this.c + ")";
    }
}
