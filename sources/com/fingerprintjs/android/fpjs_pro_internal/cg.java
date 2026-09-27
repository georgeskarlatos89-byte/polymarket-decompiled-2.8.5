package com.fingerprintjs.android.fpjs_pro_internal;

import defpackage.bd0;
import defpackage.dmk;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class cg extends FilterInputStream {
    private final int D8871;
    private byte[] N14263A23323;
    private int component10;
    private short component13;
    private final int component5;
    private long[] component8;
    private int component9;
    private int sG29839;
    private final int setPivotYN16904;
    private int setTopP6481;
    private long[] vD14832N6715;

    private cg(InputStream inputStream, int i, int i2, short s, int i3, int i4, byte b) {
        super(new BufferedInputStream(inputStream, 4096));
        this.component9 = 1;
        this.sG29839 = bd0.API_PRIORITY_OTHER;
        int min = Math.min(Math.max((int) s, 4), 8);
        this.D8871 = min;
        this.N14263A23323 = new byte[min];
        this.vD14832N6715 = new long[4];
        this.component8 = new long[4];
        this.setTopP6481 = min;
        this.component10 = min;
        this.vD14832N6715 = e2.i(i ^ i4, min ^ i4);
        this.component8 = e2.i(i2 ^ i4, i3 ^ i4);
        this.setPivotYN16904 = 100;
        this.component5 = 100;
    }

    private void component9() {
        long[] jArr = this.vD14832N6715;
        long[] jArr2 = this.component8;
        short s = this.component13;
        long j = jArr[s % 4] * 2147483085;
        long j2 = jArr2[(s + 2) % 4];
        int i = (s + 3) % 4;
        jArr2[i] = ((jArr[i] * 2147483085) + j2) / 2147483647L;
        jArr[i] = (j + j2) % 2147483647L;
        for (int i2 = 0; i2 < this.D8871; i2++) {
            this.N14263A23323[i2] = (byte) (r1[i2] ^ ((this.vD14832N6715[this.component13] >> (i2 << 3)) & 255));
        }
        this.component13 = (short) ((this.component13 + 1) % 4);
    }

    private int setPivotYN16904() {
        int i = this.sG29839;
        if (i == Integer.MAX_VALUE) {
            i = ((FilterInputStream) this).in.read();
            this.sG29839 = i;
        }
        if (this.setTopP6481 == this.D8871) {
            this.N14263A23323[0] = (byte) i;
            if (i >= 0) {
                int i2 = 1;
                do {
                    int read = ((FilterInputStream) this).in.read(this.N14263A23323, i2, this.D8871 - i2);
                    if (read <= 0) {
                        break;
                    }
                    i2 += read;
                } while (i2 < this.D8871);
                if (i2 >= this.D8871) {
                    int i3 = this.setPivotYN16904;
                    if (i3 == this.component5) {
                        component9();
                    } else {
                        if (this.component9 <= i3) {
                            component9();
                        }
                        int i4 = this.component9;
                        if (i4 < this.component5) {
                            this.component9 = i4 + 1;
                        } else {
                            this.component9 = 1;
                        }
                    }
                    int read2 = ((FilterInputStream) this).in.read();
                    this.sG29839 = read2;
                    this.setTopP6481 = 0;
                    int i5 = this.D8871;
                    if (read2 < 0) {
                        i5 -= this.N14263A23323[i5 - 1] & MessagePack.Code.EXT_TIMESTAMP;
                    }
                    this.component10 = i5;
                } else {
                    dmk.n("unexpected block size");
                    return 0;
                }
            } else {
                dmk.n("unexpected block size");
                return 0;
            }
        }
        return this.component10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        setPivotYN16904();
        return this.component10 - this.setTopP6481;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            setPivotYN16904();
            int i5 = this.setTopP6481;
            if (i5 >= this.component10) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.N14263A23323;
            this.setTopP6481 = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        setPivotYN16904();
        int i = this.setTopP6481;
        if (i >= this.component10) {
            return -1;
        }
        byte[] bArr = this.N14263A23323;
        this.setTopP6481 = i + 1;
        return bArr[i] & MessagePack.Code.EXT_TIMESTAMP;
    }

    public cg(InputStream inputStream, int i, int i2, short s, int i3, int i4) {
        this(inputStream, i, i2, s, i3, i4, (byte) 0);
    }
}
