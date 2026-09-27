package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u00020\u0001:\u0003!\"#B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0007\u0010\fJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0015\u0010\u0014\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017J\u001d\u0010\u0018\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0082 J\u0014\u0010\u0019\u001a\u00020\u00132\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ#\u0010\u001a\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082 J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0082 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "chambers", "", "Lcom/polymarket/usviewmodels/MidtermsChamber;", "(Ljava/util/List;)V", "presentation", "Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation;", "getPresentation", "()Lcom/polymarket/usviewmodels/MidtermsPolymapPresentation;", "Swift_presentation", "setup", "", "Swift_setup_1", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$Input;", "Swift_sendInput_2", "setChambers", "Swift_setChambers_3", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "RatingToggleSource", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MidtermsPolymapViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$RatingToggleSource;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "filterCapsule", "balanceOfPowerLegend", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class RatingToggleSource implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ RatingToggleSource[] $VALUES;
        public static final RatingToggleSource filterCapsule = new RatingToggleSource("filterCapsule", 0);
        public static final RatingToggleSource balanceOfPowerLegend = new RatingToggleSource("balanceOfPowerLegend", 1);

        private static final /* synthetic */ RatingToggleSource[] $values() {
            return new RatingToggleSource[]{filterCapsule, balanceOfPowerLegend};
        }

        static {
            RatingToggleSource[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private RatingToggleSource(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static RatingToggleSource valueOf(String str) {
            return (RatingToggleSource) Enum.valueOf(RatingToggleSource.class, str);
        }

        public static RatingToggleSource[] values() {
            return (RatingToggleSource[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MidtermsPolymapViewModel(List<MidtermsChamber> list) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, list), (SwiftPeerMarker) null);
        list.getClass();
    }

    private final native MidtermsPolymapPresentation Swift_presentation(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_sendInput_2(long Swift_peer, Input input);

    private final native void Swift_setChambers_3(long Swift_peer, List<MidtermsChamber> chambers);

    private final native void Swift_setup_1(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final MidtermsPolymapPresentation getPresentation() {
        return Swift_presentation(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_2(getSwift_peer(), input);
    }

    public final void setChambers(List<MidtermsChamber> chambers) {
        chambers.getClass();
        Swift_setChambers_3(getSwift_peer(), chambers);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00172\u00020\u0001:\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnChamberSelectedCase", "OnFocusRequestedCase", "OnRatingToggledCase", "OnRegionPickedCase", "OnViewDidAppearCase", "OnViewDidDisappearCase", "Companion", "Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$Input$OnChamberSelectedCase;", "Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$Input$OnFocusRequestedCase;", "Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$Input$OnRatingToggledCase;", "Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$Input$OnRegionPickedCase;", "Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$Input$OnViewDidAppearCase;", "Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$Input$OnViewDidDisappearCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidAppear = new OnViewDidAppearCase();
        private static final Input onViewDidDisappear = new OnViewDidDisappearCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$Input$OnChamberSelectedCase;", "Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnChamberSelectedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnChamberSelectedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$Input$OnFocusRequestedCase;", "Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/MidtermsRegion;", "<init>", "(Lcom/polymarket/usviewmodels/MidtermsRegion;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/MidtermsRegion;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnFocusRequestedCase extends Input {
            private final MidtermsRegion associated0;

            public OnFocusRequestedCase(MidtermsRegion midtermsRegion) {
                super(null);
                this.associated0 = midtermsRegion;
            }

            public final MidtermsRegion getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$Input$OnRatingToggledCase;", "Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/MidtermsRaceRating;", "associated1", "Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$RatingToggleSource;", "<init>", "(Lcom/polymarket/usviewmodels/MidtermsRaceRating;Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$RatingToggleSource;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/MidtermsRaceRating;", "getAssociated1", "()Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$RatingToggleSource;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRatingToggledCase extends Input {
            private final MidtermsRaceRating associated0;
            private final RatingToggleSource associated1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnRatingToggledCase(MidtermsRaceRating midtermsRaceRating, RatingToggleSource ratingToggleSource) {
                super(null);
                midtermsRaceRating.getClass();
                ratingToggleSource.getClass();
                this.associated0 = midtermsRaceRating;
                this.associated1 = ratingToggleSource;
            }

            public final MidtermsRaceRating getAssociated0() {
                return this.associated0;
            }

            public final RatingToggleSource getAssociated1() {
                return this.associated1;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$Input$OnRegionPickedCase;", "Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRegionPickedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnRegionPickedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$Input$OnViewDidAppearCase;", "Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidAppearCase extends Input {
            public OnViewDidAppearCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$Input$OnViewDidDisappearCase;", "Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidDisappearCase extends Input {
            public OnViewDidDisappearCase() {
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

        public static final /* synthetic */ Input access$getOnViewDidDisappear$cp() {
            return onViewDidDisappear;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\tJ\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$Input$Companion;", "", "<init>", "()V", "onChamberSelected", "Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$Input;", "associated0", "", "onFocusRequested", "Lcom/polymarket/usviewmodels/MidtermsRegion;", "onRatingToggled", "Lcom/polymarket/usviewmodels/MidtermsRaceRating;", "associated1", "Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$RatingToggleSource;", "onRegionPicked", "onViewDidAppear", "getOnViewDidAppear", "()Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$Input;", "onViewDidDisappear", "getOnViewDidDisappear", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnViewDidAppear() {
                return Input.access$getOnViewDidAppear$cp();
            }

            public final Input getOnViewDidDisappear() {
                return Input.access$getOnViewDidDisappear$cp();
            }

            public final Input onChamberSelected(String associated0) {
                associated0.getClass();
                return new OnChamberSelectedCase(associated0);
            }

            public final Input onFocusRequested(MidtermsRegion associated0) {
                return new OnFocusRequestedCase(associated0);
            }

            public final Input onRatingToggled(MidtermsRaceRating associated0, RatingToggleSource associated1) {
                associated0.getClass();
                associated1.getClass();
                return new OnRatingToggledCase(associated0, associated1);
            }

            public final Input onRegionPicked(String associated0) {
                associated0.getClass();
                return new OnRegionPickedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082 ¨\u0006\n"}, d2 = {"Lcom/polymarket/usviewmodels/MidtermsPolymapViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "chambers", "", "Lcom/polymarket/usviewmodels/MidtermsChamber;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(List<MidtermsChamber> chambers);

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, List list) {
            return companion.Swift_Companion_constructor_0(list);
        }

        private Companion() {
        }
    }

    public MidtermsPolymapViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }
}
