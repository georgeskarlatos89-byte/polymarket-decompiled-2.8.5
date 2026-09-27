package defpackage;

import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jj6 {
    public final kj6 a(String str) {
        if (str == null) {
            return kj6.QUEUE;
        }
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = str.toUpperCase(locale);
        upperCase.getClass();
        Iterator<E> it = kj6.a().iterator();
        Object obj = null;
        boolean z = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (Intrinsics.areEqual(((kj6) next).b(), upperCase)) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            } else if (z) {
                obj = obj2;
            }
        }
        kj6 kj6Var = (kj6) obj;
        if (kj6Var == null) {
            b69.h(this, pm1.W, null, false, new uz5(str, 19), 6);
            return kj6.QUEUE;
        }
        return kj6Var;
    }
}
