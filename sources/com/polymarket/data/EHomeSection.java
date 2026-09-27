package com.polymarket.data;

import defpackage.ug7;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0002FGB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0015\u0010\u001b\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010 \u001a\u00020\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010#\u001a\u0004\u0018\u00010\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010'\u001a\u00020\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u00101\u001a\b\u0012\u0004\u0012\u00020/0)2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00104\u001a\u0004\u0018\u00010\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u00108\u001a\u0004\u0018\u00010\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u00109J\u0017\u0010=\u001a\u0004\u0018\u00010/2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010A\u001a\b\u0012\u0004\u0012\u00020?0)2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00140C2\u0006\u0010D\u001a\u00020\u0016H\u0016J\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00140C2\u0006\u0010D\u001a\u00020\u0016H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010!\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001aR\u0011\u0010$\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020/0)8F¢\u0006\u0006\u001a\u0004\b0\u0010,R\u0013\u00102\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b3\u0010\u001aR\u0013\u00105\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0013\u0010:\u001a\u0004\u0018\u00010/8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020?0)8F¢\u0006\u0006\u001a\u0004\b@\u0010,¨\u0006H"}, d2 = {"Lcom/polymarket/data/EHomeSection;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "getId", "()Ljava/lang/String;", "Swift_id", "type", "Lcom/polymarket/data/EHomeSection$SectionType;", "getType", "()Lcom/polymarket/data/EHomeSection$SectionType;", "Swift_type", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "Swift_title", "priority", "getPriority", "()I", "Swift_priority", RadarTrackingOptions.RadarTrackingOptionsSync.EVENTS_STR, "", "Lcom/polymarket/data/EEvent;", "getEvents", "()Ljava/util/List;", "Swift_events", "categories", "Lcom/polymarket/data/APIEventTag;", "getCategories", "Swift_categories", "categorySlug", "getCategorySlug", "Swift_categorySlug", "tournamentId", "getTournamentId", "()Ljava/lang/Integer;", "Swift_tournamentId", "(J)Ljava/lang/Integer;", "tag", "getTag", "()Lcom/polymarket/data/APIEventTag;", "Swift_tag", "hubs", "Lcom/polymarket/data/EHub;", "getHubs", "Swift_hubs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "SectionType", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EHomeSection implements SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;

    public EHomeSection(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private final native List<APIEventTag> Swift_categories(long Swift_peer);

    private final native String Swift_categorySlug(long Swift_peer);

    private final native List<EEvent> Swift_events(long Swift_peer);

    private final native List<EHub> Swift_hubs(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native int Swift_priority(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native APIEventTag Swift_tag(long Swift_peer);

    private final native String Swift_title(long Swift_peer);

    private final native Integer Swift_tournamentId(long Swift_peer);

    private final native SectionType Swift_type(long Swift_peer);

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
        if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
            return false;
        }
        return true;
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final List<APIEventTag> getCategories() {
        return Swift_categories(this.Swift_peer);
    }

    public final String getCategorySlug() {
        return Swift_categorySlug(this.Swift_peer);
    }

    public final List<EEvent> getEvents() {
        return Swift_events(this.Swift_peer);
    }

    public final List<EHub> getHubs() {
        return Swift_hubs(this.Swift_peer);
    }

    public final String getId() {
        return Swift_id(this.Swift_peer);
    }

    public final int getPriority() {
        return Swift_priority(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final APIEventTag getTag() {
        return Swift_tag(this.Swift_peer);
    }

    public final String getTitle() {
        return Swift_title(this.Swift_peer);
    }

    public final Integer getTournamentId() {
        return Swift_tournamentId(this.Swift_peer);
    }

    public final SectionType getType() {
        return Swift_type(this.Swift_peer);
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
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001!B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\""}, d2 = {"Lcom/polymarket/data/EHomeSection$SectionType;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "featured", "trending", "trendingTickets", "positions", "categories", "tag", "live", "sport", "tournamentCallout", "hubCallout", "marketingCarousel", "portfolio", "onboarding", "recent", "unknown", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SectionType implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ SectionType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final SectionType featured = new SectionType("featured", 0, "featured", null, 2, null);
        public static final SectionType trending = new SectionType("trending", 1, "trending", null, 2, null);
        public static final SectionType trendingTickets = new SectionType("trendingTickets", 2, "trending-tickets", null, 2, null);
        public static final SectionType positions = new SectionType("positions", 3, "positions", null, 2, null);
        public static final SectionType categories = new SectionType("categories", 4, "categories", null, 2, null);
        public static final SectionType tag = new SectionType("tag", 5, "tag", null, 2, null);
        public static final SectionType live = new SectionType("live", 6, "live", null, 2, null);
        public static final SectionType sport = new SectionType("sport", 7, "sport", null, 2, null);
        public static final SectionType tournamentCallout = new SectionType("tournamentCallout", 8, "tournament-callout", null, 2, null);
        public static final SectionType hubCallout = new SectionType("hubCallout", 9, "hub-callout", null, 2, null);
        public static final SectionType marketingCarousel = new SectionType("marketingCarousel", 10, "marketing-carousel", null, 2, null);
        public static final SectionType portfolio = new SectionType("portfolio", 11, "portfolio", null, 2, null);
        public static final SectionType onboarding = new SectionType("onboarding", 12, "onboarding", null, 2, null);
        public static final SectionType recent = new SectionType("recent", 13, "recently_viewed", null, 2, null);
        public static final SectionType unknown = new SectionType("unknown", 14, "unknown", null, 2, null);

        private static final /* synthetic */ SectionType[] $values() {
            return new SectionType[]{featured, trending, trendingTickets, positions, categories, tag, live, sport, tournamentCallout, hubCallout, marketingCarousel, portfolio, onboarding, recent, unknown};
        }

        static {
            SectionType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ SectionType(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static SectionType valueOf(String str) {
            return (SectionType) Enum.valueOf(SectionType.class, str);
        }

        public static SectionType[] values() {
            return (SectionType[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EHomeSection$SectionType$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EHomeSection$SectionType;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SectionType init(String rawValue) {
                rawValue.getClass();
                switch (rawValue.hashCode()) {
                    case -290659282:
                        if (!rawValue.equals("featured")) {
                            return null;
                        }
                        return SectionType.featured;
                    case -284840886:
                        if (rawValue.equals("unknown")) {
                            return SectionType.unknown;
                        }
                        return null;
                    case -270129881:
                        if (rawValue.equals("marketing-carousel")) {
                            return SectionType.marketingCarousel;
                        }
                        return null;
                    case 114586:
                        if (rawValue.equals("tag")) {
                            return SectionType.tag;
                        }
                        return null;
                    case 3322092:
                        if (rawValue.equals("live")) {
                            return SectionType.live;
                        }
                        return null;
                    case 21116443:
                        if (rawValue.equals("onboarding")) {
                            return SectionType.onboarding;
                        }
                        return null;
                    case 109651828:
                        if (rawValue.equals("sport")) {
                            return SectionType.sport;
                        }
                        return null;
                    case 583726156:
                        if (rawValue.equals("tournament-callout")) {
                            return SectionType.tournamentCallout;
                        }
                        return null;
                    case 680782075:
                        if (rawValue.equals("recently_viewed")) {
                            return SectionType.recent;
                        }
                        return null;
                    case 1121781064:
                        if (rawValue.equals("portfolio")) {
                            return SectionType.portfolio;
                        }
                        return null;
                    case 1207198552:
                        if (rawValue.equals("hub-callout")) {
                            return SectionType.hubCallout;
                        }
                        return null;
                    case 1296516636:
                        if (rawValue.equals("categories")) {
                            return SectionType.categories;
                        }
                        return null;
                    case 1394955557:
                        if (rawValue.equals("trending")) {
                            return SectionType.trending;
                        }
                        return null;
                    case 1707117674:
                        if (rawValue.equals("positions")) {
                            return SectionType.positions;
                        }
                        return null;
                    case 2023635519:
                        if (rawValue.equals("trending-tickets")) {
                            return SectionType.trendingTickets;
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

        private SectionType(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EHomeSection$Companion;", "", "<init>", "()V", "SectionType", "Lcom/polymarket/data/EHomeSection$SectionType;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SectionType SectionType(String rawValue) {
            rawValue.getClass();
            return SectionType.INSTANCE.init(rawValue);
        }

        private Companion() {
        }
    }
}
