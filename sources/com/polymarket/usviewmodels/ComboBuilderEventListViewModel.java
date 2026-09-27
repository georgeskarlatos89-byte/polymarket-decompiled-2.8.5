package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.clients.ClientExperimentKey;
import com.polymarket.data.APIEventTag;
import com.polymarket.data.EEvent;
import com.polymarket.data.ELiveSection;
import com.polymarket.usviewmodels.AppViewModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0007\u0018\u0000 ¨\u00012\u00020\u0001:\f£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001f\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010\u0017\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082 J\u0015\u0010 \u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010!\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0019\u001a\u00020\u001aH\u0082 J\u0017\u0010'\u001a\u0004\u0018\u00010\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010(\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0082 J!\u00100\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020*0)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J)\u00101\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020*0)H\u0082 J\u0015\u00107\u001a\u0002022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u00108\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0019\u001a\u000202H\u0082 J\u0015\u0010<\u001a\u0002022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010=\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0019\u001a\u000202H\u0082 J!\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010C\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010F\u001a\u0002022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010K\u001a\u0004\u0018\u00010H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010O\u001a\b\u0012\u0004\u0012\u00020M0\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010R\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010U\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010X\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010\\\u001a\u0004\u0018\u00010\u00102\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010`\u001a\b\u0012\u0004\u0012\u00020^0\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010c\u001a\u0002022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010d\u001a\b\u0012\u0004\u0012\u00020^0\u000f2\b\u0010e\u001a\u0004\u0018\u00010\u0010J%\u0010f\u001a\b\u0012\u0004\u0012\u00020^0\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010g\u001a\u0004\u0018\u00010\u0010H\u0082 J\u0014\u0010h\u001a\b\u0012\u0004\u0012\u00020i0\u000f2\u0006\u0010e\u001a\u00020\u0010J#\u0010j\u001a\b\u0012\u0004\u0012\u00020i0\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010g\u001a\u00020\u0010H\u0082 J\u0014\u0010k\u001a\b\u0012\u0004\u0012\u00020l0\u000f2\u0006\u0010e\u001a\u00020\u0010J#\u0010m\u001a\b\u0012\u0004\u0012\u00020l0\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010g\u001a\u00020\u0010H\u0082 J\u0010\u0010n\u001a\u0004\u0018\u00010o2\u0006\u0010e\u001a\u00020\u0010J\u001f\u0010p\u001a\u0004\u0018\u00010o2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010g\u001a\u00020\u0010H\u0082 J\u0016\u0010q\u001a\n\u0012\u0004\u0012\u00020r\u0018\u00010\u000f2\u0006\u0010e\u001a\u00020\u0010J%\u0010s\u001a\n\u0012\u0004\u0012\u00020r\u0018\u00010\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010g\u001a\u00020\u0010H\u0082 J\u000e\u0010t\u001a\u0002022\u0006\u0010e\u001a\u00020\u0010J\u001d\u0010u\u001a\u0002022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010g\u001a\u00020\u0010H\u0082 J\u0015\u0010x\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010{\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001c\u0010|\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001a0)2\b\u0010e\u001a\u0004\u0018\u00010\u0010J+\u0010}\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001a0)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010g\u001a\u0004\u0018\u00010\u0010H\u0082 J\u0015\u0010\u007f\u001a\u0002022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0010\u0010\u0080\u0001\u001a\u0002022\u0007\u0010\u0081\u0001\u001a\u00020\u001aJ\u001f\u0010\u0082\u0001\u001a\u0002022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\u0083\u0001\u001a\u00020\u001aH\u0082 J\u0010\u0010\u0084\u0001\u001a\u0002022\u0007\u0010\u0081\u0001\u001a\u00020\u001aJ\u001f\u0010\u0085\u0001\u001a\u0002022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\u0083\u0001\u001a\u00020\u001aH\u0082 J\u0010\u0010\u0086\u0001\u001a\u0002022\u0007\u0010\u0081\u0001\u001a\u00020\u001aJ\u001f\u0010\u0087\u0001\u001a\u0002022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\u0083\u0001\u001a\u00020\u001aH\u0082 J\t\u0010\u0088\u0001\u001a\u00020\u0018H\u0016J\u0016\u0010\u0089\u0001\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\t\u0010\u008a\u0001\u001a\u00020\u0018H\u0016J\u0016\u0010\u008b\u0001\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0011\u0010\u008c\u0001\u001a\u00020\u00182\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001J \u0010\u008f\u0001\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0082 J\u000f\u0010\u0090\u0001\u001a\u00020\f2\u0006\u0010e\u001a\u00020\u0010J\u001e\u0010\u0091\u0001\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010g\u001a\u00020\u0010H\u0082 J\u0018\u0010\u0092\u0001\u001a\u00020\u00182\u000f\u0010\u0093\u0001\u001a\n\u0012\u0005\u0012\u00030\u0095\u00010\u0094\u0001J'\u0010\u0096\u0001\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u000f\u0010\u0093\u0001\u001a\n\u0012\u0005\u0012\u00030\u0095\u00010\u0094\u0001H\u0082 J\u0011\u0010\u0097\u0001\u001a\u0004\u0018\u00010*2\u0006\u0010e\u001a\u00020\fJ!\u0010\u0098\u0001\u001a\u0004\u0018\u00010*2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\u0099\u0001\u001a\u00020\fH\u0082 J\u001b\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u00020*0\u000f2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020i0\u000fJ*\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020*0\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010h\u001a\b\u0012\u0004\u0012\u00020i0\u000fH\u0082 J\u0007\u0010\u009c\u0001\u001a\u00020\u0018J\u0016\u0010\u009d\u0001\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001a\u0010\u009e\u0001\u001a\n\u0012\u0005\u0012\u00030 \u00010\u009f\u00012\u0007\u0010¡\u0001\u001a\u00020\u001aH\u0016J\u001b\u0010¢\u0001\u001a\n\u0012\u0005\u0012\u00030 \u00010\u009f\u00012\u0007\u0010¡\u0001\u001a\u00020\u001aH\u0082 R0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010\"\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R<\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020*0)2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020*0)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00103\u001a\u0002022\u0006\u0010\u000e\u001a\u0002028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00109\u001a\u0002022\u0006\u0010\u000e\u001a\u0002028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u00104\"\u0004\b;\u00106R\u001d\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0)8F¢\u0006\u0006\u001a\u0004\b?\u0010-R\u0011\u0010A\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bB\u0010\u001dR\u0011\u0010D\u001a\u0002028F¢\u0006\u0006\u001a\u0004\bE\u00104R\u0013\u0010G\u001a\u0004\u0018\u00010H8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010\u0013R\u0011\u0010P\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bQ\u0010$R\u0011\u0010S\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bT\u0010$R\u0011\u0010V\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bW\u0010$R\u0013\u0010Y\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0017\u0010]\u001a\b\u0012\u0004\u0012\u00020^0\u000f8F¢\u0006\u0006\u001a\u0004\b_\u0010\u0013R\u0011\u0010a\u001a\u0002028F¢\u0006\u0006\u001a\u0004\bb\u00104R\u0011\u0010v\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bw\u0010$R\u0011\u0010y\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bz\u0010$R\u0011\u0010~\u001a\u0002028F¢\u0006\u0006\u001a\u0004\b~\u00104¨\u0006©\u0001"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "(Lcom/polymarket/usviewmodels/AppSceneType;Ljava/lang/String;)V", "newValue", "", "Lcom/polymarket/data/ELiveSection;", "sections", "getSections", "()Ljava/util/List;", "setSections", "(Ljava/util/List;)V", "Swift_sections", "Swift_sections_set", "", "value", "", "selectedSectionIndex", "getSelectedSectionIndex", "()I", "setSelectedSectionIndex", "(I)V", "Swift_selectedSectionIndex", "Swift_selectedSectionIndex_set", "selectedSubtagSlug", "getSelectedSubtagSlug", "()Ljava/lang/String;", "setSelectedSubtagSlug", "(Ljava/lang/String;)V", "Swift_selectedSubtagSlug", "Swift_selectedSubtagSlug_set", "", "Lcom/polymarket/usviewmodels/USEventCardViewModel;", "eventViewModels", "getEventViewModels", "()Ljava/util/Map;", "setEventViewModels", "(Ljava/util/Map;)V", "Swift_eventViewModels", "Swift_eventViewModels_set", "", "isLoading", "()Z", "setLoading", "(Z)V", "Swift_isLoading", "Swift_isLoading_set", "hasLoadError", "getHasLoadError", "setHasLoadError", "Swift_hasLoadError", "Swift_hasLoadError_set", "propPillSelectionByKey", "getPropPillSelectionByKey", "Swift_propPillSelectionByKey", "propGridRevision", "getPropGridRevision", "Swift_propGridRevision", "popularPropsRailEnabled", "getPopularPropsRailEnabled", "Swift_popularPropsRailEnabled", "popularPropsRailStyle", "Lcom/polymarket/usviewmodels/ComboPopularPropsRailStyle;", "getPopularPropsRailStyle", "()Lcom/polymarket/usviewmodels/ComboPopularPropsRailStyle;", "Swift_popularPropsRailStyle", "activeExperiments", "Lcom/polymarket/clients/ClientExperimentKey;", "getActiveExperiments", "Swift_activeExperiments", "errorTitle", "getErrorTitle", "Swift_errorTitle", "errorSubtitle", "getErrorSubtitle", "Swift_errorSubtitle", "errorRetryButtonTitle", "getErrorRetryButtonTitle", "Swift_errorRetryButtonTitle", "selectedSection", "getSelectedSection", "()Lcom/polymarket/data/ELiveSection;", "Swift_selectedSection", "subtags", "Lcom/polymarket/data/APIEventTag;", "getSubtags", "Swift_subtags", "hasSubtags", "getHasSubtags", "Swift_hasSubtags", "resolvedSubtags", "for_", "Swift_resolvedSubtags_0", "section", RadarTrackingOptions.RadarTrackingOptionsSync.EVENTS_STR, "Lcom/polymarket/data/EEvent;", "Swift_events_1", "displaySections", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$DisplaySection;", "Swift_displaySections_2", "propPillBar", "Lcom/polymarket/usviewmodels/PlayerPropsPillBarPresentation;", "Swift_propPillBar_3", "propCards", "Lcom/polymarket/usviewmodels/ComboPopularPropPresentation;", "Swift_propCards_4", "showsPropGridSkeleton", "Swift_showsPropGridSkeleton_5", "emptyStateTitle", "getEmptyStateTitle", "Swift_emptyStateTitle", "emptyStateSubtitle", "getEmptyStateSubtitle", "Swift_emptyStateSubtitle", "subtagCounts", "Swift_subtagCounts_6", "isSectionContentLoading", "Swift_isSectionContentLoading", "hasSectionStartedLoadingBefore", "at", "Swift_hasSectionStartedLoadingBefore_7", "index", "isSectionLoading", "Swift_isSectionLoading_8", "isSectionLoadingMore", "Swift_isSectionLoadingMore_9", "setup", "Swift_setup_11", "handleBecomeForeground", "Swift_handleBecomeForeground_12", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input;", "Swift_sendInput_13", "sectionTitle", "Swift_sectionTitle_14", "applySelectedMarketSides", "keys", "", "Lcom/polymarket/usviewmodels/MarketSideKey;", "Swift_applySelectedMarketSides_15", "eventViewModel", "Swift_eventViewModel_16", "eventId", "searchResultViewModels", "Swift_searchResultViewModels_17", "clearSearchResults", "Swift_clearSearchResults_18", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Callbacks", "PageStatus", "PageState", "DisplaySection", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComboBuilderEventListViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String gamesPropPillID = "games";

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
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

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$PageState;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    public /* synthetic */ ComboBuilderEventListViewModel(AppSceneType appSceneType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AppSceneDefault() : appSceneType, (i & 2) != 0 ? null : str);
    }

    private final native List<ClientExperimentKey> Swift_activeExperiments(long Swift_peer);

    private final native void Swift_applySelectedMarketSides_15(long Swift_peer, Set<MarketSideKey> keys);

    private final native void Swift_clearSearchResults_18(long Swift_peer);

    private final native List<DisplaySection> Swift_displaySections_2(long Swift_peer, ELiveSection section);

    private final native String Swift_emptyStateSubtitle(long Swift_peer);

    private final native String Swift_emptyStateTitle(long Swift_peer);

    private final native String Swift_errorRetryButtonTitle(long Swift_peer);

    private final native String Swift_errorSubtitle(long Swift_peer);

    private final native String Swift_errorTitle(long Swift_peer);

    private final native USEventCardViewModel Swift_eventViewModel_16(long Swift_peer, String eventId);

    private final native Map<String, USEventCardViewModel> Swift_eventViewModels(long Swift_peer);

    private final native void Swift_eventViewModels_set(long Swift_peer, Map<String, USEventCardViewModel> value);

    private final native List<EEvent> Swift_events_1(long Swift_peer, ELiveSection section);

    private final native void Swift_handleBecomeForeground_12(long Swift_peer);

    private final native boolean Swift_hasLoadError(long Swift_peer);

    private final native void Swift_hasLoadError_set(long Swift_peer, boolean value);

    private final native boolean Swift_hasSectionStartedLoadingBefore_7(long Swift_peer, int index);

    private final native boolean Swift_hasSubtags(long Swift_peer);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native void Swift_isLoading_set(long Swift_peer, boolean value);

    private final native boolean Swift_isSectionContentLoading(long Swift_peer);

    private final native boolean Swift_isSectionLoadingMore_9(long Swift_peer, int index);

    private final native boolean Swift_isSectionLoading_8(long Swift_peer, int index);

    private final native boolean Swift_popularPropsRailEnabled(long Swift_peer);

    private final native ComboPopularPropsRailStyle Swift_popularPropsRailStyle(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native List<ComboPopularPropPresentation> Swift_propCards_4(long Swift_peer, ELiveSection section);

    private final native int Swift_propGridRevision(long Swift_peer);

    private final native PlayerPropsPillBarPresentation Swift_propPillBar_3(long Swift_peer, ELiveSection section);

    private final native Map<String, String> Swift_propPillSelectionByKey(long Swift_peer);

    private final native List<APIEventTag> Swift_resolvedSubtags_0(long Swift_peer, ELiveSection section);

    private final native List<USEventCardViewModel> Swift_searchResultViewModels_17(long Swift_peer, List<EEvent> events);

    private final native String Swift_sectionTitle_14(long Swift_peer, ELiveSection section);

    private final native List<ELiveSection> Swift_sections(long Swift_peer);

    private final native void Swift_sections_set(long Swift_peer, List<ELiveSection> value);

    private final native ELiveSection Swift_selectedSection(long Swift_peer);

    private final native int Swift_selectedSectionIndex(long Swift_peer);

    private final native void Swift_selectedSectionIndex_set(long Swift_peer, int value);

    private final native String Swift_selectedSubtagSlug(long Swift_peer);

    private final native void Swift_selectedSubtagSlug_set(long Swift_peer, String value);

    private final native void Swift_sendInput_13(long Swift_peer, Input input);

    private final native void Swift_setup_11(long Swift_peer);

    private final native boolean Swift_showsPropGridSkeleton_5(long Swift_peer, ELiveSection section);

    private final native Map<String, Integer> Swift_subtagCounts_6(long Swift_peer, ELiveSection section);

    private final native List<APIEventTag> Swift_subtags(long Swift_peer);

    public static final /* synthetic */ String access$getGamesPropPillID$cp() {
        return gamesPropPillID;
    }

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final void applySelectedMarketSides(Set<MarketSideKey> keys) {
        keys.getClass();
        Swift_applySelectedMarketSides_15(getSwift_peer(), keys);
    }

    public final void clearSearchResults() {
        Swift_clearSearchResults_18(getSwift_peer());
    }

    public final List<DisplaySection> displaySections(ELiveSection for_) {
        for_.getClass();
        return Swift_displaySections_2(getSwift_peer(), for_);
    }

    public final USEventCardViewModel eventViewModel(String for_) {
        for_.getClass();
        return Swift_eventViewModel_16(getSwift_peer(), for_);
    }

    public final List<EEvent> events(ELiveSection for_) {
        for_.getClass();
        return Swift_events_1(getSwift_peer(), for_);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public List<ClientExperimentKey> getActiveExperiments() {
        return Swift_activeExperiments(getSwift_peer());
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

    public final boolean getPopularPropsRailEnabled() {
        return Swift_popularPropsRailEnabled(getSwift_peer());
    }

    public final ComboPopularPropsRailStyle getPopularPropsRailStyle() {
        return Swift_popularPropsRailStyle(getSwift_peer());
    }

    public final int getPropGridRevision() {
        return Swift_propGridRevision(getSwift_peer());
    }

    public final Map<String, String> getPropPillSelectionByKey() {
        return Swift_propPillSelectionByKey(getSwift_peer());
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

    public final List<APIEventTag> getSubtags() {
        return Swift_subtags(getSwift_peer());
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void handleBecomeForeground() {
        Swift_handleBecomeForeground_12(getSwift_peer());
    }

    public final boolean hasSectionStartedLoadingBefore(int at) {
        return Swift_hasSectionStartedLoadingBefore_7(getSwift_peer(), at);
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final boolean isSectionContentLoading() {
        return Swift_isSectionContentLoading(getSwift_peer());
    }

    public final boolean isSectionLoading(int at) {
        return Swift_isSectionLoading_8(getSwift_peer(), at);
    }

    public final boolean isSectionLoadingMore(int at) {
        return Swift_isSectionLoadingMore_9(getSwift_peer(), at);
    }

    public final List<ComboPopularPropPresentation> propCards(ELiveSection for_) {
        for_.getClass();
        return Swift_propCards_4(getSwift_peer(), for_);
    }

    public final PlayerPropsPillBarPresentation propPillBar(ELiveSection for_) {
        for_.getClass();
        return Swift_propPillBar_3(getSwift_peer(), for_);
    }

    public final List<APIEventTag> resolvedSubtags(ELiveSection for_) {
        return Swift_resolvedSubtags_0(getSwift_peer(), for_);
    }

    public final List<USEventCardViewModel> searchResultViewModels(List<EEvent> for_) {
        for_.getClass();
        return Swift_searchResultViewModels_17(getSwift_peer(), for_);
    }

    public final String sectionTitle(ELiveSection for_) {
        for_.getClass();
        return Swift_sectionTitle_14(getSwift_peer(), for_);
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_13(getSwift_peer(), input);
    }

    public final void setEventViewModels(Map<String, USEventCardViewModel> map) {
        map.getClass();
        Swift_eventViewModels_set(getSwift_peer(), (Map) StructKt.sref$default(map, null, 1, null));
    }

    public final void setHasLoadError(boolean z) {
        Swift_hasLoadError_set(getSwift_peer(), z);
    }

    public final void setLoading(boolean z) {
        Swift_isLoading_set(getSwift_peer(), z);
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
        Swift_setup_11(getSwift_peer());
    }

    public final boolean showsPropGridSkeleton(ELiveSection for_) {
        for_.getClass();
        return Swift_showsPropGridSkeleton_5(getSwift_peer(), for_);
    }

    public final Map<String, Integer> subtagCounts(ELiveSection for_) {
        return Swift_subtagCounts_6(getSwift_peer(), for_);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001b2\u00020\u0001:\u000b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\n\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnSectionSelectedCase", "OnSubtagToggledCase", "OnPullToRefreshCase", "OnRetryCase", "OnNearBottomCase", "OnEventWillDisplayCase", "OnPropPillSelectedCase", "OnPropCardSideSelectedCase", "OnPropCardSelectedCase", "Companion", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input$OnEventWillDisplayCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input$OnNearBottomCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input$OnPropCardSelectedCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input$OnPropCardSideSelectedCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input$OnPropPillSelectedCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input$OnPullToRefreshCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input$OnSectionSelectedCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input$OnSubtagToggledCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input$OnViewDidLoadCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onPullToRefresh = new OnPullToRefreshCase();
        private static final Input onRetry = new OnRetryCase();
        private static final Input onNearBottom = new OnNearBottomCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input$OnEventWillDisplayCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnEventWillDisplayCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnEventWillDisplayCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input$OnNearBottomCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnNearBottomCase extends Input {
            public OnNearBottomCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input$OnPropCardSelectedCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input;", "associated0", "", "associated1", "", "<init>", "(Ljava/lang/String;Z)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", "()Z", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPropCardSelectedCase extends Input {
            private final String associated0;
            private final boolean associated1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnPropCardSelectedCase(String str, boolean z) {
                super(null);
                str.getClass();
                this.associated0 = str;
                this.associated1 = z;
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public final boolean getAssociated1() {
                return this.associated1;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input$OnPropCardSideSelectedCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input;", "associated0", "", "associated1", "", "<init>", "(Ljava/lang/String;Z)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", "()Z", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPropCardSideSelectedCase extends Input {
            private final String associated0;
            private final boolean associated1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnPropCardSideSelectedCase(String str, boolean z) {
                super(null);
                str.getClass();
                this.associated0 = str;
                this.associated1 = z;
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public final boolean getAssociated1() {
                return this.associated1;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input$OnPropPillSelectedCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPropPillSelectedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnPropPillSelectedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input$OnPullToRefreshCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPullToRefreshCase extends Input {
            public OnPullToRefreshCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRetryCase extends Input {
            public OnRetryCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input$OnSectionSelectedCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input;", "associated0", "", "<init>", "(I)V", "getAssociated0", "()I", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input$OnSubtagToggledCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        public static final /* synthetic */ Input access$getOnNearBottom$cp() {
            return onNearBottom;
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
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\fJ\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\fJ\u0016\u0010\u0015\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Input;", "onSectionSelected", "associated0", "", "onSubtagToggled", "", "onPullToRefresh", "getOnPullToRefresh", "onRetry", "getOnRetry", "onNearBottom", "getOnNearBottom", "onEventWillDisplay", "onPropPillSelected", "onPropCardSideSelected", "associated1", "", "onPropCardSelected", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnNearBottom() {
                return Input.access$getOnNearBottom$cp();
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

            public final Input onEventWillDisplay(String associated0) {
                associated0.getClass();
                return new OnEventWillDisplayCase(associated0);
            }

            public final Input onPropCardSelected(String associated0, boolean associated1) {
                associated0.getClass();
                return new OnPropCardSelectedCase(associated0, associated1);
            }

            public final Input onPropCardSideSelected(String associated0, boolean associated1) {
                associated0.getClass();
                return new OnPropCardSideSelectedCase(associated0, associated1);
            }

            public final Input onPropPillSelected(String associated0) {
                associated0.getClass();
                return new OnPropPillSelectedCase(associated0);
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
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e2\u00020\u0001:\u0005\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$PageStatus;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "IdleCase", "LoadingCase", "LoadedCase", "LoadingMoreCase", "Companion", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$PageStatus$IdleCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$PageStatus$LoadedCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$PageStatus$LoadingCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$PageStatus$LoadingMoreCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class PageStatus implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final PageStatus idle = new IdleCase();
        private static final PageStatus loading = new LoadingCase();
        private static final PageStatus loadingMore = new LoadingMoreCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$PageStatus$IdleCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$PageStatus;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class IdleCase extends PageStatus {
            public IdleCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$PageStatus$LoadedCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$PageStatus;", "associated0", "Ljava/util/Date;", "<init>", "(Ljava/util/Date;)V", "getAssociated0", "()Ljava/util/Date;", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$PageStatus$LoadingCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$PageStatus;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class LoadingCase extends PageStatus {
            public LoadingCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$PageStatus$LoadingMoreCase;", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$PageStatus;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$PageStatus$Companion;", "", "<init>", "()V", "idle", "Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$PageStatus;", "getIdle", "()Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$PageStatus;", "loading", "getLoading", MetricTracker.Action.LOADED, "associated0", "Ljava/util/Date;", "loadingMore", "getLoadingMore", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00060\tj\u0002`\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0082 R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "gamesPropPillID", "", "getGamesPropPillID", "()Ljava/lang/String;", "Swift_Companion_constructor_10", "", "Lskip/bridge/SwiftObjectPointer;", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_10(AppSceneType scene, String id);

        public static final /* synthetic */ long access$Swift_Companion_constructor_10(Companion companion, AppSceneType appSceneType, String str) {
            return companion.Swift_Companion_constructor_10(appSceneType, str);
        }

        public final String getGamesPropPillID() {
            return ComboBuilderEventListViewModel.access$getGamesPropPillID$cp();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComboBuilderEventListViewModel(AppSceneType appSceneType, String str) {
        super(Companion.access$Swift_Companion_constructor_10(INSTANCE, appSceneType, str), (SwiftPeerMarker) null);
        appSceneType.getClass();
    }

    public ComboBuilderEventListViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB)\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\b\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u0015\u0010\u0017\u001a\u00020\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0015\u0010 \u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\"\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J-\u0010&\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082 J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001b0(2\u0006\u0010)\u001a\u00020\u001dH\u0016J\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0(2\u0006\u0010)\u001a\u00020\u001dH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006,"}, d2 = {"Lcom/polymarket/usviewmodels/ComboBuilderEventListViewModel$DisplaySection;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, RadarTrackingOptions.RadarTrackingOptionsSync.EVENTS_STR, "", "Lcom/polymarket/data/EEvent;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getTitle", "Swift_title", "getEvents", "()Ljava/util/List;", "Swift_events", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class DisplaySection implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public DisplaySection(String str, String str2, List<EEvent> list) {
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

        public DisplaySection(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
