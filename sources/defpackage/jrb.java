package defpackage;

import java.io.Writer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jrb extends Writer {
    public final StringBuilder a = new StringBuilder(128);

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e();
    }

    public final void e() {
        StringBuilder sb = this.a;
        if (sb.length() > 0) {
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        e();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                e();
            } else {
                this.a.append(c);
            }
        }
    }
}
