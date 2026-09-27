package defpackage;

import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tq4 implements orf {
    public final /* synthetic */ w55 a;
    public final /* synthetic */ jmc b;

    public tq4(w55 w55Var, jmc jmcVar) {
        this.a = w55Var;
        this.b = jmcVar;
    }

    @Override // defpackage.orf
    public final h8a b(nrf nrfVar, Object obj) {
        orf orfVar;
        h8a h8aVar;
        w55 w55Var = this.a;
        if (w55Var instanceof orf) {
            orfVar = (orf) w55Var;
        } else {
            orfVar = null;
        }
        if (orfVar == null || (h8aVar = orfVar.b(nrfVar, obj)) == null) {
            h8aVar = h8a.IGNORED;
        }
        if (h8aVar == h8a.IGNORED) {
            jmc jmcVar = this.b;
            jmcVar.f = CollectionsKt.plus(jmcVar.f, new Pair(nrfVar, obj));
            return h8a.SCHEDULED;
        }
        return h8aVar;
    }

    @Override // defpackage.orf
    public final void a() {
    }

    @Override // defpackage.orf
    public final void c(Object obj) {
    }
}
