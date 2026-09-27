package defpackage;

import java.nio.charset.Charset;
import java.security.SecureRandom;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class q1k {
    public static final /* synthetic */ int a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static int a() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((bArr[2] & MessagePack.Code.EXT_TIMESTAMP) << 8) | (bArr[3] & MessagePack.Code.EXT_TIMESTAMP);
        }
        return i;
    }

    public static final pw1 b(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '!' && charAt <= '~') {
                bArr[i] = (byte) charAt;
            } else {
                throw new RuntimeException("Not a printable ASCII character: " + charAt);
            }
        }
        return pw1.a(bArr);
    }
}
