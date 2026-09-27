package defpackage;

import android.os.CancellationSignal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class md5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CancellationSignal b;

    public /* synthetic */ md5(CancellationSignal cancellationSignal, int i) {
        this.a = i;
        this.b = cancellationSignal;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        CancellationSignal cancellationSignal = this.b;
        switch (i) {
            case 0:
                cancellationSignal.cancel();
                return Unit.INSTANCE;
            default:
                cancellationSignal.cancel();
                return Unit.INSTANCE;
        }
    }
}
