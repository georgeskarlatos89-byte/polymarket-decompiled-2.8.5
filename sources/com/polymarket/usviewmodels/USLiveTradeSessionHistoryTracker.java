package com.polymarket.usviewmodels;

import java.util.Date;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001;B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBq\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00110\u0010\u0012\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0010\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017¢\u0006\u0004\b\b\u0010\u001aJ\u0006\u0010\u001f\u001a\u00020\u0019J\u0015\u0010 \u001a\u00020\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020\rH\u0016J\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020'0\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010.\u001a\u00020\"2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00100\u001a\u00020\"2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 Jq\u00101\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00110\u00102\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\u00102\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00102\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0082 J\u0006\u00102\u001a\u00020\u0019J\u0015\u00103\u001a\u00020\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0006\u00104\u001a\u00020\u0019J\u0015\u00105\u001a\u00020\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0006\u00106\u001a\u00020\u0019J\u0015\u00107\u001a\u00020\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020$0\u00102\u0006\u00109\u001a\u00020\rH\u0016J\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020$0\u00102\u0006\u00109\u001a\u00020\rH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00138F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010+\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010/\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b/\u0010-¨\u0006<"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTradeSessionHistoryTracker;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "eventId", "", "pageLimit", "", "maxPagesPerLoadMore", "primaryMarketSlugs", "Lkotlin/Function0;", "", "primaryMarketTypes", "", "historyStartTime", "Ljava/util/Date;", "onError", "Lkotlin/Function1;", "", "", "(Ljava/lang/String;IILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "sessions", "Lcom/polymarket/usviewmodels/USLiveTradeSession;", "getSessions", "()Ljava/util/List;", "Swift_sessions", "eof", "getEof", "()Z", "Swift_eof", "isLoadingMore", "Swift_isLoadingMore", "Swift_constructor_0", "refresh", "Swift_refresh_1", "loadMore", "Swift_loadMore_2", "suspend", "Swift_suspend_3", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class USLiveTradeSessionHistoryTracker implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public USLiveTradeSessionHistoryTracker(String str, int i, int i2, Function0<? extends Set<String>> function0, Function0<? extends List<String>> function02, Function0<? extends Date> function03, Function1<? super Throwable, Unit> function1) {
        str.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function1.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, i, i2, function0, function02, function03, function1);
    }

    private final native long Swift_constructor_0(String eventId, int pageLimit, int maxPagesPerLoadMore, Function0<? extends Set<String>> primaryMarketSlugs, Function0<? extends List<String>> primaryMarketTypes, Function0<? extends Date> historyStartTime, Function1<? super Throwable, Unit> onError);

    private final native boolean Swift_eof(long Swift_peer);

    private final native boolean Swift_isLoadingMore(long Swift_peer);

    private final native void Swift_loadMore_2(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_refresh_1(long Swift_peer);

    private final native void Swift_release(long Swift_peer);

    private final native List<USLiveTradeSession> Swift_sessions(long Swift_peer);

    private final native void Swift_suspend_3(long Swift_peer);

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

    public final boolean getEof() {
        return Swift_eof(this.Swift_peer);
    }

    public final List<USLiveTradeSession> getSessions() {
        return Swift_sessions(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isLoadingMore() {
        return Swift_isLoadingMore(this.Swift_peer);
    }

    public final void loadMore() {
        Swift_loadMore_2(this.Swift_peer);
    }

    public final void refresh() {
        Swift_refresh_1(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public final void suspend() {
        Swift_suspend_3(this.Swift_peer);
    }

    public USLiveTradeSessionHistoryTracker(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ USLiveTradeSessionHistoryTracker(String str, int i, int i2, Function0 function0, Function0 function02, Function0 function03, Function1 function1, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? 20 : i, (i3 & 4) != 0 ? 5 : i2, function0, function02, function03, function1);
    }
}
