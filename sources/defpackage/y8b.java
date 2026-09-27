package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class y8b extends q91 {
    public int q;
    public int r;
    public boolean s;
    public int t;
    public Integer u;
    public int v;
    public float w;
    public boolean x;
    public boolean y;

    @Override // defpackage.q91
    public final boolean c() {
        if (super.c() && e() == a()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.q91
    public final void d() {
        super.d();
        if (this.t >= 0) {
            if (this.q == 0) {
                if ((a() <= 0 && (!this.y || e() <= 0)) || this.i != 0) {
                    if (this.e.length < 3) {
                        dmk.v("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
                        return;
                    }
                    return;
                }
                dmk.v("Rounded corners without gap are not supported in contiguous indeterminate animation.");
                return;
            }
            return;
        }
        dmk.v("Stop indicator size must be >= 0.");
    }

    public final int e() {
        if (!this.y) {
            return a();
        }
        if (this.x) {
            return (int) (this.a * this.w);
        }
        return this.v;
    }
}
