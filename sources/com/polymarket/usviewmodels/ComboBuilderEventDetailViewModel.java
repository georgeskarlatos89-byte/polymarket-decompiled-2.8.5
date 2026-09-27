package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.EEvent;
import com.polymarket.data.EMarket;
import com.polymarket.data.EMarketCache;
import com.polymarket.data.ESportsSlug;
import com.polymarket.usviewmodels.AppViewModel;
import com.polymarket.usviewmodels.BodyTabBarPresentation;
import com.polymarket.usviewmodels.USEventDetailSectionsViewModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 y2\u00020\u0001:\u0003wxyB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001f\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u0017\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J!\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001a0\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001f\u001a\u00020 J\u001f\u0010!\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\"\u001a\u00020 H\u0082 J\u0015\u0010&\u001a\u00020 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010+\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00100\u001a\u00020-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u00106\u001a\b\u0012\u0004\u0012\u000203022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00109\u001a\u00020-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010=\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010@\u001a\u00020-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010A\u001a\u00020\f2\u0006\u0010B\u001a\u000203J\u001d\u0010C\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010D\u001a\u000203H\u0082 J\u0015\u0010G\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010J\u001a\b\u0012\u0004\u0012\u00020\f022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010O\u001a\u0004\u0018\u00010L2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010R\u001a\u00020-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010W\u001a\u00020T2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010Z\u001a\b\u0012\u0004\u0012\u00020 022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010]\u001a\u00020-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010^\u001a\u00020_H\u0016J\u0015\u0010`\u001a\u00020_2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0014\u0010a\u001a\u00020_2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0cJ#\u0010e\u001a\u00020_2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0cH\u0082 J\u000e\u0010f\u001a\u00020_2\u0006\u0010g\u001a\u00020hJ\u001d\u0010i\u001a\u00020_2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010g\u001a\u00020hH\u0082 J\u000e\u0010j\u001a\u00020_2\u0006\u0010k\u001a\u00020\u000fJ\u001d\u0010l\u001a\u00020_2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010k\u001a\u00020\u000fH\u0082 J\u001a\u0010m\u001a\u00020_2\u0012\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020o0\u0019J)\u0010p\u001a\u00020_2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0012\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020o0\u0019H\u0082 J\u0016\u0010q\u001a\b\u0012\u0004\u0012\u00020s0r2\u0006\u0010t\u001a\u00020uH\u0016J\u0017\u0010v\u001a\b\u0012\u0004\u0012\u00020s0r2\u0006\u0010t\u001a\u00020uH\u0082 R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001a0\u00198F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010'\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010,\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0017\u00101\u001a\b\u0012\u0004\u0012\u000203028F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u00107\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b8\u0010/R\u0011\u0010:\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0011\u0010>\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b?\u0010/R\u0011\u0010E\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bF\u0010<R\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020\f028F¢\u0006\u0006\u001a\u0004\bI\u00105R\u0013\u0010K\u001a\u0004\u0018\u00010L8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0011\u0010P\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\bQ\u0010/R\u0011\u0010S\u001a\u00020T8F¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0017\u0010X\u001a\b\u0012\u0004\u0012\u00020 028F¢\u0006\u0006\u001a\u0004\bY\u00105R\u0011\u0010[\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b\\\u0010/¨\u0006z"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventDetailViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "(Lcom/polymarket/usviewmodels/AppSceneType;Ljava/lang/String;)V", "event", "Lcom/polymarket/data/EEvent;", "getEvent", "()Lcom/polymarket/data/EEvent;", "Swift_event", "headerVM", "Lcom/polymarket/usviewmodels/USSportsGameHeaderViewModel;", "getHeaderVM", "()Lcom/polymarket/usviewmodels/USSportsGameHeaderViewModel;", "Swift_headerVM", "tabVMs", "", "Lcom/polymarket/usviewmodels/USMarketGroupTabViewModel;", "getTabVMs", "()Ljava/util/Map;", "Swift_tabVMs", "tabVM", "forTab", "Lcom/polymarket/usviewmodels/BodyTabBarPresentation$BodyTab;", "Swift_tabVM_0", "tab", "bodyTab", "getBodyTab", "()Lcom/polymarket/usviewmodels/BodyTabBarPresentation$BodyTab;", "Swift_bodyTab", "bodyTabBarPresentation", "Lcom/polymarket/usviewmodels/BodyTabBarPresentation;", "getBodyTabBarPresentation", "()Lcom/polymarket/usviewmodels/BodyTabBarPresentation;", "Swift_bodyTabBarPresentation", "hasLoadedDetails", "", "getHasLoadedDetails", "()Z", "Swift_hasLoadedDetails", "primaryMarketRows", "", "Lcom/polymarket/usviewmodels/SportsOutcomePresentation;", "getPrimaryMarketRows", "()Ljava/util/List;", "Swift_primaryMarketRows", "hasPrimaryMarketRows", "getHasPrimaryMarketRows", "Swift_hasPrimaryMarketRows", "primaryMarketSectionTitle", "getPrimaryMarketSectionTitle", "()Ljava/lang/String;", "Swift_primaryMarketSectionTitle", "showsPrimaryMarketSection", "getShowsPrimaryMarketSection", "Swift_showsPrimaryMarketSection", "primaryMarketButtonTitle", "for_", "Swift_primaryMarketButtonTitle_1", "row", "navBarEventContextPrimaryText", "getNavBarEventContextPrimaryText", "Swift_navBarEventContextPrimaryText", "navBarEventContextSecondaryTexts", "getNavBarEventContextSecondaryTexts", "Swift_navBarEventContextSecondaryTexts", "navBarEventContextSportSlug", "Lcom/polymarket/data/ESportsSlug;", "getNavBarEventContextSportSlug", "()Lcom/polymarket/data/ESportsSlug;", "Swift_navBarEventContextSportSlug", "expectsBodyTabContent", "getExpectsBodyTabContent", "Swift_expectsBodyTabContent", "bodyTabSkeletonStyle", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$BodyTabSkeletonStyle;", "getBodyTabSkeletonStyle", "()Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$BodyTabSkeletonStyle;", "Swift_bodyTabSkeletonStyle", "availableBodyTabs", "getAvailableBodyTabs", "Swift_availableBodyTabs", "hasAnyBodyTabContent", "getHasAnyBodyTabContent", "Swift_hasAnyBodyTabContent", "setup", "", "Swift_setup_3", "applySelectedMarketSides", "keys", "", "Lcom/polymarket/usviewmodels/MarketSideKey;", "Swift_applySelectedMarketSides_4", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/ComboBuilderEventDetailViewModel$Input;", "Swift_sendInput_5", "applyEventUpdate", "newEvent", "Swift_applyEventUpdate_6", "applyMarketCacheUpdates", "updates", "Lcom/polymarket/data/EMarketCache;", "Swift_applyMarketCacheUpdates_7", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComboBuilderEventDetailViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventDetailViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    public /* synthetic */ ComboBuilderEventDetailViewModel(AppSceneType appSceneType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AppSceneDefault() : appSceneType, (i & 2) != 0 ? null : str);
    }

    private final native void Swift_applyEventUpdate_6(long Swift_peer, EEvent newEvent);

    private final native void Swift_applyMarketCacheUpdates_7(long Swift_peer, Map<String, EMarketCache> updates);

    private final native void Swift_applySelectedMarketSides_4(long Swift_peer, Set<MarketSideKey> keys);

    private final native List<BodyTabBarPresentation.BodyTab> Swift_availableBodyTabs(long Swift_peer);

    private final native BodyTabBarPresentation.BodyTab Swift_bodyTab(long Swift_peer);

    private final native BodyTabBarPresentation Swift_bodyTabBarPresentation(long Swift_peer);

    private final native USEventDetailSectionsViewModel.BodyTabSkeletonStyle Swift_bodyTabSkeletonStyle(long Swift_peer);

    private final native EEvent Swift_event(long Swift_peer);

    private final native boolean Swift_expectsBodyTabContent(long Swift_peer);

    private final native boolean Swift_hasAnyBodyTabContent(long Swift_peer);

    private final native boolean Swift_hasLoadedDetails(long Swift_peer);

    private final native boolean Swift_hasPrimaryMarketRows(long Swift_peer);

    private final native USSportsGameHeaderViewModel Swift_headerVM(long Swift_peer);

    private final native String Swift_navBarEventContextPrimaryText(long Swift_peer);

    private final native List<String> Swift_navBarEventContextSecondaryTexts(long Swift_peer);

    private final native ESportsSlug Swift_navBarEventContextSportSlug(long Swift_peer);

    private final native String Swift_primaryMarketButtonTitle_1(long Swift_peer, SportsOutcomePresentation row);

    private final native List<SportsOutcomePresentation> Swift_primaryMarketRows(long Swift_peer);

    private final native String Swift_primaryMarketSectionTitle(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_sendInput_5(long Swift_peer, Input input);

    private final native void Swift_setup_3(long Swift_peer);

    private final native boolean Swift_showsPrimaryMarketSection(long Swift_peer);

    private final native USMarketGroupTabViewModel Swift_tabVM_0(long Swift_peer, BodyTabBarPresentation.BodyTab tab);

    private final native Map<String, USMarketGroupTabViewModel> Swift_tabVMs(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final void applyEventUpdate(EEvent newEvent) {
        newEvent.getClass();
        Swift_applyEventUpdate_6(getSwift_peer(), newEvent);
    }

    public final void applyMarketCacheUpdates(Map<String, EMarketCache> updates) {
        updates.getClass();
        Swift_applyMarketCacheUpdates_7(getSwift_peer(), updates);
    }

    public final void applySelectedMarketSides(Set<MarketSideKey> keys) {
        keys.getClass();
        Swift_applySelectedMarketSides_4(getSwift_peer(), keys);
    }

    public final List<BodyTabBarPresentation.BodyTab> getAvailableBodyTabs() {
        return Swift_availableBodyTabs(getSwift_peer());
    }

    public final BodyTabBarPresentation.BodyTab getBodyTab() {
        return Swift_bodyTab(getSwift_peer());
    }

    public final BodyTabBarPresentation getBodyTabBarPresentation() {
        return Swift_bodyTabBarPresentation(getSwift_peer());
    }

    public final USEventDetailSectionsViewModel.BodyTabSkeletonStyle getBodyTabSkeletonStyle() {
        return Swift_bodyTabSkeletonStyle(getSwift_peer());
    }

    public final EEvent getEvent() {
        return Swift_event(getSwift_peer());
    }

    public final boolean getExpectsBodyTabContent() {
        return Swift_expectsBodyTabContent(getSwift_peer());
    }

    public final boolean getHasAnyBodyTabContent() {
        return Swift_hasAnyBodyTabContent(getSwift_peer());
    }

    public final boolean getHasLoadedDetails() {
        return Swift_hasLoadedDetails(getSwift_peer());
    }

    public final boolean getHasPrimaryMarketRows() {
        return Swift_hasPrimaryMarketRows(getSwift_peer());
    }

    public final USSportsGameHeaderViewModel getHeaderVM() {
        return Swift_headerVM(getSwift_peer());
    }

    public final String getNavBarEventContextPrimaryText() {
        return Swift_navBarEventContextPrimaryText(getSwift_peer());
    }

    public final List<String> getNavBarEventContextSecondaryTexts() {
        return Swift_navBarEventContextSecondaryTexts(getSwift_peer());
    }

    public final ESportsSlug getNavBarEventContextSportSlug() {
        return Swift_navBarEventContextSportSlug(getSwift_peer());
    }

    public final List<SportsOutcomePresentation> getPrimaryMarketRows() {
        return Swift_primaryMarketRows(getSwift_peer());
    }

    public final String getPrimaryMarketSectionTitle() {
        return Swift_primaryMarketSectionTitle(getSwift_peer());
    }

    public final boolean getShowsPrimaryMarketSection() {
        return Swift_showsPrimaryMarketSection(getSwift_peer());
    }

    public final Map<String, USMarketGroupTabViewModel> getTabVMs() {
        return Swift_tabVMs(getSwift_peer());
    }

    public final String primaryMarketButtonTitle(SportsOutcomePresentation for_) {
        for_.getClass();
        return Swift_primaryMarketButtonTitle_1(getSwift_peer(), for_);
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_5(getSwift_peer(), input);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_3(getSwift_peer());
    }

    public final USMarketGroupTabViewModel tabVM(BodyTabBarPresentation.BodyTab forTab) {
        forTab.getClass();
        return Swift_tabVM_0(getSwift_peer(), forTab);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00142\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventDetailViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidAppearCase", "OnBodyTabSelectedCase", "OnPrimaryMarketSideSelectedCase", "Companion", "Lcom/polymarket/usviewmodels/ComboBuilderEventDetailViewModel$Input$OnBodyTabSelectedCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventDetailViewModel$Input$OnPrimaryMarketSideSelectedCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventDetailViewModel$Input$OnViewDidAppearCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidAppear = new OnViewDidAppearCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventDetailViewModel$Input$OnBodyTabSelectedCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventDetailViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/BodyTabBarPresentation$BodyTab;", "<init>", "(Lcom/polymarket/usviewmodels/BodyTabBarPresentation$BodyTab;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/BodyTabBarPresentation$BodyTab;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnBodyTabSelectedCase extends Input {
            private final BodyTabBarPresentation.BodyTab associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnBodyTabSelectedCase(BodyTabBarPresentation.BodyTab bodyTab) {
                super(null);
                bodyTab.getClass();
                this.associated0 = bodyTab;
            }

            public final BodyTabBarPresentation.BodyTab getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventDetailViewModel$Input$OnPrimaryMarketSideSelectedCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventDetailViewModel$Input;", "associated0", "Lcom/polymarket/data/EMarket;", "associated1", "Lcom/polymarket/data/EMarket$MarketSide;", "<init>", "(Lcom/polymarket/data/EMarket;Lcom/polymarket/data/EMarket$MarketSide;)V", "getAssociated0", "()Lcom/polymarket/data/EMarket;", "getAssociated1", "()Lcom/polymarket/data/EMarket$MarketSide;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPrimaryMarketSideSelectedCase extends Input {
            private final EMarket associated0;
            private final EMarket.MarketSide associated1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnPrimaryMarketSideSelectedCase(EMarket eMarket, EMarket.MarketSide marketSide) {
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
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventDetailViewModel$Input$OnViewDidAppearCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventDetailViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidAppearCase extends Input {
            public OnViewDidAppearCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnViewDidAppear$cp() {
            return onViewDidAppear;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventDetailViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidAppear", "Lcom/polymarket/usviewmodels/ComboBuilderEventDetailViewModel$Input;", "getOnViewDidAppear", "()Lcom/polymarket/usviewmodels/ComboBuilderEventDetailViewModel$Input;", "onBodyTabSelected", "associated0", "Lcom/polymarket/usviewmodels/BodyTabBarPresentation$BodyTab;", "onPrimaryMarketSideSelected", "Lcom/polymarket/data/EMarket;", "associated1", "Lcom/polymarket/data/EMarket$MarketSide;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnViewDidAppear() {
                return Input.access$getOnViewDidAppear$cp();
            }

            public final Input onBodyTabSelected(BodyTabBarPresentation.BodyTab associated0) {
                associated0.getClass();
                return new OnBodyTabSelectedCase(associated0);
            }

            public final Input onPrimaryMarketSideSelected(EMarket associated0, EMarket.MarketSide associated1) {
                associated0.getClass();
                associated1.getClass();
                return new OnPrimaryMarketSideSelectedCase(associated0, associated1);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0082 ¨\u0006\u000b"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventDetailViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_2", "", "Lskip/bridge/SwiftObjectPointer;", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_2(AppSceneType scene, String id);

        public static final /* synthetic */ long access$Swift_Companion_constructor_2(Companion companion, AppSceneType appSceneType, String str) {
            return companion.Swift_Companion_constructor_2(appSceneType, str);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComboBuilderEventDetailViewModel(AppSceneType appSceneType, String str) {
        super(Companion.access$Swift_Companion_constructor_2(INSTANCE, appSceneType, str), (SwiftPeerMarker) null);
        appSceneType.getClass();
    }

    public ComboBuilderEventDetailViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }
}
