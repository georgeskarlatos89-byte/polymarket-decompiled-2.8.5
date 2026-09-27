package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class dvj extends hvj {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public dvj(Method method, Object obj) {
        this.b = method;
        this.c = obj;
    }

    @Override // defpackage.hvj
    public final Object a(Class cls) {
        String O = bw4.O(cls);
        if (O == null) {
            return this.b.invoke(this.c, cls);
        }
        dmk.i("UnsafeAllocator is used for non-instantiable type: ".concat(O));
        return null;
    }
}
