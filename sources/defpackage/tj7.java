package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class tj7 {
    public static final tj7 a = new Object();
    public static final yi7 b = yi7.a;
    public static final gi7 c = new gi7(csc.g(String.format(ri7.ERROR_CLASS.a(), Arrays.copyOf(new Object[]{"unknown class"}, 1))));
    public static final qj7 d = c(sj7.CYCLIC_SUPERTYPES, new String[0]);
    public static final qj7 e = c(sj7.ERROR_PROPERTY_TYPE, new String[0]);
    public static final Set f = vzg.b(new zi7());

    public static final jj7 a(kj7 kj7Var, boolean z, String... strArr) {
        kj7Var.getClass();
        if (z) {
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            return new jj7(kj7Var, (String[]) Arrays.copyOf(strArr2, strArr2.length));
        }
        return new jj7(kj7Var, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final jj7 b(kj7 kj7Var, String... strArr) {
        kj7Var.getClass();
        return a(kj7Var, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final qj7 c(sj7 sj7Var, String... strArr) {
        sj7Var.getClass();
        List emptyList = CollectionsKt.emptyList();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        emptyList.getClass();
        return e(sj7Var, emptyList, d(sj7Var, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static rj7 d(sj7 sj7Var, String... strArr) {
        sj7Var.getClass();
        return new rj7(sj7Var, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static qj7 e(sj7 sj7Var, List list, ogj ogjVar, String... strArr) {
        sj7Var.getClass();
        list.getClass();
        return new qj7(ogjVar, b(kj7.ERROR_TYPE_SCOPE, ogjVar.toString()), sj7Var, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean f(tw5 tw5Var) {
        if (tw5Var != null) {
            if ((tw5Var instanceof gi7) || (tw5Var.e() instanceof gi7) || tw5Var == b) {
                return true;
            }
            return false;
        }
        return false;
    }
}
