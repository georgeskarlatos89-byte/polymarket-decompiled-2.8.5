package bo.app;

import defpackage.dmk;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mg implements Closeable {
    public final FileInputStream a;
    public final Charset b;
    public byte[] c;
    public int d;
    public int e;

    public mg(FileInputStream fileInputStream, Charset charset) {
        charset.getClass();
        if (charset.equals(di.a)) {
            this.a = fileInputStream;
            this.b = charset;
            this.c = new byte[8192];
            return;
        }
        dmk.v("Unsupported encoding");
        throw null;
    }

    public final String a() {
        int i;
        synchronized (this.a) {
            try {
                byte[] bArr = this.c;
                if (bArr != null) {
                    int i2 = this.d;
                    if (i2 >= this.e) {
                        int read = this.a.read(bArr, 0, bArr.length);
                        if (read != -1) {
                            this.d = 0;
                            this.e = read;
                            i2 = 0;
                        } else {
                            throw new EOFException();
                        }
                    }
                    while (i2 != this.e) {
                        byte[] bArr2 = this.c;
                        if (bArr2[i2] == 10) {
                            int i3 = this.d;
                            if (i2 != i3) {
                                i = i2 - 1;
                                if (bArr2[i] == 13) {
                                    String str = new String(bArr2, i3, i - i3, this.b.name());
                                    this.d = i2 + 1;
                                    return str;
                                }
                            }
                            i = i2;
                            String str2 = new String(bArr2, i3, i - i3, this.b.name());
                            this.d = i2 + 1;
                            return str2;
                        }
                        i2++;
                    }
                    lg lgVar = new lg(this, (this.e - this.d) + 80);
                    while (true) {
                        byte[] bArr3 = this.c;
                        int i4 = this.d;
                        lgVar.write(bArr3, i4, this.e - i4);
                        this.e = -1;
                        FileInputStream fileInputStream = this.a;
                        byte[] bArr4 = this.c;
                        int read2 = fileInputStream.read(bArr4, 0, bArr4.length);
                        if (read2 != -1) {
                            this.d = 0;
                            this.e = read2;
                            for (int i5 = 0; i5 != this.e; i5++) {
                                byte[] bArr5 = this.c;
                                if (bArr5[i5] == 10) {
                                    int i6 = this.d;
                                    if (i5 != i6) {
                                        lgVar.write(bArr5, i6, i5 - i6);
                                    }
                                    this.d = i5 + 1;
                                    return lgVar.toString();
                                }
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                } else {
                    throw new IOException("LineReader is closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            try {
                if (this.c != null) {
                    this.c = null;
                    this.a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
