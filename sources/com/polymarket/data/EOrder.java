package com.polymarket.data;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
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
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 ¨\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u000e¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010!\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010\"\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u001bH\u0082 J\u0015\u0010*\u001a\u00020$2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010+\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020$H\u0082 J\u0015\u00102\u001a\u00020,2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u00103\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020,H\u0082 J\u0015\u0010:\u001a\u0002042\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010;\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u000204H\u0082 J\u0015\u0010?\u001a\u0002042\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010@\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u000204H\u0082 J\u0015\u0010D\u001a\u0002042\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010E\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u000204H\u0082 J\u0017\u0010L\u001a\u0004\u0018\u00010F2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010M\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010FH\u0082 J\u0017\u0010T\u001a\u0004\u0018\u00010N2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010U\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010NH\u0082 J\u0017\u0010\\\u001a\u0004\u0018\u00010V2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010]\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010VH\u0082 J\u0017\u0010d\u001a\u0004\u0018\u00010^2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010e\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010^H\u0082 J\u0017\u0010l\u001a\u0004\u0018\u00010f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010m\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010fH\u0082 J\u0015\u0010t\u001a\u00020n2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010u\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020nH\u0082 J\u0017\u0010y\u001a\u0004\u0018\u00010,2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010z\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010,H\u0082 J\u0017\u0010~\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010\u007f\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0018\u0010\u0083\u0001\u001a\u0004\u0018\u00010f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J \u0010\u0084\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010fH\u0082 J\u0017\u0010\u0089\u0001\u001a\u00030\u0086\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u008c\u0001\u001a\u00020,2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u0090\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u0091\u0001\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\t\u0010\u009d\u0001\u001a\u00020\u0001H\u0016J\u0019\u0010\u009e\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170\u009f\u00012\u0007\u0010 \u0001\u001a\u00020\u0019H\u0016J\u001a\u0010¡\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170\u009f\u00012\u0007\u0010 \u0001\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010%\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010-\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00105\u001a\u0002042\u0006\u0010\u001a\u001a\u0002048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010<\u001a\u0002042\u0006\u0010\u001a\u001a\u0002048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u00107\"\u0004\b>\u00109R$\u0010A\u001a\u0002042\u0006\u0010\u001a\u001a\u0002048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u00107\"\u0004\bC\u00109R(\u0010G\u001a\u0004\u0018\u00010F2\b\u0010\u001a\u001a\u0004\u0018\u00010F8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR(\u0010O\u001a\u0004\u0018\u00010N2\b\u0010\u001a\u001a\u0004\u0018\u00010N8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR(\u0010W\u001a\u0004\u0018\u00010V2\b\u0010\u001a\u001a\u0004\u0018\u00010V8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R(\u0010_\u001a\u0004\u0018\u00010^2\b\u0010\u001a\u001a\u0004\u0018\u00010^8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR(\u0010g\u001a\u0004\u0018\u00010f2\b\u0010\u001a\u001a\u0004\u0018\u00010f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR$\u0010o\u001a\u00020n2\u0006\u0010\u001a\u001a\u00020n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR(\u0010v\u001a\u0004\u0018\u00010,2\b\u0010\u001a\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bw\u0010/\"\u0004\bx\u00101R(\u0010{\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b|\u0010\u001e\"\u0004\b}\u0010 R+\u0010\u0080\u0001\u001a\u0004\u0018\u00010f2\b\u0010\u001a\u001a\u0004\u0018\u00010f8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0081\u0001\u0010i\"\u0005\b\u0082\u0001\u0010kR\u0015\u0010\u0085\u0001\u001a\u00030\u0086\u00018F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0013\u0010\u008a\u0001\u001a\u00020,8F¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010/R\u0014\u0010\u008d\u0001\u001a\u00020\u00158F¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R.\u0010\u0092\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0093\u0001X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001f\u0010\u0098\u0001\u001a\u00020\u0019X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001¨\u0006©\u0001"}, d2 = {"Lcom/polymarket/data/EOrder;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Swift_id", "Swift_id_set", "value", "Lcom/polymarket/data/EOrder$OrderType;", "type", "getType", "()Lcom/polymarket/data/EOrder$OrderType;", "setType", "(Lcom/polymarket/data/EOrder$OrderType;)V", "Swift_type", "Swift_type_set", "Lcom/polymarket/data/EAmount;", "price", "getPrice", "()Lcom/polymarket/data/EAmount;", "setPrice", "(Lcom/polymarket/data/EAmount;)V", "Swift_price", "Swift_price_set", "Lcom/polymarket/data/EQuantity;", "quantity", "getQuantity", "()Lcom/polymarket/data/EQuantity;", "setQuantity", "(Lcom/polymarket/data/EQuantity;)V", "Swift_quantity", "Swift_quantity_set", "cumQuantity", "getCumQuantity", "setCumQuantity", "Swift_cumQuantity", "Swift_cumQuantity_set", "leavesQuantity", "getLeavesQuantity", "setLeavesQuantity", "Swift_leavesQuantity", "Swift_leavesQuantity_set", "Lcom/polymarket/data/EOrder$OrderState;", "state", "getState", "()Lcom/polymarket/data/EOrder$OrderState;", "setState", "(Lcom/polymarket/data/EOrder$OrderState;)V", "Swift_state", "Swift_state_set", "Lcom/polymarket/data/EOrder$OrderSide;", "side", "getSide", "()Lcom/polymarket/data/EOrder$OrderSide;", "setSide", "(Lcom/polymarket/data/EOrder$OrderSide;)V", "Swift_side", "Swift_side_set", "Lcom/polymarket/data/EOrder$OrderIntent;", "intent", "getIntent", "()Lcom/polymarket/data/EOrder$OrderIntent;", "setIntent", "(Lcom/polymarket/data/EOrder$OrderIntent;)V", "Swift_intent", "Swift_intent_set", "Lcom/polymarket/data/EOrder$TimeInForce;", "tif", "getTif", "()Lcom/polymarket/data/EOrder$TimeInForce;", "setTif", "(Lcom/polymarket/data/EOrder$TimeInForce;)V", "Swift_tif", "Swift_tif_set", "Ljava/util/Date;", "goodTillTime", "getGoodTillTime", "()Ljava/util/Date;", "setGoodTillTime", "(Ljava/util/Date;)V", "Swift_goodTillTime", "Swift_goodTillTime_set", "Lcom/polymarket/data/EMarketMetadata;", "marketMetadata", "getMarketMetadata", "()Lcom/polymarket/data/EMarketMetadata;", "setMarketMetadata", "(Lcom/polymarket/data/EMarketMetadata;)V", "Swift_marketMetadata", "Swift_marketMetadata_set", "commissionNotionalTotalCollected", "getCommissionNotionalTotalCollected", "setCommissionNotionalTotalCollected", "Swift_commissionNotionalTotalCollected", "Swift_commissionNotionalTotalCollected_set", "commissionsBasisPoints", "getCommissionsBasisPoints", "setCommissionsBasisPoints", "Swift_commissionsBasisPoints", "Swift_commissionsBasisPoints_set", "createTime", "getCreateTime", "setCreateTime", "Swift_createTime", "Swift_createTime_set", "userAction", "Lcom/polymarket/data/EOrder$TradeUserAction;", "getUserAction", "()Lcom/polymarket/data/EOrder$TradeUserAction;", "Swift_userAction", "effectivePrice", "getEffectivePrice", "Swift_effectivePrice", "canCancel", "getCanCancel", "()Z", "Swift_canCancel", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "TradeUserAction", "OrderType", "OrderState", "OrderSide", "OrderIntent", "TimeInForce", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EOrder implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/data/EOrder$TradeUserAction;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "bought", "sold", "traded", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class TradeUserAction implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ TradeUserAction[] $VALUES;
        public static final TradeUserAction bought = new TradeUserAction("bought", 0);
        public static final TradeUserAction sold = new TradeUserAction("sold", 1);
        public static final TradeUserAction traded = new TradeUserAction("traded", 2);

        private static final /* synthetic */ TradeUserAction[] $values() {
            return new TradeUserAction[]{bought, sold, traded};
        }

        static {
            TradeUserAction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private TradeUserAction(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static TradeUserAction valueOf(String str) {
            return (TradeUserAction) Enum.valueOf(TradeUserAction.class, str);
        }

        public static TradeUserAction[] values() {
            return (TradeUserAction[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    private EOrder(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(mutableStruct);
    }

    private final native boolean Swift_canCancel(long Swift_peer);

    private final native EAmount Swift_commissionNotionalTotalCollected(long Swift_peer);

    private final native void Swift_commissionNotionalTotalCollected_set(long Swift_peer, EAmount value);

    private final native String Swift_commissionsBasisPoints(long Swift_peer);

    private final native void Swift_commissionsBasisPoints_set(long Swift_peer, String value);

    private final native long Swift_constructor_1(MutableStruct copy);

    private final native Date Swift_createTime(long Swift_peer);

    private final native void Swift_createTime_set(long Swift_peer, Date value);

    private final native EQuantity Swift_cumQuantity(long Swift_peer);

    private final native void Swift_cumQuantity_set(long Swift_peer, EQuantity value);

    private final native EAmount Swift_effectivePrice(long Swift_peer);

    private final native Date Swift_goodTillTime(long Swift_peer);

    private final native void Swift_goodTillTime_set(long Swift_peer, Date value);

    private final native String Swift_id(long Swift_peer);

    private final native void Swift_id_set(long Swift_peer, String value);

    private final native OrderIntent Swift_intent(long Swift_peer);

    private final native void Swift_intent_set(long Swift_peer, OrderIntent value);

    private final native EQuantity Swift_leavesQuantity(long Swift_peer);

    private final native void Swift_leavesQuantity_set(long Swift_peer, EQuantity value);

    private final native EMarketMetadata Swift_marketMetadata(long Swift_peer);

    private final native void Swift_marketMetadata_set(long Swift_peer, EMarketMetadata value);

    private final native EAmount Swift_price(long Swift_peer);

    private final native void Swift_price_set(long Swift_peer, EAmount value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native EQuantity Swift_quantity(long Swift_peer);

    private final native void Swift_quantity_set(long Swift_peer, EQuantity value);

    private final native void Swift_release(long Swift_peer);

    private final native OrderSide Swift_side(long Swift_peer);

    private final native void Swift_side_set(long Swift_peer, OrderSide value);

    private final native OrderState Swift_state(long Swift_peer);

    private final native void Swift_state_set(long Swift_peer, OrderState value);

    private final native TimeInForce Swift_tif(long Swift_peer);

    private final native void Swift_tif_set(long Swift_peer, TimeInForce value);

    private final native OrderType Swift_type(long Swift_peer);

    private final native void Swift_type_set(long Swift_peer, OrderType value);

    private final native TradeUserAction Swift_userAction(long Swift_peer);

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

    public final boolean getCanCancel() {
        return Swift_canCancel(this.Swift_peer);
    }

    public final EAmount getCommissionNotionalTotalCollected() {
        return Swift_commissionNotionalTotalCollected(this.Swift_peer);
    }

    public final String getCommissionsBasisPoints() {
        return Swift_commissionsBasisPoints(this.Swift_peer);
    }

    public final Date getCreateTime() {
        return Swift_createTime(this.Swift_peer);
    }

    public final EQuantity getCumQuantity() {
        return Swift_cumQuantity(this.Swift_peer);
    }

    public final EAmount getEffectivePrice() {
        return Swift_effectivePrice(this.Swift_peer);
    }

    public final Date getGoodTillTime() {
        return Swift_goodTillTime(this.Swift_peer);
    }

    public final String getId() {
        return Swift_id(this.Swift_peer);
    }

    public final OrderIntent getIntent() {
        return Swift_intent(this.Swift_peer);
    }

    public final EQuantity getLeavesQuantity() {
        return Swift_leavesQuantity(this.Swift_peer);
    }

    public final EMarketMetadata getMarketMetadata() {
        return Swift_marketMetadata(this.Swift_peer);
    }

    public final EAmount getPrice() {
        return Swift_price(this.Swift_peer);
    }

    public final EQuantity getQuantity() {
        return Swift_quantity(this.Swift_peer);
    }

    public final OrderSide getSide() {
        return Swift_side(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    public final OrderState getState() {
        return Swift_state(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final TimeInForce getTif() {
        return Swift_tif(this.Swift_peer);
    }

    public final OrderType getType() {
        return Swift_type(this.Swift_peer);
    }

    public final TradeUserAction getUserAction() {
        return Swift_userAction(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new EOrder(this);
    }

    public final void setCommissionNotionalTotalCollected(EAmount eAmount) {
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_commissionNotionalTotalCollected_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    public final void setCommissionsBasisPoints(String str) {
        willmutate();
        try {
            Swift_commissionsBasisPoints_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setCreateTime(Date date) {
        Date date2 = (Date) StructKt.sref$default(date, null, 1, null);
        willmutate();
        try {
            Swift_createTime_set(this.Swift_peer, date2);
        } finally {
            didmutate();
        }
    }

    public final void setCumQuantity(EQuantity eQuantity) {
        eQuantity.getClass();
        willmutate();
        try {
            Swift_cumQuantity_set(this.Swift_peer, eQuantity);
        } finally {
            didmutate();
        }
    }

    public final void setGoodTillTime(Date date) {
        Date date2 = (Date) StructKt.sref$default(date, null, 1, null);
        willmutate();
        try {
            Swift_goodTillTime_set(this.Swift_peer, date2);
        } finally {
            didmutate();
        }
    }

    public final void setId(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_id_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setIntent(OrderIntent orderIntent) {
        willmutate();
        try {
            Swift_intent_set(this.Swift_peer, orderIntent);
        } finally {
            didmutate();
        }
    }

    public final void setLeavesQuantity(EQuantity eQuantity) {
        eQuantity.getClass();
        willmutate();
        try {
            Swift_leavesQuantity_set(this.Swift_peer, eQuantity);
        } finally {
            didmutate();
        }
    }

    public final void setMarketMetadata(EMarketMetadata eMarketMetadata) {
        eMarketMetadata.getClass();
        EMarketMetadata eMarketMetadata2 = (EMarketMetadata) StructKt.sref$default(eMarketMetadata, null, 1, null);
        willmutate();
        try {
            Swift_marketMetadata_set(this.Swift_peer, eMarketMetadata2);
        } finally {
            didmutate();
        }
    }

    public final void setPrice(EAmount eAmount) {
        eAmount.getClass();
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_price_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    public final void setQuantity(EQuantity eQuantity) {
        eQuantity.getClass();
        willmutate();
        try {
            Swift_quantity_set(this.Swift_peer, eQuantity);
        } finally {
            didmutate();
        }
    }

    public final void setSide(OrderSide orderSide) {
        willmutate();
        try {
            Swift_side_set(this.Swift_peer, orderSide);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    public final void setState(OrderState orderState) {
        willmutate();
        try {
            Swift_state_set(this.Swift_peer, orderState);
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

    public final void setTif(TimeInForce timeInForce) {
        willmutate();
        try {
            Swift_tif_set(this.Swift_peer, timeInForce);
        } finally {
            didmutate();
        }
    }

    public final void setType(OrderType orderType) {
        orderType.getClass();
        willmutate();
        try {
            Swift_type_set(this.Swift_peer, orderType);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\"B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u0019\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0082 J\u0011\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0002H\u0082 J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006#"}, d2 = {"Lcom/polymarket/data/EOrder$OrderIntent;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "buyLong", "sellLong", "buyShort", "sellShort", "unknown", "effectivePrice", "Lcom/polymarket/data/EAmount;", TicketDetailDestinationKt.LAUNCHED_FROM, "Swift_effectivePrice_0", Keys.KEY_NAME, "price", "exchangeSide", "Lcom/polymarket/data/EOrder$OrderSide;", "getExchangeSide", "()Lcom/polymarket/data/EOrder$OrderSide;", "Swift_exchangeSide", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class OrderIntent implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ OrderIntent[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final OrderIntent buyLong = new OrderIntent("buyLong", 0, "buyLong", null, 2, null);
        public static final OrderIntent sellLong = new OrderIntent("sellLong", 1, "sellLong", null, 2, null);
        public static final OrderIntent buyShort = new OrderIntent("buyShort", 2, "buyShort", null, 2, null);
        public static final OrderIntent sellShort = new OrderIntent("sellShort", 3, "sellShort", null, 2, null);
        public static final OrderIntent unknown = new OrderIntent("unknown", 4, "unknown", null, 2, null);

        private static final /* synthetic */ OrderIntent[] $values() {
            return new OrderIntent[]{buyLong, sellLong, buyShort, sellShort, unknown};
        }

        static {
            OrderIntent[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ OrderIntent(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native EAmount Swift_effectivePrice_0(String name, EAmount price);

        private final native OrderSide Swift_exchangeSide(String name);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static OrderIntent valueOf(String str) {
            return (OrderIntent) Enum.valueOf(OrderIntent.class, str);
        }

        public static OrderIntent[] values() {
            return (OrderIntent[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final EAmount effectivePrice(EAmount from) {
            from.getClass();
            return Swift_effectivePrice_0(name(), from);
        }

        public final OrderSide getExchangeSide() {
            return Swift_exchangeSide(name());
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EOrder$OrderIntent$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EOrder$OrderIntent;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final OrderIntent init(String rawValue) {
                rawValue.getClass();
                switch (rawValue.hashCode()) {
                    case -1530689462:
                        if (!rawValue.equals("sellShort")) {
                            return null;
                        }
                        return OrderIntent.sellShort;
                    case -995542634:
                        if (rawValue.equals("buyShort")) {
                            return OrderIntent.buyShort;
                        }
                        return null;
                    case -284840886:
                        if (rawValue.equals("unknown")) {
                            return OrderIntent.unknown;
                        }
                        return null;
                    case 244778530:
                        if (rawValue.equals("buyLong")) {
                            return OrderIntent.buyLong;
                        }
                        return null;
                    case 1197347054:
                        if (rawValue.equals("sellLong")) {
                            return OrderIntent.sellLong;
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

        private OrderIntent(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0015B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0016"}, d2 = {"Lcom/polymarket/data/EOrder$OrderSide;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "buy", "sell", "unknown", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class OrderSide implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ OrderSide[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final OrderSide buy = new OrderSide("buy", 0, "buy", null, 2, null);
        public static final OrderSide sell = new OrderSide("sell", 1, "sell", null, 2, null);
        public static final OrderSide unknown = new OrderSide("unknown", 2, "unknown", null, 2, null);
        private final String rawValue;

        private static final /* synthetic */ OrderSide[] $values() {
            return new OrderSide[]{buy, sell, unknown};
        }

        static {
            OrderSide[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ OrderSide(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static OrderSide valueOf(String str) {
            return (OrderSide) Enum.valueOf(OrderSide.class, str);
        }

        public static OrderSide[] values() {
            return (OrderSide[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EOrder$OrderSide$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EOrder$OrderSide;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final OrderSide init(String rawValue) {
                rawValue.getClass();
                int hashCode = rawValue.hashCode();
                if (hashCode != -284840886) {
                    if (hashCode != 97926) {
                        if (hashCode == 3526482 && rawValue.equals("sell")) {
                            return OrderSide.sell;
                        }
                        return null;
                    }
                    if (rawValue.equals("buy")) {
                        return OrderSide.buy;
                    }
                    return null;
                }
                if (!rawValue.equals("unknown")) {
                    return null;
                }
                return OrderSide.unknown;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private OrderSide(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u001eB\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u001f"}, d2 = {"Lcom/polymarket/data/EOrder$OrderState;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "partiallyFilled", "filled", "cancelled", "replaced", "rejected", "expired", "new", "pendingNew", "pendingReplace", "pendingCancel", "pendingRisk", "unknown", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class OrderState implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ OrderState[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final OrderState partiallyFilled = new OrderState("partiallyFilled", 0, "partiallyFilled", null, 2, null);
        public static final OrderState filled = new OrderState("filled", 1, "filled", null, 2, null);
        public static final OrderState cancelled = new OrderState("cancelled", 2, "cancelled", null, 2, null);
        public static final OrderState replaced = new OrderState("replaced", 3, "replaced", null, 2, null);
        public static final OrderState rejected = new OrderState("rejected", 4, "rejected", null, 2, null);
        public static final OrderState expired = new OrderState("expired", 5, "expired", null, 2, null);

        /* renamed from: new, reason: not valid java name */
        public static final OrderState f7new = new OrderState("new", 6, "new", null, 2, null);
        public static final OrderState pendingNew = new OrderState("pendingNew", 7, "pendingNew", null, 2, null);
        public static final OrderState pendingReplace = new OrderState("pendingReplace", 8, "pendingReplace", null, 2, null);
        public static final OrderState pendingCancel = new OrderState("pendingCancel", 9, "pendingCancel", null, 2, null);
        public static final OrderState pendingRisk = new OrderState("pendingRisk", 10, "pendingRisk", null, 2, null);
        public static final OrderState unknown = new OrderState("unknown", 11, "unknown", null, 2, null);

        private static final /* synthetic */ OrderState[] $values() {
            return new OrderState[]{partiallyFilled, filled, cancelled, replaced, rejected, expired, f7new, pendingNew, pendingReplace, pendingCancel, pendingRisk, unknown};
        }

        static {
            OrderState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ OrderState(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static OrderState valueOf(String str) {
            return (OrderState) Enum.valueOf(OrderState.class, str);
        }

        public static OrderState[] values() {
            return (OrderState[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EOrder$OrderState$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EOrder$OrderState;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final OrderState init(String rawValue) {
                rawValue.getClass();
                switch (rawValue.hashCode()) {
                    case -1309235419:
                        if (!rawValue.equals("expired")) {
                            return null;
                        }
                        return OrderState.expired;
                    case -1274499742:
                        if (rawValue.equals("filled")) {
                            return OrderState.filled;
                        }
                        return null;
                    case -1174791907:
                        if (rawValue.equals("pendingReplace")) {
                            return OrderState.pendingReplace;
                        }
                        return null;
                    case -608496514:
                        if (rawValue.equals("rejected")) {
                            return OrderState.rejected;
                        }
                        return null;
                    case -430332880:
                        if (rawValue.equals("replaced")) {
                            return OrderState.replaced;
                        }
                        return null;
                    case -284840886:
                        if (rawValue.equals("unknown")) {
                            return OrderState.unknown;
                        }
                        return null;
                    case -55453967:
                        if (rawValue.equals("pendingCancel")) {
                            return OrderState.pendingCancel;
                        }
                        return null;
                    case 108960:
                        if (rawValue.equals("new")) {
                            return OrderState.f7new;
                        }
                        return null;
                    case 396247504:
                        if (rawValue.equals("partiallyFilled")) {
                            return OrderState.partiallyFilled;
                        }
                        return null;
                    case 476588369:
                        if (rawValue.equals("cancelled")) {
                            return OrderState.cancelled;
                        }
                        return null;
                    case 1113244934:
                        if (rawValue.equals("pendingRisk")) {
                            return OrderState.pendingRisk;
                        }
                        return null;
                    case 1698475145:
                        if (rawValue.equals("pendingNew")) {
                            return OrderState.pendingNew;
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

        private OrderState(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0015B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0016"}, d2 = {"Lcom/polymarket/data/EOrder$OrderType;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "limit", "market", "unknown", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class OrderType implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ OrderType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final OrderType limit = new OrderType("limit", 0, "limit", null, 2, null);
        public static final OrderType market = new OrderType("market", 1, "market", null, 2, null);
        public static final OrderType unknown = new OrderType("unknown", 2, "unknown", null, 2, null);
        private final String rawValue;

        private static final /* synthetic */ OrderType[] $values() {
            return new OrderType[]{limit, market, unknown};
        }

        static {
            OrderType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ OrderType(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static OrderType valueOf(String str) {
            return (OrderType) Enum.valueOf(OrderType.class, str);
        }

        public static OrderType[] values() {
            return (OrderType[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EOrder$OrderType$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EOrder$OrderType;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final OrderType init(String rawValue) {
                rawValue.getClass();
                int hashCode = rawValue.hashCode();
                if (hashCode != -1081306052) {
                    if (hashCode != -284840886) {
                        if (hashCode == 102976443 && rawValue.equals("limit")) {
                            return OrderType.limit;
                        }
                        return null;
                    }
                    if (rawValue.equals("unknown")) {
                        return OrderType.unknown;
                    }
                    return null;
                }
                if (!rawValue.equals("market")) {
                    return null;
                }
                return OrderType.market;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private OrderType(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0017B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0018"}, d2 = {"Lcom/polymarket/data/EOrder$TimeInForce;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "goodTillCancel", "goodTillDate", "immediateOrCancel", "fillOrKill", "unknown", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class TimeInForce implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ TimeInForce[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final TimeInForce goodTillCancel = new TimeInForce("goodTillCancel", 0, "goodTillCancel", null, 2, null);
        public static final TimeInForce goodTillDate = new TimeInForce("goodTillDate", 1, "goodTillDate", null, 2, null);
        public static final TimeInForce immediateOrCancel = new TimeInForce("immediateOrCancel", 2, "immediateOrCancel", null, 2, null);
        public static final TimeInForce fillOrKill = new TimeInForce("fillOrKill", 3, "fillOrKill", null, 2, null);
        public static final TimeInForce unknown = new TimeInForce("unknown", 4, "unknown", null, 2, null);

        private static final /* synthetic */ TimeInForce[] $values() {
            return new TimeInForce[]{goodTillCancel, goodTillDate, immediateOrCancel, fillOrKill, unknown};
        }

        static {
            TimeInForce[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ TimeInForce(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static TimeInForce valueOf(String str) {
            return (TimeInForce) Enum.valueOf(TimeInForce.class, str);
        }

        public static TimeInForce[] values() {
            return (TimeInForce[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EOrder$TimeInForce$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EOrder$TimeInForce;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final TimeInForce init(String rawValue) {
                rawValue.getClass();
                switch (rawValue.hashCode()) {
                    case -2104439538:
                        if (!rawValue.equals("immediateOrCancel")) {
                            return null;
                        }
                        return TimeInForce.immediateOrCancel;
                    case -693270716:
                        if (rawValue.equals("fillOrKill")) {
                            return TimeInForce.fillOrKill;
                        }
                        return null;
                    case -284840886:
                        if (rawValue.equals("unknown")) {
                            return TimeInForce.unknown;
                        }
                        return null;
                    case 82127840:
                        if (rawValue.equals("goodTillDate")) {
                            return TimeInForce.goodTillDate;
                        }
                        return null;
                    case 1586636332:
                        if (rawValue.equals("goodTillCancel")) {
                            return TimeInForce.goodTillCancel;
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

        private TimeInForce(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ3\u0010\u0010\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u0007J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0007J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u0007J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u0007J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0012\u001a\u00020\u0007¨\u0006\u001a"}, d2 = {"Lcom/polymarket/data/EOrder$Companion;", "", "<init>", "()V", "mock", "Lcom/polymarket/data/EOrder;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "type", "Lcom/polymarket/data/EOrder$OrderType;", "price", "Lcom/polymarket/data/EAmount;", "quantity", "Lcom/polymarket/data/EQuantity;", "state", "Lcom/polymarket/data/EOrder$OrderState;", "Swift_Companion_mock_0", "OrderType", "rawValue", "OrderState", "OrderSide", "Lcom/polymarket/data/EOrder$OrderSide;", "OrderIntent", "Lcom/polymarket/data/EOrder$OrderIntent;", "TimeInForce", "Lcom/polymarket/data/EOrder$TimeInForce;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native EOrder Swift_Companion_mock_0(String id, OrderType type, EAmount price, EQuantity quantity, OrderState state);

        public static /* synthetic */ EOrder mock$default(Companion companion, String str, OrderType orderType, EAmount eAmount, EQuantity eQuantity, OrderState orderState, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                orderType = OrderType.market;
            }
            if ((i & 4) != 0) {
                eAmount = EAmount.INSTANCE.usd(0.65d);
            }
            if ((i & 8) != 0) {
                eQuantity = EQuantity.INSTANCE.getZeroValue();
            }
            if ((i & 16) != 0) {
                orderState = OrderState.filled;
            }
            OrderState orderState2 = orderState;
            EAmount eAmount2 = eAmount;
            return companion.mock(str, orderType, eAmount2, eQuantity, orderState2);
        }

        public final OrderIntent OrderIntent(String rawValue) {
            rawValue.getClass();
            return OrderIntent.INSTANCE.init(rawValue);
        }

        public final OrderSide OrderSide(String rawValue) {
            rawValue.getClass();
            return OrderSide.INSTANCE.init(rawValue);
        }

        public final OrderState OrderState(String rawValue) {
            rawValue.getClass();
            return OrderState.INSTANCE.init(rawValue);
        }

        public final OrderType OrderType(String rawValue) {
            rawValue.getClass();
            return OrderType.INSTANCE.init(rawValue);
        }

        public final TimeInForce TimeInForce(String rawValue) {
            rawValue.getClass();
            return TimeInForce.INSTANCE.init(rawValue);
        }

        public final EOrder mock(String id, OrderType type, EAmount price, EQuantity quantity, OrderState state) {
            type.getClass();
            price.getClass();
            quantity.getClass();
            state.getClass();
            return Swift_Companion_mock_0(id, type, price, quantity, state);
        }

        private Companion() {
        }
    }

    public EOrder(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
