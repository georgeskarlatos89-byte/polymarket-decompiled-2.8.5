package com.polymarket.data;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.polymarket.data.EMarket;
import com.polymarket.designtokens.DesignTokens;
import defpackage.pc0;
import defpackage.qc0;
import defpackage.ug7;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Hasher;
import skip.lib.InOut;
import skip.lib.MutableStruct;
import skip.lib.RawRepresentable;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 â\u00022\u00020\u00012\u00020\u00022\u00020\u0003:\bß\u0002à\u0002á\u0002â\u0002B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u0013\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0015\u0010\u0018\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010 \u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010!\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u00020\u001aH\u0082 J\u0015\u0010&\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010'\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u00020\u001aH\u0082 J\u0015\u0010+\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010,\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u00020\u001aH\u0082 J\u0015\u00103\u001a\u00020-2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u00104\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u00020-H\u0082 J\u0015\u0010;\u001a\u0002052\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010<\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u000205H\u0082 J\u0017\u0010C\u001a\u0004\u0018\u00010=2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010D\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\"\u001a\u0004\u0018\u00010=H\u0082 J\u0017\u0010H\u001a\u0004\u0018\u00010=2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010I\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\"\u001a\u0004\u0018\u00010=H\u0082 J\u0017\u0010N\u001a\u0004\u0018\u00010\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010O\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0015H\u0082 J\u0017\u0010S\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010T\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u001aH\u0082 J\u0015\u0010Z\u001a\u00020U2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010[\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u00020UH\u0082 J\u0017\u0010b\u001a\u0004\u0018\u00010\\2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010c\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\"\u001a\u0004\u0018\u00010\\H\u0082 J\u0015\u0010g\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010h\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\"\u001a\u00020\u001aH\u0082 J\u0017\u0010l\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001f\u0010m\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u001aH\u0082 J\u001d\u0010u\u001a\n\u0012\u0004\u0012\u00020o\u0018\u00010n2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J%\u0010v\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020o\u0018\u00010nH\u0082 J\u001c\u0010}\u001a\u0004\u0018\u00010w2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 ¢\u0006\u0002\u0010~J%\u0010\u007f\u001a\u00020\u00122\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\"\u001a\u0004\u0018\u00010wH\u0082 ¢\u0006\u0003\u0010\u0080\u0001J\u0016\u0010\u0083\u0001\u001a\u00020U2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0085\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\t\u0010\u0089\u0001\u001a\u00020wH\u0016J\u0018\u0010\u008a\u0001\u001a\u00020\u00122\u000f\u0010\u008b\u0001\u001a\n\u0012\u0005\u0012\u00030\u008d\u00010\u008c\u0001J\u0016\u0010\u008e\u0001\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u008f\u0001\u001a\u00020U2\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u0001H\u0096\u0002J\u001c\u0010\u0092\u0001\u001a\u00020U2\u0007\u0010\u0093\u0001\u001a\u00020\u00002\u0007\u0010\u0094\u0001\u001a\u00020\u0000H\u0082 J\u0016\u0010\u0096\u0001\u001a\u00020U2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0098\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0012\u0010\u009f\u0001\u001a\u00020U2\t\u0010 \u0001\u001a\u0004\u0018\u00010\u0015J!\u0010¡\u0001\u001a\u00020U2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\t\u0010¢\u0001\u001a\u0004\u0018\u00010\u0015H\u0082 J\u0016\u0010¥\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010¨\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010ª\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010¯\u0001\u001a\u0005\u0018\u00010¬\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010²\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010µ\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010¸\u0001\u001a\u0004\u0018\u00010\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010½\u0001\u001a\u00030º\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010Â\u0001\u001a\u00030¿\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010Å\u0001\u001a\u00030º\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0010\u0010Æ\u0001\u001a\u00020\u00152\u0007\u0010Ç\u0001\u001a\u00020\u0015J\u001f\u0010È\u0001\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010Ç\u0001\u001a\u00020\u0015H\u0082 J\u0016\u0010Ì\u0001\u001a\u00020w2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010Î\u0001\u001a\u00020U2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0010\u0010Ï\u0001\u001a\u00020U2\u0007\u0010Ð\u0001\u001a\u00020\u0000J\u001f\u0010Ñ\u0001\u001a\u00020U2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010\u0090\u0001\u001a\u00020\u0000H\u0082 J\u0016\u0010Ô\u0001\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010×\u0001\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010Ú\u0001\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010Ý\u0001\u001a\u00030¿\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010ß\u0001\u001a\u00020U2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010á\u0001\u001a\u00020U2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010ä\u0001\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010ç\u0001\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010ê\u0001\u001a\u00030¿\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010í\u0001\u001a\u0004\u0018\u00010\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010ð\u0001\u001a\u00020U2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010ó\u0001\u001a\u00020U2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010ø\u0001\u001a\u0005\u0018\u00010õ\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010û\u0001\u001a\u00020U2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010ü\u0001\u001a\u00020U2\u0007\u0010ý\u0001\u001a\u00020U2\u0007\u0010þ\u0001\u001a\u00020UJ(\u0010ÿ\u0001\u001a\u00020U2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0007\u0010ý\u0001\u001a\u00020U2\u0007\u0010þ\u0001\u001a\u00020UH\u0082 J\u0018\u0010\u0082\u0002\u001a\u0004\u0018\u00010\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0014\u0010\u0083\u0002\u001a\u0005\u0018\u00010\u0084\u00022\b\u0010\u0085\u0002\u001a\u00030\u0086\u0002J#\u0010\u0087\u0002\u001a\u0005\u0018\u00010\u0084\u00022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u0088\u0002\u001a\u00030\u0086\u0002H\u0082 J\n\u0010\u0089\u0002\u001a\u0005\u0018\u00010\u0084\u0002J\u0019\u0010\u008a\u0002\u001a\u0005\u0018\u00010\u0084\u00022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u008d\u0002\u001a\u00020U2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u0090\u0002\u001a\u00020U2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0017\u0010\u0095\u0002\u001a\u00030\u0092\u00022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u0098\u0002\u001a\u00020U2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u009b\u0002\u001a\u00020U2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u009e\u0002\u001a\u00020U2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010¡\u0002\u001a\u00020U2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010¤\u0002\u001a\u00020U2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010§\u0002\u001a\u0004\u0018\u00010\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010ª\u0002\u001a\u00020U2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010\u00ad\u0002\u001a\u00020w2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010°\u0002\u001a\u00020w2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010³\u0002\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0018\u0010¶\u0002\u001a\u0004\u0018\u00010\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010¹\u0002\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010¼\u0002\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010¿\u0002\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010Â\u0002\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010Å\u0002\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010È\u0002\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0019\u0010Í\u0002\u001a\u0005\u0018\u00010Ê\u00022\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0016\u0010Î\u0002\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\u0001H\u0082 J\t\u0010Ù\u0002\u001a\u00020\u0001H\u0016J\u001a\u0010Ú\u0002\u001a\n\u0012\u0005\u0012\u00030\u0091\u00010Û\u00022\u0007\u0010Ü\u0002\u001a\u00020wH\u0016J\u001b\u0010Ý\u0002\u001a\n\u0012\u0005\u0012\u00030\u0091\u00010Û\u00022\u0007\u0010Ü\u0002\u001a\u00020wH\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010#\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR$\u0010(\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010\u001d\"\u0004\b*\u0010\u001fR$\u0010.\u001a\u00020-2\u0006\u0010\u0019\u001a\u00020-8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00106\u001a\u0002052\u0006\u0010\u0019\u001a\u0002058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R(\u0010>\u001a\u0004\u0018\u00010=2\b\u0010\u0019\u001a\u0004\u0018\u00010=8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR(\u0010E\u001a\u0004\u0018\u00010=2\b\u0010\u0019\u001a\u0004\u0018\u00010=8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010@\"\u0004\bG\u0010BR(\u0010J\u001a\u0004\u0018\u00010\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010\u0017\"\u0004\bL\u0010MR(\u0010P\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010\u001d\"\u0004\bR\u0010\u001fR$\u0010V\u001a\u00020U2\u0006\u0010\u0019\u001a\u00020U8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR(\u0010]\u001a\u0004\u0018\u00010\\2\b\u0010\u0019\u001a\u0004\u0018\u00010\\8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR$\u0010d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\be\u0010\u001d\"\u0004\bf\u0010\u001fR(\u0010i\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bj\u0010\u001d\"\u0004\bk\u0010\u001fR4\u0010p\u001a\n\u0012\u0004\u0012\u00020o\u0018\u00010n2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020o\u0018\u00010n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR(\u0010x\u001a\u0004\u0018\u00010w2\b\u0010\u0019\u001a\u0004\u0018\u00010w8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u0013\u0010\u0081\u0001\u001a\u00020U8F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010WR\u0017\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0085\u00018F¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0013\u0010\u0095\u0001\u001a\u00020U8F¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010WR\u0017\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0098\u00018F¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0015\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010\u0017R\u0013\u0010£\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010\u0017R\u0013\u0010¦\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b§\u0001\u0010\u0017R\u0013\u0010¢\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b©\u0001\u0010\u0017R\u0017\u0010«\u0001\u001a\u0005\u0018\u00010¬\u00018F¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u0013\u0010°\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b±\u0001\u0010\u0017R\u0013\u0010³\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b´\u0001\u0010\u0017R\u0015\u0010¶\u0001\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0007\u001a\u0005\b·\u0001\u0010\u0017R\u0015\u0010¹\u0001\u001a\u00030º\u00018F¢\u0006\b\u001a\u0006\b»\u0001\u0010¼\u0001R\u0015\u0010¾\u0001\u001a\u00030¿\u00018F¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u0015\u0010Ã\u0001\u001a\u00030º\u00018F¢\u0006\b\u001a\u0006\bÄ\u0001\u0010¼\u0001R\u0014\u0010É\u0001\u001a\u00020w8F¢\u0006\b\u001a\u0006\bÊ\u0001\u0010Ë\u0001R\u0013\u0010Í\u0001\u001a\u00020U8F¢\u0006\u0007\u001a\u0005\bÍ\u0001\u0010WR\u0013\u0010Ò\u0001\u001a\u00020\u001a8F¢\u0006\u0007\u001a\u0005\bÓ\u0001\u0010\u001dR\u0015\u0010Õ\u0001\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0007\u001a\u0005\bÖ\u0001\u0010\u001dR\u0013\u0010Ø\u0001\u001a\u00020\u001a8F¢\u0006\u0007\u001a\u0005\bÙ\u0001\u0010\u001dR\u0015\u0010Û\u0001\u001a\u00030¿\u00018F¢\u0006\b\u001a\u0006\bÜ\u0001\u0010Á\u0001R\u0013\u0010Þ\u0001\u001a\u00020U8F¢\u0006\u0007\u001a\u0005\bÞ\u0001\u0010WR\u0013\u0010à\u0001\u001a\u00020U8F¢\u0006\u0007\u001a\u0005\bà\u0001\u0010WR\u0013\u0010â\u0001\u001a\u00020\u001a8F¢\u0006\u0007\u001a\u0005\bã\u0001\u0010\u001dR\u0013\u0010å\u0001\u001a\u00020\u001a8F¢\u0006\u0007\u001a\u0005\bæ\u0001\u0010\u001dR\u0015\u0010è\u0001\u001a\u00030¿\u00018F¢\u0006\b\u001a\u0006\bé\u0001\u0010Á\u0001R\u0015\u0010ë\u0001\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0007\u001a\u0005\bì\u0001\u0010\u001dR\u0013\u0010î\u0001\u001a\u00020U8F¢\u0006\u0007\u001a\u0005\bï\u0001\u0010WR\u0013\u0010ñ\u0001\u001a\u00020U8F¢\u0006\u0007\u001a\u0005\bò\u0001\u0010WR\u0017\u0010ô\u0001\u001a\u0005\u0018\u00010õ\u00018F¢\u0006\b\u001a\u0006\bö\u0001\u0010÷\u0001R\u0013\u0010ù\u0001\u001a\u00020U8F¢\u0006\u0007\u001a\u0005\bú\u0001\u0010WR\u0015\u0010\u0080\u0002\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0007\u001a\u0005\b\u0081\u0002\u0010\u0017R\u0013\u0010\u008b\u0002\u001a\u00020U8F¢\u0006\u0007\u001a\u0005\b\u008c\u0002\u0010WR\u0013\u0010\u008e\u0002\u001a\u00020U8F¢\u0006\u0007\u001a\u0005\b\u008f\u0002\u0010WR\u0015\u0010\u0091\u0002\u001a\u00030\u0092\u00028F¢\u0006\b\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002R\u0013\u0010\u0096\u0002\u001a\u00020U8F¢\u0006\u0007\u001a\u0005\b\u0097\u0002\u0010WR\u0013\u0010\u0099\u0002\u001a\u00020U8F¢\u0006\u0007\u001a\u0005\b\u009a\u0002\u0010WR\u0013\u0010\u009c\u0002\u001a\u00020U8F¢\u0006\u0007\u001a\u0005\b\u009d\u0002\u0010WR\u0013\u0010\u009f\u0002\u001a\u00020U8F¢\u0006\u0007\u001a\u0005\b \u0002\u0010WR\u0013\u0010¢\u0002\u001a\u00020U8F¢\u0006\u0007\u001a\u0005\b£\u0002\u0010WR\u0015\u0010¥\u0002\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0007\u001a\u0005\b¦\u0002\u0010\u0017R\u0013\u0010¨\u0002\u001a\u00020U8F¢\u0006\u0007\u001a\u0005\b©\u0002\u0010WR\u0014\u0010«\u0002\u001a\u00020w8F¢\u0006\b\u001a\u0006\b¬\u0002\u0010Ë\u0001R\u0014\u0010®\u0002\u001a\u00020w8F¢\u0006\b\u001a\u0006\b¯\u0002\u0010Ë\u0001R\u0013\u0010±\u0002\u001a\u00020\u001a8F¢\u0006\u0007\u001a\u0005\b²\u0002\u0010\u001dR\u0015\u0010´\u0002\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0007\u001a\u0005\bµ\u0002\u0010\u0017R\u0013\u0010·\u0002\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b¸\u0002\u0010\u0017R\u0013\u0010º\u0002\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b»\u0002\u0010\u0017R\u0013\u0010½\u0002\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b¾\u0002\u0010\u0017R\u0013\u0010À\u0002\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\bÁ\u0002\u0010\u0017R\u0013\u0010Ã\u0002\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\bÄ\u0002\u0010\u0017R\u0013\u0010Æ\u0002\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\bÇ\u0002\u0010\u0017R\u0017\u0010É\u0002\u001a\u0005\u0018\u00010Ê\u00028F¢\u0006\b\u001a\u0006\bË\u0002\u0010Ì\u0002R/\u0010Ï\u0002\u001a\u0012\u0012\u0005\u0012\u00030\u0091\u0001\u0012\u0004\u0012\u00020\u0012\u0018\u00010Ð\u0002X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÑ\u0002\u0010Ò\u0002\"\u0006\bÓ\u0002\u0010Ô\u0002R\u001f\u0010Õ\u0002\u001a\u00020wX\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÖ\u0002\u0010Ë\u0001\"\u0006\b×\u0002\u0010Ø\u0002R\u000f\u0010Þ\u0002\u001a\u00020UX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006ã\u0002"}, d2 = {"Lcom/polymarket/data/EUserPosition;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "getId", "()Ljava/lang/String;", "Swift_id", "newValue", "Lcom/polymarket/data/EAmount;", "cost", "getCost", "()Lcom/polymarket/data/EAmount;", "setCost", "(Lcom/polymarket/data/EAmount;)V", "Swift_cost", "Swift_cost_set", "value", "baseCost", "getBaseCost", "setBaseCost", "Swift_baseCost", "Swift_baseCost_set", "cashValue", "getCashValue", "setCashValue", "Swift_cashValue", "Swift_cashValue_set", "Lcom/polymarket/data/EMarketMetadata;", "marketMetadata", "getMarketMetadata", "()Lcom/polymarket/data/EMarketMetadata;", "setMarketMetadata", "(Lcom/polymarket/data/EMarketMetadata;)V", "Swift_marketMetadata", "Swift_marketMetadata_set", "Lcom/polymarket/data/EUserPosition$MarketContext;", "marketContext", "getMarketContext", "()Lcom/polymarket/data/EUserPosition$MarketContext;", "setMarketContext", "(Lcom/polymarket/data/EUserPosition$MarketContext;)V", "Swift_marketContext", "Swift_marketContext_set", "Ljava/util/Date;", "updateTime", "getUpdateTime", "()Ljava/util/Date;", "setUpdateTime", "(Ljava/util/Date;)V", "Swift_updateTime", "Swift_updateTime_set", "firstPurchasedAt", "getFirstPurchasedAt", "setFirstPurchasedAt", "Swift_firstPurchasedAt", "Swift_firstPurchasedAt_set", "positionId", "getPositionId", "setPositionId", "(Ljava/lang/String;)V", "Swift_positionId", "Swift_positionId_set", "realizedPnl", "getRealizedPnl", "setRealizedPnl", "Swift_realizedPnl", "Swift_realizedPnl_set", "", "isClosed", "()Z", "setClosed", "(Z)V", "Swift_isClosed", "Swift_isClosed_set", "Lcom/polymarket/data/EEvent;", "event", "getEvent", "()Lcom/polymarket/data/EEvent;", "setEvent", "(Lcom/polymarket/data/EEvent;)V", "Swift_event", "Swift_event_set", "costPerShare", "getCostPerShare", "setCostPerShare", "Swift_costPerShare", "Swift_costPerShare_set", "fees", "getFees", "setFees", "Swift_fees", "Swift_fees_set", "", "Lcom/polymarket/data/EComboLegDetail;", "comboLegs", "getComboLegs", "()Ljava/util/List;", "setComboLegs", "(Ljava/util/List;)V", "Swift_comboLegs", "Swift_comboLegs_set", "", "comboLegCount", "getComboLegCount", "()Ljava/lang/Integer;", "setComboLegCount", "(Ljava/lang/Integer;)V", "Swift_comboLegCount", "(J)Ljava/lang/Integer;", "Swift_comboLegCount_set", "(JLjava/lang/Integer;)V", "hasKnownValue", "getHasKnownValue", "Swift_hasKnownValue", "resolutionPhase", "Lcom/polymarket/data/EMarket$ResolutionPhase;", "getResolutionPhase", "()Lcom/polymarket/data/EMarket$ResolutionPhase;", "Swift_resolutionPhase", "hashCode", "hash", "into", "Lskip/lib/InOut;", "Lskip/lib/Hasher;", "Swift_hashvalue", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "isCombo", "Swift_isCombo", "resolvedSportSlug", "Lcom/polymarket/data/ESportsSlug;", "getResolvedSportSlug", "()Lcom/polymarket/data/ESportsSlug;", "Swift_resolvedSportSlug", "categoryTitle", "getCategoryTitle", "Swift_categoryTitle", "belongs", "toEventSlug", "Swift_belongs_0", "eventSlug", "outcome", "getOutcome", "Swift_outcome", "slug", "getSlug", "Swift_slug", "getEventSlug", "Swift_eventSlug", "team", "Lcom/polymarket/data/ESportsTeam;", "getTeam", "()Lcom/polymarket/data/ESportsTeam;", "Swift_team", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "Swift_title", "pickHeadline", "getPickHeadline", "Swift_pickHeadline", "playerPropStatement", "getPlayerPropStatement", "Swift_playerPropStatement", "displayContext", "Lcom/polymarket/data/EMarket$MarketSide$DisplayContext;", "getDisplayContext", "()Lcom/polymarket/data/EMarket$MarketSide$DisplayContext;", "Swift_displayContext", "marketColor", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "getMarketColor", "()Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "Swift_marketColor", "presentation", "getPresentation", "Swift_presentation", "totalsSideAdjusted", "description", "Swift_totalsSideAdjusted_1", "outcomeIndex", "getOutcomeIndex", "()I", "Swift_outcomeIndex", "isLong", "Swift_isLong", "hasSameHolding", "as_", "Swift_hasSameHolding_3", "totalCost", "getTotalCost", "Swift_totalCost", "currentPricePerShare", "getCurrentPricePerShare", "Swift_currentPricePerShare", "currentValue", "getCurrentValue", "Swift_currentValue", "currentValueColor", "getCurrentValueColor", "Swift_currentValueColor", "isValueReliable", "Swift_isValueReliable", "isLiquidityConstrained", "Swift_isLiquidityConstrained", "potentialPayout", "getPotentialPayout", "Swift_potentialPayout", "profitLoss", "getProfitLoss", "Swift_profitLoss", "pnlColor", "getPnlColor", "Swift_pnlColor", "buyPrice", "getBuyPrice", "Swift_buyPrice", "canBuyMore", "getCanBuyMore", "Swift_canBuyMore", "canBuy", "getCanBuy", "Swift_canBuy", "settledOutcome", "Lcom/polymarket/data/EUserPosition$SettledOutcome;", "getSettledOutcome", "()Lcom/polymarket/data/EUserPosition$SettledOutcome;", "Swift_settledOutcome", "canCashOut", "getCanCashOut", "Swift_canCashOut", "isResolutionPending", "marketResolutionUXEnabled", "combosEnabled", "Swift_isResolutionPending_4", "cashOutMultiplierText", "getCashOutMultiplierText", "Swift_cashOutMultiplierText", "marketSide", "Lcom/polymarket/data/EMarket$MarketSide;", "in_", "Lcom/polymarket/data/EMarket;", "Swift_marketSide_5", "market", "findMarketSideFromEvent", "Swift_findMarketSideFromEvent_6", "comboIsLive", "getComboIsLive", "Swift_comboIsLive", "comboIsShort", "getComboIsShort", "Swift_comboIsShort", "comboOutcomeSide", "Lcom/polymarket/data/EComboOutcomeSide;", "getComboOutcomeSide", "()Lcom/polymarket/data/EComboOutcomeSide;", "Swift_comboOutcomeSide", "comboHasLostLeg", "getComboHasLostLeg", "Swift_comboHasLostLeg", "comboIsResolved", "getComboIsResolved", "Swift_comboIsResolved", "comboIsLost", "getComboIsLost", "Swift_comboIsLost", "comboIsWon", "getComboIsWon", "Swift_comboIsWon", "comboIsActionEnabled", "getComboIsActionEnabled", "Swift_comboIsActionEnabled", "comboId", "getComboId", "Swift_comboId", "comboIsJoinable", "getComboIsJoinable", "Swift_comboIsJoinable", "comboWonCount", "getComboWonCount", "Swift_comboWonCount", "comboTotalCount", "getComboTotalCount", "Swift_comboTotalCount", "comboPayout", "getComboPayout", "Swift_comboPayout", "comboStartDateText", "getComboStartDateText", "Swift_comboStartDateText", "comboValueText", "getComboValueText", "Swift_comboValueText", "comboCostText", "getComboCostText", "Swift_comboCostText", "comboPayoutText", "getComboPayoutText", "Swift_comboPayoutText", "comboPotentialPayoutText", "getComboPotentialPayoutText", "Swift_comboPotentialPayoutText", "comboMultiplierText", "getComboMultiplierText", "Swift_comboMultiplierText", "comboPotentialMultiplierText", "getComboPotentialMultiplierText", "Swift_comboPotentialMultiplierText", "comboPotentialMultiplier", "Lcom/polymarket/data/EQuantity;", "getComboPotentialMultiplier", "()Lcom/polymarket/data/EQuantity;", "Swift_comboPotentialMultiplier", "Swift_constructor_10", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "suppresssideeffects", "MarketContext", "LiquidityState", "SettledOutcome", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EUserPosition implements MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;
    private boolean suppresssideeffects;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/polymarket/data/EUserPosition$SettledOutcome;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "won", "lost", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SettledOutcome implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ SettledOutcome[] $VALUES;
        public static final SettledOutcome won = new SettledOutcome("won", 0);
        public static final SettledOutcome lost = new SettledOutcome("lost", 1);

        private static final /* synthetic */ SettledOutcome[] $values() {
            return new SettledOutcome[]{won, lost};
        }

        static {
            SettledOutcome[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private SettledOutcome(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static SettledOutcome valueOf(String str) {
            return (SettledOutcome) Enum.valueOf(SettledOutcome.class, str);
        }

        public static SettledOutcome[] values() {
            return (SettledOutcome[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    private EUserPosition(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.suppresssideeffects = true;
        try {
            this.Swift_peer = Swift_constructor_10(mutableStruct);
        } finally {
            this.suppresssideeffects = false;
        }
    }

    private final native EAmount Swift_baseCost(long Swift_peer);

    private final native void Swift_baseCost_set(long Swift_peer, EAmount value);

    private final native boolean Swift_belongs_0(long Swift_peer, String eventSlug);

    private final native EAmount Swift_buyPrice(long Swift_peer);

    private final native boolean Swift_canBuy(long Swift_peer);

    private final native boolean Swift_canBuyMore(long Swift_peer);

    private final native boolean Swift_canCashOut(long Swift_peer);

    private final native String Swift_cashOutMultiplierText(long Swift_peer);

    private final native EAmount Swift_cashValue(long Swift_peer);

    private final native void Swift_cashValue_set(long Swift_peer, EAmount value);

    private final native String Swift_categoryTitle(long Swift_peer);

    private final native String Swift_comboCostText(long Swift_peer);

    private final native boolean Swift_comboHasLostLeg(long Swift_peer);

    private final native String Swift_comboId(long Swift_peer);

    private final native boolean Swift_comboIsActionEnabled(long Swift_peer);

    private final native boolean Swift_comboIsJoinable(long Swift_peer);

    private final native boolean Swift_comboIsLive(long Swift_peer);

    private final native boolean Swift_comboIsLost(long Swift_peer);

    private final native boolean Swift_comboIsResolved(long Swift_peer);

    private final native boolean Swift_comboIsShort(long Swift_peer);

    private final native boolean Swift_comboIsWon(long Swift_peer);

    private final native Integer Swift_comboLegCount(long Swift_peer);

    private final native void Swift_comboLegCount_set(long Swift_peer, Integer value);

    private final native List<EComboLegDetail> Swift_comboLegs(long Swift_peer);

    private final native void Swift_comboLegs_set(long Swift_peer, List<EComboLegDetail> value);

    private final native String Swift_comboMultiplierText(long Swift_peer);

    private final native EComboOutcomeSide Swift_comboOutcomeSide(long Swift_peer);

    private final native EAmount Swift_comboPayout(long Swift_peer);

    private final native String Swift_comboPayoutText(long Swift_peer);

    private final native EQuantity Swift_comboPotentialMultiplier(long Swift_peer);

    private final native String Swift_comboPotentialMultiplierText(long Swift_peer);

    private final native String Swift_comboPotentialPayoutText(long Swift_peer);

    private final native String Swift_comboStartDateText(long Swift_peer);

    private final native int Swift_comboTotalCount(long Swift_peer);

    private final native String Swift_comboValueText(long Swift_peer);

    private final native int Swift_comboWonCount(long Swift_peer);

    private final native long Swift_constructor_10(MutableStruct copy);

    private final native EAmount Swift_cost(long Swift_peer);

    private final native EAmount Swift_costPerShare(long Swift_peer);

    private final native void Swift_costPerShare_set(long Swift_peer, EAmount value);

    private final native void Swift_cost_set(long Swift_peer, EAmount value);

    private final native EAmount Swift_currentPricePerShare(long Swift_peer);

    private final native EAmount Swift_currentValue(long Swift_peer);

    private final native DesignTokens.PaletteColor Swift_currentValueColor(long Swift_peer);

    private final native EMarket.MarketSide.DisplayContext Swift_displayContext(long Swift_peer);

    private final native EEvent Swift_event(long Swift_peer);

    private final native String Swift_eventSlug(long Swift_peer);

    private final native void Swift_event_set(long Swift_peer, EEvent value);

    private final native EAmount Swift_fees(long Swift_peer);

    private final native void Swift_fees_set(long Swift_peer, EAmount value);

    private final native EMarket.MarketSide Swift_findMarketSideFromEvent_6(long Swift_peer);

    private final native Date Swift_firstPurchasedAt(long Swift_peer);

    private final native void Swift_firstPurchasedAt_set(long Swift_peer, Date value);

    private final native boolean Swift_hasKnownValue(long Swift_peer);

    private final native boolean Swift_hasSameHolding_3(long Swift_peer, EUserPosition other);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native boolean Swift_isClosed(long Swift_peer);

    private final native void Swift_isClosed_set(long Swift_peer, boolean value);

    private final native boolean Swift_isCombo(long Swift_peer);

    private final native boolean Swift_isLiquidityConstrained(long Swift_peer);

    private final native boolean Swift_isLong(long Swift_peer);

    private final native boolean Swift_isResolutionPending_4(long Swift_peer, boolean marketResolutionUXEnabled, boolean combosEnabled);

    private final native boolean Swift_isValueReliable(long Swift_peer);

    private final native boolean Swift_isequal(EUserPosition lhs, EUserPosition rhs);

    private final native DesignTokens.PaletteColor Swift_marketColor(long Swift_peer);

    private final native MarketContext Swift_marketContext(long Swift_peer);

    private final native void Swift_marketContext_set(long Swift_peer, MarketContext value);

    private final native EMarketMetadata Swift_marketMetadata(long Swift_peer);

    private final native void Swift_marketMetadata_set(long Swift_peer, EMarketMetadata value);

    private final native EMarket.MarketSide Swift_marketSide_5(long Swift_peer, EMarket market);

    private final native String Swift_outcome(long Swift_peer);

    private final native int Swift_outcomeIndex(long Swift_peer);

    private final native String Swift_pickHeadline(long Swift_peer);

    private final native String Swift_playerPropStatement(long Swift_peer);

    private final native DesignTokens.PaletteColor Swift_pnlColor(long Swift_peer);

    private final native String Swift_positionId(long Swift_peer);

    private final native void Swift_positionId_set(long Swift_peer, String value);

    private final native EAmount Swift_potentialPayout(long Swift_peer);

    private final native EMarket.MarketSide.DisplayContext Swift_presentation(long Swift_peer);

    private final native EAmount Swift_profitLoss(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native EAmount Swift_realizedPnl(long Swift_peer);

    private final native void Swift_realizedPnl_set(long Swift_peer, EAmount value);

    private final native void Swift_release(long Swift_peer);

    private final native EMarket.ResolutionPhase Swift_resolutionPhase(long Swift_peer);

    private final native ESportsSlug Swift_resolvedSportSlug(long Swift_peer);

    private final native SettledOutcome Swift_settledOutcome(long Swift_peer);

    private final native String Swift_slug(long Swift_peer);

    private final native ESportsTeam Swift_team(long Swift_peer);

    private final native String Swift_title(long Swift_peer);

    private final native EAmount Swift_totalCost(long Swift_peer);

    private final native String Swift_totalsSideAdjusted_1(long Swift_peer, String description);

    private final native Date Swift_updateTime(long Swift_peer);

    private final native void Swift_updateTime_set(long Swift_peer, Date value);

    public static /* synthetic */ Hasher a(Ref.ObjectRef objectRef) {
        return hashCode$lambda$0(objectRef);
    }

    public static /* synthetic */ Unit b(Ref.ObjectRef objectRef, Hasher hasher) {
        return hashCode$lambda$1(objectRef, hasher);
    }

    private static final Hasher hashCode$lambda$0(Ref.ObjectRef objectRef) {
        return (Hasher) objectRef.a;
    }

    private static final Unit hashCode$lambda$1(Ref.ObjectRef objectRef, Hasher hasher) {
        hasher.getClass();
        objectRef.a = hasher;
        return Unit.INSTANCE;
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

    public final boolean belongs(String toEventSlug) {
        return Swift_belongs_0(this.Swift_peer, toEventSlug);
    }

    @Override // skip.lib.MutableStruct
    public void didmutate() {
        super.didmutate();
    }

    public boolean equals(Object other) {
        if (!(other instanceof EUserPosition)) {
            return false;
        }
        return Swift_isequal(this, (EUserPosition) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final EMarket.MarketSide findMarketSideFromEvent() {
        return Swift_findMarketSideFromEvent_6(this.Swift_peer);
    }

    public final EAmount getBaseCost() {
        return Swift_baseCost(this.Swift_peer);
    }

    public final EAmount getBuyPrice() {
        return Swift_buyPrice(this.Swift_peer);
    }

    public final boolean getCanBuy() {
        return Swift_canBuy(this.Swift_peer);
    }

    public final boolean getCanBuyMore() {
        return Swift_canBuyMore(this.Swift_peer);
    }

    public final boolean getCanCashOut() {
        return Swift_canCashOut(this.Swift_peer);
    }

    public final String getCashOutMultiplierText() {
        return Swift_cashOutMultiplierText(this.Swift_peer);
    }

    public final EAmount getCashValue() {
        return Swift_cashValue(this.Swift_peer);
    }

    public final String getCategoryTitle() {
        return Swift_categoryTitle(this.Swift_peer);
    }

    public final String getComboCostText() {
        return Swift_comboCostText(this.Swift_peer);
    }

    public final boolean getComboHasLostLeg() {
        return Swift_comboHasLostLeg(this.Swift_peer);
    }

    public final String getComboId() {
        return Swift_comboId(this.Swift_peer);
    }

    public final boolean getComboIsActionEnabled() {
        return Swift_comboIsActionEnabled(this.Swift_peer);
    }

    public final boolean getComboIsJoinable() {
        return Swift_comboIsJoinable(this.Swift_peer);
    }

    public final boolean getComboIsLive() {
        return Swift_comboIsLive(this.Swift_peer);
    }

    public final boolean getComboIsLost() {
        return Swift_comboIsLost(this.Swift_peer);
    }

    public final boolean getComboIsResolved() {
        return Swift_comboIsResolved(this.Swift_peer);
    }

    public final boolean getComboIsShort() {
        return Swift_comboIsShort(this.Swift_peer);
    }

    public final boolean getComboIsWon() {
        return Swift_comboIsWon(this.Swift_peer);
    }

    public final Integer getComboLegCount() {
        return Swift_comboLegCount(this.Swift_peer);
    }

    public final List<EComboLegDetail> getComboLegs() {
        return Swift_comboLegs(this.Swift_peer);
    }

    public final String getComboMultiplierText() {
        return Swift_comboMultiplierText(this.Swift_peer);
    }

    public final EComboOutcomeSide getComboOutcomeSide() {
        return Swift_comboOutcomeSide(this.Swift_peer);
    }

    public final EAmount getComboPayout() {
        return Swift_comboPayout(this.Swift_peer);
    }

    public final String getComboPayoutText() {
        return Swift_comboPayoutText(this.Swift_peer);
    }

    public final EQuantity getComboPotentialMultiplier() {
        return Swift_comboPotentialMultiplier(this.Swift_peer);
    }

    public final String getComboPotentialMultiplierText() {
        return Swift_comboPotentialMultiplierText(this.Swift_peer);
    }

    public final String getComboPotentialPayoutText() {
        return Swift_comboPotentialPayoutText(this.Swift_peer);
    }

    public final String getComboStartDateText() {
        return Swift_comboStartDateText(this.Swift_peer);
    }

    public final int getComboTotalCount() {
        return Swift_comboTotalCount(this.Swift_peer);
    }

    public final String getComboValueText() {
        return Swift_comboValueText(this.Swift_peer);
    }

    public final int getComboWonCount() {
        return Swift_comboWonCount(this.Swift_peer);
    }

    public final EAmount getCost() {
        return Swift_cost(this.Swift_peer);
    }

    public final EAmount getCostPerShare() {
        return Swift_costPerShare(this.Swift_peer);
    }

    public final EAmount getCurrentPricePerShare() {
        return Swift_currentPricePerShare(this.Swift_peer);
    }

    public final EAmount getCurrentValue() {
        return Swift_currentValue(this.Swift_peer);
    }

    public final DesignTokens.PaletteColor getCurrentValueColor() {
        return Swift_currentValueColor(this.Swift_peer);
    }

    public final EMarket.MarketSide.DisplayContext getDisplayContext() {
        return Swift_displayContext(this.Swift_peer);
    }

    public final EEvent getEvent() {
        return Swift_event(this.Swift_peer);
    }

    public final String getEventSlug() {
        return Swift_eventSlug(this.Swift_peer);
    }

    public final EAmount getFees() {
        return Swift_fees(this.Swift_peer);
    }

    public final Date getFirstPurchasedAt() {
        return Swift_firstPurchasedAt(this.Swift_peer);
    }

    public final boolean getHasKnownValue() {
        return Swift_hasKnownValue(this.Swift_peer);
    }

    public final String getId() {
        return Swift_id(this.Swift_peer);
    }

    public final DesignTokens.PaletteColor getMarketColor() {
        return Swift_marketColor(this.Swift_peer);
    }

    public final MarketContext getMarketContext() {
        return Swift_marketContext(this.Swift_peer);
    }

    public final EMarketMetadata getMarketMetadata() {
        return Swift_marketMetadata(this.Swift_peer);
    }

    public final String getOutcome() {
        return Swift_outcome(this.Swift_peer);
    }

    public final int getOutcomeIndex() {
        return Swift_outcomeIndex(this.Swift_peer);
    }

    public final String getPickHeadline() {
        return Swift_pickHeadline(this.Swift_peer);
    }

    public final String getPlayerPropStatement() {
        return Swift_playerPropStatement(this.Swift_peer);
    }

    public final DesignTokens.PaletteColor getPnlColor() {
        return Swift_pnlColor(this.Swift_peer);
    }

    public final String getPositionId() {
        return Swift_positionId(this.Swift_peer);
    }

    public final EAmount getPotentialPayout() {
        return Swift_potentialPayout(this.Swift_peer);
    }

    public final EMarket.MarketSide.DisplayContext getPresentation() {
        return Swift_presentation(this.Swift_peer);
    }

    public final EAmount getProfitLoss() {
        return Swift_profitLoss(this.Swift_peer);
    }

    public final EAmount getRealizedPnl() {
        return Swift_realizedPnl(this.Swift_peer);
    }

    public final EMarket.ResolutionPhase getResolutionPhase() {
        return Swift_resolutionPhase(this.Swift_peer);
    }

    public final ESportsSlug getResolvedSportSlug() {
        return Swift_resolvedSportSlug(this.Swift_peer);
    }

    public final SettledOutcome getSettledOutcome() {
        return Swift_settledOutcome(this.Swift_peer);
    }

    public final String getSlug() {
        return Swift_slug(this.Swift_peer);
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

    public final String getTitle() {
        return Swift_title(this.Swift_peer);
    }

    public final EAmount getTotalCost() {
        return Swift_totalCost(this.Swift_peer);
    }

    public final Date getUpdateTime() {
        return Swift_updateTime(this.Swift_peer);
    }

    public final boolean hasSameHolding(EUserPosition as_) {
        as_.getClass();
        return Swift_hasSameHolding_3(this.Swift_peer, as_);
    }

    public final void hash(InOut<Hasher> into) {
        into.getClass();
        into.getValue().combine(Long.valueOf(Swift_hashvalue(this.Swift_peer)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    public int hashCode() {
        ?? obj = new Object();
        obj.a = new Hasher();
        hash(new InOut<>(new pc0(obj, 16), new qc0(obj, 13)));
        return ((Hasher) obj.a).getResult();
    }

    public final boolean isClosed() {
        return Swift_isClosed(this.Swift_peer);
    }

    public final boolean isCombo() {
        return Swift_isCombo(this.Swift_peer);
    }

    public final boolean isLiquidityConstrained() {
        return Swift_isLiquidityConstrained(this.Swift_peer);
    }

    public final boolean isLong() {
        return Swift_isLong(this.Swift_peer);
    }

    public final boolean isResolutionPending(boolean marketResolutionUXEnabled, boolean combosEnabled) {
        return Swift_isResolutionPending_4(this.Swift_peer, marketResolutionUXEnabled, combosEnabled);
    }

    public final boolean isValueReliable() {
        return Swift_isValueReliable(this.Swift_peer);
    }

    public final EMarket.MarketSide marketSide(EMarket in_) {
        in_.getClass();
        return Swift_marketSide_5(this.Swift_peer, in_);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new EUserPosition(this);
    }

    public final void setBaseCost(EAmount eAmount) {
        eAmount.getClass();
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_baseCost_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    public final void setCashValue(EAmount eAmount) {
        eAmount.getClass();
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_cashValue_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    public final void setClosed(boolean z) {
        willmutate();
        try {
            Swift_isClosed_set(this.Swift_peer, z);
        } finally {
            didmutate();
        }
    }

    public final void setComboLegCount(Integer num) {
        willmutate();
        try {
            Swift_comboLegCount_set(this.Swift_peer, num);
        } finally {
            didmutate();
        }
    }

    public final void setComboLegs(List<EComboLegDetail> list) {
        List<EComboLegDetail> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_comboLegs_set(this.Swift_peer, list2);
        } finally {
            didmutate();
        }
    }

    public final void setCost(EAmount eAmount) {
        eAmount.getClass();
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_cost_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    public final void setCostPerShare(EAmount eAmount) {
        eAmount.getClass();
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_costPerShare_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    public final void setEvent(EEvent eEvent) {
        Swift_event_set(this.Swift_peer, (EEvent) StructKt.sref$default(eEvent, null, 1, null));
    }

    public final void setFees(EAmount eAmount) {
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_fees_set(this.Swift_peer, eAmount2);
        } finally {
            didmutate();
        }
    }

    public final void setFirstPurchasedAt(Date date) {
        Date date2 = (Date) StructKt.sref$default(date, null, 1, null);
        willmutate();
        try {
            Swift_firstPurchasedAt_set(this.Swift_peer, date2);
        } finally {
            didmutate();
        }
    }

    public final void setMarketContext(MarketContext marketContext) {
        marketContext.getClass();
        willmutate();
        try {
            Swift_marketContext_set(this.Swift_peer, marketContext);
        } finally {
            didmutate();
        }
    }

    public final void setMarketMetadata(EMarketMetadata eMarketMetadata) {
        eMarketMetadata.getClass();
        EMarketMetadata eMarketMetadata2 = (EMarketMetadata) StructKt.sref$default(eMarketMetadata, null, 1, null);
        willmutate();
        try {
            Swift_marketMetadata_set(this.Swift_peer, eMarketMetadata2);
        } finally {
            didmutate();
        }
    }

    public final void setPositionId(String str) {
        willmutate();
        try {
            Swift_positionId_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setRealizedPnl(EAmount eAmount) {
        EAmount eAmount2 = (EAmount) StructKt.sref$default(eAmount, null, 1, null);
        willmutate();
        try {
            Swift_realizedPnl_set(this.Swift_peer, eAmount2);
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

    public final void setUpdateTime(Date date) {
        Date date2 = (Date) StructKt.sref$default(date, null, 1, null);
        willmutate();
        try {
            Swift_updateTime_set(this.Swift_peer, date2);
        } finally {
            didmutate();
        }
    }

    public final String totalsSideAdjusted(String description) {
        description.getClass();
        return Swift_totalsSideAdjusted_1(this.Swift_peer, description);
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0016B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0017"}, d2 = {"Lcom/polymarket/data/EUserPosition$LiquidityState;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "unknown", "full", "partial", "empty", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class LiquidityState implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ LiquidityState[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final LiquidityState unknown = new LiquidityState("unknown", 0, "unknown", null, 2, null);
        public static final LiquidityState full = new LiquidityState("full", 1, "full", null, 2, null);
        public static final LiquidityState partial = new LiquidityState("partial", 2, "partial", null, 2, null);
        public static final LiquidityState empty = new LiquidityState("empty", 3, "empty", null, 2, null);

        private static final /* synthetic */ LiquidityState[] $values() {
            return new LiquidityState[]{unknown, full, partial, empty};
        }

        static {
            LiquidityState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ LiquidityState(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static LiquidityState valueOf(String str) {
            return (LiquidityState) Enum.valueOf(LiquidityState.class, str);
        }

        public static LiquidityState[] values() {
            return (LiquidityState[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/data/EUserPosition$LiquidityState$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/data/EUserPosition$LiquidityState;", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final LiquidityState init(String rawValue) {
                rawValue.getClass();
                switch (rawValue.hashCode()) {
                    case -792934015:
                        if (!rawValue.equals("partial")) {
                            return null;
                        }
                        return LiquidityState.partial;
                    case -284840886:
                        if (rawValue.equals("unknown")) {
                            return LiquidityState.unknown;
                        }
                        return null;
                    case 3154575:
                        if (rawValue.equals("full")) {
                            return LiquidityState.full;
                        }
                        return null;
                    case 96634189:
                        if (rawValue.equals("empty")) {
                            return LiquidityState.empty;
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

        private LiquidityState(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J!\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0082 J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0011\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0082 J\u0006\u0010\u0010\u001a\u00020\fJ\t\u0010\u0011\u001a\u00020\fH\u0082 J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0082 J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0018\u001a\u00020\u0005¨\u0006\u0019"}, d2 = {"Lcom/polymarket/data/EUserPosition$Companion;", "", "<init>", "()V", "positionId", "", "userId", "isLong", "", "marketSlug", "Swift_Companion_positionId_2", "mockWithLiquidityState", "Lcom/polymarket/data/EUserPosition;", "state", "Lcom/polymarket/data/EUserPosition$LiquidityState;", "Swift_Companion_mockWithLiquidityState_7", "mockChatCombo", "Swift_Companion_mockChatCombo_8", "mockMultiple", "", "count", "", "Swift_Companion_mockMultiple_9", "LiquidityState", "rawValue", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native EUserPosition Swift_Companion_mockChatCombo_8();

        private final native List<EUserPosition> Swift_Companion_mockMultiple_9(int count);

        private final native EUserPosition Swift_Companion_mockWithLiquidityState_7(LiquidityState state);

        private final native String Swift_Companion_positionId_2(String userId, boolean isLong, String marketSlug);

        public static /* synthetic */ List mockMultiple$default(Companion companion, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 5;
            }
            return companion.mockMultiple(i);
        }

        public final LiquidityState LiquidityState(String rawValue) {
            rawValue.getClass();
            return LiquidityState.INSTANCE.init(rawValue);
        }

        public final EUserPosition mockChatCombo() {
            return Swift_Companion_mockChatCombo_8();
        }

        public final List<EUserPosition> mockMultiple(int count) {
            return Swift_Companion_mockMultiple_9(count);
        }

        public final EUserPosition mockWithLiquidityState(LiquidityState state) {
            state.getClass();
            return Swift_Companion_mockWithLiquidityState_7(state);
        }

        public final String positionId(String userId, boolean isLong, String marketSlug) {
            userId.getClass();
            marketSlug.getClass();
            return Swift_Companion_positionId_2(userId, isLong, marketSlug);
        }

        private Companion() {
        }
    }

    public EUserPosition(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        try {
            this.Swift_peer = j;
        } finally {
            this.suppresssideeffects = false;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0001QB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBw\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\b\u0010\u001aJ\u0006\u0010\u001f\u001a\u00020 J\u0015\u0010!\u001a\u00020 2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\u0015\u0010*\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010-\u001a\u0004\u0018\u00010\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00100\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00103\u001a\u0004\u0018\u00010\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00106\u001a\u0004\u0018\u00010\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00108\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010:\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010<\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010>\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010A\u001a\u0004\u0018\u00010\u00192\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010D\u001a\u00020#2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010F\u001a\u00020#2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010K\u001a\u00020H2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 Jk\u0010L\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0082 J\u0016\u0010M\u001a\b\u0012\u0004\u0012\u00020%0N2\u0006\u0010O\u001a\u00020'H\u0016J\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020%0N2\u0006\u0010O\u001a\u00020'H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\u0014\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b7\u0010)R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b9\u0010)R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b;\u0010)R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b=\u0010)R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0011\u0010B\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0011\u0010E\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bE\u0010CR\u0011\u0010G\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006R"}, d2 = {"Lcom/polymarket/data/EUserPosition$MarketContext;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "eventTitle", "", "eventImageURL", "Ljava/net/URI;", "marketType", "Lcom/polymarket/data/APIMarketType;", "team", "Lcom/polymarket/data/ESportsTeam;", "marketSideType", "Lcom/polymarket/data/EMarket$MarketSide$MarketSideType;", "marketSideTitle", "marketTitle", "lineDescription", "leagueTitle", "marketStatus", "Lcom/polymarket/data/APIMarketStatus;", "(Ljava/lang/String;Ljava/net/URI;Lcom/polymarket/data/APIMarketType;Lcom/polymarket/data/ESportsTeam;Lcom/polymarket/data/EMarket$MarketSide$MarketSideType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/APIMarketStatus;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getEventTitle", "()Ljava/lang/String;", "Swift_eventTitle", "getEventImageURL", "()Ljava/net/URI;", "Swift_eventImageURL", "getMarketType", "()Lcom/polymarket/data/APIMarketType;", "Swift_marketType", "getTeam", "()Lcom/polymarket/data/ESportsTeam;", "Swift_team", "getMarketSideType", "()Lcom/polymarket/data/EMarket$MarketSide$MarketSideType;", "Swift_marketSideType", "getMarketSideTitle", "Swift_marketSideTitle", "getMarketTitle", "Swift_marketTitle", "getLineDescription", "Swift_lineDescription", "getLeagueTitle", "Swift_leagueTitle", "getMarketStatus", "()Lcom/polymarket/data/APIMarketStatus;", "Swift_marketStatus", "isDrawableOutcome", "()Z", "Swift_isDrawableOutcome", "isDraw", "Swift_isDraw", "accentColor", "Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "getAccentColor", "()Lcom/polymarket/designtokens/DesignTokens$SemanticColor;", "Swift_accentColor", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MarketContext implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ MarketContext(String str, URI uri, APIMarketType aPIMarketType, ESportsTeam eSportsTeam, EMarket.MarketSide.MarketSideType marketSideType, String str2, String str3, String str4, String str5, APIMarketStatus aPIMarketStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : uri, aPIMarketType, (i & 8) != 0 ? null : eSportsTeam, (i & 16) != 0 ? null : marketSideType, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & Barcode.FORMAT_UPC_A) != 0 ? null : aPIMarketStatus);
        }

        private final native DesignTokens.SemanticColor Swift_accentColor(long Swift_peer);

        private final native long Swift_constructor_0(String eventTitle, URI eventImageURL, APIMarketType marketType, ESportsTeam team, EMarket.MarketSide.MarketSideType marketSideType, String marketSideTitle, String marketTitle, String lineDescription, String leagueTitle, APIMarketStatus marketStatus);

        private final native URI Swift_eventImageURL(long Swift_peer);

        private final native String Swift_eventTitle(long Swift_peer);

        private final native boolean Swift_isDraw(long Swift_peer);

        private final native boolean Swift_isDrawableOutcome(long Swift_peer);

        private final native String Swift_leagueTitle(long Swift_peer);

        private final native String Swift_lineDescription(long Swift_peer);

        private final native String Swift_marketSideTitle(long Swift_peer);

        private final native EMarket.MarketSide.MarketSideType Swift_marketSideType(long Swift_peer);

        private final native APIMarketStatus Swift_marketStatus(long Swift_peer);

        private final native String Swift_marketTitle(long Swift_peer);

        private final native APIMarketType Swift_marketType(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native ESportsTeam Swift_team(long Swift_peer);

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

        public final DesignTokens.SemanticColor getAccentColor() {
            return Swift_accentColor(this.Swift_peer);
        }

        public final URI getEventImageURL() {
            return Swift_eventImageURL(this.Swift_peer);
        }

        public final String getEventTitle() {
            return Swift_eventTitle(this.Swift_peer);
        }

        public final String getLeagueTitle() {
            return Swift_leagueTitle(this.Swift_peer);
        }

        public final String getLineDescription() {
            return Swift_lineDescription(this.Swift_peer);
        }

        public final String getMarketSideTitle() {
            return Swift_marketSideTitle(this.Swift_peer);
        }

        public final EMarket.MarketSide.MarketSideType getMarketSideType() {
            return Swift_marketSideType(this.Swift_peer);
        }

        public final APIMarketStatus getMarketStatus() {
            return Swift_marketStatus(this.Swift_peer);
        }

        public final String getMarketTitle() {
            return Swift_marketTitle(this.Swift_peer);
        }

        public final APIMarketType getMarketType() {
            return Swift_marketType(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final ESportsTeam getTeam() {
            return Swift_team(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final boolean isDraw() {
            return Swift_isDraw(this.Swift_peer);
        }

        public final boolean isDrawableOutcome() {
            return Swift_isDrawableOutcome(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public MarketContext(String str, URI uri, APIMarketType aPIMarketType, ESportsTeam eSportsTeam, EMarket.MarketSide.MarketSideType marketSideType, String str2, String str3, String str4, String str5, APIMarketStatus aPIMarketStatus) {
            str.getClass();
            aPIMarketType.getClass();
            str2.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, uri, aPIMarketType, eSportsTeam, marketSideType, str2, str3, str4, str5, aPIMarketStatus);
        }

        public MarketContext(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
