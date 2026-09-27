package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.clients.ClientExperimentKey;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.u85;
import defpackage.wmj;
import defpackage.zyi;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Async;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0003OPQB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB1\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0007\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u0019\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010$\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010)\u001a\u00020&2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010-\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u00101\u001a\b\u0012\u0004\u0012\u00020/0\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u00102\u001a\u000203H\u0016J\u0015\u00104\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u00105\u001a\u0002032\u0006\u00106\u001a\u000207H\u0096@¢\u0006\u0002\u00108J3\u00109\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00106\u001a\u0002072\u0014\u0010:\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010<\u0012\u0004\u0012\u0002030;H\u0082 J\u000e\u0010=\u001a\u0002032\u0006\u0010>\u001a\u00020?J\u001d\u0010@\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010>\u001a\u00020?H\u0082 J\u000e\u0010A\u001a\u0002032\u0006\u0010\u000f\u001a\u00020\u0010J\u001d\u0010B\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0082 J\u0006\u0010C\u001a\u000203J\u0015\u0010D\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0006\u0010E\u001a\u000203J\u0015\u0010F\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010G\u001a\u0002032\u0006\u0010H\u001a\u00020\fJ\u001d\u0010I\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010H\u001a\u00020\fH\u0082 J\u0016\u0010J\u001a\b\u0012\u0004\u0012\u00020L0K2\u0006\u0010M\u001a\u00020&H\u0016J\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020L0K2\u0006\u0010M\u001a\u00020&H\u0082 R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010%\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010*\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u001e¨\u0006R"}, d2 = {"Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "surface", "Lcom/polymarket/usviewmodels/PremadeComboSurface;", "tagSlug", "", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", "callbacks", "Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/PremadeComboSurface;Ljava/lang/String;Lcom/polymarket/usviewmodels/AppSceneType;Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Callbacks;)V", "getSurface", "()Lcom/polymarket/usviewmodels/PremadeComboSurface;", "Swift_surface", "cardStyle", "Lcom/polymarket/usviewmodels/PremadeComboCardStyle;", "getCardStyle", "()Lcom/polymarket/usviewmodels/PremadeComboCardStyle;", "Swift_cardStyle", "cards", "", "Lcom/polymarket/usviewmodels/PremadeComboCardPresentation;", "getCards", "()Ljava/util/List;", "Swift_cards", "hasContent", "", "getHasContent", "()Z", "Swift_hasContent", "listRowCount", "", "getListRowCount", "()I", "Swift_listRowCount", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "()Ljava/lang/String;", "Swift_title", "activeExperiments", "Lcom/polymarket/clients/ClientExperimentKey;", "getActiveExperiments", "Swift_activeExperiments", "setup", "", "Swift_setup_1", "performLoad", "reason", "Lcom/polymarket/usviewmodels/ReloadReason;", "(Lcom/polymarket/usviewmodels/ReloadReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Swift_callback_performLoad_2", "f_callback", "Lkotlin/Function1;", "", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Input;", "Swift_sendInput_3", "setCallbacks", "Swift_setCallbacks_4", "reportScreenAppeared", "Swift_reportScreenAppeared_5", "reportShelfViewed", "Swift_reportShelfViewed_6", "reportCardViewed", "comboId", "Swift_reportCardViewed_7", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Callbacks", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class USHomePremadeCombosRailViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ USHomePremadeCombosRailViewModel(PremadeComboSurface premadeComboSurface, String str, AppSceneType appSceneType, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(premadeComboSurface, (i & 2) != 0 ? null : str, (i & 4) != 0 ? new AppSceneDefault() : appSceneType, (i & 8) != 0 ? new Callbacks(null, null, 3, null) : callbacks);
    }

    private final native List<ClientExperimentKey> Swift_activeExperiments(long Swift_peer);

    private final native void Swift_callback_performLoad_2(long Swift_peer, ReloadReason reason, Function1<? super Throwable, Unit> f_callback);

    private final native PremadeComboCardStyle Swift_cardStyle(long Swift_peer);

    private final native List<PremadeComboCardPresentation> Swift_cards(long Swift_peer);

    private final native boolean Swift_hasContent(long Swift_peer);

    private final native int Swift_listRowCount(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_reportCardViewed_7(long Swift_peer, String comboId);

    private final native void Swift_reportScreenAppeared_5(long Swift_peer);

    private final native void Swift_reportShelfViewed_6(long Swift_peer);

    private final native void Swift_sendInput_3(long Swift_peer, Input input);

    private final native void Swift_setCallbacks_4(long Swift_peer, Callbacks callbacks);

    private final native void Swift_setup_1(long Swift_peer);

    private final native PremadeComboSurface Swift_surface(long Swift_peer);

    private final native String Swift_title(long Swift_peer);

    public static final /* synthetic */ void access$Swift_callback_performLoad_2(USHomePremadeCombosRailViewModel uSHomePremadeCombosRailViewModel, long j, ReloadReason reloadReason, Function1 function1) {
        uSHomePremadeCombosRailViewModel.Swift_callback_performLoad_2(j, reloadReason, function1);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public List<ClientExperimentKey> getActiveExperiments() {
        return Swift_activeExperiments(getSwift_peer());
    }

    public final PremadeComboCardStyle getCardStyle() {
        return Swift_cardStyle(getSwift_peer());
    }

    public final List<PremadeComboCardPresentation> getCards() {
        return Swift_cards(getSwift_peer());
    }

    public final boolean getHasContent() {
        return Swift_hasContent(getSwift_peer());
    }

    public final int getListRowCount() {
        return Swift_listRowCount(getSwift_peer());
    }

    public final PremadeComboSurface getSurface() {
        return Swift_surface(getSwift_peer());
    }

    public final String getTitle() {
        return Swift_title(getSwift_peer());
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public Object performLoad(ReloadReason reloadReason, Continuation<? super Unit> continuation) {
        Object run = Async.INSTANCE.run(new USHomePremadeCombosRailViewModel$performLoad$2(this, reloadReason, null), continuation);
        if (run == u85.COROUTINE_SUSPENDED) {
            return run;
        }
        return Unit.INSTANCE;
    }

    public final void reportCardViewed(String comboId) {
        comboId.getClass();
        Swift_reportCardViewed_7(getSwift_peer(), comboId);
    }

    public final void reportScreenAppeared() {
        Swift_reportScreenAppeared_5(getSwift_peer());
    }

    public final void reportShelfViewed() {
        Swift_reportShelfViewed_6(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_3(getSwift_peer(), input);
    }

    public final void setCallbacks(Callbacks callbacks) {
        callbacks.getClass();
        Swift_setCallbacks_4(getSwift_peer(), callbacks);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00162\u00020\u0001:\u0006\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnCardTappedCase", "OnPayoutTappedCase", "OnViewMoreTappedCase", "EnableRealTimeUpdatesCase", "DisableRealTimeUpdatesCase", "Companion", "Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Input$DisableRealTimeUpdatesCase;", "Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Input$EnableRealTimeUpdatesCase;", "Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Input$OnCardTappedCase;", "Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Input$OnPayoutTappedCase;", "Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Input$OnViewMoreTappedCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input enableRealTimeUpdates = new EnableRealTimeUpdatesCase();
        private static final Input disableRealTimeUpdates = new DisableRealTimeUpdatesCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Input$DisableRealTimeUpdatesCase;", "Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class DisableRealTimeUpdatesCase extends Input {
            public DisableRealTimeUpdatesCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Input$EnableRealTimeUpdatesCase;", "Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class EnableRealTimeUpdatesCase extends Input {
            public EnableRealTimeUpdatesCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Input$OnCardTappedCase;", "Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "comboId", "getComboId", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnCardTappedCase extends Input {
            private final String associated0;
            private final String comboId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnCardTappedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
                this.comboId = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public final String getComboId() {
                return this.comboId;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Input$OnPayoutTappedCase;", "Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "comboId", "getComboId", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPayoutTappedCase extends Input {
            private final String associated0;
            private final String comboId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnPayoutTappedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
                this.comboId = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public final String getComboId() {
                return this.comboId;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Input$OnViewMoreTappedCase;", "Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "comboId", "getComboId", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewMoreTappedCase extends Input {
            private final String associated0;
            private final String comboId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnViewMoreTappedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
                this.comboId = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public final String getComboId() {
                return this.comboId;
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

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Input$Companion;", "", "<init>", "()V", "onCardTapped", "Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Input;", "comboId", "", "onPayoutTapped", "onViewMoreTapped", "enableRealTimeUpdates", "getEnableRealTimeUpdates", "()Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Input;", "disableRealTimeUpdates", "getDisableRealTimeUpdates", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

            public final Input onCardTapped(String comboId) {
                comboId.getClass();
                return new OnCardTappedCase(comboId);
            }

            public final Input onPayoutTapped(String comboId) {
                comboId.getClass();
                return new OnPayoutTappedCase(comboId);
            }

            public final Input onViewMoreTapped(String comboId) {
                comboId.getClass();
                return new OnViewMoreTappedCase(comboId);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0082 J\u0010\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012J\u0011\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 ¨\u0006\u0014"}, d2 = {"Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "surface", "Lcom/polymarket/usviewmodels/PremadeComboSurface;", "tagSlug", "", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", "callbacks", "Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel;", "cardStyle", "Lcom/polymarket/usviewmodels/PremadeComboCardStyle;", "Swift_Companion_mock_8", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(PremadeComboSurface surface, String tagSlug, AppSceneType scene, Callbacks callbacks);

        private final native USHomePremadeCombosRailViewModel Swift_Companion_mock_8(PremadeComboCardStyle cardStyle);

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, PremadeComboSurface premadeComboSurface, String str, AppSceneType appSceneType, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(premadeComboSurface, str, appSceneType, callbacks);
        }

        public static /* synthetic */ USHomePremadeCombosRailViewModel mock$default(Companion companion, PremadeComboCardStyle premadeComboCardStyle, int i, Object obj) {
            if ((i & 1) != 0) {
                premadeComboCardStyle = PremadeComboCardStyle.list;
            }
            return companion.mock(premadeComboCardStyle);
        }

        public final USHomePremadeCombosRailViewModel mock(PremadeComboCardStyle cardStyle) {
            cardStyle.getClass();
            return Swift_Companion_mock_8(cardStyle);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB;\b\u0016\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u0010¢\u0006\u0004\b\b\u0010\u0011J\u0006\u0010\u0016\u001a\u00020\u000eJ\u0015\u0010\u0017\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J'\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J;\u0010$\u001a\u00060\u0004j\u0002`\u00052\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u0010H\u0082 J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0&2\u0006\u0010'\u001a\u00020\u001dH\u0016J\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001b0&2\u0006\u0010'\u001a\u00020\u001dH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R#\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u00108F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006*"}, d2 = {"Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onBuyCombo", "Lkotlin/Function2;", "Lcom/polymarket/usviewmodels/Combo;", "Lcom/polymarket/usviewmodels/TradeEntrySource;", "", "onShowComboDetails", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnBuyCombo", "()Lkotlin/jvm/functions/Function2;", "Swift_onBuyCombo", "getOnShowComboDetails", "()Lkotlin/jvm/functions/Function1;", "Swift_onShowComboDetails", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function2 function2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((Function2<? super Combo, ? super TradeEntrySource, Unit>) ((i & 1) != 0 ? new zyi(16) : function2), (Function1<? super Combo, Unit>) ((i & 2) != 0 ? new wmj(1) : function1));
        }

        private final native long Swift_constructor_0(Function2<? super Combo, ? super TradeEntrySource, Unit> onBuyCombo, Function1<? super Combo, Unit> onShowComboDetails);

        private final native Function2<Combo, TradeEntrySource, Unit> Swift_onBuyCombo(long Swift_peer);

        private final native Function1<Combo, Unit> Swift_onShowComboDetails(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(Combo combo, TradeEntrySource tradeEntrySource) {
            combo.getClass();
            tradeEntrySource.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(Combo combo) {
            combo.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(Combo combo, TradeEntrySource tradeEntrySource) {
            return _init_$lambda$0(combo, tradeEntrySource);
        }

        public static /* synthetic */ Unit b(Combo combo) {
            return _init_$lambda$1(combo);
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

        public final Function2<Combo, TradeEntrySource, Unit> getOnBuyCombo() {
            return Swift_onBuyCombo(this.Swift_peer);
        }

        public final Function1<Combo, Unit> getOnShowComboDetails() {
            return Swift_onShowComboDetails(this.Swift_peer);
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

        public Callbacks(Function2<? super Combo, ? super TradeEntrySource, Unit> function2, Function1<? super Combo, Unit> function1) {
            function2.getClass();
            function1.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function2, function1);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USHomePremadeCombosRailViewModel(PremadeComboSurface premadeComboSurface, String str, AppSceneType appSceneType, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, premadeComboSurface, str, appSceneType, callbacks), (SwiftPeerMarker) null);
        premadeComboSurface.getClass();
        appSceneType.getClass();
        callbacks.getClass();
    }

    public USHomePremadeCombosRailViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }
}
