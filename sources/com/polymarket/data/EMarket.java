package com.polymarket.data;

import com.checkout.components.wallet.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.polymarket.designtokens.DesignTokens;
import com.polymarket.designtokens.HexColorPair;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MutableStruct;
import skip.lib.RawRepresentable;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u0094\u00022\u00020\u00012\u00020\u0002:\u0012\u008c\u0002\u008d\u0002\u008e\u0002\u008f\u0002\u0090\u0002\u0091\u0002\u0092\u0002\u0093\u0002\u0094\u0002B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0015\u0010\u001d\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0082 J\u0015\u0010\u001e\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0082 J\u0017\u0010!\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010$\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010'\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010)\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010.\u001a\u00020+2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u00102\u001a\u0004\u0018\u00010\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u00103J\u001c\u00106\u001a\u0004\u0018\u00010\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u00103J\u001c\u00109\u001a\u0004\u0018\u00010\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u00103J\u0017\u0010A\u001a\u0004\u0018\u00010;2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001f\u0010B\u001a\u00020\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\b\u0010C\u001a\u0004\u0018\u00010;H\u0082 J\u001c\u0010F\u001a\u0004\u0018\u00010\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u00103J\u0015\u0010I\u001a\u00020+2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0010\u0010J\u001a\u0004\u0018\u00010K2\u0006\u0010L\u001a\u00020MJ\u001f\u0010N\u001a\u0004\u0018\u00010K2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010O\u001a\u00020MH\u0082 J\u0015\u0010R\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J&\u0010S\u001a\u00020T2\u0006\u0010L\u001a\u00020M2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010V2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010XJ1\u0010Y\u001a\u00020T2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010O\u001a\u00020M2\b\u0010U\u001a\u0004\u0018\u00010V2\b\u0010W\u001a\u0004\u0018\u00010XH\u0082 J\u0015\u0010[\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010b\u001a\u0004\u0018\u00010\\2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001f\u0010c\u001a\u00020\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\b\u0010C\u001a\u0004\u0018\u00010\\H\u0082 J\u001d\u0010h\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010k\u001a\u00020+2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010o\u001a\u0004\u0018\u00010X2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010r\u001a\u00020+2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010w\u001a\u0004\u0018\u00010t2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010xJ\u0015\u0010|\u001a\u00020t2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010\u0080\u0001\u001a\u00020\u001c2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\u0085\u0001\u001a\u00030\u0082\u00012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010\u0088\u0001\u001a\u00020\u001c2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001d\u0010\u008b\u0001\u001a\u0004\u0018\u00010t2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010xJ\u0016\u0010\u008e\u0001\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0018\u0010\u0091\u0001\u001a\u0004\u0018\u00010+2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010\u0094\u0001\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010\u0096\u0001\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0018\u0010\u0099\u0001\u001a\u0004\u0018\u00010+2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0018\u0010\u009d\u0001\u001a\u0004\u0018\u00010M2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u000f\u0010\u009e\u0001\u001a\u00020\u00182\u0006\u0010*\u001a\u00020+J\u001f\u0010\u009f\u0001\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0007\u0010 \u0001\u001a\u00020+H\u0082 J\u0018\u0010£\u0001\u001a\u0004\u0018\u00010+2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0018\u0010¦\u0001\u001a\u0004\u0018\u00010+2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0019\u0010«\u0001\u001a\u0005\u0018\u00010¨\u00012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010®\u0001\u001a\u00030¨\u00012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010°\u0001\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010²\u0001\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010´\u0001\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010·\u0001\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001d\u0010º\u0001\u001a\u0004\u0018\u00010t2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010xJ\u0018\u0010½\u0001\u001a\u0004\u0018\u00010+2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0018\u0010À\u0001\u001a\u0004\u0018\u00010+2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001d\u0010Â\u0001\u001a\u0004\u0018\u00010\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u00103J\u0018\u0010Å\u0001\u001a\u0004\u0018\u00010+2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0019\u0010Ê\u0001\u001a\u0005\u0018\u00010Ç\u00012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010Ì\u0001\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010Ï\u0001\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0018\u0010Ò\u0001\u001a\u0004\u0018\u00010+2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0018\u0010Õ\u0001\u001a\u0004\u0018\u00010+2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010×\u0001\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010Ù\u0001\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010Þ\u0001\u001a\u00030Û\u00012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010á\u0001\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010ä\u0001\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0013\u0010å\u0001\u001a\u0005\u0018\u00010æ\u00012\u0007\u0010ç\u0001\u001a\u00020\u0018J\"\u0010è\u0001\u001a\u0005\u0018\u00010æ\u00012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0007\u0010ç\u0001\u001a\u00020\u0018H\u0082 J\u0013\u0010é\u0001\u001a\u0005\u0018\u00010æ\u00012\u0007\u0010ç\u0001\u001a\u00020\u0018J\"\u0010ê\u0001\u001a\u0005\u0018\u00010æ\u00012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0007\u0010ç\u0001\u001a\u00020\u0018H\u0082 J\u0018\u0010ë\u0001\u001a\u0004\u0018\u00010t2\u0007\u0010ç\u0001\u001a\u00020\u0018¢\u0006\u0003\u0010ì\u0001J'\u0010í\u0001\u001a\u0004\u0018\u00010t2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0007\u0010ç\u0001\u001a\u00020\u0018H\u0082 ¢\u0006\u0003\u0010î\u0001J\u0010\u0010ï\u0001\u001a\u00020t2\u0007\u0010ç\u0001\u001a\u00020\u0018J\u001f\u0010ð\u0001\u001a\u00020t2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0007\u0010ç\u0001\u001a\u00020\u0018H\u0082 J\u0010\u0010ñ\u0001\u001a\u00020\u00182\u0007\u0010ç\u0001\u001a\u00020\u0018J\u001f\u0010ò\u0001\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0007\u0010ç\u0001\u001a\u00020\u0018H\u0082 J\u0010\u0010ó\u0001\u001a\u00020\u00182\u0007\u0010ç\u0001\u001a\u00020\u0018J\u001f\u0010ô\u0001\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0007\u0010ç\u0001\u001a\u00020\u0018H\u0082 J\u0012\u0010õ\u0001\u001a\u0004\u0018\u00010M2\u0007\u0010ö\u0001\u001a\u00020MJ \u0010÷\u0001\u001a\u0004\u0018\u00010M2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010O\u001a\u00020MH\u0082 J\u0013\u0010ø\u0001\u001a\u0005\u0018\u00010æ\u00012\u0007\u0010ç\u0001\u001a\u00020\u0018J\"\u0010ù\u0001\u001a\u0005\u0018\u00010æ\u00012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0007\u0010ç\u0001\u001a\u00020\u0018H\u0082 J\u001a\u0010ú\u0001\u001a\u00020+2\u0007\u0010ç\u0001\u001a\u00020\u00182\b\u0010û\u0001\u001a\u00030ü\u0001J)\u0010ý\u0001\u001a\u00020+2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0007\u0010ç\u0001\u001a\u00020\u00182\b\u0010û\u0001\u001a\u00030ü\u0001H\u0082 J\b\u0010þ\u0001\u001a\u00030ÿ\u0001J\u0017\u0010\u0080\u0002\u001a\u00030ÿ\u00012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0010\u0010\u0081\u0002\u001a\u00030\u0082\u00022\u0006\u0010L\u001a\u00020MJ \u0010\u0083\u0002\u001a\u00030\u0082\u00022\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0007\u0010\u0084\u0002\u001a\u00020MH\u0082 J\u0018\u0010\u0087\u0002\u001a\u0004\u0018\u00010+2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0019\u0010\u0088\u0002\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0089\u00022\u0007\u0010\u008a\u0002\u001a\u00020\u001cH\u0016J\u001a\u0010\u008b\u0002\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0089\u00022\u0007\u0010\u008a\u0002\u001a\u00020\u001cH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010%\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010(\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0011\u0010*\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010/\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u00104\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b5\u00101R\u0013\u00107\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b8\u00101R(\u0010<\u001a\u0004\u0018\u00010;2\b\u0010:\u001a\u0004\u0018\u00010;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0013\u0010D\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bE\u00101R\u0011\u0010G\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bH\u0010-R\u0011\u0010P\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bQ\u0010&R\u0011\u0010Z\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bZ\u0010&R(\u0010]\u001a\u0004\u0018\u00010\\2\b\u0010:\u001a\u0004\u0018\u00010\\8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0019\u0010d\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010e8F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0011\u0010i\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bj\u0010-R\u0013\u0010l\u001a\u0004\u0018\u00010X8F¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0011\u0010p\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bq\u0010-R\u0013\u0010s\u001a\u0004\u0018\u00010t8F¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0011\u0010y\u001a\u00020t8F¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0011\u0010}\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u0015\u0010\u0081\u0001\u001a\u00030\u0082\u00018F¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0013\u0010\u0086\u0001\u001a\u00020\u001c8F¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010\u007fR\u0015\u0010\u0089\u0001\u001a\u0004\u0018\u00010t8F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010vR\u0013\u0010\u008c\u0001\u001a\u00020\u00188F¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010&R\u0015\u0010\u008f\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010-R\u0013\u0010\u0092\u0001\u001a\u00020\u00188F¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010&R\u0013\u0010\u0095\u0001\u001a\u00020\u00188F¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010&R\u0015\u0010\u0097\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010-R\u0016\u0010\u009a\u0001\u001a\u0004\u0018\u00010M8F¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0015\u0010¡\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010-R\u0015\u0010¤\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010-R\u0017\u0010§\u0001\u001a\u0005\u0018\u00010¨\u00018F¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001R\u0015\u0010¬\u0001\u001a\u00030¨\u00018F¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010ª\u0001R\u0013\u0010¯\u0001\u001a\u00020\u00188F¢\u0006\u0007\u001a\u0005\b¯\u0001\u0010&R\u0013\u0010±\u0001\u001a\u00020\u00188F¢\u0006\u0007\u001a\u0005\b±\u0001\u0010&R\u0013\u0010³\u0001\u001a\u00020\u00188F¢\u0006\u0007\u001a\u0005\b³\u0001\u0010&R\u0013\u0010µ\u0001\u001a\u00020\u00188F¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010&R\u0015\u0010¸\u0001\u001a\u0004\u0018\u00010t8F¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010vR\u0015\u0010»\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010-R\u0015\u0010¾\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\b¿\u0001\u0010-R\u0015\u0010Á\u0001\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0007\u001a\u0005\bÁ\u0001\u00101R\u0015\u0010Ã\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\bÄ\u0001\u0010-R\u0017\u0010Æ\u0001\u001a\u0005\u0018\u00010Ç\u00018F¢\u0006\b\u001a\u0006\bÈ\u0001\u0010É\u0001R\u0013\u0010Ë\u0001\u001a\u00020\u00188F¢\u0006\u0007\u001a\u0005\bË\u0001\u0010&R\u0013\u0010Í\u0001\u001a\u00020\u00188F¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010&R\u0015\u0010Ð\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\bÑ\u0001\u0010-R\u0015\u0010Ó\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\bÔ\u0001\u0010-R\u0013\u0010Ö\u0001\u001a\u00020\u00188F¢\u0006\u0007\u001a\u0005\bÖ\u0001\u0010&R\u0013\u0010Ø\u0001\u001a\u00020\u00188F¢\u0006\u0007\u001a\u0005\bØ\u0001\u0010&R\u0015\u0010Ú\u0001\u001a\u00030Û\u00018F¢\u0006\b\u001a\u0006\bÜ\u0001\u0010Ý\u0001R\u0013\u0010ß\u0001\u001a\u00020\u00188F¢\u0006\u0007\u001a\u0005\bà\u0001\u0010&R\u0013\u0010â\u0001\u001a\u00020\u00188F¢\u0006\u0007\u001a\u0005\bã\u0001\u0010&R\u0015\u0010\u0085\u0002\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\b\u0086\u0002\u0010-¨\u0006\u0095\u0002"}, d2 = {"Lcom/polymarket/data/EMarket;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "standardMarket", "Lcom/polymarket/data/EMarket$StandardMarket;", "(Lcom/polymarket/data/EMarket$StandardMarket;)V", "sportsMarket", "Lcom/polymarket/data/EMarket$SportsMarket;", "(Lcom/polymarket/data/EMarket$SportsMarket;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "Swift_constructor_0", "Swift_constructor_1", "getStandardMarket", "()Lcom/polymarket/data/EMarket$StandardMarket;", "Swift_standardMarket", "getSportsMarket", "()Lcom/polymarket/data/EMarket$SportsMarket;", "Swift_sportsMarket", "isStandard", "()Z", "Swift_isStandard", "isSports", "Swift_isSports", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "getId", "()Ljava/lang/String;", "Swift_id", "active", "getActive", "()Ljava/lang/Boolean;", "Swift_active", "(J)Ljava/lang/Boolean;", "archived", "getArchived", "Swift_archived", MetricTracker.Action.CLOSED, "getClosed", "Swift_closed", "newValue", "Lcom/polymarket/data/APIMarketStatus;", "status", "getStatus", "()Lcom/polymarket/data/APIMarketStatus;", "setStatus", "(Lcom/polymarket/data/APIMarketStatus;)V", "Swift_status", "Swift_status_set", "value", "comboEnabled", "getComboEnabled", "Swift_comboEnabled", "category", "getCategory", "Swift_category", "team", "Lcom/polymarket/data/ESportsTeam;", "for_", "Lcom/polymarket/data/EMarket$MarketSide;", "Swift_team_6", "side", "hasDistinctSideTeams", "getHasDistinctSideTeams", "Swift_hasDistinctSideTeams", "displayContext", "Lcom/polymarket/data/EMarket$MarketSide$DisplayContext;", "sportSlug", "Lcom/polymarket/data/ESportsSlug;", "eventImageURL", "Ljava/net/URI;", "Swift_displayContext_7", "isFutureMarket", "Swift_isFutureMarket", "Lcom/polymarket/data/EMarketCache;", "marketCache", "getMarketCache", "()Lcom/polymarket/data/EMarketCache;", "setMarketCache", "(Lcom/polymarket/data/EMarketCache;)V", "Swift_marketCache", "Swift_marketCache_set", "marketSides", "", "getMarketSides", "()Ljava/util/List;", "Swift_marketSides", "slug", "getSlug", "Swift_slug", "imageURL", "getImageURL", "()Ljava/net/URI;", "Swift_imageURL", "question", "getQuestion", "Swift_question", "orderPriceMinTickSize", "", "getOrderPriceMinTickSize", "()Ljava/lang/Double;", "Swift_orderPriceMinTickSize", "(J)Ljava/lang/Double;", "priceTick", "getPriceTick", "()D", "Swift_priceTick", "priceDecimalPlaces", "getPriceDecimalPlaces", "()I", "Swift_priceDecimalPlaces", "minimumTradeQty", "Lcom/polymarket/data/EQuantity;", "getMinimumTradeQty", "()Lcom/polymarket/data/EQuantity;", "Swift_minimumTradeQty", "quantityDecimalPlaces", "getQuantityDecimalPlaces", "Swift_quantityDecimalPlaces", "feeCoefficient", "getFeeCoefficient", "Swift_feeCoefficient", "hasFees", "getHasFees", "Swift_hasFees", "rulesDisclaimer", "getRulesDisclaimer", "Swift_rulesDisclaimer", "rulesDisclaimerPopup", "getRulesDisclaimerPopup", "Swift_rulesDisclaimerPopup", "isDraw", "Swift_isDraw", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "Swift_title", "longMarketSide", "getLongMarketSide", "()Lcom/polymarket/data/EMarket$MarketSide;", "Swift_longMarketSide", "matchesTeam", "Swift_matchesTeam_10", "teamId", "formattedDisplayName", "getFormattedDisplayName", "Swift_formattedDisplayName", "formattedLongDisplayName", "getFormattedLongDisplayName", "Swift_formattedLongDisplayName", "resolvedColor", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "getResolvedColor", "()Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "Swift_resolvedColor", "color", "getColor", "Swift_color", "isMoneyline", "Swift_isMoneyline", "isSpread", "Swift_isSpread", "isTotal", "Swift_isTotal", "appendsToAdvanceSuffix", "getAppendsToAdvanceSuffix", "Swift_appendsToAdvanceSuffix", "line", "getLine", "Swift_line", "spreadTotalSuffix", "getSpreadTotalSuffix", "Swift_spreadTotalSuffix", "sportsMarketTypeRaw", "getSportsMarketTypeRaw", "Swift_sportsMarketTypeRaw", "isWholeGameTotal", "Swift_isWholeGameTotal", "titleShort", "getTitleShort", "Swift_titleShort", "sportsMarketType", "Lcom/polymarket/data/EMarket$SportsMarketType;", "getSportsMarketType", "()Lcom/polymarket/data/EMarket$SportsMarketType;", "Swift_sportsMarketType", "isTeamWinnerMarket", "Swift_isTeamWinnerMarket", "substituteTeamNameForMarketTitle", "getSubstituteTeamNameForMarketTitle", "Swift_substituteTeamNameForMarketTitle", "statLabel", "getStatLabel", "Swift_statLabel", "substitutedPlayerName", "getSubstitutedPlayerName", "Swift_substitutedPlayerName", "isDecimalizedMarket", "Swift_isDecimalizedMarket", "isTerminal", "Swift_isTerminal", "resolutionPhase", "Lcom/polymarket/data/EMarket$ResolutionPhase;", "getResolutionPhase", "()Lcom/polymarket/data/EMarket$ResolutionPhase;", "Swift_resolutionPhase", "hasResolutionStatus", "getHasResolutionStatus", "Swift_hasResolutionStatus", "hasEnteredResolution", "getHasEnteredResolution", "Swift_hasEnteredResolution", "displayPrice", "Lcom/polymarket/data/EAmount;", "isForLongMarketSide", "Swift_displayPrice_12", "displayBidPrice", "Swift_displayBidPrice_13", "displayProbability", "(Z)Ljava/lang/Double;", "Swift_displayProbability_14", "(JZ)Ljava/lang/Double;", "chartInitialProbability", "Swift_chartInitialProbability_15", "isTradableForMarketSide", "Swift_isTradableForMarketSide_16", "isBlockedByNoLiquidity", "Swift_isBlockedByNoLiquidity_17", "sideToggleDestination", TicketDetailDestinationKt.LAUNCHED_FROM, "Swift_sideToggleDestination_18", "resolvedSideAmount", "Swift_resolvedSideAmount_19", "formattedPriceForMarketSide", "format", "Lcom/polymarket/data/OddsFormat;", "Swift_formattedPriceForMarketSide_20", "resolution", "Lcom/polymarket/data/EMarket$Resolution;", "Swift_resolution_21", "sideResult", "Lcom/polymarket/data/EMarket$SideResult;", "Swift_sideResult_22", "marketSide", "resolutionBadgeLabel", "getResolutionBadgeLabel", "Swift_resolutionBadgeLabel", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "UIType", "ResolutionPhase", "Resolution", "SideResult", "StandardMarket", "SportsMarketType", "SportsMarket", "MarketSide", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EMarket implements SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String untradeablePlaceholder = "–";
    private long Swift_peer;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\bH\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ¼\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\b¹\u0001º\u0001»\u0001¼\u0001B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0095\u0001\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u001fB\u0011\b\u0012\u0012\u0006\u0010 \u001a\u00020\u0001¢\u0006\u0004\b\t\u0010!J\u0006\u0010&\u001a\u00020'J\u0015\u0010(\u001a\u00020'2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010)\u001a\u00020\u001a2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020\u0018H\u0016J\u0015\u00102\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u00103\u001a\u00020'2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u00104\u001a\u00020\fH\u0082 J\u0015\u00107\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u00108\u001a\u00020'2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u00104\u001a\u00020\fH\u0082 J\u0015\u0010=\u001a\u00020\u000f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010>\u001a\u00020'2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u00104\u001a\u00020\u000fH\u0082 J\u0017\u0010C\u001a\u0004\u0018\u00010\u00112\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010D\u001a\u00020'2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u00104\u001a\u0004\u0018\u00010\u0011H\u0082 J\u0017\u0010G\u001a\u0004\u0018\u00010\u00112\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010H\u001a\u00020'2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u00104\u001a\u0004\u0018\u00010\u0011H\u0082 J\u0017\u0010K\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010L\u001a\u00020'2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u00104\u001a\u0004\u0018\u00010\fH\u0082 J\u0015\u0010Q\u001a\u00020\u00162\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010R\u001a\u00020'2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u00104\u001a\u00020\u0016H\u0082 J\u001c\u0010W\u001a\u0004\u0018\u00010\u00182\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010XJ$\u0010Y\u001a\u00020'2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u00104\u001a\u0004\u0018\u00010\u0018H\u0082 ¢\u0006\u0002\u0010ZJ\u0015\u0010_\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010`\u001a\u00020'2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u00104\u001a\u00020\u001aH\u0082 J\u001c\u0010e\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010fJ$\u0010g\u001a\u00020'2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u00104\u001a\u0004\u0018\u00010\u001aH\u0082 ¢\u0006\u0002\u0010hJ\u0017\u0010m\u001a\u0004\u0018\u00010\u001d2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010n\u001a\u00020'2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u00104\u001a\u0004\u0018\u00010\u001dH\u0082 J\u0017\u0010q\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010r\u001a\u00020'2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u00104\u001a\u0004\u0018\u00010\fH\u0082 J\u0015\u0010w\u001a\u00020t2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010z\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u000e\u0010{\u001a\u00020\u001a2\u0006\u0010|\u001a\u00020}J\u001d\u0010~\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u007f\u001a\u00020}H\u0082 J\u0016\u0010\u0081\u0001\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0010\u0010\u0082\u0001\u001a\u00020\f2\u0007\u0010\u0083\u0001\u001a\u00020\fJ\u001f\u0010\u0084\u0001\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010\u0085\u0001\u001a\u00020\fH\u0082 J\u0019\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0087\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u008d\u0001\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u0090\u0001\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010\u0095\u0001\u001a\u00030\u0092\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u008c\u0001\u0010\u0096\u0001\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\fH\u0082 ¢\u0006\u0003\u0010\u0097\u0001J\u001a\u0010\u0098\u0001\u001a\u00030\u0099\u00012\u0007\u0010\u009a\u0001\u001a\u00020}2\u0007\u0010\u009b\u0001\u001a\u00020\u001aJ(\u0010\u009c\u0001\u001a\u00030\u0099\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u007f\u001a\u00020}2\u0007\u0010\u009b\u0001\u001a\u00020\u001aH\u0082 J\u0011\u0010\u009d\u0001\u001a\u0004\u0018\u00010\f2\u0006\u0010|\u001a\u00020}J \u0010\u009e\u0001\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u007f\u001a\u00020}H\u0082 J\u0017\u0010£\u0001\u001a\u00030 \u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010¤\u0001\u001a\u00030¥\u00012\f\b\u0002\u0010¦\u0001\u001a\u0005\u0018\u00010\u0087\u0001J#\u0010§\u0001\u001a\u00030¥\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\n\u0010¦\u0001\u001a\u0005\u0018\u00010\u0087\u0001H\u0082 J\u0016\u0010¨\u0001\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010 \u001a\u00020\u0001H\u0082 J\t\u0010´\u0001\u001a\u00020\u0001H\u0016J\u0019\u0010µ\u0001\u001a\t\u0012\u0004\u0012\u00020+0¶\u00012\u0007\u0010·\u0001\u001a\u00020\u0018H\u0016J\u001a\u0010¸\u0001\u001a\t\u0012\u0004\u0012\u00020+0¶\u00012\u0007\u0010·\u0001\u001a\u00020\u0018H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\u000b\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010\r\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010/\"\u0004\b6\u00101R$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R(\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010-\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR(\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010-\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010@\"\u0004\bF\u0010BR(\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010-\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010/\"\u0004\bJ\u00101R$\u0010\u0014\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR(\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010-\u001a\u0004\u0018\u00010\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R(\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010-\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR(\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010-\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR(\u0010\u001e\u001a\u0004\u0018\u00010\f2\b\u0010-\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bo\u0010/\"\u0004\bp\u00101R\u0011\u0010s\u001a\u00020t8F¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0011\u0010x\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\by\u0010/R\u0013\u0010\u0080\u0001\u001a\u00020\u001a8F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\\R\u0017\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0087\u00018F¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0013\u0010\u008b\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010/R\u0013\u0010\u008e\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010/R\u0015\u0010\u0091\u0001\u001a\u00030\u0092\u00018F¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0015\u0010\u009f\u0001\u001a\u00030 \u00018F¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R.\u0010©\u0001\u001a\u0011\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020'\u0018\u00010ª\u0001X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R\u001f\u0010¯\u0001\u001a\u00020\u0018X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001¨\u0006½\u0001"}, d2 = {"Lcom/polymarket/data/EMarket$MarketSide;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "marketSlug", "marketType", "Lcom/polymarket/data/APIMarketType;", "createdAt", "Ljava/util/Date;", "updatedAt", "description", "price", "quote", "Lcom/polymarket/data/EAmount;", "marketId", "", "long", "", "tradable", "team", "Lcom/polymarket/data/ESportsTeam;", "image", "(Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/APIMarketType;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/EAmount;Ljava/lang/Integer;ZLjava/lang/Boolean;Lcom/polymarket/data/ESportsTeam;Ljava/lang/String;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "other", "", "hashCode", "newValue", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Swift_id", "Swift_id_set", "value", "getMarketSlug", "setMarketSlug", "Swift_marketSlug", "Swift_marketSlug_set", "getMarketType", "()Lcom/polymarket/data/APIMarketType;", "setMarketType", "(Lcom/polymarket/data/APIMarketType;)V", "Swift_marketType", "Swift_marketType_set", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "Swift_createdAt", "Swift_createdAt_set", "getUpdatedAt", "setUpdatedAt", "Swift_updatedAt", "Swift_updatedAt_set", "getDescription", "setDescription", "Swift_description", "Swift_description_set", "getPrice", "()Lcom/polymarket/data/EAmount;", "setPrice", "(Lcom/polymarket/data/EAmount;)V", "Swift_price", "Swift_price_set", "getMarketId", "()Ljava/lang/Integer;", "setMarketId", "(Ljava/lang/Integer;)V", "Swift_marketId", "(J)Ljava/lang/Integer;", "Swift_marketId_set", "(JLjava/lang/Integer;)V", "getLong", "()Z", "setLong", "(Z)V", "Swift_long", "Swift_long_set", "getTradable", "()Ljava/lang/Boolean;", "setTradable", "(Ljava/lang/Boolean;)V", "Swift_tradable", "(J)Ljava/lang/Boolean;", "Swift_tradable_set", "(JLjava/lang/Boolean;)V", "getTeam", "()Lcom/polymarket/data/ESportsTeam;", "setTeam", "(Lcom/polymarket/data/ESportsTeam;)V", "Swift_team", "Swift_team_set", "getImage", "setImage", "Swift_image", "Swift_image_set", "type", "Lcom/polymarket/data/EMarket$MarketSide$MarketSideType;", "getType", "()Lcom/polymarket/data/EMarket$MarketSide$MarketSideType;", "Swift_type", "toggleLabel", "getToggleLabel", "Swift_toggleLabel", "isAffirmative", "in_", "Lcom/polymarket/data/EMarket;", "Swift_isAffirmative_0", "market", "isTradableSide", "Swift_isTradableSide", "positionId", "forUserId", "Swift_positionId_1", "userId", "imageURL", "Ljava/net/URI;", "getImageURL", "()Ljava/net/URI;", "Swift_imageURL", "cardDisplayName", "getCardDisplayName", "Swift_cardDisplayName", "participantDisplayName", "getParticipantDisplayName", "Swift_participantDisplayName", "marketColor", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "getMarketColor", "()Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "Swift_marketColor", "Swift_constructor_2", "(Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/APIMarketType;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/EAmount;Ljava/lang/Integer;ZLjava/lang/Boolean;Lcom/polymarket/data/ESportsTeam;Ljava/lang/String;)J", "probabilityDisplay", "Lcom/polymarket/data/EMarket$MarketSide$ProbabilityDisplay;", "for_", "isFinished", "Swift_probabilityDisplay_3", "resolvedSideLabel", "Swift_resolvedSideLabel_4", "color", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "getColor", "()Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "Swift_color", "defaultDisplayContext", "Lcom/polymarket/data/EMarket$MarketSide$DisplayContext;", "eventImageURL", "Swift_defaultDisplayContext_5", "Swift_constructor_6", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "MarketSideType", "ProbabilityDisplay", "DisplayContext", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MarketSide implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
            	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        public /* synthetic */ MarketSide(java.lang.String r17, java.lang.String r18, com.polymarket.data.APIMarketType r19, java.util.Date r20, java.util.Date r21, java.lang.String r22, java.lang.String r23, com.polymarket.data.EAmount r24, java.lang.Integer r25, boolean r26, java.lang.Boolean r27, com.polymarket.data.ESportsTeam r28, java.lang.String r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
            /*
                r16 = this;
                r0 = r30
                r1 = r0 & 2
                if (r1 == 0) goto La
                java.lang.String r1 = ""
                r4 = r1
                goto Lc
            La:
                r4 = r18
            Lc:
                r1 = r0 & 4
                if (r1 == 0) goto L14
                com.polymarket.data.APIMarketType r1 = com.polymarket.data.APIMarketType.moneyline
                r5 = r1
                goto L16
            L14:
                r5 = r19
            L16:
                r1 = r0 & 8
                r2 = 0
                if (r1 == 0) goto L1d
                r6 = r2
                goto L1f
            L1d:
                r6 = r20
            L1f:
                r1 = r0 & 16
                if (r1 == 0) goto L25
                r7 = r2
                goto L27
            L25:
                r7 = r21
            L27:
                r1 = r0 & 32
                if (r1 == 0) goto L2d
                r8 = r2
                goto L2f
            L2d:
                r8 = r22
            L2f:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L35
                r10 = r2
                goto L37
            L35:
                r10 = r24
            L37:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L3d
                r11 = r2
                goto L3f
            L3d:
                r11 = r25
            L3f:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L45
                r13 = r2
                goto L47
            L45:
                r13 = r27
            L47:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                if (r1 == 0) goto L4d
                r14 = r2
                goto L4f
            L4d:
                r14 = r28
            L4f:
                r0 = r0 & 4096(0x1000, float:5.74E-42)
                if (r0 == 0) goto L5d
                r15 = r2
                r3 = r17
                r9 = r23
                r12 = r26
                r2 = r16
                goto L67
            L5d:
                r15 = r29
                r2 = r16
                r3 = r17
                r9 = r23
                r12 = r26
            L67:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.polymarket.data.EMarket.MarketSide.<init>(java.lang.String, java.lang.String, com.polymarket.data.APIMarketType, java.util.Date, java.util.Date, java.lang.String, java.lang.String, com.polymarket.data.EAmount, java.lang.Integer, boolean, java.lang.Boolean, com.polymarket.data.ESportsTeam, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        private final native String Swift_cardDisplayName(long Swift_peer);

        private final native DesignTokens.SemanticColor Swift_color(long Swift_peer);

        private final native long Swift_constructor_2(String id, String marketSlug, APIMarketType marketType, Date createdAt, Date updatedAt, String description, String price, EAmount quote, Integer marketId, boolean r10, Boolean tradable, ESportsTeam team, String image);

        private final native long Swift_constructor_6(MutableStruct copy);

        private final native Date Swift_createdAt(long Swift_peer);

        private final native void Swift_createdAt_set(long Swift_peer, Date value);

        private final native DisplayContext Swift_defaultDisplayContext_5(long Swift_peer, URI eventImageURL);

        private final native String Swift_description(long Swift_peer);

        private final native void Swift_description_set(long Swift_peer, String value);

        private final native String Swift_id(long Swift_peer);

        private final native void Swift_id_set(long Swift_peer, String value);

        private final native String Swift_image(long Swift_peer);

        private final native URI Swift_imageURL(long Swift_peer);

        private final native void Swift_image_set(long Swift_peer, String value);

        private final native boolean Swift_isAffirmative_0(long Swift_peer, EMarket market);

        private final native boolean Swift_isTradableSide(long Swift_peer);

        private final native boolean Swift_long(long Swift_peer);

        private final native void Swift_long_set(long Swift_peer, boolean value);

        private final native DesignTokens.PaletteColor Swift_marketColor(long Swift_peer);

        private final native Integer Swift_marketId(long Swift_peer);

        private final native void Swift_marketId_set(long Swift_peer, Integer value);

        private final native String Swift_marketSlug(long Swift_peer);

        private final native void Swift_marketSlug_set(long Swift_peer, String value);

        private final native APIMarketType Swift_marketType(long Swift_peer);

        private final native void Swift_marketType_set(long Swift_peer, APIMarketType value);

        private final native String Swift_participantDisplayName(long Swift_peer);

        private final native String Swift_positionId_1(long Swift_peer, String userId);

        private final native EAmount Swift_price(long Swift_peer);

        private final native void Swift_price_set(long Swift_peer, EAmount value);

        private final native ProbabilityDisplay Swift_probabilityDisplay_3(long Swift_peer, EMarket market, boolean isFinished);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_resolvedSideLabel_4(long Swift_peer, EMarket market);

        private final native ESportsTeam Swift_team(long Swift_peer);

        private final native void Swift_team_set(long Swift_peer, ESportsTeam value);

        private final native String Swift_toggleLabel(long Swift_peer);

        private final native Boolean Swift_tradable(long Swift_peer);

        private final native void Swift_tradable_set(long Swift_peer, Boolean value);

        private final native MarketSideType Swift_type(long Swift_peer);

        private final native Date Swift_updatedAt(long Swift_peer);

        private final native void Swift_updatedAt_set(long Swift_peer, Date value);

        public static /* synthetic */ DisplayContext defaultDisplayContext$default(MarketSide marketSide, URI uri, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = null;
            }
            return marketSide.defaultDisplayContext(uri);
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

        public final DisplayContext defaultDisplayContext(URI eventImageURL) {
            return Swift_defaultDisplayContext_5(this.Swift_peer, eventImageURL);
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

        public final String getCardDisplayName() {
            return Swift_cardDisplayName(this.Swift_peer);
        }

        public final DesignTokens.SemanticColor getColor() {
            return Swift_color(this.Swift_peer);
        }

        public final Date getCreatedAt() {
            return Swift_createdAt(this.Swift_peer);
        }

        public final String getDescription() {
            return Swift_description(this.Swift_peer);
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

        public final boolean getLong() {
            return Swift_long(this.Swift_peer);
        }

        public final DesignTokens.PaletteColor getMarketColor() {
            return Swift_marketColor(this.Swift_peer);
        }

        public final Integer getMarketId() {
            return Swift_marketId(this.Swift_peer);
        }

        public final String getMarketSlug() {
            return Swift_marketSlug(this.Swift_peer);
        }

        public final APIMarketType getMarketType() {
            return Swift_marketType(this.Swift_peer);
        }

        public final String getParticipantDisplayName() {
            return Swift_participantDisplayName(this.Swift_peer);
        }

        public final EAmount getPrice() {
            return Swift_price(this.Swift_peer);
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

        public final ESportsTeam getTeam() {
            return Swift_team(this.Swift_peer);
        }

        public final String getToggleLabel() {
            return Swift_toggleLabel(this.Swift_peer);
        }

        public final Boolean getTradable() {
            return Swift_tradable(this.Swift_peer);
        }

        public final MarketSideType getType() {
            return Swift_type(this.Swift_peer);
        }

        public final Date getUpdatedAt() {
            return Swift_updatedAt(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final boolean isAffirmative(EMarket in_) {
            in_.getClass();
            return Swift_isAffirmative_0(this.Swift_peer, in_);
        }

        public final boolean isTradableSide() {
            return Swift_isTradableSide(this.Swift_peer);
        }

        public final String positionId(String forUserId) {
            forUserId.getClass();
            return Swift_positionId_1(this.Swift_peer, forUserId);
        }

        public final ProbabilityDisplay probabilityDisplay(EMarket for_, boolean isFinished) {
            for_.getClass();
            return Swift_probabilityDisplay_3(this.Swift_peer, for_, isFinished);
        }

        public final String resolvedSideLabel(EMarket in_) {
            in_.getClass();
            return Swift_resolvedSideLabel_4(this.Swift_peer, in_);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new MarketSide(this);
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

        public final void setDescription(String str) {
            willmutate();
            try {
                Swift_description_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
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

        public final void setLong(boolean z) {
            willmutate();
            try {
                Swift_long_set(this.Swift_peer, z);
            } finally {
                didmutate();
            }
        }

        public final void setMarketId(Integer num) {
            willmutate();
            try {
                Swift_marketId_set(this.Swift_peer, num);
            } finally {
                didmutate();
            }
        }

        public final void setMarketSlug(String str) {
            str.getClass();
            willmutate();
            try {
                Swift_marketSlug_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setMarketType(APIMarketType aPIMarketType) {
            aPIMarketType.getClass();
            willmutate();
            try {
                Swift_marketType_set(this.Swift_peer, aPIMarketType);
            } finally {
                didmutate();
            }
        }

        public final void setPrice(EAmount eAmount) {
            eAmount.getClass();
            EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
            willmutate();
            try {
                Swift_price_set(this.Swift_peer, eAmount2);
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

        public final void setTeam(ESportsTeam eSportsTeam) {
            ESportsTeam eSportsTeam2 = (ESportsTeam) StructKt.sref$default(eSportsTeam, null, 1, null);
            willmutate();
            try {
                Swift_team_set(this.Swift_peer, eSportsTeam2);
            } finally {
                didmutate();
            }
        }

        public final void setTradable(Boolean bool) {
            willmutate();
            try {
                Swift_tradable_set(this.Swift_peer, bool);
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

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0002FGB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBE\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\b\u0010\u0015J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0015\u0010\u001c\u001a\u00020\u001b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\"\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010$\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010'\u001a\u0004\u0018\u00010\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010*\u001a\u0004\u0018\u00010\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010,\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JC\u0010-\u001a\u00060\u0004j\u0002`\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0082 J\u0015\u00102\u001a\u00020/2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00105\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00108\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0013\u00109\u001a\u00020\u00142\b\u0010:\u001a\u0004\u0018\u00010;H\u0096\u0002J\u0019\u0010<\u001a\u00020\u00142\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0000H\u0082 J\b\u0010?\u001a\u00020@H\u0016J\u0015\u0010A\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020;0C2\u0006\u0010D\u001a\u00020@H\u0016J\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020;0C2\u0006\u0010D\u001a\u00020@H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010+R\u0011\u0010.\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00103\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b4\u0010!R\u0013\u00106\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b7\u0010!¨\u0006H"}, d2 = {"Lcom/polymarket/data/EMarket$MarketSide$DisplayContext;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "sideLabel", "Lcom/polymarket/data/EMarket$MarketSide$DisplayContext$SideLabel;", "shortDescription", "", "longDescription", "imageContext", "Lcom/polymarket/data/EMarketImageContext;", "accentColor", "Lcom/polymarket/designtokens/HexColorPair;", "isAffirmativeSide", "", "(Lcom/polymarket/data/EMarket$MarketSide$DisplayContext$SideLabel;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/EMarketImageContext;Lcom/polymarket/designtokens/HexColorPair;Z)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getSideLabel", "()Lcom/polymarket/data/EMarket$MarketSide$DisplayContext$SideLabel;", "Swift_sideLabel", "getShortDescription", "()Ljava/lang/String;", "Swift_shortDescription", "getLongDescription", "Swift_longDescription", "getImageContext", "()Lcom/polymarket/data/EMarketImageContext;", "Swift_imageContext", "getAccentColor", "()Lcom/polymarket/designtokens/HexColorPair;", "Swift_accentColor", "()Z", "Swift_isAffirmativeSide", "Swift_constructor_0", "marketColor", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "getMarketColor", "()Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "Swift_marketColor", "toggleLabel", "getToggleLabel", "Swift_toggleLabel", "descriptionPrefix", "getDescriptionPrefix", "Swift_descriptionPrefix", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "SideLabel", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class DisplayContext implements SwiftPeerBridged, SwiftProjecting {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final String descriptionPrefixSeparator = " · ";
            private long Swift_peer;

            public DisplayContext(SideLabel sideLabel, String str, String str2, EMarketImageContext eMarketImageContext, HexColorPair hexColorPair, boolean z) {
                str.getClass();
                str2.getClass();
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = Swift_constructor_0(sideLabel, str, str2, eMarketImageContext, hexColorPair, z);
            }

            private final native HexColorPair Swift_accentColor(long Swift_peer);

            private final native long Swift_constructor_0(SideLabel sideLabel, String shortDescription, String longDescription, EMarketImageContext imageContext, HexColorPair accentColor, boolean isAffirmativeSide);

            private final native String Swift_descriptionPrefix(long Swift_peer);

            private final native long Swift_hashvalue(long Swift_peer);

            private final native EMarketImageContext Swift_imageContext(long Swift_peer);

            private final native boolean Swift_isAffirmativeSide(long Swift_peer);

            private final native boolean Swift_isequal(DisplayContext lhs, DisplayContext rhs);

            private final native String Swift_longDescription(long Swift_peer);

            private final native DesignTokens.PaletteColor Swift_marketColor(long Swift_peer);

            private final native Function0<Object> Swift_projectionImpl(int options);

            private final native void Swift_release(long Swift_peer);

            private final native String Swift_shortDescription(long Swift_peer);

            private final native SideLabel Swift_sideLabel(long Swift_peer);

            private final native String Swift_toggleLabel(long Swift_peer);

            public static final /* synthetic */ String access$getDescriptionPrefixSeparator$cp() {
                return descriptionPrefixSeparator;
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
                if (other == this) {
                    return true;
                }
                if (!(other instanceof DisplayContext)) {
                    return false;
                }
                return Swift_isequal(this, (DisplayContext) other);
            }

            public final void finalize() {
                Swift_release(this.Swift_peer);
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            }

            public final HexColorPair getAccentColor() {
                return Swift_accentColor(this.Swift_peer);
            }

            public final String getDescriptionPrefix() {
                return Swift_descriptionPrefix(this.Swift_peer);
            }

            public final EMarketImageContext getImageContext() {
                return Swift_imageContext(this.Swift_peer);
            }

            public final String getLongDescription() {
                return Swift_longDescription(this.Swift_peer);
            }

            public final DesignTokens.PaletteColor getMarketColor() {
                return Swift_marketColor(this.Swift_peer);
            }

            public final String getShortDescription() {
                return Swift_shortDescription(this.Swift_peer);
            }

            public final SideLabel getSideLabel() {
                return Swift_sideLabel(this.Swift_peer);
            }

            public final long getSwift_peer() {
                return this.Swift_peer;
            }

            public final String getToggleLabel() {
                return Swift_toggleLabel(this.Swift_peer);
            }

            public int hashCode() {
                return Long.hashCode(Swift_hashvalue(this.Swift_peer));
            }

            public final boolean isAffirmativeSide() {
                return Swift_isAffirmativeSide(this.Swift_peer);
            }

            public final void setSwift_peer(long j) {
                this.Swift_peer = j;
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u001eB\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0082 J\u0011\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0002H\u0082 J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016j\u0002\b\fj\u0002\b\r¨\u0006\u001f"}, d2 = {"Lcom/polymarket/data/EMarket$MarketSide$DisplayContext$SideLabel;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "yes", "no", "isAffirmative", "", "()Z", "Swift_isAffirmative", Keys.KEY_NAME, "paletteColor", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "getPaletteColor", "()Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "Swift_paletteColor", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class SideLabel implements RawRepresentable<String>, SwiftProjecting {
                private static final /* synthetic */ ug7 $ENTRIES;
                private static final /* synthetic */ SideLabel[] $VALUES;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private final String rawValue;
                public static final SideLabel yes = new SideLabel("yes", 0, "Yes", null, 2, null);
                public static final SideLabel no = new SideLabel("no", 1, "No", null, 2, null);

                private static final /* synthetic */ SideLabel[] $values() {
                    return new SideLabel[]{yes, no};
                }

                static {
                    SideLabel[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = ww4.b($values);
                    INSTANCE = new Companion(null);
                }

                public /* synthetic */ SideLabel(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, i, str2, (i2 & 2) != 0 ? null : r4);
                }

                private final native boolean Swift_isAffirmative(String name);

                private final native DesignTokens.PaletteColor Swift_paletteColor(String name);

                private final native Function0<Object> Swift_projectionImpl(int options);

                public static ug7 getEntries() {
                    return $ENTRIES;
                }

                public static SideLabel valueOf(String str) {
                    return (SideLabel) Enum.valueOf(SideLabel.class, str);
                }

                public static SideLabel[] values() {
                    return (SideLabel[]) $VALUES.clone();
                }

                @Override // skip.lib.SwiftProjecting
                public Function0<Object> Swift_projection(int options) {
                    return Swift_projectionImpl(options);
                }

                public final DesignTokens.PaletteColor getPaletteColor() {
                    return Swift_paletteColor(name());
                }

                @Override // skip.lib.RawRepresentable
                public /* bridge */ /* synthetic */ String getRawValue() {
                    return getRawValue();
                }

                public final boolean isAffirmative() {
                    return Swift_isAffirmative(name());
                }

                /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EMarket$MarketSide$DisplayContext$SideLabel$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EMarket$MarketSide$DisplayContext$SideLabel;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* loaded from: classes4.dex */
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final SideLabel init(String rawValue) {
                        rawValue.getClass();
                        if (Intrinsics.areEqual(rawValue, "Yes")) {
                            return SideLabel.yes;
                        }
                        if (Intrinsics.areEqual(rawValue, "No")) {
                            return SideLabel.no;
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

                private SideLabel(String str, int i, String str2, Void r4) {
                    this.rawValue = str2;
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\b\u001a\u00020\u0005H\u0082 J\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/polymarket/data/EMarket$MarketSide$DisplayContext$Companion;", "", "<init>", "()V", "empty", "Lcom/polymarket/data/EMarket$MarketSide$DisplayContext;", "getEmpty", "()Lcom/polymarket/data/EMarket$MarketSide$DisplayContext;", "Swift_Companion_empty", "descriptionPrefixSeparator", "", "getDescriptionPrefixSeparator", "()Ljava/lang/String;", "SideLabel", "Lcom/polymarket/data/EMarket$MarketSide$DisplayContext$SideLabel;", "rawValue", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private final native DisplayContext Swift_Companion_empty();

                public final SideLabel SideLabel(String rawValue) {
                    rawValue.getClass();
                    return SideLabel.INSTANCE.init(rawValue);
                }

                public final String getDescriptionPrefixSeparator() {
                    return DisplayContext.access$getDescriptionPrefixSeparator$cp();
                }

                public final DisplayContext getEmpty() {
                    return Swift_Companion_empty();
                }

                private Companion() {
                }
            }

            public DisplayContext(long j, SwiftPeerMarker swiftPeerMarker) {
                BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = j;
            }

            public /* synthetic */ DisplayContext(SideLabel sideLabel, String str, String str2, EMarketImageContext eMarketImageContext, HexColorPair hexColorPair, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(sideLabel, str, str2, (i & 8) != 0 ? null : eMarketImageContext, (i & 16) != 0 ? null : hexColorPair, (i & 32) != 0 ? true : z);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u001bB\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0002H\u0082 J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u001c"}, d2 = {"Lcom/polymarket/data/EMarket$MarketSide$MarketSideType;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "yes", "no", "unknown", "paletteColor", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "getPaletteColor", "()Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "Swift_paletteColor", Keys.KEY_NAME, "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class MarketSideType implements RawRepresentable<String>, SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ MarketSideType[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final String rawValue;
            public static final MarketSideType yes = new MarketSideType("yes", 0, "Yes", null, 2, null);
            public static final MarketSideType no = new MarketSideType("no", 1, "No", null, 2, null);
            public static final MarketSideType unknown = new MarketSideType("unknown", 2, "Unknown", null, 2, null);

            private static final /* synthetic */ MarketSideType[] $values() {
                return new MarketSideType[]{yes, no, unknown};
            }

            static {
                MarketSideType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = ww4.b($values);
                INSTANCE = new Companion(null);
            }

            public /* synthetic */ MarketSideType(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, str2, (i2 & 2) != 0 ? null : r4);
            }

            private final native DesignTokens.PaletteColor Swift_paletteColor(String name);

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static ug7 getEntries() {
                return $ENTRIES;
            }

            public static MarketSideType valueOf(String str) {
                return (MarketSideType) Enum.valueOf(MarketSideType.class, str);
            }

            public static MarketSideType[] values() {
                return (MarketSideType[]) $VALUES.clone();
            }

            @Override // skip.lib.SwiftProjecting
            public Function0<Object> Swift_projection(int options) {
                return Swift_projectionImpl(options);
            }

            public final DesignTokens.PaletteColor getPaletteColor() {
                return Swift_paletteColor(name());
            }

            @Override // skip.lib.RawRepresentable
            public /* bridge */ /* synthetic */ String getRawValue() {
                return getRawValue();
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EMarket$MarketSide$MarketSideType$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EMarket$MarketSide$MarketSideType;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final MarketSideType init(String rawValue) {
                    rawValue.getClass();
                    int hashCode = rawValue.hashCode();
                    if (hashCode != 2529) {
                        if (hashCode != 88775) {
                            if (hashCode == 1379812394 && rawValue.equals("Unknown")) {
                                return MarketSideType.unknown;
                            }
                            return null;
                        }
                        if (rawValue.equals("Yes")) {
                            return MarketSideType.yes;
                        }
                        return null;
                    }
                    if (!rawValue.equals("No")) {
                        return null;
                    }
                    return MarketSideType.no;
                }

                private Companion() {
                }
            }

            @Override // skip.lib.RawRepresentable
            public String getRawValue() {
                return this.rawValue;
            }

            private MarketSideType(String str, int i, String str2, Void r4) {
                this.rawValue = str2;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\u0004\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 ¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/polymarket/data/EMarket$MarketSide$ProbabilityDisplay;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "displayValue", "", "getDisplayValue", "()Ljava/lang/Double;", "Swift_displayValue", "className", "", "(Ljava/lang/String;)Ljava/lang/Double;", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "ResolvedCase", "TradableCase", "UnavailableCase", "Companion", "Lcom/polymarket/data/EMarket$MarketSide$ProbabilityDisplay$ResolvedCase;", "Lcom/polymarket/data/EMarket$MarketSide$ProbabilityDisplay$TradableCase;", "Lcom/polymarket/data/EMarket$MarketSide$ProbabilityDisplay$UnavailableCase;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static abstract class ProbabilityDisplay implements SwiftProjecting {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final ProbabilityDisplay unavailable = new UnavailableCase();

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EMarket$MarketSide$ProbabilityDisplay$ResolvedCase;", "Lcom/polymarket/data/EMarket$MarketSide$ProbabilityDisplay;", "associated0", "", "<init>", "(D)V", "getAssociated0", "()D", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class ResolvedCase extends ProbabilityDisplay {
                private final double associated0;

                public ResolvedCase(double d) {
                    super(null);
                    this.associated0 = d;
                }

                public final double getAssociated0() {
                    return this.associated0;
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EMarket$MarketSide$ProbabilityDisplay$TradableCase;", "Lcom/polymarket/data/EMarket$MarketSide$ProbabilityDisplay;", "associated0", "", "<init>", "(D)V", "getAssociated0", "()D", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class TradableCase extends ProbabilityDisplay {
                private final double associated0;

                public TradableCase(double d) {
                    super(null);
                    this.associated0 = d;
                }

                public final double getAssociated0() {
                    return this.associated0;
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/EMarket$MarketSide$ProbabilityDisplay$UnavailableCase;", "Lcom/polymarket/data/EMarket$MarketSide$ProbabilityDisplay;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class UnavailableCase extends ProbabilityDisplay {
                public UnavailableCase() {
                    super(null);
                }
            }

            public /* synthetic */ ProbabilityDisplay(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final native Double Swift_displayValue(String className);

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static final /* synthetic */ ProbabilityDisplay access$getUnavailable$cp() {
                return unavailable;
            }

            @Override // skip.lib.SwiftProjecting
            public Function0<Object> Swift_projection(int options) {
                return Swift_projectionImpl(options);
            }

            public final Double getDisplayValue() {
                return Swift_displayValue(getClass().getName());
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/data/EMarket$MarketSide$ProbabilityDisplay$Companion;", "", "<init>", "()V", "resolved", "Lcom/polymarket/data/EMarket$MarketSide$ProbabilityDisplay;", "associated0", "", "tradable", "unavailable", "getUnavailable", "()Lcom/polymarket/data/EMarket$MarketSide$ProbabilityDisplay;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final ProbabilityDisplay getUnavailable() {
                    return ProbabilityDisplay.access$getUnavailable$cp();
                }

                public final ProbabilityDisplay resolved(double associated0) {
                    return new ResolvedCase(associated0);
                }

                public final ProbabilityDisplay tradable(double associated0) {
                    return new TradableCase(associated0);
                }

                private Companion() {
                }
            }

            private ProbabilityDisplay() {
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EMarket$MarketSide$Companion;", "", "<init>", "()V", "MarketSideType", "Lcom/polymarket/data/EMarket$MarketSide$MarketSideType;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final MarketSideType MarketSideType(String rawValue) {
                rawValue.getClass();
                return MarketSideType.INSTANCE.init(rawValue);
            }

            private Companion() {
            }
        }

        public MarketSide(String str, String str2, APIMarketType aPIMarketType, Date date, Date date2, String str3, String str4, EAmount eAmount, Integer num, boolean z, Boolean bool, ESportsTeam eSportsTeam, String str5) {
            str.getClass();
            str2.getClass();
            aPIMarketType.getClass();
            str4.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_2(str, str2, aPIMarketType, date, date2, str3, str4, eAmount, num, z, bool, eSportsTeam, str5);
        }

        public MarketSide(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private MarketSide(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_6(mutableStruct);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u0010"}, d2 = {"Lcom/polymarket/data/EMarket$Resolution;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "open", "resolvedLong", "resolvedShort", "resolvedUnknown", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Resolution implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Resolution[] $VALUES;
        public static final Resolution open = new Resolution("open", 0);
        public static final Resolution resolvedLong = new Resolution("resolvedLong", 1);
        public static final Resolution resolvedShort = new Resolution("resolvedShort", 2);
        public static final Resolution resolvedUnknown = new Resolution("resolvedUnknown", 3);

        private static final /* synthetic */ Resolution[] $values() {
            return new Resolution[]{open, resolvedLong, resolvedShort, resolvedUnknown};
        }

        static {
            Resolution[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Resolution(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Resolution valueOf(String str) {
            return (Resolution) Enum.valueOf(Resolution.class, str);
        }

        public static Resolution[] values() {
            return (Resolution[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00162\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0082 R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u0017"}, d2 = {"Lcom/polymarket/data/EMarket$SideResult;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "open", "winner", "loser", "unknown", "hasKnownOutcome", "", "getHasKnownOutcome", "()Z", "Swift_hasKnownOutcome", Keys.KEY_NAME, "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SideResult implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ SideResult[] $VALUES;
        public static final SideResult open = new SideResult("open", 0);
        public static final SideResult winner = new SideResult("winner", 1);
        public static final SideResult loser = new SideResult("loser", 2);
        public static final SideResult unknown = new SideResult("unknown", 3);

        private static final /* synthetic */ SideResult[] $values() {
            return new SideResult[]{open, winner, loser, unknown};
        }

        static {
            SideResult[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private SideResult(String str, int i) {
        }

        private final native boolean Swift_hasKnownOutcome(String name);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static SideResult valueOf(String str) {
            return (SideResult) Enum.valueOf(SideResult.class, str);
        }

        public static SideResult[] values() {
            return (SideResult[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final boolean getHasKnownOutcome() {
            return Swift_hasKnownOutcome(name());
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b=\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ¥\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002¥\u0001B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0095\u0002\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001e\u001a\u00020\f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010!\u001a\u00020\f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010$\u001a\u00020%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010+B\u0011\b\u0012\u0012\u0006\u0010,\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010-J\u0006\u00102\u001a\u000203J\u0015\u00104\u001a\u0002032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u00105\u001a\u00020\u000e2\b\u00106\u001a\u0004\u0018\u000107H\u0096\u0002J\b\u00108\u001a\u000209H\u0016J\u0015\u0010<\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001c\u0010?\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010@J\u001c\u0010B\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010@J\u001c\u0010D\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010@J\u0017\u0010J\u001a\u0004\u0018\u00010\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010K\u001a\u0002032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010L\u001a\u0004\u0018\u00010\u0012H\u0082 J\u001c\u0010N\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010@J\u0017\u0010P\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001c\u0010S\u001a\u0004\u0018\u00010\u00162\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010TJ\u0017\u0010V\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001c\u0010[\u001a\u0004\u0018\u00010\u00162\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010TJ\u001c\u0010]\u001a\u0004\u0018\u00010\u00162\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010TJ\u001c\u0010_\u001a\u0004\u0018\u00010\u00162\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010TJ\u0015\u0010a\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010c\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001c\u0010e\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010@J\u0015\u0010g\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010j\u001a\u0004\u0018\u00010#2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010m\u001a\u00020%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010p\u001a\u0004\u0018\u00010'2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010r\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010t\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010v\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010}\u001a\u0004\u0018\u00010w2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010~\u001a\u0002032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010L\u001a\u0004\u0018\u00010wH\u0082 J÷\u0001\u0010\u007f\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001e\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\f2\b\u0010 \u001a\u0004\u0018\u00010\u000e2\u0006\u0010!\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010\f2\b\u0010)\u001a\u0004\u0018\u00010\f2\b\u0010*\u001a\u0004\u0018\u00010\fH\u0082 ¢\u0006\u0003\u0010\u0080\u0001J-\u0010\u0081\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u001a2\f\b\u0002\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0085\u00012\f\b\u0002\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0087\u0001J8\u0010\u0088\u0001\u001a\u00030\u0082\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010\u0089\u0001\u001a\u00020\u001a2\n\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0085\u00012\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0087\u0001H\u0082 J\u0016\u0010\u008c\u0001\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u008e\u0001\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u0090\u0001\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u0093\u0001\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u0094\u0001\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010,\u001a\u00020\u0001H\u0082 J\t\u0010 \u0001\u001a\u00020\u0001H\u0016J\u0019\u0010¡\u0001\u001a\t\u0012\u0004\u0012\u0002070¢\u00012\u0007\u0010£\u0001\u001a\u000209H\u0016J\u001a\u0010¤\u0001\u001a\t\u0012\u0004\u0012\u0002070¢\u00012\u0007\u0010£\u0001\u001a\u000209H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bA\u0010>R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bC\u0010>R(\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010E\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bM\u0010>R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bO\u0010;R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bU\u0010;R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bZ\u0010RR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\\\u0010RR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b^\u0010RR\u0011\u0010\u001e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b`\u0010;R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bb\u0010;R\u0013\u0010 \u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bd\u0010>R\u0011\u0010!\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bf\u0010;R\u0013\u0010\"\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0011\u0010$\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0013\u0010&\u001a\u0004\u0018\u00010'8F¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0013\u0010*\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bq\u0010;R\u0013\u0010(\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bs\u0010;R\u0013\u0010)\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bu\u0010;R(\u0010x\u001a\u0004\u0018\u00010w2\b\u0010E\u001a\u0004\u0018\u00010w8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u0014\u0010\u008a\u0001\u001a\u00020\u000e8F¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0014\u0010\u008d\u0001\u001a\u00020\u000e8F¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008b\u0001R\u0014\u0010\u008f\u0001\u001a\u00020\u000e8F¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u008b\u0001R\u0014\u0010\u0091\u0001\u001a\u00020\u000e8F¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u008b\u0001R.\u0010\u0095\u0001\u001a\u0011\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u000203\u0018\u00010\u0096\u0001X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001f\u0010\u009b\u0001\u001a\u000209X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001¨\u0006¦\u0001"}, d2 = {"Lcom/polymarket/data/EMarket$SportsMarket;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "active", "", "archived", MetricTracker.Action.CLOSED, "status", "Lcom/polymarket/data/APIMarketStatus;", "comboEnabled", "description", "line", "", "spreadTotalSuffix", "marketSides", "", "Lcom/polymarket/data/EMarket$MarketSide;", "orderPriceMinTickSize", "minimumTradeQty", "feeCoefficient", "question", "rulesDisclaimer", "rulesDisclaimerPopup", "slug", "startDate", "Ljava/util/Date;", "marketType", "Lcom/polymarket/data/APIMarketType;", "sportsMarketType", "Lcom/polymarket/data/EMarket$SportsMarketType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "titleShort", "sportsMarketTypeRaw", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/polymarket/data/APIMarketStatus;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Lcom/polymarket/data/APIMarketType;Lcom/polymarket/data/EMarket$SportsMarketType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "other", "", "hashCode", "", "getId", "()Ljava/lang/String;", "Swift_id", "getActive", "()Ljava/lang/Boolean;", "Swift_active", "(J)Ljava/lang/Boolean;", "getArchived", "Swift_archived", "getClosed", "Swift_closed", "newValue", "getStatus", "()Lcom/polymarket/data/APIMarketStatus;", "setStatus", "(Lcom/polymarket/data/APIMarketStatus;)V", "Swift_status", "Swift_status_set", "value", "getComboEnabled", "Swift_comboEnabled", "getDescription", "Swift_description", "getLine", "()Ljava/lang/Double;", "Swift_line", "(J)Ljava/lang/Double;", "getSpreadTotalSuffix", "Swift_spreadTotalSuffix", "getMarketSides", "()Ljava/util/List;", "Swift_marketSides", "getOrderPriceMinTickSize", "Swift_orderPriceMinTickSize", "getMinimumTradeQty", "Swift_minimumTradeQty", "getFeeCoefficient", "Swift_feeCoefficient", "getQuestion", "Swift_question", "getRulesDisclaimer", "Swift_rulesDisclaimer", "getRulesDisclaimerPopup", "Swift_rulesDisclaimerPopup", "getSlug", "Swift_slug", "getStartDate", "()Ljava/util/Date;", "Swift_startDate", "getMarketType", "()Lcom/polymarket/data/APIMarketType;", "Swift_marketType", "getSportsMarketType", "()Lcom/polymarket/data/EMarket$SportsMarketType;", "Swift_sportsMarketType", "getSportsMarketTypeRaw", "Swift_sportsMarketTypeRaw", "getTitle", "Swift_title", "getTitleShort", "Swift_titleShort", "Lcom/polymarket/data/EMarketCache;", "marketCache", "getMarketCache", "()Lcom/polymarket/data/EMarketCache;", "setMarketCache", "(Lcom/polymarket/data/EMarketCache;)V", "Swift_marketCache", "Swift_marketCache_set", "Swift_constructor_0", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/polymarket/data/APIMarketStatus;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Lcom/polymarket/data/APIMarketType;Lcom/polymarket/data/EMarket$SportsMarketType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J", "displayContext", "Lcom/polymarket/data/EMarket$MarketSide$DisplayContext;", "for_", "sportSlug", "Lcom/polymarket/data/ESportsSlug;", "eventImageURL", "Ljava/net/URI;", "Swift_displayContext_1", "side", "isMoneyline", "()Z", "Swift_isMoneyline", "isSpread", "Swift_isSpread", "isTotal", "Swift_isTotal", "appendsToAdvanceSuffix", "getAppendsToAdvanceSuffix", "Swift_appendsToAdvanceSuffix", "Swift_constructor_2", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SportsMarket implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        public /* synthetic */ SportsMarket(String str, Boolean bool, Boolean bool2, Boolean bool3, APIMarketStatus aPIMarketStatus, Boolean bool4, String str2, Double d, String str3, List list, Double d2, Double d3, Double d4, String str4, String str5, Boolean bool5, String str6, Date date, APIMarketType aPIMarketType, SportsMarketType sportsMarketType, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : aPIMarketStatus, (i & 32) != 0 ? null : bool4, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : d, (i & 256) != 0 ? null : str3, (i & Barcode.FORMAT_UPC_A) != 0 ? null : list, (i & Barcode.FORMAT_UPC_E) != 0 ? null : d2, (i & 2048) != 0 ? null : d3, (i & 4096) != 0 ? null : d4, str4, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str5, (32768 & i) != 0 ? Boolean.FALSE : bool5, str6, (131072 & i) != 0 ? null : date, (262144 & i) != 0 ? APIMarketType.moneyline : aPIMarketType, (524288 & i) != 0 ? null : sportsMarketType, (1048576 & i) != 0 ? null : str7, (2097152 & i) != 0 ? null : str8, (i & 4194304) != 0 ? null : str9);
        }

        private final native Boolean Swift_active(long Swift_peer);

        private final native boolean Swift_appendsToAdvanceSuffix(long Swift_peer);

        private final native Boolean Swift_archived(long Swift_peer);

        private final native Boolean Swift_closed(long Swift_peer);

        private final native Boolean Swift_comboEnabled(long Swift_peer);

        private final native long Swift_constructor_0(String id, Boolean active, Boolean archived, Boolean closed, APIMarketStatus status, Boolean comboEnabled, String description, Double line, String spreadTotalSuffix, List<MarketSide> marketSides, Double orderPriceMinTickSize, Double minimumTradeQty, Double feeCoefficient, String question, String rulesDisclaimer, Boolean rulesDisclaimerPopup, String slug, Date startDate, APIMarketType marketType, SportsMarketType sportsMarketType, String title, String titleShort, String sportsMarketTypeRaw);

        private final native long Swift_constructor_2(MutableStruct copy);

        private final native String Swift_description(long Swift_peer);

        private final native MarketSide.DisplayContext Swift_displayContext_1(long Swift_peer, MarketSide side, ESportsSlug sportSlug, URI eventImageURL);

        private final native Double Swift_feeCoefficient(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isMoneyline(long Swift_peer);

        private final native boolean Swift_isSpread(long Swift_peer);

        private final native boolean Swift_isTotal(long Swift_peer);

        private final native Double Swift_line(long Swift_peer);

        private final native EMarketCache Swift_marketCache(long Swift_peer);

        private final native void Swift_marketCache_set(long Swift_peer, EMarketCache value);

        private final native List<MarketSide> Swift_marketSides(long Swift_peer);

        private final native APIMarketType Swift_marketType(long Swift_peer);

        private final native Double Swift_minimumTradeQty(long Swift_peer);

        private final native Double Swift_orderPriceMinTickSize(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native String Swift_question(long Swift_peer);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_rulesDisclaimer(long Swift_peer);

        private final native Boolean Swift_rulesDisclaimerPopup(long Swift_peer);

        private final native String Swift_slug(long Swift_peer);

        private final native SportsMarketType Swift_sportsMarketType(long Swift_peer);

        private final native String Swift_sportsMarketTypeRaw(long Swift_peer);

        private final native String Swift_spreadTotalSuffix(long Swift_peer);

        private final native Date Swift_startDate(long Swift_peer);

        private final native APIMarketStatus Swift_status(long Swift_peer);

        private final native void Swift_status_set(long Swift_peer, APIMarketStatus value);

        private final native String Swift_title(long Swift_peer);

        private final native String Swift_titleShort(long Swift_peer);

        public static /* synthetic */ MarketSide.DisplayContext displayContext$default(SportsMarket sportsMarket, MarketSide marketSide, ESportsSlug eSportsSlug, URI uri, int i, Object obj) {
            if ((i & 2) != 0) {
                eSportsSlug = null;
            }
            if ((i & 4) != 0) {
                uri = null;
            }
            return sportsMarket.displayContext(marketSide, eSportsSlug, uri);
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

        public final MarketSide.DisplayContext displayContext(MarketSide for_, ESportsSlug sportSlug, URI eventImageURL) {
            for_.getClass();
            return Swift_displayContext_1(this.Swift_peer, for_, sportSlug, eventImageURL);
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

        public final Boolean getActive() {
            return Swift_active(this.Swift_peer);
        }

        public final boolean getAppendsToAdvanceSuffix() {
            return Swift_appendsToAdvanceSuffix(this.Swift_peer);
        }

        public final Boolean getArchived() {
            return Swift_archived(this.Swift_peer);
        }

        public final Boolean getClosed() {
            return Swift_closed(this.Swift_peer);
        }

        public final Boolean getComboEnabled() {
            return Swift_comboEnabled(this.Swift_peer);
        }

        public final String getDescription() {
            return Swift_description(this.Swift_peer);
        }

        public final Double getFeeCoefficient() {
            return Swift_feeCoefficient(this.Swift_peer);
        }

        public final String getId() {
            return Swift_id(this.Swift_peer);
        }

        public final Double getLine() {
            return Swift_line(this.Swift_peer);
        }

        public final EMarketCache getMarketCache() {
            return Swift_marketCache(this.Swift_peer);
        }

        public final List<MarketSide> getMarketSides() {
            return Swift_marketSides(this.Swift_peer);
        }

        public final APIMarketType getMarketType() {
            return Swift_marketType(this.Swift_peer);
        }

        public final Double getMinimumTradeQty() {
            return Swift_minimumTradeQty(this.Swift_peer);
        }

        public final Double getOrderPriceMinTickSize() {
            return Swift_orderPriceMinTickSize(this.Swift_peer);
        }

        public final String getQuestion() {
            return Swift_question(this.Swift_peer);
        }

        public final String getRulesDisclaimer() {
            return Swift_rulesDisclaimer(this.Swift_peer);
        }

        public final Boolean getRulesDisclaimerPopup() {
            return Swift_rulesDisclaimerPopup(this.Swift_peer);
        }

        public final String getSlug() {
            return Swift_slug(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public int getSmutatingcount() {
            return this.smutatingcount;
        }

        public final SportsMarketType getSportsMarketType() {
            return Swift_sportsMarketType(this.Swift_peer);
        }

        public final String getSportsMarketTypeRaw() {
            return Swift_sportsMarketTypeRaw(this.Swift_peer);
        }

        public final String getSpreadTotalSuffix() {
            return Swift_spreadTotalSuffix(this.Swift_peer);
        }

        public final Date getStartDate() {
            return Swift_startDate(this.Swift_peer);
        }

        public final APIMarketStatus getStatus() {
            return Swift_status(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public Function1<Object, Unit> getSupdate() {
            return this.supdate;
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getTitle() {
            return Swift_title(this.Swift_peer);
        }

        public final String getTitleShort() {
            return Swift_titleShort(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final boolean isMoneyline() {
            return Swift_isMoneyline(this.Swift_peer);
        }

        public final boolean isSpread() {
            return Swift_isSpread(this.Swift_peer);
        }

        public final boolean isTotal() {
            return Swift_isTotal(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new SportsMarket(this);
        }

        public final void setMarketCache(EMarketCache eMarketCache) {
            willmutate();
            try {
                Swift_marketCache_set(this.Swift_peer, eMarketCache);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void setSmutatingcount(int i) {
            this.smutatingcount = i;
        }

        public final void setStatus(APIMarketStatus aPIMarketStatus) {
            willmutate();
            try {
                Swift_status_set(this.Swift_peer, aPIMarketStatus);
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

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        public SportsMarket(String str, Boolean bool, Boolean bool2, Boolean bool3, APIMarketStatus aPIMarketStatus, Boolean bool4, String str2, Double d, String str3, List<MarketSide> list, Double d2, Double d3, Double d4, String str4, String str5, Boolean bool5, String str6, Date date, APIMarketType aPIMarketType, SportsMarketType sportsMarketType, String str7, String str8, String str9) {
            str.getClass();
            str4.getClass();
            str6.getClass();
            aPIMarketType.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, bool, bool2, bool3, aPIMarketStatus, bool4, str2, d, str3, list, d2, d3, d4, str4, str5, bool5, str6, date, aPIMarketType, sportsMarketType, str7, str8, str9);
        }

        public SportsMarket(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private SportsMarket(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_2(mutableStruct);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\bL\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ø\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002ø\u0001B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nBû\u0002\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010(\u001a\u00020\u0015\u0012\u0006\u0010)\u001a\u00020\f\u0012\u0006\u0010*\u001a\u00020\f\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u00108B\u0011\b\u0012\u0012\u0006\u00109\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010:J\u0006\u0010?\u001a\u00020@J\u0015\u0010A\u001a\u00020@2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010B\u001a\u00020\u00152\b\u0010C\u001a\u0004\u0018\u00010DH\u0096\u0002J\b\u0010E\u001a\u00020.H\u0016J\u0015\u0010H\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010K\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010N\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010Q\u001a\u00020\u00102\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010S\u001a\u00020\u00102\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010U\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010W\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010]\u001a\u0004\u0018\u00010\u00192\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010^\u001a\u00020@2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010_\u001a\u0004\u0018\u00010\u0019H\u0082 J\u001c\u0010b\u001a\u0004\u0018\u00010\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010cJ\u0017\u0010f\u001a\u0004\u0018\u00010\u001d2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010h\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010j\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001c\u0010m\u001a\u0004\u0018\u00010!2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010nJ\u0015\u0010p\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010r\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001c\u0010t\u001a\u0004\u0018\u00010!2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010nJ\u001c\u0010v\u001a\u0004\u0018\u00010!2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010nJ\u001c\u0010x\u001a\u0004\u0018\u00010!2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010nJ\u0017\u0010z\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010|\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010\u007f\u001a\u0004\u0018\u00010,2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001e\u0010\u0082\u0001\u001a\u0004\u0018\u00010.2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0003\u0010\u0083\u0001J\u0018\u0010\u0085\u0001\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010\u0087\u0001\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010\u0089\u0001\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010\u008b\u0001\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010\u008d\u0001\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010\u0094\u0001\u001a\u00030\u0091\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u0096\u0001\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010\u0099\u0001\u001a\u0004\u0018\u0001062\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010\u009b\u0001\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010 \u0001\u001a\u0004\u0018\u00010#2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J \u0010¡\u0001\u001a\u00020@2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010_\u001a\u0004\u0018\u00010#H\u0082 JÒ\u0002\u0010¢\u0001\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010!2\b\u0010%\u001a\u0004\u0018\u00010!2\b\u0010&\u001a\u0004\u0018\u00010!2\b\u0010'\u001a\u0004\u0018\u00010\f2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u00010\f2\b\u00100\u001a\u0004\u0018\u00010\f2\b\u00101\u001a\u0004\u0018\u00010\f2\b\u00102\u001a\u0004\u0018\u00010\f2\b\u00103\u001a\u0004\u0018\u00010\f2\b\u00104\u001a\u0004\u0018\u00010\f2\b\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u00010\fH\u0082 ¢\u0006\u0003\u0010£\u0001J\u001d\u0010¨\u0001\u001a\t\u0012\u0004\u0012\u00020\u00100¥\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010\u00ad\u0001\u001a\u0005\u0018\u00010ª\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010¯\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010±\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010´\u0001\u001a\u0005\u0018\u00010ª\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010µ\u0001\u001a\u00030¶\u00012\u0007\u0010·\u0001\u001a\u00020\u00102\f\b\u0002\u0010¸\u0001\u001a\u0005\u0018\u00010ª\u0001J,\u0010¹\u0001\u001a\u00030¶\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010º\u0001\u001a\u00020\u00102\n\u0010¸\u0001\u001a\u0005\u0018\u00010ª\u0001H\u0082 J\u0016\u0010¼\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0013\u0010½\u0001\u001a\u0005\u0018\u00010¾\u00012\u0007\u0010¿\u0001\u001a\u00020\u0015J\"\u0010À\u0001\u001a\u0005\u0018\u00010¾\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010¿\u0001\u001a\u00020\u0015H\u0082 J\u0018\u0010Á\u0001\u001a\u0004\u0018\u00010!2\u0007\u0010¿\u0001\u001a\u00020\u0015¢\u0006\u0003\u0010Â\u0001J'\u0010Ã\u0001\u001a\u0004\u0018\u00010!2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010¿\u0001\u001a\u00020\u0015H\u0082 ¢\u0006\u0003\u0010Ä\u0001J\u0010\u0010Å\u0001\u001a\u00020\u00152\u0007\u0010¿\u0001\u001a\u00020\u0015J\u001f\u0010Æ\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010¿\u0001\u001a\u00020\u0015H\u0082 J\u0010\u0010Ç\u0001\u001a\u00020\u00152\u0007\u0010¿\u0001\u001a\u00020\u0015J\u001f\u0010È\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010¿\u0001\u001a\u00020\u0015H\u0082 J\u001a\u0010É\u0001\u001a\u00020\f2\u0007\u0010¿\u0001\u001a\u00020\u00152\b\u0010Ê\u0001\u001a\u00030Ë\u0001J)\u0010Ì\u0001\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010¿\u0001\u001a\u00020\u00152\b\u0010Ê\u0001\u001a\u00030Ë\u0001H\u0082 J\b\u0010Í\u0001\u001a\u00030Î\u0001J\u0017\u0010Ï\u0001\u001a\u00030Î\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0011\u0010Ð\u0001\u001a\u00030Ñ\u00012\u0007\u0010·\u0001\u001a\u00020\u0010J \u0010Ò\u0001\u001a\u00030Ñ\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010Ó\u0001\u001a\u00020\u0010H\u0082 J\u0016\u0010Õ\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010Ø\u0001\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010Û\u0001\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010à\u0001\u001a\u0005\u0018\u00010Ý\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010ã\u0001\u001a\u0005\u0018\u00010Ý\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0010\u0010ä\u0001\u001a\u00020@2\u0007\u0010å\u0001\u001a\u00020#J\u001f\u0010æ\u0001\u001a\u00020@2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010å\u0001\u001a\u00020#H\u0082 J\u0016\u0010ç\u0001\u001a\u00060\u0005j\u0002`\u00062\u0006\u00109\u001a\u00020\u0001H\u0082 J\t\u0010ó\u0001\u001a\u00020\u0001H\u0016J\u0019\u0010ô\u0001\u001a\t\u0012\u0004\u0012\u00020D0õ\u00012\u0007\u0010ö\u0001\u001a\u00020.H\u0016J\u001a\u0010÷\u0001\u001a\t\u0012\u0004\u0012\u00020D0õ\u00012\u0007\u0010ö\u0001\u001a\u00020.H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bR\u0010PR\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bT\u0010JR\u0011\u0010\u0017\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bV\u0010JR(\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010X\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bg\u0010GR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bi\u0010GR\u0013\u0010 \u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0011\u0010\u0012\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bo\u0010GR\u0011\u0010\u0013\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bq\u0010GR\u0013\u0010$\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bs\u0010lR\u0013\u0010%\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bu\u0010lR\u0013\u0010&\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bw\u0010lR\u0013\u0010'\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\by\u0010GR\u0011\u0010(\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b{\u0010JR\u0013\u0010+\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0015\u0010-\u001a\u0004\u0018\u00010.8F¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0014\u0010/\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010GR\u0014\u00100\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010GR\u0014\u00101\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010GR\u0014\u00102\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010GR\u0014\u00103\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010GR\u0014\u00104\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010GR\u0015\u0010\u0090\u0001\u001a\u00030\u0091\u00018F¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0012\u0010*\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010GR\u0015\u00105\u001a\u0004\u0018\u0001068F¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0014\u00107\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010GR,\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010X\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001b\u0010¤\u0001\u001a\t\u0012\u0004\u0012\u00020\u00100¥\u00018F¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0017\u0010©\u0001\u001a\u0005\u0018\u00010ª\u00018F¢\u0006\b\u001a\u0006\b«\u0001\u0010¬\u0001R\u0013\u0010®\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b®\u0001\u0010JR\u0013\u0010°\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b°\u0001\u0010JR\u0017\u0010²\u0001\u001a\u0005\u0018\u00010ª\u00018F¢\u0006\b\u001a\u0006\b³\u0001\u0010¬\u0001R\u0013\u0010»\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b»\u0001\u0010JR\u0013\u0010Ô\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\bÔ\u0001\u0010JR\u0013\u0010Ö\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\b×\u0001\u0010GR\u0013\u0010Ù\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\bÚ\u0001\u0010GR\u0017\u0010Ü\u0001\u001a\u0005\u0018\u00010Ý\u00018F¢\u0006\b\u001a\u0006\bÞ\u0001\u0010ß\u0001R\u0017\u0010á\u0001\u001a\u0005\u0018\u00010Ý\u00018F¢\u0006\b\u001a\u0006\bâ\u0001\u0010ß\u0001R.\u0010è\u0001\u001a\u0011\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020@\u0018\u00010é\u0001X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bê\u0001\u0010ë\u0001\"\u0006\bì\u0001\u0010í\u0001R\u001f\u0010î\u0001\u001a\u00020.X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bï\u0001\u0010ð\u0001\"\u0006\bñ\u0001\u0010ò\u0001¨\u0006ù\u0001"}, d2 = {"Lcom/polymarket/data/EMarket$StandardMarket;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "team", "Lcom/polymarket/data/ESportsTeam;", "longMarketSide", "Lcom/polymarket/data/EMarket$MarketSide;", "shortMarketSide", "question", "slug", "active", "", "archived", MetricTracker.Action.CLOSED, "status", "Lcom/polymarket/data/APIMarketStatus;", "comboEnabled", "color", "colorPair", "Lcom/polymarket/designtokens/HexColorPair;", "description", "image", "line", "", "marketCache", "Lcom/polymarket/data/EMarketCache;", "orderPriceMinTickSize", "minimumTradeQty", "feeCoefficient", "rulesDisclaimer", "rulesDisclaimerPopup", "marketType", "eventCategory", "subject", "Lcom/polymarket/data/APISubject;", "subjectId", "", "playerName", "playerId", "statLabel", "subtitle", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "titleShort", "sportsMarketType", "Lcom/polymarket/data/EMarket$SportsMarketType;", "sportsMarketTypeRaw", "(Ljava/lang/String;Lcom/polymarket/data/ESportsTeam;Lcom/polymarket/data/EMarket$MarketSide;Lcom/polymarket/data/EMarket$MarketSide;Ljava/lang/String;Ljava/lang/String;ZZZLcom/polymarket/data/APIMarketStatus;Ljava/lang/Boolean;Ljava/lang/String;Lcom/polymarket/designtokens/HexColorPair;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lcom/polymarket/data/EMarketCache;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/polymarket/data/APISubject;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/EMarket$SportsMarketType;Ljava/lang/String;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "other", "", "hashCode", "getId", "()Ljava/lang/String;", "Swift_id", "getActive", "()Z", "Swift_active", "getTeam", "()Lcom/polymarket/data/ESportsTeam;", "Swift_team", "getLongMarketSide", "()Lcom/polymarket/data/EMarket$MarketSide;", "Swift_longMarketSide", "getShortMarketSide", "Swift_shortMarketSide", "getArchived", "Swift_archived", "getClosed", "Swift_closed", "newValue", "getStatus", "()Lcom/polymarket/data/APIMarketStatus;", "setStatus", "(Lcom/polymarket/data/APIMarketStatus;)V", "Swift_status", "Swift_status_set", "value", "getComboEnabled", "()Ljava/lang/Boolean;", "Swift_comboEnabled", "(J)Ljava/lang/Boolean;", "getColor", "()Lcom/polymarket/designtokens/HexColorPair;", "Swift_color", "getDescription", "Swift_description", "getImage", "Swift_image", "getLine", "()Ljava/lang/Double;", "Swift_line", "(J)Ljava/lang/Double;", "getQuestion", "Swift_question", "getSlug", "Swift_slug", "getOrderPriceMinTickSize", "Swift_orderPriceMinTickSize", "getMinimumTradeQty", "Swift_minimumTradeQty", "getFeeCoefficient", "Swift_feeCoefficient", "getRulesDisclaimer", "Swift_rulesDisclaimer", "getRulesDisclaimerPopup", "Swift_rulesDisclaimerPopup", "getSubject", "()Lcom/polymarket/data/APISubject;", "Swift_subject", "getSubjectId", "()Ljava/lang/Integer;", "Swift_subjectId", "(J)Ljava/lang/Integer;", "getPlayerName", "Swift_playerName", "getPlayerId", "Swift_playerId", "getStatLabel", "Swift_statLabel", "getSubtitle", "Swift_subtitle", "getTitle", "Swift_title", "getTitleShort", "Swift_titleShort", "type", "Lcom/polymarket/data/APIMarketType;", "getType", "()Lcom/polymarket/data/APIMarketType;", "Swift_type", "getEventCategory", "Swift_eventCategory", "getSportsMarketType", "()Lcom/polymarket/data/EMarket$SportsMarketType;", "Swift_sportsMarketType", "getSportsMarketTypeRaw", "Swift_sportsMarketTypeRaw", "getMarketCache", "()Lcom/polymarket/data/EMarketCache;", "setMarketCache", "(Lcom/polymarket/data/EMarketCache;)V", "Swift_marketCache", "Swift_marketCache_set", "Swift_constructor_0", "(Ljava/lang/String;Lcom/polymarket/data/ESportsTeam;Lcom/polymarket/data/EMarket$MarketSide;Lcom/polymarket/data/EMarket$MarketSide;Ljava/lang/String;Ljava/lang/String;ZZZLcom/polymarket/data/APIMarketStatus;Ljava/lang/Boolean;Ljava/lang/String;Lcom/polymarket/designtokens/HexColorPair;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lcom/polymarket/data/EMarketCache;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/polymarket/data/APISubject;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/EMarket$SportsMarketType;Ljava/lang/String;)J", "marketSides", "", "getMarketSides", "()Ljava/util/List;", "Swift_marketSides", "imageURL", "Ljava/net/URI;", "getImageURL", "()Ljava/net/URI;", "Swift_imageURL", "isTeamProp", "Swift_isTeamProp", "isPlayerScoped", "Swift_isPlayerScoped", "playerImageURL", "getPlayerImageURL", "Swift_playerImageURL", "displayContext", "Lcom/polymarket/data/EMarket$MarketSide$DisplayContext;", "for_", "eventImageURL", "Swift_displayContext_1", "side", "isTerminal", "Swift_isTerminal", "displayPrice", "Lcom/polymarket/data/EAmount;", "isForLongMarketSide", "Swift_displayPrice_2", "displayProbability", "(Z)Ljava/lang/Double;", "Swift_displayProbability_3", "(JZ)Ljava/lang/Double;", "isTradableForMarketSide", "Swift_isTradableForMarketSide_4", "isBlockedByNoLiquidity", "Swift_isBlockedByNoLiquidity_5", "formattedPriceForMarketSide", "format", "Lcom/polymarket/data/OddsFormat;", "Swift_formattedPriceForMarketSide_6", "resolution", "Lcom/polymarket/data/EMarket$Resolution;", "Swift_resolution_7", "sideResult", "Lcom/polymarket/data/EMarket$SideResult;", "Swift_sideResult_8", "marketSide", "isDraw", "Swift_isDraw", "formattedDisplayName", "getFormattedDisplayName", "Swift_formattedDisplayName", "formattedLongDisplayName", "getFormattedLongDisplayName", "Swift_formattedLongDisplayName", "semanticColor", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "getSemanticColor", "()Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "Swift_semanticColor", "resolvedColor", "getResolvedColor", "Swift_resolvedColor", "applyMarketCache", "cache", "Swift_applyMarketCache_9", "Swift_constructor_10", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class StandardMarket implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
            	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        public /* synthetic */ StandardMarket(java.lang.String r39, com.polymarket.data.ESportsTeam r40, com.polymarket.data.EMarket.MarketSide r41, com.polymarket.data.EMarket.MarketSide r42, java.lang.String r43, java.lang.String r44, boolean r45, boolean r46, boolean r47, com.polymarket.data.APIMarketStatus r48, java.lang.Boolean r49, java.lang.String r50, com.polymarket.designtokens.HexColorPair r51, java.lang.String r52, java.lang.String r53, java.lang.Double r54, com.polymarket.data.EMarketCache r55, java.lang.Double r56, java.lang.Double r57, java.lang.Double r58, java.lang.String r59, boolean r60, java.lang.String r61, java.lang.String r62, com.polymarket.data.APISubject r63, java.lang.Integer r64, java.lang.String r65, java.lang.String r66, java.lang.String r67, java.lang.String r68, java.lang.String r69, java.lang.String r70, com.polymarket.data.EMarket.SportsMarketType r71, java.lang.String r72, int r73, int r74, kotlin.jvm.internal.DefaultConstructorMarker r75) {
            /*
                Method dump skipped, instructions count: 288
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.polymarket.data.EMarket.StandardMarket.<init>(java.lang.String, com.polymarket.data.ESportsTeam, com.polymarket.data.EMarket$MarketSide, com.polymarket.data.EMarket$MarketSide, java.lang.String, java.lang.String, boolean, boolean, boolean, com.polymarket.data.APIMarketStatus, java.lang.Boolean, java.lang.String, com.polymarket.designtokens.HexColorPair, java.lang.String, java.lang.String, java.lang.Double, com.polymarket.data.EMarketCache, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.String, boolean, java.lang.String, java.lang.String, com.polymarket.data.APISubject, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.polymarket.data.EMarket$SportsMarketType, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        private final native boolean Swift_active(long Swift_peer);

        private final native void Swift_applyMarketCache_9(long Swift_peer, EMarketCache cache);

        private final native boolean Swift_archived(long Swift_peer);

        private final native boolean Swift_closed(long Swift_peer);

        private final native HexColorPair Swift_color(long Swift_peer);

        private final native Boolean Swift_comboEnabled(long Swift_peer);

        private final native long Swift_constructor_0(String id, ESportsTeam team, MarketSide longMarketSide, MarketSide shortMarketSide, String question, String slug, boolean active, boolean archived, boolean closed, APIMarketStatus status, Boolean comboEnabled, String color, HexColorPair colorPair, String description, String image, Double line, EMarketCache marketCache, Double orderPriceMinTickSize, Double minimumTradeQty, Double feeCoefficient, String rulesDisclaimer, boolean rulesDisclaimerPopup, String marketType, String eventCategory, APISubject subject, Integer subjectId, String playerName, String playerId, String statLabel, String subtitle, String title, String titleShort, SportsMarketType sportsMarketType, String sportsMarketTypeRaw);

        private final native long Swift_constructor_10(MutableStruct copy);

        private final native String Swift_description(long Swift_peer);

        private final native MarketSide.DisplayContext Swift_displayContext_1(long Swift_peer, MarketSide side, URI eventImageURL);

        private final native EAmount Swift_displayPrice_2(long Swift_peer, boolean isForLongMarketSide);

        private final native Double Swift_displayProbability_3(long Swift_peer, boolean isForLongMarketSide);

        private final native String Swift_eventCategory(long Swift_peer);

        private final native Double Swift_feeCoefficient(long Swift_peer);

        private final native String Swift_formattedDisplayName(long Swift_peer);

        private final native String Swift_formattedLongDisplayName(long Swift_peer);

        private final native String Swift_formattedPriceForMarketSide_6(long Swift_peer, boolean isForLongMarketSide, OddsFormat format);

        private final native String Swift_id(long Swift_peer);

        private final native String Swift_image(long Swift_peer);

        private final native URI Swift_imageURL(long Swift_peer);

        private final native boolean Swift_isBlockedByNoLiquidity_5(long Swift_peer, boolean isForLongMarketSide);

        private final native boolean Swift_isDraw(long Swift_peer);

        private final native boolean Swift_isPlayerScoped(long Swift_peer);

        private final native boolean Swift_isTeamProp(long Swift_peer);

        private final native boolean Swift_isTerminal(long Swift_peer);

        private final native boolean Swift_isTradableForMarketSide_4(long Swift_peer, boolean isForLongMarketSide);

        private final native Double Swift_line(long Swift_peer);

        private final native MarketSide Swift_longMarketSide(long Swift_peer);

        private final native EMarketCache Swift_marketCache(long Swift_peer);

        private final native void Swift_marketCache_set(long Swift_peer, EMarketCache value);

        private final native List<MarketSide> Swift_marketSides(long Swift_peer);

        private final native Double Swift_minimumTradeQty(long Swift_peer);

        private final native Double Swift_orderPriceMinTickSize(long Swift_peer);

        private final native String Swift_playerId(long Swift_peer);

        private final native URI Swift_playerImageURL(long Swift_peer);

        private final native String Swift_playerName(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native String Swift_question(long Swift_peer);

        private final native void Swift_release(long Swift_peer);

        private final native Resolution Swift_resolution_7(long Swift_peer);

        private final native DesignTokens.SemanticColor Swift_resolvedColor(long Swift_peer);

        private final native String Swift_rulesDisclaimer(long Swift_peer);

        private final native boolean Swift_rulesDisclaimerPopup(long Swift_peer);

        private final native DesignTokens.SemanticColor Swift_semanticColor(long Swift_peer);

        private final native MarketSide Swift_shortMarketSide(long Swift_peer);

        private final native SideResult Swift_sideResult_8(long Swift_peer, MarketSide marketSide);

        private final native String Swift_slug(long Swift_peer);

        private final native SportsMarketType Swift_sportsMarketType(long Swift_peer);

        private final native String Swift_sportsMarketTypeRaw(long Swift_peer);

        private final native String Swift_statLabel(long Swift_peer);

        private final native APIMarketStatus Swift_status(long Swift_peer);

        private final native void Swift_status_set(long Swift_peer, APIMarketStatus value);

        private final native APISubject Swift_subject(long Swift_peer);

        private final native Integer Swift_subjectId(long Swift_peer);

        private final native String Swift_subtitle(long Swift_peer);

        private final native ESportsTeam Swift_team(long Swift_peer);

        private final native String Swift_title(long Swift_peer);

        private final native String Swift_titleShort(long Swift_peer);

        private final native APIMarketType Swift_type(long Swift_peer);

        public static /* synthetic */ MarketSide.DisplayContext displayContext$default(StandardMarket standardMarket, MarketSide marketSide, URI uri, int i, Object obj) {
            if ((i & 2) != 0) {
                uri = null;
            }
            return standardMarket.displayContext(marketSide, uri);
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

        public final void applyMarketCache(EMarketCache cache) {
            cache.getClass();
            willmutate();
            try {
                Swift_applyMarketCache_9(this.Swift_peer, cache);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void didmutate() {
            super.didmutate();
        }

        public final MarketSide.DisplayContext displayContext(MarketSide for_, URI eventImageURL) {
            for_.getClass();
            return Swift_displayContext_1(this.Swift_peer, for_, eventImageURL);
        }

        public final EAmount displayPrice(boolean isForLongMarketSide) {
            return Swift_displayPrice_2(this.Swift_peer, isForLongMarketSide);
        }

        public final Double displayProbability(boolean isForLongMarketSide) {
            return Swift_displayProbability_3(this.Swift_peer, isForLongMarketSide);
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

        public final String formattedPriceForMarketSide(boolean isForLongMarketSide, OddsFormat format) {
            format.getClass();
            return Swift_formattedPriceForMarketSide_6(this.Swift_peer, isForLongMarketSide, format);
        }

        public final boolean getActive() {
            return Swift_active(this.Swift_peer);
        }

        public final boolean getArchived() {
            return Swift_archived(this.Swift_peer);
        }

        public final boolean getClosed() {
            return Swift_closed(this.Swift_peer);
        }

        public final HexColorPair getColor() {
            return Swift_color(this.Swift_peer);
        }

        public final Boolean getComboEnabled() {
            return Swift_comboEnabled(this.Swift_peer);
        }

        public final String getDescription() {
            return Swift_description(this.Swift_peer);
        }

        public final String getEventCategory() {
            return Swift_eventCategory(this.Swift_peer);
        }

        public final Double getFeeCoefficient() {
            return Swift_feeCoefficient(this.Swift_peer);
        }

        public final String getFormattedDisplayName() {
            return Swift_formattedDisplayName(this.Swift_peer);
        }

        public final String getFormattedLongDisplayName() {
            return Swift_formattedLongDisplayName(this.Swift_peer);
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

        public final Double getLine() {
            return Swift_line(this.Swift_peer);
        }

        public final MarketSide getLongMarketSide() {
            return Swift_longMarketSide(this.Swift_peer);
        }

        public final EMarketCache getMarketCache() {
            return Swift_marketCache(this.Swift_peer);
        }

        public final List<MarketSide> getMarketSides() {
            return Swift_marketSides(this.Swift_peer);
        }

        public final Double getMinimumTradeQty() {
            return Swift_minimumTradeQty(this.Swift_peer);
        }

        public final Double getOrderPriceMinTickSize() {
            return Swift_orderPriceMinTickSize(this.Swift_peer);
        }

        public final String getPlayerId() {
            return Swift_playerId(this.Swift_peer);
        }

        public final URI getPlayerImageURL() {
            return Swift_playerImageURL(this.Swift_peer);
        }

        public final String getPlayerName() {
            return Swift_playerName(this.Swift_peer);
        }

        public final String getQuestion() {
            return Swift_question(this.Swift_peer);
        }

        public final DesignTokens.SemanticColor getResolvedColor() {
            return Swift_resolvedColor(this.Swift_peer);
        }

        public final String getRulesDisclaimer() {
            return Swift_rulesDisclaimer(this.Swift_peer);
        }

        public final boolean getRulesDisclaimerPopup() {
            return Swift_rulesDisclaimerPopup(this.Swift_peer);
        }

        public final DesignTokens.SemanticColor getSemanticColor() {
            return Swift_semanticColor(this.Swift_peer);
        }

        public final MarketSide getShortMarketSide() {
            return Swift_shortMarketSide(this.Swift_peer);
        }

        public final String getSlug() {
            return Swift_slug(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public int getSmutatingcount() {
            return this.smutatingcount;
        }

        public final SportsMarketType getSportsMarketType() {
            return Swift_sportsMarketType(this.Swift_peer);
        }

        public final String getSportsMarketTypeRaw() {
            return Swift_sportsMarketTypeRaw(this.Swift_peer);
        }

        public final String getStatLabel() {
            return Swift_statLabel(this.Swift_peer);
        }

        public final APIMarketStatus getStatus() {
            return Swift_status(this.Swift_peer);
        }

        public final APISubject getSubject() {
            return Swift_subject(this.Swift_peer);
        }

        public final Integer getSubjectId() {
            return Swift_subjectId(this.Swift_peer);
        }

        public final String getSubtitle() {
            return Swift_subtitle(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public Function1<Object, Unit> getSupdate() {
            return this.supdate;
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final ESportsTeam getTeam() {
            return Swift_team(this.Swift_peer);
        }

        public final String getTitle() {
            return Swift_title(this.Swift_peer);
        }

        public final String getTitleShort() {
            return Swift_titleShort(this.Swift_peer);
        }

        public final APIMarketType getType() {
            return Swift_type(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final boolean isBlockedByNoLiquidity(boolean isForLongMarketSide) {
            return Swift_isBlockedByNoLiquidity_5(this.Swift_peer, isForLongMarketSide);
        }

        public final boolean isDraw() {
            return Swift_isDraw(this.Swift_peer);
        }

        public final boolean isPlayerScoped() {
            return Swift_isPlayerScoped(this.Swift_peer);
        }

        public final boolean isTeamProp() {
            return Swift_isTeamProp(this.Swift_peer);
        }

        public final boolean isTerminal() {
            return Swift_isTerminal(this.Swift_peer);
        }

        public final boolean isTradableForMarketSide(boolean isForLongMarketSide) {
            return Swift_isTradableForMarketSide_4(this.Swift_peer, isForLongMarketSide);
        }

        public final Resolution resolution() {
            return Swift_resolution_7(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new StandardMarket(this);
        }

        public final void setMarketCache(EMarketCache eMarketCache) {
            willmutate();
            try {
                Swift_marketCache_set(this.Swift_peer, eMarketCache);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void setSmutatingcount(int i) {
            this.smutatingcount = i;
        }

        public final void setStatus(APIMarketStatus aPIMarketStatus) {
            willmutate();
            try {
                Swift_status_set(this.Swift_peer, aPIMarketStatus);
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

        public final SideResult sideResult(MarketSide for_) {
            for_.getClass();
            return Swift_sideResult_8(this.Swift_peer, for_);
        }

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        public StandardMarket(String str, ESportsTeam eSportsTeam, MarketSide marketSide, MarketSide marketSide2, String str2, String str3, boolean z, boolean z2, boolean z3, APIMarketStatus aPIMarketStatus, Boolean bool, String str4, HexColorPair hexColorPair, String str5, String str6, Double d, EMarketCache eMarketCache, Double d2, Double d3, Double d4, String str7, boolean z4, String str8, String str9, APISubject aPISubject, Integer num, String str10, String str11, String str12, String str13, String str14, String str15, SportsMarketType sportsMarketType, String str16) {
            str.getClass();
            marketSide.getClass();
            marketSide2.getClass();
            str2.getClass();
            str3.getClass();
            str8.getClass();
            str9.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, eSportsTeam, marketSide, marketSide2, str2, str3, z, z2, z3, aPIMarketStatus, bool, str4, hexColorPair, str5, str6, d, eMarketCache, d2, d3, d4, str7, z4, str8, str9, aPISubject, num, str10, str11, str12, str13, str14, str15, sportsMarketType, str16);
        }

        public StandardMarket(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private StandardMarket(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_10(mutableStruct);
        }
    }

    public EMarket(StandardMarket standardMarket) {
        standardMarket.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(standardMarket);
    }

    private final native Boolean Swift_active(long Swift_peer);

    private final native boolean Swift_appendsToAdvanceSuffix(long Swift_peer);

    private final native Boolean Swift_archived(long Swift_peer);

    private final native String Swift_category(long Swift_peer);

    private final native double Swift_chartInitialProbability_15(long Swift_peer, boolean isForLongMarketSide);

    private final native Boolean Swift_closed(long Swift_peer);

    private final native DesignTokens.SemanticColor Swift_color(long Swift_peer);

    private final native Boolean Swift_comboEnabled(long Swift_peer);

    private final native long Swift_constructor_0(StandardMarket standardMarket);

    private final native long Swift_constructor_1(SportsMarket sportsMarket);

    private final native EAmount Swift_displayBidPrice_13(long Swift_peer, boolean isForLongMarketSide);

    private final native MarketSide.DisplayContext Swift_displayContext_7(long Swift_peer, MarketSide side, ESportsSlug sportSlug, URI eventImageURL);

    private final native EAmount Swift_displayPrice_12(long Swift_peer, boolean isForLongMarketSide);

    private final native Double Swift_displayProbability_14(long Swift_peer, boolean isForLongMarketSide);

    private final native Double Swift_feeCoefficient(long Swift_peer);

    private final native String Swift_formattedDisplayName(long Swift_peer);

    private final native String Swift_formattedLongDisplayName(long Swift_peer);

    private final native String Swift_formattedPriceForMarketSide_20(long Swift_peer, boolean isForLongMarketSide, OddsFormat format);

    private final native boolean Swift_hasDistinctSideTeams(long Swift_peer);

    private final native boolean Swift_hasEnteredResolution(long Swift_peer);

    private final native boolean Swift_hasFees(long Swift_peer);

    private final native boolean Swift_hasResolutionStatus(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native URI Swift_imageURL(long Swift_peer);

    private final native boolean Swift_isBlockedByNoLiquidity_17(long Swift_peer, boolean isForLongMarketSide);

    private final native boolean Swift_isDecimalizedMarket(long Swift_peer);

    private final native boolean Swift_isDraw(long Swift_peer);

    private final native boolean Swift_isFutureMarket(long Swift_peer);

    private final native boolean Swift_isMoneyline(long Swift_peer);

    private final native boolean Swift_isSports(long Swift_peer);

    private final native boolean Swift_isSpread(long Swift_peer);

    private final native boolean Swift_isStandard(long Swift_peer);

    private final native boolean Swift_isTeamWinnerMarket(long Swift_peer);

    private final native boolean Swift_isTerminal(long Swift_peer);

    private final native boolean Swift_isTotal(long Swift_peer);

    private final native boolean Swift_isTradableForMarketSide_16(long Swift_peer, boolean isForLongMarketSide);

    private final native Boolean Swift_isWholeGameTotal(long Swift_peer);

    private final native Double Swift_line(long Swift_peer);

    private final native MarketSide Swift_longMarketSide(long Swift_peer);

    private final native EMarketCache Swift_marketCache(long Swift_peer);

    private final native void Swift_marketCache_set(long Swift_peer, EMarketCache value);

    private final native List<MarketSide> Swift_marketSides(long Swift_peer);

    private final native boolean Swift_matchesTeam_10(long Swift_peer, String teamId);

    private final native EQuantity Swift_minimumTradeQty(long Swift_peer);

    private final native Double Swift_orderPriceMinTickSize(long Swift_peer);

    private final native int Swift_priceDecimalPlaces(long Swift_peer);

    private final native double Swift_priceTick(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native int Swift_quantityDecimalPlaces(long Swift_peer);

    private final native String Swift_question(long Swift_peer);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_resolutionBadgeLabel(long Swift_peer);

    private final native ResolutionPhase Swift_resolutionPhase(long Swift_peer);

    private final native Resolution Swift_resolution_21(long Swift_peer);

    private final native DesignTokens.SemanticColor Swift_resolvedColor(long Swift_peer);

    private final native EAmount Swift_resolvedSideAmount_19(long Swift_peer, boolean isForLongMarketSide);

    private final native String Swift_rulesDisclaimer(long Swift_peer);

    private final native boolean Swift_rulesDisclaimerPopup(long Swift_peer);

    private final native SideResult Swift_sideResult_22(long Swift_peer, MarketSide marketSide);

    private final native MarketSide Swift_sideToggleDestination_18(long Swift_peer, MarketSide side);

    private final native String Swift_slug(long Swift_peer);

    private final native SportsMarket Swift_sportsMarket(long Swift_peer);

    private final native SportsMarketType Swift_sportsMarketType(long Swift_peer);

    private final native String Swift_sportsMarketTypeRaw(long Swift_peer);

    private final native String Swift_spreadTotalSuffix(long Swift_peer);

    private final native StandardMarket Swift_standardMarket(long Swift_peer);

    private final native String Swift_statLabel(long Swift_peer);

    private final native APIMarketStatus Swift_status(long Swift_peer);

    private final native void Swift_status_set(long Swift_peer, APIMarketStatus value);

    private final native boolean Swift_substituteTeamNameForMarketTitle(long Swift_peer);

    private final native String Swift_substitutedPlayerName(long Swift_peer);

    private final native ESportsTeam Swift_team_6(long Swift_peer, MarketSide side);

    private final native String Swift_title(long Swift_peer);

    private final native String Swift_titleShort(long Swift_peer);

    public static final /* synthetic */ String access$getUntradeablePlaceholder$cp() {
        return untradeablePlaceholder;
    }

    public static /* synthetic */ MarketSide.DisplayContext displayContext$default(EMarket eMarket, MarketSide marketSide, ESportsSlug eSportsSlug, URI uri, int i, Object obj) {
        if ((i & 2) != 0) {
            eSportsSlug = null;
        }
        if ((i & 4) != 0) {
            uri = null;
        }
        return eMarket.displayContext(marketSide, eSportsSlug, uri);
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

    public final double chartInitialProbability(boolean isForLongMarketSide) {
        return Swift_chartInitialProbability_15(this.Swift_peer, isForLongMarketSide);
    }

    public final EAmount displayBidPrice(boolean isForLongMarketSide) {
        return Swift_displayBidPrice_13(this.Swift_peer, isForLongMarketSide);
    }

    public final MarketSide.DisplayContext displayContext(MarketSide for_, ESportsSlug sportSlug, URI eventImageURL) {
        for_.getClass();
        return Swift_displayContext_7(this.Swift_peer, for_, sportSlug, eventImageURL);
    }

    public final EAmount displayPrice(boolean isForLongMarketSide) {
        return Swift_displayPrice_12(this.Swift_peer, isForLongMarketSide);
    }

    public final Double displayProbability(boolean isForLongMarketSide) {
        return Swift_displayProbability_14(this.Swift_peer, isForLongMarketSide);
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

    public final String formattedPriceForMarketSide(boolean isForLongMarketSide, OddsFormat format) {
        format.getClass();
        return Swift_formattedPriceForMarketSide_20(this.Swift_peer, isForLongMarketSide, format);
    }

    public final Boolean getActive() {
        return Swift_active(this.Swift_peer);
    }

    public final boolean getAppendsToAdvanceSuffix() {
        return Swift_appendsToAdvanceSuffix(this.Swift_peer);
    }

    public final Boolean getArchived() {
        return Swift_archived(this.Swift_peer);
    }

    public final String getCategory() {
        return Swift_category(this.Swift_peer);
    }

    public final Boolean getClosed() {
        return Swift_closed(this.Swift_peer);
    }

    public final DesignTokens.SemanticColor getColor() {
        return Swift_color(this.Swift_peer);
    }

    public final Boolean getComboEnabled() {
        return Swift_comboEnabled(this.Swift_peer);
    }

    public final Double getFeeCoefficient() {
        return Swift_feeCoefficient(this.Swift_peer);
    }

    public final String getFormattedDisplayName() {
        return Swift_formattedDisplayName(this.Swift_peer);
    }

    public final String getFormattedLongDisplayName() {
        return Swift_formattedLongDisplayName(this.Swift_peer);
    }

    public final boolean getHasDistinctSideTeams() {
        return Swift_hasDistinctSideTeams(this.Swift_peer);
    }

    public final boolean getHasEnteredResolution() {
        return Swift_hasEnteredResolution(this.Swift_peer);
    }

    public final boolean getHasFees() {
        return Swift_hasFees(this.Swift_peer);
    }

    public final boolean getHasResolutionStatus() {
        return Swift_hasResolutionStatus(this.Swift_peer);
    }

    public final String getId() {
        return Swift_id(this.Swift_peer);
    }

    public final URI getImageURL() {
        return Swift_imageURL(this.Swift_peer);
    }

    public final Double getLine() {
        return Swift_line(this.Swift_peer);
    }

    public final MarketSide getLongMarketSide() {
        return Swift_longMarketSide(this.Swift_peer);
    }

    public final EMarketCache getMarketCache() {
        return Swift_marketCache(this.Swift_peer);
    }

    public final List<MarketSide> getMarketSides() {
        return Swift_marketSides(this.Swift_peer);
    }

    public final EQuantity getMinimumTradeQty() {
        return Swift_minimumTradeQty(this.Swift_peer);
    }

    public final Double getOrderPriceMinTickSize() {
        return Swift_orderPriceMinTickSize(this.Swift_peer);
    }

    public final int getPriceDecimalPlaces() {
        return Swift_priceDecimalPlaces(this.Swift_peer);
    }

    public final double getPriceTick() {
        return Swift_priceTick(this.Swift_peer);
    }

    public final int getQuantityDecimalPlaces() {
        return Swift_quantityDecimalPlaces(this.Swift_peer);
    }

    public final String getQuestion() {
        return Swift_question(this.Swift_peer);
    }

    public final String getResolutionBadgeLabel() {
        return Swift_resolutionBadgeLabel(this.Swift_peer);
    }

    public final ResolutionPhase getResolutionPhase() {
        return Swift_resolutionPhase(this.Swift_peer);
    }

    public final DesignTokens.SemanticColor getResolvedColor() {
        return Swift_resolvedColor(this.Swift_peer);
    }

    public final String getRulesDisclaimer() {
        return Swift_rulesDisclaimer(this.Swift_peer);
    }

    public final boolean getRulesDisclaimerPopup() {
        return Swift_rulesDisclaimerPopup(this.Swift_peer);
    }

    public final String getSlug() {
        return Swift_slug(this.Swift_peer);
    }

    public final SportsMarket getSportsMarket() {
        return Swift_sportsMarket(this.Swift_peer);
    }

    public final SportsMarketType getSportsMarketType() {
        return Swift_sportsMarketType(this.Swift_peer);
    }

    public final String getSportsMarketTypeRaw() {
        return Swift_sportsMarketTypeRaw(this.Swift_peer);
    }

    public final String getSpreadTotalSuffix() {
        return Swift_spreadTotalSuffix(this.Swift_peer);
    }

    public final StandardMarket getStandardMarket() {
        return Swift_standardMarket(this.Swift_peer);
    }

    public final String getStatLabel() {
        return Swift_statLabel(this.Swift_peer);
    }

    public final APIMarketStatus getStatus() {
        return Swift_status(this.Swift_peer);
    }

    public final boolean getSubstituteTeamNameForMarketTitle() {
        return Swift_substituteTeamNameForMarketTitle(this.Swift_peer);
    }

    public final String getSubstitutedPlayerName() {
        return Swift_substitutedPlayerName(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final String getTitle() {
        return Swift_title(this.Swift_peer);
    }

    public final String getTitleShort() {
        return Swift_titleShort(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isBlockedByNoLiquidity(boolean isForLongMarketSide) {
        return Swift_isBlockedByNoLiquidity_17(this.Swift_peer, isForLongMarketSide);
    }

    public final boolean isDecimalizedMarket() {
        return Swift_isDecimalizedMarket(this.Swift_peer);
    }

    public final boolean isDraw() {
        return Swift_isDraw(this.Swift_peer);
    }

    public final boolean isFutureMarket() {
        return Swift_isFutureMarket(this.Swift_peer);
    }

    public final boolean isMoneyline() {
        return Swift_isMoneyline(this.Swift_peer);
    }

    public final boolean isSports() {
        return Swift_isSports(this.Swift_peer);
    }

    public final boolean isSpread() {
        return Swift_isSpread(this.Swift_peer);
    }

    public final boolean isStandard() {
        return Swift_isStandard(this.Swift_peer);
    }

    public final boolean isTeamWinnerMarket() {
        return Swift_isTeamWinnerMarket(this.Swift_peer);
    }

    public final boolean isTerminal() {
        return Swift_isTerminal(this.Swift_peer);
    }

    public final boolean isTotal() {
        return Swift_isTotal(this.Swift_peer);
    }

    public final boolean isTradableForMarketSide(boolean isForLongMarketSide) {
        return Swift_isTradableForMarketSide_16(this.Swift_peer, isForLongMarketSide);
    }

    public final Boolean isWholeGameTotal() {
        return Swift_isWholeGameTotal(this.Swift_peer);
    }

    public final boolean matchesTeam(String id) {
        id.getClass();
        return Swift_matchesTeam_10(this.Swift_peer, id);
    }

    public final Resolution resolution() {
        return Swift_resolution_21(this.Swift_peer);
    }

    public final EAmount resolvedSideAmount(boolean isForLongMarketSide) {
        return Swift_resolvedSideAmount_19(this.Swift_peer, isForLongMarketSide);
    }

    public final void setMarketCache(EMarketCache eMarketCache) {
        Swift_marketCache_set(this.Swift_peer, eMarketCache);
    }

    public final void setStatus(APIMarketStatus aPIMarketStatus) {
        Swift_status_set(this.Swift_peer, aPIMarketStatus);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public final SideResult sideResult(MarketSide for_) {
        for_.getClass();
        return Swift_sideResult_22(this.Swift_peer, for_);
    }

    public final MarketSide sideToggleDestination(MarketSide from) {
        from.getClass();
        return Swift_sideToggleDestination_18(this.Swift_peer, from);
    }

    public final ESportsTeam team(MarketSide for_) {
        for_.getClass();
        return Swift_team_6(this.Swift_peer, for_);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0004\u0017\u0018\u0019\u001aB\u001d\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0000H\u0096\u0002J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0082 J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0003H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/polymarket/data/EMarket$ResolutionPhase;", "", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "rawValue", "unusedp", "", "<init>", "(ILjava/lang/Void;)V", "getRawValue", "()Ljava/lang/Integer;", "compareTo", "other", "Swift_islessthan", "", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "TradingCase", "ResolvingCase", "ResolvedCase", "Companion", "Lcom/polymarket/data/EMarket$ResolutionPhase$ResolvedCase;", "Lcom/polymarket/data/EMarket$ResolutionPhase$ResolvingCase;", "Lcom/polymarket/data/EMarket$ResolutionPhase$TradingCase;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class ResolutionPhase implements Comparable<ResolutionPhase>, RawRepresentable<Integer>, SwiftProjecting {
        private final int rawValue;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final ResolutionPhase trading = new TradingCase();
        private static final ResolutionPhase resolving = new ResolvingCase();
        private static final ResolutionPhase resolved = new ResolvedCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/EMarket$ResolutionPhase$ResolvedCase;", "Lcom/polymarket/data/EMarket$ResolutionPhase;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ResolvedCase extends ResolutionPhase {
            public ResolvedCase() {
                super(2, null, 2, null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/EMarket$ResolutionPhase$ResolvingCase;", "Lcom/polymarket/data/EMarket$ResolutionPhase;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ResolvingCase extends ResolutionPhase {
            public ResolvingCase() {
                super(1, null, 2, null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/EMarket$ResolutionPhase$TradingCase;", "Lcom/polymarket/data/EMarket$ResolutionPhase;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class TradingCase extends ResolutionPhase {
            public TradingCase() {
                super(0, null, 2, null);
            }
        }

        public /* synthetic */ ResolutionPhase(int i, Void r2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : r2, null);
        }

        private final native boolean Swift_islessthan(ResolutionPhase lhs, ResolutionPhase rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ ResolutionPhase access$getResolved$cp() {
            return resolved;
        }

        public static final /* synthetic */ ResolutionPhase access$getResolving$cp() {
            return resolving;
        }

        public static final /* synthetic */ ResolutionPhase access$getTrading$cp() {
            return trading;
        }

        private static final boolean compareTo$islessthan(ResolutionPhase resolutionPhase, ResolutionPhase resolutionPhase2, ResolutionPhase resolutionPhase3) {
            return resolutionPhase.Swift_islessthan(resolutionPhase2, resolutionPhase3);
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(ResolutionPhase other) {
            other.getClass();
            if (Intrinsics.areEqual(this, other)) {
                return 0;
            }
            if (compareTo$islessthan(this, this, other)) {
                return -1;
            }
            return 1;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // skip.lib.RawRepresentable
        public Integer getRawValue() {
            return Integer.valueOf(this.rawValue);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/data/EMarket$ResolutionPhase$Companion;", "", "<init>", "()V", "trading", "Lcom/polymarket/data/EMarket$ResolutionPhase;", "getTrading", "()Lcom/polymarket/data/EMarket$ResolutionPhase;", "resolving", "getResolving", "resolved", "getResolved", "init", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ResolutionPhase getResolved() {
                return ResolutionPhase.access$getResolved$cp();
            }

            public final ResolutionPhase getResolving() {
                return ResolutionPhase.access$getResolving$cp();
            }

            public final ResolutionPhase getTrading() {
                return ResolutionPhase.access$getTrading$cp();
            }

            public final ResolutionPhase init(int rawValue) {
                if (rawValue != 0) {
                    if (rawValue != 1) {
                        if (rawValue != 2) {
                            return null;
                        }
                        return ResolutionPhase.INSTANCE.getResolved();
                    }
                    return ResolutionPhase.INSTANCE.getResolving();
                }
                return ResolutionPhase.INSTANCE.getTrading();
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ Integer getRawValue() {
            return getRawValue();
        }

        private ResolutionPhase(int i, Void r2) {
            this.rawValue = i;
        }

        public /* synthetic */ ResolutionPhase(int i, Void r2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, r2);
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(ResolutionPhase resolutionPhase) {
            return compareTo2(resolutionPhase);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001(B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0002H\u0082 J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010%\u001a\u00020&H\u0016J\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010%\u001a\u00020&H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u001d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006)"}, d2 = {"Lcom/polymarket/data/EMarket$SportsMarketType;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "soccerGameToAdvance", "tennisSet1Winner", "tennisSet2Winner", "tennisSet3Winner", "tableTennisSet1Winner", "tableTennisSet2Winner", "tableTennisSet3Winner", "tableTennisSet4Winner", "esportsMapWinner1", "esportsMapWinner2", "esportsMapWinner3", "esportsMapWinner4", "esportsGameWinner1", "esportsGameWinner2", "esportsGameWinner3", "esportsGameWinner4", "unknown", "isTeamWinnerMarket", "", "()Z", "Swift_isTeamWinnerMarket", Keys.KEY_NAME, "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SportsMarketType implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ SportsMarketType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final SportsMarketType soccerGameToAdvance = new SportsMarketType("soccerGameToAdvance", 0, "soccer_game_to_advance", null, 2, null);
        public static final SportsMarketType tennisSet1Winner = new SportsMarketType("tennisSet1Winner", 1, "tennis_set_1_winner", null, 2, null);
        public static final SportsMarketType tennisSet2Winner = new SportsMarketType("tennisSet2Winner", 2, "tennis_set_2_winner", null, 2, null);
        public static final SportsMarketType tennisSet3Winner = new SportsMarketType("tennisSet3Winner", 3, "tennis_set_3_winner", null, 2, null);
        public static final SportsMarketType tableTennisSet1Winner = new SportsMarketType("tableTennisSet1Winner", 4, "table_tennis_set_1_winner", null, 2, null);
        public static final SportsMarketType tableTennisSet2Winner = new SportsMarketType("tableTennisSet2Winner", 5, "table_tennis_set_2_winner", null, 2, null);
        public static final SportsMarketType tableTennisSet3Winner = new SportsMarketType("tableTennisSet3Winner", 6, "table_tennis_set_3_winner", null, 2, null);
        public static final SportsMarketType tableTennisSet4Winner = new SportsMarketType("tableTennisSet4Winner", 7, "table_tennis_set_4_winner", null, 2, null);
        public static final SportsMarketType esportsMapWinner1 = new SportsMarketType("esportsMapWinner1", 8, "esports_map_winner_1", null, 2, null);
        public static final SportsMarketType esportsMapWinner2 = new SportsMarketType("esportsMapWinner2", 9, "esports_map_winner_2", null, 2, null);
        public static final SportsMarketType esportsMapWinner3 = new SportsMarketType("esportsMapWinner3", 10, "esports_map_winner_3", null, 2, null);
        public static final SportsMarketType esportsMapWinner4 = new SportsMarketType("esportsMapWinner4", 11, "esports_map_winner_4", null, 2, null);
        public static final SportsMarketType esportsGameWinner1 = new SportsMarketType("esportsGameWinner1", 12, "esports_game_winner_1", null, 2, null);
        public static final SportsMarketType esportsGameWinner2 = new SportsMarketType("esportsGameWinner2", 13, "esports_game_winner_2", null, 2, null);
        public static final SportsMarketType esportsGameWinner3 = new SportsMarketType("esportsGameWinner3", 14, "esports_game_winner_3", null, 2, null);
        public static final SportsMarketType esportsGameWinner4 = new SportsMarketType("esportsGameWinner4", 15, "esports_game_winner_4", null, 2, null);
        public static final SportsMarketType unknown = new SportsMarketType("unknown", 16, "unknown", null, 2, null);

        private static final /* synthetic */ SportsMarketType[] $values() {
            return new SportsMarketType[]{soccerGameToAdvance, tennisSet1Winner, tennisSet2Winner, tennisSet3Winner, tableTennisSet1Winner, tableTennisSet2Winner, tableTennisSet3Winner, tableTennisSet4Winner, esportsMapWinner1, esportsMapWinner2, esportsMapWinner3, esportsMapWinner4, esportsGameWinner1, esportsGameWinner2, esportsGameWinner3, esportsGameWinner4, unknown};
        }

        static {
            SportsMarketType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ SportsMarketType(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native boolean Swift_isTeamWinnerMarket(String name);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static SportsMarketType valueOf(String str) {
            return (SportsMarketType) Enum.valueOf(SportsMarketType.class, str);
        }

        public static SportsMarketType[] values() {
            return (SportsMarketType[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        public final boolean isTeamWinnerMarket() {
            return Swift_isTeamWinnerMarket(name());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EMarket$SportsMarketType$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EMarket$SportsMarketType;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SportsMarketType init(String rawValue) {
                rawValue.getClass();
                int hashCode = rawValue.hashCode();
                switch (hashCode) {
                    case -1375611909:
                        if (!rawValue.equals("table_tennis_set_3_winner")) {
                            return null;
                        }
                        return SportsMarketType.tableTennisSet3Winner;
                    case -824717043:
                        if (rawValue.equals("tennis_set_2_winner")) {
                            return SportsMarketType.tennisSet2Winner;
                        }
                        return null;
                    case -566265283:
                        if (rawValue.equals("table_tennis_set_1_winner")) {
                            return SportsMarketType.tableTennisSet1Winner;
                        }
                        return null;
                    case -284840886:
                        if (rawValue.equals("unknown")) {
                            return SportsMarketType.unknown;
                        }
                        return null;
                    case 122918485:
                        if (rawValue.equals("soccer_game_to_advance")) {
                            return SportsMarketType.soccerGameToAdvance;
                        }
                        return null;
                    case 367198426:
                        if (rawValue.equals("table_tennis_set_4_winner")) {
                            return SportsMarketType.tableTennisSet4Winner;
                        }
                        return null;
                    case 918093292:
                        if (rawValue.equals("tennis_set_3_winner")) {
                            return SportsMarketType.tennisSet3Winner;
                        }
                        return null;
                    case 1176545052:
                        if (rawValue.equals("table_tennis_set_2_winner")) {
                            return SportsMarketType.tableTennisSet2Winner;
                        }
                        return null;
                    case 1727439918:
                        if (rawValue.equals("tennis_set_1_winner")) {
                            return SportsMarketType.tennisSet1Winner;
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -146335485:
                                if (rawValue.equals("esports_game_winner_1")) {
                                    return SportsMarketType.esportsGameWinner1;
                                }
                                return null;
                            case -146335484:
                                if (rawValue.equals("esports_game_winner_2")) {
                                    return SportsMarketType.esportsGameWinner2;
                                }
                                return null;
                            case -146335483:
                                if (rawValue.equals("esports_game_winner_3")) {
                                    return SportsMarketType.esportsGameWinner3;
                                }
                                return null;
                            case -146335482:
                                if (rawValue.equals("esports_game_winner_4")) {
                                    return SportsMarketType.esportsGameWinner4;
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 945711087:
                                        if (rawValue.equals("esports_map_winner_1")) {
                                            return SportsMarketType.esportsMapWinner1;
                                        }
                                        return null;
                                    case 945711088:
                                        if (rawValue.equals("esports_map_winner_2")) {
                                            return SportsMarketType.esportsMapWinner2;
                                        }
                                        return null;
                                    case 945711089:
                                        if (rawValue.equals("esports_map_winner_3")) {
                                            return SportsMarketType.esportsMapWinner3;
                                        }
                                        return null;
                                    case 945711090:
                                        if (rawValue.equals("esports_map_winner_4")) {
                                            return SportsMarketType.esportsMapWinner4;
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private SportsMarketType(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \r2\u00020\u0001:\u0004\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/polymarket/data/EMarket$UIType;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "StandardMarketCase", "SportsMarketCase", "NoneCase", "Companion", "Lcom/polymarket/data/EMarket$UIType$NoneCase;", "Lcom/polymarket/data/EMarket$UIType$SportsMarketCase;", "Lcom/polymarket/data/EMarket$UIType$StandardMarketCase;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class UIType implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final UIType none = new NoneCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/EMarket$UIType$NoneCase;", "Lcom/polymarket/data/EMarket$UIType;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class NoneCase extends UIType {
            public NoneCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/data/EMarket$UIType$SportsMarketCase;", "Lcom/polymarket/data/EMarket$UIType;", "associated0", "Lcom/polymarket/data/EMarket$SportsMarket;", "<init>", "(Lcom/polymarket/data/EMarket$SportsMarket;)V", "getAssociated0", "()Lcom/polymarket/data/EMarket$SportsMarket;", "market", "getMarket", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SportsMarketCase extends UIType {
            private final SportsMarket associated0;
            private final SportsMarket market;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SportsMarketCase(SportsMarket sportsMarket) {
                super(null);
                sportsMarket.getClass();
                this.associated0 = sportsMarket;
                this.market = sportsMarket;
            }

            public final SportsMarket getAssociated0() {
                return this.associated0;
            }

            public final SportsMarket getMarket() {
                return this.market;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/data/EMarket$UIType$StandardMarketCase;", "Lcom/polymarket/data/EMarket$UIType;", "associated0", "Lcom/polymarket/data/EMarket$StandardMarket;", "<init>", "(Lcom/polymarket/data/EMarket$StandardMarket;)V", "getAssociated0", "()Lcom/polymarket/data/EMarket$StandardMarket;", "market", "getMarket", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class StandardMarketCase extends UIType {
            private final StandardMarket associated0;
            private final StandardMarket market;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StandardMarketCase(StandardMarket standardMarket) {
                super(null);
                standardMarket.getClass();
                this.associated0 = standardMarket;
                this.market = standardMarket;
            }

            public final StandardMarket getAssociated0() {
                return this.associated0;
            }

            public final StandardMarket getMarket() {
                return this.market;
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
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/polymarket/data/EMarket$UIType$Companion;", "", "<init>", "()V", "standardMarket", "Lcom/polymarket/data/EMarket$UIType;", "market", "Lcom/polymarket/data/EMarket$StandardMarket;", "sportsMarket", "Lcom/polymarket/data/EMarket$SportsMarket;", "none", "getNone", "()Lcom/polymarket/data/EMarket$UIType;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final UIType getNone() {
                return UIType.access$getNone$cp();
            }

            public final UIType sportsMarket(SportsMarket market) {
                market.getClass();
                return new SportsMarketCase(market);
            }

            public final UIType standardMarket(StandardMarket market) {
                market.getClass();
                return new StandardMarketCase(market);
            }

            private Companion() {
            }
        }

        private UIType() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082 J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nJ\u0011\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nH\u0082 J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nJ\u0011\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nH\u0082 J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nJ\u0011\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nH\u0082 J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0011\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0013H\u0082 J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0013J\u0011\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0013H\u0082 J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aJ\u0011\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0082 J#\u0010 \u001a\u00020\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\"J\"\u0010#\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\u0010!\u001a\u0004\u0018\u00010\u0013H\u0082 ¢\u0006\u0002\u0010\"J\u0006\u0010$\u001a\u00020%J\t\u0010&\u001a\u00020%H\u0082 J\u0010\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020\u0011J\u0010\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010)\u001a\u00020\u001aR\u0014\u0010\u001d\u001a\u00020\u001aX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006,"}, d2 = {"Lcom/polymarket/data/EMarket$Companion;", "", "<init>", "()V", BuildConfig.FLAVOR, "Lcom/polymarket/data/EMarket;", "market", "Lcom/polymarket/data/EMarket$StandardMarket;", "Swift_Companion_standard_2", "sportsMoneyline", "Lcom/polymarket/data/EMarket$SportsMarket;", "Swift_Companion_sportsMoneyline_3", "sportsSpread", "Swift_Companion_sportsSpread_4", "sportsTotal", "Swift_Companion_sportsTotal_5", "priceDecimalPlaces", "", "forTick", "", "Swift_Companion_priceDecimalPlaces_8", "tick", "isDecimalized", "", "Swift_Companion_isDecimalized_9", "toAdvanceTitle", "", "base", "Swift_Companion_toAdvanceTitle_11", "untradeablePlaceholder", "getUntradeablePlaceholder", "()Ljava/lang/String;", "mockMarket", "minQty", "(Ljava/lang/Double;Ljava/lang/Double;)Lcom/polymarket/data/EMarket;", "Swift_Companion_mockMarket_23", "mockMarketSide", "Lcom/polymarket/data/EMarket$MarketSide;", "Swift_Companion_mockMarketSide_24", "ResolutionPhase", "Lcom/polymarket/data/EMarket$ResolutionPhase;", "rawValue", "SportsMarketType", "Lcom/polymarket/data/EMarket$SportsMarketType;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native boolean Swift_Companion_isDecimalized_9(double tick);

        private final native MarketSide Swift_Companion_mockMarketSide_24();

        private final native EMarket Swift_Companion_mockMarket_23(Double tick, Double minQty);

        private final native int Swift_Companion_priceDecimalPlaces_8(double tick);

        private final native EMarket Swift_Companion_sportsMoneyline_3(SportsMarket market);

        private final native EMarket Swift_Companion_sportsSpread_4(SportsMarket market);

        private final native EMarket Swift_Companion_sportsTotal_5(SportsMarket market);

        private final native EMarket Swift_Companion_standard_2(StandardMarket market);

        private final native String Swift_Companion_toAdvanceTitle_11(String base);

        public static /* synthetic */ EMarket mockMarket$default(Companion companion, Double d, Double d2, int i, Object obj) {
            if ((i & 1) != 0) {
                d = Double.valueOf(0.01d);
            }
            if ((i & 2) != 0) {
                d2 = null;
            }
            return companion.mockMarket(d, d2);
        }

        public final ResolutionPhase ResolutionPhase(int rawValue) {
            return ResolutionPhase.INSTANCE.init(rawValue);
        }

        public final SportsMarketType SportsMarketType(String rawValue) {
            rawValue.getClass();
            return SportsMarketType.INSTANCE.init(rawValue);
        }

        public final String getUntradeablePlaceholder() {
            return EMarket.access$getUntradeablePlaceholder$cp();
        }

        public final boolean isDecimalized(double tick) {
            return Swift_Companion_isDecimalized_9(tick);
        }

        public final EMarket mockMarket(Double tick, Double minQty) {
            return Swift_Companion_mockMarket_23(tick, minQty);
        }

        public final MarketSide mockMarketSide() {
            return Swift_Companion_mockMarketSide_24();
        }

        public final int priceDecimalPlaces(double forTick) {
            return Swift_Companion_priceDecimalPlaces_8(forTick);
        }

        public final EMarket sportsMoneyline(SportsMarket market) {
            market.getClass();
            return Swift_Companion_sportsMoneyline_3(market);
        }

        public final EMarket sportsSpread(SportsMarket market) {
            market.getClass();
            return Swift_Companion_sportsSpread_4(market);
        }

        public final EMarket sportsTotal(SportsMarket market) {
            market.getClass();
            return Swift_Companion_sportsTotal_5(market);
        }

        public final EMarket standard(StandardMarket market) {
            market.getClass();
            return Swift_Companion_standard_2(market);
        }

        public final String toAdvanceTitle(String base) {
            base.getClass();
            return Swift_Companion_toAdvanceTitle_11(base);
        }

        private Companion() {
        }
    }

    public EMarket(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public EMarket(SportsMarket sportsMarket) {
        sportsMarket.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(sportsMarket);
    }
}
