package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract class jg7 {
    public abstract void a(lcg lcgVar, Object obj);

    public abstract String b();

    public final void c(fcg fcgVar, Object obj) {
        fcgVar.getClass();
        if (obj == null) {
            return;
        }
        lcg m1 = fcgVar.m1(b());
        try {
            a(m1, obj);
            m1.j1();
            dgn.a(m1, null);
            twn.d(fcgVar);
        } finally {
        }
    }
}
