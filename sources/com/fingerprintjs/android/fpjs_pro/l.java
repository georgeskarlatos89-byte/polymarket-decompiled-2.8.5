package com.fingerprintjs.android.fpjs_pro;

import defpackage.hdi;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class l {
    public final String a;
    public final String b;

    public l(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (!Intrinsics.areEqual(this.a, lVar.a) || !Intrinsics.areEqual(this.b, lVar.b)) {
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
        return hdi.p("Country(code=", this.a, ", name=", this.b, ")");
    }
}
