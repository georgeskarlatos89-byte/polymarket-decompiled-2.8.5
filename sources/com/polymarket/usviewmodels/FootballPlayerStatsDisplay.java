package com.polymarket.usviewmodels;

import com.polymarket.data.ESportLineupSoccerQualifier;
import com.polymarket.data.ESportPregameDetails;
import com.polymarket.data.ESportStatsFootball;
import com.polymarket.data.ESportStatsSoccerTeam;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ace;
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
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0005789:;B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\b\u0010\u000fB%\b\u0016\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\r\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\r¢\u0006\u0004\b\b\u0010\u0014B\u001f\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\b\u0010\u0017J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0015\u0010\u001e\u001a\u00020\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J#\u0010&\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082 J)\u0010'\u001a\u00060\u0004j\u0002`\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\rH\u0082 J\u0015\u0010+\u001a\u00020)2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J#\u0010,\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082 J\u0013\u0010-\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\u0019\u00100\u001a\u00020)2\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0000H\u0082 J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020/042\u0006\u00105\u001a\u00020 H\u0016J\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020/042\u0006\u00105\u001a\u00020 H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\r8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\r8F¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0011\u0010(\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b(\u0010*¨\u0006<"}, d2 = {"Lcom/polymarket/usviewmodels/FootballPlayerStatsDisplay;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "stats", "Lcom/polymarket/data/ESportStatsFootball;", "eventTeams", "", "Lcom/polymarket/data/ESportStatsSoccerTeam;", "(Lcom/polymarket/data/ESportStatsFootball;Ljava/util/List;)V", "sections", "Lcom/polymarket/usviewmodels/FootballPlayerStatsDisplay$Section;", "teams", "Lcom/polymarket/usviewmodels/FootballPlayerStatsDisplay$Team;", "(Ljava/util/List;Ljava/util/List;)V", "pregame", "Lcom/polymarket/data/ESportPregameDetails;", "(Lcom/polymarket/data/ESportPregameDetails;Ljava/util/List;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getSections", "()Ljava/util/List;", "Swift_sections", "getTeams", "Swift_teams", "Swift_constructor_0", "Swift_constructor_1", "isPresentable", "", "()Z", "Swift_isPresentable", "Swift_constructor_2", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Team", "UnitGroup", "Section", "Row", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FootballPlayerStatsDisplay implements SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;

    public FootballPlayerStatsDisplay(ESportStatsFootball eSportStatsFootball, List<ESportStatsSoccerTeam> list) {
        eSportStatsFootball.getClass();
        list.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(eSportStatsFootball, list);
    }

    private final native long Swift_constructor_0(ESportStatsFootball stats, List<ESportStatsSoccerTeam> eventTeams);

    private final native long Swift_constructor_1(List<Section> sections, List<Team> teams);

    private final native long Swift_constructor_2(ESportPregameDetails pregame, List<ESportStatsSoccerTeam> eventTeams);

    private final native boolean Swift_isPresentable(long Swift_peer);

    private final native boolean Swift_isequal(FootballPlayerStatsDisplay lhs, FootballPlayerStatsDisplay rhs);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native List<Section> Swift_sections(long Swift_peer);

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
        if (!(other instanceof FootballPlayerStatsDisplay)) {
            return false;
        }
        return Swift_isequal(this, (FootballPlayerStatsDisplay) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final List<Section> getSections() {
        return Swift_sections(this.Swift_peer);
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\t\u0010\u0006\u001a\u00020\u0005H\u0082 J\u0006\u0010\u0007\u001a\u00020\u0005J\t\u0010\b\u001a\u00020\u0005H\u0082 ¨\u0006\t"}, d2 = {"Lcom/polymarket/usviewmodels/FootballPlayerStatsDisplay$Companion;", "", "<init>", "()V", "mock", "Lcom/polymarket/usviewmodels/FootballPlayerStatsDisplay;", "Swift_Companion_mock_3", "mockPregame", "Swift_Companion_mockPregame_4", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native FootballPlayerStatsDisplay Swift_Companion_mockPregame_4();

        private final native FootballPlayerStatsDisplay Swift_Companion_mock_3();

        public final FootballPlayerStatsDisplay mock() {
            return Swift_Companion_mock_3();
        }

        public final FootballPlayerStatsDisplay mockPregame() {
            return Swift_Companion_mockPregame_4();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 H2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001HB\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB]\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017¢\u0006\u0004\b\n\u0010\u0018BY\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017¢\u0006\u0004\b\n\u0010\u0019J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0015\u0010 \u001a\u00020\u001f2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010!\u001a\u00020\u0011H\u0016J\u0015\u0010$\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010&\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010(\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010*\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001c\u0010-\u001a\u0004\u0018\u00010\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 ¢\u0006\u0002\u0010.J\u0017\u00100\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u00102\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u00105\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001b\u00108\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 Jf\u00109\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0082 ¢\u0006\u0002\u0010:J^\u0010;\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0082 ¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@H\u0096\u0002J\u0019\u0010A\u001a\u00020>2\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u0000H\u0082 J\u0016\u0010D\u001a\b\u0012\u0004\u0012\u00020@0E2\u0006\u0010F\u001a\u00020\u0011H\u0016J\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020@0E2\u0006\u0010F\u001a\u00020\u0011H\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0011\u0010\u000e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b'\u0010#R\u0011\u0010\u000f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b)\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b/\u0010#R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b1\u0010#R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178F¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006I"}, d2 = {"Lcom/polymarket/usviewmodels/FootballPlayerStatsDisplay$Row;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "shortName", "positionTitle", "positionAbbreviation", "jerseyNumber", "", "imageUrl", "darkImageUrl", "qualifier", "Lcom/polymarket/data/ESportLineupSoccerQualifier;", "values", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/ESportLineupSoccerQualifier;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/ESportLineupSoccerQualifier;Ljava/util/List;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "getId", "()Ljava/lang/String;", "Swift_id", "getShortName", "Swift_shortName", "getPositionTitle", "Swift_positionTitle", "getPositionAbbreviation", "Swift_positionAbbreviation", "getJerseyNumber", "()Ljava/lang/Integer;", "Swift_jerseyNumber", "(J)Ljava/lang/Integer;", "getImageUrl", "Swift_imageUrl", "getDarkImageUrl", "Swift_darkImageUrl", "getQualifier", "()Lcom/polymarket/data/ESportLineupSoccerQualifier;", "Swift_qualifier", "getValues", "()Ljava/util/List;", "Swift_values", "Swift_constructor_0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/ESportLineupSoccerQualifier;Ljava/util/List;)J", "Swift_constructor_1", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/ESportLineupSoccerQualifier;Ljava/util/List;)J", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Row implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Row(String str, String str2, String str3, String str4, Integer num, String str5, String str6, ESportLineupSoccerQualifier eSportLineupSoccerQualifier, List<String> list) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            eSportLineupSoccerQualifier.getClass();
            list.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, str3, str4, num, str5, str6, eSportLineupSoccerQualifier, list);
        }

        private final native long Swift_constructor_0(String id, String shortName, String positionTitle, String positionAbbreviation, Integer jerseyNumber, String imageUrl, String darkImageUrl, ESportLineupSoccerQualifier qualifier, List<String> values);

        private final native long Swift_constructor_1(String id, String shortName, String positionTitle, Integer jerseyNumber, String imageUrl, String darkImageUrl, ESportLineupSoccerQualifier qualifier, List<String> values);

        private final native String Swift_darkImageUrl(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native String Swift_imageUrl(long Swift_peer);

        private final native boolean Swift_isequal(Row lhs, Row rhs);

        private final native Integer Swift_jerseyNumber(long Swift_peer);

        private final native String Swift_positionAbbreviation(long Swift_peer);

        private final native String Swift_positionTitle(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native ESportLineupSoccerQualifier Swift_qualifier(long Swift_peer);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_shortName(long Swift_peer);

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

        public final String getDarkImageUrl() {
            return Swift_darkImageUrl(this.Swift_peer);
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
        }

        public final String getImageUrl() {
            return Swift_imageUrl(this.Swift_peer);
        }

        public final Integer getJerseyNumber() {
            return Swift_jerseyNumber(this.Swift_peer);
        }

        public final String getPositionAbbreviation() {
            return Swift_positionAbbreviation(this.Swift_peer);
        }

        public final String getPositionTitle() {
            return Swift_positionTitle(this.Swift_peer);
        }

        public final ESportLineupSoccerQualifier getQualifier() {
            return Swift_qualifier(this.Swift_peer);
        }

        public final String getShortName() {
            return Swift_shortName(this.Swift_peer);
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

        public Row(String str, String str2, String str3, Integer num, String str4, String str5, ESportLineupSoccerQualifier eSportLineupSoccerQualifier, List<String> list) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            eSportLineupSoccerQualifier.getClass();
            list.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_1(str, str2, str3, num, str4, str5, eSportLineupSoccerQualifier, list);
        }

        public /* synthetic */ Row(String str, String str2, String str3, Integer num, String str4, String str5, ESportLineupSoccerQualifier eSportLineupSoccerQualifier, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, eSportLineupSoccerQualifier, list);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00012B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB5\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0004\b\n\u0010\u0012J\u0006\u0010\u0017\u001a\u00020\u0018J\u0015\u0010\u0019\u001a\u00020\u00182\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0015\u0010\u001e\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010 \u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J9\u0010&\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000fH\u0082 J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0096\u0002J\u0019\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0000H\u0082 J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020*0/2\u0006\u00100\u001a\u00020\u001bH\u0016J\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020*0/2\u0006\u00100\u001a\u00020\u001bH\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f8F¢\u0006\u0006\u001a\u0004\b$\u0010\"¨\u00063"}, d2 = {"Lcom/polymarket/usviewmodels/FootballPlayerStatsDisplay$Section;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "columnTitles", "", "rows", "Lcom/polymarket/usviewmodels/FootballPlayerStatsDisplay$Row;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getTitle", "Swift_title", "getColumnTitles", "()Ljava/util/List;", "Swift_columnTitles", "getRows", "Swift_rows", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Section implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Section(String str, String str2, List<String> list, List<Row> list2) {
            str.getClass();
            str2.getClass();
            list.getClass();
            list2.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, list, list2);
        }

        private final native List<String> Swift_columnTitles(long Swift_peer);

        private final native long Swift_constructor_0(String id, String title, List<String> columnTitles, List<Row> rows);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(Section lhs, Section rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native List<Row> Swift_rows(long Swift_peer);

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
            if (!(other instanceof Section)) {
                return false;
            }
            return Swift_isequal(this, (Section) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final List<String> getColumnTitles() {
            return Swift_columnTitles(this.Swift_peer);
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
        }

        public final List<Row> getRows() {
            return Swift_rows(this.Swift_peer);
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

        public Section(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001:B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB/\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\n\u0010\u0012B;\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\n\u0010\u0017J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0015\u0010\u001e\u001a\u00020\u001d2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u0015\u0010#\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010%\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010'\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001b\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00140\u00102\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J3\u0010-\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0082 J3\u0010.\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010H\u0082 J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0096\u0002J\u0019\u00103\u001a\u0002002\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0000H\u0082 J\u0016\u00106\u001a\b\u0012\u0004\u0012\u000202072\u0006\u00108\u001a\u00020 H\u0016J\u0017\u00109\u001a\b\u0012\u0004\u0012\u000202072\u0006\u00108\u001a\u00020 H\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0011\u0010\u000e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b&\u0010\"R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00108F¢\u0006\u0006\u001a\u0004\b+\u0010)¨\u0006;"}, d2 = {"Lcom/polymarket/usviewmodels/FootballPlayerStatsDisplay$Team;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "abbreviation", Keys.KEY_NAME, "units", "", "Lcom/polymarket/usviewmodels/FootballPlayerStatsDisplay$UnitGroup;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "sections", "Lcom/polymarket/usviewmodels/FootballPlayerStatsDisplay$Section;", "unusedp_0", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Void;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getAbbreviation", "Swift_abbreviation", "getName", "Swift_name", "getUnits", "()Ljava/util/List;", "Swift_units", "getSections", "Swift_sections", "Swift_constructor_0", "Swift_constructor_1", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Team implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Team(String str, String str2, String str3, List<UnitGroup> list) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            list.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, str3, list);
        }

        private final native String Swift_abbreviation(long Swift_peer);

        private final native long Swift_constructor_0(String id, String abbreviation, String name, List<UnitGroup> units);

        private final native long Swift_constructor_1(String id, String abbreviation, String name, List<Section> sections);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(Team lhs, Team rhs);

        private final native String Swift_name(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native List<Section> Swift_sections(long Swift_peer);

        private final native List<UnitGroup> Swift_units(long Swift_peer);

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

        public final String getAbbreviation() {
            return Swift_abbreviation(this.Swift_peer);
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
        }

        public final String getName() {
            return Swift_name(this.Swift_peer);
        }

        public final List<Section> getSections() {
            return Swift_sections(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final List<UnitGroup> getUnits() {
            return Swift_units(this.Swift_peer);
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

        public Team(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public Team(String str, String str2, String str3, List<Section> list, Void r7) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            list.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_1(str, str2, str3, list);
        }

        public /* synthetic */ Team(String str, String str2, String str3, List list, Void r11, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, list, (i & 16) != 0 ? null : r11);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001/B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB'\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\n\u0010\u0011J\u0006\u0010\u0016\u001a\u00020\u0017J\u0015\u0010\u0018\u001a\u00020\u00172\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0015\u0010\u001d\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010\u001f\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J+\u0010#\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082 J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\u0019\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0000H\u0082 J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020'0,2\u0006\u0010-\u001a\u00020\u001aH\u0016J\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020'0,2\u0006\u0010-\u001a\u00020\u001aH\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u00060"}, d2 = {"Lcom/polymarket/usviewmodels/FootballPlayerStatsDisplay$UnitGroup;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "sections", "", "Lcom/polymarket/usviewmodels/FootballPlayerStatsDisplay$Section;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getTitle", "Swift_title", "getSections", "()Ljava/util/List;", "Swift_sections", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class UnitGroup implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public UnitGroup(String str, String str2, List<Section> list) {
            ace.B(str, str2, list);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, list);
        }

        private final native long Swift_constructor_0(String id, String title, List<Section> sections);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(UnitGroup lhs, UnitGroup rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native List<Section> Swift_sections(long Swift_peer);

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
            if (!(other instanceof UnitGroup)) {
                return false;
            }
            return Swift_isequal(this, (UnitGroup) other);
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

        public final List<Section> getSections() {
            return Swift_sections(this.Swift_peer);
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

        public UnitGroup(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    public FootballPlayerStatsDisplay(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public FootballPlayerStatsDisplay(List<Section> list, List<Team> list2) {
        list.getClass();
        list2.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(list, list2);
    }

    public FootballPlayerStatsDisplay(ESportPregameDetails eSportPregameDetails, List<ESportStatsSoccerTeam> list) {
        eSportPregameDetails.getClass();
        list.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_2(eSportPregameDetails, list);
    }
}
