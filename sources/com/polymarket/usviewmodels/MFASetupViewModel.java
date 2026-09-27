package com.polymarket.usviewmodels;

import com.polymarket.designtokens.Icon;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.ug7;
import defpackage.ww4;
import defpackage.zob;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 F2\u00020\u0001:\u0003DEFB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u0011\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u0013\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u0015\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u0017\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u001c\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u001f\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\"\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010%\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010(\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010+\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010.\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00103\u001a\u0002002\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00106\u001a\u0002002\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u00107\u001a\u000208H\u0016J\u0015\u00109\u001a\u0002082\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010:\u001a\u0002082\u0006\u0010;\u001a\u00020<J\u001d\u0010=\u001a\u0002082\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010;\u001a\u00020<H\u0082 J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?2\u0006\u0010A\u001a\u00020BH\u0016J\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020@0?2\u0006\u0010A\u001a\u00020BH\u0082 R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0014\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0016\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010 \u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b!\u0010\u001bR\u0011\u0010#\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b$\u0010\u001bR\u0011\u0010&\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b'\u0010\u001bR\u0011\u0010)\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b*\u0010\u001bR\u0011\u0010,\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b-\u0010\u001bR\u0011\u0010/\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00104\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b5\u00102¨\u0006G"}, d2 = {"Lcom/polymarket/usviewmodels/MFASetupViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "callbacks", "Lcom/polymarket/usviewmodels/MFASetupViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/MFASetupViewModel$Callbacks;)V", "isLoading", "", "()Z", "Swift_isLoading", "isPasskeyLoading", "Swift_isPasskeyLoading", "isSMSLoading", "Swift_isSMSLoading", "isMethodChoiceEnabled", "Swift_isMethodChoiceEnabled", "isSMSAvailable", "Swift_isSMSAvailable", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "getTitle", "()Ljava/lang/String;", "Swift_title", "subtitle", "getSubtitle", "Swift_subtitle", "passkeyCTATitle", "getPasskeyCTATitle", "Swift_passkeyCTATitle", "passkeyCardTitle", "getPasskeyCardTitle", "Swift_passkeyCardTitle", "passkeyCardSubtitle", "getPasskeyCardSubtitle", "Swift_passkeyCardSubtitle", "smsCardTitle", "getSmsCardTitle", "Swift_smsCardTitle", "smsCardSubtitle", "getSmsCardSubtitle", "Swift_smsCardSubtitle", "passkeyCardIcon", "Lcom/polymarket/designtokens/Icon;", "getPasskeyCardIcon", "()Lcom/polymarket/designtokens/Icon;", "Swift_passkeyCardIcon", "smsCardIcon", "getSmsCardIcon", "Swift_smsCardIcon", "setup", "", "Swift_setup_1", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/MFASetupViewModel$Input;", "Swift_sendInput_2", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MFASetupViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usviewmodels/MFASetupViewModel$Input;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "onViewDidLoad", "onSetupPasskey", "onSetupSMS", "onSettings", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Input implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Input[] $VALUES;
        public static final Input onViewDidLoad = new Input("onViewDidLoad", 0);
        public static final Input onSetupPasskey = new Input("onSetupPasskey", 1);
        public static final Input onSetupSMS = new Input("onSetupSMS", 2);
        public static final Input onSettings = new Input("onSettings", 3);

        private static final /* synthetic */ Input[] $values() {
            return new Input[]{onViewDidLoad, onSetupPasskey, onSetupSMS, onSettings};
        }

        static {
            Input[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Input(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Input valueOf(String str) {
            return (Input) Enum.valueOf(Input.class, str);
        }

        public static Input[] values() {
            return (Input[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    public /* synthetic */ MFASetupViewModel(Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Callbacks(null, null, null, null, 15, null) : callbacks);
    }

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native boolean Swift_isMethodChoiceEnabled(long Swift_peer);

    private final native boolean Swift_isPasskeyLoading(long Swift_peer);

    private final native boolean Swift_isSMSAvailable(long Swift_peer);

    private final native boolean Swift_isSMSLoading(long Swift_peer);

    private final native String Swift_passkeyCTATitle(long Swift_peer);

    private final native Icon Swift_passkeyCardIcon(long Swift_peer);

    private final native String Swift_passkeyCardSubtitle(long Swift_peer);

    private final native String Swift_passkeyCardTitle(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_sendInput_2(long Swift_peer, Input input);

    private final native void Swift_setup_1(long Swift_peer);

    private final native Icon Swift_smsCardIcon(long Swift_peer);

    private final native String Swift_smsCardSubtitle(long Swift_peer);

    private final native String Swift_smsCardTitle(long Swift_peer);

    private final native String Swift_subtitle(long Swift_peer);

    private final native String Swift_title(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String getPasskeyCTATitle() {
        return Swift_passkeyCTATitle(getSwift_peer());
    }

    public final Icon getPasskeyCardIcon() {
        return Swift_passkeyCardIcon(getSwift_peer());
    }

    public final String getPasskeyCardSubtitle() {
        return Swift_passkeyCardSubtitle(getSwift_peer());
    }

    public final String getPasskeyCardTitle() {
        return Swift_passkeyCardTitle(getSwift_peer());
    }

    public final Icon getSmsCardIcon() {
        return Swift_smsCardIcon(getSwift_peer());
    }

    public final String getSmsCardSubtitle() {
        return Swift_smsCardSubtitle(getSwift_peer());
    }

    public final String getSmsCardTitle() {
        return Swift_smsCardTitle(getSwift_peer());
    }

    public final String getSubtitle() {
        return Swift_subtitle(getSwift_peer());
    }

    public final String getTitle() {
        return Swift_title(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final boolean isMethodChoiceEnabled() {
        return Swift_isMethodChoiceEnabled(getSwift_peer());
    }

    public final boolean isPasskeyLoading() {
        return Swift_isPasskeyLoading(getSwift_peer());
    }

    public final boolean isSMSAvailable() {
        return Swift_isSMSAvailable(getSwift_peer());
    }

    public final boolean isSMSLoading() {
        return Swift_isSMSLoading(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_2(getSwift_peer(), input);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0082 J\u001a\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fJ\u0019\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0082 ¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/MFASetupViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "callbacks", "Lcom/polymarket/usviewmodels/MFASetupViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/MFASetupViewModel;", "shouldSucceed", "", "methodChoiceEnabled", "Swift_Companion_mock_3", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(Callbacks callbacks);

        private final native MFASetupViewModel Swift_Companion_mock_3(boolean shouldSucceed, boolean methodChoiceEnabled);

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(callbacks);
        }

        public static /* synthetic */ MFASetupViewModel mock$default(Companion companion, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            return companion.mock(z, z2);
        }

        public final MFASetupViewModel mock(boolean shouldSucceed, boolean methodChoiceEnabled) {
            return Swift_Companion_mock_3(shouldSucceed, methodChoiceEnabled);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MFASetupViewModel(Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, callbacks), (SwiftPeerMarker) null);
        callbacks.getClass();
    }

    public MFASetupViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBI\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\b\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\fJ\u0015\u0010\u0016\u001a\u00020\f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u001b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JE\u0010&\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082 J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b2\u0006\u0010(\u001a\u00020\u001cH\u0016J\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b2\u0006\u0010(\u001a\u00020\u001cH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001e¨\u0006+"}, d2 = {"Lcom/polymarket/usviewmodels/MFASetupViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onComplete", "Lkotlin/Function0;", "", "onCancel", "onSettings", "onSMSSetupRequested", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnComplete", "()Lkotlin/jvm/functions/Function0;", "Swift_onComplete", "getOnCancel", "Swift_onCancel", "getOnSettings", "Swift_onSettings", "getOnSMSSetupRequested", "Swift_onSMSSetupRequested", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new zob(6) : function0, (i & 2) != 0 ? new zob(7) : function02, (i & 4) != 0 ? new zob(8) : function03, (i & 8) != 0 ? new zob(9) : function04);
        }

        private final native long Swift_constructor_0(Function0<Unit> onComplete, Function0<Unit> onCancel, Function0<Unit> onSettings, Function0<Unit> onSMSSetupRequested);

        private final native Function0<Unit> Swift_onCancel(long Swift_peer);

        private final native Function0<Unit> Swift_onComplete(long Swift_peer);

        private final native Function0<Unit> Swift_onSMSSetupRequested(long Swift_peer);

        private final native Function0<Unit> Swift_onSettings(long Swift_peer);

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

        private static final Unit _init_$lambda$3() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a() {
            return _init_$lambda$3();
        }

        public static /* synthetic */ Unit b() {
            return _init_$lambda$0();
        }

        public static /* synthetic */ Unit c() {
            return _init_$lambda$1();
        }

        public static /* synthetic */ Unit d() {
            return _init_$lambda$2();
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

        public final Function0<Unit> getOnComplete() {
            return Swift_onComplete(this.Swift_peer);
        }

        public final Function0<Unit> getOnSMSSetupRequested() {
            return Swift_onSMSSetupRequested(this.Swift_peer);
        }

        public final Function0<Unit> getOnSettings() {
            return Swift_onSettings(this.Swift_peer);
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

        public Callbacks(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04) {
            function0.getClass();
            function02.getClass();
            function03.getClass();
            function04.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function0, function02, function03, function04);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
