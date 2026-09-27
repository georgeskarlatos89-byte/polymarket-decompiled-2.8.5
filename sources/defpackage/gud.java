package defpackage;

import java.lang.reflect.Array;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class gud extends xln {
    public final /* synthetic */ int a;
    public final /* synthetic */ xln b;

    public /* synthetic */ gud(xln xlnVar, int i) {
        this.a = i;
        this.b = xlnVar;
    }

    @Override // defpackage.xln
    public final void b(q1g q1gVar, Object obj) {
        int i = this.a;
        xln xlnVar = this.b;
        switch (i) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        xlnVar.b(q1gVar, it.next());
                    }
                    return;
                }
                return;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i2 = 0; i2 < length; i2++) {
                        xlnVar.b(q1gVar, Array.get(obj, i2));
                    }
                    return;
                }
                return;
        }
    }
}
