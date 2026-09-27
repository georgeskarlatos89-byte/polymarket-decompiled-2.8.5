package defpackage;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vv1 extends FilterInputStream {
    public final /* synthetic */ int a = 1;
    public long b;
    public long c;

    public vv1(InputStream inputStream) {
        super(inputStream);
        this.c = -1L;
        this.b = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        switch (this.a) {
            case 0:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.b);
            default:
                return super.available();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.a) {
            case 0:
                synchronized (this) {
                    ((FilterInputStream) this).in.mark(i);
                    this.c = this.b;
                }
                return;
            default:
                super.mark(i);
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                long j = this.b;
                if (j == 0) {
                    return -1;
                }
                int read = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
                if (read != -1) {
                    this.b -= read;
                }
                return read;
            default:
                int read2 = super.read(bArr, i, i2);
                if (read2 != -1) {
                    this.c += read2;
                }
                return read2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        switch (this.a) {
            case 0:
                synchronized (this) {
                    if (((FilterInputStream) this).in.markSupported()) {
                        if (this.c != -1) {
                            ((FilterInputStream) this).in.reset();
                            this.b = this.c;
                        } else {
                            throw new IOException("Mark not set");
                        }
                    } else {
                        throw new IOException("Mark not supported");
                    }
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        switch (this.a) {
            case 0:
                long skip2 = ((FilterInputStream) this).in.skip(Math.min(j, this.b));
                this.b -= skip2;
                return skip2;
            default:
                return super.skip(j);
        }
    }

    public vv1(BufferedInputStream bufferedInputStream, long j) {
        super(bufferedInputStream);
        this.b = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        switch (this.a) {
            case 0:
                if (this.b == 0) {
                    return -1;
                }
                int read = ((FilterInputStream) this).in.read();
                if (read != -1) {
                    this.b--;
                }
                return read;
            default:
                int read2 = super.read();
                if (read2 != -1) {
                    this.c++;
                }
                return read2;
        }
    }
}
