package com.polymarket.usviewmodels;

import com.appsflyer.attribution.RequestError;
import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.APIEventTag;
import com.polymarket.data.EEvent;
import com.polymarket.data.ETournamentUS;
import com.polymarket.usviewmodels.AppViewModel;
import com.polymarket.usviewmodels.USEventCardViewModel;
import com.polymarket.usviewmodels.USHomePremadeCombosRailViewModel;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.dmk;
import defpackage.kw5;
import defpackage.u85;
import defpackage.ug7;
import defpackage.wmj;
import defpackage.ww4;
import defpackage.zei;
import defpackage.zyi;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.AttributeType;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Array;
import skip.lib.ArrayKt;
import skip.lib.CaseIterable;
import skip.lib.CaseIterableCompanion;
import skip.lib.Hasher;
import skip.lib.Identifiable;
import skip.lib.MainActor;
import skip.lib.MutableStruct;
import skip.lib.RawRepresentable;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0007\u0018\u0000 \u0095\u00022\u00020\u0001:\f\u0090\u0002\u0091\u0002\u0092\u0002\u0093\u0002\u0094\u0002\u0095\u0002B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB%\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0007\u0010\u000fJ\u0015\u0010\u0017\u001a\u00020\u00112\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u0018\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001a\u001a\u00020\u0011H\u0082 J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010#\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082 J\u0015\u0010)\u001a\u00020$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010*\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001a\u001a\u00020$H\u0082 J\u0015\u0010,\u001a\u00020$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010/\u001a\u00020$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00102\u001a\u00020$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u00107\u001a\b\u0012\u0004\u0012\u0002030\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u00108\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002030\u001bH\u0082 J\u0015\u0010;\u001a\u00020\n2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J!\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u0002030<2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J)\u0010C\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u0002030<H\u0082 J\u001b\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00110\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010H\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u001bH\u0082 J\u001b\u0010M\u001a\b\u0012\u0004\u0012\u00020I0\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010N\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020I0\u001bH\u0082 J\u001b\u0010R\u001a\b\u0012\u0004\u0012\u00020I0\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010S\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020I0\u001bH\u0082 J\u001b\u0010W\u001a\b\u0012\u0004\u0012\u00020I0\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010X\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020I0\u001bH\u0082 J\u0015\u0010[\u001a\u00020$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\\\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001a\u001a\u00020$H\u0082 J\u0015\u0010_\u001a\u00020$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010`\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001a\u001a\u00020$H\u0082 J\u0015\u0010c\u001a\u00020$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010d\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001a\u001a\u00020$H\u0082 J\u0017\u0010h\u001a\u0004\u0018\u00010\u00112\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010i\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0082 J\u0015\u0010p\u001a\u00020j2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010q\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001a\u001a\u00020jH\u0082 J\u0017\u0010x\u001a\u0004\u0018\u00010r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010y\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010rH\u0082 J\u0015\u0010|\u001a\u00020$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0018\u0010\u0081\u0001\u001a\u0004\u0018\u00010~2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0084\u0001\u001a\u00020$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0087\u0001\u001a\u00020$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010\u0088\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001a\u001a\u00020$H\u0082 J\u0016\u0010\u008b\u0001\u001a\u00020$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010\u008c\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001a\u001a\u00020$H\u0082 J\u0016\u0010\u0090\u0001\u001a\u00020$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010\u0091\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001a\u001a\u00020$H\u0082 J\u0016\u0010\u0095\u0001\u001a\u00020$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010\u0096\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001a\u001a\u00020$H\u0082 J\u0017\u0010\u009d\u0001\u001a\u00030\u0097\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010\u009e\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\u001a\u001a\u00030\u0097\u0001H\u0082 J\u0016\u0010¢\u0001\u001a\u00020j2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010£\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001a\u001a\u00020jH\u0082 J\u0016\u0010§\u0001\u001a\u00020$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010¨\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001a\u001a\u00020$H\u0082 J\u0016\u0010¬\u0001\u001a\u00020$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010\u00ad\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001a\u001a\u00020$H\u0082 J\u001d\u0010°\u0001\u001a\t\u0012\u0005\u0012\u00030\u0097\u00010\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010³\u0001\u001a\u00020$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010·\u0001\u001a\u00020\u00112\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010¸\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001a\u001a\u00020\u0011H\u0082 J\u0016\u0010¼\u0001\u001a\u00020j2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010½\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001a\u001a\u00020jH\u0082 J\u001d\u0010Â\u0001\u001a\t\u0012\u0005\u0012\u00030¾\u00010\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J%\u0010Ã\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\r\u0010\u001a\u001a\t\u0012\u0005\u0012\u00030¾\u00010\u001bH\u0082 J\u0016\u0010Ç\u0001\u001a\u00020j2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010È\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001a\u001a\u00020jH\u0082 J\u001c\u0010Ì\u0001\u001a\b\u0012\u0004\u0012\u00020I0\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J$\u0010Í\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020I0\u001bH\u0082 J\u0016\u0010Ð\u0001\u001a\u00020$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010Ñ\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001a\u001a\u00020$H\u0082 J\u0016\u0010Ô\u0001\u001a\u00020$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0019\u0010Ø\u0001\u001a\u0005\u0018\u00010¾\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001c\u0010Û\u0001\u001a\b\u0012\u0004\u0012\u00020I0\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Ý\u0001\u001a\u00020$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010à\u0001\u001a\u00020$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010ã\u0001\u001a\u00020$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010å\u0001\u001a\u00020$2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010è\u0001\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\t\u0010é\u0001\u001a\u00020\u0019H\u0016J\u0016\u0010ê\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0010\u0010ë\u0001\u001a\u00020\u00192\u0007\u0010\t\u001a\u00030\u0097\u0001J\u001f\u0010ì\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\t\u001a\u00030\u0097\u0001H\u0082 J\u0010\u0010í\u0001\u001a\u00020\u00192\u0007\u0010î\u0001\u001a\u00020jJ\u001f\u0010ï\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010î\u0001\u001a\u00020jH\u0082 J\u0010\u0010ð\u0001\u001a\u00020\u00192\u0007\u0010î\u0001\u001a\u00020jJ\u001f\u0010ñ\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010î\u0001\u001a\u00020jH\u0082 J\u0010\u0010ò\u0001\u001a\u00020\u00192\u0007\u0010ó\u0001\u001a\u00020\u0011J\u001f\u0010ô\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010ó\u0001\u001a\u00020\u0011H\u0082 J\u0011\u0010õ\u0001\u001a\u00020\u00192\b\u0010ö\u0001\u001a\u00030÷\u0001J \u0010ø\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010ö\u0001\u001a\u00030÷\u0001H\u0082 J\u0007\u0010ù\u0001\u001a\u00020\u0019J\u0016\u0010ú\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0011\u0010û\u0001\u001a\u00020\u00192\b\u0010ü\u0001\u001a\u00030ý\u0001J \u0010þ\u0001\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010ü\u0001\u001a\u00030ý\u0001H\u0082 J\u000f\u0010ÿ\u0001\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u0080\u0002\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0082 J\u0016\u0010\u0081\u0002\u001a\b\u0012\u0004\u0012\u0002030\u001b2\u0007\u0010\u0082\u0002\u001a\u00020IJ%\u0010\u0083\u0002\u001a\b\u0012\u0004\u0012\u0002030\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010\u0082\u0002\u001a\u00020IH\u0082 J\u0018\u0010\u0084\u0002\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\t\u0010\u0085\u0002\u001a\u0004\u0018\u00010\u0011J'\u0010\u0086\u0002\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\t\u0010\u0087\u0002\u001a\u0004\u0018\u00010\u0011H\u0082 J\u0016\u0010\u0088\u0002\u001a\u00020\u00192\r\u0010\u0089\u0002\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bJ%\u0010\u008a\u0002\u001a\u00020\u00192\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\r\u0010\u0089\u0002\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082 J\u001a\u0010\u008b\u0002\u001a\n\u0012\u0005\u0012\u00030\u008d\u00020\u008c\u00022\u0007\u0010\u008e\u0002\u001a\u00020jH\u0016J\u001b\u0010\u008f\u0002\u001a\n\u0012\u0005\u0012\u00030\u008d\u00020\u008c\u00022\u0007\u0010\u008e\u0002\u001a\u00020jH\u0082 R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R0\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010%\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0011\u0010+\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b+\u0010&R\u0011\u0010-\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b.\u0010&R\u0011\u00100\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b1\u0010&R0\u00104\u001a\b\u0012\u0004\u0012\u0002030\u001b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002030\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010\u001f\"\u0004\b6\u0010!R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b9\u0010:R<\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u0002030<2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u0002030<8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR0\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00110\u001b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010\u001f\"\u0004\bF\u0010!R0\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u001b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020I0\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010\u001f\"\u0004\bL\u0010!R0\u0010O\u001a\b\u0012\u0004\u0012\u00020I0\u001b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020I0\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010\u001f\"\u0004\bQ\u0010!R0\u0010T\u001a\b\u0012\u0004\u0012\u00020I0\u001b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020I0\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010\u001f\"\u0004\bV\u0010!R$\u0010Y\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010&\"\u0004\bZ\u0010(R$\u0010]\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010&\"\u0004\b^\u0010(R$\u0010a\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010&\"\u0004\bb\u0010(R(\u0010e\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010\u0014\"\u0004\bg\u0010\u0016R$\u0010k\u001a\u00020j2\u0006\u0010\u0010\u001a\u00020j8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR(\u0010s\u001a\u0004\u0018\u00010r2\b\u0010\u0010\u001a\u0004\u0018\u00010r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u0011\u0010z\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b{\u0010&R\u0014\u0010}\u001a\u0004\u0018\u00010~8F¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0013\u0010\u0082\u0001\u001a\u00020$8F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010&R'\u0010\u0085\u0001\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020$8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0085\u0001\u0010&\"\u0005\b\u0086\u0001\u0010(R'\u0010\u0089\u0001\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020$8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0089\u0001\u0010&\"\u0005\b\u008a\u0001\u0010(R'\u0010\u008d\u0001\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020$8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008e\u0001\u0010&\"\u0005\b\u008f\u0001\u0010(R'\u0010\u0092\u0001\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020$8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0093\u0001\u0010&\"\u0005\b\u0094\u0001\u0010(R+\u0010\u0098\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u0010\u001a\u00030\u0097\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R'\u0010\u009f\u0001\u001a\u00020j2\u0006\u0010\u0010\u001a\u00020j8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b \u0001\u0010m\"\u0005\b¡\u0001\u0010oR'\u0010¤\u0001\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020$8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¥\u0001\u0010&\"\u0005\b¦\u0001\u0010(R'\u0010©\u0001\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020$8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bª\u0001\u0010&\"\u0005\b«\u0001\u0010(R\u001a\u0010®\u0001\u001a\t\u0012\u0005\u0012\u00030\u0097\u00010\u001b8F¢\u0006\u0007\u001a\u0005\b¯\u0001\u0010\u001fR\u0013\u0010±\u0001\u001a\u00020$8F¢\u0006\u0007\u001a\u0005\b²\u0001\u0010&R'\u0010´\u0001\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bµ\u0001\u0010\u0014\"\u0005\b¶\u0001\u0010\u0016R'\u0010¹\u0001\u001a\u00020j2\u0006\u0010\u0010\u001a\u00020j8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bº\u0001\u0010m\"\u0005\b»\u0001\u0010oR5\u0010¿\u0001\u001a\t\u0012\u0005\u0012\u00030¾\u00010\u001b2\r\u0010\u0010\u001a\t\u0012\u0005\u0012\u00030¾\u00010\u001b8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bÀ\u0001\u0010\u001f\"\u0005\bÁ\u0001\u0010!R'\u0010Ä\u0001\u001a\u00020j2\u0006\u0010\u0010\u001a\u00020j8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bÅ\u0001\u0010m\"\u0005\bÆ\u0001\u0010oR3\u0010É\u0001\u001a\b\u0012\u0004\u0012\u00020I0\u001b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020I0\u001b8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bÊ\u0001\u0010\u001f\"\u0005\bË\u0001\u0010!R'\u0010Î\u0001\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020$8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bÎ\u0001\u0010&\"\u0005\bÏ\u0001\u0010(R\u0013\u0010Ò\u0001\u001a\u00020$8F¢\u0006\u0007\u001a\u0005\bÓ\u0001\u0010&R\u0017\u0010Õ\u0001\u001a\u0005\u0018\u00010¾\u00018F¢\u0006\b\u001a\u0006\bÖ\u0001\u0010×\u0001R\u0019\u0010Ù\u0001\u001a\b\u0012\u0004\u0012\u00020I0\u001b8F¢\u0006\u0007\u001a\u0005\bÚ\u0001\u0010\u001fR\u0013\u0010Ü\u0001\u001a\u00020$8F¢\u0006\u0007\u001a\u0005\bÜ\u0001\u0010&R\u0013\u0010Þ\u0001\u001a\u00020$8F¢\u0006\u0007\u001a\u0005\bß\u0001\u0010&R\u0013\u0010á\u0001\u001a\u00020$8F¢\u0006\u0007\u001a\u0005\bâ\u0001\u0010&R\u0013\u0010ä\u0001\u001a\u00020$8F¢\u0006\u0007\u001a\u0005\bä\u0001\u0010&R\u0013\u0010\u000b\u001a\u00020\f8F¢\u0006\b\u001a\u0006\bæ\u0001\u0010ç\u0001¨\u0006\u0096\u0002"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "tab", "Lcom/polymarket/data/APIEventTag;", "presentationContext", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$PresentationContext;", "callbacks", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Callbacks;", "(Lcom/polymarket/data/APIEventTag;Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$PresentationContext;Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Callbacks;)V", "newValue", "", "searchQuery", "getSearchQuery", "()Ljava/lang/String;", "setSearchQuery", "(Ljava/lang/String;)V", "Swift_searchQuery", "Swift_searchQuery_set", "", "value", "", "Lcom/polymarket/data/EEvent;", "searchResults", "getSearchResults", "()Ljava/util/List;", "setSearchResults", "(Ljava/util/List;)V", "Swift_searchResults", "Swift_searchResults_set", "", "isAwaitingSearchResults", "()Z", "setAwaitingSearchResults", "(Z)V", "Swift_isAwaitingSearchResults", "Swift_isAwaitingSearchResults_set", "isSearchActive", "Swift_isSearchActive", "showSearchLoading", "getShowSearchLoading", "Swift_showSearchLoading", "showSearchEmpty", "getShowSearchEmpty", "Swift_showSearchEmpty", "Lcom/polymarket/usviewmodels/USEventCardViewModel;", "searchResultEventViewModels", "getSearchResultEventViewModels", "setSearchResultEventViewModels", "Swift_searchResultEventViewModels", "Swift_searchResultEventViewModels_set", "getTab", "()Lcom/polymarket/data/APIEventTag;", "Swift_tab", "", "eventViewModelsById", "getEventViewModelsById", "()Ljava/util/Map;", "setEventViewModelsById", "(Ljava/util/Map;)V", "Swift_eventViewModelsById", "Swift_eventViewModelsById_set", "eventViewModelIds", "getEventViewModelIds", "setEventViewModelIds", "Swift_eventViewModelIds", "Swift_eventViewModelIds_set", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata;", "sectionMetadata", "getSectionMetadata", "setSectionMetadata", "Swift_sectionMetadata", "Swift_sectionMetadata_set", "gameSectionMetadata", "getGameSectionMetadata", "setGameSectionMetadata", "Swift_gameSectionMetadata", "Swift_gameSectionMetadata_set", "futuresSectionMetadata", "getFuturesSectionMetadata", "setFuturesSectionMetadata", "Swift_futuresSectionMetadata", "Swift_futuresSectionMetadata_set", "isRefreshing", "setRefreshing", "Swift_isRefreshing", "Swift_isRefreshing_set", "isLoading", "setLoading", "Swift_isLoading", "Swift_isLoading_set", "isRetrying", "setRetrying", "Swift_isRetrying", "Swift_isRetrying_set", "scrollToViewIdentity", "getScrollToViewIdentity", "setScrollToViewIdentity", "Swift_scrollToViewIdentity", "Swift_scrollToViewIdentity_set", "", "positionedEventCount", "getPositionedEventCount", "()I", "setPositionedEventCount", "(I)V", "Swift_positionedEventCount", "Swift_positionedEventCount_set", "Lcom/polymarket/data/ETournamentUS;", "tournament", "getTournament", "()Lcom/polymarket/data/ETournamentUS;", "setTournament", "(Lcom/polymarket/data/ETournamentUS;)V", "Swift_tournament", "Swift_tournament_set", "showBuildComboButtonFooter", "getShowBuildComboButtonFooter", "Swift_showBuildComboButtonFooter", "premadeCombosRailViewModel", "Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel;", "getPremadeCombosRailViewModel", "()Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel;", "Swift_premadeCombosRailViewModel", "showsPremadeCombosRail", "getShowsPremadeCombosRail", "Swift_showsPremadeCombosRail", "isLoadingMoreGames", "setLoadingMoreGames", "Swift_isLoadingMoreGames", "Swift_isLoadingMoreGames_set", "isLoadingMoreFutures", "setLoadingMoreFutures", "Swift_isLoadingMoreFutures", "Swift_isLoadingMoreFutures_set", "gamesHasMore", "getGamesHasMore", "setGamesHasMore", "Swift_gamesHasMore", "Swift_gamesHasMore_set", "futuresHasMore", "getFuturesHasMore", "setFuturesHasMore", "Swift_futuresHasMore", "Swift_futuresHasMore_set", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Tab;", "selectedTab", "getSelectedTab", "()Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Tab;", "setSelectedTab", "(Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Tab;)V", "Swift_selectedTab", "Swift_selectedTab_set", "selectedTabIndex", "getSelectedTabIndex", "setSelectedTabIndex", "Swift_selectedTabIndex", "Swift_selectedTabIndex_set", "hasFutures", "getHasFutures", "setHasFutures", "Swift_hasFutures", "Swift_hasFutures_set", "hasGames", "getHasGames", "setHasGames", "Swift_hasGames", "Swift_hasGames_set", "availableTabs", "getAvailableTabs", "Swift_availableTabs", "showTabBar", "getShowTabBar", "Swift_showTabBar", "futuresPositionIdentity", "getFuturesPositionIdentity", "setFuturesPositionIdentity", "Swift_futuresPositionIdentity", "Swift_futuresPositionIdentity_set", "futuresVMPositionCount", "getFuturesVMPositionCount", "setFuturesVMPositionCount", "Swift_futuresVMPositionCount", "Swift_futuresVMPositionCount_set", "Lcom/polymarket/usviewmodels/SportsCategoryPill;", "pills", "getPills", "setPills", "Swift_pills", "Swift_pills_set", "selectedPillIndex", "getSelectedPillIndex", "setSelectedPillIndex", "Swift_selectedPillIndex", "Swift_selectedPillIndex_set", "tagPillSectionMetadata", "getTagPillSectionMetadata", "setTagPillSectionMetadata", "Swift_tagPillSectionMetadata", "Swift_tagPillSectionMetadata_set", "isLoadingPillEvents", "setLoadingPillEvents", "Swift_isLoadingPillEvents", "Swift_isLoadingPillEvents_set", "showPillBar", "getShowPillBar", "Swift_showPillBar", "selectedPill", "getSelectedPill", "()Lcom/polymarket/usviewmodels/SportsCategoryPill;", "Swift_selectedPill", "currentSectionMetadata", "getCurrentSectionMetadata", "Swift_currentSectionMetadata", "isInitialLoading", "Swift_isInitialLoading", "hasSections", "getHasSections", "Swift_hasSections", "shouldShowEvents", "getShouldShowEvents", "Swift_shouldShowEvents", "isEmpty", "Swift_isEmpty", "getPresentationContext", "()Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$PresentationContext;", "Swift_presentationContext", "setup", "Swift_setup_1", "selectTab", "Swift_selectTab_2", "selectTabAtIndex", "index", "Swift_selectTabAtIndex_3", "selectPillAtIndex", "Swift_selectPillAtIndex_4", "applyDeeplinkSubtab", "subtab", "Swift_applyDeeplinkSubtab_5", "handleInternalScrollProgress", "progress", "", "Swift_handleInternalScrollProgress_6", "handleInternalScrollFinished", "Swift_handleInternalScrollFinished_7", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input;", "Swift_sendInput_8", "setCallbacks", "Swift_setCallbacks_9", "viewModelsForSection", "section", "Swift_viewModelsForSection_10", "loadedGameEvents", "forLeagueSlug", "Swift_loadedGameEvents_11", "leagueSlug", "seedEvents", RadarTrackingOptions.RadarTrackingOptionsSync.EVENTS_STR, "Swift_seedEvents_12", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Callbacks", "Tab", "EventSectionMetadata", "PresentationContext", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class USSportsCategoryViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$PresentationContext;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "homeSection", "standalone", "embedded", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class PresentationContext implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ PresentationContext[] $VALUES;
        public static final PresentationContext homeSection = new PresentationContext("homeSection", 0);
        public static final PresentationContext standalone = new PresentationContext("standalone", 1);
        public static final PresentationContext embedded = new PresentationContext("embedded", 2);

        private static final /* synthetic */ PresentationContext[] $values() {
            return new PresentationContext[]{homeSection, standalone, embedded};
        }

        static {
            PresentationContext[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private PresentationContext(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static PresentationContext valueOf(String str) {
            return (PresentationContext) Enum.valueOf(PresentationContext.class, str);
        }

        public static PresentationContext[] values() {
            return (PresentationContext[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    public /* synthetic */ USSportsCategoryViewModel(APIEventTag aPIEventTag, PresentationContext presentationContext, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aPIEventTag, (i & 2) != 0 ? PresentationContext.standalone : presentationContext, (i & 4) != 0 ? new Callbacks(null, null, null, null, null, 31, null) : callbacks);
    }

    private final native void Swift_applyDeeplinkSubtab_5(long Swift_peer, String subtab);

    private final native List<Tab> Swift_availableTabs(long Swift_peer);

    private final native List<EventSectionMetadata> Swift_currentSectionMetadata(long Swift_peer);

    private final native List<String> Swift_eventViewModelIds(long Swift_peer);

    private final native void Swift_eventViewModelIds_set(long Swift_peer, List<String> value);

    private final native Map<String, USEventCardViewModel> Swift_eventViewModelsById(long Swift_peer);

    private final native void Swift_eventViewModelsById_set(long Swift_peer, Map<String, USEventCardViewModel> value);

    private final native boolean Swift_futuresHasMore(long Swift_peer);

    private final native void Swift_futuresHasMore_set(long Swift_peer, boolean value);

    private final native String Swift_futuresPositionIdentity(long Swift_peer);

    private final native void Swift_futuresPositionIdentity_set(long Swift_peer, String value);

    private final native List<EventSectionMetadata> Swift_futuresSectionMetadata(long Swift_peer);

    private final native void Swift_futuresSectionMetadata_set(long Swift_peer, List<EventSectionMetadata> value);

    private final native int Swift_futuresVMPositionCount(long Swift_peer);

    private final native void Swift_futuresVMPositionCount_set(long Swift_peer, int value);

    private final native List<EventSectionMetadata> Swift_gameSectionMetadata(long Swift_peer);

    private final native void Swift_gameSectionMetadata_set(long Swift_peer, List<EventSectionMetadata> value);

    private final native boolean Swift_gamesHasMore(long Swift_peer);

    private final native void Swift_gamesHasMore_set(long Swift_peer, boolean value);

    private final native void Swift_handleInternalScrollFinished_7(long Swift_peer);

    private final native void Swift_handleInternalScrollProgress_6(long Swift_peer, double progress);

    private final native boolean Swift_hasFutures(long Swift_peer);

    private final native void Swift_hasFutures_set(long Swift_peer, boolean value);

    private final native boolean Swift_hasGames(long Swift_peer);

    private final native void Swift_hasGames_set(long Swift_peer, boolean value);

    private final native boolean Swift_hasSections(long Swift_peer);

    private final native boolean Swift_isAwaitingSearchResults(long Swift_peer);

    private final native void Swift_isAwaitingSearchResults_set(long Swift_peer, boolean value);

    private final native boolean Swift_isEmpty(long Swift_peer);

    private final native boolean Swift_isInitialLoading(long Swift_peer);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native boolean Swift_isLoadingMoreFutures(long Swift_peer);

    private final native void Swift_isLoadingMoreFutures_set(long Swift_peer, boolean value);

    private final native boolean Swift_isLoadingMoreGames(long Swift_peer);

    private final native void Swift_isLoadingMoreGames_set(long Swift_peer, boolean value);

    private final native boolean Swift_isLoadingPillEvents(long Swift_peer);

    private final native void Swift_isLoadingPillEvents_set(long Swift_peer, boolean value);

    private final native void Swift_isLoading_set(long Swift_peer, boolean value);

    private final native boolean Swift_isRefreshing(long Swift_peer);

    private final native void Swift_isRefreshing_set(long Swift_peer, boolean value);

    private final native boolean Swift_isRetrying(long Swift_peer);

    private final native void Swift_isRetrying_set(long Swift_peer, boolean value);

    private final native boolean Swift_isSearchActive(long Swift_peer);

    private final native List<EEvent> Swift_loadedGameEvents_11(long Swift_peer, String leagueSlug);

    private final native List<SportsCategoryPill> Swift_pills(long Swift_peer);

    private final native void Swift_pills_set(long Swift_peer, List<SportsCategoryPill> value);

    private final native int Swift_positionedEventCount(long Swift_peer);

    private final native void Swift_positionedEventCount_set(long Swift_peer, int value);

    private final native USHomePremadeCombosRailViewModel Swift_premadeCombosRailViewModel(long Swift_peer);

    private final native PresentationContext Swift_presentationContext(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_scrollToViewIdentity(long Swift_peer);

    private final native void Swift_scrollToViewIdentity_set(long Swift_peer, String value);

    private final native String Swift_searchQuery(long Swift_peer);

    private final native void Swift_searchQuery_set(long Swift_peer, String value);

    private final native List<USEventCardViewModel> Swift_searchResultEventViewModels(long Swift_peer);

    private final native void Swift_searchResultEventViewModels_set(long Swift_peer, List<USEventCardViewModel> value);

    private final native List<EEvent> Swift_searchResults(long Swift_peer);

    private final native void Swift_searchResults_set(long Swift_peer, List<EEvent> value);

    private final native List<EventSectionMetadata> Swift_sectionMetadata(long Swift_peer);

    private final native void Swift_sectionMetadata_set(long Swift_peer, List<EventSectionMetadata> value);

    private final native void Swift_seedEvents_12(long Swift_peer, List<EEvent> events);

    private final native void Swift_selectPillAtIndex_4(long Swift_peer, int index);

    private final native void Swift_selectTabAtIndex_3(long Swift_peer, int index);

    private final native void Swift_selectTab_2(long Swift_peer, Tab tab);

    private final native SportsCategoryPill Swift_selectedPill(long Swift_peer);

    private final native int Swift_selectedPillIndex(long Swift_peer);

    private final native void Swift_selectedPillIndex_set(long Swift_peer, int value);

    private final native Tab Swift_selectedTab(long Swift_peer);

    private final native int Swift_selectedTabIndex(long Swift_peer);

    private final native void Swift_selectedTabIndex_set(long Swift_peer, int value);

    private final native void Swift_selectedTab_set(long Swift_peer, Tab value);

    private final native void Swift_sendInput_8(long Swift_peer, Input input);

    private final native void Swift_setCallbacks_9(long Swift_peer, Callbacks callbacks);

    private final native void Swift_setup_1(long Swift_peer);

    private final native boolean Swift_shouldShowEvents(long Swift_peer);

    private final native boolean Swift_showBuildComboButtonFooter(long Swift_peer);

    private final native boolean Swift_showPillBar(long Swift_peer);

    private final native boolean Swift_showSearchEmpty(long Swift_peer);

    private final native boolean Swift_showSearchLoading(long Swift_peer);

    private final native boolean Swift_showTabBar(long Swift_peer);

    private final native boolean Swift_showsPremadeCombosRail(long Swift_peer);

    private final native APIEventTag Swift_tab(long Swift_peer);

    private final native List<EventSectionMetadata> Swift_tagPillSectionMetadata(long Swift_peer);

    private final native void Swift_tagPillSectionMetadata_set(long Swift_peer, List<EventSectionMetadata> value);

    private final native ETournamentUS Swift_tournament(long Swift_peer);

    private final native void Swift_tournament_set(long Swift_peer, ETournamentUS value);

    private final native List<USEventCardViewModel> Swift_viewModelsForSection_10(long Swift_peer, EventSectionMetadata section);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final void applyDeeplinkSubtab(String subtab) {
        subtab.getClass();
        Swift_applyDeeplinkSubtab_5(getSwift_peer(), subtab);
    }

    public final List<Tab> getAvailableTabs() {
        return Swift_availableTabs(getSwift_peer());
    }

    public final List<EventSectionMetadata> getCurrentSectionMetadata() {
        return Swift_currentSectionMetadata(getSwift_peer());
    }

    public final List<String> getEventViewModelIds() {
        return Swift_eventViewModelIds(getSwift_peer());
    }

    public final Map<String, USEventCardViewModel> getEventViewModelsById() {
        return Swift_eventViewModelsById(getSwift_peer());
    }

    public final boolean getFuturesHasMore() {
        return Swift_futuresHasMore(getSwift_peer());
    }

    public final String getFuturesPositionIdentity() {
        return Swift_futuresPositionIdentity(getSwift_peer());
    }

    public final List<EventSectionMetadata> getFuturesSectionMetadata() {
        return Swift_futuresSectionMetadata(getSwift_peer());
    }

    public final int getFuturesVMPositionCount() {
        return Swift_futuresVMPositionCount(getSwift_peer());
    }

    public final List<EventSectionMetadata> getGameSectionMetadata() {
        return Swift_gameSectionMetadata(getSwift_peer());
    }

    public final boolean getGamesHasMore() {
        return Swift_gamesHasMore(getSwift_peer());
    }

    public final boolean getHasFutures() {
        return Swift_hasFutures(getSwift_peer());
    }

    public final boolean getHasGames() {
        return Swift_hasGames(getSwift_peer());
    }

    public final boolean getHasSections() {
        return Swift_hasSections(getSwift_peer());
    }

    public final List<SportsCategoryPill> getPills() {
        return Swift_pills(getSwift_peer());
    }

    public final int getPositionedEventCount() {
        return Swift_positionedEventCount(getSwift_peer());
    }

    public final USHomePremadeCombosRailViewModel getPremadeCombosRailViewModel() {
        return Swift_premadeCombosRailViewModel(getSwift_peer());
    }

    public final PresentationContext getPresentationContext() {
        return Swift_presentationContext(getSwift_peer());
    }

    public final String getScrollToViewIdentity() {
        return Swift_scrollToViewIdentity(getSwift_peer());
    }

    public final String getSearchQuery() {
        return Swift_searchQuery(getSwift_peer());
    }

    public final List<USEventCardViewModel> getSearchResultEventViewModels() {
        return Swift_searchResultEventViewModels(getSwift_peer());
    }

    public final List<EEvent> getSearchResults() {
        return Swift_searchResults(getSwift_peer());
    }

    public final List<EventSectionMetadata> getSectionMetadata() {
        return Swift_sectionMetadata(getSwift_peer());
    }

    public final SportsCategoryPill getSelectedPill() {
        return Swift_selectedPill(getSwift_peer());
    }

    public final int getSelectedPillIndex() {
        return Swift_selectedPillIndex(getSwift_peer());
    }

    public final Tab getSelectedTab() {
        return Swift_selectedTab(getSwift_peer());
    }

    public final int getSelectedTabIndex() {
        return Swift_selectedTabIndex(getSwift_peer());
    }

    public final boolean getShouldShowEvents() {
        return Swift_shouldShowEvents(getSwift_peer());
    }

    public final boolean getShowBuildComboButtonFooter() {
        return Swift_showBuildComboButtonFooter(getSwift_peer());
    }

    public final boolean getShowPillBar() {
        return Swift_showPillBar(getSwift_peer());
    }

    public final boolean getShowSearchEmpty() {
        return Swift_showSearchEmpty(getSwift_peer());
    }

    public final boolean getShowSearchLoading() {
        return Swift_showSearchLoading(getSwift_peer());
    }

    public final boolean getShowTabBar() {
        return Swift_showTabBar(getSwift_peer());
    }

    public final boolean getShowsPremadeCombosRail() {
        return Swift_showsPremadeCombosRail(getSwift_peer());
    }

    public final APIEventTag getTab() {
        return Swift_tab(getSwift_peer());
    }

    public final List<EventSectionMetadata> getTagPillSectionMetadata() {
        return Swift_tagPillSectionMetadata(getSwift_peer());
    }

    public final ETournamentUS getTournament() {
        return Swift_tournament(getSwift_peer());
    }

    public final void handleInternalScrollFinished() {
        Swift_handleInternalScrollFinished_7(getSwift_peer());
    }

    public final void handleInternalScrollProgress(double progress) {
        Swift_handleInternalScrollProgress_6(getSwift_peer(), progress);
    }

    public final boolean isAwaitingSearchResults() {
        return Swift_isAwaitingSearchResults(getSwift_peer());
    }

    public final boolean isEmpty() {
        return Swift_isEmpty(getSwift_peer());
    }

    public final boolean isInitialLoading() {
        return Swift_isInitialLoading(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final boolean isLoadingMoreFutures() {
        return Swift_isLoadingMoreFutures(getSwift_peer());
    }

    public final boolean isLoadingMoreGames() {
        return Swift_isLoadingMoreGames(getSwift_peer());
    }

    public final boolean isLoadingPillEvents() {
        return Swift_isLoadingPillEvents(getSwift_peer());
    }

    public final boolean isRefreshing() {
        return Swift_isRefreshing(getSwift_peer());
    }

    public final boolean isRetrying() {
        return Swift_isRetrying(getSwift_peer());
    }

    public final boolean isSearchActive() {
        return Swift_isSearchActive(getSwift_peer());
    }

    public final List<EEvent> loadedGameEvents(String forLeagueSlug) {
        return Swift_loadedGameEvents_11(getSwift_peer(), forLeagueSlug);
    }

    public final void seedEvents(List<EEvent> events) {
        events.getClass();
        Swift_seedEvents_12(getSwift_peer(), events);
    }

    public final void selectPillAtIndex(int index) {
        Swift_selectPillAtIndex_4(getSwift_peer(), index);
    }

    public final void selectTab(Tab tab) {
        tab.getClass();
        Swift_selectTab_2(getSwift_peer(), tab);
    }

    public final void selectTabAtIndex(int index) {
        Swift_selectTabAtIndex_3(getSwift_peer(), index);
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_8(getSwift_peer(), input);
    }

    public final void setAwaitingSearchResults(boolean z) {
        Swift_isAwaitingSearchResults_set(getSwift_peer(), z);
    }

    public final void setCallbacks(Callbacks callbacks) {
        callbacks.getClass();
        Swift_setCallbacks_9(getSwift_peer(), callbacks);
    }

    public final void setEventViewModelIds(List<String> list) {
        list.getClass();
        Swift_eventViewModelIds_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setEventViewModelsById(Map<String, USEventCardViewModel> map) {
        map.getClass();
        Swift_eventViewModelsById_set(getSwift_peer(), (Map) StructKt.sref$default(map, null, 1, null));
    }

    public final void setFuturesHasMore(boolean z) {
        Swift_futuresHasMore_set(getSwift_peer(), z);
    }

    public final void setFuturesPositionIdentity(String str) {
        str.getClass();
        Swift_futuresPositionIdentity_set(getSwift_peer(), str);
    }

    public final void setFuturesSectionMetadata(List<EventSectionMetadata> list) {
        list.getClass();
        Swift_futuresSectionMetadata_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setFuturesVMPositionCount(int i) {
        Swift_futuresVMPositionCount_set(getSwift_peer(), i);
    }

    public final void setGameSectionMetadata(List<EventSectionMetadata> list) {
        list.getClass();
        Swift_gameSectionMetadata_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setGamesHasMore(boolean z) {
        Swift_gamesHasMore_set(getSwift_peer(), z);
    }

    public final void setHasFutures(boolean z) {
        Swift_hasFutures_set(getSwift_peer(), z);
    }

    public final void setHasGames(boolean z) {
        Swift_hasGames_set(getSwift_peer(), z);
    }

    public final void setLoading(boolean z) {
        Swift_isLoading_set(getSwift_peer(), z);
    }

    public final void setLoadingMoreFutures(boolean z) {
        Swift_isLoadingMoreFutures_set(getSwift_peer(), z);
    }

    public final void setLoadingMoreGames(boolean z) {
        Swift_isLoadingMoreGames_set(getSwift_peer(), z);
    }

    public final void setLoadingPillEvents(boolean z) {
        Swift_isLoadingPillEvents_set(getSwift_peer(), z);
    }

    public final void setPills(List<SportsCategoryPill> list) {
        list.getClass();
        Swift_pills_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setPositionedEventCount(int i) {
        Swift_positionedEventCount_set(getSwift_peer(), i);
    }

    public final void setRefreshing(boolean z) {
        Swift_isRefreshing_set(getSwift_peer(), z);
    }

    public final void setRetrying(boolean z) {
        Swift_isRetrying_set(getSwift_peer(), z);
    }

    public final void setScrollToViewIdentity(String str) {
        Swift_scrollToViewIdentity_set(getSwift_peer(), str);
    }

    public final void setSearchQuery(String str) {
        str.getClass();
        Swift_searchQuery_set(getSwift_peer(), str);
    }

    public final void setSearchResultEventViewModels(List<USEventCardViewModel> list) {
        list.getClass();
        Swift_searchResultEventViewModels_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setSearchResults(List<EEvent> list) {
        list.getClass();
        Swift_searchResults_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setSectionMetadata(List<EventSectionMetadata> list) {
        list.getClass();
        Swift_sectionMetadata_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setSelectedPillIndex(int i) {
        Swift_selectedPillIndex_set(getSwift_peer(), i);
    }

    public final void setSelectedTab(Tab tab) {
        tab.getClass();
        Swift_selectedTab_set(getSwift_peer(), tab);
    }

    public final void setSelectedTabIndex(int i) {
        Swift_selectedTabIndex_set(getSwift_peer(), i);
    }

    public final void setTagPillSectionMetadata(List<EventSectionMetadata> list) {
        list.getClass();
        Swift_tagPillSectionMetadata_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setTournament(ETournamentUS eTournamentUS) {
        Swift_tournament_set(getSwift_peer(), (ETournamentUS) StructKt.sref$default(eTournamentUS, null, 1, null));
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    public final List<USEventCardViewModel> viewModelsForSection(EventSectionMetadata section) {
        section.getClass();
        return Swift_viewModelsForSection_10(getSwift_peer(), section);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 [2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0002Z[B\u001f\b\u0016\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0012\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\f\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u0015\u0010\u0019\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u0010\u001e\u001a\u00020\u001b2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020 2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u0010(\u001a\u00020%2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0017\u0010.\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010/\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u00100\u001a\u0004\u0018\u00010\u0002H\u0082 J\u0017\u00107\u001a\u0004\u0018\u0001012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u00108\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u00100\u001a\u0004\u0018\u000101H\u0082 J\u0015\u0010;\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0017\u0010>\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u0010?\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00020\u0003H\u0082 J\b\u0010M\u001a\u00020\u0003H\u0016J\u0013\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010BH\u0096\u0002J\u0019\u0010Q\u001a\u00020O2\u0006\u0010R\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\u0000H\u0082 J\b\u0010T\u001a\u00020HH\u0016J\u0015\u0010U\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0016\u0010V\u001a\b\u0012\u0004\u0012\u00020B0W2\u0006\u0010X\u001a\u00020HH\u0016J\u0017\u0010Y\u001a\b\u0012\u0004\u0012\u00020B0W2\u0006\u0010X\u001a\u00020HH\u0082 R\u001e\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010$\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R(\u0010*\u001a\u0004\u0018\u00010\u00022\b\u0010)\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010-R(\u00102\u001a\u0004\u0018\u0001012\b\u0010)\u001a\u0004\u0018\u0001018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0011\u00109\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b:\u0010\u0018R\u0013\u0010<\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b=\u0010\u0018R(\u0010@\u001a\u0010\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u0014\u0018\u00010AX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010G\u001a\u00020HX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006\\"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata;", "Lskip/lib/Identifiable;", "", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()Ljava/lang/String;", "Swift_id", AttributeType.DATE, "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "Swift_date", "eventIds", "", "getEventIds", "()Ljava/util/List;", "Swift_eventIds", "type", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType;", "getType", "()Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType;", "Swift_type", "newValue", "customTitle", "getCustomTitle", "setCustomTitle", "(Ljava/lang/String;)V", "Swift_customTitle", "Swift_customTitle_set", "value", "Ljava/net/URI;", "headerImageURL", "getHeaderImageURL", "()Ljava/net/URI;", "setHeaderImageURL", "(Ljava/net/URI;)V", "Swift_headerImageURL", "Swift_headerImageURL_set", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "Swift_title", "pillListTitle", "getPillListTitle", "Swift_pillListTitle", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "equals", "", "other", "Swift_isequal", "lhs", "rhs", "hashCode", "Swift_hashvalue", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "SectionType", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class EventSectionMetadata implements Identifiable<String>, MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        private EventSectionMetadata(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(mutableStruct);
        }

        private final native long Swift_constructor_0(MutableStruct copy);

        private final native String Swift_customTitle(long Swift_peer);

        private final native void Swift_customTitle_set(long Swift_peer, String value);

        private final native Date Swift_date(long Swift_peer);

        private final native List<String> Swift_eventIds(long Swift_peer);

        private final native long Swift_hashvalue(long Swift_peer);

        private final native URI Swift_headerImageURL(long Swift_peer);

        private final native void Swift_headerImageURL_set(long Swift_peer, URI value);

        private final native String Swift_id(long Swift_peer);

        private final native boolean Swift_isequal(EventSectionMetadata lhs, EventSectionMetadata rhs);

        private final native String Swift_pillListTitle(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native String Swift_title(long Swift_peer);

        private final native SectionType Swift_type(long Swift_peer);

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
            if (other == this) {
                return true;
            }
            if (!(other instanceof EventSectionMetadata)) {
                return false;
            }
            return Swift_isequal(this, (EventSectionMetadata) other);
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final String getCustomTitle() {
            return Swift_customTitle(this.Swift_peer);
        }

        public final Date getDate() {
            return Swift_date(this.Swift_peer);
        }

        public final List<String> getEventIds() {
            return Swift_eventIds(this.Swift_peer);
        }

        public final URI getHeaderImageURL() {
            return Swift_headerImageURL(this.Swift_peer);
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
        }

        public final String getPillListTitle() {
            return Swift_pillListTitle(this.Swift_peer);
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

        public final String getTitle() {
            return Swift_title(this.Swift_peer);
        }

        public final SectionType getType() {
            return Swift_type(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(Swift_hashvalue(this.Swift_peer));
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new EventSectionMetadata(this);
        }

        public final void setCustomTitle(String str) {
            willmutate();
            try {
                Swift_customTitle_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setHeaderImageURL(URI uri) {
            URI uri2 = (URI) StructKt.sref$default(uri, null, 1, null);
            willmutate();
            try {
                Swift_headerImageURL_set(this.Swift_peer, uri2);
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

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00122\u00020\u0001:\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\b\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "MyPositionsCase", "LiveCase", "TodayCase", "TomorrowCase", "FutureDateCase", "SeasonWeekCase", "RecentlyEndedCase", "FuturesCase", "Companion", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType$FutureDateCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType$FuturesCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType$LiveCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType$MyPositionsCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType$RecentlyEndedCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType$SeasonWeekCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType$TodayCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType$TomorrowCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static abstract class SectionType implements SwiftProjecting {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final SectionType myPositions = new MyPositionsCase();
            private static final SectionType live = new LiveCase();
            private static final SectionType today = new TodayCase();
            private static final SectionType tomorrow = new TomorrowCase();
            private static final SectionType recentlyEnded = new RecentlyEndedCase();
            private static final SectionType futures = new FuturesCase();

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType$FutureDateCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType;", "associated0", "Ljava/util/Date;", "<init>", "(Ljava/util/Date;)V", "getAssociated0", "()Ljava/util/Date;", "equals", "", "other", "", "hashCode", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class FutureDateCase extends SectionType {
                private final Date associated0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FutureDateCase(Date date) {
                    super(null);
                    date.getClass();
                    this.associated0 = date;
                }

                public boolean equals(Object other) {
                    if (!(other instanceof FutureDateCase)) {
                        return false;
                    }
                    return Intrinsics.areEqual(this.associated0, ((FutureDateCase) other).associated0);
                }

                public final Date getAssociated0() {
                    return this.associated0;
                }

                public int hashCode() {
                    return Hasher.INSTANCE.combine(1, this.associated0);
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType$FuturesCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class FuturesCase extends SectionType {
                public FuturesCase() {
                    super(null);
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType$LiveCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class LiveCase extends SectionType {
                public LiveCase() {
                    super(null);
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType$MyPositionsCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class MyPositionsCase extends SectionType {
                public MyPositionsCase() {
                    super(null);
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType$RecentlyEndedCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class RecentlyEndedCase extends SectionType {
                public RecentlyEndedCase() {
                    super(null);
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType$SeasonWeekCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType;", "associated0", "", "associated1", "Ljava/util/Date;", "associated2", "", "<init>", "(ILjava/util/Date;Ljava/lang/String;)V", "getAssociated0", "()I", "getAssociated1", "()Ljava/util/Date;", "getAssociated2", "()Ljava/lang/String;", "index", "getIndex", AttributeType.DATE, "getDate", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "equals", "", "other", "", "hashCode", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class SeasonWeekCase extends SectionType {
                private final int associated0;
                private final Date associated1;
                private final String associated2;
                private final Date date;
                private final int index;
                private final String title;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SeasonWeekCase(int i, Date date, String str) {
                    super(null);
                    date.getClass();
                    str.getClass();
                    this.associated0 = i;
                    this.associated1 = date;
                    this.associated2 = str;
                    this.index = i;
                    this.date = date;
                    this.title = str;
                }

                public boolean equals(Object other) {
                    if (!(other instanceof SeasonWeekCase)) {
                        return false;
                    }
                    SeasonWeekCase seasonWeekCase = (SeasonWeekCase) other;
                    if (this.associated0 != seasonWeekCase.associated0 || !Intrinsics.areEqual(this.associated1, seasonWeekCase.associated1) || !Intrinsics.areEqual(this.associated2, seasonWeekCase.associated2)) {
                        return false;
                    }
                    return true;
                }

                public final int getAssociated0() {
                    return this.associated0;
                }

                public final Date getAssociated1() {
                    return this.associated1;
                }

                public final String getAssociated2() {
                    return this.associated2;
                }

                public final Date getDate() {
                    return this.date;
                }

                public final int getIndex() {
                    return this.index;
                }

                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    Hasher.Companion companion = Hasher.INSTANCE;
                    return companion.combine(companion.combine(companion.combine(1, Integer.valueOf(this.associated0)), this.associated1), this.associated2);
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType$TodayCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class TodayCase extends SectionType {
                public TodayCase() {
                    super(null);
                }
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType$TomorrowCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class TomorrowCase extends SectionType {
                public TomorrowCase() {
                    super(null);
                }
            }

            public /* synthetic */ SectionType(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static final /* synthetic */ SectionType access$getFutures$cp() {
                return futures;
            }

            public static final /* synthetic */ SectionType access$getLive$cp() {
                return live;
            }

            public static final /* synthetic */ SectionType access$getMyPositions$cp() {
                return myPositions;
            }

            public static final /* synthetic */ SectionType access$getRecentlyEnded$cp() {
                return recentlyEnded;
            }

            public static final /* synthetic */ SectionType access$getToday$cp() {
                return today;
            }

            public static final /* synthetic */ SectionType access$getTomorrow$cp() {
                return tomorrow;
            }

            @Override // skip.lib.SwiftProjecting
            public Function0<Object> Swift_projection(int options) {
                return Swift_projectionImpl(options);
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010J\u001e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0007R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType$Companion;", "", "<init>", "()V", "myPositions", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType;", "getMyPositions", "()Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$EventSectionMetadata$SectionType;", "live", "getLive", "today", "getToday", "tomorrow", "getTomorrow", "futureDate", "associated0", "Ljava/util/Date;", "seasonWeek", "index", "", AttributeType.DATE, RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "recentlyEnded", "getRecentlyEnded", "futures", "getFutures", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final SectionType futureDate(Date associated0) {
                    associated0.getClass();
                    return new FutureDateCase(associated0);
                }

                public final SectionType getFutures() {
                    return SectionType.access$getFutures$cp();
                }

                public final SectionType getLive() {
                    return SectionType.access$getLive$cp();
                }

                public final SectionType getMyPositions() {
                    return SectionType.access$getMyPositions$cp();
                }

                public final SectionType getRecentlyEnded() {
                    return SectionType.access$getRecentlyEnded$cp();
                }

                public final SectionType getToday() {
                    return SectionType.access$getToday$cp();
                }

                public final SectionType getTomorrow() {
                    return SectionType.access$getTomorrow$cp();
                }

                public final SectionType seasonWeek(int index, Date date, String title) {
                    date.getClass();
                    title.getClass();
                    return new SeasonWeekCase(index, date, title);
                }

                private Companion() {
                }
            }

            private SectionType() {
            }
        }

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ String getId() {
            return getId2();
        }

        public EventSectionMetadata(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000  2\u00020\u0001:\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u000f!\"#$%&'()*+,-./¨\u00060"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnPullToRefreshCase", "OnScrollToTopCase", "OnRequestReloadIfNeededCase", "EnableRealTimeUpdatesCase", "DisableRealTimeUpdatesCase", "OnSearchQueryChangedCase", "OnClearSearchCase", "OnSearchResultSelectedCase", "OnTournamentSelectedCase", "OnEventSelectedCase", "OnNearBottomCase", "OnGamesNearBottomCase", "OnFuturesNearBottomCase", "OnBuildComboButtonPressedCase", "Companion", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$DisableRealTimeUpdatesCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$EnableRealTimeUpdatesCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$OnBuildComboButtonPressedCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$OnClearSearchCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$OnEventSelectedCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$OnFuturesNearBottomCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$OnGamesNearBottomCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$OnNearBottomCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$OnPullToRefreshCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$OnRequestReloadIfNeededCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$OnScrollToTopCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$OnSearchQueryChangedCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$OnSearchResultSelectedCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$OnTournamentSelectedCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$OnViewDidLoadCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onPullToRefresh = new OnPullToRefreshCase();
        private static final Input onScrollToTop = new OnScrollToTopCase();
        private static final Input enableRealTimeUpdates = new EnableRealTimeUpdatesCase();
        private static final Input disableRealTimeUpdates = new DisableRealTimeUpdatesCase();
        private static final Input onClearSearch = new OnClearSearchCase();
        private static final Input onTournamentSelected = new OnTournamentSelectedCase();
        private static final Input onNearBottom = new OnNearBottomCase();
        private static final Input onGamesNearBottom = new OnGamesNearBottomCase();
        private static final Input onFuturesNearBottom = new OnFuturesNearBottomCase();
        private static final Input onBuildComboButtonPressed = new OnBuildComboButtonPressedCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$DisableRealTimeUpdatesCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class DisableRealTimeUpdatesCase extends Input {
            public DisableRealTimeUpdatesCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$EnableRealTimeUpdatesCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class EnableRealTimeUpdatesCase extends Input {
            public EnableRealTimeUpdatesCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$OnBuildComboButtonPressedCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnBuildComboButtonPressedCase extends Input {
            public OnBuildComboButtonPressedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$OnClearSearchCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnClearSearchCase extends Input {
            public OnClearSearchCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$OnEventSelectedCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnEventSelectedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnEventSelectedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$OnFuturesNearBottomCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnFuturesNearBottomCase extends Input {
            public OnFuturesNearBottomCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$OnGamesNearBottomCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnGamesNearBottomCase extends Input {
            public OnGamesNearBottomCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$OnNearBottomCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnNearBottomCase extends Input {
            public OnNearBottomCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$OnPullToRefreshCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPullToRefreshCase extends Input {
            public OnPullToRefreshCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$OnRequestReloadIfNeededCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/ReloadReason;", "<init>", "(Lcom/polymarket/usviewmodels/ReloadReason;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/ReloadReason;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRequestReloadIfNeededCase extends Input {
            private final ReloadReason associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnRequestReloadIfNeededCase(ReloadReason reloadReason) {
                super(null);
                reloadReason.getClass();
                this.associated0 = reloadReason;
            }

            public final ReloadReason getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$OnScrollToTopCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnScrollToTopCase extends Input {
            public OnScrollToTopCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$OnSearchQueryChangedCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSearchQueryChangedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSearchQueryChangedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$OnSearchResultSelectedCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input;", "associated0", "Lcom/polymarket/data/EEvent;", "<init>", "(Lcom/polymarket/data/EEvent;)V", "getAssociated0", "()Lcom/polymarket/data/EEvent;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSearchResultSelectedCase extends Input {
            private final EEvent associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSearchResultSelectedCase(EEvent eEvent) {
                super(null);
                eEvent.getClass();
                this.associated0 = eEvent;
            }

            public final EEvent getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$OnTournamentSelectedCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnTournamentSelectedCase extends Input {
            public OnTournamentSelectedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        public static final /* synthetic */ Input access$getDisableRealTimeUpdates$cp() {
            return disableRealTimeUpdates;
        }

        public static final /* synthetic */ Input access$getEnableRealTimeUpdates$cp() {
            return enableRealTimeUpdates;
        }

        public static final /* synthetic */ Input access$getOnBuildComboButtonPressed$cp() {
            return onBuildComboButtonPressed;
        }

        public static final /* synthetic */ Input access$getOnClearSearch$cp() {
            return onClearSearch;
        }

        public static final /* synthetic */ Input access$getOnFuturesNearBottom$cp() {
            return onFuturesNearBottom;
        }

        public static final /* synthetic */ Input access$getOnGamesNearBottom$cp() {
            return onGamesNearBottom;
        }

        public static final /* synthetic */ Input access$getOnNearBottom$cp() {
            return onNearBottom;
        }

        public static final /* synthetic */ Input access$getOnPullToRefresh$cp() {
            return onPullToRefresh;
        }

        public static final /* synthetic */ Input access$getOnScrollToTop$cp() {
            return onScrollToTop;
        }

        public static final /* synthetic */ Input access$getOnTournamentSelected$cp() {
            return onTournamentSelected;
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
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0018J\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0011\u0010 \u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007R\u0011\u0010\"\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0007¨\u0006$"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Input;", "onPullToRefresh", "getOnPullToRefresh", "onScrollToTop", "getOnScrollToTop", "onRequestReloadIfNeeded", "associated0", "Lcom/polymarket/usviewmodels/ReloadReason;", "enableRealTimeUpdates", "getEnableRealTimeUpdates", "disableRealTimeUpdates", "getDisableRealTimeUpdates", "onSearchQueryChanged", "", "onClearSearch", "getOnClearSearch", "onSearchResultSelected", "Lcom/polymarket/data/EEvent;", "onTournamentSelected", "getOnTournamentSelected", "onEventSelected", "onNearBottom", "getOnNearBottom", "onGamesNearBottom", "getOnGamesNearBottom", "onFuturesNearBottom", "getOnFuturesNearBottom", "onBuildComboButtonPressed", "getOnBuildComboButtonPressed", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

            public final Input getOnClearSearch() {
                return Input.access$getOnClearSearch$cp();
            }

            public final Input getOnFuturesNearBottom() {
                return Input.access$getOnFuturesNearBottom$cp();
            }

            public final Input getOnGamesNearBottom() {
                return Input.access$getOnGamesNearBottom$cp();
            }

            public final Input getOnNearBottom() {
                return Input.access$getOnNearBottom$cp();
            }

            public final Input getOnPullToRefresh() {
                return Input.access$getOnPullToRefresh$cp();
            }

            public final Input getOnScrollToTop() {
                return Input.access$getOnScrollToTop$cp();
            }

            public final Input getOnTournamentSelected() {
                return Input.access$getOnTournamentSelected$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input onEventSelected(String associated0) {
                associated0.getClass();
                return new OnEventSelectedCase(associated0);
            }

            public final Input onRequestReloadIfNeeded(ReloadReason associated0) {
                associated0.getClass();
                return new OnRequestReloadIfNeededCase(associated0);
            }

            public final Input onSearchQueryChanged(String associated0) {
                associated0.getClass();
                return new OnSearchQueryChangedCase(associated0);
            }

            public final Input onSearchResultSelected(EEvent associated0) {
                associated0.getClass();
                return new OnSearchResultSelectedCase(associated0);
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
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00192\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005:\u0001\u0019B\u001d\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0082 J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0082 R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u001a"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Tab;", "Lskip/lib/CaseIterable;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "games", "futures", "displayTitle", "getDisplayTitle", "Swift_displayTitle", Keys.KEY_NAME, "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Tab implements CaseIterable, RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Tab[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final Tab games = new Tab("games", 0, "games", null, 2, null);
        public static final Tab futures = new Tab("futures", 1, "futures", null, 2, null);

        private static final /* synthetic */ Tab[] $values() {
            return new Tab[]{games, futures};
        }

        static {
            Tab[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ Tab(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native String Swift_displayTitle(String name);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Tab valueOf(String str) {
            return (Tab) Enum.valueOf(Tab.class, str);
        }

        public static Tab[] values() {
            return (Tab[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final String getDisplayTitle() {
            return Swift_displayTitle(name());
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Tab$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Tab;", "<init>", "()V", "init", "rawValue", "", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion implements CaseIterableCompanion<Tab> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // skip.lib.CaseIterableCompanion
            public Array<Tab> getAllCases() {
                return ArrayKt.arrayOf(Tab.games, Tab.futures);
            }

            public final Tab init(String rawValue) {
                rawValue.getClass();
                if (Intrinsics.areEqual(rawValue, "games")) {
                    return Tab.games;
                }
                if (Intrinsics.areEqual(rawValue, "futures")) {
                    return Tab.futures;
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

        private Tab(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0082 J\u0006\u0010\r\u001a\u00020\u000eJ\t\u0010\u000f\u001a\u00020\u000eH\u0082 J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013¨\u0006\u0014"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "tab", "Lcom/polymarket/data/APIEventTag;", "presentationContext", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$PresentationContext;", "callbacks", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel;", "Swift_Companion_mock_13", "Tab", "Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Tab;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(APIEventTag tab, PresentationContext presentationContext, Callbacks callbacks);

        private final native USSportsCategoryViewModel Swift_Companion_mock_13();

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, APIEventTag aPIEventTag, PresentationContext presentationContext, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(aPIEventTag, presentationContext, callbacks);
        }

        public final Tab Tab(String rawValue) {
            rawValue.getClass();
            return Tab.INSTANCE.init(rawValue);
        }

        public final USSportsCategoryViewModel mock() {
            return Swift_Companion_mock_13();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tBq\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u001e\b\u0002\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\r\u0012\u001c\b\u0002\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\b\u0010\u0018J\u0006\u0010\u001d\u001a\u00020\u000fJ\u0015\u0010\u001e\u001a\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016Jp\u0010$\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\r2\u001a\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000f0\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0082 ¢\u0006\u0002\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100'2\u0006\u0010(\u001a\u00020#H\u0016J\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100'2\u0006\u0010(\u001a\u00020#H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lcom/polymarket/usviewmodels/USSportsCategoryViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "sportsEventCallbacks", "Lcom/polymarket/usviewmodels/USEventCardViewModel$Callbacks;", "onPullToRefresh", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "onBuildCombosSelected", "Lcom/polymarket/data/APIEventTag;", "onTournamentSelected", "Lkotlin/Function2;", "Lcom/polymarket/data/ETournamentUS;", "premadeCombosCallbacks", "Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/USEventCardViewModel$Callbacks;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Callbacks;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "hashCode", "", "Swift_constructor_0", "(Lcom/polymarket/usviewmodels/USEventCardViewModel$Callbacks;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lcom/polymarket/usviewmodels/USHomePremadeCombosRailViewModel$Callbacks;)J", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Callbacks(USEventCardViewModel.Callbacks callbacks, Function1 function1, Function1 function12, Function2 function2, USHomePremadeCombosRailViewModel.Callbacks callbacks2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(callbacks, function1, r0, r2, r19);
            Function1 function13;
            Function2 function22;
            USHomePremadeCombosRailViewModel.Callbacks callbacks3;
            callbacks = (i & 1) != 0 ? new USEventCardViewModel.Callbacks(null, null, null, null, null, null, null, null, null, 511, null) : callbacks;
            function1 = (i & 2) != 0 ? new AnonymousClass1(null) : function1;
            if ((i & 4) != 0) {
                function13 = new wmj(23);
            } else {
                function13 = function12;
            }
            if ((i & 8) != 0) {
                function22 = new zyi(21);
            } else {
                function22 = function2;
            }
            if ((i & 16) != 0) {
                callbacks3 = new USHomePremadeCombosRailViewModel.Callbacks(null, null, 3, null);
            } else {
                callbacks3 = callbacks2;
            }
        }

        private final native long Swift_constructor_0(USEventCardViewModel.Callbacks sportsEventCallbacks, Function1<? super Continuation<? super Unit>, ? extends Object> onPullToRefresh, Function1<? super APIEventTag, Unit> onBuildCombosSelected, Function2<? super ETournamentUS, ? super APIEventTag, Unit> onTournamentSelected, USHomePremadeCombosRailViewModel.Callbacks premadeCombosCallbacks);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(APIEventTag aPIEventTag) {
            aPIEventTag.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(ETournamentUS eTournamentUS, APIEventTag aPIEventTag) {
            eTournamentUS.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(APIEventTag aPIEventTag) {
            return _init_$lambda$0(aPIEventTag);
        }

        public static /* synthetic */ Unit b(ETournamentUS eTournamentUS, APIEventTag aPIEventTag) {
            return _init_$lambda$1(eTournamentUS, aPIEventTag);
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

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
        @kw5(c = "com.polymarket.usviewmodels.USSportsCategoryViewModel$Callbacks$1", f = "USSportsCategoryViewModel.kt", l = {RequestError.NO_DEV_KEY}, m = "invokeSuspend")
        /* renamed from: com.polymarket.usviewmodels.USSportsCategoryViewModel$Callbacks$1, reason: invalid class name */
        /* loaded from: classes5.dex */
        public static final class AnonymousClass1 extends zei implements Function1<Continuation<? super Unit>, Object> {
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
            }

            @Override // defpackage.l81
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // defpackage.l81
            public final Object invokeSuspend(Object obj) {
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    MainActor.Companion companion = MainActor.INSTANCE;
                    C00051 c00051 = new C00051(null);
                    this.label = 1;
                    if (companion.run(c00051, this) == u85Var) {
                        return u85Var;
                    }
                }
                return Unit.INSTANCE;
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
            @kw5(c = "com.polymarket.usviewmodels.USSportsCategoryViewModel$Callbacks$1$1", f = "USSportsCategoryViewModel.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.polymarket.usviewmodels.USSportsCategoryViewModel$Callbacks$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C00051 extends zei implements Function1<Continuation<? super Unit>, Object> {
                int label;

                public C00051(Continuation<? super C00051> continuation) {
                    super(1, continuation);
                }

                @Override // defpackage.l81
                public final Continuation<Unit> create(Continuation<?> continuation) {
                    return new C00051(continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Continuation<? super Unit> continuation) {
                    return ((C00051) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // defpackage.l81
                public final Object invokeSuspend(Object obj) {
                    u85 u85Var = u85.COROUTINE_SUSPENDED;
                    if (this.label == 0) {
                        ResultKt.a(obj);
                        return Unit.INSTANCE;
                    }
                    dmk.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Unit> continuation) {
                    return invoke2(continuation);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Unit> continuation) {
                return invoke2(continuation);
            }
        }

        public Callbacks(USEventCardViewModel.Callbacks callbacks, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Function1<? super APIEventTag, Unit> function12, Function2<? super ETournamentUS, ? super APIEventTag, Unit> function2, USHomePremadeCombosRailViewModel.Callbacks callbacks2) {
            callbacks.getClass();
            function1.getClass();
            function12.getClass();
            function2.getClass();
            callbacks2.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(callbacks, function1, function12, function2, callbacks2);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USSportsCategoryViewModel(APIEventTag aPIEventTag, PresentationContext presentationContext, Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, aPIEventTag, presentationContext, callbacks), (SwiftPeerMarker) null);
        aPIEventTag.getClass();
        presentationContext.getClass();
        callbacks.getClass();
    }

    public USSportsCategoryViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }
}
