package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.EAccountActivity;
import com.polymarket.data.EError;
import com.polymarket.data.EEvent;
import com.polymarket.data.ScrollCommandType;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.hrj;
import io.intercom.android.sdk.metrics.MetricTracker;
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
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 c2\u00020\u0001:\u0004`abcB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001f\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rJ\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010\u0017\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082 J\u0015\u0010\u001f\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010 \u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0019\u001a\u00020\u001aH\u0082 J\u0015\u0010#\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010$\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0019\u001a\u00020\u001aH\u0082 J\u0017\u0010+\u001a\u0004\u0018\u00010%2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010,\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010%H\u0082 J\u0017\u00103\u001a\u0004\u0018\u00010-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u00104\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010-H\u0082 J\u0015\u00106\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010;\u001a\u0002082\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010>\u001a\u0002082\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010A\u001a\u0002082\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010C\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010F\u001a\u0002082\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010I\u001a\u0002082\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010L\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010O\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010P\u001a\u00020\u0018H\u0016J\u0015\u0010Q\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010R\u001a\u00020\u0018H\u0016J\u0015\u0010S\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010T\u001a\u00020\u00182\u0006\u0010U\u001a\u00020VJ\u001d\u0010W\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010U\u001a\u00020VH\u0082 J\u000e\u0010X\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\fJ\u001d\u0010Y\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0082 J\u0016\u0010Z\u001a\b\u0012\u0004\u0012\u00020\\0[2\u0006\u0010]\u001a\u00020^H\u0016J\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020\\0[2\u0006\u0010]\u001a\u00020^H\u0082 R0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010!\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR(\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u000e\u001a\u0004\u0018\u00010%8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u0010.\u001a\u0004\u0018\u00010-2\b\u0010\u000e\u001a\u0004\u0018\u00010-8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0011\u00105\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b5\u0010\u001cR\u0011\u00107\u001a\u0002088F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010<\u001a\u0002088F¢\u0006\u0006\u001a\u0004\b=\u0010:R\u0011\u0010?\u001a\u0002088F¢\u0006\u0006\u001a\u0004\b@\u0010:R\u0011\u0010B\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bB\u0010\u001cR\u0011\u0010D\u001a\u0002088F¢\u0006\u0006\u001a\u0004\bE\u0010:R\u0011\u0010G\u001a\u0002088F¢\u0006\u0006\u001a\u0004\bH\u0010:R\u0011\u0010J\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bK\u0010\u001cR\u0011\u0010M\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bN\u0010\u001c¨\u0006d"}, d2 = {"Lcom/polymarket/usviewmodels/USUserActivityViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "scopedEvent", "Lcom/polymarket/data/EEvent;", "callbacks", "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Callbacks;", "(Lcom/polymarket/data/EEvent;Lcom/polymarket/usviewmodels/USUserActivityViewModel$Callbacks;)V", "newValue", "", "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Activity;", "activities", "getActivities", "()Ljava/util/List;", "setActivities", "(Ljava/util/List;)V", "Swift_activities", "Swift_activities_set", "", "value", "", "isLoading", "()Z", "setLoading", "(Z)V", "Swift_isLoading", "Swift_isLoading_set", "isRefreshing", "setRefreshing", "Swift_isRefreshing", "Swift_isRefreshing_set", "Lcom/polymarket/data/EError;", "error", "getError", "()Lcom/polymarket/data/EError;", "setError", "(Lcom/polymarket/data/EError;)V", "Swift_error", "Swift_error_set", "Lcom/polymarket/data/ScrollCommandType;", "scrollCommand", "getScrollCommand", "()Lcom/polymarket/data/ScrollCommandType;", "setScrollCommand", "(Lcom/polymarket/data/ScrollCommandType;)V", "Swift_scrollCommand", "Swift_scrollCommand_set", "isEmpty", "Swift_isEmpty", "listScreenTitle", "", "getListScreenTitle", "()Ljava/lang/String;", "Swift_listScreenTitle", "eventScopedEmptyStateText", "getEventScopedEmptyStateText", "Swift_eventScopedEmptyStateText", "eventScopedErrorText", "getEventScopedErrorText", "Swift_eventScopedErrorText", "isRetentionMessagingEnabled", "Swift_isRetentionMessagingEnabled", "retentionEmptyStateText", "getRetentionEmptyStateText", "Swift_retentionEmptyStateText", "retentionFooterText", "getRetentionFooterText", "Swift_retentionFooterText", "showsRetentionEmptyState", "getShowsRetentionEmptyState", "Swift_showsRetentionEmptyState", "showsRetentionFooter", "getShowsRetentionFooter", "Swift_showsRetentionFooter", "setup", "Swift_setup_1", "handleBecomeForeground", "Swift_handleBecomeForeground_2", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input;", "Swift_sendInput_3", "setCallbacks", "Swift_setCallbacks_4", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "Activity", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class USUserActivityViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ USUserActivityViewModel(EEvent eEvent, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : eEvent, (i & 2) != 0 ? new Callbacks(null, 1, null) : callbacks);
    }

    private final native List<Activity> Swift_activities(long Swift_peer);

    private final native void Swift_activities_set(long Swift_peer, List<Activity> value);

    private final native EError Swift_error(long Swift_peer);

    private final native void Swift_error_set(long Swift_peer, EError value);

    private final native String Swift_eventScopedEmptyStateText(long Swift_peer);

    private final native String Swift_eventScopedErrorText(long Swift_peer);

    private final native void Swift_handleBecomeForeground_2(long Swift_peer);

    private final native boolean Swift_isEmpty(long Swift_peer);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native void Swift_isLoading_set(long Swift_peer, boolean value);

    private final native boolean Swift_isRefreshing(long Swift_peer);

    private final native void Swift_isRefreshing_set(long Swift_peer, boolean value);

    private final native boolean Swift_isRetentionMessagingEnabled(long Swift_peer);

    private final native String Swift_listScreenTitle(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_retentionEmptyStateText(long Swift_peer);

    private final native String Swift_retentionFooterText(long Swift_peer);

    private final native ScrollCommandType Swift_scrollCommand(long Swift_peer);

    private final native void Swift_scrollCommand_set(long Swift_peer, ScrollCommandType value);

    private final native void Swift_sendInput_3(long Swift_peer, Input input);

    private final native void Swift_setCallbacks_4(long Swift_peer, Callbacks callbacks);

    private final native void Swift_setup_1(long Swift_peer);

    private final native boolean Swift_showsRetentionEmptyState(long Swift_peer);

    private final native boolean Swift_showsRetentionFooter(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final List<Activity> getActivities() {
        return Swift_activities(getSwift_peer());
    }

    public final EError getError() {
        return Swift_error(getSwift_peer());
    }

    public final String getEventScopedEmptyStateText() {
        return Swift_eventScopedEmptyStateText(getSwift_peer());
    }

    public final String getEventScopedErrorText() {
        return Swift_eventScopedErrorText(getSwift_peer());
    }

    public final String getListScreenTitle() {
        return Swift_listScreenTitle(getSwift_peer());
    }

    public final String getRetentionEmptyStateText() {
        return Swift_retentionEmptyStateText(getSwift_peer());
    }

    public final String getRetentionFooterText() {
        return Swift_retentionFooterText(getSwift_peer());
    }

    public final ScrollCommandType getScrollCommand() {
        return Swift_scrollCommand(getSwift_peer());
    }

    public final boolean getShowsRetentionEmptyState() {
        return Swift_showsRetentionEmptyState(getSwift_peer());
    }

    public final boolean getShowsRetentionFooter() {
        return Swift_showsRetentionFooter(getSwift_peer());
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void handleBecomeForeground() {
        Swift_handleBecomeForeground_2(getSwift_peer());
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

    public final boolean isRetentionMessagingEnabled() {
        return Swift_isRetentionMessagingEnabled(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_3(getSwift_peer(), input);
    }

    public final void setActivities(List<Activity> list) {
        list.getClass();
        Swift_activities_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setCallbacks(Callbacks callbacks) {
        callbacks.getClass();
        Swift_setCallbacks_4(getSwift_peer(), callbacks);
    }

    public final void setError(EError eError) {
        Swift_error_set(getSwift_peer(), (EError) StructKt.sref$default(eError, null, 1, null));
    }

    public final void setLoading(boolean z) {
        Swift_isLoading_set(getSwift_peer(), z);
    }

    public final void setRefreshing(boolean z) {
        Swift_isRefreshing_set(getSwift_peer(), z);
    }

    public final void setScrollCommand(ScrollCommandType scrollCommandType) {
        Swift_scrollCommand_set(getSwift_peer(), scrollCommandType);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00192\u00020\u0001:\t\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\b\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnRefreshCase", "OnActivitySelectedCase", "OnWillDisplayActivityCase", "OnDataUpdatedCase", "OnPositionsUpdatedCase", "OnAppearCase", "OnDisappearCase", "Companion", "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input$OnActivitySelectedCase;", "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input$OnAppearCase;", "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input$OnDataUpdatedCase;", "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input$OnDisappearCase;", "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input$OnPositionsUpdatedCase;", "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input$OnRefreshCase;", "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input$OnWillDisplayActivityCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onRefresh = new OnRefreshCase();
        private static final Input onDataUpdated = new OnDataUpdatedCase();
        private static final Input onPositionsUpdated = new OnPositionsUpdatedCase();
        private static final Input onAppear = new OnAppearCase();
        private static final Input onDisappear = new OnDisappearCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input$OnActivitySelectedCase;", "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Activity;", "<init>", "(Lcom/polymarket/usviewmodels/USUserActivityViewModel$Activity;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/USUserActivityViewModel$Activity;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnActivitySelectedCase extends Input {
            private final Activity associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnActivitySelectedCase(Activity activity) {
                super(null);
                activity.getClass();
                this.associated0 = activity;
            }

            public final Activity getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input$OnAppearCase;", "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnAppearCase extends Input {
            public OnAppearCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input$OnDataUpdatedCase;", "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDataUpdatedCase extends Input {
            public OnDataUpdatedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input$OnDisappearCase;", "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDisappearCase extends Input {
            public OnDisappearCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input$OnPositionsUpdatedCase;", "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPositionsUpdatedCase extends Input {
            public OnPositionsUpdatedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input$OnRefreshCase;", "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRefreshCase extends Input {
            public OnRefreshCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidLoadCase extends Input {
            public OnViewDidLoadCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input$OnWillDisplayActivityCase;", "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Activity;", "<init>", "(Lcom/polymarket/usviewmodels/USUserActivityViewModel$Activity;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/USUserActivityViewModel$Activity;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnWillDisplayActivityCase extends Input {
            private final Activity associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnWillDisplayActivityCase(Activity activity) {
                super(null);
                activity.getClass();
                this.associated0 = activity;
            }

            public final Activity getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnAppear$cp() {
            return onAppear;
        }

        public static final /* synthetic */ Input access$getOnDataUpdated$cp() {
            return onDataUpdated;
        }

        public static final /* synthetic */ Input access$getOnDisappear$cp() {
            return onDisappear;
        }

        public static final /* synthetic */ Input access$getOnPositionsUpdated$cp() {
            return onPositionsUpdated;
        }

        public static final /* synthetic */ Input access$getOnRefresh$cp() {
            return onRefresh;
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
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/USUserActivityViewModel$Input;", "onRefresh", "getOnRefresh", "onActivitySelected", "associated0", "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Activity;", "onWillDisplayActivity", "onDataUpdated", "getOnDataUpdated", "onPositionsUpdated", "getOnPositionsUpdated", "onAppear", "getOnAppear", "onDisappear", "getOnDisappear", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnAppear() {
                return Input.access$getOnAppear$cp();
            }

            public final Input getOnDataUpdated() {
                return Input.access$getOnDataUpdated$cp();
            }

            public final Input getOnDisappear() {
                return Input.access$getOnDisappear$cp();
            }

            public final Input getOnPositionsUpdated() {
                return Input.access$getOnPositionsUpdated$cp();
            }

            public final Input getOnRefresh() {
                return Input.access$getOnRefresh$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input onActivitySelected(Activity associated0) {
                associated0.getClass();
                return new OnActivitySelectedCase(associated0);
            }

            public final Input onWillDisplayActivity(Activity associated0) {
                associated0.getClass();
                return new OnWillDisplayActivityCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0007\u001a\u00020\u0005H\u0082 J\u001f\u0010\b\u001a\u00060\tj\u0002`\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0082 J\u0010\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012J\u0011\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/polymarket/usviewmodels/USUserActivityViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "isEventActivityFeatureEnabled", "", "()Z", "Swift_Companion_isEventActivityFeatureEnabled", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "scopedEvent", "Lcom/polymarket/data/EEvent;", "callbacks", "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/USUserActivityViewModel;", "count", "", "Swift_Companion_mock_5", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(EEvent scopedEvent, Callbacks callbacks);

        private final native boolean Swift_Companion_isEventActivityFeatureEnabled();

        private final native USUserActivityViewModel Swift_Companion_mock_5(int count);

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, EEvent eEvent, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(eEvent, callbacks);
        }

        public static /* synthetic */ USUserActivityViewModel mock$default(Companion companion, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 10;
            }
            return companion.mock(i);
        }

        public final boolean isEventActivityFeatureEnabled() {
            return Swift_Companion_isEventActivityFeatureEnabled();
        }

        public final USUserActivityViewModel mock(int count) {
            return Swift_Companion_mock_5(count);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0016\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\rJ\u0015\u0010\u0014\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J!\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010\u001e\u001a\u00060\u0004j\u0002`\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0082 J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180 2\u0006\u0010!\u001a\u00020\u001aH\u0016J\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180 2\u0006\u0010!\u001a\u00020\u001aH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006$"}, d2 = {"Lcom/polymarket/usviewmodels/USUserActivityViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onActivitySelected", "Lkotlin/Function1;", "Lcom/polymarket/data/EAccountActivity;", "", "(Lkotlin/jvm/functions/Function1;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnActivitySelected", "()Lkotlin/jvm/functions/Function1;", "Swift_onActivitySelected", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Callbacks(Function1<? super EAccountActivity, Unit> function1) {
            function1.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function1);
        }

        private final native long Swift_constructor_0(Function1<? super EAccountActivity, Unit> onActivitySelected);

        private final native Function1<EAccountActivity, Unit> Swift_onActivitySelected(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(EAccountActivity eAccountActivity) {
            eAccountActivity.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(EAccountActivity eAccountActivity) {
            return _init_$lambda$0(eAccountActivity);
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

        public final Function1<EAccountActivity, Unit> getOnActivitySelected() {
            return Swift_onActivitySelected(this.Swift_peer);
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

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ Callbacks(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new hrj(22) : function1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USUserActivityViewModel(EEvent eEvent, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, eEvent, callbacks), (SwiftPeerMarker) null);
        callbacks.getClass();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0015\u0010\u001e\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010!\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001d\u0010\"\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0082 J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190$2\u0006\u0010%\u001a\u00020\u001bH\u0016J\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190$2\u0006\u0010%\u001a\u00020\u001bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006("}, d2 = {"Lcom/polymarket/usviewmodels/USUserActivityViewModel$Activity;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "entity", "Lcom/polymarket/data/EAccountActivity;", "(Ljava/lang/String;Lcom/polymarket/data/EAccountActivity;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getEntity", "()Lcom/polymarket/data/EAccountActivity;", "Swift_entity", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Activity implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Activity(String str, EAccountActivity eAccountActivity) {
            str.getClass();
            eAccountActivity.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, eAccountActivity);
        }

        private final native long Swift_constructor_0(String id, EAccountActivity entity);

        private final native EAccountActivity Swift_entity(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

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

        public final EAccountActivity getEntity() {
            return Swift_entity(this.Swift_peer);
        }

        public final String getId() {
            return Swift_id(this.Swift_peer);
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

        public Activity(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    public USUserActivityViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }
}
