package defpackage;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class k13 {
    public static final k13 b;
    public static final k13 c;
    public final LinkedHashSet a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new c6b(0));
        b = new k13(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new c6b(1));
        c = new k13(linkedHashSet2);
    }

    public k13(LinkedHashSet linkedHashSet) {
        this.a = linkedHashSet;
    }

    public final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            c6b c6bVar = (c6b) it.next();
            List<x03> unmodifiableList = Collections.unmodifiableList(arrayList2);
            c6bVar.getClass();
            ArrayList arrayList3 = new ArrayList();
            for (x03 x03Var : unmodifiableList) {
                grn.b("The camera info doesn't contain internal implementation.", x03Var instanceof x03);
                if (x03Var.i() == c6bVar.a) {
                    arrayList3.add(x03Var);
                }
            }
            arrayList2 = arrayList3;
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final Integer b() {
        Iterator it = this.a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            c6b c6bVar = (c6b) it.next();
            if (c6bVar instanceof c6b) {
                Integer valueOf = Integer.valueOf(c6bVar.a);
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    dmk.n("Multiple conflicting lens facing requirements exist.");
                    return null;
                }
            }
        }
        return num;
    }

    public final a13 c(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((a13) it.next()).b());
        }
        ArrayList a = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            a13 a13Var = (a13) it2.next();
            if (a.contains(a13Var.b())) {
                linkedHashSet2.add(a13Var);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (a13) it3.next();
        }
        StringBuilder sb = new StringBuilder("Cams:");
        sb.append(linkedHashSet.size());
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            x03 j = ((a13) it4.next()).j();
            sb.append(" Id:" + j.f() + "  Lens:" + j.i());
        }
        String sb2 = sb.toString();
        LinkedHashSet linkedHashSet3 = this.a;
        StringBuilder sb3 = new StringBuilder(ace.f(linkedHashSet3.size(), "PhyId:null  Filters:"));
        Iterator it5 = linkedHashSet3.iterator();
        while (it5.hasNext()) {
            c6b c6bVar = (c6b) it5.next();
            sb3.append(" Id:");
            c6bVar.getClass();
            sb3.append(c6b.b);
            if (c6bVar instanceof c6b) {
                sb3.append(" LensFilter:");
                sb3.append(c6bVar.a);
            }
        }
        dmk.v(m51.k("No available camera can be found. ", sb2, ApiConstant.SPACE, sb3.toString()));
        return null;
    }
}
