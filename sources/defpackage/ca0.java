package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface ca0 {
    boolean a();

    sa0 b(long j);

    default boolean c(long j) {
        if (j >= d()) {
            return true;
        }
        return false;
    }

    long d();

    tfj e();

    Object f(long j);

    Object g();
}
