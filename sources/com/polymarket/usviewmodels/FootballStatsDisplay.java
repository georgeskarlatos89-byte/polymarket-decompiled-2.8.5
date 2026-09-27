package com.polymarket.usviewmodels;

import com.polymarket.data.EEventState;
import com.polymarket.data.ESportPregameDetails;
import com.polymarket.data.ESportStatsFootball;
import com.polymarket.data.ESportStatsSoccerTeam;
import com.polymarket.designtokens.DesignTokens;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ace;
import defpackage.woa;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Identifiable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0003PQRB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBI\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\b\u0010\u0016B;\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\b\u0010\u001bBI\b\u0016\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\r\u0012\u0006\u0010\"\u001a\u00020\u0012\u0012\u0006\u0010#\u001a\u00020\u0012¢\u0006\u0004\b\b\u0010$J\u0006\u0010)\u001a\u00020*J\u0015\u0010+\u001a\u00020*2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010,\u001a\u00020-H\u0016J\u0017\u00100\u001a\u0004\u0018\u00010\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00103\u001a\u0004\u0018\u00010\u001f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00106\u001a\u0004\u0018\u00010\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u00109\u001a\b\u0012\u0004\u0012\u00020!0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010<\u001a\u00020\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010>\u001a\u00020\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JK\u0010?\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0082 J\u0015\u0010C\u001a\u00020A2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J?\u0010D\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0082 JI\u0010E\u001a\u00060\u0004j\u0002`\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\r2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u0012H\u0082 J\u0013\u0010F\u001a\u00020A2\b\u0010G\u001a\u0004\u0018\u00010HH\u0096\u0002J\u0019\u0010I\u001a\u00020A2\u0006\u0010J\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u0000H\u0082 J\u0016\u0010L\u001a\b\u0012\u0004\u0012\u00020H0M2\u0006\u0010N\u001a\u00020-H\u0016J\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020H0M2\u0006\u0010N\u001a\u00020-H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\r8F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010\"\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010#\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0011\u0010@\u001a\u00020A8F¢\u0006\u0006\u001a\u0004\b@\u0010B¨\u0006S"}, d2 = {"Lcom/polymarket/usviewmodels/FootballStatsDisplay;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "stats", "Lcom/polymarket/data/ESportStatsFootball;", "eventTeams", "", "Lcom/polymarket/data/ESportStatsSoccerTeam;", "eventState", "Lcom/polymarket/data/EEventState;", "homeColor", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "awayColor", "tvNetworkText", "", "(Lcom/polymarket/data/ESportStatsFootball;Ljava/util/List;Lcom/polymarket/data/EEventState;Lcom/polymarket/designtokens/DesignTokens$SemanticColor;Lcom/polymarket/designtokens/DesignTokens$SemanticColor;Ljava/lang/String;)V", "pregame", "Lcom/polymarket/data/ESportPregameDetails;", "context", "Lcom/polymarket/usviewmodels/FootballPregameContext;", "(Lcom/polymarket/data/ESportPregameDetails;Lcom/polymarket/usviewmodels/FootballPregameContext;Ljava/util/List;Lcom/polymarket/designtokens/DesignTokens$SemanticColor;Lcom/polymarket/designtokens/DesignTokens$SemanticColor;)V", "boxScore", "Lcom/polymarket/usviewmodels/FootballStatsDisplay$BoxScore;", "matchup", "Lcom/polymarket/usviewmodels/FootballMatchupDisplay;", "metrics", "Lcom/polymarket/usviewmodels/FootballStatsDisplay$Metric;", "leadingColor", "trailingColor", "(Lcom/polymarket/usviewmodels/FootballStatsDisplay$BoxScore;Lcom/polymarket/usviewmodels/FootballMatchupDisplay;Ljava/lang/String;Ljava/util/List;Lcom/polymarket/designtokens/DesignTokens$SemanticColor;Lcom/polymarket/designtokens/DesignTokens$SemanticColor;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getBoxScore", "()Lcom/polymarket/usviewmodels/FootballStatsDisplay$BoxScore;", "Swift_boxScore", "getMatchup", "()Lcom/polymarket/usviewmodels/FootballMatchupDisplay;", "Swift_matchup", "getTvNetworkText", "()Ljava/lang/String;", "Swift_tvNetworkText", "getMetrics", "()Ljava/util/List;", "Swift_metrics", "getLeadingColor", "()Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "Swift_leadingColor", "getTrailingColor", "Swift_trailingColor", "Swift_constructor_0", "isPresentable", "", "()Z", "Swift_isPresentable", "Swift_constructor_1", "Swift_constructor_2", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "BoxScore", "Metric", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FootballStatsDisplay implements SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;

    public FootballStatsDisplay(ESportPregameDetails eSportPregameDetails, FootballPregameContext footballPregameContext, List<ESportStatsSoccerTeam> list, DesignTokens.SemanticColor semanticColor, DesignTokens.SemanticColor semanticColor2) {
        eSportPregameDetails.getClass();
        footballPregameContext.getClass();
        list.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(eSportPregameDetails, footballPregameContext, list, semanticColor, semanticColor2);
    }

    private final native BoxScore Swift_boxScore(long Swift_peer);

    private final native long Swift_constructor_0(ESportStatsFootball stats, List<ESportStatsSoccerTeam> eventTeams, EEventState eventState, DesignTokens.SemanticColor homeColor, DesignTokens.SemanticColor awayColor, String tvNetworkText);

    private final native long Swift_constructor_1(ESportPregameDetails pregame, FootballPregameContext context, List<ESportStatsSoccerTeam> eventTeams, DesignTokens.SemanticColor homeColor, DesignTokens.SemanticColor awayColor);

    private final native long Swift_constructor_2(BoxScore boxScore, FootballMatchupDisplay matchup, String tvNetworkText, List<Metric> metrics, DesignTokens.SemanticColor leadingColor, DesignTokens.SemanticColor trailingColor);

    private final native boolean Swift_isPresentable(long Swift_peer);

    private final native boolean Swift_isequal(FootballStatsDisplay lhs, FootballStatsDisplay rhs);

    private final native DesignTokens.SemanticColor Swift_leadingColor(long Swift_peer);

    private final native FootballMatchupDisplay Swift_matchup(long Swift_peer);

    private final native List<Metric> Swift_metrics(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native DesignTokens.SemanticColor Swift_trailingColor(long Swift_peer);

    private final native String Swift_tvNetworkText(long Swift_peer);

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
        if (!(other instanceof FootballStatsDisplay)) {
            return false;
        }
        return Swift_isequal(this, (FootballStatsDisplay) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final BoxScore getBoxScore() {
        return Swift_boxScore(this.Swift_peer);
    }

    public final DesignTokens.SemanticColor getLeadingColor() {
        return Swift_leadingColor(this.Swift_peer);
    }

    public final FootballMatchupDisplay getMatchup() {
        return Swift_matchup(this.Swift_peer);
    }

    public final List<Metric> getMetrics() {
        return Swift_metrics(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final DesignTokens.SemanticColor getTrailingColor() {
        return Swift_trailingColor(this.Swift_peer);
    }

    public final String getTvNetworkText() {
        return Swift_tvNetworkText(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isPresentable() {
        return Swift_isPresentable(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\t\u0010\u0006\u001a\u00020\u0005H\u0082 J\u0012\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\u0013\u0010\n\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0082 ¨\u0006\u000b"}, d2 = {"Lcom/polymarket/usviewmodels/FootballStatsDisplay$Companion;", "", "<init>", "()V", "mockPregame", "Lcom/polymarket/usviewmodels/FootballStatsDisplay;", "Swift_Companion_mockPregame_3", "mock", "tvNetworkText", "", "Swift_Companion_mock_4", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native FootballStatsDisplay Swift_Companion_mockPregame_3();

        private final native FootballStatsDisplay Swift_Companion_mock_4(String tvNetworkText);

        public static /* synthetic */ FootballStatsDisplay mock$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return companion.mock(str);
        }

        public final FootballStatsDisplay mock(String tvNetworkText) {
            return Swift_Companion_mock_4(tvNetworkText);
        }

        public final FootballStatsDisplay mockPregame() {
            return Swift_Companion_mockPregame_3();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0002*+B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB%\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J)\u0010\u001e\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0082 J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\u0019\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0000H\u0082 J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0'2\u0006\u0010(\u001a\u00020\u0018H\u0016J\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0'2\u0006\u0010(\u001a\u00020\u0018H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006,"}, d2 = {"Lcom/polymarket/usviewmodels/FootballStatsDisplay$BoxScore;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "columnTitles", "", "", "rows", "Lcom/polymarket/usviewmodels/FootballStatsDisplay$BoxScore$Row;", "(Ljava/util/List;Ljava/util/List;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getColumnTitles", "()Ljava/util/List;", "Swift_columnTitles", "getRows", "Swift_rows", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Row", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class BoxScore implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public BoxScore(List<String> list, List<Row> list2) {
            list.getClass();
            list2.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(list, list2);
        }

        private final native List<String> Swift_columnTitles(long Swift_peer);

        private final native long Swift_constructor_0(List<String> columnTitles, List<Row> rows);

        private final native boolean Swift_isequal(BoxScore lhs, BoxScore rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native List<Row> Swift_rows(long Swift_peer);

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
            if (!(other instanceof BoxScore)) {
                return false;
            }
            return Swift_isequal(this, (BoxScore) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final List<String> getColumnTitles() {
            return Swift_columnTitles(this.Swift_peer);
        }

        public final List<Row> getRows() {
            return Swift_rows(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00014B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB1\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010¢\u0006\u0004\b\n\u0010\u0011J\u0006\u0010\u0016\u001a\u00020\u0017J\u0015\u0010\u0018\u001a\u00020\u00172\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0015\u0010\u001d\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010\u001f\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010!\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010$\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J5\u0010(\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0082 J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0096\u0002J\u0019\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0000H\u0082 J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020,012\u0006\u00102\u001a\u00020\u001aH\u0016J\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020,012\u0006\u00102\u001a\u00020\u001aH\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b \u0010\u001cR\u0013\u0010\"\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010\u001cR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u00065"}, d2 = {"Lcom/polymarket/usviewmodels/FootballStatsDisplay$BoxScore$Row;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, Keys.KEY_NAME, "helmetIcon", "values", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getName", "Swift_name", "getHelmetIcon", "Swift_helmetIcon", "helmetIconDark", "getHelmetIconDark", "Swift_helmetIconDark", "getValues", "()Ljava/util/List;", "Swift_values", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Row implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
            private long Swift_peer;

            public Row(String str, String str2, String str3, List<String> list) {
                ace.B(str, str2, list);
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = Swift_constructor_0(str, str2, str3, list);
            }

            private final native long Swift_constructor_0(String id, String name, String helmetIcon, List<String> values);

            private final native String Swift_helmetIcon(long Swift_peer);

            private final native String Swift_helmetIconDark(long Swift_peer);

            private final native String Swift_id(long Swift_peer);

            private final native boolean Swift_isequal(Row lhs, Row rhs);

            private final native String Swift_name(long Swift_peer);

            private final native Function0<Object> Swift_projectionImpl(int options);

            private final native void Swift_release(long Swift_peer);

            private final native List<String> Swift_values(long Swift_peer);

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
                if (!(other instanceof Row)) {
                    return false;
                }
                return Swift_isequal(this, (Row) other);
            }

            public final void finalize() {
                Swift_release(this.Swift_peer);
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            }

            public final String getHelmetIcon() {
                return Swift_helmetIcon(this.Swift_peer);
            }

            public final String getHelmetIconDark() {
                return Swift_helmetIconDark(this.Swift_peer);
            }

            @Override // skip.lib.Identifiable
            /* renamed from: getId, reason: avoid collision after fix types in other method */
            public String getId2() {
                return Swift_id(this.Swift_peer);
            }

            public final String getName() {
                return Swift_name(this.Swift_peer);
            }

            public final long getSwift_peer() {
                return this.Swift_peer;
            }

            public final List<String> getValues() {
                return Swift_values(this.Swift_peer);
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

            public Row(long j, SwiftPeerMarker swiftPeerMarker) {
                BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = j;
            }
        }

        public BoxScore(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00017B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB9\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\n\u0010\u0013J\u0006\u0010\u0018\u001a\u00020\u0019J\u0015\u0010\u001a\u001a\u00020\u00192\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0015\u0010\u001f\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010!\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010#\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010%\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010(\u001a\u00020\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010*\u001a\u00020\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J=\u0010+\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0082 J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\u0019\u00100\u001a\u00020-2\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0000H\u0082 J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020/042\u0006\u00105\u001a\u00020\u001cH\u0016J\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020/042\u0006\u00105\u001a\u00020\u001cH\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b$\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b)\u0010'¨\u00068"}, d2 = {"Lcom/polymarket/usviewmodels/FootballStatsDisplay$Metric;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "leadingValueText", "trailingValueText", "leadingRatio", "", "trailingRatio", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getTitle", "Swift_title", "getLeadingValueText", "Swift_leadingValueText", "getTrailingValueText", "Swift_trailingValueText", "getLeadingRatio", "()D", "Swift_leadingRatio", "getTrailingRatio", "Swift_trailingRatio", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Metric implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Metric(String str, String str2, String str3, String str4, double d, double d2) {
            woa.A(str, str2, str3, str4);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, str3, str4, d, d2);
        }

        private final native long Swift_constructor_0(String id, String title, String leadingValueText, String trailingValueText, double leadingRatio, double trailingRatio);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(Metric lhs, Metric rhs);

        private final native double Swift_leadingRatio(long Swift_peer);

        private final native String Swift_leadingValueText(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_title(long Swift_peer);

        private final native double Swift_trailingRatio(long Swift_peer);

        private final native String Swift_trailingValueText(long Swift_peer);

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
            if (!(other instanceof Metric)) {
                return false;
            }
            return Swift_isequal(this, (Metric) other);
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

        public final double getLeadingRatio() {
            return Swift_leadingRatio(this.Swift_peer);
        }

        public final String getLeadingValueText() {
            return Swift_leadingValueText(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getTitle() {
            return Swift_title(this.Swift_peer);
        }

        public final double getTrailingRatio() {
            return Swift_trailingRatio(this.Swift_peer);
        }

        public final String getTrailingValueText() {
            return Swift_trailingValueText(this.Swift_peer);
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

        public Metric(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    public FootballStatsDisplay(ESportStatsFootball eSportStatsFootball, List<ESportStatsSoccerTeam> list, EEventState eEventState, DesignTokens.SemanticColor semanticColor, DesignTokens.SemanticColor semanticColor2, String str) {
        eSportStatsFootball.getClass();
        list.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(eSportStatsFootball, list, eEventState, semanticColor, semanticColor2, str);
    }

    public /* synthetic */ FootballStatsDisplay(ESportStatsFootball eSportStatsFootball, List list, EEventState eEventState, DesignTokens.SemanticColor semanticColor, DesignTokens.SemanticColor semanticColor2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eSportStatsFootball, (List<ESportStatsSoccerTeam>) list, eEventState, semanticColor, semanticColor2, (i & 32) != 0 ? null : str);
    }

    public FootballStatsDisplay(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public FootballStatsDisplay(BoxScore boxScore, FootballMatchupDisplay footballMatchupDisplay, String str, List<Metric> list, DesignTokens.SemanticColor semanticColor, DesignTokens.SemanticColor semanticColor2) {
        list.getClass();
        semanticColor.getClass();
        semanticColor2.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_2(boxScore, footballMatchupDisplay, str, list, semanticColor, semanticColor2);
    }

    public /* synthetic */ FootballStatsDisplay(BoxScore boxScore, FootballMatchupDisplay footballMatchupDisplay, String str, List list, DesignTokens.SemanticColor semanticColor, DesignTokens.SemanticColor semanticColor2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(boxScore, (i & 2) != 0 ? null : footballMatchupDisplay, (i & 4) != 0 ? null : str, (List<Metric>) list, semanticColor, semanticColor2);
    }
}
