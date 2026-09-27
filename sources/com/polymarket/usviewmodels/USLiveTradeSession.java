package com.polymarket.usviewmodels;

import com.polymarket.data.EAmount;
import defpackage.ug7;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
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
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 G2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002FGB\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0015\u0010\u0012\u001a\u00020\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0015\u0010\u0018\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010\u001b\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010&\u001a\u00020#2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010)\u001a\u00020#2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010.\u001a\u00020+2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u00101\u001a\u00020+2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u00105\u001a\u0002032\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u00108\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010;\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0013\u0010<\u001a\u0002032\b\u0010=\u001a\u0004\u0018\u00010>H\u0096\u0002J\u0019\u0010?\u001a\u0002032\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u0000H\u0082 J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020>0C2\u0006\u0010D\u001a\u00020\u0014H\u0016J\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020>0C2\u0006\u0010D\u001a\u00020\u0014H\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010'\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b(\u0010%R\u0011\u0010*\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010/\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b0\u0010-R\u0011\u00102\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b2\u00104R\u0011\u00106\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b7\u0010\u0017R\u0011\u00109\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b:\u0010\u0017¨\u0006H"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTradeSession;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()Ljava/lang/String;", "Swift_id", "marketSlug", "getMarketSlug", "Swift_marketSlug", "entries", "", "Lcom/polymarket/usviewmodels/USLiveTradeSession$Entry;", "getEntries", "()Ljava/util/List;", "Swift_entries", "startTime", "Ljava/util/Date;", "getStartTime", "()Ljava/util/Date;", "Swift_startTime", "endTime", "getEndTime", "Swift_endTime", "totalSpent", "Lcom/polymarket/data/EAmount;", "getTotalSpent", "()Lcom/polymarket/data/EAmount;", "Swift_totalSpent", "pnl", "getPnl", "Swift_pnl", "isOpen", "", "()Z", "Swift_isOpen", "timeRangeText", "getTimeRangeText", "Swift_timeRangeText", "headerAmountText", "getHeaderAmountText", "Swift_headerAmountText", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Entry", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class USLiveTradeSession implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public USLiveTradeSession(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private final native Date Swift_endTime(long Swift_peer);

    private final native List<Entry> Swift_entries(long Swift_peer);

    private final native String Swift_headerAmountText(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native boolean Swift_isOpen(long Swift_peer);

    private final native boolean Swift_isequal(USLiveTradeSession lhs, USLiveTradeSession rhs);

    private final native String Swift_marketSlug(long Swift_peer);

    private final native EAmount Swift_pnl(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native Date Swift_startTime(long Swift_peer);

    private final native String Swift_timeRangeText(long Swift_peer);

    private final native EAmount Swift_totalSpent(long Swift_peer);

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
        if (!(other instanceof USLiveTradeSession)) {
            return false;
        }
        return Swift_isequal(this, (USLiveTradeSession) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final Date getEndTime() {
        return Swift_endTime(this.Swift_peer);
    }

    public final List<Entry> getEntries() {
        return Swift_entries(this.Swift_peer);
    }

    public final String getHeaderAmountText() {
        return Swift_headerAmountText(this.Swift_peer);
    }

    @Override // skip.lib.Identifiable
    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public String getId2() {
        return Swift_id(this.Swift_peer);
    }

    public final String getMarketSlug() {
        return Swift_marketSlug(this.Swift_peer);
    }

    public final EAmount getPnl() {
        return Swift_pnl(this.Swift_peer);
    }

    public final Date getStartTime() {
        return Swift_startTime(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final String getTimeRangeText() {
        return Swift_timeRangeText(this.Swift_peer);
    }

    public final EAmount getTotalSpent() {
        return Swift_totalSpent(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isOpen() {
        return Swift_isOpen(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002<=B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB1\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0013J\u0006\u0010\u0018\u001a\u00020\u0019J\u0015\u0010\u001a\u001a\u00020\u00192\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0015\u0010\u001f\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010\"\u001a\u00020\u000e2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010$\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010'\u001a\u00020\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010)\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010,\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010/\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J5\u00100\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0082 J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0096\u0002J\u0019\u00105\u001a\u0002022\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0000H\u0082 J\u0016\u00108\u001a\b\u0012\u0004\u0012\u000204092\u0006\u0010:\u001a\u00020\u001cH\u0016J\u0017\u0010;\u001a\b\u0012\u0004\u0012\u000204092\u0006\u0010:\u001a\u00020\u001cH\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u0012\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b(\u0010\u001eR\u0011\u0010*\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b+\u0010\u001eR\u0011\u0010-\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b.\u0010\u001e¨\u0006>"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTradeSession$Entry;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "kind", "Lcom/polymarket/usviewmodels/USLiveTradeSession$Entry$Kind;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "time", "Ljava/util/Date;", "amountText", "(Ljava/lang/String;Lcom/polymarket/usviewmodels/USLiveTradeSession$Entry$Kind;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getKind", "()Lcom/polymarket/usviewmodels/USLiveTradeSession$Entry$Kind;", "Swift_kind", "getTitle", "Swift_title", "getTime", "()Ljava/util/Date;", "Swift_time", "getAmountText", "Swift_amountText", "kindLabel", "getKindLabel", "Swift_kindLabel", "timeText", "getTimeText", "Swift_timeText", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Kind", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Entry implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private long Swift_peer;

        public Entry(String str, Kind kind, String str2, Date date, String str3) {
            str.getClass();
            kind.getClass();
            str2.getClass();
            date.getClass();
            str3.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, kind, str2, date, str3);
        }

        private final native String Swift_amountText(long Swift_peer);

        private final native long Swift_constructor_0(String id, Kind kind, String title, Date time, String amountText);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(Entry lhs, Entry rhs);

        private final native Kind Swift_kind(long Swift_peer);

        private final native String Swift_kindLabel(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native Date Swift_time(long Swift_peer);

        private final native String Swift_timeText(long Swift_peer);

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
            if (!(other instanceof Entry)) {
                return false;
            }
            return Swift_isequal(this, (Entry) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getAmountText() {
            return Swift_amountText(this.Swift_peer);
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
        }

        public final Kind getKind() {
            return Swift_kind(this.Swift_peer);
        }

        public final String getKindLabel() {
            return Swift_kindLabel(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final Date getTime() {
            return Swift_time(this.Swift_peer);
        }

        public final String getTimeText() {
            return Swift_timeText(this.Swift_peer);
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
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0015B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0016"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTradeSession$Entry$Kind;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "buy", "cashOut", "resolution", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Kind implements RawRepresentable<String>, SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ Kind[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Kind buy = new Kind("buy", 0, "buy", null, 2, null);
            public static final Kind cashOut = new Kind("cashOut", 1, "cashOut", null, 2, null);
            public static final Kind resolution = new Kind("resolution", 2, "resolution", null, 2, null);
            private final String rawValue;

            private static final /* synthetic */ Kind[] $values() {
                return new Kind[]{buy, cashOut, resolution};
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
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTradeSession$Entry$Kind$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usviewmodels/USLiveTradeSession$Entry$Kind;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Kind init(String rawValue) {
                    rawValue.getClass();
                    int hashCode = rawValue.hashCode();
                    if (hashCode != -1600030548) {
                        if (hashCode != 97926) {
                            if (hashCode == 554961691 && rawValue.equals("cashOut")) {
                                return Kind.cashOut;
                            }
                            return null;
                        }
                        if (rawValue.equals("buy")) {
                            return Kind.buy;
                        }
                        return null;
                    }
                    if (!rawValue.equals("resolution")) {
                        return null;
                    }
                    return Kind.resolution;
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTradeSession$Entry$Companion;", "", "<init>", "()V", "Kind", "Lcom/polymarket/usviewmodels/USLiveTradeSession$Entry$Kind;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        public Entry(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    @Override // skip.lib.Identifiable
    public /* bridge */ /* synthetic */ String getId() {
        return getId2();
    }
}
