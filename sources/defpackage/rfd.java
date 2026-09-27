package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class rfd extends nuk implements xj9 {
    public final Object g;

    public rfd(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 3);
        this.g = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [xj9, usk] */
    public static xj9 R(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof xj9) {
            return (xj9) queryLocalInterface;
        }
        return new usk(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 3);
    }

    public static Object S(xj9 xj9Var) {
        if (xj9Var instanceof rfd) {
            return ((rfd) xj9Var).g;
        }
        IBinder asBinder = xj9Var.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            arn.h(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("Binder object is null.", e2);
                }
            }
            dmk.v("IObjectWrapper declared field not private!");
            return null;
        }
        int length = declaredFields.length;
        dmk.v(hdi.l(length, "Unexpected number of IObjectWrapper declared fields: ", new StringBuilder(String.valueOf(length).length() + 53)));
        return null;
    }
}
