package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class h2b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i2b b;

    public /* synthetic */ h2b(i2b i2bVar, int i) {
        this.a = i;
        this.b = i2bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        i2b i2bVar = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(i2bVar.p.f());
            case 1:
                return Float.valueOf(i2bVar.p.b());
            default:
                return Float.valueOf(i2bVar.p.e() - i2bVar.p.a());
        }
    }
}
