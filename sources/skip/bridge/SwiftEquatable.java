package skip.bridge;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0011\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0082 J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\u0019\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0082 J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0011\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0004H\u0082 J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0082 R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u001b"}, d2 = {"Lskip/bridge/SwiftEquatable;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "<init>", "(J)V", "getSwift_peer$SkipBridge", "()J", "setSwift_peer$SkipBridge", "finalize", "", "Swift_release", "equals", "", "other", "", "Swift_equals", "toString", "", "Swift_description", "Swift_projection", "Lkotlin/Function0;", "options", "", "Swift_projectionImpl", "Companion", "SkipBridge"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwiftEquatable implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public SwiftEquatable(long j) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private final native String Swift_description(long Swift_peer);

    private final native boolean Swift_equals(long Swift_peer, long other);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    @Override // skip.bridge.SwiftPeerBridged
    /* renamed from: Swift_peer, reason: from getter */
    public long getSwift_peer() {
        return this.Swift_peer;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public boolean equals(Object other) {
        if (!(other instanceof SwiftEquatable)) {
            return false;
        }
        return Swift_equals(this.Swift_peer, ((SwiftEquatable) other).getSwift_peer());
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final long getSwift_peer$SkipBridge() {
        return this.Swift_peer;
    }

    public final void setSwift_peer$SkipBridge(long j) {
        this.Swift_peer = j;
    }

    public String toString() {
        return Swift_description(this.Swift_peer);
    }
}
