package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg(with = yv5.class)
/* loaded from: classes6.dex */
public abstract class xv5 {
    public static final ov5 Companion = new Object();
    public static final sv5 a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ov5] */
    static {
        new wv5(1L).b(1000).b(1000).b(1000).b(60).b(60);
        a = new sv5(1);
        new sv5(Math.multiplyExact(1, 7));
        new uv5(1);
        new uv5(Math.multiplyExact(1, 3));
        int multiplyExact = Math.multiplyExact(1, 12);
        new uv5(multiplyExact);
        new uv5(Math.multiplyExact(multiplyExact, 100));
    }

    public static String a(int i, String str) {
        if (i == 1) {
            return str;
        }
        return i + '-' + str;
    }
}
