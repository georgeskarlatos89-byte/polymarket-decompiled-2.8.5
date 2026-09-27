package com.polymarket.data;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
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
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 °\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\b\u00ad\u0001®\u0001¯\u0001°\u0001B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB-\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\t\u0010\u0011B\u0011\b\u0012\u0012\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0013J\u0006\u0010\u0018\u001a\u00020\u0019J\u0015\u0010\u001a\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0015\u0010 \u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010!\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u00020\fH\u0082 J\u0017\u0010%\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010&\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\"\u001a\u0004\u0018\u00010\fH\u0082 J\u0015\u0010)\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010*\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u00020\fH\u0082 J\u0017\u0010.\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010/\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\"\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u00103\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u00104\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\"\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u00109\u001a\u0004\u0018\u00010\u00102\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010:\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0010H\u0082 J\u001c\u0010A\u001a\u0004\u0018\u00010;2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010BJ$\u0010C\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\"\u001a\u0004\u0018\u00010;H\u0082 ¢\u0006\u0002\u0010DJ\u0017\u0010K\u001a\u0004\u0018\u00010E2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010L\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\"\u001a\u0004\u0018\u00010EH\u0082 J\u0017\u0010S\u001a\u0004\u0018\u00010M2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010T\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\"\u001a\u0004\u0018\u00010MH\u0082 J\u001c\u0010[\u001a\u0004\u0018\u00010U2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010\\J$\u0010]\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\"\u001a\u0004\u0018\u00010UH\u0082 ¢\u0006\u0002\u0010^J\u001b\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00000_2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u0010f\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000_H\u0082 J\u0017\u0010m\u001a\u0004\u0018\u00010g2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010n\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\"\u001a\u0004\u0018\u00010gH\u0082 J1\u0010o\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0082 J\u0015\u0010r\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010u\u001a\u00020\u00102\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010x\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010{\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010~\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010\u0083\u0001\u001a\u00030\u0080\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u0086\u0001\u001a\u00020;2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u0088\u0001\u001a\u00020;2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008a\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008a\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u0093\u0001\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u0094\u0001\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0012\u001a\u00020\u0001H\u0082 J\t\u0010¡\u0001\u001a\u00020\u0001H\u0016J\u0016\u0010¢\u0001\u001a\u00020;2\n\u0010£\u0001\u001a\u0005\u0018\u00010\u0097\u0001H\u0096\u0002J\u001c\u0010¤\u0001\u001a\u00020;2\u0007\u0010¥\u0001\u001a\u00020\u00002\u0007\u0010¦\u0001\u001a\u00020\u0000H\u0082 J\t\u0010§\u0001\u001a\u00020UH\u0016J\u0016\u0010¨\u0001\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001a\u0010©\u0001\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010ª\u00012\u0007\u0010«\u0001\u001a\u00020UH\u0016J\u001b\u0010¬\u0001\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010ª\u00012\u0007\u0010«\u0001\u001a\u00020UH\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u001d\"\u0004\b$\u0010\u001fR$\u0010\u000e\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\u001d\"\u0004\b(\u0010\u001fR(\u0010+\u001a\u0004\u0018\u00010\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010\u001d\"\u0004\b-\u0010\u001fR(\u00100\u001a\u0004\u0018\u00010\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\u001d\"\u0004\b2\u0010\u001fR(\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R(\u0010<\u001a\u0004\u0018\u00010;2\b\u0010\u001b\u001a\u0004\u0018\u00010;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R(\u0010F\u001a\u0004\u0018\u00010E2\b\u0010\u001b\u001a\u0004\u0018\u00010E8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR(\u0010N\u001a\u0004\u0018\u00010M2\b\u0010\u001b\u001a\u0004\u0018\u00010M8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR(\u0010V\u001a\u0004\u0018\u00010U2\b\u0010\u001b\u001a\u0004\u0018\u00010U8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR0\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00000_2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00000_8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR(\u0010h\u001a\u0004\u0018\u00010g2\b\u0010\u001b\u001a\u0004\u0018\u00010g8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0011\u0010p\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bq\u0010\u001dR\u0011\u0010s\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bt\u00106R\u0011\u0010v\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bw\u0010\u001dR\u0011\u0010y\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bz\u0010\u001dR\u0013\u0010|\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b}\u0010\u001dR\u0014\u0010\u007f\u001a\u00030\u0080\u00018F¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0014\u0010\u0084\u0001\u001a\u00020;8F¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0014\u0010\u0087\u0001\u001a\u00020;8F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0085\u0001R\u0017\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u00018F¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0017\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008a\u00018F¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u008c\u0001R\u0013\u0010\u0091\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010\u001dR/\u0010\u0095\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0097\u0001\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0096\u0001X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001f\u0010\u009c\u0001\u001a\u00020UX\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001¨\u0006±\u0001"}, d2 = {"Lcom/polymarket/data/APIEventTag;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "label", "slug", "type", "Lcom/polymarket/data/APIEventTag$NavigationType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/APIEventTag$NavigationType;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "newValue", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Swift_id", "Swift_id_set", "value", "getLabel", "setLabel", "Swift_label", "Swift_label_set", "getSlug", "setSlug", "Swift_slug", "Swift_slug_set", "image", "getImage", "setImage", "Swift_image", "Swift_image_set", "glyphImage", "getGlyphImage", "setGlyphImage", "Swift_glyphImage", "Swift_glyphImage_set", "getType", "()Lcom/polymarket/data/APIEventTag$NavigationType;", "setType", "(Lcom/polymarket/data/APIEventTag$NavigationType;)V", "Swift_type", "Swift_type_set", "", "tradable", "getTradable", "()Ljava/lang/Boolean;", "setTradable", "(Ljava/lang/Boolean;)V", "Swift_tradable", "(J)Ljava/lang/Boolean;", "Swift_tradable_set", "(JLjava/lang/Boolean;)V", "Lcom/polymarket/data/APIEventTag$League;", "league", "getLeague", "()Lcom/polymarket/data/APIEventTag$League;", "setLeague", "(Lcom/polymarket/data/APIEventTag$League;)V", "Swift_league", "Swift_league_set", "Lcom/polymarket/data/APIEventTag$Sport;", "sport", "getSport", "()Lcom/polymarket/data/APIEventTag$Sport;", "setSport", "(Lcom/polymarket/data/APIEventTag$Sport;)V", "Swift_sport", "Swift_sport_set", "", "parentId", "getParentId", "()Ljava/lang/Integer;", "setParentId", "(Ljava/lang/Integer;)V", "Swift_parentId", "(J)Ljava/lang/Integer;", "Swift_parentId_set", "(JLjava/lang/Integer;)V", "", "subtags", "getSubtags", "()Ljava/util/List;", "setSubtags", "(Ljava/util/List;)V", "Swift_subtags", "Swift_subtags_set", "Lcom/polymarket/data/EHub;", "hub", "getHub", "()Lcom/polymarket/data/EHub;", "setHub", "(Lcom/polymarket/data/EHub;)V", "Swift_hub", "Swift_hub_set", "Swift_constructor_0", "canonicalID", "getCanonicalID", "Swift_canonicalID", "navigationType", "getNavigationType", "Swift_navigationType", "eventsFetchSlug", "getEventsFetchSlug", "Swift_eventsFetchSlug", "displayName", "getDisplayName", "Swift_displayName", "categoryDisplayName", "getCategoryDisplayName", "Swift_categoryDisplayName", "sportSlug", "Lcom/polymarket/data/ESportsSlug;", "getSportSlug", "()Lcom/polymarket/data/ESportsSlug;", "Swift_sportSlug", "isWorldCup", "()Z", "Swift_isWorldCup", "isFeaturedTournament", "Swift_isFeaturedTournament", "imageURL", "Ljava/net/URI;", "getImageURL", "()Ljava/net/URI;", "Swift_imageURL", "glyphImageURL", "getGlyphImageURL", "Swift_glyphImageURL", "iconAssetName", "getIconAssetName", "Swift_iconAssetName", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "equals", "other", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "NavigationType", "League", "Sport", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class APIEventTag implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    public APIEventTag(String str, String str2, String str3, NavigationType navigationType) {
        str.getClass();
        str3.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, str3, navigationType);
    }

    private final native String Swift_canonicalID(long Swift_peer);

    private final native String Swift_categoryDisplayName(long Swift_peer);

    private final native long Swift_constructor_0(String id, String label, String slug, NavigationType type);

    private final native long Swift_constructor_1(MutableStruct copy);

    private final native String Swift_displayName(long Swift_peer);

    private final native String Swift_eventsFetchSlug(long Swift_peer);

    private final native String Swift_glyphImage(long Swift_peer);

    private final native URI Swift_glyphImageURL(long Swift_peer);

    private final native void Swift_glyphImage_set(long Swift_peer, String value);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native EHub Swift_hub(long Swift_peer);

    private final native void Swift_hub_set(long Swift_peer, EHub value);

    private final native String Swift_iconAssetName(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native void Swift_id_set(long Swift_peer, String value);

    private final native String Swift_image(long Swift_peer);

    private final native URI Swift_imageURL(long Swift_peer);

    private final native void Swift_image_set(long Swift_peer, String value);

    private final native boolean Swift_isFeaturedTournament(long Swift_peer);

    private final native boolean Swift_isWorldCup(long Swift_peer);

    private final native boolean Swift_isequal(APIEventTag lhs, APIEventTag rhs);

    private final native String Swift_label(long Swift_peer);

    private final native void Swift_label_set(long Swift_peer, String value);

    private final native League Swift_league(long Swift_peer);

    private final native void Swift_league_set(long Swift_peer, League value);

    private final native NavigationType Swift_navigationType(long Swift_peer);

    private final native Integer Swift_parentId(long Swift_peer);

    private final native void Swift_parentId_set(long Swift_peer, Integer value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_slug(long Swift_peer);

    private final native void Swift_slug_set(long Swift_peer, String value);

    private final native Sport Swift_sport(long Swift_peer);

    private final native ESportsSlug Swift_sportSlug(long Swift_peer);

    private final native void Swift_sport_set(long Swift_peer, Sport value);

    private final native List<APIEventTag> Swift_subtags(long Swift_peer);

    private final native void Swift_subtags_set(long Swift_peer, List<APIEventTag> value);

    private final native Boolean Swift_tradable(long Swift_peer);

    private final native void Swift_tradable_set(long Swift_peer, Boolean value);

    private final native NavigationType Swift_type(long Swift_peer);

    private final native void Swift_type_set(long Swift_peer, NavigationType value);

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
        if (other == this) {
            return true;
        }
        if (!(other instanceof APIEventTag)) {
            return false;
        }
        return Swift_isequal(this, (APIEventTag) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final String getCanonicalID() {
        return Swift_canonicalID(this.Swift_peer);
    }

    public final String getCategoryDisplayName() {
        return Swift_categoryDisplayName(this.Swift_peer);
    }

    public final String getDisplayName() {
        return Swift_displayName(this.Swift_peer);
    }

    public final String getEventsFetchSlug() {
        return Swift_eventsFetchSlug(this.Swift_peer);
    }

    public final String getGlyphImage() {
        return Swift_glyphImage(this.Swift_peer);
    }

    public final URI getGlyphImageURL() {
        return Swift_glyphImageURL(this.Swift_peer);
    }

    public final EHub getHub() {
        return Swift_hub(this.Swift_peer);
    }

    public final String getIconAssetName() {
        return Swift_iconAssetName(this.Swift_peer);
    }

    public final String getId() {
        return Swift_id(this.Swift_peer);
    }

    public final String getImage() {
        return Swift_image(this.Swift_peer);
    }

    public final URI getImageURL() {
        return Swift_imageURL(this.Swift_peer);
    }

    public final String getLabel() {
        return Swift_label(this.Swift_peer);
    }

    public final League getLeague() {
        return Swift_league(this.Swift_peer);
    }

    public final NavigationType getNavigationType() {
        return Swift_navigationType(this.Swift_peer);
    }

    public final Integer getParentId() {
        return Swift_parentId(this.Swift_peer);
    }

    public final String getSlug() {
        return Swift_slug(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    public final Sport getSport() {
        return Swift_sport(this.Swift_peer);
    }

    public final ESportsSlug getSportSlug() {
        return Swift_sportSlug(this.Swift_peer);
    }

    public final List<APIEventTag> getSubtags() {
        return Swift_subtags(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final Boolean getTradable() {
        return Swift_tradable(this.Swift_peer);
    }

    public final NavigationType getType() {
        return Swift_type(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(Swift_hashvalue(this.Swift_peer));
    }

    public final boolean isFeaturedTournament() {
        return Swift_isFeaturedTournament(this.Swift_peer);
    }

    public final boolean isWorldCup() {
        return Swift_isWorldCup(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new APIEventTag(this);
    }

    public final void setGlyphImage(String str) {
        willmutate();
        try {
            Swift_glyphImage_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setHub(EHub eHub) {
        Swift_hub_set(this.Swift_peer, (EHub) StructKt.sref$default(eHub, null, 1, null));
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

    public final void setImage(String str) {
        willmutate();
        try {
            Swift_image_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setLabel(String str) {
        willmutate();
        try {
            Swift_label_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setLeague(League league) {
        League league2 = (League) StructKt.sref$default(league, null, 1, null);
        willmutate();
        try {
            Swift_league_set(this.Swift_peer, league2);
        } finally {
            didmutate();
        }
    }

    public final void setParentId(Integer num) {
        willmutate();
        try {
            Swift_parentId_set(this.Swift_peer, num);
        } finally {
            didmutate();
        }
    }

    public final void setSlug(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_slug_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    public final void setSport(Sport sport) {
        Sport sport2 = (Sport) StructKt.sref$default(sport, null, 1, null);
        willmutate();
        try {
            Swift_sport_set(this.Swift_peer, sport2);
        } finally {
            didmutate();
        }
    }

    public final void setSubtags(List<APIEventTag> list) {
        list.getClass();
        List<APIEventTag> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_subtags_set(this.Swift_peer, list2);
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

    public final void setTradable(Boolean bool) {
        willmutate();
        try {
            Swift_tradable_set(this.Swift_peer, bool);
        } finally {
            didmutate();
        }
    }

    public final void setType(NavigationType navigationType) {
        willmutate();
        try {
            Swift_type_set(this.Swift_peer, navigationType);
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
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0016B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0017"}, d2 = {"Lcom/polymarket/data/APIEventTag$NavigationType;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "league", "tag", "sport", "unknown", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class NavigationType implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ NavigationType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final NavigationType league = new NavigationType("league", 0, "league", null, 2, null);
        public static final NavigationType tag = new NavigationType("tag", 1, "tag", null, 2, null);
        public static final NavigationType sport = new NavigationType("sport", 2, "sport", null, 2, null);
        public static final NavigationType unknown = new NavigationType("unknown", 3, "unknown", null, 2, null);

        private static final /* synthetic */ NavigationType[] $values() {
            return new NavigationType[]{league, tag, sport, unknown};
        }

        static {
            NavigationType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ NavigationType(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static NavigationType valueOf(String str) {
            return (NavigationType) Enum.valueOf(NavigationType.class, str);
        }

        public static NavigationType[] values() {
            return (NavigationType[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/APIEventTag$NavigationType$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/APIEventTag$NavigationType;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final NavigationType init(String rawValue) {
                rawValue.getClass();
                switch (rawValue.hashCode()) {
                    case -1106750929:
                        if (!rawValue.equals("league")) {
                            return null;
                        }
                        return NavigationType.league;
                    case -284840886:
                        if (rawValue.equals("unknown")) {
                            return NavigationType.unknown;
                        }
                        return null;
                    case 114586:
                        if (rawValue.equals("tag")) {
                            return NavigationType.tag;
                        }
                        return null;
                    case 109651828:
                        if (rawValue.equals("sport")) {
                            return NavigationType.sport;
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

        private NavigationType(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/APIEventTag$Companion;", "", "<init>", "()V", "NavigationType", "Lcom/polymarket/data/APIEventTag$NavigationType;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NavigationType NavigationType(String rawValue) {
            rawValue.getClass();
            return NavigationType.INSTANCE.init(rawValue);
        }

        private Companion() {
        }
    }

    public APIEventTag(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private APIEventTag(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(mutableStruct);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 T2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001TB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB?\b\u0016\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u0012B\u0011\b\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0014J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0015\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0015\u0010!\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010\"\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\fH\u0082 J\u0015\u0010(\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010)\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u000eH\u0082 J\u001c\u0010.\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010/J$\u00100\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\fH\u0082 ¢\u0006\u0002\u00101J\u0015\u00104\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u00105\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010#\u001a\u00020\u000eH\u0082 J\u0017\u00108\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u00109\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u000eH\u0082 J>\u0010:\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0082 ¢\u0006\u0002\u0010;J\u0015\u0010<\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0013\u001a\u00020\u0001H\u0082 J\b\u0010G\u001a\u00020\u0001H\u0016J\u0013\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010?H\u0096\u0002J\u0019\u0010K\u001a\u00020I2\u0006\u0010L\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u0000H\u0082 J\b\u0010N\u001a\u00020\fH\u0016J\u0015\u0010O\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010P\u001a\b\u0012\u0004\u0012\u00020?0Q2\u0006\u0010R\u001a\u00020\fH\u0016J\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020?0Q2\u0006\u0010R\u001a\u00020\fH\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R(\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010%\"\u0004\b7\u0010'R(\u0010=\u001a\u0010\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u001a\u0018\u00010>X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u001e\"\u0004\bF\u0010 ¨\u0006U"}, d2 = {"Lcom/polymarket/data/APIEventTag$Sport;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", Keys.KEY_NAME, "", "tagId", "slug", "image", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "newValue", "getId", "()I", "setId", "(I)V", "Swift_id", "Swift_id_set", "value", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "Swift_name", "Swift_name_set", "getTagId", "()Ljava/lang/Integer;", "setTagId", "(Ljava/lang/Integer;)V", "Swift_tagId", "(J)Ljava/lang/Integer;", "Swift_tagId_set", "(JLjava/lang/Integer;)V", "getSlug", "setSlug", "Swift_slug", "Swift_slug_set", "getImage", "setImage", "Swift_image", "Swift_image_set", "Swift_constructor_0", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)J", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "setSmutatingcount", "scopy", "equals", "", "other", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Sport implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Sport(int r3, java.lang.String r4, java.lang.Integer r5, java.lang.String r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r2 = this;
                r9 = r8 & 1
                if (r9 == 0) goto L5
                r3 = 0
            L5:
                r9 = r8 & 2
                java.lang.String r0 = ""
                if (r9 == 0) goto Lc
                r4 = r0
            Lc:
                r9 = r8 & 4
                r1 = 0
                if (r9 == 0) goto L12
                r5 = r1
            L12:
                r9 = r8 & 8
                if (r9 == 0) goto L17
                r6 = r0
            L17:
                r8 = r8 & 16
                if (r8 == 0) goto L22
                r9 = r1
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
                goto L28
            L22:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
            L28:
                r4.<init>(r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.polymarket.data.APIEventTag.Sport.<init>(int, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        private final native long Swift_constructor_0(int id, String name, Integer tagId, String slug, String image);

        private final native long Swift_constructor_1(MutableStruct copy);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native int Swift_id(long Swift_peer);

        private final native void Swift_id_set(long Swift_peer, int value);

        private final native String Swift_image(long Swift_peer);

        private final native void Swift_image_set(long Swift_peer, String value);

        private final native boolean Swift_isequal(Sport lhs, Sport rhs);

        private final native String Swift_name(long Swift_peer);

        private final native void Swift_name_set(long Swift_peer, String value);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_slug(long Swift_peer);

        private final native void Swift_slug_set(long Swift_peer, String value);

        private final native Integer Swift_tagId(long Swift_peer);

        private final native void Swift_tagId_set(long Swift_peer, Integer value);

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
            if (other == this) {
                return true;
            }
            if (!(other instanceof Sport)) {
                return false;
            }
            return Swift_isequal(this, (Sport) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final int getId() {
            return Swift_id(this.Swift_peer);
        }

        public final String getImage() {
            return Swift_image(this.Swift_peer);
        }

        public final String getName() {
            return Swift_name(this.Swift_peer);
        }

        public final String getSlug() {
            return Swift_slug(this.Swift_peer);
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

        public final Integer getTagId() {
            return Swift_tagId(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new Sport(this);
        }

        public final void setId(int i) {
            willmutate();
            try {
                Swift_id_set(this.Swift_peer, i);
            } finally {
                didmutate();
            }
        }

        public final void setImage(String str) {
            willmutate();
            try {
                Swift_image_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setName(String str) {
            str.getClass();
            willmutate();
            try {
                Swift_name_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setSlug(String str) {
            str.getClass();
            willmutate();
            try {
                Swift_slug_set(this.Swift_peer, str);
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

        public final void setTagId(Integer num) {
            willmutate();
            try {
                Swift_tagId_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        public Sport(int i, String str, Integer num, String str2, String str3) {
            str.getClass();
            str2.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(i, str, num, str2, str3);
        }

        public Sport(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private Sport(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_1(mutableStruct);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\bB\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 z2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001zB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0091\u0001\b\u0016\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u001aB\u0011\b\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u001cJ\u0006\u0010!\u001a\u00020\"J\u0015\u0010#\u001a\u00020\"2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0015\u0010)\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010*\u001a\u00020\"2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010+\u001a\u00020\fH\u0082 J\u0015\u00100\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u00101\u001a\u00020\"2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010+\u001a\u00020\u000eH\u0082 J\u0015\u00104\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u00105\u001a\u00020\"2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010+\u001a\u00020\fH\u0082 J\u001c\u0010:\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010;J$\u0010<\u001a\u00020\"2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010+\u001a\u0004\u0018\u00010\fH\u0082 ¢\u0006\u0002\u0010=J\u0015\u0010@\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010A\u001a\u00020\"2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010+\u001a\u00020\u000eH\u0082 J\u0017\u0010D\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010E\u001a\u00020\"2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010+\u001a\u0004\u0018\u00010\u000eH\u0082 J\u0017\u0010H\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010I\u001a\u00020\"2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010+\u001a\u0004\u0018\u00010\u000eH\u0082 J\u0017\u0010L\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010M\u001a\u00020\"2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010+\u001a\u0004\u0018\u00010\u000eH\u0082 J\u001c\u0010P\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010;J$\u0010Q\u001a\u00020\"2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010+\u001a\u0004\u0018\u00010\fH\u0082 ¢\u0006\u0002\u0010=J\u001c\u0010U\u001a\u0004\u0018\u00010\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010VJ$\u0010W\u001a\u00020\"2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010+\u001a\u0004\u0018\u00010\u0017H\u0082 ¢\u0006\u0002\u0010XJ\u001c\u0010[\u001a\u0004\u0018\u00010\u00172\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010VJ$\u0010\\\u001a\u00020\"2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010+\u001a\u0004\u0018\u00010\u0017H\u0082 ¢\u0006\u0002\u0010XJ\u0017\u0010_\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010`\u001a\u00020\"2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010+\u001a\u0004\u0018\u00010\u000eH\u0082 J\u0082\u0001\u0010a\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0082 ¢\u0006\u0002\u0010bJ\u0015\u0010c\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u001b\u001a\u00020\u0001H\u0082 J\b\u0010n\u001a\u00020\u0001H\u0016J\u0013\u0010o\u001a\u00020\u00172\b\u0010p\u001a\u0004\u0018\u00010fH\u0096\u0002J\u0019\u0010q\u001a\u00020\u00172\u0006\u0010r\u001a\u00020\u00002\u0006\u0010s\u001a\u00020\u0000H\u0082 J\b\u0010t\u001a\u00020\fH\u0016J\u0015\u0010u\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010v\u001a\b\u0012\u0004\u0012\u00020f0w2\u0006\u0010x\u001a\u00020\fH\u0016J\u0017\u0010y\u001a\b\u0012\u0004\u0012\u00020f0w2\u0006\u0010x\u001a\u00020\fH\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u000b\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010\r\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u0010\u000f\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010&\"\u0004\b3\u0010(R(\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\u0010$\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010\u0011\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010-\"\u0004\b?\u0010/R(\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\b\u0010$\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010-\"\u0004\bC\u0010/R(\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\b\u0010$\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010-\"\u0004\bG\u0010/R(\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010$\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010-\"\u0004\bK\u0010/R(\u0010\u0015\u001a\u0004\u0018\u00010\f2\b\u0010$\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u00107\"\u0004\bO\u00109R(\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010$\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010R\"\u0004\bS\u0010TR(\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010$\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010R\"\u0004\bZ\u0010TR(\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010$\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010-\"\u0004\b^\u0010/R(\u0010d\u001a\u0010\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020\"\u0018\u00010eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u001a\u0010k\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010&\"\u0004\bm\u0010(¨\u0006{"}, d2 = {"Lcom/polymarket/data/APIEventTag$League;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", Keys.KEY_NAME, "", "sportId", "tagId", "slug", "image", "resolution", "ordering", "activeSeriesId", "isOperational", "", "automaticResolution", "abbreviation", "(ILjava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "newValue", "getId", "()I", "setId", "(I)V", "Swift_id", "Swift_id_set", "value", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "Swift_name", "Swift_name_set", "getSportId", "setSportId", "Swift_sportId", "Swift_sportId_set", "getTagId", "()Ljava/lang/Integer;", "setTagId", "(Ljava/lang/Integer;)V", "Swift_tagId", "(J)Ljava/lang/Integer;", "Swift_tagId_set", "(JLjava/lang/Integer;)V", "getSlug", "setSlug", "Swift_slug", "Swift_slug_set", "getImage", "setImage", "Swift_image", "Swift_image_set", "getResolution", "setResolution", "Swift_resolution", "Swift_resolution_set", "getOrdering", "setOrdering", "Swift_ordering", "Swift_ordering_set", "getActiveSeriesId", "setActiveSeriesId", "Swift_activeSeriesId", "Swift_activeSeriesId_set", "()Ljava/lang/Boolean;", "setOperational", "(Ljava/lang/Boolean;)V", "Swift_isOperational", "(J)Ljava/lang/Boolean;", "Swift_isOperational_set", "(JLjava/lang/Boolean;)V", "getAutomaticResolution", "setAutomaticResolution", "Swift_automaticResolution", "Swift_automaticResolution_set", "getAbbreviation", "setAbbreviation", "Swift_abbreviation", "Swift_abbreviation_set", "Swift_constructor_0", "(ILjava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)J", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "setSmutatingcount", "scopy", "equals", "other", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class League implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ League(int i, String str, int i2, Integer num, String str2, String str3, String str4, String str5, Integer num2, Boolean bool, Boolean bool2, String str6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, r2, r1, r3, r5, r6, r7, r8, r9, r10, r24);
            Integer num3;
            String str7;
            String str8;
            String str9;
            Integer num4;
            Boolean bool3;
            Boolean bool4;
            String str10;
            i = (i3 & 1) != 0 ? 0 : i;
            str = (i3 & 2) != 0 ? "" : str;
            int i4 = (i3 & 4) == 0 ? i2 : 0;
            if ((i3 & 8) != 0) {
                num3 = null;
            } else {
                num3 = num;
            }
            String str11 = (i3 & 16) == 0 ? str2 : "";
            if ((i3 & 32) != 0) {
                str7 = null;
            } else {
                str7 = str3;
            }
            if ((i3 & 64) != 0) {
                str8 = null;
            } else {
                str8 = str4;
            }
            if ((i3 & 128) != 0) {
                str9 = null;
            } else {
                str9 = str5;
            }
            if ((i3 & 256) != 0) {
                num4 = null;
            } else {
                num4 = num2;
            }
            if ((i3 & Barcode.FORMAT_UPC_A) != 0) {
                bool3 = null;
            } else {
                bool3 = bool;
            }
            if ((i3 & Barcode.FORMAT_UPC_E) != 0) {
                bool4 = null;
            } else {
                bool4 = bool2;
            }
            if ((i3 & 2048) != 0) {
                str10 = null;
            } else {
                str10 = str6;
            }
        }

        private final native String Swift_abbreviation(long Swift_peer);

        private final native void Swift_abbreviation_set(long Swift_peer, String value);

        private final native Integer Swift_activeSeriesId(long Swift_peer);

        private final native void Swift_activeSeriesId_set(long Swift_peer, Integer value);

        private final native Boolean Swift_automaticResolution(long Swift_peer);

        private final native void Swift_automaticResolution_set(long Swift_peer, Boolean value);

        private final native long Swift_constructor_0(int id, String name, int sportId, Integer tagId, String slug, String image, String resolution, String ordering, Integer activeSeriesId, Boolean isOperational, Boolean automaticResolution, String abbreviation);

        private final native long Swift_constructor_1(MutableStruct copy);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native int Swift_id(long Swift_peer);

        private final native void Swift_id_set(long Swift_peer, int value);

        private final native String Swift_image(long Swift_peer);

        private final native void Swift_image_set(long Swift_peer, String value);

        private final native Boolean Swift_isOperational(long Swift_peer);

        private final native void Swift_isOperational_set(long Swift_peer, Boolean value);

        private final native boolean Swift_isequal(League lhs, League rhs);

        private final native String Swift_name(long Swift_peer);

        private final native void Swift_name_set(long Swift_peer, String value);

        private final native String Swift_ordering(long Swift_peer);

        private final native void Swift_ordering_set(long Swift_peer, String value);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_resolution(long Swift_peer);

        private final native void Swift_resolution_set(long Swift_peer, String value);

        private final native String Swift_slug(long Swift_peer);

        private final native void Swift_slug_set(long Swift_peer, String value);

        private final native int Swift_sportId(long Swift_peer);

        private final native void Swift_sportId_set(long Swift_peer, int value);

        private final native Integer Swift_tagId(long Swift_peer);

        private final native void Swift_tagId_set(long Swift_peer, Integer value);

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
            if (other == this) {
                return true;
            }
            if (!(other instanceof League)) {
                return false;
            }
            return Swift_isequal(this, (League) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getAbbreviation() {
            return Swift_abbreviation(this.Swift_peer);
        }

        public final Integer getActiveSeriesId() {
            return Swift_activeSeriesId(this.Swift_peer);
        }

        public final Boolean getAutomaticResolution() {
            return Swift_automaticResolution(this.Swift_peer);
        }

        public final int getId() {
            return Swift_id(this.Swift_peer);
        }

        public final String getImage() {
            return Swift_image(this.Swift_peer);
        }

        public final String getName() {
            return Swift_name(this.Swift_peer);
        }

        public final String getOrdering() {
            return Swift_ordering(this.Swift_peer);
        }

        public final String getResolution() {
            return Swift_resolution(this.Swift_peer);
        }

        public final String getSlug() {
            return Swift_slug(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public int getSmutatingcount() {
            return this.smutatingcount;
        }

        public final int getSportId() {
            return Swift_sportId(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public Function1<Object, Unit> getSupdate() {
            return this.supdate;
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final Integer getTagId() {
            return Swift_tagId(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final Boolean isOperational() {
            return Swift_isOperational(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new League(this);
        }

        public final void setAbbreviation(String str) {
            willmutate();
            try {
                Swift_abbreviation_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setActiveSeriesId(Integer num) {
            willmutate();
            try {
                Swift_activeSeriesId_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setAutomaticResolution(Boolean bool) {
            willmutate();
            try {
                Swift_automaticResolution_set(this.Swift_peer, bool);
            } finally {
                didmutate();
            }
        }

        public final void setId(int i) {
            willmutate();
            try {
                Swift_id_set(this.Swift_peer, i);
            } finally {
                didmutate();
            }
        }

        public final void setImage(String str) {
            willmutate();
            try {
                Swift_image_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setName(String str) {
            str.getClass();
            willmutate();
            try {
                Swift_name_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setOperational(Boolean bool) {
            willmutate();
            try {
                Swift_isOperational_set(this.Swift_peer, bool);
            } finally {
                didmutate();
            }
        }

        public final void setOrdering(String str) {
            willmutate();
            try {
                Swift_ordering_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setResolution(String str) {
            willmutate();
            try {
                Swift_resolution_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setSlug(String str) {
            str.getClass();
            willmutate();
            try {
                Swift_slug_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void setSmutatingcount(int i) {
            this.smutatingcount = i;
        }

        public final void setSportId(int i) {
            willmutate();
            try {
                Swift_sportId_set(this.Swift_peer, i);
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

        public final void setTagId(Integer num) {
            willmutate();
            try {
                Swift_tagId_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        public League(int i, String str, int i2, Integer num, String str2, String str3, String str4, String str5, Integer num2, Boolean bool, Boolean bool2, String str6) {
            str.getClass();
            str2.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(i, str, i2, num, str2, str3, str4, str5, num2, bool, bool2, str6);
        }

        public League(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private League(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_1(mutableStruct);
        }
    }
}
