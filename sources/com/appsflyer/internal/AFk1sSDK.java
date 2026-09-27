package com.appsflyer.internal;

import defpackage.omf;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFk1sSDK {
    private static byte[] component1 = new byte[256];
    static final byte[] getCurrencyIso4217Code = new byte[256];
    static final int[] AFAdRevenueData = new int[256];
    static final int[] getMediationNetwork = new int[256];
    static final int[] getRevenue = new int[256];
    static final int[] getMonetizationNetwork = new int[256];
    private static int[] areAllFieldsValid = new int[10];

    static {
        int i;
        byte b;
        byte[] bArr;
        int i2;
        byte b2 = 1;
        byte b3 = 1;
        do {
            int i3 = (b2 << 1) ^ b2;
            if ((b2 & 128) != 0) {
                i = 27;
            } else {
                i = 0;
            }
            b2 = (byte) (i ^ i3);
            byte b4 = (byte) (b3 ^ (b3 << 1));
            byte b5 = (byte) (b4 ^ (b4 << 2));
            byte b6 = (byte) (b5 ^ (b5 << 4));
            if ((b6 & 128) != 0) {
                b = 9;
            } else {
                b = 0;
            }
            b3 = (byte) (b6 ^ b);
            bArr = component1;
            i2 = b2 & MessagePack.Code.EXT_TIMESTAMP;
            int i4 = b3 & MessagePack.Code.EXT_TIMESTAMP;
            bArr[i2] = (byte) (((((b3 ^ 99) ^ ((i4 << 1) | (i4 >> 7))) ^ ((i4 << 2) | (i4 >> 6))) ^ ((i4 << 3) | (i4 >> 5))) ^ ((i4 >> 4) | (i4 << 4)));
        } while (i2 != 1);
        bArr[0] = 99;
        for (int i5 = 0; i5 < 256; i5++) {
            int i6 = component1[i5] & MessagePack.Code.EXT_TIMESTAMP;
            getCurrencyIso4217Code[i6] = (byte) i5;
            int i7 = i5 << 1;
            if (i7 >= 256) {
                i7 ^= 283;
            }
            int i8 = i7 << 1;
            if (i8 >= 256) {
                i8 ^= 283;
            }
            int i9 = i8 << 1;
            if (i9 >= 256) {
                i9 ^= 283;
            }
            int i10 = i9 ^ i5;
            int i11 = ((i7 ^ (i8 ^ i9)) << 24) | (i10 << 16) | ((i10 ^ i8) << 8) | (i10 ^ i7);
            AFAdRevenueData[i6] = i11;
            getMediationNetwork[i6] = (i11 >>> 8) | (i11 << 24);
            getRevenue[i6] = (i11 >>> 16) | (i11 << 16);
            getMonetizationNetwork[i6] = (i11 << 8) | (i11 >>> 24);
        }
        areAllFieldsValid[0] = 16777216;
        int i12 = 1;
        for (int i13 = 1; i13 < 10; i13++) {
            i12 <<= 1;
            if (i12 >= 256) {
                i12 ^= 283;
            }
            areAllFieldsValid[i13] = i12 << 24;
        }
    }

    public static int[] getCurrencyIso4217Code(byte[] bArr, int i) {
        if (bArr.length == 16) {
            int i2 = 4;
            int i3 = (i + 1) * 4;
            int[] iArr = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < 4; i5++) {
                int i6 = i4 + 3;
                int i7 = ((bArr[i4 + 1] & MessagePack.Code.EXT_TIMESTAMP) << 16) | (bArr[i4] << 24) | ((bArr[i4 + 2] & MessagePack.Code.EXT_TIMESTAMP) << 8);
                i4 += 4;
                iArr[i5] = i7 | (bArr[i6] & MessagePack.Code.EXT_TIMESTAMP);
            }
            int i8 = 4;
            int i9 = 0;
            int i10 = 0;
            while (i8 < i3) {
                int i11 = iArr[i8 - 1];
                if (i9 == 0) {
                    byte[] bArr2 = component1;
                    i11 = ((bArr2[i11 >>> 24] & MessagePack.Code.EXT_TIMESTAMP) | (((bArr2[(i11 >>> 16) & 255] << 24) | ((bArr2[(i11 >>> 8) & 255] & MessagePack.Code.EXT_TIMESTAMP) << 16)) | ((bArr2[i11 & 255] & MessagePack.Code.EXT_TIMESTAMP) << 8))) ^ areAllFieldsValid[i10];
                    i9 = 4;
                    i10++;
                }
                iArr[i8] = i11 ^ iArr[i8 - 4];
                i8++;
                i9--;
            }
            if (bArr.length == 16) {
                int[] iArr2 = new int[i3];
                int i12 = i * 4;
                iArr2[0] = iArr[i12];
                int i13 = 1;
                iArr2[1] = iArr[i12 + 1];
                iArr2[2] = iArr[i12 + 2];
                char c = 3;
                iArr2[3] = iArr[i12 + 3];
                int i14 = i12 - 4;
                while (i13 < i) {
                    int i15 = iArr[i14];
                    int[] iArr3 = AFAdRevenueData;
                    byte[] bArr3 = component1;
                    int i16 = iArr3[bArr3[i15 >>> 24] & MessagePack.Code.EXT_TIMESTAMP];
                    int[] iArr4 = getMediationNetwork;
                    int i17 = i16 ^ iArr4[bArr3[(i15 >>> 16) & 255] & MessagePack.Code.EXT_TIMESTAMP];
                    int[] iArr5 = getRevenue;
                    int i18 = i17 ^ iArr5[bArr3[(i15 >>> 8) & 255] & MessagePack.Code.EXT_TIMESTAMP];
                    int[] iArr6 = getMonetizationNetwork;
                    iArr2[i2] = iArr6[bArr3[i15 & 255] & MessagePack.Code.EXT_TIMESTAMP] ^ i18;
                    int i19 = iArr[i14 + 1];
                    char c2 = c;
                    int[] iArr7 = iArr2;
                    iArr7[i2 + 1] = ((iArr4[bArr3[(i19 >>> 16) & 255] & MessagePack.Code.EXT_TIMESTAMP] ^ iArr3[bArr3[i19 >>> 24] & MessagePack.Code.EXT_TIMESTAMP]) ^ iArr5[bArr3[(i19 >>> 8) & 255] & MessagePack.Code.EXT_TIMESTAMP]) ^ iArr6[bArr3[i19 & 255] & MessagePack.Code.EXT_TIMESTAMP];
                    int i20 = iArr[i14 + 2];
                    int i21 = i2 + 3;
                    iArr7[i2 + 2] = iArr6[bArr3[i20 & 255] & MessagePack.Code.EXT_TIMESTAMP] ^ ((iArr3[bArr3[i20 >>> 24] & MessagePack.Code.EXT_TIMESTAMP] ^ iArr4[bArr3[(i20 >>> 16) & 255] & MessagePack.Code.EXT_TIMESTAMP]) ^ iArr5[bArr3[(i20 >>> 8) & 255] & MessagePack.Code.EXT_TIMESTAMP]);
                    int i22 = iArr[i14 + 3];
                    i2 += 4;
                    iArr7[i21] = iArr6[bArr3[i22 & 255] & MessagePack.Code.EXT_TIMESTAMP] ^ ((iArr3[bArr3[i22 >>> 24] & MessagePack.Code.EXT_TIMESTAMP] ^ iArr4[bArr3[(i22 >>> 16) & 255] & MessagePack.Code.EXT_TIMESTAMP]) ^ iArr5[bArr3[(i22 >>> 8) & 255] & MessagePack.Code.EXT_TIMESTAMP]);
                    i14 -= 4;
                    i13++;
                    c = c2;
                    iArr2 = iArr7;
                }
                int[] iArr8 = iArr2;
                iArr8[i2] = iArr[i14];
                iArr8[i2 + 1] = iArr[i14 + 1];
                iArr8[i2 + 2] = iArr[i14 + 2];
                iArr8[i2 + 3] = iArr[i14 + 3];
                return iArr8;
            }
            omf.a();
            return null;
        }
        omf.a();
        return null;
    }

    public static byte[][] getCurrencyIso4217Code(int i) {
        byte[][] bArr = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i >>> (i2 << 3);
            byte[] bArr2 = new byte[4];
            bArr2[0] = (byte) (i3 & 3);
            bArr2[1] = (byte) ((i3 >> 2) & 3);
            bArr2[2] = (byte) ((i3 >> 4) & 3);
            bArr2[3] = (byte) ((i3 >> 6) & 3);
            bArr[i2] = bArr2;
        }
        return bArr;
    }
}
