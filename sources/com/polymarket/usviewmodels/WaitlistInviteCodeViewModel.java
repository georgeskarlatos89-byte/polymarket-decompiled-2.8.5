package com.polymarket.usviewmodels;

import com.polymarket.data.TextFieldConfig;
import com.polymarket.usviewmodels.AppViewModel;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.dmk;
import defpackage.kw5;
import defpackage.u85;
import defpackage.zei;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MainActor;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0003=>?B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010\u0015\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082 J\u0015\u0010\u001d\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u001e\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0082 J\u0015\u0010$\u001a\u00020\u000e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010%\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0017\u001a\u00020\u000eH\u0082 J\u0015\u0010'\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010*\u001a\u00020\u000e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010-\u001a\u00020\u000e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00100\u001a\u00020\u000e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u00101\u001a\u00020\u0016H\u0016J\u0015\u00102\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u000205J\u001d\u00106\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00104\u001a\u000205H\u0082 J\u0016\u00107\u001a\b\u0012\u0004\u0012\u000209082\u0006\u0010:\u001a\u00020;H\u0016J\u0017\u0010<\u001a\b\u0012\u0004\u0012\u000209082\u0006\u0010:\u001a\u00020;H\u0082 R0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b&\u0010\u001aR\u0011\u0010(\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b)\u0010!R\u0011\u0010+\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b,\u0010!R\u0011\u0010.\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b/\u0010!¨\u0006@"}, d2 = {"Lcom/polymarket/usviewmodels/WaitlistInviteCodeViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "callbacks", "Lcom/polymarket/usviewmodels/WaitlistInviteCodeViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/WaitlistInviteCodeViewModel$Callbacks;)V", "newValue", "Lcom/polymarket/data/TextFieldConfig;", "", ApiConstant.KEY_CODE, "getCode", "()Lcom/polymarket/data/TextFieldConfig;", "setCode", "(Lcom/polymarket/data/TextFieldConfig;)V", "Swift_code", "Swift_code_set", "", "value", "", "isSubmitting", "()Z", "setSubmitting", "(Z)V", "Swift_isSubmitting", "Swift_isSubmitting_set", "submissionError", "getSubmissionError", "()Ljava/lang/String;", "setSubmissionError", "(Ljava/lang/String;)V", "Swift_submissionError", "Swift_submissionError_set", "isCodeValid", "Swift_isCodeValid", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "Swift_title", "subtitle", "getSubtitle", "Swift_subtitle", "buttonTitle", "getButtonTitle", "Swift_buttonTitle", "setup", "Swift_setup_1", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/WaitlistInviteCodeViewModel$Input;", "Swift_sendInput_2", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WaitlistInviteCodeViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaitlistInviteCodeViewModel(Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, callbacks), (SwiftPeerMarker) null);
        callbacks.getClass();
    }

    private final native String Swift_buttonTitle(long Swift_peer);

    private final native TextFieldConfig<String> Swift_code(long Swift_peer);

    private final native void Swift_code_set(long Swift_peer, TextFieldConfig<String> value);

    private final native boolean Swift_isCodeValid(long Swift_peer);

    private final native boolean Swift_isSubmitting(long Swift_peer);

    private final native void Swift_isSubmitting_set(long Swift_peer, boolean value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_sendInput_2(long Swift_peer, Input input);

    private final native void Swift_setup_1(long Swift_peer);

    private final native String Swift_submissionError(long Swift_peer);

    private final native void Swift_submissionError_set(long Swift_peer, String value);

    private final native String Swift_subtitle(long Swift_peer);

    private final native String Swift_title(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String getButtonTitle() {
        return Swift_buttonTitle(getSwift_peer());
    }

    public final TextFieldConfig<String> getCode() {
        return Swift_code(getSwift_peer());
    }

    public final String getSubmissionError() {
        return Swift_submissionError(getSwift_peer());
    }

    public final String getSubtitle() {
        return Swift_subtitle(getSwift_peer());
    }

    public final String getTitle() {
        return Swift_title(getSwift_peer());
    }

    public final boolean isCodeValid() {
        return Swift_isCodeValid(getSwift_peer());
    }

    public final boolean isSubmitting() {
        return Swift_isSubmitting(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_2(getSwift_peer(), input);
    }

    public final void setCode(TextFieldConfig<String> textFieldConfig) {
        textFieldConfig.getClass();
        Swift_code_set(getSwift_peer(), (TextFieldConfig) StructKt.sref$default(textFieldConfig, null, 1, null));
    }

    public final void setSubmissionError(String str) {
        str.getClass();
        Swift_submissionError_set(getSwift_peer(), str);
    }

    public final void setSubmitting(boolean z) {
        Swift_isSubmitting_set(getSwift_peer(), z);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \r2\u00020\u0001:\u0004\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/polymarket/usviewmodels/WaitlistInviteCodeViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnCodeChangedCase", "OnSubmitCodeCase", "Companion", "Lcom/polymarket/usviewmodels/WaitlistInviteCodeViewModel$Input$OnCodeChangedCase;", "Lcom/polymarket/usviewmodels/WaitlistInviteCodeViewModel$Input$OnSubmitCodeCase;", "Lcom/polymarket/usviewmodels/WaitlistInviteCodeViewModel$Input$OnViewDidLoadCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onSubmitCode = new OnSubmitCodeCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/WaitlistInviteCodeViewModel$Input$OnCodeChangedCase;", "Lcom/polymarket/usviewmodels/WaitlistInviteCodeViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/WaitlistInviteCodeViewModel$Input$OnSubmitCodeCase;", "Lcom/polymarket/usviewmodels/WaitlistInviteCodeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSubmitCodeCase extends Input {
            public OnSubmitCodeCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/WaitlistInviteCodeViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/WaitlistInviteCodeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        public static final /* synthetic */ Input access$getOnSubmitCode$cp() {
            return onSubmitCode;
        }

        public static final /* synthetic */ Input access$getOnViewDidLoad$cp() {
            return onViewDidLoad;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/polymarket/usviewmodels/WaitlistInviteCodeViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/WaitlistInviteCodeViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/WaitlistInviteCodeViewModel$Input;", "onCodeChanged", "associated0", "", "onSubmitCode", "getOnSubmitCode", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnSubmitCode() {
                return Input.access$getOnSubmitCode$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
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
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0082 ¨\u0006\t"}, d2 = {"Lcom/polymarket/usviewmodels/WaitlistInviteCodeViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "callbacks", "Lcom/polymarket/usviewmodels/WaitlistInviteCodeViewModel$Callbacks;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001%B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB)\b\u0016\u0012\u001e\b\u0002\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\rJ\u0015\u0010\u0015\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J0\u0010\u001d\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010\u001eJ0\u0010\u001f\u001a\u00060\u0004j\u0002`\u00052\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000bH\u0082 ¢\u0006\u0002\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\"2\u0006\u0010#\u001a\u00020\u001aH\u0016J\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\"2\u0006\u0010#\u001a\u00020\u001aH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R'\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006&"}, d2 = {"Lcom/polymarket/usviewmodels/WaitlistInviteCodeViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onCodeValid", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "hashCode", "", "getOnCodeValid", "()Lkotlin/jvm/functions/Function1;", "Swift_onCodeValid", "(J)Lkotlin/jvm/functions/Function1;", "Swift_constructor_0", "(Lkotlin/jvm/functions/Function1;)J", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Callbacks(Function1<? super Continuation<? super Unit>, ? extends Object> function1) {
            function1.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function1);
        }

        private final native long Swift_constructor_0(Function1<? super Continuation<? super Unit>, ? extends Object> onCodeValid);

        private final native Function1<Continuation<? super Unit>, Object> Swift_onCodeValid(long Swift_peer);

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
            if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
                return false;
            }
            return true;
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final Function1<Continuation<? super Unit>, Object> getOnCodeValid() {
            return Swift_onCodeValid(this.Swift_peer);
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

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
        @kw5(c = "com.polymarket.usviewmodels.WaitlistInviteCodeViewModel$Callbacks$1", f = "WaitlistInviteCodeViewModel.kt", l = {42}, m = "invokeSuspend")
        /* renamed from: com.polymarket.usviewmodels.WaitlistInviteCodeViewModel$Callbacks$1, reason: invalid class name */
        /* loaded from: classes5.dex */
        public static final class AnonymousClass1 extends zei implements Function1<Continuation<? super Unit>, Object> {
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
            }

            @Override // defpackage.l81
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // defpackage.l81
            public final Object invokeSuspend(Object obj) {
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    MainActor.Companion companion = MainActor.INSTANCE;
                    C00091 c00091 = new C00091(null);
                    this.label = 1;
                    if (companion.run(c00091, this) == u85Var) {
                        return u85Var;
                    }
                }
                return Unit.INSTANCE;
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
            @kw5(c = "com.polymarket.usviewmodels.WaitlistInviteCodeViewModel$Callbacks$1$1", f = "WaitlistInviteCodeViewModel.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.polymarket.usviewmodels.WaitlistInviteCodeViewModel$Callbacks$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C00091 extends zei implements Function1<Continuation<? super Unit>, Object> {
                int label;

                public C00091(Continuation<? super C00091> continuation) {
                    super(1, continuation);
                }

                @Override // defpackage.l81
                public final Continuation<Unit> create(Continuation<?> continuation) {
                    return new C00091(continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Continuation<? super Unit> continuation) {
                    return ((C00091) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // defpackage.l81
                public final Object invokeSuspend(Object obj) {
                    u85 u85Var = u85.COROUTINE_SUSPENDED;
                    if (this.label == 0) {
                        ResultKt.a(obj);
                        return Unit.INSTANCE;
                    }
                    dmk.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Unit> continuation) {
                    return invoke2(continuation);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Unit> continuation) {
                return invoke2(continuation);
            }
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ Callbacks(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new AnonymousClass1(null) : function1);
        }
    }

    public WaitlistInviteCodeViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    public /* synthetic */ WaitlistInviteCodeViewModel(Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Callbacks(null, 1, null) : callbacks);
    }
}
