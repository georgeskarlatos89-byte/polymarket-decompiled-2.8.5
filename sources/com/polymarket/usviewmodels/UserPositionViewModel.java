package com.polymarket.usviewmodels;

import com.polymarket.data.EEvent;
import com.polymarket.data.ESportsSlug;
import com.polymarket.data.EUserPosition;
import com.polymarket.data.OddsFormat;
import com.polymarket.usviewmodels.AppViewModel;
import com.polymarket.usviewmodels.UserPositionPresentation;
import defpackage.izi;
import defpackage.vwj;
import defpackage.xyi;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Hasher;
import skip.lib.InOut;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 f2\u00020\u0001:\u0003defB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB'\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0007\u0010\u000fJ\u0015\u0010\u0015\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u0016\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0018\u001a\u00020\nH\u0082 J\u0015\u0010\u001d\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010$\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010%\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0018\u001a\u00020\u001eH\u0082 J\u001b\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u00100\u001a\u0004\u0018\u00010-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u00105\u001a\u0004\u0018\u0001022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010:\u001a\u0004\u0018\u0001072\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010>\u001a\u00020<2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010@\u001a\u00020<2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DJ\u001d\u0010E\u001a\u00020B2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010C\u001a\u00020DH\u0082 J\b\u0010F\u001a\u00020\u0017H\u0016J\u0015\u0010G\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010H\u001a\u00020\u0017H\u0016J\u0015\u0010I\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010J\u001a\u00020\u00172\u0006\u0010K\u001a\u00020\nJ\u001d\u0010L\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010K\u001a\u00020\nH\u0082 J\u000e\u0010M\u001a\u00020\u00172\u0006\u0010N\u001a\u00020OJ\u001d\u0010P\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010N\u001a\u00020OH\u0082 J\u000e\u0010Q\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000eJ\u001d\u0010R\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0082 J\u0013\u0010S\u001a\u00020<2\b\u0010T\u001a\u0004\u0018\u00010UH\u0096\u0002J\u0019\u0010V\u001a\u00020<2\u0006\u0010W\u001a\u00020\u00002\u0006\u0010X\u001a\u00020\u0000H\u0082 J\b\u0010Y\u001a\u00020ZH\u0016J\u0016\u0010[\u001a\u00020\u00172\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020^0]H\u0016J\u0015\u0010_\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010`\u001a\b\u0012\u0004\u0012\u00020U0a2\u0006\u0010b\u001a\u00020ZH\u0016J\u0017\u0010c\u001a\b\u0012\u0004\u0012\u00020U0a2\u0006\u0010b\u001a\u00020ZH\u0082 R$\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010,\u001a\u0004\u0018\u00010-8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u00101\u001a\u0004\u0018\u0001028F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0013\u00106\u001a\u0004\u0018\u0001078F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010;\u001a\u00020<8F¢\u0006\u0006\u001a\u0004\b;\u0010=R\u0011\u0010?\u001a\u00020<8F¢\u0006\u0006\u001a\u0004\b?\u0010=¨\u0006g"}, d2 = {"Lcom/polymarket/usviewmodels/UserPositionViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "position", "Lcom/polymarket/data/EUserPosition;", "cardContext", "Lcom/polymarket/usviewmodels/PositionCardContext;", "callbacks", "Lcom/polymarket/usviewmodels/UserPositionViewModel$Callbacks;", "(Lcom/polymarket/data/EUserPosition;Lcom/polymarket/usviewmodels/PositionCardContext;Lcom/polymarket/usviewmodels/UserPositionViewModel$Callbacks;)V", "newValue", "getPosition", "()Lcom/polymarket/data/EUserPosition;", "setPosition", "(Lcom/polymarket/data/EUserPosition;)V", "Swift_position", "Swift_position_set", "", "value", "positionID", "", "getPositionID", "()Ljava/lang/String;", "Swift_positionID", "Lcom/polymarket/data/OddsFormat;", "oddsFormat", "getOddsFormat", "()Lcom/polymarket/data/OddsFormat;", "setOddsFormat", "(Lcom/polymarket/data/OddsFormat;)V", "Swift_oddsFormat", "Swift_oddsFormat_set", "comboLegGroups", "", "Lcom/polymarket/usviewmodels/ComboLegGroupPresentation;", "getComboLegGroups", "()Ljava/util/List;", "Swift_comboLegGroups", "sportsEvent", "Lcom/polymarket/data/EEvent;", "getSportsEvent", "()Lcom/polymarket/data/EEvent;", "Swift_sportsEvent", "game", "Lcom/polymarket/data/EEvent$SportsGame;", "getGame", "()Lcom/polymarket/data/EEvent$SportsGame;", "Swift_game", "sportSlug", "Lcom/polymarket/data/ESportsSlug;", "getSportSlug", "()Lcom/polymarket/data/ESportsSlug;", "Swift_sportSlug", "isResolutionPending", "", "()Z", "Swift_isResolutionPending", "isLiquidityConstrained", "Swift_isLiquidityConstrained", "presentation", "Lcom/polymarket/usviewmodels/UserPositionPresentation;", "style", "Lcom/polymarket/usviewmodels/UserPositionPresentation$Style;", "Swift_presentation_0", "cancelWork", "Swift_cancelWork_2", "setup", "Swift_setup_3", "applyPositionUpdate", "updated", "Swift_applyPositionUpdate_4", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/UserPositionViewModel$Input;", "Swift_sendInput_5", "setCallbacks", "Swift_setCallbacks_6", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "hash", "into", "Lskip/lib/InOut;", "Lskip/lib/Hasher;", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Callbacks", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserPositionViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ UserPositionViewModel(EUserPosition eUserPosition, PositionCardContext positionCardContext, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eUserPosition, (i & 2) != 0 ? null : positionCardContext, (i & 4) != 0 ? new Callbacks(null, null, null, null, null, null, null, 127, null) : callbacks);
    }

    private final native void Swift_applyPositionUpdate_4(long Swift_peer, EUserPosition updated);

    private final native void Swift_cancelWork_2(long Swift_peer);

    private final native List<ComboLegGroupPresentation> Swift_comboLegGroups(long Swift_peer);

    private final native EEvent.SportsGame Swift_game(long Swift_peer);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native boolean Swift_isLiquidityConstrained(long Swift_peer);

    private final native boolean Swift_isResolutionPending(long Swift_peer);

    private final native boolean Swift_isequal(UserPositionViewModel lhs, UserPositionViewModel rhs);

    private final native OddsFormat Swift_oddsFormat(long Swift_peer);

    private final native void Swift_oddsFormat_set(long Swift_peer, OddsFormat value);

    private final native EUserPosition Swift_position(long Swift_peer);

    private final native String Swift_positionID(long Swift_peer);

    private final native void Swift_position_set(long Swift_peer, EUserPosition value);

    private final native UserPositionPresentation Swift_presentation_0(long Swift_peer, UserPositionPresentation.Style style);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_sendInput_5(long Swift_peer, Input input);

    private final native void Swift_setCallbacks_6(long Swift_peer, Callbacks callbacks);

    private final native void Swift_setup_3(long Swift_peer);

    private final native ESportsSlug Swift_sportSlug(long Swift_peer);

    private final native EEvent Swift_sportsEvent(long Swift_peer);

    public static /* synthetic */ Unit c(Ref.ObjectRef objectRef, Hasher hasher) {
        return hashCode$lambda$1(objectRef, hasher);
    }

    public static /* synthetic */ Hasher d(Ref.ObjectRef objectRef) {
        return hashCode$lambda$0(objectRef);
    }

    private static final Hasher hashCode$lambda$0(Ref.ObjectRef objectRef) {
        return (Hasher) objectRef.a;
    }

    private static final Unit hashCode$lambda$1(Ref.ObjectRef objectRef, Hasher hasher) {
        hasher.getClass();
        objectRef.a = hasher;
        return Unit.INSTANCE;
    }

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final void applyPositionUpdate(EUserPosition updated) {
        updated.getClass();
        Swift_applyPositionUpdate_4(getSwift_peer(), updated);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void cancelWork() {
        Swift_cancelWork_2(getSwift_peer());
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public boolean equals(Object other) {
        if (!(other instanceof UserPositionViewModel)) {
            return false;
        }
        return Swift_isequal(this, (UserPositionViewModel) other);
    }

    public final List<ComboLegGroupPresentation> getComboLegGroups() {
        return Swift_comboLegGroups(getSwift_peer());
    }

    public final EEvent.SportsGame getGame() {
        return Swift_game(getSwift_peer());
    }

    public final OddsFormat getOddsFormat() {
        return Swift_oddsFormat(getSwift_peer());
    }

    public final EUserPosition getPosition() {
        return Swift_position(getSwift_peer());
    }

    public final String getPositionID() {
        return Swift_positionID(getSwift_peer());
    }

    public final ESportsSlug getSportSlug() {
        return Swift_sportSlug(getSwift_peer());
    }

    public final EEvent getSportsEvent() {
        return Swift_sportsEvent(getSwift_peer());
    }

    public void hash(InOut<Hasher> into) {
        into.getClass();
        into.getValue().combine(Long.valueOf(Swift_hashvalue(getSwift_peer())));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    @Override // com.polymarket.usviewmodels.AppViewModel
    public int hashCode() {
        ?? obj = new Object();
        obj.a = new Hasher();
        hash(new InOut<>(new xyi(obj, 7), new izi(obj, 10)));
        return ((Hasher) obj.a).getResult();
    }

    public final boolean isLiquidityConstrained() {
        return Swift_isLiquidityConstrained(getSwift_peer());
    }

    public final boolean isResolutionPending() {
        return Swift_isResolutionPending(getSwift_peer());
    }

    public final UserPositionPresentation presentation(UserPositionPresentation.Style style) {
        style.getClass();
        return Swift_presentation_0(getSwift_peer(), style);
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_5(getSwift_peer(), input);
    }

    public final void setCallbacks(Callbacks callbacks) {
        callbacks.getClass();
        Swift_setCallbacks_6(getSwift_peer(), callbacks);
    }

    public final void setOddsFormat(OddsFormat oddsFormat) {
        oddsFormat.getClass();
        Swift_oddsFormat_set(getSwift_peer(), oddsFormat);
    }

    public final void setPosition(EUserPosition eUserPosition) {
        eUserPosition.getClass();
        Swift_position_set(getSwift_peer(), (EUserPosition) StructKt.sref$default(eUserPosition, null, 1, null));
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_3(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00142\u00020\u0001:\u000b\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\n\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/polymarket/usviewmodels/UserPositionViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnSelectPositionDetailCase", "OnSelectEventDetailCase", "OnShareCase", "OnBuyMoreCase", "OnSellCase", "OnShowComboDetailCase", "OnShowResolutionInfoCase", "OnCardImpressionCase", "OnComboLegTappedCase", "Companion", "Lcom/polymarket/usviewmodels/UserPositionViewModel$Input$OnBuyMoreCase;", "Lcom/polymarket/usviewmodels/UserPositionViewModel$Input$OnCardImpressionCase;", "Lcom/polymarket/usviewmodels/UserPositionViewModel$Input$OnComboLegTappedCase;", "Lcom/polymarket/usviewmodels/UserPositionViewModel$Input$OnSelectEventDetailCase;", "Lcom/polymarket/usviewmodels/UserPositionViewModel$Input$OnSelectPositionDetailCase;", "Lcom/polymarket/usviewmodels/UserPositionViewModel$Input$OnSellCase;", "Lcom/polymarket/usviewmodels/UserPositionViewModel$Input$OnShareCase;", "Lcom/polymarket/usviewmodels/UserPositionViewModel$Input$OnShowComboDetailCase;", "Lcom/polymarket/usviewmodels/UserPositionViewModel$Input$OnShowResolutionInfoCase;", "Lcom/polymarket/usviewmodels/UserPositionViewModel$Input$OnViewDidLoadCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onSelectPositionDetail = new OnSelectPositionDetailCase();
        private static final Input onSelectEventDetail = new OnSelectEventDetailCase();
        private static final Input onShare = new OnShareCase();
        private static final Input onBuyMore = new OnBuyMoreCase();
        private static final Input onSell = new OnSellCase();
        private static final Input onShowComboDetail = new OnShowComboDetailCase();
        private static final Input onShowResolutionInfo = new OnShowResolutionInfoCase();
        private static final Input onCardImpression = new OnCardImpressionCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/UserPositionViewModel$Input$OnBuyMoreCase;", "Lcom/polymarket/usviewmodels/UserPositionViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnBuyMoreCase extends Input {
            public OnBuyMoreCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/UserPositionViewModel$Input$OnCardImpressionCase;", "Lcom/polymarket/usviewmodels/UserPositionViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnCardImpressionCase extends Input {
            public OnCardImpressionCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/usviewmodels/UserPositionViewModel$Input$OnComboLegTappedCase;", "Lcom/polymarket/usviewmodels/UserPositionViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "eventId", "getEventId", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnComboLegTappedCase extends Input {
            private final String associated0;
            private final String eventId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnComboLegTappedCase(String str) {
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
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/UserPositionViewModel$Input$OnSelectEventDetailCase;", "Lcom/polymarket/usviewmodels/UserPositionViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSelectEventDetailCase extends Input {
            public OnSelectEventDetailCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/UserPositionViewModel$Input$OnSelectPositionDetailCase;", "Lcom/polymarket/usviewmodels/UserPositionViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSelectPositionDetailCase extends Input {
            public OnSelectPositionDetailCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/UserPositionViewModel$Input$OnSellCase;", "Lcom/polymarket/usviewmodels/UserPositionViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSellCase extends Input {
            public OnSellCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/UserPositionViewModel$Input$OnShareCase;", "Lcom/polymarket/usviewmodels/UserPositionViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnShareCase extends Input {
            public OnShareCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/UserPositionViewModel$Input$OnShowComboDetailCase;", "Lcom/polymarket/usviewmodels/UserPositionViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnShowComboDetailCase extends Input {
            public OnShowComboDetailCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/UserPositionViewModel$Input$OnShowResolutionInfoCase;", "Lcom/polymarket/usviewmodels/UserPositionViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnShowResolutionInfoCase extends Input {
            public OnShowResolutionInfoCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/UserPositionViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/UserPositionViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        public static final /* synthetic */ Input access$getOnBuyMore$cp() {
            return onBuyMore;
        }

        public static final /* synthetic */ Input access$getOnCardImpression$cp() {
            return onCardImpression;
        }

        public static final /* synthetic */ Input access$getOnSelectEventDetail$cp() {
            return onSelectEventDetail;
        }

        public static final /* synthetic */ Input access$getOnSelectPositionDetail$cp() {
            return onSelectPositionDetail;
        }

        public static final /* synthetic */ Input access$getOnSell$cp() {
            return onSell;
        }

        public static final /* synthetic */ Input access$getOnShare$cp() {
            return onShare;
        }

        public static final /* synthetic */ Input access$getOnShowComboDetail$cp() {
            return onShowComboDetail;
        }

        public static final /* synthetic */ Input access$getOnShowResolutionInfo$cp() {
            return onShowResolutionInfo;
        }

        public static final /* synthetic */ Input access$getOnViewDidLoad$cp() {
            return onViewDidLoad;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/polymarket/usviewmodels/UserPositionViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/UserPositionViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/UserPositionViewModel$Input;", "onSelectPositionDetail", "getOnSelectPositionDetail", "onSelectEventDetail", "getOnSelectEventDetail", "onShare", "getOnShare", "onBuyMore", "getOnBuyMore", "onSell", "getOnSell", "onShowComboDetail", "getOnShowComboDetail", "onShowResolutionInfo", "getOnShowResolutionInfo", "onCardImpression", "getOnCardImpression", "onComboLegTapped", "eventId", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnBuyMore() {
                return Input.access$getOnBuyMore$cp();
            }

            public final Input getOnCardImpression() {
                return Input.access$getOnCardImpression$cp();
            }

            public final Input getOnSelectEventDetail() {
                return Input.access$getOnSelectEventDetail$cp();
            }

            public final Input getOnSelectPositionDetail() {
                return Input.access$getOnSelectPositionDetail$cp();
            }

            public final Input getOnSell() {
                return Input.access$getOnSell$cp();
            }

            public final Input getOnShare() {
                return Input.access$getOnShare$cp();
            }

            public final Input getOnShowComboDetail() {
                return Input.access$getOnShowComboDetail$cp();
            }

            public final Input getOnShowResolutionInfo() {
                return Input.access$getOnShowResolutionInfo$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input onComboLegTapped(String eventId) {
                eventId.getClass();
                return new OnComboLegTappedCase(eventId);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0082 J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012J%\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0082 J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fJ\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0082 ¨\u0006\u0017"}, d2 = {"Lcom/polymarket/usviewmodels/UserPositionViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_1", "", "Lskip/bridge/SwiftObjectPointer;", "position", "Lcom/polymarket/data/EUserPosition;", "cardContext", "Lcom/polymarket/usviewmodels/PositionCardContext;", "callbacks", "Lcom/polymarket/usviewmodels/UserPositionViewModel$Callbacks;", "ensureCashOutAllowed", "", "sceneId", "", "surface", "Lcom/polymarket/usviewmodels/PositionCardSurface;", "Swift_Companion_ensureCashOutAllowed_7", "mock", "Lcom/polymarket/usviewmodels/UserPositionViewModel;", "Swift_Companion_mock_8", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_1(EUserPosition position, PositionCardContext cardContext, Callbacks callbacks);

        private final native boolean Swift_Companion_ensureCashOutAllowed_7(EUserPosition position, String sceneId, PositionCardSurface surface);

        private final native UserPositionViewModel Swift_Companion_mock_8(EUserPosition position, Callbacks callbacks);

        public static final /* synthetic */ long access$Swift_Companion_constructor_1(Companion companion, EUserPosition eUserPosition, PositionCardContext positionCardContext, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_1(eUserPosition, positionCardContext, callbacks);
        }

        public static /* synthetic */ boolean ensureCashOutAllowed$default(Companion companion, EUserPosition eUserPosition, String str, PositionCardSurface positionCardSurface, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                positionCardSurface = null;
            }
            return companion.ensureCashOutAllowed(eUserPosition, str, positionCardSurface);
        }

        public static /* synthetic */ UserPositionViewModel mock$default(Companion companion, EUserPosition eUserPosition, Callbacks callbacks, int i, Object obj) {
            if ((i & 2) != 0) {
                callbacks = new Callbacks(null, null, null, null, null, null, null, 127, null);
            }
            return companion.mock(eUserPosition, callbacks);
        }

        public final boolean ensureCashOutAllowed(EUserPosition position, String sceneId, PositionCardSurface surface) {
            position.getClass();
            return Swift_Companion_ensureCashOutAllowed_7(position, sceneId, surface);
        }

        public final UserPositionViewModel mock(EUserPosition position, Callbacks callbacks) {
            position.getClass();
            callbacks.getClass();
            return Swift_Companion_mock_8(position, callbacks);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPositionViewModel(EUserPosition eUserPosition, PositionCardContext positionCardContext, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_1(INSTANCE, eUserPosition, positionCardContext, callbacks), (SwiftPeerMarker) null);
        eUserPosition.getClass();
        callbacks.getClass();
    }

    public UserPositionViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u0002:\u00016B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB£\u0001\b\u0016\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\b\u0010\u0015J\u0006\u0010\u001a\u001a\u00020\rJ\u0015\u0010\u001b\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J!\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u00100\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0099\u0001\u00101\u001a\u00060\u0004j\u0002`\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0082 J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u001f032\u0006\u00104\u001a\u00020!H\u0016J\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u001f032\u0006\u00104\u001a\u00020!H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010#R\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010#R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010#R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010#R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010#R\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b/\u0010#¨\u00067"}, d2 = {"Lcom/polymarket/usviewmodels/UserPositionViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onPositionSelected", "Lkotlin/Function1;", "Lcom/polymarket/data/EUserPosition;", "", "onEventSelected", "Lcom/polymarket/data/EEvent;", "onShare", "onBuyMore", "onSell", "onShowComboDetail", "onShowResolutionInfo", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnPositionSelected", "()Lkotlin/jvm/functions/Function1;", "Swift_onPositionSelected", "getOnEventSelected", "Swift_onEventSelected", "getOnShare", "Swift_onShare", "getOnBuyMore", "Swift_onBuyMore", "getOnSell", "Swift_onSell", "getOnShowComboDetail", "Swift_onShowComboDetail", "getOnShowResolutionInfo", "Swift_onShowResolutionInfo", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new vwj(9) : function1, (i & 2) != 0 ? new vwj(10) : function12, (i & 4) != 0 ? new vwj(11) : function13, (i & 8) != 0 ? new vwj(12) : function14, (i & 16) != 0 ? new vwj(13) : function15, (i & 32) != 0 ? new vwj(14) : function16, (i & 64) != 0 ? new vwj(15) : function17);
        }

        private final native long Swift_constructor_0(Function1<? super EUserPosition, Unit> onPositionSelected, Function1<? super EEvent, Unit> onEventSelected, Function1<? super EUserPosition, Unit> onShare, Function1<? super EUserPosition, Unit> onBuyMore, Function1<? super EUserPosition, Unit> onSell, Function1<? super EUserPosition, Unit> onShowComboDetail, Function1<? super EUserPosition, Unit> onShowResolutionInfo);

        private final native Function1<EUserPosition, Unit> Swift_onBuyMore(long Swift_peer);

        private final native Function1<EEvent, Unit> Swift_onEventSelected(long Swift_peer);

        private final native Function1<EUserPosition, Unit> Swift_onPositionSelected(long Swift_peer);

        private final native Function1<EUserPosition, Unit> Swift_onSell(long Swift_peer);

        private final native Function1<EUserPosition, Unit> Swift_onShare(long Swift_peer);

        private final native Function1<EUserPosition, Unit> Swift_onShowComboDetail(long Swift_peer);

        private final native Function1<EUserPosition, Unit> Swift_onShowResolutionInfo(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(EUserPosition eUserPosition) {
            eUserPosition.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(EEvent eEvent) {
            eEvent.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2(EUserPosition eUserPosition) {
            eUserPosition.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$3(EUserPosition eUserPosition) {
            eUserPosition.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$4(EUserPosition eUserPosition) {
            eUserPosition.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$5(EUserPosition eUserPosition) {
            eUserPosition.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$6(EUserPosition eUserPosition) {
            eUserPosition.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(EUserPosition eUserPosition) {
            return _init_$lambda$3(eUserPosition);
        }

        public static /* synthetic */ Unit b(EUserPosition eUserPosition) {
            return _init_$lambda$5(eUserPosition);
        }

        public static /* synthetic */ Unit c(EUserPosition eUserPosition) {
            return _init_$lambda$6(eUserPosition);
        }

        public static /* synthetic */ Unit d(EEvent eEvent) {
            return _init_$lambda$1(eEvent);
        }

        public static /* synthetic */ Unit e(EUserPosition eUserPosition) {
            return _init_$lambda$0(eUserPosition);
        }

        public static /* synthetic */ Unit f(EUserPosition eUserPosition) {
            return _init_$lambda$2(eUserPosition);
        }

        public static /* synthetic */ Unit g(EUserPosition eUserPosition) {
            return _init_$lambda$4(eUserPosition);
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

        public final Function1<EUserPosition, Unit> getOnBuyMore() {
            return Swift_onBuyMore(this.Swift_peer);
        }

        public final Function1<EEvent, Unit> getOnEventSelected() {
            return Swift_onEventSelected(this.Swift_peer);
        }

        public final Function1<EUserPosition, Unit> getOnPositionSelected() {
            return Swift_onPositionSelected(this.Swift_peer);
        }

        public final Function1<EUserPosition, Unit> getOnSell() {
            return Swift_onSell(this.Swift_peer);
        }

        public final Function1<EUserPosition, Unit> getOnShare() {
            return Swift_onShare(this.Swift_peer);
        }

        public final Function1<EUserPosition, Unit> getOnShowComboDetail() {
            return Swift_onShowComboDetail(this.Swift_peer);
        }

        public final Function1<EUserPosition, Unit> getOnShowResolutionInfo() {
            return Swift_onShowResolutionInfo(this.Swift_peer);
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

        public Callbacks(Function1<? super EUserPosition, Unit> function1, Function1<? super EEvent, Unit> function12, Function1<? super EUserPosition, Unit> function13, Function1<? super EUserPosition, Unit> function14, Function1<? super EUserPosition, Unit> function15, Function1<? super EUserPosition, Unit> function16, Function1<? super EUserPosition, Unit> function17) {
            function1.getClass();
            function12.getClass();
            function13.getClass();
            function14.getClass();
            function15.getClass();
            function16.getClass();
            function17.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function1, function12, function13, function14, function15, function16, function17);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
