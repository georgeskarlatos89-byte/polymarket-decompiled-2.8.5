package com.polymarket.usviewmodels;

import com.polymarket.data.EError;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.u85;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Async;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 b2\u00020\u0001:\u0002abB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001f\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u0017\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u0019\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u001b\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010 \u001a\u0004\u0018\u00010\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\"\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010$\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010(\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0010\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u0010J\u001f\u0010,\u001a\u0004\u0018\u00010*2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010-\u001a\u00020\u0010H\u0082 J\u0010\u0010.\u001a\u0004\u0018\u00010/2\u0006\u0010+\u001a\u00020\u0010J\u001f\u00100\u001a\u0004\u0018\u00010/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010-\u001a\u00020\u0010H\u0082 J\u0010\u00101\u001a\u0004\u0018\u0001022\u0006\u0010+\u001a\u00020\u0010J\u001f\u00103\u001a\u0004\u0018\u0001022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010-\u001a\u00020\u0010H\u0082 J\u0010\u00104\u001a\u0004\u0018\u0001052\u0006\u0010+\u001a\u00020\u0010J\u001f\u00106\u001a\u0004\u0018\u0001052\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010-\u001a\u00020\u0010H\u0082 J\u0010\u00107\u001a\u0004\u0018\u0001082\u0006\u0010+\u001a\u00020\u0010J\u001f\u00109\u001a\u0004\u0018\u0001082\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010-\u001a\u00020\u0010H\u0082 J\u0015\u0010>\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010?\u001a\u00020@2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010A\u001a\u00020\u0015H\u0082 J\u0017\u0010F\u001a\u0004\u0018\u00010C2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010G\u001a\u00020@H\u0016J\u0015\u0010H\u001a\u00020@2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010I\u001a\u00020@2\u0006\u0010J\u001a\u00020KH\u0096@¢\u0006\u0002\u0010LJ3\u0010M\u001a\u00020@2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010J\u001a\u00020K2\u0014\u0010N\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010P\u0012\u0004\u0012\u00020@0OH\u0082 J\u000e\u0010Q\u001a\u00020@2\u0006\u0010R\u001a\u00020SJ\u001d\u0010T\u001a\u00020@2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010R\u001a\u00020SH\u0082 J\u0006\u0010U\u001a\u00020@J\u0015\u0010V\u001a\u00020@2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010W\u001a\u00020@2\u0006\u0010-\u001a\u00020\u0010J\u001d\u0010X\u001a\u00020@2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010-\u001a\u00020\u0010H\u0082 J\u000e\u0010Y\u001a\u00020@2\u0006\u0010-\u001a\u00020\u0010J\u001d\u0010Z\u001a\u00020@2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010-\u001a\u00020\u0010H\u0082 J\u0016\u0010[\u001a\b\u0012\u0004\u0012\u00020]0\\2\u0006\u0010^\u001a\u00020_H\u0016J\u0017\u0010`\u001a\b\u0012\u0004\u0012\u00020]0\\2\u0006\u0010^\u001a\u00020_H\u0082 R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010!\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b!\u0010\u0016R\u0011\u0010#\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b#\u0010\u0016R\u0011\u0010%\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b&\u0010'R$\u0010;\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010\u0016\"\u0004\b<\u0010=R\u0013\u0010B\u001a\u0004\u0018\u00010C8F¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006c"}, d2 = {"Lcom/polymarket/usviewmodels/FeedViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "(Lcom/polymarket/usviewmodels/AppSceneType;Ljava/lang/String;)V", "rows", "", "Lcom/polymarket/usviewmodels/FeedRowID;", "getRows", "()Ljava/util/List;", "Swift_rows", "isRefreshing", "", "()Z", "Swift_isRefreshing", "isLoadingBottom", "Swift_isLoadingBottom", "isWalkBroken", "Swift_isWalkBroken", "loadError", "Lcom/polymarket/data/EError;", "getLoadError", "()Lcom/polymarket/data/EError;", "Swift_loadError", "isEmptyAndExhausted", "Swift_isEmptyAndExhausted", "isInitialLoading", "Swift_isInitialLoading", "walkBrokenTitle", "getWalkBrokenTitle", "()Ljava/lang/String;", "Swift_walkBrokenTitle", "promoViewModel", "Lcom/polymarket/usviewmodels/FeedPromoItemViewModel;", "for_", "Swift_promoViewModel_0", "row", "labelViewModel", "Lcom/polymarket/usviewmodels/FeedLabelItemViewModel;", "Swift_labelViewModel_1", "eventViewModel", "Lcom/polymarket/usviewmodels/FeedEventItemViewModel;", "Swift_eventViewModel_2", "keyRaceViewModel", "Lcom/polymarket/usviewmodels/FeedKeyRaceViewModel;", "Swift_keyRaceViewModel_3", "moduleViewModel", "Lcom/polymarket/usviewmodels/FeedModuleViewModel;", "Swift_moduleViewModel_4", "newValue", "isSurfaceVisible", "setSurfaceVisible", "(Z)V", "Swift_isSurfaceVisible", "Swift_isSurfaceVisible_set", "", "value", "polymapMiniMap", "Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel;", "getPolymapMiniMap", "()Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel;", "Swift_polymapMiniMap", "setup", "Swift_setup_5", "performLoad", "reason", "Lcom/polymarket/usviewmodels/ReloadReason;", "(Lcom/polymarket/usviewmodels/ReloadReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Swift_callback_performLoad_6", "f_callback", "Lkotlin/Function1;", "", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/FeedViewModel$Input;", "Swift_sendInput_8", "openPolymapMiniMap", "Swift_openPolymapMiniMap_9", "reportModuleDisplayed", "Swift_reportModuleDisplayed_10", "cancelModuleDisplay", "Swift_cancelModuleDisplay_11", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FeedViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/FeedViewModel$Input;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "onPullToRefresh", "onNearBottom", "onRetry", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Input implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Input[] $VALUES;
        public static final Input onPullToRefresh = new Input("onPullToRefresh", 0);
        public static final Input onNearBottom = new Input("onNearBottom", 1);
        public static final Input onRetry = new Input("onRetry", 2);

        private static final /* synthetic */ Input[] $values() {
            return new Input[]{onPullToRefresh, onNearBottom, onRetry};
        }

        static {
            Input[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Input(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Input valueOf(String str) {
            return (Input) Enum.valueOf(Input.class, str);
        }

        public static Input[] values() {
            return (Input[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    public /* synthetic */ FeedViewModel(AppSceneType appSceneType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AppSceneDefault() : appSceneType, (i & 2) != 0 ? null : str);
    }

    private final native void Swift_callback_performLoad_6(long Swift_peer, ReloadReason reason, Function1<? super Throwable, Unit> f_callback);

    private final native void Swift_cancelModuleDisplay_11(long Swift_peer, FeedRowID row);

    private final native FeedEventItemViewModel Swift_eventViewModel_2(long Swift_peer, FeedRowID row);

    private final native boolean Swift_isEmptyAndExhausted(long Swift_peer);

    private final native boolean Swift_isInitialLoading(long Swift_peer);

    private final native boolean Swift_isLoadingBottom(long Swift_peer);

    private final native boolean Swift_isRefreshing(long Swift_peer);

    private final native boolean Swift_isSurfaceVisible(long Swift_peer);

    private final native void Swift_isSurfaceVisible_set(long Swift_peer, boolean value);

    private final native boolean Swift_isWalkBroken(long Swift_peer);

    private final native FeedKeyRaceViewModel Swift_keyRaceViewModel_3(long Swift_peer, FeedRowID row);

    private final native FeedLabelItemViewModel Swift_labelViewModel_1(long Swift_peer, FeedRowID row);

    private final native EError Swift_loadError(long Swift_peer);

    private final native FeedModuleViewModel Swift_moduleViewModel_4(long Swift_peer, FeedRowID row);

    private final native void Swift_openPolymapMiniMap_9(long Swift_peer);

    private final native MidtermsPolymapViewModel Swift_polymapMiniMap(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native FeedPromoItemViewModel Swift_promoViewModel_0(long Swift_peer, FeedRowID row);

    private final native void Swift_reportModuleDisplayed_10(long Swift_peer, FeedRowID row);

    private final native List<FeedRowID> Swift_rows(long Swift_peer);

    private final native void Swift_sendInput_8(long Swift_peer, Input input);

    private final native void Swift_setup_5(long Swift_peer);

    private final native String Swift_walkBrokenTitle(long Swift_peer);

    public static final /* synthetic */ void access$Swift_callback_performLoad_6(FeedViewModel feedViewModel, long j, ReloadReason reloadReason, Function1 function1) {
        feedViewModel.Swift_callback_performLoad_6(j, reloadReason, function1);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final void cancelModuleDisplay(FeedRowID row) {
        row.getClass();
        Swift_cancelModuleDisplay_11(getSwift_peer(), row);
    }

    public final FeedEventItemViewModel eventViewModel(FeedRowID for_) {
        for_.getClass();
        return Swift_eventViewModel_2(getSwift_peer(), for_);
    }

    public final EError getLoadError() {
        return Swift_loadError(getSwift_peer());
    }

    public final MidtermsPolymapViewModel getPolymapMiniMap() {
        return Swift_polymapMiniMap(getSwift_peer());
    }

    public final List<FeedRowID> getRows() {
        return Swift_rows(getSwift_peer());
    }

    public final String getWalkBrokenTitle() {
        return Swift_walkBrokenTitle(getSwift_peer());
    }

    public final boolean isEmptyAndExhausted() {
        return Swift_isEmptyAndExhausted(getSwift_peer());
    }

    public final boolean isInitialLoading() {
        return Swift_isInitialLoading(getSwift_peer());
    }

    public final boolean isLoadingBottom() {
        return Swift_isLoadingBottom(getSwift_peer());
    }

    public final boolean isRefreshing() {
        return Swift_isRefreshing(getSwift_peer());
    }

    public final boolean isSurfaceVisible() {
        return Swift_isSurfaceVisible(getSwift_peer());
    }

    public final boolean isWalkBroken() {
        return Swift_isWalkBroken(getSwift_peer());
    }

    public final FeedKeyRaceViewModel keyRaceViewModel(FeedRowID for_) {
        for_.getClass();
        return Swift_keyRaceViewModel_3(getSwift_peer(), for_);
    }

    public final FeedLabelItemViewModel labelViewModel(FeedRowID for_) {
        for_.getClass();
        return Swift_labelViewModel_1(getSwift_peer(), for_);
    }

    public final FeedModuleViewModel moduleViewModel(FeedRowID for_) {
        for_.getClass();
        return Swift_moduleViewModel_4(getSwift_peer(), for_);
    }

    public final void openPolymapMiniMap() {
        Swift_openPolymapMiniMap_9(getSwift_peer());
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public Object performLoad(ReloadReason reloadReason, Continuation<? super Unit> continuation) {
        Object run = Async.INSTANCE.run(new FeedViewModel$performLoad$2(this, reloadReason, null), continuation);
        if (run == u85.COROUTINE_SUSPENDED) {
            return run;
        }
        return Unit.INSTANCE;
    }

    public final FeedPromoItemViewModel promoViewModel(FeedRowID for_) {
        for_.getClass();
        return Swift_promoViewModel_0(getSwift_peer(), for_);
    }

    public final void reportModuleDisplayed(FeedRowID row) {
        row.getClass();
        Swift_reportModuleDisplayed_10(getSwift_peer(), row);
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_8(getSwift_peer(), input);
    }

    public final void setSurfaceVisible(boolean z) {
        Swift_isSurfaceVisible_set(getSwift_peer(), z);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_5(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0082 J\u0006\u0010\u000b\u001a\u00020\fJ\t\u0010\r\u001a\u00020\fH\u0082 ¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/FeedViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_7", "", "Lskip/bridge/SwiftObjectPointer;", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "mock", "Lcom/polymarket/usviewmodels/FeedViewModel;", "Swift_Companion_mock_12", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_7(AppSceneType scene, String id);

        private final native FeedViewModel Swift_Companion_mock_12();

        public static final /* synthetic */ long access$Swift_Companion_constructor_7(Companion companion, AppSceneType appSceneType, String str) {
            return companion.Swift_Companion_constructor_7(appSceneType, str);
        }

        public final FeedViewModel mock() {
            return Swift_Companion_mock_12();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedViewModel(AppSceneType appSceneType, String str) {
        super(Companion.access$Swift_Companion_constructor_7(INSTANCE, appSceneType, str), (SwiftPeerMarker) null);
        appSceneType.getClass();
    }

    public FeedViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }
}
