package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public interface oq8 extends Flow {
    static /* synthetic */ Flow d(oq8 oq8Var, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2) {
        if ((i2 & 1) != 0) {
            coroutineContext = g.a;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return oq8Var.a(coroutineContext, i, bufferOverflow);
    }

    Flow a(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow);
}
