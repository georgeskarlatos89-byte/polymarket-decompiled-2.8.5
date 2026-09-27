package skip.lib;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.akj;
import defpackage.av1;
import defpackage.bd0;
import defpackage.dmk;
import defpackage.ekj;
import defpackage.gkj;
import defpackage.h88;
import defpackage.hkj;
import defpackage.htb;
import defpackage.lkj;
import defpackage.ozm;
import defpackage.q5h;
import defpackage.rx6;
import defpackage.tjj;
import defpackage.u0a;
import defpackage.usj;
import defpackage.vsj;
import defpackage.y74;
import defpackage.ytb;
import defpackage.z74;
import io.intercom.android.sdk.models.AttributeType;
import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ranges.IntRange;
import kotlin.text.i;
import okhttp3.internal.ws.WebSocketProtocol;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\bQ\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0019\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\u0007\u001a\u00020\u000b*\u00020\t2\u0006\u0010\u0002\u001a\u00020\n2\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\f\u001a+\u0010\u0007\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\u000f\u001a+\u0010\u0007\u001a\u00020\u0011*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\n2\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\u0012\u001a+\u0010\u0007\u001a\u00020\u0014*\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\u0015\u001a+\u0010\u0007\u001a\u00020\u0017*\u00020\u00162\u0006\u0010\u0002\u001a\u00020\n2\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\u0018\u001a+\u0010\u0007\u001a\u00020\u001b*\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u001a2\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\u001c\u001a+\u0010\u0007\u001a\u00020\u001f*\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001e2\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010 \u001a\u001f\u0010\u0007\u001a\u00020#*\u00020!2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020#0\"¢\u0006\u0004\b\u0007\u0010$\u001a\u0011\u0010%\u001a\u00020#*\u00020#¢\u0006\u0004\b%\u0010&\u001a\u0019\u0010%\u001a\u00020#*\u00020#2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b%\u0010)\u001a\u001f\u0010\u0007\u001a\u00020+*\u00020*2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020+0\"¢\u0006\u0004\b\u0007\u0010,\u001a\u0011\u0010%\u001a\u00020+*\u00020+¢\u0006\u0004\b%\u0010-\u001a\u0019\u0010%\u001a\u00020+*\u00020+2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b%\u0010.\u001a\u0015\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102\u001a\u0015\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u000b¢\u0006\u0004\b3\u00104\u001a\u0015\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0011¢\u0006\u0004\b5\u00106\u001a\u0015\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0017¢\u0006\u0004\b7\u00108\u001a\u0015\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u001f¢\u0006\u0004\b9\u0010:\u001a\u0017\u00101\u001a\u0004\u0018\u00010\u00062\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b1\u0010=\u001a\u0015\u0010>\u001a\u00020\u000e2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b>\u0010?\u001a\u0015\u0010>\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u000b¢\u0006\u0004\b@\u0010A\u001a\u0015\u0010>\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u0011¢\u0006\u0004\bB\u0010C\u001a\u0015\u0010>\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u0017¢\u0006\u0004\bD\u0010E\u001a\u0015\u0010>\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u001f¢\u0006\u0004\bF\u0010G\u001a\u0017\u0010>\u001a\u0004\u0018\u00010\u000e2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b>\u0010H\u001a\u0015\u0010I\u001a\u00020\u00142\u0006\u00100\u001a\u00020/¢\u0006\u0004\bI\u0010J\u001a\u0015\u0010I\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u000b¢\u0006\u0004\bK\u0010L\u001a\u0015\u0010I\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u0011¢\u0006\u0004\bM\u0010N\u001a\u0015\u0010I\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u0017¢\u0006\u0004\bO\u0010P\u001a\u0015\u0010I\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u001f¢\u0006\u0004\bQ\u0010R\u001a\u0017\u0010I\u001a\u0004\u0018\u00010\u00142\u0006\u0010<\u001a\u00020;¢\u0006\u0004\bI\u0010S\u001a\u0015\u0010T\u001a\u00020\u001b2\u0006\u00100\u001a\u00020/¢\u0006\u0004\bT\u0010U\u001a\u0015\u0010T\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u000b¢\u0006\u0004\bV\u0010W\u001a\u0015\u0010T\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u0011¢\u0006\u0004\bX\u0010Y\u001a\u0015\u0010T\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u0017¢\u0006\u0004\bZ\u0010[\u001a\u0015\u0010T\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u001f¢\u0006\u0004\b\\\u0010]\u001a\u0017\u0010T\u001a\u0004\u0018\u00010\u001b2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\bT\u0010^\u001a\u0015\u0010_\u001a\u00020\u000b2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b_\u00102\u001a\u0015\u0010_\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000b¢\u0006\u0004\b`\u00104\u001a\u0015\u0010_\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u0011¢\u0006\u0004\ba\u00106\u001a\u0015\u0010_\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u0017¢\u0006\u0004\bb\u00108\u001a\u0015\u0010_\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u001f¢\u0006\u0004\bc\u0010:\u001a\u0017\u0010_\u001a\u0004\u0018\u00010\u000b2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b_\u0010d\u001a\u0015\u0010e\u001a\u00020\u00112\u0006\u00100\u001a\u00020/¢\u0006\u0004\be\u0010?\u001a\u0015\u0010e\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u000b¢\u0006\u0004\bf\u0010A\u001a\u0015\u0010e\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0011¢\u0006\u0004\bg\u0010C\u001a\u0015\u0010e\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0017¢\u0006\u0004\bh\u0010E\u001a\u0015\u0010e\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u001f¢\u0006\u0004\bi\u0010G\u001a\u0017\u0010e\u001a\u0004\u0018\u00010\u00112\u0006\u0010<\u001a\u00020;¢\u0006\u0004\be\u0010j\u001a\u0015\u0010k\u001a\u00020\u00172\u0006\u00100\u001a\u00020/¢\u0006\u0004\bk\u0010J\u001a\u0015\u0010k\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u000b¢\u0006\u0004\bl\u0010L\u001a\u0015\u0010k\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u0011¢\u0006\u0004\bm\u0010N\u001a\u0015\u0010k\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u0017¢\u0006\u0004\bn\u0010P\u001a\u0015\u0010k\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u001f¢\u0006\u0004\bo\u0010R\u001a\u0017\u0010k\u001a\u0004\u0018\u00010\u00172\u0006\u0010<\u001a\u00020;¢\u0006\u0004\bk\u0010p\u001a\u0015\u0010q\u001a\u00020\u001f2\u0006\u00100\u001a\u00020/¢\u0006\u0004\bq\u0010U\u001a\u0015\u0010q\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u000b¢\u0006\u0004\br\u0010W\u001a\u0015\u0010q\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u0011¢\u0006\u0004\bs\u0010Y\u001a\u0015\u0010q\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u0017¢\u0006\u0004\bt\u0010[\u001a\u0015\u0010q\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u001f¢\u0006\u0004\bu\u0010]\u001a\u0017\u0010q\u001a\u0004\u0018\u00010\u001f2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\bq\u0010v\u001a\u0015\u0010w\u001a\u00020+2\u0006\u00100\u001a\u00020/¢\u0006\u0004\bw\u0010x\u001a\u0015\u0010w\u001a\u00020+2\u0006\u00100\u001a\u00020\u000b¢\u0006\u0004\by\u0010z\u001a\u0015\u0010w\u001a\u00020+2\u0006\u00100\u001a\u00020\u0011¢\u0006\u0004\b{\u0010|\u001a\u0015\u0010w\u001a\u00020+2\u0006\u00100\u001a\u00020\u0017¢\u0006\u0004\b}\u0010~\u001a\u0016\u0010w\u001a\u00020+2\u0006\u00100\u001a\u00020\u001f¢\u0006\u0005\b\u007f\u0010\u0080\u0001\u001a\u0018\u0010w\u001a\u0004\u0018\u00010+2\u0006\u0010<\u001a\u00020;¢\u0006\u0005\bw\u0010\u0081\u0001\u001a\u0018\u0010\u0082\u0001\u001a\u00020#2\u0006\u00100\u001a\u00020/¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0018\u0010\u0082\u0001\u001a\u00020#2\u0006\u00100\u001a\u00020\u000b¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0018\u0010\u0082\u0001\u001a\u00020#2\u0006\u00100\u001a\u00020\u0011¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0018\u0010\u0082\u0001\u001a\u00020#2\u0006\u00100\u001a\u00020\u0017¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0018\u0010\u0082\u0001\u001a\u00020#2\u0006\u00100\u001a\u00020\u001f¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u001a\u0010\u0082\u0001\u001a\u0004\u0018\u00010#2\u0006\u0010<\u001a\u00020;¢\u0006\u0006\b\u0082\u0001\u0010\u008c\u0001\u001a\u001e\u0010\u008f\u0001\u001a\b0\u008d\u0001j\u0003`\u008e\u00012\u0006\u00100\u001a\u00020/¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u001e\u0010\u008f\u0001\u001a\b0\u008d\u0001j\u0003`\u008e\u00012\u0006\u00100\u001a\u00020\u000b¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u001e\u0010\u008f\u0001\u001a\b0\u008d\u0001j\u0003`\u008e\u00012\u0006\u00100\u001a\u00020\u0011¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u001e\u0010\u008f\u0001\u001a\b0\u008d\u0001j\u0003`\u008e\u00012\u0006\u00100\u001a\u00020\u0017¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u001e\u0010\u008f\u0001\u001a\b0\u008d\u0001j\u0003`\u008e\u00012\u0006\u00100\u001a\u00020\u001f¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\"\u0010\u008f\u0001\u001a\f\u0018\u00010\u008d\u0001j\u0005\u0018\u0001`\u008e\u00012\u0006\u0010<\u001a\u00020;¢\u0006\u0006\b\u008f\u0001\u0010\u0099\u0001\"\u001f\u0010\u009a\u0001\u001a\u00020\u001f8\u0006X\u0086D¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u001f\u0010\u009e\u0001\u001a\u00020\u001f8\u0006X\u0086D¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u009b\u0001\u001a\u0006\b\u009f\u0001\u0010\u009d\u0001\"\u001f\u0010 \u0001\u001a\u00020\u001f8\u0006X\u0086D¢\u0006\u0010\n\u0006\b \u0001\u0010\u009b\u0001\u001a\u0006\b¡\u0001\u0010\u009d\u0001\"\u001f\u0010¢\u0001\u001a\u00020\u001f8\u0006X\u0086D¢\u0006\u0010\n\u0006\b¢\u0001\u0010\u009b\u0001\u001a\u0006\b£\u0001\u0010\u009d\u0001\"\u001f\u0010¤\u0001\u001a\u00020\u001f8\u0006X\u0086D¢\u0006\u0010\n\u0006\b¤\u0001\u0010\u009b\u0001\u001a\u0006\b¥\u0001\u0010\u009d\u0001\"\u0018\u0010¨\u0001\u001a\u00020\u0006*\u00020\u00008F¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0018\u0010ª\u0001\u001a\u00020\u0006*\u00020\u00008F¢\u0006\b\u001a\u0006\b©\u0001\u0010§\u0001\"\u0018\u0010¨\u0001\u001a\u00020\u0006*\u00020\t8F¢\u0006\b\u001a\u0006\b¦\u0001\u0010«\u0001\"\u0018\u0010ª\u0001\u001a\u00020\u000b*\u00020\t8F¢\u0006\b\u001a\u0006\b©\u0001\u0010«\u0001\"\u0018\u0010¨\u0001\u001a\u00020\u000e*\u00020\r8F¢\u0006\b\u001a\u0006\b¦\u0001\u0010¬\u0001\"\u0018\u0010ª\u0001\u001a\u00020\u000e*\u00020\r8F¢\u0006\b\u001a\u0006\b©\u0001\u0010¬\u0001\"\u0018\u0010¨\u0001\u001a\u00020\u0011*\u00020\u00108F¢\u0006\b\u001a\u0006\b¦\u0001\u0010\u00ad\u0001\"\u0018\u0010ª\u0001\u001a\u00020\u0011*\u00020\u00108F¢\u0006\b\u001a\u0006\b©\u0001\u0010\u00ad\u0001\"\u0018\u0010¨\u0001\u001a\u00020\u0014*\u00020\u00138F¢\u0006\b\u001a\u0006\b¦\u0001\u0010®\u0001\"\u0018\u0010ª\u0001\u001a\u00020\u0014*\u00020\u00138F¢\u0006\b\u001a\u0006\b©\u0001\u0010®\u0001\"\u0018\u0010¨\u0001\u001a\u00020\u0017*\u00020\u00168F¢\u0006\b\u001a\u0006\b¦\u0001\u0010¯\u0001\"\u0018\u0010ª\u0001\u001a\u00020\u0017*\u00020\u00168F¢\u0006\b\u001a\u0006\b©\u0001\u0010¯\u0001\"\u0018\u0010¨\u0001\u001a\u00020\u001b*\u00020\u00198F¢\u0006\b\u001a\u0006\b¦\u0001\u0010°\u0001\"\u0018\u0010ª\u0001\u001a\u00020\u001b*\u00020\u00198F¢\u0006\b\u001a\u0006\b©\u0001\u0010°\u0001\"\u0018\u0010¨\u0001\u001a\u00020\u001f*\u00020\u001d8F¢\u0006\b\u001a\u0006\b¦\u0001\u0010±\u0001\"\u0018\u0010ª\u0001\u001a\u00020\u001f*\u00020\u001d8F¢\u0006\b\u001a\u0006\b©\u0001\u0010±\u0001\"\u0018\u0010´\u0001\u001a\u00020#*\u00020!8F¢\u0006\b\u001a\u0006\b²\u0001\u0010³\u0001\"\u0019\u0010¶\u0001\u001a\u00030µ\u0001*\u00020#8F¢\u0006\b\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0019\u0010¸\u0001\u001a\u00030µ\u0001*\u00020#8F¢\u0006\b\u001a\u0006\b¸\u0001\u0010·\u0001\"\u0019\u0010¹\u0001\u001a\u00030µ\u0001*\u00020#8F¢\u0006\b\u001a\u0006\b¹\u0001\u0010·\u0001\"\u0018\u0010»\u0001\u001a\u00020#*\u00020!8F¢\u0006\b\u001a\u0006\bº\u0001\u0010³\u0001\"\u0018\u0010½\u0001\u001a\u00020#*\u00020!8F¢\u0006\b\u001a\u0006\b¼\u0001\u0010³\u0001\"\u0018\u0010´\u0001\u001a\u00020+*\u00020*8F¢\u0006\b\u001a\u0006\b²\u0001\u0010¾\u0001\"\u0019\u0010¶\u0001\u001a\u00030µ\u0001*\u00020+8F¢\u0006\b\u001a\u0006\b¶\u0001\u0010¿\u0001\"\u0019\u0010¸\u0001\u001a\u00030µ\u0001*\u00020+8F¢\u0006\b\u001a\u0006\b¸\u0001\u0010¿\u0001\"\u0019\u0010¹\u0001\u001a\u00030µ\u0001*\u00020+8F¢\u0006\b\u001a\u0006\b¹\u0001\u0010¿\u0001\"\u0018\u0010»\u0001\u001a\u00020+*\u00020*8F¢\u0006\b\u001a\u0006\bº\u0001\u0010¾\u0001\"\u0018\u0010½\u0001\u001a\u00020+*\u00020*8F¢\u0006\b\u001a\u0006\b¼\u0001\u0010¾\u0001\"\u0014\u0010Â\u0001\u001a\u00020#8F¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0014\u0010Ä\u0001\u001a\u00020#8F¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Á\u0001\"\u0014\u0010Æ\u0001\u001a\u00020#8F¢\u0006\b\u001a\u0006\bÅ\u0001\u0010Á\u0001\"\u0014\u0010È\u0001\u001a\u00020#8F¢\u0006\b\u001a\u0006\bÇ\u0001\u0010Á\u0001\"\u0014\u0010Ê\u0001\u001a\u00020#8F¢\u0006\b\u001a\u0006\bÉ\u0001\u0010Á\u0001\"\u0014\u0010Ì\u0001\u001a\u00020#8F¢\u0006\b\u001a\u0006\bË\u0001\u0010Á\u0001*\r\u0010Í\u0001\"\u00030\u008d\u00012\u00030\u008d\u0001¨\u0006Î\u0001"}, d2 = {"Lkotlin/Byte$Companion;", "Lkotlin/ranges/IntRange;", "in_", "Lskip/lib/InOut;", "Lskip/lib/RandomNumberGenerator;", "using", "", "random", "(Lav1;Lkotlin/ranges/IntRange;Lskip/lib/InOut;)B", "Ltjj;", "Lekj;", "Lkotlin/UByte;", "(Ltjj;Lekj;Lskip/lib/InOut;)B", "Lkotlin/Short$Companion;", "", "(Lq5h;Lkotlin/ranges/IntRange;Lskip/lib/InOut;)S", "Lusj;", "Lvsj;", "(Lusj;Lekj;Lskip/lib/InOut;)S", "Lkotlin/Int$Companion;", "", "(Lu0a;Lkotlin/ranges/IntRange;Lskip/lib/InOut;)I", "Lakj;", "Lkotlin/UInt;", "(Lakj;Lekj;Lskip/lib/InOut;)I", "Lkotlin/Long$Companion;", "Lytb;", "", "(Lhtb;Lytb;Lskip/lib/InOut;)J", "Lgkj;", "Llkj;", "Lhkj;", "(Lgkj;Llkj;Lskip/lib/InOut;)J", "Lkotlin/Double$Companion;", "Lz74;", "", "(Lrx6;Lz74;)D", "rounded", "(D)D", "Lskip/lib/FloatingPointRoundingRule;", "rule", "(DLskip/lib/FloatingPointRoundingRule;)D", "Lkotlin/Float$Companion;", "", "(Lh88;Lz74;)F", "(F)F", "(FLskip/lib/FloatingPointRoundingRule;)F", "", AttributeType.NUMBER, "Byte", "(Ljava/lang/Number;)B", "Byte-7apg3OU", "(B)B", "Byte-xj2QHRw", "(S)B", "Byte-WZ4Q5Ns", "(I)B", "Byte-VKZWuLQ", "(J)B", "", "string", "(Ljava/lang/String;)Ljava/lang/Byte;", "Short", "(Ljava/lang/Number;)S", "Short-7apg3OU", "(B)S", "Short-xj2QHRw", "(S)S", "Short-WZ4Q5Ns", "(I)S", "Short-VKZWuLQ", "(J)S", "(Ljava/lang/String;)Ljava/lang/Short;", "Int", "(Ljava/lang/Number;)I", "Int-7apg3OU", "(B)I", "Int-xj2QHRw", "(S)I", "Int-WZ4Q5Ns", "(I)I", "Int-VKZWuLQ", "(J)I", "(Ljava/lang/String;)Ljava/lang/Integer;", "Long", "(Ljava/lang/Number;)J", "Long-7apg3OU", "(B)J", "Long-xj2QHRw", "(S)J", "Long-WZ4Q5Ns", "(I)J", "Long-VKZWuLQ", "(J)J", "(Ljava/lang/String;)Ljava/lang/Long;", "UByte", "UByte-7apg3OU", "UByte-xj2QHRw", "UByte-WZ4Q5Ns", "UByte-VKZWuLQ", "(Ljava/lang/String;)Lkotlin/UByte;", "UShort", "UShort-7apg3OU", "UShort-xj2QHRw", "UShort-WZ4Q5Ns", "UShort-VKZWuLQ", "(Ljava/lang/String;)Lvsj;", "UInt", "UInt-7apg3OU", "UInt-xj2QHRw", "UInt-WZ4Q5Ns", "UInt-VKZWuLQ", "(Ljava/lang/String;)Lkotlin/UInt;", "ULong", "ULong-7apg3OU", "ULong-xj2QHRw", "ULong-WZ4Q5Ns", "ULong-VKZWuLQ", "(Ljava/lang/String;)Lhkj;", "Float", "(Ljava/lang/Number;)F", "Float-7apg3OU", "(B)F", "Float-xj2QHRw", "(S)F", "Float-WZ4Q5Ns", "(I)F", "Float-VKZWuLQ", "(J)F", "(Ljava/lang/String;)Ljava/lang/Float;", "Double", "(Ljava/lang/Number;)D", "Double-7apg3OU", "(B)D", "Double-xj2QHRw", "(S)D", "Double-WZ4Q5Ns", "(I)D", "Double-VKZWuLQ", "(J)D", "(Ljava/lang/String;)Ljava/lang/Double;", "Ljava/math/BigInteger;", "Lskip/lib/BigInteger;", "BigIntegerInit", "(Ljava/lang/Number;)Ljava/math/BigInteger;", "BigIntegerInit-7apg3OU", "(B)Ljava/math/BigInteger;", "BigIntegerInit-xj2QHRw", "(S)Ljava/math/BigInteger;", "BigIntegerInit-WZ4Q5Ns", "(I)Ljava/math/BigInteger;", "BigIntegerInit-VKZWuLQ", "(J)Ljava/math/BigInteger;", "(Ljava/lang/String;)Ljava/math/BigInteger;", "MSEC_PER_SEC", "J", "getMSEC_PER_SEC", "()J", "NSEC_PER_SEC", "getNSEC_PER_SEC", "NSEC_PER_MSEC", "getNSEC_PER_MSEC", "USEC_PER_SEC", "getUSEC_PER_SEC", "NSEC_PER_USEC", "getNSEC_PER_USEC", "getMax", "(Lav1;)B", "max", "getMin", "min", "(Ltjj;)B", "(Lq5h;)S", "(Lusj;)S", "(Lu0a;)I", "(Lakj;)I", "(Lhtb;)J", "(Lgkj;)J", "getNan", "(Lrx6;)D", "nan", "", "isNaN", "(D)Z", "isFinite", "isInfinite", "getInfinity", "infinity", "getPi", "pi", "(Lh88;)F", "(F)Z", "getM_E", "()D", "M_E", "getM_LOG2E", "M_LOG2E", "getM_LOG10E", "M_LOG10E", "getM_LN2", "M_LN2", "getM_LN10", "M_LN10", "getM_PI", "M_PI", "BigInteger", "SkipLib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NumbersKt {
    private static final long MSEC_PER_SEC = 1000;
    private static final long NSEC_PER_MSEC = 1000000;
    private static final long NSEC_PER_SEC = 1000000000;
    private static final long NSEC_PER_USEC = 1000;
    private static final long USEC_PER_SEC = 1000000;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FloatingPointRoundingRule.values().length];
            try {
                iArr[FloatingPointRoundingRule.toNearestOrAwayFromZero.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FloatingPointRoundingRule.toNearestOrEven.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FloatingPointRoundingRule.up.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FloatingPointRoundingRule.down.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FloatingPointRoundingRule.towardZero.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FloatingPointRoundingRule.awayFromZero.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final BigInteger BigIntegerInit(Number number) {
        number.getClass();
        return new BigInteger(number.toString());
    }

    /* renamed from: BigIntegerInit-7apg3OU, reason: not valid java name */
    public static final BigInteger m1315BigIntegerInit7apg3OU(byte b) {
        tjj tjjVar = UByte.b;
        return new BigInteger(String.valueOf(b & MessagePack.Code.EXT_TIMESTAMP));
    }

    /* renamed from: BigIntegerInit-VKZWuLQ, reason: not valid java name */
    public static final BigInteger m1316BigIntegerInitVKZWuLQ(long j) {
        return new BigInteger(Long.toUnsignedString(j));
    }

    /* renamed from: BigIntegerInit-WZ4Q5Ns, reason: not valid java name */
    public static final BigInteger m1317BigIntegerInitWZ4Q5Ns(int i) {
        return new BigInteger(Integer.toUnsignedString(i));
    }

    /* renamed from: BigIntegerInit-xj2QHRw, reason: not valid java name */
    public static final BigInteger m1318BigIntegerInitxj2QHRw(short s) {
        usj usjVar = vsj.b;
        return new BigInteger(String.valueOf(s & 65535));
    }

    public static final Byte Byte(String str) {
        str.getClass();
        try {
            return Byte.valueOf(Byte.parseByte(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: Byte-VKZWuLQ, reason: not valid java name */
    public static final byte m1320ByteVKZWuLQ(long j) {
        return (byte) j;
    }

    /* renamed from: Byte-WZ4Q5Ns, reason: not valid java name */
    public static final byte m1321ByteWZ4Q5Ns(int i) {
        return (byte) i;
    }

    /* renamed from: Byte-xj2QHRw, reason: not valid java name */
    public static final byte m1322Bytexj2QHRw(short s) {
        return (byte) s;
    }

    public static final Double Double(String str) {
        str.getClass();
        try {
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: Double-7apg3OU, reason: not valid java name */
    public static final double m1323Double7apg3OU(byte b) {
        return ozm.g(b & MessagePack.Code.EXT_TIMESTAMP);
    }

    /* renamed from: Double-VKZWuLQ, reason: not valid java name */
    public static final double m1324DoubleVKZWuLQ(long j) {
        return ozm.h(j);
    }

    /* renamed from: Double-WZ4Q5Ns, reason: not valid java name */
    public static final double m1325DoubleWZ4Q5Ns(int i) {
        return ozm.g(i);
    }

    /* renamed from: Double-xj2QHRw, reason: not valid java name */
    public static final double m1326Doublexj2QHRw(short s) {
        return ozm.g(s & 65535);
    }

    public static final Float Float(String str) {
        str.getClass();
        try {
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: Float-7apg3OU, reason: not valid java name */
    public static final float m1327Float7apg3OU(byte b) {
        return (float) ozm.g(b & MessagePack.Code.EXT_TIMESTAMP);
    }

    /* renamed from: Float-VKZWuLQ, reason: not valid java name */
    public static final float m1328FloatVKZWuLQ(long j) {
        return (float) ozm.h(j);
    }

    /* renamed from: Float-WZ4Q5Ns, reason: not valid java name */
    public static final float m1329FloatWZ4Q5Ns(int i) {
        return (float) ozm.g(i);
    }

    /* renamed from: Float-xj2QHRw, reason: not valid java name */
    public static final float m1330Floatxj2QHRw(short s) {
        return (float) ozm.g(s & 65535);
    }

    public static final Integer Int(String str) {
        str.getClass();
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: Int-7apg3OU, reason: not valid java name */
    public static final int m1331Int7apg3OU(byte b) {
        return b & MessagePack.Code.EXT_TIMESTAMP;
    }

    /* renamed from: Int-VKZWuLQ, reason: not valid java name */
    public static final int m1332IntVKZWuLQ(long j) {
        return (int) j;
    }

    /* renamed from: Int-xj2QHRw, reason: not valid java name */
    public static final int m1334Intxj2QHRw(short s) {
        return s & 65535;
    }

    public static final Long Long(String str) {
        str.getClass();
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: Long-7apg3OU, reason: not valid java name */
    public static final long m1335Long7apg3OU(byte b) {
        return b & 255;
    }

    /* renamed from: Long-WZ4Q5Ns, reason: not valid java name */
    public static final long m1337LongWZ4Q5Ns(int i) {
        return i & 4294967295L;
    }

    /* renamed from: Long-xj2QHRw, reason: not valid java name */
    public static final long m1338Longxj2QHRw(short s) {
        return s & WebSocketProtocol.PAYLOAD_SHORT_MAX;
    }

    public static final Short Short(String str) {
        str.getClass();
        try {
            return Short.valueOf(Short.parseShort(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: Short-7apg3OU, reason: not valid java name */
    public static final short m1339Short7apg3OU(byte b) {
        return (short) (b & 255);
    }

    /* renamed from: Short-VKZWuLQ, reason: not valid java name */
    public static final short m1340ShortVKZWuLQ(long j) {
        return (short) j;
    }

    /* renamed from: Short-WZ4Q5Ns, reason: not valid java name */
    public static final short m1341ShortWZ4Q5Ns(int i) {
        return (short) i;
    }

    public static final byte UByte(Number number) {
        number.getClass();
        return UByte.m885constructorimpl((byte) number.longValue());
    }

    /* renamed from: UByte-VKZWuLQ, reason: not valid java name */
    public static final byte m1344UByteVKZWuLQ(long j) {
        return UByte.m885constructorimpl((byte) j);
    }

    /* renamed from: UByte-WZ4Q5Ns, reason: not valid java name */
    public static final byte m1345UByteWZ4Q5Ns(int i) {
        return UByte.m885constructorimpl((byte) i);
    }

    /* renamed from: UByte-xj2QHRw, reason: not valid java name */
    public static final byte m1346UBytexj2QHRw(short s) {
        return UByte.m885constructorimpl((byte) s);
    }

    public static final UInt UInt(String str) {
        str.getClass();
        try {
            return new UInt(i.d(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: UInt-7apg3OU, reason: not valid java name */
    public static final int m1347UInt7apg3OU(byte b) {
        return UInt.m886constructorimpl(b & MessagePack.Code.EXT_TIMESTAMP);
    }

    /* renamed from: UInt-VKZWuLQ, reason: not valid java name */
    public static final int m1348UIntVKZWuLQ(long j) {
        return UInt.m886constructorimpl((int) j);
    }

    /* renamed from: UInt-xj2QHRw, reason: not valid java name */
    public static final int m1350UIntxj2QHRw(short s) {
        return UInt.m886constructorimpl(s & 65535);
    }

    public static final hkj ULong(String str) {
        str.getClass();
        try {
            return new hkj(i.g(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: ULong-7apg3OU, reason: not valid java name */
    public static final long m1351ULong7apg3OU(byte b) {
        long j = b & 255;
        gkj gkjVar = hkj.b;
        return j;
    }

    /* renamed from: ULong-WZ4Q5Ns, reason: not valid java name */
    public static final long m1353ULongWZ4Q5Ns(int i) {
        long j = i & 4294967295L;
        gkj gkjVar = hkj.b;
        return j;
    }

    /* renamed from: ULong-xj2QHRw, reason: not valid java name */
    public static final long m1354ULongxj2QHRw(short s) {
        long j = s & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        gkj gkjVar = hkj.b;
        return j;
    }

    public static final vsj UShort(String str) {
        str.getClass();
        try {
            return new vsj(i.i(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: UShort-7apg3OU, reason: not valid java name */
    public static final short m1355UShort7apg3OU(byte b) {
        short s = (short) (b & 255);
        usj usjVar = vsj.b;
        return s;
    }

    /* renamed from: UShort-VKZWuLQ, reason: not valid java name */
    public static final short m1356UShortVKZWuLQ(long j) {
        short s = (short) j;
        usj usjVar = vsj.b;
        return s;
    }

    /* renamed from: UShort-WZ4Q5Ns, reason: not valid java name */
    public static final short m1357UShortWZ4Q5Ns(int i) {
        short s = (short) i;
        usj usjVar = vsj.b;
        return s;
    }

    public static final double getInfinity(rx6 rx6Var) {
        rx6Var.getClass();
        return Double.POSITIVE_INFINITY;
    }

    public static final long getMSEC_PER_SEC() {
        return MSEC_PER_SEC;
    }

    public static final double getM_E() {
        return 2.718281828459045d;
    }

    public static final double getM_LN10() {
        return Math.log(10.0d);
    }

    public static final double getM_LN2() {
        return Math.log(2.0d);
    }

    public static final double getM_LOG10E() {
        return Math.log(2.718281828459045d) / Math.log(10.0d);
    }

    public static final double getM_LOG2E() {
        return Math.log(2.718281828459045d) / Math.log(2.0d);
    }

    public static final double getM_PI() {
        return 3.141592653589793d;
    }

    public static final long getMax(htb htbVar) {
        htbVar.getClass();
        return Long.MAX_VALUE;
    }

    public static final byte getMin(av1 av1Var) {
        av1Var.getClass();
        return Byte.MIN_VALUE;
    }

    public static final long getNSEC_PER_MSEC() {
        return NSEC_PER_MSEC;
    }

    public static final long getNSEC_PER_SEC() {
        return NSEC_PER_SEC;
    }

    public static final long getNSEC_PER_USEC() {
        return NSEC_PER_USEC;
    }

    public static final double getNan(rx6 rx6Var) {
        rx6Var.getClass();
        return Double.NaN;
    }

    public static final double getPi(rx6 rx6Var) {
        rx6Var.getClass();
        return 3.141592653589793d;
    }

    public static final long getUSEC_PER_SEC() {
        return USEC_PER_SEC;
    }

    public static final boolean isFinite(double d) {
        if (Math.abs(d) <= Double.MAX_VALUE) {
            return true;
        }
        return false;
    }

    public static final boolean isInfinite(double d) {
        return Double.isInfinite(d);
    }

    public static final boolean isNaN(double d) {
        return Double.isNaN(d);
    }

    public static final double random(rx6 rx6Var, z74 z74Var) {
        rx6Var.getClass();
        z74Var.getClass();
        double doubleValue = Float.valueOf(((y74) z74Var).b).doubleValue();
        float f = ((y74) z74Var).a;
        double doubleValue2 = doubleValue - Float.valueOf(f).doubleValue();
        if (doubleValue2 >= ConstantsKt.UNSET) {
            if (doubleValue2 == ConstantsKt.UNSET) {
                return Float.valueOf(f).doubleValue();
            }
            return (GlobalsKt.getSystemRandom().getRawValue().nextDouble() * doubleValue2) + Float.valueOf(f).doubleValue();
        }
        throw new ErrorException(new IllegalArgumentException(z74Var.toString()));
    }

    public static /* synthetic */ byte random$default(av1 av1Var, IntRange intRange, InOut inOut, int i, Object obj) {
        if ((i & 2) != 0) {
            inOut = null;
        }
        return random(av1Var, intRange, (InOut<RandomNumberGenerator>) inOut);
    }

    public static final float rounded(float f, FloatingPointRoundingRule floatingPointRoundingRule) {
        floatingPointRoundingRule.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[floatingPointRoundingRule.ordinal()]) {
            case 1:
                double d = f;
                float rint = (float) Math.rint(d);
                if (Math.abs(f - rint) == 0.5f) {
                    if (f > 0.0f) {
                        return (float) Math.ceil(d);
                    }
                    return (float) Math.floor(d);
                }
                return rint;
            case 2:
                return (float) Math.rint(f);
            case 3:
                return (float) Math.ceil(f);
            case 4:
                return (float) Math.floor(f);
            case 5:
                if (f > 0.0f) {
                    return (float) Math.floor(f);
                }
                return (float) Math.ceil(f);
            case 6:
                if (f > 0.0f) {
                    return (float) Math.ceil(f);
                }
                return (float) Math.floor(f);
            default:
                dmk.a();
                return 0.0f;
        }
    }

    public static final boolean isInfinite(float f) {
        return Float.isInfinite(f);
    }

    public static final boolean isNaN(float f) {
        return Float.isNaN(f);
    }

    public static final float getInfinity(h88 h88Var) {
        h88Var.getClass();
        return Float.POSITIVE_INFINITY;
    }

    public static final byte getMin(tjj tjjVar) {
        tjjVar.getClass();
        return (byte) 0;
    }

    public static final float getNan(h88 h88Var) {
        h88Var.getClass();
        return Float.NaN;
    }

    public static final int getMin(u0a u0aVar) {
        u0aVar.getClass();
        return Integer.MIN_VALUE;
    }

    public static final int getMin(akj akjVar) {
        akjVar.getClass();
        return 0;
    }

    public static final byte getMax(tjj tjjVar) {
        tjjVar.getClass();
        return Byte.MAX_VALUE;
    }

    public static final long getMin(htb htbVar) {
        htbVar.getClass();
        return Long.MIN_VALUE;
    }

    public static final float getPi(h88 h88Var) {
        h88Var.getClass();
        return 3.1415925f;
    }

    public static final int getMax(u0a u0aVar) {
        u0aVar.getClass();
        return bd0.API_PRIORITY_OTHER;
    }

    public static final long getMin(gkj gkjVar) {
        gkjVar.getClass();
        return 0L;
    }

    public static /* synthetic */ byte random$default(tjj tjjVar, ekj ekjVar, InOut inOut, int i, Object obj) {
        if ((i & 2) != 0) {
            inOut = null;
        }
        return random(tjjVar, ekjVar, (InOut<RandomNumberGenerator>) inOut);
    }

    public static final int getMax(akj akjVar) {
        akjVar.getClass();
        return -1;
    }

    public static final short getMin(q5h q5hVar) {
        q5hVar.getClass();
        return Short.MIN_VALUE;
    }

    public static /* synthetic */ short random$default(q5h q5hVar, IntRange intRange, InOut inOut, int i, Object obj) {
        if ((i & 2) != 0) {
            inOut = null;
        }
        return random(q5hVar, intRange, (InOut<RandomNumberGenerator>) inOut);
    }

    public static final byte getMax(av1 av1Var) {
        av1Var.getClass();
        return Byte.MAX_VALUE;
    }

    public static final short getMin(usj usjVar) {
        usjVar.getClass();
        return (short) 0;
    }

    public static /* synthetic */ short random$default(usj usjVar, ekj ekjVar, InOut inOut, int i, Object obj) {
        if ((i & 2) != 0) {
            inOut = null;
        }
        return random(usjVar, ekjVar, (InOut<RandomNumberGenerator>) inOut);
    }

    public static final BigInteger BigIntegerInit(String str) {
        str.getClass();
        try {
            return new BigInteger(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final long getMax(gkj gkjVar) {
        gkjVar.getClass();
        return -1L;
    }

    public static /* synthetic */ int random$default(u0a u0aVar, IntRange intRange, InOut inOut, int i, Object obj) {
        if ((i & 2) != 0) {
            inOut = null;
        }
        return random(u0aVar, intRange, (InOut<RandomNumberGenerator>) inOut);
    }

    public static final byte Byte(Number number) {
        number.getClass();
        return number.byteValue();
    }

    public static final double Double(Number number) {
        number.getClass();
        return number.doubleValue();
    }

    public static final float Float(Number number) {
        number.getClass();
        return number.floatValue();
    }

    public static final int Int(Number number) {
        number.getClass();
        return number.intValue();
    }

    public static final long Long(Number number) {
        number.getClass();
        return number.longValue();
    }

    public static final short Short(Number number) {
        number.getClass();
        return number.shortValue();
    }

    public static final UByte UByte(String str) {
        str.getClass();
        try {
            return UByte.m884boximpl(i.c(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final short getMax(q5h q5hVar) {
        q5hVar.getClass();
        return Short.MAX_VALUE;
    }

    public static /* synthetic */ int random$default(akj akjVar, ekj ekjVar, InOut inOut, int i, Object obj) {
        if ((i & 2) != 0) {
            inOut = null;
        }
        return random(akjVar, ekjVar, (InOut<RandomNumberGenerator>) inOut);
    }

    public static final int UInt(Number number) {
        number.getClass();
        return UInt.m886constructorimpl((int) number.longValue());
    }

    public static final long ULong(Number number) {
        number.getClass();
        long longValue = number.longValue();
        gkj gkjVar = hkj.b;
        return longValue;
    }

    public static final short UShort(Number number) {
        number.getClass();
        short longValue = (short) number.longValue();
        usj usjVar = vsj.b;
        return longValue;
    }

    public static final short getMax(usj usjVar) {
        usjVar.getClass();
        return (short) -1;
    }

    public static /* synthetic */ long random$default(htb htbVar, ytb ytbVar, InOut inOut, int i, Object obj) {
        if ((i & 2) != 0) {
            inOut = null;
        }
        return random(htbVar, ytbVar, (InOut<RandomNumberGenerator>) inOut);
    }

    public static /* synthetic */ long random$default(gkj gkjVar, lkj lkjVar, InOut inOut, int i, Object obj) {
        if ((i & 2) != 0) {
            inOut = null;
        }
        return random(gkjVar, lkjVar, (InOut<RandomNumberGenerator>) inOut);
    }

    public static final boolean isFinite(float f) {
        return Math.abs(f) <= Float.MAX_VALUE;
    }

    /* renamed from: Byte-7apg3OU, reason: not valid java name */
    public static final byte m1319Byte7apg3OU(byte b) {
        return b;
    }

    /* renamed from: Int-WZ4Q5Ns, reason: not valid java name */
    public static final int m1333IntWZ4Q5Ns(int i) {
        return i;
    }

    /* renamed from: Long-VKZWuLQ, reason: not valid java name */
    public static final long m1336LongVKZWuLQ(long j) {
        return j;
    }

    /* renamed from: Short-xj2QHRw, reason: not valid java name */
    public static final short m1342Shortxj2QHRw(short s) {
        return s;
    }

    /* renamed from: UByte-7apg3OU, reason: not valid java name */
    public static final byte m1343UByte7apg3OU(byte b) {
        return b;
    }

    /* renamed from: UInt-WZ4Q5Ns, reason: not valid java name */
    public static final int m1349UIntWZ4Q5Ns(int i) {
        return i;
    }

    /* renamed from: ULong-VKZWuLQ, reason: not valid java name */
    public static final long m1352ULongVKZWuLQ(long j) {
        return j;
    }

    /* renamed from: UShort-xj2QHRw, reason: not valid java name */
    public static final short m1358UShortxj2QHRw(short s) {
        return s;
    }

    public static final int random(akj akjVar, ekj ekjVar, InOut<RandomNumberGenerator> inOut) {
        akjVar.getClass();
        throw null;
    }

    public static final long random(gkj gkjVar, lkj lkjVar, InOut<RandomNumberGenerator> inOut) {
        gkjVar.getClass();
        throw null;
    }

    public static final short random(usj usjVar, ekj ekjVar, InOut<RandomNumberGenerator> inOut) {
        usjVar.getClass();
        throw null;
    }

    public static final byte random(av1 av1Var, IntRange intRange, InOut<RandomNumberGenerator> inOut) {
        RandomNumberGenerator systemRandom;
        av1Var.getClass();
        intRange.getClass();
        int i = intRange.b;
        int i2 = intRange.a;
        int i3 = i - i2;
        if (i3 < 0) {
            throw new ErrorException(new IllegalArgumentException(intRange.toString()));
        }
        if (i3 == 0) {
            return Byte(Integer.valueOf(i2));
        }
        if (inOut == null || (systemRandom = inOut.getValue()) == null) {
            systemRandom = GlobalsKt.getSystemRandom();
        }
        return Byte(Integer.valueOf(i2 + m1332IntVKZWuLQ(Long.remainderUnsigned(systemRandom.mo1359nextsVKNKU(), ULong(Integer.valueOf(i3 + 1))))));
    }

    public static final int random(u0a u0aVar, IntRange intRange, InOut<RandomNumberGenerator> inOut) {
        RandomNumberGenerator systemRandom;
        u0aVar.getClass();
        intRange.getClass();
        int i = intRange.b;
        int i2 = intRange.a;
        int i3 = i - i2;
        if (i3 < 0) {
            throw new ErrorException(new IllegalArgumentException(intRange.toString()));
        }
        if (i3 == 0) {
            return i2;
        }
        if (inOut == null || (systemRandom = inOut.getValue()) == null) {
            systemRandom = GlobalsKt.getSystemRandom();
        }
        return i2 + m1332IntVKZWuLQ(Long.remainderUnsigned(systemRandom.mo1359nextsVKNKU(), ULong(Integer.valueOf(i3 + 1))));
    }

    public static final short random(q5h q5hVar, IntRange intRange, InOut<RandomNumberGenerator> inOut) {
        RandomNumberGenerator systemRandom;
        q5hVar.getClass();
        intRange.getClass();
        int i = intRange.b;
        int i2 = intRange.a;
        int i3 = i - i2;
        if (i3 < 0) {
            throw new ErrorException(new IllegalArgumentException(intRange.toString()));
        }
        if (i3 == 0) {
            return Short(Integer.valueOf(i2));
        }
        if (inOut == null || (systemRandom = inOut.getValue()) == null) {
            systemRandom = GlobalsKt.getSystemRandom();
        }
        return Short(Integer.valueOf(i2 + m1332IntVKZWuLQ(Long.remainderUnsigned(systemRandom.mo1359nextsVKNKU(), ULong(Integer.valueOf(i3 + 1))))));
    }

    public static final byte random(tjj tjjVar, ekj ekjVar, InOut<RandomNumberGenerator> inOut) {
        tjjVar.getClass();
        throw null;
    }

    public static final double rounded(double d, FloatingPointRoundingRule floatingPointRoundingRule) {
        floatingPointRoundingRule.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[floatingPointRoundingRule.ordinal()]) {
            case 1:
                double rint = Math.rint(d);
                return Math.abs(d - rint) == 0.5d ? d > ConstantsKt.UNSET ? Math.ceil(d) : Math.floor(d) : rint;
            case 2:
                return Math.rint(d);
            case 3:
                return Math.ceil(d);
            case 4:
                return Math.floor(d);
            case 5:
                return d > ConstantsKt.UNSET ? Math.floor(d) : Math.ceil(d);
            case 6:
                return d > ConstantsKt.UNSET ? Math.ceil(d) : Math.floor(d);
            default:
                dmk.a();
                return ConstantsKt.UNSET;
        }
    }

    public static final float random(h88 h88Var, z74 z74Var) {
        h88Var.getClass();
        z74Var.getClass();
        float floatValue = Float.valueOf(((y74) z74Var).b).floatValue();
        float f = ((y74) z74Var).a;
        float floatValue2 = floatValue - Float.valueOf(f).floatValue();
        if (floatValue2 < 0.0f) {
            throw new ErrorException(new IllegalArgumentException(z74Var.toString()));
        }
        if (floatValue2 == 0.0f) {
            return Float.valueOf(f).floatValue();
        }
        return (GlobalsKt.getSystemRandom().getRawValue().nextFloat() * floatValue2) + Float.valueOf(f).floatValue();
    }

    public static final float rounded(float f) {
        return (float) Math.rint(f);
    }

    public static final double rounded(double d) {
        return Math.rint(d);
    }

    public static final long random(htb htbVar, ytb ytbVar, InOut<RandomNumberGenerator> inOut) {
        RandomNumberGenerator systemRandom;
        htbVar.getClass();
        ytbVar.getClass();
        long j = ytbVar.b;
        long j2 = ytbVar.a;
        long j3 = j - j2;
        if (j3 < 0) {
            throw new ErrorException(new IllegalArgumentException(ytbVar.toString()));
        }
        if (j3 == 0) {
            return j2;
        }
        if (inOut == null || (systemRandom = inOut.getValue()) == null) {
            systemRandom = GlobalsKt.getSystemRandom();
        }
        return j2 + m1336LongVKZWuLQ(Long.remainderUnsigned(systemRandom.mo1359nextsVKNKU(), ULong(Long.valueOf(j3 + 1))));
    }
}
