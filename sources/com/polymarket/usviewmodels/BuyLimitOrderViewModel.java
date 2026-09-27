package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.EAmount;
import com.polymarket.data.EEvent;
import com.polymarket.data.EMarket;
import com.polymarket.data.EPromoBannerTemplate;
import com.polymarket.data.EQuantity;
import com.polymarket.data.ETIFOption;
import com.polymarket.data.LimitOrderInputPriceDisplay;
import com.polymarket.data.LimitOrderInputSharesDisplay;
import com.polymarket.data.NumberPadKey;
import com.polymarket.data.OddsFormat;
import com.polymarket.usdependencies.GeoComplianceVerdict;
import com.polymarket.usviewmodels.AppViewModel;
import com.polymarket.usviewmodels.PromoBannerViewModel;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010 \n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000 Ú\u00022\u00020\u0001:\nÖ\u0002×\u0002Ø\u0002Ù\u0002Ú\u0002B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rJ\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u001b\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u001c\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001d\u001a\u00020\nH\u0082 J\u0015\u0010\"\u001a\u00020\u001f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010'\u001a\u0004\u0018\u00010$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010,\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u00103\u001a\u0004\u0018\u00010-2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u00104\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010-H\u0082 J\u0015\u0010;\u001a\u0002052\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010<\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001d\u001a\u000205H\u0082 J\u0015\u0010C\u001a\u00020=2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010D\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001d\u001a\u00020=H\u0082 J\u0015\u0010H\u001a\u00020=2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010I\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001d\u001a\u00020=H\u0082 J\u0017\u0010N\u001a\u0004\u0018\u00010K2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010Q\u001a\u0004\u0018\u00010K2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010V\u001a\u0004\u0018\u00010K2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010W\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010KH\u0082 J\u0017\u0010[\u001a\u0004\u0018\u00010K2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010\\\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010KH\u0082 J\u0017\u0010`\u001a\u0004\u0018\u00010K2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010a\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010KH\u0082 J\u0017\u0010e\u001a\u0004\u0018\u00010K2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010f\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010KH\u0082 J\u0015\u0010j\u001a\u00020K2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010k\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001d\u001a\u00020KH\u0082 J\u0015\u0010r\u001a\u00020l2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010s\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001d\u001a\u00020lH\u0082 J\u0015\u0010w\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010x\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001d\u001a\u00020)H\u0082 J\u0015\u0010{\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010|\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001d\u001a\u00020)H\u0082 J\u0018\u0010\u0083\u0001\u001a\u0004\u0018\u00010}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J \u0010\u0084\u0001\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010}H\u0082 J\u0016\u0010\u0088\u0001\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010\u0089\u0001\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001d\u001a\u00020)H\u0082 J\u0016\u0010\u008d\u0001\u001a\u00020}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010\u008e\u0001\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001d\u001a\u00020}H\u0082 J\u0016\u0010\u0092\u0001\u001a\u00020}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010\u0093\u0001\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001d\u001a\u00020}H\u0082 J\u0017\u0010\u0098\u0001\u001a\u00030\u0095\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010\u009d\u0001\u001a\u00030\u009a\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u009f\u0001\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¡\u0001\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¤\u0001\u001a\u00020}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¦\u0001\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010©\u0001\u001a\u00020=2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¬\u0001\u001a\u00020=2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0018\u0010¯\u0001\u001a\u0004\u0018\u00010K2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010´\u0001\u001a\u00030±\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0018\u0010·\u0001\u001a\u0004\u0018\u00010}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010º\u0001\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010½\u0001\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010À\u0001\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Ã\u0001\u001a\u00020}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Æ\u0001\u001a\u00020}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010É\u0001\u001a\u00020}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Ì\u0001\u001a\u00020}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Ï\u0001\u001a\u00020}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Ò\u0001\u001a\u00020}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0018\u0010Õ\u0001\u001a\u0004\u0018\u00010}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Ù\u0001\u001a\u00020=2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010Ú\u0001\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001d\u001a\u00020=H\u0082 J\u0018\u0010Ý\u0001\u001a\u0004\u0018\u00010}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010á\u0001\u001a\u00020=2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010â\u0001\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001d\u001a\u00020=H\u0082 J\u0016\u0010å\u0001\u001a\u00020}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010ê\u0001\u001a\t\u0012\u0004\u0012\u00020l0ç\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010í\u0001\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010ï\u0001\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010ò\u0001\u001a\u00020}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010õ\u0001\u001a\u00020}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010ø\u0001\u001a\u00020}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010û\u0001\u001a\u00020}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010þ\u0001\u001a\u00020}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0081\u0002\u001a\u00020}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0084\u0002\u001a\u00020}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0087\u0002\u001a\u00020}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u008a\u0002\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u008d\u0002\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0090\u0002\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0093\u0002\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0096\u0002\u001a\u00020}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010\u009b\u0002\u001a\u00030\u0098\u00022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010 \u0002\u001a\u00030\u009d\u00022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010£\u0002\u001a\u00020=2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010¦\u0002\u001a\u00030\u009d\u00022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010©\u0002\u001a\u00020=2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0019\u0010¬\u0002\u001a\u0005\u0018\u00010\u0098\u00022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¯\u0002\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010²\u0002\u001a\u00020}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010µ\u0002\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¸\u0002\u001a\u00020=2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010º\u0002\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010½\u0002\u001a\u00020}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010À\u0002\u001a\u00020}2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Å\u0002\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010Æ\u0002\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001d\u001a\u00020\fH\u0082 J\t\u0010Ç\u0002\u001a\u00020\u0014H\u0016J\u0016\u0010È\u0002\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0011\u0010É\u0002\u001a\u00020\u00142\b\u0010Ê\u0002\u001a\u00030Ë\u0002J \u0010Ì\u0002\u001a\u00020\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010Ê\u0002\u001a\u00030Ë\u0002H\u0082 J\u0011\u0010Í\u0002\u001a\u00020)2\b\u0010Î\u0002\u001a\u00030Ï\u0002J \u0010Ð\u0002\u001a\u00020)2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010Î\u0002\u001a\u00030Ï\u0002H\u0082 J\u001a\u0010Ñ\u0002\u001a\n\u0012\u0005\u0012\u00030Ó\u00020Ò\u00022\u0007\u0010Ô\u0002\u001a\u00020=H\u0016J\u001b\u0010Õ\u0002\u001a\n\u0012\u0005\u0012\u00030Ó\u00020Ò\u00022\u0007\u0010Ô\u0002\u001a\u00020=H\u0082 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R$\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010#\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010(\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R(\u0010.\u001a\u0004\u0018\u00010-2\b\u0010\u0016\u001a\u0004\u0018\u00010-8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00106\u001a\u0002052\u0006\u0010\u0016\u001a\u0002058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010>\u001a\u00020=2\u0006\u0010\u0016\u001a\u00020=8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010E\u001a\u00020=2\u0006\u0010\u0016\u001a\u00020=8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010@\"\u0004\bG\u0010BR\u0013\u0010J\u001a\u0004\u0018\u00010K8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0013\u0010O\u001a\u0004\u0018\u00010K8F¢\u0006\u0006\u001a\u0004\bP\u0010MR(\u0010R\u001a\u0004\u0018\u00010K2\b\u0010\u0016\u001a\u0004\u0018\u00010K8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010M\"\u0004\bT\u0010UR(\u0010X\u001a\u0004\u0018\u00010K2\b\u0010\u0016\u001a\u0004\u0018\u00010K8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010M\"\u0004\bZ\u0010UR(\u0010]\u001a\u0004\u0018\u00010K2\b\u0010\u0016\u001a\u0004\u0018\u00010K8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010M\"\u0004\b_\u0010UR(\u0010b\u001a\u0004\u0018\u00010K2\b\u0010\u0016\u001a\u0004\u0018\u00010K8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bc\u0010M\"\u0004\bd\u0010UR$\u0010g\u001a\u00020K2\u0006\u0010\u0016\u001a\u00020K8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010M\"\u0004\bi\u0010UR$\u0010m\u001a\u00020l2\u0006\u0010\u0016\u001a\u00020l8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u0010t\u001a\u00020)2\u0006\u0010\u0016\u001a\u00020)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bt\u0010+\"\u0004\bu\u0010vR$\u0010y\u001a\u00020)2\u0006\u0010\u0016\u001a\u00020)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\by\u0010+\"\u0004\bz\u0010vR+\u0010~\u001a\u0004\u0018\u00010}2\b\u0010\u0016\u001a\u0004\u0018\u00010}8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R'\u0010\u0085\u0001\u001a\u00020)2\u0006\u0010\u0016\u001a\u00020)8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0086\u0001\u0010+\"\u0005\b\u0087\u0001\u0010vR)\u0010\u008a\u0001\u001a\u00020}2\u0006\u0010\u0016\u001a\u00020}8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008b\u0001\u0010\u0080\u0001\"\u0006\b\u008c\u0001\u0010\u0082\u0001R)\u0010\u008f\u0001\u001a\u00020}2\u0006\u0010\u0016\u001a\u00020}8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0090\u0001\u0010\u0080\u0001\"\u0006\b\u0091\u0001\u0010\u0082\u0001R\u0015\u0010\u0094\u0001\u001a\u00030\u0095\u00018F¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0015\u0010\u0099\u0001\u001a\u00030\u009a\u00018F¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0013\u0010\u009e\u0001\u001a\u00020)8F¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010+R\u0013\u0010 \u0001\u001a\u00020)8F¢\u0006\u0007\u001a\u0005\b \u0001\u0010+R\u0014\u0010¢\u0001\u001a\u00020}8F¢\u0006\b\u001a\u0006\b£\u0001\u0010\u0080\u0001R\u0013\u0010¥\u0001\u001a\u00020)8F¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010+R\u0013\u0010§\u0001\u001a\u00020=8F¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010@R\u0013\u0010ª\u0001\u001a\u00020=8F¢\u0006\u0007\u001a\u0005\b«\u0001\u0010@R\u0015\u0010\u00ad\u0001\u001a\u0004\u0018\u00010K8F¢\u0006\u0007\u001a\u0005\b®\u0001\u0010MR\u0015\u0010°\u0001\u001a\u00030±\u00018F¢\u0006\b\u001a\u0006\b²\u0001\u0010³\u0001R\u0016\u0010µ\u0001\u001a\u0004\u0018\u00010}8F¢\u0006\b\u001a\u0006\b¶\u0001\u0010\u0080\u0001R\u0013\u0010¸\u0001\u001a\u00020)8F¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010+R\u0013\u0010»\u0001\u001a\u00020)8F¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010+R\u0013\u0010¾\u0001\u001a\u00020)8F¢\u0006\u0007\u001a\u0005\b¿\u0001\u0010+R\u0014\u0010Á\u0001\u001a\u00020}8F¢\u0006\b\u001a\u0006\bÂ\u0001\u0010\u0080\u0001R\u0014\u0010Ä\u0001\u001a\u00020}8F¢\u0006\b\u001a\u0006\bÅ\u0001\u0010\u0080\u0001R\u0014\u0010Ç\u0001\u001a\u00020}8F¢\u0006\b\u001a\u0006\bÈ\u0001\u0010\u0080\u0001R\u0014\u0010Ê\u0001\u001a\u00020}8F¢\u0006\b\u001a\u0006\bË\u0001\u0010\u0080\u0001R\u0014\u0010Í\u0001\u001a\u00020}8F¢\u0006\b\u001a\u0006\bÎ\u0001\u0010\u0080\u0001R\u0014\u0010Ð\u0001\u001a\u00020}8F¢\u0006\b\u001a\u0006\bÑ\u0001\u0010\u0080\u0001R\u0016\u0010Ó\u0001\u001a\u0004\u0018\u00010}8F¢\u0006\b\u001a\u0006\bÔ\u0001\u0010\u0080\u0001R'\u0010Ö\u0001\u001a\u00020=2\u0006\u0010\u0016\u001a\u00020=8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b×\u0001\u0010@\"\u0005\bØ\u0001\u0010BR\u0016\u0010Û\u0001\u001a\u0004\u0018\u00010}8F¢\u0006\b\u001a\u0006\bÜ\u0001\u0010\u0080\u0001R'\u0010Þ\u0001\u001a\u00020=2\u0006\u0010\u0016\u001a\u00020=8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bß\u0001\u0010@\"\u0005\bà\u0001\u0010BR\u0014\u0010ã\u0001\u001a\u00020}8F¢\u0006\b\u001a\u0006\bä\u0001\u0010\u0080\u0001R\u001b\u0010æ\u0001\u001a\t\u0012\u0004\u0012\u00020l0ç\u00018F¢\u0006\b\u001a\u0006\bè\u0001\u0010é\u0001R\u0013\u0010ë\u0001\u001a\u00020)8F¢\u0006\u0007\u001a\u0005\bì\u0001\u0010+R\u0013\u0010î\u0001\u001a\u00020)8F¢\u0006\u0007\u001a\u0005\bî\u0001\u0010+R\u0014\u0010ð\u0001\u001a\u00020}8F¢\u0006\b\u001a\u0006\bñ\u0001\u0010\u0080\u0001R\u0014\u0010ó\u0001\u001a\u00020}8F¢\u0006\b\u001a\u0006\bô\u0001\u0010\u0080\u0001R\u0014\u0010ö\u0001\u001a\u00020}8F¢\u0006\b\u001a\u0006\b÷\u0001\u0010\u0080\u0001R\u0014\u0010ù\u0001\u001a\u00020}8F¢\u0006\b\u001a\u0006\bú\u0001\u0010\u0080\u0001R\u0014\u0010ü\u0001\u001a\u00020}8F¢\u0006\b\u001a\u0006\bý\u0001\u0010\u0080\u0001R\u0014\u0010ÿ\u0001\u001a\u00020}8F¢\u0006\b\u001a\u0006\b\u0080\u0002\u0010\u0080\u0001R\u0014\u0010\u0082\u0002\u001a\u00020}8F¢\u0006\b\u001a\u0006\b\u0083\u0002\u0010\u0080\u0001R\u0014\u0010\u0085\u0002\u001a\u00020}8F¢\u0006\b\u001a\u0006\b\u0086\u0002\u0010\u0080\u0001R\u0013\u0010\u0088\u0002\u001a\u00020)8F¢\u0006\u0007\u001a\u0005\b\u0089\u0002\u0010+R\u0013\u0010\u008b\u0002\u001a\u00020)8F¢\u0006\u0007\u001a\u0005\b\u008c\u0002\u0010+R\u0013\u0010\u008e\u0002\u001a\u00020)8F¢\u0006\u0007\u001a\u0005\b\u008f\u0002\u0010+R\u0013\u0010\u0091\u0002\u001a\u00020)8F¢\u0006\u0007\u001a\u0005\b\u0092\u0002\u0010+R\u0014\u0010\u0094\u0002\u001a\u00020}8F¢\u0006\b\u001a\u0006\b\u0095\u0002\u0010\u0080\u0001R\u0015\u0010\u0097\u0002\u001a\u00030\u0098\u00028F¢\u0006\b\u001a\u0006\b\u0099\u0002\u0010\u009a\u0002R\u0015\u0010\u009c\u0002\u001a\u00030\u009d\u00028F¢\u0006\b\u001a\u0006\b\u009e\u0002\u0010\u009f\u0002R\u0013\u0010¡\u0002\u001a\u00020=8F¢\u0006\u0007\u001a\u0005\b¢\u0002\u0010@R\u0015\u0010¤\u0002\u001a\u00030\u009d\u00028F¢\u0006\b\u001a\u0006\b¥\u0002\u0010\u009f\u0002R\u0013\u0010§\u0002\u001a\u00020=8F¢\u0006\u0007\u001a\u0005\b¨\u0002\u0010@R\u0017\u0010ª\u0002\u001a\u0005\u0018\u00010\u0098\u00028F¢\u0006\b\u001a\u0006\b«\u0002\u0010\u009a\u0002R\u0013\u0010\u00ad\u0002\u001a\u00020)8F¢\u0006\u0007\u001a\u0005\b®\u0002\u0010+R\u0014\u0010°\u0002\u001a\u00020}8F¢\u0006\b\u001a\u0006\b±\u0002\u0010\u0080\u0001R\u0013\u0010³\u0002\u001a\u00020)8F¢\u0006\u0007\u001a\u0005\b´\u0002\u0010+R\u0013\u0010¶\u0002\u001a\u00020=8F¢\u0006\u0007\u001a\u0005\b·\u0002\u0010@R\u0013\u0010¹\u0002\u001a\u00020)8F¢\u0006\u0007\u001a\u0005\b¹\u0002\u0010+R\u0014\u0010»\u0002\u001a\u00020}8F¢\u0006\b\u001a\u0006\b¼\u0002\u0010\u0080\u0001R\u0014\u0010¾\u0002\u001a\u00020}8F¢\u0006\b\u001a\u0006\b¿\u0002\u0010\u0080\u0001R(\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÁ\u0002\u0010Â\u0002\"\u0006\bÃ\u0002\u0010Ä\u0002¨\u0006Û\u0002"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "config", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Config;", "callbacks", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Config;Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Callbacks;)V", "geoDeniedVerdict", "Lcom/polymarket/usdependencies/GeoComplianceVerdict;", "getGeoDeniedVerdict", "()Lcom/polymarket/usdependencies/GeoComplianceVerdict;", "Swift_geoDeniedVerdict", "clearGeoDenial", "", "Swift_clearGeoDenial_0", "newValue", "getConfig", "()Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Config;", "setConfig", "(Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Config;)V", "Swift_config", "Swift_config_set", "value", "presentation", "Lcom/polymarket/data/EMarket$MarketSide$DisplayContext;", "getPresentation", "()Lcom/polymarket/data/EMarket$MarketSide$DisplayContext;", "Swift_presentation", "rulesDisclaimer", "Lcom/polymarket/usviewmodels/MarketRulesDisclaimerPresentation;", "getRulesDisclaimer", "()Lcom/polymarket/usviewmodels/MarketRulesDisclaimerPresentation;", "Swift_rulesDisclaimer", "shouldAutoPresentRulesDisclaimer", "", "getShouldAutoPresentRulesDisclaimer", "()Z", "Swift_shouldAutoPresentRulesDisclaimer", "Lcom/polymarket/usviewmodels/PromoBannerViewModel;", "promoBannerVM", "getPromoBannerVM", "()Lcom/polymarket/usviewmodels/PromoBannerViewModel;", "setPromoBannerVM", "(Lcom/polymarket/usviewmodels/PromoBannerViewModel;)V", "Swift_promoBannerVM", "Swift_promoBannerVM_set", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$FocusedField;", "focusedField", "getFocusedField", "()Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$FocusedField;", "setFocusedField", "(Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$FocusedField;)V", "Swift_focusedField", "Swift_focusedField_set", "", "shakeSharesField", "getShakeSharesField", "()I", "setShakeSharesField", "(I)V", "Swift_shakeSharesField", "Swift_shakeSharesField_set", "shakePriceField", "getShakePriceField", "setShakePriceField", "Swift_shakePriceField", "Swift_shakePriceField_set", "estimatedCost", "Lcom/polymarket/data/EAmount;", "getEstimatedCost", "()Lcom/polymarket/data/EAmount;", "Swift_estimatedCost", "estimatedFee", "getEstimatedFee", "Swift_estimatedFee", "estimatedPayout", "getEstimatedPayout", "setEstimatedPayout", "(Lcom/polymarket/data/EAmount;)V", "Swift_estimatedPayout", "Swift_estimatedPayout_set", "estimatedProfit", "getEstimatedProfit", "setEstimatedProfit", "Swift_estimatedProfit", "Swift_estimatedProfit_set", "bidPrice", "getBidPrice", "setBidPrice", "Swift_bidPrice", "Swift_bidPrice_set", "askPrice", "getAskPrice", "setAskPrice", "Swift_askPrice", "Swift_askPrice_set", "cashBalance", "getCashBalance", "setCashBalance", "Swift_cashBalance", "Swift_cashBalance_set", "Lcom/polymarket/data/ETIFOption;", "selectedTIFOption", "getSelectedTIFOption", "()Lcom/polymarket/data/ETIFOption;", "setSelectedTIFOption", "(Lcom/polymarket/data/ETIFOption;)V", "Swift_selectedTIFOption", "Swift_selectedTIFOption_set", "isLoading", "setLoading", "(Z)V", "Swift_isLoading", "Swift_isLoading_set", "isOrderPlaced", "setOrderPlaced", "Swift_isOrderPlaced", "Swift_isOrderPlaced_set", "", "validationError", "getValidationError", "()Ljava/lang/String;", "setValidationError", "(Ljava/lang/String;)V", "Swift_validationError", "Swift_validationError_set", "playRewardsAnimation", "getPlayRewardsAnimation", "setPlayRewardsAnimation", "Swift_playRewardsAnimation", "Swift_playRewardsAnimation_set", "numberOfShares", "getNumberOfShares", "setNumberOfShares", "Swift_numberOfShares", "Swift_numberOfShares_set", "limitPrice", "getLimitPrice", "setLimitPrice", "Swift_limitPrice", "Swift_limitPrice_set", "sharesDisplay", "Lcom/polymarket/data/LimitOrderInputSharesDisplay;", "getSharesDisplay", "()Lcom/polymarket/data/LimitOrderInputSharesDisplay;", "Swift_sharesDisplay", "priceDisplay", "Lcom/polymarket/data/LimitOrderInputPriceDisplay;", "getPriceDisplay", "()Lcom/polymarket/data/LimitOrderInputPriceDisplay;", "Swift_priceDisplay", "isSharesFocused", "Swift_isSharesFocused", "isPriceFocused", "Swift_isPriceFocused", "marketSlug", "getMarketSlug", "Swift_marketSlug", "isDecimalizedMarket", "Swift_isDecimalizedMarket", "priceDecimalPlaces", "getPriceDecimalPlaces", "Swift_priceDecimalPlaces", "quantityDecimalPlaces", "getQuantityDecimalPlaces", "Swift_quantityDecimalPlaces", "limitPriceAmount", "getLimitPriceAmount", "Swift_limitPriceAmount", "sportsOddsFormat", "Lcom/polymarket/data/OddsFormat;", "getSportsOddsFormat", "()Lcom/polymarket/data/OddsFormat;", "Swift_sportsOddsFormat", "formattedOdds", "getFormattedOdds", "Swift_formattedOdds", "canAttemptPlaceOrder", "getCanAttemptPlaceOrder", "Swift_canAttemptPlaceOrder", "canPlaceOrder", "getCanPlaceOrder", "Swift_canPlaceOrder", "requiresDeposit", "getRequiresDeposit", "Swift_requiresDeposit", "marketSideTitle", "getMarketSideTitle", "Swift_marketSideTitle", "eventTitle", "getEventTitle", "Swift_eventTitle", "formattedBidAsk", "getFormattedBidAsk", "Swift_formattedBidAsk", "formattedCashBalance", "getFormattedCashBalance", "Swift_formattedCashBalance", "sharesInputSubtitle", "getSharesInputSubtitle", "Swift_sharesInputSubtitle", "priceInputSubtitle", "getPriceInputSubtitle", "Swift_priceInputSubtitle", "tickValidationMessage", "getTickValidationMessage", "Swift_tickValidationMessage", "shakeTickValidation", "getShakeTickValidation", "setShakeTickValidation", "Swift_shakeTickValidation", "Swift_shakeTickValidation_set", "quantityValidationMessage", "getQuantityValidationMessage", "Swift_quantityValidationMessage", "shakeQuantityValidation", "getShakeQuantityValidation", "setShakeQuantityValidation", "Swift_shakeQuantityValidation", "Swift_shakeQuantityValidation_set", "timeInForceDisplayText", "getTimeInForceDisplayText", "Swift_timeInForceDisplayText", "availableTIFOptions", "", "getAvailableTIFOptions", "()Ljava/util/List;", "Swift_availableTIFOptions", "shouldShowFees", "getShouldShowFees", "Swift_shouldShowFees", "isProfitable", "Swift_isProfitable", "priceFieldTitle", "getPriceFieldTitle", "Swift_priceFieldTitle", "sharesFieldTitle", "getSharesFieldTitle", "Swift_sharesFieldTitle", "expirationLabel", "getExpirationLabel", "Swift_expirationLabel", "expiryRowLabel", "getExpiryRowLabel", "Swift_expiryRowLabel", "matchedSharesLabel", "getMatchedSharesLabel", "Swift_matchedSharesLabel", "oddsLabel", "getOddsLabel", "Swift_oddsLabel", "estimatedCostLabel", "getEstimatedCostLabel", "Swift_estimatedCostLabel", "toWinLabel", "getToWinLabel", "Swift_toWinLabel", "canIncrementPrice", "getCanIncrementPrice", "Swift_canIncrementPrice", "canDecrementPrice", "getCanDecrementPrice", "Swift_canDecrementPrice", "canIncrementShares", "getCanIncrementShares", "Swift_canIncrementShares", "canDecrementShares", "getCanDecrementShares", "Swift_canDecrementShares", "placeOrderButtonTitle", "getPlaceOrderButtonTitle", "Swift_placeOrderButtonTitle", "maxPurchasableShares", "Lcom/polymarket/data/EQuantity;", "getMaxPurchasableShares", "()Lcom/polymarket/data/EQuantity;", "Swift_maxPurchasableShares", "maxPurchasableSharesDouble", "", "getMaxPurchasableSharesDouble", "()D", "Swift_maxPurchasableSharesDouble", "maxPurchasableSharesInt", "getMaxPurchasableSharesInt", "Swift_maxPurchasableSharesInt", "numberOfSharesDouble", "getNumberOfSharesDouble", "Swift_numberOfSharesDouble", "numberOfSharesInt", "getNumberOfSharesInt", "Swift_numberOfSharesInt", "matchingShares", "getMatchingShares", "Swift_matchingShares", "showRewardsIcon", "getShowRewardsIcon", "Swift_showRewardsIcon", "rewardsTooltipText", "getRewardsTooltipText", "Swift_rewardsTooltipText", "showSideToggle", "getShowSideToggle", "Swift_showSideToggle", "selectedToggleIndex", "getSelectedToggleIndex", "Swift_selectedToggleIndex", "isSideToggleInteractive", "Swift_isSideToggleInteractive", "toggleAffirmativeLabel", "getToggleAffirmativeLabel", "Swift_toggleAffirmativeLabel", "toggleNegativeLabel", "getToggleNegativeLabel", "Swift_toggleNegativeLabel", "getCallbacks", "()Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Callbacks;", "setCallbacks", "(Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Callbacks;)V", "Swift_callbacks", "Swift_callbacks_set", "setup", "Swift_setup_2", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "Swift_sendInput_3", "sendPadKey", "key", "Lcom/polymarket/data/NumberPadKey;", "Swift_sendPadKey_4", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Config", "Callbacks", "FocusedField", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BuyLimitOrderViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$FocusedField;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "shares", "price", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class FocusedField implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ FocusedField[] $VALUES;
        public static final FocusedField shares = new FocusedField("shares", 0);
        public static final FocusedField price = new FocusedField("price", 1);

        private static final /* synthetic */ FocusedField[] $values() {
            return new FocusedField[]{shares, price};
        }

        static {
            FocusedField[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private FocusedField(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static FocusedField valueOf(String str) {
            return (FocusedField) Enum.valueOf(FocusedField.class, str);
        }

        public static FocusedField[] values() {
            return (FocusedField[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    public /* synthetic */ BuyLimitOrderViewModel(Config config, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(config, (i & 2) != 0 ? new Callbacks(null, null, null, null, null, null, null, 127, null) : callbacks);
    }

    private final native EAmount Swift_askPrice(long Swift_peer);

    private final native void Swift_askPrice_set(long Swift_peer, EAmount value);

    private final native List<ETIFOption> Swift_availableTIFOptions(long Swift_peer);

    private final native EAmount Swift_bidPrice(long Swift_peer);

    private final native void Swift_bidPrice_set(long Swift_peer, EAmount value);

    private final native Callbacks Swift_callbacks(long Swift_peer);

    private final native void Swift_callbacks_set(long Swift_peer, Callbacks value);

    private final native boolean Swift_canAttemptPlaceOrder(long Swift_peer);

    private final native boolean Swift_canDecrementPrice(long Swift_peer);

    private final native boolean Swift_canDecrementShares(long Swift_peer);

    private final native boolean Swift_canIncrementPrice(long Swift_peer);

    private final native boolean Swift_canIncrementShares(long Swift_peer);

    private final native boolean Swift_canPlaceOrder(long Swift_peer);

    private final native EAmount Swift_cashBalance(long Swift_peer);

    private final native void Swift_cashBalance_set(long Swift_peer, EAmount value);

    private final native void Swift_clearGeoDenial_0(long Swift_peer);

    private final native Config Swift_config(long Swift_peer);

    private final native void Swift_config_set(long Swift_peer, Config value);

    private final native EAmount Swift_estimatedCost(long Swift_peer);

    private final native String Swift_estimatedCostLabel(long Swift_peer);

    private final native EAmount Swift_estimatedFee(long Swift_peer);

    private final native EAmount Swift_estimatedPayout(long Swift_peer);

    private final native void Swift_estimatedPayout_set(long Swift_peer, EAmount value);

    private final native EAmount Swift_estimatedProfit(long Swift_peer);

    private final native void Swift_estimatedProfit_set(long Swift_peer, EAmount value);

    private final native String Swift_eventTitle(long Swift_peer);

    private final native String Swift_expirationLabel(long Swift_peer);

    private final native String Swift_expiryRowLabel(long Swift_peer);

    private final native FocusedField Swift_focusedField(long Swift_peer);

    private final native void Swift_focusedField_set(long Swift_peer, FocusedField value);

    private final native String Swift_formattedBidAsk(long Swift_peer);

    private final native String Swift_formattedCashBalance(long Swift_peer);

    private final native String Swift_formattedOdds(long Swift_peer);

    private final native GeoComplianceVerdict Swift_geoDeniedVerdict(long Swift_peer);

    private final native boolean Swift_isDecimalizedMarket(long Swift_peer);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native void Swift_isLoading_set(long Swift_peer, boolean value);

    private final native boolean Swift_isOrderPlaced(long Swift_peer);

    private final native void Swift_isOrderPlaced_set(long Swift_peer, boolean value);

    private final native boolean Swift_isPriceFocused(long Swift_peer);

    private final native boolean Swift_isProfitable(long Swift_peer);

    private final native boolean Swift_isSharesFocused(long Swift_peer);

    private final native boolean Swift_isSideToggleInteractive(long Swift_peer);

    private final native String Swift_limitPrice(long Swift_peer);

    private final native EAmount Swift_limitPriceAmount(long Swift_peer);

    private final native void Swift_limitPrice_set(long Swift_peer, String value);

    private final native String Swift_marketSideTitle(long Swift_peer);

    private final native String Swift_marketSlug(long Swift_peer);

    private final native String Swift_matchedSharesLabel(long Swift_peer);

    private final native EQuantity Swift_matchingShares(long Swift_peer);

    private final native EQuantity Swift_maxPurchasableShares(long Swift_peer);

    private final native double Swift_maxPurchasableSharesDouble(long Swift_peer);

    private final native int Swift_maxPurchasableSharesInt(long Swift_peer);

    private final native String Swift_numberOfShares(long Swift_peer);

    private final native double Swift_numberOfSharesDouble(long Swift_peer);

    private final native int Swift_numberOfSharesInt(long Swift_peer);

    private final native void Swift_numberOfShares_set(long Swift_peer, String value);

    private final native String Swift_oddsLabel(long Swift_peer);

    private final native String Swift_placeOrderButtonTitle(long Swift_peer);

    private final native boolean Swift_playRewardsAnimation(long Swift_peer);

    private final native void Swift_playRewardsAnimation_set(long Swift_peer, boolean value);

    private final native EMarket.MarketSide.DisplayContext Swift_presentation(long Swift_peer);

    private final native int Swift_priceDecimalPlaces(long Swift_peer);

    private final native LimitOrderInputPriceDisplay Swift_priceDisplay(long Swift_peer);

    private final native String Swift_priceFieldTitle(long Swift_peer);

    private final native String Swift_priceInputSubtitle(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native PromoBannerViewModel Swift_promoBannerVM(long Swift_peer);

    private final native void Swift_promoBannerVM_set(long Swift_peer, PromoBannerViewModel value);

    private final native int Swift_quantityDecimalPlaces(long Swift_peer);

    private final native String Swift_quantityValidationMessage(long Swift_peer);

    private final native boolean Swift_requiresDeposit(long Swift_peer);

    private final native String Swift_rewardsTooltipText(long Swift_peer);

    private final native MarketRulesDisclaimerPresentation Swift_rulesDisclaimer(long Swift_peer);

    private final native ETIFOption Swift_selectedTIFOption(long Swift_peer);

    private final native void Swift_selectedTIFOption_set(long Swift_peer, ETIFOption value);

    private final native int Swift_selectedToggleIndex(long Swift_peer);

    private final native void Swift_sendInput_3(long Swift_peer, Input input);

    private final native boolean Swift_sendPadKey_4(long Swift_peer, NumberPadKey key);

    private final native void Swift_setup_2(long Swift_peer);

    private final native int Swift_shakePriceField(long Swift_peer);

    private final native void Swift_shakePriceField_set(long Swift_peer, int value);

    private final native int Swift_shakeQuantityValidation(long Swift_peer);

    private final native void Swift_shakeQuantityValidation_set(long Swift_peer, int value);

    private final native int Swift_shakeSharesField(long Swift_peer);

    private final native void Swift_shakeSharesField_set(long Swift_peer, int value);

    private final native int Swift_shakeTickValidation(long Swift_peer);

    private final native void Swift_shakeTickValidation_set(long Swift_peer, int value);

    private final native LimitOrderInputSharesDisplay Swift_sharesDisplay(long Swift_peer);

    private final native String Swift_sharesFieldTitle(long Swift_peer);

    private final native String Swift_sharesInputSubtitle(long Swift_peer);

    private final native boolean Swift_shouldAutoPresentRulesDisclaimer(long Swift_peer);

    private final native boolean Swift_shouldShowFees(long Swift_peer);

    private final native boolean Swift_showRewardsIcon(long Swift_peer);

    private final native boolean Swift_showSideToggle(long Swift_peer);

    private final native OddsFormat Swift_sportsOddsFormat(long Swift_peer);

    private final native String Swift_tickValidationMessage(long Swift_peer);

    private final native String Swift_timeInForceDisplayText(long Swift_peer);

    private final native String Swift_toWinLabel(long Swift_peer);

    private final native String Swift_toggleAffirmativeLabel(long Swift_peer);

    private final native String Swift_toggleNegativeLabel(long Swift_peer);

    private final native String Swift_validationError(long Swift_peer);

    private final native void Swift_validationError_set(long Swift_peer, String value);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final void clearGeoDenial() {
        Swift_clearGeoDenial_0(getSwift_peer());
    }

    public final EAmount getAskPrice() {
        return Swift_askPrice(getSwift_peer());
    }

    public final List<ETIFOption> getAvailableTIFOptions() {
        return Swift_availableTIFOptions(getSwift_peer());
    }

    public final EAmount getBidPrice() {
        return Swift_bidPrice(getSwift_peer());
    }

    public final Callbacks getCallbacks() {
        return Swift_callbacks(getSwift_peer());
    }

    public final boolean getCanAttemptPlaceOrder() {
        return Swift_canAttemptPlaceOrder(getSwift_peer());
    }

    public final boolean getCanDecrementPrice() {
        return Swift_canDecrementPrice(getSwift_peer());
    }

    public final boolean getCanDecrementShares() {
        return Swift_canDecrementShares(getSwift_peer());
    }

    public final boolean getCanIncrementPrice() {
        return Swift_canIncrementPrice(getSwift_peer());
    }

    public final boolean getCanIncrementShares() {
        return Swift_canIncrementShares(getSwift_peer());
    }

    public final boolean getCanPlaceOrder() {
        return Swift_canPlaceOrder(getSwift_peer());
    }

    public final EAmount getCashBalance() {
        return Swift_cashBalance(getSwift_peer());
    }

    public final Config getConfig() {
        return Swift_config(getSwift_peer());
    }

    public final EAmount getEstimatedCost() {
        return Swift_estimatedCost(getSwift_peer());
    }

    public final String getEstimatedCostLabel() {
        return Swift_estimatedCostLabel(getSwift_peer());
    }

    public final EAmount getEstimatedFee() {
        return Swift_estimatedFee(getSwift_peer());
    }

    public final EAmount getEstimatedPayout() {
        return Swift_estimatedPayout(getSwift_peer());
    }

    public final EAmount getEstimatedProfit() {
        return Swift_estimatedProfit(getSwift_peer());
    }

    public final String getEventTitle() {
        return Swift_eventTitle(getSwift_peer());
    }

    public final String getExpirationLabel() {
        return Swift_expirationLabel(getSwift_peer());
    }

    public final String getExpiryRowLabel() {
        return Swift_expiryRowLabel(getSwift_peer());
    }

    public final FocusedField getFocusedField() {
        return Swift_focusedField(getSwift_peer());
    }

    public final String getFormattedBidAsk() {
        return Swift_formattedBidAsk(getSwift_peer());
    }

    public final String getFormattedCashBalance() {
        return Swift_formattedCashBalance(getSwift_peer());
    }

    public final String getFormattedOdds() {
        return Swift_formattedOdds(getSwift_peer());
    }

    public final GeoComplianceVerdict getGeoDeniedVerdict() {
        return Swift_geoDeniedVerdict(getSwift_peer());
    }

    public final String getLimitPrice() {
        return Swift_limitPrice(getSwift_peer());
    }

    public final EAmount getLimitPriceAmount() {
        return Swift_limitPriceAmount(getSwift_peer());
    }

    public final String getMarketSideTitle() {
        return Swift_marketSideTitle(getSwift_peer());
    }

    public final String getMarketSlug() {
        return Swift_marketSlug(getSwift_peer());
    }

    public final String getMatchedSharesLabel() {
        return Swift_matchedSharesLabel(getSwift_peer());
    }

    public final EQuantity getMatchingShares() {
        return Swift_matchingShares(getSwift_peer());
    }

    public final EQuantity getMaxPurchasableShares() {
        return Swift_maxPurchasableShares(getSwift_peer());
    }

    public final double getMaxPurchasableSharesDouble() {
        return Swift_maxPurchasableSharesDouble(getSwift_peer());
    }

    public final int getMaxPurchasableSharesInt() {
        return Swift_maxPurchasableSharesInt(getSwift_peer());
    }

    public final String getNumberOfShares() {
        return Swift_numberOfShares(getSwift_peer());
    }

    public final double getNumberOfSharesDouble() {
        return Swift_numberOfSharesDouble(getSwift_peer());
    }

    public final int getNumberOfSharesInt() {
        return Swift_numberOfSharesInt(getSwift_peer());
    }

    public final String getOddsLabel() {
        return Swift_oddsLabel(getSwift_peer());
    }

    public final String getPlaceOrderButtonTitle() {
        return Swift_placeOrderButtonTitle(getSwift_peer());
    }

    public final boolean getPlayRewardsAnimation() {
        return Swift_playRewardsAnimation(getSwift_peer());
    }

    public final EMarket.MarketSide.DisplayContext getPresentation() {
        return Swift_presentation(getSwift_peer());
    }

    public final int getPriceDecimalPlaces() {
        return Swift_priceDecimalPlaces(getSwift_peer());
    }

    public final LimitOrderInputPriceDisplay getPriceDisplay() {
        return Swift_priceDisplay(getSwift_peer());
    }

    public final String getPriceFieldTitle() {
        return Swift_priceFieldTitle(getSwift_peer());
    }

    public final String getPriceInputSubtitle() {
        return Swift_priceInputSubtitle(getSwift_peer());
    }

    public final PromoBannerViewModel getPromoBannerVM() {
        return Swift_promoBannerVM(getSwift_peer());
    }

    public final int getQuantityDecimalPlaces() {
        return Swift_quantityDecimalPlaces(getSwift_peer());
    }

    public final String getQuantityValidationMessage() {
        return Swift_quantityValidationMessage(getSwift_peer());
    }

    public final boolean getRequiresDeposit() {
        return Swift_requiresDeposit(getSwift_peer());
    }

    public final String getRewardsTooltipText() {
        return Swift_rewardsTooltipText(getSwift_peer());
    }

    public final MarketRulesDisclaimerPresentation getRulesDisclaimer() {
        return Swift_rulesDisclaimer(getSwift_peer());
    }

    public final ETIFOption getSelectedTIFOption() {
        return Swift_selectedTIFOption(getSwift_peer());
    }

    public final int getSelectedToggleIndex() {
        return Swift_selectedToggleIndex(getSwift_peer());
    }

    public final int getShakePriceField() {
        return Swift_shakePriceField(getSwift_peer());
    }

    public final int getShakeQuantityValidation() {
        return Swift_shakeQuantityValidation(getSwift_peer());
    }

    public final int getShakeSharesField() {
        return Swift_shakeSharesField(getSwift_peer());
    }

    public final int getShakeTickValidation() {
        return Swift_shakeTickValidation(getSwift_peer());
    }

    public final LimitOrderInputSharesDisplay getSharesDisplay() {
        return Swift_sharesDisplay(getSwift_peer());
    }

    public final String getSharesFieldTitle() {
        return Swift_sharesFieldTitle(getSwift_peer());
    }

    public final String getSharesInputSubtitle() {
        return Swift_sharesInputSubtitle(getSwift_peer());
    }

    public final boolean getShouldAutoPresentRulesDisclaimer() {
        return Swift_shouldAutoPresentRulesDisclaimer(getSwift_peer());
    }

    public final boolean getShouldShowFees() {
        return Swift_shouldShowFees(getSwift_peer());
    }

    public final boolean getShowRewardsIcon() {
        return Swift_showRewardsIcon(getSwift_peer());
    }

    public final boolean getShowSideToggle() {
        return Swift_showSideToggle(getSwift_peer());
    }

    public final OddsFormat getSportsOddsFormat() {
        return Swift_sportsOddsFormat(getSwift_peer());
    }

    public final String getTickValidationMessage() {
        return Swift_tickValidationMessage(getSwift_peer());
    }

    public final String getTimeInForceDisplayText() {
        return Swift_timeInForceDisplayText(getSwift_peer());
    }

    public final String getToWinLabel() {
        return Swift_toWinLabel(getSwift_peer());
    }

    public final String getToggleAffirmativeLabel() {
        return Swift_toggleAffirmativeLabel(getSwift_peer());
    }

    public final String getToggleNegativeLabel() {
        return Swift_toggleNegativeLabel(getSwift_peer());
    }

    public final String getValidationError() {
        return Swift_validationError(getSwift_peer());
    }

    public final boolean isDecimalizedMarket() {
        return Swift_isDecimalizedMarket(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final boolean isOrderPlaced() {
        return Swift_isOrderPlaced(getSwift_peer());
    }

    public final boolean isPriceFocused() {
        return Swift_isPriceFocused(getSwift_peer());
    }

    public final boolean isProfitable() {
        return Swift_isProfitable(getSwift_peer());
    }

    public final boolean isSharesFocused() {
        return Swift_isSharesFocused(getSwift_peer());
    }

    public final boolean isSideToggleInteractive() {
        return Swift_isSideToggleInteractive(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_3(getSwift_peer(), input);
    }

    public final boolean sendPadKey(NumberPadKey key) {
        key.getClass();
        return Swift_sendPadKey_4(getSwift_peer(), key);
    }

    public final void setAskPrice(EAmount eAmount) {
        Swift_askPrice_set(getSwift_peer(), (EAmount) StructKt.sref$default(eAmount, null, 1, null));
    }

    public final void setBidPrice(EAmount eAmount) {
        Swift_bidPrice_set(getSwift_peer(), (EAmount) StructKt.sref$default(eAmount, null, 1, null));
    }

    public final void setCallbacks(Callbacks callbacks) {
        callbacks.getClass();
        Swift_callbacks_set(getSwift_peer(), callbacks);
    }

    public final void setCashBalance(EAmount eAmount) {
        eAmount.getClass();
        Swift_cashBalance_set(getSwift_peer(), (EAmount) StructKt.sref$default(eAmount, null, 1, null));
    }

    public final void setConfig(Config config) {
        config.getClass();
        Swift_config_set(getSwift_peer(), config);
    }

    public final void setEstimatedPayout(EAmount eAmount) {
        Swift_estimatedPayout_set(getSwift_peer(), (EAmount) StructKt.sref$default(eAmount, null, 1, null));
    }

    public final void setEstimatedProfit(EAmount eAmount) {
        Swift_estimatedProfit_set(getSwift_peer(), (EAmount) StructKt.sref$default(eAmount, null, 1, null));
    }

    public final void setFocusedField(FocusedField focusedField) {
        focusedField.getClass();
        Swift_focusedField_set(getSwift_peer(), focusedField);
    }

    public final void setLimitPrice(String str) {
        str.getClass();
        Swift_limitPrice_set(getSwift_peer(), str);
    }

    public final void setLoading(boolean z) {
        Swift_isLoading_set(getSwift_peer(), z);
    }

    public final void setNumberOfShares(String str) {
        str.getClass();
        Swift_numberOfShares_set(getSwift_peer(), str);
    }

    public final void setOrderPlaced(boolean z) {
        Swift_isOrderPlaced_set(getSwift_peer(), z);
    }

    public final void setPlayRewardsAnimation(boolean z) {
        Swift_playRewardsAnimation_set(getSwift_peer(), z);
    }

    public final void setPromoBannerVM(PromoBannerViewModel promoBannerViewModel) {
        Swift_promoBannerVM_set(getSwift_peer(), promoBannerViewModel);
    }

    public final void setSelectedTIFOption(ETIFOption eTIFOption) {
        eTIFOption.getClass();
        Swift_selectedTIFOption_set(getSwift_peer(), eTIFOption);
    }

    public final void setShakePriceField(int i) {
        Swift_shakePriceField_set(getSwift_peer(), i);
    }

    public final void setShakeQuantityValidation(int i) {
        Swift_shakeQuantityValidation_set(getSwift_peer(), i);
    }

    public final void setShakeSharesField(int i) {
        Swift_shakeSharesField_set(getSwift_peer(), i);
    }

    public final void setShakeTickValidation(int i) {
        Swift_shakeTickValidation_set(getSwift_peer(), i);
    }

    public final void setValidationError(String str) {
        Swift_validationError_set(getSwift_peer(), str);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_2(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 *2\u00020\u0001:\u001a\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0019+,-./0123456789:;<=>?@ABC¨\u0006D"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnNumberOfSharesChangedCase", "OnLimitPriceChangedCase", "OnTIFOptionSelectedCase", "OnPlaceOrderCase", "OnOrderBookTappedCase", "OnPrefillPriceCase", "OnPrefillFromOrderBookCase", "OnQuickSharesTappedCase", "OnShowDepositFlowCase", "OnFocusChangedCase", "OnValidationErrorCase", "OnIncrementPriceCase", "OnDecrementPriceCase", "OnIncrementSharesCase", "OnDecrementSharesCase", "OnQuickSharesDeltaCase", "OnMaxSharesCase", "OnMatchingSharesTappedCase", "OnCostInfoTappedCase", "OnMarketSideChangedCase", "OnToggleSideCase", "OnRewardsTappedCase", "OnVisibleCase", "OnRulesDisclaimerAutoPresentedCase", "Companion", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnCostInfoTappedCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnDecrementPriceCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnDecrementSharesCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnFocusChangedCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnIncrementPriceCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnIncrementSharesCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnLimitPriceChangedCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnMarketSideChangedCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnMatchingSharesTappedCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnMaxSharesCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnNumberOfSharesChangedCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnOrderBookTappedCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnPlaceOrderCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnPrefillFromOrderBookCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnPrefillPriceCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnQuickSharesDeltaCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnQuickSharesTappedCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnRewardsTappedCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnRulesDisclaimerAutoPresentedCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnShowDepositFlowCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnTIFOptionSelectedCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnToggleSideCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnValidationErrorCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnVisibleCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onPlaceOrder = new OnPlaceOrderCase();
        private static final Input onOrderBookTapped = new OnOrderBookTappedCase();
        private static final Input onShowDepositFlow = new OnShowDepositFlowCase();
        private static final Input onValidationError = new OnValidationErrorCase();
        private static final Input onIncrementPrice = new OnIncrementPriceCase();
        private static final Input onDecrementPrice = new OnDecrementPriceCase();
        private static final Input onIncrementShares = new OnIncrementSharesCase();
        private static final Input onDecrementShares = new OnDecrementSharesCase();
        private static final Input onMaxShares = new OnMaxSharesCase();
        private static final Input onMatchingSharesTapped = new OnMatchingSharesTappedCase();
        private static final Input onCostInfoTapped = new OnCostInfoTappedCase();
        private static final Input onToggleSide = new OnToggleSideCase();
        private static final Input onRewardsTapped = new OnRewardsTappedCase();
        private static final Input onVisible = new OnVisibleCase();
        private static final Input onRulesDisclaimerAutoPresented = new OnRulesDisclaimerAutoPresentedCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnCostInfoTappedCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnCostInfoTappedCase extends Input {
            public OnCostInfoTappedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnDecrementPriceCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDecrementPriceCase extends Input {
            public OnDecrementPriceCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnDecrementSharesCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDecrementSharesCase extends Input {
            public OnDecrementSharesCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnFocusChangedCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$FocusedField;", "<init>", "(Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$FocusedField;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$FocusedField;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnFocusChangedCase extends Input {
            private final FocusedField associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnFocusChangedCase(FocusedField focusedField) {
                super(null);
                focusedField.getClass();
                this.associated0 = focusedField;
            }

            public final FocusedField getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnIncrementPriceCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnIncrementPriceCase extends Input {
            public OnIncrementPriceCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnIncrementSharesCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnIncrementSharesCase extends Input {
            public OnIncrementSharesCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnLimitPriceChangedCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnLimitPriceChangedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnLimitPriceChangedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnMarketSideChangedCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "associated0", "Lcom/polymarket/data/EMarket$MarketSide;", "<init>", "(Lcom/polymarket/data/EMarket$MarketSide;)V", "getAssociated0", "()Lcom/polymarket/data/EMarket$MarketSide;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnMarketSideChangedCase extends Input {
            private final EMarket.MarketSide associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnMarketSideChangedCase(EMarket.MarketSide marketSide) {
                super(null);
                marketSide.getClass();
                this.associated0 = marketSide;
            }

            public final EMarket.MarketSide getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnMatchingSharesTappedCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnMatchingSharesTappedCase extends Input {
            public OnMatchingSharesTappedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnMaxSharesCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnMaxSharesCase extends Input {
            public OnMaxSharesCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnNumberOfSharesChangedCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnNumberOfSharesChangedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnNumberOfSharesChangedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnOrderBookTappedCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnOrderBookTappedCase extends Input {
            public OnOrderBookTappedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnPlaceOrderCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPlaceOrderCase extends Input {
            public OnPlaceOrderCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnPrefillFromOrderBookCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "associated0", "Lcom/polymarket/data/EAmount;", "<init>", "(Lcom/polymarket/data/EAmount;)V", "getAssociated0", "()Lcom/polymarket/data/EAmount;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPrefillFromOrderBookCase extends Input {
            private final EAmount associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnPrefillFromOrderBookCase(EAmount eAmount) {
                super(null);
                eAmount.getClass();
                this.associated0 = eAmount;
            }

            public final EAmount getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnPrefillPriceCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "associated0", "Lcom/polymarket/data/EAmount;", "<init>", "(Lcom/polymarket/data/EAmount;)V", "getAssociated0", "()Lcom/polymarket/data/EAmount;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPrefillPriceCase extends Input {
            private final EAmount associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnPrefillPriceCase(EAmount eAmount) {
                super(null);
                eAmount.getClass();
                this.associated0 = eAmount;
            }

            public final EAmount getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnQuickSharesDeltaCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "associated0", "", "<init>", "(I)V", "getAssociated0", "()I", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnQuickSharesDeltaCase extends Input {
            private final int associated0;

            public OnQuickSharesDeltaCase(int i) {
                super(null);
                this.associated0 = i;
            }

            public final int getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnQuickSharesTappedCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "associated0", "", "<init>", "(I)V", "getAssociated0", "()I", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnQuickSharesTappedCase extends Input {
            private final int associated0;

            public OnQuickSharesTappedCase(int i) {
                super(null);
                this.associated0 = i;
            }

            public final int getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnRewardsTappedCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRewardsTappedCase extends Input {
            public OnRewardsTappedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnRulesDisclaimerAutoPresentedCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRulesDisclaimerAutoPresentedCase extends Input {
            public OnRulesDisclaimerAutoPresentedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnShowDepositFlowCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnShowDepositFlowCase extends Input {
            public OnShowDepositFlowCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnTIFOptionSelectedCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "associated0", "Lcom/polymarket/data/ETIFOption;", "<init>", "(Lcom/polymarket/data/ETIFOption;)V", "getAssociated0", "()Lcom/polymarket/data/ETIFOption;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnTIFOptionSelectedCase extends Input {
            private final ETIFOption associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnTIFOptionSelectedCase(ETIFOption eTIFOption) {
                super(null);
                eTIFOption.getClass();
                this.associated0 = eTIFOption;
            }

            public final ETIFOption getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnToggleSideCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnToggleSideCase extends Input {
            public OnToggleSideCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnValidationErrorCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnValidationErrorCase extends Input {
            public OnValidationErrorCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidLoadCase extends Input {
            public OnViewDidLoadCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$OnVisibleCase;", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnVisibleCase extends Input {
            public OnVisibleCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnCostInfoTapped$cp() {
            return onCostInfoTapped;
        }

        public static final /* synthetic */ Input access$getOnDecrementPrice$cp() {
            return onDecrementPrice;
        }

        public static final /* synthetic */ Input access$getOnDecrementShares$cp() {
            return onDecrementShares;
        }

        public static final /* synthetic */ Input access$getOnIncrementPrice$cp() {
            return onIncrementPrice;
        }

        public static final /* synthetic */ Input access$getOnIncrementShares$cp() {
            return onIncrementShares;
        }

        public static final /* synthetic */ Input access$getOnMatchingSharesTapped$cp() {
            return onMatchingSharesTapped;
        }

        public static final /* synthetic */ Input access$getOnMaxShares$cp() {
            return onMaxShares;
        }

        public static final /* synthetic */ Input access$getOnOrderBookTapped$cp() {
            return onOrderBookTapped;
        }

        public static final /* synthetic */ Input access$getOnPlaceOrder$cp() {
            return onPlaceOrder;
        }

        public static final /* synthetic */ Input access$getOnRewardsTapped$cp() {
            return onRewardsTapped;
        }

        public static final /* synthetic */ Input access$getOnRulesDisclaimerAutoPresented$cp() {
            return onRulesDisclaimerAutoPresented;
        }

        public static final /* synthetic */ Input access$getOnShowDepositFlow$cp() {
            return onShowDepositFlow;
        }

        public static final /* synthetic */ Input access$getOnToggleSide$cp() {
            return onToggleSide;
        }

        public static final /* synthetic */ Input access$getOnValidationError$cp() {
            return onValidationError;
        }

        public static final /* synthetic */ Input access$getOnViewDidLoad$cp() {
            return onViewDidLoad;
        }

        public static final /* synthetic */ Input access$getOnVisible$cp() {
            return onVisible;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u001aJ\u000e\u0010%\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0016J\u000e\u0010,\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020-R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0007R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0007R\u0011\u0010\u001d\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0007R\u0011\u0010\u001f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0007R\u0011\u0010!\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0007R\u0011\u0010#\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0007R\u0011\u0010&\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0007R\u0011\u0010(\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0007R\u0011\u0010*\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0007R\u0011\u0010.\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0007R\u0011\u00100\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0007R\u0011\u00102\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0007R\u0011\u00104\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0007¨\u00066"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Input;", "onNumberOfSharesChanged", "associated0", "", "onLimitPriceChanged", "onTIFOptionSelected", "Lcom/polymarket/data/ETIFOption;", "onPlaceOrder", "getOnPlaceOrder", "onOrderBookTapped", "getOnOrderBookTapped", "onPrefillPrice", "Lcom/polymarket/data/EAmount;", "onPrefillFromOrderBook", "onQuickSharesTapped", "", "onShowDepositFlow", "getOnShowDepositFlow", "onFocusChanged", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$FocusedField;", "onValidationError", "getOnValidationError", "onIncrementPrice", "getOnIncrementPrice", "onDecrementPrice", "getOnDecrementPrice", "onIncrementShares", "getOnIncrementShares", "onDecrementShares", "getOnDecrementShares", "onQuickSharesDelta", "onMaxShares", "getOnMaxShares", "onMatchingSharesTapped", "getOnMatchingSharesTapped", "onCostInfoTapped", "getOnCostInfoTapped", "onMarketSideChanged", "Lcom/polymarket/data/EMarket$MarketSide;", "onToggleSide", "getOnToggleSide", "onRewardsTapped", "getOnRewardsTapped", "onVisible", "getOnVisible", "onRulesDisclaimerAutoPresented", "getOnRulesDisclaimerAutoPresented", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnCostInfoTapped() {
                return Input.access$getOnCostInfoTapped$cp();
            }

            public final Input getOnDecrementPrice() {
                return Input.access$getOnDecrementPrice$cp();
            }

            public final Input getOnDecrementShares() {
                return Input.access$getOnDecrementShares$cp();
            }

            public final Input getOnIncrementPrice() {
                return Input.access$getOnIncrementPrice$cp();
            }

            public final Input getOnIncrementShares() {
                return Input.access$getOnIncrementShares$cp();
            }

            public final Input getOnMatchingSharesTapped() {
                return Input.access$getOnMatchingSharesTapped$cp();
            }

            public final Input getOnMaxShares() {
                return Input.access$getOnMaxShares$cp();
            }

            public final Input getOnOrderBookTapped() {
                return Input.access$getOnOrderBookTapped$cp();
            }

            public final Input getOnPlaceOrder() {
                return Input.access$getOnPlaceOrder$cp();
            }

            public final Input getOnRewardsTapped() {
                return Input.access$getOnRewardsTapped$cp();
            }

            public final Input getOnRulesDisclaimerAutoPresented() {
                return Input.access$getOnRulesDisclaimerAutoPresented$cp();
            }

            public final Input getOnShowDepositFlow() {
                return Input.access$getOnShowDepositFlow$cp();
            }

            public final Input getOnToggleSide() {
                return Input.access$getOnToggleSide$cp();
            }

            public final Input getOnValidationError() {
                return Input.access$getOnValidationError$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input getOnVisible() {
                return Input.access$getOnVisible$cp();
            }

            public final Input onFocusChanged(FocusedField associated0) {
                associated0.getClass();
                return new OnFocusChangedCase(associated0);
            }

            public final Input onLimitPriceChanged(String associated0) {
                associated0.getClass();
                return new OnLimitPriceChangedCase(associated0);
            }

            public final Input onMarketSideChanged(EMarket.MarketSide associated0) {
                associated0.getClass();
                return new OnMarketSideChangedCase(associated0);
            }

            public final Input onNumberOfSharesChanged(String associated0) {
                associated0.getClass();
                return new OnNumberOfSharesChangedCase(associated0);
            }

            public final Input onPrefillFromOrderBook(EAmount associated0) {
                associated0.getClass();
                return new OnPrefillFromOrderBookCase(associated0);
            }

            public final Input onPrefillPrice(EAmount associated0) {
                associated0.getClass();
                return new OnPrefillPriceCase(associated0);
            }

            public final Input onQuickSharesDelta(int associated0) {
                return new OnQuickSharesDeltaCase(associated0);
            }

            public final Input onQuickSharesTapped(int associated0) {
                return new OnQuickSharesTappedCase(associated0);
            }

            public final Input onTIFOptionSelected(ETIFOption associated0) {
                associated0.getClass();
                return new OnTIFOptionSelectedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0006\u0010\u000b\u001a\u00020\fJ\t\u0010\r\u001a\u00020\fH\u0082 ¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_1", "", "Lskip/bridge/SwiftObjectPointer;", "config", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Config;", "callbacks", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel;", "Swift_Companion_mock_5", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_1(Config config, Callbacks callbacks);

        private final native BuyLimitOrderViewModel Swift_Companion_mock_5();

        public static final /* synthetic */ long access$Swift_Companion_constructor_1(Companion companion, Config config, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_1(config, callbacks);
        }

        public final BuyLimitOrderViewModel mock() {
            return Swift_Companion_mock_5();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB%\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\b\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u0015\u0010\u0017\u001a\u00020\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0015\u0010 \u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010#\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010&\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J'\u0010'\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0082 J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001b0)2\u0006\u0010*\u001a\u00020\u001dH\u0016J\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001b0)2\u0006\u0010*\u001a\u00020\u001dH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006-"}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Config;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "event", "Lcom/polymarket/data/EEvent;", "marketSide", "Lcom/polymarket/data/EMarket$MarketSide;", "entrySource", "Lcom/polymarket/usviewmodels/TradeEntrySource;", "(Lcom/polymarket/data/EEvent;Lcom/polymarket/data/EMarket$MarketSide;Lcom/polymarket/usviewmodels/TradeEntrySource;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getEvent", "()Lcom/polymarket/data/EEvent;", "Swift_event", "getMarketSide", "()Lcom/polymarket/data/EMarket$MarketSide;", "Swift_marketSide", "getEntrySource", "()Lcom/polymarket/usviewmodels/TradeEntrySource;", "Swift_entrySource", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Config implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Config(EEvent eEvent, EMarket.MarketSide marketSide, TradeEntrySource tradeEntrySource) {
            eEvent.getClass();
            marketSide.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(eEvent, marketSide, tradeEntrySource);
        }

        private final native long Swift_constructor_0(EEvent event, EMarket.MarketSide marketSide, TradeEntrySource entrySource);

        private final native TradeEntrySource Swift_entrySource(long Swift_peer);

        private final native EEvent Swift_event(long Swift_peer);

        private final native EMarket.MarketSide Swift_marketSide(long Swift_peer);

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
            if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
                return false;
            }
            return true;
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final TradeEntrySource getEntrySource() {
            return Swift_entrySource(this.Swift_peer);
        }

        public final EEvent getEvent() {
            return Swift_event(this.Swift_peer);
        }

        public final EMarket.MarketSide getMarketSide() {
            return Swift_marketSide(this.Swift_peer);
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

        public Config(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ Config(EEvent eEvent, EMarket.MarketSide marketSide, TradeEntrySource tradeEntrySource, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(eEvent, marketSide, (i & 4) != 0 ? null : tradeEntrySource);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyLimitOrderViewModel(Config config, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_1(INSTANCE, config, callbacks), (SwiftPeerMarker) null);
        config.getClass();
        callbacks.getClass();
    }

    public BuyLimitOrderViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u008d\u0001\b\u0016\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\r0\u000b\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\b\u0010\u0019J\u0006\u0010\u001e\u001a\u00020\rJ\u0015\u0010\u001f\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\u0015\u0010(\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0083\u0001\u0010)\u001a\u00060\u0004j\u0002`\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0082 J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020#0\u000f2\u0006\u0010+\u001a\u00020%H\u0016J\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020#0\u000f2\u0006\u0010+\u001a\u00020%H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006."}, d2 = {"Lcom/polymarket/usviewmodels/BuyLimitOrderViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onOrderPlaced", "Lkotlin/Function1;", "", "", "onOrderBookTapped", "Lkotlin/Function0;", "onShowDepositFlow", "Lcom/polymarket/data/EAmount;", "onRequiresAuthentication", "onShowRewardsSheet", "Lcom/polymarket/data/EPromoBannerTemplate;", "onMarketSideChanged", "Lcom/polymarket/data/EMarket$MarketSide;", "promoBannerCallbacks", "Lcom/polymarket/usviewmodels/PromoBannerViewModel$Callbacks;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/polymarket/usviewmodels/PromoBannerViewModel$Callbacks;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getPromoBannerCallbacks", "()Lcom/polymarket/usviewmodels/PromoBannerViewModel$Callbacks;", "Swift_promoBannerCallbacks", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Callbacks(kotlin.jvm.functions.Function1 r4, kotlin.jvm.functions.Function0 r5, kotlin.jvm.functions.Function1 r6, kotlin.jvm.functions.Function0 r7, kotlin.jvm.functions.Function1 r8, kotlin.jvm.functions.Function1 r9, com.polymarket.usviewmodels.PromoBannerViewModel.Callbacks r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
            /*
                r3 = this;
                r0 = r11 & 1
                if (r0 == 0) goto Lb
                kd1 r4 = new kd1
                r0 = 20
                r4.<init>(r0)
            Lb:
                r0 = r11 & 2
                if (r0 == 0) goto L16
                hn1 r5 = new hn1
                r0 = 28
                r5.<init>(r0)
            L16:
                r0 = r11 & 4
                if (r0 == 0) goto L21
                kd1 r6 = new kd1
                r0 = 21
                r6.<init>(r0)
            L21:
                r0 = r11 & 8
                if (r0 == 0) goto L2c
                hn1 r7 = new hn1
                r0 = 29
                r7.<init>(r0)
            L2c:
                r0 = r11 & 16
                if (r0 == 0) goto L37
                kd1 r8 = new kd1
                r0 = 22
                r8.<init>(r0)
            L37:
                r0 = r11 & 32
                if (r0 == 0) goto L42
                kd1 r9 = new kd1
                r0 = 23
                r9.<init>(r0)
            L42:
                r0 = r11 & 64
                if (r0 == 0) goto L56
                com.polymarket.usviewmodels.PromoBannerViewModel$Callbacks r0 = new com.polymarket.usviewmodels.PromoBannerViewModel$Callbacks
                r1 = 3
                r2 = 0
                r0.<init>(r2, r2, r1, r2)
                r12 = r0
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r5 = r3
                goto L5e
            L56:
                r12 = r10
                r11 = r9
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
            L5e:
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.polymarket.usviewmodels.BuyLimitOrderViewModel.Callbacks.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, com.polymarket.usviewmodels.PromoBannerViewModel$Callbacks, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        private final native long Swift_constructor_0(Function1<? super String, Unit> onOrderPlaced, Function0<Unit> onOrderBookTapped, Function1<? super EAmount, Unit> onShowDepositFlow, Function0<Unit> onRequiresAuthentication, Function1<? super EPromoBannerTemplate, Unit> onShowRewardsSheet, Function1<? super EMarket.MarketSide, Unit> onMarketSideChanged, PromoBannerViewModel.Callbacks promoBannerCallbacks);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native PromoBannerViewModel.Callbacks Swift_promoBannerCallbacks(long Swift_peer);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(String str) {
            str.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2(EAmount eAmount) {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$3() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$4(EPromoBannerTemplate ePromoBannerTemplate) {
            ePromoBannerTemplate.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$5(EMarket.MarketSide marketSide) {
            marketSide.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(EPromoBannerTemplate ePromoBannerTemplate) {
            return _init_$lambda$4(ePromoBannerTemplate);
        }

        public static /* synthetic */ Unit b() {
            return _init_$lambda$1();
        }

        public static /* synthetic */ Unit c(String str) {
            return _init_$lambda$0(str);
        }

        public static /* synthetic */ Unit d(EMarket.MarketSide marketSide) {
            return _init_$lambda$5(marketSide);
        }

        public static /* synthetic */ Unit e() {
            return _init_$lambda$3();
        }

        public static /* synthetic */ Unit f(EAmount eAmount) {
            return _init_$lambda$2(eAmount);
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

        public Callbacks(Function1<? super String, Unit> function1, Function0<Unit> function0, Function1<? super EAmount, Unit> function12, Function0<Unit> function02, Function1<? super EPromoBannerTemplate, Unit> function13, Function1<? super EMarket.MarketSide, Unit> function14, PromoBannerViewModel.Callbacks callbacks) {
            function1.getClass();
            function0.getClass();
            function12.getClass();
            function02.getClass();
            function13.getClass();
            function14.getClass();
            callbacks.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function1, function0, function12, function02, function13, function14, callbacks);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
