package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class yw2 extends zw2 {
    public final boolean e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yw2(Method method, boolean z, Type[] typeArr) {
        super(method, r0, r3, typeArr);
        Class<?> cls;
        Type genericReturnType = method.getGenericReturnType();
        genericReturnType.getClass();
        if (z) {
            cls = method.getDeclaringClass();
        } else {
            cls = null;
        }
        this.e = Intrinsics.areEqual(genericReturnType, Void.TYPE);
    }

    public final Object f(Object obj, Object[] objArr) {
        objArr.getClass();
        Object invoke = ((Method) this.a).invoke(obj, Arrays.copyOf(objArr, objArr.length));
        if (this.e) {
            return Unit.INSTANCE;
        }
        return invoke;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ yw2(Method method, boolean z, int i) {
        this(method, z, r3);
        z = (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
    }
}
