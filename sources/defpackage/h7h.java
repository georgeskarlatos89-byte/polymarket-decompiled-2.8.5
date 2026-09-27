package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class h7h implements v5c {
    public static final h7h a = new Object();

    @Override // defpackage.v5c
    public final w5c b(x5c x5cVar, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            cne T = ((o5c) list.get(i3)).T(j);
            i = Math.max(i, T.a);
            i2 = Math.max(i2, T.b);
            arrayList.add(T);
        }
        return x5c.r0(x5cVar, i, i2, new kb0(3, arrayList));
    }
}
