package com.fingerprintjs.android.fpjs_pro_internal;

import defpackage.woa;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class setPivotYN16904<E> extends D8871 {
    public final E D8871;

    public setPivotYN16904(E e) {
        super(null);
        this.D8871 = e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && setPivotYN16904.class == obj.getClass() && Intrinsics.areEqual(this.D8871, ((setPivotYN16904) obj).D8871)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        E e = this.D8871;
        if (e != null) {
            return e.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return woa.o("Err(", this.D8871, ")");
    }
}
