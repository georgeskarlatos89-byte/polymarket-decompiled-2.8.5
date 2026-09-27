package com.polymarket.usviewmodels;

import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Identifiable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001;B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bBG\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\n\u0010\u0016J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0015\u0010\u001d\u001a\u00020\u001c2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0016J\u0015\u0010!\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010#\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010%\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010'\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010*\u001a\u00020\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010-\u001a\u00020\u00132\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010/\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 JG\u00100\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0082 J\u0013\u00101\u001a\u00020\u00152\b\u00102\u001a\u0004\u0018\u000103H\u0096\u0002J\u0019\u00104\u001a\u00020\u00152\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u0000H\u0082 J\u0016\u00107\u001a\b\u0012\u0004\u0012\u000203082\u0006\u00109\u001a\u00020\u0013H\u0016J\u0017\u0010:\u001a\b\u0012\u0004\u0012\u000203082\u0006\u00109\u001a\u00020\u0013H\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010\u000e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b$\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b&\u0010 R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0014\u0010.¨\u0006<"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsListRowPresentation;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "subtitle", "timestampText", "avatar", "Lcom/polymarket/usviewmodels/SquadsProfileAvatarPresentation;", "unreadCount", "", "isMuted", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/usviewmodels/SquadsProfileAvatarPresentation;IZ)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "getId", "()Ljava/lang/String;", "Swift_id", "getTitle", "Swift_title", "getSubtitle", "Swift_subtitle", "getTimestampText", "Swift_timestampText", "getAvatar", "()Lcom/polymarket/usviewmodels/SquadsProfileAvatarPresentation;", "Swift_avatar", "getUnreadCount", "()I", "Swift_unreadCount", "()Z", "Swift_isMuted", "Swift_constructor_0", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SquadsListRowPresentation implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public SquadsListRowPresentation(String str, String str2, String str3, String str4, SquadsProfileAvatarPresentation squadsProfileAvatarPresentation, int i, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        squadsProfileAvatarPresentation.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, str3, str4, squadsProfileAvatarPresentation, i, z);
    }

    private final native SquadsProfileAvatarPresentation Swift_avatar(long Swift_peer);

    private final native long Swift_constructor_0(String id, String title, String subtitle, String timestampText, SquadsProfileAvatarPresentation avatar, int unreadCount, boolean isMuted);

    private final native String Swift_id(long Swift_peer);

    private final native boolean Swift_isMuted(long Swift_peer);

    private final native boolean Swift_isequal(SquadsListRowPresentation lhs, SquadsListRowPresentation rhs);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_subtitle(long Swift_peer);

    private final native String Swift_timestampText(long Swift_peer);

    private final native String Swift_title(long Swift_peer);

    private final native int Swift_unreadCount(long Swift_peer);

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
        if (!(other instanceof SquadsListRowPresentation)) {
            return false;
        }
        return Swift_isequal(this, (SquadsListRowPresentation) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final SquadsProfileAvatarPresentation getAvatar() {
        return Swift_avatar(this.Swift_peer);
    }

    @Override // skip.lib.Identifiable
    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public String getId2() {
        return Swift_id(this.Swift_peer);
    }

    public final String getSubtitle() {
        return Swift_subtitle(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final String getTimestampText() {
        return Swift_timestampText(this.Swift_peer);
    }

    public final String getTitle() {
        return Swift_title(this.Swift_peer);
    }

    public final int getUnreadCount() {
        return Swift_unreadCount(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isMuted() {
        return Swift_isMuted(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    @Override // skip.lib.Identifiable
    public /* bridge */ /* synthetic */ String getId() {
        return getId2();
    }

    public SquadsListRowPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ SquadsListRowPresentation(String str, String str2, String str3, String str4, SquadsProfileAvatarPresentation squadsProfileAvatarPresentation, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, squadsProfileAvatarPresentation, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? false : z);
    }
}
