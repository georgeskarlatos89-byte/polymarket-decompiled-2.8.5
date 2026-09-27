package defpackage;

import java.lang.reflect.Method;
import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class xw2 extends yw2 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw2(Method method, int i) {
        super(method, false, 6);
        this.f = i;
        method.getClass();
        switch (i) {
            case 2:
                super(method, false, 6);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.jw2
    public final Object call(Object[] objArr) {
        Object[] q;
        Object[] q2;
        int i = this.f;
        objArr.getClass();
        switch (i) {
            case 0:
                d(objArr);
                Object obj = objArr[0];
                if (objArr.length <= 1) {
                    q = new Object[0];
                } else {
                    q = ArraysKt.q(objArr, 1, objArr.length);
                }
                return f(obj, q);
            case 1:
                d(objArr);
                e(ArraysKt.w(objArr));
                if (objArr.length <= 1) {
                    q2 = new Object[0];
                } else {
                    q2 = ArraysKt.q(objArr, 1, objArr.length);
                }
                return f(null, q2);
            default:
                d(objArr);
                return f(null, objArr);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xw2(Method method, boolean z, int i, int i2) {
        super(method, z, i);
        this.f = i2;
    }
}
