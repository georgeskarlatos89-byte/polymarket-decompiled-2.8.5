package com.polymarket.usviewmodels;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.ESquad;
import com.polymarket.data.ESquadDetails;
import com.polymarket.data.ESquadMemberSettings;
import com.polymarket.data.ESquadPermissions;
import com.polymarket.data.ESquadPositionItem;
import com.polymarket.data.ESquadPositionSharing;
import com.polymarket.usviewmodels.AppViewModel;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.hoj;
import defpackage.hrj;
import defpackage.u85;
import defpackage.ug7;
import defpackage.wmj;
import defpackage.ww4;
import defpackage.zyi;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Array;
import skip.lib.ArrayKt;
import skip.lib.Async;
import skip.lib.CaseIterable;
import skip.lib.CaseIterableCompanion;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0007\u0018\u0000 è\u00012\u00020\u0001:\u000eâ\u0001ã\u0001ä\u0001å\u0001æ\u0001ç\u0001è\u0001B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u0017\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010'\u001a\u00020%2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010,\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00104\u001a\u0002012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u00107\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010<\u001a\u0002092\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010A\u001a\u00020>2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010D\u001a\u00020%2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010G\u001a\u00020%2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010J\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010M\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010P\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010S\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010V\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010Y\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\\\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010_\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010b\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010e\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010i\u001a\b\u0012\u0004\u0012\u00020g0\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010l\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010o\u001a\u00020%2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010r\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010u\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010x\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010{\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010~\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0081\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0084\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0087\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010\u008c\u0001\u001a\u00030\u0089\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u008f\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001c\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020)0\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001c\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0010\u0010\u0096\u0001\u001a\u00020\u000f2\u0007\u0010\u0097\u0001\u001a\u00020)J\u001f\u0010\u0098\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\u0097\u0001\u001a\u00020)H\u0082 J\u0011\u0010\u0099\u0001\u001a\u00030\u0089\u00012\u0007\u0010\u0097\u0001\u001a\u00020)J \u0010\u009a\u0001\u001a\u00030\u0089\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\u0097\u0001\u001a\u00020)H\u0082 J\u0010\u0010\u009b\u0001\u001a\u00020\u000f2\u0007\u0010\u0097\u0001\u001a\u00020)J\u001f\u0010\u009c\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\u0097\u0001\u001a\u00020)H\u0082 J\u0016\u0010\u009f\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¢\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¥\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¨\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010«\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010¯\u0001\u001a\t\u0012\u0005\u0012\u00030\u00ad\u00010\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0011\u0010°\u0001\u001a\u00020\u000f2\b\u0010±\u0001\u001a\u00030\u00ad\u0001J \u0010²\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010±\u0001\u001a\u00030\u00ad\u0001H\u0082 J\u0016\u0010µ\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¸\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010»\u0001\u001a\u00020%2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010¿\u0001\u001a\t\u0012\u0005\u0012\u00030½\u00010\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Â\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J'\u0010Ã\u0001\u001a\u00030Ä\u00012\u001d\u0010Å\u0001\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\r\u0012\u000b\u0012\u0005\u0012\u00030Ç\u0001\u0018\u00010\u00190Æ\u0001J6\u0010È\u0001\u001a\u00030Ä\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u001d\u0010Å\u0001\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\r\u0012\u000b\u0012\u0005\u0012\u00030Ç\u0001\u0018\u00010\u00190Æ\u0001H\u0082 J\n\u0010É\u0001\u001a\u00030Ä\u0001H\u0016J\u0017\u0010Ê\u0001\u001a\u00030Ä\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0011\u0010Ë\u0001\u001a\u00030Ä\u00012\u0007\u0010Ì\u0001\u001a\u00020\u000fJ \u0010Í\u0001\u001a\u00030Ä\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010Ì\u0001\u001a\u00020\u000fH\u0082 J\u001b\u0010Î\u0001\u001a\u00030Ä\u00012\b\u0010Ï\u0001\u001a\u00030Ð\u0001H\u0096@¢\u0006\u0003\u0010Ñ\u0001J;\u0010Ò\u0001\u001a\u00030Ä\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010Ï\u0001\u001a\u00030Ð\u00012\u0018\u0010Ó\u0001\u001a\u0013\u0012\u0007\u0012\u0005\u0018\u00010Ô\u0001\u0012\u0005\u0012\u00030Ä\u00010Æ\u0001H\u0082 J\u0012\u0010Õ\u0001\u001a\u00030Ä\u00012\b\u0010Ö\u0001\u001a\u00030×\u0001J!\u0010Ø\u0001\u001a\u00030Ä\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010Ö\u0001\u001a\u00030×\u0001H\u0082 J\u0012\u0010Ù\u0001\u001a\u00030Ä\u00012\b\u0010Ú\u0001\u001a\u00030Û\u0001J!\u0010Ü\u0001\u001a\u00030Ä\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010Ú\u0001\u001a\u00030Û\u0001H\u0082 J\u001b\u0010Ý\u0001\u001a\n\u0012\u0005\u0012\u00030ß\u00010Þ\u00012\b\u0010à\u0001\u001a\u00030\u0089\u0001H\u0016J\u001c\u0010á\u0001\u001a\n\u0012\u0005\u0012\u00030ß\u00010Þ\u00012\b\u0010à\u0001\u001a\u00030\u0089\u0001H\u0082 R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001cR\u0011\u0010$\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b$\u0010&R\u0011\u0010(\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198F¢\u0006\u0006\u001a\u0004\b.\u0010\u001cR\u0011\u00100\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u00105\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b6\u0010\u0011R\u0011\u00108\u001a\u0002098F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010=\u001a\u00020>8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0011\u0010B\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\bC\u0010&R\u0011\u0010E\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\bF\u0010&R\u0011\u0010H\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bI\u0010\u0011R\u0011\u0010K\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bL\u0010\u0011R\u0011\u0010N\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bO\u0010\u0011R\u0011\u0010Q\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bR\u0010\u0011R\u0011\u0010T\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bU\u0010\u0011R\u0011\u0010W\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bX\u0010\u0011R\u0011\u0010Z\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b[\u0010\u0011R\u0011\u0010]\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b^\u0010\u0011R\u0011\u0010`\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\ba\u0010\u0011R\u0011\u0010c\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bd\u0010\u0011R\u0017\u0010f\u001a\b\u0012\u0004\u0012\u00020g0\u00198F¢\u0006\u0006\u001a\u0004\bh\u0010\u001cR\u0011\u0010j\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bk\u0010\u0011R\u0011\u0010m\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\bn\u0010&R\u0011\u0010p\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bq\u0010\u0011R\u0011\u0010s\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bt\u0010\u0011R\u0011\u0010v\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bw\u0010\u0011R\u0011\u0010y\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bz\u0010\u0011R\u0011\u0010|\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b}\u0010\u0011R\u0012\u0010\u007f\u001a\u00020\u000f8F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\u0011R\u0013\u0010\u0082\u0001\u001a\u00020\u000f8F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\u0011R\u0013\u0010\u0085\u0001\u001a\u00020\u000f8F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010\u0011R\u0015\u0010\u0088\u0001\u001a\u00030\u0089\u00018F¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0013\u0010\u008d\u0001\u001a\u00020\u000f8F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010\u0011R\u0019\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020)0\u00198F¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010\u001cR\u0019\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198F¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010\u001cR\u0013\u0010\u009d\u0001\u001a\u00020\u000f8F¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010\u0011R\u0013\u0010 \u0001\u001a\u00020\u000f8F¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010\u0011R\u0013\u0010£\u0001\u001a\u00020\u000f8F¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010\u0011R\u0013\u0010¦\u0001\u001a\u00020\u000f8F¢\u0006\u0007\u001a\u0005\b§\u0001\u0010\u0011R\u0013\u0010©\u0001\u001a\u00020\u000f8F¢\u0006\u0007\u001a\u0005\bª\u0001\u0010\u0011R\u001a\u0010¬\u0001\u001a\t\u0012\u0005\u0012\u00030\u00ad\u00010\u00198F¢\u0006\u0007\u001a\u0005\b®\u0001\u0010\u001cR\u0013\u0010³\u0001\u001a\u00020\u000f8F¢\u0006\u0007\u001a\u0005\b´\u0001\u0010\u0011R\u0013\u0010¶\u0001\u001a\u00020\u000f8F¢\u0006\u0007\u001a\u0005\b·\u0001\u0010\u0011R\u0013\u0010¹\u0001\u001a\u00020%8F¢\u0006\u0007\u001a\u0005\bº\u0001\u0010&R\u001a\u0010¼\u0001\u001a\t\u0012\u0005\u0012\u00030½\u00010\u00198F¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010\u001cR\u0013\u0010À\u0001\u001a\u00020\u000f8F¢\u0006\u0007\u001a\u0005\bÁ\u0001\u0010\u0011¨\u0006é\u0001"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "group", "Lcom/polymarket/data/ESquad;", "callbacks", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Callbacks;", "(Lcom/polymarket/data/ESquad;Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Callbacks;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "getTitle", "()Ljava/lang/String;", "Swift_title", "avatar", "Lcom/polymarket/usviewmodels/SquadsProfileAvatarPresentation;", "getAvatar", "()Lcom/polymarket/usviewmodels/SquadsProfileAvatarPresentation;", "Swift_avatar", "memberRows", "", "Lcom/polymarket/usviewmodels/SquadsSettingsUserRowPresentation;", "getMemberRows", "()Ljava/util/List;", "Swift_memberRows", "adminMemberRows", "getAdminMemberRows", "Swift_adminMemberRows", "pagedMemberRows", "getPagedMemberRows", "Swift_pagedMemberRows", "isLoadingMoreMembers", "", "()Z", "Swift_isLoadingMoreMembers", "memberFilter", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MemberFilter;", "getMemberFilter", "()Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MemberFilter;", "Swift_memberFilter", "inviteRows", "getInviteRows", "Swift_inviteRows", "muteState", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MuteState;", "getMuteState", "()Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MuteState;", "Swift_muteState", "createdText", "getCreatedText", "Swift_createdText", "permissions", "Lcom/polymarket/data/ESquadPermissions;", "getPermissions", "()Lcom/polymarket/data/ESquadPermissions;", "Swift_permissions", "memberSettings", "Lcom/polymarket/data/ESquadMemberSettings;", "getMemberSettings", "()Lcom/polymarket/data/ESquadMemberSettings;", "Swift_memberSettings", "showsCustomizationOptions", "getShowsCustomizationOptions", "Swift_showsCustomizationOptions", "showsVisibilityAndPermissions", "getShowsVisibilityAndPermissions", "Swift_showsVisibilityAndPermissions", "visibilityAndPermissionsTitle", "getVisibilityAndPermissionsTitle", "Swift_visibilityAndPermissionsTitle", "visibilityDetailText", "getVisibilityDetailText", "Swift_visibilityDetailText", "publicSquadTitle", "getPublicSquadTitle", "Swift_publicSquadTitle", "publicSquadFootnote", "getPublicSquadFootnote", "Swift_publicSquadFootnote", "allowCustomizationTitle", "getAllowCustomizationTitle", "Swift_allowCustomizationTitle", "allowCustomizationFootnote", "getAllowCustomizationFootnote", "Swift_allowCustomizationFootnote", "allowMessagingTitle", "getAllowMessagingTitle", "Swift_allowMessagingTitle", "allowMessagingFootnote", "getAllowMessagingFootnote", "Swift_allowMessagingFootnote", "publicSquadInfoTitle", "getPublicSquadInfoTitle", "Swift_publicSquadInfoTitle", "publicSquadInfoCallout", "getPublicSquadInfoCallout", "Swift_publicSquadInfoCallout", "publicSquadInfoItems", "Lcom/polymarket/usviewmodels/SquadsInfoItemPresentation;", "getPublicSquadInfoItems", "Swift_publicSquadInfoItems", "publicSquadInfoGotItTitle", "getPublicSquadInfoGotItTitle", "Swift_publicSquadInfoGotItTitle", "showsSetSquadPublic", "getShowsSetSquadPublic", "Swift_showsSetSquadPublic", "setSquadPublicTitle", "getSetSquadPublicTitle", "Swift_setSquadPublicTitle", "changeNameOrImageTitle", "getChangeNameOrImageTitle", "Swift_changeNameOrImageTitle", "nicknamesOptionTitle", "getNicknamesOptionTitle", "Swift_nicknamesOptionTitle", "muteOptionTitle", "getMuteOptionTitle", "Swift_muteOptionTitle", "muteMenuTitle", "getMuteMenuTitle", "Swift_muteMenuTitle", "membersSectionTitle", "getMembersSectionTitle", "Swift_membersSectionTitle", "inviteNewMembersTitle", "getInviteNewMembersTitle", "Swift_inviteNewMembersTitle", "squadMembersTitle", "getSquadMembersTitle", "Swift_squadMembersTitle", "memberCount", "", "getMemberCount", "()I", "Swift_memberCount", "memberCountDetailText", "getMemberCountDetailText", "Swift_memberCountDetailText", "visibleMemberFilters", "getVisibleMemberFilters", "Swift_visibleMemberFilters", "filteredMemberRows", "getFilteredMemberRows", "Swift_filteredMemberRows", "memberFilterTitle", "filter", "Swift_memberFilterTitle_0", "memberFilterCount", "Swift_memberFilterCount_1", "memberFilterCountText", "Swift_memberFilterCountText_2", "invitesSectionTitle", "getInvitesSectionTitle", "Swift_invitesSectionTitle", "privacySectionTitle", "getPrivacySectionTitle", "Swift_privacySectionTitle", "positionSharingTitle", "getPositionSharingTitle", "Swift_positionSharingTitle", "positionSharingFootnote", "getPositionSharingFootnote", "Swift_positionSharingFootnote", "positionSharingDetailText", "getPositionSharingDetailText", "Swift_positionSharingDetailText", "positionSharingOptions", "Lcom/polymarket/data/ESquadPositionSharing;", "getPositionSharingOptions", "Swift_positionSharingOptions", "positionSharingOptionTitle", "option", "Swift_positionSharingOptionTitle_3", "systemSectionTitle", "getSystemSectionTitle", "Swift_systemSectionTitle", "leaveSquadTitle", "getLeaveSquadTitle", "Swift_leaveSquadTitle", "showsDeleteSquad", "getShowsDeleteSquad", "Swift_showsDeleteSquad", "systemRows", "Lcom/polymarket/usviewmodels/SquadsSettingsSystemRow;", "getSystemRows", "Swift_systemRows", "deleteSquadTitle", "getDeleteSquadTitle", "Swift_deleteSquadTitle", "setMemberPositionsSeedProvider", "", "provider", "Lkotlin/Function1;", "Lcom/polymarket/data/ESquadPositionItem;", "Swift_setMemberPositionsSeedProvider_4", "setup", "Swift_setup_6", "openMemberProfile", "userId", "Swift_openMemberProfile_7", "performLoad", "reason", "Lcom/polymarket/usviewmodels/ReloadReason;", "(Lcom/polymarket/usviewmodels/ReloadReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Swift_callback_performLoad_8", "f_callback", "", "applyRefreshedDetail", "detail", "Lcom/polymarket/data/ESquadDetails;", "Swift_applyRefreshedDetail_9", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input;", "Swift_sendInput_10", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Callbacks", "ShareContent", "MemberFilter", "MuteState", "MuteDuration", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class USSquadsSettingsViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MuteState;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "unmuted", "muted", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class MuteState implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ MuteState[] $VALUES;
        public static final MuteState unmuted = new MuteState("unmuted", 0);
        public static final MuteState muted = new MuteState("muted", 1);

        private static final /* synthetic */ MuteState[] $values() {
            return new MuteState[]{unmuted, muted};
        }

        static {
            MuteState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private MuteState(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static MuteState valueOf(String str) {
            return (MuteState) Enum.valueOf(MuteState.class, str);
        }

        public static MuteState[] values() {
            return (MuteState[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ USSquadsSettingsViewModel(ESquad eSquad, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eSquad, r1);
        Callbacks callbacks2;
        if ((i & 2) != 0) {
            callbacks2 = new Callbacks(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        } else {
            callbacks2 = callbacks;
        }
    }

    private final native List<SquadsSettingsUserRowPresentation> Swift_adminMemberRows(long Swift_peer);

    private final native String Swift_allowCustomizationFootnote(long Swift_peer);

    private final native String Swift_allowCustomizationTitle(long Swift_peer);

    private final native String Swift_allowMessagingFootnote(long Swift_peer);

    private final native String Swift_allowMessagingTitle(long Swift_peer);

    private final native void Swift_applyRefreshedDetail_9(long Swift_peer, ESquadDetails detail);

    private final native SquadsProfileAvatarPresentation Swift_avatar(long Swift_peer);

    private final native void Swift_callback_performLoad_8(long Swift_peer, ReloadReason reason, Function1<? super Throwable, Unit> f_callback);

    private final native String Swift_changeNameOrImageTitle(long Swift_peer);

    private final native String Swift_createdText(long Swift_peer);

    private final native String Swift_deleteSquadTitle(long Swift_peer);

    private final native List<SquadsSettingsUserRowPresentation> Swift_filteredMemberRows(long Swift_peer);

    private final native String Swift_inviteNewMembersTitle(long Swift_peer);

    private final native List<SquadsSettingsUserRowPresentation> Swift_inviteRows(long Swift_peer);

    private final native String Swift_invitesSectionTitle(long Swift_peer);

    private final native boolean Swift_isLoadingMoreMembers(long Swift_peer);

    private final native String Swift_leaveSquadTitle(long Swift_peer);

    private final native int Swift_memberCount(long Swift_peer);

    private final native String Swift_memberCountDetailText(long Swift_peer);

    private final native MemberFilter Swift_memberFilter(long Swift_peer);

    private final native String Swift_memberFilterCountText_2(long Swift_peer, MemberFilter filter);

    private final native int Swift_memberFilterCount_1(long Swift_peer, MemberFilter filter);

    private final native String Swift_memberFilterTitle_0(long Swift_peer, MemberFilter filter);

    private final native List<SquadsSettingsUserRowPresentation> Swift_memberRows(long Swift_peer);

    private final native ESquadMemberSettings Swift_memberSettings(long Swift_peer);

    private final native String Swift_membersSectionTitle(long Swift_peer);

    private final native String Swift_muteMenuTitle(long Swift_peer);

    private final native String Swift_muteOptionTitle(long Swift_peer);

    private final native MuteState Swift_muteState(long Swift_peer);

    private final native String Swift_nicknamesOptionTitle(long Swift_peer);

    private final native void Swift_openMemberProfile_7(long Swift_peer, String userId);

    private final native List<SquadsSettingsUserRowPresentation> Swift_pagedMemberRows(long Swift_peer);

    private final native ESquadPermissions Swift_permissions(long Swift_peer);

    private final native String Swift_positionSharingDetailText(long Swift_peer);

    private final native String Swift_positionSharingFootnote(long Swift_peer);

    private final native String Swift_positionSharingOptionTitle_3(long Swift_peer, ESquadPositionSharing option);

    private final native List<ESquadPositionSharing> Swift_positionSharingOptions(long Swift_peer);

    private final native String Swift_positionSharingTitle(long Swift_peer);

    private final native String Swift_privacySectionTitle(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_publicSquadFootnote(long Swift_peer);

    private final native String Swift_publicSquadInfoCallout(long Swift_peer);

    private final native String Swift_publicSquadInfoGotItTitle(long Swift_peer);

    private final native List<SquadsInfoItemPresentation> Swift_publicSquadInfoItems(long Swift_peer);

    private final native String Swift_publicSquadInfoTitle(long Swift_peer);

    private final native String Swift_publicSquadTitle(long Swift_peer);

    private final native void Swift_sendInput_10(long Swift_peer, Input input);

    private final native void Swift_setMemberPositionsSeedProvider_4(long Swift_peer, Function1<? super String, ? extends List<ESquadPositionItem>> provider);

    private final native String Swift_setSquadPublicTitle(long Swift_peer);

    private final native void Swift_setup_6(long Swift_peer);

    private final native boolean Swift_showsCustomizationOptions(long Swift_peer);

    private final native boolean Swift_showsDeleteSquad(long Swift_peer);

    private final native boolean Swift_showsSetSquadPublic(long Swift_peer);

    private final native boolean Swift_showsVisibilityAndPermissions(long Swift_peer);

    private final native String Swift_squadMembersTitle(long Swift_peer);

    private final native List<SquadsSettingsSystemRow> Swift_systemRows(long Swift_peer);

    private final native String Swift_systemSectionTitle(long Swift_peer);

    private final native String Swift_title(long Swift_peer);

    private final native String Swift_visibilityAndPermissionsTitle(long Swift_peer);

    private final native String Swift_visibilityDetailText(long Swift_peer);

    private final native List<MemberFilter> Swift_visibleMemberFilters(long Swift_peer);

    public static final /* synthetic */ void access$Swift_callback_performLoad_8(USSquadsSettingsViewModel uSSquadsSettingsViewModel, long j, ReloadReason reloadReason, Function1 function1) {
        uSSquadsSettingsViewModel.Swift_callback_performLoad_8(j, reloadReason, function1);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final void applyRefreshedDetail(ESquadDetails detail) {
        detail.getClass();
        Swift_applyRefreshedDetail_9(getSwift_peer(), detail);
    }

    public final List<SquadsSettingsUserRowPresentation> getAdminMemberRows() {
        return Swift_adminMemberRows(getSwift_peer());
    }

    public final String getAllowCustomizationFootnote() {
        return Swift_allowCustomizationFootnote(getSwift_peer());
    }

    public final String getAllowCustomizationTitle() {
        return Swift_allowCustomizationTitle(getSwift_peer());
    }

    public final String getAllowMessagingFootnote() {
        return Swift_allowMessagingFootnote(getSwift_peer());
    }

    public final String getAllowMessagingTitle() {
        return Swift_allowMessagingTitle(getSwift_peer());
    }

    public final SquadsProfileAvatarPresentation getAvatar() {
        return Swift_avatar(getSwift_peer());
    }

    public final String getChangeNameOrImageTitle() {
        return Swift_changeNameOrImageTitle(getSwift_peer());
    }

    public final String getCreatedText() {
        return Swift_createdText(getSwift_peer());
    }

    public final String getDeleteSquadTitle() {
        return Swift_deleteSquadTitle(getSwift_peer());
    }

    public final List<SquadsSettingsUserRowPresentation> getFilteredMemberRows() {
        return Swift_filteredMemberRows(getSwift_peer());
    }

    public final String getInviteNewMembersTitle() {
        return Swift_inviteNewMembersTitle(getSwift_peer());
    }

    public final List<SquadsSettingsUserRowPresentation> getInviteRows() {
        return Swift_inviteRows(getSwift_peer());
    }

    public final String getInvitesSectionTitle() {
        return Swift_invitesSectionTitle(getSwift_peer());
    }

    public final String getLeaveSquadTitle() {
        return Swift_leaveSquadTitle(getSwift_peer());
    }

    public final int getMemberCount() {
        return Swift_memberCount(getSwift_peer());
    }

    public final String getMemberCountDetailText() {
        return Swift_memberCountDetailText(getSwift_peer());
    }

    public final MemberFilter getMemberFilter() {
        return Swift_memberFilter(getSwift_peer());
    }

    public final List<SquadsSettingsUserRowPresentation> getMemberRows() {
        return Swift_memberRows(getSwift_peer());
    }

    public final ESquadMemberSettings getMemberSettings() {
        return Swift_memberSettings(getSwift_peer());
    }

    public final String getMembersSectionTitle() {
        return Swift_membersSectionTitle(getSwift_peer());
    }

    public final String getMuteMenuTitle() {
        return Swift_muteMenuTitle(getSwift_peer());
    }

    public final String getMuteOptionTitle() {
        return Swift_muteOptionTitle(getSwift_peer());
    }

    public final MuteState getMuteState() {
        return Swift_muteState(getSwift_peer());
    }

    public final String getNicknamesOptionTitle() {
        return Swift_nicknamesOptionTitle(getSwift_peer());
    }

    public final List<SquadsSettingsUserRowPresentation> getPagedMemberRows() {
        return Swift_pagedMemberRows(getSwift_peer());
    }

    public final ESquadPermissions getPermissions() {
        return Swift_permissions(getSwift_peer());
    }

    public final String getPositionSharingDetailText() {
        return Swift_positionSharingDetailText(getSwift_peer());
    }

    public final String getPositionSharingFootnote() {
        return Swift_positionSharingFootnote(getSwift_peer());
    }

    public final List<ESquadPositionSharing> getPositionSharingOptions() {
        return Swift_positionSharingOptions(getSwift_peer());
    }

    public final String getPositionSharingTitle() {
        return Swift_positionSharingTitle(getSwift_peer());
    }

    public final String getPrivacySectionTitle() {
        return Swift_privacySectionTitle(getSwift_peer());
    }

    public final String getPublicSquadFootnote() {
        return Swift_publicSquadFootnote(getSwift_peer());
    }

    public final String getPublicSquadInfoCallout() {
        return Swift_publicSquadInfoCallout(getSwift_peer());
    }

    public final String getPublicSquadInfoGotItTitle() {
        return Swift_publicSquadInfoGotItTitle(getSwift_peer());
    }

    public final List<SquadsInfoItemPresentation> getPublicSquadInfoItems() {
        return Swift_publicSquadInfoItems(getSwift_peer());
    }

    public final String getPublicSquadInfoTitle() {
        return Swift_publicSquadInfoTitle(getSwift_peer());
    }

    public final String getPublicSquadTitle() {
        return Swift_publicSquadTitle(getSwift_peer());
    }

    public final String getSetSquadPublicTitle() {
        return Swift_setSquadPublicTitle(getSwift_peer());
    }

    public final boolean getShowsCustomizationOptions() {
        return Swift_showsCustomizationOptions(getSwift_peer());
    }

    public final boolean getShowsDeleteSquad() {
        return Swift_showsDeleteSquad(getSwift_peer());
    }

    public final boolean getShowsSetSquadPublic() {
        return Swift_showsSetSquadPublic(getSwift_peer());
    }

    public final boolean getShowsVisibilityAndPermissions() {
        return Swift_showsVisibilityAndPermissions(getSwift_peer());
    }

    public final String getSquadMembersTitle() {
        return Swift_squadMembersTitle(getSwift_peer());
    }

    public final List<SquadsSettingsSystemRow> getSystemRows() {
        return Swift_systemRows(getSwift_peer());
    }

    public final String getSystemSectionTitle() {
        return Swift_systemSectionTitle(getSwift_peer());
    }

    public final String getTitle() {
        return Swift_title(getSwift_peer());
    }

    public final String getVisibilityAndPermissionsTitle() {
        return Swift_visibilityAndPermissionsTitle(getSwift_peer());
    }

    public final String getVisibilityDetailText() {
        return Swift_visibilityDetailText(getSwift_peer());
    }

    public final List<MemberFilter> getVisibleMemberFilters() {
        return Swift_visibleMemberFilters(getSwift_peer());
    }

    public final boolean isLoadingMoreMembers() {
        return Swift_isLoadingMoreMembers(getSwift_peer());
    }

    public final int memberFilterCount(MemberFilter filter) {
        filter.getClass();
        return Swift_memberFilterCount_1(getSwift_peer(), filter);
    }

    public final String memberFilterCountText(MemberFilter filter) {
        filter.getClass();
        return Swift_memberFilterCountText_2(getSwift_peer(), filter);
    }

    public final String memberFilterTitle(MemberFilter filter) {
        filter.getClass();
        return Swift_memberFilterTitle_0(getSwift_peer(), filter);
    }

    public final void openMemberProfile(String userId) {
        userId.getClass();
        Swift_openMemberProfile_7(getSwift_peer(), userId);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public Object performLoad(ReloadReason reloadReason, Continuation<? super Unit> continuation) {
        Object run = Async.INSTANCE.run(new USSquadsSettingsViewModel$performLoad$2(this, reloadReason, null), continuation);
        if (run == u85.COROUTINE_SUSPENDED) {
            return run;
        }
        return Unit.INSTANCE;
    }

    public final String positionSharingOptionTitle(ESquadPositionSharing option) {
        option.getClass();
        return Swift_positionSharingOptionTitle_3(getSwift_peer(), option);
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_10(getSwift_peer(), input);
    }

    public final void setMemberPositionsSeedProvider(Function1<? super String, ? extends List<ESquadPositionItem>> provider) {
        provider.getClass();
        Swift_setMemberPositionsSeedProvider_4(getSwift_peer(), provider);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_6(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 '2\u00020\u0001:\u0017\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0016()*+,-./0123456789:;<=¨\u0006>"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidAppearCase", "OnShareCase", "OnChangeNameOrImageCase", "OnNicknamesCase", "OnSetNicknameCase", "OnMuteChatCase", "OnUnmuteChatCase", "OnInviteNewMembersCase", "OnSquadMembersCase", "OnMemberFilterSelectedCase", "OnMemberSelectedCase", "OnMemberRowWillDisplayCase", "OnInvitationSelectedCase", "OnVisibilityAndPermissionsCase", "OnPublicSquadInfoCase", "OnPublicSquadInfoPresentedCase", "OnSetPublicCase", "OnSetCustomizationCase", "OnSetMessagingCase", "OnSetPositionSharingCase", "OnLeaveSquadCase", "OnDeleteSquadCase", "Companion", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnChangeNameOrImageCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnDeleteSquadCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnInvitationSelectedCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnInviteNewMembersCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnLeaveSquadCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnMemberFilterSelectedCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnMemberRowWillDisplayCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnMemberSelectedCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnMuteChatCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnNicknamesCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnPublicSquadInfoCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnPublicSquadInfoPresentedCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnSetCustomizationCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnSetMessagingCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnSetNicknameCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnSetPositionSharingCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnSetPublicCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnShareCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnSquadMembersCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnUnmuteChatCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnViewDidAppearCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnVisibilityAndPermissionsCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidAppear = new OnViewDidAppearCase();
        private static final Input onShare = new OnShareCase();
        private static final Input onChangeNameOrImage = new OnChangeNameOrImageCase();
        private static final Input onNicknames = new OnNicknamesCase();
        private static final Input onUnmuteChat = new OnUnmuteChatCase();
        private static final Input onInviteNewMembers = new OnInviteNewMembersCase();
        private static final Input onSquadMembers = new OnSquadMembersCase();
        private static final Input onVisibilityAndPermissions = new OnVisibilityAndPermissionsCase();
        private static final Input onPublicSquadInfo = new OnPublicSquadInfoCase();
        private static final Input onPublicSquadInfoPresented = new OnPublicSquadInfoPresentedCase();
        private static final Input onLeaveSquad = new OnLeaveSquadCase();
        private static final Input onDeleteSquad = new OnDeleteSquadCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnChangeNameOrImageCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnChangeNameOrImageCase extends Input {
            public OnChangeNameOrImageCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnDeleteSquadCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDeleteSquadCase extends Input {
            public OnDeleteSquadCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnInvitationSelectedCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnInvitationSelectedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnInvitationSelectedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnInviteNewMembersCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnInviteNewMembersCase extends Input {
            public OnInviteNewMembersCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnLeaveSquadCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnLeaveSquadCase extends Input {
            public OnLeaveSquadCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnMemberFilterSelectedCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MemberFilter;", "<init>", "(Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MemberFilter;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MemberFilter;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnMemberFilterSelectedCase extends Input {
            private final MemberFilter associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnMemberFilterSelectedCase(MemberFilter memberFilter) {
                super(null);
                memberFilter.getClass();
                this.associated0 = memberFilter;
            }

            public final MemberFilter getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnMemberRowWillDisplayCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnMemberRowWillDisplayCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnMemberRowWillDisplayCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnMemberSelectedCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnMemberSelectedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnMemberSelectedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnMuteChatCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MuteDuration;", "<init>", "(Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MuteDuration;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MuteDuration;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnMuteChatCase extends Input {
            private final MuteDuration associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnMuteChatCase(MuteDuration muteDuration) {
                super(null);
                muteDuration.getClass();
                this.associated0 = muteDuration;
            }

            public final MuteDuration getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnNicknamesCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnNicknamesCase extends Input {
            public OnNicknamesCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnPublicSquadInfoCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPublicSquadInfoCase extends Input {
            public OnPublicSquadInfoCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnPublicSquadInfoPresentedCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPublicSquadInfoPresentedCase extends Input {
            public OnPublicSquadInfoPresentedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnSetCustomizationCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input;", "associated0", "", "<init>", "(Z)V", "getAssociated0", "()Z", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSetCustomizationCase extends Input {
            private final boolean associated0;

            public OnSetCustomizationCase(boolean z) {
                super(null);
                this.associated0 = z;
            }

            public final boolean getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnSetMessagingCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input;", "associated0", "", "<init>", "(Z)V", "getAssociated0", "()Z", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSetMessagingCase extends Input {
            private final boolean associated0;

            public OnSetMessagingCase(boolean z) {
                super(null);
                this.associated0 = z;
            }

            public final boolean getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnSetNicknameCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input;", "associated0", "", "associated1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", "userId", "getUserId", "nickname", "getNickname", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSetNicknameCase extends Input {
            private final String associated0;
            private final String associated1;
            private final String nickname;
            private final String userId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSetNicknameCase(String str, String str2) {
                super(null);
                str.getClass();
                str2.getClass();
                this.associated0 = str;
                this.associated1 = str2;
                this.userId = str;
                this.nickname = str2;
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public final String getAssociated1() {
                return this.associated1;
            }

            public final String getNickname() {
                return this.nickname;
            }

            public final String getUserId() {
                return this.userId;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnSetPositionSharingCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input;", "associated0", "Lcom/polymarket/data/ESquadPositionSharing;", "<init>", "(Lcom/polymarket/data/ESquadPositionSharing;)V", "getAssociated0", "()Lcom/polymarket/data/ESquadPositionSharing;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSetPositionSharingCase extends Input {
            private final ESquadPositionSharing associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSetPositionSharingCase(ESquadPositionSharing eSquadPositionSharing) {
                super(null);
                eSquadPositionSharing.getClass();
                this.associated0 = eSquadPositionSharing;
            }

            public final ESquadPositionSharing getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnSetPublicCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input;", "associated0", "", "<init>", "(Z)V", "getAssociated0", "()Z", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSetPublicCase extends Input {
            private final boolean associated0;

            public OnSetPublicCase(boolean z) {
                super(null);
                this.associated0 = z;
            }

            public final boolean getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnShareCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnShareCase extends Input {
            public OnShareCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnSquadMembersCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSquadMembersCase extends Input {
            public OnSquadMembersCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnUnmuteChatCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnUnmuteChatCase extends Input {
            public OnUnmuteChatCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnViewDidAppearCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidAppearCase extends Input {
            public OnViewDidAppearCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$OnVisibilityAndPermissionsCase;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnVisibilityAndPermissionsCase extends Input {
            public OnVisibilityAndPermissionsCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnChangeNameOrImage$cp() {
            return onChangeNameOrImage;
        }

        public static final /* synthetic */ Input access$getOnDeleteSquad$cp() {
            return onDeleteSquad;
        }

        public static final /* synthetic */ Input access$getOnInviteNewMembers$cp() {
            return onInviteNewMembers;
        }

        public static final /* synthetic */ Input access$getOnLeaveSquad$cp() {
            return onLeaveSquad;
        }

        public static final /* synthetic */ Input access$getOnNicknames$cp() {
            return onNicknames;
        }

        public static final /* synthetic */ Input access$getOnPublicSquadInfo$cp() {
            return onPublicSquadInfo;
        }

        public static final /* synthetic */ Input access$getOnPublicSquadInfoPresented$cp() {
            return onPublicSquadInfoPresented;
        }

        public static final /* synthetic */ Input access$getOnShare$cp() {
            return onShare;
        }

        public static final /* synthetic */ Input access$getOnSquadMembers$cp() {
            return onSquadMembers;
        }

        public static final /* synthetic */ Input access$getOnUnmuteChat$cp() {
            return onUnmuteChat;
        }

        public static final /* synthetic */ Input access$getOnViewDidAppear$cp() {
            return onViewDidAppear;
        }

        public static final /* synthetic */ Input access$getOnVisibilityAndPermissions$cp() {
            return onVisibilityAndPermissions;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0010J\u000e\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0010J\u000e\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0010J\u000e\u0010&\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020'J\u000e\u0010(\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020'J\u000e\u0010)\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020'J\u000e\u0010*\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020+R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0007R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007R\u0011\u0010 \u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007R\u0011\u0010\"\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0007R\u0011\u0010$\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007R\u0011\u0010,\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0007R\u0011\u0010.\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0007¨\u00060"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidAppear", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input;", "getOnViewDidAppear", "()Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Input;", "onShare", "getOnShare", "onChangeNameOrImage", "getOnChangeNameOrImage", "onNicknames", "getOnNicknames", "onSetNickname", "userId", "", "nickname", "onMuteChat", "associated0", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MuteDuration;", "onUnmuteChat", "getOnUnmuteChat", "onInviteNewMembers", "getOnInviteNewMembers", "onSquadMembers", "getOnSquadMembers", "onMemberFilterSelected", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MemberFilter;", "onMemberSelected", "onMemberRowWillDisplay", "onInvitationSelected", "onVisibilityAndPermissions", "getOnVisibilityAndPermissions", "onPublicSquadInfo", "getOnPublicSquadInfo", "onPublicSquadInfoPresented", "getOnPublicSquadInfoPresented", "onSetPublic", "", "onSetCustomization", "onSetMessaging", "onSetPositionSharing", "Lcom/polymarket/data/ESquadPositionSharing;", "onLeaveSquad", "getOnLeaveSquad", "onDeleteSquad", "getOnDeleteSquad", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnChangeNameOrImage() {
                return Input.access$getOnChangeNameOrImage$cp();
            }

            public final Input getOnDeleteSquad() {
                return Input.access$getOnDeleteSquad$cp();
            }

            public final Input getOnInviteNewMembers() {
                return Input.access$getOnInviteNewMembers$cp();
            }

            public final Input getOnLeaveSquad() {
                return Input.access$getOnLeaveSquad$cp();
            }

            public final Input getOnNicknames() {
                return Input.access$getOnNicknames$cp();
            }

            public final Input getOnPublicSquadInfo() {
                return Input.access$getOnPublicSquadInfo$cp();
            }

            public final Input getOnPublicSquadInfoPresented() {
                return Input.access$getOnPublicSquadInfoPresented$cp();
            }

            public final Input getOnShare() {
                return Input.access$getOnShare$cp();
            }

            public final Input getOnSquadMembers() {
                return Input.access$getOnSquadMembers$cp();
            }

            public final Input getOnUnmuteChat() {
                return Input.access$getOnUnmuteChat$cp();
            }

            public final Input getOnViewDidAppear() {
                return Input.access$getOnViewDidAppear$cp();
            }

            public final Input getOnVisibilityAndPermissions() {
                return Input.access$getOnVisibilityAndPermissions$cp();
            }

            public final Input onInvitationSelected(String associated0) {
                associated0.getClass();
                return new OnInvitationSelectedCase(associated0);
            }

            public final Input onMemberFilterSelected(MemberFilter associated0) {
                associated0.getClass();
                return new OnMemberFilterSelectedCase(associated0);
            }

            public final Input onMemberRowWillDisplay(String associated0) {
                associated0.getClass();
                return new OnMemberRowWillDisplayCase(associated0);
            }

            public final Input onMemberSelected(String associated0) {
                associated0.getClass();
                return new OnMemberSelectedCase(associated0);
            }

            public final Input onMuteChat(MuteDuration associated0) {
                associated0.getClass();
                return new OnMuteChatCase(associated0);
            }

            public final Input onSetCustomization(boolean associated0) {
                return new OnSetCustomizationCase(associated0);
            }

            public final Input onSetMessaging(boolean associated0) {
                return new OnSetMessagingCase(associated0);
            }

            public final Input onSetNickname(String userId, String nickname) {
                userId.getClass();
                nickname.getClass();
                return new OnSetNicknameCase(userId, nickname);
            }

            public final Input onSetPositionSharing(ESquadPositionSharing associated0) {
                associated0.getClass();
                return new OnSetPositionSharingCase(associated0);
            }

            public final Input onSetPublic(boolean associated0) {
                return new OnSetPublicCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00162\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005:\u0001\u0016B\u001d\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0082 R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0017"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MemberFilter;", "Lskip/lib/CaseIterable;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "all", "admins", "invites", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class MemberFilter implements CaseIterable, RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ MemberFilter[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final MemberFilter all = new MemberFilter("all", 0, "all", null, 2, null);
        public static final MemberFilter admins = new MemberFilter("admins", 1, "admins", null, 2, null);
        public static final MemberFilter invites = new MemberFilter("invites", 2, "invites", null, 2, null);

        private static final /* synthetic */ MemberFilter[] $values() {
            return new MemberFilter[]{all, admins, invites};
        }

        static {
            MemberFilter[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ MemberFilter(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static MemberFilter valueOf(String str) {
            return (MemberFilter) Enum.valueOf(MemberFilter.class, str);
        }

        public static MemberFilter[] values() {
            return (MemberFilter[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MemberFilter$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MemberFilter;", "<init>", "()V", "init", "rawValue", "", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion implements CaseIterableCompanion<MemberFilter> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // skip.lib.CaseIterableCompanion
            public Array<MemberFilter> getAllCases() {
                return ArrayKt.arrayOf(MemberFilter.all, MemberFilter.admins, MemberFilter.invites);
            }

            public final MemberFilter init(String rawValue) {
                rawValue.getClass();
                int hashCode = rawValue.hashCode();
                if (hashCode != -1422235900) {
                    if (hashCode != 96673) {
                        if (hashCode == 1960030858 && rawValue.equals("invites")) {
                            return MemberFilter.invites;
                        }
                        return null;
                    }
                    if (rawValue.equals("all")) {
                        return MemberFilter.all;
                    }
                    return null;
                }
                if (!rawValue.equals("admins")) {
                    return null;
                }
                return MemberFilter.admins;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private MemberFilter(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 !2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005:\u0001!B\u001d\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0082 J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0014\u001a\u00020\u0003H\u0082 ¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0082 R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0011\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\""}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MuteDuration;", "Lskip/lib/CaseIterable;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "oneHour", "eightHours", "twentyFourHours", "untilChanged", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "Swift_title", Keys.KEY_NAME, "timeInterval", "", "getTimeInterval", "()Ljava/lang/Double;", "Swift_timeInterval", "(Ljava/lang/String;)Ljava/lang/Double;", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class MuteDuration implements CaseIterable, RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ MuteDuration[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final MuteDuration oneHour = new MuteDuration("oneHour", 0, "1_hour", null, 2, null);
        public static final MuteDuration eightHours = new MuteDuration("eightHours", 1, "8_hours", null, 2, null);
        public static final MuteDuration twentyFourHours = new MuteDuration("twentyFourHours", 2, "24_hours", null, 2, null);
        public static final MuteDuration untilChanged = new MuteDuration("untilChanged", 3, "until_changed", null, 2, null);

        private static final /* synthetic */ MuteDuration[] $values() {
            return new MuteDuration[]{oneHour, eightHours, twentyFourHours, untilChanged};
        }

        static {
            MuteDuration[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ MuteDuration(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native Double Swift_timeInterval(String name);

        private final native String Swift_title(String name);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static MuteDuration valueOf(String str) {
            return (MuteDuration) Enum.valueOf(MuteDuration.class, str);
        }

        public static MuteDuration[] values() {
            return (MuteDuration[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        public final Double getTimeInterval() {
            return Swift_timeInterval(name());
        }

        public final String getTitle() {
            return Swift_title(name());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MuteDuration$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MuteDuration;", "<init>", "()V", "init", "rawValue", "", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion implements CaseIterableCompanion<MuteDuration> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // skip.lib.CaseIterableCompanion
            public Array<MuteDuration> getAllCases() {
                return ArrayKt.arrayOf(MuteDuration.oneHour, MuteDuration.eightHours, MuteDuration.twentyFourHours, MuteDuration.untilChanged);
            }

            public final MuteDuration init(String rawValue) {
                rawValue.getClass();
                switch (rawValue.hashCode()) {
                    case -1329006894:
                        if (!rawValue.equals("24_hours")) {
                            return null;
                        }
                        return MuteDuration.twentyFourHours;
                    case 979837000:
                        if (rawValue.equals("8_hours")) {
                            return MuteDuration.eightHours;
                        }
                        return null;
                    case 1064389331:
                        if (rawValue.equals("until_changed")) {
                            return MuteDuration.untilChanged;
                        }
                        return null;
                    case 1493771570:
                        if (rawValue.equals("1_hour")) {
                            return MuteDuration.oneHour;
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

        private MuteDuration(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0006\u0010\u000b\u001a\u00020\fJ\t\u0010\r\u001a\u00020\fH\u0082 J\u0006\u0010\u000e\u001a\u00020\fJ\t\u0010\u000f\u001a\u00020\fH\u0082 J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u0013¨\u0006\u0016"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_5", "", "Lskip/bridge/SwiftObjectPointer;", "group", "Lcom/polymarket/data/ESquad;", "callbacks", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel;", "Swift_Companion_mock_11", "mockLoaded", "Swift_Companion_mockLoaded_12", "MemberFilter", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MemberFilter;", "rawValue", "", "MuteDuration", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MuteDuration;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_5(ESquad group, Callbacks callbacks);

        private final native USSquadsSettingsViewModel Swift_Companion_mockLoaded_12();

        private final native USSquadsSettingsViewModel Swift_Companion_mock_11();

        public static final /* synthetic */ long access$Swift_Companion_constructor_5(Companion companion, ESquad eSquad, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_5(eSquad, callbacks);
        }

        public final MemberFilter MemberFilter(String rawValue) {
            rawValue.getClass();
            return MemberFilter.INSTANCE.init(rawValue);
        }

        public final MuteDuration MuteDuration(String rawValue) {
            rawValue.getClass();
            return MuteDuration.INSTANCE.init(rawValue);
        }

        public final USSquadsSettingsViewModel mock() {
            return Swift_Companion_mock_11();
        }

        public final USSquadsSettingsViewModel mockLoaded() {
            return Swift_Companion_mockLoaded_12();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0001AB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBM\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\b\u0010\u0017J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0015\u0010\u001e\u001a\u00020\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u000eH\u0016J\u0015\u0010\"\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010$\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010'\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010)\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010+\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010.\u001a\u00020\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00101\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00104\u001a\u0004\u0018\u00010\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JO\u00105\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0082 J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u0096\u0002J\u0019\u0010:\u001a\u0002072\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u0000H\u0082 J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u0002090>2\u0006\u0010?\u001a\u00020\u000eH\u0016J\u0017\u0010@\u001a\b\u0012\u0004\u0012\u0002090>2\u0006\u0010?\u001a\u00020\u000eH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u0010\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0011\u0010\u000f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010!R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u0006B"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$ShareContent;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "squadId", "", "squadName", "memberCount", "", "memberCountText", "totalTradeCount", "avatar", "Lcom/polymarket/usviewmodels/SquadsProfileAvatarPresentation;", "inviteLink", "Ljava/net/URI;", "squad", "Lcom/polymarket/data/ESquad;", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILcom/polymarket/usviewmodels/SquadsProfileAvatarPresentation;Ljava/net/URI;Lcom/polymarket/data/ESquad;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "getSquadId", "()Ljava/lang/String;", "Swift_squadId", "getSquadName", "Swift_squadName", "getMemberCount", "()I", "Swift_memberCount", "getTotalTradeCount", "Swift_totalTradeCount", "getMemberCountText", "Swift_memberCountText", "getAvatar", "()Lcom/polymarket/usviewmodels/SquadsProfileAvatarPresentation;", "Swift_avatar", "getInviteLink", "()Ljava/net/URI;", "Swift_inviteLink", "getSquad", "()Lcom/polymarket/data/ESquad;", "Swift_squad", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class ShareContent implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public ShareContent(String str, String str2, int i, String str3, int i2, SquadsProfileAvatarPresentation squadsProfileAvatarPresentation, URI uri, ESquad eSquad) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            squadsProfileAvatarPresentation.getClass();
            uri.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, i, str3, i2, squadsProfileAvatarPresentation, uri, eSquad);
        }

        private final native SquadsProfileAvatarPresentation Swift_avatar(long Swift_peer);

        private final native long Swift_constructor_0(String squadId, String squadName, int memberCount, String memberCountText, int totalTradeCount, SquadsProfileAvatarPresentation avatar, URI inviteLink, ESquad squad);

        private final native URI Swift_inviteLink(long Swift_peer);

        private final native boolean Swift_isequal(ShareContent lhs, ShareContent rhs);

        private final native int Swift_memberCount(long Swift_peer);

        private final native String Swift_memberCountText(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native ESquad Swift_squad(long Swift_peer);

        private final native String Swift_squadId(long Swift_peer);

        private final native String Swift_squadName(long Swift_peer);

        private final native int Swift_totalTradeCount(long Swift_peer);

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
            if (other == this) {
                return true;
            }
            if (!(other instanceof ShareContent)) {
                return false;
            }
            return Swift_isequal(this, (ShareContent) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final SquadsProfileAvatarPresentation getAvatar() {
            return Swift_avatar(this.Swift_peer);
        }

        public final URI getInviteLink() {
            return Swift_inviteLink(this.Swift_peer);
        }

        public final int getMemberCount() {
            return Swift_memberCount(this.Swift_peer);
        }

        public final String getMemberCountText() {
            return Swift_memberCountText(this.Swift_peer);
        }

        public final ESquad getSquad() {
            return Swift_squad(this.Swift_peer);
        }

        public final String getSquadId() {
            return Swift_squadId(this.Swift_peer);
        }

        public final String getSquadName() {
            return Swift_squadName(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final int getTotalTradeCount() {
            return Swift_totalTradeCount(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public ShareContent(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ ShareContent(String str, String str2, int i, String str3, int i2, SquadsProfileAvatarPresentation squadsProfileAvatarPresentation, URI uri, ESquad eSquad, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, i, str3, i2, squadsProfileAvatarPresentation, uri, (i3 & 128) != 0 ? null : eSquad);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USSquadsSettingsViewModel(ESquad eSquad, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_5(INSTANCE, eSquad, callbacks), (SwiftPeerMarker) null);
        eSquad.getClass();
        callbacks.getClass();
    }

    public USSquadsSettingsViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\b\u0007\u0018\u0000 H2\u00020\u00012\u00020\u0002:\u0001HB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBõ\u0001\b\u0016\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u001a\b\u0002\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u0012\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\r0\u000b\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001c\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001c¢\u0006\u0004\b\b\u0010\u001eJ\u0006\u0010#\u001a\u00020\rJ\u0015\u0010$\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0096\u0002J\b\u0010)\u001a\u00020*H\u0016J!\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J'\u00104\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010A\u001a\b\u0012\u0004\u0012\u00020\r0\u001c2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010C\u001a\b\u0012\u0004\u0012\u00020\r0\u001c2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 Jã\u0001\u0010D\u001a\u00060\u0004j\u0002`\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001cH\u0082 J\u0016\u0010E\u001a\b\u0012\u0004\u0012\u00020(0\u001c2\u0006\u0010F\u001a\u00020*H\u0016J\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020(0\u001c2\u0006\u0010F\u001a\u00020*H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b.\u0010,R\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b0\u0010,R#\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u00128F¢\u0006\u0006\u001a\u0004\b2\u00103R\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b5\u0010,R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b7\u0010,R\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b9\u0010,R\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b;\u0010,R\u001d\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b=\u0010,R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001c8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001c8F¢\u0006\u0006\u001a\u0004\bB\u0010@¨\u0006I"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onGroupDetailUpdated", "Lkotlin/Function1;", "Lcom/polymarket/data/ESquad;", "", "onShare", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$ShareContent;", "onInviteNewMembers", "onChangeNameOrImage", "Lkotlin/Function2;", "Lcom/polymarket/usviewmodels/SquadsProfileAvatarPresentation;", "onNicknames", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel;", "onSquadMembers", "onVisibilityAndPermissions", "onPublicSquadInfo", "onMemberSelected", "Lcom/polymarket/usviewmodels/SquadsUserProfileViewModel;", "onSquadDeleted", "Lkotlin/Function0;", "onSquadLeft", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnGroupDetailUpdated", "()Lkotlin/jvm/functions/Function1;", "Swift_onGroupDetailUpdated", "getOnShare", "Swift_onShare", "getOnInviteNewMembers", "Swift_onInviteNewMembers", "getOnChangeNameOrImage", "()Lkotlin/jvm/functions/Function2;", "Swift_onChangeNameOrImage", "getOnNicknames", "Swift_onNicknames", "getOnSquadMembers", "Swift_onSquadMembers", "getOnVisibilityAndPermissions", "Swift_onVisibilityAndPermissions", "getOnPublicSquadInfo", "Swift_onPublicSquadInfo", "getOnMemberSelected", "Swift_onMemberSelected", "getOnSquadDeleted", "()Lkotlin/jvm/functions/Function0;", "Swift_onSquadDeleted", "getOnSquadLeft", "Swift_onSquadLeft", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Callbacks(Function1 function1, Function1 function12, Function1 function13, Function2 function2, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Function1 function18, Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(function1, function12, function13, r1, r2, r3, r4, r5, r6, r7, r22);
            Function2 function22;
            Function1 function19;
            Function1 function110;
            Function1 function111;
            Function1 function112;
            Function1 function113;
            Function0 function03;
            Function0 function04;
            function1 = (i & 1) != 0 ? new wmj(28) : function1;
            function12 = (i & 2) != 0 ? new wmj(29) : function12;
            function13 = (i & 4) != 0 ? new hrj(0) : function13;
            if ((i & 8) != 0) {
                function22 = new zyi(24);
            } else {
                function22 = function2;
            }
            if ((i & 16) != 0) {
                function19 = new hrj(1);
            } else {
                function19 = function14;
            }
            if ((i & 32) != 0) {
                function110 = new hrj(2);
            } else {
                function110 = function15;
            }
            if ((i & 64) != 0) {
                function111 = new hrj(3);
            } else {
                function111 = function16;
            }
            if ((i & 128) != 0) {
                function112 = new hrj(4);
            } else {
                function112 = function17;
            }
            if ((i & 256) != 0) {
                function113 = new hrj(5);
            } else {
                function113 = function18;
            }
            if ((i & Barcode.FORMAT_UPC_A) != 0) {
                function03 = new hoj(19);
            } else {
                function03 = function0;
            }
            if ((i & Barcode.FORMAT_UPC_E) != 0) {
                function04 = new hoj(20);
            } else {
                function04 = function02;
            }
        }

        private final native long Swift_constructor_0(Function1<? super ESquad, Unit> onGroupDetailUpdated, Function1<? super ShareContent, Unit> onShare, Function1<? super ShareContent, Unit> onInviteNewMembers, Function2<? super ESquad, ? super SquadsProfileAvatarPresentation, Unit> onChangeNameOrImage, Function1<? super USSquadsSettingsViewModel, Unit> onNicknames, Function1<? super USSquadsSettingsViewModel, Unit> onSquadMembers, Function1<? super USSquadsSettingsViewModel, Unit> onVisibilityAndPermissions, Function1<? super USSquadsSettingsViewModel, Unit> onPublicSquadInfo, Function1<? super SquadsUserProfileViewModel, Unit> onMemberSelected, Function0<Unit> onSquadDeleted, Function0<Unit> onSquadLeft);

        private final native Function2<ESquad, SquadsProfileAvatarPresentation, Unit> Swift_onChangeNameOrImage(long Swift_peer);

        private final native Function1<ESquad, Unit> Swift_onGroupDetailUpdated(long Swift_peer);

        private final native Function1<ShareContent, Unit> Swift_onInviteNewMembers(long Swift_peer);

        private final native Function1<SquadsUserProfileViewModel, Unit> Swift_onMemberSelected(long Swift_peer);

        private final native Function1<USSquadsSettingsViewModel, Unit> Swift_onNicknames(long Swift_peer);

        private final native Function1<USSquadsSettingsViewModel, Unit> Swift_onPublicSquadInfo(long Swift_peer);

        private final native Function1<ShareContent, Unit> Swift_onShare(long Swift_peer);

        private final native Function0<Unit> Swift_onSquadDeleted(long Swift_peer);

        private final native Function0<Unit> Swift_onSquadLeft(long Swift_peer);

        private final native Function1<USSquadsSettingsViewModel, Unit> Swift_onSquadMembers(long Swift_peer);

        private final native Function1<USSquadsSettingsViewModel, Unit> Swift_onVisibilityAndPermissions(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(ESquad eSquad) {
            eSquad.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(ShareContent shareContent) {
            shareContent.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$10() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2(ShareContent shareContent) {
            shareContent.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$3(ESquad eSquad, SquadsProfileAvatarPresentation squadsProfileAvatarPresentation) {
            eSquad.getClass();
            squadsProfileAvatarPresentation.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$4(USSquadsSettingsViewModel uSSquadsSettingsViewModel) {
            uSSquadsSettingsViewModel.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$5(USSquadsSettingsViewModel uSSquadsSettingsViewModel) {
            uSSquadsSettingsViewModel.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$6(USSquadsSettingsViewModel uSSquadsSettingsViewModel) {
            uSSquadsSettingsViewModel.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$7(USSquadsSettingsViewModel uSSquadsSettingsViewModel) {
            uSSquadsSettingsViewModel.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$8(SquadsUserProfileViewModel squadsUserProfileViewModel) {
            squadsUserProfileViewModel.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$9() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(SquadsUserProfileViewModel squadsUserProfileViewModel) {
            return _init_$lambda$8(squadsUserProfileViewModel);
        }

        public static /* synthetic */ Unit b(USSquadsSettingsViewModel uSSquadsSettingsViewModel) {
            return _init_$lambda$5(uSSquadsSettingsViewModel);
        }

        public static /* synthetic */ Unit c(ShareContent shareContent) {
            return _init_$lambda$2(shareContent);
        }

        public static /* synthetic */ Unit d(USSquadsSettingsViewModel uSSquadsSettingsViewModel) {
            return _init_$lambda$6(uSSquadsSettingsViewModel);
        }

        public static /* synthetic */ Unit e(ESquad eSquad) {
            return _init_$lambda$0(eSquad);
        }

        public static /* synthetic */ Unit f(ESquad eSquad, SquadsProfileAvatarPresentation squadsProfileAvatarPresentation) {
            return _init_$lambda$3(eSquad, squadsProfileAvatarPresentation);
        }

        public static /* synthetic */ Unit g(ShareContent shareContent) {
            return _init_$lambda$1(shareContent);
        }

        public static /* synthetic */ Unit h(USSquadsSettingsViewModel uSSquadsSettingsViewModel) {
            return _init_$lambda$7(uSSquadsSettingsViewModel);
        }

        public static /* synthetic */ Unit i() {
            return _init_$lambda$10();
        }

        public static /* synthetic */ Unit j(USSquadsSettingsViewModel uSSquadsSettingsViewModel) {
            return _init_$lambda$4(uSSquadsSettingsViewModel);
        }

        public static /* synthetic */ Unit k() {
            return _init_$lambda$9();
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

        public final Function2<ESquad, SquadsProfileAvatarPresentation, Unit> getOnChangeNameOrImage() {
            return Swift_onChangeNameOrImage(this.Swift_peer);
        }

        public final Function1<ESquad, Unit> getOnGroupDetailUpdated() {
            return Swift_onGroupDetailUpdated(this.Swift_peer);
        }

        public final Function1<ShareContent, Unit> getOnInviteNewMembers() {
            return Swift_onInviteNewMembers(this.Swift_peer);
        }

        public final Function1<SquadsUserProfileViewModel, Unit> getOnMemberSelected() {
            return Swift_onMemberSelected(this.Swift_peer);
        }

        public final Function1<USSquadsSettingsViewModel, Unit> getOnNicknames() {
            return Swift_onNicknames(this.Swift_peer);
        }

        public final Function1<USSquadsSettingsViewModel, Unit> getOnPublicSquadInfo() {
            return Swift_onPublicSquadInfo(this.Swift_peer);
        }

        public final Function1<ShareContent, Unit> getOnShare() {
            return Swift_onShare(this.Swift_peer);
        }

        public final Function0<Unit> getOnSquadDeleted() {
            return Swift_onSquadDeleted(this.Swift_peer);
        }

        public final Function0<Unit> getOnSquadLeft() {
            return Swift_onSquadLeft(this.Swift_peer);
        }

        public final Function1<USSquadsSettingsViewModel, Unit> getOnSquadMembers() {
            return Swift_onSquadMembers(this.Swift_peer);
        }

        public final Function1<USSquadsSettingsViewModel, Unit> getOnVisibilityAndPermissions() {
            return Swift_onVisibilityAndPermissions(this.Swift_peer);
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

        public Callbacks(Function1<? super ESquad, Unit> function1, Function1<? super ShareContent, Unit> function12, Function1<? super ShareContent, Unit> function13, Function2<? super ESquad, ? super SquadsProfileAvatarPresentation, Unit> function2, Function1<? super USSquadsSettingsViewModel, Unit> function14, Function1<? super USSquadsSettingsViewModel, Unit> function15, Function1<? super USSquadsSettingsViewModel, Unit> function16, Function1<? super USSquadsSettingsViewModel, Unit> function17, Function1<? super SquadsUserProfileViewModel, Unit> function18, Function0<Unit> function0, Function0<Unit> function02) {
            function1.getClass();
            function12.getClass();
            function13.getClass();
            function2.getClass();
            function14.getClass();
            function15.getClass();
            function16.getClass();
            function17.getClass();
            function18.getClass();
            function0.getClass();
            function02.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function1, function12, function13, function2, function14, function15, function16, function17, function18, function0, function02);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
