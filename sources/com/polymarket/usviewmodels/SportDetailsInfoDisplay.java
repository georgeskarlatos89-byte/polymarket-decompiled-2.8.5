package com.polymarket.usviewmodels;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.polymarket.data.EEventState;
import com.polymarket.data.ESportLineup;
import com.polymarket.data.ESportPregameDetails;
import com.polymarket.data.ESportStats;
import com.polymarket.data.ESportStatsSoccerTeam;
import com.polymarket.data.ESportTimeline;
import com.polymarket.designtokens.DesignTokens;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Array;
import skip.lib.ArrayKt;
import skip.lib.CaseIterable;
import skip.lib.CaseIterableCompanion;
import skip.lib.Identifiable;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 r2\u00020\u00012\u00020\u0002:\u0003pqrB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0085\u0001\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\b\u0010 BS\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010'\u001a\u00020(\u0012\b\u0010\f\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010*\u001a\u00020(¢\u0006\u0004\b\b\u0010+J\u0006\u00100\u001a\u000201J\u0015\u00102\u001a\u0002012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u00103\u001a\u000204H\u0016J\u0015\u00108\u001a\u00020\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010;\u001a\u0004\u0018\u00010!2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010>\u001a\u0004\u0018\u00010#2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010A\u001a\u0004\u0018\u00010$2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010D\u001a\u0004\u0018\u00010&2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010F\u001a\u00020(2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010I\u001a\u0004\u0018\u00010)2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010J\u001a\u00020(2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 Jy\u0010K\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0082 J\u001b\u0010P\u001a\b\u0012\u0004\u0012\u00020M0\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u000e\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020MJ\u001d\u0010T\u001a\u00020R2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010U\u001a\u00020MH\u0082 J\u0015\u0010X\u001a\u00020(2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010[\u001a\u00020(2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010^\u001a\u00020(2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010a\u001a\u00020(2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010d\u001a\u00020(2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JO\u0010e\u001a\u00060\u0004j\u0002`\u00052\b\u0010\n\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u000e\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(2\b\u0010\f\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020(H\u0082 J\u0013\u0010f\u001a\u00020(2\b\u0010g\u001a\u0004\u0018\u00010hH\u0096\u0002J\u0019\u0010i\u001a\u00020(2\u0006\u0010j\u001a\u00020\u00002\u0006\u0010k\u001a\u00020\u0000H\u0082 J\u0016\u0010l\u001a\b\u0012\u0004\u0012\u00020h0m2\u0006\u0010n\u001a\u000204H\u0016J\u0017\u0010o\u001a\b\u0012\u0004\u0012\u00020h0m2\u0006\u0010n\u001a\u000204H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0011\u00105\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0013\u0010\n\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0013\u0010\"\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0013\u0010\u000e\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0013\u0010%\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0011\u0010'\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b'\u0010ER\u0013\u0010\f\u001a\u0004\u0018\u00010)8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0011\u0010*\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b*\u0010ER\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u00118F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0011\u0010V\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bW\u0010ER\u0011\u0010Y\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bZ\u0010ER\u0011\u0010\\\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b]\u0010ER\u0011\u0010_\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b`\u0010ER\u0011\u0010b\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bc\u0010E¨\u0006s"}, d2 = {"Lcom/polymarket/usviewmodels/SportDetailsInfoDisplay;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "stats", "Lcom/polymarket/data/ESportStats;", "lineup", "Lcom/polymarket/data/ESportLineup;", "timeline", "Lcom/polymarket/data/ESportTimeline;", "eventTeams", "", "Lcom/polymarket/data/ESportStatsSoccerTeam;", "homeTeamColor", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "awayTeamColor", "eventState", "Lcom/polymarket/data/EEventState;", "eventSportKind", "Lcom/polymarket/usviewmodels/SportDetailsInfoDisplay$SportKind;", "gameStartTime", "Ljava/util/Date;", "pregame", "Lcom/polymarket/data/ESportPregameDetails;", "pregameContext", "Lcom/polymarket/usviewmodels/FootballPregameContext;", "(Lcom/polymarket/data/ESportStats;Lcom/polymarket/data/ESportLineup;Lcom/polymarket/data/ESportTimeline;Ljava/util/List;Lcom/polymarket/designtokens/DesignTokens$SemanticColor;Lcom/polymarket/designtokens/DesignTokens$SemanticColor;Lcom/polymarket/data/EEventState;Lcom/polymarket/usviewmodels/SportDetailsInfoDisplay$SportKind;Ljava/util/Date;Lcom/polymarket/data/ESportPregameDetails;Lcom/polymarket/usviewmodels/FootballPregameContext;)V", "Lcom/polymarket/usviewmodels/SportStatsDisplay;", "playerStats", "Lcom/polymarket/usviewmodels/SportPlayerStatsDisplay;", "Lcom/polymarket/usviewmodels/SportTimelineDisplay;", "timelineEmptyState", "Lcom/polymarket/usviewmodels/FootballTimelineEmptyStateDisplay;", "isTimelineUnavailable", "", "Lcom/polymarket/usviewmodels/SportLineupDisplay;", "isPregameFootball", "(Lcom/polymarket/usviewmodels/SportStatsDisplay;Lcom/polymarket/usviewmodels/SportPlayerStatsDisplay;Lcom/polymarket/usviewmodels/SportTimelineDisplay;Lcom/polymarket/usviewmodels/FootballTimelineEmptyStateDisplay;ZLcom/polymarket/usviewmodels/SportLineupDisplay;Z)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "sportKind", "getSportKind", "()Lcom/polymarket/usviewmodels/SportDetailsInfoDisplay$SportKind;", "Swift_sportKind", "getStats", "()Lcom/polymarket/usviewmodels/SportStatsDisplay;", "Swift_stats", "getPlayerStats", "()Lcom/polymarket/usviewmodels/SportPlayerStatsDisplay;", "Swift_playerStats", "getTimeline", "()Lcom/polymarket/usviewmodels/SportTimelineDisplay;", "Swift_timeline", "getTimelineEmptyState", "()Lcom/polymarket/usviewmodels/FootballTimelineEmptyStateDisplay;", "Swift_timelineEmptyState", "()Z", "Swift_isTimelineUnavailable", "getLineup", "()Lcom/polymarket/usviewmodels/SportLineupDisplay;", "Swift_lineup", "Swift_isPregameFootball", "Swift_constructor_0", "tabs", "Lcom/polymarket/usviewmodels/SportDetailsInfoDisplay$Tab;", "getTabs", "()Ljava/util/List;", "Swift_tabs", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "for_", "Swift_title_1", "tab", "hasPresentableStats", "getHasPresentableStats", "Swift_hasPresentableStats", "hasPresentablePlayerStats", "getHasPresentablePlayerStats", "Swift_hasPresentablePlayerStats", "hasPresentableTimeline", "getHasPresentableTimeline", "Swift_hasPresentableTimeline", "hasPresentableLineup", "getHasPresentableLineup", "Swift_hasPresentableLineup", "hasAnyPresentableDetails", "getHasAnyPresentableDetails", "Swift_hasAnyPresentableDetails", "Swift_constructor_2", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Tab", "SportKind", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SportDetailsInfoDisplay implements SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;

    public /* synthetic */ SportDetailsInfoDisplay(ESportStats eSportStats, ESportLineup eSportLineup, ESportTimeline eSportTimeline, List list, DesignTokens.SemanticColor semanticColor, DesignTokens.SemanticColor semanticColor2, EEventState eEventState, SportKind sportKind, Date date, ESportPregameDetails eSportPregameDetails, FootballPregameContext footballPregameContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eSportStats, eSportLineup, (i & 4) != 0 ? null : eSportTimeline, list, (i & 16) != 0 ? null : semanticColor, (i & 32) != 0 ? null : semanticColor2, (i & 64) != 0 ? null : eEventState, (i & 128) != 0 ? SportKind.unknown : sportKind, (i & 256) != 0 ? null : date, (i & Barcode.FORMAT_UPC_A) != 0 ? null : eSportPregameDetails, (i & Barcode.FORMAT_UPC_E) != 0 ? null : footballPregameContext);
    }

    private final native long Swift_constructor_0(ESportStats stats, ESportLineup lineup, ESportTimeline timeline, List<ESportStatsSoccerTeam> eventTeams, DesignTokens.SemanticColor homeTeamColor, DesignTokens.SemanticColor awayTeamColor, EEventState eventState, SportKind eventSportKind, Date gameStartTime, ESportPregameDetails pregame, FootballPregameContext pregameContext);

    private final native long Swift_constructor_2(SportStatsDisplay stats, SportPlayerStatsDisplay playerStats, SportTimelineDisplay timeline, FootballTimelineEmptyStateDisplay timelineEmptyState, boolean isTimelineUnavailable, SportLineupDisplay lineup, boolean isPregameFootball);

    private final native boolean Swift_hasAnyPresentableDetails(long Swift_peer);

    private final native boolean Swift_hasPresentableLineup(long Swift_peer);

    private final native boolean Swift_hasPresentablePlayerStats(long Swift_peer);

    private final native boolean Swift_hasPresentableStats(long Swift_peer);

    private final native boolean Swift_hasPresentableTimeline(long Swift_peer);

    private final native boolean Swift_isPregameFootball(long Swift_peer);

    private final native boolean Swift_isTimelineUnavailable(long Swift_peer);

    private final native boolean Swift_isequal(SportDetailsInfoDisplay lhs, SportDetailsInfoDisplay rhs);

    private final native SportLineupDisplay Swift_lineup(long Swift_peer);

    private final native SportPlayerStatsDisplay Swift_playerStats(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native SportKind Swift_sportKind(long Swift_peer);

    private final native SportStatsDisplay Swift_stats(long Swift_peer);

    private final native List<Tab> Swift_tabs(long Swift_peer);

    private final native SportTimelineDisplay Swift_timeline(long Swift_peer);

    private final native FootballTimelineEmptyStateDisplay Swift_timelineEmptyState(long Swift_peer);

    private final native String Swift_title_1(long Swift_peer, Tab tab);

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
        if (!(other instanceof SportDetailsInfoDisplay)) {
            return false;
        }
        return Swift_isequal(this, (SportDetailsInfoDisplay) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final boolean getHasAnyPresentableDetails() {
        return Swift_hasAnyPresentableDetails(this.Swift_peer);
    }

    public final boolean getHasPresentableLineup() {
        return Swift_hasPresentableLineup(this.Swift_peer);
    }

    public final boolean getHasPresentablePlayerStats() {
        return Swift_hasPresentablePlayerStats(this.Swift_peer);
    }

    public final boolean getHasPresentableStats() {
        return Swift_hasPresentableStats(this.Swift_peer);
    }

    public final boolean getHasPresentableTimeline() {
        return Swift_hasPresentableTimeline(this.Swift_peer);
    }

    public final SportLineupDisplay getLineup() {
        return Swift_lineup(this.Swift_peer);
    }

    public final SportPlayerStatsDisplay getPlayerStats() {
        return Swift_playerStats(this.Swift_peer);
    }

    public final SportKind getSportKind() {
        return Swift_sportKind(this.Swift_peer);
    }

    public final SportStatsDisplay getStats() {
        return Swift_stats(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final List<Tab> getTabs() {
        return Swift_tabs(this.Swift_peer);
    }

    public final SportTimelineDisplay getTimeline() {
        return Swift_timeline(this.Swift_peer);
    }

    public final FootballTimelineEmptyStateDisplay getTimelineEmptyState() {
        return Swift_timelineEmptyState(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isPregameFootball() {
        return Swift_isPregameFootball(this.Swift_peer);
    }

    public final boolean isTimelineUnavailable() {
        return Swift_isTimelineUnavailable(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public final String title(Tab for_) {
        for_.getClass();
        return Swift_title_1(this.Swift_peer, for_);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0015B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0016"}, d2 = {"Lcom/polymarket/usviewmodels/SportDetailsInfoDisplay$SportKind;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "soccer", "football", "unknown", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class SportKind implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ SportKind[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final SportKind soccer = new SportKind("soccer", 0, "soccer", null, 2, null);
        public static final SportKind football = new SportKind("football", 1, "football", null, 2, null);
        public static final SportKind unknown = new SportKind("unknown", 2, "unknown", null, 2, null);

        private static final /* synthetic */ SportKind[] $values() {
            return new SportKind[]{soccer, football, unknown};
        }

        static {
            SportKind[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ SportKind(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static SportKind valueOf(String str) {
            return (SportKind) Enum.valueOf(SportKind.class, str);
        }

        public static SportKind[] values() {
            return (SportKind[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SportDetailsInfoDisplay$SportKind$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usviewmodels/SportDetailsInfoDisplay$SportKind;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SportKind init(String rawValue) {
                rawValue.getClass();
                int hashCode = rawValue.hashCode();
                if (hashCode != -897056407) {
                    if (hashCode != -284840886) {
                        if (hashCode == 394668909 && rawValue.equals("football")) {
                            return SportKind.football;
                        }
                        return null;
                    }
                    if (rawValue.equals("unknown")) {
                        return SportKind.unknown;
                    }
                    return null;
                }
                if (!rawValue.equals("soccer")) {
                    return null;
                }
                return SportKind.soccer;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private SportKind(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u001f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u00042\u00020\u00052\b\u0012\u0004\u0012\u00020\u00000\u0006:\u0001\u001fB\u001d\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0082 J\u0011\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0082 J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0082 R\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006 "}, d2 = {"Lcom/polymarket/usviewmodels/SportDetailsInfoDisplay$Tab;", "Lskip/lib/CaseIterable;", "Lskip/lib/Identifiable;", "", "Lskip/lib/RawRepresentable;", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "stats", "playerStats", "lineup", "timeline", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "Swift_id", Keys.KEY_NAME, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "Swift_title", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Tab implements CaseIterable, Identifiable<String>, RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Tab[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final Tab stats = new Tab("stats", 0, "stats", null, 2, null);
        public static final Tab playerStats = new Tab("playerStats", 1, "playerStats", null, 2, null);
        public static final Tab lineup = new Tab("lineup", 2, "lineup", null, 2, null);
        public static final Tab timeline = new Tab("timeline", 3, "timeline", null, 2, null);

        private static final /* synthetic */ Tab[] $values() {
            return new Tab[]{stats, playerStats, lineup, timeline};
        }

        static {
            Tab[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ Tab(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native String Swift_id(String name);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native String Swift_title(String name);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Tab valueOf(String str) {
            return (Tab) Enum.valueOf(Tab.class, str);
        }

        public static Tab[] values() {
            return (Tab[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(name());
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        public final String getTitle() {
            return Swift_title(name());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/SportDetailsInfoDisplay$Tab$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/usviewmodels/SportDetailsInfoDisplay$Tab;", "<init>", "()V", "init", "rawValue", "", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion implements CaseIterableCompanion<Tab> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // skip.lib.CaseIterableCompanion
            public Array<Tab> getAllCases() {
                return ArrayKt.arrayOf(Tab.stats, Tab.playerStats, Tab.lineup, Tab.timeline);
            }

            public final Tab init(String rawValue) {
                rawValue.getClass();
                switch (rawValue.hashCode()) {
                    case -2076650431:
                        if (!rawValue.equals("timeline")) {
                            return null;
                        }
                        return Tab.timeline;
                    case -1102671473:
                        if (rawValue.equals("lineup")) {
                            return Tab.lineup;
                        }
                        return null;
                    case 109757599:
                        if (rawValue.equals("stats")) {
                            return Tab.stats;
                        }
                        return null;
                    case 546037310:
                        if (rawValue.equals("playerStats")) {
                            return Tab.playerStats;
                        }
                        return null;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private Tab(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ String getId() {
            return getId2();
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\t\u0010\u0006\u001a\u00020\u0005H\u0082 J\u0006\u0010\u0007\u001a\u00020\u0005J\t\u0010\b\u001a\u00020\u0005H\u0082 J\u0006\u0010\t\u001a\u00020\u0005J\t\u0010\n\u001a\u00020\u0005H\u0082 J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u0011"}, d2 = {"Lcom/polymarket/usviewmodels/SportDetailsInfoDisplay$Companion;", "", "<init>", "()V", "mock", "Lcom/polymarket/usviewmodels/SportDetailsInfoDisplay;", "Swift_Companion_mock_3", "mockFootball", "Swift_Companion_mockFootball_4", "mockFootballPregame", "Swift_Companion_mockFootballPregame_5", "Tab", "Lcom/polymarket/usviewmodels/SportDetailsInfoDisplay$Tab;", "rawValue", "", "SportKind", "Lcom/polymarket/usviewmodels/SportDetailsInfoDisplay$SportKind;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native SportDetailsInfoDisplay Swift_Companion_mockFootballPregame_5();

        private final native SportDetailsInfoDisplay Swift_Companion_mockFootball_4();

        private final native SportDetailsInfoDisplay Swift_Companion_mock_3();

        public final SportKind SportKind(String rawValue) {
            rawValue.getClass();
            return SportKind.INSTANCE.init(rawValue);
        }

        public final Tab Tab(String rawValue) {
            rawValue.getClass();
            return Tab.INSTANCE.init(rawValue);
        }

        public final SportDetailsInfoDisplay mock() {
            return Swift_Companion_mock_3();
        }

        public final SportDetailsInfoDisplay mockFootball() {
            return Swift_Companion_mockFootball_4();
        }

        public final SportDetailsInfoDisplay mockFootballPregame() {
            return Swift_Companion_mockFootballPregame_5();
        }

        private Companion() {
        }
    }

    public SportDetailsInfoDisplay(ESportStats eSportStats, ESportLineup eSportLineup, ESportTimeline eSportTimeline, List<ESportStatsSoccerTeam> list, DesignTokens.SemanticColor semanticColor, DesignTokens.SemanticColor semanticColor2, EEventState eEventState, SportKind sportKind, Date date, ESportPregameDetails eSportPregameDetails, FootballPregameContext footballPregameContext) {
        eSportStats.getClass();
        eSportLineup.getClass();
        list.getClass();
        sportKind.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(eSportStats, eSportLineup, eSportTimeline, list, semanticColor, semanticColor2, eEventState, sportKind, date, eSportPregameDetails, footballPregameContext);
    }

    public SportDetailsInfoDisplay(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public SportDetailsInfoDisplay(SportStatsDisplay sportStatsDisplay, SportPlayerStatsDisplay sportPlayerStatsDisplay, SportTimelineDisplay sportTimelineDisplay, FootballTimelineEmptyStateDisplay footballTimelineEmptyStateDisplay, boolean z, SportLineupDisplay sportLineupDisplay, boolean z2) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_2(sportStatsDisplay, sportPlayerStatsDisplay, sportTimelineDisplay, footballTimelineEmptyStateDisplay, z, sportLineupDisplay, z2);
    }

    public /* synthetic */ SportDetailsInfoDisplay(SportStatsDisplay sportStatsDisplay, SportPlayerStatsDisplay sportPlayerStatsDisplay, SportTimelineDisplay sportTimelineDisplay, FootballTimelineEmptyStateDisplay footballTimelineEmptyStateDisplay, boolean z, SportLineupDisplay sportLineupDisplay, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sportStatsDisplay, (i & 2) != 0 ? null : sportPlayerStatsDisplay, sportTimelineDisplay, (i & 8) != 0 ? null : footballTimelineEmptyStateDisplay, (i & 16) != 0 ? false : z, sportLineupDisplay, (i & 64) != 0 ? false : z2);
    }
}
