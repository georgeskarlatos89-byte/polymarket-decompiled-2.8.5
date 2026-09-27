package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.ECountry;
import com.polymarket.data.EPhone;
import com.polymarket.data.TextFieldConfig;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.da8;
import defpackage.l5a;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.AttributeType;
import java.net.URI;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 R2\u00020\u0001:\u0003PQRB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rJ\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010\u0016\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082 J\u0015\u0010\u001f\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010 \u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0082 J\u0015\u0010&\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010'\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0018\u001a\u00020!H\u0082 J\u0015\u0010*\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010+\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0018\u001a\u00020!H\u0082 J\u0015\u0010-\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010/\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00101\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00105\u001a\u00020\u00102\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00108\u001a\u00020\u00102\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010;\u001a\u00020\u00102\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010>\u001a\u00020\u00102\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010C\u001a\u00020@2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010D\u001a\u00020\u0017H\u0016J\u0015\u0010E\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010F\u001a\u00020\u00172\u0006\u0010G\u001a\u00020HJ\u001d\u0010I\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010G\u001a\u00020HH\u0082 J\u0016\u0010J\u001a\b\u0012\u0004\u0012\u00020L0K2\u0006\u0010M\u001a\u00020NH\u0016J\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020L0K2\u0006\u0010M\u001a\u00020NH\u0082 R0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\"\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010(\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\u0011\u0010,\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b,\u0010#R\u0011\u0010.\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b.\u0010#R\u0011\u00100\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b0\u0010#R\u0011\u00102\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u00106\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b7\u00104R\u0011\u00109\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b:\u00104R\u0011\u0010<\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b=\u00104R\u0011\u0010?\u001a\u00020@8F¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006S"}, d2 = {"Lcom/polymarket/usviewmodels/KYCPhoneViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", AttributeType.PHONE, "Lcom/polymarket/data/EPhone;", "callbacks", "Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Callbacks;", "(Lcom/polymarket/data/EPhone;Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Callbacks;)V", "newValue", "Lcom/polymarket/data/TextFieldConfig;", "", "getPhone", "()Lcom/polymarket/data/TextFieldConfig;", "setPhone", "(Lcom/polymarket/data/TextFieldConfig;)V", "Swift_phone", "Swift_phone_set", "", "value", "Lcom/polymarket/data/ECountry;", "country", "getCountry", "()Lcom/polymarket/data/ECountry;", "setCountry", "(Lcom/polymarket/data/ECountry;)V", "Swift_country", "Swift_country_set", "", "isLoading", "()Z", "setLoading", "(Z)V", "Swift_isLoading", "Swift_isLoading_set", "isFirstResponder", "setFirstResponder", "Swift_isFirstResponder", "Swift_isFirstResponder_set", "isSMSConsentChecked", "Swift_isSMSConsentChecked", "isSMSConsentVisible", "Swift_isSMSConsentVisible", "isPhoneValid", "Swift_isPhoneValid", "smsConsentTitle", "getSmsConsentTitle", "()Ljava/lang/String;", "Swift_smsConsentTitle", "smsConsentPrefix", "getSmsConsentPrefix", "Swift_smsConsentPrefix", "smsConsentLinkLabel", "getSmsConsentLinkLabel", "Swift_smsConsentLinkLabel", "smsConsentSuffix", "getSmsConsentSuffix", "Swift_smsConsentSuffix", "smsConsentPrivacyURL", "Ljava/net/URI;", "getSmsConsentPrivacyURL", "()Ljava/net/URI;", "Swift_smsConsentPrivacyURL", "setup", "Swift_setup_1", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Input;", "Swift_sendInput_2", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KYCPhoneViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ KYCPhoneViewModel(EPhone ePhone, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new EPhone(null, null, 3, null) : ePhone, (i & 2) != 0 ? new Callbacks(null, null, 3, null) : callbacks);
    }

    private final native ECountry Swift_country(long Swift_peer);

    private final native void Swift_country_set(long Swift_peer, ECountry value);

    private final native boolean Swift_isFirstResponder(long Swift_peer);

    private final native void Swift_isFirstResponder_set(long Swift_peer, boolean value);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native void Swift_isLoading_set(long Swift_peer, boolean value);

    private final native boolean Swift_isPhoneValid(long Swift_peer);

    private final native boolean Swift_isSMSConsentChecked(long Swift_peer);

    private final native boolean Swift_isSMSConsentVisible(long Swift_peer);

    private final native TextFieldConfig<String> Swift_phone(long Swift_peer);

    private final native void Swift_phone_set(long Swift_peer, TextFieldConfig<String> value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_sendInput_2(long Swift_peer, Input input);

    private final native void Swift_setup_1(long Swift_peer);

    private final native String Swift_smsConsentLinkLabel(long Swift_peer);

    private final native String Swift_smsConsentPrefix(long Swift_peer);

    private final native URI Swift_smsConsentPrivacyURL(long Swift_peer);

    private final native String Swift_smsConsentSuffix(long Swift_peer);

    private final native String Swift_smsConsentTitle(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final ECountry getCountry() {
        return Swift_country(getSwift_peer());
    }

    public final TextFieldConfig<String> getPhone() {
        return Swift_phone(getSwift_peer());
    }

    public final String getSmsConsentLinkLabel() {
        return Swift_smsConsentLinkLabel(getSwift_peer());
    }

    public final String getSmsConsentPrefix() {
        return Swift_smsConsentPrefix(getSwift_peer());
    }

    public final URI getSmsConsentPrivacyURL() {
        return Swift_smsConsentPrivacyURL(getSwift_peer());
    }

    public final String getSmsConsentSuffix() {
        return Swift_smsConsentSuffix(getSwift_peer());
    }

    public final String getSmsConsentTitle() {
        return Swift_smsConsentTitle(getSwift_peer());
    }

    public final boolean isFirstResponder() {
        return Swift_isFirstResponder(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final boolean isPhoneValid() {
        return Swift_isPhoneValid(getSwift_peer());
    }

    public final boolean isSMSConsentChecked() {
        return Swift_isSMSConsentChecked(getSwift_peer());
    }

    public final boolean isSMSConsentVisible() {
        return Swift_isSMSConsentVisible(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_2(getSwift_peer(), input);
    }

    public final void setCountry(ECountry eCountry) {
        eCountry.getClass();
        Swift_country_set(getSwift_peer(), (ECountry) StructKt.sref$default(eCountry, null, 1, null));
    }

    public final void setFirstResponder(boolean z) {
        Swift_isFirstResponder_set(getSwift_peer(), z);
    }

    public final void setLoading(boolean z) {
        Swift_isLoading_set(getSwift_peer(), z);
    }

    public final void setPhone(TextFieldConfig<String> textFieldConfig) {
        textFieldConfig.getClass();
        Swift_phone_set(getSwift_peer(), (TextFieldConfig) StructKt.sref$default(textFieldConfig, null, 1, null));
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00182\u00020\u0001:\b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0007\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnCountryPickerTappedCase", "OnSelectCountryCase", "OnPhoneChangedCase", "OnToggleSMSConsentCase", "OnURLSelectedCase", "OnSelectContinueCase", "Companion", "Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Input$OnCountryPickerTappedCase;", "Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Input$OnPhoneChangedCase;", "Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Input$OnSelectContinueCase;", "Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Input$OnSelectCountryCase;", "Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Input$OnToggleSMSConsentCase;", "Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Input$OnURLSelectedCase;", "Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Input$OnViewDidLoadCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onCountryPickerTapped = new OnCountryPickerTappedCase();
        private static final Input onToggleSMSConsent = new OnToggleSMSConsentCase();
        private static final Input onSelectContinue = new OnSelectContinueCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Input$OnCountryPickerTappedCase;", "Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnCountryPickerTappedCase extends Input {
            public OnCountryPickerTappedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Input$OnPhoneChangedCase;", "Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPhoneChangedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnPhoneChangedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Input$OnSelectContinueCase;", "Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSelectContinueCase extends Input {
            public OnSelectContinueCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Input$OnSelectCountryCase;", "Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Input;", "associated0", "Lcom/polymarket/data/ECountry;", "<init>", "(Lcom/polymarket/data/ECountry;)V", "getAssociated0", "()Lcom/polymarket/data/ECountry;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSelectCountryCase extends Input {
            private final ECountry associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSelectCountryCase(ECountry eCountry) {
                super(null);
                eCountry.getClass();
                this.associated0 = eCountry;
            }

            public final ECountry getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Input$OnToggleSMSConsentCase;", "Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnToggleSMSConsentCase extends Input {
            public OnToggleSMSConsentCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Input$OnURLSelectedCase;", "Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Input;", "associated0", "Ljava/net/URI;", "<init>", "(Ljava/net/URI;)V", "getAssociated0", "()Ljava/net/URI;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnURLSelectedCase extends Input {
            private final URI associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnURLSelectedCase(URI uri) {
                super(null);
                uri.getClass();
                this.associated0 = uri;
            }

            public final URI getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidLoadCase extends Input {
            public OnViewDidLoadCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnCountryPickerTapped$cp() {
            return onCountryPickerTapped;
        }

        public static final /* synthetic */ Input access$getOnSelectContinue$cp() {
            return onSelectContinue;
        }

        public static final /* synthetic */ Input access$getOnToggleSMSConsent$cp() {
            return onToggleSMSConsent;
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
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Input;", "onCountryPickerTapped", "getOnCountryPickerTapped", "onSelectCountry", "associated0", "Lcom/polymarket/data/ECountry;", "onPhoneChanged", "", "onToggleSMSConsent", "getOnToggleSMSConsent", "onURLSelected", "Ljava/net/URI;", "onSelectContinue", "getOnSelectContinue", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnCountryPickerTapped() {
                return Input.access$getOnCountryPickerTapped$cp();
            }

            public final Input getOnSelectContinue() {
                return Input.access$getOnSelectContinue$cp();
            }

            public final Input getOnToggleSMSConsent() {
                return Input.access$getOnToggleSMSConsent$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input onPhoneChanged(String associated0) {
                associated0.getClass();
                return new OnPhoneChangedCase(associated0);
            }

            public final Input onSelectCountry(ECountry associated0) {
                associated0.getClass();
                return new OnSelectCountryCase(associated0);
            }

            public final Input onURLSelected(URI associated0) {
                associated0.getClass();
                return new OnURLSelectedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082 ¨\u0006\u000b"}, d2 = {"Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", AttributeType.PHONE, "Lcom/polymarket/data/EPhone;", "callbacks", "Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Callbacks;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(EPhone phone, Callbacks callbacks);

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, EPhone ePhone, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(ePhone, callbacks);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KYCPhoneViewModel(EPhone ePhone, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, ePhone, callbacks), (SwiftPeerMarker) null);
        ePhone.getClass();
        callbacks.getClass();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB;\b\u0016\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u0010¢\u0006\u0004\b\b\u0010\u0012J\u0006\u0010\u0017\u001a\u00020\u000eJ\u0015\u0010\u0018\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0019\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J'\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J;\u0010!\u001a\u00060\u0004j\u0002`\u00052\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u0010H\u0082 J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0#2\u0006\u0010$\u001a\u00020\u001dH\u0016J\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0#2\u0006\u0010$\u001a\u00020\u001dH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R#\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006'"}, d2 = {"Lcom/polymarket/usviewmodels/KYCPhoneViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onPhoneEntered", "Lkotlin/Function2;", "Lcom/polymarket/data/EPhone;", "", "", "onURLSelected", "Lkotlin/Function1;", "Ljava/net/URI;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "other", "", "hashCode", "", "getOnPhoneEntered", "()Lkotlin/jvm/functions/Function2;", "Swift_onPhoneEntered", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function2 function2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((Function2<? super EPhone, ? super Boolean, Unit>) ((i & 1) != 0 ? new da8(17) : function2), (Function1<? super URI, Unit>) ((i & 2) != 0 ? new l5a(17) : function1));
        }

        private final native long Swift_constructor_0(Function2<? super EPhone, ? super Boolean, Unit> onPhoneEntered, Function1<? super URI, Unit> onURLSelected);

        private final native Function2<EPhone, Boolean, Unit> Swift_onPhoneEntered(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(EPhone ePhone, boolean z) {
            ePhone.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(URI uri) {
            uri.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(URI uri) {
            return _init_$lambda$1(uri);
        }

        public static /* synthetic */ Unit b(EPhone ePhone, boolean z) {
            return _init_$lambda$0(ePhone, z);
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

        public final Function2<EPhone, Boolean, Unit> getOnPhoneEntered() {
            return Swift_onPhoneEntered(this.Swift_peer);
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

        public Callbacks(Function2<? super EPhone, ? super Boolean, Unit> function2, Function1<? super URI, Unit> function1) {
            function2.getClass();
            function1.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function2, function1);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    public KYCPhoneViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }
}
