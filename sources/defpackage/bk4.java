package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class bk4 {
    public String a = null;
    public final HashSet b;
    public final HashSet c;
    public int d;
    public int e;
    public yk4 f;
    public final HashSet g;

    public bk4(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(xif.a(cls));
        for (Class cls2 : clsArr) {
            drn.a(cls2, "Null interface");
            this.b.add(xif.a(cls2));
        }
    }

    public final void a(pl6 pl6Var) {
        if (!this.b.contains(pl6Var.a)) {
            this.c.add(pl6Var);
        } else {
            dmk.v("Components are not allowed to depend on interfaces they themselves provide.");
        }
    }

    public final ck4 b() {
        boolean z;
        if (this.f != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new ck4(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g);
        }
        dmk.n("Missing required property: factory.");
        return null;
    }

    public bk4(xif xifVar, xif... xifVarArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(xifVar);
        for (xif xifVar2 : xifVarArr) {
            drn.a(xifVar2, "Null interface");
        }
        Collections.addAll(this.b, xifVarArr);
    }
}
