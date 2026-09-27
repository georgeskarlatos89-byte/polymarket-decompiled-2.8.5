package com.socure.idplus.device.internal.input.producer;

import android.view.KeyEvent;
import com.socure.idplus.device.internal.behavior.model.KeyPressEvent;
import com.socure.idplus.device.internal.behavior.model.KeyPressType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class d extends a implements Function1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.socure.idplus.device.internal.thread.e eVar) {
        super(4, eVar);
        eVar.getClass();
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyPressType keyPressType;
        KeyEvent keyEvent = (KeyEvent) obj;
        if (keyEvent != null) {
            long eventTime = keyEvent.getEventTime();
            int action = keyEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    keyPressType = KeyPressType.UNKNOWN;
                } else {
                    keyPressType = KeyPressType.KEY_UP;
                }
            } else {
                keyPressType = KeyPressType.KEY_DOWN;
            }
            a(new KeyPressEvent(eventTime, keyPressType));
        }
        return Unit.INSTANCE;
    }
}
