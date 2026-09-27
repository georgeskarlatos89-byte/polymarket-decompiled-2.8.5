package defpackage;

import kotlin.jvm.functions.Function1;
import skip.foundation.Timer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j3j implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Timer b;

    public /* synthetic */ j3j(Timer timer, int i) {
        this.a = i;
        this.b = timer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Timer timer = this.b;
        switch (i) {
            case 0:
                return Timer.b(timer, (java.util.Timer) obj);
            default:
                return Timer.a(timer, obj);
        }
    }
}
