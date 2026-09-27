package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class qc6 extends sig {
    public static final qc6 d = new sig(kpi.e, kpi.a, kpi.c, kpi.d);

    @Override // defpackage.sig, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.g85
    public final String toString() {
        return "Dispatchers.Default";
    }

    @Override // defpackage.g85
    public final g85 y0(int i) {
        k6n.c(i);
        if (i >= kpi.c) {
            return this;
        }
        return super.y0(i);
    }
}
