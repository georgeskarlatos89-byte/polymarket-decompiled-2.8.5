package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class lcf {
    public final gka a;
    public final String b;

    public lcf(gka gkaVar, String str) {
        str.getClass();
        this.a = gkaVar;
        this.b = str;
    }

    public final Object a(Object obj) {
        Object obj2 = this.a.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        dmk.n(woa.r(new StringBuilder("Field "), this.b, " is not set"));
        return null;
    }
}
