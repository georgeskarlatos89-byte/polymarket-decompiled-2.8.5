package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class qi4 {
    public static pi4 a(Function1... function1Arr) {
        if (function1Arr.length > 0) {
            return new pi4(function1Arr, 0);
        }
        dmk.v("Failed requirement.");
        return null;
    }

    public static int b(Comparable comparable, Comparable comparable2) {
        if (comparable == null) {
            if (comparable2 == null) {
                return 0;
            }
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }
}
