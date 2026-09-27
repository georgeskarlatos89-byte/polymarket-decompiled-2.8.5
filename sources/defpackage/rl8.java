package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class rl8 implements meh {
    private final meh delegate;

    public rl8(meh mehVar) {
        mehVar.getClass();
        this.delegate = mehVar;
    }

    @hm6
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final meh m1046deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final meh delegate() {
        return this.delegate;
    }

    @Override // defpackage.meh
    public long read(tp1 tp1Var, long j) {
        tp1Var.getClass();
        return this.delegate.read(tp1Var, j);
    }

    @Override // defpackage.meh
    public b3j timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
