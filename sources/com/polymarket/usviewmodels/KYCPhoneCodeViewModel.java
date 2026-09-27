package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.EPhone;
import com.polymarket.data.TextFieldConfig;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.hv9;
import defpackage.l5a;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.AttributeType;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 S2\u00020\u0001:\u0003QRSB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB'\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0007\u0010\u000fJ\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010\u0019\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0082 J\u0015\u0010 \u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010!\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001b\u001a\u00020\nH\u0082 J\u0015\u0010'\u001a\u00020\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010(\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001b\u001a\u00020\"H\u0082 J\u0015\u0010,\u001a\u00020\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010-\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001b\u001a\u00020\"H\u0082 J\u0015\u00104\u001a\u00020.2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u00105\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001b\u001a\u00020.H\u0082 J\u0015\u00109\u001a\u00020\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010:\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001b\u001a\u00020\"H\u0082 J\u0015\u0010=\u001a\u00020\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010>\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001b\u001a\u00020\"H\u0082 J\u0015\u0010@\u001a\u00020\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010C\u001a\u00020\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010G\u001a\u00020\u00122\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010H\u001a\u00020\u001a2\u0006\u0010I\u001a\u00020JJ\u001d\u0010K\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010I\u001a\u00020JH\u0082 J\u0016\u0010L\u001a\b\u0012\u0004\u0012\u00020N0M2\u0006\u0010O\u001a\u00020.H\u0016J\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020N0M2\u0006\u0010O\u001a\u00020.H\u0082 R0\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010#\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\"8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010)\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\"8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010$\"\u0004\b+\u0010&R$\u0010/\u001a\u00020.2\u0006\u0010\u0010\u001a\u00020.8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00106\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\"8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u0010$\"\u0004\b8\u0010&R$\u0010;\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\"8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010$\"\u0004\b<\u0010&R\u0011\u0010?\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b?\u0010$R\u0011\u0010A\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\bB\u0010$R\u0011\u0010D\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006T"}, d2 = {"Lcom/polymarket/usviewmodels/KYCPhoneCodeViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", AttributeType.PHONE, "Lcom/polymarket/data/EPhone;", "dateOfBirth", "Ljava/util/Date;", "callbacks", "Lcom/polymarket/usviewmodels/KYCPhoneCodeViewModel$Callbacks;", "(Lcom/polymarket/data/EPhone;Ljava/util/Date;Lcom/polymarket/usviewmodels/KYCPhoneCodeViewModel$Callbacks;)V", "newValue", "Lcom/polymarket/data/TextFieldConfig;", "", "phoneCode", "getPhoneCode", "()Lcom/polymarket/data/TextFieldConfig;", "setPhoneCode", "(Lcom/polymarket/data/TextFieldConfig;)V", "Swift_phoneCode", "Swift_phoneCode_set", "", "value", "getPhone", "()Lcom/polymarket/data/EPhone;", "setPhone", "(Lcom/polymarket/data/EPhone;)V", "Swift_phone", "Swift_phone_set", "", "isLoading", "()Z", "setLoading", "(Z)V", "Swift_isLoading", "Swift_isLoading_set", "loadingResend", "getLoadingResend", "setLoadingResend", "Swift_loadingResend", "Swift_loadingResend_set", "", "resendTimeRemaining", "getResendTimeRemaining", "()I", "setResendTimeRemaining", "(I)V", "Swift_resendTimeRemaining", "Swift_resendTimeRemaining_set", "didError", "getDidError", "setDidError", "Swift_didError", "Swift_didError_set", "isFirstResponder", "setFirstResponder", "Swift_isFirstResponder", "Swift_isFirstResponder_set", "isPhoneCodeValid", "Swift_isPhoneCodeValid", "canResend", "getCanResend", "Swift_canResend", "phoneCodeDigits", "getPhoneCodeDigits", "()Ljava/lang/String;", "Swift_phoneCodeDigits", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/KYCPhoneCodeViewModel$Input;", "Swift_sendInput_1", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Callbacks", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KYCPhoneCodeViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ KYCPhoneCodeViewModel(EPhone ePhone, Date date, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new EPhone(null, null, 3, null) : ePhone, date, (i & 4) != 0 ? new Callbacks(null, null, 3, null) : callbacks);
    }

    private final native boolean Swift_canResend(long Swift_peer);

    private final native boolean Swift_didError(long Swift_peer);

    private final native void Swift_didError_set(long Swift_peer, boolean value);

    private final native boolean Swift_isFirstResponder(long Swift_peer);

    private final native void Swift_isFirstResponder_set(long Swift_peer, boolean value);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native void Swift_isLoading_set(long Swift_peer, boolean value);

    private final native boolean Swift_isPhoneCodeValid(long Swift_peer);

    private final native boolean Swift_loadingResend(long Swift_peer);

    private final native void Swift_loadingResend_set(long Swift_peer, boolean value);

    private final native EPhone Swift_phone(long Swift_peer);

    private final native TextFieldConfig<String> Swift_phoneCode(long Swift_peer);

    private final native String Swift_phoneCodeDigits(long Swift_peer);

    private final native void Swift_phoneCode_set(long Swift_peer, TextFieldConfig<String> value);

    private final native void Swift_phone_set(long Swift_peer, EPhone value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native int Swift_resendTimeRemaining(long Swift_peer);

    private final native void Swift_resendTimeRemaining_set(long Swift_peer, int value);

    private final native void Swift_sendInput_1(long Swift_peer, Input input);

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

    public final boolean getLoadingResend() {
        return Swift_loadingResend(getSwift_peer());
    }

    public final EPhone getPhone() {
        return Swift_phone(getSwift_peer());
    }

    public final TextFieldConfig<String> getPhoneCode() {
        return Swift_phoneCode(getSwift_peer());
    }

    public final String getPhoneCodeDigits() {
        return Swift_phoneCodeDigits(getSwift_peer());
    }

    public final int getResendTimeRemaining() {
        return Swift_resendTimeRemaining(getSwift_peer());
    }

    public final boolean isFirstResponder() {
        return Swift_isFirstResponder(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final boolean isPhoneCodeValid() {
        return Swift_isPhoneCodeValid(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_1(getSwift_peer(), input);
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

    public final void setLoadingResend(boolean z) {
        Swift_loadingResend_set(getSwift_peer(), z);
    }

    public final void setPhone(EPhone ePhone) {
        ePhone.getClass();
        Swift_phone_set(getSwift_peer(), ePhone);
    }

    public final void setPhoneCode(TextFieldConfig<String> textFieldConfig) {
        textFieldConfig.getClass();
        Swift_phoneCode_set(getSwift_peer(), (TextFieldConfig) StructKt.sref$default(textFieldConfig, null, 1, null));
    }

    public final void setResendTimeRemaining(int i) {
        Swift_resendTimeRemaining_set(getSwift_peer(), i);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00162\u00020\u0001:\u0006\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/polymarket/usviewmodels/KYCPhoneCodeViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnAppearCase", "OnDisappearCase", "OnPhoneCodeChangedCase", "OnResendCodeCase", "OnContinueCase", "Companion", "Lcom/polymarket/usviewmodels/KYCPhoneCodeViewModel$Input$OnAppearCase;", "Lcom/polymarket/usviewmodels/KYCPhoneCodeViewModel$Input$OnContinueCase;", "Lcom/polymarket/usviewmodels/KYCPhoneCodeViewModel$Input$OnDisappearCase;", "Lcom/polymarket/usviewmodels/KYCPhoneCodeViewModel$Input$OnPhoneCodeChangedCase;", "Lcom/polymarket/usviewmodels/KYCPhoneCodeViewModel$Input$OnResendCodeCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onAppear = new OnAppearCase();
        private static final Input onDisappear = new OnDisappearCase();
        private static final Input onResendCode = new OnResendCodeCase();
        private static final Input onContinue = new OnContinueCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/KYCPhoneCodeViewModel$Input$OnAppearCase;", "Lcom/polymarket/usviewmodels/KYCPhoneCodeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnAppearCase extends Input {
            public OnAppearCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/KYCPhoneCodeViewModel$Input$OnContinueCase;", "Lcom/polymarket/usviewmodels/KYCPhoneCodeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnContinueCase extends Input {
            public OnContinueCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/KYCPhoneCodeViewModel$Input$OnDisappearCase;", "Lcom/polymarket/usviewmodels/KYCPhoneCodeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDisappearCase extends Input {
            public OnDisappearCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/KYCPhoneCodeViewModel$Input$OnPhoneCodeChangedCase;", "Lcom/polymarket/usviewmodels/KYCPhoneCodeViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPhoneCodeChangedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnPhoneCodeChangedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/KYCPhoneCodeViewModel$Input$OnResendCodeCase;", "Lcom/polymarket/usviewmodels/KYCPhoneCodeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnResendCodeCase extends Input {
            public OnResendCodeCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnAppear$cp() {
            return onAppear;
        }

        public static final /* synthetic */ Input access$getOnContinue$cp() {
            return onContinue;
        }

        public static final /* synthetic */ Input access$getOnDisappear$cp() {
            return onDisappear;
        }

        public static final /* synthetic */ Input access$getOnResendCode$cp() {
            return onResendCode;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/polymarket/usviewmodels/KYCPhoneCodeViewModel$Input$Companion;", "", "<init>", "()V", "onAppear", "Lcom/polymarket/usviewmodels/KYCPhoneCodeViewModel$Input;", "getOnAppear", "()Lcom/polymarket/usviewmodels/KYCPhoneCodeViewModel$Input;", "onDisappear", "getOnDisappear", "onPhoneCodeChanged", "associated0", "", "onResendCode", "getOnResendCode", "onContinue", "getOnContinue", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnAppear() {
                return Input.access$getOnAppear$cp();
            }

            public final Input getOnContinue() {
                return Input.access$getOnContinue$cp();
            }

            public final Input getOnDisappear() {
                return Input.access$getOnDisappear$cp();
            }

            public final Input getOnResendCode() {
                return Input.access$getOnResendCode$cp();
            }

            public final Input onPhoneCodeChanged(String associated0) {
                associated0.getClass();
                return new OnPhoneCodeChangedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0082 ¨\u0006\r"}, d2 = {"Lcom/polymarket/usviewmodels/KYCPhoneCodeViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", AttributeType.PHONE, "Lcom/polymarket/data/EPhone;", "dateOfBirth", "Ljava/util/Date;", "callbacks", "Lcom/polymarket/usviewmodels/KYCPhoneCodeViewModel$Callbacks;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(EPhone phone, Date dateOfBirth, Callbacks callbacks);

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, EPhone ePhone, Date date, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(ePhone, date, callbacks);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KYCPhoneCodeViewModel(EPhone ePhone, Date date, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, ePhone, date, callbacks), (SwiftPeerMarker) null);
        ePhone.getClass();
        callbacks.getClass();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB/\b\u0016\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0004\b\b\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\rJ\u0015\u0010\u0016\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J!\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J/\u0010#\u001a\u00060\u0004j\u0002`\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0082 J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f2\u0006\u0010%\u001a\u00020\u001cH\u0016J\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f2\u0006\u0010%\u001a\u00020\u001cH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006("}, d2 = {"Lcom/polymarket/usviewmodels/KYCPhoneCodeViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onCodeVerified", "Lkotlin/Function1;", "", "", "onBack", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnCodeVerified", "()Lkotlin/jvm/functions/Function1;", "Swift_onCodeVerified", "getOnBack", "()Lkotlin/jvm/functions/Function0;", "Swift_onBack", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function1 function1, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((Function1<? super String, Unit>) ((i & 1) != 0 ? new l5a(15) : function1), (Function0<Unit>) ((i & 2) != 0 ? new hv9(27) : function0));
        }

        private final native long Swift_constructor_0(Function1<? super String, Unit> onCodeVerified, Function0<Unit> onBack);

        private final native Function0<Unit> Swift_onBack(long Swift_peer);

        private final native Function1<String, Unit> Swift_onCodeVerified(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(String str) {
            str.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(String str) {
            return _init_$lambda$0(str);
        }

        public static /* synthetic */ Unit b() {
            return _init_$lambda$1();
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

        public final Function1<String, Unit> getOnCodeVerified() {
            return Swift_onCodeVerified(this.Swift_peer);
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

        public Callbacks(Function1<? super String, Unit> function1, Function0<Unit> function0) {
            function1.getClass();
            function0.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function1, function0);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    public KYCPhoneCodeViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }
}
