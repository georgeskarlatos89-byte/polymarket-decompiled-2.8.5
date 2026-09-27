package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class izg implements dv7 {
    public static final /* synthetic */ int c = 0;
    public final List a;
    public final List b;

    static {
        c0a.a(Collections.EMPTY_SET);
    }

    public izg(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.kgf
    public final Object get() {
        int i;
        List list = this.a;
        int size = list.size();
        List list2 = this.b;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Collection collection = (Collection) ((jgf) list2.get(i2)).get();
            size += collection.size();
            arrayList.add(collection);
        }
        if (size < 3) {
            i = size + 1;
        } else if (size < 1073741824) {
            i = (int) ((size / 0.75f) + 1.0f);
        } else {
            i = bd0.API_PRIORITY_OTHER;
        }
        HashSet hashSet = new HashSet(i);
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object obj = ((jgf) list.get(i3)).get();
            obj.getClass();
            hashSet.add(obj);
        }
        int size4 = arrayList.size();
        for (int i4 = 0; i4 < size4; i4++) {
            for (Object obj2 : (Collection) arrayList.get(i4)) {
                obj2.getClass();
                hashSet.add(obj2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
