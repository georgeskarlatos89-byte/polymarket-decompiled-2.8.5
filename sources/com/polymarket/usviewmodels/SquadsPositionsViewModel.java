package com.polymarket.usviewmodels;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.clients.ClientChatPositionAttachment;
import com.polymarket.data.EError;
import com.polymarket.data.ESquadPositionItem;
import com.polymarket.data.ESquadPositionsPage;
import com.polymarket.data.EUserPosition;
import com.polymarket.usviewmodels.AppViewModel;
import com.polymarket.usviewmodels.SquadsPositionPopularItemPresentation;
import com.polymarket.usviewmodels.SquadsPositionsFilterPresentation;
import defpackage.moh;
import defpackage.u85;
import defpackage.uph;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Async;
import skip.lib.MutableStruct;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bH\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 Æ\u00012\u00020\u0001:\u0006Ä\u0001Å\u0001Æ\u0001B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0007\u0010\u000fJ\u0015\u0010\u0015\u001a\u00020\u000e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u0016\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0018\u001a\u00020\u000eH\u0082 J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010 \u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010/\u001a\u00020,2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00104\u001a\u0002012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u00107\u001a\b\u0012\u0004\u0012\u0002010\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010;\u001a\b\u0012\u0004\u0012\u0002090\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010@\u001a\u0004\u0018\u00010=2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010D\u001a\u00020B2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0010\u0010E\u001a\u0004\u0018\u0001092\u0006\u0010F\u001a\u00020\nJ\u001f\u0010G\u001a\u0004\u0018\u0001092\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010H\u001a\u00020\nH\u0082 J\u0010\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010F\u001a\u00020\nJ\u001f\u0010K\u001a\u0004\u0018\u00010J2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010H\u001a\u00020\nH\u0082 J\u0010\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010F\u001a\u00020\nJ\u001f\u0010N\u001a\u0004\u0018\u00010M2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010H\u001a\u00020\nH\u0082 J\u0010\u0010O\u001a\u0004\u0018\u00010#2\u0006\u0010F\u001a\u00020PJ\u001f\u0010Q\u001a\u0004\u0018\u00010#2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010H\u001a\u00020PH\u0082 J\u0010\u0010R\u001a\u0004\u0018\u00010J2\u0006\u0010F\u001a\u00020PJ\u001f\u0010S\u001a\u0004\u0018\u00010J2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010H\u001a\u00020PH\u0082 J\u0010\u0010T\u001a\u0004\u0018\u00010U2\u0006\u0010F\u001a\u00020PJ\u001f\u0010V\u001a\u0004\u0018\u00010U2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010H\u001a\u00020PH\u0082 J\u0010\u0010W\u001a\u0004\u0018\u00010X2\u0006\u0010F\u001a\u00020PJ\u001f\u0010Y\u001a\u0004\u0018\u00010X2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010H\u001a\u00020PH\u0082 J\u0015\u0010\\\u001a\u00020B2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010^\u001a\u00020B2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010b\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010e\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010h\u001a\u00020B2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010k\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010n\u001a\u0004\u0018\u00010\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010q\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010t\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010w\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010z\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010}\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010~\u001a\u00020\n2\u0006\u0010\u007f\u001a\u000201J\u001f\u0010\u0080\u0001\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\u0081\u0001\u001a\u000201H\u0082 J\u0016\u0010\u0084\u0001\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0087\u0001\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u008a\u0001\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u008d\u0001\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0090\u0001\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0093\u0001\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0096\u0001\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0099\u0001\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u009c\u0001\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\t\u0010\u009d\u0001\u001a\u00020\u0017H\u0016J\u0016\u0010\u009e\u0001\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0011\u0010\u009f\u0001\u001a\u00020\u00172\b\u0010 \u0001\u001a\u00030¡\u0001J \u0010¢\u0001\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010 \u0001\u001a\u00030¡\u0001H\u0082 J\u001a\u0010£\u0001\u001a\u00020\u00172\b\u0010¤\u0001\u001a\u00030¥\u0001H\u0096@¢\u0006\u0003\u0010¦\u0001J9\u0010§\u0001\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010¤\u0001\u001a\u00030¥\u00012\u0017\u0010¨\u0001\u001a\u0012\u0012\u0007\u0012\u0005\u0018\u00010ª\u0001\u0012\u0004\u0012\u00020\u00170©\u0001H\u0082 J\u0019\u0010«\u0001\u001a\u000b\u0012\u0005\u0012\u00030¬\u0001\u0018\u00010\"2\u0007\u0010\u00ad\u0001\u001a\u00020\nJ(\u0010®\u0001\u001a\u000b\u0012\u0005\u0012\u00030¬\u0001\u0018\u00010\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\u00ad\u0001\u001a\u00020\nH\u0082 J\u0011\u0010¯\u0001\u001a\u00020\u00172\b\u0010°\u0001\u001a\u00030±\u0001J \u0010²\u0001\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010°\u0001\u001a\u00030±\u0001H\u0082 J\u0010\u0010³\u0001\u001a\u00020B2\u0007\u0010´\u0001\u001a\u00020JJ\u001f\u0010µ\u0001\u001a\u00020B2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010´\u0001\u001a\u00020JH\u0082 J\u001d\u0010¶\u0001\u001a\u00020\u00172\n\u0010·\u0001\u001a\u0005\u0018\u00010¸\u00012\b\u0010¹\u0001\u001a\u00030º\u0001J,\u0010»\u0001\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\n\u0010·\u0001\u001a\u0005\u0018\u00010¸\u00012\b\u0010¹\u0001\u001a\u00030º\u0001H\u0082 J\u0007\u0010¼\u0001\u001a\u00020\u0017J\u0016\u0010½\u0001\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010¾\u0001\u001a\n\u0012\u0005\u0012\u00030À\u00010¿\u00012\b\u0010Á\u0001\u001a\u00030Â\u0001H\u0016J\u001c\u0010Ã\u0001\u001a\n\u0012\u0005\u0012\u00030À\u00010¿\u00012\b\u0010Á\u0001\u001a\u00030Â\u0001H\u0082 R$\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\"8F¢\u0006\u0006\u001a\u0004\b)\u0010%R\u0011\u0010+\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u00100\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0017\u00105\u001a\b\u0012\u0004\u0012\u0002010\"8F¢\u0006\u0006\u001a\u0004\b6\u0010%R\u0017\u00108\u001a\b\u0012\u0004\u0012\u0002090\"8F¢\u0006\u0006\u001a\u0004\b:\u0010%R\u0013\u0010<\u001a\u0004\u0018\u00010=8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0011\u0010A\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\bA\u0010CR\u0011\u0010Z\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\b[\u0010CR\u0011\u0010]\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\b]\u0010CR\u0011\u0010_\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0011\u0010c\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bd\u0010aR\u0011\u0010f\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\bg\u0010CR\u0011\u0010i\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bj\u0010aR\u0013\u0010l\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bm\u0010aR\u0011\u0010o\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bp\u0010aR\u0011\u0010r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bs\u0010aR\u0011\u0010u\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bv\u0010aR\u0011\u0010x\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\by\u0010aR\u0011\u0010{\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b|\u0010aR\u0013\u0010\u0082\u0001\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010aR\u0013\u0010\u0085\u0001\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010aR\u0013\u0010\u0088\u0001\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010aR\u0013\u0010\u008b\u0001\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010aR\u0013\u0010\u008e\u0001\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010aR\u0013\u0010\u0091\u0001\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010aR\u0013\u0010\u0094\u0001\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010aR\u0013\u0010\u0097\u0001\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010aR\u0013\u0010\u009a\u0001\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010a¨\u0006Ç\u0001"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "squadId", "", "parent", "Lcom/polymarket/usviewmodels/SquadsChatViewModel;", "callbacks", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Callbacks;", "(Ljava/lang/String;Lcom/polymarket/usviewmodels/SquadsChatViewModel;Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Callbacks;)V", "newValue", "getCallbacks", "()Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Callbacks;", "setCallbacks", "(Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Callbacks;)V", "Swift_callbacks", "Swift_callbacks_set", "", "value", "getParent", "()Lcom/polymarket/usviewmodels/SquadsChatViewModel;", "Swift_parent", "allFilterAvatar", "Lcom/polymarket/usviewmodels/SquadsProfileAvatarPresentation;", "getAllFilterAvatar", "()Lcom/polymarket/usviewmodels/SquadsProfileAvatarPresentation;", "Swift_allFilterAvatar", "popularItems", "", "Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation;", "getPopularItems", "()Ljava/util/List;", "Swift_popularItems", "filters", "Lcom/polymarket/usviewmodels/SquadsPositionsFilterPresentation;", "getFilters", "Swift_filters", "selectedFilterId", "Lcom/polymarket/usviewmodels/SquadsPositionsFilterPresentation$ID;", "getSelectedFilterId", "()Lcom/polymarket/usviewmodels/SquadsPositionsFilterPresentation$ID;", "Swift_selectedFilterId", "selectedSortOption", "Lcom/polymarket/usviewmodels/SquadsPositionsSortOption;", "getSelectedSortOption", "()Lcom/polymarket/usviewmodels/SquadsPositionsSortOption;", "Swift_selectedSortOption", "sortOptions", "getSortOptions", "Swift_sortOptions", "visiblePositions", "Lcom/polymarket/usviewmodels/SquadsPositionRowPresentation;", "getVisiblePositions", "Swift_visiblePositions", "loadError", "Lcom/polymarket/data/EError;", "getLoadError", "()Lcom/polymarket/data/EError;", "Swift_loadError", "isLoading", "", "()Z", "Swift_isLoading", "visiblePosition", "forID", "Swift_visiblePosition_0", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "positionEntity", "Lcom/polymarket/data/EUserPosition;", "Swift_positionEntity_1", "positionShareOwner", "Lcom/polymarket/clients/ClientChatPositionAttachment$Owner;", "Swift_positionShareOwner_2", "popularItem", "Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$ID;", "Swift_popularItem_3", "popularPosition", "Swift_popularPosition_4", "makeComboPageViewModel", "Lcom/polymarket/usviewmodels/SquadsPositionsComboPageViewModel;", "Swift_makeComboPageViewModel_5", "makeEventPageViewModel", "Lcom/polymarket/usviewmodels/SquadsPositionsEventPageViewModel;", "Swift_makeEventPageViewModel_6", "hasPositions", "getHasPositions", "Swift_hasPositions", "isEmpty", "Swift_isEmpty", "popularSectionTitle", "getPopularSectionTitle", "()Ljava/lang/String;", "Swift_popularSectionTitle", "positionsSectionTitle", "getPositionsSectionTitle", "Swift_positionsSectionTitle", "showsPositionsLimitInfo", "getShowsPositionsLimitInfo", "Swift_showsPositionsLimitInfo", "positionsLimitInfoTitle", "getPositionsLimitInfoTitle", "Swift_positionsLimitInfoTitle", "positionsLimitInfoHeaderTitle", "getPositionsLimitInfoHeaderTitle", "Swift_positionsLimitInfoHeaderTitle", "positionsLimitInfoBody", "getPositionsLimitInfoBody", "Swift_positionsLimitInfoBody", "positionsLimitInfoDetail", "getPositionsLimitInfoDetail", "Swift_positionsLimitInfoDetail", "positionsLimitInfoGotItTitle", "getPositionsLimitInfoGotItTitle", "Swift_positionsLimitInfoGotItTitle", "sortSectionTitle", "getSortSectionTitle", "Swift_sortSectionTitle", "filterSectionTitle", "getFilterSectionTitle", "Swift_filterSectionTitle", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "for_", "Swift_title_7", "sortOption", "combosEmptyStateTitle", "getCombosEmptyStateTitle", "Swift_combosEmptyStateTitle", "combosEmptyStateSubtitle", "getCombosEmptyStateSubtitle", "Swift_combosEmptyStateSubtitle", "combosEmptyStateButtonTitle", "getCombosEmptyStateButtonTitle", "Swift_combosEmptyStateButtonTitle", "positionsEmptyStateTitle", "getPositionsEmptyStateTitle", "Swift_positionsEmptyStateTitle", "positionsEmptyStateSubtitle", "getPositionsEmptyStateSubtitle", "Swift_positionsEmptyStateSubtitle", "positionsEmptyStateButtonTitle", "getPositionsEmptyStateButtonTitle", "Swift_positionsEmptyStateButtonTitle", "errorTitle", "getErrorTitle", "Swift_errorTitle", "errorSubtitle", "getErrorSubtitle", "Swift_errorSubtitle", "errorRetryButtonTitle", "getErrorRetryButtonTitle", "Swift_errorRetryButtonTitle", "setup", "Swift_setup_9", "applyPositionsPageUpdate", "page", "Lcom/polymarket/data/ESquadPositionsPage;", "Swift_applyPositionsPageUpdate_10", "performLoad", "reason", "Lcom/polymarket/usviewmodels/ReloadReason;", "(Lcom/polymarket/usviewmodels/ReloadReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Swift_callback_performLoad_11", "f_callback", "Lkotlin/Function1;", "", "memberPositionsSeed", "Lcom/polymarket/data/ESquadPositionItem;", "userId", "Swift_memberPositionsSeed_12", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input;", "Swift_sendInput_13", "viewerHolds", "shared", "Swift_viewerHolds_14", "recordJoin", "context", "Lcom/polymarket/usviewmodels/SquadsPositionJoinContext;", "execution", "Lcom/polymarket/usviewmodels/TradeExecution;", "Swift_recordJoin_15", "refreshAfterTrade", "Swift_refreshAfterTrade_16", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SquadsPositionsViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SquadsPositionsViewModel(String str, SquadsChatViewModel squadsChatViewModel, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, squadsChatViewModel, r1);
        Callbacks callbacks2;
        if ((i & 4) != 0) {
            callbacks2 = new Callbacks(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        } else {
            callbacks2 = callbacks;
        }
    }

    private final native SquadsProfileAvatarPresentation Swift_allFilterAvatar(long Swift_peer);

    private final native void Swift_applyPositionsPageUpdate_10(long Swift_peer, ESquadPositionsPage page);

    private final native void Swift_callback_performLoad_11(long Swift_peer, ReloadReason reason, Function1<? super Throwable, Unit> f_callback);

    private final native Callbacks Swift_callbacks(long Swift_peer);

    private final native void Swift_callbacks_set(long Swift_peer, Callbacks value);

    private final native String Swift_combosEmptyStateButtonTitle(long Swift_peer);

    private final native String Swift_combosEmptyStateSubtitle(long Swift_peer);

    private final native String Swift_combosEmptyStateTitle(long Swift_peer);

    private final native String Swift_errorRetryButtonTitle(long Swift_peer);

    private final native String Swift_errorSubtitle(long Swift_peer);

    private final native String Swift_errorTitle(long Swift_peer);

    private final native String Swift_filterSectionTitle(long Swift_peer);

    private final native List<SquadsPositionsFilterPresentation> Swift_filters(long Swift_peer);

    private final native boolean Swift_hasPositions(long Swift_peer);

    private final native boolean Swift_isEmpty(long Swift_peer);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native EError Swift_loadError(long Swift_peer);

    private final native SquadsPositionsComboPageViewModel Swift_makeComboPageViewModel_5(long Swift_peer, SquadsPositionPopularItemPresentation.ID id);

    private final native SquadsPositionsEventPageViewModel Swift_makeEventPageViewModel_6(long Swift_peer, SquadsPositionPopularItemPresentation.ID id);

    private final native List<ESquadPositionItem> Swift_memberPositionsSeed_12(long Swift_peer, String userId);

    private final native SquadsChatViewModel Swift_parent(long Swift_peer);

    private final native SquadsPositionPopularItemPresentation Swift_popularItem_3(long Swift_peer, SquadsPositionPopularItemPresentation.ID id);

    private final native List<SquadsPositionPopularItemPresentation> Swift_popularItems(long Swift_peer);

    private final native EUserPosition Swift_popularPosition_4(long Swift_peer, SquadsPositionPopularItemPresentation.ID id);

    private final native String Swift_popularSectionTitle(long Swift_peer);

    private final native EUserPosition Swift_positionEntity_1(long Swift_peer, String id);

    private final native ClientChatPositionAttachment.Owner Swift_positionShareOwner_2(long Swift_peer, String id);

    private final native String Swift_positionsEmptyStateButtonTitle(long Swift_peer);

    private final native String Swift_positionsEmptyStateSubtitle(long Swift_peer);

    private final native String Swift_positionsEmptyStateTitle(long Swift_peer);

    private final native String Swift_positionsLimitInfoBody(long Swift_peer);

    private final native String Swift_positionsLimitInfoDetail(long Swift_peer);

    private final native String Swift_positionsLimitInfoGotItTitle(long Swift_peer);

    private final native String Swift_positionsLimitInfoHeaderTitle(long Swift_peer);

    private final native String Swift_positionsLimitInfoTitle(long Swift_peer);

    private final native String Swift_positionsSectionTitle(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_recordJoin_15(long Swift_peer, SquadsPositionJoinContext context, TradeExecution execution);

    private final native void Swift_refreshAfterTrade_16(long Swift_peer);

    private final native SquadsPositionsFilterPresentation.ID Swift_selectedFilterId(long Swift_peer);

    private final native SquadsPositionsSortOption Swift_selectedSortOption(long Swift_peer);

    private final native void Swift_sendInput_13(long Swift_peer, Input input);

    private final native void Swift_setup_9(long Swift_peer);

    private final native boolean Swift_showsPositionsLimitInfo(long Swift_peer);

    private final native List<SquadsPositionsSortOption> Swift_sortOptions(long Swift_peer);

    private final native String Swift_sortSectionTitle(long Swift_peer);

    private final native String Swift_title_7(long Swift_peer, SquadsPositionsSortOption sortOption);

    private final native boolean Swift_viewerHolds_14(long Swift_peer, EUserPosition shared);

    private final native SquadsPositionRowPresentation Swift_visiblePosition_0(long Swift_peer, String id);

    private final native List<SquadsPositionRowPresentation> Swift_visiblePositions(long Swift_peer);

    public static final /* synthetic */ void access$Swift_callback_performLoad_11(SquadsPositionsViewModel squadsPositionsViewModel, long j, ReloadReason reloadReason, Function1 function1) {
        squadsPositionsViewModel.Swift_callback_performLoad_11(j, reloadReason, function1);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final void applyPositionsPageUpdate(ESquadPositionsPage page) {
        page.getClass();
        Swift_applyPositionsPageUpdate_10(getSwift_peer(), page);
    }

    public final SquadsProfileAvatarPresentation getAllFilterAvatar() {
        return Swift_allFilterAvatar(getSwift_peer());
    }

    public final Callbacks getCallbacks() {
        return Swift_callbacks(getSwift_peer());
    }

    public final String getCombosEmptyStateButtonTitle() {
        return Swift_combosEmptyStateButtonTitle(getSwift_peer());
    }

    public final String getCombosEmptyStateSubtitle() {
        return Swift_combosEmptyStateSubtitle(getSwift_peer());
    }

    public final String getCombosEmptyStateTitle() {
        return Swift_combosEmptyStateTitle(getSwift_peer());
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

    public final String getFilterSectionTitle() {
        return Swift_filterSectionTitle(getSwift_peer());
    }

    public final List<SquadsPositionsFilterPresentation> getFilters() {
        return Swift_filters(getSwift_peer());
    }

    public final boolean getHasPositions() {
        return Swift_hasPositions(getSwift_peer());
    }

    public final EError getLoadError() {
        return Swift_loadError(getSwift_peer());
    }

    public final SquadsChatViewModel getParent() {
        return Swift_parent(getSwift_peer());
    }

    public final List<SquadsPositionPopularItemPresentation> getPopularItems() {
        return Swift_popularItems(getSwift_peer());
    }

    public final String getPopularSectionTitle() {
        return Swift_popularSectionTitle(getSwift_peer());
    }

    public final String getPositionsEmptyStateButtonTitle() {
        return Swift_positionsEmptyStateButtonTitle(getSwift_peer());
    }

    public final String getPositionsEmptyStateSubtitle() {
        return Swift_positionsEmptyStateSubtitle(getSwift_peer());
    }

    public final String getPositionsEmptyStateTitle() {
        return Swift_positionsEmptyStateTitle(getSwift_peer());
    }

    public final String getPositionsLimitInfoBody() {
        return Swift_positionsLimitInfoBody(getSwift_peer());
    }

    public final String getPositionsLimitInfoDetail() {
        return Swift_positionsLimitInfoDetail(getSwift_peer());
    }

    public final String getPositionsLimitInfoGotItTitle() {
        return Swift_positionsLimitInfoGotItTitle(getSwift_peer());
    }

    public final String getPositionsLimitInfoHeaderTitle() {
        return Swift_positionsLimitInfoHeaderTitle(getSwift_peer());
    }

    public final String getPositionsLimitInfoTitle() {
        return Swift_positionsLimitInfoTitle(getSwift_peer());
    }

    public final String getPositionsSectionTitle() {
        return Swift_positionsSectionTitle(getSwift_peer());
    }

    public final SquadsPositionsFilterPresentation.ID getSelectedFilterId() {
        return Swift_selectedFilterId(getSwift_peer());
    }

    public final SquadsPositionsSortOption getSelectedSortOption() {
        return Swift_selectedSortOption(getSwift_peer());
    }

    public final boolean getShowsPositionsLimitInfo() {
        return Swift_showsPositionsLimitInfo(getSwift_peer());
    }

    public final List<SquadsPositionsSortOption> getSortOptions() {
        return Swift_sortOptions(getSwift_peer());
    }

    public final String getSortSectionTitle() {
        return Swift_sortSectionTitle(getSwift_peer());
    }

    public final List<SquadsPositionRowPresentation> getVisiblePositions() {
        return Swift_visiblePositions(getSwift_peer());
    }

    public final boolean isEmpty() {
        return Swift_isEmpty(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final SquadsPositionsComboPageViewModel makeComboPageViewModel(SquadsPositionPopularItemPresentation.ID forID) {
        forID.getClass();
        return Swift_makeComboPageViewModel_5(getSwift_peer(), forID);
    }

    public final SquadsPositionsEventPageViewModel makeEventPageViewModel(SquadsPositionPopularItemPresentation.ID forID) {
        forID.getClass();
        return Swift_makeEventPageViewModel_6(getSwift_peer(), forID);
    }

    public final List<ESquadPositionItem> memberPositionsSeed(String userId) {
        userId.getClass();
        return Swift_memberPositionsSeed_12(getSwift_peer(), userId);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public Object performLoad(ReloadReason reloadReason, Continuation<? super Unit> continuation) {
        Object run = Async.INSTANCE.run(new SquadsPositionsViewModel$performLoad$2(this, reloadReason, null), continuation);
        if (run == u85.COROUTINE_SUSPENDED) {
            return run;
        }
        return Unit.INSTANCE;
    }

    public final SquadsPositionPopularItemPresentation popularItem(SquadsPositionPopularItemPresentation.ID forID) {
        forID.getClass();
        return Swift_popularItem_3(getSwift_peer(), forID);
    }

    public final EUserPosition popularPosition(SquadsPositionPopularItemPresentation.ID forID) {
        forID.getClass();
        return Swift_popularPosition_4(getSwift_peer(), forID);
    }

    public final EUserPosition positionEntity(String forID) {
        forID.getClass();
        return Swift_positionEntity_1(getSwift_peer(), forID);
    }

    public final ClientChatPositionAttachment.Owner positionShareOwner(String forID) {
        forID.getClass();
        return Swift_positionShareOwner_2(getSwift_peer(), forID);
    }

    public final void recordJoin(SquadsPositionJoinContext context, TradeExecution execution) {
        execution.getClass();
        Swift_recordJoin_15(getSwift_peer(), context, execution);
    }

    public final void refreshAfterTrade() {
        Swift_refreshAfterTrade_16(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_13(getSwift_peer(), input);
    }

    public final void setCallbacks(Callbacks callbacks) {
        callbacks.getClass();
        Swift_callbacks_set(getSwift_peer(), (Callbacks) StructKt.sref$default(callbacks, null, 1, null));
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_9(getSwift_peer());
    }

    public final String title(SquadsPositionsSortOption for_) {
        for_.getClass();
        return Swift_title_7(getSwift_peer(), for_);
    }

    public final boolean viewerHolds(EUserPosition shared) {
        shared.getClass();
        return Swift_viewerHolds_14(getSwift_peer(), shared);
    }

    public final SquadsPositionRowPresentation visiblePosition(String forID) {
        forID.getClass();
        return Swift_visiblePosition_0(getSwift_peer(), forID);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 #2\u00020\u0001:\u0013\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0012$%&'()*+,-./012345¨\u00066"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnAddComboCase", "OnOpenFilterOptionsCase", "OnOpenPositionsLimitInfoCase", "OnBrowseMarketsCase", "OnRetryCase", "OnPullToRefreshCase", "OnFilterSelectedCase", "OnSortSelectedCase", "OnTailCase", "OnFadeCase", "OnSellCase", "OnJoinPopularCase", "OnSharedPositionTappedCase", "OnSharedPositionFadedCase", "OnPositionCardTappedCase", "OnMemberProfileTappedCase", "OnOpenURLCase", "OnContactSupportCase", "Companion", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnAddComboCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnBrowseMarketsCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnContactSupportCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnFadeCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnFilterSelectedCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnJoinPopularCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnMemberProfileTappedCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnOpenFilterOptionsCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnOpenPositionsLimitInfoCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnOpenURLCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnPositionCardTappedCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnPullToRefreshCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnSellCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnSharedPositionFadedCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnSharedPositionTappedCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnSortSelectedCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnTailCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onAddCombo = new OnAddComboCase();
        private static final Input onOpenFilterOptions = new OnOpenFilterOptionsCase();
        private static final Input onOpenPositionsLimitInfo = new OnOpenPositionsLimitInfoCase();
        private static final Input onBrowseMarkets = new OnBrowseMarketsCase();
        private static final Input onRetry = new OnRetryCase();
        private static final Input onPullToRefresh = new OnPullToRefreshCase();
        private static final Input onContactSupport = new OnContactSupportCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnAddComboCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnAddComboCase extends Input {
            public OnAddComboCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnBrowseMarketsCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnBrowseMarketsCase extends Input {
            public OnBrowseMarketsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnContactSupportCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnContactSupportCase extends Input {
            public OnContactSupportCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnFadeCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnFadeCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnFadeCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnFilterSelectedCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/SquadsPositionsFilterPresentation$ID;", "<init>", "(Lcom/polymarket/usviewmodels/SquadsPositionsFilterPresentation$ID;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/SquadsPositionsFilterPresentation$ID;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnFilterSelectedCase extends Input {
            private final SquadsPositionsFilterPresentation.ID associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnFilterSelectedCase(SquadsPositionsFilterPresentation.ID id) {
                super(null);
                id.getClass();
                this.associated0 = id;
            }

            public final SquadsPositionsFilterPresentation.ID getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnJoinPopularCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$ID;", "<init>", "(Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$ID;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$ID;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnJoinPopularCase extends Input {
            private final SquadsPositionPopularItemPresentation.ID associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnJoinPopularCase(SquadsPositionPopularItemPresentation.ID id) {
                super(null);
                id.getClass();
                this.associated0 = id;
            }

            public final SquadsPositionPopularItemPresentation.ID getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnMemberProfileTappedCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnMemberProfileTappedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnMemberProfileTappedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnOpenFilterOptionsCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnOpenFilterOptionsCase extends Input {
            public OnOpenFilterOptionsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnOpenPositionsLimitInfoCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnOpenPositionsLimitInfoCase extends Input {
            public OnOpenPositionsLimitInfoCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnOpenURLCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input;", "associated0", "Ljava/net/URI;", "<init>", "(Ljava/net/URI;)V", "getAssociated0", "()Ljava/net/URI;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnPositionCardTappedCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPositionCardTappedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnPositionCardTappedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnPullToRefreshCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPullToRefreshCase extends Input {
            public OnPullToRefreshCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRetryCase extends Input {
            public OnRetryCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnSellCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSellCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSellCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnSharedPositionFadedCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input;", "associated0", "Lcom/polymarket/data/EUserPosition;", "<init>", "(Lcom/polymarket/data/EUserPosition;)V", "getAssociated0", "()Lcom/polymarket/data/EUserPosition;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSharedPositionFadedCase extends Input {
            private final EUserPosition associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSharedPositionFadedCase(EUserPosition eUserPosition) {
                super(null);
                eUserPosition.getClass();
                this.associated0 = eUserPosition;
            }

            public final EUserPosition getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnSharedPositionTappedCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input;", "associated0", "Lcom/polymarket/data/EUserPosition;", "<init>", "(Lcom/polymarket/data/EUserPosition;)V", "getAssociated0", "()Lcom/polymarket/data/EUserPosition;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSharedPositionTappedCase extends Input {
            private final EUserPosition associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSharedPositionTappedCase(EUserPosition eUserPosition) {
                super(null);
                eUserPosition.getClass();
                this.associated0 = eUserPosition;
            }

            public final EUserPosition getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnSortSelectedCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/SquadsPositionsSortOption;", "<init>", "(Lcom/polymarket/usviewmodels/SquadsPositionsSortOption;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/SquadsPositionsSortOption;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSortSelectedCase extends Input {
            private final SquadsPositionsSortOption associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSortSelectedCase(SquadsPositionsSortOption squadsPositionsSortOption) {
                super(null);
                squadsPositionsSortOption.getClass();
                this.associated0 = squadsPositionsSortOption;
            }

            public final SquadsPositionsSortOption getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$OnTailCase;", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnTailCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnTailCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnAddCombo$cp() {
            return onAddCombo;
        }

        public static final /* synthetic */ Input access$getOnBrowseMarkets$cp() {
            return onBrowseMarkets;
        }

        public static final /* synthetic */ Input access$getOnContactSupport$cp() {
            return onContactSupport;
        }

        public static final /* synthetic */ Input access$getOnOpenFilterOptions$cp() {
            return onOpenFilterOptions;
        }

        public static final /* synthetic */ Input access$getOnOpenPositionsLimitInfo$cp() {
            return onOpenPositionsLimitInfo;
        }

        public static final /* synthetic */ Input access$getOnPullToRefresh$cp() {
            return onPullToRefresh;
        }

        public static final /* synthetic */ Input access$getOnRetry$cp() {
            return onRetry;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0018J\u000e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0018J\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u001eJ\u000e\u0010 \u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0018J\u000e\u0010!\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0018J\u000e\u0010\"\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020#R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010$\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007¨\u0006&"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input$Companion;", "", "<init>", "()V", "onAddCombo", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input;", "getOnAddCombo", "()Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Input;", "onOpenFilterOptions", "getOnOpenFilterOptions", "onOpenPositionsLimitInfo", "getOnOpenPositionsLimitInfo", "onBrowseMarkets", "getOnBrowseMarkets", "onRetry", "getOnRetry", "onPullToRefresh", "getOnPullToRefresh", "onFilterSelected", "associated0", "Lcom/polymarket/usviewmodels/SquadsPositionsFilterPresentation$ID;", "onSortSelected", "Lcom/polymarket/usviewmodels/SquadsPositionsSortOption;", "onTail", "", "onFade", "onSell", "onJoinPopular", "Lcom/polymarket/usviewmodels/SquadsPositionPopularItemPresentation$ID;", "onSharedPositionTapped", "Lcom/polymarket/data/EUserPosition;", "onSharedPositionFaded", "onPositionCardTapped", "onMemberProfileTapped", "onOpenURL", "Ljava/net/URI;", "onContactSupport", "getOnContactSupport", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnAddCombo() {
                return Input.access$getOnAddCombo$cp();
            }

            public final Input getOnBrowseMarkets() {
                return Input.access$getOnBrowseMarkets$cp();
            }

            public final Input getOnContactSupport() {
                return Input.access$getOnContactSupport$cp();
            }

            public final Input getOnOpenFilterOptions() {
                return Input.access$getOnOpenFilterOptions$cp();
            }

            public final Input getOnOpenPositionsLimitInfo() {
                return Input.access$getOnOpenPositionsLimitInfo$cp();
            }

            public final Input getOnPullToRefresh() {
                return Input.access$getOnPullToRefresh$cp();
            }

            public final Input getOnRetry() {
                return Input.access$getOnRetry$cp();
            }

            public final Input onFade(String associated0) {
                associated0.getClass();
                return new OnFadeCase(associated0);
            }

            public final Input onFilterSelected(SquadsPositionsFilterPresentation.ID associated0) {
                associated0.getClass();
                return new OnFilterSelectedCase(associated0);
            }

            public final Input onJoinPopular(SquadsPositionPopularItemPresentation.ID associated0) {
                associated0.getClass();
                return new OnJoinPopularCase(associated0);
            }

            public final Input onMemberProfileTapped(String associated0) {
                associated0.getClass();
                return new OnMemberProfileTappedCase(associated0);
            }

            public final Input onOpenURL(URI associated0) {
                associated0.getClass();
                return new OnOpenURLCase(associated0);
            }

            public final Input onPositionCardTapped(String associated0) {
                associated0.getClass();
                return new OnPositionCardTappedCase(associated0);
            }

            public final Input onSell(String associated0) {
                associated0.getClass();
                return new OnSellCase(associated0);
            }

            public final Input onSharedPositionFaded(EUserPosition associated0) {
                associated0.getClass();
                return new OnSharedPositionFadedCase(associated0);
            }

            public final Input onSharedPositionTapped(EUserPosition associated0) {
                associated0.getClass();
                return new OnSharedPositionTappedCase(associated0);
            }

            public final Input onSortSelected(SquadsPositionsSortOption associated0) {
                associated0.getClass();
                return new OnSortSelectedCase(associated0);
            }

            public final Input onTail(String associated0) {
                associated0.getClass();
                return new OnTailCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0082 ¨\u0006\r"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_8", "", "Lskip/bridge/SwiftObjectPointer;", "squadId", "", "parent", "Lcom/polymarket/usviewmodels/SquadsChatViewModel;", "callbacks", "Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Callbacks;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_8(String squadId, SquadsChatViewModel parent, Callbacks callbacks);

        public static final /* synthetic */ long access$Swift_Companion_constructor_8(Companion companion, String str, SquadsChatViewModel squadsChatViewModel, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_8(str, squadsChatViewModel, callbacks);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquadsPositionsViewModel(String str, SquadsChatViewModel squadsChatViewModel, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_8(INSTANCE, str, squadsChatViewModel, callbacks), (SwiftPeerMarker) null);
        str.getClass();
        squadsChatViewModel.getClass();
        callbacks.getClass();
    }

    public SquadsPositionsViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\bF\b\u0007\u0018\u0000 r2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001rB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nBó\u0001\b\u0016\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u0011\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r0\u0011\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\t\u0010\u001fB\u0011\b\u0012\u0012\u0006\u0010 \u001a\u00020\u0001¢\u0006\u0004\b\t\u0010!J\u0006\u0010&\u001a\u00020\rJ\u0015\u0010'\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020-H\u0016J\u001b\u00103\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u00104\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u00105\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082 J\u001b\u00108\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u00109\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u00105\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082 J\u001b\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u0010=\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u00105\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082 J!\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00112\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J)\u0010C\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011H\u0082 J!\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u00112\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J)\u0010G\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u0011H\u0082 J!\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u00112\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J)\u0010K\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u0011H\u0082 J!\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00112\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J)\u0010O\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0011H\u0082 J!\u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00112\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J)\u0010S\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0011H\u0082 J!\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u00112\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J)\u0010W\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u0011H\u0082 J\u001b\u0010Z\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u0010[\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u00105\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082 J!\u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r0\u00112\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J)\u0010_\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r0\u0011H\u0082 J\u001b\u0010b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u0010c\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u00105\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082 Jß\u0001\u0010d\u001a\u00060\u0005j\u0002`\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u00112\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00112\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00112\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r0\u00112\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082 J\u0015\u0010e\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010 \u001a\u00020\u0001H\u0082 J\b\u0010n\u001a\u00020\u0001H\u0016J\u0016\u0010o\u001a\b\u0012\u0004\u0012\u00020+0\f2\u0006\u0010p\u001a\u00020-H\u0016J\u0017\u0010q\u001a\b\u0012\u0004\u0012\u00020+0\f2\u0006\u0010p\u001a\u00020-H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\r0\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\r0\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00100\"\u0004\b7\u00102R0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\r0\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u00100\"\u0004\b;\u00102R<\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00112\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR<\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u00112\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR<\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u00112\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010?\"\u0004\bI\u0010AR<\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00112\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bL\u0010?\"\u0004\bM\u0010AR<\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00112\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010?\"\u0004\bQ\u0010AR<\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u00112\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010?\"\u0004\bU\u0010AR0\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\r0\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u00100\"\u0004\bY\u00102R<\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r0\u00112\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r0\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010?\"\u0004\b]\u0010AR0\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\r0\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u00100\"\u0004\ba\u00102R(\u0010f\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010?\"\u0004\bh\u0010AR\u001a\u0010i\u001a\u00020-X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010k\"\u0004\bl\u0010m¨\u0006s"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsPositionsViewModel$Callbacks;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onOpenFilterOptions", "Lkotlin/Function0;", "", "onOpenPositionsLimitInfo", "onAddCombo", "onOpenPositionTrading", "Lkotlin/Function1;", "Lcom/polymarket/usviewmodels/SquadsPositionTradeRequest;", "onOpenComboCheckout", "Lcom/polymarket/usviewmodels/SquadsComboJoinRequest;", "onOpenSell", "Lcom/polymarket/data/EUserPosition;", "onOpenMemberProfile", "", "onOpenEventDetail", "onOpenComboDetails", "onBrowseMarkets", "onOpenURL", "Ljava/net/URI;", "onContactSupport", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "getOnOpenFilterOptions", "()Lkotlin/jvm/functions/Function0;", "setOnOpenFilterOptions", "(Lkotlin/jvm/functions/Function0;)V", "Swift_onOpenFilterOptions", "Swift_onOpenFilterOptions_set", "value", "getOnOpenPositionsLimitInfo", "setOnOpenPositionsLimitInfo", "Swift_onOpenPositionsLimitInfo", "Swift_onOpenPositionsLimitInfo_set", "getOnAddCombo", "setOnAddCombo", "Swift_onAddCombo", "Swift_onAddCombo_set", "getOnOpenPositionTrading", "()Lkotlin/jvm/functions/Function1;", "setOnOpenPositionTrading", "(Lkotlin/jvm/functions/Function1;)V", "Swift_onOpenPositionTrading", "Swift_onOpenPositionTrading_set", "getOnOpenComboCheckout", "setOnOpenComboCheckout", "Swift_onOpenComboCheckout", "Swift_onOpenComboCheckout_set", "getOnOpenSell", "setOnOpenSell", "Swift_onOpenSell", "Swift_onOpenSell_set", "getOnOpenMemberProfile", "setOnOpenMemberProfile", "Swift_onOpenMemberProfile", "Swift_onOpenMemberProfile_set", "getOnOpenEventDetail", "setOnOpenEventDetail", "Swift_onOpenEventDetail", "Swift_onOpenEventDetail_set", "getOnOpenComboDetails", "setOnOpenComboDetails", "Swift_onOpenComboDetails", "Swift_onOpenComboDetails_set", "getOnBrowseMarkets", "setOnBrowseMarkets", "Swift_onBrowseMarkets", "Swift_onBrowseMarkets_set", "getOnOpenURL", "setOnOpenURL", "Swift_onOpenURL", "Swift_onOpenURL_set", "getOnContactSupport", "setOnContactSupport", "Swift_onContactSupport", "Swift_onContactSupport_set", "Swift_constructor_0", "Swift_constructor_1", "supdate", "getSupdate", "setSupdate", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Callbacks(Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function0 function04, Function1 function17, Function0 function05, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(function0, function02, r1, r2, r3, r4, r5, r6, r7, r8, r9, r25);
            Function0 function06;
            Function1 function18;
            Function1 function19;
            Function1 function110;
            Function1 function111;
            Function1 function112;
            Function1 function113;
            Function0 function07;
            Function1 function114;
            Function0 function08;
            function0 = (i & 1) != 0 ? new moh(4) : function0;
            function02 = (i & 2) != 0 ? new moh(7) : function02;
            if ((i & 4) != 0) {
                function06 = new moh(8);
            } else {
                function06 = function03;
            }
            if ((i & 8) != 0) {
                function18 = new uph(4);
            } else {
                function18 = function1;
            }
            if ((i & 16) != 0) {
                function19 = new uph(5);
            } else {
                function19 = function12;
            }
            if ((i & 32) != 0) {
                function110 = new uph(6);
            } else {
                function110 = function13;
            }
            if ((i & 64) != 0) {
                function111 = new uph(7);
            } else {
                function111 = function14;
            }
            if ((i & 128) != 0) {
                function112 = new uph(8);
            } else {
                function112 = function15;
            }
            if ((i & 256) != 0) {
                function113 = new uph(2);
            } else {
                function113 = function16;
            }
            if ((i & Barcode.FORMAT_UPC_A) != 0) {
                function07 = new moh(5);
            } else {
                function07 = function04;
            }
            if ((i & Barcode.FORMAT_UPC_E) != 0) {
                function114 = new uph(3);
            } else {
                function114 = function17;
            }
            if ((i & 2048) != 0) {
                function08 = new moh(6);
            } else {
                function08 = function05;
            }
        }

        private final native long Swift_constructor_0(Function0<Unit> onOpenFilterOptions, Function0<Unit> onOpenPositionsLimitInfo, Function0<Unit> onAddCombo, Function1<? super SquadsPositionTradeRequest, Unit> onOpenPositionTrading, Function1<? super SquadsComboJoinRequest, Unit> onOpenComboCheckout, Function1<? super EUserPosition, Unit> onOpenSell, Function1<? super String, Unit> onOpenMemberProfile, Function1<? super String, Unit> onOpenEventDetail, Function1<? super EUserPosition, Unit> onOpenComboDetails, Function0<Unit> onBrowseMarkets, Function1<? super URI, Unit> onOpenURL, Function0<Unit> onContactSupport);

        private final native long Swift_constructor_1(MutableStruct copy);

        private final native Function0<Unit> Swift_onAddCombo(long Swift_peer);

        private final native void Swift_onAddCombo_set(long Swift_peer, Function0<Unit> value);

        private final native Function0<Unit> Swift_onBrowseMarkets(long Swift_peer);

        private final native void Swift_onBrowseMarkets_set(long Swift_peer, Function0<Unit> value);

        private final native Function0<Unit> Swift_onContactSupport(long Swift_peer);

        private final native void Swift_onContactSupport_set(long Swift_peer, Function0<Unit> value);

        private final native Function1<SquadsComboJoinRequest, Unit> Swift_onOpenComboCheckout(long Swift_peer);

        private final native void Swift_onOpenComboCheckout_set(long Swift_peer, Function1<? super SquadsComboJoinRequest, Unit> value);

        private final native Function1<EUserPosition, Unit> Swift_onOpenComboDetails(long Swift_peer);

        private final native void Swift_onOpenComboDetails_set(long Swift_peer, Function1<? super EUserPosition, Unit> value);

        private final native Function1<String, Unit> Swift_onOpenEventDetail(long Swift_peer);

        private final native void Swift_onOpenEventDetail_set(long Swift_peer, Function1<? super String, Unit> value);

        private final native Function0<Unit> Swift_onOpenFilterOptions(long Swift_peer);

        private final native void Swift_onOpenFilterOptions_set(long Swift_peer, Function0<Unit> value);

        private final native Function1<String, Unit> Swift_onOpenMemberProfile(long Swift_peer);

        private final native void Swift_onOpenMemberProfile_set(long Swift_peer, Function1<? super String, Unit> value);

        private final native Function1<SquadsPositionTradeRequest, Unit> Swift_onOpenPositionTrading(long Swift_peer);

        private final native void Swift_onOpenPositionTrading_set(long Swift_peer, Function1<? super SquadsPositionTradeRequest, Unit> value);

        private final native Function0<Unit> Swift_onOpenPositionsLimitInfo(long Swift_peer);

        private final native void Swift_onOpenPositionsLimitInfo_set(long Swift_peer, Function0<Unit> value);

        private final native Function1<EUserPosition, Unit> Swift_onOpenSell(long Swift_peer);

        private final native void Swift_onOpenSell_set(long Swift_peer, Function1<? super EUserPosition, Unit> value);

        private final native Function1<URI, Unit> Swift_onOpenURL(long Swift_peer);

        private final native void Swift_onOpenURL_set(long Swift_peer, Function1<? super URI, Unit> value);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$10(URI uri) {
            uri.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$11() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$3(SquadsPositionTradeRequest squadsPositionTradeRequest) {
            squadsPositionTradeRequest.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$4(SquadsComboJoinRequest squadsComboJoinRequest) {
            squadsComboJoinRequest.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$5(EUserPosition eUserPosition) {
            eUserPosition.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$6(String str) {
            str.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$7(String str) {
            str.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$8(EUserPosition eUserPosition) {
            eUserPosition.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$9() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(SquadsComboJoinRequest squadsComboJoinRequest) {
            return _init_$lambda$4(squadsComboJoinRequest);
        }

        public static /* synthetic */ Unit b() {
            return _init_$lambda$2();
        }

        public static /* synthetic */ Unit c() {
            return _init_$lambda$0();
        }

        public static /* synthetic */ Unit d() {
            return _init_$lambda$1();
        }

        public static /* synthetic */ Unit e(EUserPosition eUserPosition) {
            return _init_$lambda$8(eUserPosition);
        }

        public static /* synthetic */ Unit f(EUserPosition eUserPosition) {
            return _init_$lambda$5(eUserPosition);
        }

        public static /* synthetic */ Unit g() {
            return _init_$lambda$9();
        }

        public static /* synthetic */ Unit h(String str) {
            return _init_$lambda$7(str);
        }

        public static /* synthetic */ Unit i(String str) {
            return _init_$lambda$6(str);
        }

        public static /* synthetic */ Unit j() {
            return _init_$lambda$11();
        }

        public static /* synthetic */ Unit k(SquadsPositionTradeRequest squadsPositionTradeRequest) {
            return _init_$lambda$3(squadsPositionTradeRequest);
        }

        public static /* synthetic */ Unit l(URI uri) {
            return _init_$lambda$10(uri);
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

        public final Function0<Unit> getOnAddCombo() {
            return Swift_onAddCombo(this.Swift_peer);
        }

        public final Function0<Unit> getOnBrowseMarkets() {
            return Swift_onBrowseMarkets(this.Swift_peer);
        }

        public final Function0<Unit> getOnContactSupport() {
            return Swift_onContactSupport(this.Swift_peer);
        }

        public final Function1<SquadsComboJoinRequest, Unit> getOnOpenComboCheckout() {
            return Swift_onOpenComboCheckout(this.Swift_peer);
        }

        public final Function1<EUserPosition, Unit> getOnOpenComboDetails() {
            return Swift_onOpenComboDetails(this.Swift_peer);
        }

        public final Function1<String, Unit> getOnOpenEventDetail() {
            return Swift_onOpenEventDetail(this.Swift_peer);
        }

        public final Function0<Unit> getOnOpenFilterOptions() {
            return Swift_onOpenFilterOptions(this.Swift_peer);
        }

        public final Function1<String, Unit> getOnOpenMemberProfile() {
            return Swift_onOpenMemberProfile(this.Swift_peer);
        }

        public final Function1<SquadsPositionTradeRequest, Unit> getOnOpenPositionTrading() {
            return Swift_onOpenPositionTrading(this.Swift_peer);
        }

        public final Function0<Unit> getOnOpenPositionsLimitInfo() {
            return Swift_onOpenPositionsLimitInfo(this.Swift_peer);
        }

        public final Function1<EUserPosition, Unit> getOnOpenSell() {
            return Swift_onOpenSell(this.Swift_peer);
        }

        public final Function1<URI, Unit> getOnOpenURL() {
            return Swift_onOpenURL(this.Swift_peer);
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
            return new Callbacks(this);
        }

        public final void setOnAddCombo(Function0<Unit> function0) {
            function0.getClass();
            willmutate();
            try {
                Swift_onAddCombo_set(this.Swift_peer, function0);
            } finally {
                didmutate();
            }
        }

        public final void setOnBrowseMarkets(Function0<Unit> function0) {
            function0.getClass();
            willmutate();
            try {
                Swift_onBrowseMarkets_set(this.Swift_peer, function0);
            } finally {
                didmutate();
            }
        }

        public final void setOnContactSupport(Function0<Unit> function0) {
            function0.getClass();
            willmutate();
            try {
                Swift_onContactSupport_set(this.Swift_peer, function0);
            } finally {
                didmutate();
            }
        }

        public final void setOnOpenComboCheckout(Function1<? super SquadsComboJoinRequest, Unit> function1) {
            function1.getClass();
            willmutate();
            try {
                Swift_onOpenComboCheckout_set(this.Swift_peer, function1);
            } finally {
                didmutate();
            }
        }

        public final void setOnOpenComboDetails(Function1<? super EUserPosition, Unit> function1) {
            function1.getClass();
            willmutate();
            try {
                Swift_onOpenComboDetails_set(this.Swift_peer, function1);
            } finally {
                didmutate();
            }
        }

        public final void setOnOpenEventDetail(Function1<? super String, Unit> function1) {
            function1.getClass();
            willmutate();
            try {
                Swift_onOpenEventDetail_set(this.Swift_peer, function1);
            } finally {
                didmutate();
            }
        }

        public final void setOnOpenFilterOptions(Function0<Unit> function0) {
            function0.getClass();
            willmutate();
            try {
                Swift_onOpenFilterOptions_set(this.Swift_peer, function0);
            } finally {
                didmutate();
            }
        }

        public final void setOnOpenMemberProfile(Function1<? super String, Unit> function1) {
            function1.getClass();
            willmutate();
            try {
                Swift_onOpenMemberProfile_set(this.Swift_peer, function1);
            } finally {
                didmutate();
            }
        }

        public final void setOnOpenPositionTrading(Function1<? super SquadsPositionTradeRequest, Unit> function1) {
            function1.getClass();
            willmutate();
            try {
                Swift_onOpenPositionTrading_set(this.Swift_peer, function1);
            } finally {
                didmutate();
            }
        }

        public final void setOnOpenPositionsLimitInfo(Function0<Unit> function0) {
            function0.getClass();
            willmutate();
            try {
                Swift_onOpenPositionsLimitInfo_set(this.Swift_peer, function0);
            } finally {
                didmutate();
            }
        }

        public final void setOnOpenSell(Function1<? super EUserPosition, Unit> function1) {
            function1.getClass();
            willmutate();
            try {
                Swift_onOpenSell_set(this.Swift_peer, function1);
            } finally {
                didmutate();
            }
        }

        public final void setOnOpenURL(Function1<? super URI, Unit> function1) {
            function1.getClass();
            willmutate();
            try {
                Swift_onOpenURL_set(this.Swift_peer, function1);
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

        public Callbacks(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super SquadsPositionTradeRequest, Unit> function1, Function1<? super SquadsComboJoinRequest, Unit> function12, Function1<? super EUserPosition, Unit> function13, Function1<? super String, Unit> function14, Function1<? super String, Unit> function15, Function1<? super EUserPosition, Unit> function16, Function0<Unit> function04, Function1<? super URI, Unit> function17, Function0<Unit> function05) {
            function0.getClass();
            function02.getClass();
            function03.getClass();
            function1.getClass();
            function12.getClass();
            function13.getClass();
            function14.getClass();
            function15.getClass();
            function16.getClass();
            function04.getClass();
            function17.getClass();
            function05.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function0, function02, function03, function1, function12, function13, function14, function15, function16, function04, function17, function05);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private Callbacks(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_1(mutableStruct);
        }
    }
}
