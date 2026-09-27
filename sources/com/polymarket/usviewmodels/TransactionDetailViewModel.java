package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.APIFailureActionUS;
import com.polymarket.data.EAccountActivity;
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
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0007\u0018\u0000 X2\u00020\u0001:\u0007RSTUVWXB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rJ\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u0017\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001c\u0010 \u001a\u0004\u0018\u00010\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 ¢\u0006\u0002\u0010!J\u0015\u0010&\u001a\u00020#2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010)\u001a\u0004\u0018\u00010#2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010.\u001a\u00020+2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00100\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00103\u001a\u00020#2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00108\u001a\u0002052\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010;\u001a\u00020#2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010>\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010@\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010E\u001a\u00020B2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010F\u001a\u00020GH\u0016J\u0015\u0010H\u001a\u00020G2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010I\u001a\u00020G2\u0006\u0010J\u001a\u00020KJ\u001d\u0010L\u001a\u00020G2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010J\u001a\u00020KH\u0082 J\u0016\u0010M\u001a\b\u0012\u0004\u0012\u00020O0N2\u0006\u0010P\u001a\u00020\u001dH\u0016J\u0017\u0010Q\u001a\b\u0012\u0004\u0012\u00020O0N2\u0006\u0010P\u001a\u00020\u001dH\u0082 R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010'\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b(\u0010%R\u0011\u0010*\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010/\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b/\u0010\u0016R\u0011\u00101\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b2\u0010%R\u0011\u00104\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u00109\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b:\u0010%R\u0011\u0010<\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b=\u0010\u0016R\u0011\u0010?\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b?\u0010\u0016R\u0011\u0010A\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006Y"}, d2 = {"Lcom/polymarket/usviewmodels/TransactionDetailViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "Lcom/polymarket/data/EAccountActivity;", "callbacks", "Lcom/polymarket/usviewmodels/TransactionDetailViewModel$Callbacks;", "(Lcom/polymarket/data/EAccountActivity;Lcom/polymarket/usviewmodels/TransactionDetailViewModel$Callbacks;)V", "displayRows", "", "Lcom/polymarket/usviewmodels/TransactionDetailViewModel$TransactionRow;", "getDisplayRows", "()Ljava/util/List;", "Swift_displayRows", "isCancelling", "", "()Z", "Swift_isCancelling", "failureCTAButtons", "Lcom/polymarket/usviewmodels/TransactionDetailViewModel$FailureCTAButton;", "getFailureCTAButtons", "Swift_failureCTAButtons", "dispatchingFailureButtonIndex", "", "getDispatchingFailureButtonIndex", "()Ljava/lang/Integer;", "Swift_dispatchingFailureButtonIndex", "(J)Ljava/lang/Integer;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "getTitle", "()Ljava/lang/String;", "Swift_title", "subtitle", "getSubtitle", "Swift_subtitle", "headerIcon", "Lcom/polymarket/usviewmodels/TransactionDetailViewModel$HeaderIcon;", "getHeaderIcon", "()Lcom/polymarket/usviewmodels/TransactionDetailViewModel$HeaderIcon;", "Swift_headerIcon", "isCancellable", "Swift_isCancellable", "cancelButtonTitle", "getCancelButtonTitle", "Swift_cancelButtonTitle", "footerAction", "Lcom/polymarket/usviewmodels/TransactionDetailViewModel$FooterAction;", "getFooterAction", "()Lcom/polymarket/usviewmodels/TransactionDetailViewModel$FooterAction;", "Swift_footerAction", "footerButtonTitle", "getFooterButtonTitle", "Swift_footerButtonTitle", "footerButtonIsLoading", "getFooterButtonIsLoading", "Swift_footerButtonIsLoading", "isDeposit", "Swift_isDeposit", "transactionDate", "Ljava/util/Date;", "getTransactionDate", "()Ljava/util/Date;", "Swift_transactionDate", "setup", "", "Swift_setup_1", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/TransactionDetailViewModel$Input;", "Swift_sendInput_2", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Callbacks", "TransactionRow", "FooterAction", "FailureCTAButton", "HeaderIcon", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TransactionDetailViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/TransactionDetailViewModel$HeaderIcon;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "success", "pending", "declined", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    public /* synthetic */ TransactionDetailViewModel(EAccountActivity eAccountActivity, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eAccountActivity, (i & 2) != 0 ? new Callbacks(null, null, null, 7, null) : callbacks);
    }

    private final native String Swift_cancelButtonTitle(long Swift_peer);

    private final native Integer Swift_dispatchingFailureButtonIndex(long Swift_peer);

    private final native List<TransactionRow> Swift_displayRows(long Swift_peer);

    private final native List<FailureCTAButton> Swift_failureCTAButtons(long Swift_peer);

    private final native FooterAction Swift_footerAction(long Swift_peer);

    private final native boolean Swift_footerButtonIsLoading(long Swift_peer);

    private final native String Swift_footerButtonTitle(long Swift_peer);

    private final native HeaderIcon Swift_headerIcon(long Swift_peer);

    private final native boolean Swift_isCancellable(long Swift_peer);

    private final native boolean Swift_isCancelling(long Swift_peer);

    private final native boolean Swift_isDeposit(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_sendInput_2(long Swift_peer, Input input);

    private final native void Swift_setup_1(long Swift_peer);

    private final native String Swift_subtitle(long Swift_peer);

    private final native String Swift_title(long Swift_peer);

    private final native Date Swift_transactionDate(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String getCancelButtonTitle() {
        return Swift_cancelButtonTitle(getSwift_peer());
    }

    public final Integer getDispatchingFailureButtonIndex() {
        return Swift_dispatchingFailureButtonIndex(getSwift_peer());
    }

    public final List<TransactionRow> getDisplayRows() {
        return Swift_displayRows(getSwift_peer());
    }

    public final List<FailureCTAButton> getFailureCTAButtons() {
        return Swift_failureCTAButtons(getSwift_peer());
    }

    public final FooterAction getFooterAction() {
        return Swift_footerAction(getSwift_peer());
    }

    public final boolean getFooterButtonIsLoading() {
        return Swift_footerButtonIsLoading(getSwift_peer());
    }

    public final String getFooterButtonTitle() {
        return Swift_footerButtonTitle(getSwift_peer());
    }

    public final HeaderIcon getHeaderIcon() {
        return Swift_headerIcon(getSwift_peer());
    }

    public final String getSubtitle() {
        return Swift_subtitle(getSwift_peer());
    }

    public final String getTitle() {
        return Swift_title(getSwift_peer());
    }

    public final Date getTransactionDate() {
        return Swift_transactionDate(getSwift_peer());
    }

    public final boolean isCancellable() {
        return Swift_isCancellable(getSwift_peer());
    }

    public final boolean isCancelling() {
        return Swift_isCancelling(getSwift_peer());
    }

    public final boolean isDeposit() {
        return Swift_isDeposit(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_2(getSwift_peer(), input);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0016B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0017"}, d2 = {"Lcom/polymarket/usviewmodels/TransactionDetailViewModel$FooterAction;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "cancel", "contactSupport", "failureCTA", "done", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class FooterAction implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ FooterAction[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final FooterAction cancel = new FooterAction("cancel", 0, "cancel", null, 2, null);
        public static final FooterAction contactSupport = new FooterAction("contactSupport", 1, "contactSupport", null, 2, null);
        public static final FooterAction failureCTA = new FooterAction("failureCTA", 2, "failureCTA", null, 2, null);
        public static final FooterAction done = new FooterAction("done", 3, "done", null, 2, null);

        private static final /* synthetic */ FooterAction[] $values() {
            return new FooterAction[]{cancel, contactSupport, failureCTA, done};
        }

        static {
            FooterAction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ FooterAction(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static FooterAction valueOf(String str) {
            return (FooterAction) Enum.valueOf(FooterAction.class, str);
        }

        public static FooterAction[] values() {
            return (FooterAction[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/TransactionDetailViewModel$FooterAction$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usviewmodels/TransactionDetailViewModel$FooterAction;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final FooterAction init(String rawValue) {
                rawValue.getClass();
                switch (rawValue.hashCode()) {
                    case -1367724422:
                        if (!rawValue.equals("cancel")) {
                            return null;
                        }
                        return FooterAction.cancel;
                    case 3089282:
                        if (rawValue.equals("done")) {
                            return FooterAction.done;
                        }
                        return null;
                    case 1036644390:
                        if (rawValue.equals("failureCTA")) {
                            return FooterAction.failureCTA;
                        }
                        return null;
                    case 1988693903:
                        if (rawValue.equals("contactSupport")) {
                            return FooterAction.contactSupport;
                        }
                        return null;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private FooterAction(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00132\u00020\u0001:\u0003\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/polymarket/usviewmodels/TransactionDetailViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnFooterSelectCase", "OnFailureButtonSelectCase", "Companion", "Lcom/polymarket/usviewmodels/TransactionDetailViewModel$Input$OnFailureButtonSelectCase;", "Lcom/polymarket/usviewmodels/TransactionDetailViewModel$Input$OnFooterSelectCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/TransactionDetailViewModel$Input$OnFailureButtonSelectCase;", "Lcom/polymarket/usviewmodels/TransactionDetailViewModel$Input;", "associated0", "", "<init>", "(I)V", "getAssociated0", "()I", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnFailureButtonSelectCase extends Input {
            private final int associated0;

            public OnFailureButtonSelectCase(int i) {
                super(null);
                this.associated0 = i;
            }

            public final int getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/TransactionDetailViewModel$Input$OnFooterSelectCase;", "Lcom/polymarket/usviewmodels/TransactionDetailViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/TransactionDetailViewModel$FooterAction;", "<init>", "(Lcom/polymarket/usviewmodels/TransactionDetailViewModel$FooterAction;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/TransactionDetailViewModel$FooterAction;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnFooterSelectCase extends Input {
            private final FooterAction associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnFooterSelectCase(FooterAction footerAction) {
                super(null);
                footerAction.getClass();
                this.associated0 = footerAction;
            }

            public final FooterAction getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/polymarket/usviewmodels/TransactionDetailViewModel$Input$Companion;", "", "<init>", "()V", "onFooterSelect", "Lcom/polymarket/usviewmodels/TransactionDetailViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/TransactionDetailViewModel$FooterAction;", "onFailureButtonSelect", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input onFailureButtonSelect(int associated0) {
                return new OnFailureButtonSelectCase(associated0);
            }

            public final Input onFooterSelect(FooterAction associated0) {
                associated0.getClass();
                return new OnFooterSelectCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/TransactionDetailViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "Lcom/polymarket/data/EAccountActivity;", "callbacks", "Lcom/polymarket/usviewmodels/TransactionDetailViewModel$Callbacks;", "FooterAction", "Lcom/polymarket/usviewmodels/TransactionDetailViewModel$FooterAction;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(EAccountActivity activity, Callbacks callbacks);

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, EAccountActivity eAccountActivity, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(eAccountActivity, callbacks);
        }

        public final FooterAction FooterAction(String rawValue) {
            rawValue.getClass();
            return FooterAction.INSTANCE.init(rawValue);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001-B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u0015\u0010\u0017\u001a\u00020\u00162\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0015\u0010!\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010$\u001a\u00020\r2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010'\u001a\u00020\u000f2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001d\u0010(\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001b0*2\u0006\u0010+\u001a\u00020\u001dH\u0016J\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001b0*2\u0006\u0010+\u001a\u00020\u001dH\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u001e\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006."}, d2 = {"Lcom/polymarket/usviewmodels/TransactionDetailViewModel$FailureCTAButton;", "Lskip/lib/Identifiable;", "Ljava/util/UUID;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "style", "Lcom/polymarket/data/APIFailureActionUS$Button$Style;", "(Ljava/lang/String;Lcom/polymarket/data/APIFailureActionUS$Button$Style;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()Ljava/util/UUID;", "Swift_id", "getTitle", "()Ljava/lang/String;", "Swift_title", "getStyle", "()Lcom/polymarket/data/APIFailureActionUS$Button$Style;", "Swift_style", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class FailureCTAButton implements Identifiable<UUID>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public FailureCTAButton(String str, APIFailureActionUS.Button.Style style) {
            str.getClass();
            style.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, style);
        }

        private final native long Swift_constructor_0(String title, APIFailureActionUS.Button.Style style);

        private final native UUID Swift_id(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native APIFailureActionUS.Button.Style Swift_style(long Swift_peer);

        private final native String Swift_title(long Swift_peer);

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

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public UUID getId2() {
            return Swift_id(this.Swift_peer);
        }

        public final APIFailureActionUS.Button.Style getStyle() {
            return Swift_style(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getTitle() {
            return Swift_title(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ UUID getId() {
            return getId2();
        }

        public FailureCTAButton(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 L2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001LB\u001f\b\u0016\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB/\b\u0016\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u000b\u0010\u0014B\u0011\b\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u0016J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0015\u0010\u001d\u001a\u00020\u001c2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\f\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0015\u0010'\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0017\u0010-\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010.\u001a\u00020\u001c2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0082 J\u0015\u00103\u001a\u00020\u00102\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u00104\u001a\u00020\u001c2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u0013\u001a\u00020\u0010H\u0082 J\u0015\u00107\u001a\u00020\u00122\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u00109\u001a\u00020\u00122\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J/\u0010:\u001a\u00060\u0007j\u0002`\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0082 J\u0015\u0010;\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u0015\u001a\u00020\u0003H\u0082 J\b\u0010G\u001a\u00020\u0003H\u0016J\u0016\u0010H\u001a\b\u0012\u0004\u0012\u00020!0I2\u0006\u0010J\u001a\u00020#H\u0016J\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020!0I2\u0006\u0010J\u001a\u00020#H\u0082 R\u001e\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010$\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R(\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010(\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010\u000f\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b8\u00106R(\u0010<\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001c\u0018\u00010=X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010B\u001a\u00020#X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006M"}, d2 = {"Lcom/polymarket/usviewmodels/TransactionDetailViewModel$TransactionRow;", "Lskip/lib/Identifiable;", "Ljava/util/UUID;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ICON, "Lcom/polymarket/designtokens/Icon;", "iconColor", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "value", "(Lcom/polymarket/designtokens/Icon;Lcom/polymarket/designtokens/DesignTokens$SemanticColor;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()Ljava/util/UUID;", "Swift_id", "newValue", "getIcon", "()Lcom/polymarket/designtokens/Icon;", "setIcon", "(Lcom/polymarket/designtokens/Icon;)V", "Swift_icon", "Swift_icon_set", "getIconColor", "()Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "setIconColor", "(Lcom/polymarket/designtokens/DesignTokens$SemanticColor;)V", "Swift_iconColor", "Swift_iconColor_set", "getTitle", "()Ljava/lang/String;", "Swift_title", "getValue", "Swift_value", "Swift_constructor_0", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class TransactionRow implements Identifiable<UUID>, MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        public TransactionRow(Icon icon, DesignTokens.SemanticColor semanticColor, String str, String str2) {
            semanticColor.getClass();
            str.getClass();
            str2.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(icon, semanticColor, str, str2);
        }

        private final native long Swift_constructor_0(Icon icon, DesignTokens.SemanticColor iconColor, String title, String value);

        private final native long Swift_constructor_1(MutableStruct copy);

        private final native Icon Swift_icon(long Swift_peer);

        private final native DesignTokens.SemanticColor Swift_iconColor(long Swift_peer);

        private final native void Swift_iconColor_set(long Swift_peer, DesignTokens.SemanticColor value);

        private final native void Swift_icon_set(long Swift_peer, Icon value);

        private final native UUID Swift_id(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

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

        public TransactionRow(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ TransactionRow(Icon icon, DesignTokens.SemanticColor semanticColor, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : icon, (i & 2) != 0 ? DesignTokens.SemanticColor.INSTANCE.getContentPrimary() : semanticColor, str, str2);
        }

        private TransactionRow(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_1(mutableStruct);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionDetailViewModel(EAccountActivity eAccountActivity, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, eAccountActivity, callbacks), (SwiftPeerMarker) null);
        eAccountActivity.getClass();
        callbacks.getClass();
    }

    public TransactionDetailViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\fJ\u0015\u0010\u0015\u001a\u00020\f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J7\u0010#\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082 J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190\u000b2\u0006\u0010%\u001a\u00020\u001bH\u0016J\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190\u000b2\u0006\u0010%\u001a\u00020\u001bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001d¨\u0006("}, d2 = {"Lcom/polymarket/usviewmodels/TransactionDetailViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onDismiss", "Lkotlin/Function0;", "", "onContactSupport", "onCancelled", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnDismiss", "()Lkotlin/jvm/functions/Function0;", "Swift_onDismiss", "getOnContactSupport", "Swift_onContactSupport", "getOnCancelled", "Swift_onCancelled", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function0 function0, Function0 function02, Function0 function03, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new nyi(18) : function0, (i & 2) != 0 ? new nyi(19) : function02, (i & 4) != 0 ? new nyi(20) : function03);
        }

        private final native long Swift_constructor_0(Function0<Unit> onDismiss, Function0<Unit> onContactSupport, Function0<Unit> onCancelled);

        private final native Function0<Unit> Swift_onCancelled(long Swift_peer);

        private final native Function0<Unit> Swift_onContactSupport(long Swift_peer);

        private final native Function0<Unit> Swift_onDismiss(long Swift_peer);

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
            return _init_$lambda$0();
        }

        public static /* synthetic */ Unit b() {
            return _init_$lambda$2();
        }

        public static /* synthetic */ Unit c() {
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

        public final Function0<Unit> getOnCancelled() {
            return Swift_onCancelled(this.Swift_peer);
        }

        public final Function0<Unit> getOnContactSupport() {
            return Swift_onContactSupport(this.Swift_peer);
        }

        public final Function0<Unit> getOnDismiss() {
            return Swift_onDismiss(this.Swift_peer);
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
