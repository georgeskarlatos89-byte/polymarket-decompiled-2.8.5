package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class mpc extends f0c implements aka {
    public final /* synthetic */ int d = 0;
    public final Object e;
    public Object f;

    public mpc(Map map, Object obj, gib gibVar) {
        super(1, obj, gibVar.a);
        this.e = map;
        this.f = gibVar;
    }

    @Override // defpackage.f0c, java.util.Map.Entry
    public final Object getValue() {
        switch (this.d) {
            case 0:
                return this.f;
            default:
                return ((gib) this.f).a;
        }
    }

    @Override // defpackage.f0c, java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i;
        int i2 = this.d;
        Object obj2 = this.b;
        Object obj3 = this.e;
        switch (i2) {
            case 0:
                Object obj4 = this.f;
                this.f = obj;
                yje yjeVar = (yje) ((cke) obj3).b;
                wje wjeVar = yjeVar.e;
                if (wjeVar.containsKey(obj2)) {
                    boolean z = yjeVar.c;
                    if (z) {
                        if (z) {
                            aej aejVar = ((aej[]) yjeVar.d)[yjeVar.b];
                            Object obj5 = aejVar.b[aejVar.d];
                            wjeVar.put(obj2, obj);
                            if (obj5 != null) {
                                i = obj5.hashCode();
                            } else {
                                i = 0;
                            }
                            yjeVar.e(i, wjeVar.c, obj5, 0, 0, false);
                        } else {
                            dmk.t();
                            return null;
                        }
                    } else {
                        wjeVar.put(obj2, obj);
                    }
                    yjeVar.h = wjeVar.e;
                    return obj4;
                }
                return obj4;
            default:
                gib gibVar = (gib) this.f;
                Object obj6 = gibVar.a;
                gib gibVar2 = new gib(obj, gibVar.b, gibVar.c);
                this.f = gibVar2;
                ((Map) obj3).put(obj2, gibVar2);
                return obj6;
        }
    }

    public mpc(cke ckeVar, Object obj, Object obj2) {
        super(1, obj, obj2);
        this.e = ckeVar;
        this.f = obj2;
    }
}
