package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.usviewmodels.AppViewModel;
import com.polymarket.usviewmodels.MidtermsRace;
import com.polymarket.usviewmodels.MidtermsRaceRating;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 32\u00020\u0001:\u000223B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001f\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u0016\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u0019\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u001b\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u001d\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010!\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010$\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010%\u001a\u00020&H\u0016J\u0015\u0010'\u001a\u00020&2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020*J\u001d\u0010+\u001a\u00020&2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010)\u001a\u00020*H\u0082 J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u0010/\u001a\u000200H\u0016J\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u0010/\u001a\u000200H\u0082 R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u001c\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u001e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\"\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b#\u0010 ¨\u00064"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapSectionViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "(Lcom/polymarket/usviewmodels/AppSceneType;Ljava/lang/String;)V", "polymap", "Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel;", "getPolymap", "()Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel;", "Swift_polymap", "isWalking", "", "()Z", "Swift_isWalking", "hasFailed", "getHasFailed", "Swift_hasFailed", "isInitialLoading", "Swift_isInitialLoading", "isAwaitingChambers", "Swift_isAwaitingChambers", "emptyTitle", "getEmptyTitle", "()Ljava/lang/String;", "Swift_emptyTitle", "failedTitle", "getFailedTitle", "Swift_failedTitle", "setup", "", "Swift_setup_0", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/MidtermsPolymapSectionViewModel$Input;", "Swift_sendInput_2", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MidtermsPolymapSectionViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ MidtermsPolymapSectionViewModel(AppSceneType appSceneType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AppSceneDefault() : appSceneType, (i & 2) != 0 ? null : str);
    }

    private final native String Swift_emptyTitle(long Swift_peer);

    private final native String Swift_failedTitle(long Swift_peer);

    private final native boolean Swift_hasFailed(long Swift_peer);

    private final native boolean Swift_isAwaitingChambers(long Swift_peer);

    private final native boolean Swift_isInitialLoading(long Swift_peer);

    private final native boolean Swift_isWalking(long Swift_peer);

    private final native MidtermsPolymapViewModel Swift_polymap(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_sendInput_2(long Swift_peer, Input input);

    private final native void Swift_setup_0(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String getEmptyTitle() {
        return Swift_emptyTitle(getSwift_peer());
    }

    public final String getFailedTitle() {
        return Swift_failedTitle(getSwift_peer());
    }

    public final boolean getHasFailed() {
        return Swift_hasFailed(getSwift_peer());
    }

    public final MidtermsPolymapViewModel getPolymap() {
        return Swift_polymap(getSwift_peer());
    }

    public final boolean isAwaitingChambers() {
        return Swift_isAwaitingChambers(getSwift_peer());
    }

    public final boolean isInitialLoading() {
        return Swift_isInitialLoading(getSwift_peer());
    }

    public final boolean isWalking() {
        return Swift_isWalking(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_2(getSwift_peer(), input);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_0(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00162\u00020\u0001:\u0006\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapSectionViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnRaceSelectedCase", "OnRaceOutcomeSelectedCase", "OnHeadlineSelectedCase", "OnHeadlineOutcomeSelectedCase", "OnRetryCase", "Companion", "Lcom/polymarket/usviewmodels/MidtermsPolymapSectionViewModel$Input$OnHeadlineOutcomeSelectedCase;", "Lcom/polymarket/usviewmodels/MidtermsPolymapSectionViewModel$Input$OnHeadlineSelectedCase;", "Lcom/polymarket/usviewmodels/MidtermsPolymapSectionViewModel$Input$OnRaceOutcomeSelectedCase;", "Lcom/polymarket/usviewmodels/MidtermsPolymapSectionViewModel$Input$OnRaceSelectedCase;", "Lcom/polymarket/usviewmodels/MidtermsPolymapSectionViewModel$Input$OnRetryCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onHeadlineSelected = new OnHeadlineSelectedCase();
        private static final Input onRetry = new OnRetryCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapSectionViewModel$Input$OnHeadlineOutcomeSelectedCase;", "Lcom/polymarket/usviewmodels/MidtermsPolymapSectionViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;", "<init>", "(Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnHeadlineOutcomeSelectedCase extends Input {
            private final MidtermsRaceRating.Party associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnHeadlineOutcomeSelectedCase(MidtermsRaceRating.Party party) {
                super(null);
                party.getClass();
                this.associated0 = party;
            }

            public final MidtermsRaceRating.Party getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapSectionViewModel$Input$OnHeadlineSelectedCase;", "Lcom/polymarket/usviewmodels/MidtermsPolymapSectionViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnHeadlineSelectedCase extends Input {
            public OnHeadlineSelectedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapSectionViewModel$Input$OnRaceOutcomeSelectedCase;", "Lcom/polymarket/usviewmodels/MidtermsPolymapSectionViewModel$Input;", "associated0", "", "associated1", "Lcom/polymarket/usviewmodels/MidtermsRace$Slot;", "<init>", "(Ljava/lang/String;Lcom/polymarket/usviewmodels/MidtermsRace$Slot;)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", "()Lcom/polymarket/usviewmodels/MidtermsRace$Slot;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRaceOutcomeSelectedCase extends Input {
            private final String associated0;
            private final MidtermsRace.Slot associated1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnRaceOutcomeSelectedCase(String str, MidtermsRace.Slot slot) {
                super(null);
                str.getClass();
                slot.getClass();
                this.associated0 = str;
                this.associated1 = slot;
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public final MidtermsRace.Slot getAssociated1() {
                return this.associated1;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapSectionViewModel$Input$OnRaceSelectedCase;", "Lcom/polymarket/usviewmodels/MidtermsPolymapSectionViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRaceSelectedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnRaceSelectedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapSectionViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/MidtermsPolymapSectionViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRetryCase extends Input {
            public OnRetryCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnHeadlineSelected$cp() {
            return onHeadlineSelected;
        }

        public static final /* synthetic */ Input access$getOnRetry$cp() {
            return onRetry;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000fR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapSectionViewModel$Input$Companion;", "", "<init>", "()V", "onRaceSelected", "Lcom/polymarket/usviewmodels/MidtermsPolymapSectionViewModel$Input;", "associated0", "", "onRaceOutcomeSelected", "associated1", "Lcom/polymarket/usviewmodels/MidtermsRace$Slot;", "onHeadlineSelected", "getOnHeadlineSelected", "()Lcom/polymarket/usviewmodels/MidtermsPolymapSectionViewModel$Input;", "onHeadlineOutcomeSelected", "Lcom/polymarket/usviewmodels/MidtermsRaceRating$Party;", "onRetry", "getOnRetry", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnHeadlineSelected() {
                return Input.access$getOnHeadlineSelected$cp();
            }

            public final Input getOnRetry() {
                return Input.access$getOnRetry$cp();
            }

            public final Input onHeadlineOutcomeSelected(MidtermsRaceRating.Party associated0) {
                associated0.getClass();
                return new OnHeadlineOutcomeSelectedCase(associated0);
            }

            public final Input onRaceOutcomeSelected(String associated0, MidtermsRace.Slot associated1) {
                associated0.getClass();
                associated1.getClass();
                return new OnRaceOutcomeSelectedCase(associated0, associated1);
            }

            public final Input onRaceSelected(String associated0) {
                associated0.getClass();
                return new OnRaceSelectedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0082 ¨\u0006\u000b"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapSectionViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_1", "", "Lskip/bridge/SwiftObjectPointer;", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_1(AppSceneType scene, String id);

        public static final /* synthetic */ long access$Swift_Companion_constructor_1(Companion companion, AppSceneType appSceneType, String str) {
            return companion.Swift_Companion_constructor_1(appSceneType, str);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MidtermsPolymapSectionViewModel(AppSceneType appSceneType, String str) {
        super(Companion.access$Swift_Companion_constructor_1(INSTANCE, appSceneType, str), (SwiftPeerMarker) null);
        appSceneType.getClass();
    }

    public MidtermsPolymapSectionViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }
}
