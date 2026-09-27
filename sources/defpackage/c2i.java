package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class c2i {
    public static final Charset a = Charset.defaultCharset();
    public static final Charset b;

    static {
        Charset charset;
        Charset charset2 = null;
        try {
            charset = Charset.forName("SJIS");
        } catch (UnsupportedCharsetException unused) {
            charset = null;
        }
        b = charset;
        try {
            Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
        }
        try {
            charset2 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        Charset charset3 = b;
        if ((charset3 == null || !charset3.equals(a)) && charset2 != null) {
            charset2.equals(a);
        }
    }
}
