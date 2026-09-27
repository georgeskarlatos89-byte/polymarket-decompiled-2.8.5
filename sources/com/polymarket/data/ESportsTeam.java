package com.polymarket.data;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.polymarket.data.APISportsTeam;
import com.polymarket.designtokens.DesignTokens;
import com.polymarket.designtokens.HexColorPair;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.woa;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.MutableStruct;
import skip.lib.RawRepresentable;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\bZ\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 í\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004ì\u0001í\u0001B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nBë\u0001\b\u0016\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\t\u0010#Bé\u0001\b\u0016\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\t\u0010'B\u0011\b\u0012\u0012\u0006\u0010(\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010)J\u0006\u0010.\u001a\u00020/J\u0015\u00100\u001a\u00020/2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0096\u0002J\b\u00105\u001a\u000206H\u0016J\u001d\u0010<\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J%\u0010=\u001a\u00020/2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0082 J\u0015\u0010C\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010D\u001a\u00020/2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010>\u001a\u00020\fH\u0082 J\u0015\u0010G\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010H\u001a\u00020/2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010>\u001a\u00020\fH\u0082 J\u0017\u0010K\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010L\u001a\u00020/2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010>\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u0010O\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010P\u001a\u00020/2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010>\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u0010S\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010T\u001a\u00020/2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010>\u001a\u0004\u0018\u00010\fH\u0082 J\u0015\u0010W\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010X\u001a\u00020/2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010>\u001a\u00020\fH\u0082 J\u0017\u0010[\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010\\\u001a\u00020/2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010>\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u0010_\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010`\u001a\u00020/2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010>\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u0010e\u001a\u0004\u0018\u00010%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010f\u001a\u00020/2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010>\u001a\u0004\u0018\u00010%H\u0082 J\u0017\u0010i\u001a\u0004\u0018\u00010%2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010j\u001a\u00020/2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010>\u001a\u0004\u0018\u00010%H\u0082 J\u0017\u0010o\u001a\u0004\u0018\u00010\u001b2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010p\u001a\u00020/2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010>\u001a\u0004\u0018\u00010\u001bH\u0082 J\u0017\u0010s\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010t\u001a\u00020/2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010>\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u0010w\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010x\u001a\u00020/2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010>\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u0010{\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010|\u001a\u00020/2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010>\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u0010\u007f\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J \u0010\u0080\u0001\u001a\u00020/2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010>\u001a\u0004\u0018\u00010\fH\u0082 J\u0018\u0010\u0083\u0001\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J \u0010\u0084\u0001\u001a\u00020/2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010>\u001a\u0004\u0018\u00010\fH\u0082 J\u0018\u0010\u0089\u0001\u001a\u0004\u0018\u00010\"2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J \u0010\u008a\u0001\u001a\u00020/2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010>\u001a\u0004\u0018\u00010\"H\u0082 J\u0016\u0010\u008d\u0001\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 JÊ\u0001\u0010\u008e\u0001\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\f2\b\u0010 \u001a\u0004\u0018\u00010\f2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0082 JÊ\u0001\u0010\u008f\u0001\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\f2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\f2\b\u0010 \u001a\u0004\u0018\u00010\f2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0082 J\u001d\u0010\u0093\u0001\u001a\t\u0012\u0005\u0012\u00030\u0091\u00010\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u0097\u0001\u001a\u0002022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u009a\u0001\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0014\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0091\u00012\b\u0010\u009c\u0001\u001a\u00030\u009d\u0001J#\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u0091\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u009f\u0001\u001a\u00030\u009d\u0001H\u0082 J\u0014\u0010 \u0001\u001a\u0005\u0018\u00010\u0091\u00012\b\u0010\u009c\u0001\u001a\u00030\u009d\u0001J#\u0010¡\u0001\u001a\u0005\u0018\u00010\u0091\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u009f\u0001\u001a\u00030\u009d\u0001H\u0082 J\u001d\u0010¢\u0001\u001a\u0005\u0018\u00010\u0091\u00012\u0007\u0010£\u0001\u001a\u0002022\b\u0010\u009f\u0001\u001a\u00030\u009d\u0001J,\u0010¤\u0001\u001a\u0005\u0018\u00010\u0091\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010¥\u0001\u001a\u0002022\b\u0010\u009f\u0001\u001a\u00030\u009d\u0001H\u0082 J\u0017\u0010©\u0001\u001a\u00030¦\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010®\u0001\u001a\u00030«\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010±\u0001\u001a\u00030«\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010´\u0001\u001a\u0005\u0018\u00010«\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010·\u0001\u001a\u0005\u0018\u00010«\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J$\u0010½\u0001\u001a\u0010\u0012\u0005\u0012\u00030º\u0001\u0012\u0004\u0012\u00020\f0¹\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010Â\u0001\u001a\u00030¿\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010Å\u0001\u001a\u00020\"2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010È\u0001\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010Ë\u0001\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010Î\u0001\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010Ñ\u0001\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010Ô\u0001\u001a\u0004\u0018\u00010\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010×\u0001\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001c\u0010Ú\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010Û\u0001\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010(\u001a\u00020\u0001H\u0082 J\t\u0010ç\u0001\u001a\u00020\u0001H\u0016J\u0019\u0010è\u0001\u001a\t\u0012\u0004\u0012\u0002040é\u00012\u0007\u0010ê\u0001\u001a\u000206H\u0016J\u001a\u0010ë\u0001\u001a\t\u0012\u0004\u0012\u0002040é\u00012\u0007\u0010ê\u0001\u001a\u000206H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R4\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010\u0010\u001a\u00020\f2\u0006\u00107\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010\u0011\u001a\u00020\f2\u0006\u00107\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010@\"\u0004\bF\u0010BR(\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u00107\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010@\"\u0004\bJ\u0010BR(\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u00107\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010@\"\u0004\bN\u0010BR(\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u00107\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010@\"\u0004\bR\u0010BR$\u0010\u0015\u001a\u00020\f2\u0006\u00107\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010@\"\u0004\bV\u0010BR(\u0010\u0016\u001a\u0004\u0018\u00010\f2\b\u00107\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010@\"\u0004\bZ\u0010BR(\u0010\u0017\u001a\u0004\u0018\u00010\f2\b\u00107\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010@\"\u0004\b^\u0010BR(\u0010\u0018\u001a\u0004\u0018\u00010%2\b\u00107\u001a\u0004\u0018\u00010%8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR(\u0010\u0019\u001a\u0004\u0018\u00010%2\b\u00107\u001a\u0004\u0018\u00010%8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bg\u0010b\"\u0004\bh\u0010dR(\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u00107\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR(\u0010\u001c\u001a\u0004\u0018\u00010\f2\b\u00107\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bq\u0010@\"\u0004\br\u0010BR(\u0010\u001d\u001a\u0004\u0018\u00010\f2\b\u00107\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bu\u0010@\"\u0004\bv\u0010BR(\u0010\u001e\u001a\u0004\u0018\u00010\f2\b\u00107\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\by\u0010@\"\u0004\bz\u0010BR(\u0010\u001f\u001a\u0004\u0018\u00010\f2\b\u00107\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b}\u0010@\"\u0004\b~\u0010BR*\u0010 \u001a\u0004\u0018\u00010\f2\b\u00107\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0081\u0001\u0010@\"\u0005\b\u0082\u0001\u0010BR,\u0010!\u001a\u0004\u0018\u00010\"2\b\u00107\u001a\u0004\u0018\u00010\"8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0013\u0010\u008b\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010@R\u001a\u0010\u0090\u0001\u001a\t\u0012\u0005\u0012\u00030\u0091\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u00109R\u0014\u0010\u0094\u0001\u001a\u0002028F¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0013\u0010\u0098\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010@R\u0015\u0010\u009f\u0001\u001a\u00030¦\u00018F¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001R\u0015\u0010ª\u0001\u001a\u00030«\u00018F¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0015\u0010¯\u0001\u001a\u00030«\u00018F¢\u0006\b\u001a\u0006\b°\u0001\u0010\u00ad\u0001R\u0017\u0010²\u0001\u001a\u0005\u0018\u00010«\u00018F¢\u0006\b\u001a\u0006\b³\u0001\u0010\u00ad\u0001R\u0017\u0010µ\u0001\u001a\u0005\u0018\u00010«\u00018F¢\u0006\b\u001a\u0006\b¶\u0001\u0010\u00ad\u0001R\"\u0010¸\u0001\u001a\u0010\u0012\u0005\u0012\u00030º\u0001\u0012\u0004\u0012\u00020\f0¹\u00018F¢\u0006\b\u001a\u0006\b»\u0001\u0010¼\u0001R\u0015\u0010¾\u0001\u001a\u00030¿\u00018F¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u0014\u0010Ã\u0001\u001a\u00020\"8F¢\u0006\b\u001a\u0006\bÄ\u0001\u0010\u0086\u0001R\u0013\u0010Æ\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\bÇ\u0001\u0010@R\u0013\u0010É\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\bÊ\u0001\u0010@R\u0013\u0010Ì\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\bÍ\u0001\u0010@R\u0013\u0010Ï\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\bÐ\u0001\u0010@R\u0015\u0010Ò\u0001\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\bÓ\u0001\u0010@R\u0013\u0010Õ\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\bÖ\u0001\u0010@R\u0019\u0010Ø\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000e8F¢\u0006\u0007\u001a\u0005\bÙ\u0001\u00109R.\u0010Ü\u0001\u001a\u0011\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020/\u0018\u00010Ý\u0001X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÞ\u0001\u0010ß\u0001\"\u0006\bà\u0001\u0010á\u0001R\u001f\u0010â\u0001\u001a\u000206X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bã\u0001\u0010ä\u0001\"\u0006\bå\u0001\u0010æ\u0001¨\u0006î\u0001"}, d2 = {"Lcom/polymarket/data/ESportsTeam;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "providerIds", "", "Lcom/polymarket/data/APISportsTeam$Provider;", "league", "abbreviation", "displayAbbreviation", "alias", "logo", Keys.KEY_NAME, "safeName", "record", "colorPrimary", "colorSecondary", "ordering", "Lcom/polymarket/data/APISportsTeam$TeamOrdering;", "longIcon", "shortIcon", "longIconDark", "shortIconDark", "ranking", "imageDisplayType", "Lcom/polymarket/data/EImageDisplayType;", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/APISportsTeam$TeamOrdering;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/EImageDisplayType;)V", "colorPrimaryPair", "Lcom/polymarket/designtokens/HexColorPair;", "colorSecondaryPair", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/designtokens/HexColorPair;Lcom/polymarket/designtokens/HexColorPair;Lcom/polymarket/data/APISportsTeam$TeamOrdering;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/EImageDisplayType;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "newValue", "getProviderIds", "()Ljava/util/List;", "setProviderIds", "(Ljava/util/List;)V", "Swift_providerIds", "Swift_providerIds_set", "value", "getLeague", "()Ljava/lang/String;", "setLeague", "(Ljava/lang/String;)V", "Swift_league", "Swift_league_set", "getAbbreviation", "setAbbreviation", "Swift_abbreviation", "Swift_abbreviation_set", "getDisplayAbbreviation", "setDisplayAbbreviation", "Swift_displayAbbreviation", "Swift_displayAbbreviation_set", "getAlias", "setAlias", "Swift_alias", "Swift_alias_set", "getLogo", "setLogo", "Swift_logo", "Swift_logo_set", "getName", "setName", "Swift_name", "Swift_name_set", "getSafeName", "setSafeName", "Swift_safeName", "Swift_safeName_set", "getRecord", "setRecord", "Swift_record", "Swift_record_set", "getColorPrimary", "()Lcom/polymarket/designtokens/HexColorPair;", "setColorPrimary", "(Lcom/polymarket/designtokens/HexColorPair;)V", "Swift_colorPrimary", "Swift_colorPrimary_set", "getColorSecondary", "setColorSecondary", "Swift_colorSecondary", "Swift_colorSecondary_set", "getOrdering", "()Lcom/polymarket/data/APISportsTeam$TeamOrdering;", "setOrdering", "(Lcom/polymarket/data/APISportsTeam$TeamOrdering;)V", "Swift_ordering", "Swift_ordering_set", "getLongIcon", "setLongIcon", "Swift_longIcon", "Swift_longIcon_set", "getShortIcon", "setShortIcon", "Swift_shortIcon", "Swift_shortIcon_set", "getLongIconDark", "setLongIconDark", "Swift_longIconDark", "Swift_longIconDark_set", "getShortIconDark", "setShortIconDark", "Swift_shortIconDark", "Swift_shortIconDark_set", "getRanking", "setRanking", "Swift_ranking", "Swift_ranking_set", "getImageDisplayType", "()Lcom/polymarket/data/EImageDisplayType;", "setImageDisplayType", "(Lcom/polymarket/data/EImageDisplayType;)V", "Swift_imageDisplayType", "Swift_imageDisplayType_set", "teamId", "getTeamId", "Swift_teamId", "Swift_constructor_0", "Swift_constructor_1", "allImageURLs", "Ljava/net/URI;", "getAllImageURLs", "Swift_allImageURLs", "hasIconArt", "getHasIconArt", "()Z", "Swift_hasIconArt", "formattedAbbreviation", "getFormattedAbbreviation", "Swift_formattedAbbreviation", "longIconURL", "for_", "Lcom/polymarket/data/EColorScheme;", "Swift_longIconURL_2", "colorScheme", "shortIconURL", "Swift_shortIconURL_3", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ICON, "forPrimarySide", "Swift_icon_4", "isPrimary", "Lcom/polymarket/data/ESportsTeamColorScheme;", "getColorScheme", "()Lcom/polymarket/data/ESportsTeamColorScheme;", "Swift_colorScheme", "primaryColor", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "getPrimaryColor", "()Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "Swift_primaryColor", "color", "getColor", "Swift_color", "secondaryColor", "getSecondaryColor", "Swift_secondaryColor", "semanticColor", "getSemanticColor", "Swift_semanticColor", "providerIdMap", "", "Lcom/polymarket/data/APISportsTeam$ProviderType;", "getProviderIdMap", "()Ljava/util/Map;", "Swift_providerIdMap", "sportSlug", "Lcom/polymarket/data/ESportsSlug;", "getSportSlug", "()Lcom/polymarket/data/ESportsSlug;", "Swift_sportSlug", "resolvedImageDisplayType", "getResolvedImageDisplayType", "Swift_resolvedImageDisplayType", "formattedDisplayName", "getFormattedDisplayName", "Swift_formattedDisplayName", "formattedAbbreviatedName", "getFormattedAbbreviatedName", "Swift_formattedAbbreviatedName", "formattedLongDisplayName", "getFormattedLongDisplayName", "Swift_formattedLongDisplayName", "formattedFullDisplayName", "getFormattedFullDisplayName", "Swift_formattedFullDisplayName", "formattedRecordDisplay", "getFormattedRecordDisplay", "Swift_formattedRecordDisplay", "formattedFullName", "getFormattedFullName", "Swift_formattedFullName", "searchableTerms", "getSearchableTerms", "Swift_searchableTerms", "Swift_constructor_6", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "LogoImageConfiguration", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ESportsTeam implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ESportsTeam(String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, APISportsTeam.TeamOrdering teamOrdering, String str12, String str13, String str14, String str15, String str16, EImageDisplayType eImageDisplayType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, (List<APISportsTeam.Provider>) r3, r5, r6, r7, r8, r9, r2, r10, r11, r12, r13, r14, r15, r4, r16, r17, r18, r40);
        String str17;
        List list2;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        APISportsTeam.TeamOrdering teamOrdering2;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        EImageDisplayType eImageDisplayType2;
        if ((i & 1) != 0) {
            str17 = "";
        } else {
            str17 = str;
        }
        if ((i & 2) != 0) {
            list2 = null;
        } else {
            list2 = list;
        }
        if ((i & 4) != 0) {
            str18 = "";
        } else {
            str18 = str2;
        }
        if ((i & 8) != 0) {
            str19 = "";
        } else {
            str19 = str3;
        }
        if ((i & 16) != 0) {
            str20 = null;
        } else {
            str20 = str4;
        }
        if ((i & 32) != 0) {
            str21 = null;
        } else {
            str21 = str5;
        }
        if ((i & 64) != 0) {
            str22 = null;
        } else {
            str22 = str6;
        }
        String str32 = (i & 128) == 0 ? str7 : "";
        if ((i & 256) != 0) {
            str23 = null;
        } else {
            str23 = str8;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            str24 = null;
        } else {
            str24 = str9;
        }
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            str25 = null;
        } else {
            str25 = str10;
        }
        if ((i & 2048) != 0) {
            str26 = null;
        } else {
            str26 = str11;
        }
        if ((i & 4096) != 0) {
            teamOrdering2 = null;
        } else {
            teamOrdering2 = teamOrdering;
        }
        if ((i & 8192) != 0) {
            str27 = null;
        } else {
            str27 = str12;
        }
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            str28 = null;
        } else {
            str28 = str13;
        }
        if ((i & 32768) != 0) {
            str29 = null;
        } else {
            str29 = str14;
        }
        if ((i & 65536) != 0) {
            str30 = null;
        } else {
            str30 = str15;
        }
        if ((i & 131072) != 0) {
            str31 = null;
        } else {
            str31 = str16;
        }
        if ((i & 262144) != 0) {
            eImageDisplayType2 = null;
        } else {
            eImageDisplayType2 = eImageDisplayType;
        }
    }

    private final native String Swift_abbreviation(long Swift_peer);

    private final native void Swift_abbreviation_set(long Swift_peer, String value);

    private final native String Swift_alias(long Swift_peer);

    private final native void Swift_alias_set(long Swift_peer, String value);

    private final native List<URI> Swift_allImageURLs(long Swift_peer);

    private final native DesignTokens.SemanticColor Swift_color(long Swift_peer);

    private final native HexColorPair Swift_colorPrimary(long Swift_peer);

    private final native void Swift_colorPrimary_set(long Swift_peer, HexColorPair value);

    private final native ESportsTeamColorScheme Swift_colorScheme(long Swift_peer);

    private final native HexColorPair Swift_colorSecondary(long Swift_peer);

    private final native void Swift_colorSecondary_set(long Swift_peer, HexColorPair value);

    private final native long Swift_constructor_0(String id, List<APISportsTeam.Provider> providerIds, String league, String abbreviation, String displayAbbreviation, String alias, String logo, String name, String safeName, String record, String colorPrimary, String colorSecondary, APISportsTeam.TeamOrdering ordering, String longIcon, String shortIcon, String longIconDark, String shortIconDark, String ranking, EImageDisplayType imageDisplayType);

    private final native long Swift_constructor_1(String id, List<APISportsTeam.Provider> providerIds, String league, String abbreviation, String displayAbbreviation, String alias, String logo, String name, String safeName, String record, HexColorPair colorPrimaryPair, HexColorPair colorSecondaryPair, APISportsTeam.TeamOrdering ordering, String longIcon, String shortIcon, String longIconDark, String shortIconDark, String ranking, EImageDisplayType imageDisplayType);

    private final native long Swift_constructor_6(MutableStruct copy);

    private final native String Swift_displayAbbreviation(long Swift_peer);

    private final native void Swift_displayAbbreviation_set(long Swift_peer, String value);

    private final native String Swift_formattedAbbreviatedName(long Swift_peer);

    private final native String Swift_formattedAbbreviation(long Swift_peer);

    private final native String Swift_formattedDisplayName(long Swift_peer);

    private final native String Swift_formattedFullDisplayName(long Swift_peer);

    private final native String Swift_formattedFullName(long Swift_peer);

    private final native String Swift_formattedLongDisplayName(long Swift_peer);

    private final native String Swift_formattedRecordDisplay(long Swift_peer);

    private final native boolean Swift_hasIconArt(long Swift_peer);

    private final native URI Swift_icon_4(long Swift_peer, boolean isPrimary, EColorScheme colorScheme);

    private final native EImageDisplayType Swift_imageDisplayType(long Swift_peer);

    private final native void Swift_imageDisplayType_set(long Swift_peer, EImageDisplayType value);

    private final native String Swift_league(long Swift_peer);

    private final native void Swift_league_set(long Swift_peer, String value);

    private final native String Swift_logo(long Swift_peer);

    private final native void Swift_logo_set(long Swift_peer, String value);

    private final native String Swift_longIcon(long Swift_peer);

    private final native String Swift_longIconDark(long Swift_peer);

    private final native void Swift_longIconDark_set(long Swift_peer, String value);

    private final native URI Swift_longIconURL_2(long Swift_peer, EColorScheme colorScheme);

    private final native void Swift_longIcon_set(long Swift_peer, String value);

    private final native String Swift_name(long Swift_peer);

    private final native void Swift_name_set(long Swift_peer, String value);

    private final native APISportsTeam.TeamOrdering Swift_ordering(long Swift_peer);

    private final native void Swift_ordering_set(long Swift_peer, APISportsTeam.TeamOrdering value);

    private final native DesignTokens.SemanticColor Swift_primaryColor(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native Map<APISportsTeam.ProviderType, String> Swift_providerIdMap(long Swift_peer);

    private final native List<APISportsTeam.Provider> Swift_providerIds(long Swift_peer);

    private final native void Swift_providerIds_set(long Swift_peer, List<APISportsTeam.Provider> value);

    private final native String Swift_ranking(long Swift_peer);

    private final native void Swift_ranking_set(long Swift_peer, String value);

    private final native String Swift_record(long Swift_peer);

    private final native void Swift_record_set(long Swift_peer, String value);

    private final native void Swift_release(long Swift_peer);

    private final native EImageDisplayType Swift_resolvedImageDisplayType(long Swift_peer);

    private final native String Swift_safeName(long Swift_peer);

    private final native void Swift_safeName_set(long Swift_peer, String value);

    private final native List<String> Swift_searchableTerms(long Swift_peer);

    private final native DesignTokens.SemanticColor Swift_secondaryColor(long Swift_peer);

    private final native DesignTokens.SemanticColor Swift_semanticColor(long Swift_peer);

    private final native String Swift_shortIcon(long Swift_peer);

    private final native String Swift_shortIconDark(long Swift_peer);

    private final native void Swift_shortIconDark_set(long Swift_peer, String value);

    private final native URI Swift_shortIconURL_3(long Swift_peer, EColorScheme colorScheme);

    private final native void Swift_shortIcon_set(long Swift_peer, String value);

    private final native ESportsSlug Swift_sportSlug(long Swift_peer);

    private final native String Swift_teamId(long Swift_peer);

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

    public final String getAbbreviation() {
        return Swift_abbreviation(this.Swift_peer);
    }

    public final String getAlias() {
        return Swift_alias(this.Swift_peer);
    }

    public final List<URI> getAllImageURLs() {
        return Swift_allImageURLs(this.Swift_peer);
    }

    public final DesignTokens.SemanticColor getColor() {
        return Swift_color(this.Swift_peer);
    }

    public final HexColorPair getColorPrimary() {
        return Swift_colorPrimary(this.Swift_peer);
    }

    public final ESportsTeamColorScheme getColorScheme() {
        return Swift_colorScheme(this.Swift_peer);
    }

    public final HexColorPair getColorSecondary() {
        return Swift_colorSecondary(this.Swift_peer);
    }

    public final String getDisplayAbbreviation() {
        return Swift_displayAbbreviation(this.Swift_peer);
    }

    public final String getFormattedAbbreviatedName() {
        return Swift_formattedAbbreviatedName(this.Swift_peer);
    }

    public final String getFormattedAbbreviation() {
        return Swift_formattedAbbreviation(this.Swift_peer);
    }

    public final String getFormattedDisplayName() {
        return Swift_formattedDisplayName(this.Swift_peer);
    }

    public final String getFormattedFullDisplayName() {
        return Swift_formattedFullDisplayName(this.Swift_peer);
    }

    public final String getFormattedFullName() {
        return Swift_formattedFullName(this.Swift_peer);
    }

    public final String getFormattedLongDisplayName() {
        return Swift_formattedLongDisplayName(this.Swift_peer);
    }

    public final String getFormattedRecordDisplay() {
        return Swift_formattedRecordDisplay(this.Swift_peer);
    }

    public final boolean getHasIconArt() {
        return Swift_hasIconArt(this.Swift_peer);
    }

    public final EImageDisplayType getImageDisplayType() {
        return Swift_imageDisplayType(this.Swift_peer);
    }

    public final String getLeague() {
        return Swift_league(this.Swift_peer);
    }

    public final String getLogo() {
        return Swift_logo(this.Swift_peer);
    }

    public final String getLongIcon() {
        return Swift_longIcon(this.Swift_peer);
    }

    public final String getLongIconDark() {
        return Swift_longIconDark(this.Swift_peer);
    }

    public final String getName() {
        return Swift_name(this.Swift_peer);
    }

    public final APISportsTeam.TeamOrdering getOrdering() {
        return Swift_ordering(this.Swift_peer);
    }

    public final DesignTokens.SemanticColor getPrimaryColor() {
        return Swift_primaryColor(this.Swift_peer);
    }

    public final Map<APISportsTeam.ProviderType, String> getProviderIdMap() {
        return Swift_providerIdMap(this.Swift_peer);
    }

    public final List<APISportsTeam.Provider> getProviderIds() {
        return Swift_providerIds(this.Swift_peer);
    }

    public final String getRanking() {
        return Swift_ranking(this.Swift_peer);
    }

    public final String getRecord() {
        return Swift_record(this.Swift_peer);
    }

    public final EImageDisplayType getResolvedImageDisplayType() {
        return Swift_resolvedImageDisplayType(this.Swift_peer);
    }

    public final String getSafeName() {
        return Swift_safeName(this.Swift_peer);
    }

    public final List<String> getSearchableTerms() {
        return Swift_searchableTerms(this.Swift_peer);
    }

    public final DesignTokens.SemanticColor getSecondaryColor() {
        return Swift_secondaryColor(this.Swift_peer);
    }

    public final DesignTokens.SemanticColor getSemanticColor() {
        return Swift_semanticColor(this.Swift_peer);
    }

    public final String getShortIcon() {
        return Swift_shortIcon(this.Swift_peer);
    }

    public final String getShortIconDark() {
        return Swift_shortIconDark(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    public final ESportsSlug getSportSlug() {
        return Swift_sportSlug(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final String getTeamId() {
        return Swift_teamId(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final URI icon(boolean forPrimarySide, EColorScheme colorScheme) {
        colorScheme.getClass();
        return Swift_icon_4(this.Swift_peer, forPrimarySide, colorScheme);
    }

    public final URI longIconURL(EColorScheme for_) {
        for_.getClass();
        return Swift_longIconURL_2(this.Swift_peer, for_);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new ESportsTeam(this);
    }

    public final void setAbbreviation(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_abbreviation_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setAlias(String str) {
        willmutate();
        try {
            Swift_alias_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setColorPrimary(HexColorPair hexColorPair) {
        willmutate();
        try {
            Swift_colorPrimary_set(this.Swift_peer, hexColorPair);
        } finally {
            didmutate();
        }
    }

    public final void setColorSecondary(HexColorPair hexColorPair) {
        willmutate();
        try {
            Swift_colorSecondary_set(this.Swift_peer, hexColorPair);
        } finally {
            didmutate();
        }
    }

    public final void setDisplayAbbreviation(String str) {
        willmutate();
        try {
            Swift_displayAbbreviation_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setImageDisplayType(EImageDisplayType eImageDisplayType) {
        willmutate();
        try {
            Swift_imageDisplayType_set(this.Swift_peer, eImageDisplayType);
        } finally {
            didmutate();
        }
    }

    public final void setLeague(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_league_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setLogo(String str) {
        willmutate();
        try {
            Swift_logo_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setLongIcon(String str) {
        willmutate();
        try {
            Swift_longIcon_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setLongIconDark(String str) {
        willmutate();
        try {
            Swift_longIconDark_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setName(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_name_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setOrdering(APISportsTeam.TeamOrdering teamOrdering) {
        willmutate();
        try {
            Swift_ordering_set(this.Swift_peer, teamOrdering);
        } finally {
            didmutate();
        }
    }

    public final void setProviderIds(List<APISportsTeam.Provider> list) {
        List<APISportsTeam.Provider> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_providerIds_set(this.Swift_peer, list2);
        } finally {
            didmutate();
        }
    }

    public final void setRanking(String str) {
        willmutate();
        try {
            Swift_ranking_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setRecord(String str) {
        willmutate();
        try {
            Swift_record_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setSafeName(String str) {
        willmutate();
        try {
            Swift_safeName_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setShortIcon(String str) {
        willmutate();
        try {
            Swift_shortIcon_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setShortIconDark(String str) {
        willmutate();
        try {
            Swift_shortIconDark_set(this.Swift_peer, str);
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

    public final URI shortIconURL(EColorScheme for_) {
        for_.getClass();
        return Swift_shortIconURL_3(this.Swift_peer, for_);
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0015B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0016"}, d2 = {"Lcom/polymarket/data/ESportsTeam$LogoImageConfiguration;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "centered", "bottomCentered", "fill", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class LogoImageConfiguration implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ LogoImageConfiguration[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final LogoImageConfiguration centered = new LogoImageConfiguration("centered", 0, "centered", null, 2, null);
        public static final LogoImageConfiguration bottomCentered = new LogoImageConfiguration("bottomCentered", 1, "bottomCentered", null, 2, null);
        public static final LogoImageConfiguration fill = new LogoImageConfiguration("fill", 2, "fill", null, 2, null);

        private static final /* synthetic */ LogoImageConfiguration[] $values() {
            return new LogoImageConfiguration[]{centered, bottomCentered, fill};
        }

        static {
            LogoImageConfiguration[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ LogoImageConfiguration(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static LogoImageConfiguration valueOf(String str) {
            return (LogoImageConfiguration) Enum.valueOf(LogoImageConfiguration.class, str);
        }

        public static LogoImageConfiguration[] values() {
            return (LogoImageConfiguration[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/ESportsTeam$LogoImageConfiguration$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/ESportsTeam$LogoImageConfiguration;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final LogoImageConfiguration init(String rawValue) {
                rawValue.getClass();
                int hashCode = rawValue.hashCode();
                if (hashCode != -1277314305) {
                    if (hashCode != -852420684) {
                        if (hashCode == 3143043 && rawValue.equals("fill")) {
                            return LogoImageConfiguration.fill;
                        }
                        return null;
                    }
                    if (rawValue.equals("centered")) {
                        return LogoImageConfiguration.centered;
                    }
                    return null;
                }
                if (!rawValue.equals("bottomCentered")) {
                    return null;
                }
                return LogoImageConfiguration.bottomCentered;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private LogoImageConfiguration(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\t\u0010\u0006\u001a\u00020\u0005H\u0082 J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/polymarket/data/ESportsTeam$Companion;", "", "<init>", "()V", "mockNFL", "Lcom/polymarket/data/ESportsTeam;", "Swift_Companion_mockNFL_5", "LogoImageConfiguration", "Lcom/polymarket/data/ESportsTeam$LogoImageConfiguration;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ESportsTeam Swift_Companion_mockNFL_5();

        public final LogoImageConfiguration LogoImageConfiguration(String rawValue) {
            rawValue.getClass();
            return LogoImageConfiguration.INSTANCE.init(rawValue);
        }

        public final ESportsTeam mockNFL() {
            return Swift_Companion_mockNFL_5();
        }

        private Companion() {
        }
    }

    public ESportsTeam(String str, List<APISportsTeam.Provider> list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, APISportsTeam.TeamOrdering teamOrdering, String str12, String str13, String str14, String str15, String str16, EImageDisplayType eImageDisplayType) {
        woa.A(str, str2, str3, str7);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, list, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, teamOrdering, str12, str13, str14, str15, str16, eImageDisplayType);
    }

    public ESportsTeam(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    public ESportsTeam(String str, List<APISportsTeam.Provider> list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, HexColorPair hexColorPair, HexColorPair hexColorPair2, APISportsTeam.TeamOrdering teamOrdering, String str10, String str11, String str12, String str13, String str14, EImageDisplayType eImageDisplayType) {
        woa.A(str, str2, str3, str7);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_1(str, list, str2, str3, str4, str5, str6, str7, str8, str9, hexColorPair, hexColorPair2, teamOrdering, str10, str11, str12, str13, str14, eImageDisplayType);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ESportsTeam(java.lang.String r24, java.util.List r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, com.polymarket.designtokens.HexColorPair r34, com.polymarket.designtokens.HexColorPair r35, com.polymarket.data.APISportsTeam.TeamOrdering r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, com.polymarket.data.EImageDisplayType r42, int r43, kotlin.jvm.internal.DefaultConstructorMarker r44) {
        /*
            Method dump skipped, instructions count: 173
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.polymarket.data.ESportsTeam.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.polymarket.designtokens.HexColorPair, com.polymarket.designtokens.HexColorPair, com.polymarket.data.APISportsTeam$TeamOrdering, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.polymarket.data.EImageDisplayType, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private ESportsTeam(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_6(mutableStruct);
    }
}
