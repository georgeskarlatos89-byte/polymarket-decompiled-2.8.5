package defpackage;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class dif implements Function1 {
    public final /* synthetic */ long a;
    public final /* synthetic */ voc b;

    public dif(long j, voc vocVar) {
        this.a = j;
        this.b = vocVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Number) obj).longValue();
        ((gvd) this.b).z((float) (SystemClock.elapsedRealtime() - this.a));
        return Unit.INSTANCE;
    }
}
