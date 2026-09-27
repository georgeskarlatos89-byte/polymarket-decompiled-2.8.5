package com.polymarket.usviewmodels;

import com.polymarket.data.AmountInputConfig;
import com.polymarket.data.EAmount;
import com.polymarket.data.EPaymentSelection;
import com.polymarket.data.EPromotionCampaign;
import com.polymarket.data.ETransaction;
import com.polymarket.data.NumberPadKey;
import com.polymarket.designtokens.DesignTokens;
import com.polymarket.usdependencies.GeoComplianceVerdict;
import com.polymarket.usviewmodels.AppViewModel;
import com.polymarket.usviewmodels.PaymentMethodsViewModel;
import defpackage.jw4;
import defpackage.on4;
import defpackage.q56;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 }2\u00020\u0001:\u0004z{|}B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001f\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rB\u001f\b\u0016\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0007\u0010\u0012J\u0015\u0010\u001a\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u001b\u001a\u00020\u001c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001d\u001a\u00020\u0014H\u0082 J\u0015\u0010#\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010$\u001a\u00020\u001c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001d\u001a\u00020\u001eH\u0082 J\u0017\u0010)\u001a\u0004\u0018\u00010&2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0006\u0010*\u001a\u00020\u001cJ\u0015\u0010+\u001a\u00020\u001c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00102\u001a\u00020,2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u00103\u001a\u00020\u001c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001d\u001a\u00020,H\u0082 J\u0015\u00107\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u00108\u001a\u00020\u001c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001d\u001a\u00020\u001eH\u0082 J\u001b\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000f092\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010@\u001a\u00020\u001c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f09H\u0082 J\u0017\u0010G\u001a\u0004\u0018\u00010A2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010H\u001a\u00020\u001c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010AH\u0082 J\u0015\u0010L\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010N\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010R\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010U\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010Z\u001a\u00020W2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010]\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010b\u001a\u0004\u0018\u00010_2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010e\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010j\u001a\u0004\u0018\u00010g2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010k\u001a\u00020\u001cH\u0016J\u0015\u0010l\u001a\u00020\u001c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010m\u001a\u00020\u001c2\u0006\u0010n\u001a\u00020oJ\u001d\u0010p\u001a\u00020\u001c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010n\u001a\u00020oH\u0082 J\u000e\u0010q\u001a\u00020\u001e2\u0006\u0010r\u001a\u00020sJ\u001d\u0010t\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010r\u001a\u00020sH\u0082 J\u0016\u0010u\u001a\b\u0012\u0004\u0012\u00020w0v2\u0006\u0010x\u001a\u00020,H\u0016J\u0017\u0010y\u001a\b\u0012\u0004\u0012\u00020w0v2\u0006\u0010x\u001a\u00020,H\u0082 R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0013\u0010%\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R$\u0010-\u001a\u00020,2\u0006\u0010\u0013\u001a\u00020,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00104\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010 \"\u0004\b6\u0010\"R0\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000f092\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f098F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R(\u0010B\u001a\u0004\u0018\u00010A2\b\u0010\u0013\u001a\u0004\u0018\u00010A8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0011\u0010I\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010M\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bM\u0010 R\u0013\u0010O\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0011\u0010S\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bT\u0010KR\u0011\u0010V\u001a\u00020W8F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0011\u0010[\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\\\u0010KR\u0013\u0010^\u001a\u0004\u0018\u00010_8F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0013\u0010c\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bd\u0010QR\u0013\u0010f\u001a\u0004\u0018\u00010g8F¢\u0006\u0006\u001a\u0004\bh\u0010i¨\u0006~"}, d2 = {"Lcom/polymarket/usviewmodels/DepositViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "(Lcom/polymarket/usviewmodels/AppSceneType;Ljava/lang/String;)V", "initialAmount", "Lcom/polymarket/data/EAmount;", "callbacks", "Lcom/polymarket/usviewmodels/DepositViewModel$Callbacks;", "(Lcom/polymarket/data/EAmount;Lcom/polymarket/usviewmodels/DepositViewModel$Callbacks;)V", "newValue", "Lcom/polymarket/data/AmountInputConfig;", "inputConfig", "getInputConfig", "()Lcom/polymarket/data/AmountInputConfig;", "setInputConfig", "(Lcom/polymarket/data/AmountInputConfig;)V", "Swift_inputConfig", "Swift_inputConfig_set", "", "value", "", "isLoading", "()Z", "setLoading", "(Z)V", "Swift_isLoading", "Swift_isLoading_set", "geoDeniedVerdict", "Lcom/polymarket/usdependencies/GeoComplianceVerdict;", "getGeoDeniedVerdict", "()Lcom/polymarket/usdependencies/GeoComplianceVerdict;", "Swift_geoDeniedVerdict", "clearGeoDenial", "Swift_clearGeoDenial_0", "", "shouldTriggerErrorFeedback", "getShouldTriggerErrorFeedback", "()I", "setShouldTriggerErrorFeedback", "(I)V", "Swift_shouldTriggerErrorFeedback", "Swift_shouldTriggerErrorFeedback_set", "shouldHighlightDailyLimit", "getShouldHighlightDailyLimit", "setShouldHighlightDailyLimit", "Swift_shouldHighlightDailyLimit", "Swift_shouldHighlightDailyLimit_set", "", "quickAmounts", "getQuickAmounts", "()Ljava/util/List;", "setQuickAmounts", "(Ljava/util/List;)V", "Swift_quickAmounts", "Swift_quickAmounts_set", "Lcom/polymarket/data/EPaymentSelection;", "selectedPaymentSelection", "getSelectedPaymentSelection", "()Lcom/polymarket/data/EPaymentSelection;", "setSelectedPaymentSelection", "(Lcom/polymarket/data/EPaymentSelection;)V", "Swift_selectedPaymentSelection", "Swift_selectedPaymentSelection_set", "amount", "getAmount", "()Ljava/lang/String;", "Swift_amount", "isValid", "Swift_isValid", "amountValue", "getAmountValue", "()Lcom/polymarket/data/EAmount;", "Swift_amountValue", "primaryButtonTitle", "getPrimaryButtonTitle", "Swift_primaryButtonTitle", "primaryButtonColor", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "getPrimaryButtonColor", "()Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "Swift_primaryButtonColor", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "Swift_title", "depositReward", "Lcom/polymarket/usviewmodels/DepositViewModel$DepositRewardPill;", "getDepositReward", "()Lcom/polymarket/usviewmodels/DepositViewModel$DepositRewardPill;", "Swift_depositReward", "selectedPaymentDailyLimit", "getSelectedPaymentDailyLimit", "Swift_selectedPaymentDailyLimit", "displayedCampaign", "Lcom/polymarket/data/EPromotionCampaign;", "getDisplayedCampaign", "()Lcom/polymarket/data/EPromotionCampaign;", "Swift_displayedCampaign", "setup", "Swift_setup_4", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/DepositViewModel$Input;", "Swift_sendInput_5", "sendPadKey", "key", "Lcom/polymarket/data/NumberPadKey;", "Swift_sendPadKey_6", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Callbacks", "DepositRewardPill", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DepositViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ DepositViewModel(EAmount eAmount, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : eAmount, (i & 2) != 0 ? new Callbacks(null, null, null, null, null, null, 63, null) : callbacks);
    }

    private final native String Swift_amount(long Swift_peer);

    private final native EAmount Swift_amountValue(long Swift_peer);

    private final native void Swift_clearGeoDenial_0(long Swift_peer);

    private final native DepositRewardPill Swift_depositReward(long Swift_peer);

    private final native EPromotionCampaign Swift_displayedCampaign(long Swift_peer);

    private final native GeoComplianceVerdict Swift_geoDeniedVerdict(long Swift_peer);

    private final native AmountInputConfig Swift_inputConfig(long Swift_peer);

    private final native void Swift_inputConfig_set(long Swift_peer, AmountInputConfig value);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native void Swift_isLoading_set(long Swift_peer, boolean value);

    private final native boolean Swift_isValid(long Swift_peer);

    private final native DesignTokens.SemanticColor Swift_primaryButtonColor(long Swift_peer);

    private final native String Swift_primaryButtonTitle(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native List<EAmount> Swift_quickAmounts(long Swift_peer);

    private final native void Swift_quickAmounts_set(long Swift_peer, List<EAmount> value);

    private final native EAmount Swift_selectedPaymentDailyLimit(long Swift_peer);

    private final native EPaymentSelection Swift_selectedPaymentSelection(long Swift_peer);

    private final native void Swift_selectedPaymentSelection_set(long Swift_peer, EPaymentSelection value);

    private final native void Swift_sendInput_5(long Swift_peer, Input input);

    private final native boolean Swift_sendPadKey_6(long Swift_peer, NumberPadKey key);

    private final native void Swift_setup_4(long Swift_peer);

    private final native boolean Swift_shouldHighlightDailyLimit(long Swift_peer);

    private final native void Swift_shouldHighlightDailyLimit_set(long Swift_peer, boolean value);

    private final native int Swift_shouldTriggerErrorFeedback(long Swift_peer);

    private final native void Swift_shouldTriggerErrorFeedback_set(long Swift_peer, int value);

    private final native String Swift_title(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final void clearGeoDenial() {
        Swift_clearGeoDenial_0(getSwift_peer());
    }

    public final String getAmount() {
        return Swift_amount(getSwift_peer());
    }

    public final EAmount getAmountValue() {
        return Swift_amountValue(getSwift_peer());
    }

    public final DepositRewardPill getDepositReward() {
        return Swift_depositReward(getSwift_peer());
    }

    public final EPromotionCampaign getDisplayedCampaign() {
        return Swift_displayedCampaign(getSwift_peer());
    }

    public final GeoComplianceVerdict getGeoDeniedVerdict() {
        return Swift_geoDeniedVerdict(getSwift_peer());
    }

    public final AmountInputConfig getInputConfig() {
        return Swift_inputConfig(getSwift_peer());
    }

    public final DesignTokens.SemanticColor getPrimaryButtonColor() {
        return Swift_primaryButtonColor(getSwift_peer());
    }

    public final String getPrimaryButtonTitle() {
        return Swift_primaryButtonTitle(getSwift_peer());
    }

    public final List<EAmount> getQuickAmounts() {
        return Swift_quickAmounts(getSwift_peer());
    }

    public final EAmount getSelectedPaymentDailyLimit() {
        return Swift_selectedPaymentDailyLimit(getSwift_peer());
    }

    public final EPaymentSelection getSelectedPaymentSelection() {
        return Swift_selectedPaymentSelection(getSwift_peer());
    }

    public final boolean getShouldHighlightDailyLimit() {
        return Swift_shouldHighlightDailyLimit(getSwift_peer());
    }

    public final int getShouldTriggerErrorFeedback() {
        return Swift_shouldTriggerErrorFeedback(getSwift_peer());
    }

    public final String getTitle() {
        return Swift_title(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final boolean isValid() {
        return Swift_isValid(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_5(getSwift_peer(), input);
    }

    public final boolean sendPadKey(NumberPadKey key) {
        key.getClass();
        return Swift_sendPadKey_6(getSwift_peer(), key);
    }

    public final void setInputConfig(AmountInputConfig amountInputConfig) {
        amountInputConfig.getClass();
        Swift_inputConfig_set(getSwift_peer(), (AmountInputConfig) StructKt.sref$default(amountInputConfig, null, 1, null));
    }

    public final void setLoading(boolean z) {
        Swift_isLoading_set(getSwift_peer(), z);
    }

    public final void setQuickAmounts(List<EAmount> list) {
        list.getClass();
        Swift_quickAmounts_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setSelectedPaymentSelection(EPaymentSelection ePaymentSelection) {
        Swift_selectedPaymentSelection_set(getSwift_peer(), ePaymentSelection);
    }

    public final void setShouldHighlightDailyLimit(boolean z) {
        Swift_shouldHighlightDailyLimit_set(getSwift_peer(), z);
    }

    public final void setShouldTriggerErrorFeedback(int i) {
        Swift_shouldTriggerErrorFeedback_set(getSwift_peer(), i);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_4(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00122\u00020\u0001:\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\b\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/polymarket/usviewmodels/DepositViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnAmountChangedCase", "OnQuickAmountSelectedCase", "OnPrefillAmountCase", "OnShowPaymentMethodsCase", "OnPrimaryTransactionCase", "OnCancelCase", "On3DSChallengeReturnedCase", "Companion", "Lcom/polymarket/usviewmodels/DepositViewModel$Input$On3DSChallengeReturnedCase;", "Lcom/polymarket/usviewmodels/DepositViewModel$Input$OnAmountChangedCase;", "Lcom/polymarket/usviewmodels/DepositViewModel$Input$OnCancelCase;", "Lcom/polymarket/usviewmodels/DepositViewModel$Input$OnPrefillAmountCase;", "Lcom/polymarket/usviewmodels/DepositViewModel$Input$OnPrimaryTransactionCase;", "Lcom/polymarket/usviewmodels/DepositViewModel$Input$OnQuickAmountSelectedCase;", "Lcom/polymarket/usviewmodels/DepositViewModel$Input$OnShowPaymentMethodsCase;", "Lcom/polymarket/usviewmodels/DepositViewModel$Input$OnViewDidLoadCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onPrimaryTransaction = new OnPrimaryTransactionCase();
        private static final Input onCancel = new OnCancelCase();
        private static final Input on3DSChallengeReturned = new On3DSChallengeReturnedCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/DepositViewModel$Input$On3DSChallengeReturnedCase;", "Lcom/polymarket/usviewmodels/DepositViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class On3DSChallengeReturnedCase extends Input {
            public On3DSChallengeReturnedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/DepositViewModel$Input$OnAmountChangedCase;", "Lcom/polymarket/usviewmodels/DepositViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnAmountChangedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnAmountChangedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/DepositViewModel$Input$OnCancelCase;", "Lcom/polymarket/usviewmodels/DepositViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnCancelCase extends Input {
            public OnCancelCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/DepositViewModel$Input$OnPrefillAmountCase;", "Lcom/polymarket/usviewmodels/DepositViewModel$Input;", "associated0", "Lcom/polymarket/data/EAmount;", "<init>", "(Lcom/polymarket/data/EAmount;)V", "getAssociated0", "()Lcom/polymarket/data/EAmount;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPrefillAmountCase extends Input {
            private final EAmount associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnPrefillAmountCase(EAmount eAmount) {
                super(null);
                eAmount.getClass();
                this.associated0 = eAmount;
            }

            public final EAmount getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/DepositViewModel$Input$OnPrimaryTransactionCase;", "Lcom/polymarket/usviewmodels/DepositViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPrimaryTransactionCase extends Input {
            public OnPrimaryTransactionCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/DepositViewModel$Input$OnQuickAmountSelectedCase;", "Lcom/polymarket/usviewmodels/DepositViewModel$Input;", "associated0", "Lcom/polymarket/data/EAmount;", "<init>", "(Lcom/polymarket/data/EAmount;)V", "getAssociated0", "()Lcom/polymarket/data/EAmount;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnQuickAmountSelectedCase extends Input {
            private final EAmount associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnQuickAmountSelectedCase(EAmount eAmount) {
                super(null);
                eAmount.getClass();
                this.associated0 = eAmount;
            }

            public final EAmount getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/DepositViewModel$Input$OnShowPaymentMethodsCase;", "Lcom/polymarket/usviewmodels/DepositViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$AutoStartAction;", "<init>", "(Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$AutoStartAction;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$AutoStartAction;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnShowPaymentMethodsCase extends Input {
            private final PaymentMethodsViewModel.AutoStartAction associated0;

            public OnShowPaymentMethodsCase(PaymentMethodsViewModel.AutoStartAction autoStartAction) {
                super(null);
                this.associated0 = autoStartAction;
            }

            public final PaymentMethodsViewModel.AutoStartAction getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/DepositViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/DepositViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        public static final /* synthetic */ Input access$getOn3DSChallengeReturned$cp() {
            return on3DSChallengeReturned;
        }

        public static final /* synthetic */ Input access$getOnCancel$cp() {
            return onCancel;
        }

        public static final /* synthetic */ Input access$getOnPrimaryTransaction$cp() {
            return onPrimaryTransaction;
        }

        public static final /* synthetic */ Input access$getOnViewDidLoad$cp() {
            return onViewDidLoad;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\fJ\u0010\u0010\u000e\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/polymarket/usviewmodels/DepositViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/DepositViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/DepositViewModel$Input;", "onAmountChanged", "associated0", "", "onQuickAmountSelected", "Lcom/polymarket/data/EAmount;", "onPrefillAmount", "onShowPaymentMethods", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$AutoStartAction;", "onPrimaryTransaction", "getOnPrimaryTransaction", "onCancel", "getOnCancel", "on3DSChallengeReturned", "getOn3DSChallengeReturned", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOn3DSChallengeReturned() {
                return Input.access$getOn3DSChallengeReturned$cp();
            }

            public final Input getOnCancel() {
                return Input.access$getOnCancel$cp();
            }

            public final Input getOnPrimaryTransaction() {
                return Input.access$getOnPrimaryTransaction$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input onAmountChanged(String associated0) {
                associated0.getClass();
                return new OnAmountChangedCase(associated0);
            }

            public final Input onPrefillAmount(EAmount associated0) {
                associated0.getClass();
                return new OnPrefillAmountCase(associated0);
            }

            public final Input onQuickAmountSelected(EAmount associated0) {
                associated0.getClass();
                return new OnQuickAmountSelectedCase(associated0);
            }

            public final Input onShowPaymentMethods(PaymentMethodsViewModel.AutoStartAction associated0) {
                return new OnShowPaymentMethodsCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0099\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2&\u0010\u000f\u001a\"\b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\t2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\u0010\u0016J\u0092\u0001\u0010\u0017\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2&\u0010\u000f\u001a\"\b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\tH\u0082 ¢\u0006\u0002\u0010\u0016J\u001f\u0010\u0018\u001a\u00060\u0019j\u0002`\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0082 J\u001f\u0010\u001f\u001a\u00060\u0019j\u0002`\u001a2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010 \u001a\u00020!H\u0082 J\u0006\u0010\"\u001a\u00020#J\t\u0010$\u001a\u00020#H\u0082 ¨\u0006%"}, d2 = {"Lcom/polymarket/usviewmodels/DepositViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "create", "Lcom/polymarket/usviewmodels/DepositViewModel;", "initialAmount", "Lcom/polymarket/data/EAmount;", "onFundsTransactionCompleted", "Lkotlin/Function2;", "Lcom/polymarket/data/ETransaction;", "Lcom/polymarket/data/EPaymentSelection;", "", "onCancel", "Lkotlin/Function0;", "onShowPaymentMethods", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$AutoStartAction;", "Lkotlin/coroutines/Continuation;", "", "onRequiresAuthentication", "onRequires3DSChallenge", "Ljava/net/URI;", "(Lcom/polymarket/data/EAmount;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)Lcom/polymarket/usviewmodels/DepositViewModel;", "Swift_Companion_create_1", "Swift_Companion_constructor_2", "", "Lskip/bridge/SwiftObjectPointer;", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "Swift_Companion_constructor_3", "callbacks", "Lcom/polymarket/usviewmodels/DepositViewModel$Callbacks;", "ensureFlowAllowed", "", "Swift_Companion_ensureFlowAllowed_7", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_2(AppSceneType scene, String id);

        private final native long Swift_Companion_constructor_3(EAmount initialAmount, Callbacks callbacks);

        private final native DepositViewModel Swift_Companion_create_1(EAmount initialAmount, Function2<? super ETransaction, ? super EPaymentSelection, Unit> onFundsTransactionCompleted, Function0<Unit> onCancel, Function2<? super PaymentMethodsViewModel.AutoStartAction, ? super Continuation<? super EPaymentSelection>, ? extends Object> onShowPaymentMethods, Function0<Unit> onRequiresAuthentication, Function2<? super URI, ? super ETransaction, Unit> onRequires3DSChallenge);

        private final native boolean Swift_Companion_ensureFlowAllowed_7();

        public static /* synthetic */ Unit a(ETransaction eTransaction, EPaymentSelection ePaymentSelection) {
            return create$lambda$0(eTransaction, ePaymentSelection);
        }

        public static final /* synthetic */ long access$Swift_Companion_constructor_2(Companion companion, AppSceneType appSceneType, String str) {
            return companion.Swift_Companion_constructor_2(appSceneType, str);
        }

        public static final /* synthetic */ long access$Swift_Companion_constructor_3(Companion companion, EAmount eAmount, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_3(eAmount, callbacks);
        }

        public static /* synthetic */ Unit b() {
            return create$lambda$2();
        }

        public static /* synthetic */ Unit c() {
            return create$lambda$1();
        }

        public static /* synthetic */ DepositViewModel create$default(Companion companion, EAmount eAmount, Function2 function2, Function0 function0, Function2 function22, Function0 function02, Function2 function23, int i, Object obj) {
            if ((i & 1) != 0) {
                eAmount = null;
            }
            if ((i & 2) != 0) {
                function2 = new jw4(20);
            }
            if ((i & 4) != 0) {
                function0 = new q56(21);
            }
            if ((i & 16) != 0) {
                function02 = new q56(22);
            }
            if ((i & 32) != 0) {
                function23 = new jw4(21);
            }
            Function0 function03 = function0;
            return companion.create(eAmount, function2, function03, function22, function02, function23);
        }

        private static final Unit create$lambda$0(ETransaction eTransaction, EPaymentSelection ePaymentSelection) {
            eTransaction.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit create$lambda$1() {
            return Unit.INSTANCE;
        }

        private static final Unit create$lambda$2() {
            return Unit.INSTANCE;
        }

        private static final Unit create$lambda$3(URI uri, ETransaction eTransaction) {
            uri.getClass();
            eTransaction.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit d(URI uri, ETransaction eTransaction) {
            return create$lambda$3(uri, eTransaction);
        }

        public final DepositViewModel create(EAmount initialAmount, Function2<? super ETransaction, ? super EPaymentSelection, Unit> onFundsTransactionCompleted, Function0<Unit> onCancel, Function2<? super PaymentMethodsViewModel.AutoStartAction, ? super Continuation<? super EPaymentSelection>, ? extends Object> onShowPaymentMethods, Function0<Unit> onRequiresAuthentication, Function2<? super URI, ? super ETransaction, Unit> onRequires3DSChallenge) {
            onFundsTransactionCompleted.getClass();
            onCancel.getClass();
            onShowPaymentMethods.getClass();
            onRequiresAuthentication.getClass();
            onRequires3DSChallenge.getClass();
            return Swift_Companion_create_1(initialAmount, onFundsTransactionCompleted, onCancel, onShowPaymentMethods, onRequiresAuthentication, onRequires3DSChallenge);
        }

        public final boolean ensureFlowAllowed() {
            return Swift_Companion_ensureFlowAllowed_7();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0002*+B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0015\u0010\u001a\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001d\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001d\u0010\u001e\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0082 J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\u0019\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0000H\u0082 J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0'2\u0006\u0010(\u001a\u00020\u0017H\u0016J\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0'2\u0006\u0010(\u001a\u00020\u0017H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lcom/polymarket/usviewmodels/DepositViewModel$DepositRewardPill;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "text", "", "state", "Lcom/polymarket/usviewmodels/DepositViewModel$DepositRewardPill$State;", "(Ljava/lang/String;Lcom/polymarket/usviewmodels/DepositViewModel$DepositRewardPill$State;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getText", "()Ljava/lang/String;", "Swift_text", "getState", "()Lcom/polymarket/usviewmodels/DepositViewModel$DepositRewardPill$State;", "Swift_state", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "State", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DepositRewardPill implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/DepositViewModel$DepositRewardPill$State;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "neutral", "belowThreshold", "met", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class State implements SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ State[] $VALUES;
            public static final State neutral = new State("neutral", 0);
            public static final State belowThreshold = new State("belowThreshold", 1);
            public static final State met = new State("met", 2);

            private static final /* synthetic */ State[] $values() {
                return new State[]{neutral, belowThreshold, met};
            }

            static {
                State[] $values = $values();
                $VALUES = $values;
                $ENTRIES = ww4.b($values);
                INSTANCE = new Companion(null);
            }

            private State(String str, int i) {
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static ug7 getEntries() {
                return $ENTRIES;
            }

            public static State valueOf(String str) {
                return (State) Enum.valueOf(State.class, str);
            }

            public static State[] values() {
                return (State[]) $VALUES.clone();
            }

            @Override // skip.lib.SwiftProjecting
            public Function0<Object> Swift_projection(int options) {
                return Swift_projectionImpl(options);
            }
        }

        public DepositRewardPill(String str, State state) {
            str.getClass();
            state.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, state);
        }

        private final native long Swift_constructor_0(String text, State state);

        private final native boolean Swift_isequal(DepositRewardPill lhs, DepositRewardPill rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native State Swift_state(long Swift_peer);

        private final native String Swift_text(long Swift_peer);

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
            if (!(other instanceof DepositRewardPill)) {
                return false;
            }
            return Swift_isequal(this, (DepositRewardPill) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final State getState() {
            return Swift_state(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getText() {
            return Swift_text(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public DepositRewardPill(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DepositViewModel(AppSceneType appSceneType, String str) {
        super(Companion.access$Swift_Companion_constructor_2(INSTANCE, appSceneType, str), (SwiftPeerMarker) null);
        appSceneType.getClass();
    }

    public /* synthetic */ DepositViewModel(AppSceneType appSceneType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AppSceneDefault() : appSceneType, (i & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DepositViewModel(EAmount eAmount, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_3(INSTANCE, eAmount, callbacks), (SwiftPeerMarker) null);
        callbacks.getClass();
    }

    public DepositViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0001:B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBµ\u0001\b\u0016\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012(\b\u0002\u0010\u0011\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0013\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u001a\b\u0002\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u000b\u0012&\b\u0002\u0010\u0017\u001a \u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0004\u0012\u00020\u000e0\u0018¢\u0006\u0004\b\b\u0010\u001aJ\u0006\u0010\u001f\u001a\u00020\u000eJ\u0015\u0010 \u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J)\u0010)\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J5\u0010.\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0013\u0012\u0004\u0012\u00020\u000e0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u00100\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J'\u00102\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J3\u00105\u001a \u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0004\u0012\u00020\u000e0\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u00ad\u0001\u00106\u001a\u00060\u0004j\u0002`\u00052\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102&\u0010\u0011\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0013\u0012\u0004\u0012\u00020\u000e0\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u000b2$\u0010\u0017\u001a \u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0004\u0012\u00020\u000e0\u0018H\u0082 J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020$0\u00102\u0006\u00108\u001a\u00020&H\u0016J\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020$0\u00102\u0006\u00108\u001a\u00020&H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR%\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108F¢\u0006\u0006\u001a\u0004\b*\u0010+R1\u0010\u0011\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0013\u0012\u0004\u0012\u00020\u000e0\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010(R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108F¢\u0006\u0006\u001a\u0004\b/\u0010+R#\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u000b8F¢\u0006\u0006\u001a\u0004\b1\u0010(R/\u0010\u0017\u001a \u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0004\u0012\u00020\u000e0\u00188F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u0006;"}, d2 = {"Lcom/polymarket/usviewmodels/DepositViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onFundsTransactionCompleted", "Lkotlin/Function2;", "Lcom/polymarket/data/ETransaction;", "Lcom/polymarket/data/EPaymentSelection;", "", "onCancel", "Lkotlin/Function0;", "onShowPaymentMethods", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$AutoStartAction;", "Lkotlin/Function1;", "onRequiresAuthentication", "onRequires3DSChallenge", "Ljava/net/URI;", "onComposeSupportMessage", "Lkotlin/Function3;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnFundsTransactionCompleted", "()Lkotlin/jvm/functions/Function2;", "Swift_onFundsTransactionCompleted", "getOnCancel", "()Lkotlin/jvm/functions/Function0;", "Swift_onCancel", "getOnShowPaymentMethods", "Swift_onShowPaymentMethods", "getOnRequiresAuthentication", "Swift_onRequiresAuthentication", "getOnRequires3DSChallenge", "Swift_onRequires3DSChallenge", "getOnComposeSupportMessage", "()Lkotlin/jvm/functions/Function3;", "Swift_onComposeSupportMessage", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function2 function2, Function0 function0, Function2 function22, Function0 function02, Function2 function23, Function3 function3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new jw4(17) : function2, (i & 2) != 0 ? new q56(19) : function0, (i & 4) != 0 ? new jw4(18) : function22, (i & 8) != 0 ? new q56(20) : function02, (i & 16) != 0 ? new jw4(19) : function23, (i & 32) != 0 ? new on4(28) : function3);
        }

        private final native long Swift_constructor_0(Function2<? super ETransaction, ? super EPaymentSelection, Unit> onFundsTransactionCompleted, Function0<Unit> onCancel, Function2<? super PaymentMethodsViewModel.AutoStartAction, ? super Function1<? super EPaymentSelection, Unit>, Unit> onShowPaymentMethods, Function0<Unit> onRequiresAuthentication, Function2<? super URI, ? super ETransaction, Unit> onRequires3DSChallenge, Function3<? super String, ? super String, ? super Function0<Unit>, Unit> onComposeSupportMessage);

        private final native Function0<Unit> Swift_onCancel(long Swift_peer);

        private final native Function3<String, String, Function0<Unit>, Unit> Swift_onComposeSupportMessage(long Swift_peer);

        private final native Function2<ETransaction, EPaymentSelection, Unit> Swift_onFundsTransactionCompleted(long Swift_peer);

        private final native Function2<URI, ETransaction, Unit> Swift_onRequires3DSChallenge(long Swift_peer);

        private final native Function0<Unit> Swift_onRequiresAuthentication(long Swift_peer);

        private final native Function2<PaymentMethodsViewModel.AutoStartAction, Function1<? super EPaymentSelection, Unit>, Unit> Swift_onShowPaymentMethods(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(ETransaction eTransaction, EPaymentSelection ePaymentSelection) {
            eTransaction.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2(PaymentMethodsViewModel.AutoStartAction autoStartAction, Function1 function1) {
            function1.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$3() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$4(URI uri, ETransaction eTransaction) {
            uri.getClass();
            eTransaction.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$5(String str, String str2, Function0 function0) {
            str.getClass();
            str2.getClass();
            function0.getClass();
            function0.invoke();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a() {
            return _init_$lambda$3();
        }

        public static /* synthetic */ Unit b(String str, String str2, Function0 function0) {
            return _init_$lambda$5(str, str2, function0);
        }

        public static /* synthetic */ Unit c() {
            return _init_$lambda$1();
        }

        public static /* synthetic */ Unit d(ETransaction eTransaction, EPaymentSelection ePaymentSelection) {
            return _init_$lambda$0(eTransaction, ePaymentSelection);
        }

        public static /* synthetic */ Unit e(PaymentMethodsViewModel.AutoStartAction autoStartAction, Function1 function1) {
            return _init_$lambda$2(autoStartAction, function1);
        }

        public static /* synthetic */ Unit f(URI uri, ETransaction eTransaction) {
            return _init_$lambda$4(uri, eTransaction);
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

        public final Function0<Unit> getOnCancel() {
            return Swift_onCancel(this.Swift_peer);
        }

        public final Function3<String, String, Function0<Unit>, Unit> getOnComposeSupportMessage() {
            return Swift_onComposeSupportMessage(this.Swift_peer);
        }

        public final Function2<ETransaction, EPaymentSelection, Unit> getOnFundsTransactionCompleted() {
            return Swift_onFundsTransactionCompleted(this.Swift_peer);
        }

        public final Function2<URI, ETransaction, Unit> getOnRequires3DSChallenge() {
            return Swift_onRequires3DSChallenge(this.Swift_peer);
        }

        public final Function0<Unit> getOnRequiresAuthentication() {
            return Swift_onRequiresAuthentication(this.Swift_peer);
        }

        public final Function2<PaymentMethodsViewModel.AutoStartAction, Function1<? super EPaymentSelection, Unit>, Unit> getOnShowPaymentMethods() {
            return Swift_onShowPaymentMethods(this.Swift_peer);
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

        public Callbacks(Function2<? super ETransaction, ? super EPaymentSelection, Unit> function2, Function0<Unit> function0, Function2<? super PaymentMethodsViewModel.AutoStartAction, ? super Function1<? super EPaymentSelection, Unit>, Unit> function22, Function0<Unit> function02, Function2<? super URI, ? super ETransaction, Unit> function23, Function3<? super String, ? super String, ? super Function0<Unit>, Unit> function3) {
            function2.getClass();
            function0.getClass();
            function22.getClass();
            function02.getClass();
            function23.getClass();
            function3.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function2, function0, function22, function02, function23, function3);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
