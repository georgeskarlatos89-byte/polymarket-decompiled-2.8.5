package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class hoe {
    public void a(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        Method method = goe.b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public List b(Throwable th) {
        Object invoke;
        th.getClass();
        Method method = goe.c;
        if (method != null && (invoke = method.invoke(th, null)) != null) {
            List asList = Arrays.asList((Throwable[]) invoke);
            asList.getClass();
            return asList;
        }
        return CollectionsKt.emptyList();
    }
}
