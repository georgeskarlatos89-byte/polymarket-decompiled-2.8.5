package com.polymarket.usviewmodels;

import com.polymarket.data.TextFieldConfig;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.ug7;
import defpackage.vvf;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 W2\u00020\u0001:\u0004TUVWB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB%\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0007\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u0016\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010\u001f\u001a\u00020 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u0018H\u0082 J\u0015\u0010'\u001a\u00020\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010(\u001a\u00020 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010!\u001a\u00020\"H\u0082 J\u0015\u0010+\u001a\u00020\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010,\u001a\u00020 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010!\u001a\u00020\"H\u0082 J\u0015\u00103\u001a\u00020-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u00104\u001a\u00020 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010!\u001a\u00020-H\u0082 J\u0015\u00108\u001a\u00020\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u00109\u001a\u00020 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010!\u001a\u00020\"H\u0082 J\u0015\u0010<\u001a\u00020\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010=\u001a\u00020 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010!\u001a\u00020\"H\u0082 J\u0015\u0010?\u001a\u00020\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010B\u001a\u00020\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010E\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010H\u001a\u00020\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010I\u001a\u00020 H\u0016J\u0015\u0010J\u001a\u00020 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010K\u001a\u00020 2\u0006\u0010L\u001a\u00020MJ\u001d\u0010N\u001a\u00020 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010L\u001a\u00020MH\u0082 J\u0016\u0010O\u001a\b\u0012\u0004\u0012\u00020Q0P2\u0006\u0010R\u001a\u00020-H\u0016J\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020Q0P2\u0006\u0010R\u001a\u00020-H\u0082 R\u0011\u0010\u0010\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R0\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010#\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\"8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010)\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\"8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R$\u0010.\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020-8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00105\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\"8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010$\"\u0004\b7\u0010&R$\u0010:\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\"8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010$\"\u0004\b;\u0010&R\u0011\u0010>\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b>\u0010$R\u0011\u0010@\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\bA\u0010$R\u0011\u0010C\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bD\u0010\u0012R\u0011\u0010F\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\bG\u0010$¨\u0006X"}, d2 = {"Lcom/polymarket/usviewmodels/SMSMFACodeViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "context", "Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Context;", "last4", "", "callbacks", "Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Context;Ljava/lang/String;Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Callbacks;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "()Ljava/lang/String;", "Swift_title", "subtitle", "getSubtitle", "Swift_subtitle", "newValue", "Lcom/polymarket/data/TextFieldConfig;", "smsCode", "getSmsCode", "()Lcom/polymarket/data/TextFieldConfig;", "setSmsCode", "(Lcom/polymarket/data/TextFieldConfig;)V", "Swift_smsCode", "Swift_smsCode_set", "", "value", "", "isLoading", "()Z", "setLoading", "(Z)V", "Swift_isLoading", "Swift_isLoading_set", "isResending", "setResending", "Swift_isResending", "Swift_isResending_set", "", "resendTimeRemaining", "getResendTimeRemaining", "()I", "setResendTimeRemaining", "(I)V", "Swift_resendTimeRemaining", "Swift_resendTimeRemaining_set", "didError", "getDidError", "setDidError", "Swift_didError", "Swift_didError_set", "isFirstResponder", "setFirstResponder", "Swift_isFirstResponder", "Swift_isFirstResponder_set", "isSMSCodeValid", "Swift_isSMSCodeValid", "canResend", "getCanResend", "Swift_canResend", "smsCodeDigits", "getSmsCodeDigits", "Swift_smsCodeDigits", "showSettingsButton", "getShowSettingsButton", "Swift_showSettingsButton", "setup", "Swift_setup_1", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Input;", "Swift_sendInput_2", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Callbacks", "Context", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SMSMFACodeViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Context;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "login", "kycBypass", "onboarding", "reverify", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Context implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Context[] $VALUES;
        public static final Context login = new Context("login", 0);
        public static final Context kycBypass = new Context("kycBypass", 1);
        public static final Context onboarding = new Context("onboarding", 2);
        public static final Context reverify = new Context("reverify", 3);

        private static final /* synthetic */ Context[] $values() {
            return new Context[]{login, kycBypass, onboarding, reverify};
        }

        static {
            Context[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Context(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Context valueOf(String str) {
            return (Context) Enum.valueOf(Context.class, str);
        }

        public static Context[] values() {
            return (Context[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    public /* synthetic */ SMSMFACodeViewModel(Context context, String str, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? new Callbacks(null, null, null, 7, null) : callbacks);
    }

    private final native boolean Swift_canResend(long Swift_peer);

    private final native boolean Swift_didError(long Swift_peer);

    private final native void Swift_didError_set(long Swift_peer, boolean value);

    private final native boolean Swift_isFirstResponder(long Swift_peer);

    private final native void Swift_isFirstResponder_set(long Swift_peer, boolean value);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native void Swift_isLoading_set(long Swift_peer, boolean value);

    private final native boolean Swift_isResending(long Swift_peer);

    private final native void Swift_isResending_set(long Swift_peer, boolean value);

    private final native boolean Swift_isSMSCodeValid(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native int Swift_resendTimeRemaining(long Swift_peer);

    private final native void Swift_resendTimeRemaining_set(long Swift_peer, int value);

    private final native void Swift_sendInput_2(long Swift_peer, Input input);

    private final native void Swift_setup_1(long Swift_peer);

    private final native boolean Swift_showSettingsButton(long Swift_peer);

    private final native TextFieldConfig<String> Swift_smsCode(long Swift_peer);

    private final native String Swift_smsCodeDigits(long Swift_peer);

    private final native void Swift_smsCode_set(long Swift_peer, TextFieldConfig<String> value);

    private final native String Swift_subtitle(long Swift_peer);

    private final native String Swift_title(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final boolean getCanResend() {
        return Swift_canResend(getSwift_peer());
    }

    public final boolean getDidError() {
        return Swift_didError(getSwift_peer());
    }

    public final int getResendTimeRemaining() {
        return Swift_resendTimeRemaining(getSwift_peer());
    }

    public final boolean getShowSettingsButton() {
        return Swift_showSettingsButton(getSwift_peer());
    }

    public final TextFieldConfig<String> getSmsCode() {
        return Swift_smsCode(getSwift_peer());
    }

    public final String getSmsCodeDigits() {
        return Swift_smsCodeDigits(getSwift_peer());
    }

    public final String getSubtitle() {
        return Swift_subtitle(getSwift_peer());
    }

    public final String getTitle() {
        return Swift_title(getSwift_peer());
    }

    public final boolean isFirstResponder() {
        return Swift_isFirstResponder(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final boolean isResending() {
        return Swift_isResending(getSwift_peer());
    }

    public final boolean isSMSCodeValid() {
        return Swift_isSMSCodeValid(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_2(getSwift_peer(), input);
    }

    public final void setDidError(boolean z) {
        Swift_didError_set(getSwift_peer(), z);
    }

    public final void setFirstResponder(boolean z) {
        Swift_isFirstResponder_set(getSwift_peer(), z);
    }

    public final void setLoading(boolean z) {
        Swift_isLoading_set(getSwift_peer(), z);
    }

    public final void setResendTimeRemaining(int i) {
        Swift_resendTimeRemaining_set(getSwift_peer(), i);
    }

    public final void setResending(boolean z) {
        Swift_isResending_set(getSwift_peer(), z);
    }

    public final void setSmsCode(TextFieldConfig<String> textFieldConfig) {
        textFieldConfig.getClass();
        Swift_smsCode_set(getSwift_peer(), (TextFieldConfig) StructKt.sref$default(textFieldConfig, null, 1, null));
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00102\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0006\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnAppearCase", "OnResendCodeCase", "OnContinueCase", "OnCodeChangedCase", "OnBackCase", "OnSettingsCase", "Companion", "Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Input$OnAppearCase;", "Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Input$OnBackCase;", "Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Input$OnCodeChangedCase;", "Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Input$OnContinueCase;", "Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Input$OnResendCodeCase;", "Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Input$OnSettingsCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onAppear = new OnAppearCase();
        private static final Input onResendCode = new OnResendCodeCase();
        private static final Input onContinue = new OnContinueCase();
        private static final Input onBack = new OnBackCase();
        private static final Input onSettings = new OnSettingsCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Input$OnAppearCase;", "Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnAppearCase extends Input {
            public OnAppearCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Input$OnBackCase;", "Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnBackCase extends Input {
            public OnBackCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Input$OnCodeChangedCase;", "Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnCodeChangedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnCodeChangedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Input$OnContinueCase;", "Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnContinueCase extends Input {
            public OnContinueCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Input$OnResendCodeCase;", "Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnResendCodeCase extends Input {
            public OnResendCodeCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Input$OnSettingsCase;", "Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSettingsCase extends Input {
            public OnSettingsCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnAppear$cp() {
            return onAppear;
        }

        public static final /* synthetic */ Input access$getOnBack$cp() {
            return onBack;
        }

        public static final /* synthetic */ Input access$getOnContinue$cp() {
            return onContinue;
        }

        public static final /* synthetic */ Input access$getOnResendCode$cp() {
            return onResendCode;
        }

        public static final /* synthetic */ Input access$getOnSettings$cp() {
            return onSettings;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Input$Companion;", "", "<init>", "()V", "onAppear", "Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Input;", "getOnAppear", "()Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Input;", "onResendCode", "getOnResendCode", "onContinue", "getOnContinue", "onCodeChanged", "associated0", "", "onBack", "getOnBack", "onSettings", "getOnSettings", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnAppear() {
                return Input.access$getOnAppear$cp();
            }

            public final Input getOnBack() {
                return Input.access$getOnBack$cp();
            }

            public final Input getOnContinue() {
                return Input.access$getOnContinue$cp();
            }

            public final Input getOnResendCode() {
                return Input.access$getOnResendCode$cp();
            }

            public final Input getOnSettings() {
                return Input.access$getOnSettings$cp();
            }

            public final Input onCodeChanged(String associated0) {
                associated0.getClass();
                return new OnCodeChangedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0082 J\u0010\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u0011\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0082 ¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "context", "Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Context;", "last4", "", "callbacks", "Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/SMSMFACodeViewModel;", "Swift_Companion_mock_3", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(Context context, String last4, Callbacks callbacks);

        private final native SMSMFACodeViewModel Swift_Companion_mock_3(Context context);

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, Context context, String str, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(context, str, callbacks);
        }

        public static /* synthetic */ SMSMFACodeViewModel mock$default(Companion companion, Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                context = Context.login;
            }
            return companion.mock(context);
        }

        public final SMSMFACodeViewModel mock(Context context) {
            context.getClass();
            return Swift_Companion_mock_3(context);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SMSMFACodeViewModel(Context context, String str, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, context, str, callbacks), (SwiftPeerMarker) null);
        context.getClass();
        callbacks.getClass();
    }

    public SMSMFACodeViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\fJ\u0015\u0010\u0015\u001a\u00020\f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J7\u0010#\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082 J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190\u000b2\u0006\u0010%\u001a\u00020\u001bH\u0016J\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190\u000b2\u0006\u0010%\u001a\u00020\u001bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001d¨\u0006("}, d2 = {"Lcom/polymarket/usviewmodels/SMSMFACodeViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onBack", "Lkotlin/Function0;", "", "onSettings", "onVerified", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnBack", "()Lkotlin/jvm/functions/Function0;", "Swift_onBack", "getOnSettings", "Swift_onSettings", "getOnVerified", "Swift_onVerified", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function0 function0, Function0 function02, Function0 function03, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new vvf(15) : function0, (i & 2) != 0 ? new vvf(16) : function02, (i & 4) != 0 ? new vvf(17) : function03);
        }

        private final native long Swift_constructor_0(Function0<Unit> onBack, Function0<Unit> onSettings, Function0<Unit> onVerified);

        private final native Function0<Unit> Swift_onBack(long Swift_peer);

        private final native Function0<Unit> Swift_onSettings(long Swift_peer);

        private final native Function0<Unit> Swift_onVerified(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a() {
            return _init_$lambda$2();
        }

        public static /* synthetic */ Unit b() {
            return _init_$lambda$1();
        }

        public static /* synthetic */ Unit c() {
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

        public final Function0<Unit> getOnBack() {
            return Swift_onBack(this.Swift_peer);
        }

        public final Function0<Unit> getOnSettings() {
            return Swift_onSettings(this.Swift_peer);
        }

        public final Function0<Unit> getOnVerified() {
            return Swift_onVerified(this.Swift_peer);
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

        public Callbacks(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
            function0.getClass();
            function02.getClass();
            function03.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function0, function02, function03);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
