package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientChatPositionAttachment;
import com.polymarket.data.APIMarketType;
import com.polymarket.data.EActivityColor;
import com.polymarket.data.EAmount;
import com.polymarket.data.EComboLegDetail;
import com.polymarket.data.EEvent;
import com.polymarket.data.ESportsTeam;
import com.polymarket.data.EUserPosition;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB)\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\b\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u0015\u0010\u0017\u001a\u00020\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0015\u0010 \u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010#\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010&\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J)\u0010'\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0082 J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u000fJ\u001d\u0010*\u001a\u00020\u00002\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010)\u001a\u00020\u000fH\u0082 J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001b0,2\u0006\u0010-\u001a\u00020\u001dH\u0016J\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001b0,2\u0006\u0010-\u001a\u00020\u001dH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u00060"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsQuickSendContent;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "attachment", "Lcom/polymarket/clients/ClientChatPositionAttachment;", "tradedAt", "Ljava/util/Date;", "positionRefreshMarketSlug", "", "(Lcom/polymarket/clients/ClientChatPositionAttachment;Ljava/util/Date;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getAttachment", "()Lcom/polymarket/clients/ClientChatPositionAttachment;", "Swift_attachment", "getTradedAt", "()Ljava/util/Date;", "Swift_tradedAt", "getPositionRefreshMarketSlug", "()Ljava/lang/String;", "Swift_positionRefreshMarketSlug", "Swift_constructor_0", "refreshingPosition", "marketSlug", "Swift_refreshingPosition_1", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SquadsQuickSendContent implements SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;

    public SquadsQuickSendContent(ClientChatPositionAttachment clientChatPositionAttachment, Date date, String str) {
        clientChatPositionAttachment.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(clientChatPositionAttachment, date, str);
    }

    private final native ClientChatPositionAttachment Swift_attachment(long Swift_peer);

    private final native long Swift_constructor_0(ClientChatPositionAttachment attachment, Date tradedAt, String positionRefreshMarketSlug);

    private final native String Swift_positionRefreshMarketSlug(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native SquadsQuickSendContent Swift_refreshingPosition_1(long Swift_peer, String marketSlug);

    private final native void Swift_release(long Swift_peer);

    private final native Date Swift_tradedAt(long Swift_peer);

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

    public final ClientChatPositionAttachment getAttachment() {
        return Swift_attachment(this.Swift_peer);
    }

    public final String getPositionRefreshMarketSlug() {
        return Swift_positionRefreshMarketSlug(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final Date getTradedAt() {
        return Swift_tradedAt(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final SquadsQuickSendContent refreshingPosition(String marketSlug) {
        marketSlug.getClass();
        return Swift_refreshingPosition_1(this.Swift_peer, marketSlug);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ%\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0082 J\u008d\u0002\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u000f2\b\u0010!\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010(\u001a\u00020)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010/Jü\u0001\u00100\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u000f2\b\u0010!\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u000f2\b\u0010+\u001a\u0004\u0018\u00010\u000f2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010\u001c2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0082 ¢\u0006\u0002\u0010/¨\u00061"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsQuickSendContent$Companion;", "", "<init>", "()V", "live", "Lcom/polymarket/usviewmodels/SquadsQuickSendContent;", "position", "Lcom/polymarket/data/EUserPosition;", "fallbackEvent", "Lcom/polymarket/data/EEvent;", "tradedAt", "Ljava/util/Date;", "Swift_Companion_live_2", "synthesized", "marketSlug", "", "positionId", "image", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "outcome", "eventSlug", "team", "Lcom/polymarket/data/ESportsTeam;", "marketType", "Lcom/polymarket/data/APIMarketType;", "accentColor", "Lcom/polymarket/data/EActivityColor;", "currentValue", "Lcom/polymarket/data/EAmount;", "totalCost", "potentialPayout", "displayName", "participantName", "marketDescription", "comboLegs", "", "Lcom/polymarket/data/EComboLegDetail;", "comboLegCount", "", "comboWonCount", "comboIsShort", "", "sportSlug", "categoryTitle", "settlement", "Lcom/polymarket/clients/ClientChatPositionAttachment$Settlement;", "realizedPnl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/ESportsTeam;Lcom/polymarket/data/APIMarketType;Lcom/polymarket/data/EActivityColor;Lcom/polymarket/data/EAmount;Lcom/polymarket/data/EAmount;Lcom/polymarket/data/EAmount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lcom/polymarket/clients/ClientChatPositionAttachment$Settlement;Lcom/polymarket/data/EAmount;Ljava/util/Date;)Lcom/polymarket/usviewmodels/SquadsQuickSendContent;", "Swift_Companion_synthesized_3", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native SquadsQuickSendContent Swift_Companion_live_2(EUserPosition position, EEvent fallbackEvent, Date tradedAt);

        private final native SquadsQuickSendContent Swift_Companion_synthesized_3(String marketSlug, String positionId, String image, String title, String outcome, String eventSlug, ESportsTeam team, APIMarketType marketType, EActivityColor accentColor, EAmount currentValue, EAmount totalCost, EAmount potentialPayout, String displayName, String participantName, String marketDescription, List<EComboLegDetail> comboLegs, Integer comboLegCount, Integer comboWonCount, boolean comboIsShort, String sportSlug, String categoryTitle, ClientChatPositionAttachment.Settlement settlement, EAmount realizedPnl, Date tradedAt);

        public static /* synthetic */ SquadsQuickSendContent live$default(Companion companion, EUserPosition eUserPosition, EEvent eEvent, Date date, int i, Object obj) {
            if ((i & 2) != 0) {
                eEvent = null;
            }
            if ((i & 4) != 0) {
                date = null;
            }
            return companion.live(eUserPosition, eEvent, date);
        }

        public static /* synthetic */ SquadsQuickSendContent synthesized$default(Companion companion, String str, String str2, String str3, String str4, String str5, String str6, ESportsTeam eSportsTeam, APIMarketType aPIMarketType, EActivityColor eActivityColor, EAmount eAmount, EAmount eAmount2, EAmount eAmount3, String str7, String str8, String str9, List list, Integer num, Integer num2, boolean z, String str10, String str11, ClientChatPositionAttachment.Settlement settlement, EAmount eAmount4, Date date, int i, Object obj) {
            String str12;
            ESportsTeam eSportsTeam2;
            APIMarketType aPIMarketType2;
            EActivityColor eActivityColor2;
            boolean z2;
            String str13;
            String str14;
            ClientChatPositionAttachment.Settlement settlement2;
            EAmount eAmount5;
            Date date2;
            if ((i & 2) != 0) {
                str12 = null;
            } else {
                str12 = str2;
            }
            if ((i & 64) != 0) {
                eSportsTeam2 = null;
            } else {
                eSportsTeam2 = eSportsTeam;
            }
            if ((i & 128) != 0) {
                aPIMarketType2 = null;
            } else {
                aPIMarketType2 = aPIMarketType;
            }
            if ((i & 256) != 0) {
                eActivityColor2 = null;
            } else {
                eActivityColor2 = eActivityColor;
            }
            if ((262144 & i) != 0) {
                z2 = false;
            } else {
                z2 = z;
            }
            if ((524288 & i) != 0) {
                str13 = null;
            } else {
                str13 = str10;
            }
            if ((1048576 & i) != 0) {
                str14 = null;
            } else {
                str14 = str11;
            }
            if ((2097152 & i) != 0) {
                settlement2 = null;
            } else {
                settlement2 = settlement;
            }
            if ((4194304 & i) != 0) {
                eAmount5 = null;
            } else {
                eAmount5 = eAmount4;
            }
            if ((i & 8388608) != 0) {
                date2 = null;
            } else {
                date2 = date;
            }
            return companion.synthesized(str, str12, str3, str4, str5, str6, eSportsTeam2, aPIMarketType2, eActivityColor2, eAmount, eAmount2, eAmount3, str7, str8, str9, list, num, num2, z2, str13, str14, settlement2, eAmount5, date2);
        }

        public final SquadsQuickSendContent live(EUserPosition position, EEvent fallbackEvent, Date tradedAt) {
            position.getClass();
            return Swift_Companion_live_2(position, fallbackEvent, tradedAt);
        }

        public final SquadsQuickSendContent synthesized(String marketSlug, String positionId, String image, String title, String outcome, String eventSlug, ESportsTeam team, APIMarketType marketType, EActivityColor accentColor, EAmount currentValue, EAmount totalCost, EAmount potentialPayout, String displayName, String participantName, String marketDescription, List<EComboLegDetail> comboLegs, Integer comboLegCount, Integer comboWonCount, boolean comboIsShort, String sportSlug, String categoryTitle, ClientChatPositionAttachment.Settlement settlement, EAmount realizedPnl, Date tradedAt) {
            title.getClass();
            totalCost.getClass();
            potentialPayout.getClass();
            return Swift_Companion_synthesized_3(marketSlug, positionId, image, title, outcome, eventSlug, team, marketType, accentColor, currentValue, totalCost, potentialPayout, displayName, participantName, marketDescription, comboLegs, comboLegCount, comboWonCount, comboIsShort, sportSlug, categoryTitle, settlement, realizedPnl, tradedAt);
        }

        private Companion() {
        }
    }

    public SquadsQuickSendContent(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public /* synthetic */ SquadsQuickSendContent(ClientChatPositionAttachment clientChatPositionAttachment, Date date, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(clientChatPositionAttachment, (i & 2) != 0 ? null : date, (i & 4) != 0 ? null : str);
    }
}
