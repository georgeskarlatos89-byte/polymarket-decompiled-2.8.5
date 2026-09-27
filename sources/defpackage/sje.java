package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sje extends uje implements xr4 {
    public static final sje g = new uje(zdj.e, 0);

    @Override // defpackage.uje, defpackage.q3, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof ggf)) {
            return false;
        }
        return super.containsKey((ggf) obj);
    }

    @Override // defpackage.q3, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof p3k)) {
            return false;
        }
        return super.containsValue((p3k) obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xje, rje] */
    @Override // defpackage.uje
    public final xje f() {
        ?? xjeVar = new xje(this);
        xjeVar.g = this;
        return xjeVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xje, rje] */
    @Override // defpackage.uje
    public final xje g() {
        ?? xjeVar = new xje(this);
        xjeVar.g = this;
        return xjeVar;
    }

    @Override // defpackage.uje, defpackage.q3, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof ggf)) {
            return null;
        }
        return (p3k) super.get((ggf) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof ggf)) {
            return obj2;
        }
        return (p3k) super.getOrDefault((ggf) obj, (p3k) obj2);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [uje, sje] */
    public final sje i(ggf ggfVar, p3k p3kVar) {
        v0h u = this.d.u(ggfVar, ggfVar.hashCode(), 0, p3kVar);
        if (u == null) {
            return this;
        }
        return new uje((zdj) u.c, this.e + u.b);
    }
}
