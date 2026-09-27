package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class k3 extends l3 implements RandomAccess {
    public final /* synthetic */ int b = 1;
    public int c;
    public int d;
    public final List e;

    public k3(l3 l3Var, int i, int i2) {
        this.e = l3Var;
        this.c = i;
        h3 h3Var = l3.a;
        int size = l3Var.size();
        h3Var.getClass();
        h3.d(i, i2, size);
        this.d = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.b;
        List list = this.e;
        switch (i2) {
            case 0:
                h3 h3Var = l3.a;
                int i3 = this.d;
                h3Var.getClass();
                h3.b(i, i3);
                return ((l3) list).get(this.c + i);
            default:
                h3 h3Var2 = l3.a;
                int i4 = this.d;
                h3Var2.getClass();
                h3.b(i, i4);
                return ((ArrayList) list).get(this.c + i);
        }
    }

    @Override // defpackage.o1
    public final int getSize() {
        switch (this.b) {
            case 0:
                return this.d;
            default:
                return this.d;
        }
    }

    @Override // defpackage.l3, java.util.List
    public List subList(int i, int i2) {
        switch (this.b) {
            case 0:
                h3 h3Var = l3.a;
                int i3 = this.d;
                h3Var.getClass();
                h3.d(i, i2, i3);
                l3 l3Var = (l3) this.e;
                int i4 = this.c;
                return new k3(l3Var, i + i4, i4 + i2);
            default:
                return super.subList(i, i2);
        }
    }

    public k3(ArrayList arrayList) {
        this.e = arrayList;
    }
}
