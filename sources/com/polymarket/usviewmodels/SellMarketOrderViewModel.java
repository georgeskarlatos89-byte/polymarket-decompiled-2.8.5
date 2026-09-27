package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAlert;
import com.polymarket.data.AmountInputConfig;
import com.polymarket.data.EAmount;
import com.polymarket.data.EEvent;
import com.polymarket.data.EMarket;
import com.polymarket.data.EUserPosition;
import com.polymarket.data.NumberPadKey;
import com.polymarket.data.OddsFormat;
import com.polymarket.data.SharePlatform;
import com.polymarket.usdependencies.GeoComplianceVerdict;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.ljg;
import defpackage.ug7;
import defpackage.wgg;
import defpackage.woa;
import defpackage.ww4;
import defpackage.zog;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Array;
import skip.lib.ArrayKt;
import skip.lib.CaseIterable;
import skip.lib.CaseIterableCompanion;
import skip.lib.Identifiable;
import skip.lib.RawRepresentable;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0007\u0018\u0000 \u008d\u00022\u00020\u0001:\u000e\u0087\u0002\u0088\u0002\u0089\u0002\u008a\u0002\u008b\u0002\u008c\u0002\u008d\u0002B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB/\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0007\u0010\u0011B'\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0007\u0010\u0013J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0015\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010 \u001a\u00020\u001d2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010%\u001a\u0004\u0018\u00010\"2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010)\u001a\u00020'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010/\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u00100\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00101\u001a\u00020\nH\u0082 J\u0017\u00106\u001a\u0004\u0018\u00010\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u00107\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u00101\u001a\u0004\u0018\u00010\fH\u0082 J\u0017\u0010>\u001a\u0004\u0018\u0001082\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010?\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u00101\u001a\u0004\u0018\u000108H\u0082 J\u0015\u0010F\u001a\u00020@2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010G\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00101\u001a\u00020@H\u0082 J\u0015\u0010N\u001a\u00020H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010O\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00101\u001a\u00020HH\u0082 J\u0015\u0010V\u001a\u00020P2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010W\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00101\u001a\u00020PH\u0082 J\u0015\u0010[\u001a\u00020P2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\\\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00101\u001a\u00020PH\u0082 J\u0015\u0010`\u001a\u00020P2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010a\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00101\u001a\u00020PH\u0082 J\u0015\u0010e\u001a\u00020P2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010f\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00101\u001a\u00020PH\u0082 J\u0015\u0010k\u001a\u00020'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010l\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00101\u001a\u00020'H\u0082 J\u001b\u0010t\u001a\b\u0012\u0004\u0012\u00020n0m2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010u\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u00101\u001a\b\u0012\u0004\u0012\u00020n0mH\u0082 J\u0015\u0010x\u001a\u00020'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010y\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00101\u001a\u00020'H\u0082 J\u0015\u0010|\u001a\u00020'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010}\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00101\u001a\u00020'H\u0082 J\u0016\u0010\u0080\u0001\u001a\u00020'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010\u0081\u0001\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00101\u001a\u00020'H\u0082 J\u0019\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0082\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J!\u0010\u0089\u0001\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\t\u00101\u001a\u0005\u0018\u00010\u0082\u0001H\u0082 J\u0019\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008a\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J!\u0010\u0091\u0001\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\t\u00101\u001a\u0005\u0018\u00010\u008a\u0001H\u0082 J\u0019\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0092\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J!\u0010\u0099\u0001\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\t\u00101\u001a\u0005\u0018\u00010\u0092\u0001H\u0082 J\u0016\u0010\u009c\u0001\u001a\u00020'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010\u009d\u0001\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00101\u001a\u00020'H\u0082 J\u0017\u0010¤\u0001\u001a\u00030\u009e\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010¥\u0001\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u00101\u001a\u00030\u009e\u0001H\u0082 J\u0017\u0010¨\u0001\u001a\u00030\u008a\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0018\u0010«\u0001\u001a\u0004\u0018\u00010H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010®\u0001\u001a\u00030\u008a\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010³\u0001\u001a\u00030°\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0019\u0010¸\u0001\u001a\u0005\u0018\u00010µ\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010»\u0001\u001a\u00030\u008a\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¾\u0001\u001a\u00020H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0019\u0010Á\u0001\u001a\u0005\u0018\u00010\u008a\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0018\u0010Ä\u0001\u001a\u0004\u0018\u00010H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0019\u0010Ç\u0001\u001a\u0005\u0018\u00010\u008a\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0018\u0010Ê\u0001\u001a\u0004\u0018\u00010H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0018\u0010Í\u0001\u001a\u0004\u0018\u00010H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Ð\u0001\u001a\u00020'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0019\u0010Ó\u0001\u001a\u0005\u0018\u00010\u008a\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0019\u0010Ö\u0001\u001a\u0005\u0018\u00010\u008a\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Ù\u0001\u001a\u00020'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0018\u0010Ü\u0001\u001a\u0004\u0018\u00010H2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010ß\u0001\u001a\u00030\u008a\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010ä\u0001\u001a\u00030á\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010ç\u0001\u001a\u00030\u008a\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010é\u0001\u001a\u00020'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010ì\u0001\u001a\u00020'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010ï\u0001\u001a\u00020'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010ô\u0001\u001a\u00020\u00102\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010õ\u0001\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u00101\u001a\u00020\u0010H\u0082 J\t\u0010ö\u0001\u001a\u00020\u001aH\u0016J\u0016\u0010÷\u0001\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0011\u0010ø\u0001\u001a\u00020\u001a2\b\u0010ù\u0001\u001a\u00030ú\u0001J \u0010û\u0001\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010ù\u0001\u001a\u00030ú\u0001H\u0082 J\u0011\u0010ü\u0001\u001a\u00020'2\b\u0010ý\u0001\u001a\u00030þ\u0001J \u0010ÿ\u0001\u001a\u00020'2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010ý\u0001\u001a\u00030þ\u0001H\u0082 J\u0007\u0010\u0080\u0002\u001a\u00020\u001aJ\u0016\u0010\u0081\u0002\u001a\u00020\u001a2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001a\u0010\u0082\u0002\u001a\n\u0012\u0005\u0012\u00030\u0084\u00020\u0083\u00022\u0007\u0010\u0085\u0002\u001a\u00020PH\u0016J\u001b\u0010\u0086\u0002\u001a\n\u0012\u0005\u0012\u00030\u0084\u00020\u0083\u00022\u0007\u0010\u0085\u0002\u001a\u00020PH\u0082 R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010&\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b&\u0010(R$\u0010\t\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010*\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R(\u00109\u001a\u0004\u0018\u0001082\b\u0010*\u001a\u0004\u0018\u0001088F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010A\u001a\u00020@2\u0006\u0010*\u001a\u00020@8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010I\u001a\u00020H2\u0006\u0010*\u001a\u00020H8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010Q\u001a\u00020P2\u0006\u0010*\u001a\u00020P8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010X\u001a\u00020P2\u0006\u0010*\u001a\u00020P8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010S\"\u0004\bZ\u0010UR$\u0010]\u001a\u00020P2\u0006\u0010*\u001a\u00020P8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010S\"\u0004\b_\u0010UR$\u0010b\u001a\u00020P2\u0006\u0010*\u001a\u00020P8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bc\u0010S\"\u0004\bd\u0010UR$\u0010g\u001a\u00020'2\u0006\u0010*\u001a\u00020'8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010(\"\u0004\bi\u0010jR0\u0010o\u001a\b\u0012\u0004\u0012\u00020n0m2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020n0m8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR$\u0010v\u001a\u00020'2\u0006\u0010*\u001a\u00020'8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bv\u0010(\"\u0004\bw\u0010jR$\u0010z\u001a\u00020'2\u0006\u0010*\u001a\u00020'8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010(\"\u0004\b{\u0010jR$\u0010~\u001a\u00020'2\u0006\u0010*\u001a\u00020'8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b~\u0010(\"\u0004\b\u007f\u0010jR/\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0082\u00012\t\u0010*\u001a\u0005\u0018\u00010\u0082\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R/\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u00012\t\u0010*\u001a\u0005\u0018\u00010\u008a\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R/\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0092\u00012\t\u0010*\u001a\u0005\u0018\u00010\u0092\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R'\u0010\u009a\u0001\u001a\u00020'2\u0006\u0010*\u001a\u00020'8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u009a\u0001\u0010(\"\u0005\b\u009b\u0001\u0010jR+\u0010\u009f\u0001\u001a\u00030\u009e\u00012\u0007\u0010*\u001a\u00030\u009e\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R\u0015\u0010¦\u0001\u001a\u00030\u008a\u00018F¢\u0006\b\u001a\u0006\b§\u0001\u0010\u008d\u0001R\u0015\u0010©\u0001\u001a\u0004\u0018\u00010H8F¢\u0006\u0007\u001a\u0005\bª\u0001\u0010KR\u0015\u0010¬\u0001\u001a\u00030\u008a\u00018F¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010\u008d\u0001R\u0015\u0010¯\u0001\u001a\u00030°\u00018F¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001R\u0017\u0010´\u0001\u001a\u0005\u0018\u00010µ\u00018F¢\u0006\b\u001a\u0006\b¶\u0001\u0010·\u0001R\u0015\u0010¹\u0001\u001a\u00030\u008a\u00018F¢\u0006\b\u001a\u0006\bº\u0001\u0010\u008d\u0001R\u0013\u0010¼\u0001\u001a\u00020H8F¢\u0006\u0007\u001a\u0005\b½\u0001\u0010KR\u0017\u0010¿\u0001\u001a\u0005\u0018\u00010\u008a\u00018F¢\u0006\b\u001a\u0006\bÀ\u0001\u0010\u008d\u0001R\u0015\u0010Â\u0001\u001a\u0004\u0018\u00010H8F¢\u0006\u0007\u001a\u0005\bÃ\u0001\u0010KR\u0017\u0010Å\u0001\u001a\u0005\u0018\u00010\u008a\u00018F¢\u0006\b\u001a\u0006\bÆ\u0001\u0010\u008d\u0001R\u0015\u0010È\u0001\u001a\u0004\u0018\u00010H8F¢\u0006\u0007\u001a\u0005\bÉ\u0001\u0010KR\u0015\u0010Ë\u0001\u001a\u0004\u0018\u00010H8F¢\u0006\u0007\u001a\u0005\bÌ\u0001\u0010KR\u0013\u0010Î\u0001\u001a\u00020'8F¢\u0006\u0007\u001a\u0005\bÏ\u0001\u0010(R\u0017\u0010Ñ\u0001\u001a\u0005\u0018\u00010\u008a\u00018F¢\u0006\b\u001a\u0006\bÒ\u0001\u0010\u008d\u0001R\u0017\u0010Ô\u0001\u001a\u0005\u0018\u00010\u008a\u00018F¢\u0006\b\u001a\u0006\bÕ\u0001\u0010\u008d\u0001R\u0013\u0010×\u0001\u001a\u00020'8F¢\u0006\u0007\u001a\u0005\bØ\u0001\u0010(R\u0015\u0010Ú\u0001\u001a\u0004\u0018\u00010H8F¢\u0006\u0007\u001a\u0005\bÛ\u0001\u0010KR\u0015\u0010Ý\u0001\u001a\u00030\u008a\u00018F¢\u0006\b\u001a\u0006\bÞ\u0001\u0010\u008d\u0001R\u0015\u0010à\u0001\u001a\u00030á\u00018F¢\u0006\b\u001a\u0006\bâ\u0001\u0010ã\u0001R\u0015\u0010å\u0001\u001a\u00030\u008a\u00018F¢\u0006\b\u001a\u0006\bæ\u0001\u0010\u008d\u0001R\u0013\u0010è\u0001\u001a\u00020'8F¢\u0006\u0007\u001a\u0005\bè\u0001\u0010(R\u0013\u0010ê\u0001\u001a\u00020'8F¢\u0006\u0007\u001a\u0005\bë\u0001\u0010(R\u0013\u0010í\u0001\u001a\u00020'8F¢\u0006\u0007\u001a\u0005\bî\u0001\u0010(R(\u0010\u000f\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bð\u0001\u0010ñ\u0001\"\u0006\bò\u0001\u0010ó\u0001¨\u0006\u008e\u0002"}, d2 = {"Lcom/polymarket/usviewmodels/SellMarketOrderViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "position", "Lcom/polymarket/data/EUserPosition;", "event", "Lcom/polymarket/data/EEvent;", "entrySource", "Lcom/polymarket/usviewmodels/TradeEntrySource;", "callbacks", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Callbacks;", "(Lcom/polymarket/data/EUserPosition;Lcom/polymarket/data/EEvent;Lcom/polymarket/usviewmodels/TradeEntrySource;Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Callbacks;)V", "comboPosition", "(Lcom/polymarket/data/EUserPosition;Lcom/polymarket/usviewmodels/TradeEntrySource;Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Callbacks;)V", "geoDeniedVerdict", "Lcom/polymarket/usdependencies/GeoComplianceVerdict;", "getGeoDeniedVerdict", "()Lcom/polymarket/usdependencies/GeoComplianceVerdict;", "Swift_geoDeniedVerdict", "clearGeoDenial", "", "Swift_clearGeoDenial_0", "displayType", "Lcom/polymarket/usviewmodels/TradingDisplayType;", "getDisplayType", "()Lcom/polymarket/usviewmodels/TradingDisplayType;", "Swift_displayType", "combo", "Lcom/polymarket/usviewmodels/Combo;", "getCombo", "()Lcom/polymarket/usviewmodels/Combo;", "Swift_combo", "isCombo", "", "()Z", "Swift_isCombo", "newValue", "getPosition", "()Lcom/polymarket/data/EUserPosition;", "setPosition", "(Lcom/polymarket/data/EUserPosition;)V", "Swift_position", "Swift_position_set", "value", "getEvent", "()Lcom/polymarket/data/EEvent;", "setEvent", "(Lcom/polymarket/data/EEvent;)V", "Swift_event", "Swift_event_set", "Lcom/polymarket/data/EMarket$MarketSide;", "marketSide", "getMarketSide", "()Lcom/polymarket/data/EMarket$MarketSide;", "setMarketSide", "(Lcom/polymarket/data/EMarket$MarketSide;)V", "Swift_marketSide", "Swift_marketSide_set", "Lcom/polymarket/data/AmountInputConfig;", "inputConfig", "getInputConfig", "()Lcom/polymarket/data/AmountInputConfig;", "setInputConfig", "(Lcom/polymarket/data/AmountInputConfig;)V", "Swift_inputConfig", "Swift_inputConfig_set", "Lcom/polymarket/data/EAmount;", "balance", "getBalance", "()Lcom/polymarket/data/EAmount;", "setBalance", "(Lcom/polymarket/data/EAmount;)V", "Swift_balance", "Swift_balance_set", "", "shouldTriggerErrorFeedback", "getShouldTriggerErrorFeedback", "()I", "setShouldTriggerErrorFeedback", "(I)V", "Swift_shouldTriggerErrorFeedback", "Swift_shouldTriggerErrorFeedback_set", "shouldTriggerWarningFeedback", "getShouldTriggerWarningFeedback", "setShouldTriggerWarningFeedback", "Swift_shouldTriggerWarningFeedback", "Swift_shouldTriggerWarningFeedback_set", "shouldTriggerSuccessFeedback", "getShouldTriggerSuccessFeedback", "setShouldTriggerSuccessFeedback", "Swift_shouldTriggerSuccessFeedback", "Swift_shouldTriggerSuccessFeedback_set", "shouldResetSwipe", "getShouldResetSwipe", "setShouldResetSwipe", "Swift_shouldResetSwipe", "Swift_shouldResetSwipe_set", "showManualAmountMode", "getShowManualAmountMode", "setShowManualAmountMode", "(Z)V", "Swift_showManualAmountMode", "Swift_showManualAmountMode_set", "", "Lcom/polymarket/usviewmodels/TradingQuickAmountType;", "quickAmounts", "getQuickAmounts", "()Ljava/util/List;", "setQuickAmounts", "(Ljava/util/List;)V", "Swift_quickAmounts", "Swift_quickAmounts_set", "isLoading", "setLoading", "Swift_isLoading", "Swift_isLoading_set", "isTradeSuccess", "setTradeSuccess", "Swift_isTradeSuccess", "Swift_isTradeSuccess_set", "isTradeError", "setTradeError", "Swift_isTradeError", "Swift_isTradeError_set", "Lcom/polymarket/usviewmodels/ReceiptViewModel;", "receiptVM", "getReceiptVM", "()Lcom/polymarket/usviewmodels/ReceiptViewModel;", "setReceiptVM", "(Lcom/polymarket/usviewmodels/ReceiptViewModel;)V", "Swift_receiptVM", "Swift_receiptVM_set", "", "errorText", "getErrorText", "()Ljava/lang/String;", "setErrorText", "(Ljava/lang/String;)V", "Swift_errorText", "Swift_errorText_set", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$TradeInfo;", "tradeInfo", "getTradeInfo", "()Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$TradeInfo;", "setTradeInfo", "(Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$TradeInfo;)V", "Swift_tradeInfo", "Swift_tradeInfo_set", "isPriceLocked", "setPriceLocked", "Swift_isPriceLocked", "Swift_isPriceLocked_set", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$TradingDisplayState;", "displayState", "getDisplayState", "()Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$TradingDisplayState;", "setDisplayState", "(Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$TradingDisplayState;)V", "Swift_displayState", "Swift_displayState_set", "amount", "getAmount", "Swift_amount", "amountValue", "getAmountValue", "Swift_amountValue", "marketSideTitle", "getMarketSideTitle", "Swift_marketSideTitle", "presentation", "Lcom/polymarket/data/EMarket$MarketSide$DisplayContext;", "getPresentation", "()Lcom/polymarket/data/EMarket$MarketSide$DisplayContext;", "Swift_presentation", "rulesDisclaimer", "Lcom/polymarket/usviewmodels/MarketRulesDisclaimerPresentation;", "getRulesDisclaimer", "()Lcom/polymarket/usviewmodels/MarketRulesDisclaimerPresentation;", "Swift_rulesDisclaimer", "primaryButtonTitle", "getPrimaryButtonTitle", "Swift_primaryButtonTitle", "maxAvailableAmount", "getMaxAvailableAmount", "Swift_maxAvailableAmount", "orderCompletedText", "getOrderCompletedText", "Swift_orderCompletedText", "comboCashOutValue", "getComboCashOutValue", "Swift_comboCashOutValue", "comboMultiplierText", "getComboMultiplierText", "Swift_comboMultiplierText", "comboClosedStake", "getComboClosedStake", "Swift_comboClosedStake", "comboEstimatedProfit", "getComboEstimatedProfit", "Swift_comboEstimatedProfit", "comboIsProfitable", "getComboIsProfitable", "Swift_comboIsProfitable", "comboContractsText", "getComboContractsText", "Swift_comboContractsText", "comboFeesText", "getComboFeesText", "Swift_comboFeesText", "shouldShowFees", "getShouldShowFees", "Swift_shouldShowFees", "sellPrice", "getSellPrice", "Swift_sellPrice", "formattedOdds", "getFormattedOdds", "Swift_formattedOdds", "sportsOddsFormat", "Lcom/polymarket/data/OddsFormat;", "getSportsOddsFormat", "()Lcom/polymarket/data/OddsFormat;", "Swift_sportsOddsFormat", "effectiveSubtitle", "getEffectiveSubtitle", "Swift_effectiveSubtitle", "isValueReliable", "Swift_isValueReliable", "showsOwnedValueCaption", "getShowsOwnedValueCaption", "Swift_showsOwnedValueCaption", "showsChangeAmount", "getShowsChangeAmount", "Swift_showsChangeAmount", "getCallbacks", "()Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Callbacks;", "setCallbacks", "(Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Callbacks;)V", "Swift_callbacks", "Swift_callbacks_set", "setup", "Swift_setup_3", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input;", "Swift_sendInput_4", "sendPadKey", "key", "Lcom/polymarket/data/NumberPadKey;", "Swift_sendPadKey_5", "resetAfterAbortedSwipe", "Swift_resetAfterAbortedSwipe_6", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Callbacks", "TradingWarning", "TradingDisplayState", "TradeInfo", "Input", "MockScenario", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SellMarketOrderViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0001MB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0015\u0010\u001b\u001a\u00020\u00182\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010 \u001a\u00020\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010#\u001a\u00020\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010&\u001a\u00020\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010)\u001a\u00020\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010,\u001a\u00020\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00101\u001a\u0004\u0018\u00010.2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00104\u001a\u0004\u0018\u00010\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u00109\u001a\u0002062\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010<\u001a\u00020\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010?\u001a\u00020\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001c\u0010D\u001a\u0004\u0018\u00010A2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 ¢\u0006\u0002\u0010EJ\u0017\u0010H\u001a\u0004\u0018\u0001062\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00140J2\u0006\u0010K\u001a\u00020\u0016H\u0016J\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00140J2\u0006\u0010K\u001a\u00020\u0016H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010!\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001fR\u0011\u0010$\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR\u0011\u0010'\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001fR\u0011\u0010*\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b+\u0010\u001fR\u0013\u0010-\u001a\u0004\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u00102\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b3\u0010\u001fR\u0011\u00105\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010:\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b;\u0010\u001fR\u0011\u0010=\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0013\u0010@\u001a\u0004\u0018\u00010A8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0013\u0010F\u001a\u0004\u0018\u0001068F¢\u0006\u0006\u001a\u0004\bG\u00108¨\u0006N"}, d2 = {"Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$TradeInfo;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "position", "Lcom/polymarket/data/EUserPosition;", "getPosition", "()Lcom/polymarket/data/EUserPosition;", "Swift_position", "fees", "Lcom/polymarket/data/EAmount;", "getFees", "()Lcom/polymarket/data/EAmount;", "Swift_fees", "inputAmount", "getInputAmount", "Swift_inputAmount", "actualAmount", "getActualAmount", "Swift_actualAmount", "maskedAmount", "getMaskedAmount", "Swift_maskedAmount", "averagePrice", "getAveragePrice", "Swift_averagePrice", "warning", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$TradingWarning;", "getWarning", "()Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$TradingWarning;", "Swift_warning", "refundAmount", "getRefundAmount", "Swift_refundAmount", "formattedContracts", "", "getFormattedContracts", "()Ljava/lang/String;", "Swift_formattedContracts", "estimatedProfit", "getEstimatedProfit", "Swift_estimatedProfit", "isProfitable", "()Z", "Swift_isProfitable", "sellMultiplier", "", "getSellMultiplier", "()Ljava/lang/Double;", "Swift_sellMultiplier", "(J)Ljava/lang/Double;", "formattedSellMultiplier", "getFormattedSellMultiplier", "Swift_formattedSellMultiplier", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class TradeInfo implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public TradeInfo(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private final native EAmount Swift_actualAmount(long Swift_peer);

        private final native EAmount Swift_averagePrice(long Swift_peer);

        private final native EAmount Swift_estimatedProfit(long Swift_peer);

        private final native EAmount Swift_fees(long Swift_peer);

        private final native String Swift_formattedContracts(long Swift_peer);

        private final native String Swift_formattedSellMultiplier(long Swift_peer);

        private final native EAmount Swift_inputAmount(long Swift_peer);

        private final native boolean Swift_isProfitable(long Swift_peer);

        private final native EAmount Swift_maskedAmount(long Swift_peer);

        private final native EUserPosition Swift_position(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native EAmount Swift_refundAmount(long Swift_peer);

        private final native void Swift_release(long Swift_peer);

        private final native Double Swift_sellMultiplier(long Swift_peer);

        private final native TradingWarning Swift_warning(long Swift_peer);

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

        public final EAmount getActualAmount() {
            return Swift_actualAmount(this.Swift_peer);
        }

        public final EAmount getAveragePrice() {
            return Swift_averagePrice(this.Swift_peer);
        }

        public final EAmount getEstimatedProfit() {
            return Swift_estimatedProfit(this.Swift_peer);
        }

        public final EAmount getFees() {
            return Swift_fees(this.Swift_peer);
        }

        public final String getFormattedContracts() {
            return Swift_formattedContracts(this.Swift_peer);
        }

        public final String getFormattedSellMultiplier() {
            return Swift_formattedSellMultiplier(this.Swift_peer);
        }

        public final EAmount getInputAmount() {
            return Swift_inputAmount(this.Swift_peer);
        }

        public final EAmount getMaskedAmount() {
            return Swift_maskedAmount(this.Swift_peer);
        }

        public final EUserPosition getPosition() {
            return Swift_position(this.Swift_peer);
        }

        public final EAmount getRefundAmount() {
            return Swift_refundAmount(this.Swift_peer);
        }

        public final Double getSellMultiplier() {
            return Swift_sellMultiplier(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final TradingWarning getWarning() {
            return Swift_warning(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final boolean isProfitable() {
            return Swift_isProfitable(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }
    }

    public /* synthetic */ SellMarketOrderViewModel(EUserPosition eUserPosition, EEvent eEvent, TradeEntrySource tradeEntrySource, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eUserPosition, eEvent, (i & 4) != 0 ? null : tradeEntrySource, (i & 8) != 0 ? new Callbacks(null, null, null, 7, null) : callbacks);
    }

    private final native String Swift_amount(long Swift_peer);

    private final native EAmount Swift_amountValue(long Swift_peer);

    private final native EAmount Swift_balance(long Swift_peer);

    private final native void Swift_balance_set(long Swift_peer, EAmount value);

    private final native Callbacks Swift_callbacks(long Swift_peer);

    private final native void Swift_callbacks_set(long Swift_peer, Callbacks value);

    private final native void Swift_clearGeoDenial_0(long Swift_peer);

    private final native Combo Swift_combo(long Swift_peer);

    private final native EAmount Swift_comboCashOutValue(long Swift_peer);

    private final native EAmount Swift_comboClosedStake(long Swift_peer);

    private final native String Swift_comboContractsText(long Swift_peer);

    private final native EAmount Swift_comboEstimatedProfit(long Swift_peer);

    private final native String Swift_comboFeesText(long Swift_peer);

    private final native boolean Swift_comboIsProfitable(long Swift_peer);

    private final native String Swift_comboMultiplierText(long Swift_peer);

    private final native TradingDisplayState Swift_displayState(long Swift_peer);

    private final native void Swift_displayState_set(long Swift_peer, TradingDisplayState value);

    private final native TradingDisplayType Swift_displayType(long Swift_peer);

    private final native String Swift_effectiveSubtitle(long Swift_peer);

    private final native String Swift_errorText(long Swift_peer);

    private final native void Swift_errorText_set(long Swift_peer, String value);

    private final native EEvent Swift_event(long Swift_peer);

    private final native void Swift_event_set(long Swift_peer, EEvent value);

    private final native String Swift_formattedOdds(long Swift_peer);

    private final native GeoComplianceVerdict Swift_geoDeniedVerdict(long Swift_peer);

    private final native AmountInputConfig Swift_inputConfig(long Swift_peer);

    private final native void Swift_inputConfig_set(long Swift_peer, AmountInputConfig value);

    private final native boolean Swift_isCombo(long Swift_peer);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native void Swift_isLoading_set(long Swift_peer, boolean value);

    private final native boolean Swift_isPriceLocked(long Swift_peer);

    private final native void Swift_isPriceLocked_set(long Swift_peer, boolean value);

    private final native boolean Swift_isTradeError(long Swift_peer);

    private final native void Swift_isTradeError_set(long Swift_peer, boolean value);

    private final native boolean Swift_isTradeSuccess(long Swift_peer);

    private final native void Swift_isTradeSuccess_set(long Swift_peer, boolean value);

    private final native boolean Swift_isValueReliable(long Swift_peer);

    private final native EMarket.MarketSide Swift_marketSide(long Swift_peer);

    private final native String Swift_marketSideTitle(long Swift_peer);

    private final native void Swift_marketSide_set(long Swift_peer, EMarket.MarketSide value);

    private final native EAmount Swift_maxAvailableAmount(long Swift_peer);

    private final native String Swift_orderCompletedText(long Swift_peer);

    private final native EUserPosition Swift_position(long Swift_peer);

    private final native void Swift_position_set(long Swift_peer, EUserPosition value);

    private final native EMarket.MarketSide.DisplayContext Swift_presentation(long Swift_peer);

    private final native String Swift_primaryButtonTitle(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native List<TradingQuickAmountType> Swift_quickAmounts(long Swift_peer);

    private final native void Swift_quickAmounts_set(long Swift_peer, List<? extends TradingQuickAmountType> value);

    private final native ReceiptViewModel Swift_receiptVM(long Swift_peer);

    private final native void Swift_receiptVM_set(long Swift_peer, ReceiptViewModel value);

    private final native void Swift_resetAfterAbortedSwipe_6(long Swift_peer);

    private final native MarketRulesDisclaimerPresentation Swift_rulesDisclaimer(long Swift_peer);

    private final native EAmount Swift_sellPrice(long Swift_peer);

    private final native void Swift_sendInput_4(long Swift_peer, Input input);

    private final native boolean Swift_sendPadKey_5(long Swift_peer, NumberPadKey key);

    private final native void Swift_setup_3(long Swift_peer);

    private final native int Swift_shouldResetSwipe(long Swift_peer);

    private final native void Swift_shouldResetSwipe_set(long Swift_peer, int value);

    private final native boolean Swift_shouldShowFees(long Swift_peer);

    private final native int Swift_shouldTriggerErrorFeedback(long Swift_peer);

    private final native void Swift_shouldTriggerErrorFeedback_set(long Swift_peer, int value);

    private final native int Swift_shouldTriggerSuccessFeedback(long Swift_peer);

    private final native void Swift_shouldTriggerSuccessFeedback_set(long Swift_peer, int value);

    private final native int Swift_shouldTriggerWarningFeedback(long Swift_peer);

    private final native void Swift_shouldTriggerWarningFeedback_set(long Swift_peer, int value);

    private final native boolean Swift_showManualAmountMode(long Swift_peer);

    private final native void Swift_showManualAmountMode_set(long Swift_peer, boolean value);

    private final native boolean Swift_showsChangeAmount(long Swift_peer);

    private final native boolean Swift_showsOwnedValueCaption(long Swift_peer);

    private final native OddsFormat Swift_sportsOddsFormat(long Swift_peer);

    private final native TradeInfo Swift_tradeInfo(long Swift_peer);

    private final native void Swift_tradeInfo_set(long Swift_peer, TradeInfo value);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final void clearGeoDenial() {
        Swift_clearGeoDenial_0(getSwift_peer());
    }

    public final String getAmount() {
        return Swift_amount(getSwift_peer());
    }

    public final EAmount getAmountValue() {
        return Swift_amountValue(getSwift_peer());
    }

    public final EAmount getBalance() {
        return Swift_balance(getSwift_peer());
    }

    public final Callbacks getCallbacks() {
        return Swift_callbacks(getSwift_peer());
    }

    public final Combo getCombo() {
        return Swift_combo(getSwift_peer());
    }

    public final EAmount getComboCashOutValue() {
        return Swift_comboCashOutValue(getSwift_peer());
    }

    public final EAmount getComboClosedStake() {
        return Swift_comboClosedStake(getSwift_peer());
    }

    public final String getComboContractsText() {
        return Swift_comboContractsText(getSwift_peer());
    }

    public final EAmount getComboEstimatedProfit() {
        return Swift_comboEstimatedProfit(getSwift_peer());
    }

    public final String getComboFeesText() {
        return Swift_comboFeesText(getSwift_peer());
    }

    public final boolean getComboIsProfitable() {
        return Swift_comboIsProfitable(getSwift_peer());
    }

    public final String getComboMultiplierText() {
        return Swift_comboMultiplierText(getSwift_peer());
    }

    public final TradingDisplayState getDisplayState() {
        return Swift_displayState(getSwift_peer());
    }

    public final TradingDisplayType getDisplayType() {
        return Swift_displayType(getSwift_peer());
    }

    public final String getEffectiveSubtitle() {
        return Swift_effectiveSubtitle(getSwift_peer());
    }

    public final String getErrorText() {
        return Swift_errorText(getSwift_peer());
    }

    public final EEvent getEvent() {
        return Swift_event(getSwift_peer());
    }

    public final String getFormattedOdds() {
        return Swift_formattedOdds(getSwift_peer());
    }

    public final GeoComplianceVerdict getGeoDeniedVerdict() {
        return Swift_geoDeniedVerdict(getSwift_peer());
    }

    public final AmountInputConfig getInputConfig() {
        return Swift_inputConfig(getSwift_peer());
    }

    public final EMarket.MarketSide getMarketSide() {
        return Swift_marketSide(getSwift_peer());
    }

    public final String getMarketSideTitle() {
        return Swift_marketSideTitle(getSwift_peer());
    }

    public final EAmount getMaxAvailableAmount() {
        return Swift_maxAvailableAmount(getSwift_peer());
    }

    public final String getOrderCompletedText() {
        return Swift_orderCompletedText(getSwift_peer());
    }

    public final EUserPosition getPosition() {
        return Swift_position(getSwift_peer());
    }

    public final EMarket.MarketSide.DisplayContext getPresentation() {
        return Swift_presentation(getSwift_peer());
    }

    public final String getPrimaryButtonTitle() {
        return Swift_primaryButtonTitle(getSwift_peer());
    }

    public final List<TradingQuickAmountType> getQuickAmounts() {
        return Swift_quickAmounts(getSwift_peer());
    }

    public final ReceiptViewModel getReceiptVM() {
        return Swift_receiptVM(getSwift_peer());
    }

    public final MarketRulesDisclaimerPresentation getRulesDisclaimer() {
        return Swift_rulesDisclaimer(getSwift_peer());
    }

    public final EAmount getSellPrice() {
        return Swift_sellPrice(getSwift_peer());
    }

    public final int getShouldResetSwipe() {
        return Swift_shouldResetSwipe(getSwift_peer());
    }

    public final boolean getShouldShowFees() {
        return Swift_shouldShowFees(getSwift_peer());
    }

    public final int getShouldTriggerErrorFeedback() {
        return Swift_shouldTriggerErrorFeedback(getSwift_peer());
    }

    public final int getShouldTriggerSuccessFeedback() {
        return Swift_shouldTriggerSuccessFeedback(getSwift_peer());
    }

    public final int getShouldTriggerWarningFeedback() {
        return Swift_shouldTriggerWarningFeedback(getSwift_peer());
    }

    public final boolean getShowManualAmountMode() {
        return Swift_showManualAmountMode(getSwift_peer());
    }

    public final boolean getShowsChangeAmount() {
        return Swift_showsChangeAmount(getSwift_peer());
    }

    public final boolean getShowsOwnedValueCaption() {
        return Swift_showsOwnedValueCaption(getSwift_peer());
    }

    public final OddsFormat getSportsOddsFormat() {
        return Swift_sportsOddsFormat(getSwift_peer());
    }

    public final TradeInfo getTradeInfo() {
        return Swift_tradeInfo(getSwift_peer());
    }

    public final boolean isCombo() {
        return Swift_isCombo(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final boolean isPriceLocked() {
        return Swift_isPriceLocked(getSwift_peer());
    }

    public final boolean isTradeError() {
        return Swift_isTradeError(getSwift_peer());
    }

    public final boolean isTradeSuccess() {
        return Swift_isTradeSuccess(getSwift_peer());
    }

    public final boolean isValueReliable() {
        return Swift_isValueReliable(getSwift_peer());
    }

    public final void resetAfterAbortedSwipe() {
        Swift_resetAfterAbortedSwipe_6(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_4(getSwift_peer(), input);
    }

    public final boolean sendPadKey(NumberPadKey key) {
        key.getClass();
        return Swift_sendPadKey_5(getSwift_peer(), key);
    }

    public final void setBalance(EAmount eAmount) {
        eAmount.getClass();
        Swift_balance_set(getSwift_peer(), (EAmount) StructKt.sref$default(eAmount, null, 1, null));
    }

    public final void setCallbacks(Callbacks callbacks) {
        callbacks.getClass();
        Swift_callbacks_set(getSwift_peer(), callbacks);
    }

    public final void setDisplayState(TradingDisplayState tradingDisplayState) {
        tradingDisplayState.getClass();
        Swift_displayState_set(getSwift_peer(), tradingDisplayState);
    }

    public final void setErrorText(String str) {
        Swift_errorText_set(getSwift_peer(), str);
    }

    public final void setEvent(EEvent eEvent) {
        Swift_event_set(getSwift_peer(), (EEvent) StructKt.sref$default(eEvent, null, 1, null));
    }

    public final void setInputConfig(AmountInputConfig amountInputConfig) {
        amountInputConfig.getClass();
        Swift_inputConfig_set(getSwift_peer(), (AmountInputConfig) StructKt.sref$default(amountInputConfig, null, 1, null));
    }

    public final void setLoading(boolean z) {
        Swift_isLoading_set(getSwift_peer(), z);
    }

    public final void setMarketSide(EMarket.MarketSide marketSide) {
        Swift_marketSide_set(getSwift_peer(), (EMarket.MarketSide) StructKt.sref$default(marketSide, null, 1, null));
    }

    public final void setPosition(EUserPosition eUserPosition) {
        eUserPosition.getClass();
        Swift_position_set(getSwift_peer(), (EUserPosition) StructKt.sref$default(eUserPosition, null, 1, null));
    }

    public final void setPriceLocked(boolean z) {
        Swift_isPriceLocked_set(getSwift_peer(), z);
    }

    public final void setQuickAmounts(List<? extends TradingQuickAmountType> list) {
        list.getClass();
        Swift_quickAmounts_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setReceiptVM(ReceiptViewModel receiptViewModel) {
        Swift_receiptVM_set(getSwift_peer(), receiptViewModel);
    }

    public final void setShouldResetSwipe(int i) {
        Swift_shouldResetSwipe_set(getSwift_peer(), i);
    }

    public final void setShouldTriggerErrorFeedback(int i) {
        Swift_shouldTriggerErrorFeedback_set(getSwift_peer(), i);
    }

    public final void setShouldTriggerSuccessFeedback(int i) {
        Swift_shouldTriggerSuccessFeedback_set(getSwift_peer(), i);
    }

    public final void setShouldTriggerWarningFeedback(int i) {
        Swift_shouldTriggerWarningFeedback_set(getSwift_peer(), i);
    }

    public final void setShowManualAmountMode(boolean z) {
        Swift_showManualAmountMode_set(getSwift_peer(), z);
    }

    public final void setTradeError(boolean z) {
        Swift_isTradeError_set(getSwift_peer(), z);
    }

    public final void setTradeInfo(TradeInfo tradeInfo) {
        Swift_tradeInfo_set(getSwift_peer(), tradeInfo);
    }

    public final void setTradeSuccess(boolean z) {
        Swift_isTradeSuccess_set(getSwift_peer(), z);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_3(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\f\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u000b\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f ¨\u0006!"}, d2 = {"Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnAmountChangedCase", "OnQuickAmountSelectedCase", "OnPrimaryTradeCase", "OnSwipeStartedCase", "OnSwipeReleasedCase", "OnSwipeCancelledCase", "OnAuthenticationRejectedCase", "OnOrderTypeSelectedCase", "OnShowTradeInfoCase", "OnWarningTappedCase", "Companion", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input$OnAmountChangedCase;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input$OnAuthenticationRejectedCase;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input$OnOrderTypeSelectedCase;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input$OnPrimaryTradeCase;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input$OnQuickAmountSelectedCase;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input$OnShowTradeInfoCase;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input$OnSwipeCancelledCase;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input$OnSwipeReleasedCase;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input$OnSwipeStartedCase;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input$OnWarningTappedCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onPrimaryTrade = new OnPrimaryTradeCase();
        private static final Input onSwipeStarted = new OnSwipeStartedCase();
        private static final Input onSwipeReleased = new OnSwipeReleasedCase();
        private static final Input onSwipeCancelled = new OnSwipeCancelledCase();
        private static final Input onAuthenticationRejected = new OnAuthenticationRejectedCase();
        private static final Input onOrderTypeSelected = new OnOrderTypeSelectedCase();
        private static final Input onShowTradeInfo = new OnShowTradeInfoCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input$OnAmountChangedCase;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnAmountChangedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnAmountChangedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input$OnAuthenticationRejectedCase;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnAuthenticationRejectedCase extends Input {
            public OnAuthenticationRejectedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input$OnOrderTypeSelectedCase;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnOrderTypeSelectedCase extends Input {
            public OnOrderTypeSelectedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input$OnPrimaryTradeCase;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPrimaryTradeCase extends Input {
            public OnPrimaryTradeCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input$OnQuickAmountSelectedCase;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/TradingQuickAmountType;", "<init>", "(Lcom/polymarket/usviewmodels/TradingQuickAmountType;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/TradingQuickAmountType;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnQuickAmountSelectedCase extends Input {
            private final TradingQuickAmountType associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnQuickAmountSelectedCase(TradingQuickAmountType tradingQuickAmountType) {
                super(null);
                tradingQuickAmountType.getClass();
                this.associated0 = tradingQuickAmountType;
            }

            public final TradingQuickAmountType getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input$OnShowTradeInfoCase;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnShowTradeInfoCase extends Input {
            public OnShowTradeInfoCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input$OnSwipeCancelledCase;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSwipeCancelledCase extends Input {
            public OnSwipeCancelledCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input$OnSwipeReleasedCase;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSwipeReleasedCase extends Input {
            public OnSwipeReleasedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input$OnSwipeStartedCase;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSwipeStartedCase extends Input {
            public OnSwipeStartedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidLoadCase extends Input {
            public OnViewDidLoadCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input$OnWarningTappedCase;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$TradingWarning;", "<init>", "(Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$TradingWarning;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$TradingWarning;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnWarningTappedCase extends Input {
            private final TradingWarning associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnWarningTappedCase(TradingWarning tradingWarning) {
                super(null);
                tradingWarning.getClass();
                this.associated0 = tradingWarning;
            }

            public final TradingWarning getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnAuthenticationRejected$cp() {
            return onAuthenticationRejected;
        }

        public static final /* synthetic */ Input access$getOnOrderTypeSelected$cp() {
            return onOrderTypeSelected;
        }

        public static final /* synthetic */ Input access$getOnPrimaryTrade$cp() {
            return onPrimaryTrade;
        }

        public static final /* synthetic */ Input access$getOnShowTradeInfo$cp() {
            return onShowTradeInfo;
        }

        public static final /* synthetic */ Input access$getOnSwipeCancelled$cp() {
            return onSwipeCancelled;
        }

        public static final /* synthetic */ Input access$getOnSwipeReleased$cp() {
            return onSwipeReleased;
        }

        public static final /* synthetic */ Input access$getOnSwipeStarted$cp() {
            return onSwipeStarted;
        }

        public static final /* synthetic */ Input access$getOnViewDidLoad$cp() {
            return onViewDidLoad;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\fJ\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0007R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Input;", "onAmountChanged", "associated0", "", "onQuickAmountSelected", "Lcom/polymarket/usviewmodels/TradingQuickAmountType;", "onPrimaryTrade", "getOnPrimaryTrade", "onSwipeStarted", "getOnSwipeStarted", "onSwipeReleased", "getOnSwipeReleased", "onSwipeCancelled", "getOnSwipeCancelled", "onAuthenticationRejected", "getOnAuthenticationRejected", "onOrderTypeSelected", "getOnOrderTypeSelected", "onShowTradeInfo", "getOnShowTradeInfo", "onWarningTapped", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$TradingWarning;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnAuthenticationRejected() {
                return Input.access$getOnAuthenticationRejected$cp();
            }

            public final Input getOnOrderTypeSelected() {
                return Input.access$getOnOrderTypeSelected$cp();
            }

            public final Input getOnPrimaryTrade() {
                return Input.access$getOnPrimaryTrade$cp();
            }

            public final Input getOnShowTradeInfo() {
                return Input.access$getOnShowTradeInfo$cp();
            }

            public final Input getOnSwipeCancelled() {
                return Input.access$getOnSwipeCancelled$cp();
            }

            public final Input getOnSwipeReleased() {
                return Input.access$getOnSwipeReleased$cp();
            }

            public final Input getOnSwipeStarted() {
                return Input.access$getOnSwipeStarted$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input onAmountChanged(String associated0) {
                associated0.getClass();
                return new OnAmountChangedCase(associated0);
            }

            public final Input onQuickAmountSelected(TradingQuickAmountType associated0) {
                associated0.getClass();
                return new OnQuickAmountSelectedCase(associated0);
            }

            public final Input onWarningTapped(TradingWarning associated0) {
                associated0.getClass();
                return new OnWarningTappedCase(associated0);
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
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00162\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005:\u0001\u0016B\u001d\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0082 R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0017"}, d2 = {"Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$MockScenario;", "Lskip/lib/CaseIterable;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "readyToSell", "findingBuyers", "limitedLiquidity", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class MockScenario implements CaseIterable, RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ MockScenario[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final MockScenario readyToSell = new MockScenario("readyToSell", 0, "readyToSell", null, 2, null);
        public static final MockScenario findingBuyers = new MockScenario("findingBuyers", 1, "findingBuyers", null, 2, null);
        public static final MockScenario limitedLiquidity = new MockScenario("limitedLiquidity", 2, "limitedLiquidity", null, 2, null);

        private static final /* synthetic */ MockScenario[] $values() {
            return new MockScenario[]{readyToSell, findingBuyers, limitedLiquidity};
        }

        static {
            MockScenario[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ MockScenario(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static MockScenario valueOf(String str) {
            return (MockScenario) Enum.valueOf(MockScenario.class, str);
        }

        public static MockScenario[] values() {
            return (MockScenario[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$MockScenario$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$MockScenario;", "<init>", "()V", "init", "rawValue", "", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion implements CaseIterableCompanion<MockScenario> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // skip.lib.CaseIterableCompanion
            public Array<MockScenario> getAllCases() {
                return ArrayKt.arrayOf(MockScenario.readyToSell, MockScenario.findingBuyers, MockScenario.limitedLiquidity);
            }

            public final MockScenario init(String rawValue) {
                rawValue.getClass();
                int hashCode = rawValue.hashCode();
                if (hashCode != -909889015) {
                    if (hashCode != 119626736) {
                        if (hashCode == 1913163128 && rawValue.equals("limitedLiquidity")) {
                            return MockScenario.limitedLiquidity;
                        }
                        return null;
                    }
                    if (rawValue.equals("readyToSell")) {
                        return MockScenario.readyToSell;
                    }
                    return null;
                }
                if (!rawValue.equals("findingBuyers")) {
                    return null;
                }
                return MockScenario.findingBuyers;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private MockScenario(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001a\u001b\u001c\u001dB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0082 J\u0011\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0082 J\u0011\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0082 J\u0006\u0010\u0011\u001a\u00020\u0012J\u0011\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u0002H\u0082 J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0082 R\u0014\u0010\u0006\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0011\u0010\u000e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\b\u0082\u0001\u0003\u001e\u001f ¨\u0006!"}, d2 = {"Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$TradingWarning;", "Lskip/lib/Identifiable;", "", "Lskip/lib/SwiftProjecting;", "<init>", "()V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()Ljava/lang/String;", "Swift_id", "className", "message", "getMessage", "Swift_message", "analyticsName", "getAnalyticsName", "Swift_analyticsName", "makeAlert", "Lcom/polymarket/clients/ClientAlert;", "Swift_makeAlert_0", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "NotEnoughBuyersCase", "PriceLowerCase", "SellRiskCase", "Companion", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$TradingWarning$NotEnoughBuyersCase;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$TradingWarning$PriceLowerCase;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$TradingWarning$SellRiskCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class TradingWarning implements Identifiable<String>, SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$TradingWarning$NotEnoughBuyersCase;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$TradingWarning;", "associated0", "Lcom/polymarket/data/EAmount;", "associated1", "<init>", "(Lcom/polymarket/data/EAmount;Lcom/polymarket/data/EAmount;)V", "getAssociated0", "()Lcom/polymarket/data/EAmount;", "getAssociated1", "fillable", "getFillable", MetricTracker.Action.REQUESTED, "getRequested", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class NotEnoughBuyersCase extends TradingWarning {
            private final EAmount associated0;
            private final EAmount associated1;
            private final EAmount fillable;
            private final EAmount requested;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NotEnoughBuyersCase(EAmount eAmount, EAmount eAmount2) {
                super(null);
                eAmount.getClass();
                eAmount2.getClass();
                this.associated0 = eAmount;
                this.associated1 = eAmount2;
                this.fillable = eAmount;
                this.requested = eAmount2;
            }

            public final EAmount getAssociated0() {
                return this.associated0;
            }

            public final EAmount getAssociated1() {
                return this.associated1;
            }

            public final EAmount getFillable() {
                return this.fillable;
            }

            public final EAmount getRequested() {
                return this.requested;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$TradingWarning$PriceLowerCase;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$TradingWarning;", "associated0", "Lcom/polymarket/data/EAmount;", "associated1", "associated2", "", "<init>", "(Lcom/polymarket/data/EAmount;Lcom/polymarket/data/EAmount;D)V", "getAssociated0", "()Lcom/polymarket/data/EAmount;", "getAssociated1", "getAssociated2", "()D", "avgPrice", "getAvgPrice", "bestPrice", "getBestPrice", "percent", "getPercent", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class PriceLowerCase extends TradingWarning {
            private final EAmount associated0;
            private final EAmount associated1;
            private final double associated2;
            private final EAmount avgPrice;
            private final EAmount bestPrice;
            private final double percent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PriceLowerCase(EAmount eAmount, EAmount eAmount2, double d) {
                super(null);
                eAmount.getClass();
                eAmount2.getClass();
                this.associated0 = eAmount;
                this.associated1 = eAmount2;
                this.associated2 = d;
                this.avgPrice = eAmount;
                this.bestPrice = eAmount2;
                this.percent = d;
            }

            public final EAmount getAssociated0() {
                return this.associated0;
            }

            public final EAmount getAssociated1() {
                return this.associated1;
            }

            public final double getAssociated2() {
                return this.associated2;
            }

            public final EAmount getAvgPrice() {
                return this.avgPrice;
            }

            public final EAmount getBestPrice() {
                return this.bestPrice;
            }

            public final double getPercent() {
                return this.percent;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\nR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$TradingWarning$SellRiskCase;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$TradingWarning;", "associated0", "", "associated1", "associated2", "associated3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "getAssociated1", "getAssociated2", "getAssociated3", "riskID", "getRiskID", "riskTitle", "getRiskTitle", "riskMessage", "getRiskMessage", "riskAnalyticsName", "getRiskAnalyticsName", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class SellRiskCase extends TradingWarning {
            private final String associated0;
            private final String associated1;
            private final String associated2;
            private final String associated3;
            private final String riskAnalyticsName;
            private final String riskID;
            private final String riskMessage;
            private final String riskTitle;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SellRiskCase(String str, String str2, String str3, String str4) {
                super(null);
                woa.A(str, str2, str3, str4);
                this.associated0 = str;
                this.associated1 = str2;
                this.associated2 = str3;
                this.associated3 = str4;
                this.riskID = str;
                this.riskTitle = str2;
                this.riskMessage = str3;
                this.riskAnalyticsName = str4;
            }

            public final String getAssociated0() {
                return this.associated0;
            }

            public final String getAssociated1() {
                return this.associated1;
            }

            public final String getAssociated2() {
                return this.associated2;
            }

            public final String getAssociated3() {
                return this.associated3;
            }

            public final String getRiskAnalyticsName() {
                return this.riskAnalyticsName;
            }

            public final String getRiskID() {
                return this.riskID;
            }

            public final String getRiskMessage() {
                return this.riskMessage;
            }

            public final String getRiskTitle() {
                return this.riskTitle;
            }
        }

        public /* synthetic */ TradingWarning(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native String Swift_analyticsName(String className);

        private final native String Swift_id(String className);

        private final native ClientAlert Swift_makeAlert_0(String className);

        private final native String Swift_message(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final String getAnalyticsName() {
            return Swift_analyticsName(getClass().getName());
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(getClass().getName());
        }

        public final String getMessage() {
            return Swift_message(getClass().getName());
        }

        public final ClientAlert makeAlert() {
            return Swift_makeAlert_0(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u001e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rJ&\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010¨\u0006\u0014"}, d2 = {"Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$TradingWarning$Companion;", "", "<init>", "()V", "notEnoughBuyers", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$TradingWarning;", "fillable", "Lcom/polymarket/data/EAmount;", MetricTracker.Action.REQUESTED, "priceLower", "avgPrice", "bestPrice", "percent", "", "sellRisk", "riskID", "", "riskTitle", "riskMessage", "riskAnalyticsName", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final TradingWarning notEnoughBuyers(EAmount fillable, EAmount requested) {
                fillable.getClass();
                requested.getClass();
                return new NotEnoughBuyersCase(fillable, requested);
            }

            public final TradingWarning priceLower(EAmount avgPrice, EAmount bestPrice, double percent) {
                avgPrice.getClass();
                bestPrice.getClass();
                return new PriceLowerCase(avgPrice, bestPrice, percent);
            }

            public final TradingWarning sellRisk(String riskID, String riskTitle, String riskMessage, String riskAnalyticsName) {
                riskID.getClass();
                riskTitle.getClass();
                riskMessage.getClass();
                riskAnalyticsName.getClass();
                return new SellRiskCase(riskID, riskTitle, riskMessage, riskAnalyticsName);
            }

            private Companion() {
            }
        }

        private TradingWarning() {
        }

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ String getId() {
            return getId2();
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0082 J'\u0010\u000f\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0010\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0082 J\u0010\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u0011\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0082 J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0018¨\u0006\u0019"}, d2 = {"Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_1", "", "Lskip/bridge/SwiftObjectPointer;", "position", "Lcom/polymarket/data/EUserPosition;", "event", "Lcom/polymarket/data/EEvent;", "entrySource", "Lcom/polymarket/usviewmodels/TradeEntrySource;", "callbacks", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Callbacks;", "Swift_Companion_constructor_2", "comboPosition", "mock", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel;", "scenario", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$MockScenario;", "Swift_Companion_mock_7", "MockScenario", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_1(EUserPosition position, EEvent event, TradeEntrySource entrySource, Callbacks callbacks);

        private final native long Swift_Companion_constructor_2(EUserPosition comboPosition, TradeEntrySource entrySource, Callbacks callbacks);

        private final native SellMarketOrderViewModel Swift_Companion_mock_7(MockScenario scenario);

        public static final /* synthetic */ long access$Swift_Companion_constructor_1(Companion companion, EUserPosition eUserPosition, EEvent eEvent, TradeEntrySource tradeEntrySource, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_1(eUserPosition, eEvent, tradeEntrySource, callbacks);
        }

        public static final /* synthetic */ long access$Swift_Companion_constructor_2(Companion companion, EUserPosition eUserPosition, TradeEntrySource tradeEntrySource, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_2(eUserPosition, tradeEntrySource, callbacks);
        }

        public static /* synthetic */ SellMarketOrderViewModel mock$default(Companion companion, MockScenario mockScenario, int i, Object obj) {
            if ((i & 1) != 0) {
                mockScenario = MockScenario.readyToSell;
            }
            return companion.mock(mockScenario);
        }

        public final MockScenario MockScenario(String rawValue) {
            rawValue.getClass();
            return MockScenario.INSTANCE.init(rawValue);
        }

        public final SellMarketOrderViewModel mock(MockScenario scenario) {
            scenario.getClass();
            return Swift_Companion_mock_7(scenario);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001<B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBI\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\b\u0010\u0015J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0015\u0010\u001c\u001a\u00020\u001b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0015\u0010\u001f\u001a\u00020\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010!\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010$\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010%\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010(\u001a\u0004\u0018\u00010\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010*\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0015\u0010-\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JI\u0010.\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0082 J\u0013\u0010/\u001a\u00020\u000e2\b\u00100\u001a\u0004\u0018\u000101H\u0096\u0002J\u0019\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0000H\u0082 J\b\u00105\u001a\u000206H\u0016J\u0015\u00107\u001a\u00020\u00042\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u00108\u001a\b\u0012\u0004\u0012\u000201092\u0006\u0010:\u001a\u000206H\u0016J\u0017\u0010;\u001a\b\u0012\u0004\u0012\u000201092\u0006\u0010:\u001a\u000206H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\u0012\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b)\u0010#R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006="}, d2 = {"Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$TradingDisplayState;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "text", "", "subtitle", "canSwipe", "", "isValid", "projectedPayout", "Lcom/polymarket/data/EAmount;", "shouldBlurValue", "phase", "Lcom/polymarket/usviewmodels/TradingSwipeDisplayPhase;", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/polymarket/data/EAmount;ZLcom/polymarket/usviewmodels/TradingSwipeDisplayPhase;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "getText", "()Ljava/lang/String;", "Swift_text", "getSubtitle", "Swift_subtitle", "getCanSwipe", "()Z", "Swift_canSwipe", "Swift_isValid", "getProjectedPayout", "()Lcom/polymarket/data/EAmount;", "Swift_projectedPayout", "getShouldBlurValue", "Swift_shouldBlurValue", "getPhase", "()Lcom/polymarket/usviewmodels/TradingSwipeDisplayPhase;", "Swift_phase", "Swift_constructor_0", "equals", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class TradingDisplayState implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public TradingDisplayState(String str, String str2, boolean z, boolean z2, EAmount eAmount, boolean z3, TradingSwipeDisplayPhase tradingSwipeDisplayPhase) {
            str.getClass();
            tradingSwipeDisplayPhase.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, str2, z, z2, eAmount, z3, tradingSwipeDisplayPhase);
        }

        private final native boolean Swift_canSwipe(long Swift_peer);

        private final native long Swift_constructor_0(String text, String subtitle, boolean canSwipe, boolean isValid, EAmount projectedPayout, boolean shouldBlurValue, TradingSwipeDisplayPhase phase);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native boolean Swift_isValid(long Swift_peer);

        private final native boolean Swift_isequal(TradingDisplayState lhs, TradingDisplayState rhs);

        private final native TradingSwipeDisplayPhase Swift_phase(long Swift_peer);

        private final native EAmount Swift_projectedPayout(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native boolean Swift_shouldBlurValue(long Swift_peer);

        private final native String Swift_subtitle(long Swift_peer);

        private final native String Swift_text(long Swift_peer);

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
            if (!(other instanceof TradingDisplayState)) {
                return false;
            }
            return Swift_isequal(this, (TradingDisplayState) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final boolean getCanSwipe() {
            return Swift_canSwipe(this.Swift_peer);
        }

        public final TradingSwipeDisplayPhase getPhase() {
            return Swift_phase(this.Swift_peer);
        }

        public final EAmount getProjectedPayout() {
            return Swift_projectedPayout(this.Swift_peer);
        }

        public final boolean getShouldBlurValue() {
            return Swift_shouldBlurValue(this.Swift_peer);
        }

        public final String getSubtitle() {
            return Swift_subtitle(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getText() {
            return Swift_text(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        public final boolean isValid() {
            return Swift_isValid(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public TradingDisplayState(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ TradingDisplayState(String str, String str2, boolean z, boolean z2, EAmount eAmount, boolean z3, TradingSwipeDisplayPhase tradingSwipeDisplayPhase, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, z, z2, (i & 16) != 0 ? null : eAmount, z3, tradingSwipeDisplayPhase);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellMarketOrderViewModel(EUserPosition eUserPosition, EEvent eEvent, TradeEntrySource tradeEntrySource, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_1(INSTANCE, eUserPosition, eEvent, tradeEntrySource, callbacks), (SwiftPeerMarker) null);
        eUserPosition.getClass();
        eEvent.getClass();
        callbacks.getClass();
    }

    public SellMarketOrderViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellMarketOrderViewModel(EUserPosition eUserPosition, TradeEntrySource tradeEntrySource, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_2(INSTANCE, eUserPosition, tradeEntrySource, callbacks), (SwiftPeerMarker) null);
        eUserPosition.getClass();
        callbacks.getClass();
    }

    public /* synthetic */ SellMarketOrderViewModel(EUserPosition eUserPosition, TradeEntrySource tradeEntrySource, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eUserPosition, (i & 2) != 0 ? null : tradeEntrySource, (i & 4) != 0 ? new Callbacks(null, null, null, 7, null) : callbacks);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBK\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e\u0012\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u0011¢\u0006\u0004\b\b\u0010\u0014J\u0006\u0010\u0019\u001a\u00020\fJ\u0015\u0010\u001a\u001a\u00020\f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J'\u0010)\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u00112\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 JI\u0010*\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u0011H\u0082 J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000b2\u0006\u0010,\u001a\u00020 H\u0016J\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000b2\u0006\u0010,\u001a\u00020 H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e8F¢\u0006\u0006\u001a\u0004\b$\u0010%R#\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u00118F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006/"}, d2 = {"Lcom/polymarket/usviewmodels/SellMarketOrderViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onTradeCompleted", "Lkotlin/Function0;", "", "onShowTradeInfo", "Lkotlin/Function1;", "Lcom/polymarket/usviewmodels/SellMarketOrderViewModel;", "onShareRequest", "Lkotlin/Function2;", "Lcom/polymarket/usviewmodels/ReceiptViewModel;", "Lcom/polymarket/data/SharePlatform;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnTradeCompleted", "()Lkotlin/jvm/functions/Function0;", "Swift_onTradeCompleted", "getOnShowTradeInfo", "()Lkotlin/jvm/functions/Function1;", "Swift_onShowTradeInfo", "getOnShareRequest", "()Lkotlin/jvm/functions/Function2;", "Swift_onShareRequest", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function0 function0, Function1 function1, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new ljg(16) : function0, (i & 2) != 0 ? new zog(16) : function1, (i & 4) != 0 ? new wgg(7) : function2);
        }

        private final native long Swift_constructor_0(Function0<Unit> onTradeCompleted, Function1<? super SellMarketOrderViewModel, Unit> onShowTradeInfo, Function2<? super ReceiptViewModel, ? super SharePlatform, Unit> onShareRequest);

        private final native Function2<ReceiptViewModel, SharePlatform, Unit> Swift_onShareRequest(long Swift_peer);

        private final native Function1<SellMarketOrderViewModel, Unit> Swift_onShowTradeInfo(long Swift_peer);

        private final native Function0<Unit> Swift_onTradeCompleted(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(SellMarketOrderViewModel sellMarketOrderViewModel) {
            sellMarketOrderViewModel.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2(ReceiptViewModel receiptViewModel, SharePlatform sharePlatform) {
            receiptViewModel.getClass();
            sharePlatform.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(ReceiptViewModel receiptViewModel, SharePlatform sharePlatform) {
            return _init_$lambda$2(receiptViewModel, sharePlatform);
        }

        public static /* synthetic */ Unit b(SellMarketOrderViewModel sellMarketOrderViewModel) {
            return _init_$lambda$1(sellMarketOrderViewModel);
        }

        public static /* synthetic */ Unit c() {
            return _init_$lambda$0();
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

        public final Function2<ReceiptViewModel, SharePlatform, Unit> getOnShareRequest() {
            return Swift_onShareRequest(this.Swift_peer);
        }

        public final Function1<SellMarketOrderViewModel, Unit> getOnShowTradeInfo() {
            return Swift_onShowTradeInfo(this.Swift_peer);
        }

        public final Function0<Unit> getOnTradeCompleted() {
            return Swift_onTradeCompleted(this.Swift_peer);
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

        public Callbacks(Function0<Unit> function0, Function1<? super SellMarketOrderViewModel, Unit> function1, Function2<? super ReceiptViewModel, ? super SharePlatform, Unit> function2) {
            function0.getClass();
            function1.getClass();
            function2.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function0, function1, function2);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
