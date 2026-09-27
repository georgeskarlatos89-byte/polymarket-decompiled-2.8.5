package com.polymarket.usviewmodels;

import com.fingerprintjs.android.fpjs_pro.g;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Identifiable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001=B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bBS\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u0015J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0015\u0010\u001c\u001a\u00020\u001b2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0015\u0010!\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010#\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010%\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010(\u001a\u0004\u0018\u00010\u00102\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010*\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010,\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010.\u001a\u0004\u0018\u00010\u00102\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u00100\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 JW\u00101\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0082 J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0096\u0002J\u0019\u00106\u001a\u0002032\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u0000H\u0082 J\u0016\u00109\u001a\b\u0012\u0004\u0012\u0002050:2\u0006\u0010;\u001a\u00020\u001eH\u0016J\u0017\u0010<\u001a\b\u0012\u0004\u0012\u0002050:2\u0006\u0010;\u001a\u00020\u001eH\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010\u000e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b$\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b)\u0010 R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b+\u0010 R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b-\u0010'R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b/\u0010 ¨\u0006>"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsGroupCardPresentation;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "metaText", "imageUrl", "Ljava/net/URI;", "lastMessageSenderId", "lastMessageSenderName", "lastMessageSenderAvatarUrl", "lastMessageText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getTitle", "Swift_title", "getMetaText", "Swift_metaText", "getImageUrl", "()Ljava/net/URI;", "Swift_imageUrl", "getLastMessageSenderId", "Swift_lastMessageSenderId", "getLastMessageSenderName", "Swift_lastMessageSenderName", "getLastMessageSenderAvatarUrl", "Swift_lastMessageSenderAvatarUrl", "getLastMessageText", "Swift_lastMessageText", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SquadsGroupCardPresentation implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public SquadsGroupCardPresentation(String str, String str2, String str3, URI uri, String str4, String str5, URI uri2, String str6) {
        g.x(str, str2, str3);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, str3, uri, str4, str5, uri2, str6);
    }

    private final native long Swift_constructor_0(String id, String title, String metaText, URI imageUrl, String lastMessageSenderId, String lastMessageSenderName, URI lastMessageSenderAvatarUrl, String lastMessageText);

    private final native String Swift_id(long Swift_peer);

    private final native URI Swift_imageUrl(long Swift_peer);

    private final native boolean Swift_isequal(SquadsGroupCardPresentation lhs, SquadsGroupCardPresentation rhs);

    private final native URI Swift_lastMessageSenderAvatarUrl(long Swift_peer);

    private final native String Swift_lastMessageSenderId(long Swift_peer);

    private final native String Swift_lastMessageSenderName(long Swift_peer);

    private final native String Swift_lastMessageText(long Swift_peer);

    private final native String Swift_metaText(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_title(long Swift_peer);

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
        if (!(other instanceof SquadsGroupCardPresentation)) {
            return false;
        }
        return Swift_isequal(this, (SquadsGroupCardPresentation) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    @Override // skip.lib.Identifiable
    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public String getId2() {
        return Swift_id(this.Swift_peer);
    }

    public final URI getImageUrl() {
        return Swift_imageUrl(this.Swift_peer);
    }

    public final URI getLastMessageSenderAvatarUrl() {
        return Swift_lastMessageSenderAvatarUrl(this.Swift_peer);
    }

    public final String getLastMessageSenderId() {
        return Swift_lastMessageSenderId(this.Swift_peer);
    }

    public final String getLastMessageSenderName() {
        return Swift_lastMessageSenderName(this.Swift_peer);
    }

    public final String getLastMessageText() {
        return Swift_lastMessageText(this.Swift_peer);
    }

    public final String getMetaText() {
        return Swift_metaText(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final String getTitle() {
        return Swift_title(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    @Override // skip.lib.Identifiable
    public /* bridge */ /* synthetic */ String getId() {
        return getId2();
    }

    public SquadsGroupCardPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
