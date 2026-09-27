package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class xgl {
    public static final mgl d = new mgl();
    public static final pgl e = new pgl(0);
    public final HashMap a;
    public final HashMap b;
    public pgl c;

    public xgl(xgl xglVar) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        hashMap.putAll(xglVar.a);
        hashMap2.putAll(xglVar.b);
        this.c = xglVar.c;
    }

    public void a(nbl nblVar, Object obj, mfl mflVar) {
        mgl mglVar = (mgl) this.a.get(nblVar);
        if (mglVar != null) {
            switch (mglVar.a) {
                case 0:
                    return;
                default:
                    if (nblVar.d && ((lsl) lsl.b.get()).a > 20) {
                        mflVar.a(nblVar.a, obj);
                        return;
                    } else {
                        nblVar.b(obj, mflVar);
                        return;
                    }
            }
        }
        if (nblVar.d && ((lsl) lsl.b.get()).a > 20) {
            mflVar.a(nblVar.a, obj);
        } else {
            nblVar.b(obj, mflVar);
        }
    }

    public void b(nbl nblVar, Iterator it, mfl mflVar) {
        pgl pglVar = this.c;
        pgl pglVar2 = (pgl) this.b.get(nblVar);
        if (pglVar2 != null) {
            pglVar2.a(nblVar, it, mflVar);
        } else if (pglVar != null && !this.a.containsKey(nblVar)) {
            pglVar.a(nblVar, it, mflVar);
        } else {
            while (it.hasNext()) {
                a(nblVar, it.next(), mflVar);
            }
        }
    }

    public /* synthetic */ xgl() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = null;
    }
}
