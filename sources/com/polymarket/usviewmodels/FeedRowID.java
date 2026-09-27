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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0002+,B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010\u0018\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001b\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001d\u0010\u001c\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0082 J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\u0019\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0000H\u0082 J\b\u0010$\u001a\u00020%H\u0016J\u0015\u0010&\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020 0(2\u0006\u0010)\u001a\u00020%H\u0016J\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020 0(2\u0006\u0010)\u001a\u00020%H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006-"}, d2 = {"Lcom/polymarket/usviewmodels/FeedRowID;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "kind", "Lcom/polymarket/usviewmodels/FeedRowID$Kind;", "key", "", "(Lcom/polymarket/usviewmodels/FeedRowID$Kind;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getKind", "()Lcom/polymarket/usviewmodels/FeedRowID$Kind;", "Swift_kind", "getKey", "()Ljava/lang/String;", "Swift_key", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Kind", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FeedRowID implements SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;

    public FeedRowID(Kind kind, String str) {
        kind.getClass();
        str.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(kind, str);
    }

    private final native long Swift_constructor_0(Kind kind, String key);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native boolean Swift_isequal(FeedRowID lhs, FeedRowID rhs);

    private final native String Swift_key(long Swift_peer);

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
        if (!(other instanceof FeedRowID)) {
            return false;
        }
        return Swift_isequal(this, (FeedRowID) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final String getKey() {
        return Swift_key(this.Swift_peer);
    }

    public final Kind getKind() {
        return Swift_kind(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public int hashCode() {
        return Long.hashCode(Swift_hashvalue(this.Swift_peer));
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u001dB\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u001e"}, d2 = {"Lcom/polymarket/usviewmodels/FeedRowID$Kind;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "promoCard", "labelRow", "eventCard", "heroEventCard", "keyRaceCard", "moduleCarousel", "moduleHeader", "moduleChildPromo", "moduleShowMore", "polymapMiniMap", "bottomLoader", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Kind implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Kind[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final Kind promoCard = new Kind("promoCard", 0, "promoCard", null, 2, null);
        public static final Kind labelRow = new Kind("labelRow", 1, "labelRow", null, 2, null);
        public static final Kind eventCard = new Kind("eventCard", 2, "eventCard", null, 2, null);
        public static final Kind heroEventCard = new Kind("heroEventCard", 3, "heroEventCard", null, 2, null);
        public static final Kind keyRaceCard = new Kind("keyRaceCard", 4, "keyRaceCard", null, 2, null);
        public static final Kind moduleCarousel = new Kind("moduleCarousel", 5, "moduleCarousel", null, 2, null);
        public static final Kind moduleHeader = new Kind("moduleHeader", 6, "moduleHeader", null, 2, null);
        public static final Kind moduleChildPromo = new Kind("moduleChildPromo", 7, "moduleChildPromo", null, 2, null);
        public static final Kind moduleShowMore = new Kind("moduleShowMore", 8, "moduleShowMore", null, 2, null);
        public static final Kind polymapMiniMap = new Kind("polymapMiniMap", 9, "polymapMiniMap", null, 2, null);
        public static final Kind bottomLoader = new Kind("bottomLoader", 10, "bottomLoader", null, 2, null);

        private static final /* synthetic */ Kind[] $values() {
            return new Kind[]{promoCard, labelRow, eventCard, heroEventCard, keyRaceCard, moduleCarousel, moduleHeader, moduleChildPromo, moduleShowMore, polymapMiniMap, bottomLoader};
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/FeedRowID$Kind$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usviewmodels/FeedRowID$Kind;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Kind init(String rawValue) {
                rawValue.getClass();
                switch (rawValue.hashCode()) {
                    case -1959268794:
                        if (!rawValue.equals("labelRow")) {
                            return null;
                        }
                        return Kind.labelRow;
                    case -1588974096:
                        if (rawValue.equals("heroEventCard")) {
                            return Kind.heroEventCard;
                        }
                        return null;
                    case -1327194880:
                        if (rawValue.equals("keyRaceCard")) {
                            return Kind.keyRaceCard;
                        }
                        return null;
                    case -800679745:
                        if (rawValue.equals("promoCard")) {
                            return Kind.promoCard;
                        }
                        return null;
                    case 28516575:
                        if (rawValue.equals("moduleChildPromo")) {
                            return Kind.moduleChildPromo;
                        }
                        return null;
                    case 30901450:
                        if (rawValue.equals("eventCard")) {
                            return Kind.eventCard;
                        }
                        return null;
                    case 558158165:
                        if (rawValue.equals("polymapMiniMap")) {
                            return Kind.polymapMiniMap;
                        }
                        return null;
                    case 566862462:
                        if (rawValue.equals("moduleShowMore")) {
                            return Kind.moduleShowMore;
                        }
                        return null;
                    case 908804076:
                        if (rawValue.equals("moduleCarousel")) {
                            return Kind.moduleCarousel;
                        }
                        return null;
                    case 942797849:
                        if (rawValue.equals("moduleHeader")) {
                            return Kind.moduleHeader;
                        }
                        return null;
                    case 2048403998:
                        if (rawValue.equals("bottomLoader")) {
                            return Kind.bottomLoader;
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

        private Kind(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/FeedRowID$Companion;", "", "<init>", "()V", "Kind", "Lcom/polymarket/usviewmodels/FeedRowID$Kind;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    public FeedRowID(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
