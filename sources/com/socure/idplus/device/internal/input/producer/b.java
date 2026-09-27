package com.socure.idplus.device.internal.input.producer;

import android.os.SystemClock;
import com.socure.idplus.device.internal.behavior.model.FocusChangeEvent;
import com.socure.idplus.device.internal.behavior.model.FocusType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class b extends a implements Function1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.socure.idplus.device.internal.thread.e eVar) {
        super(6, eVar);
        eVar.getClass();
    }

    public final void a(boolean z) {
        FocusType focusType;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (z) {
            focusType = FocusType.FOCUS;
        } else {
            focusType = FocusType.BLUR;
        }
        a(new FocusChangeEvent(uptimeMillis, focusType));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a(((Boolean) obj).booleanValue());
        return Unit.INSTANCE;
    }
}
