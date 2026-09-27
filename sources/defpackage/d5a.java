package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class d5a {
    public static final Charset a;
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        dmk.s(str);
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
