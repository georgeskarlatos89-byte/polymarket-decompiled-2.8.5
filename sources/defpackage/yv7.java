package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class yv7 extends xcg {
    private final HashMap<Object, ucg> e = new HashMap<>();

    @Override // defpackage.xcg
    public final ucg b(Object obj) {
        return this.e.get(obj);
    }

    @Override // defpackage.xcg
    public final Object d(Object obj) {
        Object d = super.d(obj);
        this.e.remove(obj);
        return d;
    }

    public final ucg f(l7b l7bVar) {
        if (this.e.containsKey(l7bVar)) {
            return this.e.get(l7bVar).d;
        }
        return null;
    }

    public final boolean h(l7b l7bVar) {
        return this.e.containsKey(l7bVar);
    }

    public final Object i(Object obj, Object obj2) {
        ucg b = b(obj);
        if (b != null) {
            return b.b;
        }
        HashMap<Object, ucg> hashMap = this.e;
        ucg ucgVar = new ucg(obj, obj2);
        this.d++;
        ucg ucgVar2 = this.b;
        if (ucgVar2 == null) {
            this.a = ucgVar;
            this.b = ucgVar;
        } else {
            ucgVar2.c = ucgVar;
            ucgVar.d = ucgVar2;
            this.b = ucgVar;
        }
        hashMap.put(obj, ucgVar);
        return null;
    }
}
