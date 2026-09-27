package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qr {
    public Object a;
    public Object b;
    public float c = Float.NaN;
    public final /* synthetic */ vr d;

    public qr(vr vrVar) {
        this.d = vrVar;
    }

    public static /* synthetic */ void b(qr qrVar, float f) {
        qrVar.a(f, 0.0f);
    }

    public final void a(float f, float f2) {
        boolean z;
        Object obj;
        float f3;
        vr vrVar = this.d;
        kvd kvdVar = vrVar.c;
        gvd gvdVar = vrVar.f;
        float y = gvdVar.y();
        gvdVar.z(f);
        vrVar.g.z(f2);
        if (!Float.isNaN(y)) {
            if (f >= y) {
                z = true;
            } else {
                z = false;
            }
            if (gvdVar.y() == ((h26) vrVar.b()).c(kvdVar.getValue())) {
                float y2 = gvdVar.y();
                if (z) {
                    f3 = 1.0f;
                } else {
                    f3 = -1.0f;
                }
                Object b = ((h26) vrVar.b()).b(z, y2 + f3);
                if (b == null) {
                    b = kvdVar.getValue();
                }
                if (z) {
                    this.a = kvdVar.getValue();
                    this.b = b;
                } else {
                    this.a = b;
                    this.b = kvdVar.getValue();
                }
            } else {
                Object b2 = ((h26) vrVar.b()).b(false, gvdVar.y());
                if (b2 == null) {
                    b2 = kvdVar.getValue();
                }
                Object b3 = ((h26) vrVar.b()).b(true, gvdVar.y());
                if (b3 == null) {
                    b3 = kvdVar.getValue();
                }
                this.a = b2;
                this.b = b3;
            }
            i07 b4 = vrVar.b();
            Object obj2 = this.a;
            obj2.getClass();
            float c = ((h26) b4).c(obj2);
            i07 b5 = vrVar.b();
            Object obj3 = this.b;
            obj3.getClass();
            this.c = Math.abs(c - ((h26) b5).c(obj3));
            if (Math.abs(gvdVar.y() - ((h26) vrVar.b()).c(kvdVar.getValue())) >= this.c / 2.0f) {
                if (z) {
                    obj = this.b;
                } else {
                    obj = this.a;
                }
                if (obj == null) {
                    obj = kvdVar.getValue();
                }
                kvdVar.setValue(obj);
            }
        }
    }
}
