package defpackage;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class mw2 extends pw2 implements qi1 {
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw2(Field field, Object obj) {
        super(field, false);
        field.getClass();
        this.e = obj;
    }

    @Override // defpackage.pw2, defpackage.jw2
    public final Object call(Object[] objArr) {
        objArr.getClass();
        d(objArr);
        return ((Field) this.a).get(this.e);
    }
}
