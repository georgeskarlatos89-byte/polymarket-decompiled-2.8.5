package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class o6a extends q6a implements qi1 {
    public final Object d;

    public o6a(Method method, Object obj) {
        super(method, CollectionsKt.emptyList());
        this.d = obj;
    }

    @Override // defpackage.jw2
    public final Object call(Object[] objArr) {
        objArr.getClass();
        d(objArr);
        return this.a.invoke(this.d, Arrays.copyOf(objArr, objArr.length));
    }
}
