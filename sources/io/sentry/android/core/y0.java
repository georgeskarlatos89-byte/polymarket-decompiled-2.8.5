package io.sentry.android.core;

import java.io.BufferedInputStream;
import java.io.InputStream;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class y0 extends InputStream {
    public final BufferedInputStream a;
    public long b;

    public y0(BufferedInputStream bufferedInputStream, int i) {
        this.a = bufferedInputStream;
        this.b = i;
    }

    @Override // java.io.InputStream
    public final int available() {
        return Math.min(this.a.available(), (int) this.b);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a1.d(this.a, this.b);
        this.b = 0L;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.b;
        if (j <= 0) {
            return -1;
        }
        int read = this.a.read(bArr, i, Math.min(i2, (int) j));
        if (read > 0) {
            this.b -= read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        long skip2 = this.a.skip(Math.min(j, this.b));
        this.b -= skip2;
        return skip2;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.b <= 0) {
            return -1;
        }
        int read = this.a.read();
        if (read != -1) {
            this.b--;
        }
        return read;
    }
}
