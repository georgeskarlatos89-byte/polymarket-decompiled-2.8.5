package com.polymarket.data;

import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
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
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 l2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001lB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\t\b\u0016¢\u0006\u0004\b\t\u0010\u000bB\u0017\b\u0016\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\t\u0010\u000fB\u0011\b\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0011J\u0006\u0010\u0016\u001a\u00020\u0017J\u0015\u0010\u0018\u001a\u00020\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\r\u0010\u0019\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001b\u0010\u001a\u001a\u00060\u0005j\u0002`\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082 J\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010\"\u001a\u00020\u001f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010%\u001a\u00020\u001f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010(\u001a\u00020\u001f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010,\u001a\u00020*2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u00100\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u00103\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u000e\u00104\u001a\u00020*2\u0006\u00105\u001a\u000206J\u001d\u00107\u001a\u00020*2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u00105\u001a\u000206H\u0082 J\u000e\u00108\u001a\u00020\u001f2\u0006\u00109\u001a\u00020\u001fJ\u001d\u0010:\u001a\u00020\u001f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010;\u001a\u00020\u001fH\u0082 J\u0010\u0010<\u001a\u0002062\b\b\u0002\u0010=\u001a\u000206J\u001d\u0010>\u001a\u0002062\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010?\u001a\u000206H\u0082 J\u000e\u0010@\u001a\u00020\u00172\u0006\u0010A\u001a\u00020\u000eJ\u001d\u0010B\u001a\u00020\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010A\u001a\u00020\u000eH\u0082 J\u0014\u0010@\u001a\u00020\u00172\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ#\u0010D\u001a\u00020\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082 J\u000e\u0010F\u001a\u00020\u00172\u0006\u00105\u001a\u000206J\u001d\u0010G\u001a\u00020\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u00105\u001a\u000206H\u0082 J\u0014\u0010H\u001a\u00020\u00172\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ#\u0010I\u001a\u00020\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082 J\u000e\u0010J\u001a\u00020\u00172\u0006\u0010K\u001a\u00020\u0000J\u001d\u0010L\u001a\u00020\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010M\u001a\u00020\u0000H\u0082 J\u000e\u0010N\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\u0000J\u001d\u0010P\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010M\u001a\u00020\u0000H\u0082 J\u0018\u0010Q\u001a\u00020\u00172\u0006\u0010R\u001a\u0002062\b\b\u0002\u0010?\u001a\u000206J%\u0010S\u001a\u00020\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010T\u001a\u0002062\u0006\u0010?\u001a\u000206H\u0082 J\u0015\u0010U\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0010\u001a\u00020\u0001H\u0082 J\b\u0010a\u001a\u00020\u0001H\u0016J\u0013\u0010b\u001a\u00020*2\b\u0010M\u001a\u0004\u0018\u00010XH\u0096\u0002J\u0019\u0010c\u001a\u00020*2\u0006\u0010d\u001a\u00020\u00002\u0006\u0010e\u001a\u00020\u0000H\u0082 J\b\u0010f\u001a\u00020\u001fH\u0016J\u0015\u0010g\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010h\u001a\b\u0012\u0004\u0012\u00020X0i2\u0006\u0010j\u001a\u00020\u001fH\u0016J\u0017\u0010k\u001a\b\u0012\u0004\u0012\u00020X0i2\u0006\u0010j\u001a\u00020\u001fH\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010#\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b$\u0010!R\u0011\u0010&\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b'\u0010!R\u0011\u0010)\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b)\u0010+R\u0013\u0010-\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u00101\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b2\u0010/R(\u0010V\u001a\u0010\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\u0017\u0018\u00010WX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001a\u0010]\u001a\u00020\u001fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010!\"\u0004\b_\u0010`¨\u0006m"}, d2 = {"Lcom/polymarket/data/ETimeSeries;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "()V", "points", "", "Lcom/polymarket/data/ETimeSeriesPoint;", "(Ljava/util/List;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "Swift_constructor_0", "Swift_constructor_1", "getPoints", "()Ljava/util/List;", "Swift_points", "startIndex", "", "getStartIndex", "()I", "Swift_startIndex", "endIndex", "getEndIndex", "Swift_endIndex", "count", "getCount", "Swift_count", "isEmpty", "", "()Z", "Swift_isEmpty", "first", "getFirst", "()Lcom/polymarket/data/ETimeSeriesPoint;", "Swift_first", "last", "getLast", "Swift_last", "contains", "timestamp", "", "Swift_contains_2", "index", "after", "Swift_index_3", "i", "inferStep", "default", "Swift_inferStep_4", "defaultStep", "append", "point", "Swift_append_5", "contentsOf", "Swift_append_6", "newPoints", "remove", "Swift_remove_7", "update", "Swift_update_8", "replace", "with", "Swift_replace_9", "other", "merge", "overridingWith", "Swift_merge_10", "backfill", "to", "Swift_backfill_11", "targetTimestamp", "Swift_constructor_16", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "setSmutatingcount", "(I)V", "scopy", "equals", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ETimeSeries implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    public ETimeSeries(List<ETimeSeriesPoint> list) {
        list.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(list);
    }

    private final native void Swift_append_5(long Swift_peer, ETimeSeriesPoint point);

    private final native void Swift_append_6(long Swift_peer, List<ETimeSeriesPoint> newPoints);

    private final native void Swift_backfill_11(long Swift_peer, double targetTimestamp, double defaultStep);

    private final native long Swift_constructor_0();

    private final native long Swift_constructor_1(List<ETimeSeriesPoint> points);

    private final native long Swift_constructor_16(MutableStruct copy);

    private final native boolean Swift_contains_2(long Swift_peer, double timestamp);

    private final native int Swift_count(long Swift_peer);

    private final native int Swift_endIndex(long Swift_peer);

    private final native ETimeSeriesPoint Swift_first(long Swift_peer);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native int Swift_index_3(long Swift_peer, int i);

    private final native double Swift_inferStep_4(long Swift_peer, double defaultStep);

    private final native boolean Swift_isEmpty(long Swift_peer);

    private final native boolean Swift_isequal(ETimeSeries lhs, ETimeSeries rhs);

    private final native ETimeSeriesPoint Swift_last(long Swift_peer);

    private final native ETimeSeries Swift_merge_10(long Swift_peer, ETimeSeries other);

    private final native List<ETimeSeriesPoint> Swift_points(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native void Swift_remove_7(long Swift_peer, double timestamp);

    private final native void Swift_replace_9(long Swift_peer, ETimeSeries other);

    private final native int Swift_startIndex(long Swift_peer);

    private final native void Swift_update_8(long Swift_peer, List<ETimeSeriesPoint> newPoints);

    public static /* synthetic */ void backfill$default(ETimeSeries eTimeSeries, double d, double d2, int i, Object obj) {
        if ((i & 2) != 0) {
            d2 = 60.0d;
        }
        eTimeSeries.backfill(d, d2);
    }

    public static /* synthetic */ double inferStep$default(ETimeSeries eTimeSeries, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = 60.0d;
        }
        return eTimeSeries.inferStep(d);
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

    public final void append(ETimeSeriesPoint point) {
        point.getClass();
        willmutate();
        try {
            Swift_append_5(this.Swift_peer, point);
        } finally {
            didmutate();
        }
    }

    public final void backfill(double to, double defaultStep) {
        ETimeSeries eTimeSeries;
        willmutate();
        try {
            eTimeSeries = this;
        } catch (Throwable th) {
            th = th;
            eTimeSeries = this;
        }
        try {
            eTimeSeries.Swift_backfill_11(this.Swift_peer, to, defaultStep);
            eTimeSeries.didmutate();
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            eTimeSeries.didmutate();
            throw th3;
        }
    }

    public final boolean contains(double timestamp) {
        return Swift_contains_2(this.Swift_peer, timestamp);
    }

    @Override // skip.lib.MutableStruct
    public void didmutate() {
        super.didmutate();
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ETimeSeries)) {
            return false;
        }
        return Swift_isequal(this, (ETimeSeries) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final int getCount() {
        return Swift_count(this.Swift_peer);
    }

    public final int getEndIndex() {
        return Swift_endIndex(this.Swift_peer);
    }

    public final ETimeSeriesPoint getFirst() {
        return Swift_first(this.Swift_peer);
    }

    public final ETimeSeriesPoint getLast() {
        return Swift_last(this.Swift_peer);
    }

    public final List<ETimeSeriesPoint> getPoints() {
        return Swift_points(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    public final int getStartIndex() {
        return Swift_startIndex(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public int hashCode() {
        return Long.hashCode(Swift_hashvalue(this.Swift_peer));
    }

    public final int index(int after) {
        return Swift_index_3(this.Swift_peer, after);
    }

    public final double inferStep(double r3) {
        return Swift_inferStep_4(this.Swift_peer, r3);
    }

    public final boolean isEmpty() {
        return Swift_isEmpty(this.Swift_peer);
    }

    public final ETimeSeries merge(ETimeSeries overridingWith) {
        overridingWith.getClass();
        return Swift_merge_10(this.Swift_peer, overridingWith);
    }

    public final void remove(double timestamp) {
        willmutate();
        try {
            Swift_remove_7(this.Swift_peer, timestamp);
        } finally {
            didmutate();
        }
    }

    public final void replace(ETimeSeries with) {
        with.getClass();
        willmutate();
        try {
            Swift_replace_9(this.Swift_peer, with);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new ETimeSeries(this);
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

    public final void update(List<ETimeSeriesPoint> newPoints) {
        newPoints.getClass();
        willmutate();
        try {
            Swift_update_8(this.Swift_peer, newPoints);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0082 J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\u0011\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0082 J\u0006\u0010\n\u001a\u00020\u0007J\t\u0010\r\u001a\u00020\u0007H\u0082 J\u0010\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\u0011\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082 ¨\u0006\u0013"}, d2 = {"Lcom/polymarket/data/ETimeSeries$Companion;", "", "<init>", "()V", "makeKey", "", TicketDetailDestinationKt.LAUNCHED_FROM, "", "Swift_Companion_makeKey_12", "timestamp", "tick", "for_", "Swift_Companion_tick_13", "Swift_Companion_tick_14", "mock", "Lcom/polymarket/data/ETimeSeries;", "count", "", "Swift_Companion_mock_15", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_makeKey_12(double timestamp);

        private final native ETimeSeries Swift_Companion_mock_15(int count);

        private final native double Swift_Companion_tick_13(double timestamp);

        private final native double Swift_Companion_tick_14();

        public static /* synthetic */ ETimeSeries mock$default(Companion companion, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 10;
            }
            return companion.mock(i);
        }

        public final long makeKey(double from) {
            return Swift_Companion_makeKey_12(from);
        }

        public final ETimeSeries mock(int count) {
            return Swift_Companion_mock_15(count);
        }

        public final double tick(double for_) {
            return Swift_Companion_tick_13(for_);
        }

        private Companion() {
        }

        public final double tick() {
            return Swift_Companion_tick_14();
        }
    }

    public ETimeSeries() {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0();
    }

    public final void append(List<ETimeSeriesPoint> contentsOf) {
        contentsOf.getClass();
        willmutate();
        try {
            Swift_append_6(this.Swift_peer, contentsOf);
        } finally {
            didmutate();
        }
    }

    public ETimeSeries(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private ETimeSeries(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_16(mutableStruct);
    }
}
