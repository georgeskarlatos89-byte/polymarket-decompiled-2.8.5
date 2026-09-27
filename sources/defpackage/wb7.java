package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wb7 implements vb7 {
    public final int a;
    public int b = -1;
    public int c = -1;

    public wb7(int i) {
        this.a = i;
    }

    @Override // defpackage.vb7
    public final boolean x(CharSequence charSequence, int i, int i2, tij tijVar) {
        int i3 = this.a;
        if (i <= i3 && i3 < i2) {
            this.b = i;
            this.c = i2;
            return false;
        }
        if (i2 > i3) {
            return false;
        }
        return true;
    }

    @Override // defpackage.vb7
    public final Object t() {
        return this;
    }
}
