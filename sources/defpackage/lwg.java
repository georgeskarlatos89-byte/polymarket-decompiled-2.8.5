package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class lwg extends jwg {
    public static ny4 b(Iterator it) {
        it.getClass();
        return c(new bga(1, it));
    }

    public static ny4 c(Sequence sequence) {
        if (sequence instanceof ny4) {
            return (ny4) sequence;
        }
        return new ny4(sequence);
    }

    public static final q78 d(Sequence sequence, Function1 function1) {
        if (sequence instanceof tbj) {
            tbj tbjVar = (tbj) sequence;
            return new q78(tbjVar.a, tbjVar.b, function1);
        }
        return new q78(sequence, new udg(9), function1);
    }

    public static ny4 e(Function0 function0) {
        return c(new xs8(function0, new ix8(function0, 20)));
    }

    public static Sequence f(Object obj, Function1 function1) {
        function1.getClass();
        if (obj == null) {
            return ed7.a;
        }
        return new xs8(new t71(obj, 3), function1);
    }
}
