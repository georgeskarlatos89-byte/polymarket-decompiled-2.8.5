package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class wgh {
    public static final LinkedHashSet a;
    public static final c44 b;

    static {
        List<xl8> listOf = CollectionsKt.listOf(bha.a, bha.h, bha.i, bha.c, bha.d, bha.f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (xl8 xl8Var : listOf) {
            xl8Var.getClass();
            linkedHashSet.add(new c44(xl8Var.b(), xl8Var.a.g()));
        }
        a = linkedHashSet;
        xl8 xl8Var2 = bha.g;
        xl8Var2.getClass();
        b = new c44(xl8Var2.b(), xl8Var2.a.g());
    }
}
