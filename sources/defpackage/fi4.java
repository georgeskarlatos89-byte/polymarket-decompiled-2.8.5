package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class fi4 extends e4 {
    public final Object b;
    public int c;
    public final /* synthetic */ gi4 d;

    public fi4(gi4 gi4Var, int i) {
        super(false, 0);
        this.d = gi4Var;
        Object obj = gi4.l;
        this.b = gi4Var.i()[i];
        this.c = i;
    }

    public final void a() {
        int i = this.c;
        Object obj = this.b;
        gi4 gi4Var = this.d;
        if (i != -1 && i < gi4Var.size()) {
            if (ckn.a(obj, gi4Var.i()[this.c])) {
                return;
            }
        }
        Object obj2 = gi4.l;
        this.c = gi4Var.d(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        gi4 gi4Var = this.d;
        Map b = gi4Var.b();
        if (b != null) {
            return b.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return gi4Var.j()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        gi4 gi4Var = this.d;
        Map b = gi4Var.b();
        Object obj2 = this.b;
        if (b != null) {
            return b.put(obj2, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            gi4Var.put(obj2, obj);
            return null;
        }
        Object obj3 = gi4Var.j()[i];
        gi4Var.j()[this.c] = obj;
        return obj3;
    }
}
