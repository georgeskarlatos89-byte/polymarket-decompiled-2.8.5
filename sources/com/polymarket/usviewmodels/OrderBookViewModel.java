package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.APIMarketType;
import com.polymarket.data.EAmount;
import com.polymarket.data.EEvent;
import com.polymarket.data.EMarket;
import com.polymarket.data.EQuantity;
import com.polymarket.data.ESide;
import com.polymarket.data.ESportsTeam;
import com.polymarket.data.EUserPosition;
import com.polymarket.designtokens.DesignTokens;
import com.polymarket.usviewmodels.AppViewModel;
import com.polymarket.usviewmodels.PromoBannerViewModel;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ajd;
import defpackage.pc0;
import defpackage.qc0;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Hasher;
import skip.lib.Identifiable;
import skip.lib.InOut;
import skip.lib.RawRepresentable;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0007\u0018\u0000 ù\u00012\u00020\u0001:\u001aí\u0001î\u0001ï\u0001ð\u0001ñ\u0001ò\u0001ó\u0001ô\u0001õ\u0001ö\u0001÷\u0001ø\u0001ù\u0001B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001f\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010\u0016\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u000fH\u0082 J\u0015\u0010\u001e\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u001f\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0082 J\u0015\u0010#\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010$\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0082 J\u0015\u0010(\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010)\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0082 J\u0015\u0010+\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010/\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u00100\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0082 J\u0015\u00105\u001a\u0002022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00107\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010<\u001a\u0002092\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010@\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010C\u001a\u0002092\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010H\u001a\u0004\u0018\u00010E2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010K\u001a\u0004\u0018\u00010\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010Q\u001a\b\u0012\u0004\u0012\u00020N0M2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010T\u001a\b\u0012\u0004\u0012\u00020N0M2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010Y\u001a\u00020V2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\\\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010_\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010f\u001a\u0004\u0018\u00010`2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010g\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010`H\u0082 J\u0015\u0010j\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010m\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010r\u001a\u00020o2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010v\u001a\b\u0012\u0004\u0012\u00020t0M2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010z\u001a\b\u0012\u0004\u0012\u00020x0M2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010}\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001c\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\f0M2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0012\u0010\u0081\u0001\u001a\u0004\u0018\u00010E2\u0007\u0010\u0082\u0001\u001a\u000209J!\u0010\u0083\u0001\u001a\u0004\u0018\u00010E2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\u0084\u0001\u001a\u000209H\u0082 J\u0013\u0010\u0085\u0001\u001a\u00030\u0086\u00012\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010\fJ\"\u0010\u0088\u0001\u001a\u00030\u0086\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\fH\u0082 J\u0012\u0010\u008a\u0001\u001a\u00020\u00192\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010\fJ!\u0010\u008b\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\fH\u0082 J\u0016\u0010\u008e\u0001\u001a\u0002092\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0090\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0092\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0094\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0096\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0099\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u009c\u0001\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u009d\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0019\u0010¢\u0001\u001a\u0005\u0018\u00010\u009f\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009f\u00012\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010\fJ$\u0010£\u0001\u001a\u0005\u0018\u00010\u009f\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\fH\u0082 J\u0016\u0010¦\u0001\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010©\u0001\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0019\u0010®\u0001\u001a\u0005\u0018\u00010«\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0019\u0010±\u0001\u001a\u0005\u0018\u00010«\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010¶\u0001\u001a\u00030³\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010¹\u0001\u001a\u00030³\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001c\u0010¼\u0001\u001a\b\u0012\u0004\u0012\u00020\f0M2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¿\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Â\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Å\u0001\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010È\u0001\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Ë\u0001\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Î\u0001\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Ñ\u0001\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010Ø\u0001\u001a\u00030Ò\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010Ù\u0001\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\u0018\u001a\u00030Ò\u0001H\u0082 J\u0019\u0010à\u0001\u001a\u0005\u0018\u00010Ú\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J!\u0010á\u0001\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\t\u0010\u0018\u001a\u0005\u0018\u00010Ú\u0001H\u0082 J\t\u0010â\u0001\u001a\u00020\u0017H\u0016J\u0016\u0010ã\u0001\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0011\u0010ä\u0001\u001a\u00020\u00172\b\u0010å\u0001\u001a\u00030æ\u0001J \u0010ç\u0001\u001a\u00020\u00172\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010å\u0001\u001a\u00030æ\u0001H\u0082 J\u001a\u0010è\u0001\u001a\n\u0012\u0005\u0012\u00030ê\u00010é\u00012\u0007\u0010ë\u0001\u001a\u000209H\u0016J\u001b\u0010ì\u0001\u001a\n\u0012\u0005\u0012\u00030ê\u00010é\u00012\u0007\u0010ë\u0001\u001a\u000209H\u0082 R(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010 \u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\u001dR$\u0010%\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\u001b\"\u0004\b'\u0010\u001dR\u0011\u0010*\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b*\u0010\u001bR$\u0010,\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010\u001b\"\u0004\b.\u0010\u001dR\u0011\u00101\u001a\u0002028F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u00106\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b6\u0010\u001bR\u0011\u00108\u001a\u0002098F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010=\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0011\u0010A\u001a\u0002098F¢\u0006\u0006\u001a\u0004\bB\u0010;R\u0013\u0010D\u001a\u0004\u0018\u00010E8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0013\u0010I\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bJ\u0010?R\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020N0M8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0017\u0010R\u001a\b\u0012\u0004\u0012\u00020N0M8F¢\u0006\u0006\u001a\u0004\bS\u0010PR\u0011\u0010U\u001a\u00020V8F¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0011\u0010Z\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b[\u0010?R\u0011\u0010]\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b^\u0010?R(\u0010a\u001a\u0004\u0018\u00010`2\b\u0010\u000e\u001a\u0004\u0018\u00010`8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0011\u0010h\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bi\u0010\u001bR\u0011\u0010k\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bl\u0010?R\u0011\u0010n\u001a\u00020o8F¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0017\u0010s\u001a\b\u0012\u0004\u0012\u00020t0M8F¢\u0006\u0006\u001a\u0004\bu\u0010PR\u0017\u0010w\u001a\b\u0012\u0004\u0012\u00020x0M8F¢\u0006\u0006\u001a\u0004\by\u0010PR\u0011\u0010{\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b|\u0010?R\u0017\u0010~\u001a\b\u0012\u0004\u0012\u00020\f0M8F¢\u0006\u0006\u001a\u0004\b\u007f\u0010PR\u0013\u0010\u008c\u0001\u001a\u0002098F¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010;R\u0013\u0010\u008f\u0001\u001a\u00020\u00198F¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010\u001bR\u0013\u0010\u0091\u0001\u001a\u00020\u00198F¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010\u001bR\u0013\u0010\u0093\u0001\u001a\u00020\u00198F¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010\u001bR\u0013\u0010\u0095\u0001\u001a\u00020\u00198F¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010\u001bR\u0013\u0010\u0097\u0001\u001a\u00020\u00198F¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010\u001bR\u0013\u0010\u009a\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010?R\u0013\u0010\u008a\u0001\u001a\u00020\u00198F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010\u001bR\u0017\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009f\u00018F¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u0013\u0010¤\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010?R\u0013\u0010§\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010?R\u0017\u0010ª\u0001\u001a\u0005\u0018\u00010«\u00018F¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0017\u0010¯\u0001\u001a\u0005\u0018\u00010«\u00018F¢\u0006\b\u001a\u0006\b°\u0001\u0010\u00ad\u0001R\u0015\u0010²\u0001\u001a\u00030³\u00018F¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001R\u0015\u0010·\u0001\u001a\u00030³\u00018F¢\u0006\b\u001a\u0006\b¸\u0001\u0010µ\u0001R\u0019\u0010º\u0001\u001a\b\u0012\u0004\u0012\u00020\f0M8F¢\u0006\u0007\u001a\u0005\b»\u0001\u0010PR\u0013\u0010½\u0001\u001a\u00020\u00198F¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010\u001bR\u0013\u0010À\u0001\u001a\u00020\u00198F¢\u0006\u0007\u001a\u0005\bÁ\u0001\u0010\u001bR\u0013\u0010Ã\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\bÄ\u0001\u0010?R\u0013\u0010Æ\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\bÇ\u0001\u0010?R\u0013\u0010É\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\bÊ\u0001\u0010?R\u0013\u0010Ì\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\bÍ\u0001\u0010?R\u0013\u0010Ï\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\bÐ\u0001\u0010?R+\u0010Ó\u0001\u001a\u00030Ò\u00012\u0007\u0010\u000e\u001a\u00030Ò\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0006\bÖ\u0001\u0010×\u0001R/\u0010Û\u0001\u001a\u0005\u0018\u00010Ú\u00012\t\u0010\u000e\u001a\u0005\u0018\u00010Ú\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001¨\u0006ú\u0001"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "(Lcom/polymarket/usviewmodels/AppSceneType;Ljava/lang/String;)V", "newValue", "Lcom/polymarket/usviewmodels/PromoBannerViewModel;", "promoBannerVM", "getPromoBannerVM", "()Lcom/polymarket/usviewmodels/PromoBannerViewModel;", "setPromoBannerVM", "(Lcom/polymarket/usviewmodels/PromoBannerViewModel;)V", "Swift_promoBannerVM", "Swift_promoBannerVM_set", "", "value", "", "isLoading", "()Z", "setLoading", "(Z)V", "Swift_isLoading", "Swift_isLoading_set", "showNavBarDivider", "getShowNavBarDivider", "setShowNavBarDivider", "Swift_showNavBarDivider", "Swift_showNavBarDivider_set", "needsFullRefresh", "getNeedsFullRefresh", "setNeedsFullRefresh", "Swift_needsFullRefresh", "Swift_needsFullRefresh_set", "isInverted", "Swift_isInverted", "userPrefersDecimalized", "getUserPrefersDecimalized", "setUserPrefersDecimalized", "Swift_userPrefersDecimalized", "Swift_userPrefersDecimalized_set", "currentTick", "", "getCurrentTick", "()D", "Swift_currentTick", "isDecimalized", "Swift_isDecimalized", "priceDecimalPlaces", "", "getPriceDecimalPlaces", "()I", "Swift_priceDecimalPlaces", "selectedMarketSlug", "getSelectedMarketSlug", "()Ljava/lang/String;", "Swift_selectedMarketSlug", "bookDisplayVersion", "getBookDisplayVersion", "Swift_bookDisplayVersion", "selectedMarketSide", "Lcom/polymarket/data/EMarket$MarketSide;", "getSelectedMarketSide", "()Lcom/polymarket/data/EMarket$MarketSide;", "Swift_selectedMarketSide", "selectedMarketSideID", "getSelectedMarketSideID", "Swift_selectedMarketSideID", "askLevels", "", "Lcom/polymarket/usviewmodels/OrderBookViewModel$OrderBookLevel;", "getAskLevels", "()Ljava/util/List;", "Swift_askLevels", "bidLevels", "getBidLevels", "Swift_bidLevels", "spreadInfo", "Lcom/polymarket/usviewmodels/OrderBookViewModel$SpreadInfo;", "getSpreadInfo", "()Lcom/polymarket/usviewmodels/OrderBookViewModel$SpreadInfo;", "Swift_spreadInfo", "asksSectionLabel", "getAsksSectionLabel", "Swift_asksSectionLabel", "bidsSectionLabel", "getBidsSectionLabel", "Swift_bidsSectionLabel", "Lcom/polymarket/data/EUserPosition;", "userPosition", "getUserPosition", "()Lcom/polymarket/data/EUserPosition;", "setUserPosition", "(Lcom/polymarket/data/EUserPosition;)V", "Swift_userPosition", "Swift_userPosition_set", "hasUserPosition", "getHasUserPosition", "Swift_hasUserPosition", "marketSideTitle", "getMarketSideTitle", "Swift_marketSideTitle", "selectionMode", "Lcom/polymarket/usviewmodels/OrderBookViewModel$SelectionMode;", "getSelectionMode", "()Lcom/polymarket/usviewmodels/OrderBookViewModel$SelectionMode;", "Swift_selectionMode", "marketOptions", "Lcom/polymarket/usviewmodels/OrderBookViewModel$MarketOption;", "getMarketOptions", "Swift_marketOptions", "marketOptionSections", "Lcom/polymarket/usviewmodels/OrderBookViewModel$MarketOptionSection;", "getMarketOptionSections", "Swift_marketOptionSections", "selectedMarketTitle", "getSelectedMarketTitle", "Swift_selectedMarketTitle", "sideTitles", "getSideTitles", "Swift_sideTitles", "marketSide", "at", "Swift_marketSide_0", "index", "bookDisplay", "Lcom/polymarket/usviewmodels/OrderBookViewModel$BookDisplay;", "forMarketSideID", "Swift_bookDisplay_1", "marketSideID", "isBookEmpty", "Swift_isBookEmpty_2", "selectedSideIndex", "getSelectedSideIndex", "Swift_selectedSideIndex", "isSelectorVisible", "Swift_isSelectorVisible", "isMarketDropdownVisible", "Swift_isMarketDropdownVisible", "isSideToggleVisible", "Swift_isSideToggleVisible", "isSideTabControlVisible", "Swift_isSideTabControlVisible", "showSettingsButton", "getShowSettingsButton", "Swift_showSettingsButton", "menuDecimalizeTitle", "getMenuDecimalizeTitle", "Swift_menuDecimalizeTitle", "Swift_isBookEmpty", "emptyState", "Lcom/polymarket/usviewmodels/OrderBookViewModel$EmptyStatePresentation;", "getEmptyState", "()Lcom/polymarket/usviewmodels/OrderBookViewModel$EmptyStatePresentation;", "Swift_emptyState", "Swift_emptyState_3", "navTitle", "getNavTitle", "Swift_navTitle", "navSubtitle", "getNavSubtitle", "Swift_navSubtitle", "primaryTeam", "Lcom/polymarket/data/ESportsTeam;", "getPrimaryTeam", "()Lcom/polymarket/data/ESportsTeam;", "Swift_primaryTeam", "secondaryTeam", "getSecondaryTeam", "Swift_secondaryTeam", "askColor", "Lcom/polymarket/usviewmodels/OrderBookViewModel$SideColor;", "getAskColor", "()Lcom/polymarket/usviewmodels/OrderBookViewModel$SideColor;", "Swift_askColor", "bidColor", "getBidColor", "Swift_bidColor", "debugLiquiditySyncMarketSlugs", "getDebugLiquiditySyncMarketSlugs", "Swift_debugLiquiditySyncMarketSlugs", "hasMultipleMarketsForDebugLiquiditySync", "getHasMultipleMarketsForDebugLiquiditySync", "Swift_hasMultipleMarketsForDebugLiquiditySync", "debugLiquiditySyncAllExceedsLimit", "getDebugLiquiditySyncAllExceedsLimit", "Swift_debugLiquiditySyncAllExceedsLimit", "debugLiquiditySyncTitle", "getDebugLiquiditySyncTitle", "Swift_debugLiquiditySyncTitle", "debugLiquiditySyncMessage", "getDebugLiquiditySyncMessage", "Swift_debugLiquiditySyncMessage", "debugLiquiditySyncAllActionTitle", "getDebugLiquiditySyncAllActionTitle", "Swift_debugLiquiditySyncAllActionTitle", "debugLiquiditySyncTooManyMarketsTitle", "getDebugLiquiditySyncTooManyMarketsTitle", "Swift_debugLiquiditySyncTooManyMarketsTitle", "debugLiquiditySyncTooManyMarketsMessage", "getDebugLiquiditySyncTooManyMarketsMessage", "Swift_debugLiquiditySyncTooManyMarketsMessage", "Lcom/polymarket/usviewmodels/OrderBookViewModel$Callbacks;", "callbacks", "getCallbacks", "()Lcom/polymarket/usviewmodels/OrderBookViewModel$Callbacks;", "setCallbacks", "(Lcom/polymarket/usviewmodels/OrderBookViewModel$Callbacks;)V", "Swift_callbacks", "Swift_callbacks_set", "Lcom/polymarket/usviewmodels/OrderBookViewModel$OpenSource;", "openSource", "getOpenSource", "()Lcom/polymarket/usviewmodels/OrderBookViewModel$OpenSource;", "setOpenSource", "(Lcom/polymarket/usviewmodels/OrderBookViewModel$OpenSource;)V", "Swift_openSource", "Swift_openSource_set", "setup", "Swift_setup_4", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/OrderBookViewModel$Input;", "Swift_sendInput_6", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Callbacks", "OrderBookLevel", "LevelSelection", "SpreadInfo", "BookDisplay", "SideColor", "SelectionMode", "MarketOption", "MarketOptionSection", "EmptyStatePresentation", "OpenSource", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderBookViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$SelectionMode;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "locked", "selectable", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class SelectionMode implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ SelectionMode[] $VALUES;
        public static final SelectionMode locked = new SelectionMode("locked", 0);
        public static final SelectionMode selectable = new SelectionMode("selectable", 1);

        private static final /* synthetic */ SelectionMode[] $values() {
            return new SelectionMode[]{locked, selectable};
        }

        static {
            SelectionMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private SelectionMode(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static SelectionMode valueOf(String str) {
            return (SelectionMode) Enum.valueOf(SelectionMode.class, str);
        }

        public static SelectionMode[] values() {
            return (SelectionMode[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    public /* synthetic */ OrderBookViewModel(AppSceneType appSceneType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AppSceneDefault() : appSceneType, (i & 2) != 0 ? null : str);
    }

    private final native SideColor Swift_askColor(long Swift_peer);

    private final native List<OrderBookLevel> Swift_askLevels(long Swift_peer);

    private final native String Swift_asksSectionLabel(long Swift_peer);

    private final native SideColor Swift_bidColor(long Swift_peer);

    private final native List<OrderBookLevel> Swift_bidLevels(long Swift_peer);

    private final native String Swift_bidsSectionLabel(long Swift_peer);

    private final native int Swift_bookDisplayVersion(long Swift_peer);

    private final native BookDisplay Swift_bookDisplay_1(long Swift_peer, String marketSideID);

    private final native Callbacks Swift_callbacks(long Swift_peer);

    private final native void Swift_callbacks_set(long Swift_peer, Callbacks value);

    private final native double Swift_currentTick(long Swift_peer);

    private final native String Swift_debugLiquiditySyncAllActionTitle(long Swift_peer);

    private final native boolean Swift_debugLiquiditySyncAllExceedsLimit(long Swift_peer);

    private final native List<String> Swift_debugLiquiditySyncMarketSlugs(long Swift_peer);

    private final native String Swift_debugLiquiditySyncMessage(long Swift_peer);

    private final native String Swift_debugLiquiditySyncTitle(long Swift_peer);

    private final native String Swift_debugLiquiditySyncTooManyMarketsMessage(long Swift_peer);

    private final native String Swift_debugLiquiditySyncTooManyMarketsTitle(long Swift_peer);

    private final native EmptyStatePresentation Swift_emptyState(long Swift_peer);

    private final native EmptyStatePresentation Swift_emptyState_3(long Swift_peer, String marketSideID);

    private final native boolean Swift_hasMultipleMarketsForDebugLiquiditySync(long Swift_peer);

    private final native boolean Swift_hasUserPosition(long Swift_peer);

    private final native boolean Swift_isBookEmpty(long Swift_peer);

    private final native boolean Swift_isBookEmpty_2(long Swift_peer, String marketSideID);

    private final native boolean Swift_isDecimalized(long Swift_peer);

    private final native boolean Swift_isInverted(long Swift_peer);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native void Swift_isLoading_set(long Swift_peer, boolean value);

    private final native boolean Swift_isMarketDropdownVisible(long Swift_peer);

    private final native boolean Swift_isSelectorVisible(long Swift_peer);

    private final native boolean Swift_isSideTabControlVisible(long Swift_peer);

    private final native boolean Swift_isSideToggleVisible(long Swift_peer);

    private final native List<MarketOptionSection> Swift_marketOptionSections(long Swift_peer);

    private final native List<MarketOption> Swift_marketOptions(long Swift_peer);

    private final native String Swift_marketSideTitle(long Swift_peer);

    private final native EMarket.MarketSide Swift_marketSide_0(long Swift_peer, int index);

    private final native String Swift_menuDecimalizeTitle(long Swift_peer);

    private final native String Swift_navSubtitle(long Swift_peer);

    private final native String Swift_navTitle(long Swift_peer);

    private final native boolean Swift_needsFullRefresh(long Swift_peer);

    private final native void Swift_needsFullRefresh_set(long Swift_peer, boolean value);

    private final native OpenSource Swift_openSource(long Swift_peer);

    private final native void Swift_openSource_set(long Swift_peer, OpenSource value);

    private final native int Swift_priceDecimalPlaces(long Swift_peer);

    private final native ESportsTeam Swift_primaryTeam(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native PromoBannerViewModel Swift_promoBannerVM(long Swift_peer);

    private final native void Swift_promoBannerVM_set(long Swift_peer, PromoBannerViewModel value);

    private final native ESportsTeam Swift_secondaryTeam(long Swift_peer);

    private final native EMarket.MarketSide Swift_selectedMarketSide(long Swift_peer);

    private final native String Swift_selectedMarketSideID(long Swift_peer);

    private final native String Swift_selectedMarketSlug(long Swift_peer);

    private final native String Swift_selectedMarketTitle(long Swift_peer);

    private final native int Swift_selectedSideIndex(long Swift_peer);

    private final native SelectionMode Swift_selectionMode(long Swift_peer);

    private final native void Swift_sendInput_6(long Swift_peer, Input input);

    private final native void Swift_setup_4(long Swift_peer);

    private final native boolean Swift_showNavBarDivider(long Swift_peer);

    private final native void Swift_showNavBarDivider_set(long Swift_peer, boolean value);

    private final native boolean Swift_showSettingsButton(long Swift_peer);

    private final native List<String> Swift_sideTitles(long Swift_peer);

    private final native SpreadInfo Swift_spreadInfo(long Swift_peer);

    private final native EUserPosition Swift_userPosition(long Swift_peer);

    private final native void Swift_userPosition_set(long Swift_peer, EUserPosition value);

    private final native boolean Swift_userPrefersDecimalized(long Swift_peer);

    private final native void Swift_userPrefersDecimalized_set(long Swift_peer, boolean value);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final BookDisplay bookDisplay(String forMarketSideID) {
        return Swift_bookDisplay_1(getSwift_peer(), forMarketSideID);
    }

    public final EmptyStatePresentation emptyState(String forMarketSideID) {
        return Swift_emptyState_3(getSwift_peer(), forMarketSideID);
    }

    public final SideColor getAskColor() {
        return Swift_askColor(getSwift_peer());
    }

    public final List<OrderBookLevel> getAskLevels() {
        return Swift_askLevels(getSwift_peer());
    }

    public final String getAsksSectionLabel() {
        return Swift_asksSectionLabel(getSwift_peer());
    }

    public final SideColor getBidColor() {
        return Swift_bidColor(getSwift_peer());
    }

    public final List<OrderBookLevel> getBidLevels() {
        return Swift_bidLevels(getSwift_peer());
    }

    public final String getBidsSectionLabel() {
        return Swift_bidsSectionLabel(getSwift_peer());
    }

    public final int getBookDisplayVersion() {
        return Swift_bookDisplayVersion(getSwift_peer());
    }

    public final Callbacks getCallbacks() {
        return Swift_callbacks(getSwift_peer());
    }

    public final double getCurrentTick() {
        return Swift_currentTick(getSwift_peer());
    }

    public final String getDebugLiquiditySyncAllActionTitle() {
        return Swift_debugLiquiditySyncAllActionTitle(getSwift_peer());
    }

    public final boolean getDebugLiquiditySyncAllExceedsLimit() {
        return Swift_debugLiquiditySyncAllExceedsLimit(getSwift_peer());
    }

    public final List<String> getDebugLiquiditySyncMarketSlugs() {
        return Swift_debugLiquiditySyncMarketSlugs(getSwift_peer());
    }

    public final String getDebugLiquiditySyncMessage() {
        return Swift_debugLiquiditySyncMessage(getSwift_peer());
    }

    public final String getDebugLiquiditySyncTitle() {
        return Swift_debugLiquiditySyncTitle(getSwift_peer());
    }

    public final String getDebugLiquiditySyncTooManyMarketsMessage() {
        return Swift_debugLiquiditySyncTooManyMarketsMessage(getSwift_peer());
    }

    public final String getDebugLiquiditySyncTooManyMarketsTitle() {
        return Swift_debugLiquiditySyncTooManyMarketsTitle(getSwift_peer());
    }

    public final EmptyStatePresentation getEmptyState() {
        return Swift_emptyState(getSwift_peer());
    }

    public final boolean getHasMultipleMarketsForDebugLiquiditySync() {
        return Swift_hasMultipleMarketsForDebugLiquiditySync(getSwift_peer());
    }

    public final boolean getHasUserPosition() {
        return Swift_hasUserPosition(getSwift_peer());
    }

    public final List<MarketOptionSection> getMarketOptionSections() {
        return Swift_marketOptionSections(getSwift_peer());
    }

    public final List<MarketOption> getMarketOptions() {
        return Swift_marketOptions(getSwift_peer());
    }

    public final String getMarketSideTitle() {
        return Swift_marketSideTitle(getSwift_peer());
    }

    public final String getMenuDecimalizeTitle() {
        return Swift_menuDecimalizeTitle(getSwift_peer());
    }

    public final String getNavSubtitle() {
        return Swift_navSubtitle(getSwift_peer());
    }

    public final String getNavTitle() {
        return Swift_navTitle(getSwift_peer());
    }

    public final boolean getNeedsFullRefresh() {
        return Swift_needsFullRefresh(getSwift_peer());
    }

    public final OpenSource getOpenSource() {
        return Swift_openSource(getSwift_peer());
    }

    public final int getPriceDecimalPlaces() {
        return Swift_priceDecimalPlaces(getSwift_peer());
    }

    public final ESportsTeam getPrimaryTeam() {
        return Swift_primaryTeam(getSwift_peer());
    }

    public final PromoBannerViewModel getPromoBannerVM() {
        return Swift_promoBannerVM(getSwift_peer());
    }

    public final ESportsTeam getSecondaryTeam() {
        return Swift_secondaryTeam(getSwift_peer());
    }

    public final EMarket.MarketSide getSelectedMarketSide() {
        return Swift_selectedMarketSide(getSwift_peer());
    }

    public final String getSelectedMarketSideID() {
        return Swift_selectedMarketSideID(getSwift_peer());
    }

    public final String getSelectedMarketSlug() {
        return Swift_selectedMarketSlug(getSwift_peer());
    }

    public final String getSelectedMarketTitle() {
        return Swift_selectedMarketTitle(getSwift_peer());
    }

    public final int getSelectedSideIndex() {
        return Swift_selectedSideIndex(getSwift_peer());
    }

    public final SelectionMode getSelectionMode() {
        return Swift_selectionMode(getSwift_peer());
    }

    public final boolean getShowNavBarDivider() {
        return Swift_showNavBarDivider(getSwift_peer());
    }

    public final boolean getShowSettingsButton() {
        return Swift_showSettingsButton(getSwift_peer());
    }

    public final List<String> getSideTitles() {
        return Swift_sideTitles(getSwift_peer());
    }

    public final SpreadInfo getSpreadInfo() {
        return Swift_spreadInfo(getSwift_peer());
    }

    public final EUserPosition getUserPosition() {
        return Swift_userPosition(getSwift_peer());
    }

    public final boolean getUserPrefersDecimalized() {
        return Swift_userPrefersDecimalized(getSwift_peer());
    }

    public final boolean isBookEmpty(String forMarketSideID) {
        return Swift_isBookEmpty_2(getSwift_peer(), forMarketSideID);
    }

    public final boolean isDecimalized() {
        return Swift_isDecimalized(getSwift_peer());
    }

    public final boolean isInverted() {
        return Swift_isInverted(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final boolean isMarketDropdownVisible() {
        return Swift_isMarketDropdownVisible(getSwift_peer());
    }

    public final boolean isSelectorVisible() {
        return Swift_isSelectorVisible(getSwift_peer());
    }

    public final boolean isSideTabControlVisible() {
        return Swift_isSideTabControlVisible(getSwift_peer());
    }

    public final boolean isSideToggleVisible() {
        return Swift_isSideToggleVisible(getSwift_peer());
    }

    public final EMarket.MarketSide marketSide(int at) {
        return Swift_marketSide_0(getSwift_peer(), at);
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_6(getSwift_peer(), input);
    }

    public final void setCallbacks(Callbacks callbacks) {
        callbacks.getClass();
        Swift_callbacks_set(getSwift_peer(), callbacks);
    }

    public final void setLoading(boolean z) {
        Swift_isLoading_set(getSwift_peer(), z);
    }

    public final void setNeedsFullRefresh(boolean z) {
        Swift_needsFullRefresh_set(getSwift_peer(), z);
    }

    public final void setOpenSource(OpenSource openSource) {
        Swift_openSource_set(getSwift_peer(), openSource);
    }

    public final void setPromoBannerVM(PromoBannerViewModel promoBannerViewModel) {
        Swift_promoBannerVM_set(getSwift_peer(), promoBannerViewModel);
    }

    public final void setShowNavBarDivider(boolean z) {
        Swift_showNavBarDivider_set(getSwift_peer(), z);
    }

    public final void setUserPosition(EUserPosition eUserPosition) {
        Swift_userPosition_set(getSwift_peer(), (EUserPosition) StructKt.sref$default(eUserPosition, null, 1, null));
    }

    public final void setUserPrefersDecimalized(boolean z) {
        Swift_userPrefersDecimalized_set(getSwift_peer(), z);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_4(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001b2\u00020\u0001:\u000b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\n\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnDecimalizeToggledCase", "OnMarketSelectedCase", "OnMarketSideSelectedCase", "OnRenderedMarketSideChangedCase", "OnLevelTappedCase", "OnOpenLimitOrderCase", "OnRetryCase", "OnDebugStagingLiquiditySyncCase", "OnDebugStagingLiquiditySyncAllMarketsCase", "Companion", "Lcom/polymarket/usviewmodels/OrderBookViewModel$Input$OnDebugStagingLiquiditySyncAllMarketsCase;", "Lcom/polymarket/usviewmodels/OrderBookViewModel$Input$OnDebugStagingLiquiditySyncCase;", "Lcom/polymarket/usviewmodels/OrderBookViewModel$Input$OnDecimalizeToggledCase;", "Lcom/polymarket/usviewmodels/OrderBookViewModel$Input$OnLevelTappedCase;", "Lcom/polymarket/usviewmodels/OrderBookViewModel$Input$OnMarketSelectedCase;", "Lcom/polymarket/usviewmodels/OrderBookViewModel$Input$OnMarketSideSelectedCase;", "Lcom/polymarket/usviewmodels/OrderBookViewModel$Input$OnOpenLimitOrderCase;", "Lcom/polymarket/usviewmodels/OrderBookViewModel$Input$OnRenderedMarketSideChangedCase;", "Lcom/polymarket/usviewmodels/OrderBookViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/OrderBookViewModel$Input$OnViewDidLoadCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onDecimalizeToggled = new OnDecimalizeToggledCase();
        private static final Input onOpenLimitOrder = new OnOpenLimitOrderCase();
        private static final Input onRetry = new OnRetryCase();
        private static final Input onDebugStagingLiquiditySync = new OnDebugStagingLiquiditySyncCase();
        private static final Input onDebugStagingLiquiditySyncAllMarkets = new OnDebugStagingLiquiditySyncAllMarketsCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$Input$OnDebugStagingLiquiditySyncAllMarketsCase;", "Lcom/polymarket/usviewmodels/OrderBookViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDebugStagingLiquiditySyncAllMarketsCase extends Input {
            public OnDebugStagingLiquiditySyncAllMarketsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$Input$OnDebugStagingLiquiditySyncCase;", "Lcom/polymarket/usviewmodels/OrderBookViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDebugStagingLiquiditySyncCase extends Input {
            public OnDebugStagingLiquiditySyncCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$Input$OnDecimalizeToggledCase;", "Lcom/polymarket/usviewmodels/OrderBookViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDecimalizeToggledCase extends Input {
            public OnDecimalizeToggledCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$Input$OnLevelTappedCase;", "Lcom/polymarket/usviewmodels/OrderBookViewModel$Input;", "associated0", "Lcom/polymarket/data/EAmount;", "associated1", "Lcom/polymarket/data/ESide;", "<init>", "(Lcom/polymarket/data/EAmount;Lcom/polymarket/data/ESide;)V", "getAssociated0", "()Lcom/polymarket/data/EAmount;", "getAssociated1", "()Lcom/polymarket/data/ESide;", "price", "getPrice", "side", "getSide", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnLevelTappedCase extends Input {
            private final EAmount associated0;
            private final ESide associated1;
            private final EAmount price;
            private final ESide side;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnLevelTappedCase(EAmount eAmount, ESide eSide) {
                super(null);
                eAmount.getClass();
                eSide.getClass();
                this.associated0 = eAmount;
                this.associated1 = eSide;
                this.price = eAmount;
                this.side = eSide;
            }

            public final EAmount getAssociated0() {
                return this.associated0;
            }

            public final ESide getAssociated1() {
                return this.associated1;
            }

            public final EAmount getPrice() {
                return this.price;
            }

            public final ESide getSide() {
                return this.side;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$Input$OnMarketSelectedCase;", "Lcom/polymarket/usviewmodels/OrderBookViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "marketSlug", "getMarketSlug", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnMarketSelectedCase extends Input {
            private final String associated0;
            private final String marketSlug;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnMarketSelectedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
                this.marketSlug = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public final String getMarketSlug() {
                return this.marketSlug;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$Input$OnMarketSideSelectedCase;", "Lcom/polymarket/usviewmodels/OrderBookViewModel$Input;", "associated0", "", "<init>", "(I)V", "getAssociated0", "()I", "index", "getIndex", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnMarketSideSelectedCase extends Input {
            private final int associated0;
            private final int index;

            public OnMarketSideSelectedCase(int i) {
                super(null);
                this.associated0 = i;
                this.index = i;
            }

            public final int getAssociated0() {
                return this.associated0;
            }

            public final int getIndex() {
                return this.index;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$Input$OnOpenLimitOrderCase;", "Lcom/polymarket/usviewmodels/OrderBookViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnOpenLimitOrderCase extends Input {
            public OnOpenLimitOrderCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$Input$OnRenderedMarketSideChangedCase;", "Lcom/polymarket/usviewmodels/OrderBookViewModel$Input;", "associated0", "Lcom/polymarket/data/EMarket$MarketSide;", "<init>", "(Lcom/polymarket/data/EMarket$MarketSide;)V", "getAssociated0", "()Lcom/polymarket/data/EMarket$MarketSide;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRenderedMarketSideChangedCase extends Input {
            private final EMarket.MarketSide associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnRenderedMarketSideChangedCase(EMarket.MarketSide marketSide) {
                super(null);
                marketSide.getClass();
                this.associated0 = marketSide;
            }

            public final EMarket.MarketSide getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/OrderBookViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRetryCase extends Input {
            public OnRetryCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/OrderBookViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidLoadCase extends Input {
            public OnViewDidLoadCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnDebugStagingLiquiditySync$cp() {
            return onDebugStagingLiquiditySync;
        }

        public static final /* synthetic */ Input access$getOnDebugStagingLiquiditySyncAllMarkets$cp() {
            return onDebugStagingLiquiditySyncAllMarkets;
        }

        public static final /* synthetic */ Input access$getOnDecimalizeToggled$cp() {
            return onDecimalizeToggled;
        }

        public static final /* synthetic */ Input access$getOnOpenLimitOrder$cp() {
            return onOpenLimitOrder;
        }

        public static final /* synthetic */ Input access$getOnRetry$cp() {
            return onRetry;
        }

        public static final /* synthetic */ Input access$getOnViewDidLoad$cp() {
            return onViewDidLoad;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007¨\u0006 "}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/OrderBookViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/OrderBookViewModel$Input;", "onDecimalizeToggled", "getOnDecimalizeToggled", "onMarketSelected", "marketSlug", "", "onMarketSideSelected", "index", "", "onRenderedMarketSideChanged", "associated0", "Lcom/polymarket/data/EMarket$MarketSide;", "onLevelTapped", "price", "Lcom/polymarket/data/EAmount;", "side", "Lcom/polymarket/data/ESide;", "onOpenLimitOrder", "getOnOpenLimitOrder", "onRetry", "getOnRetry", "onDebugStagingLiquiditySync", "getOnDebugStagingLiquiditySync", "onDebugStagingLiquiditySyncAllMarkets", "getOnDebugStagingLiquiditySyncAllMarkets", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnDebugStagingLiquiditySync() {
                return Input.access$getOnDebugStagingLiquiditySync$cp();
            }

            public final Input getOnDebugStagingLiquiditySyncAllMarkets() {
                return Input.access$getOnDebugStagingLiquiditySyncAllMarkets$cp();
            }

            public final Input getOnDecimalizeToggled() {
                return Input.access$getOnDecimalizeToggled$cp();
            }

            public final Input getOnOpenLimitOrder() {
                return Input.access$getOnOpenLimitOrder$cp();
            }

            public final Input getOnRetry() {
                return Input.access$getOnRetry$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input onLevelTapped(EAmount price, ESide side) {
                price.getClass();
                side.getClass();
                return new OnLevelTappedCase(price, side);
            }

            public final Input onMarketSelected(String marketSlug) {
                marketSlug.getClass();
                return new OnMarketSelectedCase(marketSlug);
            }

            public final Input onMarketSideSelected(int index) {
                return new OnMarketSideSelectedCase(index);
            }

            public final Input onRenderedMarketSideChanged(EMarket.MarketSide associated0) {
                associated0.getClass();
                return new OnRenderedMarketSideChangedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0014B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0015"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$OpenSource;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "longPress", "deepLink", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class OpenSource implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ OpenSource[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final OpenSource longPress = new OpenSource("longPress", 0, "long_press", null, 2, null);
        public static final OpenSource deepLink = new OpenSource("deepLink", 1, "deep_link", null, 2, null);

        private static final /* synthetic */ OpenSource[] $values() {
            return new OpenSource[]{longPress, deepLink};
        }

        static {
            OpenSource[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ OpenSource(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static OpenSource valueOf(String str) {
            return (OpenSource) Enum.valueOf(OpenSource.class, str);
        }

        public static OpenSource[] values() {
            return (OpenSource[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$OpenSource$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usviewmodels/OrderBookViewModel$OpenSource;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final OpenSource init(String rawValue) {
                rawValue.getClass();
                if (Intrinsics.areEqual(rawValue, "long_press")) {
                    return OpenSource.longPress;
                }
                if (Intrinsics.areEqual(rawValue, "deep_link")) {
                    return OpenSource.deepLink;
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

        private OpenSource(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$SideColor;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "TeamHexCase", "DesignTokenCase", "Companion", "Lcom/polymarket/usviewmodels/OrderBookViewModel$SideColor$DesignTokenCase;", "Lcom/polymarket/usviewmodels/OrderBookViewModel$SideColor$TeamHexCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class SideColor implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$SideColor$DesignTokenCase;", "Lcom/polymarket/usviewmodels/OrderBookViewModel$SideColor;", "associated0", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "<init>", "(Lcom/polymarket/designtokens/DesignTokens$PaletteColor;)V", "getAssociated0", "()Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class DesignTokenCase extends SideColor {
            private final DesignTokens.PaletteColor associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DesignTokenCase(DesignTokens.PaletteColor paletteColor) {
                super(null);
                paletteColor.getClass();
                this.associated0 = paletteColor;
            }

            public boolean equals(Object other) {
                if (!(other instanceof DesignTokenCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((DesignTokenCase) other).associated0);
            }

            public final DesignTokens.PaletteColor getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$SideColor$TeamHexCase;", "Lcom/polymarket/usviewmodels/OrderBookViewModel$SideColor;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "equals", "", "other", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class TeamHexCase extends SideColor {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TeamHexCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public boolean equals(Object other) {
                if (!(other instanceof TeamHexCase)) {
                    return false;
                }
                return Intrinsics.areEqual(this.associated0, ((TeamHexCase) other).associated0);
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ SideColor(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tJ\t\u0010\r\u001a\u00020\u0005H\u0082 J\t\u0010\u0010\u001a\u00020\u0005H\u0082 R\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u000e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$SideColor$Companion;", "", "<init>", "()V", "teamHex", "Lcom/polymarket/usviewmodels/OrderBookViewModel$SideColor;", "associated0", "", "designToken", "Lcom/polymarket/designtokens/DesignTokens$PaletteColor;", "defaultBid", "getDefaultBid", "()Lcom/polymarket/usviewmodels/OrderBookViewModel$SideColor;", "Swift_Companion_defaultBid", "defaultAsk", "getDefaultAsk", "Swift_Companion_defaultAsk", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final native SideColor Swift_Companion_defaultAsk();

            private final native SideColor Swift_Companion_defaultBid();

            public final SideColor designToken(DesignTokens.PaletteColor associated0) {
                associated0.getClass();
                return new DesignTokenCase(associated0);
            }

            public final SideColor getDefaultAsk() {
                return Swift_Companion_defaultAsk();
            }

            public final SideColor getDefaultBid() {
                return Swift_Companion_defaultBid();
            }

            public final SideColor teamHex(String associated0) {
                associated0.getClass();
                return new TeamHexCase(associated0);
            }

            private Companion() {
            }
        }

        private SideColor() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0082 J.\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J1\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0082 J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\n¨\u0006\u001a"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_5", "", "Lskip/bridge/SwiftObjectPointer;", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "create", "Lcom/polymarket/usviewmodels/OrderBookViewModel;", "marketSlug", "market", "Lcom/polymarket/data/EMarket;", "marketSide", "Lcom/polymarket/data/EMarket$MarketSide;", "event", "Lcom/polymarket/data/EEvent;", "callbacks", "Lcom/polymarket/usviewmodels/OrderBookViewModel$Callbacks;", "Swift_Companion_create_7", "OpenSource", "Lcom/polymarket/usviewmodels/OrderBookViewModel$OpenSource;", "rawValue", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_5(AppSceneType scene, String id);

        private final native OrderBookViewModel Swift_Companion_create_7(String marketSlug, EMarket market, EMarket.MarketSide marketSide, EEvent event, Callbacks callbacks);

        public static final /* synthetic */ long access$Swift_Companion_constructor_5(Companion companion, AppSceneType appSceneType, String str) {
            return companion.Swift_Companion_constructor_5(appSceneType, str);
        }

        public final OpenSource OpenSource(String rawValue) {
            rawValue.getClass();
            return OpenSource.INSTANCE.init(rawValue);
        }

        public final OrderBookViewModel create(String marketSlug, EMarket market, EMarket.MarketSide marketSide, EEvent event, Callbacks callbacks) {
            marketSlug.getClass();
            market.getClass();
            marketSide.getClass();
            event.getClass();
            callbacks.getClass();
            return Swift_Companion_create_7(marketSlug, market, marketSide, event, callbacks);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001@B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bBC\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u0015J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0015\u0010\u001c\u001a\u00020\u001b2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0015\u0010\u001f\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010!\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010$\u001a\u00020\u000f2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010'\u001a\u00020\u00112\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010)\u001a\u00020\u00132\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0017\u0010+\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010.\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u00101\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J?\u00102\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0082 J\u0013\u00103\u001a\u00020\u00132\b\u00104\u001a\u0004\u0018\u000105H\u0096\u0002J\u0019\u00106\u001a\u00020\u00132\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u0000H\u0082 J\b\u00109\u001a\u00020:H\u0016J\u0015\u0010;\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u0002050=2\u0006\u0010>\u001a\u00020:H\u0016J\u0017\u0010?\u001a\b\u0012\u0004\u0012\u0002050=2\u0006\u0010>\u001a\u00020:H\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0012\u0010(R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b*\u0010\u001eR\u0014\u0010,\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u001eR\u0011\u0010/\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b0\u0010\u001e¨\u0006A"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$MarketOption;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "marketSlug", "marketType", "Lcom/polymarket/data/APIMarketType;", "sortKey", "", "isTerminal", "", "resolutionLabel", "(Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/data/APIMarketType;DZLjava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getTitle", "()Ljava/lang/String;", "Swift_title", "getMarketSlug", "Swift_marketSlug", "getMarketType", "()Lcom/polymarket/data/APIMarketType;", "Swift_marketType", "getSortKey", "()D", "Swift_sortKey", "()Z", "Swift_isTerminal", "getResolutionLabel", "Swift_resolutionLabel", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "Swift_id", "displayTitle", "getDisplayTitle", "Swift_displayTitle", "Swift_constructor_0", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MarketOption implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ MarketOption(String str, String str2, APIMarketType aPIMarketType, double d, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, r3, r4, r6, r7);
            String str4;
            APIMarketType aPIMarketType2 = (i & 4) != 0 ? APIMarketType.unknown : aPIMarketType;
            double d2 = (i & 8) != 0 ? ConstantsKt.UNSET : d;
            boolean z2 = (i & 16) != 0 ? false : z;
            if ((i & 32) != 0) {
                str4 = null;
            } else {
                str4 = str3;
            }
        }

        private final native long Swift_constructor_0(String title, String marketSlug, APIMarketType marketType, double sortKey, boolean isTerminal, String resolutionLabel);

        private final native String Swift_displayTitle(long Swift_peer);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isTerminal(long Swift_peer);

        private final native boolean Swift_isequal(MarketOption lhs, MarketOption rhs);

        private final native String Swift_marketSlug(long Swift_peer);

        private final native APIMarketType Swift_marketType(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_resolutionLabel(long Swift_peer);

        private final native double Swift_sortKey(long Swift_peer);

        private final native String Swift_title(long Swift_peer);

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
            if (!(other instanceof MarketOption)) {
                return false;
            }
            return Swift_isequal(this, (MarketOption) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getDisplayTitle() {
            return Swift_displayTitle(this.Swift_peer);
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
        }

        public final String getMarketSlug() {
            return Swift_marketSlug(this.Swift_peer);
        }

        public final APIMarketType getMarketType() {
            return Swift_marketType(this.Swift_peer);
        }

        public final String getResolutionLabel() {
            return Swift_resolutionLabel(this.Swift_peer);
        }

        public final double getSortKey() {
            return Swift_sortKey(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getTitle() {
            return Swift_title(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final boolean isTerminal() {
            return Swift_isTerminal(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ String getId() {
            return getId2();
        }

        public MarketOption(String str, String str2, APIMarketType aPIMarketType, double d, boolean z, String str3) {
            str.getClass();
            str2.getClass();
            aPIMarketType.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, aPIMarketType, d, z, str3);
        }

        public MarketOption(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001/B\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\n\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u0015\u0010\u0017\u001a\u00020\u00162\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010 \u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J%\u0010!\u001a\u00060\u0006j\u0002`\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082 J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\u0019\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0000H\u0082 J\b\u0010)\u001a\u00020*H\u0016J\u0015\u0010+\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020%0-2\u0006\u0010\r\u001a\u00020*H\u0016J\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020%0-2\u0006\u0010\r\u001a\u00020*H\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019¨\u00060"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$MarketOptionSection;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "options", "", "Lcom/polymarket/usviewmodels/OrderBookViewModel$MarketOption;", "(Ljava/lang/String;Ljava/util/List;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getTitle", "()Ljava/lang/String;", "Swift_title", "getOptions", "()Ljava/util/List;", "Swift_options", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "Swift_id", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class MarketOptionSection implements Identifiable<String>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public MarketOptionSection(String str, List<MarketOption> list) {
            list.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, list);
        }

        private final native long Swift_constructor_0(String title, List<MarketOption> options);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(MarketOptionSection lhs, MarketOptionSection rhs);

        private final native List<MarketOption> Swift_options(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_title(long Swift_peer);

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
            if (!(other instanceof MarketOptionSection)) {
                return false;
            }
            return Swift_isequal(this, (MarketOptionSection) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
        }

        public final List<MarketOption> getOptions() {
            return Swift_options(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getTitle() {
            return Swift_title(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ String getId() {
            return getId2();
        }

        public MarketOptionSection(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    public final boolean isBookEmpty() {
        return Swift_isBookEmpty(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001AB\u001f\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB9\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\n\u0010\u0016J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0015\u0010\u001d\u001a\u00020\u001c2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\f\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0015\u0010 \u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010#\u001a\u00020\u000e2\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010&\u001a\u00020\u00102\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010)\u001a\u00020\u00122\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010+\u001a\u00020\u00102\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0015\u0010.\u001a\u00020\u00152\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\b\u0010/\u001a\u00020\u0002H\u0016J\u0014\u00100\u001a\u00020\u001c2\f\u00101\u001a\b\u0012\u0004\u0012\u00020302J\u0015\u00104\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0082 J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0096\u0002J\u0019\u00109\u001a\u0002062\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0000H\u0082 J=\u0010<\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0082 J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u0002080>2\u0006\u0010?\u001a\u00020\u0002H\u0016J\u0017\u0010@\u001a\b\u0012\u0004\u0012\u0002080>2\u0006\u0010?\u001a\u00020\u0002H\u0082 R\u001e\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b*\u0010%R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006B"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$OrderBookLevel;", "Lskip/lib/Identifiable;", "", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "side", "Lcom/polymarket/data/ESide;", "price", "Lcom/polymarket/data/EAmount;", "quantity", "Lcom/polymarket/data/EQuantity;", "dollarValue", "depthRatio", "", "(ILcom/polymarket/data/ESide;Lcom/polymarket/data/EAmount;Lcom/polymarket/data/EQuantity;Lcom/polymarket/data/EAmount;D)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getId", "()Ljava/lang/Integer;", "Swift_id", "getSide", "()Lcom/polymarket/data/ESide;", "Swift_side", "getPrice", "()Lcom/polymarket/data/EAmount;", "Swift_price", "getQuantity", "()Lcom/polymarket/data/EQuantity;", "Swift_quantity", "getDollarValue", "Swift_dollarValue", "getDepthRatio", "()D", "Swift_depthRatio", "hashCode", "hash", "into", "Lskip/lib/InOut;", "Lskip/lib/Hasher;", "Swift_hashvalue", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class OrderBookLevel implements Identifiable<Integer>, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public OrderBookLevel(int i, ESide eSide, EAmount eAmount, EQuantity eQuantity, EAmount eAmount2, double d) {
            eSide.getClass();
            eAmount.getClass();
            eQuantity.getClass();
            eAmount2.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(i, eSide, eAmount, eQuantity, eAmount2, d);
        }

        private final native long Swift_constructor_0(int id, ESide side, EAmount price, EQuantity quantity, EAmount dollarValue, double depthRatio);

        private final native double Swift_depthRatio(long Swift_peer);

        private final native EAmount Swift_dollarValue(long Swift_peer);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native int Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(OrderBookLevel lhs, OrderBookLevel rhs);

        private final native EAmount Swift_price(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native EQuantity Swift_quantity(long Swift_peer);

        private final native void Swift_release(long Swift_peer);

        private final native ESide Swift_side(long Swift_peer);

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

        public boolean equals(Object other) {
            if (!(other instanceof OrderBookLevel)) {
                return false;
            }
            return Swift_isequal(this, (OrderBookLevel) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final double getDepthRatio() {
            return Swift_depthRatio(this.Swift_peer);
        }

        public final EAmount getDollarValue() {
            return Swift_dollarValue(this.Swift_peer);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // skip.lib.Identifiable
        public Integer getId() {
            return Integer.valueOf(Swift_id(this.Swift_peer));
        }

        public final EAmount getPrice() {
            return Swift_price(this.Swift_peer);
        }

        public final EQuantity getQuantity() {
            return Swift_quantity(this.Swift_peer);
        }

        public final ESide getSide() {
            return Swift_side(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final void hash(InOut<Hasher> into) {
            into.getClass();
            into.getValue().combine(Long.valueOf(Swift_hashvalue(this.Swift_peer)));
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
        public int hashCode() {
            ?? obj = new Object();
            obj.a = new Hasher();
            hash(new InOut<>(new pc0(obj, 25), new qc0(obj, 24)));
            return ((Hasher) obj.a).getResult();
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ Integer getId() {
            return getId();
        }

        public OrderBookLevel(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0015\u0010\u0014\u001a\u00020\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010\u001c\u001a\u00060\u0004j\u0002`\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0082 J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\u0019\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0000H\u0082 J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020 0%2\u0006\u0010&\u001a\u00020\u0016H\u0016J\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020 0%2\u0006\u0010&\u001a\u00020\u0016H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018¨\u0006)"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$SpreadInfo;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "spread", "Lcom/polymarket/data/EAmount;", "lastTradePrice", "(Lcom/polymarket/data/EAmount;Lcom/polymarket/data/EAmount;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getSpread", "()Lcom/polymarket/data/EAmount;", "Swift_spread", "getLastTradePrice", "Swift_lastTradePrice", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class SpreadInfo implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public SpreadInfo(EAmount eAmount, EAmount eAmount2) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(eAmount, eAmount2);
        }

        private final native long Swift_constructor_0(EAmount spread, EAmount lastTradePrice);

        private final native boolean Swift_isequal(SpreadInfo lhs, SpreadInfo rhs);

        private final native EAmount Swift_lastTradePrice(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native EAmount Swift_spread(long Swift_peer);

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
            if (!(other instanceof SpreadInfo)) {
                return false;
            }
            return Swift_isequal(this, (SpreadInfo) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final EAmount getLastTradePrice() {
            return Swift_lastTradePrice(this.Swift_peer);
        }

        public final EAmount getSpread() {
            return Swift_spread(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public SpreadInfo(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ SpreadInfo(EAmount eAmount, EAmount eAmount2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : eAmount, (i & 2) != 0 ? null : eAmount2);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0003-./B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB)\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0015\u0010\u001b\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010 \u001a\u0004\u0018\u00010\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J)\u0010!\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0082 J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\u0019\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0000H\u0082 J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020%0*2\u0006\u0010+\u001a\u00020\u0018H\u0016J\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020%0*2\u0006\u0010+\u001a\u00020\u0018H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$EmptyStatePresentation;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "subtitle", "button", "Lcom/polymarket/usviewmodels/OrderBookViewModel$EmptyStatePresentation$Button;", "(Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/usviewmodels/OrderBookViewModel$EmptyStatePresentation$Button;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getTitle", "()Ljava/lang/String;", "Swift_title", "getSubtitle", "Swift_subtitle", "getButton", "()Lcom/polymarket/usviewmodels/OrderBookViewModel$EmptyStatePresentation$Button;", "Swift_button", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Action", "Button", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class EmptyStatePresentation implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$EmptyStatePresentation$Action;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "openLimitOrder", "retry", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Action implements SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ Action[] $VALUES;
            public static final Action openLimitOrder = new Action("openLimitOrder", 0);
            public static final Action retry = new Action("retry", 1);

            private static final /* synthetic */ Action[] $values() {
                return new Action[]{openLimitOrder, retry};
            }

            static {
                Action[] $values = $values();
                $VALUES = $values;
                $ENTRIES = ww4.b($values);
                INSTANCE = new Companion(null);
            }

            private Action(String str, int i) {
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static ug7 getEntries() {
                return $ENTRIES;
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) $VALUES.clone();
            }

            @Override // skip.lib.SwiftProjecting
            public Function0<Object> Swift_projection(int options) {
                return Swift_projectionImpl(options);
            }
        }

        public EmptyStatePresentation(String str, String str2, Button button) {
            str.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, button);
        }

        private final native Button Swift_button(long Swift_peer);

        private final native long Swift_constructor_0(String title, String subtitle, Button button);

        private final native boolean Swift_isequal(EmptyStatePresentation lhs, EmptyStatePresentation rhs);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_subtitle(long Swift_peer);

        private final native String Swift_title(long Swift_peer);

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
            if (!(other instanceof EmptyStatePresentation)) {
                return false;
            }
            return Swift_isequal(this, (EmptyStatePresentation) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final Button getButton() {
            return Swift_button(this.Swift_peer);
        }

        public final String getSubtitle() {
            return Swift_subtitle(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getTitle() {
            return Swift_title(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public EmptyStatePresentation(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0015\u0010\u001a\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010\u001d\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001d\u0010\u001e\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0082 J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\u0019\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0000H\u0082 J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0'2\u0006\u0010(\u001a\u00020\u0017H\u0016J\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0'2\u0006\u0010(\u001a\u00020\u0017H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$EmptyStatePresentation$Button;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "action", "Lcom/polymarket/usviewmodels/OrderBookViewModel$EmptyStatePresentation$Action;", "(Ljava/lang/String;Lcom/polymarket/usviewmodels/OrderBookViewModel$EmptyStatePresentation$Action;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getTitle", "()Ljava/lang/String;", "Swift_title", "getAction", "()Lcom/polymarket/usviewmodels/OrderBookViewModel$EmptyStatePresentation$Action;", "Swift_action", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Button implements SwiftPeerBridged, SwiftProjecting {
            private long Swift_peer;

            public Button(String str, Action action) {
                str.getClass();
                action.getClass();
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = Swift_constructor_0(str, action);
            }

            private final native Action Swift_action(long Swift_peer);

            private final native long Swift_constructor_0(String title, Action action);

            private final native boolean Swift_isequal(Button lhs, Button rhs);

            private final native Function0<Object> Swift_projectionImpl(int options);

            private final native void Swift_release(long Swift_peer);

            private final native String Swift_title(long Swift_peer);

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
                if (!(other instanceof Button)) {
                    return false;
                }
                return Swift_isequal(this, (Button) other);
            }

            public final void finalize() {
                Swift_release(this.Swift_peer);
                this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            }

            public final Action getAction() {
                return Swift_action(this.Swift_peer);
            }

            public final long getSwift_peer() {
                return this.Swift_peer;
            }

            public final String getTitle() {
                return Swift_title(this.Swift_peer);
            }

            public int hashCode() {
                return Long.hashCode(this.Swift_peer);
            }

            public final void setSwift_peer(long j) {
                this.Swift_peer = j;
            }

            public Button(long j, SwiftPeerMarker swiftPeerMarker) {
                BridgeSupportKt.getSwiftObjectNil();
                this.Swift_peer = j;
            }
        }

        public /* synthetic */ EmptyStatePresentation(String str, String str2, Button button, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : button);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderBookViewModel(AppSceneType appSceneType, String str) {
        super(Companion.access$Swift_Companion_constructor_5(INSTANCE, appSceneType, str), (SwiftPeerMarker) null);
        appSceneType.getClass();
    }

    public OrderBookViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB-\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\b\u0010\u0011J\u0006\u0010\u0016\u001a\u00020\u0017J\u0015\u0010\u0018\u001a\u00020\u00172\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0015\u0010!\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010$\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010'\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010)\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0010\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020-J\u001f\u0010.\u001a\u0004\u0018\u00010+2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010/\u001a\u00020-H\u0082 J/\u00100\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0082 J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u001c022\u0006\u00103\u001a\u00020\u001eH\u0016J\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020\u001c022\u0006\u00103\u001a\u00020\u001eH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b(\u0010&¨\u00066"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$LevelSelection;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "price", "Lcom/polymarket/data/EAmount;", "side", "Lcom/polymarket/data/ESide;", "marketSlug", "", "marketSideID", "(Lcom/polymarket/data/EAmount;Lcom/polymarket/data/ESide;Ljava/lang/String;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getPrice", "()Lcom/polymarket/data/EAmount;", "Swift_price", "getSide", "()Lcom/polymarket/data/ESide;", "Swift_side", "getMarketSlug", "()Ljava/lang/String;", "Swift_marketSlug", "getMarketSideID", "Swift_marketSideID", "resolveMarketSide", "Lcom/polymarket/data/EMarket$MarketSide;", "in_", "Lcom/polymarket/data/EEvent;", "Swift_resolveMarketSide_0", "event", "Swift_constructor_1", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class LevelSelection implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public LevelSelection(EAmount eAmount, ESide eSide, String str, String str2) {
            eAmount.getClass();
            eSide.getClass();
            str.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_1(eAmount, eSide, str, str2);
        }

        private final native long Swift_constructor_1(EAmount price, ESide side, String marketSlug, String marketSideID);

        private final native String Swift_marketSideID(long Swift_peer);

        private final native String Swift_marketSlug(long Swift_peer);

        private final native EAmount Swift_price(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native EMarket.MarketSide Swift_resolveMarketSide_0(long Swift_peer, EEvent event);

        private final native ESide Swift_side(long Swift_peer);

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

        public final String getMarketSideID() {
            return Swift_marketSideID(this.Swift_peer);
        }

        public final String getMarketSlug() {
            return Swift_marketSlug(this.Swift_peer);
        }

        public final EAmount getPrice() {
            return Swift_price(this.Swift_peer);
        }

        public final ESide getSide() {
            return Swift_side(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final EMarket.MarketSide resolveMarketSide(EEvent in_) {
            in_.getClass();
            return Swift_resolveMarketSide_0(this.Swift_peer, in_);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public LevelSelection(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ LevelSelection(EAmount eAmount, ESide eSide, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(eAmount, eSide, str, (i & 8) != 0 ? null : str2);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBE\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\u0014J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0015\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0015\u0010 \u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010(\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010*\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010,\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JI\u0010-\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0082 J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0096\u0002J\u0019\u00102\u001a\u00020/2\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0000H\u0082 J\u0016\u00105\u001a\b\u0012\u0004\u0012\u000201062\u0006\u00107\u001a\u00020\u001dH\u0016J\u0017\u00108\u001a\b\u0012\u0004\u0012\u000201062\u0006\u00107\u001a\u00020\u001dH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001fR\u0011\u0010\u0013\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u001f¨\u0006:"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$BookDisplay;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "marketSideID", "", "asks", "", "Lcom/polymarket/usviewmodels/OrderBookViewModel$OrderBookLevel;", "bids", "spreadInfo", "Lcom/polymarket/usviewmodels/OrderBookViewModel$SpreadInfo;", "spreadText", "lastTradeText", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/polymarket/usviewmodels/OrderBookViewModel$SpreadInfo;Ljava/lang/String;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "hashCode", "", "getMarketSideID", "()Ljava/lang/String;", "Swift_marketSideID", "getAsks", "()Ljava/util/List;", "Swift_asks", "getBids", "Swift_bids", "getSpreadInfo", "()Lcom/polymarket/usviewmodels/OrderBookViewModel$SpreadInfo;", "Swift_spreadInfo", "getSpreadText", "Swift_spreadText", "getLastTradeText", "Swift_lastTradeText", "Swift_constructor_0", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class BookDisplay implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public BookDisplay(String str, List<OrderBookLevel> list, List<OrderBookLevel> list2, SpreadInfo spreadInfo, String str2, String str3) {
            str.getClass();
            list.getClass();
            list2.getClass();
            spreadInfo.getClass();
            str2.getClass();
            str3.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, list, list2, spreadInfo, str2, str3);
        }

        private final native List<OrderBookLevel> Swift_asks(long Swift_peer);

        private final native List<OrderBookLevel> Swift_bids(long Swift_peer);

        private final native long Swift_constructor_0(String marketSideID, List<OrderBookLevel> asks, List<OrderBookLevel> bids, SpreadInfo spreadInfo, String spreadText, String lastTradeText);

        private final native boolean Swift_isequal(BookDisplay lhs, BookDisplay rhs);

        private final native String Swift_lastTradeText(long Swift_peer);

        private final native String Swift_marketSideID(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native SpreadInfo Swift_spreadInfo(long Swift_peer);

        private final native String Swift_spreadText(long Swift_peer);

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
            if (!(other instanceof BookDisplay)) {
                return false;
            }
            return Swift_isequal(this, (BookDisplay) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final List<OrderBookLevel> getAsks() {
            return Swift_asks(this.Swift_peer);
        }

        public final List<OrderBookLevel> getBids() {
            return Swift_bids(this.Swift_peer);
        }

        public final String getLastTradeText() {
            return Swift_lastTradeText(this.Swift_peer);
        }

        public final String getMarketSideID() {
            return Swift_marketSideID(this.Swift_peer);
        }

        public final SpreadInfo getSpreadInfo() {
            return Swift_spreadInfo(this.Swift_peer);
        }

        public final String getSpreadText() {
            return Swift_spreadText(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public BookDisplay(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB?\b\u0016\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\b\u0010\u0012J\u0006\u0010\u0017\u001a\u00020\rJ\u0015\u0010\u0018\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J!\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010$\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J=\u0010%\u001a\u00060\u0004j\u0002`\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082 J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001c0'2\u0006\u0010(\u001a\u00020\u001eH\u0016J\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001c0'2\u0006\u0010(\u001a\u00020\u001eH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006+"}, d2 = {"Lcom/polymarket/usviewmodels/OrderBookViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onLevelSelected", "Lkotlin/Function1;", "Lcom/polymarket/usviewmodels/OrderBookViewModel$LevelSelection;", "", "onOpenLimitOrder", "Lcom/polymarket/data/EMarket$MarketSide;", "promoBannerCallbacks", "Lcom/polymarket/usviewmodels/PromoBannerViewModel$Callbacks;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/polymarket/usviewmodels/PromoBannerViewModel$Callbacks;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnOpenLimitOrder", "()Lkotlin/jvm/functions/Function1;", "Swift_onOpenLimitOrder", "getPromoBannerCallbacks", "()Lcom/polymarket/usviewmodels/PromoBannerViewModel$Callbacks;", "Swift_promoBannerCallbacks", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function1 function1, Function1 function12, PromoBannerViewModel.Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new ajd(10) : function1, (i & 2) != 0 ? new ajd(11) : function12, (i & 4) != 0 ? new PromoBannerViewModel.Callbacks(null, null, 3, null) : callbacks);
        }

        private final native long Swift_constructor_0(Function1<? super LevelSelection, Unit> onLevelSelected, Function1<? super EMarket.MarketSide, Unit> onOpenLimitOrder, PromoBannerViewModel.Callbacks promoBannerCallbacks);

        private final native Function1<EMarket.MarketSide, Unit> Swift_onOpenLimitOrder(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native PromoBannerViewModel.Callbacks Swift_promoBannerCallbacks(long Swift_peer);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(LevelSelection levelSelection) {
            levelSelection.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(EMarket.MarketSide marketSide) {
            marketSide.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(EMarket.MarketSide marketSide) {
            return _init_$lambda$1(marketSide);
        }

        public static /* synthetic */ Unit b(LevelSelection levelSelection) {
            return _init_$lambda$0(levelSelection);
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
            if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
                return false;
            }
            return true;
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final Function1<EMarket.MarketSide, Unit> getOnOpenLimitOrder() {
            return Swift_onOpenLimitOrder(this.Swift_peer);
        }

        public final PromoBannerViewModel.Callbacks getPromoBannerCallbacks() {
            return Swift_promoBannerCallbacks(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public Callbacks(Function1<? super LevelSelection, Unit> function1, Function1<? super EMarket.MarketSide, Unit> function12, PromoBannerViewModel.Callbacks callbacks) {
            function1.getClass();
            function12.getClass();
            callbacks.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function1, function12, callbacks);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
