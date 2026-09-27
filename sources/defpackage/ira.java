package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ira {
    public int a;
    public vqa b;
    public final ArrayList c = new ArrayList(0);
    public ira d;
    public ira e;
    public dra f;
    public final ArrayList g;

    public ira(int i) {
        this.a = i;
        efc.a.getClass();
        List a = dfc.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.w(a));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            ((cia) ((efc) it.next())).getClass();
            arrayList.add(new eja());
        }
        this.g = arrayList;
    }

    public final vqa a() {
        vqa vqaVar = this.b;
        if (vqaVar != null) {
            return vqaVar;
        }
        Intrinsics.i("classifier");
        throw null;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (Intrinsics.areEqual(ira.class, cls)) {
                obj.getClass();
                ira iraVar = (ira) obj;
                if (this.a != iraVar.a || !Intrinsics.areEqual(a(), iraVar.a()) || !Intrinsics.areEqual(this.c, iraVar.c) || !Intrinsics.areEqual(this.e, iraVar.e) || !Intrinsics.areEqual(this.d, iraVar.d) || !Intrinsics.areEqual(this.f, iraVar.f) || !Intrinsics.areEqual(this.g, iraVar.g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((a().hashCode() + (this.a * 31)) * 31);
    }
}
