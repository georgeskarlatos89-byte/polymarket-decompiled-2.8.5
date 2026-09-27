package com.polymarket.usviewmodels;

import com.fingerprintjs.android.fpjs_pro.g;
import com.polymarket.data.ESportLineupSoccer;
import com.socure.docv.capturesdk.api.Keys;
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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 22\u00020\u00012\u00020\u0002:\u0004/012B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\fB\u001f\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\b\u0010\u0012J\u0006\u0010\u0017\u001a\u00020\u0018J\u0015\u0010\u0019\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0015\u0010\u001d\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010!\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0082 J\u0015\u0010#\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J#\u0010$\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0082 J\u0013\u0010%\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\u0019\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0000H\u0082 J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020'0,2\u0006\u0010-\u001a\u00020\u001bH\u0016J\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020'0,2\u0006\u0010-\u001a\u00020\u001bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u001cR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\"\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001c¨\u00063"}, d2 = {"Lcom/polymarket/usviewmodels/SoccerLineupDisplay;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "lineup", "Lcom/polymarket/data/ESportLineupSoccer;", "(Lcom/polymarket/data/ESportLineupSoccer;)V", "isProjected", "", "teams", "", "Lcom/polymarket/usviewmodels/SoccerLineupDisplay$Team;", "(ZLjava/util/List;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "()Z", "Swift_isProjected", "getTeams", "()Ljava/util/List;", "Swift_teams", "Swift_constructor_0", "isPresentable", "Swift_isPresentable", "Swift_constructor_1", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Side", "Team", "Player", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SoccerLineupDisplay implements SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;

    public SoccerLineupDisplay(ESportLineupSoccer eSportLineupSoccer) {
        eSportLineupSoccer.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(eSportLineupSoccer);
    }

    private final native long Swift_constructor_0(ESportLineupSoccer lineup);

    private final native long Swift_constructor_1(boolean isProjected, List<Team> teams);

    private final native boolean Swift_isPresentable(long Swift_peer);

    private final native boolean Swift_isProjected(long Swift_peer);

    private final native boolean Swift_isequal(SoccerLineupDisplay lhs, SoccerLineupDisplay rhs);

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
        if (!(other instanceof SoccerLineupDisplay)) {
            return false;
        }
        return Swift_isequal(this, (SoccerLineupDisplay) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
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

    public final boolean isProjected() {
        return Swift_isProjected(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0014B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0015"}, d2 = {"Lcom/polymarket/usviewmodels/SoccerLineupDisplay$Side;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "home", "away", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Side implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Side[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final Side home = new Side("home", 0, "home", null, 2, null);
        public static final Side away = new Side("away", 1, "away", null, 2, null);

        private static final /* synthetic */ Side[] $values() {
            return new Side[]{home, away};
        }

        static {
            Side[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ Side(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Side valueOf(String str) {
            return (Side) Enum.valueOf(Side.class, str);
        }

        public static Side[] values() {
            return (Side[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SoccerLineupDisplay$Side$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usviewmodels/SoccerLineupDisplay$Side;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Side init(String rawValue) {
                rawValue.getClass();
                if (Intrinsics.areEqual(rawValue, "home")) {
                    return Side.home;
                }
                if (Intrinsics.areEqual(rawValue, "away")) {
                    return Side.away;
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

        private Side(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082 J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/polymarket/usviewmodels/SoccerLineupDisplay$Companion;", "", "<init>", "()V", "mock", "Lcom/polymarket/usviewmodels/SoccerLineupDisplay;", "isProjected", "", "Swift_Companion_mock_2", "Side", "Lcom/polymarket/usviewmodels/SoccerLineupDisplay$Side;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native SoccerLineupDisplay Swift_Companion_mock_2(boolean isProjected);

        public static /* synthetic */ SoccerLineupDisplay mock$default(Companion companion, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.mock(z);
        }

        public final Side Side(String rawValue) {
            rawValue.getClass();
            return Side.INSTANCE.init(rawValue);
        }

        public final SoccerLineupDisplay mock(boolean isProjected) {
            return Swift_Companion_mock_2(isProjected);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00018B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB?\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u0013J\u0006\u0010\u0018\u001a\u00020\u0019J\u0015\u0010\u001a\u001a\u00020\u00192\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u0010H\u0016J\u0015\u0010\u001e\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010 \u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010\"\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001c\u0010%\u001a\u0004\u0018\u00010\u00102\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 ¢\u0006\u0002\u0010&J\u0017\u0010(\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010*\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 JH\u0010+\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0082 ¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0096\u0002J\u0019\u00101\u001a\u00020.2\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0000H\u0082 J\u0016\u00104\u001a\b\u0012\u0004\u0012\u000200052\u0006\u00106\u001a\u00020\u0010H\u0016J\u0017\u00107\u001a\b\u0012\u0004\u0012\u000200052\u0006\u00106\u001a\u00020\u0010H\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b'\u0010\u001dR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b)\u0010\u001d¨\u00069"}, d2 = {"Lcom/polymarket/usviewmodels/SoccerLineupDisplay$Player;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "shortName", "positionTitle", "order", "", "imageUrl", "darkImageUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "getId", "()Ljava/lang/String;", "Swift_id", "getShortName", "Swift_shortName", "getPositionTitle", "Swift_positionTitle", "getOrder", "()Ljava/lang/Integer;", "Swift_order", "(J)Ljava/lang/Integer;", "getImageUrl", "Swift_imageUrl", "getDarkImageUrl", "Swift_darkImageUrl", "Swift_constructor_0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)J", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Player implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Player(String str, String str2, String str3, Integer num, String str4, String str5) {
            g.x(str, str2, str3);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, str3, num, str4, str5);
        }

        private final native long Swift_constructor_0(String id, String shortName, String positionTitle, Integer order, String imageUrl, String darkImageUrl);

        private final native String Swift_darkImageUrl(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native String Swift_imageUrl(long Swift_peer);

        private final native boolean Swift_isequal(Player lhs, Player rhs);

        private final native Integer Swift_order(long Swift_peer);

        private final native String Swift_positionTitle(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_shortName(long Swift_peer);

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
            if (!(other instanceof Player)) {
                return false;
            }
            return Swift_isequal(this, (Player) other);
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

        public final Integer getOrder() {
            return Swift_order(this.Swift_peer);
        }

        public final String getPositionTitle() {
            return Swift_positionTitle(this.Swift_peer);
        }

        public final String getShortName() {
            return Swift_shortName(this.Swift_peer);
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

        public Player(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00017B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB9\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\n\u0010\u0014J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0015\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0015\u0010 \u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010\"\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010%\u001a\u00020\u000f2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010'\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J=\u0010+\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082 J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\u0019\u00100\u001a\u00020-2\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0000H\u0082 J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020/042\u0006\u00105\u001a\u00020\u001dH\u0016J\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020/042\u0006\u00105\u001a\u00020\u001dH\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b&\u0010\u001fR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u00068"}, d2 = {"Lcom/polymarket/usviewmodels/SoccerLineupDisplay$Team;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, Keys.KEY_NAME, "side", "Lcom/polymarket/usviewmodels/SoccerLineupDisplay$Side;", "formation", "players", "", "Lcom/polymarket/usviewmodels/SoccerLineupDisplay$Player;", "(Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/usviewmodels/SoccerLineupDisplay$Side;Ljava/lang/String;Ljava/util/List;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getName", "Swift_name", "getSide", "()Lcom/polymarket/usviewmodels/SoccerLineupDisplay$Side;", "Swift_side", "getFormation", "Swift_formation", "getPlayers", "()Ljava/util/List;", "Swift_players", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Team implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Team(String str, String str2, Side side, String str3, List<Player> list) {
            str.getClass();
            str2.getClass();
            side.getClass();
            list.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, side, str3, list);
        }

        private final native long Swift_constructor_0(String id, String name, Side side, String formation, List<Player> players);

        private final native String Swift_formation(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(Team lhs, Team rhs);

        private final native String Swift_name(long Swift_peer);

        private final native List<Player> Swift_players(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native Side Swift_side(long Swift_peer);

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

        public final String getFormation() {
            return Swift_formation(this.Swift_peer);
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
        }

        public final String getName() {
            return Swift_name(this.Swift_peer);
        }

        public final List<Player> getPlayers() {
            return Swift_players(this.Swift_peer);
        }

        public final Side getSide() {
            return Swift_side(this.Swift_peer);
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

        public Team(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    public SoccerLineupDisplay(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public SoccerLineupDisplay(boolean z, List<Team> list) {
        list.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(z, list);
    }
}
