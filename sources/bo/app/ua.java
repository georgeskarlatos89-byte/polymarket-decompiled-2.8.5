package bo.app;

import defpackage.fq8;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class ua extends fq8 implements Function1 {
    public ua(wa waVar) {
        super(1, 0, wa.class, waVar, "defaultSleep", "defaultSleep(J)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        ((wa) this.receiver).getClass();
        if (longValue > 0) {
            Thread.sleep(longValue);
        }
        return Unit.INSTANCE;
    }
}
