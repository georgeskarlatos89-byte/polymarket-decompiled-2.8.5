package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class vhc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y4h b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ vhc(y4h y4hVar, Function0 function0, int i) {
        this.a = i;
        this.b = y4hVar;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                if (!this.b.d()) {
                    this.c.invoke();
                }
                return Unit.INSTANCE;
            default:
                if (!this.b.d()) {
                    this.c.invoke();
                }
                return Unit.INSTANCE;
        }
    }
}
