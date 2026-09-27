package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.clients.ClientExperimentKey;
import com.polymarket.data.EEvent;
import com.polymarket.data.EMarket;
import com.polymarket.data.EUserPosition;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.ace;
import defpackage.qx7;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 L2\u00020\u0001:\u0003JKLB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB9\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0007\u0010\u0014J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J!\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020!0 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0010\u0010%\u001a\u0004\u0018\u00010!2\u0006\u0010&\u001a\u00020\u001bJ\u001f\u0010'\u001a\u0004\u0018\u00010!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010(\u001a\u00020\u001bH\u0082 J\u0015\u0010,\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u00100\u001a\b\u0012\u0004\u0012\u00020.0\u000e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u00101\u001a\u000202H\u0016J\u0015\u00103\u001a\u0002022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u00104\u001a\u0002022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ%\u00105\u001a\u0002022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00106\u001a\u00020\n2\u0006\u00107\u001a\u00020\fH\u0082 J\u0014\u00108\u001a\u0002022\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ#\u0010:\u001a\u0002022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082 J\u0014\u0010;\u001a\u0002022\f\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=J#\u0010?\u001a\u0002022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=H\u0082 J\u000e\u0010@\u001a\u0002022\u0006\u0010A\u001a\u00020BJ\u001d\u0010C\u001a\u0002022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010A\u001a\u00020BH\u0082 J\u0016\u0010D\u001a\b\u0012\u0004\u0012\u00020F0E2\u0006\u0010G\u001a\u00020HH\u0016J\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020F0E2\u0006\u0010G\u001a\u00020HH\u0082 R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020!0 8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010)\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u001d¨\u0006M"}, d2 = {"Lcom/polymarket/usviewmodels/USGameLineSectionViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "descriptor", "Lcom/polymarket/usviewmodels/USGameLineSectionDescriptor;", "event", "Lcom/polymarket/data/EEvent;", "positions", "", "Lcom/polymarket/data/EUserPosition;", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", "callbacks", "Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/USGameLineSectionDescriptor;Lcom/polymarket/data/EEvent;Ljava/util/List;Lcom/polymarket/usviewmodels/AppSceneType;Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Callbacks;)V", "header", "Lcom/polymarket/usviewmodels/GameLineSectionPresentation;", "getHeader", "()Lcom/polymarket/usviewmodels/GameLineSectionPresentation;", "Swift_header", "visibleRowIDs", "", "getVisibleRowIDs", "()Ljava/util/List;", "Swift_visibleRowIDs", "outcomeVMs", "", "Lcom/polymarket/usviewmodels/USMarketOutcomeViewModel;", "getOutcomeVMs", "()Ljava/util/Map;", "Swift_outcomeVMs", "outcomeVM", "forID", "Swift_outcomeVM_0", "rowID", "rowsToggleTitle", "getRowsToggleTitle", "()Ljava/lang/String;", "Swift_rowsToggleTitle", "activeExperiments", "Lcom/polymarket/clients/ClientExperimentKey;", "getActiveExperiments", "Swift_activeExperiments", "setup", "", "Swift_setup_2", "applyUpdate", "Swift_applyUpdate_3", "newDescriptor", "newEvent", "applyPositionsUpdate", "newPositions", "Swift_applyPositionsUpdate_4", "applySelectedMarketSides", "keys", "", "Lcom/polymarket/usviewmodels/MarketSideKey;", "Swift_applySelectedMarketSides_5", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Input;", "Swift_sendInput_6", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class USGameLineSectionViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USGameLineSectionViewModel(USGameLineSectionDescriptor uSGameLineSectionDescriptor, EEvent eEvent, List<EUserPosition> list, AppSceneType appSceneType, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_1(INSTANCE, uSGameLineSectionDescriptor, eEvent, list, appSceneType, callbacks), (SwiftPeerMarker) null);
        uSGameLineSectionDescriptor.getClass();
        eEvent.getClass();
        list.getClass();
        appSceneType.getClass();
        callbacks.getClass();
    }

    private final native List<ClientExperimentKey> Swift_activeExperiments(long Swift_peer);

    private final native void Swift_applyPositionsUpdate_4(long Swift_peer, List<EUserPosition> newPositions);

    private final native void Swift_applySelectedMarketSides_5(long Swift_peer, Set<MarketSideKey> keys);

    private final native void Swift_applyUpdate_3(long Swift_peer, USGameLineSectionDescriptor newDescriptor, EEvent newEvent);

    private final native GameLineSectionPresentation Swift_header(long Swift_peer);

    private final native USMarketOutcomeViewModel Swift_outcomeVM_0(long Swift_peer, String rowID);

    private final native Map<String, USMarketOutcomeViewModel> Swift_outcomeVMs(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_rowsToggleTitle(long Swift_peer);

    private final native void Swift_sendInput_6(long Swift_peer, Input input);

    private final native void Swift_setup_2(long Swift_peer);

    private final native List<String> Swift_visibleRowIDs(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final void applyPositionsUpdate(List<EUserPosition> newPositions) {
        newPositions.getClass();
        Swift_applyPositionsUpdate_4(getSwift_peer(), newPositions);
    }

    public final void applySelectedMarketSides(Set<MarketSideKey> keys) {
        keys.getClass();
        Swift_applySelectedMarketSides_5(getSwift_peer(), keys);
    }

    public final void applyUpdate(USGameLineSectionDescriptor descriptor, EEvent event) {
        descriptor.getClass();
        event.getClass();
        Swift_applyUpdate_3(getSwift_peer(), descriptor, event);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public List<ClientExperimentKey> getActiveExperiments() {
        return Swift_activeExperiments(getSwift_peer());
    }

    public final GameLineSectionPresentation getHeader() {
        return Swift_header(getSwift_peer());
    }

    public final Map<String, USMarketOutcomeViewModel> getOutcomeVMs() {
        return Swift_outcomeVMs(getSwift_peer());
    }

    public final String getRowsToggleTitle() {
        return Swift_rowsToggleTitle(getSwift_peer());
    }

    public final List<String> getVisibleRowIDs() {
        return Swift_visibleRowIDs(getSwift_peer());
    }

    public final USMarketOutcomeViewModel outcomeVM(String forID) {
        forID.getClass();
        return Swift_outcomeVM_0(getSwift_peer(), forID);
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_6(getSwift_peer(), input);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_2(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00172\u00020\u0001:\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnSubBucketSelectedCase", "OnAlternativeLineSelectedCase", "OnToggleLineDialCase", "OnToggleExpandedCase", "OnToggleRowsExpandedCase", "OnOutcomeSelectedCase", "Companion", "Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Input$OnAlternativeLineSelectedCase;", "Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Input$OnOutcomeSelectedCase;", "Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Input$OnSubBucketSelectedCase;", "Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Input$OnToggleExpandedCase;", "Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Input$OnToggleLineDialCase;", "Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Input$OnToggleRowsExpandedCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onToggleLineDial = new OnToggleLineDialCase();
        private static final Input onToggleExpanded = new OnToggleExpandedCase();
        private static final Input onToggleRowsExpanded = new OnToggleRowsExpandedCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Input$OnAlternativeLineSelectedCase;", "Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Input;", "associated0", "", "<init>", "(I)V", "getAssociated0", "()I", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnAlternativeLineSelectedCase extends Input {
            private final int associated0;

            public OnAlternativeLineSelectedCase(int i) {
                super(null);
                this.associated0 = i;
            }

            public final int getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Input$OnOutcomeSelectedCase;", "Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Input;", "associated0", "Lcom/polymarket/data/EMarket;", "associated1", "Lcom/polymarket/data/EMarket$MarketSide;", "<init>", "(Lcom/polymarket/data/EMarket;Lcom/polymarket/data/EMarket$MarketSide;)V", "getAssociated0", "()Lcom/polymarket/data/EMarket;", "getAssociated1", "()Lcom/polymarket/data/EMarket$MarketSide;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnOutcomeSelectedCase extends Input {
            private final EMarket associated0;
            private final EMarket.MarketSide associated1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnOutcomeSelectedCase(EMarket eMarket, EMarket.MarketSide marketSide) {
                super(null);
                eMarket.getClass();
                marketSide.getClass();
                this.associated0 = eMarket;
                this.associated1 = marketSide;
            }

            public final EMarket getAssociated0() {
                return this.associated0;
            }

            public final EMarket.MarketSide getAssociated1() {
                return this.associated1;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Input$OnSubBucketSelectedCase;", "Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSubBucketSelectedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSubBucketSelectedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Input$OnToggleExpandedCase;", "Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnToggleExpandedCase extends Input {
            public OnToggleExpandedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Input$OnToggleLineDialCase;", "Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnToggleLineDialCase extends Input {
            public OnToggleLineDialCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Input$OnToggleRowsExpandedCase;", "Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnToggleRowsExpandedCase extends Input {
            public OnToggleRowsExpandedCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnToggleExpanded$cp() {
            return onToggleExpanded;
        }

        public static final /* synthetic */ Input access$getOnToggleLineDial$cp() {
            return onToggleLineDial;
        }

        public static final /* synthetic */ Input access$getOnToggleRowsExpanded$cp() {
            return onToggleRowsExpanded;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tJ\u0016\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Input$Companion;", "", "<init>", "()V", "onSubBucketSelected", "Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Input;", "associated0", "", "onAlternativeLineSelected", "", "onToggleLineDial", "getOnToggleLineDial", "()Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Input;", "onToggleExpanded", "getOnToggleExpanded", "onToggleRowsExpanded", "getOnToggleRowsExpanded", "onOutcomeSelected", "Lcom/polymarket/data/EMarket;", "associated1", "Lcom/polymarket/data/EMarket$MarketSide;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnToggleExpanded() {
                return Input.access$getOnToggleExpanded$cp();
            }

            public final Input getOnToggleLineDial() {
                return Input.access$getOnToggleLineDial$cp();
            }

            public final Input getOnToggleRowsExpanded() {
                return Input.access$getOnToggleRowsExpanded$cp();
            }

            public final Input onAlternativeLineSelected(int associated0) {
                return new OnAlternativeLineSelectedCase(associated0);
            }

            public final Input onOutcomeSelected(EMarket associated0, EMarket.MarketSide associated1) {
                associated0.getClass();
                associated1.getClass();
                return new OnOutcomeSelectedCase(associated0, associated1);
            }

            public final Input onSubBucketSelected(String associated0) {
                associated0.getClass();
                return new OnSubBucketSelectedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082 J\u0010\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\t\u001a\u00020\nJ\u0011\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nH\u0082 ¨\u0006\u0015"}, d2 = {"Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_1", "", "Lskip/bridge/SwiftObjectPointer;", "descriptor", "Lcom/polymarket/usviewmodels/USGameLineSectionDescriptor;", "event", "Lcom/polymarket/data/EEvent;", "positions", "", "Lcom/polymarket/data/EUserPosition;", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", "callbacks", "Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/USGameLineSectionViewModel;", "Swift_Companion_mock_7", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_1(USGameLineSectionDescriptor descriptor, EEvent event, List<EUserPosition> positions, AppSceneType scene, Callbacks callbacks);

        private final native USGameLineSectionViewModel Swift_Companion_mock_7(EEvent event);

        public static final /* synthetic */ long access$Swift_Companion_constructor_1(Companion companion, USGameLineSectionDescriptor uSGameLineSectionDescriptor, EEvent eEvent, List list, AppSceneType appSceneType, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_1(uSGameLineSectionDescriptor, eEvent, list, appSceneType, callbacks);
        }

        public static /* synthetic */ USGameLineSectionViewModel mock$default(Companion companion, EEvent eEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                eEvent = EEvent.Companion.mockRealisticNBA$default(EEvent.INSTANCE, null, null, null, 7, null);
            }
            return companion.mock(eEvent);
        }

        public final USGameLineSectionViewModel mock(EEvent event) {
            event.getClass();
            return Swift_Companion_mock_7(event);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001%B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012 \b\u0002\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u000b¢\u0006\u0004\b\b\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\u000fJ\u0015\u0010\u0016\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J-\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J-\u0010 \u001a\u00060\u0004j\u0002`\u00052\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u000bH\u0082 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\"2\u0006\u0010#\u001a\u00020\u001cH\u0016J\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0\"2\u0006\u0010#\u001a\u00020\u001cH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R)\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006&"}, d2 = {"Lcom/polymarket/usviewmodels/USGameLineSectionViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onMarketSideSelected", "Lkotlin/Function3;", "Lcom/polymarket/data/EMarket;", "Lcom/polymarket/data/EMarket$MarketSide;", "Lcom/polymarket/data/EEvent;", "", "(Lkotlin/jvm/functions/Function3;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnMarketSideSelected", "()Lkotlin/jvm/functions/Function3;", "Swift_onMarketSideSelected", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Callbacks(Function3<? super EMarket, ? super EMarket.MarketSide, ? super EEvent, Unit> function3) {
            function3.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function3);
        }

        private final native long Swift_constructor_0(Function3<? super EMarket, ? super EMarket.MarketSide, ? super EEvent, Unit> onMarketSideSelected);

        private final native Function3<EMarket, EMarket.MarketSide, EEvent, Unit> Swift_onMarketSideSelected(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(EMarket eMarket, EMarket.MarketSide marketSide, EEvent eEvent) {
            ace.z(eEvent, eMarket, marketSide);
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(EEvent eEvent, EMarket eMarket, EMarket.MarketSide marketSide) {
            return _init_$lambda$0(eMarket, marketSide, eEvent);
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

        public final Function3<EMarket, EMarket.MarketSide, EEvent, Unit> getOnMarketSideSelected() {
            return Swift_onMarketSideSelected(this.Swift_peer);
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

        public /* synthetic */ Callbacks(Function3 function3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new qx7(27) : function3);
        }
    }

    public USGameLineSectionViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    public /* synthetic */ USGameLineSectionViewModel(USGameLineSectionDescriptor uSGameLineSectionDescriptor, EEvent eEvent, List list, AppSceneType appSceneType, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uSGameLineSectionDescriptor, eEvent, list, appSceneType, (i & 16) != 0 ? new Callbacks(null, 1, null) : callbacks);
    }
}
