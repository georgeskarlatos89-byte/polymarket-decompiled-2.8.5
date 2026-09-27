package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class nmn extends nbl {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nmn(String str, Class cls, boolean z, boolean z2, int i) {
        super(str, cls, z, z2);
        this.f = i;
    }

    @Override // defpackage.nbl
    public void a(Iterator it, mfl mflVar) {
        switch (this.f) {
            case 0:
                if (it.hasNext()) {
                    Object next = it.next();
                    boolean hasNext = it.hasNext();
                    String str = this.a;
                    if (!hasNext) {
                        mflVar.a(str, next);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("[");
                    sb.append(next);
                    do {
                        sb.append(',');
                        sb.append(it.next());
                    } while (it.hasNext());
                    sb.append(']');
                    mflVar.a(str, sb.toString());
                    return;
                }
                return;
            default:
                super.a(it, mflVar);
                return;
        }
    }

    @Override // defpackage.nbl
    public void b(Object obj, mfl mflVar) {
        boolean z;
        switch (this.f) {
            case 1:
                zol zolVar = (zol) ((mpl) obj).a.f;
                zolVar.getClass();
                int i = 0;
                while (true) {
                    if (i < zolVar.a() - zolVar.b()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (i < zolVar.a() - zolVar.b()) {
                            Object obj2 = zolVar.b.b[zolVar.b() + i];
                            i++;
                            Map.Entry entry = (Map.Entry) obj2;
                            if (!((Set) entry.getValue()).isEmpty()) {
                                Iterator it = ((Set) entry.getValue()).iterator();
                                while (it.hasNext()) {
                                    mflVar.a((String) entry.getKey(), it.next());
                                }
                            } else {
                                mflVar.a((String) entry.getKey(), null);
                            }
                        } else {
                            dmk.t();
                            return;
                        }
                    } else {
                        return;
                    }
                }
            default:
                super.b(obj, mflVar);
                return;
        }
    }
}
