package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.t0;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class u0 {
    public final b3 a;

    public u0(b3 b3Var) {
        this.a = b3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized D8871 a() {
        D8871 b = this.a.b();
        if (b instanceof vD14832N6715) {
            return b;
        }
        if (b instanceof setPivotYN16904) {
            return new setPivotYN16904(t0.a.a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
