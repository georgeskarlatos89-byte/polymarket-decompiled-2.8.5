package defpackage;

import kotlin.jvm.functions.Function1;
import skip.model.Published;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ihf implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Published b;

    public /* synthetic */ ihf(Published published, int i) {
        this.a = i;
        this.b = published;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Published published = this.b;
        switch (i) {
            case 0:
                return Published.a(published, (qqc) obj);
            case 1:
                return Published.c(published, obj);
            default:
                return Published.b(published, obj);
        }
    }
}
