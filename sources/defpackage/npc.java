package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class npc extends f0c implements aka {
    public final cke d;
    public Object e;

    public npc(cke ckeVar, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.d = ckeVar;
        this.e = obj2;
    }

    @Override // defpackage.f0c, java.util.Map.Entry
    public final Object getValue() {
        return this.e;
    }

    @Override // defpackage.f0c, java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i;
        Object obj2 = this.e;
        this.e = obj;
        zje zjeVar = (zje) this.d.b;
        xje xjeVar = zjeVar.e;
        Object obj3 = this.b;
        if (!xjeVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z = zjeVar.c;
        if (z) {
            if (z) {
                aej aejVar = ((aej[]) zjeVar.d)[zjeVar.b];
                Object obj4 = aejVar.b[aejVar.d];
                xjeVar.put(obj3, obj);
                if (obj4 != null) {
                    i = obj4.hashCode();
                } else {
                    i = 0;
                }
                zjeVar.e(i, xjeVar.c, obj4, 0);
            } else {
                dmk.t();
                return null;
            }
        } else {
            xjeVar.put(obj3, obj);
        }
        zjeVar.h = xjeVar.e;
        return obj2;
    }
}
