package com.polymarket.usviewmodels;

import com.polymarket.data.EEventState;
import com.polymarket.data.ESportStatsSoccerTeam;
import com.polymarket.data.ESportTimelineFootball;
import com.polymarket.usviewmodels.SoccerTimelineDisplay;
import defpackage.ace;
import defpackage.ug7;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Identifiable;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0004=>?@B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\b\u0010\u0011J\u0006\u0010\u0016\u001a\u00020\u0017J\u0015\u0010\u0018\u001a\u00020\u00172\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u001b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020%0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010/\u001a\u00020,2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J-\u00100\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0082 J\u0015\u00102\u001a\u00020,2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0013\u00103\u001a\u00020,2\b\u00104\u001a\u0004\u0018\u000105H\u0096\u0002J\u0019\u00106\u001a\u00020,2\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u0000H\u0082 J\u0016\u00109\u001a\b\u0012\u0004\u0012\u0002050:2\u0006\u0010;\u001a\u00020\u001aH\u0016J\u0017\u0010<\u001a\b\u0012\u0004\u0012\u0002050:2\u0006\u0010;\u001a\u00020\u001aH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\r8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\r8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001eR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\r8F¢\u0006\u0006\u001a\u0004\b&\u0010\u001eR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020%0\r8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001eR\u0011\u0010+\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u00101\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b1\u0010.¨\u0006A"}, d2 = {"Lcom/polymarket/usviewmodels/FootballTimelineDisplay;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "timeline", "Lcom/polymarket/data/ESportTimelineFootball;", "eventTeams", "", "Lcom/polymarket/data/ESportStatsSoccerTeam;", "eventState", "Lcom/polymarket/data/EEventState;", "(Lcom/polymarket/data/ESportTimelineFootball;Ljava/util/List;Lcom/polymarket/data/EEventState;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "teams", "Lcom/polymarket/usviewmodels/SoccerTimelineDisplay$Team;", "getTeams", "()Ljava/util/List;", "Swift_teams", RadarTrackingOptions.RadarTrackingOptionsSync.EVENTS_STR, "Lcom/polymarket/usviewmodels/SoccerTimelineDisplay$Event;", "getEvents", "Swift_events", "driveRows", "Lcom/polymarket/usviewmodels/FootballTimelineDisplay$Row;", "getDriveRows", "Swift_driveRows", "scoringRows", "getScoringRows", "Swift_scoringRows", "hasDrives", "", "getHasDrives", "()Z", "Swift_hasDrives", "Swift_constructor_0", "isPresentable", "Swift_isPresentable", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Row", "Drive", "Marker", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FootballTimelineDisplay implements SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;

    public FootballTimelineDisplay(ESportTimelineFootball eSportTimelineFootball, List<ESportStatsSoccerTeam> list, EEventState eEventState) {
        eSportTimelineFootball.getClass();
        list.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(eSportTimelineFootball, list, eEventState);
    }

    private final native long Swift_constructor_0(ESportTimelineFootball timeline, List<ESportStatsSoccerTeam> eventTeams, EEventState eventState);

    private final native List<Row> Swift_driveRows(long Swift_peer);

    private final native List<SoccerTimelineDisplay.Event> Swift_events(long Swift_peer);

    private final native boolean Swift_hasDrives(long Swift_peer);

    private final native boolean Swift_isPresentable(long Swift_peer);

    private final native boolean Swift_isequal(FootballTimelineDisplay lhs, FootballTimelineDisplay rhs);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native List<Row> Swift_scoringRows(long Swift_peer);

    private final native List<SoccerTimelineDisplay.Team> Swift_teams(long Swift_peer);

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
        if (!(other instanceof FootballTimelineDisplay)) {
            return false;
        }
        return Swift_isequal(this, (FootballTimelineDisplay) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final List<Row> getDriveRows() {
        return Swift_driveRows(this.Swift_peer);
    }

    public final List<SoccerTimelineDisplay.Event> getEvents() {
        return Swift_events(this.Swift_peer);
    }

    public final boolean getHasDrives() {
        return Swift_hasDrives(this.Swift_peer);
    }

    public final List<Row> getScoringRows() {
        return Swift_scoringRows(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final List<SoccerTimelineDisplay.Team> getTeams() {
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
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u000212B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB-\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u0011J\u0006\u0010\u0016\u001a\u00020\u0017J\u0015\u0010\u0018\u001a\u00020\u00172\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0015\u0010\u001d\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010 \u001a\u00020\u000e2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010\"\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010$\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J/\u0010%\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0082 J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0002J\u0019\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0000H\u0082 J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020)0.2\u0006\u0010/\u001a\u00020\u001aH\u0016J\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020)0.2\u0006\u0010/\u001a\u00020\u001aH\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\u001cR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010\u001c¨\u00063"}, d2 = {"Lcom/polymarket/usviewmodels/FootballTimelineDisplay$Marker;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "style", "Lcom/polymarket/usviewmodels/FootballTimelineDisplay$Marker$Style;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "clockLabel", "(Ljava/lang/String;Lcom/polymarket/usviewmodels/FootballTimelineDisplay$Marker$Style;Ljava/lang/String;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getStyle", "()Lcom/polymarket/usviewmodels/FootballTimelineDisplay$Marker$Style;", "Swift_style", "getTitle", "Swift_title", "getClockLabel", "Swift_clockLabel", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Style", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Marker implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private long Swift_peer;

        public Marker(String str, Style style, String str2, String str3) {
            str.getClass();
            style.getClass();
            str2.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, style, str2, str3);
        }

        private final native String Swift_clockLabel(long Swift_peer);

        private final native long Swift_constructor_0(String id, Style style, String title, String clockLabel);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(Marker lhs, Marker rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native Style Swift_style(long Swift_peer);

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
            if (!(other instanceof Marker)) {
                return false;
            }
            return Swift_isequal(this, (Marker) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getClockLabel() {
            return Swift_clockLabel(this.Swift_peer);
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
        }

        public final Style getStyle() {
            return Swift_style(this.Swift_peer);
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

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0014B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0015"}, d2 = {"Lcom/polymarket/usviewmodels/FootballTimelineDisplay$Marker$Style;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "line", "pill", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Style implements RawRepresentable<String>, SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ Style[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Style line = new Style("line", 0, "line", null, 2, null);
            public static final Style pill = new Style("pill", 1, "pill", null, 2, null);
            private final String rawValue;

            private static final /* synthetic */ Style[] $values() {
                return new Style[]{line, pill};
            }

            static {
                Style[] $values = $values();
                $VALUES = $values;
                $ENTRIES = ww4.b($values);
                INSTANCE = new Companion(null);
            }

            public /* synthetic */ Style(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, str2, (i2 & 2) != 0 ? null : r4);
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static ug7 getEntries() {
                return $ENTRIES;
            }

            public static Style valueOf(String str) {
                return (Style) Enum.valueOf(Style.class, str);
            }

            public static Style[] values() {
                return (Style[]) $VALUES.clone();
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
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/FootballTimelineDisplay$Marker$Style$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usviewmodels/FootballTimelineDisplay$Marker$Style;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Style init(String rawValue) {
                    rawValue.getClass();
                    if (Intrinsics.areEqual(rawValue, "line")) {
                        return Style.line;
                    }
                    if (Intrinsics.areEqual(rawValue, "pill")) {
                        return Style.pill;
                    }
                    return null;
                }

                private Companion() {
                }
            }

            @Override // skip.lib.RawRepresentable
            public String getRawValue() {
                return this.rawValue;
            }

            private Style(String str, int i, String str2, Void r4) {
                this.rawValue = str2;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/FootballTimelineDisplay$Marker$Companion;", "", "<init>", "()V", "Style", "Lcom/polymarket/usviewmodels/FootballTimelineDisplay$Marker$Style;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Style Style(String rawValue) {
                rawValue.getClass();
                return Style.INSTANCE.init(rawValue);
            }

            private Companion() {
            }
        }

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ String getId() {
            return getId2();
        }

        public Marker(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ Marker(String str, Style style, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, style, str2, (i & 8) != 0 ? null : str3);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\t\u0010\u0006\u001a\u00020\u0005H\u0082 ¨\u0006\u0007"}, d2 = {"Lcom/polymarket/usviewmodels/FootballTimelineDisplay$Companion;", "", "<init>", "()V", "mock", "Lcom/polymarket/usviewmodels/FootballTimelineDisplay;", "Swift_Companion_mock_1", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native FootballTimelineDisplay Swift_Companion_mock_1();

        public final FootballTimelineDisplay mock() {
            return Swift_Companion_mock_1();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001AB\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bBm\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\n\u0010\u0018J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0015\u0010\u001f\u001a\u00020\u001e2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010 \u001a\u00020!H\u0016J\u0015\u0010$\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010&\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010(\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010*\u001a\u00020\u00102\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010,\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010.\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u00100\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u00102\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001b\u00105\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 Je\u00106\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0082 J\u0013\u00107\u001a\u00020\u00102\b\u00108\u001a\u0004\u0018\u000109H\u0096\u0002J\u0019\u0010:\u001a\u00020\u00102\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u0000H\u0082 J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u0002090>2\u0006\u0010?\u001a\u00020!H\u0016J\u0017\u0010@\u001a\b\u0012\u0004\u0012\u0002090>2\u0006\u0010?\u001a\u00020!H\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b'\u0010#R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u000f\u0010)R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b+\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b-\u0010#R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b/\u0010#R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b1\u0010#R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u0006B"}, d2 = {"Lcom/polymarket/usviewmodels/FootballTimelineDisplay$Drive;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "scoreLabel", "isLive", "", "subtitle", "helmetIcon", "helmetIconDark", "teamId", "rows", "", "Lcom/polymarket/usviewmodels/FootballTimelineDisplay$Row;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getTitle", "Swift_title", "getScoreLabel", "Swift_scoreLabel", "()Z", "Swift_isLive", "getSubtitle", "Swift_subtitle", "getHelmetIcon", "Swift_helmetIcon", "getHelmetIconDark", "Swift_helmetIconDark", "getTeamId", "Swift_teamId", "getRows", "()Ljava/util/List;", "Swift_rows", "Swift_constructor_0", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Drive implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Drive(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, list);
        }

        private final native long Swift_constructor_0(String id, String title, String scoreLabel, boolean isLive, String subtitle, String helmetIcon, String helmetIconDark, String teamId, List<Row> rows);

        private final native String Swift_helmetIcon(long Swift_peer);

        private final native String Swift_helmetIconDark(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isLive(long Swift_peer);

        private final native boolean Swift_isequal(Drive lhs, Drive rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native List<Row> Swift_rows(long Swift_peer);

        private final native String Swift_scoreLabel(long Swift_peer);

        private final native String Swift_subtitle(long Swift_peer);

        private final native String Swift_teamId(long Swift_peer);

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
            if (!(other instanceof Drive)) {
                return false;
            }
            return Swift_isequal(this, (Drive) other);
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

        public final List<Row> getRows() {
            return Swift_rows(this.Swift_peer);
        }

        public final String getScoreLabel() {
            return Swift_scoreLabel(this.Swift_peer);
        }

        public final String getSubtitle() {
            return Swift_subtitle(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getTeamId() {
            return Swift_teamId(this.Swift_peer);
        }

        public final String getTitle() {
            return Swift_title(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final boolean isLive() {
            return Swift_isLive(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ String getId() {
            return getId2();
        }

        public Drive(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public Drive(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, List<Row> list) {
            ace.B(str, str2, list);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, str3, z, str4, str5, str6, str7, list);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00014B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB5\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\n\u0010\u0012J\u0006\u0010\u0017\u001a\u00020\u0018J\u0015\u0010\u0019\u001a\u00020\u00182\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0015\u0010\u001e\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010!\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010$\u001a\u0004\u0018\u00010\u00102\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010'\u001a\u0004\u0018\u00010\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J3\u0010(\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u0011H\u0082 J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0096\u0002J\u0019\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0000H\u0082 J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020,012\u0006\u00102\u001a\u00020\u001bH\u0016J\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020,012\u0006\u00102\u001a\u00020\u001bH\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u00065"}, d2 = {"Lcom/polymarket/usviewmodels/FootballTimelineDisplay$Row;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "drive", "Lcom/polymarket/usviewmodels/FootballTimelineDisplay$Drive;", "play", "Lcom/polymarket/usviewmodels/SoccerTimelineDisplay$Event;", "Lcom/polymarket/usviewmodels/FootballTimelineDisplay$Marker;", "(Ljava/lang/String;Lcom/polymarket/usviewmodels/FootballTimelineDisplay$Drive;Lcom/polymarket/usviewmodels/SoccerTimelineDisplay$Event;Lcom/polymarket/usviewmodels/FootballTimelineDisplay$Marker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getDrive", "()Lcom/polymarket/usviewmodels/FootballTimelineDisplay$Drive;", "Swift_drive", "getPlay", "()Lcom/polymarket/usviewmodels/SoccerTimelineDisplay$Event;", "Swift_play", "getMarker", "()Lcom/polymarket/usviewmodels/FootballTimelineDisplay$Marker;", "Swift_marker", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Row implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Row(String str, Drive drive, SoccerTimelineDisplay.Event event, Marker marker, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : drive, (i & 4) != 0 ? null : event, (i & 8) != 0 ? null : marker);
        }

        private final native long Swift_constructor_0(String id, Drive drive, SoccerTimelineDisplay.Event play, Marker marker);

        private final native Drive Swift_drive(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(Row lhs, Row rhs);

        private final native Marker Swift_marker(long Swift_peer);

        private final native SoccerTimelineDisplay.Event Swift_play(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

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
            if (!(other instanceof Row)) {
                return false;
            }
            return Swift_isequal(this, (Row) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final Drive getDrive() {
            return Swift_drive(this.Swift_peer);
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
        }

        public final Marker getMarker() {
            return Swift_marker(this.Swift_peer);
        }

        public final SoccerTimelineDisplay.Event getPlay() {
            return Swift_play(this.Swift_peer);
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

        public Row(String str, Drive drive, SoccerTimelineDisplay.Event event, Marker marker) {
            str.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, drive, event, marker);
        }

        public Row(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    public FootballTimelineDisplay(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ FootballTimelineDisplay(ESportTimelineFootball eSportTimelineFootball, List list, EEventState eEventState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eSportTimelineFootball, list, (i & 4) != 0 ? null : eEventState);
    }
}
