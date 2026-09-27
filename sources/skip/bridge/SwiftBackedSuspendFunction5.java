package skip.bridge;

import defpackage.u85;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function6;
import skip.lib.StructKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 \u001b*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u0004*\u0004\b\u0004\u0010\u0005*\u0004\b\u0005\u0010\u000624\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00072\u00020\n:\u0001\u001bB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0011\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0082 JF\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00028\u00022\u0006\u0010\u0016\u001a\u00028\u00032\u0006\u0010\u0017\u001a\u00028\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00050\bH\u0096\u0002¢\u0006\u0002\u0010\u0019JM\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0082 J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lskip/bridge/SwiftBackedSuspendFunction5;", "P0", "P1", "P2", "P3", "P4", "R", "Lkotlin/jvm/functions/Function6;", "Lkotlin/coroutines/Continuation;", "", "Lskip/bridge/SwiftPeerBridged;", "Swift_peer", "", "<init>", "(J)V", "finalize", "", "Swift_release", "invoke", "p0", "p1", "p2", "p3", "p4", "continuation", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Swift_invoke", "Companion", "SkipBridge"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwiftBackedSuspendFunction5<P0, P1, P2, P3, P4, R> implements Function6<P0, P1, P2, P3, P4, Continuation<? super R>, Object>, SwiftPeerBridged {
    private long Swift_peer;

    public SwiftBackedSuspendFunction5(long j) {
        this.Swift_peer = j;
    }

    private final native void Swift_invoke(long Swift_peer, Object p0, Object p1, Object p2, Object p3, Object p4, Object continuation);

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

    public Object invoke(P0 p0, P1 p1, P2 p2, P3 p3, P4 p4, Continuation<? super R> continuation) {
        continuation.getClass();
        Swift_invoke(this.Swift_peer, p0, p1, p2, p3, p4, new SwiftContinuationWrapper(continuation));
        return StructKt.sref$default(u85.COROUTINE_SUSPENDED, null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function6
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return invoke((SwiftBackedSuspendFunction5<P0, P1, P2, P3, P4, R>) obj, obj2, obj3, obj4, obj5, (Continuation) obj6);
    }
}
