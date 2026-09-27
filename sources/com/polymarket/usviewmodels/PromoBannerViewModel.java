package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.EPromoBannerTemplate;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.d5f;
import defpackage.l7f;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.net.URI;
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
import skip.lib.Hasher;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 82\u00020\u0001:\u00045678B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rJ\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010\u0017\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082 J\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u00102\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010 \u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010H\u0082 J\u0015\u0010%\u001a\u00020\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010(\u001a\u00020\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010)\u001a\u00020\u0018H\u0016J\u0015\u0010*\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020-J\u001d\u0010.\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010,\u001a\u00020-H\u0082 J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00102\u001a\u000203H\u0016J\u0017\u00104\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00102\u001a\u000203H\u0082 R0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u001a\u001a\u0004\u0018\u00010\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010&\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b'\u0010$¨\u00069"}, d2 = {"Lcom/polymarket/usviewmodels/PromoBannerViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "surface", "Lcom/polymarket/usviewmodels/PromoBannerViewModel$Surface;", "callbacks", "Lcom/polymarket/usviewmodels/PromoBannerViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/PromoBannerViewModel$Surface;Lcom/polymarket/usviewmodels/PromoBannerViewModel$Callbacks;)V", "newValue", "", "Lcom/polymarket/data/EPromoBannerTemplate;", "visibleTemplates", "getVisibleTemplates", "()Ljava/util/List;", "setVisibleTemplates", "(Ljava/util/List;)V", "Swift_visibleTemplates", "Swift_visibleTemplates_set", "", "value", "rewardsTemplate", "getRewardsTemplate", "()Lcom/polymarket/data/EPromoBannerTemplate;", "setRewardsTemplate", "(Lcom/polymarket/data/EPromoBannerTemplate;)V", "Swift_rewardsTemplate", "Swift_rewardsTemplate_set", "hasVisibleBanners", "", "getHasVisibleBanners", "()Z", "Swift_hasVisibleBanners", "hasRewardsTemplate", "getHasRewardsTemplate", "Swift_hasRewardsTemplate", "setup", "Swift_setup_1", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/PromoBannerViewModel$Input;", "Swift_sendInput_2", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Surface", "Callbacks", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PromoBannerViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoBannerViewModel(Surface surface, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, surface, callbacks), (SwiftPeerMarker) null);
        surface.getClass();
        callbacks.getClass();
    }

    private final native boolean Swift_hasRewardsTemplate(long Swift_peer);

    private final native boolean Swift_hasVisibleBanners(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native EPromoBannerTemplate Swift_rewardsTemplate(long Swift_peer);

    private final native void Swift_rewardsTemplate_set(long Swift_peer, EPromoBannerTemplate value);

    private final native void Swift_sendInput_2(long Swift_peer, Input input);

    private final native void Swift_setup_1(long Swift_peer);

    private final native List<EPromoBannerTemplate> Swift_visibleTemplates(long Swift_peer);

    private final native void Swift_visibleTemplates_set(long Swift_peer, List<EPromoBannerTemplate> value);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final boolean getHasRewardsTemplate() {
        return Swift_hasRewardsTemplate(getSwift_peer());
    }

    public final boolean getHasVisibleBanners() {
        return Swift_hasVisibleBanners(getSwift_peer());
    }

    public final EPromoBannerTemplate getRewardsTemplate() {
        return Swift_rewardsTemplate(getSwift_peer());
    }

    public final List<EPromoBannerTemplate> getVisibleTemplates() {
        return Swift_visibleTemplates(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_2(getSwift_peer(), input);
    }

    public final void setRewardsTemplate(EPromoBannerTemplate ePromoBannerTemplate) {
        Swift_rewardsTemplate_set(getSwift_peer(), ePromoBannerTemplate);
    }

    public final void setVisibleTemplates(List<EPromoBannerTemplate> list) {
        list.getClass();
        Swift_visibleTemplates_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00142\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/polymarket/usviewmodels/PromoBannerViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnDismissCase", "OnActionCase", "OnRewardsSheetActionCase", "Companion", "Lcom/polymarket/usviewmodels/PromoBannerViewModel$Input$OnActionCase;", "Lcom/polymarket/usviewmodels/PromoBannerViewModel$Input$OnDismissCase;", "Lcom/polymarket/usviewmodels/PromoBannerViewModel$Input$OnRewardsSheetActionCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/PromoBannerViewModel$Input$OnActionCase;", "Lcom/polymarket/usviewmodels/PromoBannerViewModel$Input;", "associated0", "Lcom/polymarket/data/EPromoBannerTemplate;", "<init>", "(Lcom/polymarket/data/EPromoBannerTemplate;)V", "getAssociated0", "()Lcom/polymarket/data/EPromoBannerTemplate;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnActionCase extends Input {
            private final EPromoBannerTemplate associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnActionCase(EPromoBannerTemplate ePromoBannerTemplate) {
                super(null);
                ePromoBannerTemplate.getClass();
                this.associated0 = ePromoBannerTemplate;
            }

            public final EPromoBannerTemplate getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/usviewmodels/PromoBannerViewModel$Input$OnDismissCase;", "Lcom/polymarket/usviewmodels/PromoBannerViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "templateId", "getTemplateId", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDismissCase extends Input {
            private final String associated0;
            private final String templateId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnDismissCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
                this.templateId = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public final String getTemplateId() {
                return this.templateId;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/PromoBannerViewModel$Input$OnRewardsSheetActionCase;", "Lcom/polymarket/usviewmodels/PromoBannerViewModel$Input;", "associated0", "Lcom/polymarket/data/EPromoBannerTemplate;", "<init>", "(Lcom/polymarket/data/EPromoBannerTemplate;)V", "getAssociated0", "()Lcom/polymarket/data/EPromoBannerTemplate;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRewardsSheetActionCase extends Input {
            private final EPromoBannerTemplate associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnRewardsSheetActionCase(EPromoBannerTemplate ePromoBannerTemplate) {
                super(null);
                ePromoBannerTemplate.getClass();
                this.associated0 = ePromoBannerTemplate;
            }

            public final EPromoBannerTemplate getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/PromoBannerViewModel$Input$Companion;", "", "<init>", "()V", "onDismiss", "Lcom/polymarket/usviewmodels/PromoBannerViewModel$Input;", "templateId", "", "onAction", "associated0", "Lcom/polymarket/data/EPromoBannerTemplate;", "onRewardsSheetAction", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input onAction(EPromoBannerTemplate associated0) {
                associated0.getClass();
                return new OnActionCase(associated0);
            }

            public final Input onDismiss(String templateId) {
                templateId.getClass();
                return new OnDismissCase(templateId);
            }

            public final Input onRewardsSheetAction(EPromoBannerTemplate associated0) {
                associated0.getClass();
                return new OnRewardsSheetActionCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e2\u00020\u0001:\u0005\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/polymarket/usviewmodels/PromoBannerViewModel$Surface;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "UserProfileCase", "SportsEventDetailCase", "OrderBookCase", "BuyLimitOrderCase", "Companion", "Lcom/polymarket/usviewmodels/PromoBannerViewModel$Surface$BuyLimitOrderCase;", "Lcom/polymarket/usviewmodels/PromoBannerViewModel$Surface$OrderBookCase;", "Lcom/polymarket/usviewmodels/PromoBannerViewModel$Surface$SportsEventDetailCase;", "Lcom/polymarket/usviewmodels/PromoBannerViewModel$Surface$UserProfileCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Surface implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Surface userProfile = new UserProfileCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/polymarket/usviewmodels/PromoBannerViewModel$Surface$BuyLimitOrderCase;", "Lcom/polymarket/usviewmodels/PromoBannerViewModel$Surface;", "associated0", "", "", "<init>", "(Ljava/util/List;)V", "getAssociated0", "()Ljava/util/List;", "eventTagSlugs", "getEventTagSlugs", "equals", "", "other", "", "hashCode", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class BuyLimitOrderCase extends Surface {
            private final List<String> associated0;
            private final List<String> eventTagSlugs;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BuyLimitOrderCase(List<String> list) {
                super(null);
                list.getClass();
                this.associated0 = list;
                this.eventTagSlugs = list;
            }

            public boolean equals(Object other) {
                if (!(other instanceof BuyLimitOrderCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((BuyLimitOrderCase) other).associated0);
            }

            public final List<String> getAssociated0() {
                return this.associated0;
            }

            public final List<String> getEventTagSlugs() {
                return this.eventTagSlugs;
            }

            public int hashCode() {
                return Hasher.INSTANCE.combine(1, this.associated0);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/polymarket/usviewmodels/PromoBannerViewModel$Surface$OrderBookCase;", "Lcom/polymarket/usviewmodels/PromoBannerViewModel$Surface;", "associated0", "", "", "<init>", "(Ljava/util/List;)V", "getAssociated0", "()Ljava/util/List;", "eventTagSlugs", "getEventTagSlugs", "equals", "", "other", "", "hashCode", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OrderBookCase extends Surface {
            private final List<String> associated0;
            private final List<String> eventTagSlugs;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OrderBookCase(List<String> list) {
                super(null);
                list.getClass();
                this.associated0 = list;
                this.eventTagSlugs = list;
            }

            public boolean equals(Object other) {
                if (!(other instanceof OrderBookCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((OrderBookCase) other).associated0);
            }

            public final List<String> getAssociated0() {
                return this.associated0;
            }

            public final List<String> getEventTagSlugs() {
                return this.eventTagSlugs;
            }

            public int hashCode() {
                return Hasher.INSTANCE.combine(1, this.associated0);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/polymarket/usviewmodels/PromoBannerViewModel$Surface$SportsEventDetailCase;", "Lcom/polymarket/usviewmodels/PromoBannerViewModel$Surface;", "associated0", "", "", "<init>", "(Ljava/util/List;)V", "getAssociated0", "()Ljava/util/List;", "eventTagSlugs", "getEventTagSlugs", "equals", "", "other", "", "hashCode", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class SportsEventDetailCase extends Surface {
            private final List<String> associated0;
            private final List<String> eventTagSlugs;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SportsEventDetailCase(List<String> list) {
                super(null);
                list.getClass();
                this.associated0 = list;
                this.eventTagSlugs = list;
            }

            public boolean equals(Object other) {
                if (!(other instanceof SportsEventDetailCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((SportsEventDetailCase) other).associated0);
            }

            public final List<String> getAssociated0() {
                return this.associated0;
            }

            public final List<String> getEventTagSlugs() {
                return this.eventTagSlugs;
            }

            public int hashCode() {
                return Hasher.INSTANCE.combine(1, this.associated0);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/PromoBannerViewModel$Surface$UserProfileCase;", "Lcom/polymarket/usviewmodels/PromoBannerViewModel$Surface;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class UserProfileCase extends Surface {
            public UserProfileCase() {
                super(null);
            }
        }

        public /* synthetic */ Surface(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Surface access$getUserProfile$cp() {
            return userProfile;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0014\u0010\f\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0014\u0010\r\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/PromoBannerViewModel$Surface$Companion;", "", "<init>", "()V", "userProfile", "Lcom/polymarket/usviewmodels/PromoBannerViewModel$Surface;", "getUserProfile", "()Lcom/polymarket/usviewmodels/PromoBannerViewModel$Surface;", "sportsEventDetail", "eventTagSlugs", "", "", "orderBook", "buyLimitOrder", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Surface buyLimitOrder(List<String> eventTagSlugs) {
                eventTagSlugs.getClass();
                return new BuyLimitOrderCase(eventTagSlugs);
            }

            public final Surface getUserProfile() {
                return Surface.access$getUserProfile$cp();
            }

            public final Surface orderBook(List<String> eventTagSlugs) {
                eventTagSlugs.getClass();
                return new OrderBookCase(eventTagSlugs);
            }

            public final Surface sportsEventDetail(List<String> eventTagSlugs) {
                eventTagSlugs.getClass();
                return new SportsEventDetailCase(eventTagSlugs);
            }

            private Companion() {
            }
        }

        private Surface() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082 J\u001a\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u0019\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0082 ¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usviewmodels/PromoBannerViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "surface", "Lcom/polymarket/usviewmodels/PromoBannerViewModel$Surface;", "callbacks", "Lcom/polymarket/usviewmodels/PromoBannerViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/PromoBannerViewModel;", "withTemplates", "", "Swift_Companion_mock_3", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(Surface surface, Callbacks callbacks);

        private final native PromoBannerViewModel Swift_Companion_mock_3(boolean withTemplates, Surface surface);

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, Surface surface, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(surface, callbacks);
        }

        public static /* synthetic */ PromoBannerViewModel mock$default(Companion companion, boolean z, Surface surface, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                surface = Surface.INSTANCE.getUserProfile();
            }
            return companion.mock(z, surface);
        }

        public final PromoBannerViewModel mock(boolean withTemplates, Surface surface) {
            surface.getClass();
            return Swift_Companion_mock_3(withTemplates, surface);
        }

        private Companion() {
        }
    }

    public PromoBannerViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    public /* synthetic */ PromoBannerViewModel(Surface surface, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(surface, (i & 2) != 0 ? new Callbacks(null, null, 3, null) : callbacks);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB/\b\u0016\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0004\b\b\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\rJ\u0015\u0010\u0016\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J!\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J/\u0010#\u001a\u00060\u0004j\u0002`\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0082 J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f2\u0006\u0010%\u001a\u00020\u001cH\u0016J\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f2\u0006\u0010%\u001a\u00020\u001cH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006("}, d2 = {"Lcom/polymarket/usviewmodels/PromoBannerViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onOpenURL", "Lkotlin/Function1;", "Ljava/net/URI;", "", "onDeposit", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnOpenURL", "()Lkotlin/jvm/functions/Function1;", "Swift_onOpenURL", "getOnDeposit", "()Lkotlin/jvm/functions/Function0;", "Swift_onDeposit", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function1 function1, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((Function1<? super URI, Unit>) ((i & 1) != 0 ? new l7f(19) : function1), (Function0<Unit>) ((i & 2) != 0 ? new d5f(29) : function0));
        }

        private final native long Swift_constructor_0(Function1<? super URI, Unit> onOpenURL, Function0<Unit> onDeposit);

        private final native Function0<Unit> Swift_onDeposit(long Swift_peer);

        private final native Function1<URI, Unit> Swift_onOpenURL(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(URI uri) {
            uri.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a() {
            return _init_$lambda$1();
        }

        public static /* synthetic */ Unit b(URI uri) {
            return _init_$lambda$0(uri);
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

        public final Function0<Unit> getOnDeposit() {
            return Swift_onDeposit(this.Swift_peer);
        }

        public final Function1<URI, Unit> getOnOpenURL() {
            return Swift_onOpenURL(this.Swift_peer);
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

        public Callbacks(Function1<? super URI, Unit> function1, Function0<Unit> function0) {
            function1.getClass();
            function0.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function1, function0);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
