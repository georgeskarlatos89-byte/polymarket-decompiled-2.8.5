package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class xi3 {
    public static final ofd a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z;
        wb6 wb6Var;
        String property = System.getProperty("ktor.internal.cio.disable.chararray.pooling");
        if (property != null) {
            z = Boolean.parseBoolean(property);
        } else {
            z = false;
        }
        if (z) {
            wb6Var = new Object();
        } else {
            wb6Var = new wb6(4096);
        }
        a = wb6Var;
    }
}
