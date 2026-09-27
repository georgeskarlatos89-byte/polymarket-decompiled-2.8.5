package com.polymarket.data;

import com.polymarket.data.EEvent;
import defpackage.ug7;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MutableStruct;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u008f\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u008e\u0001\u008f\u0001B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010 \u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010!\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u00020\u0019H\u0082 J\u0015\u0010&\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010'\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u00020\u0019H\u0082 J\u0017\u0010.\u001a\u0004\u0018\u00010(2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010/\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\"\u001a\u0004\u0018\u00010(H\u0082 J\u0017\u00106\u001a\u0004\u0018\u0001002\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u00107\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\"\u001a\u0004\u0018\u000100H\u0082 J\u0017\u0010;\u001a\u0004\u0018\u0001002\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010<\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\"\u001a\u0004\u0018\u000100H\u0082 J\u0017\u0010C\u001a\u0004\u0018\u00010=2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010D\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\"\u001a\u0004\u0018\u00010=H\u0082 J\u001c\u0010J\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010KJ$\u0010L\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010MJ\u001c\u0010Q\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010KJ$\u0010R\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0002\u0010MJ\u0015\u0010U\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010X\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010]\u001a\u0004\u0018\u00010Z2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010`\u001a\u0004\u0018\u0001002\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010c\u001a\u0004\u0018\u0001002\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010h\u001a\u00020e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010k\u001a\u00020e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010n\u001a\u0004\u0018\u00010e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010o\u001a\u0004\u0018\u00010\u00192\b\u0010p\u001a\u0004\u0018\u000100¢\u0006\u0002\u0010qJ&\u0010r\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010s\u001a\u0004\u0018\u000100H\u0082 ¢\u0006\u0002\u0010tJ\u0017\u0010w\u001a\u0004\u0018\u0001002\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010y\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0012\u0010z\u001a\u00020{2\n\b\u0002\u0010|\u001a\u0004\u0018\u00010=J\u001f\u0010}\u001a\u00020{2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010~\u001a\u0004\u0018\u00010=H\u0082 J\u0015\u0010\u007f\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\t\u0010\u0089\u0001\u001a\u00020\u0001H\u0016J\u0019\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170\u008b\u00012\u0007\u0010\u008c\u0001\u001a\u00020\u0019H\u0016J\u001a\u0010\u008d\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170\u008b\u00012\u0007\u0010\u008c\u0001\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010#\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR(\u0010)\u001a\u0004\u0018\u00010(2\b\u0010\u001a\u001a\u0004\u0018\u00010(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R(\u00101\u001a\u0004\u0018\u0001002\b\u0010\u001a\u001a\u0004\u0018\u0001008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R(\u00108\u001a\u0004\u0018\u0001002\b\u0010\u001a\u001a\u0004\u0018\u0001008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u00103\"\u0004\b:\u00105R(\u0010>\u001a\u0004\u0018\u00010=2\b\u0010\u001a\u001a\u0004\u0018\u00010=8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR(\u0010E\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR(\u0010N\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010G\"\u0004\bP\u0010IR\u0011\u0010S\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0011\u0010V\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bW\u0010TR\u0013\u0010Y\u001a\u0004\u0018\u00010Z8F¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0013\u0010^\u001a\u0004\u0018\u0001008F¢\u0006\u0006\u001a\u0004\b_\u00103R\u0013\u0010a\u001a\u0004\u0018\u0001008F¢\u0006\u0006\u001a\u0004\bb\u00103R\u0011\u0010d\u001a\u00020e8F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0011\u0010i\u001a\u00020e8F¢\u0006\u0006\u001a\u0004\bj\u0010gR\u0013\u0010l\u001a\u0004\u0018\u00010e8F¢\u0006\u0006\u001a\u0004\bm\u0010gR\u0013\u0010u\u001a\u0004\u0018\u0001008F¢\u0006\u0006\u001a\u0004\bv\u00103R\u0011\u0010x\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bx\u0010TR.\u0010\u0080\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0081\u0001X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001d\u0010\u0086\u0001\u001a\u00020\u0019X\u0096\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010\u001d\"\u0005\b\u0088\u0001\u0010\u001f¨\u0006\u0090\u0001"}, d2 = {"Lcom/polymarket/data/ETournamentGameUS;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()I", "setId", "(I)V", "Swift_id", "Swift_id_set", "value", "gameIndex", "getGameIndex", "setGameIndex", "Swift_gameIndex", "Swift_gameIndex_set", "Ljava/util/Date;", "startTime", "getStartTime", "()Ljava/util/Date;", "setStartTime", "(Ljava/util/Date;)V", "Swift_startTime", "Swift_startTime_set", "Lcom/polymarket/data/ESportsTeam;", "teamA", "getTeamA", "()Lcom/polymarket/data/ESportsTeam;", "setTeamA", "(Lcom/polymarket/data/ESportsTeam;)V", "Swift_teamA", "Swift_teamA_set", "teamB", "getTeamB", "setTeamB", "Swift_teamB", "Swift_teamB_set", "Lcom/polymarket/data/EEvent;", "event", "getEvent", "()Lcom/polymarket/data/EEvent;", "setEvent", "(Lcom/polymarket/data/EEvent;)V", "Swift_event", "Swift_event_set", "seedA", "getSeedA", "()Ljava/lang/Integer;", "setSeedA", "(Ljava/lang/Integer;)V", "Swift_seedA", "(J)Ljava/lang/Integer;", "Swift_seedA_set", "(JLjava/lang/Integer;)V", "seedB", "getSeedB", "setSeedB", "Swift_seedB", "Swift_seedB_set", "isTBD", "()Z", "Swift_isTBD", "hasEvent", "getHasEvent", "Swift_hasEvent", "sportsGame", "Lcom/polymarket/data/EEvent$SportsGame;", "getSportsGame", "()Lcom/polymarket/data/EEvent$SportsGame;", "Swift_sportsGame", "resolvedTeamA", "getResolvedTeamA", "Swift_resolvedTeamA", "resolvedTeamB", "getResolvedTeamB", "Swift_resolvedTeamB", "formattedAbbreviatedTitle", "", "getFormattedAbbreviatedTitle", "()Ljava/lang/String;", "Swift_formattedAbbreviatedTitle", "formattedUpcomingStart", "getFormattedUpcomingStart", "Swift_formattedUpcomingStart", "kickoffText", "getKickoffText", "Swift_kickoffText", "seed", "for_", "(Lcom/polymarket/data/ESportsTeam;)Ljava/lang/Integer;", "Swift_seed_1", "team", "(JLcom/polymarket/data/ESportsTeam;)Ljava/lang/Integer;", "soleRevealedTeam", "getSoleRevealedTeam", "Swift_soleRevealedTeam", "isFirstRoundBye", "Swift_isFirstRoundBye", "phase", "Lcom/polymarket/data/ETournamentGameUS$Phase;", "using", "Swift_phase_2", "overrideEvent", "Swift_constructor_3", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "setSmutatingcount", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Phase", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ETournamentGameUS implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u0010"}, d2 = {"Lcom/polymarket/data/ETournamentGameUS$Phase;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "tbd", "upcoming", "live", "finished", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Phase implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Phase[] $VALUES;
        public static final Phase tbd = new Phase("tbd", 0);
        public static final Phase upcoming = new Phase("upcoming", 1);
        public static final Phase live = new Phase("live", 2);
        public static final Phase finished = new Phase("finished", 3);

        private static final /* synthetic */ Phase[] $values() {
            return new Phase[]{tbd, upcoming, live, finished};
        }

        static {
            Phase[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Phase(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Phase valueOf(String str) {
            return (Phase) Enum.valueOf(Phase.class, str);
        }

        public static Phase[] values() {
            return (Phase[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    private ETournamentGameUS(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_3(mutableStruct);
    }

    private final native long Swift_constructor_3(MutableStruct copy);

    private final native EEvent Swift_event(long Swift_peer);

    private final native void Swift_event_set(long Swift_peer, EEvent value);

    private final native String Swift_formattedAbbreviatedTitle(long Swift_peer);

    private final native String Swift_formattedUpcomingStart(long Swift_peer);

    private final native int Swift_gameIndex(long Swift_peer);

    private final native void Swift_gameIndex_set(long Swift_peer, int value);

    private final native boolean Swift_hasEvent(long Swift_peer);

    private final native int Swift_id(long Swift_peer);

    private final native void Swift_id_set(long Swift_peer, int value);

    private final native boolean Swift_isFirstRoundBye(long Swift_peer);

    private final native boolean Swift_isTBD(long Swift_peer);

    private final native String Swift_kickoffText(long Swift_peer);

    private final native Phase Swift_phase_2(long Swift_peer, EEvent overrideEvent);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native ESportsTeam Swift_resolvedTeamA(long Swift_peer);

    private final native ESportsTeam Swift_resolvedTeamB(long Swift_peer);

    private final native Integer Swift_seedA(long Swift_peer);

    private final native void Swift_seedA_set(long Swift_peer, Integer value);

    private final native Integer Swift_seedB(long Swift_peer);

    private final native void Swift_seedB_set(long Swift_peer, Integer value);

    private final native Integer Swift_seed_1(long Swift_peer, ESportsTeam team);

    private final native ESportsTeam Swift_soleRevealedTeam(long Swift_peer);

    private final native EEvent.SportsGame Swift_sportsGame(long Swift_peer);

    private final native Date Swift_startTime(long Swift_peer);

    private final native void Swift_startTime_set(long Swift_peer, Date value);

    private final native ESportsTeam Swift_teamA(long Swift_peer);

    private final native void Swift_teamA_set(long Swift_peer, ESportsTeam value);

    private final native ESportsTeam Swift_teamB(long Swift_peer);

    private final native void Swift_teamB_set(long Swift_peer, ESportsTeam value);

    public static /* synthetic */ Phase phase$default(ETournamentGameUS eTournamentGameUS, EEvent eEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            eEvent = null;
        }
        return eTournamentGameUS.phase(eEvent);
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

    @Override // skip.lib.MutableStruct
    public void didmutate() {
        super.didmutate();
    }

    public boolean equals(Object other) {
        if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
            return false;
        }
        return true;
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final EEvent getEvent() {
        return Swift_event(this.Swift_peer);
    }

    public final String getFormattedAbbreviatedTitle() {
        return Swift_formattedAbbreviatedTitle(this.Swift_peer);
    }

    public final String getFormattedUpcomingStart() {
        return Swift_formattedUpcomingStart(this.Swift_peer);
    }

    public final int getGameIndex() {
        return Swift_gameIndex(this.Swift_peer);
    }

    public final boolean getHasEvent() {
        return Swift_hasEvent(this.Swift_peer);
    }

    public final int getId() {
        return Swift_id(this.Swift_peer);
    }

    public final String getKickoffText() {
        return Swift_kickoffText(this.Swift_peer);
    }

    public final ESportsTeam getResolvedTeamA() {
        return Swift_resolvedTeamA(this.Swift_peer);
    }

    public final ESportsTeam getResolvedTeamB() {
        return Swift_resolvedTeamB(this.Swift_peer);
    }

    public final Integer getSeedA() {
        return Swift_seedA(this.Swift_peer);
    }

    public final Integer getSeedB() {
        return Swift_seedB(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    public final ESportsTeam getSoleRevealedTeam() {
        return Swift_soleRevealedTeam(this.Swift_peer);
    }

    public final EEvent.SportsGame getSportsGame() {
        return Swift_sportsGame(this.Swift_peer);
    }

    public final Date getStartTime() {
        return Swift_startTime(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final ESportsTeam getTeamA() {
        return Swift_teamA(this.Swift_peer);
    }

    public final ESportsTeam getTeamB() {
        return Swift_teamB(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isFirstRoundBye() {
        return Swift_isFirstRoundBye(this.Swift_peer);
    }

    public final boolean isTBD() {
        return Swift_isTBD(this.Swift_peer);
    }

    public final Phase phase(EEvent using) {
        return Swift_phase_2(this.Swift_peer, using);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new ETournamentGameUS(this);
    }

    public final Integer seed(ESportsTeam for_) {
        return Swift_seed_1(this.Swift_peer, for_);
    }

    public final void setEvent(EEvent eEvent) {
        EEvent eEvent2 = (EEvent) StructKt.sref$default(eEvent, null, 1, null);
        willmutate();
        try {
            Swift_event_set(this.Swift_peer, eEvent2);
        } finally {
            didmutate();
        }
    }

    public final void setGameIndex(int i) {
        willmutate();
        try {
            Swift_gameIndex_set(this.Swift_peer, i);
        } finally {
            didmutate();
        }
    }

    public final void setId(int i) {
        willmutate();
        try {
            Swift_id_set(this.Swift_peer, i);
        } finally {
            didmutate();
        }
    }

    public final void setSeedA(Integer num) {
        willmutate();
        try {
            Swift_seedA_set(this.Swift_peer, num);
        } finally {
            didmutate();
        }
    }

    public final void setSeedB(Integer num) {
        willmutate();
        try {
            Swift_seedB_set(this.Swift_peer, num);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    public final void setStartTime(Date date) {
        Date date2 = (Date) StructKt.sref$default(date, null, 1, null);
        willmutate();
        try {
            Swift_startTime_set(this.Swift_peer, date2);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSupdate(Function1<Object, Unit> function1) {
        this.supdate = function1;
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public final void setTeamA(ESportsTeam eSportsTeam) {
        ESportsTeam eSportsTeam2 = (ESportsTeam) StructKt.sref$default(eSportsTeam, null, 1, null);
        willmutate();
        try {
            Swift_teamA_set(this.Swift_peer, eSportsTeam2);
        } finally {
            didmutate();
        }
    }

    public final void setTeamB(ESportsTeam eSportsTeam) {
        ESportsTeam eSportsTeam2 = (ESportsTeam) StructKt.sref$default(eSportsTeam, null, 1, null);
        willmutate();
        try {
            Swift_teamB_set(this.Swift_peer, eSportsTeam2);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0015\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0082 ¨\u0006\t"}, d2 = {"Lcom/polymarket/data/ETournamentGameUS$Companion;", "", "<init>", "()V", "kickoffText", "", "startTime", "Ljava/util/Date;", "Swift_Companion_kickoffText_0", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native String Swift_Companion_kickoffText_0(Date startTime);

        public final String kickoffText(Date startTime) {
            return Swift_Companion_kickoffText_0(startTime);
        }

        private Companion() {
        }
    }

    public ETournamentGameUS(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
