package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class kw2 extends zw2 implements qi1 {
    public final /* synthetic */ int e;
    public final Object f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kw2(Constructor constructor, Object obj, int i) {
        super(constructor, r7, null, (Type[]) r1);
        Object q;
        this.e = i;
        constructor.getClass();
        switch (i) {
            case 1:
                Class declaringClass = constructor.getDeclaringClass();
                declaringClass.getClass();
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                genericParameterTypes.getClass();
                super(constructor, declaringClass, null, genericParameterTypes);
                this.f = obj;
                return;
            default:
                Class declaringClass2 = constructor.getDeclaringClass();
                declaringClass2.getClass();
                Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                genericParameterTypes2.getClass();
                if (genericParameterTypes2.length <= 2) {
                    q = new Type[0];
                } else {
                    q = ArraysKt.q(genericParameterTypes2, 1, genericParameterTypes2.length - 1);
                }
                this.f = obj;
                return;
        }
    }

    @Override // defpackage.jw2
    public final Object call(Object[] objArr) {
        int i = this.e;
        Object obj = this.f;
        Member member = this.a;
        objArr.getClass();
        switch (i) {
            case 0:
                d(objArr);
                sd7 sd7Var = new sd7(3);
                sd7Var.f(obj);
                sd7Var.i(objArr);
                sd7Var.f(null);
                ArrayList arrayList = sd7Var.a;
                return ((Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                d(objArr);
                sd7 sd7Var2 = new sd7(2);
                sd7Var2.f(obj);
                sd7Var2.i(objArr);
                ArrayList arrayList2 = sd7Var2.a;
                return ((Constructor) member).newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
