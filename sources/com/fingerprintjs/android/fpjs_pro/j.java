package com.fingerprintjs.android.fpjs_pro;

import defpackage.sv6;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class j {
    public final String a;

    public j(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof j) || !Intrinsics.areEqual(this.a, ((j) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sv6.n("City(name=", this.a, ")");
    }
}
