package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class e8b implements y8h {
    public final tp1 a;
    public long b = 1048576;

    public e8b(tp1 tp1Var) {
        this.a = tp1Var;
    }

    @Override // defpackage.y8h
    public final b3j timeout() {
        return b3j.NONE;
    }

    @Override // defpackage.y8h
    public final void write(tp1 tp1Var, long j) {
        tp1Var.getClass();
        long j2 = this.b;
        if (j2 > 0) {
            long min = Math.min(j2, j);
            this.a.write(tp1Var, min);
            this.b -= min;
        }
    }

    @Override // defpackage.y8h, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.y8h, java.io.Flushable
    public final void flush() {
    }
}
