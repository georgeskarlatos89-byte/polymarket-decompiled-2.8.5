package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class xzn implements lzn {
    public final dya a;
    public final dya b;
    public final izn c;

    public xzn(Context context, izn iznVar) {
        this.c = iznVar;
        vw1 vw1Var = vw1.e;
        mdj.b(context);
        kdj c = mdj.a().c(vw1Var);
        if (vw1.d.contains(new td7("json"))) {
            this.a = new dya(new ccn(c, 6));
        }
        this.b = new dya(new ccn(c, 7));
    }

    @Override // defpackage.lzn
    public final void a(kzn kznVar) {
        tw0 a;
        tw0 a2;
        izn iznVar = this.c;
        int i = iznVar.b;
        int i2 = iznVar.b;
        if (i == 0) {
            dya dyaVar = this.a;
            if (dyaVar != null) {
                gdj gdjVar = (gdj) dyaVar.get();
                if (((vt1) kznVar).c != 0) {
                    a2 = new tw0(((vt1) kznVar).K(i2), f6f.DEFAULT, null);
                } else {
                    a2 = zk7.a(((vt1) kznVar).K(i2));
                }
                ((ldj) gdjVar).a(a2);
                return;
            }
            return;
        }
        gdj gdjVar2 = (gdj) this.b.get();
        if (((vt1) kznVar).c != 0) {
            a = new tw0(((vt1) kznVar).K(i2), f6f.DEFAULT, null);
        } else {
            a = zk7.a(((vt1) kznVar).K(i2));
        }
        ((ldj) gdjVar2).a(a);
    }
}
