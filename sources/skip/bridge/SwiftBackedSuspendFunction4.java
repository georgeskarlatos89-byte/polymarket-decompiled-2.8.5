package skip.bridge;

import defpackage.u85;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function5;
import skip.lib.StructKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u0019*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u0004*\u0004\b\u0004\u0010\u00052.\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u00020\t:\u0001\u0019B\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0011\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0082 J>\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00028\u00022\u0006\u0010\u0015\u001a\u00028\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00040\u0007H\u0096\u0002¢\u0006\u0002\u0010\u0017JC\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0082 J\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lskip/bridge/SwiftBackedSuspendFunction4;", "P0", "P1", "P2", "P3", "R", "Lkotlin/jvm/functions/Function5;", "Lkotlin/coroutines/Continuation;", "", "Lskip/bridge/SwiftPeerBridged;", "Swift_peer", "", "<init>", "(J)V", "finalize", "", "Swift_release", "invoke", "p0", "p1", "p2", "p3", "continuation", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Swift_invoke", "Companion", "SkipBridge"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwiftBackedSuspendFunction4<P0, P1, P2, P3, R> implements Function5<P0, P1, P2, P3, Continuation<? super R>, Object>, SwiftPeerBridged {
    private long Swift_peer;

    public SwiftBackedSuspendFunction4(long j) {
        this.Swift_peer = j;
    }

    private final native void Swift_invoke(long Swift_peer, Object p0, Object p1, Object p2, Object p3, Object continuation);

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

    public Object invoke(P0 p0, P1 p1, P2 p2, P3 p3, Continuation<? super R> continuation) {
        continuation.getClass();
        Swift_invoke(this.Swift_peer, p0, p1, p2, p3, new SwiftContinuationWrapper(continuation));
        return StructKt.sref$default(u85.COROUTINE_SUSPENDED, null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return invoke((SwiftBackedSuspendFunction4<P0, P1, P2, P3, R>) obj, obj2, obj3, obj4, (Continuation) obj5);
    }
}
