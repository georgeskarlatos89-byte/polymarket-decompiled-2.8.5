package kotlin;

import defpackage.dmk;
import defpackage.nkj;
import defpackage.o0b;
import defpackage.w4b;
import defpackage.xhi;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"kotlin/LazyKt__LazyJVMKt", "kotlin/b"}, d2 = {}, k = 4, mv = {2, 4, 0}, xi = 49)
/* loaded from: classes6.dex */
public final class LazyKt extends b {
    /* JADX WARN: Type inference failed for: r3v4, types: [ddg, java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy, jvj] */
    public static Lazy a(w4b w4bVar, Function0 function0) {
        w4bVar.getClass();
        function0.getClass();
        int i = o0b.a[w4bVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ?? obj = new Object();
                    obj.a = function0;
                    obj.b = nkj.a;
                    return obj;
                }
                dmk.a();
                return null;
            }
            ?? obj2 = new Object();
            obj2.a = function0;
            obj2.b = nkj.a;
            return obj2;
        }
        return new xhi(function0, null, 2, null);
    }
}
