package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.APIEventTag;
import com.polymarket.data.EHub;
import com.polymarket.usviewmodels.AppViewModel;
import com.polymarket.usviewmodels.USEventCardViewModel;
import defpackage.dmk;
import defpackage.hrj;
import defpackage.kw5;
import defpackage.u85;
import defpackage.ug7;
import defpackage.ww4;
import defpackage.zei;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MainActor;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 \u0096\u00012\u00020\u0001:\b\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB%\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0007\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J!\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J)\u0010\u001d\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0082 J\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010'\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150 H\u0082 J\u0015\u0010-\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010.\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001f\u001a\u00020(H\u0082 J\u0015\u00101\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u00102\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001f\u001a\u00020(H\u0082 J\u0015\u00105\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u00106\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001f\u001a\u00020(H\u0082 J\u0015\u0010=\u001a\u0002072\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010>\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001f\u001a\u000207H\u0082 J\u0015\u0010B\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010C\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001f\u001a\u00020(H\u0082 J\u0015\u0010F\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010G\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001f\u001a\u00020(H\u0082 J\u001b\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00160 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010L\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010O\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010T\u001a\b\u0012\u0004\u0012\u00020P0 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010U\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020P0 H\u0082 J\u0015\u0010Y\u001a\u0002072\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010Z\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001f\u001a\u000207H\u0082 J\u0015\u0010]\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010^\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001f\u001a\u00020(H\u0082 J\u0015\u0010a\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010e\u001a\u0004\u0018\u00010P2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00150 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010k\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010m\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010q\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010t\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010w\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010|\u001a\u0004\u0018\u00010y2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u007f\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0010\u0010\u0080\u0001\u001a\u00020\u001e2\u0007\u0010\u0081\u0001\u001a\u000207J\u001f\u0010\u0082\u0001\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\u0081\u0001\u001a\u000207H\u0082 J\u0010\u0010\u0083\u0001\u001a\u00020\u001e2\u0007\u0010\u0084\u0001\u001a\u00020\u0015J\u001f\u0010\u0085\u0001\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\u0084\u0001\u001a\u00020\u0015H\u0082 J\t\u0010\u0086\u0001\u001a\u00020\u001eH\u0016J\u0016\u0010\u0087\u0001\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0011\u0010\u0088\u0001\u001a\u00020\u001e2\b\u0010\u0089\u0001\u001a\u00030\u008a\u0001J \u0010\u008b\u0001\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0089\u0001\u001a\u00030\u008a\u0001H\u0082 J\u000f\u0010\u008c\u0001\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u008d\u0001\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0082 J\u001a\u0010\u008e\u0001\u001a\n\u0012\u0005\u0012\u00030\u0090\u00010\u008f\u00012\u0007\u0010\u0091\u0001\u001a\u000207H\u0016J\u001b\u0010\u0092\u0001\u001a\n\u0012\u0005\u0012\u00030\u0090\u00010\u008f\u00012\u0007\u0010\u0091\u0001\u001a\u000207H\u0082 R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R<\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR0\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150 2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010)\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010/\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R$\u00103\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010*\"\u0004\b4\u0010,R$\u00108\u001a\u0002072\u0006\u0010\u0013\u001a\u0002078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010?\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010*\"\u0004\bA\u0010,R$\u0010D\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010*\"\u0004\bE\u0010,R\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00160 8F¢\u0006\u0006\u001a\u0004\bI\u0010#R\u0011\u0010K\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bK\u0010*R\u0011\u0010M\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bN\u0010*R0\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0 2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020P0 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010#\"\u0004\bS\u0010%R$\u0010V\u001a\u0002072\u0006\u0010\u0013\u001a\u0002078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010:\"\u0004\bX\u0010<R$\u0010[\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010*\"\u0004\b\\\u0010,R\u0011\u0010_\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b`\u0010*R\u0013\u0010b\u001a\u0004\u0018\u00010P8F¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0017\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00150 8F¢\u0006\u0006\u001a\u0004\bg\u0010#R\u0011\u0010i\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bj\u0010*R\u0011\u0010l\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bl\u0010*R\u0011\u0010n\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0011\u0010r\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bs\u0010pR\u0011\u0010u\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bv\u0010pR\u0013\u0010x\u001a\u0004\u0018\u00010y8F¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b}\u0010~¨\u0006\u0097\u0001"}, d2 = {"Lcom/polymarket/usviewmodels/USTagCategoryViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "tab", "Lcom/polymarket/data/APIEventTag;", "presentationContext", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel$PresentationContext;", "callbacks", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Callbacks;", "(Lcom/polymarket/data/APIEventTag;Lcom/polymarket/usviewmodels/USTagCategoryViewModel$PresentationContext;Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Callbacks;)V", "getTab", "()Lcom/polymarket/data/APIEventTag;", "Swift_tab", "newValue", "", "", "Lcom/polymarket/usviewmodels/USEventCardViewModel;", "eventViewModelsById", "getEventViewModelsById", "()Ljava/util/Map;", "setEventViewModelsById", "(Ljava/util/Map;)V", "Swift_eventViewModelsById", "Swift_eventViewModelsById_set", "", "value", "", "eventViewModelIds", "getEventViewModelIds", "()Ljava/util/List;", "setEventViewModelIds", "(Ljava/util/List;)V", "Swift_eventViewModelIds", "Swift_eventViewModelIds_set", "", "isLoading", "()Z", "setLoading", "(Z)V", "Swift_isLoading", "Swift_isLoading_set", "isRefreshing", "setRefreshing", "Swift_isRefreshing", "Swift_isRefreshing_set", "isRetrying", "setRetrying", "Swift_isRetrying", "Swift_isRetrying_set", "", "scrollToTopTrigger", "getScrollToTopTrigger", "()I", "setScrollToTopTrigger", "(I)V", "Swift_scrollToTopTrigger", "Swift_scrollToTopTrigger_set", "hasMore", "getHasMore", "setHasMore", "Swift_hasMore", "Swift_hasMore_set", "isLoadingMore", "setLoadingMore", "Swift_isLoadingMore", "Swift_isLoadingMore_set", "orderedEventViewModels", "getOrderedEventViewModels", "Swift_orderedEventViewModels", "isEmpty", "Swift_isEmpty", "shouldShowEvents", "getShouldShowEvents", "Swift_shouldShowEvents", "Lcom/polymarket/usviewmodels/SportsCategoryPill;", "pills", "getPills", "setPills", "Swift_pills", "Swift_pills_set", "selectedPillIndex", "getSelectedPillIndex", "setSelectedPillIndex", "Swift_selectedPillIndex", "Swift_selectedPillIndex_set", "isLoadingPillEvents", "setLoadingPillEvents", "Swift_isLoadingPillEvents", "Swift_isLoadingPillEvents_set", "showPillBar", "getShowPillBar", "Swift_showPillBar", "selectedPill", "getSelectedPill", "()Lcom/polymarket/usviewmodels/SportsCategoryPill;", "Swift_selectedPill", "currentEventViewModelIds", "getCurrentEventViewModelIds", "Swift_currentEventViewModelIds", "currentHasMore", "getCurrentHasMore", "Swift_currentHasMore", "isInitialLoading", "Swift_isInitialLoading", "emptyTitle", "getEmptyTitle", "()Ljava/lang/String;", "Swift_emptyTitle", "emptySubtitle", "getEmptySubtitle", "Swift_emptySubtitle", "refreshButtonTitle", "getRefreshButtonTitle", "Swift_refreshButtonTitle", "hubEntry", "Lcom/polymarket/data/EHub;", "getHubEntry", "()Lcom/polymarket/data/EHub;", "Swift_hubEntry", "getPresentationContext", "()Lcom/polymarket/usviewmodels/USTagCategoryViewModel$PresentationContext;", "Swift_presentationContext", "selectPillAtIndex", "index", "Swift_selectPillAtIndex_1", "applyDeeplinkSubtab", "subtab", "Swift_applyDeeplinkSubtab_2", "setup", "Swift_setup_3", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input;", "Swift_sendInput_4", "setCallbacks", "Swift_setCallbacks_5", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Callbacks", "PresentationContext", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class USTagCategoryViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/USTagCategoryViewModel$PresentationContext;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "homeSection", "standalone", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class PresentationContext implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ PresentationContext[] $VALUES;
        public static final PresentationContext homeSection = new PresentationContext("homeSection", 0);
        public static final PresentationContext standalone = new PresentationContext("standalone", 1);

        private static final /* synthetic */ PresentationContext[] $values() {
            return new PresentationContext[]{homeSection, standalone};
        }

        static {
            PresentationContext[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private PresentationContext(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static PresentationContext valueOf(String str) {
            return (PresentationContext) Enum.valueOf(PresentationContext.class, str);
        }

        public static PresentationContext[] values() {
            return (PresentationContext[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    public /* synthetic */ USTagCategoryViewModel(APIEventTag aPIEventTag, PresentationContext presentationContext, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aPIEventTag, (i & 2) != 0 ? PresentationContext.standalone : presentationContext, (i & 4) != 0 ? new Callbacks(null, null, null, null, 15, null) : callbacks);
    }

    private final native void Swift_applyDeeplinkSubtab_2(long Swift_peer, String subtab);

    private final native List<String> Swift_currentEventViewModelIds(long Swift_peer);

    private final native boolean Swift_currentHasMore(long Swift_peer);

    private final native String Swift_emptySubtitle(long Swift_peer);

    private final native String Swift_emptyTitle(long Swift_peer);

    private final native List<String> Swift_eventViewModelIds(long Swift_peer);

    private final native void Swift_eventViewModelIds_set(long Swift_peer, List<String> value);

    private final native Map<String, USEventCardViewModel> Swift_eventViewModelsById(long Swift_peer);

    private final native void Swift_eventViewModelsById_set(long Swift_peer, Map<String, USEventCardViewModel> value);

    private final native boolean Swift_hasMore(long Swift_peer);

    private final native void Swift_hasMore_set(long Swift_peer, boolean value);

    private final native EHub Swift_hubEntry(long Swift_peer);

    private final native boolean Swift_isEmpty(long Swift_peer);

    private final native boolean Swift_isInitialLoading(long Swift_peer);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native boolean Swift_isLoadingMore(long Swift_peer);

    private final native void Swift_isLoadingMore_set(long Swift_peer, boolean value);

    private final native boolean Swift_isLoadingPillEvents(long Swift_peer);

    private final native void Swift_isLoadingPillEvents_set(long Swift_peer, boolean value);

    private final native void Swift_isLoading_set(long Swift_peer, boolean value);

    private final native boolean Swift_isRefreshing(long Swift_peer);

    private final native void Swift_isRefreshing_set(long Swift_peer, boolean value);

    private final native boolean Swift_isRetrying(long Swift_peer);

    private final native void Swift_isRetrying_set(long Swift_peer, boolean value);

    private final native List<USEventCardViewModel> Swift_orderedEventViewModels(long Swift_peer);

    private final native List<SportsCategoryPill> Swift_pills(long Swift_peer);

    private final native void Swift_pills_set(long Swift_peer, List<SportsCategoryPill> value);

    private final native PresentationContext Swift_presentationContext(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_refreshButtonTitle(long Swift_peer);

    private final native int Swift_scrollToTopTrigger(long Swift_peer);

    private final native void Swift_scrollToTopTrigger_set(long Swift_peer, int value);

    private final native void Swift_selectPillAtIndex_1(long Swift_peer, int index);

    private final native SportsCategoryPill Swift_selectedPill(long Swift_peer);

    private final native int Swift_selectedPillIndex(long Swift_peer);

    private final native void Swift_selectedPillIndex_set(long Swift_peer, int value);

    private final native void Swift_sendInput_4(long Swift_peer, Input input);

    private final native void Swift_setCallbacks_5(long Swift_peer, Callbacks callbacks);

    private final native void Swift_setup_3(long Swift_peer);

    private final native boolean Swift_shouldShowEvents(long Swift_peer);

    private final native boolean Swift_showPillBar(long Swift_peer);

    private final native APIEventTag Swift_tab(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final void applyDeeplinkSubtab(String subtab) {
        subtab.getClass();
        Swift_applyDeeplinkSubtab_2(getSwift_peer(), subtab);
    }

    public final List<String> getCurrentEventViewModelIds() {
        return Swift_currentEventViewModelIds(getSwift_peer());
    }

    public final boolean getCurrentHasMore() {
        return Swift_currentHasMore(getSwift_peer());
    }

    public final String getEmptySubtitle() {
        return Swift_emptySubtitle(getSwift_peer());
    }

    public final String getEmptyTitle() {
        return Swift_emptyTitle(getSwift_peer());
    }

    public final List<String> getEventViewModelIds() {
        return Swift_eventViewModelIds(getSwift_peer());
    }

    public final Map<String, USEventCardViewModel> getEventViewModelsById() {
        return Swift_eventViewModelsById(getSwift_peer());
    }

    public final boolean getHasMore() {
        return Swift_hasMore(getSwift_peer());
    }

    public final EHub getHubEntry() {
        return Swift_hubEntry(getSwift_peer());
    }

    public final List<USEventCardViewModel> getOrderedEventViewModels() {
        return Swift_orderedEventViewModels(getSwift_peer());
    }

    public final List<SportsCategoryPill> getPills() {
        return Swift_pills(getSwift_peer());
    }

    public final PresentationContext getPresentationContext() {
        return Swift_presentationContext(getSwift_peer());
    }

    public final String getRefreshButtonTitle() {
        return Swift_refreshButtonTitle(getSwift_peer());
    }

    public final int getScrollToTopTrigger() {
        return Swift_scrollToTopTrigger(getSwift_peer());
    }

    public final SportsCategoryPill getSelectedPill() {
        return Swift_selectedPill(getSwift_peer());
    }

    public final int getSelectedPillIndex() {
        return Swift_selectedPillIndex(getSwift_peer());
    }

    public final boolean getShouldShowEvents() {
        return Swift_shouldShowEvents(getSwift_peer());
    }

    public final boolean getShowPillBar() {
        return Swift_showPillBar(getSwift_peer());
    }

    public final APIEventTag getTab() {
        return Swift_tab(getSwift_peer());
    }

    public final boolean isEmpty() {
        return Swift_isEmpty(getSwift_peer());
    }

    public final boolean isInitialLoading() {
        return Swift_isInitialLoading(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final boolean isLoadingMore() {
        return Swift_isLoadingMore(getSwift_peer());
    }

    public final boolean isLoadingPillEvents() {
        return Swift_isLoadingPillEvents(getSwift_peer());
    }

    public final boolean isRefreshing() {
        return Swift_isRefreshing(getSwift_peer());
    }

    public final boolean isRetrying() {
        return Swift_isRetrying(getSwift_peer());
    }

    public final void selectPillAtIndex(int index) {
        Swift_selectPillAtIndex_1(getSwift_peer(), index);
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_4(getSwift_peer(), input);
    }

    public final void setCallbacks(Callbacks callbacks) {
        callbacks.getClass();
        Swift_setCallbacks_5(getSwift_peer(), callbacks);
    }

    public final void setEventViewModelIds(List<String> list) {
        list.getClass();
        Swift_eventViewModelIds_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setEventViewModelsById(Map<String, USEventCardViewModel> map) {
        map.getClass();
        Swift_eventViewModelsById_set(getSwift_peer(), (Map) StructKt.sref$default(map, null, 1, null));
    }

    public final void setHasMore(boolean z) {
        Swift_hasMore_set(getSwift_peer(), z);
    }

    public final void setLoading(boolean z) {
        Swift_isLoading_set(getSwift_peer(), z);
    }

    public final void setLoadingMore(boolean z) {
        Swift_isLoadingMore_set(getSwift_peer(), z);
    }

    public final void setLoadingPillEvents(boolean z) {
        Swift_isLoadingPillEvents_set(getSwift_peer(), z);
    }

    public final void setPills(List<SportsCategoryPill> list) {
        list.getClass();
        Swift_pills_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setRefreshing(boolean z) {
        Swift_isRefreshing_set(getSwift_peer(), z);
    }

    public final void setRetrying(boolean z) {
        Swift_isRetrying_set(getSwift_peer(), z);
    }

    public final void setScrollToTopTrigger(int i) {
        Swift_scrollToTopTrigger_set(getSwift_peer(), i);
    }

    public final void setSelectedPillIndex(int i) {
        Swift_selectedPillIndex_set(getSwift_peer(), i);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_3(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001b2\u00020\u0001:\u000b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\n\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnPullToRefreshCase", "OnRetryCase", "OnScrollToTopCase", "OnRequestReloadIfNeededCase", "EnableRealTimeUpdatesCase", "DisableRealTimeUpdatesCase", "OnNearBottomCase", "OnEventSelectedCase", "OnHubCardTappedCase", "Companion", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input$DisableRealTimeUpdatesCase;", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input$EnableRealTimeUpdatesCase;", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input$OnEventSelectedCase;", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input$OnHubCardTappedCase;", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input$OnNearBottomCase;", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input$OnPullToRefreshCase;", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input$OnRequestReloadIfNeededCase;", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input$OnScrollToTopCase;", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input$OnViewDidLoadCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onPullToRefresh = new OnPullToRefreshCase();
        private static final Input onRetry = new OnRetryCase();
        private static final Input onScrollToTop = new OnScrollToTopCase();
        private static final Input enableRealTimeUpdates = new EnableRealTimeUpdatesCase();
        private static final Input disableRealTimeUpdates = new DisableRealTimeUpdatesCase();
        private static final Input onNearBottom = new OnNearBottomCase();
        private static final Input onHubCardTapped = new OnHubCardTappedCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input$DisableRealTimeUpdatesCase;", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class DisableRealTimeUpdatesCase extends Input {
            public DisableRealTimeUpdatesCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input$EnableRealTimeUpdatesCase;", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class EnableRealTimeUpdatesCase extends Input {
            public EnableRealTimeUpdatesCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input$OnEventSelectedCase;", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnEventSelectedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnEventSelectedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input$OnHubCardTappedCase;", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnHubCardTappedCase extends Input {
            public OnHubCardTappedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input$OnNearBottomCase;", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnNearBottomCase extends Input {
            public OnNearBottomCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input$OnPullToRefreshCase;", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPullToRefreshCase extends Input {
            public OnPullToRefreshCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input$OnRequestReloadIfNeededCase;", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/ReloadReason;", "<init>", "(Lcom/polymarket/usviewmodels/ReloadReason;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/ReloadReason;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRequestReloadIfNeededCase extends Input {
            private final ReloadReason associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnRequestReloadIfNeededCase(ReloadReason reloadReason) {
                super(null);
                reloadReason.getClass();
                this.associated0 = reloadReason;
            }

            public final ReloadReason getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRetryCase extends Input {
            public OnRetryCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input$OnScrollToTopCase;", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnScrollToTopCase extends Input {
            public OnScrollToTopCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidLoadCase extends Input {
            public OnViewDidLoadCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getDisableRealTimeUpdates$cp() {
            return disableRealTimeUpdates;
        }

        public static final /* synthetic */ Input access$getEnableRealTimeUpdates$cp() {
            return enableRealTimeUpdates;
        }

        public static final /* synthetic */ Input access$getOnHubCardTapped$cp() {
            return onHubCardTapped;
        }

        public static final /* synthetic */ Input access$getOnNearBottom$cp() {
            return onNearBottom;
        }

        public static final /* synthetic */ Input access$getOnPullToRefresh$cp() {
            return onPullToRefresh;
        }

        public static final /* synthetic */ Input access$getOnRetry$cp() {
            return onRetry;
        }

        public static final /* synthetic */ Input access$getOnScrollToTop$cp() {
            return onScrollToTop;
        }

        public static final /* synthetic */ Input access$getOnViewDidLoad$cp() {
            return onViewDidLoad;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Input;", "onPullToRefresh", "getOnPullToRefresh", "onRetry", "getOnRetry", "onScrollToTop", "getOnScrollToTop", "onRequestReloadIfNeeded", "associated0", "Lcom/polymarket/usviewmodels/ReloadReason;", "enableRealTimeUpdates", "getEnableRealTimeUpdates", "disableRealTimeUpdates", "getDisableRealTimeUpdates", "onNearBottom", "getOnNearBottom", "onEventSelected", "", "onHubCardTapped", "getOnHubCardTapped", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getDisableRealTimeUpdates() {
                return Input.access$getDisableRealTimeUpdates$cp();
            }

            public final Input getEnableRealTimeUpdates() {
                return Input.access$getEnableRealTimeUpdates$cp();
            }

            public final Input getOnHubCardTapped() {
                return Input.access$getOnHubCardTapped$cp();
            }

            public final Input getOnNearBottom() {
                return Input.access$getOnNearBottom$cp();
            }

            public final Input getOnPullToRefresh() {
                return Input.access$getOnPullToRefresh$cp();
            }

            public final Input getOnRetry() {
                return Input.access$getOnRetry$cp();
            }

            public final Input getOnScrollToTop() {
                return Input.access$getOnScrollToTop$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input onEventSelected(String associated0) {
                associated0.getClass();
                return new OnEventSelectedCase(associated0);
            }

            public final Input onRequestReloadIfNeeded(ReloadReason associated0) {
                associated0.getClass();
                return new OnRequestReloadIfNeededCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0082 J\u0006\u0010\r\u001a\u00020\u000eJ\t\u0010\u000f\u001a\u00020\u000eH\u0082 ¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "tab", "Lcom/polymarket/data/APIEventTag;", "presentationContext", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel$PresentationContext;", "callbacks", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/USTagCategoryViewModel;", "Swift_Companion_mock_6", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(APIEventTag tab, PresentationContext presentationContext, Callbacks callbacks);

        private final native USTagCategoryViewModel Swift_Companion_mock_6();

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, APIEventTag aPIEventTag, PresentationContext presentationContext, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(aPIEventTag, presentationContext, callbacks);
        }

        public final USTagCategoryViewModel mock() {
            return Swift_Companion_mock_6();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB_\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u001e\b\u0002\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\b\u0010\u0014J\u0006\u0010\u0019\u001a\u00020\u000fJ\u0015\u0010\u001a\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0015\u0010\"\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J0\u0010%\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010&J!\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J`\u0010+\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\r2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\rH\u0082 ¢\u0006\u0002\u0010,J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00100.2\u0006\u0010/\u001a\u00020\u001fH\u0016J\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u00100.2\u0006\u0010/\u001a\u00020\u001fH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010!R'\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\r8F¢\u0006\u0006\u001a\u0004\b'\u0010$R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\r8F¢\u0006\u0006\u001a\u0004\b)\u0010$¨\u00062"}, d2 = {"Lcom/polymarket/usviewmodels/USTagCategoryViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "sportsEventCallbacks", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Callbacks;", "onPullToRefresh", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "onHubSelected", "", "onHubEntryAppeared", "(Lcom/polymarket/usviewmodels/USEventCardViewModel$Callbacks;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "hashCode", "", "getSportsEventCallbacks", "()Lcom/polymarket/usviewmodels/USEventCardViewModel$Callbacks;", "Swift_sportsEventCallbacks", "getOnPullToRefresh", "()Lkotlin/jvm/functions/Function1;", "Swift_onPullToRefresh", "(J)Lkotlin/jvm/functions/Function1;", "getOnHubSelected", "Swift_onHubSelected", "getOnHubEntryAppeared", "Swift_onHubEntryAppeared", "Swift_constructor_0", "(Lcom/polymarket/usviewmodels/USEventCardViewModel$Callbacks;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)J", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Callbacks(USEventCardViewModel.Callbacks callbacks, Function1 function1, Function1 function12, Function1 function13, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(callbacks, function1, r0, r1);
            Function1 function14;
            Function1 function15;
            callbacks = (i & 1) != 0 ? new USEventCardViewModel.Callbacks(null, null, null, null, null, null, null, null, null, 511, null) : callbacks;
            function1 = (i & 2) != 0 ? new AnonymousClass1(null) : function1;
            if ((i & 4) != 0) {
                function14 = new hrj(19);
            } else {
                function14 = function12;
            }
            if ((i & 8) != 0) {
                function15 = new hrj(20);
            } else {
                function15 = function13;
            }
        }

        private final native long Swift_constructor_0(USEventCardViewModel.Callbacks sportsEventCallbacks, Function1<? super Continuation<? super Unit>, ? extends Object> onPullToRefresh, Function1<? super String, Unit> onHubSelected, Function1<? super String, Unit> onHubEntryAppeared);

        private final native Function1<String, Unit> Swift_onHubEntryAppeared(long Swift_peer);

        private final native Function1<String, Unit> Swift_onHubSelected(long Swift_peer);

        private final native Function1<Continuation<? super Unit>, Object> Swift_onPullToRefresh(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native USEventCardViewModel.Callbacks Swift_sportsEventCallbacks(long Swift_peer);

        private static final Unit _init_$lambda$0(String str) {
            str.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(String str) {
            str.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(String str) {
            return _init_$lambda$1(str);
        }

        public static /* synthetic */ Unit b(String str) {
            return _init_$lambda$0(str);
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

        public final Function1<String, Unit> getOnHubEntryAppeared() {
            return Swift_onHubEntryAppeared(this.Swift_peer);
        }

        public final Function1<String, Unit> getOnHubSelected() {
            return Swift_onHubSelected(this.Swift_peer);
        }

        public final Function1<Continuation<? super Unit>, Object> getOnPullToRefresh() {
            return Swift_onPullToRefresh(this.Swift_peer);
        }

        public final USEventCardViewModel.Callbacks getSportsEventCallbacks() {
            return Swift_sportsEventCallbacks(this.Swift_peer);
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

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
        @kw5(c = "com.polymarket.usviewmodels.USTagCategoryViewModel$Callbacks$1", f = "USTagCategoryViewModel.kt", l = {52}, m = "invokeSuspend")
        /* renamed from: com.polymarket.usviewmodels.USTagCategoryViewModel$Callbacks$1, reason: invalid class name */
        /* loaded from: classes5.dex */
        public static final class AnonymousClass1 extends zei implements Function1<Continuation<? super Unit>, Object> {
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
            }

            @Override // defpackage.l81
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // defpackage.l81
            public final Object invokeSuspend(Object obj) {
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    MainActor.Companion companion = MainActor.INSTANCE;
                    C00061 c00061 = new C00061(null);
                    this.label = 1;
                    if (companion.run(c00061, this) == u85Var) {
                        return u85Var;
                    }
                }
                return Unit.INSTANCE;
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
            @kw5(c = "com.polymarket.usviewmodels.USTagCategoryViewModel$Callbacks$1$1", f = "USTagCategoryViewModel.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.polymarket.usviewmodels.USTagCategoryViewModel$Callbacks$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C00061 extends zei implements Function1<Continuation<? super Unit>, Object> {
                int label;

                public C00061(Continuation<? super C00061> continuation) {
                    super(1, continuation);
                }

                @Override // defpackage.l81
                public final Continuation<Unit> create(Continuation<?> continuation) {
                    return new C00061(continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Continuation<? super Unit> continuation) {
                    return ((C00061) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // defpackage.l81
                public final Object invokeSuspend(Object obj) {
                    u85 u85Var = u85.COROUTINE_SUSPENDED;
                    if (this.label == 0) {
                        ResultKt.a(obj);
                        return Unit.INSTANCE;
                    }
                    dmk.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Unit> continuation) {
                    return invoke2(continuation);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Unit> continuation) {
                return invoke2(continuation);
            }
        }

        public Callbacks(USEventCardViewModel.Callbacks callbacks, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Function1<? super String, Unit> function12, Function1<? super String, Unit> function13) {
            callbacks.getClass();
            function1.getClass();
            function12.getClass();
            function13.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(callbacks, function1, function12, function13);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USTagCategoryViewModel(APIEventTag aPIEventTag, PresentationContext presentationContext, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, aPIEventTag, presentationContext, callbacks), (SwiftPeerMarker) null);
        aPIEventTag.getClass();
        presentationContext.getClass();
        callbacks.getClass();
    }

    public USTagCategoryViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }
}
