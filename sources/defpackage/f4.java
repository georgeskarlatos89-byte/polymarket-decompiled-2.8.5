package defpackage;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class f4 extends FilterInputStream {
    public final /* synthetic */ int a = 1;
    public int b;

    public f4(fp7 fp7Var) {
        super(fp7Var);
        this.b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        switch (this.a) {
            case 0:
                return Math.min(super.available(), this.b);
            default:
                int i = this.b;
                if (i == Integer.MIN_VALUE) {
                    return super.available();
                }
                return Math.min(i, super.available());
        }
    }

    public long e(long j) {
        int i = this.b;
        if (i == 0) {
            return -1L;
        }
        if (i != Integer.MIN_VALUE && j > i) {
            return i;
        }
        return j;
    }

    public void g(long j) {
        int i = this.b;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.b = (int) (i - j);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.a) {
            case 1:
                synchronized (this) {
                    super.mark(i);
                    this.b = i;
                }
                return;
            default:
                super.mark(i);
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        switch (this.a) {
            case 0:
                if (this.b <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.b--;
                }
                return read;
            default:
                if (e(1L) == -1) {
                    return -1;
                }
                int read2 = super.read();
                g(1L);
                return read2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        switch (this.a) {
            case 1:
                synchronized (this) {
                    super.reset();
                    this.b = Integer.MIN_VALUE;
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        switch (this.a) {
            case 0:
                long skip2 = super.skip(Math.min(j, this.b));
                if (skip2 >= 0) {
                    this.b = (int) (this.b - skip2);
                }
                return skip2;
            default:
                long e = e(j);
                if (e == -1) {
                    return 0L;
                }
                long skip3 = super.skip(e);
                g(skip3);
                return skip3;
        }
    }

    public f4(ByteArrayInputStream byteArrayInputStream, int i) {
        super(byteArrayInputStream);
        this.b = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                int i3 = this.b;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.b -= read;
                }
                return read;
            default:
                int e = (int) e(i2);
                if (e == -1) {
                    return -1;
                }
                int read2 = super.read(bArr, i, e);
                g(read2);
                return read2;
        }
    }
}
