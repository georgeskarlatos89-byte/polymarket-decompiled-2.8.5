package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ww2 extends yw2 implements qi1 {
    public final boolean f;
    public final Object g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ww2(Method method, boolean z, Object obj) {
        super(method, false, (Type[]) r0);
        Object q;
        method.getClass();
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
        if (genericParameterTypes.length <= 1) {
            q = new Type[0];
        } else {
            q = ArraysKt.q(genericParameterTypes, 1, genericParameterTypes.length);
        }
        this.f = z;
        this.g = obj;
    }

    @Override // defpackage.jw2
    public final Object call(Object[] objArr) {
        objArr.getClass();
        d(objArr);
        sd7 sd7Var = new sd7(2);
        sd7Var.f(this.g);
        sd7Var.i(objArr);
        ArrayList arrayList = sd7Var.a;
        return f(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
