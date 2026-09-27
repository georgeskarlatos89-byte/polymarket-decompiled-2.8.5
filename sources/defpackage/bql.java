package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class bql {
    public static final sh1 a = new sh1(4, 4, 4, 4);
    public static final sh1 b = new sh1(8, 8, 8, 8);

    public static /* synthetic */ void a(a0i a0iVar, g6f g6fVar, String str, String str2) {
        a0iVar.a(g6fVar, str, str2, null);
    }

    public static final xl8 b(xl8 xl8Var, xl8 xl8Var2) {
        xl8Var.getClass();
        xl8Var2.getClass();
        yl8 yl8Var = xl8Var.a;
        yl8 yl8Var2 = xl8Var2.a;
        if (!Intrinsics.areEqual(xl8Var, xl8Var2) && !yl8Var2.c()) {
            String str = yl8Var.a;
            String str2 = yl8Var2.a;
            if (!e.u(str, str2, false) || str.charAt(str2.length()) != '.') {
                return xl8Var;
            }
        }
        if (!yl8Var2.c()) {
            if (Intrinsics.areEqual(xl8Var, xl8Var2)) {
                return xl8.c;
            }
            return new xl8(yl8Var.a.substring(yl8Var2.a.length() + 1));
        }
        return xl8Var;
    }
}
