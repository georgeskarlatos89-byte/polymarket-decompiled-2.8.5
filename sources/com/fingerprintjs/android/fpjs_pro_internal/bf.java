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
import defpackage.dmk;
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
import java.util.Random;
import java.util.Scanner;
import kotlin.Result;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bf {
    public static final char[] a;
    public static final long b;
    public static int c;
    public static int d;
    public static final byte[] e = null;
    public static int f;
    public static int g;
    public static final byte[] h = null;

    static {
        e();
        f = 0;
        g = 1;
        d();
        c = 0;
        d = 1;
        char[] cArr = new char[1959];
        ByteBuffer.wrap("7V+\u008a\u000e2bÊE\n¹í\u009c\u009cÿ4Ó¥6P*ö\rw`\u0005D\u008d§Z\u009bÄþmÑ\f5\u0082(?\fÆoECð¦\u0098\u00990ý¥ÐJÐ$Ìøé@\u0085¸¢x^\u009f{î\u0018F4×Ñ\"Í\u0084ê\u0005\u0087w£ÿ@9|»\u0019\u000b6iÒÊÏZë·\u0088\u001a¤\u0092Aî~GG\u000b[×~o\u0012\u00975WÉ°ìÁ\u008fi£øF\rZ«}*\u0010X4Ð×\u0015ë\u0084\u008e:¡@\"j>¡\u001b\u0012wóP6¬Û\u0089 ê\u0000Æ\u0088#f?Æ\u0018\u0017u6Q\u0081²k\u008eøëSÄ+ ¨=\u0018\u0019ÖzDVÞ³ \u008c\u0019è\u009fÅa!Ñ%Ä9\u0019\u001c±pMW\u0098«|\u008e\u0006íäÁ#$Ö8b\u001fæ¹\u0006¥Û\u0080sì\u008fËZ7©\u0012Êqe]¿¸\u0016¤½\u0083;îM%Ä9\u000f\u001c¡pMWÖ«j\u008e\u0005íåÁ\u0001$â8@\u001fùr\u0089V%µí\u0089SìïÃ\u008d)=5á\u0010]|£[/§Î\u0082¶áPÍÚ((4\u009d\u0013\u0001~`ZÖ%\u00999\u0013\u001cëpLWØ«w\u008e\u0015íäÁ!$Á8i\u001fär\u0090V)µÍ\u0089mìõÃ\u0089'\u0001:\u0081\u001eC}æQb´K%\u00999\u0013\u001cëpLWØ«w\u008e\u0015íäÁ!$Á8i\u001fär\u0090V)µÍ\u0089mìõÃ\u0089'\u0001:\u0081\u001eC}æQb´H,\u00850N\u0015ýy\u001c^\u0082¢<\u0087Mä¤È~-\u008c1.\u0016ø{Ò_h¼\u008a\u0080\u001då¸Ê\u0083.G3ð\u0089\u008d\u0095\u0011°¦ÜDûÜ\u0007d%Ä9\u000f\u001c¼p]WÃ«}\u008e\fíåÁ1$Í8c\u001f¹r\u0091V%µÄ\u0089GìÍÃ¡'X:°\u001eB}åQd´W\u008b ï;ÂÓ&r\u0005\u001d\u0018\u009f|5%Ä9\u000f\u001c¼p]WÃ«}\u008e\fíåÁ1$Í8c\u001f¹r\u0091V%µÄ\u0089GìÍÃ¡'X:®\u001eU}çQa%Ä9\u000f\u001c¼p]WÃ«}\u008e\fíåÁ?$Í8o\u001f¹r\u0093V)µË\u0089\\ìþÃ\u0081'\u0000:\u0088\u001ej}øQc´\u0015\u008b³ïzÂÎ&i%Ä9\u0018\u001c pXW\u0098«v\u008e\u0004í§Á&$Ã8x\u001fór\u008cV4\b\u0012\u0014\u00981`]ÇzI\u0086ú£\u0086À%ìö\tG\u0015é2n_\u0000%\u00859\u0019\u001c¤p]WÒ«6\u008e\u000fí¯Á'\u0099#\u0085ë PÌ¦ë3\u0017Ð2àQD}Ø\u0098&\u0084\u0099£\bÎkêÓ\t+5¸P\u000f%\u00859\u0019\u001c¨p[WÄ«~%·9=%\u00999\u0013\u001cëp^WÅ«w\u008e\u0005í¿Á0$Ð8#\u001fûr\u009eV.µÜ\u0089TìúÃ\u008f'\u0001:«\u001eU}íQc§ª»?\u009e\u008dòq%\u009b9\u0019\u001c·p]WÞ«k\u008e\u0015íäÁ $Ý8~\u001f¸r\u009dV$µ\u0087\u0089VìþÃ\u008e'\u0000:¹\u001e\t}ïQa´\u000f\u008bíï2ÂÜ&m\u0005\n\u0018¯|>SÒ·~\u008aÃé\u0097Í+ ¹\u0004\\\u001bä~\u0098R\u0016±¶ \u0011¼\u0093\u0099=õ×ÒT.á\u000b\u009fhnDª¡W½ô\u009a2÷\u0017Ó®0\r\fÜitF\u0004¢\u008a¿3\u009b\u0083øeÔë1\u0085\u000egj¸GV£ç\u0080\u0080\u009d%ù´ÖX2ô\u000fIl\u0019H¡¥3\u0081Ö\u009edû\u0012\u0091é\u008dk¨ÅÄ/ã¬\u001f\u0019:gY\u0096uR\u0090¯\u008c\f«ÊÆïâV\u0001õ=$X\u008cwü\u0093r\u008eËª{É\u0088å\f\u0000&?Ò[Wv¦%\u009b9\u0019\u001c·p]WÞ«k\u008e\u0015íäÁ $Ý8~\u001f¸r\u009dV$µ\u0087\u0089VìþÃ\u008e'\u0000:¹\u001e\t}úQ~´T\u008b¯ï5ÂÞ%\u009b9\u0019\u001c·p]WÞ«k\u008e\u0015íäÁ $Ý8~\u001f¸r\u009dV$µ\u0087\u0089VìþÃ\u008e'\u0000:¹\u001e\t}úQ~´T\u008b®ï7ÂÞê°ö2Ó\u009c¿v\u0098õd@A>\"Ï\u000e\u000bëö÷UÐ\u0093½¶\u0099\u000fz¬F}#Õ\f¥è+õ\u0092Ñ\"²Ñ\u009eU{\u007fD\u0085 \u0011\rõ%\u009d9\u001e\u001cªpVWÄ«~%Ä9\f\u001c·pAWÔ«7\u008e\fí¥Á7$Ñ8a\u001fór\u008cûMçÎÂz®\u0086\u0089\u0000u½PÔ3i\u001f÷\u0016s\nÆ/tC\u0088d\u0005\u0098¨½ÊÞ|òã\u0017\u0015%\u009e9\u0012\u001c®p@WØ«o\u008e\u000f%\u00889\u0014\u001c·pAWÚ«q\u008e\u0014í§%\u00999\u0013\u001cëp^WÅ«w\u008e\u0005í¿Á0$Ð8#\u001fòr\u009aV6µÀ\u0089Qìþ%\u009d9\u001e\u001cªpVW\u008f«.\u008e\u0011Æ7Ú¢ÿ\u0010\u0093ð´~HÊm¹^\u0017B\u0082g0\u000bÐ,^Ðêõ\u0099\u0096\u000eº°_\u0007C %\u008c9\u0019\u001c«pKWÅ«q\u008e\u0002í\u0095Á+$\u009c8;\u001fÉrÉVt%\u00999\u0013\u001cëp^WÅ«w\u008e\u0005í¿Á0$Ð8#\u001fûr\u0090V$µÌ\u0089^ÙRÅÒàd%\u008e9\u0011\u001c°pBWÖ«l\u008e\u000eí¸¿G£á\u0086XêãÍ\b1\u0080\u0014âwS[×¾$¢\u0085\u0085[ètÌÂ/6\u0013ÿv5Yi½ê \\\u0084§ç\u0000%ª9\u0012\u001c¡p\\WØ«q\u008e\u0005íêÁ\u0000$à8F\u001f¶r\u009dV5µÀ\u0089^ìïÃÌ'\u0013:±\u001eU}¨Qi´B\u008bõ#Û?c\u001aÐv-Q©\u00ad\u0000\u0088të\u009bÇq\"\u0091>7\u0019ÇtìPD³±\u008f/ê\u009eÅ½!b<À\u0018${ÙW\u0018²3\u008d\u0084ézÄú C%\u00999\u0013\u001cëpFWÖ«j\u008e\u0005í½Á2$Ö8hÜ\u0083À\u001cå¦\u0089E®ÞR~w\u001d\u0014\u00ad%\u009d9\u001e\u001cªpVW\u008f«.%\u00999\u001d\u001c«pMWß«m%\u00999\u0013\u001cëp^WÅ«w\u008e\u0005í¿Á0$Ð8#\u001fôr\u008dV!µÇ\u0089V%\u00999\u0013\u001cëpEWÒ«j\u008e\u000fí¯Á?$\u008a8|\u001fór\u0092V5tm%\u00999\u0013\u001cëp]WÒ«{\u008e\u0014í¸Á6%Û%\u00999\u0013\u001cëpLWÂ«q\u008e\rí®Á}$Ô8\u007f\u001fùr\u009bV5µÊ\u0089Fk\rw\u0089R)>Â\u0019håàÀÙ£|%\u00999\u0013\u001cëpLWÂ«q\u008e\rí®Á}$Â8d\u001før\u0098V%µÛ\u0089BìéÃ\u0085'\u001b:ª9A%Ô\u0000fl\u0086K\b·¼\u0092Ïñ(Ýí8\r$«\u0003tnUJè©\n\u0095\u009að$ßH;ÛÅåÙpüÂ\u0090\"·¬K\u0018nk\rü!BÄõØRÿÐ\u0092å¶MU«i\u0004\f\u008a#½Ç*Ú\u0098þ)\u009d\u0084±\u0016TvkØ\u000fT\"·Æ0å~ø¡\u009c\u0006%\u008c9\u0019\u001c«pKWÅ«q\u008e\u0002íåÁ4$Ë8b\u001fñr\u0093V%µö\u0089AìÿÃ\u0087'Z:¹\u001eB}æQt´\b\u008bªï7(æ4s\u0011Á}!Z¯¦\u001b\u0083hà\u008fÌO)¬5\b\u0012\u0084\u007f\u00ad[\u001c¸³\u0084wá\u0087Îä*p7Ì\u0013upÔ\\\u000b%\u008c9\u0013\u001cªpIWÛ«}\u008eNí¹Á7$Ï8R\u001fñr\u008fV(µÆ\u0089\\ìþÃ³'\r:æ\u001e\u0011}§Qv´\u001f\u008b\u00adï1ÂÏ&o\u0005\f\u0018¯|!S\u009a·=i\u001au\u0090Ph<Ï\u001b[çôÂ\u0096¡%\u008d¿hFtêSp>\u000e%\u00999\u0013\u001cëpLWØ«w\u008e\u0015í£Á>$Å8j\u001fórÑV\"µÜ\u0089[ì÷Ã\u0088'[:¸\u001eN}æQv´\u001f\u008b±ï$ÂÏ&o\u0005\u0001\u0018\u0084\\\u001a@¢e\u0011\tì.hÒÁ÷µ\u0094W¸\u009b],A\u008b%\u00999\u0013\u001cëpLWÂ«q\u008e\rí®Á}$À8d\u001får\u008fV,µÈ\u0089KìµÃ\u0085'\u0011¥\u008c¹\n\u009c¥ðI×\u0089%\u00829\u0012\u001c¬pZW\u0099«k\u008e\u0017í©Á}$Õ8h\u001fûr\u008aVmµÙ\u0089@ìôÃ\u009c'\u0006\u0012T\u000e×+fG\u0095`W\u009c¾¹ØÚ*öð\u0013\u000b\u000fª(6EZaë\u0082\u001e¾\u008f%\u009a9\u0019\u001c¨p[W\u0099«k\u008e\u0007íäÁ5$Å8f\u001fór V#µÈ\u0089_ìþÃ\u009e'\u0014%\u009a9\u0019\u001c¨p[W\u0099«k\u008e\u0007íäÁ?$Ç8i\u001fÉr\u009bV%µÇ\u0089AìòÃ\u0098'\f%\u00999\u0013\u001cëpEWÒ«j\u008e\u000fí¯Á?$\u008a8l\u001før\u009bV2µÆ\u0089[ìÿÃÂ'\u0004:»\u001eJ}ýQu%\u00999\u0013\u001cëpLWØ«w\u008e\u0015íäÁ\"$Á8`\u001fãrÑV!µß\u0089VìÄÃ\u0082'\u0014:³\u001eB%\u00999\u0013\u001cëpAWÓ«u\u008eOí¨Á&$Í8a\u001fòrÑV&µÀ\u0089\\ìüÃ\u0089'\u0007:®\u001eU}áQ\u007f´\u000e\u0013B\u000fÈ*0F\u0085a\u001e\u009d¬¸ÞÛd÷ë\u0012\u000b\u000eø)/DQ`ò\u0083\u001e¿\u008dÚnõQ\u0011Ç\fk(\u009bK6g¸\u0082Ñ½jÙæô\b\u0010©ÅâÙhü\u0090\u0090&·µK\u0010nn\rÔ!EÄñØ\u0014ÿ\u0098\u0092í¶WU¶ig\f\u0086#þÇ`ÚÂþ9\u009d\u0081±\u001aTskÑ\u000fA\"²%\u00999\u0013\u001cëp]WÎ«k\u008e\u0015í¯Á>$û8h\u001fîr\u008bVnµË\u0089GìòÃ\u0080'\u0011:ð\u001eA}áQ\u007f´\u001d\u008b¦ï&ÂÍ&t\u0005\u0006\u0018\u009e|-mVqÜT$8\u0097\u001f\u001dã¹ÆÊ¥j\u0089îlEp W,:Y\u001eãý\u0002ÁÓ¤2\u008bJoÔrvV\u008d55\u0019®üÇÃe§õ\u008a\u0006\u0098Y\u0084Ó¡+Í\u0098ê\u0012\u0016¶3ÅPe|á\u0099;\u0085©¢:ÏTëí\bG4\u0090Q.~E\u009aÙ\u0087z£ÉÀ.ì¸\tÔ6dRñ\u007f\u000f\u009b¶¸Ý¥YÁ÷î\u0016\u0088v%Ä9\u0018\u001c pXW\u0098«i\u008e\u0004í§Á&$û8}\u001fÿr\u008fV%zrf®C\u0016/î\b.ôÝÑ¸²\u001f\u009e\u008e{wgÏ@\u000f-+\t\u0097êlÖá³O\u009c;x\u00ade\fAÎ\"Y\u000eÂë¢Ô\f°\u0086_\bCÔfl\n\u0094-TÑ§ôÂ\u0097e»ô^\rBµeu\bT,éÏ\u000bó\u0087\u00963|ú`&E\u009e)f\u000e¦òU×0´\u0097\u0098\u0006}ÿaGF\u0087+°\u000f\u001bìúÐyµÁg\u000e{Å^v2\u0097\u0015Ré£ÌÎ¯m\u0083ìf1z³].0T\u0014é÷\u0006%Ä9\u000f\u001c¼p]WÃ«}\u008e\fíåÁ?$Í8o\u001f¹r\u0093V)µË\u0089QìÄÃ\u0081'\u0014:²\u001eK}çQr´%\u008b§ï1Âß&s\u0005\b\u0018¯|(SÇ·f\u008aééËÍ= ¸t\u0093hOM÷!\u000f\u0006Ïú-ßE¼é\u0090[u\u0094i*N²%Ä9\u0018\u001c pXW\u0098«z\u008e\u0012í¾Á\f$Ð8d\u001fûr\u009a%Ä9\u0018\u001c pXW\u0098«k\u008e\u000eí©Á8$Á8y\u001f¹r\u009dV3µÝ\u0089TìôÃ\u0080'\u0011:»\u001eU}ìA\u0012]Ùxj\u0014\u008b3\u0015Ï«êÚ\u00893¥é@\u001b\\¹{o\u0016E2ÿÑ\u001dí\u0086\u0088>§NCÅ^gz\u009d\u0019:5¢ÐÞïJ\u008bè¦\u0005B¹a\u0097|U\u0018àö¸êdÏÜ£$\u0084äx\u0006]n>Â\u0012N÷»ë\u0012Ì\u008f%Ä9\u0018\u001c pXW\u0098«z\u008e\u0012í¾Á4$Ý8\u007f\u001fù%Ä9\u0018\u001c pXW\u0098«z\u008e\u0012í¾Á>$Á8j\u001fø%Ä9\u0018\u001c pXW\u0098«z\u008e\u0012í¾Á<$Ö8d\u001fó%Ä9\u0018\u001c pXW\u0098«z\u008e\u0012í¾Á%$É8~\u001fñ\u0085þ\u0099\"¼\u009aÐb÷¢\u000b@.(M\u0084a\u0019\u0084ù\u0098V¿ÅÒµö\u0019Ü/ÀóåK\u0089³®sR\u0091wù\u0014U8çÝ&Á\u008bæ\u0018%Ä9\u0018\u001c¤pZWÖ«7\u008e\u0005í¥Á$$Ê8a\u001fùr\u009eV$µÚ\u0089\u001dìµÃ\u0094'\u0017:ñ\u001eE}ûQe´\u0011%Ä9\u0011\u001c«pZW\u0098«o\u008e\bí¤Á7$Ë8z\u001fårÐV\u0002µÚ\u0089FìÈÃ\u0084'\u0014:¬\u001eB}ìQW´\u0015\u008b¯ï0ÂØ&t%Ä9\f\u001c·pAWÔ«7\u008e\bí¥Á#$Ë8\u007f\u001fâr\u008c)f5§\u0010\u001e|³[0%Ä9\f\u001c·pAWÔ«7\u008e\u0012í¯Á?$Â8\"\u001fûr\u009eV0µÚ%\u008c9\u000e\u001c¤pBWÛ«w\u008e\u0002íäÁ4$Ë8a\u001fòr\u0099V)µÚ\u0089ZìµÃ\u009f'\u001a%\u00879\u0015\u001c§piWû«]\u008e2í\u0095Á1$×8y\u001f¸r\u008cV/ÐÁÌ\u001cé´\u0085H¢\u009d^p{\u0001\u0018«4?ÑÀÍWêð\u0087\u0095£!@É|T\u0019í6ÇÒ\bÏ¶ëNðcìúÉZ¥¡\u0082.~\u0086[ê8C\u0014Òñ=%Ä9\u0019\u001c±pMW\u0098«u\u008e\u000eí¿Á=$Ð8~%Ä9\u0018\u001c¤pZWÖ«7\u008e\u0005í¥Á$$Ê8a\u001fùr\u009eV$µÚ\u0089\u001dìµÃ\u0088'\u0005:ñ\u001eF}øQa´\t\u008bíï,ÂÐ&j%Ä9\f\u001c·pAWÔ«7\u008e\u0002íºÁ&$Í8c\u001fðr\u0090%¬9\u0013\u001c©pJWÑ«q\u008e\u0012í¢\u001cÙ\u0000\u0005%¹IGnË\u0092*·\u0011Ô¾ø=\u001dÚ\u0001?&ûK\u0090o2\u008cÒ°FÕêú\u0094\u001e\u001b\u0003ì'YDàh~\u008dH²îÖfûÃ\u001ft<\u001f!ÃE)jÖ\u008eu³óÐ\u0097ô%\u0019£=W\"èGÙk\u0003\u0088¼¬]ÑÞõk\u001a\u0010?±".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1959);
        a = cArr;
        b = 6141136607192365436L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0303, code lost:
    
        r0 = ((r5 | 190) << 1) - (r5 ^ 190);
        r0 = (r0 | r89) & (~(r89 & r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0897, code lost:
    
        if (r0 != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x089e, code lost:
    
        r0 = (r89 & (-268)) | (r13 & 267);
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x089c, code lost:
    
        if (r0 != 0) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x1261  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x12d4  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x2c6a A[Catch: all -> 0x3cd9, TryCatch #3 {all -> 0x3cd9, blocks: (B:8:0x0114, B:10:0x011e, B:11:0x0169, B:25:0x0457, B:27:0x0461, B:28:0x04a1, B:38:0x0632, B:40:0x0640, B:41:0x067f, B:49:0x098a, B:51:0x0990, B:52:0x09c9, B:60:0x0b6e, B:62:0x0b7d, B:63:0x0bbe, B:73:0x0dec, B:75:0x0df6, B:76:0x0e33, B:86:0x0fdf, B:88:0x0fe9, B:89:0x101f, B:115:0x12f7, B:117:0x1301, B:118:0x1333, B:128:0x150b, B:130:0x1515, B:131:0x154e, B:143:0x16f5, B:145:0x1701, B:146:0x173b, B:154:0x198a, B:156:0x1990, B:157:0x19cb, B:163:0x1aef, B:165:0x1b00, B:166:0x1b41, B:175:0x1c77, B:177:0x1c81, B:178:0x1cb4, B:180:0x1cbd, B:182:0x1cd7, B:183:0x1d1f, B:188:0x2c60, B:190:0x2c6a, B:191:0x2ca1, B:205:0x31a3, B:207:0x31ad, B:208:0x31ee, B:214:0x33de, B:216:0x33e8, B:217:0x341a, B:234:0x32bd, B:236:0x32c7, B:237:0x3306, B:288:0x3b19, B:290:0x3b26, B:291:0x3b67, B:326:0x2cad, B:328:0x2cc6, B:329:0x2d04, B:336:0x29b7, B:338:0x29c1, B:339:0x29fc, B:362:0x2a1a, B:364:0x2a24, B:365:0x2a5c, B:382:0x181c, B:384:0x1828, B:385:0x1864, B:414:0x07ae, B:416:0x07b8, B:417:0x07f7, B:427:0x08cd, B:429:0x08d7, B:430:0x090e, B:449:0x0216, B:451:0x0220, B:452:0x0260), top: B:7:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x2caa  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x2d9d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x33de A[Catch: all -> 0x3cd9, TRY_ENTER, TryCatch #3 {all -> 0x3cd9, blocks: (B:8:0x0114, B:10:0x011e, B:11:0x0169, B:25:0x0457, B:27:0x0461, B:28:0x04a1, B:38:0x0632, B:40:0x0640, B:41:0x067f, B:49:0x098a, B:51:0x0990, B:52:0x09c9, B:60:0x0b6e, B:62:0x0b7d, B:63:0x0bbe, B:73:0x0dec, B:75:0x0df6, B:76:0x0e33, B:86:0x0fdf, B:88:0x0fe9, B:89:0x101f, B:115:0x12f7, B:117:0x1301, B:118:0x1333, B:128:0x150b, B:130:0x1515, B:131:0x154e, B:143:0x16f5, B:145:0x1701, B:146:0x173b, B:154:0x198a, B:156:0x1990, B:157:0x19cb, B:163:0x1aef, B:165:0x1b00, B:166:0x1b41, B:175:0x1c77, B:177:0x1c81, B:178:0x1cb4, B:180:0x1cbd, B:182:0x1cd7, B:183:0x1d1f, B:188:0x2c60, B:190:0x2c6a, B:191:0x2ca1, B:205:0x31a3, B:207:0x31ad, B:208:0x31ee, B:214:0x33de, B:216:0x33e8, B:217:0x341a, B:234:0x32bd, B:236:0x32c7, B:237:0x3306, B:288:0x3b19, B:290:0x3b26, B:291:0x3b67, B:326:0x2cad, B:328:0x2cc6, B:329:0x2d04, B:336:0x29b7, B:338:0x29c1, B:339:0x29fc, B:362:0x2a1a, B:364:0x2a24, B:365:0x2a5c, B:382:0x181c, B:384:0x1828, B:385:0x1864, B:414:0x07ae, B:416:0x07b8, B:417:0x07f7, B:427:0x08cd, B:429:0x08d7, B:430:0x090e, B:449:0x0216, B:451:0x0220, B:452:0x0260), top: B:7:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x34be  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x37dd  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x38c8  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x392b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x38c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x2cad A[Catch: all -> 0x3cd9, TryCatch #3 {all -> 0x3cd9, blocks: (B:8:0x0114, B:10:0x011e, B:11:0x0169, B:25:0x0457, B:27:0x0461, B:28:0x04a1, B:38:0x0632, B:40:0x0640, B:41:0x067f, B:49:0x098a, B:51:0x0990, B:52:0x09c9, B:60:0x0b6e, B:62:0x0b7d, B:63:0x0bbe, B:73:0x0dec, B:75:0x0df6, B:76:0x0e33, B:86:0x0fdf, B:88:0x0fe9, B:89:0x101f, B:115:0x12f7, B:117:0x1301, B:118:0x1333, B:128:0x150b, B:130:0x1515, B:131:0x154e, B:143:0x16f5, B:145:0x1701, B:146:0x173b, B:154:0x198a, B:156:0x1990, B:157:0x19cb, B:163:0x1aef, B:165:0x1b00, B:166:0x1b41, B:175:0x1c77, B:177:0x1c81, B:178:0x1cb4, B:180:0x1cbd, B:182:0x1cd7, B:183:0x1d1f, B:188:0x2c60, B:190:0x2c6a, B:191:0x2ca1, B:205:0x31a3, B:207:0x31ad, B:208:0x31ee, B:214:0x33de, B:216:0x33e8, B:217:0x341a, B:234:0x32bd, B:236:0x32c7, B:237:0x3306, B:288:0x3b19, B:290:0x3b26, B:291:0x3b67, B:326:0x2cad, B:328:0x2cc6, B:329:0x2d04, B:336:0x29b7, B:338:0x29c1, B:339:0x29fc, B:362:0x2a1a, B:364:0x2a24, B:365:0x2a5c, B:382:0x181c, B:384:0x1828, B:385:0x1864, B:414:0x07ae, B:416:0x07b8, B:417:0x07f7, B:427:0x08cd, B:429:0x08d7, B:430:0x090e, B:449:0x0216, B:451:0x0220, B:452:0x0260), top: B:7:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x2a7d  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x2af3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x1082  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x10f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object[] D8871(Context context, int i, int i2, int i3) {
        byte[] bArr;
        int i4;
        int i5;
        int i6;
        float f2;
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
        long j;
        int i21;
        int i22;
        int i23;
        int i24;
        Class cls;
        int i25;
        Object[] objArr;
        char c3;
        int i26;
        String[][] strArr;
        String[] strArr2;
        String str;
        String[] strArr3;
        Object f3;
        Object invoke;
        int i27;
        String[][] strArr4;
        int i28;
        int i29;
        int i30;
        String str2;
        int i31;
        String[] strArr5;
        int length;
        int i32;
        String[][] strArr6;
        int i33;
        String next;
        int i34;
        String[] strArr7;
        String str3;
        Object[] objArr2;
        String str4;
        String[] strArr8;
        int i35 = c;
        int i36 = 1;
        d = (((i35 | 81) << 1) - (i35 ^ 81)) % 128;
        int i37 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
        Object[] objArr3 = new Object[1];
        b((char) ExpandableListView.getPackedPositionGroup(0L), (i37 & 9) + (i37 | 9), ExpandableListView.getPackedPositionGroup(0L) + 717, objArr3);
        int i38 = 0;
        String str5 = (String) objArr3[0];
        int i39 = -(-(Process.myPid() >> 22));
        int i40 = ((i39 | 27) << 1) - (i39 ^ 27);
        char c4 = (char) (4752 - (~(-ExpandableListView.getPackedPositionChild(0L))));
        int i41 = -Process.getGidForName("");
        int i42 = (i41 ^ (-1)) + (i41 << 1);
        Object[] objArr4 = new Object[1];
        b(c4, i40, i42, objArr4);
        String str6 = (String) objArr4[0];
        int i43 = -(-TextUtils.getCapsMode("", 0, 0));
        int i44 = ((i43 | 25) << 1) - (i43 ^ 25);
        int i45 = -(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
        int i46 = -(-ExpandableListView.getPackedPositionGroup(0L));
        int i47 = ((i46 | 27) << 1) - (i46 ^ 27);
        Object[] objArr5 = new Object[1];
        b((char) (((i45 | 62943) << 1) - (i45 ^ 62943)), i44, i47, objArr5);
        String str7 = (String) objArr5[0];
        int i48 = 16;
        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 18;
        char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 25295);
        int i49 = -(-TextUtils.indexOf((CharSequence) "", '0', 0));
        int i50 = (i49 & 53) + (i49 | 53);
        Object[] objArr6 = new Object[1];
        b(maximumFlingVelocity, minimumFlingVelocity, i50, objArr6);
        String str8 = (String) objArr6[0];
        int i51 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1)) + 28;
        float f4 = 0.0f;
        int i52 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
        char c5 = (char) (((i52 | 1966) << 1) - (i52 ^ 1966));
        int i53 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
        int i54 = (i53 & 69) + (i53 | 69);
        Object[] objArr7 = new Object[1];
        b(c5, i51, i54, objArr7);
        String[] strArr9 = {str6, str7, str8, (String) objArr7[0]};
        int i55 = 0;
        while (true) {
            bArr = e;
            if (i55 >= 4) {
                i4 = 4;
                i5 = i48;
                i6 = 2;
                f2 = f4;
                c2 = ' ';
                m2.a();
                m2.a();
                i7 = i;
                break;
            }
            int i56 = c;
            c2 = ' ';
            int i57 = (i56 ^ 43) + ((i56 & 43) << 1);
            i4 = 4;
            d = i57 % 128;
            if (i57 % 2 == 0) {
                try {
                    Object[] objArr8 = {strArr9[i55]};
                    Object f5 = rV4669.f(-668483483);
                    if (f5 == null) {
                        int modifierMetaStateMask = 6045 - ((byte) KeyEvent.getModifierMetaStateMask());
                        i6 = 2;
                        char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        int i58 = 53 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        f2 = f4;
                        byte b2 = (byte) (-bArr[1]);
                        i5 = i48;
                        byte b3 = (byte) (b2 - 2);
                        int i59 = i38;
                        Object[] objArr9 = new Object[1];
                        c(b2, b3, (byte) (b3 - 1), objArr9);
                        f5 = rV4669.g(modifierMetaStateMask, edgeSlop, i58, 1367547137, (String) objArr9[i59], new Class[]{String.class});
                    } else {
                        i5 = i48;
                        i6 = 2;
                        f2 = f4;
                    }
                    long longValue = ((Long) ((Method) f5).invoke(null, objArr8)).longValue();
                    long j2 = ((-475) * longValue) + 846487368711L;
                    long j3 = ((-1774606644) | longValue) ^ (-1);
                    long j4 = longValue ^ (-1);
                    long j5 = i;
                    long j6 = ((j4 | 1774606643) | j5) ^ (-1);
                    long e2 = com.fingerprintjs.android.fpjs_pro.g.e(476L, ((j4 | (j5 ^ (-1))) | 1774606643) ^ (-1), (952 * j6) + ((-476) * (j3 | j6)) + j2, 164943364L);
                    int i60 = ((int) (e2 >>> 35)) & ((((~((-562110465) | i)) | (-2012708444)) * 366) + (((~((-2006022660) | i)) | (-568796249)) * (-366)) + 1628112372);
                    int i61 = ~i;
                    int i62 = ((int) e2) & ((((~(i61 | (-17318273))) | (~((-1992767086) | i))) * 765) + (((~((-1992767086) | i61)) | 847655528) * 1530) + (((((~((-847655529) | i61)) | (~((-1145111558) | i))) | (~((-17318273) | i))) * 765) - 1224079717));
                    if (((i62 & i60) | (i60 ^ i62)) != 0) {
                        break;
                    }
                    i55++;
                    f4 = f2;
                    i48 = i5;
                    i38 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                int i63 = i38;
                i5 = i48;
                i6 = 2;
                f2 = f4;
                Object[] objArr10 = {strArr9[i55]};
                Object f6 = rV4669.f(-668483483);
                if (f6 == null) {
                    int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6046;
                    char rgb = (char) ((-16777216) - Color.rgb(i63, i63, i63));
                    int lastIndexOf = TextUtils.lastIndexOf("", '0') + 53;
                    byte b4 = (byte) (-bArr[1]);
                    byte b5 = (byte) (b4 - 2);
                    Object[] objArr11 = new Object[1];
                    c(b4, b5, (byte) (b5 - 1), objArr11);
                    f6 = rV4669.g(minimumFlingVelocity2, rgb, lastIndexOf, 1367547137, (String) objArr11[0], new Class[]{String.class});
                }
                long longValue2 = ((Long) ((Method) f6).invoke(null, objArr10)).longValue();
                long uptimeMillis = (int) SystemClock.uptimeMillis();
                long j7 = uptimeMillis ^ (-1);
                long j8 = ((longValue2 ^ (-1)) | uptimeMillis) ^ (-1);
                long e3 = com.fingerprintjs.android.fpjs_pro.g.e(575L, (((-819626830) | uptimeMillis) ^ (-1)) | ((j7 | 819626829) ^ (-1)), ((-575) * (j8 | ((j7 | longValue2) ^ (-1)))) + (1150 * ((((-819626830) | j7) ^ (-1)) | j8)) + (((-574) * longValue2) - 470465799846L), 1119923178L);
                int i64 = ~i;
                int i65 = ((int) (e3 >> 32)) & ((((~(1594532447 | i)) | (~((-1443537484) | i64)) | 6311072) * 717) + (((~((-1443537484) | i)) | (~(i64 | 1594532447)) | 6311072) * 717) + 2096362587);
                int i66 = ((int) e3) & ((((~(1892065985 | i)) | (~(i64 | (-814088833))) | (-2043652054)) * 717) + (((((~(i64 | 1892065985)) | (-2043652054)) | (~((-814088833) | i))) * 717) - 907045491));
                if (((i65 & i66) | (i65 ^ i66)) != 0) {
                    break;
                }
                i55++;
                f4 = f2;
                i48 = i5;
                i38 = 0;
            }
        }
        int i67 = 3;
        if (i7 != i) {
            c = (d + 93) % 128;
            Object[] objArr12 = new Object[5];
            int[] iArr = new int[1];
            objArr12[0] = iArr;
            int[] iArr2 = new int[1];
            objArr12[1] = iArr2;
            int[] iArr3 = new int[1];
            objArr12[3] = iArr3;
            iArr2[0] = i;
            iArr[0] = i7;
            objArr12[i4] = null;
            objArr12[i6] = null;
            int a2 = k84.a((~((~i) | (-875194729))) | 55641094, 521, ((~((-875194729) | i)) * 521) + 1582488976, i5);
            int i68 = ((i3 | a2) << 1) - (a2 ^ i3);
            int i69 = i68 << 13;
            int i70 = (i69 | i68) & (~(i68 & i69));
            int i71 = i70 >>> 17;
            int i72 = (i70 | i71) & (~(i70 & i71));
            int i73 = i72 << 5;
            iArr3[0] = ((~i72) & i73) | ((~i73) & i72);
            return objArr12;
        }
        int i74 = 11 - (~(-Drawable.resolveOpacity(0, 0)));
        int i75 = (ViewConfiguration.getScrollFriction() > f2 ? 1 : (ViewConfiguration.getScrollFriction() == f2 ? 0 : -1));
        int i76 = -(ViewConfiguration.getTouchSlop() >> 8);
        int i77 = (i76 ^ 98) + ((i76 & 98) << 1);
        Object[] objArr13 = new Object[1];
        b((char) ((i75 ^ (-1)) + (i75 << 1)), i74, i77, objArr13);
        String str9 = (String) objArr13[0];
        int i78 = -TextUtils.getOffsetBefore("", 0);
        int i79 = (i78 ^ 13) + ((i78 & 13) << 1);
        int i80 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
        int i81 = i80 * (-433);
        int i82 = (i81 & (-8668296)) + (i81 | (-8668296));
        int i83 = ~i80;
        int i84 = ~i;
        int i85 = ~(i83 | i84);
        int i86 = ~((-40132) | i);
        int i87 = ((i85 ^ i86) | (i85 & i86)) * 217;
        int i88 = (i82 ^ i87) + ((i87 & i82) << 1);
        int i89 = ~((i83 ^ (-40132)) | (i83 & (-40132)));
        int i90 = ~((i83 ^ i) | (i83 & i));
        int i91 = (i88 - (~(((i89 ^ i90) | (i90 & i89)) * 217))) - 1;
        int i92 = ~(((-40132) & i84) | ((-40132) ^ i84));
        int i93 = ((i92 & i80) | (i80 ^ i92)) * 217;
        char c6 = (char) (((i91 | i93) << 1) - (i93 ^ i91));
        int i94 = -Color.blue(0);
        int i95 = (i94 & 110) + (i94 | 110);
        Object[] objArr14 = new Object[1];
        b(c6, i79, i95, objArr14);
        String str10 = (String) objArr14[0];
        float f7 = f2;
        int i96 = 17 - (~(-(PointF.length(f7, f7) > f7 ? 1 : (PointF.length(f7, f7) == f7 ? 0 : -1))));
        char resolveOpacity = (char) Drawable.resolveOpacity(0, 0);
        int mode = View.MeasureSpec.getMode(0);
        int i97 = (mode ^ 123) + ((mode & 123) << 1);
        Object[] objArr15 = new Object[1];
        b(resolveOpacity, i96, i97, objArr15);
        String[] strArr10 = {str9, str10, (String) objArr15[0]};
        int i98 = 0;
        while (true) {
            if (i98 >= i67) {
                i8 = i36;
                i9 = i67;
                i10 = i;
                break;
            }
            Object[] objArr16 = {strArr10[i98]};
            Object f8 = rV4669.f(-1567326429);
            if (f8 == null) {
                int i99 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6045;
                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int argb = 52 - Color.argb(0, 0, 0, 0);
                byte b6 = (byte) (-bArr[i36]);
                i9 = i67;
                Object[] objArr17 = new Object[i36];
                c(b6, (byte) (b6 - 1), b6, objArr17);
                f8 = rV4669.g(i99, tapTimeout, argb, 724607559, (String) objArr17[0], new Class[]{String.class});
            } else {
                i9 = i67;
            }
            long longValue3 = ((Long) ((Method) f8).invoke(null, objArr16)).longValue();
            i8 = i36;
            long j9 = ((-657) * longValue3) + 315734684767L;
            long j10 = ((-479111814) | longValue3) ^ (-1);
            long j11 = ((longValue3 ^ (-1)) | 479111813) ^ (-1);
            long j12 = (479111813 | ((int) Runtime.getRuntime().totalMemory())) ^ (-1);
            long e4 = com.fingerprintjs.android.fpjs_pro.g.e(658L, j11 | j12, (658 * j11) + ((-658) * (j10 | j11 | j12)) + j9, 23642426L);
            int i100 = (((~((-860352392) | i84)) | 285575556) * (-245)) - 2125016482;
            int i101 = ~((-860352392) | i);
            int i102 = ((int) (e4 >> c2)) & (((i101 | 576874019) * 245) + (i101 * (-245)) + i100);
            int myUid = Process.myUid();
            if (((((int) e4) & ((((~(myUid | 721875375)) | (-715351035)) * 376) + (((~((~myUid) | (-721875376))) | 704799146) * (-376)) + (((-27628118) | myUid) * 376) + 2088992125)) | i102) != 0) {
                int i103 = ((i98 | 270) << 1) - (i98 ^ 270);
                i10 = (i103 | i) & (~(i & i103));
                break;
            }
            i98 = ((i98 | 1) << 1) - (i98 ^ 1);
            i36 = i8;
            i67 = i9;
        }
        if (i10 != i) {
            Object[] objArr18 = new Object[5];
            int i104 = i8;
            int[] iArr4 = new int[i104];
            objArr18[0] = iArr4;
            int[] iArr5 = new int[i104];
            objArr18[i104] = iArr5;
            objArr18[i9] = new int[i104];
            iArr5[0] = i;
            iArr4[0] = i10;
            objArr18[i4] = null;
            objArr18[i6] = null;
            int i105 = (int) Runtime.getRuntime().totalMemory();
            int i106 = (i3 - (~(-(-k84.a((~(i105 | 587019037)) | ((~((-629628754) | i105)) | 84036672), -69, (((~((-545592082) | i105)) | (~(671055709 | i105))) * 69) - 138249102, -1436507316))))) - 1;
            int i107 = i106 ^ (i106 << 13);
            int i108 = i107 >>> 17;
            int i109 = (i107 | i108) & (~(i107 & i108));
            int i110 = i109 << 5;
            ((int[]) objArr18[i9])[0] = (i109 | i110) & (~(i109 & i110));
            return objArr18;
        }
        int i111 = 15 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
        char normalizeMetaState = (char) (3321 - KeyEvent.normalizeMetaState(0));
        int i112 = -View.MeasureSpec.makeMeasureSpec(0, 0);
        int i113 = (i112 * 141) - 39339;
        int i114 = ((i ^ 141) | (i & 141)) * 140;
        int i115 = ((i113 | i114) << 1) - (i113 ^ i114);
        int i116 = ~i112;
        int i117 = (i116 & 141) | (i116 ^ 141);
        int i118 = ~i117;
        int i119 = ~((i84 ^ 141) | (i84 & 141));
        int i120 = (((i118 & i119) | (i118 ^ i119)) * (-280)) + i115;
        int i121 = ~(((-142) & i112) | ((-142) ^ i112));
        int i122 = ~(i112 | i84);
        int i123 = ((i122 & i121) | (i121 ^ i122) | (~((i117 & i) | (i117 ^ i)))) * 140;
        int i124 = (i120 & i123) + (i123 | i120);
        Object[] objArr19 = new Object[1];
        b(normalizeMetaState, i111, i124, objArr19);
        Object[] objArr20 = {(String) objArr19[0]};
        Object f9 = rV4669.f(-1355975516);
        if (f9 == null) {
            int mirror = 6094 - AndroidCharacter.getMirror('0');
            char c7 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int indexOf = TextUtils.indexOf("", "", 0, 0) + 52;
            byte b7 = bArr[6];
            Object[] objArr21 = new Object[1];
            c(b7, (byte) (b7 - 2), (byte) (-bArr[1]), objArr21);
            f9 = rV4669.g(mirror, c7, indexOf, 646556096, (String) objArr21[0], new Class[]{String.class});
        }
        long longValue4 = ((Long) ((Method) f9).invoke(null, objArr20)).longValue();
        long j13 = longValue4 ^ (-1);
        long j14 = i;
        long j15 = j14 ^ (-1);
        long e5 = com.fingerprintjs.android.fpjs_pro.g.e(831L, (((-19258645) | j15) ^ (-1)) | ((19258644 | j14) ^ (-1)) | ((longValue4 | j14) ^ (-1)), ((-1662) * (((j13 | 19258644) | j14) ^ (-1))) + ((-831) * (((j13 | j15) ^ (-1)) | (((19258644 | longValue4) | j14) ^ (-1)))) + ((832 * longValue4) - 15984674520L), -359776283L);
        int i125 = ((int) (e5 >> c2)) & ((((~((~Process.myUid()) | (-1541507628))) | (-1574354604)) * 398) + ((((-1574354604) | (~((-1541507628) | r7))) * 398) - 1811126880));
        int i126 = ((int) e5) & ((((~(437213203 | i84)) | 563127684) * 672) + (((~((-437213204) | i)) | (~(1000013206 | i84))) * (-672)) + (((~((-1000013207) | i)) | (-437213204)) * 672) + 67790581);
        int i127 = -1;
        if (((i125 & i126) | (i125 ^ i126)) != 0) {
            i13 = (i & (-267)) | (i84 & 266);
            i11 = -417469134;
            i12 = 24;
        } else {
            int i128 = -(-AndroidCharacter.getMirror('0'));
            int i129 = (i128 ^ (-24)) + ((i128 & (-24)) << 1);
            int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
            int i130 = maxKeyCode * (-380);
            int i131 = ((i130 | 59210) << 1) - (i130 ^ 59210);
            int i132 = i | 155;
            i11 = -417469134;
            int i133 = ~maxKeyCode;
            int i134 = ((i132 ^ i133) | (i132 & i133)) * (-381);
            int i135 = (i131 & i134) + (i131 | i134);
            int i136 = ~((i133 & (-156)) | (i133 ^ (-156)));
            int i137 = ~(i84 | 155);
            int i138 = (i136 ^ i137) | (i136 & i137);
            int i139 = ~((maxKeyCode & 155) | (maxKeyCode ^ 155));
            int i140 = (((i139 & i138) | (i138 ^ i139)) * 381) + i135;
            int i141 = (~(i133 | 155)) * 381;
            int i142 = ((i140 | i141) << 1) - (i141 ^ i140);
            Object[] objArr22 = new Object[1];
            b((char) ((-ImageFormat.getBitsPerPixel(0)) - 1), i129, i142, objArr22);
            Object[] objArr23 = {(String) objArr22[0]};
            Object f10 = rV4669.f(-417469134);
            if (f10 == null) {
                int i143 = 6202 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                char lastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                int jumpTapTimeout = 51 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                Object[] objArr24 = new Object[1];
                i12 = 24;
                c((byte) 0, (byte) 1, (byte) (-bArr[1]), objArr24);
                f10 = rV4669.g(i143, lastIndexOf2, jumpTapTimeout, 1857630294, (String) objArr24[0], new Class[]{String.class});
            } else {
                i12 = 24;
            }
            String str11 = (String) ((Method) f10).invoke(null, objArr23);
            if (str11 != null) {
                int a3 = m2.a();
                int i144 = ~(((-681657098) & a3) | ((-681657098) ^ a3));
                int i145 = ~a3;
                int i146 = ~(((-1824084830) & i145) | ((-1824084830) ^ i145) | (-1146892373));
                int i147 = (((i144 & i146) | (i144 ^ i146)) * 920) + 430390856;
                int i148 = ~((1146892372 & i145) | (1146892372 ^ i145));
                int i149 = ((681657097 ^ i148) | (i148 & 681657097)) * 920;
                int i150 = (i147 ^ i149) + ((i147 & i149) << 1);
                int i151 = ~(((-681657098) & i145) | ((-681657098) ^ i145));
                int i152 = ~(1828549469 | a3);
                int i153 = (i151 & i152) | (i151 ^ i152);
                int i154 = ~((a3 & (-1142427733)) | ((-1142427733) ^ a3));
                int i155 = -(-(((i154 & i153) | (i153 ^ i154)) * 920));
                int i156 = (i150 ^ i155) + ((i155 & i150) << 1);
                int i157 = ((-127764093) ^ i84) | ((-127764093) & i84);
                int i158 = ((~((i157 & 734772617) | (i157 ^ 734772617))) * (-783)) + 2117573720;
                int i159 = ((-127764093) | (~(734772617 | i84))) * 783;
                int i160 = ((i158 | i159) << 1) - (i159 ^ i158);
                int length2 = str11.length();
                if (i156 > i160) {
                    int i161 = 92 / 0;
                }
            }
            int capsMode = 24 - TextUtils.getCapsMode("", 0, 0);
            int keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay() >> 16;
            int i162 = ((keyRepeatDelay | 179) << 1) - (keyRepeatDelay ^ 179);
            Object[] objArr25 = new Object[1];
            b((char) ((-ExpandableListView.getPackedPositionChild(0L)) - 1), capsMode, i162, objArr25);
            Object[] objArr26 = {(String) objArr25[0]};
            Object f11 = rV4669.f(-417469134);
            if (f11 == null) {
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 6202;
                char blue = (char) Color.blue(0);
                int i163 = 51 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                Object[] objArr27 = new Object[1];
                c((byte) 0, (byte) 1, (byte) (-bArr[1]), objArr27);
                f11 = rV4669.g(threadPriority, blue, i163, 1857630294, (String) objArr27[0], new Class[]{String.class});
            }
            String str12 = (String) ((Method) f11).invoke(null, objArr26);
            i13 = (str12 == null || str12.length() == 0) ? i : (~(i & 267)) & (i | 267);
        }
        if (i13 != i) {
            Object[] objArr28 = new Object[5];
            int[] iArr6 = new int[1];
            objArr28[0] = iArr6;
            int[] iArr7 = new int[1];
            objArr28[1] = iArr7;
            objArr28[i9] = new int[1];
            iArr7[0] = i;
            iArr6[0] = i13;
            objArr28[i4] = null;
            objArr28[i6] = null;
            int myUid2 = Process.myUid();
            int i164 = (((~((~myUid2) | (-659444092))) | 105386248) * (-245)) + 495740054;
            int i165 = ~(myUid2 | (-659444092));
            int i166 = ((i165 | 557203699) * 245) + (i165 * (-245)) + i164;
            int i167 = -(-((i166 & 16) + (i166 | 16)));
            int i168 = (i3 & i167) + (i167 | i3);
            int i169 = (i168 << 13) ^ i168;
            int i170 = i169 >>> 17;
            int i171 = (i169 | i170) & (~(i169 & i170));
            ((int[]) objArr28[i9])[0] = i171 ^ (i171 << 5);
            return objArr28;
        }
        Object f12 = rV4669.f(-409411793);
        if (f12 == null) {
            int i172 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1)) + 6511;
            char argb2 = (char) Color.argb(0, 0, 0, 0);
            int keyCodeFromString = KeyEvent.keyCodeFromString("") + 52;
            byte b8 = (byte) (-bArr[1]);
            byte b9 = (byte) (b8 - 2);
            Object[] objArr29 = new Object[1];
            c(b8, b9, (byte) (b9 - 1), objArr29);
            f12 = rV4669.g(i172, argb2, keyCodeFromString, 1849426507, (String) objArr29[0], new Class[0]);
        }
        long longValue5 = ((Long) ((Method) f12).invoke(null, null)).longValue();
        long j16 = longValue5 ^ (-1);
        long elapsedRealtime = (int) SystemClock.elapsedRealtime();
        long e6 = com.fingerprintjs.android.fpjs_pro.g.e(69L, (j16 | 968187586) ^ (-1), ((-69) * (((longValue5 | elapsedRealtime) ^ (-1)) | (((-968187587) | longValue5) ^ (-1)) | (((-968187587) | elapsedRealtime) ^ (-1)))) + ((((((-968187587) | j16) | elapsedRealtime) ^ (-1)) | (((968187586 | longValue5) | elapsedRealtime) ^ (-1))) * 69) + ((-68) * longValue5) + 67773131020L, -1338862684L);
        int freeMemory = (int) Runtime.getRuntime().freeMemory();
        int i173 = ((int) (e6 >> c2)) & ((((~(freeMemory | (-1635246604))) | 1613914635) * 116) + (((-198020193) | freeMemory) * 116) + (((~((~freeMemory) | (-176688225))) * (-116)) - 2072279902));
        int elapsedRealtime2 = (int) SystemClock.elapsedRealtime();
        int i174 = ~elapsedRealtime2;
        int i175 = ((int) e6) & ((((~(elapsedRealtime2 | (-942051521))) | (-495174890)) * 519) + (((~(i174 | (-539234305))) | (~((-402817217) | elapsedRealtime2))) * (-519)) + (((~(495174889 | i174)) | (-942051521)) * 519) + 1453938690);
        int i176 = (i173 & i175) | (i173 ^ i175);
        if (i176 != 0) {
            int i177 = c;
            d = (((i177 | 111) << 1) - (i177 ^ 111)) % 128;
            int i178 = -(-((i176 ^ (-1)) + (i176 << 1)));
            int i179 = (i178 & 200) + (i178 | 200);
            i14 = ((~i179) & i) | (i179 & i84);
        } else {
            i14 = i;
        }
        if (i14 != i) {
            Object[] objArr30 = new Object[5];
            int[] iArr8 = new int[1];
            objArr30[0] = iArr8;
            int[] iArr9 = new int[1];
            objArr30[1] = iArr9;
            objArr30[i9] = new int[1];
            iArr9[0] = i;
            iArr8[0] = i14;
            objArr30[i4] = null;
            objArr30[i6] = null;
            int myPid = Process.myPid();
            int i180 = ((~((~myPid) | (-542131215))) * 501) + (((~((-542131215) | myPid)) | 137038080) * 501) + 255247880;
            int i181 = (i3 - (~(((i180 | 16) << 1) - (i180 ^ 16)))) - 1;
            int i182 = i181 << 13;
            int i183 = (i181 | i182) & (~(i181 & i182));
            int i184 = i183 >>> 17;
            int i185 = (i183 | i184) & (~(i183 & i184));
            int i186 = i185 << 5;
            ((int[]) objArr30[i9])[0] = ((~i185) & i186) | ((~i186) & i185);
            return objArr30;
        }
        int i187 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
        int i188 = (i187 ^ 20) + ((i187 & 20) << 1);
        int i189 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
        int i190 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
        int i191 = ((i190 | MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE) << 1) - (i190 ^ MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE);
        Object[] objArr31 = new Object[1];
        b((char) ((i189 ^ 2370) + ((i189 & 2370) << 1)), i188, i191, objArr31);
        String str13 = (String) objArr31[0];
        Object[] objArr32 = new Object[1];
        b((char) (44036 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 5 - (~(-TextUtils.indexOf("", "", 0, 0))), 222 - (~(Process.myPid() >> 22)), objArr32);
        Object[] objArr33 = new Object[i6];
        objArr33[1] = (String) objArr32[0];
        objArr33[0] = str13;
        Object f13 = rV4669.f(1730286819);
        if (f13 == null) {
            int axisFromString = MotionEvent.axisFromString("") + 3266;
            char trimmedLength = (char) TextUtils.getTrimmedLength("");
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 53;
            byte b10 = (byte) (-bArr[1]);
            i15 = 1730286819;
            byte b11 = (byte) (b10 - 2);
            i16 = 6;
            Object[] objArr34 = new Object[1];
            c(b10, b11, (byte) (b11 - 1), objArr34);
            f13 = rV4669.g(axisFromString, trimmedLength, packedPositionChild, -293156473, (String) objArr34[0], new Class[]{String.class, String.class});
        } else {
            i15 = 1730286819;
            i16 = 6;
        }
        long longValue6 = ((Long) ((Method) f13).invoke(null, objArr33)).longValue();
        long j17 = longValue6 ^ (-1);
        long maxMemory = (int) Runtime.getRuntime().maxMemory();
        long j18 = maxMemory ^ (-1);
        long e7 = com.fingerprintjs.android.fpjs_pro.g.e(959L, (((-390984724) | j18) ^ (-1)) | ((j17 | maxMemory) ^ (-1)) | ((390984723 | maxMemory) ^ (-1)), ((-959) * ((390984723 | longValue6) ^ (-1))) + ((((j17 | j18) ^ (-1)) | (((-390984724) | maxMemory) ^ (-1)) | ((j18 | 390984723) ^ (-1))) * 959) + (((-958) * longValue6) - 374563364634L), -2070763119L);
        int a4 = hdi.a();
        int i192 = ~a4;
        int i193 = ((int) (e7 >> c2)) & (((a4 | 1142980994) * 54) + (((~(i192 | 294092328)) | (~((-294092329) | a4)) | 1142980994) * 54) + (((~(1143134082 | i192)) | 293939240) * (-108)) + 1233913666);
        int a5 = ((int) e7) & k84.a((-1446271041) | i84, -828, (((~r7) | 9044630) * (-828)) - 1754753727, -783454464);
        int i194 = ((i193 & a5) | (i193 ^ a5)) != 0 ? (~(i & 262)) & (i | 262) : i;
        if (i194 != i) {
            Object[] objArr35 = new Object[5];
            int[] iArr10 = new int[1];
            objArr35[0] = iArr10;
            int[] iArr11 = new int[1];
            objArr35[1] = iArr11;
            int[] iArr12 = new int[1];
            objArr35[i9] = iArr12;
            iArr11[0] = i;
            iArr10[0] = i194;
            objArr35[i4] = null;
            objArr35[2] = null;
            int i195 = (((~((-74834028) | i)) | 1141813763) * 376) + (((~(74834027 | i84)) | (-1149235820)) * (-376)) + ((((-1081823849) | i) * 376) - 976387874);
            int i196 = (((i195 | 16) << 1) - (i195 ^ 16)) + i3;
            int i197 = (i196 << 13) ^ i196;
            int i198 = i197 >>> 17;
            int i199 = (i197 | i198) & (~(i197 & i198));
            int i200 = i199 << 5;
            iArr12[0] = (i199 | i200) & (~(i199 & i200));
            return objArr35;
        }
        int i201 = -Color.argb(0, 0, 0, 0);
        Object[] objArr36 = new Object[1];
        b((char) ((-2) - (~(-MotionEvent.axisFromString("")))), ((i201 | 31) << 1) - (i201 ^ 31), 228 - (~(ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr36);
        String str14 = (String) objArr36[0];
        int i202 = 22 - (~(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
        char indexOf2 = (char) TextUtils.indexOf("", "", 0);
        int i203 = -(-KeyEvent.getDeadChar(0, 0));
        int i204 = (i203 ^ 260) + ((i203 & 260) << 1);
        Object[] objArr37 = new Object[1];
        b(indexOf2, i202, i204, objArr37);
        String str15 = (String) objArr37[0];
        int capsMode2 = TextUtils.getCapsMode("", 0, 0);
        int a6 = m2.a();
        int i205 = capsMode2 * 273;
        int i206 = ((i205 | (-7588)) << 1) - (i205 ^ (-7588));
        int i207 = ~capsMode2;
        int i208 = (i207 ^ (-29)) | (i207 & (-29));
        int i209 = ~a6;
        int i210 = ~((i208 ^ i209) | (i208 & i209));
        int i211 = (capsMode2 ^ 28) | (capsMode2 & 28);
        int i212 = ~((i211 ^ a6) | (i211 & a6));
        int i213 = -(-(((i210 ^ i212) | (i210 & i212)) * (-272)));
        int i214 = (i206 & i213) + (i213 | i206);
        int i215 = ~((i207 ^ 28) | (i207 & 28));
        int i216 = ~((i207 & a6) | (i207 ^ a6));
        int i217 = ((i216 & i215) | (i215 ^ i216)) * (-272);
        int i218 = ((i214 | i217) << 1) - (i217 ^ i214);
        int i219 = -(-(((~((capsMode2 ^ a6) | (capsMode2 & a6))) | 28) * 272));
        Object[] objArr38 = new Object[1];
        b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (i218 & i219) + (i219 | i218), 281 - (~(-(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))))), objArr38);
        String str16 = (String) objArr38[0];
        int i220 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
        int i221 = ((i220 | 14) << 1) - (i220 ^ 14);
        int i222 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
        Object[] objArr39 = new Object[1];
        b((char) (((i222 | 1) << 1) - (i222 ^ 1)), i221, 309 - (~(-Process.getGidForName(""))), objArr39);
        String[] strArr11 = {str14, str15, str16, (String) objArr39[0]};
        int i223 = i4;
        int i224 = 0;
        while (true) {
            if (i224 >= i223) {
                i17 = i;
                break;
            }
            Object[] objArr40 = {strArr11[i224]};
            Object f14 = rV4669.f(-1567326429);
            if (f14 == null) {
                int resolveSize = 6046 - View.resolveSize(0, 0);
                char axisFromString2 = (char) ((-1) - MotionEvent.axisFromString(""));
                int indexOf3 = TextUtils.indexOf("", "", 0, 0) + 52;
                byte b12 = (byte) (-bArr[1]);
                strArr8 = strArr11;
                Object[] objArr41 = new Object[1];
                c(b12, (byte) (b12 - 1), b12, objArr41);
                f14 = rV4669.g(resolveSize, axisFromString2, indexOf3, 724607559, (String) objArr41[0], new Class[]{String.class});
            } else {
                strArr8 = strArr11;
            }
            long longValue7 = ((Long) ((Method) f14).invoke(null, objArr40)).longValue();
            long j19 = 396433828 | longValue7;
            long b13 = hdi.b(1550032273);
            long j20 = (((j19 ^ (-1)) | ((396433828 | b13) ^ (-1)) | ((longValue7 | b13) ^ (-1))) * (-754)) + (((-753) * longValue7) - 299307540895L);
            long j21 = (j19 | b13) ^ (-1);
            long j22 = b13 ^ (-1);
            long e8 = com.fingerprintjs.android.fpjs_pro.g.e(754L, 396433828 | j22, ((-754) * ((((j22 | (-396433829)) | longValue7) ^ (-1)) | j21)) + j20, 899188068L);
            int a7 = hdi.a();
            int i225 = ((int) (e8 >> c2)) & (((a7 | (-327957)) * 465) + ((1298320971 | (~((-138905440) | a7))) * 930) + (((~(1298320971 | a7)) | (-138905440)) * (-465)) + 718013861);
            int maxMemory2 = (int) Runtime.getRuntime().maxMemory();
            if ((i225 | (((int) e8) & k84.a((~(maxMemory2 | 985004269)) | 4195344, 490, ((989199613 | (~maxMemory2)) * (-490)) + 1927979039, -1749450792))) != 0) {
                int i226 = d;
                c = ((i226 & 115) + (i226 | 115)) % 128;
                i17 = (((i224 | 252) << 1) - (i224 ^ 252)) ^ i;
                break;
            }
            i224++;
            strArr11 = strArr8;
            i223 = 4;
        }
        if (i17 != i) {
            Object[] objArr42 = new Object[5];
            int[] iArr13 = new int[1];
            objArr42[0] = iArr13;
            int[] iArr14 = new int[1];
            objArr42[1] = iArr14;
            objArr42[i9] = new int[1];
            iArr14[0] = i;
            iArr13[0] = i17;
            objArr42[4] = null;
            objArr42[2] = null;
            int i227 = ~(((int) Runtime.getRuntime().freeMemory()) | 561835402);
            int i228 = ((i227 | 553952384) * 196) + ((7883018 | i227) * (-196)) + 1561234454;
            int i229 = (((i228 | 16) << 1) - (i228 ^ 16)) + i3;
            int i230 = i229 << 13;
            int i231 = (i230 & (~i229)) | ((~i230) & i229);
            int i232 = i231 >>> 17;
            int i233 = (i231 | i232) & (~(i231 & i232));
            ((int[]) objArr42[i9])[0] = i233 ^ (i233 << 5);
            return objArr42;
        }
        int i234 = -View.MeasureSpec.getSize(0);
        int i235 = (i234 ^ 13) + ((i234 & 13) << 1);
        char c8 = (char) (11658 - (~(-(-(ViewConfiguration.getScrollBarSize() >> 8)))));
        int resolveOpacity2 = Drawable.resolveOpacity(0, 0);
        int i236 = resolveOpacity2 * (-515);
        int i237 = (i236 ^ 168025) + ((i236 & 168025) << 1);
        int i238 = ~((-326) | i);
        int i239 = ~((i84 ^ resolveOpacity2) | (i84 & resolveOpacity2));
        int i240 = (i238 & i239) | (i238 ^ i239);
        int i241 = ~(i84 | 325);
        int i242 = (i237 - (~(((i240 & i241) | (i240 ^ i241)) * (-516)))) - 1;
        int i243 = ~resolveOpacity2;
        int i244 = (i243 ^ (-326)) | (i243 & (-326));
        int i245 = ~((i244 & i) | (i244 ^ i));
        int i246 = ~((i243 ^ i84) | (i243 & i84) | 325);
        int i247 = (((~((i243 & 325) | (i243 ^ 325))) | (~((i84 ^ 325) | (i84 & 325)))) * 516) + (((i245 & i246) | (i245 ^ i246)) * 516) + i242;
        Object[] objArr43 = new Object[1];
        b(c8, i235, i247, objArr43);
        Object[] objArr44 = {(String) objArr43[0]};
        Object f15 = rV4669.f(i11);
        if (f15 == null) {
            int indexOf4 = 6201 - TextUtils.indexOf((CharSequence) "", '0', 0);
            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int absoluteGravity = 51 - Gravity.getAbsoluteGravity(0, 0);
            Object[] objArr45 = new Object[1];
            c((byte) 0, (byte) 1, (byte) (-bArr[1]), objArr45);
            f15 = rV4669.g(indexOf4, pressedStateDuration, absoluteGravity, 1857630294, (String) objArr45[0], new Class[]{String.class});
        }
        String str17 = (String) ((Method) f15).invoke(null, objArr44);
        if (str17 != null) {
            int i248 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int i249 = ((i248 | 8) << 1) - (i248 ^ 8);
            char c9 = (char) ((-2) - ((-TextUtils.indexOf((CharSequence) "", '0', 0)) ^ (-1)));
            int i250 = -(-View.resolveSize(0, 0));
            int i251 = ((i250 | 338) << 1) - (i250 ^ 338);
            Object[] objArr46 = new Object[1];
            b(c9, i249, i251, objArr46);
            if (str17.contains((String) objArr46[0])) {
                i18 = c;
                d = ((i18 & 5) + (i18 | 5)) % 128;
                i19 = (i & (-251)) | (i84 & RadarSimpleLogBuffer.PURGE_AMOUNT);
                if (i19 == i) {
                    d = ((i18 & 105) + (i18 | 105)) % 128;
                    Object[] objArr47 = new Object[5];
                    int[] iArr15 = new int[1];
                    objArr47[0] = iArr15;
                    int[] iArr16 = new int[1];
                    objArr47[1] = iArr16;
                    objArr47[i9] = new int[1];
                    iArr16[0] = i;
                    iArr15[0] = i19;
                    objArr47[4] = null;
                    objArr47[2] = null;
                    int myPid2 = Process.myPid();
                    int i252 = ~myPid2;
                    int a8 = k84.a((~(myPid2 | (-534378288))) | 143168303 | (~(i252 | 1073479487)), 988, (((~((-391209985) | i252)) | (~(1073479487 | myPid2))) * 988) + 1272689674, 16);
                    int i253 = (i3 & a8) + (a8 | i3);
                    int i254 = i253 << 13;
                    int i255 = (i254 | i253) & (~(i253 & i254));
                    int i256 = i255 >>> 17;
                    int i257 = ((~i255) & i256) | ((~i256) & i255);
                    ((int[]) objArr47[i9])[0] = i257 ^ (i257 << 5);
                    return objArr47;
                }
                int alpha = 17 - Color.alpha(0);
                int i258 = -TextUtils.getOffsetAfter("", 0);
                int i259 = -View.resolveSizeAndState(0, 0, 0);
                int i260 = (i259 & 347) + (i259 | 347);
                Object[] objArr48 = new Object[1];
                b((char) ((i258 ^ 48359) + ((i258 & 48359) << 1)), alpha, i260, objArr48);
                String str18 = (String) objArr48[0];
                int mode2 = View.MeasureSpec.getMode(0) + 6;
                int i261 = -TextUtils.indexOf((CharSequence) "", '0');
                int i262 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                Object[] objArr49 = new Object[1];
                b((char) ((i261 ^ (-1)) + (i261 << 1)), mode2, (i262 & 364) + (i262 | 364), objArr49);
                String str19 = (String) objArr49[0];
                File file = new File(str18);
                if (file.exists() && file.isFile()) {
                    try {
                        Scanner scanner = new Scanner(new FileInputStream(file));
                        int i263 = -ExpandableListView.getPackedPositionType(0L);
                        int i264 = ((i263 | 2) << 1) - (i263 ^ 2);
                        char resolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                        int i265 = -(-View.MeasureSpec.getSize(0));
                        Object[] objArr50 = new Object[1];
                        b(resolveSizeAndState, i264, (i265 & 370) + (i265 | 370), objArr50);
                        Scanner useDelimiter = scanner.useDelimiter((String) objArr50[0]);
                        if (useDelimiter.hasNext()) {
                            int i266 = ~(((-605118083) ^ i) | ((-605118083) & i));
                            int i267 = -(-(((i266 & 604066946) | (604066946 ^ i266)) * (-280)));
                            int i268 = ((139923383 | i267) << 1) - (i267 ^ 139923383);
                            int i269 = ~((-605118083) | i);
                            int i270 = ~(((-303827722) & i) | ((-303827722) ^ i));
                            int i271 = -(-(((i269 & i270) | (i269 ^ i270)) * 140));
                            int i272 = ((i268 | i271) << 1) - (i271 ^ i268);
                            int i273 = ((-605118083) & i84) | ((-605118083) ^ i84);
                            int i274 = (~(((-1051137) & i) | ((-1051137) ^ i))) | (~((i273 & 303827721) | (i273 ^ 303827721)));
                            int i275 = ((-303827722) & i84) | ((-303827722) ^ i84);
                            int i276 = (i274 | (~((i275 & 605118082) | (i275 ^ 605118082)))) * 140;
                            int i277 = (i272 & i276) + (i276 | i272);
                            int a9 = m2.a();
                            int i278 = 771534473 - (~(-(-((~((2145369979 & a9) | (2145369979 ^ a9))) * 521))));
                            int i279 = (i278 ^ (-11850770)) + (((-11850770) & i278) << 1);
                            int i280 = ~a9;
                            int i281 = (i280 & 256748331) | (256748331 ^ i280);
                            int i282 = ~((i281 & 2123578449) | (i281 ^ 2123578449));
                            int i283 = -(-(((i282 & 234956801) | (234956801 ^ i282)) * 521));
                            if (i277 > (i279 ^ i283) + ((i283 & i279) << 1)) {
                                useDelimiter.next();
                                throw null;
                            }
                            str4 = useDelimiter.next();
                        } else {
                            str4 = "";
                        }
                        useDelimiter.close();
                    } catch (IOException unused) {
                    }
                    if (str4.contains(str19)) {
                        i20 = i ^ 251;
                        if (i20 == i) {
                            int i284 = d;
                            c = ((i284 ^ 123) + ((i284 & 123) << 1)) % 128;
                            Object[] objArr51 = new Object[5];
                            int[] iArr17 = new int[1];
                            objArr51[0] = iArr17;
                            int[] iArr18 = new int[1];
                            objArr51[1] = iArr18;
                            int[] iArr19 = new int[1];
                            objArr51[i9] = iArr19;
                            iArr18[0] = i;
                            iArr17[0] = i20;
                            objArr51[4] = null;
                            objArr51[2] = null;
                            int i285 = (((~((-823179900) | i)) | 286298739) * 116) + ((393467891 | i) * 116) + ((~(930349051 | i84)) * (-116)) + 1819424918;
                            int i286 = -(-((i285 & 16) + (i285 | 16)));
                            int i287 = (i3 ^ i286) + ((i286 & i3) << 1);
                            int i288 = i287 << 13;
                            int i289 = (i288 | i287) & (~(i287 & i288));
                            int i290 = i289 >>> 17;
                            int i291 = ((~i289) & i290) | ((~i290) & i289);
                            int i292 = i291 << 5;
                            iArr19[0] = ((~i291) & i292) | ((~i292) & i291);
                            return objArr51;
                        }
                        int mirror2 = 'G' - AndroidCharacter.getMirror('0');
                        char resolveSizeAndState2 = (char) View.resolveSizeAndState(0, 0, 0);
                        int i293 = -TextUtils.indexOf("", "", 0, 0);
                        int i294 = (i293 ^ 372) + ((i293 & 372) << 1);
                        Object[] objArr52 = new Object[1];
                        b(resolveSizeAndState2, mirror2, i294, objArr52);
                        Object[] objArr53 = {(String) objArr52[0]};
                        Object f16 = rV4669.f(i11);
                        if (f16 == null) {
                            int axisFromString3 = MotionEvent.axisFromString("") + 6203;
                            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                            int modifierMetaStateMask2 = 50 - ((byte) KeyEvent.getModifierMetaStateMask());
                            Object[] objArr54 = new Object[1];
                            c((byte) 0, (byte) 1, (byte) (-bArr[1]), objArr54);
                            f16 = rV4669.g(axisFromString3, packedPositionGroup, modifierMetaStateMask2, 1857630294, (String) objArr54[0], new Class[]{String.class});
                        }
                        String lowerCase = ((String) ((Method) f16).invoke(null, objArr53)).toLowerCase();
                        int i295 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3;
                        int touchSlop = ViewConfiguration.getTouchSlop() >> 8;
                        int i296 = -TextUtils.indexOf("", "", 0);
                        int i297 = ((i296 | 395) << 1) - (i296 ^ 395);
                        Object[] objArr55 = new Object[1];
                        b((char) ((touchSlop & 33318) + (touchSlop | 33318)), i295, i297, objArr55);
                        int i298 = lowerCase.contains((String) objArr55[0]) ? (i & (-265)) | (i84 & 264) : i;
                        if (i298 != i) {
                            c = (d + 11) % 128;
                            Object[] objArr56 = new Object[5];
                            int[] iArr20 = new int[1];
                            objArr56[0] = iArr20;
                            int[] iArr21 = new int[1];
                            objArr56[1] = iArr21;
                            objArr56[i9] = new int[1];
                            iArr21[0] = i;
                            iArr20[0] = i298;
                            objArr56[4] = null;
                            objArr56[2] = null;
                            int elapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                            int a10 = k84.a(~(elapsedRealtime3 | (-16793921)), -1504, (((~((-564158930) | elapsedRealtime3)) | 547365009) * 1504) + 1125543758, 1487851344);
                            int i299 = (i3 & a10) + (a10 | i3);
                            int i300 = i299 << 13;
                            int i301 = (i300 & (~i299)) | ((~i300) & i299);
                            int i302 = i301 ^ (i301 >>> 17);
                            ((int[]) objArr56[i9])[0] = i302 ^ (i302 << 5);
                            return objArr56;
                        }
                        int indexOf5 = 41 - TextUtils.indexOf((CharSequence) "", '0');
                        char alpha2 = (char) Color.alpha(0);
                        int i303 = -TextUtils.getOffsetAfter("", 0);
                        int i304 = (i303 & 399) + (i303 | 399);
                        Object[] objArr57 = new Object[1];
                        b(alpha2, indexOf5, i304, objArr57);
                        String str20 = (String) objArr57[0];
                        int i305 = 39 - (~(-(-(ViewConfiguration.getTapTimeout() >> 16))));
                        int i306 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int i307 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int i308 = ((i307 | 442) << 1) - (i307 ^ 442);
                        Object[] objArr58 = new Object[1];
                        b((char) ((i306 ^ 34185) + ((i306 & 34185) << 1)), i305, i308, objArr58);
                        String str21 = (String) objArr58[0];
                        int i309 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i310 = (i309 ^ 27) + ((i309 & 27) << 1);
                        int i311 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        Object[] objArr59 = new Object[1];
                        b((char) (((i311 | 46193) << 1) - (i311 ^ 46193)), i310, 479 - (~(-TextUtils.indexOf((CharSequence) "", '0', 0, 0))), objArr59);
                        String str22 = (String) objArr59[0];
                        int i312 = -TextUtils.indexOf("", "", 0, 0);
                        int i313 = (i312 ^ 27) + ((i312 & 27) << 1);
                        char combineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        int i314 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int i315 = (i314 ^ 509) + ((i314 & 509) << 1);
                        Object[] objArr60 = new Object[1];
                        b(combineMeasuredStates, i313, i315, objArr60);
                        String str23 = (String) objArr60[0];
                        int myPid3 = Process.myPid() >> 22;
                        int i316 = (myPid3 & 27) + (myPid3 | 27);
                        char c10 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i317 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                        int i318 = (i317 & 535) + (i317 | 535);
                        Object[] objArr61 = new Object[1];
                        b(c10, i316, i318, objArr61);
                        String str24 = (String) objArr61[0];
                        int i319 = 25 - (~(-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))));
                        int i320 = -(ViewConfiguration.getTapTimeout() >> 16);
                        int resolveOpacity3 = Drawable.resolveOpacity(0, 0);
                        int i321 = ((resolveOpacity3 | 562) << 1) - (resolveOpacity3 ^ 562);
                        Object[] objArr62 = new Object[1];
                        b((char) ((i320 ^ 53035) + ((i320 & 53035) << 1)), i319, i321, objArr62);
                        String[] strArr12 = {str20, str21, str22, str23, str24, (String) objArr62[0]};
                        int i322 = 0;
                        for (int i323 = i16; i322 < i323; i323 = 6) {
                            Object[] objArr63 = {strArr12[i322]};
                            Object f17 = rV4669.f(i11);
                            if (f17 == null) {
                                int axisFromString4 = 6201 - MotionEvent.axisFromString("");
                                char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 51;
                                Object[] objArr64 = new Object[1];
                                j = j14;
                                c((byte) 0, (byte) 1, (byte) (-bArr[1]), objArr64);
                                f17 = rV4669.g(axisFromString4, offsetBefore, maximumDrawingCacheSize, 1857630294, (String) objArr64[0], new Class[]{String.class});
                            } else {
                                j = j14;
                            }
                            String str25 = (String) ((Method) f17).invoke(null, objArr63);
                            if (str25 != null) {
                                int i324 = ~((1299983459 ^ i) | (1299983459 & i));
                                int i325 = (((570511764 & i324) | (570511764 ^ i324)) * (-280)) + 1625364436;
                                int i326 = ~((774198711 & i) | (774198711 ^ i));
                                int i327 = ((i324 & i326) | (i324 ^ i326)) * 140;
                                int i328 = ((i325 | i327) << 1) - (i327 ^ i325);
                                int i329 = ~((1870495223 & i) | (1870495223 ^ i));
                                int i330 = (1299983459 & i84) | (1299983459 ^ i84);
                                int i331 = ~((i330 & (-774198712)) | (i330 ^ (-774198712)));
                                int i332 = (i331 & i329) | (i329 ^ i331);
                                int i333 = (774198711 & i84) | (774198711 ^ i84);
                                int i334 = ~((i333 & (-1299983460)) | (i333 ^ (-1299983460)));
                                int i335 = (((i332 & i334) | (i332 ^ i334)) * 140) + i328;
                                int i336 = ~((-70847009) | i);
                                int i337 = (i84 ^ (-1136976343)) | (i84 & (-1136976343));
                                int i338 = ~((i337 & 87657382) | (i337 ^ 87657382));
                                int i339 = -(-(((i336 & i338) | (i336 ^ i338)) * (-318)));
                                int i340 = ((1837148949 | i339) << 1) - (i339 ^ 1837148949);
                                int i341 = ~((-1136976343) | i);
                                int i342 = (i340 - (~(-(-(((i341 & 16810374) | (16810374 ^ i341)) * (-318)))))) - 1;
                                int i343 = ~((1136976342 & i) | (1136976342 ^ i));
                                int i344 = ((i343 & (-87657383)) | ((-87657383) ^ i343)) * 318;
                                int i345 = (i342 ^ i344) + ((i344 & i342) << 1);
                                int length3 = str25.length();
                                if (i335 <= i345) {
                                    if (length3 != 0) {
                                        i21 = (~(i & 265)) & (i | 265);
                                        break;
                                    }
                                } else {
                                    int i346 = 44 / 0;
                                    if (length3 != 0) {
                                        i21 = (~(i & 265)) & (i | 265);
                                        break;
                                    }
                                }
                            }
                            i322 = ((i322 & 97) + (i322 | 97)) - 96;
                            j14 = j;
                        }
                        j = j14;
                        i21 = i;
                        if (i21 != i) {
                            Object[] objArr65 = new Object[5];
                            int[] iArr22 = new int[1];
                            objArr65[0] = iArr22;
                            int[] iArr23 = new int[1];
                            objArr65[1] = iArr23;
                            objArr65[i9] = new int[1];
                            iArr23[0] = i;
                            iArr22[0] = i21;
                            objArr65[4] = null;
                            objArr65[2] = null;
                            int b14 = hdi.b(1328021093);
                            int i347 = ~b14;
                            int d2 = hdi.d((~(b14 | (-414509959))) | 659227752 | (~(414509958 | i347)), 988, (((~(802137832 | i347)) | 271599878) * (-1976)) + (((b14 | 659227752) * 988) - 1745797930), 16, i3);
                            int i348 = d2 << 13;
                            int i349 = (d2 | i348) & (~(d2 & i348));
                            int i350 = i349 >>> 17;
                            int i351 = ((~i349) & i350) | ((~i350) & i349);
                            ((int[]) objArr65[i9])[0] = i351 ^ (i351 << 5);
                            return objArr65;
                        }
                        int i352 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1));
                        int i353 = (i352 & 17) + (i352 | 17);
                        char c11 = (char) (48359 - (~TextUtils.indexOf((CharSequence) "", '0', 0, 0)));
                        int i354 = -(ViewConfiguration.getTouchSlop() >> 8);
                        int i355 = ((i354 | 347) << 1) - (i354 ^ 347);
                        Object[] objArr66 = new Object[1];
                        b(c11, i353, i355, objArr66);
                        String str26 = (String) objArr66[0];
                        Object[] objArr67 = new Object[1];
                        b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 7 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 589 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr67);
                        Object[] objArr68 = {str26, (String) objArr67[0]};
                        Object f18 = rV4669.f(i15);
                        if (f18 == null) {
                            int resolveSizeAndState3 = 3265 - View.resolveSizeAndState(0, 0, 0);
                            char green = (char) Color.green(0);
                            int lastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0) + 53;
                            byte b15 = (byte) (-bArr[1]);
                            byte b16 = (byte) (b15 - 2);
                            Object[] objArr69 = new Object[1];
                            c(b15, b16, (byte) (b16 - 1), objArr69);
                            f18 = rV4669.g(resolveSizeAndState3, green, lastIndexOf3, -293156473, (String) objArr69[0], new Class[]{String.class, String.class});
                        }
                        long longValue8 = ((Long) ((Method) f18).invoke(null, objArr68)).longValue();
                        long j23 = longValue8 ^ (-1);
                        long e9 = com.fingerprintjs.android.fpjs_pro.g.e(366L, ((592757773 | longValue8) ^ (-1)) | ((((-592757774) | j23) | j) ^ (-1)), (((-592757774) | ((j23 | j) ^ (-1))) * (-366)) + (((-592757774) | longValue8) * (-366)) + ((367 * longValue8) - 217542103058L), -1087020622L);
                        int i356 = ((int) (e9 >> c2)) & ((((~(1057454524 | i)) | (-1067973631) | (~((-369252781) | i84))) * 717) + (((((~(i84 | 1057454524)) | (-1067973631)) | (~((-369252781) | i))) * 717) - 2105414022));
                        int a11 = ((int) e9) & k84.a((~((-2123273557) | i84)) | 1409843284, 933, (((~((-734467330) | i84)) | (-2123273557)) * (-933)) - 113312810, 812957074);
                        if (((i356 & a11) | (i356 ^ a11)) != 0) {
                            i22 = (i & (-261)) | (i84 & 260);
                        } else {
                            int i357 = -View.resolveSizeAndState(0, 0, 0);
                            Object[] objArr70 = new Object[1];
                            b((char) (Process.myTid() >> 22), (i357 ^ 13) + ((i357 & 13) << 1), 594 - (~Color.blue(0)), objArr70);
                            String str27 = (String) objArr70[0];
                            Object[] objArr71 = new Object[1];
                            b((char) (ExpandableListView.getPackedPositionGroup(0L) + 57040), 8 - (~(-TextUtils.getOffsetBefore("", 0))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 608, objArr71);
                            Object[] objArr72 = {str27, (String) objArr71[0]};
                            Object f19 = rV4669.f(i15);
                            if (f19 == null) {
                                int packedPositionGroup2 = 3265 - ExpandableListView.getPackedPositionGroup(0L);
                                char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                                int i358 = 52 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                byte b17 = (byte) (-bArr[1]);
                                byte b18 = (byte) (b17 - 2);
                                Object[] objArr73 = new Object[1];
                                c(b17, b18, (byte) (b18 - 1), objArr73);
                                f19 = rV4669.g(packedPositionGroup2, offsetAfter, i358, -293156473, (String) objArr73[0], new Class[]{String.class, String.class});
                            }
                            long longValue9 = ((Long) ((Method) f19).invoke(null, objArr72)).longValue();
                            long j24 = (int) Runtime.getRuntime().totalMemory();
                            long j25 = j24 ^ (-1);
                            long j26 = ((-108) * (((181143577 | longValue9) ^ (-1)) | ((j25 | longValue9) ^ (-1)))) + (((-107) * longValue9) - 9962896790L);
                            long j27 = ((longValue9 ^ (-1)) | (-181143578)) ^ (-1);
                            long e10 = com.fingerprintjs.android.fpjs_pro.g.e(54L, j24 | j27, ((((181143577 | j24) ^ (-1)) | j27 | ((j25 | (-181143578)) ^ (-1))) * 54) + j26, -1498634818L);
                            int i359 = ((int) (e10 >> c2)) & ((((~((-1354317359) | i)) | 11605548 | (~(1425620862 | i84))) * 988) + ((((~((-1342711811) | i84)) | (~(1425620862 | i))) * 988) - 1129354682));
                            int a12 = ((int) e10) & k84.a((~(1382659436 | i)) | (~(1475081449 | i)), -1324, ((1382659176 | i84) * 1324) + 818885255, 1054174702);
                            i22 = ((i359 & a12) | (i359 ^ a12)) != 0 ? (~(i & 261)) & (i | 261) : i;
                        }
                        if (i22 != i) {
                            Object[] objArr74 = new Object[5];
                            int[] iArr24 = new int[1];
                            objArr74[0] = iArr24;
                            int[] iArr25 = new int[1];
                            objArr74[1] = iArr25;
                            objArr74[i9] = new int[1];
                            iArr25[0] = i;
                            iArr24[0] = i22;
                            objArr74[4] = null;
                            objArr74[2] = null;
                            int i360 = ~((int) SystemClock.uptimeMillis());
                            int i361 = (((~(1072072275 | i360)) | 930646600) * 764) + (((~(i360 | 144575515)) | 929071680) * (-1528)) + (((r1 | 144575515) * 764) - 1926942470);
                            int i362 = -(-((i361 & 16) + (i361 | 16)));
                            int i363 = (i3 & i362) + (i362 | i3);
                            int i364 = i363 << 13;
                            int i365 = (i364 & (~i363)) | ((~i364) & i363);
                            int i366 = i365 >>> 17;
                            int i367 = (i365 | i366) & (~(i365 & i366));
                            int i368 = i367 << 5;
                            ((int[]) objArr74[i9])[0] = ((~i367) & i368) | ((~i368) & i367);
                            return objArr74;
                        }
                        Object f20 = rV4669.f(1651333490);
                        if (f20 == null) {
                            int indexOf6 = 6769 - TextUtils.indexOf("", "", 0);
                            char myPid4 = (char) (Process.myPid() >> 22);
                            int i369 = 52 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1));
                            byte b19 = (byte) (-bArr[1]);
                            byte b20 = (byte) (b19 - 2);
                            Object[] objArr75 = new Object[1];
                            c(b19, b20, (byte) (b20 - 1), objArr75);
                            f20 = rV4669.g(indexOf6, myPid4, i369, -339114986, (String) objArr75[0], new Class[0]);
                        }
                        long longValue10 = ((Long) ((Method) f20).invoke(null, null)).longValue();
                        long j28 = longValue10 ^ (-1);
                        long j29 = 1390399046 | j28;
                        long myUid3 = Process.myUid();
                        long j30 = myUid3 ^ (-1);
                        long e11 = com.fingerprintjs.android.fpjs_pro.g.e(765L, ((1390399046 | myUid3) ^ (-1)) | (((j28 | j30) | (-1390399047)) ^ (-1)), (1530 * ((j29 ^ (-1)) | ((1390399046 | j30) ^ (-1)))) + ((((j29 | j30) ^ (-1)) | (((1390399046 | longValue10) | myUid3) ^ (-1)) | (((j28 | (-1390399047)) | myUid3) ^ (-1))) * 765) + ((-764) * longValue10) + 2125920142863L, 1451071050L);
                        int i370 = ((int) (e11 >> c2)) & ((((~((~((int) SystemClock.uptimeMillis())) | (-1073873169))) | 169869440) * 241) + ((((~(976868578 | r5)) | (-2050741747)) * (-241)) - 1154124953));
                        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                        int i371 = ((int) e11) & ((((~(elapsedCpuTime | (-701353067))) | (~(735873343 | elapsedCpuTime)) | 83008) * 407) + (((~((-735873344) | elapsedCpuTime)) | (~((~elapsedCpuTime) | 701353066)) | 83008) * 407) + (((34603285 | r5) * (-814)) - 1419635272));
                        if (((i370 & i371) | (i370 ^ i371)) == 1) {
                            Object[] objArr76 = new Object[5];
                            int[] iArr26 = new int[1];
                            objArr76[0] = iArr26;
                            int[] iArr27 = new int[1];
                            objArr76[1] = iArr27;
                            int[] iArr28 = new int[1];
                            objArr76[i9] = iArr28;
                            iArr27[0] = i;
                            iArr26[0] = i;
                            objArr76[4] = null;
                            objArr76[2] = null;
                            int i372 = (((~((-33956468) | i84)) | (~(1181640563 | i))) * 520) + 465528366;
                            int i373 = ~((-1181640564) | i84);
                            int i374 = ~(i | 35007227);
                            int a13 = k84.a(i374 | (~((-35007228) | i84)) | 1147684096, 520, ((i373 | i374) * (-1040)) + i372, i3);
                            int i375 = a13 << 13;
                            int i376 = ((~a13) & i375) | ((~i375) & a13);
                            int i377 = i376 >>> 17;
                            int i378 = (i376 | i377) & (~(i376 & i377));
                            iArr28[0] = i378 ^ (i378 << 5);
                            return objArr76;
                        }
                        Object[] objArr77 = {1};
                        Object f21 = rV4669.f(814053687);
                        if (f21 == null) {
                            int lastIndexOf4 = 5097 - TextUtils.lastIndexOf("", '0');
                            char green2 = (char) (59615 - Color.green(0));
                            int lastIndexOf5 = TextUtils.lastIndexOf("", '0', 0, 0) + 53;
                            byte b21 = (byte) (-bArr[1]);
                            byte b22 = (byte) (b21 - 2);
                            Object[] objArr78 = new Object[1];
                            c(b21, b22, (byte) (b22 - 1), objArr78);
                            f21 = rV4669.g(lastIndexOf4, green2, lastIndexOf5, -1188977581, (String) objArr78[0], new Class[]{Integer.TYPE});
                        }
                        long longValue11 = ((Long) ((Method) f21).invoke(null, objArr77)).longValue();
                        long j31 = ((((367528505 | longValue11) | j) ^ (-1)) * (-301)) + ((302 * longValue11) - 110258551500L);
                        long j32 = longValue11 ^ (-1);
                        long e12 = com.fingerprintjs.android.fpjs_pro.g.e(301L, j32 | (((-367528506) | j) ^ (-1)), ((-301) * (((j32 | j) ^ (-1)) | ((j15 | 367528505) ^ (-1)))) + j31, -381076400L);
                        int uptimeMillis2 = (int) SystemClock.uptimeMillis();
                        int i379 = ((int) (e12 >> c2)) & (((uptimeMillis2 | 866636710) * 220) + (((~((~uptimeMillis2) | 579047940)) | 858178470) * (-440)) + ((((~(866636710 | r7)) | 570589700) * 220) - 1578566430));
                        int elapsedRealtime4 = (int) SystemClock.elapsedRealtime();
                        int i380 = ((int) e12) & (((~((~elapsedRealtime4) | (-17404290))) * 476) + ((~((-17404290) | elapsedRealtime4)) * 952) + (((2098208 | r5) * (-476)) - 132986375));
                        int i381 = ((i379 & i380) | (i379 ^ i380)) != 0 ? i ^ 220 : i;
                        if (i381 != i) {
                            m2.a();
                            Object[] objArr79 = new Object[5];
                            int[] iArr29 = new int[1];
                            objArr79[0] = iArr29;
                            int[] iArr30 = new int[1];
                            objArr79[1] = iArr30;
                            objArr79[i9] = new int[1];
                            iArr30[0] = i;
                            iArr29[0] = i381;
                            objArr79[4] = null;
                            objArr79[2] = null;
                            int i382 = ~((int) Runtime.getRuntime().maxMemory());
                            int b23 = com.fingerprintjs.android.fpjs_pro.g.b((~(i382 | 347302350)) | (-660750703), 494, (((-591396897) | i382) * 494) + 1209981070, -16);
                            int i383 = (i3 & b23) + (b23 | i3);
                            int i384 = i383 << 13;
                            int i385 = (i384 & (~i383)) | ((~i384) & i383);
                            int i386 = i385 >>> 17;
                            int i387 = (i385 | i386) & (~(i385 & i386));
                            ((int[]) objArr79[i9])[0] = i387 ^ (i387 << 5);
                            return objArr79;
                        }
                        int i388 = -View.MeasureSpec.getMode(0);
                        int i389 = (i388 ^ 23) + ((i388 & 23) << 1);
                        int i390 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int i391 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        int i392 = (i391 & 373) + (i391 | 373);
                        Object[] objArr80 = new Object[1];
                        b((char) ((i390 ^ (-1)) + (i390 << 1)), i389, i392, objArr80);
                        Object[] objArr81 = {(String) objArr80[0]};
                        Object f22 = rV4669.f(i11);
                        if (f22 == null) {
                            int indexOf7 = 6201 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            char indexOf8 = (char) TextUtils.indexOf("", "", 0);
                            int trimmedLength2 = TextUtils.getTrimmedLength("") + 51;
                            Object[] objArr82 = new Object[1];
                            c((byte) 0, (byte) 1, (byte) (-bArr[1]), objArr82);
                            f22 = rV4669.g(indexOf7, indexOf8, trimmedLength2, 1857630294, (String) objArr82[0], new Class[]{String.class});
                        }
                        Object invoke2 = ((Method) f22).invoke(null, objArr81);
                        if (invoke2 != null) {
                            Object[] objArr83 = {invoke2, 42};
                            Object f23 = rV4669.f(10827986);
                            if (f23 == null) {
                                int scrollBarFadeDuration = 5150 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                char c12 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                int defaultSize = View.getDefaultSize(0, 0) + 52;
                                byte b24 = (byte) (-bArr[1]);
                                byte b25 = (byte) (b24 - 2);
                                i23 = 19;
                                Object[] objArr84 = new Object[1];
                                c(b24, b25, (byte) (b25 - 1), objArr84);
                                f23 = rV4669.g(scrollBarFadeDuration, c12, defaultSize, -1996364362, (String) objArr84[0], new Class[]{String.class, Integer.TYPE});
                            } else {
                                i23 = 19;
                            }
                            long longValue12 = ((Long) ((Method) f23).invoke(null, objArr83)).longValue();
                            long b26 = hdi.b(452800822);
                            long j33 = b26 ^ (-1);
                            long e13 = com.fingerprintjs.android.fpjs_pro.g.e(184L, (1063271127 | j33) ^ (-1), ((-184) * ((((longValue12 ^ (-1)) | (-1063271128)) ^ (-1)) | b26)) + ((((1063271127 | longValue12) ^ (-1)) | ((j33 | longValue12) ^ (-1))) * 184) + (185 * longValue12) + 194578616424L, 1180381032L);
                            int i393 = (((~((-663455654) | i84)) | 25231776) * (-245)) + 179829706;
                            int i394 = ~((-663455654) | i);
                            int i395 = ((int) (e13 >> c2)) & (((i394 | 773770757) * 245) + (i394 * (-245)) + i393);
                            int i396 = ((int) e13) & ((((~(798627465 | i84)) | (~((-798627466) | i)) | (~((-638598945) | i))) * 831) + ((~((-160039050) | i)) * (-1662)) + ((((~(638598944 | i84)) | (~((-638588417) | i))) * (-831)) - 1597511636));
                            if (((i395 & i396) | (i395 ^ i396)) == 1986687685) {
                                cls = String.class;
                                i24 = i84;
                                i25 = 16;
                                int i397 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                Object[] objArr85 = new Object[1];
                                b((char) ((-2) - ((-ExpandableListView.getPackedPositionChild(0L)) ^ (-1))), (i397 & 16) + (i397 | 16), 698 - Gravity.getAbsoluteGravity(0, 0), objArr85);
                                Object[] objArr86 = {(String) objArr85[0]};
                                f3 = rV4669.f(i11);
                                if (f3 == null) {
                                    int i398 = 6202 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    char c13 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                    int resolveSizeAndState4 = 51 - View.resolveSizeAndState(0, 0, 0);
                                    Object[] objArr87 = new Object[1];
                                    c((byte) 0, (byte) 1, (byte) (-bArr[1]), objArr87);
                                    f3 = rV4669.g(i398, c13, resolveSizeAndState4, 1857630294, (String) objArr87[0], new Class[]{cls});
                                }
                                invoke = ((Method) f3).invoke(null, objArr86);
                                if (invoke != null) {
                                    i27 = 0;
                                } else {
                                    Object[] objArr88 = {invoke, 42};
                                    Object f24 = rV4669.f(10827986);
                                    if (f24 == null) {
                                        int indexOf9 = 5149 - TextUtils.indexOf((CharSequence) "", '0', 0);
                                        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                        int defaultSize2 = View.getDefaultSize(0, 0) + 52;
                                        byte b27 = (byte) (-bArr[1]);
                                        byte b28 = (byte) (b27 - 2);
                                        Object[] objArr89 = new Object[1];
                                        c(b27, b28, (byte) (b28 - 1), objArr89);
                                        f24 = rV4669.g(indexOf9, fadingEdgeLength, defaultSize2, -1996364362, (String) objArr89[0], new Class[]{cls, Integer.TYPE});
                                    }
                                    long longValue13 = ((Long) ((Method) f24).invoke(null, objArr88)).longValue();
                                    long myPid5 = Process.myPid();
                                    long j34 = myPid5 ^ (-1);
                                    long e14 = com.fingerprintjs.android.fpjs_pro.g.e(184L, (1367729108 | j34) ^ (-1), ((-184) * ((((longValue13 ^ (-1)) | (-1367729109)) ^ (-1)) | myPid5)) + ((((1367729108 | longValue13) ^ (-1)) | ((j34 | longValue13) ^ (-1))) * 184) + (185 * longValue13) + 250294426947L, 1484839013L);
                                    int i399 = ((int) (e14 >> c2)) & ((((~(249427291 | i24)) | (-1860042592)) * 52) + (((~((-249427292) | i24)) | (~((-1686653703) | i24)) | 76038402) * (-52)) + (((~((-173388890) | i24)) * 52) - 965777006));
                                    int i400 = ((int) e14) & (((~(1033885093 | i)) * 566) + (((~(428836261 | i)) | 605048832) * (-566)) + 1717996117);
                                    i27 = (i399 & i400) | (i399 ^ i400);
                                }
                                if (i27 != 1986687685) {
                                    int i401 = c;
                                    int i402 = ((i401 | 97) << 1) - (i401 ^ 97);
                                    int i403 = i402 % 128;
                                    d = i403;
                                    if (i402 % 2 == 0) {
                                        throw null;
                                    }
                                    if (i27 != -1514516938) {
                                        c = ((i403 & 111) + (i403 | 111)) % 128;
                                        int i404 = -KeyEvent.keyCodeFromString("");
                                        int i405 = ((i404 | 14) << 1) - (i404 ^ 14);
                                        char mode3 = (char) View.MeasureSpec.getMode(0);
                                        int i406 = -TextUtils.getOffsetAfter("", 0);
                                        int i407 = (i406 ^ 1413) + ((i406 & 1413) << 1);
                                        Object[] objArr90 = new Object[1];
                                        b(mode3, i405, i407, objArr90);
                                        String str28 = (String) objArr90[0];
                                        int i408 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                        Object[] objArr91 = new Object[1];
                                        b((char) (24501 - (~(-(ViewConfiguration.getScrollBarSize() >> 8)))), (i408 ^ 26) + ((i408 & 26) << 1), 1378 - (~(-(-AndroidCharacter.getMirror('0')))), objArr91);
                                        String str29 = (String) objArr91[0];
                                        int i409 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                        int i410 = (i409 & 18) + (i409 | 18);
                                        int i411 = -TextUtils.indexOf("", "", 0);
                                        Object[] objArr92 = new Object[1];
                                        b((char) ((i411 ^ 31436) + ((i411 & 31436) << 1)), i410, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1454, objArr92);
                                        String str30 = (String) objArr92[0];
                                        int trimmedLength3 = TextUtils.getTrimmedLength("") + 17;
                                        int resolveOpacity4 = Drawable.resolveOpacity(0, 0);
                                        int i412 = resolveOpacity4 * 934;
                                        int i413 = (i412 ^ (-21292472)) + ((i412 & (-21292472)) << 1);
                                        int i414 = ~resolveOpacity4;
                                        int i415 = ~((i414 & i24) | (i414 ^ i24));
                                        int i416 = -(-(((i415 & (-22847)) | ((-22847) ^ i415)) * (-933)));
                                        int i417 = (i413 ^ i416) + ((i416 & i413) << 1);
                                        int i418 = ~(((-22847) & i24) | ((-22847) ^ i24));
                                        int i419 = ~(((-22847) & resolveOpacity4) | ((-22847) ^ resolveOpacity4));
                                        int i420 = (((i418 & i419) | (i418 ^ i419)) * 933) + i417;
                                        int i421 = (~((resolveOpacity4 & 22846) | (resolveOpacity4 ^ 22846))) * 933;
                                        char c14 = (char) ((i420 ^ i421) + ((i421 & i420) << 1));
                                        int i422 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                        int i423 = i422 * (-919);
                                        int i424 = (i423 & (-1350930)) + (i423 | (-1350930));
                                        int i425 = ~i422;
                                        int i426 = (i425 ^ (-1471)) | (i425 & (-1471));
                                        int i427 = ~((i426 & i) | (i426 ^ i));
                                        int i428 = ~(((-1471) ^ i24) | ((-1471) & i24) | i422);
                                        int i429 = ((i427 & i428) | (i427 ^ i428)) * 920;
                                        int i430 = ((i424 | i429) << 1) - (i429 ^ i424);
                                        int i431 = i425 | (-1471);
                                        int i432 = ~i431;
                                        int i433 = ~((i425 ^ i24) | (i425 & i24));
                                        int i434 = ((i432 & i433) | (i432 ^ i433)) * 920;
                                        int i435 = (i425 & 1470) | (i425 ^ 1470);
                                        int i436 = i422 | (-1471);
                                        int i437 = (((~((i436 & i) | (i436 ^ i))) | (~((i435 & i) | (i435 ^ i))) | (~((i431 & i24) | (i431 ^ i24)))) * 920) + (((i430 | i434) << 1) - (i434 ^ i430));
                                        Object[] objArr93 = new Object[1];
                                        b(c14, trimmedLength3, i437, objArr93);
                                        String str31 = (String) objArr93[0];
                                        int i438 = -(-Color.rgb(0, 0, 0));
                                        int i439 = (i438 ^ 16777231) + ((i438 & 16777231) << 1);
                                        char c15 = (char) (17097 - (~(ViewConfiguration.getScrollDefaultDelay() >> 16)));
                                        int i440 = -KeyEvent.getDeadChar(0, 0);
                                        int i441 = (i440 & 1487) + (i440 | 1487);
                                        Object[] objArr94 = new Object[1];
                                        b(c15, i439, i441, objArr94);
                                        String str32 = (String) objArr94[0];
                                        int i442 = 36 - (~(Process.myTid() >> 22));
                                        char size = (char) View.MeasureSpec.getSize(0);
                                        int i443 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                                        int i444 = (i443 ^ 1502) + ((i443 & 1502) << 1);
                                        Object[] objArr95 = new Object[1];
                                        b(size, i442, i444, objArr95);
                                        String str33 = (String) objArr95[0];
                                        int myPid6 = (Process.myPid() >> 22) + 12;
                                        int i445 = -(-TextUtils.indexOf((CharSequence) "", '0'));
                                        int i446 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                        int i447 = ((i446 | 1539) << 1) - (i446 ^ 1539);
                                        Object[] objArr96 = new Object[1];
                                        b((char) ((i445 ^ 20824) + ((i445 & 20824) << 1)), myPid6, i447, objArr96);
                                        String str34 = (String) objArr96[0];
                                        int i448 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                        Object[] objArr97 = new Object[1];
                                        b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), ((i448 | 12) << 1) - (i448 ^ 12), 1551 - Color.red(0), objArr97);
                                        String str35 = (String) objArr97[0];
                                        int i449 = -(-TextUtils.indexOf("", ""));
                                        int i450 = (i449 ^ 22) + ((i449 & 22) << 1);
                                        char c16 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                        int defaultSize3 = View.getDefaultSize(0, 0);
                                        int i451 = ((defaultSize3 | 1564) << 1) - (defaultSize3 ^ 1564);
                                        Object[] objArr98 = new Object[1];
                                        b(c16, i450, i451, objArr98);
                                        String str36 = (String) objArr98[0];
                                        int i452 = -KeyEvent.keyCodeFromString("");
                                        int i453 = (i452 & 31) + (i452 | 31);
                                        char c17 = (char) (25813 - (~(Process.myTid() >> 22)));
                                        char mirror3 = AndroidCharacter.getMirror('0');
                                        int i454 = (mirror3 & 1538) + (mirror3 | 1538);
                                        Object[] objArr99 = new Object[1];
                                        b(c17, i453, i454, objArr99);
                                        String str37 = (String) objArr99[0];
                                        int jumpTapTimeout2 = 12 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                        int packedPositionType = ExpandableListView.getPackedPositionType(0L);
                                        int i455 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                        int i456 = ((i455 | 1618) << 1) - (i455 ^ 1618);
                                        Object[] objArr100 = new Object[1];
                                        b((char) ((packedPositionType & 54140) + (packedPositionType | 54140)), jumpTapTimeout2, i456, objArr100);
                                        String str38 = (String) objArr100[0];
                                        int i457 = -AndroidCharacter.getMirror('0');
                                        Object[] objArr101 = new Object[1];
                                        b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (i457 ^ 60) + ((i457 & 60) << 1), 1628 - (~(-Gravity.getAbsoluteGravity(0, 0))), objArr101);
                                        String str39 = (String) objArr101[0];
                                        int maximumFlingVelocity2 = 12 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                        char jumpTapTimeout3 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                        int i458 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                                        int i459 = (i458 & 1641) + (i458 | 1641);
                                        Object[] objArr102 = new Object[1];
                                        b(jumpTapTimeout3, maximumFlingVelocity2, i459, objArr102);
                                        String str40 = (String) objArr102[0];
                                        int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 12;
                                        char jumpTapTimeout4 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                        int i460 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                        int i461 = (i460 & 1653) + (i460 | 1653);
                                        Object[] objArr103 = new Object[1];
                                        b(jumpTapTimeout4, offsetBefore2, i461, objArr103);
                                        String str41 = (String) objArr103[0];
                                        int i462 = -(-TextUtils.getOffsetAfter("", 0));
                                        Object[] objArr104 = new Object[1];
                                        b((char) View.combineMeasuredStates(0, 0), (i462 ^ 12) + ((i462 & 12) << 1), 1664 - (~(-TextUtils.indexOf("", "", 0, 0))), objArr104);
                                        String str42 = (String) objArr104[0];
                                        int i463 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                        int i464 = ((i463 | 14) << 1) - (i463 ^ 14);
                                        int i465 = -ExpandableListView.getPackedPositionType(0L);
                                        int i466 = -(-View.getDefaultSize(0, 0));
                                        int i467 = (i466 & 1677) + (i466 | 1677);
                                        Object[] objArr105 = new Object[1];
                                        b((char) ((i465 ^ 41018) + ((i465 & 41018) << 1)), i464, i467, objArr105);
                                        String str43 = (String) objArr105[0];
                                        Object[] objArr106 = new Object[1];
                                        b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 63979), 11 - (~(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 1689 - (~(-TextUtils.indexOf((CharSequence) "", '0', 0))), objArr106);
                                        String str44 = (String) objArr106[0];
                                        int i468 = -Color.argb(0, 0, 0, 0);
                                        Object[] objArr107 = new Object[1];
                                        b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (i468 ^ 24) + ((i468 & 24) << 1), 1703 - TextUtils.indexOf("", ""), objArr107);
                                        String str45 = (String) objArr107[0];
                                        int argb3 = 28 - Color.argb(0, 0, 0, 0);
                                        char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                        int i469 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                        int i470 = (i469 & 1727) + (i469 | 1727);
                                        Object[] objArr108 = new Object[1];
                                        b(keyRepeatTimeout, argb3, i470, objArr108);
                                        String[] strArr13 = {str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, (String) objArr108[0]};
                                        int i471 = i23;
                                        int i472 = 0;
                                        while (true) {
                                            if (i472 >= i471) {
                                                i472 = -1;
                                                break;
                                            }
                                            int i473 = c + 7;
                                            d = i473 % 128;
                                            if (i473 % 2 == 0) {
                                                str3 = strArr13[i472];
                                                Object[] objArr109 = {str3};
                                                Object f25 = rV4669.f(-668483483);
                                                if (f25 == null) {
                                                    int windowTouchSlop = 6046 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                                    char c18 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    int i474 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 52;
                                                    byte b29 = (byte) (-bArr[1]);
                                                    byte b30 = (byte) (b29 - 2);
                                                    strArr7 = strArr13;
                                                    Object[] objArr110 = new Object[1];
                                                    c(b29, b30, (byte) (b30 - 1), objArr110);
                                                    f25 = rV4669.g(windowTouchSlop, c18, i474, 1367547137, (String) objArr110[0], new Class[]{cls});
                                                } else {
                                                    strArr7 = strArr13;
                                                }
                                                long longValue14 = ((Long) ((Method) f25).invoke(null, objArr109)).longValue();
                                                long maxMemory3 = (int) Runtime.getRuntime().maxMemory();
                                                long j35 = maxMemory3 ^ (-1);
                                                long j36 = longValue14 ^ (-1);
                                                long e15 = com.fingerprintjs.android.fpjs_pro.g.e(164L, ((40412776 | j36) ^ (-1)) | ((j36 | maxMemory3) ^ (-1)) | ((longValue14 | (j35 | (-40412777))) ^ (-1)), (((-40412777) | maxMemory3) * 164) + ((-328) * ((-40412777) | ((j35 | longValue14) ^ (-1)))) + (((-163) * longValue14) - 6668108205L), 1979962784L);
                                                int myTid = Process.myTid();
                                                int i475 = ((int) (e15 << 85)) & ((((~(myTid | (-889712052))) | (-1968028834)) * 519) + (((~((~myTid) | (-147731))) | (~((-889564322) | myTid))) * (-519)) + ((((~(1968028833 | r11)) | (-889712052)) * 519) - 1453938172));
                                                int b31 = hdi.b(1519084357);
                                                int i476 = ~b31;
                                                int i477 = (((((~(1471777466 | i476)) | 406784) | (~((-34551057) | i476))) | (~((-1437633195) | b31))) * (-84)) - 1905160647;
                                                int i478 = (~(b31 | (-34551057))) | (-1471777467);
                                                int i479 = ~(i476 | 34551056);
                                                if ((i475 | (((int) e15) & (((i479 | 1437633194) * 84) + ((i478 | i479) * (-84)) + i477))) != 0) {
                                                    break;
                                                }
                                                int i480 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1));
                                                int i481 = (i480 & 14) + (i480 | 14);
                                                int red = Color.red(0);
                                                int i482 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                int i483 = (i482 & 1677) + (i482 | 1677);
                                                objArr2 = new Object[1];
                                                b((char) ((red & 41018) + (red | 41018)), i481, i483, objArr2);
                                                if (!str3.equals((String) objArr2[0])) {
                                                    Object[] objArr111 = {str3};
                                                    Object f26 = rV4669.f(-1567326429);
                                                    if (f26 == null) {
                                                        int mode4 = View.MeasureSpec.getMode(0) + 6046;
                                                        char windowTouchSlop2 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                                        int alpha3 = 52 - Color.alpha(0);
                                                        byte b32 = (byte) (-bArr[1]);
                                                        Object[] objArr112 = new Object[1];
                                                        c(b32, (byte) (b32 - 1), b32, objArr112);
                                                        f26 = rV4669.g(mode4, windowTouchSlop2, alpha3, 724607559, (String) objArr112[0], new Class[]{cls});
                                                    }
                                                    long longValue15 = ((Long) ((Method) f26).invoke(null, objArr111)).longValue();
                                                    long j37 = longValue15 ^ (-1);
                                                    long j38 = (287967331 | j) ^ (-1);
                                                    long e16 = com.fingerprintjs.android.fpjs_pro.g.e(520L, (((-287967332) | j15) ^ (-1)) | ((j37 | 287967331) ^ (-1)) | j38, ((-1040) * (((j37 | j15) ^ (-1)) | j38)) + ((((((-287967332) | j37) | j15) ^ (-1)) | ((longValue15 | j) ^ (-1))) * 520) + ((521 * longValue15) - 149455044789L), 214786908L);
                                                    int elapsedRealtime5 = (int) SystemClock.elapsedRealtime();
                                                    int i484 = ((int) (e16 >> c2)) & ((((~(elapsedRealtime5 | (-262147))) | (~((~elapsedRealtime5) | 1583347695))) * 210) + ((((~((-1510418127) | r10)) | (~(73191715 | elapsedRealtime5))) * 210) - 427433074));
                                                    int i485 = ~(1965958287 | i);
                                                    int a14 = ((int) e16) & k84.a(i485 | (-1966056912), 220, (((-891782599) | i485) * (-220)) + 757982387, -2078061218);
                                                    if (((i484 & a14) | (i484 ^ a14)) != 0) {
                                                        m2.a();
                                                        break;
                                                    }
                                                }
                                                i472++;
                                                strArr13 = strArr7;
                                                i471 = 19;
                                            } else {
                                                strArr7 = strArr13;
                                                str3 = strArr7[i472];
                                                Object[] objArr113 = {str3};
                                                Object f27 = rV4669.f(-668483483);
                                                if (f27 == null) {
                                                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 6046;
                                                    char maximumDrawingCacheSize2 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                    int maximumFlingVelocity3 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 52;
                                                    byte b33 = (byte) (-bArr[1]);
                                                    byte b34 = (byte) (b33 - 2);
                                                    Object[] objArr114 = new Object[1];
                                                    c(b33, b34, (byte) (b34 - 1), objArr114);
                                                    f27 = rV4669.g(makeMeasureSpec, maximumDrawingCacheSize2, maximumFlingVelocity3, 1367547137, (String) objArr114[0], new Class[]{cls});
                                                }
                                                long longValue16 = ((Long) ((Method) f27).invoke(null, objArr113)).longValue();
                                                long j39 = longValue16 ^ (-1);
                                                long e17 = com.fingerprintjs.android.fpjs_pro.g.e(366L, ((longValue16 | (-1668066384)) ^ (-1)) | (((1668066383 | j39) | j) ^ (-1)), ((1668066383 | ((j39 | j) ^ (-1))) * (-366)) + ((1668066383 | longValue16) * (-366)) + (367 * longValue16) + 612180362561L, 271483624L);
                                                int i486 = ~((int) SystemClock.elapsedRealtime());
                                                int i487 = ((int) (e17 >> c2)) & ((((~(i486 | (-1208998717))) | 1074102544) * 52) + (((~(1208998716 | i486)) | (~((-228227695) | i486)) | 93331522) * (-52)) + ((~(1302330238 | i486)) * 52) + 1976740818);
                                                int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                                                int i488 = ~elapsedCpuTime2;
                                                int i489 = ((int) e17) & ((((~((-2000927761) | i488)) | 1145180176) * 859) + (((~(elapsedCpuTime2 | (-855747585))) | (~(856813125 | i488))) * 859) + (((856813125 | elapsedCpuTime2) * (-859)) - 684187092));
                                                if (((i487 & i489) | (i487 ^ i489)) != 0) {
                                                    break;
                                                }
                                                int i4802 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1));
                                                int i4812 = (i4802 & 14) + (i4802 | 14);
                                                int red2 = Color.red(0);
                                                int i4822 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                int i4832 = (i4822 & 1677) + (i4822 | 1677);
                                                objArr2 = new Object[1];
                                                b((char) ((red2 & 41018) + (red2 | 41018)), i4812, i4832, objArr2);
                                                if (!str3.equals((String) objArr2[0])) {
                                                }
                                                i472++;
                                                strArr13 = strArr7;
                                                i471 = 19;
                                            }
                                        }
                                        if (i472 >= 0 && (i34 = ((i472 ^ 130) + ((i472 & 130) << 1)) ^ i) != i) {
                                            Object[] objArr115 = new Object[5];
                                            int[] iArr31 = new int[1];
                                            objArr115[0] = iArr31;
                                            int[] iArr32 = new int[1];
                                            objArr115[1] = iArr32;
                                            objArr115[i9] = new int[1];
                                            iArr32[0] = i;
                                            iArr31[0] = i34;
                                            objArr115[4] = null;
                                            objArr115[2] = null;
                                            int b35 = hdi.b(1360405130);
                                            int i490 = ~b35;
                                            int d3 = hdi.d((~(b35 | 571410148)) | (~(i490 | 645237642)), 950, (((~(i490 | 571410148)) | (~(b35 | 645237642))) * (-950)) + (((~((-645237643) | i490)) | (~((-571410149) | b35))) * 1900) + 747449914, i25, i3);
                                            int i491 = d3 << 13;
                                            int i492 = (d3 | i491) & (~(d3 & i491));
                                            int i493 = i492 >>> 17;
                                            int i494 = ((~i492) & i493) | ((~i493) & i492);
                                            ((int[]) objArr115[i9])[0] = i494 ^ (i494 << 5);
                                            return objArr115;
                                        }
                                    }
                                }
                                int i495 = -ExpandableListView.getPackedPositionGroup(0L);
                                int i496 = ~i495;
                                int i497 = (i496 & i24) | (i496 ^ i24);
                                int i498 = ~i497;
                                int i499 = (((i495 * (-518)) - 6734) - (~(-(-(((i498 & 13) | (i498 ^ 13)) * 519))))) - 1;
                                int i500 = ~((i497 & 13) | (i497 ^ 13));
                                int i501 = (i495 ^ 13) | (i495 & 13);
                                int i502 = ~((i501 & i) | (i501 ^ i));
                                int i503 = (((i500 & i502) | (i500 ^ i502)) * (-519)) + i499;
                                int i504 = ~(i | 13);
                                int i505 = (((i495 & i504) | (i495 ^ i504)) * 519) + i503;
                                char c19 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                int indexOf10 = TextUtils.indexOf("", "", 0);
                                int i506 = (indexOf10 ^ 1755) + ((indexOf10 & 1755) << 1);
                                Object[] objArr116 = new Object[1];
                                b(c19, i505, i506, objArr116);
                                String str46 = (String) objArr116[0];
                                int i507 = -Color.green(0);
                                int i508 = ((i507 | 5) << 1) - (i507 ^ 5);
                                int i509 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                int a15 = m2.a();
                                int i510 = i509 * 980;
                                int i511 = ((i510 | (-3189258)) << 1) - (i510 ^ (-3189258));
                                int i512 = ~a15;
                                int i513 = (~(((-3262) & i512) | ((-3262) ^ i512))) * 979;
                                int i514 = (i511 & i513) + (i513 | i511);
                                int i515 = ((i509 ^ a15) | (i509 & a15)) * (-979);
                                int i516 = (i514 ^ i515) + ((i515 & i514) << 1);
                                int i517 = ~((a15 & (-3262)) | ((-3262) ^ a15));
                                int i518 = ~((i509 & i512) | (i512 ^ i509));
                                int i519 = ((i518 & i517) | (i517 ^ i518)) * 979;
                                int defaultSize4 = View.getDefaultSize(0, 0);
                                int i520 = ((defaultSize4 | 1768) << 1) - (defaultSize4 ^ 1768);
                                Object[] objArr117 = new Object[1];
                                b((char) (((i516 | i519) << 1) - (i519 ^ i516)), i508, i520, objArr117);
                                String[] strArr14 = {str46, (String) objArr117[0]};
                                Object[] objArr118 = new Object[1];
                                b((char) (TextUtils.lastIndexOf("", '0', 0) + 1), TextUtils.getTrimmedLength("") + 15, View.MeasureSpec.getMode(0) + 1773, objArr118);
                                String str47 = (String) objArr118[0];
                                int scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
                                int a16 = m2.a();
                                int i521 = ~scrollBarSize;
                                int i522 = ((~((i521 ^ (-20)) | (i521 & (-20)))) * 210) + ((scrollBarSize * (-209)) - 3971);
                                int i523 = ~a16;
                                int i524 = ~(((-20) ^ i523) | ((-20) & i523));
                                int i525 = ~((i521 ^ a16) | (i521 & a16));
                                int i526 = -(-(((i524 & i525) | (i524 ^ i525)) * 210));
                                int i527 = i523 | i521;
                                int i528 = (scrollBarSize & (-20)) | ((-20) ^ scrollBarSize);
                                int i529 = (((i522 ^ i526) + ((i522 & i526) << 1)) - (~(-(-(((~((i528 & a16) | (i528 ^ a16))) | (~((i527 & 19) | (i527 ^ 19)))) * 210))))) - 1;
                                char c20 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                int i530 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1));
                                int i531 = (i530 & 1788) + (i530 | 1788);
                                Object[] objArr119 = new Object[1];
                                b(c20, i529, i531, objArr119);
                                String str48 = (String) objArr119[0];
                                int indexOf11 = 13 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                char indexOf12 = (char) TextUtils.indexOf("", "", 0, 0);
                                int blue2 = Color.blue(0);
                                int i532 = ((blue2 | 1807) << 1) - (blue2 ^ 1807);
                                Object[] objArr120 = new Object[1];
                                b(indexOf12, indexOf11, i532, objArr120);
                                String[] strArr15 = {str47, str48, (String) objArr120[0]};
                                int i533 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                int i534 = ((i533 | 20) << 1) - (i533 ^ 20);
                                char keyRepeatDelay2 = (char) (62725 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                                int i535 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                int i536 = (i535 & 1821) + (i535 | 1821);
                                Object[] objArr121 = new Object[1];
                                b(keyRepeatDelay2, i534, i536, objArr121);
                                String str49 = (String) objArr121[0];
                                int myTid2 = Process.myTid() >> 22;
                                int i537 = (myTid2 ^ 10) + ((myTid2 & 10) << 1);
                                int i538 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                Object[] objArr122 = new Object[1];
                                b((char) ((i538 & 54762) + (i538 | 54762)), i537, (KeyEvent.getMaxKeyCode() >> 16) + 1842, objArr122);
                                String[] strArr16 = {str49, (String) objArr122[0]};
                                int i539 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                Object[] objArr123 = new Object[1];
                                b((char) ((-2) - (~(-TextUtils.lastIndexOf("", '0', 0, 0)))), (i539 & 10) + (i539 | 10), 1852 - TextUtils.getOffsetAfter("", 0), objArr123);
                                String str50 = (String) objArr123[0];
                                int i540 = 5 - (~Color.red(0));
                                char argb4 = (char) Color.argb(0, 0, 0, 0);
                                int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L);
                                int i541 = (packedPositionChild2 ^ 590) + ((packedPositionChild2 & 590) << 1);
                                Object[] objArr124 = new Object[1];
                                b(argb4, i540, i541, objArr124);
                                String[] strArr17 = {str50, (String) objArr124[0]};
                                int i542 = 27 - (~(-(ViewConfiguration.getEdgeSlop() >> 16)));
                                char packedPositionGroup3 = (char) ExpandableListView.getPackedPositionGroup(0L);
                                int i543 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                int i544 = ((i543 | 1864) << 1) - (i543 ^ 1864);
                                Object[] objArr125 = new Object[1];
                                b(packedPositionGroup3, i542, i544, objArr125);
                                String str51 = (String) objArr125[0];
                                Object[] objArr126 = new Object[1];
                                b((char) (54763 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 10 - (~TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1842, objArr126);
                                strArr4 = new String[][]{strArr14, strArr15, strArr16, strArr17, new String[]{str51, (String) objArr126[0]}};
                                i28 = 0;
                                loop5: while (true) {
                                    if (i28 < 5) {
                                        i29 = i;
                                        break;
                                    }
                                    int i545 = c + 115;
                                    d = i545 % 128;
                                    if (i545 % 2 == 0) {
                                        String[] strArr18 = strArr4[i28];
                                        str2 = strArr18[0];
                                        strArr5 = (String[]) Arrays.copyOfRange(strArr18, 0, strArr18.length);
                                        length = strArr5.length;
                                        i32 = 1;
                                        i31 = 1;
                                    } else {
                                        String[] strArr19 = strArr4[i28];
                                        str2 = strArr19[0];
                                        i31 = 1;
                                        strArr5 = (String[]) Arrays.copyOfRange(strArr19, 1, strArr19.length);
                                        length = strArr5.length;
                                        i32 = 0;
                                    }
                                    while (i32 < length) {
                                        String str52 = strArr5[i32];
                                        int i546 = (i127 ^ 122) + ((i127 & 122) << i31);
                                        int i547 = ((i546 | (-121)) << i31) - (i546 ^ (-121));
                                        File file2 = new File(str2);
                                        if (file2.exists() && file2.isFile()) {
                                            try {
                                                Scanner scanner2 = new Scanner(new FileInputStream(file2));
                                                int i548 = -TextUtils.indexOf("", "", 0, 0);
                                                strArr6 = strArr4;
                                                i33 = i28;
                                                try {
                                                    Object[] objArr127 = new Object[1];
                                                    b((char) (ViewConfiguration.getScrollBarSize() >> 8), ((i548 | 2) << 1) - (i548 ^ 2), 369 - (~(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr127);
                                                    Scanner useDelimiter2 = scanner2.useDelimiter((String) objArr127[0]);
                                                    next = useDelimiter2.hasNext() ? useDelimiter2.next() : "";
                                                    useDelimiter2.close();
                                                } catch (IOException unused2) {
                                                    continue;
                                                }
                                            } catch (IOException unused3) {
                                            }
                                            if (next.contains(str52)) {
                                                int i549 = ((i547 | 170) << 1) - (i547 ^ 170);
                                                i29 = (i549 & i24) | ((~i549) & i);
                                                break loop5;
                                            }
                                            i31 = 1;
                                            int i550 = ((i32 | (-77)) << 1) - (i32 ^ (-77));
                                            i32 = (i550 ^ 78) + ((i550 & 78) << 1);
                                            strArr4 = strArr6;
                                            i127 = i547;
                                            i28 = i33;
                                        }
                                        strArr6 = strArr4;
                                        i33 = i28;
                                        i31 = 1;
                                        int i5502 = ((i32 | (-77)) << 1) - (i32 ^ (-77));
                                        i32 = (i5502 ^ 78) + ((i5502 & 78) << 1);
                                        strArr4 = strArr6;
                                        i127 = i547;
                                        i28 = i33;
                                    }
                                    String[][] strArr20 = strArr4;
                                    int i551 = i28;
                                    int i552 = (i551 & (-81)) + (i551 | (-81));
                                    i28 = ((i552 | 82) << i31) - (i552 ^ 82);
                                    strArr4 = strArr20;
                                }
                                if (i29 == i) {
                                    Object[] objArr128 = new Object[5];
                                    int[] iArr33 = new int[1];
                                    objArr128[0] = iArr33;
                                    int[] iArr34 = new int[1];
                                    objArr128[1] = iArr34;
                                    int[] iArr35 = new int[1];
                                    objArr128[i9] = iArr35;
                                    iArr34[0] = i;
                                    iArr33[0] = i29;
                                    objArr128[4] = null;
                                    objArr128[2] = null;
                                    int b36 = com.fingerprintjs.android.fpjs_pro.g.b((-982514839) | (~(i | (-234132953))), 502, ((~(i24 | (-839608327))) * (-502)) + ((((~((-982514839) | i)) | (-1073741279)) * (-502)) - 1052767486), -16);
                                    int i553 = ((i3 | b36) << 1) - (i3 ^ b36);
                                    int i554 = i553 << 13;
                                    int i555 = (i554 & (~i553)) | ((~i554) & i553);
                                    int i556 = i555 >>> 17;
                                    int i557 = ((~i555) & i556) | ((~i556) & i555);
                                    iArr35[0] = i557 ^ (i557 << 5);
                                    return objArr128;
                                }
                                try {
                                    Object[] objArr129 = new Object[1];
                                    b((char) TextUtils.getTrimmedLength(""), ExpandableListView.getPackedPositionType(0L) + 13, 1891 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr129);
                                    String str53 = (String) objArr129[0];
                                    int i558 = -TextUtils.getOffsetBefore("", 0);
                                    int i559 = ((i558 | 8) << 1) - (i558 ^ 8);
                                    int threadPriority2 = Process.getThreadPriority(0);
                                    Object[] objArr130 = new Object[1];
                                    b((char) ((((threadPriority2 | 20) << 1) - (threadPriority2 ^ 20)) >> 6), i559, 1903 - (~(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr130);
                                    try {
                                        Object[] objArr131 = {str53, (String) objArr130[0]};
                                        Object f28 = rV4669.f(i15);
                                        if (f28 == null) {
                                            int mirror4 = 3313 - AndroidCharacter.getMirror('0');
                                            char packedPositionGroup4 = (char) ExpandableListView.getPackedPositionGroup(0L);
                                            int tapTimeout2 = 52 - (ViewConfiguration.getTapTimeout() >> 16);
                                            byte b37 = (byte) (-bArr[1]);
                                            byte b38 = (byte) (b37 - 2);
                                            Object[] objArr132 = new Object[1];
                                            c(b37, b38, (byte) (b38 - 1), objArr132);
                                            f28 = rV4669.g(mirror4, packedPositionGroup4, tapTimeout2, -293156473, (String) objArr132[0], new Class[]{cls, cls});
                                        }
                                        long longValue17 = ((Long) ((Method) f28).invoke(null, objArr131)).longValue();
                                        long nextInt = new Random().nextInt(404256107);
                                        long j40 = ((longValue17 ^ (-1)) | (-1308426356)) ^ (-1);
                                        long e18 = com.fingerprintjs.android.fpjs_pro.g.e(521L, j40 | ((longValue17 | (1308426355 | (nextInt ^ (-1)))) ^ (-1)), ((-1042) * j40) + ((((1308426355 | longValue17) | nextInt) ^ (-1)) * 521) + (522 * longValue17) + 680381705120L, -371352040L);
                                        int i560 = ~((int) Runtime.getRuntime().totalMemory());
                                        int i561 = ((int) (e18 >> c2)) & ((((~(i560 | 1436049319)) | (-1435085221)) * 494) + (((-106497) | i560) * 494) + 1699722238);
                                        int i562 = (int) e18;
                                        int i563 = (int) Runtime.getRuntime().totalMemory();
                                        if ((i561 | (i562 & k84.a((~(i563 | (-1355754073))) | (~((-81472338) | i563)), -1324, (((~i563) | (-1423911770)) * 1324) + 818885255, 1807396166))) != 0) {
                                            i30 = i ^ 150;
                                        } else {
                                            int i564 = d + 101;
                                            c = i564 % 128;
                                            if (i564 % 2 != 0) {
                                                throw null;
                                            }
                                            i30 = i;
                                        }
                                    } catch (Throwable th2) {
                                        Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                } catch (Exception unused4) {
                                    i30 = (i & (-152)) | (i24 & 151);
                                }
                                if (i30 != i) {
                                    Object[] objArr133 = new Object[5];
                                    int[] iArr36 = new int[1];
                                    objArr133[0] = iArr36;
                                    int[] iArr37 = new int[1];
                                    objArr133[1] = iArr37;
                                    int[] iArr38 = new int[1];
                                    objArr133[i9] = iArr38;
                                    iArr37[0] = i;
                                    iArr36[0] = i30;
                                    objArr133[4] = null;
                                    objArr133[2] = null;
                                    int i565 = (((~(i24 | 813691949)) | (~(i | 402955841))) * 950) + (((~(i24 | 402955841)) | (~(i | 813691949))) * (-950)) + (((~((-813691950) | i24)) | (~((-402955842) | i))) * 1900) + 747449914;
                                    int i566 = (i565 & 16) + (i565 | 16);
                                    int i567 = (i3 & i566) + (i3 | i566);
                                    int i568 = i567 ^ (i567 << 13);
                                    int i569 = i568 ^ (i568 >>> 17);
                                    int i570 = i569 << 5;
                                    iArr38[0] = (i569 | i570) & (~(i569 & i570));
                                    return objArr133;
                                }
                                int i571 = 47 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                char tapTimeout3 = (char) (14621 - (ViewConfiguration.getTapTimeout() >> 16));
                                int i572 = -ExpandableListView.getPackedPositionChild(0L);
                                int i573 = (i572 & 1911) + (i572 | 1911);
                                Object[] objArr134 = new Object[1];
                                b(tapTimeout3, i571, i573, objArr134);
                                Object[] objArr135 = {(String) objArr134[0]};
                                Object f29 = rV4669.f(-1355975516);
                                if (f29 == null) {
                                    int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 6046;
                                    char c21 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                    int alpha4 = 52 - Color.alpha(0);
                                    byte b39 = bArr[6];
                                    Object[] objArr136 = new Object[1];
                                    c(b39, (byte) (b39 - 2), (byte) (-bArr[1]), objArr136);
                                    f29 = rV4669.g(fadingEdgeLength2, c21, alpha4, 646556096, (String) objArr136[0], new Class[]{cls});
                                }
                                long longValue18 = ((Long) ((Method) f29).invoke(null, objArr135)).longValue();
                                long j41 = longValue18 ^ (-1);
                                long e19 = com.fingerprintjs.android.fpjs_pro.g.e(662L, ((longValue18 | (-528671785)) ^ (-1)) | ((j41 | 528671784) ^ (-1)), ((-1324) * (((528671784 | j) ^ (-1)) | ((longValue18 | j) ^ (-1)))) + (1324 * (j15 | (((-528671785) | j41) ^ (-1)))) + (((-661) * longValue18) - 349452049224L), -869189423L);
                                int i574 = (~((-32347713) | i24)) | 28087872;
                                int i575 = ((int) (e19 >> c2)) & ((((~(1409138538 | i)) | (~((-4259841) | i24))) * 252) + (((i574 | r6) * (-252)) - 74564438));
                                int i576 = (int) e19;
                                int i577 = ~hdi.b(1056325194);
                                int i578 = ((i575 | (i576 & ((((~((-1738280250) | i577)) | (-1119460637)) * 68) + (((~((-2199557) | i577)) * (-68)) + ((((~(r4 | 1738280249)) | ((~((-1117261081) | i577)) | (-1740479806))) * (-68)) - 567287135))))) * 263) ^ i;
                                if (i578 != i) {
                                    Object[] objArr137 = new Object[5];
                                    int[] iArr39 = new int[1];
                                    objArr137[0] = iArr39;
                                    int[] iArr40 = new int[1];
                                    objArr137[1] = iArr40;
                                    objArr137[i9] = new int[1];
                                    iArr40[0] = i;
                                    iArr39[0] = i578;
                                    objArr137[4] = null;
                                    objArr137[2] = null;
                                    int i579 = (int) Runtime.getRuntime().totalMemory();
                                    int i580 = -(-com.fingerprintjs.android.fpjs_pro.g.b((~((~i579) | (-686681652))) | 930826760, 262, (((~((-686681652) | i579)) | 930826760) * 262) + 6880732, -16));
                                    int i581 = (i3 & i580) + (i3 | i580);
                                    int i582 = i581 << 13;
                                    int i583 = (i582 | i581) & (~(i581 & i582));
                                    int i584 = i583 >>> 17;
                                    int i585 = ((~i583) & i584) | ((~i584) & i583);
                                    int i586 = i585 << 5;
                                    ((int[]) objArr137[i9])[0] = (i585 | i586) & (~(i585 & i586));
                                    return objArr137;
                                }
                                Object[] objArr138 = new Object[5];
                                int[] iArr41 = new int[1];
                                objArr138[0] = iArr41;
                                int[] iArr42 = new int[1];
                                objArr138[1] = iArr42;
                                int[] iArr43 = new int[1];
                                objArr138[i9] = iArr43;
                                iArr42[0] = i;
                                iArr41[0] = i;
                                objArr138[4] = null;
                                objArr138[2] = null;
                                int i587 = (((~(i | (-106318575))) | (-1110329217)) * 502) + ((~(i24 | (-1076364545))) * (-502)) + ((((~((-1110329217) | i)) | (-1182683119)) * (-502)) - 1576150854);
                                int i588 = (i3 ^ i587) + ((i3 & i587) << 1);
                                int i589 = i588 << 13;
                                int i590 = (i589 & (~i588)) | ((~i589) & i588);
                                int i591 = i590 >>> 17;
                                int i592 = (i590 | i591) & (~(i590 & i591));
                                int i593 = i592 << 5;
                                iArr43[0] = (i592 | i593) & (~(i592 & i593));
                                return objArr138;
                            }
                        } else {
                            i23 = 19;
                        }
                        Object[] objArr139 = new Object[1];
                        b((char) (Process.myPid() >> 22), KeyEvent.keyCodeFromString("") + 23, 371 - (~TextUtils.indexOf("", "", 0, 0)), objArr139);
                        String str54 = (String) objArr139[0];
                        int i594 = -(Process.myPid() >> 22);
                        int i595 = (i594 & 10) + (i594 | 10);
                        int i596 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int i597 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int i598 = (i597 ^ 617) + ((i597 & 617) << 1);
                        Object[] objArr140 = new Object[1];
                        b((char) (((i596 | 13279) << 1) - (i596 ^ 13279)), i595, i598, objArr140);
                        String str55 = (String) objArr140[0];
                        int i599 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        Object[] objArr141 = new Object[1];
                        b((char) Color.green(0), ((i599 | 8) << 1) - (i599 ^ 8), 626 - (~(-(ViewConfiguration.getPressedStateDuration() >> 16))), objArr141);
                        String str56 = (String) objArr141[0];
                        int i600 = 9 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                        char keyCodeFromString2 = (char) KeyEvent.keyCodeFromString("");
                        int i601 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int i602 = (i601 ^ 633) + ((i601 & 633) << 1);
                        Object[] objArr142 = new Object[1];
                        b(keyCodeFromString2, i600, i602, objArr142);
                        String[] strArr21 = {str54, str55, str56, (String) objArr142[0]};
                        int i603 = -((Process.getThreadPriority(0) + 20) >> 6);
                        Object[] objArr143 = new Object[1];
                        b((char) ((-16777217) - (~(-Color.rgb(0, 0, 0)))), ((i603 | 17) << 1) - (i603 ^ 17), 641 - (~(-Color.red(0))), objArr143);
                        String str57 = (String) objArr143[0];
                        int i604 = -View.getDefaultSize(0, 0);
                        int i605 = (i604 ^ 7) + ((i604 & 7) << 1);
                        char scrollBarFadeDuration2 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int i606 = -(-(ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        int i607 = (i606 ^ 659) + ((i606 & 659) << 1);
                        Object[] objArr144 = new Object[1];
                        b(scrollBarFadeDuration2, i605, i607, objArr144);
                        String str58 = (String) objArr144[0];
                        int i608 = 8 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        char c22 = (char) (58298 - (~TextUtils.indexOf("", "")));
                        int keyCodeFromString3 = KeyEvent.keyCodeFromString("");
                        int i609 = (keyCodeFromString3 & 666) + (keyCodeFromString3 | 666);
                        Object[] objArr145 = new Object[1];
                        b(c22, i608, i609, objArr145);
                        String str59 = (String) objArr145[0];
                        int i610 = 10 - (~(-Color.blue(0)));
                        int lastIndexOf6 = TextUtils.lastIndexOf("", '0');
                        int i611 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1));
                        int a17 = m2.a();
                        int i612 = (i611 * 69) - 45091;
                        int i613 = ~i611;
                        int i614 = i613 | (-674);
                        int i615 = ~a17;
                        int i616 = ~((i614 ^ i615) | (i614 & i615));
                        int i617 = ~((i611 ^ 673) | (i611 & 673));
                        int i618 = (i616 & i617) | (i616 ^ i617);
                        int i619 = ~((a17 ^ 673) | (a17 & 673));
                        int i620 = (i612 - (~(-(-(((i618 & i619) | (i618 ^ i619)) * (-68)))))) - 1;
                        int i621 = i613 | i615;
                        int i622 = (~((i621 & 673) | (i621 ^ 673))) * (-68);
                        int i623 = (i620 ^ i622) + ((i622 & i620) << 1);
                        int i624 = ~(((-674) ^ i615) | ((-674) & i615));
                        int i625 = (i623 - (~(((i624 & i613) | (i613 ^ i624)) * 68))) - 1;
                        Object[] objArr146 = new Object[1];
                        b((char) (((lastIndexOf6 | 31644) << 1) - (lastIndexOf6 ^ 31644)), i610, i625, objArr146);
                        String str60 = (String) objArr146[0];
                        int edgeSlop2 = ViewConfiguration.getEdgeSlop() >> 16;
                        int i626 = (edgeSlop2 & 14) + (edgeSlop2 | 14);
                        int i627 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int i628 = -Drawable.resolveOpacity(0, 0);
                        int i629 = (i628 & 684) + (i628 | 684);
                        Object[] objArr147 = new Object[1];
                        b((char) ((i627 ^ 1) + ((i627 & 1) << 1)), i626, i629, objArr147);
                        String[] strArr22 = {str57, str58, str59, str60, (String) objArr147[0]};
                        int defaultSize5 = View.getDefaultSize(0, 0) + 16;
                        int axisFromString5 = MotionEvent.axisFromString("");
                        int a18 = m2.a();
                        int i630 = axisFromString5 * (-949);
                        int i631 = (i630 & (-949)) + (i630 | (-949));
                        int i632 = ~a18;
                        int i633 = ~((-2) | i632);
                        int i634 = ~axisFromString5;
                        int i635 = ~((i634 & a18) | (i634 ^ a18));
                        int i636 = (i631 - (~(((i633 & i635) | (i633 ^ i635)) * 1900))) - 1;
                        int i637 = ((~((i632 ^ axisFromString5) | (i632 & axisFromString5))) | (~((a18 ^ 1) | (a18 & 1)))) * (-950);
                        int i638 = (i636 ^ i637) + ((i636 & i637) << 1);
                        int i639 = ~((i632 & 1) | (i632 ^ 1));
                        int i640 = ~(axisFromString5 | a18);
                        int i641 = -(-(((i640 & i639) | (i639 ^ i640)) * 950));
                        Object[] objArr148 = new Object[1];
                        b((char) (((i638 | i641) << 1) - (i641 ^ i638)), defaultSize5, 698 - Color.green(0), objArr148);
                        String str61 = (String) objArr148[0];
                        int i642 = 2 - (~(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))));
                        int i643 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                        Object[] objArr149 = new Object[1];
                        b((char) ((64714 ^ i643) + ((i643 & 64714) << 1)), i642, 713 - (~(-(ViewConfiguration.getJumpTapTimeout() >> 16))), objArr149);
                        String str62 = (String) objArr149[0];
                        int resolveOpacity5 = 22 - Drawable.resolveOpacity(0, 0);
                        int lastIndexOf7 = TextUtils.lastIndexOf("", '0', 0);
                        int i644 = lastIndexOf7 * (-949);
                        int i645 = ((-37639238) ^ i644) + ((i644 & (-37639238)) << 1);
                        int i646 = -(-(((~(((-39663) ^ i84) | ((-39663) & i84))) | (~((~lastIndexOf7) | i))) * 1900));
                        int i647 = (i645 ^ i646) + ((i646 & i645) << 1);
                        int i648 = ~(i84 | lastIndexOf7);
                        int i649 = ~((39662 ^ i) | (39662 & i));
                        int i650 = (((i648 & i649) | (i648 ^ i649)) * (-950)) + i647;
                        int i651 = ~((39662 ^ i84) | (39662 & i84));
                        int i652 = ~((lastIndexOf7 & i) | (lastIndexOf7 ^ i));
                        char c23 = (char) ((i650 - (~(-(-(((i652 & i651) | (i651 ^ i652)) * 950))))) - 1);
                        int i653 = -TextUtils.getCapsMode("", 0, 0);
                        int i654 = (i653 ^ 725) + ((i653 & 725) << 1);
                        Object[] objArr150 = new Object[1];
                        b(c23, resolveOpacity5, i654, objArr150);
                        String str63 = (String) objArr150[0];
                        int i655 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int i656 = (i655 & 25) + (i655 | 25);
                        char myTid3 = (char) (Process.myTid() >> 22);
                        int i657 = -(ViewConfiguration.getTapTimeout() >> 16);
                        int i658 = (i657 ^ 747) + ((i657 & 747) << 1);
                        Object[] objArr151 = new Object[1];
                        b(myTid3, i656, i658, objArr151);
                        String str64 = (String) objArr151[0];
                        int i659 = 27 - (~(-(-TextUtils.getTrimmedLength(""))));
                        int i660 = -(-TextUtils.getTrimmedLength(""));
                        int i661 = -Color.red(0);
                        int i662 = (i661 ^ 772) + ((i661 & 772) << 1);
                        Object[] objArr152 = new Object[1];
                        b((char) ((i660 ^ 1649) + ((i660 & 1649) << 1)), i659, i662, objArr152);
                        i24 = i84;
                        cls = String.class;
                        String[] strArr23 = {str61, str62, str5, str63, str64, (String) objArr152[0]};
                        int i663 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        Object[] objArr153 = new Object[1];
                        b((char) (ViewConfiguration.getTouchSlop() >> 8), (i663 & 10) + (i663 | 10), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 800, objArr153);
                        String str65 = (String) objArr153[0];
                        int i664 = 7 - (~(-(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))));
                        char c24 = (char) (63758 - (~(-(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))))));
                        int offsetBefore3 = TextUtils.getOffsetBefore("", 0);
                        int i665 = ~offsetBefore3;
                        int i666 = (i24 ^ offsetBefore3) | (i24 & offsetBefore3);
                        int i667 = (((((~((i665 ^ (-812)) | (i665 & (-812)))) | (~(((-812) ^ i) | ((-812) & i)))) * 104) + ((offsetBefore3 * (-103)) - 83533)) - (~(-(-((~((i666 & 811) | (i666 ^ 811))) * (-104)))))) - 1;
                        int i668 = -(-(((offsetBefore3 ^ i) | (offsetBefore3 & i)) * 104));
                        int i669 = (i667 & i668) + (i667 | i668);
                        Object[] objArr154 = new Object[1];
                        b(c24, i664, i669, objArr154);
                        String str66 = (String) objArr154[0];
                        int i670 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        Object[] objArr155 = new Object[1];
                        b((char) TextUtils.getOffsetAfter("", 0), ((i670 | 6) << 1) - (i670 ^ 6), 867 - AndroidCharacter.getMirror('0'), objArr155);
                        String str67 = (String) objArr155[0];
                        int i671 = 5 - (~(-(-View.combineMeasuredStates(0, 0))));
                        int i672 = -AndroidCharacter.getMirror('0');
                        int size2 = View.MeasureSpec.getSize(0);
                        int i673 = ((size2 | 825) << 1) - (size2 ^ 825);
                        Object[] objArr156 = new Object[1];
                        b((char) ((i672 & 48) + (i672 | 48)), i671, i673, objArr156);
                        String[] strArr24 = {str65, str66, str67, (String) objArr156[0]};
                        int absoluteGravity2 = 16 - Gravity.getAbsoluteGravity(0, 0);
                        char packedPositionType2 = (char) ExpandableListView.getPackedPositionType(0L);
                        int i674 = -TextUtils.lastIndexOf("", '0');
                        int a19 = m2.a();
                        int i675 = i674 * 530;
                        int i676 = (i675 & 1058) + (i675 | 1058);
                        int i677 = (439900 ^ i676) + ((i676 & 439900) << 1);
                        int i678 = ~a19;
                        int i679 = ~((i678 & i674) | (i678 ^ i674));
                        int i680 = ~((i674 ^ 830) | (i674 & 830));
                        int i681 = ((i679 & i680) | (i679 ^ i680)) * 529;
                        int i682 = ~(i674 | a19);
                        int i683 = (((i677 & i681) + (i677 | i681)) - (~(-(-(((i682 & (-831)) | ((-831) ^ i682)) * 529))))) - 1;
                        Object[] objArr157 = new Object[1];
                        b(packedPositionType2, absoluteGravity2, i683, objArr157);
                        String str68 = (String) objArr157[0];
                        int mirror5 = AndroidCharacter.getMirror('0') - ')';
                        int i684 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int i685 = -(KeyEvent.getMaxKeyCode() >> 16);
                        int i686 = (i685 & 666) + (i685 | 666);
                        Object[] objArr158 = new Object[1];
                        b((char) (((58299 | i684) << 1) - (i684 ^ 58299)), mirror5, i686, objArr158);
                        String str69 = (String) objArr158[0];
                        int lastIndexOf8 = 7 - TextUtils.lastIndexOf("", '0', 0, 0);
                        int i687 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        Object[] objArr159 = new Object[1];
                        b((char) (((i687 | 1) << 1) - (i687 ^ 1)), lastIndexOf8, Color.red(0) + 634, objArr159);
                        String[] strArr25 = {str68, str69, (String) objArr159[0]};
                        int i688 = 13 - (~(-View.MeasureSpec.getSize(0)));
                        char c25 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int trimmedLength4 = TextUtils.getTrimmedLength("");
                        int i689 = trimmedLength4 * 881;
                        int i690 = ((746207 | i689) << 1) - (i689 ^ 746207);
                        int i691 = ~trimmedLength4;
                        int i692 = ~(i691 | (-848));
                        int i693 = ~((i691 ^ i) | (i691 & i));
                        int i694 = (i692 & i693) | (i692 ^ i693);
                        int i695 = ~(((-848) ^ i) | ((-848) & i));
                        int i696 = (((i694 & i695) | (i694 ^ i695)) * (-880)) + i690;
                        int i697 = ~((i691 & i24) | (i691 ^ i24));
                        int i698 = (i697 & 847) | (i697 ^ 847);
                        int i699 = ~((trimmedLength4 ^ i) | (trimmedLength4 & i));
                        int i700 = (i696 - (~(((i698 & i699) | (i698 ^ i699)) * (-880)))) - 1;
                        int i701 = -(-((~(trimmedLength4 | i)) * 880));
                        int i702 = (i700 & i701) + (i701 | i700);
                        Object[] objArr160 = new Object[1];
                        b(c25, i688, i702, objArr160);
                        String str70 = (String) objArr160[0];
                        int i703 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        char c26 = (char) (20918 - (~(-(-(ViewConfiguration.getFadingEdgeLength() >> 16)))));
                        int i704 = -Color.argb(0, 0, 0, 0);
                        int i705 = (i704 ^ 861) + ((i704 & 861) << 1);
                        Object[] objArr161 = new Object[1];
                        b(c26, i703, i705, objArr161);
                        String[] strArr26 = {str70, (String) objArr161[0]};
                        int axisFromString6 = MotionEvent.axisFromString("");
                        int i706 = (axisFromString6 ^ 10) + ((axisFromString6 & 10) << 1);
                        char offsetAfter2 = (char) TextUtils.getOffsetAfter("", 0);
                        int i707 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int i708 = (i707 * (-167)) - 143954;
                        int i709 = ~i707;
                        int i710 = (i709 ^ (-863)) | (i709 & (-863));
                        int i711 = -(-(((~i710) | (~(((-863) ^ i24) | ((-863) & i24)))) * 168));
                        int i712 = (i708 ^ i711) + ((i708 & i711) << 1);
                        int i713 = (~((i710 ^ i) | (i710 & i))) * 168;
                        int i714 = (i712 ^ i713) + ((i713 & i712) << 1);
                        int i715 = ~((i709 ^ i24) | (i709 & i24));
                        int i716 = ~((i709 & 862) | (i709 ^ 862));
                        int i717 = (i707 & (-863)) | ((-863) ^ i707);
                        int i718 = ((~((i717 & i) | (i717 ^ i))) | (i715 & i716) | (i715 ^ i716)) * 168;
                        int i719 = (i714 & i718) + (i718 | i714);
                        Object[] objArr162 = new Object[1];
                        b(offsetAfter2, i706, i719, objArr162);
                        String str71 = (String) objArr162[0];
                        int i720 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0);
                        int scrollBarSize2 = ViewConfiguration.getScrollBarSize() >> 8;
                        int i721 = ((scrollBarSize2 | 871) << 1) - (scrollBarSize2 ^ 871);
                        Object[] objArr163 = new Object[1];
                        b((char) ((bitsPerPixel ^ 1) + ((bitsPerPixel & 1) << 1)), i720, i721, objArr163);
                        String[] strArr27 = {str71, (String) objArr163[0]};
                        Object[] objArr164 = new Object[1];
                        b((char) KeyEvent.getDeadChar(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 16, TextUtils.lastIndexOf("", '0') + 873, objArr164);
                        String str72 = (String) objArr164[0];
                        int i722 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int i723 = ((i722 | 2) << 1) - (i722 ^ 2);
                        int scrollBarSize3 = ViewConfiguration.getScrollBarSize() >> 8;
                        int a20 = m2.a();
                        int i724 = scrollBarSize3 * (-209);
                        int i725 = (((-13525226) | i724) << 1) - (i724 ^ (-13525226));
                        int i726 = ~scrollBarSize3;
                        int i727 = ((~(((-64715) ^ i726) | ((-64715) & i726))) * 210) + i725;
                        int i728 = ~a20;
                        int i729 = -(-(((~(((-64715) ^ i728) | ((-64715) & i728))) | (~(i726 | a20))) * 210));
                        int i730 = (i727 & i729) + (i727 | i729);
                        int i731 = ~((i726 & i728) | (i726 ^ i728) | 64714);
                        int i732 = ~((scrollBarSize3 & (-64715)) | ((-64715) ^ scrollBarSize3) | a20);
                        int i733 = ((i732 & i731) | (i731 ^ i732)) * 210;
                        int i734 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        int i735 = (i734 ^ 714) + ((i734 & 714) << 1);
                        Object[] objArr165 = new Object[1];
                        b((char) ((i730 ^ i733) + ((i733 & i730) << 1)), i723, i735, objArr165);
                        String str73 = (String) objArr165[0];
                        int i736 = -(-TextUtils.lastIndexOf("", '0'));
                        Object[] objArr166 = new Object[1];
                        b((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), ((i736 | 8) << 1) - (i736 ^ 8), 658 - (~(-(-TextUtils.indexOf("", "", 0, 0)))), objArr166);
                        String str74 = (String) objArr166[0];
                        int i737 = -MotionEvent.axisFromString("");
                        int i738 = ((i737 | 7) << 1) - (i737 ^ 7);
                        char c27 = (char) (20095 - (~(ViewConfiguration.getLongPressTimeout() >> 16)));
                        int i739 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int i740 = (i739 ^ 887) + ((i739 & 887) << 1);
                        Object[] objArr167 = new Object[1];
                        b(c27, i738, i740, objArr167);
                        String str75 = (String) objArr167[0];
                        int i741 = 11 - (~(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                        char longPressTimeout = (char) (31643 - (ViewConfiguration.getLongPressTimeout() >> 16));
                        int threadPriority3 = Process.getThreadPriority(0);
                        int i742 = ((threadPriority3 & 20) + (threadPriority3 | 20)) >> 6;
                        int i743 = (i742 & 673) + (i742 | 673);
                        Object[] objArr168 = new Object[1];
                        b(longPressTimeout, i741, i743, objArr168);
                        String str76 = (String) objArr168[0];
                        int i744 = -(-TextUtils.getOffsetBefore("", 0));
                        int i745 = (i744 ^ 14) + ((i744 & 14) << 1);
                        char rgb2 = (char) (Color.rgb(0, 0, 0) + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                        int alpha5 = Color.alpha(0);
                        int i746 = (alpha5 & 684) + (alpha5 | 684);
                        Object[] objArr169 = new Object[1];
                        b(rgb2, i745, i746, objArr169);
                        String[] strArr28 = {str72, str73, str74, str75, str76, (String) objArr169[0]};
                        int i747 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int i748 = (i747 & 20) + (i747 | 20);
                        char lastIndexOf9 = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                        int offsetAfter3 = TextUtils.getOffsetAfter("", 0);
                        int i749 = ((offsetAfter3 | 896) << 1) - (offsetAfter3 ^ 896);
                        Object[] objArr170 = new Object[1];
                        b(lastIndexOf9, i748, i749, objArr170);
                        String str77 = (String) objArr170[0];
                        int i750 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                        Object[] objArr171 = new Object[1];
                        b((char) (7373 - (ViewConfiguration.getJumpTapTimeout() >> 16)), ((i750 | 19) << 1) - (i750 ^ 19), 916 - Color.alpha(0), objArr171);
                        String str78 = (String) objArr171[0];
                        int fadingEdgeLength3 = 31 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int myTid4 = Process.myTid() >> 22;
                        Object[] objArr172 = new Object[1];
                        b((char) (((57449 | myTid4) << 1) - (myTid4 ^ 57449)), fadingEdgeLength3, (ViewConfiguration.getJumpTapTimeout() >> 16) + 935, objArr172);
                        String str79 = (String) objArr172[0];
                        int i751 = -KeyEvent.getDeadChar(0, 0);
                        Object[] objArr173 = new Object[1];
                        b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (i751 & 26) + (i751 | 26), 965 - (~(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))), objArr173);
                        String str80 = (String) objArr173[0];
                        int i752 = -Color.argb(0, 0, 0, 0);
                        int i753 = (i752 & 23) + (i752 | 23);
                        int i754 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int windowTouchSlop3 = ViewConfiguration.getWindowTouchSlop() >> 8;
                        int i755 = ((windowTouchSlop3 | 992) << 1) - (windowTouchSlop3 ^ 992);
                        Object[] objArr174 = new Object[1];
                        b((char) (((i754 | 3435) << 1) - (i754 ^ 3435)), i753, i755, objArr174);
                        String str81 = (String) objArr174[0];
                        int i756 = 33 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1));
                        char normalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
                        int i757 = -(KeyEvent.getMaxKeyCode() >> 16);
                        int i758 = (i757 ^ 1015) + ((i757 & 1015) << 1);
                        Object[] objArr175 = new Object[1];
                        b(normalizeMetaState2, i756, i758, objArr175);
                        int i759 = 16;
                        String[] strArr29 = {str77, str78, str79, str80, str81, (String) objArr175[0], str5};
                        Object[] objArr176 = new Object[1];
                        b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 19587), 12 - (~(-(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))))), 1048 - ExpandableListView.getPackedPositionGroup(0L), objArr176);
                        String str82 = (String) objArr176[0];
                        int i760 = 6 - (~(ViewConfiguration.getFadingEdgeLength() >> 16));
                        int i761 = -ExpandableListView.getPackedPositionChild(0L);
                        int i762 = i761 * (-751);
                        int i763 = ((i762 | 751) << 1) - (i762 ^ 751);
                        int i764 = ~i761;
                        int i765 = ~i764;
                        int i766 = ~((i764 ^ i) | (i764 & i));
                        int i767 = -(-(((i766 & i765) | (i765 ^ i766)) * 1504));
                        int i768 = i765 | i764;
                        int i769 = ((((i763 | i767) << 1) - (i763 ^ i767)) - (~((~((i768 ^ i) | (i768 & i))) * (-1504)))) - 1;
                        int i770 = ~i768;
                        int i771 = -(-(((i764 & i770) | (i770 ^ i764)) * 752));
                        Object[] objArr177 = new Object[1];
                        b((char) (((i769 | i771) << 1) - (i771 ^ i769)), i760, 626 - (~(-(-KeyEvent.keyCodeFromString("")))), objArr177);
                        String[] strArr30 = {str82, (String) objArr177[0]};
                        int i772 = -(-TextUtils.getCapsMode("", 0, 0));
                        Object[] objArr178 = new Object[1];
                        b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), ((i772 | 30) << 1) - (i772 ^ 30), 1061 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr178);
                        String str83 = (String) objArr178[0];
                        int i773 = -Process.getGidForName("");
                        int i774 = (i773 & 10) + (i773 | 10);
                        int i775 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int windowTouchSlop4 = ViewConfiguration.getWindowTouchSlop() >> 8;
                        int i776 = ((windowTouchSlop4 | 1091) << 1) - (windowTouchSlop4 ^ 1091);
                        Object[] objArr179 = new Object[1];
                        b((char) (((i775 | 31151) << 1) - (i775 ^ 31151)), i774, i776, objArr179);
                        String[] strArr31 = {str83, (String) objArr179[0]};
                        int i777 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1));
                        Object[] objArr180 = new Object[1];
                        b((char) View.resolveSizeAndState(0, 0, 0), ((i777 | 19) << 1) - (i777 ^ 19), View.getDefaultSize(0, 0) + 1102, objArr180);
                        String str84 = (String) objArr180[0];
                        int windowTouchSlop5 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 5;
                        char edgeSlop3 = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 32787);
                        int i778 = -(-TextUtils.getCapsMode("", 0, 0));
                        int i779 = ((i778 | 1121) << 1) - (i778 ^ 1121);
                        Object[] objArr181 = new Object[1];
                        b(edgeSlop3, windowTouchSlop5, i779, objArr181);
                        String[] strArr32 = {str84, (String) objArr181[0]};
                        Object[] objArr182 = new Object[1];
                        b((char) TextUtils.indexOf("", "", 0), 18 - (~(-KeyEvent.getDeadChar(0, 0))), 1125 - (~(-(ViewConfiguration.getMinimumFlingVelocity() >> 16))), objArr182);
                        String[] strArr33 = {(String) objArr182[0]};
                        int i780 = -Color.alpha(0);
                        Object[] objArr183 = new Object[1];
                        b((char) (14286 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), ((i780 | 16) << 1) - (i780 ^ 16), KeyEvent.keyCodeFromString("") + 1145, objArr183);
                        String[] strArr34 = {(String) objArr183[0]};
                        int i781 = 19 - (~(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                        int trimmedLength5 = TextUtils.getTrimmedLength("");
                        int i782 = ((trimmedLength5 | 1161) << 1) - (trimmedLength5 ^ 1161);
                        Object[] objArr184 = new Object[1];
                        b((char) ((-MotionEvent.axisFromString("")) - 1), i781, i782, objArr184);
                        String[] strArr35 = {(String) objArr184[0]};
                        int scrollBarSize4 = 19 - (ViewConfiguration.getScrollBarSize() >> 8);
                        char longPressTimeout2 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        int indexOf13 = TextUtils.indexOf("", "");
                        int i783 = ((indexOf13 | 1180) << 1) - (indexOf13 ^ 1180);
                        Object[] objArr185 = new Object[1];
                        b(longPressTimeout2, scrollBarSize4, i783, objArr185);
                        String[] strArr36 = {(String) objArr185[0]};
                        Object[] objArr186 = new Object[1];
                        b((char) (ViewConfiguration.getLongPressTimeout() >> 16), 22 - (~(-(ViewConfiguration.getMinimumFlingVelocity() >> 16))), 1199 - TextUtils.getTrimmedLength(""), objArr186);
                        String[] strArr37 = {(String) objArr186[0]};
                        int i784 = -(Process.myPid() >> 22);
                        int i785 = ((i784 | 21) << 1) - (i784 ^ 21);
                        char c28 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int indexOf14 = TextUtils.indexOf((CharSequence) "", '0', 0);
                        int i786 = (indexOf14 & 1223) + (indexOf14 | 1223);
                        Object[] objArr187 = new Object[1];
                        b(c28, i785, i786, objArr187);
                        String[] strArr38 = {(String) objArr187[0]};
                        int i787 = 22 - (~(-TextUtils.lastIndexOf("", '0')));
                        char c29 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i788 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                        int i789 = (i788 ^ 1243) + ((i788 & 1243) << 1);
                        Object[] objArr188 = new Object[1];
                        b(c29, i787, i789, objArr188);
                        String[] strArr39 = {(String) objArr188[0], str5};
                        int i790 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        Object[] objArr189 = new Object[1];
                        b((char) (14042 - (~(-(-(ViewConfiguration.getFadingEdgeLength() >> 16))))), (i790 & 28) + (i790 | 28), KeyEvent.getDeadChar(0, 0) + 1267, objArr189);
                        String[] strArr40 = {(String) objArr189[0], str5};
                        int keyCodeFromString4 = 27 - KeyEvent.keyCodeFromString("");
                        int i791 = -(-Color.red(0));
                        int i792 = -Color.argb(0, 0, 0, 0);
                        int i793 = (i792 & 1295) + (i792 | 1295);
                        Object[] objArr190 = new Object[1];
                        b((char) ((57467 ^ i791) + ((i791 & 57467) << 1)), keyCodeFromString4, i793, objArr190);
                        String[] strArr41 = {(String) objArr190[0], str5};
                        int i794 = -ExpandableListView.getPackedPositionChild(0L);
                        Object[] objArr191 = new Object[1];
                        b((char) (ViewConfiguration.getTapTimeout() >> 16), (i794 ^ 30) + ((i794 & 30) << 1), 1322 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr191);
                        String[] strArr42 = {(String) objArr191[0], str5};
                        int i795 = -MotionEvent.axisFromString("");
                        int i796 = ((i795 | 26) << 1) - (i795 ^ 26);
                        int i797 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                        int i798 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i799 = (i798 ^ 1353) + ((i798 & 1353) << 1);
                        Object[] objArr192 = new Object[1];
                        b((char) (((i797 | 18639) << 1) - (i797 ^ 18639)), i796, i799, objArr192);
                        String[] strArr43 = {(String) objArr192[0], str5};
                        int i800 = -View.resolveSizeAndState(0, 0, 0);
                        int i801 = ((i800 | 32) << 1) - (i800 ^ 32);
                        int touchSlop2 = ViewConfiguration.getTouchSlop() >> 8;
                        Object[] objArr193 = new Object[1];
                        b((char) ((48576 & touchSlop2) + (touchSlop2 | 48576)), i801, TextUtils.getCapsMode("", 0, 0) + 1380, objArr193);
                        String[][] strArr44 = {strArr21, strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, strArr40, strArr41, strArr42, strArr43, new String[]{(String) objArr193[0], str5}};
                        ArrayList arrayList = new ArrayList();
                        int i802 = i;
                        int i803 = 0;
                        int i804 = 0;
                        for (int i805 = i12; i803 < i805; i805 = 24) {
                            int i806 = d;
                            int i807 = (i806 ^ 63) + ((i806 & 63) << 1);
                            c = i807 % 128;
                            if (i807 % 2 != 0) {
                                strArr2 = strArr44[i803];
                                Object[] objArr194 = {strArr2[1]};
                                Object f30 = rV4669.f(i11);
                                if (f30 == null) {
                                    int keyCodeFromString5 = 6202 - KeyEvent.keyCodeFromString("");
                                    i26 = i759;
                                    char resolveOpacity6 = (char) Drawable.resolveOpacity(0, 0);
                                    int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 52;
                                    Object[] objArr195 = new Object[1];
                                    strArr = strArr44;
                                    c((byte) 0, (byte) 1, (byte) (-bArr[1]), objArr195);
                                    f30 = rV4669.g(keyCodeFromString5, resolveOpacity6, bitsPerPixel2, 1857630294, (String) objArr195[0], new Class[]{cls});
                                } else {
                                    i26 = i759;
                                    strArr = strArr44;
                                }
                                str = (String) ((Method) f30).invoke(null, objArr194);
                                strArr3 = (String[]) Arrays.copyOfRange(strArr2, 1, strArr2.length);
                                if (str == null) {
                                    i803++;
                                    i759 = i26;
                                    strArr44 = strArr;
                                }
                                d = (c + 67) % 128;
                                if (str.length() == 0) {
                                    int i808 = d;
                                    int i809 = (i808 ^ 65) + ((i808 & 65) << 1);
                                    c = i809 % 128;
                                    int i810 = i809 % 2;
                                    int length4 = strArr2.length;
                                    if (i810 == 0 ? length4 != 1 : length4 != 1) {
                                        int length5 = strArr3.length;
                                        int i811 = 0;
                                        while (i811 < length5) {
                                            if (!str.contains(strArr3[i811])) {
                                                int i812 = i811 + 127;
                                                i811 = (i812 | (-126)) + (i812 & (-126));
                                            }
                                        }
                                    }
                                    i804++;
                                    int i813 = (i803 ^ 10) + ((i803 & 10) << 1);
                                    i802 = (~(i & i813)) & (i813 | i);
                                    StringBuilder sb = new StringBuilder(str);
                                    int i814 = -Process.getGidForName("");
                                    int i815 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                                    Object[] objArr196 = new Object[1];
                                    b((char) ((i815 & 44455) + (i815 | 44455)), i814, 1411 - (~View.MeasureSpec.getMode(0)), objArr196);
                                    sb.append((String) objArr196[0]);
                                    sb.append(str);
                                    arrayList.add(sb.toString());
                                    break;
                                }
                                i803++;
                                i759 = i26;
                                strArr44 = strArr;
                            } else {
                                i26 = i759;
                                strArr = strArr44;
                                strArr2 = strArr[i803];
                                Object[] objArr197 = {strArr2[0]};
                                Object f31 = rV4669.f(i11);
                                if (f31 == null) {
                                    int i816 = 6202 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    char touchSlop3 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                    int pressedStateDuration2 = 51 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                    Object[] objArr198 = new Object[1];
                                    c((byte) 0, (byte) 1, (byte) (-bArr[1]), objArr198);
                                    f31 = rV4669.g(i816, touchSlop3, pressedStateDuration2, 1857630294, (String) objArr198[0], new Class[]{cls});
                                }
                                str = (String) ((Method) f31).invoke(null, objArr197);
                                strArr3 = (String[]) Arrays.copyOfRange(strArr2, 1, strArr2.length);
                                if (str == null) {
                                    i803++;
                                    i759 = i26;
                                    strArr44 = strArr;
                                }
                                d = (c + 67) % 128;
                                if (str.length() == 0) {
                                }
                                i803++;
                                i759 = i26;
                                strArr44 = strArr;
                            }
                        }
                        i25 = i759;
                        if (i804 > 2) {
                            objArr = new Object[5];
                            int[] iArr44 = new int[1];
                            objArr[0] = iArr44;
                            int[] iArr45 = new int[1];
                            objArr[1] = iArr45;
                            objArr[i9] = new int[1];
                            iArr45[0] = i;
                            iArr44[0] = i802;
                            objArr[4] = arrayList;
                            objArr[2] = null;
                            int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                            int i817 = (((~(elapsedCpuTime3 | (-985228503))) | (-1073442271)) * 433) + (((~((-231419289) | elapsedCpuTime3)) | (-985228503)) * (-433)) + ((~((~elapsedCpuTime3) | (-842022983))) * 433) + 1234772624;
                            int i818 = i817 << 13;
                            int i819 = (i817 | i818) & (~(i817 & i818));
                            int i820 = i819 >>> 17;
                            int i821 = ((~i819) & i820) | ((~i820) & i819);
                            c3 = 0;
                            ((int[]) objArr[i9])[0] = i821 ^ (i821 << 5);
                        } else {
                            objArr = new Object[5];
                            int[] iArr46 = new int[1];
                            objArr[0] = iArr46;
                            int[] iArr47 = new int[1];
                            objArr[1] = iArr47;
                            objArr[i9] = new int[1];
                            iArr47[0] = i;
                            iArr46[0] = i;
                            objArr[4] = null;
                            objArr[2] = null;
                            int myUid4 = Process.myUid();
                            int i822 = ~myUid4;
                            int i823 = (((~(1214713791 | i822)) | 1605632) * (-1188)) - 1900496352;
                            int i824 = (~(myUid4 | (-1214713792))) | 1605632;
                            int i825 = ~(1933999 | i822);
                            int i826 = -(-((((~(i822 | (-1214713792))) | 1214385424 | i825) * 594) + ((i824 | i825) * 594) + i823));
                            int i827 = i826 << 13;
                            int i828 = (i826 | i827) & (~(i826 & i827));
                            int i829 = i828 >>> 17;
                            int i830 = (i828 | i829) & (~(i828 & i829));
                            int i831 = i830 << 5;
                            c3 = 0;
                            ((int[]) objArr[i9])[0] = ((~i830) & i831) | ((~i831) & i830);
                        }
                        int i832 = ((int[]) objArr[c3])[c3];
                        if (i832 != i) {
                            Object[] objArr199 = new Object[5];
                            int[] iArr48 = new int[1];
                            objArr199[c3] = iArr48;
                            int[] iArr49 = new int[1];
                            objArr199[1] = iArr49;
                            objArr199[i9] = new int[1];
                            List list = (List) objArr[4];
                            iArr49[c3] = i;
                            iArr48[c3] = i832;
                            objArr199[4] = list;
                            objArr199[2] = null;
                            int i833 = ~((int) Process.getElapsedCpuTime());
                            int i834 = (((~(i833 | 464884062)) | (-930779215)) * 494) + (((-608829441) | i833) * 494) + 1460079822;
                            int i835 = (((i834 | 16) << 1) - (i834 ^ 16)) + i3;
                            int i836 = i835 << 13;
                            int i837 = (i836 & (~i835)) | ((~i836) & i835);
                            int i838 = i837 >>> 17;
                            int i839 = (i837 | i838) & (~(i837 & i838));
                            int i840 = i839 << 5;
                            ((int[]) objArr199[i9])[0] = (i839 | i840) & (~(i839 & i840));
                            return objArr199;
                        }
                        int i3972 = -(ViewConfiguration.getScrollBarSize() >> 8);
                        Object[] objArr852 = new Object[1];
                        b((char) ((-2) - ((-ExpandableListView.getPackedPositionChild(0L)) ^ (-1))), (i3972 & 16) + (i3972 | 16), 698 - Gravity.getAbsoluteGravity(0, 0), objArr852);
                        Object[] objArr862 = {(String) objArr852[0]};
                        f3 = rV4669.f(i11);
                        if (f3 == null) {
                        }
                        invoke = ((Method) f3).invoke(null, objArr862);
                        if (invoke != null) {
                        }
                        if (i27 != 1986687685) {
                        }
                        int i4952 = -ExpandableListView.getPackedPositionGroup(0L);
                        int i4962 = ~i4952;
                        int i4972 = (i4962 & i24) | (i4962 ^ i24);
                        int i4982 = ~i4972;
                        int i4992 = (((i4952 * (-518)) - 6734) - (~(-(-(((i4982 & 13) | (i4982 ^ 13)) * 519))))) - 1;
                        int i5002 = ~((i4972 & 13) | (i4972 ^ 13));
                        int i5012 = (i4952 ^ 13) | (i4952 & 13);
                        int i5022 = ~((i5012 & i) | (i5012 ^ i));
                        int i5032 = (((i5002 & i5022) | (i5002 ^ i5022)) * (-519)) + i4992;
                        int i5042 = ~(i | 13);
                        int i5052 = (((i4952 & i5042) | (i4952 ^ i5042)) * 519) + i5032;
                        char c192 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int indexOf102 = TextUtils.indexOf("", "", 0);
                        int i5062 = (indexOf102 ^ 1755) + ((indexOf102 & 1755) << 1);
                        Object[] objArr1162 = new Object[1];
                        b(c192, i5052, i5062, objArr1162);
                        String str462 = (String) objArr1162[0];
                        int i5072 = -Color.green(0);
                        int i5082 = ((i5072 | 5) << 1) - (i5072 ^ 5);
                        int i5092 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int a152 = m2.a();
                        int i5102 = i5092 * 980;
                        int i5112 = ((i5102 | (-3189258)) << 1) - (i5102 ^ (-3189258));
                        int i5122 = ~a152;
                        int i5132 = (~(((-3262) & i5122) | ((-3262) ^ i5122))) * 979;
                        int i5142 = (i5112 & i5132) + (i5132 | i5112);
                        int i5152 = ((i5092 ^ a152) | (i5092 & a152)) * (-979);
                        int i5162 = (i5142 ^ i5152) + ((i5152 & i5142) << 1);
                        int i5172 = ~((a152 & (-3262)) | ((-3262) ^ a152));
                        int i5182 = ~((i5092 & i5122) | (i5122 ^ i5092));
                        int i5192 = ((i5182 & i5172) | (i5172 ^ i5182)) * 979;
                        int defaultSize42 = View.getDefaultSize(0, 0);
                        int i5202 = ((defaultSize42 | 1768) << 1) - (defaultSize42 ^ 1768);
                        Object[] objArr1172 = new Object[1];
                        b((char) (((i5162 | i5192) << 1) - (i5192 ^ i5162)), i5082, i5202, objArr1172);
                        String[] strArr142 = {str462, (String) objArr1172[0]};
                        Object[] objArr1182 = new Object[1];
                        b((char) (TextUtils.lastIndexOf("", '0', 0) + 1), TextUtils.getTrimmedLength("") + 15, View.MeasureSpec.getMode(0) + 1773, objArr1182);
                        String str472 = (String) objArr1182[0];
                        int scrollBarSize5 = ViewConfiguration.getScrollBarSize() >> 8;
                        int a162 = m2.a();
                        int i5212 = ~scrollBarSize5;
                        int i5222 = ((~((i5212 ^ (-20)) | (i5212 & (-20)))) * 210) + ((scrollBarSize5 * (-209)) - 3971);
                        int i5232 = ~a162;
                        int i5242 = ~(((-20) ^ i5232) | ((-20) & i5232));
                        int i5252 = ~((i5212 ^ a162) | (i5212 & a162));
                        int i5262 = -(-(((i5242 & i5252) | (i5242 ^ i5252)) * 210));
                        int i5272 = i5232 | i5212;
                        int i5282 = (scrollBarSize5 & (-20)) | ((-20) ^ scrollBarSize5);
                        int i5292 = (((i5222 ^ i5262) + ((i5222 & i5262) << 1)) - (~(-(-(((~((i5282 & a162) | (i5282 ^ a162))) | (~((i5272 & 19) | (i5272 ^ 19)))) * 210))))) - 1;
                        char c202 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int i5302 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1));
                        int i5312 = (i5302 & 1788) + (i5302 | 1788);
                        Object[] objArr1192 = new Object[1];
                        b(c202, i5292, i5312, objArr1192);
                        String str482 = (String) objArr1192[0];
                        int indexOf112 = 13 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        char indexOf122 = (char) TextUtils.indexOf("", "", 0, 0);
                        int blue22 = Color.blue(0);
                        int i5322 = ((blue22 | 1807) << 1) - (blue22 ^ 1807);
                        Object[] objArr1202 = new Object[1];
                        b(indexOf122, indexOf112, i5322, objArr1202);
                        String[] strArr152 = {str472, str482, (String) objArr1202[0]};
                        int i5332 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int i5342 = ((i5332 | 20) << 1) - (i5332 ^ 20);
                        char keyRepeatDelay22 = (char) (62725 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                        int i5352 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int i5362 = (i5352 & 1821) + (i5352 | 1821);
                        Object[] objArr1212 = new Object[1];
                        b(keyRepeatDelay22, i5342, i5362, objArr1212);
                        String str492 = (String) objArr1212[0];
                        int myTid22 = Process.myTid() >> 22;
                        int i5372 = (myTid22 ^ 10) + ((myTid22 & 10) << 1);
                        int i5382 = -(ViewConfiguration.getScrollBarSize() >> 8);
                        Object[] objArr1222 = new Object[1];
                        b((char) ((i5382 & 54762) + (i5382 | 54762)), i5372, (KeyEvent.getMaxKeyCode() >> 16) + 1842, objArr1222);
                        String[] strArr162 = {str492, (String) objArr1222[0]};
                        int i5392 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        Object[] objArr1232 = new Object[1];
                        b((char) ((-2) - (~(-TextUtils.lastIndexOf("", '0', 0, 0)))), (i5392 & 10) + (i5392 | 10), 1852 - TextUtils.getOffsetAfter("", 0), objArr1232);
                        String str502 = (String) objArr1232[0];
                        int i5402 = 5 - (~Color.red(0));
                        char argb42 = (char) Color.argb(0, 0, 0, 0);
                        int packedPositionChild22 = ExpandableListView.getPackedPositionChild(0L);
                        int i5412 = (packedPositionChild22 ^ 590) + ((packedPositionChild22 & 590) << 1);
                        Object[] objArr1242 = new Object[1];
                        b(argb42, i5402, i5412, objArr1242);
                        String[] strArr172 = {str502, (String) objArr1242[0]};
                        int i5422 = 27 - (~(-(ViewConfiguration.getEdgeSlop() >> 16)));
                        char packedPositionGroup32 = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int i5432 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int i5442 = ((i5432 | 1864) << 1) - (i5432 ^ 1864);
                        Object[] objArr1252 = new Object[1];
                        b(packedPositionGroup32, i5422, i5442, objArr1252);
                        String str512 = (String) objArr1252[0];
                        Object[] objArr1262 = new Object[1];
                        b((char) (54763 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 10 - (~TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1842, objArr1262);
                        strArr4 = new String[][]{strArr142, strArr152, strArr162, strArr172, new String[]{str512, (String) objArr1262[0]}};
                        i28 = 0;
                        loop5: while (true) {
                            if (i28 < 5) {
                            }
                            String[][] strArr202 = strArr4;
                            int i5512 = i28;
                            int i5522 = (i5512 & (-81)) + (i5512 | (-81));
                            i28 = ((i5522 | 82) << i31) - (i5522 ^ 82);
                            strArr4 = strArr202;
                        }
                        if (i29 == i) {
                        }
                    }
                }
                i20 = i;
                if (i20 == i) {
                }
            }
        }
        int i841 = d;
        i18 = ((i841 & 63) + (i841 | 63)) % 128;
        c = i18;
        i19 = i;
        if (i19 == i) {
        }
    }

    public static String a(byte b2) {
        int i = b2 + 115;
        byte[] bArr = new byte[1];
        if (h == null) {
            i = b2 + 119;
        }
        bArr[0] = (byte) i;
        return new String(bArr, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(char c2, int i, int i2, Object[] objArr) {
        Throwable cause;
        cm cmVar = new cm();
        long[] jArr = new long[i];
        cmVar.component5 = 0;
        while (true) {
            int i3 = cmVar.component5;
            if (i3 >= i) {
                break;
            }
            f = (g + 69) % 128;
            try {
                Object[] objArr2 = {Integer.valueOf(a[i2 + i3])};
                Object f2 = rV4669.f(1480709268);
                Class cls = Integer.TYPE;
                if (f2 == null) {
                    f2 = rV4669.g(6046 - View.resolveSize(0, 0), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 52 - ExpandableListView.getPackedPositionType(0L), -773518864, a((byte) 0), new Class[]{cls});
                }
                Long l = (Long) ((Method) f2).invoke(null, objArr2);
                l.getClass();
                Object[] objArr3 = {l, Long.valueOf(i3), Long.valueOf(b), Integer.valueOf(c2)};
                Object f3 = rV4669.f(-1745711337);
                if (f3 == null) {
                    int keyCodeFromString = KeyEvent.keyCodeFromString("") + 3109;
                    char defaultSize = (char) (View.getDefaultSize(0, 0) + 11542);
                    int i4 = 52 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    String a2 = a((byte) 2);
                    Class cls2 = Long.TYPE;
                    f3 = rV4669.g(keyCodeFromString, defaultSize, i4, 508973683, a2, new Class[]{cls2, cls2, cls2, cls});
                }
                jArr[i3] = ((Long) ((Method) f3).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cmVar, cmVar};
                Object f4 = rV4669.f(2020003388);
                if (f4 == null) {
                    f4 = rV4669.g(View.MeasureSpec.getMode(0) + 4736, (char) (10124 - View.MeasureSpec.makeMeasureSpec(0, 0)), 51 - Process.getGidForName(""), -238939304, a((byte) 3), new Class[]{Object.class, Object.class});
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
        g = (f + 1) % 128;
        while (true) {
            int i5 = cmVar.component5;
            if (i5 < i) {
                cArr[i5] = (char) jArr[i5];
                Object[] objArr5 = {cmVar, cmVar};
                Object f5 = rV4669.f(2020003388);
                if (f5 == null) {
                    f5 = rV4669.g(4736 - TextUtils.getOffsetBefore("", 0), (char) (ExpandableListView.getPackedPositionGroup(0L) + 10124), Color.rgb(0, 0, 0) + 16777268, -238939304, a((byte) 3), new Class[]{Object.class, Object.class});
                }
                ((Method) f5).invoke(null, objArr5);
            } else {
                objArr[0] = new String(cArr);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(byte b2, byte b3, byte b4, Object[] objArr) {
        int i;
        int i2;
        int i3 = b4 + 4;
        int i4 = 4 - (b3 * 3);
        int i5 = b2 + 97;
        byte[] bArr = new byte[i4];
        byte[] bArr2 = e;
        if (bArr2 == null) {
            int i6 = i4;
            int i7 = i3;
            i2 = 0;
            int i8 = i3 + i6 + 6;
            i3 = i7;
            i5 = i8;
            i = i2;
            int i9 = i3 + 1;
            i2 = i + 1;
            bArr[i] = (byte) i5;
            if (i2 == i4) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            i6 = bArr2[i9];
            i3 = i5;
            i7 = i9;
            int i82 = i3 + i6 + 6;
            i3 = i7;
            i5 = i82;
            i = i2;
            int i92 = i3 + 1;
            i2 = i + 1;
            bArr[i] = (byte) i5;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            int i922 = i3 + 1;
            i2 = i + 1;
            bArr[i] = (byte) i5;
            if (i2 == i4) {
            }
        }
    }

    public static final boolean component5(D8871<?, ?> d8871) {
        int i = d + 13;
        int i2 = i % 128;
        c = i2;
        if (i % 2 == 0) {
            boolean z = d8871 instanceof vD14832N6715;
            d = (i2 + 61) % 128;
            return z;
        }
        throw null;
    }

    public static void d() {
        e = new byte[]{122, -2, -85, 4, 6, -5, 3};
    }

    public static void e() {
        h = new byte[]{101, -78, -82, -26};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <V, E> D8871<V, E> D8871(D8871<? extends D8871<? extends V, ? extends E>, ? extends E> d8871) {
        if (d8871 instanceof vD14832N6715) {
            int i = c + 63;
            d = i % 128;
            if (i % 2 == 0) {
                int i2 = 49 / 0;
                return (D8871) ((vD14832N6715) d8871).component5;
            }
            return (D8871) ((vD14832N6715) d8871).component5;
        }
        if (!(d8871 instanceof setPivotYN16904)) {
            dmk.a();
            return null;
        }
        int i3 = d + 47;
        c = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 31 / 0;
        }
        return d8871;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if ((r2 instanceof defpackage.r5g) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if ((r2 instanceof defpackage.r5g) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        r2 = kotlin.Result.m883exceptionOrNullimpl(r2);
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003a, code lost:
    
        return new com.fingerprintjs.android.fpjs_pro_internal.setPivotYN16904(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        kotlin.ResultKt.a(r2);
        r0 = new com.fingerprintjs.android.fpjs_pro_internal.vD14832N6715(r2);
        com.fingerprintjs.android.fpjs_pro_internal.bf.c = (com.fingerprintjs.android.fpjs_pro_internal.bf.d + 113) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> D8871<T, Throwable> D8871(Object obj) {
        int i = c + 27;
        d = i % 128;
        if (i % 2 == 0) {
            Result.Companion companion = Result.INSTANCE;
            int i2 = 50 / 0;
        } else {
            Result.Companion companion2 = Result.INSTANCE;
        }
    }
}
