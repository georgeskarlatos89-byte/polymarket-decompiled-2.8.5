package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class e99 extends f99 {
    public static final e99 n;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final el8 j;
    public final List k;
    public final Map l;
    public final List m;

    static {
        List list = Collections.EMPTY_LIST;
        n = new e99("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public e99(String str, List list, List list2, List list3, List list4, List list5, List list6, el8 el8Var, List list7, boolean z, Map map, List list8) {
        super(str, list, z);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = ((d99) list2.get(i)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.d = Collections.unmodifiableList(arrayList);
        this.e = Collections.unmodifiableList(list2);
        this.f = Collections.unmodifiableList(list3);
        this.g = Collections.unmodifiableList(list4);
        this.h = Collections.unmodifiableList(list5);
        this.i = Collections.unmodifiableList(list6);
        this.j = el8Var;
        if (list7 != null) {
            list9 = Collections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.k = list9;
        this.l = Collections.unmodifiableMap(map);
        this.m = Collections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((c99) list.get(i)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(int i, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 < list2.size()) {
                    uzh uzhVar = (uzh) list2.get(i3);
                    if (uzhVar.b == i && uzhVar.c == i2) {
                        arrayList.add(obj);
                        break;
                    }
                    i3++;
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.f99
    public final Object a(List list) {
        ArrayList c = c(0, this.e, list);
        List list2 = Collections.EMPTY_LIST;
        return new e99(this.a, this.b, c, list2, c(1, this.g, list), c(2, this.h, list), list2, this.j, this.k, this.c, this.l, this.m);
    }
}
