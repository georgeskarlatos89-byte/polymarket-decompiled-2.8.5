package skip.bridge;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import skip.lib.StructKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u0000 \u0011*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003:\u0001\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J\u000e\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J\b\u0010\u0004\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lskip/bridge/SwiftBackedFunction0;", "R", "Lkotlin/jvm/functions/Function0;", "Lskip/bridge/SwiftPeerBridged;", "Swift_peer", "", "<init>", "(J)V", "finalize", "", "Swift_release", "invoke", "()Ljava/lang/Object;", "Swift_invoke", "Lkotlin/Pair;", "", "", "Companion", "SkipBridge"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwiftBackedFunction0<R> implements Function0<R>, SwiftPeerBridged {
    private long Swift_peer;

    public SwiftBackedFunction0(long j) {
        this.Swift_peer = j;
    }

    private final native Pair<Object, Throwable> Swift_invoke(long Swift_peer);

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

    @Override // kotlin.jvm.functions.Function0
    public R invoke() {
        Pair<Object, Throwable> Swift_invoke = Swift_invoke(this.Swift_peer);
        Object obj = Swift_invoke.first;
        Throwable th = (Throwable) Swift_invoke.second;
        if (th == null) {
            return (R) StructKt.sref$default(obj, null, 1, null);
        }
        throw th;
    }
}
