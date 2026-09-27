package defpackage;

import android.graphics.PathMeasure;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class tcn {
    public static final f40 a() {
        return new f40(new PathMeasure());
    }

    public static final kvh b(s34 s34Var, s34 s34Var2) {
        s34Var.getClass();
        s34Var2.getClass();
        s34Var.h().size();
        s34Var2.h().size();
        List h = s34Var.h();
        h.getClass();
        List list = h;
        ArrayList arrayList = new ArrayList(CollectionsKt.w(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((lhj) it.next()).d());
        }
        List h2 = s34Var2.h();
        h2.getClass();
        List list2 = h2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.w(list2));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            s7h g = ((lhj) it2.next()).g();
            g.getClass();
            arrayList2.add(new jvh(g));
        }
        Map n = d1c.n(CollectionsKt.U0(arrayList, arrayList2));
        n.getClass();
        return new kvh(n, 1);
    }

    public static void c(boolean z, String str) {
        if (z) {
            return;
        }
        dmk.n(str);
    }

    public static String d(int i, int i2, String str) {
        if (i < 0) {
            return cen.f("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        return cen.f("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
    }
}
