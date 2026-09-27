package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class px6 implements jgf, cya {
    public static final Object c = new Object();
    public volatile jgf a;
    public volatile Object b = c;

    public px6(jgf jgfVar) {
        this.a = jgfVar;
    }

    public static cya a(jgf jgfVar) {
        if (jgfVar instanceof cya) {
            return (cya) jgfVar;
        }
        jgfVar.getClass();
        return new px6(jgfVar);
    }

    public static jgf b(jgf jgfVar) {
        jgfVar.getClass();
        if (jgfVar instanceof px6) {
            return jgfVar;
        }
        return new px6(jgfVar);
    }

    @Override // defpackage.kgf
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 == obj3) {
            synchronized (this) {
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
            }
            return obj;
        }
        return obj2;
    }
}
