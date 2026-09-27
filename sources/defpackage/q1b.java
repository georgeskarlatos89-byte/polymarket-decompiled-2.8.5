package defpackage;

import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class q1b implements nwh {
    public final int a;
    public final int b;
    public final kvd c;
    public int d;

    public q1b(int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
        int i4 = (i / i2) * i2;
        this.c = new kvd(lnf.k(Math.max(i4 - i3, 0), i4 + i2 + i3), vwb.q);
        this.d = i;
    }

    public final void a(int i) {
        if (i != this.d) {
            this.d = i;
            int i2 = this.a;
            int i3 = (i / i2) * i2;
            int i4 = this.b;
            this.c.setValue(lnf.k(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }

    @Override // defpackage.nwh
    public final Object getValue() {
        return (IntRange) this.c.getValue();
    }
}
