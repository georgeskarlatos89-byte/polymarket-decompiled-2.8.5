package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.EAmount;
import com.polymarket.data.EEvent;
import com.polymarket.data.EMarket;
import com.polymarket.data.EQuantity;
import com.polymarket.data.ETIFOption;
import com.polymarket.data.EUserPosition;
import com.polymarket.data.LimitOrderInputPriceDisplay;
import com.polymarket.data.LimitOrderInputSharesDisplay;
import com.polymarket.data.NumberPadKey;
import com.polymarket.data.OddsFormat;
import com.polymarket.usdependencies.GeoComplianceVerdict;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.ljg;
import defpackage.ug7;
import defpackage.ww4;
import defpackage.zog;
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
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010 \n\u0002\b<\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000 ³\u00022\u00020\u0001:\n¯\u0002°\u0002±\u0002²\u0002³\u0002B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u000f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00142\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u001f\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010 \u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\"\u001a\u00020\u0019H\u0082 J\u0015\u0010)\u001a\u00020#2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010*\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\"\u001a\u00020#H\u0082 J\u0015\u0010.\u001a\u00020#2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010/\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\"\u001a\u00020#H\u0082 J\u0017\u00104\u001a\u0004\u0018\u0001012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u00107\u001a\u0004\u0018\u0001012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010<\u001a\u0004\u0018\u0001012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010=\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\"\u001a\u0004\u0018\u000101H\u0082 J\u0017\u0010A\u001a\u0004\u0018\u0001012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010B\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\"\u001a\u0004\u0018\u000101H\u0082 J\u0017\u0010F\u001a\u0004\u0018\u0001012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010G\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\"\u001a\u0004\u0018\u000101H\u0082 J\u0017\u0010N\u001a\u0004\u0018\u00010H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010O\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\"\u001a\u0004\u0018\u00010HH\u0082 J\u0015\u0010V\u001a\u00020P2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010W\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\"\u001a\u00020PH\u0082 J\u0015\u0010]\u001a\u00020X2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010^\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\"\u001a\u00020XH\u0082 J\u0015\u0010a\u001a\u00020X2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010b\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\"\u001a\u00020XH\u0082 J\u0017\u0010i\u001a\u0004\u0018\u00010c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010j\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\"\u001a\u0004\u0018\u00010cH\u0082 J\u0017\u0010o\u001a\u0004\u0018\u00010l2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0006\u0010p\u001a\u00020!J\u0015\u0010q\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010v\u001a\u0004\u0018\u00010s2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010z\u001a\u00020c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010{\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\"\u001a\u00020cH\u0082 J\u0015\u0010\u007f\u001a\u00020c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010\u0080\u0001\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\"\u001a\u00020cH\u0082 J\u0017\u0010\u0085\u0001\u001a\u00030\u0082\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010\u008a\u0001\u001a\u00030\u0087\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u008c\u0001\u001a\u00020X2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u008e\u0001\u001a\u00020X2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010\u0093\u0001\u001a\u00030\u0090\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010\u0098\u0001\u001a\u00030\u0095\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u009b\u0001\u001a\u00020#2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010\u009e\u0001\u001a\u00030\u0095\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¡\u0001\u001a\u00020#2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0019\u0010¤\u0001\u001a\u0005\u0018\u00010\u0090\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0018\u0010§\u0001\u001a\u0004\u0018\u0001012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010ª\u0001\u001a\u00020c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¬\u0001\u001a\u00020X2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¯\u0001\u001a\u00020#2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010²\u0001\u001a\u00020#2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0018\u0010µ\u0001\u001a\u0004\u0018\u0001012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010º\u0001\u001a\u00030·\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0018\u0010½\u0001\u001a\u0004\u0018\u00010c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010À\u0001\u001a\u00020X2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Ã\u0001\u001a\u00020c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Æ\u0001\u001a\u00020c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010É\u0001\u001a\u00020c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Ì\u0001\u001a\u00020c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Ï\u0001\u001a\u00020c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0018\u0010Ò\u0001\u001a\u0004\u0018\u00010c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Ö\u0001\u001a\u00020#2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010×\u0001\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\"\u001a\u00020#H\u0082 J\u0018\u0010Ú\u0001\u001a\u0004\u0018\u00010c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Þ\u0001\u001a\u00020#2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010ß\u0001\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\"\u001a\u00020#H\u0082 J\u0016\u0010â\u0001\u001a\u00020c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010å\u0001\u001a\u00020c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010ê\u0001\u001a\t\u0012\u0004\u0012\u00020P0ç\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010í\u0001\u001a\u00020c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010ð\u0001\u001a\u00020c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010ó\u0001\u001a\u00020c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010ö\u0001\u001a\u00020c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010ù\u0001\u001a\u00020c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010ü\u0001\u001a\u00020c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010ÿ\u0001\u001a\u00020c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0082\u0002\u001a\u00020c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0085\u0002\u001a\u00020X2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0088\u0002\u001a\u00020X2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u008b\u0002\u001a\u00020X2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u008e\u0002\u001a\u00020X2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0091\u0002\u001a\u00020c2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0094\u0002\u001a\u00020X2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0096\u0002\u001a\u00020X2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0099\u0002\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u009e\u0002\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010\u009f\u0002\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\"\u001a\u00020\fH\u0082 J\t\u0010 \u0002\u001a\u00020!H\u0016J\u0016\u0010¡\u0002\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0011\u0010¢\u0002\u001a\u00020!2\b\u0010£\u0002\u001a\u00030¤\u0002J \u0010¥\u0002\u001a\u00020!2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010£\u0002\u001a\u00030¤\u0002H\u0082 J\u0011\u0010¦\u0002\u001a\u00020X2\b\u0010§\u0002\u001a\u00030¨\u0002J \u0010©\u0002\u001a\u00020X2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010§\u0002\u001a\u00030¨\u0002H\u0082 J\u001a\u0010ª\u0002\u001a\n\u0012\u0005\u0012\u00030¬\u00020«\u00022\u0007\u0010\u00ad\u0002\u001a\u00020#H\u0016J\u001b\u0010®\u0002\u001a\n\u0012\u0005\u0012\u00030¬\u00020«\u00022\u0007\u0010\u00ad\u0002\u001a\u00020#H\u0082 R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010$\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010+\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010&\"\u0004\b-\u0010(R\u0013\u00100\u001a\u0004\u0018\u0001018F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u00105\u001a\u0004\u0018\u0001018F¢\u0006\u0006\u001a\u0004\b6\u00103R(\u00108\u001a\u0004\u0018\u0001012\b\u0010\u0018\u001a\u0004\u0018\u0001018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u00103\"\u0004\b:\u0010;R(\u0010>\u001a\u0004\u0018\u0001012\b\u0010\u0018\u001a\u0004\u0018\u0001018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u00103\"\u0004\b@\u0010;R(\u0010C\u001a\u0004\u0018\u0001012\b\u0010\u0018\u001a\u0004\u0018\u0001018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u00103\"\u0004\bE\u0010;R(\u0010I\u001a\u0004\u0018\u00010H2\b\u0010\u0018\u001a\u0004\u0018\u00010H8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010Q\u001a\u00020P2\u0006\u0010\u0018\u001a\u00020P8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010Y\u001a\u00020X2\u0006\u0010\u0018\u001a\u00020X8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010_\u001a\u00020X2\u0006\u0010\u0018\u001a\u00020X8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010Z\"\u0004\b`\u0010\\R(\u0010d\u001a\u0004\u0018\u00010c2\b\u0010\u0018\u001a\u0004\u0018\u00010c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u0013\u0010k\u001a\u0004\u0018\u00010l8F¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0013\u0010r\u001a\u0004\u0018\u00010s8F¢\u0006\u0006\u001a\u0004\bt\u0010uR$\u0010w\u001a\u00020c2\u0006\u0010\u0018\u001a\u00020c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bx\u0010f\"\u0004\by\u0010hR$\u0010|\u001a\u00020c2\u0006\u0010\u0018\u001a\u00020c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b}\u0010f\"\u0004\b~\u0010hR\u0015\u0010\u0081\u0001\u001a\u00030\u0082\u00018F¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0015\u0010\u0086\u0001\u001a\u00030\u0087\u00018F¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0013\u0010\u008b\u0001\u001a\u00020X8F¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010ZR\u0013\u0010\u008d\u0001\u001a\u00020X8F¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010ZR\u0015\u0010\u008f\u0001\u001a\u00030\u0090\u00018F¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0015\u0010\u0094\u0001\u001a\u00030\u0095\u00018F¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0013\u0010\u0099\u0001\u001a\u00020#8F¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010&R\u0015\u0010\u009c\u0001\u001a\u00030\u0095\u00018F¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u0097\u0001R\u0013\u0010\u009f\u0001\u001a\u00020#8F¢\u0006\u0007\u001a\u0005\b \u0001\u0010&R\u0017\u0010¢\u0001\u001a\u0005\u0018\u00010\u0090\u00018F¢\u0006\b\u001a\u0006\b£\u0001\u0010\u0092\u0001R\u0015\u0010¥\u0001\u001a\u0004\u0018\u0001018F¢\u0006\u0007\u001a\u0005\b¦\u0001\u00103R\u0013\u0010¨\u0001\u001a\u00020c8F¢\u0006\u0007\u001a\u0005\b©\u0001\u0010fR\u0013\u0010«\u0001\u001a\u00020X8F¢\u0006\u0007\u001a\u0005\b«\u0001\u0010ZR\u0013\u0010\u00ad\u0001\u001a\u00020#8F¢\u0006\u0007\u001a\u0005\b®\u0001\u0010&R\u0013\u0010°\u0001\u001a\u00020#8F¢\u0006\u0007\u001a\u0005\b±\u0001\u0010&R\u0015\u0010³\u0001\u001a\u0004\u0018\u0001018F¢\u0006\u0007\u001a\u0005\b´\u0001\u00103R\u0015\u0010¶\u0001\u001a\u00030·\u00018F¢\u0006\b\u001a\u0006\b¸\u0001\u0010¹\u0001R\u0015\u0010»\u0001\u001a\u0004\u0018\u00010c8F¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010fR\u0013\u0010¾\u0001\u001a\u00020X8F¢\u0006\u0007\u001a\u0005\b¿\u0001\u0010ZR\u0013\u0010Á\u0001\u001a\u00020c8F¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010fR\u0013\u0010Ä\u0001\u001a\u00020c8F¢\u0006\u0007\u001a\u0005\bÅ\u0001\u0010fR\u0013\u0010Ç\u0001\u001a\u00020c8F¢\u0006\u0007\u001a\u0005\bÈ\u0001\u0010fR\u0013\u0010Ê\u0001\u001a\u00020c8F¢\u0006\u0007\u001a\u0005\bË\u0001\u0010fR\u0013\u0010Í\u0001\u001a\u00020c8F¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010fR\u0015\u0010Ð\u0001\u001a\u0004\u0018\u00010c8F¢\u0006\u0007\u001a\u0005\bÑ\u0001\u0010fR'\u0010Ó\u0001\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020#8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bÔ\u0001\u0010&\"\u0005\bÕ\u0001\u0010(R\u0015\u0010Ø\u0001\u001a\u0004\u0018\u00010c8F¢\u0006\u0007\u001a\u0005\bÙ\u0001\u0010fR'\u0010Û\u0001\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020#8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bÜ\u0001\u0010&\"\u0005\bÝ\u0001\u0010(R\u0013\u0010à\u0001\u001a\u00020c8F¢\u0006\u0007\u001a\u0005\bá\u0001\u0010fR\u0013\u0010ã\u0001\u001a\u00020c8F¢\u0006\u0007\u001a\u0005\bä\u0001\u0010fR\u001b\u0010æ\u0001\u001a\t\u0012\u0004\u0012\u00020P0ç\u00018F¢\u0006\b\u001a\u0006\bè\u0001\u0010é\u0001R\u0013\u0010ë\u0001\u001a\u00020c8F¢\u0006\u0007\u001a\u0005\bì\u0001\u0010fR\u0013\u0010î\u0001\u001a\u00020c8F¢\u0006\u0007\u001a\u0005\bï\u0001\u0010fR\u0013\u0010ñ\u0001\u001a\u00020c8F¢\u0006\u0007\u001a\u0005\bò\u0001\u0010fR\u0013\u0010ô\u0001\u001a\u00020c8F¢\u0006\u0007\u001a\u0005\bõ\u0001\u0010fR\u0013\u0010÷\u0001\u001a\u00020c8F¢\u0006\u0007\u001a\u0005\bø\u0001\u0010fR\u0013\u0010ú\u0001\u001a\u00020c8F¢\u0006\u0007\u001a\u0005\bû\u0001\u0010fR\u0013\u0010ý\u0001\u001a\u00020c8F¢\u0006\u0007\u001a\u0005\bþ\u0001\u0010fR\u0013\u0010\u0080\u0002\u001a\u00020c8F¢\u0006\u0007\u001a\u0005\b\u0081\u0002\u0010fR\u0013\u0010\u0083\u0002\u001a\u00020X8F¢\u0006\u0007\u001a\u0005\b\u0084\u0002\u0010ZR\u0013\u0010\u0086\u0002\u001a\u00020X8F¢\u0006\u0007\u001a\u0005\b\u0087\u0002\u0010ZR\u0013\u0010\u0089\u0002\u001a\u00020X8F¢\u0006\u0007\u001a\u0005\b\u008a\u0002\u0010ZR\u0013\u0010\u008c\u0002\u001a\u00020X8F¢\u0006\u0007\u001a\u0005\b\u008d\u0002\u0010ZR\u0013\u0010\u008f\u0002\u001a\u00020c8F¢\u0006\u0007\u001a\u0005\b\u0090\u0002\u0010fR\u0013\u0010\u0092\u0002\u001a\u00020X8F¢\u0006\u0007\u001a\u0005\b\u0093\u0002\u0010ZR\u0013\u0010\u0095\u0002\u001a\u00020X8F¢\u0006\u0007\u001a\u0005\b\u0095\u0002\u0010ZR\u0013\u0010\t\u001a\u00020\n8F¢\u0006\b\u001a\u0006\b\u0097\u0002\u0010\u0098\u0002R(\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009a\u0002\u0010\u009b\u0002\"\u0006\b\u009c\u0002\u0010\u009d\u0002¨\u0006´\u0002"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "config", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Config;", "callbacks", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Config;Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Callbacks;)V", "presentation", "Lcom/polymarket/data/EMarket$MarketSide$DisplayContext;", "getPresentation", "()Lcom/polymarket/data/EMarket$MarketSide$DisplayContext;", "Swift_presentation", "rulesDisclaimer", "Lcom/polymarket/usviewmodels/MarketRulesDisclaimerPresentation;", "getRulesDisclaimer", "()Lcom/polymarket/usviewmodels/MarketRulesDisclaimerPresentation;", "Swift_rulesDisclaimer", "newValue", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$FocusedField;", "focusedField", "getFocusedField", "()Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$FocusedField;", "setFocusedField", "(Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$FocusedField;)V", "Swift_focusedField", "Swift_focusedField_set", "", "value", "", "shakeSharesField", "getShakeSharesField", "()I", "setShakeSharesField", "(I)V", "Swift_shakeSharesField", "Swift_shakeSharesField_set", "shakePriceField", "getShakePriceField", "setShakePriceField", "Swift_shakePriceField", "Swift_shakePriceField_set", "estimatedProceeds", "Lcom/polymarket/data/EAmount;", "getEstimatedProceeds", "()Lcom/polymarket/data/EAmount;", "Swift_estimatedProceeds", "estimatedFee", "getEstimatedFee", "Swift_estimatedFee", "estimatedProfit", "getEstimatedProfit", "setEstimatedProfit", "(Lcom/polymarket/data/EAmount;)V", "Swift_estimatedProfit", "Swift_estimatedProfit_set", "bidPrice", "getBidPrice", "setBidPrice", "Swift_bidPrice", "Swift_bidPrice_set", "askPrice", "getAskPrice", "setAskPrice", "Swift_askPrice", "Swift_askPrice_set", "Lcom/polymarket/data/EUserPosition;", "currentPosition", "getCurrentPosition", "()Lcom/polymarket/data/EUserPosition;", "setCurrentPosition", "(Lcom/polymarket/data/EUserPosition;)V", "Swift_currentPosition", "Swift_currentPosition_set", "Lcom/polymarket/data/ETIFOption;", "selectedTIFOption", "getSelectedTIFOption", "()Lcom/polymarket/data/ETIFOption;", "setSelectedTIFOption", "(Lcom/polymarket/data/ETIFOption;)V", "Swift_selectedTIFOption", "Swift_selectedTIFOption_set", "", "isLoading", "()Z", "setLoading", "(Z)V", "Swift_isLoading", "Swift_isLoading_set", "isOrderPlaced", "setOrderPlaced", "Swift_isOrderPlaced", "Swift_isOrderPlaced_set", "", "validationError", "getValidationError", "()Ljava/lang/String;", "setValidationError", "(Ljava/lang/String;)V", "Swift_validationError", "Swift_validationError_set", "geoDeniedVerdict", "Lcom/polymarket/usdependencies/GeoComplianceVerdict;", "getGeoDeniedVerdict", "()Lcom/polymarket/usdependencies/GeoComplianceVerdict;", "Swift_geoDeniedVerdict", "clearGeoDenial", "Swift_clearGeoDenial_0", "sellRiskWarning", "Lcom/polymarket/usviewmodels/SellOrderRiskWarningPresentation;", "getSellRiskWarning", "()Lcom/polymarket/usviewmodels/SellOrderRiskWarningPresentation;", "Swift_sellRiskWarning", "numberOfShares", "getNumberOfShares", "setNumberOfShares", "Swift_numberOfShares", "Swift_numberOfShares_set", "limitPrice", "getLimitPrice", "setLimitPrice", "Swift_limitPrice", "Swift_limitPrice_set", "sharesDisplay", "Lcom/polymarket/data/LimitOrderInputSharesDisplay;", "getSharesDisplay", "()Lcom/polymarket/data/LimitOrderInputSharesDisplay;", "Swift_sharesDisplay", "priceDisplay", "Lcom/polymarket/data/LimitOrderInputPriceDisplay;", "getPriceDisplay", "()Lcom/polymarket/data/LimitOrderInputPriceDisplay;", "Swift_priceDisplay", "isSharesFocused", "Swift_isSharesFocused", "isPriceFocused", "Swift_isPriceFocused", "maxSellableShares", "Lcom/polymarket/data/EQuantity;", "getMaxSellableShares", "()Lcom/polymarket/data/EQuantity;", "Swift_maxSellableShares", "maxSellableSharesDouble", "", "getMaxSellableSharesDouble", "()D", "Swift_maxSellableSharesDouble", "maxSellableSharesInt", "getMaxSellableSharesInt", "Swift_maxSellableSharesInt", "numberOfSharesDouble", "getNumberOfSharesDouble", "Swift_numberOfSharesDouble", "numberOfSharesInt", "getNumberOfSharesInt", "Swift_numberOfSharesInt", "matchingShares", "getMatchingShares", "Swift_matchingShares", "positionCostBasis", "getPositionCostBasis", "Swift_positionCostBasis", "marketSlug", "getMarketSlug", "Swift_marketSlug", "isDecimalizedMarket", "Swift_isDecimalizedMarket", "priceDecimalPlaces", "getPriceDecimalPlaces", "Swift_priceDecimalPlaces", "quantityDecimalPlaces", "getQuantityDecimalPlaces", "Swift_quantityDecimalPlaces", "limitPriceAmount", "getLimitPriceAmount", "Swift_limitPriceAmount", "sportsOddsFormat", "Lcom/polymarket/data/OddsFormat;", "getSportsOddsFormat", "()Lcom/polymarket/data/OddsFormat;", "Swift_sportsOddsFormat", "formattedOdds", "getFormattedOdds", "Swift_formattedOdds", "canPlaceOrder", "getCanPlaceOrder", "Swift_canPlaceOrder", "marketSideTitle", "getMarketSideTitle", "Swift_marketSideTitle", "eventTitle", "getEventTitle", "Swift_eventTitle", "formattedBidAsk", "getFormattedBidAsk", "Swift_formattedBidAsk", "sharesInputSubtitle", "getSharesInputSubtitle", "Swift_sharesInputSubtitle", "priceInputSubtitle", "getPriceInputSubtitle", "Swift_priceInputSubtitle", "tickValidationMessage", "getTickValidationMessage", "Swift_tickValidationMessage", "shakeTickValidation", "getShakeTickValidation", "setShakeTickValidation", "Swift_shakeTickValidation", "Swift_shakeTickValidation_set", "quantityValidationMessage", "getQuantityValidationMessage", "Swift_quantityValidationMessage", "shakeQuantityValidation", "getShakeQuantityValidation", "setShakeQuantityValidation", "Swift_shakeQuantityValidation", "Swift_shakeQuantityValidation_set", "formattedAvailableShares", "getFormattedAvailableShares", "Swift_formattedAvailableShares", "timeInForceDisplayText", "getTimeInForceDisplayText", "Swift_timeInForceDisplayText", "availableTIFOptions", "", "getAvailableTIFOptions", "()Ljava/util/List;", "Swift_availableTIFOptions", "priceFieldTitle", "getPriceFieldTitle", "Swift_priceFieldTitle", "sharesFieldTitle", "getSharesFieldTitle", "Swift_sharesFieldTitle", "expirationLabel", "getExpirationLabel", "Swift_expirationLabel", "expiryRowLabel", "getExpiryRowLabel", "Swift_expiryRowLabel", "matchedSharesLabel", "getMatchedSharesLabel", "Swift_matchedSharesLabel", "oddsLabel", "getOddsLabel", "Swift_oddsLabel", "avgCostLabel", "getAvgCostLabel", "Swift_avgCostLabel", "estimatedProceedsLabel", "getEstimatedProceedsLabel", "Swift_estimatedProceedsLabel", "canIncrementPrice", "getCanIncrementPrice", "Swift_canIncrementPrice", "canDecrementPrice", "getCanDecrementPrice", "Swift_canDecrementPrice", "canIncrementShares", "getCanIncrementShares", "Swift_canIncrementShares", "canDecrementShares", "getCanDecrementShares", "Swift_canDecrementShares", "placeOrderButtonTitle", "getPlaceOrderButtonTitle", "Swift_placeOrderButtonTitle", "shouldShowFees", "getShouldShowFees", "Swift_shouldShowFees", "isProfitable", "Swift_isProfitable", "getConfig", "()Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Config;", "Swift_config", "getCallbacks", "()Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Callbacks;", "setCallbacks", "(Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Callbacks;)V", "Swift_callbacks", "Swift_callbacks_set", "setup", "Swift_setup_2", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input;", "Swift_sendInput_3", "sendPadKey", "key", "Lcom/polymarket/data/NumberPadKey;", "Swift_sendPadKey_4", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Config", "Callbacks", "FocusedField", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SellLimitOrderViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$FocusedField;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "shares", "price", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    public /* synthetic */ SellLimitOrderViewModel(Config config, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(config, (i & 2) != 0 ? new Callbacks(null, null, null, 7, null) : callbacks);
    }

    private final native EAmount Swift_askPrice(long Swift_peer);

    private final native void Swift_askPrice_set(long Swift_peer, EAmount value);

    private final native List<ETIFOption> Swift_availableTIFOptions(long Swift_peer);

    private final native String Swift_avgCostLabel(long Swift_peer);

    private final native EAmount Swift_bidPrice(long Swift_peer);

    private final native void Swift_bidPrice_set(long Swift_peer, EAmount value);

    private final native Callbacks Swift_callbacks(long Swift_peer);

    private final native void Swift_callbacks_set(long Swift_peer, Callbacks value);

    private final native boolean Swift_canDecrementPrice(long Swift_peer);

    private final native boolean Swift_canDecrementShares(long Swift_peer);

    private final native boolean Swift_canIncrementPrice(long Swift_peer);

    private final native boolean Swift_canIncrementShares(long Swift_peer);

    private final native boolean Swift_canPlaceOrder(long Swift_peer);

    private final native void Swift_clearGeoDenial_0(long Swift_peer);

    private final native Config Swift_config(long Swift_peer);

    private final native EUserPosition Swift_currentPosition(long Swift_peer);

    private final native void Swift_currentPosition_set(long Swift_peer, EUserPosition value);

    private final native EAmount Swift_estimatedFee(long Swift_peer);

    private final native EAmount Swift_estimatedProceeds(long Swift_peer);

    private final native String Swift_estimatedProceedsLabel(long Swift_peer);

    private final native EAmount Swift_estimatedProfit(long Swift_peer);

    private final native void Swift_estimatedProfit_set(long Swift_peer, EAmount value);

    private final native String Swift_eventTitle(long Swift_peer);

    private final native String Swift_expirationLabel(long Swift_peer);

    private final native String Swift_expiryRowLabel(long Swift_peer);

    private final native FocusedField Swift_focusedField(long Swift_peer);

    private final native void Swift_focusedField_set(long Swift_peer, FocusedField value);

    private final native String Swift_formattedAvailableShares(long Swift_peer);

    private final native String Swift_formattedBidAsk(long Swift_peer);

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

    private final native String Swift_limitPrice(long Swift_peer);

    private final native EAmount Swift_limitPriceAmount(long Swift_peer);

    private final native void Swift_limitPrice_set(long Swift_peer, String value);

    private final native String Swift_marketSideTitle(long Swift_peer);

    private final native String Swift_marketSlug(long Swift_peer);

    private final native String Swift_matchedSharesLabel(long Swift_peer);

    private final native EQuantity Swift_matchingShares(long Swift_peer);

    private final native EQuantity Swift_maxSellableShares(long Swift_peer);

    private final native double Swift_maxSellableSharesDouble(long Swift_peer);

    private final native int Swift_maxSellableSharesInt(long Swift_peer);

    private final native String Swift_numberOfShares(long Swift_peer);

    private final native double Swift_numberOfSharesDouble(long Swift_peer);

    private final native int Swift_numberOfSharesInt(long Swift_peer);

    private final native void Swift_numberOfShares_set(long Swift_peer, String value);

    private final native String Swift_oddsLabel(long Swift_peer);

    private final native String Swift_placeOrderButtonTitle(long Swift_peer);

    private final native EAmount Swift_positionCostBasis(long Swift_peer);

    private final native EMarket.MarketSide.DisplayContext Swift_presentation(long Swift_peer);

    private final native int Swift_priceDecimalPlaces(long Swift_peer);

    private final native LimitOrderInputPriceDisplay Swift_priceDisplay(long Swift_peer);

    private final native String Swift_priceFieldTitle(long Swift_peer);

    private final native String Swift_priceInputSubtitle(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native int Swift_quantityDecimalPlaces(long Swift_peer);

    private final native String Swift_quantityValidationMessage(long Swift_peer);

    private final native MarketRulesDisclaimerPresentation Swift_rulesDisclaimer(long Swift_peer);

    private final native ETIFOption Swift_selectedTIFOption(long Swift_peer);

    private final native void Swift_selectedTIFOption_set(long Swift_peer, ETIFOption value);

    private final native SellOrderRiskWarningPresentation Swift_sellRiskWarning(long Swift_peer);

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

    private final native boolean Swift_shouldShowFees(long Swift_peer);

    private final native OddsFormat Swift_sportsOddsFormat(long Swift_peer);

    private final native String Swift_tickValidationMessage(long Swift_peer);

    private final native String Swift_timeInForceDisplayText(long Swift_peer);

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

    public final String getAvgCostLabel() {
        return Swift_avgCostLabel(getSwift_peer());
    }

    public final EAmount getBidPrice() {
        return Swift_bidPrice(getSwift_peer());
    }

    public final Callbacks getCallbacks() {
        return Swift_callbacks(getSwift_peer());
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

    public final Config getConfig() {
        return Swift_config(getSwift_peer());
    }

    public final EUserPosition getCurrentPosition() {
        return Swift_currentPosition(getSwift_peer());
    }

    public final EAmount getEstimatedFee() {
        return Swift_estimatedFee(getSwift_peer());
    }

    public final EAmount getEstimatedProceeds() {
        return Swift_estimatedProceeds(getSwift_peer());
    }

    public final String getEstimatedProceedsLabel() {
        return Swift_estimatedProceedsLabel(getSwift_peer());
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

    public final String getFormattedAvailableShares() {
        return Swift_formattedAvailableShares(getSwift_peer());
    }

    public final String getFormattedBidAsk() {
        return Swift_formattedBidAsk(getSwift_peer());
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

    public final EQuantity getMaxSellableShares() {
        return Swift_maxSellableShares(getSwift_peer());
    }

    public final double getMaxSellableSharesDouble() {
        return Swift_maxSellableSharesDouble(getSwift_peer());
    }

    public final int getMaxSellableSharesInt() {
        return Swift_maxSellableSharesInt(getSwift_peer());
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

    public final EAmount getPositionCostBasis() {
        return Swift_positionCostBasis(getSwift_peer());
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

    public final int getQuantityDecimalPlaces() {
        return Swift_quantityDecimalPlaces(getSwift_peer());
    }

    public final String getQuantityValidationMessage() {
        return Swift_quantityValidationMessage(getSwift_peer());
    }

    public final MarketRulesDisclaimerPresentation getRulesDisclaimer() {
        return Swift_rulesDisclaimer(getSwift_peer());
    }

    public final ETIFOption getSelectedTIFOption() {
        return Swift_selectedTIFOption(getSwift_peer());
    }

    public final SellOrderRiskWarningPresentation getSellRiskWarning() {
        return Swift_sellRiskWarning(getSwift_peer());
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

    public final boolean getShouldShowFees() {
        return Swift_shouldShowFees(getSwift_peer());
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

    public final void setCurrentPosition(EUserPosition eUserPosition) {
        Swift_currentPosition_set(getSwift_peer(), (EUserPosition) StructKt.sref$default(eUserPosition, null, 1, null));
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
    @Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 &2\u00020\u0001:\u0016\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0015'()*+,-./0123456789:;¨\u0006<"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnNumberOfSharesChangedCase", "OnLimitPriceChangedCase", "OnTIFOptionSelectedCase", "OnPlaceOrderCase", "OnOrderBookTappedCase", "OnPrefillPriceCase", "OnPrefillFromOrderBookCase", "OnMaxSharesTappedCase", "OnQuickPercentageTappedCase", "OnFocusChangedCase", "OnValidationErrorCase", "OnIncrementPriceCase", "OnDecrementPriceCase", "OnIncrementSharesCase", "OnDecrementSharesCase", "OnQuickSharesDeltaCase", "OnMaxSharesCase", "OnMatchingSharesTappedCase", "OnProceedsInfoTappedCase", "OnSellRiskWarningTappedCase", "Companion", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnDecrementPriceCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnDecrementSharesCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnFocusChangedCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnIncrementPriceCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnIncrementSharesCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnLimitPriceChangedCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnMatchingSharesTappedCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnMaxSharesCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnMaxSharesTappedCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnNumberOfSharesChangedCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnOrderBookTappedCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnPlaceOrderCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnPrefillFromOrderBookCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnPrefillPriceCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnProceedsInfoTappedCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnQuickPercentageTappedCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnQuickSharesDeltaCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnSellRiskWarningTappedCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnTIFOptionSelectedCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnValidationErrorCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnViewDidLoadCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onPlaceOrder = new OnPlaceOrderCase();
        private static final Input onOrderBookTapped = new OnOrderBookTappedCase();
        private static final Input onMaxSharesTapped = new OnMaxSharesTappedCase();
        private static final Input onValidationError = new OnValidationErrorCase();
        private static final Input onIncrementPrice = new OnIncrementPriceCase();
        private static final Input onDecrementPrice = new OnDecrementPriceCase();
        private static final Input onIncrementShares = new OnIncrementSharesCase();
        private static final Input onDecrementShares = new OnDecrementSharesCase();
        private static final Input onMaxShares = new OnMaxSharesCase();
        private static final Input onMatchingSharesTapped = new OnMatchingSharesTappedCase();
        private static final Input onProceedsInfoTapped = new OnProceedsInfoTappedCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnDecrementPriceCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDecrementPriceCase extends Input {
            public OnDecrementPriceCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnDecrementSharesCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDecrementSharesCase extends Input {
            public OnDecrementSharesCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnFocusChangedCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$FocusedField;", "<init>", "(Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$FocusedField;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$FocusedField;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnIncrementPriceCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnIncrementPriceCase extends Input {
            public OnIncrementPriceCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnIncrementSharesCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnIncrementSharesCase extends Input {
            public OnIncrementSharesCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnLimitPriceChangedCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnMatchingSharesTappedCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnMatchingSharesTappedCase extends Input {
            public OnMatchingSharesTappedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnMaxSharesCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnMaxSharesCase extends Input {
            public OnMaxSharesCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnMaxSharesTappedCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnMaxSharesTappedCase extends Input {
            public OnMaxSharesTappedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnNumberOfSharesChangedCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnOrderBookTappedCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnOrderBookTappedCase extends Input {
            public OnOrderBookTappedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnPlaceOrderCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPlaceOrderCase extends Input {
            public OnPlaceOrderCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnPrefillFromOrderBookCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input;", "associated0", "Lcom/polymarket/data/EAmount;", "<init>", "(Lcom/polymarket/data/EAmount;)V", "getAssociated0", "()Lcom/polymarket/data/EAmount;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnPrefillPriceCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input;", "associated0", "Lcom/polymarket/data/EAmount;", "<init>", "(Lcom/polymarket/data/EAmount;)V", "getAssociated0", "()Lcom/polymarket/data/EAmount;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnProceedsInfoTappedCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnProceedsInfoTappedCase extends Input {
            public OnProceedsInfoTappedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnQuickPercentageTappedCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input;", "associated0", "", "<init>", "(D)V", "getAssociated0", "()D", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnQuickPercentageTappedCase extends Input {
            private final double associated0;

            public OnQuickPercentageTappedCase(double d) {
                super(null);
                this.associated0 = d;
            }

            public final double getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnQuickSharesDeltaCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input;", "associated0", "", "<init>", "(I)V", "getAssociated0", "()I", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnSellRiskWarningTappedCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/SellOrderRiskWarningPresentation;", "<init>", "(Lcom/polymarket/usviewmodels/SellOrderRiskWarningPresentation;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/SellOrderRiskWarningPresentation;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSellRiskWarningTappedCase extends Input {
            private final SellOrderRiskWarningPresentation associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSellRiskWarningTappedCase(SellOrderRiskWarningPresentation sellOrderRiskWarningPresentation) {
                super(null);
                sellOrderRiskWarningPresentation.getClass();
                this.associated0 = sellOrderRiskWarningPresentation;
            }

            public final SellOrderRiskWarningPresentation getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnTIFOptionSelectedCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input;", "associated0", "Lcom/polymarket/data/ETIFOption;", "<init>", "(Lcom/polymarket/data/ETIFOption;)V", "getAssociated0", "()Lcom/polymarket/data/ETIFOption;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnValidationErrorCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnValidationErrorCase extends Input {
            public OnValidationErrorCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        public static final /* synthetic */ Input access$getOnMaxSharesTapped$cp() {
            return onMaxSharesTapped;
        }

        public static final /* synthetic */ Input access$getOnOrderBookTapped$cp() {
            return onOrderBookTapped;
        }

        public static final /* synthetic */ Input access$getOnPlaceOrder$cp() {
            return onPlaceOrder;
        }

        public static final /* synthetic */ Input access$getOnProceedsInfoTapped$cp() {
            return onProceedsInfoTapped;
        }

        public static final /* synthetic */ Input access$getOnValidationError$cp() {
            return onValidationError;
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
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u001aJ\u000e\u0010%\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020&J\u000e\u0010-\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020.R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0007R\u0011\u0010\u001d\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0007R\u0011\u0010\u001f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0007R\u0011\u0010!\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0007R\u0011\u0010#\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0007R\u0011\u0010'\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0007R\u0011\u0010)\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0007R\u0011\u0010+\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0007¨\u0006/"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Input;", "onNumberOfSharesChanged", "associated0", "", "onLimitPriceChanged", "onTIFOptionSelected", "Lcom/polymarket/data/ETIFOption;", "onPlaceOrder", "getOnPlaceOrder", "onOrderBookTapped", "getOnOrderBookTapped", "onPrefillPrice", "Lcom/polymarket/data/EAmount;", "onPrefillFromOrderBook", "onMaxSharesTapped", "getOnMaxSharesTapped", "onQuickPercentageTapped", "", "onFocusChanged", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$FocusedField;", "onValidationError", "getOnValidationError", "onIncrementPrice", "getOnIncrementPrice", "onDecrementPrice", "getOnDecrementPrice", "onIncrementShares", "getOnIncrementShares", "onDecrementShares", "getOnDecrementShares", "onQuickSharesDelta", "", "onMaxShares", "getOnMaxShares", "onMatchingSharesTapped", "getOnMatchingSharesTapped", "onProceedsInfoTapped", "getOnProceedsInfoTapped", "onSellRiskWarningTapped", "Lcom/polymarket/usviewmodels/SellOrderRiskWarningPresentation;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
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

            public final Input getOnMaxSharesTapped() {
                return Input.access$getOnMaxSharesTapped$cp();
            }

            public final Input getOnOrderBookTapped() {
                return Input.access$getOnOrderBookTapped$cp();
            }

            public final Input getOnPlaceOrder() {
                return Input.access$getOnPlaceOrder$cp();
            }

            public final Input getOnProceedsInfoTapped() {
                return Input.access$getOnProceedsInfoTapped$cp();
            }

            public final Input getOnValidationError() {
                return Input.access$getOnValidationError$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input onFocusChanged(FocusedField associated0) {
                associated0.getClass();
                return new OnFocusChangedCase(associated0);
            }

            public final Input onLimitPriceChanged(String associated0) {
                associated0.getClass();
                return new OnLimitPriceChangedCase(associated0);
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

            public final Input onQuickPercentageTapped(double associated0) {
                return new OnQuickPercentageTappedCase(associated0);
            }

            public final Input onQuickSharesDelta(int associated0) {
                return new OnQuickSharesDeltaCase(associated0);
            }

            public final Input onSellRiskWarningTapped(SellOrderRiskWarningPresentation associated0) {
                associated0.getClass();
                return new OnSellRiskWarningTappedCase(associated0);
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
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082 ¨\u0006\u000b"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_1", "", "Lskip/bridge/SwiftObjectPointer;", "config", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Config;", "callbacks", "Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Callbacks;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_1(Config config, Callbacks callbacks);

        public static final /* synthetic */ long access$Swift_Companion_constructor_1(Companion companion, Config config, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_1(config, callbacks);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellLimitOrderViewModel(Config config, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_1(INSTANCE, config, callbacks), (SwiftPeerMarker) null);
        config.getClass();
        callbacks.getClass();
    }

    public SellLimitOrderViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\b\u0010\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u0015\u0010\u0017\u001a\u00020\u00162\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0015\u0010 \u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010#\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010&\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J%\u0010'\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001b0)2\u0006\u0010*\u001a\u00020\u001dH\u0016J\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001b0)2\u0006\u0010*\u001a\u00020\u001dH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006-"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Config;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "position", "Lcom/polymarket/data/EUserPosition;", "event", "Lcom/polymarket/data/EEvent;", "marketSide", "Lcom/polymarket/data/EMarket$MarketSide;", "(Lcom/polymarket/data/EUserPosition;Lcom/polymarket/data/EEvent;Lcom/polymarket/data/EMarket$MarketSide;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getPosition", "()Lcom/polymarket/data/EUserPosition;", "Swift_position", "getEvent", "()Lcom/polymarket/data/EEvent;", "Swift_event", "getMarketSide", "()Lcom/polymarket/data/EMarket$MarketSide;", "Swift_marketSide", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Config implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public Config(EUserPosition eUserPosition, EEvent eEvent, EMarket.MarketSide marketSide) {
            eUserPosition.getClass();
            eEvent.getClass();
            marketSide.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(eUserPosition, eEvent, marketSide);
        }

        private final native long Swift_constructor_0(EUserPosition position, EEvent event, EMarket.MarketSide marketSide);

        private final native EEvent Swift_event(long Swift_peer);

        private final native EMarket.MarketSide Swift_marketSide(long Swift_peer);

        private final native EUserPosition Swift_position(long Swift_peer);

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

        public final EEvent getEvent() {
            return Swift_event(this.Swift_peer);
        }

        public final EMarket.MarketSide getMarketSide() {
            return Swift_marketSide(this.Swift_peer);
        }

        public final EUserPosition getPosition() {
            return Swift_position(this.Swift_peer);
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
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB?\b\u0016\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0004\b\b\u0010\u0011J\u0006\u0010\u0016\u001a\u00020\rJ\u0015\u0010\u0017\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J=\u0010\u001e\u001a\u00060\u0004j\u0002`\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0082 J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000f2\u0006\u0010 \u001a\u00020\u001dH\u0016J\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000f2\u0006\u0010 \u001a\u00020\u001dH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/polymarket/usviewmodels/SellLimitOrderViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onOrderPlaced", "Lkotlin/Function1;", "", "", "onOrderBookTapped", "Lkotlin/Function0;", "onRequiresAuthentication", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function1 function1, Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new zog(13) : function1, (i & 2) != 0 ? new ljg(13) : function0, (i & 4) != 0 ? new ljg(14) : function02);
        }

        private final native long Swift_constructor_0(Function1<? super String, Unit> onOrderPlaced, Function0<Unit> onOrderBookTapped, Function0<Unit> onRequiresAuthentication);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(String str) {
            str.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a() {
            return _init_$lambda$1();
        }

        public static /* synthetic */ Unit b(String str) {
            return _init_$lambda$0(str);
        }

        public static /* synthetic */ Unit c() {
            return _init_$lambda$2();
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

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public Callbacks(Function1<? super String, Unit> function1, Function0<Unit> function0, Function0<Unit> function02) {
            function1.getClass();
            function0.getClass();
            function02.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function1, function0, function02);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
