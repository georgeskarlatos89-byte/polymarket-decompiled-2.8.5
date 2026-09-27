package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class uw2 extends yw2 implements qi1 {
    public final Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw2(Method method, Object obj) {
        super(method, false, 4);
        method.getClass();
        this.f = obj;
    }

    @Override // defpackage.jw2
    public final Object call(Object[] objArr) {
        objArr.getClass();
        d(objArr);
        return f(this.f, objArr);
    }
}
