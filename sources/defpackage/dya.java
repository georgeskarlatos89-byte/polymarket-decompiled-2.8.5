package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class dya implements lgf {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile lgf b;

    public dya(lgf lgfVar) {
        this.b = lgfVar;
    }

    @Override // defpackage.lgf
    public final Object get() {
        Object obj;
        Object obj2 = this.a;
        Object obj3 = c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.a;
                    if (obj == obj3) {
                        obj = this.b.get();
                        this.a = obj;
                        this.b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return obj;
        }
        return obj2;
    }
}
