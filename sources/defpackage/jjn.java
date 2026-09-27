package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class jjn {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (((defpackage.sr8) r7).f(r4.ordinal()) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(qq6 qq6Var, Function0 function0, Function0 function02, pq4 pq4Var, int i) {
        boolean z;
        int i2;
        Object invoke;
        qq6Var.getClass();
        function0.getClass();
        function02.getClass();
        qqc e = ikl.e(function0, pq4Var);
        qqc e2 = ikl.e(function02, pq4Var);
        if (((i & 14) ^ 6) > 4) {
        }
        if ((i & 6) != 4) {
            z = false;
            sr8 sr8Var = (sr8) pq4Var;
            Object Q = sr8Var.Q();
            if (z && Q != oq4.a) {
                return Q;
            }
            i2 = h6d.a[qq6Var.ordinal()];
            if (i2 == 1 && i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    dmk.a();
                    return null;
                }
                invoke = ((Function0) e2.getValue()).invoke();
            } else {
                invoke = ((Function0) e.getValue()).invoke();
            }
            sr8Var.o0(invoke);
            return invoke;
        }
        z = true;
        sr8 sr8Var2 = (sr8) pq4Var;
        Object Q2 = sr8Var2.Q();
        if (z) {
        }
        i2 = h6d.a[qq6Var.ordinal()];
        if (i2 == 1) {
        }
        invoke = ((Function0) e.getValue()).invoke();
        sr8Var2.o0(invoke);
        return invoke;
    }
}
