package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class z0o extends v1o {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0o(String str, Class cls, boolean z, boolean z2, int i) {
        super(str, cls, z, z2);
        this.f = i;
    }

    @Override // defpackage.v1o
    public void a(Iterator it, p2o p2oVar) {
        switch (this.f) {
            case 0:
                if (it.hasNext()) {
                    Object next = it.next();
                    boolean hasNext = it.hasNext();
                    String str = this.a;
                    if (!hasNext) {
                        p2oVar.a(str, next);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("[");
                    sb.append(next);
                    do {
                        sb.append(',');
                        sb.append(it.next());
                    } while (it.hasNext());
                    sb.append(']');
                    p2oVar.a(str, sb.toString());
                    return;
                }
                return;
            default:
                super.a(it, p2oVar);
                return;
        }
    }

    @Override // defpackage.v1o
    public void b(Object obj, p2o p2oVar) {
        boolean z;
        switch (this.f) {
            case 1:
                i6l i6lVar = (i6l) obj;
                if (i6lVar != null) {
                    f6l f6lVar = (f6l) i6lVar.a.f;
                    f6lVar.getClass();
                    int i = 0;
                    while (true) {
                        if (i < f6lVar.b() - f6lVar.a()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if (i < f6lVar.b() - f6lVar.a()) {
                                g6l g6lVar = f6lVar.b;
                                int a = f6lVar.a() + i;
                                i++;
                                Map.Entry entry = (Map.Entry) g6lVar.b[a];
                                if (!((Set) entry.getValue()).isEmpty()) {
                                    Iterator it = ((Set) entry.getValue()).iterator();
                                    while (it.hasNext()) {
                                        p2oVar.a((String) entry.getKey(), it.next());
                                    }
                                } else {
                                    p2oVar.a((String) entry.getKey(), null);
                                }
                            } else {
                                dmk.t();
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                super.b(obj, p2oVar);
                return;
        }
    }
}
