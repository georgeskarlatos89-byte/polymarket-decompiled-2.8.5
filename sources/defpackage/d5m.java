package defpackage;

import java.util.Comparator;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class d5m {
    public static final Comparator a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(d5m.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = v4m.zza;
        }
        a = comparator;
    }
}
