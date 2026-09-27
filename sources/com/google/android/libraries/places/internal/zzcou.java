package com.google.android.libraries.places.internal;

import defpackage.k84;
import defpackage.t81;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcou {
    private static final Logger zza = Logger.getLogger(zzcou.class.getName());
    private static final byte[] zzb = "-bin".getBytes(StandardCharsets.US_ASCII);

    private zzcou() {
    }

    public static byte[][] zza(zzcas zzcasVar) {
        int length;
        int i;
        byte[][] zzc = zzbzh.zzc(zzcasVar);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = zzc.length;
            if (i2 >= length) {
                break;
            }
            byte[] bArr = zzc[i2];
            byte[] bArr2 = zzc[i2 + 1];
            if (zzc(bArr, zzb)) {
                i = i3 + 2;
                zzc[i3] = bArr;
                zzc[i3 + 1] = zzbzh.zzb.c(bArr2).getBytes(StandardCharsets.US_ASCII);
            } else {
                for (byte b : bArr2) {
                    if (b < 32 || b > 126) {
                        String str = new String(bArr, StandardCharsets.US_ASCII);
                        Logger logger = zza;
                        Level level = Level.WARNING;
                        String arrays = Arrays.toString(bArr2);
                        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + str.length() + 21 + 34);
                        k84.q(sb, "Metadata key=", str, ", value=", arrays);
                        sb.append(" contains invalid ASCII characters");
                        logger.logp(level, "io.grpc.internal.TransportFrameUtil", "toHttp2Headers", sb.toString());
                        break;
                    }
                }
                i = i3 + 2;
                zzc[i3] = bArr;
                zzc[i3 + 1] = bArr2;
            }
            i3 = i;
            i2 += 2;
        }
        if (i3 == length) {
            return zzc;
        }
        return (byte[][]) Arrays.copyOfRange(zzc, 0, i3);
    }

    public static byte[][] zzb(byte[][] bArr) {
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            int i2 = i + 1;
            byte[] bArr3 = bArr[i2];
            byte[] bArr4 = zzb;
            if (zzc(bArr2, bArr4)) {
                for (byte b : bArr3) {
                    if (b == 44) {
                        ArrayList arrayList = new ArrayList(bArr.length + 10);
                        for (int i3 = 0; i3 < i; i3++) {
                            arrayList.add(bArr[i3]);
                        }
                        while (i < bArr.length) {
                            byte[] bArr5 = bArr[i];
                            byte[] bArr6 = bArr[i + 1];
                            if (!zzc(bArr5, bArr4)) {
                                arrayList.add(bArr5);
                                arrayList.add(bArr6);
                            } else {
                                int i4 = 0;
                                int i5 = 0;
                                while (true) {
                                    int length = bArr6.length;
                                    if (i4 <= length) {
                                        if (i4 == length || bArr6[i4] == 44) {
                                            byte[] a = t81.a.a(new String(bArr6, i5, i4 - i5, StandardCharsets.US_ASCII));
                                            arrayList.add(bArr5);
                                            arrayList.add(a);
                                            i5 = i4 + 1;
                                        }
                                        i4++;
                                    }
                                }
                            }
                            i += 2;
                        }
                        return (byte[][]) arrayList.toArray(new byte[0]);
                    }
                }
                bArr[i2] = t81.a.a(new String(bArr3, StandardCharsets.US_ASCII));
            }
            i += 2;
        }
        return bArr;
    }

    private static boolean zzc(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }
}
