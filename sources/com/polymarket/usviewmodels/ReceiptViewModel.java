package com.polymarket.usviewmodels;

import com.polymarket.data.EAmount;
import com.polymarket.data.EComboFill;
import com.polymarket.data.EComboLegDetail;
import com.polymarket.data.EComboOutcomeSide;
import com.polymarket.data.EEvent;
import com.polymarket.data.EMarket;
import com.polymarket.data.EMarketImageContext;
import com.polymarket.data.EOrderReceipt;
import com.polymarket.data.ESportsTeam;
import com.polymarket.data.SharePlatform;
import com.polymarket.designtokens.DesignTokens;
import com.polymarket.designtokens.Icon;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.bod;
import defpackage.jbf;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 µ\u00012\u00020\u0001:\u0006³\u0001´\u0001µ\u0001B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB1\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0007\u0010\u0011B_\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0007\u0010\u001fJ\u0017\u0010%\u001a\u0004\u0018\u00010\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010&\u001a\u00020'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010(\u001a\u0004\u0018\u00010\nH\u0082 J\u0015\u0010-\u001a\u00020*2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00101\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u00104\u001a\u0004\u0018\u00010\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00108\u001a\u0002062\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010;\u001a\u0002062\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010A\u001a\b\u0012\u0004\u0012\u00020>0=2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010E\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010H\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010K\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010P\u001a\u0004\u0018\u00010M2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0006\u0010Q\u001a\u00020'J\u0015\u0010R\u001a\u00020'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010S\u001a\u00020'H\u0016J\u0015\u0010T\u001a\u00020'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010W\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010\\\u001a\u0004\u0018\u00010Y2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010_\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010b\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010e\u001a\u0004\u0018\u00010\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010h\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010k\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010n\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010s\u001a\u00020p2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010x\u001a\u0004\u0018\u00010u2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010{\u001a\u0004\u0018\u00010\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010~\u001a\u0004\u0018\u00010\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0018\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0018\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0019\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0086\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010\u008e\u0001\u001a\u00030\u008b\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0091\u0001\u001a\u00020p2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0094\u0001\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0019\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0096\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u009c\u0001\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0018\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0019\u0010 \u0001\u001a\t\u0012\u0005\u0012\u00030¡\u00010=2\t\b\u0002\u0010¢\u0001\u001a\u000206J&\u0010£\u0001\u001a\t\u0012\u0005\u0012\u00030¡\u00010=2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010¢\u0001\u001a\u000206H\u0082 J\u0011\u0010¤\u0001\u001a\u00020'2\b\u0010¥\u0001\u001a\u00030¦\u0001J \u0010§\u0001\u001a\u00020'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010¥\u0001\u001a\u00030¦\u0001H\u0082 J\u0019\u0010¬\u0001\u001a\u0005\u0018\u00010©\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010\u00ad\u0001\u001a\n\u0012\u0005\u0012\u00030¯\u00010®\u00012\b\u0010°\u0001\u001a\u00030±\u0001H\u0016J\u001c\u0010²\u0001\u001a\n\u0012\u0005\u0012\u00030¯\u00010®\u00012\b\u0010°\u0001\u001a\u00030±\u0001H\u0082 R(\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010 \u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010)\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010.\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u00105\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b5\u00107R\u0011\u00109\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b:\u00107R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0011\u0010B\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0011\u0010F\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bG\u0010DR\u0011\u0010I\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bJ\u0010DR\u0013\u0010L\u001a\u0004\u0018\u00010M8F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0011\u0010U\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bV\u0010DR\u0013\u0010X\u001a\u0004\u0018\u00010Y8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0011\u0010]\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b^\u0010DR\u0011\u0010`\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\ba\u0010DR\u0013\u0010c\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\bd\u0010DR\u0011\u0010f\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bg\u0010DR\u0011\u0010i\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bj\u0010DR\u0011\u0010l\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bm\u0010DR\u0011\u0010o\u001a\u00020p8F¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0013\u0010t\u001a\u0004\u0018\u00010u8F¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0013\u0010y\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\bz\u0010DR\u0013\u0010|\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b}\u0010DR\u0014\u0010\u007f\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010DR\u0015\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010DR\u0017\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u00018F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0015\u0010\u008a\u0001\u001a\u00030\u008b\u00018F¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0013\u0010\u008f\u0001\u001a\u00020p8F¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010rR\u0013\u0010\u0092\u0001\u001a\u00020\u001e8F¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010DR\u0017\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0096\u00018F¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0013\u0010\u009a\u0001\u001a\u00020\u001e8F¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010DR\u0015\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010DR\u001a\u0010¨\u0001\u001a\u0005\u0018\u00010©\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001¨\u0006¶\u0001"}, d2 = {"Lcom/polymarket/usviewmodels/ReceiptViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "receipt", "Lcom/polymarket/data/EOrderReceipt;", "event", "Lcom/polymarket/data/EEvent;", "marketSide", "Lcom/polymarket/data/EMarket$MarketSide;", "callbacks", "Lcom/polymarket/usviewmodels/ReceiptViewModel$Callbacks;", "(Lcom/polymarket/data/EOrderReceipt;Lcom/polymarket/data/EEvent;Lcom/polymarket/data/EMarket$MarketSide;Lcom/polymarket/usviewmodels/ReceiptViewModel$Callbacks;)V", "combo", "Lcom/polymarket/usviewmodels/Combo;", "direction", "Lcom/polymarket/usviewmodels/ReceiptComboDirection;", "comboOutcomeSide", "Lcom/polymarket/data/EComboOutcomeSide;", "cashOrderAmount", "Lcom/polymarket/data/EAmount;", "cashOutStake", "comboFill", "Lcom/polymarket/data/EComboFill;", "comboMarketSlug", "", "(Lcom/polymarket/usviewmodels/Combo;Lcom/polymarket/usviewmodels/ReceiptComboDirection;Lcom/polymarket/data/EComboOutcomeSide;Lcom/polymarket/data/EAmount;Lcom/polymarket/data/EAmount;Lcom/polymarket/data/EComboFill;Ljava/lang/String;Lcom/polymarket/usviewmodels/ReceiptViewModel$Callbacks;)V", "newValue", "getReceipt", "()Lcom/polymarket/data/EOrderReceipt;", "setReceipt", "(Lcom/polymarket/data/EOrderReceipt;)V", "Swift_receipt", "Swift_receipt_set", "", "value", "displayType", "Lcom/polymarket/usviewmodels/ReceiptDisplayType;", "getDisplayType", "()Lcom/polymarket/usviewmodels/ReceiptDisplayType;", "Swift_displayType", "comboDirection", "getComboDirection", "()Lcom/polymarket/usviewmodels/ReceiptComboDirection;", "Swift_comboDirection", "getCombo", "()Lcom/polymarket/usviewmodels/Combo;", "Swift_combo", "isCombo", "", "()Z", "Swift_isCombo", "comboIsShort", "getComboIsShort", "Swift_comboIsShort", "comboLegs", "", "Lcom/polymarket/data/EComboLegDetail;", "getComboLegs", "()Ljava/util/List;", "Swift_comboLegs", "comboCostText", "getComboCostText", "()Ljava/lang/String;", "Swift_comboCostText", "comboMultiplierText", "getComboMultiplierText", "Swift_comboMultiplierText", "comboPayoutText", "getComboPayoutText", "Swift_comboPayoutText", "comboReceiptCard", "Lcom/polymarket/usviewmodels/ComboReceiptCardPresentation;", "getComboReceiptCard", "()Lcom/polymarket/usviewmodels/ComboReceiptCardPresentation;", "Swift_comboReceiptCard", "startComboLiveUpdates", "Swift_startComboLiveUpdates_0", "cancelWork", "Swift_cancelWork_1", "comboPayoutColumnTitle", "getComboPayoutColumnTitle", "Swift_comboPayoutColumnTitle", "navIcon", "Lcom/polymarket/designtokens/Icon;", "getNavIcon", "()Lcom/polymarket/designtokens/Icon;", "Swift_navIcon", "navTitle", "getNavTitle", "Swift_navTitle", "eventTitle", "getEventTitle", "Swift_eventTitle", "eventSlug", "getEventSlug", "Swift_eventSlug", "actionTitle", "getActionTitle", "Swift_actionTitle", "shareActionTitle", "getShareActionTitle", "Swift_shareActionTitle", "shareText", "getShareText", "Swift_shareText", "displayContext", "Lcom/polymarket/data/EMarket$MarketSide$DisplayContext;", "getDisplayContext", "()Lcom/polymarket/data/EMarket$MarketSide$DisplayContext;", "Swift_displayContext", "team", "Lcom/polymarket/data/ESportsTeam;", "getTeam", "()Lcom/polymarket/data/ESportsTeam;", "Swift_team", "marketParticipantName", "getMarketParticipantName", "Swift_marketParticipantName", "cardDisplayName", "getCardDisplayName", "Swift_cardDisplayName", "marketTitle", "getMarketTitle", "Swift_marketTitle", "marketSideText", "getMarketSideText", "Swift_marketSideText", "imageContext", "Lcom/polymarket/data/EMarketImageContext;", "getImageContext", "()Lcom/polymarket/data/EMarketImageContext;", "Swift_imageContext", "marketColor", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "getMarketColor", "()Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "Swift_marketColor", "presentation", "getPresentation", "Swift_presentation", "facebookAppId", "getFacebookAppId", "Swift_facebookAppId", "sportsGame", "Lcom/polymarket/data/EEvent$SportsGame;", "getSportsGame", "()Lcom/polymarket/data/EEvent$SportsGame;", "Swift_sportsGame", "receiptTitle", "getReceiptTitle", "Swift_receiptTitle", "footnote", "getFootnote", "Swift_footnote", "detailRows", "Lcom/polymarket/usviewmodels/DetailReceiptRow;", "isShareSnapshot", "Swift_detailRows_2", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/ReceiptViewModel$Input;", "Swift_sendInput_5", "squadsQuickSendContent", "Lcom/polymarket/usviewmodels/SquadsQuickSendContent;", "getSquadsQuickSendContent", "()Lcom/polymarket/usviewmodels/SquadsQuickSendContent;", "Swift_squadsQuickSendContent", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ReceiptViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ReceiptViewModel(Combo combo, ReceiptComboDirection receiptComboDirection, EComboOutcomeSide eComboOutcomeSide, EAmount eAmount, EAmount eAmount2, EComboFill eComboFill, String str, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(combo, r2, r3, r4, r5, r6, r7, r8);
        EAmount eAmount3;
        EAmount eAmount4;
        EComboFill eComboFill2;
        String str2;
        Callbacks callbacks2;
        ReceiptComboDirection receiptComboDirection2 = (i & 2) != 0 ? ReceiptComboDirection.buy : receiptComboDirection;
        EComboOutcomeSide eComboOutcomeSide2 = (i & 4) != 0 ? EComboOutcomeSide.yes : eComboOutcomeSide;
        if ((i & 8) != 0) {
            eAmount3 = null;
        } else {
            eAmount3 = eAmount;
        }
        if ((i & 16) != 0) {
            eAmount4 = null;
        } else {
            eAmount4 = eAmount2;
        }
        if ((i & 32) != 0) {
            eComboFill2 = null;
        } else {
            eComboFill2 = eComboFill;
        }
        if ((i & 64) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i & 128) != 0) {
            callbacks2 = new Callbacks(null, null, 3, null);
        } else {
            callbacks2 = callbacks;
        }
    }

    private final native String Swift_actionTitle(long Swift_peer);

    private final native void Swift_cancelWork_1(long Swift_peer);

    private final native String Swift_cardDisplayName(long Swift_peer);

    private final native Combo Swift_combo(long Swift_peer);

    private final native String Swift_comboCostText(long Swift_peer);

    private final native ReceiptComboDirection Swift_comboDirection(long Swift_peer);

    private final native boolean Swift_comboIsShort(long Swift_peer);

    private final native List<EComboLegDetail> Swift_comboLegs(long Swift_peer);

    private final native String Swift_comboMultiplierText(long Swift_peer);

    private final native String Swift_comboPayoutColumnTitle(long Swift_peer);

    private final native String Swift_comboPayoutText(long Swift_peer);

    private final native ComboReceiptCardPresentation Swift_comboReceiptCard(long Swift_peer);

    private final native List<DetailReceiptRow> Swift_detailRows_2(long Swift_peer, boolean isShareSnapshot);

    private final native EMarket.MarketSide.DisplayContext Swift_displayContext(long Swift_peer);

    private final native ReceiptDisplayType Swift_displayType(long Swift_peer);

    private final native String Swift_eventSlug(long Swift_peer);

    private final native String Swift_eventTitle(long Swift_peer);

    private final native String Swift_facebookAppId(long Swift_peer);

    private final native String Swift_footnote(long Swift_peer);

    private final native EMarketImageContext Swift_imageContext(long Swift_peer);

    private final native boolean Swift_isCombo(long Swift_peer);

    private final native DesignTokens.PaletteColor Swift_marketColor(long Swift_peer);

    private final native String Swift_marketParticipantName(long Swift_peer);

    private final native String Swift_marketSideText(long Swift_peer);

    private final native String Swift_marketTitle(long Swift_peer);

    private final native Icon Swift_navIcon(long Swift_peer);

    private final native String Swift_navTitle(long Swift_peer);

    private final native EMarket.MarketSide.DisplayContext Swift_presentation(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native EOrderReceipt Swift_receipt(long Swift_peer);

    private final native String Swift_receiptTitle(long Swift_peer);

    private final native void Swift_receipt_set(long Swift_peer, EOrderReceipt value);

    private final native void Swift_sendInput_5(long Swift_peer, Input input);

    private final native String Swift_shareActionTitle(long Swift_peer);

    private final native String Swift_shareText(long Swift_peer);

    private final native EEvent.SportsGame Swift_sportsGame(long Swift_peer);

    private final native SquadsQuickSendContent Swift_squadsQuickSendContent(long Swift_peer);

    private final native void Swift_startComboLiveUpdates_0(long Swift_peer);

    private final native ESportsTeam Swift_team(long Swift_peer);

    public static /* synthetic */ List detailRows$default(ReceiptViewModel receiptViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return receiptViewModel.detailRows(z);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void cancelWork() {
        Swift_cancelWork_1(getSwift_peer());
    }

    public final List<DetailReceiptRow> detailRows(boolean isShareSnapshot) {
        return Swift_detailRows_2(getSwift_peer(), isShareSnapshot);
    }

    public final String getActionTitle() {
        return Swift_actionTitle(getSwift_peer());
    }

    public final String getCardDisplayName() {
        return Swift_cardDisplayName(getSwift_peer());
    }

    public final Combo getCombo() {
        return Swift_combo(getSwift_peer());
    }

    public final String getComboCostText() {
        return Swift_comboCostText(getSwift_peer());
    }

    public final ReceiptComboDirection getComboDirection() {
        return Swift_comboDirection(getSwift_peer());
    }

    public final boolean getComboIsShort() {
        return Swift_comboIsShort(getSwift_peer());
    }

    public final List<EComboLegDetail> getComboLegs() {
        return Swift_comboLegs(getSwift_peer());
    }

    public final String getComboMultiplierText() {
        return Swift_comboMultiplierText(getSwift_peer());
    }

    public final String getComboPayoutColumnTitle() {
        return Swift_comboPayoutColumnTitle(getSwift_peer());
    }

    public final String getComboPayoutText() {
        return Swift_comboPayoutText(getSwift_peer());
    }

    public final ComboReceiptCardPresentation getComboReceiptCard() {
        return Swift_comboReceiptCard(getSwift_peer());
    }

    public final EMarket.MarketSide.DisplayContext getDisplayContext() {
        return Swift_displayContext(getSwift_peer());
    }

    public final ReceiptDisplayType getDisplayType() {
        return Swift_displayType(getSwift_peer());
    }

    public final String getEventSlug() {
        return Swift_eventSlug(getSwift_peer());
    }

    public final String getEventTitle() {
        return Swift_eventTitle(getSwift_peer());
    }

    public final String getFacebookAppId() {
        return Swift_facebookAppId(getSwift_peer());
    }

    public final String getFootnote() {
        return Swift_footnote(getSwift_peer());
    }

    public final EMarketImageContext getImageContext() {
        return Swift_imageContext(getSwift_peer());
    }

    public final DesignTokens.PaletteColor getMarketColor() {
        return Swift_marketColor(getSwift_peer());
    }

    public final String getMarketParticipantName() {
        return Swift_marketParticipantName(getSwift_peer());
    }

    public final String getMarketSideText() {
        return Swift_marketSideText(getSwift_peer());
    }

    public final String getMarketTitle() {
        return Swift_marketTitle(getSwift_peer());
    }

    public final Icon getNavIcon() {
        return Swift_navIcon(getSwift_peer());
    }

    public final String getNavTitle() {
        return Swift_navTitle(getSwift_peer());
    }

    public final EMarket.MarketSide.DisplayContext getPresentation() {
        return Swift_presentation(getSwift_peer());
    }

    public final EOrderReceipt getReceipt() {
        return Swift_receipt(getSwift_peer());
    }

    public final String getReceiptTitle() {
        return Swift_receiptTitle(getSwift_peer());
    }

    public final String getShareActionTitle() {
        return Swift_shareActionTitle(getSwift_peer());
    }

    public final String getShareText() {
        return Swift_shareText(getSwift_peer());
    }

    public final EEvent.SportsGame getSportsGame() {
        return Swift_sportsGame(getSwift_peer());
    }

    public SquadsQuickSendContent getSquadsQuickSendContent() {
        return Swift_squadsQuickSendContent(getSwift_peer());
    }

    public final ESportsTeam getTeam() {
        return Swift_team(getSwift_peer());
    }

    public final boolean isCombo() {
        return Swift_isCombo(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_5(getSwift_peer(), input);
    }

    public final void setReceipt(EOrderReceipt eOrderReceipt) {
        Swift_receipt_set(getSwift_peer(), (EOrderReceipt) StructKt.sref$default(eOrderReceipt, null, 1, null));
    }

    public final void startComboLiveUpdates() {
        Swift_startComboLiveUpdates_0(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/ReceiptViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnDoneCase", "OnShareCase", "Companion", "Lcom/polymarket/usviewmodels/ReceiptViewModel$Input$OnDoneCase;", "Lcom/polymarket/usviewmodels/ReceiptViewModel$Input$OnShareCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onDone = new OnDoneCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/ReceiptViewModel$Input$OnDoneCase;", "Lcom/polymarket/usviewmodels/ReceiptViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDoneCase extends Input {
            public OnDoneCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/usviewmodels/ReceiptViewModel$Input$OnShareCase;", "Lcom/polymarket/usviewmodels/ReceiptViewModel$Input;", "associated0", "Lcom/polymarket/data/SharePlatform;", "<init>", "(Lcom/polymarket/data/SharePlatform;)V", "getAssociated0", "()Lcom/polymarket/data/SharePlatform;", "platform", "getPlatform", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnShareCase extends Input {
            private final SharePlatform associated0;
            private final SharePlatform platform;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnShareCase(SharePlatform sharePlatform) {
                super(null);
                sharePlatform.getClass();
                this.associated0 = sharePlatform;
                this.platform = sharePlatform;
            }

            public final SharePlatform getAssociated0() {
                return this.associated0;
            }

            public final SharePlatform getPlatform() {
                return this.platform;
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnDone$cp() {
            return onDone;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/polymarket/usviewmodels/ReceiptViewModel$Input$Companion;", "", "<init>", "()V", "onDone", "Lcom/polymarket/usviewmodels/ReceiptViewModel$Input;", "getOnDone", "()Lcom/polymarket/usviewmodels/ReceiptViewModel$Input;", "onShare", "platform", "Lcom/polymarket/data/SharePlatform;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnDone() {
                return Input.access$getOnDone$cp();
            }

            public final Input onShare(SharePlatform platform) {
                platform.getClass();
                return new OnShareCase(platform);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0082 JU\u0010\u000f\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\r\u001a\u00020\u000eH\u0082 J\u0006\u0010\u001d\u001a\u00020\u001eJ\t\u0010\u001f\u001a\u00020\u001eH\u0082 ¨\u0006 "}, d2 = {"Lcom/polymarket/usviewmodels/ReceiptViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_3", "", "Lskip/bridge/SwiftObjectPointer;", "receipt", "Lcom/polymarket/data/EOrderReceipt;", "event", "Lcom/polymarket/data/EEvent;", "marketSide", "Lcom/polymarket/data/EMarket$MarketSide;", "callbacks", "Lcom/polymarket/usviewmodels/ReceiptViewModel$Callbacks;", "Swift_Companion_constructor_4", "combo", "Lcom/polymarket/usviewmodels/Combo;", "direction", "Lcom/polymarket/usviewmodels/ReceiptComboDirection;", "comboOutcomeSide", "Lcom/polymarket/data/EComboOutcomeSide;", "cashOrderAmount", "Lcom/polymarket/data/EAmount;", "cashOutStake", "comboFill", "Lcom/polymarket/data/EComboFill;", "comboMarketSlug", "", "mock", "Lcom/polymarket/usviewmodels/ReceiptViewModel;", "Swift_Companion_mock_6", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_3(EOrderReceipt receipt, EEvent event, EMarket.MarketSide marketSide, Callbacks callbacks);

        private final native long Swift_Companion_constructor_4(Combo combo, ReceiptComboDirection direction, EComboOutcomeSide comboOutcomeSide, EAmount cashOrderAmount, EAmount cashOutStake, EComboFill comboFill, String comboMarketSlug, Callbacks callbacks);

        private final native ReceiptViewModel Swift_Companion_mock_6();

        public static final /* synthetic */ long access$Swift_Companion_constructor_3(Companion companion, EOrderReceipt eOrderReceipt, EEvent eEvent, EMarket.MarketSide marketSide, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_3(eOrderReceipt, eEvent, marketSide, callbacks);
        }

        public static final /* synthetic */ long access$Swift_Companion_constructor_4(Companion companion, Combo combo, ReceiptComboDirection receiptComboDirection, EComboOutcomeSide eComboOutcomeSide, EAmount eAmount, EAmount eAmount2, EComboFill eComboFill, String str, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_4(combo, receiptComboDirection, eComboOutcomeSide, eAmount, eAmount2, eComboFill, str, callbacks);
        }

        public final ReceiptViewModel mock() {
            return Swift_Companion_mock_6();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB5\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0004\b\b\u0010\u0011J\u0006\u0010\u0016\u001a\u00020\fJ\u0015\u0010\u0017\u001a\u00020\f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J5\u0010\u001e\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000eH\u0082 J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b2\u0006\u0010 \u001a\u00020\u001dH\u0016J\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b2\u0006\u0010 \u001a\u00020\u001dH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/polymarket/usviewmodels/ReceiptViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onDone", "Lkotlin/Function0;", "", "onShareRequest", "Lkotlin/Function2;", "Lcom/polymarket/usviewmodels/ReceiptViewModel;", "Lcom/polymarket/data/SharePlatform;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function0 function0, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((Function0<Unit>) ((i & 1) != 0 ? new jbf(21) : function0), (Function2<? super ReceiptViewModel, ? super SharePlatform, Unit>) ((i & 2) != 0 ? new bod(21) : function2));
        }

        private final native long Swift_constructor_0(Function0<Unit> onDone, Function2<? super ReceiptViewModel, ? super SharePlatform, Unit> onShareRequest);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(ReceiptViewModel receiptViewModel, SharePlatform sharePlatform) {
            receiptViewModel.getClass();
            sharePlatform.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(ReceiptViewModel receiptViewModel, SharePlatform sharePlatform) {
            return _init_$lambda$1(receiptViewModel, sharePlatform);
        }

        public static /* synthetic */ Unit b() {
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

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public Callbacks(Function0<Unit> function0, Function2<? super ReceiptViewModel, ? super SharePlatform, Unit> function2) {
            function0.getClass();
            function2.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function0, function2);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiptViewModel(EOrderReceipt eOrderReceipt, EEvent eEvent, EMarket.MarketSide marketSide, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_3(INSTANCE, eOrderReceipt, eEvent, marketSide, callbacks), (SwiftPeerMarker) null);
        callbacks.getClass();
    }

    public /* synthetic */ ReceiptViewModel(EOrderReceipt eOrderReceipt, EEvent eEvent, EMarket.MarketSide marketSide, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eOrderReceipt, eEvent, marketSide, (i & 8) != 0 ? new Callbacks(null, null, 3, null) : callbacks);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiptViewModel(Combo combo, ReceiptComboDirection receiptComboDirection, EComboOutcomeSide eComboOutcomeSide, EAmount eAmount, EAmount eAmount2, EComboFill eComboFill, String str, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_4(INSTANCE, combo, receiptComboDirection, eComboOutcomeSide, eAmount, eAmount2, eComboFill, str, callbacks), (SwiftPeerMarker) null);
        combo.getClass();
        receiptComboDirection.getClass();
        eComboOutcomeSide.getClass();
        callbacks.getClass();
    }

    public ReceiptViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }
}
