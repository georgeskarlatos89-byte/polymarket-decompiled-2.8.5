package defpackage;

import java.lang.reflect.Field;
import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class sw2 extends tw2 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw2(Field field, boolean z) {
        super(field, z, true);
        this.f = 0;
        field.getClass();
    }

    @Override // defpackage.tw2, defpackage.zw2
    public void d(Object[] objArr) {
        switch (this.f) {
            case 1:
                objArr.getClass();
                super.d(objArr);
                e(ArraysKt.w(objArr));
                return;
            default:
                super.d(objArr);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sw2(Field field, boolean z, boolean z2, int i) {
        super(field, z, z2);
        this.f = i;
    }
}
