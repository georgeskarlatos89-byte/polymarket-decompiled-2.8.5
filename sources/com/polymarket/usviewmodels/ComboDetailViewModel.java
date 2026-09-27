package com.polymarket.usviewmodels;

import com.fingerprintjs.android.fpjs_pro.g;
import com.polymarket.data.EComboLegDetail;
import com.polymarket.data.EEvent;
import com.polymarket.data.EUserPosition;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.kz3;
import defpackage.rx3;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTripOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0007\u0018\u0000 c2\u00020\u0001:\u0006^_`abcB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rB=\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u0016B5\b\u0016\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u001aJ\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010 \u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010#\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010&\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u00102\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010.\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u00101\u001a\u0004\u0018\u00010\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00104\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00107\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010<\u001a\u0004\u0018\u0001092\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010A\u001a\u0004\u0018\u00010>2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010D\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010G\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010L\u001a\u00020I2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010N\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020UJ\u001d\u0010V\u001a\u00020S2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010T\u001a\u00020UH\u0082 J\b\u0010W\u001a\u00020SH\u0016J\u0015\u0010X\u001a\u00020S2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Y\u001a\b\u0012\u0004\u0012\u00020[0Z2\u0006\u0010\\\u001a\u00020\u0013H\u0016J\u0017\u0010]\u001a\b\u0012\u0004\u0012\u00020[0Z2\u0006\u0010\\\u001a\u00020\u0013H\u0082 R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010!\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010$\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b%\u0010\"R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00108F¢\u0006\u0006\u001a\u0004\b)\u0010\u001cR\u0011\u0010+\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010/\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b0\u0010-R\u0011\u00102\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b3\u0010\"R\u0011\u00105\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b6\u0010\u001fR\u0013\u00108\u001a\u0004\u0018\u0001098F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0013\u0010=\u001a\u0004\u0018\u00010>8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0011\u0010B\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bC\u0010\"R\u0011\u0010E\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bF\u0010\"R\u0011\u0010H\u001a\u00020I8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bM\u0010\"R\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\bP\u0010\u001c¨\u0006d"}, d2 = {"Lcom/polymarket/usviewmodels/ComboDetailViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "position", "Lcom/polymarket/data/EUserPosition;", "callbacks", "Lcom/polymarket/usviewmodels/ComboDetailViewModel$Callbacks;", "(Lcom/polymarket/data/EUserPosition;Lcom/polymarket/usviewmodels/ComboDetailViewModel$Callbacks;)V", "sharedCombo", RadarTripOptions.KEY_LEGS, "", "Lcom/polymarket/data/EComboLegDetail;", "totalLegCount", "", "comboId", "", "(Lcom/polymarket/data/EUserPosition;Ljava/util/List;ILjava/lang/String;Lcom/polymarket/usviewmodels/ComboDetailViewModel$Callbacks;)V", "allowsLegNavigation", "", "isShort", "(Ljava/util/List;ZZLcom/polymarket/usviewmodels/ComboDetailViewModel$Callbacks;)V", "getLegs", "()Ljava/util/List;", "Swift_legs", "getTotalLegCount", "()I", "Swift_totalLegCount", "isLoadingDetails", "()Z", "Swift_isLoadingDetails", "detailsUnavailable", "getDetailsUnavailable", "Swift_detailsUnavailable", "legGroups", "Lcom/polymarket/usviewmodels/ComboLegGroupPresentation;", "getLegGroups", "Swift_legGroups", "titleText", "getTitleText", "()Ljava/lang/String;", "Swift_titleText", "sideTagText", "getSideTagText", "Swift_sideTagText", "showsLegsSkeleton", "getShowsLegsSkeleton", "Swift_showsLegsSkeleton", "skeletonLegCount", "getSkeletonLegCount", "Swift_skeletonLegCount", "stats", "Lcom/polymarket/usviewmodels/ComboDetailViewModel$Stats;", "getStats", "()Lcom/polymarket/usviewmodels/ComboDetailViewModel$Stats;", "Swift_stats", "bottomAction", "Lcom/polymarket/usviewmodels/ComboDetailViewModel$BottomAction;", "getBottomAction", "()Lcom/polymarket/usviewmodels/ComboDetailViewModel$BottomAction;", "Swift_bottomAction", "showsShare", "getShowsShare", "Swift_showsShare", "showsOdds", "getShowsOdds", "Swift_showsOdds", "oddsDisplay", "Lcom/polymarket/usviewmodels/ComboDetailViewModel$OddsDisplay;", "getOddsDisplay", "()Lcom/polymarket/usviewmodels/ComboDetailViewModel$OddsDisplay;", "Swift_oddsDisplay", "getAllowsLegNavigation", "Swift_allowsLegNavigation", "buyableLegs", "getBuyableLegs", "Swift_buyableLegs", "sendInput", "", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/ComboDetailViewModel$Input;", "Swift_sendInput_3", "cancelWork", "Swift_cancelWork_4", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Callbacks", "Stats", "BottomAction", "OddsDisplay", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComboDetailViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/ComboDetailViewModel$BottomAction;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "buy", "cashOut", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class BottomAction implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ BottomAction[] $VALUES;
        public static final BottomAction buy = new BottomAction("buy", 0);
        public static final BottomAction cashOut = new BottomAction("cashOut", 1);

        private static final /* synthetic */ BottomAction[] $values() {
            return new BottomAction[]{buy, cashOut};
        }

        static {
            BottomAction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private BottomAction(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static BottomAction valueOf(String str) {
            return (BottomAction) Enum.valueOf(BottomAction.class, str);
        }

        public static BottomAction[] values() {
            return (BottomAction[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/ComboDetailViewModel$OddsDisplay;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "hidden", "loading", "shown", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class OddsDisplay implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ OddsDisplay[] $VALUES;
        public static final OddsDisplay hidden = new OddsDisplay("hidden", 0);
        public static final OddsDisplay loading = new OddsDisplay("loading", 1);
        public static final OddsDisplay shown = new OddsDisplay("shown", 2);

        private static final /* synthetic */ OddsDisplay[] $values() {
            return new OddsDisplay[]{hidden, loading, shown};
        }

        static {
            OddsDisplay[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private OddsDisplay(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static OddsDisplay valueOf(String str) {
            return (OddsDisplay) Enum.valueOf(OddsDisplay.class, str);
        }

        public static OddsDisplay[] values() {
            return (OddsDisplay[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ComboDetailViewModel(EUserPosition eUserPosition, List list, int i, String str, Callbacks callbacks, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(eUserPosition, list, i, r5, r6);
        String str2;
        Callbacks callbacks2;
        if ((i2 & 8) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i2 & 16) != 0) {
            callbacks2 = new Callbacks(null, null, null, null, 15, null);
        } else {
            callbacks2 = callbacks;
        }
    }

    private final native boolean Swift_allowsLegNavigation(long Swift_peer);

    private final native BottomAction Swift_bottomAction(long Swift_peer);

    private final native List<EComboLegDetail> Swift_buyableLegs(long Swift_peer);

    private final native void Swift_cancelWork_4(long Swift_peer);

    private final native boolean Swift_detailsUnavailable(long Swift_peer);

    private final native boolean Swift_isLoadingDetails(long Swift_peer);

    private final native List<ComboLegGroupPresentation> Swift_legGroups(long Swift_peer);

    private final native List<EComboLegDetail> Swift_legs(long Swift_peer);

    private final native OddsDisplay Swift_oddsDisplay(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_sendInput_3(long Swift_peer, Input input);

    private final native boolean Swift_showsLegsSkeleton(long Swift_peer);

    private final native boolean Swift_showsOdds(long Swift_peer);

    private final native boolean Swift_showsShare(long Swift_peer);

    private final native String Swift_sideTagText(long Swift_peer);

    private final native int Swift_skeletonLegCount(long Swift_peer);

    private final native Stats Swift_stats(long Swift_peer);

    private final native String Swift_titleText(long Swift_peer);

    private final native int Swift_totalLegCount(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void cancelWork() {
        Swift_cancelWork_4(getSwift_peer());
    }

    public final boolean getAllowsLegNavigation() {
        return Swift_allowsLegNavigation(getSwift_peer());
    }

    public final BottomAction getBottomAction() {
        return Swift_bottomAction(getSwift_peer());
    }

    public final List<EComboLegDetail> getBuyableLegs() {
        return Swift_buyableLegs(getSwift_peer());
    }

    public final boolean getDetailsUnavailable() {
        return Swift_detailsUnavailable(getSwift_peer());
    }

    public final List<ComboLegGroupPresentation> getLegGroups() {
        return Swift_legGroups(getSwift_peer());
    }

    public final List<EComboLegDetail> getLegs() {
        return Swift_legs(getSwift_peer());
    }

    public final OddsDisplay getOddsDisplay() {
        return Swift_oddsDisplay(getSwift_peer());
    }

    public final boolean getShowsLegsSkeleton() {
        return Swift_showsLegsSkeleton(getSwift_peer());
    }

    public final boolean getShowsOdds() {
        return Swift_showsOdds(getSwift_peer());
    }

    public final boolean getShowsShare() {
        return Swift_showsShare(getSwift_peer());
    }

    public final String getSideTagText() {
        return Swift_sideTagText(getSwift_peer());
    }

    public final int getSkeletonLegCount() {
        return Swift_skeletonLegCount(getSwift_peer());
    }

    public final Stats getStats() {
        return Swift_stats(getSwift_peer());
    }

    public final String getTitleText() {
        return Swift_titleText(getSwift_peer());
    }

    public final int getTotalLegCount() {
        return Swift_totalLegCount(getSwift_peer());
    }

    public final boolean isLoadingDetails() {
        return Swift_isLoadingDetails(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_3(getSwift_peer(), input);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f2\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/polymarket/usviewmodels/ComboDetailViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnShareCase", "OnLegTappedCase", "OnCashOutCase", "OnBuyCase", "Companion", "Lcom/polymarket/usviewmodels/ComboDetailViewModel$Input$OnBuyCase;", "Lcom/polymarket/usviewmodels/ComboDetailViewModel$Input$OnCashOutCase;", "Lcom/polymarket/usviewmodels/ComboDetailViewModel$Input$OnLegTappedCase;", "Lcom/polymarket/usviewmodels/ComboDetailViewModel$Input$OnShareCase;", "Lcom/polymarket/usviewmodels/ComboDetailViewModel$Input$OnViewDidLoadCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onShare = new OnShareCase();
        private static final Input onCashOut = new OnCashOutCase();
        private static final Input onBuy = new OnBuyCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/ComboDetailViewModel$Input$OnBuyCase;", "Lcom/polymarket/usviewmodels/ComboDetailViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnBuyCase extends Input {
            public OnBuyCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/ComboDetailViewModel$Input$OnCashOutCase;", "Lcom/polymarket/usviewmodels/ComboDetailViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnCashOutCase extends Input {
            public OnCashOutCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/usviewmodels/ComboDetailViewModel$Input$OnLegTappedCase;", "Lcom/polymarket/usviewmodels/ComboDetailViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "eventId", "getEventId", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnLegTappedCase extends Input {
            private final String associated0;
            private final String eventId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnLegTappedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
                this.eventId = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public final String getEventId() {
                return this.eventId;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/ComboDetailViewModel$Input$OnShareCase;", "Lcom/polymarket/usviewmodels/ComboDetailViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnShareCase extends Input {
            public OnShareCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/ComboDetailViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/ComboDetailViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidLoadCase extends Input {
            public OnViewDidLoadCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnBuy$cp() {
            return onBuy;
        }

        public static final /* synthetic */ Input access$getOnCashOut$cp() {
            return onCashOut;
        }

        public static final /* synthetic */ Input access$getOnShare$cp() {
            return onShare;
        }

        public static final /* synthetic */ Input access$getOnViewDidLoad$cp() {
            return onViewDidLoad;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/polymarket/usviewmodels/ComboDetailViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/ComboDetailViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/ComboDetailViewModel$Input;", "onShare", "getOnShare", "onLegTapped", "eventId", "", "onCashOut", "getOnCashOut", "onBuy", "getOnBuy", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnBuy() {
                return Input.access$getOnBuy$cp();
            }

            public final Input getOnCashOut() {
                return Input.access$getOnCashOut$cp();
            }

            public final Input getOnShare() {
                return Input.access$getOnShare$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input onLegTapped(String eventId) {
                eventId.getClass();
                return new OnLegTappedCase(eventId);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082 J=\u0010\u000b\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\f\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\t\u001a\u00020\nH\u0082 J3\u0010\u0014\u001a\u00060\u0005j\u0002`\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\nH\u0082 ¨\u0006\u0018"}, d2 = {"Lcom/polymarket/usviewmodels/ComboDetailViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "position", "Lcom/polymarket/data/EUserPosition;", "callbacks", "Lcom/polymarket/usviewmodels/ComboDetailViewModel$Callbacks;", "Swift_Companion_constructor_1", "sharedCombo", RadarTripOptions.KEY_LEGS, "", "Lcom/polymarket/data/EComboLegDetail;", "totalLegCount", "", "comboId", "", "Swift_Companion_constructor_2", "allowsLegNavigation", "", "isShort", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(EUserPosition position, Callbacks callbacks);

        private final native long Swift_Companion_constructor_1(EUserPosition sharedCombo, List<EComboLegDetail> legs, int totalLegCount, String comboId, Callbacks callbacks);

        private final native long Swift_Companion_constructor_2(List<EComboLegDetail> legs, boolean allowsLegNavigation, boolean isShort, Callbacks callbacks);

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, EUserPosition eUserPosition, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(eUserPosition, callbacks);
        }

        public static final /* synthetic */ long access$Swift_Companion_constructor_1(Companion companion, EUserPosition eUserPosition, List list, int i, String str, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_1(eUserPosition, list, i, str, callbacks);
        }

        public static final /* synthetic */ long access$Swift_Companion_constructor_2(Companion companion, List list, boolean z, boolean z2, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_2(list, z, z2, callbacks);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB)\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\b\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u0015\u0010\u0017\u001a\u00020\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010\u001c\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001e\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010 \u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\"\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J-\u0010#\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 J\u0013\u0010$\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\u0019\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0000H\u0082 J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020&0+2\u0006\u0010,\u001a\u00020\u0019H\u0016J\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020&0+2\u0006\u0010,\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010!¨\u0006/"}, d2 = {"Lcom/polymarket/usviewmodels/ComboDetailViewModel$Stats;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "costText", "", "toWinText", "multiplierText", "isLost", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getCostText", "()Ljava/lang/String;", "Swift_costText", "getToWinText", "Swift_toWinText", "getMultiplierText", "Swift_multiplierText", "()Z", "Swift_isLost", "Swift_constructor_0", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Stats implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Stats(String str, String str2, String str3, boolean z) {
            g.x(str, str2, str3);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, str3, z);
        }

        private final native long Swift_constructor_0(String costText, String toWinText, String multiplierText, boolean isLost);

        private final native String Swift_costText(long Swift_peer);

        private final native boolean Swift_isLost(long Swift_peer);

        private final native boolean Swift_isequal(Stats lhs, Stats rhs);

        private final native String Swift_multiplierText(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_toWinText(long Swift_peer);

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
            if (!(other instanceof Stats)) {
                return false;
            }
            return Swift_isequal(this, (Stats) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getCostText() {
            return Swift_costText(this.Swift_peer);
        }

        public final String getMultiplierText() {
            return Swift_multiplierText(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getToWinText() {
            return Swift_toWinText(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final boolean isLost() {
            return Swift_isLost(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public Stats(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComboDetailViewModel(EUserPosition eUserPosition, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, eUserPosition, callbacks), (SwiftPeerMarker) null);
        eUserPosition.getClass();
        callbacks.getClass();
    }

    public /* synthetic */ ComboDetailViewModel(EUserPosition eUserPosition, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eUserPosition, (i & 2) != 0 ? new Callbacks(null, null, null, null, 15, null) : callbacks);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComboDetailViewModel(EUserPosition eUserPosition, List<EComboLegDetail> list, int i, String str, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_1(INSTANCE, eUserPosition, list, i, str, callbacks), (SwiftPeerMarker) null);
        eUserPosition.getClass();
        list.getClass();
        callbacks.getClass();
    }

    public ComboDetailViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComboDetailViewModel(List<EComboLegDetail> list, boolean z, boolean z2, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_2(INSTANCE, list, z, z2, callbacks), (SwiftPeerMarker) null);
        list.getClass();
        callbacks.getClass();
    }

    public /* synthetic */ ComboDetailViewModel(List list, boolean z, boolean z2, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<EComboLegDetail>) list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? new Callbacks(null, null, null, null, 15, null) : callbacks);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB[\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u001a\b\u0002\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0004\b\b\u0010\u0014J\u0006\u0010\u0019\u001a\u00020\fJ\u0015\u0010\u001a\u001a\u00020\f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J'\u0010*\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\f0\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JW\u0010+\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\f0\u000eH\u0082 J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000b2\u0006\u0010-\u001a\u00020 H\u0016J\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000b2\u0006\u0010-\u001a\u00020 H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010\"R#\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\f0\u000e8F¢\u0006\u0006\u001a\u0004\b)\u0010%¨\u00060"}, d2 = {"Lcom/polymarket/usviewmodels/ComboDetailViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onShare", "Lkotlin/Function0;", "", "onEventSelected", "Lkotlin/Function1;", "Lcom/polymarket/data/EEvent;", "onCashOut", "onBuy", "", "Lcom/polymarket/data/EComboLegDetail;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnShare", "()Lkotlin/jvm/functions/Function0;", "Swift_onShare", "getOnEventSelected", "()Lkotlin/jvm/functions/Function1;", "Swift_onEventSelected", "getOnCashOut", "Swift_onCashOut", "getOnBuy", "Swift_onBuy", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function0 function0, Function1 function1, Function0 function02, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new kz3(14) : function0, (i & 2) != 0 ? new rx3(18) : function1, (i & 4) != 0 ? new kz3(15) : function02, (i & 8) != 0 ? new rx3(19) : function12);
        }

        private final native long Swift_constructor_0(Function0<Unit> onShare, Function1<? super EEvent, Unit> onEventSelected, Function0<Unit> onCashOut, Function1<? super List<EComboLegDetail>, Unit> onBuy);

        private final native Function1<List<EComboLegDetail>, Unit> Swift_onBuy(long Swift_peer);

        private final native Function0<Unit> Swift_onCashOut(long Swift_peer);

        private final native Function1<EEvent, Unit> Swift_onEventSelected(long Swift_peer);

        private final native Function0<Unit> Swift_onShare(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(EEvent eEvent) {
            eEvent.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$3(List list) {
            list.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a() {
            return _init_$lambda$2();
        }

        public static /* synthetic */ Unit b(List list) {
            return _init_$lambda$3(list);
        }

        public static /* synthetic */ Unit c(EEvent eEvent) {
            return _init_$lambda$1(eEvent);
        }

        public static /* synthetic */ Unit d() {
            return _init_$lambda$0();
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

        public final Function1<List<EComboLegDetail>, Unit> getOnBuy() {
            return Swift_onBuy(this.Swift_peer);
        }

        public final Function0<Unit> getOnCashOut() {
            return Swift_onCashOut(this.Swift_peer);
        }

        public final Function1<EEvent, Unit> getOnEventSelected() {
            return Swift_onEventSelected(this.Swift_peer);
        }

        public final Function0<Unit> getOnShare() {
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

        public Callbacks(Function0<Unit> function0, Function1<? super EEvent, Unit> function1, Function0<Unit> function02, Function1<? super List<EComboLegDetail>, Unit> function12) {
            function0.getClass();
            function1.getClass();
            function02.getClass();
            function12.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function0, function1, function02, function12);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
