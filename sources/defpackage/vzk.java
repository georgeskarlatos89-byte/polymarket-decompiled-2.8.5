package defpackage;

import bo.app.mb;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class vzk implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mb b;

    public /* synthetic */ vzk(mb mbVar, int i) {
        this.a = i;
        this.b = mbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        mb mbVar = this.b;
        switch (i) {
            case 0:
                return mb.b(mbVar);
            default:
                return mb.a(mbVar);
        }
    }
}
