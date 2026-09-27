package com.polymarket.data;

import com.fingerprintjs.android.fpjs_pro.g;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.polymarket.designtokens.Icon;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.woa;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MutableStruct;
import skip.lib.RawRepresentable;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u0087\u00012\u00020\u00012\u00020\u0002:\u0012~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB©\u0001\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001e¢\u0006\u0004\b\b\u0010%J\u0006\u0010*\u001a\u00020+J\u0015\u0010,\u001a\u00020+2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010-\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\b\u00100\u001a\u000201H\u0016J\u0015\u00104\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00107\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010:\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010<\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010>\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010A\u001a\u0004\u0018\u00010\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010D\u001a\u0004\u0018\u00010\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010G\u001a\u0004\u0018\u00010\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010J\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010M\u001a\u0004\u0018\u00010\u001c2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001d\u0010P\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010S\u001a\u0004\u0018\u00010!2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010V\u001a\u0004\u0018\u00010\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010WJ\u001d\u0010Y\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J \u0001\u0010Z\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010\u00112\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001eH\u0082 ¢\u0006\u0002\u0010[J\u0015\u0010^\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010a\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010d\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010i\u001a\u00020f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0010\u0010j\u001a\u0004\u0018\u00010$2\u0006\u0010k\u001a\u00020!J\u001f\u0010l\u001a\u0004\u0018\u00010$2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010m\u001a\u00020!H\u0082 J\u0015\u0010o\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010r\u001a\u0004\u0018\u00010!2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010t\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001e\u0010u\u001a\u0004\u0018\u00010\u00002\f\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00000\u001e2\u0006\u0010w\u001a\u00020\u0011J-\u0010x\u001a\u0004\u0018\u00010\u00002\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\f\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00000\u001e2\u0006\u0010w\u001a\u00020\u0011H\u0082 J\u0016\u0010z\u001a\b\u0012\u0004\u0012\u00020/0{2\u0006\u0010|\u001a\u000201H\u0016J\u0017\u0010}\u001a\b\u0012\u0004\u0012\u00020/0{2\u0006\u0010|\u001a\u000201H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010;R\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b=\u00103R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0019\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0013\u0010 \u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0013\u0010\"\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0019\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\bX\u0010OR\u0011\u0010\\\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b]\u00103R\u0011\u0010_\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b`\u00103R\u0011\u0010b\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bc\u00103R\u0011\u0010e\u001a\u00020f8F¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0011\u0010n\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bn\u0010;R\u0013\u0010p\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bq\u0010RR\u0011\u0010s\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bs\u0010;¨\u0006\u0088\u0001"}, d2 = {"Lcom/polymarket/data/EPaymentMethod;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "type", "Lcom/polymarket/data/EPaymentMethod$MethodType;", "status", "Lcom/polymarket/data/EPaymentMethod$Status;", "isDefault", "", "token", "applePay", "Lcom/polymarket/data/EPaymentMethod$ApplePay;", "googlePay", "Lcom/polymarket/data/EPaymentMethod$GooglePay;", "card", "Lcom/polymarket/data/EPaymentMethod$Card;", PlaceTypes.BANK, "Lcom/polymarket/data/EPaymentMethod$Bank;", "paypal", "Lcom/polymarket/data/EPaymentMethod$PayPal;", "depositLimits", "", "Lcom/polymarket/data/EPaymentMethod$DepositLimit;", "paymentSource", "Lcom/polymarket/data/EPaymentMethodSource;", "withdrawalAvailable", "railCapabilities", "Lcom/polymarket/data/EPaymentMethod$RailCapability;", "(Ljava/lang/String;Lcom/polymarket/data/EPaymentMethod$MethodType;Lcom/polymarket/data/EPaymentMethod$Status;ZLjava/lang/String;Lcom/polymarket/data/EPaymentMethod$ApplePay;Lcom/polymarket/data/EPaymentMethod$GooglePay;Lcom/polymarket/data/EPaymentMethod$Card;Lcom/polymarket/data/EPaymentMethod$Bank;Lcom/polymarket/data/EPaymentMethod$PayPal;Ljava/util/List;Lcom/polymarket/data/EPaymentMethodSource;Ljava/lang/Boolean;Ljava/util/List;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "other", "", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getType", "()Lcom/polymarket/data/EPaymentMethod$MethodType;", "Swift_type", "getStatus", "()Lcom/polymarket/data/EPaymentMethod$Status;", "Swift_status", "()Z", "Swift_isDefault", "getToken", "Swift_token", "getApplePay", "()Lcom/polymarket/data/EPaymentMethod$ApplePay;", "Swift_applePay", "getGooglePay", "()Lcom/polymarket/data/EPaymentMethod$GooglePay;", "Swift_googlePay", "getCard", "()Lcom/polymarket/data/EPaymentMethod$Card;", "Swift_card", "getBank", "()Lcom/polymarket/data/EPaymentMethod$Bank;", "Swift_bank", "getPaypal", "()Lcom/polymarket/data/EPaymentMethod$PayPal;", "Swift_paypal", "getDepositLimits", "()Ljava/util/List;", "Swift_depositLimits", "getPaymentSource", "()Lcom/polymarket/data/EPaymentMethodSource;", "Swift_paymentSource", "getWithdrawalAvailable", "()Ljava/lang/Boolean;", "Swift_withdrawalAvailable", "(J)Ljava/lang/Boolean;", "getRailCapabilities", "Swift_railCapabilities", "Swift_constructor_0", "(Ljava/lang/String;Lcom/polymarket/data/EPaymentMethod$MethodType;Lcom/polymarket/data/EPaymentMethod$Status;ZLjava/lang/String;Lcom/polymarket/data/EPaymentMethod$ApplePay;Lcom/polymarket/data/EPaymentMethod$GooglePay;Lcom/polymarket/data/EPaymentMethod$Card;Lcom/polymarket/data/EPaymentMethod$Bank;Lcom/polymarket/data/EPaymentMethod$PayPal;Ljava/util/List;Lcom/polymarket/data/EPaymentMethodSource;Ljava/lang/Boolean;Ljava/util/List;)J", "basicDisplayName", "getBasicDisplayName", "Swift_basicDisplayName", "displayTitle", "getDisplayTitle", "Swift_displayTitle", "detailedDisplayTitle", "getDetailedDisplayTitle", "Swift_detailedDisplayTitle", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ICON, "Lcom/polymarket/designtokens/Icon;", "getIcon", "()Lcom/polymarket/designtokens/Icon;", "Swift_icon", "railCapability", "for_", "Swift_railCapability_1", "provider", "isAvailableForWithdrawal", "Swift_isAvailableForWithdrawal", "depositRail", "getDepositRail", "Swift_depositRail", "isAvailableForDeposit", "Swift_isAvailableForDeposit", "replacementForSameCard", "in_", "preferStripe", "Swift_replacementForSameCard_2", "methods", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "RailCapability", "DepositLimit", "Status", "MethodType", "Card", "Bank", "ApplePay", "GooglePay", "PayPal", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EPaymentMethod implements SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ EPaymentMethod(String str, MethodType methodType, Status status, boolean z, String str2, ApplePay applePay, GooglePay googlePay, Card card, Bank bank, PayPal payPal, List list, EPaymentMethodSource ePaymentMethodSource, Boolean bool, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, methodType, status, z, str2, r9, r10, r11, r12, r13, r14, r15, r16, r17);
        ApplePay applePay2;
        GooglePay googlePay2;
        Card card2;
        Bank bank2;
        PayPal payPal2;
        List list3;
        EPaymentMethodSource ePaymentMethodSource2;
        Boolean bool2;
        List list4;
        if ((i & 32) != 0) {
            applePay2 = null;
        } else {
            applePay2 = applePay;
        }
        if ((i & 64) != 0) {
            googlePay2 = null;
        } else {
            googlePay2 = googlePay;
        }
        if ((i & 128) != 0) {
            card2 = null;
        } else {
            card2 = card;
        }
        if ((i & 256) != 0) {
            bank2 = null;
        } else {
            bank2 = bank;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            payPal2 = null;
        } else {
            payPal2 = payPal;
        }
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            list3 = null;
        } else {
            list3 = list;
        }
        if ((i & 2048) != 0) {
            ePaymentMethodSource2 = null;
        } else {
            ePaymentMethodSource2 = ePaymentMethodSource;
        }
        if ((i & 4096) != 0) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        if ((i & 8192) != 0) {
            list4 = null;
        } else {
            list4 = list2;
        }
    }

    private final native ApplePay Swift_applePay(long Swift_peer);

    private final native Bank Swift_bank(long Swift_peer);

    private final native String Swift_basicDisplayName(long Swift_peer);

    private final native Card Swift_card(long Swift_peer);

    private final native long Swift_constructor_0(String id, MethodType type, Status status, boolean isDefault, String token, ApplePay applePay, GooglePay googlePay, Card card, Bank bank, PayPal paypal, List<DepositLimit> depositLimits, EPaymentMethodSource paymentSource, Boolean withdrawalAvailable, List<RailCapability> railCapabilities);

    private final native List<DepositLimit> Swift_depositLimits(long Swift_peer);

    private final native EPaymentMethodSource Swift_depositRail(long Swift_peer);

    private final native String Swift_detailedDisplayTitle(long Swift_peer);

    private final native String Swift_displayTitle(long Swift_peer);

    private final native GooglePay Swift_googlePay(long Swift_peer);

    private final native Icon Swift_icon(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native boolean Swift_isAvailableForDeposit(long Swift_peer);

    private final native boolean Swift_isAvailableForWithdrawal(long Swift_peer);

    private final native boolean Swift_isDefault(long Swift_peer);

    private final native EPaymentMethodSource Swift_paymentSource(long Swift_peer);

    private final native PayPal Swift_paypal(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native List<RailCapability> Swift_railCapabilities(long Swift_peer);

    private final native RailCapability Swift_railCapability_1(long Swift_peer, EPaymentMethodSource provider);

    private final native void Swift_release(long Swift_peer);

    private final native EPaymentMethod Swift_replacementForSameCard_2(long Swift_peer, List<EPaymentMethod> methods, boolean preferStripe);

    private final native Status Swift_status(long Swift_peer);

    private final native String Swift_token(long Swift_peer);

    private final native MethodType Swift_type(long Swift_peer);

    private final native Boolean Swift_withdrawalAvailable(long Swift_peer);

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

    public final ApplePay getApplePay() {
        return Swift_applePay(this.Swift_peer);
    }

    public final Bank getBank() {
        return Swift_bank(this.Swift_peer);
    }

    public final String getBasicDisplayName() {
        return Swift_basicDisplayName(this.Swift_peer);
    }

    public final Card getCard() {
        return Swift_card(this.Swift_peer);
    }

    public final List<DepositLimit> getDepositLimits() {
        return Swift_depositLimits(this.Swift_peer);
    }

    public final EPaymentMethodSource getDepositRail() {
        return Swift_depositRail(this.Swift_peer);
    }

    public final String getDetailedDisplayTitle() {
        return Swift_detailedDisplayTitle(this.Swift_peer);
    }

    public final String getDisplayTitle() {
        return Swift_displayTitle(this.Swift_peer);
    }

    public final GooglePay getGooglePay() {
        return Swift_googlePay(this.Swift_peer);
    }

    public final Icon getIcon() {
        return Swift_icon(this.Swift_peer);
    }

    public final String getId() {
        return Swift_id(this.Swift_peer);
    }

    public final EPaymentMethodSource getPaymentSource() {
        return Swift_paymentSource(this.Swift_peer);
    }

    public final PayPal getPaypal() {
        return Swift_paypal(this.Swift_peer);
    }

    public final List<RailCapability> getRailCapabilities() {
        return Swift_railCapabilities(this.Swift_peer);
    }

    public final Status getStatus() {
        return Swift_status(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final String getToken() {
        return Swift_token(this.Swift_peer);
    }

    public final MethodType getType() {
        return Swift_type(this.Swift_peer);
    }

    public final Boolean getWithdrawalAvailable() {
        return Swift_withdrawalAvailable(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isAvailableForDeposit() {
        return Swift_isAvailableForDeposit(this.Swift_peer);
    }

    public final boolean isAvailableForWithdrawal() {
        return Swift_isAvailableForWithdrawal(this.Swift_peer);
    }

    public final boolean isDefault() {
        return Swift_isDefault(this.Swift_peer);
    }

    public final RailCapability railCapability(EPaymentMethodSource for_) {
        for_.getClass();
        return Swift_railCapability_1(this.Swift_peer, for_);
    }

    public final EPaymentMethod replacementForSameCard(List<EPaymentMethod> in_, boolean preferStripe) {
        in_.getClass();
        return Swift_replacementForSameCard_2(this.Swift_peer, in_, preferStripe);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0002:;B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBI\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\u0015J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0015\u0010\u001c\u001a\u00020\u001b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\u0011H\u0016J\u0015\u0010$\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010'\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010)\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010+\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010.\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00100\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00102\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00104\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JM\u00105\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0082 J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020 072\u0006\u00108\u001a\u00020\u0011H\u0016J\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020 072\u0006\u00108\u001a\u00020\u0011H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010#R\u0011\u0010\u000f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010#R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0011\u0010\u0013\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b1\u0010#R\u0011\u0010\u0014\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b3\u0010#¨\u0006<"}, d2 = {"Lcom/polymarket/data/EPaymentMethod$Card;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "last4", "", "brand", "Lcom/polymarket/data/EPaymentMethod$Card$Brand;", "cardType", "cardCategory", "expiryMonth", "", "expiryYear", "issuerCountry", "cardholderName", "(Ljava/lang/String;Lcom/polymarket/data/EPaymentMethod$Card$Brand;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "getLast4", "()Ljava/lang/String;", "Swift_last4", "getBrand", "()Lcom/polymarket/data/EPaymentMethod$Card$Brand;", "Swift_brand", "getCardType", "Swift_cardType", "getCardCategory", "Swift_cardCategory", "getExpiryMonth", "()I", "Swift_expiryMonth", "getExpiryYear", "Swift_expiryYear", "getIssuerCountry", "Swift_issuerCountry", "getCardholderName", "Swift_cardholderName", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Brand", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Card implements SwiftPeerBridged, SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private long Swift_peer;

        public Card(String str, Brand brand, String str2, String str3, int i, int i2, String str4, String str5) {
            str.getClass();
            brand.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, brand, str2, str3, i, i2, str4, str5);
        }

        private final native Brand Swift_brand(long Swift_peer);

        private final native String Swift_cardCategory(long Swift_peer);

        private final native String Swift_cardType(long Swift_peer);

        private final native String Swift_cardholderName(long Swift_peer);

        private final native long Swift_constructor_0(String last4, Brand brand, String cardType, String cardCategory, int expiryMonth, int expiryYear, String issuerCountry, String cardholderName);

        private final native int Swift_expiryMonth(long Swift_peer);

        private final native int Swift_expiryYear(long Swift_peer);

        private final native String Swift_issuerCountry(long Swift_peer);

        private final native String Swift_last4(long Swift_peer);

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

        public final Brand getBrand() {
            return Swift_brand(this.Swift_peer);
        }

        public final String getCardCategory() {
            return Swift_cardCategory(this.Swift_peer);
        }

        public final String getCardType() {
            return Swift_cardType(this.Swift_peer);
        }

        public final String getCardholderName() {
            return Swift_cardholderName(this.Swift_peer);
        }

        public final int getExpiryMonth() {
            return Swift_expiryMonth(this.Swift_peer);
        }

        public final int getExpiryYear() {
            return Swift_expiryYear(this.Swift_peer);
        }

        public final String getIssuerCountry() {
            return Swift_issuerCountry(this.Swift_peer);
        }

        public final String getLast4() {
            return Swift_last4(this.Swift_peer);
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

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001$B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0082 J\u0011\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0002H\u0082 J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\"H\u0016J\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\"H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0015\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000bR\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006%"}, d2 = {"Lcom/polymarket/data/EPaymentMethod$Card$Brand;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "visa", "mastercard", "maestro", "americanExpress", "discover", "dinersClub", "jcb", "mada", "unknown", "displayName", "getDisplayName", "Swift_displayName", Keys.KEY_NAME, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ICON, "Lcom/polymarket/designtokens/Icon;", "getIcon", "()Lcom/polymarket/designtokens/Icon;", "Swift_icon", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Brand implements RawRepresentable<String>, SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ Brand[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final String rawValue;
            public static final Brand visa = new Brand("visa", 0, "VISA", null, 2, null);
            public static final Brand mastercard = new Brand("mastercard", 1, "MASTERCARD", null, 2, null);
            public static final Brand maestro = new Brand("maestro", 2, "MAESTRO", null, 2, null);
            public static final Brand americanExpress = new Brand("americanExpress", 3, "AMEX", null, 2, null);
            public static final Brand discover = new Brand("discover", 4, "DISCOVER", null, 2, null);
            public static final Brand dinersClub = new Brand("dinersClub", 5, "DINERS", null, 2, null);
            public static final Brand jcb = new Brand("jcb", 6, "JCB", null, 2, null);
            public static final Brand mada = new Brand("mada", 7, "MADA", null, 2, null);
            public static final Brand unknown = new Brand("unknown", 8, "unknown", null, 2, null);

            private static final /* synthetic */ Brand[] $values() {
                return new Brand[]{visa, mastercard, maestro, americanExpress, discover, dinersClub, jcb, mada, unknown};
            }

            static {
                Brand[] $values = $values();
                $VALUES = $values;
                $ENTRIES = ww4.b($values);
                INSTANCE = new Companion(null);
            }

            public /* synthetic */ Brand(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, str2, (i2 & 2) != 0 ? null : r4);
            }

            private final native String Swift_displayName(String name);

            private final native Icon Swift_icon(String name);

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static ug7 getEntries() {
                return $ENTRIES;
            }

            public static Brand valueOf(String str) {
                return (Brand) Enum.valueOf(Brand.class, str);
            }

            public static Brand[] values() {
                return (Brand[]) $VALUES.clone();
            }

            @Override // skip.lib.SwiftProjecting
            public Function0<Object> Swift_projection(int options) {
                return Swift_projectionImpl(options);
            }

            public final String getDisplayName() {
                return Swift_displayName(name());
            }

            public final Icon getIcon() {
                return Swift_icon(name());
            }

            @Override // skip.lib.RawRepresentable
            public /* bridge */ /* synthetic */ String getRawValue() {
                return getRawValue();
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EPaymentMethod$Card$Brand$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EPaymentMethod$Card$Brand;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Brand init(String rawValue) {
                    rawValue.getClass();
                    switch (rawValue.hashCode()) {
                        case -1553624974:
                            if (!rawValue.equals("MASTERCARD")) {
                                return null;
                            }
                            return Brand.mastercard;
                        case -284840886:
                            if (rawValue.equals("unknown")) {
                                return Brand.unknown;
                            }
                            return null;
                        case 73257:
                            if (rawValue.equals("JCB")) {
                                return Brand.jcb;
                            }
                            return null;
                        case 2012639:
                            if (rawValue.equals("AMEX")) {
                                return Brand.americanExpress;
                            }
                            return null;
                        case 2358545:
                            if (rawValue.equals("MADA")) {
                                return Brand.mada;
                            }
                            return null;
                        case 2634817:
                            if (rawValue.equals("VISA")) {
                                return Brand.visa;
                            }
                            return null;
                        case 1055811561:
                            if (rawValue.equals("DISCOVER")) {
                                return Brand.discover;
                            }
                            return null;
                        case 1545480463:
                            if (rawValue.equals("MAESTRO")) {
                                return Brand.maestro;
                            }
                            return null;
                        case 2016591933:
                            if (rawValue.equals("DINERS")) {
                                return Brand.dinersClub;
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

            private Brand(String str, int i, String str2, Void r4) {
                this.rawValue = str2;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EPaymentMethod$Card$Companion;", "", "<init>", "()V", "Brand", "Lcom/polymarket/data/EPaymentMethod$Card$Brand;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Brand Brand(String rawValue) {
                rawValue.getClass();
                return Brand.INSTANCE.init(rawValue);
            }

            private Companion() {
            }
        }

        public Card(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001%B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0082 J\u0011\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0002H\u0082 J\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0082 J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#H\u0016J\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0013\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000bR\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006&"}, d2 = {"Lcom/polymarket/data/EPaymentMethod$MethodType;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "card", PlaceTypes.BANK, "applePay", "googlePay", "paypal", "venmo", "unknown", "fallbackName", "getFallbackName", "Swift_fallbackName", Keys.KEY_NAME, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ICON, "Lcom/polymarket/designtokens/Icon;", "getIcon", "()Lcom/polymarket/designtokens/Icon;", "Swift_icon", "formattedTimeRange", "getFormattedTimeRange", "Swift_formattedTimeRange", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MethodType implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ MethodType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final MethodType card = new MethodType("card", 0, "CARD", null, 2, null);
        public static final MethodType bank = new MethodType(PlaceTypes.BANK, 1, "BANK", null, 2, null);
        public static final MethodType applePay = new MethodType("applePay", 2, "APPLE_PAY", null, 2, null);
        public static final MethodType googlePay = new MethodType("googlePay", 3, "GOOGLE_PAY", null, 2, null);
        public static final MethodType paypal = new MethodType("paypal", 4, "PAYPAL", null, 2, null);
        public static final MethodType venmo = new MethodType("venmo", 5, "VENMO", null, 2, null);
        public static final MethodType unknown = new MethodType("unknown", 6, "unknown", null, 2, null);

        private static final /* synthetic */ MethodType[] $values() {
            return new MethodType[]{card, bank, applePay, googlePay, paypal, venmo, unknown};
        }

        static {
            MethodType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ MethodType(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native String Swift_fallbackName(String name);

        private final native String Swift_formattedTimeRange(String name);

        private final native Icon Swift_icon(String name);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static MethodType valueOf(String str) {
            return (MethodType) Enum.valueOf(MethodType.class, str);
        }

        public static MethodType[] values() {
            return (MethodType[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final String getFallbackName() {
            return Swift_fallbackName(name());
        }

        public final String getFormattedTimeRange() {
            return Swift_formattedTimeRange(name());
        }

        public final Icon getIcon() {
            return Swift_icon(name());
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EPaymentMethod$MethodType$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EPaymentMethod$MethodType;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final MethodType init(String rawValue) {
                rawValue.getClass();
                switch (rawValue.hashCode()) {
                    case -1941875981:
                        if (!rawValue.equals("PAYPAL")) {
                            return null;
                        }
                        return MethodType.paypal;
                    case -1048776318:
                        if (rawValue.equals("GOOGLE_PAY")) {
                            return MethodType.googlePay;
                        }
                        return null;
                    case -284840886:
                        if (rawValue.equals("unknown")) {
                            return MethodType.unknown;
                        }
                        return null;
                    case 2031164:
                        if (rawValue.equals("BANK")) {
                            return MethodType.bank;
                        }
                        return null;
                    case 2061072:
                        if (rawValue.equals("CARD")) {
                            return MethodType.card;
                        }
                        return null;
                    case 81555809:
                        if (rawValue.equals("VENMO")) {
                            return MethodType.venmo;
                        }
                        return null;
                    case 693748227:
                        if (rawValue.equals("APPLE_PAY")) {
                            return MethodType.applePay;
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

        private MethodType(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0015B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0016"}, d2 = {"Lcom/polymarket/data/EPaymentMethod$Status;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "activated", "deactivated", "unknown", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Status implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Status activated = new Status("activated", 0, "ACTIVATED", null, 2, null);
        public static final Status deactivated = new Status("deactivated", 1, "DEACTIVATED", null, 2, null);
        public static final Status unknown = new Status("unknown", 2, "unknown", null, 2, null);
        private final String rawValue;

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{activated, deactivated, unknown};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ Status(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EPaymentMethod$Status$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EPaymentMethod$Status;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Status init(String rawValue) {
                rawValue.getClass();
                int hashCode = rawValue.hashCode();
                if (hashCode != -1303979599) {
                    if (hashCode != -284840886) {
                        if (hashCode == 382849616 && rawValue.equals("DEACTIVATED")) {
                            return Status.deactivated;
                        }
                        return null;
                    }
                    if (rawValue.equals("unknown")) {
                        return Status.unknown;
                    }
                    return null;
                }
                if (!rawValue.equals("ACTIVATED")) {
                    return null;
                }
                return Status.activated;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private Status(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0082 J\u0010\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0012"}, d2 = {"Lcom/polymarket/data/EPaymentMethod$Companion;", "", "<init>", "()V", "collapsingDuplicateCardsAcrossSources", "", "Lcom/polymarket/data/EPaymentMethod;", "methods", "preferStripe", "", "forWithdrawal", "Swift_Companion_collapsingDuplicateCardsAcrossSources_3", "Status", "Lcom/polymarket/data/EPaymentMethod$Status;", "rawValue", "", "MethodType", "Lcom/polymarket/data/EPaymentMethod$MethodType;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native List<EPaymentMethod> Swift_Companion_collapsingDuplicateCardsAcrossSources_3(List<EPaymentMethod> methods, boolean preferStripe, boolean forWithdrawal);

        public final MethodType MethodType(String rawValue) {
            rawValue.getClass();
            return MethodType.INSTANCE.init(rawValue);
        }

        public final Status Status(String rawValue) {
            rawValue.getClass();
            return Status.INSTANCE.init(rawValue);
        }

        public final List<EPaymentMethod> collapsingDuplicateCardsAcrossSources(List<EPaymentMethod> methods, boolean preferStripe, boolean forWithdrawal) {
            methods.getClass();
            return Swift_Companion_collapsingDuplicateCardsAcrossSources_3(methods, preferStripe, forWithdrawal);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 D2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001DB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB/\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\t\u0010\u0011B\u0011\b\u0012\u0012\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0013J\u0006\u0010\u0018\u001a\u00020\u0019J\u0015\u0010\u001a\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u0015\u0010#\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010(\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010)\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010*\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u0010-\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010.\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010*\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u00101\u001a\u0004\u0018\u00010\u00102\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J3\u00102\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0082 J\u0015\u00103\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0012\u001a\u00020\u0001H\u0082 J\b\u0010?\u001a\u00020\u0001H\u0016J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001e0A2\u0006\u0010B\u001a\u00020 H\u0016J\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001e0A2\u0006\u0010B\u001a\u00020 H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010$\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010'R(\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010$\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\"\"\u0004\b,\u0010'R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b/\u00100R(\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0019\u0018\u000105X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020 X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006E"}, d2 = {"Lcom/polymarket/data/EPaymentMethod$ApplePay;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "cardType", "", "displayName", "last4", "brand", "Lcom/polymarket/data/EPaymentMethod$Card$Brand;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/EPaymentMethod$Card$Brand;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getCardType", "()Ljava/lang/String;", "Swift_cardType", "newValue", "getDisplayName", "setDisplayName", "(Ljava/lang/String;)V", "Swift_displayName", "Swift_displayName_set", "value", "getLast4", "setLast4", "Swift_last4", "Swift_last4_set", "getBrand", "()Lcom/polymarket/data/EPaymentMethod$Card$Brand;", "Swift_brand", "Swift_constructor_0", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ApplePay implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        public ApplePay(String str, String str2, String str3, Card.Brand brand) {
            str.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, str3, brand);
        }

        private final native Card.Brand Swift_brand(long Swift_peer);

        private final native String Swift_cardType(long Swift_peer);

        private final native long Swift_constructor_0(String cardType, String displayName, String last4, Card.Brand brand);

        private final native long Swift_constructor_1(MutableStruct copy);

        private final native String Swift_displayName(long Swift_peer);

        private final native void Swift_displayName_set(long Swift_peer, String value);

        private final native String Swift_last4(long Swift_peer);

        private final native void Swift_last4_set(long Swift_peer, String value);

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

        public final Card.Brand getBrand() {
            return Swift_brand(this.Swift_peer);
        }

        public final String getCardType() {
            return Swift_cardType(this.Swift_peer);
        }

        public final String getDisplayName() {
            return Swift_displayName(this.Swift_peer);
        }

        public final String getLast4() {
            return Swift_last4(this.Swift_peer);
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

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new ApplePay(this);
        }

        public final void setDisplayName(String str) {
            willmutate();
            try {
                Swift_displayName_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setLast4(String str) {
            willmutate();
            try {
                Swift_last4_set(this.Swift_peer, str);
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

        public ApplePay(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private ApplePay(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_1(mutableStruct);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB)\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0015\u0010\u001f\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010!\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010#\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010%\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J-\u0010&\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0082 J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001a0(2\u0006\u0010)\u001a\u00020\u001cH\u0016J\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001a0(2\u0006\u0010)\u001a\u00020\u001cH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001e¨\u0006,"}, d2 = {"Lcom/polymarket/data/EPaymentMethod$Bank;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "bankName", "", "last4", Keys.KEY_NAME, "accountType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getBankName", "()Ljava/lang/String;", "Swift_bankName", "getLast4", "Swift_last4", "getName", "Swift_name", "getAccountType", "Swift_accountType", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Bank implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Bank(String str, String str2, String str3, String str4) {
            woa.A(str, str2, str3, str4);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, str3, str4);
        }

        private final native String Swift_accountType(long Swift_peer);

        private final native String Swift_bankName(long Swift_peer);

        private final native long Swift_constructor_0(String bankName, String last4, String name, String accountType);

        private final native String Swift_last4(long Swift_peer);

        private final native String Swift_name(long Swift_peer);

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

        public final String getAccountType() {
            return Swift_accountType(this.Swift_peer);
        }

        public final String getBankName() {
            return Swift_bankName(this.Swift_peer);
        }

        public final String getLast4() {
            return Swift_last4(this.Swift_peer);
        }

        public final String getName() {
            return Swift_name(this.Swift_peer);
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

        public Bank(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 D2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001DB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB/\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\t\u0010\u0011B\u0011\b\u0012\u0012\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0013J\u0006\u0010\u0018\u001a\u00020\u0019J\u0015\u0010\u001a\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u0015\u0010#\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010(\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010)\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010*\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u0010-\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010.\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010*\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u00101\u001a\u0004\u0018\u00010\u00102\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J3\u00102\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0082 J\u0015\u00103\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0012\u001a\u00020\u0001H\u0082 J\b\u0010?\u001a\u00020\u0001H\u0016J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001e0A2\u0006\u0010B\u001a\u00020 H\u0016J\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001e0A2\u0006\u0010B\u001a\u00020 H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010$\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010'R(\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010$\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\"\"\u0004\b,\u0010'R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b/\u00100R(\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0019\u0018\u000105X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020 X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006E"}, d2 = {"Lcom/polymarket/data/EPaymentMethod$GooglePay;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "cardType", "", "displayName", "last4", "brand", "Lcom/polymarket/data/EPaymentMethod$Card$Brand;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/EPaymentMethod$Card$Brand;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getCardType", "()Ljava/lang/String;", "Swift_cardType", "newValue", "getDisplayName", "setDisplayName", "(Ljava/lang/String;)V", "Swift_displayName", "Swift_displayName_set", "value", "getLast4", "setLast4", "Swift_last4", "Swift_last4_set", "getBrand", "()Lcom/polymarket/data/EPaymentMethod$Card$Brand;", "Swift_brand", "Swift_constructor_0", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class GooglePay implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        public GooglePay(String str, String str2, String str3, Card.Brand brand) {
            str.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, str3, brand);
        }

        private final native Card.Brand Swift_brand(long Swift_peer);

        private final native String Swift_cardType(long Swift_peer);

        private final native long Swift_constructor_0(String cardType, String displayName, String last4, Card.Brand brand);

        private final native long Swift_constructor_1(MutableStruct copy);

        private final native String Swift_displayName(long Swift_peer);

        private final native void Swift_displayName_set(long Swift_peer, String value);

        private final native String Swift_last4(long Swift_peer);

        private final native void Swift_last4_set(long Swift_peer, String value);

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

        public final Card.Brand getBrand() {
            return Swift_brand(this.Swift_peer);
        }

        public final String getCardType() {
            return Swift_cardType(this.Swift_peer);
        }

        public final String getDisplayName() {
            return Swift_displayName(this.Swift_peer);
        }

        public final String getLast4() {
            return Swift_last4(this.Swift_peer);
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

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new GooglePay(this);
        }

        public final void setDisplayName(String str) {
            willmutate();
            try {
                Swift_displayName_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setLast4(String str) {
            willmutate();
            try {
                Swift_last4_set(this.Swift_peer, str);
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

        public GooglePay(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private GooglePay(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_1(mutableStruct);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0015\u0010\u001e\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010!\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010#\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J%\u0010$\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0082 J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190&2\u0006\u0010'\u001a\u00020\u001bH\u0016J\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00190&2\u0006\u0010'\u001a\u00020\u001bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u0006*"}, d2 = {"Lcom/polymarket/data/EPaymentMethod$RailCapability;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "provider", "Lcom/polymarket/data/EPaymentMethodSource;", "depositEnabled", "", "withdrawalEnabled", "(Lcom/polymarket/data/EPaymentMethodSource;ZZ)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "other", "", "hashCode", "", "getProvider", "()Lcom/polymarket/data/EPaymentMethodSource;", "Swift_provider", "getDepositEnabled", "()Z", "Swift_depositEnabled", "getWithdrawalEnabled", "Swift_withdrawalEnabled", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class RailCapability implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public RailCapability(EPaymentMethodSource ePaymentMethodSource, boolean z, boolean z2) {
            ePaymentMethodSource.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(ePaymentMethodSource, z, z2);
        }

        private final native long Swift_constructor_0(EPaymentMethodSource provider, boolean depositEnabled, boolean withdrawalEnabled);

        private final native boolean Swift_depositEnabled(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native EPaymentMethodSource Swift_provider(long Swift_peer);

        private final native void Swift_release(long Swift_peer);

        private final native boolean Swift_withdrawalEnabled(long Swift_peer);

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

        public final boolean getDepositEnabled() {
            return Swift_depositEnabled(this.Swift_peer);
        }

        public final EPaymentMethodSource getProvider() {
            return Swift_provider(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final boolean getWithdrawalEnabled() {
            return Swift_withdrawalEnabled(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public RailCapability(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 A2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001AB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB-\b\u0016\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000fB\u0011\b\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0011J\u0006\u0010\u0016\u001a\u00020\u0017J\u0015\u0010\u0018\u001a\u00020\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0017\u0010$\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010%\u001a\u00020\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010&\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u0010)\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010*\u001a\u00020\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010&\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u0010-\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010.\u001a\u00020\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010&\u001a\u0004\u0018\u00010\fH\u0082 J+\u0010/\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0082 J\u0015\u00100\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0010\u001a\u00020\u0001H\u0082 J\b\u0010<\u001a\u00020\u0001H\u0016J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001c0>2\u0006\u0010?\u001a\u00020\u001eH\u0016J\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001c0>2\u0006\u0010?\u001a\u00020\u001eH\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010!\"\u0004\b(\u0010#R(\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R(\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0017\u0018\u000102X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u00020\u001eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006B"}, d2 = {"Lcom/polymarket/data/EPaymentMethod$DepositLimit;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "maxDepositPerTransaction", "Lcom/polymarket/data/EAmount;", "maxDepositDaily", "maxDeposit60Day", "(Lcom/polymarket/data/EAmount;Lcom/polymarket/data/EAmount;Lcom/polymarket/data/EAmount;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "getMaxDepositPerTransaction", "()Lcom/polymarket/data/EAmount;", "setMaxDepositPerTransaction", "(Lcom/polymarket/data/EAmount;)V", "Swift_maxDepositPerTransaction", "Swift_maxDepositPerTransaction_set", "value", "getMaxDepositDaily", "setMaxDepositDaily", "Swift_maxDepositDaily", "Swift_maxDepositDaily_set", "getMaxDeposit60Day", "setMaxDeposit60Day", "Swift_maxDeposit60Day", "Swift_maxDeposit60Day_set", "Swift_constructor_0", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DepositLimit implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        public /* synthetic */ DepositLimit(EAmount eAmount, EAmount eAmount2, EAmount eAmount3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : eAmount, (i & 2) != 0 ? null : eAmount2, (i & 4) != 0 ? null : eAmount3);
        }

        private final native long Swift_constructor_0(EAmount maxDepositPerTransaction, EAmount maxDepositDaily, EAmount maxDeposit60Day);

        private final native long Swift_constructor_1(MutableStruct copy);

        private final native EAmount Swift_maxDeposit60Day(long Swift_peer);

        private final native void Swift_maxDeposit60Day_set(long Swift_peer, EAmount value);

        private final native EAmount Swift_maxDepositDaily(long Swift_peer);

        private final native void Swift_maxDepositDaily_set(long Swift_peer, EAmount value);

        private final native EAmount Swift_maxDepositPerTransaction(long Swift_peer);

        private final native void Swift_maxDepositPerTransaction_set(long Swift_peer, EAmount value);

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

        public final EAmount getMaxDeposit60Day() {
            return Swift_maxDeposit60Day(this.Swift_peer);
        }

        public final EAmount getMaxDepositDaily() {
            return Swift_maxDepositDaily(this.Swift_peer);
        }

        public final EAmount getMaxDepositPerTransaction() {
            return Swift_maxDepositPerTransaction(this.Swift_peer);
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

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new DepositLimit(this);
        }

        public final void setMaxDeposit60Day(EAmount eAmount) {
            EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
            willmutate();
            try {
                Swift_maxDeposit60Day_set(this.Swift_peer, eAmount2);
            } finally {
                didmutate();
            }
        }

        public final void setMaxDepositDaily(EAmount eAmount) {
            EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
            willmutate();
            try {
                Swift_maxDepositDaily_set(this.Swift_peer, eAmount2);
            } finally {
                didmutate();
            }
        }

        public final void setMaxDepositPerTransaction(EAmount eAmount) {
            EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
            willmutate();
            try {
                Swift_maxDepositPerTransaction_set(this.Swift_peer, eAmount2);
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

        public DepositLimit(EAmount eAmount, EAmount eAmount2, EAmount eAmount3) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(eAmount, eAmount2, eAmount3);
        }

        public DepositLimit(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private DepositLimit(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_1(mutableStruct);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB'\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0015\u0010\u001e\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010 \u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\"\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J%\u0010#\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0082 J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190%2\u0006\u0010&\u001a\u00020\u001bH\u0016J\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00190%2\u0006\u0010&\u001a\u00020\u001bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001d¨\u0006)"}, d2 = {"Lcom/polymarket/data/EPaymentMethod$PayPal;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "email", "", "username", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getEmail", "()Ljava/lang/String;", "Swift_email", "getUsername", "Swift_username", "getDescription", "Swift_description", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PayPal implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ PayPal(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
        }

        private final native long Swift_constructor_0(String email, String username, String description);

        private final native String Swift_description(long Swift_peer);

        private final native String Swift_email(long Swift_peer);

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
            if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
                return false;
            }
            return true;
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getDescription() {
            return Swift_description(this.Swift_peer);
        }

        public final String getEmail() {
            return Swift_email(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getUsername() {
            return Swift_username(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public PayPal(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public PayPal(String str, String str2, String str3) {
            g.x(str, str2, str3);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, str3);
        }
    }

    public EPaymentMethod(String str, MethodType methodType, Status status, boolean z, String str2, ApplePay applePay, GooglePay googlePay, Card card, Bank bank, PayPal payPal, List<DepositLimit> list, EPaymentMethodSource ePaymentMethodSource, Boolean bool, List<RailCapability> list2) {
        str.getClass();
        methodType.getClass();
        status.getClass();
        str2.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, methodType, status, z, str2, applePay, googlePay, card, bank, payPal, list, ePaymentMethodSource, bool, list2);
    }

    public EPaymentMethod(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
