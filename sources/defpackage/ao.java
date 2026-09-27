package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ao implements fsb {
    public static final ao a = new Object();
    public static erb b = erb.ERROR;
    public static fsb c;

    public static boolean c(erb erbVar) {
        if (erbVar.a() <= b.a()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fsb
    public final void a(String str) {
        fsb fsbVar;
        if (c(erb.WARN) && (fsbVar = c) != null) {
            fsbVar.a(str);
        }
    }

    @Override // defpackage.fsb
    public final void b(String str) {
        fsb fsbVar;
        if (c(erb.DEBUG) && (fsbVar = c) != null) {
            fsbVar.b(str);
        }
    }

    @Override // defpackage.fsb
    public final void i(String str) {
        fsb fsbVar;
        if (c(erb.VERBOSE) && (fsbVar = c) != null) {
            fsbVar.i(str);
        }
    }
}
