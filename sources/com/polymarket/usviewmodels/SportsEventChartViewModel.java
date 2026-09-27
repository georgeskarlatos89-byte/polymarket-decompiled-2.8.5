package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.EError;
import com.polymarket.data.EEvent;
import com.polymarket.data.ESportsTeam;
import com.polymarket.data.ETimeSeriesEntry;
import com.polymarket.data.ETimeSeriesInterval;
import com.polymarket.usviewmodels.AppViewModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 h2\u00020\u0001:\u0003fghB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rJ\u0015\u0010\u0013\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u0014\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020\nH\u0082 J\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010\u001f\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0082 J\u0015\u0010%\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010&\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020\u0018H\u0082 J\u001b\u0010+\u001a\b\u0012\u0004\u0012\u00020'0\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010,\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020'0\u0017H\u0082 J\u0015\u00102\u001a\u00020-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u00103\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020-H\u0082 J\u0017\u0010:\u001a\u0004\u0018\u0001042\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010;\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0016\u001a\u0004\u0018\u000104H\u0082 J#\u0010D\u001a\u0010\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>\u0018\u00010<2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J+\u0010E\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>\u0018\u00010<H\u0082 J\u0015\u0010H\u001a\u00020-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010I\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020-H\u0082 J\u0017\u0010M\u001a\u0004\u0018\u00010=2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010Q\u001a\u00020-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010R\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020-H\u0082 J\b\u0010S\u001a\u00020\u0015H\u0016J\u0015\u0010T\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010U\u001a\u00020\u00152\u0006\u0010V\u001a\u00020WJ\u001d\u0010X\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010V\u001a\u00020WH\u0082 J\u0015\u0010Y\u001a\u0004\u0018\u00010>2\u0006\u0010Z\u001a\u00020[¢\u0006\u0002\u0010\\J$\u0010]\u001a\u0004\u0018\u00010>2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010^\u001a\u00020[H\u0082 ¢\u0006\u0002\u0010_J\u0016\u0010`\u001a\b\u0012\u0004\u0012\u00020b0a2\u0006\u0010c\u001a\u00020dH\u0016J\u0017\u0010e\u001a\b\u0012\u0004\u0012\u00020b0a2\u0006\u0010c\u001a\u00020dH\u0082 R$\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R0\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010 \u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R0\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00172\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020'0\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010\u001b\"\u0004\b*\u0010\u001dR$\u0010.\u001a\u00020-2\u0006\u0010\u000e\u001a\u00020-8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R(\u00105\u001a\u0004\u0018\u0001042\b\u0010\u000e\u001a\u0004\u0018\u0001048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R@\u0010?\u001a\u0010\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>\u0018\u00010<2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>\u0018\u00010<8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010F\u001a\u00020-2\u0006\u0010\u000e\u001a\u00020-8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010/\"\u0004\bG\u00101R\u0013\u0010J\u001a\u0004\u0018\u00010=8F¢\u0006\u0006\u001a\u0004\bK\u0010LR$\u0010N\u001a\u00020-2\u0006\u0010\u000e\u001a\u00020-8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010/\"\u0004\bP\u00101¨\u0006i"}, d2 = {"Lcom/polymarket/usviewmodels/SportsEventChartViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "sportsEvent", "Lcom/polymarket/data/EEvent;", "callbacks", "Lcom/polymarket/usviewmodels/SportsEventChartViewModel$Callbacks;", "(Lcom/polymarket/data/EEvent;Lcom/polymarket/usviewmodels/SportsEventChartViewModel$Callbacks;)V", "newValue", "getSportsEvent", "()Lcom/polymarket/data/EEvent;", "setSportsEvent", "(Lcom/polymarket/data/EEvent;)V", "Swift_sportsEvent", "Swift_sportsEvent_set", "", "value", "", "Lcom/polymarket/data/ETimeSeriesInterval;", "availableTimeframes", "getAvailableTimeframes", "()Ljava/util/List;", "setAvailableTimeframes", "(Ljava/util/List;)V", "Swift_availableTimeframes", "Swift_availableTimeframes_set", "selectedTimeframe", "getSelectedTimeframe", "()Lcom/polymarket/data/ETimeSeriesInterval;", "setSelectedTimeframe", "(Lcom/polymarket/data/ETimeSeriesInterval;)V", "Swift_selectedTimeframe", "Swift_selectedTimeframe_set", "Lcom/polymarket/data/ETimeSeriesEntry;", "seriesEntries", "getSeriesEntries", "setSeriesEntries", "Swift_seriesEntries", "Swift_seriesEntries_set", "", "isLoading", "()Z", "setLoading", "(Z)V", "Swift_isLoading", "Swift_isLoading_set", "Lcom/polymarket/data/EError;", "error", "getError", "()Lcom/polymarket/data/EError;", "setError", "(Lcom/polymarket/data/EError;)V", "Swift_error", "Swift_error_set", "", "", "", "selectedMarkerValues", "getSelectedMarkerValues", "()Ljava/util/Map;", "setSelectedMarkerValues", "(Ljava/util/Map;)V", "Swift_selectedMarkerValues", "Swift_selectedMarkerValues_set", "isUserInteractingWithChart", "setUserInteractingWithChart", "Swift_isUserInteractingWithChart", "Swift_isUserInteractingWithChart_set", "displayVolumeText", "getDisplayVolumeText", "()Ljava/lang/String;", "Swift_displayVolumeText", "hasUserPositions", "getHasUserPositions", "setHasUserPositions", "Swift_hasUserPositions", "Swift_hasUserPositions_set", "setup", "Swift_setup_1", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/SportsEventChartViewModel$Input;", "Swift_sendInput_2", "legendValue", "for_", "Lcom/polymarket/data/ESportsTeam;", "(Lcom/polymarket/data/ESportsTeam;)Ljava/lang/Double;", "Swift_legendValue_3", "team", "(JLcom/polymarket/data/ESportsTeam;)Ljava/lang/Double;", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SportsEventChartViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportsEventChartViewModel(EEvent eEvent, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, eEvent, callbacks), (SwiftPeerMarker) null);
        eEvent.getClass();
        callbacks.getClass();
    }

    private final native List<ETimeSeriesInterval> Swift_availableTimeframes(long Swift_peer);

    private final native void Swift_availableTimeframes_set(long Swift_peer, List<? extends ETimeSeriesInterval> value);

    private final native String Swift_displayVolumeText(long Swift_peer);

    private final native EError Swift_error(long Swift_peer);

    private final native void Swift_error_set(long Swift_peer, EError value);

    private final native boolean Swift_hasUserPositions(long Swift_peer);

    private final native void Swift_hasUserPositions_set(long Swift_peer, boolean value);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native void Swift_isLoading_set(long Swift_peer, boolean value);

    private final native boolean Swift_isUserInteractingWithChart(long Swift_peer);

    private final native void Swift_isUserInteractingWithChart_set(long Swift_peer, boolean value);

    private final native Double Swift_legendValue_3(long Swift_peer, ESportsTeam team);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native Map<String, Double> Swift_selectedMarkerValues(long Swift_peer);

    private final native void Swift_selectedMarkerValues_set(long Swift_peer, Map<String, Double> value);

    private final native ETimeSeriesInterval Swift_selectedTimeframe(long Swift_peer);

    private final native void Swift_selectedTimeframe_set(long Swift_peer, ETimeSeriesInterval value);

    private final native void Swift_sendInput_2(long Swift_peer, Input input);

    private final native List<ETimeSeriesEntry> Swift_seriesEntries(long Swift_peer);

    private final native void Swift_seriesEntries_set(long Swift_peer, List<ETimeSeriesEntry> value);

    private final native void Swift_setup_1(long Swift_peer);

    private final native EEvent Swift_sportsEvent(long Swift_peer);

    private final native void Swift_sportsEvent_set(long Swift_peer, EEvent value);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final List<ETimeSeriesInterval> getAvailableTimeframes() {
        return Swift_availableTimeframes(getSwift_peer());
    }

    public final String getDisplayVolumeText() {
        return Swift_displayVolumeText(getSwift_peer());
    }

    public final EError getError() {
        return Swift_error(getSwift_peer());
    }

    public final boolean getHasUserPositions() {
        return Swift_hasUserPositions(getSwift_peer());
    }

    public final Map<String, Double> getSelectedMarkerValues() {
        return Swift_selectedMarkerValues(getSwift_peer());
    }

    public final ETimeSeriesInterval getSelectedTimeframe() {
        return Swift_selectedTimeframe(getSwift_peer());
    }

    public final List<ETimeSeriesEntry> getSeriesEntries() {
        return Swift_seriesEntries(getSwift_peer());
    }

    public final EEvent getSportsEvent() {
        return Swift_sportsEvent(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final boolean isUserInteractingWithChart() {
        return Swift_isUserInteractingWithChart(getSwift_peer());
    }

    public final Double legendValue(ESportsTeam for_) {
        for_.getClass();
        return Swift_legendValue_3(getSwift_peer(), for_);
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_2(getSwift_peer(), input);
    }

    public final void setAvailableTimeframes(List<? extends ETimeSeriesInterval> list) {
        list.getClass();
        Swift_availableTimeframes_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setError(EError eError) {
        Swift_error_set(getSwift_peer(), (EError) StructKt.sref$default(eError, null, 1, null));
    }

    public final void setHasUserPositions(boolean z) {
        Swift_hasUserPositions_set(getSwift_peer(), z);
    }

    public final void setLoading(boolean z) {
        Swift_isLoading_set(getSwift_peer(), z);
    }

    public final void setSelectedMarkerValues(Map<String, Double> map) {
        Swift_selectedMarkerValues_set(getSwift_peer(), (Map) StructKt.sref$default(map, null, 1, null));
    }

    public final void setSelectedTimeframe(ETimeSeriesInterval eTimeSeriesInterval) {
        eTimeSeriesInterval.getClass();
        Swift_selectedTimeframe_set(getSwift_peer(), eTimeSeriesInterval);
    }

    public final void setSeriesEntries(List<ETimeSeriesEntry> list) {
        list.getClass();
        Swift_seriesEntries_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setSportsEvent(EEvent eEvent) {
        eEvent.getClass();
        Swift_sportsEvent_set(getSwift_peer(), (EEvent) StructKt.sref$default(eEvent, null, 1, null));
    }

    public final void setUserInteractingWithChart(boolean z) {
        Swift_isUserInteractingWithChart_set(getSwift_peer(), z);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00162\u00020\u0001:\u0006\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/polymarket/usviewmodels/SportsEventChartViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnSelectTimeframeCase", "OnRetryCase", "OnChartInteractionChangedCase", "OnVisibilityChangedCase", "Companion", "Lcom/polymarket/usviewmodels/SportsEventChartViewModel$Input$OnChartInteractionChangedCase;", "Lcom/polymarket/usviewmodels/SportsEventChartViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/SportsEventChartViewModel$Input$OnSelectTimeframeCase;", "Lcom/polymarket/usviewmodels/SportsEventChartViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/SportsEventChartViewModel$Input$OnVisibilityChangedCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onRetry = new OnRetryCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SportsEventChartViewModel$Input$OnChartInteractionChangedCase;", "Lcom/polymarket/usviewmodels/SportsEventChartViewModel$Input;", "associated0", "", "<init>", "(Z)V", "getAssociated0", "()Z", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnChartInteractionChangedCase extends Input {
            private final boolean associated0;

            public OnChartInteractionChangedCase(boolean z) {
                super(null);
                this.associated0 = z;
            }

            public final boolean getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SportsEventChartViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/SportsEventChartViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRetryCase extends Input {
            public OnRetryCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SportsEventChartViewModel$Input$OnSelectTimeframeCase;", "Lcom/polymarket/usviewmodels/SportsEventChartViewModel$Input;", "associated0", "Lcom/polymarket/data/ETimeSeriesInterval;", "<init>", "(Lcom/polymarket/data/ETimeSeriesInterval;)V", "getAssociated0", "()Lcom/polymarket/data/ETimeSeriesInterval;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSelectTimeframeCase extends Input {
            private final ETimeSeriesInterval associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSelectTimeframeCase(ETimeSeriesInterval eTimeSeriesInterval) {
                super(null);
                eTimeSeriesInterval.getClass();
                this.associated0 = eTimeSeriesInterval;
            }

            public final ETimeSeriesInterval getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SportsEventChartViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/SportsEventChartViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidLoadCase extends Input {
            public OnViewDidLoadCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SportsEventChartViewModel$Input$OnVisibilityChangedCase;", "Lcom/polymarket/usviewmodels/SportsEventChartViewModel$Input;", "associated0", "", "<init>", "(Z)V", "getAssociated0", "()Z", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnVisibilityChangedCase extends Input {
            private final boolean associated0;

            public OnVisibilityChangedCase(boolean z) {
                super(null);
                this.associated0 = z;
            }

            public final boolean getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnRetry$cp() {
            return onRetry;
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
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usviewmodels/SportsEventChartViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/SportsEventChartViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/SportsEventChartViewModel$Input;", "onSelectTimeframe", "associated0", "Lcom/polymarket/data/ETimeSeriesInterval;", "onRetry", "getOnRetry", "onChartInteractionChanged", "", "onVisibilityChanged", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnRetry() {
                return Input.access$getOnRetry$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input onChartInteractionChanged(boolean associated0) {
                return new OnChartInteractionChangedCase(associated0);
            }

            public final Input onSelectTimeframe(ETimeSeriesInterval associated0) {
                associated0.getClass();
                return new OnSelectTimeframeCase(associated0);
            }

            public final Input onVisibilityChanged(boolean associated0) {
                return new OnVisibilityChangedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0006\u0010\u000b\u001a\u00020\fJ\t\u0010\r\u001a\u00020\fH\u0082 ¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/SportsEventChartViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "sportsEvent", "Lcom/polymarket/data/EEvent;", "callbacks", "Lcom/polymarket/usviewmodels/SportsEventChartViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/SportsEventChartViewModel;", "Swift_Companion_mock_4", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(EEvent sportsEvent, Callbacks callbacks);

        private final native SportsEventChartViewModel Swift_Companion_mock_4();

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, EEvent eEvent, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(eEvent, callbacks);
        }

        public final SportsEventChartViewModel mock() {
            return Swift_Companion_mock_4();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0015\u0010\u0011\u001a\u00020\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\r\u0010\u0018\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u001a2\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u001a2\u0006\u0010\u001b\u001a\u00020\u0017H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/polymarket/usviewmodels/SportsEventChartViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "()V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Callbacks() {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0();
        }

        private final native long Swift_constructor_0();

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

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    public SportsEventChartViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    public /* synthetic */ SportsEventChartViewModel(EEvent eEvent, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eEvent, (i & 2) != 0 ? new Callbacks() : callbacks);
    }
}
