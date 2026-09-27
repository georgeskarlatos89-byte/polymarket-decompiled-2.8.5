package com.polymarket.data;

import java.net.URI;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001=B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0016\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J5\u0010 \u001a\u00060\u0004j\u0002`\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0082 J\u0015\u0010%\u001a\u00020\"2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010(\u001a\u00020\"2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010+\u001a\u00020\"2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010.\u001a\u00020\"2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0096\u0002J\u0019\u00103\u001a\u0002002\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0000H\u0082 J\b\u00106\u001a\u000207H\u0016J\u0015\u00108\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u00109\u001a\b\u0012\u0004\u0012\u0002020:2\u0006\u0010;\u001a\u000207H\u0016J\u0017\u0010<\u001a\b\u0012\u0004\u0012\u0002020:2\u0006\u0010;\u001a\u000207H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010!\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010&\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b'\u0010$R\u0011\u0010)\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b*\u0010$R\u0011\u0010,\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b-\u0010$¨\u0006>"}, d2 = {"Lcom/polymarket/data/EWebLinksConfig;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "helpCenter", "", "apiDocs", "discord", "userPrograms", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getHelpCenter", "()Ljava/lang/String;", "Swift_helpCenter", "getApiDocs", "Swift_apiDocs", "getDiscord", "Swift_discord", "getUserPrograms", "Swift_userPrograms", "Swift_constructor_0", "helpCenterURL", "Ljava/net/URI;", "getHelpCenterURL", "()Ljava/net/URI;", "Swift_helpCenterURL", "apiDocsURL", "getApiDocsURL", "Swift_apiDocsURL", "discordURL", "getDiscordURL", "Swift_discordURL", "userProgramsURL", "getUserProgramsURL", "Swift_userProgramsURL", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EWebLinksConfig implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public /* synthetic */ EWebLinksConfig(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    private final native String Swift_apiDocs(long Swift_peer);

    private final native URI Swift_apiDocsURL(long Swift_peer);

    private final native long Swift_constructor_0(String helpCenter, String apiDocs, String discord, String userPrograms);

    private final native String Swift_discord(long Swift_peer);

    private final native URI Swift_discordURL(long Swift_peer);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native String Swift_helpCenter(long Swift_peer);

    private final native URI Swift_helpCenterURL(long Swift_peer);

    private final native boolean Swift_isequal(EWebLinksConfig lhs, EWebLinksConfig rhs);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_userPrograms(long Swift_peer);

    private final native URI Swift_userProgramsURL(long Swift_peer);

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
        if (!(other instanceof EWebLinksConfig)) {
            return false;
        }
        return Swift_isequal(this, (EWebLinksConfig) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final String getApiDocs() {
        return Swift_apiDocs(this.Swift_peer);
    }

    public final URI getApiDocsURL() {
        return Swift_apiDocsURL(this.Swift_peer);
    }

    public final String getDiscord() {
        return Swift_discord(this.Swift_peer);
    }

    public final URI getDiscordURL() {
        return Swift_discordURL(this.Swift_peer);
    }

    public final String getHelpCenter() {
        return Swift_helpCenter(this.Swift_peer);
    }

    public final URI getHelpCenterURL() {
        return Swift_helpCenterURL(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final String getUserPrograms() {
        return Swift_userPrograms(this.Swift_peer);
    }

    public final URI getUserProgramsURL() {
        return Swift_userProgramsURL(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(Swift_hashvalue(this.Swift_peer));
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public EWebLinksConfig(String str, String str2, String str3, String str4) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, str3, str4);
    }

    public EWebLinksConfig(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
