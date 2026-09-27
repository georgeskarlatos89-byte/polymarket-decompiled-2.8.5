package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class ncj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lcj b;

    public /* synthetic */ ncj(lcj lcjVar, int i) {
        this.a = i;
        this.b = lcjVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        lcj lcjVar = this.b;
        switch (i) {
            case 0:
                return new ocj(lcjVar, 0);
            default:
                return new ocj(lcjVar, 1);
        }
    }
}
