package com.fingerprintjs.android.fpjs_pro;

import defpackage.hdi;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class k {
    public final String a;
    public final String b;

    public k(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k) {
                k kVar = (k) obj;
                if (!Intrinsics.areEqual(this.a, kVar.a) || !Intrinsics.areEqual(this.b, kVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hdi.p("Continent(code=", this.a, ", name=", this.b, ")");
    }
}
