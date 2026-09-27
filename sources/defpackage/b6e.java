package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class b6e {
    public static /* synthetic */ c6e a(String str) {
        Object obj;
        Iterator<E> it = c6e.g().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((c6e) obj).code, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (c6e) obj;
    }
}
