package com.socure.docv.capturesdk.models;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class m {
    public final x0 a;
    public final String b;
    public final boolean c;
    public final k d;

    public m(x0 x0Var, String str, boolean z, k kVar) {
        x0Var.getClass();
        str.getClass();
        kVar.getClass();
        this.a = x0Var;
        this.b = str;
        this.c = z;
        this.d = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (Intrinsics.areEqual(this.a, mVar.a) && Intrinsics.areEqual(this.b, mVar.b) && this.c == mVar.c && Intrinsics.areEqual(this.d, mVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + com.socure.docv.capturesdk.api.b.a(this.c, com.socure.docv.capturesdk.api.a.a(this.b, this.a.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "CustomizationModel(theme=" + this.a + ", logo=" + this.b + ", isLogoCustomized=" + this.c + ", config=" + this.d + ")";
    }
}
