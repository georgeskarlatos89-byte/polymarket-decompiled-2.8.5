package com.appsflyer.internal;

import defpackage.bd0;
import defpackage.dmk;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFk1uSDK extends FilterInputStream {
    private long[] AFAdRevenueData;
    private int areAllFieldsValid;
    private byte[] component1;
    private int component2;
    private long[] component3;
    private short component4;
    private int copydefault;
    private final int getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private int getMonetizationNetwork;
    private final int getRevenue;

    private AFk1uSDK(InputStream inputStream, int i, int i2, short s, int i3, int i4, byte b) {
        super(new BufferedInputStream(inputStream, 4096));
        this.getMonetizationNetwork = 1;
        this.areAllFieldsValid = bd0.API_PRIORITY_OTHER;
        int min = Math.min(Math.max((int) s, 4), 8);
        this.getMediationNetwork = min;
        this.component1 = new byte[min];
        this.AFAdRevenueData = new long[4];
        this.component3 = new long[4];
        this.component2 = min;
        this.copydefault = min;
        this.AFAdRevenueData = AFk1vSDK.getMediationNetwork(i ^ i4, min ^ i4);
        this.component3 = AFk1vSDK.getMediationNetwork(i2 ^ i4, i3 ^ i4);
        this.getCurrencyIso4217Code = 100;
        this.getRevenue = 100;
    }

    private int getCurrencyIso4217Code() {
        int i = this.areAllFieldsValid;
        if (i == Integer.MAX_VALUE) {
            i = ((FilterInputStream) this).in.read();
            this.areAllFieldsValid = i;
        }
        if (this.component2 == this.getMediationNetwork) {
            this.component1[0] = (byte) i;
            if (i >= 0) {
                int i2 = 1;
                do {
                    int read = ((FilterInputStream) this).in.read(this.component1, i2, this.getMediationNetwork - i2);
                    if (read <= 0) {
                        break;
                    }
                    i2 += read;
                } while (i2 < this.getMediationNetwork);
                if (i2 >= this.getMediationNetwork) {
                    int i3 = this.getCurrencyIso4217Code;
                    if (i3 == this.getRevenue) {
                        getMediationNetwork();
                    } else {
                        if (this.getMonetizationNetwork <= i3) {
                            getMediationNetwork();
                        }
                        int i4 = this.getMonetizationNetwork;
                        if (i4 < this.getRevenue) {
                            this.getMonetizationNetwork = i4 + 1;
                        } else {
                            this.getMonetizationNetwork = 1;
                        }
                    }
                    int read2 = ((FilterInputStream) this).in.read();
                    this.areAllFieldsValid = read2;
                    this.component2 = 0;
                    int i5 = this.getMediationNetwork;
                    if (read2 < 0) {
                        i5 -= this.component1[i5 - 1] & MessagePack.Code.EXT_TIMESTAMP;
                    }
                    this.copydefault = i5;
                } else {
                    dmk.n("unexpected block size");
                    return 0;
                }
            } else {
                dmk.n("unexpected block size");
                return 0;
            }
        }
        return this.copydefault;
    }

    private void getMediationNetwork() {
        long[] jArr = this.AFAdRevenueData;
        long[] jArr2 = this.component3;
        short s = this.component4;
        long j = jArr[s % 4] * 2147483085;
        long j2 = jArr2[(s + 2) % 4];
        int i = (s + 3) % 4;
        jArr2[i] = ((jArr[i] * 2147483085) + j2) / 2147483647L;
        jArr[i] = (j + j2) % 2147483647L;
        for (int i2 = 0; i2 < this.getMediationNetwork; i2++) {
            this.component1[i2] = (byte) (r1[i2] ^ ((this.AFAdRevenueData[this.component4] >> (i2 << 3)) & 255));
        }
        this.component4 = (short) ((this.component4 + 1) % 4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        getCurrencyIso4217Code();
        return this.copydefault - this.component2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            getCurrencyIso4217Code();
            int i5 = this.component2;
            if (i5 >= this.copydefault) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.component1;
            this.component2 = i5 + 1;
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
        getCurrencyIso4217Code();
        int i = this.component2;
        if (i >= this.copydefault) {
            return -1;
        }
        byte[] bArr = this.component1;
        this.component2 = i + 1;
        return bArr[i] & MessagePack.Code.EXT_TIMESTAMP;
    }

    public AFk1uSDK(InputStream inputStream, int i, int i2, short s, int i3, int i4) {
        this(inputStream, i, i2, s, i3, i4, (byte) 0);
    }
}
