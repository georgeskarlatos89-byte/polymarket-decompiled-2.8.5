package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class vzc {
    public boolean a;
    public boolean b;
    public String d;
    public boolean e;
    public boolean f;
    public int c = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;

    public final wzc a() {
        String str = this.d;
        boolean z = this.a;
        if (str != null) {
            boolean z2 = this.b;
            boolean z3 = this.e;
            boolean z4 = this.f;
            int i = this.g;
            int i2 = this.h;
            int i3 = this.i;
            int i4 = this.j;
            int i5 = ztc.f;
            wzc wzcVar = new wzc(z, z2, "android-app://androidx.navigation/".concat(str).hashCode(), z3, z4, i, i2, i3, i4);
            wzcVar.j = str;
            return wzcVar;
        }
        return new wzc(z, this.b, this.c, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final void b(int i, boolean z, boolean z2) {
        this.c = i;
        this.d = null;
        this.e = z;
        this.f = z2;
    }
}
