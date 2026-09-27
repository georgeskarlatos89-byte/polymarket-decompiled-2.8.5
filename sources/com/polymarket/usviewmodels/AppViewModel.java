package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientExperimentKey;
import com.polymarket.data.ECriticalMaintenanceConfig;
import com.polymarket.data.EEventConfig;
import com.polymarket.data.RouterTransition;
import defpackage.oa;
import defpackage.py2;
import defpackage.u85;
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
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 \u008d\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0004\u008d\u0001\u008e\u0001B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB\u001f\b\u0016\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0015\u0010\u001f\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010\"\u001a\u00020\r2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010*\u001a\u00020$2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001d\u0010+\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010,\u001a\u00020$H\u0082 J\u0015\u00102\u001a\u00020\u00182\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001d\u00103\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010,\u001a\u00020\u0018H\u0082 J\u0015\u0010:\u001a\u0002042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001d\u0010;\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010,\u001a\u000204H\u0082 J\u0015\u0010B\u001a\u00020<2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001d\u0010C\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010,\u001a\u00020<H\u0082 J\u0017\u0010J\u001a\u0004\u0018\u00010D2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001f\u0010K\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\b\u0010,\u001a\u0004\u0018\u00010DH\u0082 J\u0015\u0010M\u001a\u00020\u00182\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010T\u001a\u00020N2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001d\u0010U\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010,\u001a\u00020NH\u0082 J\u0015\u0010Y\u001a\u00020\u00182\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001d\u0010Z\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010,\u001a\u00020\u0018H\u0082 J\u001b\u0010`\u001a\b\u0012\u0004\u0012\u00020]0\\2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001f\u0010a\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0082 J\b\u0010b\u001a\u00020\u0015H\u0016J\u0015\u0010c\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\b\u0010d\u001a\u00020\u0015H\u0016J\u0015\u0010e\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\b\u0010f\u001a\u00020\u0015H\u0016J\u0015\u0010g\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J(\u0010h\u001a\u00020\u00152\u000e\b\u0002\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00150j2\u000e\b\u0002\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00150jH\u0016J1\u0010l\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00150j2\f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00150jH\u0082 J\u0016\u0010m\u001a\u00020\u00152\u0006\u0010n\u001a\u00020oH\u0096@¢\u0006\u0002\u0010pJ3\u0010q\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010n\u001a\u00020o2\u0014\u0010r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010t\u0012\u0004\u0012\u00020\u00150sH\u0082 J\b\u0010u\u001a\u00020\u0015H\u0016J\u0015\u0010v\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\b\u0010w\u001a\u00020\u0015H\u0016J\u0015\u0010x\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\b\u0010y\u001a\u00020\u0015H\u0016J\u0015\u0010z\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0016\u0010{\u001a\u00020\u00152\f\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00150jH\u0016J#\u0010}\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\f\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00150jH\u0082 J\u0017\u0010~\u001a\u00020\u00152\u0006\u0010\u007f\u001a\u00020tH\u0096@¢\u0006\u0003\u0010\u0080\u0001J,\u0010\u0081\u0001\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u007f\u001a\u00020t2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00150jH\u0082 J\u0011\u0010\u0082\u0001\u001a\u00020\u00152\u0006\u0010\u007f\u001a\u00020tH\u0016J\u001e\u0010\u0083\u0001\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u007f\u001a\u00020tH\u0082 J\u001d\u0010\u0084\u0001\u001a\u00020\u00152\b\u0010\u0085\u0001\u001a\u00030\u0086\u00012\b\u0010\u0087\u0001\u001a\u00030\u0088\u0001H\u0016J*\u0010\u0089\u0001\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\b\u0010\u0085\u0001\u001a\u00030\u0086\u00012\b\u0010\u0087\u0001\u001a\u00030\u0088\u0001H\u0082 J\u0018\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\u001a0j2\u0007\u0010\u008b\u0001\u001a\u00020\u001cH\u0016J\u0019\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u001a0j2\u0007\u0010\u008b\u0001\u001a\u00020\u001cH\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000e\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b \u0010!R$\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020$8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010-\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00188V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00105\u001a\u0002042\u0006\u0010#\u001a\u0002048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010=\u001a\u00020<2\u0006\u0010#\u001a\u00020<8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR(\u0010E\u001a\u0004\u0018\u00010D2\b\u0010#\u001a\u0004\u0018\u00010D8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0014\u0010L\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010/R$\u0010O\u001a\u00020N2\u0006\u0010#\u001a\u00020N8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010V\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00188V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bW\u0010/\"\u0004\bX\u00101R\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020]0\\8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_¨\u0006\u008f\u0001"}, d2 = {"Lcom/polymarket/usviewmodels/AppViewModel;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "(Lcom/polymarket/usviewmodels/AppSceneType;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getScene", "()Lcom/polymarket/usviewmodels/AppSceneType;", "Swift_scene", "newValue", "", "scrollOffset", "getScrollOffset", "()D", "setScrollOffset", "(D)V", "Swift_scrollOffset", "Swift_scrollOffset_set", "value", "showCloseButton", "getShowCloseButton", "()Z", "setShowCloseButton", "(Z)V", "Swift_showCloseButton", "Swift_showCloseButton_set", "Lcom/polymarket/data/RouterTransition$Forward;", "transition", "getTransition", "()Lcom/polymarket/data/RouterTransition$Forward;", "setTransition", "(Lcom/polymarket/data/RouterTransition$Forward;)V", "Swift_transition", "Swift_transition_set", "Lcom/polymarket/data/EEventConfig;", "eventConfig", "getEventConfig", "()Lcom/polymarket/data/EEventConfig;", "setEventConfig", "(Lcom/polymarket/data/EEventConfig;)V", "Swift_eventConfig", "Swift_eventConfig_set", "Lcom/polymarket/data/ECriticalMaintenanceConfig;", "criticalMaintenanceConfig", "getCriticalMaintenanceConfig", "()Lcom/polymarket/data/ECriticalMaintenanceConfig;", "setCriticalMaintenanceConfig", "(Lcom/polymarket/data/ECriticalMaintenanceConfig;)V", "Swift_criticalMaintenanceConfig", "Swift_criticalMaintenanceConfig_set", "isCriticalMaintenanceMode", "Swift_isCriticalMaintenanceMode", "Lcom/polymarket/usviewmodels/LoadGate;", "primaryGate", "getPrimaryGate", "()Lcom/polymarket/usviewmodels/LoadGate;", "setPrimaryGate", "(Lcom/polymarket/usviewmodels/LoadGate;)V", "Swift_primaryGate", "Swift_primaryGate_set", "didLoadOnce", "getDidLoadOnce", "setDidLoadOnce", "Swift_didLoadOnce", "Swift_didLoadOnce_set", "activeExperiments", "", "Lcom/polymarket/clients/ClientExperimentKey;", "getActiveExperiments", "()Ljava/util/List;", "Swift_activeExperiments", "Swift_constructor_0", "cancelWork", "Swift_cancelWork_1", "setup", "Swift_setup_2", "setupCriticalMaintenanceBinding", "Swift_setupCriticalMaintenanceBinding_3", "bind", "onWillEnterBackground", "Lkotlin/Function0;", "onWillEnterForeground", "Swift_bind_4", "performLoad", "reason", "Lcom/polymarket/usviewmodels/ReloadReason;", "(Lcom/polymarket/usviewmodels/ReloadReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Swift_callback_performLoad_5", "f_callback", "Lkotlin/Function1;", "", "reloadIfStale", "Swift_reloadIfStale_6", "handleBecomeForeground", "Swift_handleBecomeForeground_7", "bindForeground", "Swift_bindForeground_8", "bindLoggedOut", "onLoggedOut", "Swift_bindLoggedOut_9", "logErrorAndDisplayAlert", "error", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Swift_callback_logErrorAndDisplayAlert_10", "logError", "Swift_logError_11", "logLivestreamEvent", "event", "Lcom/polymarket/usviewmodels/USLivestreamAnalyticsEvent;", "context", "Lcom/polymarket/usviewmodels/USLivestreamAnalyticsContext;", "Swift_logLivestreamEvent_12", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "CompanionClass", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public class AppViewModel implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static class CompanionClass {
    }

    public AppViewModel(AppSceneType appSceneType, String str) {
        appSceneType.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(appSceneType, str);
    }

    private final native List<ClientExperimentKey> Swift_activeExperiments(long Swift_peer);

    private final native void Swift_bindForeground_8(long Swift_peer);

    private final native void Swift_bindLoggedOut_9(long Swift_peer, Function0<Unit> onLoggedOut);

    private final native void Swift_bind_4(long Swift_peer, Function0<Unit> onWillEnterBackground, Function0<Unit> onWillEnterForeground);

    private final native void Swift_callback_logErrorAndDisplayAlert_10(long Swift_peer, Throwable error, Function0<Unit> f_callback);

    private final native void Swift_callback_performLoad_5(long Swift_peer, ReloadReason reason, Function1<? super Throwable, Unit> f_callback);

    private final native void Swift_cancelWork_1(long Swift_peer);

    private final native long Swift_constructor_0(AppSceneType scene, String id);

    private final native ECriticalMaintenanceConfig Swift_criticalMaintenanceConfig(long Swift_peer);

    private final native void Swift_criticalMaintenanceConfig_set(long Swift_peer, ECriticalMaintenanceConfig value);

    private final native boolean Swift_didLoadOnce(long Swift_peer);

    private final native void Swift_didLoadOnce_set(long Swift_peer, boolean value);

    private final native EEventConfig Swift_eventConfig(long Swift_peer);

    private final native void Swift_eventConfig_set(long Swift_peer, EEventConfig value);

    private final native void Swift_handleBecomeForeground_7(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native boolean Swift_isCriticalMaintenanceMode(long Swift_peer);

    private final native void Swift_logError_11(long Swift_peer, Throwable error);

    private final native void Swift_logLivestreamEvent_12(long Swift_peer, USLivestreamAnalyticsEvent event, USLivestreamAnalyticsContext context);

    private final native LoadGate Swift_primaryGate(long Swift_peer);

    private final native void Swift_primaryGate_set(long Swift_peer, LoadGate value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native void Swift_reloadIfStale_6(long Swift_peer);

    private final native AppSceneType Swift_scene(long Swift_peer);

    private final native double Swift_scrollOffset(long Swift_peer);

    private final native void Swift_scrollOffset_set(long Swift_peer, double value);

    private final native void Swift_setupCriticalMaintenanceBinding_3(long Swift_peer);

    private final native void Swift_setup_2(long Swift_peer);

    private final native boolean Swift_showCloseButton(long Swift_peer);

    private final native void Swift_showCloseButton_set(long Swift_peer, boolean value);

    private final native RouterTransition.Forward Swift_transition(long Swift_peer);

    private final native void Swift_transition_set(long Swift_peer, RouterTransition.Forward value);

    public static /* synthetic */ Unit a() {
        return bind$lambda$1();
    }

    public static final /* synthetic */ void access$Swift_callback_logErrorAndDisplayAlert_10(AppViewModel appViewModel, long j, Throwable th, Function0 function0) {
        appViewModel.Swift_callback_logErrorAndDisplayAlert_10(j, th, function0);
    }

    public static final /* synthetic */ void access$Swift_callback_performLoad_5(AppViewModel appViewModel, long j, ReloadReason reloadReason, Function1 function1) {
        appViewModel.Swift_callback_performLoad_5(j, reloadReason, function1);
    }

    public static /* synthetic */ Unit b() {
        return bind$lambda$0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bind$default(AppViewModel appViewModel, Function0 function0, Function0 function02, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                function0 = new oa(23);
            }
            if ((i & 2) != 0) {
                function02 = new oa(24);
            }
            appViewModel.bind(function0, function02);
            return;
        }
        py2.f("Super calls with default arguments not supported in this target, function: bind");
    }

    private static final Unit bind$lambda$0() {
        return Unit.INSTANCE;
    }

    private static final Unit bind$lambda$1() {
        return Unit.INSTANCE;
    }

    public static Object logErrorAndDisplayAlert$suspendImpl(AppViewModel appViewModel, Throwable th, Continuation<? super Unit> continuation) {
        Object run = Async.INSTANCE.run(new AppViewModel$logErrorAndDisplayAlert$2(appViewModel, th, null), continuation);
        if (run == u85.COROUTINE_SUSPENDED) {
            return run;
        }
        return Unit.INSTANCE;
    }

    public static Object performLoad$suspendImpl(AppViewModel appViewModel, ReloadReason reloadReason, Continuation<? super Unit> continuation) {
        Object run = Async.INSTANCE.run(new AppViewModel$performLoad$2(appViewModel, reloadReason, null), continuation);
        if (run == u85.COROUTINE_SUSPENDED) {
            return run;
        }
        return Unit.INSTANCE;
    }

    @Override // skip.bridge.SwiftPeerBridged
    /* renamed from: Swift_peer, reason: from getter */
    public long getSwift_peer() {
        return this.Swift_peer;
    }

    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public void bind(Function0<Unit> onWillEnterBackground, Function0<Unit> onWillEnterForeground) {
        onWillEnterBackground.getClass();
        onWillEnterForeground.getClass();
        Swift_bind_4(this.Swift_peer, onWillEnterBackground, onWillEnterForeground);
    }

    public void bindForeground() {
        Swift_bindForeground_8(this.Swift_peer);
    }

    public void bindLoggedOut(Function0<Unit> onLoggedOut) {
        onLoggedOut.getClass();
        Swift_bindLoggedOut_9(this.Swift_peer, onLoggedOut);
    }

    public void cancelWork() {
        Swift_cancelWork_1(this.Swift_peer);
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

    public List<ClientExperimentKey> getActiveExperiments() {
        return Swift_activeExperiments(this.Swift_peer);
    }

    public ECriticalMaintenanceConfig getCriticalMaintenanceConfig() {
        return Swift_criticalMaintenanceConfig(this.Swift_peer);
    }

    public boolean getDidLoadOnce() {
        return Swift_didLoadOnce(this.Swift_peer);
    }

    public EEventConfig getEventConfig() {
        return Swift_eventConfig(this.Swift_peer);
    }

    @Override // skip.lib.Identifiable
    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public String getId2() {
        return Swift_id(this.Swift_peer);
    }

    public LoadGate getPrimaryGate() {
        return Swift_primaryGate(this.Swift_peer);
    }

    public final AppSceneType getScene() {
        return Swift_scene(this.Swift_peer);
    }

    public double getScrollOffset() {
        return Swift_scrollOffset(this.Swift_peer);
    }

    public boolean getShowCloseButton() {
        return Swift_showCloseButton(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public RouterTransition.Forward getTransition() {
        return Swift_transition(this.Swift_peer);
    }

    public void handleBecomeForeground() {
        Swift_handleBecomeForeground_7(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public boolean isCriticalMaintenanceMode() {
        return Swift_isCriticalMaintenanceMode(this.Swift_peer);
    }

    public void logError(Throwable error) {
        error.getClass();
        Swift_logError_11(this.Swift_peer, error);
    }

    public Object logErrorAndDisplayAlert(Throwable th, Continuation<? super Unit> continuation) {
        return logErrorAndDisplayAlert$suspendImpl(this, th, continuation);
    }

    public void logLivestreamEvent(USLivestreamAnalyticsEvent event, USLivestreamAnalyticsContext context) {
        event.getClass();
        context.getClass();
        Swift_logLivestreamEvent_12(this.Swift_peer, event, context);
    }

    public Object performLoad(ReloadReason reloadReason, Continuation<? super Unit> continuation) {
        return performLoad$suspendImpl(this, reloadReason, continuation);
    }

    public void reloadIfStale() {
        Swift_reloadIfStale_6(this.Swift_peer);
    }

    public void setCriticalMaintenanceConfig(ECriticalMaintenanceConfig eCriticalMaintenanceConfig) {
        Swift_criticalMaintenanceConfig_set(this.Swift_peer, eCriticalMaintenanceConfig);
    }

    public void setDidLoadOnce(boolean z) {
        Swift_didLoadOnce_set(this.Swift_peer, z);
    }

    public void setEventConfig(EEventConfig eEventConfig) {
        eEventConfig.getClass();
        Swift_eventConfig_set(this.Swift_peer, (EEventConfig) StructKt.sref$default(eEventConfig, null, 1, null));
    }

    public void setPrimaryGate(LoadGate loadGate) {
        loadGate.getClass();
        Swift_primaryGate_set(this.Swift_peer, loadGate);
    }

    public void setScrollOffset(double d) {
        Swift_scrollOffset_set(this.Swift_peer, d);
    }

    public void setShowCloseButton(boolean z) {
        Swift_showCloseButton_set(this.Swift_peer, z);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public void setTransition(RouterTransition.Forward forward) {
        forward.getClass();
        Swift_transition_set(this.Swift_peer, forward);
    }

    public void setup() {
        Swift_setup_2(this.Swift_peer);
    }

    public void setupCriticalMaintenanceBinding() {
        Swift_setupCriticalMaintenanceBinding_3(this.Swift_peer);
    }

    @Override // skip.lib.Identifiable
    public /* bridge */ /* synthetic */ String getId() {
        return getId2();
    }

    public AppViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ AppViewModel(AppSceneType appSceneType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AppSceneDefault() : appSceneType, (i & 2) != 0 ? null : str);
    }
}
