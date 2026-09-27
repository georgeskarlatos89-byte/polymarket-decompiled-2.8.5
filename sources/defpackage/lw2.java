package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class lw2 extends zw2 {
    public final /* synthetic */ int e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lw2(Constructor constructor, int i) {
        super(constructor, r7, null, (Type[]) r1);
        Object q;
        this.e = i;
        Class<?> cls = null;
        constructor.getClass();
        switch (i) {
            case 1:
                Class declaringClass = constructor.getDeclaringClass();
                declaringClass.getClass();
                Class declaringClass2 = constructor.getDeclaringClass();
                Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
                if (declaringClass3 != null && !Modifier.isStatic(declaringClass2.getModifiers())) {
                    cls = declaringClass3;
                }
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                genericParameterTypes.getClass();
                super(constructor, declaringClass, cls, genericParameterTypes);
                return;
            default:
                Class declaringClass4 = constructor.getDeclaringClass();
                declaringClass4.getClass();
                Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                genericParameterTypes2.getClass();
                if (genericParameterTypes2.length <= 1) {
                    q = new Type[0];
                } else {
                    q = ArraysKt.q(genericParameterTypes2, 0, genericParameterTypes2.length - 1);
                }
                return;
        }
    }

    @Override // defpackage.jw2
    public final Object call(Object[] objArr) {
        int i = this.e;
        Member member = this.a;
        objArr.getClass();
        switch (i) {
            case 0:
                d(objArr);
                sd7 sd7Var = new sd7(2);
                sd7Var.i(objArr);
                sd7Var.f(null);
                ArrayList arrayList = sd7Var.a;
                return ((Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                d(objArr);
                return ((Constructor) member).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }
}
