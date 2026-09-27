package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.TextFieldConfig;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.ajd;
import defpackage.u2d;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 I2\u00020\u0001:\u0004FGHIB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010\u0015\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082 J\u0015\u0010\u001e\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u001f\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0082 J\u0015\u0010&\u001a\u00020 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010'\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0017\u001a\u00020 H\u0082 J\u0015\u0010*\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010+\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0082 J\u0015\u0010.\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010/\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0082 J\u0015\u00102\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00106\u001a\u00020\u000e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00109\u001a\u00020\u000e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010:\u001a\u00020\u0016H\u0016J\u0015\u0010;\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010<\u001a\u00020\u00162\u0006\u0010=\u001a\u00020>J\u001d\u0010?\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010=\u001a\u00020>H\u0082 J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020B0A2\u0006\u0010C\u001a\u00020DH\u0016J\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020B0A2\u0006\u0010C\u001a\u00020DH\u0082 R0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010!\u001a\u00020 2\u0006\u0010\f\u001a\u00020 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010(\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR$\u0010,\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR\u0011\u00100\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b1\u0010\u001bR\u0011\u00103\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u00107\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b8\u00105¨\u0006J"}, d2 = {"Lcom/polymarket/usviewmodels/OnboardingProfileViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "callbacks", "Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$Callbacks;)V", "newValue", "Lcom/polymarket/data/TextFieldConfig;", "", "username", "getUsername", "()Lcom/polymarket/data/TextFieldConfig;", "setUsername", "(Lcom/polymarket/data/TextFieldConfig;)V", "Swift_username", "Swift_username_set", "", "value", "", "acknowledgedDisclaimer", "getAcknowledgedDisclaimer", "()Z", "setAcknowledgedDisclaimer", "(Z)V", "Swift_acknowledgedDisclaimer", "Swift_acknowledgedDisclaimer_set", "Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$UsernameValidationState;", "usernameValidationState", "getUsernameValidationState", "()Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$UsernameValidationState;", "setUsernameValidationState", "(Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$UsernameValidationState;)V", "Swift_usernameValidationState", "Swift_usernameValidationState_set", "isLoading", "setLoading", "Swift_isLoading", "Swift_isLoading_set", "isFirstResponder", "setFirstResponder", "Swift_isFirstResponder", "Swift_isFirstResponder_set", "canCompleteProfile", "getCanCompleteProfile", "Swift_canCompleteProfile", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "()Ljava/lang/String;", "Swift_title", "continueButtonTitle", "getContinueButtonTitle", "Swift_continueButtonTitle", "setup", "Swift_setup_1", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$Input;", "Swift_sendInput_2", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "UsernameValidationState", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OnboardingProfileViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ OnboardingProfileViewModel(Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Callbacks(null, null, 3, null) : callbacks);
    }

    private final native boolean Swift_acknowledgedDisclaimer(long Swift_peer);

    private final native void Swift_acknowledgedDisclaimer_set(long Swift_peer, boolean value);

    private final native boolean Swift_canCompleteProfile(long Swift_peer);

    private final native String Swift_continueButtonTitle(long Swift_peer);

    private final native boolean Swift_isFirstResponder(long Swift_peer);

    private final native void Swift_isFirstResponder_set(long Swift_peer, boolean value);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native void Swift_isLoading_set(long Swift_peer, boolean value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_sendInput_2(long Swift_peer, Input input);

    private final native void Swift_setup_1(long Swift_peer);

    private final native String Swift_title(long Swift_peer);

    private final native TextFieldConfig<String> Swift_username(long Swift_peer);

    private final native UsernameValidationState Swift_usernameValidationState(long Swift_peer);

    private final native void Swift_usernameValidationState_set(long Swift_peer, UsernameValidationState value);

    private final native void Swift_username_set(long Swift_peer, TextFieldConfig<String> value);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final boolean getAcknowledgedDisclaimer() {
        return Swift_acknowledgedDisclaimer(getSwift_peer());
    }

    public final boolean getCanCompleteProfile() {
        return Swift_canCompleteProfile(getSwift_peer());
    }

    public final String getContinueButtonTitle() {
        return Swift_continueButtonTitle(getSwift_peer());
    }

    public final String getTitle() {
        return Swift_title(getSwift_peer());
    }

    public final TextFieldConfig<String> getUsername() {
        return Swift_username(getSwift_peer());
    }

    public final UsernameValidationState getUsernameValidationState() {
        return Swift_usernameValidationState(getSwift_peer());
    }

    public final boolean isFirstResponder() {
        return Swift_isFirstResponder(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_2(getSwift_peer(), input);
    }

    public final void setAcknowledgedDisclaimer(boolean z) {
        Swift_acknowledgedDisclaimer_set(getSwift_peer(), z);
    }

    public final void setFirstResponder(boolean z) {
        Swift_isFirstResponder_set(getSwift_peer(), z);
    }

    public final void setLoading(boolean z) {
        Swift_isLoading_set(getSwift_peer(), z);
    }

    public final void setUsername(TextFieldConfig<String> textFieldConfig) {
        textFieldConfig.getClass();
        Swift_username_set(getSwift_peer(), (TextFieldConfig) StructKt.sref$default(textFieldConfig, null, 1, null));
    }

    public final void setUsernameValidationState(UsernameValidationState usernameValidationState) {
        usernameValidationState.getClass();
        Swift_usernameValidationState_set(getSwift_peer(), usernameValidationState);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00162\u00020\u0001:\u0006\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnContinueCase", "OnDisclaimerToggleCase", "OnUsernameChangedCase", "OnURLSelectedCase", "Companion", "Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$Input$OnContinueCase;", "Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$Input$OnDisclaimerToggleCase;", "Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$Input$OnURLSelectedCase;", "Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$Input$OnUsernameChangedCase;", "Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$Input$OnViewDidLoadCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onContinue = new OnContinueCase();
        private static final Input onDisclaimerToggle = new OnDisclaimerToggleCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$Input$OnContinueCase;", "Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnContinueCase extends Input {
            public OnContinueCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$Input$OnDisclaimerToggleCase;", "Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDisclaimerToggleCase extends Input {
            public OnDisclaimerToggleCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$Input$OnURLSelectedCase;", "Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$Input;", "associated0", "Ljava/net/URI;", "<init>", "(Ljava/net/URI;)V", "getAssociated0", "()Ljava/net/URI;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$Input$OnUsernameChangedCase;", "Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnUsernameChangedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnUsernameChangedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        public static final /* synthetic */ Input access$getOnContinue$cp() {
            return onContinue;
        }

        public static final /* synthetic */ Input access$getOnDisclaimerToggle$cp() {
            return onDisclaimerToggle;
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
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$Input;", "onContinue", "getOnContinue", "onDisclaimerToggle", "getOnDisclaimerToggle", "onUsernameChanged", "associated0", "", "onURLSelected", "Ljava/net/URI;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnContinue() {
                return Input.access$getOnContinue$cp();
            }

            public final Input getOnDisclaimerToggle() {
                return Input.access$getOnDisclaimerToggle$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input onURLSelected(URI associated0) {
                associated0.getClass();
                return new OnURLSelectedCase(associated0);
            }

            public final Input onUsernameChanged(String associated0) {
                associated0.getClass();
                return new OnUsernameChangedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e2\u00020\u0001:\u0005\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$UsernameValidationState;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "IdleCase", "ValidatingCase", "ValidCase", "InvalidCase", "Companion", "Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$UsernameValidationState$IdleCase;", "Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$UsernameValidationState$InvalidCase;", "Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$UsernameValidationState$ValidCase;", "Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$UsernameValidationState$ValidatingCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class UsernameValidationState implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final UsernameValidationState idle = new IdleCase();
        private static final UsernameValidationState validating = new ValidatingCase();
        private static final UsernameValidationState valid = new ValidCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$UsernameValidationState$IdleCase;", "Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$UsernameValidationState;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class IdleCase extends UsernameValidationState {
            public IdleCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$UsernameValidationState$InvalidCase;", "Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$UsernameValidationState;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class InvalidCase extends UsernameValidationState {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvalidCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public boolean equals(Object other) {
                if (!(other instanceof InvalidCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((InvalidCase) other).associated0);
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$UsernameValidationState$ValidCase;", "Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$UsernameValidationState;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class ValidCase extends UsernameValidationState {
            public ValidCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$UsernameValidationState$ValidatingCase;", "Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$UsernameValidationState;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class ValidatingCase extends UsernameValidationState {
            public ValidatingCase() {
                super(null);
            }
        }

        public /* synthetic */ UsernameValidationState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ UsernameValidationState access$getIdle$cp() {
            return idle;
        }

        public static final /* synthetic */ UsernameValidationState access$getValid$cp() {
            return valid;
        }

        public static final /* synthetic */ UsernameValidationState access$getValidating$cp() {
            return validating;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$UsernameValidationState$Companion;", "", "<init>", "()V", "idle", "Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$UsernameValidationState;", "getIdle", "()Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$UsernameValidationState;", "validating", "getValidating", "valid", "getValid", "invalid", "associated0", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final UsernameValidationState getIdle() {
                return UsernameValidationState.access$getIdle$cp();
            }

            public final UsernameValidationState getValid() {
                return UsernameValidationState.access$getValid$cp();
            }

            public final UsernameValidationState getValidating() {
                return UsernameValidationState.access$getValidating$cp();
            }

            public final UsernameValidationState invalid(String associated0) {
                associated0.getClass();
                return new InvalidCase(associated0);
            }

            private Companion() {
            }
        }

        private UsernameValidationState() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0082 ¨\u0006\t"}, d2 = {"Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "callbacks", "Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$Callbacks;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(Callbacks callbacks);

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(callbacks);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingProfileViewModel(Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, callbacks), (SwiftPeerMarker) null);
        callbacks.getClass();
    }

    public OnboardingProfileViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB/\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0004\b\b\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\fJ\u0015\u0010\u0016\u001a\u00020\f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J/\u0010\u001d\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000eH\u0082 J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b2\u0006\u0010\u001f\u001a\u00020\u001cH\u0016J\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b2\u0006\u0010\u001f\u001a\u00020\u001cH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/polymarket/usviewmodels/OnboardingProfileViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onProfileCompleted", "Lkotlin/Function0;", "", "onURLSelected", "Lkotlin/Function1;", "Ljava/net/URI;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function0 function0, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((Function0<Unit>) ((i & 1) != 0 ? new u2d(17) : function0), (Function1<? super URI, Unit>) ((i & 2) != 0 ? new ajd(0) : function1));
        }

        private final native long Swift_constructor_0(Function0<Unit> onProfileCompleted, Function1<? super URI, Unit> onURLSelected);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(URI uri) {
            uri.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a() {
            return _init_$lambda$0();
        }

        public static /* synthetic */ Unit b(URI uri) {
            return _init_$lambda$1(uri);
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

        public Callbacks(Function0<Unit> function0, Function1<? super URI, Unit> function1) {
            function0.getClass();
            function1.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function0, function1);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
