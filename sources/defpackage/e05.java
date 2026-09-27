package defpackage;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e05 implements cfd, ObjectConstructor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Constructor b;

    public /* synthetic */ e05(Constructor constructor, int i) {
        this.a = i;
        this.b = constructor;
    }

    @Override // defpackage.cfd, com.google.gson.internal.ObjectConstructor
    public final Object construct() {
        int i = this.a;
        Constructor constructor = this.b;
        switch (i) {
            case 0:
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e) {
                    eun eunVar = tvf.a;
                    omf.m("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                    return null;
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Failed to invoke constructor '" + tvf.b(constructor) + "' with no args", e2);
                } catch (InvocationTargetException e3) {
                    omf.m("Failed to invoke constructor '" + tvf.b(constructor) + "' with no args", e3.getCause());
                    return null;
                }
            default:
                return ConstructorConstructor.s(constructor);
        }
    }
}
