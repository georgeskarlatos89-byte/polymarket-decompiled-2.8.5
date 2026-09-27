package defpackage;

import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class qw2 extends tw2 implements qi1 {
    public final Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw2(Field field, boolean z, Object obj) {
        super(field, z, false);
        field.getClass();
        this.f = obj;
    }

    @Override // defpackage.tw2, defpackage.jw2
    public final Object call(Object[] objArr) {
        objArr.getClass();
        d(objArr);
        ((Field) this.a).set(this.f, ArraysKt.v(objArr));
        return Unit.INSTANCE;
    }
}
