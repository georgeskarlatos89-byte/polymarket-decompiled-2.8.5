package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class g1a extends y0a {
    public final int a;
    public final int b;
    public boolean c;
    public int d;

    public g1a(int i, int i2, int i3) {
        this.a = i3;
        this.b = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.c = z;
        this.d = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // defpackage.y0a
    public final int nextInt() {
        int i = this.d;
        if (i == this.b) {
            if (this.c) {
                this.c = false;
                return i;
            }
            dmk.t();
            return 0;
        }
        this.d = this.a + i;
        return i;
    }
}
