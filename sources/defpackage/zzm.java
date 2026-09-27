package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class zzm {
    public static final Object a = new Object();

    public static final void a(pq4 pq4Var, Integer num, Function2 function2) {
        if (((sr8) pq4Var).S) {
            ((sr8) pq4Var).b(num, function2);
        }
    }

    public static final void b(pq4 pq4Var, Function1 function1) {
        ((sr8) pq4Var).b(Unit.INSTANCE, new jya(function1, 2));
    }

    public static final String[] c(Metadata metadata) {
        String[] d1 = metadata.d1();
        if (d1.length == 0) {
            d1 = null;
        }
        if (d1 != null) {
            return d1;
        }
        throw new IllegalArgumentException("Metadata is missing: kotlin.Metadata.data1 must not be an empty array", null);
    }

    public static final void d(pq4 pq4Var, Object obj, Function2 function2) {
        if (!((sr8) pq4Var).S && Intrinsics.areEqual(((sr8) pq4Var).Q(), obj)) {
            return;
        }
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.o0(obj);
        sr8Var.b(obj, function2);
    }

    public static final void e() {
        throw new UnsupportedOperationException();
    }
}
