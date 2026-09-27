package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface asb {
    void a(String str);

    boolean b();

    boolean c();

    void d(String str, Object... objArr);

    boolean e();

    boolean f();

    void g(Throwable th);

    String getName();

    boolean h();

    void i(Object obj, String str);

    void j(String str);

    default boolean k(f6b f6bVar) {
        int a = f6bVar.a();
        if (a != 0) {
            if (a != 10) {
                if (a != 20) {
                    if (a != 30) {
                        if (a == 40) {
                            return h();
                        }
                        fi9.p(f6bVar, "] not recognized.", "Level [");
                        return false;
                    }
                    return b();
                }
                return e();
            }
            return c();
        }
        return f();
    }

    void l(String str);
}
