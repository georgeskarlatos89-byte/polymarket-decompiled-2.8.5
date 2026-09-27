package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sej implements w25, c91 {
    public final boolean a;
    public final ArrayList b = new ArrayList();
    public final e2h c;
    public final j88 d;
    public final j88 e;
    public final j88 f;

    public sej(i91 i91Var, dsf dsfVar) {
        this.a = dsfVar.d;
        this.c = (e2h) dsfVar.b;
        j88 f = dsfVar.c.f();
        this.d = f;
        j88 f2 = ((b80) dsfVar.e).f();
        this.e = f2;
        j88 f3 = ((b80) dsfVar.f).f();
        this.f = f3;
        i91Var.g(f);
        i91Var.g(f2);
        i91Var.g(f3);
        f.a(this);
        f2.a(this);
        f3.a(this);
    }

    @Override // defpackage.c91
    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                ((c91) arrayList.get(i)).a();
                i++;
            } else {
                return;
            }
        }
    }

    public final void c(c91 c91Var) {
        this.b.add(c91Var);
    }

    @Override // defpackage.w25
    public final void b(List list, List list2) {
    }
}
