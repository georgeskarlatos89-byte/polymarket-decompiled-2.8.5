package com.polymarket.usviewmodels;

import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Identifiable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00011B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB-\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\n\u0010\u0012J\u0006\u0010\u0017\u001a\u00020\u0018J\u0015\u0010\u0019\u001a\u00020\u00182\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0015\u0010\u001c\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010!\u001a\u00020\u00102\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010\"\u001a\u00020\u00102\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J/\u0010#\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0082 J\u0013\u0010$\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\u0019\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0000H\u0082 J\b\u0010*\u001a\u00020+H\u0016J\u0015\u0010,\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020&0.2\u0006\u0010/\u001a\u00020+H\u0016J\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020&0.2\u0006\u0010/\u001a\u00020+H\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u000f\u0010 R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010 ¨\u00062"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsRowMemberPresentation;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "avatarUrl", "Ljava/net/URI;", "isPending", "", "isVerified", "(Ljava/lang/String;Ljava/net/URI;ZZ)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getId", "()Ljava/lang/String;", "Swift_id", "getAvatarUrl", "()Ljava/net/URI;", "Swift_avatarUrl", "()Z", "Swift_isPending", "Swift_isVerified", "Swift_constructor_0", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SquadsRowMemberPresentation implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public SquadsRowMemberPresentation(String str, URI uri, boolean z, boolean z2) {
        str.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, uri, z, z2);
    }

    private final native URI Swift_avatarUrl(long Swift_peer);

    private final native long Swift_constructor_0(String id, URI avatarUrl, boolean isPending, boolean isVerified);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native boolean Swift_isPending(long Swift_peer);

    private final native boolean Swift_isVerified(long Swift_peer);

    private final native boolean Swift_isequal(SquadsRowMemberPresentation lhs, SquadsRowMemberPresentation rhs);

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
        if (other == this) {
            return true;
        }
        if (!(other instanceof SquadsRowMemberPresentation)) {
            return false;
        }
        return Swift_isequal(this, (SquadsRowMemberPresentation) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final URI getAvatarUrl() {
        return Swift_avatarUrl(this.Swift_peer);
    }

    @Override // skip.lib.Identifiable
    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public String getId2() {
        return Swift_id(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public int hashCode() {
        return Long.hashCode(Swift_hashvalue(this.Swift_peer));
    }

    public final boolean isPending() {
        return Swift_isPending(this.Swift_peer);
    }

    public final boolean isVerified() {
        return Swift_isVerified(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    @Override // skip.lib.Identifiable
    public /* bridge */ /* synthetic */ String getId() {
        return getId2();
    }

    public SquadsRowMemberPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ SquadsRowMemberPresentation(String str, URI uri, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uri, (i & 4) != 0 ? false : z, z2);
    }
}
