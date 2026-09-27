package com.polymarket.usviewmodels;

import com.checkout.components.wallet.BuildConfig;
import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.APIEventTag;
import com.polymarket.data.EAccountActivity;
import com.polymarket.data.EAmount;
import com.polymarket.data.EComboPopularProp;
import com.polymarket.data.EEvent;
import com.polymarket.data.EMarket;
import com.polymarket.data.EUserPosition;
import com.polymarket.usviewmodels.AppViewModel;
import com.polymarket.usviewmodels.UserPositionViewModel;
import defpackage.ace;
import defpackage.izi;
import defpackage.pkj;
import defpackage.qej;
import defpackage.qx7;
import defpackage.xyi;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Hasher;
import skip.lib.InOut;
import skip.lib.MutableStruct;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 Å\u00012\u00020\u0001:\bÂ\u0001Ã\u0001Ä\u0001Å\u0001B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bBU\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0007\u0010\u0016J\u0015\u0010\u001c\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u001d\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001f\u001a\u00020\fH\u0082 J\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00020!0 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010(\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0082 J\u001b\u0010-\u001a\b\u0012\u0004\u0012\u00020)0 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010.\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020)0 H\u0082 J\u001b\u00103\u001a\b\u0012\u0004\u0012\u00020/0 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u00104\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020/0 H\u0082 J\u001b\u00109\u001a\b\u0012\u0004\u0012\u0002050 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010:\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002050 H\u0082 J\u001b\u0010?\u001a\b\u0012\u0004\u0012\u00020;0 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010@\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020;0 H\u0082 J\u0015\u0010F\u001a\u00020\u00102\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010G\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001f\u001a\u00020\u0010H\u0082 J\u0015\u0010L\u001a\u00020I2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010O\u001a\u0004\u0018\u00010I2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010R\u001a\u0004\u0018\u00010I2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010U\u001a\b\u0012\u0004\u0012\u00020I0 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010X\u001a\u0004\u0018\u00010I2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010[\u001a\u0004\u0018\u00010I2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010_\u001a\u00020\u000e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010b\u001a\u0004\u0018\u00010I2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010e\u001a\u0004\u0018\u00010I2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010h\u001a\u0004\u0018\u00010I2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010k\u001a\u0004\u0018\u00010I2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010p\u001a\u00020m2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010s\u001a\u00020\u000e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010u\u001a\u00020\u000e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010x\u001a\u00020\u000e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010}\u001a\u0004\u0018\u00010z2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0011\u0010~\u001a\u0004\u0018\u00010\u007f2\u0007\u0010\u0080\u0001\u001a\u00020IJ!\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u007f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\u0082\u0001\u001a\u00020IH\u0082 J\u0016\u0010\u0085\u0001\u001a\u00020\u000e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0010\u0010\u0086\u0001\u001a\u00020\u000e2\u0007\u0010\u0087\u0001\u001a\u00020\u007fJ\u001e\u0010\u0088\u0001\u001a\u00020\u000e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010~\u001a\u00020\u007fH\u0082 J\u0016\u0010\u008b\u0001\u001a\u00020\u000e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0018\u0010\u008e\u0001\u001a\u0004\u0018\u00010I2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020I0 2\u0007\u0010\u0090\u0001\u001a\u00020\u000eJ%\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020I0 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\u0090\u0001\u001a\u00020\u000eH\u0082 J\u001d\u0010\u0095\u0001\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010 2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0098\u0001\u001a\u00020I2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0018\u0010\u009b\u0001\u001a\u0004\u0018\u00010I2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u009e\u0001\u001a\u00020I2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¡\u0001\u001a\u00020I2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¤\u0001\u001a\u00020I2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\t\u0010¥\u0001\u001a\u00020\u001eH\u0016J\u0016\u0010¦\u0001\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0011\u0010§\u0001\u001a\u00020\u001e2\b\u0010¨\u0001\u001a\u00030©\u0001J \u0010ª\u0001\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010¨\u0001\u001a\u00030©\u0001H\u0082 J\u000f\u0010«\u0001\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0015J\u001e\u0010¬\u0001\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0082 J\u0018\u0010\u00ad\u0001\u001a\u00020\u001e2\u000f\u0010®\u0001\u001a\n\u0012\u0005\u0012\u00030°\u00010¯\u0001J'\u0010±\u0001\u001a\u00020\u001e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u000f\u0010®\u0001\u001a\n\u0012\u0005\u0012\u00030°\u00010¯\u0001H\u0082 J\u0016\u0010²\u0001\u001a\u00020\u000e2\n\u0010³\u0001\u001a\u0005\u0018\u00010´\u0001H\u0096\u0002J\u001c\u0010µ\u0001\u001a\u00020\u000e2\u0007\u0010¶\u0001\u001a\u00020\u00002\u0007\u0010·\u0001\u001a\u00020\u0000H\u0082 J\t\u0010¸\u0001\u001a\u00020\u0010H\u0016J\u001a\u0010¹\u0001\u001a\u00020\u001e2\u000f\u0010º\u0001\u001a\n\u0012\u0005\u0012\u00030¼\u00010»\u0001H\u0016J\u0016\u0010½\u0001\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001a\u0010¾\u0001\u001a\n\u0012\u0005\u0012\u00030´\u00010¿\u00012\u0007\u0010À\u0001\u001a\u00020\u0010H\u0016J\u001b\u0010Á\u0001\u001a\n\u0012\u0005\u0012\u00030´\u00010¿\u00012\u0007\u0010À\u0001\u001a\u00020\u0010H\u0082 R$\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR0\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020!0 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R0\u0010*\u001a\b\u0012\u0004\u0012\u00020)0 2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020)0 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R0\u00100\u001a\b\u0012\u0004\u0012\u00020/0 2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020/0 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R0\u00106\u001a\b\u0012\u0004\u0012\u0002050 2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002050 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u0010$\"\u0004\b8\u0010&R0\u0010<\u001a\b\u0012\u0004\u0012\u00020;0 2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020;0 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010$\"\u0004\b>\u0010&R$\u0010A\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0011\u0010H\u001a\u00020I8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0013\u0010M\u001a\u0004\u0018\u00010I8F¢\u0006\u0006\u001a\u0004\bN\u0010KR\u0013\u0010P\u001a\u0004\u0018\u00010I8F¢\u0006\u0006\u001a\u0004\bQ\u0010KR\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020I0 8F¢\u0006\u0006\u001a\u0004\bT\u0010$R\u0013\u0010V\u001a\u0004\u0018\u00010I8F¢\u0006\u0006\u001a\u0004\bW\u0010KR\u0013\u0010Y\u001a\u0004\u0018\u00010I8F¢\u0006\u0006\u001a\u0004\bZ\u0010KR\u0011\u0010\\\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0013\u0010`\u001a\u0004\u0018\u00010I8F¢\u0006\u0006\u001a\u0004\ba\u0010KR\u0013\u0010c\u001a\u0004\u0018\u00010I8F¢\u0006\u0006\u001a\u0004\bd\u0010KR\u0013\u0010f\u001a\u0004\u0018\u00010I8F¢\u0006\u0006\u001a\u0004\bg\u0010KR\u0013\u0010i\u001a\u0004\u0018\u00010I8F¢\u0006\u0006\u001a\u0004\bj\u0010KR\u0011\u0010l\u001a\u00020m8F¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0011\u0010q\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\br\u0010^R\u0011\u0010t\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bt\u0010^R\u0011\u0010v\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bw\u0010^R\u0013\u0010y\u001a\u0004\u0018\u00010z8F¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0013\u0010\u0083\u0001\u001a\u00020\u000e8F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010^R\u0013\u0010\u0089\u0001\u001a\u00020\u000e8F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010^R\u0015\u0010\u008c\u0001\u001a\u0004\u0018\u00010I8F¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010KR\u001a\u0010\u0092\u0001\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010 8F¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010$R\u0013\u0010\u0096\u0001\u001a\u00020I8F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010KR\u0015\u0010\u0099\u0001\u001a\u0004\u0018\u00010I8F¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010KR\u0013\u0010\u009c\u0001\u001a\u00020I8F¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010KR\u0013\u0010\u009f\u0001\u001a\u00020I8F¢\u0006\u0007\u001a\u0005\b \u0001\u0010KR\u0013\u0010¢\u0001\u001a\u00020I8F¢\u0006\u0007\u001a\u0005\b£\u0001\u0010K¨\u0006Æ\u0001"}, d2 = {"Lcom/polymarket/usviewmodels/USEventCardViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", "event", "Lcom/polymarket/data/EEvent;", "autoSubscribe", "", "visibleRowCount", "", "showsPositions", "hidesDrawRows", "compactsDisplayVolume", "callbacks", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/AppSceneType;Lcom/polymarket/data/EEvent;ZIZZZLcom/polymarket/usviewmodels/USEventCardViewModel$Callbacks;)V", "newValue", "getEvent", "()Lcom/polymarket/data/EEvent;", "setEvent", "(Lcom/polymarket/data/EEvent;)V", "Swift_event", "Swift_event_set", "", "value", "", "Lcom/polymarket/usviewmodels/UserPositionViewModel;", "userPositionVMs", "getUserPositionVMs", "()Ljava/util/List;", "setUserPositionVMs", "(Ljava/util/List;)V", "Swift_userPositionVMs", "Swift_userPositionVMs_set", "Lcom/polymarket/data/EAccountActivity;", "outcomeResolutionActivities", "getOutcomeResolutionActivities", "setOutcomeResolutionActivities", "Swift_outcomeResolutionActivities", "Swift_outcomeResolutionActivities_set", "Lcom/polymarket/usviewmodels/StandardMarketPresentation;", "standardRows", "getStandardRows", "setStandardRows", "Swift_standardRows", "Swift_standardRows_set", "Lcom/polymarket/usviewmodels/SportsOutcomePresentation;", "sportsRows", "getSportsRows", "setSportsRows", "Swift_sportsRows", "Swift_sportsRows_set", "Lcom/polymarket/usviewmodels/ComboPopularPropPresentation;", "popularProps", "getPopularProps", "setPopularProps", "Swift_popularProps", "Swift_popularProps_set", "standardRemainingCount", "getStandardRemainingCount", "()I", "setStandardRemainingCount", "(I)V", "Swift_standardRemainingCount", "Swift_standardRemainingCount_set", "layoutHeightSignature", "", "getLayoutHeightSignature", "()Ljava/lang/String;", "Swift_layoutHeightSignature", "standardEventHeaderSubtitleText", "getStandardEventHeaderSubtitleText", "Swift_standardEventHeaderSubtitleText", "standardEventHeaderSubtitleTextExcludingCategory", "getStandardEventHeaderSubtitleTextExcludingCategory", "Swift_standardEventHeaderSubtitleTextExcludingCategory", "sportsEventCellHeaderDetailTexts", "getSportsEventCellHeaderDetailTexts", "Swift_sportsEventCellHeaderDetailTexts", "sportsEventCellHeaderTitleText", "getSportsEventCellHeaderTitleText", "Swift_sportsEventCellHeaderTitleText", "sportsEventCellHeaderStatusText", "getSportsEventCellHeaderStatusText", "Swift_sportsEventCellHeaderStatusText", "sportsEventCellHeaderStatusIsCritical", "getSportsEventCellHeaderStatusIsCritical", "()Z", "Swift_sportsEventCellHeaderStatusIsCritical", "sportsEventCellHeaderLeagueText", "getSportsEventCellHeaderLeagueText", "Swift_sportsEventCellHeaderLeagueText", "sportsEventCellHeaderCategoryText", "getSportsEventCellHeaderCategoryText", "Swift_sportsEventCellHeaderCategoryText", "featuredSportsHeaderStatusText", "getFeaturedSportsHeaderStatusText", "Swift_featuredSportsHeaderStatusText", "featuredSportsHeaderCategoryText", "getFeaturedSportsHeaderCategoryText", "Swift_featuredSportsHeaderCategoryText", "cardKind", "Lcom/polymarket/usviewmodels/USEventCardViewModel$CardKind;", "getCardKind", "()Lcom/polymarket/usviewmodels/USEventCardViewModel$CardKind;", "Swift_cardKind", "hasPosition", "getHasPosition", "Swift_hasPosition", "isFinishedWithoutOutcome", "Swift_isFinishedWithoutOutcome", "hasResolution", "getHasResolution", "Swift_hasResolution", "finishedPnL", "Lcom/polymarket/data/EAmount;", "getFinishedPnL", "()Lcom/polymarket/data/EAmount;", "Swift_finishedPnL", "position", "Lcom/polymarket/data/EUserPosition;", "forMarketSlug", "Swift_position_0", "slug", "marketResolutionUXEnabled", "getMarketResolutionUXEnabled", "Swift_marketResolutionUXEnabled", "isResolutionPending", "for_", "Swift_isResolutionPending_1", "combosEnabled", "getCombosEnabled", "Swift_combosEnabled", "displayVolumeText", "getDisplayVolumeText", "Swift_displayVolumeText", "combosFooterTexts", "usesComboMarketCountsOnly", "Swift_combosFooterTexts_2", "positionRows", "Lcom/polymarket/usviewmodels/UserPositionPresentation;", "getPositionRows", "Swift_positionRows", "positionsSectionTitle", "getPositionsSectionTitle", "Swift_positionsSectionTitle", "positionsSectionTrailingText", "getPositionsSectionTrailingText", "Swift_positionsSectionTrailingText", "gameLinesSectionTitle", "getGameLinesSectionTitle", "Swift_gameLinesSectionTitle", "pickSideTitle", "getPickSideTitle", "Swift_pickSideTitle", "viewIdentity", "getViewIdentity", "Swift_viewIdentity", "setup", "Swift_setup_4", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input;", "Swift_sendInput_5", "setCallbacks", "Swift_setCallbacks_6", "applySelectedMarketSides", "keys", "", "Lcom/polymarket/usviewmodels/MarketSideKey;", "Swift_applySelectedMarketSides_7", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "hash", "into", "Lskip/lib/InOut;", "Lskip/lib/Hasher;", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Callbacks", "CardKind", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class USEventCardViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ USEventCardViewModel(AppSceneType appSceneType, EEvent eEvent, boolean z, int i, boolean z2, boolean z3, boolean z4, Callbacks callbacks, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(appSceneType, eEvent, r6, r7, r8, r9, r10, r11);
        boolean z5;
        int i3;
        boolean z6;
        boolean z7;
        boolean z8;
        Callbacks callbacks2;
        if ((i2 & 4) != 0) {
            z5 = true;
        } else {
            z5 = z;
        }
        if ((i2 & 8) != 0) {
            i3 = 3;
        } else {
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            z6 = true;
        } else {
            z6 = z2;
        }
        if ((i2 & 32) != 0) {
            z7 = false;
        } else {
            z7 = z3;
        }
        if ((i2 & 64) != 0) {
            z8 = false;
        } else {
            z8 = z4;
        }
        if ((i2 & 128) != 0) {
            callbacks2 = new Callbacks(null, null, null, null, null, null, null, null, null, 511, null);
        } else {
            callbacks2 = callbacks;
        }
    }

    private final native void Swift_applySelectedMarketSides_7(long Swift_peer, Set<MarketSideKey> keys);

    private final native CardKind Swift_cardKind(long Swift_peer);

    private final native boolean Swift_combosEnabled(long Swift_peer);

    private final native List<String> Swift_combosFooterTexts_2(long Swift_peer, boolean usesComboMarketCountsOnly);

    private final native String Swift_displayVolumeText(long Swift_peer);

    private final native EEvent Swift_event(long Swift_peer);

    private final native void Swift_event_set(long Swift_peer, EEvent value);

    private final native String Swift_featuredSportsHeaderCategoryText(long Swift_peer);

    private final native String Swift_featuredSportsHeaderStatusText(long Swift_peer);

    private final native EAmount Swift_finishedPnL(long Swift_peer);

    private final native String Swift_gameLinesSectionTitle(long Swift_peer);

    private final native boolean Swift_hasPosition(long Swift_peer);

    private final native boolean Swift_hasResolution(long Swift_peer);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native boolean Swift_isFinishedWithoutOutcome(long Swift_peer);

    private final native boolean Swift_isResolutionPending_1(long Swift_peer, EUserPosition position);

    private final native boolean Swift_isequal(USEventCardViewModel lhs, USEventCardViewModel rhs);

    private final native String Swift_layoutHeightSignature(long Swift_peer);

    private final native boolean Swift_marketResolutionUXEnabled(long Swift_peer);

    private final native List<EAccountActivity> Swift_outcomeResolutionActivities(long Swift_peer);

    private final native void Swift_outcomeResolutionActivities_set(long Swift_peer, List<? extends EAccountActivity> value);

    private final native String Swift_pickSideTitle(long Swift_peer);

    private final native List<ComboPopularPropPresentation> Swift_popularProps(long Swift_peer);

    private final native void Swift_popularProps_set(long Swift_peer, List<ComboPopularPropPresentation> value);

    private final native List<UserPositionPresentation> Swift_positionRows(long Swift_peer);

    private final native EUserPosition Swift_position_0(long Swift_peer, String slug);

    private final native String Swift_positionsSectionTitle(long Swift_peer);

    private final native String Swift_positionsSectionTrailingText(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_sendInput_5(long Swift_peer, Input input);

    private final native void Swift_setCallbacks_6(long Swift_peer, Callbacks callbacks);

    private final native void Swift_setup_4(long Swift_peer);

    private final native String Swift_sportsEventCellHeaderCategoryText(long Swift_peer);

    private final native List<String> Swift_sportsEventCellHeaderDetailTexts(long Swift_peer);

    private final native String Swift_sportsEventCellHeaderLeagueText(long Swift_peer);

    private final native boolean Swift_sportsEventCellHeaderStatusIsCritical(long Swift_peer);

    private final native String Swift_sportsEventCellHeaderStatusText(long Swift_peer);

    private final native String Swift_sportsEventCellHeaderTitleText(long Swift_peer);

    private final native List<SportsOutcomePresentation> Swift_sportsRows(long Swift_peer);

    private final native void Swift_sportsRows_set(long Swift_peer, List<SportsOutcomePresentation> value);

    private final native String Swift_standardEventHeaderSubtitleText(long Swift_peer);

    private final native String Swift_standardEventHeaderSubtitleTextExcludingCategory(long Swift_peer);

    private final native int Swift_standardRemainingCount(long Swift_peer);

    private final native void Swift_standardRemainingCount_set(long Swift_peer, int value);

    private final native List<StandardMarketPresentation> Swift_standardRows(long Swift_peer);

    private final native void Swift_standardRows_set(long Swift_peer, List<StandardMarketPresentation> value);

    private final native List<UserPositionViewModel> Swift_userPositionVMs(long Swift_peer);

    private final native void Swift_userPositionVMs_set(long Swift_peer, List<UserPositionViewModel> value);

    private final native String Swift_viewIdentity(long Swift_peer);

    public static /* synthetic */ Unit c(Ref.ObjectRef objectRef, Hasher hasher) {
        return hashCode$lambda$1(objectRef, hasher);
    }

    public static /* synthetic */ Hasher d(Ref.ObjectRef objectRef) {
        return hashCode$lambda$0(objectRef);
    }

    private static final Hasher hashCode$lambda$0(Ref.ObjectRef objectRef) {
        return (Hasher) objectRef.a;
    }

    private static final Unit hashCode$lambda$1(Ref.ObjectRef objectRef, Hasher hasher) {
        hasher.getClass();
        objectRef.a = hasher;
        return Unit.INSTANCE;
    }

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final void applySelectedMarketSides(Set<MarketSideKey> keys) {
        keys.getClass();
        Swift_applySelectedMarketSides_7(getSwift_peer(), keys);
    }

    public final List<String> combosFooterTexts(boolean usesComboMarketCountsOnly) {
        return Swift_combosFooterTexts_2(getSwift_peer(), usesComboMarketCountsOnly);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public boolean equals(Object other) {
        if (!(other instanceof USEventCardViewModel)) {
            return false;
        }
        return Swift_isequal(this, (USEventCardViewModel) other);
    }

    public final CardKind getCardKind() {
        return Swift_cardKind(getSwift_peer());
    }

    public final boolean getCombosEnabled() {
        return Swift_combosEnabled(getSwift_peer());
    }

    public final String getDisplayVolumeText() {
        return Swift_displayVolumeText(getSwift_peer());
    }

    public final EEvent getEvent() {
        return Swift_event(getSwift_peer());
    }

    public final String getFeaturedSportsHeaderCategoryText() {
        return Swift_featuredSportsHeaderCategoryText(getSwift_peer());
    }

    public final String getFeaturedSportsHeaderStatusText() {
        return Swift_featuredSportsHeaderStatusText(getSwift_peer());
    }

    public final EAmount getFinishedPnL() {
        return Swift_finishedPnL(getSwift_peer());
    }

    public final String getGameLinesSectionTitle() {
        return Swift_gameLinesSectionTitle(getSwift_peer());
    }

    public final boolean getHasPosition() {
        return Swift_hasPosition(getSwift_peer());
    }

    public final boolean getHasResolution() {
        return Swift_hasResolution(getSwift_peer());
    }

    public final String getLayoutHeightSignature() {
        return Swift_layoutHeightSignature(getSwift_peer());
    }

    public final boolean getMarketResolutionUXEnabled() {
        return Swift_marketResolutionUXEnabled(getSwift_peer());
    }

    public final List<EAccountActivity> getOutcomeResolutionActivities() {
        return Swift_outcomeResolutionActivities(getSwift_peer());
    }

    public final String getPickSideTitle() {
        return Swift_pickSideTitle(getSwift_peer());
    }

    public final List<ComboPopularPropPresentation> getPopularProps() {
        return Swift_popularProps(getSwift_peer());
    }

    public final List<UserPositionPresentation> getPositionRows() {
        return Swift_positionRows(getSwift_peer());
    }

    public final String getPositionsSectionTitle() {
        return Swift_positionsSectionTitle(getSwift_peer());
    }

    public final String getPositionsSectionTrailingText() {
        return Swift_positionsSectionTrailingText(getSwift_peer());
    }

    public final String getSportsEventCellHeaderCategoryText() {
        return Swift_sportsEventCellHeaderCategoryText(getSwift_peer());
    }

    public final List<String> getSportsEventCellHeaderDetailTexts() {
        return Swift_sportsEventCellHeaderDetailTexts(getSwift_peer());
    }

    public final String getSportsEventCellHeaderLeagueText() {
        return Swift_sportsEventCellHeaderLeagueText(getSwift_peer());
    }

    public final boolean getSportsEventCellHeaderStatusIsCritical() {
        return Swift_sportsEventCellHeaderStatusIsCritical(getSwift_peer());
    }

    public final String getSportsEventCellHeaderStatusText() {
        return Swift_sportsEventCellHeaderStatusText(getSwift_peer());
    }

    public final String getSportsEventCellHeaderTitleText() {
        return Swift_sportsEventCellHeaderTitleText(getSwift_peer());
    }

    public final List<SportsOutcomePresentation> getSportsRows() {
        return Swift_sportsRows(getSwift_peer());
    }

    public final String getStandardEventHeaderSubtitleText() {
        return Swift_standardEventHeaderSubtitleText(getSwift_peer());
    }

    public final String getStandardEventHeaderSubtitleTextExcludingCategory() {
        return Swift_standardEventHeaderSubtitleTextExcludingCategory(getSwift_peer());
    }

    public final int getStandardRemainingCount() {
        return Swift_standardRemainingCount(getSwift_peer());
    }

    public final List<StandardMarketPresentation> getStandardRows() {
        return Swift_standardRows(getSwift_peer());
    }

    public final List<UserPositionViewModel> getUserPositionVMs() {
        return Swift_userPositionVMs(getSwift_peer());
    }

    public final String getViewIdentity() {
        return Swift_viewIdentity(getSwift_peer());
    }

    public void hash(InOut<Hasher> into) {
        into.getClass();
        into.getValue().combine(Long.valueOf(Swift_hashvalue(getSwift_peer())));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    @Override // com.polymarket.usviewmodels.AppViewModel
    public int hashCode() {
        ?? obj = new Object();
        obj.a = new Hasher();
        hash(new InOut<>(new xyi(obj, 2), new izi(obj, 7)));
        return ((Hasher) obj.a).getResult();
    }

    public final boolean isFinishedWithoutOutcome() {
        return Swift_isFinishedWithoutOutcome(getSwift_peer());
    }

    public final boolean isResolutionPending(EUserPosition for_) {
        for_.getClass();
        return Swift_isResolutionPending_1(getSwift_peer(), for_);
    }

    public final EUserPosition position(String forMarketSlug) {
        forMarketSlug.getClass();
        return Swift_position_0(getSwift_peer(), forMarketSlug);
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_5(getSwift_peer(), input);
    }

    public final void setCallbacks(Callbacks callbacks) {
        callbacks.getClass();
        Swift_setCallbacks_6(getSwift_peer(), callbacks);
    }

    public final void setEvent(EEvent eEvent) {
        eEvent.getClass();
        Swift_event_set(getSwift_peer(), (EEvent) StructKt.sref$default(eEvent, null, 1, null));
    }

    public final void setOutcomeResolutionActivities(List<? extends EAccountActivity> list) {
        list.getClass();
        Swift_outcomeResolutionActivities_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setPopularProps(List<ComboPopularPropPresentation> list) {
        list.getClass();
        Swift_popularProps_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setSportsRows(List<SportsOutcomePresentation> list) {
        list.getClass();
        Swift_sportsRows_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setStandardRemainingCount(int i) {
        Swift_standardRemainingCount_set(getSwift_peer(), i);
    }

    public final void setStandardRows(List<StandardMarketPresentation> list) {
        list.getClass();
        Swift_standardRows_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setUserPositionVMs(List<UserPositionViewModel> list) {
        list.getClass();
        Swift_userPositionVMs_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_4(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \r2\u00020\u0001:\u0004\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/polymarket/usviewmodels/USEventCardViewModel$CardKind;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "SportsCase", "StandardCase", "EmptyCase", "Companion", "Lcom/polymarket/usviewmodels/USEventCardViewModel$CardKind$EmptyCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$CardKind$SportsCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$CardKind$StandardCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class CardKind implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final CardKind empty = new EmptyCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USEventCardViewModel$CardKind$EmptyCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$CardKind;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class EmptyCase extends CardKind {
            public EmptyCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USEventCardViewModel$CardKind$SportsCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$CardKind;", "associated0", "Lcom/polymarket/data/EEvent$SportsGame;", "<init>", "(Lcom/polymarket/data/EEvent$SportsGame;)V", "getAssociated0", "()Lcom/polymarket/data/EEvent$SportsGame;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class SportsCase extends CardKind {
            private final EEvent.SportsGame associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SportsCase(EEvent.SportsGame sportsGame) {
                super(null);
                sportsGame.getClass();
                this.associated0 = sportsGame;
            }

            public final EEvent.SportsGame getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USEventCardViewModel$CardKind$StandardCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$CardKind;", "associated0", "Lcom/polymarket/data/EEvent$StandardEvent;", "<init>", "(Lcom/polymarket/data/EEvent$StandardEvent;)V", "getAssociated0", "()Lcom/polymarket/data/EEvent$StandardEvent;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class StandardCase extends CardKind {
            private final EEvent.StandardEvent associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StandardCase(EEvent.StandardEvent standardEvent) {
                super(null);
                standardEvent.getClass();
                this.associated0 = standardEvent;
            }

            public final EEvent.StandardEvent getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ CardKind(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ CardKind access$getEmpty$cp() {
            return empty;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/polymarket/usviewmodels/USEventCardViewModel$CardKind$Companion;", "", "<init>", "()V", "sports", "Lcom/polymarket/usviewmodels/USEventCardViewModel$CardKind;", "associated0", "Lcom/polymarket/data/EEvent$SportsGame;", BuildConfig.FLAVOR, "Lcom/polymarket/data/EEvent$StandardEvent;", "empty", "getEmpty", "()Lcom/polymarket/usviewmodels/USEventCardViewModel$CardKind;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CardKind getEmpty() {
                return CardKind.access$getEmpty$cp();
            }

            public final CardKind sports(EEvent.SportsGame associated0) {
                associated0.getClass();
                return new SportsCase(associated0);
            }

            public final CardKind standard(EEvent.StandardEvent associated0) {
                associated0.getClass();
                return new StandardCase(associated0);
            }

            private Companion() {
            }
        }

        private CardKind() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001e2\u00020\u0001:\u000e\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\r\u001f !\"#$%&'()*+¨\u0006,"}, d2 = {"Lcom/polymarket/usviewmodels/USEventCardViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnVisibilityChangedCase", "OnSelectCase", "UpdateFromRefreshCase", "EnableRealTimeUpdatesCase", "DisableRealTimeUpdatesCase", "OnMarketSideSelectedCase", "OnBuyMoreForPositionCase", "OnCashOutPositionCase", "OnShowSettingsCase", "OnEventDetailCase", "OnBuildComboButtonPressedCase", "OnPopularPropSideSelectedCase", "OnPopularPropSelectedCase", "Companion", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$DisableRealTimeUpdatesCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$EnableRealTimeUpdatesCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$OnBuildComboButtonPressedCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$OnBuyMoreForPositionCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$OnCashOutPositionCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$OnEventDetailCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$OnMarketSideSelectedCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$OnPopularPropSelectedCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$OnPopularPropSideSelectedCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$OnSelectCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$OnShowSettingsCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$OnVisibilityChangedCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$UpdateFromRefreshCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onSelect = new OnSelectCase();
        private static final Input enableRealTimeUpdates = new EnableRealTimeUpdatesCase();
        private static final Input disableRealTimeUpdates = new DisableRealTimeUpdatesCase();
        private static final Input onShowSettings = new OnShowSettingsCase();
        private static final Input onEventDetail = new OnEventDetailCase();
        private static final Input onBuildComboButtonPressed = new OnBuildComboButtonPressedCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$DisableRealTimeUpdatesCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class DisableRealTimeUpdatesCase extends Input {
            public DisableRealTimeUpdatesCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$EnableRealTimeUpdatesCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class EnableRealTimeUpdatesCase extends Input {
            public EnableRealTimeUpdatesCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$OnBuildComboButtonPressedCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnBuildComboButtonPressedCase extends Input {
            public OnBuildComboButtonPressedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$OnBuyMoreForPositionCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input;", "associated0", "Lcom/polymarket/data/EUserPosition;", "<init>", "(Lcom/polymarket/data/EUserPosition;)V", "getAssociated0", "()Lcom/polymarket/data/EUserPosition;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnBuyMoreForPositionCase extends Input {
            private final EUserPosition associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnBuyMoreForPositionCase(EUserPosition eUserPosition) {
                super(null);
                eUserPosition.getClass();
                this.associated0 = eUserPosition;
            }

            public final EUserPosition getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$OnCashOutPositionCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input;", "associated0", "Lcom/polymarket/data/EUserPosition;", "<init>", "(Lcom/polymarket/data/EUserPosition;)V", "getAssociated0", "()Lcom/polymarket/data/EUserPosition;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnCashOutPositionCase extends Input {
            private final EUserPosition associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnCashOutPositionCase(EUserPosition eUserPosition) {
                super(null);
                eUserPosition.getClass();
                this.associated0 = eUserPosition;
            }

            public final EUserPosition getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$OnEventDetailCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnEventDetailCase extends Input {
            public OnEventDetailCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$OnMarketSideSelectedCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input;", "associated0", "Lcom/polymarket/data/EMarket;", "associated1", "Lcom/polymarket/data/EMarket$MarketSide;", "<init>", "(Lcom/polymarket/data/EMarket;Lcom/polymarket/data/EMarket$MarketSide;)V", "getAssociated0", "()Lcom/polymarket/data/EMarket;", "getAssociated1", "()Lcom/polymarket/data/EMarket$MarketSide;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnMarketSideSelectedCase extends Input {
            private final EMarket associated0;
            private final EMarket.MarketSide associated1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnMarketSideSelectedCase(EMarket eMarket, EMarket.MarketSide marketSide) {
                super(null);
                eMarket.getClass();
                marketSide.getClass();
                this.associated0 = eMarket;
                this.associated1 = marketSide;
            }

            public final EMarket getAssociated0() {
                return this.associated0;
            }

            public final EMarket.MarketSide getAssociated1() {
                return this.associated1;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$OnPopularPropSelectedCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input;", "associated0", "", "associated1", "", "<init>", "(Ljava/lang/String;Z)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", "()Z", "expandsLine", "getExpandsLine", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPopularPropSelectedCase extends Input {
            private final String associated0;
            private final boolean associated1;
            private final boolean expandsLine;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnPopularPropSelectedCase(String str, boolean z) {
                super(null);
                str.getClass();
                this.associated0 = str;
                this.associated1 = z;
                this.expandsLine = z;
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public final boolean getAssociated1() {
                return this.associated1;
            }

            public final boolean getExpandsLine() {
                return this.expandsLine;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$OnPopularPropSideSelectedCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input;", "associated0", "", "associated1", "", "<init>", "(Ljava/lang/String;Z)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", "()Z", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPopularPropSideSelectedCase extends Input {
            private final String associated0;
            private final boolean associated1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnPopularPropSideSelectedCase(String str, boolean z) {
                super(null);
                str.getClass();
                this.associated0 = str;
                this.associated1 = z;
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public final boolean getAssociated1() {
                return this.associated1;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$OnSelectCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSelectCase extends Input {
            public OnSelectCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$OnShowSettingsCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnShowSettingsCase extends Input {
            public OnShowSettingsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$OnVisibilityChangedCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input;", "associated0", "", "associated1", "", "<init>", "(ZLjava/lang/String;)V", "getAssociated0", "()Z", "getAssociated1", "()Ljava/lang/String;", "hostId", "getHostId", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnVisibilityChangedCase extends Input {
            private final boolean associated0;
            private final String associated1;
            private final String hostId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnVisibilityChangedCase(boolean z, String str) {
                super(null);
                str.getClass();
                this.associated0 = z;
                this.associated1 = str;
                this.hostId = str;
            }

            public final boolean getAssociated0() {
                return this.associated0;
            }

            public final String getAssociated1() {
                return this.associated1;
            }

            public final String getHostId() {
                return this.hostId;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$UpdateFromRefreshCase;", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input;", "associated0", "Lcom/polymarket/data/EEvent;", "<init>", "(Lcom/polymarket/data/EEvent;)V", "getAssociated0", "()Lcom/polymarket/data/EEvent;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class UpdateFromRefreshCase extends Input {
            private final EEvent associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateFromRefreshCase(EEvent eEvent) {
                super(null);
                eEvent.getClass();
                this.associated0 = eEvent;
            }

            public final EEvent getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getDisableRealTimeUpdates$cp() {
            return disableRealTimeUpdates;
        }

        public static final /* synthetic */ Input access$getEnableRealTimeUpdates$cp() {
            return enableRealTimeUpdates;
        }

        public static final /* synthetic */ Input access$getOnBuildComboButtonPressed$cp() {
            return onBuildComboButtonPressed;
        }

        public static final /* synthetic */ Input access$getOnEventDetail$cp() {
            return onEventDetail;
        }

        public static final /* synthetic */ Input access$getOnSelect$cp() {
            return onSelect;
        }

        public static final /* synthetic */ Input access$getOnShowSettings$cp() {
            return onShowSettings;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000eJ\u0016\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0018J\u0016\u0010 \u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0007J\u0016\u0010!\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\fR\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\fR\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\f¨\u0006#"}, d2 = {"Lcom/polymarket/usviewmodels/USEventCardViewModel$Input$Companion;", "", "<init>", "()V", "onVisibilityChanged", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Input;", "associated0", "", "hostId", "", "onSelect", "getOnSelect", "()Lcom/polymarket/usviewmodels/USEventCardViewModel$Input;", "updateFromRefresh", "Lcom/polymarket/data/EEvent;", "enableRealTimeUpdates", "getEnableRealTimeUpdates", "disableRealTimeUpdates", "getDisableRealTimeUpdates", "onMarketSideSelected", "Lcom/polymarket/data/EMarket;", "associated1", "Lcom/polymarket/data/EMarket$MarketSide;", "onBuyMoreForPosition", "Lcom/polymarket/data/EUserPosition;", "onCashOutPosition", "onShowSettings", "getOnShowSettings", "onEventDetail", "getOnEventDetail", "onBuildComboButtonPressed", "getOnBuildComboButtonPressed", "onPopularPropSideSelected", "onPopularPropSelected", "expandsLine", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getDisableRealTimeUpdates() {
                return Input.access$getDisableRealTimeUpdates$cp();
            }

            public final Input getEnableRealTimeUpdates() {
                return Input.access$getEnableRealTimeUpdates$cp();
            }

            public final Input getOnBuildComboButtonPressed() {
                return Input.access$getOnBuildComboButtonPressed$cp();
            }

            public final Input getOnEventDetail() {
                return Input.access$getOnEventDetail$cp();
            }

            public final Input getOnSelect() {
                return Input.access$getOnSelect$cp();
            }

            public final Input getOnShowSettings() {
                return Input.access$getOnShowSettings$cp();
            }

            public final Input onBuyMoreForPosition(EUserPosition associated0) {
                associated0.getClass();
                return new OnBuyMoreForPositionCase(associated0);
            }

            public final Input onCashOutPosition(EUserPosition associated0) {
                associated0.getClass();
                return new OnCashOutPositionCase(associated0);
            }

            public final Input onMarketSideSelected(EMarket associated0, EMarket.MarketSide associated1) {
                associated0.getClass();
                associated1.getClass();
                return new OnMarketSideSelectedCase(associated0, associated1);
            }

            public final Input onPopularPropSelected(String associated0, boolean expandsLine) {
                associated0.getClass();
                return new OnPopularPropSelectedCase(associated0, expandsLine);
            }

            public final Input onPopularPropSideSelected(String associated0, boolean associated1) {
                associated0.getClass();
                return new OnPopularPropSideSelectedCase(associated0, associated1);
            }

            public final Input onVisibilityChanged(boolean associated0, String hostId) {
                hostId.getClass();
                return new OnVisibilityChangedCase(associated0, hostId);
            }

            public final Input updateFromRefresh(EEvent associated0) {
                associated0.getClass();
                return new UpdateFromRefreshCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fJ\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0082 J\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u001c2\u0006\u0010\u0016\u001a\u00020\u001dJ\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u001c2\u0006\u0010\u001f\u001a\u00020\u001dH\u0082 J \u0010 \u001a\u0004\u0018\u00010\u00152\b\u0010!\u001a\u0004\u0018\u00010\u00152\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150\u001cJ#\u0010#\u001a\u0004\u0018\u00010\u00152\b\u0010!\u001a\u0004\u0018\u00010\u00152\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150\u001cH\u0082 J\u0010\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010&J\u0013\u0010'\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010&H\u0082 J\u0010\u0010(\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010&J\u0013\u0010)\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010&H\u0082 J\u0010\u0010*\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u001dJ\u0013\u0010+\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001f\u001a\u00020\u001dH\u0082 J\u0010\u0010,\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u001dJ\u0013\u0010-\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001f\u001a\u00020\u001dH\u0082 J\u000e\u0010.\u001a\u00020/2\u0006\u0010\t\u001a\u00020\nJ\u0011\u00100\u001a\u00020/2\u0006\u0010\t\u001a\u00020\nH\u0082 ¨\u00061"}, d2 = {"Lcom/polymarket/usviewmodels/USEventCardViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_3", "", "Lskip/bridge/SwiftObjectPointer;", "scene", "Lcom/polymarket/usviewmodels/AppSceneType;", "event", "Lcom/polymarket/data/EEvent;", "autoSubscribe", "", "visibleRowCount", "", "showsPositions", "hidesDrawRows", "compactsDisplayVolume", "callbacks", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Callbacks;", "standardEventHeaderSubtitleText", "", "for_", "Lcom/polymarket/data/EEvent$StandardEvent;", "displayCategory", "Swift_Companion_standardEventHeaderSubtitleText_8", "standardEvent", "sportsEventCellHeaderDetailTexts", "", "Lcom/polymarket/data/EEvent$SportsGame;", "Swift_Companion_sportsEventCellHeaderDetailTexts_9", "gameEvent", "sportsEventCellHeaderContextText", "league", "details", "Swift_Companion_sportsEventCellHeaderContextText_10", "sportsSubheaderShowsLeague", "definingTabType", "Lcom/polymarket/data/APIEventTag$NavigationType;", "Swift_Companion_sportsSubheaderShowsLeague_11", "sportsSubheaderShowsCategory", "Swift_Companion_sportsSubheaderShowsCategory_12", "sportsUpcomingTimeText", "Swift_Companion_sportsUpcomingTimeText_13", "sportsEventCellHeaderLeagueText", "Swift_Companion_sportsEventCellHeaderLeagueText_14", "mock", "Lcom/polymarket/usviewmodels/USEventCardViewModel;", "Swift_Companion_mock_15", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_3(AppSceneType scene, EEvent event, boolean autoSubscribe, int visibleRowCount, boolean showsPositions, boolean hidesDrawRows, boolean compactsDisplayVolume, Callbacks callbacks);

        private final native USEventCardViewModel Swift_Companion_mock_15(EEvent event);

        private final native String Swift_Companion_sportsEventCellHeaderContextText_10(String league, List<String> details);

        private final native List<String> Swift_Companion_sportsEventCellHeaderDetailTexts_9(EEvent.SportsGame gameEvent);

        private final native String Swift_Companion_sportsEventCellHeaderLeagueText_14(EEvent.SportsGame gameEvent);

        private final native boolean Swift_Companion_sportsSubheaderShowsCategory_12(APIEventTag.NavigationType definingTabType);

        private final native boolean Swift_Companion_sportsSubheaderShowsLeague_11(APIEventTag.NavigationType definingTabType);

        private final native String Swift_Companion_sportsUpcomingTimeText_13(EEvent.SportsGame gameEvent);

        private final native String Swift_Companion_standardEventHeaderSubtitleText_8(EEvent.StandardEvent standardEvent, boolean displayCategory);

        public static final /* synthetic */ long access$Swift_Companion_constructor_3(Companion companion, AppSceneType appSceneType, EEvent eEvent, boolean z, int i, boolean z2, boolean z3, boolean z4, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_3(appSceneType, eEvent, z, i, z2, z3, z4, callbacks);
        }

        public final USEventCardViewModel mock(EEvent event) {
            event.getClass();
            return Swift_Companion_mock_15(event);
        }

        public final String sportsEventCellHeaderContextText(String league, List<String> details) {
            details.getClass();
            return Swift_Companion_sportsEventCellHeaderContextText_10(league, details);
        }

        public final List<String> sportsEventCellHeaderDetailTexts(EEvent.SportsGame for_) {
            for_.getClass();
            return Swift_Companion_sportsEventCellHeaderDetailTexts_9(for_);
        }

        public final String sportsEventCellHeaderLeagueText(EEvent.SportsGame for_) {
            for_.getClass();
            return Swift_Companion_sportsEventCellHeaderLeagueText_14(for_);
        }

        public final boolean sportsSubheaderShowsCategory(APIEventTag.NavigationType definingTabType) {
            return Swift_Companion_sportsSubheaderShowsCategory_12(definingTabType);
        }

        public final boolean sportsSubheaderShowsLeague(APIEventTag.NavigationType definingTabType) {
            return Swift_Companion_sportsSubheaderShowsLeague_11(definingTabType);
        }

        public final String sportsUpcomingTimeText(EEvent.SportsGame for_) {
            for_.getClass();
            return Swift_Companion_sportsUpcomingTimeText_13(for_);
        }

        public final String standardEventHeaderSubtitleText(EEvent.StandardEvent for_, boolean displayCategory) {
            for_.getClass();
            return Swift_Companion_standardEventHeaderSubtitleText_8(for_, displayCategory);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USEventCardViewModel(AppSceneType appSceneType, EEvent eEvent, boolean z, int i, boolean z2, boolean z3, boolean z4, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_3(INSTANCE, appSceneType, eEvent, z, i, z2, z3, z4, callbacks), (SwiftPeerMarker) null);
        appSceneType.getClass();
        eEvent.getClass();
        callbacks.getClass();
    }

    public USEventCardViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b-\b\u0007\u0018\u0000 X2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001XB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nBÝ\u0001\b\u0016\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012 \b\u0002\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014\u0012\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\f\u0012 \b\u0002\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000e0\u0010\u0012 \b\u0002\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0010¢\u0006\u0004\b\t\u0010\u001fB\u0011\b\u0012\u0012\u0006\u0010 \u001a\u00020\u0001¢\u0006\u0004\b\t\u0010!J\u0006\u0010&\u001a\u00020\u000eJ\u0015\u0010'\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010(\u001a\u00020\u001d2\b\u0010)\u001a\u0004\u0018\u00010*H\u0096\u0002J\b\u0010+\u001a\u00020,H\u0016J!\u00102\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J)\u00103\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0082 J-\u00107\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00102\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001b\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00142\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J!\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010?\u001a\u00020\u00182\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001b\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00142\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J#\u0010D\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J+\u0010E\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0014\u00104\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\fH\u0082 J-\u0010G\u001a\u001a\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000e0\u00102\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J-\u0010I\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00102\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 JÏ\u0001\u0010J\u001a\u00060\u0005j\u0002`\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00142\u0014\u0010\u001a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\f2\u001e\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000e0\u00102\u001e\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0010H\u0082 J\u0015\u0010K\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010 \u001a\u00020\u0001H\u0082 J\b\u0010T\u001a\u00020\u0001H\u0016J\u0016\u0010U\u001a\b\u0012\u0004\u0012\u00020*0\u00142\u0006\u0010V\u001a\u00020,H\u0016J\u0017\u0010W\u001a\b\u0012\u0004\u0012\u00020*0\u00142\u0006\u0010V\u001a\u00020,H\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R<\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R)\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00108F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00148F¢\u0006\u0006\u001a\u0004\b8\u00109R\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\f8F¢\u0006\u0006\u001a\u0004\b;\u0010/R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00148F¢\u0006\u0006\u001a\u0004\b@\u00109R@\u0010\u001a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\f2\u0014\u0010-\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010/\"\u0004\bC\u00101R)\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000e0\u00108F¢\u0006\u0006\u001a\u0004\bF\u00106R)\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00108F¢\u0006\u0006\u001a\u0004\bH\u00106R(\u0010L\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010/\"\u0004\bN\u00101R\u001a\u0010O\u001a\u00020,X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006Y"}, d2 = {"Lcom/polymarket/usviewmodels/USEventCardViewModel$Callbacks;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onEventSelected", "Lkotlin/Function1;", "Lcom/polymarket/data/EEvent;", "", "onMarketSideSelected", "Lkotlin/Function3;", "Lcom/polymarket/data/EMarket;", "Lcom/polymarket/data/EMarket$MarketSide;", "onShowSettings", "Lkotlin/Function0;", "onShare", "Lcom/polymarket/data/EUserPosition;", "userPositionCallbacks", "Lcom/polymarket/usviewmodels/UserPositionViewModel$Callbacks;", "onEventStatusChanged", "onBuildComboSelected", "onPopularPropSelected", "Lcom/polymarket/data/EComboPopularProp;", "", "onPopularPropSideSelected", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/polymarket/usviewmodels/UserPositionViewModel$Callbacks;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "other", "", "hashCode", "", "newValue", "getOnEventSelected", "()Lkotlin/jvm/functions/Function1;", "setOnEventSelected", "(Lkotlin/jvm/functions/Function1;)V", "Swift_onEventSelected", "Swift_onEventSelected_set", "value", "getOnMarketSideSelected", "()Lkotlin/jvm/functions/Function3;", "Swift_onMarketSideSelected", "getOnShowSettings", "()Lkotlin/jvm/functions/Function0;", "Swift_onShowSettings", "getOnShare", "Swift_onShare", "getUserPositionCallbacks", "()Lcom/polymarket/usviewmodels/UserPositionViewModel$Callbacks;", "Swift_userPositionCallbacks", "getOnEventStatusChanged", "Swift_onEventStatusChanged", "getOnBuildComboSelected", "setOnBuildComboSelected", "Swift_onBuildComboSelected", "Swift_onBuildComboSelected_set", "getOnPopularPropSelected", "Swift_onPopularPropSelected", "getOnPopularPropSideSelected", "Swift_onPopularPropSideSelected", "Swift_constructor_0", "Swift_constructor_1", "supdate", "getSupdate", "setSupdate", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Callbacks(Function1 function1, Function3 function3, Function0 function0, Function1 function12, UserPositionViewModel.Callbacks callbacks, Function0 function02, Function1 function13, Function3 function32, Function3 function33, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(r1, r2, r3, r4, r6, r5, r7, r8, r26);
            Function1 function14;
            Function3 function34;
            Function0 function03;
            Function1 function15;
            UserPositionViewModel.Callbacks callbacks2;
            Function0 function04;
            Function1 function16;
            Function3 function35;
            Function3 function36;
            if ((i & 1) != 0) {
                function14 = new pkj(25);
            } else {
                function14 = function1;
            }
            if ((i & 2) != 0) {
                function34 = new qx7(21);
            } else {
                function34 = function3;
            }
            if ((i & 4) != 0) {
                function03 = new qej(15);
            } else {
                function03 = function0;
            }
            if ((i & 8) != 0) {
                function15 = new pkj(26);
            } else {
                function15 = function12;
            }
            if ((i & 16) != 0) {
                callbacks2 = new UserPositionViewModel.Callbacks(null, null, null, null, null, null, null, 127, null);
            } else {
                callbacks2 = callbacks;
            }
            if ((i & 32) != 0) {
                function04 = new qej(16);
            } else {
                function04 = function02;
            }
            if ((i & 64) != 0) {
                function16 = new pkj(27);
            } else {
                function16 = function13;
            }
            if ((i & 128) != 0) {
                function35 = new qx7(22);
            } else {
                function35 = function32;
            }
            if ((i & 256) != 0) {
                function36 = new qx7(23);
            } else {
                function36 = function33;
            }
        }

        private final native long Swift_constructor_0(Function1<? super EEvent, Unit> onEventSelected, Function3<? super EMarket, ? super EMarket.MarketSide, ? super EEvent, Unit> onMarketSideSelected, Function0<Unit> onShowSettings, Function1<? super EUserPosition, Unit> onShare, UserPositionViewModel.Callbacks userPositionCallbacks, Function0<Unit> onEventStatusChanged, Function1<? super EEvent, Unit> onBuildComboSelected, Function3<? super EComboPopularProp, ? super EEvent, ? super Boolean, Unit> onPopularPropSelected, Function3<? super EMarket, ? super EMarket.MarketSide, ? super EEvent, Unit> onPopularPropSideSelected);

        private final native long Swift_constructor_1(MutableStruct copy);

        private final native Function1<EEvent, Unit> Swift_onBuildComboSelected(long Swift_peer);

        private final native void Swift_onBuildComboSelected_set(long Swift_peer, Function1<? super EEvent, Unit> value);

        private final native Function1<EEvent, Unit> Swift_onEventSelected(long Swift_peer);

        private final native void Swift_onEventSelected_set(long Swift_peer, Function1<? super EEvent, Unit> value);

        private final native Function0<Unit> Swift_onEventStatusChanged(long Swift_peer);

        private final native Function3<EMarket, EMarket.MarketSide, EEvent, Unit> Swift_onMarketSideSelected(long Swift_peer);

        private final native Function3<EComboPopularProp, EEvent, Boolean, Unit> Swift_onPopularPropSelected(long Swift_peer);

        private final native Function3<EMarket, EMarket.MarketSide, EEvent, Unit> Swift_onPopularPropSideSelected(long Swift_peer);

        private final native Function1<EUserPosition, Unit> Swift_onShare(long Swift_peer);

        private final native Function0<Unit> Swift_onShowSettings(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native UserPositionViewModel.Callbacks Swift_userPositionCallbacks(long Swift_peer);

        private static final Unit _init_$lambda$0(EEvent eEvent) {
            eEvent.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(EMarket eMarket, EMarket.MarketSide marketSide, EEvent eEvent) {
            ace.z(eEvent, eMarket, marketSide);
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$3(EUserPosition eUserPosition) {
            eUserPosition.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$4() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$5(EEvent eEvent) {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$6(EComboPopularProp eComboPopularProp, EEvent eEvent, boolean z) {
            eComboPopularProp.getClass();
            eEvent.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$7(EMarket eMarket, EMarket.MarketSide marketSide, EEvent eEvent) {
            ace.z(eEvent, eMarket, marketSide);
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(EEvent eEvent, EMarket eMarket, EMarket.MarketSide marketSide) {
            return _init_$lambda$1(eMarket, marketSide, eEvent);
        }

        public static /* synthetic */ Unit b(EEvent eEvent) {
            return _init_$lambda$5(eEvent);
        }

        public static /* synthetic */ Unit c(EEvent eEvent, EMarket eMarket, EMarket.MarketSide marketSide) {
            return _init_$lambda$7(eMarket, marketSide, eEvent);
        }

        public static /* synthetic */ Unit d(EUserPosition eUserPosition) {
            return _init_$lambda$3(eUserPosition);
        }

        public static /* synthetic */ Unit e() {
            return _init_$lambda$2();
        }

        public static /* synthetic */ Unit f() {
            return _init_$lambda$4();
        }

        public static /* synthetic */ Unit g(EEvent eEvent) {
            return _init_$lambda$0(eEvent);
        }

        public static /* synthetic */ Unit h(EComboPopularProp eComboPopularProp, EEvent eEvent, boolean z) {
            return _init_$lambda$6(eComboPopularProp, eEvent, z);
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

        public final Function1<EEvent, Unit> getOnBuildComboSelected() {
            return Swift_onBuildComboSelected(this.Swift_peer);
        }

        public final Function1<EEvent, Unit> getOnEventSelected() {
            return Swift_onEventSelected(this.Swift_peer);
        }

        public final Function0<Unit> getOnEventStatusChanged() {
            return Swift_onEventStatusChanged(this.Swift_peer);
        }

        public final Function3<EMarket, EMarket.MarketSide, EEvent, Unit> getOnMarketSideSelected() {
            return Swift_onMarketSideSelected(this.Swift_peer);
        }

        public final Function3<EComboPopularProp, EEvent, Boolean, Unit> getOnPopularPropSelected() {
            return Swift_onPopularPropSelected(this.Swift_peer);
        }

        public final Function3<EMarket, EMarket.MarketSide, EEvent, Unit> getOnPopularPropSideSelected() {
            return Swift_onPopularPropSideSelected(this.Swift_peer);
        }

        public final Function1<EUserPosition, Unit> getOnShare() {
            return Swift_onShare(this.Swift_peer);
        }

        public final Function0<Unit> getOnShowSettings() {
            return Swift_onShowSettings(this.Swift_peer);
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

        public final UserPositionViewModel.Callbacks getUserPositionCallbacks() {
            return Swift_userPositionCallbacks(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new Callbacks(this);
        }

        public final void setOnBuildComboSelected(Function1<? super EEvent, Unit> function1) {
            function1.getClass();
            willmutate();
            try {
                Swift_onBuildComboSelected_set(this.Swift_peer, function1);
            } finally {
                didmutate();
            }
        }

        public final void setOnEventSelected(Function1<? super EEvent, Unit> function1) {
            function1.getClass();
            willmutate();
            try {
                Swift_onEventSelected_set(this.Swift_peer, function1);
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

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        public Callbacks(Function1<? super EEvent, Unit> function1, Function3<? super EMarket, ? super EMarket.MarketSide, ? super EEvent, Unit> function3, Function0<Unit> function0, Function1<? super EUserPosition, Unit> function12, UserPositionViewModel.Callbacks callbacks, Function0<Unit> function02, Function1<? super EEvent, Unit> function13, Function3<? super EComboPopularProp, ? super EEvent, ? super Boolean, Unit> function32, Function3<? super EMarket, ? super EMarket.MarketSide, ? super EEvent, Unit> function33) {
            function1.getClass();
            function3.getClass();
            function0.getClass();
            function12.getClass();
            callbacks.getClass();
            function02.getClass();
            function13.getClass();
            function32.getClass();
            function33.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function1, function3, function0, function12, callbacks, function02, function13, function32, function33);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private Callbacks(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_1(mutableStruct);
        }
    }
}
