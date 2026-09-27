package skip.bridge;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import skip.lib.StructKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u0000 \u0013*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u00020\u0004:\u0001\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0011\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0082 J\u0016\u0010\f\u001a\u00028\u00012\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000eJ)\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0011H\u0082 J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lskip/bridge/SwiftBackedFunction1;", "P0", "R", "Lkotlin/jvm/functions/Function1;", "Lskip/bridge/SwiftPeerBridged;", "Swift_peer", "", "<init>", "(J)V", "finalize", "", "Swift_release", "invoke", "p0", "(Ljava/lang/Object;)Ljava/lang/Object;", "Swift_invoke", "Lkotlin/Pair;", "", "", "Companion", "SkipBridge"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwiftBackedFunction1<P0, R> implements Function1<P0, R>, SwiftPeerBridged {
    private long Swift_peer;

    public SwiftBackedFunction1(long j) {
        this.Swift_peer = j;
    }

    private final native Pair<Object, Throwable> Swift_invoke(long Swift_peer, Object p0);

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

    @Override // kotlin.jvm.functions.Function1
    public R invoke(P0 p0) {
        Pair<Object, Throwable> Swift_invoke = Swift_invoke(this.Swift_peer, p0);
        Object obj = Swift_invoke.first;
        Throwable th = (Throwable) Swift_invoke.second;
        if (th == null) {
            return (R) StructKt.sref$default(obj, null, 1, null);
        }
        throw th;
    }
}
