package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class qrh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ urh b;

    public /* synthetic */ qrh(urh urhVar, int i) {
        this.a = i;
        this.b = urhVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float y;
        int i = this.a;
        urh urhVar = this.b;
        switch (i) {
            case 0:
                y = urhVar.a.a.y();
                break;
            default:
                y = lnf.d(urhVar.a.a.y() / urhVar.c.a(), 0.0f, 1.0f);
                break;
        }
        return Float.valueOf(y);
    }
}
