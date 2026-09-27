package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.mlkit.common.MlKitException;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.k84;
import io.radar.sdk.util.RadarSimpleLogBuffer;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.ws.WebSocketProtocol;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/af;", "", "<init>", "()V", "a", "component5"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class af {

    /* renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static char[] b;
    public static long c;
    public static int d;
    public static int e;
    public static final int f;
    public static final byte[] g = null;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/af$component5;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.fingerprintjs.android.fpjs_pro_internal.af$component5, reason: from kotlin metadata */
    /* loaded from: classes.dex */
    public static final class Companion {
        public static final char[] a;
        public static final long b;
        public static int c;
        public static int d;
        public static final byte[] e = null;
        public static final int f = 0;
        public static final byte[] g = null;
        public static final int h = 0;

        static {
            e();
            d();
            c = 0;
            d = 1;
            char[] cArr = new char[1959];
            ByteBuffer.wrap("%Äg¦¡Üãæ-`oA©rê\u00984Çvü°\u0018ò[<oy¡»´Åè\u0007\u001fA \u0083lÌ\u0093\u000e¬Hé\u008a\u001eÔ4\u0016RS\u0089\u009d¤ír¯\u0010ij+PåÖ§÷aÄ\".üq¾Jx®:íôÙ±\u0017s\u0013\rSÏ½\u0089\u0081Kà\u00042Æ\u0019\u0080rB¸\u001c\u0086Þá%Äg¦¡Üãæ-`oA©rê\u00984Çvü°\u0018ò[<oy¡»¦Åõ\u0007\u0015A1vx4\rò|°_~Ü<÷úÎ¹,gj%Jã¨¡»oÜ*-è\u0005\u0096TT¡\u0012\u0087ÐÆ\u009f4]<\u001bhÙ°\u0087\u008cEû\u00003Î\u000f\u008c}Z6\u0018UÞ?\u009c\u0001R\u0092\u0010°Ö\u0088\u0095(K!\t\u001aÏì\u008dª¿âý\u0081;ëyÕ·Fõs3Rp¿®«ìÌ*%ha¦Q%Äg±¡Ýãó-.oT©yêÛ4ñvÜ°<òG<qy\u009b»\u0091Åí\u0007\u000fA3X\u009a\u001aøÜ\u0086\u009eºPp\u0012WÔm\u0097ÉI\u008d\u000b±ÍF\u008f\u0018A?\u0004Ï%\u0099g\u00ad¡\u0097ãò- oI©iêÚ4Ñvÿ°\u0015òZ<hy\u0097»±ÅÓ\u0007\u0015A7\u0083}Ì¿\u000e»HØ\u008a\u001eÔu%\u0099g\u00ad¡\u0097ãò- oI©iêÚ4Ñvÿ°\u0015òZ<hy\u0097»±ÅÓ\u0007\u0015A7\u0083}Ì¿\u000e»HØ\u008a\u001eÔv\u0090ðÒ\u0085\u0014ôV×\u0098\u000fÚw\u001cD_ï\u0081ûÃÇ\u0005'G3\u0089_Ì£\u000e\u0083pÖ²-ôH6Ny»; y\u0082¿÷ý×3\tqw\u0010\u001bRn\u0094\u001fÖ<\u0018äZ\u009c\u009c¯ß\u0004\u0001\u001eC,\u0085ÀÇØ\t¶LD\u008egð&2òtÀ¶ûùQ;e}\u0004¿Çá¶#\u008ffZ¨pê\u0013,:nþÐ\u0096d\u0016&cà\u0012¢1lé.\u0091è¢«\tu\u00137!ñÍ³Õ}»8Iúj\u0084+Fÿ\u0000ÍÂö\u008dBO\u007f\t\u000bËÏí.¯[i*+\tåÑ§©a\u009a\"1ü%¾\u0019xù:íô\u0081±}s]\r\bÏô\u0089ÕK\u0096\u0004\\Æx\u0080,Bõ\u001cÁÞ©\u009b.UX\u0017=%Äg¦¡Üãæ-`oH©xê\u00994Övý°\u0004òM<ty\u008a%\u0099g\u00ad¡\u0097ãò-:oO©qê\u00904\u008dvò°\u001eò[<s%\u0085g§¡Øãã-*o\b©sê\u00914×\"\u0088`þ¦\u0087ä³*`hE®7íÑ3\u0083q³·Nõ\u001d;8~Æ¼üÂ\u00ad\u0000Dû0¹\u0012\u007fa=Pó\u0089±õs¡1\u0095%\u0099g\u00ad¡\u0097ãà-=oI©yê\u00814Àvî°_òE<fy\u0090» Åê\u0007\u001aA1\u0083}Ì\u0095\u000e\u00adHÓ\u008a\u001f%\u008cg§¡×ãéÞ\u009a\u009c¦ZÊ\u0018âÖ'\u0094TRh\u0011ÛÏÑ\u008dâK\u0003\t\u0007Çd\u0082\u009b@ú>éü\u001fº1x}7\u0086õð³Ðq\u001c/0í\u001c¨\u008df¡$Òâó \u0010\u001eCÜm\u009b¿Yü\u0017êÕ\u0014\u0093@Qc\f\u0099Ê§\u0088çF\t|\b>4øXºptµ6Æðú³ImC/pé\u0091«\u0095eö \tâh\u009c{^\u008d\u0018£Úï\u0095\u0014Wb\u0011BÓ\u008e\u008d¢O\u008e\n\u001fÄ3\u0086@@a\u0002\u0082¼Ñ~ÿ9-ûnµ|w\u00861Òóñ®\u0001h5%\u009bg§¡Ëãã-&oU©iêÚ4Ðvã°\u0002ò\u0006<ey\u009a»ûÅè\u0007\u001eA0\u0083|Ì\u0087\u000eñHÄ\u008a\u0002Ôj\u0016PS\u009b\u009d¨%\u009bg§¡Ëãã-&oU©iêÚ4Ðvã°\u0002ò\u0006<ey\u009a»ûÅè\u0007\u001eA0\u0083|Ì\u0087\u000eñHÄ\u008a\u0002Ôj\u0016_S\u008b\u009d¢ÖH\u0094tR\u0018\u00100Þõ\u009c\u0086Zº\u0019\tÇ\u0003\u00850CÑ\u0001ÕÏ¶\u008aIH(6;ôÍ²ãp¯?Tý\"»\u0017yÑ'¹å\u008d Znqµ>÷\u00021nsF½\u0083ÿð9Ìz\u007f¤uæF §b£¬Àé?+^UM\u0097»Ñ\u0095\u0013Ù\\\"\u009eTØa\u001a§DÏ\u0086ûÃ!\r\u0007%\u009dg ¡Öãè-<o@%Äg²¡Ëãÿ-,o\t©pê\u009b4Çvï°\u001dòM<t%\u009dg ¡Öãè-(oS©xê\u00874×L\u008b\u000e\u0080Èð\u008aÎD\u0005\u0006nÀN\u0083º]ë\u001fÓ%\u009eg¬¡Òãþ- oQ©sÀÕ\u0082÷D\u0096\u0006¢È\u007f\u008a\u0012L5\u000fÄ%\u0099g\u00ad¡\u0097ãà-=oI©yê\u00814Àvî°_òL<by\u0088»¼Åï\u0007\u001e%\u009dg ¡Öãè-wo\u0010©mÀü\u0082×D§\u0006\u0085ÈM\u008a?L\u000e%\u008cg§¡×ãõ-=oO©~ê«4Ûv¢°G%\u008cg§¡×ãõ-=oO©~ê«4Ûv¢°Gòw<1yÊï(\u00ad\u001ck&)Qç\u008c¥øcÈ 0þq¼_zî8ôöÙ³+q\u0001\u000fQ&Ødæ¢\u0092\u0096)Ô\b\u0012kP[\u009e\u0089Üõ\u001aÕY!Ðô\u0092ìT\u0097\u0016îØC\u009a\r\\-\u001fÞÁ\u0094\u0083©EJ\u0007VÉ?\u008cÏNù0òòf´dv%9Ñûì½\u008dJ¦\b ÎÑ\u008cîB,\u0000CÆu\u0085Ø[ü\u0019Òß6\u009d\u0004Si\u0016\u0087Ô°ªìh\u0003.~ìc£\u0083a¡'\u009aå\u0019»py\t×ì\u0095êS\u009b\u0011¤ßf\u009d\t[?\u0018\u0092Æ¶\u0084\u0098B|\u0000NÎ#\u008bÍIú7¦õI³4q)>ÉüëºÐxS&:äC¡óo±-Ê\u0085`ÇT\u0001nC\u0001\u008d×Ï\u00ad\t\u0080Jz\u0094;Ö\u0011\u0010í%\u008cg\u00ad¡Õãô-)oO©nê\u009c%\u009dg ¡Öãè-wo\u0010%\u0099g£¡×ãó-'oSóv±Bwx5\u000fûÒ¹¦\u007f\u0096<nâ/ \u0001f°$¥ê\u009a¯pmT\u0013\u0007%\u0099g\u00ad¡\u0097ãû-*oT©sê\u00914Ïv´°\u0000òM<jy\u008bOÂ%\u0099g\u00ad¡\u0097ãã-*oE©hê\u00864Æ$\u009f3\u009cq¨·\u0092õ÷;?yJ¿tü\u0095\"\u0088`ï¦\u0006äB*fo\u008e\u00ad³Óý-Çoý©\u009fë¶%Zg\u0014¡oâ\u0088%\u0099g\u00ad¡\u0097ãò-:oO©qê\u00904\u008dvü°\u0018òF<`y\u009b»§Åü\u0007\tA;\u0083gÌ\u009402r\u0019´iöK8\u0083zñ¼Àÿe!nc@¥¤ç¹)Þl%®\u0005ÐW\u0012·T\u0085\u0096Ô\u008fïÍÄ\u000b´I\u0096\u0087^Å,\u0003\u001d@È\u009e¸ÜÁ\u001a$Xd\u0096\u0017Óù\u0011Ýo°\u00ad`ë\t)\\f¬¤Ûâ° `~B¼\"ùà7Áu\u0084³\u008cñ\u0015Opå_§ta\u0004#&íî¯\u009ci\u00ad*\bô\u0017¶&pÍ2\u009cü¸¹H{Y\u0005,ÇÌ\u0081êCõ\fTÎi\u0088\u000bJÛ\u0014åÖ\u0089\u0093Z%\u008cg§¡×ãõ-=oO©~êÛ4Õvø°\u001eòP<?yÈ»¥Å£\u0007\rA0\u0083fÌ\u0098\u000eçH\u0080\u008a\u001dÛ\u0092\u0099³_È\u001déÓ=\u0091]W,\u0014\u0099ÊÙ\u0088ïN0\fQÂi\u0087\u0088E¤;üù\u0000¿\u0013}o2Æð÷¶\u0087t\u0014*?èC\u00ad\u0091c\u00ad!Ïçê¥\u000f\u001bCÙ:\u009eã¬Êîþ(Äj¡¤sæ\u001a :cË½\u009fÿ¨9F{\u001eµ&%\u0099g\u00ad¡\u0097ãò- oI©iê\u009d4Îvû°\u0016òM<)y\u009c» Åå\u0007\u0017A6\u0083'Ì\u0086\u000e¶HØ\u008a\nÔ!\u0016AS\u009a\u009d³ßÑ\u0019ù[:Òx\u0090~V\u000f\u00140Úò\u0098\u009d^«\u001d\u000bÃ\t\u0081pG\u0095íÀ¯ôiÎ+«åc§\u0016a(\"ÉüÔ¾§xA:\u0002ô.±Ësí\r¬Ï\f\u0089bK4%\u009fg§¡Êãä-bp 2\u000eôr¶FxÃ:÷üÉ¿5a/#Iå¶§çiÐ,qî\u0007\u0090\\R¶\u0014\u0080ÖØ%\u009ag§¡Ôãå-aoN©jêÚ4Îvû°\u0018òF<ly\u009b»¬ÅÿÀ\u008c\u0082±DÂ\u0006óÈw\u008aCLm\u000fÌÑÓ\u0093íU\f\u0017[ÙN\u009c\u008b^¢ ÷â\b¤6f~%\u009ag§¡Ôãå-aoU©{êÚ4Ïvù°\u0015òw<cy\u009b»»Åÿ\u0007\u0012A&\u0083pî1¬\u0005j?(Sæ\u0082¤übÛ!9ÿg½\u001c{¸9î÷Ë²$p\u0012\u000eMÌ·\u008aÔHÐ\u0007-Å\u001a\u0083kA¡Ã¾\u0081\u008aG°\u0005ÕË\u0007\u0089nON\fýÒõ\u0090ØV;\u0014zÚ\u000e\u009f¸]\u0084#Ïá\u0003§\u001beO*ªè\u009d%\u0099g\u00ad¡\u0097ãÿ-+oK©3ê\u00964Övó°\u001dòL<)y\u0098»¼Åâ\u0007\u001cA7\u0083{Ì\u0090\u000e\u00adHß\u008a\u0003Ô0%\u0099g\u00ad¡\u0097ãà-=oI©yê\u00814Àvî°_òJ<ry\u0097»¹Åè\u0007UA4\u0083`Ì\u008e\u000e¸HÓ\u008a\u001fÔ4\u0016AS\u0083\u009d¯ßÌ%\u0099g\u00ad¡\u0097ãã-6oU©iê\u00914Îv´°\u0013ò]<ny\u0092»±Å¢\u0007\u001dA;\u0083gÌ\u0087\u000eºHÄ\u008a\u001dÔ6\u0016ZS\u0084\u009dµ%\u0099g\u00ad¡\u0097ãã-6oU©iê\u00914ÎvÅ°\u0014òP<syÐ»·Åù\u0007\u0012A>\u0083mÌÎ\u000e¹Hß\u008a\u0003Ô#\u0016VS\u0098\u009d±ßÊ\u0019þ[ åQ*÷hÃ®ùì\u0088\"D`&¦\u0017åõ;¿yÚ¿}ý33\u0000vü´ßÊÌ\bsNU\u008c\tÃé\u0001ÔGª\u0085sÛX\u00194\\ê\u0092Û%\u0099g\u00ad¡\u0097ãæ-*oH©yê\u009b4ÑvÅ°\u0015òD<ly\u0093»ûÅî\u0007\u000eA;\u0083eÌ\u0084\u000eñHÐ\u008a\u0004Ô*\u0016TS\u008f\u009d³ßÈ\u0019å['åK'h28%Äg¦¡Üãæ-`oW©xê\u00994ÖvÅ°\u0001òA<wy\u009b%Äg¦¡Üãæ-`oU©rê\u00974Èvÿ°\u0005ò\u0007<ey\u009f»¦Åé\u0007\u0019A3\u0083gÌ\u0084\u000e\u0080HÑ\u008a\bÔ*\u0016JS\u008eµ¤÷Æ1¼s\u0086½\u0000ÿ59\u0012z÷¤¨æ\u009f ebg¬\u0000éû+ÛU\u0095\u0097\u007f%Äg¦¡Üãæ-`oU©rê\u00974Èvÿ°\u0005ò\u0007<vy\u009b»¸Åù\u0007\u001fAR\u0003'ÅV\u0087uIö\u000bÁÍî\u008e\u000fP@\u0012SÔ\u0093\u0096ÌXð\u001d\u000bß&%Äg±¡Àãã-;oC©pêÛ4Ïvó°\u0013ò\u0007<ky\u0097»·Åï\u0007$A?\u0083hÌ\u008c\u000e³HÙ\u008a\u000eÔ\u001b\u0016WS\u008f\u009d£ßÍ\u0019ð[\u0011åT'y`¦¢×ì·.\u0003h@¾;üY:#x\u0019¶\u009fô»2\u0091q\u007f¯\u0003í\u0002+þi¤o\u00ad-Ïëµ©\u008fg\t%-ã\u0007 é~\u0095<\u0087úq¸,v\u000b%Äg¦¡Üãæ-`oU©rê\u00974Èvÿ°\u0005ò\u0007<ey\u008d»¡Åê\u0007\u0014A>\u0083mÌ\u0085\u000e\u00adHÒa\u0081#ôå\u0085§¦i~+\u0006í5®\u009ep\u008a2¶ôV¶Bx.=Òÿò\u0081«CM\u0005cÇ*\u0088ÊJö\f\u0097ÎM\u0090sR)\u0017ÅÙê\u009b\u0094]ü\u001fx¡\u000fQò\u0013\u0090Õê\u0097ÐYV\u001brÝX\u009e¶@ô\u0002ÏÄ$\u0086{%Äg¦¡Üãæ-`oD©nê\u00804Ävã°\u0003òG\u0091%ÓG\u0015=W\u0007\u0099\u0081Û¥\u001d\u008f^a\u0080/Â\u001e\u0004÷F§Úð\u0098\u0092^è\u001cÒÒT\u0090pVZ\u0015´Ëø\u0089ÜO,\ry%Äg¦¡Üãæ-`oD©nê\u00804Õv÷°\u0002òO%Äg¦¡Üãæ-`oD©nê\u00804Óvý°\u0010òA<wy\u009d\"ü`\u009e¦ääÞ*Xh|®Ví¸3ÄqË·$õu%Äg¦¡Øãä-.o\t©yê\u009b4Ôvô°\u001dòG<fy\u009a»¦Å£\u0007UA*\u0083kÌÏ\u000e½HÅ\u008a\u0019Ô/%Äg¯¡×ãä-`oQ©tê\u009a4Çvõ°\u0006ò[<(y¼»¦Åø\u0007(A:\u0083hÌ\u0092\u000eºHÒ\u008a+Ô+\u0016_S\u008e\u009d¤ßÊ%Äg²¡Ëãÿ-,o\t©tê\u009b4Óvõ°\u0003ò\\<t%Ûg¤¡ßã°-u%Äg²¡Ëãÿ-,o\t©nê\u00914Ïvü°^òE<fy\u008e»¦%\u008cg°¡Øãü-#oI©~êÚ4Ävõ°\u001dòL<ay\u0097»¦Åä\u0007UA!\u0083f«©é\u0085/õmù£-áM'`d\u0085ºïøÇ>+|(²Z÷¿%Äg§¡Íãó-`oK©xê\u00904Êvû°.òK<hy\u009a»°Åï\u0007\bA|\u0083qÌ\u008d\u000e³%\u0089g®¡Ìãõ-<oR©|ê\u00974Èvé%Äg§¡Íãó-`oK©rê\u00814Ívî°\u0002%Äg¦¡Øãä-.o\t©yê\u009b4Ôvô°\u001dòG<fy\u009a»¦Å£\u0007UA6\u0083yÌÏ\u000e¾HÆ\u008a\u001dÔ7\u0016\u001dS\u0092\u009d¬ßÔ\bãJ\u0095\u008cìÎØ\u0000\u000bB.\u0084YÇ£\u0019ñ[Ô\u009d8ßi\u0011O%¬g\u00ad¡Õãô-)oO©nê\u009c%Äg¦¡Øãä-.o\t©pê\u009d4Ðvù°^òX<uy\u0091»³Åå\u0007\u0017A7\u0083zÌÏ\u000e¼HÃ\u008a\u001fÔk\u0016\u0003SÅ\u009d¢ß×\u0019ú[`åH'u`¨¢Ðìö.\u0006hFªt÷\u00891úsî½\u001fÿ<9}z\u008e\u0084³ÆÐ".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1959);
            a = cArr;
            b = 6913538881124132802L;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:145:0x15b3, code lost:
        
            if (r2 != false) goto L404;
         */
        /* JADX WARN: Code restructure failed: missing block: B:294:0x3068, code lost:
        
            if (r3 != r69) goto L330;
         */
        /* JADX WARN: Code restructure failed: missing block: B:320:0x278a, code lost:
        
            if (r6.length() != 0) goto L265;
         */
        /* JADX WARN: Code restructure failed: missing block: B:321:0x2799, code lost:
        
            r13 = com.fingerprintjs.android.fpjs_pro_internal.af.Companion.d;
            r41 = r7;
            com.fingerprintjs.android.fpjs_pro_internal.af.Companion.c = ((r13 ^ 63) + ((r13 & 63) << 1)) % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:322:0x27a9, code lost:
        
            if (r12.length == 1) goto L273;
         */
        /* JADX WARN: Code restructure failed: missing block: B:323:0x27ab, code lost:
        
            r7 = r3.length;
            r12 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:324:0x27ad, code lost:
        
            if (r12 >= r7) goto L436;
         */
        /* JADX WARN: Code restructure failed: missing block: B:326:0x27b5, code lost:
        
            if (r6.contains(r3[r12]) == false) goto L272;
         */
        /* JADX WARN: Code restructure failed: missing block: B:327:0x27b8, code lost:
        
            r12 = r12 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:333:0x27bb, code lost:
        
            r10 = r10 + 1;
            r11 = r69 ^ (((r9 | 10) << 1) - (r9 ^ 10));
            r3 = new java.lang.StringBuilder(r6);
            r7 = (android.os.Process.getThreadPriority(0) + 20) >> 6;
            r44 = r9;
            r13 = new java.lang.Object[1];
            b((char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6121), (r7 ^ 1) + ((r7 & 1) << 1), android.text.TextUtils.indexOf(r4, r4, 0, 0) + 1412, r13);
            r3.append((java.lang.String) r13[0]);
            r3.append(r6);
            r8.add(r3.toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:336:0x2797, code lost:
        
            if (r6.length() != 0) goto L265;
         */
        /* JADX WARN: Code restructure failed: missing block: B:353:0x15b8, code lost:
        
            if (r2 != false) goto L404;
         */
        /* JADX WARN: Removed duplicated region for block: B:100:0x1040  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x1103  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x115f  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x1727  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x1783  */
        /* JADX WARN: Removed duplicated region for block: B:193:0x298b A[Catch: all -> 0x387f, TryCatch #5 {all -> 0x387f, blocks: (B:6:0x0132, B:8:0x013f, B:9:0x017f, B:24:0x0349, B:26:0x0356, B:27:0x0399, B:37:0x0503, B:40:0x0513, B:41:0x0551, B:49:0x0784, B:51:0x078a, B:52:0x07c4, B:61:0x099c, B:63:0x09ad, B:64:0x09e8, B:77:0x0c2b, B:79:0x0c35, B:80:0x0c6f, B:89:0x0f53, B:91:0x0f5d, B:92:0x0f8c, B:115:0x1181, B:117:0x118b, B:118:0x11b9, B:128:0x146a, B:130:0x1474, B:131:0x14a5, B:158:0x1787, B:160:0x178d, B:161:0x17c7, B:167:0x1923, B:169:0x1934, B:170:0x1976, B:178:0x1aa7, B:180:0x1ab1, B:181:0x1ae2, B:183:0x1aeb, B:185:0x1b05, B:186:0x1b42, B:191:0x2981, B:193:0x298b, B:194:0x29bb, B:204:0x2e36, B:206:0x2e40, B:207:0x2e77, B:212:0x2f3c, B:214:0x2f49, B:215:0x2f7a, B:238:0x3369, B:240:0x337c, B:241:0x33ca, B:268:0x36c0, B:270:0x36ca, B:271:0x36fe, B:302:0x29c7, B:304:0x29e0, B:305:0x2a1f, B:311:0x271d, B:313:0x2727, B:314:0x2761, B:384:0x0d2c, B:386:0x0d36, B:387:0x0d70, B:397:0x0649, B:399:0x0653, B:400:0x068d, B:407:0x06d5, B:409:0x06df, B:410:0x070b), top: B:5:0x0132 }] */
        /* JADX WARN: Removed duplicated region for block: B:196:0x29c4  */
        /* JADX WARN: Removed duplicated region for block: B:199:0x2abc  */
        /* JADX WARN: Removed duplicated region for block: B:235:0x3347  */
        /* JADX WARN: Removed duplicated region for block: B:248:0x3496  */
        /* JADX WARN: Removed duplicated region for block: B:250:0x350c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:265:0x35fb  */
        /* JADX WARN: Removed duplicated region for block: B:267:0x3653  */
        /* JADX WARN: Removed duplicated region for block: B:291:0x3493 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:302:0x29c7 A[Catch: all -> 0x387f, TryCatch #5 {all -> 0x387f, blocks: (B:6:0x0132, B:8:0x013f, B:9:0x017f, B:24:0x0349, B:26:0x0356, B:27:0x0399, B:37:0x0503, B:40:0x0513, B:41:0x0551, B:49:0x0784, B:51:0x078a, B:52:0x07c4, B:61:0x099c, B:63:0x09ad, B:64:0x09e8, B:77:0x0c2b, B:79:0x0c35, B:80:0x0c6f, B:89:0x0f53, B:91:0x0f5d, B:92:0x0f8c, B:115:0x1181, B:117:0x118b, B:118:0x11b9, B:128:0x146a, B:130:0x1474, B:131:0x14a5, B:158:0x1787, B:160:0x178d, B:161:0x17c7, B:167:0x1923, B:169:0x1934, B:170:0x1976, B:178:0x1aa7, B:180:0x1ab1, B:181:0x1ae2, B:183:0x1aeb, B:185:0x1b05, B:186:0x1b42, B:191:0x2981, B:193:0x298b, B:194:0x29bb, B:204:0x2e36, B:206:0x2e40, B:207:0x2e77, B:212:0x2f3c, B:214:0x2f49, B:215:0x2f7a, B:238:0x3369, B:240:0x337c, B:241:0x33ca, B:268:0x36c0, B:270:0x36ca, B:271:0x36fe, B:302:0x29c7, B:304:0x29e0, B:305:0x2a1f, B:311:0x271d, B:313:0x2727, B:314:0x2761, B:384:0x0d2c, B:386:0x0d36, B:387:0x0d70, B:397:0x0649, B:399:0x0653, B:400:0x068d, B:407:0x06d5, B:409:0x06df, B:410:0x070b), top: B:5:0x0132 }] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0fd5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object[] D8871(Context context, int i, int i2, int i3) {
            int i4;
            Object obj;
            int i5;
            String str;
            int i6;
            char c2;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            String next;
            char c3;
            Class cls;
            char c4;
            int i24;
            int i25;
            Object[] objArr;
            char c5;
            int i26;
            Object f2;
            Object invoke;
            int i27;
            int i28;
            float f3;
            String[][] strArr;
            int i29;
            int i30;
            int i31;
            int i32;
            int i33;
            String str2;
            File file;
            String str3;
            String[][] strArr2;
            int i34;
            String[] strArr3;
            String str4;
            int i35;
            String next2;
            String next3;
            int i36 = 1;
            c = (d + 1) % 128;
            int i37 = 8 - (~(-(-ExpandableListView.getPackedPositionChild(0L))));
            char maxKeyCode = (char) (45991 - (KeyEvent.getMaxKeyCode() >> 16));
            int i38 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
            int i39 = (i38 ^ 717) + ((i38 & 717) << 1);
            Object[] objArr2 = new Object[1];
            b(maxKeyCode, i37, i39, objArr2);
            int i40 = 0;
            String str5 = (String) objArr2[0];
            Object[] objArr3 = new Object[1];
            b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-16777190) - (~(-Color.rgb(0, 0, 0))), View.combineMeasuredStates(0, 0), objArr3);
            String str6 = (String) objArr3[0];
            int i41 = -(ViewConfiguration.getPressedStateDuration() >> 16);
            int i42 = (i41 ^ 25) + ((i41 & 25) << 1);
            String str7 = "";
            int indexOf = TextUtils.indexOf("", "", 0, 0);
            int i43 = -(Process.myPid() >> 22);
            int i44 = (i43 & 27) + (i43 | 27);
            Object[] objArr4 = new Object[1];
            b((char) ((indexOf ^ 51382) + ((indexOf & 51382) << 1)), i42, i44, objArr4);
            String str8 = (String) objArr4[0];
            int i45 = -(Process.myTid() >> 22);
            Object[] objArr5 = new Object[1];
            b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (i45 & 18) + (i45 | 18), 52 - (Process.myTid() >> 22), objArr5);
            String str9 = (String) objArr5[0];
            int blue = Color.blue(0) + 28;
            int i46 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int i47 = (i46 * 371) + 7952385;
            int i48 = ~i;
            int i49 = ~(((-21436) ^ i48) | ((-21436) & i48));
            int i50 = ~i46;
            float f4 = 0.0f;
            int i51 = ~((i50 ^ i) | (i50 & i));
            int i52 = -(-(((i49 ^ i51) | (i49 & i51)) * (-370)));
            int i53 = ((i47 | i52) << 1) - (i52 ^ i47);
            int i54 = ~((i50 ^ i48) | (i50 & i48));
            int i55 = ~(((-21436) ^ i) | ((-21436) & i));
            int i56 = (i54 & i55) | (i54 ^ i55);
            int i57 = ~((i46 ^ 21435) | (i46 & 21435));
            int i58 = ((i56 & i57) | (i56 ^ i57)) * (-370);
            int i59 = ((i53 | i58) << 1) - (i58 ^ i53);
            int i60 = i57 * 370;
            char c6 = (char) (((i59 | i60) << 1) - (i60 ^ i59));
            int i61 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
            int i62 = (i61 & 71) + (i61 | 71);
            Object[] objArr6 = new Object[1];
            b(c6, blue, i62, objArr6);
            String[] strArr4 = {str6, str8, str9, (String) objArr6[0]};
            int i63 = 0;
            while (true) {
                if (i63 >= 4) {
                    i4 = 2;
                    obj = null;
                    i5 = 4;
                    str = str7;
                    i6 = -1;
                    c2 = ' ';
                    i7 = i;
                    break;
                }
                try {
                    Object[] objArr7 = {strArr4[i63]};
                    Object f5 = rV4669.f(-1567326429);
                    if (f5 == null) {
                        i6 = -1;
                        c2 = ' ';
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 52;
                        i5 = 4;
                        Object[] objArr8 = new Object[1];
                        c((byte) 2, (short) 0, (short) 1, objArr8);
                        f5 = rV4669.g(6047 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), windowTouchSlop, 724607559, (String) objArr8[0], new Class[]{String.class});
                    } else {
                        i5 = 4;
                        i6 = -1;
                        c2 = ' ';
                    }
                    long longValue = ((Long) ((Method) f5).invoke(null, objArr7)).longValue();
                    obj = null;
                    long j = longValue ^ (-1);
                    long j2 = (-103094316) | j;
                    i4 = 2;
                    str = str7;
                    long freeMemory = (int) Runtime.getRuntime().freeMemory();
                    long j3 = freeMemory ^ (-1);
                    long e2 = com.fingerprintjs.android.fpjs_pro.g.e(497L, (((-103094316) | j3) ^ (-1)) | (((-103094316) | longValue) ^ (-1)) | (((j | 103094315) | freeMemory) ^ (-1)), ((((j2 | freeMemory) ^ (-1)) | (((j | j3) | 103094315) ^ (-1))) * 497) + ((j2 ^ (-1)) * 497) + (((-496) * longValue) - 51134780240L), 399659924L);
                    int myTid = Process.myTid();
                    int i64 = ((int) (e2 >> c2)) & (((myTid | (-39242790)) * 744) + (((~myTid) | 1476469200) * 744) + (((~((-49729072) | myTid)) | 39242789 | (~(1486955482 | myTid))) * (-744)) + 1587634074);
                    int uptimeMillis = (int) SystemClock.uptimeMillis();
                    int i65 = ((int) e2) & ((((~((~uptimeMillis) | 676130318)) | 676095498) * 564) + ((~(uptimeMillis | (-85000594))) * 1128) + (((((~(761096091 | r10)) | 676130318) | (~((-761096092) | uptimeMillis))) * (-564)) - 2113282127));
                    if (((i64 & i65) | (i64 ^ i65)) != 0) {
                        int i66 = (i63 ^ 190) + ((i63 & 190) << 1);
                        i7 = (i66 & i48) | ((~i66) & i);
                        break;
                    }
                    int i67 = ((i63 | 105) << 1) - (i63 ^ 105);
                    i63 = (i67 & (-104)) + (i67 | (-104));
                    str7 = str;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i68 = 3;
            if (i7 != i) {
                com.fingerprintjs.android.fpjs_pro.r.a();
                com.fingerprintjs.android.fpjs_pro.r.a();
                Object[] objArr9 = new Object[5];
                int[] iArr = new int[1];
                objArr9[0] = iArr;
                int[] iArr2 = new int[1];
                objArr9[1] = iArr2;
                int[] iArr3 = new int[1];
                objArr9[3] = iArr3;
                iArr2[0] = i;
                iArr[0] = i7;
                objArr9[i5] = obj;
                objArr9[i4] = obj;
                int a2 = k84.a((~(621264746 | i48)) | (-108751983), 381, ((i | (-41435141)) * (-381)) - 1807325636, -1393080828);
                int i69 = (i3 & a2) + (a2 | i3);
                int i70 = i69 << 13;
                int i71 = (i70 | i69) & (~(i69 & i70));
                int i72 = i71 >>> 17;
                int i73 = ((~i71) & i72) | ((~i72) & i71);
                iArr3[0] = i73 ^ (i73 << 5);
                return objArr9;
            }
            int i74 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i75 = (i74 ^ 12) + ((i74 & 12) << 1);
            int i76 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
            int i77 = -ImageFormat.getBitsPerPixel(0);
            int i78 = (i77 & 97) + (i77 | 97);
            Object[] objArr10 = new Object[1];
            b((char) ((i76 ^ 32754) + ((i76 & 32754) << 1)), i75, i78, objArr10);
            String str10 = (String) objArr10[0];
            int i79 = 12 - (~(-(ViewConfiguration.getTapTimeout() >> 16)));
            int i80 = -View.resolveSize(0, 0);
            int i81 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int i82 = ((i81 | 109) << 1) - (i81 ^ 109);
            Object[] objArr11 = new Object[1];
            b((char) (((i80 | 39462) << 1) - (i80 ^ 39462)), i79, i82, objArr11);
            String str11 = (String) objArr11[0];
            int i83 = -View.MeasureSpec.getMode(0);
            Object[] objArr12 = new Object[1];
            b((char) Color.red(0), ((i83 | 18) << 1) - (i83 ^ 18), 122 - (~(-KeyEvent.getDeadChar(0, 0))), objArr12);
            String[] strArr5 = {str10, str11, (String) objArr12[0]};
            int i84 = 0;
            while (true) {
                i8 = f;
                if (i84 >= i68) {
                    i9 = i40;
                    i10 = i68;
                    i11 = i;
                    break;
                }
                Object[] objArr13 = {strArr5[i84]};
                Object f6 = rV4669.f(-668483483);
                if (f6 == null) {
                    int i85 = 53 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    byte b2 = (byte) (i8 & 5);
                    i10 = i68;
                    byte b3 = (byte) (b2 + 1);
                    i9 = i40;
                    Object[] objArr14 = new Object[i36];
                    c(b3, b2, (byte) (b3 - 1), objArr14);
                    f6 = rV4669.g(Drawable.resolveOpacity(i40, i40) + 6046, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), i85, 1367547137, (String) objArr14[i9], new Class[]{String.class});
                } else {
                    i9 = i40;
                    i10 = i68;
                }
                long longValue2 = ((Long) ((Method) f6).invoke(obj, objArr13)).longValue();
                long j4 = longValue2 ^ (-1);
                String[] strArr6 = strArr5;
                long elapsedRealtime = (int) SystemClock.elapsedRealtime();
                long j5 = elapsedRealtime ^ (-1);
                long j6 = (1225867908 | longValue2) ^ (-1);
                long e3 = com.fingerprintjs.android.fpjs_pro.g.e(370L, j6, ((-370) * ((((-1225867909) | j5) ^ (-1)) | ((j4 | elapsedRealtime) ^ (-1)) | j6)) + ((((j4 | j5) ^ (-1)) | (((-1225867909) | elapsedRealtime) ^ (-1))) * (-370)) + (371 * longValue2) + 454796993868L, 713682099L);
                int i86 = ((int) (e3 >> c2)) & ((((~((-1655462084) | i48)) | (~((-218235673) | i48))) * 614) + (((~(491947832 | i48)) | (-2147409916) | (~(1929174243 | i48))) * (-1228)) + (((-1873697756) | i) * 614) + 926956162);
                int freeMemory2 = (int) Runtime.getRuntime().freeMemory();
                if (((((int) e3) & ((((~(freeMemory2 | (-527426082))) | 174440480 | (~((~freeMemory2) | (-1611666891)))) * 164) + (((-1964652492) | freeMemory2) * 164) + ((((~(527426081 | r5)) | (-1964652492)) * (-328)) - 2116219263))) | i86) != 0) {
                    int i87 = c;
                    d = ((i87 & 79) + (i87 | 79)) % 128;
                    int i88 = (i84 & 270) + (i84 | 270);
                    i11 = (i88 & i48) | ((~i88) & i);
                    break;
                }
                i84++;
                strArr5 = strArr6;
                i68 = i10;
                i40 = i9;
                i36 = 1;
                obj = null;
            }
            if (i11 != i) {
                Object[] objArr15 = new Object[5];
                int[] iArr4 = new int[1];
                objArr15[i9] = iArr4;
                int[] iArr5 = new int[1];
                objArr15[1] = iArr5;
                int[] iArr6 = new int[1];
                objArr15[i10] = iArr6;
                iArr5[i9] = i;
                iArr4[i9] = i11;
                objArr15[i5] = null;
                objArr15[i4] = null;
                int i89 = (~((-352513805) | i48)) | 285254400;
                int i90 = ~(i | 931393390);
                int i91 = ((i90 | (~((-67259405) | i48))) * 252) + ((i89 | i90) * (-252)) + 86312558;
                int i92 = -(-(((i91 | 16) << 1) - (i91 ^ 16)));
                int i93 = (i3 ^ i92) + ((i92 & i3) << 1);
                int i94 = i93 << 13;
                int i95 = (i94 & (~i93)) | ((~i94) & i93);
                int i96 = i95 ^ (i95 >>> 17);
                iArr6[i9] = i96 ^ (i96 << 5);
                return objArr15;
            }
            int green = Color.green(i9);
            int i97 = (green & 14) + (green | 14);
            String str12 = str;
            int i98 = -TextUtils.getOffsetAfter(str12, i9);
            int i99 = -ExpandableListView.getPackedPositionGroup(0L);
            int i100 = (i99 & 141) + (i99 | 141);
            Object[] objArr16 = new Object[1];
            b((char) ((i98 ^ 32094) + ((i98 & 32094) << 1)), i97, i100, objArr16);
            Object[] objArr17 = {(String) objArr16[0]};
            Object f7 = rV4669.f(-1355975516);
            byte[] bArr = e;
            if (f7 == null) {
                int i101 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6045;
                char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int windowTouchSlop2 = 52 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte b4 = bArr[6];
                i12 = -1355975516;
                Object[] objArr18 = new Object[1];
                c(b4, (short) 0, (byte) (b4 - 3), objArr18);
                f7 = rV4669.g(i101, maximumFlingVelocity, windowTouchSlop2, 646556096, (String) objArr18[0], new Class[]{String.class});
            } else {
                i12 = -1355975516;
            }
            long longValue3 = ((Long) ((Method) f7).invoke(null, objArr17)).longValue();
            long j7 = ((-1772130929) | longValue3) ^ (-1);
            long j8 = i;
            long j9 = j8 ^ (-1);
            long j10 = ((-1188) * (j7 | ((j9 | longValue3) ^ (-1)))) + ((-1187) * longValue3) + 1054417902160L;
            long j11 = longValue3 ^ (-1);
            long j12 = (j9 | 1772130928) ^ (-1);
            long e4 = com.fingerprintjs.android.fpjs_pro.g.e(594L, ((j11 | 1772130928) ^ (-1)) | ((j11 | j9) ^ (-1)) | j12, ((j7 | ((j11 | j8) ^ (-1)) | j12) * 594) + j10, -2112648567L);
            int freeMemory3 = (int) Runtime.getRuntime().freeMemory();
            int i102 = ~((-11026705) | freeMemory3);
            int i103 = (((~((~freeMemory3) | (-11026705))) * 476) + (i102 * 952) + ((1157761152 | i102) * (-476)) + 1821977066) & ((int) (e4 >> c2));
            int i104 = (int) Runtime.getRuntime().totalMemory();
            int i105 = ~(2001287426 | i104);
            int i106 = ~i104;
            int i107 = ((int) e4) & ((((~(i104 | (-564061017))) | (~((-2001287427) | i106))) * 406) + ((~(2011167578 | i106)) * (-406)) + ((i105 | (~((-1447106563) | i106))) * (-406)) + 708358659);
            if (((i107 & i103) | (i103 ^ i107)) != 0) {
                i15 = (~(i & 266)) & (i | 266);
                i14 = 24;
                i13 = -417469134;
            } else {
                int maximumFlingVelocity2 = 24 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                char offsetAfter = (char) TextUtils.getOffsetAfter(str12, 0);
                int i108 = -KeyEvent.normalizeMetaState(0);
                i13 = -417469134;
                Object[] objArr19 = new Object[1];
                b(offsetAfter, maximumFlingVelocity2, (i108 & 155) + (i108 | 155), objArr19);
                Object[] objArr20 = {(String) objArr19[0]};
                Object f8 = rV4669.f(-417469134);
                if (f8 == null) {
                    int i109 = 6203 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    char c7 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int i110 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 51;
                    i14 = 24;
                    Object[] objArr21 = new Object[1];
                    c((byte) 0, (short) 0, (short) 0, objArr21);
                    f8 = rV4669.g(i109, c7, i110, 1857630294, (String) objArr21[0], new Class[]{String.class});
                } else {
                    i14 = 24;
                }
                String str13 = (String) ((Method) f8).invoke(null, objArr20);
                if (str13 == null || str13.length() == 0) {
                    int indexOf2 = TextUtils.indexOf((CharSequence) str12, '0', 0);
                    Object[] objArr22 = new Object[1];
                    b((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1)), (indexOf2 & 25) + (indexOf2 | 25), 178 - (~KeyEvent.getDeadChar(0, 0)), objArr22);
                    Object[] objArr23 = {(String) objArr22[0]};
                    Object f9 = rV4669.f(-417469134);
                    if (f9 == null) {
                        int lastIndexOf = TextUtils.lastIndexOf(str12, '0', 0, 0) + 6203;
                        char makeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                        int normalizeMetaState = KeyEvent.normalizeMetaState(0) + 51;
                        Object[] objArr24 = new Object[1];
                        c((byte) 0, (short) 0, (short) 0, objArr24);
                        f9 = rV4669.g(lastIndexOf, makeMeasureSpec, normalizeMetaState, 1857630294, (String) objArr24[0], new Class[]{String.class});
                    }
                    String str14 = (String) ((Method) f9).invoke(null, objArr23);
                    if (str14 == null || str14.length() == 0) {
                        i15 = i;
                    }
                } else {
                    int i111 = c;
                    d = ((i111 ^ 85) + ((i111 & 85) << 1)) % 128;
                }
                i15 = (i & (-268)) | (i48 & 267);
            }
            if (i15 != i) {
                Object[] objArr25 = new Object[5];
                int[] iArr7 = new int[1];
                objArr25[0] = iArr7;
                int[] iArr8 = new int[1];
                objArr25[1] = iArr8;
                int[] iArr9 = new int[1];
                objArr25[i10] = iArr9;
                iArr8[0] = i;
                iArr7[0] = i15;
                objArr25[i5] = null;
                objArr25[i4] = null;
                int i112 = (((~(i | 880017389)) | (~((-877772706) | i48)) | 336630401) * 757) + ((~((-541142305) | i)) * 1514) + ((338875085 | i48) * (-757)) + 1293042570;
                int i113 = -(-((i112 & 16) + (i112 | 16)));
                int i114 = (i3 ^ i113) + ((i113 & i3) << 1);
                int i115 = (i114 << 13) ^ i114;
                int i116 = i115 >>> 17;
                int i117 = ((~i115) & i116) | ((~i116) & i115);
                iArr9[0] = i117 ^ (i117 << 5);
                return objArr25;
            }
            Object f10 = rV4669.f(-409411793);
            if (f10 == null) {
                int defaultSize = 6511 - View.getDefaultSize(0, 0);
                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int deadChar = 52 - KeyEvent.getDeadChar(0, 0);
                byte b5 = (byte) (i8 & 5);
                byte b6 = (byte) (b5 + 1);
                Object[] objArr26 = new Object[1];
                c(b6, b5, (byte) (b6 - 1), objArr26);
                f10 = rV4669.g(defaultSize, threadPriority, deadChar, 1849426507, (String) objArr26[0], new Class[0]);
            }
            long longValue4 = ((Long) ((Method) f10).invoke(null, null)).longValue();
            long myPid = Process.myPid();
            long j13 = myPid ^ (-1);
            long j14 = ((-1531752448) | longValue4) ^ (-1);
            long e5 = com.fingerprintjs.android.fpjs_pro.g.e(397L, myPid | j14 | (((longValue4 ^ (-1)) | 1531752447) ^ (-1)), ((-397) * j14) + (((((-1531752448) | j13) ^ (-1)) | j14 | ((j13 | longValue4) ^ (-1))) * (-397)) + ((-396) * longValue4) + 609637473906L, -1902427545L);
            int elapsedRealtime2 = (int) SystemClock.elapsedRealtime();
            int i118 = ((int) (e5 >> c2)) & ((((~((~elapsedRealtime2) | 1874812917)) | 590208) * 449) + (((~(1874812917 | elapsedRealtime2)) | 590208) * 449) + 884629792);
            int i119 = (int) Runtime.getRuntime().totalMemory();
            int i120 = (((int) e5) & ((((~(i119 | (-977098170))) | (-1880642717)) * 502) + ((~((~i119) | (-1073741829))) * (-502)) + (((~((-1880642717) | i119)) | (-2050839998)) * (-502)) + 1170570103)) | i118;
            if (i120 != 0) {
                d = (c + 29) % 128;
                int i121 = -(-(i120 - 1));
                int i122 = (i121 & 200) + (i121 | 200);
                i16 = ((~i122) & i) | (i122 & i48);
            } else {
                i16 = i;
            }
            if (i16 != i) {
                c = (d + 115) % 128;
                Object[] objArr27 = new Object[5];
                int[] iArr10 = new int[1];
                objArr27[0] = iArr10;
                int[] iArr11 = new int[1];
                objArr27[1] = iArr11;
                objArr27[i10] = new int[1];
                iArr11[0] = i;
                iArr10[0] = i16;
                objArr27[i5] = null;
                objArr27[i4] = null;
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i123 = ~elapsedCpuTime;
                int i124 = (~((-727206429) | i123)) | 151537680;
                int i125 = -(-com.fingerprintjs.android.fpjs_pro.g.b((~(elapsedCpuTime | 1065110110)) | (~(i123 | (-575668749))), 502, ((i124 | r0) * (-502)) - 20848178, -16));
                int i126 = (i3 & i125) + (i125 | i3);
                int i127 = (i126 << 13) ^ i126;
                int i128 = i127 >>> 17;
                int i129 = ((~i127) & i128) | ((~i128) & i127);
                ((int[]) objArr27[i10])[0] = i129 ^ (i129 << 5);
                return objArr27;
            }
            int i130 = 19 - (~(-Color.green(0)));
            int i131 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int i132 = -(-MotionEvent.axisFromString(str12));
            int i133 = ((i132 | MlKitException.CODE_SCANNER_TASK_IN_PROGRESS) << 1) - (i132 ^ MlKitException.CODE_SCANNER_TASK_IN_PROGRESS);
            Object[] objArr28 = new Object[1];
            b((char) ((i131 & 46388) + (i131 | 46388)), i130, i133, objArr28);
            String str15 = (String) objArr28[0];
            int i134 = 5 - (~(-TextUtils.getOffsetAfter(str12, 0)));
            char c8 = (char) (7721 - (~(-(-TextUtils.indexOf((CharSequence) str12, '0')))));
            int i135 = -TextUtils.getCapsMode(str12, 0, 0);
            int i136 = i135 * 302;
            int i137 = (i136 ^ 134469) + ((i136 & 134469) << 1);
            int i138 = ~i135;
            int i139 = ~((i138 ^ i48) | (i138 & i48));
            int i140 = ((i139 ^ 223) | (i139 & 223)) * (-602);
            int i141 = ((i137 | i140) << 1) - (i137 ^ i140);
            int i142 = (~(i138 | (-224))) | (~((i138 ^ i) | (i138 & i)));
            int i143 = (i135 & i48) | (i48 ^ i135);
            int i144 = ~((i143 & 223) | (i143 ^ 223));
            int i145 = ((i142 & i144) | (i142 ^ i144)) * (-301);
            int i146 = ((i141 | i145) << 1) - (i145 ^ i141);
            int i147 = -(-((~((i48 ^ 223) | (i48 & 223))) * MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE));
            int i148 = ((i146 | i147) << 1) - (i147 ^ i146);
            Object[] objArr29 = new Object[1];
            b(c8, i134, i148, objArr29);
            Object[] objArr30 = new Object[i4];
            objArr30[1] = (String) objArr29[0];
            objArr30[0] = str15;
            Object f11 = rV4669.f(1730286819);
            if (f11 == null) {
                int i149 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3264;
                char c9 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int blue2 = Color.blue(0) + 52;
                byte b7 = (byte) (i8 & 5);
                byte b8 = (byte) (b7 + 1);
                Object[] objArr31 = new Object[1];
                c(b8, b7, (byte) (b8 - 1), objArr31);
                f11 = rV4669.g(i149, c9, blue2, -293156473, (String) objArr31[0], new Class[]{String.class, String.class});
            }
            long longValue5 = ((Long) ((Method) f11).invoke(null, objArr30)).longValue();
            long j15 = ((-657) * longValue5) - 615073632736L;
            long j16 = (933343903 | longValue5) ^ (-1);
            long j17 = ((longValue5 ^ (-1)) | (-933343904)) ^ (-1);
            long myPid2 = ((-933343904) | Process.myPid()) ^ (-1);
            long e6 = com.fingerprintjs.android.fpjs_pro.g.e(658L, j17 | myPid2, (658 * j17) + ((-658) * (j16 | j17 | myPid2)) + j15, -746434492L);
            int i150 = ((int) (e6 >> c2)) & ((((~((-2067001941) | i)) | 1513251412 | (~((-76025002) | i48))) * 521) + (((-629775530) | i) * 521) + (((~(i48 | (-629775530))) | 2067001940) * (-1042)) + 2003982488);
            int freeMemory4 = (int) Runtime.getRuntime().freeMemory();
            int i151 = ~freeMemory4;
            int i152 = ((int) e6) & ((((~(freeMemory4 | (-173411483))) | (~(i151 | (-1946182470))) | (~(508956059 | i151))) * 568) + (((~(i151 | (-1610637893))) | (~((-508956060) | freeMemory4)) | (~(1946182469 | freeMemory4))) * (-568)) + ((((~(1946182469 | i151)) | ((~((-508956060) | i151)) | 173411482)) * (-1136)) - 1738041619));
            int i153 = ((i152 & i150) | (i150 ^ i152)) != 0 ? i ^ 262 : i;
            if (i153 != i) {
                int i154 = c;
                d = (((i154 | 69) << 1) - (i154 ^ 69)) % 128;
                Object[] objArr32 = new Object[5];
                int[] iArr12 = new int[1];
                objArr32[0] = iArr12;
                int[] iArr13 = new int[1];
                objArr32[1] = iArr13;
                int[] iArr14 = new int[1];
                objArr32[i10] = iArr14;
                iArr13[0] = i;
                iArr12[0] = i153;
                objArr32[i5] = null;
                objArr32[2] = null;
                int b9 = com.fingerprintjs.android.fpjs_pro.g.b(~(i48 | 818876933), MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, (((~(i | (-397770858))) | 277151745 | (~(939496045 | i48))) * (-301)) + ((((~((-397770858) | i48)) | 818876933) * (-602)) - 270733915), -16);
                int i155 = (i3 & b9) + (b9 | i3);
                int i156 = (i155 << 13) ^ i155;
                int i157 = i156 >>> 17;
                int i158 = (i156 | i157) & (~(i156 & i157));
                iArr14[0] = i158 ^ (i158 << 5);
                return objArr32;
            }
            int i159 = -TextUtils.getOffsetAfter(str12, 0);
            int i160 = ((i159 | 31) << 1) - (i159 ^ 31);
            int i161 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int a3 = com.fingerprintjs.android.fpjs_pro.r.a();
            int i162 = i161 * 881;
            int i163 = ((i162 | 12148990) << 1) - (i162 ^ 12148990);
            int i164 = ~i161;
            int i165 = (~((i164 ^ (-13791)) | (i164 & (-13791)))) | (~(i164 | a3));
            int i166 = ~(((-13791) ^ a3) | ((-13791) & a3));
            int i167 = (((i165 ^ i166) | (i165 & i166)) * (-880)) + i163;
            int i168 = ~a3;
            int i169 = (~((i164 & i168) | (i164 ^ i168))) | 13790;
            int i170 = ~(i161 | a3);
            char c10 = (char) (((~((i161 & a3) | (i161 ^ a3))) * 880) + ((i167 - (~(-(-(((i169 & i170) | (i169 ^ i170)) * (-880)))))) - 1));
            int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
            int i171 = (minimumFlingVelocity & 229) + (minimumFlingVelocity | 229);
            Object[] objArr33 = new Object[1];
            b(c10, i160, i171, objArr33);
            String str16 = (String) objArr33[0];
            int i172 = 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            int red = Color.red(0);
            Object[] objArr34 = new Object[1];
            b((char) ((red & 16850) + (red | 16850)), i172, 258 - (~(-TextUtils.lastIndexOf(str12, '0', 0, 0))), objArr34);
            String str17 = (String) objArr34[0];
            int pressedStateDuration = 28 - (ViewConfiguration.getPressedStateDuration() >> 16);
            int i173 = -(-(ViewConfiguration.getTouchSlop() >> 8));
            int gidForName = Process.getGidForName(str12);
            int i174 = ((gidForName | 284) << 1) - (gidForName ^ 284);
            Object[] objArr35 = new Object[1];
            b((char) ((i173 & 51434) + (i173 | 51434)), pressedStateDuration, i174, objArr35);
            String str18 = (String) objArr35[0];
            int scrollBarFadeDuration = 14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            char keyCodeFromString = (char) KeyEvent.keyCodeFromString(str12);
            int i175 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            Object[] objArr36 = new Object[1];
            b(keyCodeFromString, scrollBarFadeDuration, (i175 & 312) + (i175 | 312), objArr36);
            String[] strArr7 = {str16, str17, str18, (String) objArr36[0]};
            int i176 = 0;
            while (i176 < i5) {
                int i177 = d;
                int i178 = (i177 ^ 61) + ((i177 & 61) << 1);
                c = i178 % 128;
                if (i178 % 2 != 0) {
                    Object[] objArr37 = {strArr7[i176]};
                    Object f12 = rV4669.f(i12);
                    if (f12 == null) {
                        int size = View.MeasureSpec.getSize(0) + 6046;
                        char scrollBarFadeDuration2 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        float f13 = f4;
                        int i179 = 52 - (TypedValue.complexToFraction(0, f13, f13) > f13 ? 1 : (TypedValue.complexToFraction(0, f13, f13) == f13 ? 0 : -1));
                        byte b10 = bArr[6];
                        Object[] objArr38 = new Object[1];
                        c(b10, (short) 0, (byte) (b10 - 3), objArr38);
                        f12 = rV4669.g(size, scrollBarFadeDuration2, i179, 646556096, (String) objArr38[0], new Class[]{String.class});
                    }
                    long longValue6 = ((Long) ((Method) f12).invoke(null, objArr37)).longValue();
                    long j18 = longValue6 ^ (-1);
                    long elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                    long e7 = com.fingerprintjs.android.fpjs_pro.g.e(366L, (((-1282596182) | longValue6) ^ (-1)) | (((j18 | 1282596181) | elapsedCpuTime2) ^ (-1)), ((-366) * (1282596181 | ((j18 | elapsedCpuTime2) ^ (-1)))) + ((1282596181 | longValue6) * (-366)) + (367 * longValue6) + 470712798427L, -1623113820L);
                    int i180 = ((int) (e7 << 119)) & ((((-1835828154) | (~(398601742 | i)) | (~(i48 | (-398601743)))) * 45) + (((~((-1835828154) | i)) | 310520838) * (-45)) + (((~((-1835828154) | i48)) | (-398601743)) * (-90)) + 1687905420);
                    int i181 = ~hdi.b(1420886513);
                    int i182 = ((int) e7) & ((((~(28138051 | i181)) | (~(i181 | (-1409088359)))) * 590) + (((~(1409088358 | i181)) | 65537 | (~((-28138052) | i181))) * (-1180)) + ((((~(r6 | (-1381015845))) | r10) * 590) - 154121301));
                    if (((i182 & i180) | (i180 ^ i182)) != 0) {
                        i17 = ((i176 & 252) + (i176 | 252)) ^ i;
                        break;
                    }
                    int i183 = (i176 & WebSocketProtocol.PAYLOAD_SHORT) + (i176 | WebSocketProtocol.PAYLOAD_SHORT);
                    i176 = (i183 & (-125)) + (i183 | (-125));
                    f4 = 0.0f;
                    i5 = 4;
                } else {
                    Object[] objArr39 = {strArr7[i176]};
                    Object f14 = rV4669.f(i12);
                    if (f14 == null) {
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 6046;
                        char lastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf(str12, '0', 0));
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 52;
                        byte b11 = bArr[6];
                        Object[] objArr40 = new Object[1];
                        c(b11, (short) 0, (byte) (b11 - 3), objArr40);
                        f14 = rV4669.g(packedPositionGroup, lastIndexOf2, keyRepeatTimeout, 646556096, (String) objArr40[0], new Class[]{String.class});
                    }
                    long longValue7 = ((Long) ((Method) f14).invoke(null, objArr39)).longValue();
                    long j19 = ((-216) * longValue7) - 369580493924L;
                    long j20 = longValue7 ^ (-1);
                    long e8 = com.fingerprintjs.android.fpjs_pro.g.e(217L, 853534628 | ((j20 | j9) ^ (-1)), (((((-853534629) | j20) ^ (-1)) | (((-853534629) | j8) ^ (-1))) * 217) + (((((-853534629) | j9) ^ (-1)) | ((j20 | j8) ^ (-1))) * 217) + j19, -1194052267L);
                    int myTid2 = Process.myTid();
                    int i184 = ((int) (e8 >> c2)) & ((((~(641144591 | myTid2)) | 68555525) * 49) + (((~((-2078371003) | (~myTid2))) | 641144591 | (~(2078371002 | myTid2))) * (-49)) + ((((~(641144591 | r10)) | (-2146926528)) * 98) - 1394149020));
                    int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                    int i185 = ~elapsedCpuTime3;
                    int i186 = (((~((-538431293) | i185)) | 346384) * (-1188)) + 1255634477;
                    int i187 = (~(elapsedCpuTime3 | 538431292)) | 346384;
                    int i188 = ~((-898795118) | i185);
                    int i189 = ((int) e8) & ((((~(i185 | 538431292)) | 360710209 | i188) * 594) + ((i187 | i188) * 594) + i186);
                    if (((i189 & i184) | (i184 ^ i189)) != 0) {
                        i17 = ((i176 & 252) + (i176 | 252)) ^ i;
                        break;
                    }
                    int i1832 = (i176 & WebSocketProtocol.PAYLOAD_SHORT) + (i176 | WebSocketProtocol.PAYLOAD_SHORT);
                    i176 = (i1832 & (-125)) + (i1832 | (-125));
                    f4 = 0.0f;
                    i5 = 4;
                }
            }
            i17 = i;
            if (i17 != i) {
                Object[] objArr41 = new Object[5];
                int[] iArr15 = new int[1];
                objArr41[0] = iArr15;
                int[] iArr16 = new int[1];
                objArr41[1] = iArr16;
                int[] iArr17 = new int[1];
                objArr41[i10] = iArr17;
                iArr16[0] = i;
                iArr15[0] = i17;
                objArr41[4] = null;
                objArr41[2] = null;
                int i190 = (((~(i | 331940565)) | (~((-884707226) | i48)) | (~(884707225 | i))) * 831) + ((~((-54526021) | i)) * (-1662)) + (((~((-331940566) | i48)) | (~(939233245 | i))) * (-831)) + 1429054002;
                int i191 = (i190 & 16) + (i190 | 16) + i3;
                int i192 = i191 << 13;
                int i193 = (i192 & (~i191)) | ((~i192) & i191);
                int i194 = i193 >>> 17;
                int i195 = ((~i193) & i194) | ((~i194) & i193);
                int i196 = i195 << 5;
                iArr17[0] = (i195 | i196) & (~(i195 & i196));
                return objArr41;
            }
            int rgb = Color.rgb(0, 0, 0);
            int i197 = (rgb * 141) - 385879595;
            int i198 = ((i ^ 16777229) | (i & 16777229)) * 140;
            int i199 = ((i197 | i198) << 1) - (i197 ^ i198);
            int i200 = ~rgb;
            int i201 = (i200 & 16777229) | (i200 ^ 16777229);
            int i202 = ~i201;
            int i203 = ~((16777229 & i48) | (i48 ^ 16777229));
            int i204 = (((i203 & i202) | (i202 ^ i203)) * (-280)) + i199;
            int i205 = ~(((-16777230) & rgb) | ((-16777230) ^ rgb));
            int i206 = ~(rgb | i48);
            int i207 = (((i206 & i205) | (i205 ^ i206) | (~((i201 & i) | (i201 ^ i)))) * 140) + i204;
            char c11 = (char) (0 - (~(-(-TextUtils.indexOf((CharSequence) str12, '0', 0, 0)))));
            int i208 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
            int i209 = i208 * 960;
            int i210 = ((i209 | (-623025)) << 1) - (i209 ^ (-623025));
            int i211 = ~(((-326) & i48) | ((-326) ^ i48));
            int i212 = ~(i208 | i);
            int i213 = -(-(((i211 & i212) | (i211 ^ i212)) * 959));
            int i214 = ((i210 ^ i213) + ((i213 & i210) << 1)) - (-312634);
            int i215 = ~(((-326) & i) | ((-326) ^ i));
            int i216 = ~((i208 & i48) | (i48 ^ i208));
            int i217 = ((i216 & i215) | (i215 ^ i216)) * 959;
            int i218 = (i214 ^ i217) + ((i217 & i214) << 1);
            Object[] objArr42 = new Object[1];
            b(c11, i207, i218, objArr42);
            Object[] objArr43 = {(String) objArr42[0]};
            Object f15 = rV4669.f(i13);
            if (f15 == null) {
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 6202;
                char indexOf3 = (char) TextUtils.indexOf(str12, str12);
                int offsetAfter2 = TextUtils.getOffsetAfter(str12, 0) + 51;
                Object[] objArr44 = new Object[1];
                c((byte) 0, (short) 0, (short) 0, objArr44);
                f15 = rV4669.g(fadingEdgeLength, indexOf3, offsetAfter2, 1857630294, (String) objArr44[0], new Class[]{String.class});
            }
            String str19 = (String) ((Method) f15).invoke(null, objArr43);
            if (str19 != null) {
                int i219 = -TextUtils.getOffsetBefore(str12, 0);
                int i220 = (i219 ^ 9) + ((i219 & 9) << 1);
                int i221 = -(-Process.getGidForName(str12));
                int i222 = -ExpandableListView.getPackedPositionGroup(0L);
                int i223 = (i222 ^ 338) + ((i222 & 338) << 1);
                Object[] objArr45 = new Object[1];
                b((char) (((i221 | 1) << 1) - (i221 ^ 1)), i220, i223, objArr45);
                if (str19.contains((String) objArr45[0])) {
                    i18 = (i & (-251)) | (i48 & RadarSimpleLogBuffer.PURGE_AMOUNT);
                    if (i18 == i) {
                        Object[] objArr46 = new Object[5];
                        int[] iArr18 = new int[1];
                        objArr46[0] = iArr18;
                        int[] iArr19 = new int[1];
                        objArr46[1] = iArr19;
                        int[] iArr20 = new int[1];
                        objArr46[i10] = iArr20;
                        iArr19[0] = i;
                        iArr18[0] = i18;
                        objArr46[4] = null;
                        objArr46[2] = null;
                        int i224 = (((~(i | 572333280)) | 75131246) * 70) + ((~(645889518 | i)) * 70) + (((~(644314510 | i)) | 1575008) * (-140)) + 472928986;
                        int i225 = ((i224 | 16) << 1) - (i224 ^ 16);
                        int i226 = (i3 ^ i225) + ((i3 & i225) << 1);
                        int i227 = i226 << 13;
                        int i228 = ((~i226) & i227) | ((~i227) & i226);
                        int i229 = i228 >>> 17;
                        int i230 = (i228 | i229) & (~(i228 & i229));
                        int i231 = i230 << 5;
                        iArr20[0] = ((~i230) & i231) | ((~i231) & i230);
                        return objArr46;
                    }
                    int i232 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
                    Object[] objArr47 = new Object[1];
                    b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1867), ((i232 | 17) << 1) - (i232 ^ 17), 347 - (~(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))), objArr47);
                    String str20 = (String) objArr47[0];
                    int i233 = -(-(ViewConfiguration.getTapTimeout() >> 16));
                    Object[] objArr48 = new Object[1];
                    b((char) (57012 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (i233 & 6) + (i233 | 6), 363 - (~Color.blue(0)), objArr48);
                    String str21 = (String) objArr48[0];
                    File file2 = new File(str20);
                    if (file2.exists() && file2.isFile()) {
                        try {
                            Scanner scanner = new Scanner(new FileInputStream(file2));
                            int i234 = -TextUtils.getTrimmedLength(str12);
                            int i235 = (i234 ^ 2) + ((i234 & 2) << 1);
                            char c12 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22037);
                            int i236 = -(-View.getDefaultSize(0, 0));
                            int i237 = (i236 ^ 370) + ((i236 & 370) << 1);
                            Object[] objArr49 = new Object[1];
                            b(c12, i235, i237, objArr49);
                            Scanner useDelimiter = scanner.useDelimiter((String) objArr49[0]);
                            next3 = useDelimiter.hasNext() ? useDelimiter.next() : str12;
                            useDelimiter.close();
                        } catch (IOException unused) {
                        }
                        if (next3.contains(str21)) {
                            i19 = i ^ 251;
                            if (i19 == i) {
                                Object[] objArr50 = new Object[5];
                                int[] iArr21 = new int[1];
                                objArr50[0] = iArr21;
                                int[] iArr22 = new int[1];
                                objArr50[1] = iArr22;
                                int[] iArr23 = new int[1];
                                objArr50[i10] = iArr23;
                                iArr22[0] = i;
                                iArr21[0] = i19;
                                objArr50[4] = null;
                                objArr50[2] = null;
                                int i238 = (((~((-779549360) | i48)) | 611477504) * 859) + (((~(i | (-168071856))) | (~(437098431 | i48))) * 859) + (((i | 437098431) * (-859)) - 890923234);
                                int i239 = (i238 & 16) + (i238 | 16) + i3;
                                int i240 = i239 ^ (i239 << 13);
                                int i241 = i240 >>> 17;
                                int i242 = ((~i240) & i241) | ((~i241) & i240);
                                int i243 = i242 << 5;
                                iArr23[0] = ((~i242) & i243) | ((~i243) & i242);
                                return objArr50;
                            }
                            Object[] objArr51 = new Object[1];
                            b((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23, 371 - (~KeyEvent.getDeadChar(0, 0)), objArr51);
                            Object[] objArr52 = {(String) objArr51[0]};
                            Object f16 = rV4669.f(i13);
                            if (f16 == null) {
                                int offsetAfter3 = TextUtils.getOffsetAfter(str12, 0) + 6202;
                                char mode = (char) View.MeasureSpec.getMode(0);
                                int myPid3 = (Process.myPid() >> 22) + 51;
                                Object[] objArr53 = new Object[1];
                                c((byte) 0, (short) 0, (short) 0, objArr53);
                                f16 = rV4669.g(offsetAfter3, mode, myPid3, 1857630294, (String) objArr53[0], new Class[]{String.class});
                            }
                            String lowerCase = ((String) ((Method) f16).invoke(null, objArr52)).toLowerCase();
                            int i244 = -ExpandableListView.getPackedPositionType(0L);
                            int i245 = ((i244 | 4) << 1) - (i244 ^ 4);
                            char scrollBarFadeDuration3 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int threadPriority2 = Process.getThreadPriority(0);
                            int i246 = ((threadPriority2 ^ 20) + ((threadPriority2 & 20) << 1)) >> 6;
                            int i247 = ~i246;
                            int i248 = (i247 ^ i48) | (i247 & i48);
                            int i249 = (i246 ^ 395) | (i246 & 395);
                            int i250 = (((~((i248 & 395) | (i248 ^ 395))) | (~((i249 & i) | (i249 ^ i)))) * (-302)) + ((i246 * 303) - 118895);
                            int i251 = (i247 ^ 395) | (i247 & 395);
                            int i252 = (~((i251 & i) | (i251 ^ i))) * (-604);
                            int i253 = ((i250 | i252) << 1) - (i252 ^ i250);
                            int i254 = ~(i246 | (-396));
                            int i255 = ~((i ^ 395) | (i & 395));
                            int i256 = ((i254 & i255) | (i254 ^ i255)) * 302;
                            int i257 = ((i253 | i256) << 1) - (i256 ^ i253);
                            Object[] objArr54 = new Object[1];
                            b(scrollBarFadeDuration3, i245, i257, objArr54);
                            int i258 = lowerCase.contains((String) objArr54[0]) ? i ^ 264 : i;
                            if (i258 != i) {
                                Object[] objArr55 = new Object[5];
                                int[] iArr24 = new int[1];
                                objArr55[0] = iArr24;
                                int[] iArr25 = new int[1];
                                objArr55[1] = iArr25;
                                int[] iArr26 = new int[1];
                                objArr55[i10] = iArr26;
                                iArr25[0] = i;
                                iArr24[0] = i258;
                                objArr55[4] = null;
                                objArr55[2] = null;
                                int i259 = -(-com.fingerprintjs.android.fpjs_pro.g.b(i | (-142951697), 591, (((~((-142951697) | i48)) | (-1073696095)) * (-591)) + 902522460, -16));
                                int i260 = ((i3 | i259) << 1) - (i259 ^ i3);
                                int i261 = i260 << 13;
                                int i262 = (i261 & (~i260)) | ((~i261) & i260);
                                int i263 = i262 >>> 17;
                                int i264 = (i262 | i263) & (~(i262 & i263));
                                int i265 = i264 << 5;
                                iArr26[0] = ((~i264) & i265) | ((~i265) & i264);
                                return objArr55;
                            }
                            int i266 = 41 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            int i267 = -(-TextUtils.indexOf(str12, str12));
                            Object[] objArr56 = new Object[1];
                            b((char) (((i267 | 64257) << 1) - (i267 ^ 64257)), i266, 398 - (~(-(KeyEvent.getMaxKeyCode() >> 16))), objArr56);
                            String str22 = (String) objArr56[0];
                            int minimumFlingVelocity2 = 40 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int myTid3 = Process.myTid() >> 22;
                            int i268 = -MotionEvent.axisFromString(str12);
                            int i269 = (i268 ^ 440) + ((i268 & 440) << 1);
                            Object[] objArr57 = new Object[1];
                            b((char) ((myTid3 & 22931) + (myTid3 | 22931)), minimumFlingVelocity2, i269, objArr57);
                            String str23 = (String) objArr57[0];
                            int i270 = 26 - (~(-(ViewConfiguration.getDoubleTapTimeout() >> 16)));
                            char indexOf4 = (char) TextUtils.indexOf(str12, str12, 0, 0);
                            int i271 = -(-Gravity.getAbsoluteGravity(0, 0));
                            int i272 = (i271 ^ 481) + ((i271 & 481) << 1);
                            Object[] objArr58 = new Object[1];
                            b(indexOf4, i270, i272, objArr58);
                            String str24 = (String) objArr58[0];
                            int scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
                            int i273 = (((scrollDefaultDelay ^ (-28)) | (scrollDefaultDelay & (-28))) * 983) + (scrollDefaultDelay * (-1965)) + 26568;
                            int i274 = ~scrollDefaultDelay;
                            int i275 = ~(((-28) & i48) | ((-28) ^ i48));
                            int i276 = -(-(((i275 & i274) | (i274 ^ i275)) * (-983)));
                            Object[] objArr59 = new Object[1];
                            b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (((~((i274 & 27) | (i274 ^ 27))) | (~((i274 ^ i48) | (i274 & i48)))) * 983) + (i273 & i276) + (i276 | i273), 508 - View.MeasureSpec.getMode(0), objArr59);
                            String str25 = (String) objArr59[0];
                            int i277 = -TextUtils.lastIndexOf(str12, '0');
                            int a4 = com.fingerprintjs.android.fpjs_pro.r.a();
                            int i278 = i277 * 868;
                            int i279 = (i278 ^ 22568) + ((i278 & 22568) << 1);
                            int i280 = ~i277;
                            int i281 = ~a4;
                            int i282 = ~((i280 ^ i281) | (i280 & i281));
                            int i283 = ~(((-27) & i281) | ((-27) ^ i281));
                            int i284 = ((i282 & i283) | (i282 ^ i283)) * (-867);
                            int i285 = (i279 & i284) + (i279 | i284);
                            int i286 = (i280 ^ (-27)) | (i280 & (-27));
                            int i287 = ~i286;
                            int i288 = ~((i280 ^ a4) | (i280 & a4));
                            int i289 = (i287 ^ i288) | (i287 & i288);
                            int i290 = ~(((-27) ^ a4) | ((-27) & a4));
                            int i291 = ((i289 ^ i290) | (i289 & i290)) * (-1734);
                            int i292 = ~(i286 | i281);
                            int i293 = (i280 & 26) | (i280 ^ 26);
                            int i294 = ~((i293 & a4) | (i293 ^ a4));
                            int i295 = (i294 & i292) | (i292 ^ i294);
                            int i296 = (i277 & (-27)) | ((-27) ^ i277);
                            int i297 = ~((i296 & a4) | (i296 ^ a4));
                            int i298 = ((((i285 | i291) << 1) - (i291 ^ i285)) - (~(((i297 & i295) | (i295 ^ i297)) * 867))) - 1;
                            char c13 = (char) (62418 - (~(-(-Color.red(0)))));
                            int i299 = -Process.getGidForName(str12);
                            int i300 = ((i299 | 534) << 1) - (i299 ^ 534);
                            Object[] objArr60 = new Object[1];
                            b(c13, i298, i300, objArr60);
                            String str26 = (String) objArr60[0];
                            int i301 = -(-MotionEvent.axisFromString(str12));
                            int i302 = (i301 & 28) + (i301 | 28);
                            int i303 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                            Object[] objArr61 = new Object[1];
                            b((char) (((i303 | 37029) << 1) - (i303 ^ 37029)), i302, 560 - (~(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr61);
                            String[] strArr8 = {str22, str23, str24, str25, str26, (String) objArr61[0]};
                            int i304 = 6;
                            int i305 = 0;
                            while (true) {
                                if (i305 >= i304) {
                                    i20 = i;
                                    break;
                                }
                                c = (d + 79) % 128;
                                Object[] objArr62 = {strArr8[i305]};
                                Object f17 = rV4669.f(i13);
                                if (f17 == null) {
                                    int alpha = 6202 - Color.alpha(0);
                                    char lastIndexOf3 = (char) ((-1) - TextUtils.lastIndexOf(str12, '0', 0));
                                    int makeMeasureSpec2 = 51 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                    Object[] objArr63 = new Object[1];
                                    c((byte) 0, (short) 0, (short) 0, objArr63);
                                    f17 = rV4669.g(alpha, lastIndexOf3, makeMeasureSpec2, 1857630294, (String) objArr63[0], new Class[]{String.class});
                                }
                                String str27 = (String) ((Method) f17).invoke(null, objArr62);
                                if (str27 != null && str27.length() != 0) {
                                    i20 = (~(i & 265)) & (i | 265);
                                    break;
                                }
                                i305++;
                                i304 = 6;
                            }
                            if (i20 != i) {
                                Object[] objArr64 = new Object[5];
                                int[] iArr27 = new int[1];
                                objArr64[0] = iArr27;
                                int[] iArr28 = new int[1];
                                objArr64[1] = iArr28;
                                int[] iArr29 = new int[1];
                                objArr64[i10] = iArr29;
                                iArr28[0] = i;
                                iArr27[0] = i20;
                                objArr64[4] = null;
                                objArr64[2] = null;
                                int i306 = (((~((-677753289) | i48)) | 140579144) * 859) + (((~(i | (-537174145))) | (~(538894502 | i48))) * 859) + (((i | 538894502) * (-859)) - 2098932392);
                                int i307 = (i3 - (~(((i306 | 16) << 1) - (i306 ^ 16)))) - 1;
                                int i308 = i307 << 13;
                                int i309 = (i307 | i308) & (~(i307 & i308));
                                int i310 = i309 >>> 17;
                                int i311 = (i309 | i310) & (~(i309 & i310));
                                int i312 = i311 << 5;
                                iArr29[0] = (i311 | i312) & (~(i311 & i312));
                                return objArr64;
                            }
                            int i313 = -((Process.getThreadPriority(0) + 20) >> 6);
                            int i314 = ((i313 | 17) << 1) - (i313 ^ 17);
                            char scrollBarFadeDuration4 = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1868);
                            int i315 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                            Object[] objArr65 = new Object[1];
                            b(scrollBarFadeDuration4, i314, (i315 & 347) + (i315 | 347), objArr65);
                            String str28 = (String) objArr65[0];
                            int i316 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int i317 = ((i316 | 6) << 1) - (i316 ^ 6);
                            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L);
                            int i318 = ((packedPositionChild | 590) << 1) - (packedPositionChild ^ 590);
                            Object[] objArr66 = new Object[1];
                            b(edgeSlop, i317, i318, objArr66);
                            String str29 = (String) objArr66[0];
                            File file3 = new File(str28);
                            if (file3.exists()) {
                                int i319 = d;
                                int i320 = (i319 ^ 29) + ((i319 & 29) << 1);
                                c = i320 % 128;
                                int i321 = i320 % 2;
                                boolean isFile = file3.isFile();
                                if (i321 != 0) {
                                    int i322 = 81 / 0;
                                }
                                try {
                                    Scanner scanner2 = new Scanner(new FileInputStream(file3));
                                    int indexOf5 = 2 - TextUtils.indexOf(str12, str12);
                                    int i323 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                    int i324 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                    int i325 = (i324 ^ 371) + ((i324 & 371) << 1);
                                    Object[] objArr67 = new Object[1];
                                    b((char) ((i323 ^ 22038) + ((i323 & 22038) << 1)), indexOf5, i325, objArr67);
                                    Scanner useDelimiter2 = scanner2.useDelimiter((String) objArr67[0]);
                                    next2 = useDelimiter2.hasNext() ? useDelimiter2.next() : str12;
                                    useDelimiter2.close();
                                } catch (IOException unused2) {
                                }
                                if (next2.contains(str29)) {
                                    i23 = (i & (-261)) | (i48 & 260);
                                    i22 = 5;
                                    i21 = 1;
                                    if (i23 != i) {
                                        Object[] objArr68 = new Object[i22];
                                        int[] iArr30 = new int[i21];
                                        objArr68[0] = iArr30;
                                        int[] iArr31 = new int[i21];
                                        objArr68[i21] = iArr31;
                                        int[] iArr32 = new int[i21];
                                        objArr68[i10] = iArr32;
                                        iArr31[0] = i;
                                        iArr30[0] = i23;
                                        objArr68[4] = null;
                                        objArr68[2] = null;
                                        int i326 = (((~((-392632273) | i48)) | 107087168) * (-964)) + (((~(i | (-392632273))) | (-824015519)) * (-964)) + 1975025394;
                                        int i327 = (i3 - (~((i326 ^ 16) + ((i326 & 16) << 1)))) - 1;
                                        int i328 = i327 << 13;
                                        int i329 = (i327 | i328) & (~(i327 & i328));
                                        int i330 = i329 >>> 17;
                                        int i331 = (i329 | i330) & (~(i329 & i330));
                                        int i332 = i331 << 5;
                                        iArr32[0] = ((~i331) & i332) | ((~i332) & i331);
                                        return objArr68;
                                    }
                                    Object f18 = rV4669.f(1651333490);
                                    if (f18 == null) {
                                        int windowTouchSlop3 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 6769;
                                        char indexOf6 = (char) TextUtils.indexOf(str12, str12, 0, 0);
                                        int maximumDrawingCacheSize = 52 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                        byte b12 = (byte) (i8 & 5);
                                        byte b13 = (byte) (b12 + 1);
                                        Object[] objArr69 = new Object[1];
                                        c(b13, b12, (byte) (b13 - 1), objArr69);
                                        f18 = rV4669.g(windowTouchSlop3, indexOf6, maximumDrawingCacheSize, -339114986, (String) objArr69[0], new Class[0]);
                                    }
                                    long longValue8 = ((Long) ((Method) f18).invoke(null, null)).longValue();
                                    long a5 = hdi.a();
                                    long j21 = longValue8 ^ (-1);
                                    long j22 = a5 ^ (-1);
                                    long e9 = com.fingerprintjs.android.fpjs_pro.g.e(676L, ((84759584 | j21) ^ (-1)) | ((j21 | j22) ^ (-1)) | (((longValue8 | (-84759585)) | a5) ^ (-1)), ((((j21 | (-84759585)) ^ (-1)) | ((j22 | (-84759585)) ^ (-1))) * 676) + ((-676) * ((-84759585) | a5 | j21)) + (((-675) * longValue8) - 57382239045L), 145431588L);
                                    int i333 = ((int) (e9 >> c2)) & ((((~((~hdi.b(2086353953)) | 669374986)) | (-169976235)) * 184) + ((((-134226337) | r6) * 184) - 1646884534));
                                    int b14 = hdi.b(391678406);
                                    int i334 = ((int) e9) & ((((~(b14 | (-582650612))) | 274022469) * 70) + ((~((-581601971) | b14)) * 70) + (((~((-854575799) | b14)) | 272973828) * (-140)) + 417667495);
                                    if (((i334 & i333) | (i333 ^ i334)) == 1) {
                                        d = (c + 117) % 128;
                                        Object[] objArr70 = new Object[5];
                                        int[] iArr33 = new int[1];
                                        objArr70[0] = iArr33;
                                        int[] iArr34 = new int[1];
                                        objArr70[1] = iArr34;
                                        objArr70[i10] = new int[1];
                                        iArr34[0] = i;
                                        iArr33[0] = i;
                                        objArr70[4] = null;
                                        objArr70[2] = null;
                                        int i335 = (((~(i | 998953972)) | 74525706 | (~((-855785861) | i48))) * 369) + (((~((-998953973) | i48)) | 217693818) * (-369)) + (((1073479678 | i48) * (-369)) - 811883780);
                                        int a6 = com.fingerprintjs.android.fpjs_pro.r.a();
                                        int i336 = i335 * (-216);
                                        int i337 = (i336 << 1) - i336;
                                        int i338 = ~a6;
                                        int i339 = ~((i6 ^ i338) | i338);
                                        int i340 = ~i335;
                                        int i341 = ~((i340 ^ a6) | (i340 & a6));
                                        int i342 = (((i339 & i341) | (i339 ^ i341)) * 217) + i337;
                                        int i343 = ~((i6 ^ i340) | i340);
                                        int i344 = ~(a6 | (i6 ^ a6));
                                        int i345 = -(-(((i344 & i343) | (i343 ^ i344)) * 217));
                                        int i346 = (i342 ^ i345) + ((i345 & i342) << 1);
                                        int i347 = (~((i340 & i338) | (i340 ^ i338))) * 217;
                                        int i348 = ((i346 | i347) << 1) - (i347 ^ i346);
                                        int i349 = (i3 ^ i348) + ((i3 & i348) << 1);
                                        int i350 = i349 << 13;
                                        int i351 = ((~i349) & i350) | ((~i350) & i349);
                                        int i352 = i351 >>> 17;
                                        int i353 = (i351 | i352) & (~(i351 & i352));
                                        ((int[]) objArr70[i10])[0] = i353 ^ (i353 << 5);
                                        return objArr70;
                                    }
                                    Object[] objArr71 = {1};
                                    Object f19 = rV4669.f(814053687);
                                    if (f19 == null) {
                                        int i354 = 5099 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                        char resolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 59615);
                                        int i355 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 51;
                                        byte b15 = (byte) (i8 & 5);
                                        byte b16 = (byte) (b15 + 1);
                                        Object[] objArr72 = new Object[1];
                                        c(b16, b15, (byte) (b16 - 1), objArr72);
                                        f19 = rV4669.g(i354, resolveSizeAndState, i355, -1188977581, (String) objArr72[0], new Class[]{Integer.TYPE});
                                    }
                                    long longValue9 = ((Long) ((Method) f19).invoke(null, objArr71)).longValue();
                                    long j23 = longValue9 ^ (-1);
                                    long b17 = hdi.b(1965588526);
                                    long j24 = (((b17 ^ (-1)) | 1668337472) | longValue9) ^ (-1);
                                    long e10 = com.fingerprintjs.android.fpjs_pro.g.e(470L, ((b17 | (1668337472 | j23)) ^ (-1)) | j24, ((-470) * ((((-1668337473) | j23) ^ (-1)) | ((j23 | b17) ^ (-1)) | j24)) + ((1668337472 | longValue9) * (-470)) + (471 * longValue9) + 785786949312L, -1681885367L);
                                    int i356 = ((int) (e10 >> c2)) & ((((~(1018495541 | i)) | (~(i48 | (-1839245344)))) * 979) + (((-1839245344) | i) * (-979)) + ((~(1018495541 | i48)) * 979) + 1082054604);
                                    int i357 = ((int) e10) & ((((~(813659708 | i48)) | (~((-2044081178) | i48)) | 1233125377) * 50) + (((~((-810955801) | i)) | (~((-1233125378) | i48))) * 50) + ((813659708 | i) * (-50)) + 1466209579);
                                    int i358 = ((i357 & i356) | (i356 ^ i357)) != 0 ? i ^ 220 : i;
                                    if (i358 != i) {
                                        Object[] objArr73 = new Object[5];
                                        int[] iArr35 = new int[1];
                                        objArr73[0] = iArr35;
                                        int[] iArr36 = new int[1];
                                        objArr73[1] = iArr36;
                                        objArr73[i10] = new int[1];
                                        iArr36[0] = i;
                                        iArr35[0] = i358;
                                        objArr73[4] = null;
                                        objArr73[2] = null;
                                        int b18 = hdi.b(841689898);
                                        int d2 = hdi.d(~(b18 | (-140722697)), -1504, (((~((-410248761) | b18)) | 269526064) * 1504) + 1125543758, -1549170384, i3);
                                        int i359 = d2 << 13;
                                        int i360 = ((~d2) & i359) | ((~i359) & d2);
                                        int i361 = i360 >>> 17;
                                        int i362 = (i360 | i361) & (~(i360 & i361));
                                        int i363 = i362 << 5;
                                        ((int[]) objArr73[i10])[0] = ((~i362) & i363) | ((~i363) & i362);
                                        return objArr73;
                                    }
                                    int threadPriority3 = Process.getThreadPriority(0);
                                    Object[] objArr74 = new Object[1];
                                    b((char) TextUtils.indexOf(str12, str12, 0, 0), 23 - (((threadPriority3 ^ 20) + ((threadPriority3 & 20) << 1)) >> 6), 372 - View.combineMeasuredStates(0, 0), objArr74);
                                    Object[] objArr75 = {(String) objArr74[0]};
                                    Object f20 = rV4669.f(i13);
                                    if (f20 == null) {
                                        int argb = Color.argb(0, 0, 0, 0) + 6202;
                                        char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                                        int rgb2 = Color.rgb(0, 0, 0) + 16777267;
                                        Object[] objArr76 = new Object[1];
                                        c((byte) 0, (short) 0, (short) 0, objArr76);
                                        f20 = rV4669.g(argb, scrollBarSize, rgb2, 1857630294, (String) objArr76[0], new Class[]{String.class});
                                    }
                                    Object invoke2 = ((Method) f20).invoke(null, objArr75);
                                    if (invoke2 != null) {
                                        Object[] objArr77 = {invoke2, 42};
                                        Object f21 = rV4669.f(10827986);
                                        if (f21 == null) {
                                            int i364 = 5150 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                            int packedPositionGroup2 = 52 - ExpandableListView.getPackedPositionGroup(0L);
                                            byte b19 = (byte) (i8 & 5);
                                            byte b20 = (byte) (b19 + 1);
                                            Object[] objArr78 = new Object[1];
                                            c(b20, b19, (byte) (b20 - 1), objArr78);
                                            f21 = rV4669.g(i364, keyRepeatDelay, packedPositionGroup2, -1996364362, (String) objArr78[0], new Class[]{String.class, Integer.TYPE});
                                        }
                                        long longValue10 = ((Long) ((Method) f21).invoke(null, objArr77)).longValue();
                                        long j25 = longValue10 ^ (-1);
                                        long elapsedCpuTime4 = (((int) Process.getElapsedCpuTime()) | longValue10) ^ (-1);
                                        long e11 = com.fingerprintjs.android.fpjs_pro.g.e(196L, ((1621702120 | j25) ^ (-1)) | elapsedCpuTime4, (392 * ((-1621702121) | longValue10)) + ((-196) * (((j25 | (-1621702121)) ^ (-1)) | elapsedCpuTime4)) + ((-195) * longValue10) + 634085529311L, 1738812025L);
                                        int i365 = ((int) (e11 >> c2)) & ((((~(888795954 | i48)) | 1090651136) * 859) + (((~((-1968944931) | i48)) | (~(1979447090 | i))) * 859) + (((-1968944931) | i) * (-859)) + 1302191962);
                                        int i366 = ((int) e11) & (((1207959557 | (~((-826103249) | i)) | (~(826103248 | i48))) * 988) + (((~(2031637637 | i48)) | 2425168) * (-1976)) + (((i | 1207959557) * 988) - 12552579));
                                        if (((i366 & i365) | (i365 ^ i366)) == 1986687685) {
                                            cls = String.class;
                                            i24 = i48;
                                            c3 = 4;
                                            c4 = 6;
                                            i25 = 19;
                                            int i367 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                            int i368 = (i367 ^ 16) + ((i367 & 16) << 1);
                                            int i369 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
                                            Object[] objArr79 = new Object[1];
                                            b((char) ((i369 & 51890) + (i369 | 51890)), i368, 697 - (~(-(ViewConfiguration.getKeyRepeatTimeout() >> 16))), objArr79);
                                            Object[] objArr80 = {(String) objArr79[0]};
                                            f2 = rV4669.f(i13);
                                            if (f2 == null) {
                                                int i370 = 6202 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                char resolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                                                int red2 = Color.red(0) + 51;
                                                Object[] objArr81 = new Object[1];
                                                c((byte) 0, (short) 0, (short) 0, objArr81);
                                                f2 = rV4669.g(i370, resolveOpacity, red2, 1857630294, (String) objArr81[0], new Class[]{cls});
                                            }
                                            invoke = ((Method) f2).invoke(null, objArr80);
                                            if (invoke != null) {
                                                i27 = 0;
                                            } else {
                                                Object[] objArr82 = {invoke, 42};
                                                Object f22 = rV4669.f(10827986);
                                                if (f22 == null) {
                                                    int resolveOpacity2 = Drawable.resolveOpacity(0, 0) + 5150;
                                                    char windowTouchSlop4 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                                    int threadPriority4 = ((Process.getThreadPriority(0) + 20) >> 6) + 52;
                                                    byte b21 = (byte) (i8 & 5);
                                                    byte b22 = (byte) (b21 + 1);
                                                    Object[] objArr83 = new Object[1];
                                                    c(b22, b21, (byte) (b22 - 1), objArr83);
                                                    f22 = rV4669.g(resolveOpacity2, windowTouchSlop4, threadPriority4, -1996364362, (String) objArr83[0], new Class[]{cls, Integer.TYPE});
                                                }
                                                long longValue11 = ((Long) ((Method) f22).invoke(null, objArr82)).longValue();
                                                long j26 = ((-1917) * longValue11) - 230640174720L;
                                                long j27 = longValue11 ^ (-1);
                                                long e12 = com.fingerprintjs.android.fpjs_pro.g.e(959L, ((j27 | j8) ^ (-1)) | ((j9 | (-240250182)) ^ (-1)), ((-959) * j27) + ((((j27 | j9) ^ (-1)) | (((-240250182) | j8) ^ (-1))) * 959) + j26, 357360086L);
                                                int i371 = ((int) (e12 >> c2)) & ((((~(894981365 | i24)) | (~((-894981366) | i)) | (~((-1962759520) | i))) * 831) + ((~((-16777377) | i)) * (-1662)) + ((((~(1962759519 | i24)) | (~((-878203990) | i))) * (-831)) - 1123156588));
                                                int i372 = ((int) e12) & ((((~(1661454215 | i24)) | (~(1196286670 | i))) * 627) + (((~((-1661454216) | i)) | 1196286670) * (-627)) + ((((-71835721) | i) * (-627)) - 635053948));
                                                i27 = (i371 & i372) | (i371 ^ i372);
                                            }
                                            if (i27 != 1986687685) {
                                                int i373 = c;
                                                d = ((i373 ^ 125) + ((i373 & 125) << 1)) % 128;
                                                if (i27 != -1514516938) {
                                                    Object[] objArr84 = new Object[1];
                                                    b((char) ((Process.getThreadPriority(0) + 20) >> 6), 13 - (~(-(ViewConfiguration.getScrollBarSize() >> 8))), 1412 - (~(-(-(ViewConfiguration.getScrollDefaultDelay() >> 16)))), objArr84);
                                                    String str30 = (String) objArr84[0];
                                                    int i374 = 25 - (~(-(-Color.red(0))));
                                                    char windowTouchSlop5 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                                    int i375 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                    int i376 = ((i375 | 1427) << 1) - (i375 ^ 1427);
                                                    Object[] objArr85 = new Object[1];
                                                    b(windowTouchSlop5, i374, i376, objArr85);
                                                    String str31 = (String) objArr85[0];
                                                    int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L);
                                                    Object[] objArr86 = new Object[1];
                                                    b((char) (Process.getGidForName(str12) + 36961), ((packedPositionChild2 | 18) << 1) - (packedPositionChild2 ^ 18), View.MeasureSpec.getMode(0) + 1453, objArr86);
                                                    String str32 = (String) objArr86[0];
                                                    int mirror = 'A' - AndroidCharacter.getMirror('0');
                                                    char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                                                    int i377 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                                    int i378 = (i377 ^ 1470) + ((i377 & 1470) << 1);
                                                    Object[] objArr87 = new Object[1];
                                                    b(deadChar2, mirror, i378, objArr87);
                                                    String str33 = (String) objArr87[0];
                                                    int i379 = -Gravity.getAbsoluteGravity(0, 0);
                                                    Object[] objArr88 = new Object[1];
                                                    b((char) (25750 - (ViewConfiguration.getPressedStateDuration() >> 16)), ((i379 | 15) << 1) - (i379 ^ 15), 1486 - (~(-TextUtils.getOffsetBefore(str12, 0))), objArr88);
                                                    String str34 = (String) objArr88[0];
                                                    int i380 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                    int i381 = (i380 & 36) + (i380 | 36);
                                                    int i382 = -Color.rgb(0, 0, 0);
                                                    int i383 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                    int i384 = (i383 ^ 1502) + ((i383 & 1502) << 1);
                                                    Object[] objArr89 = new Object[1];
                                                    b((char) ((i382 & (-16777216)) + (i382 | (-16777216))), i381, i384, objArr89);
                                                    String str35 = (String) objArr89[0];
                                                    int indexOf7 = 12 - TextUtils.indexOf(str12, str12);
                                                    int i385 = -TextUtils.lastIndexOf(str12, '0', 0, 0);
                                                    int resolveSize = View.resolveSize(0, 0);
                                                    int i386 = (resolveSize ^ 1539) + ((resolveSize & 1539) << 1);
                                                    Object[] objArr90 = new Object[1];
                                                    b((char) (((i385 | 39934) << 1) - (i385 ^ 39934)), indexOf7, i386, objArr90);
                                                    String str36 = (String) objArr90[0];
                                                    Object[] objArr91 = new Object[1];
                                                    b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 19048), (ViewConfiguration.getLongPressTimeout() >> 16) + 13, 1551 - Color.blue(0), objArr91);
                                                    String str37 = (String) objArr91[0];
                                                    int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0) + 22;
                                                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                                    int i387 = -((byte) KeyEvent.getModifierMetaStateMask());
                                                    int i388 = (i387 & 1563) + (i387 | 1563);
                                                    Object[] objArr92 = new Object[1];
                                                    b(longPressTimeout, makeMeasureSpec3, i388, objArr92);
                                                    String str38 = (String) objArr92[0];
                                                    int i389 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                                    int i390 = ((i389 | 31) << 1) - (i389 ^ 31);
                                                    char c14 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 17476);
                                                    int i391 = -View.MeasureSpec.getSize(0);
                                                    int i392 = (i391 & 1586) + (i391 | 1586);
                                                    Object[] objArr93 = new Object[1];
                                                    b(c14, i390, i392, objArr93);
                                                    String str39 = (String) objArr93[0];
                                                    int i393 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 11;
                                                    int indexOf8 = TextUtils.indexOf((CharSequence) str12, '0');
                                                    byte modifierMetaStateMask = (byte) KeyEvent.getModifierMetaStateMask();
                                                    int i394 = ((modifierMetaStateMask | 1618) << 1) - (modifierMetaStateMask ^ 1618);
                                                    Object[] objArr94 = new Object[1];
                                                    b((char) ((indexOf8 ^ 29751) + ((indexOf8 & 29751) << 1)), i393, i394, objArr94);
                                                    String str40 = (String) objArr94[0];
                                                    int i395 = 11 - (~(-KeyEvent.normalizeMetaState(0)));
                                                    char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                    int i396 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                    int i397 = (i396 ^ 1628) + ((i396 & 1628) << 1);
                                                    Object[] objArr95 = new Object[1];
                                                    b(scrollDefaultDelay2, i395, i397, objArr95);
                                                    String str41 = (String) objArr95[0];
                                                    int i398 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                                    int i399 = (i398 ^ 12) + ((i398 & 12) << 1);
                                                    int longPressTimeout2 = ViewConfiguration.getLongPressTimeout() >> 16;
                                                    Object[] objArr96 = new Object[1];
                                                    b((char) ((longPressTimeout2 & 46305) + (longPressTimeout2 | 46305)), i399, 1641 - Color.red(0), objArr96);
                                                    String str42 = (String) objArr96[0];
                                                    int alpha2 = Color.alpha(0);
                                                    int i400 = (alpha2 ^ 12) + ((alpha2 & 12) << 1);
                                                    char green2 = (char) (65332 - Color.green(0));
                                                    int i401 = -KeyEvent.getDeadChar(0, 0);
                                                    int i402 = (i401 & 1653) + (i401 | 1653);
                                                    Object[] objArr97 = new Object[1];
                                                    b(green2, i400, i402, objArr97);
                                                    String str43 = (String) objArr97[0];
                                                    int i403 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                    int i404 = (i403 ^ 12) + ((i403 & 12) << 1);
                                                    char scrollDefaultDelay3 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                    int i405 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                    int i406 = (i405 & 1664) + (i405 | 1664);
                                                    Object[] objArr98 = new Object[1];
                                                    b(scrollDefaultDelay3, i404, i406, objArr98);
                                                    String str44 = (String) objArr98[0];
                                                    Object[] objArr99 = new Object[1];
                                                    b((char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 14, 1677 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1)), objArr99);
                                                    String str45 = (String) objArr99[0];
                                                    int resolveSize2 = 12 - View.resolveSize(0, 0);
                                                    char indexOf9 = (char) (TextUtils.indexOf(str12, str12, 0, 0) + 1848);
                                                    int i407 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                    int i408 = (i407 * 303) - 508991;
                                                    int i409 = ~i407;
                                                    int i410 = (i409 ^ i24) | (i409 & i24);
                                                    int i411 = ((~((i410 & 1691) | (i410 ^ 1691))) | (~(i407 | 1691 | i))) * (-302);
                                                    int i412 = (i408 ^ i411) + ((i408 & i411) << 1);
                                                    int i413 = (~((i409 ^ 1691) | (i409 & 1691) | i)) * (-604);
                                                    int i414 = ((i412 | i413) << 1) - (i413 ^ i412);
                                                    int i415 = ~(i407 | (-1692));
                                                    int i416 = ~((i ^ 1691) | (i & 1691));
                                                    int i417 = ((i415 & i416) | (i415 ^ i416)) * 302;
                                                    int i418 = (i414 ^ i417) + ((i417 & i414) << 1);
                                                    Object[] objArr100 = new Object[1];
                                                    b(indexOf9, resolveSize2, i418, objArr100);
                                                    String str46 = (String) objArr100[0];
                                                    int indexOf10 = 24 - TextUtils.indexOf(str12, str12, 0, 0);
                                                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                    int i419 = -(KeyEvent.getMaxKeyCode() >> 16);
                                                    int i420 = (i419 & 1703) + (i419 | 1703);
                                                    Object[] objArr101 = new Object[1];
                                                    b(doubleTapTimeout, indexOf10, i420, objArr101);
                                                    String str47 = (String) objArr101[0];
                                                    int i421 = 27 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                    char windowTouchSlop6 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                                    int i422 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                                                    int i423 = ((i422 | 1727) << 1) - (i422 ^ 1727);
                                                    Object[] objArr102 = new Object[1];
                                                    b(windowTouchSlop6, i421, i423, objArr102);
                                                    String[] strArr9 = {str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, (String) objArr102[0]};
                                                    int i424 = i25;
                                                    int i425 = 0;
                                                    while (true) {
                                                        if (i425 >= i424) {
                                                            i425 = i6;
                                                            break;
                                                        }
                                                        String str48 = strArr9[i425];
                                                        Object[] objArr103 = {str48};
                                                        Object f23 = rV4669.f(i12);
                                                        if (f23 == null) {
                                                            int longPressTimeout3 = (ViewConfiguration.getLongPressTimeout() >> 16) + 6046;
                                                            char keyCodeFromString2 = (char) KeyEvent.keyCodeFromString(str12);
                                                            int i426 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 51;
                                                            byte b23 = bArr[c4];
                                                            Object[] objArr104 = new Object[1];
                                                            c(b23, (short) 0, (byte) (b23 - 3), objArr104);
                                                            f23 = rV4669.g(longPressTimeout3, keyCodeFromString2, i426, 646556096, (String) objArr104[0], new Class[]{cls});
                                                        }
                                                        long longValue12 = ((Long) ((Method) f23).invoke(null, objArr103)).longValue();
                                                        long j28 = (j9 | 1187728855) ^ (-1);
                                                        long j29 = ((-374) * ((((-1187728856) | longValue12) ^ (-1)) | j28)) + ((-747) * longValue12) + 445398320625L;
                                                        long j30 = longValue12 ^ (-1);
                                                        long e13 = com.fingerprintjs.android.fpjs_pro.g.e(374L, ((j30 | (-1187728856)) ^ (-1)) | j28, (748 * ((j30 | 1187728855) ^ (-1))) + j29, -1528246494L);
                                                        int elapsedCpuTime5 = (int) Process.getElapsedCpuTime();
                                                        int i427 = ~elapsedCpuTime5;
                                                        int i428 = ((int) (e13 >> c2)) & ((((~(1426102763 | elapsedCpuTime5)) | (~(i427 | (-1431638122)))) * 959) + (((~((-1431638122) | elapsedCpuTime5)) | (~(1426102763 | i427))) * 959) + 423786343);
                                                        int i429 = ((int) e13) & ((((~(1451202854 | i24)) | (-1406538032)) * 305) + ((((~(1451202854 | i)) | (-1476368688)) * 305) - 1704616964));
                                                        if (((i429 & i428) | (i428 ^ i429)) != 0) {
                                                            break;
                                                        }
                                                        int i430 = -TextUtils.lastIndexOf(str12, '0');
                                                        int i431 = (i430 ^ 13) + ((i430 & 13) << 1);
                                                        char c15 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                        int i432 = -KeyEvent.keyCodeFromString(str12);
                                                        int i433 = ((i432 | 1677) << 1) - (i432 ^ 1677);
                                                        Object[] objArr105 = new Object[1];
                                                        b(c15, i431, i433, objArr105);
                                                        if (str48.equals((String) objArr105[0])) {
                                                            Object[] objArr106 = {str48};
                                                            Object f24 = rV4669.f(-1567326429);
                                                            if (f24 == null) {
                                                                int i434 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6046;
                                                                char resolveOpacity3 = (char) Drawable.resolveOpacity(0, 0);
                                                                int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 52;
                                                                Object[] objArr107 = new Object[1];
                                                                c((byte) 2, (short) 0, (short) 1, objArr107);
                                                                f24 = rV4669.g(i434, resolveOpacity3, doubleTapTimeout2, 724607559, (String) objArr107[0], new Class[]{cls});
                                                            }
                                                            long longValue13 = ((Long) ((Method) f24).invoke(null, objArr106)).longValue();
                                                            long a7 = hdi.a();
                                                            long j31 = ((-283) * (((552589349 | longValue13) ^ (-1)) | ((552589349 | a7) ^ (-1)))) + (((-282) * longValue13) - 156935375400L);
                                                            long j32 = longValue13 ^ (-1);
                                                            long e14 = com.fingerprintjs.android.fpjs_pro.g.e(283L, ((552589349 | j32) | a7) ^ (-1), ((((-552589350) | j32) ^ (-1)) * 283) + j31, 1055343589L);
                                                            int i435 = (~((-1316527302) | i)) | 103848133;
                                                            int i436 = ((int) (e14 >> c2)) & (((120699109 | i) * 496) + ((i435 | (~(1333378277 | i24))) * (-496)) + (i435 * 992) + 1537498186);
                                                            int i437 = (int) Runtime.getRuntime().totalMemory();
                                                            int i438 = (((~(443716646 | i437)) | (~(993509763 | i437))) * 140) + (((553992577 | r10) * (-280)) - 1775601359);
                                                            int i439 = ~(997709223 | i437);
                                                            int i440 = ~i437;
                                                            int i441 = ((int) e14) & ((((~(i440 | (-4199461))) | i439 | (~((-553992578) | i440))) * 140) + i438);
                                                            if (((i441 & i436) | (i436 ^ i441)) != 0) {
                                                                int i442 = d + 81;
                                                                c = i442 % 128;
                                                                if (i442 % 2 != 0) {
                                                                    throw null;
                                                                }
                                                            }
                                                        }
                                                        i425++;
                                                        i424 = 19;
                                                    }
                                                    if (i425 >= 0) {
                                                        int i443 = c;
                                                        int i444 = (i443 ^ 25) + ((i443 & 25) << 1);
                                                        d = i444 % 128;
                                                        if (i444 % 2 == 0) {
                                                            int i445 = i425 % 22373;
                                                            i35 = (~(i & i445)) & (i445 | i);
                                                            if (i35 == i) {
                                                                f3 = 0.0f;
                                                                i28 = 0;
                                                                int i446 = (TypedValue.complexToFraction(i28, f3, f3) > f3 ? 1 : (TypedValue.complexToFraction(i28, f3, f3) == f3 ? 0 : -1));
                                                                int i447 = ((i446 | 13) << 1) - (i446 ^ 13);
                                                                char maximumFlingVelocity3 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                                int i448 = -(-View.combineMeasuredStates(i28, i28));
                                                                int i449 = (i448 & 1755) + (i448 | 1755);
                                                                Object[] objArr108 = new Object[1];
                                                                b(maximumFlingVelocity3, i447, i449, objArr108);
                                                                String str49 = (String) objArr108[i28];
                                                                Object[] objArr109 = new Object[1];
                                                                b((char) TextUtils.getOffsetAfter(str12, i28), 6 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1767 - (~(-(KeyEvent.getMaxKeyCode() >> 16))), objArr109);
                                                                String[] strArr10 = {str49, (String) objArr109[i28]};
                                                                int packedPositionChild3 = ExpandableListView.getPackedPositionChild(0L);
                                                                int i450 = (packedPositionChild3 & 16) + (packedPositionChild3 | 16);
                                                                char offsetAfter4 = (char) TextUtils.getOffsetAfter(str12, i28);
                                                                int i451 = -(-TextUtils.lastIndexOf(str12, '0', i28, i28));
                                                                int i452 = (i451 ^ 1774) + ((i451 & 1774) << 1);
                                                                Object[] objArr110 = new Object[1];
                                                                b(offsetAfter4, i450, i452, objArr110);
                                                                String str50 = (String) objArr110[i28];
                                                                int longPressTimeout4 = 19 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                                                int i453 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                                int i454 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                                int i455 = (i454 & 1788) + (i454 | 1788);
                                                                Object[] objArr111 = new Object[1];
                                                                b((char) (((i453 | 1) << 1) - (i453 ^ 1)), longPressTimeout4, i455, objArr111);
                                                                String str51 = (String) objArr111[0];
                                                                int scrollDefaultDelay4 = 14 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                                int i456 = -Color.red(0);
                                                                int i457 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                                int i458 = (i457 ^ 1807) + ((i457 & 1807) << 1);
                                                                Object[] objArr112 = new Object[1];
                                                                b((char) ((i456 & 36398) + (i456 | 36398)), scrollDefaultDelay4, i458, objArr112);
                                                                String[] strArr11 = {str50, str51, (String) objArr112[0]};
                                                                int i459 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                                                int i460 = ((i459 | 21) << 1) - (i459 ^ 21);
                                                                char c16 = (char) ((-2) - (~(-MotionEvent.axisFromString(str12))));
                                                                int i461 = -(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                                                int i462 = (i461 & 1820) + (i461 | 1820);
                                                                Object[] objArr113 = new Object[1];
                                                                b(c16, i460, i462, objArr113);
                                                                String str52 = (String) objArr113[0];
                                                                int indexOf11 = TextUtils.indexOf((CharSequence) str12, '0', 0);
                                                                Object[] objArr114 = new Object[1];
                                                                b((char) View.resolveSize(0, 0), (indexOf11 & 11) + (indexOf11 | 11), 1841 - (~(ViewConfiguration.getTouchSlop() >> 8)), objArr114);
                                                                String[] strArr12 = {str52, (String) objArr114[0]};
                                                                int i463 = 10 - (~(-ExpandableListView.getPackedPositionType(0L)));
                                                                char c17 = (char) (0 - (~((byte) KeyEvent.getModifierMetaStateMask())));
                                                                int keyRepeatTimeout2 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                                                int i464 = (keyRepeatTimeout2 ^ 1852) + ((keyRepeatTimeout2 & 1852) << 1);
                                                                Object[] objArr115 = new Object[1];
                                                                b(c17, i463, i464, objArr115);
                                                                String str53 = (String) objArr115[0];
                                                                int doubleTapTimeout3 = 6 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                                char minimumFlingVelocity3 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                                int threadPriority5 = Process.getThreadPriority(0);
                                                                int i465 = -(((threadPriority5 & 20) + (threadPriority5 | 20)) >> 6);
                                                                int i466 = ((i465 | 589) << 1) - (i465 ^ 589);
                                                                Object[] objArr116 = new Object[1];
                                                                b(minimumFlingVelocity3, doubleTapTimeout3, i466, objArr116);
                                                                String[] strArr13 = {str53, (String) objArr116[0]};
                                                                int i467 = -(-TextUtils.indexOf((CharSequence) str12, '0'));
                                                                Object[] objArr117 = new Object[1];
                                                                b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (i467 & 29) + (i467 | 29), 1863 - View.MeasureSpec.getSize(0), objArr117);
                                                                String str54 = (String) objArr117[0];
                                                                int i468 = 9 - (~(Process.myTid() >> 22));
                                                                char scrollDefaultDelay5 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                                int i469 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                                int i470 = ((i469 | 1841) << 1) - (i469 ^ 1841);
                                                                Object[] objArr118 = new Object[1];
                                                                b(scrollDefaultDelay5, i468, i470, objArr118);
                                                                strArr = new String[][]{strArr10, strArr11, strArr12, strArr13, new String[]{str54, (String) objArr118[0]}};
                                                                int i471 = i6;
                                                                i29 = 0;
                                                                loop5: while (true) {
                                                                    if (i29 >= 5) {
                                                                        i30 = i;
                                                                        break;
                                                                    }
                                                                    c = (d + 41) % 128;
                                                                    String[] strArr14 = strArr[i29];
                                                                    String str55 = strArr14[0];
                                                                    String[] strArr15 = (String[]) Arrays.copyOfRange(strArr14, 1, strArr14.length);
                                                                    int length = strArr15.length;
                                                                    int i472 = 0;
                                                                    while (i472 < length) {
                                                                        i471 = (i471 | 1) + (i471 & 1);
                                                                        Object[] objArr119 = {str55, strArr15[i472]};
                                                                        Object f25 = rV4669.f(1730286819);
                                                                        if (f25 == null) {
                                                                            int scrollBarFadeDuration5 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3265;
                                                                            char mode2 = (char) View.MeasureSpec.getMode(0);
                                                                            int keyRepeatTimeout3 = 52 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                                            byte b24 = (byte) (i8 & 5);
                                                                            strArr2 = strArr;
                                                                            byte b25 = (byte) (b24 + 1);
                                                                            i34 = i29;
                                                                            strArr3 = strArr15;
                                                                            str4 = str55;
                                                                            Object[] objArr120 = new Object[1];
                                                                            c(b25, b24, (byte) (b25 - 1), objArr120);
                                                                            f25 = rV4669.g(scrollBarFadeDuration5, mode2, keyRepeatTimeout3, -293156473, (String) objArr120[0], new Class[]{cls, cls});
                                                                        } else {
                                                                            strArr2 = strArr;
                                                                            i34 = i29;
                                                                            strArr3 = strArr15;
                                                                            str4 = str55;
                                                                        }
                                                                        long longValue14 = ((Long) ((Method) f25).invoke(null, objArr119)).longValue();
                                                                        long j33 = j9 | (-530467772);
                                                                        long j34 = longValue14 ^ (-1);
                                                                        long e15 = com.fingerprintjs.android.fpjs_pro.g.e(52L, ((530467771 | j9) ^ (-1)) | ((longValue14 | 530467771) ^ (-1)), ((-52) * (((j34 | j9) ^ (-1)) | ((j34 | (-530467772)) ^ (-1)) | (j33 ^ (-1)))) + (((j33 | longValue14) ^ (-1)) * 52) + (53 * longValue14) + 27053856372L, -1149310624L);
                                                                        int i473 = ((int) (e15 >> c2)) & ((((~((~((int) SystemClock.elapsedRealtime())) | 1629819329)) | 1610940865) * 374) + (((18878464 | r3) * (-374)) - 1288624716));
                                                                        int i474 = (int) e15;
                                                                        int a8 = hdi.a();
                                                                        if ((i473 | (i474 & ((((~(a8 | 773092534)) | (-798356728) | (~((~a8) | (-638869683)))) * 164) + (((-664133876) | a8) * 164) + ((((~((-773092535) | r8)) | (-664133876)) * (-328)) - 747875519)))) != 0) {
                                                                            int i475 = i471 + 170;
                                                                            i30 = ((~i475) & i) | (i475 & i24);
                                                                            break loop5;
                                                                        }
                                                                        i472++;
                                                                        strArr = strArr2;
                                                                        i29 = i34;
                                                                        strArr15 = strArr3;
                                                                        str55 = str4;
                                                                    }
                                                                    int i476 = i29;
                                                                    i29 = (((i476 | 71) << 1) - (i476 ^ 71)) - 70;
                                                                    strArr = strArr;
                                                                }
                                                                if (i30 != i) {
                                                                    int i477 = d;
                                                                    c = ((i477 & 43) + (i477 | 43)) % 128;
                                                                    Object[] objArr121 = new Object[5];
                                                                    int[] iArr37 = new int[1];
                                                                    objArr121[0] = iArr37;
                                                                    int[] iArr38 = new int[1];
                                                                    objArr121[1] = iArr38;
                                                                    objArr121[i10] = new int[1];
                                                                    iArr38[0] = i;
                                                                    iArr37[0] = i30;
                                                                    objArr121[c3] = null;
                                                                    objArr121[2] = null;
                                                                    int elapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                                                                    int i478 = ((elapsedRealtime3 | (-822214669)) * 465) + ((251482721 | (~((-965165070) | elapsedRealtime3))) * 930) + (((~(elapsedRealtime3 | 251482721)) | (-965165070)) * (-465)) + 1435760239;
                                                                    int i479 = (i478 & 16) + (i478 | 16);
                                                                    int i480 = (i3 ^ i479) + ((i3 & i479) << 1);
                                                                    int i481 = i480 << 13;
                                                                    int i482 = (i480 | i481) & (~(i480 & i481));
                                                                    int i483 = i482 >>> 17;
                                                                    int i484 = ((~i482) & i483) | ((~i483) & i482);
                                                                    int i485 = i484 << 5;
                                                                    ((int[]) objArr121[i10])[0] = (i484 | i485) & (~(i484 & i485));
                                                                    return objArr121;
                                                                }
                                                                try {
                                                                    int i486 = 12 - (~(-(ViewConfiguration.getFadingEdgeLength() >> 16)));
                                                                    int i487 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                                    int gidForName2 = Process.getGidForName(str12);
                                                                    int i488 = (gidForName2 ^ 1892) + ((gidForName2 & 1892) << 1);
                                                                    Object[] objArr122 = new Object[1];
                                                                    b((char) ((i487 & 11559) + (i487 | 11559)), i486, i488, objArr122);
                                                                    String str56 = (String) objArr122[0];
                                                                    int i489 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                                                    int i490 = ((i489 | 8) << 1) - (i489 ^ 8);
                                                                    int maximumDrawingCacheSize2 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                                                    int i491 = (maximumDrawingCacheSize2 & 1904) + (maximumDrawingCacheSize2 | 1904);
                                                                    Object[] objArr123 = new Object[1];
                                                                    b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), i490, i491, objArr123);
                                                                    str2 = (String) objArr123[0];
                                                                    file = new File(str56);
                                                                } catch (Exception unused3) {
                                                                    i31 = i & (-152);
                                                                    i32 = i24 & 151;
                                                                }
                                                                if (file.exists() && file.isFile()) {
                                                                    try {
                                                                        Scanner scanner3 = new Scanner(new FileInputStream(file));
                                                                        int i492 = -(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                                                        int i493 = (i492 & 1) + (i492 | 1);
                                                                        int i494 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                                        int i495 = -TextUtils.indexOf(str12, str12);
                                                                        int i496 = (i495 ^ 370) + ((i495 & 370) << 1);
                                                                        Object[] objArr124 = new Object[1];
                                                                        b((char) ((i494 & 22038) + (i494 | 22038)), i493, i496, objArr124);
                                                                        Scanner useDelimiter3 = scanner3.useDelimiter((String) objArr124[0]);
                                                                        if (useDelimiter3.hasNext()) {
                                                                            str3 = useDelimiter3.next();
                                                                            c = (d + 81) % 128;
                                                                        } else {
                                                                            str3 = str12;
                                                                        }
                                                                        useDelimiter3.close();
                                                                    } catch (IOException unused4) {
                                                                    }
                                                                    if (str3.contains(str2)) {
                                                                        i31 = i & (-151);
                                                                        i32 = i24 & 150;
                                                                        i33 = i31 | i32;
                                                                        if (i33 == i) {
                                                                            Object[] objArr125 = new Object[5];
                                                                            int[] iArr39 = new int[1];
                                                                            objArr125[0] = iArr39;
                                                                            int[] iArr40 = new int[1];
                                                                            objArr125[1] = iArr40;
                                                                            int[] iArr41 = new int[1];
                                                                            objArr125[i10] = iArr41;
                                                                            iArr40[0] = i;
                                                                            iArr39[0] = i33;
                                                                            objArr125[c3] = null;
                                                                            objArr125[2] = null;
                                                                            int i497 = (~((-768553075) | i)) | 142942320;
                                                                            int i498 = -(-com.fingerprintjs.android.fpjs_pro.g.b((~(i | (-625610755))) | (~(i24 | 1073705470)), 470, ((i497 | r2) * (-470)) - 319938546, -16));
                                                                            int i499 = (i3 & i498) + (i3 | i498);
                                                                            int i500 = i499 << 13;
                                                                            int i501 = (i500 | i499) & (~(i499 & i500));
                                                                            int i502 = i501 ^ (i501 >>> 17);
                                                                            iArr41[0] = i502 ^ (i502 << 5);
                                                                            return objArr125;
                                                                        }
                                                                        int i503 = 46 - (~(-(ViewConfiguration.getJumpTapTimeout() >> 16)));
                                                                        char offsetBefore = (char) TextUtils.getOffsetBefore(str12, 0);
                                                                        int i504 = -Color.green(0);
                                                                        int a9 = com.fingerprintjs.android.fpjs_pro.r.a();
                                                                        int i505 = (i504 * 375) - 1428264;
                                                                        int i506 = ~i504;
                                                                        int i507 = ~((i506 ^ 1912) | (i506 & 1912));
                                                                        int i508 = ~a9;
                                                                        int i509 = ~((i508 ^ i504) | (i508 & i504));
                                                                        int i510 = ((i507 & i509) | (i507 ^ i509)) * (-374);
                                                                        int i511 = ((i505 | i510) << 1) - (i505 ^ i510);
                                                                        int i512 = -(-((~(((-1913) ^ i504) | ((-1913) & i504))) * 748));
                                                                        int i513 = ((i511 | i512) << 1) - (i512 ^ i511);
                                                                        int i514 = ~(((-1913) & i506) | (i506 ^ (-1913)));
                                                                        int i515 = ~(i504 | i508);
                                                                        int i516 = -(-(((i515 & i514) | (i514 ^ i515)) * 374));
                                                                        int i517 = (i513 & i516) + (i516 | i513);
                                                                        Object[] objArr126 = new Object[1];
                                                                        b(offsetBefore, i503, i517, objArr126);
                                                                        Object[] objArr127 = {(String) objArr126[0]};
                                                                        Object f26 = rV4669.f(i12);
                                                                        if (f26 == null) {
                                                                            int indexOf12 = TextUtils.indexOf((CharSequence) str12, '0', 0) + 6047;
                                                                            char indexOf13 = (char) TextUtils.indexOf(str12, str12, 0);
                                                                            int indexOf14 = 52 - TextUtils.indexOf(str12, str12, 0);
                                                                            byte b26 = bArr[c4];
                                                                            Object[] objArr128 = new Object[1];
                                                                            c(b26, (short) 0, (byte) (b26 - 3), objArr128);
                                                                            f26 = rV4669.g(indexOf12, indexOf13, indexOf14, 646556096, (String) objArr128[0], new Class[]{cls});
                                                                        }
                                                                        long longValue15 = ((Long) ((Method) f26).invoke(null, objArr127)).longValue();
                                                                        long j35 = longValue15 ^ (-1);
                                                                        long j36 = 64735094 | j35;
                                                                        long elapsedRealtime4 = (int) SystemClock.elapsedRealtime();
                                                                        long j37 = elapsedRealtime4 ^ (-1);
                                                                        long e16 = com.fingerprintjs.android.fpjs_pro.g.e(920L, (((longValue15 | 64735094) | elapsedRealtime4) ^ (-1)) | ((j36 | j37) ^ (-1)) | (((j35 | (-64735095)) | elapsedRealtime4) ^ (-1)), (((j36 ^ (-1)) | ((64735094 | j37) ^ (-1))) * 920) + ((((j36 | elapsedRealtime4) ^ (-1)) | (((j35 | j37) | (-64735095)) ^ (-1))) * 920) + ((-919) * longValue15) + 59491552305L, -275782544L);
                                                                        int i518 = ((int) (e16 >> c2)) & ((((~((-739960403) | i24)) | (-2117780483)) * 216) + (((-8785) | i24) * (-216)) + (((~((-739960403) | i)) * 216) - 1601347030));
                                                                        int i519 = (((~((-1270391012) | i)) | 1251475554 | (~((-1587349875) | i))) * (-880)) + 818884229;
                                                                        int i520 = (~((-1270391012) | i24)) | 1587349874;
                                                                        int i521 = ~(1270391011 | i);
                                                                        int i522 = ((int) e16) & ((i521 * 880) + ((i520 | i521) * (-880)) + i519);
                                                                        int i523 = ((i518 & i522) | (i518 ^ i522)) * 263;
                                                                        int i524 = (i523 & i24) | ((~i523) & i);
                                                                        if (i524 != i) {
                                                                            Object[] objArr129 = new Object[5];
                                                                            int[] iArr42 = new int[1];
                                                                            objArr129[0] = iArr42;
                                                                            int[] iArr43 = new int[1];
                                                                            objArr129[1] = iArr43;
                                                                            objArr129[i10] = new int[1];
                                                                            iArr43[0] = i;
                                                                            iArr42[0] = i524;
                                                                            objArr129[c3] = null;
                                                                            objArr129[2] = null;
                                                                            int freeMemory5 = (int) Runtime.getRuntime().freeMemory();
                                                                            int i525 = (((~(freeMemory5 | (-696868825))) | (-519778967)) * 502) + ((~((~freeMemory5) | (-376578055))) * (-502)) + ((((~((-519778967) | freeMemory5)) | (-1073446879)) * (-502)) - 1783115006) + 16 + i3;
                                                                            int i526 = i525 << 13;
                                                                            int i527 = (i525 | i526) & (~(i525 & i526));
                                                                            int i528 = i527 >>> 17;
                                                                            int i529 = (i527 | i528) & (~(i527 & i528));
                                                                            int i530 = i529 << 5;
                                                                            ((int[]) objArr129[i10])[0] = ((~i529) & i530) | ((~i530) & i529);
                                                                            return objArr129;
                                                                        }
                                                                        Object[] objArr130 = new Object[5];
                                                                        int[] iArr44 = new int[1];
                                                                        objArr130[0] = iArr44;
                                                                        int[] iArr45 = new int[1];
                                                                        objArr130[1] = iArr45;
                                                                        objArr130[i10] = new int[1];
                                                                        iArr45[0] = i;
                                                                        iArr44[0] = i;
                                                                        objArr130[c3] = null;
                                                                        objArr130[2] = null;
                                                                        int i531 = (((~((~((int) Runtime.getRuntime().freeMemory())) | (-378901153))) | 662400366) * 262) + ((((~((-378901153) | r0)) | 662400366) * 262) - 1875728826);
                                                                        int i532 = ((i3 | i531) << 1) - (i3 ^ i531);
                                                                        int i533 = (i532 << 13) ^ i532;
                                                                        int i534 = i533 >>> 17;
                                                                        int i535 = ((~i533) & i534) | ((~i534) & i533);
                                                                        int i536 = i535 << 5;
                                                                        ((int[]) objArr130[i10])[0] = (i535 | i536) & (~(i535 & i536));
                                                                        return objArr130;
                                                                    }
                                                                }
                                                                int i537 = c + 83;
                                                                d = i537 % 128;
                                                                if (i537 % 2 == 0) {
                                                                    throw null;
                                                                }
                                                                i33 = i;
                                                                if (i33 == i) {
                                                                }
                                                            }
                                                        } else {
                                                            int i538 = i425 + 130;
                                                            i35 = (~(i & i538)) & (i538 | i);
                                                        }
                                                        Object[] objArr131 = new Object[5];
                                                        int[] iArr46 = new int[1];
                                                        objArr131[0] = iArr46;
                                                        int[] iArr47 = new int[1];
                                                        objArr131[1] = iArr47;
                                                        objArr131[i10] = new int[1];
                                                        iArr47[0] = i;
                                                        iArr46[0] = i35;
                                                        objArr131[c3] = null;
                                                        objArr131[2] = null;
                                                        int b27 = hdi.b(1352714577);
                                                        int i539 = (((~(b27 | (-657567106))) | 554738817) * 116) + ((559080685 | b27) * 116) + ((~((~b27) | 661908973)) * (-116)) + 1819424918;
                                                        int a10 = com.fingerprintjs.android.fpjs_pro.r.a();
                                                        int i540 = i539 * 407;
                                                        int i541 = ((-6480) ^ i540) + ((i540 & (-6480)) << 1);
                                                        int i542 = ~i539;
                                                        int i543 = ~(i542 | a10);
                                                        int i544 = ~a10;
                                                        int i545 = (i544 ^ 16) | (i544 & 16);
                                                        int i546 = ~((i545 & i539) | (i545 ^ i539));
                                                        int i547 = -(-(((i543 & i546) | (i543 ^ i546)) * (-406)));
                                                        int i548 = (i542 & i544) | (i542 ^ i544);
                                                        int i549 = (((i541 ^ i547) + ((i547 & i541) << 1)) - (~(-(-((~((i548 & 16) | (i548 ^ 16))) * (-406)))))) - 1;
                                                        int i550 = ~((a10 & (-17)) | ((-17) ^ a10));
                                                        int i551 = ~((i539 & i544) | (i544 ^ i539));
                                                        int i552 = -(-(((i551 & i550) | (i550 ^ i551)) * 406));
                                                        int i553 = ((i549 | i552) << 1) - (i552 ^ i549);
                                                        int i554 = i553 * 491;
                                                        int i555 = -(-(i3 * (-489)));
                                                        int i556 = (i554 ^ i555) + ((i554 & i555) << 1);
                                                        int i557 = ~i553;
                                                        int i558 = ~i3;
                                                        int i559 = (i557 ^ i558) | (i557 & i558);
                                                        int i560 = -(-(((i24 & i559) | (i559 ^ i24)) * (-490)));
                                                        int i561 = (i556 ^ i560) + ((i560 & i556) << 1);
                                                        int i562 = ~(i558 | i553);
                                                        int i563 = ~(i | i558);
                                                        int i564 = -(-(((i563 & i562) | (i562 ^ i563)) * 490));
                                                        int i565 = (i557 * 490) + (((i561 | i564) << 1) - (i564 ^ i561));
                                                        int i566 = i565 << 13;
                                                        int i567 = (i566 | i565) & (~(i565 & i566));
                                                        int i568 = i567 ^ (i567 >>> 17);
                                                        int i569 = i568 << 5;
                                                        ((int[]) objArr131[i10])[0] = (i568 | i569) & (~(i568 & i569));
                                                        return objArr131;
                                                    }
                                                }
                                            }
                                            i28 = 0;
                                            f3 = 0.0f;
                                            int i4462 = (TypedValue.complexToFraction(i28, f3, f3) > f3 ? 1 : (TypedValue.complexToFraction(i28, f3, f3) == f3 ? 0 : -1));
                                            int i4472 = ((i4462 | 13) << 1) - (i4462 ^ 13);
                                            char maximumFlingVelocity32 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                            int i4482 = -(-View.combineMeasuredStates(i28, i28));
                                            int i4492 = (i4482 & 1755) + (i4482 | 1755);
                                            Object[] objArr1082 = new Object[1];
                                            b(maximumFlingVelocity32, i4472, i4492, objArr1082);
                                            String str492 = (String) objArr1082[i28];
                                            Object[] objArr1092 = new Object[1];
                                            b((char) TextUtils.getOffsetAfter(str12, i28), 6 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1767 - (~(-(KeyEvent.getMaxKeyCode() >> 16))), objArr1092);
                                            String[] strArr102 = {str492, (String) objArr1092[i28]};
                                            int packedPositionChild32 = ExpandableListView.getPackedPositionChild(0L);
                                            int i4502 = (packedPositionChild32 & 16) + (packedPositionChild32 | 16);
                                            char offsetAfter42 = (char) TextUtils.getOffsetAfter(str12, i28);
                                            int i4512 = -(-TextUtils.lastIndexOf(str12, '0', i28, i28));
                                            int i4522 = (i4512 ^ 1774) + ((i4512 & 1774) << 1);
                                            Object[] objArr1102 = new Object[1];
                                            b(offsetAfter42, i4502, i4522, objArr1102);
                                            String str502 = (String) objArr1102[i28];
                                            int longPressTimeout42 = 19 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                            int i4532 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                            int i4542 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                            int i4552 = (i4542 & 1788) + (i4542 | 1788);
                                            Object[] objArr1112 = new Object[1];
                                            b((char) (((i4532 | 1) << 1) - (i4532 ^ 1)), longPressTimeout42, i4552, objArr1112);
                                            String str512 = (String) objArr1112[0];
                                            int scrollDefaultDelay42 = 14 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                            int i4562 = -Color.red(0);
                                            int i4572 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                            int i4582 = (i4572 ^ 1807) + ((i4572 & 1807) << 1);
                                            Object[] objArr1122 = new Object[1];
                                            b((char) ((i4562 & 36398) + (i4562 | 36398)), scrollDefaultDelay42, i4582, objArr1122);
                                            String[] strArr112 = {str502, str512, (String) objArr1122[0]};
                                            int i4592 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                            int i4602 = ((i4592 | 21) << 1) - (i4592 ^ 21);
                                            char c162 = (char) ((-2) - (~(-MotionEvent.axisFromString(str12))));
                                            int i4612 = -(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                            int i4622 = (i4612 & 1820) + (i4612 | 1820);
                                            Object[] objArr1132 = new Object[1];
                                            b(c162, i4602, i4622, objArr1132);
                                            String str522 = (String) objArr1132[0];
                                            int indexOf112 = TextUtils.indexOf((CharSequence) str12, '0', 0);
                                            Object[] objArr1142 = new Object[1];
                                            b((char) View.resolveSize(0, 0), (indexOf112 & 11) + (indexOf112 | 11), 1841 - (~(ViewConfiguration.getTouchSlop() >> 8)), objArr1142);
                                            String[] strArr122 = {str522, (String) objArr1142[0]};
                                            int i4632 = 10 - (~(-ExpandableListView.getPackedPositionType(0L)));
                                            char c172 = (char) (0 - (~((byte) KeyEvent.getModifierMetaStateMask())));
                                            int keyRepeatTimeout22 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                            int i4642 = (keyRepeatTimeout22 ^ 1852) + ((keyRepeatTimeout22 & 1852) << 1);
                                            Object[] objArr1152 = new Object[1];
                                            b(c172, i4632, i4642, objArr1152);
                                            String str532 = (String) objArr1152[0];
                                            int doubleTapTimeout32 = 6 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                            char minimumFlingVelocity32 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                            int threadPriority52 = Process.getThreadPriority(0);
                                            int i4652 = -(((threadPriority52 & 20) + (threadPriority52 | 20)) >> 6);
                                            int i4662 = ((i4652 | 589) << 1) - (i4652 ^ 589);
                                            Object[] objArr1162 = new Object[1];
                                            b(minimumFlingVelocity32, doubleTapTimeout32, i4662, objArr1162);
                                            String[] strArr132 = {str532, (String) objArr1162[0]};
                                            int i4672 = -(-TextUtils.indexOf((CharSequence) str12, '0'));
                                            Object[] objArr1172 = new Object[1];
                                            b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (i4672 & 29) + (i4672 | 29), 1863 - View.MeasureSpec.getSize(0), objArr1172);
                                            String str542 = (String) objArr1172[0];
                                            int i4682 = 9 - (~(Process.myTid() >> 22));
                                            char scrollDefaultDelay52 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                            int i4692 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                            int i4702 = ((i4692 | 1841) << 1) - (i4692 ^ 1841);
                                            Object[] objArr1182 = new Object[1];
                                            b(scrollDefaultDelay52, i4682, i4702, objArr1182);
                                            strArr = new String[][]{strArr102, strArr112, strArr122, strArr132, new String[]{str542, (String) objArr1182[0]}};
                                            int i4712 = i6;
                                            i29 = 0;
                                            loop5: while (true) {
                                                if (i29 >= 5) {
                                                }
                                                int i4762 = i29;
                                                i29 = (((i4762 | 71) << 1) - (i4762 ^ 71)) - 70;
                                                strArr = strArr;
                                            }
                                            if (i30 != i) {
                                            }
                                        }
                                    }
                                    int i570 = -AndroidCharacter.getMirror('0');
                                    int i571 = (i570 ^ 71) + ((i570 & 71) << 1);
                                    int i572 = -Color.rgb(0, 0, 0);
                                    int i573 = -((byte) KeyEvent.getModifierMetaStateMask());
                                    int i574 = (i573 ^ 371) + ((i573 & 371) << 1);
                                    Object[] objArr132 = new Object[1];
                                    b((char) (((-16777216) ^ i572) + ((i572 & (-16777216)) << 1)), i571, i574, objArr132);
                                    String str57 = (String) objArr132[0];
                                    int i575 = -Process.getGidForName(str12);
                                    Object[] objArr133 = new Object[1];
                                    b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 26920), (i575 ^ 9) + ((i575 & 9) << 1), 617 - (ViewConfiguration.getEdgeSlop() >> 16), objArr133);
                                    String str58 = (String) objArr133[0];
                                    int resolveOpacity4 = Drawable.resolveOpacity(0, 0);
                                    int i576 = (resolveOpacity4 ^ 7) + ((resolveOpacity4 & 7) << 1);
                                    char resolveSize3 = (char) View.resolveSize(0, 0);
                                    int scrollBarFadeDuration6 = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                    int i577 = (scrollBarFadeDuration6 & 627) + (scrollBarFadeDuration6 | 627);
                                    Object[] objArr134 = new Object[1];
                                    b(resolveSize3, i576, i577, objArr134);
                                    String str59 = (String) objArr134[0];
                                    int i578 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                    int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                                    Object[] objArr135 = new Object[1];
                                    b((char) ((58717 & jumpTapTimeout) + (jumpTapTimeout | 58717)), ((i578 | 8) << 1) - (i578 ^ 8), 634 - (~((byte) KeyEvent.getModifierMetaStateMask())), objArr135);
                                    String[] strArr16 = {str57, str58, str59, (String) objArr135[0]};
                                    int i579 = -(-Gravity.getAbsoluteGravity(0, 0));
                                    int i580 = (i579 ^ 17) + ((i579 & 17) << 1);
                                    int i581 = -TextUtils.indexOf((CharSequence) str12, '0');
                                    int i582 = -(-View.getDefaultSize(0, 0));
                                    int i583 = (i582 ^ 642) + ((i582 & 642) << 1);
                                    Object[] objArr136 = new Object[1];
                                    b((char) ((i581 ^ (-1)) + (i581 << 1)), i580, i583, objArr136);
                                    String str60 = (String) objArr136[0];
                                    int pressedStateDuration2 = ViewConfiguration.getPressedStateDuration() >> 16;
                                    int i584 = ((pressedStateDuration2 | 7) << 1) - (pressedStateDuration2 ^ 7);
                                    char capsMode = (char) TextUtils.getCapsMode(str12, 0, 0);
                                    int i585 = -TextUtils.getCapsMode(str12, 0, 0);
                                    int i586 = (i585 & 659) + (i585 | 659);
                                    Object[] objArr137 = new Object[1];
                                    b(capsMode, i584, i586, objArr137);
                                    String str61 = (String) objArr137[0];
                                    int rgb3 = Color.rgb(0, 0, 0) + 16777223;
                                    int i587 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                    Object[] objArr138 = new Object[1];
                                    b((char) (((58736 | i587) << 1) - (i587 ^ 58736)), rgb3, 665 - (~(-TextUtils.indexOf(str12, str12, 0))), objArr138);
                                    String str62 = (String) objArr138[0];
                                    int i588 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                    int i589 = ~i588;
                                    int i590 = ~((i589 ^ (-13)) | (i589 & (-13)));
                                    int i591 = ~((-13) | i48);
                                    int i592 = (((i590 ^ i591) | (i591 & i590)) * 446) + ((i588 * (-445)) - 5340);
                                    int i593 = ~((i589 ^ 12) | (i589 & 12));
                                    int i594 = ((-13) & i588) | ((-13) ^ i588);
                                    int i595 = ~((i594 & i) | (i594 ^ i));
                                    int i596 = ((i595 & i593) | (i593 ^ i595)) * 446;
                                    int i597 = ((((i592 | i596) << 1) - (i596 ^ i592)) - (~(i590 * 446))) - 1;
                                    char c18 = (char) ((-2) - (~(-TextUtils.lastIndexOf(str12, '0', 0))));
                                    int i598 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                    int i599 = (i598 & 673) + (i598 | 673);
                                    Object[] objArr139 = new Object[1];
                                    b(c18, i597, i599, objArr139);
                                    String str63 = (String) objArr139[0];
                                    int i600 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                    int i601 = (i600 ^ 14) + ((i600 & 14) << 1);
                                    char modifierMetaStateMask2 = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                                    int i602 = -TextUtils.getOffsetBefore(str12, 0);
                                    Object[] objArr140 = new Object[1];
                                    b(modifierMetaStateMask2, i601, (i602 & 684) + (i602 | 684), objArr140);
                                    String[] strArr17 = {str60, str61, str62, str63, (String) objArr140[0]};
                                    int lastIndexOf4 = TextUtils.lastIndexOf(str12, '0', 0, 0);
                                    int i603 = lastIndexOf4 * 765;
                                    int i604 = (i603 & (-25959)) + (i603 | (-25959));
                                    int i605 = ~com.fingerprintjs.android.fpjs_pro.r.a();
                                    int i606 = ~((i605 ^ lastIndexOf4) | (i605 & lastIndexOf4));
                                    int i607 = -(-(((i606 ^ 17) | (i606 & 17)) * 764));
                                    int i608 = (i604 ^ i607) + ((i604 & i607) << 1);
                                    int i609 = ~lastIndexOf4;
                                    int i610 = ~((i609 & 17) | (i609 ^ 17));
                                    int i611 = (((~((i605 & 17) | (i605 ^ 17))) | i610) * (-1528)) + i608;
                                    int i612 = ~((lastIndexOf4 & (-18)) | ((-18) ^ lastIndexOf4));
                                    int i613 = -(-(((i612 & i610) | (i610 ^ i612) | i606) * 764));
                                    int i614 = (i611 ^ i613) + ((i613 & i611) << 1);
                                    int red3 = Color.red(0);
                                    int i615 = -(-Color.alpha(0));
                                    int i616 = (i615 ^ 698) + ((i615 & 698) << 1);
                                    Object[] objArr141 = new Object[1];
                                    b((char) (((51889 | red3) << 1) - (red3 ^ 51889)), i614, i616, objArr141);
                                    String str64 = (String) objArr141[0];
                                    int i617 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                    c3 = 4;
                                    int i618 = (i617 & 4) + (i617 | 4);
                                    char c19 = (char) (831 - (~(-(ViewConfiguration.getLongPressTimeout() >> 16))));
                                    int indexOf15 = TextUtils.indexOf(str12, str12, 0);
                                    int i619 = (indexOf15 ^ 714) + ((indexOf15 & 714) << 1);
                                    Object[] objArr142 = new Object[1];
                                    b(c19, i618, i619, objArr142);
                                    String str65 = (String) objArr142[0];
                                    int deadChar3 = KeyEvent.getDeadChar(0, 0) + 22;
                                    char c20 = (char) (62813 - (~(-Color.green(0))));
                                    int i620 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                    int i621 = ((i620 | 725) << 1) - (i620 ^ 725);
                                    Object[] objArr143 = new Object[1];
                                    b(c20, deadChar3, i621, objArr143);
                                    String str66 = (String) objArr143[0];
                                    int i622 = -KeyEvent.getDeadChar(0, 0);
                                    int i623 = ((i622 | 25) << 1) - (i622 ^ 25);
                                    char c21 = (char) (28428 - (~(-(-TextUtils.lastIndexOf(str12, '0', 0)))));
                                    int i624 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1));
                                    Object[] objArr144 = new Object[1];
                                    b(c21, i623, (i624 & 747) + (i624 | 747), objArr144);
                                    String str67 = (String) objArr144[0];
                                    int lastIndexOf5 = TextUtils.lastIndexOf(str12, '0', 0, 0) + 29;
                                    int indexOf16 = TextUtils.indexOf((CharSequence) str12, '0');
                                    Object[] objArr145 = new Object[1];
                                    b((char) ((62023 & indexOf16) + (indexOf16 | 62023)), lastIndexOf5, ExpandableListView.getPackedPositionType(0L) + 772, objArr145);
                                    cls = String.class;
                                    c4 = 6;
                                    i24 = i48;
                                    String[] strArr18 = {str64, str65, str5, str66, str67, (String) objArr145[0]};
                                    int resolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0);
                                    int i625 = (resolveSizeAndState2 & 11) + (resolveSizeAndState2 | 11);
                                    char c22 = (char) (41208 - (~(-KeyEvent.getDeadChar(0, 0))));
                                    int offsetAfter5 = TextUtils.getOffsetAfter(str12, 0);
                                    int i626 = (offsetAfter5 ^ 800) + ((offsetAfter5 & 800) << 1);
                                    Object[] objArr146 = new Object[1];
                                    b(c22, i625, i626, objArr146);
                                    String str68 = (String) objArr146[0];
                                    Object[] objArr147 = new Object[1];
                                    b((char) TextUtils.getCapsMode(str12, 0, 0), 7 - (~(-(-(Process.myPid() >> 22)))), 810 - (~(-(-(ViewConfiguration.getMinimumFlingVelocity() >> 16)))), objArr147);
                                    String str69 = (String) objArr147[0];
                                    int i627 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                    Object[] objArr148 = new Object[1];
                                    b((char) Color.alpha(0), (i627 & 6) + (i627 | 6), 818 - (~(-Color.red(0))), objArr148);
                                    String str70 = (String) objArr148[0];
                                    int i628 = -(-(Process.myTid() >> 22));
                                    int i629 = (i628 ^ 6) + ((i628 & 6) << 1);
                                    char c23 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int i630 = -(-AndroidCharacter.getMirror('0'));
                                    i25 = 19;
                                    Object[] objArr149 = new Object[1];
                                    b(c23, i629, (i630 & 777) + (i630 | 777), objArr149);
                                    String[] strArr19 = {str68, str69, str70, (String) objArr149[0]};
                                    int axisFromString = MotionEvent.axisFromString(str12);
                                    int i631 = (axisFromString ^ 17) + ((axisFromString & 17) << 1);
                                    int i632 = -KeyEvent.normalizeMetaState(0);
                                    int i633 = -Color.alpha(0);
                                    int i634 = ((i633 | 831) << 1) - (i633 ^ 831);
                                    Object[] objArr150 = new Object[1];
                                    b((char) ((55023 ^ i632) + ((i632 & 55023) << 1)), i631, i634, objArr150);
                                    String str71 = (String) objArr150[0];
                                    int i635 = 5 - (~(-MotionEvent.axisFromString(str12)));
                                    int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
                                    int red4 = Color.red(0);
                                    int i636 = ((red4 | 666) << 1) - (red4 ^ 666);
                                    Object[] objArr151 = new Object[1];
                                    b((char) (((58736 | makeMeasureSpec4) << 1) - (makeMeasureSpec4 ^ 58736)), i635, i636, objArr151);
                                    String str72 = (String) objArr151[0];
                                    byte modifierMetaStateMask3 = (byte) KeyEvent.getModifierMetaStateMask();
                                    Object[] objArr152 = new Object[1];
                                    b((char) (58717 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), ((modifierMetaStateMask3 | 9) << 1) - (modifierMetaStateMask3 ^ 9), 634 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr152);
                                    String[] strArr20 = {str71, str72, (String) objArr152[0]};
                                    int edgeSlop2 = ViewConfiguration.getEdgeSlop() >> 16;
                                    Object[] objArr153 = new Object[1];
                                    b((char) (ViewConfiguration.getPressedStateDuration() >> 16), (edgeSlop2 & 14) + (edgeSlop2 | 14), 847 - Gravity.getAbsoluteGravity(0, 0), objArr153);
                                    String str73 = (String) objArr153[0];
                                    int i637 = -KeyEvent.getDeadChar(0, 0);
                                    int i638 = (i637 ^ 1) + ((i637 & 1) << 1);
                                    char keyCodeFromString3 = (char) (KeyEvent.keyCodeFromString(str12) + 27160);
                                    int i639 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                    int i640 = (i639 & 860) + (i639 | 860);
                                    Object[] objArr154 = new Object[1];
                                    b(keyCodeFromString3, i638, i640, objArr154);
                                    String[] strArr21 = {str73, (String) objArr154[0]};
                                    Object[] objArr155 = new Object[1];
                                    b((char) (ViewConfiguration.getEdgeSlop() >> 16), 8 - MotionEvent.axisFromString(str12), 861 - TextUtils.lastIndexOf(str12, '0', 0), objArr155);
                                    String str74 = (String) objArr155[0];
                                    int scrollBarFadeDuration7 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1;
                                    char minimumFlingVelocity4 = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 324);
                                    int i641 = -TextUtils.lastIndexOf(str12, '0');
                                    int i642 = (i641 & 870) + (i641 | 870);
                                    Object[] objArr156 = new Object[1];
                                    b(minimumFlingVelocity4, scrollBarFadeDuration7, i642, objArr156);
                                    String[] strArr22 = {str74, (String) objArr156[0]};
                                    int keyRepeatDelay2 = 16 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                    char c24 = (char) (5637 - (~(-(-MotionEvent.axisFromString(str12)))));
                                    int i643 = -(-Color.alpha(0));
                                    int i644 = ((i643 | 872) << 1) - (i643 ^ 872);
                                    Object[] objArr157 = new Object[1];
                                    b(c24, keyRepeatDelay2, i644, objArr157);
                                    String str75 = (String) objArr157[0];
                                    int i645 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
                                    int i646 = ((i645 | 3) << 1) - (i645 ^ 3);
                                    int i647 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                    int i648 = (i647 * (-515)) + 430144;
                                    int i649 = ~(((-833) ^ i) | ((-833) & i));
                                    int i650 = ~(i24 | i647);
                                    int i651 = (i649 & i650) | (i649 ^ i650);
                                    int i652 = ~((i24 ^ 832) | (i24 & 832));
                                    int i653 = -(-(((i651 & i652) | (i651 ^ i652)) * (-516)));
                                    int i654 = ((i648 | i653) << 1) - (i648 ^ i653);
                                    int i655 = ~i647;
                                    int i656 = (i655 ^ (-833)) | (i655 & (-833));
                                    int i657 = ~((i656 & i) | (i656 ^ i));
                                    int i658 = (i655 ^ i24) | (i655 & i24);
                                    int i659 = ~((i658 & 832) | (i658 ^ 832));
                                    int i660 = ((i657 & i659) | (i657 ^ i659)) * 516;
                                    int i661 = (i654 & i660) + (i660 | i654);
                                    int i662 = -(-(((~(i655 | 832)) | i652) * 516));
                                    char c25 = (char) ((i661 & i662) + (i662 | i661));
                                    int i663 = -View.MeasureSpec.getSize(0);
                                    int i664 = (i663 & 714) + (i663 | 714);
                                    Object[] objArr158 = new Object[1];
                                    b(c25, i646, i664, objArr158);
                                    String str76 = (String) objArr158[0];
                                    int keyCodeFromString4 = KeyEvent.keyCodeFromString(str12);
                                    int i665 = (keyCodeFromString4 ^ 7) + ((keyCodeFromString4 & 7) << 1);
                                    char resolveOpacity5 = (char) Drawable.resolveOpacity(0, 0);
                                    int i666 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                    int i667 = (i666 ^ 659) + ((i666 & 659) << 1);
                                    Object[] objArr159 = new Object[1];
                                    b(resolveOpacity5, i665, i667, objArr159);
                                    String str77 = (String) objArr159[0];
                                    int i668 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                                    Object[] objArr160 = new Object[1];
                                    b((char) (2120 - (~(-TextUtils.indexOf((CharSequence) str12, '0', 0, 0)))), (i668 & 8) + (i668 | 8), 888 - ExpandableListView.getPackedPositionType(0L), objArr160);
                                    String str78 = (String) objArr160[0];
                                    int jumpTapTimeout2 = ViewConfiguration.getJumpTapTimeout() >> 16;
                                    int i669 = (jumpTapTimeout2 ^ 11) + ((jumpTapTimeout2 & 11) << 1);
                                    int threadPriority6 = Process.getThreadPriority(0);
                                    int i670 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                    int i671 = ((i670 | 673) << 1) - (i670 ^ 673);
                                    Object[] objArr161 = new Object[1];
                                    b((char) (((threadPriority6 ^ 20) + ((threadPriority6 & 20) << 1)) >> 6), i669, i671, objArr161);
                                    String str79 = (String) objArr161[0];
                                    int lastIndexOf6 = 13 - TextUtils.lastIndexOf(str12, '0', 0, 0);
                                    char c26 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int normalizeMetaState2 = KeyEvent.normalizeMetaState(0);
                                    int i672 = (normalizeMetaState2 ^ 684) + ((normalizeMetaState2 & 684) << 1);
                                    Object[] objArr162 = new Object[1];
                                    b(c26, lastIndexOf6, i672, objArr162);
                                    String[] strArr23 = {str75, str76, str77, str78, str79, (String) objArr162[0]};
                                    int touchSlop = ViewConfiguration.getTouchSlop() >> 8;
                                    int i673 = (touchSlop ^ 20) + ((touchSlop & 20) << 1);
                                    char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                                    int i674 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                    int i675 = (i674 & 897) + (i674 | 897);
                                    Object[] objArr163 = new Object[1];
                                    b(absoluteGravity, i673, i675, objArr163);
                                    String str80 = (String) objArr163[0];
                                    int i676 = 17 - (~(-TextUtils.lastIndexOf(str12, '0')));
                                    int windowTouchSlop7 = ViewConfiguration.getWindowTouchSlop() >> 8;
                                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0);
                                    int i677 = ((bitsPerPixel | 917) << 1) - (bitsPerPixel ^ 917);
                                    Object[] objArr164 = new Object[1];
                                    b((char) ((windowTouchSlop7 ^ 5566) + ((windowTouchSlop7 & 5566) << 1)), i676, i677, objArr164);
                                    String str81 = (String) objArr164[0];
                                    int i678 = 29 - (~(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                    char c27 = (char) (43617 - (~(-TextUtils.indexOf((CharSequence) str12, '0'))));
                                    int i679 = -(-Color.argb(0, 0, 0, 0));
                                    int i680 = (i679 & 935) + (i679 | 935);
                                    Object[] objArr165 = new Object[1];
                                    b(c27, i678, i680, objArr165);
                                    String str82 = (String) objArr165[0];
                                    int keyRepeatDelay3 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                                    int i681 = ((keyRepeatDelay3 | 26) << 1) - (keyRepeatDelay3 ^ 26);
                                    int i682 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                    Object[] objArr166 = new Object[1];
                                    b((char) (((49363 | i682) << 1) - (i682 ^ 49363)), i681, 965 - (~(-(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)))), objArr166);
                                    String str83 = (String) objArr166[0];
                                    int i683 = -Drawable.resolveOpacity(0, 0);
                                    int i684 = ((i683 | 23) << 1) - (i683 ^ 23);
                                    char capsMode2 = (char) TextUtils.getCapsMode(str12, 0, 0);
                                    int i685 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                                    Object[] objArr167 = new Object[1];
                                    b(capsMode2, i684, (i685 & 992) + (i685 | 992), objArr167);
                                    String str84 = (String) objArr167[0];
                                    int i686 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
                                    int i687 = ((i686 | 34) << 1) - (i686 ^ 34);
                                    char c28 = (char) (65053 - (~(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))));
                                    int i688 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int i689 = i688 * 141;
                                    int i690 = ((i689 | (-141085)) << 1) - (i689 ^ (-141085));
                                    int i691 = ~i688;
                                    int i692 = ~((i691 ^ 1015) | (i691 & 1015));
                                    int i693 = ~((i691 ^ i) | (i691 & i));
                                    int i694 = (((((i692 ^ i693) | (i692 & i693)) * (-280)) + i690) - (~((i693 | (~(((-1016) ^ i) | ((-1016) & i)))) * 140))) - 1;
                                    int i695 = (i691 ^ (-1016)) | (i691 & (-1016));
                                    int i696 = (~((i695 ^ i) | (i695 & i))) | (~((i691 ^ i24) | (i691 & i24) | 1015));
                                    int i697 = ((-1016) ^ i24) | ((-1016) & i24);
                                    int i698 = ~((i697 ^ i688) | (i697 & i688));
                                    int i699 = (i694 - (~(-(-(((i696 & i698) | (i696 ^ i698)) * 140))))) - 1;
                                    Object[] objArr168 = new Object[1];
                                    b(c28, i687, i699, objArr168);
                                    int i700 = 2;
                                    String[] strArr24 = {str80, str81, str82, str83, str84, (String) objArr168[0], str5};
                                    int i701 = -(Process.myPid() >> 22);
                                    Object[] objArr169 = new Object[1];
                                    b((char) (35154 - (~(-KeyEvent.getDeadChar(0, 0)))), (i701 & 13) + (i701 | 13), 1047 - (~(-(ViewConfiguration.getScrollDefaultDelay() >> 16))), objArr169);
                                    String str85 = (String) objArr169[0];
                                    int i702 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                    int a11 = com.fingerprintjs.android.fpjs_pro.r.a();
                                    int i703 = i702 * 477;
                                    int i704 = ((i703 | (-2850)) << 1) - (i703 ^ (-2850));
                                    int i705 = ~i702;
                                    int i706 = ~((i705 & 6) | (i705 ^ 6));
                                    int i707 = ((-7) ^ i702) | ((-7) & i702);
                                    int i708 = ~((i707 & a11) | (i707 ^ a11));
                                    int i709 = (i704 - (~(((i706 & i708) | (i706 ^ i708)) * (-476)))) - 1;
                                    int i710 = -(-(i708 * 952));
                                    int i711 = (~a11) | (-7);
                                    int i712 = ((~((i702 & i711) | (i711 ^ i702))) * 476) + (i709 & i710) + (i710 | i709);
                                    char blue3 = (char) Color.blue(0);
                                    int i713 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                    int i714 = (i713 ^ 627) + ((i713 & 627) << 1);
                                    Object[] objArr170 = new Object[1];
                                    b(blue3, i712, i714, objArr170);
                                    String[] strArr25 = {str85, (String) objArr170[0]};
                                    int i715 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    Object[] objArr171 = new Object[1];
                                    b((char) ExpandableListView.getPackedPositionGroup(0L), ((i715 | 30) << 1) - (i715 ^ 30), 1060 - (~(-TextUtils.indexOf(str12, str12, 0))), objArr171);
                                    String str86 = (String) objArr171[0];
                                    int packedPositionGroup3 = 11 - ExpandableListView.getPackedPositionGroup(0L);
                                    char c29 = (char) (63442 - (~(-(-TextUtils.indexOf((CharSequence) str12, '0', 0)))));
                                    int i716 = -KeyEvent.getDeadChar(0, 0);
                                    int i717 = ((i716 | 1091) << 1) - (i716 ^ 1091);
                                    Object[] objArr172 = new Object[1];
                                    b(c29, packedPositionGroup3, i717, objArr172);
                                    String[] strArr26 = {str86, (String) objArr172[0]};
                                    int i718 = -(Process.myPid() >> 22);
                                    Object[] objArr173 = new Object[1];
                                    b((char) (ImageFormat.getBitsPerPixel(0) + 51290), ((i718 | 19) << 1) - (i718 ^ 19), 1102 - View.combineMeasuredStates(0, 0), objArr173);
                                    String str87 = (String) objArr173[0];
                                    Object[] objArr174 = new Object[1];
                                    b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.red(0) + 5, 1120 - (~(-(-(ViewConfiguration.getWindowTouchSlop() >> 8)))), objArr174);
                                    String[] strArr27 = {str87, (String) objArr174[0]};
                                    int i719 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                                    int i720 = ((i719 | 19) << 1) - (i719 ^ 19);
                                    int keyRepeatTimeout4 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                    int i721 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                    int i722 = ((i721 | 1126) << 1) - (i721 ^ 1126);
                                    Object[] objArr175 = new Object[1];
                                    b((char) (((keyRepeatTimeout4 | 21922) << 1) - (keyRepeatTimeout4 ^ 21922)), i720, i722, objArr175);
                                    String[] strArr28 = {(String) objArr175[0]};
                                    int i723 = 14 - (~(-ImageFormat.getBitsPerPixel(0)));
                                    char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                                    int i724 = -(-(Process.myTid() >> 22));
                                    int i725 = ((i724 | 1145) << 1) - (i724 ^ 1145);
                                    Object[] objArr176 = new Object[1];
                                    b(scrollBarSize2, i723, i725, objArr176);
                                    String[] strArr29 = {(String) objArr176[0]};
                                    int i726 = 18 - (~(-KeyEvent.normalizeMetaState(0)));
                                    int i727 = -Color.blue(0);
                                    Object[] objArr177 = new Object[1];
                                    b((char) ((58646 & i727) + (i727 | 58646)), i726, 1161 - (ViewConfiguration.getEdgeSlop() >> 16), objArr177);
                                    String[] strArr30 = {(String) objArr177[0]};
                                    int i728 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
                                    int i729 = (i728 ^ 19) + ((i728 & 19) << 1);
                                    char size2 = (char) View.MeasureSpec.getSize(0);
                                    int doubleTapTimeout4 = ViewConfiguration.getDoubleTapTimeout() >> 16;
                                    int i730 = ((doubleTapTimeout4 | 1180) << 1) - (doubleTapTimeout4 ^ 1180);
                                    Object[] objArr178 = new Object[1];
                                    b(size2, i729, i730, objArr178);
                                    String[] strArr31 = {(String) objArr178[0]};
                                    int i731 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                    int i732 = (i731 & 22) + (i731 | 22);
                                    int indexOf17 = TextUtils.indexOf((CharSequence) str12, '0', 0, 0);
                                    int i733 = -((byte) KeyEvent.getModifierMetaStateMask());
                                    int i734 = (i733 ^ 1198) + ((i733 & 1198) << 1);
                                    Object[] objArr179 = new Object[1];
                                    b((char) ((52137 & indexOf17) + (indexOf17 | 52137)), i732, i734, objArr179);
                                    String[] strArr32 = {(String) objArr179[0]};
                                    int i735 = 20 - (~(-Gravity.getAbsoluteGravity(0, 0)));
                                    int i736 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                    int i737 = -(-TextUtils.getCapsMode(str12, 0, 0));
                                    int i738 = (i737 & 1222) + (i737 | 1222);
                                    Object[] objArr180 = new Object[1];
                                    b((char) ((58920 ^ i736) + ((i736 & 58920) << 1)), i735, i738, objArr180);
                                    String[] strArr33 = {(String) objArr180[0]};
                                    int fadingEdgeLength2 = ViewConfiguration.getFadingEdgeLength() >> 16;
                                    Object[] objArr181 = new Object[1];
                                    b((char) TextUtils.getTrimmedLength(str12), (fadingEdgeLength2 & 24) + (fadingEdgeLength2 | 24), 1242 - (~(ViewConfiguration.getFadingEdgeLength() >> 16)), objArr181);
                                    String[] strArr34 = {(String) objArr181[0], str5};
                                    int i739 = -View.resolveSize(0, 0);
                                    int i740 = (i739 & 28) + (i739 | 28);
                                    int i741 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    Object[] objArr182 = new Object[1];
                                    b((char) (((i741 | 1) << 1) - (i741 ^ 1)), i740, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1267, objArr182);
                                    String[] strArr35 = {(String) objArr182[0], str5};
                                    Object[] objArr183 = new Object[1];
                                    b((char) TextUtils.indexOf(str12, str12, 0, 0), TextUtils.indexOf(str12, str12, 0, 0) + 27, (ViewConfiguration.getPressedStateDuration() >> 16) + 1295, objArr183);
                                    String[] strArr36 = {(String) objArr183[0], str5};
                                    int i742 = 30 - (~(-Color.blue(0)));
                                    char offsetAfter6 = (char) TextUtils.getOffsetAfter(str12, 0);
                                    int argb2 = Color.argb(0, 0, 0, 0);
                                    int i743 = ((argb2 | 1322) << 1) - (argb2 ^ 1322);
                                    Object[] objArr184 = new Object[1];
                                    b(offsetAfter6, i742, i743, objArr184);
                                    String[] strArr37 = {(String) objArr184[0], str5};
                                    int doubleTapTimeout5 = ViewConfiguration.getDoubleTapTimeout() >> 16;
                                    int i744 = ((doubleTapTimeout5 | 27) << 1) - (doubleTapTimeout5 ^ 27);
                                    int packedPositionChild4 = ExpandableListView.getPackedPositionChild(0L);
                                    Object[] objArr185 = new Object[1];
                                    b((char) (((packedPositionChild4 | 3951) << 1) - (packedPositionChild4 ^ 3951)), i744, 1353 - TextUtils.indexOf(str12, str12), objArr185);
                                    String[] strArr38 = {(String) objArr185[0], str5};
                                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 32;
                                    char c30 = (char) ((-2) - (~(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                    int i745 = -View.combineMeasuredStates(0, 0);
                                    int i746 = ((i745 | 1380) << 1) - (i745 ^ 1380);
                                    Object[] objArr186 = new Object[1];
                                    b(c30, packedPositionType, i746, objArr186);
                                    String[][] strArr39 = {strArr16, strArr17, strArr18, strArr19, strArr20, strArr21, strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, new String[]{(String) objArr186[0], str5}};
                                    ArrayList arrayList = new ArrayList();
                                    int i747 = i;
                                    int i748 = 0;
                                    int i749 = 0;
                                    for (int i750 = i14; i748 < i750; i750 = 24) {
                                        int i751 = c;
                                        d = ((i751 & 41) + (i751 | 41)) % 128;
                                        String[] strArr40 = strArr39[i748];
                                        Object[] objArr187 = {strArr40[0]};
                                        Object f27 = rV4669.f(i13);
                                        if (f27 == null) {
                                            int edgeSlop3 = 6202 - (ViewConfiguration.getEdgeSlop() >> 16);
                                            i26 = i700;
                                            char keyRepeatTimeout5 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                            int i752 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 50;
                                            Object[] objArr188 = new Object[1];
                                            c((byte) 0, (short) 0, (short) 0, objArr188);
                                            f27 = rV4669.g(edgeSlop3, keyRepeatTimeout5, i752, 1857630294, (String) objArr188[0], new Class[]{cls});
                                        } else {
                                            i26 = i700;
                                        }
                                        String str88 = (String) ((Method) f27).invoke(null, objArr187);
                                        String[] strArr41 = (String[]) Arrays.copyOfRange(strArr40, 1, strArr40.length);
                                        if (str88 != null) {
                                            int i753 = c + 83;
                                            d = i753 % 128;
                                            if (i753 % 2 == 0) {
                                                int i754 = 54 / 0;
                                            }
                                        }
                                        String[][] strArr42 = strArr39;
                                        int i755 = i748;
                                        int i756 = (i755 ^ (-49)) + ((i755 & (-49)) << 1);
                                        i748 = ((i756 | 50) << 1) - (i756 ^ 50);
                                        i700 = i26;
                                        strArr39 = strArr42;
                                    }
                                    int i757 = i700;
                                    if (i749 > i757) {
                                        objArr = new Object[5];
                                        int[] iArr48 = new int[1];
                                        objArr[0] = iArr48;
                                        int[] iArr49 = new int[1];
                                        objArr[1] = iArr49;
                                        int[] iArr50 = new int[1];
                                        objArr[i10] = iArr50;
                                        iArr49[0] = i;
                                        iArr48[0] = i747;
                                        objArr[4] = arrayList;
                                        objArr[i757] = null;
                                        int i758 = -(-(((46254520 | i) * 104) + ((~(1204013502 | i24)) * (-104)) + ((((~((-1170393271) | i)) | 12634288) * 104) - 760670786)));
                                        int i759 = i758 << 13;
                                        int i760 = ((~i758) & i759) | ((~i759) & i758);
                                        int i761 = i760 >>> 17;
                                        int i762 = (i760 | i761) & (~(i760 & i761));
                                        int i763 = i762 << 5;
                                        c5 = 0;
                                        iArr50[0] = ((~i762) & i763) | ((~i763) & i762);
                                    } else {
                                        objArr = new Object[5];
                                        int[] iArr51 = new int[1];
                                        objArr[0] = iArr51;
                                        int[] iArr52 = new int[1];
                                        objArr[1] = iArr52;
                                        objArr[i10] = new int[1];
                                        iArr52[0] = i;
                                        iArr51[0] = i;
                                        objArr[4] = null;
                                        objArr[2] = null;
                                        int myUid = Process.myUid();
                                        int i764 = ~myUid;
                                        int i765 = (((~(myUid | 1177936826)) | 38710964) * 519) + (((~(i764 | (-4852741))) | (~(1182789566 | myUid))) * (-519)) + (((~((-38710965) | i764)) | 1177936826) * 519) + 1136637292;
                                        int i766 = (i765 << 1) - i765;
                                        int i767 = i766 << 13;
                                        int i768 = (i767 & (~i766)) | ((~i767) & i766);
                                        int i769 = i768 >>> 17;
                                        int i770 = (i768 | i769) & (~(i768 & i769));
                                        int i771 = i770 << 5;
                                        c5 = 0;
                                        ((int[]) objArr[i10])[0] = (i770 | i771) & (~(i770 & i771));
                                    }
                                    int i772 = ((int[]) objArr[c5])[c5];
                                    if (i772 != i) {
                                        Object[] objArr189 = new Object[5];
                                        int[] iArr53 = new int[1];
                                        objArr189[c5] = iArr53;
                                        int[] iArr54 = new int[1];
                                        objArr189[1] = iArr54;
                                        int[] iArr55 = new int[1];
                                        objArr189[i10] = iArr55;
                                        List list = (List) objArr[4];
                                        iArr54[c5] = i;
                                        iArr53[c5] = i772;
                                        objArr189[4] = list;
                                        objArr189[2] = null;
                                        int i773 = (((~(i | (-974302697))) | 168862848) * 116) + ((242345094 | i) * 116) + ((~(i24 | 1047784942)) * (-116)) + 1819424918;
                                        int i774 = (i3 - (~((i773 & 16) + (i773 | 16)))) - 1;
                                        int i775 = i774 << 13;
                                        int i776 = (i774 | i775) & (~(i774 & i775));
                                        int i777 = i776 >>> 17;
                                        int i778 = (i776 | i777) & (~(i776 & i777));
                                        int i779 = i778 << 5;
                                        iArr55[0] = ((~i778) & i779) | ((~i779) & i778);
                                        return objArr189;
                                    }
                                    int i3672 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                    int i3682 = (i3672 ^ 16) + ((i3672 & 16) << 1);
                                    int i3692 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
                                    Object[] objArr792 = new Object[1];
                                    b((char) ((i3692 & 51890) + (i3692 | 51890)), i3682, 697 - (~(-(ViewConfiguration.getKeyRepeatTimeout() >> 16))), objArr792);
                                    Object[] objArr802 = {(String) objArr792[0]};
                                    f2 = rV4669.f(i13);
                                    if (f2 == null) {
                                    }
                                    invoke = ((Method) f2).invoke(null, objArr802);
                                    if (invoke != null) {
                                    }
                                    if (i27 != 1986687685) {
                                    }
                                    i28 = 0;
                                    f3 = 0.0f;
                                    int i44622 = (TypedValue.complexToFraction(i28, f3, f3) > f3 ? 1 : (TypedValue.complexToFraction(i28, f3, f3) == f3 ? 0 : -1));
                                    int i44722 = ((i44622 | 13) << 1) - (i44622 ^ 13);
                                    char maximumFlingVelocity322 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                    int i44822 = -(-View.combineMeasuredStates(i28, i28));
                                    int i44922 = (i44822 & 1755) + (i44822 | 1755);
                                    Object[] objArr10822 = new Object[1];
                                    b(maximumFlingVelocity322, i44722, i44922, objArr10822);
                                    String str4922 = (String) objArr10822[i28];
                                    Object[] objArr10922 = new Object[1];
                                    b((char) TextUtils.getOffsetAfter(str12, i28), 6 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1767 - (~(-(KeyEvent.getMaxKeyCode() >> 16))), objArr10922);
                                    String[] strArr1022 = {str4922, (String) objArr10922[i28]};
                                    int packedPositionChild322 = ExpandableListView.getPackedPositionChild(0L);
                                    int i45022 = (packedPositionChild322 & 16) + (packedPositionChild322 | 16);
                                    char offsetAfter422 = (char) TextUtils.getOffsetAfter(str12, i28);
                                    int i45122 = -(-TextUtils.lastIndexOf(str12, '0', i28, i28));
                                    int i45222 = (i45122 ^ 1774) + ((i45122 & 1774) << 1);
                                    Object[] objArr11022 = new Object[1];
                                    b(offsetAfter422, i45022, i45222, objArr11022);
                                    String str5022 = (String) objArr11022[i28];
                                    int longPressTimeout422 = 19 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                    int i45322 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    int i45422 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                    int i45522 = (i45422 & 1788) + (i45422 | 1788);
                                    Object[] objArr11122 = new Object[1];
                                    b((char) (((i45322 | 1) << 1) - (i45322 ^ 1)), longPressTimeout422, i45522, objArr11122);
                                    String str5122 = (String) objArr11122[0];
                                    int scrollDefaultDelay422 = 14 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                    int i45622 = -Color.red(0);
                                    int i45722 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                    int i45822 = (i45722 ^ 1807) + ((i45722 & 1807) << 1);
                                    Object[] objArr11222 = new Object[1];
                                    b((char) ((i45622 & 36398) + (i45622 | 36398)), scrollDefaultDelay422, i45822, objArr11222);
                                    String[] strArr1122 = {str5022, str5122, (String) objArr11222[0]};
                                    int i45922 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                    int i46022 = ((i45922 | 21) << 1) - (i45922 ^ 21);
                                    char c1622 = (char) ((-2) - (~(-MotionEvent.axisFromString(str12))));
                                    int i46122 = -(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                    int i46222 = (i46122 & 1820) + (i46122 | 1820);
                                    Object[] objArr11322 = new Object[1];
                                    b(c1622, i46022, i46222, objArr11322);
                                    String str5222 = (String) objArr11322[0];
                                    int indexOf1122 = TextUtils.indexOf((CharSequence) str12, '0', 0);
                                    Object[] objArr11422 = new Object[1];
                                    b((char) View.resolveSize(0, 0), (indexOf1122 & 11) + (indexOf1122 | 11), 1841 - (~(ViewConfiguration.getTouchSlop() >> 8)), objArr11422);
                                    String[] strArr1222 = {str5222, (String) objArr11422[0]};
                                    int i46322 = 10 - (~(-ExpandableListView.getPackedPositionType(0L)));
                                    char c1722 = (char) (0 - (~((byte) KeyEvent.getModifierMetaStateMask())));
                                    int keyRepeatTimeout222 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                    int i46422 = (keyRepeatTimeout222 ^ 1852) + ((keyRepeatTimeout222 & 1852) << 1);
                                    Object[] objArr11522 = new Object[1];
                                    b(c1722, i46322, i46422, objArr11522);
                                    String str5322 = (String) objArr11522[0];
                                    int doubleTapTimeout322 = 6 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                    char minimumFlingVelocity322 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                    int threadPriority522 = Process.getThreadPriority(0);
                                    int i46522 = -(((threadPriority522 & 20) + (threadPriority522 | 20)) >> 6);
                                    int i46622 = ((i46522 | 589) << 1) - (i46522 ^ 589);
                                    Object[] objArr11622 = new Object[1];
                                    b(minimumFlingVelocity322, doubleTapTimeout322, i46622, objArr11622);
                                    String[] strArr1322 = {str5322, (String) objArr11622[0]};
                                    int i46722 = -(-TextUtils.indexOf((CharSequence) str12, '0'));
                                    Object[] objArr11722 = new Object[1];
                                    b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (i46722 & 29) + (i46722 | 29), 1863 - View.MeasureSpec.getSize(0), objArr11722);
                                    String str5422 = (String) objArr11722[0];
                                    int i46822 = 9 - (~(Process.myTid() >> 22));
                                    char scrollDefaultDelay522 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                    int i46922 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                    int i47022 = ((i46922 | 1841) << 1) - (i46922 ^ 1841);
                                    Object[] objArr11822 = new Object[1];
                                    b(scrollDefaultDelay522, i46822, i47022, objArr11822);
                                    strArr = new String[][]{strArr1022, strArr1122, strArr1222, strArr1322, new String[]{str5422, (String) objArr11822[0]}};
                                    int i47122 = i6;
                                    i29 = 0;
                                    loop5: while (true) {
                                        if (i29 >= 5) {
                                        }
                                        int i47622 = i29;
                                        i29 = (((i47622 | 71) << 1) - (i47622 ^ 71)) - 70;
                                        strArr = strArr;
                                    }
                                    if (i30 != i) {
                                    }
                                }
                            }
                            int i780 = -TextUtils.indexOf(str12, str12, 0, 0);
                            int a12 = com.fingerprintjs.android.fpjs_pro.r.a();
                            int i781 = i780 * (-963);
                            int i782 = (i781 & (-964)) + (i781 | (-964));
                            int i783 = (i782 & 12545) + (i782 | 12545);
                            int i784 = ~i780;
                            int i785 = ~(((-14) ^ a12) | ((-14) & a12));
                            int i786 = -(-(((i784 & i785) | (i784 ^ i785)) * (-964)));
                            int i787 = ~a12;
                            int i788 = ~((i787 & (-14)) | ((-14) ^ i787));
                            int i789 = ~((i780 & (-14)) | ((-14) ^ i780));
                            int i790 = (((i783 ^ i786) + ((i783 & i786) << 1)) - (~(-(-(((i789 & i788) | (i788 ^ i789)) * (-964)))))) - 1;
                            char c31 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int i791 = -MotionEvent.axisFromString(str12);
                            int i792 = (i791 ^ 594) + ((i791 & 594) << 1);
                            Object[] objArr190 = new Object[1];
                            b(c31, i790, i792, objArr190);
                            String str89 = (String) objArr190[0];
                            int indexOf18 = 9 - TextUtils.indexOf(str12, str12, 0);
                            char fadingEdgeLength3 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int i793 = -(-ExpandableListView.getPackedPositionType(0L));
                            int i794 = (i793 & 608) + (i793 | 608);
                            Object[] objArr191 = new Object[1];
                            b(fadingEdgeLength3, indexOf18, i794, objArr191);
                            String str90 = (String) objArr191[0];
                            File file4 = new File(str89);
                            if (file4.exists() && file4.isFile()) {
                                try {
                                    Scanner scanner4 = new Scanner(new FileInputStream(file4));
                                    int i795 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                    Object[] objArr192 = new Object[1];
                                    b((char) (22037 - (~(-View.resolveSizeAndState(0, 0, 0)))), ((i795 | 1) << 1) - (i795 ^ 1), 370 - Color.green(0), objArr192);
                                    Scanner useDelimiter4 = scanner4.useDelimiter((String) objArr192[0]);
                                    next = useDelimiter4.hasNext() ? useDelimiter4.next() : str12;
                                    useDelimiter4.close();
                                } catch (IOException unused5) {
                                }
                                if (next.contains(str90)) {
                                    int i796 = c;
                                    d = (((i796 | 29) << 1) - (i796 ^ 29)) % 128;
                                    i23 = (~(i & 261)) & (i | 261);
                                    i22 = 5;
                                    i21 = 1;
                                    if (i23 != i) {
                                    }
                                }
                            }
                            int i797 = d;
                            i21 = 1;
                            i22 = 5;
                            c = (((i797 | 5) << 1) - (i797 ^ 5)) % 128;
                            i23 = i;
                            if (i23 != i) {
                            }
                        }
                    }
                    i19 = i;
                    if (i19 == i) {
                    }
                }
            }
            i18 = i;
            if (i18 == i) {
            }
        }

        public static String a(int i, byte b2, short s) {
            int i2 = s * 2;
            int i3 = b2 + 115;
            int i4 = 4 - (i * 4);
            byte[] bArr = new byte[i2 + 1];
            byte[] bArr2 = g;
            int i5 = -1;
            if (bArr2 == null) {
                i4++;
                i3 = i2 + i4;
            }
            while (true) {
                i5++;
                bArr[i5] = (byte) i3;
                if (i5 == i2) {
                    return new String(bArr, 0);
                }
                byte b3 = bArr2[i4];
                i4++;
                i3 += b3;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0178  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0179  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void b(char c2, int i, int i2, Object[] objArr) {
            byte[] bArr;
            Throwable cause;
            char c3;
            cm cmVar = new cm();
            long[] jArr = new long[i];
            cmVar.component5 = 0;
            while (true) {
                int i3 = cmVar.component5;
                bArr = g;
                if (i3 >= i) {
                    break;
                }
                try {
                    Object[] objArr2 = {Integer.valueOf(a[i2 + i3])};
                    Object f2 = rV4669.f(1480709268);
                    Class cls = Integer.TYPE;
                    if (f2 == null) {
                        f2 = rV4669.g(6045 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Color.green(0) + 52, -773518864, a(0, (byte) 0, (short) 0), new Class[]{cls});
                    }
                    Long l = (Long) ((Method) f2).invoke(null, objArr2);
                    l.getClass();
                    Object[] objArr3 = {l, Long.valueOf(i3), Long.valueOf(b), Integer.valueOf(c2)};
                    Object f3 = rV4669.f(-1745711337);
                    if (f3 == null) {
                        int i4 = 3109 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        char resolveSizeAndState = (char) (11542 - View.resolveSizeAndState(0, 0, 0));
                        int normalizeMetaState = 52 - KeyEvent.normalizeMetaState(0);
                        byte b2 = (byte) (h & 15);
                        byte b3 = (byte) (b2 - 2);
                        c3 = 1;
                        String a2 = a(b3, b2, b3);
                        Class cls2 = Long.TYPE;
                        f3 = rV4669.g(i4, resolveSizeAndState, normalizeMetaState, 508973683, a2, new Class[]{cls2, cls2, cls2, cls});
                    } else {
                        c3 = 1;
                    }
                    jArr[i3] = ((Long) ((Method) f3).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = new Object[2];
                    objArr4[c3] = cmVar;
                    objArr4[0] = cmVar;
                    Object f4 = rV4669.f(2020003388);
                    if (f4 == null) {
                        byte b4 = (byte) (bArr[2] - 1);
                        byte b5 = (byte) (b4 - 3);
                        f4 = rV4669.g(TextUtils.getCapsMode("", 0, 0) + 4736, (char) (10124 - (ViewConfiguration.getEdgeSlop() >> 16)), View.getDefaultSize(0, 0) + 52, -238939304, a(b5, b4, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) f4).invoke(null, objArr4);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause == null) {
                    }
                }
                cause = th.getCause();
                if (cause == null) {
                    throw cause;
                }
                throw th;
            }
            char[] cArr = new char[i];
            cmVar.component5 = 0;
            while (true) {
                int i5 = cmVar.component5;
                if (i5 < i) {
                    cArr[i5] = (char) jArr[i5];
                    Object[] objArr5 = {cmVar, cmVar};
                    Object f5 = rV4669.f(2020003388);
                    if (f5 == null) {
                        byte b6 = (byte) (bArr[2] - 1);
                        byte b7 = (byte) (b6 - 3);
                        f5 = rV4669.g(Gravity.getAbsoluteGravity(0, 0) + 4736, (char) (Color.rgb(0, 0, 0) + 16787340), 52 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -238939304, a(b7, b6, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) f5).invoke(null, objArr5);
                } else {
                    objArr[0] = new String(cArr);
                    return;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void c(byte b2, short s, short s2, Object[] objArr) {
            int i;
            int i2;
            int i3 = b2 + 97;
            int i4 = (s * 3) + 1;
            int i5 = 6 - (s2 * 3);
            byte[] bArr = new byte[i4];
            byte[] bArr2 = e;
            if (bArr2 == null) {
                int i6 = i3;
                i3 = i4;
                i2 = 0;
                i3 = i3 + i6 + 6;
                i = i2;
                i2 = i + 1;
                bArr[i] = (byte) i3;
                i5++;
                if (i2 == i4) {
                    objArr[0] = new String(bArr, 0);
                    return;
                }
                i6 = bArr2[i5];
                i3 = i3 + i6 + 6;
                i = i2;
                i2 = i + 1;
                bArr[i] = (byte) i3;
                i5++;
                if (i2 == i4) {
                }
            } else {
                i = 0;
                i2 = i + 1;
                bArr[i] = (byte) i3;
                i5++;
                if (i2 == i4) {
                }
            }
        }

        public static void d() {
            e = new byte[]{15, -70, 87, 62, 6, -5, 3};
            f = 99;
        }

        public static void e() {
            g = new byte[]{26, 99, 4, 119};
            h = 146;
        }
    }

    static {
        d();
        f = 1;
        d = 0;
        e = 1;
        b();
        INSTANCE = new Companion(null);
    }

    private static void D8871(long j, long j2) {
        long j3;
        int i = e;
        int i2 = i + 121;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            j3 = j + (j2 >>> 24);
        } else {
            j3 = j ^ (j2 << 32);
        }
        d = (i + 117) % 128;
        try {
            Object[] objArr = {Long.valueOf(j3)};
            Object[] objArr2 = new Object[1];
            c((char) (ExpandableListView.getPackedPositionGroup(0L) + 10477), (ViewConfiguration.getEdgeSlop() >> 16) + 7, Color.argb(0, 0, 0, 0), objArr2);
            Method method = Long.class.getMethod((String) objArr2[0], Long.TYPE);
            method.setAccessible(true);
            Object invoke = method.invoke(null, objArr);
            Object obj = ah.class.getField("INSTANCE").get(null);
            Method method2 = ah.class.getMethod("component5", null);
            method2.setAccessible(true);
            Object invoke2 = method2.invoke(obj, null);
            Object[] objArr3 = new Object[1];
            c((char) View.MeasureSpec.getMode(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2, 13 - Color.red(0), objArr3);
            Object[] objArr4 = {(String) objArr3[0], invoke};
            Object[] objArr5 = new Object[1];
            c((char) (37041 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 3 - (Process.myPid() >> 22), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 9, objArr5);
            Method method3 = Map.class.getMethod((String) objArr5[0], Object.class, Object.class);
            method3.setAccessible(true);
            method3.invoke(invoke2, objArr4);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static void N14263A23323(long j, long j2) {
        long j3 = j ^ (j2 << 32);
        d = (e + 19) % 128;
        try {
            Object[] objArr = {Long.valueOf(j3)};
            Object[] objArr2 = new Object[1];
            c((char) (10477 - ExpandableListView.getPackedPositionType(0L)), ((byte) KeyEvent.getModifierMetaStateMask()) + 8, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            Method method = Long.class.getMethod((String) objArr2[0], Long.TYPE);
            method.setAccessible(true);
            Object invoke = method.invoke(null, objArr);
            Object obj = ah.class.getField("INSTANCE").get(null);
            Method method2 = ah.class.getMethod("component5", null);
            method2.setAccessible(true);
            Object invoke2 = method2.invoke(obj, null);
            Object[] objArr3 = new Object[1];
            c((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3, ImageFormat.getBitsPerPixel(0) + 29, objArr3);
            Object[] objArr4 = {(String) objArr3[0], invoke};
            Object[] objArr5 = new Object[1];
            c((char) (TextUtils.getOffsetBefore("", 0) + 37040), TextUtils.indexOf("", "", 0, 0) + 3, 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr5);
            Method method3 = Map.class.getMethod((String) objArr5[0], Object.class, Object.class);
            method3.setAccessible(true);
            method3.invoke(invoke2, objArr4);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static String a(short s) {
        int i = s + 115;
        byte[] bArr = new byte[1];
        if (g == null) {
            i = 3;
        }
        bArr[0] = (byte) i;
        return new String(bArr, 0);
    }

    public static void b() {
        b = new char[]{3440, 29723, 65426, 24839, 59539, 21029, 54664, 9690, 23715, 55079, 46379, 52306, 18391, 9689, 23716, 55076, 60749, 37940, 8125, 9689, 23715, 55082, 9690, 23718, 55077, 58309, 39615, 4405, 9690, 23712, 55074};
        c = 5026670906882219159L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0210, code lost:
    
        r4[r7] = (char) r2[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0216, code lost:
    
        r0 = new java.lang.Object[]{r1, r1};
        r1 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.f(2020003388);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0220, code lost:
    
        if (r1 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0222, code lost:
    
        r1 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.g(android.view.View.resolveSize(0, 0) + 4736, (char) (10125 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1))), (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 51, -238939304, a(3), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0248, code lost:
    
        ((java.lang.reflect.Method) r1).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x024e, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(char c2, int i, int i2, Object[] objArr) {
        int i3;
        float f2;
        Throwable cause;
        short s;
        float f3;
        cm cmVar = new cm();
        long[] jArr = new long[i];
        cmVar.component5 = 0;
        while (true) {
            int i4 = cmVar.component5;
            i3 = f;
            if (i4 >= i) {
                break;
            }
            int i5 = (i3 + 111) % 2;
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            if (i5 != 0) {
                try {
                    Object[] objArr2 = {Integer.valueOf(b[i2 - i4])};
                    Object f4 = rV4669.f(1480709268);
                    if (f4 == null) {
                        s = 3;
                        f3 = 0.0f;
                        f4 = rV4669.g(Process.getGidForName("") + 6047, (char) TextUtils.getCapsMode("", 0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 51, -773518864, a((short) 0), new Class[]{cls2});
                    } else {
                        s = 3;
                        f3 = 0.0f;
                    }
                    Long l = (Long) ((Method) f4).invoke(null, objArr2);
                    l.getClass();
                    long j = i4;
                    long j2 = c;
                    Object[] objArr3 = new Object[4];
                    objArr3[s] = Integer.valueOf(c2);
                    objArr3[2] = Long.valueOf(j2);
                    objArr3[1] = Long.valueOf(j);
                    objArr3[0] = l;
                    Object f5 = rV4669.f(-1745711337);
                    if (f5 == null) {
                        f5 = rV4669.g((AudioTrack.getMaxVolume() > f3 ? 1 : (AudioTrack.getMaxVolume() == f3 ? 0 : -1)) + 3108, (char) (11541 - TextUtils.lastIndexOf("", '0')), 51 - TextUtils.indexOf((CharSequence) "", '0', 0), 508973683, a((short) 2), new Class[]{cls, cls, cls, cls2});
                    }
                    jArr[i4] = ((Long) ((Method) f5).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {cmVar, cmVar};
                    Object f6 = rV4669.f(2020003388);
                    if (f6 == null) {
                        f6 = rV4669.g(4735 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (10124 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 52 - (ViewConfiguration.getTapTimeout() >> 16), -238939304, a(s), new Class[]{Object.class, Object.class});
                    }
                    ((Method) f6).invoke(null, objArr4);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause == null) {
                    }
                }
            } else {
                Object[] objArr5 = {Integer.valueOf(b[i2 + i4])};
                Object f7 = rV4669.f(1480709268);
                if (f7 == null) {
                    f7 = rV4669.g(6046 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 53 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -773518864, a((short) 0), new Class[]{cls2});
                }
                Long l2 = (Long) ((Method) f7).invoke(null, objArr5);
                l2.getClass();
                Object[] objArr6 = {l2, Long.valueOf(i4), Long.valueOf(c), Integer.valueOf(c2)};
                Object f8 = rV4669.f(-1745711337);
                if (f8 == null) {
                    f8 = rV4669.g((ViewConfiguration.getKeyRepeatDelay() >> 16) + 3109, (char) (Color.green(0) + 11542), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 51, 508973683, a((short) 2), new Class[]{cls, cls, cls, cls2});
                }
                jArr[i4] = ((Long) ((Method) f8).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {cmVar, cmVar};
                Object f9 = rV4669.f(2020003388);
                if (f9 == null) {
                    f9 = rV4669.g(TextUtils.lastIndexOf("", '0', 0) + 4737, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 10124), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 51, -238939304, a((short) 3), new Class[]{Object.class, Object.class});
                }
                ((Method) f9).invoke(null, objArr7);
            }
            cause = th.getCause();
            if (cause == null) {
                throw cause;
            }
            throw th;
        }
        float f10 = 0.0f;
        char[] cArr = new char[i];
        cmVar.component5 = 0;
        while (true) {
            int i6 = cmVar.component5;
            if (i6 < i) {
                if ((i3 + 37) % 2 != 0) {
                    break;
                }
                cArr[i6] = (char) jArr[i6];
                Object[] objArr8 = {cmVar, cmVar};
                Object f11 = rV4669.f(2020003388);
                if (f11 == null) {
                    f2 = f10;
                    f11 = rV4669.g(MotionEvent.axisFromString("") + 4737, (char) (10124 - (PointF.length(f2, f2) > f2 ? 1 : (PointF.length(f2, f2) == f2 ? 0 : -1))), 52 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -238939304, a((short) 3), new Class[]{Object.class, Object.class});
                } else {
                    f2 = f10;
                }
                ((Method) f11).invoke(null, objArr8);
                f10 = f2;
            } else {
                objArr[0] = new String(cArr);
                return;
            }
        }
    }

    private static void component5(long j, long j2) {
        long j3 = j ^ (j2 << 32);
        int i = (e + 107) % 128;
        d = i;
        e = (i + 3) % 128;
        try {
            Object[] objArr = {Long.valueOf(j3)};
            Object[] objArr2 = new Object[1];
            c((char) (10478 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 8 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), ViewConfiguration.getLongPressTimeout() >> 16, objArr2);
            Method method = Long.class.getMethod((String) objArr2[0], Long.TYPE);
            method.setAccessible(true);
            Object invoke = method.invoke(null, objArr);
            Object obj = ah.class.getField("INSTANCE").get(null);
            Method method2 = ah.class.getMethod("component5", null);
            method2.setAccessible(true);
            Object invoke2 = method2.invoke(obj, null);
            Object[] objArr3 = new Object[1];
            c((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getFadingEdgeLength() >> 16) + 3, 7 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr3);
            Object[] objArr4 = {(String) objArr3[0], invoke};
            Object[] objArr5 = new Object[1];
            c((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 37040), 3 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 9 - Process.getGidForName(""), objArr5);
            Method method3 = Map.class.getMethod((String) objArr5[0], Object.class, Object.class);
            method3.setAccessible(true);
            method3.invoke(invoke2, objArr4);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static void component9(long j, long j2) {
        long j3 = j ^ (j2 << 32);
        int i = (d + 77) % 128;
        e = i;
        d = (i + 95) % 128;
        try {
            Object[] objArr = {Long.valueOf(j3)};
            Object[] objArr2 = new Object[1];
            c((char) (10477 - View.getDefaultSize(0, 0)), 7 - TextUtils.getTrimmedLength(""), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, objArr2);
            Method method = Long.class.getMethod((String) objArr2[0], Long.TYPE);
            method.setAccessible(true);
            Object invoke = method.invoke(null, objArr);
            Object obj = ah.class.getField("INSTANCE").get(null);
            Method method2 = ah.class.getMethod("component5", null);
            method2.setAccessible(true);
            Object invoke2 = method2.invoke(obj, null);
            Object[] objArr3 = new Object[1];
            c((char) View.MeasureSpec.getSize(0), Gravity.getAbsoluteGravity(0, 0) + 3, TextUtils.lastIndexOf("", '0', 0) + 23, objArr3);
            Object[] objArr4 = {(String) objArr3[0], invoke};
            Object[] objArr5 = new Object[1];
            c((char) (KeyEvent.normalizeMetaState(0) + 37040), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3, 10 - (ViewConfiguration.getTouchSlop() >> 8), objArr5);
            Method method3 = Map.class.getMethod((String) objArr5[0], Object.class, Object.class);
            method3.setAccessible(true);
            method3.invoke(invoke2, objArr4);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void d() {
        g = new byte[]{30, -87, MessagePack.Code.BIN8, -80};
    }

    private static void setPivotYN16904(long j, long j2) {
        long j3 = j ^ (j2 << 32);
        int i = (e + 55) % 128;
        d = i;
        e = (i + 101) % 128;
        try {
            Object[] objArr = {Long.valueOf(j3)};
            Object[] objArr2 = new Object[1];
            c((char) (10477 - (ViewConfiguration.getScrollBarSize() >> 8)), 8 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Color.argb(0, 0, 0, 0), objArr2);
            Method method = Long.class.getMethod((String) objArr2[0], Long.TYPE);
            method.setAccessible(true);
            Object invoke = method.invoke(null, objArr);
            Object obj = ah.class.getField("INSTANCE").get(null);
            Method method2 = ah.class.getMethod("component5", null);
            method2.setAccessible(true);
            Object invoke2 = method2.invoke(obj, null);
            Object[] objArr3 = new Object[1];
            c((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 3 - TextUtils.indexOf("", "", 0), 19 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr3);
            Object[] objArr4 = {(String) objArr3[0], invoke};
            Object[] objArr5 = new Object[1];
            c((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 37041), 3 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 10, objArr5);
            Method method3 = Map.class.getMethod((String) objArr5[0], Object.class, Object.class);
            method3.setAccessible(true);
            method3.invoke(invoke2, objArr4);
            d = (e + 81) % 128;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static void setTopP6481(long j, long j2) {
        long j3 = j ^ (j2 << 32);
        d = (e + 73) % 128;
        try {
            Object[] objArr = {Long.valueOf(j3)};
            Object[] objArr2 = new Object[1];
            c((char) (10477 - ExpandableListView.getPackedPositionType(0L)), 8 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 1, objArr2);
            Method method = Long.class.getMethod((String) objArr2[0], Long.TYPE);
            method.setAccessible(true);
            Object invoke = method.invoke(null, objArr);
            Object obj = ah.class.getField("INSTANCE").get(null);
            Method method2 = ah.class.getMethod("component5", null);
            method2.setAccessible(true);
            Object invoke2 = method2.invoke(obj, null);
            Object[] objArr3 = new Object[1];
            c((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 50720), TextUtils.lastIndexOf("", '0', 0) + 4, ExpandableListView.getPackedPositionGroup(0L) + 25, objArr3);
            Object[] objArr4 = {(String) objArr3[0], invoke};
            Object[] objArr5 = new Object[1];
            c((char) (ExpandableListView.getPackedPositionGroup(0L) + 37040), (ViewConfiguration.getPressedStateDuration() >> 16) + 3, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10, objArr5);
            Method method3 = Map.class.getMethod((String) objArr5[0], Object.class, Object.class);
            method3.setAccessible(true);
            method3.invoke(invoke2, objArr4);
            int i = e + 69;
            d = i % 128;
            if (i % 2 == 0) {
            } else {
                throw null;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static void vD14832N6715(long j, long j2) {
        long j3;
        int i = e;
        int i2 = i + 49;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            j3 = j * (j2 << 110);
        } else {
            j3 = j ^ (j2 << 32);
        }
        d = (i + 31) % 128;
        try {
            Object[] objArr = {Long.valueOf(j3)};
            Object[] objArr2 = new Object[1];
            c((char) (Color.argb(0, 0, 0, 0) + 10477), 7 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
            Method method = Long.class.getMethod((String) objArr2[0], Long.TYPE);
            method.setAccessible(true);
            Object invoke = method.invoke(null, objArr);
            Object obj = ah.class.getField("INSTANCE").get(null);
            Method method2 = ah.class.getMethod("component5", null);
            method2.setAccessible(true);
            Object invoke2 = method2.invoke(obj, null);
            Object[] objArr3 = new Object[1];
            c((char) (51351 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), TextUtils.getCapsMode("", 0, 0) + 3, 16 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr3);
            Object[] objArr4 = {(String) objArr3[0], invoke};
            Object[] objArr5 = new Object[1];
            c((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 37040), KeyEvent.keyCodeFromString("") + 3, View.combineMeasuredStates(0, 0) + 10, objArr5);
            Method method3 = Map.class.getMethod((String) objArr5[0], Object.class, Object.class);
            method3.setAccessible(true);
            method3.invoke(invoke2, objArr4);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
