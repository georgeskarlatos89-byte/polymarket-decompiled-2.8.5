package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.a3;
import com.fingerprintjs.android.fpjs_pro_internal.b2;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class b3 {
    public final c2 a;
    public final String b;
    public final l0 c;

    public b3(c2 c2Var, String str, l0 l0Var) {
        this.a = c2Var;
        this.b = str;
        this.c = l0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void a(List list) {
        D8871 a = this.c.a(list);
        if (a instanceof vD14832N6715) {
            byte[] bArr = (byte[]) ((vD14832N6715) a).component5;
            ((w1) this.a).a(this.b, bArr);
            return;
        }
        if (a instanceof setPivotYN16904) {
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized D8871 b() {
        D8871 b = ((w1) this.a).b(this.b);
        if (b instanceof vD14832N6715) {
            D8871 b2 = this.c.b((byte[]) ((vD14832N6715) b).component5);
            if (b2 instanceof vD14832N6715) {
                return b2;
            }
            if (b2 instanceof setPivotYN16904) {
                return new setPivotYN16904(a3.a.a);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (b instanceof setPivotYN16904) {
            b2 b2Var = (b2) ((setPivotYN16904) b).D8871;
            if (Intrinsics.areEqual(b2Var, b2.b.a)) {
                return new vD14832N6715(CollectionsKt.emptyList());
            }
            if (Intrinsics.areEqual(b2Var, b2.a.a)) {
                return new setPivotYN16904(a3.a.a);
            }
            throw new NoWhenBranchMatchedException();
        }
        throw new NoWhenBranchMatchedException();
    }
}
