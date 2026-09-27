package com.polymarket.data;

import com.google.mlkit.vision.barcode.common.Barcode;
import io.radar.sdk.RadarTrackingOptions;
import io.radar.sdk.RadarTripOptions;
import java.net.URI;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 £\u00012\u00020\u00012\u00020\u0002:\u0002£\u0001B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBÃ\u0001\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010$J\u0006\u0010)\u001a\u00020*J\u0015\u0010+\u001a\u00020*2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010.\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00101\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00103\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00106\u001a\u0004\u0018\u00010\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00108\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010:\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010<\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010>\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010@\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010C\u001a\u0004\u0018\u00010\u00172\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010F\u001a\u0004\u0018\u00010\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010I\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010L\u001a\u00020\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010N\u001a\u00020\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010Q\u001a\u00020 2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010T\u001a\u0004\u0018\u00010\"2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010V\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010Y\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0010\u0010Z\u001a\u0004\u0018\u00010\r2\u0006\u0010[\u001a\u00020\\J\u001f\u0010]\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010[\u001a\u00020\\H\u0082 J\u0017\u0010`\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J©\u0001\u0010a\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\rH\u0082 J\u0015\u0010d\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010i\u001a\u00020f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010n\u001a\u0004\u0018\u00010k2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010q\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010t\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010w\u001a\u00020\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010z\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010}\u001a\u00020\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010\u0080\u0001\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010\u0083\u0001\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0018\u0010\u0086\u0001\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0018\u0010\u0089\u0001\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010\u008c\u0001\u001a\u00020\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0011\u0010\u008d\u0001\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ \u0010\u008e\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0082 J\u000f\u0010\u008f\u0001\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dJ\u001e\u0010\u0090\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0082 J\u000f\u0010\u0091\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u001e\u0010\u0092\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\f\u001a\u00020\rH\u0082 J\u0018\u0010\u0095\u0001\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010\u0096\u0001\u001a\u00020\u001d2\n\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0098\u0001H\u0096\u0002J\u001c\u0010\u0099\u0001\u001a\u00020\u001d2\u0007\u0010\u009a\u0001\u001a\u00020\u00002\u0007\u0010\u009b\u0001\u001a\u00020\u0000H\u0082 J\n\u0010\u009c\u0001\u001a\u00030\u009d\u0001H\u0016J\u0016\u0010\u009e\u0001\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010\u009f\u0001\u001a\n\u0012\u0005\u0012\u00030\u0098\u00010 \u00012\b\u0010¡\u0001\u001a\u00030\u009d\u0001H\u0016J\u001c\u0010¢\u0001\u001a\n\u0012\u0005\u0012\u00030\u0098\u00010 \u00012\b\u0010¡\u0001\u001a\u00030\u009d\u0001H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b2\u00100R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\u0011\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b7\u00100R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b9\u00100R\u0011\u0010\u0013\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b;\u00100R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b=\u00100R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b?\u00100R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010\u001e\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\bM\u0010KR\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0013\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0013\u0010#\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bU\u00100R\u0013\u0010W\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\bX\u0010HR\u0013\u0010^\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b_\u0010HR\u0011\u0010b\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bc\u00100R\u0011\u0010e\u001a\u00020f8F¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0013\u0010j\u001a\u0004\u0018\u00010k8F¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0011\u0010o\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bp\u00100R\u0011\u0010r\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bs\u00100R\u0011\u0010u\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\bv\u0010KR\u0011\u0010x\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\by\u00100R\u0011\u0010{\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b|\u0010KR\u0011\u0010~\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u007f\u00100R\u0013\u0010\u0081\u0001\u001a\u00020\r8F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u00100R\u0015\u0010\u0084\u0001\u001a\u0004\u0018\u00010\r8F¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u00100R\u0015\u0010\u0087\u0001\u001a\u0004\u0018\u00010\r8F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u00100R\u0013\u0010\u008a\u0001\u001a\u00020\u001d8F¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010KR\u0015\u0010\u0093\u0001\u001a\u0004\u0018\u00010\r8F¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u00100¨\u0006¤\u0001"}, d2 = {"Lcom/polymarket/data/EComboLegDetail;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "leg", "Lcom/polymarket/data/EComboLeg;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "marketTypeLabel", "marketType", "Lcom/polymarket/data/APIMarketType;", "eventId", "eventSlug", "eventTitle", "eventGroupTitle", "eventImage", "imageContent", "Lcom/polymarket/data/EMarketImageContext;", "eventStartTime", "Ljava/util/Date;", "indicativePrice", "Lcom/polymarket/data/EAmount;", "tradable", "", "live", "state", "Lcom/polymarket/data/EComboLegState;", "invalidReason", "Lcom/polymarket/data/EComboConflictType;", "invalidMessage", "(Lcom/polymarket/data/EComboLeg;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/APIMarketType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/EMarketImageContext;Ljava/util/Date;Lcom/polymarket/data/EAmount;ZZLcom/polymarket/data/EComboLegState;Lcom/polymarket/data/EComboConflictType;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getLeg", "()Lcom/polymarket/data/EComboLeg;", "Swift_leg", "getTitle", "()Ljava/lang/String;", "Swift_title", "getMarketTypeLabel", "Swift_marketTypeLabel", "getMarketType", "()Lcom/polymarket/data/APIMarketType;", "Swift_marketType", "getEventId", "Swift_eventId", "getEventSlug", "Swift_eventSlug", "getEventTitle", "Swift_eventTitle", "getEventGroupTitle", "Swift_eventGroupTitle", "getEventImage", "Swift_eventImage", "getImageContent", "()Lcom/polymarket/data/EMarketImageContext;", "Swift_imageContent", "getEventStartTime", "()Ljava/util/Date;", "Swift_eventStartTime", "getIndicativePrice", "()Lcom/polymarket/data/EAmount;", "Swift_indicativePrice", "getTradable", "()Z", "Swift_tradable", "getLive", "Swift_live", "getState", "()Lcom/polymarket/data/EComboLegState;", "Swift_state", "getInvalidReason", "()Lcom/polymarket/data/EComboConflictType;", "Swift_invalidReason", "getInvalidMessage", "Swift_invalidMessage", "displayIndicativePrice", "getDisplayIndicativePrice", "Swift_displayIndicativePrice", "displayOddsText", "format", "Lcom/polymarket/data/OddsFormat;", "Swift_displayOddsText_0", "cardIndicativePrice", "getCardIndicativePrice", "Swift_cardIndicativePrice", "Swift_constructor_5", "marketSlug", "getMarketSlug", "Swift_marketSlug", "outcomeSide", "Lcom/polymarket/data/EComboOutcomeSide;", "getOutcomeSide", "()Lcom/polymarket/data/EComboOutcomeSide;", "Swift_outcomeSide", "eventImageURL", "Ljava/net/URI;", "getEventImageURL", "()Ljava/net/URI;", "Swift_eventImageURL", "compactTitle", "getCompactTitle", "Swift_compactTitle", "inlineTitle", "getInlineTitle", "Swift_inlineTitle", "compactTitleNeedsNoBadge", "getCompactTitleNeedsNoBadge", "Swift_compactTitleNeedsNoBadge", "expandedTitle", "getExpandedTitle", "Swift_expandedTitle", "expandedTitleNeedsNoBadge", "getExpandedTitleNeedsNoBadge", "Swift_expandedTitleNeedsNoBadge", "standaloneExpandedTitle", "getStandaloneExpandedTitle", "Swift_standaloneExpandedTitle", "cardSelectionTitle", "getCardSelectionTitle", "Swift_cardSelectionTitle", "cardOddsText", "getCardOddsText", "Swift_cardOddsText", "cardMarketLabel", "getCardMarketLabel", "Swift_cardMarketLabel", "showsNoDecision", "getShowsNoDecision", "Swift_showsNoDecision", "withIndicativePrice", "Swift_withIndicativePrice_6", "withLive", "Swift_withLive_7", "withTitle", "Swift_withTitle_8", "formattedStartTime", "getFormattedStartTime", "Swift_formattedStartTime", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EComboLegDetail implements SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ EComboLegDetail(EComboLeg eComboLeg, String str, String str2, APIMarketType aPIMarketType, String str3, String str4, String str5, String str6, String str7, EMarketImageContext eMarketImageContext, Date date, EAmount eAmount, boolean z, boolean z2, EComboLegState eComboLegState, EComboConflictType eComboConflictType, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eComboLeg, str, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        String str9;
        APIMarketType aPIMarketType2;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        EMarketImageContext eMarketImageContext2;
        Date date2;
        EAmount eAmount2;
        boolean z3;
        boolean z4;
        EComboLegState eComboLegState2;
        EComboConflictType eComboConflictType2;
        String str15;
        if ((i & 4) != 0) {
            str9 = null;
        } else {
            str9 = str2;
        }
        if ((i & 8) != 0) {
            aPIMarketType2 = null;
        } else {
            aPIMarketType2 = aPIMarketType;
        }
        if ((i & 16) != 0) {
            str10 = "";
        } else {
            str10 = str3;
        }
        if ((i & 32) != 0) {
            str11 = null;
        } else {
            str11 = str4;
        }
        if ((i & 64) != 0) {
            str12 = "";
        } else {
            str12 = str5;
        }
        if ((i & 128) != 0) {
            str13 = null;
        } else {
            str13 = str6;
        }
        if ((i & 256) != 0) {
            str14 = null;
        } else {
            str14 = str7;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            eMarketImageContext2 = null;
        } else {
            eMarketImageContext2 = eMarketImageContext;
        }
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            date2 = null;
        } else {
            date2 = date;
        }
        if ((i & 2048) != 0) {
            eAmount2 = null;
        } else {
            eAmount2 = eAmount;
        }
        if ((i & 4096) != 0) {
            z3 = true;
        } else {
            z3 = z;
        }
        if ((i & 8192) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            eComboLegState2 = EComboLegState.pending;
        } else {
            eComboLegState2 = eComboLegState;
        }
        if ((32768 & i) != 0) {
            eComboConflictType2 = null;
        } else {
            eComboConflictType2 = eComboConflictType;
        }
        if ((i & 65536) != 0) {
            str15 = null;
        } else {
            str15 = str8;
        }
    }

    private final native EAmount Swift_cardIndicativePrice(long Swift_peer);

    private final native String Swift_cardMarketLabel(long Swift_peer);

    private final native String Swift_cardOddsText(long Swift_peer);

    private final native String Swift_cardSelectionTitle(long Swift_peer);

    private final native String Swift_compactTitle(long Swift_peer);

    private final native boolean Swift_compactTitleNeedsNoBadge(long Swift_peer);

    private final native long Swift_constructor_5(EComboLeg leg, String title, String marketTypeLabel, APIMarketType marketType, String eventId, String eventSlug, String eventTitle, String eventGroupTitle, String eventImage, EMarketImageContext imageContent, Date eventStartTime, EAmount indicativePrice, boolean tradable, boolean live, EComboLegState state, EComboConflictType invalidReason, String invalidMessage);

    private final native EAmount Swift_displayIndicativePrice(long Swift_peer);

    private final native String Swift_displayOddsText_0(long Swift_peer, OddsFormat format);

    private final native String Swift_eventGroupTitle(long Swift_peer);

    private final native String Swift_eventId(long Swift_peer);

    private final native String Swift_eventImage(long Swift_peer);

    private final native URI Swift_eventImageURL(long Swift_peer);

    private final native String Swift_eventSlug(long Swift_peer);

    private final native Date Swift_eventStartTime(long Swift_peer);

    private final native String Swift_eventTitle(long Swift_peer);

    private final native String Swift_expandedTitle(long Swift_peer);

    private final native boolean Swift_expandedTitleNeedsNoBadge(long Swift_peer);

    private final native String Swift_formattedStartTime(long Swift_peer);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native EMarketImageContext Swift_imageContent(long Swift_peer);

    private final native EAmount Swift_indicativePrice(long Swift_peer);

    private final native String Swift_inlineTitle(long Swift_peer);

    private final native String Swift_invalidMessage(long Swift_peer);

    private final native EComboConflictType Swift_invalidReason(long Swift_peer);

    private final native boolean Swift_isequal(EComboLegDetail lhs, EComboLegDetail rhs);

    private final native EComboLeg Swift_leg(long Swift_peer);

    private final native boolean Swift_live(long Swift_peer);

    private final native String Swift_marketSlug(long Swift_peer);

    private final native APIMarketType Swift_marketType(long Swift_peer);

    private final native String Swift_marketTypeLabel(long Swift_peer);

    private final native EComboOutcomeSide Swift_outcomeSide(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native boolean Swift_showsNoDecision(long Swift_peer);

    private final native String Swift_standaloneExpandedTitle(long Swift_peer);

    private final native EComboLegState Swift_state(long Swift_peer);

    private final native String Swift_title(long Swift_peer);

    private final native boolean Swift_tradable(long Swift_peer);

    private final native EComboLegDetail Swift_withIndicativePrice_6(long Swift_peer, EAmount indicativePrice);

    private final native EComboLegDetail Swift_withLive_7(long Swift_peer, boolean live);

    private final native EComboLegDetail Swift_withTitle_8(long Swift_peer, String title);

    @Override // skip.bridge.SwiftPeerBridged
    /* renamed from: Swift_peer, reason: from getter */
    public long getSwift_peer() {
        return this.Swift_peer;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String displayOddsText(OddsFormat format) {
        format.getClass();
        return Swift_displayOddsText_0(this.Swift_peer, format);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EComboLegDetail)) {
            return false;
        }
        return Swift_isequal(this, (EComboLegDetail) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final EAmount getCardIndicativePrice() {
        return Swift_cardIndicativePrice(this.Swift_peer);
    }

    public final String getCardMarketLabel() {
        return Swift_cardMarketLabel(this.Swift_peer);
    }

    public final String getCardOddsText() {
        return Swift_cardOddsText(this.Swift_peer);
    }

    public final String getCardSelectionTitle() {
        return Swift_cardSelectionTitle(this.Swift_peer);
    }

    public final String getCompactTitle() {
        return Swift_compactTitle(this.Swift_peer);
    }

    public final boolean getCompactTitleNeedsNoBadge() {
        return Swift_compactTitleNeedsNoBadge(this.Swift_peer);
    }

    public final EAmount getDisplayIndicativePrice() {
        return Swift_displayIndicativePrice(this.Swift_peer);
    }

    public final String getEventGroupTitle() {
        return Swift_eventGroupTitle(this.Swift_peer);
    }

    public final String getEventId() {
        return Swift_eventId(this.Swift_peer);
    }

    public final String getEventImage() {
        return Swift_eventImage(this.Swift_peer);
    }

    public final URI getEventImageURL() {
        return Swift_eventImageURL(this.Swift_peer);
    }

    public final String getEventSlug() {
        return Swift_eventSlug(this.Swift_peer);
    }

    public final Date getEventStartTime() {
        return Swift_eventStartTime(this.Swift_peer);
    }

    public final String getEventTitle() {
        return Swift_eventTitle(this.Swift_peer);
    }

    public final String getExpandedTitle() {
        return Swift_expandedTitle(this.Swift_peer);
    }

    public final boolean getExpandedTitleNeedsNoBadge() {
        return Swift_expandedTitleNeedsNoBadge(this.Swift_peer);
    }

    public final String getFormattedStartTime() {
        return Swift_formattedStartTime(this.Swift_peer);
    }

    public final EMarketImageContext getImageContent() {
        return Swift_imageContent(this.Swift_peer);
    }

    public final EAmount getIndicativePrice() {
        return Swift_indicativePrice(this.Swift_peer);
    }

    public final String getInlineTitle() {
        return Swift_inlineTitle(this.Swift_peer);
    }

    public final String getInvalidMessage() {
        return Swift_invalidMessage(this.Swift_peer);
    }

    public final EComboConflictType getInvalidReason() {
        return Swift_invalidReason(this.Swift_peer);
    }

    public final EComboLeg getLeg() {
        return Swift_leg(this.Swift_peer);
    }

    public final boolean getLive() {
        return Swift_live(this.Swift_peer);
    }

    public final String getMarketSlug() {
        return Swift_marketSlug(this.Swift_peer);
    }

    public final APIMarketType getMarketType() {
        return Swift_marketType(this.Swift_peer);
    }

    public final String getMarketTypeLabel() {
        return Swift_marketTypeLabel(this.Swift_peer);
    }

    public final EComboOutcomeSide getOutcomeSide() {
        return Swift_outcomeSide(this.Swift_peer);
    }

    public final boolean getShowsNoDecision() {
        return Swift_showsNoDecision(this.Swift_peer);
    }

    public final String getStandaloneExpandedTitle() {
        return Swift_standaloneExpandedTitle(this.Swift_peer);
    }

    public final EComboLegState getState() {
        return Swift_state(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final String getTitle() {
        return Swift_title(this.Swift_peer);
    }

    public final boolean getTradable() {
        return Swift_tradable(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(Swift_hashvalue(this.Swift_peer));
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public final EComboLegDetail withIndicativePrice(EAmount indicativePrice) {
        return Swift_withIndicativePrice_6(this.Swift_peer, indicativePrice);
    }

    public final EComboLegDetail withLive(boolean live) {
        return Swift_withLive_7(this.Swift_peer, live);
    }

    public final EComboLegDetail withTitle(String title) {
        title.getClass();
        return Swift_withTitle_8(this.Swift_peer, title);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082 J \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082 J\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082 J\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0017\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082 Ji\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u000e¢\u0006\u0002\u0010\u001fJ\\\u0010 \u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000eH\u0082 ¢\u0006\u0002\u0010\u001f¨\u0006!"}, d2 = {"Lcom/polymarket/data/EComboLegDetail$Companion;", "", "<init>", "()V", "sortedByStateForDisplay", "", "Lcom/polymarket/data/EComboLegDetail;", RadarTripOptions.KEY_LEGS, "Swift_Companion_sortedByStateForDisplay_1", "eventBucketsForDisplay", "Swift_Companion_eventBucketsForDisplay_2", "sortedForDisplay", "Swift_Companion_sortedForDisplay_3", "summaryStateForDisplay", "Lcom/polymarket/data/EComboLegState;", "Swift_Companion_summaryStateForDisplay_4", "mock", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "outcomeSide", "Lcom/polymarket/data/EComboOutcomeSide;", "eventId", "eventTitle", "eventGroupTitle", "eventStartTime", "Ljava/util/Date;", "indicativePriceUSD", "", "live", "", "state", "(Ljava/lang/String;Lcom/polymarket/data/EComboOutcomeSide;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Double;ZLcom/polymarket/data/EComboLegState;)Lcom/polymarket/data/EComboLegDetail;", "Swift_Companion_mock_9", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native List<List<EComboLegDetail>> Swift_Companion_eventBucketsForDisplay_2(List<EComboLegDetail> legs);

        private final native EComboLegDetail Swift_Companion_mock_9(String title, EComboOutcomeSide outcomeSide, String eventId, String eventTitle, String eventGroupTitle, Date eventStartTime, Double indicativePriceUSD, boolean live, EComboLegState state);

        private final native List<EComboLegDetail> Swift_Companion_sortedByStateForDisplay_1(List<EComboLegDetail> legs);

        private final native List<EComboLegDetail> Swift_Companion_sortedForDisplay_3(List<EComboLegDetail> legs);

        private final native EComboLegState Swift_Companion_summaryStateForDisplay_4(List<EComboLegDetail> legs);

        public static /* synthetic */ EComboLegDetail mock$default(Companion companion, String str, EComboOutcomeSide eComboOutcomeSide, String str2, String str3, String str4, Date date, Double d, boolean z, EComboLegState eComboLegState, int i, Object obj) {
            EComboOutcomeSide eComboOutcomeSide2;
            String str5;
            String str6;
            Date date2;
            boolean z2;
            EComboLegState eComboLegState2;
            if ((i & 2) != 0) {
                eComboOutcomeSide2 = EComboOutcomeSide.yes;
            } else {
                eComboOutcomeSide2 = eComboOutcomeSide;
            }
            String str7 = "";
            if ((i & 4) != 0) {
                str5 = "";
            } else {
                str5 = str2;
            }
            if ((i & 8) == 0) {
                str7 = str3;
            }
            Double d2 = null;
            if ((i & 16) != 0) {
                str6 = null;
            } else {
                str6 = str4;
            }
            if ((i & 32) != 0) {
                date2 = null;
            } else {
                date2 = date;
            }
            if ((i & 64) == 0) {
                d2 = d;
            }
            if ((i & 128) != 0) {
                z2 = false;
            } else {
                z2 = z;
            }
            if ((i & 256) != 0) {
                eComboLegState2 = EComboLegState.pending;
            } else {
                eComboLegState2 = eComboLegState;
            }
            return companion.mock(str, eComboOutcomeSide2, str5, str7, str6, date2, d2, z2, eComboLegState2);
        }

        public final List<List<EComboLegDetail>> eventBucketsForDisplay(List<EComboLegDetail> legs) {
            legs.getClass();
            return Swift_Companion_eventBucketsForDisplay_2(legs);
        }

        public final EComboLegDetail mock(String title, EComboOutcomeSide outcomeSide, String eventId, String eventTitle, String eventGroupTitle, Date eventStartTime, Double indicativePriceUSD, boolean live, EComboLegState state) {
            title.getClass();
            outcomeSide.getClass();
            eventId.getClass();
            eventTitle.getClass();
            state.getClass();
            return Swift_Companion_mock_9(title, outcomeSide, eventId, eventTitle, eventGroupTitle, eventStartTime, indicativePriceUSD, live, state);
        }

        public final List<EComboLegDetail> sortedByStateForDisplay(List<EComboLegDetail> legs) {
            legs.getClass();
            return Swift_Companion_sortedByStateForDisplay_1(legs);
        }

        public final List<EComboLegDetail> sortedForDisplay(List<EComboLegDetail> legs) {
            legs.getClass();
            return Swift_Companion_sortedForDisplay_3(legs);
        }

        public final EComboLegState summaryStateForDisplay(List<EComboLegDetail> legs) {
            legs.getClass();
            return Swift_Companion_summaryStateForDisplay_4(legs);
        }

        private Companion() {
        }
    }

    public EComboLegDetail(EComboLeg eComboLeg, String str, String str2, APIMarketType aPIMarketType, String str3, String str4, String str5, String str6, String str7, EMarketImageContext eMarketImageContext, Date date, EAmount eAmount, boolean z, boolean z2, EComboLegState eComboLegState, EComboConflictType eComboConflictType, String str8) {
        eComboLeg.getClass();
        str.getClass();
        str3.getClass();
        str5.getClass();
        eComboLegState.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_5(eComboLeg, str, str2, aPIMarketType, str3, str4, str5, str6, str7, eMarketImageContext, date, eAmount, z, z2, eComboLegState, eComboConflictType, str8);
    }

    public EComboLegDetail(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
