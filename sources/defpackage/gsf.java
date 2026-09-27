package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gsf extends FilterInputStream {
    public volatile byte[] a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final bxb f;

    public gsf(InputStream inputStream, bxb bxbVar) {
        super(inputStream);
        this.d = -1;
        this.f = bxbVar;
        this.a = (byte[]) bxbVar.c(byte[].class, 65536);
    }

    public static void o() {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.a != null && inputStream != null) {
        } else {
            o();
            throw null;
        }
        return (this.b - this.e) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a != null) {
            this.f.g(this.a);
            this.a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final int e(InputStream inputStream, byte[] bArr) {
        int i = this.d;
        if (i != -1) {
            int i2 = this.e - i;
            int i3 = this.c;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f.c(byte[].class, i3);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.a = bArr2;
                    this.f.g(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.e - this.d;
                this.e = i4;
                this.d = 0;
                this.b = 0;
                int read = inputStream.read(bArr, i4, bArr.length - i4);
                int i5 = this.e;
                if (read > 0) {
                    i5 += read;
                }
                this.b = i5;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.d = -1;
            this.e = 0;
            this.b = read2;
        }
        return read2;
    }

    public final synchronized void g() {
        if (this.a != null) {
            this.f.g(this.a);
            this.a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.c = Math.max(this.c, i);
        this.d = this.e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.a;
        if (bArr2 != null) {
            if (i2 == 0) {
                return 0;
            }
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i5 = this.e;
                int i6 = this.b;
                if (i5 < i6) {
                    int i7 = i6 - i5;
                    if (i7 >= i2) {
                        i7 = i2;
                    }
                    System.arraycopy(bArr2, i5, bArr, i, i7);
                    this.e += i7;
                    if (i7 != i2 && inputStream.available() != 0) {
                        i += i7;
                        i3 = i2 - i7;
                    } else {
                        return i7;
                    }
                } else {
                    i3 = i2;
                }
                while (true) {
                    int i8 = -1;
                    if (this.d == -1 && i3 >= bArr2.length) {
                        i4 = inputStream.read(bArr, i, i3);
                        if (i4 == -1) {
                            if (i3 != i2) {
                                i8 = i2 - i3;
                            }
                            return i8;
                        }
                    } else {
                        if (e(inputStream, bArr2) == -1) {
                            if (i3 != i2) {
                                i8 = i2 - i3;
                            }
                            return i8;
                        }
                        if (bArr2 != this.a && (bArr2 = this.a) == null) {
                            o();
                            throw null;
                        }
                        int i9 = this.b;
                        int i10 = this.e;
                        i4 = i9 - i10;
                        if (i4 >= i3) {
                            i4 = i3;
                        }
                        System.arraycopy(bArr2, i10, bArr, i, i4);
                        this.e += i4;
                    }
                    i3 -= i4;
                    if (i3 == 0) {
                        return i2;
                    }
                    if (inputStream.available() == 0) {
                        return i2 - i3;
                    }
                    i += i4;
                }
            } else {
                o();
                throw null;
            }
        } else {
            o();
            throw null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.a != null) {
            int i = this.d;
            if (-1 != i) {
                this.e = i;
            } else {
                throw new IOException("Mark has been invalidated, pos: " + this.e + " markLimit: " + this.c);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.a;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i = this.b;
                int i2 = this.e;
                if (i - i2 >= j) {
                    this.e = (int) (i2 + j);
                    return j;
                }
                long j2 = i - i2;
                this.e = i;
                if (this.d != -1 && j <= this.c) {
                    if (e(inputStream, bArr) == -1) {
                        return j2;
                    }
                    int i3 = this.b;
                    int i4 = this.e;
                    if (i3 - i4 >= j - j2) {
                        this.e = (int) ((i4 + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + i3) - i4;
                    this.e = i3;
                    return j3;
                }
                long skip2 = inputStream.skip(j - j2);
                if (skip2 > 0) {
                    this.d = -1;
                }
                return j2 + skip2;
            }
            o();
            throw null;
        }
        o();
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.e >= this.b && e(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.a && (bArr = this.a) == null) {
                o();
                throw null;
            }
            int i = this.b;
            int i2 = this.e;
            if (i - i2 <= 0) {
                return -1;
            }
            this.e = i2 + 1;
            return bArr[i2] & MessagePack.Code.EXT_TIMESTAMP;
        }
        o();
        throw null;
    }
}
