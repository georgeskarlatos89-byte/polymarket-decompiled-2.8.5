package com.polymarket.usviewmodels;

import com.polymarket.data.ESportStatsSoccer;
import com.polymarket.designtokens.DesignTokens;
import defpackage.ug7;
import defpackage.woa;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Identifiable;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u00039:;B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB%\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fB5\b\u0016\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u0015J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0015\u0010\u001c\u001a\u00020\u001b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010&\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010(\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J)\u0010)\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082 J\u0015\u0010-\u001a\u00020+2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J9\u0010.\u001a\u00060\u0004j\u0002`\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0082 J\u0013\u0010/\u001a\u00020+2\b\u00100\u001a\u0004\u0018\u000101H\u0096\u0002J\u0019\u00102\u001a\u00020+2\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0000H\u0082 J\u0016\u00105\u001a\b\u0012\u0004\u0012\u000201062\u0006\u00107\u001a\u00020\u001eH\u0016J\u0017\u00108\u001a\b\u0012\u0004\u0012\u000201062\u0006\u00107\u001a\u00020\u001eH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00118F¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0011\u0010*\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b*\u0010,¨\u0006<"}, d2 = {"Lcom/polymarket/usviewmodels/SoccerStatsDisplay;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "stats", "Lcom/polymarket/data/ESportStatsSoccer;", "homeColor", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "awayColor", "(Lcom/polymarket/data/ESportStatsSoccer;Lcom/polymarket/designtokens/DesignTokens$SemanticColor;Lcom/polymarket/designtokens/DesignTokens$SemanticColor;)V", "summaries", "", "Lcom/polymarket/usviewmodels/SoccerStatsDisplay$Summary;", "metrics", "Lcom/polymarket/usviewmodels/SoccerStatsDisplay$Metric;", "(Ljava/util/List;Ljava/util/List;Lcom/polymarket/designtokens/DesignTokens$SemanticColor;Lcom/polymarket/designtokens/DesignTokens$SemanticColor;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getSummaries", "()Ljava/util/List;", "Swift_summaries", "getMetrics", "Swift_metrics", "getHomeColor", "()Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "Swift_homeColor", "getAwayColor", "Swift_awayColor", "Swift_constructor_0", "isPresentable", "", "()Z", "Swift_isPresentable", "Swift_constructor_1", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Summary", "Metric", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SoccerStatsDisplay implements SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;

    public SoccerStatsDisplay(List<Summary> list, List<Metric> list2, DesignTokens.SemanticColor semanticColor, DesignTokens.SemanticColor semanticColor2) {
        list.getClass();
        list2.getClass();
        semanticColor.getClass();
        semanticColor2.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(list, list2, semanticColor, semanticColor2);
    }

    private final native DesignTokens.SemanticColor Swift_awayColor(long Swift_peer);

    private final native long Swift_constructor_0(ESportStatsSoccer stats, DesignTokens.SemanticColor homeColor, DesignTokens.SemanticColor awayColor);

    private final native long Swift_constructor_1(List<Summary> summaries, List<Metric> metrics, DesignTokens.SemanticColor homeColor, DesignTokens.SemanticColor awayColor);

    private final native DesignTokens.SemanticColor Swift_homeColor(long Swift_peer);

    private final native boolean Swift_isPresentable(long Swift_peer);

    private final native boolean Swift_isequal(SoccerStatsDisplay lhs, SoccerStatsDisplay rhs);

    private final native List<Metric> Swift_metrics(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native List<Summary> Swift_summaries(long Swift_peer);

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
        if (!(other instanceof SoccerStatsDisplay)) {
            return false;
        }
        return Swift_isequal(this, (SoccerStatsDisplay) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final DesignTokens.SemanticColor getAwayColor() {
        return Swift_awayColor(this.Swift_peer);
    }

    public final DesignTokens.SemanticColor getHomeColor() {
        return Swift_homeColor(this.Swift_peer);
    }

    public final List<Metric> getMetrics() {
        return Swift_metrics(this.Swift_peer);
    }

    public final List<Summary> getSummaries() {
        return Swift_summaries(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
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
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u000212B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB)\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0011J\u0006\u0010\u0016\u001a\u00020\u0017J\u0015\u0010\u0018\u001a\u00020\u00172\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0015\u0010\u001d\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010 \u001a\u00020\u000e2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010\"\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010$\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J-\u0010%\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0082 J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0002J\u0019\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0000H\u0082 J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020)0.2\u0006\u0010/\u001a\u00020\u001aH\u0016J\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020)0.2\u0006\u0010/\u001a\u00020\u001aH\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010\u001c¨\u00063"}, d2 = {"Lcom/polymarket/usviewmodels/SoccerStatsDisplay$Summary;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "kind", "Lcom/polymarket/usviewmodels/SoccerStatsDisplay$Summary$Kind;", "homeValueText", "awayValueText", "(Ljava/lang/String;Lcom/polymarket/usviewmodels/SoccerStatsDisplay$Summary$Kind;Ljava/lang/String;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getKind", "()Lcom/polymarket/usviewmodels/SoccerStatsDisplay$Summary$Kind;", "Swift_kind", "getHomeValueText", "Swift_homeValueText", "getAwayValueText", "Swift_awayValueText", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Kind", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Summary implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private long Swift_peer;

        public Summary(String str, Kind kind, String str2, String str3) {
            str.getClass();
            kind.getClass();
            str2.getClass();
            str3.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, kind, str2, str3);
        }

        private final native String Swift_awayValueText(long Swift_peer);

        private final native long Swift_constructor_0(String id, Kind kind, String homeValueText, String awayValueText);

        private final native String Swift_homeValueText(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(Summary lhs, Summary rhs);

        private final native Kind Swift_kind(long Swift_peer);

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
            if (!(other instanceof Summary)) {
                return false;
            }
            return Swift_isequal(this, (Summary) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getAwayValueText() {
            return Swift_awayValueText(this.Swift_peer);
        }

        public final String getHomeValueText() {
            return Swift_homeValueText(this.Swift_peer);
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
        }

        public final Kind getKind() {
            return Swift_kind(this.Swift_peer);
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

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0015B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0016"}, d2 = {"Lcom/polymarket/usviewmodels/SoccerStatsDisplay$Summary$Kind;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "yellowCards", "redCards", "corners", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Kind implements RawRepresentable<String>, SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ Kind[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final String rawValue;
            public static final Kind yellowCards = new Kind("yellowCards", 0, "yellowCards", null, 2, null);
            public static final Kind redCards = new Kind("redCards", 1, "redCards", null, 2, null);
            public static final Kind corners = new Kind("corners", 2, "corners", null, 2, null);

            private static final /* synthetic */ Kind[] $values() {
                return new Kind[]{yellowCards, redCards, corners};
            }

            static {
                Kind[] $values = $values();
                $VALUES = $values;
                $ENTRIES = ww4.b($values);
                INSTANCE = new Companion(null);
            }

            public /* synthetic */ Kind(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, str2, (i2 & 2) != 0 ? null : r4);
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static ug7 getEntries() {
                return $ENTRIES;
            }

            public static Kind valueOf(String str) {
                return (Kind) Enum.valueOf(Kind.class, str);
            }

            public static Kind[] values() {
                return (Kind[]) $VALUES.clone();
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
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SoccerStatsDisplay$Summary$Kind$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usviewmodels/SoccerStatsDisplay$Summary$Kind;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Kind init(String rawValue) {
                    rawValue.getClass();
                    int hashCode = rawValue.hashCode();
                    if (hashCode != -811732654) {
                        if (hashCode != -541967537) {
                            if (hashCode == 955046078 && rawValue.equals("corners")) {
                                return Kind.corners;
                            }
                            return null;
                        }
                        if (rawValue.equals("yellowCards")) {
                            return Kind.yellowCards;
                        }
                        return null;
                    }
                    if (!rawValue.equals("redCards")) {
                        return null;
                    }
                    return Kind.redCards;
                }

                private Companion() {
                }
            }

            @Override // skip.lib.RawRepresentable
            public String getRawValue() {
                return this.rawValue;
            }

            private Kind(String str, int i, String str2, Void r4) {
                this.rawValue = str2;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SoccerStatsDisplay$Summary$Companion;", "", "<init>", "()V", "Kind", "Lcom/polymarket/usviewmodels/SoccerStatsDisplay$Summary$Kind;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Kind Kind(String rawValue) {
                rawValue.getClass();
                return Kind.INSTANCE.init(rawValue);
            }

            private Companion() {
            }
        }

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ String getId() {
            return getId2();
        }

        public Summary(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\t\u0010\u0006\u001a\u00020\u0005H\u0082 ¨\u0006\u0007"}, d2 = {"Lcom/polymarket/usviewmodels/SoccerStatsDisplay$Companion;", "", "<init>", "()V", "mock", "Lcom/polymarket/usviewmodels/SoccerStatsDisplay;", "Swift_Companion_mock_2", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native SoccerStatsDisplay Swift_Companion_mock_2();

        public final SoccerStatsDisplay mock() {
            return Swift_Companion_mock_2();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00017B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB9\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\n\u0010\u0013J\u0006\u0010\u0018\u001a\u00020\u0019J\u0015\u0010\u001a\u001a\u00020\u00192\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0015\u0010\u001f\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010!\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010#\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010%\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010(\u001a\u00020\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010*\u001a\u00020\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J=\u0010+\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0082 J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\u0019\u00100\u001a\u00020-2\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0000H\u0082 J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020/042\u0006\u00105\u001a\u00020\u001cH\u0016J\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020/042\u0006\u00105\u001a\u00020\u001cH\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b$\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b)\u0010'¨\u00068"}, d2 = {"Lcom/polymarket/usviewmodels/SoccerStatsDisplay$Metric;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "homeValueText", "awayValueText", "homeRatio", "", "awayRatio", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getTitle", "Swift_title", "getHomeValueText", "Swift_homeValueText", "getAwayValueText", "Swift_awayValueText", "getHomeRatio", "()D", "Swift_homeRatio", "getAwayRatio", "Swift_awayRatio", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Metric implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Metric(String str, String str2, String str3, String str4, double d, double d2) {
            woa.A(str, str2, str3, str4);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, str3, str4, d, d2);
        }

        private final native double Swift_awayRatio(long Swift_peer);

        private final native String Swift_awayValueText(long Swift_peer);

        private final native long Swift_constructor_0(String id, String title, String homeValueText, String awayValueText, double homeRatio, double awayRatio);

        private final native double Swift_homeRatio(long Swift_peer);

        private final native String Swift_homeValueText(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(Metric lhs, Metric rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

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
            if (!(other instanceof Metric)) {
                return false;
            }
            return Swift_isequal(this, (Metric) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final double getAwayRatio() {
            return Swift_awayRatio(this.Swift_peer);
        }

        public final String getAwayValueText() {
            return Swift_awayValueText(this.Swift_peer);
        }

        public final double getHomeRatio() {
            return Swift_homeRatio(this.Swift_peer);
        }

        public final String getHomeValueText() {
            return Swift_homeValueText(this.Swift_peer);
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
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

        public Metric(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    public SoccerStatsDisplay(ESportStatsSoccer eSportStatsSoccer, DesignTokens.SemanticColor semanticColor, DesignTokens.SemanticColor semanticColor2) {
        eSportStatsSoccer.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(eSportStatsSoccer, semanticColor, semanticColor2);
    }

    public SoccerStatsDisplay(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
