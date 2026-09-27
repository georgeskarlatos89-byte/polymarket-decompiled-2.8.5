package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class c0a implements dv7, cya {
    public static final c0a b = new c0a(null);
    public final Object a;

    public c0a(Object obj) {
        this.a = obj;
    }

    public static c0a a(Object obj) {
        if (obj != null) {
            return new c0a(obj);
        }
        dmk.s("instance cannot be null");
        return null;
    }

    public static c0a b(Object obj) {
        if (obj == null) {
            return b;
        }
        return new c0a(obj);
    }

    @Override // defpackage.kgf
    public final Object get() {
        return this.a;
    }
}
