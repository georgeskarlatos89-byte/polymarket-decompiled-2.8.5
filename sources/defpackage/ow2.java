package defpackage;

import java.lang.reflect.Field;
import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ow2 extends pw2 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow2(Field field) {
        super(field, true);
        this.e = 0;
        field.getClass();
    }

    @Override // defpackage.zw2
    public void d(Object[] objArr) {
        switch (this.e) {
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
    public /* synthetic */ ow2(Field field, boolean z, int i) {
        super(field, z);
        this.e = i;
    }
}
