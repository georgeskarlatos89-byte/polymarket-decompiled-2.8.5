package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class umg implements kk8 {
    public final ll9 a;
    public final List b;
    public final bm9 c;
    public final boolean d;
    public final d3g e;

    public umg(ll9 ll9Var, List list, bm9 bm9Var) {
        d3g d3gVar;
        list.getClass();
        this.a = ll9Var;
        this.b = list;
        this.c = bm9Var;
        List list2 = list;
        boolean z = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((wmg) it.next()).f()) {
                    z = true;
                    break;
                }
            }
        }
        this.d = z;
        Iterator it2 = this.b.iterator();
        while (true) {
            if (it2.hasNext()) {
                d3gVar = ((wmg) it2.next()).e();
                if (d3gVar != null) {
                    break;
                }
            } else {
                d3gVar = null;
                break;
            }
        }
        this.e = d3gVar;
    }

    @Override // defpackage.kk8
    public final void c(boolean z) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((wmg) it.next()).c(z);
        }
    }

    @Override // defpackage.kk8
    public final ll9 d() {
        return this.a;
    }

    @Override // defpackage.kk8
    public final d3g e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof umg) {
                umg umgVar = (umg) obj;
                if (!Intrinsics.areEqual(this.a, umgVar.a) || !Intrinsics.areEqual(this.b, umgVar.b) || !Intrinsics.areEqual(this.c, umgVar.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.kk8
    public final boolean f() {
        return this.d;
    }

    @Override // defpackage.kk8
    public final swh g() {
        Flow sdVar;
        List list = this.b;
        ArrayList arrayList = new ArrayList(CollectionsKt.w(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((wmg) it.next()).g());
        }
        if (arrayList.isEmpty()) {
            sdVar = epl.k(CollectionsKt.G(CollectionsKt.M0(CollectionsKt.emptyList())));
        } else {
            sdVar = new sd((Flow[]) CollectionsKt.M0(arrayList).toArray(new Flow[0]), 13);
        }
        return new tm6(sdVar, new td(12, arrayList));
    }

    @Override // defpackage.kk8
    public final swh h() {
        Flow sdVar;
        List list = this.b;
        ArrayList arrayList = new ArrayList(CollectionsKt.w(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((wmg) it.next()).h());
        }
        if (arrayList.isEmpty()) {
            sdVar = epl.k(CollectionsKt.G(CollectionsKt.M0(CollectionsKt.emptyList())));
        } else {
            sdVar = new sd((Flow[]) CollectionsKt.M0(arrayList).toArray(new Flow[0]), 14);
        }
        return new tm6(sdVar, new td(13, arrayList));
    }

    public final int hashCode() {
        return this.c.hashCode() + hdi.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "SectionElement(identifier=" + this.a + ", fields=" + this.b + ", controller=" + this.c + ")";
    }
}
