package defpackage;

import bo.app.b;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class ztk implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ ztk(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                return b.a(bVar);
            default:
                return b.b(bVar);
        }
    }
}
