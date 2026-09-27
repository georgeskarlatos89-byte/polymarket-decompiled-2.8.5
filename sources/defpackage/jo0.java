package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class jo0 implements meh {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public jo0(InputStream inputStream, b3j b3jVar) {
        inputStream.getClass();
        b3jVar.getClass();
        this.b = inputStream;
        this.c = b3jVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ko0 ko0Var = (ko0) obj;
                meh mehVar = (meh) this.c;
                ko0Var.enter();
                try {
                    mehVar.close();
                    if (!ko0Var.exit()) {
                        return;
                    } else {
                        throw ko0Var.access$newTimeoutException(null);
                    }
                } catch (IOException e) {
                    if (!ko0Var.exit()) {
                        throw e;
                    }
                    throw ko0Var.access$newTimeoutException(e);
                } finally {
                    ko0Var.exit();
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.meh
    public final long read(tp1 tp1Var, long j) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        tp1Var.getClass();
        switch (i) {
            case 0:
                ko0 ko0Var = (ko0) obj;
                meh mehVar = (meh) obj2;
                ko0Var.enter();
                try {
                    long read = mehVar.read(tp1Var, j);
                    if (!ko0Var.exit()) {
                        return read;
                    }
                    throw ko0Var.access$newTimeoutException(null);
                } catch (IOException e) {
                    if (!ko0Var.exit()) {
                        throw e;
                    }
                    throw ko0Var.access$newTimeoutException(e);
                } finally {
                    ko0Var.exit();
                }
            default:
                if (j == 0) {
                    return 0L;
                }
                if (j >= 0) {
                    try {
                        ((b3j) obj2).throwIfReached();
                        eog e0 = tp1Var.e0(1);
                        int read2 = ((InputStream) obj).read(e0.a, e0.c, (int) Math.min(j, 8192 - e0.c));
                        if (read2 == -1) {
                            if (e0.b == e0.c) {
                                tp1Var.a = e0.a();
                                hog.a(e0);
                            }
                            return -1L;
                        }
                        e0.c += read2;
                        long j2 = read2;
                        tp1Var.b += j2;
                        return j2;
                    } catch (AssertionError e2) {
                        if (esk.a(e2)) {
                            throw new IOException(e2);
                        }
                        throw e2;
                    }
                }
                f27.q(woa.m(j, "byteCount < 0: "));
                return 0L;
        }
    }

    @Override // defpackage.meh
    public final b3j timeout() {
        switch (this.a) {
            case 0:
                return (ko0) this.b;
            default:
                return (b3j) this.c;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "AsyncTimeout.source(" + ((meh) this.c) + ')';
            default:
                return "source(" + ((InputStream) this.b) + ')';
        }
    }

    public jo0(ko0 ko0Var, meh mehVar) {
        this.b = ko0Var;
        this.c = mehVar;
    }
}
