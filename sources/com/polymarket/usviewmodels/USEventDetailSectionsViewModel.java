package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.EEvent;
import com.polymarket.data.EMarket;
import com.polymarket.data.EMarketCache;
import com.polymarket.data.EUserPosition;
import com.polymarket.usviewmodels.AppViewModel;
import com.polymarket.usviewmodels.BodyTabBarPresentation;
import com.polymarket.usviewmodels.PromoBannerViewModel;
import com.polymarket.usviewmodels.USMarketRulesViewModel;
import com.polymarket.usviewmodels.UserPositionViewModel;
import defpackage.ace;
import defpackage.pkj;
import defpackage.qx7;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Hasher;
import skip.lib.Identifiable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 Ã\u00012\u00020\u0001:\u000e½\u0001¾\u0001¿\u0001À\u0001Á\u0001Â\u0001Ã\u0001B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB]\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u0007\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010&\u001a\u00020#2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010+\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010.\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u00102\u001a\b\u0012\u0004\u0012\u0002000\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0014\u00103\u001a\b\u0012\u0004\u0012\u0002000\f2\u0006\u00104\u001a\u00020#J#\u00105\u001a\b\u0012\u0004\u0012\u0002000\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00106\u001a\u00020#H\u0082 J\u0010\u00107\u001a\u0004\u0018\u0001082\u0006\u00109\u001a\u00020#J\u001f\u0010:\u001a\u0004\u0018\u0001082\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00106\u001a\u00020#H\u0082 J\u0015\u0010=\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010@\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010C\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010F\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010K\u001a\u00020H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010N\u001a\u00020H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010P\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010R\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010U\u001a\b\u0012\u0004\u0012\u00020#0\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010X\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010]\u001a\u00020Z2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010`\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010e\u001a\u00020b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010j\u001a\u00020g2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010o\u001a\u00020l2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010t\u001a\u00020q2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010y\u001a\u00020v2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010~\u001a\u00020{2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010\u0083\u0001\u001a\u00030\u0080\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0086\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0089\u0001\u001a\u00020\u00112\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0018\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0019\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008e\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0019\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0093\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010\u009b\u0001\u001a\u000f\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u0002080\u0098\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\n\u0010\u009c\u0001\u001a\u00030\u009d\u0001H\u0016J\u0017\u0010\u009e\u0001\u001a\u00030\u009d\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010\u009f\u0001\u001a\u00030\u009d\u0001J\u0017\u0010 \u0001\u001a\u00030\u009d\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0011\u0010¡\u0001\u001a\u00030\u009d\u00012\u0007\u0010¢\u0001\u001a\u00020\nJ \u0010£\u0001\u001a\u00030\u009d\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010¢\u0001\u001a\u00020\nH\u0082 J\b\u0010¤\u0001\u001a\u00030\u009d\u0001J\u0017\u0010¥\u0001\u001a\u00030\u009d\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0011\u0010¦\u0001\u001a\u00030\u009d\u00012\u0007\u0010§\u0001\u001a\u00020\nJ \u0010¨\u0001\u001a\u00030\u009d\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010¢\u0001\u001a\u00020\nH\u0082 J'\u0010©\u0001\u001a\u00030\u009d\u00012\u0015\u0010ª\u0001\u001a\u0010\u0012\u0004\u0012\u00020H\u0012\u0005\u0012\u00030«\u00010\u0098\u00012\u0006\u0010\t\u001a\u00020\nJ6\u0010¬\u0001\u001a\u00030\u009d\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0015\u0010ª\u0001\u001a\u0010\u0012\u0004\u0012\u00020H\u0012\u0005\u0012\u00030«\u00010\u0098\u00012\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0017\u0010\u00ad\u0001\u001a\u00030\u009d\u00012\r\u0010®\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\fJ&\u0010¯\u0001\u001a\u00030\u009d\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\r\u0010®\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082 J\u0011\u0010°\u0001\u001a\u00030\u009d\u00012\u0007\u0010±\u0001\u001a\u00020\u0015J \u0010²\u0001\u001a\u00030\u009d\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010±\u0001\u001a\u00020\u0015H\u0082 J\u0012\u0010³\u0001\u001a\u00030\u009d\u00012\b\u0010´\u0001\u001a\u00030µ\u0001J!\u0010¶\u0001\u001a\u00030\u009d\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010´\u0001\u001a\u00030µ\u0001H\u0082 J\u001b\u0010·\u0001\u001a\n\u0012\u0005\u0012\u00030¹\u00010¸\u00012\b\u0010º\u0001\u001a\u00030»\u0001H\u0016J\u001c\u0010¼\u0001\u001a\n\u0012\u0005\u0012\u00030¹\u00010¸\u00012\b\u0010º\u0001\u001a\u00030»\u0001H\u0082 R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010'\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u0002000\f8F¢\u0006\u0006\u001a\u0004\b1\u0010 R\u0011\u0010;\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b<\u0010-R\u0011\u0010>\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b?\u0010-R\u0011\u0010A\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bB\u0010-R\u0011\u0010D\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bE\u0010-R\u0011\u0010G\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0011\u0010L\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bM\u0010JR\u0011\u0010O\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bO\u0010-R\u0011\u0010Q\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bQ\u0010-R\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020#0\f8F¢\u0006\u0006\u001a\u0004\bT\u0010 R\u0011\u0010V\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bW\u0010-R\u0011\u0010Y\u001a\u00020Z8F¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0011\u0010^\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b_\u0010-R\u0011\u0010a\u001a\u00020b8F¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0011\u0010f\u001a\u00020g8F¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0011\u0010k\u001a\u00020l8F¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0011\u0010p\u001a\u00020q8F¢\u0006\u0006\u001a\u0004\br\u0010sR\u0011\u0010u\u001a\u00020v8F¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0011\u0010z\u001a\u00020{8F¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0014\u0010\u007f\u001a\u00030\u0080\u00018F¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0013\u0010\u000e\u001a\u00020\u000f8F¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0013\u0010\u0010\u001a\u00020\u00118F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0017\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008e\u00018F¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0017\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u00018F¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R!\u0010\u0097\u0001\u001a\u000f\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u0002080\u0098\u00018F¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001¨\u0006Ä\u0001"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "event", "Lcom/polymarket/data/EEvent;", "positions", "", "Lcom/polymarket/data/EUserPosition;", "tradeTickerVM", "Lcom/polymarket/usviewmodels/USTradeTickerViewModel;", "pickASideVM", "Lcom/polymarket/usviewmodels/USPickASideViewModel;", "chatPreviewVM", "Lcom/polymarket/usviewmodels/USChatPreviewViewModel;", "canPresentSportDetails", "", "showsLiveMarkets", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", "callbacks", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$Callbacks;", "(Lcom/polymarket/data/EEvent;Ljava/util/List;Lcom/polymarket/usviewmodels/USTradeTickerViewModel;Lcom/polymarket/usviewmodels/USPickASideViewModel;Lcom/polymarket/usviewmodels/USChatPreviewViewModel;ZZLcom/polymarket/usviewmodels/AppSceneType;Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$Callbacks;)V", "getEvent", "()Lcom/polymarket/data/EEvent;", "Swift_event", "getPositions", "()Ljava/util/List;", "Swift_positions", "bodyTab", "Lcom/polymarket/usviewmodels/BodyTabBarPresentation$BodyTab;", "getBodyTab", "()Lcom/polymarket/usviewmodels/BodyTabBarPresentation$BodyTab;", "Swift_bodyTab", "bodyTabBarPresentation", "Lcom/polymarket/usviewmodels/BodyTabBarPresentation;", "getBodyTabBarPresentation", "()Lcom/polymarket/usviewmodels/BodyTabBarPresentation;", "Swift_bodyTabBarPresentation", "getCanPresentSportDetails", "()Z", "Swift_canPresentSportDetails", "visibleSectionIDs", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID;", "getVisibleSectionIDs", "Swift_visibleSectionIDs", "bodyTabContentIDs", "for_", "Swift_bodyTabContentIDs_0", "tab", "tabVM", "Lcom/polymarket/usviewmodels/USMarketGroupTabViewModel;", "forTab", "Swift_tabVM_1", "hasGameLines", "getHasGameLines", "Swift_hasGameLines", "hasPlayerProps", "getHasPlayerProps", "Swift_hasPlayerProps", "shouldShowLiveTradeButton", "getShouldShowLiveTradeButton", "Swift_shouldShowLiveTradeButton", "combosEnabled", "getCombosEnabled", "Swift_combosEnabled", "liveTradeButtonTitle", "", "getLiveTradeButtonTitle", "()Ljava/lang/String;", "Swift_liveTradeButtonTitle", "combosButtonTitle", "getCombosButtonTitle", "Swift_combosButtonTitle", "isGameLinesTabLoading", "Swift_isGameLinesTabLoading", "isPlayerPropsTabLoading", "Swift_isPlayerPropsTabLoading", "availableBodyTabs", "getAvailableBodyTabs", "Swift_availableBodyTabs", "hasAnyBodyTabContent", "getHasAnyBodyTabContent", "Swift_hasAnyBodyTabContent", "bodyTabContentState", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$BodyTabContentState;", "getBodyTabContentState", "()Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$BodyTabContentState;", "Swift_bodyTabContentState", "hasResolvedBodyTabs", "getHasResolvedBodyTabs", "Swift_hasResolvedBodyTabs", "bodyTabSkeletonStyle", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$BodyTabSkeletonStyle;", "getBodyTabSkeletonStyle", "()Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$BodyTabSkeletonStyle;", "Swift_bodyTabSkeletonStyle", "chartVM", "Lcom/polymarket/usviewmodels/SportsEventChartViewModel;", "getChartVM", "()Lcom/polymarket/usviewmodels/SportsEventChartViewModel;", "Swift_chartVM", "positionsVM", "Lcom/polymarket/usviewmodels/USEventPositionsViewModel;", "getPositionsVM", "()Lcom/polymarket/usviewmodels/USEventPositionsViewModel;", "Swift_positionsVM", "relatedEventsVM", "Lcom/polymarket/usviewmodels/USRelatedEventsViewModel;", "getRelatedEventsVM", "()Lcom/polymarket/usviewmodels/USRelatedEventsViewModel;", "Swift_relatedEventsVM", "marketRulesVM", "Lcom/polymarket/usviewmodels/USMarketRulesViewModel;", "getMarketRulesVM", "()Lcom/polymarket/usviewmodels/USMarketRulesViewModel;", "Swift_marketRulesVM", "payoutTimelineVM", "Lcom/polymarket/usviewmodels/USPayoutTimelineViewModel;", "getPayoutTimelineVM", "()Lcom/polymarket/usviewmodels/USPayoutTimelineViewModel;", "Swift_payoutTimelineVM", "layoutVariant", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$LayoutVariant;", "getLayoutVariant", "()Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$LayoutVariant;", "Swift_layoutVariant", "getTradeTickerVM", "()Lcom/polymarket/usviewmodels/USTradeTickerViewModel;", "Swift_tradeTickerVM", "getPickASideVM", "()Lcom/polymarket/usviewmodels/USPickASideViewModel;", "Swift_pickASideVM", "getChatPreviewVM", "()Lcom/polymarket/usviewmodels/USChatPreviewViewModel;", "Swift_chatPreviewVM", "ordersVM", "Lcom/polymarket/usviewmodels/UserOrdersViewModel;", "getOrdersVM", "()Lcom/polymarket/usviewmodels/UserOrdersViewModel;", "Swift_ordersVM", "promoBannerVM", "Lcom/polymarket/usviewmodels/PromoBannerViewModel;", "getPromoBannerVM", "()Lcom/polymarket/usviewmodels/PromoBannerViewModel;", "Swift_promoBannerVM", "tabVMs", "", "getTabVMs", "()Ljava/util/Map;", "Swift_tabVMs", "setup", "", "Swift_setup_3", "markEventDetailsLoaded", "Swift_markEventDetailsLoaded_4", "applyEventUpdate", "newEvent", "Swift_applyEventUpdate_5", "resetObservedDefaultLines", "Swift_resetObservedDefaultLines_6", "applyDefaultLineUpdate", TicketDetailDestinationKt.LAUNCHED_FROM, "Swift_applyDefaultLineUpdate_7", "applyMarketCacheUpdates", "updates", "Lcom/polymarket/data/EMarketCache;", "Swift_applyMarketCacheUpdates_8", "applyPositionsUpdate", "newPositions", "Swift_applyPositionsUpdate_9", "applyCanPresentSportDetails", "value", "Swift_applyCanPresentSportDetails_10", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$Input;", "Swift_sendInput_11", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "SectionID", "BodyTabContentState", "BodyTabSkeletonStyle", "LayoutVariant", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class USEventDetailSectionsViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$BodyTabContentState;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "hidden", "loading", "ready", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class BodyTabContentState implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ BodyTabContentState[] $VALUES;
        public static final BodyTabContentState hidden = new BodyTabContentState("hidden", 0);
        public static final BodyTabContentState loading = new BodyTabContentState("loading", 1);
        public static final BodyTabContentState ready = new BodyTabContentState("ready", 2);

        private static final /* synthetic */ BodyTabContentState[] $values() {
            return new BodyTabContentState[]{hidden, loading, ready};
        }

        static {
            BodyTabContentState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private BodyTabContentState(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static BodyTabContentState valueOf(String str) {
            return (BodyTabContentState) Enum.valueOf(BodyTabContentState.class, str);
        }

        public static BodyTabContentState[] values() {
            return (BodyTabContentState[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$BodyTabSkeletonStyle;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "teamRows", "compactSections", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class BodyTabSkeletonStyle implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ BodyTabSkeletonStyle[] $VALUES;
        public static final BodyTabSkeletonStyle teamRows = new BodyTabSkeletonStyle("teamRows", 0);
        public static final BodyTabSkeletonStyle compactSections = new BodyTabSkeletonStyle("compactSections", 1);

        private static final /* synthetic */ BodyTabSkeletonStyle[] $values() {
            return new BodyTabSkeletonStyle[]{teamRows, compactSections};
        }

        static {
            BodyTabSkeletonStyle[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private BodyTabSkeletonStyle(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static BodyTabSkeletonStyle valueOf(String str) {
            return (BodyTabSkeletonStyle) Enum.valueOf(BodyTabSkeletonStyle.class, str);
        }

        public static BodyTabSkeletonStyle[] values() {
            return (BodyTabSkeletonStyle[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$LayoutVariant;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "default", "withLiveVideo", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class LayoutVariant implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ LayoutVariant[] $VALUES;

        /* renamed from: default, reason: not valid java name */
        public static final LayoutVariant f16default = new LayoutVariant("default", 0);
        public static final LayoutVariant withLiveVideo = new LayoutVariant("withLiveVideo", 1);

        private static final /* synthetic */ LayoutVariant[] $values() {
            return new LayoutVariant[]{f16default, withLiveVideo};
        }

        static {
            LayoutVariant[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private LayoutVariant(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static LayoutVariant valueOf(String str) {
            return (LayoutVariant) Enum.valueOf(LayoutVariant.class, str);
        }

        public static LayoutVariant[] values() {
            return (LayoutVariant[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USEventDetailSectionsViewModel(EEvent eEvent, List<EUserPosition> list, USTradeTickerViewModel uSTradeTickerViewModel, USPickASideViewModel uSPickASideViewModel, USChatPreviewViewModel uSChatPreviewViewModel, boolean z, boolean z2, AppSceneType appSceneType, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_2(INSTANCE, eEvent, list, uSTradeTickerViewModel, uSPickASideViewModel, uSChatPreviewViewModel, z, z2, appSceneType, callbacks), (SwiftPeerMarker) null);
        eEvent.getClass();
        list.getClass();
        uSTradeTickerViewModel.getClass();
        uSPickASideViewModel.getClass();
        appSceneType.getClass();
        callbacks.getClass();
    }

    private final native void Swift_applyCanPresentSportDetails_10(long Swift_peer, boolean value);

    private final native void Swift_applyDefaultLineUpdate_7(long Swift_peer, EEvent newEvent);

    private final native void Swift_applyEventUpdate_5(long Swift_peer, EEvent newEvent);

    private final native void Swift_applyMarketCacheUpdates_8(long Swift_peer, Map<String, EMarketCache> updates, EEvent event);

    private final native void Swift_applyPositionsUpdate_9(long Swift_peer, List<EUserPosition> newPositions);

    private final native List<BodyTabBarPresentation.BodyTab> Swift_availableBodyTabs(long Swift_peer);

    private final native BodyTabBarPresentation.BodyTab Swift_bodyTab(long Swift_peer);

    private final native BodyTabBarPresentation Swift_bodyTabBarPresentation(long Swift_peer);

    private final native List<SectionID> Swift_bodyTabContentIDs_0(long Swift_peer, BodyTabBarPresentation.BodyTab tab);

    private final native BodyTabContentState Swift_bodyTabContentState(long Swift_peer);

    private final native BodyTabSkeletonStyle Swift_bodyTabSkeletonStyle(long Swift_peer);

    private final native boolean Swift_canPresentSportDetails(long Swift_peer);

    private final native SportsEventChartViewModel Swift_chartVM(long Swift_peer);

    private final native USChatPreviewViewModel Swift_chatPreviewVM(long Swift_peer);

    private final native String Swift_combosButtonTitle(long Swift_peer);

    private final native boolean Swift_combosEnabled(long Swift_peer);

    private final native EEvent Swift_event(long Swift_peer);

    private final native boolean Swift_hasAnyBodyTabContent(long Swift_peer);

    private final native boolean Swift_hasGameLines(long Swift_peer);

    private final native boolean Swift_hasPlayerProps(long Swift_peer);

    private final native boolean Swift_hasResolvedBodyTabs(long Swift_peer);

    private final native boolean Swift_isGameLinesTabLoading(long Swift_peer);

    private final native boolean Swift_isPlayerPropsTabLoading(long Swift_peer);

    private final native LayoutVariant Swift_layoutVariant(long Swift_peer);

    private final native String Swift_liveTradeButtonTitle(long Swift_peer);

    private final native void Swift_markEventDetailsLoaded_4(long Swift_peer);

    private final native USMarketRulesViewModel Swift_marketRulesVM(long Swift_peer);

    private final native UserOrdersViewModel Swift_ordersVM(long Swift_peer);

    private final native USPayoutTimelineViewModel Swift_payoutTimelineVM(long Swift_peer);

    private final native USPickASideViewModel Swift_pickASideVM(long Swift_peer);

    private final native List<EUserPosition> Swift_positions(long Swift_peer);

    private final native USEventPositionsViewModel Swift_positionsVM(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native PromoBannerViewModel Swift_promoBannerVM(long Swift_peer);

    private final native USRelatedEventsViewModel Swift_relatedEventsVM(long Swift_peer);

    private final native void Swift_resetObservedDefaultLines_6(long Swift_peer);

    private final native void Swift_sendInput_11(long Swift_peer, Input input);

    private final native void Swift_setup_3(long Swift_peer);

    private final native boolean Swift_shouldShowLiveTradeButton(long Swift_peer);

    private final native USMarketGroupTabViewModel Swift_tabVM_1(long Swift_peer, BodyTabBarPresentation.BodyTab tab);

    private final native Map<String, USMarketGroupTabViewModel> Swift_tabVMs(long Swift_peer);

    private final native USTradeTickerViewModel Swift_tradeTickerVM(long Swift_peer);

    private final native List<SectionID> Swift_visibleSectionIDs(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final void applyCanPresentSportDetails(boolean value) {
        Swift_applyCanPresentSportDetails_10(getSwift_peer(), value);
    }

    public final void applyDefaultLineUpdate(EEvent from) {
        from.getClass();
        Swift_applyDefaultLineUpdate_7(getSwift_peer(), from);
    }

    public final void applyEventUpdate(EEvent newEvent) {
        newEvent.getClass();
        Swift_applyEventUpdate_5(getSwift_peer(), newEvent);
    }

    public final void applyMarketCacheUpdates(Map<String, EMarketCache> updates, EEvent event) {
        updates.getClass();
        event.getClass();
        Swift_applyMarketCacheUpdates_8(getSwift_peer(), updates, event);
    }

    public final void applyPositionsUpdate(List<EUserPosition> newPositions) {
        newPositions.getClass();
        Swift_applyPositionsUpdate_9(getSwift_peer(), newPositions);
    }

    public final List<SectionID> bodyTabContentIDs(BodyTabBarPresentation.BodyTab for_) {
        for_.getClass();
        return Swift_bodyTabContentIDs_0(getSwift_peer(), for_);
    }

    public final List<BodyTabBarPresentation.BodyTab> getAvailableBodyTabs() {
        return Swift_availableBodyTabs(getSwift_peer());
    }

    public final BodyTabBarPresentation.BodyTab getBodyTab() {
        return Swift_bodyTab(getSwift_peer());
    }

    public final BodyTabBarPresentation getBodyTabBarPresentation() {
        return Swift_bodyTabBarPresentation(getSwift_peer());
    }

    public final BodyTabContentState getBodyTabContentState() {
        return Swift_bodyTabContentState(getSwift_peer());
    }

    public final BodyTabSkeletonStyle getBodyTabSkeletonStyle() {
        return Swift_bodyTabSkeletonStyle(getSwift_peer());
    }

    public final boolean getCanPresentSportDetails() {
        return Swift_canPresentSportDetails(getSwift_peer());
    }

    public final SportsEventChartViewModel getChartVM() {
        return Swift_chartVM(getSwift_peer());
    }

    public final USChatPreviewViewModel getChatPreviewVM() {
        return Swift_chatPreviewVM(getSwift_peer());
    }

    public final String getCombosButtonTitle() {
        return Swift_combosButtonTitle(getSwift_peer());
    }

    public final boolean getCombosEnabled() {
        return Swift_combosEnabled(getSwift_peer());
    }

    public final EEvent getEvent() {
        return Swift_event(getSwift_peer());
    }

    public final boolean getHasAnyBodyTabContent() {
        return Swift_hasAnyBodyTabContent(getSwift_peer());
    }

    public final boolean getHasGameLines() {
        return Swift_hasGameLines(getSwift_peer());
    }

    public final boolean getHasPlayerProps() {
        return Swift_hasPlayerProps(getSwift_peer());
    }

    public final boolean getHasResolvedBodyTabs() {
        return Swift_hasResolvedBodyTabs(getSwift_peer());
    }

    public final LayoutVariant getLayoutVariant() {
        return Swift_layoutVariant(getSwift_peer());
    }

    public final String getLiveTradeButtonTitle() {
        return Swift_liveTradeButtonTitle(getSwift_peer());
    }

    public final USMarketRulesViewModel getMarketRulesVM() {
        return Swift_marketRulesVM(getSwift_peer());
    }

    public final UserOrdersViewModel getOrdersVM() {
        return Swift_ordersVM(getSwift_peer());
    }

    public final USPayoutTimelineViewModel getPayoutTimelineVM() {
        return Swift_payoutTimelineVM(getSwift_peer());
    }

    public final USPickASideViewModel getPickASideVM() {
        return Swift_pickASideVM(getSwift_peer());
    }

    public final List<EUserPosition> getPositions() {
        return Swift_positions(getSwift_peer());
    }

    public final USEventPositionsViewModel getPositionsVM() {
        return Swift_positionsVM(getSwift_peer());
    }

    public final PromoBannerViewModel getPromoBannerVM() {
        return Swift_promoBannerVM(getSwift_peer());
    }

    public final USRelatedEventsViewModel getRelatedEventsVM() {
        return Swift_relatedEventsVM(getSwift_peer());
    }

    public final boolean getShouldShowLiveTradeButton() {
        return Swift_shouldShowLiveTradeButton(getSwift_peer());
    }

    public final Map<String, USMarketGroupTabViewModel> getTabVMs() {
        return Swift_tabVMs(getSwift_peer());
    }

    public final USTradeTickerViewModel getTradeTickerVM() {
        return Swift_tradeTickerVM(getSwift_peer());
    }

    public final List<SectionID> getVisibleSectionIDs() {
        return Swift_visibleSectionIDs(getSwift_peer());
    }

    public final boolean isGameLinesTabLoading() {
        return Swift_isGameLinesTabLoading(getSwift_peer());
    }

    public final boolean isPlayerPropsTabLoading() {
        return Swift_isPlayerPropsTabLoading(getSwift_peer());
    }

    public final void markEventDetailsLoaded() {
        Swift_markEventDetailsLoaded_4(getSwift_peer());
    }

    public final void resetObservedDefaultLines() {
        Swift_resetObservedDefaultLines_6(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_11(getSwift_peer(), input);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_3(getSwift_peer());
    }

    public final USMarketGroupTabViewModel tabVM(BodyTabBarPresentation.BodyTab forTab) {
        forTab.getClass();
        return Swift_tabVM_1(getSwift_peer(), forTab);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00132\u00020\u0001:\u0003\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnBodyTabSelectedCase", "Companion", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$Input$OnBodyTabSelectedCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$Input$OnViewDidLoadCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$Input$OnBodyTabSelectedCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/BodyTabBarPresentation$BodyTab;", "<init>", "(Lcom/polymarket/usviewmodels/BodyTabBarPresentation$BodyTab;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/BodyTabBarPresentation$BodyTab;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnBodyTabSelectedCase extends Input {
            private final BodyTabBarPresentation.BodyTab associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnBodyTabSelectedCase(BodyTabBarPresentation.BodyTab bodyTab) {
                super(null);
                bodyTab.getClass();
                this.associated0 = bodyTab;
            }

            public final BodyTabBarPresentation.BodyTab getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidLoadCase extends Input {
            public OnViewDidLoadCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnViewDidLoad$cp() {
            return onViewDidLoad;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$Input;", "onBodyTabSelected", "associated0", "Lcom/polymarket/usviewmodels/BodyTabBarPresentation$BodyTab;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input onBodyTabSelected(BodyTabBarPresentation.BodyTab associated0) {
                associated0.getClass();
                return new OnBodyTabSelectedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0014\u0010\u0006\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u000f!\"#$%&'()*+,-./¨\u00060"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID;", "Lskip/lib/Identifiable;", "", "Lskip/lib/SwiftProjecting;", "<init>", "()V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()Ljava/lang/String;", "Swift_id", "className", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "ChartCase", "PositionsCase", "PickASideCase", "PromoBannerCase", "ChatPreviewCase", "LiveTradeComboButtonCase", "BodyTabBarCase", "BodyContentCase", "GameLineSectionCase", "PlayerPropsCase", "OrdersCase", "MarketRulesCase", "PayoutTimelineCase", "RelatedEventsCase", "BottomSpacerCase", "Companion", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$BodyContentCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$BodyTabBarCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$BottomSpacerCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$ChartCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$ChatPreviewCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$GameLineSectionCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$LiveTradeComboButtonCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$MarketRulesCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$OrdersCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$PayoutTimelineCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$PickASideCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$PlayerPropsCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$PositionsCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$PromoBannerCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$RelatedEventsCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class SectionID implements Identifiable<String>, SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final SectionID chart = new ChartCase();
        private static final SectionID positions = new PositionsCase();
        private static final SectionID pickASide = new PickASideCase();
        private static final SectionID promoBanner = new PromoBannerCase();
        private static final SectionID chatPreview = new ChatPreviewCase();
        private static final SectionID liveTradeComboButton = new LiveTradeComboButtonCase();
        private static final SectionID bodyTabBar = new BodyTabBarCase();
        private static final SectionID bodyContent = new BodyContentCase();
        private static final SectionID playerProps = new PlayerPropsCase();
        private static final SectionID orders = new OrdersCase();
        private static final SectionID marketRules = new MarketRulesCase();
        private static final SectionID payoutTimeline = new PayoutTimelineCase();
        private static final SectionID relatedEvents = new RelatedEventsCase();
        private static final SectionID bottomSpacer = new BottomSpacerCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$BodyContentCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class BodyContentCase extends SectionID {
            public BodyContentCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$BodyTabBarCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class BodyTabBarCase extends SectionID {
            public BodyTabBarCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$BottomSpacerCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class BottomSpacerCase extends SectionID {
            public BottomSpacerCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$ChartCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class ChartCase extends SectionID {
            public ChartCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$ChatPreviewCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class ChatPreviewCase extends SectionID {
            public ChatPreviewCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$GameLineSectionCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "sectionID", "getSectionID", "equals", "", "other", "", "hashCode", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class GameLineSectionCase extends SectionID {
            private final String associated0;
            private final String sectionID;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GameLineSectionCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
                this.sectionID = str;
            }

            public boolean equals(Object other) {
                if (!(other instanceof GameLineSectionCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((GameLineSectionCase) other).associated0);
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public final String getSectionID() {
                return this.sectionID;
            }

            public int hashCode() {
                return Hasher.INSTANCE.combine(1, this.associated0);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$LiveTradeComboButtonCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class LiveTradeComboButtonCase extends SectionID {
            public LiveTradeComboButtonCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$MarketRulesCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class MarketRulesCase extends SectionID {
            public MarketRulesCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$OrdersCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OrdersCase extends SectionID {
            public OrdersCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$PayoutTimelineCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class PayoutTimelineCase extends SectionID {
            public PayoutTimelineCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$PickASideCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class PickASideCase extends SectionID {
            public PickASideCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$PlayerPropsCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class PlayerPropsCase extends SectionID {
            public PlayerPropsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$PositionsCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class PositionsCase extends SectionID {
            public PositionsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$PromoBannerCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class PromoBannerCase extends SectionID {
            public PromoBannerCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$RelatedEventsCase;", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class RelatedEventsCase extends SectionID {
            public RelatedEventsCase() {
                super(null);
            }
        }

        public /* synthetic */ SectionID(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native String Swift_id(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ SectionID access$getBodyContent$cp() {
            return bodyContent;
        }

        public static final /* synthetic */ SectionID access$getBodyTabBar$cp() {
            return bodyTabBar;
        }

        public static final /* synthetic */ SectionID access$getBottomSpacer$cp() {
            return bottomSpacer;
        }

        public static final /* synthetic */ SectionID access$getChart$cp() {
            return chart;
        }

        public static final /* synthetic */ SectionID access$getChatPreview$cp() {
            return chatPreview;
        }

        public static final /* synthetic */ SectionID access$getLiveTradeComboButton$cp() {
            return liveTradeComboButton;
        }

        public static final /* synthetic */ SectionID access$getMarketRules$cp() {
            return marketRules;
        }

        public static final /* synthetic */ SectionID access$getOrders$cp() {
            return orders;
        }

        public static final /* synthetic */ SectionID access$getPayoutTimeline$cp() {
            return payoutTimeline;
        }

        public static final /* synthetic */ SectionID access$getPickASide$cp() {
            return pickASide;
        }

        public static final /* synthetic */ SectionID access$getPlayerProps$cp() {
            return playerProps;
        }

        public static final /* synthetic */ SectionID access$getPositions$cp() {
            return positions;
        }

        public static final /* synthetic */ SectionID access$getPromoBanner$cp() {
            return promoBanner;
        }

        public static final /* synthetic */ SectionID access$getRelatedEvents$cp() {
            return relatedEvents;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0007R\u0011\u0010\u001d\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0007R\u0011\u0010\u001f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0007R\u0011\u0010!\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0007R\u0011\u0010#\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0007¨\u0006%"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID$Companion;", "", "<init>", "()V", "chart", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID;", "getChart", "()Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$SectionID;", "positions", "getPositions", "pickASide", "getPickASide", "promoBanner", "getPromoBanner", "chatPreview", "getChatPreview", "liveTradeComboButton", "getLiveTradeComboButton", "bodyTabBar", "getBodyTabBar", "bodyContent", "getBodyContent", "gameLineSection", "sectionID", "", "playerProps", "getPlayerProps", "orders", "getOrders", "marketRules", "getMarketRules", "payoutTimeline", "getPayoutTimeline", "relatedEvents", "getRelatedEvents", "bottomSpacer", "getBottomSpacer", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SectionID gameLineSection(String sectionID) {
                sectionID.getClass();
                return new GameLineSectionCase(sectionID);
            }

            public final SectionID getBodyContent() {
                return SectionID.access$getBodyContent$cp();
            }

            public final SectionID getBodyTabBar() {
                return SectionID.access$getBodyTabBar$cp();
            }

            public final SectionID getBottomSpacer() {
                return SectionID.access$getBottomSpacer$cp();
            }

            public final SectionID getChart() {
                return SectionID.access$getChart$cp();
            }

            public final SectionID getChatPreview() {
                return SectionID.access$getChatPreview$cp();
            }

            public final SectionID getLiveTradeComboButton() {
                return SectionID.access$getLiveTradeComboButton$cp();
            }

            public final SectionID getMarketRules() {
                return SectionID.access$getMarketRules$cp();
            }

            public final SectionID getOrders() {
                return SectionID.access$getOrders$cp();
            }

            public final SectionID getPayoutTimeline() {
                return SectionID.access$getPayoutTimeline$cp();
            }

            public final SectionID getPickASide() {
                return SectionID.access$getPickASide$cp();
            }

            public final SectionID getPlayerProps() {
                return SectionID.access$getPlayerProps$cp();
            }

            public final SectionID getPositions() {
                return SectionID.access$getPositions$cp();
            }

            public final SectionID getPromoBanner() {
                return SectionID.access$getPromoBanner$cp();
            }

            public final SectionID getRelatedEvents() {
                return SectionID.access$getRelatedEvents$cp();
            }

            private Companion() {
            }
        }

        private SectionID() {
        }

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ String getId() {
            return getId2();
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0082 J\u0010\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u0011\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\bH\u0082 ¨\u0006\u001c"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_2", "", "Lskip/bridge/SwiftObjectPointer;", "event", "Lcom/polymarket/data/EEvent;", "positions", "", "Lcom/polymarket/data/EUserPosition;", "tradeTickerVM", "Lcom/polymarket/usviewmodels/USTradeTickerViewModel;", "pickASideVM", "Lcom/polymarket/usviewmodels/USPickASideViewModel;", "chatPreviewVM", "Lcom/polymarket/usviewmodels/USChatPreviewViewModel;", "canPresentSportDetails", "", "showsLiveMarkets", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", "callbacks", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel;", "Swift_Companion_mock_12", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_2(EEvent event, List<EUserPosition> positions, USTradeTickerViewModel tradeTickerVM, USPickASideViewModel pickASideVM, USChatPreviewViewModel chatPreviewVM, boolean canPresentSportDetails, boolean showsLiveMarkets, AppSceneType scene, Callbacks callbacks);

        private final native USEventDetailSectionsViewModel Swift_Companion_mock_12(EEvent event);

        public static final /* synthetic */ long access$Swift_Companion_constructor_2(Companion companion, EEvent eEvent, List list, USTradeTickerViewModel uSTradeTickerViewModel, USPickASideViewModel uSPickASideViewModel, USChatPreviewViewModel uSChatPreviewViewModel, boolean z, boolean z2, AppSceneType appSceneType, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_2(eEvent, list, uSTradeTickerViewModel, uSPickASideViewModel, uSChatPreviewViewModel, z, z2, appSceneType, callbacks);
        }

        public static /* synthetic */ USEventDetailSectionsViewModel mock$default(Companion companion, EEvent eEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                eEvent = EEvent.Companion.mockRealisticNBA$default(EEvent.INSTANCE, null, null, null, 7, null);
            }
            return companion.mock(eEvent);
        }

        public final USEventDetailSectionsViewModel mock(EEvent event) {
            event.getClass();
            return Swift_Companion_mock_12(event);
        }

        private Companion() {
        }
    }

    public USEventDetailSectionsViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    public /* synthetic */ USEventDetailSectionsViewModel(EEvent eEvent, List list, USTradeTickerViewModel uSTradeTickerViewModel, USPickASideViewModel uSPickASideViewModel, USChatPreviewViewModel uSChatPreviewViewModel, boolean z, boolean z2, AppSceneType appSceneType, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eEvent, list, uSTradeTickerViewModel, uSPickASideViewModel, uSChatPreviewViewModel, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, appSceneType, callbacks);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001=B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBu\b\u0016\u0012 \b\u0002\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u000b\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u0011\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\b\u0010\u001aJ\u0006\u0010\u001f\u001a\u00020\u000fJ\u0015\u0010 \u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J-\u0010)\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00101\u001a\u00020\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00104\u001a\u00020\u00172\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00107\u001a\u00020\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 Jm\u00108\u001a\u00060\u0004j\u0002`\u00052\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0082 J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020$0:2\u0006\u0010;\u001a\u00020&H\u0016J\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020$0:2\u0006\u0010;\u001a\u00020&H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR)\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u00118F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00118F¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006>"}, d2 = {"Lcom/polymarket/usviewmodels/USEventDetailSectionsViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onMarketSideSelected", "Lkotlin/Function3;", "Lcom/polymarket/data/EMarket;", "Lcom/polymarket/data/EMarket$MarketSide;", "Lcom/polymarket/data/EEvent;", "", "onOpenPlayerProps", "Lkotlin/Function1;", "Lcom/polymarket/usviewmodels/PlayerPropsSheetRequest;", "onEventSelected", "userPositionCallbacks", "Lcom/polymarket/usviewmodels/UserPositionViewModel$Callbacks;", "promoBannerCallbacks", "Lcom/polymarket/usviewmodels/PromoBannerViewModel$Callbacks;", "marketRulesCallbacks", "Lcom/polymarket/usviewmodels/USMarketRulesViewModel$Callbacks;", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/polymarket/usviewmodels/UserPositionViewModel$Callbacks;Lcom/polymarket/usviewmodels/PromoBannerViewModel$Callbacks;Lcom/polymarket/usviewmodels/USMarketRulesViewModel$Callbacks;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnMarketSideSelected", "()Lkotlin/jvm/functions/Function3;", "Swift_onMarketSideSelected", "getOnOpenPlayerProps", "()Lkotlin/jvm/functions/Function1;", "Swift_onOpenPlayerProps", "getOnEventSelected", "Swift_onEventSelected", "getUserPositionCallbacks", "()Lcom/polymarket/usviewmodels/UserPositionViewModel$Callbacks;", "Swift_userPositionCallbacks", "getPromoBannerCallbacks", "()Lcom/polymarket/usviewmodels/PromoBannerViewModel$Callbacks;", "Swift_promoBannerCallbacks", "getMarketRulesCallbacks", "()Lcom/polymarket/usviewmodels/USMarketRulesViewModel$Callbacks;", "Swift_marketRulesCallbacks", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Callbacks(Function3 function3, Function1 function1, Function1 function12, UserPositionViewModel.Callbacks callbacks, PromoBannerViewModel.Callbacks callbacks2, USMarketRulesViewModel.Callbacks callbacks3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(function3, r0, r1, r3, r2, r21);
            Function1 function13;
            Function1 function14;
            UserPositionViewModel.Callbacks callbacks4;
            PromoBannerViewModel.Callbacks callbacks5;
            USMarketRulesViewModel.Callbacks callbacks6;
            function3 = (i & 1) != 0 ? new qx7(24) : function3;
            if ((i & 2) != 0) {
                function13 = new pkj(28);
            } else {
                function13 = function1;
            }
            if ((i & 4) != 0) {
                function14 = new pkj(29);
            } else {
                function14 = function12;
            }
            if ((i & 8) != 0) {
                callbacks4 = new UserPositionViewModel.Callbacks(null, null, null, null, null, null, null, 127, null);
            } else {
                callbacks4 = callbacks;
            }
            if ((i & 16) != 0) {
                callbacks5 = new PromoBannerViewModel.Callbacks(null, null, 3, null);
            } else {
                callbacks5 = callbacks2;
            }
            if ((i & 32) != 0) {
                callbacks6 = new USMarketRulesViewModel.Callbacks(null, null, 3, null);
            } else {
                callbacks6 = callbacks3;
            }
        }

        private final native long Swift_constructor_0(Function3<? super EMarket, ? super EMarket.MarketSide, ? super EEvent, Unit> onMarketSideSelected, Function1<? super PlayerPropsSheetRequest, Unit> onOpenPlayerProps, Function1<? super EEvent, Unit> onEventSelected, UserPositionViewModel.Callbacks userPositionCallbacks, PromoBannerViewModel.Callbacks promoBannerCallbacks, USMarketRulesViewModel.Callbacks marketRulesCallbacks);

        private final native USMarketRulesViewModel.Callbacks Swift_marketRulesCallbacks(long Swift_peer);

        private final native Function1<EEvent, Unit> Swift_onEventSelected(long Swift_peer);

        private final native Function3<EMarket, EMarket.MarketSide, EEvent, Unit> Swift_onMarketSideSelected(long Swift_peer);

        private final native Function1<PlayerPropsSheetRequest, Unit> Swift_onOpenPlayerProps(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native PromoBannerViewModel.Callbacks Swift_promoBannerCallbacks(long Swift_peer);

        private final native void Swift_release(long Swift_peer);

        private final native UserPositionViewModel.Callbacks Swift_userPositionCallbacks(long Swift_peer);

        private static final Unit _init_$lambda$0(EMarket eMarket, EMarket.MarketSide marketSide, EEvent eEvent) {
            ace.z(eEvent, eMarket, marketSide);
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(PlayerPropsSheetRequest playerPropsSheetRequest) {
            playerPropsSheetRequest.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2(EEvent eEvent) {
            eEvent.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(EEvent eEvent) {
            return _init_$lambda$2(eEvent);
        }

        public static /* synthetic */ Unit b(PlayerPropsSheetRequest playerPropsSheetRequest) {
            return _init_$lambda$1(playerPropsSheetRequest);
        }

        public static /* synthetic */ Unit c(EEvent eEvent, EMarket eMarket, EMarket.MarketSide marketSide) {
            return _init_$lambda$0(eMarket, marketSide, eEvent);
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

        public final USMarketRulesViewModel.Callbacks getMarketRulesCallbacks() {
            return Swift_marketRulesCallbacks(this.Swift_peer);
        }

        public final Function1<EEvent, Unit> getOnEventSelected() {
            return Swift_onEventSelected(this.Swift_peer);
        }

        public final Function3<EMarket, EMarket.MarketSide, EEvent, Unit> getOnMarketSideSelected() {
            return Swift_onMarketSideSelected(this.Swift_peer);
        }

        public final Function1<PlayerPropsSheetRequest, Unit> getOnOpenPlayerProps() {
            return Swift_onOpenPlayerProps(this.Swift_peer);
        }

        public final PromoBannerViewModel.Callbacks getPromoBannerCallbacks() {
            return Swift_promoBannerCallbacks(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final UserPositionViewModel.Callbacks getUserPositionCallbacks() {
            return Swift_userPositionCallbacks(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public Callbacks(Function3<? super EMarket, ? super EMarket.MarketSide, ? super EEvent, Unit> function3, Function1<? super PlayerPropsSheetRequest, Unit> function1, Function1<? super EEvent, Unit> function12, UserPositionViewModel.Callbacks callbacks, PromoBannerViewModel.Callbacks callbacks2, USMarketRulesViewModel.Callbacks callbacks3) {
            function3.getClass();
            function1.getClass();
            function12.getClass();
            callbacks.getClass();
            callbacks2.getClass();
            callbacks3.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function3, function1, function12, callbacks, callbacks2, callbacks3);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
