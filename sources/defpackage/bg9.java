package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class bg9 extends wb6 {
    @Override // defpackage.wb6
    public final Object e(Object obj) {
        t59 t59Var = (t59) obj;
        ArrayList arrayList = t59Var.a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dg9.a.e1((int[]) it.next());
        }
        arrayList.clear();
        return t59Var;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [t59, java.lang.Object] */
    @Override // defpackage.wb6
    public final Object g() {
        ?? obj = new Object();
        obj.a = new ArrayList();
        return obj;
    }
}
