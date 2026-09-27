package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class tw2 extends zw2 {
    public final boolean e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tw2(Field field, boolean z, boolean z2) {
        super(field, r0, r7, new Type[]{r1});
        Class<?> cls;
        Class cls2 = Void.TYPE;
        cls2.getClass();
        if (z2) {
            cls = field.getDeclaringClass();
        } else {
            cls = null;
        }
        Type genericType = field.getGenericType();
        genericType.getClass();
        this.e = z;
    }

    @Override // defpackage.jw2
    public Object call(Object[] objArr) {
        Object obj;
        objArr.getClass();
        d(objArr);
        Field field = (Field) this.a;
        if (this.c != null) {
            obj = ArraysKt.v(objArr);
        } else {
            obj = null;
        }
        field.set(obj, ArraysKt.L(objArr));
        return Unit.INSTANCE;
    }

    @Override // defpackage.zw2
    public void d(Object[] objArr) {
        objArr.getClass();
        super.d(objArr);
        if (this.e && ArraysKt.L(objArr) == null) {
            dmk.v("null is not allowed as a value for this property.");
        }
    }
}
