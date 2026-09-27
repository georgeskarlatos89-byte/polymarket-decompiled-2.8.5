package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class own implements bvn {
    public final dya a;
    public final wun b;

    public own(Context context, wun wunVar) {
        this.b = wunVar;
        vw1 vw1Var = vw1.e;
        mdj.b(context);
        kdj c = mdj.a().c(vw1Var);
        if (vw1.d.contains(new td7("json"))) {
            new dya(new ccn(c, 4));
        }
        this.a = new dya(new ccn(c, 5));
    }

    @Override // defpackage.bvn
    public final void a(zun zunVar) {
        tw0 a;
        this.b.getClass();
        gdj gdjVar = (gdj) this.a.get();
        if (((vt1) zunVar).c != 0) {
            a = new tw0(((vt1) zunVar).J(), f6f.DEFAULT, null);
        } else {
            a = zk7.a(((vt1) zunVar).J());
        }
        ((ldj) gdjVar).a(a);
    }
}
