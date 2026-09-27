package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.AmountInputConfig;
import com.polymarket.data.EAmount;
import com.polymarket.data.EPaymentMethod;
import com.polymarket.data.EPaymentSelection;
import com.polymarket.data.ETransaction;
import com.polymarket.data.NumberPadKey;
import com.polymarket.usdependencies.GeoComplianceVerdict;
import com.polymarket.usviewmodels.AppViewModel;
import com.polymarket.usviewmodels.PaymentMethodsViewModel;
import defpackage.q0k;
import defpackage.ylk;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.SwiftPeerMarker;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bL\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 Þ\u00012\u00020\u0001:\u0006Ü\u0001Ý\u0001Þ\u0001B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001f\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u0015\u0010\u0015\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u0016\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0018\u001a\u00020\u000fH\u0082 J\u0015\u0010\u001f\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010 \u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0082 J\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00190!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010(\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190!H\u0082 J\u0015\u0010.\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010/\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0018\u001a\u00020)H\u0082 J\u0017\u00104\u001a\u0004\u0018\u0001012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0006\u00105\u001a\u00020\u0017J\u0015\u00106\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00109\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010:\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0018\u001a\u00020)H\u0082 J\u0015\u0010A\u001a\u00020;2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010B\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0018\u001a\u00020;H\u0082 J\u0015\u0010F\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010G\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0018\u001a\u00020)H\u0082 J\u0017\u0010N\u001a\u0004\u0018\u00010H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010O\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010HH\u0082 J\u001b\u0010T\u001a\b\u0012\u0004\u0012\u00020P0!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010U\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020P0!H\u0082 J\u0015\u0010Y\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010Z\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0082 J\u0015\u0010]\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010a\u001a\u0004\u0018\u00010\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010b\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0082 J\u0017\u0010f\u001a\u0004\u0018\u00010\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010g\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0082 J\u0015\u0010k\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010l\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0082 J\u0015\u0010p\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010q\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0018\u001a\u00020)H\u0082 J\u0015\u0010t\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010u\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0018\u001a\u00020)H\u0082 J\u0015\u0010x\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010{\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010~\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0081\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0084\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0087\u0001\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u008a\u0001\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u008e\u0001\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0018\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0018\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0096\u0001\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0098\u0001\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u009b\u0001\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010 \u0001\u001a\u00030\u009d\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010£\u0001\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¦\u0001\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010©\u0001\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¬\u0001\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¯\u0001\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010²\u0001\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010µ\u0001\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¸\u0001\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010»\u0001\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¾\u0001\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Á\u0001\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Ä\u0001\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Ç\u0001\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0019\u0010Ì\u0001\u001a\u0005\u0018\u00010É\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\t\u0010Í\u0001\u001a\u00020\u0017H\u0016J\u0016\u0010Î\u0001\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0011\u0010Ï\u0001\u001a\u00020\u00172\b\u0010Ð\u0001\u001a\u00030Ñ\u0001J \u0010Ò\u0001\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010Ð\u0001\u001a\u00030Ñ\u0001H\u0082 J\u0011\u0010Ó\u0001\u001a\u00020)2\b\u0010Ô\u0001\u001a\u00030Õ\u0001J \u0010Ö\u0001\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010Ô\u0001\u001a\u00030Õ\u0001H\u0082 J\u001a\u0010×\u0001\u001a\n\u0012\u0005\u0012\u00030Ù\u00010Ø\u00012\u0007\u0010Ú\u0001\u001a\u00020;H\u0016J\u001b\u0010Û\u0001\u001a\n\u0012\u0005\u0012\u00030Ù\u00010Ø\u00012\u0007\u0010Ú\u0001\u001a\u00020;H\u0082 R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR0\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190!2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00190!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010*\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0013\u00100\u001a\u0004\u0018\u0001018F¢\u0006\u0006\u001a\u0004\b2\u00103R$\u00107\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u0010+\"\u0004\b8\u0010-R$\u0010<\u001a\u00020;2\u0006\u0010\u000e\u001a\u00020;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010C\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010+\"\u0004\bE\u0010-R(\u0010I\u001a\u0004\u0018\u00010H2\b\u0010\u000e\u001a\u0004\u0018\u00010H8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR0\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0!2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020P0!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010$\"\u0004\bS\u0010&R$\u0010V\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010\u001c\"\u0004\bX\u0010\u001eR\u0011\u0010[\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b\\\u0010+R(\u0010^\u001a\u0004\u0018\u00010\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010\u001c\"\u0004\b`\u0010\u001eR(\u0010c\u001a\u0004\u0018\u00010\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010\u001c\"\u0004\be\u0010\u001eR$\u0010h\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bi\u0010\u001c\"\u0004\bj\u0010\u001eR$\u0010m\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bn\u0010+\"\u0004\bo\u0010-R$\u0010r\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\br\u0010+\"\u0004\bs\u0010-R\u0011\u0010v\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bw\u0010\u001cR\u0011\u0010y\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\bz\u0010+R\u0011\u0010|\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b}\u0010+R\u0012\u0010\u007f\u001a\u00020\u00198F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\u001cR\u0013\u0010\u0082\u0001\u001a\u00020\u00198F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\u001cR\u0013\u0010\u0085\u0001\u001a\u00020)8F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010+R\u0013\u0010\u0088\u0001\u001a\u00020)8F¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010+R\u0014\u0010\u008b\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0015\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010\u001cR\u0015\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010\u001cR\u0013\u0010\u0095\u0001\u001a\u00020)8F¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010+R\u0013\u0010\u0097\u0001\u001a\u00020)8F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010+R\u0013\u0010\u0099\u0001\u001a\u00020)8F¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010+R\u0015\u0010\u009c\u0001\u001a\u00030\u009d\u00018F¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0013\u0010¡\u0001\u001a\u00020)8F¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010+R\u0014\u0010¤\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b¥\u0001\u0010\u008d\u0001R\u0014\u0010§\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b¨\u0001\u0010\u008d\u0001R\u0014\u0010ª\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b«\u0001\u0010\u008d\u0001R\u0014\u0010\u00ad\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b®\u0001\u0010\u008d\u0001R\u0014\u0010°\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b±\u0001\u0010\u008d\u0001R\u0014\u0010³\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b´\u0001\u0010\u008d\u0001R\u0014\u0010¶\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b·\u0001\u0010\u008d\u0001R\u0014\u0010¹\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\bº\u0001\u0010\u008d\u0001R\u0014\u0010¼\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b½\u0001\u0010\u008d\u0001R\u0014\u0010¿\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\bÀ\u0001\u0010\u008d\u0001R\u0014\u0010Â\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\bÃ\u0001\u0010\u008d\u0001R\u0014\u0010Å\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\bÆ\u0001\u0010\u008d\u0001R\u0017\u0010È\u0001\u001a\u0005\u0018\u00010É\u00018F¢\u0006\b\u001a\u0006\bÊ\u0001\u0010Ë\u0001¨\u0006ß\u0001"}, d2 = {"Lcom/polymarket/usviewmodels/WithdrawalViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "(Lcom/polymarket/usviewmodels/AppSceneType;Ljava/lang/String;)V", "newValue", "Lcom/polymarket/data/AmountInputConfig;", "inputConfig", "getInputConfig", "()Lcom/polymarket/data/AmountInputConfig;", "setInputConfig", "(Lcom/polymarket/data/AmountInputConfig;)V", "Swift_inputConfig", "Swift_inputConfig_set", "", "value", "Lcom/polymarket/data/EAmount;", "cashBalance", "getCashBalance", "()Lcom/polymarket/data/EAmount;", "setCashBalance", "(Lcom/polymarket/data/EAmount;)V", "Swift_cashBalance", "Swift_cashBalance_set", "", "quickAmounts", "getQuickAmounts", "()Ljava/util/List;", "setQuickAmounts", "(Ljava/util/List;)V", "Swift_quickAmounts", "Swift_quickAmounts_set", "", "isLoading", "()Z", "setLoading", "(Z)V", "Swift_isLoading", "Swift_isLoading_set", "geoDeniedVerdict", "Lcom/polymarket/usdependencies/GeoComplianceVerdict;", "getGeoDeniedVerdict", "()Lcom/polymarket/usdependencies/GeoComplianceVerdict;", "Swift_geoDeniedVerdict", "clearGeoDenial", "Swift_clearGeoDenial_0", "isPaymentMethodsResolved", "setPaymentMethodsResolved", "Swift_isPaymentMethodsResolved", "Swift_isPaymentMethodsResolved_set", "", "shouldTriggerErrorFeedback", "getShouldTriggerErrorFeedback", "()I", "setShouldTriggerErrorFeedback", "(I)V", "Swift_shouldTriggerErrorFeedback", "Swift_shouldTriggerErrorFeedback_set", "shouldHighlightAvailableBalance", "getShouldHighlightAvailableBalance", "setShouldHighlightAvailableBalance", "Swift_shouldHighlightAvailableBalance", "Swift_shouldHighlightAvailableBalance_set", "Lcom/polymarket/data/EPaymentSelection;", "selectedPaymentSelection", "getSelectedPaymentSelection", "()Lcom/polymarket/data/EPaymentSelection;", "setSelectedPaymentSelection", "(Lcom/polymarket/data/EPaymentSelection;)V", "Swift_selectedPaymentSelection", "Swift_selectedPaymentSelection_set", "Lcom/polymarket/data/EPaymentMethod;", "cachedPaymentMethods", "getCachedPaymentMethods", "setCachedPaymentMethods", "Swift_cachedPaymentMethods", "Swift_cachedPaymentMethods_set", "withdrawableBalance", "getWithdrawableBalance", "setWithdrawableBalance", "Swift_withdrawableBalance", "Swift_withdrawableBalance_set", "hasPaymentMethods", "getHasPaymentMethods", "Swift_hasPaymentMethods", "displayedDepositHold", "getDisplayedDepositHold", "setDisplayedDepositHold", "Swift_displayedDepositHold", "Swift_displayedDepositHold_set", "displayedBonusHold", "getDisplayedBonusHold", "setDisplayedBonusHold", "Swift_displayedBonusHold", "Swift_displayedBonusHold_set", "breakdownCash", "getBreakdownCash", "setBreakdownCash", "Swift_breakdownCash", "Swift_breakdownCash_set", "hasReservationSplit", "getHasReservationSplit", "setHasReservationSplit", "Swift_hasReservationSplit", "Swift_hasReservationSplit_set", "isBonusBreakdownEnabled", "setBonusBreakdownEnabled", "Swift_isBonusBreakdownEnabled", "Swift_isBonusBreakdownEnabled_set", "unavailableBalance", "getUnavailableBalance", "Swift_unavailableBalance", "shouldShowUnavailableBalance", "getShouldShowUnavailableBalance", "Swift_shouldShowUnavailableBalance", "shouldShowBonusBreakdown", "getShouldShowBonusBreakdown", "Swift_shouldShowBonusBreakdown", "balanceInfoCashAmount", "getBalanceInfoCashAmount", "Swift_balanceInfoCashAmount", "bonusBalance", "getBonusBalance", "Swift_bonusBalance", "shouldShowBonusBalance", "getShouldShowBonusBalance", "Swift_shouldShowBonusBalance", "shouldShowBalanceInfoFooter", "getShouldShowBalanceInfoFooter", "Swift_shouldShowBalanceInfoFooter", "amount", "getAmount", "()Ljava/lang/String;", "Swift_amount", "maxValue", "getMaxValue", "Swift_maxValue", "amountValue", "getAmountValue", "Swift_amountValue", "isDestinationReady", "Swift_isDestinationReady", "isValid", "Swift_isValid", "canSubmit", "getCanSubmit", "Swift_canSubmit", "destinationState", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$DestinationState;", "getDestinationState", "()Lcom/polymarket/usviewmodels/WithdrawalViewModel$DestinationState;", "Swift_destinationState", "shouldShowSelectPaymentButton", "getShouldShowSelectPaymentButton", "Swift_shouldShowSelectPaymentButton", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "Swift_title", "primaryButtonTitle", "getPrimaryButtonTitle", "Swift_primaryButtonTitle", "availableBalanceText", "getAvailableBalanceText", "Swift_availableBalanceText", "maxButtonTitle", "getMaxButtonTitle", "Swift_maxButtonTitle", "selectPaymentMethodTitle", "getSelectPaymentMethodTitle", "Swift_selectPaymentMethodTitle", "sendToLabel", "getSendToLabel", "Swift_sendToLabel", "cashBalanceLabel", "getCashBalanceLabel", "Swift_cashBalanceLabel", "unavailableBalanceLabel", "getUnavailableBalanceLabel", "Swift_unavailableBalanceLabel", "bonusBalanceLabel", "getBonusBalanceLabel", "Swift_bonusBalanceLabel", "availableToWithdrawLabel", "getAvailableToWithdrawLabel", "Swift_availableToWithdrawLabel", "balanceInfoTitle", "getBalanceInfoTitle", "Swift_balanceInfoTitle", "balanceInfoFooterMarkdown", "getBalanceInfoFooterMarkdown", "Swift_balanceInfoFooterMarkdown", "promoCreditsDisclaimer", "Lcom/polymarket/usviewmodels/PromoCreditsDisclaimerPresentation;", "getPromoCreditsDisclaimer", "()Lcom/polymarket/usviewmodels/PromoCreditsDisclaimerPresentation;", "Swift_promoCreditsDisclaimer", "setup", "Swift_setup_3", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input;", "Swift_sendInput_4", "sendPadKey", "key", "Lcom/polymarket/data/NumberPadKey;", "Swift_sendPadKey_5", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "DestinationState", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WithdrawalViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ WithdrawalViewModel(AppSceneType appSceneType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AppSceneDefault() : appSceneType, (i & 2) != 0 ? null : str);
    }

    private final native String Swift_amount(long Swift_peer);

    private final native EAmount Swift_amountValue(long Swift_peer);

    private final native String Swift_availableBalanceText(long Swift_peer);

    private final native String Swift_availableToWithdrawLabel(long Swift_peer);

    private final native EAmount Swift_balanceInfoCashAmount(long Swift_peer);

    private final native String Swift_balanceInfoFooterMarkdown(long Swift_peer);

    private final native String Swift_balanceInfoTitle(long Swift_peer);

    private final native EAmount Swift_bonusBalance(long Swift_peer);

    private final native String Swift_bonusBalanceLabel(long Swift_peer);

    private final native EAmount Swift_breakdownCash(long Swift_peer);

    private final native void Swift_breakdownCash_set(long Swift_peer, EAmount value);

    private final native List<EPaymentMethod> Swift_cachedPaymentMethods(long Swift_peer);

    private final native void Swift_cachedPaymentMethods_set(long Swift_peer, List<EPaymentMethod> value);

    private final native boolean Swift_canSubmit(long Swift_peer);

    private final native EAmount Swift_cashBalance(long Swift_peer);

    private final native String Swift_cashBalanceLabel(long Swift_peer);

    private final native void Swift_cashBalance_set(long Swift_peer, EAmount value);

    private final native void Swift_clearGeoDenial_0(long Swift_peer);

    private final native DestinationState Swift_destinationState(long Swift_peer);

    private final native EAmount Swift_displayedBonusHold(long Swift_peer);

    private final native void Swift_displayedBonusHold_set(long Swift_peer, EAmount value);

    private final native EAmount Swift_displayedDepositHold(long Swift_peer);

    private final native void Swift_displayedDepositHold_set(long Swift_peer, EAmount value);

    private final native GeoComplianceVerdict Swift_geoDeniedVerdict(long Swift_peer);

    private final native boolean Swift_hasPaymentMethods(long Swift_peer);

    private final native boolean Swift_hasReservationSplit(long Swift_peer);

    private final native void Swift_hasReservationSplit_set(long Swift_peer, boolean value);

    private final native AmountInputConfig Swift_inputConfig(long Swift_peer);

    private final native void Swift_inputConfig_set(long Swift_peer, AmountInputConfig value);

    private final native boolean Swift_isBonusBreakdownEnabled(long Swift_peer);

    private final native void Swift_isBonusBreakdownEnabled_set(long Swift_peer, boolean value);

    private final native boolean Swift_isDestinationReady(long Swift_peer);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native void Swift_isLoading_set(long Swift_peer, boolean value);

    private final native boolean Swift_isPaymentMethodsResolved(long Swift_peer);

    private final native void Swift_isPaymentMethodsResolved_set(long Swift_peer, boolean value);

    private final native boolean Swift_isValid(long Swift_peer);

    private final native String Swift_maxButtonTitle(long Swift_peer);

    private final native EAmount Swift_maxValue(long Swift_peer);

    private final native String Swift_primaryButtonTitle(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native PromoCreditsDisclaimerPresentation Swift_promoCreditsDisclaimer(long Swift_peer);

    private final native List<EAmount> Swift_quickAmounts(long Swift_peer);

    private final native void Swift_quickAmounts_set(long Swift_peer, List<EAmount> value);

    private final native String Swift_selectPaymentMethodTitle(long Swift_peer);

    private final native EPaymentSelection Swift_selectedPaymentSelection(long Swift_peer);

    private final native void Swift_selectedPaymentSelection_set(long Swift_peer, EPaymentSelection value);

    private final native void Swift_sendInput_4(long Swift_peer, Input input);

    private final native boolean Swift_sendPadKey_5(long Swift_peer, NumberPadKey key);

    private final native String Swift_sendToLabel(long Swift_peer);

    private final native void Swift_setup_3(long Swift_peer);

    private final native boolean Swift_shouldHighlightAvailableBalance(long Swift_peer);

    private final native void Swift_shouldHighlightAvailableBalance_set(long Swift_peer, boolean value);

    private final native boolean Swift_shouldShowBalanceInfoFooter(long Swift_peer);

    private final native boolean Swift_shouldShowBonusBalance(long Swift_peer);

    private final native boolean Swift_shouldShowBonusBreakdown(long Swift_peer);

    private final native boolean Swift_shouldShowSelectPaymentButton(long Swift_peer);

    private final native boolean Swift_shouldShowUnavailableBalance(long Swift_peer);

    private final native int Swift_shouldTriggerErrorFeedback(long Swift_peer);

    private final native void Swift_shouldTriggerErrorFeedback_set(long Swift_peer, int value);

    private final native String Swift_title(long Swift_peer);

    private final native EAmount Swift_unavailableBalance(long Swift_peer);

    private final native String Swift_unavailableBalanceLabel(long Swift_peer);

    private final native EAmount Swift_withdrawableBalance(long Swift_peer);

    private final native void Swift_withdrawableBalance_set(long Swift_peer, EAmount value);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final void clearGeoDenial() {
        Swift_clearGeoDenial_0(getSwift_peer());
    }

    public final String getAmount() {
        return Swift_amount(getSwift_peer());
    }

    public final EAmount getAmountValue() {
        return Swift_amountValue(getSwift_peer());
    }

    public final String getAvailableBalanceText() {
        return Swift_availableBalanceText(getSwift_peer());
    }

    public final String getAvailableToWithdrawLabel() {
        return Swift_availableToWithdrawLabel(getSwift_peer());
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

    public final EAmount getBreakdownCash() {
        return Swift_breakdownCash(getSwift_peer());
    }

    public final List<EPaymentMethod> getCachedPaymentMethods() {
        return Swift_cachedPaymentMethods(getSwift_peer());
    }

    public final boolean getCanSubmit() {
        return Swift_canSubmit(getSwift_peer());
    }

    public final EAmount getCashBalance() {
        return Swift_cashBalance(getSwift_peer());
    }

    public final String getCashBalanceLabel() {
        return Swift_cashBalanceLabel(getSwift_peer());
    }

    public final DestinationState getDestinationState() {
        return Swift_destinationState(getSwift_peer());
    }

    public final EAmount getDisplayedBonusHold() {
        return Swift_displayedBonusHold(getSwift_peer());
    }

    public final EAmount getDisplayedDepositHold() {
        return Swift_displayedDepositHold(getSwift_peer());
    }

    public final GeoComplianceVerdict getGeoDeniedVerdict() {
        return Swift_geoDeniedVerdict(getSwift_peer());
    }

    public final boolean getHasPaymentMethods() {
        return Swift_hasPaymentMethods(getSwift_peer());
    }

    public final boolean getHasReservationSplit() {
        return Swift_hasReservationSplit(getSwift_peer());
    }

    public final AmountInputConfig getInputConfig() {
        return Swift_inputConfig(getSwift_peer());
    }

    public final String getMaxButtonTitle() {
        return Swift_maxButtonTitle(getSwift_peer());
    }

    public final EAmount getMaxValue() {
        return Swift_maxValue(getSwift_peer());
    }

    public final String getPrimaryButtonTitle() {
        return Swift_primaryButtonTitle(getSwift_peer());
    }

    public final PromoCreditsDisclaimerPresentation getPromoCreditsDisclaimer() {
        return Swift_promoCreditsDisclaimer(getSwift_peer());
    }

    public final List<EAmount> getQuickAmounts() {
        return Swift_quickAmounts(getSwift_peer());
    }

    public final String getSelectPaymentMethodTitle() {
        return Swift_selectPaymentMethodTitle(getSwift_peer());
    }

    public final EPaymentSelection getSelectedPaymentSelection() {
        return Swift_selectedPaymentSelection(getSwift_peer());
    }

    public final String getSendToLabel() {
        return Swift_sendToLabel(getSwift_peer());
    }

    public final boolean getShouldHighlightAvailableBalance() {
        return Swift_shouldHighlightAvailableBalance(getSwift_peer());
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

    public final boolean getShouldShowSelectPaymentButton() {
        return Swift_shouldShowSelectPaymentButton(getSwift_peer());
    }

    public final boolean getShouldShowUnavailableBalance() {
        return Swift_shouldShowUnavailableBalance(getSwift_peer());
    }

    public final int getShouldTriggerErrorFeedback() {
        return Swift_shouldTriggerErrorFeedback(getSwift_peer());
    }

    public final String getTitle() {
        return Swift_title(getSwift_peer());
    }

    public final EAmount getUnavailableBalance() {
        return Swift_unavailableBalance(getSwift_peer());
    }

    public final String getUnavailableBalanceLabel() {
        return Swift_unavailableBalanceLabel(getSwift_peer());
    }

    public final EAmount getWithdrawableBalance() {
        return Swift_withdrawableBalance(getSwift_peer());
    }

    public final boolean isBonusBreakdownEnabled() {
        return Swift_isBonusBreakdownEnabled(getSwift_peer());
    }

    public final boolean isDestinationReady() {
        return Swift_isDestinationReady(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final boolean isPaymentMethodsResolved() {
        return Swift_isPaymentMethodsResolved(getSwift_peer());
    }

    public final boolean isValid() {
        return Swift_isValid(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_4(getSwift_peer(), input);
    }

    public final boolean sendPadKey(NumberPadKey key) {
        key.getClass();
        return Swift_sendPadKey_5(getSwift_peer(), key);
    }

    public final void setBonusBreakdownEnabled(boolean z) {
        Swift_isBonusBreakdownEnabled_set(getSwift_peer(), z);
    }

    public final void setBreakdownCash(EAmount eAmount) {
        eAmount.getClass();
        Swift_breakdownCash_set(getSwift_peer(), (EAmount) StructKt.sref$default(eAmount, null, 1, null));
    }

    public final void setCachedPaymentMethods(List<EPaymentMethod> list) {
        list.getClass();
        Swift_cachedPaymentMethods_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setCashBalance(EAmount eAmount) {
        eAmount.getClass();
        Swift_cashBalance_set(getSwift_peer(), (EAmount) StructKt.sref$default(eAmount, null, 1, null));
    }

    public final void setDisplayedBonusHold(EAmount eAmount) {
        Swift_displayedBonusHold_set(getSwift_peer(), (EAmount) StructKt.sref$default(eAmount, null, 1, null));
    }

    public final void setDisplayedDepositHold(EAmount eAmount) {
        Swift_displayedDepositHold_set(getSwift_peer(), (EAmount) StructKt.sref$default(eAmount, null, 1, null));
    }

    public final void setHasReservationSplit(boolean z) {
        Swift_hasReservationSplit_set(getSwift_peer(), z);
    }

    public final void setInputConfig(AmountInputConfig amountInputConfig) {
        amountInputConfig.getClass();
        Swift_inputConfig_set(getSwift_peer(), (AmountInputConfig) StructKt.sref$default(amountInputConfig, null, 1, null));
    }

    public final void setLoading(boolean z) {
        Swift_isLoading_set(getSwift_peer(), z);
    }

    public final void setPaymentMethodsResolved(boolean z) {
        Swift_isPaymentMethodsResolved_set(getSwift_peer(), z);
    }

    public final void setQuickAmounts(List<EAmount> list) {
        list.getClass();
        Swift_quickAmounts_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setSelectedPaymentSelection(EPaymentSelection ePaymentSelection) {
        Swift_selectedPaymentSelection_set(getSwift_peer(), ePaymentSelection);
    }

    public final void setShouldHighlightAvailableBalance(boolean z) {
        Swift_shouldHighlightAvailableBalance_set(getSwift_peer(), z);
    }

    public final void setShouldTriggerErrorFeedback(int i) {
        Swift_shouldTriggerErrorFeedback_set(getSwift_peer(), i);
    }

    public final void setWithdrawableBalance(EAmount eAmount) {
        eAmount.getClass();
        Swift_withdrawableBalance_set(getSwift_peer(), (EAmount) StructKt.sref$default(eAmount, null, 1, null));
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_3(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \r2\u00020\u0001:\u0004\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/polymarket/usviewmodels/WithdrawalViewModel$DestinationState;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "LoadingCase", "HiddenCase", "ManualSelectionCase", "Companion", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$DestinationState$HiddenCase;", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$DestinationState$LoadingCase;", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$DestinationState$ManualSelectionCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class DestinationState implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final DestinationState loading = new LoadingCase();
        private static final DestinationState hidden = new HiddenCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/WithdrawalViewModel$DestinationState$HiddenCase;", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$DestinationState;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class HiddenCase extends DestinationState {
            public HiddenCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/WithdrawalViewModel$DestinationState$LoadingCase;", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$DestinationState;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class LoadingCase extends DestinationState {
            public LoadingCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/WithdrawalViewModel$DestinationState$ManualSelectionCase;", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$DestinationState;", "associated0", "Lcom/polymarket/data/EPaymentSelection;", "<init>", "(Lcom/polymarket/data/EPaymentSelection;)V", "getAssociated0", "()Lcom/polymarket/data/EPaymentSelection;", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class ManualSelectionCase extends DestinationState {
            private final EPaymentSelection associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ManualSelectionCase(EPaymentSelection ePaymentSelection) {
                super(null);
                ePaymentSelection.getClass();
                this.associated0 = ePaymentSelection;
            }

            public boolean equals(Object other) {
                if (!(other instanceof ManualSelectionCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((ManualSelectionCase) other).associated0);
            }

            public final EPaymentSelection getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ DestinationState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ DestinationState access$getHidden$cp() {
            return hidden;
        }

        public static final /* synthetic */ DestinationState access$getLoading$cp() {
            return loading;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/polymarket/usviewmodels/WithdrawalViewModel$DestinationState$Companion;", "", "<init>", "()V", "loading", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$DestinationState;", "getLoading", "()Lcom/polymarket/usviewmodels/WithdrawalViewModel$DestinationState;", "hidden", "getHidden", "manualSelection", "associated0", "Lcom/polymarket/data/EPaymentSelection;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final DestinationState getHidden() {
                return DestinationState.access$getHidden$cp();
            }

            public final DestinationState getLoading() {
                return DestinationState.access$getLoading$cp();
            }

            public final DestinationState manualSelection(EPaymentSelection associated0) {
                associated0.getClass();
                return new ManualSelectionCase(associated0);
            }

            private Companion() {
            }
        }

        private DestinationState() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001a2\u00020\u0001:\n\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\t\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnAmountChangedCase", "OnQuickAmountSelectedCase", "OnPrefillAmountCase", "OnMaxSelectedCase", "OnShowPaymentMethodsCase", "OnWithdrawCase", "OnAvailableBalanceInfoCase", "OnPromoCreditsDisclaimerLinkCase", "Companion", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input$OnAmountChangedCase;", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input$OnAvailableBalanceInfoCase;", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input$OnMaxSelectedCase;", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input$OnPrefillAmountCase;", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input$OnPromoCreditsDisclaimerLinkCase;", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input$OnQuickAmountSelectedCase;", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input$OnShowPaymentMethodsCase;", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input$OnWithdrawCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onMaxSelected = new OnMaxSelectedCase();
        private static final Input onWithdraw = new OnWithdrawCase();
        private static final Input onAvailableBalanceInfo = new OnAvailableBalanceInfoCase();
        private static final Input onPromoCreditsDisclaimerLink = new OnPromoCreditsDisclaimerLinkCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input$OnAmountChangedCase;", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnAmountChangedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnAmountChangedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input$OnAvailableBalanceInfoCase;", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnAvailableBalanceInfoCase extends Input {
            public OnAvailableBalanceInfoCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input$OnMaxSelectedCase;", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnMaxSelectedCase extends Input {
            public OnMaxSelectedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input$OnPrefillAmountCase;", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input;", "associated0", "Lcom/polymarket/data/EAmount;", "<init>", "(Lcom/polymarket/data/EAmount;)V", "getAssociated0", "()Lcom/polymarket/data/EAmount;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPrefillAmountCase extends Input {
            private final EAmount associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnPrefillAmountCase(EAmount eAmount) {
                super(null);
                eAmount.getClass();
                this.associated0 = eAmount;
            }

            public final EAmount getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input$OnPromoCreditsDisclaimerLinkCase;", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPromoCreditsDisclaimerLinkCase extends Input {
            public OnPromoCreditsDisclaimerLinkCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input$OnQuickAmountSelectedCase;", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input;", "associated0", "Lcom/polymarket/data/EAmount;", "<init>", "(Lcom/polymarket/data/EAmount;)V", "getAssociated0", "()Lcom/polymarket/data/EAmount;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnQuickAmountSelectedCase extends Input {
            private final EAmount associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnQuickAmountSelectedCase(EAmount eAmount) {
                super(null);
                eAmount.getClass();
                this.associated0 = eAmount;
            }

            public final EAmount getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input$OnShowPaymentMethodsCase;", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$AutoStartAction;", "<init>", "(Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$AutoStartAction;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$AutoStartAction;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnShowPaymentMethodsCase extends Input {
            private final PaymentMethodsViewModel.AutoStartAction associated0;

            public OnShowPaymentMethodsCase(PaymentMethodsViewModel.AutoStartAction autoStartAction) {
                super(null);
                this.associated0 = autoStartAction;
            }

            public final PaymentMethodsViewModel.AutoStartAction getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidLoadCase extends Input {
            public OnViewDidLoadCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input$OnWithdrawCase;", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        public static final /* synthetic */ Input access$getOnMaxSelected$cp() {
            return onMaxSelected;
        }

        public static final /* synthetic */ Input access$getOnPromoCreditsDisclaimerLink$cp() {
            return onPromoCreditsDisclaimerLink;
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
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\fJ\u0010\u0010\u0010\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/WithdrawalViewModel$Input;", "onAmountChanged", "associated0", "", "onQuickAmountSelected", "Lcom/polymarket/data/EAmount;", "onPrefillAmount", "onMaxSelected", "getOnMaxSelected", "onShowPaymentMethods", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$AutoStartAction;", "onWithdraw", "getOnWithdraw", "onAvailableBalanceInfo", "getOnAvailableBalanceInfo", "onPromoCreditsDisclaimerLink", "getOnPromoCreditsDisclaimerLink", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnAvailableBalanceInfo() {
                return Input.access$getOnAvailableBalanceInfo$cp();
            }

            public final Input getOnMaxSelected() {
                return Input.access$getOnMaxSelected$cp();
            }

            public final Input getOnPromoCreditsDisclaimerLink() {
                return Input.access$getOnPromoCreditsDisclaimerLink$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input getOnWithdraw() {
                return Input.access$getOnWithdraw$cp();
            }

            public final Input onAmountChanged(String associated0) {
                associated0.getClass();
                return new OnAmountChangedCase(associated0);
            }

            public final Input onPrefillAmount(EAmount associated0) {
                associated0.getClass();
                return new OnPrefillAmountCase(associated0);
            }

            public final Input onQuickAmountSelected(EAmount associated0) {
                associated0.getClass();
                return new OnQuickAmountSelectedCase(associated0);
            }

            public final Input onShowPaymentMethods(PaymentMethodsViewModel.AutoStartAction associated0) {
                return new OnShowPaymentMethodsCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jy\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\"\b\u0002\u0010\b\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\t2&\u0010\u000e\u001a\"\b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\t2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u0013¢\u0006\u0002\u0010\u0014Jv\u0010\u0015\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072 \u0010\b\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\t2&\u0010\u000e\u001a\"\b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\t2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u0013H\u0082 ¢\u0006\u0002\u0010\u0014J\u001f\u0010\u0016\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0082 J\u0006\u0010\u001d\u001a\u00020\u001eJ\t\u0010\u001f\u001a\u00020\u001eH\u0082 J\u0006\u0010 \u001a\u00020\u0005J\t\u0010!\u001a\u00020\u0005H\u0082 ¨\u0006\""}, d2 = {"Lcom/polymarket/usviewmodels/WithdrawalViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "create", "Lcom/polymarket/usviewmodels/WithdrawalViewModel;", "initialAmount", "Lcom/polymarket/data/EAmount;", "onWithdrawalCompleted", "Lkotlin/Function2;", "", "Lcom/polymarket/data/ETransaction;", "Lcom/polymarket/data/EPaymentSelection;", "", "onShowPaymentMethods", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$AutoStartAction;", "Lkotlin/coroutines/Continuation;", "", "onShowBalanceInfo", "Lkotlin/Function1;", "(Lcom/polymarket/data/EAmount;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lcom/polymarket/usviewmodels/WithdrawalViewModel;", "Swift_Companion_create_1", "Swift_Companion_constructor_2", "", "Lskip/bridge/SwiftObjectPointer;", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "ensureFlowAllowed", "", "Swift_Companion_ensureFlowAllowed_6", "mock", "Swift_Companion_mock_7", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_2(AppSceneType scene, String id);

        private final native WithdrawalViewModel Swift_Companion_create_1(EAmount initialAmount, Function2<? super List<ETransaction>, ? super EPaymentSelection, Unit> onWithdrawalCompleted, Function2<? super PaymentMethodsViewModel.AutoStartAction, ? super Continuation<? super EPaymentSelection>, ? extends Object> onShowPaymentMethods, Function1<? super WithdrawalViewModel, Unit> onShowBalanceInfo);

        private final native boolean Swift_Companion_ensureFlowAllowed_6();

        private final native WithdrawalViewModel Swift_Companion_mock_7();

        public static /* synthetic */ Unit a(WithdrawalViewModel withdrawalViewModel) {
            return create$lambda$1(withdrawalViewModel);
        }

        public static final /* synthetic */ long access$Swift_Companion_constructor_2(Companion companion, AppSceneType appSceneType, String str) {
            return companion.Swift_Companion_constructor_2(appSceneType, str);
        }

        public static /* synthetic */ Unit b(List list, EPaymentSelection ePaymentSelection) {
            return create$lambda$0(list, ePaymentSelection);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WithdrawalViewModel create$default(Companion companion, EAmount eAmount, Function2 function2, Function2 function22, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                eAmount = null;
            }
            if ((i & 2) != 0) {
                function2 = new q0k(4);
            }
            if ((i & 8) != 0) {
                function1 = new ylk(7);
            }
            return companion.create(eAmount, function2, function22, function1);
        }

        private static final Unit create$lambda$0(List list, EPaymentSelection ePaymentSelection) {
            list.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit create$lambda$1(WithdrawalViewModel withdrawalViewModel) {
            withdrawalViewModel.getClass();
            return Unit.INSTANCE;
        }

        public final WithdrawalViewModel create(EAmount initialAmount, Function2<? super List<ETransaction>, ? super EPaymentSelection, Unit> onWithdrawalCompleted, Function2<? super PaymentMethodsViewModel.AutoStartAction, ? super Continuation<? super EPaymentSelection>, ? extends Object> onShowPaymentMethods, Function1<? super WithdrawalViewModel, Unit> onShowBalanceInfo) {
            onWithdrawalCompleted.getClass();
            onShowPaymentMethods.getClass();
            onShowBalanceInfo.getClass();
            return Swift_Companion_create_1(initialAmount, onWithdrawalCompleted, onShowPaymentMethods, onShowBalanceInfo);
        }

        public final boolean ensureFlowAllowed() {
            return Swift_Companion_ensureFlowAllowed_6();
        }

        public final WithdrawalViewModel mock() {
            return Swift_Companion_mock_7();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawalViewModel(AppSceneType appSceneType, String str) {
        super(Companion.access$Swift_Companion_constructor_2(INSTANCE, appSceneType, str), (SwiftPeerMarker) null);
        appSceneType.getClass();
    }

    public WithdrawalViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }
}
