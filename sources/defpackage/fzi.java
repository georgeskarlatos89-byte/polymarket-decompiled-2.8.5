package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class fzi {
    public static final fzi a = new Object();
    public static final ThreadLocal b = new ThreadLocal();

    public static on7 a() {
        ThreadLocal threadLocal = b;
        on7 on7Var = (on7) threadLocal.get();
        if (on7Var == null) {
            ng1 ng1Var = new ng1(Thread.currentThread());
            threadLocal.set(ng1Var);
            return ng1Var;
        }
        return on7Var;
    }
}
