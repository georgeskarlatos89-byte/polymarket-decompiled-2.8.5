package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class pw2 extends zw2 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pw2(Field field, boolean z) {
        super(field, r0, r4, new Type[0]);
        Class<?> cls;
        Type genericType = field.getGenericType();
        genericType.getClass();
        if (z) {
            cls = field.getDeclaringClass();
        } else {
            cls = null;
        }
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
        return field.get(obj);
    }
}
