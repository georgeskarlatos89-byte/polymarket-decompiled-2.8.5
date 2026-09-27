package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class sr9 extends wq9 {
    @Override // defpackage.wq9
    public /* bridge */ /* synthetic */ wq9 b(Object obj) {
        return g(obj);
    }

    public sr9 g(Object obj) {
        obj.getClass();
        a(obj);
        return this;
    }

    public tr9 h() {
        int i = this.b;
        if (i != 0) {
            Object[] objArr = this.a;
            if (i != 1) {
                tr9 k = tr9.k(i, objArr);
                this.b = k.size();
                this.c = true;
                return k;
            }
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            int i2 = tr9.c;
            return new x8h(obj);
        }
        int i3 = tr9.c;
        return cxf.j;
    }

    public sr9 i(sr9 sr9Var) {
        c(sr9Var.b, sr9Var.a);
        return this;
    }
}
