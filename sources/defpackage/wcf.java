package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class wcf extends ycf implements uka {
    public wcf(Class cls, String str, String str2) {
        super(sv2.NO_RECEIVER, cls, str, str2, 0);
    }

    @Override // defpackage.sv2
    public final lja computeReflected() {
        return lvf.a.property2(this);
    }

    @Override // defpackage.vka
    public final tka getGetter() {
        return ((uka) b()).getGetter();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xcf) this).get(obj, obj2);
    }

    public wcf() {
    }

    @Override // defpackage.vka
    public final /* bridge */ /* synthetic */ oka getGetter() {
        return getGetter();
    }
}
