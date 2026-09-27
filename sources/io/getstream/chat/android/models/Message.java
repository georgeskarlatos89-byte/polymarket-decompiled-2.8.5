package io.getstream.chat.android.models;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.hdi;
import defpackage.hm6;
import defpackage.ix2;
import defpackage.sv6;
import defpackage.woa;
import defpackage.zc7;
import io.getstream.chat.android.models.querysort.ComparableFieldProvider;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bM\n\u0002\u0010\u000f\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b<\b\u0087\b\u0018\u0000 â\u00012\u00020\u00012\u00020\u0002:\u0004â\u0001ã\u0001Bµ\u0005\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0014\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0014\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010$\u001a\u00020\u000f\u0012\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020&0\u0014\u0012\b\b\u0002\u0010'\u001a\u00020(\u0012\b\b\u0002\u0010)\u001a\u00020(\u0012\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0014\u0012\b\b\u0002\u0010+\u001a\u00020(\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0000\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u00100\u001a\u00020(\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b\u0012\b\b\u0002\u00105\u001a\u00020(\u0012\b\b\u0002\u00106\u001a\u00020(\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=\u0012\u000e\b\u0002\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010E\u0012\b\b\u0002\u0010F\u001a\u00020(\u0012\b\b\u0002\u0010G\u001a\u00020(\u0012\b\b\u0002\u0010H\u001a\u00020(\u0012\u000e\b\u0002\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\u000b\u0012\u000e\b\u0002\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\bL\u0010MJ\u0019\u0010\u0097\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010\u0098\u00012\u0007\u0010\u0099\u0001\u001a\u00020\u0004H\u0016J\u0010\u0010\u009a\u0001\u001a\u00020\u00042\u0007\u0010\u009b\u0001\u001a\u00020\u0004JD\u0010\u009e\u0001\u001a\u0003H\u009f\u0001\"\u0005\b\u0000\u0010 \u0001\"\u0005\b\u0001\u0010\u009f\u0001*\u0010\u0012\u0005\u0012\u0003H \u0001\u0012\u0005\u0012\u0003H\u009f\u00010\u00142\b\u0010¡\u0001\u001a\u0003H \u00012\b\u0010¢\u0001\u001a\u0003H\u009f\u0001H\u0002¢\u0006\u0003\u0010£\u0001J\b\u0010¤\u0001\u001a\u00030¥\u0001J\t\u0010¦\u0001\u001a\u00020\u0004H\u0016J\n\u0010§\u0001\u001a\u00030¨\u0001H\u0007J\n\u0010©\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ª\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010«\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010¬\u0001\u001a\u00020\u0004HÆ\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010¯\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u0010\u0010°\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bHÆ\u0003J\u0010\u0010±\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bHÆ\u0003J\n\u0010²\u0001\u001a\u00020\u0011HÆ\u0003J\n\u0010³\u0001\u001a\u00020\u0011HÆ\u0003J\u0016\u0010´\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0014HÆ\u0003J\u0016\u0010µ\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0014HÆ\u0003J\u0016\u0010¶\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u0014HÆ\u0003J\n\u0010·\u0001\u001a\u00020\u0019HÆ\u0003J\n\u0010¸\u0001\u001a\u00020\u0004HÆ\u0003J\u0010\u0010¹\u0001\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000bHÆ\u0003J\u0010\u0010º\u0001\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000bHÆ\u0003J\f\u0010»\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\f\u0010¼\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\f\u0010½\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\f\u0010¾\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\f\u0010¿\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\n\u0010À\u0001\u001a\u00020\u000fHÆ\u0003J\u0016\u0010Á\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020&0\u0014HÆ\u0003J\n\u0010Â\u0001\u001a\u00020(HÆ\u0003J\n\u0010Ã\u0001\u001a\u00020(HÆ\u0003J\u0016\u0010Ä\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0014HÆ\u0003J\n\u0010Å\u0001\u001a\u00020(HÆ\u0003J\f\u0010Æ\u0001\u001a\u0004\u0018\u00010-HÆ\u0003J\f\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0000HÆ\u0003J\f\u0010È\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\n\u0010É\u0001\u001a\u00020(HÆ\u0003J\f\u0010Ê\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\f\u0010Ë\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\f\u0010Ì\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010Í\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bHÆ\u0003J\n\u0010Î\u0001\u001a\u00020(HÆ\u0003J\n\u0010Ï\u0001\u001a\u00020(HÆ\u0003J\f\u0010Ð\u0001\u001a\u0004\u0018\u000108HÆ\u0003J\f\u0010Ñ\u0001\u001a\u0004\u0018\u00010:HÆ\u0003J\f\u0010Ò\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\f\u0010Ó\u0001\u001a\u0004\u0018\u00010=HÆ\u0003J\u0010\u0010Ô\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bHÆ\u0003J\f\u0010Õ\u0001\u001a\u0004\u0018\u00010@HÆ\u0003J\f\u0010Ö\u0001\u001a\u0004\u0018\u00010BHÆ\u0003J\f\u0010×\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010Ø\u0001\u001a\u0004\u0018\u00010EHÆ\u0003J\n\u0010Ù\u0001\u001a\u00020(HÆ\u0003J\n\u0010Ú\u0001\u001a\u00020(HÆ\u0003J\n\u0010Û\u0001\u001a\u00020(HÆ\u0003J\u0010\u0010Ü\u0001\u001a\b\u0012\u0004\u0012\u00020J0\u000bHÆ\u0003J\u0010\u0010Ý\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bHÆ\u0003J¸\u0005\u0010Þ\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00142\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00142\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00042\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010$\u001a\u00020\u000f2\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020&0\u00142\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020(2\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00142\b\b\u0002\u0010+\u001a\u00020(2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u00100\u001a\u00020(2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\b\b\u0002\u00105\u001a\u00020(2\b\b\u0002\u00106\u001a\u00020(2\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=2\u000e\b\u0002\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010D\u001a\u0004\u0018\u00010E2\b\b\u0002\u0010F\u001a\u00020(2\b\b\u0002\u0010G\u001a\u00020(2\b\b\u0002\u0010H\u001a\u00020(2\u000e\b\u0002\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\u000b2\u000e\b\u0002\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bHÆ\u0001J\u0015\u0010ß\u0001\u001a\u00020(2\t\u0010à\u0001\u001a\u0004\u0018\u00010&HÖ\u0003J\n\u0010á\u0001\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010OR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010OR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010OR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010OR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010OR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\b\n\u0000\u001a\u0004\bW\u0010VR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b¢\u0006\b\n\u0000\u001a\u0004\bX\u0010VR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b[\u0010ZR\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0014¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0014¢\u0006\b\n\u0000\u001a\u0004\b^\u0010]R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u0014¢\u0006\b\n\u0000\u001a\u0004\b_\u0010]R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b`\u0010aR\u0011\u0010\u001a\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010OR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b¢\u0006\b\n\u0000\u001a\u0004\bc\u0010VR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b¢\u0006\b\n\u0000\u001a\u0004\bd\u0010VR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0013\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bg\u0010fR\u0013\u0010!\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bh\u0010fR\u0013\u0010\"\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bi\u0010fR\u001c\u0010#\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010f\"\u0004\bk\u0010lR\u0011\u0010$\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\bm\u0010nR \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020&0\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010]R\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u0011\u0010)\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\br\u0010qR\u001d\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0014¢\u0006\b\n\u0000\u001a\u0004\bs\u0010]R\u0011\u0010+\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bt\u0010qR\u0013\u0010,\u001a\u0004\u0018\u00010-¢\u0006\b\n\u0000\u001a\u0004\bu\u0010vR\u0013\u0010.\u001a\u0004\u0018\u00010\u0000¢\u0006\b\n\u0000\u001a\u0004\bw\u0010xR\u0013\u0010/\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010OR\u0011\u00100\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bz\u0010qR\u0013\u00101\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b{\u0010fR\u0013\u00102\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b|\u0010fR\u0013\u00103\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b}\u0010nR\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b~\u0010VR\u0011\u00105\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010qR\u0012\u00106\u001a\u00020(¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010qR\u0015\u00107\u001a\u0004\u0018\u000108¢\u0006\n\n\u0000\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0015\u00109\u001a\u0004\u0018\u00010:¢\u0006\n\n\u0000\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0014\u0010;\u001a\u0004\u0018\u00010\u001f¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010fR\u0015\u0010<\u001a\u0004\u0018\u00010=¢\u0006\n\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010VR\u0015\u0010?\u001a\u0004\u0018\u00010@¢\u0006\n\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0015\u0010A\u001a\u0004\u0018\u00010B¢\u0006\n\n\u0000\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R!\u0010C\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0005\b\u008f\u0001\u0010OR\u0015\u0010D\u001a\u0004\u0018\u00010E¢\u0006\n\n\u0000\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0012\u0010F\u001a\u00020(¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010qR\u0012\u0010G\u001a\u00020(¢\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010qR\u0012\u0010H\u001a\u00020(¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010qR\u0018\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\u000b¢\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010VR\u0018\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010VR\u0013\u0010\u009c\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010O¨\u0006ä\u0001"}, d2 = {"Lio/getstream/chat/android/models/Message;", "Lio/getstream/chat/android/models/CustomObject;", "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "cid", "text", "html", "parentId", "command", "attachments", "", "Lio/getstream/chat/android/models/Attachment;", "mentionedUsersIds", "mentionedUsers", "Lio/getstream/chat/android/models/User;", "replyCount", "", "deletedReplyCount", "reactionCounts", "", "reactionScores", "reactionGroups", "Lio/getstream/chat/android/models/ReactionGroup;", "syncStatus", "Lio/getstream/chat/android/models/SyncStatus;", "type", "latestReactions", "Lio/getstream/chat/android/models/Reaction;", "ownReactions", "createdAt", "Ljava/util/Date;", "updatedAt", "deletedAt", "updatedLocallyAt", "createdLocallyAt", "user", "extraData", "", "silent", "", "shadowed", "i18n", "showInChannel", "channelInfo", "Lio/getstream/chat/android/models/ChannelInfo;", "replyTo", "replyMessageId", "pinned", "pinnedAt", "pinExpires", "pinnedBy", "threadParticipants", "skipPushNotification", "skipEnrichUrl", "moderationDetails", "Lio/getstream/chat/android/models/MessageModerationDetails;", "moderation", "Lio/getstream/chat/android/models/Moderation;", "messageTextUpdatedAt", "poll", "Lio/getstream/chat/android/models/Poll;", "restrictedVisibility", "reminder", "Lio/getstream/chat/android/models/MessageReminderInfo;", "sharedLocation", "Lio/getstream/chat/android/models/Location;", "channelRole", "member", "Lio/getstream/chat/android/models/MemberInfo;", "deletedForMe", "mentionedHere", "mentionedChannel", "mentionedGroups", "Lio/getstream/chat/android/models/UserGroup;", "mentionedRoles", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;Lio/getstream/chat/android/models/MemberInfo;ZZZLjava/util/List;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getCid", "getText", "getHtml", "getParentId", "getCommand", "getAttachments", "()Ljava/util/List;", "getMentionedUsersIds", "getMentionedUsers", "getReplyCount", "()I", "getDeletedReplyCount", "getReactionCounts", "()Ljava/util/Map;", "getReactionScores", "getReactionGroups", "getSyncStatus", "()Lio/getstream/chat/android/models/SyncStatus;", "getType", "getLatestReactions", "getOwnReactions", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "getDeletedAt", "getUpdatedLocallyAt", "getCreatedLocallyAt", "setCreatedLocallyAt", "(Ljava/util/Date;)V", "getUser", "()Lio/getstream/chat/android/models/User;", "getExtraData", "getSilent", "()Z", "getShadowed", "getI18n", "getShowInChannel", "getChannelInfo", "()Lio/getstream/chat/android/models/ChannelInfo;", "getReplyTo", "()Lio/getstream/chat/android/models/Message;", "getReplyMessageId", "getPinned", "getPinnedAt", "getPinExpires", "getPinnedBy", "getThreadParticipants", "getSkipPushNotification", "getSkipEnrichUrl", "getModerationDetails", "()Lio/getstream/chat/android/models/MessageModerationDetails;", "getModeration", "()Lio/getstream/chat/android/models/Moderation;", "getMessageTextUpdatedAt", "getPoll", "()Lio/getstream/chat/android/models/Poll;", "getRestrictedVisibility", "getReminder", "()Lio/getstream/chat/android/models/MessageReminderInfo;", "getSharedLocation", "()Lio/getstream/chat/android/models/Location;", "getChannelRole$annotations", "()V", "getChannelRole", "getMember", "()Lio/getstream/chat/android/models/MemberInfo;", "getDeletedForMe", "getMentionedHere", "getMentionedChannel", "getMentionedGroups", "getMentionedRoles", "getComparableField", "", "fieldName", "getTranslation", Keys.KEY_LANGUAGE, "originalLanguage", "getOriginalLanguage", "get", "B", "A", "key", "default", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "identifierHash", "", "toString", "newBuilder", "Lio/getstream/chat/android/models/Message$Builder;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "copy", "equals", "other", "hashCode", "Companion", "Builder", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Message implements CustomObject, ComparableFieldProvider {
    public static final String TYPE_EPHEMERAL = "ephemeral";
    public static final String TYPE_ERROR = "error";
    public static final String TYPE_REGULAR = "regular";
    private final List<Attachment> attachments;
    private final ChannelInfo channelInfo;
    private final String channelRole;
    private final String cid;
    private final String command;
    private final Date createdAt;
    private Date createdLocallyAt;
    private final Date deletedAt;
    private final boolean deletedForMe;
    private final int deletedReplyCount;
    private final Map<String, Object> extraData;
    private final String html;
    private final Map<String, String> i18n;
    private final String id;
    private final List<Reaction> latestReactions;
    private final MemberInfo member;
    private final boolean mentionedChannel;
    private final List<UserGroup> mentionedGroups;
    private final boolean mentionedHere;
    private final List<String> mentionedRoles;
    private final List<User> mentionedUsers;
    private final List<String> mentionedUsersIds;
    private final Date messageTextUpdatedAt;
    private final Moderation moderation;
    private final MessageModerationDetails moderationDetails;
    private final List<Reaction> ownReactions;
    private final String parentId;
    private final Date pinExpires;
    private final boolean pinned;
    private final Date pinnedAt;
    private final User pinnedBy;
    private final Poll poll;
    private final Map<String, Integer> reactionCounts;
    private final Map<String, ReactionGroup> reactionGroups;
    private final Map<String, Integer> reactionScores;
    private final MessageReminderInfo reminder;
    private final int replyCount;
    private final String replyMessageId;
    private final Message replyTo;
    private final List<String> restrictedVisibility;
    private final boolean shadowed;
    private final Location sharedLocation;
    private final boolean showInChannel;
    private final boolean silent;
    private final boolean skipEnrichUrl;
    private final boolean skipPushNotification;
    private final SyncStatus syncStatus;
    private final String text;
    private final List<User> threadParticipants;
    private final String type;
    private final Date updatedAt;
    private final Date updatedLocallyAt;
    private final User user;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Message(String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, int i, int i2, Map map, Map map2, Map map3, SyncStatus syncStatus, String str7, List list4, List list5, Date date, Date date2, Date date3, Date date4, Date date5, User user, Map map4, boolean z, boolean z2, Map map5, boolean z3, ChannelInfo channelInfo, Message message, String str8, boolean z4, Date date6, Date date7, User user2, List list6, boolean z5, boolean z6, MessageModerationDetails messageModerationDetails, Moderation moderation, Date date8, Poll poll, List list7, MessageReminderInfo messageReminderInfo, Location location, String str9, MemberInfo memberInfo, boolean z7, boolean z8, boolean z9, List list8, List list9, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(r114, r4, r5, r6, r7, r9, r10, r11, r12, r13, r15, r8, r14, r61, r2, r3, r18, r20, r22, r24, r26, r27, r28, r30, r29, r31, r32, r33, (i3 & 268435456) != 0 ? false : z3, (i3 & 536870912) != 0 ? null : channelInfo, (i3 & 1073741824) != 0 ? null : message, (i3 & Integer.MIN_VALUE) != 0 ? null : str8, (i4 & 1) != 0 ? false : z4, (i4 & 2) != 0 ? null : date6, (i4 & 4) != 0 ? null : date7, (i4 & 8) != 0 ? null : user2, (i4 & 16) != 0 ? CollectionsKt.emptyList() : list6, (i4 & 32) != 0 ? false : z5, (i4 & 64) != 0 ? false : z6, (i4 & 128) != 0 ? null : messageModerationDetails, (i4 & 256) != 0 ? null : moderation, (i4 & Barcode.FORMAT_UPC_A) != 0 ? null : date8, (i4 & Barcode.FORMAT_UPC_E) != 0 ? null : poll, (i4 & 2048) != 0 ? CollectionsKt.emptyList() : list7, (i4 & 4096) != 0 ? null : messageReminderInfo, (i4 & 8192) != 0 ? null : location, (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str9, (i4 & 32768) != 0 ? null : memberInfo, (i4 & 65536) != 0 ? false : z7, (i4 & 131072) != 0 ? false : z8, (i4 & 262144) != 0 ? false : z9, (i4 & 524288) != 0 ? CollectionsKt.emptyList() : list8, (i4 & 1048576) != 0 ? CollectionsKt.emptyList() : list9);
        Map map6;
        Map map7;
        Map map8;
        Map map9;
        Map map10;
        String str10 = (i3 & 1) != 0 ? "" : str;
        String str11 = (i3 & 2) != 0 ? "" : str2;
        String str12 = (i3 & 4) != 0 ? "" : str3;
        String str13 = (i3 & 8) != 0 ? "" : str4;
        String str14 = (i3 & 16) != 0 ? null : str5;
        String str15 = (i3 & 32) != 0 ? null : str6;
        List emptyList = (i3 & 64) != 0 ? CollectionsKt.emptyList() : list;
        List emptyList2 = (i3 & 128) != 0 ? CollectionsKt.emptyList() : list2;
        List emptyList3 = (i3 & 256) != 0 ? CollectionsKt.emptyList() : list3;
        int i5 = (i3 & Barcode.FORMAT_UPC_A) != 0 ? 0 : i;
        int i6 = (i3 & Barcode.FORMAT_UPC_E) != 0 ? 0 : i2;
        if ((i3 & 2048) != 0) {
            map6 = zc7.a;
            map6.getClass();
        } else {
            map6 = map;
        }
        if ((i3 & 4096) != 0) {
            map7 = zc7.a;
            map7.getClass();
        } else {
            map7 = map2;
        }
        String str16 = str10;
        if ((i3 & 8192) != 0) {
            map8 = zc7.a;
            map8.getClass();
        } else {
            map8 = map3;
        }
        Map map11 = map8;
        SyncStatus syncStatus2 = (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? SyncStatus.COMPLETED : syncStatus;
        String str17 = (i3 & 32768) == 0 ? str7 : "";
        List emptyList4 = (i3 & 65536) != 0 ? CollectionsKt.emptyList() : list4;
        List emptyList5 = (i3 & 131072) != 0 ? CollectionsKt.emptyList() : list5;
        Date date9 = (i3 & 262144) != 0 ? null : date;
        Date date10 = (i3 & 524288) != 0 ? null : date2;
        Date date11 = (i3 & 1048576) != 0 ? null : date3;
        Date date12 = (i3 & 2097152) != 0 ? null : date4;
        Date date13 = (i3 & 4194304) != 0 ? null : date5;
        User user3 = (i3 & 8388608) != 0 ? new User(null, null, null, null, null, null, null, null, null, false, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, 33554431, null) : user;
        if ((i3 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0) {
            map9 = zc7.a;
            map9.getClass();
        } else {
            map9 = map4;
        }
        boolean z10 = (i3 & 33554432) != 0 ? false : z;
        boolean z11 = (i3 & 67108864) != 0 ? false : z2;
        if ((i3 & 134217728) != 0) {
            map10 = zc7.a;
            map10.getClass();
        } else {
            map10 = map5;
        }
    }

    public static /* synthetic */ Message copy$default(Message message, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, int i, int i2, Map map, Map map2, Map map3, SyncStatus syncStatus, String str7, List list4, List list5, Date date, Date date2, Date date3, Date date4, Date date5, User user, Map map4, boolean z, boolean z2, Map map5, boolean z3, ChannelInfo channelInfo, Message message2, String str8, boolean z4, Date date6, Date date7, User user2, List list6, boolean z5, boolean z6, MessageModerationDetails messageModerationDetails, Moderation moderation, Date date8, Poll poll, List list7, MessageReminderInfo messageReminderInfo, Location location, String str9, MemberInfo memberInfo, boolean z7, boolean z8, boolean z9, List list8, List list9, int i3, int i4, Object obj) {
        return message.copy((i3 & 1) != 0 ? message.id : str, (i3 & 2) != 0 ? message.cid : str2, (i3 & 4) != 0 ? message.text : str3, (i3 & 8) != 0 ? message.html : str4, (i3 & 16) != 0 ? message.parentId : str5, (i3 & 32) != 0 ? message.command : str6, (i3 & 64) != 0 ? message.attachments : list, (i3 & 128) != 0 ? message.mentionedUsersIds : list2, (i3 & 256) != 0 ? message.mentionedUsers : list3, (i3 & Barcode.FORMAT_UPC_A) != 0 ? message.replyCount : i, (i3 & Barcode.FORMAT_UPC_E) != 0 ? message.deletedReplyCount : i2, (i3 & 2048) != 0 ? message.reactionCounts : map, (i3 & 4096) != 0 ? message.reactionScores : map2, (i3 & 8192) != 0 ? message.reactionGroups : map3, (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? message.syncStatus : syncStatus, (i3 & 32768) != 0 ? message.type : str7, (i3 & 65536) != 0 ? message.latestReactions : list4, (i3 & 131072) != 0 ? message.ownReactions : list5, (i3 & 262144) != 0 ? message.createdAt : date, (i3 & 524288) != 0 ? message.updatedAt : date2, (i3 & 1048576) != 0 ? message.deletedAt : date3, (i3 & 2097152) != 0 ? message.updatedLocallyAt : date4, (i3 & 4194304) != 0 ? message.createdLocallyAt : date5, (i3 & 8388608) != 0 ? message.user : user, (i3 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? message.extraData : map4, (i3 & 33554432) != 0 ? message.silent : z, (i3 & 67108864) != 0 ? message.shadowed : z2, (i3 & 134217728) != 0 ? message.i18n : map5, (i3 & 268435456) != 0 ? message.showInChannel : z3, (i3 & 536870912) != 0 ? message.channelInfo : channelInfo, (i3 & 1073741824) != 0 ? message.replyTo : message2, (i3 & Integer.MIN_VALUE) != 0 ? message.replyMessageId : str8, (i4 & 1) != 0 ? message.pinned : z4, (i4 & 2) != 0 ? message.pinnedAt : date6, (i4 & 4) != 0 ? message.pinExpires : date7, (i4 & 8) != 0 ? message.pinnedBy : user2, (i4 & 16) != 0 ? message.threadParticipants : list6, (i4 & 32) != 0 ? message.skipPushNotification : z5, (i4 & 64) != 0 ? message.skipEnrichUrl : z6, (i4 & 128) != 0 ? message.moderationDetails : messageModerationDetails, (i4 & 256) != 0 ? message.moderation : moderation, (i4 & Barcode.FORMAT_UPC_A) != 0 ? message.messageTextUpdatedAt : date8, (i4 & Barcode.FORMAT_UPC_E) != 0 ? message.poll : poll, (i4 & 2048) != 0 ? message.restrictedVisibility : list7, (i4 & 4096) != 0 ? message.reminder : messageReminderInfo, (i4 & 8192) != 0 ? message.sharedLocation : location, (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? message.channelRole : str9, (i4 & 32768) != 0 ? message.member : memberInfo, (i4 & 65536) != 0 ? message.deletedForMe : z7, (i4 & 131072) != 0 ? message.mentionedHere : z8, (i4 & 262144) != 0 ? message.mentionedChannel : z9, (i4 & 524288) != 0 ? message.mentionedGroups : list8, (i4 & 1048576) != 0 ? message.mentionedRoles : list9);
    }

    private final <A, B> B get(Map<A, ? extends B> map, A a, B b) {
        B b2 = map.get(a);
        if (b2 == null) {
            return b;
        }
        return b2;
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getReplyCount() {
        return this.replyCount;
    }

    /* renamed from: component11, reason: from getter */
    public final int getDeletedReplyCount() {
        return this.deletedReplyCount;
    }

    public final Map<String, Integer> component12() {
        return this.reactionCounts;
    }

    public final Map<String, Integer> component13() {
        return this.reactionScores;
    }

    public final Map<String, ReactionGroup> component14() {
        return this.reactionGroups;
    }

    /* renamed from: component15, reason: from getter */
    public final SyncStatus getSyncStatus() {
        return this.syncStatus;
    }

    /* renamed from: component16, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final List<Reaction> component17() {
        return this.latestReactions;
    }

    public final List<Reaction> component18() {
        return this.ownReactions;
    }

    /* renamed from: component19, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* renamed from: component20, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component21, reason: from getter */
    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    /* renamed from: component22, reason: from getter */
    public final Date getUpdatedLocallyAt() {
        return this.updatedLocallyAt;
    }

    /* renamed from: component23, reason: from getter */
    public final Date getCreatedLocallyAt() {
        return this.createdLocallyAt;
    }

    /* renamed from: component24, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    public final Map<String, Object> component25() {
        return this.extraData;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getSilent() {
        return this.silent;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getShadowed() {
        return this.shadowed;
    }

    public final Map<String, String> component28() {
        return this.i18n;
    }

    /* renamed from: component29, reason: from getter */
    public final boolean getShowInChannel() {
        return this.showInChannel;
    }

    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component30, reason: from getter */
    public final ChannelInfo getChannelInfo() {
        return this.channelInfo;
    }

    /* renamed from: component31, reason: from getter */
    public final Message getReplyTo() {
        return this.replyTo;
    }

    /* renamed from: component32, reason: from getter */
    public final String getReplyMessageId() {
        return this.replyMessageId;
    }

    /* renamed from: component33, reason: from getter */
    public final boolean getPinned() {
        return this.pinned;
    }

    /* renamed from: component34, reason: from getter */
    public final Date getPinnedAt() {
        return this.pinnedAt;
    }

    /* renamed from: component35, reason: from getter */
    public final Date getPinExpires() {
        return this.pinExpires;
    }

    /* renamed from: component36, reason: from getter */
    public final User getPinnedBy() {
        return this.pinnedBy;
    }

    public final List<User> component37() {
        return this.threadParticipants;
    }

    /* renamed from: component38, reason: from getter */
    public final boolean getSkipPushNotification() {
        return this.skipPushNotification;
    }

    /* renamed from: component39, reason: from getter */
    public final boolean getSkipEnrichUrl() {
        return this.skipEnrichUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getHtml() {
        return this.html;
    }

    /* renamed from: component40, reason: from getter */
    public final MessageModerationDetails getModerationDetails() {
        return this.moderationDetails;
    }

    /* renamed from: component41, reason: from getter */
    public final Moderation getModeration() {
        return this.moderation;
    }

    /* renamed from: component42, reason: from getter */
    public final Date getMessageTextUpdatedAt() {
        return this.messageTextUpdatedAt;
    }

    /* renamed from: component43, reason: from getter */
    public final Poll getPoll() {
        return this.poll;
    }

    public final List<String> component44() {
        return this.restrictedVisibility;
    }

    /* renamed from: component45, reason: from getter */
    public final MessageReminderInfo getReminder() {
        return this.reminder;
    }

    /* renamed from: component46, reason: from getter */
    public final Location getSharedLocation() {
        return this.sharedLocation;
    }

    /* renamed from: component47, reason: from getter */
    public final String getChannelRole() {
        return this.channelRole;
    }

    /* renamed from: component48, reason: from getter */
    public final MemberInfo getMember() {
        return this.member;
    }

    /* renamed from: component49, reason: from getter */
    public final boolean getDeletedForMe() {
        return this.deletedForMe;
    }

    /* renamed from: component5, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* renamed from: component50, reason: from getter */
    public final boolean getMentionedHere() {
        return this.mentionedHere;
    }

    /* renamed from: component51, reason: from getter */
    public final boolean getMentionedChannel() {
        return this.mentionedChannel;
    }

    public final List<UserGroup> component52() {
        return this.mentionedGroups;
    }

    public final List<String> component53() {
        return this.mentionedRoles;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCommand() {
        return this.command;
    }

    public final List<Attachment> component7() {
        return this.attachments;
    }

    public final List<String> component8() {
        return this.mentionedUsersIds;
    }

    public final List<User> component9() {
        return this.mentionedUsers;
    }

    public final Message copy(String id, String cid, String text, String html, String parentId, String command, List<Attachment> attachments, List<String> mentionedUsersIds, List<User> mentionedUsers, int replyCount, int deletedReplyCount, Map<String, Integer> reactionCounts, Map<String, Integer> reactionScores, Map<String, ReactionGroup> reactionGroups, SyncStatus syncStatus, String type, List<Reaction> latestReactions, List<Reaction> ownReactions, Date createdAt, Date updatedAt, Date deletedAt, Date updatedLocallyAt, Date createdLocallyAt, User user, Map<String, ? extends Object> extraData, boolean silent, boolean shadowed, Map<String, String> i18n, boolean showInChannel, ChannelInfo channelInfo, Message replyTo, String replyMessageId, boolean pinned, Date pinnedAt, Date pinExpires, User pinnedBy, List<User> threadParticipants, boolean skipPushNotification, boolean skipEnrichUrl, MessageModerationDetails moderationDetails, Moderation moderation, Date messageTextUpdatedAt, Poll poll, List<String> restrictedVisibility, MessageReminderInfo reminder, Location sharedLocation, String channelRole, MemberInfo member, boolean deletedForMe, boolean mentionedHere, boolean mentionedChannel, List<UserGroup> mentionedGroups, List<String> mentionedRoles) {
        id.getClass();
        cid.getClass();
        text.getClass();
        html.getClass();
        attachments.getClass();
        mentionedUsersIds.getClass();
        mentionedUsers.getClass();
        reactionCounts.getClass();
        reactionScores.getClass();
        reactionGroups.getClass();
        syncStatus.getClass();
        type.getClass();
        latestReactions.getClass();
        ownReactions.getClass();
        user.getClass();
        extraData.getClass();
        i18n.getClass();
        threadParticipants.getClass();
        restrictedVisibility.getClass();
        mentionedGroups.getClass();
        mentionedRoles.getClass();
        return new Message(id, cid, text, html, parentId, command, attachments, mentionedUsersIds, mentionedUsers, replyCount, deletedReplyCount, reactionCounts, reactionScores, reactionGroups, syncStatus, type, latestReactions, ownReactions, createdAt, updatedAt, deletedAt, updatedLocallyAt, createdLocallyAt, user, extraData, silent, shadowed, i18n, showInChannel, channelInfo, replyTo, replyMessageId, pinned, pinnedAt, pinExpires, pinnedBy, threadParticipants, skipPushNotification, skipEnrichUrl, moderationDetails, moderation, messageTextUpdatedAt, poll, restrictedVisibility, reminder, sharedLocation, channelRole, member, deletedForMe, mentionedHere, mentionedChannel, mentionedGroups, mentionedRoles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Message)) {
            return false;
        }
        Message message = (Message) other;
        if (Intrinsics.areEqual(this.id, message.id) && Intrinsics.areEqual(this.cid, message.cid) && Intrinsics.areEqual(this.text, message.text) && Intrinsics.areEqual(this.html, message.html) && Intrinsics.areEqual(this.parentId, message.parentId) && Intrinsics.areEqual(this.command, message.command) && Intrinsics.areEqual(this.attachments, message.attachments) && Intrinsics.areEqual(this.mentionedUsersIds, message.mentionedUsersIds) && Intrinsics.areEqual(this.mentionedUsers, message.mentionedUsers) && this.replyCount == message.replyCount && this.deletedReplyCount == message.deletedReplyCount && Intrinsics.areEqual(this.reactionCounts, message.reactionCounts) && Intrinsics.areEqual(this.reactionScores, message.reactionScores) && Intrinsics.areEqual(this.reactionGroups, message.reactionGroups) && this.syncStatus == message.syncStatus && Intrinsics.areEqual(this.type, message.type) && Intrinsics.areEqual(this.latestReactions, message.latestReactions) && Intrinsics.areEqual(this.ownReactions, message.ownReactions) && Intrinsics.areEqual(this.createdAt, message.createdAt) && Intrinsics.areEqual(this.updatedAt, message.updatedAt) && Intrinsics.areEqual(this.deletedAt, message.deletedAt) && Intrinsics.areEqual(this.updatedLocallyAt, message.updatedLocallyAt) && Intrinsics.areEqual(this.createdLocallyAt, message.createdLocallyAt) && Intrinsics.areEqual(this.user, message.user) && Intrinsics.areEqual(this.extraData, message.extraData) && this.silent == message.silent && this.shadowed == message.shadowed && Intrinsics.areEqual(this.i18n, message.i18n) && this.showInChannel == message.showInChannel && Intrinsics.areEqual(this.channelInfo, message.channelInfo) && Intrinsics.areEqual(this.replyTo, message.replyTo) && Intrinsics.areEqual(this.replyMessageId, message.replyMessageId) && this.pinned == message.pinned && Intrinsics.areEqual(this.pinnedAt, message.pinnedAt) && Intrinsics.areEqual(this.pinExpires, message.pinExpires) && Intrinsics.areEqual(this.pinnedBy, message.pinnedBy) && Intrinsics.areEqual(this.threadParticipants, message.threadParticipants) && this.skipPushNotification == message.skipPushNotification && this.skipEnrichUrl == message.skipEnrichUrl && Intrinsics.areEqual(this.moderationDetails, message.moderationDetails) && Intrinsics.areEqual(this.moderation, message.moderation) && Intrinsics.areEqual(this.messageTextUpdatedAt, message.messageTextUpdatedAt) && Intrinsics.areEqual(this.poll, message.poll) && Intrinsics.areEqual(this.restrictedVisibility, message.restrictedVisibility) && Intrinsics.areEqual(this.reminder, message.reminder) && Intrinsics.areEqual(this.sharedLocation, message.sharedLocation) && Intrinsics.areEqual(this.channelRole, message.channelRole) && Intrinsics.areEqual(this.member, message.member) && this.deletedForMe == message.deletedForMe && this.mentionedHere == message.mentionedHere && this.mentionedChannel == message.mentionedChannel && Intrinsics.areEqual(this.mentionedGroups, message.mentionedGroups) && Intrinsics.areEqual(this.mentionedRoles, message.mentionedRoles)) {
            return true;
        }
        return false;
    }

    public final List<Attachment> getAttachments() {
        return this.attachments;
    }

    public final ChannelInfo getChannelInfo() {
        return this.channelInfo;
    }

    public final String getChannelRole() {
        return this.channelRole;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getCommand() {
        return this.command;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00f1, code lost:
    
        return r1.deletedAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r2.equals("pinExpires") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        return r1.pinExpires;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r2.equals("created_at") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        return r1.createdAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        if (r2.equals("updated_locally_at") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x011a, code lost:
    
        return r1.updatedLocallyAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (r2.equals("pin_expires") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        if (r2.equals("parentId") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
    
        if (r2.equals("createdAt") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
    
        if (r2.equals("deletedReplyCount") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013a, code lost:
    
        return java.lang.Integer.valueOf(r1.deletedReplyCount);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        if (r2.equals("reply_count") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010e, code lost:
    
        return java.lang.Integer.valueOf(r1.replyCount);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r2.equals("parent_id") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cd, code lost:
    
        if (r2.equals("created_locally_at") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0166, code lost:
    
        return r1.createdLocallyAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d7, code lost:
    
        if (r2.equals("pinned_at") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fe, code lost:
    
        return r1.pinnedAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0057, code lost:
    
        return r1.parentId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e1, code lost:
    
        if (r2.equals("updated_at") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0182, code lost:
    
        return r1.updatedAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00eb, code lost:
    
        if (r2.equals("deletedAt") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f8, code lost:
    
        if (r2.equals("pinnedAt") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0105, code lost:
    
        if (r2.equals("replyCount") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0115, code lost:
    
        if (r2.equals("updatedLocallyAt") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0131, code lost:
    
        if (r2.equals("deleted_reply_count") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0161, code lost:
    
        if (r2.equals("createdLocallyAt") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x016d, code lost:
    
        if (r2.equals("updatedAt") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r2.equals("deleted_at") == false) goto L127;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017e A[RETURN] */
    @Override // io.getstream.chat.android.models.querysort.ComparableFieldProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Comparable<?> getComparableField(String fieldName) {
        Object obj;
        fieldName.getClass();
        switch (fieldName.hashCode()) {
            case -1949194674:
                break;
            case -1839923581:
                break;
            case -988146728:
                if (fieldName.equals("pinned")) {
                    return Boolean.valueOf(this.pinned);
                }
                obj = getExtraData().get(fieldName);
                if (!(obj instanceof Comparable)) {
                    return (Comparable) obj;
                }
                return null;
            case -902327211:
                if (fieldName.equals("silent")) {
                    return Boolean.valueOf(this.silent);
                }
                obj = getExtraData().get(fieldName);
                if (!(obj instanceof Comparable)) {
                }
                break;
            case -860839852:
                break;
            case -756367937:
                if (fieldName.equals("shadowed")) {
                    return Boolean.valueOf(this.shadowed);
                }
                obj = getExtraData().get(fieldName);
                if (!(obj instanceof Comparable)) {
                }
                break;
            case -654181872:
                break;
            case -575172539:
                break;
            case -421231061:
                break;
            case -358705620:
                break;
            case -295464393:
                break;
            case -173232646:
                break;
            case -39756463:
                break;
            case 3355:
                if (fieldName.equals(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID)) {
                    return this.id;
                }
                obj = getExtraData().get(fieldName);
                if (!(obj instanceof Comparable)) {
                }
                break;
            case 98494:
                if (fieldName.equals("cid")) {
                    return this.cid;
                }
                obj = getExtraData().get(fieldName);
                if (!(obj instanceof Comparable)) {
                }
                break;
            case 3213227:
                if (fieldName.equals("html")) {
                    return this.html;
                }
                obj = getExtraData().get(fieldName);
                if (!(obj instanceof Comparable)) {
                }
                break;
            case 3556653:
                if (fieldName.equals("text")) {
                    return this.text;
                }
                obj = getExtraData().get(fieldName);
                if (!(obj instanceof Comparable)) {
                }
                break;
            case 3575610:
                if (fieldName.equals("type")) {
                    return this.type;
                }
                obj = getExtraData().get(fieldName);
                if (!(obj instanceof Comparable)) {
                }
                break;
            case 139882362:
                break;
            case 541921598:
                break;
            case 598371643:
                break;
            case 950394699:
                if (fieldName.equals("command")) {
                    return this.command;
                }
                obj = getExtraData().get(fieldName);
                if (!(obj instanceof Comparable)) {
                }
                break;
            case 1175162725:
                break;
            case 1243323018:
                break;
            case 1291692446:
                break;
            case 1369680106:
                break;
            case 1747160031:
                break;
            case 1765056025:
                break;
            case 2070327504:
                break;
            default:
                obj = getExtraData().get(fieldName);
                if (!(obj instanceof Comparable)) {
                }
                break;
        }
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final Date getCreatedLocallyAt() {
        return this.createdLocallyAt;
    }

    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    public final boolean getDeletedForMe() {
        return this.deletedForMe;
    }

    public final int getDeletedReplyCount() {
        return this.deletedReplyCount;
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public Map<String, Object> getExtraData() {
        return this.extraData;
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public <T> T getExtraValue(String str, T t) {
        return (T) super.getExtraValue(str, t);
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

    public final List<Reaction> getLatestReactions() {
        return this.latestReactions;
    }

    public final MemberInfo getMember() {
        return this.member;
    }

    public final boolean getMentionedChannel() {
        return this.mentionedChannel;
    }

    public final List<UserGroup> getMentionedGroups() {
        return this.mentionedGroups;
    }

    public final boolean getMentionedHere() {
        return this.mentionedHere;
    }

    public final List<String> getMentionedRoles() {
        return this.mentionedRoles;
    }

    public final List<User> getMentionedUsers() {
        return this.mentionedUsers;
    }

    public final List<String> getMentionedUsersIds() {
        return this.mentionedUsersIds;
    }

    public final Date getMessageTextUpdatedAt() {
        return this.messageTextUpdatedAt;
    }

    public final Moderation getModeration() {
        return this.moderation;
    }

    public final MessageModerationDetails getModerationDetails() {
        return this.moderationDetails;
    }

    public final String getOriginalLanguage() {
        return (String) get(this.i18n, Keys.KEY_LANGUAGE, "");
    }

    public final List<Reaction> getOwnReactions() {
        return this.ownReactions;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final Date getPinExpires() {
        return this.pinExpires;
    }

    public final boolean getPinned() {
        return this.pinned;
    }

    public final Date getPinnedAt() {
        return this.pinnedAt;
    }

    public final User getPinnedBy() {
        return this.pinnedBy;
    }

    public final Poll getPoll() {
        return this.poll;
    }

    public final Map<String, Integer> getReactionCounts() {
        return this.reactionCounts;
    }

    public final Map<String, ReactionGroup> getReactionGroups() {
        return this.reactionGroups;
    }

    public final Map<String, Integer> getReactionScores() {
        return this.reactionScores;
    }

    public final MessageReminderInfo getReminder() {
        return this.reminder;
    }

    public final int getReplyCount() {
        return this.replyCount;
    }

    public final String getReplyMessageId() {
        return this.replyMessageId;
    }

    public final Message getReplyTo() {
        return this.replyTo;
    }

    public final List<String> getRestrictedVisibility() {
        return this.restrictedVisibility;
    }

    public final boolean getShadowed() {
        return this.shadowed;
    }

    public final Location getSharedLocation() {
        return this.sharedLocation;
    }

    public final boolean getShowInChannel() {
        return this.showInChannel;
    }

    public final boolean getSilent() {
        return this.silent;
    }

    public final boolean getSkipEnrichUrl() {
        return this.skipEnrichUrl;
    }

    public final boolean getSkipPushNotification() {
        return this.skipPushNotification;
    }

    public final SyncStatus getSyncStatus() {
        return this.syncStatus;
    }

    public final String getText() {
        return this.text;
    }

    public final List<User> getThreadParticipants() {
        return this.threadParticipants;
    }

    public final String getTranslation(String language) {
        language.getClass();
        return (String) get(this.i18n, sv6.m(language, "_text"), "");
    }

    public final String getType() {
        return this.type;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final Date getUpdatedLocallyAt() {
        return this.updatedLocallyAt;
    }

    public final User getUser() {
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
        int e = hdi.e(hdi.e(hdi.e(this.id.hashCode() * 31, 31, this.cid), 31, this.text), 31, this.html);
        String str = this.parentId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        String str2 = this.command;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int f = hdi.f(hdi.f(hdi.e((this.syncStatus.hashCode() + sv6.c(this.reactionGroups, sv6.c(this.reactionScores, sv6.c(this.reactionCounts, woa.b(this.deletedReplyCount, woa.b(this.replyCount, hdi.f(hdi.f(hdi.f((i2 + hashCode2) * 31, 31, this.attachments), 31, this.mentionedUsersIds), 31, this.mentionedUsers), 31), 31), 31), 31), 31)) * 31, 31, this.type), 31, this.latestReactions), 31, this.ownReactions);
        Date date = this.createdAt;
        if (date == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = date.hashCode();
        }
        int i3 = (f + hashCode3) * 31;
        Date date2 = this.updatedAt;
        if (date2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = date2.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        Date date3 = this.deletedAt;
        if (date3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = date3.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        Date date4 = this.updatedLocallyAt;
        if (date4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = date4.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        Date date5 = this.createdLocallyAt;
        if (date5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = date5.hashCode();
        }
        int g = hdi.g(sv6.c(this.i18n, hdi.g(hdi.g(sv6.c(this.extraData, ix2.f(this.user, (i6 + hashCode7) * 31, 31), 31), 31, this.silent), 31, this.shadowed), 31), 31, this.showInChannel);
        ChannelInfo channelInfo = this.channelInfo;
        if (channelInfo == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = channelInfo.hashCode();
        }
        int i7 = (g + hashCode8) * 31;
        Message message = this.replyTo;
        if (message == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = message.hashCode();
        }
        int i8 = (i7 + hashCode9) * 31;
        String str3 = this.replyMessageId;
        if (str3 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str3.hashCode();
        }
        int g2 = hdi.g((i8 + hashCode10) * 31, 31, this.pinned);
        Date date6 = this.pinnedAt;
        if (date6 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = date6.hashCode();
        }
        int i9 = (g2 + hashCode11) * 31;
        Date date7 = this.pinExpires;
        if (date7 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = date7.hashCode();
        }
        int i10 = (i9 + hashCode12) * 31;
        User user = this.pinnedBy;
        if (user == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = user.hashCode();
        }
        int g3 = hdi.g(hdi.g(hdi.f((i10 + hashCode13) * 31, 31, this.threadParticipants), 31, this.skipPushNotification), 31, this.skipEnrichUrl);
        MessageModerationDetails messageModerationDetails = this.moderationDetails;
        if (messageModerationDetails == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = messageModerationDetails.hashCode();
        }
        int i11 = (g3 + hashCode14) * 31;
        Moderation moderation = this.moderation;
        if (moderation == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = moderation.hashCode();
        }
        int i12 = (i11 + hashCode15) * 31;
        Date date8 = this.messageTextUpdatedAt;
        if (date8 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = date8.hashCode();
        }
        int i13 = (i12 + hashCode16) * 31;
        Poll poll = this.poll;
        if (poll == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = poll.hashCode();
        }
        int f2 = hdi.f((i13 + hashCode17) * 31, 31, this.restrictedVisibility);
        MessageReminderInfo messageReminderInfo = this.reminder;
        if (messageReminderInfo == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = messageReminderInfo.hashCode();
        }
        int i14 = (f2 + hashCode18) * 31;
        Location location = this.sharedLocation;
        if (location == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = location.hashCode();
        }
        int i15 = (i14 + hashCode19) * 31;
        String str4 = this.channelRole;
        if (str4 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = str4.hashCode();
        }
        int i16 = (i15 + hashCode20) * 31;
        MemberInfo memberInfo = this.member;
        if (memberInfo != null) {
            i = memberInfo.hashCode();
        }
        return this.mentionedRoles.hashCode() + hdi.f(hdi.g(hdi.g(hdi.g((i16 + i) * 31, 31, this.deletedForMe), 31, this.mentionedHere), 31, this.mentionedChannel), 31, this.mentionedGroups);
    }

    public final long identifierHash() {
        String str;
        int i;
        int hashCode = this.id.hashCode();
        Message message = this.replyTo;
        Integer num = null;
        if (message != null) {
            str = message.id;
        } else {
            str = null;
        }
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() != 0) {
            num = valueOf;
        }
        if (num != null) {
            hashCode = (hashCode * 31) + num.intValue();
        }
        return hashCode;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final void setCreatedLocallyAt(Date date) {
        this.createdLocallyAt = date;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Message(type=\"");
        sb.append(this.type);
        sb.append("\", id=\"");
        sb.append(this.id);
        sb.append("\", text=\"");
        sb.append(this.text);
        sb.append("\", html=\"");
        sb.append(this.html);
        sb.append("\", cid=\"");
        sb.append(this.cid);
        sb.append("\"");
        if (this.parentId != null) {
            sb.append(", parentId=");
            sb.append(this.parentId);
        }
        if (this.command != null) {
            sb.append(", command=");
            sb.append(this.command);
        }
        if (!this.attachments.isEmpty()) {
            sb.append(", attachments=");
            sb.append(this.attachments);
        }
        if (!this.mentionedUsersIds.isEmpty()) {
            sb.append(", mentionedUsersIds=");
            sb.append(this.mentionedUsersIds);
        }
        if (!this.mentionedUsers.isEmpty()) {
            sb.append(", mentionedUsers=");
            sb.append(this.mentionedUsers);
        }
        if (this.replyCount > 0) {
            sb.append(", replyCount=");
            sb.append(this.replyCount);
        }
        if (this.deletedReplyCount > 0) {
            sb.append(", deletedReplyCount=");
            sb.append(this.deletedReplyCount);
        }
        if (!this.reactionCounts.isEmpty()) {
            sb.append(", reactionCounts=");
            sb.append(this.reactionCounts);
        }
        if (!this.reactionScores.isEmpty()) {
            sb.append(", reactionScores=");
            sb.append(this.reactionScores);
        }
        sb.append(", syncStatus=");
        sb.append(this.syncStatus);
        if (!this.latestReactions.isEmpty()) {
            sb.append(", latestReactions=");
            sb.append(this.latestReactions);
        }
        if (!this.ownReactions.isEmpty()) {
            sb.append(", ownReactions=");
            sb.append(this.ownReactions);
        }
        if (this.createdAt != null) {
            sb.append(", createdAt=");
            sb.append(this.createdAt);
        }
        if (this.updatedAt != null) {
            sb.append(", updatedAt=");
            sb.append(this.updatedAt);
        }
        if (this.deletedAt != null) {
            sb.append(", deletedAt=");
            sb.append(this.deletedAt);
        }
        if (this.updatedLocallyAt != null) {
            sb.append(", updatedLocallyAt=");
            sb.append(this.updatedLocallyAt);
        }
        if (this.createdLocallyAt != null) {
            sb.append(", createdLocallyAt=");
            sb.append(this.createdLocallyAt);
        }
        sb.append(", sentBy=User(id=\"");
        sb.append(this.user.getId());
        sb.append("\", name=\"");
        sb.append(this.user.getName());
        sb.append("\"), silent=");
        sb.append(this.silent);
        sb.append(", shadowed=");
        sb.append(this.shadowed);
        if (!this.i18n.isEmpty()) {
            sb.append(", i18n=");
            sb.append(this.i18n);
        }
        sb.append(", showInChannel=");
        sb.append(this.showInChannel);
        if (this.channelInfo != null) {
            sb.append(", channelInfo=");
            sb.append(this.channelInfo);
        }
        if (this.replyMessageId != null) {
            sb.append(", replyMessageId=");
            sb.append(this.replyMessageId);
        }
        if (this.replyTo != null) {
            sb.append(", replyTo=");
            sb.append(this.replyTo);
        }
        sb.append(", pinned=");
        sb.append(this.pinned);
        if (this.pinnedAt != null) {
            sb.append(", pinnedAt=");
            sb.append(this.pinnedAt);
        }
        if (this.pinExpires != null) {
            sb.append(", pinExpires=");
            sb.append(this.pinExpires);
        }
        if (this.pinnedBy != null) {
            sb.append(", pinnedBy=");
            sb.append(this.pinnedBy);
        }
        if (!this.threadParticipants.isEmpty()) {
            sb.append(", threadParticipants=");
            sb.append(this.threadParticipants);
        }
        sb.append(", skipPushNotification=");
        sb.append(this.skipPushNotification);
        sb.append(", skipEnrichUrl=");
        sb.append(this.skipEnrichUrl);
        if (this.moderationDetails != null) {
            sb.append(", moderationDetails=");
            sb.append(this.moderationDetails);
        }
        if (this.moderation != null) {
            sb.append(", moderation=");
            sb.append(this.moderation);
        }
        if (this.poll != null) {
            sb.append(", poll=");
            sb.append(this.poll);
        }
        if (this.member != null) {
            sb.append(", member=");
            sb.append(this.member);
        }
        sb.append(", deletedForMe=");
        sb.append(this.deletedForMe);
        if (this.mentionedHere) {
            sb.append(", mentionedHere=true");
        }
        if (this.mentionedChannel) {
            sb.append(", mentionedChannel=true");
        }
        if (!this.mentionedGroups.isEmpty()) {
            sb.append(", mentionedGroups=");
            sb.append(this.mentionedGroups);
        }
        if (!this.mentionedRoles.isEmpty()) {
            sb.append(", mentionedRoles=");
            sb.append(this.mentionedRoles);
        }
        if (!getExtraData().isEmpty()) {
            sb.append(", extraData=");
            sb.append(getExtraData());
        }
        sb.append(")");
        return sb.toString();
    }

    @hm6
    public static /* synthetic */ void getChannelRole$annotations() {
    }

    public Message(String str, String str2, String str3, String str4, String str5, String str6, List<Attachment> list, List<String> list2, List<User> list3, int i, int i2, Map<String, Integer> map, Map<String, Integer> map2, Map<String, ReactionGroup> map3, SyncStatus syncStatus, String str7, List<Reaction> list4, List<Reaction> list5, Date date, Date date2, Date date3, Date date4, Date date5, User user, Map<String, ? extends Object> map4, boolean z, boolean z2, Map<String, String> map5, boolean z3, ChannelInfo channelInfo, Message message, String str8, boolean z4, Date date6, Date date7, User user2, List<User> list6, boolean z5, boolean z6, MessageModerationDetails messageModerationDetails, Moderation moderation, Date date8, Poll poll, List<String> list7, MessageReminderInfo messageReminderInfo, Location location, String str9, MemberInfo memberInfo, boolean z7, boolean z8, boolean z9, List<UserGroup> list8, List<String> list9) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        syncStatus.getClass();
        str7.getClass();
        list4.getClass();
        list5.getClass();
        user.getClass();
        map4.getClass();
        map5.getClass();
        list6.getClass();
        list7.getClass();
        list8.getClass();
        list9.getClass();
        this.id = str;
        this.cid = str2;
        this.text = str3;
        this.html = str4;
        this.parentId = str5;
        this.command = str6;
        this.attachments = list;
        this.mentionedUsersIds = list2;
        this.mentionedUsers = list3;
        this.replyCount = i;
        this.deletedReplyCount = i2;
        this.reactionCounts = map;
        this.reactionScores = map2;
        this.reactionGroups = map3;
        this.syncStatus = syncStatus;
        this.type = str7;
        this.latestReactions = list4;
        this.ownReactions = list5;
        this.createdAt = date;
        this.updatedAt = date2;
        this.deletedAt = date3;
        this.updatedLocallyAt = date4;
        this.createdLocallyAt = date5;
        this.user = user;
        this.extraData = map4;
        this.silent = z;
        this.shadowed = z2;
        this.i18n = map5;
        this.showInChannel = z3;
        this.channelInfo = channelInfo;
        this.replyTo = message;
        this.replyMessageId = str8;
        this.pinned = z4;
        this.pinnedAt = date6;
        this.pinExpires = date7;
        this.pinnedBy = user2;
        this.threadParticipants = list6;
        this.skipPushNotification = z5;
        this.skipEnrichUrl = z6;
        this.moderationDetails = messageModerationDetails;
        this.moderation = moderation;
        this.messageTextUpdatedAt = date8;
        this.poll = poll;
        this.restrictedVisibility = list7;
        this.reminder = messageReminderInfo;
        this.sharedLocation = location;
        this.channelRole = str9;
        this.member = memberInfo;
        this.deletedForMe = z7;
        this.mentionedHere = z8;
        this.mentionedChannel = z9;
        this.mentionedGroups = list8;
        this.mentionedRoles = list9;
    }

    public Message() {
        this(null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, false, false, false, null, null, -1, 2097151, null);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b8\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u000e\u0010O\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010P\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010Q\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010R\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\bJ\u0010\u0010S\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\bJ\u0010\u0010T\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\bJ\u0014\u0010U\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0014\u0010V\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u000fJ\u0014\u0010W\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fJ\u000e\u0010X\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010Y\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015J\u001a\u0010Z\u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00150\u0018J\u001a\u0010[\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00150\u0018J\u001a\u0010\\\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001b0\u0018J\u000e\u0010]\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010^\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\bJ\u0014\u0010_\u001a\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u000fJ\u0014\u0010`\u001a\u00020\u00002\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000fJ\u0010\u0010a\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010#J\u0010\u0010b\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010#J\u0010\u0010c\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010#J\u0010\u0010d\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010#J\u0010\u0010e\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010#J\u000e\u0010f\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0013J\u001a\u0010g\u001a\u00020\u00002\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0018J\u000e\u0010h\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+J\u000e\u0010i\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+J\u001a\u0010j\u001a\u00020\u00002\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0018J\u000e\u0010k\u001a\u00020\u00002\u0006\u0010.\u001a\u00020+J\u0010\u0010l\u001a\u00020\u00002\b\u0010/\u001a\u0004\u0018\u000100J\u0010\u0010m\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u00010\u0005J\u0010\u0010n\u001a\u00020\u00002\b\u00102\u001a\u0004\u0018\u00010\bJ\u000e\u0010o\u001a\u00020\u00002\u0006\u00103\u001a\u00020+J\u0010\u0010p\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010#J\u0010\u0010q\u001a\u00020\u00002\b\u00105\u001a\u0004\u0018\u00010#J\u0010\u0010r\u001a\u00020\u00002\b\u00106\u001a\u0004\u0018\u00010\u0013J\u0014\u0010s\u001a\u00020\u00002\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fJ\u000e\u0010t\u001a\u00020\u00002\u0006\u00108\u001a\u00020+J\u000e\u0010u\u001a\u00020\u00002\u0006\u00109\u001a\u00020+J\u000e\u0010v\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;J\u000e\u0010w\u001a\u00020\u00002\u0006\u0010<\u001a\u00020=J\u0010\u0010x\u001a\u00020\u00002\b\u0010>\u001a\u0004\u0018\u00010#J\u0010\u0010y\u001a\u00020\u00002\b\u0010?\u001a\u0004\u0018\u00010@J\u0014\u0010z\u001a\u00020\u00002\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\b0\u000fJ\u0010\u0010{\u001a\u00020\u00002\b\u0010B\u001a\u0004\u0018\u00010CJ\u0010\u0010|\u001a\u00020\u00002\b\u0010D\u001a\u0004\u0018\u00010EJ\u0012\u0010}\u001a\u00020\u00002\b\u0010F\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010~\u001a\u00020\u00002\b\u0010G\u001a\u0004\u0018\u00010HJ\u000e\u0010\u007f\u001a\u00020\u00002\u0006\u0010I\u001a\u00020+J\u000f\u0010\u0080\u0001\u001a\u00020\u00002\u0006\u0010J\u001a\u00020+J\u000f\u0010\u0081\u0001\u001a\u00020\u00002\u0006\u0010K\u001a\u00020+J\u0015\u0010\u0082\u0001\u001a\u00020\u00002\f\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u000fJ\u0015\u0010\u0083\u0001\u001a\u00020\u00002\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\b0\u000fJ\u0007\u0010\u0084\u0001\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00150\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00150\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001b0\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u0004\u0018\u00010@X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020\b0\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u0004\u0018\u00010CX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u00010EX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010G\u001a\u0004\u0018\u00010HX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010N\u001a\b\u0012\u0004\u0012\u00020\b0\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0085\u0001"}, d2 = {"Lio/getstream/chat/android/models/Message$Builder;", "", "<init>", "()V", "message", "Lio/getstream/chat/android/models/Message;", "(Lio/getstream/chat/android/models/Message;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "cid", "text", "html", "parentId", "command", "attachments", "", "Lio/getstream/chat/android/models/Attachment;", "mentionedUsersIds", "mentionedUsers", "Lio/getstream/chat/android/models/User;", "replyCount", "", "deletedReplyCount", "reactionCounts", "", "reactionScores", "reactionGroups", "Lio/getstream/chat/android/models/ReactionGroup;", "syncStatus", "Lio/getstream/chat/android/models/SyncStatus;", "type", "latestReactions", "Lio/getstream/chat/android/models/Reaction;", "ownReactions", "createdAt", "Ljava/util/Date;", "updatedAt", "deletedAt", "updatedLocallyAt", "createdLocallyAt", "user", "extraData", "silent", "", "shadowed", "i18n", "showInChannel", "channelInfo", "Lio/getstream/chat/android/models/ChannelInfo;", "replyTo", "replyMessageId", "pinned", "pinnedAt", "pinExpires", "pinnedBy", "threadParticipants", "skipPushNotification", "skipEnrichUrl", "moderationDetails", "Lio/getstream/chat/android/models/MessageModerationDetails;", "moderation", "Lio/getstream/chat/android/models/Moderation;", "messageTextUpdatedAt", "poll", "Lio/getstream/chat/android/models/Poll;", "restrictedVisibility", "reminder", "Lio/getstream/chat/android/models/MessageReminderInfo;", "sharedLocation", "Lio/getstream/chat/android/models/Location;", "channelRole", "member", "Lio/getstream/chat/android/models/MemberInfo;", "deletedForMe", "mentionedHere", "mentionedChannel", "mentionedGroups", "Lio/getstream/chat/android/models/UserGroup;", "mentionedRoles", "withId", "withCid", "withText", "withHtml", "withParentId", "withCommand", "withAttachments", "withMentionedUsersIds", "withMentionedUsers", "withReplyCount", "withDeletedReplyCount", "withReactionCounts", "withReactionScores", "withReactionGroups", "withSyncStatus", "withType", "withLatestReactions", "withOwnReactions", "withCreatedAt", "withUpdatedAt", "withDeletedAt", "withUpdatedLocallyAt", "withCreatedLocallyAt", "withUser", "withExtraData", "withSilent", "withShadowed", "withI18n", "withShowInChannel", "withChannelInfo", "withReplyTo", "withReplyMessageId", "withPinned", "withPinnedAt", "withPinExpires", "withPinnedBy", "withThreadParticipants", "withSkipPushNotification", "withSkipEnrichUrl", "withModerationDetails", "withModeration", "withMessageTextUpdatedAt", "withPoll", "withRestrictedVisibility", "withReminder", "withSharedLocation", "withChannelRole", "withMember", "withDeletedForMe", "withMentionedHere", "withMentionedChannel", "withMentionedGroups", "withMentionedRoles", "build", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Builder {
        private List<Attachment> attachments;
        private ChannelInfo channelInfo;
        private String channelRole;
        private String cid;
        private String command;
        private Date createdAt;
        private Date createdLocallyAt;
        private Date deletedAt;
        private boolean deletedForMe;
        private int deletedReplyCount;
        private Map<String, ? extends Object> extraData;
        private String html;
        private Map<String, String> i18n;
        private String id;
        private List<Reaction> latestReactions;
        private MemberInfo member;
        private boolean mentionedChannel;
        private List<UserGroup> mentionedGroups;
        private boolean mentionedHere;
        private List<String> mentionedRoles;
        private List<User> mentionedUsers;
        private List<String> mentionedUsersIds;
        private Date messageTextUpdatedAt;
        private Moderation moderation;
        private MessageModerationDetails moderationDetails;
        private List<Reaction> ownReactions;
        private String parentId;
        private Date pinExpires;
        private boolean pinned;
        private Date pinnedAt;
        private User pinnedBy;
        private Poll poll;
        private Map<String, Integer> reactionCounts;
        private Map<String, ReactionGroup> reactionGroups;
        private Map<String, Integer> reactionScores;
        private MessageReminderInfo reminder;
        private int replyCount;
        private String replyMessageId;
        private Message replyTo;
        private List<String> restrictedVisibility;
        private boolean shadowed;
        private Location sharedLocation;
        private boolean showInChannel;
        private boolean silent;
        private boolean skipEnrichUrl;
        private boolean skipPushNotification;
        private SyncStatus syncStatus;
        private String text;
        private List<User> threadParticipants;
        private String type;
        private Date updatedAt;
        private Date updatedLocallyAt;
        private User user;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Message message) {
            this();
            message.getClass();
            this.id = message.getId();
            this.cid = message.getCid();
            this.text = message.getText();
            this.html = message.getHtml();
            this.parentId = message.getParentId();
            this.command = message.getCommand();
            this.attachments = message.getAttachments();
            this.mentionedUsersIds = message.getMentionedUsersIds();
            this.mentionedUsers = message.getMentionedUsers();
            this.replyCount = message.getReplyCount();
            this.deletedReplyCount = message.getDeletedReplyCount();
            this.reactionCounts = message.getReactionCounts();
            this.reactionScores = message.getReactionScores();
            this.reactionGroups = message.getReactionGroups();
            this.syncStatus = message.getSyncStatus();
            this.type = message.getType();
            this.latestReactions = message.getLatestReactions();
            this.ownReactions = message.getOwnReactions();
            this.createdAt = message.getCreatedAt();
            this.updatedAt = message.getUpdatedAt();
            this.deletedAt = message.getDeletedAt();
            this.updatedLocallyAt = message.getUpdatedLocallyAt();
            this.createdLocallyAt = message.getCreatedLocallyAt();
            this.user = message.getUser();
            this.extraData = message.getExtraData();
            this.silent = message.getSilent();
            this.shadowed = message.getShadowed();
            this.i18n = message.getI18n();
            this.showInChannel = message.getShowInChannel();
            this.channelInfo = message.getChannelInfo();
            this.replyTo = message.getReplyTo();
            this.replyMessageId = message.getReplyMessageId();
            this.pinned = message.getPinned();
            this.pinnedAt = message.getPinnedAt();
            this.pinExpires = message.getPinExpires();
            this.pinnedBy = message.getPinnedBy();
            this.threadParticipants = message.getThreadParticipants();
            this.skipPushNotification = message.getSkipPushNotification();
            this.skipEnrichUrl = message.getSkipEnrichUrl();
            this.moderationDetails = message.getModerationDetails();
            this.moderation = message.getModeration();
            this.messageTextUpdatedAt = message.getMessageTextUpdatedAt();
            this.poll = message.getPoll();
            this.restrictedVisibility = message.getRestrictedVisibility();
            this.reminder = message.getReminder();
            this.sharedLocation = message.getSharedLocation();
            this.channelRole = message.getChannelRole();
            this.member = message.getMember();
            this.deletedForMe = message.getDeletedForMe();
            this.mentionedHere = message.getMentionedHere();
            this.mentionedChannel = message.getMentionedChannel();
            this.mentionedGroups = message.getMentionedGroups();
            this.mentionedRoles = message.getMentionedRoles();
        }

        public final Message build() {
            MemberInfo memberInfo;
            String str;
            MemberInfo memberInfo2 = this.member;
            if (memberInfo2 == null) {
                String str2 = this.channelRole;
                if (str2 != null) {
                    memberInfo = new MemberInfo(str2, false, null, 6, null);
                } else {
                    memberInfo = null;
                }
            } else {
                memberInfo = memberInfo2;
            }
            String str3 = this.id;
            String str4 = this.cid;
            String str5 = this.text;
            String str6 = this.html;
            String str7 = this.parentId;
            String str8 = this.command;
            List<Attachment> list = this.attachments;
            List<String> list2 = this.mentionedUsersIds;
            List<User> list3 = this.mentionedUsers;
            int i = this.replyCount;
            int i2 = this.deletedReplyCount;
            Map<String, Integer> map = this.reactionCounts;
            Map<String, Integer> map2 = this.reactionScores;
            Map<String, ReactionGroup> map3 = this.reactionGroups;
            SyncStatus syncStatus = this.syncStatus;
            String str9 = this.type;
            List<Reaction> list4 = this.latestReactions;
            List<Reaction> list5 = this.ownReactions;
            Date date = this.createdAt;
            Date date2 = this.updatedAt;
            Date date3 = this.deletedAt;
            Date date4 = this.updatedLocallyAt;
            Date date5 = this.createdLocallyAt;
            User user = this.user;
            Map<String, ? extends Object> map4 = this.extraData;
            boolean z = this.silent;
            boolean z2 = this.shadowed;
            Map<String, String> map5 = this.i18n;
            boolean z3 = this.showInChannel;
            ChannelInfo channelInfo = this.channelInfo;
            Message message = this.replyTo;
            String str10 = this.replyMessageId;
            boolean z4 = this.pinned;
            Date date6 = this.pinnedAt;
            Date date7 = this.pinExpires;
            User user2 = this.pinnedBy;
            List<User> list6 = this.threadParticipants;
            boolean z5 = this.skipPushNotification;
            boolean z6 = this.skipEnrichUrl;
            MessageModerationDetails messageModerationDetails = this.moderationDetails;
            Moderation moderation = this.moderation;
            Date date8 = this.messageTextUpdatedAt;
            List<String> list7 = this.restrictedVisibility;
            Poll poll = this.poll;
            MessageReminderInfo messageReminderInfo = this.reminder;
            Location location = this.sharedLocation;
            if (memberInfo != null) {
                str = memberInfo.getChannelRole();
            } else {
                str = null;
            }
            return new Message(str3, str4, str5, str6, str7, str8, list, list2, list3, i, i2, map, map2, map3, syncStatus, str9, list4, list5, date, date2, date3, date4, date5, user, map4, z, z2, map5, z3, channelInfo, message, str10, z4, date6, date7, user2, list6, z5, z6, messageModerationDetails, moderation, date8, poll, list7, messageReminderInfo, location, str, memberInfo, this.deletedForMe, this.mentionedHere, this.mentionedChannel, this.mentionedGroups, this.mentionedRoles);
        }

        public final Builder withAttachments(List<Attachment> attachments) {
            attachments.getClass();
            this.attachments = attachments;
            return this;
        }

        public final Builder withChannelInfo(ChannelInfo channelInfo) {
            this.channelInfo = channelInfo;
            return this;
        }

        @hm6
        public final Builder withChannelRole(String channelRole) {
            this.channelRole = channelRole;
            return this;
        }

        public final Builder withCid(String cid) {
            cid.getClass();
            this.cid = cid;
            return this;
        }

        public final Builder withCommand(String command) {
            this.command = command;
            return this;
        }

        public final Builder withCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public final Builder withCreatedLocallyAt(Date createdLocallyAt) {
            this.createdLocallyAt = createdLocallyAt;
            return this;
        }

        public final Builder withDeletedAt(Date deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }

        public final Builder withDeletedForMe(boolean deletedForMe) {
            this.deletedForMe = deletedForMe;
            return this;
        }

        public final Builder withDeletedReplyCount(int deletedReplyCount) {
            this.deletedReplyCount = deletedReplyCount;
            return this;
        }

        public final Builder withExtraData(Map<String, ? extends Object> extraData) {
            extraData.getClass();
            this.extraData = extraData;
            return this;
        }

        public final Builder withHtml(String html) {
            html.getClass();
            this.html = html;
            return this;
        }

        public final Builder withI18n(Map<String, String> i18n) {
            i18n.getClass();
            this.i18n = i18n;
            return this;
        }

        public final Builder withId(String id) {
            id.getClass();
            this.id = id;
            return this;
        }

        public final Builder withLatestReactions(List<Reaction> latestReactions) {
            latestReactions.getClass();
            this.latestReactions = latestReactions;
            return this;
        }

        public final Builder withMember(MemberInfo member) {
            this.member = member;
            return this;
        }

        public final Builder withMentionedChannel(boolean mentionedChannel) {
            this.mentionedChannel = mentionedChannel;
            return this;
        }

        public final Builder withMentionedGroups(List<UserGroup> mentionedGroups) {
            mentionedGroups.getClass();
            this.mentionedGroups = mentionedGroups;
            return this;
        }

        public final Builder withMentionedHere(boolean mentionedHere) {
            this.mentionedHere = mentionedHere;
            return this;
        }

        public final Builder withMentionedRoles(List<String> mentionedRoles) {
            mentionedRoles.getClass();
            this.mentionedRoles = mentionedRoles;
            return this;
        }

        public final Builder withMentionedUsers(List<User> mentionedUsers) {
            mentionedUsers.getClass();
            this.mentionedUsers = mentionedUsers;
            return this;
        }

        public final Builder withMentionedUsersIds(List<String> mentionedUsersIds) {
            mentionedUsersIds.getClass();
            this.mentionedUsersIds = mentionedUsersIds;
            return this;
        }

        public final Builder withMessageTextUpdatedAt(Date messageTextUpdatedAt) {
            this.messageTextUpdatedAt = messageTextUpdatedAt;
            return this;
        }

        public final Builder withModeration(Moderation moderation) {
            moderation.getClass();
            this.moderation = moderation;
            return this;
        }

        public final Builder withModerationDetails(MessageModerationDetails moderationDetails) {
            moderationDetails.getClass();
            this.moderationDetails = moderationDetails;
            return this;
        }

        public final Builder withOwnReactions(List<Reaction> ownReactions) {
            ownReactions.getClass();
            this.ownReactions = ownReactions;
            return this;
        }

        public final Builder withParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        public final Builder withPinExpires(Date pinExpires) {
            this.pinExpires = pinExpires;
            return this;
        }

        public final Builder withPinned(boolean pinned) {
            this.pinned = pinned;
            return this;
        }

        public final Builder withPinnedAt(Date pinnedAt) {
            this.pinnedAt = pinnedAt;
            return this;
        }

        public final Builder withPinnedBy(User pinnedBy) {
            this.pinnedBy = pinnedBy;
            return this;
        }

        public final Builder withPoll(Poll poll) {
            this.poll = poll;
            return this;
        }

        public final Builder withReactionCounts(Map<String, Integer> reactionCounts) {
            reactionCounts.getClass();
            this.reactionCounts = reactionCounts;
            return this;
        }

        public final Builder withReactionGroups(Map<String, ReactionGroup> reactionGroups) {
            reactionGroups.getClass();
            this.reactionGroups = reactionGroups;
            return this;
        }

        public final Builder withReactionScores(Map<String, Integer> reactionScores) {
            reactionScores.getClass();
            this.reactionScores = reactionScores;
            return this;
        }

        public final Builder withReminder(MessageReminderInfo reminder) {
            this.reminder = reminder;
            return this;
        }

        public final Builder withReplyCount(int replyCount) {
            this.replyCount = replyCount;
            return this;
        }

        public final Builder withReplyMessageId(String replyMessageId) {
            this.replyMessageId = replyMessageId;
            return this;
        }

        public final Builder withReplyTo(Message replyTo) {
            this.replyTo = replyTo;
            return this;
        }

        public final Builder withRestrictedVisibility(List<String> restrictedVisibility) {
            restrictedVisibility.getClass();
            this.restrictedVisibility = restrictedVisibility;
            return this;
        }

        public final Builder withShadowed(boolean shadowed) {
            this.shadowed = shadowed;
            return this;
        }

        public final Builder withSharedLocation(Location sharedLocation) {
            this.sharedLocation = sharedLocation;
            return this;
        }

        public final Builder withShowInChannel(boolean showInChannel) {
            this.showInChannel = showInChannel;
            return this;
        }

        public final Builder withSilent(boolean silent) {
            this.silent = silent;
            return this;
        }

        public final Builder withSkipEnrichUrl(boolean skipEnrichUrl) {
            this.skipEnrichUrl = skipEnrichUrl;
            return this;
        }

        public final Builder withSkipPushNotification(boolean skipPushNotification) {
            this.skipPushNotification = skipPushNotification;
            return this;
        }

        public final Builder withSyncStatus(SyncStatus syncStatus) {
            syncStatus.getClass();
            this.syncStatus = syncStatus;
            return this;
        }

        public final Builder withText(String text) {
            text.getClass();
            this.text = text;
            return this;
        }

        public final Builder withThreadParticipants(List<User> threadParticipants) {
            threadParticipants.getClass();
            this.threadParticipants = threadParticipants;
            return this;
        }

        public final Builder withType(String type) {
            type.getClass();
            this.type = type;
            return this;
        }

        public final Builder withUpdatedAt(Date updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public final Builder withUpdatedLocallyAt(Date updatedLocallyAt) {
            this.updatedLocallyAt = updatedLocallyAt;
            return this;
        }

        public final Builder withUser(User user) {
            user.getClass();
            this.user = user;
            return this;
        }

        public Builder() {
            this.id = "";
            this.cid = "";
            this.text = "";
            this.html = "";
            this.attachments = CollectionsKt.emptyList();
            this.mentionedUsersIds = CollectionsKt.emptyList();
            this.mentionedUsers = CollectionsKt.emptyList();
            zc7 zc7Var = zc7.a;
            zc7Var.getClass();
            this.reactionCounts = zc7Var;
            zc7Var.getClass();
            this.reactionScores = zc7Var;
            zc7Var.getClass();
            this.reactionGroups = zc7Var;
            this.syncStatus = SyncStatus.COMPLETED;
            this.type = "";
            this.latestReactions = CollectionsKt.emptyList();
            this.ownReactions = CollectionsKt.emptyList();
            this.user = new User(null, null, null, null, null, null, null, null, null, false, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, 33554431, null);
            zc7Var.getClass();
            this.extraData = zc7Var;
            zc7Var.getClass();
            this.i18n = zc7Var;
            this.threadParticipants = CollectionsKt.emptyList();
            this.restrictedVisibility = CollectionsKt.emptyList();
            this.mentionedGroups = CollectionsKt.emptyList();
            this.mentionedRoles = CollectionsKt.emptyList();
        }
    }
}
