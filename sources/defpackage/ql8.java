package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class ql8 implements y8h {
    private final y8h delegate;

    public ql8(y8h y8hVar) {
        y8hVar.getClass();
        this.delegate = y8hVar;
    }

    @hm6
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final y8h m1045deprecated_delegate() {
        return this.delegate;
    }

    @Override // defpackage.y8h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final y8h delegate() {
        return this.delegate;
    }

    @Override // defpackage.y8h, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // defpackage.y8h
    public b3j timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // defpackage.y8h
    public void write(tp1 tp1Var, long j) {
        tp1Var.getClass();
        this.delegate.write(tp1Var, j);
    }
}
