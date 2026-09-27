package defpackage;

import android.util.StateSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zwh {
    public int a;
    public b1h b;
    public int[][] c;
    public b1h[] d;
    public ywh e;
    public ywh f;
    public ywh g;
    public ywh h;

    public zwh(b1h b1hVar) {
        c();
        a(StateSet.WILD_CARD, b1hVar);
    }

    public final void a(int[] iArr, b1h b1hVar) {
        int i = this.a;
        if (i == 0 || iArr.length == 0) {
            this.b = b1hVar;
        }
        int[][] iArr2 = this.c;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.c = iArr3;
            b1h[] b1hVarArr = new b1h[i2];
            System.arraycopy(this.d, 0, b1hVarArr, 0, i);
            this.d = b1hVarArr;
        }
        int[][] iArr4 = this.c;
        int i3 = this.a;
        iArr4[i3] = iArr;
        this.d[i3] = b1hVar;
        this.a = i3 + 1;
    }

    public final axh b() {
        if (this.a == 0) {
            return null;
        }
        return new axh(this);
    }

    public final void c() {
        this.b = new b1h();
        this.c = new int[10];
        this.d = new b1h[10];
    }
}
