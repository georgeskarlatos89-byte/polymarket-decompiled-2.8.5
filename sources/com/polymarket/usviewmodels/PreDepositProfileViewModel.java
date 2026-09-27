package com.polymarket.usviewmodels;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.EDefaultDepositLimits;
import com.polymarket.data.ELinkedAccount;
import com.polymarket.data.EMFAData;
import com.polymarket.data.EPaymentMethod;
import com.polymarket.data.EThemeSettings;
import com.polymarket.data.EUser;
import com.polymarket.data.EWireDetails;
import com.polymarket.designtokens.Icon;
import com.polymarket.usviewmodels.AppViewModel;
import com.polymarket.usviewmodels.PromotionsViewModel;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.nje;
import defpackage.rye;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Array;
import skip.lib.ArrayKt;
import skip.lib.CaseIterable;
import skip.lib.CaseIterableCompanion;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u0082\u00012\u00020\u0001:\u0007\u007f\u0080\u0001\u0081\u0001\u0082\u0001B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rJ\u0015\u0010\u0010\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00122\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u001c\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u001d\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001f\u001a\u00020\u0017H\u0082 J\u0017\u0010&\u001a\u0004\u0018\u00010 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010'\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0082 J\u0015\u0010*\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010+\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001f\u001a\u00020\u0017H\u0082 J\u0015\u0010.\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010/\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001f\u001a\u00020\u0017H\u0082 J\u0015\u00103\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u00104\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001f\u001a\u00020\u0017H\u0082 J\u0015\u00108\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u00109\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001f\u001a\u00020\u0017H\u0082 J\u0015\u0010=\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010>\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001f\u001a\u00020\u0017H\u0082 J\u0015\u0010E\u001a\u00020?2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010F\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001f\u001a\u00020?H\u0082 J\u0015\u0010K\u001a\u00020H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010N\u001a\u0004\u0018\u00010H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010Q\u001a\u00020H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010T\u001a\u00020H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010W\u001a\u00020H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\\\u001a\u00020Y2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010_\u001a\u00020H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010b\u001a\u00020H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010g\u001a\b\u0012\u0004\u0012\u00020 0d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010h\u001a\u00020H2\u0006\u0010i\u001a\u00020 J\u001d\u0010j\u001a\u00020H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010k\u001a\u00020 H\u0082 J\u0017\u0010p\u001a\u0004\u0018\u00010m2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010q\u001a\u00020\u001eH\u0016J\u0015\u0010r\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0010\u0010s\u001a\u0004\u0018\u00010H2\u0006\u0010i\u001a\u00020 J\u001f\u0010t\u001a\u0004\u0018\u00010H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010k\u001a\u00020 H\u0082 J\u000e\u0010u\u001a\u00020\u001e2\u0006\u0010v\u001a\u00020wJ\u001d\u0010x\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010v\u001a\u00020wH\u0082 J\u0016\u0010y\u001a\b\u0012\u0004\u0012\u00020{0z2\u0006\u0010|\u001a\u00020}H\u0016J\u0017\u0010~\u001a\b\u0012\u0004\u0012\u00020{0z2\u0006\u0010|\u001a\u00020}H\u0082 R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u0016\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010(\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001bR$\u0010,\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR$\u00100\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u0010\u001bR$\u00105\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010\u0019\"\u0004\b7\u0010\u001bR$\u0010:\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010\u0019\"\u0004\b<\u0010\u001bR$\u0010@\u001a\u00020?2\u0006\u0010\u0016\u001a\u00020?8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0011\u0010G\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0013\u0010L\u001a\u0004\u0018\u00010H8F¢\u0006\u0006\u001a\u0004\bM\u0010JR\u0011\u0010O\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bP\u0010JR\u0011\u0010R\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bS\u0010JR\u0011\u0010U\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bV\u0010JR\u0011\u0010X\u001a\u00020Y8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0011\u0010]\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\b^\u0010JR\u0011\u0010`\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\ba\u0010JR\u0017\u0010c\u001a\b\u0012\u0004\u0012\u00020 0d8F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0013\u0010l\u001a\u0004\u0018\u00010m8F¢\u0006\u0006\u001a\u0004\bn\u0010o¨\u0006\u0083\u0001"}, d2 = {"Lcom/polymarket/usviewmodels/PreDepositProfileViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "user", "Lcom/polymarket/data/EUser;", "callbacks", "Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$Callbacks;", "(Lcom/polymarket/data/EUser;Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$Callbacks;)V", "getUser", "()Lcom/polymarket/data/EUser;", "Swift_user", "defaultDepositLimits", "Lcom/polymarket/data/EDefaultDepositLimits;", "getDefaultDepositLimits", "()Lcom/polymarket/data/EDefaultDepositLimits;", "Swift_defaultDepositLimits", "newValue", "", "isPlatformPayAvailable", "()Z", "setPlatformPayAvailable", "(Z)V", "Swift_isPlatformPayAvailable", "Swift_isPlatformPayAvailable_set", "", "value", "Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$PaymentOption;", "linkingMethod", "getLinkingMethod", "()Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$PaymentOption;", "setLinkingMethod", "(Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$PaymentOption;)V", "Swift_linkingMethod", "Swift_linkingMethod_set", "isPayPalLinkEnabled", "setPayPalLinkEnabled", "Swift_isPayPalLinkEnabled", "Swift_isPayPalLinkEnabled_set", "isVenmoLinkEnabled", "setVenmoLinkEnabled", "Swift_isVenmoLinkEnabled", "Swift_isVenmoLinkEnabled_set", "acceptsCreditCards", "getAcceptsCreditCards", "setAcceptsCreditCards", "Swift_acceptsCreditCards", "Swift_acceptsCreditCards_set", "hasDepositablePayPal", "getHasDepositablePayPal", "setHasDepositablePayPal", "Swift_hasDepositablePayPal", "Swift_hasDepositablePayPal_set", "hasDepositableVenmo", "getHasDepositableVenmo", "setHasDepositableVenmo", "Swift_hasDepositableVenmo", "Swift_hasDepositableVenmo_set", "Lcom/polymarket/data/EThemeSettings$Appearance;", "currentTheme", "getCurrentTheme", "()Lcom/polymarket/data/EThemeSettings$Appearance;", "setCurrentTheme", "(Lcom/polymarket/data/EThemeSettings$Appearance;)V", "Swift_currentTheme", "Swift_currentTheme_set", "navTitleText", "", "getNavTitleText", "()Ljava/lang/String;", "Swift_navTitleText", "bonusAmountText", "getBonusAmountText", "Swift_bonusAmountText", "headlineText", "getHeadlineText", "Swift_headlineText", "bodyText", "getBodyText", "Swift_bodyText", "platformPayButtonTitle", "getPlatformPayButtonTitle", "Swift_platformPayButtonTitle", "platformPayIcon", "Lcom/polymarket/designtokens/Icon;", "getPlatformPayIcon", "()Lcom/polymarket/designtokens/Icon;", "Swift_platformPayIcon", "instantLabelText", "getInstantLabelText", "Swift_instantLabelText", "methodsTitleText", "getMethodsTitleText", "Swift_methodsTitleText", "methods", "", "getMethods", "()Ljava/util/List;", "Swift_methods", "methodTitle", "for_", "Swift_methodTitle_0", "option", "promotionBanner", "Lcom/polymarket/usviewmodels/PromotionsViewModel$OfferPresentation;", "getPromotionBanner", "()Lcom/polymarket/usviewmodels/PromotionsViewModel$OfferPresentation;", "Swift_promotionBanner", "setup", "Swift_setup_2", "subtitle", "Swift_subtitle_3", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$Input;", "Swift_sendInput_4", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "PaymentOption", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PreDepositProfileViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ PreDepositProfileViewModel(EUser eUser, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eUser, (i & 2) != 0 ? new Callbacks(null, null, null, null, null, null, 63, null) : callbacks);
    }

    private final native boolean Swift_acceptsCreditCards(long Swift_peer);

    private final native void Swift_acceptsCreditCards_set(long Swift_peer, boolean value);

    private final native String Swift_bodyText(long Swift_peer);

    private final native String Swift_bonusAmountText(long Swift_peer);

    private final native EThemeSettings.Appearance Swift_currentTheme(long Swift_peer);

    private final native void Swift_currentTheme_set(long Swift_peer, EThemeSettings.Appearance value);

    private final native EDefaultDepositLimits Swift_defaultDepositLimits(long Swift_peer);

    private final native boolean Swift_hasDepositablePayPal(long Swift_peer);

    private final native void Swift_hasDepositablePayPal_set(long Swift_peer, boolean value);

    private final native boolean Swift_hasDepositableVenmo(long Swift_peer);

    private final native void Swift_hasDepositableVenmo_set(long Swift_peer, boolean value);

    private final native String Swift_headlineText(long Swift_peer);

    private final native String Swift_instantLabelText(long Swift_peer);

    private final native boolean Swift_isPayPalLinkEnabled(long Swift_peer);

    private final native void Swift_isPayPalLinkEnabled_set(long Swift_peer, boolean value);

    private final native boolean Swift_isPlatformPayAvailable(long Swift_peer);

    private final native void Swift_isPlatformPayAvailable_set(long Swift_peer, boolean value);

    private final native boolean Swift_isVenmoLinkEnabled(long Swift_peer);

    private final native void Swift_isVenmoLinkEnabled_set(long Swift_peer, boolean value);

    private final native PaymentOption Swift_linkingMethod(long Swift_peer);

    private final native void Swift_linkingMethod_set(long Swift_peer, PaymentOption value);

    private final native String Swift_methodTitle_0(long Swift_peer, PaymentOption option);

    private final native List<PaymentOption> Swift_methods(long Swift_peer);

    private final native String Swift_methodsTitleText(long Swift_peer);

    private final native String Swift_navTitleText(long Swift_peer);

    private final native String Swift_platformPayButtonTitle(long Swift_peer);

    private final native Icon Swift_platformPayIcon(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native PromotionsViewModel.OfferPresentation Swift_promotionBanner(long Swift_peer);

    private final native void Swift_sendInput_4(long Swift_peer, Input input);

    private final native void Swift_setup_2(long Swift_peer);

    private final native String Swift_subtitle_3(long Swift_peer, PaymentOption option);

    private final native EUser Swift_user(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final boolean getAcceptsCreditCards() {
        return Swift_acceptsCreditCards(getSwift_peer());
    }

    public final String getBodyText() {
        return Swift_bodyText(getSwift_peer());
    }

    public final String getBonusAmountText() {
        return Swift_bonusAmountText(getSwift_peer());
    }

    public final EThemeSettings.Appearance getCurrentTheme() {
        return Swift_currentTheme(getSwift_peer());
    }

    public final EDefaultDepositLimits getDefaultDepositLimits() {
        return Swift_defaultDepositLimits(getSwift_peer());
    }

    public final boolean getHasDepositablePayPal() {
        return Swift_hasDepositablePayPal(getSwift_peer());
    }

    public final boolean getHasDepositableVenmo() {
        return Swift_hasDepositableVenmo(getSwift_peer());
    }

    public final String getHeadlineText() {
        return Swift_headlineText(getSwift_peer());
    }

    public final String getInstantLabelText() {
        return Swift_instantLabelText(getSwift_peer());
    }

    public final PaymentOption getLinkingMethod() {
        return Swift_linkingMethod(getSwift_peer());
    }

    public final List<PaymentOption> getMethods() {
        return Swift_methods(getSwift_peer());
    }

    public final String getMethodsTitleText() {
        return Swift_methodsTitleText(getSwift_peer());
    }

    public final String getNavTitleText() {
        return Swift_navTitleText(getSwift_peer());
    }

    public final String getPlatformPayButtonTitle() {
        return Swift_platformPayButtonTitle(getSwift_peer());
    }

    public final Icon getPlatformPayIcon() {
        return Swift_platformPayIcon(getSwift_peer());
    }

    public final PromotionsViewModel.OfferPresentation getPromotionBanner() {
        return Swift_promotionBanner(getSwift_peer());
    }

    public final EUser getUser() {
        return Swift_user(getSwift_peer());
    }

    public final boolean isPayPalLinkEnabled() {
        return Swift_isPayPalLinkEnabled(getSwift_peer());
    }

    public final boolean isPlatformPayAvailable() {
        return Swift_isPlatformPayAvailable(getSwift_peer());
    }

    public final boolean isVenmoLinkEnabled() {
        return Swift_isVenmoLinkEnabled(getSwift_peer());
    }

    public final String methodTitle(PaymentOption for_) {
        for_.getClass();
        return Swift_methodTitle_0(getSwift_peer(), for_);
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_4(getSwift_peer(), input);
    }

    public final void setAcceptsCreditCards(boolean z) {
        Swift_acceptsCreditCards_set(getSwift_peer(), z);
    }

    public final void setCurrentTheme(EThemeSettings.Appearance appearance) {
        appearance.getClass();
        Swift_currentTheme_set(getSwift_peer(), appearance);
    }

    public final void setHasDepositablePayPal(boolean z) {
        Swift_hasDepositablePayPal_set(getSwift_peer(), z);
    }

    public final void setHasDepositableVenmo(boolean z) {
        Swift_hasDepositableVenmo_set(getSwift_peer(), z);
    }

    public final void setLinkingMethod(PaymentOption paymentOption) {
        Swift_linkingMethod_set(getSwift_peer(), paymentOption);
    }

    public final void setPayPalLinkEnabled(boolean z) {
        Swift_isPayPalLinkEnabled_set(getSwift_peer(), z);
    }

    public final void setPlatformPayAvailable(boolean z) {
        Swift_isPlatformPayAvailable_set(getSwift_peer(), z);
    }

    public final void setVenmoLinkEnabled(boolean z) {
        Swift_isVenmoLinkEnabled_set(getSwift_peer(), z);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_2(getSwift_peer());
    }

    public final String subtitle(PaymentOption for_) {
        for_.getClass();
        return Swift_subtitle_3(getSwift_peer(), for_);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\u0005\u0011\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnPlatformPayDepositCase", "OnMethodSelectedCase", "OnLinkedPaymentMethodCompletedCase", "OnSettingsCase", "Companion", "Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$Input$OnLinkedPaymentMethodCompletedCase;", "Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$Input$OnMethodSelectedCase;", "Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$Input$OnPlatformPayDepositCase;", "Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$Input$OnSettingsCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onPlatformPayDeposit = new OnPlatformPayDepositCase();
        private static final Input onSettings = new OnSettingsCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$Input$OnLinkedPaymentMethodCompletedCase;", "Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$Input;", "associated0", "Lcom/polymarket/data/EPaymentMethod;", "<init>", "(Lcom/polymarket/data/EPaymentMethod;)V", "getAssociated0", "()Lcom/polymarket/data/EPaymentMethod;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnLinkedPaymentMethodCompletedCase extends Input {
            private final EPaymentMethod associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnLinkedPaymentMethodCompletedCase(EPaymentMethod ePaymentMethod) {
                super(null);
                ePaymentMethod.getClass();
                this.associated0 = ePaymentMethod;
            }

            public final EPaymentMethod getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$Input$OnMethodSelectedCase;", "Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$PaymentOption;", "<init>", "(Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$PaymentOption;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$PaymentOption;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnMethodSelectedCase extends Input {
            private final PaymentOption associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnMethodSelectedCase(PaymentOption paymentOption) {
                super(null);
                paymentOption.getClass();
                this.associated0 = paymentOption;
            }

            public final PaymentOption getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$Input$OnPlatformPayDepositCase;", "Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPlatformPayDepositCase extends Input {
            public OnPlatformPayDepositCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$Input$OnSettingsCase;", "Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSettingsCase extends Input {
            public OnSettingsCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnPlatformPayDeposit$cp() {
            return onPlatformPayDeposit;
        }

        public static final /* synthetic */ Input access$getOnSettings$cp() {
            return onSettings;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$Input$Companion;", "", "<init>", "()V", "onPlatformPayDeposit", "Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$Input;", "getOnPlatformPayDeposit", "()Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$Input;", "onMethodSelected", "associated0", "Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$PaymentOption;", "onLinkedPaymentMethodCompleted", "Lcom/polymarket/data/EPaymentMethod;", "onSettings", "getOnSettings", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnPlatformPayDeposit() {
                return Input.access$getOnPlatformPayDeposit$cp();
            }

            public final Input getOnSettings() {
                return Input.access$getOnSettings$cp();
            }

            public final Input onLinkedPaymentMethodCompleted(EPaymentMethod associated0) {
                associated0.getClass();
                return new OnLinkedPaymentMethodCompletedCase(associated0);
            }

            public final Input onMethodSelected(PaymentOption associated0) {
                associated0.getClass();
                return new OnMethodSelectedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 !2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001!B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0082 J\u0011\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\rH\u0082 J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u001d\u0010\u001a\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0082 J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0082 R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\""}, d2 = {"Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$PaymentOption;", "Lskip/lib/CaseIterable;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "platformPay", PlaceTypes.BANK, "card", "paypal", "venmo", "wire", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "getTitle", "()Ljava/lang/String;", "Swift_title", Keys.KEY_NAME, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ICON, "Lcom/polymarket/designtokens/Icon;", "getIcon", "()Lcom/polymarket/designtokens/Icon;", "Swift_icon", "subtitle", "defaultLimits", "Lcom/polymarket/data/EDefaultDepositLimits;", "Swift_subtitle_0", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class PaymentOption implements CaseIterable, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ PaymentOption[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final PaymentOption platformPay = new PaymentOption("platformPay", 0);
        public static final PaymentOption bank = new PaymentOption(PlaceTypes.BANK, 1);
        public static final PaymentOption card = new PaymentOption("card", 2);
        public static final PaymentOption paypal = new PaymentOption("paypal", 3);
        public static final PaymentOption venmo = new PaymentOption("venmo", 4);
        public static final PaymentOption wire = new PaymentOption("wire", 5);

        private static final /* synthetic */ PaymentOption[] $values() {
            return new PaymentOption[]{platformPay, bank, card, paypal, venmo, wire};
        }

        static {
            PaymentOption[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private PaymentOption(String str, int i) {
        }

        private final native Icon Swift_icon(String name);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native String Swift_subtitle_0(String name, EDefaultDepositLimits defaultLimits);

        private final native String Swift_title(String name);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static PaymentOption valueOf(String str) {
            return (PaymentOption) Enum.valueOf(PaymentOption.class, str);
        }

        public static PaymentOption[] values() {
            return (PaymentOption[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final Icon getIcon() {
            return Swift_icon(name());
        }

        public final String getTitle() {
            return Swift_title(name());
        }

        public final String subtitle(EDefaultDepositLimits defaultLimits) {
            return Swift_subtitle_0(name(), defaultLimits);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\t\u001a\u00020\u0006H\u0082 J\t\u0010\u000e\u001a\u00020\u000bH\u0082 R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$PaymentOption$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$PaymentOption;", "<init>", "()V", "platformPayTitle", "", "getPlatformPayTitle", "()Ljava/lang/String;", "Swift_Companion_platformPayTitle", "platformPayIcon", "Lcom/polymarket/designtokens/Icon;", "getPlatformPayIcon", "()Lcom/polymarket/designtokens/Icon;", "Swift_Companion_platformPayIcon", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion implements CaseIterableCompanion<PaymentOption> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final native Icon Swift_Companion_platformPayIcon();

            private final native String Swift_Companion_platformPayTitle();

            @Override // skip.lib.CaseIterableCompanion
            public Array<PaymentOption> getAllCases() {
                return ArrayKt.arrayOf(PaymentOption.platformPay, PaymentOption.bank, PaymentOption.card, PaymentOption.paypal, PaymentOption.venmo, PaymentOption.wire);
            }

            public final Icon getPlatformPayIcon() {
                return Swift_Companion_platformPayIcon();
            }

            public final String getPlatformPayTitle() {
                return Swift_Companion_platformPayTitle();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082 J\u001a\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eJ\u0019\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082 ¨\u0006\u0011"}, d2 = {"Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_1", "", "Lskip/bridge/SwiftObjectPointer;", "user", "Lcom/polymarket/data/EUser;", "callbacks", "Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/PreDepositProfileViewModel;", "platformPayIsAvailable", "", "displayPromo", "Swift_Companion_mock_5", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_1(EUser user, Callbacks callbacks);

        private final native PreDepositProfileViewModel Swift_Companion_mock_5(boolean platformPayIsAvailable, boolean displayPromo);

        public static final /* synthetic */ long access$Swift_Companion_constructor_1(Companion companion, EUser eUser, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_1(eUser, callbacks);
        }

        public static /* synthetic */ PreDepositProfileViewModel mock$default(Companion companion, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            return companion.mock(z, z2);
        }

        public final PreDepositProfileViewModel mock(boolean platformPayIsAvailable, boolean displayPromo) {
            return Swift_Companion_mock_5(platformPayIsAvailable, displayPromo);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreDepositProfileViewModel(EUser eUser, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_1(INSTANCE, eUser, callbacks), (SwiftPeerMarker) null);
        eUser.getClass();
        callbacks.getClass();
    }

    public PreDepositProfileViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB{\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u000f\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\b\u0010\u0016J\u0006\u0010\u001b\u001a\u00020\fJ\u0015\u0010\u001c\u001a\u00020\f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u00100\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 Js\u00101\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082 J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020 0\u000b2\u0006\u00103\u001a\u00020\"H\u0016J\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020 0\u000b2\u0006\u00103\u001a\u00020\"H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000f8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u000f8F¢\u0006\u0006\u001a\u0004\b+\u0010)R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u000f8F¢\u0006\u0006\u001a\u0004\b-\u0010)R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b/\u0010$¨\u00066"}, d2 = {"Lcom/polymarket/usviewmodels/PreDepositProfileViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onReadyToDeposit", "Lkotlin/Function0;", "", "onCardLinkRequired", "onShowWireDetails", "Lkotlin/Function1;", "Lcom/polymarket/data/EWireDetails;", "onBankLinkRequiresMFA", "Lcom/polymarket/data/EMFAData;", "onBankLinkRequiresSelection", "Lcom/polymarket/data/ELinkedAccount;", "onSettings", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnReadyToDeposit", "()Lkotlin/jvm/functions/Function0;", "Swift_onReadyToDeposit", "getOnCardLinkRequired", "Swift_onCardLinkRequired", "getOnShowWireDetails", "()Lkotlin/jvm/functions/Function1;", "Swift_onShowWireDetails", "getOnBankLinkRequiresMFA", "Swift_onBankLinkRequiresMFA", "getOnBankLinkRequiresSelection", "Swift_onBankLinkRequiresSelection", "getOnSettings", "Swift_onSettings", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function0 function0, Function0 function02, Function1 function1, Function1 function12, Function1 function13, Function0 function03, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new nje(21) : function0, (i & 2) != 0 ? new nje(22) : function02, (i & 4) != 0 ? new rye(6) : function1, (i & 8) != 0 ? new rye(7) : function12, (i & 16) != 0 ? new rye(8) : function13, (i & 32) != 0 ? new nje(23) : function03);
        }

        private final native long Swift_constructor_0(Function0<Unit> onReadyToDeposit, Function0<Unit> onCardLinkRequired, Function1<? super EWireDetails, Unit> onShowWireDetails, Function1<? super EMFAData, Unit> onBankLinkRequiresMFA, Function1<? super ELinkedAccount, Unit> onBankLinkRequiresSelection, Function0<Unit> onSettings);

        private final native Function1<EMFAData, Unit> Swift_onBankLinkRequiresMFA(long Swift_peer);

        private final native Function1<ELinkedAccount, Unit> Swift_onBankLinkRequiresSelection(long Swift_peer);

        private final native Function0<Unit> Swift_onCardLinkRequired(long Swift_peer);

        private final native Function0<Unit> Swift_onReadyToDeposit(long Swift_peer);

        private final native Function0<Unit> Swift_onSettings(long Swift_peer);

        private final native Function1<EWireDetails, Unit> Swift_onShowWireDetails(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2(EWireDetails eWireDetails) {
            eWireDetails.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$3(EMFAData eMFAData) {
            eMFAData.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$4(ELinkedAccount eLinkedAccount) {
            eLinkedAccount.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$5() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(ELinkedAccount eLinkedAccount) {
            return _init_$lambda$4(eLinkedAccount);
        }

        public static /* synthetic */ Unit b(EMFAData eMFAData) {
            return _init_$lambda$3(eMFAData);
        }

        public static /* synthetic */ Unit c(EWireDetails eWireDetails) {
            return _init_$lambda$2(eWireDetails);
        }

        public static /* synthetic */ Unit d() {
            return _init_$lambda$5();
        }

        public static /* synthetic */ Unit e() {
            return _init_$lambda$1();
        }

        public static /* synthetic */ Unit f() {
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

        public final Function1<EMFAData, Unit> getOnBankLinkRequiresMFA() {
            return Swift_onBankLinkRequiresMFA(this.Swift_peer);
        }

        public final Function1<ELinkedAccount, Unit> getOnBankLinkRequiresSelection() {
            return Swift_onBankLinkRequiresSelection(this.Swift_peer);
        }

        public final Function0<Unit> getOnCardLinkRequired() {
            return Swift_onCardLinkRequired(this.Swift_peer);
        }

        public final Function0<Unit> getOnReadyToDeposit() {
            return Swift_onReadyToDeposit(this.Swift_peer);
        }

        public final Function0<Unit> getOnSettings() {
            return Swift_onSettings(this.Swift_peer);
        }

        public final Function1<EWireDetails, Unit> getOnShowWireDetails() {
            return Swift_onShowWireDetails(this.Swift_peer);
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

        public Callbacks(Function0<Unit> function0, Function0<Unit> function02, Function1<? super EWireDetails, Unit> function1, Function1<? super EMFAData, Unit> function12, Function1<? super ELinkedAccount, Unit> function13, Function0<Unit> function03) {
            function0.getClass();
            function02.getClass();
            function1.getClass();
            function12.getClass();
            function13.getClass();
            function03.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function0, function02, function1, function12, function13, function03);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
