package com.polymarket.usviewmodels;

import com.fingerprintjs.android.fpjs_pro.g;
import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.EPromotionCampaign;
import com.polymarket.usviewmodels.AppViewModel;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.jbf;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Hasher;
import skip.lib.Identifiable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 42\u00020\u0001:\u0006/01234B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rJ\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010!\u001a\u00020\u001f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010\"\u001a\u00020#H\u0016J\u0015\u0010$\u001a\u00020#2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020'J\u001d\u0010(\u001a\u00020#2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010&\u001a\u00020'H\u0082 J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010,\u001a\u00020-H\u0016J\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010,\u001a\u00020-H\u0082 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010 ¨\u00065"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "campaign", "Lcom/polymarket/data/EPromotionCampaign;", "callbacks", "Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$Callbacks;", "(Lcom/polymarket/data/EPromotionCampaign;Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$Callbacks;)V", "headerPresentation", "Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$HeaderPresentation;", "getHeaderPresentation", "()Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$HeaderPresentation;", "Swift_headerPresentation", "dayRows", "", "Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation;", "getDayRows", "()Ljava/util/List;", "Swift_dayRows", "footerPresentation", "Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$FooterPresentation;", "getFooterPresentation", "()Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$FooterPresentation;", "Swift_footerPresentation", "isRefreshing", "", "()Z", "Swift_isRefreshing", "setup", "", "Swift_setup_1", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$Input;", "Swift_sendInput_2", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "HeaderPresentation", "DayRowPresentation", "FooterPresentation", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PromotionCampaignDetailViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082 J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0082 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0018"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$Input;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "onAppear", "onDisappear", "onClose", "onBrowseMarkets", "onRefresh", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", Keys.KEY_NAME, "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Input implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Input[] $VALUES;
        public static final Input onAppear = new Input("onAppear", 0);
        public static final Input onDisappear = new Input("onDisappear", 1);
        public static final Input onClose = new Input("onClose", 2);
        public static final Input onBrowseMarkets = new Input("onBrowseMarkets", 3);
        public static final Input onRefresh = new Input("onRefresh", 4);

        private static final /* synthetic */ Input[] $values() {
            return new Input[]{onAppear, onDisappear, onClose, onBrowseMarkets, onRefresh};
        }

        static {
            Input[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Input(String str, int i) {
        }

        private final native ClientAnalyticsInput Swift_analytics(String name);

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

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(name());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionCampaignDetailViewModel(EPromotionCampaign ePromotionCampaign, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, ePromotionCampaign, callbacks), (SwiftPeerMarker) null);
        ePromotionCampaign.getClass();
        callbacks.getClass();
    }

    private final native List<DayRowPresentation> Swift_dayRows(long Swift_peer);

    private final native FooterPresentation Swift_footerPresentation(long Swift_peer);

    private final native HeaderPresentation Swift_headerPresentation(long Swift_peer);

    private final native boolean Swift_isRefreshing(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_sendInput_2(long Swift_peer, Input input);

    private final native void Swift_setup_1(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final List<DayRowPresentation> getDayRows() {
        return Swift_dayRows(getSwift_peer());
    }

    public final FooterPresentation getFooterPresentation() {
        return Swift_footerPresentation(getSwift_peer());
    }

    public final HeaderPresentation getHeaderPresentation() {
        return Swift_headerPresentation(getSwift_peer());
    }

    public final boolean isRefreshing() {
        return Swift_isRefreshing(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_2(getSwift_peer(), input);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0003=>?B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bBA\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\n\u0010\u0016J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0015\u0010\u001d\u001a\u00020\u001c2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0015\u0010 \u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010\"\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010$\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010&\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010(\u001a\u00020\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010+\u001a\u00020\u00132\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010.\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 JE\u0010/\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0082 J\u0013\u00100\u001a\u00020\u00112\b\u00101\u001a\u0004\u0018\u000102H\u0096\u0002J\u0019\u00103\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0000H\u0082 J\b\u00106\u001a\u000207H\u0016J\u0015\u00108\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0016\u00109\u001a\b\u0012\u0004\u0012\u0002020:2\u0006\u0010;\u001a\u000207H\u0016J\u0017\u0010<\u001a\b\u0012\u0004\u0012\u0002020:2\u0006\u0010;\u001a\u000207H\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010'R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006@"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "dateLabel", "statusText", "amountText", "isToday", "", "accessory", "Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation$Accessory;", "statusTone", "Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation$StatusTone;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation$Accessory;Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation$StatusTone;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getId", "()Ljava/lang/String;", "Swift_id", "getDateLabel", "Swift_dateLabel", "getStatusText", "Swift_statusText", "getAmountText", "Swift_amountText", "()Z", "Swift_isToday", "getAccessory", "()Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation$Accessory;", "Swift_accessory", "getStatusTone", "()Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation$StatusTone;", "Swift_statusTone", "Swift_constructor_0", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Accessory", "StatusTone", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DayRowPresentation implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation$StatusTone;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "primary", "secondary", "quaternary", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class StatusTone implements SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ StatusTone[] $VALUES;
            public static final StatusTone primary = new StatusTone("primary", 0);
            public static final StatusTone secondary = new StatusTone("secondary", 1);
            public static final StatusTone quaternary = new StatusTone("quaternary", 2);

            private static final /* synthetic */ StatusTone[] $values() {
                return new StatusTone[]{primary, secondary, quaternary};
            }

            static {
                StatusTone[] $values = $values();
                $VALUES = $values;
                $ENTRIES = ww4.b($values);
                INSTANCE = new Companion(null);
            }

            private StatusTone(String str, int i) {
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static ug7 getEntries() {
                return $ENTRIES;
            }

            public static StatusTone valueOf(String str) {
                return (StatusTone) Enum.valueOf(StatusTone.class, str);
            }

            public static StatusTone[] values() {
                return (StatusTone[]) $VALUES.clone();
            }

            @Override // skip.lib.SwiftProjecting
            public Function0<Object> Swift_projection(int options) {
                return Swift_projectionImpl(options);
            }
        }

        public DayRowPresentation(String str, String str2, String str3, String str4, boolean z, Accessory accessory, StatusTone statusTone) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            accessory.getClass();
            statusTone.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, str3, str4, z, accessory, statusTone);
        }

        private final native Accessory Swift_accessory(long Swift_peer);

        private final native String Swift_amountText(long Swift_peer);

        private final native long Swift_constructor_0(String id, String dateLabel, String statusText, String amountText, boolean isToday, Accessory accessory, StatusTone statusTone);

        private final native String Swift_dateLabel(long Swift_peer);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isToday(long Swift_peer);

        private final native boolean Swift_isequal(DayRowPresentation lhs, DayRowPresentation rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_statusText(long Swift_peer);

        private final native StatusTone Swift_statusTone(long Swift_peer);

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
            if (!(other instanceof DayRowPresentation)) {
                return false;
            }
            return Swift_isequal(this, (DayRowPresentation) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final Accessory getAccessory() {
            return Swift_accessory(this.Swift_peer);
        }

        public final String getAmountText() {
            return Swift_amountText(this.Swift_peer);
        }

        public final String getDateLabel() {
            return Swift_dateLabel(this.Swift_peer);
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
        }

        public final String getStatusText() {
            return Swift_statusText(this.Swift_peer);
        }

        public final StatusTone getStatusTone() {
            return Swift_statusTone(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final boolean isToday() {
            return Swift_isToday(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f2\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation$Accessory;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "FlameAmountCase", "AmountMutedCase", "LockCase", "CountdownCase", "NoneCase", "Companion", "Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation$Accessory$AmountMutedCase;", "Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation$Accessory$CountdownCase;", "Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation$Accessory$FlameAmountCase;", "Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation$Accessory$LockCase;", "Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation$Accessory$NoneCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static abstract class Accessory implements SwiftProjecting {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final Accessory flameAmount = new FlameAmountCase();
            private static final Accessory amountMuted = new AmountMutedCase();
            private static final Accessory lock = new LockCase();
            private static final Accessory none = new NoneCase();

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation$Accessory$AmountMutedCase;", "Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation$Accessory;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class AmountMutedCase extends Accessory {
                public AmountMutedCase() {
                    super(null);
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation$Accessory$CountdownCase;", "Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation$Accessory;", "associated0", "Ljava/util/Date;", "associated1", "", "<init>", "(Ljava/util/Date;Ljava/lang/String;)V", "getAssociated0", "()Ljava/util/Date;", "getAssociated1", "()Ljava/lang/String;", "deadline", "getDeadline", "suffixText", "getSuffixText", "equals", "", "other", "", "hashCode", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class CountdownCase extends Accessory {
                private final Date associated0;
                private final String associated1;
                private final Date deadline;
                private final String suffixText;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public CountdownCase(Date date, String str) {
                    super(null);
                    date.getClass();
                    str.getClass();
                    this.associated0 = date;
                    this.associated1 = str;
                    this.deadline = date;
                    this.suffixText = str;
                }

                public boolean equals(Object other) {
                    if (!(other instanceof CountdownCase)) {
                        return false;
                    }
                    CountdownCase countdownCase = (CountdownCase) other;
                    if (!Intrinsics.areEqual(this.associated0, countdownCase.associated0) || !Intrinsics.areEqual(this.associated1, countdownCase.associated1)) {
                        return false;
                    }
                    return true;
                }

                public final Date getAssociated0() {
                    return this.associated0;
                }

                public final String getAssociated1() {
                    return this.associated1;
                }

                public final Date getDeadline() {
                    return this.deadline;
                }

                public final String getSuffixText() {
                    return this.suffixText;
                }

                public int hashCode() {
                    Hasher.Companion companion = Hasher.INSTANCE;
                    return companion.combine(companion.combine(1, this.associated0), this.associated1);
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation$Accessory$FlameAmountCase;", "Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation$Accessory;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class FlameAmountCase extends Accessory {
                public FlameAmountCase() {
                    super(null);
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation$Accessory$LockCase;", "Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation$Accessory;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class LockCase extends Accessory {
                public LockCase() {
                    super(null);
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation$Accessory$NoneCase;", "Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation$Accessory;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class NoneCase extends Accessory {
                public NoneCase() {
                    super(null);
                }
            }

            public /* synthetic */ Accessory(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static final /* synthetic */ Accessory access$getAmountMuted$cp() {
                return amountMuted;
            }

            public static final /* synthetic */ Accessory access$getFlameAmount$cp() {
                return flameAmount;
            }

            public static final /* synthetic */ Accessory access$getLock$cp() {
                return lock;
            }

            public static final /* synthetic */ Accessory access$getNone$cp() {
                return none;
            }

            @Override // skip.lib.SwiftProjecting
            public Function0<Object> Swift_projection(int options) {
                return Swift_projectionImpl(options);
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation$Accessory$Companion;", "", "<init>", "()V", "flameAmount", "Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation$Accessory;", "getFlameAmount", "()Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$DayRowPresentation$Accessory;", "amountMuted", "getAmountMuted", "lock", "getLock", "countdown", "deadline", "Ljava/util/Date;", "suffixText", "", "none", "getNone", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Accessory countdown(Date deadline, String suffixText) {
                    deadline.getClass();
                    suffixText.getClass();
                    return new CountdownCase(deadline, suffixText);
                }

                public final Accessory getAmountMuted() {
                    return Accessory.access$getAmountMuted$cp();
                }

                public final Accessory getFlameAmount() {
                    return Accessory.access$getFlameAmount$cp();
                }

                public final Accessory getLock() {
                    return Accessory.access$getLock$cp();
                }

                public final Accessory getNone() {
                    return Accessory.access$getNone$cp();
                }

                private Companion() {
                }
            }

            private Accessory() {
            }
        }

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ String getId() {
            return getId2();
        }

        public DayRowPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0006\u0010\u000b\u001a\u00020\fJ\t\u0010\r\u001a\u00020\fH\u0082 ¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "campaign", "Lcom/polymarket/data/EPromotionCampaign;", "callbacks", "Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel;", "Swift_Companion_mock_3", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(EPromotionCampaign campaign, Callbacks callbacks);

        private final native PromotionCampaignDetailViewModel Swift_Companion_mock_3();

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, EPromotionCampaign ePromotionCampaign, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(ePromotionCampaign, callbacks);
        }

        public final PromotionCampaignDetailViewModel mock() {
            return Swift_Companion_mock_3();
        }

        private Companion() {
        }
    }

    public PromotionCampaignDetailViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0015\u0010\u0014\u001a\u00020\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010\u0017\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001f\u0010\u001a\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0082 J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\u0019\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0082 J\b\u0010\"\u001a\u00020#H\u0016J\u0015\u0010$\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0&2\u0006\u0010'\u001a\u00020#H\u0016J\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001e0&2\u0006\u0010'\u001a\u00020#H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006*"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$FooterPresentation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "primaryActionTitle", "", "disclaimerMarkdown", "(Ljava/lang/String;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getPrimaryActionTitle", "()Ljava/lang/String;", "Swift_primaryActionTitle", "getDisclaimerMarkdown", "Swift_disclaimerMarkdown", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class FooterPresentation implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public FooterPresentation(String str, String str2) {
            str.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2);
        }

        private final native long Swift_constructor_0(String primaryActionTitle, String disclaimerMarkdown);

        private final native String Swift_disclaimerMarkdown(long Swift_peer);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native boolean Swift_isequal(FooterPresentation lhs, FooterPresentation rhs);

        private final native String Swift_primaryActionTitle(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

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
            if (!(other instanceof FooterPresentation)) {
                return false;
            }
            return Swift_isequal(this, (FooterPresentation) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getDisclaimerMarkdown() {
            return Swift_disclaimerMarkdown(this.Swift_peer);
        }

        public final String getPrimaryActionTitle() {
            return Swift_primaryActionTitle(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public FooterPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ FooterPresentation(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u0015\u0010\u0017\u001a\u00020\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010\u001a\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001c\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001e\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010 \u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\"\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J9\u0010#\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0082 J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\u0019\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0000H\u0082 J\b\u0010+\u001a\u00020,H\u0016J\u0015\u0010-\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020'0/2\u0006\u00100\u001a\u00020,H\u0016J\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020'0/2\u0006\u00100\u001a\u00020,H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0019¨\u00063"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$HeaderPresentation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "navTitle", "", "eyebrow", "totalEarnedText", "totalPotentialText", "subtitle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getNavTitle", "()Ljava/lang/String;", "Swift_navTitle", "getEyebrow", "Swift_eyebrow", "getTotalEarnedText", "Swift_totalEarnedText", "getTotalPotentialText", "Swift_totalPotentialText", "getSubtitle", "Swift_subtitle", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class HeaderPresentation implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public HeaderPresentation(String str, String str2, String str3, String str4, String str5) {
            g.x(str, str2, str3);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, str3, str4, str5);
        }

        private final native long Swift_constructor_0(String navTitle, String eyebrow, String totalEarnedText, String totalPotentialText, String subtitle);

        private final native String Swift_eyebrow(long Swift_peer);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native boolean Swift_isequal(HeaderPresentation lhs, HeaderPresentation rhs);

        private final native String Swift_navTitle(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_subtitle(long Swift_peer);

        private final native String Swift_totalEarnedText(long Swift_peer);

        private final native String Swift_totalPotentialText(long Swift_peer);

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
            if (!(other instanceof HeaderPresentation)) {
                return false;
            }
            return Swift_isequal(this, (HeaderPresentation) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getEyebrow() {
            return Swift_eyebrow(this.Swift_peer);
        }

        public final String getNavTitle() {
            return Swift_navTitle(this.Swift_peer);
        }

        public final String getSubtitle() {
            return Swift_subtitle(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getTotalEarnedText() {
            return Swift_totalEarnedText(this.Swift_peer);
        }

        public final String getTotalPotentialText() {
            return Swift_totalPotentialText(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public HeaderPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ HeaderPresentation(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
        }
    }

    public /* synthetic */ PromotionCampaignDetailViewModel(EPromotionCampaign ePromotionCampaign, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ePromotionCampaign, (i & 2) != 0 ? new Callbacks(null, null, 3, null) : callbacks);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB)\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\fJ\u0015\u0010\u0014\u001a\u00020\f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J)\u0010 \u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b2\u0006\u0010\"\u001a\u00020\u001aH\u0016J\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b2\u0006\u0010\"\u001a\u00020\u001aH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u0006%"}, d2 = {"Lcom/polymarket/usviewmodels/PromotionCampaignDetailViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onClose", "Lkotlin/Function0;", "", "onBrowseMarkets", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnClose", "()Lkotlin/jvm/functions/Function0;", "Swift_onClose", "getOnBrowseMarkets", "Swift_onBrowseMarkets", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((Function0<Unit>) ((i & 1) != 0 ? new jbf(2) : function0), (Function0<Unit>) ((i & 2) != 0 ? new jbf(3) : function02));
        }

        private final native long Swift_constructor_0(Function0<Unit> onClose, Function0<Unit> onBrowseMarkets);

        private final native Function0<Unit> Swift_onBrowseMarkets(long Swift_peer);

        private final native Function0<Unit> Swift_onClose(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a() {
            return _init_$lambda$1();
        }

        public static /* synthetic */ Unit b() {
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

        public final Function0<Unit> getOnBrowseMarkets() {
            return Swift_onBrowseMarkets(this.Swift_peer);
        }

        public final Function0<Unit> getOnClose() {
            return Swift_onClose(this.Swift_peer);
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

        public Callbacks(Function0<Unit> function0, Function0<Unit> function02) {
            function0.getClass();
            function02.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function0, function02);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
