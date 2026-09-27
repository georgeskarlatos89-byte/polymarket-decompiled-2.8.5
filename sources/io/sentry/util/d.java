package io.sentry.util;

import java.io.Writer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class d extends Writer {
    public long a = 0;

    public static int e(char c) {
        if (c <= 127) {
            return 1;
        }
        if (c <= 2047 || Character.isSurrogate(c)) {
            return 2;
        }
        return 3;
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            this.a += e(str.charAt(i3));
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.Writer
    public final void write(int i) {
        this.a += e((char) i);
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            this.a += e(cArr[i3]);
        }
    }
}
