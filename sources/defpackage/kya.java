package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kya extends m4n {
    public static final gsa j = new gsa(1);
    public final bza g = new bza(this);
    public final vt1 h = new vt1(12, (byte) 0);
    public boolean i;

    public kya(Function1 function1) {
        function1.invoke(this);
    }

    public static void h(kya kyaVar, int i, gn2 gn2Var, vl4 vl4Var, int i2) {
        if ((i2 & 2) != 0) {
            gn2Var = null;
        }
        kyaVar.h.c(i, new iya(gn2Var, j, ec9.n, vl4Var));
    }

    @Override // defpackage.m4n
    public final vt1 f() {
        return this.h;
    }
}
