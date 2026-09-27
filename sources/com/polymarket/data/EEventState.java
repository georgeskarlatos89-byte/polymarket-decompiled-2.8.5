package com.polymarket.data;

import com.google.mlkit.vision.barcode.common.Barcode;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.NotificationStatuses;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import io.radar.sdk.RadarTrackingOptions;
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
import skip.lib.Hasher;
import skip.lib.MutableStruct;
import skip.lib.RawRepresentable;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b?\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 Ì\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0016Â\u0001Ã\u0001Ä\u0001Å\u0001Æ\u0001Ç\u0001È\u0001É\u0001Ê\u0001Ë\u0001Ì\u0001B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nBã\u0001\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010#\u001a\u00020$¢\u0006\u0004\b\t\u0010%B\u0011\b\u0012\u0012\u0006\u0010&\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010'J\u0006\u0010,\u001a\u00020-J\u0015\u0010.\u001a\u00020-2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010/\u001a\u00020\u001b2\b\u00100\u001a\u0004\u0018\u000101H\u0096\u0002J\b\u00102\u001a\u00020\fH\u0016J\u0015\u00105\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001c\u00108\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u00109J\u0017\u0010<\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010?\u001a\u0004\u0018\u00010\u00112\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010A\u001a\u0004\u0018\u00010\u00112\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010C\u001a\u0004\u0018\u00010\u00112\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010E\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010H\u001a\u0004\u0018\u00010\u00162\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010J\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010L\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010N\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010Q\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010S\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001c\u0010V\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010WJ\u001c\u0010Z\u001a\u0004\u0018\u00010\u001f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010[J\u001c\u0010]\u001a\u0004\u0018\u00010\u001f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010[J\u0017\u0010b\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010c\u001a\u00020-2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010d\u001a\u0004\u0018\u00010\u000fH\u0082 J\u001c\u0010h\u001a\u0004\u0018\u00010\u001f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010[J$\u0010i\u001a\u00020-2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010d\u001a\u0004\u0018\u00010\u001fH\u0082 ¢\u0006\u0002\u0010jJ\u0015\u0010o\u001a\u00020$2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010p\u001a\u00020-2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010d\u001a\u00020$H\u0082 J\u001b\u0010x\u001a\b\u0012\u0004\u0012\u00020r0q2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u0010y\u001a\u00020-2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\u0010d\u001a\b\u0012\u0004\u0012\u00020r0qH\u0082 JÈ\u0001\u0010z\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u000f2\b\u0010\"\u001a\u0004\u0018\u00010\u001f2\u0006\u0010#\u001a\u00020$H\u0082 ¢\u0006\u0002\u0010{J\u0016\u0010\u0080\u0001\u001a\u00020}2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u0082\u0001\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u0084\u0001\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u0086\u0001\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u0088\u0001\u001a\u00020\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008a\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008f\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0094\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u0099\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010¡\u0001\u001a\u0005\u0018\u00010\u009e\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010¤\u0001\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010¥\u0001\u001a\u0004\u0018\u00010\f2\u0007\u0010¦\u0001\u001a\u00020\u001b¢\u0006\u0003\u0010§\u0001J'\u0010¨\u0001\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010¦\u0001\u001a\u00020\u001bH\u0082 ¢\u0006\u0003\u0010©\u0001J\u001d\u0010ª\u0001\u001a\u0004\u0018\u00010\u000f2\u0007\u0010¦\u0001\u001a\u00020\u001b2\t\u0010«\u0001\u001a\u0004\u0018\u00010\u000fJ,\u0010¬\u0001\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010¦\u0001\u001a\u00020\u001b2\t\u0010«\u0001\u001a\u0004\u0018\u00010\u000fH\u0082 J\u0012\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u000f2\u0007\u0010®\u0001\u001a\u00020\u001bJ!\u0010¯\u0001\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010®\u0001\u001a\u00020\u001bH\u0082 J\u0012\u0010°\u0001\u001a\u0004\u0018\u00010\u000f2\u0007\u0010®\u0001\u001a\u00020\u001bJ!\u0010±\u0001\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010®\u0001\u001a\u00020\u001bH\u0082 J\u0016\u0010²\u0001\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010&\u001a\u00020\u0001H\u0082 J\t\u0010½\u0001\u001a\u00020\u0001H\u0016J\u0019\u0010¾\u0001\u001a\t\u0012\u0004\u0012\u0002010¿\u00012\u0007\u0010À\u0001\u001a\u00020\fH\u0016J\u001a\u0010Á\u0001\u001a\t\u0012\u0004\u0012\u0002010¿\u00012\u0007\u0010À\u0001\u001a\u00020\fH\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b@\u0010>R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bB\u0010>R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bD\u0010;R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bI\u0010;R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bK\u0010;R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bM\u0010;R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0011\u0010\u001c\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bR\u0010PR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0013\u0010 \u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b\\\u0010YR(\u0010!\u001a\u0004\u0018\u00010\u000f2\b\u0010^\u001a\u0004\u0018\u00010\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010;\"\u0004\b`\u0010aR(\u0010\"\u001a\u0004\u0018\u00010\u001f2\b\u0010^\u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\be\u0010Y\"\u0004\bf\u0010gR$\u0010#\u001a\u00020$2\u0006\u0010^\u001a\u00020$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR0\u0010s\u001a\b\u0012\u0004\u0012\u00020r0q2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020r0q8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u0011\u0010|\u001a\u00020}8F¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u0013\u0010\u0081\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010PR\u0013\u0010\u0083\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010PR\u0013\u0010\u0085\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010PR\u0013\u0010\u0087\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010PR\u0017\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u00018F¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0017\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u00018F¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0017\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0094\u00018F¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0017\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u00018F¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0017\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009e\u00018F¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0015\u0010¢\u0001\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0007\u001a\u0005\b£\u0001\u0010;R.\u0010³\u0001\u001a\u0011\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020-\u0018\u00010´\u0001X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R\u001e\u0010¹\u0001\u001a\u00020\fX\u0096\u000e¢\u0006\u0011\n\u0000\u001a\u0005\bº\u0001\u00104\"\u0006\b»\u0001\u0010¼\u0001¨\u0006Í\u0001"}, d2 = {"Lcom/polymarket/data/EEventState;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "gameId", "sportradarGameId", "", "createdAt", "Ljava/util/Date;", "updatedAt", "finishedTimestamp", "type", "score", "Lcom/polymarket/data/EEventState$Score;", "rawScore", "elapsed", "period", "live", "", "ended", "postponed", "mainSpreadLine", "", "mainTotalLine", "marketGroupId", "line", "sportState", "Lcom/polymarket/data/EEventState$SportState;", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/polymarket/data/EEventState$Score;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Lcom/polymarket/data/EEventState$SportState;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "other", "", "hashCode", "getId", "()I", "Swift_id", "getGameId", "()Ljava/lang/Integer;", "Swift_gameId", "(J)Ljava/lang/Integer;", "getSportradarGameId", "()Ljava/lang/String;", "Swift_sportradarGameId", "getCreatedAt", "()Ljava/util/Date;", "Swift_createdAt", "getUpdatedAt", "Swift_updatedAt", "getFinishedTimestamp", "Swift_finishedTimestamp", "getType", "Swift_type", "getScore", "()Lcom/polymarket/data/EEventState$Score;", "Swift_score", "getRawScore", "Swift_rawScore", "getElapsed", "Swift_elapsed", "getPeriod", "Swift_period", "getLive", "()Z", "Swift_live", "getEnded", "Swift_ended", "getPostponed", "()Ljava/lang/Boolean;", "Swift_postponed", "(J)Ljava/lang/Boolean;", "getMainSpreadLine", "()Ljava/lang/Double;", "Swift_mainSpreadLine", "(J)Ljava/lang/Double;", "getMainTotalLine", "Swift_mainTotalLine", "newValue", "getMarketGroupId", "setMarketGroupId", "(Ljava/lang/String;)V", "Swift_marketGroupId", "Swift_marketGroupId_set", "value", "getLine", "setLine", "(Ljava/lang/Double;)V", "Swift_line", "Swift_line_set", "(JLjava/lang/Double;)V", "getSportState", "()Lcom/polymarket/data/EEventState$SportState;", "setSportState", "(Lcom/polymarket/data/EEventState$SportState;)V", "Swift_sportState", "Swift_sportState_set", "", "Lcom/polymarket/data/EEventState$PeriodScore;", "periodScores", "getPeriodScores", "()Ljava/util/List;", "setPeriodScores", "(Ljava/util/List;)V", "Swift_periodScores", "Swift_periodScores_set", "Swift_constructor_0", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/polymarket/data/EEventState$Score;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Lcom/polymarket/data/EEventState$SportState;)J", "phase", "Lcom/polymarket/data/EEventState$GamePhase;", "getPhase", "()Lcom/polymarket/data/EEventState$GamePhase;", "Swift_phase", "isLive", "Swift_isLive", "isFinished", "Swift_isFinished", "isUpcoming", "Swift_isUpcoming", "isHalftime", "Swift_isHalftime", "footballState", "Lcom/polymarket/data/EEventState$FootballState;", "getFootballState", "()Lcom/polymarket/data/EEventState$FootballState;", "Swift_footballState", "ufcState", "Lcom/polymarket/data/EEventState$UFCState;", "getUfcState", "()Lcom/polymarket/data/EEventState$UFCState;", "Swift_ufcState", "tennisState", "Lcom/polymarket/data/EEventState$TennisState;", "getTennisState", "()Lcom/polymarket/data/EEventState$TennisState;", "Swift_tennisState", "soccerState", "Lcom/polymarket/data/EEventState$SoccerState;", "getSoccerState", "()Lcom/polymarket/data/EEventState$SoccerState;", "Swift_soccerState", "cricketState", "Lcom/polymarket/data/EEventState$CricketState;", "getCricketState", "()Lcom/polymarket/data/EEventState$CricketState;", "Swift_cricketState", "formattedPeriod", "getFormattedPeriod", "Swift_formattedPeriod", "teamScore", "isHome", "(Z)Ljava/lang/Integer;", "Swift_teamScore_1", "(JZ)Ljava/lang/Integer;", "teamScoreDisplay", "opticoddsTeamId", "Swift_teamScoreDisplay_2", "formattedElapsed", "isSoccer", "Swift_formattedElapsed_3", "formattedClockText", "Swift_formattedClockText_4", "Swift_constructor_5", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "GamePhase", "SportState", "Score", "PeriodScore", "FootballState", "UFCState", "TennisState", "SoccerState", "BaseballState", "CricketState", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EEventState implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0005IJKLMB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBY\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\u0016J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0015\u0010\u001d\u001a\u00020\u001c2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001b\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010#\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010$J\u001c\u0010&\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010$J\u0017\u0010)\u001a\u0004\u0018\u00010\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010,\u001a\u0004\u0018\u00010\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001d\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JX\u0010/\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000bH\u0082 ¢\u0006\u0002\u00100J\u0017\u00105\u001a\u0004\u0018\u0001022\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00108\u001a\u0004\u0018\u0001022\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010;\u001a\u0004\u0018\u0001022\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0096\u0002J\u0019\u0010@\u001a\u00020=2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u0000H\u0082 J\b\u0010C\u001a\u00020\u000eH\u0016J\u0015\u0010D\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010E\u001a\b\u0012\u0004\u0012\u00020?0F2\u0006\u0010G\u001a\u00020\u000eH\u0016J\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020?0F2\u0006\u0010G\u001a\u00020\u000eH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b%\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001fR\u0013\u00101\u001a\u0004\u0018\u0001028F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0013\u00106\u001a\u0004\u0018\u0001028F¢\u0006\u0006\u001a\u0004\b7\u00104R\u0013\u00109\u001a\u0004\u0018\u0001028F¢\u0006\u0006\u001a\u0004\b:\u00104¨\u0006N"}, d2 = {"Lcom/polymarket/data/EEventState$CricketState;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "innings", "", "Lcom/polymarket/data/EEventState$CricketState$Innings;", "currentInnings", "", "totalOvers", "chase", "Lcom/polymarket/data/EEventState$CricketState$Chase;", "phase", "Lcom/polymarket/data/EEventState$CricketState$Phase;", "currentOverBalls", "Lcom/polymarket/data/EEventState$CricketState$Ball;", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/polymarket/data/EEventState$CricketState$Chase;Lcom/polymarket/data/EEventState$CricketState$Phase;Ljava/util/List;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getInnings", "()Ljava/util/List;", "Swift_innings", "getCurrentInnings", "()Ljava/lang/Integer;", "Swift_currentInnings", "(J)Ljava/lang/Integer;", "getTotalOvers", "Swift_totalOvers", "getChase", "()Lcom/polymarket/data/EEventState$CricketState$Chase;", "Swift_chase", "getPhase", "()Lcom/polymarket/data/EEventState$CricketState$Phase;", "Swift_phase", "getCurrentOverBalls", "Swift_currentOverBalls", "Swift_constructor_0", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/polymarket/data/EEventState$CricketState$Chase;Lcom/polymarket/data/EEventState$CricketState$Phase;Ljava/util/List;)J", "formattedOvers", "", "getFormattedOvers", "()Ljava/lang/String;", "Swift_formattedOvers", "formattedBottomLine", "getFormattedBottomLine", "Swift_formattedBottomLine", "formattedBallsRemaining", "getFormattedBallsRemaining", "Swift_formattedBallsRemaining", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Phase", "Innings", "Chase", "Ball", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CricketState implements SwiftPeerBridged, SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private long Swift_peer;

        public /* synthetic */ CricketState(List list, Integer num, Integer num2, Chase chase, Phase phase, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : chase, (i & 16) != 0 ? null : phase, (i & 32) != 0 ? null : list2);
        }

        private final native Chase Swift_chase(long Swift_peer);

        private final native long Swift_constructor_0(List<Innings> innings, Integer currentInnings, Integer totalOvers, Chase chase, Phase phase, List<Ball> currentOverBalls);

        private final native Integer Swift_currentInnings(long Swift_peer);

        private final native List<Ball> Swift_currentOverBalls(long Swift_peer);

        private final native String Swift_formattedBallsRemaining(long Swift_peer);

        private final native String Swift_formattedBottomLine(long Swift_peer);

        private final native String Swift_formattedOvers(long Swift_peer);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native List<Innings> Swift_innings(long Swift_peer);

        private final native boolean Swift_isequal(CricketState lhs, CricketState rhs);

        private final native Phase Swift_phase(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native Integer Swift_totalOvers(long Swift_peer);

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
            if (!(other instanceof CricketState)) {
                return false;
            }
            return Swift_isequal(this, (CricketState) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final Chase getChase() {
            return Swift_chase(this.Swift_peer);
        }

        public final Integer getCurrentInnings() {
            return Swift_currentInnings(this.Swift_peer);
        }

        public final List<Ball> getCurrentOverBalls() {
            return Swift_currentOverBalls(this.Swift_peer);
        }

        public final String getFormattedBallsRemaining() {
            return Swift_formattedBallsRemaining(this.Swift_peer);
        }

        public final String getFormattedBottomLine() {
            return Swift_formattedBottomLine(this.Swift_peer);
        }

        public final String getFormattedOvers() {
            return Swift_formattedOvers(this.Swift_peer);
        }

        public final List<Innings> getInnings() {
            return Swift_innings(this.Swift_peer);
        }

        public final Phase getPhase() {
            return Swift_phase(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final Integer getTotalOvers() {
            return Swift_totalOvers(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u0002/0B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB-\b\u0016\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010\u001aJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010\u001aJ0\u0010 \u001a\u00060\u0004j\u0002`\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0082 ¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\u0019\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0000H\u0082 J\b\u0010)\u001a\u00020\u000bH\u0016J\u0015\u0010*\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020%0,2\u0006\u0010-\u001a\u00020\u000bH\u0016J\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020%0,2\u0006\u0010-\u001a\u00020\u000bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018¨\u00061"}, d2 = {"Lcom/polymarket/data/EEventState$CricketState$Ball;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", AttributeType.NUMBER, "", "outcome", "Lcom/polymarket/data/EEventState$CricketState$Ball$Outcome;", "runs", "(Ljava/lang/Integer;Lcom/polymarket/data/EEventState$CricketState$Ball$Outcome;Ljava/lang/Integer;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getNumber", "()Ljava/lang/Integer;", "Swift_number", "(J)Ljava/lang/Integer;", "getOutcome", "()Lcom/polymarket/data/EEventState$CricketState$Ball$Outcome;", "Swift_outcome", "getRuns", "Swift_runs", "Swift_constructor_0", "(Ljava/lang/Integer;Lcom/polymarket/data/EEventState$CricketState$Ball$Outcome;Ljava/lang/Integer;)J", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Outcome", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Ball implements SwiftPeerBridged, SwiftProjecting {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private long Swift_peer;

            public /* synthetic */ Ball(Integer num, Outcome outcome, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : outcome, (i & 4) != 0 ? null : num2);
            }

            private final native long Swift_constructor_0(Integer number, Outcome outcome, Integer runs);

            private final native long Swift_hashvalue(long Swift_peer);

            private final native boolean Swift_isequal(Ball lhs, Ball rhs);

            private final native Integer Swift_number(long Swift_peer);

            private final native Outcome Swift_outcome(long Swift_peer);

            private final native Function0<Object> Swift_projectionImpl(int options);

            private final native void Swift_release(long Swift_peer);

            private final native Integer Swift_runs(long Swift_peer);

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
                if (!(other instanceof Ball)) {
                    return false;
                }
                return Swift_isequal(this, (Ball) other);
            }

            public final void finalize() {
                Swift_release(this.Swift_peer);
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            }

            public final Integer getNumber() {
                return Swift_number(this.Swift_peer);
            }

            public final Outcome getOutcome() {
                return Swift_outcome(this.Swift_peer);
            }

            public final Integer getRuns() {
                return Swift_runs(this.Swift_peer);
            }

            public final long getSwift_peer() {
                return this.Swift_peer;
            }

            public int hashCode() {
                return Long.hashCode(Swift_hashvalue(this.Swift_peer));
            }

            public final void setSwift_peer(long j) {
                this.Swift_peer = j;
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0015B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0016"}, d2 = {"Lcom/polymarket/data/EEventState$CricketState$Ball$Outcome;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "dot", "runs", "wicket", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Outcome implements RawRepresentable<String>, SwiftProjecting {
                private static final /* synthetic */ ug7 $ENTRIES;
                private static final /* synthetic */ Outcome[] $VALUES;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                public static final Outcome dot = new Outcome("dot", 0, "dot", null, 2, null);
                public static final Outcome runs = new Outcome("runs", 1, "runs", null, 2, null);
                public static final Outcome wicket = new Outcome("wicket", 2, "wicket", null, 2, null);
                private final String rawValue;

                private static final /* synthetic */ Outcome[] $values() {
                    return new Outcome[]{dot, runs, wicket};
                }

                static {
                    Outcome[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = ww4.b($values);
                    INSTANCE = new Companion(null);
                }

                public /* synthetic */ Outcome(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, i, str2, (i2 & 2) != 0 ? null : r4);
                }

                private final native Function0<Object> Swift_projectionImpl(int options);

                public static ug7 getEntries() {
                    return $ENTRIES;
                }

                public static Outcome valueOf(String str) {
                    return (Outcome) Enum.valueOf(Outcome.class, str);
                }

                public static Outcome[] values() {
                    return (Outcome[]) $VALUES.clone();
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
                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EEventState$CricketState$Ball$Outcome$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EEventState$CricketState$Ball$Outcome;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
                /* loaded from: classes4.dex */
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final Outcome init(String rawValue) {
                        rawValue.getClass();
                        int hashCode = rawValue.hashCode();
                        if (hashCode != -788073239) {
                            if (hashCode != 99657) {
                                if (hashCode == 3512136 && rawValue.equals("runs")) {
                                    return Outcome.runs;
                                }
                                return null;
                            }
                            if (rawValue.equals("dot")) {
                                return Outcome.dot;
                            }
                            return null;
                        }
                        if (!rawValue.equals("wicket")) {
                            return null;
                        }
                        return Outcome.wicket;
                    }

                    private Companion() {
                    }
                }

                @Override // skip.lib.RawRepresentable
                public String getRawValue() {
                    return this.rawValue;
                }

                private Outcome(String str, int i, String str2, Void r4) {
                    this.rawValue = str2;
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EEventState$CricketState$Ball$Companion;", "", "<init>", "()V", "Outcome", "Lcom/polymarket/data/EEventState$CricketState$Ball$Outcome;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Outcome Outcome(String rawValue) {
                    rawValue.getClass();
                    return Outcome.INSTANCE.init(rawValue);
                }

                private Companion() {
                }
            }

            public Ball(Integer num, Outcome outcome, Integer num2) {
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = Swift_constructor_0(num, outcome, num2);
            }

            public Ball(long j, SwiftPeerMarker swiftPeerMarker) {
                BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = j;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0016B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0017"}, d2 = {"Lcom/polymarket/data/EEventState$CricketState$Phase;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "inProgress", "inningsBreak", "delayed", NotificationStatuses.COMPLETE_STATUS, "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Phase implements RawRepresentable<String>, SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ Phase[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final String rawValue;
            public static final Phase inProgress = new Phase("inProgress", 0, "in_progress", null, 2, null);
            public static final Phase inningsBreak = new Phase("inningsBreak", 1, "innings_break", null, 2, null);
            public static final Phase delayed = new Phase("delayed", 2, "delayed", null, 2, null);
            public static final Phase complete = new Phase(NotificationStatuses.COMPLETE_STATUS, 3, NotificationStatuses.COMPLETE_STATUS, null, 2, null);

            private static final /* synthetic */ Phase[] $values() {
                return new Phase[]{inProgress, inningsBreak, delayed, complete};
            }

            static {
                Phase[] $values = $values();
                $VALUES = $values;
                $ENTRIES = ww4.b($values);
                INSTANCE = new Companion(null);
            }

            public /* synthetic */ Phase(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, str2, (i2 & 2) != 0 ? null : r4);
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static ug7 getEntries() {
                return $ENTRIES;
            }

            public static Phase valueOf(String str) {
                return (Phase) Enum.valueOf(Phase.class, str);
            }

            public static Phase[] values() {
                return (Phase[]) $VALUES.clone();
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
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EEventState$CricketState$Phase$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EEventState$CricketState$Phase;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Phase init(String rawValue) {
                    rawValue.getClass();
                    switch (rawValue.hashCode()) {
                        case -753541113:
                            if (!rawValue.equals("in_progress")) {
                                return null;
                            }
                            return Phase.inProgress;
                        case -599445191:
                            if (rawValue.equals(NotificationStatuses.COMPLETE_STATUS)) {
                                return Phase.complete;
                            }
                            return null;
                        case 983238842:
                            if (rawValue.equals("innings_break")) {
                                return Phase.inningsBreak;
                            }
                            return null;
                        case 1550348642:
                            if (rawValue.equals("delayed")) {
                                return Phase.delayed;
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

            private Phase(String str, int i, String str2, Void r4) {
                this.rawValue = str2;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EEventState$CricketState$Companion;", "", "<init>", "()V", "Phase", "Lcom/polymarket/data/EEventState$CricketState$Phase;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Phase Phase(String rawValue) {
                rawValue.getClass();
                return Phase.INSTANCE.init(rawValue);
            }

            private Companion() {
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0015\b\u0016\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010\u0017J\u001c\u0010\u0018\u001a\u00060\u0004j\u0002`\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0082 ¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\u0019\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0000H\u0082 J\b\u0010!\u001a\u00020\u000bH\u0016J\u0015\u0010\"\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0$2\u0006\u0010%\u001a\u00020\u000bH\u0016J\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0$2\u0006\u0010%\u001a\u00020\u000bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006("}, d2 = {"Lcom/polymarket/data/EEventState$CricketState$Chase;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "ballsRemaining", "", "(Ljava/lang/Integer;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getBallsRemaining", "()Ljava/lang/Integer;", "Swift_ballsRemaining", "(J)Ljava/lang/Integer;", "Swift_constructor_0", "(Ljava/lang/Integer;)J", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Chase implements SwiftPeerBridged, SwiftProjecting {
            private long Swift_peer;

            public Chase(Integer num) {
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = Swift_constructor_0(num);
            }

            private final native Integer Swift_ballsRemaining(long Swift_peer);

            private final native long Swift_constructor_0(Integer ballsRemaining);

            private final native long Swift_hashvalue(long Swift_peer);

            private final native boolean Swift_isequal(Chase lhs, Chase rhs);

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
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Chase)) {
                    return false;
                }
                return Swift_isequal(this, (Chase) other);
            }

            public final void finalize() {
                Swift_release(this.Swift_peer);
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            }

            public final Integer getBallsRemaining() {
                return Swift_ballsRemaining(this.Swift_peer);
            }

            public final long getSwift_peer() {
                return this.Swift_peer;
            }

            public int hashCode() {
                return Long.hashCode(Swift_hashvalue(this.Swift_peer));
            }

            public final void setSwift_peer(long j) {
                this.Swift_peer = j;
            }

            public Chase(long j, SwiftPeerMarker swiftPeerMarker) {
                BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = j;
            }

            public /* synthetic */ Chase(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : num);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001=B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBE\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\b\u0010\u0014J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0015\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010\u001e\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010!\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010#\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010%\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010'\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010*\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010+J\u0015\u0010.\u001a\u00020\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JL\u0010/\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 ¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\u00132\b\u00102\u001a\u0004\u0018\u000103H\u0096\u0002J\u0019\u00104\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u0000H\u0082 J\b\u00107\u001a\u00020\u000bH\u0016J\u0015\u00108\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u00109\u001a\b\u0012\u0004\u0012\u0002030:2\u0006\u0010;\u001a\u00020\u000bH\u0016J\u0017\u0010<\u001a\b\u0012\u0004\u0012\u0002030:2\u0006\u0010;\u001a\u00020\u000bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u001dR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006>"}, d2 = {"Lcom/polymarket/data/EEventState$CricketState$Innings;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", AttributeType.NUMBER, "", "battingTeamId", "", "runs", "wickets", "oversCompleted", "ballsIntoOver", NotificationStatuses.COMPLETE_STATUS, "", "(ILjava/lang/String;IIILjava/lang/Integer;Z)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getNumber", "()I", "Swift_number", "getBattingTeamId", "()Ljava/lang/String;", "Swift_battingTeamId", "getRuns", "Swift_runs", "getWickets", "Swift_wickets", "getOversCompleted", "Swift_oversCompleted", "getBallsIntoOver", "()Ljava/lang/Integer;", "Swift_ballsIntoOver", "(J)Ljava/lang/Integer;", "getComplete", "()Z", "Swift_complete", "Swift_constructor_0", "(ILjava/lang/String;IIILjava/lang/Integer;Z)J", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Innings implements SwiftPeerBridged, SwiftProjecting {
            private long Swift_peer;

            public Innings(int i, String str, int i2, int i3, int i4, Integer num, boolean z) {
                str.getClass();
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = Swift_constructor_0(i, str, i2, i3, i4, num, z);
            }

            private final native Integer Swift_ballsIntoOver(long Swift_peer);

            private final native String Swift_battingTeamId(long Swift_peer);

            private final native boolean Swift_complete(long Swift_peer);

            private final native long Swift_constructor_0(int number, String battingTeamId, int runs, int wickets, int oversCompleted, Integer ballsIntoOver, boolean complete);

            private final native long Swift_hashvalue(long Swift_peer);

            private final native boolean Swift_isequal(Innings lhs, Innings rhs);

            private final native int Swift_number(long Swift_peer);

            private final native int Swift_oversCompleted(long Swift_peer);

            private final native Function0<Object> Swift_projectionImpl(int options);

            private final native void Swift_release(long Swift_peer);

            private final native int Swift_runs(long Swift_peer);

            private final native int Swift_wickets(long Swift_peer);

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
                if (!(other instanceof Innings)) {
                    return false;
                }
                return Swift_isequal(this, (Innings) other);
            }

            public final void finalize() {
                Swift_release(this.Swift_peer);
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            }

            public final Integer getBallsIntoOver() {
                return Swift_ballsIntoOver(this.Swift_peer);
            }

            public final String getBattingTeamId() {
                return Swift_battingTeamId(this.Swift_peer);
            }

            public final boolean getComplete() {
                return Swift_complete(this.Swift_peer);
            }

            public final int getNumber() {
                return Swift_number(this.Swift_peer);
            }

            public final int getOversCompleted() {
                return Swift_oversCompleted(this.Swift_peer);
            }

            public final int getRuns() {
                return Swift_runs(this.Swift_peer);
            }

            public final long getSwift_peer() {
                return this.Swift_peer;
            }

            public final int getWickets() {
                return Swift_wickets(this.Swift_peer);
            }

            public int hashCode() {
                return Long.hashCode(Swift_hashvalue(this.Swift_peer));
            }

            public final void setSwift_peer(long j) {
                this.Swift_peer = j;
            }

            public Innings(long j, SwiftPeerMarker swiftPeerMarker) {
                BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = j;
            }

            public /* synthetic */ Innings(int i, String str, int i2, int i3, int i4, Integer num, boolean z, int i5, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, str, i2, i3, i4, (i5 & 32) != 0 ? null : num, z);
            }
        }

        public CricketState(List<Innings> list, Integer num, Integer num2, Chase chase, Phase phase, List<Ball> list2) {
            list.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(list, num, num2, chase, phase, list2);
        }

        public CricketState(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ EEventState(int i, Integer num, String str, Date date, Date date2, Date date3, String str2, Score score, String str3, String str4, String str5, boolean z, boolean z2, Boolean bool, Double d, Double d2, String str6, Double d3, SportState sportState, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r2, r40);
        Integer num2;
        String str7;
        Date date4;
        Date date5;
        Date date6;
        String str8;
        Score score2;
        String str9;
        String str10;
        String str11;
        boolean z3;
        Boolean bool2;
        Double d4;
        Double d5;
        String str12;
        SportState sportState2;
        if ((i2 & 2) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i2 & 4) != 0) {
            str7 = null;
        } else {
            str7 = str;
        }
        if ((i2 & 8) != 0) {
            date4 = null;
        } else {
            date4 = date;
        }
        if ((i2 & 16) != 0) {
            date5 = null;
        } else {
            date5 = date2;
        }
        if ((i2 & 32) != 0) {
            date6 = null;
        } else {
            date6 = date3;
        }
        if ((i2 & 64) != 0) {
            str8 = null;
        } else {
            str8 = str2;
        }
        if ((i2 & 128) != 0) {
            score2 = null;
        } else {
            score2 = score;
        }
        if ((i2 & 256) != 0) {
            str9 = null;
        } else {
            str9 = str3;
        }
        if ((i2 & Barcode.FORMAT_UPC_A) != 0) {
            str10 = null;
        } else {
            str10 = str4;
        }
        if ((i2 & Barcode.FORMAT_UPC_E) != 0) {
            str11 = null;
        } else {
            str11 = str5;
        }
        if ((i2 & 2048) != 0) {
            z3 = false;
        } else {
            z3 = z;
        }
        boolean z4 = (i2 & 4096) == 0 ? z2 : false;
        if ((i2 & 8192) != 0) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        if ((i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            d4 = null;
        } else {
            d4 = d;
        }
        if ((i2 & 32768) != 0) {
            d5 = null;
        } else {
            d5 = d2;
        }
        if ((i2 & 65536) != 0) {
            str12 = null;
        } else {
            str12 = str6;
        }
        Double d6 = (i2 & 131072) == 0 ? d3 : null;
        if ((i2 & 262144) != 0) {
            sportState2 = SportState.INSTANCE.getGeneric();
        } else {
            sportState2 = sportState;
        }
    }

    private final native long Swift_constructor_0(int id, Integer gameId, String sportradarGameId, Date createdAt, Date updatedAt, Date finishedTimestamp, String type, Score score, String rawScore, String elapsed, String period, boolean live, boolean ended, Boolean postponed, Double mainSpreadLine, Double mainTotalLine, String marketGroupId, Double line, SportState sportState);

    private final native long Swift_constructor_5(MutableStruct copy);

    private final native Date Swift_createdAt(long Swift_peer);

    private final native CricketState Swift_cricketState(long Swift_peer);

    private final native String Swift_elapsed(long Swift_peer);

    private final native boolean Swift_ended(long Swift_peer);

    private final native Date Swift_finishedTimestamp(long Swift_peer);

    private final native FootballState Swift_footballState(long Swift_peer);

    private final native String Swift_formattedClockText_4(long Swift_peer, boolean isSoccer);

    private final native String Swift_formattedElapsed_3(long Swift_peer, boolean isSoccer);

    private final native String Swift_formattedPeriod(long Swift_peer);

    private final native Integer Swift_gameId(long Swift_peer);

    private final native int Swift_id(long Swift_peer);

    private final native boolean Swift_isFinished(long Swift_peer);

    private final native boolean Swift_isHalftime(long Swift_peer);

    private final native boolean Swift_isLive(long Swift_peer);

    private final native boolean Swift_isUpcoming(long Swift_peer);

    private final native Double Swift_line(long Swift_peer);

    private final native void Swift_line_set(long Swift_peer, Double value);

    private final native boolean Swift_live(long Swift_peer);

    private final native Double Swift_mainSpreadLine(long Swift_peer);

    private final native Double Swift_mainTotalLine(long Swift_peer);

    private final native String Swift_marketGroupId(long Swift_peer);

    private final native void Swift_marketGroupId_set(long Swift_peer, String value);

    private final native String Swift_period(long Swift_peer);

    private final native List<PeriodScore> Swift_periodScores(long Swift_peer);

    private final native void Swift_periodScores_set(long Swift_peer, List<PeriodScore> value);

    private final native GamePhase Swift_phase(long Swift_peer);

    private final native Boolean Swift_postponed(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_rawScore(long Swift_peer);

    private final native void Swift_release(long Swift_peer);

    private final native Score Swift_score(long Swift_peer);

    private final native SoccerState Swift_soccerState(long Swift_peer);

    private final native SportState Swift_sportState(long Swift_peer);

    private final native void Swift_sportState_set(long Swift_peer, SportState value);

    private final native String Swift_sportradarGameId(long Swift_peer);

    private final native String Swift_teamScoreDisplay_2(long Swift_peer, boolean isHome, String opticoddsTeamId);

    private final native Integer Swift_teamScore_1(long Swift_peer, boolean isHome);

    private final native TennisState Swift_tennisState(long Swift_peer);

    private final native String Swift_type(long Swift_peer);

    private final native UFCState Swift_ufcState(long Swift_peer);

    private final native Date Swift_updatedAt(long Swift_peer);

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

    public final String formattedClockText(boolean isSoccer) {
        return Swift_formattedClockText_4(this.Swift_peer, isSoccer);
    }

    public final String formattedElapsed(boolean isSoccer) {
        return Swift_formattedElapsed_3(this.Swift_peer, isSoccer);
    }

    public final Date getCreatedAt() {
        return Swift_createdAt(this.Swift_peer);
    }

    public final CricketState getCricketState() {
        return Swift_cricketState(this.Swift_peer);
    }

    public final String getElapsed() {
        return Swift_elapsed(this.Swift_peer);
    }

    public final boolean getEnded() {
        return Swift_ended(this.Swift_peer);
    }

    public final Date getFinishedTimestamp() {
        return Swift_finishedTimestamp(this.Swift_peer);
    }

    public final FootballState getFootballState() {
        return Swift_footballState(this.Swift_peer);
    }

    public final String getFormattedPeriod() {
        return Swift_formattedPeriod(this.Swift_peer);
    }

    public final Integer getGameId() {
        return Swift_gameId(this.Swift_peer);
    }

    public final int getId() {
        return Swift_id(this.Swift_peer);
    }

    public final Double getLine() {
        return Swift_line(this.Swift_peer);
    }

    public final boolean getLive() {
        return Swift_live(this.Swift_peer);
    }

    public final Double getMainSpreadLine() {
        return Swift_mainSpreadLine(this.Swift_peer);
    }

    public final Double getMainTotalLine() {
        return Swift_mainTotalLine(this.Swift_peer);
    }

    public final String getMarketGroupId() {
        return Swift_marketGroupId(this.Swift_peer);
    }

    public final String getPeriod() {
        return Swift_period(this.Swift_peer);
    }

    public final List<PeriodScore> getPeriodScores() {
        return Swift_periodScores(this.Swift_peer);
    }

    public final GamePhase getPhase() {
        return Swift_phase(this.Swift_peer);
    }

    public final Boolean getPostponed() {
        return Swift_postponed(this.Swift_peer);
    }

    public final String getRawScore() {
        return Swift_rawScore(this.Swift_peer);
    }

    public final Score getScore() {
        return Swift_score(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    public final SoccerState getSoccerState() {
        return Swift_soccerState(this.Swift_peer);
    }

    public final SportState getSportState() {
        return Swift_sportState(this.Swift_peer);
    }

    public final String getSportradarGameId() {
        return Swift_sportradarGameId(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final TennisState getTennisState() {
        return Swift_tennisState(this.Swift_peer);
    }

    public final String getType() {
        return Swift_type(this.Swift_peer);
    }

    public final UFCState getUfcState() {
        return Swift_ufcState(this.Swift_peer);
    }

    public final Date getUpdatedAt() {
        return Swift_updatedAt(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final boolean isFinished() {
        return Swift_isFinished(this.Swift_peer);
    }

    public final boolean isHalftime() {
        return Swift_isHalftime(this.Swift_peer);
    }

    public final boolean isLive() {
        return Swift_isLive(this.Swift_peer);
    }

    public final boolean isUpcoming() {
        return Swift_isUpcoming(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new EEventState(this);
    }

    public final void setLine(Double d) {
        willmutate();
        try {
            Swift_line_set(this.Swift_peer, d);
        } finally {
            didmutate();
        }
    }

    public final void setMarketGroupId(String str) {
        willmutate();
        try {
            Swift_marketGroupId_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setPeriodScores(List<PeriodScore> list) {
        list.getClass();
        List<PeriodScore> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_periodScores_set(this.Swift_peer, list2);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    public final void setSportState(SportState sportState) {
        sportState.getClass();
        willmutate();
        try {
            Swift_sportState_set(this.Swift_peer, sportState);
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

    public final Integer teamScore(boolean isHome) {
        return Swift_teamScore_1(this.Swift_peer, isHome);
    }

    public final String teamScoreDisplay(boolean isHome, String opticoddsTeamId) {
        return Swift_teamScoreDisplay_2(this.Swift_peer, isHome, opticoddsTeamId);
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0002<=B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBW\b\u0016\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\b\u0010\u0014J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0015\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010\u001fJ\u001c\u0010!\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010\u001fJ\u001c\u0010#\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010\u001fJ\u0015\u0010&\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010(\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010*\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010-\u001a\u0004\u0018\u00010\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JR\u0010.\u001a\u00060\u0004j\u0002`\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082 ¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u000102H\u0096\u0002J\u0019\u00103\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0000H\u0082 J\b\u00106\u001a\u00020\u000bH\u0016J\u0015\u00107\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u00108\u001a\b\u0012\u0004\u0012\u000202092\u0006\u0010:\u001a\u00020\u000bH\u0016J\u0017\u0010;\u001a\b\u0012\u0004\u0012\u000202092\u0006\u0010:\u001a\u00020\u000bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0011\u0010\u0011\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b)\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006>"}, d2 = {"Lcom/polymarket/data/EEventState$BaseballState;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "balls", "", "strikes", "outs", "onFirst", "", "onSecond", "onThird", "inningHalf", "Lcom/polymarket/data/EEventState$BaseballState$InningHalf;", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZZZLcom/polymarket/data/EEventState$BaseballState$InningHalf;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getBalls", "()Ljava/lang/Integer;", "Swift_balls", "(J)Ljava/lang/Integer;", "getStrikes", "Swift_strikes", "getOuts", "Swift_outs", "getOnFirst", "()Z", "Swift_onFirst", "getOnSecond", "Swift_onSecond", "getOnThird", "Swift_onThird", "getInningHalf", "()Lcom/polymarket/data/EEventState$BaseballState$InningHalf;", "Swift_inningHalf", "Swift_constructor_0", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZZZLcom/polymarket/data/EEventState$BaseballState$InningHalf;)J", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "InningHalf", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class BaseballState implements SwiftPeerBridged, SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private long Swift_peer;

        public /* synthetic */ BaseballState(Integer num, Integer num2, Integer num3, boolean z, boolean z2, boolean z3, InningHalf inningHalf, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? null : inningHalf);
        }

        private final native Integer Swift_balls(long Swift_peer);

        private final native long Swift_constructor_0(Integer balls, Integer strikes, Integer outs, boolean onFirst, boolean onSecond, boolean onThird, InningHalf inningHalf);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native InningHalf Swift_inningHalf(long Swift_peer);

        private final native boolean Swift_isequal(BaseballState lhs, BaseballState rhs);

        private final native boolean Swift_onFirst(long Swift_peer);

        private final native boolean Swift_onSecond(long Swift_peer);

        private final native boolean Swift_onThird(long Swift_peer);

        private final native Integer Swift_outs(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native Integer Swift_strikes(long Swift_peer);

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
            if (!(other instanceof BaseballState)) {
                return false;
            }
            return Swift_isequal(this, (BaseballState) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final Integer getBalls() {
            return Swift_balls(this.Swift_peer);
        }

        public final InningHalf getInningHalf() {
            return Swift_inningHalf(this.Swift_peer);
        }

        public final boolean getOnFirst() {
            return Swift_onFirst(this.Swift_peer);
        }

        public final boolean getOnSecond() {
            return Swift_onSecond(this.Swift_peer);
        }

        public final boolean getOnThird() {
            return Swift_onThird(this.Swift_peer);
        }

        public final Integer getOuts() {
            return Swift_outs(this.Swift_peer);
        }

        public final Integer getStrikes() {
            return Swift_strikes(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0014B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0015"}, d2 = {"Lcom/polymarket/data/EEventState$BaseballState$InningHalf;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", VerticalAlignment.TOP, VerticalAlignment.BOTTOM, "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class InningHalf implements RawRepresentable<String>, SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ InningHalf[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final String rawValue;
            public static final InningHalf top = new InningHalf(VerticalAlignment.TOP, 0, VerticalAlignment.TOP, null, 2, null);
            public static final InningHalf bottom = new InningHalf(VerticalAlignment.BOTTOM, 1, VerticalAlignment.BOTTOM, null, 2, null);

            private static final /* synthetic */ InningHalf[] $values() {
                return new InningHalf[]{top, bottom};
            }

            static {
                InningHalf[] $values = $values();
                $VALUES = $values;
                $ENTRIES = ww4.b($values);
                INSTANCE = new Companion(null);
            }

            public /* synthetic */ InningHalf(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, str2, (i2 & 2) != 0 ? null : r4);
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static ug7 getEntries() {
                return $ENTRIES;
            }

            public static InningHalf valueOf(String str) {
                return (InningHalf) Enum.valueOf(InningHalf.class, str);
            }

            public static InningHalf[] values() {
                return (InningHalf[]) $VALUES.clone();
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
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EEventState$BaseballState$InningHalf$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EEventState$BaseballState$InningHalf;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InningHalf init(String rawValue) {
                    rawValue.getClass();
                    if (Intrinsics.areEqual(rawValue, VerticalAlignment.TOP)) {
                        return InningHalf.top;
                    }
                    if (Intrinsics.areEqual(rawValue, VerticalAlignment.BOTTOM)) {
                        return InningHalf.bottom;
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

            private InningHalf(String str, int i, String str2, Void r4) {
                this.rawValue = str2;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EEventState$BaseballState$Companion;", "", "<init>", "()V", "InningHalf", "Lcom/polymarket/data/EEventState$BaseballState$InningHalf;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InningHalf InningHalf(String rawValue) {
                rawValue.getClass();
                return InningHalf.INSTANCE.init(rawValue);
            }

            private Companion() {
            }
        }

        public BaseballState(Integer num, Integer num2, Integer num3, boolean z, boolean z2, boolean z3, InningHalf inningHalf) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(num, num2, num3, z, z2, z3, inningHalf);
        }

        public BaseballState(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u00039:;B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010\u0015\u001a\u00020\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001a\u001a\u00020\u00172\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010&\u001a\u0004\u0018\u00010\u00122\u0006\u0010'\u001a\u00020\u001c¢\u0006\u0002\u0010(J$\u0010)\u001a\u0004\u0018\u00010\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010*\u001a\u00020\u001cH\u0082 ¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\u0019\u00100\u001a\u00020-2\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0000H\u0082 J\b\u00103\u001a\u00020\u0012H\u0016J\u0015\u00104\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020/062\u0006\u00107\u001a\u00020\u0012H\u0016J\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020/062\u0006\u00107\u001a\u00020\u0012H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006<"}, d2 = {"Lcom/polymarket/data/EEventState$PeriodScore;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", AttributeType.NUMBER, "", "getNumber", "()I", "Swift_number", "type", "Lcom/polymarket/data/EEventState$PeriodScore$PeriodType;", "getType", "()Lcom/polymarket/data/EEventState$PeriodScore$PeriodType;", "Swift_type", "label", "", "getLabel", "()Ljava/lang/String;", "Swift_label", "scores", "", "Lcom/polymarket/data/EEventState$PeriodScore$CompetitorScore;", "getScores", "()Ljava/util/List;", "Swift_scores", "score", "forCompetitorId", "(Ljava/lang/String;)Ljava/lang/Integer;", "Swift_score_0", "competitorId", "(JLjava/lang/String;)Ljava/lang/Integer;", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "PeriodType", "CompetitorScore", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PeriodScore implements SwiftPeerBridged, SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private long Swift_peer;

        public PeriodScore(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private final native long Swift_hashvalue(long Swift_peer);

        private final native boolean Swift_isequal(PeriodScore lhs, PeriodScore rhs);

        private final native String Swift_label(long Swift_peer);

        private final native int Swift_number(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native Integer Swift_score_0(long Swift_peer, String competitorId);

        private final native List<CompetitorScore> Swift_scores(long Swift_peer);

        private final native PeriodType Swift_type(long Swift_peer);

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
            if (!(other instanceof PeriodScore)) {
                return false;
            }
            return Swift_isequal(this, (PeriodScore) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getLabel() {
            return Swift_label(this.Swift_peer);
        }

        public final int getNumber() {
            return Swift_number(this.Swift_peer);
        }

        public final List<CompetitorScore> getScores() {
            return Swift_scores(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final PeriodType getType() {
            return Swift_type(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final Integer score(String forCompetitorId) {
            forCompetitorId.getClass();
            return Swift_score_0(this.Swift_peer, forCompetitorId);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0015B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0016"}, d2 = {"Lcom/polymarket/data/EEventState$PeriodScore$PeriodType;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "regulation", "overtime", "unknown", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class PeriodType implements RawRepresentable<String>, SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ PeriodType[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final String rawValue;
            public static final PeriodType regulation = new PeriodType("regulation", 0, "regulation", null, 2, null);
            public static final PeriodType overtime = new PeriodType("overtime", 1, "overtime", null, 2, null);
            public static final PeriodType unknown = new PeriodType("unknown", 2, "unknown", null, 2, null);

            private static final /* synthetic */ PeriodType[] $values() {
                return new PeriodType[]{regulation, overtime, unknown};
            }

            static {
                PeriodType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = ww4.b($values);
                INSTANCE = new Companion(null);
            }

            public /* synthetic */ PeriodType(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, str2, (i2 & 2) != 0 ? null : r4);
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static ug7 getEntries() {
                return $ENTRIES;
            }

            public static PeriodType valueOf(String str) {
                return (PeriodType) Enum.valueOf(PeriodType.class, str);
            }

            public static PeriodType[] values() {
                return (PeriodType[]) $VALUES.clone();
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
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EEventState$PeriodScore$PeriodType$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EEventState$PeriodScore$PeriodType;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final PeriodType init(String rawValue) {
                    rawValue.getClass();
                    int hashCode = rawValue.hashCode();
                    if (hashCode != -284840886) {
                        if (hashCode != -27333718) {
                            if (hashCode == 530056609 && rawValue.equals("overtime")) {
                                return PeriodType.overtime;
                            }
                            return null;
                        }
                        if (rawValue.equals("regulation")) {
                            return PeriodType.regulation;
                        }
                        return null;
                    }
                    if (!rawValue.equals("unknown")) {
                        return null;
                    }
                    return PeriodType.unknown;
                }

                private Companion() {
                }
            }

            @Override // skip.lib.RawRepresentable
            public String getRawValue() {
                return this.rawValue;
            }

            private PeriodType(String str, int i, String str2, Void r4) {
                this.rawValue = str2;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EEventState$PeriodScore$Companion;", "", "<init>", "()V", "PeriodType", "Lcom/polymarket/data/EEventState$PeriodScore$PeriodType;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final PeriodType PeriodType(String rawValue) {
                rawValue.getClass();
                return PeriodType.INSTANCE.init(rawValue);
            }

            private Companion() {
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010\u0018\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001b\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001d\u0010\u001c\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0082 J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\u0019\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0000H\u0082 J\b\u0010$\u001a\u00020\rH\u0016J\u0015\u0010%\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020 0'2\u0006\u0010(\u001a\u00020\rH\u0016J\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020 0'2\u0006\u0010(\u001a\u00020\rH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, d2 = {"Lcom/polymarket/data/EEventState$PeriodScore$CompetitorScore;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "competitorId", "", "score", "", "(Ljava/lang/String;I)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getCompetitorId", "()Ljava/lang/String;", "Swift_competitorId", "getScore", "()I", "Swift_score", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class CompetitorScore implements SwiftPeerBridged, SwiftProjecting {
            private long Swift_peer;

            public CompetitorScore(String str, int i) {
                str.getClass();
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = Swift_constructor_0(str, i);
            }

            private final native String Swift_competitorId(long Swift_peer);

            private final native long Swift_constructor_0(String competitorId, int score);

            private final native long Swift_hashvalue(long Swift_peer);

            private final native boolean Swift_isequal(CompetitorScore lhs, CompetitorScore rhs);

            private final native Function0<Object> Swift_projectionImpl(int options);

            private final native void Swift_release(long Swift_peer);

            private final native int Swift_score(long Swift_peer);

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
                if (!(other instanceof CompetitorScore)) {
                    return false;
                }
                return Swift_isequal(this, (CompetitorScore) other);
            }

            public final void finalize() {
                Swift_release(this.Swift_peer);
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            }

            public final String getCompetitorId() {
                return Swift_competitorId(this.Swift_peer);
            }

            public final int getScore() {
                return Swift_score(this.Swift_peer);
            }

            public final long getSwift_peer() {
                return this.Swift_peer;
            }

            public int hashCode() {
                return Long.hashCode(Swift_hashvalue(this.Swift_peer));
            }

            public final void setSwift_peer(long j) {
                this.Swift_peer = j;
            }

            public CompetitorScore(long j, SwiftPeerMarker swiftPeerMarker) {
                BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = j;
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0003,-.B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0017\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\b\u0010\rJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0015\u0010\u0014\u001a\u00020\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010\u0018\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082 J\u0010\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u001f\u0010\u001d\u001a\u00020\u001a2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0082 J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\u0019\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0000H\u0082 J\b\u0010&\u001a\u00020\u001aH\u0016J\u0015\u0010'\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0)2\u0006\u0010*\u001a\u00020\u001aH\u0016J\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\"0)2\u0006\u0010*\u001a\u00020\u001aH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006/"}, d2 = {"Lcom/polymarket/data/EEventState$SoccerState;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "shootoutAttempts", "", "Lcom/polymarket/data/EEventState$SoccerState$ShootoutAttempt;", "(Ljava/util/List;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getShootoutAttempts", "()Ljava/util/List;", "Swift_shootoutAttempts", "Swift_constructor_0", "shootoutScore", "", "for_", "", "Swift_shootoutScore_1", "competitorId", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "ShootoutAttempt", "Status", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SoccerState implements SwiftPeerBridged, SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private long Swift_peer;

        public SoccerState(List<ShootoutAttempt> list) {
            list.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(list);
        }

        private final native long Swift_constructor_0(List<ShootoutAttempt> shootoutAttempts);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native boolean Swift_isequal(SoccerState lhs, SoccerState rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native List<ShootoutAttempt> Swift_shootoutAttempts(long Swift_peer);

        private final native int Swift_shootoutScore_1(long Swift_peer, String competitorId);

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
            if (!(other instanceof SoccerState)) {
                return false;
            }
            return Swift_isequal(this, (SoccerState) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final List<ShootoutAttempt> getShootoutAttempts() {
            return Swift_shootoutAttempts(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public final int shootoutScore(String for_) {
            return Swift_shootoutScore_1(this.Swift_peer, for_);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0016B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0017"}, d2 = {"Lcom/polymarket/data/EEventState$SoccerState$Status;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "notTakenYet", "scored", "missed", "unspecified", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Status implements RawRepresentable<String>, SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ Status[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final String rawValue;
            public static final Status notTakenYet = new Status("notTakenYet", 0, "not_taken_yet", null, 2, null);
            public static final Status scored = new Status("scored", 1, "scored", null, 2, null);
            public static final Status missed = new Status("missed", 2, "missed", null, 2, null);
            public static final Status unspecified = new Status("unspecified", 3, "unspecified", null, 2, null);

            private static final /* synthetic */ Status[] $values() {
                return new Status[]{notTakenYet, scored, missed, unspecified};
            }

            static {
                Status[] $values = $values();
                $VALUES = $values;
                $ENTRIES = ww4.b($values);
                INSTANCE = new Companion(null);
            }

            public /* synthetic */ Status(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, str2, (i2 & 2) != 0 ? null : r4);
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static ug7 getEntries() {
                return $ENTRIES;
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
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
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EEventState$SoccerState$Status$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EEventState$SoccerState$Status;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Status init(String rawValue) {
                    rawValue.getClass();
                    switch (rawValue.hashCode()) {
                        case -1626174665:
                            if (!rawValue.equals("unspecified")) {
                                return null;
                            }
                            return Status.unspecified;
                        case -1073880421:
                            if (rawValue.equals("missed")) {
                                return Status.missed;
                            }
                            return null;
                        case -907766766:
                            if (rawValue.equals("scored")) {
                                return Status.scored;
                            }
                            return null;
                        case 1264131332:
                            if (rawValue.equals("not_taken_yet")) {
                                return Status.notTakenYet;
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

            private Status(String str, int i, String str2, Void r4) {
                this.rawValue = str2;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EEventState$SoccerState$Companion;", "", "<init>", "()V", "Status", "Lcom/polymarket/data/EEventState$SoccerState$Status;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Status Status(String rawValue) {
                rawValue.getClass();
                return Status.INSTANCE.init(rawValue);
            }

            private Companion() {
            }
        }

        public SoccerState(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB1\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u0015\u0010\u0017\u001a\u00020\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010\u001a\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001d\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010!\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J1\u0010\"\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0082 J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\u0019\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0000H\u0082 J\b\u0010*\u001a\u00020+H\u0016J\u0015\u0010,\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020&0.2\u0006\u0010/\u001a\u00020+H\u0016J\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020&0.2\u0006\u0010/\u001a\u00020+H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010\u0019¨\u00062"}, d2 = {"Lcom/polymarket/data/EEventState$SoccerState$ShootoutAttempt;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "competitorId", "", "status", "Lcom/polymarket/data/EEventState$SoccerState$Status;", "playerId", "playerName", "(Ljava/lang/String;Lcom/polymarket/data/EEventState$SoccerState$Status;Ljava/lang/String;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getCompetitorId", "()Ljava/lang/String;", "Swift_competitorId", "getStatus", "()Lcom/polymarket/data/EEventState$SoccerState$Status;", "Swift_status", "getPlayerId", "Swift_playerId", "getPlayerName", "Swift_playerName", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ShootoutAttempt implements SwiftPeerBridged, SwiftProjecting {
            private long Swift_peer;

            public ShootoutAttempt(String str, Status status, String str2, String str3) {
                str.getClass();
                status.getClass();
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = Swift_constructor_0(str, status, str2, str3);
            }

            private final native String Swift_competitorId(long Swift_peer);

            private final native long Swift_constructor_0(String competitorId, Status status, String playerId, String playerName);

            private final native long Swift_hashvalue(long Swift_peer);

            private final native boolean Swift_isequal(ShootoutAttempt lhs, ShootoutAttempt rhs);

            private final native String Swift_playerId(long Swift_peer);

            private final native String Swift_playerName(long Swift_peer);

            private final native Function0<Object> Swift_projectionImpl(int options);

            private final native void Swift_release(long Swift_peer);

            private final native Status Swift_status(long Swift_peer);

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
                if (!(other instanceof ShootoutAttempt)) {
                    return false;
                }
                return Swift_isequal(this, (ShootoutAttempt) other);
            }

            public final void finalize() {
                Swift_release(this.Swift_peer);
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            }

            public final String getCompetitorId() {
                return Swift_competitorId(this.Swift_peer);
            }

            public final String getPlayerId() {
                return Swift_playerId(this.Swift_peer);
            }

            public final String getPlayerName() {
                return Swift_playerName(this.Swift_peer);
            }

            public final Status getStatus() {
                return Swift_status(this.Swift_peer);
            }

            public final long getSwift_peer() {
                return this.Swift_peer;
            }

            public int hashCode() {
                return Long.hashCode(Swift_hashvalue(this.Swift_peer));
            }

            public final void setSwift_peer(long j) {
                this.Swift_peer = j;
            }

            public ShootoutAttempt(long j, SwiftPeerMarker swiftPeerMarker) {
                BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = j;
            }

            public /* synthetic */ ShootoutAttempt(String str, Status status, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, status, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0005JKLMNB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB[\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\b\u0010\u0018J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0015\u0010\u001f\u001a\u00020\u001e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010%\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010(\u001a\u0004\u0018\u00010\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010+\u001a\u0004\u0018\u00010\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010-\u001a\u0004\u0018\u00010\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u00100\u001a\u0004\u0018\u00010\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u00101J\u0015\u00104\u001a\u00020\u00172\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JZ\u00105\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0082 ¢\u0006\u0002\u00106J\u0017\u00109\u001a\u0004\u0018\u00010\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010<\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@H\u0096\u0002J\u0019\u0010A\u001a\u00020>2\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u0000H\u0082 J\b\u0010D\u001a\u00020\u0015H\u0016J\u0015\u0010E\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010F\u001a\b\u0012\u0004\u0012\u00020@0G2\u0006\u0010H\u001a\u00020\u0015H\u0016J\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020@0G2\u0006\u0010H\u001a\u00020\u0015H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u00107\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b8\u0010*R\u0011\u0010:\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b;\u0010$¨\u0006O"}, d2 = {"Lcom/polymarket/data/EEventState$TennisState;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "sets", "", "Lcom/polymarket/data/EEventState$TennisState$SetScore;", "currentSetGames", "Lcom/polymarket/data/EEventState$TennisState$GameScore;", "currentGamePoints", "Lcom/polymarket/data/EEventState$TennisState$PointScore;", "tournamentName", "", "round", "servingTeamId", "", "gameVariant", "Lcom/polymarket/data/EEventState$TennisState$GameVariant;", "(Ljava/util/List;Lcom/polymarket/data/EEventState$TennisState$GameScore;Lcom/polymarket/data/EEventState$TennisState$PointScore;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/polymarket/data/EEventState$TennisState$GameVariant;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getSets", "()Ljava/util/List;", "Swift_sets", "getCurrentSetGames", "()Lcom/polymarket/data/EEventState$TennisState$GameScore;", "Swift_currentSetGames", "getCurrentGamePoints", "()Lcom/polymarket/data/EEventState$TennisState$PointScore;", "Swift_currentGamePoints", "getTournamentName", "()Ljava/lang/String;", "Swift_tournamentName", "getRound", "Swift_round", "getServingTeamId", "()Ljava/lang/Integer;", "Swift_servingTeamId", "(J)Ljava/lang/Integer;", "getGameVariant", "()Lcom/polymarket/data/EEventState$TennisState$GameVariant;", "Swift_gameVariant", "Swift_constructor_0", "(Ljava/util/List;Lcom/polymarket/data/EEventState$TennisState$GameScore;Lcom/polymarket/data/EEventState$TennisState$PointScore;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/polymarket/data/EEventState$TennisState$GameVariant;)J", "formattedDetails", "getFormattedDetails", "Swift_formattedDetails", "setsWon", "getSetsWon", "Swift_setsWon", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "GameVariant", "SetScore", "GameScore", "PointScore", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class TennisState implements SwiftPeerBridged, SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private long Swift_peer;

        public /* synthetic */ TennisState(List list, GameScore gameScore, PointScore pointScore, String str, String str2, Integer num, GameVariant gameVariant, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : gameScore, (i & 4) != 0 ? null : pointScore, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : num, gameVariant);
        }

        private final native long Swift_constructor_0(List<SetScore> sets, GameScore currentSetGames, PointScore currentGamePoints, String tournamentName, String round, Integer servingTeamId, GameVariant gameVariant);

        private final native PointScore Swift_currentGamePoints(long Swift_peer);

        private final native GameScore Swift_currentSetGames(long Swift_peer);

        private final native String Swift_formattedDetails(long Swift_peer);

        private final native GameVariant Swift_gameVariant(long Swift_peer);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native boolean Swift_isequal(TennisState lhs, TennisState rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_round(long Swift_peer);

        private final native Integer Swift_servingTeamId(long Swift_peer);

        private final native List<SetScore> Swift_sets(long Swift_peer);

        private final native GameScore Swift_setsWon(long Swift_peer);

        private final native String Swift_tournamentName(long Swift_peer);

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
            if (!(other instanceof TennisState)) {
                return false;
            }
            return Swift_isequal(this, (TennisState) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final PointScore getCurrentGamePoints() {
            return Swift_currentGamePoints(this.Swift_peer);
        }

        public final GameScore getCurrentSetGames() {
            return Swift_currentSetGames(this.Swift_peer);
        }

        public final String getFormattedDetails() {
            return Swift_formattedDetails(this.Swift_peer);
        }

        public final GameVariant getGameVariant() {
            return Swift_gameVariant(this.Swift_peer);
        }

        public final String getRound() {
            return Swift_round(this.Swift_peer);
        }

        public final Integer getServingTeamId() {
            return Swift_servingTeamId(this.Swift_peer);
        }

        public final List<SetScore> getSets() {
            return Swift_sets(this.Swift_peer);
        }

        public final GameScore getSetsWon() {
            return Swift_setsWon(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getTournamentName() {
            return Swift_tournamentName(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0014B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0015"}, d2 = {"Lcom/polymarket/data/EEventState$TennisState$GameVariant;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "default", "tableTennis", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GameVariant implements RawRepresentable<String>, SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ GameVariant[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;

            /* renamed from: default, reason: not valid java name */
            public static final GameVariant f6default = new GameVariant("default", 0, "default", null, 2, null);
            public static final GameVariant tableTennis = new GameVariant("tableTennis", 1, "tableTennis", null, 2, null);
            private final String rawValue;

            private static final /* synthetic */ GameVariant[] $values() {
                return new GameVariant[]{f6default, tableTennis};
            }

            static {
                GameVariant[] $values = $values();
                $VALUES = $values;
                $ENTRIES = ww4.b($values);
                INSTANCE = new Companion(null);
            }

            public /* synthetic */ GameVariant(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, str2, (i2 & 2) != 0 ? null : r4);
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static ug7 getEntries() {
                return $ENTRIES;
            }

            public static GameVariant valueOf(String str) {
                return (GameVariant) Enum.valueOf(GameVariant.class, str);
            }

            public static GameVariant[] values() {
                return (GameVariant[]) $VALUES.clone();
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
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EEventState$TennisState$GameVariant$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EEventState$TennisState$GameVariant;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final GameVariant init(String rawValue) {
                    rawValue.getClass();
                    if (Intrinsics.areEqual(rawValue, "default")) {
                        return GameVariant.f6default;
                    }
                    if (Intrinsics.areEqual(rawValue, "tableTennis")) {
                        return GameVariant.tableTennis;
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

            private GameVariant(String str, int i, String str2, Void r4) {
                this.rawValue = str2;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EEventState$TennisState$Companion;", "", "<init>", "()V", "GameVariant", "Lcom/polymarket/data/EEventState$TennisState$GameVariant;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final GameVariant GameVariant(String rawValue) {
                rawValue.getClass();
                return GameVariant.INSTANCE.init(rawValue);
            }

            private Companion() {
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\rJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0015\u0010\u0014\u001a\u00020\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010\u0017\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u0019\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001d\u0010\u001a\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0082 J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\u0019\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0082 J\b\u0010\"\u001a\u00020\u000bH\u0016J\u0015\u0010#\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0%2\u0006\u0010&\u001a\u00020\u000bH\u0016J\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001e0%2\u0006\u0010&\u001a\u00020\u000bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006)"}, d2 = {"Lcom/polymarket/data/EEventState$TennisState$GameScore;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "home", "", "away", "(II)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getHome", "()I", "Swift_home", "getAway", "Swift_away", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GameScore implements SwiftPeerBridged, SwiftProjecting {
            private long Swift_peer;

            public GameScore(int i, int i2) {
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = Swift_constructor_0(i, i2);
            }

            private final native int Swift_away(long Swift_peer);

            private final native long Swift_constructor_0(int home, int away);

            private final native long Swift_hashvalue(long Swift_peer);

            private final native int Swift_home(long Swift_peer);

            private final native boolean Swift_isequal(GameScore lhs, GameScore rhs);

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
                if (other == this) {
                    return true;
                }
                if (!(other instanceof GameScore)) {
                    return false;
                }
                return Swift_isequal(this, (GameScore) other);
            }

            public final void finalize() {
                Swift_release(this.Swift_peer);
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            }

            public final int getAway() {
                return Swift_away(this.Swift_peer);
            }

            public final int getHome() {
                return Swift_home(this.Swift_peer);
            }

            public final long getSwift_peer() {
                return this.Swift_peer;
            }

            public int hashCode() {
                return Long.hashCode(Swift_hashvalue(this.Swift_peer));
            }

            public final void setSwift_peer(long j) {
                this.Swift_peer = j;
            }

            public GameScore(long j, SwiftPeerMarker swiftPeerMarker) {
                BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = j;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB%\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010\u0019\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001b\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J'\u0010\u001f\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0082 J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\u0019\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0082 J\b\u0010'\u001a\u00020\u000bH\u0016J\u0015\u0010(\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020#0*2\u0006\u0010+\u001a\u00020\u000bH\u0016J\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020#0*2\u0006\u0010+\u001a\u00020\u000bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, d2 = {"Lcom/polymarket/data/EEventState$TennisState$SetScore;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "home", "", "away", "tiebreak", "Lcom/polymarket/data/EEventState$TennisState$GameScore;", "(IILcom/polymarket/data/EEventState$TennisState$GameScore;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getHome", "()I", "Swift_home", "getAway", "Swift_away", "getTiebreak", "()Lcom/polymarket/data/EEventState$TennisState$GameScore;", "Swift_tiebreak", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SetScore implements SwiftPeerBridged, SwiftProjecting {
            private long Swift_peer;

            public SetScore(int i, int i2, GameScore gameScore) {
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = Swift_constructor_0(i, i2, gameScore);
            }

            private final native int Swift_away(long Swift_peer);

            private final native long Swift_constructor_0(int home, int away, GameScore tiebreak);

            private final native long Swift_hashvalue(long Swift_peer);

            private final native int Swift_home(long Swift_peer);

            private final native boolean Swift_isequal(SetScore lhs, SetScore rhs);

            private final native Function0<Object> Swift_projectionImpl(int options);

            private final native void Swift_release(long Swift_peer);

            private final native GameScore Swift_tiebreak(long Swift_peer);

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
                if (!(other instanceof SetScore)) {
                    return false;
                }
                return Swift_isequal(this, (SetScore) other);
            }

            public final void finalize() {
                Swift_release(this.Swift_peer);
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            }

            public final int getAway() {
                return Swift_away(this.Swift_peer);
            }

            public final int getHome() {
                return Swift_home(this.Swift_peer);
            }

            public final long getSwift_peer() {
                return this.Swift_peer;
            }

            public final GameScore getTiebreak() {
                return Swift_tiebreak(this.Swift_peer);
            }

            public int hashCode() {
                return Long.hashCode(Swift_hashvalue(this.Swift_peer));
            }

            public final void setSwift_peer(long j) {
                this.Swift_peer = j;
            }

            public SetScore(long j, SwiftPeerMarker swiftPeerMarker) {
                BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = j;
            }

            public /* synthetic */ SetScore(int i, int i2, GameScore gameScore, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, i2, (i3 & 4) != 0 ? null : gameScore);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\rJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0015\u0010\u0014\u001a\u00020\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010\u0017\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u0019\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001d\u0010\u001a\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0082 J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\u0019\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0082 J\b\u0010\"\u001a\u00020#H\u0016J\u0015\u0010$\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0&2\u0006\u0010'\u001a\u00020#H\u0016J\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001e0&2\u0006\u0010'\u001a\u00020#H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006*"}, d2 = {"Lcom/polymarket/data/EEventState$TennisState$PointScore;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "home", "", "away", "(Ljava/lang/String;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getHome", "()Ljava/lang/String;", "Swift_home", "getAway", "Swift_away", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class PointScore implements SwiftPeerBridged, SwiftProjecting {
            private long Swift_peer;

            public PointScore(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = Swift_constructor_0(str, str2);
            }

            private final native String Swift_away(long Swift_peer);

            private final native long Swift_constructor_0(String home, String away);

            private final native long Swift_hashvalue(long Swift_peer);

            private final native String Swift_home(long Swift_peer);

            private final native boolean Swift_isequal(PointScore lhs, PointScore rhs);

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
                if (other == this) {
                    return true;
                }
                if (!(other instanceof PointScore)) {
                    return false;
                }
                return Swift_isequal(this, (PointScore) other);
            }

            public final void finalize() {
                Swift_release(this.Swift_peer);
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            }

            public final String getAway() {
                return Swift_away(this.Swift_peer);
            }

            public final String getHome() {
                return Swift_home(this.Swift_peer);
            }

            public final long getSwift_peer() {
                return this.Swift_peer;
            }

            public int hashCode() {
                return Long.hashCode(Swift_hashvalue(this.Swift_peer));
            }

            public final void setSwift_peer(long j) {
                this.Swift_peer = j;
            }

            public PointScore(long j, SwiftPeerMarker swiftPeerMarker) {
                BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = j;
            }
        }

        public TennisState(List<SetScore> list, GameScore gameScore, PointScore pointScore, String str, String str2, Integer num, GameVariant gameVariant) {
            list.getClass();
            gameVariant.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(list, gameScore, pointScore, str, str2, num, gameVariant);
        }

        public TennisState(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0015B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0016"}, d2 = {"Lcom/polymarket/data/EEventState$GamePhase;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "upcoming", "live", "finished", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class GamePhase implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ GamePhase[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final GamePhase upcoming = new GamePhase("upcoming", 0, "upcoming", null, 2, null);
        public static final GamePhase live = new GamePhase("live", 1, "live", null, 2, null);
        public static final GamePhase finished = new GamePhase("finished", 2, "finished", null, 2, null);

        private static final /* synthetic */ GamePhase[] $values() {
            return new GamePhase[]{upcoming, live, finished};
        }

        static {
            GamePhase[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ GamePhase(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static GamePhase valueOf(String str) {
            return (GamePhase) Enum.valueOf(GamePhase.class, str);
        }

        public static GamePhase[] values() {
            return (GamePhase[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EEventState$GamePhase$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EEventState$GamePhase;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final GamePhase init(String rawValue) {
                rawValue.getClass();
                int hashCode = rawValue.hashCode();
                if (hashCode != -673660814) {
                    if (hashCode != 3322092) {
                        if (hashCode == 1306691868 && rawValue.equals("upcoming")) {
                            return GamePhase.upcoming;
                        }
                        return null;
                    }
                    if (rawValue.equals("live")) {
                        return GamePhase.live;
                    }
                    return null;
                }
                if (!rawValue.equals("finished")) {
                    return null;
                }
                return GamePhase.finished;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private GamePhase(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0007\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/polymarket/data/EEventState$SportState;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "FootballCase", "UfcCase", "TennisCase", "SoccerCase", "BaseballCase", "CricketCase", "GenericCase", "Companion", "Lcom/polymarket/data/EEventState$SportState$BaseballCase;", "Lcom/polymarket/data/EEventState$SportState$CricketCase;", "Lcom/polymarket/data/EEventState$SportState$FootballCase;", "Lcom/polymarket/data/EEventState$SportState$GenericCase;", "Lcom/polymarket/data/EEventState$SportState$SoccerCase;", "Lcom/polymarket/data/EEventState$SportState$TennisCase;", "Lcom/polymarket/data/EEventState$SportState$UfcCase;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class SportState implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final SportState generic = new GenericCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/data/EEventState$SportState$BaseballCase;", "Lcom/polymarket/data/EEventState$SportState;", "associated0", "Lcom/polymarket/data/EEventState$BaseballState;", "<init>", "(Lcom/polymarket/data/EEventState$BaseballState;)V", "getAssociated0", "()Lcom/polymarket/data/EEventState$BaseballState;", "equals", "", "other", "", "hashCode", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class BaseballCase extends SportState {
            private final BaseballState associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BaseballCase(BaseballState baseballState) {
                super(null);
                baseballState.getClass();
                this.associated0 = baseballState;
            }

            public boolean equals(Object other) {
                if (!(other instanceof BaseballCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((BaseballCase) other).associated0);
            }

            public final BaseballState getAssociated0() {
                return this.associated0;
            }

            public int hashCode() {
                return Hasher.INSTANCE.combine(1, this.associated0);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/data/EEventState$SportState$CricketCase;", "Lcom/polymarket/data/EEventState$SportState;", "associated0", "Lcom/polymarket/data/EEventState$CricketState;", "<init>", "(Lcom/polymarket/data/EEventState$CricketState;)V", "getAssociated0", "()Lcom/polymarket/data/EEventState$CricketState;", "equals", "", "other", "", "hashCode", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class CricketCase extends SportState {
            private final CricketState associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CricketCase(CricketState cricketState) {
                super(null);
                cricketState.getClass();
                this.associated0 = cricketState;
            }

            public boolean equals(Object other) {
                if (!(other instanceof CricketCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((CricketCase) other).associated0);
            }

            public final CricketState getAssociated0() {
                return this.associated0;
            }

            public int hashCode() {
                return Hasher.INSTANCE.combine(1, this.associated0);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/data/EEventState$SportState$FootballCase;", "Lcom/polymarket/data/EEventState$SportState;", "associated0", "Lcom/polymarket/data/EEventState$FootballState;", "<init>", "(Lcom/polymarket/data/EEventState$FootballState;)V", "getAssociated0", "()Lcom/polymarket/data/EEventState$FootballState;", "equals", "", "other", "", "hashCode", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class FootballCase extends SportState {
            private final FootballState associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FootballCase(FootballState footballState) {
                super(null);
                footballState.getClass();
                this.associated0 = footballState;
            }

            public boolean equals(Object other) {
                if (!(other instanceof FootballCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((FootballCase) other).associated0);
            }

            public final FootballState getAssociated0() {
                return this.associated0;
            }

            public int hashCode() {
                return Hasher.INSTANCE.combine(1, this.associated0);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/EEventState$SportState$GenericCase;", "Lcom/polymarket/data/EEventState$SportState;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class GenericCase extends SportState {
            public GenericCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/data/EEventState$SportState$SoccerCase;", "Lcom/polymarket/data/EEventState$SportState;", "associated0", "Lcom/polymarket/data/EEventState$SoccerState;", "<init>", "(Lcom/polymarket/data/EEventState$SoccerState;)V", "getAssociated0", "()Lcom/polymarket/data/EEventState$SoccerState;", "equals", "", "other", "", "hashCode", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SoccerCase extends SportState {
            private final SoccerState associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SoccerCase(SoccerState soccerState) {
                super(null);
                soccerState.getClass();
                this.associated0 = soccerState;
            }

            public boolean equals(Object other) {
                if (!(other instanceof SoccerCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((SoccerCase) other).associated0);
            }

            public final SoccerState getAssociated0() {
                return this.associated0;
            }

            public int hashCode() {
                return Hasher.INSTANCE.combine(1, this.associated0);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/data/EEventState$SportState$TennisCase;", "Lcom/polymarket/data/EEventState$SportState;", "associated0", "Lcom/polymarket/data/EEventState$TennisState;", "<init>", "(Lcom/polymarket/data/EEventState$TennisState;)V", "getAssociated0", "()Lcom/polymarket/data/EEventState$TennisState;", "equals", "", "other", "", "hashCode", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class TennisCase extends SportState {
            private final TennisState associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TennisCase(TennisState tennisState) {
                super(null);
                tennisState.getClass();
                this.associated0 = tennisState;
            }

            public boolean equals(Object other) {
                if (!(other instanceof TennisCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((TennisCase) other).associated0);
            }

            public final TennisState getAssociated0() {
                return this.associated0;
            }

            public int hashCode() {
                return Hasher.INSTANCE.combine(1, this.associated0);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/data/EEventState$SportState$UfcCase;", "Lcom/polymarket/data/EEventState$SportState;", "associated0", "Lcom/polymarket/data/EEventState$UFCState;", "<init>", "(Lcom/polymarket/data/EEventState$UFCState;)V", "getAssociated0", "()Lcom/polymarket/data/EEventState$UFCState;", "equals", "", "other", "", "hashCode", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class UfcCase extends SportState {
            private final UFCState associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UfcCase(UFCState uFCState) {
                super(null);
                uFCState.getClass();
                this.associated0 = uFCState;
            }

            public boolean equals(Object other) {
                if (!(other instanceof UfcCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((UfcCase) other).associated0);
            }

            public final UFCState getAssociated0() {
                return this.associated0;
            }

            public int hashCode() {
                return Hasher.INSTANCE.combine(1, this.associated0);
            }
        }

        public /* synthetic */ SportState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ SportState access$getGeneric$cp() {
            return generic;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0011R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/polymarket/data/EEventState$SportState$Companion;", "", "<init>", "()V", "football", "Lcom/polymarket/data/EEventState$SportState;", "associated0", "Lcom/polymarket/data/EEventState$FootballState;", "ufc", "Lcom/polymarket/data/EEventState$UFCState;", "tennis", "Lcom/polymarket/data/EEventState$TennisState;", "soccer", "Lcom/polymarket/data/EEventState$SoccerState;", "baseball", "Lcom/polymarket/data/EEventState$BaseballState;", "cricket", "Lcom/polymarket/data/EEventState$CricketState;", "generic", "getGeneric", "()Lcom/polymarket/data/EEventState$SportState;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SportState baseball(BaseballState associated0) {
                associated0.getClass();
                return new BaseballCase(associated0);
            }

            public final SportState cricket(CricketState associated0) {
                associated0.getClass();
                return new CricketCase(associated0);
            }

            public final SportState football(FootballState associated0) {
                associated0.getClass();
                return new FootballCase(associated0);
            }

            public final SportState getGeneric() {
                return SportState.access$getGeneric$cp();
            }

            public final SportState soccer(SoccerState associated0) {
                associated0.getClass();
                return new SoccerCase(associated0);
            }

            public final SportState tennis(TennisState associated0) {
                associated0.getClass();
                return new TennisCase(associated0);
            }

            public final SportState ufc(UFCState associated0) {
                associated0.getClass();
                return new UfcCase(associated0);
            }

            private Companion() {
            }
        }

        private SportState() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EEventState$Companion;", "", "<init>", "()V", "GamePhase", "Lcom/polymarket/data/EEventState$GamePhase;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final GamePhase GamePhase(String rawValue) {
            rawValue.getClass();
            return GamePhase.INSTANCE.init(rawValue);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0004@ABCB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010 \u001a\u0004\u0018\u00010\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00182\u0006\u0010!\u001a\u00020\u001dJ\u001f\u0010\"\u001a\u0004\u0018\u00010\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010#\u001a\u00020\u001dH\u0082 J\u0017\u0010&\u001a\u0004\u0018\u00010\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010)\u001a\u0004\u0018\u00010\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010*\u001a\u0004\u0018\u00010\u001d2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0017J%\u0010-\u001a\u0004\u0018\u00010\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0017H\u0082 J\u0016\u0010.\u001a\u0004\u0018\u00010\u001d2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0017J%\u0010/\u001a\u0004\u0018\u00010\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0017H\u0082 J\u0016\u00100\u001a\u0004\u0018\u00010\u001d2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0017J%\u00101\u001a\u0004\u0018\u00010\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0017H\u0082 J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0096\u0002J\u0019\u00106\u001a\u0002032\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u0000H\u0082 J\b\u00109\u001a\u00020:H\u0016J\u0015\u0010;\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u0002050=2\u0006\u0010>\u001a\u00020:H\u0016J\u0017\u0010?\u001a\b\u0012\u0004\u0012\u0002050=2\u0006\u0010>\u001a\u00020:H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010$\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR\u0013\u0010'\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001f¨\u0006D"}, d2 = {"Lcom/polymarket/data/EEventState$FootballState;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "driveState", "Lcom/polymarket/data/EEventState$FootballState$DriveState;", "getDriveState", "()Lcom/polymarket/data/EEventState$FootballState$DriveState;", "Swift_driveState", "timeouts", "", "Lcom/polymarket/data/EEventState$FootballState$TeamTimeouts;", "getTimeouts", "()Ljava/util/List;", "Swift_timeouts", "possessionTeamId", "", "getPossessionTeamId", "()Ljava/lang/String;", "Swift_possessionTeamId", "forTeamId", "Swift_timeouts_0", "teamId", "formattedDownAndDistance", "getFormattedDownAndDistance", "Swift_formattedDownAndDistance", "compactDownAndDistance", "getCompactDownAndDistance", "Swift_compactDownAndDistance", "formattedFieldPosition", "teams", "Lcom/polymarket/data/ESportsTeam;", "Swift_formattedFieldPosition_1", "formattedDrive", "Swift_formattedDrive_2", "compactDrive", "Swift_compactDrive_3", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "DriveState", "FieldPosition", "TeamTimeouts", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class FootballState implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public FootballState(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private final native String Swift_compactDownAndDistance(long Swift_peer);

        private final native String Swift_compactDrive_3(long Swift_peer, List<ESportsTeam> teams);

        private final native DriveState Swift_driveState(long Swift_peer);

        private final native String Swift_formattedDownAndDistance(long Swift_peer);

        private final native String Swift_formattedDrive_2(long Swift_peer, List<ESportsTeam> teams);

        private final native String Swift_formattedFieldPosition_1(long Swift_peer, List<ESportsTeam> teams);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native boolean Swift_isequal(FootballState lhs, FootballState rhs);

        private final native String Swift_possessionTeamId(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native List<TeamTimeouts> Swift_timeouts(long Swift_peer);

        private final native TeamTimeouts Swift_timeouts_0(long Swift_peer, String teamId);

        @Override // skip.bridge.SwiftPeerBridged
        /* renamed from: Swift_peer, reason: from getter */
        public long getSwift_peer() {
            return this.Swift_peer;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final String compactDrive(List<ESportsTeam> teams) {
            teams.getClass();
            return Swift_compactDrive_3(this.Swift_peer, teams);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof FootballState)) {
                return false;
            }
            return Swift_isequal(this, (FootballState) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String formattedDrive(List<ESportsTeam> teams) {
            teams.getClass();
            return Swift_formattedDrive_2(this.Swift_peer, teams);
        }

        public final String formattedFieldPosition(List<ESportsTeam> teams) {
            teams.getClass();
            return Swift_formattedFieldPosition_1(this.Swift_peer, teams);
        }

        public final String getCompactDownAndDistance() {
            return Swift_compactDownAndDistance(this.Swift_peer);
        }

        public final DriveState getDriveState() {
            return Swift_driveState(this.Swift_peer);
        }

        public final String getFormattedDownAndDistance() {
            return Swift_formattedDownAndDistance(this.Swift_peer);
        }

        public final String getPossessionTeamId() {
            return Swift_possessionTeamId(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final List<TeamTimeouts> getTimeouts() {
            return Swift_timeouts(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public final TeamTimeouts timeouts(String forTeamId) {
            forTeamId.getClass();
            return Swift_timeouts_0(this.Swift_peer, forTeamId);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010\u001b\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010\u001cJ&\u0010\u001d\u001a\u00060\u0004j\u0002`\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0082 ¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\u0019\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0000H\u0082 J\b\u0010&\u001a\u00020\rH\u0016J\u0015\u0010'\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0)2\u0006\u0010*\u001a\u00020\rH\u0016J\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\"0)2\u0006\u0010*\u001a\u00020\rH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006-"}, d2 = {"Lcom/polymarket/data/EEventState$FootballState$FieldPosition;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "teamId", "", "yard", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getTeamId", "()Ljava/lang/String;", "Swift_teamId", "getYard", "()Ljava/lang/Integer;", "Swift_yard", "(J)Ljava/lang/Integer;", "Swift_constructor_0", "(Ljava/lang/String;Ljava/lang/Integer;)J", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class FieldPosition implements SwiftPeerBridged, SwiftProjecting {
            private long Swift_peer;

            public FieldPosition(String str, Integer num) {
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = Swift_constructor_0(str, num);
            }

            private final native long Swift_constructor_0(String teamId, Integer yard);

            private final native long Swift_hashvalue(long Swift_peer);

            private final native boolean Swift_isequal(FieldPosition lhs, FieldPosition rhs);

            private final native Function0<Object> Swift_projectionImpl(int options);

            private final native void Swift_release(long Swift_peer);

            private final native String Swift_teamId(long Swift_peer);

            private final native Integer Swift_yard(long Swift_peer);

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
                if (!(other instanceof FieldPosition)) {
                    return false;
                }
                return Swift_isequal(this, (FieldPosition) other);
            }

            public final void finalize() {
                Swift_release(this.Swift_peer);
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            }

            public final long getSwift_peer() {
                return this.Swift_peer;
            }

            public final String getTeamId() {
                return Swift_teamId(this.Swift_peer);
            }

            public final Integer getYard() {
                return Swift_yard(this.Swift_peer);
            }

            public int hashCode() {
                return Long.hashCode(Swift_hashvalue(this.Swift_peer));
            }

            public final void setSwift_peer(long j) {
                this.Swift_peer = j;
            }

            public FieldPosition(long j, SwiftPeerMarker swiftPeerMarker) {
                BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = j;
            }

            public /* synthetic */ FieldPosition(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB-\b\u0016\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010\u001c\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010\u001dJ\u001c\u0010\u001f\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010\u001dJ0\u0010 \u001a\u00060\u0004j\u0002`\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082 ¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\u0019\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0000H\u0082 J\b\u0010)\u001a\u00020\rH\u0016J\u0015\u0010*\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020%0,2\u0006\u0010-\u001a\u00020\rH\u0016J\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020%0,2\u0006\u0010-\u001a\u00020\rH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001b¨\u00060"}, d2 = {"Lcom/polymarket/data/EEventState$FootballState$TeamTimeouts;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "teamId", "", "used", "", "remaining", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getTeamId", "()Ljava/lang/String;", "Swift_teamId", "getUsed", "()Ljava/lang/Integer;", "Swift_used", "(J)Ljava/lang/Integer;", "getRemaining", "Swift_remaining", "Swift_constructor_0", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)J", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class TeamTimeouts implements SwiftPeerBridged, SwiftProjecting {
            private long Swift_peer;

            public /* synthetic */ TeamTimeouts(String str, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
            }

            private final native long Swift_constructor_0(String teamId, Integer used, Integer remaining);

            private final native long Swift_hashvalue(long Swift_peer);

            private final native boolean Swift_isequal(TeamTimeouts lhs, TeamTimeouts rhs);

            private final native Function0<Object> Swift_projectionImpl(int options);

            private final native void Swift_release(long Swift_peer);

            private final native Integer Swift_remaining(long Swift_peer);

            private final native String Swift_teamId(long Swift_peer);

            private final native Integer Swift_used(long Swift_peer);

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
                if (!(other instanceof TeamTimeouts)) {
                    return false;
                }
                return Swift_isequal(this, (TeamTimeouts) other);
            }

            public final void finalize() {
                Swift_release(this.Swift_peer);
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            }

            public final Integer getRemaining() {
                return Swift_remaining(this.Swift_peer);
            }

            public final long getSwift_peer() {
                return this.Swift_peer;
            }

            public final String getTeamId() {
                return Swift_teamId(this.Swift_peer);
            }

            public final Integer getUsed() {
                return Swift_used(this.Swift_peer);
            }

            public int hashCode() {
                return Long.hashCode(Swift_hashvalue(this.Swift_peer));
            }

            public final void setSwift_peer(long j) {
                this.Swift_peer = j;
            }

            public TeamTimeouts(String str, Integer num, Integer num2) {
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = Swift_constructor_0(str, num, num2);
            }

            public TeamTimeouts(long j, SwiftPeerMarker swiftPeerMarker) {
                BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = j;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00017B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBE\b\u0016\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\b\u0010\u0012J\u0006\u0010\u0017\u001a\u00020\u0018J\u0015\u0010\u0019\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010\u001dJ\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010\u001dJ\u0017\u0010\"\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010%\u001a\u0004\u0018\u00010\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010'\u001a\u0004\u0018\u00010\u00102\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JD\u0010(\u001a\u00060\u0004j\u0002`\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082 ¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0096\u0002J\u0019\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0000H\u0082 J\b\u00101\u001a\u00020\u000bH\u0016J\u0015\u00102\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020-042\u0006\u00105\u001a\u00020\u000bH\u0016J\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020-042\u0006\u00105\u001a\u00020\u000bH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u00068"}, d2 = {"Lcom/polymarket/data/EEventState$FootballState$DriveState;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "down", "", "yardsToFirstDown", "possessionTeamId", "", "fieldPosition", "Lcom/polymarket/data/EEventState$FootballState$FieldPosition;", "startFieldPosition", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/polymarket/data/EEventState$FootballState$FieldPosition;Lcom/polymarket/data/EEventState$FootballState$FieldPosition;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getDown", "()Ljava/lang/Integer;", "Swift_down", "(J)Ljava/lang/Integer;", "getYardsToFirstDown", "Swift_yardsToFirstDown", "getPossessionTeamId", "()Ljava/lang/String;", "Swift_possessionTeamId", "getFieldPosition", "()Lcom/polymarket/data/EEventState$FootballState$FieldPosition;", "Swift_fieldPosition", "getStartFieldPosition", "Swift_startFieldPosition", "Swift_constructor_0", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/polymarket/data/EEventState$FootballState$FieldPosition;Lcom/polymarket/data/EEventState$FootballState$FieldPosition;)J", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class DriveState implements SwiftPeerBridged, SwiftProjecting {
            private long Swift_peer;

            public /* synthetic */ DriveState(Integer num, Integer num2, String str, FieldPosition fieldPosition, FieldPosition fieldPosition2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : fieldPosition, (i & 16) != 0 ? null : fieldPosition2);
            }

            private final native long Swift_constructor_0(Integer down, Integer yardsToFirstDown, String possessionTeamId, FieldPosition fieldPosition, FieldPosition startFieldPosition);

            private final native Integer Swift_down(long Swift_peer);

            private final native FieldPosition Swift_fieldPosition(long Swift_peer);

            private final native long Swift_hashvalue(long Swift_peer);

            private final native boolean Swift_isequal(DriveState lhs, DriveState rhs);

            private final native String Swift_possessionTeamId(long Swift_peer);

            private final native Function0<Object> Swift_projectionImpl(int options);

            private final native void Swift_release(long Swift_peer);

            private final native FieldPosition Swift_startFieldPosition(long Swift_peer);

            private final native Integer Swift_yardsToFirstDown(long Swift_peer);

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
                if (!(other instanceof DriveState)) {
                    return false;
                }
                return Swift_isequal(this, (DriveState) other);
            }

            public final void finalize() {
                Swift_release(this.Swift_peer);
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            }

            public final Integer getDown() {
                return Swift_down(this.Swift_peer);
            }

            public final FieldPosition getFieldPosition() {
                return Swift_fieldPosition(this.Swift_peer);
            }

            public final String getPossessionTeamId() {
                return Swift_possessionTeamId(this.Swift_peer);
            }

            public final FieldPosition getStartFieldPosition() {
                return Swift_startFieldPosition(this.Swift_peer);
            }

            public final long getSwift_peer() {
                return this.Swift_peer;
            }

            public final Integer getYardsToFirstDown() {
                return Swift_yardsToFirstDown(this.Swift_peer);
            }

            public int hashCode() {
                return Long.hashCode(Swift_hashvalue(this.Swift_peer));
            }

            public final void setSwift_peer(long j) {
                this.Swift_peer = j;
            }

            public DriveState(Integer num, Integer num2, String str, FieldPosition fieldPosition, FieldPosition fieldPosition2) {
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = Swift_constructor_0(num, num2, str, fieldPosition, fieldPosition2);
            }

            public DriveState(long j, SwiftPeerMarker swiftPeerMarker) {
                BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = j;
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010\u0019\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001c\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001e\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J%\u0010\u001f\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0082 J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\u0019\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0082 J\b\u0010'\u001a\u00020\rH\u0016J\u0015\u0010(\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020#0*2\u0006\u0010+\u001a\u00020\rH\u0016J\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020#0*2\u0006\u0010+\u001a\u00020\rH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b¨\u0006."}, d2 = {"Lcom/polymarket/data/EEventState$Score;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "raw", "", "primary", "", "secondary", "(Ljava/lang/String;II)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getRaw", "()Ljava/lang/String;", "Swift_raw", "getPrimary", "()I", "Swift_primary", "getSecondary", "Swift_secondary", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Score implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Score(String str, int i, int i2) {
            str.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, i, i2);
        }

        private final native long Swift_constructor_0(String raw, int primary, int secondary);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native boolean Swift_isequal(Score lhs, Score rhs);

        private final native int Swift_primary(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native String Swift_raw(long Swift_peer);

        private final native void Swift_release(long Swift_peer);

        private final native int Swift_secondary(long Swift_peer);

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
            if (!(other instanceof Score)) {
                return false;
            }
            return Swift_isequal(this, (Score) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final int getPrimary() {
            return Swift_primary(this.Swift_peer);
        }

        public final String getRaw() {
            return Swift_raw(this.Swift_peer);
        }

        public final int getSecondary() {
            return Swift_secondary(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public Score(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 X2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001XB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB]\b\u0016\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u0014B\u0011\b\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0016J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0015\u0010\u001d\u001a\u00020\u001c2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0017\u0010#\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010$\u001a\u00020\u001c2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010%\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u0010(\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010)\u001a\u00020\u001c2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010%\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u0010,\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010-\u001a\u00020\u001c2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010%\u001a\u0004\u0018\u00010\fH\u0082 J\u001c\u00102\u001a\u0004\u0018\u00010\u00102\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u00103J$\u00104\u001a\u00020\u001c2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0010H\u0082 ¢\u0006\u0002\u00105J\u001c\u00107\u001a\u0004\u0018\u00010\u00102\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u00103J\u0017\u00109\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010;\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 JX\u0010<\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0082 ¢\u0006\u0002\u0010=J\u0015\u0010>\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0015\u001a\u00020\u0001H\u0082 J\b\u0010K\u001a\u00020\u0001H\u0016J\u0013\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010AH\u0096\u0002J\u0019\u0010O\u001a\u00020M2\u0006\u0010P\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u0000H\u0082 J\b\u0010R\u001a\u00020\u0010H\u0016J\u0015\u0010S\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010T\u001a\b\u0012\u0004\u0012\u00020A0U2\u0006\u0010V\u001a\u00020\u0010H\u0016J\u0017\u0010W\u001a\b\u0012\u0004\u0012\u00020A0U2\u0006\u0010V\u001a\u00020\u0010H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010 \"\u0004\b'\u0010\"R(\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R(\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b6\u0010/R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b8\u0010 R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b:\u0010 R(\u0010?\u001a\u0010\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u001c\u0018\u00010@X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006Y"}, d2 = {"Lcom/polymarket/data/EEventState$UFCState;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "weightClass", "", "cardSegment", "eventLogo", "rounds", "", "currentRound", "elapsedInRound", "decision", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "newValue", "getWeightClass", "()Ljava/lang/String;", "setWeightClass", "(Ljava/lang/String;)V", "Swift_weightClass", "Swift_weightClass_set", "value", "getCardSegment", "setCardSegment", "Swift_cardSegment", "Swift_cardSegment_set", "getEventLogo", "setEventLogo", "Swift_eventLogo", "Swift_eventLogo_set", "getRounds", "()Ljava/lang/Integer;", "setRounds", "(Ljava/lang/Integer;)V", "Swift_rounds", "(J)Ljava/lang/Integer;", "Swift_rounds_set", "(JLjava/lang/Integer;)V", "getCurrentRound", "Swift_currentRound", "getElapsedInRound", "Swift_elapsedInRound", "getDecision", "Swift_decision", "Swift_constructor_0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)J", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "equals", "", "other", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UFCState implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        public /* synthetic */ UFCState(String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5);
        }

        private final native String Swift_cardSegment(long Swift_peer);

        private final native void Swift_cardSegment_set(long Swift_peer, String value);

        private final native long Swift_constructor_0(String weightClass, String cardSegment, String eventLogo, Integer rounds, Integer currentRound, String elapsedInRound, String decision);

        private final native long Swift_constructor_1(MutableStruct copy);

        private final native Integer Swift_currentRound(long Swift_peer);

        private final native String Swift_decision(long Swift_peer);

        private final native String Swift_elapsedInRound(long Swift_peer);

        private final native String Swift_eventLogo(long Swift_peer);

        private final native void Swift_eventLogo_set(long Swift_peer, String value);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native boolean Swift_isequal(UFCState lhs, UFCState rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native Integer Swift_rounds(long Swift_peer);

        private final native void Swift_rounds_set(long Swift_peer, Integer value);

        private final native String Swift_weightClass(long Swift_peer);

        private final native void Swift_weightClass_set(long Swift_peer, String value);

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
            if (!(other instanceof UFCState)) {
                return false;
            }
            return Swift_isequal(this, (UFCState) other);
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

        public final Integer getRounds() {
            return Swift_rounds(this.Swift_peer);
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

        public final String getWeightClass() {
            return Swift_weightClass(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new UFCState(this);
        }

        public final void setCardSegment(String str) {
            willmutate();
            try {
                Swift_cardSegment_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setEventLogo(String str) {
            willmutate();
            try {
                Swift_eventLogo_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setRounds(Integer num) {
            willmutate();
            try {
                Swift_rounds_set(this.Swift_peer, num);
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

        public final void setWeightClass(String str) {
            willmutate();
            try {
                Swift_weightClass_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        public UFCState(String str, String str2, String str3, Integer num, Integer num2, String str4, String str5) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, str3, num, num2, str4, str5);
        }

        public UFCState(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private UFCState(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_1(mutableStruct);
        }
    }

    public EEventState(int i, Integer num, String str, Date date, Date date2, Date date3, String str2, Score score, String str3, String str4, String str5, boolean z, boolean z2, Boolean bool, Double d, Double d2, String str6, Double d3, SportState sportState) {
        sportState.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(i, num, str, date, date2, date3, str2, score, str3, str4, str5, z, z2, bool, d, d2, str6, d3, sportState);
    }

    public EEventState(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    private EEventState(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_5(mutableStruct);
    }
}
