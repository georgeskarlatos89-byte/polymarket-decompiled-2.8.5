package com.polymarket.usviewmodels;

import defpackage.ug7;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MutableStruct;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 R2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003PQRB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\t\u0010\u0013B\u0011\b\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0015J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0015\u0010\u001c\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0015\u0010\"\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010#\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010$\u001a\u00020\fH\u0082 J\u0017\u0010)\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010*\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010$\u001a\u0004\u0018\u00010\u000eH\u0082 J\u001f\u0010+\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0082 J\u001d\u0010,\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0082 J\u0015\u00101\u001a\u00020.2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u00104\u001a\u00020.2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u00105\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0014\u001a\u00020\u0001H\u0082 J\b\u0010C\u001a\u00020\u0001H\u0016J\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u000108H\u0096\u0002J\u0019\u0010G\u001a\u00020E2\u0006\u0010H\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u0000H\u0082 J\b\u0010J\u001a\u00020>H\u0016J\u0015\u0010K\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010L\u001a\b\u0012\u0004\u0012\u0002080M2\u0006\u0010N\u001a\u00020>H\u0016J\u0017\u0010O\u001a\b\u0012\u0004\u0012\u0002080M2\u0006\u0010N\u001a\u00020>H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0011\u0010-\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00102\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b3\u00100R(\u00106\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u001b\u0018\u000107X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020>X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006S"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsRaceRating;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "bucket", "Lcom/polymarket/usviewmodels/MidtermsRaceRating$Bucket;", "party", "Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;", "(Lcom/polymarket/usviewmodels/MidtermsRaceRating$Bucket;Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;)V", "democratProbability", "", "republicanProbability", "(DD)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "newValue", "getBucket", "()Lcom/polymarket/usviewmodels/MidtermsRaceRating$Bucket;", "setBucket", "(Lcom/polymarket/usviewmodels/MidtermsRaceRating$Bucket;)V", "Swift_bucket", "Swift_bucket_set", "value", "getParty", "()Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;", "setParty", "(Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;)V", "Swift_party", "Swift_party_set", "Swift_constructor_0", "Swift_constructor_1", "analyticsValue", "", "getAnalyticsValue", "()Ljava/lang/String;", "Swift_analyticsValue", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "Swift_title", "Swift_constructor_5", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "equals", "", "other", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Bucket", "Party", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MidtermsRaceRating implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final double leanThreshold = 0.6d;
    private static final double likelyThreshold = 0.75d;
    private static final double safeThreshold = 0.9d;
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsRaceRating$Bucket;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "tossup", "lean", "likely", "safe", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Bucket implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Bucket[] $VALUES;
        public static final Bucket tossup = new Bucket("tossup", 0);
        public static final Bucket lean = new Bucket("lean", 1);
        public static final Bucket likely = new Bucket("likely", 2);
        public static final Bucket safe = new Bucket("safe", 3);

        private static final /* synthetic */ Bucket[] $values() {
            return new Bucket[]{tossup, lean, likely, safe};
        }

        static {
            Bucket[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Bucket(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Bucket valueOf(String str) {
            return (Bucket) Enum.valueOf(Bucket.class, str);
        }

        public static Bucket[] values() {
            return (Bucket[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "democrat", "republican", "independent", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Party implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Party[] $VALUES;
        public static final Party democrat = new Party("democrat", 0);
        public static final Party republican = new Party("republican", 1);
        public static final Party independent = new Party("independent", 2);

        private static final /* synthetic */ Party[] $values() {
            return new Party[]{democrat, republican, independent};
        }

        static {
            Party[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Party(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Party valueOf(String str) {
            return (Party) Enum.valueOf(Party.class, str);
        }

        public static Party[] values() {
            return (Party[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    public MidtermsRaceRating(Bucket bucket, Party party) {
        bucket.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(bucket, party);
    }

    private final native String Swift_analyticsValue(long Swift_peer);

    private final native Bucket Swift_bucket(long Swift_peer);

    private final native void Swift_bucket_set(long Swift_peer, Bucket value);

    private final native long Swift_constructor_0(Bucket bucket, Party party);

    private final native long Swift_constructor_1(double democratProbability, double republicanProbability);

    private final native long Swift_constructor_5(MutableStruct copy);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native boolean Swift_isequal(MidtermsRaceRating lhs, MidtermsRaceRating rhs);

    private final native Party Swift_party(long Swift_peer);

    private final native void Swift_party_set(long Swift_peer, Party value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_title(long Swift_peer);

    public static final /* synthetic */ double access$getLeanThreshold$cp() {
        return leanThreshold;
    }

    public static final /* synthetic */ double access$getLikelyThreshold$cp() {
        return likelyThreshold;
    }

    public static final /* synthetic */ double access$getSafeThreshold$cp() {
        return safeThreshold;
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
        if (other == this) {
            return true;
        }
        if (!(other instanceof MidtermsRaceRating)) {
            return false;
        }
        return Swift_isequal(this, (MidtermsRaceRating) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final String getAnalyticsValue() {
        return Swift_analyticsValue(this.Swift_peer);
    }

    public final Bucket getBucket() {
        return Swift_bucket(this.Swift_peer);
    }

    public final Party getParty() {
        return Swift_party(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final String getTitle() {
        return Swift_title(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(Swift_hashvalue(this.Swift_peer));
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new MidtermsRaceRating(this);
    }

    public final void setBucket(Bucket bucket) {
        bucket.getClass();
        willmutate();
        try {
            Swift_bucket_set(this.Swift_peer, bucket);
        } finally {
            didmutate();
        }
    }

    public final void setParty(Party party) {
        willmutate();
        try {
            Swift_party_set(this.Swift_peer, party);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    @Override // skip.lib.MutableStruct
    public void setSupdate(Function1<Object, Unit> function1) {
        this.supdate = function1;
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0010\u001a\u00020\rH\u0082 J\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013J\u0011\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 J\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013J\u0011\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 J\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013J\u0011\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001aH\u0082 R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsRaceRating$Companion;", "", "<init>", "()V", "leanThreshold", "", "getLeanThreshold", "()D", "likelyThreshold", "getLikelyThreshold", "safeThreshold", "getSafeThreshold", "tossup", "Lcom/polymarket/usviewmodels/MidtermsRaceRating;", "getTossup", "()Lcom/polymarket/usviewmodels/MidtermsRaceRating;", "Swift_Companion_tossup", "lean", "party", "Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;", "Swift_Companion_lean_2", "likely", "Swift_Companion_likely_3", "safe", "Swift_Companion_safe_4", "displayOrder", "", "getDisplayOrder", "()Ljava/util/List;", "Swift_Companion_displayOrder", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native List<MidtermsRaceRating> Swift_Companion_displayOrder();

        private final native MidtermsRaceRating Swift_Companion_lean_2(Party party);

        private final native MidtermsRaceRating Swift_Companion_likely_3(Party party);

        private final native MidtermsRaceRating Swift_Companion_safe_4(Party party);

        private final native MidtermsRaceRating Swift_Companion_tossup();

        public final List<MidtermsRaceRating> getDisplayOrder() {
            return Swift_Companion_displayOrder();
        }

        public final double getLeanThreshold() {
            return MidtermsRaceRating.access$getLeanThreshold$cp();
        }

        public final double getLikelyThreshold() {
            return MidtermsRaceRating.access$getLikelyThreshold$cp();
        }

        public final double getSafeThreshold() {
            return MidtermsRaceRating.access$getSafeThreshold$cp();
        }

        public final MidtermsRaceRating getTossup() {
            return Swift_Companion_tossup();
        }

        public final MidtermsRaceRating lean(Party party) {
            party.getClass();
            return Swift_Companion_lean_2(party);
        }

        public final MidtermsRaceRating likely(Party party) {
            party.getClass();
            return Swift_Companion_likely_3(party);
        }

        public final MidtermsRaceRating safe(Party party) {
            party.getClass();
            return Swift_Companion_safe_4(party);
        }

        private Companion() {
        }
    }

    public MidtermsRaceRating(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public MidtermsRaceRating(double d, double d2) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(d, d2);
    }

    private MidtermsRaceRating(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_5(mutableStruct);
    }
}
