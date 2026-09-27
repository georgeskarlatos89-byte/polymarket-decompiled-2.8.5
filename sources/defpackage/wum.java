package defpackage;

import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class wum {
    public static final s9a a = new Object();

    public static final void a(int i, String str, ib4 ib4Var, pq4 pq4Var, int i2) {
        int i3;
        boolean z;
        String str2;
        of1 of1Var;
        int i4;
        int i5;
        int i6;
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.g0(-190780255);
        if ((i2 & 6) == 0) {
            if (sr8Var.f(i)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sr8Var.h(str)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (sr8Var.h(ib4Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sr8Var.V(i3 & 1, z)) {
            qtd b = tln.b(i, sr8Var, i3 & 14);
            if (ib4Var != null) {
                of1Var = new of1(ib4Var.a, 5);
            } else {
                of1Var = null;
            }
            str2 = str;
            y6m.b(b, str2, null, null, null, 0.0f, of1Var, sr8Var, i3 & 112, 60);
        } else {
            str2 = str;
            sr8Var.Y();
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new jc(i, str2, ib4Var, i2);
        }
    }

    public static final Object b(Set set, Enum r2, Enum r3, Enum r4, boolean z) {
        Set Q0;
        Enum r1;
        if (z) {
            if (set.contains(r2)) {
                r1 = r2;
            } else if (set.contains(r3)) {
                r1 = r3;
            } else {
                r1 = null;
            }
            if (Intrinsics.areEqual(r1, r2) && Intrinsics.areEqual(r4, r3)) {
                return null;
            }
            if (r4 == null) {
                return r1;
            }
            return r4;
        }
        if (r4 != null && (Q0 = CollectionsKt.Q0(f.i(set, r4))) != null) {
            set = Q0;
        }
        return CollectionsKt.v0(set);
    }
}
