package com.polymarket.usviewmodels;

import com.polymarket.designtokens.Icon;
import com.polymarket.usviewmodels.AppViewModel;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ji9;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0004\u001c\u001d\u001e\u001fB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rJ\u0015\u0010\u0010\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u001d\u0010\u0015\u001a\u00020\u00122\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0082 J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0082 R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/polymarket/usviewmodels/IntegrityCheckViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "issueType", "Lcom/polymarket/usviewmodels/IntegrityCheckViewModel$IntegrityIssueType;", "callbacks", "Lcom/polymarket/usviewmodels/IntegrityCheckViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/IntegrityCheckViewModel$IntegrityIssueType;Lcom/polymarket/usviewmodels/IntegrityCheckViewModel$Callbacks;)V", "getIssueType", "()Lcom/polymarket/usviewmodels/IntegrityCheckViewModel$IntegrityIssueType;", "Swift_issueType", "sendInput", "", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/IntegrityCheckViewModel$Input;", "Swift_sendInput_1", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "IntegrityIssueType", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IntegrityCheckViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/IntegrityCheckViewModel$Input;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "onViewDidLoad", "onUpdateApp", "onContactSupport", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Input implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Input[] $VALUES;
        public static final Input onViewDidLoad = new Input("onViewDidLoad", 0);
        public static final Input onUpdateApp = new Input("onUpdateApp", 1);
        public static final Input onContactSupport = new Input("onContactSupport", 2);

        private static final /* synthetic */ Input[] $values() {
            return new Input[]{onViewDidLoad, onUpdateApp, onContactSupport};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 &2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001&B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0082 J\u0011\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0082 J\u0011\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\nH\u0082 J\u0011\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0082 J\u0011\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0082 J\u0013\u0010\u001f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\nH\u0082 J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020$H\u0016J\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020$H\u0082 R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u000f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\fR\u0011\u0010\u001a\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\fR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\fj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006'"}, d2 = {"Lcom/polymarket/usviewmodels/IntegrityCheckViewModel$IntegrityIssueType;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "expired", "jailbroken", "geoBlocked", "integrityDenied", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "getTitle", "()Ljava/lang/String;", "Swift_title", Keys.KEY_NAME, "subtitle", "getSubtitle", "Swift_subtitle", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ICON, "Lcom/polymarket/designtokens/Icon;", "getIcon", "()Lcom/polymarket/designtokens/Icon;", "Swift_icon", "buttonTitle", "getButtonTitle", "Swift_buttonTitle", "headline", "getHeadline", "Swift_headline", "secondaryButtonTitle", "getSecondaryButtonTitle", "Swift_secondaryButtonTitle", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class IntegrityIssueType implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ IntegrityIssueType[] $VALUES;
        public static final IntegrityIssueType expired = new IntegrityIssueType("expired", 0);
        public static final IntegrityIssueType jailbroken = new IntegrityIssueType("jailbroken", 1);
        public static final IntegrityIssueType geoBlocked = new IntegrityIssueType("geoBlocked", 2);
        public static final IntegrityIssueType integrityDenied = new IntegrityIssueType("integrityDenied", 3);

        private static final /* synthetic */ IntegrityIssueType[] $values() {
            return new IntegrityIssueType[]{expired, jailbroken, geoBlocked, integrityDenied};
        }

        static {
            IntegrityIssueType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private IntegrityIssueType(String str, int i) {
        }

        private final native String Swift_buttonTitle(String name);

        private final native String Swift_headline(String name);

        private final native Icon Swift_icon(String name);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native String Swift_secondaryButtonTitle(String name);

        private final native String Swift_subtitle(String name);

        private final native String Swift_title(String name);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static IntegrityIssueType valueOf(String str) {
            return (IntegrityIssueType) Enum.valueOf(IntegrityIssueType.class, str);
        }

        public static IntegrityIssueType[] values() {
            return (IntegrityIssueType[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final String getButtonTitle() {
            return Swift_buttonTitle(name());
        }

        public final String getHeadline() {
            return Swift_headline(name());
        }

        public final Icon getIcon() {
            return Swift_icon(name());
        }

        public final String getSecondaryButtonTitle() {
            return Swift_secondaryButtonTitle(name());
        }

        public final String getSubtitle() {
            return Swift_subtitle(name());
        }

        public final String getTitle() {
            return Swift_title(name());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegrityCheckViewModel(IntegrityIssueType integrityIssueType, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, integrityIssueType, callbacks), (SwiftPeerMarker) null);
        integrityIssueType.getClass();
        callbacks.getClass();
    }

    private final native IntegrityIssueType Swift_issueType(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_sendInput_1(long Swift_peer, Input input);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final IntegrityIssueType getIssueType() {
        return Swift_issueType(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_1(getSwift_peer(), input);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082 ¨\u0006\u000b"}, d2 = {"Lcom/polymarket/usviewmodels/IntegrityCheckViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "issueType", "Lcom/polymarket/usviewmodels/IntegrityCheckViewModel$IntegrityIssueType;", "callbacks", "Lcom/polymarket/usviewmodels/IntegrityCheckViewModel$Callbacks;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(IntegrityIssueType issueType, Callbacks callbacks);

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, IntegrityIssueType integrityIssueType, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(integrityIssueType, callbacks);
        }

        private Companion() {
        }
    }

    public IntegrityCheckViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    public /* synthetic */ IntegrityCheckViewModel(IntegrityIssueType integrityIssueType, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(integrityIssueType, (i & 2) != 0 ? new Callbacks(null, null, 3, null) : callbacks);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB5\b\u0016\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\b\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\rJ\u0015\u0010\u0016\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J!\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J5\u0010\"\u001a\u00060\u0004j\u0002`\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000bH\u0082 J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0$2\u0006\u0010%\u001a\u00020\u001cH\u0016J\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0$2\u0006\u0010%\u001a\u00020\u001cH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006("}, d2 = {"Lcom/polymarket/usviewmodels/IntegrityCheckViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onOpenURL", "Lkotlin/Function1;", "Ljava/net/URI;", "", "onSendEmail", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnOpenURL", "()Lkotlin/jvm/functions/Function1;", "Swift_onOpenURL", "getOnSendEmail", "Swift_onSendEmail", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((Function1<? super URI, Unit>) ((i & 1) != 0 ? new ji9(21) : function1), (Function1<? super String, Unit>) ((i & 2) != 0 ? new ji9(22) : function12));
        }

        private final native long Swift_constructor_0(Function1<? super URI, Unit> onOpenURL, Function1<? super String, Unit> onSendEmail);

        private final native Function1<URI, Unit> Swift_onOpenURL(long Swift_peer);

        private final native Function1<String, Unit> Swift_onSendEmail(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(URI uri) {
            uri.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(String str) {
            str.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(URI uri) {
            return _init_$lambda$0(uri);
        }

        public static /* synthetic */ Unit b(String str) {
            return _init_$lambda$1(str);
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

        public final Function1<URI, Unit> getOnOpenURL() {
            return Swift_onOpenURL(this.Swift_peer);
        }

        public final Function1<String, Unit> getOnSendEmail() {
            return Swift_onSendEmail(this.Swift_peer);
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

        public Callbacks(Function1<? super URI, Unit> function1, Function1<? super String, Unit> function12) {
            function1.getClass();
            function12.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function1, function12);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
