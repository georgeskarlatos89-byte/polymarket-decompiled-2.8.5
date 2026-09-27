package kotlin.collections;

import defpackage.ace;
import defpackage.r3c;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class b extends CollectionsKt__MutableCollectionsKt {
    public static r3c j(List list) {
        list.getClass();
        return new r3c(list);
    }

    public static final int k(int i, List list) {
        if (i >= 0 && i <= list.size() - 1) {
            return (list.size() - 1) - i;
        }
        StringBuilder o = ace.o(i, "Element index ", " must be in range [");
        o.append(new kotlin.ranges.a(0, list.size() - 1, 1));
        o.append("].");
        throw new IndexOutOfBoundsException(o.toString());
    }

    public static final int l(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder o = ace.o(i, "Position index ", " must be in range [");
        o.append(new kotlin.ranges.a(0, list.size(), 1));
        o.append("].");
        throw new IndexOutOfBoundsException(o.toString());
    }
}
