package defpackage;

import android.app.Application;
import com.polymarket.android.R;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class s01 extends l70 {
    public final vne b;
    public final m01 c;
    public final uwh d;
    public final uwh e;
    public final k3h f;
    public final cpf g;
    public final l7h h;
    public final n7h i;
    public final epf j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s01(vne vneVar, m01 m01Var, uf ufVar, Application application) {
        super(application);
        m01Var.getClass();
        ufVar.getClass();
        this.b = vneVar;
        this.c = m01Var;
        this.d = n0n.a(null);
        this.e = n0n.a(Boolean.FALSE);
        k3h b = ozm.b(0, 0, null, 7);
        this.f = b;
        this.g = tkl.a(b);
        l7h l7hVar = new l7h(xun.f(R.string.stripe_address_label_address, new Object[0]), 0, 0, n0n.a(null), false, 22);
        this.h = l7hVar;
        n7h n7hVar = new n7h(l7hVar, null, null, 6);
        this.i = n7hVar;
        epf epfVar = n7hVar.n;
        this.j = epfVar;
        Object obj = new Object();
        w74 c = n3n.c(this);
        ye6 ye6Var = new ye6(this, 14);
        epfVar.getClass();
        coc.c(c, null, null, new dz(epfVar, obj, ye6Var, (Continuation) null, 5), 3);
        coc.c(n3n.c(this), null, null, new l01(this, null, 0), 3);
    }

    public final void x() {
        coc.c(n3n.c(this), null, null, new l01(this, null, 1), 3);
    }
}
