package com.polymarket.clients;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.polymarket.data.APIMarketStatus;
import com.polymarket.data.EActivityColor;
import com.polymarket.data.EAmount;
import com.polymarket.data.EColorScheme;
import com.polymarket.data.EComboLegDetail;
import com.polymarket.data.EMarketMetadata;
import com.polymarket.data.ESportsSlug;
import com.polymarket.data.EUserPosition;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.radar.sdk.RadarTripOptions;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\bM\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ²\u00012\u00020\u00012\u00020\u0002:\u0006°\u0001±\u0001²\u0001B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0083\u0002\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0011\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*¢\u0006\u0004\b\b\u0010+B=\b\u0016\u0012\u0006\u0010,\u001a\u00020-\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0011\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010/J\u0006\u00104\u001a\u000205J\u0015\u00106\u001a\u0002052\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u00109\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010<\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010?\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010B\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010D\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010F\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010H\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010J\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010L\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010N\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001d\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010T\u001a\u0004\u0018\u00010\u001c2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010UJ\u001c\u0010W\u001a\u0004\u0018\u00010\u001c2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010UJ\u001c\u0010Z\u001a\u0004\u0018\u00010\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010[J\u0015\u0010\\\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010_\u001a\u0004\u0018\u00010!2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010b\u001a\u0004\u0018\u00010#2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010d\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010f\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010i\u001a\u0004\u0018\u00010'2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010k\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010n\u001a\u0004\u0018\u00010*2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010p\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 Jè\u0001\u0010q\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001f\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010\r2\b\u0010%\u001a\u0004\u0018\u00010\r2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010\u000f2\b\u0010)\u001a\u0004\u0018\u00010*H\u0082 ¢\u0006\u0002\u0010rJ9\u0010s\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010t\u001a\u00020-2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010.\u001a\u0004\u0018\u00010\rH\u0082 J\u0010\u0010u\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010#J\u001f\u0010v\u001a\u00020\u00002\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\b\u0010\"\u001a\u0004\u0018\u00010#H\u0082 J\u0015\u0010y\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0010\u0010z\u001a\u00020\u00002\b\u0010{\u001a\u0004\u0018\u00010*J\u001f\u0010|\u001a\u00020\u00002\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\b\u0010{\u001a\u0004\u0018\u00010*H\u0082 J\u0006\u0010}\u001a\u00020\u0000J\u0015\u0010~\u001a\u00020\u00002\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u000e\u0010\u007f\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0000J\u001f\u0010\u0080\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0007\u0010\u0081\u0001\u001a\u00020\u0000H\u0082 J\u001c\u0010\u0082\u0001\u001a\u00020\u00002\t\u0010$\u001a\u0005\u0018\u00010\u0083\u00012\b\u0010%\u001a\u0004\u0018\u00010\rJ-\u0010\u0084\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0083\u00012\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\rH\u0082 J\u0010\u0010\u0087\u0001\u001a\u00020\u00112\u0007\u0010\u0088\u0001\u001a\u00020-J\u001e\u0010\u0089\u0001\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010t\u001a\u00020-H\u0082 J\u0010\u0010\u008a\u0001\u001a\u00020\u00002\u0007\u0010\u008b\u0001\u001a\u00020-J\u001e\u0010\u008c\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010t\u001a\u00020-H\u0082 J\u0016\u0010\u008d\u0001\u001a\u00020\u00002\r\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019J%\u0010\u008f\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\r\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0082 J\u0019\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0083\u00012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010\u0096\u0001\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010\u0099\u0001\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010\u009c\u0001\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0007\u0010\u009d\u0001\u001a\u00020-J\u0016\u0010\u009e\u0001\u001a\u00020-2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0012\u0010\u009f\u0001\u001a\u00030 \u00012\b\u0010¡\u0001\u001a\u00030¢\u0001J!\u0010£\u0001\u001a\u00030 \u00012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\b\u0010¡\u0001\u001a\u00030¢\u0001H\u0082 J\u0016\u0010¤\u0001\u001a\u00020\u00112\n\u0010¥\u0001\u001a\u0005\u0018\u00010¦\u0001H\u0096\u0002J\u001c\u0010§\u0001\u001a\u00020\u00112\u0007\u0010¨\u0001\u001a\u00020\u00002\u0007\u0010©\u0001\u001a\u00020\u0000H\u0082 J\t\u0010ª\u0001\u001a\u00020\u001cH\u0016J\u0016\u0010«\u0001\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001a\u0010¬\u0001\u001a\n\u0012\u0005\u0012\u00030¦\u00010\u00ad\u00012\u0007\u0010®\u0001\u001a\u00020\u001cH\u0016J\u001b\u0010¯\u0001\u001a\n\u0012\u0005\u0012\u00030¦\u00010\u00ad\u00012\u0007\u0010®\u0001\u001a\u00020\u001cH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bC\u0010>R\u0011\u0010\u0013\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bE\u0010>R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bG\u0010;R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bI\u0010;R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bK\u0010;R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bM\u0010;R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\bV\u0010SR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0011\u0010\u001f\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001f\u0010AR\u0013\u0010 \u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0013\u0010\"\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0013\u0010$\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bc\u0010;R\u0013\u0010%\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\be\u0010;R\u0013\u0010&\u001a\u0004\u0018\u00010'8F¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0013\u0010(\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bj\u0010>R\u0013\u0010)\u001a\u0004\u0018\u00010*8F¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0011\u0010o\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bo\u0010AR\u0011\u0010w\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bx\u0010AR\u0017\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0083\u00018F¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0013\u0010\u0094\u0001\u001a\u00020\r8F¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010;R\u0013\u0010\u0097\u0001\u001a\u00020\r8F¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010;R\u0013\u0010\u009a\u0001\u001a\u00020\r8F¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010;¨\u0006³\u0001"}, d2 = {"Lcom/polymarket/clients/ClientChatPositionAttachment;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "marketMetadata", "Lcom/polymarket/data/EMarketMetadata;", "positionId", "", "currentValue", "Lcom/polymarket/data/EAmount;", "hasCurrentValue", "", "totalCost", "potentialPayout", "displayName", "participantName", "marketDescription", "eventTitle", "comboLegs", "", "Lcom/polymarket/data/EComboLegDetail;", "comboLegCount", "", "comboWonCount", "comboIsShort", "isLive", "accentColor", "Lcom/polymarket/data/EActivityColor;", "owner", "Lcom/polymarket/clients/ClientChatPositionAttachment$Owner;", "sportSlug", "categoryTitle", "settlement", "Lcom/polymarket/clients/ClientChatPositionAttachment$Settlement;", "realizedPnl", "marketStatus", "Lcom/polymarket/data/APIMarketStatus;", "(Lcom/polymarket/data/EMarketMetadata;Ljava/lang/String;Lcom/polymarket/data/EAmount;ZLcom/polymarket/data/EAmount;Lcom/polymarket/data/EAmount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;ZLcom/polymarket/data/EActivityColor;Lcom/polymarket/clients/ClientChatPositionAttachment$Owner;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/clients/ClientChatPositionAttachment$Settlement;Lcom/polymarket/data/EAmount;Lcom/polymarket/data/APIMarketStatus;)V", TicketDetailDestinationKt.LAUNCHED_FROM, "Lcom/polymarket/data/EUserPosition;", "headline", "(Lcom/polymarket/data/EUserPosition;ZZLcom/polymarket/clients/ClientChatPositionAttachment$Owner;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getMarketMetadata", "()Lcom/polymarket/data/EMarketMetadata;", "Swift_marketMetadata", "getPositionId", "()Ljava/lang/String;", "Swift_positionId", "getCurrentValue", "()Lcom/polymarket/data/EAmount;", "Swift_currentValue", "getHasCurrentValue", "()Z", "Swift_hasCurrentValue", "getTotalCost", "Swift_totalCost", "getPotentialPayout", "Swift_potentialPayout", "getDisplayName", "Swift_displayName", "getParticipantName", "Swift_participantName", "getMarketDescription", "Swift_marketDescription", "getEventTitle", "Swift_eventTitle", "getComboLegs", "()Ljava/util/List;", "Swift_comboLegs", "getComboLegCount", "()Ljava/lang/Integer;", "Swift_comboLegCount", "(J)Ljava/lang/Integer;", "getComboWonCount", "Swift_comboWonCount", "getComboIsShort", "()Ljava/lang/Boolean;", "Swift_comboIsShort", "(J)Ljava/lang/Boolean;", "Swift_isLive", "getAccentColor", "()Lcom/polymarket/data/EActivityColor;", "Swift_accentColor", "getOwner", "()Lcom/polymarket/clients/ClientChatPositionAttachment$Owner;", "Swift_owner", "getSportSlug", "Swift_sportSlug", "getCategoryTitle", "Swift_categoryTitle", "getSettlement", "()Lcom/polymarket/clients/ClientChatPositionAttachment$Settlement;", "Swift_settlement", "getRealizedPnl", "Swift_realizedPnl", "getMarketStatus", "()Lcom/polymarket/data/APIMarketStatus;", "Swift_marketStatus", "isCombo", "Swift_isCombo", "Swift_constructor_0", "(Lcom/polymarket/data/EMarketMetadata;Ljava/lang/String;Lcom/polymarket/data/EAmount;ZLcom/polymarket/data/EAmount;Lcom/polymarket/data/EAmount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;ZLcom/polymarket/data/EActivityColor;Lcom/polymarket/clients/ClientChatPositionAttachment$Owner;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/clients/ClientChatPositionAttachment$Settlement;Lcom/polymarket/data/EAmount;Lcom/polymarket/data/APIMarketStatus;)J", "Swift_constructor_1", "position", "withOwner", "Swift_withOwner_2", "canShowBuy", "getCanShowBuy", "Swift_canShowBuy", "withMarketStatus", "status", "Swift_withMarketStatus_3", "withSideSwitched", "Swift_withSideSwitched_4", "withCapturedValues", "Swift_withCapturedValues_5", "captured", "fillingHeaderContext", "Lcom/polymarket/data/ESportsSlug;", "Swift_fillingHeaderContext_6", "fillSportSlug", "fillCategoryTitle", "describesSameHolding", "as_", "Swift_describesSameHolding_8", "refreshed", "with", "Swift_refreshed_9", "replacingComboLegs", RadarTripOptions.KEY_LEGS, "Swift_replacingComboLegs_10", "resolvedSportSlug", "getResolvedSportSlug", "()Lcom/polymarket/data/ESportsSlug;", "Swift_resolvedSportSlug", "resolvedParticipantName", "getResolvedParticipantName", "Swift_resolvedParticipantName", "resolvedMarketDescription", "getResolvedMarketDescription", "Swift_resolvedMarketDescription", "resolvedHeadline", "getResolvedHeadline", "Swift_resolvedHeadline", "makePosition", "Swift_makePosition_13", "makePillSnapshot", "Lcom/polymarket/clients/ClientChatPositionSnapshot;", "colorScheme", "Lcom/polymarket/data/EColorScheme;", "Swift_makePillSnapshot_14", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Owner", "Settlement", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientChatPositionAttachment implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int maxEncodedComboLegs = 10;
    private static final int maxEncodedComboLegBytes = 3500;

    public /* synthetic */ ClientChatPositionAttachment(EMarketMetadata eMarketMetadata, String str, EAmount eAmount, boolean z, EAmount eAmount2, EAmount eAmount3, String str2, String str3, String str4, String str5, List list, Integer num, Integer num2, Boolean bool, boolean z2, EActivityColor eActivityColor, Owner owner, String str6, String str7, Settlement settlement, EAmount eAmount4, APIMarketStatus aPIMarketStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eMarketMetadata, (i & 2) != 0 ? null : str, eAmount, (i & 8) != 0 ? true : z, eAmount2, eAmount3, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & Barcode.FORMAT_UPC_A) != 0 ? null : str5, (i & Barcode.FORMAT_UPC_E) != 0 ? null : list, (i & 2048) != 0 ? null : num, (i & 4096) != 0 ? null : num2, (i & 8192) != 0 ? null : bool, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z2, (32768 & i) != 0 ? null : eActivityColor, (65536 & i) != 0 ? null : owner, (131072 & i) != 0 ? null : str6, (262144 & i) != 0 ? null : str7, (524288 & i) != 0 ? null : settlement, (1048576 & i) != 0 ? null : eAmount4, (i & 2097152) != 0 ? null : aPIMarketStatus);
    }

    private final native EActivityColor Swift_accentColor(long Swift_peer);

    private final native boolean Swift_canShowBuy(long Swift_peer);

    private final native String Swift_categoryTitle(long Swift_peer);

    private final native Boolean Swift_comboIsShort(long Swift_peer);

    private final native Integer Swift_comboLegCount(long Swift_peer);

    private final native List<EComboLegDetail> Swift_comboLegs(long Swift_peer);

    private final native Integer Swift_comboWonCount(long Swift_peer);

    private final native long Swift_constructor_0(EMarketMetadata marketMetadata, String positionId, EAmount currentValue, boolean hasCurrentValue, EAmount totalCost, EAmount potentialPayout, String displayName, String participantName, String marketDescription, String eventTitle, List<EComboLegDetail> comboLegs, Integer comboLegCount, Integer comboWonCount, Boolean comboIsShort, boolean isLive, EActivityColor accentColor, Owner owner, String sportSlug, String categoryTitle, Settlement settlement, EAmount realizedPnl, APIMarketStatus marketStatus);

    private final native long Swift_constructor_1(EUserPosition position, boolean hasCurrentValue, boolean isLive, Owner owner, String headline);

    private final native EAmount Swift_currentValue(long Swift_peer);

    private final native boolean Swift_describesSameHolding_8(long Swift_peer, EUserPosition position);

    private final native String Swift_displayName(long Swift_peer);

    private final native String Swift_eventTitle(long Swift_peer);

    private final native ClientChatPositionAttachment Swift_fillingHeaderContext_6(long Swift_peer, ESportsSlug fillSportSlug, String fillCategoryTitle);

    private final native boolean Swift_hasCurrentValue(long Swift_peer);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native boolean Swift_isCombo(long Swift_peer);

    private final native boolean Swift_isLive(long Swift_peer);

    private final native boolean Swift_isequal(ClientChatPositionAttachment lhs, ClientChatPositionAttachment rhs);

    private final native ClientChatPositionSnapshot Swift_makePillSnapshot_14(long Swift_peer, EColorScheme colorScheme);

    private final native EUserPosition Swift_makePosition_13(long Swift_peer);

    private final native String Swift_marketDescription(long Swift_peer);

    private final native EMarketMetadata Swift_marketMetadata(long Swift_peer);

    private final native APIMarketStatus Swift_marketStatus(long Swift_peer);

    private final native Owner Swift_owner(long Swift_peer);

    private final native String Swift_participantName(long Swift_peer);

    private final native String Swift_positionId(long Swift_peer);

    private final native EAmount Swift_potentialPayout(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native EAmount Swift_realizedPnl(long Swift_peer);

    private final native ClientChatPositionAttachment Swift_refreshed_9(long Swift_peer, EUserPosition position);

    private final native void Swift_release(long Swift_peer);

    private final native ClientChatPositionAttachment Swift_replacingComboLegs_10(long Swift_peer, List<EComboLegDetail> legs);

    private final native String Swift_resolvedHeadline(long Swift_peer);

    private final native String Swift_resolvedMarketDescription(long Swift_peer);

    private final native String Swift_resolvedParticipantName(long Swift_peer);

    private final native ESportsSlug Swift_resolvedSportSlug(long Swift_peer);

    private final native Settlement Swift_settlement(long Swift_peer);

    private final native String Swift_sportSlug(long Swift_peer);

    private final native EAmount Swift_totalCost(long Swift_peer);

    private final native ClientChatPositionAttachment Swift_withCapturedValues_5(long Swift_peer, ClientChatPositionAttachment captured);

    private final native ClientChatPositionAttachment Swift_withMarketStatus_3(long Swift_peer, APIMarketStatus status);

    private final native ClientChatPositionAttachment Swift_withOwner_2(long Swift_peer, Owner owner);

    private final native ClientChatPositionAttachment Swift_withSideSwitched_4(long Swift_peer);

    public static final /* synthetic */ int access$getMaxEncodedComboLegBytes$cp() {
        return maxEncodedComboLegBytes;
    }

    public static final /* synthetic */ int access$getMaxEncodedComboLegs$cp() {
        return maxEncodedComboLegs;
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

    public final boolean describesSameHolding(EUserPosition as_) {
        as_.getClass();
        return Swift_describesSameHolding_8(this.Swift_peer, as_);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientChatPositionAttachment)) {
            return false;
        }
        return Swift_isequal(this, (ClientChatPositionAttachment) other);
    }

    public final ClientChatPositionAttachment fillingHeaderContext(ESportsSlug sportSlug, String categoryTitle) {
        return Swift_fillingHeaderContext_6(this.Swift_peer, sportSlug, categoryTitle);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final EActivityColor getAccentColor() {
        return Swift_accentColor(this.Swift_peer);
    }

    public final boolean getCanShowBuy() {
        return Swift_canShowBuy(this.Swift_peer);
    }

    public final String getCategoryTitle() {
        return Swift_categoryTitle(this.Swift_peer);
    }

    public final Boolean getComboIsShort() {
        return Swift_comboIsShort(this.Swift_peer);
    }

    public final Integer getComboLegCount() {
        return Swift_comboLegCount(this.Swift_peer);
    }

    public final List<EComboLegDetail> getComboLegs() {
        return Swift_comboLegs(this.Swift_peer);
    }

    public final Integer getComboWonCount() {
        return Swift_comboWonCount(this.Swift_peer);
    }

    public final EAmount getCurrentValue() {
        return Swift_currentValue(this.Swift_peer);
    }

    public final String getDisplayName() {
        return Swift_displayName(this.Swift_peer);
    }

    public final String getEventTitle() {
        return Swift_eventTitle(this.Swift_peer);
    }

    public final boolean getHasCurrentValue() {
        return Swift_hasCurrentValue(this.Swift_peer);
    }

    public final String getMarketDescription() {
        return Swift_marketDescription(this.Swift_peer);
    }

    public final EMarketMetadata getMarketMetadata() {
        return Swift_marketMetadata(this.Swift_peer);
    }

    public final APIMarketStatus getMarketStatus() {
        return Swift_marketStatus(this.Swift_peer);
    }

    public final Owner getOwner() {
        return Swift_owner(this.Swift_peer);
    }

    public final String getParticipantName() {
        return Swift_participantName(this.Swift_peer);
    }

    public final String getPositionId() {
        return Swift_positionId(this.Swift_peer);
    }

    public final EAmount getPotentialPayout() {
        return Swift_potentialPayout(this.Swift_peer);
    }

    public final EAmount getRealizedPnl() {
        return Swift_realizedPnl(this.Swift_peer);
    }

    public final String getResolvedHeadline() {
        return Swift_resolvedHeadline(this.Swift_peer);
    }

    public final String getResolvedMarketDescription() {
        return Swift_resolvedMarketDescription(this.Swift_peer);
    }

    public final String getResolvedParticipantName() {
        return Swift_resolvedParticipantName(this.Swift_peer);
    }

    public final ESportsSlug getResolvedSportSlug() {
        return Swift_resolvedSportSlug(this.Swift_peer);
    }

    public final Settlement getSettlement() {
        return Swift_settlement(this.Swift_peer);
    }

    public final String getSportSlug() {
        return Swift_sportSlug(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final EAmount getTotalCost() {
        return Swift_totalCost(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(Swift_hashvalue(this.Swift_peer));
    }

    public final boolean isCombo() {
        return Swift_isCombo(this.Swift_peer);
    }

    public final boolean isLive() {
        return Swift_isLive(this.Swift_peer);
    }

    public final ClientChatPositionSnapshot makePillSnapshot(EColorScheme colorScheme) {
        colorScheme.getClass();
        return Swift_makePillSnapshot_14(this.Swift_peer, colorScheme);
    }

    public final EUserPosition makePosition() {
        return Swift_makePosition_13(this.Swift_peer);
    }

    public final ClientChatPositionAttachment refreshed(EUserPosition with) {
        with.getClass();
        return Swift_refreshed_9(this.Swift_peer, with);
    }

    public final ClientChatPositionAttachment replacingComboLegs(List<EComboLegDetail> legs) {
        legs.getClass();
        return Swift_replacingComboLegs_10(this.Swift_peer, legs);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public final ClientChatPositionAttachment withCapturedValues(ClientChatPositionAttachment from) {
        from.getClass();
        return Swift_withCapturedValues_5(this.Swift_peer, from);
    }

    public final ClientChatPositionAttachment withMarketStatus(APIMarketStatus status) {
        return Swift_withMarketStatus_3(this.Swift_peer, status);
    }

    public final ClientChatPositionAttachment withOwner(Owner owner) {
        return Swift_withOwner_2(this.Swift_peer, owner);
    }

    public final ClientChatPositionAttachment withSideSwitched() {
        return Swift_withSideSwitched_4(this.Swift_peer);
    }

    public ClientChatPositionAttachment(EMarketMetadata eMarketMetadata, String str, EAmount eAmount, boolean z, EAmount eAmount2, EAmount eAmount3, String str2, String str3, String str4, String str5, List<EComboLegDetail> list, Integer num, Integer num2, Boolean bool, boolean z2, EActivityColor eActivityColor, Owner owner, String str6, String str7, Settlement settlement, EAmount eAmount4, APIMarketStatus aPIMarketStatus) {
        eMarketMetadata.getClass();
        eAmount.getClass();
        eAmount2.getClass();
        eAmount3.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(eMarketMetadata, str, eAmount, z, eAmount2, eAmount3, str2, str3, str4, str5, list, num, num2, bool, z2, eActivityColor, owner, str6, str7, settlement, eAmount4, aPIMarketStatus);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0016B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0017"}, d2 = {"Lcom/polymarket/clients/ClientChatPositionAttachment$Settlement;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "won", "lost", "cashedOut", "switched", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Settlement implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Settlement[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final Settlement won = new Settlement("won", 0, "won", null, 2, null);
        public static final Settlement lost = new Settlement("lost", 1, "lost", null, 2, null);
        public static final Settlement cashedOut = new Settlement("cashedOut", 2, "cashedOut", null, 2, null);
        public static final Settlement switched = new Settlement("switched", 3, "switched", null, 2, null);

        private static final /* synthetic */ Settlement[] $values() {
            return new Settlement[]{won, lost, cashedOut, switched};
        }

        static {
            Settlement[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ Settlement(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Settlement valueOf(String str) {
            return (Settlement) Enum.valueOf(Settlement.class, str);
        }

        public static Settlement[] values() {
            return (Settlement[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/clients/ClientChatPositionAttachment$Settlement$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/clients/ClientChatPositionAttachment$Settlement;", "rawValue", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Settlement init(String rawValue) {
                rawValue.getClass();
                switch (rawValue.hashCode()) {
                    case -85276973:
                        if (!rawValue.equals("switched")) {
                            return null;
                        }
                        return Settlement.switched;
                    case 117910:
                        if (rawValue.equals("won")) {
                            return Settlement.won;
                        }
                        return null;
                    case 3327780:
                        if (rawValue.equals("lost")) {
                            return Settlement.lost;
                        }
                        return null;
                    case 762019548:
                        if (rawValue.equals("cashedOut")) {
                            return Settlement.cashedOut;
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

        private Settlement(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001b\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0082 J$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0005J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0016\u001a\u00020\u0005H\u0082 J\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019J\u001f\u0010\u001c\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019H\u0082 J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u0019R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006 "}, d2 = {"Lcom/polymarket/clients/ClientChatPositionAttachment$Companion;", "", "<init>", "()V", "maxEncodedComboLegs", "", "getMaxEncodedComboLegs", "()I", "maxEncodedComboLegBytes", "getMaxEncodedComboLegBytes", "squadCard", "Lcom/polymarket/clients/ClientChatPositionAttachment;", TicketDetailDestinationKt.LAUNCHED_FROM, "Lcom/polymarket/data/EUserPosition;", "owner", "Lcom/polymarket/clients/ClientChatPositionAttachment$Owner;", "Swift_Companion_squadCard_7", "position", "wireTrimmedComboLegs", "", "Lcom/polymarket/data/EComboLegDetail;", "rawLegs", "reservedBytes", "Swift_Companion_wireTrimmedComboLegs_11", "activityShareHeadline", "", "marketTitle", "outcome", "Swift_Companion_activityShareHeadline_12", "Settlement", "Lcom/polymarket/clients/ClientChatPositionAttachment$Settlement;", "rawValue", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native String Swift_Companion_activityShareHeadline_12(String marketTitle, String outcome);

        private final native ClientChatPositionAttachment Swift_Companion_squadCard_7(EUserPosition position, Owner owner);

        private final native List<EComboLegDetail> Swift_Companion_wireTrimmedComboLegs_11(List<EComboLegDetail> rawLegs, int reservedBytes);

        public static /* synthetic */ ClientChatPositionAttachment squadCard$default(Companion companion, EUserPosition eUserPosition, Owner owner, int i, Object obj) {
            if ((i & 2) != 0) {
                owner = null;
            }
            return companion.squadCard(eUserPosition, owner);
        }

        public static /* synthetic */ List wireTrimmedComboLegs$default(Companion companion, List list, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return companion.wireTrimmedComboLegs(list, i);
        }

        public final Settlement Settlement(String rawValue) {
            rawValue.getClass();
            return Settlement.INSTANCE.init(rawValue);
        }

        public final String activityShareHeadline(String marketTitle, String outcome) {
            return Swift_Companion_activityShareHeadline_12(marketTitle, outcome);
        }

        public final int getMaxEncodedComboLegBytes() {
            return ClientChatPositionAttachment.access$getMaxEncodedComboLegBytes$cp();
        }

        public final int getMaxEncodedComboLegs() {
            return ClientChatPositionAttachment.access$getMaxEncodedComboLegs$cp();
        }

        public final ClientChatPositionAttachment squadCard(EUserPosition from, Owner owner) {
            from.getClass();
            return Swift_Companion_squadCard_7(from, owner);
        }

        public final List<EComboLegDetail> wireTrimmedComboLegs(List<EComboLegDetail> rawLegs, int reservedBytes) {
            rawLegs.getClass();
            return Swift_Companion_wireTrimmedComboLegs_11(rawLegs, reservedBytes);
        }

        private Companion() {
        }
    }

    public ClientChatPositionAttachment(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public ClientChatPositionAttachment(EUserPosition eUserPosition, boolean z, boolean z2, Owner owner, String str) {
        eUserPosition.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(eUserPosition, z, z2, owner, str);
    }

    public /* synthetic */ ClientChatPositionAttachment(EUserPosition eUserPosition, boolean z, boolean z2, Owner owner, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eUserPosition, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : owner, (i & 16) != 0 ? null : str);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB%\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010\u0019\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001b\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J'\u0010\u001f\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0082 J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\u0019\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0082 J\b\u0010'\u001a\u00020(H\u0016J\u0015\u0010)\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020#0+2\u0006\u0010,\u001a\u00020(H\u0016J\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020#0+2\u0006\u0010,\u001a\u00020(H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006/"}, d2 = {"Lcom/polymarket/clients/ClientChatPositionAttachment$Owner;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "userId", "", "username", "avatarUrl", "Ljava/net/URI;", "(Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getUserId", "()Ljava/lang/String;", "Swift_userId", "getUsername", "Swift_username", "getAvatarUrl", "()Ljava/net/URI;", "Swift_avatarUrl", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Owner implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Owner(String str, String str2, URI uri) {
            str.getClass();
            str2.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, uri);
        }

        private final native URI Swift_avatarUrl(long Swift_peer);

        private final native long Swift_constructor_0(String userId, String username, URI avatarUrl);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native boolean Swift_isequal(Owner lhs, Owner rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_userId(long Swift_peer);

        private final native String Swift_username(long Swift_peer);

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
            if (!(other instanceof Owner)) {
                return false;
            }
            return Swift_isequal(this, (Owner) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final URI getAvatarUrl() {
            return Swift_avatarUrl(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getUserId() {
            return Swift_userId(this.Swift_peer);
        }

        public final String getUsername() {
            return Swift_username(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public Owner(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ Owner(String str, String str2, URI uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : uri);
        }
    }
}
