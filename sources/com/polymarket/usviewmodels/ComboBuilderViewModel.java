package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.clients.ClientExperimentKey;
import com.polymarket.data.APIEventTag;
import com.polymarket.data.EComboLeg;
import com.polymarket.data.EComboLegDetail;
import com.polymarket.data.EComboQuote;
import com.polymarket.data.EEvent;
import com.polymarket.data.EMarket;
import com.polymarket.data.EQuantity;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.ace;
import defpackage.u85;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import io.radar.sdk.RadarTripOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Async;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u0000 \u0091\u00012\u00020\u0001:\u0010\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u001f\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010$\u001a\u0004\u0018\u00010!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010)\u001a\u0004\u0018\u00010&2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010.\u001a\u0004\u0018\u00010+2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u00102\u001a\b\u0012\u0004\u0012\u0002000\u00122\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00104\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u00108\u001a\b\u0012\u0004\u0012\u0002060\u00122\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010=\u001a\u00020:2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010A\u001a\b\u0012\u0004\u0012\u00020?0\u00122\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010F\u001a\u00020C2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010K\u001a\u00020H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010N\u001a\u00020H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010Q\u001a\u00020H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010V\u001a\u0004\u0018\u00010S2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0010\u0010W\u001a\u0004\u0018\u00010X2\u0006\u0010Y\u001a\u00020HJ\u001f\u0010Z\u001a\u0004\u0018\u00010X2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010[\u001a\u00020HH\u0082 J\u0006\u0010\\\u001a\u00020]J\u0015\u0010^\u001a\u00020]2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010a\u001a\u00020H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010d\u001a\u00020H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010j\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010k\u001a\u00020l2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010m\u001a\u00020\u001dH\u0082 J\u000e\u0010n\u001a\u00020lH\u0086@¢\u0006\u0002\u0010oJ#\u0010p\u001a\u00020l2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010q\u001a\b\u0012\u0004\u0012\u00020l0rH\u0082 J\u0006\u0010s\u001a\u00020lJ\u0015\u0010t\u001a\u00020l2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010u\u001a\u00020lH\u0016J\u0015\u0010v\u001a\u00020l2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010w\u001a\u00020x2\u0006\u0010y\u001a\u00020XJ\u001d\u0010z\u001a\u00020x2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010W\u001a\u00020XH\u0082 J\u0006\u0010{\u001a\u00020|J\u0015\u0010}\u001a\u00020|2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000f\u0010~\u001a\u00020l2\u0007\u0010\u007f\u001a\u00030\u0080\u0001J\u001f\u0010\u0081\u0001\u001a\u00020l2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0082 J\u001f\u0010\u0082\u0001\u001a\u00020l2\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0096@¢\u0006\u0003\u0010\u0084\u0001J3\u0010\u0085\u0001\u001a\u00020l2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010q\u001a\b\u0012\u0004\u0012\u00020l0rH\u0082 J\u0019\u0010\u0086\u0001\u001a\t\u0012\u0005\u0012\u00030\u0087\u00010r2\u0007\u0010\u0088\u0001\u001a\u00020:H\u0016J\u001a\u0010\u0089\u0001\u001a\t\u0012\u0005\u0012\u00030\u0087\u00010r2\u0007\u0010\u0088\u0001\u001a\u00020:H\u0082 R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001eR\u0013\u0010 \u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010%\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010*\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0015R\u0011\u00103\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b3\u0010\u001eR\u0017\u00105\u001a\b\u0012\u0004\u0012\u0002060\u00128F¢\u0006\u0006\u001a\u0004\b7\u0010\u0015R\u0011\u00109\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u00128F¢\u0006\u0006\u001a\u0004\b@\u0010\u0015R\u0011\u0010B\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0011\u0010G\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0011\u0010L\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bM\u0010JR\u0011\u0010O\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bP\u0010JR\u0013\u0010R\u001a\u0004\u0018\u00010S8F¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0011\u0010_\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\b`\u0010JR\u0011\u0010b\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bc\u0010JR$\u0010f\u001a\u00020\u001d2\u0006\u0010e\u001a\u00020\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bg\u0010\u001e\"\u0004\bh\u0010i¨\u0006\u0092\u0001"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "initialNavigation", "Lcom/polymarket/usviewmodels/ComboBuilderViewModel$InitialNavigation;", "(Lcom/polymarket/usviewmodels/ComboBuilderViewModel$InitialNavigation;)V", "eventListViewModel", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel;", "getEventListViewModel", "()Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel;", "Swift_eventListViewModel", "selectedLegs", "", "Lcom/polymarket/data/EComboLeg;", "getSelectedLegs", "()Ljava/util/List;", "Swift_selectedLegs", "currentPreview", "Lcom/polymarket/data/EComboQuote;", "getCurrentPreview", "()Lcom/polymarket/data/EComboQuote;", "Swift_currentPreview", "isPreviewLoading", "", "()Z", "Swift_isPreviewLoading", "maxLegsNotice", "Lcom/polymarket/usviewmodels/ComboBuilderViewModel$MaxLegsNotice;", "getMaxLegsNotice", "()Lcom/polymarket/usviewmodels/ComboBuilderViewModel$MaxLegsNotice;", "Swift_maxLegsNotice", "pendingAddConflictResolution", "Lcom/polymarket/usviewmodels/ComboBuilderViewModel$ComboConflictResolution;", "getPendingAddConflictResolution", "()Lcom/polymarket/usviewmodels/ComboBuilderViewModel$ComboConflictResolution;", "Swift_pendingAddConflictResolution", "playerPropsViewModel", "Lcom/polymarket/usviewmodels/PlayerPropsSheetViewModel;", "getPlayerPropsViewModel", "()Lcom/polymarket/usviewmodels/PlayerPropsSheetViewModel;", "Swift_playerPropsViewModel", "activeExperiments", "Lcom/polymarket/clients/ClientExperimentKey;", "getActiveExperiments", "Swift_activeExperiments", "isReceiptVisible", "Swift_isReceiptVisible", "receiptLegs", "Lcom/polymarket/data/EComboLegDetail;", "getReceiptLegs", "Swift_receiptLegs", "receiptMarketCount", "", "getReceiptMarketCount", "()I", "Swift_receiptMarketCount", "receiptLegGroups", "Lcom/polymarket/usviewmodels/ComboLegGroupPresentation;", "getReceiptLegGroups", "Swift_receiptLegGroups", "receiptPayoutMultiplier", "Lcom/polymarket/data/EQuantity;", "getReceiptPayoutMultiplier", "()Lcom/polymarket/data/EQuantity;", "Swift_receiptPayoutMultiplier", "receiptPayoutMultiplierText", "", "getReceiptPayoutMultiplierText", "()Ljava/lang/String;", "Swift_receiptPayoutMultiplierText", "receiptRateStakeText", "getReceiptRateStakeText", "Swift_receiptRateStakeText", "receiptRateReturnText", "getReceiptRateReturnText", "Swift_receiptRateReturnText", "singleLegSelection", "Lcom/polymarket/usviewmodels/ComboBuilderViewModel$ComboLegSelection;", "getSingleLegSelection", "()Lcom/polymarket/usviewmodels/ComboBuilderViewModel$ComboLegSelection;", "Swift_singleLegSelection", "event", "Lcom/polymarket/data/EEvent;", "forEventId", "Swift_event_0", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "makeCombo", "Lcom/polymarket/usviewmodels/Combo;", "Swift_makeCombo_1", "conflictAlertTitle", "getConflictAlertTitle", "Swift_conflictAlertTitle", "conflictAlertDismissTitle", "getConflictAlertDismissTitle", "Swift_conflictAlertDismissTitle", "newValue", "handlesAddConflictResolution", "getHandlesAddConflictResolution", "setHandlesAddConflictResolution", "(Z)V", "Swift_handlesAddConflictResolution", "Swift_handlesAddConflictResolution_set", "", "value", "confirmPendingAddConflictResolution", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Swift_callback_confirmPendingAddConflictResolution_2", "f_callback", "Lkotlin/Function0;", "dismissPendingAddConflictResolution", "Swift_dismissPendingAddConflictResolution_3", "setup", "Swift_setup_5", "makeEventDetailViewModel", "Lcom/polymarket/usviewmodels/ComboBuilderEventDetailViewModel;", "for_", "Swift_makeEventDetailViewModel_6", "makeSearchViewModel", "Lcom/polymarket/usviewmodels/CombosBuilderSearchViewModel;", "Swift_makeSearchViewModel_7", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/ComboBuilderViewModel$Input;", "Swift_sendInput_8", "applyAutofixedLegs", RadarTripOptions.KEY_LEGS, "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Swift_callback_applyAutofixedLegs_9", "Swift_projection", "", "options", "Swift_projectionImpl", "ComboLegSelection", "MaxLegsNotice", "ComboConflictResolution", "Callbacks", "InitialNavigation", "OriginatingEvent", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComboBuilderViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

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
            if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
                return false;
            }
            return true;
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
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
    }

    public ComboBuilderViewModel(InitialNavigation initialNavigation) {
        super(Companion.access$Swift_Companion_constructor_4(INSTANCE, initialNavigation), (SwiftPeerMarker) null);
    }

    private final native List<ClientExperimentKey> Swift_activeExperiments(long Swift_peer);

    private final native void Swift_callback_applyAutofixedLegs_9(long Swift_peer, List<EComboLeg> legs, Function0<Unit> f_callback);

    private final native void Swift_callback_confirmPendingAddConflictResolution_2(long Swift_peer, Function0<Unit> f_callback);

    private final native String Swift_conflictAlertDismissTitle(long Swift_peer);

    private final native String Swift_conflictAlertTitle(long Swift_peer);

    private final native EComboQuote Swift_currentPreview(long Swift_peer);

    private final native void Swift_dismissPendingAddConflictResolution_3(long Swift_peer);

    private final native ComboBuilderEventListViewModel Swift_eventListViewModel(long Swift_peer);

    private final native EEvent Swift_event_0(long Swift_peer, String id);

    private final native boolean Swift_handlesAddConflictResolution(long Swift_peer);

    private final native void Swift_handlesAddConflictResolution_set(long Swift_peer, boolean value);

    private final native boolean Swift_isPreviewLoading(long Swift_peer);

    private final native boolean Swift_isReceiptVisible(long Swift_peer);

    private final native Combo Swift_makeCombo_1(long Swift_peer);

    private final native ComboBuilderEventDetailViewModel Swift_makeEventDetailViewModel_6(long Swift_peer, EEvent event);

    private final native CombosBuilderSearchViewModel Swift_makeSearchViewModel_7(long Swift_peer);

    private final native MaxLegsNotice Swift_maxLegsNotice(long Swift_peer);

    private final native ComboConflictResolution Swift_pendingAddConflictResolution(long Swift_peer);

    private final native PlayerPropsSheetViewModel Swift_playerPropsViewModel(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native List<ComboLegGroupPresentation> Swift_receiptLegGroups(long Swift_peer);

    private final native List<EComboLegDetail> Swift_receiptLegs(long Swift_peer);

    private final native int Swift_receiptMarketCount(long Swift_peer);

    private final native EQuantity Swift_receiptPayoutMultiplier(long Swift_peer);

    private final native String Swift_receiptPayoutMultiplierText(long Swift_peer);

    private final native String Swift_receiptRateReturnText(long Swift_peer);

    private final native String Swift_receiptRateStakeText(long Swift_peer);

    private final native List<EComboLeg> Swift_selectedLegs(long Swift_peer);

    private final native void Swift_sendInput_8(long Swift_peer, Input input);

    private final native void Swift_setup_5(long Swift_peer);

    private final native ComboLegSelection Swift_singleLegSelection(long Swift_peer);

    public static final /* synthetic */ void access$Swift_callback_applyAutofixedLegs_9(ComboBuilderViewModel comboBuilderViewModel, long j, List list, Function0 function0) {
        comboBuilderViewModel.Swift_callback_applyAutofixedLegs_9(j, list, function0);
    }

    public static final /* synthetic */ void access$Swift_callback_confirmPendingAddConflictResolution_2(ComboBuilderViewModel comboBuilderViewModel, long j, Function0 function0) {
        comboBuilderViewModel.Swift_callback_confirmPendingAddConflictResolution_2(j, function0);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public Object applyAutofixedLegs(List<EComboLeg> list, Continuation<? super Unit> continuation) {
        Object run = Async.INSTANCE.run(new ComboBuilderViewModel$applyAutofixedLegs$2(this, list, null), continuation);
        if (run == u85.COROUTINE_SUSPENDED) {
            return run;
        }
        return Unit.INSTANCE;
    }

    public final Object confirmPendingAddConflictResolution(Continuation<? super Unit> continuation) {
        Object run = Async.INSTANCE.run(new ComboBuilderViewModel$confirmPendingAddConflictResolution$2(this, null), continuation);
        if (run == u85.COROUTINE_SUSPENDED) {
            return run;
        }
        return Unit.INSTANCE;
    }

    public final void dismissPendingAddConflictResolution() {
        Swift_dismissPendingAddConflictResolution_3(getSwift_peer());
    }

    public final EEvent event(String forEventId) {
        forEventId.getClass();
        return Swift_event_0(getSwift_peer(), forEventId);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public List<ClientExperimentKey> getActiveExperiments() {
        return Swift_activeExperiments(getSwift_peer());
    }

    public final String getConflictAlertDismissTitle() {
        return Swift_conflictAlertDismissTitle(getSwift_peer());
    }

    public final String getConflictAlertTitle() {
        return Swift_conflictAlertTitle(getSwift_peer());
    }

    public final EComboQuote getCurrentPreview() {
        return Swift_currentPreview(getSwift_peer());
    }

    public final ComboBuilderEventListViewModel getEventListViewModel() {
        return Swift_eventListViewModel(getSwift_peer());
    }

    public final boolean getHandlesAddConflictResolution() {
        return Swift_handlesAddConflictResolution(getSwift_peer());
    }

    public final MaxLegsNotice getMaxLegsNotice() {
        return Swift_maxLegsNotice(getSwift_peer());
    }

    public final ComboConflictResolution getPendingAddConflictResolution() {
        return Swift_pendingAddConflictResolution(getSwift_peer());
    }

    public final PlayerPropsSheetViewModel getPlayerPropsViewModel() {
        return Swift_playerPropsViewModel(getSwift_peer());
    }

    public final List<ComboLegGroupPresentation> getReceiptLegGroups() {
        return Swift_receiptLegGroups(getSwift_peer());
    }

    public final List<EComboLegDetail> getReceiptLegs() {
        return Swift_receiptLegs(getSwift_peer());
    }

    public final int getReceiptMarketCount() {
        return Swift_receiptMarketCount(getSwift_peer());
    }

    public final EQuantity getReceiptPayoutMultiplier() {
        return Swift_receiptPayoutMultiplier(getSwift_peer());
    }

    public final String getReceiptPayoutMultiplierText() {
        return Swift_receiptPayoutMultiplierText(getSwift_peer());
    }

    public final String getReceiptRateReturnText() {
        return Swift_receiptRateReturnText(getSwift_peer());
    }

    public final String getReceiptRateStakeText() {
        return Swift_receiptRateStakeText(getSwift_peer());
    }

    public final List<EComboLeg> getSelectedLegs() {
        return Swift_selectedLegs(getSwift_peer());
    }

    public final ComboLegSelection getSingleLegSelection() {
        return Swift_singleLegSelection(getSwift_peer());
    }

    public final boolean isPreviewLoading() {
        return Swift_isPreviewLoading(getSwift_peer());
    }

    public final boolean isReceiptVisible() {
        return Swift_isReceiptVisible(getSwift_peer());
    }

    public final Combo makeCombo() {
        return Swift_makeCombo_1(getSwift_peer());
    }

    public final ComboBuilderEventDetailViewModel makeEventDetailViewModel(EEvent for_) {
        for_.getClass();
        return Swift_makeEventDetailViewModel_6(getSwift_peer(), for_);
    }

    public final CombosBuilderSearchViewModel makeSearchViewModel() {
        return Swift_makeSearchViewModel_7(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_8(getSwift_peer(), input);
    }

    public final void setHandlesAddConflictResolution(boolean z) {
        Swift_handlesAddConflictResolution_set(getSwift_peer(), z);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_5(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderViewModel$InitialNavigation;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "EventCase", "TabCase", "Companion", "Lcom/polymarket/usviewmodels/ComboBuilderViewModel$InitialNavigation$EventCase;", "Lcom/polymarket/usviewmodels/ComboBuilderViewModel$InitialNavigation$TabCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class InitialNavigation implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderViewModel$InitialNavigation$EventCase;", "Lcom/polymarket/usviewmodels/ComboBuilderViewModel$InitialNavigation;", "associated0", "Lcom/polymarket/usviewmodels/ComboBuilderViewModel$OriginatingEvent;", "<init>", "(Lcom/polymarket/usviewmodels/ComboBuilderViewModel$OriginatingEvent;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/ComboBuilderViewModel$OriginatingEvent;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class EventCase extends InitialNavigation {
            private final OriginatingEvent associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EventCase(OriginatingEvent originatingEvent) {
                super(null);
                originatingEvent.getClass();
                this.associated0 = originatingEvent;
            }

            public final OriginatingEvent getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderViewModel$InitialNavigation$TabCase;", "Lcom/polymarket/usviewmodels/ComboBuilderViewModel$InitialNavigation;", "associated0", "Lcom/polymarket/data/APIEventTag;", "<init>", "(Lcom/polymarket/data/APIEventTag;)V", "getAssociated0", "()Lcom/polymarket/data/APIEventTag;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class TabCase extends InitialNavigation {
            private final APIEventTag associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TabCase(APIEventTag aPIEventTag) {
                super(null);
                aPIEventTag.getClass();
                this.associated0 = aPIEventTag;
            }

            public final APIEventTag getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ InitialNavigation(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderViewModel$InitialNavigation$Companion;", "", "<init>", "()V", "event", "Lcom/polymarket/usviewmodels/ComboBuilderViewModel$InitialNavigation;", "associated0", "Lcom/polymarket/usviewmodels/ComboBuilderViewModel$OriginatingEvent;", "tab", "Lcom/polymarket/data/APIEventTag;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InitialNavigation event(OriginatingEvent associated0) {
                associated0.getClass();
                return new EventCase(associated0);
            }

            public final InitialNavigation tab(APIEventTag associated0) {
                associated0.getClass();
                return new TabCase(associated0);
            }

            private Companion() {
            }
        }

        private InitialNavigation() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00162\u00020\u0001:\u0006\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnMarketSideSelectedCase", "OnRemoveLegCase", "OnClearAllCase", "OnOpenPlayerPropsCase", "OnDismissPlayerPropsCase", "Companion", "Lcom/polymarket/usviewmodels/ComboBuilderViewModel$Input$OnClearAllCase;", "Lcom/polymarket/usviewmodels/ComboBuilderViewModel$Input$OnDismissPlayerPropsCase;", "Lcom/polymarket/usviewmodels/ComboBuilderViewModel$Input$OnMarketSideSelectedCase;", "Lcom/polymarket/usviewmodels/ComboBuilderViewModel$Input$OnOpenPlayerPropsCase;", "Lcom/polymarket/usviewmodels/ComboBuilderViewModel$Input$OnRemoveLegCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onClearAll = new OnClearAllCase();
        private static final Input onDismissPlayerProps = new OnDismissPlayerPropsCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderViewModel$Input$OnClearAllCase;", "Lcom/polymarket/usviewmodels/ComboBuilderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnClearAllCase extends Input {
            public OnClearAllCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderViewModel$Input$OnDismissPlayerPropsCase;", "Lcom/polymarket/usviewmodels/ComboBuilderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDismissPlayerPropsCase extends Input {
            public OnDismissPlayerPropsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderViewModel$Input$OnMarketSideSelectedCase;", "Lcom/polymarket/usviewmodels/ComboBuilderViewModel$Input;", "associated0", "Lcom/polymarket/data/EMarket;", "associated1", "Lcom/polymarket/data/EMarket$MarketSide;", "associated2", "Lcom/polymarket/data/EEvent;", "associated3", "Lcom/polymarket/usviewmodels/ComboLegSource;", "<init>", "(Lcom/polymarket/data/EMarket;Lcom/polymarket/data/EMarket$MarketSide;Lcom/polymarket/data/EEvent;Lcom/polymarket/usviewmodels/ComboLegSource;)V", "getAssociated0", "()Lcom/polymarket/data/EMarket;", "getAssociated1", "()Lcom/polymarket/data/EMarket$MarketSide;", "getAssociated2", "()Lcom/polymarket/data/EEvent;", "getAssociated3", "()Lcom/polymarket/usviewmodels/ComboLegSource;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnMarketSideSelectedCase extends Input {
            private final EMarket associated0;
            private final EMarket.MarketSide associated1;
            private final EEvent associated2;
            private final ComboLegSource associated3;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnMarketSideSelectedCase(EMarket eMarket, EMarket.MarketSide marketSide, EEvent eEvent, ComboLegSource comboLegSource) {
                super(null);
                eMarket.getClass();
                marketSide.getClass();
                eEvent.getClass();
                comboLegSource.getClass();
                this.associated0 = eMarket;
                this.associated1 = marketSide;
                this.associated2 = eEvent;
                this.associated3 = comboLegSource;
            }

            public final EMarket getAssociated0() {
                return this.associated0;
            }

            public final EMarket.MarketSide getAssociated1() {
                return this.associated1;
            }

            public final EEvent getAssociated2() {
                return this.associated2;
            }

            public final ComboLegSource getAssociated3() {
                return this.associated3;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderViewModel$Input$OnOpenPlayerPropsCase;", "Lcom/polymarket/usviewmodels/ComboBuilderViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/PlayerPropsSheetRequest;", "<init>", "(Lcom/polymarket/usviewmodels/PlayerPropsSheetRequest;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/PlayerPropsSheetRequest;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnOpenPlayerPropsCase extends Input {
            private final PlayerPropsSheetRequest associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnOpenPlayerPropsCase(PlayerPropsSheetRequest playerPropsSheetRequest) {
                super(null);
                playerPropsSheetRequest.getClass();
                this.associated0 = playerPropsSheetRequest;
            }

            public final PlayerPropsSheetRequest getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderViewModel$Input$OnRemoveLegCase;", "Lcom/polymarket/usviewmodels/ComboBuilderViewModel$Input;", "associated0", "Lcom/polymarket/data/EComboLeg;", "<init>", "(Lcom/polymarket/data/EComboLeg;)V", "getAssociated0", "()Lcom/polymarket/data/EComboLeg;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRemoveLegCase extends Input {
            private final EComboLeg associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnRemoveLegCase(EComboLeg eComboLeg) {
                super(null);
                eComboLeg.getClass();
                this.associated0 = eComboLeg;
            }

            public final EComboLeg getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnClearAll$cp() {
            return onClearAll;
        }

        public static final /* synthetic */ Input access$getOnDismissPlayerProps$cp() {
            return onDismissPlayerProps;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0014R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderViewModel$Input$Companion;", "", "<init>", "()V", "onMarketSideSelected", "Lcom/polymarket/usviewmodels/ComboBuilderViewModel$Input;", "associated0", "Lcom/polymarket/data/EMarket;", "associated1", "Lcom/polymarket/data/EMarket$MarketSide;", "associated2", "Lcom/polymarket/data/EEvent;", "associated3", "Lcom/polymarket/usviewmodels/ComboLegSource;", "onRemoveLeg", "Lcom/polymarket/data/EComboLeg;", "onClearAll", "getOnClearAll", "()Lcom/polymarket/usviewmodels/ComboBuilderViewModel$Input;", "onOpenPlayerProps", "Lcom/polymarket/usviewmodels/PlayerPropsSheetRequest;", "onDismissPlayerProps", "getOnDismissPlayerProps", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnClearAll() {
                return Input.access$getOnClearAll$cp();
            }

            public final Input getOnDismissPlayerProps() {
                return Input.access$getOnDismissPlayerProps$cp();
            }

            public final Input onMarketSideSelected(EMarket associated0, EMarket.MarketSide associated1, EEvent associated2, ComboLegSource associated3) {
                associated0.getClass();
                associated1.getClass();
                associated2.getClass();
                associated3.getClass();
                return new OnMarketSideSelectedCase(associated0, associated1, associated2, associated3);
            }

            public final Input onOpenPlayerProps(PlayerPropsSheetRequest associated0) {
                associated0.getClass();
                return new OnOpenPlayerPropsCase(associated0);
            }

            public final Input onRemoveLeg(EComboLeg associated0) {
                associated0.getClass();
                return new OnRemoveLegCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0082 ¨\u0006\t"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_4", "", "Lskip/bridge/SwiftObjectPointer;", "initialNavigation", "Lcom/polymarket/usviewmodels/ComboBuilderViewModel$InitialNavigation;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_4(InitialNavigation initialNavigation);

        public static final /* synthetic */ long access$Swift_Companion_constructor_4(Companion companion, InitialNavigation initialNavigation) {
            return companion.Swift_Companion_constructor_4(initialNavigation);
        }

        private Companion() {
        }
    }

    public ComboBuilderViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    public /* synthetic */ ComboBuilderViewModel(InitialNavigation initialNavigation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : initialNavigation);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\b\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u0015\u0010\u0017\u001a\u00020\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0015\u0010 \u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010#\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010&\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J%\u0010'\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001b0)2\u0006\u0010*\u001a\u00020\u001dH\u0016J\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001b0)2\u0006\u0010*\u001a\u00020\u001dH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006-"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderViewModel$ComboLegSelection;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "market", "Lcom/polymarket/data/EMarket;", "marketSide", "Lcom/polymarket/data/EMarket$MarketSide;", "event", "Lcom/polymarket/data/EEvent;", "(Lcom/polymarket/data/EMarket;Lcom/polymarket/data/EMarket$MarketSide;Lcom/polymarket/data/EEvent;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getMarket", "()Lcom/polymarket/data/EMarket;", "Swift_market", "getMarketSide", "()Lcom/polymarket/data/EMarket$MarketSide;", "Swift_marketSide", "getEvent", "()Lcom/polymarket/data/EEvent;", "Swift_event", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class ComboLegSelection implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public ComboLegSelection(EMarket eMarket, EMarket.MarketSide marketSide, EEvent eEvent) {
            ace.z(eEvent, eMarket, marketSide);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(eMarket, marketSide, eEvent);
        }

        private final native long Swift_constructor_0(EMarket market, EMarket.MarketSide marketSide, EEvent event);

        private final native EEvent Swift_event(long Swift_peer);

        private final native EMarket Swift_market(long Swift_peer);

        private final native EMarket.MarketSide Swift_marketSide(long Swift_peer);

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
            if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
                return false;
            }
            return true;
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final EEvent getEvent() {
            return Swift_event(this.Swift_peer);
        }

        public final EMarket getMarket() {
            return Swift_market(this.Swift_peer);
        }

        public final EMarket.MarketSide getMarketSide() {
            return Swift_marketSide(this.Swift_peer);
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

        public ComboLegSelection(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016J\u0015\u0010\u0019\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001c\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001d\u0010\u001d\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0082 J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\u0019\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0000H\u0082 J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020!0&2\u0006\u0010'\u001a\u00020\rH\u0016J\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020!0&2\u0006\u0010'\u001a\u00020\rH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderViewModel$MaxLegsNotice;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "message", "", "shakeToken", "", "(Ljava/lang/String;I)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "getMessage", "()Ljava/lang/String;", "Swift_message", "getShakeToken", "()I", "Swift_shakeToken", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class MaxLegsNotice implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public MaxLegsNotice(String str, int i) {
            str.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, i);
        }

        private final native long Swift_constructor_0(String message, int shakeToken);

        private final native boolean Swift_isequal(MaxLegsNotice lhs, MaxLegsNotice rhs);

        private final native String Swift_message(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native int Swift_shakeToken(long Swift_peer);

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
            if (!(other instanceof MaxLegsNotice)) {
                return false;
            }
            return Swift_isequal(this, (MaxLegsNotice) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getMessage() {
            return Swift_message(this.Swift_peer);
        }

        public final int getShakeToken() {
            return Swift_shakeToken(this.Swift_peer);
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

        public MaxLegsNotice(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB%\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\b\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u0015\u0010\u0017\u001a\u00020\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0018\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0015\u0010\u001f\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010!\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010$\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J'\u0010%\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0082 J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0'2\u0006\u0010(\u001a\u00020\u001cH\u0016J\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001a0'2\u0006\u0010(\u001a\u00020\u001cH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006+"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderViewModel$OriginatingEvent;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "event", "Lcom/polymarket/data/EEvent;", "isLoadedForPreseeding", "", "preselectedMarketSide", "Lcom/polymarket/data/EMarket$MarketSide;", "(Lcom/polymarket/data/EEvent;ZLcom/polymarket/data/EMarket$MarketSide;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "other", "", "hashCode", "", "getEvent", "()Lcom/polymarket/data/EEvent;", "Swift_event", "()Z", "Swift_isLoadedForPreseeding", "getPreselectedMarketSide", "()Lcom/polymarket/data/EMarket$MarketSide;", "Swift_preselectedMarketSide", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class OriginatingEvent implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public OriginatingEvent(EEvent eEvent, boolean z, EMarket.MarketSide marketSide) {
            eEvent.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(eEvent, z, marketSide);
        }

        private final native long Swift_constructor_0(EEvent event, boolean isLoadedForPreseeding, EMarket.MarketSide preselectedMarketSide);

        private final native EEvent Swift_event(long Swift_peer);

        private final native boolean Swift_isLoadedForPreseeding(long Swift_peer);

        private final native EMarket.MarketSide Swift_preselectedMarketSide(long Swift_peer);

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
            if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
                return false;
            }
            return true;
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final EEvent getEvent() {
            return Swift_event(this.Swift_peer);
        }

        public final EMarket.MarketSide getPreselectedMarketSide() {
            return Swift_preselectedMarketSide(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final boolean isLoadedForPreseeding() {
            return Swift_isLoadedForPreseeding(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public OriginatingEvent(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ OriginatingEvent(EEvent eEvent, boolean z, EMarket.MarketSide marketSide, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(eEvent, z, (i & 4) != 0 ? null : marketSide);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB;\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\b\u0010\u0012J\u0006\u0010\u0017\u001a\u00020\u0018J\u0015\u0010\u0019\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010%\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J?\u0010&\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082 J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0096\u0002J\u0019\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0000H\u0082 J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020*0/2\u0006\u00100\u001a\u00020\u001bH\u0016J\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020*0/2\u0006\u00100\u001a\u00020\u001bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u00063"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderViewModel$ComboConflictResolution;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "currentLegs", "", "Lcom/polymarket/data/EComboLegDetail;", "newLegs", "autofixedLegs", "Lcom/polymarket/data/EComboLeg;", "message", "", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getCurrentLegs", "()Ljava/util/List;", "Swift_currentLegs", "getNewLegs", "Swift_newLegs", "getAutofixedLegs", "Swift_autofixedLegs", "getMessage", "()Ljava/lang/String;", "Swift_message", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ComboConflictResolution implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public ComboConflictResolution(List<EComboLegDetail> list, List<EComboLegDetail> list2, List<EComboLeg> list3, String str) {
            list.getClass();
            list2.getClass();
            list3.getClass();
            str.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(list, list2, list3, str);
        }

        private final native List<EComboLeg> Swift_autofixedLegs(long Swift_peer);

        private final native long Swift_constructor_0(List<EComboLegDetail> currentLegs, List<EComboLegDetail> newLegs, List<EComboLeg> autofixedLegs, String message);

        private final native List<EComboLegDetail> Swift_currentLegs(long Swift_peer);

        private final native boolean Swift_isequal(ComboConflictResolution lhs, ComboConflictResolution rhs);

        private final native String Swift_message(long Swift_peer);

        private final native List<EComboLegDetail> Swift_newLegs(long Swift_peer);

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
            if (!(other instanceof ComboConflictResolution)) {
                return false;
            }
            return Swift_isequal(this, (ComboConflictResolution) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final List<EComboLeg> getAutofixedLegs() {
            return Swift_autofixedLegs(this.Swift_peer);
        }

        public final List<EComboLegDetail> getCurrentLegs() {
            return Swift_currentLegs(this.Swift_peer);
        }

        public final String getMessage() {
            return Swift_message(this.Swift_peer);
        }

        public final List<EComboLegDetail> getNewLegs() {
            return Swift_newLegs(this.Swift_peer);
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

        public ComboConflictResolution(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
