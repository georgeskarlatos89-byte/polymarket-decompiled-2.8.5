package skip.bridge;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function4;
import skip.lib.StructKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u0000 \u0019*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u0004*\u0004\b\u0004\u0010\u00052 \u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u00062\u00020\u0007:\u0001\u0019B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0011\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0082 J.\u0010\u000f\u001a\u00028\u00042\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0012\u001a\u00028\u00022\u0006\u0010\u0013\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0002\u0010\u0014JG\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0017H\u0082 J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lskip/bridge/SwiftBackedFunction4;", "P0", "P1", "P2", "P3", "R", "Lkotlin/jvm/functions/Function4;", "Lskip/bridge/SwiftPeerBridged;", "Swift_peer", "", "<init>", "(J)V", "finalize", "", "Swift_release", "invoke", "p0", "p1", "p2", "p3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Swift_invoke", "Lkotlin/Pair;", "", "", "Companion", "SkipBridge"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwiftBackedFunction4<P0, P1, P2, P3, R> implements Function4<P0, P1, P2, P3, R>, SwiftPeerBridged {
    private long Swift_peer;

    public SwiftBackedFunction4(long j) {
        this.Swift_peer = j;
    }

    private final native Pair<Object, Throwable> Swift_invoke(long Swift_peer, Object p0, Object p1, Object p2, Object p3);

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

    @Override // kotlin.jvm.functions.Function4
    public R invoke(P0 p0, P1 p1, P2 p2, P3 p3) {
        Pair<Object, Throwable> Swift_invoke = Swift_invoke(this.Swift_peer, p0, p1, p2, p3);
        Object obj = Swift_invoke.first;
        Throwable th = (Throwable) Swift_invoke.second;
        if (th == null) {
            return (R) StructKt.sref$default(obj, null, 1, null);
        }
        throw th;
    }
}
