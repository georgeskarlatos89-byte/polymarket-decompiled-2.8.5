package com.polymarket.usviewmodels;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.EError;
import com.polymarket.data.EReferrals;
import com.polymarket.data.ESportsTeam;
import com.polymarket.data.ESquad;
import com.polymarket.data.ESquadReceivedInvitation;
import com.polymarket.data.ESquadsTutorialConfig;
import com.polymarket.usviewmodels.AppViewModel;
import com.polymarket.usviewmodels.USSquadsSettingsViewModel;
import defpackage.hoj;
import defpackage.hrj;
import defpackage.u85;
import defpackage.ug7;
import defpackage.unj;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Async;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\bS\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 þ\u00012\u00020\u0001:\bû\u0001ü\u0001ý\u0001þ\u0001B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\"\u001a\u00020\u001f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010+\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010.\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u00103\u001a\u0004\u0018\u0001002\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u00108\u001a\u0004\u0018\u0001052\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010:\u001a\u00020\u001f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010<\u001a\u00020\u001f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010?\u001a\u0004\u0018\u00010(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010A\u001a\u00020\u001f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010F\u001a\u00020C2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010I\u001a\u00020\u001f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010L\u001a\u00020C2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010O\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010R\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010U\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010X\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010[\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010^\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010a\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010d\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010g\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010j\u001a\u0004\u0018\u00010(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010l\u001a\u00020\u001f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010o\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010r\u001a\u0004\u0018\u00010(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010u\u001a\u0004\u0018\u00010(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010x\u001a\u00020\u001f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010z\u001a\u00020\u001f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010\u007f\u001a\u0004\u0018\u00010|2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001c\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020|0\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0085\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0088\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u008b\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u008e\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0091\u0001\u001a\u00020\u001f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0094\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0097\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u009a\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u009d\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010 \u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010£\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¦\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010©\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¬\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¯\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010²\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010µ\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¸\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010»\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010¾\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Á\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Ä\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Ç\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Ê\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Í\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0011\u0010Î\u0001\u001a\u00020(2\b\u0010Ï\u0001\u001a\u00030Ð\u0001J \u0010Ñ\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010Ò\u0001\u001a\u00030Ð\u0001H\u0082 J\u0016\u0010Õ\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Ø\u0001\u001a\u00020C2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010Û\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0010\u0010Ü\u0001\u001a\u00020(2\u0007\u0010Ï\u0001\u001a\u00020\u0013J\u001f\u0010Ý\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0007\u0010Þ\u0001\u001a\u00020\u0013H\u0082 J\u0016\u0010á\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010ä\u0001\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\n\u0010å\u0001\u001a\u00030æ\u0001H\u0016J\u0017\u0010ç\u0001\u001a\u00030æ\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001b\u0010è\u0001\u001a\u00030æ\u00012\b\u0010é\u0001\u001a\u00030ê\u0001H\u0096@¢\u0006\u0003\u0010ë\u0001J;\u0010ì\u0001\u001a\u00030æ\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010é\u0001\u001a\u00030ê\u00012\u0018\u0010í\u0001\u001a\u0013\u0012\u0007\u0012\u0005\u0018\u00010ï\u0001\u0012\u0005\u0012\u00030æ\u00010î\u0001H\u0082 J\u0012\u0010ð\u0001\u001a\u00030æ\u00012\b\u0010ñ\u0001\u001a\u00030ò\u0001J!\u0010ó\u0001\u001a\u00030æ\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010ñ\u0001\u001a\u00030ò\u0001H\u0082 J\u0010\u0010ô\u0001\u001a\u00030æ\u00012\u0006\u0010\t\u001a\u00020\nJ\u001f\u0010õ\u0001\u001a\u00030æ\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\t\u001a\u00020\nH\u0082 J\u001a\u0010ö\u0001\u001a\n\u0012\u0005\u0012\u00030ø\u00010÷\u00012\u0007\u0010ù\u0001\u001a\u00020CH\u0016J\u001b\u0010ú\u0001\u001a\n\u0012\u0005\u0012\u00030ø\u00010÷\u00012\u0007\u0010ù\u0001\u001a\u00020CH\u0082 R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\r8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\r8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\r8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\r8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0010R\u0011\u0010'\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010,\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b-\u0010*R\u0013\u0010/\u001a\u0004\u0018\u0001008F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u00104\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u00109\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b9\u0010!R\u0011\u0010;\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b;\u0010!R\u0013\u0010=\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b>\u0010*R\u0011\u0010@\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b@\u0010!R\u0011\u0010B\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0011\u0010G\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bH\u0010!R\u0011\u0010J\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bK\u0010ER\u0011\u0010M\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bN\u0010*R\u0011\u0010P\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bQ\u0010*R\u0011\u0010S\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bT\u0010*R\u0011\u0010V\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bW\u0010*R\u0011\u0010Y\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bZ\u0010*R\u0011\u0010\\\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b]\u0010*R\u0011\u0010_\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b`\u0010*R\u0011\u0010b\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bc\u0010*R\u0011\u0010e\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bf\u0010*R\u0013\u0010h\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\bi\u0010*R\u0011\u0010k\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bk\u0010!R\u0011\u0010m\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bn\u0010*R\u0013\u0010p\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\bq\u0010*R\u0013\u0010s\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\bt\u0010*R\u0011\u0010v\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bw\u0010!R\u0011\u0010y\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\by\u0010!R\u0013\u0010{\u001a\u0004\u0018\u00010|8F¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0019\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020|0\r8F¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010\u0010R\u0013\u0010\u0083\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010*R\u0013\u0010\u0086\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010*R\u0013\u0010\u0089\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010*R\u0013\u0010\u008c\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010*R\u0013\u0010\u008f\u0001\u001a\u00020\u001f8F¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010!R\u0013\u0010\u0092\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010*R\u0013\u0010\u0095\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010*R\u0013\u0010\u0098\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010*R\u0013\u0010\u009b\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010*R\u0013\u0010\u009e\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010*R\u0013\u0010¡\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010*R\u0013\u0010¤\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010*R\u0013\u0010§\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010*R\u0013\u0010ª\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\b«\u0001\u0010*R\u0013\u0010\u00ad\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\b®\u0001\u0010*R\u0013\u0010°\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\b±\u0001\u0010*R\u0013\u0010³\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\b´\u0001\u0010*R\u0013\u0010¶\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\b·\u0001\u0010*R\u0013\u0010¹\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\bº\u0001\u0010*R\u0013\u0010¼\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\b½\u0001\u0010*R\u0013\u0010¿\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\bÀ\u0001\u0010*R\u0013\u0010Â\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\bÃ\u0001\u0010*R\u0013\u0010Å\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\bÆ\u0001\u0010*R\u0013\u0010È\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\bÉ\u0001\u0010*R\u0013\u0010Ë\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\bÌ\u0001\u0010*R\u0013\u0010Ó\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\bÔ\u0001\u0010*R\u0013\u0010Ö\u0001\u001a\u00020C8F¢\u0006\u0007\u001a\u0005\b×\u0001\u0010ER\u0013\u0010Ù\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\bÚ\u0001\u0010*R\u0013\u0010ß\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\bà\u0001\u0010*R\u0013\u0010â\u0001\u001a\u00020(8F¢\u0006\u0007\u001a\u0005\bã\u0001\u0010*¨\u0006ÿ\u0001"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "callbacks", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/USSquadsViewModel$Callbacks;)V", "groups", "", "Lcom/polymarket/data/ESquad;", "getGroups", "()Ljava/util/List;", "Swift_groups", "invitations", "Lcom/polymarket/data/ESquadReceivedInvitation;", "getInvitations", "Swift_invitations", "rowPresentations", "Lcom/polymarket/usviewmodels/SquadsListRowPresentation;", "getRowPresentations", "Swift_rowPresentations", "teamChatRowPresentations", "Lcom/polymarket/usviewmodels/SquadsTeamChatRowPresentation;", "getTeamChatRowPresentations", "Swift_teamChatRowPresentations", "showsTeamsSection", "", "getShowsTeamsSection", "()Z", "Swift_showsTeamsSection", "invitePresentations", "Lcom/polymarket/usviewmodels/SquadsInviteRowPresentation;", "getInvitePresentations", "Swift_invitePresentations", "navUsername", "", "getNavUsername", "()Ljava/lang/String;", "Swift_navUsername", "navUserId", "getNavUserId", "Swift_navUserId", "navAvatarUrl", "Ljava/net/URI;", "getNavAvatarUrl", "()Ljava/net/URI;", "Swift_navAvatarUrl", "loadError", "Lcom/polymarket/data/EError;", "getLoadError", "()Lcom/polymarket/data/EError;", "Swift_loadError", "isLoading", "Swift_isLoading", "isAcceptingInvite", "Swift_isAcceptingInvite", "acceptingInviteSquadId", "getAcceptingInviteSquadId", "Swift_acceptingInviteSquadId", "isCreatingSquad", "Swift_isCreatingSquad", "pendingInvitesCount", "", "getPendingInvitesCount", "()I", "Swift_pendingInvitesCount", "showsNavBar", "getShowsNavBar", "Swift_showsNavBar", "badgeCount", "getBadgeCount", "Swift_badgeCount", "navTitle", "getNavTitle", "Swift_navTitle", "searchUsersPlaceholder", "getSearchUsersPlaceholder", "Swift_searchUsersPlaceholder", "emptyStateTitle", "getEmptyStateTitle", "Swift_emptyStateTitle", "emptyStateSubtitle", "getEmptyStateSubtitle", "Swift_emptyStateSubtitle", "emptyStateCreateButtonTitle", "getEmptyStateCreateButtonTitle", "Swift_emptyStateCreateButtonTitle", "emptyStateEarnPlatterTitle", "getEmptyStateEarnPlatterTitle", "Swift_emptyStateEarnPlatterTitle", "emptyStateBannerBrandTitle", "getEmptyStateBannerBrandTitle", "Swift_emptyStateBannerBrandTitle", "emptyStateBannerTitle", "getEmptyStateBannerTitle", "Swift_emptyStateBannerTitle", "emptyStateBannerSubtitle", "getEmptyStateBannerSubtitle", "Swift_emptyStateBannerSubtitle", "emptyStateBannerPillTitle", "getEmptyStateBannerPillTitle", "Swift_emptyStateBannerPillTitle", "isTutorialAvailable", "Swift_isTutorialAvailable", "tutorialTitle", "getTutorialTitle", "Swift_tutorialTitle", "inviteSectionSubtitle", "getInviteSectionSubtitle", "Swift_inviteSectionSubtitle", "inviteCardSubtitle", "getInviteCardSubtitle", "Swift_inviteCardSubtitle", "showsReferralInfo", "getShowsReferralInfo", "Swift_showsReferralInfo", "isInviteCardDismissed", "Swift_isInviteCardDismissed", "creatingInviteChannel", "Lcom/polymarket/usviewmodels/SquadsInviteChannel;", "getCreatingInviteChannel", "()Lcom/polymarket/usviewmodels/SquadsInviteChannel;", "Swift_creatingInviteChannel", "inviteChannels", "getInviteChannels", "Swift_inviteChannels", "inviteFriendsSheetTitle", "getInviteFriendsSheetTitle", "Swift_inviteFriendsSheetTitle", "inviteFriendsSheetSubtitle", "getInviteFriendsSheetSubtitle", "Swift_inviteFriendsSheetSubtitle", "inviteFriendsSheetCloseTitle", "getInviteFriendsSheetCloseTitle", "Swift_inviteFriendsSheetCloseTitle", "createSquadRowTitle", "getCreateSquadRowTitle", "Swift_createSquadRowTitle", "showsCreateSquadRow", "getShowsCreateSquadRow", "Swift_showsCreateSquadRow", "inviteSectionTitle", "getInviteSectionTitle", "Swift_inviteSectionTitle", "inviteMessagesRowTitle", "getInviteMessagesRowTitle", "Swift_inviteMessagesRowTitle", "inviteWhatsAppRowTitle", "getInviteWhatsAppRowTitle", "Swift_inviteWhatsAppRowTitle", "inviteInstagramRowTitle", "getInviteInstagramRowTitle", "Swift_inviteInstagramRowTitle", "inviteSnapchatRowTitle", "getInviteSnapchatRowTitle", "Swift_inviteSnapchatRowTitle", "inviteRowButtonTitle", "getInviteRowButtonTitle", "Swift_inviteRowButtonTitle", "errorTitle", "getErrorTitle", "Swift_errorTitle", "errorSubtitle", "getErrorSubtitle", "Swift_errorSubtitle", "errorRetryButtonTitle", "getErrorRetryButtonTitle", "Swift_errorRetryButtonTitle", "invitesSectionTitle", "getInvitesSectionTitle", "Swift_invitesSectionTitle", "squadsSectionTitle", "getSquadsSectionTitle", "Swift_squadsSectionTitle", "messagesSectionTitle", "getMessagesSectionTitle", "Swift_messagesSectionTitle", "squadsListSectionTitle", "getSquadsListSectionTitle", "Swift_squadsListSectionTitle", "teamsSectionTitle", "getTeamsSectionTitle", "Swift_teamsSectionTitle", "followTeamsRowTitle", "getFollowTeamsRowTitle", "Swift_followTeamsRowTitle", "followTeamsLeagueSlug", "getFollowTeamsLeagueSlug", "Swift_followTeamsLeagueSlug", "hideTeamChatActionTitle", "getHideTeamChatActionTitle", "Swift_hideTeamChatActionTitle", "unfavoriteTeamChatActionTitle", "getUnfavoriteTeamChatActionTitle", "Swift_unfavoriteTeamChatActionTitle", "muteSquadActionTitle", "getMuteSquadActionTitle", "Swift_muteSquadActionTitle", "unmuteSquadActionTitle", "getUnmuteSquadActionTitle", "Swift_unmuteSquadActionTitle", "teamChatFallbackSubtitle", "for_", "Lcom/polymarket/data/ESportsTeam;", "Swift_teamChatFallbackSubtitle_0", "team", "requestsTitle", "getRequestsTitle", "Swift_requestsTitle", "requestsCount", "getRequestsCount", "Swift_requestsCount", "declineDialogTitle", "getDeclineDialogTitle", "Swift_declineDialogTitle", "declineDialogMessage", "Swift_declineDialogMessage_1", "invitation", "declineDialogConfirmTitle", "getDeclineDialogConfirmTitle", "Swift_declineDialogConfirmTitle", "declineDialogCancelTitle", "getDeclineDialogCancelTitle", "Swift_declineDialogCancelTitle", "setup", "", "Swift_setup_3", "performLoad", "reason", "Lcom/polymarket/usviewmodels/ReloadReason;", "(Lcom/polymarket/usviewmodels/ReloadReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Swift_callback_performLoad_4", "f_callback", "Lkotlin/Function1;", "", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "Swift_sendInput_5", "setCallbacks", "Swift_setCallbacks_6", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Callbacks", "TutorialEntryPoint", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class USSquadsViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ USSquadsViewModel(Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1);
        Callbacks callbacks2;
        if ((i & 1) != 0) {
            callbacks2 = new Callbacks(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        } else {
            callbacks2 = callbacks;
        }
    }

    private final native String Swift_acceptingInviteSquadId(long Swift_peer);

    private final native int Swift_badgeCount(long Swift_peer);

    private final native void Swift_callback_performLoad_4(long Swift_peer, ReloadReason reason, Function1<? super Throwable, Unit> f_callback);

    private final native String Swift_createSquadRowTitle(long Swift_peer);

    private final native SquadsInviteChannel Swift_creatingInviteChannel(long Swift_peer);

    private final native String Swift_declineDialogCancelTitle(long Swift_peer);

    private final native String Swift_declineDialogConfirmTitle(long Swift_peer);

    private final native String Swift_declineDialogMessage_1(long Swift_peer, ESquadReceivedInvitation invitation);

    private final native String Swift_declineDialogTitle(long Swift_peer);

    private final native String Swift_emptyStateBannerBrandTitle(long Swift_peer);

    private final native String Swift_emptyStateBannerPillTitle(long Swift_peer);

    private final native String Swift_emptyStateBannerSubtitle(long Swift_peer);

    private final native String Swift_emptyStateBannerTitle(long Swift_peer);

    private final native String Swift_emptyStateCreateButtonTitle(long Swift_peer);

    private final native String Swift_emptyStateEarnPlatterTitle(long Swift_peer);

    private final native String Swift_emptyStateSubtitle(long Swift_peer);

    private final native String Swift_emptyStateTitle(long Swift_peer);

    private final native String Swift_errorRetryButtonTitle(long Swift_peer);

    private final native String Swift_errorSubtitle(long Swift_peer);

    private final native String Swift_errorTitle(long Swift_peer);

    private final native String Swift_followTeamsLeagueSlug(long Swift_peer);

    private final native String Swift_followTeamsRowTitle(long Swift_peer);

    private final native List<ESquad> Swift_groups(long Swift_peer);

    private final native String Swift_hideTeamChatActionTitle(long Swift_peer);

    private final native List<ESquadReceivedInvitation> Swift_invitations(long Swift_peer);

    private final native String Swift_inviteCardSubtitle(long Swift_peer);

    private final native List<SquadsInviteChannel> Swift_inviteChannels(long Swift_peer);

    private final native String Swift_inviteFriendsSheetCloseTitle(long Swift_peer);

    private final native String Swift_inviteFriendsSheetSubtitle(long Swift_peer);

    private final native String Swift_inviteFriendsSheetTitle(long Swift_peer);

    private final native String Swift_inviteInstagramRowTitle(long Swift_peer);

    private final native String Swift_inviteMessagesRowTitle(long Swift_peer);

    private final native List<SquadsInviteRowPresentation> Swift_invitePresentations(long Swift_peer);

    private final native String Swift_inviteRowButtonTitle(long Swift_peer);

    private final native String Swift_inviteSectionSubtitle(long Swift_peer);

    private final native String Swift_inviteSectionTitle(long Swift_peer);

    private final native String Swift_inviteSnapchatRowTitle(long Swift_peer);

    private final native String Swift_inviteWhatsAppRowTitle(long Swift_peer);

    private final native String Swift_invitesSectionTitle(long Swift_peer);

    private final native boolean Swift_isAcceptingInvite(long Swift_peer);

    private final native boolean Swift_isCreatingSquad(long Swift_peer);

    private final native boolean Swift_isInviteCardDismissed(long Swift_peer);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native boolean Swift_isTutorialAvailable(long Swift_peer);

    private final native EError Swift_loadError(long Swift_peer);

    private final native String Swift_messagesSectionTitle(long Swift_peer);

    private final native String Swift_muteSquadActionTitle(long Swift_peer);

    private final native URI Swift_navAvatarUrl(long Swift_peer);

    private final native String Swift_navTitle(long Swift_peer);

    private final native String Swift_navUserId(long Swift_peer);

    private final native String Swift_navUsername(long Swift_peer);

    private final native int Swift_pendingInvitesCount(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native int Swift_requestsCount(long Swift_peer);

    private final native String Swift_requestsTitle(long Swift_peer);

    private final native List<SquadsListRowPresentation> Swift_rowPresentations(long Swift_peer);

    private final native String Swift_searchUsersPlaceholder(long Swift_peer);

    private final native void Swift_sendInput_5(long Swift_peer, Input input);

    private final native void Swift_setCallbacks_6(long Swift_peer, Callbacks callbacks);

    private final native void Swift_setup_3(long Swift_peer);

    private final native boolean Swift_showsCreateSquadRow(long Swift_peer);

    private final native boolean Swift_showsNavBar(long Swift_peer);

    private final native boolean Swift_showsReferralInfo(long Swift_peer);

    private final native boolean Swift_showsTeamsSection(long Swift_peer);

    private final native String Swift_squadsListSectionTitle(long Swift_peer);

    private final native String Swift_squadsSectionTitle(long Swift_peer);

    private final native String Swift_teamChatFallbackSubtitle_0(long Swift_peer, ESportsTeam team);

    private final native List<SquadsTeamChatRowPresentation> Swift_teamChatRowPresentations(long Swift_peer);

    private final native String Swift_teamsSectionTitle(long Swift_peer);

    private final native String Swift_tutorialTitle(long Swift_peer);

    private final native String Swift_unfavoriteTeamChatActionTitle(long Swift_peer);

    private final native String Swift_unmuteSquadActionTitle(long Swift_peer);

    public static final /* synthetic */ void access$Swift_callback_performLoad_4(USSquadsViewModel uSSquadsViewModel, long j, ReloadReason reloadReason, Function1 function1) {
        uSSquadsViewModel.Swift_callback_performLoad_4(j, reloadReason, function1);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String declineDialogMessage(ESquadReceivedInvitation for_) {
        for_.getClass();
        return Swift_declineDialogMessage_1(getSwift_peer(), for_);
    }

    public final String getAcceptingInviteSquadId() {
        return Swift_acceptingInviteSquadId(getSwift_peer());
    }

    public final int getBadgeCount() {
        return Swift_badgeCount(getSwift_peer());
    }

    public final String getCreateSquadRowTitle() {
        return Swift_createSquadRowTitle(getSwift_peer());
    }

    public final SquadsInviteChannel getCreatingInviteChannel() {
        return Swift_creatingInviteChannel(getSwift_peer());
    }

    public final String getDeclineDialogCancelTitle() {
        return Swift_declineDialogCancelTitle(getSwift_peer());
    }

    public final String getDeclineDialogConfirmTitle() {
        return Swift_declineDialogConfirmTitle(getSwift_peer());
    }

    public final String getDeclineDialogTitle() {
        return Swift_declineDialogTitle(getSwift_peer());
    }

    public final String getEmptyStateBannerBrandTitle() {
        return Swift_emptyStateBannerBrandTitle(getSwift_peer());
    }

    public final String getEmptyStateBannerPillTitle() {
        return Swift_emptyStateBannerPillTitle(getSwift_peer());
    }

    public final String getEmptyStateBannerSubtitle() {
        return Swift_emptyStateBannerSubtitle(getSwift_peer());
    }

    public final String getEmptyStateBannerTitle() {
        return Swift_emptyStateBannerTitle(getSwift_peer());
    }

    public final String getEmptyStateCreateButtonTitle() {
        return Swift_emptyStateCreateButtonTitle(getSwift_peer());
    }

    public final String getEmptyStateEarnPlatterTitle() {
        return Swift_emptyStateEarnPlatterTitle(getSwift_peer());
    }

    public final String getEmptyStateSubtitle() {
        return Swift_emptyStateSubtitle(getSwift_peer());
    }

    public final String getEmptyStateTitle() {
        return Swift_emptyStateTitle(getSwift_peer());
    }

    public final String getErrorRetryButtonTitle() {
        return Swift_errorRetryButtonTitle(getSwift_peer());
    }

    public final String getErrorSubtitle() {
        return Swift_errorSubtitle(getSwift_peer());
    }

    public final String getErrorTitle() {
        return Swift_errorTitle(getSwift_peer());
    }

    public final String getFollowTeamsLeagueSlug() {
        return Swift_followTeamsLeagueSlug(getSwift_peer());
    }

    public final String getFollowTeamsRowTitle() {
        return Swift_followTeamsRowTitle(getSwift_peer());
    }

    public final List<ESquad> getGroups() {
        return Swift_groups(getSwift_peer());
    }

    public final String getHideTeamChatActionTitle() {
        return Swift_hideTeamChatActionTitle(getSwift_peer());
    }

    public final List<ESquadReceivedInvitation> getInvitations() {
        return Swift_invitations(getSwift_peer());
    }

    public final String getInviteCardSubtitle() {
        return Swift_inviteCardSubtitle(getSwift_peer());
    }

    public final List<SquadsInviteChannel> getInviteChannels() {
        return Swift_inviteChannels(getSwift_peer());
    }

    public final String getInviteFriendsSheetCloseTitle() {
        return Swift_inviteFriendsSheetCloseTitle(getSwift_peer());
    }

    public final String getInviteFriendsSheetSubtitle() {
        return Swift_inviteFriendsSheetSubtitle(getSwift_peer());
    }

    public final String getInviteFriendsSheetTitle() {
        return Swift_inviteFriendsSheetTitle(getSwift_peer());
    }

    public final String getInviteInstagramRowTitle() {
        return Swift_inviteInstagramRowTitle(getSwift_peer());
    }

    public final String getInviteMessagesRowTitle() {
        return Swift_inviteMessagesRowTitle(getSwift_peer());
    }

    public final List<SquadsInviteRowPresentation> getInvitePresentations() {
        return Swift_invitePresentations(getSwift_peer());
    }

    public final String getInviteRowButtonTitle() {
        return Swift_inviteRowButtonTitle(getSwift_peer());
    }

    public final String getInviteSectionSubtitle() {
        return Swift_inviteSectionSubtitle(getSwift_peer());
    }

    public final String getInviteSectionTitle() {
        return Swift_inviteSectionTitle(getSwift_peer());
    }

    public final String getInviteSnapchatRowTitle() {
        return Swift_inviteSnapchatRowTitle(getSwift_peer());
    }

    public final String getInviteWhatsAppRowTitle() {
        return Swift_inviteWhatsAppRowTitle(getSwift_peer());
    }

    public final String getInvitesSectionTitle() {
        return Swift_invitesSectionTitle(getSwift_peer());
    }

    public final EError getLoadError() {
        return Swift_loadError(getSwift_peer());
    }

    public final String getMessagesSectionTitle() {
        return Swift_messagesSectionTitle(getSwift_peer());
    }

    public final String getMuteSquadActionTitle() {
        return Swift_muteSquadActionTitle(getSwift_peer());
    }

    public final URI getNavAvatarUrl() {
        return Swift_navAvatarUrl(getSwift_peer());
    }

    public final String getNavTitle() {
        return Swift_navTitle(getSwift_peer());
    }

    public final String getNavUserId() {
        return Swift_navUserId(getSwift_peer());
    }

    public final String getNavUsername() {
        return Swift_navUsername(getSwift_peer());
    }

    public final int getPendingInvitesCount() {
        return Swift_pendingInvitesCount(getSwift_peer());
    }

    public final int getRequestsCount() {
        return Swift_requestsCount(getSwift_peer());
    }

    public final String getRequestsTitle() {
        return Swift_requestsTitle(getSwift_peer());
    }

    public final List<SquadsListRowPresentation> getRowPresentations() {
        return Swift_rowPresentations(getSwift_peer());
    }

    public final String getSearchUsersPlaceholder() {
        return Swift_searchUsersPlaceholder(getSwift_peer());
    }

    public final boolean getShowsCreateSquadRow() {
        return Swift_showsCreateSquadRow(getSwift_peer());
    }

    public final boolean getShowsNavBar() {
        return Swift_showsNavBar(getSwift_peer());
    }

    public final boolean getShowsReferralInfo() {
        return Swift_showsReferralInfo(getSwift_peer());
    }

    public final boolean getShowsTeamsSection() {
        return Swift_showsTeamsSection(getSwift_peer());
    }

    public final String getSquadsListSectionTitle() {
        return Swift_squadsListSectionTitle(getSwift_peer());
    }

    public final String getSquadsSectionTitle() {
        return Swift_squadsSectionTitle(getSwift_peer());
    }

    public final List<SquadsTeamChatRowPresentation> getTeamChatRowPresentations() {
        return Swift_teamChatRowPresentations(getSwift_peer());
    }

    public final String getTeamsSectionTitle() {
        return Swift_teamsSectionTitle(getSwift_peer());
    }

    public final String getTutorialTitle() {
        return Swift_tutorialTitle(getSwift_peer());
    }

    public final String getUnfavoriteTeamChatActionTitle() {
        return Swift_unfavoriteTeamChatActionTitle(getSwift_peer());
    }

    public final String getUnmuteSquadActionTitle() {
        return Swift_unmuteSquadActionTitle(getSwift_peer());
    }

    public final boolean isAcceptingInvite() {
        return Swift_isAcceptingInvite(getSwift_peer());
    }

    public final boolean isCreatingSquad() {
        return Swift_isCreatingSquad(getSwift_peer());
    }

    public final boolean isInviteCardDismissed() {
        return Swift_isInviteCardDismissed(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final boolean isTutorialAvailable() {
        return Swift_isTutorialAvailable(getSwift_peer());
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public Object performLoad(ReloadReason reloadReason, Continuation<? super Unit> continuation) {
        Object run = Async.INSTANCE.run(new USSquadsViewModel$performLoad$2(this, reloadReason, null), continuation);
        if (run == u85.COROUTINE_SUSPENDED) {
            return run;
        }
        return Unit.INSTANCE;
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_5(getSwift_peer(), input);
    }

    public final void setCallbacks(Callbacks callbacks) {
        callbacks.getClass();
        Swift_setCallbacks_6(getSwift_peer(), callbacks);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_3(getSwift_peer());
    }

    public final String teamChatFallbackSubtitle(ESportsTeam for_) {
        for_.getClass();
        return Swift_teamChatFallbackSubtitle_0(getSwift_peer(), for_);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 ,2\u00020\u0001:\u001c\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u001b-./0123456789:;<=>?@ABCDEFG¨\u0006H"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnViewDidAppearCase", "OnViewWillDisappearCase", "OnPullToRefreshCase", "OnRetryCase", "OnGroupSelectedCase", "OnInviteJoinTappedCase", "OnCreateSquadCase", "OnOpenComposeCase", "OnInviteCardTappedCase", "OnReferralInfoTappedCase", "OnDismissInviteCardCase", "OnInviteChannelTappedCase", "OnMarkDraftSquadCase", "OnCommitDraftSquadCase", "OnDiscardDraftSquadCase", "OnViewInvitesCase", "OnOpenSettingsCase", "OnShowTutorialCase", "OnConfirmAcceptInviteCase", "OnConfirmDeclineInviteCase", "OnTeamChatSelectedCase", "OnHideTeamChatCase", "OnUnfavoriteTeamChatCase", "OnMuteSquadCase", "OnUnmuteSquadCase", "OnFollowTeamsCase", "Companion", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnCommitDraftSquadCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnConfirmAcceptInviteCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnConfirmDeclineInviteCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnCreateSquadCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnDiscardDraftSquadCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnDismissInviteCardCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnFollowTeamsCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnGroupSelectedCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnHideTeamChatCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnInviteCardTappedCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnInviteChannelTappedCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnInviteJoinTappedCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnMarkDraftSquadCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnMuteSquadCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnOpenComposeCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnOpenSettingsCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnPullToRefreshCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnReferralInfoTappedCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnShowTutorialCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnTeamChatSelectedCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnUnfavoriteTeamChatCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnUnmuteSquadCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnViewDidAppearCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnViewInvitesCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnViewWillDisappearCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onViewDidAppear = new OnViewDidAppearCase();
        private static final Input onViewWillDisappear = new OnViewWillDisappearCase();
        private static final Input onPullToRefresh = new OnPullToRefreshCase();
        private static final Input onRetry = new OnRetryCase();
        private static final Input onCreateSquad = new OnCreateSquadCase();
        private static final Input onOpenCompose = new OnOpenComposeCase();
        private static final Input onInviteCardTapped = new OnInviteCardTappedCase();
        private static final Input onReferralInfoTapped = new OnReferralInfoTappedCase();
        private static final Input onDismissInviteCard = new OnDismissInviteCardCase();
        private static final Input onViewInvites = new OnViewInvitesCase();
        private static final Input onOpenSettings = new OnOpenSettingsCase();
        private static final Input onFollowTeams = new OnFollowTeamsCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnCommitDraftSquadCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "associated0", "Lcom/polymarket/data/ESquad;", "<init>", "(Lcom/polymarket/data/ESquad;)V", "getAssociated0", "()Lcom/polymarket/data/ESquad;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnCommitDraftSquadCase extends Input {
            private final ESquad associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnCommitDraftSquadCase(ESquad eSquad) {
                super(null);
                eSquad.getClass();
                this.associated0 = eSquad;
            }

            public final ESquad getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnConfirmAcceptInviteCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "associated0", "Lcom/polymarket/data/ESquadReceivedInvitation;", "<init>", "(Lcom/polymarket/data/ESquadReceivedInvitation;)V", "getAssociated0", "()Lcom/polymarket/data/ESquadReceivedInvitation;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnConfirmAcceptInviteCase extends Input {
            private final ESquadReceivedInvitation associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnConfirmAcceptInviteCase(ESquadReceivedInvitation eSquadReceivedInvitation) {
                super(null);
                eSquadReceivedInvitation.getClass();
                this.associated0 = eSquadReceivedInvitation;
            }

            public final ESquadReceivedInvitation getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnConfirmDeclineInviteCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "associated0", "Lcom/polymarket/data/ESquadReceivedInvitation;", "<init>", "(Lcom/polymarket/data/ESquadReceivedInvitation;)V", "getAssociated0", "()Lcom/polymarket/data/ESquadReceivedInvitation;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnConfirmDeclineInviteCase extends Input {
            private final ESquadReceivedInvitation associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnConfirmDeclineInviteCase(ESquadReceivedInvitation eSquadReceivedInvitation) {
                super(null);
                eSquadReceivedInvitation.getClass();
                this.associated0 = eSquadReceivedInvitation;
            }

            public final ESquadReceivedInvitation getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnCreateSquadCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnCreateSquadCase extends Input {
            public OnCreateSquadCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnDiscardDraftSquadCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "associated0", "Lcom/polymarket/data/ESquad;", "<init>", "(Lcom/polymarket/data/ESquad;)V", "getAssociated0", "()Lcom/polymarket/data/ESquad;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDiscardDraftSquadCase extends Input {
            private final ESquad associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnDiscardDraftSquadCase(ESquad eSquad) {
                super(null);
                eSquad.getClass();
                this.associated0 = eSquad;
            }

            public final ESquad getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnDismissInviteCardCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDismissInviteCardCase extends Input {
            public OnDismissInviteCardCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnFollowTeamsCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnFollowTeamsCase extends Input {
            public OnFollowTeamsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnGroupSelectedCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "associated0", "Lcom/polymarket/data/ESquad;", "<init>", "(Lcom/polymarket/data/ESquad;)V", "getAssociated0", "()Lcom/polymarket/data/ESquad;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnGroupSelectedCase extends Input {
            private final ESquad associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnGroupSelectedCase(ESquad eSquad) {
                super(null);
                eSquad.getClass();
                this.associated0 = eSquad;
            }

            public final ESquad getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnHideTeamChatCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "associated0", "Lcom/polymarket/data/ESportsTeam;", "<init>", "(Lcom/polymarket/data/ESportsTeam;)V", "getAssociated0", "()Lcom/polymarket/data/ESportsTeam;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnHideTeamChatCase extends Input {
            private final ESportsTeam associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnHideTeamChatCase(ESportsTeam eSportsTeam) {
                super(null);
                eSportsTeam.getClass();
                this.associated0 = eSportsTeam;
            }

            public final ESportsTeam getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnInviteCardTappedCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnInviteCardTappedCase extends Input {
            public OnInviteCardTappedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnInviteChannelTappedCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/SquadsInviteChannel;", "<init>", "(Lcom/polymarket/usviewmodels/SquadsInviteChannel;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/SquadsInviteChannel;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnInviteChannelTappedCase extends Input {
            private final SquadsInviteChannel associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnInviteChannelTappedCase(SquadsInviteChannel squadsInviteChannel) {
                super(null);
                squadsInviteChannel.getClass();
                this.associated0 = squadsInviteChannel;
            }

            public final SquadsInviteChannel getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnInviteJoinTappedCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "associated0", "Lcom/polymarket/data/ESquadReceivedInvitation;", "<init>", "(Lcom/polymarket/data/ESquadReceivedInvitation;)V", "getAssociated0", "()Lcom/polymarket/data/ESquadReceivedInvitation;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnInviteJoinTappedCase extends Input {
            private final ESquadReceivedInvitation associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnInviteJoinTappedCase(ESquadReceivedInvitation eSquadReceivedInvitation) {
                super(null);
                eSquadReceivedInvitation.getClass();
                this.associated0 = eSquadReceivedInvitation;
            }

            public final ESquadReceivedInvitation getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnMarkDraftSquadCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "associated0", "Lcom/polymarket/data/ESquad;", "<init>", "(Lcom/polymarket/data/ESquad;)V", "getAssociated0", "()Lcom/polymarket/data/ESquad;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnMarkDraftSquadCase extends Input {
            private final ESquad associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnMarkDraftSquadCase(ESquad eSquad) {
                super(null);
                eSquad.getClass();
                this.associated0 = eSquad;
            }

            public final ESquad getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnMuteSquadCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "associated0", "Lcom/polymarket/data/ESquad;", "associated1", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MuteDuration;", "<init>", "(Lcom/polymarket/data/ESquad;Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MuteDuration;)V", "getAssociated0", "()Lcom/polymarket/data/ESquad;", "getAssociated1", "()Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MuteDuration;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnMuteSquadCase extends Input {
            private final ESquad associated0;
            private final USSquadsSettingsViewModel.MuteDuration associated1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnMuteSquadCase(ESquad eSquad, USSquadsSettingsViewModel.MuteDuration muteDuration) {
                super(null);
                eSquad.getClass();
                muteDuration.getClass();
                this.associated0 = eSquad;
                this.associated1 = muteDuration;
            }

            public final ESquad getAssociated0() {
                return this.associated0;
            }

            public final USSquadsSettingsViewModel.MuteDuration getAssociated1() {
                return this.associated1;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnOpenComposeCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnOpenComposeCase extends Input {
            public OnOpenComposeCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnOpenSettingsCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnOpenSettingsCase extends Input {
            public OnOpenSettingsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnPullToRefreshCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnPullToRefreshCase extends Input {
            public OnPullToRefreshCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnReferralInfoTappedCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnReferralInfoTappedCase extends Input {
            public OnReferralInfoTappedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnRetryCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRetryCase extends Input {
            public OnRetryCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnShowTutorialCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/USSquadsViewModel$TutorialEntryPoint;", "<init>", "(Lcom/polymarket/usviewmodels/USSquadsViewModel$TutorialEntryPoint;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/USSquadsViewModel$TutorialEntryPoint;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnShowTutorialCase extends Input {
            private final TutorialEntryPoint associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnShowTutorialCase(TutorialEntryPoint tutorialEntryPoint) {
                super(null);
                tutorialEntryPoint.getClass();
                this.associated0 = tutorialEntryPoint;
            }

            public final TutorialEntryPoint getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnTeamChatSelectedCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "associated0", "Lcom/polymarket/data/ESportsTeam;", "<init>", "(Lcom/polymarket/data/ESportsTeam;)V", "getAssociated0", "()Lcom/polymarket/data/ESportsTeam;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnTeamChatSelectedCase extends Input {
            private final ESportsTeam associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnTeamChatSelectedCase(ESportsTeam eSportsTeam) {
                super(null);
                eSportsTeam.getClass();
                this.associated0 = eSportsTeam;
            }

            public final ESportsTeam getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnUnfavoriteTeamChatCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "associated0", "Lcom/polymarket/data/ESportsTeam;", "<init>", "(Lcom/polymarket/data/ESportsTeam;)V", "getAssociated0", "()Lcom/polymarket/data/ESportsTeam;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnUnfavoriteTeamChatCase extends Input {
            private final ESportsTeam associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnUnfavoriteTeamChatCase(ESportsTeam eSportsTeam) {
                super(null);
                eSportsTeam.getClass();
                this.associated0 = eSportsTeam;
            }

            public final ESportsTeam getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnUnmuteSquadCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "associated0", "Lcom/polymarket/data/ESquad;", "<init>", "(Lcom/polymarket/data/ESquad;)V", "getAssociated0", "()Lcom/polymarket/data/ESquad;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnUnmuteSquadCase extends Input {
            private final ESquad associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnUnmuteSquadCase(ESquad eSquad) {
                super(null);
                eSquad.getClass();
                this.associated0 = eSquad;
            }

            public final ESquad getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnViewDidAppearCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidAppearCase extends Input {
            public OnViewDidAppearCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidLoadCase extends Input {
            public OnViewDidLoadCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnViewInvitesCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewInvitesCase extends Input {
            public OnViewInvitesCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$OnViewWillDisappearCase;", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewWillDisappearCase extends Input {
            public OnViewWillDisappearCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnCreateSquad$cp() {
            return onCreateSquad;
        }

        public static final /* synthetic */ Input access$getOnDismissInviteCard$cp() {
            return onDismissInviteCard;
        }

        public static final /* synthetic */ Input access$getOnFollowTeams$cp() {
            return onFollowTeams;
        }

        public static final /* synthetic */ Input access$getOnInviteCardTapped$cp() {
            return onInviteCardTapped;
        }

        public static final /* synthetic */ Input access$getOnOpenCompose$cp() {
            return onOpenCompose;
        }

        public static final /* synthetic */ Input access$getOnOpenSettings$cp() {
            return onOpenSettings;
        }

        public static final /* synthetic */ Input access$getOnPullToRefresh$cp() {
            return onPullToRefresh;
        }

        public static final /* synthetic */ Input access$getOnReferralInfoTapped$cp() {
            return onReferralInfoTapped;
        }

        public static final /* synthetic */ Input access$getOnRetry$cp() {
            return onRetry;
        }

        public static final /* synthetic */ Input access$getOnViewDidAppear$cp() {
            return onViewDidAppear;
        }

        public static final /* synthetic */ Input access$getOnViewDidLoad$cp() {
            return onViewDidLoad;
        }

        public static final /* synthetic */ Input access$getOnViewInvites$cp() {
            return onViewInvites;
        }

        public static final /* synthetic */ Input access$getOnViewWillDisappear$cp() {
            return onViewWillDisappear;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0014J\u000e\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020 J\u000e\u0010!\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\"\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010#\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010(\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020)J\u000e\u0010*\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0014J\u000e\u0010+\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0014J\u000e\u0010,\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020-J\u000e\u0010.\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020-J\u000e\u0010/\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020-J\u0016\u00100\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u00101\u001a\u000202J\u000e\u00103\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0007R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0007R\u0011\u0010\u001d\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0007R\u0011\u0010$\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007R\u0011\u0010&\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0007R\u0011\u00104\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0007¨\u00066"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/USSquadsViewModel$Input;", "onViewDidAppear", "getOnViewDidAppear", "onViewWillDisappear", "getOnViewWillDisappear", "onPullToRefresh", "getOnPullToRefresh", "onRetry", "getOnRetry", "onGroupSelected", "associated0", "Lcom/polymarket/data/ESquad;", "onInviteJoinTapped", "Lcom/polymarket/data/ESquadReceivedInvitation;", "onCreateSquad", "getOnCreateSquad", "onOpenCompose", "getOnOpenCompose", "onInviteCardTapped", "getOnInviteCardTapped", "onReferralInfoTapped", "getOnReferralInfoTapped", "onDismissInviteCard", "getOnDismissInviteCard", "onInviteChannelTapped", "Lcom/polymarket/usviewmodels/SquadsInviteChannel;", "onMarkDraftSquad", "onCommitDraftSquad", "onDiscardDraftSquad", "onViewInvites", "getOnViewInvites", "onOpenSettings", "getOnOpenSettings", "onShowTutorial", "Lcom/polymarket/usviewmodels/USSquadsViewModel$TutorialEntryPoint;", "onConfirmAcceptInvite", "onConfirmDeclineInvite", "onTeamChatSelected", "Lcom/polymarket/data/ESportsTeam;", "onHideTeamChat", "onUnfavoriteTeamChat", "onMuteSquad", "associated1", "Lcom/polymarket/usviewmodels/USSquadsSettingsViewModel$MuteDuration;", "onUnmuteSquad", "onFollowTeams", "getOnFollowTeams", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnCreateSquad() {
                return Input.access$getOnCreateSquad$cp();
            }

            public final Input getOnDismissInviteCard() {
                return Input.access$getOnDismissInviteCard$cp();
            }

            public final Input getOnFollowTeams() {
                return Input.access$getOnFollowTeams$cp();
            }

            public final Input getOnInviteCardTapped() {
                return Input.access$getOnInviteCardTapped$cp();
            }

            public final Input getOnOpenCompose() {
                return Input.access$getOnOpenCompose$cp();
            }

            public final Input getOnOpenSettings() {
                return Input.access$getOnOpenSettings$cp();
            }

            public final Input getOnPullToRefresh() {
                return Input.access$getOnPullToRefresh$cp();
            }

            public final Input getOnReferralInfoTapped() {
                return Input.access$getOnReferralInfoTapped$cp();
            }

            public final Input getOnRetry() {
                return Input.access$getOnRetry$cp();
            }

            public final Input getOnViewDidAppear() {
                return Input.access$getOnViewDidAppear$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input getOnViewInvites() {
                return Input.access$getOnViewInvites$cp();
            }

            public final Input getOnViewWillDisappear() {
                return Input.access$getOnViewWillDisappear$cp();
            }

            public final Input onCommitDraftSquad(ESquad associated0) {
                associated0.getClass();
                return new OnCommitDraftSquadCase(associated0);
            }

            public final Input onConfirmAcceptInvite(ESquadReceivedInvitation associated0) {
                associated0.getClass();
                return new OnConfirmAcceptInviteCase(associated0);
            }

            public final Input onConfirmDeclineInvite(ESquadReceivedInvitation associated0) {
                associated0.getClass();
                return new OnConfirmDeclineInviteCase(associated0);
            }

            public final Input onDiscardDraftSquad(ESquad associated0) {
                associated0.getClass();
                return new OnDiscardDraftSquadCase(associated0);
            }

            public final Input onGroupSelected(ESquad associated0) {
                associated0.getClass();
                return new OnGroupSelectedCase(associated0);
            }

            public final Input onHideTeamChat(ESportsTeam associated0) {
                associated0.getClass();
                return new OnHideTeamChatCase(associated0);
            }

            public final Input onInviteChannelTapped(SquadsInviteChannel associated0) {
                associated0.getClass();
                return new OnInviteChannelTappedCase(associated0);
            }

            public final Input onInviteJoinTapped(ESquadReceivedInvitation associated0) {
                associated0.getClass();
                return new OnInviteJoinTappedCase(associated0);
            }

            public final Input onMarkDraftSquad(ESquad associated0) {
                associated0.getClass();
                return new OnMarkDraftSquadCase(associated0);
            }

            public final Input onMuteSquad(ESquad associated0, USSquadsSettingsViewModel.MuteDuration associated1) {
                associated0.getClass();
                associated1.getClass();
                return new OnMuteSquadCase(associated0, associated1);
            }

            public final Input onShowTutorial(TutorialEntryPoint associated0) {
                associated0.getClass();
                return new OnShowTutorialCase(associated0);
            }

            public final Input onTeamChatSelected(ESportsTeam associated0) {
                associated0.getClass();
                return new OnTeamChatSelectedCase(associated0);
            }

            public final Input onUnfavoriteTeamChat(ESportsTeam associated0) {
                associated0.getClass();
                return new OnUnfavoriteTeamChatCase(associated0);
            }

            public final Input onUnmuteSquad(ESquad associated0) {
                associated0.getClass();
                return new OnUnmuteSquadCase(associated0);
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
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0015B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0016"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$TutorialEntryPoint;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "banner", "navBar", "deepLink", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class TutorialEntryPoint implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ TutorialEntryPoint[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final TutorialEntryPoint banner = new TutorialEntryPoint("banner", 0, "banner", null, 2, null);
        public static final TutorialEntryPoint navBar = new TutorialEntryPoint("navBar", 1, "navBar", null, 2, null);
        public static final TutorialEntryPoint deepLink = new TutorialEntryPoint("deepLink", 2, "deepLink", null, 2, null);

        private static final /* synthetic */ TutorialEntryPoint[] $values() {
            return new TutorialEntryPoint[]{banner, navBar, deepLink};
        }

        static {
            TutorialEntryPoint[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ TutorialEntryPoint(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static TutorialEntryPoint valueOf(String str) {
            return (TutorialEntryPoint) Enum.valueOf(TutorialEntryPoint.class, str);
        }

        public static TutorialEntryPoint[] values() {
            return (TutorialEntryPoint[]) $VALUES.clone();
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
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$TutorialEntryPoint$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usviewmodels/USSquadsViewModel$TutorialEntryPoint;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final TutorialEntryPoint init(String rawValue) {
                rawValue.getClass();
                int hashCode = rawValue.hashCode();
                if (hashCode != -1396342996) {
                    if (hashCode != -1052597264) {
                        if (hashCode == 628280070 && rawValue.equals("deepLink")) {
                            return TutorialEntryPoint.deepLink;
                        }
                        return null;
                    }
                    if (rawValue.equals("navBar")) {
                        return TutorialEntryPoint.navBar;
                    }
                    return null;
                }
                if (rawValue.equals("banner")) {
                    return TutorialEntryPoint.banner;
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

        private TutorialEntryPoint(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0082 J\u0006\u0010\t\u001a\u00020\nJ\t\u0010\u000b\u001a\u00020\nH\u0082 J\u0010\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_2", "", "Lskip/bridge/SwiftObjectPointer;", "callbacks", "Lcom/polymarket/usviewmodels/USSquadsViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/USSquadsViewModel;", "Swift_Companion_mock_7", "TutorialEntryPoint", "Lcom/polymarket/usviewmodels/USSquadsViewModel$TutorialEntryPoint;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_2(Callbacks callbacks);

        private final native USSquadsViewModel Swift_Companion_mock_7();

        public static final /* synthetic */ long access$Swift_Companion_constructor_2(Companion companion, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_2(callbacks);
        }

        public final TutorialEntryPoint TutorialEntryPoint(String rawValue) {
            rawValue.getClass();
            return TutorialEntryPoint.INSTANCE.init(rawValue);
        }

        public final USSquadsViewModel mock() {
            return Swift_Companion_mock_7();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USSquadsViewModel(Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_2(INSTANCE, callbacks), (SwiftPeerMarker) null);
        callbacks.getClass();
    }

    public USSquadsViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b#\b\u0007\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0001QB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u009b\u0002\b\u0016\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0012\u0012 \b\u0002\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u0014\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u0012\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u0012\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u0012\u0012\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\b\u0010#J\u0006\u0010(\u001a\u00020\rJ\u0015\u0010)\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0096\u0002J\b\u0010.\u001a\u00020/H\u0016J!\u00102\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u00106\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u00109\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J-\u0010<\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u00142\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010>\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010@\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010D\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010J\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0085\u0002\u0010M\u001a\u00060\u0004j\u0002`\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u001e\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u000bH\u0082 J\u0016\u0010N\u001a\b\u0012\u0004\u0012\u00020-0\u00122\u0006\u0010O\u001a\u00020/H\u0016J\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020-0\u00122\u0006\u0010O\u001a\u00020/H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b3\u00101R\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\b5\u00101R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00128F¢\u0006\u0006\u001a\u0004\b7\u00108R)\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u00148F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00128F¢\u0006\u0006\u001a\u0004\b=\u00108R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u00128F¢\u0006\u0006\u001a\u0004\b?\u00108R\u001d\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\bA\u00101R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u00128F¢\u0006\u0006\u001a\u0004\bC\u00108R\u001d\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\bE\u00101R\u001d\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\bG\u00101R\u001d\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\bI\u00101R\u001d\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u000b8F¢\u0006\u0006\u001a\u0004\bK\u00101¨\u0006R"}, d2 = {"Lcom/polymarket/usviewmodels/USSquadsViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onGroupSelected", "Lkotlin/Function1;", "Lcom/polymarket/usviewmodels/SquadsChatViewModelPreamble;", "", "onInviteJoinTapped", "Lcom/polymarket/data/ESquadReceivedInvitation;", "onSquadCreated", "onOpenCompose", "Lkotlin/Function0;", "onInviteChannelSelected", "Lkotlin/Function3;", "Lcom/polymarket/data/ESquad;", "Lcom/polymarket/usviewmodels/SquadsInviteChannel;", "", "onShowInviteFriends", "onViewInvites", "onInviteAccepted", "onOpenSettings", "onShowReferralDetails", "Lcom/polymarket/data/EReferrals;", "onShowTutorial", "Lcom/polymarket/data/ESquadsTutorialConfig;", "onTeamChatSelected", "Lcom/polymarket/data/ESportsTeam;", "onFollowTeams", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnGroupSelected", "()Lkotlin/jvm/functions/Function1;", "Swift_onGroupSelected", "getOnInviteJoinTapped", "Swift_onInviteJoinTapped", "getOnSquadCreated", "Swift_onSquadCreated", "getOnOpenCompose", "()Lkotlin/jvm/functions/Function0;", "Swift_onOpenCompose", "getOnInviteChannelSelected", "()Lkotlin/jvm/functions/Function3;", "Swift_onInviteChannelSelected", "getOnShowInviteFriends", "Swift_onShowInviteFriends", "getOnViewInvites", "Swift_onViewInvites", "getOnInviteAccepted", "Swift_onInviteAccepted", "getOnOpenSettings", "Swift_onOpenSettings", "getOnShowReferralDetails", "Swift_onShowReferralDetails", "getOnShowTutorial", "Swift_onShowTutorial", "getOnTeamChatSelected", "Swift_onTeamChatSelected", "getOnFollowTeams", "Swift_onFollowTeams", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Callbacks(Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function3 function3, Function0 function02, Function0 function03, Function1 function14, Function0 function04, Function1 function15, Function1 function16, Function1 function17, Function1 function18, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(function1, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r28);
            Function1 function19;
            Function1 function110;
            Function0 function05;
            Function3 function32;
            Function0 function06;
            Function0 function07;
            Function1 function111;
            Function0 function08;
            Function1 function112;
            Function1 function113;
            Function1 function114;
            Function1 function115;
            function1 = (i & 1) != 0 ? new hrj(6) : function1;
            if ((i & 2) != 0) {
                function19 = new hrj(12);
            } else {
                function19 = function12;
            }
            if ((i & 4) != 0) {
                function110 = new hrj(13);
            } else {
                function110 = function13;
            }
            if ((i & 8) != 0) {
                function05 = new hoj(22);
            } else {
                function05 = function0;
            }
            if ((i & 16) != 0) {
                function32 = new unj(11);
            } else {
                function32 = function3;
            }
            if ((i & 32) != 0) {
                function06 = new hoj(23);
            } else {
                function06 = function02;
            }
            if ((i & 64) != 0) {
                function07 = new hoj(24);
            } else {
                function07 = function03;
            }
            if ((i & 128) != 0) {
                function111 = new hrj(7);
            } else {
                function111 = function14;
            }
            if ((i & 256) != 0) {
                function08 = new hoj(21);
            } else {
                function08 = function04;
            }
            if ((i & Barcode.FORMAT_UPC_A) != 0) {
                function112 = new hrj(8);
            } else {
                function112 = function15;
            }
            if ((i & Barcode.FORMAT_UPC_E) != 0) {
                function113 = new hrj(9);
            } else {
                function113 = function16;
            }
            if ((i & 2048) != 0) {
                function114 = new hrj(10);
            } else {
                function114 = function17;
            }
            if ((i & 4096) != 0) {
                function115 = new hrj(11);
            } else {
                function115 = function18;
            }
        }

        private final native long Swift_constructor_0(Function1<? super SquadsChatViewModelPreamble, Unit> onGroupSelected, Function1<? super ESquadReceivedInvitation, Unit> onInviteJoinTapped, Function1<? super SquadsChatViewModelPreamble, Unit> onSquadCreated, Function0<Unit> onOpenCompose, Function3<? super ESquad, ? super SquadsInviteChannel, ? super String, Unit> onInviteChannelSelected, Function0<Unit> onShowInviteFriends, Function0<Unit> onViewInvites, Function1<? super SquadsChatViewModelPreamble, Unit> onInviteAccepted, Function0<Unit> onOpenSettings, Function1<? super EReferrals, Unit> onShowReferralDetails, Function1<? super ESquadsTutorialConfig, Unit> onShowTutorial, Function1<? super ESportsTeam, Unit> onTeamChatSelected, Function1<? super String, Unit> onFollowTeams);

        private final native Function1<String, Unit> Swift_onFollowTeams(long Swift_peer);

        private final native Function1<SquadsChatViewModelPreamble, Unit> Swift_onGroupSelected(long Swift_peer);

        private final native Function1<SquadsChatViewModelPreamble, Unit> Swift_onInviteAccepted(long Swift_peer);

        private final native Function3<ESquad, SquadsInviteChannel, String, Unit> Swift_onInviteChannelSelected(long Swift_peer);

        private final native Function1<ESquadReceivedInvitation, Unit> Swift_onInviteJoinTapped(long Swift_peer);

        private final native Function0<Unit> Swift_onOpenCompose(long Swift_peer);

        private final native Function0<Unit> Swift_onOpenSettings(long Swift_peer);

        private final native Function0<Unit> Swift_onShowInviteFriends(long Swift_peer);

        private final native Function1<EReferrals, Unit> Swift_onShowReferralDetails(long Swift_peer);

        private final native Function1<ESquadsTutorialConfig, Unit> Swift_onShowTutorial(long Swift_peer);

        private final native Function1<SquadsChatViewModelPreamble, Unit> Swift_onSquadCreated(long Swift_peer);

        private final native Function1<ESportsTeam, Unit> Swift_onTeamChatSelected(long Swift_peer);

        private final native Function0<Unit> Swift_onViewInvites(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0(SquadsChatViewModelPreamble squadsChatViewModelPreamble) {
            squadsChatViewModelPreamble.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1(ESquadReceivedInvitation eSquadReceivedInvitation) {
            eSquadReceivedInvitation.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$10(ESquadsTutorialConfig eSquadsTutorialConfig) {
            eSquadsTutorialConfig.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$11(ESportsTeam eSportsTeam) {
            eSportsTeam.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$12(String str) {
            str.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2(SquadsChatViewModelPreamble squadsChatViewModelPreamble) {
            squadsChatViewModelPreamble.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$3() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$4(ESquad eSquad, SquadsInviteChannel squadsInviteChannel, String str) {
            eSquad.getClass();
            squadsInviteChannel.getClass();
            str.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$5() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$6() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$7(SquadsChatViewModelPreamble squadsChatViewModelPreamble) {
            squadsChatViewModelPreamble.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$8() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$9(EReferrals eReferrals) {
            eReferrals.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a(ESquadsTutorialConfig eSquadsTutorialConfig) {
            return _init_$lambda$10(eSquadsTutorialConfig);
        }

        public static /* synthetic */ Unit b() {
            return _init_$lambda$5();
        }

        public static /* synthetic */ Unit c(EReferrals eReferrals) {
            return _init_$lambda$9(eReferrals);
        }

        public static /* synthetic */ Unit d(String str) {
            return _init_$lambda$12(str);
        }

        public static /* synthetic */ Unit e(ESquadReceivedInvitation eSquadReceivedInvitation) {
            return _init_$lambda$1(eSquadReceivedInvitation);
        }

        public static /* synthetic */ Unit f() {
            return _init_$lambda$6();
        }

        public static /* synthetic */ Unit g() {
            return _init_$lambda$8();
        }

        public static /* synthetic */ Unit h(ESportsTeam eSportsTeam) {
            return _init_$lambda$11(eSportsTeam);
        }

        public static /* synthetic */ Unit i(SquadsChatViewModelPreamble squadsChatViewModelPreamble) {
            return _init_$lambda$7(squadsChatViewModelPreamble);
        }

        public static /* synthetic */ Unit j(SquadsChatViewModelPreamble squadsChatViewModelPreamble) {
            return _init_$lambda$2(squadsChatViewModelPreamble);
        }

        public static /* synthetic */ Unit k(ESquad eSquad, SquadsInviteChannel squadsInviteChannel, String str) {
            return _init_$lambda$4(eSquad, squadsInviteChannel, str);
        }

        public static /* synthetic */ Unit l() {
            return _init_$lambda$3();
        }

        public static /* synthetic */ Unit m(SquadsChatViewModelPreamble squadsChatViewModelPreamble) {
            return _init_$lambda$0(squadsChatViewModelPreamble);
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

        public final Function1<String, Unit> getOnFollowTeams() {
            return Swift_onFollowTeams(this.Swift_peer);
        }

        public final Function1<SquadsChatViewModelPreamble, Unit> getOnGroupSelected() {
            return Swift_onGroupSelected(this.Swift_peer);
        }

        public final Function1<SquadsChatViewModelPreamble, Unit> getOnInviteAccepted() {
            return Swift_onInviteAccepted(this.Swift_peer);
        }

        public final Function3<ESquad, SquadsInviteChannel, String, Unit> getOnInviteChannelSelected() {
            return Swift_onInviteChannelSelected(this.Swift_peer);
        }

        public final Function1<ESquadReceivedInvitation, Unit> getOnInviteJoinTapped() {
            return Swift_onInviteJoinTapped(this.Swift_peer);
        }

        public final Function0<Unit> getOnOpenCompose() {
            return Swift_onOpenCompose(this.Swift_peer);
        }

        public final Function0<Unit> getOnOpenSettings() {
            return Swift_onOpenSettings(this.Swift_peer);
        }

        public final Function0<Unit> getOnShowInviteFriends() {
            return Swift_onShowInviteFriends(this.Swift_peer);
        }

        public final Function1<EReferrals, Unit> getOnShowReferralDetails() {
            return Swift_onShowReferralDetails(this.Swift_peer);
        }

        public final Function1<ESquadsTutorialConfig, Unit> getOnShowTutorial() {
            return Swift_onShowTutorial(this.Swift_peer);
        }

        public final Function1<SquadsChatViewModelPreamble, Unit> getOnSquadCreated() {
            return Swift_onSquadCreated(this.Swift_peer);
        }

        public final Function1<ESportsTeam, Unit> getOnTeamChatSelected() {
            return Swift_onTeamChatSelected(this.Swift_peer);
        }

        public final Function0<Unit> getOnViewInvites() {
            return Swift_onViewInvites(this.Swift_peer);
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

        public Callbacks(Function1<? super SquadsChatViewModelPreamble, Unit> function1, Function1<? super ESquadReceivedInvitation, Unit> function12, Function1<? super SquadsChatViewModelPreamble, Unit> function13, Function0<Unit> function0, Function3<? super ESquad, ? super SquadsInviteChannel, ? super String, Unit> function3, Function0<Unit> function02, Function0<Unit> function03, Function1<? super SquadsChatViewModelPreamble, Unit> function14, Function0<Unit> function04, Function1<? super EReferrals, Unit> function15, Function1<? super ESquadsTutorialConfig, Unit> function16, Function1<? super ESportsTeam, Unit> function17, Function1<? super String, Unit> function18) {
            function1.getClass();
            function12.getClass();
            function13.getClass();
            function0.getClass();
            function3.getClass();
            function02.getClass();
            function03.getClass();
            function14.getClass();
            function04.getClass();
            function15.getClass();
            function16.getClass();
            function17.getClass();
            function18.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function1, function12, function13, function0, function3, function02, function03, function14, function04, function15, function16, function17, function18);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
