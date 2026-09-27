package defpackage;

import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.collections.ArraysKt;
import kotlinx.serialization.KSerializer;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class qlm {
    public static final w97 a = new w97(16);

    public static final gw9 a(String str, KSerializer kSerializer) {
        return new gw9(str, new hw9(kSerializer));
    }

    public static void b(byte[] bArr, LinkedHashMap linkedHashMap) {
        boolean z;
        int i = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            String format = String.format("%02X", Arrays.copyOf(new Object[]{Integer.valueOf(b & MessagePack.Code.EXT_TIMESTAMP)}, 1));
            if ((b & 32) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((b & 31) == 31) {
                i++;
                format = format.concat(String.format("%02X", Arrays.copyOf(new Object[]{Integer.valueOf(bArr[i] & MessagePack.Code.EXT_TIMESTAMP)}, 1)));
            }
            int i2 = i + 1;
            int i3 = i + 2;
            byte b2 = bArr[i2];
            int i4 = b2 & MessagePack.Code.EXT_TIMESTAMP;
            if (i4 > 128) {
                int i5 = b2 & Byte.MAX_VALUE;
                i4 = 0;
                int i6 = 0;
                while (i6 < i5) {
                    i4 = (i4 << 8) | (bArr[i3] & MessagePack.Code.EXT_TIMESTAMP);
                    i6++;
                    i3++;
                }
            }
            int i7 = i3 + i4;
            byte[] copyOfRange = ArraysKt.copyOfRange(bArr, i3, i7);
            linkedHashMap.put(format, copyOfRange);
            if (z) {
                b(copyOfRange, linkedHashMap);
            }
            i = i7;
        }
    }
}
