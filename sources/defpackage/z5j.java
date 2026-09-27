package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class z5j {
    public static final zcg d = o8n.b(new zyi(3), new c1j(12));
    public float a;
    public final gvd b;
    public final gvd c;

    public z5j(float f, float f2, float f3) {
        this.a = f;
        this.b = new gvd(f3);
        this.c = new gvd(f2);
    }

    public final float a() {
        if (this.a == 0.0f) {
            return 0.0f;
        }
        return this.c.y() / this.a;
    }

    public final void b(float f) {
        this.c.z(lnf.d(f, this.a, 0.0f));
    }
}
