package defpackage;

import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class o63 {
    public static p63 a(String str) {
        Object obj;
        Iterator<E> it = p63.b().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String a = ((p63) next).a();
            if (str != null) {
                obj = str.toLowerCase(Locale.ROOT);
                obj.getClass();
            }
            if (Intrinsics.areEqual(a, obj)) {
                obj = next;
                break;
            }
        }
        p63 p63Var = (p63) obj;
        if (p63Var == null) {
            return p63.Unknown;
        }
        return p63Var;
    }
}
