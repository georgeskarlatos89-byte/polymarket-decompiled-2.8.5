package io.getstream.chat.android.models;

import com.appsflyer.AppsFlyerProperties;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ace;
import defpackage.fd7;
import defpackage.hdi;
import defpackage.hm6;
import defpackage.ix2;
import defpackage.k84;
import defpackage.m51;
import defpackage.sv6;
import defpackage.woa;
import defpackage.zc7;
import io.getstream.chat.android.models.querysort.ComparableFieldProvider;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\bB\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u00ad\u0001Bã\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001f\u001a\u00020\t\u0012\b\b\u0002\u0010 \u001a\u00020\u0004\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010#\u001a\u00020\t\u0012\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0014\u0012\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0017\u0012\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\b\b\u0002\u0010+\u001a\u00020\u000b\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0014\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000102\u0012\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u00106\u001a\u00020\u000b\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u000b\u0012\u0014\b\u0002\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020:09¢\u0006\u0004\b;\u0010<J\u0016\u0010|\u001a\b\u0012\u0002\b\u0003\u0018\u00010}2\u0006\u0010~\u001a\u00020\u0004H\u0016J\t\u0010\u007f\u001a\u00030\u0080\u0001H\u0007J\n\u0010\u0081\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u000bHÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0011HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\tHÆ\u0003J\u0010\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\u0010\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014HÆ\u0003J\u0010\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014HÆ\u0003J\u0010\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u001dHÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0019HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0004HÆ\u0003J\u0011\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010[J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\tHÆ\u0003J\u0010\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020%0\u0014HÆ\u0003J\u0010\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\u0010\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040(HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0010\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u000bHÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010-HÆ\u0003J\u0010\u0010\u009e\u0001\u001a\b\u0012\u0004\u0012\u00020/0\u0014HÆ\u0003J\u0011\u0010\u009f\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010jJ\f\u0010 \u0001\u001a\u0004\u0018\u000102HÆ\u0003J\u0010\u0010¡\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014HÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010£\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u000bHÆ\u0003J\u0011\u0010¥\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010[J\u0016\u0010¦\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020:09HÆ\u0003Jì\u0003\u0010§\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\t2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00142\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00142\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00192\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010#\u001a\u00020\t2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00142\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00172\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010+\u001a\u00020\u000b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00142\n\b\u0002\u00100\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\n\b\u0002\u00104\u001a\u0004\u0018\u00010\r2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\r2\b\b\u0002\u00106\u001a\u00020\u000b2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020:09HÆ\u0001¢\u0006\u0003\u0010¨\u0001J\u0015\u0010©\u0001\u001a\u00020\u000b2\t\u0010ª\u0001\u001a\u0004\u0018\u00010:HÖ\u0003J\n\u0010«\u0001\u001a\u00020\tHÖ\u0001J\n\u0010¬\u0001\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010>R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010>R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010>R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bH\u0010GR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bI\u0010GR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bL\u0010CR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014¢\u0006\b\n\u0000\u001a\u0004\bO\u0010NR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014¢\u0006\b\n\u0000\u001a\u0004\bP\u0010NR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010NR\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0011\u0010\u001e\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u001c\u0010\u001f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bV\u0010W\u001a\u0004\bX\u0010CR\u0011\u0010 \u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010>R\u0015\u0010!\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\\\u001a\u0004\bZ\u0010[R\u0013\u0010\"\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b]\u0010GR\u0011\u0010#\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b^\u0010CR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0014¢\u0006\b\n\u0000\u001a\u0004\b_\u0010NR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b`\u0010NR\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040(¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0013\u0010)\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\be\u0010NR\u0011\u0010+\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010ER\u0013\u0010,\u001a\u0004\u0018\u00010-¢\u0006\b\n\u0000\u001a\u0004\bf\u0010gR\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0014¢\u0006\b\n\u0000\u001a\u0004\bh\u0010NR\u0015\u00100\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010k\u001a\u0004\bi\u0010jR\u0013\u00101\u001a\u0004\u0018\u000102¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014¢\u0006\b\n\u0000\u001a\u0004\bn\u0010NR\u0013\u00104\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bo\u0010GR\u0013\u00105\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bp\u0010GR\u0011\u00106\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bq\u0010ER\u0015\u00107\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\\\u001a\u0004\br\u0010[R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020:09X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bs\u0010tR\u0011\u0010u\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bv\u0010>R\u0013\u0010w\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bx\u0010GR\u001a\u0010y\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bz\u0010W\u001a\u0004\b{\u0010E¨\u0006®\u0001"}, d2 = {"Lio/getstream/chat/android/models/Channel;", "Lio/getstream/chat/android/models/CustomObject;", "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "type", Keys.KEY_NAME, "image", "watcherCount", "", "frozen", "", "createdAt", "Ljava/util/Date;", "deletedAt", "updatedAt", "syncStatus", "Lio/getstream/chat/android/models/SyncStatus;", "memberCount", "messages", "", "Lio/getstream/chat/android/models/Message;", "members", "Lio/getstream/chat/android/models/Member;", "watchers", "Lio/getstream/chat/android/models/User;", "read", "Lio/getstream/chat/android/models/ChannelUserRead;", "config", "Lio/getstream/chat/android/models/Config;", "createdBy", "unreadCount", "team", "hidden", "hiddenMessagesBefore", "cooldown", "pendingMessages", "Lio/getstream/chat/android/models/PendingMessage;", "pinnedMessages", "ownCapabilities", "", "membership", "cachedLatestMessages", "isInsideSearch", "draftMessage", "Lio/getstream/chat/android/models/DraftMessage;", "activeLiveLocations", "Lio/getstream/chat/android/models/Location;", "messageCount", "pushPreference", "Lio/getstream/chat/android/models/PushPreference;", "filterTags", "lastMessageAt", "truncatedAt", "disabled", "blocked", "extraData", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZLjava/lang/Boolean;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getType", "getName", "getImage", "getWatcherCount", "()I", "getFrozen", "()Z", "getCreatedAt", "()Ljava/util/Date;", "getDeletedAt", "getUpdatedAt", "getSyncStatus", "()Lio/getstream/chat/android/models/SyncStatus;", "getMemberCount", "getMessages", "()Ljava/util/List;", "getMembers", "getWatchers", "getRead", "getConfig", "()Lio/getstream/chat/android/models/Config;", "getCreatedBy", "()Lio/getstream/chat/android/models/User;", "getUnreadCount$annotations", "()V", "getUnreadCount", "getTeam", "getHidden", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHiddenMessagesBefore", "getCooldown", "getPendingMessages", "getPinnedMessages", "getOwnCapabilities", "()Ljava/util/Set;", "getMembership", "()Lio/getstream/chat/android/models/Member;", "getCachedLatestMessages", "getDraftMessage", "()Lio/getstream/chat/android/models/DraftMessage;", "getActiveLiveLocations", "getMessageCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPushPreference", "()Lio/getstream/chat/android/models/PushPreference;", "getFilterTags", "getLastMessageAt", "getTruncatedAt", "getDisabled", "getBlocked", "getExtraData", "()Ljava/util/Map;", "cid", "getCid", "lastUpdated", "getLastUpdated", "hasUnread", "getHasUnread$annotations", "getHasUnread", "getComparableField", "", "fieldName", "newBuilder", "Lio/getstream/chat/android/models/Channel$Builder;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZLjava/lang/Boolean;Ljava/util/Map;)Lio/getstream/chat/android/models/Channel;", "equals", "other", "hashCode", "toString", "Builder", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Channel implements CustomObject, ComparableFieldProvider {
    private final List<Location> activeLiveLocations;
    private final Boolean blocked;
    private final List<Message> cachedLatestMessages;
    private final Config config;
    private final int cooldown;
    private final Date createdAt;
    private final User createdBy;
    private final Date deletedAt;
    private final boolean disabled;
    private final DraftMessage draftMessage;
    private final Map<String, Object> extraData;
    private final List<String> filterTags;
    private final boolean frozen;
    private final Boolean hidden;
    private final Date hiddenMessagesBefore;
    private final String id;
    private final String image;
    private final boolean isInsideSearch;
    private final Date lastMessageAt;
    private final int memberCount;
    private final List<Member> members;
    private final Member membership;
    private final Integer messageCount;
    private final List<Message> messages;
    private final String name;
    private final Set<String> ownCapabilities;
    private final List<PendingMessage> pendingMessages;
    private final List<Message> pinnedMessages;
    private final PushPreference pushPreference;
    private final List<ChannelUserRead> read;
    private final SyncStatus syncStatus;
    private final String team;
    private final Date truncatedAt;
    private final String type;
    private final int unreadCount;
    private final Date updatedAt;
    private final int watcherCount;
    private final List<User> watchers;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Channel(String str, String str2, String str3, String str4, int i, boolean z, Date date, Date date2, Date date3, SyncStatus syncStatus, int i2, List list, List list2, List list3, List list4, Config config, User user, int i3, String str5, Boolean bool, Date date4, int i4, List list5, List list6, Set set, Member member, List list7, boolean z2, DraftMessage draftMessage, List list8, Integer num, PushPreference pushPreference, List list9, Date date5, Date date6, boolean z3, Boolean bool2, Map map, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(r88, r3, r4, r5, r6, r8, r9, r11, r12, r13, r14, r15, r7, r10, r1, r17, r18, r16, r2, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r0, r31, r32, r33, r34, r35, r86);
        Map map2;
        String str6 = (i5 & 1) != 0 ? "" : str;
        String str7 = (i5 & 2) != 0 ? "" : str2;
        String str8 = (i5 & 4) != 0 ? "" : str3;
        String str9 = (i5 & 8) != 0 ? "" : str4;
        int i7 = (i5 & 16) != 0 ? 0 : i;
        boolean z4 = (i5 & 32) != 0 ? false : z;
        Date date7 = (i5 & 64) != 0 ? null : date;
        Date date8 = (i5 & 128) != 0 ? null : date2;
        Date date9 = (i5 & 256) != 0 ? null : date3;
        SyncStatus syncStatus2 = (i5 & Barcode.FORMAT_UPC_A) != 0 ? SyncStatus.COMPLETED : syncStatus;
        int i8 = (i5 & Barcode.FORMAT_UPC_E) != 0 ? 0 : i2;
        List emptyList = (i5 & 2048) != 0 ? CollectionsKt.emptyList() : list;
        List emptyList2 = (i5 & 4096) != 0 ? CollectionsKt.emptyList() : list2;
        List emptyList3 = (i5 & 8192) != 0 ? CollectionsKt.emptyList() : list3;
        String str10 = str6;
        List emptyList4 = (i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? CollectionsKt.emptyList() : list4;
        Config config2 = (i5 & 32768) != 0 ? new Config(null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, 0, null, null, null, null, false, false, false, null, 134217727, null) : config;
        User user2 = (i5 & 65536) != 0 ? new User(null, null, null, null, null, null, null, null, null, false, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, 33554431, null) : user;
        int i9 = (i5 & 131072) != 0 ? 0 : i3;
        String str11 = (i5 & 262144) == 0 ? str5 : "";
        Boolean bool3 = (i5 & 524288) != 0 ? null : bool;
        Date date10 = (i5 & 1048576) != 0 ? null : date4;
        int i10 = (i5 & 2097152) != 0 ? 0 : i4;
        List emptyList5 = (i5 & 4194304) != 0 ? CollectionsKt.emptyList() : list5;
        List emptyList6 = (i5 & 8388608) != 0 ? CollectionsKt.emptyList() : list6;
        Set set2 = (i5 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? fd7.a : set;
        Member member2 = (i5 & 33554432) != 0 ? null : member;
        List emptyList7 = (i5 & 67108864) != 0 ? CollectionsKt.emptyList() : list7;
        boolean z5 = (i5 & 134217728) != 0 ? false : z2;
        DraftMessage draftMessage2 = (i5 & 268435456) != 0 ? null : draftMessage;
        List emptyList8 = (i5 & 536870912) != 0 ? CollectionsKt.emptyList() : list8;
        Integer num2 = (i5 & 1073741824) != 0 ? null : num;
        PushPreference pushPreference2 = (i5 & Integer.MIN_VALUE) != 0 ? null : pushPreference;
        List emptyList9 = (i6 & 1) != 0 ? CollectionsKt.emptyList() : list9;
        Date date11 = (i6 & 2) != 0 ? null : date5;
        Date date12 = (i6 & 4) != 0 ? null : date6;
        boolean z6 = (i6 & 8) != 0 ? false : z3;
        Boolean bool4 = (i6 & 16) != 0 ? null : bool2;
        if ((i6 & 32) != 0) {
            zc7 zc7Var = zc7.a;
            zc7Var.getClass();
            map2 = zc7Var;
        } else {
            map2 = map;
        }
    }

    public static /* synthetic */ Channel copy$default(Channel channel, String str, String str2, String str3, String str4, int i, boolean z, Date date, Date date2, Date date3, SyncStatus syncStatus, int i2, List list, List list2, List list3, List list4, Config config, User user, int i3, String str5, Boolean bool, Date date4, int i4, List list5, List list6, Set set, Member member, List list7, boolean z2, DraftMessage draftMessage, List list8, Integer num, PushPreference pushPreference, List list9, Date date5, Date date6, boolean z3, Boolean bool2, Map map, int i5, int i6, Object obj) {
        Map map2;
        Boolean bool3;
        int i7;
        List list10;
        List list11;
        Set set2;
        Member member2;
        List list12;
        boolean z4;
        DraftMessage draftMessage2;
        List list13;
        Integer num2;
        PushPreference pushPreference2;
        List list14;
        Date date7;
        Date date8;
        boolean z5;
        List list15;
        Date date9;
        Date date10;
        Date date11;
        SyncStatus syncStatus2;
        int i8;
        List list16;
        List list17;
        List list18;
        Config config2;
        User user2;
        int i9;
        String str6;
        Boolean bool4;
        Date date12;
        String str7;
        String str8;
        String str9;
        int i10;
        boolean z6;
        String str10 = (i5 & 1) != 0 ? channel.id : str;
        String str11 = (i5 & 2) != 0 ? channel.type : str2;
        String str12 = (i5 & 4) != 0 ? channel.name : str3;
        String str13 = (i5 & 8) != 0 ? channel.image : str4;
        int i11 = (i5 & 16) != 0 ? channel.watcherCount : i;
        boolean z7 = (i5 & 32) != 0 ? channel.frozen : z;
        Date date13 = (i5 & 64) != 0 ? channel.createdAt : date;
        Date date14 = (i5 & 128) != 0 ? channel.deletedAt : date2;
        Date date15 = (i5 & 256) != 0 ? channel.updatedAt : date3;
        SyncStatus syncStatus3 = (i5 & Barcode.FORMAT_UPC_A) != 0 ? channel.syncStatus : syncStatus;
        int i12 = (i5 & Barcode.FORMAT_UPC_E) != 0 ? channel.memberCount : i2;
        List list19 = (i5 & 2048) != 0 ? channel.messages : list;
        List list20 = (i5 & 4096) != 0 ? channel.members : list2;
        List list21 = (i5 & 8192) != 0 ? channel.watchers : list3;
        String str14 = str10;
        List list22 = (i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? channel.read : list4;
        Config config3 = (i5 & 32768) != 0 ? channel.config : config;
        User user3 = (i5 & 65536) != 0 ? channel.createdBy : user;
        int i13 = (i5 & 131072) != 0 ? channel.unreadCount : i3;
        String str15 = (i5 & 262144) != 0 ? channel.team : str5;
        Boolean bool5 = (i5 & 524288) != 0 ? channel.hidden : bool;
        Date date16 = (i5 & 1048576) != 0 ? channel.hiddenMessagesBefore : date4;
        int i14 = (i5 & 2097152) != 0 ? channel.cooldown : i4;
        List list23 = (i5 & 4194304) != 0 ? channel.pendingMessages : list5;
        List list24 = (i5 & 8388608) != 0 ? channel.pinnedMessages : list6;
        Set set3 = (i5 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? channel.ownCapabilities : set;
        Member member3 = (i5 & 33554432) != 0 ? channel.membership : member;
        List list25 = (i5 & 67108864) != 0 ? channel.cachedLatestMessages : list7;
        boolean z8 = (i5 & 134217728) != 0 ? channel.isInsideSearch : z2;
        DraftMessage draftMessage3 = (i5 & 268435456) != 0 ? channel.draftMessage : draftMessage;
        List list26 = (i5 & 536870912) != 0 ? channel.activeLiveLocations : list8;
        Integer num3 = (i5 & 1073741824) != 0 ? channel.messageCount : num;
        PushPreference pushPreference3 = (i5 & Integer.MIN_VALUE) != 0 ? channel.pushPreference : pushPreference;
        List list27 = (i6 & 1) != 0 ? channel.filterTags : list9;
        Date date17 = (i6 & 2) != 0 ? channel.lastMessageAt : date5;
        Date date18 = (i6 & 4) != 0 ? channel.truncatedAt : date6;
        boolean z9 = (i6 & 8) != 0 ? channel.disabled : z3;
        Boolean bool6 = (i6 & 16) != 0 ? channel.blocked : bool2;
        if ((i6 & 32) != 0) {
            bool3 = bool6;
            map2 = channel.extraData;
            list10 = list23;
            list11 = list24;
            set2 = set3;
            member2 = member3;
            list12 = list25;
            z4 = z8;
            draftMessage2 = draftMessage3;
            list13 = list26;
            num2 = num3;
            pushPreference2 = pushPreference3;
            list14 = list27;
            date7 = date17;
            date8 = date18;
            z5 = z9;
            list15 = list22;
            date10 = date14;
            date11 = date15;
            syncStatus2 = syncStatus3;
            i8 = i12;
            list16 = list19;
            list17 = list20;
            list18 = list21;
            config2 = config3;
            user2 = user3;
            i9 = i13;
            str6 = str15;
            bool4 = bool5;
            date12 = date16;
            i7 = i14;
            str7 = str11;
            str8 = str12;
            str9 = str13;
            i10 = i11;
            z6 = z7;
            date9 = date13;
        } else {
            map2 = map;
            bool3 = bool6;
            i7 = i14;
            list10 = list23;
            list11 = list24;
            set2 = set3;
            member2 = member3;
            list12 = list25;
            z4 = z8;
            draftMessage2 = draftMessage3;
            list13 = list26;
            num2 = num3;
            pushPreference2 = pushPreference3;
            list14 = list27;
            date7 = date17;
            date8 = date18;
            z5 = z9;
            list15 = list22;
            date9 = date13;
            date10 = date14;
            date11 = date15;
            syncStatus2 = syncStatus3;
            i8 = i12;
            list16 = list19;
            list17 = list20;
            list18 = list21;
            config2 = config3;
            user2 = user3;
            i9 = i13;
            str6 = str15;
            bool4 = bool5;
            date12 = date16;
            str7 = str11;
            str8 = str12;
            str9 = str13;
            i10 = i11;
            z6 = z7;
        }
        return channel.copy(str14, str7, str8, str9, i10, z6, date9, date10, date11, syncStatus2, i8, list16, list17, list18, list15, config2, user2, i9, str6, bool4, date12, i7, list10, list11, set2, member2, list12, z4, draftMessage2, list13, num2, pushPreference2, list14, date7, date8, z5, bool3, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final SyncStatus getSyncStatus() {
        return this.syncStatus;
    }

    /* renamed from: component11, reason: from getter */
    public final int getMemberCount() {
        return this.memberCount;
    }

    public final List<Message> component12() {
        return this.messages;
    }

    public final List<Member> component13() {
        return this.members;
    }

    public final List<User> component14() {
        return this.watchers;
    }

    public final List<ChannelUserRead> component15() {
        return this.read;
    }

    /* renamed from: component16, reason: from getter */
    public final Config getConfig() {
        return this.config;
    }

    /* renamed from: component17, reason: from getter */
    public final User getCreatedBy() {
        return this.createdBy;
    }

    /* renamed from: component18, reason: from getter */
    public final int getUnreadCount() {
        return this.unreadCount;
    }

    /* renamed from: component19, reason: from getter */
    public final String getTeam() {
        return this.team;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component20, reason: from getter */
    public final Boolean getHidden() {
        return this.hidden;
    }

    /* renamed from: component21, reason: from getter */
    public final Date getHiddenMessagesBefore() {
        return this.hiddenMessagesBefore;
    }

    /* renamed from: component22, reason: from getter */
    public final int getCooldown() {
        return this.cooldown;
    }

    public final List<PendingMessage> component23() {
        return this.pendingMessages;
    }

    public final List<Message> component24() {
        return this.pinnedMessages;
    }

    public final Set<String> component25() {
        return this.ownCapabilities;
    }

    /* renamed from: component26, reason: from getter */
    public final Member getMembership() {
        return this.membership;
    }

    public final List<Message> component27() {
        return this.cachedLatestMessages;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getIsInsideSearch() {
        return this.isInsideSearch;
    }

    /* renamed from: component29, reason: from getter */
    public final DraftMessage getDraftMessage() {
        return this.draftMessage;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<Location> component30() {
        return this.activeLiveLocations;
    }

    /* renamed from: component31, reason: from getter */
    public final Integer getMessageCount() {
        return this.messageCount;
    }

    /* renamed from: component32, reason: from getter */
    public final PushPreference getPushPreference() {
        return this.pushPreference;
    }

    public final List<String> component33() {
        return this.filterTags;
    }

    /* renamed from: component34, reason: from getter */
    public final Date getLastMessageAt() {
        return this.lastMessageAt;
    }

    /* renamed from: component35, reason: from getter */
    public final Date getTruncatedAt() {
        return this.truncatedAt;
    }

    /* renamed from: component36, reason: from getter */
    public final boolean getDisabled() {
        return this.disabled;
    }

    /* renamed from: component37, reason: from getter */
    public final Boolean getBlocked() {
        return this.blocked;
    }

    public final Map<String, Object> component38() {
        return this.extraData;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component5, reason: from getter */
    public final int getWatcherCount() {
        return this.watcherCount;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getFrozen() {
        return this.frozen;
    }

    /* renamed from: component7, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component8, reason: from getter */
    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    /* renamed from: component9, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final Channel copy(String id, String type, String name, String image, int watcherCount, boolean frozen, Date createdAt, Date deletedAt, Date updatedAt, SyncStatus syncStatus, int memberCount, List<Message> messages, List<Member> members, List<User> watchers, List<ChannelUserRead> read, Config config, User createdBy, int unreadCount, String team, Boolean hidden, Date hiddenMessagesBefore, int cooldown, List<PendingMessage> pendingMessages, List<Message> pinnedMessages, Set<String> ownCapabilities, Member membership, List<Message> cachedLatestMessages, boolean isInsideSearch, DraftMessage draftMessage, List<Location> activeLiveLocations, Integer messageCount, PushPreference pushPreference, List<String> filterTags, Date lastMessageAt, Date truncatedAt, boolean disabled, Boolean blocked, Map<String, ? extends Object> extraData) {
        id.getClass();
        type.getClass();
        name.getClass();
        image.getClass();
        syncStatus.getClass();
        messages.getClass();
        members.getClass();
        watchers.getClass();
        read.getClass();
        config.getClass();
        createdBy.getClass();
        team.getClass();
        pendingMessages.getClass();
        pinnedMessages.getClass();
        ownCapabilities.getClass();
        cachedLatestMessages.getClass();
        activeLiveLocations.getClass();
        filterTags.getClass();
        extraData.getClass();
        return new Channel(id, type, name, image, watcherCount, frozen, createdAt, deletedAt, updatedAt, syncStatus, memberCount, messages, members, watchers, read, config, createdBy, unreadCount, team, hidden, hiddenMessagesBefore, cooldown, pendingMessages, pinnedMessages, ownCapabilities, membership, cachedLatestMessages, isInsideSearch, draftMessage, activeLiveLocations, messageCount, pushPreference, filterTags, lastMessageAt, truncatedAt, disabled, blocked, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Channel)) {
            return false;
        }
        Channel channel = (Channel) other;
        if (Intrinsics.areEqual(this.id, channel.id) && Intrinsics.areEqual(this.type, channel.type) && Intrinsics.areEqual(this.name, channel.name) && Intrinsics.areEqual(this.image, channel.image) && this.watcherCount == channel.watcherCount && this.frozen == channel.frozen && Intrinsics.areEqual(this.createdAt, channel.createdAt) && Intrinsics.areEqual(this.deletedAt, channel.deletedAt) && Intrinsics.areEqual(this.updatedAt, channel.updatedAt) && this.syncStatus == channel.syncStatus && this.memberCount == channel.memberCount && Intrinsics.areEqual(this.messages, channel.messages) && Intrinsics.areEqual(this.members, channel.members) && Intrinsics.areEqual(this.watchers, channel.watchers) && Intrinsics.areEqual(this.read, channel.read) && Intrinsics.areEqual(this.config, channel.config) && Intrinsics.areEqual(this.createdBy, channel.createdBy) && this.unreadCount == channel.unreadCount && Intrinsics.areEqual(this.team, channel.team) && Intrinsics.areEqual(this.hidden, channel.hidden) && Intrinsics.areEqual(this.hiddenMessagesBefore, channel.hiddenMessagesBefore) && this.cooldown == channel.cooldown && Intrinsics.areEqual(this.pendingMessages, channel.pendingMessages) && Intrinsics.areEqual(this.pinnedMessages, channel.pinnedMessages) && Intrinsics.areEqual(this.ownCapabilities, channel.ownCapabilities) && Intrinsics.areEqual(this.membership, channel.membership) && Intrinsics.areEqual(this.cachedLatestMessages, channel.cachedLatestMessages) && this.isInsideSearch == channel.isInsideSearch && Intrinsics.areEqual(this.draftMessage, channel.draftMessage) && Intrinsics.areEqual(this.activeLiveLocations, channel.activeLiveLocations) && Intrinsics.areEqual(this.messageCount, channel.messageCount) && Intrinsics.areEqual(this.pushPreference, channel.pushPreference) && Intrinsics.areEqual(this.filterTags, channel.filterTags) && Intrinsics.areEqual(this.lastMessageAt, channel.lastMessageAt) && Intrinsics.areEqual(this.truncatedAt, channel.truncatedAt) && this.disabled == channel.disabled && Intrinsics.areEqual(this.blocked, channel.blocked) && Intrinsics.areEqual(this.extraData, channel.extraData)) {
            return true;
        }
        return false;
    }

    public final List<Location> getActiveLiveLocations() {
        return this.activeLiveLocations;
    }

    public final Boolean getBlocked() {
        return this.blocked;
    }

    public final List<Message> getCachedLatestMessages() {
        return this.cachedLatestMessages;
    }

    public final String getCid() {
        if (this.id.length() == 0 || this.type.length() == 0) {
            return "";
        }
        return ace.m(this.type, ":", this.id);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0145, code lost:
    
        if (r3.equals("deletedAt") == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0152, code lost:
    
        if (r3.equals("pinnedAt") == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0176, code lost:
    
        if (r3.equals("watcherCount") == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0186, code lost:
    
        if (r3.equals("truncatedAt") == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0192, code lost:
    
        if (r3.equals("unreadCount") == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x014b, code lost:
    
        return r2.deletedAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01be, code lost:
    
        if (r3.equals("updatedAt") == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01ca, code lost:
    
        if (r3.equals("has_unread") == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r3.equals("lastUpdated") == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
    
        return getLastUpdated();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r3.equals("created_at") == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        return r2.createdAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r3.equals("memberCount") == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ff, code lost:
    
        return java.lang.Integer.valueOf(r2.memberCount);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        if (r3.equals("lastMessageAt") == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x010c, code lost:
    
        return r2.lastMessageAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        if (r3.equals("archived_at") == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0117, code lost:
    
        r2 = r2.membership;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0119, code lost:
    
        if (r2 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x011f, code lost:
    
        return r2.getArchivedAt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0120, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        if (r3.equals("truncated_at") == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x018b, code lost:
    
        return r2.truncatedAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0063, code lost:
    
        if (r3.equals("watcher_count") == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x017f, code lost:
    
        return java.lang.Integer.valueOf(r2.watcherCount);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006d, code lost:
    
        if (r3.equals("createdAt") == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007a, code lost:
    
        if (r3.equals("last_updated") == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r3.equals("unread_count") == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x019b, code lost:
    
        return java.lang.Integer.valueOf(r2.unreadCount);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f5, code lost:
    
        if (r3.equals("member_count") == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0106, code lost:
    
        if (r3.equals("last_message_at") == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0113, code lost:
    
        if (r3.equals("archivedAt") == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0127, code lost:
    
        if (r3.equals("pinned_at") == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0156, code lost:
    
        r2 = r2.membership;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0158, code lost:
    
        if (r2 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x015e, code lost:
    
        return r2.getPinnedAt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x015f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0131, code lost:
    
        if (r3.equals("hasUnread") == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e4, code lost:
    
        return java.lang.Boolean.valueOf(getHasUnread());
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x013b, code lost:
    
        if (r3.equals("updated_at") == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c3, code lost:
    
        return r2.updatedAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r3.equals("deleted_at") == false) goto L158;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01db A[RETURN] */
    @Override // io.getstream.chat.android.models.querysort.ComparableFieldProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Comparable<?> getComparableField(String fieldName) {
        Object obj;
        fieldName.getClass();
        switch (fieldName.hashCode()) {
            case -2059035404:
                break;
            case -1949194674:
                break;
            case -1266085216:
                if (fieldName.equals("frozen")) {
                    return Boolean.valueOf(this.frozen);
                }
                obj = getExtraData().get(fieldName);
                if (obj instanceof Comparable) {
                    return null;
                }
                return (Comparable) obj;
            case -1217487446:
                if (fieldName.equals("hidden")) {
                    return this.hidden;
                }
                obj = getExtraData().get(fieldName);
                if (obj instanceof Comparable) {
                }
                break;
            case -1070996832:
                break;
            case -948014959:
                break;
            case -558482253:
                break;
            case -546109589:
                if (fieldName.equals("cooldown")) {
                    return Integer.valueOf(this.cooldown);
                }
                obj = getExtraData().get(fieldName);
                if (obj instanceof Comparable) {
                }
                break;
            case -421231061:
                break;
            case -358705620:
                break;
            case -295464393:
                break;
            case -220522775:
                break;
            case -173232646:
                break;
            case -104542283:
                break;
            case -83031884:
                break;
            case -59350230:
                break;
            case -21437972:
                if (fieldName.equals("blocked")) {
                    return this.blocked;
                }
                obj = getExtraData().get(fieldName);
                if (obj instanceof Comparable) {
                }
                break;
            case 3355:
                if (fieldName.equals(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID)) {
                    return this.id;
                }
                obj = getExtraData().get(fieldName);
                if (obj instanceof Comparable) {
                }
                break;
            case 98494:
                if (fieldName.equals("cid")) {
                    return getCid();
                }
                obj = getExtraData().get(fieldName);
                if (obj instanceof Comparable) {
                }
                break;
            case 3373707:
                if (fieldName.equals(Keys.KEY_NAME)) {
                    return this.name;
                }
                obj = getExtraData().get(fieldName);
                if (obj instanceof Comparable) {
                }
                break;
            case 3555933:
                if (fieldName.equals("team")) {
                    return this.team;
                }
                obj = getExtraData().get(fieldName);
                if (obj instanceof Comparable) {
                }
                break;
            case 3575610:
                if (fieldName.equals("type")) {
                    return this.type;
                }
                obj = getExtraData().get(fieldName);
                if (obj instanceof Comparable) {
                }
                break;
            case 100313435:
                if (fieldName.equals("image")) {
                    return this.image;
                }
                obj = getExtraData().get(fieldName);
                if (obj instanceof Comparable) {
                }
                break;
            case 270940796:
                if (fieldName.equals("disabled")) {
                    return Boolean.valueOf(this.disabled);
                }
                obj = getExtraData().get(fieldName);
                if (obj instanceof Comparable) {
                }
                break;
            case 338699282:
                break;
            case 598371643:
                break;
            case 657281228:
                break;
            case 676335700:
                break;
            case 1054184880:
                break;
            case 1060583588:
                break;
            case 1358063253:
                break;
            case 1369680106:
                break;
            case 1649733957:
                break;
            case 1765056025:
                break;
            case 1949198463:
                break;
            default:
                obj = getExtraData().get(fieldName);
                if (obj instanceof Comparable) {
                }
                break;
        }
    }

    public final Config getConfig() {
        return this.config;
    }

    public final int getCooldown() {
        return this.cooldown;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final User getCreatedBy() {
        return this.createdBy;
    }

    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final DraftMessage getDraftMessage() {
        return this.draftMessage;
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public Map<String, Object> getExtraData() {
        return this.extraData;
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public <T> T getExtraValue(String str, T t) {
        return (T) super.getExtraValue(str, t);
    }

    public final List<String> getFilterTags() {
        return this.filterTags;
    }

    public final boolean getFrozen() {
        return this.frozen;
    }

    public final boolean getHasUnread() {
        if (this.unreadCount > 0) {
            return true;
        }
        return false;
    }

    public final Boolean getHidden() {
        return this.hidden;
    }

    public final Date getHiddenMessagesBefore() {
        return this.hiddenMessagesBefore;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final Date getLastMessageAt() {
        return this.lastMessageAt;
    }

    public final Date getLastUpdated() {
        Date date = this.lastMessageAt;
        if (date != null) {
            Date date2 = this.createdAt;
            if (date2 != null && !date.after(date2)) {
                date = null;
            }
            if (date != null) {
                return date;
            }
        }
        return this.createdAt;
    }

    public final int getMemberCount() {
        return this.memberCount;
    }

    public final List<Member> getMembers() {
        return this.members;
    }

    public final Member getMembership() {
        return this.membership;
    }

    public final Integer getMessageCount() {
        return this.messageCount;
    }

    public final List<Message> getMessages() {
        return this.messages;
    }

    public final String getName() {
        return this.name;
    }

    public final Set<String> getOwnCapabilities() {
        return this.ownCapabilities;
    }

    public final List<PendingMessage> getPendingMessages() {
        return this.pendingMessages;
    }

    public final List<Message> getPinnedMessages() {
        return this.pinnedMessages;
    }

    public final PushPreference getPushPreference() {
        return this.pushPreference;
    }

    public final List<ChannelUserRead> getRead() {
        return this.read;
    }

    public final SyncStatus getSyncStatus() {
        return this.syncStatus;
    }

    public final String getTeam() {
        return this.team;
    }

    public final Date getTruncatedAt() {
        return this.truncatedAt;
    }

    public final String getType() {
        return this.type;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final int getWatcherCount() {
        return this.watcherCount;
    }

    public final List<User> getWatchers() {
        return this.watchers;
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
        int g = hdi.g(woa.b(this.watcherCount, hdi.e(hdi.e(hdi.e(this.id.hashCode() * 31, 31, this.type), 31, this.name), 31, this.image), 31), 31, this.frozen);
        Date date = this.createdAt;
        int i = 0;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        int i2 = (g + hashCode) * 31;
        Date date2 = this.deletedAt;
        if (date2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = date2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Date date3 = this.updatedAt;
        if (date3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = date3.hashCode();
        }
        int e = hdi.e(woa.b(this.unreadCount, ix2.f(this.createdBy, (this.config.hashCode() + hdi.f(hdi.f(hdi.f(hdi.f(woa.b(this.memberCount, (this.syncStatus.hashCode() + ((i3 + hashCode3) * 31)) * 31, 31), 31, this.messages), 31, this.members), 31, this.watchers), 31, this.read)) * 31, 31), 31), 31, this.team);
        Boolean bool = this.hidden;
        if (bool == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool.hashCode();
        }
        int i4 = (e + hashCode4) * 31;
        Date date4 = this.hiddenMessagesBefore;
        if (date4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = date4.hashCode();
        }
        int d = sv6.d(this.ownCapabilities, hdi.f(hdi.f(woa.b(this.cooldown, (i4 + hashCode5) * 31, 31), 31, this.pendingMessages), 31, this.pinnedMessages), 31);
        Member member = this.membership;
        if (member == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = member.hashCode();
        }
        int g2 = hdi.g(hdi.f((d + hashCode6) * 31, 31, this.cachedLatestMessages), 31, this.isInsideSearch);
        DraftMessage draftMessage = this.draftMessage;
        if (draftMessage == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = draftMessage.hashCode();
        }
        int f = hdi.f((g2 + hashCode7) * 31, 31, this.activeLiveLocations);
        Integer num = this.messageCount;
        if (num == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num.hashCode();
        }
        int i5 = (f + hashCode8) * 31;
        PushPreference pushPreference = this.pushPreference;
        if (pushPreference == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = pushPreference.hashCode();
        }
        int f2 = hdi.f((i5 + hashCode9) * 31, 31, this.filterTags);
        Date date5 = this.lastMessageAt;
        if (date5 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = date5.hashCode();
        }
        int i6 = (f2 + hashCode10) * 31;
        Date date6 = this.truncatedAt;
        if (date6 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = date6.hashCode();
        }
        int g3 = hdi.g((i6 + hashCode11) * 31, 31, this.disabled);
        Boolean bool2 = this.blocked;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return this.extraData.hashCode() + ((g3 + i) * 31);
    }

    public final boolean isInsideSearch() {
        return this.isInsideSearch;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.type;
        String str3 = this.name;
        String str4 = this.image;
        int i = this.watcherCount;
        boolean z = this.frozen;
        Date date = this.createdAt;
        Date date2 = this.deletedAt;
        Date date3 = this.updatedAt;
        SyncStatus syncStatus = this.syncStatus;
        int i2 = this.memberCount;
        List<Message> list = this.messages;
        List<Member> list2 = this.members;
        List<User> list3 = this.watchers;
        List<ChannelUserRead> list4 = this.read;
        Config config = this.config;
        User user = this.createdBy;
        int i3 = this.unreadCount;
        String str5 = this.team;
        Boolean bool = this.hidden;
        Date date4 = this.hiddenMessagesBefore;
        int i4 = this.cooldown;
        List<PendingMessage> list5 = this.pendingMessages;
        List<Message> list6 = this.pinnedMessages;
        Set<String> set = this.ownCapabilities;
        Member member = this.membership;
        List<Message> list7 = this.cachedLatestMessages;
        boolean z2 = this.isInsideSearch;
        DraftMessage draftMessage = this.draftMessage;
        List<Location> list8 = this.activeLiveLocations;
        Integer num = this.messageCount;
        PushPreference pushPreference = this.pushPreference;
        List<String> list9 = this.filterTags;
        Date date5 = this.lastMessageAt;
        Date date6 = this.truncatedAt;
        boolean z3 = this.disabled;
        Boolean bool2 = this.blocked;
        Map<String, Object> map = this.extraData;
        StringBuilder r = m51.r("Channel(id=", str, ", type=", str2, ", name=");
        k84.q(r, str3, ", image=", str4, ", watcherCount=");
        r.append(i);
        r.append(", frozen=");
        r.append(z);
        r.append(", createdAt=");
        sv6.B(r, date, ", deletedAt=", date2, ", updatedAt=");
        r.append(date3);
        r.append(", syncStatus=");
        r.append(syncStatus);
        r.append(", memberCount=");
        r.append(i2);
        r.append(", messages=");
        r.append(list);
        r.append(", members=");
        ace.D(r, list2, ", watchers=", list3, ", read=");
        r.append(list4);
        r.append(", config=");
        r.append(config);
        r.append(", createdBy=");
        r.append(user);
        r.append(", unreadCount=");
        r.append(i3);
        r.append(", team=");
        r.append(str5);
        r.append(", hidden=");
        r.append(bool);
        r.append(", hiddenMessagesBefore=");
        r.append(date4);
        r.append(", cooldown=");
        r.append(i4);
        r.append(", pendingMessages=");
        ace.D(r, list5, ", pinnedMessages=", list6, ", ownCapabilities=");
        r.append(set);
        r.append(", membership=");
        r.append(member);
        r.append(", cachedLatestMessages=");
        r.append(list7);
        r.append(", isInsideSearch=");
        r.append(z2);
        r.append(", draftMessage=");
        r.append(draftMessage);
        r.append(", activeLiveLocations=");
        r.append(list8);
        r.append(", messageCount=");
        r.append(num);
        r.append(", pushPreference=");
        r.append(pushPreference);
        r.append(", filterTags=");
        r.append(list9);
        r.append(", lastMessageAt=");
        r.append(date5);
        r.append(", truncatedAt=");
        r.append(date6);
        r.append(", disabled=");
        r.append(z3);
        r.append(", blocked=");
        r.append(bool2);
        r.append(", extraData=");
        r.append(map);
        r.append(")");
        return r.toString();
    }

    @hm6
    public static /* synthetic */ void getHasUnread$annotations() {
    }

    @hm6
    public static /* synthetic */ void getUnreadCount$annotations() {
    }

    public Channel(String str, String str2, String str3, String str4, int i, boolean z, Date date, Date date2, Date date3, SyncStatus syncStatus, int i2, List<Message> list, List<Member> list2, List<User> list3, List<ChannelUserRead> list4, Config config, User user, int i3, String str5, Boolean bool, Date date4, int i4, List<PendingMessage> list5, List<Message> list6, Set<String> set, Member member, List<Message> list7, boolean z2, DraftMessage draftMessage, List<Location> list8, Integer num, PushPreference pushPreference, List<String> list9, Date date5, Date date6, boolean z3, Boolean bool2, Map<String, ? extends Object> map) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        syncStatus.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        config.getClass();
        user.getClass();
        str5.getClass();
        list5.getClass();
        list6.getClass();
        set.getClass();
        list7.getClass();
        list8.getClass();
        list9.getClass();
        map.getClass();
        this.id = str;
        this.type = str2;
        this.name = str3;
        this.image = str4;
        this.watcherCount = i;
        this.frozen = z;
        this.createdAt = date;
        this.deletedAt = date2;
        this.updatedAt = date3;
        this.syncStatus = syncStatus;
        this.memberCount = i2;
        this.messages = list;
        this.members = list2;
        this.watchers = list3;
        this.read = list4;
        this.config = config;
        this.createdBy = user;
        this.unreadCount = i3;
        this.team = str5;
        this.hidden = bool;
        this.hiddenMessagesBefore = date4;
        this.cooldown = i4;
        this.pendingMessages = list5;
        this.pinnedMessages = list6;
        this.ownCapabilities = set;
        this.membership = member;
        this.cachedLatestMessages = list7;
        this.isInsideSearch = z2;
        this.draftMessage = draftMessage;
        this.activeLiveLocations = list8;
        this.messageCount = num;
        this.pushPreference = pushPreference;
        this.filterTags = list9;
        this.lastMessageAt = date5;
        this.truncatedAt = date6;
        this.disabled = z3;
        this.blocked = bool2;
        this.extraData = map;
    }

    public Channel() {
        this(null, null, null, null, 0, false, null, null, null, null, 0, null, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, -1, 63, null);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b*\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u000e\u0010>\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010?\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010@\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010A\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010B\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010C\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010D\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010E\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u0010\u0010F\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011J\u000e\u0010G\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010H\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\rJ\u0014\u0010I\u001a\u00020\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u0014\u0010J\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018J\u0014\u0010K\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018J\u0014\u0010L\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0018J\u000e\u0010M\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!J\u000e\u0010N\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u001dJ\u000e\u0010O\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\rJ\u000e\u0010P\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\bJ\u0015\u0010Q\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010RJ\u0010\u0010S\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010\u0011J\u000e\u0010T\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\rJ\u0014\u0010U\u001a\u00020\u00002\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u0014\u0010V\u001a\u00020\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0+J\u0010\u0010W\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010\u001bJ\u0014\u0010X\u001a\u00020\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u000e\u0010Y\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u000fJ\u0010\u0010Z\u001a\u00020\u00002\b\u0010[\u001a\u0004\u0018\u000100J\u0014\u0010\\\u001a\u00020\u00002\f\u00101\u001a\b\u0012\u0004\u0012\u0002020\u0018J\u0015\u0010]\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010^J\u0010\u0010_\u001a\u00020\u00002\b\u00105\u001a\u0004\u0018\u000106J\u0014\u0010`\u001a\u00020\u00002\f\u00107\u001a\b\u0012\u0004\u0012\u00020\b0\u0018J\u0010\u0010a\u001a\u00020\u00002\b\u00108\u001a\u0004\u0018\u00010\u0011J\u0010\u0010b\u001a\u00020\u00002\b\u00109\u001a\u0004\u0018\u00010\u0011J\u000e\u0010c\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u000fJ\u0015\u0010d\u001a\u00020\u00002\b\u0010;\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010RJ\u001a\u0010e\u001a\u00020\u00002\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010=J\u0006\u0010f\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010%\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010&R\u0010\u0010'\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\b\u0012\u0004\u0012\u0002020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u00103\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u00104R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020\b0\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010;\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010&R\u001a\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006g"}, d2 = {"Lio/getstream/chat/android/models/Channel$Builder;", "", "<init>", "()V", AppsFlyerProperties.CHANNEL, "Lio/getstream/chat/android/models/Channel;", "(Lio/getstream/chat/android/models/Channel;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "type", Keys.KEY_NAME, "image", "watcherCount", "", "frozen", "", "createdAt", "Ljava/util/Date;", "deletedAt", "updatedAt", "syncStatus", "Lio/getstream/chat/android/models/SyncStatus;", "memberCount", "messages", "", "Lio/getstream/chat/android/models/Message;", "members", "Lio/getstream/chat/android/models/Member;", "watchers", "Lio/getstream/chat/android/models/User;", "read", "Lio/getstream/chat/android/models/ChannelUserRead;", "config", "Lio/getstream/chat/android/models/Config;", "createdBy", "unreadCount", "team", "hidden", "Ljava/lang/Boolean;", "hiddenMessagesBefore", "cooldown", "pinnedMessages", "ownCapabilities", "", "membership", "cachedLatestMessages", "isInsideSearch", "draft", "Lio/getstream/chat/android/models/DraftMessage;", "activeLiveLocations", "Lio/getstream/chat/android/models/Location;", "messageCount", "Ljava/lang/Integer;", "pushPreference", "Lio/getstream/chat/android/models/PushPreference;", "filterTags", "lastMessageAt", "truncatedAt", "disabled", "blocked", "extraData", "", "withId", "withType", "withName", "withImage", "withWatcherCount", "withFrozen", "withCreatedAt", "withDeletedAt", "withUpdatedAt", "withSyncStatus", "withMemberCount", "withMessages", "withMembers", "withWatchers", "withRead", "withConfig", "withCreatedBy", "withUnreadCount", "withTeam", "withHidden", "(Ljava/lang/Boolean;)Lio/getstream/chat/android/models/Channel$Builder;", "withHiddenMessagesBefore", "withCooldown", "withPinnedMessages", "withOwnCapabilities", "withMembership", "withCachedLatestMessages", "withIsInsideSearch", "withDraftMessage", "draftMessage", "withActiveLiveLocations", "withMessageCount", "(Ljava/lang/Integer;)Lio/getstream/chat/android/models/Channel$Builder;", "withPushPreference", "withFilterTags", "withLastMessageAt", "withTruncatedAt", "withDisabled", "withBlocked", "withExtraData", "build", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Builder {
        private List<Location> activeLiveLocations;
        private Boolean blocked;
        private List<Message> cachedLatestMessages;
        private Config config;
        private int cooldown;
        private Date createdAt;
        private User createdBy;
        private Date deletedAt;
        private boolean disabled;
        private DraftMessage draft;
        private Map<String, ? extends Object> extraData;
        private List<String> filterTags;
        private boolean frozen;
        private Boolean hidden;
        private Date hiddenMessagesBefore;
        private String id;
        private String image;
        private boolean isInsideSearch;
        private Date lastMessageAt;
        private int memberCount;
        private List<Member> members;
        private Member membership;
        private Integer messageCount;
        private List<Message> messages;
        private String name;
        private Set<String> ownCapabilities;
        private List<Message> pinnedMessages;
        private PushPreference pushPreference;
        private List<ChannelUserRead> read;
        private SyncStatus syncStatus;
        private String team;
        private Date truncatedAt;
        private String type;
        private int unreadCount;
        private Date updatedAt;
        private int watcherCount;
        private List<User> watchers;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Channel channel) {
            this();
            channel.getClass();
            this.id = channel.getId();
            this.type = channel.getType();
            this.name = channel.getName();
            this.image = channel.getImage();
            this.watcherCount = channel.getWatcherCount();
            this.frozen = channel.getFrozen();
            this.createdAt = channel.getCreatedAt();
            this.deletedAt = channel.getDeletedAt();
            this.updatedAt = channel.getUpdatedAt();
            this.syncStatus = channel.getSyncStatus();
            this.memberCount = channel.getMemberCount();
            this.messages = channel.getMessages();
            this.members = channel.getMembers();
            this.watchers = channel.getWatchers();
            this.read = channel.getRead();
            this.config = channel.getConfig();
            this.createdBy = channel.getCreatedBy();
            this.unreadCount = channel.getUnreadCount();
            this.team = channel.getTeam();
            this.hidden = channel.getHidden();
            this.hiddenMessagesBefore = channel.getHiddenMessagesBefore();
            this.cooldown = channel.getCooldown();
            this.pinnedMessages = channel.getPinnedMessages();
            this.ownCapabilities = channel.getOwnCapabilities();
            this.membership = channel.getMembership();
            this.cachedLatestMessages = channel.getCachedLatestMessages();
            this.isInsideSearch = channel.isInsideSearch();
            this.draft = channel.getDraftMessage();
            this.activeLiveLocations = channel.getActiveLiveLocations();
            this.messageCount = channel.getMessageCount();
            this.pushPreference = channel.getPushPreference();
            this.filterTags = channel.getFilterTags();
            this.lastMessageAt = channel.getLastMessageAt();
            this.truncatedAt = channel.getTruncatedAt();
            this.disabled = channel.getDisabled();
            this.blocked = channel.getBlocked();
            this.extraData = channel.getExtraData();
        }

        public final Channel build() {
            return new Channel(this.id, this.type, this.name, this.image, this.watcherCount, this.frozen, this.createdAt, this.deletedAt, this.updatedAt, this.syncStatus, this.memberCount, this.messages, this.members, this.watchers, this.read, this.config, this.createdBy, this.unreadCount, this.team, this.hidden, this.hiddenMessagesBefore, this.cooldown, null, this.pinnedMessages, this.ownCapabilities, this.membership, this.cachedLatestMessages, this.isInsideSearch, this.draft, this.activeLiveLocations, this.messageCount, this.pushPreference, this.filterTags, this.lastMessageAt, this.truncatedAt, this.disabled, this.blocked, this.extraData, 4194304, 0, null);
        }

        public final Builder withActiveLiveLocations(List<Location> activeLiveLocations) {
            activeLiveLocations.getClass();
            this.activeLiveLocations = activeLiveLocations;
            return this;
        }

        public final Builder withBlocked(Boolean blocked) {
            this.blocked = blocked;
            return this;
        }

        public final Builder withCachedLatestMessages(List<Message> cachedLatestMessages) {
            cachedLatestMessages.getClass();
            this.cachedLatestMessages = cachedLatestMessages;
            return this;
        }

        public final Builder withConfig(Config config) {
            config.getClass();
            this.config = config;
            return this;
        }

        public final Builder withCooldown(int cooldown) {
            this.cooldown = cooldown;
            return this;
        }

        public final Builder withCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public final Builder withCreatedBy(User createdBy) {
            createdBy.getClass();
            this.createdBy = createdBy;
            return this;
        }

        public final Builder withDeletedAt(Date deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }

        public final Builder withDisabled(boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        public final Builder withDraftMessage(DraftMessage draftMessage) {
            this.draft = draftMessage;
            return this;
        }

        public final Builder withExtraData(Map<String, ? extends Object> extraData) {
            extraData.getClass();
            this.extraData = extraData;
            return this;
        }

        public final Builder withFilterTags(List<String> filterTags) {
            filterTags.getClass();
            this.filterTags = filterTags;
            return this;
        }

        public final Builder withFrozen(boolean frozen) {
            this.frozen = frozen;
            return this;
        }

        public final Builder withHidden(Boolean hidden) {
            this.hidden = hidden;
            return this;
        }

        public final Builder withHiddenMessagesBefore(Date hiddenMessagesBefore) {
            this.hiddenMessagesBefore = hiddenMessagesBefore;
            return this;
        }

        public final Builder withId(String id) {
            id.getClass();
            this.id = id;
            return this;
        }

        public final Builder withImage(String image) {
            image.getClass();
            this.image = image;
            return this;
        }

        public final Builder withIsInsideSearch(boolean isInsideSearch) {
            this.isInsideSearch = isInsideSearch;
            return this;
        }

        public final Builder withLastMessageAt(Date lastMessageAt) {
            this.lastMessageAt = lastMessageAt;
            return this;
        }

        public final Builder withMemberCount(int memberCount) {
            this.memberCount = memberCount;
            return this;
        }

        public final Builder withMembers(List<Member> members) {
            members.getClass();
            this.members = members;
            return this;
        }

        public final Builder withMembership(Member membership) {
            this.membership = membership;
            return this;
        }

        public final Builder withMessageCount(Integer messageCount) {
            this.messageCount = messageCount;
            return this;
        }

        public final Builder withMessages(List<Message> messages) {
            messages.getClass();
            this.messages = messages;
            return this;
        }

        public final Builder withName(String name) {
            name.getClass();
            this.name = name;
            return this;
        }

        public final Builder withOwnCapabilities(Set<String> ownCapabilities) {
            ownCapabilities.getClass();
            this.ownCapabilities = ownCapabilities;
            return this;
        }

        public final Builder withPinnedMessages(List<Message> pinnedMessages) {
            pinnedMessages.getClass();
            this.pinnedMessages = pinnedMessages;
            return this;
        }

        public final Builder withPushPreference(PushPreference pushPreference) {
            this.pushPreference = pushPreference;
            return this;
        }

        public final Builder withRead(List<ChannelUserRead> read) {
            read.getClass();
            this.read = read;
            return this;
        }

        public final Builder withSyncStatus(SyncStatus syncStatus) {
            syncStatus.getClass();
            this.syncStatus = syncStatus;
            return this;
        }

        public final Builder withTeam(String team) {
            team.getClass();
            this.team = team;
            return this;
        }

        public final Builder withTruncatedAt(Date truncatedAt) {
            this.truncatedAt = truncatedAt;
            return this;
        }

        public final Builder withType(String type) {
            type.getClass();
            this.type = type;
            return this;
        }

        public final Builder withUnreadCount(int unreadCount) {
            this.unreadCount = unreadCount;
            return this;
        }

        public final Builder withUpdatedAt(Date updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public final Builder withWatcherCount(int watcherCount) {
            this.watcherCount = watcherCount;
            return this;
        }

        public final Builder withWatchers(List<User> watchers) {
            watchers.getClass();
            this.watchers = watchers;
            return this;
        }

        public Builder() {
            this.id = "";
            this.type = "";
            this.name = "";
            this.image = "";
            this.syncStatus = SyncStatus.COMPLETED;
            this.messages = CollectionsKt.emptyList();
            this.members = CollectionsKt.emptyList();
            this.watchers = CollectionsKt.emptyList();
            this.read = CollectionsKt.emptyList();
            this.config = new Config(null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, 0, null, null, null, null, false, false, false, null, 134217727, null);
            this.createdBy = new User(null, null, null, null, null, null, null, null, null, false, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, 33554431, null);
            this.team = "";
            this.pinnedMessages = CollectionsKt.emptyList();
            this.ownCapabilities = fd7.a;
            this.cachedLatestMessages = CollectionsKt.emptyList();
            this.activeLiveLocations = CollectionsKt.emptyList();
            this.filterTags = CollectionsKt.emptyList();
            zc7 zc7Var = zc7.a;
            zc7Var.getClass();
            this.extraData = zc7Var;
        }
    }
}
