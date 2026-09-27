package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class v0 {
    public void b(ofh ofhVar) {
        tf1 e = e();
        ArrayList arrayList = e.f;
        if (arrayList == null) {
            arrayList = new ArrayList();
            e.f = arrayList;
        }
        arrayList.add(ofhVar);
    }

    public boolean c(tf1 tf1Var) {
        return this instanceof eg1;
    }

    public abstract tf1 e();

    public List f() {
        return Collections.EMPTY_LIST;
    }

    public boolean g() {
        return this instanceof eg1;
    }

    public abstract uf1 i(gx6 gx6Var);

    public void d() {
    }

    public void a(yeh yehVar) {
    }

    public void h(uw9 uw9Var) {
    }
}
