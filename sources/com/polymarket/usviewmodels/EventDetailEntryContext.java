package com.polymarket.usviewmodels;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 72\u00020\u00012\u00020\u0002:\u000267B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0015\u0010\u001e\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010!\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010$\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010'\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010*\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010-\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00100\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001f\u00101\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0082 J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u0019032\u0006\u00104\u001a\u00020\u001bH\u0016J\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u0019032\u0006\u00104\u001a\u00020\u001bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010\"\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b#\u0010 R\u0013\u0010%\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b&\u0010 R\u0013\u0010(\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b)\u0010 R\u0013\u0010+\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b,\u0010 R\u0013\u0010.\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b/\u0010 ¨\u00068"}, d2 = {"Lcom/polymarket/usviewmodels/EventDetailEntryContext;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "source", "Lcom/polymarket/usviewmodels/EventDetailEntryContext$Source;", "surfaceId", "", "(Lcom/polymarket/usviewmodels/EventDetailEntryContext$Source;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getSource", "()Lcom/polymarket/usviewmodels/EventDetailEntryContext$Source;", "Swift_source", "getSurfaceId", "()Ljava/lang/String;", "Swift_surfaceId", "hub", "getHub", "Swift_hub", "hubSessionId", "getHubSessionId", "Swift_hubSessionId", "marketFamily", "getMarketFamily", "Swift_marketFamily", "rating", "getRating", "Swift_rating", "geoId", "getGeoId", "Swift_geoId", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Source", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventDetailEntryContext implements SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;

    public EventDetailEntryContext(Source source, String str) {
        source.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(source, str);
    }

    private final native long Swift_constructor_0(Source source, String surfaceId);

    private final native String Swift_geoId(long Swift_peer);

    private final native String Swift_hub(long Swift_peer);

    private final native String Swift_hubSessionId(long Swift_peer);

    private final native String Swift_marketFamily(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_rating(long Swift_peer);

    private final native void Swift_release(long Swift_peer);

    private final native Source Swift_source(long Swift_peer);

    private final native String Swift_surfaceId(long Swift_peer);

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

    public final String getGeoId() {
        return Swift_geoId(this.Swift_peer);
    }

    public final String getHub() {
        return Swift_hub(this.Swift_peer);
    }

    public final String getHubSessionId() {
        return Swift_hubSessionId(this.Swift_peer);
    }

    public final String getMarketFamily() {
        return Swift_marketFamily(this.Swift_peer);
    }

    public final String getRating() {
        return Swift_rating(this.Swift_peer);
    }

    public final Source getSource() {
        return Swift_source(this.Swift_peer);
    }

    public final String getSurfaceId() {
        return Swift_surfaceId(this.Swift_peer);
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
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u001dB\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u001e"}, d2 = {"Lcom/polymarket/usviewmodels/EventDetailEntryContext$Source;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "hub", "teamPage", "category", "search", "home", "homeCarousel", "deeplink", "liveActivity", "notification", "chat", "gameSwitcher", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Source implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final Source hub = new Source("hub", 0, "hub", null, 2, null);
        public static final Source teamPage = new Source("teamPage", 1, "team_page", null, 2, null);
        public static final Source category = new Source("category", 2, "category", null, 2, null);
        public static final Source search = new Source("search", 3, "search", null, 2, null);
        public static final Source home = new Source("home", 4, "home", null, 2, null);
        public static final Source homeCarousel = new Source("homeCarousel", 5, "home_carousel", null, 2, null);
        public static final Source deeplink = new Source("deeplink", 6, "deeplink", null, 2, null);
        public static final Source liveActivity = new Source("liveActivity", 7, "live_activity", null, 2, null);
        public static final Source notification = new Source("notification", 8, "notification", null, 2, null);
        public static final Source chat = new Source("chat", 9, "chat", null, 2, null);
        public static final Source gameSwitcher = new Source("gameSwitcher", 10, "game_switcher", null, 2, null);

        private static final /* synthetic */ Source[] $values() {
            return new Source[]{hub, teamPage, category, search, home, homeCarousel, deeplink, liveActivity, notification, chat, gameSwitcher};
        }

        static {
            Source[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ Source(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/EventDetailEntryContext$Source$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usviewmodels/EventDetailEntryContext$Source;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Source init(String rawValue) {
                rawValue.getClass();
                switch (rawValue.hashCode()) {
                    case -1481573234:
                        if (!rawValue.equals("game_switcher")) {
                            return null;
                        }
                        return Source.gameSwitcher;
                    case -906336856:
                        if (rawValue.equals("search")) {
                            return Source.search;
                        }
                        return null;
                    case -175846607:
                        if (rawValue.equals("team_page")) {
                            return Source.teamPage;
                        }
                        return null;
                    case 103669:
                        if (rawValue.equals("hub")) {
                            return Source.hub;
                        }
                        return null;
                    case 3052376:
                        if (rawValue.equals("chat")) {
                            return Source.chat;
                        }
                        return null;
                    case 3208415:
                        if (rawValue.equals("home")) {
                            return Source.home;
                        }
                        return null;
                    case 50511102:
                        if (rawValue.equals("category")) {
                            return Source.category;
                        }
                        return null;
                    case 120367296:
                        if (rawValue.equals("home_carousel")) {
                            return Source.homeCarousel;
                        }
                        return null;
                    case 595233003:
                        if (rawValue.equals("notification")) {
                            return Source.notification;
                        }
                        return null;
                    case 629233382:
                        if (rawValue.equals("deeplink")) {
                            return Source.deeplink;
                        }
                        return null;
                    case 1815657730:
                        if (rawValue.equals("live_activity")) {
                            return Source.liveActivity;
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

        private Source(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/EventDetailEntryContext$Companion;", "", "<init>", "()V", "Source", "Lcom/polymarket/usviewmodels/EventDetailEntryContext$Source;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Source Source(String rawValue) {
            rawValue.getClass();
            return Source.INSTANCE.init(rawValue);
        }

        private Companion() {
        }
    }

    public EventDetailEntryContext(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ EventDetailEntryContext(Source source, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(source, (i & 2) != 0 ? null : str);
    }
}
