package defpackage;

import java.util.Arrays;
import java.util.Locale;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ot5 {
    public final IntRange a;
    public final tt5 b;
    public final it5 c;
    public final String d;
    public final String e;

    public ot5(IntRange intRange, tt5 tt5Var, it5 it5Var, zt5 zt5Var, String str, String str2, String str3) {
        this.a = intRange;
        this.b = tt5Var;
        this.c = it5Var;
        this.d = str;
        this.e = str2;
    }

    public final String a(uu2 uu2Var, Locale locale) {
        if (uu2Var == null) {
            String upperCase = this.c.a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            Object[] copyOf = Arrays.copyOf(new Object[]{upperCase}, 1);
            return String.format(this.d, Arrays.copyOf(copyOf, copyOf.length));
        }
        int i = uu2Var.a;
        IntRange intRange = this.a;
        if (!intRange.a(i)) {
            Object[] copyOf2 = Arrays.copyOf(new Object[]{vu2.a(intRange.a, locale, 7), vu2.a(intRange.b, locale, 7)}, 2);
            return String.format(this.e, Arrays.copyOf(copyOf2, copyOf2.length));
        }
        this.b.getClass();
        return "";
    }
}
