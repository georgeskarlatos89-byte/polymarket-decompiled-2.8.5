package com.polymarket.data;

import defpackage.ug7;
import defpackage.woa;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import java.util.Date;
import java.util.List;
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
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 ±\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0018¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001\u00ad\u0001®\u0001¯\u0001°\u0001±\u0001B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010!\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010\"\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u001bH\u0082 J\u0015\u0010*\u001a\u00020$2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010+\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020$H\u0082 J\u0015\u00102\u001a\u00020,2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u00103\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020,H\u0082 J\u0015\u0010:\u001a\u0002042\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010;\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u000204H\u0082 J\u001c\u0010A\u001a\u0004\u0018\u00010\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010BJ$\u0010C\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0015H\u0082 ¢\u0006\u0002\u0010DJ\u001c\u0010G\u001a\u0004\u0018\u00010\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010BJ$\u0010H\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0015H\u0082 ¢\u0006\u0002\u0010DJ\u0017\u0010O\u001a\u0004\u0018\u00010I2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010P\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010IH\u0082 J\u0017\u0010T\u001a\u0004\u0018\u00010I2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010U\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010IH\u0082 J\u0015\u0010Y\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010Z\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u001bH\u0082 J\u001b\u0010a\u001a\b\u0012\u0004\u0012\u00020\u001b0[2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u0010b\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0[H\u0082 J\u0017\u0010i\u001a\u0004\u0018\u00010c2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010j\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010cH\u0082 J\u0017\u0010q\u001a\u0004\u0018\u00010k2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010r\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010kH\u0082 J\u0015\u0010y\u001a\u00020s2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010z\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020sH\u0082 J\u0018\u0010\u0081\u0001\u001a\u0004\u0018\u00010{2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J \u0010\u0082\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010{H\u0082 J\u0018\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J \u0010\u0087\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0018\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J \u0010\u008c\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0019\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u008d\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J!\u0010\u0094\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\t\u0010#\u001a\u0005\u0018\u00010\u008d\u0001H\u0082 J\u0016\u0010\u0095\u0001\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\t\u0010¡\u0001\u001a\u00020\u0001H\u0016J\u0019\u0010¢\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170£\u00012\u0007\u0010¤\u0001\u001a\u00020\u0019H\u0016J\u001a\u0010¥\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170£\u00012\u0007\u0010¤\u0001\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010%\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010-\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00105\u001a\u0002042\u0006\u0010\u001a\u001a\u0002048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R(\u0010<\u001a\u0004\u0018\u00010\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R(\u0010E\u001a\u0004\u0018\u00010\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010>\"\u0004\bF\u0010@R(\u0010J\u001a\u0004\u0018\u00010I2\b\u0010\u001a\u001a\u0004\u0018\u00010I8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR(\u0010Q\u001a\u0004\u0018\u00010I2\b\u0010\u001a\u001a\u0004\u0018\u00010I8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010L\"\u0004\bS\u0010NR$\u0010V\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010\u001e\"\u0004\bX\u0010 R0\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u001b0[2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0[8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R(\u0010d\u001a\u0004\u0018\u00010c2\b\u0010\u001a\u001a\u0004\u0018\u00010c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR(\u0010l\u001a\u0004\u0018\u00010k2\b\u0010\u001a\u001a\u0004\u0018\u00010k8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR$\u0010t\u001a\u00020s2\u0006\u0010\u001a\u001a\u00020s8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR)\u0010|\u001a\u0004\u0018\u00010{2\b\u0010\u001a\u001a\u0004\u0018\u00010{8F@FX\u0086\u000e¢\u0006\r\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R+\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0084\u0001\u0010\u001e\"\u0005\b\u0085\u0001\u0010 R+\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0089\u0001\u0010\u001e\"\u0005\b\u008a\u0001\u0010 R/\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u00012\t\u0010\u001a\u001a\u0005\u0018\u00010\u008d\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R.\u0010\u0096\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0097\u0001X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001f\u0010\u009c\u0001\u001a\u00020\u0019X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001¨\u0006²\u0001"}, d2 = {"Lcom/polymarket/data/EPromotionCampaign;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Swift_id", "Swift_id_set", "value", "Lcom/polymarket/data/EPromotionCampaign$CampaignType;", "type", "getType", "()Lcom/polymarket/data/EPromotionCampaign$CampaignType;", "setType", "(Lcom/polymarket/data/EPromotionCampaign$CampaignType;)V", "Swift_type", "Swift_type_set", "Lcom/polymarket/data/EPromotionCampaign$Status;", "status", "getStatus", "()Lcom/polymarket/data/EPromotionCampaign$Status;", "setStatus", "(Lcom/polymarket/data/EPromotionCampaign$Status;)V", "Swift_status", "Swift_status_set", "Lcom/polymarket/data/EPromotionCampaign$Visibility;", "visibility", "getVisibility", "()Lcom/polymarket/data/EPromotionCampaign$Visibility;", "setVisibility", "(Lcom/polymarket/data/EPromotionCampaign$Visibility;)V", "Swift_visibility", "Swift_visibility_set", "highlighted", "getHighlighted", "()Ljava/lang/Boolean;", "setHighlighted", "(Ljava/lang/Boolean;)V", "Swift_highlighted", "(J)Ljava/lang/Boolean;", "Swift_highlighted_set", "(JLjava/lang/Boolean;)V", "isDefault", "setDefault", "Swift_isDefault", "Swift_isDefault_set", "Ljava/util/Date;", "startAt", "getStartAt", "()Ljava/util/Date;", "setStartAt", "(Ljava/util/Date;)V", "Swift_startAt", "Swift_startAt_set", "endAt", "getEndAt", "setEndAt", "Swift_endAt", "Swift_endAt_set", "timezone", "getTimezone", "setTimezone", "Swift_timezone", "Swift_timezone_set", "", "codes", "getCodes", "()Ljava/util/List;", "setCodes", "(Ljava/util/List;)V", "Swift_codes", "Swift_codes_set", "Lcom/polymarket/data/EPromotionCampaign$TradingBonus;", "tradingBonus", "getTradingBonus", "()Lcom/polymarket/data/EPromotionCampaign$TradingBonus;", "setTradingBonus", "(Lcom/polymarket/data/EPromotionCampaign$TradingBonus;)V", "Swift_tradingBonus", "Swift_tradingBonus_set", "Lcom/polymarket/data/EPromotionCampaign$DepositBonus;", "depositBonus", "getDepositBonus", "()Lcom/polymarket/data/EPromotionCampaign$DepositBonus;", "setDepositBonus", "(Lcom/polymarket/data/EPromotionCampaign$DepositBonus;)V", "Swift_depositBonus", "Swift_depositBonus_set", "Lcom/polymarket/data/EPromotionCampaign$Presentation;", "presentation", "getPresentation", "()Lcom/polymarket/data/EPromotionCampaign$Presentation;", "setPresentation", "(Lcom/polymarket/data/EPromotionCampaign$Presentation;)V", "Swift_presentation", "Swift_presentation_set", "Lcom/polymarket/data/EPromotionCampaign$Enrollment;", "enrollment", "getEnrollment", "()Lcom/polymarket/data/EPromotionCampaign$Enrollment;", "setEnrollment", "(Lcom/polymarket/data/EPromotionCampaign$Enrollment;)V", "Swift_enrollment", "Swift_enrollment_set", "rules", "getRules", "setRules", "Swift_rules", "Swift_rules_set", "termsAndConditions", "getTermsAndConditions", "setTermsAndConditions", "Swift_termsAndConditions", "Swift_termsAndConditions_set", "Lcom/polymarket/data/EPromotionCampaign$ReferrerUser;", "referrerUser", "getReferrerUser", "()Lcom/polymarket/data/EPromotionCampaign$ReferrerUser;", "setReferrerUser", "(Lcom/polymarket/data/EPromotionCampaign$ReferrerUser;)V", "Swift_referrerUser", "Swift_referrerUser_set", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "CampaignType", "Status", "Visibility", "TradingBonus", "DepositBonus", "Presentation", "Enrollment", "ReferrerUser", "IssuedDailyBonus", "ExploreAction", "BonusDay", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EPromotionCampaign implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010!\u001a\u00020\u001e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010%\u001a\u00020\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010(\u001a\u00020\u001e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010-\u001a\u0004\u0018\u00010*2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00140/2\u0006\u00100\u001a\u00020\u0016H\u0016J\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u00140/2\u0006\u00100\u001a\u00020\u0016H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\"\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010&\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b'\u0010 R\u0013\u0010)\u001a\u0004\u0018\u00010*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00063"}, d2 = {"Lcom/polymarket/data/EPromotionCampaign$TradingBonus;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "instruments", "", "", "getInstruments", "()Ljava/util/List;", "Swift_instruments", "qualifyingDeposit", "Lcom/polymarket/data/EAmount;", "getQualifyingDeposit", "()Lcom/polymarket/data/EAmount;", "Swift_qualifyingDeposit", "timerDays", "getTimerDays", "()I", "Swift_timerDays", "dailyBonus", "getDailyBonus", "Swift_dailyBonus", "lastDateForTrading", "Ljava/util/Date;", "getLastDateForTrading", "()Ljava/util/Date;", "Swift_lastDateForTrading", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class TradingBonus implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public TradingBonus(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private final native EAmount Swift_dailyBonus(long Swift_peer);

        private final native List<String> Swift_instruments(long Swift_peer);

        private final native Date Swift_lastDateForTrading(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native EAmount Swift_qualifyingDeposit(long Swift_peer);

        private final native void Swift_release(long Swift_peer);

        private final native int Swift_timerDays(long Swift_peer);

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

        public final EAmount getDailyBonus() {
            return Swift_dailyBonus(this.Swift_peer);
        }

        public final List<String> getInstruments() {
            return Swift_instruments(this.Swift_peer);
        }

        public final Date getLastDateForTrading() {
            return Swift_lastDateForTrading(this.Swift_peer);
        }

        public final EAmount getQualifyingDeposit() {
            return Swift_qualifyingDeposit(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final int getTimerDays() {
            return Swift_timerDays(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }
    }

    private EPromotionCampaign(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(mutableStruct);
    }

    private final native List<String> Swift_codes(long Swift_peer);

    private final native void Swift_codes_set(long Swift_peer, List<String> value);

    private final native long Swift_constructor_0(MutableStruct copy);

    private final native DepositBonus Swift_depositBonus(long Swift_peer);

    private final native void Swift_depositBonus_set(long Swift_peer, DepositBonus value);

    private final native Date Swift_endAt(long Swift_peer);

    private final native void Swift_endAt_set(long Swift_peer, Date value);

    private final native Enrollment Swift_enrollment(long Swift_peer);

    private final native void Swift_enrollment_set(long Swift_peer, Enrollment value);

    private final native Boolean Swift_highlighted(long Swift_peer);

    private final native void Swift_highlighted_set(long Swift_peer, Boolean value);

    private final native String Swift_id(long Swift_peer);

    private final native void Swift_id_set(long Swift_peer, String value);

    private final native Boolean Swift_isDefault(long Swift_peer);

    private final native void Swift_isDefault_set(long Swift_peer, Boolean value);

    private final native Presentation Swift_presentation(long Swift_peer);

    private final native void Swift_presentation_set(long Swift_peer, Presentation value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native ReferrerUser Swift_referrerUser(long Swift_peer);

    private final native void Swift_referrerUser_set(long Swift_peer, ReferrerUser value);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_rules(long Swift_peer);

    private final native void Swift_rules_set(long Swift_peer, String value);

    private final native Date Swift_startAt(long Swift_peer);

    private final native void Swift_startAt_set(long Swift_peer, Date value);

    private final native Status Swift_status(long Swift_peer);

    private final native void Swift_status_set(long Swift_peer, Status value);

    private final native String Swift_termsAndConditions(long Swift_peer);

    private final native void Swift_termsAndConditions_set(long Swift_peer, String value);

    private final native String Swift_timezone(long Swift_peer);

    private final native void Swift_timezone_set(long Swift_peer, String value);

    private final native TradingBonus Swift_tradingBonus(long Swift_peer);

    private final native void Swift_tradingBonus_set(long Swift_peer, TradingBonus value);

    private final native CampaignType Swift_type(long Swift_peer);

    private final native void Swift_type_set(long Swift_peer, CampaignType value);

    private final native Visibility Swift_visibility(long Swift_peer);

    private final native void Swift_visibility_set(long Swift_peer, Visibility value);

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

    public final List<String> getCodes() {
        return Swift_codes(this.Swift_peer);
    }

    public final DepositBonus getDepositBonus() {
        return Swift_depositBonus(this.Swift_peer);
    }

    public final Date getEndAt() {
        return Swift_endAt(this.Swift_peer);
    }

    public final Enrollment getEnrollment() {
        return Swift_enrollment(this.Swift_peer);
    }

    public final Boolean getHighlighted() {
        return Swift_highlighted(this.Swift_peer);
    }

    public final String getId() {
        return Swift_id(this.Swift_peer);
    }

    public final Presentation getPresentation() {
        return Swift_presentation(this.Swift_peer);
    }

    public final ReferrerUser getReferrerUser() {
        return Swift_referrerUser(this.Swift_peer);
    }

    public final String getRules() {
        return Swift_rules(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    public final Date getStartAt() {
        return Swift_startAt(this.Swift_peer);
    }

    public final Status getStatus() {
        return Swift_status(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final String getTermsAndConditions() {
        return Swift_termsAndConditions(this.Swift_peer);
    }

    public final String getTimezone() {
        return Swift_timezone(this.Swift_peer);
    }

    public final TradingBonus getTradingBonus() {
        return Swift_tradingBonus(this.Swift_peer);
    }

    public final CampaignType getType() {
        return Swift_type(this.Swift_peer);
    }

    public final Visibility getVisibility() {
        return Swift_visibility(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final Boolean isDefault() {
        return Swift_isDefault(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new EPromotionCampaign(this);
    }

    public final void setCodes(List<String> list) {
        list.getClass();
        List<String> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_codes_set(this.Swift_peer, list2);
        } finally {
            didmutate();
        }
    }

    public final void setDefault(Boolean bool) {
        willmutate();
        try {
            Swift_isDefault_set(this.Swift_peer, bool);
        } finally {
            didmutate();
        }
    }

    public final void setDepositBonus(DepositBonus depositBonus) {
        willmutate();
        try {
            Swift_depositBonus_set(this.Swift_peer, depositBonus);
        } finally {
            didmutate();
        }
    }

    public final void setEndAt(Date date) {
        Date date2 = (Date) StructKt.sref$default(date, null, 1, null);
        willmutate();
        try {
            Swift_endAt_set(this.Swift_peer, date2);
        } finally {
            didmutate();
        }
    }

    public final void setEnrollment(Enrollment enrollment) {
        Enrollment enrollment2 = (Enrollment) StructKt.sref$default(enrollment, null, 1, null);
        willmutate();
        try {
            Swift_enrollment_set(this.Swift_peer, enrollment2);
        } finally {
            didmutate();
        }
    }

    public final void setHighlighted(Boolean bool) {
        willmutate();
        try {
            Swift_highlighted_set(this.Swift_peer, bool);
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

    public final void setPresentation(Presentation presentation) {
        presentation.getClass();
        willmutate();
        try {
            Swift_presentation_set(this.Swift_peer, presentation);
        } finally {
            didmutate();
        }
    }

    public final void setReferrerUser(ReferrerUser referrerUser) {
        willmutate();
        try {
            Swift_referrerUser_set(this.Swift_peer, referrerUser);
        } finally {
            didmutate();
        }
    }

    public final void setRules(String str) {
        willmutate();
        try {
            Swift_rules_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    public final void setStartAt(Date date) {
        Date date2 = (Date) StructKt.sref$default(date, null, 1, null);
        willmutate();
        try {
            Swift_startAt_set(this.Swift_peer, date2);
        } finally {
            didmutate();
        }
    }

    public final void setStatus(Status status) {
        status.getClass();
        willmutate();
        try {
            Swift_status_set(this.Swift_peer, status);
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

    public final void setTermsAndConditions(String str) {
        willmutate();
        try {
            Swift_termsAndConditions_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setTimezone(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_timezone_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setTradingBonus(TradingBonus tradingBonus) {
        willmutate();
        try {
            Swift_tradingBonus_set(this.Swift_peer, tradingBonus);
        } finally {
            didmutate();
        }
    }

    public final void setType(CampaignType campaignType) {
        campaignType.getClass();
        willmutate();
        try {
            Swift_type_set(this.Swift_peer, campaignType);
        } finally {
            didmutate();
        }
    }

    public final void setVisibility(Visibility visibility) {
        visibility.getClass();
        willmutate();
        try {
            Swift_visibility_set(this.Swift_peer, visibility);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00029:B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB5\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\n\u0010\u0015J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0015\u0010\u001c\u001a\u00020\u001b2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\u0010H\u0016J\u0015\u0010$\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010'\u001a\u00020\u000e2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010*\u001a\u00020\u00102\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010-\u001a\u00020\u00122\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u00100\u001a\u0004\u0018\u00010\u00142\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J7\u00101\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0082 J\u0015\u00104\u001a\u00020\u001e2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020 062\u0006\u00107\u001a\u00020\u0010H\u0016J\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020 062\u0006\u00107\u001a\u00020\u0010H\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00102\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u0006;"}, d2 = {"Lcom/polymarket/data/EPromotionCampaign$BonusDay;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "localDate", "Ljava/util/Date;", "dayNumber", "", "state", "Lcom/polymarket/data/EPromotionCampaign$BonusDay$State;", "issuedAmount", "Lcom/polymarket/data/EAmount;", "(Ljava/lang/String;Ljava/util/Date;ILcom/polymarket/data/EPromotionCampaign$BonusDay$State;Lcom/polymarket/data/EAmount;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "getId", "()Ljava/lang/String;", "Swift_id", "getLocalDate", "()Ljava/util/Date;", "Swift_localDate", "getDayNumber", "()I", "Swift_dayNumber", "getState", "()Lcom/polymarket/data/EPromotionCampaign$BonusDay$State;", "Swift_state", "getIssuedAmount", "()Lcom/polymarket/data/EAmount;", "Swift_issuedAmount", "Swift_constructor_0", "isToday", "()Z", "Swift_isToday", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "State", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class BonusDay implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private long Swift_peer;

        public BonusDay(String str, Date date, int i, State state, EAmount eAmount) {
            str.getClass();
            date.getClass();
            state.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, date, i, state, eAmount);
        }

        private final native long Swift_constructor_0(String id, Date localDate, int dayNumber, State state, EAmount issuedAmount);

        private final native int Swift_dayNumber(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isToday(long Swift_peer);

        private final native EAmount Swift_issuedAmount(long Swift_peer);

        private final native Date Swift_localDate(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native State Swift_state(long Swift_peer);

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

        public final int getDayNumber() {
            return Swift_dayNumber(this.Swift_peer);
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
        }

        public final EAmount getIssuedAmount() {
            return Swift_issuedAmount(this.Swift_peer);
        }

        public final Date getLocalDate() {
            return Swift_localDate(this.Swift_peer);
        }

        public final State getState() {
            return Swift_state(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final boolean isToday() {
            return Swift_isToday(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0017B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0018"}, d2 = {"Lcom/polymarket/data/EPromotionCampaign$BonusDay$State;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "earned", "todayEarned", "todayPending", "missed", "upcoming", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class State implements RawRepresentable<String>, SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ State[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final String rawValue;
            public static final State earned = new State("earned", 0, "earned", null, 2, null);
            public static final State todayEarned = new State("todayEarned", 1, "todayEarned", null, 2, null);
            public static final State todayPending = new State("todayPending", 2, "todayPending", null, 2, null);
            public static final State missed = new State("missed", 3, "missed", null, 2, null);
            public static final State upcoming = new State("upcoming", 4, "upcoming", null, 2, null);

            private static final /* synthetic */ State[] $values() {
                return new State[]{earned, todayEarned, todayPending, missed, upcoming};
            }

            static {
                State[] $values = $values();
                $VALUES = $values;
                $ENTRIES = ww4.b($values);
                INSTANCE = new Companion(null);
            }

            public /* synthetic */ State(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, str2, (i2 & 2) != 0 ? null : r4);
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static ug7 getEntries() {
                return $ENTRIES;
            }

            public static State valueOf(String str) {
                return (State) Enum.valueOf(State.class, str);
            }

            public static State[] values() {
                return (State[]) $VALUES.clone();
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
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EPromotionCampaign$BonusDay$State$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EPromotionCampaign$BonusDay$State;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final State init(String rawValue) {
                    rawValue.getClass();
                    switch (rawValue.hashCode()) {
                        case -1310336393:
                            if (!rawValue.equals("earned")) {
                                return null;
                            }
                            return State.earned;
                        case -1073880421:
                            if (rawValue.equals("missed")) {
                                return State.missed;
                            }
                            return null;
                        case -96598250:
                            if (rawValue.equals("todayPending")) {
                                return State.todayPending;
                            }
                            return null;
                        case 648229144:
                            if (rawValue.equals("todayEarned")) {
                                return State.todayEarned;
                            }
                            return null;
                        case 1306691868:
                            if (rawValue.equals("upcoming")) {
                                return State.upcoming;
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

            private State(String str, int i, String str2, Void r4) {
                this.rawValue = str2;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EPromotionCampaign$BonusDay$Companion;", "", "<init>", "()V", "State", "Lcom/polymarket/data/EPromotionCampaign$BonusDay$State;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final State State(String rawValue) {
                rawValue.getClass();
                return State.INSTANCE.init(rawValue);
            }

            private Companion() {
            }
        }

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ String getId() {
            return getId2();
        }

        public BonusDay(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ BonusDay(String str, Date date, int i, State state, EAmount eAmount, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, date, i, state, (i2 & 16) != 0 ? null : eAmount);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 k2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002jkB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010!\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010\"\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u001bH\u0082 J\u0015\u0010*\u001a\u00020$2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010+\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020$H\u0082 J\u0017\u00102\u001a\u0004\u0018\u00010,2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u00103\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010,H\u0082 J\u0017\u00107\u001a\u0004\u0018\u00010,2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u00108\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010,H\u0082 J\u0017\u0010<\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010=\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u0010A\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010B\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u0010F\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010G\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u001b\u0010O\u001a\b\u0012\u0004\u0012\u00020I0H2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u0010P\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010#\u001a\b\u0012\u0004\u0012\u00020I0HH\u0082 J\u0017\u0010W\u001a\u0004\u0018\u00010Q2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010X\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010QH\u0082 J\u0015\u0010Y\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\b\u0010e\u001a\u00020\u0001H\u0016J\u0016\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00170g2\u0006\u0010h\u001a\u00020\u0019H\u0016J\u0017\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00170g2\u0006\u0010h\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010%\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R(\u0010-\u001a\u0004\u0018\u00010,2\b\u0010\u001a\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R(\u00104\u001a\u0004\u0018\u00010,2\b\u0010\u001a\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010/\"\u0004\b6\u00101R(\u00109\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010\u001e\"\u0004\b;\u0010 R(\u0010>\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010\u001e\"\u0004\b@\u0010 R(\u0010C\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010\u001e\"\u0004\bE\u0010 R0\u0010J\u001a\b\u0012\u0004\u0012\u00020I0H2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020I0H8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR(\u0010R\u001a\u0004\u0018\u00010Q2\b\u0010\u001a\u001a\u0004\u0018\u00010Q8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR(\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010[X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001a\u0010`\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010d¨\u0006l"}, d2 = {"Lcom/polymarket/data/EPromotionCampaign$Enrollment;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "", "promotionId", "getPromotionId", "()Ljava/lang/String;", "setPromotionId", "(Ljava/lang/String;)V", "Swift_promotionId", "Swift_promotionId_set", "value", "Lcom/polymarket/data/EPromotionCampaign$Enrollment$Status;", "status", "getStatus", "()Lcom/polymarket/data/EPromotionCampaign$Enrollment$Status;", "setStatus", "(Lcom/polymarket/data/EPromotionCampaign$Enrollment$Status;)V", "Swift_status", "Swift_status_set", "Ljava/util/Date;", "enrolledAt", "getEnrolledAt", "()Ljava/util/Date;", "setEnrolledAt", "(Ljava/util/Date;)V", "Swift_enrolledAt", "Swift_enrolledAt_set", "qualifiedAt", "getQualifiedAt", "setQualifiedAt", "Swift_qualifiedAt", "Swift_qualifiedAt_set", "qualifyingDepositTransactionId", "getQualifyingDepositTransactionId", "setQualifyingDepositTransactionId", "Swift_qualifyingDepositTransactionId", "Swift_qualifyingDepositTransactionId_set", "eligibleStartDate", "getEligibleStartDate", "setEligibleStartDate", "Swift_eligibleStartDate", "Swift_eligibleStartDate_set", "eligibleEndDate", "getEligibleEndDate", "setEligibleEndDate", "Swift_eligibleEndDate", "Swift_eligibleEndDate_set", "", "Lcom/polymarket/data/EPromotionCampaign$IssuedDailyBonus;", "issuedDailyBonuses", "getIssuedDailyBonuses", "()Ljava/util/List;", "setIssuedDailyBonuses", "(Ljava/util/List;)V", "Swift_issuedDailyBonuses", "Swift_issuedDailyBonuses_set", "Lcom/polymarket/data/EPromotionCampaign$ExploreAction;", "exploreAction", "getExploreAction", "()Lcom/polymarket/data/EPromotionCampaign$ExploreAction;", "setExploreAction", "(Lcom/polymarket/data/EPromotionCampaign$ExploreAction;)V", "Swift_exploreAction", "Swift_exploreAction_set", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Status", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Enrollment implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        private Enrollment(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(mutableStruct);
        }

        private final native long Swift_constructor_0(MutableStruct copy);

        private final native String Swift_eligibleEndDate(long Swift_peer);

        private final native void Swift_eligibleEndDate_set(long Swift_peer, String value);

        private final native String Swift_eligibleStartDate(long Swift_peer);

        private final native void Swift_eligibleStartDate_set(long Swift_peer, String value);

        private final native Date Swift_enrolledAt(long Swift_peer);

        private final native void Swift_enrolledAt_set(long Swift_peer, Date value);

        private final native ExploreAction Swift_exploreAction(long Swift_peer);

        private final native void Swift_exploreAction_set(long Swift_peer, ExploreAction value);

        private final native List<IssuedDailyBonus> Swift_issuedDailyBonuses(long Swift_peer);

        private final native void Swift_issuedDailyBonuses_set(long Swift_peer, List<IssuedDailyBonus> value);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native String Swift_promotionId(long Swift_peer);

        private final native void Swift_promotionId_set(long Swift_peer, String value);

        private final native Date Swift_qualifiedAt(long Swift_peer);

        private final native void Swift_qualifiedAt_set(long Swift_peer, Date value);

        private final native String Swift_qualifyingDepositTransactionId(long Swift_peer);

        private final native void Swift_qualifyingDepositTransactionId_set(long Swift_peer, String value);

        private final native void Swift_release(long Swift_peer);

        private final native Status Swift_status(long Swift_peer);

        private final native void Swift_status_set(long Swift_peer, Status value);

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

        public final String getEligibleEndDate() {
            return Swift_eligibleEndDate(this.Swift_peer);
        }

        public final String getEligibleStartDate() {
            return Swift_eligibleStartDate(this.Swift_peer);
        }

        public final Date getEnrolledAt() {
            return Swift_enrolledAt(this.Swift_peer);
        }

        public final ExploreAction getExploreAction() {
            return Swift_exploreAction(this.Swift_peer);
        }

        public final List<IssuedDailyBonus> getIssuedDailyBonuses() {
            return Swift_issuedDailyBonuses(this.Swift_peer);
        }

        public final String getPromotionId() {
            return Swift_promotionId(this.Swift_peer);
        }

        public final Date getQualifiedAt() {
            return Swift_qualifiedAt(this.Swift_peer);
        }

        public final String getQualifyingDepositTransactionId() {
            return Swift_qualifyingDepositTransactionId(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public int getSmutatingcount() {
            return this.smutatingcount;
        }

        public final Status getStatus() {
            return Swift_status(this.Swift_peer);
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
            return new Enrollment(this);
        }

        public final void setEligibleEndDate(String str) {
            willmutate();
            try {
                Swift_eligibleEndDate_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setEligibleStartDate(String str) {
            willmutate();
            try {
                Swift_eligibleStartDate_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setEnrolledAt(Date date) {
            Date date2 = (Date) StructKt.sref$default(date, null, 1, null);
            willmutate();
            try {
                Swift_enrolledAt_set(this.Swift_peer, date2);
            } finally {
                didmutate();
            }
        }

        public final void setExploreAction(ExploreAction exploreAction) {
            willmutate();
            try {
                Swift_exploreAction_set(this.Swift_peer, exploreAction);
            } finally {
                didmutate();
            }
        }

        public final void setIssuedDailyBonuses(List<IssuedDailyBonus> list) {
            list.getClass();
            List<IssuedDailyBonus> list2 = (List) StructKt.sref$default(list, null, 1, null);
            willmutate();
            try {
                Swift_issuedDailyBonuses_set(this.Swift_peer, list2);
            } finally {
                didmutate();
            }
        }

        public final void setPromotionId(String str) {
            str.getClass();
            willmutate();
            try {
                Swift_promotionId_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setQualifiedAt(Date date) {
            Date date2 = (Date) StructKt.sref$default(date, null, 1, null);
            willmutate();
            try {
                Swift_qualifiedAt_set(this.Swift_peer, date2);
            } finally {
                didmutate();
            }
        }

        public final void setQualifyingDepositTransactionId(String str) {
            willmutate();
            try {
                Swift_qualifyingDepositTransactionId_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void setSmutatingcount(int i) {
            this.smutatingcount = i;
        }

        public final void setStatus(Status status) {
            status.getClass();
            willmutate();
            try {
                Swift_status_set(this.Swift_peer, status);
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

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0016B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0017"}, d2 = {"Lcom/polymarket/data/EPromotionCampaign$Enrollment$Status;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "enrolled", "qualified", "expired", "unknown", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Status implements RawRepresentable<String>, SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ Status[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final String rawValue;
            public static final Status enrolled = new Status("enrolled", 0, "ENROLLED", null, 2, null);
            public static final Status qualified = new Status("qualified", 1, "QUALIFIED", null, 2, null);
            public static final Status expired = new Status("expired", 2, "EXPIRED", null, 2, null);
            public static final Status unknown = new Status("unknown", 3, "unknown", null, 2, null);

            private static final /* synthetic */ Status[] $values() {
                return new Status[]{enrolled, qualified, expired, unknown};
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
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EPromotionCampaign$Enrollment$Status$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EPromotionCampaign$Enrollment$Status;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Status init(String rawValue) {
                    rawValue.getClass();
                    switch (rawValue.hashCode()) {
                        case -1371440187:
                            if (!rawValue.equals("ENROLLED")) {
                                return null;
                            }
                            return Status.enrolled;
                        case -591252731:
                            if (rawValue.equals("EXPIRED")) {
                                return Status.expired;
                            }
                            return null;
                        case -284840886:
                            if (rawValue.equals("unknown")) {
                                return Status.unknown;
                            }
                            return null;
                        case 1538654332:
                            if (rawValue.equals("QUALIFIED")) {
                                return Status.qualified;
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

            private Status(String str, int i, String str2, Void r4) {
                this.rawValue = str2;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EPromotionCampaign$Enrollment$Companion;", "", "<init>", "()V", "Status", "Lcom/polymarket/data/EPromotionCampaign$Enrollment$Status;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Status Status(String rawValue) {
                rawValue.getClass();
                return Status.INSTANCE.init(rawValue);
            }

            private Companion() {
            }
        }

        public Enrollment(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0015B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0016"}, d2 = {"Lcom/polymarket/data/EPromotionCampaign$CampaignType;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "tradingBonus", "depositBonus", "unknown", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CampaignType implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ CampaignType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final CampaignType tradingBonus = new CampaignType("tradingBonus", 0, "TRADING_BONUS", null, 2, null);
        public static final CampaignType depositBonus = new CampaignType("depositBonus", 1, "DEPOSIT_BONUS", null, 2, null);
        public static final CampaignType unknown = new CampaignType("unknown", 2, "unknown", null, 2, null);

        private static final /* synthetic */ CampaignType[] $values() {
            return new CampaignType[]{tradingBonus, depositBonus, unknown};
        }

        static {
            CampaignType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ CampaignType(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static CampaignType valueOf(String str) {
            return (CampaignType) Enum.valueOf(CampaignType.class, str);
        }

        public static CampaignType[] values() {
            return (CampaignType[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EPromotionCampaign$CampaignType$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EPromotionCampaign$CampaignType;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CampaignType init(String rawValue) {
                rawValue.getClass();
                int hashCode = rawValue.hashCode();
                if (hashCode != -1420437695) {
                    if (hashCode != -284840886) {
                        if (hashCode == 178640638 && rawValue.equals("DEPOSIT_BONUS")) {
                            return CampaignType.depositBonus;
                        }
                        return null;
                    }
                    if (rawValue.equals("unknown")) {
                        return CampaignType.unknown;
                    }
                    return null;
                }
                if (!rawValue.equals("TRADING_BONUS")) {
                    return null;
                }
                return CampaignType.tradingBonus;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private CampaignType(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0017B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0018"}, d2 = {"Lcom/polymarket/data/EPromotionCampaign$Status;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "active", "paused", "archived", "expired", "unknown", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Status implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final Status active = new Status("active", 0, "ACTIVE", null, 2, null);
        public static final Status paused = new Status("paused", 1, "PAUSED", null, 2, null);
        public static final Status archived = new Status("archived", 2, "ARCHIVED", null, 2, null);
        public static final Status expired = new Status("expired", 3, "EXPIRED", null, 2, null);
        public static final Status unknown = new Status("unknown", 4, "unknown", null, 2, null);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{active, paused, archived, expired, unknown};
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EPromotionCampaign$Status$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EPromotionCampaign$Status;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Status init(String rawValue) {
                rawValue.getClass();
                switch (rawValue.hashCode()) {
                    case -1941992146:
                        if (!rawValue.equals("PAUSED")) {
                            return null;
                        }
                        return Status.paused;
                    case -933681182:
                        if (rawValue.equals("ARCHIVED")) {
                            return Status.archived;
                        }
                        return null;
                    case -591252731:
                        if (rawValue.equals("EXPIRED")) {
                            return Status.expired;
                        }
                        return null;
                    case -284840886:
                        if (rawValue.equals("unknown")) {
                            return Status.unknown;
                        }
                        return null;
                    case 1925346054:
                        if (rawValue.equals("ACTIVE")) {
                            return Status.active;
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

        private Status(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0015B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0016"}, d2 = {"Lcom/polymarket/data/EPromotionCampaign$Visibility;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "publicVisibility", "hidden", "unknown", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Visibility implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Visibility[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final Visibility publicVisibility = new Visibility("publicVisibility", 0, "PUBLIC", null, 2, null);
        public static final Visibility hidden = new Visibility("hidden", 1, "HIDDEN", null, 2, null);
        public static final Visibility unknown = new Visibility("unknown", 2, "unknown", null, 2, null);

        private static final /* synthetic */ Visibility[] $values() {
            return new Visibility[]{publicVisibility, hidden, unknown};
        }

        static {
            Visibility[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ Visibility(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Visibility valueOf(String str) {
            return (Visibility) Enum.valueOf(Visibility.class, str);
        }

        public static Visibility[] values() {
            return (Visibility[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EPromotionCampaign$Visibility$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EPromotionCampaign$Visibility;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Visibility init(String rawValue) {
                rawValue.getClass();
                int hashCode = rawValue.hashCode();
                if (hashCode != -1924094359) {
                    if (hashCode != -284840886) {
                        if (hashCode == 2130809258 && rawValue.equals("HIDDEN")) {
                            return Visibility.hidden;
                        }
                        return null;
                    }
                    if (rawValue.equals("unknown")) {
                        return Visibility.unknown;
                    }
                    return null;
                }
                if (!rawValue.equals("PUBLIC")) {
                    return null;
                }
                return Visibility.publicVisibility;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private Visibility(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/data/EPromotionCampaign$Companion;", "", "<init>", "()V", "CampaignType", "Lcom/polymarket/data/EPromotionCampaign$CampaignType;", "rawValue", "", "Status", "Lcom/polymarket/data/EPromotionCampaign$Status;", "Visibility", "Lcom/polymarket/data/EPromotionCampaign$Visibility;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CampaignType CampaignType(String rawValue) {
            rawValue.getClass();
            return CampaignType.INSTANCE.init(rawValue);
        }

        public final Status Status(String rawValue) {
            rawValue.getClass();
            return Status.INSTANCE.init(rawValue);
        }

        public final Visibility Visibility(String rawValue) {
            rawValue.getClass();
            return Visibility.INSTANCE.init(rawValue);
        }

        private Companion() {
        }
    }

    public EPromotionCampaign(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0015\u0010\u001e\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010!\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001d\u0010\"\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0082 J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190$2\u0006\u0010%\u001a\u00020\u001bH\u0016J\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190$2\u0006\u0010%\u001a\u00020\u001bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006("}, d2 = {"Lcom/polymarket/data/EPromotionCampaign$ExploreAction;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "url", "Ljava/net/URI;", "(Ljava/lang/String;Ljava/net/URI;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getTitle", "()Ljava/lang/String;", "Swift_title", "getUrl", "()Ljava/net/URI;", "Swift_url", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ExploreAction implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public ExploreAction(String str, URI uri) {
            str.getClass();
            uri.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, uri);
        }

        private final native long Swift_constructor_0(String title, URI url);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_title(long Swift_peer);

        private final native URI Swift_url(long Swift_peer);

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

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getTitle() {
            return Swift_title(this.Swift_peer);
        }

        public final URI getUrl() {
            return Swift_url(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public ExploreAction(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ ExploreAction(String str, URI uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, uri);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0015\u0010\u001e\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010!\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001d\u0010\"\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0082 J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190$2\u0006\u0010%\u001a\u00020\u001bH\u0016J\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190$2\u0006\u0010%\u001a\u00020\u001bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006("}, d2 = {"Lcom/polymarket/data/EPromotionCampaign$IssuedDailyBonus;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "localDate", "", "amount", "Lcom/polymarket/data/EAmount;", "(Ljava/lang/String;Lcom/polymarket/data/EAmount;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getLocalDate", "()Ljava/lang/String;", "Swift_localDate", "getAmount", "()Lcom/polymarket/data/EAmount;", "Swift_amount", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class IssuedDailyBonus implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public IssuedDailyBonus(String str, EAmount eAmount) {
            str.getClass();
            eAmount.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, eAmount);
        }

        private final native EAmount Swift_amount(long Swift_peer);

        private final native long Swift_constructor_0(String localDate, EAmount amount);

        private final native String Swift_localDate(long Swift_peer);

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

        public final EAmount getAmount() {
            return Swift_amount(this.Swift_peer);
        }

        public final String getLocalDate() {
            return Swift_localDate(this.Swift_peer);
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

        public IssuedDailyBonus(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ IssuedDailyBonus(String str, EAmount eAmount, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? EAmount.INSTANCE.getZeroUSD() : eAmount);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB)\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0015\u0010\u001f\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010!\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010$\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J'\u0010%\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0082 J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0'2\u0006\u0010(\u001a\u00020\u001cH\u0016J\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001a0'2\u0006\u0010(\u001a\u00020\u001cH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006+"}, d2 = {"Lcom/polymarket/data/EPromotionCampaign$ReferrerUser;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "userId", "", "username", "profileImageURL", "Ljava/net/URI;", "(Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getUserId", "()Ljava/lang/String;", "Swift_userId", "getUsername", "Swift_username", "getProfileImageURL", "()Ljava/net/URI;", "Swift_profileImageURL", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ReferrerUser implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public ReferrerUser(String str, String str2, URI uri) {
            str.getClass();
            str2.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, uri);
        }

        private final native long Swift_constructor_0(String userId, String username, URI profileImageURL);

        private final native URI Swift_profileImageURL(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_userId(long Swift_peer);

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

        public final URI getProfileImageURL() {
            return Swift_profileImageURL(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getUserId() {
            return Swift_userId(this.Swift_peer);
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

        public ReferrerUser(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ ReferrerUser(String str, String str2, URI uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : uri);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB1\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\b\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u0015\u0010\u0017\u001a\u00020\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0015\u0010\u001f\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010!\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010$\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010&\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J-\u0010'\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082 J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001a0)2\u0006\u0010*\u001a\u00020\u001cH\u0016J\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001a0)2\u0006\u0010*\u001a\u00020\u001cH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006-"}, d2 = {"Lcom/polymarket/data/EPromotionCampaign$DepositBonus;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "qualifyingDeposit", "Lcom/polymarket/data/EAmount;", "rewardAmount", "codeRequired", "", "rollingDeposit", "(Lcom/polymarket/data/EAmount;Lcom/polymarket/data/EAmount;ZZ)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "other", "", "hashCode", "", "getQualifyingDeposit", "()Lcom/polymarket/data/EAmount;", "Swift_qualifyingDeposit", "getRewardAmount", "Swift_rewardAmount", "getCodeRequired", "()Z", "Swift_codeRequired", "getRollingDeposit", "Swift_rollingDeposit", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DepositBonus implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ DepositBonus(EAmount eAmount, EAmount eAmount2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EAmount.INSTANCE.getZeroUSD() : eAmount, (i & 2) != 0 ? EAmount.INSTANCE.getZeroUSD() : eAmount2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
        }

        private final native boolean Swift_codeRequired(long Swift_peer);

        private final native long Swift_constructor_0(EAmount qualifyingDeposit, EAmount rewardAmount, boolean codeRequired, boolean rollingDeposit);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native EAmount Swift_qualifyingDeposit(long Swift_peer);

        private final native void Swift_release(long Swift_peer);

        private final native EAmount Swift_rewardAmount(long Swift_peer);

        private final native boolean Swift_rollingDeposit(long Swift_peer);

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

        public final boolean getCodeRequired() {
            return Swift_codeRequired(this.Swift_peer);
        }

        public final EAmount getQualifyingDeposit() {
            return Swift_qualifyingDeposit(this.Swift_peer);
        }

        public final EAmount getRewardAmount() {
            return Swift_rewardAmount(this.Swift_peer);
        }

        public final boolean getRollingDeposit() {
            return Swift_rollingDeposit(this.Swift_peer);
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

        public DepositBonus(EAmount eAmount, EAmount eAmount2, boolean z, boolean z2) {
            eAmount.getClass();
            eAmount2.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(eAmount, eAmount2, z, z2);
        }

        public DepositBonus(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 42\u00020\u00012\u00020\u0002:\u00014B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBG\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\b\u0010\u0013J\u0006\u0010\u0018\u001a\u00020\u0019J\u0015\u0010\u001a\u001a\u00020\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001b\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0015\u0010\"\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010$\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010&\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010(\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010+\u001a\u0004\u0018\u00010\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010.\u001a\u00020\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J?\u0010/\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u001d012\u0006\u00102\u001a\u00020\u001fH\u0016J\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\u001d012\u0006\u00102\u001a\u00020\u001fH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010!R\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00065"}, d2 = {"Lcom/polymarket/data/EPromotionCampaign$Presentation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "headline", "", "logoutHeadline", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "subtitle", "imageURL", "Ljava/net/URI;", "lightForeground", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;Z)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "other", "", "hashCode", "", "getHeadline", "()Ljava/lang/String;", "Swift_headline", "getLogoutHeadline", "Swift_logoutHeadline", "getTitle", "Swift_title", "getSubtitle", "Swift_subtitle", "getImageURL", "()Ljava/net/URI;", "Swift_imageURL", "getLightForeground", "()Z", "Swift_lightForeground", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Presentation implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Presentation(String str, String str2, String str3, String str4, URI uri, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : uri, (i & 32) != 0 ? false : z);
        }

        private final native long Swift_constructor_0(String headline, String logoutHeadline, String title, String subtitle, URI imageURL, boolean lightForeground);

        private final native String Swift_headline(long Swift_peer);

        private final native URI Swift_imageURL(long Swift_peer);

        private final native boolean Swift_lightForeground(long Swift_peer);

        private final native String Swift_logoutHeadline(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_subtitle(long Swift_peer);

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

        public final String getHeadline() {
            return Swift_headline(this.Swift_peer);
        }

        public final URI getImageURL() {
            return Swift_imageURL(this.Swift_peer);
        }

        public final boolean getLightForeground() {
            return Swift_lightForeground(this.Swift_peer);
        }

        public final String getLogoutHeadline() {
            return Swift_logoutHeadline(this.Swift_peer);
        }

        public final String getSubtitle() {
            return Swift_subtitle(this.Swift_peer);
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

        public Presentation(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public Presentation(String str, String str2, String str3, String str4, URI uri, boolean z) {
            woa.A(str, str2, str3, str4);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, str3, str4, uri, z);
        }
    }
}
