package com.fingerprintjs.android.fpjs_pro_internal;

import defpackage.woa;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vD14832N6715<V> extends D8871 {
    public final V component5;

    public vD14832N6715(V v) {
        super(null);
        this.component5 = v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vD14832N6715.class == obj.getClass() && Intrinsics.areEqual(this.component5, ((vD14832N6715) obj).component5)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        V v = this.component5;
        if (v != null) {
            return v.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return woa.o("Ok(", this.component5, ")");
    }
}
