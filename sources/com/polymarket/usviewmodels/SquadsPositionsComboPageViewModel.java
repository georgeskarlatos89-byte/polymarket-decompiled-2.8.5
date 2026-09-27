package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientChatPositionAttachment;
import com.polymarket.data.EComboLegDetail;
import com.polymarket.data.ESquadPopularItem;
import com.polymarket.data.EUserPosition;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.lph;
import defpackage.mlh;
import defpackage.moh;
import defpackage.u85;
import io.intercom.android.sdk.metrics.MetricTracker;
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
import skip.lib.MutableStruct;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 h2\u00020\u0001:\u0003fghB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u0015\u0010\u0013\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u0014\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020\rH\u0082 J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010 \u001a\u0004\u0018\u00010\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010%\u001a\u0004\u0018\u00010\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010/\u001a\b\u0012\u0004\u0012\u00020-0'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u00103\u001a\b\u0012\u0004\u0012\u0002010'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00108\u001a\u0002052\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010=\u001a\u00020:2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010B\u001a\u00020?2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010D\u001a\u00020?2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010G\u001a\u0002052\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010J\u001a\u0002052\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010M\u001a\u0002052\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010N\u001a\u00020\u0015H\u0016J\u0015\u0010O\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010P\u001a\u00020\u0015H\u0016J\u0015\u0010Q\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010R\u001a\u00020\u00152\u0006\u0010S\u001a\u00020TH\u0096@¢\u0006\u0002\u0010UJ3\u0010V\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010S\u001a\u00020T2\u0014\u0010W\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010Y\u0012\u0004\u0012\u00020\u00150XH\u0082 J\u000e\u0010Z\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\nJ\u001d\u0010[\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\t\u001a\u00020\nH\u0082 J\u000e\u0010\\\u001a\u00020\u00152\u0006\u0010]\u001a\u00020^J\u001d\u0010_\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010]\u001a\u00020^H\u0082 J\u0016\u0010`\u001a\b\u0012\u0004\u0012\u00020b0a2\u0006\u0010c\u001a\u00020dH\u0016J\u0017\u0010e\u001a\b\u0012\u0004\u0012\u00020b0a2\u0006\u0010c\u001a\u00020dH\u0082 R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020-0'8F¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0017\u00100\u001a\b\u0012\u0004\u0012\u0002010'8F¢\u0006\u0006\u001a\u0004\b2\u0010*R\u0011\u00104\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u00109\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0011\u0010>\u001a\u00020?8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010C\u001a\u00020?8F¢\u0006\u0006\u001a\u0004\bC\u0010AR\u0011\u0010E\u001a\u0002058F¢\u0006\u0006\u001a\u0004\bF\u00107R\u0011\u0010H\u001a\u0002058F¢\u0006\u0006\u001a\u0004\bI\u00107R\u0011\u0010K\u001a\u0002058F¢\u0006\u0006\u001a\u0004\bL\u00107¨\u0006i"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "item", "Lcom/polymarket/data/ESquadPopularItem;", "(Lcom/polymarket/data/ESquadPopularItem;)V", "newValue", "Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel$Callbacks;", "callbacks", "getCallbacks", "()Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel$Callbacks;", "setCallbacks", "(Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel$Callbacks;)V", "Swift_callbacks", "Swift_callbacks_set", "", "value", "header", "Lcom/polymarket/usviewmodels/SquadsPositionsComboPageHeaderPresentation;", "getHeader", "()Lcom/polymarket/usviewmodels/SquadsPositionsComboPageHeaderPresentation;", "Swift_header", "originator", "Lcom/polymarket/usviewmodels/SquadsPositionsEventPageHeaderPresentation;", "getOriginator", "()Lcom/polymarket/usviewmodels/SquadsPositionsEventPageHeaderPresentation;", "Swift_originator", "joinedSummary", "Lcom/polymarket/usviewmodels/SquadsPositionsEventPageJoinedPresentation;", "getJoinedSummary", "()Lcom/polymarket/usviewmodels/SquadsPositionsEventPageJoinedPresentation;", "Swift_joinedSummary", "comboLegs", "", "Lcom/polymarket/data/EComboLegDetail;", "getComboLegs", "()Ljava/util/List;", "Swift_comboLegs", "legGroups", "Lcom/polymarket/usviewmodels/ComboLegGroupPresentation;", "getLegGroups", "Swift_legGroups", "entryGroups", "Lcom/polymarket/usviewmodels/SquadsPositionsEventPageEntryGroupPresentation;", "getEntryGroups", "Swift_entryGroups", "navTitle", "", "getNavTitle", "()Ljava/lang/String;", "Swift_navTitle", "tailMultiplier", "", "getTailMultiplier", "()D", "Swift_tailMultiplier", "hasJoined", "", "getHasJoined", "()Z", "Swift_hasJoined", "isJoinEnabled", "Swift_isJoinEnabled", "buyButtonTitle", "getBuyButtonTitle", "Swift_buyButtonTitle", "buyMoreButtonTitle", "getBuyMoreButtonTitle", "Swift_buyMoreButtonTitle", "sellButtonTitle", "getSellButtonTitle", "Swift_sellButtonTitle", "cancelWork", "Swift_cancelWork_1", "setup", "Swift_setup_2", "performLoad", "reason", "Lcom/polymarket/usviewmodels/ReloadReason;", "(Lcom/polymarket/usviewmodels/ReloadReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Swift_callback_performLoad_3", "f_callback", "Lkotlin/Function1;", "", "apply", "Swift_apply_4", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel$Input;", "Swift_sendInput_5", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SquadsPositionsComboPageViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquadsPositionsComboPageViewModel(ESquadPopularItem eSquadPopularItem) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, eSquadPopularItem), (SwiftPeerMarker) null);
        eSquadPopularItem.getClass();
    }

    private final native void Swift_apply_4(long Swift_peer, ESquadPopularItem item);

    private final native String Swift_buyButtonTitle(long Swift_peer);

    private final native String Swift_buyMoreButtonTitle(long Swift_peer);

    private final native void Swift_callback_performLoad_3(long Swift_peer, ReloadReason reason, Function1<? super Throwable, Unit> f_callback);

    private final native Callbacks Swift_callbacks(long Swift_peer);

    private final native void Swift_callbacks_set(long Swift_peer, Callbacks value);

    private final native void Swift_cancelWork_1(long Swift_peer);

    private final native List<EComboLegDetail> Swift_comboLegs(long Swift_peer);

    private final native List<SquadsPositionsEventPageEntryGroupPresentation> Swift_entryGroups(long Swift_peer);

    private final native boolean Swift_hasJoined(long Swift_peer);

    private final native SquadsPositionsComboPageHeaderPresentation Swift_header(long Swift_peer);

    private final native boolean Swift_isJoinEnabled(long Swift_peer);

    private final native SquadsPositionsEventPageJoinedPresentation Swift_joinedSummary(long Swift_peer);

    private final native List<ComboLegGroupPresentation> Swift_legGroups(long Swift_peer);

    private final native String Swift_navTitle(long Swift_peer);

    private final native SquadsPositionsEventPageHeaderPresentation Swift_originator(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_sellButtonTitle(long Swift_peer);

    private final native void Swift_sendInput_5(long Swift_peer, Input input);

    private final native void Swift_setup_2(long Swift_peer);

    private final native double Swift_tailMultiplier(long Swift_peer);

    public static final /* synthetic */ void access$Swift_callback_performLoad_3(SquadsPositionsComboPageViewModel squadsPositionsComboPageViewModel, long j, ReloadReason reloadReason, Function1 function1) {
        squadsPositionsComboPageViewModel.Swift_callback_performLoad_3(j, reloadReason, function1);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final void apply(ESquadPopularItem item) {
        item.getClass();
        Swift_apply_4(getSwift_peer(), item);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void cancelWork() {
        Swift_cancelWork_1(getSwift_peer());
    }

    public final String getBuyButtonTitle() {
        return Swift_buyButtonTitle(getSwift_peer());
    }

    public final String getBuyMoreButtonTitle() {
        return Swift_buyMoreButtonTitle(getSwift_peer());
    }

    public final Callbacks getCallbacks() {
        return Swift_callbacks(getSwift_peer());
    }

    public final List<EComboLegDetail> getComboLegs() {
        return Swift_comboLegs(getSwift_peer());
    }

    public final List<SquadsPositionsEventPageEntryGroupPresentation> getEntryGroups() {
        return Swift_entryGroups(getSwift_peer());
    }

    public final boolean getHasJoined() {
        return Swift_hasJoined(getSwift_peer());
    }

    public final SquadsPositionsComboPageHeaderPresentation getHeader() {
        return Swift_header(getSwift_peer());
    }

    public final SquadsPositionsEventPageJoinedPresentation getJoinedSummary() {
        return Swift_joinedSummary(getSwift_peer());
    }

    public final List<ComboLegGroupPresentation> getLegGroups() {
        return Swift_legGroups(getSwift_peer());
    }

    public final String getNavTitle() {
        return Swift_navTitle(getSwift_peer());
    }

    public final SquadsPositionsEventPageHeaderPresentation getOriginator() {
        return Swift_originator(getSwift_peer());
    }

    public final String getSellButtonTitle() {
        return Swift_sellButtonTitle(getSwift_peer());
    }

    public final double getTailMultiplier() {
        return Swift_tailMultiplier(getSwift_peer());
    }

    public final boolean isJoinEnabled() {
        return Swift_isJoinEnabled(getSwift_peer());
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public Object performLoad(ReloadReason reloadReason, Continuation<? super Unit> continuation) {
        Object run = Async.INSTANCE.run(new SquadsPositionsComboPageViewModel$performLoad$2(this, reloadReason, null), continuation);
        if (run == u85.COROUTINE_SUSPENDED) {
            return run;
        }
        return Unit.INSTANCE;
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_5(getSwift_peer(), input);
    }

    public final void setCallbacks(Callbacks callbacks) {
        callbacks.getClass();
        Swift_callbacks_set(getSwift_peer(), (Callbacks) StructKt.sref$default(callbacks, null, 1, null));
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_2(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f2\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnTailCase", "OnBuyMoreCase", "OnSellCase", "OnShareCase", "OnLegTappedCase", "Companion", "Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel$Input$OnBuyMoreCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel$Input$OnLegTappedCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel$Input$OnSellCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel$Input$OnShareCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel$Input$OnTailCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onTail = new OnTailCase();
        private static final Input onBuyMore = new OnBuyMoreCase();
        private static final Input onSell = new OnSellCase();
        private static final Input onShare = new OnShareCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel$Input$OnBuyMoreCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnBuyMoreCase extends Input {
            public OnBuyMoreCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel$Input$OnLegTappedCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "eventId", "getEventId", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel$Input$OnSellCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSellCase extends Input {
            public OnSellCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel$Input$OnShareCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnShareCase extends Input {
            public OnShareCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel$Input$OnTailCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnTailCase extends Input {
            public OnTailCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnBuyMore$cp() {
            return onBuyMore;
        }

        public static final /* synthetic */ Input access$getOnSell$cp() {
            return onSell;
        }

        public static final /* synthetic */ Input access$getOnShare$cp() {
            return onShare;
        }

        public static final /* synthetic */ Input access$getOnTail$cp() {
            return onTail;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel$Input$Companion;", "", "<init>", "()V", "onTail", "Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel$Input;", "getOnTail", "()Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel$Input;", "onBuyMore", "getOnBuyMore", "onSell", "getOnSell", "onShare", "getOnShare", "onLegTapped", "eventId", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnBuyMore() {
                return Input.access$getOnBuyMore$cp();
            }

            public final Input getOnSell() {
                return Input.access$getOnSell$cp();
            }

            public final Input getOnShare() {
                return Input.access$getOnShare$cp();
            }

            public final Input getOnTail() {
                return Input.access$getOnTail$cp();
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
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0082 J\u0006\u0010\t\u001a\u00020\nJ\t\u0010\u000b\u001a\u00020\nH\u0082 ¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "item", "Lcom/polymarket/data/ESquadPopularItem;", "mock", "Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel;", "Swift_Companion_mock_6", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(ESquadPopularItem item);

        private final native SquadsPositionsComboPageViewModel Swift_Companion_mock_6();

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, ESquadPopularItem eSquadPopularItem) {
            return companion.Swift_Companion_constructor_0(eSquadPopularItem);
        }

        public final SquadsPositionsComboPageViewModel mock() {
            return Swift_Companion_mock_6();
        }

        private Companion() {
        }
    }

    public SquadsPositionsComboPageViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b(\b\u0007\u0018\u0000 K2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001KB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nBc\b\u0016\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f\u0012\u001c\b\u0002\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\r0\u0012\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0004\b\t\u0010\u0016B\u0011\b\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0018J\u0006\u0010\u001d\u001a\u00020\rJ\u0015\u0010\u001e\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u0010+\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082 J!\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J)\u00102\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000fH\u0082 J)\u00107\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\r0\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J1\u00108\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u001a\u0010,\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\r0\u0012H\u0082 J!\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J)\u0010<\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000fH\u0082 J_\u0010=\u001a\u00060\u0005j\u0002`\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f2\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\r0\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000fH\u0082 J\u0015\u0010>\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0017\u001a\u00020\u0001H\u0082 J\b\u0010G\u001a\u00020\u0001H\u0016J\u0016\u0010H\u001a\b\u0012\u0004\u0012\u00020\"0\f2\u0006\u0010I\u001a\u00020$H\u0016J\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020\"0\f2\u0006\u0010I\u001a\u00020$H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R<\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100RL\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\r0\u00122\u001a\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\r0\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R<\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000f2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010.\"\u0004\b:\u00100R(\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010.\"\u0004\bA\u00100R\u001a\u0010B\u001a\u00020$X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006L"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel$Callbacks;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onTail", "Lkotlin/Function0;", "", "onSell", "Lkotlin/Function1;", "Lcom/polymarket/data/EUserPosition;", "onShare", "Lkotlin/Function2;", "Lcom/polymarket/clients/ClientChatPositionAttachment$Owner;", "onOpenEventDetail", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "getOnTail", "()Lkotlin/jvm/functions/Function0;", "setOnTail", "(Lkotlin/jvm/functions/Function0;)V", "Swift_onTail", "Swift_onTail_set", "value", "getOnSell", "()Lkotlin/jvm/functions/Function1;", "setOnSell", "(Lkotlin/jvm/functions/Function1;)V", "Swift_onSell", "Swift_onSell_set", "getOnShare", "()Lkotlin/jvm/functions/Function2;", "setOnShare", "(Lkotlin/jvm/functions/Function2;)V", "Swift_onShare", "Swift_onShare_set", "getOnOpenEventDetail", "setOnOpenEventDetail", "Swift_onOpenEventDetail", "Swift_onOpenEventDetail_set", "Swift_constructor_0", "Swift_constructor_1", "supdate", "getSupdate", "setSupdate", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        public /* synthetic */ Callbacks(Function0 function0, Function1 function1, Function2 function2, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new moh(3) : function0, (i & 2) != 0 ? new mlh(25) : function1, (i & 4) != 0 ? new lph(0) : function2, (i & 8) != 0 ? new mlh(26) : function12);
        }

        private final native long Swift_constructor_0(Function0<Unit> onTail, Function1<? super EUserPosition, Unit> onSell, Function2<? super EUserPosition, ? super ClientChatPositionAttachment.Owner, Unit> onShare, Function1<? super String, Unit> onOpenEventDetail);

        private final native long Swift_constructor_1(MutableStruct copy);

        private final native Function1<String, Unit> Swift_onOpenEventDetail(long Swift_peer);

        private final native void Swift_onOpenEventDetail_set(long Swift_peer, Function1<? super String, Unit> value);

        private final native Function1<EUserPosition, Unit> Swift_onSell(long Swift_peer);

        private final native void Swift_onSell_set(long Swift_peer, Function1<? super EUserPosition, Unit> value);

        private final native Function2<EUserPosition, ClientChatPositionAttachment.Owner, Unit> Swift_onShare(long Swift_peer);

        private final native void Swift_onShare_set(long Swift_peer, Function2<? super EUserPosition, ? super ClientChatPositionAttachment.Owner, Unit> value);

        private final native Function0<Unit> Swift_onTail(long Swift_peer);

        private final native void Swift_onTail_set(long Swift_peer, Function0<Unit> value);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(EUserPosition eUserPosition) {
            eUserPosition.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2(EUserPosition eUserPosition, ClientChatPositionAttachment.Owner owner) {
            eUserPosition.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$3(String str) {
            str.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(String str) {
            return _init_$lambda$3(str);
        }

        public static /* synthetic */ Unit b(EUserPosition eUserPosition, ClientChatPositionAttachment.Owner owner) {
            return _init_$lambda$2(eUserPosition, owner);
        }

        public static /* synthetic */ Unit c() {
            return _init_$lambda$0();
        }

        public static /* synthetic */ Unit d(EUserPosition eUserPosition) {
            return _init_$lambda$1(eUserPosition);
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

        @Override // skip.lib.MutableStruct
        public void didmutate() {
            super.didmutate();
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

        public final Function1<String, Unit> getOnOpenEventDetail() {
            return Swift_onOpenEventDetail(this.Swift_peer);
        }

        public final Function1<EUserPosition, Unit> getOnSell() {
            return Swift_onSell(this.Swift_peer);
        }

        public final Function2<EUserPosition, ClientChatPositionAttachment.Owner, Unit> getOnShare() {
            return Swift_onShare(this.Swift_peer);
        }

        public final Function0<Unit> getOnTail() {
            return Swift_onTail(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public int getSmutatingcount() {
            return this.smutatingcount;
        }

        @Override // skip.lib.MutableStruct
        public Function1<Object, Unit> getSupdate() {
            return this.supdate;
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new Callbacks(this);
        }

        public final void setOnOpenEventDetail(Function1<? super String, Unit> function1) {
            function1.getClass();
            willmutate();
            try {
                Swift_onOpenEventDetail_set(this.Swift_peer, function1);
            } finally {
                didmutate();
            }
        }

        public final void setOnSell(Function1<? super EUserPosition, Unit> function1) {
            function1.getClass();
            willmutate();
            try {
                Swift_onSell_set(this.Swift_peer, function1);
            } finally {
                didmutate();
            }
        }

        public final void setOnShare(Function2<? super EUserPosition, ? super ClientChatPositionAttachment.Owner, Unit> function2) {
            function2.getClass();
            willmutate();
            try {
                Swift_onShare_set(this.Swift_peer, function2);
            } finally {
                didmutate();
            }
        }

        public final void setOnTail(Function0<Unit> function0) {
            function0.getClass();
            willmutate();
            try {
                Swift_onTail_set(this.Swift_peer, function0);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void setSmutatingcount(int i) {
            this.smutatingcount = i;
        }

        @Override // skip.lib.MutableStruct
        public void setSupdate(Function1<Object, Unit> function1) {
            this.supdate = function1;
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        public Callbacks(Function0<Unit> function0, Function1<? super EUserPosition, Unit> function1, Function2<? super EUserPosition, ? super ClientChatPositionAttachment.Owner, Unit> function2, Function1<? super String, Unit> function12) {
            function0.getClass();
            function1.getClass();
            function2.getClass();
            function12.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function0, function1, function2, function12);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private Callbacks(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_1(mutableStruct);
        }
    }
}
