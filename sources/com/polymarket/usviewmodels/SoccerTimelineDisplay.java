package com.polymarket.usviewmodels;

import com.polymarket.data.EGameTimeline;
import com.polymarket.data.ELatestHighlight;
import com.polymarket.data.ESportLineup;
import com.polymarket.data.ESportLineupSoccerQualifier;
import com.polymarket.data.ESportStats;
import com.polymarket.data.ESportStatsSoccerTeam;
import com.polymarket.data.ESportTimelineSoccer;
import com.polymarket.usviewmodels.FootballTimelineDisplay;
import com.socure.docv.capturesdk.api.Keys;
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
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0003;<=B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB/\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\b\u0010\u0013B%\b\u0016\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011¢\u0006\u0004\b\b\u0010\u0018J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0015\u0010\u001f\u001a\u00020\u001e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010 \u001a\u00020!H\u0016J\u001b\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00170\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J3\u0010'\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0082 J\u0015\u0010+\u001a\u00020)2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J)\u00100\u001a\u00060\u0004j\u0002`\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011H\u0082 J\u0013\u00101\u001a\u00020)2\b\u00102\u001a\u0004\u0018\u000103H\u0096\u0002J\u0019\u00104\u001a\u00020)2\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u0000H\u0082 J\u0016\u00107\u001a\b\u0012\u0004\u0012\u000203082\u0006\u00109\u001a\u00020!H\u0016J\u0017\u0010:\u001a\b\u0012\u0004\u0012\u000203082\u0006\u00109\u001a\u00020!H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00118F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00118F¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0011\u0010(\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b(\u0010*R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00118F¢\u0006\u0006\u001a\u0004\b.\u0010#¨\u0006>"}, d2 = {"Lcom/polymarket/usviewmodels/SoccerTimelineDisplay;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "timeline", "Lcom/polymarket/data/ESportTimelineSoccer;", "stats", "Lcom/polymarket/data/ESportStats;", "lineup", "Lcom/polymarket/data/ESportLineup;", "eventTeams", "", "Lcom/polymarket/data/ESportStatsSoccerTeam;", "(Lcom/polymarket/data/ESportTimelineSoccer;Lcom/polymarket/data/ESportStats;Lcom/polymarket/data/ESportLineup;Ljava/util/List;)V", "teams", "Lcom/polymarket/usviewmodels/SoccerTimelineDisplay$Team;", RadarTrackingOptions.RadarTrackingOptionsSync.EVENTS_STR, "Lcom/polymarket/usviewmodels/SoccerTimelineDisplay$Event;", "(Ljava/util/List;Ljava/util/List;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getTeams", "()Ljava/util/List;", "Swift_teams", "getEvents", "Swift_events", "Swift_constructor_0", "isPresentable", "", "()Z", "Swift_isPresentable", "listRows", "Lcom/polymarket/usviewmodels/FootballTimelineDisplay$Row;", "getListRows", "Swift_listRows", "Swift_constructor_1", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Team", "Event", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SoccerTimelineDisplay implements SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;

    public SoccerTimelineDisplay(ESportTimelineSoccer eSportTimelineSoccer, ESportStats eSportStats, ESportLineup eSportLineup, List<ESportStatsSoccerTeam> list) {
        eSportTimelineSoccer.getClass();
        eSportStats.getClass();
        eSportLineup.getClass();
        list.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(eSportTimelineSoccer, eSportStats, eSportLineup, list);
    }

    private final native long Swift_constructor_0(ESportTimelineSoccer timeline, ESportStats stats, ESportLineup lineup, List<ESportStatsSoccerTeam> eventTeams);

    private final native long Swift_constructor_1(List<Team> teams, List<Event> events);

    private final native List<Event> Swift_events(long Swift_peer);

    private final native boolean Swift_isPresentable(long Swift_peer);

    private final native boolean Swift_isequal(SoccerTimelineDisplay lhs, SoccerTimelineDisplay rhs);

    private final native List<FootballTimelineDisplay.Row> Swift_listRows(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native List<Team> Swift_teams(long Swift_peer);

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
        if (!(other instanceof SoccerTimelineDisplay)) {
            return false;
        }
        return Swift_isequal(this, (SoccerTimelineDisplay) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final List<Event> getEvents() {
        return Swift_events(this.Swift_peer);
    }

    public final List<FootballTimelineDisplay.Row> getListRows() {
        return Swift_listRows(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final List<Team> getTeams() {
        return Swift_teams(this.Swift_peer);
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\t\u0010\u0006\u001a\u00020\u0005H\u0082 ¨\u0006\u0007"}, d2 = {"Lcom/polymarket/usviewmodels/SoccerTimelineDisplay$Companion;", "", "<init>", "()V", "mock", "Lcom/polymarket/usviewmodels/SoccerTimelineDisplay;", "Swift_Companion_mock_2", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native SoccerTimelineDisplay Swift_Companion_mock_2();

        public final SoccerTimelineDisplay mock() {
            return Swift_Companion_mock_2();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00015B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB-\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\n\u0010\u0013J\u0006\u0010\u0018\u001a\u00020\u0019J\u0015\u0010\u001a\u001a\u00020\u00192\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0015\u0010\u001f\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010\"\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010%\u001a\u00020\u00102\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010(\u001a\u0004\u0018\u00010\u00122\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J1\u0010)\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0082 J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0096\u0002J\u0019\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0000H\u0082 J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020-022\u0006\u00103\u001a\u00020\u001cH\u0016J\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020-022\u0006\u00103\u001a\u00020\u001cH\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u00066"}, d2 = {"Lcom/polymarket/usviewmodels/SoccerTimelineDisplay$Event;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "team", "Lcom/polymarket/usviewmodels/SoccerTimelineDisplay$Team;", "highlight", "Lcom/polymarket/data/ELatestHighlight;", "gameTimeline", "Lcom/polymarket/data/EGameTimeline;", "(Ljava/lang/String;Lcom/polymarket/usviewmodels/SoccerTimelineDisplay$Team;Lcom/polymarket/data/ELatestHighlight;Lcom/polymarket/data/EGameTimeline;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getTeam", "()Lcom/polymarket/usviewmodels/SoccerTimelineDisplay$Team;", "Swift_team", "getHighlight", "()Lcom/polymarket/data/ELatestHighlight;", "Swift_highlight", "getGameTimeline", "()Lcom/polymarket/data/EGameTimeline;", "Swift_gameTimeline", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Event implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Event(String str, Team team, ELatestHighlight eLatestHighlight, EGameTimeline eGameTimeline) {
            str.getClass();
            eLatestHighlight.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, team, eLatestHighlight, eGameTimeline);
        }

        private final native long Swift_constructor_0(String id, Team team, ELatestHighlight highlight, EGameTimeline gameTimeline);

        private final native EGameTimeline Swift_gameTimeline(long Swift_peer);

        private final native ELatestHighlight Swift_highlight(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(Event lhs, Event rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native Team Swift_team(long Swift_peer);

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
            if (!(other instanceof Event)) {
                return false;
            }
            return Swift_isequal(this, (Event) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final EGameTimeline getGameTimeline() {
            return Swift_gameTimeline(this.Swift_peer);
        }

        public final ELatestHighlight getHighlight() {
            return Swift_highlight(this.Swift_peer);
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final Team getTeam() {
            return Swift_team(this.Swift_peer);
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

        public Event(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00018B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0015\u0010\u0012\u001a\u00020\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0015\u0010\u0018\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010\u001b\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010 \u001a\u00020\u001d2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010#\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010&\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010)\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010,\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0096\u0002J\u0019\u00101\u001a\u00020.2\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0000H\u0082 J\u0016\u00104\u001a\b\u0012\u0004\u0012\u000200052\u0006\u00106\u001a\u00020\u0014H\u0016J\u0017\u00107\u001a\b\u0012\u0004\u0012\u000200052\u0006\u00106\u001a\u00020\u0014H\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010!\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0017R\u0013\u0010$\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b%\u0010\u0017R\u0013\u0010'\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b(\u0010\u0017R\u0013\u0010*\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b+\u0010\u0017¨\u00069"}, d2 = {"Lcom/polymarket/usviewmodels/SoccerTimelineDisplay$Team;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()Ljava/lang/String;", "Swift_id", Keys.KEY_NAME, "getName", "Swift_name", "qualifier", "Lcom/polymarket/data/ESportLineupSoccerQualifier;", "getQualifier", "()Lcom/polymarket/data/ESportLineupSoccerQualifier;", "Swift_qualifier", "colorHex", "getColorHex", "Swift_colorHex", "logo", "getLogo", "Swift_logo", "longLogo", "getLongLogo", "Swift_longLogo", "longLogoDark", "getLongLogoDark", "Swift_longLogoDark", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Team implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Team(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private final native String Swift_colorHex(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(Team lhs, Team rhs);

        private final native String Swift_logo(long Swift_peer);

        private final native String Swift_longLogo(long Swift_peer);

        private final native String Swift_longLogoDark(long Swift_peer);

        private final native String Swift_name(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native ESportLineupSoccerQualifier Swift_qualifier(long Swift_peer);

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
            if (!(other instanceof Team)) {
                return false;
            }
            return Swift_isequal(this, (Team) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getColorHex() {
            return Swift_colorHex(this.Swift_peer);
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
        }

        public final String getLogo() {
            return Swift_logo(this.Swift_peer);
        }

        public final String getLongLogo() {
            return Swift_longLogo(this.Swift_peer);
        }

        public final String getLongLogoDark() {
            return Swift_longLogoDark(this.Swift_peer);
        }

        public final String getName() {
            return Swift_name(this.Swift_peer);
        }

        public final ESportLineupSoccerQualifier getQualifier() {
            return Swift_qualifier(this.Swift_peer);
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

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ String getId() {
            return getId2();
        }
    }

    public SoccerTimelineDisplay(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public SoccerTimelineDisplay(List<Team> list, List<Event> list2) {
        list.getClass();
        list2.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(list, list2);
    }
}
