package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class kng extends mng {
    public static final pgk b = new pgk("SW02", "The integrity of the SDK has been tampered.", ogk.HIGH);

    @Override // defpackage.mng
    public final boolean a() {
        Field[] declaredFields = l9i.class.getDeclaredFields();
        declaredFields.getClass();
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if (!field.isSynthetic()) {
                arrayList.add(field);
            }
        }
        if (arrayList.size() == 8) {
            Method[] declaredMethods = l9i.class.getDeclaredMethods();
            declaredMethods.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (Method method : declaredMethods) {
                if (!method.isSynthetic()) {
                    arrayList2.add(method);
                }
            }
            if (arrayList2.size() == 5) {
                return false;
            }
            return true;
        }
        return true;
    }
}
