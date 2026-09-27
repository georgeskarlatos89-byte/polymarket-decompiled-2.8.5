package com.polymarket.usviewmodels;

import com.polymarket.data.EAmount;
import com.polymarket.data.EPaymentSelection;
import com.polymarket.data.ETransaction;
import com.polymarket.designtokens.DesignTokens;
import com.polymarket.designtokens.Icon;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.nyi;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Identifiable;
import skip.lib.MutableStruct;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 V2\u00020\u0001:\u0005RSTUVB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB-\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0007\u0010\u0010J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010\u0019\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\nH\u0082 J\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010\u001f\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082 J\u0017\u0010$\u001a\u0004\u0018\u00010\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010%\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\rH\u0082 J\u0015\u0010*\u001a\u00020'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010/\u001a\u0004\u0018\u00010,2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00104\u001a\u0002012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00108\u001a\u0002062\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010=\u001a\u00020:2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010@\u001a\u0004\u0018\u00010:2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010E\u001a\u00020B2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010F\u001a\u00020\u001aH\u0016J\u0015\u0010G\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010H\u001a\u00020\u001a2\u0006\u0010I\u001a\u00020JJ\u001d\u0010K\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010I\u001a\u00020JH\u0082 J\u0016\u0010L\u001a\b\u0012\u0004\u0012\u00020N0M2\u0006\u0010O\u001a\u00020PH\u0016J\u0017\u0010Q\u001a\b\u0012\u0004\u0012\u00020N0M2\u0006\u0010O\u001a\u00020PH\u0082 R0\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R(\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010+\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u00100\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u00105\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b5\u00107R\u0011\u00109\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010>\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\b?\u0010<R\u0011\u0010A\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006W"}, d2 = {"Lcom/polymarket/usviewmodels/TransactionSuccessViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "transactions", "", "Lcom/polymarket/data/ETransaction;", "paymentSelection", "Lcom/polymarket/data/EPaymentSelection;", "callbacks", "Lcom/polymarket/usviewmodels/TransactionSuccessViewModel$Callbacks;", "(Ljava/util/List;Lcom/polymarket/data/EPaymentSelection;Lcom/polymarket/usviewmodels/TransactionSuccessViewModel$Callbacks;)V", "newValue", "Lcom/polymarket/usviewmodels/TransactionSuccessViewModel$TransactionRow;", "displayRows", "getDisplayRows", "()Ljava/util/List;", "setDisplayRows", "(Ljava/util/List;)V", "Swift_displayRows", "Swift_displayRows_set", "", "value", "getTransactions", "setTransactions", "Swift_transactions", "Swift_transactions_set", "getPaymentSelection", "()Lcom/polymarket/data/EPaymentSelection;", "setPaymentSelection", "(Lcom/polymarket/data/EPaymentSelection;)V", "Swift_paymentSelection", "Swift_paymentSelection_set", "transactionDate", "Ljava/util/Date;", "getTransactionDate", "()Ljava/util/Date;", "Swift_transactionDate", "transactionType", "Lcom/polymarket/data/ETransaction$TransactionType;", "getTransactionType", "()Lcom/polymarket/data/ETransaction$TransactionType;", "Swift_transactionType", "totalAmount", "Lcom/polymarket/data/EAmount;", "getTotalAmount", "()Lcom/polymarket/data/EAmount;", "Swift_totalAmount", "isMultipleTransactions", "", "()Z", "Swift_isMultipleTransactions", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "getTitle", "()Ljava/lang/String;", "Swift_title", "subtitle", "getSubtitle", "Swift_subtitle", "headerIcon", "Lcom/polymarket/usviewmodels/TransactionSuccessViewModel$HeaderIcon;", "getHeaderIcon", "()Lcom/polymarket/usviewmodels/TransactionSuccessViewModel$HeaderIcon;", "Swift_headerIcon", "setup", "Swift_setup_1", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/TransactionSuccessViewModel$Input;", "Swift_sendInput_2", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "TransactionRow", "HeaderIcon", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TransactionSuccessViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/TransactionSuccessViewModel$HeaderIcon;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "success", "pending", "declined", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class HeaderIcon implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ HeaderIcon[] $VALUES;
        public static final HeaderIcon success = new HeaderIcon("success", 0);
        public static final HeaderIcon pending = new HeaderIcon("pending", 1);
        public static final HeaderIcon declined = new HeaderIcon("declined", 2);

        private static final /* synthetic */ HeaderIcon[] $values() {
            return new HeaderIcon[]{success, pending, declined};
        }

        static {
            HeaderIcon[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private HeaderIcon(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static HeaderIcon valueOf(String str) {
            return (HeaderIcon) Enum.valueOf(HeaderIcon.class, str);
        }

        public static HeaderIcon[] values() {
            return (HeaderIcon[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0082 j\u0002\b\u0005¨\u0006\r"}, d2 = {"Lcom/polymarket/usviewmodels/TransactionSuccessViewModel$Input;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "onCompleted", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Input implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Input[] $VALUES;
        public static final Input onCompleted = new Input("onCompleted", 0);

        private static final /* synthetic */ Input[] $values() {
            return new Input[]{onCompleted};
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

    public /* synthetic */ TransactionSuccessViewModel(List list, EPaymentSelection ePaymentSelection, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : ePaymentSelection, (i & 4) != 0 ? new Callbacks(null, 1, null) : callbacks);
    }

    private final native List<TransactionRow> Swift_displayRows(long Swift_peer);

    private final native void Swift_displayRows_set(long Swift_peer, List<TransactionRow> value);

    private final native HeaderIcon Swift_headerIcon(long Swift_peer);

    private final native boolean Swift_isMultipleTransactions(long Swift_peer);

    private final native EPaymentSelection Swift_paymentSelection(long Swift_peer);

    private final native void Swift_paymentSelection_set(long Swift_peer, EPaymentSelection value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_sendInput_2(long Swift_peer, Input input);

    private final native void Swift_setup_1(long Swift_peer);

    private final native String Swift_subtitle(long Swift_peer);

    private final native String Swift_title(long Swift_peer);

    private final native EAmount Swift_totalAmount(long Swift_peer);

    private final native Date Swift_transactionDate(long Swift_peer);

    private final native ETransaction.TransactionType Swift_transactionType(long Swift_peer);

    private final native List<ETransaction> Swift_transactions(long Swift_peer);

    private final native void Swift_transactions_set(long Swift_peer, List<ETransaction> value);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final List<TransactionRow> getDisplayRows() {
        return Swift_displayRows(getSwift_peer());
    }

    public final HeaderIcon getHeaderIcon() {
        return Swift_headerIcon(getSwift_peer());
    }

    public final EPaymentSelection getPaymentSelection() {
        return Swift_paymentSelection(getSwift_peer());
    }

    public final String getSubtitle() {
        return Swift_subtitle(getSwift_peer());
    }

    public final String getTitle() {
        return Swift_title(getSwift_peer());
    }

    public final EAmount getTotalAmount() {
        return Swift_totalAmount(getSwift_peer());
    }

    public final Date getTransactionDate() {
        return Swift_transactionDate(getSwift_peer());
    }

    public final ETransaction.TransactionType getTransactionType() {
        return Swift_transactionType(getSwift_peer());
    }

    public final List<ETransaction> getTransactions() {
        return Swift_transactions(getSwift_peer());
    }

    public final boolean isMultipleTransactions() {
        return Swift_isMultipleTransactions(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_2(getSwift_peer(), input);
    }

    public final void setDisplayRows(List<TransactionRow> list) {
        list.getClass();
        Swift_displayRows_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setPaymentSelection(EPaymentSelection ePaymentSelection) {
        Swift_paymentSelection_set(getSwift_peer(), ePaymentSelection);
    }

    public final void setTransactions(List<ETransaction> list) {
        list.getClass();
        Swift_transactions_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0082 J\u0010\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\rJ\u0011\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0082 J\u0010\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\rJ\u0011\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0082 J\u0010\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\rJ\u0011\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0082 J\u0010\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\rJ\u0011\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0082 J\u0010\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\rJ\u0011\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0082 J\u0010\u0010\u0019\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\rJ\u0011\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0082 J\u0010\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\rJ\u0011\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0082 ¨\u0006\u001d"}, d2 = {"Lcom/polymarket/usviewmodels/TransactionSuccessViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "transactions", "", "Lcom/polymarket/data/ETransaction;", "paymentSelection", "Lcom/polymarket/data/EPaymentSelection;", "callbacks", "Lcom/polymarket/usviewmodels/TransactionSuccessViewModel$Callbacks;", "mockDepositCompleted", "Lcom/polymarket/usviewmodels/TransactionSuccessViewModel;", "Swift_Companion_mockDepositCompleted_3", "mockDepositFullAdvance", "Swift_Companion_mockDepositFullAdvance_4", "mockDepositPartialAdvance", "Swift_Companion_mockDepositPartialAdvance_5", "mockDepositNoAdvance", "Swift_Companion_mockDepositNoAdvance_6", "mockDepositApplePay", "Swift_Companion_mockDepositApplePay_7", "mockWithdrawalSingle", "Swift_Companion_mockWithdrawalSingle_8", "mockWithdrawalMultipleFIFO", "Swift_Companion_mockWithdrawalMultipleFIFO_9", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(List<ETransaction> transactions, EPaymentSelection paymentSelection, Callbacks callbacks);

        private final native TransactionSuccessViewModel Swift_Companion_mockDepositApplePay_7(Callbacks callbacks);

        private final native TransactionSuccessViewModel Swift_Companion_mockDepositCompleted_3(Callbacks callbacks);

        private final native TransactionSuccessViewModel Swift_Companion_mockDepositFullAdvance_4(Callbacks callbacks);

        private final native TransactionSuccessViewModel Swift_Companion_mockDepositNoAdvance_6(Callbacks callbacks);

        private final native TransactionSuccessViewModel Swift_Companion_mockDepositPartialAdvance_5(Callbacks callbacks);

        private final native TransactionSuccessViewModel Swift_Companion_mockWithdrawalMultipleFIFO_9(Callbacks callbacks);

        private final native TransactionSuccessViewModel Swift_Companion_mockWithdrawalSingle_8(Callbacks callbacks);

        public static /* synthetic */ Unit a() {
            return mockDepositCompleted$lambda$0();
        }

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, List list, EPaymentSelection ePaymentSelection, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(list, ePaymentSelection, callbacks);
        }

        public static /* synthetic */ Unit b() {
            return mockDepositFullAdvance$lambda$1();
        }

        public static /* synthetic */ Unit c() {
            return mockDepositPartialAdvance$lambda$2();
        }

        public static /* synthetic */ Unit d() {
            return mockWithdrawalSingle$lambda$5();
        }

        public static /* synthetic */ Unit e() {
            return mockDepositApplePay$lambda$4();
        }

        public static /* synthetic */ Unit f() {
            return mockWithdrawalMultipleFIFO$lambda$6();
        }

        public static /* synthetic */ Unit g() {
            return mockDepositNoAdvance$lambda$3();
        }

        public static /* synthetic */ TransactionSuccessViewModel mockDepositApplePay$default(Companion companion, Callbacks callbacks, int i, Object obj) {
            if ((i & 1) != 0) {
                callbacks = new Callbacks(new nyi(25));
            }
            return companion.mockDepositApplePay(callbacks);
        }

        private static final Unit mockDepositApplePay$lambda$4() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ TransactionSuccessViewModel mockDepositCompleted$default(Companion companion, Callbacks callbacks, int i, Object obj) {
            if ((i & 1) != 0) {
                callbacks = new Callbacks(new nyi(23));
            }
            return companion.mockDepositCompleted(callbacks);
        }

        private static final Unit mockDepositCompleted$lambda$0() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ TransactionSuccessViewModel mockDepositFullAdvance$default(Companion companion, Callbacks callbacks, int i, Object obj) {
            if ((i & 1) != 0) {
                callbacks = new Callbacks(new nyi(26));
            }
            return companion.mockDepositFullAdvance(callbacks);
        }

        private static final Unit mockDepositFullAdvance$lambda$1() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ TransactionSuccessViewModel mockDepositNoAdvance$default(Companion companion, Callbacks callbacks, int i, Object obj) {
            if ((i & 1) != 0) {
                callbacks = new Callbacks(new nyi(27));
            }
            return companion.mockDepositNoAdvance(callbacks);
        }

        private static final Unit mockDepositNoAdvance$lambda$3() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ TransactionSuccessViewModel mockDepositPartialAdvance$default(Companion companion, Callbacks callbacks, int i, Object obj) {
            if ((i & 1) != 0) {
                callbacks = new Callbacks(new nyi(24));
            }
            return companion.mockDepositPartialAdvance(callbacks);
        }

        private static final Unit mockDepositPartialAdvance$lambda$2() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ TransactionSuccessViewModel mockWithdrawalMultipleFIFO$default(Companion companion, Callbacks callbacks, int i, Object obj) {
            if ((i & 1) != 0) {
                callbacks = new Callbacks(new nyi(28));
            }
            return companion.mockWithdrawalMultipleFIFO(callbacks);
        }

        private static final Unit mockWithdrawalMultipleFIFO$lambda$6() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ TransactionSuccessViewModel mockWithdrawalSingle$default(Companion companion, Callbacks callbacks, int i, Object obj) {
            if ((i & 1) != 0) {
                callbacks = new Callbacks(new nyi(22));
            }
            return companion.mockWithdrawalSingle(callbacks);
        }

        private static final Unit mockWithdrawalSingle$lambda$5() {
            return Unit.INSTANCE;
        }

        public final TransactionSuccessViewModel mockDepositApplePay(Callbacks callbacks) {
            callbacks.getClass();
            return Swift_Companion_mockDepositApplePay_7(callbacks);
        }

        public final TransactionSuccessViewModel mockDepositCompleted(Callbacks callbacks) {
            callbacks.getClass();
            return Swift_Companion_mockDepositCompleted_3(callbacks);
        }

        public final TransactionSuccessViewModel mockDepositFullAdvance(Callbacks callbacks) {
            callbacks.getClass();
            return Swift_Companion_mockDepositFullAdvance_4(callbacks);
        }

        public final TransactionSuccessViewModel mockDepositNoAdvance(Callbacks callbacks) {
            callbacks.getClass();
            return Swift_Companion_mockDepositNoAdvance_6(callbacks);
        }

        public final TransactionSuccessViewModel mockDepositPartialAdvance(Callbacks callbacks) {
            callbacks.getClass();
            return Swift_Companion_mockDepositPartialAdvance_5(callbacks);
        }

        public final TransactionSuccessViewModel mockWithdrawalMultipleFIFO(Callbacks callbacks) {
            callbacks.getClass();
            return Swift_Companion_mockWithdrawalMultipleFIFO_9(callbacks);
        }

        public final TransactionSuccessViewModel mockWithdrawalSingle(Callbacks callbacks) {
            callbacks.getClass();
            return Swift_Companion_mockWithdrawalSingle_8(callbacks);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 U2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0002TUB\u001f\b\u0016\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB9\b\u0016\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u000b\u0010\u0016B\u0011\b\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u0018J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0015\u0010\u001f\u001a\u00020\u001e2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\f\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\u0015\u0010)\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0017\u0010/\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u00100\u001a\u00020\u001e2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0082 J\u0015\u00105\u001a\u00020\u00102\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u00106\u001a\u00020\u001e2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u0013\u001a\u00020\u0010H\u0082 J\u0015\u00109\u001a\u00020\u00122\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u0010;\u001a\u00020\u00122\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u0010@\u001a\u00020\u00152\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010A\u001a\u00020\u001e2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u0013\u001a\u00020\u0015H\u0082 J7\u0010B\u001a\u00060\u0007j\u0002`\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0082 J\u0015\u0010C\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u0017\u001a\u00020\u0003H\u0082 J\b\u0010O\u001a\u00020\u0003H\u0016J\u0016\u0010P\u001a\b\u0012\u0004\u0012\u00020#0Q2\u0006\u0010R\u001a\u00020%H\u0016J\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020#0Q2\u0006\u0010R\u001a\u00020%H\u0082 R\u001e\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010&\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R(\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010*\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010\u000f\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b:\u00108R$\u0010\u0014\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R(\u0010D\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001e\u0018\u00010EX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010J\u001a\u00020%X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N¨\u0006V"}, d2 = {"Lcom/polymarket/usviewmodels/TransactionSuccessViewModel$TransactionRow;", "Lskip/lib/Identifiable;", "Ljava/util/UUID;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ICON, "Lcom/polymarket/designtokens/Icon;", "iconColor", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "value", "style", "Lcom/polymarket/usviewmodels/TransactionSuccessViewModel$TransactionRow$Style;", "(Lcom/polymarket/designtokens/Icon;Lcom/polymarket/designtokens/DesignTokens$SemanticColor;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/usviewmodels/TransactionSuccessViewModel$TransactionRow$Style;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()Ljava/util/UUID;", "Swift_id", "newValue", "getIcon", "()Lcom/polymarket/designtokens/Icon;", "setIcon", "(Lcom/polymarket/designtokens/Icon;)V", "Swift_icon", "Swift_icon_set", "getIconColor", "()Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "setIconColor", "(Lcom/polymarket/designtokens/DesignTokens$SemanticColor;)V", "Swift_iconColor", "Swift_iconColor_set", "getTitle", "()Ljava/lang/String;", "Swift_title", "getValue", "Swift_value", "getStyle", "()Lcom/polymarket/usviewmodels/TransactionSuccessViewModel$TransactionRow$Style;", "setStyle", "(Lcom/polymarket/usviewmodels/TransactionSuccessViewModel$TransactionRow$Style;)V", "Swift_style", "Swift_style_set", "Swift_constructor_0", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Style", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class TransactionRow implements Identifiable<UUID>, MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/TransactionSuccessViewModel$TransactionRow$Style;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "normal", "emphasized", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Style implements SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ Style[] $VALUES;
            public static final Style normal = new Style("normal", 0);
            public static final Style emphasized = new Style("emphasized", 1);

            private static final /* synthetic */ Style[] $values() {
                return new Style[]{normal, emphasized};
            }

            static {
                Style[] $values = $values();
                $VALUES = $values;
                $ENTRIES = ww4.b($values);
                INSTANCE = new Companion(null);
            }

            private Style(String str, int i) {
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static ug7 getEntries() {
                return $ENTRIES;
            }

            public static Style valueOf(String str) {
                return (Style) Enum.valueOf(Style.class, str);
            }

            public static Style[] values() {
                return (Style[]) $VALUES.clone();
            }

            @Override // skip.lib.SwiftProjecting
            public Function0<Object> Swift_projection(int options) {
                return Swift_projectionImpl(options);
            }
        }

        public /* synthetic */ TransactionRow(Icon icon, DesignTokens.SemanticColor semanticColor, String str, String str2, Style style, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : icon, (i & 2) != 0 ? DesignTokens.SemanticColor.INSTANCE.getContentPrimary() : semanticColor, str, str2, (i & 16) != 0 ? Style.normal : style);
        }

        private final native long Swift_constructor_0(Icon icon, DesignTokens.SemanticColor iconColor, String title, String value, Style style);

        private final native long Swift_constructor_1(MutableStruct copy);

        private final native Icon Swift_icon(long Swift_peer);

        private final native DesignTokens.SemanticColor Swift_iconColor(long Swift_peer);

        private final native void Swift_iconColor_set(long Swift_peer, DesignTokens.SemanticColor value);

        private final native void Swift_icon_set(long Swift_peer, Icon value);

        private final native UUID Swift_id(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native Style Swift_style(long Swift_peer);

        private final native void Swift_style_set(long Swift_peer, Style value);

        private final native String Swift_title(long Swift_peer);

        private final native String Swift_value(long Swift_peer);

        @Override // skip.bridge.SwiftPeerBridged
        /* renamed from: Swift_peer, reason: from getter */
        public long getSwift_peer() {
            return this.Swift_peer;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.MutableStruct
        public void didmutate() {
            super.didmutate();
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

        public final Icon getIcon() {
            return Swift_icon(this.Swift_peer);
        }

        public final DesignTokens.SemanticColor getIconColor() {
            return Swift_iconColor(this.Swift_peer);
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public UUID getId2() {
            return Swift_id(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public int getSmutatingcount() {
            return this.smutatingcount;
        }

        public final Style getStyle() {
            return Swift_style(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public Function1<Object, Unit> getSupdate() {
            return this.supdate;
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getTitle() {
            return Swift_title(this.Swift_peer);
        }

        public final String getValue() {
            return Swift_value(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new TransactionRow(this);
        }

        public final void setIcon(Icon icon) {
            willmutate();
            try {
                Swift_icon_set(this.Swift_peer, icon);
            } finally {
                didmutate();
            }
        }

        public final void setIconColor(DesignTokens.SemanticColor semanticColor) {
            semanticColor.getClass();
            willmutate();
            try {
                Swift_iconColor_set(this.Swift_peer, semanticColor);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void setSmutatingcount(int i) {
            this.smutatingcount = i;
        }

        public final void setStyle(Style style) {
            style.getClass();
            willmutate();
            try {
                Swift_style_set(this.Swift_peer, style);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void setSupdate(Function1<Object, Unit> function1) {
            this.supdate = function1;
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ UUID getId() {
            return getId2();
        }

        public TransactionRow(Icon icon, DesignTokens.SemanticColor semanticColor, String str, String str2, Style style) {
            semanticColor.getClass();
            str.getClass();
            str2.getClass();
            style.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(icon, semanticColor, str, str2, style);
        }

        public TransactionRow(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private TransactionRow(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_1(mutableStruct);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\b\u0010\rJ\u0006\u0010\u0012\u001a\u00020\fJ\u0015\u0010\u0013\u001a\u00020\f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010\u001d\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082 J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\u0006\u0010\u001f\u001a\u00020\u0019H\u0016J\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\u0006\u0010\u001f\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lcom/polymarket/usviewmodels/TransactionSuccessViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onCompleted", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnCompleted", "()Lkotlin/jvm/functions/Function0;", "Swift_onCompleted", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Callbacks(Function0<Unit> function0) {
            function0.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function0);
        }

        private final native long Swift_constructor_0(Function0<Unit> onCompleted);

        private final native Function0<Unit> Swift_onCompleted(long Swift_peer);

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

        public final Function0<Unit> getOnCompleted() {
            return Swift_onCompleted(this.Swift_peer);
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
            this((i & 1) != 0 ? new nyi(21) : function0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionSuccessViewModel(List<ETransaction> list, EPaymentSelection ePaymentSelection, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, list, ePaymentSelection, callbacks), (SwiftPeerMarker) null);
        list.getClass();
        callbacks.getClass();
    }

    public TransactionSuccessViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }
}
