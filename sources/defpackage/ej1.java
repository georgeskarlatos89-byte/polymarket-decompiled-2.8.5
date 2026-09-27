package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ej1 {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final svd f;
    public final svd g;
    public int h;
    public int i;

    public ej1(svd svdVar, svd svdVar2, boolean z) {
        this.g = svdVar;
        this.f = svdVar2;
        this.e = z;
        svdVar2.F(12);
        this.a = svdVar2.x();
        svdVar.F(12);
        this.i = svdVar.x();
        zfl.a("first_chunk must be 1", svdVar.g() == 1);
        this.b = -1;
    }

    public final boolean a() {
        long v;
        int i;
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 == this.a) {
            return false;
        }
        boolean z = this.e;
        svd svdVar = this.f;
        if (z) {
            v = svdVar.y();
        } else {
            v = svdVar.v();
        }
        this.d = v;
        if (this.b == this.h) {
            svd svdVar2 = this.g;
            this.c = svdVar2.x();
            svdVar2.G(4);
            int i3 = this.i - 1;
            this.i = i3;
            if (i3 > 0) {
                i = svdVar2.x() - 1;
            } else {
                i = -1;
            }
            this.h = i;
        }
        return true;
    }
}
