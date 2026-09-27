package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class i2b extends jjc implements dug {
    public Function0 o;
    public c2b p;
    public xmd q;
    public boolean r;
    public boolean s;
    public xjg t;
    public final g2b u = new g2b(this, 0);
    public g2b v;

    public i2b(Function0 function0, c2b c2bVar, xmd xmdVar, boolean z, boolean z2) {
        this.o = function0;
        this.p = c2bVar;
        this.q = xmdVar;
        this.r = z;
        this.s = z2;
        c1();
    }

    @Override // defpackage.jjc
    public final boolean R0() {
        return false;
    }

    @Override // defpackage.dug
    public final void T(pug pugVar) {
        vka[] vkaVarArr;
        mug.r(pugVar);
        pugVar.a(kug.N, this.u);
        xmd xmdVar = this.q;
        xmd xmdVar2 = xmd.Vertical;
        xjg xjgVar = this.t;
        if (xmdVar == xmdVar2) {
            if (xjgVar != null) {
                oug ougVar = kug.w;
                vkaVarArr = mug.a;
                vka vkaVar = vkaVarArr[13];
                pugVar.a(ougVar, xjgVar);
            } else {
                Intrinsics.i("scrollAxisRange");
                throw null;
            }
        } else if (xjgVar != null) {
            oug ougVar2 = kug.v;
            vkaVarArr = mug.a;
            vka vkaVar2 = vkaVarArr[12];
            pugVar.a(ougVar2, xjgVar);
        } else {
            Intrinsics.i("scrollAxisRange");
            throw null;
        }
        g2b g2bVar = this.v;
        if (g2bVar != null) {
            pugVar.a(xtg.f, new k6(null, g2bVar));
        }
        pugVar.a(xtg.C, new k6(null, new b6c(new h2b(this, 2), 10)));
        ua4 d = this.p.d();
        oug ougVar3 = kug.f;
        vka vkaVar3 = vkaVarArr[24];
        pugVar.a(ougVar3, d);
    }

    public final void c1() {
        g2b g2bVar;
        this.t = new xjg(new h2b(this, 0), new h2b(this, 1), this.s);
        if (this.r) {
            g2bVar = new g2b(this, 1);
        } else {
            g2bVar = null;
        }
        this.v = g2bVar;
    }
}
