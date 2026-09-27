package com.polymarket.usviewmodels;

import com.polymarket.usviewmodels.AppViewModel;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0002>?B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001f\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u001d\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u001f\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010!\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010%\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0010\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020\u0015J\u001f\u0010)\u001a\u0004\u0018\u00010'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010*\u001a\u00020\u0015H\u0082 J\u0010\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010(\u001a\u00020\u0015J\u001f\u0010-\u001a\u0004\u0018\u00010,2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010*\u001a\u00020\u0015H\u0082 J\u0010\u0010.\u001a\u0004\u0018\u00010/2\u0006\u0010(\u001a\u00020\u0015J\u001f\u00100\u001a\u0004\u0018\u00010/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010*\u001a\u00020\u0015H\u0082 J\b\u00101\u001a\u000202H\u0016J\u0015\u00103\u001a\u0002022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u00104\u001a\u0002022\u0006\u00105\u001a\u000206J\u001d\u00107\u001a\u0002022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00105\u001a\u000206H\u0082 J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020:092\u0006\u0010;\u001a\u00020<H\u0016J\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020:092\u0006\u0010;\u001a\u00020<H\u0082 R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010 \u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b \u0010\u001cR\u0011\u0010\"\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006@"}, d2 = {"Lcom/polymarket/usviewmodels/FeedModuleViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "(Lcom/polymarket/usviewmodels/AppSceneType;Ljava/lang/String;)V", "headerPresentation", "Lcom/polymarket/usviewmodels/FeedModuleHeaderPresentation;", "getHeaderPresentation", "()Lcom/polymarket/usviewmodels/FeedModuleHeaderPresentation;", "Swift_headerPresentation", "childRows", "", "Lcom/polymarket/usviewmodels/FeedRowID;", "getChildRows", "()Ljava/util/List;", "Swift_childRows", "hasContinuation", "", "getHasContinuation", "()Z", "Swift_hasContinuation", "isLoadingMore", "Swift_isLoadingMore", "isOpenEnabled", "Swift_isOpenEnabled", "showMoreTitle", "getShowMoreTitle", "()Ljava/lang/String;", "Swift_showMoreTitle", "promoViewModel", "Lcom/polymarket/usviewmodels/FeedPromoItemViewModel;", "for_", "Swift_promoViewModel_0", "row", "eventViewModel", "Lcom/polymarket/usviewmodels/FeedEventItemViewModel;", "Swift_eventViewModel_1", "keyRaceViewModel", "Lcom/polymarket/usviewmodels/FeedKeyRaceViewModel;", "Swift_keyRaceViewModel_2", "setup", "", "Swift_setup_3", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/FeedModuleViewModel$Input;", "Swift_sendInput_5", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FeedModuleViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/FeedModuleViewModel$Input;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "onHeaderTapped", "onShowMoreTapped", "onNearEnd", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Input implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Input[] $VALUES;
        public static final Input onHeaderTapped = new Input("onHeaderTapped", 0);
        public static final Input onShowMoreTapped = new Input("onShowMoreTapped", 1);
        public static final Input onNearEnd = new Input("onNearEnd", 2);

        private static final /* synthetic */ Input[] $values() {
            return new Input[]{onHeaderTapped, onShowMoreTapped, onNearEnd};
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

    public /* synthetic */ FeedModuleViewModel(AppSceneType appSceneType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AppSceneDefault() : appSceneType, (i & 2) != 0 ? null : str);
    }

    private final native List<FeedRowID> Swift_childRows(long Swift_peer);

    private final native FeedEventItemViewModel Swift_eventViewModel_1(long Swift_peer, FeedRowID row);

    private final native boolean Swift_hasContinuation(long Swift_peer);

    private final native FeedModuleHeaderPresentation Swift_headerPresentation(long Swift_peer);

    private final native boolean Swift_isLoadingMore(long Swift_peer);

    private final native boolean Swift_isOpenEnabled(long Swift_peer);

    private final native FeedKeyRaceViewModel Swift_keyRaceViewModel_2(long Swift_peer, FeedRowID row);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native FeedPromoItemViewModel Swift_promoViewModel_0(long Swift_peer, FeedRowID row);

    private final native void Swift_sendInput_5(long Swift_peer, Input input);

    private final native void Swift_setup_3(long Swift_peer);

    private final native String Swift_showMoreTitle(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final FeedEventItemViewModel eventViewModel(FeedRowID for_) {
        for_.getClass();
        return Swift_eventViewModel_1(getSwift_peer(), for_);
    }

    public final List<FeedRowID> getChildRows() {
        return Swift_childRows(getSwift_peer());
    }

    public final boolean getHasContinuation() {
        return Swift_hasContinuation(getSwift_peer());
    }

    public final FeedModuleHeaderPresentation getHeaderPresentation() {
        return Swift_headerPresentation(getSwift_peer());
    }

    public final String getShowMoreTitle() {
        return Swift_showMoreTitle(getSwift_peer());
    }

    public final boolean isLoadingMore() {
        return Swift_isLoadingMore(getSwift_peer());
    }

    public final boolean isOpenEnabled() {
        return Swift_isOpenEnabled(getSwift_peer());
    }

    public final FeedKeyRaceViewModel keyRaceViewModel(FeedRowID for_) {
        for_.getClass();
        return Swift_keyRaceViewModel_2(getSwift_peer(), for_);
    }

    public final FeedPromoItemViewModel promoViewModel(FeedRowID for_) {
        for_.getClass();
        return Swift_promoViewModel_0(getSwift_peer(), for_);
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
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0082 J\u0010\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\nJ\u0011\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0082 ¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/FeedModuleViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_4", "", "Lskip/bridge/SwiftObjectPointer;", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "mock", "Lcom/polymarket/usviewmodels/FeedModuleViewModel;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "Swift_Companion_mock_6", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_4(AppSceneType scene, String id);

        private final native FeedModuleViewModel Swift_Companion_mock_6(String title);

        public static final /* synthetic */ long access$Swift_Companion_constructor_4(Companion companion, AppSceneType appSceneType, String str) {
            return companion.Swift_Companion_constructor_4(appSceneType, str);
        }

        public static /* synthetic */ FeedModuleViewModel mock$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "Module title";
            }
            return companion.mock(str);
        }

        public final FeedModuleViewModel mock(String title) {
            title.getClass();
            return Swift_Companion_mock_6(title);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedModuleViewModel(AppSceneType appSceneType, String str) {
        super(Companion.access$Swift_Companion_constructor_4(INSTANCE, appSceneType, str), (SwiftPeerMarker) null);
        appSceneType.getClass();
    }

    public FeedModuleViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }
}
