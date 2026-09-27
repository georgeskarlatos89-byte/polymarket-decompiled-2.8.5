package com.polymarket.usviewmodels;

import com.polymarket.designtokens.Icon;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.dmk;
import defpackage.hv9;
import defpackage.kw5;
import defpackage.l5a;
import defpackage.mma;
import defpackage.u85;
import defpackage.ug7;
import defpackage.ww4;
import defpackage.zei;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
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
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 A2\u00020\u0001:\u0005=>?@AB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u0015\u0010\u0013\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u0014\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020\rH\u0082 J\u0015\u0010\u001b\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u001e\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010#\u001a\u0004\u0018\u00010 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010&\u001a\u0004\u0018\u00010\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010+\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00100\u001a\u00020-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u00101\u001a\u00020\u0015H\u0016J\u0015\u00102\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u000205J\u001d\u00106\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00104\u001a\u000205H\u0082 J\u0016\u00107\u001a\b\u0012\u0004\u0012\u000209082\u0006\u0010:\u001a\u00020;H\u0016J\u0017\u0010<\u001a\b\u0012\u0004\u0012\u000209082\u0006\u0010:\u001a\u00020;H\u0082 R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010$\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b%\u0010\u001aR\u0011\u0010'\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010,\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u0006B"}, d2 = {"Lcom/polymarket/usviewmodels/KYCStatusViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "callbacks", "Lcom/polymarket/usviewmodels/KYCStatusViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/KYCStatusViewModel$Callbacks;)V", "newValue", "Lcom/polymarket/usviewmodels/KYCStatusViewModel$UIStatus;", "currentStatus", "getCurrentStatus", "()Lcom/polymarket/usviewmodels/KYCStatusViewModel$UIStatus;", "setCurrentStatus", "(Lcom/polymarket/usviewmodels/KYCStatusViewModel$UIStatus;)V", "Swift_currentStatus", "Swift_currentStatus_set", "", "value", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "getTitle", "()Ljava/lang/String;", "Swift_title", "subtitle", "getSubtitle", "Swift_subtitle", "referrer", "Lcom/polymarket/usviewmodels/KYCStatusViewModel$Referrer;", "getReferrer", "()Lcom/polymarket/usviewmodels/KYCStatusViewModel$Referrer;", "Swift_referrer", "primaryButtonTitle", "getPrimaryButtonTitle", "Swift_primaryButtonTitle", "statusIcon", "Lcom/polymarket/designtokens/Icon;", "getStatusIcon", "()Lcom/polymarket/designtokens/Icon;", "Swift_statusIcon", "shouldShowRetry", "", "getShouldShowRetry", "()Z", "Swift_shouldShowRetry", "setup", "Swift_setup_1", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/KYCStatusViewModel$Input;", "Swift_sendInput_2", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "UIStatus", "Referrer", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KYCStatusViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0014"}, d2 = {"Lcom/polymarket/usviewmodels/KYCStatusViewModel$UIStatus;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "none", "pending", "onHold", "resumeDocv", "provisioning", "rejected", "rejectedTerminal", "resubmit", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UIStatus implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ UIStatus[] $VALUES;
        public static final UIStatus none = new UIStatus("none", 0);
        public static final UIStatus pending = new UIStatus("pending", 1);
        public static final UIStatus onHold = new UIStatus("onHold", 2);
        public static final UIStatus resumeDocv = new UIStatus("resumeDocv", 3);
        public static final UIStatus provisioning = new UIStatus("provisioning", 4);
        public static final UIStatus rejected = new UIStatus("rejected", 5);
        public static final UIStatus rejectedTerminal = new UIStatus("rejectedTerminal", 6);
        public static final UIStatus resubmit = new UIStatus("resubmit", 7);

        private static final /* synthetic */ UIStatus[] $values() {
            return new UIStatus[]{none, pending, onHold, resumeDocv, provisioning, rejected, rejectedTerminal, resubmit};
        }

        static {
            UIStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private UIStatus(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static UIStatus valueOf(String str) {
            return (UIStatus) Enum.valueOf(UIStatus.class, str);
        }

        public static UIStatus[] values() {
            return (UIStatus[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    public /* synthetic */ KYCStatusViewModel(Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Callbacks(null, null, null, null, null, null, null, 127, null) : callbacks);
    }

    private final native UIStatus Swift_currentStatus(long Swift_peer);

    private final native void Swift_currentStatus_set(long Swift_peer, UIStatus value);

    private final native String Swift_primaryButtonTitle(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native Referrer Swift_referrer(long Swift_peer);

    private final native void Swift_sendInput_2(long Swift_peer, Input input);

    private final native void Swift_setup_1(long Swift_peer);

    private final native boolean Swift_shouldShowRetry(long Swift_peer);

    private final native Icon Swift_statusIcon(long Swift_peer);

    private final native String Swift_subtitle(long Swift_peer);

    private final native String Swift_title(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final UIStatus getCurrentStatus() {
        return Swift_currentStatus(getSwift_peer());
    }

    public final String getPrimaryButtonTitle() {
        return Swift_primaryButtonTitle(getSwift_peer());
    }

    public final Referrer getReferrer() {
        return Swift_referrer(getSwift_peer());
    }

    public final boolean getShouldShowRetry() {
        return Swift_shouldShowRetry(getSwift_peer());
    }

    public final Icon getStatusIcon() {
        return Swift_statusIcon(getSwift_peer());
    }

    public final String getSubtitle() {
        return Swift_subtitle(getSwift_peer());
    }

    public final String getTitle() {
        return Swift_title(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_2(getSwift_peer(), input);
    }

    public final void setCurrentStatus(UIStatus uIStatus) {
        uIStatus.getClass();
        Swift_currentStatus_set(getSwift_peer(), uIStatus);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e2\u00020\u0001:\u0005\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/polymarket/usviewmodels/KYCStatusViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnPrimaryActionCase", "OnRetryCase", "OnSettingsCase", "OnURLSelectedCase", "Companion", "Lcom/polymarket/usviewmodels/KYCStatusViewModel$Input$OnPrimaryActionCase;", "Lcom/polymarket/usviewmodels/KYCStatusViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/KYCStatusViewModel$Input$OnSettingsCase;", "Lcom/polymarket/usviewmodels/KYCStatusViewModel$Input$OnURLSelectedCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onPrimaryAction = new OnPrimaryActionCase();
        private static final Input onRetry = new OnRetryCase();
        private static final Input onSettings = new OnSettingsCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/KYCStatusViewModel$Input$OnPrimaryActionCase;", "Lcom/polymarket/usviewmodels/KYCStatusViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPrimaryActionCase extends Input {
            public OnPrimaryActionCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/KYCStatusViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/KYCStatusViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRetryCase extends Input {
            public OnRetryCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/KYCStatusViewModel$Input$OnSettingsCase;", "Lcom/polymarket/usviewmodels/KYCStatusViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSettingsCase extends Input {
            public OnSettingsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/KYCStatusViewModel$Input$OnURLSelectedCase;", "Lcom/polymarket/usviewmodels/KYCStatusViewModel$Input;", "associated0", "Ljava/net/URI;", "<init>", "(Ljava/net/URI;)V", "getAssociated0", "()Ljava/net/URI;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnPrimaryAction$cp() {
            return onPrimaryAction;
        }

        public static final /* synthetic */ Input access$getOnRetry$cp() {
            return onRetry;
        }

        public static final /* synthetic */ Input access$getOnSettings$cp() {
            return onSettings;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/KYCStatusViewModel$Input$Companion;", "", "<init>", "()V", "onPrimaryAction", "Lcom/polymarket/usviewmodels/KYCStatusViewModel$Input;", "getOnPrimaryAction", "()Lcom/polymarket/usviewmodels/KYCStatusViewModel$Input;", "onRetry", "getOnRetry", "onSettings", "getOnSettings", "onURLSelected", "associated0", "Ljava/net/URI;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnPrimaryAction() {
                return Input.access$getOnPrimaryAction$cp();
            }

            public final Input getOnRetry() {
                return Input.access$getOnRetry$cp();
            }

            public final Input getOnSettings() {
                return Input.access$getOnSettings$cp();
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
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0082 J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0011\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0082 ¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/KYCStatusViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "callbacks", "Lcom/polymarket/usviewmodels/KYCStatusViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/KYCStatusViewModel;", "status", "Lcom/polymarket/usviewmodels/KYCStatusViewModel$UIStatus;", "Swift_Companion_mock_3", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(Callbacks callbacks);

        private final native KYCStatusViewModel Swift_Companion_mock_3(UIStatus status);

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(callbacks);
        }

        public final KYCStatusViewModel mock(UIStatus status) {
            status.getClass();
            return Swift_Companion_mock_3(status);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u008f\u0001\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u001e\b\u0002\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u000f\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\b\u0010\u0017J\u0006\u0010\u001c\u001a\u00020\fJ\u0015\u0010\u001d\u001a\u00020\f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J0\u0010*\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010+J\u001b\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u00101\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u00103\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u008a\u0001\u00104\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082 ¢\u0006\u0002\u00105J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u00107\u001a\u00020\"H\u0016J\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u00107\u001a\u00020\"H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010$R'\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b,\u0010$R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u000f8F¢\u0006\u0006\u001a\u0004\b.\u0010)R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b0\u0010$R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b2\u0010$¨\u0006:"}, d2 = {"Lcom/polymarket/usviewmodels/KYCStatusViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onStartKYC", "Lkotlin/Function0;", "", "onContactSupport", "onLogout", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "onSettings", "onURLSelected", "Ljava/net/URI;", "onShowLegalDisclaimer", "onOpenSystemSettings", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "hashCode", "", "getOnStartKYC", "()Lkotlin/jvm/functions/Function0;", "Swift_onStartKYC", "getOnContactSupport", "Swift_onContactSupport", "getOnLogout", "()Lkotlin/jvm/functions/Function1;", "Swift_onLogout", "(J)Lkotlin/jvm/functions/Function1;", "getOnSettings", "Swift_onSettings", "getOnURLSelected", "Swift_onURLSelected", "getOnShowLegalDisclaimer", "Swift_onShowLegalDisclaimer", "getOnOpenSystemSettings", "Swift_onOpenSystemSettings", "Swift_constructor_0", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)J", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function0 function0, Function0 function02, Function1 function1, Function0 function03, Function1 function12, Function0 function04, Function0 function05, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new hv9(28) : function0, (i & 2) != 0 ? new hv9(29) : function02, (i & 4) != 0 ? new AnonymousClass3(null) : function1, (i & 8) != 0 ? new mma(0) : function03, (i & 16) != 0 ? new l5a(19) : function12, (i & 32) != 0 ? new mma(1) : function04, (i & 64) != 0 ? new mma(2) : function05);
        }

        private final native long Swift_constructor_0(Function0<Unit> onStartKYC, Function0<Unit> onContactSupport, Function1<? super Continuation<? super Unit>, ? extends Object> onLogout, Function0<Unit> onSettings, Function1<? super URI, Unit> onURLSelected, Function0<Unit> onShowLegalDisclaimer, Function0<Unit> onOpenSystemSettings);

        private final native Function0<Unit> Swift_onContactSupport(long Swift_peer);

        private final native Function1<Continuation<? super Unit>, Object> Swift_onLogout(long Swift_peer);

        private final native Function0<Unit> Swift_onOpenSystemSettings(long Swift_peer);

        private final native Function0<Unit> Swift_onSettings(long Swift_peer);

        private final native Function0<Unit> Swift_onShowLegalDisclaimer(long Swift_peer);

        private final native Function0<Unit> Swift_onStartKYC(long Swift_peer);

        private final native Function1<URI, Unit> Swift_onURLSelected(long Swift_peer);

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

        private static final Unit _init_$lambda$3(URI uri) {
            uri.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$4() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$5() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a() {
            return _init_$lambda$2();
        }

        public static /* synthetic */ Unit b(URI uri) {
            return _init_$lambda$3(uri);
        }

        public static /* synthetic */ Unit c() {
            return _init_$lambda$4();
        }

        public static /* synthetic */ Unit d() {
            return _init_$lambda$5();
        }

        public static /* synthetic */ Unit e() {
            return _init_$lambda$0();
        }

        public static /* synthetic */ Unit f() {
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

        public final Function0<Unit> getOnContactSupport() {
            return Swift_onContactSupport(this.Swift_peer);
        }

        public final Function1<Continuation<? super Unit>, Object> getOnLogout() {
            return Swift_onLogout(this.Swift_peer);
        }

        public final Function0<Unit> getOnOpenSystemSettings() {
            return Swift_onOpenSystemSettings(this.Swift_peer);
        }

        public final Function0<Unit> getOnSettings() {
            return Swift_onSettings(this.Swift_peer);
        }

        public final Function0<Unit> getOnShowLegalDisclaimer() {
            return Swift_onShowLegalDisclaimer(this.Swift_peer);
        }

        public final Function0<Unit> getOnStartKYC() {
            return Swift_onStartKYC(this.Swift_peer);
        }

        public final Function1<URI, Unit> getOnURLSelected() {
            return Swift_onURLSelected(this.Swift_peer);
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
        @kw5(c = "com.polymarket.usviewmodels.KYCStatusViewModel$Callbacks$3", f = "KYCStatusViewModel.kt", l = {61}, m = "invokeSuspend")
        /* renamed from: com.polymarket.usviewmodels.KYCStatusViewModel$Callbacks$3, reason: invalid class name */
        /* loaded from: classes5.dex */
        public static final class AnonymousClass3 extends zei implements Function1<Continuation<? super Unit>, Object> {
            int label;

            public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(1, continuation);
            }

            @Override // defpackage.l81
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass3(continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                    this.label = 1;
                    if (companion.run(anonymousClass1, this) == u85Var) {
                        return u85Var;
                    }
                }
                return Unit.INSTANCE;
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
            @kw5(c = "com.polymarket.usviewmodels.KYCStatusViewModel$Callbacks$3$1", f = "KYCStatusViewModel.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.polymarket.usviewmodels.KYCStatusViewModel$Callbacks$3$1, reason: invalid class name */
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

        public Callbacks(Function0<Unit> function0, Function0<Unit> function02, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Function0<Unit> function03, Function1<? super URI, Unit> function12, Function0<Unit> function04, Function0<Unit> function05) {
            function0.getClass();
            function02.getClass();
            function1.getClass();
            function03.getClass();
            function12.getClass();
            function04.getClass();
            function05.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function0, function02, function1, function03, function12, function04, function05);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010\u0019\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001b\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J'\u0010\u001f\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0082 J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\u0019\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0082 J\b\u0010'\u001a\u00020(H\u0016J\u0015\u0010)\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020#0+2\u0006\u0010,\u001a\u00020(H\u0016J\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020#0+2\u0006\u0010,\u001a\u00020(H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006/"}, d2 = {"Lcom/polymarket/usviewmodels/KYCStatusViewModel$Referrer;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "invitedByText", "", "username", "avatarURL", "Ljava/net/URI;", "(Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getInvitedByText", "()Ljava/lang/String;", "Swift_invitedByText", "getUsername", "Swift_username", "getAvatarURL", "()Ljava/net/URI;", "Swift_avatarURL", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Referrer implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Referrer(String str, String str2, URI uri) {
            str.getClass();
            str2.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, uri);
        }

        private final native URI Swift_avatarURL(long Swift_peer);

        private final native long Swift_constructor_0(String invitedByText, String username, URI avatarURL);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native String Swift_invitedByText(long Swift_peer);

        private final native boolean Swift_isequal(Referrer lhs, Referrer rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_username(long Swift_peer);

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
            if (!(other instanceof Referrer)) {
                return false;
            }
            return Swift_isequal(this, (Referrer) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final URI getAvatarURL() {
            return Swift_avatarURL(this.Swift_peer);
        }

        public final String getInvitedByText() {
            return Swift_invitedByText(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getUsername() {
            return Swift_username(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public Referrer(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KYCStatusViewModel(Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, callbacks), (SwiftPeerMarker) null);
        callbacks.getClass();
    }

    public KYCStatusViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }
}
