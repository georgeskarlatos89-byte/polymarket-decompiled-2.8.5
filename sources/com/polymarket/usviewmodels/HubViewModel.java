package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.EError;
import com.polymarket.data.EEvent;
import com.polymarket.data.EFeedAction;
import com.polymarket.data.EMarket;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.j69;
import defpackage.ji9;
import defpackage.qx7;
import defpackage.u85;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Async;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000 M2\u00020\u0001:\u0005IJKLMB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rJ\u0015\u0010\u0011\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010!\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010&\u001a\u0004\u0018\u00010#2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010*\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010-\u001a\u0004\u0018\u00010\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0010\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u00020\u001eJ\u001f\u00101\u001a\u0004\u0018\u00010/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00102\u001a\u00020\u001eH\u0082 J\u0006\u00103\u001a\u000204J\u0015\u00105\u001a\u0002042\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u00106\u001a\u000204H\u0016J\u0015\u00107\u001a\u0002042\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u00108\u001a\u0002042\u0006\u00109\u001a\u00020:H\u0096@¢\u0006\u0002\u0010;J3\u0010<\u001a\u0002042\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00109\u001a\u00020:2\u0014\u0010=\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010?\u0012\u0004\u0012\u0002040>H\u0082 J\u000e\u0010@\u001a\u0002042\u0006\u0010A\u001a\u00020BJ\u001d\u0010C\u001a\u0002042\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010A\u001a\u00020BH\u0082 J\u0016\u0010D\u001a\b\u0012\u0004\u0012\u00020F0E2\u0006\u0010G\u001a\u00020\u001eH\u0016J\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020F0E2\u0006\u0010G\u001a\u00020\u001eH\u0082 R\u0011\u0010\u000e\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010\"\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010'\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b'\u0010)R\u0013\u0010+\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b,\u0010\u0015¨\u0006N"}, d2 = {"Lcom/polymarket/usviewmodels/HubViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "hubId", "", "callbacks", "Lcom/polymarket/usviewmodels/HubViewModel$Callbacks;", "(Ljava/lang/String;Lcom/polymarket/usviewmodels/HubViewModel$Callbacks;)V", "navTitle", "getNavTitle", "()Ljava/lang/String;", "Swift_navTitle", "navIconURL", "Ljava/net/URI;", "getNavIconURL", "()Ljava/net/URI;", "Swift_navIconURL", "tabs", "", "Lcom/polymarket/usviewmodels/HubViewModel$Tab;", "getTabs", "()Ljava/util/List;", "Swift_tabs", "currentTabIndex", "", "getCurrentTabIndex", "()I", "Swift_currentTabIndex", "loadError", "Lcom/polymarket/data/EError;", "getLoadError", "()Lcom/polymarket/data/EError;", "Swift_loadError", "isInitialLoading", "", "()Z", "Swift_isInitialLoading", "shareURL", "getShareURL", "Swift_shareURL", "section", "Lcom/polymarket/usviewmodels/HubViewModel$Section;", "at", "Swift_section_0", "index", "prewarmSections", "", "Swift_prewarmSections_1", "setup", "Swift_setup_3", "performLoad", "reason", "Lcom/polymarket/usviewmodels/ReloadReason;", "(Lcom/polymarket/usviewmodels/ReloadReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Swift_callback_performLoad_4", "f_callback", "Lkotlin/Function1;", "", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/HubViewModel$Input;", "Swift_sendInput_5", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Callbacks", "Tab", "Section", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HubViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ HubViewModel(String str, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new Callbacks(null, null, null, null, 15, null) : callbacks);
    }

    private final native void Swift_callback_performLoad_4(long Swift_peer, ReloadReason reason, Function1<? super Throwable, Unit> f_callback);

    private final native int Swift_currentTabIndex(long Swift_peer);

    private final native boolean Swift_isInitialLoading(long Swift_peer);

    private final native EError Swift_loadError(long Swift_peer);

    private final native URI Swift_navIconURL(long Swift_peer);

    private final native String Swift_navTitle(long Swift_peer);

    private final native void Swift_prewarmSections_1(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native Section Swift_section_0(long Swift_peer, int index);

    private final native void Swift_sendInput_5(long Swift_peer, Input input);

    private final native void Swift_setup_3(long Swift_peer);

    private final native URI Swift_shareURL(long Swift_peer);

    private final native List<Tab> Swift_tabs(long Swift_peer);

    public static final /* synthetic */ void access$Swift_callback_performLoad_4(HubViewModel hubViewModel, long j, ReloadReason reloadReason, Function1 function1) {
        hubViewModel.Swift_callback_performLoad_4(j, reloadReason, function1);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final int getCurrentTabIndex() {
        return Swift_currentTabIndex(getSwift_peer());
    }

    public final EError getLoadError() {
        return Swift_loadError(getSwift_peer());
    }

    public final URI getNavIconURL() {
        return Swift_navIconURL(getSwift_peer());
    }

    public final String getNavTitle() {
        return Swift_navTitle(getSwift_peer());
    }

    public final URI getShareURL() {
        return Swift_shareURL(getSwift_peer());
    }

    public final List<Tab> getTabs() {
        return Swift_tabs(getSwift_peer());
    }

    public final boolean isInitialLoading() {
        return Swift_isInitialLoading(getSwift_peer());
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public Object performLoad(ReloadReason reloadReason, Continuation<? super Unit> continuation) {
        Object run = Async.INSTANCE.run(new HubViewModel$performLoad$2(this, reloadReason, null), continuation);
        if (run == u85.COROUTINE_SUSPENDED) {
            return run;
        }
        return Unit.INSTANCE;
    }

    public final void prewarmSections() {
        Swift_prewarmSections_1(getSwift_peer());
    }

    public final Section section(int at) {
        return Swift_section_0(getSwift_peer(), at);
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_5(getSwift_peer(), input);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_3(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00162\u00020\u0001:\u0006\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/polymarket/usviewmodels/HubViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnTabSelectedCase", "OnShareTappedCase", "OnRetryCase", "OnViewDidAppearCase", "OnDismissedCase", "Companion", "Lcom/polymarket/usviewmodels/HubViewModel$Input$OnDismissedCase;", "Lcom/polymarket/usviewmodels/HubViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/HubViewModel$Input$OnShareTappedCase;", "Lcom/polymarket/usviewmodels/HubViewModel$Input$OnTabSelectedCase;", "Lcom/polymarket/usviewmodels/HubViewModel$Input$OnViewDidAppearCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onShareTapped = new OnShareTappedCase();
        private static final Input onRetry = new OnRetryCase();
        private static final Input onViewDidAppear = new OnViewDidAppearCase();
        private static final Input onDismissed = new OnDismissedCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/HubViewModel$Input$OnDismissedCase;", "Lcom/polymarket/usviewmodels/HubViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDismissedCase extends Input {
            public OnDismissedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/HubViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/HubViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRetryCase extends Input {
            public OnRetryCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/HubViewModel$Input$OnShareTappedCase;", "Lcom/polymarket/usviewmodels/HubViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnShareTappedCase extends Input {
            public OnShareTappedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/HubViewModel$Input$OnTabSelectedCase;", "Lcom/polymarket/usviewmodels/HubViewModel$Input;", "associated0", "", "<init>", "(I)V", "getAssociated0", "()I", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/HubViewModel$Input$OnViewDidAppearCase;", "Lcom/polymarket/usviewmodels/HubViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        public static final /* synthetic */ Input access$getOnDismissed$cp() {
            return onDismissed;
        }

        public static final /* synthetic */ Input access$getOnRetry$cp() {
            return onRetry;
        }

        public static final /* synthetic */ Input access$getOnShareTapped$cp() {
            return onShareTapped;
        }

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
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/polymarket/usviewmodels/HubViewModel$Input$Companion;", "", "<init>", "()V", "onTabSelected", "Lcom/polymarket/usviewmodels/HubViewModel$Input;", "associated0", "", "onShareTapped", "getOnShareTapped", "()Lcom/polymarket/usviewmodels/HubViewModel$Input;", "onRetry", "getOnRetry", "onViewDidAppear", "getOnViewDidAppear", "onDismissed", "getOnDismissed", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnDismissed() {
                return Input.access$getOnDismissed$cp();
            }

            public final Input getOnRetry() {
                return Input.access$getOnRetry$cp();
            }

            public final Input getOnShareTapped() {
                return Input.access$getOnShareTapped$cp();
            }

            public final Input getOnViewDidAppear() {
                return Input.access$getOnViewDidAppear$cp();
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

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/HubViewModel$Section;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "FeedCase", "PolymapCase", "Companion", "Lcom/polymarket/usviewmodels/HubViewModel$Section$FeedCase;", "Lcom/polymarket/usviewmodels/HubViewModel$Section$PolymapCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Section implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/HubViewModel$Section$FeedCase;", "Lcom/polymarket/usviewmodels/HubViewModel$Section;", "associated0", "Lcom/polymarket/usviewmodels/HubSectionViewModel;", "<init>", "(Lcom/polymarket/usviewmodels/HubSectionViewModel;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/HubSectionViewModel;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class FeedCase extends Section {
            private final HubSectionViewModel associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FeedCase(HubSectionViewModel hubSectionViewModel) {
                super(null);
                hubSectionViewModel.getClass();
                this.associated0 = hubSectionViewModel;
            }

            public final HubSectionViewModel getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/HubViewModel$Section$PolymapCase;", "Lcom/polymarket/usviewmodels/HubViewModel$Section;", "associated0", "Lcom/polymarket/usviewmodels/MidtermsPolymapSectionViewModel;", "<init>", "(Lcom/polymarket/usviewmodels/MidtermsPolymapSectionViewModel;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/MidtermsPolymapSectionViewModel;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class PolymapCase extends Section {
            private final MidtermsPolymapSectionViewModel associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PolymapCase(MidtermsPolymapSectionViewModel midtermsPolymapSectionViewModel) {
                super(null);
                midtermsPolymapSectionViewModel.getClass();
                this.associated0 = midtermsPolymapSectionViewModel;
            }

            public final MidtermsPolymapSectionViewModel getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ Section(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/polymarket/usviewmodels/HubViewModel$Section$Companion;", "", "<init>", "()V", "feed", "Lcom/polymarket/usviewmodels/HubViewModel$Section;", "associated0", "Lcom/polymarket/usviewmodels/HubSectionViewModel;", "polymap", "Lcom/polymarket/usviewmodels/MidtermsPolymapSectionViewModel;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Section feed(HubSectionViewModel associated0) {
                associated0.getClass();
                return new FeedCase(associated0);
            }

            public final Section polymap(MidtermsPolymapSectionViewModel associated0) {
                associated0.getClass();
                return new PolymapCase(associated0);
            }

            private Companion() {
            }
        }

        private Section() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0006\u0010\u000b\u001a\u00020\fJ\t\u0010\r\u001a\u00020\fH\u0082 ¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/HubViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_2", "", "Lskip/bridge/SwiftObjectPointer;", "hubId", "", "callbacks", "Lcom/polymarket/usviewmodels/HubViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/HubViewModel;", "Swift_Companion_mock_6", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_2(String hubId, Callbacks callbacks);

        private final native HubViewModel Swift_Companion_mock_6();

        public static final /* synthetic */ long access$Swift_Companion_constructor_2(Companion companion, String str, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_2(str, callbacks);
        }

        public final HubViewModel mock() {
            return Swift_Companion_mock_6();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001%B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0015\u0010\u0018\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u0019\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0082 J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\u0019\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0000H\u0082 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\"2\u0006\u0010#\u001a\u00020\u0015H\u0016J\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0\"2\u0006\u0010#\u001a\u00020\u0015H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lcom/polymarket/usviewmodels/HubViewModel$Tab;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "(Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getTitle", "()Ljava/lang/String;", "Swift_title", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Tab implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Tab(String str) {
            str.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str);
        }

        private final native long Swift_constructor_0(String title);

        private final native boolean Swift_isequal(Tab lhs, Tab rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_title(long Swift_peer);

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
            if (!(other instanceof Tab)) {
                return false;
            }
            return Swift_isequal(this, (Tab) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getTitle() {
            return Swift_title(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public Tab(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HubViewModel(String str, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_2(INSTANCE, str, callbacks), (SwiftPeerMarker) null);
        str.getClass();
        callbacks.getClass();
    }

    public HubViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBm\b\u0016\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b\u0012 \b\u0002\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\b\u0010\u0016J\u0006\u0010\u001b\u001a\u00020\rJ\u0015\u0010\u001c\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J!\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J-\u0010*\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 Ji\u0010-\u001a\u00060\u0004j\u0002`\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000bH\u0082 J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020 0/2\u0006\u00100\u001a\u00020\"H\u0016J\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020 0/2\u0006\u00100\u001a\u00020\"H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010$R)\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u00118F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010$¨\u00063"}, d2 = {"Lcom/polymarket/usviewmodels/HubViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onFeedAction", "Lkotlin/Function1;", "Lcom/polymarket/data/EFeedAction;", "", "onOpenEvent", "Lcom/polymarket/data/EEvent;", "onBuyMarketSide", "Lkotlin/Function3;", "Lcom/polymarket/data/EMarket;", "Lcom/polymarket/data/EMarket$MarketSide;", "onShare", "Ljava/net/URI;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnFeedAction", "()Lkotlin/jvm/functions/Function1;", "Swift_onFeedAction", "getOnOpenEvent", "Swift_onOpenEvent", "getOnBuyMarketSide", "()Lkotlin/jvm/functions/Function3;", "Swift_onBuyMarketSide", "getOnShare", "Swift_onShare", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function1 function1, Function1 function12, Function3 function3, Function1 function13, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new j69(28) : function1, (i & 2) != 0 ? new j69(29) : function12, (i & 4) != 0 ? new qx7(1) : function3, (i & 8) != 0 ? new ji9(0) : function13);
        }

        private final native long Swift_constructor_0(Function1<? super EFeedAction, Unit> onFeedAction, Function1<? super EEvent, Unit> onOpenEvent, Function3<? super EEvent, ? super EMarket, ? super EMarket.MarketSide, Unit> onBuyMarketSide, Function1<? super URI, Unit> onShare);

        private final native Function3<EEvent, EMarket, EMarket.MarketSide, Unit> Swift_onBuyMarketSide(long Swift_peer);

        private final native Function1<EFeedAction, Unit> Swift_onFeedAction(long Swift_peer);

        private final native Function1<EEvent, Unit> Swift_onOpenEvent(long Swift_peer);

        private final native Function1<URI, Unit> Swift_onShare(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(EFeedAction eFeedAction) {
            eFeedAction.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(EEvent eEvent) {
            eEvent.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2(EEvent eEvent, EMarket eMarket, EMarket.MarketSide marketSide) {
            eEvent.getClass();
            eMarket.getClass();
            marketSide.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$3(URI uri) {
            uri.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(EEvent eEvent, EMarket eMarket, EMarket.MarketSide marketSide) {
            return _init_$lambda$2(eEvent, eMarket, marketSide);
        }

        public static /* synthetic */ Unit b(URI uri) {
            return _init_$lambda$3(uri);
        }

        public static /* synthetic */ Unit c(EEvent eEvent) {
            return _init_$lambda$1(eEvent);
        }

        public static /* synthetic */ Unit d(EFeedAction eFeedAction) {
            return _init_$lambda$0(eFeedAction);
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

        public final Function3<EEvent, EMarket, EMarket.MarketSide, Unit> getOnBuyMarketSide() {
            return Swift_onBuyMarketSide(this.Swift_peer);
        }

        public final Function1<EFeedAction, Unit> getOnFeedAction() {
            return Swift_onFeedAction(this.Swift_peer);
        }

        public final Function1<EEvent, Unit> getOnOpenEvent() {
            return Swift_onOpenEvent(this.Swift_peer);
        }

        public final Function1<URI, Unit> getOnShare() {
            return Swift_onShare(this.Swift_peer);
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

        public Callbacks(Function1<? super EFeedAction, Unit> function1, Function1<? super EEvent, Unit> function12, Function3<? super EEvent, ? super EMarket, ? super EMarket.MarketSide, Unit> function3, Function1<? super URI, Unit> function13) {
            function1.getClass();
            function12.getClass();
            function3.getClass();
            function13.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function1, function12, function3, function13);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
