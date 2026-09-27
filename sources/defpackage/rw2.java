package defpackage;

import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class rw2 extends tw2 implements qi1 {
    @Override // defpackage.tw2, defpackage.jw2
    public final Object call(Object[] objArr) {
        objArr.getClass();
        d(objArr);
        ((Field) this.a).set(null, ArraysKt.L(objArr));
        return Unit.INSTANCE;
    }
}
