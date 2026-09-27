package defpackage;

import android.net.Uri;
import java.util.Map;
import kotlin.UInt;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class w7n {
    public static final String a(String str, Map map) {
        if (map.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str3 != null) {
                buildUpon.appendQueryParameter(str2, str3);
            }
        }
        String uri = buildUpon.build().toString();
        uri.getClass();
        return uri;
    }

    public static int b(int i, byte[] bArr) {
        return UInt.m886constructorimpl(((bArr[i + 3] & MessagePack.Code.EXT_TIMESTAMP) << 24) | (bArr[i] & MessagePack.Code.EXT_TIMESTAMP) | ((bArr[i + 1] & MessagePack.Code.EXT_TIMESTAMP) << 8) | ((bArr[i + 2] & MessagePack.Code.EXT_TIMESTAMP) << 16));
    }

    public static int c(int i, int i2) {
        return UInt.m886constructorimpl(UInt.m886constructorimpl(Integer.rotateLeft(UInt.m886constructorimpl(UInt.m886constructorimpl(i2 * (-2048144777)) + i), 13)) * (-1640531535));
    }
}
