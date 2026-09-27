package com.google.android.libraries.places.internal;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzccc implements zzcar {
    private static final byte[] zza = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    public /* synthetic */ zzccc(byte[] bArr) {
    }

    private static boolean zzc(byte b) {
        if (b >= 32 && b < 126 && b != 37) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzcar
    public final /* bridge */ /* synthetic */ byte[] zza(Object obj) {
        byte[] bytes = ((String) obj).getBytes(StandardCharsets.UTF_8);
        int i = 0;
        while (true) {
            int length = bytes.length;
            if (i < length) {
                if (zzc(bytes[i])) {
                    byte[] bArr = new byte[((length - i) * 3) + i];
                    if (i != 0) {
                        System.arraycopy(bytes, 0, bArr, 0, i);
                    }
                    int i2 = i;
                    while (i < bytes.length) {
                        int i3 = i2 + 1;
                        byte b = bytes[i];
                        if (zzc(b)) {
                            bArr[i2] = 37;
                            byte[] bArr2 = zza;
                            bArr[i3] = bArr2[(b >> 4) & 15];
                            bArr[i2 + 2] = bArr2[b & 15];
                            i2 += 3;
                        } else {
                            bArr[i2] = b;
                            i2 = i3;
                        }
                        i++;
                    }
                    return Arrays.copyOf(bArr, i2);
                }
                i++;
            } else {
                return bytes;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcar
    public final /* bridge */ /* synthetic */ Object zzb(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i < length) {
                byte b = bArr[i];
                if (b < 32 || b >= 126 || (b == 37 && i + 2 < length)) {
                    break;
                }
                i++;
            } else {
                return new String(bArr, 0);
            }
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        int i2 = 0;
        while (true) {
            int length2 = bArr.length;
            if (i2 < length2) {
                int i3 = i2 + 1;
                if (bArr[i2] == 37 && i2 + 2 < length2) {
                    try {
                        allocate.put((byte) Integer.parseInt(new String(bArr, i3, 2, StandardCharsets.US_ASCII), 16));
                        i2 += 3;
                    } catch (NumberFormatException unused) {
                    }
                }
                allocate.put(bArr[i2]);
                i2 = i3;
            } else {
                return new String(allocate.array(), 0, allocate.position(), StandardCharsets.UTF_8);
            }
        }
    }

    private zzccc() {
        throw null;
    }
}
