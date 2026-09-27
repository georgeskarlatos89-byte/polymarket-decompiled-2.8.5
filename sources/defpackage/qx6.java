package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qx6 implements kgf {
    public static final Object c = new Object();
    public volatile kgf a;
    public volatile Object b;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kgf, qx6] */
    public static kgf a(kgf kgfVar) {
        if (kgfVar instanceof qx6) {
            return kgfVar;
        }
        ?? obj = new Object();
        obj.b = c;
        obj.a = kgfVar;
        return obj;
    }

    @Override // defpackage.kgf
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.b;
                    if (obj == obj3) {
                        obj = this.a.get();
                        Object obj4 = this.b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.b = obj;
                        this.a = null;
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
