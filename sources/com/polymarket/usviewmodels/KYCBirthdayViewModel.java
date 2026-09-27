package com.polymarket.usviewmodels;

import com.polymarket.usviewmodels.AppViewModel;
import defpackage.l5a;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 =2\u00020\u0001:\u0003;<=B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001f\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rJ\u0015\u0010\u0014\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u0015\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0017\u001a\u00020\nH\u0082 J\u0015\u0010\u001d\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u001e\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0082 J\u0015\u0010!\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\"\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0082 J\u0015\u0010&\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010'\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0082 J\u0015\u0010)\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010.\u001a\u00020+2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010/\u001a\u00020\u0016H\u0016J\u0015\u00100\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u000203J\u001d\u00104\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00102\u001a\u000203H\u0082 J\u0016\u00105\u001a\b\u0012\u0004\u0012\u000207062\u0006\u00108\u001a\u000209H\u0016J\u0017\u0010:\u001a\b\u0012\u0004\u0012\u000207062\u0006\u00108\u001a\u000209H\u0082 R$\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR$\u0010#\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR\u0011\u0010(\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b(\u0010\u001aR\u0011\u0010*\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006>"}, d2 = {"Lcom/polymarket/usviewmodels/KYCBirthdayViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "initialDate", "Ljava/util/Date;", "callbacks", "Lcom/polymarket/usviewmodels/KYCBirthdayViewModel$Callbacks;", "(Ljava/util/Date;Lcom/polymarket/usviewmodels/KYCBirthdayViewModel$Callbacks;)V", "newValue", "selectedDate", "getSelectedDate", "()Ljava/util/Date;", "setSelectedDate", "(Ljava/util/Date;)V", "Swift_selectedDate", "Swift_selectedDate_set", "", "value", "", "isLoading", "()Z", "setLoading", "(Z)V", "Swift_isLoading", "Swift_isLoading_set", "isFirstResponder", "setFirstResponder", "Swift_isFirstResponder", "Swift_isFirstResponder_set", "hasInteractedWithPicker", "getHasInteractedWithPicker", "setHasInteractedWithPicker", "Swift_hasInteractedWithPicker", "Swift_hasInteractedWithPicker_set", "isBirthdayValid", "Swift_isBirthdayValid", "privacyText", "", "getPrivacyText", "()Ljava/lang/String;", "Swift_privacyText", "setup", "Swift_setup_1", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/KYCBirthdayViewModel$Input;", "Swift_sendInput_2", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KYCBirthdayViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/KYCBirthdayViewModel$Input;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "onViewDidLoad", "onContinue", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Input implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Input[] $VALUES;
        public static final Input onViewDidLoad = new Input("onViewDidLoad", 0);
        public static final Input onContinue = new Input("onContinue", 1);

        private static final /* synthetic */ Input[] $values() {
            return new Input[]{onViewDidLoad, onContinue};
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

    public /* synthetic */ KYCBirthdayViewModel(Date date, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : date, (i & 2) != 0 ? new Callbacks(null, 1, null) : callbacks);
    }

    private final native boolean Swift_hasInteractedWithPicker(long Swift_peer);

    private final native void Swift_hasInteractedWithPicker_set(long Swift_peer, boolean value);

    private final native boolean Swift_isBirthdayValid(long Swift_peer);

    private final native boolean Swift_isFirstResponder(long Swift_peer);

    private final native void Swift_isFirstResponder_set(long Swift_peer, boolean value);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native void Swift_isLoading_set(long Swift_peer, boolean value);

    private final native String Swift_privacyText(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native Date Swift_selectedDate(long Swift_peer);

    private final native void Swift_selectedDate_set(long Swift_peer, Date value);

    private final native void Swift_sendInput_2(long Swift_peer, Input input);

    private final native void Swift_setup_1(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final boolean getHasInteractedWithPicker() {
        return Swift_hasInteractedWithPicker(getSwift_peer());
    }

    public final String getPrivacyText() {
        return Swift_privacyText(getSwift_peer());
    }

    public final Date getSelectedDate() {
        return Swift_selectedDate(getSwift_peer());
    }

    public final boolean isBirthdayValid() {
        return Swift_isBirthdayValid(getSwift_peer());
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

    public final void setFirstResponder(boolean z) {
        Swift_isFirstResponder_set(getSwift_peer(), z);
    }

    public final void setHasInteractedWithPicker(boolean z) {
        Swift_hasInteractedWithPicker_set(getSwift_peer(), z);
    }

    public final void setLoading(boolean z) {
        Swift_isLoading_set(getSwift_peer(), z);
    }

    public final void setSelectedDate(Date date) {
        date.getClass();
        Swift_selectedDate_set(getSwift_peer(), (Date) StructKt.sref$default(date, null, 1, null));
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\b\u001a\u00020\u0005H\u0082 J\u001f\u0010\t\u001a\u00060\nj\u0002`\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0082 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/KYCBirthdayViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "minimumBirthDate", "Ljava/util/Date;", "getMinimumBirthDate", "()Ljava/util/Date;", "Swift_Companion_minimumBirthDate", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "initialDate", "callbacks", "Lcom/polymarket/usviewmodels/KYCBirthdayViewModel$Callbacks;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(Date initialDate, Callbacks callbacks);

        private final native Date Swift_Companion_minimumBirthDate();

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, Date date, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(date, callbacks);
        }

        public final Date getMinimumBirthDate() {
            return Swift_Companion_minimumBirthDate();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0016\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\rJ\u0015\u0010\u0014\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J!\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010\u001e\u001a\u00060\u0004j\u0002`\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0082 J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180 2\u0006\u0010!\u001a\u00020\u001aH\u0016J\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180 2\u0006\u0010!\u001a\u00020\u001aH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006$"}, d2 = {"Lcom/polymarket/usviewmodels/KYCBirthdayViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onBirthdayEntered", "Lkotlin/Function1;", "Ljava/util/Date;", "", "(Lkotlin/jvm/functions/Function1;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnBirthdayEntered", "()Lkotlin/jvm/functions/Function1;", "Swift_onBirthdayEntered", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Callbacks(Function1<? super Date, Unit> function1) {
            function1.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function1);
        }

        private final native long Swift_constructor_0(Function1<? super Date, Unit> onBirthdayEntered);

        private final native Function1<Date, Unit> Swift_onBirthdayEntered(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(Date date) {
            date.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(Date date) {
            return _init_$lambda$0(date);
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

        public final Function1<Date, Unit> getOnBirthdayEntered() {
            return Swift_onBirthdayEntered(this.Swift_peer);
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

        public /* synthetic */ Callbacks(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new l5a(11) : function1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KYCBirthdayViewModel(Date date, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, date, callbacks), (SwiftPeerMarker) null);
        callbacks.getClass();
    }

    public KYCBirthdayViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }
}
