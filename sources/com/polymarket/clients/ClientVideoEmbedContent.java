package com.polymarket.clients;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.api.Keys;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0001LB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBo\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\u001aJ\u0006\u0010\u001f\u001a\u00020 J\u0015\u0010!\u001a\u00020 2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010$\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010'\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010)\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010.\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00101\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00103\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00106\u001a\u0004\u0018\u00010\u00172\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00108\u001a\u0004\u0018\u00010\u00172\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010:\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u000e\u0010;\u001a\u00020\r2\u0006\u0010<\u001a\u00020\u0011J\u001d\u0010=\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010<\u001a\u00020\u0011H\u0082 Jk\u0010>\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u0082 J\u0013\u0010?\u001a\u00020\r2\b\u0010@\u001a\u0004\u0018\u00010AH\u0096\u0002J\u0019\u0010B\u001a\u00020\r2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u0000H\u0082 J\b\u0010E\u001a\u00020FH\u0016J\u0015\u0010G\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010H\u001a\b\u0012\u0004\u0012\u00020A0I2\u0006\u0010J\u001a\u00020FH\u0016J\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020A0I2\u0006\u0010J\u001a\u00020FH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010\u0012\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b-\u0010&R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b2\u0010#R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b7\u00105R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b9\u0010#¨\u0006M"}, d2 = {"Lcom/polymarket/clients/ClientVideoEmbedContent;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "providerID", "", "reportsPlaybackState", "", "usesControlOverlay", "supportedCommands", "", "Lcom/polymarket/clients/ClientVideoEmbedCommand;", "endsSessionOnPause", "kind", "Lcom/polymarket/clients/ClientVideoEmbedContentKind;", "html", "baseURL", "Ljava/net/URI;", "documentURL", "userScript", "(Ljava/lang/String;ZZLjava/util/List;ZLcom/polymarket/clients/ClientVideoEmbedContentKind;Ljava/lang/String;Ljava/net/URI;Ljava/net/URI;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getProviderID", "()Ljava/lang/String;", "Swift_providerID", "getReportsPlaybackState", "()Z", "Swift_reportsPlaybackState", "getUsesControlOverlay", "Swift_usesControlOverlay", "getSupportedCommands", "()Ljava/util/List;", "Swift_supportedCommands", "getEndsSessionOnPause", "Swift_endsSessionOnPause", "getKind", "()Lcom/polymarket/clients/ClientVideoEmbedContentKind;", "Swift_kind", "getHtml", "Swift_html", "getBaseURL", "()Ljava/net/URI;", "Swift_baseURL", "getDocumentURL", "Swift_documentURL", "getUserScript", "Swift_userScript", "supportsCommand", "command", "Swift_supportsCommand_0", "Swift_constructor_7", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientVideoEmbedContent implements SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String bridgeMessageName = "polymarketVideoEmbed";
    private long Swift_peer;

    public ClientVideoEmbedContent(String str, boolean z, boolean z2, List<? extends ClientVideoEmbedCommand> list, boolean z3, ClientVideoEmbedContentKind clientVideoEmbedContentKind, String str2, URI uri, URI uri2, String str3) {
        str.getClass();
        list.getClass();
        clientVideoEmbedContentKind.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_7(str, z, z2, list, z3, clientVideoEmbedContentKind, str2, uri, uri2, str3);
    }

    private final native URI Swift_baseURL(long Swift_peer);

    private final native long Swift_constructor_7(String providerID, boolean reportsPlaybackState, boolean usesControlOverlay, List<? extends ClientVideoEmbedCommand> supportedCommands, boolean endsSessionOnPause, ClientVideoEmbedContentKind kind, String html, URI baseURL, URI documentURL, String userScript);

    private final native URI Swift_documentURL(long Swift_peer);

    private final native boolean Swift_endsSessionOnPause(long Swift_peer);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native String Swift_html(long Swift_peer);

    private final native boolean Swift_isequal(ClientVideoEmbedContent lhs, ClientVideoEmbedContent rhs);

    private final native ClientVideoEmbedContentKind Swift_kind(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_providerID(long Swift_peer);

    private final native void Swift_release(long Swift_peer);

    private final native boolean Swift_reportsPlaybackState(long Swift_peer);

    private final native List<ClientVideoEmbedCommand> Swift_supportedCommands(long Swift_peer);

    private final native boolean Swift_supportsCommand_0(long Swift_peer, ClientVideoEmbedCommand command);

    private final native String Swift_userScript(long Swift_peer);

    private final native boolean Swift_usesControlOverlay(long Swift_peer);

    public static final /* synthetic */ String access$getBridgeMessageName$cp() {
        return bridgeMessageName;
    }

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
        if (!(other instanceof ClientVideoEmbedContent)) {
            return false;
        }
        return Swift_isequal(this, (ClientVideoEmbedContent) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final URI getBaseURL() {
        return Swift_baseURL(this.Swift_peer);
    }

    public final URI getDocumentURL() {
        return Swift_documentURL(this.Swift_peer);
    }

    public final boolean getEndsSessionOnPause() {
        return Swift_endsSessionOnPause(this.Swift_peer);
    }

    public final String getHtml() {
        return Swift_html(this.Swift_peer);
    }

    public final ClientVideoEmbedContentKind getKind() {
        return Swift_kind(this.Swift_peer);
    }

    public final String getProviderID() {
        return Swift_providerID(this.Swift_peer);
    }

    public final boolean getReportsPlaybackState() {
        return Swift_reportsPlaybackState(this.Swift_peer);
    }

    public final List<ClientVideoEmbedCommand> getSupportedCommands() {
        return Swift_supportedCommands(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final String getUserScript() {
        return Swift_userScript(this.Swift_peer);
    }

    public final boolean getUsesControlOverlay() {
        return Swift_usesControlOverlay(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(Swift_hashvalue(this.Swift_peer));
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public final boolean supportsCommand(ClientVideoEmbedCommand command) {
        command.getClass();
        return Swift_supportsCommand_0(this.Swift_peer, command);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0011\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0082 J\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000bJ\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0082 J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0012J\u0011\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0012H\u0082 J\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001b\u001a\u00020\u0005H\u0082 J\u000e\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0005J\u0011\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0005H\u0082 J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001e\u001a\u00020\u0005J\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00162\u0006\u0010 \u001a\u00020\u0005H\u0082 R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006!"}, d2 = {"Lcom/polymarket/clients/ClientVideoEmbedContent$Companion;", "", "<init>", "()V", "bridgeMessageName", "", "getBridgeMessageName", "()Ljava/lang/String;", "supports", "", "url", "Ljava/net/URI;", "Swift_Companion_supports_1", "content", "Lcom/polymarket/clients/ClientVideoEmbedContent;", "for_", "Swift_Companion_content_2", "commandScript", "Lcom/polymarket/clients/ClientVideoEmbedCommand;", "Swift_Companion_commandScript_3", "command", "playbackEvent", "Lcom/polymarket/clients/ClientVideoEmbedPlaybackEvent;", "fromEventName", "unusedp_0", "", "Swift_Companion_playbackEvent_4", Keys.KEY_NAME, "isStallEventName", "Swift_Companion_isStallEventName_5", "fromMessageJSON", "Swift_Companion_playbackEvent_6", "json", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native String Swift_Companion_commandScript_3(ClientVideoEmbedCommand command);

        private final native ClientVideoEmbedContent Swift_Companion_content_2(URI url);

        private final native boolean Swift_Companion_isStallEventName_5(String name);

        private final native ClientVideoEmbedPlaybackEvent Swift_Companion_playbackEvent_4(String name);

        private final native ClientVideoEmbedPlaybackEvent Swift_Companion_playbackEvent_6(String json);

        private final native boolean Swift_Companion_supports_1(URI url);

        public static /* synthetic */ ClientVideoEmbedPlaybackEvent playbackEvent$default(Companion companion, String str, Void r2, int i, Object obj) {
            if ((i & 2) != 0) {
                r2 = null;
            }
            return companion.playbackEvent(str, r2);
        }

        public final String commandScript(ClientVideoEmbedCommand for_) {
            for_.getClass();
            return Swift_Companion_commandScript_3(for_);
        }

        public final ClientVideoEmbedContent content(URI for_) {
            for_.getClass();
            return Swift_Companion_content_2(for_);
        }

        public final String getBridgeMessageName() {
            return ClientVideoEmbedContent.access$getBridgeMessageName$cp();
        }

        public final boolean isStallEventName(String name) {
            name.getClass();
            return Swift_Companion_isStallEventName_5(name);
        }

        public final ClientVideoEmbedPlaybackEvent playbackEvent(String fromEventName, Void unusedp_0) {
            fromEventName.getClass();
            return Swift_Companion_playbackEvent_4(fromEventName);
        }

        public final boolean supports(URI url) {
            url.getClass();
            return Swift_Companion_supports_1(url);
        }

        private Companion() {
        }

        public final ClientVideoEmbedPlaybackEvent playbackEvent(String fromMessageJSON) {
            fromMessageJSON.getClass();
            return Swift_Companion_playbackEvent_6(fromMessageJSON);
        }
    }

    public ClientVideoEmbedContent(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ ClientVideoEmbedContent(String str, boolean z, boolean z2, List list, boolean z3, ClientVideoEmbedContentKind clientVideoEmbedContentKind, String str2, URI uri, URI uri2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, z2, list, z3, clientVideoEmbedContentKind, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : uri, (i & 256) != 0 ? null : uri2, (i & Barcode.FORMAT_UPC_A) != 0 ? null : str3);
    }
}
