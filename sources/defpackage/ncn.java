package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ncn implements abn {
    public final dya a;
    public final b9n b;

    public ncn(Context context, b9n b9nVar) {
        this.b = b9nVar;
        vw1 vw1Var = vw1.e;
        mdj.b(context);
        kdj c = mdj.a().c(vw1Var);
        if (vw1.d.contains(new td7("json"))) {
            new dya(new ccn(c, 0));
        }
        this.a = new dya(new ccn(c, 1));
    }

    @Override // defpackage.abn
    public final void a(f9n f9nVar) {
        tw0 a;
        this.b.getClass();
        gdj gdjVar = (gdj) this.a.get();
        if (((vt1) f9nVar).c != 0) {
            a = new tw0(((vt1) f9nVar).J(), f6f.DEFAULT, null);
        } else {
            a = zk7.a(((vt1) f9nVar).J());
        }
        ((ldj) gdjVar).a(a);
    }
}
