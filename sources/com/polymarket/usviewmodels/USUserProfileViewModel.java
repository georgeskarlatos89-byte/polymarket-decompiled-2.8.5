package com.polymarket.usviewmodels;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.EAccountRestriction;
import com.polymarket.data.EAmount;
import com.polymarket.data.ECalendarDayPnL;
import com.polymarket.data.EError;
import com.polymarket.data.EUser;
import com.polymarket.data.ScrollCommandType;
import com.polymarket.usviewmodels.AppViewModel;
import com.polymarket.usviewmodels.PromotionsViewModel;
import com.polymarket.usviewmodels.USUserActivityViewModel;
import com.polymarket.usviewmodels.UserPositionsViewModel;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.hoj;
import defpackage.hrj;
import defpackage.tsj;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
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
import skip.lib.Array;
import skip.lib.ArrayKt;
import skip.lib.CaseIterable;
import skip.lib.CaseIterableCompanion;
import skip.lib.RawRepresentable;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b9\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000 \u009b\u00022\u00020\u0001:\n\u0097\u0002\u0098\u0002\u0099\u0002\u009a\u0002\u009b\u0002B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001f\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u001d\u0010\u0012\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0082 J\u0015\u0010\u0016\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u0019\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u001c\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u001f\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010$\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010'\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010,\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010/\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00102\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00105\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00108\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010;\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010>\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010A\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010D\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010G\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010L\u001a\u0004\u0018\u00010I2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010T\u001a\u00020N2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010U\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010V\u001a\u00020NH\u0082 J\u0015\u0010Y\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010`\u001a\u00020Z2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010a\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010V\u001a\u00020ZH\u0082 J\u0015\u0010h\u001a\u00020b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010i\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010V\u001a\u00020bH\u0082 J\u001b\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00110j2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010q\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00110jH\u0082 J\u0015\u0010x\u001a\u00020r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010y\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010V\u001a\u00020rH\u0082 J\u0015\u0010~\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u007f\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010V\u001a\u00020)H\u0082 J\u0016\u0010\u0083\u0001\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010\u0084\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010V\u001a\u00020)H\u0082 J\u0016\u0010\u0088\u0001\u001a\u00020r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010\u0089\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010V\u001a\u00020rH\u0082 J\u0016\u0010\u008d\u0001\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010\u008e\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010V\u001a\u00020)H\u0082 J\u0018\u0010\u0092\u0001\u001a\u0004\u0018\u00010)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J \u0010\u0093\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010V\u001a\u0004\u0018\u00010)H\u0082 J\u0016\u0010\u0097\u0001\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010\u0098\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010V\u001a\u00020)H\u0082 J\u0016\u0010\u009c\u0001\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010\u009d\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010V\u001a\u00020)H\u0082 J\u0016\u0010¢\u0001\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010£\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010V\u001a\u00020!H\u0082 J\u0016\u0010¦\u0001\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010§\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010V\u001a\u00020!H\u0082 J\u0016\u0010ª\u0001\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010«\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010V\u001a\u00020!H\u0082 J\u0019\u0010²\u0001\u001a\u0005\u0018\u00010¬\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J!\u0010³\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\t\u0010V\u001a\u0005\u0018\u00010¬\u0001H\u0082 J\u0019\u0010º\u0001\u001a\u0005\u0018\u00010´\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J!\u0010»\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\t\u0010V\u001a\u0005\u0018\u00010´\u0001H\u0082 J\u0019\u0010Â\u0001\u001a\u0005\u0018\u00010¼\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J!\u0010Ã\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\t\u0010V\u001a\u0005\u0018\u00010¼\u0001H\u0082 J\u0017\u0010È\u0001\u001a\u00030Å\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010Í\u0001\u001a\u00030Ê\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010Ò\u0001\u001a\u00030Ï\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0019\u0010×\u0001\u001a\u0005\u0018\u00010Ô\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0019\u0010Þ\u0001\u001a\u0005\u0018\u00010Ø\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J!\u0010ß\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\t\u0010V\u001a\u0005\u0018\u00010Ø\u0001H\u0082 J\u0019\u0010æ\u0001\u001a\u0005\u0018\u00010à\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J!\u0010ç\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\t\u0010V\u001a\u0005\u0018\u00010à\u0001H\u0082 J\u0016\u0010é\u0001\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010ì\u0001\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010í\u0001\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010V\u001a\u00020!H\u0082 J½\u0001\u0010î\u0001\u001a\u00020\u000f2\u0010\b\u0002\u0010ï\u0001\u001a\t\u0012\u0004\u0012\u00020\u000f0ð\u00012\u0010\b\u0002\u0010ñ\u0001\u001a\t\u0012\u0004\u0012\u00020\u000f0ð\u00012\u0010\b\u0002\u0010ò\u0001\u001a\t\u0012\u0004\u0012\u00020\u000f0ð\u00012\u0010\b\u0002\u0010ó\u0001\u001a\t\u0012\u0004\u0012\u00020\u000f0ð\u00012\u0016\b\u0002\u0010ô\u0001\u001a\u000f\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\u000f0õ\u00012\u0017\b\u0002\u0010ö\u0001\u001a\u0010\u0012\u0005\u0012\u00030÷\u0001\u0012\u0004\u0012\u00020\u000f0õ\u00012\n\b\u0002\u0010ø\u0001\u001a\u00030ù\u00012\n\b\u0002\u0010ú\u0001\u001a\u00030û\u00012\u0017\b\u0002\u0010ü\u0001\u001a\u0010\u0012\u0005\u0012\u00030ý\u0001\u0012\u0004\u0012\u00020\u000f0õ\u00012\n\b\u0002\u0010þ\u0001\u001a\u00030ÿ\u0001J¸\u0001\u0010\u0080\u0002\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u000e\u0010ï\u0001\u001a\t\u0012\u0004\u0012\u00020\u000f0ð\u00012\u000e\u0010ñ\u0001\u001a\t\u0012\u0004\u0012\u00020\u000f0ð\u00012\u000e\u0010ò\u0001\u001a\t\u0012\u0004\u0012\u00020\u000f0ð\u00012\u000e\u0010ó\u0001\u001a\t\u0012\u0004\u0012\u00020\u000f0ð\u00012\u0014\u0010ô\u0001\u001a\u000f\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\u000f0õ\u00012\u0015\u0010ö\u0001\u001a\u0010\u0012\u0005\u0012\u00030÷\u0001\u0012\u0004\u0012\u00020\u000f0õ\u00012\b\u0010ø\u0001\u001a\u00030ù\u00012\b\u0010ú\u0001\u001a\u00030û\u00012\u0015\u0010ü\u0001\u001a\u0010\u0012\u0005\u0012\u00030ý\u0001\u0012\u0004\u0012\u00020\u000f0õ\u00012\b\u0010þ\u0001\u001a\u00030ÿ\u0001H\u0082 J\t\u0010\u0081\u0002\u001a\u00020\u000fH\u0016J\u0016\u0010\u0082\u0002\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0084\u0002\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0086\u0002\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0019\u0010\u0087\u0002\u001a\u00030\u0088\u00022\t\u0010\u0089\u0002\u001a\u0004\u0018\u00010r¢\u0006\u0003\u0010\u008a\u0002J(\u0010\u008b\u0002\u001a\u00030\u0088\u00022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\t\u0010\u0089\u0002\u001a\u0004\u0018\u00010rH\u0082 ¢\u0006\u0003\u0010\u008c\u0002J\u0011\u0010\u008d\u0002\u001a\u00020\u000f2\b\u0010\u008e\u0002\u001a\u00030\u008f\u0002J \u0010\u0090\u0002\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u008e\u0002\u001a\u00030\u008f\u0002H\u0082 J\t\u0010\u0091\u0002\u001a\u00020\u000fH\u0016J\u0016\u0010\u0092\u0002\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001a\u0010\u0093\u0002\u001a\n\u0012\u0005\u0012\u00030\u0094\u00020ð\u00012\u0007\u0010\u0095\u0002\u001a\u00020bH\u0016J\u001b\u0010\u0096\u0002\u001a\n\u0012\u0005\u0012\u00030\u0094\u00020ð\u00012\u0007\u0010\u0095\u0002\u001a\u00020bH\u0082 R\u0011\u0010\u0013\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u001d\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010%\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b&\u0010#R\u0011\u0010(\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010-\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b.\u0010#R\u0011\u00100\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b1\u0010\u0015R\u0011\u00103\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b4\u0010#R\u0011\u00106\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b7\u0010#R\u0011\u00109\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b:\u0010\u0015R\u0011\u0010<\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b=\u0010\u0015R\u0011\u0010?\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b@\u0010\u0015R\u0011\u0010B\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bC\u0010\u0015R\u0011\u0010E\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bF\u0010\u0015R\u0013\u0010H\u001a\u0004\u0018\u00010I8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR$\u0010O\u001a\u00020N2\u0006\u0010M\u001a\u00020N8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0011\u0010W\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\bX\u0010#R$\u0010[\u001a\u00020Z2\u0006\u0010M\u001a\u00020Z8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R$\u0010c\u001a\u00020b2\u0006\u0010M\u001a\u00020b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR0\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00110j2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00110j8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR$\u0010s\u001a\u00020r2\u0006\u0010M\u001a\u00020r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR$\u0010z\u001a\u00020)2\u0006\u0010M\u001a\u00020)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b{\u0010+\"\u0004\b|\u0010}R'\u0010\u0080\u0001\u001a\u00020)2\u0006\u0010M\u001a\u00020)8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0081\u0001\u0010+\"\u0005\b\u0082\u0001\u0010}R'\u0010\u0085\u0001\u001a\u00020r2\u0006\u0010M\u001a\u00020r8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0086\u0001\u0010u\"\u0005\b\u0087\u0001\u0010wR'\u0010\u008a\u0001\u001a\u00020)2\u0006\u0010M\u001a\u00020)8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008b\u0001\u0010+\"\u0005\b\u008c\u0001\u0010}R+\u0010\u008f\u0001\u001a\u0004\u0018\u00010)2\b\u0010M\u001a\u0004\u0018\u00010)8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0090\u0001\u0010+\"\u0005\b\u0091\u0001\u0010}R'\u0010\u0094\u0001\u001a\u00020)2\u0006\u0010M\u001a\u00020)8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0095\u0001\u0010+\"\u0005\b\u0096\u0001\u0010}R'\u0010\u0099\u0001\u001a\u00020)2\u0006\u0010M\u001a\u00020)8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u009a\u0001\u0010+\"\u0005\b\u009b\u0001\u0010}R(\u0010\u009e\u0001\u001a\u00020!2\u0006\u0010M\u001a\u00020!8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u009f\u0001\u0010#\"\u0006\b \u0001\u0010¡\u0001R(\u0010¤\u0001\u001a\u00020!2\u0006\u0010M\u001a\u00020!8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b¤\u0001\u0010#\"\u0006\b¥\u0001\u0010¡\u0001R(\u0010¨\u0001\u001a\u00020!2\u0006\u0010M\u001a\u00020!8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b¨\u0001\u0010#\"\u0006\b©\u0001\u0010¡\u0001R/\u0010\u00ad\u0001\u001a\u0005\u0018\u00010¬\u00012\t\u0010M\u001a\u0005\u0018\u00010¬\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R/\u0010µ\u0001\u001a\u0005\u0018\u00010´\u00012\t\u0010M\u001a\u0005\u0018\u00010´\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R/\u0010½\u0001\u001a\u0005\u0018\u00010¼\u00012\t\u0010M\u001a\u0005\u0018\u00010¼\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R\u0015\u0010Ä\u0001\u001a\u00030Å\u00018F¢\u0006\b\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\u0015\u0010É\u0001\u001a\u00030Ê\u00018F¢\u0006\b\u001a\u0006\bË\u0001\u0010Ì\u0001R\u0015\u0010Î\u0001\u001a\u00030Ï\u00018F¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R\u0017\u0010Ó\u0001\u001a\u0005\u0018\u00010Ô\u00018F¢\u0006\b\u001a\u0006\bÕ\u0001\u0010Ö\u0001R/\u0010Ù\u0001\u001a\u0005\u0018\u00010Ø\u00012\t\u0010M\u001a\u0005\u0018\u00010Ø\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R/\u0010á\u0001\u001a\u0005\u0018\u00010à\u00012\t\u0010M\u001a\u0005\u0018\u00010à\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bâ\u0001\u0010ã\u0001\"\u0006\bä\u0001\u0010å\u0001R\u0013\u0010è\u0001\u001a\u00020!8F¢\u0006\u0007\u001a\u0005\bè\u0001\u0010#R(\u0010ê\u0001\u001a\u00020!2\u0006\u0010M\u001a\u00020!8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bê\u0001\u0010#\"\u0006\bë\u0001\u0010¡\u0001R\u0013\u0010\u0083\u0002\u001a\u00020!8F¢\u0006\u0007\u001a\u0005\b\u0083\u0002\u0010#R\u0013\u0010\u0085\u0002\u001a\u00020!8F¢\u0006\u0007\u001a\u0005\b\u0085\u0002\u0010#¨\u0006\u009c\u0002"}, d2 = {"Lcom/polymarket/usviewmodels/USUserProfileViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "(Lcom/polymarket/usviewmodels/AppSceneType;Ljava/lang/String;)V", "setCurrentTab", "", "tab", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Tab;", "Swift_setCurrentTab_0", "navigationTitle", "getNavigationTitle", "()Ljava/lang/String;", "Swift_navigationTitle", "depositButtonTitle", "getDepositButtonTitle", "Swift_depositButtonTitle", "withdrawButtonTitle", "getWithdrawButtonTitle", "Swift_withdrawButtonTitle", "cashBalanceText", "getCashBalanceText", "Swift_cashBalanceText", "shouldShowBalanceInfoButton", "", "getShouldShowBalanceInfoButton", "()Z", "Swift_shouldShowBalanceInfoButton", "shouldShowBonusBreakdown", "getShouldShowBonusBreakdown", "Swift_shouldShowBonusBreakdown", "bonusBalance", "Lcom/polymarket/data/EAmount;", "getBonusBalance", "()Lcom/polymarket/data/EAmount;", "Swift_bonusBalance", "shouldShowBonusBalance", "getShouldShowBonusBalance", "Swift_shouldShowBonusBalance", "unavailableBalanceLabel", "getUnavailableBalanceLabel", "Swift_unavailableBalanceLabel", "shouldShowUnavailableBalance", "getShouldShowUnavailableBalance", "Swift_shouldShowUnavailableBalance", "shouldShowBalanceInfoFooter", "getShouldShowBalanceInfoFooter", "Swift_shouldShowBalanceInfoFooter", "cashBalanceLabel", "getCashBalanceLabel", "Swift_cashBalanceLabel", "bonusBalanceLabel", "getBonusBalanceLabel", "Swift_bonusBalanceLabel", "availableToTradeLabel", "getAvailableToTradeLabel", "Swift_availableToTradeLabel", "balanceInfoTitle", "getBalanceInfoTitle", "Swift_balanceInfoTitle", "balanceInfoFooterMarkdown", "getBalanceInfoFooterMarkdown", "Swift_balanceInfoFooterMarkdown", "promoCreditsDisclaimer", "Lcom/polymarket/usviewmodels/PromoCreditsDisclaimerPresentation;", "getPromoCreditsDisclaimer", "()Lcom/polymarket/usviewmodels/PromoCreditsDisclaimerPresentation;", "Swift_promoCreditsDisclaimer", "newValue", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$ProfileChartMode;", "profileChartMode", "getProfileChartMode", "()Lcom/polymarket/usviewmodels/USUserProfileViewModel$ProfileChartMode;", "setProfileChartMode", "(Lcom/polymarket/usviewmodels/USUserProfileViewModel$ProfileChartMode;)V", "Swift_profileChartMode", "Swift_profileChartMode_set", "value", "calendarAnimateEntrance", "getCalendarAnimateEntrance", "Swift_calendarAnimateEntrance", "Lcom/polymarket/data/EUser;", "user", "getUser", "()Lcom/polymarket/data/EUser;", "setUser", "(Lcom/polymarket/data/EUser;)V", "Swift_user", "Swift_user_set", "", "currentTabIndex", "getCurrentTabIndex", "()I", "setCurrentTabIndex", "(I)V", "Swift_currentTabIndex", "Swift_currentTabIndex_set", "", "tabs", "getTabs", "()Ljava/util/List;", "setTabs", "(Ljava/util/List;)V", "Swift_tabs", "Swift_tabs_set", "", "scrollProgress", "getScrollProgress", "()D", "setScrollProgress", "(D)V", "Swift_scrollProgress", "Swift_scrollProgress_set", "portfolioValue", "getPortfolioValue", "setPortfolioValue", "(Lcom/polymarket/data/EAmount;)V", "Swift_portfolioValue", "Swift_portfolioValue_set", "allTimePnl", "getAllTimePnl", "setAllTimePnl", "Swift_allTimePnl", "Swift_allTimePnl_set", "allTimeReturnPercentage", "getAllTimeReturnPercentage", "setAllTimeReturnPercentage", "Swift_allTimeReturnPercentage", "Swift_allTimeReturnPercentage_set", "displayedCashBalance", "getDisplayedCashBalance", "setDisplayedCashBalance", "Swift_displayedCashBalance", "Swift_displayedCashBalance_set", "displayedBonusHold", "getDisplayedBonusHold", "setDisplayedBonusHold", "Swift_displayedBonusHold", "Swift_displayedBonusHold_set", "balanceInfoCashAmount", "getBalanceInfoCashAmount", "setBalanceInfoCashAmount", "Swift_balanceInfoCashAmount", "Swift_balanceInfoCashAmount_set", "unavailableBalance", "getUnavailableBalance", "setUnavailableBalance", "Swift_unavailableBalance", "Swift_unavailableBalance_set", "hasReservationSplit", "getHasReservationSplit", "setHasReservationSplit", "(Z)V", "Swift_hasReservationSplit", "Swift_hasReservationSplit_set", "isBonusBreakdownEnabled", "setBonusBreakdownEnabled", "Swift_isBonusBreakdownEnabled", "Swift_isBonusBreakdownEnabled_set", "isShowingBalanceInfo", "setShowingBalanceInfo", "Swift_isShowingBalanceInfo", "Swift_isShowingBalanceInfo_set", "Lcom/polymarket/data/EAccountRestriction;", "restriction", "getRestriction", "()Lcom/polymarket/data/EAccountRestriction;", "setRestriction", "(Lcom/polymarket/data/EAccountRestriction;)V", "Swift_restriction", "Swift_restriction_set", "Lcom/polymarket/data/ScrollCommandType;", "scrollCommand", "getScrollCommand", "()Lcom/polymarket/data/ScrollCommandType;", "setScrollCommand", "(Lcom/polymarket/data/ScrollCommandType;)V", "Swift_scrollCommand", "Swift_scrollCommand_set", "Lcom/polymarket/data/EError;", "error", "getError", "()Lcom/polymarket/data/EError;", "setError", "(Lcom/polymarket/data/EError;)V", "Swift_error", "Swift_error_set", "userPositionsVM", "Lcom/polymarket/usviewmodels/UserPositionsViewModel;", "getUserPositionsVM", "()Lcom/polymarket/usviewmodels/UserPositionsViewModel;", "Swift_userPositionsVM", "userOrdersVM", "Lcom/polymarket/usviewmodels/UserOrdersViewModel;", "getUserOrdersVM", "()Lcom/polymarket/usviewmodels/UserOrdersViewModel;", "Swift_userOrdersVM", "userActivityUSVM", "Lcom/polymarket/usviewmodels/USUserActivityViewModel;", "getUserActivityUSVM", "()Lcom/polymarket/usviewmodels/USUserActivityViewModel;", "Swift_userActivityUSVM", "userProfileChartVM", "Lcom/polymarket/usviewmodels/UserProfileChartViewModel;", "getUserProfileChartVM", "()Lcom/polymarket/usviewmodels/UserProfileChartViewModel;", "Swift_userProfileChartVM", "Lcom/polymarket/usviewmodels/CalendarPnLViewModel;", "calendarPnLVM", "getCalendarPnLVM", "()Lcom/polymarket/usviewmodels/CalendarPnLViewModel;", "setCalendarPnLVM", "(Lcom/polymarket/usviewmodels/CalendarPnLViewModel;)V", "Swift_calendarPnLVM", "Swift_calendarPnLVM_set", "Lcom/polymarket/usviewmodels/PromotionsViewModel;", "usPromotionsVM", "getUsPromotionsVM", "()Lcom/polymarket/usviewmodels/PromotionsViewModel;", "setUsPromotionsVM", "(Lcom/polymarket/usviewmodels/PromotionsViewModel;)V", "Swift_usPromotionsVM", "Swift_usPromotionsVM_set", "isPromotionsCarouselVisible", "Swift_isPromotionsCarouselVisible", "isCashBalanceHidden", "setCashBalanceHidden", "Swift_isCashBalanceHidden", "Swift_isCashBalanceHidden_set", "setCallbacks", "onClose", "Lkotlin/Function0;", "onSettings", "onDeposit", "onWithdraw", "onShare", "Lkotlin/Function1;", "onOpenURL", "Ljava/net/URI;", "userPositionsCallbacks", "Lcom/polymarket/usviewmodels/UserPositionsViewModel$Callbacks;", "userActivityUSCallbacks", "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Callbacks;", "onCalendarDaySelected", "Lcom/polymarket/data/ECalendarDayPnL;", "usPromotionsCallbacks", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Callbacks;", "Swift_setCallbacks_3", "setup", "Swift_setup_4", "isWithdrawEnabled", "Swift_isWithdrawEnabled", "isRestrictionBannerVisible", "Swift_isRestrictionBannerVisible", "headerPnLPresentation", "Lcom/polymarket/usviewmodels/UserProfileHeaderPnLPresentation;", "scrubbedValue", "(Ljava/lang/Double;)Lcom/polymarket/usviewmodels/UserProfileHeaderPnLPresentation;", "Swift_headerPnLPresentation_5", "(JLjava/lang/Double;)Lcom/polymarket/usviewmodels/UserProfileHeaderPnLPresentation;", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input;", "Swift_sendInput_6", "handleBecomeForeground", "Swift_handleBecomeForeground_7", "Swift_projection", "", "options", "Swift_projectionImpl", "Callbacks", "Tab", "ProfileChartMode", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class USUserProfileViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 H2\u00020\u00012\u00020\u0002:\u0001HB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J'\u0010#\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0018\u0012\u0004\u0012\u00020\u000f0 2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J'\u0010&\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0018\u0012\u0004\u0012\u00020\u000f0 2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u000f0 2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u000f0 2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u00101\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00106\u001a\u0002032\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010;\u001a\u0002082\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010?\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u000f0 2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010D\u001a\u00020A2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010F\u001a\u00020\u0016H\u0016J\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010F\u001a\u00020\u0016H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00188F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001aR#\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0018\u0012\u0004\u0012\u00020\u000f0 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R#\u0010$\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0018\u0012\u0004\u0012\u00020\u000f0 8F¢\u0006\u0006\u001a\u0004\b%\u0010\"R\u001d\u0010'\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u000f0 8F¢\u0006\u0006\u001a\u0004\b)\u0010\"R\u001d\u0010+\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u000f0 8F¢\u0006\u0006\u001a\u0004\b-\u0010\"R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00188F¢\u0006\u0006\u001a\u0004\b0\u0010\u001aR\u0011\u00102\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u00107\u001a\u0002088F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001d\u0010<\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u000f0 8F¢\u0006\u0006\u001a\u0004\b>\u0010\"R\u0011\u0010@\u001a\u00020A8F¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006I"}, d2 = {"Lcom/polymarket/usviewmodels/USUserProfileViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "onClose", "Lkotlin/Function0;", "getOnClose", "()Lkotlin/jvm/functions/Function0;", "Swift_onClose", "onSettings", "getOnSettings", "Swift_onSettings", "onDeposit", "Lkotlin/Function1;", "getOnDeposit", "()Lkotlin/jvm/functions/Function1;", "Swift_onDeposit", "onWithdraw", "getOnWithdraw", "Swift_onWithdraw", "onShare", "Lcom/polymarket/data/EUser;", "getOnShare", "Swift_onShare", "onOpenURL", "Ljava/net/URI;", "getOnOpenURL", "Swift_onOpenURL", "onContactSupport", "getOnContactSupport", "Swift_onContactSupport", "userPositionsCallbacks", "Lcom/polymarket/usviewmodels/UserPositionsViewModel$Callbacks;", "getUserPositionsCallbacks", "()Lcom/polymarket/usviewmodels/UserPositionsViewModel$Callbacks;", "Swift_userPositionsCallbacks", "userActivityUSCallbacks", "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Callbacks;", "getUserActivityUSCallbacks", "()Lcom/polymarket/usviewmodels/USUserActivityViewModel$Callbacks;", "Swift_userActivityUSCallbacks", "onCalendarDaySelected", "Lcom/polymarket/data/ECalendarDayPnL;", "getOnCalendarDaySelected", "Swift_onCalendarDaySelected", "usPromotionsCallbacks", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Callbacks;", "getUsPromotionsCallbacks", "()Lcom/polymarket/usviewmodels/PromotionsViewModel$Callbacks;", "Swift_usPromotionsCallbacks", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private final native Function1<ECalendarDayPnL, Unit> Swift_onCalendarDaySelected(long Swift_peer);

        private final native Function0<Unit> Swift_onClose(long Swift_peer);

        private final native Function0<Unit> Swift_onContactSupport(long Swift_peer);

        private final native Function1<Function0<Unit>, Unit> Swift_onDeposit(long Swift_peer);

        private final native Function1<URI, Unit> Swift_onOpenURL(long Swift_peer);

        private final native Function0<Unit> Swift_onSettings(long Swift_peer);

        private final native Function1<EUser, Unit> Swift_onShare(long Swift_peer);

        private final native Function1<Function0<Unit>, Unit> Swift_onWithdraw(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native PromotionsViewModel.Callbacks Swift_usPromotionsCallbacks(long Swift_peer);

        private final native USUserActivityViewModel.Callbacks Swift_userActivityUSCallbacks(long Swift_peer);

        private final native UserPositionsViewModel.Callbacks Swift_userPositionsCallbacks(long Swift_peer);

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

        public final Function1<ECalendarDayPnL, Unit> getOnCalendarDaySelected() {
            return Swift_onCalendarDaySelected(this.Swift_peer);
        }

        public final Function0<Unit> getOnClose() {
            return Swift_onClose(this.Swift_peer);
        }

        public final Function0<Unit> getOnContactSupport() {
            return Swift_onContactSupport(this.Swift_peer);
        }

        public final Function1<Function0<Unit>, Unit> getOnDeposit() {
            return Swift_onDeposit(this.Swift_peer);
        }

        public final Function1<URI, Unit> getOnOpenURL() {
            return Swift_onOpenURL(this.Swift_peer);
        }

        public final Function0<Unit> getOnSettings() {
            return Swift_onSettings(this.Swift_peer);
        }

        public final Function1<EUser, Unit> getOnShare() {
            return Swift_onShare(this.Swift_peer);
        }

        public final Function1<Function0<Unit>, Unit> getOnWithdraw() {
            return Swift_onWithdraw(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final PromotionsViewModel.Callbacks getUsPromotionsCallbacks() {
            return Swift_usPromotionsCallbacks(this.Swift_peer);
        }

        public final USUserActivityViewModel.Callbacks getUserActivityUSCallbacks() {
            return Swift_userActivityUSCallbacks(this.Swift_peer);
        }

        public final UserPositionsViewModel.Callbacks getUserPositionsCallbacks() {
            return Swift_userPositionsCallbacks(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/USUserProfileViewModel$ProfileChartMode;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "lineChart", "calendar", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class ProfileChartMode implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ ProfileChartMode[] $VALUES;
        public static final ProfileChartMode lineChart = new ProfileChartMode("lineChart", 0);
        public static final ProfileChartMode calendar = new ProfileChartMode("calendar", 1);

        private static final /* synthetic */ ProfileChartMode[] $values() {
            return new ProfileChartMode[]{lineChart, calendar};
        }

        static {
            ProfileChartMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private ProfileChartMode(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static ProfileChartMode valueOf(String str) {
            return (ProfileChartMode) Enum.valueOf(ProfileChartMode.class, str);
        }

        public static ProfileChartMode[] values() {
            return (ProfileChartMode[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    public /* synthetic */ USUserProfileViewModel(AppSceneType appSceneType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AppSceneDefault() : appSceneType, (i & 2) != 0 ? null : str);
    }

    private final native EAmount Swift_allTimePnl(long Swift_peer);

    private final native void Swift_allTimePnl_set(long Swift_peer, EAmount value);

    private final native double Swift_allTimeReturnPercentage(long Swift_peer);

    private final native void Swift_allTimeReturnPercentage_set(long Swift_peer, double value);

    private final native String Swift_availableToTradeLabel(long Swift_peer);

    private final native EAmount Swift_balanceInfoCashAmount(long Swift_peer);

    private final native void Swift_balanceInfoCashAmount_set(long Swift_peer, EAmount value);

    private final native String Swift_balanceInfoFooterMarkdown(long Swift_peer);

    private final native String Swift_balanceInfoTitle(long Swift_peer);

    private final native EAmount Swift_bonusBalance(long Swift_peer);

    private final native String Swift_bonusBalanceLabel(long Swift_peer);

    private final native boolean Swift_calendarAnimateEntrance(long Swift_peer);

    private final native CalendarPnLViewModel Swift_calendarPnLVM(long Swift_peer);

    private final native void Swift_calendarPnLVM_set(long Swift_peer, CalendarPnLViewModel value);

    private final native String Swift_cashBalanceLabel(long Swift_peer);

    private final native String Swift_cashBalanceText(long Swift_peer);

    private final native int Swift_currentTabIndex(long Swift_peer);

    private final native void Swift_currentTabIndex_set(long Swift_peer, int value);

    private final native String Swift_depositButtonTitle(long Swift_peer);

    private final native EAmount Swift_displayedBonusHold(long Swift_peer);

    private final native void Swift_displayedBonusHold_set(long Swift_peer, EAmount value);

    private final native EAmount Swift_displayedCashBalance(long Swift_peer);

    private final native void Swift_displayedCashBalance_set(long Swift_peer, EAmount value);

    private final native EError Swift_error(long Swift_peer);

    private final native void Swift_error_set(long Swift_peer, EError value);

    private final native void Swift_handleBecomeForeground_7(long Swift_peer);

    private final native boolean Swift_hasReservationSplit(long Swift_peer);

    private final native void Swift_hasReservationSplit_set(long Swift_peer, boolean value);

    private final native UserProfileHeaderPnLPresentation Swift_headerPnLPresentation_5(long Swift_peer, Double scrubbedValue);

    private final native boolean Swift_isBonusBreakdownEnabled(long Swift_peer);

    private final native void Swift_isBonusBreakdownEnabled_set(long Swift_peer, boolean value);

    private final native boolean Swift_isCashBalanceHidden(long Swift_peer);

    private final native void Swift_isCashBalanceHidden_set(long Swift_peer, boolean value);

    private final native boolean Swift_isPromotionsCarouselVisible(long Swift_peer);

    private final native boolean Swift_isRestrictionBannerVisible(long Swift_peer);

    private final native boolean Swift_isShowingBalanceInfo(long Swift_peer);

    private final native void Swift_isShowingBalanceInfo_set(long Swift_peer, boolean value);

    private final native boolean Swift_isWithdrawEnabled(long Swift_peer);

    private final native String Swift_navigationTitle(long Swift_peer);

    private final native EAmount Swift_portfolioValue(long Swift_peer);

    private final native void Swift_portfolioValue_set(long Swift_peer, EAmount value);

    private final native ProfileChartMode Swift_profileChartMode(long Swift_peer);

    private final native void Swift_profileChartMode_set(long Swift_peer, ProfileChartMode value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native PromoCreditsDisclaimerPresentation Swift_promoCreditsDisclaimer(long Swift_peer);

    private final native EAccountRestriction Swift_restriction(long Swift_peer);

    private final native void Swift_restriction_set(long Swift_peer, EAccountRestriction value);

    private final native ScrollCommandType Swift_scrollCommand(long Swift_peer);

    private final native void Swift_scrollCommand_set(long Swift_peer, ScrollCommandType value);

    private final native double Swift_scrollProgress(long Swift_peer);

    private final native void Swift_scrollProgress_set(long Swift_peer, double value);

    private final native void Swift_sendInput_6(long Swift_peer, Input input);

    private final native void Swift_setCallbacks_3(long Swift_peer, Function0<Unit> onClose, Function0<Unit> onSettings, Function0<Unit> onDeposit, Function0<Unit> onWithdraw, Function1<? super EUser, Unit> onShare, Function1<? super URI, Unit> onOpenURL, UserPositionsViewModel.Callbacks userPositionsCallbacks, USUserActivityViewModel.Callbacks userActivityUSCallbacks, Function1<? super ECalendarDayPnL, Unit> onCalendarDaySelected, PromotionsViewModel.Callbacks usPromotionsCallbacks);

    private final native void Swift_setCurrentTab_0(long Swift_peer, Tab tab);

    private final native void Swift_setup_4(long Swift_peer);

    private final native boolean Swift_shouldShowBalanceInfoButton(long Swift_peer);

    private final native boolean Swift_shouldShowBalanceInfoFooter(long Swift_peer);

    private final native boolean Swift_shouldShowBonusBalance(long Swift_peer);

    private final native boolean Swift_shouldShowBonusBreakdown(long Swift_peer);

    private final native boolean Swift_shouldShowUnavailableBalance(long Swift_peer);

    private final native List<Tab> Swift_tabs(long Swift_peer);

    private final native void Swift_tabs_set(long Swift_peer, List<? extends Tab> value);

    private final native EAmount Swift_unavailableBalance(long Swift_peer);

    private final native String Swift_unavailableBalanceLabel(long Swift_peer);

    private final native void Swift_unavailableBalance_set(long Swift_peer, EAmount value);

    private final native PromotionsViewModel Swift_usPromotionsVM(long Swift_peer);

    private final native void Swift_usPromotionsVM_set(long Swift_peer, PromotionsViewModel value);

    private final native EUser Swift_user(long Swift_peer);

    private final native USUserActivityViewModel Swift_userActivityUSVM(long Swift_peer);

    private final native UserOrdersViewModel Swift_userOrdersVM(long Swift_peer);

    private final native UserPositionsViewModel Swift_userPositionsVM(long Swift_peer);

    private final native UserProfileChartViewModel Swift_userProfileChartVM(long Swift_peer);

    private final native void Swift_user_set(long Swift_peer, EUser value);

    private final native String Swift_withdrawButtonTitle(long Swift_peer);

    public static /* synthetic */ Unit c() {
        return setCallbacks$lambda$0();
    }

    public static /* synthetic */ Unit d() {
        return setCallbacks$lambda$2();
    }

    public static /* synthetic */ Unit e() {
        return setCallbacks$lambda$1();
    }

    public static /* synthetic */ Unit f(EUser eUser) {
        return setCallbacks$lambda$4(eUser);
    }

    public static /* synthetic */ Unit g(URI uri) {
        return setCallbacks$lambda$5(uri);
    }

    public static /* synthetic */ Unit h() {
        return setCallbacks$lambda$3();
    }

    public static /* synthetic */ Unit i(ECalendarDayPnL eCalendarDayPnL) {
        return setCallbacks$lambda$6(eCalendarDayPnL);
    }

    public static /* synthetic */ void setCallbacks$default(USUserProfileViewModel uSUserProfileViewModel, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function1 function1, Function1 function12, UserPositionsViewModel.Callbacks callbacks, USUserActivityViewModel.Callbacks callbacks2, Function1 function13, PromotionsViewModel.Callbacks callbacks3, int i, Object obj) {
        Function0 function05;
        Function0 function06;
        Function0 function07;
        Function0 function08;
        Function1 function14;
        Function1 function15;
        UserPositionsViewModel.Callbacks callbacks4;
        USUserActivityViewModel.Callbacks callbacks5;
        Function1 function16;
        PromotionsViewModel.Callbacks callbacks6;
        if ((i & 1) != 0) {
            function05 = new hoj(29);
        } else {
            function05 = function0;
        }
        if ((i & 2) != 0) {
            function06 = new tsj(0);
        } else {
            function06 = function02;
        }
        if ((i & 4) != 0) {
            function07 = new tsj(1);
        } else {
            function07 = function03;
        }
        if ((i & 8) != 0) {
            function08 = new tsj(2);
        } else {
            function08 = function04;
        }
        if ((i & 16) != 0) {
            function14 = new hrj(23);
        } else {
            function14 = function1;
        }
        if ((i & 32) != 0) {
            function15 = new hrj(24);
        } else {
            function15 = function12;
        }
        if ((i & 64) != 0) {
            callbacks4 = new UserPositionsViewModel.Callbacks(null, null, null, null, null, null, null, null, null, 511, null);
        } else {
            callbacks4 = callbacks;
        }
        if ((i & 128) != 0) {
            callbacks5 = new USUserActivityViewModel.Callbacks(null, 1, null);
        } else {
            callbacks5 = callbacks2;
        }
        if ((i & 256) != 0) {
            function16 = new hrj(25);
        } else {
            function16 = function13;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            callbacks6 = new PromotionsViewModel.Callbacks(null, null, null, null, null, 31, null);
        } else {
            callbacks6 = callbacks3;
        }
        uSUserProfileViewModel.setCallbacks(function05, function06, function07, function08, function14, function15, callbacks4, callbacks5, function16, callbacks6);
    }

    private static final Unit setCallbacks$lambda$0() {
        return Unit.INSTANCE;
    }

    private static final Unit setCallbacks$lambda$1() {
        return Unit.INSTANCE;
    }

    private static final Unit setCallbacks$lambda$2() {
        return Unit.INSTANCE;
    }

    private static final Unit setCallbacks$lambda$3() {
        return Unit.INSTANCE;
    }

    private static final Unit setCallbacks$lambda$4(EUser eUser) {
        eUser.getClass();
        return Unit.INSTANCE;
    }

    private static final Unit setCallbacks$lambda$5(URI uri) {
        uri.getClass();
        return Unit.INSTANCE;
    }

    private static final Unit setCallbacks$lambda$6(ECalendarDayPnL eCalendarDayPnL) {
        eCalendarDayPnL.getClass();
        return Unit.INSTANCE;
    }

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final EAmount getAllTimePnl() {
        return Swift_allTimePnl(getSwift_peer());
    }

    public final double getAllTimeReturnPercentage() {
        return Swift_allTimeReturnPercentage(getSwift_peer());
    }

    public final String getAvailableToTradeLabel() {
        return Swift_availableToTradeLabel(getSwift_peer());
    }

    public final EAmount getBalanceInfoCashAmount() {
        return Swift_balanceInfoCashAmount(getSwift_peer());
    }

    public final String getBalanceInfoFooterMarkdown() {
        return Swift_balanceInfoFooterMarkdown(getSwift_peer());
    }

    public final String getBalanceInfoTitle() {
        return Swift_balanceInfoTitle(getSwift_peer());
    }

    public final EAmount getBonusBalance() {
        return Swift_bonusBalance(getSwift_peer());
    }

    public final String getBonusBalanceLabel() {
        return Swift_bonusBalanceLabel(getSwift_peer());
    }

    public final boolean getCalendarAnimateEntrance() {
        return Swift_calendarAnimateEntrance(getSwift_peer());
    }

    public final CalendarPnLViewModel getCalendarPnLVM() {
        return Swift_calendarPnLVM(getSwift_peer());
    }

    public final String getCashBalanceLabel() {
        return Swift_cashBalanceLabel(getSwift_peer());
    }

    public final String getCashBalanceText() {
        return Swift_cashBalanceText(getSwift_peer());
    }

    public final int getCurrentTabIndex() {
        return Swift_currentTabIndex(getSwift_peer());
    }

    public final String getDepositButtonTitle() {
        return Swift_depositButtonTitle(getSwift_peer());
    }

    public final EAmount getDisplayedBonusHold() {
        return Swift_displayedBonusHold(getSwift_peer());
    }

    public final EAmount getDisplayedCashBalance() {
        return Swift_displayedCashBalance(getSwift_peer());
    }

    public final EError getError() {
        return Swift_error(getSwift_peer());
    }

    public final boolean getHasReservationSplit() {
        return Swift_hasReservationSplit(getSwift_peer());
    }

    public final String getNavigationTitle() {
        return Swift_navigationTitle(getSwift_peer());
    }

    public final EAmount getPortfolioValue() {
        return Swift_portfolioValue(getSwift_peer());
    }

    public final ProfileChartMode getProfileChartMode() {
        return Swift_profileChartMode(getSwift_peer());
    }

    public final PromoCreditsDisclaimerPresentation getPromoCreditsDisclaimer() {
        return Swift_promoCreditsDisclaimer(getSwift_peer());
    }

    public final EAccountRestriction getRestriction() {
        return Swift_restriction(getSwift_peer());
    }

    public final ScrollCommandType getScrollCommand() {
        return Swift_scrollCommand(getSwift_peer());
    }

    public final double getScrollProgress() {
        return Swift_scrollProgress(getSwift_peer());
    }

    public final boolean getShouldShowBalanceInfoButton() {
        return Swift_shouldShowBalanceInfoButton(getSwift_peer());
    }

    public final boolean getShouldShowBalanceInfoFooter() {
        return Swift_shouldShowBalanceInfoFooter(getSwift_peer());
    }

    public final boolean getShouldShowBonusBalance() {
        return Swift_shouldShowBonusBalance(getSwift_peer());
    }

    public final boolean getShouldShowBonusBreakdown() {
        return Swift_shouldShowBonusBreakdown(getSwift_peer());
    }

    public final boolean getShouldShowUnavailableBalance() {
        return Swift_shouldShowUnavailableBalance(getSwift_peer());
    }

    public final List<Tab> getTabs() {
        return Swift_tabs(getSwift_peer());
    }

    public final EAmount getUnavailableBalance() {
        return Swift_unavailableBalance(getSwift_peer());
    }

    public final String getUnavailableBalanceLabel() {
        return Swift_unavailableBalanceLabel(getSwift_peer());
    }

    public final PromotionsViewModel getUsPromotionsVM() {
        return Swift_usPromotionsVM(getSwift_peer());
    }

    public final EUser getUser() {
        return Swift_user(getSwift_peer());
    }

    public final USUserActivityViewModel getUserActivityUSVM() {
        return Swift_userActivityUSVM(getSwift_peer());
    }

    public final UserOrdersViewModel getUserOrdersVM() {
        return Swift_userOrdersVM(getSwift_peer());
    }

    public final UserPositionsViewModel getUserPositionsVM() {
        return Swift_userPositionsVM(getSwift_peer());
    }

    public final UserProfileChartViewModel getUserProfileChartVM() {
        return Swift_userProfileChartVM(getSwift_peer());
    }

    public final String getWithdrawButtonTitle() {
        return Swift_withdrawButtonTitle(getSwift_peer());
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void handleBecomeForeground() {
        Swift_handleBecomeForeground_7(getSwift_peer());
    }

    public final UserProfileHeaderPnLPresentation headerPnLPresentation(Double scrubbedValue) {
        return Swift_headerPnLPresentation_5(getSwift_peer(), scrubbedValue);
    }

    public final boolean isBonusBreakdownEnabled() {
        return Swift_isBonusBreakdownEnabled(getSwift_peer());
    }

    public final boolean isCashBalanceHidden() {
        return Swift_isCashBalanceHidden(getSwift_peer());
    }

    public final boolean isPromotionsCarouselVisible() {
        return Swift_isPromotionsCarouselVisible(getSwift_peer());
    }

    public final boolean isRestrictionBannerVisible() {
        return Swift_isRestrictionBannerVisible(getSwift_peer());
    }

    public final boolean isShowingBalanceInfo() {
        return Swift_isShowingBalanceInfo(getSwift_peer());
    }

    public final boolean isWithdrawEnabled() {
        return Swift_isWithdrawEnabled(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_6(getSwift_peer(), input);
    }

    public final void setAllTimePnl(EAmount eAmount) {
        eAmount.getClass();
        Swift_allTimePnl_set(getSwift_peer(), (EAmount) StructKt.sref$default(eAmount, null, 1, null));
    }

    public final void setAllTimeReturnPercentage(double d) {
        Swift_allTimeReturnPercentage_set(getSwift_peer(), d);
    }

    public final void setBalanceInfoCashAmount(EAmount eAmount) {
        eAmount.getClass();
        Swift_balanceInfoCashAmount_set(getSwift_peer(), (EAmount) StructKt.sref$default(eAmount, null, 1, null));
    }

    public final void setBonusBreakdownEnabled(boolean z) {
        Swift_isBonusBreakdownEnabled_set(getSwift_peer(), z);
    }

    public final void setCalendarPnLVM(CalendarPnLViewModel calendarPnLViewModel) {
        Swift_calendarPnLVM_set(getSwift_peer(), calendarPnLViewModel);
    }

    public final void setCallbacks(Function0<Unit> onClose, Function0<Unit> onSettings, Function0<Unit> onDeposit, Function0<Unit> onWithdraw, Function1<? super EUser, Unit> onShare, Function1<? super URI, Unit> onOpenURL, UserPositionsViewModel.Callbacks userPositionsCallbacks, USUserActivityViewModel.Callbacks userActivityUSCallbacks, Function1<? super ECalendarDayPnL, Unit> onCalendarDaySelected, PromotionsViewModel.Callbacks usPromotionsCallbacks) {
        onClose.getClass();
        onSettings.getClass();
        onDeposit.getClass();
        onWithdraw.getClass();
        onShare.getClass();
        onOpenURL.getClass();
        userPositionsCallbacks.getClass();
        userActivityUSCallbacks.getClass();
        onCalendarDaySelected.getClass();
        usPromotionsCallbacks.getClass();
        Swift_setCallbacks_3(getSwift_peer(), onClose, onSettings, onDeposit, onWithdraw, onShare, onOpenURL, userPositionsCallbacks, userActivityUSCallbacks, onCalendarDaySelected, usPromotionsCallbacks);
    }

    public final void setCashBalanceHidden(boolean z) {
        Swift_isCashBalanceHidden_set(getSwift_peer(), z);
    }

    public final void setCurrentTab(Tab tab) {
        tab.getClass();
        Swift_setCurrentTab_0(getSwift_peer(), tab);
    }

    public final void setCurrentTabIndex(int i) {
        Swift_currentTabIndex_set(getSwift_peer(), i);
    }

    public final void setDisplayedBonusHold(EAmount eAmount) {
        Swift_displayedBonusHold_set(getSwift_peer(), (EAmount) StructKt.sref$default(eAmount, null, 1, null));
    }

    public final void setDisplayedCashBalance(EAmount eAmount) {
        eAmount.getClass();
        Swift_displayedCashBalance_set(getSwift_peer(), (EAmount) StructKt.sref$default(eAmount, null, 1, null));
    }

    public final void setError(EError eError) {
        Swift_error_set(getSwift_peer(), (EError) StructKt.sref$default(eError, null, 1, null));
    }

    public final void setHasReservationSplit(boolean z) {
        Swift_hasReservationSplit_set(getSwift_peer(), z);
    }

    public final void setPortfolioValue(EAmount eAmount) {
        eAmount.getClass();
        Swift_portfolioValue_set(getSwift_peer(), (EAmount) StructKt.sref$default(eAmount, null, 1, null));
    }

    public final void setProfileChartMode(ProfileChartMode profileChartMode) {
        profileChartMode.getClass();
        Swift_profileChartMode_set(getSwift_peer(), profileChartMode);
    }

    public final void setRestriction(EAccountRestriction eAccountRestriction) {
        Swift_restriction_set(getSwift_peer(), eAccountRestriction);
    }

    public final void setScrollCommand(ScrollCommandType scrollCommandType) {
        Swift_scrollCommand_set(getSwift_peer(), scrollCommandType);
    }

    public final void setScrollProgress(double d) {
        Swift_scrollProgress_set(getSwift_peer(), d);
    }

    public final void setShowingBalanceInfo(boolean z) {
        Swift_isShowingBalanceInfo_set(getSwift_peer(), z);
    }

    public final void setTabs(List<? extends Tab> list) {
        list.getClass();
        Swift_tabs_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setUnavailableBalance(EAmount eAmount) {
        eAmount.getClass();
        Swift_unavailableBalance_set(getSwift_peer(), (EAmount) StructKt.sref$default(eAmount, null, 1, null));
    }

    public final void setUsPromotionsVM(PromotionsViewModel promotionsViewModel) {
        Swift_usPromotionsVM_set(getSwift_peer(), promotionsViewModel);
    }

    public final void setUser(EUser eUser) {
        eUser.getClass();
        Swift_user_set(getSwift_peer(), (EUser) StructKt.sref$default(eUser, null, 1, null));
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_4(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 !2\u00020\u0001:\u0011\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0010\"#$%&'()*+,-./01¨\u00062"}, d2 = {"Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnCloseCase", "OnSettingsCase", "OnDepositCase", "OnWithdrawCase", "OnShareCase", "OnTabChangedCase", "OnRefreshCase", "OnPullToRefreshCase", "OnToggleChartModeCase", "OnOpenURLCase", "OnContactSupportCase", "OnOwedTappedCase", "OnAvailableBalanceInfoCase", "OnDismissBalanceInfoCase", "OnPromoCreditsDisclaimerLinkCase", "Companion", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnAvailableBalanceInfoCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnCloseCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnContactSupportCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnDepositCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnDismissBalanceInfoCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnOpenURLCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnOwedTappedCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnPromoCreditsDisclaimerLinkCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnPullToRefreshCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnRefreshCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnSettingsCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnShareCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnTabChangedCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnToggleChartModeCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnWithdrawCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onClose = new OnCloseCase();
        private static final Input onSettings = new OnSettingsCase();
        private static final Input onDeposit = new OnDepositCase();
        private static final Input onWithdraw = new OnWithdrawCase();
        private static final Input onShare = new OnShareCase();
        private static final Input onRefresh = new OnRefreshCase();
        private static final Input onToggleChartMode = new OnToggleChartModeCase();
        private static final Input onContactSupport = new OnContactSupportCase();
        private static final Input onAvailableBalanceInfo = new OnAvailableBalanceInfoCase();
        private static final Input onDismissBalanceInfo = new OnDismissBalanceInfoCase();
        private static final Input onPromoCreditsDisclaimerLink = new OnPromoCreditsDisclaimerLinkCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnAvailableBalanceInfoCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnAvailableBalanceInfoCase extends Input {
            public OnAvailableBalanceInfoCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnCloseCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnCloseCase extends Input {
            public OnCloseCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnContactSupportCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnContactSupportCase extends Input {
            public OnContactSupportCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnDepositCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDepositCase extends Input {
            public OnDepositCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnDismissBalanceInfoCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDismissBalanceInfoCase extends Input {
            public OnDismissBalanceInfoCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnOpenURLCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input;", "associated0", "Ljava/net/URI;", "<init>", "(Ljava/net/URI;)V", "getAssociated0", "()Ljava/net/URI;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnOwedTappedCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input;", "associated0", "Lcom/polymarket/data/EAccountRestriction;", "<init>", "(Lcom/polymarket/data/EAccountRestriction;)V", "getAssociated0", "()Lcom/polymarket/data/EAccountRestriction;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnOwedTappedCase extends Input {
            private final EAccountRestriction associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnOwedTappedCase(EAccountRestriction eAccountRestriction) {
                super(null);
                eAccountRestriction.getClass();
                this.associated0 = eAccountRestriction;
            }

            public final EAccountRestriction getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnPromoCreditsDisclaimerLinkCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPromoCreditsDisclaimerLinkCase extends Input {
            public OnPromoCreditsDisclaimerLinkCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnPullToRefreshCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input;", "associated0", "", "<init>", "(I)V", "getAssociated0", "()I", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPullToRefreshCase extends Input {
            private final int associated0;

            public OnPullToRefreshCase(int i) {
                super(null);
                this.associated0 = i;
            }

            public final int getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnRefreshCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRefreshCase extends Input {
            public OnRefreshCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnSettingsCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSettingsCase extends Input {
            public OnSettingsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnShareCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnShareCase extends Input {
            public OnShareCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnTabChangedCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input;", "associated0", "", "<init>", "(I)V", "getAssociated0", "()I", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnTabChangedCase extends Input {
            private final int associated0;

            public OnTabChangedCase(int i) {
                super(null);
                this.associated0 = i;
            }

            public final int getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnToggleChartModeCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnToggleChartModeCase extends Input {
            public OnToggleChartModeCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidLoadCase extends Input {
            public OnViewDidLoadCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$OnWithdrawCase;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnWithdrawCase extends Input {
            public OnWithdrawCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnAvailableBalanceInfo$cp() {
            return onAvailableBalanceInfo;
        }

        public static final /* synthetic */ Input access$getOnClose$cp() {
            return onClose;
        }

        public static final /* synthetic */ Input access$getOnContactSupport$cp() {
            return onContactSupport;
        }

        public static final /* synthetic */ Input access$getOnDeposit$cp() {
            return onDeposit;
        }

        public static final /* synthetic */ Input access$getOnDismissBalanceInfo$cp() {
            return onDismissBalanceInfo;
        }

        public static final /* synthetic */ Input access$getOnPromoCreditsDisclaimerLink$cp() {
            return onPromoCreditsDisclaimerLink;
        }

        public static final /* synthetic */ Input access$getOnRefresh$cp() {
            return onRefresh;
        }

        public static final /* synthetic */ Input access$getOnSettings$cp() {
            return onSettings;
        }

        public static final /* synthetic */ Input access$getOnShare$cp() {
            return onShare;
        }

        public static final /* synthetic */ Input access$getOnToggleChartMode$cp() {
            return onToggleChartMode;
        }

        public static final /* synthetic */ Input access$getOnViewDidLoad$cp() {
            return onViewDidLoad;
        }

        public static final /* synthetic */ Input access$getOnWithdraw$cp() {
            return onWithdraw;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0011\u0010 \u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007R\u0011\u0010\"\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0007R\u0011\u0010$\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007¨\u0006&"}, d2 = {"Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/USUserProfileViewModel$Input;", "onClose", "getOnClose", "onSettings", "getOnSettings", "onDeposit", "getOnDeposit", "onWithdraw", "getOnWithdraw", "onShare", "getOnShare", "onTabChanged", "associated0", "", "onRefresh", "getOnRefresh", "onPullToRefresh", "onToggleChartMode", "getOnToggleChartMode", "onOpenURL", "Ljava/net/URI;", "onContactSupport", "getOnContactSupport", "onOwedTapped", "Lcom/polymarket/data/EAccountRestriction;", "onAvailableBalanceInfo", "getOnAvailableBalanceInfo", "onDismissBalanceInfo", "getOnDismissBalanceInfo", "onPromoCreditsDisclaimerLink", "getOnPromoCreditsDisclaimerLink", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnAvailableBalanceInfo() {
                return Input.access$getOnAvailableBalanceInfo$cp();
            }

            public final Input getOnClose() {
                return Input.access$getOnClose$cp();
            }

            public final Input getOnContactSupport() {
                return Input.access$getOnContactSupport$cp();
            }

            public final Input getOnDeposit() {
                return Input.access$getOnDeposit$cp();
            }

            public final Input getOnDismissBalanceInfo() {
                return Input.access$getOnDismissBalanceInfo$cp();
            }

            public final Input getOnPromoCreditsDisclaimerLink() {
                return Input.access$getOnPromoCreditsDisclaimerLink$cp();
            }

            public final Input getOnRefresh() {
                return Input.access$getOnRefresh$cp();
            }

            public final Input getOnSettings() {
                return Input.access$getOnSettings$cp();
            }

            public final Input getOnShare() {
                return Input.access$getOnShare$cp();
            }

            public final Input getOnToggleChartMode() {
                return Input.access$getOnToggleChartMode$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input getOnWithdraw() {
                return Input.access$getOnWithdraw$cp();
            }

            public final Input onOpenURL(URI associated0) {
                associated0.getClass();
                return new OnOpenURLCase(associated0);
            }

            public final Input onOwedTapped(EAccountRestriction associated0) {
                associated0.getClass();
                return new OnOwedTappedCase(associated0);
            }

            public final Input onPullToRefresh(int associated0) {
                return new OnPullToRefreshCase(associated0);
            }

            public final Input onTabChanged(int associated0) {
                return new OnTabChangedCase(associated0);
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
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005:\u0001\u001bB\u001d\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0082 J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u0003H\u0016J\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u0003H\u0082 R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u001c"}, d2 = {"Lcom/polymarket/usviewmodels/USUserProfileViewModel$Tab;", "Lskip/lib/CaseIterable;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;IILjava/lang/Void;)V", "getRawValue", "()Ljava/lang/Integer;", "positions", "orders", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "getTitle", "()Ljava/lang/String;", "Swift_title", Keys.KEY_NAME, "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Tab implements CaseIterable, RawRepresentable<Integer>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Tab[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int rawValue;
        public static final Tab positions = new Tab("positions", 0, 0, null, 2, null);
        public static final Tab orders = new Tab("orders", 1, 1, null, 2, null);
        public static final Tab activity = new Tab(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, 2, 2, null, 2, null);

        private static final /* synthetic */ Tab[] $values() {
            return new Tab[]{positions, orders, activity};
        }

        static {
            Tab[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ Tab(String str, int i, int i2, Void r4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2, (i3 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native String Swift_title(String name);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Tab valueOf(String str) {
            return (Tab) Enum.valueOf(Tab.class, str);
        }

        public static Tab[] values() {
            return (Tab[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // skip.lib.RawRepresentable
        public Integer getRawValue() {
            return Integer.valueOf(this.rawValue);
        }

        public final String getTitle() {
            return Swift_title(name());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/USUserProfileViewModel$Tab$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Tab;", "<init>", "()V", "init", "rawValue", "", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion implements CaseIterableCompanion<Tab> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // skip.lib.CaseIterableCompanion
            public Array<Tab> getAllCases() {
                return ArrayKt.arrayOf(Tab.positions, Tab.orders, Tab.activity);
            }

            public final Tab init(int rawValue) {
                if (rawValue != 0) {
                    if (rawValue != 1) {
                        if (rawValue != 2) {
                            return null;
                        }
                        return Tab.activity;
                    }
                    return Tab.orders;
                }
                return Tab.positions;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ Integer getRawValue() {
            return getRawValue();
        }

        private Tab(String str, int i, int i2, Void r4) {
            this.rawValue = i2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J®\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u000f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n0\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u0019J\u009d\u0001\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0082 J\u001f\u0010\u001b\u001a\u00060\u001cj\u0002`\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0082 J\u0010\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%¨\u0006&"}, d2 = {"Lcom/polymarket/usviewmodels/USUserProfileViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "create", "Lcom/polymarket/usviewmodels/USUserProfileViewModel;", "user", "Lcom/polymarket/data/EUser;", "onClose", "Lkotlin/Function0;", "", "onSettings", "onDeposit", "onWithdraw", "onShare", "Lkotlin/Function1;", "onOpenURL", "Ljava/net/URI;", "userPositionsCallbacks", "Lcom/polymarket/usviewmodels/UserPositionsViewModel$Callbacks;", "userActivityUSCallbacks", "Lcom/polymarket/usviewmodels/USUserActivityViewModel$Callbacks;", "onCalendarDaySelected", "Lcom/polymarket/data/ECalendarDayPnL;", "usPromotionsCallbacks", "Lcom/polymarket/usviewmodels/PromotionsViewModel$Callbacks;", "Swift_Companion_create_1", "Swift_Companion_constructor_2", "", "Lskip/bridge/SwiftObjectPointer;", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "Tab", "Lcom/polymarket/usviewmodels/USUserProfileViewModel$Tab;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_2(AppSceneType scene, String id);

        private final native USUserProfileViewModel Swift_Companion_create_1(EUser user, Function0<Unit> onClose, Function0<Unit> onSettings, Function0<Unit> onDeposit, Function0<Unit> onWithdraw, Function1<? super EUser, Unit> onShare, Function1<? super URI, Unit> onOpenURL, UserPositionsViewModel.Callbacks userPositionsCallbacks, USUserActivityViewModel.Callbacks userActivityUSCallbacks, Function1<? super ECalendarDayPnL, Unit> onCalendarDaySelected, PromotionsViewModel.Callbacks usPromotionsCallbacks);

        public static /* synthetic */ Unit a(EUser eUser) {
            return create$lambda$4(eUser);
        }

        public static final /* synthetic */ long access$Swift_Companion_constructor_2(Companion companion, AppSceneType appSceneType, String str) {
            return companion.Swift_Companion_constructor_2(appSceneType, str);
        }

        public static /* synthetic */ Unit b(ECalendarDayPnL eCalendarDayPnL) {
            return create$lambda$6(eCalendarDayPnL);
        }

        public static /* synthetic */ Unit c() {
            return create$lambda$0();
        }

        public static /* synthetic */ USUserProfileViewModel create$default(Companion companion, EUser eUser, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function1 function1, Function1 function12, UserPositionsViewModel.Callbacks callbacks, USUserActivityViewModel.Callbacks callbacks2, Function1 function13, PromotionsViewModel.Callbacks callbacks3, int i, Object obj) {
            Function0 function05;
            Function0 function06;
            Function0 function07;
            Function0 function08;
            Function1 function14;
            Function1 function15;
            UserPositionsViewModel.Callbacks callbacks4;
            USUserActivityViewModel.Callbacks callbacks5;
            Function1 function16;
            PromotionsViewModel.Callbacks callbacks6;
            if ((i & 2) != 0) {
                function05 = new tsj(3);
            } else {
                function05 = function0;
            }
            if ((i & 4) != 0) {
                function06 = new tsj(4);
            } else {
                function06 = function02;
            }
            if ((i & 8) != 0) {
                function07 = new tsj(5);
            } else {
                function07 = function03;
            }
            if ((i & 16) != 0) {
                function08 = new tsj(6);
            } else {
                function08 = function04;
            }
            if ((i & 32) != 0) {
                function14 = new hrj(26);
            } else {
                function14 = function1;
            }
            if ((i & 64) != 0) {
                function15 = new hrj(27);
            } else {
                function15 = function12;
            }
            if ((i & 128) != 0) {
                callbacks4 = new UserPositionsViewModel.Callbacks(null, null, null, null, null, null, null, null, null, 511, null);
            } else {
                callbacks4 = callbacks;
            }
            if ((i & 256) != 0) {
                callbacks5 = new USUserActivityViewModel.Callbacks(null, 1, null);
            } else {
                callbacks5 = callbacks2;
            }
            if ((i & Barcode.FORMAT_UPC_A) != 0) {
                function16 = new hrj(28);
            } else {
                function16 = function13;
            }
            if ((i & Barcode.FORMAT_UPC_E) != 0) {
                callbacks6 = new PromotionsViewModel.Callbacks(null, null, null, null, null, 31, null);
            } else {
                callbacks6 = callbacks3;
            }
            return companion.create(eUser, function05, function06, function07, function08, function14, function15, callbacks4, callbacks5, function16, callbacks6);
        }

        private static final Unit create$lambda$0() {
            return Unit.INSTANCE;
        }

        private static final Unit create$lambda$1() {
            return Unit.INSTANCE;
        }

        private static final Unit create$lambda$2() {
            return Unit.INSTANCE;
        }

        private static final Unit create$lambda$3() {
            return Unit.INSTANCE;
        }

        private static final Unit create$lambda$4(EUser eUser) {
            eUser.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit create$lambda$5(URI uri) {
            uri.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit create$lambda$6(ECalendarDayPnL eCalendarDayPnL) {
            eCalendarDayPnL.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit d(URI uri) {
            return create$lambda$5(uri);
        }

        public static /* synthetic */ Unit e() {
            return create$lambda$1();
        }

        public static /* synthetic */ Unit f() {
            return create$lambda$2();
        }

        public static /* synthetic */ Unit g() {
            return create$lambda$3();
        }

        public final Tab Tab(int rawValue) {
            return Tab.INSTANCE.init(rawValue);
        }

        public final USUserProfileViewModel create(EUser user, Function0<Unit> onClose, Function0<Unit> onSettings, Function0<Unit> onDeposit, Function0<Unit> onWithdraw, Function1<? super EUser, Unit> onShare, Function1<? super URI, Unit> onOpenURL, UserPositionsViewModel.Callbacks userPositionsCallbacks, USUserActivityViewModel.Callbacks userActivityUSCallbacks, Function1<? super ECalendarDayPnL, Unit> onCalendarDaySelected, PromotionsViewModel.Callbacks usPromotionsCallbacks) {
            user.getClass();
            onClose.getClass();
            onSettings.getClass();
            onDeposit.getClass();
            onWithdraw.getClass();
            onShare.getClass();
            onOpenURL.getClass();
            userPositionsCallbacks.getClass();
            userActivityUSCallbacks.getClass();
            onCalendarDaySelected.getClass();
            usPromotionsCallbacks.getClass();
            return Swift_Companion_create_1(user, onClose, onSettings, onDeposit, onWithdraw, onShare, onOpenURL, userPositionsCallbacks, userActivityUSCallbacks, onCalendarDaySelected, usPromotionsCallbacks);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USUserProfileViewModel(AppSceneType appSceneType, String str) {
        super(Companion.access$Swift_Companion_constructor_2(INSTANCE, appSceneType, str), (SwiftPeerMarker) null);
        appSceneType.getClass();
    }

    public USUserProfileViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }
}
