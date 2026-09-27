package com.polymarket.data;

import com.checkout.components.wallet.BuildConfig;
import com.fingerprintjs.android.fpjs_pro.g;
import com.polymarket.data.EEventState;
import com.polymarket.data.EMarket;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.AttributeType;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MutableStruct;
import skip.lib.RawRepresentable;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 Ñ\u00022\u00020\u00012\u00020\u00022\u00020\u0003:\nÍ\u0002Î\u0002Ï\u0002Ð\u0002Ñ\u0002B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010\u001e\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010#\u001a\u0004\u0018\u00010 2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010&\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010+\u001a\u00020(2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010.\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u00104\u001a\n\u0012\u0004\u0012\u000201\u0018\u0001002\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u00107\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010:\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010<\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001b\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001b002\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010B\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010D\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010G\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010J\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010N\u001a\n\u0012\u0004\u0012\u00020L\u0018\u0001002\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010U\u001a\n\u0012\u0004\u0012\u00020P\u0018\u0001002\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J%\u0010V\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u000e\u0010W\u001a\n\u0012\u0004\u0012\u00020P\u0018\u000100H\u0082 J\u0017\u0010[\u001a\u0004\u0018\u00010L2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010^\u001a\u0004\u0018\u00010L2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010c\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010d\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010W\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u0010h\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010i\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010W\u001a\u0004\u0018\u00010\u001bH\u0082 J\u001c\u0010o\u001a\u0004\u0018\u00010\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010pJ$\u0010q\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010W\u001a\u0004\u0018\u00010\u0015H\u0082 ¢\u0006\u0002\u0010rJ\u0017\u0010y\u001a\u0004\u0018\u00010s2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010z\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010W\u001a\u0004\u0018\u00010sH\u0082 J\u001c\u0010~\u001a\u0004\u0018\u00010\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010pJ$\u0010\u007f\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010W\u001a\u0004\u0018\u00010\u0015H\u0082 ¢\u0006\u0002\u0010rJ\u001e\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0003\u0010\u0086\u0001J&\u0010\u0087\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010W\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0003\u0010\u0088\u0001J\u001e\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0003\u0010\u0086\u0001J&\u0010\u008d\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010W\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0003\u0010\u0088\u0001J\u001e\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0003\u0010\u0086\u0001J&\u0010\u0092\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010W\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0003\u0010\u0088\u0001J\u001e\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0003\u0010\u0086\u0001J&\u0010\u0097\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010W\u001a\u0004\u0018\u00010\u0019H\u0082 ¢\u0006\u0003\u0010\u0088\u0001J\u0019\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u0098\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J!\u0010\u009f\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\t\u0010W\u001a\u0005\u0018\u00010\u0098\u0001H\u0082 J\u001c\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b002\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010¥\u0001\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010¨\u0001\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010\u00ad\u0001\u001a\u0005\u0018\u00010ª\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010°\u0001\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010³\u0001\u001a\u0005\u0018\u00010ª\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010¶\u0001\u001a\u0005\u0018\u00010ª\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010¹\u0001\u001a\u0004\u0018\u00010\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010pJ\u0018\u0010¼\u0001\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010Á\u0001\u001a\u0005\u0018\u00010¾\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010Ä\u0001\u001a\u0005\u0018\u00010¾\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010Ç\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010Ê\u0001\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0014\u0010Ë\u0001\u001a\u0005\u0018\u00010ª\u00012\b\u0010Ì\u0001\u001a\u00030ª\u0001J#\u0010Í\u0001\u001a\u0005\u0018\u00010ª\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010Î\u0001\u001a\u00030ª\u0001H\u0082 J\u0011\u0010Ï\u0001\u001a\u00020\u00152\b\u0010Ì\u0001\u001a\u00030ª\u0001J \u0010Ð\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010Î\u0001\u001a\u00030ª\u0001H\u0082 J\u0016\u0010Ó\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010Ö\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010Ù\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010Ü\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010ß\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010â\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010å\u0001\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010è\u0001\u001a\u0005\u0018\u00010ª\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010é\u0001\u001a\u00020\u00152\u000e\u0010ê\u0001\u001a\t\u0012\u0004\u0012\u00020\u001b0ë\u0001J&\u0010ì\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u000e\u0010í\u0001\u001a\t\u0012\u0004\u0012\u00020\u001b0ë\u0001H\u0082 J\u0019\u0010ð\u0001\u001a\u0005\u0018\u00010ª\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010ó\u0001\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010ö\u0001\u001a\u0005\u0018\u00010¾\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010û\u0001\u001a\u0005\u0018\u00010ø\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J=\u0010ü\u0001\u001a\u0005\u0018\u00010ý\u00012\u0007\u0010þ\u0001\u001a\u00020\u001b2\f\b\u0002\u0010ÿ\u0001\u001a\u0005\u0018\u00010\u0080\u00022\f\b\u0002\u0010\u0081\u0002\u001a\u0005\u0018\u00010\u0080\u00022\f\b\u0002\u0010\u0082\u0002\u001a\u0005\u0018\u00010\u0080\u0002J!\u0010\u0083\u0002\u001a\u0005\u0018\u00010ý\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u00105\u001a\u00020\u001bH\u0082 J/\u0010ü\u0001\u001a\u0005\u0018\u00010ý\u00012\u0007\u0010\u0084\u0002\u001a\u00020\u001b2\f\b\u0002\u0010ÿ\u0001\u001a\u0005\u0018\u00010\u0080\u00022\f\b\u0002\u0010\u0081\u0002\u001a\u0005\u0018\u00010\u0080\u0002J!\u0010\u0085\u0002\u001a\u0005\u0018\u00010ý\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u00105\u001a\u00020\u001bH\u0082 J\u0016\u0010\u0088\u0002\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010\u008b\u0002\u001a\t\u0012\u0005\u0012\u00030ý\u0001002\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0013\u0010ü\u0001\u001a\u0005\u0018\u00010ý\u00012\u0007\u0010\u008c\u0002\u001a\u00020\u001bJ!\u0010\u008d\u0002\u001a\u0005\u0018\u00010ý\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0082 J\u0014\u0010ü\u0001\u001a\u0005\u0018\u00010ý\u00012\b\u0010\u008c\u0002\u001a\u00030\u008e\u0002J#\u0010\u008f\u0002\u001a\u0005\u0018\u00010ý\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u0090\u0002\u001a\u00030\u008e\u0002H\u0082 J\u0011\u0010\u0091\u0002\u001a\u00020\u00152\b\u0010\u008c\u0002\u001a\u00030\u008e\u0002J \u0010\u0092\u0002\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u0090\u0002\u001a\u00030\u008e\u0002H\u0082 J\u0011\u0010\u0093\u0002\u001a\u00020\u001b2\b\u0010\u008c\u0002\u001a\u00030\u008e\u0002J \u0010\u0094\u0002\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u0090\u0002\u001a\u00030\u008e\u0002H\u0082 J\u0012\u0010\u0095\u0002\u001a\u00030\u0096\u00022\b\u0010\u008c\u0002\u001a\u00030\u008e\u0002J!\u0010\u0097\u0002\u001a\u00030\u0096\u00022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u0090\u0002\u001a\u00030\u008e\u0002H\u0082 J\u0016\u0010\u0099\u0002\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u009b\u0002\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010 \u0002\u001a\u0005\u0018\u00010\u009d\u00022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010¥\u0002\u001a\u0005\u0018\u00010¢\u00022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0013\u0010\u0090\u0002\u001a\u0005\u0018\u00010\u008e\u00022\u0007\u0010\u008c\u0002\u001a\u00020\u001bJ!\u0010¦\u0002\u001a\u0005\u0018\u00010\u008e\u00022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0082 JB\u0010§\u0002\u001a\u0005\u0018\u00010\u008e\u00022\u000b\b\u0002\u0010¨\u0002\u001a\u0004\u0018\u00010\u001b2\u000b\b\u0002\u0010©\u0002\u001a\u0004\u0018\u00010\u00192\u000b\b\u0002\u0010ª\u0002\u001a\u0004\u0018\u00010\u001b2\t\b\u0002\u0010«\u0002\u001a\u00020\u0015¢\u0006\u0003\u0010¬\u0002JI\u0010\u00ad\u0002\u001a\u0005\u0018\u00010\u008e\u00022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\t\u0010¨\u0002\u001a\u0004\u0018\u00010\u001b2\t\u0010©\u0002\u001a\u0004\u0018\u00010\u00192\t\u0010ª\u0002\u001a\u0004\u0018\u00010\u001b2\u0007\u0010«\u0002\u001a\u00020\u0015H\u0082 ¢\u0006\u0003\u0010®\u0002J\u0013\u0010¯\u0002\u001a\u0005\u0018\u00010°\u00022\u0007\u0010\u008c\u0002\u001a\u00020\u001bJ\"\u0010±\u0002\u001a\u0005\u0018\u00010°\u00022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010²\u0002\u001a\u00020\u001bH\u0082 J\u001d\u0010¶\u0002\u001a\t\u0012\u0005\u0012\u00030´\u0002002\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J!\u0010ü\u0001\u001a\u0005\u0018\u00010ý\u00012\u0007\u0010·\u0002\u001a\u00020\u001b2\f\b\u0002\u0010ÿ\u0001\u001a\u0005\u0018\u00010\u0080\u0002J!\u0010¸\u0002\u001a\u0005\u0018\u00010ý\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0082 J\u0018\u0010»\u0002\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010¼\u0002\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\t\u0010È\u0002\u001a\u00020\u0001H\u0016J\u0019\u0010É\u0002\u001a\t\u0012\u0004\u0012\u00020\u00170Ê\u00022\u0007\u0010Ë\u0002\u001a\u00020\u0019H\u0016J\u001a\u0010Ì\u0002\u001a\t\u0012\u0004\u0012\u00020\u00170Ê\u00022\u0007\u0010Ë\u0002\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010$\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u001dR\u0011\u0010'\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010,\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001dR\u0019\u0010/\u001a\n\u0012\u0004\u0012\u000201\u0018\u0001008F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u00105\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b6\u0010\u001dR\u0011\u00108\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010;\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b;\u00109R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001b008F¢\u0006\u0006\u001a\u0004\b>\u00103R\u0013\u0010@\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\bA\u0010\u001dR\u0011\u0010C\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bC\u00109R\u0011\u0010E\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bF\u00109R\u0013\u0010H\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\bI\u0010\u001dR\u0019\u0010K\u001a\n\u0012\u0004\u0012\u00020L\u0018\u0001008F¢\u0006\u0006\u001a\u0004\bM\u00103R4\u0010Q\u001a\n\u0012\u0004\u0012\u00020P\u0018\u0001002\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00020P\u0018\u0001008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u00103\"\u0004\bS\u0010TR\u0013\u0010X\u001a\u0004\u0018\u00010L8F¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0013\u0010\\\u001a\u0004\u0018\u00010L8F¢\u0006\u0006\u001a\u0004\b]\u0010ZR(\u0010_\u001a\u0004\u0018\u00010\u001b2\b\u0010O\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010\u001d\"\u0004\ba\u0010bR(\u0010e\u001a\u0004\u0018\u00010\u001b2\b\u0010O\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010\u001d\"\u0004\bg\u0010bR(\u0010j\u001a\u0004\u0018\u00010\u00152\b\u0010O\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR(\u0010t\u001a\u0004\u0018\u00010s2\b\u0010O\u001a\u0004\u0018\u00010s8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR(\u0010{\u001a\u0004\u0018\u00010\u00152\b\u0010O\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b|\u0010l\"\u0004\b}\u0010nR-\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00192\b\u0010O\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R-\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00192\b\u0010O\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008a\u0001\u0010\u0082\u0001\"\u0006\b\u008b\u0001\u0010\u0084\u0001R-\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00192\b\u0010O\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008f\u0001\u0010\u0082\u0001\"\u0006\b\u0090\u0001\u0010\u0084\u0001R-\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00192\b\u0010O\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0094\u0001\u0010\u0082\u0001\"\u0006\b\u0095\u0001\u0010\u0084\u0001R/\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u00012\t\u0010O\u001a\u0005\u0018\u00010\u0098\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0019\u0010 \u0001\u001a\b\u0012\u0004\u0012\u00020\u001b008F¢\u0006\u0007\u001a\u0005\b¡\u0001\u00103R\u0015\u0010£\u0001\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010\u001dR\u0015\u0010¦\u0001\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0007\u001a\u0005\b§\u0001\u0010\u001dR\u0017\u0010©\u0001\u001a\u0005\u0018\u00010ª\u00018F¢\u0006\b\u001a\u0006\b«\u0001\u0010¬\u0001R\u0015\u0010®\u0001\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0007\u001a\u0005\b¯\u0001\u0010\u001dR\u0017\u0010±\u0001\u001a\u0005\u0018\u00010ª\u00018F¢\u0006\b\u001a\u0006\b²\u0001\u0010¬\u0001R\u0017\u0010´\u0001\u001a\u0005\u0018\u00010ª\u00018F¢\u0006\b\u001a\u0006\bµ\u0001\u0010¬\u0001R\u0015\u0010·\u0001\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010lR\u0015\u0010º\u0001\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0007\u001a\u0005\b»\u0001\u0010\u001dR\u0017\u0010½\u0001\u001a\u0005\u0018\u00010¾\u00018F¢\u0006\b\u001a\u0006\b¿\u0001\u0010À\u0001R\u0017\u0010Â\u0001\u001a\u0005\u0018\u00010¾\u00018F¢\u0006\b\u001a\u0006\bÃ\u0001\u0010À\u0001R\u0013\u0010Å\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\bÆ\u0001\u00109R\u0015\u0010È\u0001\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0007\u001a\u0005\bÉ\u0001\u0010\u001dR\u0013\u0010Ñ\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\bÒ\u0001\u00109R\u0013\u0010Ô\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\bÕ\u0001\u00109R\u0013\u0010×\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\bØ\u0001\u00109R\u0013\u0010Ú\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\bÛ\u0001\u00109R\u0013\u0010Ý\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\bÞ\u0001\u00109R\u0013\u0010à\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\bá\u0001\u00109R\u0015\u0010ã\u0001\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0007\u001a\u0005\bä\u0001\u0010\u001dR\u0017\u0010æ\u0001\u001a\u0005\u0018\u00010ª\u00018F¢\u0006\b\u001a\u0006\bç\u0001\u0010¬\u0001R\u0017\u0010î\u0001\u001a\u0005\u0018\u00010ª\u00018F¢\u0006\b\u001a\u0006\bï\u0001\u0010¬\u0001R\u0013\u0010ñ\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\bò\u0001\u0010\u001dR\u0017\u0010ô\u0001\u001a\u0005\u0018\u00010¾\u00018F¢\u0006\b\u001a\u0006\bõ\u0001\u0010À\u0001R\u0017\u0010÷\u0001\u001a\u0005\u0018\u00010ø\u00018F¢\u0006\b\u001a\u0006\bù\u0001\u0010ú\u0001R\u0013\u0010\u0086\u0002\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b\u0087\u0002\u00109R\u001a\u0010\u0089\u0002\u001a\t\u0012\u0005\u0012\u00030ý\u0001008F¢\u0006\u0007\u001a\u0005\b\u008a\u0002\u00103R\u0013\u0010\u0098\u0002\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b\u0098\u0002\u00109R\u0013\u0010\u009a\u0002\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b\u009a\u0002\u00109R\u0017\u0010\u009c\u0002\u001a\u0005\u0018\u00010\u009d\u00028F¢\u0006\b\u001a\u0006\b\u009e\u0002\u0010\u009f\u0002R\u0017\u0010¡\u0002\u001a\u0005\u0018\u00010¢\u00028F¢\u0006\b\u001a\u0006\b£\u0002\u0010¤\u0002R\u001a\u0010³\u0002\u001a\t\u0012\u0005\u0012\u00030´\u0002008F¢\u0006\u0007\u001a\u0005\bµ\u0002\u00103R\u0015\u0010¹\u0002\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0007\u001a\u0005\bº\u0002\u0010\u001dR.\u0010½\u0002\u001a\u0011\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010¾\u0002X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¿\u0002\u0010À\u0002\"\u0006\bÁ\u0002\u0010Â\u0002R\u001f\u0010Ã\u0002\u001a\u00020\u0019X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÄ\u0002\u0010Å\u0002\"\u0006\bÆ\u0002\u0010Ç\u0002¨\u0006Ò\u0002"}, d2 = {"Lcom/polymarket/data/EEvent;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "getId", "()Ljava/lang/String;", "Swift_id", "sportSlug", "Lcom/polymarket/data/ESportsSlug;", "getSportSlug", "()Lcom/polymarket/data/ESportsSlug;", "Swift_sportSlug", "leagueDisplayName", "getLeagueDisplayName", "Swift_leagueDisplayName", "eventCategory", "Lcom/polymarket/data/APIEventCategory;", "getEventCategory", "()Lcom/polymarket/data/APIEventCategory;", "Swift_eventCategory", "categoryTitle", "getCategoryTitle", "Swift_categoryTitle", "teams", "", "Lcom/polymarket/data/ESportsTeam;", "getTeams", "()Ljava/util/List;", "Swift_teams", "slug", "getSlug", "Swift_slug", "isLive", "()Z", "Swift_isLive", "isUpcoming", "Swift_isUpcoming", "tagSlugs", "getTagSlugs", "Swift_tagSlugs", "sportName", "getSportName", "Swift_sportName", "isFinished", "Swift_isFinished", "hasTeams", "getHasTeams", "Swift_hasTeams", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "Swift_title", "tags", "Lcom/polymarket/data/APIEventTag;", "getTags", "Swift_tags", "newValue", "Lcom/polymarket/data/EMarketGroup;", "marketGroups", "getMarketGroups", "setMarketGroups", "(Ljava/util/List;)V", "Swift_marketGroups", "Swift_marketGroups_set", "value", "primaryTag", "getPrimaryTag", "()Lcom/polymarket/data/APIEventTag;", "Swift_primaryTag", "secondaryTag", "getSecondaryTag", "Swift_secondaryTag", "livestreamUrl", "getLivestreamUrl", "setLivestreamUrl", "(Ljava/lang/String;)V", "Swift_livestreamUrl", "Swift_livestreamUrl_set", "streamProvider", "getStreamProvider", "setStreamProvider", "Swift_streamProvider", "Swift_streamProvider_set", "livestreamAvailableBeforeStart", "getLivestreamAvailableBeforeStart", "()Ljava/lang/Boolean;", "setLivestreamAvailableBeforeStart", "(Ljava/lang/Boolean;)V", "Swift_livestreamAvailableBeforeStart", "(J)Ljava/lang/Boolean;", "Swift_livestreamAvailableBeforeStart_set", "(JLjava/lang/Boolean;)V", "Lcom/polymarket/data/EEvent$EventFeatureAvailability;", "featureAvailability", "getFeatureAvailability", "()Lcom/polymarket/data/EEvent$EventFeatureAvailability;", "setFeatureAvailability", "(Lcom/polymarket/data/EEvent$EventFeatureAvailability;)V", "Swift_featureAvailability", "Swift_featureAvailability_set", "comboEnabled", "getComboEnabled", "setComboEnabled", "Swift_comboEnabled", "Swift_comboEnabled_set", "comboNumMarkets", "getComboNumMarkets", "()Ljava/lang/Integer;", "setComboNumMarkets", "(Ljava/lang/Integer;)V", "Swift_comboNumMarkets", "(J)Ljava/lang/Integer;", "Swift_comboNumMarkets_set", "(JLjava/lang/Integer;)V", "comboNumSpreadsAndTotalsMarkets", "getComboNumSpreadsAndTotalsMarkets", "setComboNumSpreadsAndTotalsMarkets", "Swift_comboNumSpreadsAndTotalsMarkets", "Swift_comboNumSpreadsAndTotalsMarkets_set", "numMarkets", "getNumMarkets", "setNumMarkets", "Swift_numMarkets", "Swift_numMarkets_set", "numSpreadsAndTotalsMarkets", "getNumSpreadsAndTotalsMarkets", "setNumSpreadsAndTotalsMarkets", "Swift_numSpreadsAndTotalsMarkets", "Swift_numSpreadsAndTotalsMarkets_set", "Lcom/polymarket/data/EAmount;", "volume", "getVolume", "()Lcom/polymarket/data/EAmount;", "setVolume", "(Lcom/polymarket/data/EAmount;)V", "Swift_volume", "Swift_volume_set", "marketSlugs", "getMarketSlugs", "Swift_marketSlugs", "seriesSlug", "getSeriesSlug", "Swift_seriesSlug", "formattedDescription", "getFormattedDescription", "Swift_formattedDescription", "endDate", "Ljava/util/Date;", "getEndDate", "()Ljava/util/Date;", "Swift_endDate", "endDateDisplayText", "getEndDateDisplayText", "Swift_endDateDisplayText", "startDate", "getStartDate", "Swift_startDate", "createdAt", "getCreatedAt", "Swift_createdAt", MetricTracker.Action.CLOSED, "getClosed", "Swift_closed", "image", "getImage", "Swift_image", "imageURL", "Ljava/net/URI;", "getImageURL", "()Ljava/net/URI;", "Swift_imageURL", "livestreamURL", "getLivestreamURL", "Swift_livestreamURL", "requiresSignedLivestreamURL", "getRequiresSignedLivestreamURL", "Swift_requiresSignedLivestreamURL", "livestreamProviderName", "getLivestreamProviderName", "Swift_livestreamProviderName", "upcomingLivestreamStartDate", "at", "Swift_upcomingLivestreamStartDate_0", AttributeType.DATE, "hasLivestreamEnded", "Swift_hasLivestreamEnded_1", "hasLivestreamVideo", "getHasLivestreamVideo", "Swift_hasLivestreamVideo", "hasLiveLivestreamVideo", "getHasLiveLivestreamVideo", "Swift_hasLiveLivestreamVideo", "hasLineupsCapability", "getHasLineupsCapability", "Swift_hasLineupsCapability", "hasTimelineCapability", "getHasTimelineCapability", "Swift_hasTimelineCapability", "hasStatsCapability", "getHasStatsCapability", "Swift_hasStatsCapability", "hasSportDetailsCapability", "getHasSportDetailsCapability", "Swift_hasSportDetailsCapability", "ticker", "getTicker", "Swift_ticker", "updatedAt", "getUpdatedAt", "Swift_updatedAt", "hasPosition", "in_", "", "Swift_hasPosition_2", "positionedMarketSlugs", "sortDate", "getSortDate", "Swift_sortDate", "formattedTitle", "getFormattedTitle", "Swift_formattedTitle", "eventImageURL", "getEventImageURL", "Swift_eventImageURL", "primaryMarketsResolutionPhase", "Lcom/polymarket/data/EMarket$ResolutionPhase;", "getPrimaryMarketsResolutionPhase", "()Lcom/polymarket/data/EMarket$ResolutionPhase;", "Swift_primaryMarketsResolutionPhase", "market", "Lcom/polymarket/data/EMarket;", "exactSlug", "unusedp_0", "", "unusedp_1", "unusedp_2", "Swift_market_3", "bySlug", "Swift_market_4", "allMarketsHaveEndedTrading", "getAllMarketsHaveEndedTrading", "Swift_allMarketsHaveEndedTrading", "markets", "getMarkets", "Swift_markets", "for_", "Swift_market_5", "Lcom/polymarket/data/EMarket$MarketSide;", "Swift_market_6", "marketSide", "isComboEligible", "Swift_isComboEligible_7", "displayName", "Swift_displayName_8", "displayContext", "Lcom/polymarket/data/EMarket$MarketSide$DisplayContext;", "Swift_displayContext_9", "isSportsGame", "Swift_isSportsGame", "isStandardEvent", "Swift_isStandardEvent", "sportsGame", "Lcom/polymarket/data/EEvent$SportsGame;", "getSportsGame", "()Lcom/polymarket/data/EEvent$SportsGame;", "Swift_sportsGame", "standardEvent", "Lcom/polymarket/data/EEvent$StandardEvent;", "getStandardEvent", "()Lcom/polymarket/data/EEvent$StandardEvent;", "Swift_standardEvent", "Swift_marketSide_10", "resolveMarketSide", "marketSideId", "outcomeIndex", "marketSlug", "long", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Z)Lcom/polymarket/data/EMarket$MarketSide;", "Swift_resolveMarketSide_11", "(JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Z)Lcom/polymarket/data/EMarket$MarketSide;", "cache", "Lcom/polymarket/data/EMarketCache;", "Swift_cache_12", "marketId", "marketRulesItems", "Lcom/polymarket/data/EventDetailMarketRulesItem;", "getMarketRulesItems", "Swift_marketRulesItems", "byID", "Swift_market_13", "defaultMarketRulesItemID", "getDefaultMarketRulesItemID", "Swift_defaultMarketRulesItemID", "Swift_constructor_17", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "UIType", "EventFeatureAvailability", "SportsGame", "StandardEvent", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EEvent implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    private EEvent(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_17(mutableStruct);
    }

    private final native boolean Swift_allMarketsHaveEndedTrading(long Swift_peer);

    private final native EMarketCache Swift_cache_12(long Swift_peer, String marketId);

    private final native String Swift_categoryTitle(long Swift_peer);

    private final native Boolean Swift_closed(long Swift_peer);

    private final native Boolean Swift_comboEnabled(long Swift_peer);

    private final native void Swift_comboEnabled_set(long Swift_peer, Boolean value);

    private final native Integer Swift_comboNumMarkets(long Swift_peer);

    private final native void Swift_comboNumMarkets_set(long Swift_peer, Integer value);

    private final native Integer Swift_comboNumSpreadsAndTotalsMarkets(long Swift_peer);

    private final native void Swift_comboNumSpreadsAndTotalsMarkets_set(long Swift_peer, Integer value);

    private final native long Swift_constructor_17(MutableStruct copy);

    private final native Date Swift_createdAt(long Swift_peer);

    private final native String Swift_defaultMarketRulesItemID(long Swift_peer);

    private final native EMarket.MarketSide.DisplayContext Swift_displayContext_9(long Swift_peer, EMarket.MarketSide marketSide);

    private final native String Swift_displayName_8(long Swift_peer, EMarket.MarketSide marketSide);

    private final native Date Swift_endDate(long Swift_peer);

    private final native String Swift_endDateDisplayText(long Swift_peer);

    private final native APIEventCategory Swift_eventCategory(long Swift_peer);

    private final native URI Swift_eventImageURL(long Swift_peer);

    private final native EventFeatureAvailability Swift_featureAvailability(long Swift_peer);

    private final native void Swift_featureAvailability_set(long Swift_peer, EventFeatureAvailability value);

    private final native String Swift_formattedDescription(long Swift_peer);

    private final native String Swift_formattedTitle(long Swift_peer);

    private final native boolean Swift_hasLineupsCapability(long Swift_peer);

    private final native boolean Swift_hasLiveLivestreamVideo(long Swift_peer);

    private final native boolean Swift_hasLivestreamEnded_1(long Swift_peer, Date date);

    private final native boolean Swift_hasLivestreamVideo(long Swift_peer);

    private final native boolean Swift_hasPosition_2(long Swift_peer, Set<String> positionedMarketSlugs);

    private final native boolean Swift_hasSportDetailsCapability(long Swift_peer);

    private final native boolean Swift_hasStatsCapability(long Swift_peer);

    private final native boolean Swift_hasTeams(long Swift_peer);

    private final native boolean Swift_hasTimelineCapability(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native String Swift_image(long Swift_peer);

    private final native URI Swift_imageURL(long Swift_peer);

    private final native boolean Swift_isComboEligible_7(long Swift_peer, EMarket.MarketSide marketSide);

    private final native boolean Swift_isFinished(long Swift_peer);

    private final native boolean Swift_isLive(long Swift_peer);

    private final native boolean Swift_isSportsGame(long Swift_peer);

    private final native boolean Swift_isStandardEvent(long Swift_peer);

    private final native boolean Swift_isUpcoming(long Swift_peer);

    private final native String Swift_leagueDisplayName(long Swift_peer);

    private final native Boolean Swift_livestreamAvailableBeforeStart(long Swift_peer);

    private final native void Swift_livestreamAvailableBeforeStart_set(long Swift_peer, Boolean value);

    private final native String Swift_livestreamProviderName(long Swift_peer);

    private final native URI Swift_livestreamURL(long Swift_peer);

    private final native String Swift_livestreamUrl(long Swift_peer);

    private final native void Swift_livestreamUrl_set(long Swift_peer, String value);

    private final native List<EMarketGroup> Swift_marketGroups(long Swift_peer);

    private final native void Swift_marketGroups_set(long Swift_peer, List<EMarketGroup> value);

    private final native List<EventDetailMarketRulesItem> Swift_marketRulesItems(long Swift_peer);

    private final native EMarket.MarketSide Swift_marketSide_10(long Swift_peer, String id);

    private final native List<String> Swift_marketSlugs(long Swift_peer);

    private final native EMarket Swift_market_13(long Swift_peer, String id);

    private final native EMarket Swift_market_3(long Swift_peer, String slug);

    private final native EMarket Swift_market_4(long Swift_peer, String slug);

    private final native EMarket Swift_market_5(long Swift_peer, String id);

    private final native EMarket Swift_market_6(long Swift_peer, EMarket.MarketSide marketSide);

    private final native List<EMarket> Swift_markets(long Swift_peer);

    private final native Integer Swift_numMarkets(long Swift_peer);

    private final native void Swift_numMarkets_set(long Swift_peer, Integer value);

    private final native Integer Swift_numSpreadsAndTotalsMarkets(long Swift_peer);

    private final native void Swift_numSpreadsAndTotalsMarkets_set(long Swift_peer, Integer value);

    private final native EMarket.ResolutionPhase Swift_primaryMarketsResolutionPhase(long Swift_peer);

    private final native APIEventTag Swift_primaryTag(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native boolean Swift_requiresSignedLivestreamURL(long Swift_peer);

    private final native EMarket.MarketSide Swift_resolveMarketSide_11(long Swift_peer, String marketSideId, Integer outcomeIndex, String marketSlug, boolean r6);

    private final native APIEventTag Swift_secondaryTag(long Swift_peer);

    private final native String Swift_seriesSlug(long Swift_peer);

    private final native String Swift_slug(long Swift_peer);

    private final native Date Swift_sortDate(long Swift_peer);

    private final native String Swift_sportName(long Swift_peer);

    private final native ESportsSlug Swift_sportSlug(long Swift_peer);

    private final native SportsGame Swift_sportsGame(long Swift_peer);

    private final native StandardEvent Swift_standardEvent(long Swift_peer);

    private final native Date Swift_startDate(long Swift_peer);

    private final native String Swift_streamProvider(long Swift_peer);

    private final native void Swift_streamProvider_set(long Swift_peer, String value);

    private final native List<String> Swift_tagSlugs(long Swift_peer);

    private final native List<APIEventTag> Swift_tags(long Swift_peer);

    private final native List<ESportsTeam> Swift_teams(long Swift_peer);

    private final native String Swift_ticker(long Swift_peer);

    private final native String Swift_title(long Swift_peer);

    private final native Date Swift_upcomingLivestreamStartDate_0(long Swift_peer, Date date);

    private final native Date Swift_updatedAt(long Swift_peer);

    private final native EAmount Swift_volume(long Swift_peer);

    private final native void Swift_volume_set(long Swift_peer, EAmount value);

    public static /* synthetic */ EMarket market$default(EEvent eEvent, String str, Void r3, Void r4, Void r5, int i, Object obj) {
        if ((i & 2) != 0) {
            r3 = null;
        }
        if ((i & 4) != 0) {
            r4 = null;
        }
        if ((i & 8) != 0) {
            r5 = null;
        }
        return eEvent.market(str, r3, r4, r5);
    }

    public static /* synthetic */ EMarket.MarketSide resolveMarketSide$default(EEvent eEvent, String str, Integer num, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        return eEvent.resolveMarketSide(str, num, str2, z);
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

    public final EMarketCache cache(String for_) {
        for_.getClass();
        return Swift_cache_12(this.Swift_peer, for_);
    }

    @Override // skip.lib.MutableStruct
    public void didmutate() {
        super.didmutate();
    }

    public final EMarket.MarketSide.DisplayContext displayContext(EMarket.MarketSide for_) {
        for_.getClass();
        return Swift_displayContext_9(this.Swift_peer, for_);
    }

    public final String displayName(EMarket.MarketSide for_) {
        for_.getClass();
        return Swift_displayName_8(this.Swift_peer, for_);
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

    public final boolean getAllMarketsHaveEndedTrading() {
        return Swift_allMarketsHaveEndedTrading(this.Swift_peer);
    }

    public final String getCategoryTitle() {
        return Swift_categoryTitle(this.Swift_peer);
    }

    public final Boolean getClosed() {
        return Swift_closed(this.Swift_peer);
    }

    public final Boolean getComboEnabled() {
        return Swift_comboEnabled(this.Swift_peer);
    }

    public final Integer getComboNumMarkets() {
        return Swift_comboNumMarkets(this.Swift_peer);
    }

    public final Integer getComboNumSpreadsAndTotalsMarkets() {
        return Swift_comboNumSpreadsAndTotalsMarkets(this.Swift_peer);
    }

    public final Date getCreatedAt() {
        return Swift_createdAt(this.Swift_peer);
    }

    public final String getDefaultMarketRulesItemID() {
        return Swift_defaultMarketRulesItemID(this.Swift_peer);
    }

    public final Date getEndDate() {
        return Swift_endDate(this.Swift_peer);
    }

    public final String getEndDateDisplayText() {
        return Swift_endDateDisplayText(this.Swift_peer);
    }

    public final APIEventCategory getEventCategory() {
        return Swift_eventCategory(this.Swift_peer);
    }

    public final URI getEventImageURL() {
        return Swift_eventImageURL(this.Swift_peer);
    }

    public final EventFeatureAvailability getFeatureAvailability() {
        return Swift_featureAvailability(this.Swift_peer);
    }

    public final String getFormattedDescription() {
        return Swift_formattedDescription(this.Swift_peer);
    }

    public final String getFormattedTitle() {
        return Swift_formattedTitle(this.Swift_peer);
    }

    public final boolean getHasLineupsCapability() {
        return Swift_hasLineupsCapability(this.Swift_peer);
    }

    public final boolean getHasLiveLivestreamVideo() {
        return Swift_hasLiveLivestreamVideo(this.Swift_peer);
    }

    public final boolean getHasLivestreamVideo() {
        return Swift_hasLivestreamVideo(this.Swift_peer);
    }

    public final boolean getHasSportDetailsCapability() {
        return Swift_hasSportDetailsCapability(this.Swift_peer);
    }

    public final boolean getHasStatsCapability() {
        return Swift_hasStatsCapability(this.Swift_peer);
    }

    public final boolean getHasTeams() {
        return Swift_hasTeams(this.Swift_peer);
    }

    public final boolean getHasTimelineCapability() {
        return Swift_hasTimelineCapability(this.Swift_peer);
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

    public final String getLeagueDisplayName() {
        return Swift_leagueDisplayName(this.Swift_peer);
    }

    public final Boolean getLivestreamAvailableBeforeStart() {
        return Swift_livestreamAvailableBeforeStart(this.Swift_peer);
    }

    public final String getLivestreamProviderName() {
        return Swift_livestreamProviderName(this.Swift_peer);
    }

    public final URI getLivestreamURL() {
        return Swift_livestreamURL(this.Swift_peer);
    }

    public final String getLivestreamUrl() {
        return Swift_livestreamUrl(this.Swift_peer);
    }

    public final List<EMarketGroup> getMarketGroups() {
        return Swift_marketGroups(this.Swift_peer);
    }

    public final List<EventDetailMarketRulesItem> getMarketRulesItems() {
        return Swift_marketRulesItems(this.Swift_peer);
    }

    public final List<String> getMarketSlugs() {
        return Swift_marketSlugs(this.Swift_peer);
    }

    public final List<EMarket> getMarkets() {
        return Swift_markets(this.Swift_peer);
    }

    public final Integer getNumMarkets() {
        return Swift_numMarkets(this.Swift_peer);
    }

    public final Integer getNumSpreadsAndTotalsMarkets() {
        return Swift_numSpreadsAndTotalsMarkets(this.Swift_peer);
    }

    public final EMarket.ResolutionPhase getPrimaryMarketsResolutionPhase() {
        return Swift_primaryMarketsResolutionPhase(this.Swift_peer);
    }

    public final APIEventTag getPrimaryTag() {
        return Swift_primaryTag(this.Swift_peer);
    }

    public final boolean getRequiresSignedLivestreamURL() {
        return Swift_requiresSignedLivestreamURL(this.Swift_peer);
    }

    public final APIEventTag getSecondaryTag() {
        return Swift_secondaryTag(this.Swift_peer);
    }

    public final String getSeriesSlug() {
        return Swift_seriesSlug(this.Swift_peer);
    }

    public final String getSlug() {
        return Swift_slug(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    public final Date getSortDate() {
        return Swift_sortDate(this.Swift_peer);
    }

    public final String getSportName() {
        return Swift_sportName(this.Swift_peer);
    }

    public final ESportsSlug getSportSlug() {
        return Swift_sportSlug(this.Swift_peer);
    }

    public final SportsGame getSportsGame() {
        return Swift_sportsGame(this.Swift_peer);
    }

    public final StandardEvent getStandardEvent() {
        return Swift_standardEvent(this.Swift_peer);
    }

    public final Date getStartDate() {
        return Swift_startDate(this.Swift_peer);
    }

    public final String getStreamProvider() {
        return Swift_streamProvider(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final List<String> getTagSlugs() {
        return Swift_tagSlugs(this.Swift_peer);
    }

    public final List<APIEventTag> getTags() {
        return Swift_tags(this.Swift_peer);
    }

    public final List<ESportsTeam> getTeams() {
        return Swift_teams(this.Swift_peer);
    }

    public final String getTicker() {
        return Swift_ticker(this.Swift_peer);
    }

    public final String getTitle() {
        return Swift_title(this.Swift_peer);
    }

    public final Date getUpdatedAt() {
        return Swift_updatedAt(this.Swift_peer);
    }

    public final EAmount getVolume() {
        return Swift_volume(this.Swift_peer);
    }

    public final boolean hasLivestreamEnded(Date at) {
        at.getClass();
        return Swift_hasLivestreamEnded_1(this.Swift_peer, at);
    }

    public final boolean hasPosition(Set<String> in_) {
        in_.getClass();
        return Swift_hasPosition_2(this.Swift_peer, in_);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isComboEligible(EMarket.MarketSide for_) {
        for_.getClass();
        return Swift_isComboEligible_7(this.Swift_peer, for_);
    }

    public final boolean isFinished() {
        return Swift_isFinished(this.Swift_peer);
    }

    public final boolean isLive() {
        return Swift_isLive(this.Swift_peer);
    }

    public final boolean isSportsGame() {
        return Swift_isSportsGame(this.Swift_peer);
    }

    public final boolean isStandardEvent() {
        return Swift_isStandardEvent(this.Swift_peer);
    }

    public final boolean isUpcoming() {
        return Swift_isUpcoming(this.Swift_peer);
    }

    public final EMarket market(String exactSlug, Void unusedp_0, Void unusedp_1, Void unusedp_2) {
        exactSlug.getClass();
        return Swift_market_3(this.Swift_peer, exactSlug);
    }

    public final EMarket.MarketSide marketSide(String for_) {
        for_.getClass();
        return Swift_marketSide_10(this.Swift_peer, for_);
    }

    public final EMarket.MarketSide resolveMarketSide(String marketSideId, Integer outcomeIndex, String marketSlug, boolean r11) {
        return Swift_resolveMarketSide_11(this.Swift_peer, marketSideId, outcomeIndex, marketSlug, r11);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new EEvent(this);
    }

    public final void setComboEnabled(Boolean bool) {
        willmutate();
        try {
            Swift_comboEnabled_set(this.Swift_peer, bool);
        } finally {
            didmutate();
        }
    }

    public final void setComboNumMarkets(Integer num) {
        willmutate();
        try {
            Swift_comboNumMarkets_set(this.Swift_peer, num);
        } finally {
            didmutate();
        }
    }

    public final void setComboNumSpreadsAndTotalsMarkets(Integer num) {
        willmutate();
        try {
            Swift_comboNumSpreadsAndTotalsMarkets_set(this.Swift_peer, num);
        } finally {
            didmutate();
        }
    }

    public final void setFeatureAvailability(EventFeatureAvailability eventFeatureAvailability) {
        willmutate();
        try {
            Swift_featureAvailability_set(this.Swift_peer, eventFeatureAvailability);
        } finally {
            didmutate();
        }
    }

    public final void setLivestreamAvailableBeforeStart(Boolean bool) {
        willmutate();
        try {
            Swift_livestreamAvailableBeforeStart_set(this.Swift_peer, bool);
        } finally {
            didmutate();
        }
    }

    public final void setLivestreamUrl(String str) {
        willmutate();
        try {
            Swift_livestreamUrl_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setMarketGroups(List<EMarketGroup> list) {
        List<EMarketGroup> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_marketGroups_set(this.Swift_peer, list2);
        } finally {
            didmutate();
        }
    }

    public final void setNumMarkets(Integer num) {
        willmutate();
        try {
            Swift_numMarkets_set(this.Swift_peer, num);
        } finally {
            didmutate();
        }
    }

    public final void setNumSpreadsAndTotalsMarkets(Integer num) {
        willmutate();
        try {
            Swift_numSpreadsAndTotalsMarkets_set(this.Swift_peer, num);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    public final void setStreamProvider(String str) {
        willmutate();
        try {
            Swift_streamProvider_set(this.Swift_peer, str);
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

    public final void setVolume(EAmount eAmount) {
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_volume_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    public final Date upcomingLivestreamStartDate(Date at) {
        at.getClass();
        return Swift_upcomingLivestreamStartDate_0(this.Swift_peer, at);
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u009a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 á\u00032\u00020\u00012\u00020\u00022\u00020\u0003:\u0016×\u0003Ø\u0003Ù\u0003Ú\u0003Û\u0003Ü\u0003Ý\u0003Þ\u0003ß\u0003à\u0003á\u0003B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010\u001e\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001c\u0010\"\u001a\u0004\u0018\u00010\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010#J\u0017\u0010+\u001a\u0004\u0018\u00010%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010,\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010-\u001a\u0004\u0018\u00010%H\u0082 J\u001c\u00101\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u00102J\u0017\u00107\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u00108\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010-\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u0010<\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010=\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010-\u001a\u0004\u0018\u00010\u001bH\u0082 J\u001d\u0010E\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010>2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J%\u0010F\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010>H\u0082 J\u0017\u0010I\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010L\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010O\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010R\u001a\u0004\u0018\u00010%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010U\u001a\u0004\u0018\u00010%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010X\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010_\u001a\u0004\u0018\u00010Y2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010`\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010-\u001a\u0004\u0018\u00010YH\u0082 J\u0017\u0010d\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010e\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010-\u001a\u0004\u0018\u00010\u001bH\u0082 J\u001d\u0010j\u001a\n\u0012\u0004\u0012\u00020f\u0018\u00010>2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J%\u0010k\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020f\u0018\u00010>H\u0082 J\u0017\u0010q\u001a\u0004\u0018\u00010f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010r\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010-\u001a\u0004\u0018\u00010fH\u0082 J\u0017\u0010v\u001a\u0004\u0018\u00010f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010w\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010-\u001a\u0004\u0018\u00010fH\u0082 J\u0015\u0010~\u001a\u00020x2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010\u007f\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010-\u001a\u00020xH\u0082 J\u001d\u0010\u0084\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010>2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J%\u0010\u0085\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\r\u0010-\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010>H\u0082 J\u001d\u0010\u0089\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010>2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J%\u0010\u008a\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\r\u0010-\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010>H\u0082 J\u001d\u0010\u008e\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010>2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J%\u0010\u008f\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\r\u0010-\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010>H\u0082 J\u0017\u0010\u0096\u0001\u001a\u00030\u0090\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010\u0097\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010-\u001a\u00030\u0090\u0001H\u0082 J\u0019\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0080\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u0080\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010£\u0001\u001a\u0005\u0018\u00010 \u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010¦\u0001\u001a\u0005\u0018\u00010\u0080\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010©\u0001\u001a\u0005\u0018\u00010\u0080\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010®\u0001\u001a\u0005\u0018\u00010«\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0003\u0010¯\u0001J\u001f\u0010²\u0001\u001a\u0005\u0018\u00010«\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0003\u0010¯\u0001J\u0019\u0010¹\u0001\u001a\u0005\u0018\u00010³\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J!\u0010º\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\t\u0010-\u001a\u0005\u0018\u00010³\u0001H\u0082 J\u0019\u0010Á\u0001\u001a\u0005\u0018\u00010»\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J!\u0010Â\u0001\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\t\u0010-\u001a\u0005\u0018\u00010»\u0001H\u0082 J\u0019\u0010Ç\u0001\u001a\u0005\u0018\u00010Ä\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010Ê\u0001\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010Í\u0001\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010Ð\u0001\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010Ô\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010×\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010Ú\u0001\u001a\u0004\u0018\u00010%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010Ý\u0001\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010à\u0001\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010â\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010å\u0001\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\n\u0010æ\u0001\u001a\u0005\u0018\u00010ç\u0001J\u0019\u0010è\u0001\u001a\u0005\u0018\u00010ç\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\t\u0010é\u0001\u001a\u0004\u0018\u00010\u001bJ\u0018\u0010ê\u0001\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010ì\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010ï\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010ð\u0001\u001a\u0005\u0018\u00010 \u00012\u0007\u0010ñ\u0001\u001a\u00020\u001b2\b\u0010ò\u0001\u001a\u00030ó\u0001J,\u0010ô\u0001\u001a\u0005\u0018\u00010 \u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010ñ\u0001\u001a\u00020\u001b2\b\u0010ò\u0001\u001a\u00030ó\u0001H\u0082 J\u0016\u0010÷\u0001\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J)\u0010ü\u0001\u001a\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010ù\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010\u0080\u0002\u001a\u0004\u0018\u00010?2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010\u0085\u0002\u001a\u0005\u0018\u00010\u0082\u00022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010\u0088\u0002\u001a\u0004\u0018\u00010?2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010\u008b\u0002\u001a\u0004\u0018\u00010?2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001c\u0010\u008c\u0002\u001a\u00020\u00152\b\u0010\u008d\u0002\u001a\u00030\u008e\u00022\t\u0010\u008f\u0002\u001a\u0004\u0018\u00010?J+\u0010\u0090\u0002\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u008d\u0002\u001a\u00030\u008e\u00022\t\u0010\u0091\u0002\u001a\u0004\u0018\u00010?H\u0082 J\u0012\u0010\u0092\u0002\u001a\u00020\u00192\t\u0010\u008f\u0002\u001a\u0004\u0018\u00010?J!\u0010\u0093\u0002\u001a\u00020\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\t\u0010\u0091\u0002\u001a\u0004\u0018\u00010?H\u0082 J\u0018\u0010\u0096\u0002\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u0099\u0002\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010\u009e\u0002\u001a\u00030\u009b\u00022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010¡\u0002\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010£\u0002\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010¥\u0002\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010§\u0002\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010©\u0002\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010¬\u0002\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010±\u0002\u001a\u0005\u0018\u00010®\u00022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010´\u0002\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010·\u0002\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010º\u0002\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010½\u0002\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010¿\u0002\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001c\u0010Â\u0002\u001a\b\u0012\u0004\u0012\u00020\u001b0>2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001c\u0010Å\u0002\u001a\b\u0012\u0004\u0012\u00020\u001b0>2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010È\u0002\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0013\u0010É\u0002\u001a\u0005\u0018\u00010Ê\u00022\u0007\u0010\u008f\u0002\u001a\u00020\u001bJ!\u0010Ë\u0002\u001a\u0005\u0018\u00010Ê\u00022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0082 J\u0013\u0010Ì\u0002\u001a\u0005\u0018\u00010Í\u00022\u0007\u0010\u008f\u0002\u001a\u00020\u001bJ\"\u0010Î\u0002\u001a\u0005\u0018\u00010Í\u00022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010Ï\u0002\u001a\u00020\u001bH\u0082 J\u0013\u0010Ð\u0002\u001a\u0005\u0018\u00010Ê\u00022\u0007\u0010\u008f\u0002\u001a\u00020?J\"\u0010Ñ\u0002\u001a\u0005\u0018\u00010Ê\u00022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010\u0091\u0002\u001a\u00020?H\u0082 J\u0013\u0010Ò\u0002\u001a\u0005\u0018\u00010\u0080\u00012\u0007\u0010\u008f\u0002\u001a\u00020?J\"\u0010Ó\u0002\u001a\u0005\u0018\u00010\u0080\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010\u0091\u0002\u001a\u00020?H\u0082 J\u001c\u0010Ô\u0002\u001a\u0005\u0018\u00010Ê\u00022\u0007\u0010\u008f\u0002\u001a\u00020?2\u0007\u0010Õ\u0002\u001a\u00020\u0019J+\u0010Ö\u0002\u001a\u0005\u0018\u00010Ê\u00022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010\u0091\u0002\u001a\u00020?2\u0007\u0010Õ\u0002\u001a\u00020\u0019H\u0082 J\u0019\u0010×\u0002\u001a\u0005\u0018\u00010«\u00012\u0007\u0010\u008f\u0002\u001a\u00020?¢\u0006\u0003\u0010Ø\u0002J(\u0010Ù\u0002\u001a\u0005\u0018\u00010«\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010\u0091\u0002\u001a\u00020?H\u0082 ¢\u0006\u0003\u0010Ú\u0002J\"\u0010Û\u0002\u001a\u0005\u0018\u00010«\u00012\u0007\u0010\u008f\u0002\u001a\u00020?2\u0007\u0010Õ\u0002\u001a\u00020\u0019¢\u0006\u0003\u0010Ü\u0002J1\u0010Ý\u0002\u001a\u0005\u0018\u00010«\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010\u0091\u0002\u001a\u00020?2\u0007\u0010Õ\u0002\u001a\u00020\u0019H\u0082 ¢\u0006\u0003\u0010Þ\u0002J\u0013\u0010ß\u0002\u001a\u0005\u0018\u00010Ê\u00022\u0007\u0010à\u0002\u001a\u00020\u0019J\"\u0010á\u0002\u001a\u0005\u0018\u00010Ê\u00022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010à\u0002\u001a\u00020\u0019H\u0082 J\u0013\u0010â\u0002\u001a\u0005\u0018\u00010Ê\u00022\u0007\u0010\u008f\u0002\u001a\u00020?J\"\u0010ã\u0002\u001a\u0005\u0018\u00010Ê\u00022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010\u0091\u0002\u001a\u00020?H\u0082 J\u0013\u0010ä\u0002\u001a\u0005\u0018\u00010Ê\u00022\u0007\u0010\u008f\u0002\u001a\u00020?J\"\u0010å\u0002\u001a\u0005\u0018\u00010Ê\u00022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010\u0091\u0002\u001a\u00020?H\u0082 J\u0012\u0010æ\u0002\u001a\u0004\u0018\u00010\u001b2\u0007\u0010\u008f\u0002\u001a\u00020?J!\u0010ç\u0002\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010\u0091\u0002\u001a\u00020?H\u0082 J\u0012\u0010ª\u0001\u001a\u0004\u0018\u00010\u001b2\u0007\u0010\u008f\u0002\u001a\u00020?J!\u0010è\u0002\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010\u0091\u0002\u001a\u00020?H\u0082 J\u0019\u0010é\u0002\u001a\u0005\u0018\u00010«\u00012\u0007\u0010\u008f\u0002\u001a\u00020?¢\u0006\u0003\u0010Ø\u0002J(\u0010ê\u0002\u001a\u0005\u0018\u00010«\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010\u0091\u0002\u001a\u00020?H\u0082 ¢\u0006\u0003\u0010Ú\u0002J\u0019\u0010ë\u0002\u001a\u0005\u0018\u00010«\u00012\u0007\u0010\u008f\u0002\u001a\u00020?¢\u0006\u0003\u0010Ø\u0002J(\u0010ì\u0002\u001a\u0005\u0018\u00010«\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010\u0091\u0002\u001a\u00020?H\u0082 ¢\u0006\u0003\u0010Ú\u0002J\u0019\u0010ð\u0002\u001a\u0005\u0018\u00010Ê\u00022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010ó\u0002\u001a\u0005\u0018\u00010Ê\u00022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010ö\u0002\u001a\u0005\u0018\u00010Ê\u00022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010ù\u0002\u001a\u0005\u0018\u00010Ê\u00022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010ú\u0002\u001a\u0005\u0018\u00010«\u00012\u0007\u0010û\u0002\u001a\u00020\u0015¢\u0006\u0003\u0010ü\u0002J(\u0010ý\u0002\u001a\u0005\u0018\u00010«\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010û\u0002\u001a\u00020\u0015H\u0082 ¢\u0006\u0003\u0010þ\u0002J\u0016\u0010\u0080\u0003\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010\u0081\u0003\u001a\u0005\u0018\u00010«\u00012\u0007\u0010û\u0002\u001a\u00020\u0015¢\u0006\u0003\u0010ü\u0002J(\u0010\u0082\u0003\u001a\u0005\u0018\u00010«\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010û\u0002\u001a\u00020\u0015H\u0082 ¢\u0006\u0003\u0010þ\u0002J\u0010\u0010\u0083\u0003\u001a\u00020\u00152\u0007\u0010\u0091\u0002\u001a\u00020?J\u001f\u0010\u0084\u0003\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010\u0091\u0002\u001a\u00020?H\u0082 J\u0018\u0010Ã\u0001\u001a\u0004\u0018\u00010\u00192\u0007\u0010\u008f\u0002\u001a\u00020?¢\u0006\u0003\u0010\u0085\u0003J'\u0010\u0086\u0003\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010\u0091\u0002\u001a\u00020?H\u0082 ¢\u0006\u0003\u0010\u0087\u0003J\u0012\u0010\u0088\u0003\u001a\u0004\u0018\u00010\u001b2\u0007\u0010\u008f\u0002\u001a\u00020?J!\u0010\u0089\u0003\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010\u0091\u0002\u001a\u00020?H\u0082 J\u0017\u0010\u008e\u0003\u001a\u00030\u008b\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u0091\u0003\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010\u0096\u0003\u001a\u0005\u0018\u00010\u0093\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010\u0099\u0003\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010\u009c\u0003\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010\u009f\u0003\u001a\u0004\u0018\u00010Y2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010¢\u0003\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010¥\u0003\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010¨\u0003\u001a\u0004\u0018\u00010f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010«\u0003\u001a\u0004\u0018\u00010f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010®\u0003\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010±\u0003\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010¶\u0003\u001a\u00030³\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010¹\u0003\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010¼\u0003\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010¿\u0003\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010Â\u0003\u001a\u0004\u0018\u00010Y2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001b\u0010Ã\u0003\u001a\u0004\u0018\u00010\u001b2\u0007\u0010\u008f\u0002\u001a\u00020?2\u0007\u0010Ä\u0003\u001a\u00020\u0015J*\u0010Å\u0003\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010\u0091\u0002\u001a\u00020?2\u0007\u0010Ä\u0003\u001a\u00020\u0015H\u0082 J\u0016\u0010Æ\u0003\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\t\u0010Ò\u0003\u001a\u00020\u0001H\u0016J\u0019\u0010Ó\u0003\u001a\t\u0012\u0004\u0012\u00020\u00170Ô\u00032\u0007\u0010Õ\u0003\u001a\u00020\u0019H\u0016J\u001a\u0010Ö\u0003\u001a\t\u0012\u0004\u0012\u00020\u00170Ô\u00032\u0007\u0010Õ\u0003\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b \u0010!R(\u0010&\u001a\u0004\u0018\u00010%2\b\u0010$\u001a\u0004\u0018\u00010%8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0013\u0010.\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b/\u00100R(\u00103\u001a\u0004\u0018\u00010\u001b2\b\u0010$\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010\u001d\"\u0004\b5\u00106R(\u00109\u001a\u0004\u0018\u00010\u001b2\b\u0010$\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010\u001d\"\u0004\b;\u00106R4\u0010@\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010>2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010>8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0013\u0010G\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\bH\u0010\u001dR\u0013\u0010J\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\bK\u0010\u001dR\u0013\u0010M\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\bN\u0010\u001dR\u0013\u0010P\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\bQ\u0010(R\u0013\u0010S\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\bT\u0010(R\u0013\u0010V\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\bW\u0010\u001dR(\u0010Z\u001a\u0004\u0018\u00010Y2\b\u0010$\u001a\u0004\u0018\u00010Y8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R(\u0010a\u001a\u0004\u0018\u00010\u001b2\b\u0010$\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010\u001d\"\u0004\bc\u00106R4\u0010g\u001a\n\u0012\u0004\u0012\u00020f\u0018\u00010>2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020f\u0018\u00010>8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010B\"\u0004\bi\u0010DR(\u0010l\u001a\u0004\u0018\u00010f2\b\u0010$\u001a\u0004\u0018\u00010f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR(\u0010s\u001a\u0004\u0018\u00010f2\b\u0010$\u001a\u0004\u0018\u00010f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bt\u0010n\"\u0004\bu\u0010pR$\u0010y\u001a\u00020x2\u0006\u0010$\u001a\u00020x8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R5\u0010\u0081\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010>2\r\u0010$\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010>8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0082\u0001\u0010B\"\u0005\b\u0083\u0001\u0010DR5\u0010\u0086\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010>2\r\u0010$\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010>8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0087\u0001\u0010B\"\u0005\b\u0088\u0001\u0010DR5\u0010\u008b\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010>2\r\u0010$\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010>8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008c\u0001\u0010B\"\u0005\b\u008d\u0001\u0010DR+\u0010\u0091\u0001\u001a\u00030\u0090\u00012\u0007\u0010$\u001a\u00030\u0090\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0017\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0080\u00018F¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0017\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u0080\u00018F¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009a\u0001R\u0017\u0010\u009f\u0001\u001a\u0005\u0018\u00010 \u00018F¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0017\u0010¤\u0001\u001a\u0005\u0018\u00010\u0080\u00018F¢\u0006\b\u001a\u0006\b¥\u0001\u0010\u009a\u0001R\u0017\u0010§\u0001\u001a\u0005\u0018\u00010\u0080\u00018F¢\u0006\b\u001a\u0006\b¨\u0001\u0010\u009a\u0001R\u0017\u0010ª\u0001\u001a\u0005\u0018\u00010«\u00018F¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0017\u0010°\u0001\u001a\u0005\u0018\u00010«\u00018F¢\u0006\b\u001a\u0006\b±\u0001\u0010\u00ad\u0001R/\u0010´\u0001\u001a\u0005\u0018\u00010³\u00012\t\u0010$\u001a\u0005\u0018\u00010³\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R/\u0010¼\u0001\u001a\u0005\u0018\u00010»\u00012\t\u0010$\u001a\u0005\u0018\u00010»\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R\u0017\u0010Ã\u0001\u001a\u0005\u0018\u00010Ä\u00018F¢\u0006\b\u001a\u0006\bÅ\u0001\u0010Æ\u0001R\u0015\u0010È\u0001\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0007\u001a\u0005\bÉ\u0001\u0010\u001dR\u0015\u0010Ë\u0001\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0007\u001a\u0005\bÌ\u0001\u0010\u001dR\u0015\u0010Î\u0001\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0007\u001a\u0005\bÏ\u0001\u0010\u001dR\u0014\u0010Ñ\u0001\u001a\u00020\u00158F¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Ó\u0001R\u0014\u0010Õ\u0001\u001a\u00020\u00158F¢\u0006\b\u001a\u0006\bÖ\u0001\u0010Ó\u0001R\u0015\u0010Ø\u0001\u001a\u0004\u0018\u00010%8F¢\u0006\u0007\u001a\u0005\bÙ\u0001\u0010(R\u0015\u0010Û\u0001\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0007\u001a\u0005\bÜ\u0001\u0010\u001dR\u0015\u0010Þ\u0001\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0007\u001a\u0005\bß\u0001\u0010\u001dR\u0014\u0010á\u0001\u001a\u00020\u00158F¢\u0006\b\u001a\u0006\bá\u0001\u0010Ó\u0001R\u0015\u0010ã\u0001\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0007\u001a\u0005\bä\u0001\u0010\u001dR\u0014\u0010ë\u0001\u001a\u00020\u00158F¢\u0006\b\u001a\u0006\bë\u0001\u0010Ó\u0001R\u0014\u0010í\u0001\u001a\u00020\u00158F¢\u0006\b\u001a\u0006\bî\u0001\u0010Ó\u0001R\u0013\u0010õ\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\bö\u0001\u0010\u001dR'\u0010ø\u0001\u001a\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010ù\u00018F¢\u0006\b\u001a\u0006\bú\u0001\u0010û\u0001R\u0016\u0010ý\u0001\u001a\u0004\u0018\u00010?8F¢\u0006\b\u001a\u0006\bþ\u0001\u0010ÿ\u0001R\u0017\u0010\u0081\u0002\u001a\u0005\u0018\u00010\u0082\u00028F¢\u0006\b\u001a\u0006\b\u0083\u0002\u0010\u0084\u0002R\u0016\u0010\u0086\u0002\u001a\u0004\u0018\u00010?8F¢\u0006\b\u001a\u0006\b\u0087\u0002\u0010ÿ\u0001R\u0016\u0010\u0089\u0002\u001a\u0004\u0018\u00010?8F¢\u0006\b\u001a\u0006\b\u008a\u0002\u0010ÿ\u0001R\u0015\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0007\u001a\u0005\b\u0095\u0002\u0010\u001dR\u0013\u0010\u0097\u0002\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b\u0098\u0002\u0010\u001dR\u0015\u0010\u009a\u0002\u001a\u00030\u009b\u00028F¢\u0006\b\u001a\u0006\b\u009c\u0002\u0010\u009d\u0002R\u0013\u0010\u009f\u0002\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b \u0002\u0010\u001dR\u0014\u0010¢\u0002\u001a\u00020\u00158F¢\u0006\b\u001a\u0006\b¢\u0002\u0010Ó\u0001R\u0014\u0010¤\u0002\u001a\u00020\u00158F¢\u0006\b\u001a\u0006\b¤\u0002\u0010Ó\u0001R\u0014\u0010¦\u0002\u001a\u00020\u00158F¢\u0006\b\u001a\u0006\b¦\u0002\u0010Ó\u0001R\u0014\u0010¨\u0002\u001a\u00020\u00158F¢\u0006\b\u001a\u0006\b¨\u0002\u0010Ó\u0001R\u0013\u0010ª\u0002\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b«\u0002\u0010\u001dR\u0017\u0010\u00ad\u0002\u001a\u0005\u0018\u00010®\u00028F¢\u0006\b\u001a\u0006\b¯\u0002\u0010°\u0002R\u0015\u0010²\u0002\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0007\u001a\u0005\b³\u0002\u0010\u001dR\u0015\u0010µ\u0002\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0007\u001a\u0005\b¶\u0002\u0010\u001dR\u0015\u0010¸\u0002\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0007\u001a\u0005\b¹\u0002\u0010\u001dR\u0014\u0010»\u0002\u001a\u00020\u00158F¢\u0006\b\u001a\u0006\b¼\u0002\u0010Ó\u0001R\u0014\u0010¾\u0002\u001a\u00020\u00158F¢\u0006\b\u001a\u0006\b¾\u0002\u0010Ó\u0001R\u0019\u0010À\u0002\u001a\b\u0012\u0004\u0012\u00020\u001b0>8F¢\u0006\u0007\u001a\u0005\bÁ\u0002\u0010BR\u0019\u0010Ã\u0002\u001a\b\u0012\u0004\u0012\u00020\u001b0>8F¢\u0006\u0007\u001a\u0005\bÄ\u0002\u0010BR\u0013\u0010Æ\u0002\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\bÇ\u0002\u0010\u001dR\u0017\u0010í\u0002\u001a\u0005\u0018\u00010Ê\u00028F¢\u0006\b\u001a\u0006\bî\u0002\u0010ï\u0002R\u0017\u0010ñ\u0002\u001a\u0005\u0018\u00010Ê\u00028F¢\u0006\b\u001a\u0006\bò\u0002\u0010ï\u0002R\u0017\u0010ô\u0002\u001a\u0005\u0018\u00010Ê\u00028F¢\u0006\b\u001a\u0006\bõ\u0002\u0010ï\u0002R\u0017\u0010÷\u0002\u001a\u0005\u0018\u00010Ê\u00028F¢\u0006\b\u001a\u0006\bø\u0002\u0010ï\u0002R\u0014\u0010ÿ\u0002\u001a\u00020\u00158F¢\u0006\b\u001a\u0006\bÿ\u0002\u0010Ó\u0001R\u0015\u0010\u008a\u0003\u001a\u00030\u008b\u00038F¢\u0006\b\u001a\u0006\b\u008c\u0003\u0010\u008d\u0003R\u0014\u0010\u008f\u0003\u001a\u00020\u00158F¢\u0006\b\u001a\u0006\b\u0090\u0003\u0010Ó\u0001R\u0017\u0010\u0092\u0003\u001a\u0005\u0018\u00010\u0093\u00038F¢\u0006\b\u001a\u0006\b\u0094\u0003\u0010\u0095\u0003R\u0015\u0010\u0097\u0003\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0007\u001a\u0005\b\u0098\u0003\u0010\u001dR\u0015\u0010\u009a\u0003\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0007\u001a\u0005\b\u009b\u0003\u0010\u001dR\u0015\u0010\u009d\u0003\u001a\u0004\u0018\u00010Y8F¢\u0006\u0007\u001a\u0005\b\u009e\u0003\u0010\\R\u0013\u0010 \u0003\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b¡\u0003\u0010\u001dR\u0015\u0010£\u0003\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0007\u001a\u0005\b¤\u0003\u0010\u001dR\u0015\u0010¦\u0003\u001a\u0004\u0018\u00010f8F¢\u0006\u0007\u001a\u0005\b§\u0003\u0010nR\u0015\u0010©\u0003\u001a\u0004\u0018\u00010f8F¢\u0006\u0007\u001a\u0005\bª\u0003\u0010nR\u0015\u0010¬\u0003\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0007\u001a\u0005\b\u00ad\u0003\u0010\u001dR\u0015\u0010¯\u0003\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0007\u001a\u0005\b°\u0003\u0010\u001dR\u0015\u0010²\u0003\u001a\u00030³\u00038F¢\u0006\b\u001a\u0006\b´\u0003\u0010µ\u0003R\u0015\u0010·\u0003\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0007\u001a\u0005\b¸\u0003\u0010\u001dR\u0015\u0010º\u0003\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0007\u001a\u0005\b»\u0003\u0010\u001dR\u0015\u0010½\u0003\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0007\u001a\u0005\b¾\u0003\u0010\u001dR\u0015\u0010À\u0003\u001a\u0004\u0018\u00010Y8F¢\u0006\u0007\u001a\u0005\bÁ\u0003\u0010\\R.\u0010Ç\u0003\u001a\u0011\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010È\u0003X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÉ\u0003\u0010Ê\u0003\"\u0006\bË\u0003\u0010Ì\u0003R\u001f\u0010Í\u0003\u001a\u00020\u0019X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÎ\u0003\u0010Ï\u0003\"\u0006\bÐ\u0003\u0010Ñ\u0003¨\u0006â\u0003"}, d2 = {"Lcom/polymarket/data/EEvent$SportsGame;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "getId", "()Ljava/lang/String;", "Swift_id", MetricTracker.Action.CLOSED, "getClosed", "()Ljava/lang/Boolean;", "Swift_closed", "(J)Ljava/lang/Boolean;", "newValue", "Ljava/util/Date;", "createdAt", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "Swift_createdAt", "Swift_createdAt_set", "value", "gameId", "getGameId", "()Ljava/lang/Integer;", "Swift_gameId", "(J)Ljava/lang/Integer;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "setTitle", "(Ljava/lang/String;)V", "Swift_title", "Swift_title_set", "livestreamUrl", "getLivestreamUrl", "setLivestreamUrl", "Swift_livestreamUrl", "Swift_livestreamUrl_set", "", "Lcom/polymarket/data/ESportsTeam;", "teams", "getTeams", "()Ljava/util/List;", "setTeams", "(Ljava/util/List;)V", "Swift_teams", "Swift_teams_set", "seriesSlug", "getSeriesSlug", "Swift_seriesSlug", "slug", "getSlug", "Swift_slug", "sportradarGameId", "getSportradarGameId", "Swift_sportradarGameId", "startDate", "getStartDate", "Swift_startDate", "startTime", "getStartTime", "Swift_startTime", "ticker", "getTicker", "Swift_ticker", "Lcom/polymarket/data/ESportsSlug;", "sportSlug", "getSportSlug", "()Lcom/polymarket/data/ESportsSlug;", "setSportSlug", "(Lcom/polymarket/data/ESportsSlug;)V", "Swift_sportSlug", "Swift_sportSlug_set", "leagueDisplayName", "getLeagueDisplayName", "setLeagueDisplayName", "Swift_leagueDisplayName", "Swift_leagueDisplayName_set", "Lcom/polymarket/data/APIEventTag;", "tags", "getTags", "setTags", "Swift_tags", "Swift_tags_set", "primaryTag", "getPrimaryTag", "()Lcom/polymarket/data/APIEventTag;", "setPrimaryTag", "(Lcom/polymarket/data/APIEventTag;)V", "Swift_primaryTag", "Swift_primaryTag_set", "secondaryTag", "getSecondaryTag", "setSecondaryTag", "Swift_secondaryTag", "Swift_secondaryTag_set", "Lcom/polymarket/data/EEvent$SportsGame$PrimaryMarkets;", "primaryMarkets", "getPrimaryMarkets", "()Lcom/polymarket/data/EEvent$SportsGame$PrimaryMarkets;", "setPrimaryMarkets", "(Lcom/polymarket/data/EEvent$SportsGame$PrimaryMarkets;)V", "Swift_primaryMarkets", "Swift_primaryMarkets_set", "Lcom/polymarket/data/EMarket;", "spreadMarkets", "getSpreadMarkets", "setSpreadMarkets", "Swift_spreadMarkets", "Swift_spreadMarkets_set", "totalMarkets", "getTotalMarkets", "setTotalMarkets", "Swift_totalMarkets", "Swift_totalMarkets_set", "propMarkets", "getPropMarkets", "setPropMarkets", "Swift_propMarkets", "Swift_propMarkets_set", "Lcom/polymarket/data/EEvent$SportsGame$TeamsPair;", "teamsPair", "getTeamsPair", "()Lcom/polymarket/data/EEvent$SportsGame$TeamsPair;", "setTeamsPair", "(Lcom/polymarket/data/EEvent$SportsGame$TeamsPair;)V", "Swift_teamsPair", "Swift_teamsPair_set", "spreadMarket", "getSpreadMarket", "()Lcom/polymarket/data/EMarket;", "Swift_spreadMarket", "totalMarket", "getTotalMarket", "Swift_totalMarket", "livestreamURL", "Ljava/net/URI;", "getLivestreamURL", "()Ljava/net/URI;", "Swift_livestreamURL", "mainSpreadMarket", "getMainSpreadMarket", "Swift_mainSpreadMarket", "mainTotalMarket", "getMainTotalMarket", "Swift_mainTotalMarket", "mainSpreadLine", "", "getMainSpreadLine", "()Ljava/lang/Double;", "Swift_mainSpreadLine", "(J)Ljava/lang/Double;", "mainTotalLine", "getMainTotalLine", "Swift_mainTotalLine", "Lcom/polymarket/data/EEventState;", "eventState", "getEventState", "()Lcom/polymarket/data/EEventState;", "setEventState", "(Lcom/polymarket/data/EEventState;)V", "Swift_eventState", "Swift_eventState_set", "Lcom/polymarket/data/ELatestHighlight;", "latestHighlight", "getLatestHighlight", "()Lcom/polymarket/data/ELatestHighlight;", "setLatestHighlight", "(Lcom/polymarket/data/ELatestHighlight;)V", "Swift_latestHighlight", "Swift_latestHighlight_set", "score", "Lcom/polymarket/data/EEventState$Score;", "getScore", "()Lcom/polymarket/data/EEventState$Score;", "Swift_score", "rawScore", "getRawScore", "Swift_rawScore", "elapsed", "getElapsed", "Swift_elapsed", "period", "getPeriod", "Swift_period", "live", "getLive", "()Z", "Swift_live", "ended", "getEnded", "Swift_ended", "updatedAt", "getUpdatedAt", "Swift_updatedAt", "formattedElapsed", "getFormattedElapsed", "Swift_formattedElapsed", "formattedClockText", "getFormattedClockText", "Swift_formattedClockText", "isSoccerGame", "Swift_isSoccerGame", "formattedStartDate", "getFormattedStartDate", "Swift_formattedStartDate", "startTimeLabel", "Lcom/polymarket/data/EEvent$SportsGame$StartTimeLabel;", "Swift_startTimeLabel_0", "gameStartShortText", "Swift_gameStartShortText_1", "isDrawableOutcome", "Swift_isDrawableOutcome", "hasGameLines", "getHasGameLines", "Swift_hasGameLines", "teamIconURL", "teamId", "colorScheme", "Lcom/polymarket/data/EColorScheme;", "Swift_teamIconURL_2", "formattedAbbreviatedTitle", "getFormattedAbbreviatedTitle", "Swift_formattedAbbreviatedTitle", "teamScores", "Lkotlin/Pair;", "getTeamScores", "()Lkotlin/Pair;", "Swift_teamScores", "teamTurn", "getTeamTurn", "()Lcom/polymarket/data/ESportsTeam;", "Swift_teamTurn", "battingSide", "Lcom/polymarket/data/EEvent$SportsGame$BattingSide;", "getBattingSide", "()Lcom/polymarket/data/EEvent$SportsGame$BattingSide;", "Swift_battingSide", "battingTeam", "getBattingTeam", "Swift_battingTeam", "servingTeam", "getServingTeam", "Swift_servingTeam", "isSoccerShootoutAttempt", "attempt", "Lcom/polymarket/data/EEventState$SoccerState$ShootoutAttempt;", "for_", "Swift_isSoccerShootoutAttempt_3", "team", "soccerShootoutScore", "Swift_soccerShootoutScore_4", "formattedFinalSoccerShootoutScore", "getFormattedFinalSoccerShootoutScore", "Swift_formattedFinalSoccerShootoutScore", "formattedTitle", "getFormattedTitle", "Swift_formattedTitle", "gameState", "Lcom/polymarket/data/EEvent$SportsGame$GameState;", "getGameState", "()Lcom/polymarket/data/EEvent$SportsGame$GameState;", "Swift_gameState", "formattedGameState", "getFormattedGameState", "Swift_formattedGameState", "isUpcoming", "Swift_isUpcoming", "isLive", "Swift_isLive", "isFinished", "Swift_isFinished", "isPostponed", "Swift_isPostponed", "analyticsGamePhase", "getAnalyticsGamePhase", "Swift_analyticsGamePhase", "ufcMetadata", "Lcom/polymarket/data/EEvent$SportsGame$UFCMetadata;", "getUfcMetadata", "()Lcom/polymarket/data/EEvent$SportsGame$UFCMetadata;", "Swift_ufcMetadata", "lastPlay", "getLastPlay", "Swift_lastPlay", "formattedFootballDrive", "getFormattedFootballDrive", "Swift_formattedFootballDrive", "compactFootballDrive", "getCompactFootballDrive", "Swift_compactFootballDrive", "hasDriveTrackerCapability", "getHasDriveTrackerCapability", "Swift_hasDriveTrackerCapability", "isCompetitive", "Swift_isCompetitive", "primaryMarketSlugs", "getPrimaryMarketSlugs", "Swift_primaryMarketSlugs", "marketSlugs", "getMarketSlugs", "Swift_marketSlugs", "webSocketEventSlug", "getWebSocketEventSlug", "Swift_webSocketEventSlug", "marketSide", "Lcom/polymarket/data/EMarket$MarketSide;", "Swift_marketSide_5", "cache", "Lcom/polymarket/data/EMarketCache;", "Swift_cache_6", "marketId", "primaryMarketSide", "Swift_primaryMarketSide_7", "primaryMarket", "Swift_primaryMarket_8", "primaryMarketSideLenient", "ordinalFallback", "Swift_primaryMarketSideLenient_9", "primaryMarketSidePrice", "(Lcom/polymarket/data/ESportsTeam;)Ljava/lang/Double;", "Swift_primaryMarketSidePrice_10", "(JLcom/polymarket/data/ESportsTeam;)Ljava/lang/Double;", "primaryMarketSidePriceLenient", "(Lcom/polymarket/data/ESportsTeam;I)Ljava/lang/Double;", "Swift_primaryMarketSidePriceLenient_11", "(JLcom/polymarket/data/ESportsTeam;I)Ljava/lang/Double;", "moneylineMarketSideFor", "index", "Swift_moneylineMarketSideFor_12", "spreadMarketSide", "Swift_spreadMarketSide_13", "mainSpreadMarketSide", "Swift_mainSpreadMarketSide_14", "spreadLine", "Swift_spreadLine_15", "Swift_mainSpreadLine_16", "spreadPrice", "Swift_spreadPrice_17", "mainSpreadPrice", "Swift_mainSpreadPrice_18", "totalOverSide", "getTotalOverSide", "()Lcom/polymarket/data/EMarket$MarketSide;", "Swift_totalOverSide", "mainTotalOverSide", "getMainTotalOverSide", "Swift_mainTotalOverSide", "totalUnderSide", "getTotalUnderSide", "Swift_totalUnderSide", "mainTotalUnderSide", "getMainTotalUnderSide", "Swift_mainTotalUnderSide", "totalPrice", "isOver", "(Z)Ljava/lang/Double;", "Swift_totalPrice_19", "(JZ)Ljava/lang/Double;", "isDraw", "Swift_isDraw", "mainTotalPrice", "Swift_mainTotalPrice_20", "isLoser", "Swift_isLoser_21", "(Lcom/polymarket/data/ESportsTeam;)Ljava/lang/Integer;", "Swift_score_22", "(JLcom/polymarket/data/ESportsTeam;)Ljava/lang/Integer;", "formattedScoreDisplay", "Swift_formattedScoreDisplay_23", "layoutType", "Lcom/polymarket/data/EEvent$SportsGame$LayoutType;", "getLayoutType", "()Lcom/polymarket/data/EEvent$SportsGame$LayoutType;", "Swift_layoutType", "usesVerticalLayout", "getUsesVerticalLayout", "Swift_usesVerticalLayout", "tennisMetadata", "Lcom/polymarket/data/EEventState$TennisState;", "getTennisMetadata", "()Lcom/polymarket/data/EEventState$TennisState;", "Swift_tennisMetadata", "tennisContextLabel", "getTennisContextLabel", "Swift_tennisContextLabel", "resolvedLeagueName", "getResolvedLeagueName", "Swift_resolvedLeagueName", "resolvedSportSlug", "getResolvedSportSlug", "Swift_resolvedSportSlug", "scoreboardStatusText", "getScoreboardStatusText", "Swift_scoreboardStatusText", "scoreboardLeagueName", "getScoreboardLeagueName", "Swift_scoreboardLeagueName", "sportTag", "getSportTag", "Swift_sportTag", "preferredCategoryTag", "getPreferredCategoryTag", "Swift_preferredCategoryTag", "categoryName", "getCategoryName", "Swift_categoryName", "scoreboardTitle", "getScoreboardTitle", "Swift_scoreboardTitle", "titleBlockPresentation", "Lcom/polymarket/data/EEvent$SportsGame$TitleBlockPresentation;", "getTitleBlockPresentation", "()Lcom/polymarket/data/EEvent$SportsGame$TitleBlockPresentation;", "Swift_titleBlockPresentation", "liveActivityContextLabel", "getLiveActivityContextLabel", "Swift_liveActivityContextLabel", "scoreboardGlyphAssetName", "getScoreboardGlyphAssetName", "Swift_scoreboardGlyphAssetName", "scoreboardGlyphDisplayName", "getScoreboardGlyphDisplayName", "Swift_scoreboardGlyphDisplayName", "scoreboardGlyphSportSlug", "getScoreboardGlyphSportSlug", "Swift_scoreboardGlyphSportSlug", "scoreboardScoreText", "isPrimary", "Swift_scoreboardScoreText_24", "Swift_constructor_25", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "StartTimeLabel", "BattingSide", "TeamsPair", "PrimaryMarkets", "GameState", "UFCMetadata", "LayoutType", "TitleBlockPresentation", "MockLayout", "MockState", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SportsGame implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/data/EEvent$SportsGame$LayoutType;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", BuildConfig.FLAVOR, "ufc", "tennis", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class LayoutType implements SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ LayoutType[] $VALUES;
            public static final LayoutType standard = new LayoutType(BuildConfig.FLAVOR, 0);
            public static final LayoutType ufc = new LayoutType("ufc", 1);
            public static final LayoutType tennis = new LayoutType("tennis", 2);

            private static final /* synthetic */ LayoutType[] $values() {
                return new LayoutType[]{standard, ufc, tennis};
            }

            static {
                LayoutType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = ww4.b($values);
                INSTANCE = new Companion(null);
            }

            private LayoutType(String str, int i) {
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static ug7 getEntries() {
                return $ENTRIES;
            }

            public static LayoutType valueOf(String str) {
                return (LayoutType) Enum.valueOf(LayoutType.class, str);
            }

            public static LayoutType[] values() {
                return (LayoutType[]) $VALUES.clone();
            }

            @Override // skip.lib.SwiftProjecting
            public Function0<Object> Swift_projection(int options) {
                return Swift_projectionImpl(options);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0018"}, d2 = {"Lcom/polymarket/data/EEvent$SportsGame$MockLayout;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "ufc", BuildConfig.FLAVOR, "drawable", "nba", "nhl", "mlb", "epl", "cbb", "atp", "futures", "tennis", "cricket", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class MockLayout implements SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ MockLayout[] $VALUES;
            public static final MockLayout ufc = new MockLayout("ufc", 0);
            public static final MockLayout standard = new MockLayout(BuildConfig.FLAVOR, 1);
            public static final MockLayout drawable = new MockLayout("drawable", 2);
            public static final MockLayout nba = new MockLayout("nba", 3);
            public static final MockLayout nhl = new MockLayout("nhl", 4);
            public static final MockLayout mlb = new MockLayout("mlb", 5);
            public static final MockLayout epl = new MockLayout("epl", 6);
            public static final MockLayout cbb = new MockLayout("cbb", 7);
            public static final MockLayout atp = new MockLayout("atp", 8);
            public static final MockLayout futures = new MockLayout("futures", 9);
            public static final MockLayout tennis = new MockLayout("tennis", 10);
            public static final MockLayout cricket = new MockLayout("cricket", 11);

            private static final /* synthetic */ MockLayout[] $values() {
                return new MockLayout[]{ufc, standard, drawable, nba, nhl, mlb, epl, cbb, atp, futures, tennis, cricket};
            }

            static {
                MockLayout[] $values = $values();
                $VALUES = $values;
                $ENTRIES = ww4.b($values);
                INSTANCE = new Companion(null);
            }

            private MockLayout(String str, int i) {
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static ug7 getEntries() {
                return $ENTRIES;
            }

            public static MockLayout valueOf(String str) {
                return (MockLayout) Enum.valueOf(MockLayout.class, str);
            }

            public static MockLayout[] values() {
                return (MockLayout[]) $VALUES.clone();
            }

            @Override // skip.lib.SwiftProjecting
            public Function0<Object> Swift_projection(int options) {
                return Swift_projectionImpl(options);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0011"}, d2 = {"Lcom/polymarket/data/EEvent$SportsGame$MockState;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "upcoming", "startingSoon", "live", "finished", "postponed", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class MockState implements SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ MockState[] $VALUES;
            public static final MockState upcoming = new MockState("upcoming", 0);
            public static final MockState startingSoon = new MockState("startingSoon", 1);
            public static final MockState live = new MockState("live", 2);
            public static final MockState finished = new MockState("finished", 3);
            public static final MockState postponed = new MockState("postponed", 4);

            private static final /* synthetic */ MockState[] $values() {
                return new MockState[]{upcoming, startingSoon, live, finished, postponed};
            }

            static {
                MockState[] $values = $values();
                $VALUES = $values;
                $ENTRIES = ww4.b($values);
                INSTANCE = new Companion(null);
            }

            private MockState(String str, int i) {
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static ug7 getEntries() {
                return $ENTRIES;
            }

            public static MockState valueOf(String str) {
                return (MockState) Enum.valueOf(MockState.class, str);
            }

            public static MockState[] values() {
                return (MockState[]) $VALUES.clone();
            }

            @Override // skip.lib.SwiftProjecting
            public Function0<Object> Swift_projection(int options) {
                return Swift_projectionImpl(options);
            }
        }

        private SportsGame(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_25(mutableStruct);
        }

        private final native String Swift_analyticsGamePhase(long Swift_peer);

        private final native BattingSide Swift_battingSide(long Swift_peer);

        private final native ESportsTeam Swift_battingTeam(long Swift_peer);

        private final native EMarketCache Swift_cache_6(long Swift_peer, String marketId);

        private final native String Swift_categoryName(long Swift_peer);

        private final native Boolean Swift_closed(long Swift_peer);

        private final native String Swift_compactFootballDrive(long Swift_peer);

        private final native long Swift_constructor_25(MutableStruct copy);

        private final native Date Swift_createdAt(long Swift_peer);

        private final native void Swift_createdAt_set(long Swift_peer, Date value);

        private final native String Swift_elapsed(long Swift_peer);

        private final native boolean Swift_ended(long Swift_peer);

        private final native EEventState Swift_eventState(long Swift_peer);

        private final native void Swift_eventState_set(long Swift_peer, EEventState value);

        private final native String Swift_formattedAbbreviatedTitle(long Swift_peer);

        private final native String Swift_formattedClockText(long Swift_peer);

        private final native String Swift_formattedElapsed(long Swift_peer);

        private final native String Swift_formattedFinalSoccerShootoutScore(long Swift_peer);

        private final native String Swift_formattedFootballDrive(long Swift_peer);

        private final native String Swift_formattedGameState(long Swift_peer);

        private final native String Swift_formattedScoreDisplay_23(long Swift_peer, ESportsTeam team);

        private final native String Swift_formattedStartDate(long Swift_peer);

        private final native String Swift_formattedTitle(long Swift_peer);

        private final native Integer Swift_gameId(long Swift_peer);

        private final native String Swift_gameStartShortText_1(long Swift_peer);

        private final native GameState Swift_gameState(long Swift_peer);

        private final native boolean Swift_hasDriveTrackerCapability(long Swift_peer);

        private final native boolean Swift_hasGameLines(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isCompetitive(long Swift_peer);

        private final native boolean Swift_isDraw(long Swift_peer);

        private final native boolean Swift_isDrawableOutcome(long Swift_peer);

        private final native boolean Swift_isFinished(long Swift_peer);

        private final native boolean Swift_isLive(long Swift_peer);

        private final native boolean Swift_isLoser_21(long Swift_peer, ESportsTeam team);

        private final native boolean Swift_isPostponed(long Swift_peer);

        private final native boolean Swift_isSoccerGame(long Swift_peer);

        private final native boolean Swift_isSoccerShootoutAttempt_3(long Swift_peer, EEventState.SoccerState.ShootoutAttempt attempt, ESportsTeam team);

        private final native boolean Swift_isUpcoming(long Swift_peer);

        private final native String Swift_lastPlay(long Swift_peer);

        private final native ELatestHighlight Swift_latestHighlight(long Swift_peer);

        private final native void Swift_latestHighlight_set(long Swift_peer, ELatestHighlight value);

        private final native LayoutType Swift_layoutType(long Swift_peer);

        private final native String Swift_leagueDisplayName(long Swift_peer);

        private final native void Swift_leagueDisplayName_set(long Swift_peer, String value);

        private final native boolean Swift_live(long Swift_peer);

        private final native String Swift_liveActivityContextLabel(long Swift_peer);

        private final native URI Swift_livestreamURL(long Swift_peer);

        private final native String Swift_livestreamUrl(long Swift_peer);

        private final native void Swift_livestreamUrl_set(long Swift_peer, String value);

        private final native Double Swift_mainSpreadLine(long Swift_peer);

        private final native String Swift_mainSpreadLine_16(long Swift_peer, ESportsTeam team);

        private final native EMarket Swift_mainSpreadMarket(long Swift_peer);

        private final native EMarket.MarketSide Swift_mainSpreadMarketSide_14(long Swift_peer, ESportsTeam team);

        private final native Double Swift_mainSpreadPrice_18(long Swift_peer, ESportsTeam team);

        private final native Double Swift_mainTotalLine(long Swift_peer);

        private final native EMarket Swift_mainTotalMarket(long Swift_peer);

        private final native EMarket.MarketSide Swift_mainTotalOverSide(long Swift_peer);

        private final native Double Swift_mainTotalPrice_20(long Swift_peer, boolean isOver);

        private final native EMarket.MarketSide Swift_mainTotalUnderSide(long Swift_peer);

        private final native EMarket.MarketSide Swift_marketSide_5(long Swift_peer, String id);

        private final native List<String> Swift_marketSlugs(long Swift_peer);

        private final native EMarket.MarketSide Swift_moneylineMarketSideFor_12(long Swift_peer, int index);

        private final native String Swift_period(long Swift_peer);

        private final native APIEventTag Swift_preferredCategoryTag(long Swift_peer);

        private final native EMarket.MarketSide Swift_primaryMarketSideLenient_9(long Swift_peer, ESportsTeam team, int ordinalFallback);

        private final native Double Swift_primaryMarketSidePriceLenient_11(long Swift_peer, ESportsTeam team, int ordinalFallback);

        private final native Double Swift_primaryMarketSidePrice_10(long Swift_peer, ESportsTeam team);

        private final native EMarket.MarketSide Swift_primaryMarketSide_7(long Swift_peer, ESportsTeam team);

        private final native List<String> Swift_primaryMarketSlugs(long Swift_peer);

        private final native EMarket Swift_primaryMarket_8(long Swift_peer, ESportsTeam team);

        private final native PrimaryMarkets Swift_primaryMarkets(long Swift_peer);

        private final native void Swift_primaryMarkets_set(long Swift_peer, PrimaryMarkets value);

        private final native APIEventTag Swift_primaryTag(long Swift_peer);

        private final native void Swift_primaryTag_set(long Swift_peer, APIEventTag value);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native List<EMarket> Swift_propMarkets(long Swift_peer);

        private final native void Swift_propMarkets_set(long Swift_peer, List<EMarket> value);

        private final native String Swift_rawScore(long Swift_peer);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_resolvedLeagueName(long Swift_peer);

        private final native ESportsSlug Swift_resolvedSportSlug(long Swift_peer);

        private final native EEventState.Score Swift_score(long Swift_peer);

        private final native Integer Swift_score_22(long Swift_peer, ESportsTeam team);

        private final native String Swift_scoreboardGlyphAssetName(long Swift_peer);

        private final native String Swift_scoreboardGlyphDisplayName(long Swift_peer);

        private final native ESportsSlug Swift_scoreboardGlyphSportSlug(long Swift_peer);

        private final native String Swift_scoreboardLeagueName(long Swift_peer);

        private final native String Swift_scoreboardScoreText_24(long Swift_peer, ESportsTeam team, boolean isPrimary);

        private final native String Swift_scoreboardStatusText(long Swift_peer);

        private final native String Swift_scoreboardTitle(long Swift_peer);

        private final native APIEventTag Swift_secondaryTag(long Swift_peer);

        private final native void Swift_secondaryTag_set(long Swift_peer, APIEventTag value);

        private final native String Swift_seriesSlug(long Swift_peer);

        private final native ESportsTeam Swift_servingTeam(long Swift_peer);

        private final native String Swift_slug(long Swift_peer);

        private final native int Swift_soccerShootoutScore_4(long Swift_peer, ESportsTeam team);

        private final native ESportsSlug Swift_sportSlug(long Swift_peer);

        private final native void Swift_sportSlug_set(long Swift_peer, ESportsSlug value);

        private final native APIEventTag Swift_sportTag(long Swift_peer);

        private final native String Swift_sportradarGameId(long Swift_peer);

        private final native String Swift_spreadLine_15(long Swift_peer, ESportsTeam team);

        private final native EMarket Swift_spreadMarket(long Swift_peer);

        private final native EMarket.MarketSide Swift_spreadMarketSide_13(long Swift_peer, ESportsTeam team);

        private final native List<EMarket> Swift_spreadMarkets(long Swift_peer);

        private final native void Swift_spreadMarkets_set(long Swift_peer, List<EMarket> value);

        private final native Double Swift_spreadPrice_17(long Swift_peer, ESportsTeam team);

        private final native Date Swift_startDate(long Swift_peer);

        private final native Date Swift_startTime(long Swift_peer);

        private final native StartTimeLabel Swift_startTimeLabel_0(long Swift_peer);

        private final native List<APIEventTag> Swift_tags(long Swift_peer);

        private final native void Swift_tags_set(long Swift_peer, List<APIEventTag> value);

        private final native URI Swift_teamIconURL_2(long Swift_peer, String teamId, EColorScheme colorScheme);

        private final native Pair<Integer, Integer> Swift_teamScores(long Swift_peer);

        private final native ESportsTeam Swift_teamTurn(long Swift_peer);

        private final native List<ESportsTeam> Swift_teams(long Swift_peer);

        private final native TeamsPair Swift_teamsPair(long Swift_peer);

        private final native void Swift_teamsPair_set(long Swift_peer, TeamsPair value);

        private final native void Swift_teams_set(long Swift_peer, List<ESportsTeam> value);

        private final native String Swift_tennisContextLabel(long Swift_peer);

        private final native EEventState.TennisState Swift_tennisMetadata(long Swift_peer);

        private final native String Swift_ticker(long Swift_peer);

        private final native String Swift_title(long Swift_peer);

        private final native TitleBlockPresentation Swift_titleBlockPresentation(long Swift_peer);

        private final native void Swift_title_set(long Swift_peer, String value);

        private final native EMarket Swift_totalMarket(long Swift_peer);

        private final native List<EMarket> Swift_totalMarkets(long Swift_peer);

        private final native void Swift_totalMarkets_set(long Swift_peer, List<EMarket> value);

        private final native EMarket.MarketSide Swift_totalOverSide(long Swift_peer);

        private final native Double Swift_totalPrice_19(long Swift_peer, boolean isOver);

        private final native EMarket.MarketSide Swift_totalUnderSide(long Swift_peer);

        private final native UFCMetadata Swift_ufcMetadata(long Swift_peer);

        private final native Date Swift_updatedAt(long Swift_peer);

        private final native boolean Swift_usesVerticalLayout(long Swift_peer);

        private final native String Swift_webSocketEventSlug(long Swift_peer);

        @Override // skip.bridge.SwiftPeerBridged
        /* renamed from: Swift_peer, reason: from getter */
        public long getSwift_peer() {
            return this.Swift_peer;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final EMarketCache cache(String for_) {
            for_.getClass();
            return Swift_cache_6(this.Swift_peer, for_);
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

        public final String formattedScoreDisplay(ESportsTeam for_) {
            for_.getClass();
            return Swift_formattedScoreDisplay_23(this.Swift_peer, for_);
        }

        public final String gameStartShortText() {
            return Swift_gameStartShortText_1(this.Swift_peer);
        }

        public final String getAnalyticsGamePhase() {
            return Swift_analyticsGamePhase(this.Swift_peer);
        }

        public final BattingSide getBattingSide() {
            return Swift_battingSide(this.Swift_peer);
        }

        public final ESportsTeam getBattingTeam() {
            return Swift_battingTeam(this.Swift_peer);
        }

        public final String getCategoryName() {
            return Swift_categoryName(this.Swift_peer);
        }

        public final Boolean getClosed() {
            return Swift_closed(this.Swift_peer);
        }

        public final String getCompactFootballDrive() {
            return Swift_compactFootballDrive(this.Swift_peer);
        }

        public final Date getCreatedAt() {
            return Swift_createdAt(this.Swift_peer);
        }

        public final String getElapsed() {
            return Swift_elapsed(this.Swift_peer);
        }

        public final boolean getEnded() {
            return Swift_ended(this.Swift_peer);
        }

        public final EEventState getEventState() {
            return Swift_eventState(this.Swift_peer);
        }

        public final String getFormattedAbbreviatedTitle() {
            return Swift_formattedAbbreviatedTitle(this.Swift_peer);
        }

        public final String getFormattedClockText() {
            return Swift_formattedClockText(this.Swift_peer);
        }

        public final String getFormattedElapsed() {
            return Swift_formattedElapsed(this.Swift_peer);
        }

        public final String getFormattedFinalSoccerShootoutScore() {
            return Swift_formattedFinalSoccerShootoutScore(this.Swift_peer);
        }

        public final String getFormattedFootballDrive() {
            return Swift_formattedFootballDrive(this.Swift_peer);
        }

        public final String getFormattedGameState() {
            return Swift_formattedGameState(this.Swift_peer);
        }

        public final String getFormattedStartDate() {
            return Swift_formattedStartDate(this.Swift_peer);
        }

        public final String getFormattedTitle() {
            return Swift_formattedTitle(this.Swift_peer);
        }

        public final Integer getGameId() {
            return Swift_gameId(this.Swift_peer);
        }

        public final GameState getGameState() {
            return Swift_gameState(this.Swift_peer);
        }

        public final boolean getHasDriveTrackerCapability() {
            return Swift_hasDriveTrackerCapability(this.Swift_peer);
        }

        public final boolean getHasGameLines() {
            return Swift_hasGameLines(this.Swift_peer);
        }

        public final String getId() {
            return Swift_id(this.Swift_peer);
        }

        public final String getLastPlay() {
            return Swift_lastPlay(this.Swift_peer);
        }

        public final ELatestHighlight getLatestHighlight() {
            return Swift_latestHighlight(this.Swift_peer);
        }

        public final LayoutType getLayoutType() {
            return Swift_layoutType(this.Swift_peer);
        }

        public final String getLeagueDisplayName() {
            return Swift_leagueDisplayName(this.Swift_peer);
        }

        public final boolean getLive() {
            return Swift_live(this.Swift_peer);
        }

        public final String getLiveActivityContextLabel() {
            return Swift_liveActivityContextLabel(this.Swift_peer);
        }

        public final URI getLivestreamURL() {
            return Swift_livestreamURL(this.Swift_peer);
        }

        public final String getLivestreamUrl() {
            return Swift_livestreamUrl(this.Swift_peer);
        }

        public final Double getMainSpreadLine() {
            return Swift_mainSpreadLine(this.Swift_peer);
        }

        public final EMarket getMainSpreadMarket() {
            return Swift_mainSpreadMarket(this.Swift_peer);
        }

        public final Double getMainTotalLine() {
            return Swift_mainTotalLine(this.Swift_peer);
        }

        public final EMarket getMainTotalMarket() {
            return Swift_mainTotalMarket(this.Swift_peer);
        }

        public final EMarket.MarketSide getMainTotalOverSide() {
            return Swift_mainTotalOverSide(this.Swift_peer);
        }

        public final EMarket.MarketSide getMainTotalUnderSide() {
            return Swift_mainTotalUnderSide(this.Swift_peer);
        }

        public final List<String> getMarketSlugs() {
            return Swift_marketSlugs(this.Swift_peer);
        }

        public final String getPeriod() {
            return Swift_period(this.Swift_peer);
        }

        public final APIEventTag getPreferredCategoryTag() {
            return Swift_preferredCategoryTag(this.Swift_peer);
        }

        public final List<String> getPrimaryMarketSlugs() {
            return Swift_primaryMarketSlugs(this.Swift_peer);
        }

        public final PrimaryMarkets getPrimaryMarkets() {
            return Swift_primaryMarkets(this.Swift_peer);
        }

        public final APIEventTag getPrimaryTag() {
            return Swift_primaryTag(this.Swift_peer);
        }

        public final List<EMarket> getPropMarkets() {
            return Swift_propMarkets(this.Swift_peer);
        }

        public final String getRawScore() {
            return Swift_rawScore(this.Swift_peer);
        }

        public final String getResolvedLeagueName() {
            return Swift_resolvedLeagueName(this.Swift_peer);
        }

        public final ESportsSlug getResolvedSportSlug() {
            return Swift_resolvedSportSlug(this.Swift_peer);
        }

        public final EEventState.Score getScore() {
            return Swift_score(this.Swift_peer);
        }

        public final String getScoreboardGlyphAssetName() {
            return Swift_scoreboardGlyphAssetName(this.Swift_peer);
        }

        public final String getScoreboardGlyphDisplayName() {
            return Swift_scoreboardGlyphDisplayName(this.Swift_peer);
        }

        public final ESportsSlug getScoreboardGlyphSportSlug() {
            return Swift_scoreboardGlyphSportSlug(this.Swift_peer);
        }

        public final String getScoreboardLeagueName() {
            return Swift_scoreboardLeagueName(this.Swift_peer);
        }

        public final String getScoreboardStatusText() {
            return Swift_scoreboardStatusText(this.Swift_peer);
        }

        public final String getScoreboardTitle() {
            return Swift_scoreboardTitle(this.Swift_peer);
        }

        public final APIEventTag getSecondaryTag() {
            return Swift_secondaryTag(this.Swift_peer);
        }

        public final String getSeriesSlug() {
            return Swift_seriesSlug(this.Swift_peer);
        }

        public final ESportsTeam getServingTeam() {
            return Swift_servingTeam(this.Swift_peer);
        }

        public final String getSlug() {
            return Swift_slug(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public int getSmutatingcount() {
            return this.smutatingcount;
        }

        public final ESportsSlug getSportSlug() {
            return Swift_sportSlug(this.Swift_peer);
        }

        public final APIEventTag getSportTag() {
            return Swift_sportTag(this.Swift_peer);
        }

        public final String getSportradarGameId() {
            return Swift_sportradarGameId(this.Swift_peer);
        }

        public final EMarket getSpreadMarket() {
            return Swift_spreadMarket(this.Swift_peer);
        }

        public final List<EMarket> getSpreadMarkets() {
            return Swift_spreadMarkets(this.Swift_peer);
        }

        public final Date getStartDate() {
            return Swift_startDate(this.Swift_peer);
        }

        public final Date getStartTime() {
            return Swift_startTime(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public Function1<Object, Unit> getSupdate() {
            return this.supdate;
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final List<APIEventTag> getTags() {
            return Swift_tags(this.Swift_peer);
        }

        public final Pair<Integer, Integer> getTeamScores() {
            return Swift_teamScores(this.Swift_peer);
        }

        public final ESportsTeam getTeamTurn() {
            return Swift_teamTurn(this.Swift_peer);
        }

        public final List<ESportsTeam> getTeams() {
            return Swift_teams(this.Swift_peer);
        }

        public final TeamsPair getTeamsPair() {
            return Swift_teamsPair(this.Swift_peer);
        }

        public final String getTennisContextLabel() {
            return Swift_tennisContextLabel(this.Swift_peer);
        }

        public final EEventState.TennisState getTennisMetadata() {
            return Swift_tennisMetadata(this.Swift_peer);
        }

        public final String getTicker() {
            return Swift_ticker(this.Swift_peer);
        }

        public final String getTitle() {
            return Swift_title(this.Swift_peer);
        }

        public final TitleBlockPresentation getTitleBlockPresentation() {
            return Swift_titleBlockPresentation(this.Swift_peer);
        }

        public final EMarket getTotalMarket() {
            return Swift_totalMarket(this.Swift_peer);
        }

        public final List<EMarket> getTotalMarkets() {
            return Swift_totalMarkets(this.Swift_peer);
        }

        public final EMarket.MarketSide getTotalOverSide() {
            return Swift_totalOverSide(this.Swift_peer);
        }

        public final EMarket.MarketSide getTotalUnderSide() {
            return Swift_totalUnderSide(this.Swift_peer);
        }

        public final UFCMetadata getUfcMetadata() {
            return Swift_ufcMetadata(this.Swift_peer);
        }

        public final Date getUpdatedAt() {
            return Swift_updatedAt(this.Swift_peer);
        }

        public final boolean getUsesVerticalLayout() {
            return Swift_usesVerticalLayout(this.Swift_peer);
        }

        public final String getWebSocketEventSlug() {
            return Swift_webSocketEventSlug(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final boolean isCompetitive() {
            return Swift_isCompetitive(this.Swift_peer);
        }

        public final boolean isDraw() {
            return Swift_isDraw(this.Swift_peer);
        }

        public final boolean isDrawableOutcome() {
            return Swift_isDrawableOutcome(this.Swift_peer);
        }

        public final boolean isFinished() {
            return Swift_isFinished(this.Swift_peer);
        }

        public final boolean isLive() {
            return Swift_isLive(this.Swift_peer);
        }

        public final boolean isLoser(ESportsTeam team) {
            team.getClass();
            return Swift_isLoser_21(this.Swift_peer, team);
        }

        public final boolean isPostponed() {
            return Swift_isPostponed(this.Swift_peer);
        }

        public final boolean isSoccerGame() {
            return Swift_isSoccerGame(this.Swift_peer);
        }

        public final boolean isSoccerShootoutAttempt(EEventState.SoccerState.ShootoutAttempt attempt, ESportsTeam for_) {
            attempt.getClass();
            return Swift_isSoccerShootoutAttempt_3(this.Swift_peer, attempt, for_);
        }

        public final boolean isUpcoming() {
            return Swift_isUpcoming(this.Swift_peer);
        }

        public final String mainSpreadLine(ESportsTeam for_) {
            for_.getClass();
            return Swift_mainSpreadLine_16(this.Swift_peer, for_);
        }

        public final EMarket.MarketSide mainSpreadMarketSide(ESportsTeam for_) {
            for_.getClass();
            return Swift_mainSpreadMarketSide_14(this.Swift_peer, for_);
        }

        public final Double mainSpreadPrice(ESportsTeam for_) {
            for_.getClass();
            return Swift_mainSpreadPrice_18(this.Swift_peer, for_);
        }

        public final Double mainTotalPrice(boolean isOver) {
            return Swift_mainTotalPrice_20(this.Swift_peer, isOver);
        }

        public final EMarket.MarketSide marketSide(String for_) {
            for_.getClass();
            return Swift_marketSide_5(this.Swift_peer, for_);
        }

        public final EMarket.MarketSide moneylineMarketSideFor(int index) {
            return Swift_moneylineMarketSideFor_12(this.Swift_peer, index);
        }

        public final EMarket primaryMarket(ESportsTeam for_) {
            for_.getClass();
            return Swift_primaryMarket_8(this.Swift_peer, for_);
        }

        public final EMarket.MarketSide primaryMarketSide(ESportsTeam for_) {
            for_.getClass();
            return Swift_primaryMarketSide_7(this.Swift_peer, for_);
        }

        public final EMarket.MarketSide primaryMarketSideLenient(ESportsTeam for_, int ordinalFallback) {
            for_.getClass();
            return Swift_primaryMarketSideLenient_9(this.Swift_peer, for_, ordinalFallback);
        }

        public final Double primaryMarketSidePrice(ESportsTeam for_) {
            for_.getClass();
            return Swift_primaryMarketSidePrice_10(this.Swift_peer, for_);
        }

        public final Double primaryMarketSidePriceLenient(ESportsTeam for_, int ordinalFallback) {
            for_.getClass();
            return Swift_primaryMarketSidePriceLenient_11(this.Swift_peer, for_, ordinalFallback);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new SportsGame(this);
        }

        public final Integer score(ESportsTeam for_) {
            for_.getClass();
            return Swift_score_22(this.Swift_peer, for_);
        }

        public final String scoreboardScoreText(ESportsTeam for_, boolean isPrimary) {
            for_.getClass();
            return Swift_scoreboardScoreText_24(this.Swift_peer, for_, isPrimary);
        }

        public final void setCreatedAt(Date date) {
            Date date2 = (Date) StructKt.sref$default(date, null, 1, null);
            willmutate();
            try {
                Swift_createdAt_set(this.Swift_peer, date2);
            } finally {
                didmutate();
            }
        }

        public final void setEventState(EEventState eEventState) {
            EEventState eEventState2 = (EEventState) StructKt.sref$default(eEventState, null, 1, null);
            willmutate();
            try {
                Swift_eventState_set(this.Swift_peer, eEventState2);
            } finally {
                didmutate();
            }
        }

        public final void setLatestHighlight(ELatestHighlight eLatestHighlight) {
            willmutate();
            try {
                Swift_latestHighlight_set(this.Swift_peer, eLatestHighlight);
            } finally {
                didmutate();
            }
        }

        public final void setLeagueDisplayName(String str) {
            willmutate();
            try {
                Swift_leagueDisplayName_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setLivestreamUrl(String str) {
            willmutate();
            try {
                Swift_livestreamUrl_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setPrimaryMarkets(PrimaryMarkets primaryMarkets) {
            primaryMarkets.getClass();
            willmutate();
            try {
                Swift_primaryMarkets_set(this.Swift_peer, primaryMarkets);
            } finally {
                didmutate();
            }
        }

        public final void setPrimaryTag(APIEventTag aPIEventTag) {
            APIEventTag aPIEventTag2 = (APIEventTag) StructKt.sref$default(aPIEventTag, null, 1, null);
            willmutate();
            try {
                Swift_primaryTag_set(this.Swift_peer, aPIEventTag2);
            } finally {
                didmutate();
            }
        }

        public final void setPropMarkets(List<EMarket> list) {
            list.getClass();
            List<EMarket> list2 = (List) StructKt.sref$default(list, null, 1, null);
            willmutate();
            try {
                Swift_propMarkets_set(this.Swift_peer, list2);
            } finally {
                didmutate();
            }
        }

        public final void setSecondaryTag(APIEventTag aPIEventTag) {
            APIEventTag aPIEventTag2 = (APIEventTag) StructKt.sref$default(aPIEventTag, null, 1, null);
            willmutate();
            try {
                Swift_secondaryTag_set(this.Swift_peer, aPIEventTag2);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void setSmutatingcount(int i) {
            this.smutatingcount = i;
        }

        public final void setSportSlug(ESportsSlug eSportsSlug) {
            willmutate();
            try {
                Swift_sportSlug_set(this.Swift_peer, eSportsSlug);
            } finally {
                didmutate();
            }
        }

        public final void setSpreadMarkets(List<EMarket> list) {
            list.getClass();
            List<EMarket> list2 = (List) StructKt.sref$default(list, null, 1, null);
            willmutate();
            try {
                Swift_spreadMarkets_set(this.Swift_peer, list2);
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

        public final void setTags(List<APIEventTag> list) {
            List<APIEventTag> list2 = (List) StructKt.sref$default(list, null, 1, null);
            willmutate();
            try {
                Swift_tags_set(this.Swift_peer, list2);
            } finally {
                didmutate();
            }
        }

        public final void setTeams(List<ESportsTeam> list) {
            List<ESportsTeam> list2 = (List) StructKt.sref$default(list, null, 1, null);
            willmutate();
            try {
                Swift_teams_set(this.Swift_peer, list2);
            } finally {
                didmutate();
            }
        }

        public final void setTeamsPair(TeamsPair teamsPair) {
            teamsPair.getClass();
            TeamsPair teamsPair2 = (TeamsPair) StructKt.sref$default(teamsPair, null, 1, null);
            willmutate();
            try {
                Swift_teamsPair_set(this.Swift_peer, teamsPair2);
            } finally {
                didmutate();
            }
        }

        public final void setTitle(String str) {
            willmutate();
            try {
                Swift_title_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setTotalMarkets(List<EMarket> list) {
            list.getClass();
            List<EMarket> list2 = (List) StructKt.sref$default(list, null, 1, null);
            willmutate();
            try {
                Swift_totalMarkets_set(this.Swift_peer, list2);
            } finally {
                didmutate();
            }
        }

        public final int soccerShootoutScore(ESportsTeam for_) {
            return Swift_soccerShootoutScore_4(this.Swift_peer, for_);
        }

        public final String spreadLine(ESportsTeam for_) {
            for_.getClass();
            return Swift_spreadLine_15(this.Swift_peer, for_);
        }

        public final EMarket.MarketSide spreadMarketSide(ESportsTeam for_) {
            for_.getClass();
            return Swift_spreadMarketSide_13(this.Swift_peer, for_);
        }

        public final Double spreadPrice(ESportsTeam for_) {
            for_.getClass();
            return Swift_spreadPrice_17(this.Swift_peer, for_);
        }

        public final StartTimeLabel startTimeLabel() {
            return Swift_startTimeLabel_0(this.Swift_peer);
        }

        public final URI teamIconURL(String teamId, EColorScheme colorScheme) {
            teamId.getClass();
            colorScheme.getClass();
            return Swift_teamIconURL_2(this.Swift_peer, teamId, colorScheme);
        }

        public final Double totalPrice(boolean isOver) {
            return Swift_totalPrice_19(this.Swift_peer, isOver);
        }

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0014B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0015"}, d2 = {"Lcom/polymarket/data/EEvent$SportsGame$BattingSide;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "long", "short", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BattingSide implements RawRepresentable<String>, SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ BattingSide[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;

            /* renamed from: long, reason: not valid java name */
            public static final BattingSide f4long = new BattingSide("long", 0, "long", null, 2, null);

            /* renamed from: short, reason: not valid java name */
            public static final BattingSide f5short = new BattingSide("short", 1, "short", null, 2, null);
            private final String rawValue;

            private static final /* synthetic */ BattingSide[] $values() {
                return new BattingSide[]{f4long, f5short};
            }

            static {
                BattingSide[] $values = $values();
                $VALUES = $values;
                $ENTRIES = ww4.b($values);
                INSTANCE = new Companion(null);
            }

            public /* synthetic */ BattingSide(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, str2, (i2 & 2) != 0 ? null : r4);
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static ug7 getEntries() {
                return $ENTRIES;
            }

            public static BattingSide valueOf(String str) {
                return (BattingSide) Enum.valueOf(BattingSide.class, str);
            }

            public static BattingSide[] values() {
                return (BattingSide[]) $VALUES.clone();
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
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EEvent$SportsGame$BattingSide$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EEvent$SportsGame$BattingSide;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final BattingSide init(String rawValue) {
                    rawValue.getClass();
                    if (Intrinsics.areEqual(rawValue, "long")) {
                        return BattingSide.f4long;
                    }
                    if (Intrinsics.areEqual(rawValue, "short")) {
                        return BattingSide.f5short;
                    }
                    return null;
                }

                private Companion() {
                }
            }

            @Override // skip.lib.RawRepresentable
            public String getRawValue() {
                return this.rawValue;
            }

            private BattingSide(String str, int i, String str2, Void r4) {
                this.rawValue = str2;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0017B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0018"}, d2 = {"Lcom/polymarket/data/EEvent$SportsGame$GameState;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "notStarted", "live", "finished", "postponed", "cancelled", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GameState implements RawRepresentable<String>, SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ GameState[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final String rawValue;
            public static final GameState notStarted = new GameState("notStarted", 0, "not-started", null, 2, null);
            public static final GameState live = new GameState("live", 1, "live", null, 2, null);
            public static final GameState finished = new GameState("finished", 2, "finished", null, 2, null);
            public static final GameState postponed = new GameState("postponed", 3, "postponed", null, 2, null);
            public static final GameState cancelled = new GameState("cancelled", 4, "cancelled", null, 2, null);

            private static final /* synthetic */ GameState[] $values() {
                return new GameState[]{notStarted, live, finished, postponed, cancelled};
            }

            static {
                GameState[] $values = $values();
                $VALUES = $values;
                $ENTRIES = ww4.b($values);
                INSTANCE = new Companion(null);
            }

            public /* synthetic */ GameState(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, str2, (i2 & 2) != 0 ? null : r4);
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static ug7 getEntries() {
                return $ENTRIES;
            }

            public static GameState valueOf(String str) {
                return (GameState) Enum.valueOf(GameState.class, str);
            }

            public static GameState[] values() {
                return (GameState[]) $VALUES.clone();
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
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EEvent$SportsGame$GameState$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EEvent$SportsGame$GameState;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final GameState init(String rawValue) {
                    rawValue.getClass();
                    switch (rawValue.hashCode()) {
                        case -673660814:
                            if (!rawValue.equals("finished")) {
                                return null;
                            }
                            return GameState.finished;
                        case -425768057:
                            if (rawValue.equals("not-started")) {
                                return GameState.notStarted;
                            }
                            return null;
                        case 3322092:
                            if (rawValue.equals("live")) {
                                return GameState.live;
                            }
                            return null;
                        case 476588369:
                            if (rawValue.equals("cancelled")) {
                                return GameState.cancelled;
                            }
                            return null;
                        case 2018521742:
                            if (rawValue.equals("postponed")) {
                                return GameState.postponed;
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

            private GameState(String str, int i, String str2, Void r4) {
                this.rawValue = str2;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00132\u00020\u0001:\u0004\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0082 J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/polymarket/data/EEvent$SportsGame$PrimaryMarkets;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "rulesDisclaimer", "", "getRulesDisclaimer", "()Ljava/lang/String;", "Swift_rulesDisclaimer", "className", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "MoneylineCase", "DualOutcomeCase", "DrawableOutcomeCase", "Companion", "Lcom/polymarket/data/EEvent$SportsGame$PrimaryMarkets$DrawableOutcomeCase;", "Lcom/polymarket/data/EEvent$SportsGame$PrimaryMarkets$DualOutcomeCase;", "Lcom/polymarket/data/EEvent$SportsGame$PrimaryMarkets$MoneylineCase;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static abstract class PrimaryMarkets implements SwiftProjecting {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/polymarket/data/EEvent$SportsGame$PrimaryMarkets$DrawableOutcomeCase;", "Lcom/polymarket/data/EEvent$SportsGame$PrimaryMarkets;", "associated0", "", "Lcom/polymarket/data/EMarket;", "<init>", "(Ljava/util/List;)V", "getAssociated0", "()Ljava/util/List;", "markets", "getMarkets", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class DrawableOutcomeCase extends PrimaryMarkets {
                private final List<EMarket> associated0;
                private final List<EMarket> markets;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DrawableOutcomeCase(List<EMarket> list) {
                    super(null);
                    list.getClass();
                    this.associated0 = list;
                    this.markets = list;
                }

                public final List<EMarket> getAssociated0() {
                    return this.associated0;
                }

                public final List<EMarket> getMarkets() {
                    return this.markets;
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/polymarket/data/EEvent$SportsGame$PrimaryMarkets$DualOutcomeCase;", "Lcom/polymarket/data/EEvent$SportsGame$PrimaryMarkets;", "associated0", "", "Lcom/polymarket/data/EMarket;", "<init>", "(Ljava/util/List;)V", "getAssociated0", "()Ljava/util/List;", "markets", "getMarkets", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class DualOutcomeCase extends PrimaryMarkets {
                private final List<EMarket> associated0;
                private final List<EMarket> markets;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DualOutcomeCase(List<EMarket> list) {
                    super(null);
                    list.getClass();
                    this.associated0 = list;
                    this.markets = list;
                }

                public final List<EMarket> getAssociated0() {
                    return this.associated0;
                }

                public final List<EMarket> getMarkets() {
                    return this.markets;
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/data/EEvent$SportsGame$PrimaryMarkets$MoneylineCase;", "Lcom/polymarket/data/EEvent$SportsGame$PrimaryMarkets;", "associated0", "Lcom/polymarket/data/EMarket;", "<init>", "(Lcom/polymarket/data/EMarket;)V", "getAssociated0", "()Lcom/polymarket/data/EMarket;", "market", "getMarket", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class MoneylineCase extends PrimaryMarkets {
                private final EMarket associated0;
                private final EMarket market;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public MoneylineCase(EMarket eMarket) {
                    super(null);
                    eMarket.getClass();
                    this.associated0 = eMarket;
                    this.market = eMarket;
                }

                public final EMarket getAssociated0() {
                    return this.associated0;
                }

                public final EMarket getMarket() {
                    return this.market;
                }
            }

            public /* synthetic */ PrimaryMarkets(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            private final native String Swift_rulesDisclaimer(String className);

            @Override // skip.lib.SwiftProjecting
            public Function0<Object> Swift_projection(int options) {
                return Swift_projectionImpl(options);
            }

            public final String getRulesDisclaimer() {
                return Swift_rulesDisclaimer(getClass().getName());
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0014\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\u0014\u0010\u000b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n¨\u0006\f"}, d2 = {"Lcom/polymarket/data/EEvent$SportsGame$PrimaryMarkets$Companion;", "", "<init>", "()V", "moneyline", "Lcom/polymarket/data/EEvent$SportsGame$PrimaryMarkets;", "market", "Lcom/polymarket/data/EMarket;", "dualOutcome", "markets", "", "drawableOutcome", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final PrimaryMarkets drawableOutcome(List<EMarket> markets) {
                    markets.getClass();
                    return new DrawableOutcomeCase(markets);
                }

                public final PrimaryMarkets dualOutcome(List<EMarket> markets) {
                    markets.getClass();
                    return new DualOutcomeCase(markets);
                }

                public final PrimaryMarkets moneyline(EMarket market) {
                    market.getClass();
                    return new MoneylineCase(market);
                }

                private Companion() {
                }
            }

            private PrimaryMarkets() {
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0001>B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBU\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\u0013J\u0006\u0010\u0018\u001a\u00020\u0019J\u0015\u0010\u001a\u001a\u00020\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010!\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010$\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010%J\u001c\u0010'\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010%J\u0017\u0010)\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010+\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JX\u0010,\u001a\u00060\u0004j\u0002`\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0082 ¢\u0006\u0002\u0010-J\u0017\u00100\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0096\u0002J\u0019\u00105\u001a\u0002022\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0000H\u0082 J\b\u00108\u001a\u00020\u000fH\u0016J\u0015\u00109\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u0002040;2\u0006\u0010<\u001a\u00020\u000fH\u0016J\u0017\u0010=\u001a\b\u0012\u0004\u0012\u0002040;2\u0006\u0010<\u001a\u00020\u000fH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b&\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001cR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001cR\u0013\u0010.\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001c¨\u0006?"}, d2 = {"Lcom/polymarket/data/EEvent$SportsGame$UFCMetadata;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "weightClass", "", "cardSegment", "eventLogo", "rounds", "", "currentRound", "elapsedInRound", "decision", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getWeightClass", "()Ljava/lang/String;", "Swift_weightClass", "getCardSegment", "Swift_cardSegment", "getEventLogo", "Swift_eventLogo", "getRounds", "()Ljava/lang/Integer;", "Swift_rounds", "(J)Ljava/lang/Integer;", "getCurrentRound", "Swift_currentRound", "getElapsedInRound", "Swift_elapsedInRound", "getDecision", "Swift_decision", "Swift_constructor_0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)J", "formattedDetails", "getFormattedDetails", "Swift_formattedDetails", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class UFCMetadata implements SwiftPeerBridged, SwiftProjecting {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private long Swift_peer;

            public /* synthetic */ UFCMetadata(String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5);
            }

            private final native String Swift_cardSegment(long Swift_peer);

            private final native long Swift_constructor_0(String weightClass, String cardSegment, String eventLogo, Integer rounds, Integer currentRound, String elapsedInRound, String decision);

            private final native Integer Swift_currentRound(long Swift_peer);

            private final native String Swift_decision(long Swift_peer);

            private final native String Swift_elapsedInRound(long Swift_peer);

            private final native String Swift_eventLogo(long Swift_peer);

            private final native String Swift_formattedDetails(long Swift_peer);

            private final native long Swift_hashvalue(long Swift_peer);

            private final native boolean Swift_isequal(UFCMetadata lhs, UFCMetadata rhs);

            private final native Function0<Object> Swift_projectionImpl(int options);

            private final native void Swift_release(long Swift_peer);

            private final native Integer Swift_rounds(long Swift_peer);

            private final native String Swift_weightClass(long Swift_peer);

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
                if (!(other instanceof UFCMetadata)) {
                    return false;
                }
                return Swift_isequal(this, (UFCMetadata) other);
            }

            public final void finalize() {
                Swift_release(this.Swift_peer);
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            }

            public final String getCardSegment() {
                return Swift_cardSegment(this.Swift_peer);
            }

            public final Integer getCurrentRound() {
                return Swift_currentRound(this.Swift_peer);
            }

            public final String getDecision() {
                return Swift_decision(this.Swift_peer);
            }

            public final String getElapsedInRound() {
                return Swift_elapsedInRound(this.Swift_peer);
            }

            public final String getEventLogo() {
                return Swift_eventLogo(this.Swift_peer);
            }

            public final String getFormattedDetails() {
                return Swift_formattedDetails(this.Swift_peer);
            }

            public final Integer getRounds() {
                return Swift_rounds(this.Swift_peer);
            }

            public final long getSwift_peer() {
                return this.Swift_peer;
            }

            public final String getWeightClass() {
                return Swift_weightClass(this.Swift_peer);
            }

            public int hashCode() {
                return Long.hashCode(Swift_hashvalue(this.Swift_peer));
            }

            public final void setSwift_peer(long j) {
                this.Swift_peer = j;
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\b\u001a\u00020\u0005H\u0082 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/polymarket/data/EEvent$SportsGame$UFCMetadata$Companion;", "", "<init>", "()V", "empty", "Lcom/polymarket/data/EEvent$SportsGame$UFCMetadata;", "getEmpty", "()Lcom/polymarket/data/EEvent$SportsGame$UFCMetadata;", "Swift_Companion_empty", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private final native UFCMetadata Swift_Companion_empty();

                public final UFCMetadata getEmpty() {
                    return Swift_Companion_empty();
                }

                private Companion() {
                }
            }

            public UFCMetadata(String str, String str2, String str3, Integer num, Integer num2, String str4, String str5) {
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = Swift_constructor_0(str, str2, str3, num, num2, str4, str5);
            }

            public UFCMetadata(long j, SwiftPeerMarker swiftPeerMarker) {
                BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = j;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/data/EEvent$SportsGame$Companion;", "", "<init>", "()V", "BattingSide", "Lcom/polymarket/data/EEvent$SportsGame$BattingSide;", "rawValue", "", "GameState", "Lcom/polymarket/data/EEvent$SportsGame$GameState;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final BattingSide BattingSide(String rawValue) {
                rawValue.getClass();
                return BattingSide.INSTANCE.init(rawValue);
            }

            public final GameState GameState(String rawValue) {
                rawValue.getClass();
                return GameState.INSTANCE.init(rawValue);
            }

            private Companion() {
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001:B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0017\u0010!\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010\"\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u0010'\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010(\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0015\u0010)\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\b\u00105\u001a\u00020\u0001H\u0016J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u0017072\u0006\u00108\u001a\u00020\u0019H\u0016J\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020\u0017072\u0006\u00108\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010$\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R(\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010+X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006;"}, d2 = {"Lcom/polymarket/data/EEvent$SportsGame$TeamsPair;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "Lcom/polymarket/data/ESportsTeam;", "longTeam", "getLongTeam", "()Lcom/polymarket/data/ESportsTeam;", "setLongTeam", "(Lcom/polymarket/data/ESportsTeam;)V", "Swift_longTeam", "Swift_longTeam_set", "value", "shortTeam", "getShortTeam", "setShortTeam", "Swift_shortTeam", "Swift_shortTeam_set", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class TeamsPair implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
            private long Swift_peer;
            private int smutatingcount;
            private Function1<Object, Unit> supdate;

            private TeamsPair(MutableStruct mutableStruct) {
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = Swift_constructor_0(mutableStruct);
            }

            private final native long Swift_constructor_0(MutableStruct copy);

            private final native ESportsTeam Swift_longTeam(long Swift_peer);

            private final native void Swift_longTeam_set(long Swift_peer, ESportsTeam value);

            private final native Function0<Object> Swift_projectionImpl(int options);

            private final native void Swift_release(long Swift_peer);

            private final native ESportsTeam Swift_shortTeam(long Swift_peer);

            private final native void Swift_shortTeam_set(long Swift_peer, ESportsTeam value);

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

            public final ESportsTeam getLongTeam() {
                return Swift_longTeam(this.Swift_peer);
            }

            public final ESportsTeam getShortTeam() {
                return Swift_shortTeam(this.Swift_peer);
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
                return new TeamsPair(this);
            }

            public final void setLongTeam(ESportsTeam eSportsTeam) {
                ESportsTeam eSportsTeam2 = (ESportsTeam) StructKt.sref$default(eSportsTeam, null, 1, null);
                willmutate();
                try {
                    Swift_longTeam_set(this.Swift_peer, eSportsTeam2);
                } finally {
                    didmutate();
                }
            }

            public final void setShortTeam(ESportsTeam eSportsTeam) {
                ESportsTeam eSportsTeam2 = (ESportsTeam) StructKt.sref$default(eSportsTeam, null, 1, null);
                willmutate();
                try {
                    Swift_shortTeam_set(this.Swift_peer, eSportsTeam2);
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

            public TeamsPair(long j, SwiftPeerMarker swiftPeerMarker) {
                BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = j;
            }
        }

        public SportsGame(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB1\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\b\u0010\u0011J\u0006\u0010\u0016\u001a\u00020\u0017J\u0015\u0010\u0018\u001a\u00020\u00172\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0015\u0010\u001d\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001f\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010!\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010#\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010$\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J5\u0010%\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082 J\u0013\u0010&\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010(H\u0096\u0002J\u0019\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0000H\u0082 J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020(0-2\u0006\u0010.\u001a\u00020\u001aH\u0016J\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020(0-2\u0006\u0010.\u001a\u00020\u001aH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\"R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\"¨\u00061"}, d2 = {"Lcom/polymarket/data/EEvent$SportsGame$StartTimeLabel;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "dayText", "", "monthDayText", "timeText", "isToday", "", "isStartingSoon", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getDayText", "()Ljava/lang/String;", "Swift_dayText", "getMonthDayText", "Swift_monthDayText", "getTimeText", "Swift_timeText", "()Z", "Swift_isToday", "Swift_isStartingSoon", "Swift_constructor_0", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class StartTimeLabel implements SwiftPeerBridged, SwiftProjecting {
            private long Swift_peer;

            public StartTimeLabel(String str, String str2, String str3, boolean z, boolean z2) {
                g.x(str, str2, str3);
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = Swift_constructor_0(str, str2, str3, z, z2);
            }

            private final native long Swift_constructor_0(String dayText, String monthDayText, String timeText, boolean isToday, boolean isStartingSoon);

            private final native String Swift_dayText(long Swift_peer);

            private final native boolean Swift_isStartingSoon(long Swift_peer);

            private final native boolean Swift_isToday(long Swift_peer);

            private final native boolean Swift_isequal(StartTimeLabel lhs, StartTimeLabel rhs);

            private final native String Swift_monthDayText(long Swift_peer);

            private final native Function0<Object> Swift_projectionImpl(int options);

            private final native void Swift_release(long Swift_peer);

            private final native String Swift_timeText(long Swift_peer);

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
                if (!(other instanceof StartTimeLabel)) {
                    return false;
                }
                return Swift_isequal(this, (StartTimeLabel) other);
            }

            public final void finalize() {
                Swift_release(this.Swift_peer);
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            }

            public final String getDayText() {
                return Swift_dayText(this.Swift_peer);
            }

            public final String getMonthDayText() {
                return Swift_monthDayText(this.Swift_peer);
            }

            public final long getSwift_peer() {
                return this.Swift_peer;
            }

            public final String getTimeText() {
                return Swift_timeText(this.Swift_peer);
            }

            public int hashCode() {
                return Long.hashCode(this.Swift_peer);
            }

            public final boolean isStartingSoon() {
                return Swift_isStartingSoon(this.Swift_peer);
            }

            public final boolean isToday() {
                return Swift_isToday(this.Swift_peer);
            }

            public final void setSwift_peer(long j) {
                this.Swift_peer = j;
            }

            public StartTimeLabel(long j, SwiftPeerMarker swiftPeerMarker) {
                BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = j;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBA\b\u0016\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\b\u0010\u0012J\u0006\u0010\u0017\u001a\u00020\u0018J\u0015\u0010\u0019\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010 \u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010#\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010&\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J=\u0010'\u001a\u00060\u0004j\u0002`\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082 J\u0013\u0010(\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010*H\u0096\u0002J\u0019\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0000H\u0082 J\b\u0010.\u001a\u00020/H\u0016J\u0015\u00100\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020*022\u0006\u00103\u001a\u00020/H\u0016J\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020*022\u0006\u00103\u001a\u00020/H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u00066"}, d2 = {"Lcom/polymarket/data/EEvent$SportsGame$TitleBlockPresentation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "categoryName", "leagueName", "glyphImageURL", "Ljava/net/URI;", "usesLeadingAlignment", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;Z)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getTitle", "()Ljava/lang/String;", "Swift_title", "getCategoryName", "Swift_categoryName", "getLeagueName", "Swift_leagueName", "getGlyphImageURL", "()Ljava/net/URI;", "Swift_glyphImageURL", "getUsesLeadingAlignment", "()Z", "Swift_usesLeadingAlignment", "Swift_constructor_0", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class TitleBlockPresentation implements SwiftPeerBridged, SwiftProjecting {
            private long Swift_peer;

            public /* synthetic */ TitleBlockPresentation(String str, String str2, String str3, URI uri, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : uri, z);
            }

            private final native String Swift_categoryName(long Swift_peer);

            private final native long Swift_constructor_0(String title, String categoryName, String leagueName, URI glyphImageURL, boolean usesLeadingAlignment);

            private final native URI Swift_glyphImageURL(long Swift_peer);

            private final native long Swift_hashvalue(long Swift_peer);

            private final native boolean Swift_isequal(TitleBlockPresentation lhs, TitleBlockPresentation rhs);

            private final native String Swift_leagueName(long Swift_peer);

            private final native Function0<Object> Swift_projectionImpl(int options);

            private final native void Swift_release(long Swift_peer);

            private final native String Swift_title(long Swift_peer);

            private final native boolean Swift_usesLeadingAlignment(long Swift_peer);

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
                if (!(other instanceof TitleBlockPresentation)) {
                    return false;
                }
                return Swift_isequal(this, (TitleBlockPresentation) other);
            }

            public final void finalize() {
                Swift_release(this.Swift_peer);
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            }

            public final String getCategoryName() {
                return Swift_categoryName(this.Swift_peer);
            }

            public final URI getGlyphImageURL() {
                return Swift_glyphImageURL(this.Swift_peer);
            }

            public final String getLeagueName() {
                return Swift_leagueName(this.Swift_peer);
            }

            public final long getSwift_peer() {
                return this.Swift_peer;
            }

            public final String getTitle() {
                return Swift_title(this.Swift_peer);
            }

            public final boolean getUsesLeadingAlignment() {
                return Swift_usesLeadingAlignment(this.Swift_peer);
            }

            public int hashCode() {
                return Long.hashCode(Swift_hashvalue(this.Swift_peer));
            }

            public final void setSwift_peer(long j) {
                this.Swift_peer = j;
            }

            public TitleBlockPresentation(String str, String str2, String str3, URI uri, boolean z) {
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = Swift_constructor_0(str, str2, str3, uri, z);
            }

            public TitleBlockPresentation(long j, SwiftPeerMarker swiftPeerMarker) {
                BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = j;
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \r2\u00020\u0001:\u0004\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/polymarket/data/EEvent$UIType;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "SportsGameCase", "StandardEventCase", "NoneCase", "Companion", "Lcom/polymarket/data/EEvent$UIType$NoneCase;", "Lcom/polymarket/data/EEvent$UIType$SportsGameCase;", "Lcom/polymarket/data/EEvent$UIType$StandardEventCase;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class UIType implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final UIType none = new NoneCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/EEvent$UIType$NoneCase;", "Lcom/polymarket/data/EEvent$UIType;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NoneCase extends UIType {
            public NoneCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/data/EEvent$UIType$SportsGameCase;", "Lcom/polymarket/data/EEvent$UIType;", "associated0", "Lcom/polymarket/data/EEvent$SportsGame;", "<init>", "(Lcom/polymarket/data/EEvent$SportsGame;)V", "getAssociated0", "()Lcom/polymarket/data/EEvent$SportsGame;", "gameEvent", "getGameEvent", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SportsGameCase extends UIType {
            private final SportsGame associated0;
            private final SportsGame gameEvent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SportsGameCase(SportsGame sportsGame) {
                super(null);
                sportsGame.getClass();
                this.associated0 = sportsGame;
                this.gameEvent = sportsGame;
            }

            public final SportsGame getAssociated0() {
                return this.associated0;
            }

            public final SportsGame getGameEvent() {
                return this.gameEvent;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/data/EEvent$UIType$StandardEventCase;", "Lcom/polymarket/data/EEvent$UIType;", "associated0", "Lcom/polymarket/data/EEvent$StandardEvent;", "<init>", "(Lcom/polymarket/data/EEvent$StandardEvent;)V", "getAssociated0", "()Lcom/polymarket/data/EEvent$StandardEvent;", "event", "getEvent", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class StandardEventCase extends UIType {
            private final StandardEvent associated0;
            private final StandardEvent event;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StandardEventCase(StandardEvent standardEvent) {
                super(null);
                standardEvent.getClass();
                this.associated0 = standardEvent;
                this.event = standardEvent;
            }

            public final StandardEvent getAssociated0() {
                return this.associated0;
            }

            public final StandardEvent getEvent() {
                return this.event;
            }
        }

        public /* synthetic */ UIType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ UIType access$getNone$cp() {
            return none;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/polymarket/data/EEvent$UIType$Companion;", "", "<init>", "()V", "sportsGame", "Lcom/polymarket/data/EEvent$UIType;", "gameEvent", "Lcom/polymarket/data/EEvent$SportsGame;", "standardEvent", "event", "Lcom/polymarket/data/EEvent$StandardEvent;", "none", "getNone", "()Lcom/polymarket/data/EEvent$UIType;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final UIType getNone() {
                return UIType.access$getNone$cp();
            }

            public final UIType sportsGame(SportsGame gameEvent) {
                gameEvent.getClass();
                return new SportsGameCase(gameEvent);
            }

            public final UIType standardEvent(StandardEvent event) {
                event.getClass();
                return new StandardEventCase(event);
            }

            private Companion() {
            }
        }

        private UIType() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\b\u001a\u00020\u0005H\u0082 J(\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ%\u0010\u0010\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0082 J\u0018\u0010\u0012\u001a\u00020\n2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0014J\u0019\u0010\u0015\u001a\u00020\n2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0014H\u0082 J\u0006\u0010\u0016\u001a\u00020\nJ\t\u0010\u0017\u001a\u00020\nH\u0082 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/polymarket/data/EEvent$Companion;", "", "<init>", "()V", "livestreamEndedLingerDuration", "", "getLivestreamEndedLingerDuration", "()D", "Swift_Companion_livestreamEndedLingerDuration", "mockRealisticNBA", "Lcom/polymarket/data/EEvent;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "gameState", "startTime", "Ljava/util/Date;", "Swift_Companion_mockRealisticNBA_14", "overrideStartTime", "mockRealisticFutures", "prices", "", "Swift_Companion_mockRealisticFutures_15", "mockStandardEvent", "Swift_Companion_mockStandardEvent_16", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native double Swift_Companion_livestreamEndedLingerDuration();

        private final native EEvent Swift_Companion_mockRealisticFutures_15(List<String> prices);

        private final native EEvent Swift_Companion_mockRealisticNBA_14(String id, String gameState, Date overrideStartTime);

        private final native EEvent Swift_Companion_mockStandardEvent_16();

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EEvent mockRealisticFutures$default(Companion companion, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = null;
            }
            return companion.mockRealisticFutures(list);
        }

        public static /* synthetic */ EEvent mockRealisticNBA$default(Companion companion, String str, String str2, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = "live";
            }
            if ((i & 4) != 0) {
                date = null;
            }
            return companion.mockRealisticNBA(str, str2, date);
        }

        public final double getLivestreamEndedLingerDuration() {
            return Swift_Companion_livestreamEndedLingerDuration();
        }

        public final EEvent mockRealisticFutures(List<String> prices) {
            return Swift_Companion_mockRealisticFutures_15(prices);
        }

        public final EEvent mockRealisticNBA(String id, String gameState, Date startTime) {
            gameState.getClass();
            return Swift_Companion_mockRealisticNBA_14(id, gameState, startTime);
        }

        public final EEvent mockStandardEvent() {
            return Swift_Companion_mockStandardEvent_16();
        }

        private Companion() {
        }
    }

    public final EMarket market(String bySlug, Void unusedp_0, Void unusedp_1) {
        bySlug.getClass();
        return Swift_market_4(this.Swift_peer, bySlug);
    }

    public final EMarket market(String for_) {
        for_.getClass();
        return Swift_market_5(this.Swift_peer, for_);
    }

    public final EMarket market(EMarket.MarketSide for_) {
        for_.getClass();
        return Swift_market_6(this.Swift_peer, for_);
    }

    public final EMarket market(String byID, Void unusedp_0) {
        byID.getClass();
        return Swift_market_13(this.Swift_peer, byID);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ¤\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002¤\u0001B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0015\u0010\u001e\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010#\u001a\u00020 2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001c\u0010'\u001a\u0004\u0018\u00010\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010(J\u0017\u0010+\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u00100\u001a\u0004\u0018\u00010-2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u00103\u001a\u0004\u0018\u00010-2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u00106\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010?\u001a\n\u0012\u0004\u0012\u000209\u0018\u0001082\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J%\u0010@\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u000e\u0010A\u001a\n\u0012\u0004\u0012\u000209\u0018\u000108H\u0082 J\u0017\u0010D\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010G\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010J\u001a\u0004\u0018\u00010-2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010M\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010R\u001a\u0004\u0018\u00010-2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010S\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010A\u001a\u0004\u0018\u00010-H\u0082 J\u0017\u0010Z\u001a\u0004\u0018\u00010T2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010[\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010A\u001a\u0004\u0018\u00010TH\u0082 J\u0017\u0010`\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010a\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010A\u001a\u0004\u0018\u00010\u001bH\u0082 J\u001b\u0010f\u001a\b\u0012\u0004\u0012\u00020b082\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u0010g\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010A\u001a\b\u0012\u0004\u0012\u00020b08H\u0082 J\u0015\u0010j\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010o\u001a\u0004\u0018\u00010l2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010r\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010t\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001b\u0010w\u001a\b\u0012\u0004\u0012\u00020b082\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010z\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010}\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010~\u001a\u00020\u00152\r\u0010\u007f\u001a\t\u0012\u0004\u0012\u00020\u001b0\u0080\u0001J&\u0010\u0081\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u000e\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00020\u001b0\u0080\u0001H\u0082 J\u001c\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b082\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0013\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0087\u00012\u0007\u0010\u0088\u0001\u001a\u00020\u001bJ!\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0087\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0082 J\u0013\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u008b\u00012\u0007\u0010\u0088\u0001\u001a\u00020\u001bJ\"\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010\u008d\u0001\u001a\u00020\u001bH\u0082 J\u0012\u0010\u008e\u0001\u001a\u0004\u0018\u00010b2\u0007\u0010\u0088\u0001\u001a\u000209J!\u0010\u008f\u0001\u001a\u0004\u0018\u00010b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010\u0090\u0001\u001a\u000209H\u0082 J\u0013\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0087\u00012\u0007\u0010\u0088\u0001\u001a\u000209J\"\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0087\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010\u0090\u0001\u001a\u000209H\u0082 J\u0016\u0010\u0093\u0001\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\t\u0010\u009f\u0001\u001a\u00020\u0001H\u0016J\u0019\u0010 \u0001\u001a\t\u0012\u0004\u0012\u00020\u00170¡\u00012\u0007\u0010¢\u0001\u001a\u00020\u0019H\u0016J\u001a\u0010£\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170¡\u00012\u0007\u0010¢\u0001\u001a\u00020\u0019H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010$\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010)\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001dR\u0013\u0010,\u001a\u0004\u0018\u00010-8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u00101\u001a\u0004\u0018\u00010-8F¢\u0006\u0006\u001a\u0004\b2\u0010/R\u0013\u00104\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b5\u0010\u001dR4\u0010:\u001a\n\u0012\u0004\u0012\u000209\u0018\u0001082\u000e\u00107\u001a\n\u0012\u0004\u0012\u000209\u0018\u0001088F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0013\u0010B\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\bC\u0010\u001dR\u0013\u0010E\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\bF\u0010\u001dR\u0013\u0010H\u001a\u0004\u0018\u00010-8F¢\u0006\u0006\u001a\u0004\bI\u0010/R\u0013\u0010K\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\bL\u0010\u001dR(\u0010N\u001a\u0004\u0018\u00010-2\b\u00107\u001a\u0004\u0018\u00010-8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010/\"\u0004\bP\u0010QR(\u0010U\u001a\u0004\u0018\u00010T2\b\u00107\u001a\u0004\u0018\u00010T8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR(\u0010\\\u001a\u0004\u0018\u00010\u001b2\b\u00107\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010\u001d\"\u0004\b^\u0010_R0\u0010c\u001a\b\u0012\u0004\u0012\u00020b082\f\u00107\u001a\b\u0012\u0004\u0012\u00020b088F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010<\"\u0004\be\u0010>R\u0011\u0010h\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0013\u0010k\u001a\u0004\u0018\u00010l8F¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0013\u0010p\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\bq\u0010\u001dR\u0011\u0010s\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bs\u0010iR\u0017\u0010u\u001a\b\u0012\u0004\u0012\u00020b088F¢\u0006\u0006\u001a\u0004\bv\u0010<R\u0013\u0010x\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\by\u0010\u001dR\u0013\u0010{\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b|\u0010\u001dR\u0019\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b088F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010<R.\u0010\u0094\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0095\u0001X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001f\u0010\u009a\u0001\u001a\u00020\u0019X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001¨\u0006¥\u0001"}, d2 = {"Lcom/polymarket/data/EEvent$StandardEvent;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "getId", "()Ljava/lang/String;", "Swift_id", "eventCategory", "Lcom/polymarket/data/APIEventCategory;", "getEventCategory", "()Lcom/polymarket/data/APIEventCategory;", "Swift_eventCategory", MetricTracker.Action.CLOSED, "getClosed", "()Ljava/lang/Boolean;", "Swift_closed", "(J)Ljava/lang/Boolean;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "Swift_title", "createdAt", "Ljava/util/Date;", "getCreatedAt", "()Ljava/util/Date;", "Swift_createdAt", "endDate", "getEndDate", "Swift_endDate", "image", "getImage", "Swift_image", "newValue", "", "Lcom/polymarket/data/ESportsTeam;", "teams", "getTeams", "()Ljava/util/List;", "setTeams", "(Ljava/util/List;)V", "Swift_teams", "Swift_teams_set", "value", "seriesSlug", "getSeriesSlug", "Swift_seriesSlug", "slug", "getSlug", "Swift_slug", "startDate", "getStartDate", "Swift_startDate", "ticker", "getTicker", "Swift_ticker", "updatedAt", "getUpdatedAt", "setUpdatedAt", "(Ljava/util/Date;)V", "Swift_updatedAt", "Swift_updatedAt_set", "Lcom/polymarket/data/ESportsSlug;", "sportSlug", "getSportSlug", "()Lcom/polymarket/data/ESportsSlug;", "setSportSlug", "(Lcom/polymarket/data/ESportsSlug;)V", "Swift_sportSlug", "Swift_sportSlug_set", "leagueDisplayName", "getLeagueDisplayName", "setLeagueDisplayName", "(Ljava/lang/String;)V", "Swift_leagueDisplayName", "Swift_leagueDisplayName_set", "Lcom/polymarket/data/EMarket;", "sortedMarkets", "getSortedMarkets", "setSortedMarkets", "Swift_sortedMarkets", "Swift_sortedMarkets_set", "isLive", "()Z", "Swift_isLive", "imageURL", "Ljava/net/URI;", "getImageURL", "()Ljava/net/URI;", "Swift_imageURL", "categoryTitle", "getCategoryTitle", "Swift_categoryTitle", "isBinaryMarket", "Swift_isBinaryMarket", "resolvedMarkets", "getResolvedMarkets", "Swift_resolvedMarkets", "formattedDescription", "getFormattedDescription", "Swift_formattedDescription", "formattedEndDate", "getFormattedEndDate", "Swift_formattedEndDate", "hasPosition", "in_", "", "Swift_hasPosition_0", "positionedMarketSlugs", "marketSlugs", "getMarketSlugs", "Swift_marketSlugs", "marketSide", "Lcom/polymarket/data/EMarket$MarketSide;", "for_", "Swift_marketSide_1", "cache", "Lcom/polymarket/data/EMarketCache;", "Swift_cache_2", "marketId", "futuresMarket", "Swift_futuresMarket_3", "team", "yesFuturesMarketSide", "Swift_yesFuturesMarketSide_4", "Swift_constructor_5", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class StandardEvent implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        private StandardEvent(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_5(mutableStruct);
        }

        private final native EMarketCache Swift_cache_2(long Swift_peer, String marketId);

        private final native String Swift_categoryTitle(long Swift_peer);

        private final native Boolean Swift_closed(long Swift_peer);

        private final native long Swift_constructor_5(MutableStruct copy);

        private final native Date Swift_createdAt(long Swift_peer);

        private final native Date Swift_endDate(long Swift_peer);

        private final native APIEventCategory Swift_eventCategory(long Swift_peer);

        private final native String Swift_formattedDescription(long Swift_peer);

        private final native String Swift_formattedEndDate(long Swift_peer);

        private final native EMarket Swift_futuresMarket_3(long Swift_peer, ESportsTeam team);

        private final native boolean Swift_hasPosition_0(long Swift_peer, Set<String> positionedMarketSlugs);

        private final native String Swift_id(long Swift_peer);

        private final native String Swift_image(long Swift_peer);

        private final native URI Swift_imageURL(long Swift_peer);

        private final native boolean Swift_isBinaryMarket(long Swift_peer);

        private final native boolean Swift_isLive(long Swift_peer);

        private final native String Swift_leagueDisplayName(long Swift_peer);

        private final native void Swift_leagueDisplayName_set(long Swift_peer, String value);

        private final native EMarket.MarketSide Swift_marketSide_1(long Swift_peer, String id);

        private final native List<String> Swift_marketSlugs(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native List<EMarket> Swift_resolvedMarkets(long Swift_peer);

        private final native String Swift_seriesSlug(long Swift_peer);

        private final native String Swift_slug(long Swift_peer);

        private final native List<EMarket> Swift_sortedMarkets(long Swift_peer);

        private final native void Swift_sortedMarkets_set(long Swift_peer, List<EMarket> value);

        private final native ESportsSlug Swift_sportSlug(long Swift_peer);

        private final native void Swift_sportSlug_set(long Swift_peer, ESportsSlug value);

        private final native Date Swift_startDate(long Swift_peer);

        private final native List<ESportsTeam> Swift_teams(long Swift_peer);

        private final native void Swift_teams_set(long Swift_peer, List<ESportsTeam> value);

        private final native String Swift_ticker(long Swift_peer);

        private final native String Swift_title(long Swift_peer);

        private final native Date Swift_updatedAt(long Swift_peer);

        private final native void Swift_updatedAt_set(long Swift_peer, Date value);

        private final native EMarket.MarketSide Swift_yesFuturesMarketSide_4(long Swift_peer, ESportsTeam team);

        @Override // skip.bridge.SwiftPeerBridged
        /* renamed from: Swift_peer, reason: from getter */
        public long getSwift_peer() {
            return this.Swift_peer;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final EMarketCache cache(String for_) {
            for_.getClass();
            return Swift_cache_2(this.Swift_peer, for_);
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

        public final EMarket futuresMarket(ESportsTeam for_) {
            for_.getClass();
            return Swift_futuresMarket_3(this.Swift_peer, for_);
        }

        public final String getCategoryTitle() {
            return Swift_categoryTitle(this.Swift_peer);
        }

        public final Boolean getClosed() {
            return Swift_closed(this.Swift_peer);
        }

        public final Date getCreatedAt() {
            return Swift_createdAt(this.Swift_peer);
        }

        public final Date getEndDate() {
            return Swift_endDate(this.Swift_peer);
        }

        public final APIEventCategory getEventCategory() {
            return Swift_eventCategory(this.Swift_peer);
        }

        public final String getFormattedDescription() {
            return Swift_formattedDescription(this.Swift_peer);
        }

        public final String getFormattedEndDate() {
            return Swift_formattedEndDate(this.Swift_peer);
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

        public final String getLeagueDisplayName() {
            return Swift_leagueDisplayName(this.Swift_peer);
        }

        public final List<String> getMarketSlugs() {
            return Swift_marketSlugs(this.Swift_peer);
        }

        public final List<EMarket> getResolvedMarkets() {
            return Swift_resolvedMarkets(this.Swift_peer);
        }

        public final String getSeriesSlug() {
            return Swift_seriesSlug(this.Swift_peer);
        }

        public final String getSlug() {
            return Swift_slug(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public int getSmutatingcount() {
            return this.smutatingcount;
        }

        public final List<EMarket> getSortedMarkets() {
            return Swift_sortedMarkets(this.Swift_peer);
        }

        public final ESportsSlug getSportSlug() {
            return Swift_sportSlug(this.Swift_peer);
        }

        public final Date getStartDate() {
            return Swift_startDate(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public Function1<Object, Unit> getSupdate() {
            return this.supdate;
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final List<ESportsTeam> getTeams() {
            return Swift_teams(this.Swift_peer);
        }

        public final String getTicker() {
            return Swift_ticker(this.Swift_peer);
        }

        public final String getTitle() {
            return Swift_title(this.Swift_peer);
        }

        public final Date getUpdatedAt() {
            return Swift_updatedAt(this.Swift_peer);
        }

        public final boolean hasPosition(Set<String> in_) {
            in_.getClass();
            return Swift_hasPosition_0(this.Swift_peer, in_);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final boolean isBinaryMarket() {
            return Swift_isBinaryMarket(this.Swift_peer);
        }

        public final boolean isLive() {
            return Swift_isLive(this.Swift_peer);
        }

        public final EMarket.MarketSide marketSide(String for_) {
            for_.getClass();
            return Swift_marketSide_1(this.Swift_peer, for_);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new StandardEvent(this);
        }

        public final void setLeagueDisplayName(String str) {
            willmutate();
            try {
                Swift_leagueDisplayName_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void setSmutatingcount(int i) {
            this.smutatingcount = i;
        }

        public final void setSortedMarkets(List<EMarket> list) {
            list.getClass();
            List<EMarket> list2 = (List) StructKt.sref$default(list, null, 1, null);
            willmutate();
            try {
                Swift_sortedMarkets_set(this.Swift_peer, list2);
            } finally {
                didmutate();
            }
        }

        public final void setSportSlug(ESportsSlug eSportsSlug) {
            willmutate();
            try {
                Swift_sportSlug_set(this.Swift_peer, eSportsSlug);
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

        public final void setTeams(List<ESportsTeam> list) {
            List<ESportsTeam> list2 = (List) StructKt.sref$default(list, null, 1, null);
            willmutate();
            try {
                Swift_teams_set(this.Swift_peer, list2);
            } finally {
                didmutate();
            }
        }

        public final void setUpdatedAt(Date date) {
            Date date2 = (Date) StructKt.sref$default(date, null, 1, null);
            willmutate();
            try {
                Swift_updatedAt_set(this.Swift_peer, date2);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        public final EMarket.MarketSide yesFuturesMarketSide(ESportsTeam for_) {
            for_.getClass();
            return Swift_yesFuturesMarketSide_4(this.Swift_peer, for_);
        }

        public StandardEvent(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    public EEvent(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB'\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0015\u0010\u001a\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001c\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001e\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J%\u0010\u001f\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0082 J\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\u0019\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0000H\u0082 J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0'2\u0006\u0010(\u001a\u00020\u0017H\u0016J\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0'2\u0006\u0010(\u001a\u00020\u0017H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019¨\u0006+"}, d2 = {"Lcom/polymarket/data/EEvent$EventFeatureAvailability;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "lineups", "", "timeline", "stats", "(ZZZ)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getLineups", "()Z", "Swift_lineups", "getTimeline", "Swift_timeline", "getStats", "Swift_stats", "Swift_constructor_0", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class EventFeatureAvailability implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ EventFeatureAvailability(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
        }

        private final native long Swift_constructor_0(boolean lineups, boolean timeline, boolean stats);

        private final native boolean Swift_isequal(EventFeatureAvailability lhs, EventFeatureAvailability rhs);

        private final native boolean Swift_lineups(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native boolean Swift_stats(long Swift_peer);

        private final native boolean Swift_timeline(long Swift_peer);

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
            if (!(other instanceof EventFeatureAvailability)) {
                return false;
            }
            return Swift_isequal(this, (EventFeatureAvailability) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final boolean getLineups() {
            return Swift_lineups(this.Swift_peer);
        }

        public final boolean getStats() {
            return Swift_stats(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final boolean getTimeline() {
            return Swift_timeline(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public EventFeatureAvailability(boolean z, boolean z2, boolean z3) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(z, z2, z3);
        }

        public EventFeatureAvailability(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    public static /* synthetic */ EMarket market$default(EEvent eEvent, String str, Void r3, Void r4, int i, Object obj) {
        if ((i & 2) != 0) {
            r3 = null;
        }
        if ((i & 4) != 0) {
            r4 = null;
        }
        return eEvent.market(str, r3, r4);
    }

    public static /* synthetic */ EMarket market$default(EEvent eEvent, String str, Void r2, int i, Object obj) {
        if ((i & 2) != 0) {
            r2 = null;
        }
        return eEvent.market(str, r2);
    }
}
