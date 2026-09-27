package com.socure.idplus.device.internal.input.producer;

import android.view.MotionEvent;
import com.socure.idplus.device.internal.behavior.model.Offset;
import com.socure.idplus.device.internal.behavior.model.PointerEvent;
import com.socure.idplus.device.internal.behavior.model.PointerType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class i extends a implements Function1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.socure.idplus.device.internal.thread.e eVar) {
        super(5, eVar);
        eVar.getClass();
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PointerType pointerType;
        MotionEvent motionEvent = (MotionEvent) obj;
        if (motionEvent != null && motionEvent.getPointerCount() > 0) {
            long eventTime = motionEvent.getEventTime();
            int toolType = motionEvent.getToolType(0);
            if (toolType != 1) {
                if (toolType != 2) {
                    if (toolType != 3) {
                        if (toolType != 4) {
                            pointerType = PointerType.UNKNOWN;
                        } else {
                            pointerType = PointerType.INVERTED_STYLUS;
                        }
                    } else {
                        pointerType = PointerType.MOUSE;
                    }
                } else {
                    pointerType = PointerType.STYLUS;
                }
            } else {
                pointerType = PointerType.TOUCH;
            }
            a(new PointerEvent(eventTime, pointerType, motionEvent.getPressure(), new Offset(motionEvent.getX(), motionEvent.getY())));
        }
        return Unit.INSTANCE;
    }
}
