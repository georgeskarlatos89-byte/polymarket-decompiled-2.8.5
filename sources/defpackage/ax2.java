package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.Call;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ax2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Call b;

    public /* synthetic */ ax2(Call call, int i) {
        this.a = i;
        this.b = call;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                this.b.cancel();
                return Unit.INSTANCE;
            default:
                this.b.cancel();
                return Unit.INSTANCE;
        }
    }
}
