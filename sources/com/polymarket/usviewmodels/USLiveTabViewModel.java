package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.APIEventTag;
import com.polymarket.data.EEvent;
import com.polymarket.data.ELiveSection;
import com.polymarket.usviewmodels.AppViewModel;
import com.polymarket.usviewmodels.USEventCardViewModel;
import defpackage.hoj;
import defpackage.wmj;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0007\u0018\u0000 «\u00012\u00020\u0001:\f¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001f\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010\u0017\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082 J\u0015\u0010 \u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010!\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0019\u001a\u00020\u001aH\u0082 J\u0017\u0010(\u001a\u0004\u0018\u00010\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010)\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\"H\u0082 J!\u00101\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020+0*2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J)\u00102\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020+0*H\u0082 J\u0015\u00108\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u00109\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0019\u001a\u000203H\u0082 J\u0015\u0010=\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010>\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0019\u001a\u000203H\u0082 J\u0015\u0010A\u001a\u00020\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010D\u001a\u00020\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010G\u001a\u00020\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010K\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010L\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0019\u001a\u00020\u001aH\u0082 J\u001c\u0010R\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 ¢\u0006\u0002\u0010SJ$\u0010T\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0082 ¢\u0006\u0002\u0010UJ\u0015\u0010Y\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010Z\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0019\u001a\u000203H\u0082 J\u0015\u0010]\u001a\u00020\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010a\u001a\u0004\u0018\u00010\u00102\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010e\u001a\b\u0012\u0004\u0012\u00020c0\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010h\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010i\u001a\b\u0012\u0004\u0012\u00020c0\u000f2\b\u0010j\u001a\u0004\u0018\u00010\u0010J%\u0010k\u001a\b\u0012\u0004\u0012\u00020c0\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010l\u001a\u0004\u0018\u00010\u0010H\u0082 J\u0014\u0010m\u001a\b\u0012\u0004\u0012\u00020n0\u000f2\u0006\u0010j\u001a\u00020\u0010J#\u0010o\u001a\b\u0012\u0004\u0012\u00020n0\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010l\u001a\u00020\u0010H\u0082 J\u0014\u0010p\u001a\b\u0012\u0004\u0012\u00020q0\u000f2\u0006\u0010j\u001a\u00020\u0010J#\u0010r\u001a\b\u0012\u0004\u0012\u00020q0\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010l\u001a\u00020\u0010H\u0082 J\u0014\u0010s\u001a\b\u0012\u0004\u0012\u00020n0\u000f2\u0006\u0010j\u001a\u00020\u0010J#\u0010t\u001a\b\u0012\u0004\u0012\u00020n0\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010l\u001a\u00020\u0010H\u0082 J\u001b\u0010w\u001a\b\u0012\u0004\u0012\u00020n0\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010y\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010z\u001a\u0002032\u0006\u0010j\u001a\u00020nJ\u001d\u0010{\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010|\u001a\u00020nH\u0082 J\u0015\u0010~\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0081\u0001\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0084\u0001\u001a\u00020\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0087\u0001\u001a\u00020\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\"\u0010\u008a\u0001\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001a0*2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u0088\u0001\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001a0*2\b\u0010j\u001a\u0004\u0018\u00010\u0010J,\u0010\u008b\u0001\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001a0*2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010l\u001a\u0004\u0018\u00010\u0010H\u0082 J\u0016\u0010\u008d\u0001\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0010\u0010\u008e\u0001\u001a\u0002032\u0007\u0010\u008f\u0001\u001a\u00020\u001aJ\u001f\u0010\u0090\u0001\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\u0091\u0001\u001a\u00020\u001aH\u0082 J\u0010\u0010\u0092\u0001\u001a\u0002032\u0007\u0010\u008f\u0001\u001a\u00020\u001aJ\u001f\u0010\u0093\u0001\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\u0091\u0001\u001a\u00020\u001aH\u0082 J\t\u0010\u0094\u0001\u001a\u00020\u0018H\u0016J\u0016\u0010\u0095\u0001\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\t\u0010\u0096\u0001\u001a\u00020\u0018H\u0016J\u0016\u0010\u0097\u0001\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0011\u0010\u0098\u0001\u001a\u00020\u00182\b\u0010\u0099\u0001\u001a\u00030\u009a\u0001J \u0010\u009b\u0001\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0099\u0001\u001a\u00030\u009a\u0001H\u0082 J\u000f\u0010\u009c\u0001\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u009d\u0001\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0011\u0010\u009e\u0001\u001a\u0004\u0018\u00010+2\u0006\u0010j\u001a\u00020\"J!\u0010\u009f\u0001\u001a\u0004\u0018\u00010+2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010 \u0001\u001a\u00020\"H\u0082 J\u001a\u0010¡\u0001\u001a\n\u0012\u0005\u0012\u00030£\u00010¢\u00012\u0007\u0010¤\u0001\u001a\u00020\u001aH\u0016J\u001b\u0010¥\u0001\u001a\n\u0012\u0005\u0012\u00030£\u00010¢\u00012\u0007\u0010¤\u0001\u001a\u00020\u001aH\u0082 R0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\u000e\u001a\u0004\u0018\u00010\"8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R<\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020+0*2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020+0*8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00104\u001a\u0002032\u0006\u0010\u000e\u001a\u0002038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010:\u001a\u0002032\u0006\u0010\u000e\u001a\u0002038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u00105\"\u0004\b<\u00107R\u0011\u0010?\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b@\u0010%R\u0011\u0010B\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\bC\u0010%R\u0011\u0010E\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\bF\u0010%R$\u0010H\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010\u001d\"\u0004\bJ\u0010\u001fR(\u0010M\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010V\u001a\u0002032\u0006\u0010\u000e\u001a\u0002038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u00105\"\u0004\bX\u00107R\u0011\u0010[\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b\\\u0010%R\u0013\u0010^\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0017\u0010b\u001a\b\u0012\u0004\u0012\u00020c0\u000f8F¢\u0006\u0006\u001a\u0004\bd\u0010\u0013R\u0011\u0010f\u001a\u0002038F¢\u0006\u0006\u001a\u0004\bg\u00105R\u0017\u0010u\u001a\b\u0012\u0004\u0012\u00020n0\u000f8F¢\u0006\u0006\u001a\u0004\bv\u0010\u0013R\u0011\u0010x\u001a\u0002038F¢\u0006\u0006\u001a\u0004\bx\u00105R\u0011\u0010}\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b}\u00105R\u0012\u0010\u007f\u001a\u0002038F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u00105R\u0013\u0010\u0082\u0001\u001a\u00020\"8F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010%R\u0013\u0010\u0085\u0001\u001a\u00020\"8F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010%R\u001f\u0010\u0088\u0001\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001a0*8F¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010.R\u0013\u0010\u008c\u0001\u001a\u0002038F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u00105¨\u0006¬\u0001"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTabViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "callbacks", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Callbacks;", "notificationsFeedVM", "Lcom/polymarket/usviewmodels/NotificationsFeedViewModel;", "(Lcom/polymarket/usviewmodels/USLiveTabViewModel$Callbacks;Lcom/polymarket/usviewmodels/NotificationsFeedViewModel;)V", "newValue", "", "Lcom/polymarket/data/ELiveSection;", "sections", "getSections", "()Ljava/util/List;", "setSections", "(Ljava/util/List;)V", "Swift_sections", "Swift_sections_set", "", "value", "", "selectedSectionIndex", "getSelectedSectionIndex", "()I", "setSelectedSectionIndex", "(I)V", "Swift_selectedSectionIndex", "Swift_selectedSectionIndex_set", "", "selectedSubtagSlug", "getSelectedSubtagSlug", "()Ljava/lang/String;", "setSelectedSubtagSlug", "(Ljava/lang/String;)V", "Swift_selectedSubtagSlug", "Swift_selectedSubtagSlug_set", "", "Lcom/polymarket/usviewmodels/USEventCardViewModel;", "eventViewModels", "getEventViewModels", "()Ljava/util/Map;", "setEventViewModels", "(Ljava/util/Map;)V", "Swift_eventViewModels", "Swift_eventViewModels_set", "", "isLoading", "()Z", "setLoading", "(Z)V", "Swift_isLoading", "Swift_isLoading_set", "hasLoadError", "getHasLoadError", "setHasLoadError", "Swift_hasLoadError", "Swift_hasLoadError_set", "errorTitle", "getErrorTitle", "Swift_errorTitle", "errorSubtitle", "getErrorSubtitle", "Swift_errorSubtitle", "errorRetryButtonTitle", "getErrorRetryButtonTitle", "Swift_errorRetryButtonTitle", "scrollToTopToken", "getScrollToTopToken", "setScrollToTopToken", "Swift_scrollToTopToken", "Swift_scrollToTopToken_set", "liveBadgeCount", "getLiveBadgeCount", "()Ljava/lang/Integer;", "setLiveBadgeCount", "(Ljava/lang/Integer;)V", "Swift_liveBadgeCount", "(J)Ljava/lang/Integer;", "Swift_liveBadgeCount_set", "(JLjava/lang/Integer;)V", "hasUnreadNotifications", "getHasUnreadNotifications", "setHasUnreadNotifications", "Swift_hasUnreadNotifications", "Swift_hasUnreadNotifications_set", "depositButtonText", "getDepositButtonText", "Swift_depositButtonText", "selectedSection", "getSelectedSection", "()Lcom/polymarket/data/ELiveSection;", "Swift_selectedSection", "subtags", "Lcom/polymarket/data/APIEventTag;", "getSubtags", "Swift_subtags", "hasSubtags", "getHasSubtags", "Swift_hasSubtags", "resolvedSubtags", "for_", "Swift_resolvedSubtags_0", "section", RadarTrackingOptions.RadarTrackingOptionsSync.EVENTS_STR, "Lcom/polymarket/data/EEvent;", "Swift_events_1", "displaySections", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$LiveFeedDisplaySection;", "Swift_displaySections_2", "liveGames", "Swift_liveGames_3", "currentLiveGames", "getCurrentLiveGames", "Swift_currentLiveGames", "isLiveTradeGloballyEnabled", "Swift_isLiveTradeGloballyEnabled", "isLiveTradeEnabled", "Swift_isLiveTradeEnabled_4", "event", "isBuildComboFooterEnabled", "Swift_isBuildComboFooterEnabled", "showBuildComboButtonFooter", "getShowBuildComboButtonFooter", "Swift_showBuildComboButtonFooter", "emptyStateTitle", "getEmptyStateTitle", "Swift_emptyStateTitle", "emptyStateSubtitle", "getEmptyStateSubtitle", "Swift_emptyStateSubtitle", "subtagCounts", "getSubtagCounts", "Swift_subtagCounts", "Swift_subtagCounts_5", "isSectionContentLoading", "Swift_isSectionContentLoading", "isSectionLoading", "at", "Swift_isSectionLoading_6", "index", "isSectionLoadingMore", "Swift_isSectionLoadingMore_7", "setup", "Swift_setup_9", "handleBecomeForeground", "Swift_handleBecomeForeground_10", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input;", "Swift_sendInput_11", "setCallbacks", "Swift_setCallbacks_12", "eventViewModel", "Swift_eventViewModel_13", "eventId", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Callbacks", "PageStatus", "PageState", "LiveFeedDisplaySection", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class USLiveTabViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTabViewModel$PageState;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class PageState implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public PageState(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

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

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }
    }

    public /* synthetic */ USLiveTabViewModel(Callbacks callbacks, NotificationsFeedViewModel notificationsFeedViewModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Callbacks(null, null, null, null, null, null, null, null, 255, null) : callbacks, (i & 2) != 0 ? null : notificationsFeedViewModel);
    }

    private final native List<EEvent> Swift_currentLiveGames(long Swift_peer);

    private final native String Swift_depositButtonText(long Swift_peer);

    private final native List<LiveFeedDisplaySection> Swift_displaySections_2(long Swift_peer, ELiveSection section);

    private final native String Swift_emptyStateSubtitle(long Swift_peer);

    private final native String Swift_emptyStateTitle(long Swift_peer);

    private final native String Swift_errorRetryButtonTitle(long Swift_peer);

    private final native String Swift_errorSubtitle(long Swift_peer);

    private final native String Swift_errorTitle(long Swift_peer);

    private final native USEventCardViewModel Swift_eventViewModel_13(long Swift_peer, String eventId);

    private final native Map<String, USEventCardViewModel> Swift_eventViewModels(long Swift_peer);

    private final native void Swift_eventViewModels_set(long Swift_peer, Map<String, USEventCardViewModel> value);

    private final native List<EEvent> Swift_events_1(long Swift_peer, ELiveSection section);

    private final native void Swift_handleBecomeForeground_10(long Swift_peer);

    private final native boolean Swift_hasLoadError(long Swift_peer);

    private final native void Swift_hasLoadError_set(long Swift_peer, boolean value);

    private final native boolean Swift_hasSubtags(long Swift_peer);

    private final native boolean Swift_hasUnreadNotifications(long Swift_peer);

    private final native void Swift_hasUnreadNotifications_set(long Swift_peer, boolean value);

    private final native boolean Swift_isBuildComboFooterEnabled(long Swift_peer);

    private final native boolean Swift_isLiveTradeEnabled_4(long Swift_peer, EEvent event);

    private final native boolean Swift_isLiveTradeGloballyEnabled(long Swift_peer);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native void Swift_isLoading_set(long Swift_peer, boolean value);

    private final native boolean Swift_isSectionContentLoading(long Swift_peer);

    private final native boolean Swift_isSectionLoadingMore_7(long Swift_peer, int index);

    private final native boolean Swift_isSectionLoading_6(long Swift_peer, int index);

    private final native Integer Swift_liveBadgeCount(long Swift_peer);

    private final native void Swift_liveBadgeCount_set(long Swift_peer, Integer value);

    private final native List<EEvent> Swift_liveGames_3(long Swift_peer, ELiveSection section);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native List<APIEventTag> Swift_resolvedSubtags_0(long Swift_peer, ELiveSection section);

    private final native int Swift_scrollToTopToken(long Swift_peer);

    private final native void Swift_scrollToTopToken_set(long Swift_peer, int value);

    private final native List<ELiveSection> Swift_sections(long Swift_peer);

    private final native void Swift_sections_set(long Swift_peer, List<ELiveSection> value);

    private final native ELiveSection Swift_selectedSection(long Swift_peer);

    private final native int Swift_selectedSectionIndex(long Swift_peer);

    private final native void Swift_selectedSectionIndex_set(long Swift_peer, int value);

    private final native String Swift_selectedSubtagSlug(long Swift_peer);

    private final native void Swift_selectedSubtagSlug_set(long Swift_peer, String value);

    private final native void Swift_sendInput_11(long Swift_peer, Input input);

    private final native void Swift_setCallbacks_12(long Swift_peer, Callbacks callbacks);

    private final native void Swift_setup_9(long Swift_peer);

    private final native boolean Swift_showBuildComboButtonFooter(long Swift_peer);

    private final native Map<String, Integer> Swift_subtagCounts(long Swift_peer);

    private final native Map<String, Integer> Swift_subtagCounts_5(long Swift_peer, ELiveSection section);

    private final native List<APIEventTag> Swift_subtags(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final List<LiveFeedDisplaySection> displaySections(ELiveSection for_) {
        for_.getClass();
        return Swift_displaySections_2(getSwift_peer(), for_);
    }

    public final USEventCardViewModel eventViewModel(String for_) {
        for_.getClass();
        return Swift_eventViewModel_13(getSwift_peer(), for_);
    }

    public final List<EEvent> events(ELiveSection for_) {
        for_.getClass();
        return Swift_events_1(getSwift_peer(), for_);
    }

    public final List<EEvent> getCurrentLiveGames() {
        return Swift_currentLiveGames(getSwift_peer());
    }

    public final String getDepositButtonText() {
        return Swift_depositButtonText(getSwift_peer());
    }

    public final String getEmptyStateSubtitle() {
        return Swift_emptyStateSubtitle(getSwift_peer());
    }

    public final String getEmptyStateTitle() {
        return Swift_emptyStateTitle(getSwift_peer());
    }

    public final String getErrorRetryButtonTitle() {
        return Swift_errorRetryButtonTitle(getSwift_peer());
    }

    public final String getErrorSubtitle() {
        return Swift_errorSubtitle(getSwift_peer());
    }

    public final String getErrorTitle() {
        return Swift_errorTitle(getSwift_peer());
    }

    public final Map<String, USEventCardViewModel> getEventViewModels() {
        return Swift_eventViewModels(getSwift_peer());
    }

    public final boolean getHasLoadError() {
        return Swift_hasLoadError(getSwift_peer());
    }

    public final boolean getHasSubtags() {
        return Swift_hasSubtags(getSwift_peer());
    }

    public final boolean getHasUnreadNotifications() {
        return Swift_hasUnreadNotifications(getSwift_peer());
    }

    public final Integer getLiveBadgeCount() {
        return Swift_liveBadgeCount(getSwift_peer());
    }

    public final int getScrollToTopToken() {
        return Swift_scrollToTopToken(getSwift_peer());
    }

    public final List<ELiveSection> getSections() {
        return Swift_sections(getSwift_peer());
    }

    public final ELiveSection getSelectedSection() {
        return Swift_selectedSection(getSwift_peer());
    }

    public final int getSelectedSectionIndex() {
        return Swift_selectedSectionIndex(getSwift_peer());
    }

    public final String getSelectedSubtagSlug() {
        return Swift_selectedSubtagSlug(getSwift_peer());
    }

    public final boolean getShowBuildComboButtonFooter() {
        return Swift_showBuildComboButtonFooter(getSwift_peer());
    }

    public final Map<String, Integer> getSubtagCounts() {
        return Swift_subtagCounts(getSwift_peer());
    }

    public final List<APIEventTag> getSubtags() {
        return Swift_subtags(getSwift_peer());
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void handleBecomeForeground() {
        Swift_handleBecomeForeground_10(getSwift_peer());
    }

    public final boolean isBuildComboFooterEnabled() {
        return Swift_isBuildComboFooterEnabled(getSwift_peer());
    }

    public final boolean isLiveTradeEnabled(EEvent for_) {
        for_.getClass();
        return Swift_isLiveTradeEnabled_4(getSwift_peer(), for_);
    }

    public final boolean isLiveTradeGloballyEnabled() {
        return Swift_isLiveTradeGloballyEnabled(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final boolean isSectionContentLoading() {
        return Swift_isSectionContentLoading(getSwift_peer());
    }

    public final boolean isSectionLoading(int at) {
        return Swift_isSectionLoading_6(getSwift_peer(), at);
    }

    public final boolean isSectionLoadingMore(int at) {
        return Swift_isSectionLoadingMore_7(getSwift_peer(), at);
    }

    public final List<EEvent> liveGames(ELiveSection for_) {
        for_.getClass();
        return Swift_liveGames_3(getSwift_peer(), for_);
    }

    public final List<APIEventTag> resolvedSubtags(ELiveSection for_) {
        return Swift_resolvedSubtags_0(getSwift_peer(), for_);
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_11(getSwift_peer(), input);
    }

    public final void setCallbacks(Callbacks callbacks) {
        callbacks.getClass();
        Swift_setCallbacks_12(getSwift_peer(), callbacks);
    }

    public final void setEventViewModels(Map<String, USEventCardViewModel> map) {
        map.getClass();
        Swift_eventViewModels_set(getSwift_peer(), (Map) StructKt.sref$default(map, null, 1, null));
    }

    public final void setHasLoadError(boolean z) {
        Swift_hasLoadError_set(getSwift_peer(), z);
    }

    public final void setHasUnreadNotifications(boolean z) {
        Swift_hasUnreadNotifications_set(getSwift_peer(), z);
    }

    public final void setLiveBadgeCount(Integer num) {
        Swift_liveBadgeCount_set(getSwift_peer(), num);
    }

    public final void setLoading(boolean z) {
        Swift_isLoading_set(getSwift_peer(), z);
    }

    public final void setScrollToTopToken(int i) {
        Swift_scrollToTopToken_set(getSwift_peer(), i);
    }

    public final void setSections(List<ELiveSection> list) {
        list.getClass();
        Swift_sections_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setSelectedSectionIndex(int i) {
        Swift_selectedSectionIndex_set(getSwift_peer(), i);
    }

    public final void setSelectedSubtagSlug(String str) {
        Swift_selectedSubtagSlug_set(getSwift_peer(), str);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_9(getSwift_peer());
    }

    public final Map<String, Integer> subtagCounts(ELiveSection for_) {
        return Swift_subtagCounts_5(getSwift_peer(), for_);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001d2\u00020\u0001:\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001dB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\f\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnSectionSelectedCase", "OnSubtagToggledCase", "OnPullToRefreshCase", "OnRetryCase", "OnNearBottomCase", "OnDepositCase", "OnLiveTabTappedCase", "OnNotificationsCase", "OnOpenURLCase", "OnContactSupportCase", "OnBuildComboButtonFooterButtonPressedCase", "Companion", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input$OnBuildComboButtonFooterButtonPressedCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input$OnContactSupportCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input$OnDepositCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input$OnLiveTabTappedCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input$OnNearBottomCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input$OnNotificationsCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input$OnOpenURLCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input$OnPullToRefreshCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input$OnSectionSelectedCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input$OnSubtagToggledCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input$OnViewDidLoadCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onPullToRefresh = new OnPullToRefreshCase();
        private static final Input onRetry = new OnRetryCase();
        private static final Input onNearBottom = new OnNearBottomCase();
        private static final Input onDeposit = new OnDepositCase();
        private static final Input onLiveTabTapped = new OnLiveTabTappedCase();
        private static final Input onNotifications = new OnNotificationsCase();
        private static final Input onContactSupport = new OnContactSupportCase();
        private static final Input onBuildComboButtonFooterButtonPressed = new OnBuildComboButtonFooterButtonPressedCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input$OnBuildComboButtonFooterButtonPressedCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnBuildComboButtonFooterButtonPressedCase extends Input {
            public OnBuildComboButtonFooterButtonPressedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input$OnContactSupportCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnContactSupportCase extends Input {
            public OnContactSupportCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input$OnDepositCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDepositCase extends Input {
            public OnDepositCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input$OnLiveTabTappedCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnLiveTabTappedCase extends Input {
            public OnLiveTabTappedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input$OnNearBottomCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnNearBottomCase extends Input {
            public OnNearBottomCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input$OnNotificationsCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnNotificationsCase extends Input {
            public OnNotificationsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input$OnOpenURLCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input;", "associated0", "Ljava/net/URI;", "<init>", "(Ljava/net/URI;)V", "getAssociated0", "()Ljava/net/URI;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnOpenURLCase extends Input {
            private final URI associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnOpenURLCase(URI uri) {
                super(null);
                uri.getClass();
                this.associated0 = uri;
            }

            public final URI getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input$OnPullToRefreshCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPullToRefreshCase extends Input {
            public OnPullToRefreshCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRetryCase extends Input {
            public OnRetryCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input$OnSectionSelectedCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input;", "associated0", "", "<init>", "(I)V", "getAssociated0", "()I", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSectionSelectedCase extends Input {
            private final int associated0;

            public OnSectionSelectedCase(int i) {
                super(null);
                this.associated0 = i;
            }

            public final int getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input$OnSubtagToggledCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSubtagToggledCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSubtagToggledCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        public static final /* synthetic */ Input access$getOnBuildComboButtonFooterButtonPressed$cp() {
            return onBuildComboButtonFooterButtonPressed;
        }

        public static final /* synthetic */ Input access$getOnContactSupport$cp() {
            return onContactSupport;
        }

        public static final /* synthetic */ Input access$getOnDeposit$cp() {
            return onDeposit;
        }

        public static final /* synthetic */ Input access$getOnLiveTabTapped$cp() {
            return onLiveTabTapped;
        }

        public static final /* synthetic */ Input access$getOnNearBottom$cp() {
            return onNearBottom;
        }

        public static final /* synthetic */ Input access$getOnNotifications$cp() {
            return onNotifications;
        }

        public static final /* synthetic */ Input access$getOnPullToRefresh$cp() {
            return onPullToRefresh;
        }

        public static final /* synthetic */ Input access$getOnRetry$cp() {
            return onRetry;
        }

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
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\fJ\u000e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0007R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0007R\u0011\u0010\u001d\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/USLiveTabViewModel$Input;", "onSectionSelected", "associated0", "", "onSubtagToggled", "", "onPullToRefresh", "getOnPullToRefresh", "onRetry", "getOnRetry", "onNearBottom", "getOnNearBottom", "onDeposit", "getOnDeposit", "onLiveTabTapped", "getOnLiveTabTapped", "onNotifications", "getOnNotifications", "onOpenURL", "Ljava/net/URI;", "onContactSupport", "getOnContactSupport", "onBuildComboButtonFooterButtonPressed", "getOnBuildComboButtonFooterButtonPressed", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnBuildComboButtonFooterButtonPressed() {
                return Input.access$getOnBuildComboButtonFooterButtonPressed$cp();
            }

            public final Input getOnContactSupport() {
                return Input.access$getOnContactSupport$cp();
            }

            public final Input getOnDeposit() {
                return Input.access$getOnDeposit$cp();
            }

            public final Input getOnLiveTabTapped() {
                return Input.access$getOnLiveTabTapped$cp();
            }

            public final Input getOnNearBottom() {
                return Input.access$getOnNearBottom$cp();
            }

            public final Input getOnNotifications() {
                return Input.access$getOnNotifications$cp();
            }

            public final Input getOnPullToRefresh() {
                return Input.access$getOnPullToRefresh$cp();
            }

            public final Input getOnRetry() {
                return Input.access$getOnRetry$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input onOpenURL(URI associated0) {
                associated0.getClass();
                return new OnOpenURLCase(associated0);
            }

            public final Input onSectionSelected(int associated0) {
                return new OnSectionSelectedCase(associated0);
            }

            public final Input onSubtagToggled(String associated0) {
                associated0.getClass();
                return new OnSubtagToggledCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e2\u00020\u0001:\u0005\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTabViewModel$PageStatus;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "IdleCase", "LoadingCase", "LoadedCase", "LoadingMoreCase", "Companion", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$PageStatus$IdleCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$PageStatus$LoadedCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$PageStatus$LoadingCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$PageStatus$LoadingMoreCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class PageStatus implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final PageStatus idle = new IdleCase();
        private static final PageStatus loading = new LoadingCase();
        private static final PageStatus loadingMore = new LoadingMoreCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTabViewModel$PageStatus$IdleCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$PageStatus;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class IdleCase extends PageStatus {
            public IdleCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTabViewModel$PageStatus$LoadedCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$PageStatus;", "associated0", "Ljava/util/Date;", "<init>", "(Ljava/util/Date;)V", "getAssociated0", "()Ljava/util/Date;", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class LoadedCase extends PageStatus {
            private final Date associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoadedCase(Date date) {
                super(null);
                date.getClass();
                this.associated0 = date;
            }

            public boolean equals(Object other) {
                if (!(other instanceof LoadedCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((LoadedCase) other).associated0);
            }

            public final Date getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTabViewModel$PageStatus$LoadingCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$PageStatus;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class LoadingCase extends PageStatus {
            public LoadingCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTabViewModel$PageStatus$LoadingMoreCase;", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$PageStatus;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class LoadingMoreCase extends PageStatus {
            public LoadingMoreCase() {
                super(null);
            }
        }

        public /* synthetic */ PageStatus(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ PageStatus access$getIdle$cp() {
            return idle;
        }

        public static final /* synthetic */ PageStatus access$getLoading$cp() {
            return loading;
        }

        public static final /* synthetic */ PageStatus access$getLoadingMore$cp() {
            return loadingMore;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTabViewModel$PageStatus$Companion;", "", "<init>", "()V", "idle", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$PageStatus;", "getIdle", "()Lcom/polymarket/usviewmodels/USLiveTabViewModel$PageStatus;", "loading", "getLoading", MetricTracker.Action.LOADED, "associated0", "Ljava/util/Date;", "loadingMore", "getLoadingMore", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final PageStatus getIdle() {
                return PageStatus.access$getIdle$cp();
            }

            public final PageStatus getLoading() {
                return PageStatus.access$getLoading$cp();
            }

            public final PageStatus getLoadingMore() {
                return PageStatus.access$getLoadingMore$cp();
            }

            public final PageStatus loaded(Date associated0) {
                associated0.getClass();
                return new LoadedCase(associated0);
            }

            private Companion() {
            }
        }

        private PageStatus() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0082 J\u0006\u0010\u000b\u001a\u00020\fJ\t\u0010\r\u001a\u00020\fH\u0082 ¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTabViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_8", "", "Lskip/bridge/SwiftObjectPointer;", "callbacks", "Lcom/polymarket/usviewmodels/USLiveTabViewModel$Callbacks;", "notificationsFeedVM", "Lcom/polymarket/usviewmodels/NotificationsFeedViewModel;", "mock", "Lcom/polymarket/usviewmodels/USLiveTabViewModel;", "Swift_Companion_mock_14", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_8(Callbacks callbacks, NotificationsFeedViewModel notificationsFeedVM);

        private final native USLiveTabViewModel Swift_Companion_mock_14();

        public static final /* synthetic */ long access$Swift_Companion_constructor_8(Companion companion, Callbacks callbacks, NotificationsFeedViewModel notificationsFeedViewModel) {
            return companion.Swift_Companion_constructor_8(callbacks, notificationsFeedViewModel);
        }

        public final USLiveTabViewModel mock() {
            return Swift_Companion_mock_14();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB)\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\b\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u0015\u0010\u0017\u001a\u00020\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0015\u0010 \u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\"\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J-\u0010&\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082 J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001b0(2\u0006\u0010)\u001a\u00020\u001dH\u0016J\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0(2\u0006\u0010)\u001a\u00020\u001dH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006,"}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTabViewModel$LiveFeedDisplaySection;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, RadarTrackingOptions.RadarTrackingOptionsSync.EVENTS_STR, "", "Lcom/polymarket/data/EEvent;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getTitle", "Swift_title", "getEvents", "()Ljava/util/List;", "Swift_events", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class LiveFeedDisplaySection implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public LiveFeedDisplaySection(String str, String str2, List<EEvent> list) {
            str.getClass();
            list.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, list);
        }

        private final native long Swift_constructor_0(String id, String title, List<EEvent> events);

        private final native List<EEvent> Swift_events(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

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

        public final List<EEvent> getEvents() {
            return Swift_events(this.Swift_peer);
        }

        public final String getId() {
            return Swift_id(this.Swift_peer);
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

        public LiveFeedDisplaySection(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USLiveTabViewModel(Callbacks callbacks, NotificationsFeedViewModel notificationsFeedViewModel) {
        super(Companion.access$Swift_Companion_constructor_8(INSTANCE, callbacks, notificationsFeedViewModel), (SwiftPeerMarker) null);
        callbacks.getClass();
    }

    public USLiveTabViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001<B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u008f\u0001\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u0013\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\u0013¢\u0006\u0004\b\b\u0010\u0018J\u0006\u0010\u001d\u001a\u00020\u000eJ\u0015\u0010\u001e\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\u0015\u0010'\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u00100\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u00105\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0083\u0001\u00108\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\u0013H\u0082 J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020\"0\r2\u0006\u0010:\u001a\u00020$H\u0016J\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\"0\r2\u0006\u0010:\u001a\u00020$H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b-\u0010)R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b/\u0010)R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u00138F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b4\u0010)R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\u00138F¢\u0006\u0006\u001a\u0004\b6\u00102¨\u0006="}, d2 = {"Lcom/polymarket/usviewmodels/USLiveTabViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "sportsEventCallbacks", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Callbacks;", "onDeposit", "Lkotlin/Function0;", "", "onReferFriends", "onNavigateToProfile", "onNotifications", "onOpenURL", "Lkotlin/Function1;", "Ljava/net/URI;", "onContactSupport", "onBuildCombosCategorySelected", "Lcom/polymarket/data/APIEventTag;", "(Lcom/polymarket/usviewmodels/USEventCardViewModel$Callbacks;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getSportsEventCallbacks", "()Lcom/polymarket/usviewmodels/USEventCardViewModel$Callbacks;", "Swift_sportsEventCallbacks", "getOnDeposit", "()Lkotlin/jvm/functions/Function0;", "Swift_onDeposit", "getOnReferFriends", "Swift_onReferFriends", "getOnNavigateToProfile", "Swift_onNavigateToProfile", "getOnNotifications", "Swift_onNotifications", "getOnOpenURL", "()Lkotlin/jvm/functions/Function1;", "Swift_onOpenURL", "getOnContactSupport", "Swift_onContactSupport", "getOnBuildCombosCategorySelected", "Swift_onBuildCombosCategorySelected", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Callbacks(USEventCardViewModel.Callbacks callbacks, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function1 function1, Function0 function05, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(callbacks, r1, r2, r3, r4, r5, r6, r23);
            Function0 function06;
            Function0 function07;
            Function0 function08;
            Function0 function09;
            Function1 function13;
            Function0 function010;
            Function1 function14;
            callbacks = (i & 1) != 0 ? new USEventCardViewModel.Callbacks(null, null, null, null, null, null, null, null, null, 511, null) : callbacks;
            if ((i & 2) != 0) {
                function06 = new hoj(1);
            } else {
                function06 = function0;
            }
            if ((i & 4) != 0) {
                function07 = new hoj(2);
            } else {
                function07 = function02;
            }
            if ((i & 8) != 0) {
                function08 = new hoj(3);
            } else {
                function08 = function03;
            }
            if ((i & 16) != 0) {
                function09 = new hoj(4);
            } else {
                function09 = function04;
            }
            if ((i & 32) != 0) {
                function13 = new wmj(12);
            } else {
                function13 = function1;
            }
            if ((i & 64) != 0) {
                function010 = new hoj(5);
            } else {
                function010 = function05;
            }
            if ((i & 128) != 0) {
                function14 = new wmj(13);
            } else {
                function14 = function12;
            }
        }

        private final native long Swift_constructor_0(USEventCardViewModel.Callbacks sportsEventCallbacks, Function0<Unit> onDeposit, Function0<Unit> onReferFriends, Function0<Unit> onNavigateToProfile, Function0<Unit> onNotifications, Function1<? super URI, Unit> onOpenURL, Function0<Unit> onContactSupport, Function1<? super APIEventTag, Unit> onBuildCombosCategorySelected);

        private final native Function1<APIEventTag, Unit> Swift_onBuildCombosCategorySelected(long Swift_peer);

        private final native Function0<Unit> Swift_onContactSupport(long Swift_peer);

        private final native Function0<Unit> Swift_onDeposit(long Swift_peer);

        private final native Function0<Unit> Swift_onNavigateToProfile(long Swift_peer);

        private final native Function0<Unit> Swift_onNotifications(long Swift_peer);

        private final native Function1<URI, Unit> Swift_onOpenURL(long Swift_peer);

        private final native Function0<Unit> Swift_onReferFriends(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native USEventCardViewModel.Callbacks Swift_sportsEventCallbacks(long Swift_peer);

        private static final Unit _init_$lambda$0() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$3() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$4(URI uri) {
            uri.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$5() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$6(APIEventTag aPIEventTag) {
            aPIEventTag.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(URI uri) {
            return _init_$lambda$4(uri);
        }

        public static /* synthetic */ Unit b() {
            return _init_$lambda$5();
        }

        public static /* synthetic */ Unit c() {
            return _init_$lambda$0();
        }

        public static /* synthetic */ Unit d() {
            return _init_$lambda$1();
        }

        public static /* synthetic */ Unit e() {
            return _init_$lambda$3();
        }

        public static /* synthetic */ Unit f() {
            return _init_$lambda$2();
        }

        public static /* synthetic */ Unit g(APIEventTag aPIEventTag) {
            return _init_$lambda$6(aPIEventTag);
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

        public final Function1<APIEventTag, Unit> getOnBuildCombosCategorySelected() {
            return Swift_onBuildCombosCategorySelected(this.Swift_peer);
        }

        public final Function0<Unit> getOnContactSupport() {
            return Swift_onContactSupport(this.Swift_peer);
        }

        public final Function0<Unit> getOnDeposit() {
            return Swift_onDeposit(this.Swift_peer);
        }

        public final Function0<Unit> getOnNavigateToProfile() {
            return Swift_onNavigateToProfile(this.Swift_peer);
        }

        public final Function0<Unit> getOnNotifications() {
            return Swift_onNotifications(this.Swift_peer);
        }

        public final Function1<URI, Unit> getOnOpenURL() {
            return Swift_onOpenURL(this.Swift_peer);
        }

        public final Function0<Unit> getOnReferFriends() {
            return Swift_onReferFriends(this.Swift_peer);
        }

        public final USEventCardViewModel.Callbacks getSportsEventCallbacks() {
            return Swift_sportsEventCallbacks(this.Swift_peer);
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

        public Callbacks(USEventCardViewModel.Callbacks callbacks, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function1<? super URI, Unit> function1, Function0<Unit> function05, Function1<? super APIEventTag, Unit> function12) {
            callbacks.getClass();
            function0.getClass();
            function02.getClass();
            function03.getClass();
            function04.getClass();
            function1.getClass();
            function05.getClass();
            function12.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(callbacks, function0, function02, function03, function04, function1, function05, function12);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
