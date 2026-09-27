package defpackage;

import java.security.cert.CertificateException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class r7n {
    public static LinkedList a(List list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                try {
                    linkedList.add(s7n.b(((d81) list.get(i)).a()));
                } catch (CertificateException e) {
                    StringBuilder o = ace.o(i, "Invalid X.509 certificate at position ", ": ");
                    o.append(e.getMessage());
                    throw new ParseException(o.toString(), 0);
                }
            }
        }
        return linkedList;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [kotlin.ranges.a, kotlin.ranges.IntRange] */
    public static bpb b(v0h v0hVar) {
        int i;
        aga agaVar;
        v0hVar.getClass();
        aga p = v0hVar.p();
        aga agaVar2 = h8m.i;
        if (Intrinsics.areEqual(p, agaVar2)) {
            int i2 = v0hVar.b;
            ArrayList arrayList = new ArrayList();
            v0h b = v0hVar.b();
            int i3 = -239;
            int i4 = -239;
            while (true) {
                aga p2 = b.p();
                i = b.b;
                agaVar = h8m.j;
                if (Intrinsics.areEqual(p2, agaVar) || b.p() == null) {
                    break;
                }
                if (i3 + 1 != i) {
                    if (i4 != -239) {
                        arrayList.add(new a(i4, i3, 1));
                    }
                    i4 = i;
                }
                if (Intrinsics.areEqual(b.p(), agaVar2)) {
                    i3 = i;
                    break;
                }
                b = b.b();
                i3 = i;
            }
            if (Intrinsics.areEqual(b.p(), agaVar) && i != i2 + 1) {
                List c = eb4.c(new wwg(new a(i2, i + 1, 1), b8m.n));
                if (i4 != -239) {
                    arrayList.add(new a(i4, i3, 1));
                }
                return new bpb(b, (Collection) c, arrayList);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [kotlin.ranges.a, kotlin.ranges.IntRange] */
    public static bpb c(v0h v0hVar) {
        int i;
        aga agaVar;
        v0hVar.getClass();
        aga p = v0hVar.p();
        aga agaVar2 = h8m.i;
        if (Intrinsics.areEqual(p, agaVar2)) {
            int i2 = v0hVar.b;
            ArrayList arrayList = new ArrayList();
            v0h b = v0hVar.b();
            int i3 = -239;
            int i4 = -239;
            int i5 = 1;
            while (true) {
                aga p2 = b.p();
                i = b.b;
                agaVar = h8m.j;
                if (p2 == null || (Intrinsics.areEqual(b.p(), agaVar) && i5 - 1 == 0)) {
                    break;
                }
                if (i3 + 1 != i) {
                    if (i4 != -239) {
                        arrayList.add(new a(i4, i3, 1));
                    }
                    i4 = i;
                }
                if (Intrinsics.areEqual(b.p(), agaVar2)) {
                    i5++;
                }
                b = b.b();
                i3 = i;
            }
            if (Intrinsics.areEqual(b.p(), agaVar)) {
                List c = eb4.c(new wwg(new a(i2, i + 1, 1), b8m.q));
                if (i4 != -239) {
                    arrayList.add(new a(i4, i3, 1));
                }
                return new bpb(b, (Collection) c, arrayList);
            }
            return null;
        }
        return null;
    }

    public static LinkedList e(List list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj != null) {
                if (obj instanceof String) {
                    linkedList.add(new d81((String) obj));
                } else {
                    fi9.g(sv6.j(i, "The X.509 certificate at position ", " must be encoded as a Base64 string"));
                    return null;
                }
            } else {
                fi9.g(sv6.j(i, "The X.509 certificate at position ", " must not be null"));
                return null;
            }
        }
        return linkedList;
    }

    public abstract mta d(mta mtaVar);
}
