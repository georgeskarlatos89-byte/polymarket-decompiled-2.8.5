package defpackage;

import android.text.Spanned;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class dol {
    public static final vl4 a = new vl4(new bm4(18), false, -1942204476);
    public static final vl4 b = new vl4(new bm4(19), false, 1987544201);

    static {
        new vl4(new hn4(18), false, 1224158509);
    }

    public static final qqc a(epc epcVar, pq4 pq4Var, int i) {
        boolean z;
        sr8 sr8Var = (sr8) pq4Var;
        Object Q = sr8Var.Q();
        uwn uwnVar = oq4.a;
        if (Q == uwnVar) {
            Q = ikl.c(Boolean.FALSE);
            sr8Var.o0(Q);
        }
        qqc qqcVar = (qqc) Q;
        if ((((i & 14) ^ 6) > 4 && sr8Var.h(epcVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        Object Q2 = sr8Var.Q();
        if (z || Q2 == uwnVar) {
            Q2 = new h07(epcVar, qqcVar, null, 1);
            sr8Var.o0(Q2);
        }
        hrl.d(sr8Var, epcVar, (Function2) Q2);
        return qqcVar;
    }

    public static final boolean b(Spanned spanned, Class cls) {
        if (spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length()) {
            return true;
        }
        return false;
    }
}
