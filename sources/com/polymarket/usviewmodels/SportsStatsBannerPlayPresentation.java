package com.polymarket.usviewmodels;

import com.polymarket.data.EEvent;
import com.polymarket.data.ELatestHighlight;
import com.polymarket.designtokens.DesignTokens;
import defpackage.ug7;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0002HIB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001f\u001a\u00020\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\"\u001a\u0004\u0018\u00010\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010%\u001a\u0004\u0018\u00010\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010(\u001a\u0004\u0018\u00010\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010-\u001a\u0004\u0018\u00010*2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00102\u001a\u0004\u0018\u00010/2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00105\u001a\u0004\u0018\u00010\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00108\u001a\u0004\u0018\u00010\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010;\u001a\u0004\u0018\u00010\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001d\u0010<\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0082 J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@H\u0096\u0002J\u0019\u0010A\u001a\u00020>2\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u0000H\u0082 J\u0016\u0010D\u001a\b\u0012\u0004\u0012\u00020@0E2\u0006\u0010F\u001a\u00020\u0017H\u0016J\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020@0E2\u0006\u0010F\u001a\u00020\u0017H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010 \u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b!\u0010\u001bR\u0013\u0010#\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b$\u0010\u001bR\u0013\u0010&\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b'\u0010\u001bR\u0013\u0010)\u001a\u0004\u0018\u00010*8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010.\u001a\u0004\u0018\u00010/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u00103\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b4\u0010\u001bR\u0013\u00106\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b7\u0010\u001bR\u0013\u00109\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b:\u0010\u001b¨\u0006J"}, d2 = {"Lcom/polymarket/usviewmodels/SportsStatsBannerPlayPresentation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "highlight", "Lcom/polymarket/data/ELatestHighlight;", "game", "Lcom/polymarket/data/EEvent$SportsGame;", "(Lcom/polymarket/data/ELatestHighlight;Lcom/polymarket/data/EEvent$SportsGame;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "getId", "()Ljava/lang/String;", "Swift_id", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "Swift_title", "playerName", "getPlayerName", "Swift_playerName", "clock", "getClock", "Swift_clock", "teamAbbreviation", "getTeamAbbreviation", "Swift_teamAbbreviation", "teamColor", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "getTeamColor", "()Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "Swift_teamColor", "teamSide", "Lcom/polymarket/usviewmodels/SportsStatsBannerPlayPresentation$TeamSide;", "getTeamSide", "()Lcom/polymarket/usviewmodels/SportsStatsBannerPlayPresentation$TeamSide;", "Swift_teamSide", "teamLogo", "getTeamLogo", "Swift_teamLogo", "playIcon", "getPlayIcon", "Swift_playIcon", "playIconDark", "getPlayIconDark", "Swift_playIconDark", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "TeamSide", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SportsStatsBannerPlayPresentation implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/SportsStatsBannerPlayPresentation$TeamSide;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "home", "away", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class TeamSide implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ TeamSide[] $VALUES;
        public static final TeamSide home = new TeamSide("home", 0);
        public static final TeamSide away = new TeamSide("away", 1);

        private static final /* synthetic */ TeamSide[] $values() {
            return new TeamSide[]{home, away};
        }

        static {
            TeamSide[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private TeamSide(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static TeamSide valueOf(String str) {
            return (TeamSide) Enum.valueOf(TeamSide.class, str);
        }

        public static TeamSide[] values() {
            return (TeamSide[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    public SportsStatsBannerPlayPresentation(ELatestHighlight eLatestHighlight, EEvent.SportsGame sportsGame) {
        eLatestHighlight.getClass();
        sportsGame.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(eLatestHighlight, sportsGame);
    }

    private final native String Swift_clock(long Swift_peer);

    private final native long Swift_constructor_0(ELatestHighlight highlight, EEvent.SportsGame game);

    private final native String Swift_id(long Swift_peer);

    private final native boolean Swift_isequal(SportsStatsBannerPlayPresentation lhs, SportsStatsBannerPlayPresentation rhs);

    private final native String Swift_playIcon(long Swift_peer);

    private final native String Swift_playIconDark(long Swift_peer);

    private final native String Swift_playerName(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_teamAbbreviation(long Swift_peer);

    private final native DesignTokens.SemanticColor Swift_teamColor(long Swift_peer);

    private final native String Swift_teamLogo(long Swift_peer);

    private final native TeamSide Swift_teamSide(long Swift_peer);

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
        if (!(other instanceof SportsStatsBannerPlayPresentation)) {
            return false;
        }
        return Swift_isequal(this, (SportsStatsBannerPlayPresentation) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final String getClock() {
        return Swift_clock(this.Swift_peer);
    }

    public final String getId() {
        return Swift_id(this.Swift_peer);
    }

    public final String getPlayIcon() {
        return Swift_playIcon(this.Swift_peer);
    }

    public final String getPlayIconDark() {
        return Swift_playIconDark(this.Swift_peer);
    }

    public final String getPlayerName() {
        return Swift_playerName(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final String getTeamAbbreviation() {
        return Swift_teamAbbreviation(this.Swift_peer);
    }

    public final DesignTokens.SemanticColor getTeamColor() {
        return Swift_teamColor(this.Swift_peer);
    }

    public final String getTeamLogo() {
        return Swift_teamLogo(this.Swift_peer);
    }

    public final TeamSide getTeamSide() {
        return Swift_teamSide(this.Swift_peer);
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

    public SportsStatsBannerPlayPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
