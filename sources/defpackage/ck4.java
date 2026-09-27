package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ck4 {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final yk4 f;
    public final Set g;

    public ck4(String str, Set set, Set set2, int i, int i2, yk4 yk4Var, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = yk4Var;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static bk4 a(xif xifVar) {
        return new bk4(xifVar, new xif[0]);
    }

    public static bk4 b(Class cls) {
        return new bk4(cls, new Class[0]);
    }

    public static ck4 c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(xif.a(cls));
        for (Class cls2 : clsArr) {
            drn.a(cls2, "Null interface");
            hashSet.add(xif.a(cls2));
        }
        return new ck4(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new ak4(obj, 1), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
