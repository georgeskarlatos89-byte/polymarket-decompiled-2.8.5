package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qyg {
    public static final List j = Arrays.asList(1, 5, 3);
    public final ArrayList a;
    public final yx0 b;
    public final List c;
    public final List d;
    public final List e;
    public final myg f;
    public final g33 g;
    public final int h;
    public final InputConfiguration i;

    public qyg(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, g33 g33Var, myg mygVar, InputConfiguration inputConfiguration, int i, yx0 yx0Var) {
        this.a = arrayList;
        this.c = Collections.unmodifiableList(arrayList2);
        this.d = Collections.unmodifiableList(arrayList3);
        this.e = Collections.unmodifiableList(arrayList4);
        this.f = mygVar;
        this.g = g33Var;
        this.i = inputConfiguration;
        this.h = i;
        this.b = yx0Var;
    }

    public static qyg a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        wpc p = wpc.p();
        ArrayList arrayList5 = new ArrayList();
        uqc a = uqc.a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        lld g = lld.g(p);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        oki okiVar = oki.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = a.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new qyg(arrayList, arrayList2, arrayList3, arrayList4, new g33(arrayList6, g, -1, false, arrayList7, false, new oki(arrayMap), null), null, null, 0, null);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            yx0 yx0Var = (yx0) it.next();
            arrayList.add(yx0Var.a);
            Iterator it2 = yx0Var.b.iterator();
            while (it2.hasNext()) {
                arrayList.add((gi6) it2.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
