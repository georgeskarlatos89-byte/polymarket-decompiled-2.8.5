package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface v5c {
    default int a(y6a y6aVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new z56((o5c) list.get(i2), z6a.Max, d7a.Width, 0));
        }
        return b(new n7a(y6aVar, ((x8d) y6aVar).p.A), arrayList, uz4.b(0, 0, 0, i, 7)).getWidth();
    }

    w5c b(x5c x5cVar, List list, long j);

    default int c(y6a y6aVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new z56((o5c) list.get(i2), z6a.Min, d7a.Width, 0));
        }
        return b(new n7a(y6aVar, ((x8d) y6aVar).p.A), arrayList, uz4.b(0, 0, 0, i, 7)).getWidth();
    }

    default int d(y6a y6aVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new z56((o5c) list.get(i2), z6a.Max, d7a.Height, 0));
        }
        return b(new n7a(y6aVar, ((x8d) y6aVar).p.A), arrayList, uz4.b(0, i, 0, 0, 13)).getHeight();
    }

    default int e(y6a y6aVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new z56((o5c) list.get(i2), z6a.Min, d7a.Height, 0));
        }
        return b(new n7a(y6aVar, ((x8d) y6aVar).p.A), arrayList, uz4.b(0, i, 0, 0, 13)).getHeight();
    }
}
