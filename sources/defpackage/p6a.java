package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class p6a extends q6a {
    public p6a(Method method) {
        super(method, eb4.c(method.getDeclaringClass()));
    }

    @Override // defpackage.jw2
    public final Object call(Object[] objArr) {
        Object[] q;
        objArr.getClass();
        d(objArr);
        Object obj = objArr[0];
        if (objArr.length <= 1) {
            q = new Object[0];
        } else {
            q = ArraysKt.q(objArr, 1, objArr.length);
        }
        return this.a.invoke(obj, Arrays.copyOf(q, q.length));
    }
}
