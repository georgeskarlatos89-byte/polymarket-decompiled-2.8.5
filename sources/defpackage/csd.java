package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class csd extends m4n {
    public final Function4 g;
    public final Function1 h;
    public final vt1 i;

    public csd(Function4 function4, Function1 function1, int i) {
        this.g = function4;
        this.h = function1;
        vt1 vt1Var = new vt1(12, (byte) 0);
        vt1Var.c(i, new yrd(function4, function1));
        this.i = vt1Var;
    }

    @Override // defpackage.m4n
    public final vt1 f() {
        return this.i;
    }
}
