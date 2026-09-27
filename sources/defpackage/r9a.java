package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class r9a {
    public static final r9a a = new Object();
    public static final Integer b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, r9a] */
    static {
        Integer num;
        Object obj;
        Integer num2 = null;
        try {
            obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Throwable unused) {
        }
        if (obj instanceof Integer) {
            num = (Integer) obj;
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            b = num2;
        }
        num = null;
        if (num != null) {
            num2 = num;
        }
        b = num2;
    }
}
