package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.EMarket;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.unj;
import defpackage.zyi;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 =2\u00020\u0001:\u0003;<=B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB7\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0007\u0010\u0013J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u001b\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0015\u0010\u001e\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\"\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fJ1\u0010 \u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0082 J\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\nJ\u001d\u0010#\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\"\u001a\u00020\nH\u0082 J\u0014\u0010$\u001a\u00020\u001d2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&J#\u0010(\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H\u0082 J\u0012\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010\rJ!\u0010,\u001a\u0004\u0018\u00010*2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010-\u001a\u0004\u0018\u00010\rH\u0082 J\u001a\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010\r2\u0006\u0010.\u001a\u00020/J)\u00100\u001a\u0004\u0018\u00010*2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010-\u001a\u0004\u0018\u00010\r2\u0006\u0010.\u001a\u00020/H\u0082 J\u000e\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u000203J\u001d\u00104\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00102\u001a\u000203H\u0082 J\u0016\u00105\u001a\b\u0012\u0004\u0012\u000207062\u0006\u00108\u001a\u000209H\u0016J\u0017\u0010:\u001a\b\u0012\u0004\u0012\u000207062\u0006\u00108\u001a\u000209H\u0082 R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006>"}, d2 = {"Lcom/polymarket/usviewmodels/USPlayerPropRowViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "row", "Lcom/polymarket/usviewmodels/USPlayerPropRow;", "marketLookup", "", "", "Lcom/polymarket/usviewmodels/USPlayerPropMarketSides;", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", "callbacks", "Lcom/polymarket/usviewmodels/USPlayerPropRowViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/USPlayerPropRow;Ljava/util/Map;Lcom/polymarket/usviewmodels/AppSceneType;Lcom/polymarket/usviewmodels/USPlayerPropRowViewModel$Callbacks;)V", "presentation", "Lcom/polymarket/usviewmodels/PlayerPropRowPresentation;", "getPresentation", "()Lcom/polymarket/usviewmodels/PlayerPropRowPresentation;", "Swift_presentation", "getRow", "()Lcom/polymarket/usviewmodels/USPlayerPropRow;", "Swift_row", "setup", "", "Swift_setup_1", "applyRowUpdate", "Swift_applyRowUpdate_2", "applyMarketCacheUpdate", "rebuiltRow", "Swift_applyMarketCacheUpdate_3", "applySelectedMarketSides", "keys", "", "Lcom/polymarket/usviewmodels/MarketSideKey;", "Swift_applySelectedMarketSides_4", "marketSide", "Lcom/polymarket/data/EMarket$MarketSide;", "forMarkerID", "Swift_marketSide_5", "markerID", "isLong", "", "Swift_marketSide_6", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/USPlayerPropRowViewModel$Input;", "Swift_sendInput_7", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class USPlayerPropRowViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USPlayerPropRowViewModel(USPlayerPropRow uSPlayerPropRow, Map<String, USPlayerPropMarketSides> map, AppSceneType appSceneType, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, uSPlayerPropRow, map, appSceneType, callbacks), (SwiftPeerMarker) null);
        uSPlayerPropRow.getClass();
        map.getClass();
        appSceneType.getClass();
        callbacks.getClass();
    }

    private final native void Swift_applyMarketCacheUpdate_3(long Swift_peer, USPlayerPropRow rebuiltRow);

    private final native void Swift_applyRowUpdate_2(long Swift_peer, USPlayerPropRow row, Map<String, USPlayerPropMarketSides> marketLookup);

    private final native void Swift_applySelectedMarketSides_4(long Swift_peer, Set<MarketSideKey> keys);

    private final native EMarket.MarketSide Swift_marketSide_5(long Swift_peer, String markerID);

    private final native EMarket.MarketSide Swift_marketSide_6(long Swift_peer, String markerID, boolean isLong);

    private final native PlayerPropRowPresentation Swift_presentation(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native USPlayerPropRow Swift_row(long Swift_peer);

    private final native void Swift_sendInput_7(long Swift_peer, Input input);

    private final native void Swift_setup_1(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final void applyMarketCacheUpdate(USPlayerPropRow rebuiltRow) {
        rebuiltRow.getClass();
        Swift_applyMarketCacheUpdate_3(getSwift_peer(), rebuiltRow);
    }

    public final void applyRowUpdate(USPlayerPropRow row, Map<String, USPlayerPropMarketSides> marketLookup) {
        row.getClass();
        marketLookup.getClass();
        Swift_applyRowUpdate_2(getSwift_peer(), row, marketLookup);
    }

    public final void applySelectedMarketSides(Set<MarketSideKey> keys) {
        keys.getClass();
        Swift_applySelectedMarketSides_4(getSwift_peer(), keys);
    }

    public final PlayerPropRowPresentation getPresentation() {
        return Swift_presentation(getSwift_peer());
    }

    public final USPlayerPropRow getRow() {
        return Swift_row(getSwift_peer());
    }

    public final EMarket.MarketSide marketSide(String forMarkerID) {
        return Swift_marketSide_5(getSwift_peer(), forMarkerID);
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_7(getSwift_peer(), input);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\u0005\u0011\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/polymarket/usviewmodels/USPlayerPropRowViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnMarkerSelectedCase", "OnBuyTappedCase", "OnSideTappedCase", "OnPlayerTappedCase", "Companion", "Lcom/polymarket/usviewmodels/USPlayerPropRowViewModel$Input$OnBuyTappedCase;", "Lcom/polymarket/usviewmodels/USPlayerPropRowViewModel$Input$OnMarkerSelectedCase;", "Lcom/polymarket/usviewmodels/USPlayerPropRowViewModel$Input$OnPlayerTappedCase;", "Lcom/polymarket/usviewmodels/USPlayerPropRowViewModel$Input$OnSideTappedCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onBuyTapped = new OnBuyTappedCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USPlayerPropRowViewModel$Input$OnBuyTappedCase;", "Lcom/polymarket/usviewmodels/USPlayerPropRowViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnBuyTappedCase extends Input {
            public OnBuyTappedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/usviewmodels/USPlayerPropRowViewModel$Input$OnMarkerSelectedCase;", "Lcom/polymarket/usviewmodels/USPlayerPropRowViewModel$Input;", "associated0", "", "<init>", "(I)V", "getAssociated0", "()I", "index", "getIndex", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnMarkerSelectedCase extends Input {
            private final int associated0;
            private final int index;

            public OnMarkerSelectedCase(int i) {
                super(null);
                this.associated0 = i;
                this.index = i;
            }

            public final int getAssociated0() {
                return this.associated0;
            }

            public final int getIndex() {
                return this.index;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/usviewmodels/USPlayerPropRowViewModel$Input$OnPlayerTappedCase;", "Lcom/polymarket/usviewmodels/USPlayerPropRowViewModel$Input;", "associated0", "", "<init>", "(Z)V", "getAssociated0", "()Z", "expandsLine", "getExpandsLine", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPlayerTappedCase extends Input {
            private final boolean associated0;
            private final boolean expandsLine;

            public OnPlayerTappedCase(boolean z) {
                super(null);
                this.associated0 = z;
                this.expandsLine = z;
            }

            public final boolean getAssociated0() {
                return this.associated0;
            }

            public final boolean getExpandsLine() {
                return this.expandsLine;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/polymarket/usviewmodels/USPlayerPropRowViewModel$Input$OnSideTappedCase;", "Lcom/polymarket/usviewmodels/USPlayerPropRowViewModel$Input;", "associated0", "", "<init>", "(Z)V", "getAssociated0", "()Z", "isLong", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSideTappedCase extends Input {
            private final boolean associated0;
            private final boolean isLong;

            public OnSideTappedCase(boolean z) {
                super(null);
                this.associated0 = z;
                this.isLong = z;
            }

            public final boolean getAssociated0() {
                return this.associated0;
            }

            /* renamed from: isLong, reason: from getter */
            public final boolean getIsLong() {
                return this.isLong;
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnBuyTapped$cp() {
            return onBuyTapped;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usviewmodels/USPlayerPropRowViewModel$Input$Companion;", "", "<init>", "()V", "onMarkerSelected", "Lcom/polymarket/usviewmodels/USPlayerPropRowViewModel$Input;", "index", "", "onBuyTapped", "getOnBuyTapped", "()Lcom/polymarket/usviewmodels/USPlayerPropRowViewModel$Input;", "onSideTapped", "isLong", "", "onPlayerTapped", "expandsLine", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnBuyTapped() {
                return Input.access$getOnBuyTapped$cp();
            }

            public final Input onMarkerSelected(int index) {
                return new OnMarkerSelectedCase(index);
            }

            public final Input onPlayerTapped(boolean expandsLine) {
                return new OnPlayerTappedCase(expandsLine);
            }

            public final Input onSideTapped(boolean isLong) {
                return new OnSideTappedCase(isLong);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082 J\u0010\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\u0011\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0082 ¨\u0006\u0014"}, d2 = {"Lcom/polymarket/usviewmodels/USPlayerPropRowViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "row", "Lcom/polymarket/usviewmodels/USPlayerPropRow;", "marketLookup", "", "", "Lcom/polymarket/usviewmodels/USPlayerPropMarketSides;", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", "callbacks", "Lcom/polymarket/usviewmodels/USPlayerPropRowViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/USPlayerPropRowViewModel;", "Swift_Companion_mock_8", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(USPlayerPropRow row, Map<String, USPlayerPropMarketSides> marketLookup, AppSceneType scene, Callbacks callbacks);

        private final native USPlayerPropRowViewModel Swift_Companion_mock_8(Callbacks callbacks);

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, USPlayerPropRow uSPlayerPropRow, Map map, AppSceneType appSceneType, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(uSPlayerPropRow, map, appSceneType, callbacks);
        }

        public static /* synthetic */ USPlayerPropRowViewModel mock$default(Companion companion, Callbacks callbacks, int i, Object obj) {
            if ((i & 1) != 0) {
                callbacks = new Callbacks(null, null, 3, null);
            }
            return companion.mock(callbacks);
        }

        public final USPlayerPropRowViewModel mock(Callbacks callbacks) {
            callbacks.getClass();
            return Swift_Companion_mock_8(callbacks);
        }

        private Companion() {
        }
    }

    public final EMarket.MarketSide marketSide(String forMarkerID, boolean isLong) {
        return Swift_marketSide_6(getSwift_peer(), forMarkerID, isLong);
    }

    public USPlayerPropRowViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBI\b\u0016\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\"\b\u0002\u0010\u000f\u001a\u001c\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0010¢\u0006\u0004\b\b\u0010\u0014J\u0006\u0010\u0019\u001a\u00020\u000eJ\u0015\u0010\u001a\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J'\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J/\u0010%\u001a\u001c\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JI\u0010&\u001a\u00060\u0004j\u0002`\u00052\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b2 \u0010\u000f\u001a\u001c\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0010H\u0082 J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0(2\u0006\u0010)\u001a\u00020\u001fH\u0016J\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001d0(2\u0006\u0010)\u001a\u00020\u001fH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R#\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010!R+\u0010\u000f\u001a\u001c\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u00108F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006,"}, d2 = {"Lcom/polymarket/usviewmodels/USPlayerPropRowViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onBuy", "Lkotlin/Function2;", "Lcom/polymarket/data/EMarket;", "Lcom/polymarket/data/EMarket$MarketSide;", "", "onOpenPlayerProps", "Lkotlin/Function3;", "Lcom/polymarket/usviewmodels/USPlayerPropRow;", "Lcom/polymarket/usviewmodels/USPlayerPropMarketSides;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "other", "", "hashCode", "", "getOnBuy", "()Lkotlin/jvm/functions/Function2;", "Swift_onBuy", "getOnOpenPlayerProps", "()Lkotlin/jvm/functions/Function3;", "Swift_onOpenPlayerProps", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function2 function2, Function3 function3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((Function2<? super EMarket, ? super EMarket.MarketSide, Unit>) ((i & 1) != 0 ? new zyi(18) : function2), (Function3<? super USPlayerPropRow, ? super USPlayerPropMarketSides, ? super Boolean, Unit>) ((i & 2) != 0 ? new unj(5) : function3));
        }

        private final native long Swift_constructor_0(Function2<? super EMarket, ? super EMarket.MarketSide, Unit> onBuy, Function3<? super USPlayerPropRow, ? super USPlayerPropMarketSides, ? super Boolean, Unit> onOpenPlayerProps);

        private final native Function2<EMarket, EMarket.MarketSide, Unit> Swift_onBuy(long Swift_peer);

        private final native Function3<USPlayerPropRow, USPlayerPropMarketSides, Boolean, Unit> Swift_onOpenPlayerProps(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(EMarket eMarket, EMarket.MarketSide marketSide) {
            eMarket.getClass();
            marketSide.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(USPlayerPropRow uSPlayerPropRow, USPlayerPropMarketSides uSPlayerPropMarketSides, boolean z) {
            uSPlayerPropRow.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(USPlayerPropRow uSPlayerPropRow, USPlayerPropMarketSides uSPlayerPropMarketSides, boolean z) {
            return _init_$lambda$1(uSPlayerPropRow, uSPlayerPropMarketSides, z);
        }

        public static /* synthetic */ Unit b(EMarket eMarket, EMarket.MarketSide marketSide) {
            return _init_$lambda$0(eMarket, marketSide);
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

        public final Function2<EMarket, EMarket.MarketSide, Unit> getOnBuy() {
            return Swift_onBuy(this.Swift_peer);
        }

        public final Function3<USPlayerPropRow, USPlayerPropMarketSides, Boolean, Unit> getOnOpenPlayerProps() {
            return Swift_onOpenPlayerProps(this.Swift_peer);
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

        public Callbacks(Function2<? super EMarket, ? super EMarket.MarketSide, Unit> function2, Function3<? super USPlayerPropRow, ? super USPlayerPropMarketSides, ? super Boolean, Unit> function3) {
            function2.getClass();
            function3.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function2, function3);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    public /* synthetic */ USPlayerPropRowViewModel(USPlayerPropRow uSPlayerPropRow, Map map, AppSceneType appSceneType, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uSPlayerPropRow, map, appSceneType, (i & 8) != 0 ? new Callbacks(null, null, 3, null) : callbacks);
    }
}
