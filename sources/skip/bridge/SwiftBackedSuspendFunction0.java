package skip.bridge;

import defpackage.u85;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skip.lib.StructKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u00020\u0005:\u0001\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0011\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0082 J\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002J\u001b\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0082 J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lskip/bridge/SwiftBackedSuspendFunction0;", "R", "Lkotlin/jvm/functions/Function1;", "Lkotlin/coroutines/Continuation;", "", "Lskip/bridge/SwiftPeerBridged;", "Swift_peer", "", "<init>", "(J)V", "finalize", "", "Swift_release", "invoke", "continuation", "Swift_invoke", "Companion", "SkipBridge"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwiftBackedSuspendFunction0<R> implements Function1<Continuation<? super R>, Object>, SwiftPeerBridged {
    private long Swift_peer;

    public SwiftBackedSuspendFunction0(long j) {
        this.Swift_peer = j;
    }

    private final native void Swift_invoke(long Swift_peer, Object continuation);

    private final native void Swift_release(long Swift_peer);

    @Override // skip.bridge.SwiftPeerBridged
    /* renamed from: Swift_peer, reason: from getter */
    public long getSwift_peer() {
        return this.Swift_peer;
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public Object invoke(Continuation<? super R> continuation) {
        continuation.getClass();
        Swift_invoke(this.Swift_peer, new SwiftContinuationWrapper(continuation));
        return StructKt.sref$default(u85.COROUTINE_SUSPENDED, null, 1, null);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Continuation) obj);
    }
}
