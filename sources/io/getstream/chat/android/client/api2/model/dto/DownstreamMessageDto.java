package io.getstream.chat.android.client.api2.model.dto;

import com.appsflyer.AppsFlyerProperties;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ace;
import defpackage.hdi;
import defpackage.ix2;
import defpackage.k84;
import defpackage.mda;
import defpackage.sv6;
import defpackage.woa;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\bt\b\u0081\b\u0018\u00002\u00020\u0001B\u009f\u0004\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000f\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0003\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0016\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010#\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020%\u0018\u00010\u000f\u0012\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020%\u0018\u00010\u000f\u0012\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020(\u0018\u00010\u000f\u0012\u0006\u0010)\u001a\u00020%\u0012\u0006\u0010*\u001a\u00020%\u0012\b\b\u0002\u0010+\u001a\u00020\u0016\u0012\b\b\u0002\u0010,\u001a\u00020\u0016\u0012\u0006\u0010-\u001a\u00020\u0016\u0012\u0006\u0010.\u001a\u00020\b\u0012\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\u0006\u00100\u001a\u00020\b\u0012\u0006\u00101\u001a\u00020\u000b\u0012\u0006\u00102\u001a\u00020\u0014\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0016\u0012\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020A0\u000f¢\u0006\u0004\bB\u0010CJ\u0010\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\bHÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u000bHÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\bHÆ\u0003J\u0016\u0010\u0089\u0001\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000fHÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\bHÆ\u0003J\u0010\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003HÆ\u0003J\u0010\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003HÆ\u0003J\u0011\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010UJ\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010UJ\u0010\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190\u0003HÆ\u0003J\u0010\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u0010\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0016HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0000HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0018\u0010\u009a\u0001\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020%\u0018\u00010\u000fHÆ\u0003J\u0018\u0010\u009b\u0001\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020%\u0018\u00010\u000fHÆ\u0003J\u0018\u0010\u009c\u0001\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020(\u0018\u00010\u000fHÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020%HÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020%HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\bHÆ\u0003J\u0010\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\bHÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010¦\u0001\u001a\u00020\u0014HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u000104HÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u000106HÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u000108HÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010:HÆ\u0003J\f\u0010«\u0001\u001a\u0004\u0018\u00010<HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010>HÆ\u0003J\u0011\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010UJ\u0016\u0010®\u0001\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020A0\u000fHÆ\u0003Jä\u0004\u0010¯\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u00162\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020%\u0018\u00010\u000f2\u0016\b\u0002\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020%\u0018\u00010\u000f2\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020(\u0018\u00010\u000f2\b\b\u0002\u0010)\u001a\u00020%2\b\b\u0002\u0010*\u001a\u00020%2\b\b\u0002\u0010+\u001a\u00020\u00162\b\b\u0002\u0010,\u001a\u00020\u00162\b\b\u0002\u0010-\u001a\u00020\u00162\b\b\u0002\u0010.\u001a\u00020\b2\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0002\u00100\u001a\u00020\b2\b\b\u0002\u00101\u001a\u00020\u000b2\b\b\u0002\u00102\u001a\u00020\u00142\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00162\u0014\b\u0002\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020A0\u000fHÆ\u0001¢\u0006\u0003\u0010°\u0001J\u0015\u0010±\u0001\u001a\u00020\u00162\t\u0010²\u0001\u001a\u0004\u0018\u00010AHÖ\u0003J\n\u0010³\u0001\u001a\u00020%HÖ\u0001J\n\u0010´\u0001\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010IR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bM\u0010LR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bN\u0010IR\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010IR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u0010ER\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u0010ER\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010V\u001a\u0004\bT\u0010UR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010V\u001a\u0004\bW\u0010UR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u0010ER\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ER\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010ER\u0013\u0010\u001c\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b[\u0010IR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010LR\u0011\u0010\u001e\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b_\u0010LR\u0013\u0010 \u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b`\u0010LR\u0013\u0010!\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0013\u0010\"\u001a\u0004\u0018\u00010\u0000¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0013\u0010#\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\be\u0010IR\u001f\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020%\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bf\u0010PR\u001f\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020%\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bg\u0010PR\u001f\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020(\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bh\u0010PR\u0011\u0010)\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\bi\u0010jR\u0011\u0010*\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\bk\u0010jR\u0011\u0010+\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bl\u0010^R\u0011\u0010,\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bm\u0010^R\u0011\u0010-\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bn\u0010^R\u0011\u0010.\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bo\u0010IR\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003¢\u0006\b\n\u0000\u001a\u0004\bp\u0010ER\u0011\u00100\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bq\u0010IR\u0011\u00101\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\br\u0010LR\u0011\u00102\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bs\u0010bR\u0013\u00103\u001a\u0004\u0018\u000104¢\u0006\b\n\u0000\u001a\u0004\bt\u0010uR\u0013\u00105\u001a\u0004\u0018\u000106¢\u0006\b\n\u0000\u001a\u0004\bv\u0010wR\u0013\u00107\u001a\u0004\u0018\u000108¢\u0006\b\n\u0000\u001a\u0004\bx\u0010yR\u0013\u00109\u001a\u0004\u0018\u00010:¢\u0006\b\n\u0000\u001a\u0004\bz\u0010{R\u0013\u0010;\u001a\u0004\u0018\u00010<¢\u0006\b\n\u0000\u001a\u0004\b|\u0010}R\u0013\u0010=\u001a\u0004\u0018\u00010>¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\u007fR\u0016\u0010?\u001a\u0004\u0018\u00010\u0016¢\u0006\u000b\n\u0002\u0010V\u001a\u0005\b\u0080\u0001\u0010UR\u001e\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020A0\u000f¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010P¨\u0006µ\u0001"}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;", "attachments", "", "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;", AppsFlyerProperties.CHANNEL, "Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;", "cid", "", "command", "created_at", "Ljava/util/Date;", "deleted_at", "html", "i18n", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "latest_reactions", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;", "mentioned_users", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "mentioned_here", "", "mentioned_channel", "mentioned_groups", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserGroupDto;", "mentioned_roles", "own_reactions", "parent_id", "pin_expires", "pinned", "pinned_at", "message_text_updated_at", "pinned_by", "quoted_message", "quoted_message_id", "reaction_counts", "", "reaction_scores", "reaction_groups", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;", "reply_count", "deleted_reply_count", "shadowed", "show_in_channel", "silent", "text", "thread_participants", "type", "updated_at", "user", "moderation_details", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;", "moderation", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;", "poll", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;", "reminder", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;", "shared_location", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;", "member", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;", "deleted_for_me", "extraData", "", "<init>", "(Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;IIZZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;Ljava/lang/Boolean;Ljava/util/Map;)V", "getAttachments", "()Ljava/util/List;", "getChannel", "()Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;", "getCid", "()Ljava/lang/String;", "getCommand", "getCreated_at", "()Ljava/util/Date;", "getDeleted_at", "getHtml", "getI18n", "()Ljava/util/Map;", "getId", "getLatest_reactions", "getMentioned_users", "getMentioned_here", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMentioned_channel", "getMentioned_groups", "getMentioned_roles", "getOwn_reactions", "getParent_id", "getPin_expires", "getPinned", "()Z", "getPinned_at", "getMessage_text_updated_at", "getPinned_by", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getQuoted_message", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "getQuoted_message_id", "getReaction_counts", "getReaction_scores", "getReaction_groups", "getReply_count", "()I", "getDeleted_reply_count", "getShadowed", "getShow_in_channel", "getSilent", "getText", "getThread_participants", "getType", "getUpdated_at", "getUser", "getModeration_details", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;", "getModeration", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;", "getPoll", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;", "getReminder", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;", "getShared_location", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;", "getMember", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;", "getDeleted_for_me", "getExtraData", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "copy", "(Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;IIZZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;Ljava/lang/Boolean;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "equals", "other", "hashCode", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class DownstreamMessageDto implements ExtraDataDto {
    private final List<AttachmentDto> attachments;
    private final ChannelInfoDto channel;
    private final String cid;
    private final String command;
    private final Date created_at;
    private final Date deleted_at;
    private final Boolean deleted_for_me;
    private final int deleted_reply_count;
    private final Map<String, Object> extraData;
    private final String html;
    private final Map<String, String> i18n;
    private final String id;
    private final List<DownstreamReactionDto> latest_reactions;
    private final DownstreamMemberInfoDto member;
    private final Boolean mentioned_channel;
    private final List<DownstreamUserGroupDto> mentioned_groups;
    private final Boolean mentioned_here;
    private final List<String> mentioned_roles;
    private final List<DownstreamUserDto> mentioned_users;
    private final Date message_text_updated_at;
    private final DownstreamModerationDto moderation;
    private final DownstreamModerationDetailsDto moderation_details;
    private final List<DownstreamReactionDto> own_reactions;
    private final String parent_id;
    private final Date pin_expires;
    private final boolean pinned;
    private final Date pinned_at;
    private final DownstreamUserDto pinned_by;
    private final DownstreamPollDto poll;
    private final DownstreamMessageDto quoted_message;
    private final String quoted_message_id;
    private final Map<String, Integer> reaction_counts;
    private final Map<String, DownstreamReactionGroupDto> reaction_groups;
    private final Map<String, Integer> reaction_scores;
    private final DownstreamReminderInfoDto reminder;
    private final int reply_count;
    private final boolean shadowed;
    private final DownstreamLocationDto shared_location;
    private final boolean show_in_channel;
    private final boolean silent;
    private final String text;
    private final List<DownstreamUserDto> thread_participants;
    private final String type;
    private final Date updated_at;
    private final DownstreamUserDto user;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public DownstreamMessageDto(java.util.List r50, io.getstream.chat.android.client.api2.model.dto.ChannelInfoDto r51, java.lang.String r52, java.lang.String r53, java.util.Date r54, java.util.Date r55, java.lang.String r56, java.util.Map r57, java.lang.String r58, java.util.List r59, java.util.List r60, java.lang.Boolean r61, java.lang.Boolean r62, java.util.List r63, java.util.List r64, java.util.List r65, java.lang.String r66, java.util.Date r67, boolean r68, java.util.Date r69, java.util.Date r70, io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto r71, io.getstream.chat.android.client.api2.model.dto.DownstreamMessageDto r72, java.lang.String r73, java.util.Map r74, java.util.Map r75, java.util.Map r76, int r77, int r78, boolean r79, boolean r80, boolean r81, java.lang.String r82, java.util.List r83, java.lang.String r84, java.util.Date r85, io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto r86, io.getstream.chat.android.client.api2.model.dto.DownstreamModerationDetailsDto r87, io.getstream.chat.android.client.api2.model.dto.DownstreamModerationDto r88, io.getstream.chat.android.client.api2.model.dto.DownstreamPollDto r89, io.getstream.chat.android.client.api2.model.dto.DownstreamReminderInfoDto r90, io.getstream.chat.android.client.api2.model.dto.DownstreamLocationDto r91, io.getstream.chat.android.client.api2.model.dto.DownstreamMemberInfoDto r92, java.lang.Boolean r93, java.util.Map r94, int r95, int r96, kotlin.jvm.internal.DefaultConstructorMarker r97) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.api2.model.dto.DownstreamMessageDto.<init>(java.util.List, io.getstream.chat.android.client.api2.model.dto.ChannelInfoDto, java.lang.String, java.lang.String, java.util.Date, java.util.Date, java.lang.String, java.util.Map, java.lang.String, java.util.List, java.util.List, java.lang.Boolean, java.lang.Boolean, java.util.List, java.util.List, java.util.List, java.lang.String, java.util.Date, boolean, java.util.Date, java.util.Date, io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto, io.getstream.chat.android.client.api2.model.dto.DownstreamMessageDto, java.lang.String, java.util.Map, java.util.Map, java.util.Map, int, int, boolean, boolean, boolean, java.lang.String, java.util.List, java.lang.String, java.util.Date, io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto, io.getstream.chat.android.client.api2.model.dto.DownstreamModerationDetailsDto, io.getstream.chat.android.client.api2.model.dto.DownstreamModerationDto, io.getstream.chat.android.client.api2.model.dto.DownstreamPollDto, io.getstream.chat.android.client.api2.model.dto.DownstreamReminderInfoDto, io.getstream.chat.android.client.api2.model.dto.DownstreamLocationDto, io.getstream.chat.android.client.api2.model.dto.DownstreamMemberInfoDto, java.lang.Boolean, java.util.Map, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ DownstreamMessageDto copy$default(DownstreamMessageDto downstreamMessageDto, List list, ChannelInfoDto channelInfoDto, String str, String str2, Date date, Date date2, String str3, Map map, String str4, List list2, List list3, Boolean bool, Boolean bool2, List list4, List list5, List list6, String str5, Date date3, boolean z, Date date4, Date date5, DownstreamUserDto downstreamUserDto, DownstreamMessageDto downstreamMessageDto2, String str6, Map map2, Map map3, Map map4, int i, int i2, boolean z2, boolean z3, boolean z4, String str7, List list7, String str8, Date date6, DownstreamUserDto downstreamUserDto2, DownstreamModerationDetailsDto downstreamModerationDetailsDto, DownstreamModerationDto downstreamModerationDto, DownstreamPollDto downstreamPollDto, DownstreamReminderInfoDto downstreamReminderInfoDto, DownstreamLocationDto downstreamLocationDto, DownstreamMemberInfoDto downstreamMemberInfoDto, Boolean bool3, Map map5, int i3, int i4, Object obj) {
        return downstreamMessageDto.copy((i3 & 1) != 0 ? downstreamMessageDto.attachments : list, (i3 & 2) != 0 ? downstreamMessageDto.channel : channelInfoDto, (i3 & 4) != 0 ? downstreamMessageDto.cid : str, (i3 & 8) != 0 ? downstreamMessageDto.command : str2, (i3 & 16) != 0 ? downstreamMessageDto.created_at : date, (i3 & 32) != 0 ? downstreamMessageDto.deleted_at : date2, (i3 & 64) != 0 ? downstreamMessageDto.html : str3, (i3 & 128) != 0 ? downstreamMessageDto.i18n : map, (i3 & 256) != 0 ? downstreamMessageDto.id : str4, (i3 & Barcode.FORMAT_UPC_A) != 0 ? downstreamMessageDto.latest_reactions : list2, (i3 & Barcode.FORMAT_UPC_E) != 0 ? downstreamMessageDto.mentioned_users : list3, (i3 & 2048) != 0 ? downstreamMessageDto.mentioned_here : bool, (i3 & 4096) != 0 ? downstreamMessageDto.mentioned_channel : bool2, (i3 & 8192) != 0 ? downstreamMessageDto.mentioned_groups : list4, (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? downstreamMessageDto.mentioned_roles : list5, (i3 & 32768) != 0 ? downstreamMessageDto.own_reactions : list6, (i3 & 65536) != 0 ? downstreamMessageDto.parent_id : str5, (i3 & 131072) != 0 ? downstreamMessageDto.pin_expires : date3, (i3 & 262144) != 0 ? downstreamMessageDto.pinned : z, (i3 & 524288) != 0 ? downstreamMessageDto.pinned_at : date4, (i3 & 1048576) != 0 ? downstreamMessageDto.message_text_updated_at : date5, (i3 & 2097152) != 0 ? downstreamMessageDto.pinned_by : downstreamUserDto, (i3 & 4194304) != 0 ? downstreamMessageDto.quoted_message : downstreamMessageDto2, (i3 & 8388608) != 0 ? downstreamMessageDto.quoted_message_id : str6, (i3 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? downstreamMessageDto.reaction_counts : map2, (i3 & 33554432) != 0 ? downstreamMessageDto.reaction_scores : map3, (i3 & 67108864) != 0 ? downstreamMessageDto.reaction_groups : map4, (i3 & 134217728) != 0 ? downstreamMessageDto.reply_count : i, (i3 & 268435456) != 0 ? downstreamMessageDto.deleted_reply_count : i2, (i3 & 536870912) != 0 ? downstreamMessageDto.shadowed : z2, (i3 & 1073741824) != 0 ? downstreamMessageDto.show_in_channel : z3, (i3 & Integer.MIN_VALUE) != 0 ? downstreamMessageDto.silent : z4, (i4 & 1) != 0 ? downstreamMessageDto.text : str7, (i4 & 2) != 0 ? downstreamMessageDto.thread_participants : list7, (i4 & 4) != 0 ? downstreamMessageDto.type : str8, (i4 & 8) != 0 ? downstreamMessageDto.updated_at : date6, (i4 & 16) != 0 ? downstreamMessageDto.user : downstreamUserDto2, (i4 & 32) != 0 ? downstreamMessageDto.moderation_details : downstreamModerationDetailsDto, (i4 & 64) != 0 ? downstreamMessageDto.moderation : downstreamModerationDto, (i4 & 128) != 0 ? downstreamMessageDto.poll : downstreamPollDto, (i4 & 256) != 0 ? downstreamMessageDto.reminder : downstreamReminderInfoDto, (i4 & Barcode.FORMAT_UPC_A) != 0 ? downstreamMessageDto.shared_location : downstreamLocationDto, (i4 & Barcode.FORMAT_UPC_E) != 0 ? downstreamMessageDto.member : downstreamMemberInfoDto, (i4 & 2048) != 0 ? downstreamMessageDto.deleted_for_me : bool3, (i4 & 4096) != 0 ? downstreamMessageDto.extraData : map5);
    }

    public final List<AttachmentDto> component1() {
        return this.attachments;
    }

    public final List<DownstreamReactionDto> component10() {
        return this.latest_reactions;
    }

    public final List<DownstreamUserDto> component11() {
        return this.mentioned_users;
    }

    /* renamed from: component12, reason: from getter */
    public final Boolean getMentioned_here() {
        return this.mentioned_here;
    }

    /* renamed from: component13, reason: from getter */
    public final Boolean getMentioned_channel() {
        return this.mentioned_channel;
    }

    public final List<DownstreamUserGroupDto> component14() {
        return this.mentioned_groups;
    }

    public final List<String> component15() {
        return this.mentioned_roles;
    }

    public final List<DownstreamReactionDto> component16() {
        return this.own_reactions;
    }

    /* renamed from: component17, reason: from getter */
    public final String getParent_id() {
        return this.parent_id;
    }

    /* renamed from: component18, reason: from getter */
    public final Date getPin_expires() {
        return this.pin_expires;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getPinned() {
        return this.pinned;
    }

    /* renamed from: component2, reason: from getter */
    public final ChannelInfoDto getChannel() {
        return this.channel;
    }

    /* renamed from: component20, reason: from getter */
    public final Date getPinned_at() {
        return this.pinned_at;
    }

    /* renamed from: component21, reason: from getter */
    public final Date getMessage_text_updated_at() {
        return this.message_text_updated_at;
    }

    /* renamed from: component22, reason: from getter */
    public final DownstreamUserDto getPinned_by() {
        return this.pinned_by;
    }

    /* renamed from: component23, reason: from getter */
    public final DownstreamMessageDto getQuoted_message() {
        return this.quoted_message;
    }

    /* renamed from: component24, reason: from getter */
    public final String getQuoted_message_id() {
        return this.quoted_message_id;
    }

    public final Map<String, Integer> component25() {
        return this.reaction_counts;
    }

    public final Map<String, Integer> component26() {
        return this.reaction_scores;
    }

    public final Map<String, DownstreamReactionGroupDto> component27() {
        return this.reaction_groups;
    }

    /* renamed from: component28, reason: from getter */
    public final int getReply_count() {
        return this.reply_count;
    }

    /* renamed from: component29, reason: from getter */
    public final int getDeleted_reply_count() {
        return this.deleted_reply_count;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getShadowed() {
        return this.shadowed;
    }

    /* renamed from: component31, reason: from getter */
    public final boolean getShow_in_channel() {
        return this.show_in_channel;
    }

    /* renamed from: component32, reason: from getter */
    public final boolean getSilent() {
        return this.silent;
    }

    /* renamed from: component33, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final List<DownstreamUserDto> component34() {
        return this.thread_participants;
    }

    /* renamed from: component35, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component36, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* renamed from: component37, reason: from getter */
    public final DownstreamUserDto getUser() {
        return this.user;
    }

    /* renamed from: component38, reason: from getter */
    public final DownstreamModerationDetailsDto getModeration_details() {
        return this.moderation_details;
    }

    /* renamed from: component39, reason: from getter */
    public final DownstreamModerationDto getModeration() {
        return this.moderation;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCommand() {
        return this.command;
    }

    /* renamed from: component40, reason: from getter */
    public final DownstreamPollDto getPoll() {
        return this.poll;
    }

    /* renamed from: component41, reason: from getter */
    public final DownstreamReminderInfoDto getReminder() {
        return this.reminder;
    }

    /* renamed from: component42, reason: from getter */
    public final DownstreamLocationDto getShared_location() {
        return this.shared_location;
    }

    /* renamed from: component43, reason: from getter */
    public final DownstreamMemberInfoDto getMember() {
        return this.member;
    }

    /* renamed from: component44, reason: from getter */
    public final Boolean getDeleted_for_me() {
        return this.deleted_for_me;
    }

    public final Map<String, Object> component45() {
        return this.extraData;
    }

    /* renamed from: component5, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* renamed from: component6, reason: from getter */
    public final Date getDeleted_at() {
        return this.deleted_at;
    }

    /* renamed from: component7, reason: from getter */
    public final String getHtml() {
        return this.html;
    }

    public final Map<String, String> component8() {
        return this.i18n;
    }

    /* renamed from: component9, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final DownstreamMessageDto copy(List<AttachmentDto> attachments, ChannelInfoDto channel, String cid, String command, Date created_at, Date deleted_at, String html, Map<String, String> i18n, String id, List<DownstreamReactionDto> latest_reactions, List<DownstreamUserDto> mentioned_users, Boolean mentioned_here, Boolean mentioned_channel, List<DownstreamUserGroupDto> mentioned_groups, List<String> mentioned_roles, List<DownstreamReactionDto> own_reactions, String parent_id, Date pin_expires, boolean pinned, Date pinned_at, Date message_text_updated_at, DownstreamUserDto pinned_by, DownstreamMessageDto quoted_message, String quoted_message_id, Map<String, Integer> reaction_counts, Map<String, Integer> reaction_scores, Map<String, DownstreamReactionGroupDto> reaction_groups, int reply_count, int deleted_reply_count, boolean shadowed, boolean show_in_channel, boolean silent, String text, List<DownstreamUserDto> thread_participants, String type, Date updated_at, DownstreamUserDto user, DownstreamModerationDetailsDto moderation_details, DownstreamModerationDto moderation, DownstreamPollDto poll, DownstreamReminderInfoDto reminder, DownstreamLocationDto shared_location, DownstreamMemberInfoDto member, Boolean deleted_for_me, Map<String, ? extends Object> extraData) {
        attachments.getClass();
        cid.getClass();
        created_at.getClass();
        html.getClass();
        i18n.getClass();
        id.getClass();
        latest_reactions.getClass();
        mentioned_users.getClass();
        mentioned_groups.getClass();
        mentioned_roles.getClass();
        own_reactions.getClass();
        text.getClass();
        thread_participants.getClass();
        type.getClass();
        updated_at.getClass();
        user.getClass();
        extraData.getClass();
        return new DownstreamMessageDto(attachments, channel, cid, command, created_at, deleted_at, html, i18n, id, latest_reactions, mentioned_users, mentioned_here, mentioned_channel, mentioned_groups, mentioned_roles, own_reactions, parent_id, pin_expires, pinned, pinned_at, message_text_updated_at, pinned_by, quoted_message, quoted_message_id, reaction_counts, reaction_scores, reaction_groups, reply_count, deleted_reply_count, shadowed, show_in_channel, silent, text, thread_participants, type, updated_at, user, moderation_details, moderation, poll, reminder, shared_location, member, deleted_for_me, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamMessageDto)) {
            return false;
        }
        DownstreamMessageDto downstreamMessageDto = (DownstreamMessageDto) other;
        if (Intrinsics.areEqual(this.attachments, downstreamMessageDto.attachments) && Intrinsics.areEqual(this.channel, downstreamMessageDto.channel) && Intrinsics.areEqual(this.cid, downstreamMessageDto.cid) && Intrinsics.areEqual(this.command, downstreamMessageDto.command) && Intrinsics.areEqual(this.created_at, downstreamMessageDto.created_at) && Intrinsics.areEqual(this.deleted_at, downstreamMessageDto.deleted_at) && Intrinsics.areEqual(this.html, downstreamMessageDto.html) && Intrinsics.areEqual(this.i18n, downstreamMessageDto.i18n) && Intrinsics.areEqual(this.id, downstreamMessageDto.id) && Intrinsics.areEqual(this.latest_reactions, downstreamMessageDto.latest_reactions) && Intrinsics.areEqual(this.mentioned_users, downstreamMessageDto.mentioned_users) && Intrinsics.areEqual(this.mentioned_here, downstreamMessageDto.mentioned_here) && Intrinsics.areEqual(this.mentioned_channel, downstreamMessageDto.mentioned_channel) && Intrinsics.areEqual(this.mentioned_groups, downstreamMessageDto.mentioned_groups) && Intrinsics.areEqual(this.mentioned_roles, downstreamMessageDto.mentioned_roles) && Intrinsics.areEqual(this.own_reactions, downstreamMessageDto.own_reactions) && Intrinsics.areEqual(this.parent_id, downstreamMessageDto.parent_id) && Intrinsics.areEqual(this.pin_expires, downstreamMessageDto.pin_expires) && this.pinned == downstreamMessageDto.pinned && Intrinsics.areEqual(this.pinned_at, downstreamMessageDto.pinned_at) && Intrinsics.areEqual(this.message_text_updated_at, downstreamMessageDto.message_text_updated_at) && Intrinsics.areEqual(this.pinned_by, downstreamMessageDto.pinned_by) && Intrinsics.areEqual(this.quoted_message, downstreamMessageDto.quoted_message) && Intrinsics.areEqual(this.quoted_message_id, downstreamMessageDto.quoted_message_id) && Intrinsics.areEqual(this.reaction_counts, downstreamMessageDto.reaction_counts) && Intrinsics.areEqual(this.reaction_scores, downstreamMessageDto.reaction_scores) && Intrinsics.areEqual(this.reaction_groups, downstreamMessageDto.reaction_groups) && this.reply_count == downstreamMessageDto.reply_count && this.deleted_reply_count == downstreamMessageDto.deleted_reply_count && this.shadowed == downstreamMessageDto.shadowed && this.show_in_channel == downstreamMessageDto.show_in_channel && this.silent == downstreamMessageDto.silent && Intrinsics.areEqual(this.text, downstreamMessageDto.text) && Intrinsics.areEqual(this.thread_participants, downstreamMessageDto.thread_participants) && Intrinsics.areEqual(this.type, downstreamMessageDto.type) && Intrinsics.areEqual(this.updated_at, downstreamMessageDto.updated_at) && Intrinsics.areEqual(this.user, downstreamMessageDto.user) && Intrinsics.areEqual(this.moderation_details, downstreamMessageDto.moderation_details) && Intrinsics.areEqual(this.moderation, downstreamMessageDto.moderation) && Intrinsics.areEqual(this.poll, downstreamMessageDto.poll) && Intrinsics.areEqual(this.reminder, downstreamMessageDto.reminder) && Intrinsics.areEqual(this.shared_location, downstreamMessageDto.shared_location) && Intrinsics.areEqual(this.member, downstreamMessageDto.member) && Intrinsics.areEqual(this.deleted_for_me, downstreamMessageDto.deleted_for_me) && Intrinsics.areEqual(this.extraData, downstreamMessageDto.extraData)) {
            return true;
        }
        return false;
    }

    public final List<AttachmentDto> getAttachments() {
        return this.attachments;
    }

    public final ChannelInfoDto getChannel() {
        return this.channel;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getCommand() {
        return this.command;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final Date getDeleted_at() {
        return this.deleted_at;
    }

    public final Boolean getDeleted_for_me() {
        return this.deleted_for_me;
    }

    public final int getDeleted_reply_count() {
        return this.deleted_reply_count;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getHtml() {
        return this.html;
    }

    public final Map<String, String> getI18n() {
        return this.i18n;
    }

    public final String getId() {
        return this.id;
    }

    public final List<DownstreamReactionDto> getLatest_reactions() {
        return this.latest_reactions;
    }

    public final DownstreamMemberInfoDto getMember() {
        return this.member;
    }

    public final Boolean getMentioned_channel() {
        return this.mentioned_channel;
    }

    public final List<DownstreamUserGroupDto> getMentioned_groups() {
        return this.mentioned_groups;
    }

    public final Boolean getMentioned_here() {
        return this.mentioned_here;
    }

    public final List<String> getMentioned_roles() {
        return this.mentioned_roles;
    }

    public final List<DownstreamUserDto> getMentioned_users() {
        return this.mentioned_users;
    }

    public final Date getMessage_text_updated_at() {
        return this.message_text_updated_at;
    }

    public final DownstreamModerationDto getModeration() {
        return this.moderation;
    }

    public final DownstreamModerationDetailsDto getModeration_details() {
        return this.moderation_details;
    }

    public final List<DownstreamReactionDto> getOwn_reactions() {
        return this.own_reactions;
    }

    public final String getParent_id() {
        return this.parent_id;
    }

    public final Date getPin_expires() {
        return this.pin_expires;
    }

    public final boolean getPinned() {
        return this.pinned;
    }

    public final Date getPinned_at() {
        return this.pinned_at;
    }

    public final DownstreamUserDto getPinned_by() {
        return this.pinned_by;
    }

    public final DownstreamPollDto getPoll() {
        return this.poll;
    }

    public final DownstreamMessageDto getQuoted_message() {
        return this.quoted_message;
    }

    public final String getQuoted_message_id() {
        return this.quoted_message_id;
    }

    public final Map<String, Integer> getReaction_counts() {
        return this.reaction_counts;
    }

    public final Map<String, DownstreamReactionGroupDto> getReaction_groups() {
        return this.reaction_groups;
    }

    public final Map<String, Integer> getReaction_scores() {
        return this.reaction_scores;
    }

    public final DownstreamReminderInfoDto getReminder() {
        return this.reminder;
    }

    public final int getReply_count() {
        return this.reply_count;
    }

    public final boolean getShadowed() {
        return this.shadowed;
    }

    public final DownstreamLocationDto getShared_location() {
        return this.shared_location;
    }

    public final boolean getShow_in_channel() {
        return this.show_in_channel;
    }

    public final boolean getSilent() {
        return this.silent;
    }

    public final String getText() {
        return this.text;
    }

    public final List<DownstreamUserDto> getThread_participants() {
        return this.thread_participants;
    }

    public final String getType() {
        return this.type;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public final DownstreamUserDto getUser() {
        return this.user;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22 = this.attachments.hashCode() * 31;
        ChannelInfoDto channelInfoDto = this.channel;
        int i = 0;
        if (channelInfoDto == null) {
            hashCode = 0;
        } else {
            hashCode = channelInfoDto.hashCode();
        }
        int e = hdi.e((hashCode22 + hashCode) * 31, 31, this.cid);
        String str = this.command;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int f = woa.f(this.created_at, (e + hashCode2) * 31, 31);
        Date date = this.deleted_at;
        if (date == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = date.hashCode();
        }
        int f2 = hdi.f(hdi.f(hdi.e(sv6.c(this.i18n, hdi.e((f + hashCode3) * 31, 31, this.html), 31), 31, this.id), 31, this.latest_reactions), 31, this.mentioned_users);
        Boolean bool = this.mentioned_here;
        if (bool == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool.hashCode();
        }
        int i2 = (f2 + hashCode4) * 31;
        Boolean bool2 = this.mentioned_channel;
        if (bool2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool2.hashCode();
        }
        int f3 = hdi.f(hdi.f(hdi.f((i2 + hashCode5) * 31, 31, this.mentioned_groups), 31, this.mentioned_roles), 31, this.own_reactions);
        String str2 = this.parent_id;
        if (str2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str2.hashCode();
        }
        int i3 = (f3 + hashCode6) * 31;
        Date date2 = this.pin_expires;
        if (date2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = date2.hashCode();
        }
        int g = hdi.g((i3 + hashCode7) * 31, 31, this.pinned);
        Date date3 = this.pinned_at;
        if (date3 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = date3.hashCode();
        }
        int i4 = (g + hashCode8) * 31;
        Date date4 = this.message_text_updated_at;
        if (date4 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = date4.hashCode();
        }
        int i5 = (i4 + hashCode9) * 31;
        DownstreamUserDto downstreamUserDto = this.pinned_by;
        if (downstreamUserDto == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = downstreamUserDto.hashCode();
        }
        int i6 = (i5 + hashCode10) * 31;
        DownstreamMessageDto downstreamMessageDto = this.quoted_message;
        if (downstreamMessageDto == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = downstreamMessageDto.hashCode();
        }
        int i7 = (i6 + hashCode11) * 31;
        String str3 = this.quoted_message_id;
        if (str3 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str3.hashCode();
        }
        int i8 = (i7 + hashCode12) * 31;
        Map<String, Integer> map = this.reaction_counts;
        if (map == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = map.hashCode();
        }
        int i9 = (i8 + hashCode13) * 31;
        Map<String, Integer> map2 = this.reaction_scores;
        if (map2 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = map2.hashCode();
        }
        int i10 = (i9 + hashCode14) * 31;
        Map<String, DownstreamReactionGroupDto> map3 = this.reaction_groups;
        if (map3 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = map3.hashCode();
        }
        int d = ix2.d(this.user, woa.f(this.updated_at, hdi.e(hdi.f(hdi.e(hdi.g(hdi.g(hdi.g(woa.b(this.deleted_reply_count, woa.b(this.reply_count, (i10 + hashCode15) * 31, 31), 31), 31, this.shadowed), 31, this.show_in_channel), 31, this.silent), 31, this.text), 31, this.thread_participants), 31, this.type), 31), 31);
        DownstreamModerationDetailsDto downstreamModerationDetailsDto = this.moderation_details;
        if (downstreamModerationDetailsDto == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = downstreamModerationDetailsDto.hashCode();
        }
        int i11 = (d + hashCode16) * 31;
        DownstreamModerationDto downstreamModerationDto = this.moderation;
        if (downstreamModerationDto == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = downstreamModerationDto.hashCode();
        }
        int i12 = (i11 + hashCode17) * 31;
        DownstreamPollDto downstreamPollDto = this.poll;
        if (downstreamPollDto == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = downstreamPollDto.hashCode();
        }
        int i13 = (i12 + hashCode18) * 31;
        DownstreamReminderInfoDto downstreamReminderInfoDto = this.reminder;
        if (downstreamReminderInfoDto == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = downstreamReminderInfoDto.hashCode();
        }
        int i14 = (i13 + hashCode19) * 31;
        DownstreamLocationDto downstreamLocationDto = this.shared_location;
        if (downstreamLocationDto == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = downstreamLocationDto.hashCode();
        }
        int i15 = (i14 + hashCode20) * 31;
        DownstreamMemberInfoDto downstreamMemberInfoDto = this.member;
        if (downstreamMemberInfoDto == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = downstreamMemberInfoDto.hashCode();
        }
        int i16 = (i15 + hashCode21) * 31;
        Boolean bool3 = this.deleted_for_me;
        if (bool3 != null) {
            i = bool3.hashCode();
        }
        return this.extraData.hashCode() + ((i16 + i) * 31);
    }

    public String toString() {
        List<AttachmentDto> list = this.attachments;
        ChannelInfoDto channelInfoDto = this.channel;
        String str = this.cid;
        String str2 = this.command;
        Date date = this.created_at;
        Date date2 = this.deleted_at;
        String str3 = this.html;
        Map<String, String> map = this.i18n;
        String str4 = this.id;
        List<DownstreamReactionDto> list2 = this.latest_reactions;
        List<DownstreamUserDto> list3 = this.mentioned_users;
        Boolean bool = this.mentioned_here;
        Boolean bool2 = this.mentioned_channel;
        List<DownstreamUserGroupDto> list4 = this.mentioned_groups;
        List<String> list5 = this.mentioned_roles;
        List<DownstreamReactionDto> list6 = this.own_reactions;
        String str5 = this.parent_id;
        Date date3 = this.pin_expires;
        boolean z = this.pinned;
        Date date4 = this.pinned_at;
        Date date5 = this.message_text_updated_at;
        DownstreamUserDto downstreamUserDto = this.pinned_by;
        DownstreamMessageDto downstreamMessageDto = this.quoted_message;
        String str6 = this.quoted_message_id;
        Map<String, Integer> map2 = this.reaction_counts;
        Map<String, Integer> map3 = this.reaction_scores;
        Map<String, DownstreamReactionGroupDto> map4 = this.reaction_groups;
        int i = this.reply_count;
        int i2 = this.deleted_reply_count;
        boolean z2 = this.shadowed;
        boolean z3 = this.show_in_channel;
        boolean z4 = this.silent;
        String str7 = this.text;
        List<DownstreamUserDto> list7 = this.thread_participants;
        String str8 = this.type;
        Date date6 = this.updated_at;
        DownstreamUserDto downstreamUserDto2 = this.user;
        DownstreamModerationDetailsDto downstreamModerationDetailsDto = this.moderation_details;
        DownstreamModerationDto downstreamModerationDto = this.moderation;
        DownstreamPollDto downstreamPollDto = this.poll;
        DownstreamReminderInfoDto downstreamReminderInfoDto = this.reminder;
        DownstreamLocationDto downstreamLocationDto = this.shared_location;
        DownstreamMemberInfoDto downstreamMemberInfoDto = this.member;
        Boolean bool3 = this.deleted_for_me;
        Map<String, Object> map5 = this.extraData;
        StringBuilder sb = new StringBuilder("DownstreamMessageDto(attachments=");
        sb.append(list);
        sb.append(", channel=");
        sb.append(channelInfoDto);
        sb.append(", cid=");
        k84.q(sb, str, ", command=", str2, ", created_at=");
        sv6.B(sb, date, ", deleted_at=", date2, ", html=");
        sb.append(str3);
        sb.append(", i18n=");
        sb.append(map);
        sb.append(", id=");
        ace.C(sb, str4, ", latest_reactions=", list2, ", mentioned_users=");
        sb.append(list3);
        sb.append(", mentioned_here=");
        sb.append(bool);
        sb.append(", mentioned_channel=");
        sb.append(bool2);
        sb.append(", mentioned_groups=");
        sb.append(list4);
        sb.append(", mentioned_roles=");
        ace.D(sb, list5, ", own_reactions=", list6, ", parent_id=");
        sv6.A(sb, str5, ", pin_expires=", date3, ", pinned=");
        sb.append(z);
        sb.append(", pinned_at=");
        sb.append(date4);
        sb.append(", message_text_updated_at=");
        sb.append(date5);
        sb.append(", pinned_by=");
        sb.append(downstreamUserDto);
        sb.append(", quoted_message=");
        sb.append(downstreamMessageDto);
        sb.append(", quoted_message_id=");
        sb.append(str6);
        sb.append(", reaction_counts=");
        sb.append(map2);
        sb.append(", reaction_scores=");
        sb.append(map3);
        sb.append(", reaction_groups=");
        sb.append(map4);
        sb.append(", reply_count=");
        sb.append(i);
        sb.append(", deleted_reply_count=");
        sb.append(i2);
        sb.append(", shadowed=");
        sb.append(z2);
        sb.append(", show_in_channel=");
        hdi.B(sb, z3, ", silent=", z4, ", text=");
        ace.C(sb, str7, ", thread_participants=", list7, ", type=");
        sv6.A(sb, str8, ", updated_at=", date6, ", user=");
        sb.append(downstreamUserDto2);
        sb.append(", moderation_details=");
        sb.append(downstreamModerationDetailsDto);
        sb.append(", moderation=");
        sb.append(downstreamModerationDto);
        sb.append(", poll=");
        sb.append(downstreamPollDto);
        sb.append(", reminder=");
        sb.append(downstreamReminderInfoDto);
        sb.append(", shared_location=");
        sb.append(downstreamLocationDto);
        sb.append(", member=");
        sb.append(downstreamMemberInfoDto);
        sb.append(", deleted_for_me=");
        sb.append(bool3);
        sb.append(", extraData=");
        return ace.n(sb, map5, ")");
    }

    public DownstreamMessageDto(List<AttachmentDto> list, ChannelInfoDto channelInfoDto, String str, String str2, Date date, Date date2, String str3, Map<String, String> map, String str4, List<DownstreamReactionDto> list2, List<DownstreamUserDto> list3, Boolean bool, Boolean bool2, List<DownstreamUserGroupDto> list4, List<String> list5, List<DownstreamReactionDto> list6, String str5, Date date3, boolean z, Date date4, Date date5, DownstreamUserDto downstreamUserDto, DownstreamMessageDto downstreamMessageDto, String str6, Map<String, Integer> map2, Map<String, Integer> map3, Map<String, DownstreamReactionGroupDto> map4, int i, int i2, boolean z2, boolean z3, boolean z4, String str7, List<DownstreamUserDto> list7, String str8, Date date6, DownstreamUserDto downstreamUserDto2, DownstreamModerationDetailsDto downstreamModerationDetailsDto, DownstreamModerationDto downstreamModerationDto, DownstreamPollDto downstreamPollDto, DownstreamReminderInfoDto downstreamReminderInfoDto, DownstreamLocationDto downstreamLocationDto, DownstreamMemberInfoDto downstreamMemberInfoDto, Boolean bool3, Map<String, ? extends Object> map5) {
        list.getClass();
        str.getClass();
        date.getClass();
        str3.getClass();
        map.getClass();
        str4.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        str7.getClass();
        list7.getClass();
        str8.getClass();
        date6.getClass();
        downstreamUserDto2.getClass();
        map5.getClass();
        this.attachments = list;
        this.channel = channelInfoDto;
        this.cid = str;
        this.command = str2;
        this.created_at = date;
        this.deleted_at = date2;
        this.html = str3;
        this.i18n = map;
        this.id = str4;
        this.latest_reactions = list2;
        this.mentioned_users = list3;
        this.mentioned_here = bool;
        this.mentioned_channel = bool2;
        this.mentioned_groups = list4;
        this.mentioned_roles = list5;
        this.own_reactions = list6;
        this.parent_id = str5;
        this.pin_expires = date3;
        this.pinned = z;
        this.pinned_at = date4;
        this.message_text_updated_at = date5;
        this.pinned_by = downstreamUserDto;
        this.quoted_message = downstreamMessageDto;
        this.quoted_message_id = str6;
        this.reaction_counts = map2;
        this.reaction_scores = map3;
        this.reaction_groups = map4;
        this.reply_count = i;
        this.deleted_reply_count = i2;
        this.shadowed = z2;
        this.show_in_channel = z3;
        this.silent = z4;
        this.text = str7;
        this.thread_participants = list7;
        this.type = str8;
        this.updated_at = date6;
        this.user = downstreamUserDto2;
        this.moderation_details = downstreamModerationDetailsDto;
        this.moderation = downstreamModerationDto;
        this.poll = downstreamPollDto;
        this.reminder = downstreamReminderInfoDto;
        this.shared_location = downstreamLocationDto;
        this.member = downstreamMemberInfoDto;
        this.deleted_for_me = bool3;
        this.extraData = map5;
    }
}
