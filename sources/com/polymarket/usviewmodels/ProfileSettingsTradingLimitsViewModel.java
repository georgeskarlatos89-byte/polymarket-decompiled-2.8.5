package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.d5f;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\bD\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 p2\u00020\u0001:\u0003nopB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u0015\u0010\u0013\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u0014\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020\rH\u0082 J\u0015\u0010\u001a\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u001b\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020\rH\u0082 J\u0015\u0010\u001f\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010 \u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020\rH\u0082 J\u0015\u0010&\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010'\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020!H\u0082 J\u0015\u0010*\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010+\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020!H\u0082 J\u0015\u0010/\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u00100\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020!H\u0082 J\u0017\u00103\u001a\u0004\u0018\u00010\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u00106\u001a\u0004\u0018\u00010\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u00109\u001a\u0004\u0018\u00010\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010<\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010?\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010B\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010E\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010H\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010K\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010N\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010Q\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010T\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010W\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010Z\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010]\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010`\u001a\u0004\u0018\u00010\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010c\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010d\u001a\u00020\u00152\u0006\u0010e\u001a\u00020fJ\u001d\u0010g\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010e\u001a\u00020fH\u0082 J\u0016\u0010h\u001a\b\u0012\u0004\u0012\u00020j0i2\u0006\u0010k\u001a\u00020lH\u0016J\u0017\u0010m\u001a\b\u0012\u0004\u0012\u00020j0i2\u0006\u0010k\u001a\u00020lH\u0082 R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0017\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012R$\u0010\u001c\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R$\u0010\"\u001a\u00020!2\u0006\u0010\f\u001a\u00020!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010(\u001a\u00020!2\u0006\u0010\f\u001a\u00020!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R$\u0010,\u001a\u00020!2\u0006\u0010\f\u001a\u00020!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010#\"\u0004\b.\u0010%R\u0013\u00101\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b2\u0010\u0010R\u0013\u00104\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b5\u0010\u0010R\u0013\u00107\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b8\u0010\u0010R\u0011\u0010:\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b;\u0010\u0010R\u0011\u0010=\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b>\u0010\u0010R\u0011\u0010@\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bA\u0010\u0010R\u0011\u0010C\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bD\u0010\u0010R\u0011\u0010F\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bG\u0010\u0010R\u0011\u0010I\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bJ\u0010\u0010R\u0011\u0010L\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bM\u0010\u0010R\u0011\u0010O\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bP\u0010\u0010R\u0011\u0010R\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bS\u0010\u0010R\u0011\u0010U\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bV\u0010\u0010R\u0011\u0010X\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bY\u0010\u0010R\u0011\u0010[\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\\\u0010\u0010R\u0013\u0010^\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b_\u0010\u0010R\u0011\u0010a\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bb\u0010\u0010¨\u0006q"}, d2 = {"Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "callbacks", "Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Callbacks;)V", "newValue", "", "dailyLimit", "getDailyLimit", "()Ljava/lang/String;", "setDailyLimit", "(Ljava/lang/String;)V", "Swift_dailyLimit", "Swift_dailyLimit_set", "", "value", "weeklyLimit", "getWeeklyLimit", "setWeeklyLimit", "Swift_weeklyLimit", "Swift_weeklyLimit_set", "monthlyLimit", "getMonthlyLimit", "setMonthlyLimit", "Swift_monthlyLimit", "Swift_monthlyLimit_set", "", "isConfirmationVisible", "()Z", "setConfirmationVisible", "(Z)V", "Swift_isConfirmationVisible", "Swift_isConfirmationVisible_set", "isConfirming", "setConfirming", "Swift_isConfirming", "Swift_isConfirming_set", "hasLoadedData", "getHasLoadedData", "setHasLoadedData", "Swift_hasLoadedData", "Swift_hasLoadedData_set", "dailyPendingDetail", "getDailyPendingDetail", "Swift_dailyPendingDetail", "weeklyPendingDetail", "getWeeklyPendingDetail", "Swift_weeklyPendingDetail", "monthlyPendingDetail", "getMonthlyPendingDetail", "Swift_monthlyPendingDetail", "navTitle", "getNavTitle", "Swift_navTitle", "subtitle", "getSubtitle", "Swift_subtitle", "dailyLabelTitle", "getDailyLabelTitle", "Swift_dailyLabelTitle", "dailyLabelSubtitle", "getDailyLabelSubtitle", "Swift_dailyLabelSubtitle", "weeklyLabelTitle", "getWeeklyLabelTitle", "Swift_weeklyLabelTitle", "weeklyLabelSubtitle", "getWeeklyLabelSubtitle", "Swift_weeklyLabelSubtitle", "monthlyLabelTitle", "getMonthlyLabelTitle", "Swift_monthlyLabelTitle", "monthlyLabelSubtitle", "getMonthlyLabelSubtitle", "Swift_monthlyLabelSubtitle", "placeholder", "getPlaceholder", "Swift_placeholder", "continueButtonTitle", "getContinueButtonTitle", "Swift_continueButtonTitle", "confirmationTitle", "getConfirmationTitle", "Swift_confirmationTitle", "confirmationBody", "getConfirmationBody", "Swift_confirmationBody", "zeroLimitWarning", "getZeroLimitWarning", "Swift_zeroLimitWarning", "confirmButtonTitle", "getConfirmButtonTitle", "Swift_confirmButtonTitle", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Input;", "Swift_sendInput_1", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProfileSettingsTradingLimitsViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileSettingsTradingLimitsViewModel(Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, callbacks), (SwiftPeerMarker) null);
        callbacks.getClass();
    }

    private final native String Swift_confirmButtonTitle(long Swift_peer);

    private final native String Swift_confirmationBody(long Swift_peer);

    private final native String Swift_confirmationTitle(long Swift_peer);

    private final native String Swift_continueButtonTitle(long Swift_peer);

    private final native String Swift_dailyLabelSubtitle(long Swift_peer);

    private final native String Swift_dailyLabelTitle(long Swift_peer);

    private final native String Swift_dailyLimit(long Swift_peer);

    private final native void Swift_dailyLimit_set(long Swift_peer, String value);

    private final native String Swift_dailyPendingDetail(long Swift_peer);

    private final native boolean Swift_hasLoadedData(long Swift_peer);

    private final native void Swift_hasLoadedData_set(long Swift_peer, boolean value);

    private final native boolean Swift_isConfirmationVisible(long Swift_peer);

    private final native void Swift_isConfirmationVisible_set(long Swift_peer, boolean value);

    private final native boolean Swift_isConfirming(long Swift_peer);

    private final native void Swift_isConfirming_set(long Swift_peer, boolean value);

    private final native String Swift_monthlyLabelSubtitle(long Swift_peer);

    private final native String Swift_monthlyLabelTitle(long Swift_peer);

    private final native String Swift_monthlyLimit(long Swift_peer);

    private final native void Swift_monthlyLimit_set(long Swift_peer, String value);

    private final native String Swift_monthlyPendingDetail(long Swift_peer);

    private final native String Swift_navTitle(long Swift_peer);

    private final native String Swift_placeholder(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_sendInput_1(long Swift_peer, Input input);

    private final native String Swift_subtitle(long Swift_peer);

    private final native String Swift_weeklyLabelSubtitle(long Swift_peer);

    private final native String Swift_weeklyLabelTitle(long Swift_peer);

    private final native String Swift_weeklyLimit(long Swift_peer);

    private final native void Swift_weeklyLimit_set(long Swift_peer, String value);

    private final native String Swift_weeklyPendingDetail(long Swift_peer);

    private final native String Swift_zeroLimitWarning(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String getConfirmButtonTitle() {
        return Swift_confirmButtonTitle(getSwift_peer());
    }

    public final String getConfirmationBody() {
        return Swift_confirmationBody(getSwift_peer());
    }

    public final String getConfirmationTitle() {
        return Swift_confirmationTitle(getSwift_peer());
    }

    public final String getContinueButtonTitle() {
        return Swift_continueButtonTitle(getSwift_peer());
    }

    public final String getDailyLabelSubtitle() {
        return Swift_dailyLabelSubtitle(getSwift_peer());
    }

    public final String getDailyLabelTitle() {
        return Swift_dailyLabelTitle(getSwift_peer());
    }

    public final String getDailyLimit() {
        return Swift_dailyLimit(getSwift_peer());
    }

    public final String getDailyPendingDetail() {
        return Swift_dailyPendingDetail(getSwift_peer());
    }

    public final boolean getHasLoadedData() {
        return Swift_hasLoadedData(getSwift_peer());
    }

    public final String getMonthlyLabelSubtitle() {
        return Swift_monthlyLabelSubtitle(getSwift_peer());
    }

    public final String getMonthlyLabelTitle() {
        return Swift_monthlyLabelTitle(getSwift_peer());
    }

    public final String getMonthlyLimit() {
        return Swift_monthlyLimit(getSwift_peer());
    }

    public final String getMonthlyPendingDetail() {
        return Swift_monthlyPendingDetail(getSwift_peer());
    }

    public final String getNavTitle() {
        return Swift_navTitle(getSwift_peer());
    }

    public final String getPlaceholder() {
        return Swift_placeholder(getSwift_peer());
    }

    public final String getSubtitle() {
        return Swift_subtitle(getSwift_peer());
    }

    public final String getWeeklyLabelSubtitle() {
        return Swift_weeklyLabelSubtitle(getSwift_peer());
    }

    public final String getWeeklyLabelTitle() {
        return Swift_weeklyLabelTitle(getSwift_peer());
    }

    public final String getWeeklyLimit() {
        return Swift_weeklyLimit(getSwift_peer());
    }

    public final String getWeeklyPendingDetail() {
        return Swift_weeklyPendingDetail(getSwift_peer());
    }

    public final String getZeroLimitWarning() {
        return Swift_zeroLimitWarning(getSwift_peer());
    }

    public final boolean isConfirmationVisible() {
        return Swift_isConfirmationVisible(getSwift_peer());
    }

    public final boolean isConfirming() {
        return Swift_isConfirming(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_1(getSwift_peer(), input);
    }

    public final void setConfirmationVisible(boolean z) {
        Swift_isConfirmationVisible_set(getSwift_peer(), z);
    }

    public final void setConfirming(boolean z) {
        Swift_isConfirming_set(getSwift_peer(), z);
    }

    public final void setDailyLimit(String str) {
        str.getClass();
        Swift_dailyLimit_set(getSwift_peer(), str);
    }

    public final void setHasLoadedData(boolean z) {
        Swift_hasLoadedData_set(getSwift_peer(), z);
    }

    public final void setMonthlyLimit(String str) {
        str.getClass();
        Swift_monthlyLimit_set(getSwift_peer(), str);
    }

    public final void setWeeklyLimit(String str) {
        str.getClass();
        Swift_weeklyLimit_set(getSwift_peer(), str);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00182\u00020\u0001:\b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0007\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnDailyLimitChangedCase", "OnWeeklyLimitChangedCase", "OnMonthlyLimitChangedCase", "OnContinueCase", "OnConfirmCase", "OnDismissConfirmationCase", "Companion", "Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Input$OnConfirmCase;", "Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Input$OnContinueCase;", "Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Input$OnDailyLimitChangedCase;", "Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Input$OnDismissConfirmationCase;", "Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Input$OnMonthlyLimitChangedCase;", "Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Input$OnWeeklyLimitChangedCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onContinue = new OnContinueCase();
        private static final Input onConfirm = new OnConfirmCase();
        private static final Input onDismissConfirmation = new OnDismissConfirmationCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Input$OnConfirmCase;", "Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnConfirmCase extends Input {
            public OnConfirmCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Input$OnContinueCase;", "Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnContinueCase extends Input {
            public OnContinueCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Input$OnDailyLimitChangedCase;", "Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDailyLimitChangedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnDailyLimitChangedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Input$OnDismissConfirmationCase;", "Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDismissConfirmationCase extends Input {
            public OnDismissConfirmationCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Input$OnMonthlyLimitChangedCase;", "Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnMonthlyLimitChangedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnMonthlyLimitChangedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidLoadCase extends Input {
            public OnViewDidLoadCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Input$OnWeeklyLimitChangedCase;", "Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnWeeklyLimitChangedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnWeeklyLimitChangedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnConfirm$cp() {
            return onConfirm;
        }

        public static final /* synthetic */ Input access$getOnContinue$cp() {
            return onContinue;
        }

        public static final /* synthetic */ Input access$getOnDismissConfirmation$cp() {
            return onDismissConfirmation;
        }

        public static final /* synthetic */ Input access$getOnViewDidLoad$cp() {
            return onViewDidLoad;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Input;", "onDailyLimitChanged", "associated0", "", "onWeeklyLimitChanged", "onMonthlyLimitChanged", "onContinue", "getOnContinue", "onConfirm", "getOnConfirm", "onDismissConfirmation", "getOnDismissConfirmation", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnConfirm() {
                return Input.access$getOnConfirm$cp();
            }

            public final Input getOnContinue() {
                return Input.access$getOnContinue$cp();
            }

            public final Input getOnDismissConfirmation() {
                return Input.access$getOnDismissConfirmation$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input onDailyLimitChanged(String associated0) {
                associated0.getClass();
                return new OnDailyLimitChangedCase(associated0);
            }

            public final Input onMonthlyLimitChanged(String associated0) {
                associated0.getClass();
                return new OnMonthlyLimitChangedCase(associated0);
            }

            public final Input onWeeklyLimitChanged(String associated0) {
                associated0.getClass();
                return new OnWeeklyLimitChangedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0082 J\u0006\u0010\t\u001a\u00020\nJ\t\u0010\u000b\u001a\u00020\nH\u0082 ¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "callbacks", "Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel;", "Swift_Companion_mock_2", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(Callbacks callbacks);

        private final native ProfileSettingsTradingLimitsViewModel Swift_Companion_mock_2();

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(callbacks);
        }

        public final ProfileSettingsTradingLimitsViewModel mock() {
            return Swift_Companion_mock_2();
        }

        private Companion() {
        }
    }

    public ProfileSettingsTradingLimitsViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    public /* synthetic */ ProfileSettingsTradingLimitsViewModel(Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Callbacks(null, 1, null) : callbacks);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\b\u0010\rJ\u0006\u0010\u0012\u001a\u00020\fJ\u0015\u0010\u0013\u001a\u00020\f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001b\u0010\u001a\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082 J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\u0006\u0010\u001c\u001a\u00020\u0019H\u0016J\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\u0006\u0010\u001c\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/polymarket/usviewmodels/ProfileSettingsTradingLimitsViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onConfirm", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Callbacks(Function0<Unit> function0) {
            function0.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function0);
        }

        private final native long Swift_constructor_0(Function0<Unit> onConfirm);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a() {
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

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ Callbacks(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new d5f(16) : function0);
        }
    }
}
