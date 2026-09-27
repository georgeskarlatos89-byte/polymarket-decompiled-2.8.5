package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class qfl extends e4 {
    public final Object b;
    public int c;
    public final /* synthetic */ gi4 d;

    public qfl(gi4 gi4Var, int i) {
        super(false, 2);
        this.d = gi4Var;
        Object[] objArr = gi4Var.d;
        objArr.getClass();
        this.b = objArr[i];
        this.c = i;
    }

    public final void a() {
        int i = this.c;
        Object obj = this.b;
        gi4 gi4Var = this.d;
        if (i != -1 && i < gi4Var.size()) {
            int i2 = this.c;
            Object[] objArr = gi4Var.d;
            objArr.getClass();
            if (jhn.c(obj, objArr[i2])) {
                return;
            }
        }
        Object obj2 = gi4.l;
        this.c = gi4Var.v(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        gi4 gi4Var = this.d;
        Map o = gi4Var.o();
        if (o != null) {
            return o.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        Object[] objArr = gi4Var.e;
        objArr.getClass();
        return objArr[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        gi4 gi4Var = this.d;
        Map o = gi4Var.o();
        Object obj2 = this.b;
        if (o != null) {
            return o.put(obj2, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            gi4Var.put(obj2, obj);
            return null;
        }
        Object[] objArr = gi4Var.e;
        objArr.getClass();
        Object obj3 = objArr[i];
        int i2 = this.c;
        Object[] objArr2 = gi4Var.e;
        objArr2.getClass();
        objArr2[i2] = obj;
        return obj3;
    }
}
