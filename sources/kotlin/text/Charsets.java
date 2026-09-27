package kotlin.text;

import java.nio.charset.Charset;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/text/Charsets;", "", "Ljava/nio/charset/Charset;", "UTF_8", "Ljava/nio/charset/Charset;", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Charsets {
    public static final Charset UTF_8;
    public static final Charsets a = new Object();
    public static final Charset b;
    public static final Charset c;
    public static final Charset d;
    public static final Charset e;
    public static final Charset f;
    public static volatile Charset g;
    public static volatile Charset h;
    public static volatile Charset i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.text.Charsets] */
    static {
        Charset forName = Charset.forName("UTF-8");
        forName.getClass();
        UTF_8 = forName;
        Charset forName2 = Charset.forName("UTF-16");
        forName2.getClass();
        b = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        forName3.getClass();
        c = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        forName4.getClass();
        d = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        forName5.getClass();
        e = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        forName6.getClass();
        f = forName6;
    }
}
