package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class st7 {
    public static final qt7 a = new Object();
    public static final qt7 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [qt7, java.lang.Object] */
    static {
        zff zffVar = zff.c;
        qt7 qt7Var = null;
        try {
            qt7Var = (qt7) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = qt7Var;
    }
}
