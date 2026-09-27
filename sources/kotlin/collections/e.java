package kotlin.collections;

import defpackage.c1c;
import defpackage.vzg;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class e extends vzg {
    public static HashSet c(Object... objArr) {
        HashSet hashSet = new HashSet(c1c.a(objArr.length));
        ArraysKt___ArraysKt.d(objArr, hashSet);
        return hashSet;
    }

    public static LinkedHashSet d(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(c1c.a(objArr.length));
        ArraysKt___ArraysKt.d(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static Set e(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(c1c.a(objArr.length));
        ArraysKt___ArraysKt.d(objArr, linkedHashSet);
        return linkedHashSet;
    }
}
