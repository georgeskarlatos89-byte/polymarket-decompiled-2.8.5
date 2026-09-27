package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class gr9 extends l3 implements ir9 {
    public final q4 b;
    public final int c;
    public final int d;

    public gr9(q4 q4Var, int i, int i2) {
        this.b = q4Var;
        this.c = i;
        i8n.e(i, i2, q4Var.size());
        this.d = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        i8n.c(i, this.d);
        return this.b.get(this.c + i);
    }

    @Override // defpackage.o1
    public final int getSize() {
        return this.d;
    }

    @Override // defpackage.l3, java.util.List
    public final List subList(int i, int i2) {
        i8n.e(i, i2, this.d);
        int i3 = this.c;
        return new gr9(this.b, i + i3, i3 + i2);
    }
}
