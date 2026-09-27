package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class f1i implements Closeable {
    public final /* synthetic */ int a;
    public final FileInputStream b;
    public final Charset c;
    public byte[] d;
    public int e;
    public int f;

    public f1i(FileInputStream fileInputStream, Charset charset, int i) {
        this.a = i;
        switch (i) {
            case 1:
                if (charset != null) {
                    if (charset.equals(n1k.a)) {
                        this.b = fileInputStream;
                        this.c = charset;
                        this.d = new byte[8192];
                        return;
                    }
                    dmk.v("Unsupported encoding");
                    throw null;
                }
                throw null;
            default:
                if (charset != null) {
                    if (charset.equals(r1k.a)) {
                        this.b = fileInputStream;
                        this.c = charset;
                        this.d = new byte[8192];
                        return;
                    }
                    dmk.v("Unsupported encoding");
                    throw null;
                }
                throw null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                synchronized (this.b) {
                    try {
                        if (this.d != null) {
                            this.d = null;
                            this.b.close();
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (this.b) {
                    try {
                        if (this.d != null) {
                            this.d = null;
                            this.b.close();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public final String e() {
        String mxeVar;
        int i;
        String mxeVar2;
        int i2;
        switch (this.a) {
            case 0:
                synchronized (this.b) {
                    try {
                        byte[] bArr = this.d;
                        if (bArr != null) {
                            int i3 = this.e;
                            if (i3 >= this.f) {
                                int read = this.b.read(bArr, 0, bArr.length);
                                if (read != -1) {
                                    this.e = 0;
                                    this.f = read;
                                    i3 = 0;
                                } else {
                                    throw new EOFException();
                                }
                            }
                            while (true) {
                                if (i3 != this.f) {
                                    byte[] bArr2 = this.d;
                                    if (bArr2[i3] == 10) {
                                        int i4 = this.e;
                                        if (i3 != i4) {
                                            i = i3 - 1;
                                            if (bArr2[i] == 13) {
                                                mxeVar = new String(bArr2, i4, i - i4, this.c.name());
                                                this.e = i3 + 1;
                                            }
                                        }
                                        i = i3;
                                        mxeVar = new String(bArr2, i4, i - i4, this.c.name());
                                        this.e = i3 + 1;
                                    } else {
                                        i3++;
                                    }
                                } else {
                                    mxe mxeVar3 = new mxe(this, (this.f - this.e) + 80, 1);
                                    while (true) {
                                        byte[] bArr3 = this.d;
                                        int i5 = this.e;
                                        mxeVar3.write(bArr3, i5, this.f - i5);
                                        this.f = -1;
                                        FileInputStream fileInputStream = this.b;
                                        byte[] bArr4 = this.d;
                                        int read2 = fileInputStream.read(bArr4, 0, bArr4.length);
                                        if (read2 != -1) {
                                            this.e = 0;
                                            this.f = read2;
                                            for (int i6 = 0; i6 != this.f; i6++) {
                                                byte[] bArr5 = this.d;
                                                if (bArr5[i6] == 10) {
                                                    int i7 = this.e;
                                                    if (i6 != i7) {
                                                        mxeVar3.write(bArr5, i7, i6 - i7);
                                                    }
                                                    this.e = i6 + 1;
                                                    mxeVar = mxeVar3.toString();
                                                }
                                            }
                                        } else {
                                            throw new EOFException();
                                        }
                                    }
                                }
                            }
                        } else {
                            throw new IOException("LineReader is closed");
                        }
                    } finally {
                    }
                }
                return mxeVar;
            default:
                synchronized (this.b) {
                    try {
                        byte[] bArr6 = this.d;
                        if (bArr6 != null) {
                            int i8 = this.e;
                            if (i8 >= this.f) {
                                int read3 = this.b.read(bArr6, 0, bArr6.length);
                                if (read3 != -1) {
                                    this.e = 0;
                                    this.f = read3;
                                    i8 = 0;
                                } else {
                                    throw new EOFException();
                                }
                            }
                            while (true) {
                                if (i8 != this.f) {
                                    byte[] bArr7 = this.d;
                                    if (bArr7[i8] == 10) {
                                        int i9 = this.e;
                                        if (i8 != i9) {
                                            i2 = i8 - 1;
                                            if (bArr7[i2] == 13) {
                                                mxeVar2 = new String(bArr7, i9, i2 - i9, this.c.name());
                                                this.e = i8 + 1;
                                            }
                                        }
                                        i2 = i8;
                                        mxeVar2 = new String(bArr7, i9, i2 - i9, this.c.name());
                                        this.e = i8 + 1;
                                    } else {
                                        i8++;
                                    }
                                } else {
                                    mxe mxeVar4 = new mxe(this, (this.f - this.e) + 80, 2);
                                    while (true) {
                                        byte[] bArr8 = this.d;
                                        int i10 = this.e;
                                        mxeVar4.write(bArr8, i10, this.f - i10);
                                        this.f = -1;
                                        FileInputStream fileInputStream2 = this.b;
                                        byte[] bArr9 = this.d;
                                        int read4 = fileInputStream2.read(bArr9, 0, bArr9.length);
                                        if (read4 != -1) {
                                            this.e = 0;
                                            this.f = read4;
                                            for (int i11 = 0; i11 != this.f; i11++) {
                                                byte[] bArr10 = this.d;
                                                if (bArr10[i11] == 10) {
                                                    int i12 = this.e;
                                                    if (i11 != i12) {
                                                        mxeVar4.write(bArr10, i12, i11 - i12);
                                                    }
                                                    this.e = i11 + 1;
                                                    mxeVar2 = mxeVar4.toString();
                                                }
                                            }
                                        } else {
                                            throw new EOFException();
                                        }
                                    }
                                }
                            }
                        } else {
                            throw new IOException("LineReader is closed");
                        }
                    } finally {
                    }
                }
                return mxeVar2;
        }
    }
}
