package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.APICompetitionPromo;
import com.polymarket.data.EPromotionCampaign;
import com.polymarket.usviewmodels.AppViewModel;
import com.polymarket.usviewmodels.PromotionsViewModel;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.jbf;
import defpackage.l7f;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Array;
import skip.lib.ArrayKt;
import skip.lib.CaseIterable;
import skip.lib.CaseIterableCompanion;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 K2\u00020\u0001:\u0004HIJKB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013J\u001d\u0010\u0014\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0015\u001a\u00020\u0013H\u0082 J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013J\u001d\u0010\u0017\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0015\u001a\u00020\u0013H\u0082 J\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010$\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010%\u001a\u00020&2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010'\u001a\u00020\u001eH\u0082 J\u0015\u0010.\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010/\u001a\u00020&2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010'\u001a\u00020(H\u0082 J\u001b\u00103\u001a\b\u0012\u0004\u0012\u0002010\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u00106\u001a\b\u0012\u0004\u0012\u0002010\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00109\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010<\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010=\u001a\u00020&H\u0016J\u0015\u0010>\u001a\u00020&2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010?\u001a\u00020&2\u0006\u0010@\u001a\u00020AJ\u001d\u0010B\u001a\u00020&2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010@\u001a\u00020AH\u0082 J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010F\u001a\u00020\u001eH\u0016J\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010F\u001a\u00020\u001eH\u0082 R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010)\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0017\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00198F¢\u0006\u0006\u001a\u0004\b2\u0010\u001bR\u0017\u00104\u001a\b\u0012\u0004\u0012\u0002010\u00198F¢\u0006\u0006\u001a\u0004\b5\u0010\u001bR\u0011\u00107\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b8\u0010!R\u0011\u0010:\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b;\u0010!¨\u0006L"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsHubViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "callbacks", "Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Callbacks;)V", "navTitle", "", "getNavTitle", "()Ljava/lang/String;", "Swift_navTitle", "emptyStateTitle", "for_", "Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Tab;", "Swift_emptyStateTitle_0", "tab", "emptyStateSubtitle", "Swift_emptyStateSubtitle_1", "tabs", "", "getTabs", "()Ljava/util/List;", "Swift_tabs", "newValue", "", "currentTabIndex", "getCurrentTabIndex", "()I", "setCurrentTabIndex", "(I)V", "Swift_currentTabIndex", "Swift_currentTabIndex_set", "", "value", "", "scrollProgress", "getScrollProgress", "()D", "setScrollProgress", "(D)V", "Swift_scrollProgress", "Swift_scrollProgress_set", "activeItems", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item;", "getActiveItems", "Swift_activeItems", "pastItems", "getPastItems", "Swift_pastItems", "activeCount", "getActiveCount", "Swift_activeCount", "pastCount", "getPastCount", "Swift_pastCount", "setup", "Swift_setup_3", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input;", "Swift_sendInput_4", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Callbacks", "Tab", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PromotionsHubViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ PromotionsHubViewModel(Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Callbacks(null, null, null, null, 15, null) : callbacks);
    }

    private final native int Swift_activeCount(long Swift_peer);

    private final native List<PromotionsViewModel.Item> Swift_activeItems(long Swift_peer);

    private final native int Swift_currentTabIndex(long Swift_peer);

    private final native void Swift_currentTabIndex_set(long Swift_peer, int value);

    private final native String Swift_emptyStateSubtitle_1(long Swift_peer, Tab tab);

    private final native String Swift_emptyStateTitle_0(long Swift_peer, Tab tab);

    private final native String Swift_navTitle(long Swift_peer);

    private final native int Swift_pastCount(long Swift_peer);

    private final native List<PromotionsViewModel.Item> Swift_pastItems(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native double Swift_scrollProgress(long Swift_peer);

    private final native void Swift_scrollProgress_set(long Swift_peer, double value);

    private final native void Swift_sendInput_4(long Swift_peer, Input input);

    private final native void Swift_setup_3(long Swift_peer);

    private final native List<Tab> Swift_tabs(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String emptyStateSubtitle(Tab for_) {
        for_.getClass();
        return Swift_emptyStateSubtitle_1(getSwift_peer(), for_);
    }

    public final String emptyStateTitle(Tab for_) {
        for_.getClass();
        return Swift_emptyStateTitle_0(getSwift_peer(), for_);
    }

    public final int getActiveCount() {
        return Swift_activeCount(getSwift_peer());
    }

    public final List<PromotionsViewModel.Item> getActiveItems() {
        return Swift_activeItems(getSwift_peer());
    }

    public final int getCurrentTabIndex() {
        return Swift_currentTabIndex(getSwift_peer());
    }

    public final String getNavTitle() {
        return Swift_navTitle(getSwift_peer());
    }

    public final int getPastCount() {
        return Swift_pastCount(getSwift_peer());
    }

    public final List<PromotionsViewModel.Item> getPastItems() {
        return Swift_pastItems(getSwift_peer());
    }

    public final double getScrollProgress() {
        return Swift_scrollProgress(getSwift_peer());
    }

    public final List<Tab> getTabs() {
        return Swift_tabs(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_4(getSwift_peer(), input);
    }

    public final void setCurrentTabIndex(int i) {
        Swift_currentTabIndex_set(getSwift_peer(), i);
    }

    public final void setScrollProgress(double d) {
        Swift_scrollProgress_set(getSwift_peer(), d);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_3(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00192\u00020\u0001:\t\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\b\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnAppearCase", "OnDisappearCase", "OnDataUpdatedCase", "OnRefreshCase", "OnCloseCase", "OnTabSelectedCase", "OnScrollProgressChangedCase", "OnItemActionCase", "Companion", "Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input$OnAppearCase;", "Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input$OnCloseCase;", "Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input$OnDataUpdatedCase;", "Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input$OnDisappearCase;", "Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input$OnItemActionCase;", "Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input$OnRefreshCase;", "Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input$OnScrollProgressChangedCase;", "Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input$OnTabSelectedCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onAppear = new OnAppearCase();
        private static final Input onDisappear = new OnDisappearCase();
        private static final Input onDataUpdated = new OnDataUpdatedCase();
        private static final Input onRefresh = new OnRefreshCase();
        private static final Input onClose = new OnCloseCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input$OnAppearCase;", "Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnAppearCase extends Input {
            public OnAppearCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input$OnCloseCase;", "Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnCloseCase extends Input {
            public OnCloseCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input$OnDataUpdatedCase;", "Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDataUpdatedCase extends Input {
            public OnDataUpdatedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input$OnDisappearCase;", "Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDisappearCase extends Input {
            public OnDisappearCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input$OnItemActionCase;", "Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item;", "<init>", "(Lcom/polymarket/usviewmodels/PromotionsViewModel$Item;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/PromotionsViewModel$Item;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnItemActionCase extends Input {
            private final PromotionsViewModel.Item associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnItemActionCase(PromotionsViewModel.Item item) {
                super(null);
                item.getClass();
                this.associated0 = item;
            }

            public final PromotionsViewModel.Item getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input$OnRefreshCase;", "Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRefreshCase extends Input {
            public OnRefreshCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input$OnScrollProgressChangedCase;", "Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input;", "associated0", "", "<init>", "(D)V", "getAssociated0", "()D", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnScrollProgressChangedCase extends Input {
            private final double associated0;

            public OnScrollProgressChangedCase(double d) {
                super(null);
                this.associated0 = d;
            }

            public final double getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input$OnTabSelectedCase;", "Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input;", "associated0", "", "<init>", "(I)V", "getAssociated0", "()I", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnTabSelectedCase extends Input {
            private final int associated0;

            public OnTabSelectedCase(int i) {
                super(null);
                this.associated0 = i;
            }

            public final int getAssociated0() {
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

        public static final /* synthetic */ Input access$getOnClose$cp() {
            return onClose;
        }

        public static final /* synthetic */ Input access$getOnDataUpdated$cp() {
            return onDataUpdated;
        }

        public static final /* synthetic */ Input access$getOnDisappear$cp() {
            return onDisappear;
        }

        public static final /* synthetic */ Input access$getOnRefresh$cp() {
            return onRefresh;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input$Companion;", "", "<init>", "()V", "onAppear", "Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input;", "getOnAppear", "()Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Input;", "onDisappear", "getOnDisappear", "onDataUpdated", "getOnDataUpdated", "onRefresh", "getOnRefresh", "onClose", "getOnClose", "onTabSelected", "associated0", "", "onScrollProgressChanged", "", "onItemAction", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Item;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnAppear() {
                return Input.access$getOnAppear$cp();
            }

            public final Input getOnClose() {
                return Input.access$getOnClose$cp();
            }

            public final Input getOnDataUpdated() {
                return Input.access$getOnDataUpdated$cp();
            }

            public final Input getOnDisappear() {
                return Input.access$getOnDisappear$cp();
            }

            public final Input getOnRefresh() {
                return Input.access$getOnRefresh$cp();
            }

            public final Input onItemAction(PromotionsViewModel.Item associated0) {
                associated0.getClass();
                return new OnItemActionCase(associated0);
            }

            public final Input onScrollProgressChanged(double associated0) {
                return new OnScrollProgressChangedCase(associated0);
            }

            public final Input onTabSelected(int associated0) {
                return new OnTabSelectedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00192\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005:\u0001\u0019B\u001d\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0082 J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0082 R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u001a"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Tab;", "Lskip/lib/CaseIterable;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "active", "past", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "Swift_title", Keys.KEY_NAME, "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Tab implements CaseIterable, RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Tab[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Tab active = new Tab("active", 0, "active", null, 2, null);
        public static final Tab past = new Tab("past", 1, "past", null, 2, null);
        private final String rawValue;

        private static final /* synthetic */ Tab[] $values() {
            return new Tab[]{active, past};
        }

        static {
            Tab[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ Tab(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native String Swift_title(String name);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Tab valueOf(String str) {
            return (Tab) Enum.valueOf(Tab.class, str);
        }

        public static Tab[] values() {
            return (Tab[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        public final String getTitle() {
            return Swift_title(name());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Tab$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Tab;", "<init>", "()V", "init", "rawValue", "", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion implements CaseIterableCompanion<Tab> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // skip.lib.CaseIterableCompanion
            public Array<Tab> getAllCases() {
                return ArrayKt.arrayOf(Tab.active, Tab.past);
            }

            public final Tab init(String rawValue) {
                rawValue.getClass();
                if (Intrinsics.areEqual(rawValue, "active")) {
                    return Tab.active;
                }
                if (Intrinsics.areEqual(rawValue, "past")) {
                    return Tab.past;
                }
                return null;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private Tab(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0082 J\u0006\u0010\t\u001a\u00020\nJ\t\u0010\u000b\u001a\u00020\nH\u0082 J\u0010\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_2", "", "Lskip/bridge/SwiftObjectPointer;", "callbacks", "Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/PromotionsHubViewModel;", "Swift_Companion_mock_5", "Tab", "Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Tab;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_2(Callbacks callbacks);

        private final native PromotionsHubViewModel Swift_Companion_mock_5();

        public static final /* synthetic */ long access$Swift_Companion_constructor_2(Companion companion, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_2(callbacks);
        }

        public final Tab Tab(String rawValue) {
            rawValue.getClass();
            return Tab.INSTANCE.init(rawValue);
        }

        public final PromotionsHubViewModel mock() {
            return Swift_Companion_mock_5();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionsHubViewModel(Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_2(INSTANCE, callbacks), (SwiftPeerMarker) null);
        callbacks.getClass();
    }

    public PromotionsHubViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBU\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\b\u0010\u0013J\u0006\u0010\u0018\u001a\u00020\fJ\u0015\u0010\u0019\u001a\u00020\f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JQ\u0010*\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082 J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000b2\u0006\u0010,\u001a\u00020\u001fH\u0016J\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000b2\u0006\u0010,\u001a\u00020\u001fH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u000e8F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010!¨\u0006/"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionsHubViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onClose", "Lkotlin/Function0;", "", "onCampaignSelected", "Lkotlin/Function1;", "Lcom/polymarket/data/EPromotionCampaign;", "onCompetitionSelected", "Lcom/polymarket/data/APICompetitionPromo$CompetitionID;", "onDeposit", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnClose", "()Lkotlin/jvm/functions/Function0;", "Swift_onClose", "getOnCampaignSelected", "()Lkotlin/jvm/functions/Function1;", "Swift_onCampaignSelected", "getOnCompetitionSelected", "Swift_onCompetitionSelected", "getOnDeposit", "Swift_onDeposit", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function0 function0, Function1 function1, Function1 function12, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new jbf(4) : function0, (i & 2) != 0 ? new l7f(24) : function1, (i & 4) != 0 ? new l7f(25) : function12, (i & 8) != 0 ? new jbf(5) : function02);
        }

        private final native long Swift_constructor_0(Function0<Unit> onClose, Function1<? super EPromotionCampaign, Unit> onCampaignSelected, Function1<? super APICompetitionPromo.CompetitionID, Unit> onCompetitionSelected, Function0<Unit> onDeposit);

        private final native Function1<EPromotionCampaign, Unit> Swift_onCampaignSelected(long Swift_peer);

        private final native Function0<Unit> Swift_onClose(long Swift_peer);

        private final native Function1<APICompetitionPromo.CompetitionID, Unit> Swift_onCompetitionSelected(long Swift_peer);

        private final native Function0<Unit> Swift_onDeposit(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(EPromotionCampaign ePromotionCampaign) {
            ePromotionCampaign.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2(APICompetitionPromo.CompetitionID competitionID) {
            competitionID.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$3() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(APICompetitionPromo.CompetitionID competitionID) {
            return _init_$lambda$2(competitionID);
        }

        public static /* synthetic */ Unit b(EPromotionCampaign ePromotionCampaign) {
            return _init_$lambda$1(ePromotionCampaign);
        }

        public static /* synthetic */ Unit c() {
            return _init_$lambda$0();
        }

        public static /* synthetic */ Unit d() {
            return _init_$lambda$3();
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

        public final Function1<EPromotionCampaign, Unit> getOnCampaignSelected() {
            return Swift_onCampaignSelected(this.Swift_peer);
        }

        public final Function0<Unit> getOnClose() {
            return Swift_onClose(this.Swift_peer);
        }

        public final Function1<APICompetitionPromo.CompetitionID, Unit> getOnCompetitionSelected() {
            return Swift_onCompetitionSelected(this.Swift_peer);
        }

        public final Function0<Unit> getOnDeposit() {
            return Swift_onDeposit(this.Swift_peer);
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

        public Callbacks(Function0<Unit> function0, Function1<? super EPromotionCampaign, Unit> function1, Function1<? super APICompetitionPromo.CompetitionID, Unit> function12, Function0<Unit> function02) {
            function0.getClass();
            function1.getClass();
            function12.getClass();
            function02.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function0, function1, function12, function02);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
