package com.polymarket.usviewmodels;

import com.polymarket.data.EError;
import com.polymarket.data.EEvent;
import com.polymarket.data.EOrder;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.u85;
import defpackage.vwj;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Async;
import skip.lib.Identifiable;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 {2\u00020\u0001:\u0004xyz{B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001f\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rJ\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010\u0017\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082 J\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010\u001f\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000fH\u0082 J\u0015\u0010%\u001a\u00020 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010&\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0019\u001a\u00020 H\u0082 J\u0015\u0010)\u001a\u00020 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010*\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0019\u001a\u00020 H\u0082 J\u0017\u00101\u001a\u0004\u0018\u00010+2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u00102\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010+H\u0082 J\u0015\u00105\u001a\u00020 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u00106\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0019\u001a\u00020 H\u0082 J\u0015\u0010;\u001a\u0002082\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010=\u001a\u00020 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010@\u001a\u00020 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010C\u001a\u0002082\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010F\u001a\u00020 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010M\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010P\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010S\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010V\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010Y\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\\\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0010\u0010]\u001a\u0004\u0018\u00010^2\u0006\u0010_\u001a\u00020\u0010J\u001f\u0010`\u001a\u0004\u0018\u00010^2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010a\u001a\u00020\u0010H\u0082 J\u000e\u0010b\u001a\u00020c2\u0006\u0010_\u001a\u00020\u0010J\u001d\u0010d\u001a\u00020c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010a\u001a\u00020\u0010H\u0082 J\b\u0010e\u001a\u00020\u0018H\u0016J\u0015\u0010f\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010g\u001a\u00020\u00182\u0006\u0010h\u001a\u00020iH\u0096@¢\u0006\u0002\u0010jJ3\u0010k\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010h\u001a\u00020i2\u0014\u0010l\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010n\u0012\u0004\u0012\u00020\u00180mH\u0082 J\u000e\u0010o\u001a\u00020\u00182\u0006\u0010p\u001a\u00020qJ\u001d\u0010r\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010p\u001a\u00020qH\u0082 J\u0016\u0010s\u001a\b\u0012\u0004\u0012\u00020u0t2\u0006\u0010v\u001a\u000208H\u0016J\u0017\u0010w\u001a\b\u0012\u0004\u0012\u00020u0t2\u0006\u0010v\u001a\u000208H\u0082 R0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R0\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R$\u0010!\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010'\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R(\u0010,\u001a\u0004\u0018\u00010+2\b\u0010\u000e\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00103\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010\"\"\u0004\b4\u0010$R\u0011\u00107\u001a\u0002088F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010<\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b<\u0010\"R\u0011\u0010>\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b?\u0010\"R\u0011\u0010A\u001a\u0002088F¢\u0006\u0006\u001a\u0004\bB\u0010:R\u0011\u0010D\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\bE\u0010\"R\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F¢\u0006\u0006\u001a\u0004\bH\u0010\u0013R\u0011\u0010J\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0011\u0010N\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bO\u0010LR\u0011\u0010Q\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bR\u0010LR\u0011\u0010T\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bU\u0010LR\u0011\u0010W\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bX\u0010LR\u0011\u0010Z\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b[\u0010L¨\u0006|"}, d2 = {"Lcom/polymarket/usviewmodels/UserOrdersViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "filterEventSlug", "", "callbacks", "Lcom/polymarket/usviewmodels/UserOrdersViewModel$Callbacks;", "(Ljava/lang/String;Lcom/polymarket/usviewmodels/UserOrdersViewModel$Callbacks;)V", "newValue", "", "Lcom/polymarket/data/EOrder;", "orders", "getOrders", "()Ljava/util/List;", "setOrders", "(Ljava/util/List;)V", "Swift_orders", "Swift_orders_set", "", "value", "Lcom/polymarket/usviewmodels/UserOrdersViewModel$OrderEventGroup;", "orderGroups", "getOrderGroups", "setOrderGroups", "Swift_orderGroups", "Swift_orderGroups_set", "", "isLoading", "()Z", "setLoading", "(Z)V", "Swift_isLoading", "Swift_isLoading_set", "isRefreshing", "setRefreshing", "Swift_isRefreshing", "Swift_isRefreshing_set", "Lcom/polymarket/data/EError;", "error", "getError", "()Lcom/polymarket/data/EError;", "setError", "(Lcom/polymarket/data/EError;)V", "Swift_error", "Swift_error_set", "isCancellingAll", "setCancellingAll", "Swift_isCancellingAll", "Swift_isCancellingAll_set", "orderCount", "", "getOrderCount", "()I", "Swift_orderCount", "isEmpty", "Swift_isEmpty", "hasContent", "getHasContent", "Swift_hasContent", "maxVisibleOrders", "getMaxVisibleOrders", "Swift_maxVisibleOrders", "hasMoreOrders", "getHasMoreOrders", "Swift_hasMoreOrders", "visibleOrders", "getVisibleOrders", "Swift_visibleOrders", "ordersSectionTitle", "getOrdersSectionTitle", "()Ljava/lang/String;", "Swift_ordersSectionTitle", "sectionTitle", "getSectionTitle", "Swift_sectionTitle", "sectionHeaderTitle", "getSectionHeaderTitle", "Swift_sectionHeaderTitle", "seeAllTitle", "getSeeAllTitle", "Swift_seeAllTitle", "emptyStateTitle", "getEmptyStateTitle", "Swift_emptyStateTitle", "cancelAllTitle", "getCancelAllTitle", "Swift_cancelAllTitle", "event", "Lcom/polymarket/data/EEvent;", "for_", "Swift_event_0", "order", "presentation", "Lcom/polymarket/usviewmodels/OrderPresentation;", "Swift_presentation_1", "setup", "Swift_setup_3", "performLoad", "reason", "Lcom/polymarket/usviewmodels/ReloadReason;", "(Lcom/polymarket/usviewmodels/ReloadReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Swift_callback_performLoad_4", "f_callback", "Lkotlin/Function1;", "", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/UserOrdersViewModel$Input;", "Swift_sendInput_5", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Callbacks", "OrderEventGroup", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserOrdersViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ UserOrdersViewModel(String str, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new Callbacks(null, null, 3, null) : callbacks);
    }

    private final native void Swift_callback_performLoad_4(long Swift_peer, ReloadReason reason, Function1<? super Throwable, Unit> f_callback);

    private final native String Swift_cancelAllTitle(long Swift_peer);

    private final native String Swift_emptyStateTitle(long Swift_peer);

    private final native EError Swift_error(long Swift_peer);

    private final native void Swift_error_set(long Swift_peer, EError value);

    private final native EEvent Swift_event_0(long Swift_peer, EOrder order);

    private final native boolean Swift_hasContent(long Swift_peer);

    private final native boolean Swift_hasMoreOrders(long Swift_peer);

    private final native boolean Swift_isCancellingAll(long Swift_peer);

    private final native void Swift_isCancellingAll_set(long Swift_peer, boolean value);

    private final native boolean Swift_isEmpty(long Swift_peer);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native void Swift_isLoading_set(long Swift_peer, boolean value);

    private final native boolean Swift_isRefreshing(long Swift_peer);

    private final native void Swift_isRefreshing_set(long Swift_peer, boolean value);

    private final native int Swift_maxVisibleOrders(long Swift_peer);

    private final native int Swift_orderCount(long Swift_peer);

    private final native List<OrderEventGroup> Swift_orderGroups(long Swift_peer);

    private final native void Swift_orderGroups_set(long Swift_peer, List<OrderEventGroup> value);

    private final native List<EOrder> Swift_orders(long Swift_peer);

    private final native String Swift_ordersSectionTitle(long Swift_peer);

    private final native void Swift_orders_set(long Swift_peer, List<EOrder> value);

    private final native OrderPresentation Swift_presentation_1(long Swift_peer, EOrder order);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_sectionHeaderTitle(long Swift_peer);

    private final native String Swift_sectionTitle(long Swift_peer);

    private final native String Swift_seeAllTitle(long Swift_peer);

    private final native void Swift_sendInput_5(long Swift_peer, Input input);

    private final native void Swift_setup_3(long Swift_peer);

    private final native List<EOrder> Swift_visibleOrders(long Swift_peer);

    public static final /* synthetic */ void access$Swift_callback_performLoad_4(UserOrdersViewModel userOrdersViewModel, long j, ReloadReason reloadReason, Function1 function1) {
        userOrdersViewModel.Swift_callback_performLoad_4(j, reloadReason, function1);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final EEvent event(EOrder for_) {
        for_.getClass();
        return Swift_event_0(getSwift_peer(), for_);
    }

    public final String getCancelAllTitle() {
        return Swift_cancelAllTitle(getSwift_peer());
    }

    public final String getEmptyStateTitle() {
        return Swift_emptyStateTitle(getSwift_peer());
    }

    public final EError getError() {
        return Swift_error(getSwift_peer());
    }

    public final boolean getHasContent() {
        return Swift_hasContent(getSwift_peer());
    }

    public final boolean getHasMoreOrders() {
        return Swift_hasMoreOrders(getSwift_peer());
    }

    public final int getMaxVisibleOrders() {
        return Swift_maxVisibleOrders(getSwift_peer());
    }

    public final int getOrderCount() {
        return Swift_orderCount(getSwift_peer());
    }

    public final List<OrderEventGroup> getOrderGroups() {
        return Swift_orderGroups(getSwift_peer());
    }

    public final List<EOrder> getOrders() {
        return Swift_orders(getSwift_peer());
    }

    public final String getOrdersSectionTitle() {
        return Swift_ordersSectionTitle(getSwift_peer());
    }

    public final String getSectionHeaderTitle() {
        return Swift_sectionHeaderTitle(getSwift_peer());
    }

    public final String getSectionTitle() {
        return Swift_sectionTitle(getSwift_peer());
    }

    public final String getSeeAllTitle() {
        return Swift_seeAllTitle(getSwift_peer());
    }

    public final List<EOrder> getVisibleOrders() {
        return Swift_visibleOrders(getSwift_peer());
    }

    public final boolean isCancellingAll() {
        return Swift_isCancellingAll(getSwift_peer());
    }

    public final boolean isEmpty() {
        return Swift_isEmpty(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final boolean isRefreshing() {
        return Swift_isRefreshing(getSwift_peer());
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public Object performLoad(ReloadReason reloadReason, Continuation<? super Unit> continuation) {
        Object run = Async.INSTANCE.run(new UserOrdersViewModel$performLoad$2(this, reloadReason, null), continuation);
        if (run == u85.COROUTINE_SUSPENDED) {
            return run;
        }
        return Unit.INSTANCE;
    }

    public final OrderPresentation presentation(EOrder for_) {
        for_.getClass();
        return Swift_presentation_1(getSwift_peer(), for_);
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_5(getSwift_peer(), input);
    }

    public final void setCancellingAll(boolean z) {
        Swift_isCancellingAll_set(getSwift_peer(), z);
    }

    public final void setError(EError eError) {
        Swift_error_set(getSwift_peer(), (EError) StructKt.sref$default(eError, null, 1, null));
    }

    public final void setLoading(boolean z) {
        Swift_isLoading_set(getSwift_peer(), z);
    }

    public final void setOrderGroups(List<OrderEventGroup> list) {
        list.getClass();
        Swift_orderGroups_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setOrders(List<EOrder> list) {
        list.getClass();
        Swift_orders_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setRefreshing(boolean z) {
        Swift_isRefreshing_set(getSwift_peer(), z);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_3(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e2\u00020\u0001:\u0005\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/polymarket/usviewmodels/UserOrdersViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnRefreshCase", "OnOrderSelectedCase", "OnCancelOrderCase", "OnCancelAllOrdersCase", "Companion", "Lcom/polymarket/usviewmodels/UserOrdersViewModel$Input$OnCancelAllOrdersCase;", "Lcom/polymarket/usviewmodels/UserOrdersViewModel$Input$OnCancelOrderCase;", "Lcom/polymarket/usviewmodels/UserOrdersViewModel$Input$OnOrderSelectedCase;", "Lcom/polymarket/usviewmodels/UserOrdersViewModel$Input$OnRefreshCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onRefresh = new OnRefreshCase();
        private static final Input onCancelAllOrders = new OnCancelAllOrdersCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/UserOrdersViewModel$Input$OnCancelAllOrdersCase;", "Lcom/polymarket/usviewmodels/UserOrdersViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnCancelAllOrdersCase extends Input {
            public OnCancelAllOrdersCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/UserOrdersViewModel$Input$OnCancelOrderCase;", "Lcom/polymarket/usviewmodels/UserOrdersViewModel$Input;", "associated0", "Lcom/polymarket/data/EOrder;", "<init>", "(Lcom/polymarket/data/EOrder;)V", "getAssociated0", "()Lcom/polymarket/data/EOrder;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnCancelOrderCase extends Input {
            private final EOrder associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnCancelOrderCase(EOrder eOrder) {
                super(null);
                eOrder.getClass();
                this.associated0 = eOrder;
            }

            public final EOrder getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/UserOrdersViewModel$Input$OnOrderSelectedCase;", "Lcom/polymarket/usviewmodels/UserOrdersViewModel$Input;", "associated0", "Lcom/polymarket/data/EOrder;", "<init>", "(Lcom/polymarket/data/EOrder;)V", "getAssociated0", "()Lcom/polymarket/data/EOrder;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnOrderSelectedCase extends Input {
            private final EOrder associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnOrderSelectedCase(EOrder eOrder) {
                super(null);
                eOrder.getClass();
                this.associated0 = eOrder;
            }

            public final EOrder getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/UserOrdersViewModel$Input$OnRefreshCase;", "Lcom/polymarket/usviewmodels/UserOrdersViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRefreshCase extends Input {
            public OnRefreshCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnCancelAllOrders$cp() {
            return onCancelAllOrders;
        }

        public static final /* synthetic */ Input access$getOnRefresh$cp() {
            return onRefresh;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/UserOrdersViewModel$Input$Companion;", "", "<init>", "()V", "onRefresh", "Lcom/polymarket/usviewmodels/UserOrdersViewModel$Input;", "getOnRefresh", "()Lcom/polymarket/usviewmodels/UserOrdersViewModel$Input;", "onOrderSelected", "associated0", "Lcom/polymarket/data/EOrder;", "onCancelOrder", "onCancelAllOrders", "getOnCancelAllOrders", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnCancelAllOrders() {
                return Input.access$getOnCancelAllOrders$cp();
            }

            public final Input getOnRefresh() {
                return Input.access$getOnRefresh$cp();
            }

            public final Input onCancelOrder(EOrder associated0) {
                associated0.getClass();
                return new OnCancelOrderCase(associated0);
            }

            public final Input onOrderSelected(EOrder associated0) {
                associated0.getClass();
                return new OnOrderSelectedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0006\u0010\u000b\u001a\u00020\fJ\t\u0010\r\u001a\u00020\fH\u0082 J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u0011\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082 ¨\u0006\u0012"}, d2 = {"Lcom/polymarket/usviewmodels/UserOrdersViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_2", "", "Lskip/bridge/SwiftObjectPointer;", "filterEventSlug", "", "callbacks", "Lcom/polymarket/usviewmodels/UserOrdersViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/UserOrdersViewModel;", "Swift_Companion_mock_6", "mockWithOrders", "count", "", "Swift_Companion_mockWithOrders_7", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_2(String filterEventSlug, Callbacks callbacks);

        private final native UserOrdersViewModel Swift_Companion_mockWithOrders_7(int count);

        private final native UserOrdersViewModel Swift_Companion_mock_6();

        public static final /* synthetic */ long access$Swift_Companion_constructor_2(Companion companion, String str, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_2(str, callbacks);
        }

        public final UserOrdersViewModel mock() {
            return Swift_Companion_mock_6();
        }

        public final UserOrdersViewModel mockWithOrders(int count) {
            return Swift_Companion_mockWithOrders_7(count);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00011B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB)\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\n\u0010\u0012J\u0006\u0010\u0017\u001a\u00020\u0018J\u0015\u0010\u0019\u001a\u00020\u00182\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0015\u0010\"\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010%\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001b\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010+\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J-\u0010,\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0082 J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001d0.2\u0006\u0010/\u001a\u00020\u001fH\u0016J\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u001d0.2\u0006\u0010/\u001a\u00020\u001fH\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010!¨\u00062"}, d2 = {"Lcom/polymarket/usviewmodels/UserOrdersViewModel$OrderEventGroup;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "eventSlug", "event", "Lcom/polymarket/data/EEvent;", "orders", "", "Lcom/polymarket/data/EOrder;", "(Ljava/lang/String;Lcom/polymarket/data/EEvent;Ljava/util/List;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getEventSlug", "()Ljava/lang/String;", "Swift_eventSlug", "getEvent", "()Lcom/polymarket/data/EEvent;", "Swift_event", "getOrders", "()Ljava/util/List;", "Swift_orders", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "Swift_id", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class OrderEventGroup implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public OrderEventGroup(String str, EEvent eEvent, List<EOrder> list) {
            str.getClass();
            list.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, eEvent, list);
        }

        private final native long Swift_constructor_0(String eventSlug, EEvent event, List<EOrder> orders);

        private final native EEvent Swift_event(long Swift_peer);

        private final native String Swift_eventSlug(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native List<EOrder> Swift_orders(long Swift_peer);

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

        public final String getEventSlug() {
            return Swift_eventSlug(this.Swift_peer);
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
        }

        public final List<EOrder> getOrders() {
            return Swift_orders(this.Swift_peer);
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

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ String getId() {
            return getId2();
        }

        public OrderEventGroup(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserOrdersViewModel(String str, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_2(INSTANCE, str, callbacks), (SwiftPeerMarker) null);
        callbacks.getClass();
    }

    public UserOrdersViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB5\b\u0016\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\rJ\u0015\u0010\u0015\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J!\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J5\u0010!\u001a\u00060\u0004j\u0002`\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0082 J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190#2\u0006\u0010$\u001a\u00020\u001bH\u0016J\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190#2\u0006\u0010$\u001a\u00020\u001bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006'"}, d2 = {"Lcom/polymarket/usviewmodels/UserOrdersViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onOrderSelected", "Lkotlin/Function1;", "Lcom/polymarket/data/EOrder;", "", "onOrderCancelled", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnOrderSelected", "()Lkotlin/jvm/functions/Function1;", "Swift_onOrderSelected", "getOnOrderCancelled", "Swift_onOrderCancelled", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((Function1<? super EOrder, Unit>) ((i & 1) != 0 ? new vwj(7) : function1), (Function1<? super EOrder, Unit>) ((i & 2) != 0 ? new vwj(8) : function12));
        }

        private final native long Swift_constructor_0(Function1<? super EOrder, Unit> onOrderSelected, Function1<? super EOrder, Unit> onOrderCancelled);

        private final native Function1<EOrder, Unit> Swift_onOrderCancelled(long Swift_peer);

        private final native Function1<EOrder, Unit> Swift_onOrderSelected(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(EOrder eOrder) {
            eOrder.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(EOrder eOrder) {
            eOrder.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(EOrder eOrder) {
            return _init_$lambda$0(eOrder);
        }

        public static /* synthetic */ Unit b(EOrder eOrder) {
            return _init_$lambda$1(eOrder);
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

        public final Function1<EOrder, Unit> getOnOrderCancelled() {
            return Swift_onOrderCancelled(this.Swift_peer);
        }

        public final Function1<EOrder, Unit> getOnOrderSelected() {
            return Swift_onOrderSelected(this.Swift_peer);
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

        public Callbacks(Function1<? super EOrder, Unit> function1, Function1<? super EOrder, Unit> function12) {
            function1.getClass();
            function12.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function1, function12);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
