package defpackage;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class a66 extends op7 implements Executor {
    public static final a66 c = new g85();
    public static final g85 d;

    /* JADX WARN: Type inference failed for: r0v0, types: [a66, g85] */
    static {
        suj sujVar = suj.b;
        int i = eji.a;
        if (64 >= i) {
            i = 64;
        }
        d = sujVar.y0(jul.e(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m0(g.a, runnable);
    }

    @Override // defpackage.g85
    public final void m0(CoroutineContext coroutineContext, Runnable runnable) {
        d.m0(coroutineContext, runnable);
    }

    @Override // defpackage.g85
    public final void p0(CoroutineContext coroutineContext, Runnable runnable) {
        d.p0(coroutineContext, runnable);
    }

    @Override // defpackage.g85
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // defpackage.g85
    public final g85 y0(int i) {
        return suj.b.y0(i);
    }

    @Override // defpackage.op7
    public final Executor A0() {
        return this;
    }
}
