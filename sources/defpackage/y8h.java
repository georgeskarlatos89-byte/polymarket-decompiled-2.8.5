package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface y8h extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    b3j timeout();

    void write(tp1 tp1Var, long j);
}
