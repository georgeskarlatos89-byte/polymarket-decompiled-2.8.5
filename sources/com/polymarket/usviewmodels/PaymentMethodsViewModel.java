package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.APIAddress;
import com.polymarket.data.EDefaultDepositLimits;
import com.polymarket.data.EPaymentMethod;
import com.polymarket.data.EPaymentSelection;
import com.polymarket.data.EThemeSettings;
import com.polymarket.data.EWireDetails;
import com.polymarket.usviewmodels.AppViewModel;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ajd;
import defpackage.ug7;
import defpackage.ww4;
import defpackage.ypd;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Array;
import skip.lib.ArrayKt;
import skip.lib.CaseIterable;
import skip.lib.CaseIterableCompanion;
import skip.lib.RawRepresentable;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 Ä\u00012\u00020\u0001:\f¿\u0001À\u0001Á\u0001Â\u0001Ã\u0001Ä\u0001B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB'\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0007\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010\u001c\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0082 J\u0017\u0010%\u001a\u0004\u0018\u00010\u001f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010&\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0082 J\u0017\u0010-\u001a\u0004\u0018\u00010'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010.\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010'H\u0082 J\u0015\u00104\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u00105\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001e\u001a\u00020/H\u0082 J\u0015\u00108\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u00109\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001e\u001a\u00020/H\u0082 J\u0015\u0010=\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010>\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001e\u001a\u00020/H\u0082 J\u0015\u0010E\u001a\u00020?2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010F\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001e\u001a\u00020?H\u0082 J\u0017\u0010M\u001a\u0004\u0018\u00010G2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010N\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010GH\u0082 J\u0017\u0010U\u001a\u0004\u0018\u00010O2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010V\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010OH\u0082 J\u0017\u0010Z\u001a\u0004\u0018\u00010O2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010[\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010OH\u0082 J\u0017\u0010b\u001a\u0004\u0018\u00010\\2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010c\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\\H\u0082 J\u0017\u0010g\u001a\u0004\u0018\u00010'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010h\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010'H\u0082 J\u0017\u0010o\u001a\u0004\u0018\u00010i2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010p\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010iH\u0082 J\u0015\u0010s\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010t\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001e\u001a\u00020/H\u0082 J\u0017\u0010{\u001a\u0004\u0018\u00010u2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010|\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010uH\u0082 J\u0016\u0010\u0083\u0001\u001a\u00020}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010\u0084\u0001\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001e\u001a\u00020}H\u0082 J\u0016\u0010\u0088\u0001\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010\u0089\u0001\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001e\u001a\u00020/H\u0082 J\u0016\u0010\u008c\u0001\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010\u008d\u0001\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001e\u001a\u00020/H\u0082 J\u0013\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u00012\u0007\u0010\u0090\u0001\u001a\u00020'J\"\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008f\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\u0092\u0001\u001a\u00020'H\u0082 J\u0016\u0010\u0094\u0001\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0097\u0001\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010\u0098\u0001\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001e\u001a\u00020/H\u0082 J\u0016\u0010\u009b\u0001\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010\u009c\u0001\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001e\u001a\u00020/H\u0082 J\u0016\u0010 \u0001\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010¡\u0001\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001e\u001a\u00020/H\u0082 J\u0016\u0010¥\u0001\u001a\u00020/2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010¦\u0001\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001e\u001a\u00020/H\u0082 J\u001c\u0010©\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001c\u0010¬\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001c\u0010¯\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0018\u0010²\u0001\u001a\u0004\u0018\u00010\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\t\u0010³\u0001\u001a\u00020\u001dH\u0016J\u0016\u0010´\u0001\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0011\u0010µ\u0001\u001a\u00020\u001d2\b\u0010¶\u0001\u001a\u00030·\u0001J \u0010¸\u0001\u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010¶\u0001\u001a\u00030·\u0001H\u0082 J\u001b\u0010¹\u0001\u001a\n\u0012\u0005\u0012\u00030»\u00010º\u00012\b\u0010¼\u0001\u001a\u00030½\u0001H\u0016J\u001c\u0010¾\u0001\u001a\n\u0012\u0005\u0012\u00030»\u00010º\u00012\b\u0010¼\u0001\u001a\u00030½\u0001H\u0082 R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010(\u001a\u0004\u0018\u00010'2\b\u0010\u0013\u001a\u0004\u0018\u00010'8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00100\u001a\u00020/2\u0006\u0010\u0013\u001a\u00020/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00106\u001a\u00020/2\u0006\u0010\u0013\u001a\u00020/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00101\"\u0004\b7\u00103R$\u0010:\u001a\u00020/2\u0006\u0010\u0013\u001a\u00020/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u00101\"\u0004\b<\u00103R$\u0010@\u001a\u00020?2\u0006\u0010\u0013\u001a\u00020?8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR(\u0010H\u001a\u0004\u0018\u00010G2\b\u0010\u0013\u001a\u0004\u0018\u00010G8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR(\u0010P\u001a\u0004\u0018\u00010O2\b\u0010\u0013\u001a\u0004\u0018\u00010O8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR(\u0010W\u001a\u0004\u0018\u00010O2\b\u0010\u0013\u001a\u0004\u0018\u00010O8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010R\"\u0004\bY\u0010TR(\u0010]\u001a\u0004\u0018\u00010\\2\b\u0010\u0013\u001a\u0004\u0018\u00010\\8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR(\u0010d\u001a\u0004\u0018\u00010'2\b\u0010\u0013\u001a\u0004\u0018\u00010'8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\be\u0010*\"\u0004\bf\u0010,R(\u0010j\u001a\u0004\u0018\u00010i2\b\u0010\u0013\u001a\u0004\u0018\u00010i8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR$\u0010q\u001a\u00020/2\u0006\u0010\u0013\u001a\u00020/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bq\u00101\"\u0004\br\u00103R(\u0010v\u001a\u0004\u0018\u00010u2\b\u0010\u0013\u001a\u0004\u0018\u00010u8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR'\u0010~\u001a\u00020}2\u0006\u0010\u0013\u001a\u00020}8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R'\u0010\u0085\u0001\u001a\u00020/2\u0006\u0010\u0013\u001a\u00020/8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0086\u0001\u00101\"\u0005\b\u0087\u0001\u00103R'\u0010\u008a\u0001\u001a\u00020/2\u0006\u0010\u0013\u001a\u00020/8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008a\u0001\u00101\"\u0005\b\u008b\u0001\u00103R\u0013\u0010\u0093\u0001\u001a\u00020/8F¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u00101R'\u0010\u0095\u0001\u001a\u00020/2\u0006\u0010\u0013\u001a\u00020/8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0095\u0001\u00101\"\u0005\b\u0096\u0001\u00103R'\u0010\u0099\u0001\u001a\u00020/2\u0006\u0010\u0013\u001a\u00020/8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0099\u0001\u00101\"\u0005\b\u009a\u0001\u00103R'\u0010\u009d\u0001\u001a\u00020/2\u0006\u0010\u0013\u001a\u00020/8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u009e\u0001\u00101\"\u0005\b\u009f\u0001\u00103R'\u0010¢\u0001\u001a\u00020/2\u0006\u0010\u0013\u001a\u00020/8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b£\u0001\u00101\"\u0005\b¤\u0001\u00103R\u0019\u0010§\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148F¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010\u0018R\u0019\u0010ª\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148F¢\u0006\u0007\u001a\u0005\b«\u0001\u0010\u0018R\u0019\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148F¢\u0006\u0007\u001a\u0005\b®\u0001\u0010\u0018R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\b\u001a\u0006\b°\u0001\u0010±\u0001¨\u0006Å\u0001"}, d2 = {"Lcom/polymarket/usviewmodels/PaymentMethodsViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "fundingMode", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Mode;", "autoStartAction", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$AutoStartAction;", "callbacks", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Mode;Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$AutoStartAction;Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Callbacks;)V", "getFundingMode", "()Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Mode;", "Swift_fundingMode", "newValue", "", "Lcom/polymarket/data/EPaymentMethod;", "storedMethods", "getStoredMethods", "()Ljava/util/List;", "setStoredMethods", "(Ljava/util/List;)V", "Swift_storedMethods", "Swift_storedMethods_set", "", "value", "Lcom/polymarket/data/EPaymentSelection;", "selectedPaymentSelection", "getSelectedPaymentSelection", "()Lcom/polymarket/data/EPaymentSelection;", "setSelectedPaymentSelection", "(Lcom/polymarket/data/EPaymentSelection;)V", "Swift_selectedPaymentSelection", "Swift_selectedPaymentSelection_set", "Lcom/polymarket/data/EPaymentMethod$MethodType;", "linkPaymentMethodLoading", "getLinkPaymentMethodLoading", "()Lcom/polymarket/data/EPaymentMethod$MethodType;", "setLinkPaymentMethodLoading", "(Lcom/polymarket/data/EPaymentMethod$MethodType;)V", "Swift_linkPaymentMethodLoading", "Swift_linkPaymentMethodLoading_set", "", "isPlatformPayAvailable", "()Z", "setPlatformPayAvailable", "(Z)V", "Swift_isPlatformPayAvailable", "Swift_isPlatformPayAvailable_set", "isLoading", "setLoading", "Swift_isLoading", "Swift_isLoading_set", "shouldAnimateTransition", "getShouldAnimateTransition", "setShouldAnimateTransition", "Swift_shouldAnimateTransition", "Swift_shouldAnimateTransition_set", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$PaymentStep;", "currentStep", "getCurrentStep", "()Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$PaymentStep;", "setCurrentStep", "(Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$PaymentStep;)V", "Swift_currentStep", "Swift_currentStep_set", "Lcom/polymarket/usviewmodels/LinkBankMFAViewModel;", "mfaViewModel", "getMfaViewModel", "()Lcom/polymarket/usviewmodels/LinkBankMFAViewModel;", "setMfaViewModel", "(Lcom/polymarket/usviewmodels/LinkBankMFAViewModel;)V", "Swift_mfaViewModel", "Swift_mfaViewModel_set", "Lcom/polymarket/usviewmodels/AddressViewModel;", "billingAddressSearchViewModel", "getBillingAddressSearchViewModel", "()Lcom/polymarket/usviewmodels/AddressViewModel;", "setBillingAddressSearchViewModel", "(Lcom/polymarket/usviewmodels/AddressViewModel;)V", "Swift_billingAddressSearchViewModel", "Swift_billingAddressSearchViewModel_set", "billingAddressFormViewModel", "getBillingAddressFormViewModel", "setBillingAddressFormViewModel", "Swift_billingAddressFormViewModel", "Swift_billingAddressFormViewModel_set", "Lcom/polymarket/usviewmodels/LinkBankSelectionViewModel;", "linkBankSelectionViewModel", "getLinkBankSelectionViewModel", "()Lcom/polymarket/usviewmodels/LinkBankSelectionViewModel;", "setLinkBankSelectionViewModel", "(Lcom/polymarket/usviewmodels/LinkBankSelectionViewModel;)V", "Swift_linkBankSelectionViewModel", "Swift_linkBankSelectionViewModel_set", "pendingPaymentMethodType", "getPendingPaymentMethodType", "setPendingPaymentMethodType", "Swift_pendingPaymentMethodType", "Swift_pendingPaymentMethodType_set", "Lcom/polymarket/data/APIAddress;", "collectedBillingAddress", "getCollectedBillingAddress", "()Lcom/polymarket/data/APIAddress;", "setCollectedBillingAddress", "(Lcom/polymarket/data/APIAddress;)V", "Swift_collectedBillingAddress", "Swift_collectedBillingAddress_set", "isAddressSearchExpanded", "setAddressSearchExpanded", "Swift_isAddressSearchExpanded", "Swift_isAddressSearchExpanded_set", "Lcom/polymarket/data/EDefaultDepositLimits;", "defaultDepositLimits", "getDefaultDepositLimits", "()Lcom/polymarket/data/EDefaultDepositLimits;", "setDefaultDepositLimits", "(Lcom/polymarket/data/EDefaultDepositLimits;)V", "Swift_defaultDepositLimits", "Swift_defaultDepositLimits_set", "Lcom/polymarket/data/EThemeSettings$Appearance;", "currentTheme", "getCurrentTheme", "()Lcom/polymarket/data/EThemeSettings$Appearance;", "setCurrentTheme", "(Lcom/polymarket/data/EThemeSettings$Appearance;)V", "Swift_currentTheme", "Swift_currentTheme_set", "quickAddTestCardLoading", "getQuickAddTestCardLoading", "setQuickAddTestCardLoading", "Swift_quickAddTestCardLoading", "Swift_quickAddTestCardLoading_set", "isQuickAddTestCardAvailable", "setQuickAddTestCardAvailable", "Swift_isQuickAddTestCardAvailable", "Swift_isQuickAddTestCardAvailable_set", "defaultLimits", "Lcom/polymarket/data/EDefaultDepositLimits$Limits;", "for_", "Swift_defaultLimits_0", "type", "isRemoveStoredMethodEnabled", "Swift_isRemoveStoredMethodEnabled", "isPayPalLinkEnabled", "setPayPalLinkEnabled", "Swift_isPayPalLinkEnabled", "Swift_isPayPalLinkEnabled_set", "isVenmoLinkEnabled", "setVenmoLinkEnabled", "Swift_isVenmoLinkEnabled", "Swift_isVenmoLinkEnabled_set", "shouldShowAddPayPal", "getShouldShowAddPayPal", "setShouldShowAddPayPal", "Swift_shouldShowAddPayPal", "Swift_shouldShowAddPayPal_set", "shouldShowAddVenmo", "getShouldShowAddVenmo", "setShouldShowAddVenmo", "Swift_shouldShowAddVenmo", "Swift_shouldShowAddVenmo_set", "storedPayPalMethods", "getStoredPayPalMethods", "Swift_storedPayPalMethods", "storedVenmoMethods", "getStoredVenmoMethods", "Swift_storedVenmoMethods", "otherStoredMethods", "getOtherStoredMethods", "Swift_otherStoredMethods", "getAutoStartAction", "()Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$AutoStartAction;", "Swift_autoStartAction", "setup", "Swift_setup_2", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input;", "Swift_sendInput_3", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Mode", "Callbacks", "AutoStartAction", "PaymentStep", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentMethodsViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$AutoStartAction;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "linkBank", "linkCard", "linkPayPal", "linkVenmo", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class AutoStartAction implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ AutoStartAction[] $VALUES;
        public static final AutoStartAction linkBank = new AutoStartAction("linkBank", 0);
        public static final AutoStartAction linkCard = new AutoStartAction("linkCard", 1);
        public static final AutoStartAction linkPayPal = new AutoStartAction("linkPayPal", 2);
        public static final AutoStartAction linkVenmo = new AutoStartAction("linkVenmo", 3);

        private static final /* synthetic */ AutoStartAction[] $values() {
            return new AutoStartAction[]{linkBank, linkCard, linkPayPal, linkVenmo};
        }

        static {
            AutoStartAction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private AutoStartAction(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static AutoStartAction valueOf(String str) {
            return (AutoStartAction) Enum.valueOf(AutoStartAction.class, str);
        }

        public static AutoStartAction[] values() {
            return (AutoStartAction[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0082 J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082 R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nj\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0014"}, d2 = {"Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Mode;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "deposit", "withdrawal", "analyticsMode", "", "getAnalyticsMode", "()Ljava/lang/String;", "Swift_analyticsMode", Keys.KEY_NAME, "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Mode implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode deposit = new Mode("deposit", 0);
        public static final Mode withdrawal = new Mode("withdrawal", 1);

        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{deposit, withdrawal};
        }

        static {
            Mode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Mode(String str, int i) {
        }

        private final native String Swift_analyticsMode(String name);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final String getAnalyticsMode() {
            return Swift_analyticsMode(name());
        }
    }

    public /* synthetic */ PaymentMethodsViewModel(Mode mode, AutoStartAction autoStartAction, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mode, (i & 2) != 0 ? null : autoStartAction, (i & 4) != 0 ? new Callbacks(null, null, null, 7, null) : callbacks);
    }

    private final native AutoStartAction Swift_autoStartAction(long Swift_peer);

    private final native AddressViewModel Swift_billingAddressFormViewModel(long Swift_peer);

    private final native void Swift_billingAddressFormViewModel_set(long Swift_peer, AddressViewModel value);

    private final native AddressViewModel Swift_billingAddressSearchViewModel(long Swift_peer);

    private final native void Swift_billingAddressSearchViewModel_set(long Swift_peer, AddressViewModel value);

    private final native APIAddress Swift_collectedBillingAddress(long Swift_peer);

    private final native void Swift_collectedBillingAddress_set(long Swift_peer, APIAddress value);

    private final native PaymentStep Swift_currentStep(long Swift_peer);

    private final native void Swift_currentStep_set(long Swift_peer, PaymentStep value);

    private final native EThemeSettings.Appearance Swift_currentTheme(long Swift_peer);

    private final native void Swift_currentTheme_set(long Swift_peer, EThemeSettings.Appearance value);

    private final native EDefaultDepositLimits Swift_defaultDepositLimits(long Swift_peer);

    private final native void Swift_defaultDepositLimits_set(long Swift_peer, EDefaultDepositLimits value);

    private final native EDefaultDepositLimits.Limits Swift_defaultLimits_0(long Swift_peer, EPaymentMethod.MethodType type);

    private final native Mode Swift_fundingMode(long Swift_peer);

    private final native boolean Swift_isAddressSearchExpanded(long Swift_peer);

    private final native void Swift_isAddressSearchExpanded_set(long Swift_peer, boolean value);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native void Swift_isLoading_set(long Swift_peer, boolean value);

    private final native boolean Swift_isPayPalLinkEnabled(long Swift_peer);

    private final native void Swift_isPayPalLinkEnabled_set(long Swift_peer, boolean value);

    private final native boolean Swift_isPlatformPayAvailable(long Swift_peer);

    private final native void Swift_isPlatformPayAvailable_set(long Swift_peer, boolean value);

    private final native boolean Swift_isQuickAddTestCardAvailable(long Swift_peer);

    private final native void Swift_isQuickAddTestCardAvailable_set(long Swift_peer, boolean value);

    private final native boolean Swift_isRemoveStoredMethodEnabled(long Swift_peer);

    private final native boolean Swift_isVenmoLinkEnabled(long Swift_peer);

    private final native void Swift_isVenmoLinkEnabled_set(long Swift_peer, boolean value);

    private final native LinkBankSelectionViewModel Swift_linkBankSelectionViewModel(long Swift_peer);

    private final native void Swift_linkBankSelectionViewModel_set(long Swift_peer, LinkBankSelectionViewModel value);

    private final native EPaymentMethod.MethodType Swift_linkPaymentMethodLoading(long Swift_peer);

    private final native void Swift_linkPaymentMethodLoading_set(long Swift_peer, EPaymentMethod.MethodType value);

    private final native LinkBankMFAViewModel Swift_mfaViewModel(long Swift_peer);

    private final native void Swift_mfaViewModel_set(long Swift_peer, LinkBankMFAViewModel value);

    private final native List<EPaymentMethod> Swift_otherStoredMethods(long Swift_peer);

    private final native EPaymentMethod.MethodType Swift_pendingPaymentMethodType(long Swift_peer);

    private final native void Swift_pendingPaymentMethodType_set(long Swift_peer, EPaymentMethod.MethodType value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native boolean Swift_quickAddTestCardLoading(long Swift_peer);

    private final native void Swift_quickAddTestCardLoading_set(long Swift_peer, boolean value);

    private final native EPaymentSelection Swift_selectedPaymentSelection(long Swift_peer);

    private final native void Swift_selectedPaymentSelection_set(long Swift_peer, EPaymentSelection value);

    private final native void Swift_sendInput_3(long Swift_peer, Input input);

    private final native void Swift_setup_2(long Swift_peer);

    private final native boolean Swift_shouldAnimateTransition(long Swift_peer);

    private final native void Swift_shouldAnimateTransition_set(long Swift_peer, boolean value);

    private final native boolean Swift_shouldShowAddPayPal(long Swift_peer);

    private final native void Swift_shouldShowAddPayPal_set(long Swift_peer, boolean value);

    private final native boolean Swift_shouldShowAddVenmo(long Swift_peer);

    private final native void Swift_shouldShowAddVenmo_set(long Swift_peer, boolean value);

    private final native List<EPaymentMethod> Swift_storedMethods(long Swift_peer);

    private final native void Swift_storedMethods_set(long Swift_peer, List<EPaymentMethod> value);

    private final native List<EPaymentMethod> Swift_storedPayPalMethods(long Swift_peer);

    private final native List<EPaymentMethod> Swift_storedVenmoMethods(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final EDefaultDepositLimits.Limits defaultLimits(EPaymentMethod.MethodType for_) {
        for_.getClass();
        return Swift_defaultLimits_0(getSwift_peer(), for_);
    }

    public final AutoStartAction getAutoStartAction() {
        return Swift_autoStartAction(getSwift_peer());
    }

    public final AddressViewModel getBillingAddressFormViewModel() {
        return Swift_billingAddressFormViewModel(getSwift_peer());
    }

    public final AddressViewModel getBillingAddressSearchViewModel() {
        return Swift_billingAddressSearchViewModel(getSwift_peer());
    }

    public final APIAddress getCollectedBillingAddress() {
        return Swift_collectedBillingAddress(getSwift_peer());
    }

    public final PaymentStep getCurrentStep() {
        return Swift_currentStep(getSwift_peer());
    }

    public final EThemeSettings.Appearance getCurrentTheme() {
        return Swift_currentTheme(getSwift_peer());
    }

    public final EDefaultDepositLimits getDefaultDepositLimits() {
        return Swift_defaultDepositLimits(getSwift_peer());
    }

    public final Mode getFundingMode() {
        return Swift_fundingMode(getSwift_peer());
    }

    public final LinkBankSelectionViewModel getLinkBankSelectionViewModel() {
        return Swift_linkBankSelectionViewModel(getSwift_peer());
    }

    public final EPaymentMethod.MethodType getLinkPaymentMethodLoading() {
        return Swift_linkPaymentMethodLoading(getSwift_peer());
    }

    public final LinkBankMFAViewModel getMfaViewModel() {
        return Swift_mfaViewModel(getSwift_peer());
    }

    public final List<EPaymentMethod> getOtherStoredMethods() {
        return Swift_otherStoredMethods(getSwift_peer());
    }

    public final EPaymentMethod.MethodType getPendingPaymentMethodType() {
        return Swift_pendingPaymentMethodType(getSwift_peer());
    }

    public final boolean getQuickAddTestCardLoading() {
        return Swift_quickAddTestCardLoading(getSwift_peer());
    }

    public final EPaymentSelection getSelectedPaymentSelection() {
        return Swift_selectedPaymentSelection(getSwift_peer());
    }

    public final boolean getShouldAnimateTransition() {
        return Swift_shouldAnimateTransition(getSwift_peer());
    }

    public final boolean getShouldShowAddPayPal() {
        return Swift_shouldShowAddPayPal(getSwift_peer());
    }

    public final boolean getShouldShowAddVenmo() {
        return Swift_shouldShowAddVenmo(getSwift_peer());
    }

    public final List<EPaymentMethod> getStoredMethods() {
        return Swift_storedMethods(getSwift_peer());
    }

    public final List<EPaymentMethod> getStoredPayPalMethods() {
        return Swift_storedPayPalMethods(getSwift_peer());
    }

    public final List<EPaymentMethod> getStoredVenmoMethods() {
        return Swift_storedVenmoMethods(getSwift_peer());
    }

    public final boolean isAddressSearchExpanded() {
        return Swift_isAddressSearchExpanded(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final boolean isPayPalLinkEnabled() {
        return Swift_isPayPalLinkEnabled(getSwift_peer());
    }

    public final boolean isPlatformPayAvailable() {
        return Swift_isPlatformPayAvailable(getSwift_peer());
    }

    public final boolean isQuickAddTestCardAvailable() {
        return Swift_isQuickAddTestCardAvailable(getSwift_peer());
    }

    public final boolean isRemoveStoredMethodEnabled() {
        return Swift_isRemoveStoredMethodEnabled(getSwift_peer());
    }

    public final boolean isVenmoLinkEnabled() {
        return Swift_isVenmoLinkEnabled(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_3(getSwift_peer(), input);
    }

    public final void setAddressSearchExpanded(boolean z) {
        Swift_isAddressSearchExpanded_set(getSwift_peer(), z);
    }

    public final void setBillingAddressFormViewModel(AddressViewModel addressViewModel) {
        Swift_billingAddressFormViewModel_set(getSwift_peer(), addressViewModel);
    }

    public final void setBillingAddressSearchViewModel(AddressViewModel addressViewModel) {
        Swift_billingAddressSearchViewModel_set(getSwift_peer(), addressViewModel);
    }

    public final void setCollectedBillingAddress(APIAddress aPIAddress) {
        Swift_collectedBillingAddress_set(getSwift_peer(), aPIAddress);
    }

    public final void setCurrentStep(PaymentStep paymentStep) {
        paymentStep.getClass();
        Swift_currentStep_set(getSwift_peer(), paymentStep);
    }

    public final void setCurrentTheme(EThemeSettings.Appearance appearance) {
        appearance.getClass();
        Swift_currentTheme_set(getSwift_peer(), appearance);
    }

    public final void setDefaultDepositLimits(EDefaultDepositLimits eDefaultDepositLimits) {
        Swift_defaultDepositLimits_set(getSwift_peer(), eDefaultDepositLimits);
    }

    public final void setLinkBankSelectionViewModel(LinkBankSelectionViewModel linkBankSelectionViewModel) {
        Swift_linkBankSelectionViewModel_set(getSwift_peer(), linkBankSelectionViewModel);
    }

    public final void setLinkPaymentMethodLoading(EPaymentMethod.MethodType methodType) {
        Swift_linkPaymentMethodLoading_set(getSwift_peer(), methodType);
    }

    public final void setLoading(boolean z) {
        Swift_isLoading_set(getSwift_peer(), z);
    }

    public final void setMfaViewModel(LinkBankMFAViewModel linkBankMFAViewModel) {
        Swift_mfaViewModel_set(getSwift_peer(), linkBankMFAViewModel);
    }

    public final void setPayPalLinkEnabled(boolean z) {
        Swift_isPayPalLinkEnabled_set(getSwift_peer(), z);
    }

    public final void setPendingPaymentMethodType(EPaymentMethod.MethodType methodType) {
        Swift_pendingPaymentMethodType_set(getSwift_peer(), methodType);
    }

    public final void setPlatformPayAvailable(boolean z) {
        Swift_isPlatformPayAvailable_set(getSwift_peer(), z);
    }

    public final void setQuickAddTestCardAvailable(boolean z) {
        Swift_isQuickAddTestCardAvailable_set(getSwift_peer(), z);
    }

    public final void setQuickAddTestCardLoading(boolean z) {
        Swift_quickAddTestCardLoading_set(getSwift_peer(), z);
    }

    public final void setSelectedPaymentSelection(EPaymentSelection ePaymentSelection) {
        Swift_selectedPaymentSelection_set(getSwift_peer(), ePaymentSelection);
    }

    public final void setShouldAnimateTransition(boolean z) {
        Swift_shouldAnimateTransition_set(getSwift_peer(), z);
    }

    public final void setShouldShowAddPayPal(boolean z) {
        Swift_shouldShowAddPayPal_set(getSwift_peer(), z);
    }

    public final void setShouldShowAddVenmo(boolean z) {
        Swift_shouldShowAddVenmo_set(getSwift_peer(), z);
    }

    public final void setStoredMethods(List<EPaymentMethod> list) {
        list.getClass();
        Swift_storedMethods_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setVenmoLinkEnabled(boolean z) {
        Swift_isVenmoLinkEnabled_set(getSwift_peer(), z);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_2(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001a2\u00020\u0001:\n\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\t\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnLinkPaymentMethodCase", "OnQuickAddTestCardCase", "OnSelectPaymentMethodCase", "OnRequestDeletePaymentMethodCase", "OnCancelDeletePaymentMethodCase", "OnDeletePaymentMethodCase", "OnShowWireDetailsCase", "OnBackCase", "Companion", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input$OnBackCase;", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input$OnCancelDeletePaymentMethodCase;", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input$OnDeletePaymentMethodCase;", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input$OnLinkPaymentMethodCase;", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input$OnQuickAddTestCardCase;", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input$OnRequestDeletePaymentMethodCase;", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input$OnSelectPaymentMethodCase;", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input$OnShowWireDetailsCase;", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input$OnViewDidLoadCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onQuickAddTestCard = new OnQuickAddTestCardCase();
        private static final Input onShowWireDetails = new OnShowWireDetailsCase();
        private static final Input onBack = new OnBackCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input$OnBackCase;", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnBackCase extends Input {
            public OnBackCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input$OnCancelDeletePaymentMethodCase;", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnCancelDeletePaymentMethodCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnCancelDeletePaymentMethodCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input$OnDeletePaymentMethodCase;", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDeletePaymentMethodCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnDeletePaymentMethodCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input$OnLinkPaymentMethodCase;", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input;", "associated0", "Lcom/polymarket/data/EPaymentMethod$MethodType;", "<init>", "(Lcom/polymarket/data/EPaymentMethod$MethodType;)V", "getAssociated0", "()Lcom/polymarket/data/EPaymentMethod$MethodType;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnLinkPaymentMethodCase extends Input {
            private final EPaymentMethod.MethodType associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnLinkPaymentMethodCase(EPaymentMethod.MethodType methodType) {
                super(null);
                methodType.getClass();
                this.associated0 = methodType;
            }

            public final EPaymentMethod.MethodType getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input$OnQuickAddTestCardCase;", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnQuickAddTestCardCase extends Input {
            public OnQuickAddTestCardCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input$OnRequestDeletePaymentMethodCase;", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input;", "associated0", "Lcom/polymarket/data/EPaymentMethod;", "<init>", "(Lcom/polymarket/data/EPaymentMethod;)V", "getAssociated0", "()Lcom/polymarket/data/EPaymentMethod;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRequestDeletePaymentMethodCase extends Input {
            private final EPaymentMethod associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnRequestDeletePaymentMethodCase(EPaymentMethod ePaymentMethod) {
                super(null);
                ePaymentMethod.getClass();
                this.associated0 = ePaymentMethod;
            }

            public final EPaymentMethod getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input$OnSelectPaymentMethodCase;", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input;", "associated0", "Lcom/polymarket/data/EPaymentSelection;", "<init>", "(Lcom/polymarket/data/EPaymentSelection;)V", "getAssociated0", "()Lcom/polymarket/data/EPaymentSelection;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSelectPaymentMethodCase extends Input {
            private final EPaymentSelection associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSelectPaymentMethodCase(EPaymentSelection ePaymentSelection) {
                super(null);
                ePaymentSelection.getClass();
                this.associated0 = ePaymentSelection;
            }

            public final EPaymentSelection getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input$OnShowWireDetailsCase;", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnShowWireDetailsCase extends Input {
            public OnShowWireDetailsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        public static final /* synthetic */ Input access$getOnBack$cp() {
            return onBack;
        }

        public static final /* synthetic */ Input access$getOnQuickAddTestCard$cp() {
            return onQuickAddTestCard;
        }

        public static final /* synthetic */ Input access$getOnShowWireDetails$cp() {
            return onShowWireDetails;
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
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Input;", "onLinkPaymentMethod", "associated0", "Lcom/polymarket/data/EPaymentMethod$MethodType;", "onQuickAddTestCard", "getOnQuickAddTestCard", "onSelectPaymentMethod", "Lcom/polymarket/data/EPaymentSelection;", "onRequestDeletePaymentMethod", "Lcom/polymarket/data/EPaymentMethod;", "onCancelDeletePaymentMethod", "", "onDeletePaymentMethod", "onShowWireDetails", "getOnShowWireDetails", "onBack", "getOnBack", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnBack() {
                return Input.access$getOnBack$cp();
            }

            public final Input getOnQuickAddTestCard() {
                return Input.access$getOnQuickAddTestCard$cp();
            }

            public final Input getOnShowWireDetails() {
                return Input.access$getOnShowWireDetails$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input onCancelDeletePaymentMethod(String associated0) {
                associated0.getClass();
                return new OnCancelDeletePaymentMethodCase(associated0);
            }

            public final Input onDeletePaymentMethod(String associated0) {
                associated0.getClass();
                return new OnDeletePaymentMethodCase(associated0);
            }

            public final Input onLinkPaymentMethod(EPaymentMethod.MethodType associated0) {
                associated0.getClass();
                return new OnLinkPaymentMethodCase(associated0);
            }

            public final Input onRequestDeletePaymentMethod(EPaymentMethod associated0) {
                associated0.getClass();
                return new OnRequestDeletePaymentMethodCase(associated0);
            }

            public final Input onSelectPaymentMethod(EPaymentSelection associated0) {
                associated0.getClass();
                return new OnSelectPaymentMethodCase(associated0);
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
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u001c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005:\u0001\u001cB\u001d\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0082 J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0082 R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u001d"}, d2 = {"Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$PaymentStep;", "Lskip/lib/CaseIterable;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "methodSelection", "billingAddressSearch", "billingAddressForm", "mfaVerification", "paymentSelection", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "Swift_title", Keys.KEY_NAME, "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class PaymentStep implements CaseIterable, RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ PaymentStep[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final PaymentStep methodSelection = new PaymentStep("methodSelection", 0, "method_selection", null, 2, null);
        public static final PaymentStep billingAddressSearch = new PaymentStep("billingAddressSearch", 1, "billing_address_search", null, 2, null);
        public static final PaymentStep billingAddressForm = new PaymentStep("billingAddressForm", 2, "billing_address_form", null, 2, null);
        public static final PaymentStep mfaVerification = new PaymentStep("mfaVerification", 3, "mfa_verification", null, 2, null);
        public static final PaymentStep paymentSelection = new PaymentStep("paymentSelection", 4, "payment_selection", null, 2, null);

        private static final /* synthetic */ PaymentStep[] $values() {
            return new PaymentStep[]{methodSelection, billingAddressSearch, billingAddressForm, mfaVerification, paymentSelection};
        }

        static {
            PaymentStep[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ PaymentStep(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native String Swift_title(String name);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static PaymentStep valueOf(String str) {
            return (PaymentStep) Enum.valueOf(PaymentStep.class, str);
        }

        public static PaymentStep[] values() {
            return (PaymentStep[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        public final String getTitle() {
            return Swift_title(name());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$PaymentStep$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$PaymentStep;", "<init>", "()V", "init", "rawValue", "", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion implements CaseIterableCompanion<PaymentStep> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // skip.lib.CaseIterableCompanion
            public Array<PaymentStep> getAllCases() {
                return ArrayKt.arrayOf(PaymentStep.methodSelection, PaymentStep.billingAddressSearch, PaymentStep.billingAddressForm, PaymentStep.mfaVerification, PaymentStep.paymentSelection);
            }

            public final PaymentStep init(String rawValue) {
                rawValue.getClass();
                switch (rawValue.hashCode()) {
                    case -2024059245:
                        if (!rawValue.equals("payment_selection")) {
                            return null;
                        }
                        return PaymentStep.paymentSelection;
                    case -1883444877:
                        if (rawValue.equals("billing_address_form")) {
                            return PaymentStep.billingAddressForm;
                        }
                        return null;
                    case -1749650670:
                        if (rawValue.equals("mfa_verification")) {
                            return PaymentStep.mfaVerification;
                        }
                        return null;
                    case -1446849897:
                        if (rawValue.equals("billing_address_search")) {
                            return PaymentStep.billingAddressSearch;
                        }
                        return null;
                    case 2092717998:
                        if (rawValue.equals("method_selection")) {
                            return PaymentStep.methodSelection;
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

        private PaymentStep(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0082 J\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011"}, d2 = {"Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_1", "", "Lskip/bridge/SwiftObjectPointer;", "fundingMode", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Mode;", "autoStartAction", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$AutoStartAction;", "callbacks", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Callbacks;", "PaymentStep", "Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$PaymentStep;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_1(Mode fundingMode, AutoStartAction autoStartAction, Callbacks callbacks);

        public static final /* synthetic */ long access$Swift_Companion_constructor_1(Companion companion, Mode mode, AutoStartAction autoStartAction, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_1(mode, autoStartAction, callbacks);
        }

        public final PaymentStep PaymentStep(String rawValue) {
            rawValue.getClass();
            return PaymentStep.INSTANCE.init(rawValue);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsViewModel(Mode mode, AutoStartAction autoStartAction, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_1(INSTANCE, mode, autoStartAction, callbacks), (SwiftPeerMarker) null);
        mode.getClass();
        callbacks.getClass();
    }

    public PaymentMethodsViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBE\b\u0016\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\b\u0010\u0012J\u0006\u0010\u0017\u001a\u00020\rJ\u0015\u0010\u0018\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J!\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JC\u0010'\u001a\u00060\u0004j\u0002`\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u000bH\u0082 J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000f2\u0006\u0010)\u001a\u00020\u001eH\u0016J\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000f2\u0006\u0010)\u001a\u00020\u001eH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010 ¨\u0006,"}, d2 = {"Lcom/polymarket/usviewmodels/PaymentMethodsViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onPaymentMethodSelected", "Lkotlin/Function1;", "Lcom/polymarket/data/EPaymentSelection;", "", "onCancel", "Lkotlin/Function0;", "onShowWireDetails", "Lcom/polymarket/data/EWireDetails;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnPaymentMethodSelected", "()Lkotlin/jvm/functions/Function1;", "Swift_onPaymentMethodSelected", "getOnCancel", "()Lkotlin/jvm/functions/Function0;", "Swift_onCancel", "getOnShowWireDetails", "Swift_onShowWireDetails", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function1 function1, Function0 function0, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new ajd(23) : function1, (i & 2) != 0 ? new ypd(15) : function0, (i & 4) != 0 ? new ajd(24) : function12);
        }

        private final native long Swift_constructor_0(Function1<? super EPaymentSelection, Unit> onPaymentMethodSelected, Function0<Unit> onCancel, Function1<? super EWireDetails, Unit> onShowWireDetails);

        private final native Function0<Unit> Swift_onCancel(long Swift_peer);

        private final native Function1<EPaymentSelection, Unit> Swift_onPaymentMethodSelected(long Swift_peer);

        private final native Function1<EWireDetails, Unit> Swift_onShowWireDetails(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(EPaymentSelection ePaymentSelection) {
            ePaymentSelection.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2(EWireDetails eWireDetails) {
            eWireDetails.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a() {
            return _init_$lambda$1();
        }

        public static /* synthetic */ Unit b(EPaymentSelection ePaymentSelection) {
            return _init_$lambda$0(ePaymentSelection);
        }

        public static /* synthetic */ Unit c(EWireDetails eWireDetails) {
            return _init_$lambda$2(eWireDetails);
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

        public final Function0<Unit> getOnCancel() {
            return Swift_onCancel(this.Swift_peer);
        }

        public final Function1<EPaymentSelection, Unit> getOnPaymentMethodSelected() {
            return Swift_onPaymentMethodSelected(this.Swift_peer);
        }

        public final Function1<EWireDetails, Unit> getOnShowWireDetails() {
            return Swift_onShowWireDetails(this.Swift_peer);
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

        public Callbacks(Function1<? super EPaymentSelection, Unit> function1, Function0<Unit> function0, Function1<? super EWireDetails, Unit> function12) {
            function1.getClass();
            function0.getClass();
            function12.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function1, function0, function12);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
