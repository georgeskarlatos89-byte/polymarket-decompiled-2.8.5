package com.polymarket.data;

import io.intercom.android.sdk.models.AttributeType;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
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
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 J2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004GHIJB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u0010#\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082 J\u001b\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0012\u0010)\u001a\u00020\u00152\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+J\u001f\u0010,\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010*\u001a\u0004\u0018\u00010+H\u0082 J\u0012\u0010-\u001a\u00020.2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+J\u001f\u0010/\u001a\u00020.2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010*\u001a\u0004\u0018\u00010+H\u0082 J\u0015\u00100\u001a\u0004\u0018\u00010\u00192\u0006\u00101\u001a\u00020+¢\u0006\u0002\u00102J$\u00103\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u00104\u001a\u00020+H\u0082 ¢\u0006\u0002\u00105J\u0015\u00106\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\b\u0010B\u001a\u00020\u0001H\u0016J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00170D2\u0006\u0010E\u001a\u00020\u0019H\u0016J\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00170D2\u0006\u0010E\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R0\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u001b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u001fR(\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u000108X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006K"}, d2 = {"Lcom/polymarket/data/ESportsSeasonSchedule;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "", "Lcom/polymarket/data/ESportsSeasonSchedule$Period;", "periods", "getPeriods", "()Ljava/util/List;", "setPeriods", "(Ljava/util/List;)V", "Swift_periods", "Swift_periods_set", "value", "weeks", "Lcom/polymarket/data/ESportsSeasonSchedule$Week;", "getWeeks", "Swift_weeks", "isActive", "now", "Ljava/util/Date;", "Swift_isActive_0", "currentWeek", "Lcom/polymarket/data/ESportsSeasonSchedule$CurrentWeek;", "Swift_currentWeek_1", "weekIndex", "containing", "(Ljava/util/Date;)Ljava/lang/Integer;", "Swift_weekIndex_2", AttributeType.DATE, "(JLjava/util/Date;)Ljava/lang/Integer;", "Swift_constructor_4", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Week", "Period", "CurrentWeek", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ESportsSeasonSchedule implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    private ESportsSeasonSchedule(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_4(mutableStruct);
    }

    private final native long Swift_constructor_4(MutableStruct copy);

    private final native CurrentWeek Swift_currentWeek_1(long Swift_peer, Date now);

    private final native boolean Swift_isActive_0(long Swift_peer, Date now);

    private final native List<Period> Swift_periods(long Swift_peer);

    private final native void Swift_periods_set(long Swift_peer, List<Period> value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native Integer Swift_weekIndex_2(long Swift_peer, Date date);

    private final native List<Week> Swift_weeks(long Swift_peer);

    public static /* synthetic */ CurrentWeek currentWeek$default(ESportsSeasonSchedule eSportsSeasonSchedule, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            date = null;
        }
        return eSportsSeasonSchedule.currentWeek(date);
    }

    public static /* synthetic */ boolean isActive$default(ESportsSeasonSchedule eSportsSeasonSchedule, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            date = null;
        }
        return eSportsSeasonSchedule.isActive(date);
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

    public final CurrentWeek currentWeek(Date now) {
        return Swift_currentWeek_1(this.Swift_peer, now);
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

    public final List<Period> getPeriods() {
        return Swift_periods(this.Swift_peer);
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

    public final List<Week> getWeeks() {
        return Swift_weeks(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isActive(Date now) {
        return Swift_isActive_0(this.Swift_peer, now);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new ESportsSeasonSchedule(this);
    }

    public final void setPeriods(List<Period> list) {
        list.getClass();
        List<Period> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_periods_set(this.Swift_peer, list2);
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

    public final Integer weekIndex(Date containing) {
        containing.getClass();
        return Swift_weekIndex_2(this.Swift_peer, containing);
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0015\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0082 J\t\u0010\f\u001a\u00020\u0005H\u0082 R\u0011\u0010\t\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/polymarket/data/ESportsSeasonSchedule$Companion;", "", "<init>", "()V", "forLeague", "Lcom/polymarket/data/ESportsSeasonSchedule;", "slug", "Lcom/polymarket/data/ESportsSlug;", "Swift_Companion_forLeague_3", "nfl2026", "getNfl2026", "()Lcom/polymarket/data/ESportsSeasonSchedule;", "Swift_Companion_nfl2026", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ESportsSeasonSchedule Swift_Companion_forLeague_3(ESportsSlug slug);

        private final native ESportsSeasonSchedule Swift_Companion_nfl2026();

        public final ESportsSeasonSchedule forLeague(ESportsSlug slug) {
            return Swift_Companion_forLeague_3(slug);
        }

        public final ESportsSeasonSchedule getNfl2026() {
            return Swift_Companion_nfl2026();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 72\u00020\u00012\u00020\u00022\u00020\u0003:\u00017B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010 \u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010!\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u00020\u0019H\u0082 J\u0015\u0010&\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010'\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u00020\u0019H\u0082 J\u0015\u0010(\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\b\u00102\u001a\u00020\u0001H\u0016J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\u0017042\u0006\u00105\u001a\u00020\u0019H\u0016J\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\u0017042\u0006\u00105\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010#\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR(\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010*X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001d\"\u0004\b1\u0010\u001f¨\u00068"}, d2 = {"Lcom/polymarket/data/ESportsSeasonSchedule$CurrentWeek;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "weekIndex", "getWeekIndex", "()I", "setWeekIndex", "(I)V", "Swift_weekIndex", "Swift_weekIndex_set", "value", "weekCount", "getWeekCount", "setWeekCount", "Swift_weekCount", "Swift_weekCount_set", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "setSmutatingcount", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CurrentWeek implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        private CurrentWeek(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(mutableStruct);
        }

        private final native long Swift_constructor_0(MutableStruct copy);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native int Swift_weekCount(long Swift_peer);

        private final native void Swift_weekCount_set(long Swift_peer, int value);

        private final native int Swift_weekIndex(long Swift_peer);

        private final native void Swift_weekIndex_set(long Swift_peer, int value);

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

        public final int getWeekCount() {
            return Swift_weekCount(this.Swift_peer);
        }

        public final int getWeekIndex() {
            return Swift_weekIndex(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new CurrentWeek(this);
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

        public final void setWeekCount(int i) {
            willmutate();
            try {
                Swift_weekCount_set(this.Swift_peer, i);
            } finally {
                didmutate();
            }
        }

        public final void setWeekIndex(int i) {
            willmutate();
            try {
                Swift_weekIndex_set(this.Swift_peer, i);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        public CurrentWeek(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u00022\u00020\u0003:\u00016B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u0010#\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082 J\u0015\u0010%\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\b\u00101\u001a\u00020\u0001H\u0016J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u0017032\u0006\u00104\u001a\u00020\u0019H\u0016J\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u0017032\u0006\u00104\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R0\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010'X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00067"}, d2 = {"Lcom/polymarket/data/ESportsSeasonSchedule$Period;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "", "Lcom/polymarket/data/ESportsSeasonSchedule$Week;", "weeks", "getWeeks", "()Ljava/util/List;", "setWeeks", "(Ljava/util/List;)V", "Swift_weeks", "Swift_weeks_set", "value", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Period implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        private Period(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(mutableStruct);
        }

        private final native long Swift_constructor_0(MutableStruct copy);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native List<Week> Swift_weeks(long Swift_peer);

        private final native void Swift_weeks_set(long Swift_peer, List<Week> value);

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

        public final List<Week> getWeeks() {
            return Swift_weeks(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new Period(this);
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

        public final void setWeeks(List<Week> list) {
            list.getClass();
            List<Week> list2 = (List) StructKt.sref$default(list, null, 1, null);
            willmutate();
            try {
                Swift_weeks_set(this.Swift_peer, list2);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        public Period(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 B2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001BB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010!\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010\"\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u001bH\u0082 J\u0015\u0010*\u001a\u00020$2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010+\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020$H\u0082 J\u0015\u0010/\u001a\u00020$2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u00100\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020$H\u0082 J\u0015\u00101\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\b\u0010=\u001a\u00020\u0001H\u0016J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00170?2\u0006\u0010@\u001a\u00020\u0019H\u0016J\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00170?2\u0006\u0010@\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010%\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010,\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010'\"\u0004\b.\u0010)R(\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u000103X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u00108\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006C"}, d2 = {"Lcom/polymarket/data/ESportsSeasonSchedule$Week;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "Swift_title", "Swift_title_set", "value", "Ljava/util/Date;", "startDate", "getStartDate", "()Ljava/util/Date;", "setStartDate", "(Ljava/util/Date;)V", "Swift_startDate", "Swift_startDate_set", "endDate", "getEndDate", "setEndDate", "Swift_endDate", "Swift_endDate_set", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Week implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        private Week(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(mutableStruct);
        }

        private final native long Swift_constructor_0(MutableStruct copy);

        private final native Date Swift_endDate(long Swift_peer);

        private final native void Swift_endDate_set(long Swift_peer, Date value);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native Date Swift_startDate(long Swift_peer);

        private final native void Swift_startDate_set(long Swift_peer, Date value);

        private final native String Swift_title(long Swift_peer);

        private final native void Swift_title_set(long Swift_peer, String value);

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

        public final Date getEndDate() {
            return Swift_endDate(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public int getSmutatingcount() {
            return this.smutatingcount;
        }

        public final Date getStartDate() {
            return Swift_startDate(this.Swift_peer);
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
            return Long.hashCode(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new Week(this);
        }

        public final void setEndDate(Date date) {
            date.getClass();
            Date date2 = (Date) StructKt.sref$default(date, null, 1, null);
            willmutate();
            try {
                Swift_endDate_set(this.Swift_peer, date2);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void setSmutatingcount(int i) {
            this.smutatingcount = i;
        }

        public final void setStartDate(Date date) {
            date.getClass();
            Date date2 = (Date) StructKt.sref$default(date, null, 1, null);
            willmutate();
            try {
                Swift_startDate_set(this.Swift_peer, date2);
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

        public final void setTitle(String str) {
            str.getClass();
            willmutate();
            try {
                Swift_title_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        public Week(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    public ESportsSeasonSchedule(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
