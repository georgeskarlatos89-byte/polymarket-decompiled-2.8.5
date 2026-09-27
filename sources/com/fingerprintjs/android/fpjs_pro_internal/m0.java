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
import java.util.Scanner;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class m0 {
    public static int c;
    public final bc a;
    public final Context b;

    public m0(bc bcVar, Context context) {
        this.a = bcVar;
        this.b = context;
    }

    public final D8871 a() {
        try {
            Object[] objArr = {0L, new Function0<String>() { // from class: com.fingerprintjs.android.fpjs_pro_internal.P29109$2
                public static final char[] i;
                public static final long j;
                public static int k;
                public static int l;
                public static final byte[] m = null;
                public static int n;
                public static int o;
                public static final byte[] p = null;

                static {
                    f();
                    n = 0;
                    o = 1;
                    e();
                    k = 0;
                    l = 1;
                    char[] cArr = new char[1959];
                    ByteBuffer.wrap("%Ä£Ù)\"¶\u009f<\u009cº\"\u0003\u0080\u0089Ý\u0017?\u009c\u008b\u001aÞà*i\u008b÷ê}>ú\u0085@ïÎ/W\u0082Ýú[  º®ü4!½\u009a;î\u00812%Ä£Ù)\"¶\u009f<\u009cº\"\u0003\u0080\u0089Ý\u0017?\u009c\u008b\u001aÞà*i\u008b÷ê}/ú\u0088@ûÎ8W¸Ýí[# \u0097®ì4%½\u009f%Ä£Ù)\"¶\u009f<\u009cº\"\u0003\u0080\u0089Ý\u0017?\u009c\u008b\u001aÞà*i\u008b÷ê},ú\u0098@åÎ>s\u0012õ\u0018\u007fèàLjJìþUVß\u0003AøÊWL\u0004¶ ?R¡\f+å¬S\u0016;\u0098â\u0001B\u008b7\rÚvQø8bóëYm>×óXV%Ä£Ø)3¶\u008a<\u009cº!\u0003\u0088\u0089\u009f\u0017+\u009c\u009f\u001aØà)%Ä£Ø)3¶\u008a<\u009cº6\u0003\u0086\u0089Ü\u0017u\u009c\u009d\u001aÅà6i\u0093%Ä£Î)#¶\u008a<Òº7\u0003\u008b\u0089\u009e\u0017\t\u009c«\u001aúà6i\u0095÷Ð}\u001bú\u0080@ÿÎ<%Ä£Ù)&¶\u009d<Òºj\u0003Á\u0089Ò\u0017+\u009c\u0098\u001aÞà7i\u0085÷Ú%\u0099£Ò)i¶\u008b<Üº*\u0003\u009b\u0089\u009f\u0017)\u009c\u0088\u001aÓà+i\u008c÷Ü};ú¾@åÎ8W\u0093ÝÖ[7 \u008b®ü4`#\u0005¥N/õ°\u0017:@¼¶\u0005\u0007\u008f\u0003\u0011µ\u009a\u0014\u001cOæ·o\u0010ñ@{§ü\"FyÈ¤Q\u000fÛJ]«&\u0017¨`2ÿ\u009dN\u001bD\u0091´\u000e\u0010\u0084M\u0002ª»\b1\u0014¯½$\u000e¢_XüÑ\u0005OVÅ·B\u0005øcvùï\u001eel%\u0089£Ô) ¶\u0087<Üº=ö$po¾¯8¥²U-ñ§¬!K\u0098é\u0012õ\u008cR\u0007ï\u0081²{\u001dòæl»æYaÿÛ¶U{Ì¡F\u008cÀ]»ã5\u0091¯\u0017&ó \u0089\u001aR\u0095æ\u000f\u009a\u0089Q\u0000øÂ\u0011D\u001bÎëQOÛ\u0012]õäWnKðì{Qý\f\u0007£\u008eX\u0010\u0005\u009aç\u001dA§\b)Å°\u001f:,¼ôÇ_I*llêf`\u0096ÿ2uoó\u0088J*À6^\u009fÕ,S}©Þ '¾t4\u0095³'\tF\u0087\u0098\u001e:\u0094w\u0012¶i=çU}\u0096ô#r\u000bÈ\u008cG>%Ä£Ù)\"¶\u009f<\u009cº+\u0003\u008a\u0089Ü\u0017.\u009c\u008a\u001aÂà<i\u0090÷ÁòTt\u001fþ¤aFë\u000bmáÔN^\u0018À¸KHÍ\u00157ç¾Z%\u0085£Ø)&¶\u009a<Öºk\u0003\u0081\u0089Ô\u0017/4l²e8\u009d§.-x«Â\u0012!\u0098p\u0006\u009f\u008d \u000blñ\u0088x8æil\u0092ë$QP%\u0085£Ø)*¶\u009c<Àº#%\u0099£Ò)i¶\u0099<Áº*\u0003\u008b\u0089Ä\u00178\u009c\u0099\u001a\u0099à4i\u0082÷Û}*ú\u0087@êÎ>W\u0093Ýü[! \u0080®ý\u0092\b\u0014\\\u009e\u00ad\u0001\u0014ê»løæ\u0015yºóúu\u0016Ì»F¿Ø\bS´Õä/W¦¡8ñ²Q5¥\u008fÎ\u0001\u001f\u0098²\u0012Î\u0094]ï¢aßû\u0004rõôËN\u0016Á²[ÆÝ*T¸®Ñ ~»\u0082=Õ·l\u000e½\u0080Á\u001aj\u009d£\u0017Þi\u007f%\u009b£Ø)5¶\u009a<Úº6\u0003\u009b\u0089\u009f\u0017(\u009c\u0094\u001aÄàwi\u0081÷Ñ}qú\u0085@îÎ?W\u0092Ýî[} \u0082®ÿ4$½Õ;ë\u00816\u000e\u0092\u0094æ\u0012\n\u009b\u0098añï^t¢òñxLÁ\u009dOáÕ@R\u0083@VÆ\u0015LøÓWY\u0017ßûfVìRråùY\u007f\t\u0085º\fL\u0092\u001c\u0018¼\u009fH%#«ò2_¸#>°EZË-Q²ØU^1äó%\u009b£Ø)5¶\u009a<Úº6\u0003\u009b\u0089\u009f\u0017(\u009c\u0094\u001aÄàwi\u0081÷Ñ}qú\u0085@îÎ?W\u0092Ýî[} \u0097®à4\u007f½\u0097;ì\u00814\u0013\u009c\u0095ß\u001f2\u0080\u009d\nÝ\u008c15\u009c¿\u0098!/ª\u0093,ÃÖp_\u0086ÁÖKvÌ\u0082véø8a\u0095ëémz\u0016\u0090\u0098ç\u0002x\u008b\u0091\ré·3%\u009b£Ø)5¶\u009a<Úº6\u0003\u009b\u0089\u009f\u0017(\u009c\u0094\u001aÄàwi\u0081÷Ñ}qú\u0085@îÎ?W\u0092Ýî[} \u0097®à4\u007f½\u0096;ã\u00814û\u0016}T÷£h\u001aâKd¨\u0085 \u0003©\u0089Q\u0016â\u009c´\u001a\u000e£æ)º·[<üº¿@XÉôÍ\u001cK^Á©^\u0010ÔUR±ë\u000baCÿ®NIÈ=BÌÝuW;ÑÏh~â=|Ñ÷f%\u009e£Ó),¶\u0087<Üº2\u0003\u0081%\u0088£Õ)5¶\u0086<Þº,\u0003\u009a\u0089Ü%\u0099£Ò)i¶\u0099<Áº*\u0003\u008b\u0089Ä\u00178\u009c\u0099\u001a\u0099à=i\u0086÷Ã}6ú\u0082@îñww5ýÂb{èan\u0099×uM\u0015ËAA°Þ\u0015TXÒµk\u0015_dÙ0SÁÌdF)ÀÄydó\u0006mËæ=`i«\u008a-Þ§/8\u008a²Ç4*\u008d\u008a\u0007è\u0099%\u0012Ó\u0094\u0087n\u0000çÓy\u0087÷\u0010q[ûàd\u0010îHh£Ñ\u0002[MÅ±N\u0010È\u00102½»\u0005%X¯³(\u0004%\u0098£Ù),%\u008e£Ð)2¶\u0085<Òº1\u0003\u0080\u0089Ã%ª£Í)7¶É<áº0\u0003\u0081\u0089Å\u00172\u009c\u0080\u001aÒàyi\u0085÷Ú}-úÁ@ÈÎ5W\u0095Ýæ[> \u0080p_ö&|Öãni)ïÙV~ÜdBýÉ\\O\tµ\u008c<t¢5(Ã¯x\u0015\n\u009b\u0088\u0002t\u0088\u0013\u000eÔu0û\u0002a\u009cè8%ª£Ó)#¶\u009b<Üº,\u0003\u008b\u0089\u0091\u0017\b\u009c©\u001aüàyi\u0081÷À}6ú\u008d@ÿÎ}W\u0081Ýæ[! Å®÷4i½Í;Ò\u0081a\u000eÍ%\u0099£Ò)i¶\u0081<Òº7\u0003\u008b\u0089Æ\u0017:\u009c\u009f\u001aÒ¥g#9©À6f¼>:Ç\u0083w\t2%\u009d£ß)(¶\u0091<\u008bºs8\u0006¾C4¶«\u0015!D§¯Ä~B5È\u008eW~Ý&[Íâlh#öß}~û~\u0001Ü\u0088v\u00163\u009cÖ\u001bbF\u0084ÀÏJtÕ\u009f_ËÙ*`\u009cêÉt*ÿÞyÛ\u0083!\n\u0093\u0094Ý%Ú%\u0099£Ò)i¶\u009a<Öº&\u0003\u009a\u0089Ã\u0017>%Ûdêâ¡h\u001a÷ø}µû_BðÈ¦V\u0006Ýî[¶¡E(ô¶³<O»æ%\u008d£È)+¶\u0085<ìº=\u0003×\u0089\u0087%\u0099£Ò)i¶\u008b<Æº,\u0003\u0083\u0089Õ\u0017u\u009c\u008b\u001aÞà7i\u0084÷Ð}-ú\u0091@ùÎ4W\u0089ÝýáÛg\u008fí~rÛø\u0096~{ÇÛMÉÓ\u007fXÞÞ\u008b$!\u00adÓ3\u0087¹f>Ó\u0084®\nc\u0093Ó¶\u009b0Ïº>%\u009b¯Ö);\u0090\u009b\u001aù\u00844\u000fÂ\u0089\u0096saú\u0087dÆî#i©Óä]rÄÆN±È#³\u0097=ö§#.\u009e¨ó\u0012#\u009d±\u0007ì\u0081z\bÞn\u001eèJb»ý\u001ewSñ¾H\u001eÂ\f\\®×\u0010QJ«¬\"\u001d¼B6\u0092±\u0000\u000b}\u0085¤\u001cZ\u0096|\u0010¤k\u0019åx\u007f±ö\u0000p|%\u008c£Ø))¶\u008c<Áº,\u0003\u008c\u0089\u009e\u0017-\u009c\u008f\u001aØà!iÛ÷\u0083}/úÎ@ýÎ?W\u0088Ýñ[k Ó®ÿpnö0|Êãli=ïÂV\"Ü BÝÉdO\nµÜ<q¢?(Ò¯m\u0015\f\u009bà\u0002}\u0088S\u000e\u0087u(û\naÖèwn\nÔÇ[rÁ\u0002GèÎe4[ºÿ\"Ç¤\u008c.7±Õ;\u0082½t\u0004Å\u008e\u0083\u0010j\u009bÒ\u001d\u008dçbnÏ\u0002a\u0084*\u000e\u0091\u0091s\u001b$\u009dÒ$c® 0Î»t=(ÇÄN5Ð/ZÒÝpg\u001féÁp1ú\u0017|Â\u0007s\u0089\u0010\u0013Ì\u009aq\u001c\u0005¦Ý)h³\u00155ÙºS<*¶Ú)b£%%Õ\u009cr\u0016e\u0088Ú\u0003,\u0085x%\u0099£Ò)i¶\u008b<Æº,\u0003\u0083\u0089Õ\u0017u\u009c\u0089\u001aÞà*i\u0093÷Ù}>ú\u0098@¥Î4W\u0083%\u009f£Ø)4¶\u009d<\u009e%\u0082£Ó).¶\u009d<\u009dº6\u0003\u0099\u0089Ò\u0017u\u009c\u009c\u001aÒà4i\u0096÷\u0098}/ú\u0093@äÎ-W\u00948Ý¾\u009f4m«Û!Ú§j\u001eß\u0094Ø\nq\u0081Ë\u0007\u0099ýptÏê\u0097`açÕ%\u009a£Ø)*¶\u009c<\u009dº6\u0003\u0089\u0089\u009f\u0017=\u009c\u008c\u001aÜà<i¼÷Ö}>ú\u008c@îÎ/W\u0086%\u009a£Ø)*¶\u009c<\u009dº6\u0003\u0089\u0089\u009f\u00177\u009c\u008e\u001aÓà\u0006i\u0087÷Ð}1ú\u0092@âÎ)W\u009eÖ\u009cP×ÚlE\u0087ÏÓI2ð\u0084zÑä2oÆéÓ\u00132\u009a\u0082\u0004Â\u008e5\t\u008d³ê=v¤\u0093.é¨;Ó\u0095]îîqh:â\u0081}c÷4qÂÈsBwÜÂW`Ñ2+Ä¢%<<¶Á1m\u008b<\u0005Û\u009cn\u0016\f\u0090Þ\u000b\u0012\u008dY\u0007â\u0098\r\u0012\\\u0094£-J§X9¥²\u000f4PÎ¶GFÙXS½Ô\u0004ngà³y\u001eóruª\u000e\u0007\u0080j\u001a®%\u0099£Ò)i¶\u0099<Áº*\u0003\u008b\u0089Ä\u00178\u009c\u0099\u001a\u0099à;i\u0096÷Ü}3ú\u0085@¥Î;W\u008eÝç[4 \u0080®ý4!½\u0089;ä\u00819\u000e\u008dQé×¢]\u0019ÂêHºÎFwëý¤cFè³n¥\u0094\\\u001dú\u0083©\tK\u008e¿4\u009dºD#ù©\u009e/FTçÚ\u008f@SÉâO\u0093õS%\u0099£Ò)i¶\u009a<Êº6\u0003\u009b\u0089Ô\u00176\u009c²\u001aÒà!i\u0097÷\u009b}=ú\u0094@âÎ1W\u0083Ý§[5 \u008c®á46½\u009e;ÿ\u0081'\u000e\u008b\u0094ê\u0012;\u009b\u008b%\u0099£Ò)i¶\u009f<Öº+\u0003\u008b\u0089Þ\u0017)\u009cÃ\u001aÕà,i\u008a÷Ù};úÏ@íÎ4W\u0089Ýî[6 \u0097®ÿ4#½\u0092;ã\u0081#D}Â6H\u008d×{]2ÛÏboè:vÍýV{7\u0081Ñ\bl\u0096<\u001c\u0095\u009bg!\u001a¯Ð6o¼\t:\u0099AgÏ\u0002UÛÜxZ\fàÁomõ\u0015sØúu\u0000\u0011%Ñç\u0098a\u0085ë~tÃþÀxhÁÖK\u0080Õr^îØ\u009b\"l«Ï5\u008c%Ä£Ù)\"¶\u009f<\u009cº6\u0003\u0080\u0089Ò\u00170\u009c\u0088\u001aÃàvi\u0081÷Ô},ú\u0084@éÎ<W\u0089Ýí[\f \u0082®ê4?½\u0082;é.\"¨?\"Ä½y7z±Ð\bf\u00824\u001cÖ\u0097n\u0011%ë\u0090bbü6v×ñ~K\tÛÜ]Á×:H\u0087Â\u0084D.ý\u0098wÊé(b\u0090äÛ\u001en\u0097\u008a\tÈ\u0083*\u0004\u008c¾÷\u0083\u001d\u0005\u0017\u008fç\u0010C\u009aE\u001cí¥S/\u0005±÷:k¼\u001aFòÏ[Q\u000fÛã{iýcw\u0093è7bjä\u008d]/×3I\u009aÂ)Dx¾Û7\"©q#\u0090¤/\u001ey\u0090\u009d\t+\u0083H\u0005\u0092~'ðAj£ã2eEß\u0098P!ÊIL§Å#?I±ë*%¬\u0004&÷\u009f1%Ä£Ù)\"¶\u009f<\u009cº'\u0003\u009c\u0089Å\u0017\u0004\u009c\u008a\u001aÇà*;4½)7Ò¨o\"l¤×\u001dl\u00975\tô\u0082i\u0004.þÄwv`1æ,l×ójyiÿÃFuÌ'RÅÙ}_6¥\u0083,t²38Þ¿r\u0005\u0011\u008bÄ\u0012v\u0098\u0019\u001eÔet |&v¬\u00863\"¹\u007f?\u0098\u0086:\f&\u0092\u008f\u0019<\u009fmeÎì7rdø\u0085\u007f;Å@K\u0091Ò9X^Þ\u0087¥9+R±\u009b8\u001c¾_\u0004\u0081\u008b(\u0011\u0015\u0097\u009e\u001e(%Ä£Ù)\"¶\u009f<\u009cº'\u0003\u009c\u0089Å\u0017:\u009c\u008e\u001aÔà<%Ä£Ù)\"¶\u009f<\u009cº'\u0003\u009c\u0089Å\u0017<\u009c\u0094\u001aÅà6%Ä£Ù)\"¶\u009f<\u009cº'\u0003\u009c\u0089Å\u00176\u009c\u0088\u001aÐà7%Ä£Ù)\"¶\u009f<\u009cº'\u0003\u009c\u0089Å\u00174\u009c\u009f\u001aÞà<%Ä£Ù)\"¶\u009f<\u009cº'\u0003\u009c\u0089Å\u0017-\u009c\u0080\u001aÄà>\u00972\u0011/\u009bÔ\u0004i\u008ej\bÑ±j;3¥Ý.|¨ RÆÛeE \u008a\u0090\f\u008d\u0086v\u0019Ë\u0093È\u0015s¬È&\u0091¸P3Ðµ\u008eOhgµá¨kWôì~£ø\u001bAúË¯U]ÞòXª¢G+óµ ?]¸¿\u0002Ô\u008cT\u0015ô\u009f×\u0019@bçì\u008avK¹\u0004?\u0010µé*] \\&ò\u009fF\u0015\u001f\u008bÿ\u0000B\u0086\u0000|êõ\fk7áìfUÜ\u0018RõËFA;Çö¼A2\t¨þ!W§)\u001dò\u0092K'Ò¡Û+#´\u0090>Æ¸|\u0001\u0090\u008bÈ\u0015=\u009e\u0094\u0018Óâ;k\u0086%Û£Û)!¶É<\u0089%Ä£Í)5¶\u0086<Ðºj\u0003\u009c\u0089Ô\u00177\u009c\u008b\u001a\u0098à4i\u0082÷Å},GWÁ\u0014KýÔ^^\u0004ØñaWëDuçþYx\u0000\u0082æ\u000b^\u0095\u0007\u001f÷\u0098R\"~¬õ5SI=ÏnE\u009fÚ\u0014PEÖºo\u0006åT{\u0083ð$vy\u008cÍ\u0005*\u009b`LyÊe@\u008eß7U!Ó\u0095j7àh~\u008fõ1sU\u0089\u0087\u00001\u009el\u0014\u0087\u0093?)E§Î>\"´Y2\u0082\u0004Ê\u0082\u0092\bq\u0097Ï\u001d\u0083\u009br\"Í¨\u00916s½Ý%À£Ü)7¶\u008e<\u0098º,\u0003\u0084\u0089À\u00171\u009c\u009d\u001aÀ\u001cê\u009a÷\u0010\b\u008f³\u0005ü\u0083D:¥°ð.\u0002¥\u00ad#õÙ\u0018P¬ÎÿD\u0002Ãày\u008b÷\u0017n¹ä\u0088b\u001c\u0019»\u0097Ñ\r\f\u0084û\u0002Û¸\u00147»%Ä£Í)5¶\u0086<Ðºj\u0003\u008c\u0089Á\u0017.\u009c\u0084\u001aÙà?i\u008c%¬£Ò)+¶\u008d<Õº,\u0003\u009c\u0089ÙéÞoÃå<z\u0087ðÈvpÏ\u0098EÂÛ2P\u0094Ö\u0082,3¥\u008b;À±#6\u0092\u008cý\u0002\"\u009b\u008e\u0011¼\u0097*ì\u008abçødqÑ÷¸M.Â\u008cXôÞaW\u0088\u00adò#R¸\u0095>ò´E\r\u0080\u0083í\u0019A\u009eÅ\u0014ìjRã\u0080yöÿPt\u0082Êà".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1959);
                    i = cArr;
                    j = 1009202158393271229L;
                }

                {
                    super(0);
                }

                public static String a(byte b) {
                    int i2 = b + 115;
                    byte[] bArr = new byte[1];
                    if (p == null) {
                        i2 = b + 114;
                    }
                    bArr[0] = (byte) i2;
                    return new String(bArr, 0);
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x0168  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0169  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void b(char c2, int i2, int i3, Object[] objArr2) {
                    Throwable cause;
                    int i4;
                    cm cmVar = new cm();
                    long[] jArr = new long[i2];
                    cmVar.component5 = 0;
                    while (true) {
                        int i5 = cmVar.component5;
                        if (i5 >= i2) {
                            break;
                        }
                        n = (o + 101) % 128;
                        try {
                            Object[] objArr3 = {Integer.valueOf(i[i3 + i5])};
                            Object f = rV4669.f(1480709268);
                            Class cls = Integer.TYPE;
                            if (f == null) {
                                i4 = 2020003388;
                                f = rV4669.g(6046 - (Process.myTid() >> 22), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 51 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -773518864, a((byte) 0), new Class[]{cls});
                            } else {
                                i4 = 2020003388;
                            }
                            Long l2 = (Long) ((Method) f).invoke(null, objArr3);
                            l2.getClass();
                            Object[] objArr4 = {l2, Long.valueOf(i5), Long.valueOf(j), Integer.valueOf(c2)};
                            Object f2 = rV4669.f(-1745711337);
                            if (f2 == null) {
                                int rgb = (-16774107) - Color.rgb(0, 0, 0);
                                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 11543);
                                int lastIndexOf = TextUtils.lastIndexOf("", '0') + 53;
                                String a = a((byte) 2);
                                Class cls2 = Long.TYPE;
                                f2 = rV4669.g(rgb, modifierMetaStateMask, lastIndexOf, 508973683, a, new Class[]{cls2, cls2, cls2, cls});
                            }
                            jArr[i5] = ((Long) ((Method) f2).invoke(null, objArr4)).longValue();
                            Object[] objArr5 = {cmVar, cmVar};
                            Object f3 = rV4669.f(i4);
                            if (f3 == null) {
                                f3 = rV4669.g(View.MeasureSpec.makeMeasureSpec(0, 0) + 4736, (char) (10124 - TextUtils.indexOf("", "")), (ViewConfiguration.getPressedStateDuration() >> 16) + 52, -238939304, a((byte) 3), new Class[]{Object.class, Object.class});
                            }
                            ((Method) f3).invoke(null, objArr5);
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
                    char[] cArr = new char[i2];
                    cmVar.component5 = 0;
                    while (true) {
                        int i6 = cmVar.component5;
                        if (i6 < i2) {
                            o = (n + 19) % 128;
                            cArr[i6] = (char) jArr[i6];
                            Object[] objArr6 = {cmVar, cmVar};
                            Object f4 = rV4669.f(2020003388);
                            if (f4 == null) {
                                f4 = rV4669.g(4735 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (10123 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getLongPressTimeout() >> 16) + 52, -238939304, a((byte) 3), new Class[]{Object.class, Object.class});
                            }
                            ((Method) f4).invoke(null, objArr6);
                        } else {
                            objArr2[0] = new String(cArr);
                            return;
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void c(int i2, int i3, short s, Object[] objArr2) {
                    int i4;
                    int i5 = i2 * 3;
                    int i6 = s + 4;
                    int i7 = i3 + 97;
                    byte[] bArr = new byte[i5 + 1];
                    int i8 = -1;
                    byte[] bArr2 = m;
                    if (bArr2 == null) {
                        int i9 = i5;
                        i4 = i6;
                        i6 = i6 + (-i9) + 6;
                        i8++;
                        i4++;
                        bArr[i8] = (byte) i6;
                        if (i8 == i5) {
                            objArr2[0] = new String(bArr, 0);
                            return;
                        }
                        i9 = bArr2[i4];
                        i6 = i6 + (-i9) + 6;
                        i8++;
                        i4++;
                        bArr[i8] = (byte) i6;
                        if (i8 == i5) {
                        }
                    } else {
                        i6 = i7;
                        i4 = i6;
                        i8++;
                        i4++;
                        bArr[i8] = (byte) i6;
                        if (i8 == i5) {
                        }
                    }
                }

                public static void e() {
                    m = new byte[]{90, 113, 55, 5, -6, 5, -3};
                }

                public static void f() {
                    p = new byte[]{88, 37, -69, 48};
                }

                /* JADX WARN: Code restructure failed: missing block: B:146:0x12f6, code lost:
                
                    if (r2 == r80) goto L195;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:147:0x12f8, code lost:
                
                    com.fingerprintjs.android.fpjs_pro_internal.P29109$2.l = (com.fingerprintjs.android.fpjs_pro_internal.P29109$2.k + 77) % 128;
                    r3 = new java.lang.Object[5];
                    r4 = new int[1];
                    r3[0] = r4;
                    r5 = new int[1];
                    r3[1] = r5;
                    r3[r28] = new int[1];
                    r5[0] = r80;
                    r4[0] = r2;
                    r3[4] = null;
                    r3[2] = null;
                    r0 = android.os.Process.myTid();
                    r2 = ~r0;
                    r4 = (~((-619327392) | r2)) | 73403664;
                    r0 = -(-defpackage.k84.a(~(r2 | (-597320400)), 713, ((~(r0 | (-51396673))) * 1426) + (((r4 | r0) * (-713)) - 272236098), 16));
                    r2 = (r82 ^ r0) + ((r0 & r82) << 1);
                    r0 = (r2 << 13) ^ r2;
                    r1 = r0 >>> 17;
                    r0 = (r0 | r1) & (~(r0 & r1));
                    r1 = r0 << 5;
                    ((int[]) r3[r28])[0] = ((~r0) & r1) | ((~r1) & r0);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:148:0x1369, code lost:
                
                    return r3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:149:0x136a, code lost:
                
                    r2 = -android.view.KeyEvent.normalizeMetaState(0);
                    r5 = new java.lang.Object[1];
                    b((char) (4521 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1))), (r2 ^ 17) + ((r2 & 17) << 1), android.view.KeyEvent.keyCodeFromString("") + 349, r5);
                    r2 = (java.lang.String) r5[0];
                    r3 = -(-(android.view.ViewConfiguration.getEdgeSlop() >> 16));
                    r4 = (r3 & 6) + (r3 | 6);
                    r3 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
                    r10 = new java.lang.Object[1];
                    b((char) (((r3 | 56971) << 1) - (r3 ^ 56971)), r4, android.text.AndroidCharacter.getMirror('0') + 541, r10);
                    r3 = (java.lang.String) r10[0];
                    r4 = new java.io.File(r2);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:150:0x13cd, code lost:
                
                    if (r4.exists() == false) goto L211;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:151:0x13cf, code lost:
                
                    r2 = com.fingerprintjs.android.fpjs_pro_internal.P29109$2.l;
                    com.fingerprintjs.android.fpjs_pro_internal.P29109$2.k = (((r2 | 95) << 1) - (r2 ^ 95)) % 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:152:0x13df, code lost:
                
                    if (r4.isFile() == false) goto L211;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:154:0x13e1, code lost:
                
                    r2 = new java.util.Scanner(new java.io.FileInputStream(r4));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:155:0x13f1, code lost:
                
                    r4 = -android.graphics.Color.red(0);
                    r10 = (r4 * 989) - 1974;
                    r11 = (-3) | r6;
                    r11 = ~((r11 & r4) | (r11 ^ r4));
                    r12 = ~(((r4 ^ 2) | (r4 & 2)) | r80);
                    r11 = -(-(((r11 & r12) | (r11 ^ r12)) * 988));
                    r10 = ((r4 | (-3)) * (-988)) + (((r10 | r11) << 1) - (r10 ^ r11));
                    r11 = ~r4;
                    r11 = ~((r11 & (-3)) | (r11 ^ (-3)));
                    r12 = ~((-3) | r80);
                    r11 = (r11 & r12) | (r11 ^ r12);
                    r4 = ~(((r4 & r6) | (r6 ^ r4)) | 2);
                    r4 = (((r4 & r11) | (r11 ^ r4)) * 988) + r10;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:157:0x1435, code lost:
                
                    r10 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
                    r11 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                    r13 = (r11 ^ 229) + ((r11 & 229) << 1);
                    r11 = new java.lang.Object[1];
                    b((char) ((r10 ^ 54163) + ((r10 & 54163) << 1)), r4, r13, r11);
                    r2 = r2.useDelimiter((java.lang.String) r11[0]);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:158:0x1464, code lost:
                
                    if (r2.hasNext() == false) goto L204;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:159:0x1466, code lost:
                
                    r4 = r2.next();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:160:0x146c, code lost:
                
                    r2.close();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:161:0x1473, code lost:
                
                    if (r4.contains(r3) == false) goto L212;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:162:0x1475, code lost:
                
                    r2 = com.fingerprintjs.android.fpjs_pro_internal.P29109$2.k;
                    r3 = ((r2 | 79) << 1) - (r2 ^ 79);
                    com.fingerprintjs.android.fpjs_pro_internal.P29109$2.l = r3 % 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:163:0x1485, code lost:
                
                    if ((r3 % 2) != 0) goto L210;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:164:0x1487, code lost:
                
                    r2 = r80 ^ 19365;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:165:0x1631, code lost:
                
                    if (r2 != r80) goto L222;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:166:0x1633, code lost:
                
                    r3 = new java.lang.Object[5];
                    r4 = new int[1];
                    r3[0] = r4;
                    r5 = new int[1];
                    r3[1] = r5;
                    r3[r28] = new int[1];
                    r5[0] = r80;
                    r4[0] = r2;
                    r3[4] = null;
                    r3[2] = null;
                    r0 = android.os.Process.myPid();
                    r0 = ((r0 | 1094846568) * 54) + ((((~((~r0) | 112293765)) | ((~((-112293766) | r0)) | 1094846568)) * 54) + ((((~(1104354025 | r2)) | 102786308) * (-108)) - 320573904));
                    r2 = (((r0 | 16) << 1) - (r0 ^ 16)) + r82;
                    r0 = r2 << 13;
                    r0 = (r0 & (~r2)) | ((~r0) & r2);
                    r1 = r0 >>> 17;
                    r0 = ((~r0) & r1) | ((~r1) & r0);
                    r1 = r0 << 5;
                    ((int[]) r3[r28])[0] = ((~r0) & r1) | ((~r1) & r0);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:167:0x16a1, code lost:
                
                    return r3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:169:0x16a5, code lost:
                
                    r2 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.f(1651333490);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:170:0x16a9, code lost:
                
                    if (r2 == null) goto L227;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:171:0x16ab, code lost:
                
                    r2 = 6769 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                    r3 = (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                    r45 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 52;
                    r4 = new java.lang.Object[1];
                    c(1, 2, -1, r4);
                    r2 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.g(r2, r3, r45, -339114986, (java.lang.String) r4[0], new java.lang.Class[0]);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:172:0x16dd, code lost:
                
                    r2 = ((java.lang.Long) ((java.lang.reflect.Method) r2).invoke(null, null)).longValue();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:173:0x16ea, code lost:
                
                    r10 = r2 ^ (-1);
                    r35 = r53 ^ (-1);
                    r43 = ((((r10 | r35) | (-524530262)) ^ (-1)) * 130) + ((131 * r2) + 67664403798L);
                    r10 = r10 | (-524530262);
                    r2 = com.fingerprintjs.android.fpjs_pro.g.e(130, ((r2 | 524530261) ^ (-1)) | ((r10 | r53) ^ (-1)), ((-260) * (r10 ^ (-1))) + r43, 585202265);
                    r4 = ((int) (r2 >> r81)) & (((((~(670317549 | r6)) | (-2147400702)) | (~((-630460809) | r80))) * 497) + ((((~((-1477083153) | r80)) | (~((-630460809) | r6))) * 497) - 228809296));
                    r3 = defpackage.hdi.a();
                    r2 = ((int) r2) & defpackage.k84.a(((~(r3 | (-2058548900))) | (~((~r3) | (-799191987)))) | (-2142435252), -370, (((~((-2058548900) | r10)) | (~((-799191987) | r3))) * (-370)) - 635053777, 1867906520);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:174:0x1775, code lost:
                
                    if (((r2 & r4) | (r4 ^ r2)) == 1) goto L231;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:175:0x1777, code lost:
                
                    r2 = new java.lang.Object[5];
                    r3 = new int[1];
                    r2[0] = r3;
                    r4 = new int[1];
                    r2[1] = r4;
                    r5 = new int[1];
                    r2[r28] = r5;
                    r4[0] = r80;
                    r3[0] = r80;
                    r2[4] = null;
                    r2[2] = null;
                    r0 = defpackage.k84.a((~(r80 | (-661125691))) | (~(r6 | 555522100)), 333, (((~((-661125691) | r6)) | (~(r80 | 555522100))) * 333) + 410391021, r82);
                    r1 = r0 << 13;
                    r0 = (r0 | r1) & (~(r0 & r1));
                    r1 = r0 >>> 17;
                    r0 = ((~r0) & r1) | ((~r1) & r0);
                    r1 = r0 << 5;
                    r5[0] = ((~r0) & r1) | ((~r1) & r0);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:176:0x17ce, code lost:
                
                    return r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:177:0x17cf, code lost:
                
                    r2 = new java.lang.Object[]{1};
                    r3 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.f(814053687);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:178:0x17de, code lost:
                
                    if (r3 == null) goto L235;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:179:0x17e0, code lost:
                
                    r3 = 5098 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                    r4 = (char) (59615 - android.graphics.Color.argb(0, 0, 0, 0));
                    r41 = (android.view.KeyEvent.getMaxKeyCode() >> 16) + 52;
                    r10 = new java.lang.Object[1];
                    c(1, 2, -1, r10);
                    r3 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.g(r3, r4, r41, -1188977581, (java.lang.String) r10[0], new java.lang.Class[]{java.lang.Integer.TYPE});
                 */
                /* JADX WARN: Code restructure failed: missing block: B:180:0x181a, code lost:
                
                    r2 = ((java.lang.Long) ((java.lang.reflect.Method) r3).invoke(null, r2)).longValue();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:181:0x1827, code lost:
                
                    r12 = android.os.Process.myTid();
                    r39 = ((-223723582) | (r12 ^ (-1))) ^ (-1);
                    r2 = com.fingerprintjs.android.fpjs_pro.g.e(338, r39 | (((223723581 | r2) | r12) ^ (-1)), ((((-223723582) | r2) ^ (-1)) * 338) + (((-338) * ((r39 | (((r2 ^ (-1)) | 223723581) ^ (-1))) | ((223723581 | r12) ^ (-1)))) + ((339 * r2) - 75394846797L)), -237271476);
                    r4 = ((int) (r2 >> r81)) & ((((~((-1614053826) | r6)) | (~((-176827415) | r6))) * 614) + (((((~(244022814 | r6)) | (-1858076640)) | (~(1681249225 | r6))) * (-1228)) + ((((-1790881240) | r80) * 614) + 436200250)));
                    r2 = ((int) r2) & ((((-210288641) | r80) * 591) + ((((~((-210288641) | r6)) | 1647515050) * (-591)) + 1308094490));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:182:0x18b7, code lost:
                
                    if (((r2 & r4) | (r4 ^ r2)) != 0) goto L239;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:183:0x18b9, code lost:
                
                    r2 = (~(r80 & 220)) & (r80 | 220);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:184:0x18c1, code lost:
                
                    if (r2 != r80) goto L242;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:185:0x18c3, code lost:
                
                    r3 = new java.lang.Object[5];
                    r4 = new int[1];
                    r3[0] = r4;
                    r5 = new int[1];
                    r3[1] = r5;
                    r3[r28] = new int[1];
                    r5[0] = r80;
                    r4[0] = r2;
                    r3[4] = null;
                    r3[2] = null;
                    r0 = defpackage.hdi.b(170117883);
                    r2 = ~r0;
                    r0 = (((~(r0 | 1065352811)) | ((~(r2 | (-805306889))) | (~((-151294980) | r0)))) * 192) + ((((~((-956601868) | r2)) | 151294979) * (-384)) + (((108750944 | r2) * (-192)) - 1410177810));
                    r2 = (((r0 | 16) << 1) - (r0 ^ 16)) + r82;
                    r0 = r2 << 13;
                    r0 = (r0 | r2) & (~(r2 & r0));
                    r0 = r0 ^ (r0 >>> 17);
                    ((int[]) r3[r28])[0] = r0 ^ (r0 << 5);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:186:0x1931, code lost:
                
                    return r3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:187:0x1932, code lost:
                
                    r2 = -(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > com.socure.docv.capturesdk.common.utils.ConstantsKt.UNSET ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == com.socure.docv.capturesdk.common.utils.ConstantsKt.UNSET ? 0 : -1));
                    r3 = (r2 & 23) + (r2 | 23);
                    r2 = (char) android.text.TextUtils.getTrimmedLength("");
                    r4 = -(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    r10 = ((r4 | 372) << 1) - (r4 ^ 372);
                    r4 = new java.lang.Object[1];
                    b(r2, r3, r10, r4);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:188:0x195d, code lost:
                
                    r2 = new java.lang.Object[]{(java.lang.String) r4[0]};
                    r3 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.f(-417469134);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:189:0x1965, code lost:
                
                    if (r3 == null) goto L247;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:190:0x1967, code lost:
                
                    r3 = 6202 - android.view.View.resolveSize(0, 0);
                    r4 = (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    r41 = 51 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                    r11 = new java.lang.Object[1];
                    c(0, 0, 2, r11);
                    r3 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.g(r3, r4, r41, 1857630294, (java.lang.String) r11[0], new java.lang.Class[]{java.lang.String.class});
                 */
                /* JADX WARN: Code restructure failed: missing block: B:191:0x1996, code lost:
                
                    r2 = ((java.lang.reflect.Method) r3).invoke(null, r2);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:192:0x199d, code lost:
                
                    if (r2 != null) goto L250;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:193:0x199f, code lost:
                
                    r3 = new java.lang.Object[]{r2, 42};
                    r2 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.f(10827986);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:194:0x19b4, code lost:
                
                    if (r2 == null) goto L252;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:195:0x19b6, code lost:
                
                    r2 = 5149 - android.view.MotionEvent.axisFromString("");
                    r4 = (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    r41 = (android.view.ViewConfiguration.getTouchSlop() >> 8) + 52;
                    r10 = new java.lang.Object[1];
                    c(1, 2, -1, r10);
                    r2 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.g(r2, r4, r41, -1996364362, (java.lang.String) r10[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                 */
                /* JADX WARN: Code restructure failed: missing block: B:196:0x19ee, code lost:
                
                    r2 = ((java.lang.Long) ((java.lang.reflect.Method) r2).invoke(null, r3)).longValue();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:197:0x19fb, code lost:
                
                    r2 = com.fingerprintjs.android.fpjs_pro.g.e(216, r2 | ((r35 | (-804212137)) ^ (-1)), ((-216) * (((-804212137) | (r2 ^ (-1))) | r35)) + (((((-804212137) | r53) ^ (-1)) * 216) + (((-215) * r2) - 174514033729L)), 921322041);
                    r10 = ((int) (r2 >> r81)) & ((((~(861005565 | r6)) | 526336) * 191) + ((((~(861005565 | r80)) | 576220845) * 191) - 3466727));
                    r3 = defpackage.hdi.b(1361756657);
                    r11 = ~r3;
                    r12 = (~(1792895845 | r11)) | (-2147450880);
                    r2 = ((int) r2) & (((~(r11 | (-355669436))) * 713) + (((~(r3 | (-1114402))) * 1426) + (((r12 | r3) * (-713)) - 60947092)));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:198:0x1a79, code lost:
                
                    if (((r2 & r10) | (r10 ^ r2)) == 1986687685) goto L257;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:199:0x1a7b, code lost:
                
                    com.fingerprintjs.android.fpjs_pro_internal.r0.a();
                    r5 = 0;
                    r25 = 4;
                    r26 = -1;
                    r29 = 19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:200:0x2875, code lost:
                
                    r2 = -android.text.TextUtils.getOffsetAfter("", r5);
                    r3 = ((r2 | 16) << 1) - (r2 ^ 16);
                    r2 = -(android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1));
                    r4 = android.graphics.Color.rgb(0, 0, 0);
                    r10 = (r4 & 16777914) + (r4 | 16777914);
                    r4 = new java.lang.Object[1];
                    b((char) ((r2 ^ 53898) + ((r2 & 53898) << 1)), r3, r10, r4);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:201:0x28a7, code lost:
                
                    r2 = new java.lang.Object[]{(java.lang.String) r4[0]};
                    r3 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.f(-417469134);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:202:0x28af, code lost:
                
                    if (r3 == null) goto L293;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:203:0x28b1, code lost:
                
                    r3 = android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 6203;
                    r4 = (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                    r42 = 51 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    r9 = new java.lang.Object[1];
                    c(0, 0, 2, r9);
                    r3 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.g(r3, r4, r42, 1857630294, (java.lang.String) r9[0], new java.lang.Class[]{java.lang.String.class});
                 */
                /* JADX WARN: Code restructure failed: missing block: B:204:0x28e6, code lost:
                
                    r2 = ((java.lang.reflect.Method) r3).invoke(null, r2);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:205:0x28ed, code lost:
                
                    if (r2 != null) goto L297;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:206:0x28ef, code lost:
                
                    r2 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:208:0x29c9, code lost:
                
                    if (r2 != 1986687685) goto L304;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:211:0x29d2, code lost:
                
                    r3 = 16777229 - (~android.graphics.Color.rgb(0, 0, 0));
                    r2 = (char) (49755 - (~(-android.view.View.MeasureSpec.makeMeasureSpec(0, 0))));
                    r4 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                    r5 = ((r4 | 1413) << 1) - (r4 ^ 1413);
                    r4 = new java.lang.Object[1];
                    b(r2, r3, r5, r4);
                    r55 = (java.lang.String) r4[0];
                    r2 = -((android.os.Process.getThreadPriority(0) + 20) >> 6);
                    r3 = (r2 ^ 26) + ((r2 & 26) << 1);
                    r2 = (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8);
                    r4 = -(-android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                    r9 = (r4 ^ 1427) + ((r4 & 1427) << 1);
                    r4 = new java.lang.Object[1];
                    b(r2, r3, r9, r4);
                    r56 = (java.lang.String) r4[0];
                    r2 = 16 - (~(-android.view.Gravity.getAbsoluteGravity(0, 0)));
                    r3 = android.os.Process.getGidForName("");
                    r4 = r3 * 934;
                    r9 = (r4 & (-2839804)) + (r4 | (-2839804));
                    r4 = ~r3;
                    r4 = ~((r4 & r6) | (r4 ^ r6));
                    r4 = -(-(((r4 & (-3048)) | ((-3048) ^ r4)) * (-933)));
                    r5 = (r9 & r4) + (r4 | r9);
                    r4 = ~(((-3048) & r6) | ((-3048) ^ r6));
                    r9 = ~(((-3048) & r3) | ((-3048) ^ r3));
                    r4 = ((r4 & r9) | (r4 ^ r9)) * 933;
                    r9 = new java.lang.Object[1];
                    b((char) (((~((r3 & 3047) | (r3 ^ 3047))) * 933) + ((r5 & r4) + (r4 | r5))), r2, 1452 - (~(-android.view.Gravity.getAbsoluteGravity(0, 0))), r9);
                    r57 = (java.lang.String) r9[0];
                    r2 = 17 - (~(-(-android.view.MotionEvent.axisFromString(""))));
                    r3 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
                    r4 = com.fingerprintjs.android.fpjs_pro_internal.r0.a();
                    r5 = (r3 * (-1335)) - 43387016;
                    r9 = r3 | r4;
                    r10 = -(-(((~r9) | (-65049)) * (-668)));
                    r4 = ~(r4 | (-65049));
                    r5 = new java.lang.Object[1];
                    b((char) (((((((r5 | r10) << 1) - (r5 ^ r10)) - (~(-(-(((r3 & r4) | (r3 ^ r4)) * 1336))))) - 1) - (~((r9 | (-65049)) * 668))) - 1), r2, 1471 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)), r5);
                    r58 = (java.lang.String) r5[0];
                    r2 = 14 - (~(-(-(android.view.ViewConfiguration.getEdgeSlop() >> 16))));
                    r3 = -(-(android.os.Process.myTid() >> 22));
                    r5 = new java.lang.Object[1];
                    b((char) (((r3 | 42713) << 1) - (r3 ^ 42713)), r2, 1486 - (~(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))), r5);
                    r59 = (java.lang.String) r5[0];
                    r2 = android.graphics.Color.red(0);
                    r3 = (r2 ^ 37) + ((r2 & 37) << 1);
                    r2 = -(-(android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                    r4 = -android.text.TextUtils.indexOf("", "", 0, 0);
                    r9 = (r4 ^ 1502) + ((r4 & 1502) << 1);
                    r4 = new java.lang.Object[1];
                    b((char) ((r2 ^ 24237) + ((r2 & 24237) << 1)), r3, r9, r4);
                    r60 = (java.lang.String) r4[0];
                    r2 = android.view.View.MeasureSpec.getMode(0);
                    r9 = new java.lang.Object[1];
                    b((char) android.view.View.resolveSize(0, 0), ((r2 | 12) << 1) - (r2 ^ 12), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1539, r9);
                    r61 = (java.lang.String) r9[0];
                    r2 = 12 - (~(-(-(android.view.ViewConfiguration.getLongPressTimeout() >> 16))));
                    r3 = android.os.Process.getGidForName("");
                    r5 = new java.lang.Object[1];
                    b((char) (((r3 | 7921) << 1) - (r3 ^ 7921)), r2, 1550 - (~(-android.text.TextUtils.getTrimmedLength(""))), r5);
                    r62 = (java.lang.String) r5[0];
                    r2 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 23;
                    r3 = -(-android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0));
                    r4 = android.text.AndroidCharacter.getMirror('0');
                    r5 = ((r4 | 1516) << 1) - (r4 ^ 1516);
                    r4 = new java.lang.Object[1];
                    b((char) (((r3 | 17910) << 1) - (r3 ^ 17910)), r2, r5, r4);
                    r63 = (java.lang.String) r4[0];
                    r2 = -(-android.view.Gravity.getAbsoluteGravity(0, 0));
                    r3 = ((r2 | 31) << 1) - (r2 ^ 31);
                    r2 = -(-android.text.TextUtils.indexOf("", ""));
                    r4 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1));
                    r9 = (r4 & 1587) + (r4 | 1587);
                    r4 = new java.lang.Object[1];
                    b((char) (((r2 | 34232) << 1) - (r2 ^ 34232)), r3, r9, r4);
                    r64 = (java.lang.String) r4[0];
                    r9 = new java.lang.Object[1];
                    b((char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12, android.view.View.MeasureSpec.getMode(0) + 1617, r9);
                    r65 = (java.lang.String) r9[0];
                    r5 = new java.lang.Object[1];
                    b((char) ((-2) - ((-android.view.MotionEvent.axisFromString("")) ^ (-1))), 11 - (~(-(-(android.os.Process.myPid() >> 22)))), 1629 - android.view.KeyEvent.keyCodeFromString(""), r5);
                    r66 = (java.lang.String) r5[0];
                    r2 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                    r3 = r2 * 398;
                    r4 = (r3 ^ (-4752)) + ((r3 & (-4752)) << 1);
                    r3 = ~r2;
                    r5 = ~(r3 | r6);
                    r3 = ~((r3 & 12) | (r3 ^ 12));
                    r5 = r5 | r3;
                    r9 = ~((r6 ^ 12) | (r6 & 12));
                    r5 = ((r5 & r9) | (r5 ^ r9)) * (-397);
                    r9 = (r4 ^ r5) + ((r4 & r5) << 1);
                    r4 = -(-(r3 * (-397)));
                    r5 = (r9 ^ r4) + ((r4 & r9) << 1);
                    r3 = (r3 & r80) | (r80 ^ r3);
                    r2 = ~((r2 & (-13)) | ((-13) ^ r2));
                    r9 = new java.lang.Object[1];
                    b((char) android.graphics.Color.green(0), (((r2 & r3) | (r3 ^ r2)) * 397) + r5, android.text.TextUtils.lastIndexOf("", '0', 0, 0) + 1642, r9);
                    r67 = (java.lang.String) r9[0];
                    r9 = new java.lang.Object[1];
                    b((char) android.view.Gravity.getAbsoluteGravity(0, 0), 11 - (~(-(android.view.ViewConfiguration.getFadingEdgeLength() >> 16))), 1653 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), r9);
                    r68 = (java.lang.String) r9[0];
                    r2 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    r3 = ((r2 | 12) << 1) - (r2 ^ 12);
                    r2 = (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    r4 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    r9 = (r4 ^ 1665) + ((r4 & 1665) << 1);
                    r4 = new java.lang.Object[1];
                    b(r2, r3, r9, r4);
                    r69 = (java.lang.String) r4[0];
                    r2 = -(-android.graphics.Color.rgb(0, 0, 0));
                    r4 = (r2 ^ 16777230) + ((r2 & 16777230) << 1);
                    r2 = (char) (45814 - (~android.text.TextUtils.lastIndexOf("", '0')));
                    r3 = -(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > com.socure.docv.capturesdk.common.utils.ConstantsKt.UNSET ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == com.socure.docv.capturesdk.common.utils.ConstantsKt.UNSET ? 0 : -1));
                    r5 = ((r3 | 1677) << 1) - (r3 ^ 1677);
                    r3 = new java.lang.Object[1];
                    b(r2, r4, r5, r3);
                    r70 = (java.lang.String) r3[0];
                    r2 = 13 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    r3 = -(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    r4 = -android.graphics.Color.alpha(0);
                    r5 = (r4 & 1691) + (r4 | 1691);
                    r4 = new java.lang.Object[1];
                    b((char) ((r3 ^ 44884) + ((r3 & 44884) << 1)), r2, r5, r4);
                    r71 = (java.lang.String) r4[0];
                    r2 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                    r3 = (r2 & 24) + (r2 | 24);
                    r2 = -(-(android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)));
                    r4 = -(-android.graphics.Color.blue(0));
                    r9 = ((r4 | 1703) << 1) - (r4 ^ 1703);
                    r4 = new java.lang.Object[1];
                    b((char) ((r2 & 17008) + (r2 | 17008)), r3, r9, r4);
                    r72 = (java.lang.String) r4[0];
                    r2 = -android.graphics.Color.rgb(0, 0, 0);
                    r4 = (r2 & (-16777188)) + (r2 | (-16777188));
                    r2 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    r5 = new java.lang.Object[1];
                    b((char) (((r2 | 40129) << 1) - (r2 ^ 40129)), r4, 1727 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), r5);
                    r2 = new java.lang.String[]{r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, (java.lang.String) r5[0]};
                    r3 = r29;
                    r11 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:212:0x2de8, code lost:
                
                    if (r11 >= r3) goto L421;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:213:0x2dea, code lost:
                
                    com.fingerprintjs.android.fpjs_pro_internal.P29109$2.l = (com.fingerprintjs.android.fpjs_pro_internal.P29109$2.k + 9) % 128;
                    r3 = r2[r11];
                 */
                /* JADX WARN: Code restructure failed: missing block: B:214:0x2df4, code lost:
                
                    r4 = new java.lang.Object[]{r3};
                    r5 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.f(-668483483);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:215:0x2dfc, code lost:
                
                    if (r5 == null) goto L312;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:216:0x2dfe, code lost:
                
                    r5 = (android.os.Process.myTid() >> 22) + 6046;
                    r9 = (char) android.view.KeyEvent.keyCodeFromString("");
                    r40 = 52 - android.graphics.Color.green(0);
                    r10 = new java.lang.Object[1];
                    c(1, 2, -1, r10);
                    r5 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.g(r5, r9, r40, 1367547137, (java.lang.String) r10[0], new java.lang.Class[]{java.lang.String.class});
                 */
                /* JADX WARN: Code restructure failed: missing block: B:217:0x2e30, code lost:
                
                    r4 = ((java.lang.Long) ((java.lang.reflect.Method) r5).invoke(null, r4)).longValue();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:218:0x2e3d, code lost:
                
                    r12 = ((-344) * r4) - 321370745696L;
                    r4 = r4 ^ (-1);
                    r14 = (-934217285) | r4;
                    r4 = com.fingerprintjs.android.fpjs_pro.g.e(345, (r14 | r53) ^ (-1), ((((r4 | 934217284) ^ (-1)) | (((-934217285) | r35) ^ (-1))) * 345) + ((((r14 ^ (-1)) | (((-934217285) | r53) ^ (-1))) * 345) + r12), 1005332723);
                    r9 = ((int) (r4 >> r81)) & (((((~((-1782528831) | r80)) | 1781209644) | (~((-343983234) | r6))) * 164) + ((((-345302420) | r80) * 164) + ((((~(1782528830 | r6)) | (-345302420)) * (-328)) + 365252386)));
                    r4 = ((int) r4) & ((((~((-345345) | r80)) | 1207963689) * 366) + ((((~(1322422377 | r80)) | (-114804033)) * (-366)) - 238908215));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:219:0x2ebf, code lost:
                
                    if (((r4 & r9) | (r9 ^ r4)) != 0) goto L423;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:220:0x2ec3, code lost:
                
                    r4 = 12 - (~(-((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                    r5 = (char) (45813 - (~(-(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))));
                    r9 = -(-android.text.TextUtils.lastIndexOf("", '0'));
                    r10 = (r9 ^ 1678) + ((r9 & 1678) << 1);
                    r9 = new java.lang.Object[1];
                    b(r5, r4, r10, r9);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:221:0x2ef9, code lost:
                
                    if (r3.equals((java.lang.String) r9[0]) != false) goto L319;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:222:0x2efb, code lost:
                
                    r3 = new java.lang.Object[]{r3};
                    r4 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.f(-1567326429);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:223:0x2f06, code lost:
                
                    if (r4 == null) goto L321;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:224:0x2f08, code lost:
                
                    r4 = 6047 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    r9 = (char) android.view.View.MeasureSpec.getMode(0);
                    r40 = 51 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1));
                    r10 = new java.lang.Object[1];
                    c(0, 2, -1, r10);
                    r4 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.g(r4, r9, r40, 724607559, (java.lang.String) r10[0], new java.lang.Class[]{java.lang.String.class});
                 */
                /* JADX WARN: Code restructure failed: missing block: B:225:0x2f3d, code lost:
                
                    r3 = ((java.lang.Long) ((java.lang.reflect.Method) r4).invoke(null, r3)).longValue();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:226:0x2f4a, code lost:
                
                    r9 = 283363436 | r3;
                    r3 = com.fingerprintjs.android.fpjs_pro.g.e(140, ((((r3 ^ (-1)) | (-283363437)) ^ (-1)) | ((r35 | (-283363437)) ^ (-1))) | ((r9 | r53) ^ (-1)), ((-280) * ((r9 ^ (-1)) | ((r35 | r3) ^ (-1)))) + (((r3 | r53) * 140) + (((-279) * r3) - 39954244617L)), 786117676);
                    r5 = ((int) (r3 >> r81)) & ((((~(369831649 | r6)) | (-2109647470)) * 398) + ((((~(369831649 | r80)) | (-2109647470)) * 398) - 68865782));
                    r3 = ((int) r3) & ((((~(((int) java.lang.Runtime.getRuntime().maxMemory()) | (-222318362))) | 1214908048) * 529) + ((((~((~r4) | (-222318362))) | 138413584) * 529) - 1520785380));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:227:0x2fcb, code lost:
                
                    if (((r3 & r5) | (r5 ^ r3)) != 0) goto L422;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:229:0x2fe4, code lost:
                
                    if (r11 >= 0) goto L329;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:230:0x2fe6, code lost:
                
                    r2 = (r11 ^ 130) + ((r11 & 130) << 1);
                    r2 = (r2 & r6) | ((~r2) & r80);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:231:0x2ff1, code lost:
                
                    if (r2 != r80) goto L331;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:232:0x2ff3, code lost:
                
                    r3 = new java.lang.Object[5];
                    r4 = new int[1];
                    r3[0] = r4;
                    r5 = new int[1];
                    r3[1] = r5;
                    r7 = new int[1];
                    r3[r28] = r7;
                    r5[0] = r80;
                    r4[0] = r2;
                    r3[r25] = null;
                    r3[2] = null;
                    r2 = ((~((-643851361) | r6)) * 476) + (((~(r80 | (-643851361))) * 952) + (((286460174 | r0) * (-476)) - 1397832202));
                    r0 = -(-((r2 ^ 16) + ((r2 & 16) << 1)));
                    r2 = (r82 ^ r0) + ((r0 & r82) << 1);
                    r0 = r2 << 13;
                    r0 = (r0 & (~r2)) | ((~r0) & r2);
                    r0 = r0 ^ (r0 >>> 17);
                    r1 = r0 << 5;
                    r7[0] = ((~r0) & r1) | ((~r1) & r0);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:233:0x3051, code lost:
                
                    return r3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:235:0x2fce, code lost:
                
                    r3 = ((r11 | 56) << 1) - (r11 ^ 56);
                    r11 = ((r3 | (-55)) << 1) - (r3 ^ (-55));
                    r3 = 19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:239:0x2fe3, code lost:
                
                    r11 = -1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:240:0x3052, code lost:
                
                    r2 = 12 - (~(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)));
                    r3 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                    r4 = (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1));
                    r5 = ((r4 | 1754) << 1) - (r4 ^ 1754);
                    r4 = new java.lang.Object[1];
                    b((char) (((r3 | 533) << 1) - (r3 ^ 533)), r2, r5, r4);
                    r2 = (java.lang.String) r4[0];
                    r5 = new java.lang.Object[1];
                    b((char) android.text.TextUtils.indexOf("", ""), 4 - (~(-(android.view.ViewConfiguration.getTapTimeout() >> 16))), 1766 - (~(-android.text.TextUtils.lastIndexOf("", '0'))), r5);
                    r2 = new java.lang.String[]{r2, (java.lang.String) r5[0]};
                    r3 = (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 15;
                    r4 = (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                    r5 = -(-android.text.TextUtils.getOffsetBefore("", 0));
                    r9 = (r5 & 1773) + (r5 | 1773);
                    r5 = new java.lang.Object[1];
                    b(r4, r3, r9, r5);
                    r3 = (java.lang.String) r5[0];
                    r4 = -(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > com.socure.docv.capturesdk.common.utils.ConstantsKt.UNSET ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == com.socure.docv.capturesdk.common.utils.ConstantsKt.UNSET ? 0 : -1));
                    r5 = (r4 & 19) + (r4 | 19);
                    r4 = (char) (25308 - (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)));
                    r9 = -(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    r10 = (r9 ^ 1788) + ((r9 & 1788) << 1);
                    r9 = new java.lang.Object[1];
                    b(r4, r5, r10, r9);
                    r4 = (java.lang.String) r9[0];
                    r9 = 13 - (~(-android.text.TextUtils.indexOf("", "", 0)));
                    r10 = android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0);
                    r5 = (char) ((r10 & 27835) + (r10 | 27835));
                    r10 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                    r11 = (r10 & 1807) + (r10 | 1807);
                    r10 = new java.lang.Object[1];
                    b(r5, r9, r11, r10);
                    r3 = new java.lang.String[]{r3, r4, (java.lang.String) r10[0]};
                    r4 = -android.text.TextUtils.indexOf("", "", 0, 0);
                    r9 = (r4 & 21) + (r4 | 21);
                    r4 = (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 27070);
                    r10 = -android.text.TextUtils.getOffsetAfter("", 0);
                    r11 = (r10 & 1821) + (r10 | 1821);
                    r10 = new java.lang.Object[1];
                    b(r4, r9, r11, r10);
                    r4 = (java.lang.String) r10[0];
                    r9 = android.view.MotionEvent.axisFromString("") + 11;
                    r10 = android.view.KeyEvent.getDeadChar(0, 0);
                    r12 = new java.lang.Object[1];
                    b((char) ((r10 & 8515) + (r10 | 8515)), r9, android.view.View.getDefaultSize(0, 0) + 1842, r12);
                    r4 = new java.lang.String[]{r4, (java.lang.String) r12[0]};
                    r9 = android.widget.ExpandableListView.getPackedPositionGroup(0) + 11;
                    r10 = -(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > com.socure.docv.capturesdk.common.utils.ConstantsKt.UNSET ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == com.socure.docv.capturesdk.common.utils.ConstantsKt.UNSET ? 0 : -1));
                    r12 = new java.lang.Object[1];
                    b((char) ((r10 ^ 4) + ((r10 & 4) << 1)), r9, android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 1853, r12);
                    r9 = (java.lang.String) r12[0];
                    r5 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1));
                    r13 = 1;
                    r12 = new java.lang.Object[1];
                    b((char) (56971 - (~(-(-android.text.TextUtils.lastIndexOf("", '0'))))), (r5 ^ 5) + ((r5 & 5) << 1), 589 - (~(-(android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)))), r12);
                    r9 = new java.lang.String[]{r9, (java.lang.String) r12[0]};
                    r10 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
                    r5 = -android.view.View.resolveSizeAndState(0, 0, 0);
                    r12 = new java.lang.Object[1];
                    b((char) ((r5 ^ 14638) + ((r5 & 14638) << 1)), ((r10 | 28) << 1) - (r10 ^ 28), 1864 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), r12);
                    r5 = (java.lang.String) r12[0];
                    r10 = -(-android.widget.ExpandableListView.getPackedPositionChild(0));
                    r11 = (r10 ^ 11) + ((r10 & 11) << 1);
                    r10 = -(-(android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)));
                    r12 = -(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    r14 = ((r12 | 1842) << 1) - (r12 ^ 1842);
                    r12 = new java.lang.Object[1];
                    b((char) ((r10 ^ 8514) + ((r10 & 8514) << 1)), r11, r14, r12);
                    r52 = 0;
                    r2 = new java.lang.String[][]{r2, r3, r4, r9, new java.lang.String[]{r5, (java.lang.String) r12[0]}};
                    r3 = 0;
                    r11 = -1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:242:0x3246, code lost:
                
                    if (r3 >= 5) goto L426;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:243:0x3248, code lost:
                
                    r4 = r2[r3];
                    r5 = r4[r52];
                    r4 = (java.lang.String[]) java.util.Arrays.copyOfRange(r4, r13, r4.length);
                    r9 = r4.length;
                    r10 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:245:0x3257, code lost:
                
                    r14 = ((r11 | (-12)) << r13) - (r11 ^ (-12));
                    r11 = ((r14 | 13) << r13) - (r14 ^ 13);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:246:0x3266, code lost:
                
                    r14 = new java.lang.Object[2];
                    r14[r13] = r4[r10];
                    r14[0] = r5;
                    r12 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.f(1730286819);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:247:0x3275, code lost:
                
                    if (r12 == null) goto L341;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:248:0x3277, code lost:
                
                    r12 = 3265 - android.text.TextUtils.getTrimmedLength("");
                    r13 = (char) android.view.KeyEvent.normalizeMetaState(0);
                    r40 = (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 52;
                    r1 = new java.lang.Object[1];
                    r16 = r2;
                    r19 = r3;
                    c(1, 2, -1, r1);
                    r12 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.g(r12, r13, r40, -293156473, (java.lang.String) r1[0], new java.lang.Class[]{java.lang.String.class, java.lang.String.class});
                 */
                /* JADX WARN: Code restructure failed: missing block: B:249:0x32b0, code lost:
                
                    r1 = ((java.lang.Long) ((java.lang.reflect.Method) r12).invoke(null, r14)).longValue();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:250:0x32bd, code lost:
                
                    r12 = r1 ^ (-1);
                    r1 = com.fingerprintjs.android.fpjs_pro.g.e(45, (((163896768 | r53) ^ (-1)) | r12) | ((r35 | (-163896769)) ^ (-1)), ((-45) * ((((-163896769) | r1) ^ (-1)) | ((r12 | r53) ^ (-1)))) + (((-90) * ((-163896769) | ((r12 | r35) ^ (-1)))) + ((46 * r1) - 7539251374L)), -1515881627);
                    r12 = (int) java.lang.Runtime.getRuntime().totalMemory();
                    r13 = ~r12;
                    r15 = ~((-1272977284) | r13);
                    r3 = ((int) (r1 >> r81)) & ((((~((-1272977284) | r12)) | (~(r13 | 1272977283))) * 575) + ((((~(r13 | 164249127)) | (~((-164249128) | r12))) * (-575)) + (((r15 | r14) * 1150) - 334238508)));
                    r2 = defpackage.hdi.b(1390580136);
                    r1 = ((int) r1) & ((((~(r2 | (-902252113))) | (-534974298)) * 272) + ((((~(902252112 | r2)) | 169871625) * (-272)) + ((((~(1072123737 | (~r2))) | (~((-365102673) | r2))) * (-272)) + 1742423013)));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:251:0x3370, code lost:
                
                    if (((r1 & r3) | (r3 ^ r1)) != 0) goto L427;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:252:0x3380, code lost:
                
                    r10 = r10 + 1;
                    r2 = r16;
                    r3 = r19;
                    r13 = 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:254:0x3372, code lost:
                
                    r1 = ((r11 | 170) << 1) - (r11 ^ 170);
                    r1 = (r1 & r6) | ((~r1) & r80);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:255:0x3399, code lost:
                
                    if (r1 == r80) goto L353;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:256:0x339b, code lost:
                
                    r2 = new java.lang.Object[5];
                    r3 = new int[1];
                    r2[0] = r3;
                    r4 = new int[1];
                    r2[1] = r4;
                    r5 = new int[1];
                    r2[r28] = r5;
                    r4[0] = r80;
                    r3[0] = r1;
                    r2[r25] = null;
                    r2[2] = null;
                    r0 = defpackage.k84.a(((~((-77331142) | r6)) | 8950401) | (~((-1139316650) | r6)), 184, (((~((-68380741) | r6)) | (~((-1130366249) | r6))) * (-184)) + 691753822, -1121979816);
                    r0 = (r82 - (~(-(-(((r0 | 16) << 1) - (r0 ^ 16)))))) - 1;
                    r1 = r0 << 13;
                    r0 = (r0 | r1) & (~(r0 & r1));
                    r0 = r0 ^ (r0 >>> 17);
                    r5[0] = r0 ^ (r0 << 5);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:257:0x3403, code lost:
                
                    return r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:260:0x3405, code lost:
                
                    r1 = -(-android.view.View.resolveSizeAndState(0, 0, 0));
                    r4 = new java.lang.Object[1];
                    b((char) android.text.TextUtils.getCapsMode("", 0, 0), (r1 & 13) + (r1 | 13), 1889 - (~(-android.widget.ExpandableListView.getPackedPositionChild(0))), r4);
                    r1 = (java.lang.String) r4[0];
                    r2 = -android.widget.ExpandableListView.getPackedPositionChild(0);
                    r5 = new java.lang.Object[1];
                    b((char) ((-1) - android.text.TextUtils.lastIndexOf("", '0', 0, 0)), ((r2 | 7) << 1) - (r2 ^ 7), android.widget.ExpandableListView.getPackedPositionGroup(0) + 1904, r5);
                    r2 = (java.lang.String) r5[0];
                    r3 = new java.io.File(r1);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:261:0x345b, code lost:
                
                    if (r3.exists() != false) goto L356;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:265:0x3463, code lost:
                
                    r1 = new java.util.Scanner(new java.io.FileInputStream(r3));
                    r3 = 0 - (~(-(-(android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)))));
                    r4 = (char) (54163 - android.view.Gravity.getAbsoluteGravity(0, 0));
                    r9 = android.graphics.Color.rgb(0, 0, 0);
                    r11 = (r9 ^ 16777445) + ((r9 & 16777445) << 1);
                    r9 = new java.lang.Object[1];
                    b(r4, r3, r11, r9);
                    r1 = r1.useDelimiter((java.lang.String) r9[0]);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:266:0x349e, code lost:
                
                    if (r1.hasNext() != false) goto L360;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:267:0x34a0, code lost:
                
                    r3 = r1.next();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:268:0x34a6, code lost:
                
                    r1.close();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:269:0x34ad, code lost:
                
                    if (r3.contains(r2) != false) goto L364;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:270:0x34af, code lost:
                
                    r1 = com.fingerprintjs.android.fpjs_pro_internal.P29109$2.l + 85;
                    com.fingerprintjs.android.fpjs_pro_internal.P29109$2.k = r1 % 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:271:0x34bb, code lost:
                
                    if ((r1 % 2) == 0) goto L367;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:272:0x34be, code lost:
                
                    r1 = r80 & (-151);
                    r2 = r6 & 150;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:273:0x34c2, code lost:
                
                    r1 = r1 | r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:274:0x34cb, code lost:
                
                    if (r1 == r80) goto L374;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:275:0x34cd, code lost:
                
                    r2 = new java.lang.Object[5];
                    r3 = new int[1];
                    r2[0] = r3;
                    r4 = new int[1];
                    r2[1] = r4;
                    r2[r28] = new int[1];
                    r4[0] = r80;
                    r3[0] = r1;
                    r2[r25] = null;
                    r2[2] = null;
                    r0 = (((~(r80 | 1073465963)) | ((~((-1051314220) | r6)) | 143181827)) * 676) + ((((~(165333571 | r6)) | 908132392) * 676) + ((((-908132393) | r80) * (-676)) - 705816114));
                    r1 = com.fingerprintjs.android.fpjs_pro_internal.r0.a();
                    r4 = ~r0;
                    r5 = ~((-17) | r4);
                    r6 = ~r1;
                    r4 = (r4 & r6) | (r4 ^ r6);
                    r6 = ~r4;
                    r0 = (r0 & 16) | (r0 ^ 16);
                    r1 = ~((r1 & r0) | (r0 ^ r1));
                    r3 = (((((r0 * 253) + 4048) - (~((((r5 & r6) | (r5 ^ r6)) | r1) * (-252)))) - 1) - (~(r0 * (-252)))) - 1;
                    r0 = ~(r4 | 16);
                    r0 = ((r0 & r1) | (r0 ^ r1)) * 252;
                    r0 = -(-((r3 ^ r0) + ((r0 & r3) << 1)));
                    r1 = (r82 ^ r0) + ((r82 & r0) << 1);
                    r0 = r1 << 13;
                    r0 = (r0 & (~r1)) | ((~r0) & r1);
                    r1 = r0 >>> 17;
                    r0 = (r0 | r1) & (~(r0 & r1));
                    r1 = r0 << 5;
                    ((int[]) r2[r28])[0] = (r0 | r1) & (~(r0 & r1));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:276:0x357b, code lost:
                
                    return r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:277:0x357c, code lost:
                
                    r1 = -(-((byte) android.view.KeyEvent.getModifierMetaStateMask()));
                    r4 = new java.lang.Object[1];
                    b((char) (52251 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1))), (r1 ^ 48) + ((r1 & 48) << 1), 1911 - (~(-(-android.text.TextUtils.getOffsetAfter("", 0)))), r4);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:278:0x35ad, code lost:
                
                    r1 = new java.lang.Object[]{(java.lang.String) r4[0]};
                    r2 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.f(-668483483);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:279:0x35b5, code lost:
                
                    if (r2 == null) goto L377;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:280:0x35b7, code lost:
                
                    r8 = android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 6047;
                    r9 = (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                    r10 = 52 - (android.view.ViewConfiguration.getScrollBarSize() >> 8);
                    r2 = new java.lang.Object[1];
                    c(1, 2, -1, r2);
                    r2 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.g(r8, r9, r10, 1367547137, (java.lang.String) r2[0], new java.lang.Class[]{java.lang.String.class});
                 */
                /* JADX WARN: Code restructure failed: missing block: B:281:0x35e9, code lost:
                
                    r1 = ((java.lang.Long) ((java.lang.reflect.Method) r2).invoke(null, r1)).longValue();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:282:0x35f6, code lost:
                
                    r3 = (int) java.lang.Runtime.getRuntime().totalMemory();
                    r11 = r1 ^ (-1);
                    r17 = (1395197249 | r1) ^ (-1);
                    r1 = com.fingerprintjs.android.fpjs_pro.g.e(722, ((r1 | (-1395197250)) ^ (-1)) | ((r11 | 1395197249) ^ (-1)), ((-1444) * (((r3 | r1) ^ (-1)) | (r17 | ((1395197249 | r3) ^ (-1))))) + ((1444 * (((r3 ^ (-1)) | (((-1395197250) | r11) ^ (-1))) | r17)) + (((-721) * r1) - 1005937216529L)), 544352758);
                    r3 = ((int) (r1 >> r81)) & ((((~(2147155887 | r6)) | (~((-313003009) | r80))) * 318) + ((((~(396926468 | r80)) | (~((-313003009) | r6))) * 318) + ((((~((-1834152880) | r80)) | 396926468) * (-318)) - 2044112062)));
                    r2 = (int) android.os.SystemClock.uptimeMillis();
                    r1 = ((int) r1) & ((((~(r2 | (-277942597))) | 1090535441) * 366) + ((((~(1124909627 | r2)) | (-312316783)) * (-366)) + 514935125));
                    r1 = ((r1 & r3) | (r3 ^ r1)) * 263;
                    r1 = (r1 | r80) & (~(r80 & r1));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:283:0x369f, code lost:
                
                    if (r1 != r80) goto L381;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:284:0x36a1, code lost:
                
                    r2 = new java.lang.Object[5];
                    r3 = new int[1];
                    r2[0] = r3;
                    r4 = new int[1];
                    r2[1] = r4;
                    r5 = new int[1];
                    r2[r28] = r5;
                    r4[0] = r80;
                    r3[0] = r1;
                    r2[r25] = null;
                    r2[2] = null;
                    r0 = (((~(r80 | 777752444)) | ((~((-438895347) | r80)) | 270532738)) * 623) + (((609389836 | r6) * (-623)) + (((~((-270532739) | r80)) * 623) + 1871222340));
                    r0 = (r82 - (~((r0 & 16) + (r0 | 16)))) - 1;
                    r1 = r0 << 13;
                    r0 = ((~r0) & r1) | ((~r1) & r0);
                    r1 = r0 >>> 17;
                    r0 = ((~r0) & r1) | ((~r1) & r0);
                    r1 = r0 << 5;
                    r5[0] = ((~r0) & r1) | ((~r1) & r0);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:285:0x370a, code lost:
                
                    return r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:286:0x370b, code lost:
                
                    r1 = new java.lang.Object[5];
                    r2 = new int[1];
                    r1[0] = r2;
                    r3 = new int[1];
                    r1[1] = r3;
                    r1[r28] = new int[1];
                    r3[0] = r80;
                    r2[0] = r80;
                    r1[r25] = null;
                    r1[2] = null;
                    r0 = (((~((~android.os.Process.myUid()) | 434209715)) | (-782438076)) * 783) + (((~((-637668361) | r0)) * (-783)) - 314662030);
                    r2 = com.fingerprintjs.android.fpjs_pro_internal.r0.a();
                    r3 = -(-(r0 * 965));
                    r5 = ((-964) ^ r3) + ((r3 & (-964)) << 1);
                    r0 = ~r0;
                    r3 = ~(r0 | r2);
                    r3 = (r3 | ((-1) ^ r3)) * (-964);
                    r6 = (r5 ^ r3) + ((r3 & r5) << 1);
                    r2 = ~r2;
                    r2 = ~((r2 & r0) | (r0 ^ r2));
                    r0 = ~r0;
                    r0 = -(-(((r0 & r2) | (r2 ^ r0)) * (-964)));
                    r2 = ((r6 | r0) << 1) - (r0 ^ r6);
                    r0 = (r82 ^ r2) + ((r82 & r2) << 1);
                    r2 = r0 << 13;
                    r0 = (r0 | r2) & (~(r0 & r2));
                    r2 = r0 >>> 17;
                    r0 = (r0 | r2) & (~(r0 & r2));
                    r2 = r0 << 5;
                    ((int[]) r1[r28])[0] = ((~r0) & r2) | ((~r2) & r0);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:287:0x37a0, code lost:
                
                    return r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:289:0x34a5, code lost:
                
                    r3 = "";
                 */
                /* JADX WARN: Code restructure failed: missing block: B:291:0x34c4, code lost:
                
                    r1 = r80;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:292:0x34c6, code lost:
                
                    r1 = r80 & (-152);
                    r2 = r6 & 151;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:293:0x32ac, code lost:
                
                    r16 = r2;
                    r19 = r3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:295:0x338b, code lost:
                
                    r3 = r3 + 1;
                    r13 = 1;
                    r52 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:297:0x3398, code lost:
                
                    r1 = r80;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:298:0x28f2, code lost:
                
                    r3 = new java.lang.Object[]{r2, 42};
                    r2 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.f(10827986);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:299:0x290a, code lost:
                
                    if (r2 == null) goto L299;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:300:0x290c, code lost:
                
                    r9 = (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 5150;
                    r10 = (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    r11 = 51 - android.os.Process.getGidForName("");
                    r2 = new java.lang.Object[1];
                    c(1, 2, r26, r2);
                    r2 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.g(r9, r10, r11, -1996364362, (java.lang.String) r2[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                 */
                /* JADX WARN: Code restructure failed: missing block: B:301:0x293e, code lost:
                
                    r2 = ((java.lang.Long) ((java.lang.reflect.Method) r2).invoke(null, r3)).longValue();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:302:0x294b, code lost:
                
                    r9 = r2 ^ (-1);
                    r4 = defpackage.hdi.a();
                    r13 = (r4 ^ (-1)) | r9;
                    r2 = com.fingerprintjs.android.fpjs_pro.g.e(113, (r9 | r4) ^ (-1), ((-113) * ((((r2 | 1824797115) ^ (-1)) | ((1824797115 | r4) ^ (-1))) | ((r13 | (-1824797116)) ^ (-1)))) + ((226 * ((-1824797116) | (r13 ^ (-1)))) + (((-112) * r2) + 204377276992L)), 1941907020);
                    r5 = android.os.Process.myUid();
                    r4 = ((int) (r2 >> r81)) & ((((~((~r5) | (-1665164262))) | (-1733650416)) * 420) + (((~((-1665164262) | r5)) * 420) + 136640438));
                    r3 = ~((-238971112) | r6);
                    r2 = ((int) r2) & (((r3 | (-1333783784)) * 970) + (((1094812672 | r3) * (-970)) + 659257701));
                    r2 = (r2 & r4) | (r4 ^ r2);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:304:0x1a89, code lost:
                
                    r2 = 23 - (android.os.Process.myPid() >> 22);
                    r3 = (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1));
                    r10 = -android.os.Process.getGidForName("");
                    r12 = ~r10;
                    r13 = r12 | r6;
                    r13 = ~((r13 & 371) | (r13 ^ 371));
                    r15 = r10 | 371;
                    r15 = ~((r15 ^ r80) | (r15 & r80));
                    r13 = (((r13 ^ r15) | (r13 & r15)) * (-302)) + ((r10 * 303) - 111671);
                    r11 = (~((r12 | 371) | r80)) * (-604);
                    r12 = (r13 & r11) + (r11 | r13);
                    r10 = ~((r10 & (-372)) | ((-372) ^ r10));
                    r11 = ~(r80 | 371);
                    r12 = (r12 - (~(-(-(((r10 & r11) | (r10 ^ r11)) * 302))))) - 1;
                    r10 = new java.lang.Object[1];
                    b(r3, r2, r12, r10);
                    r2 = (java.lang.String) r10[0];
                    r3 = 9 - (~(android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                    r10 = android.os.Process.getThreadPriority(0);
                    r11 = -android.widget.ExpandableListView.getPackedPositionType(0);
                    r12 = ((r11 | 617) << 1) - (r11 ^ 617);
                    r11 = new java.lang.Object[1];
                    b((char) ((((r10 & 20) + (r10 | 20)) >> 6) + 27621), r3, r12, r11);
                    r3 = (java.lang.String) r11[0];
                    r11 = 7 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    r12 = (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                    r13 = -android.view.View.resolveSizeAndState(0, 0, 0);
                    r15 = ((r13 | 627) << 1) - (r13 ^ 627);
                    r13 = new java.lang.Object[1];
                    b(r12, r11, r15, r13);
                    r11 = (java.lang.String) r13[0];
                    r12 = -(-(android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                    r4 = new java.lang.Object[1];
                    b((char) android.text.TextUtils.getOffsetBefore("", 0), (r12 & 8) + (r12 | 8), 634 - (~(-(-android.graphics.ImageFormat.getBitsPerPixel(0)))), r4);
                    r55 = new java.lang.String[]{r2, r3, r11, (java.lang.String) r4[0]};
                    r2 = 15 - (~(-android.view.MotionEvent.axisFromString("")));
                    r3 = (char) android.view.View.resolveSize(0, 0);
                    r4 = -(-android.text.TextUtils.lastIndexOf("", '0'));
                    r10 = ((r4 | 643) << 1) - (r4 ^ 643);
                    r4 = new java.lang.Object[1];
                    b(r3, r2, r10, r4);
                    r2 = (java.lang.String) r4[0];
                    r11 = 6 - (~(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)));
                    r3 = -(-android.view.KeyEvent.keyCodeFromString(""));
                    r4 = -(-android.text.TextUtils.getOffsetAfter("", 0));
                    r12 = (r4 ^ 659) + ((r4 & 659) << 1);
                    r4 = new java.lang.Object[1];
                    b((char) ((54506 & r3) + (r3 | 54506)), r11, r12, r4);
                    r3 = (java.lang.String) r4[0];
                    r4 = 7 - (~(-(-android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0'))));
                    r10 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    r11 = -(-(android.os.Process.myTid() >> 22));
                    r13 = ((r11 | 666) << 1) - (r11 ^ 666);
                    r11 = new java.lang.Object[1];
                    b((char) (((r10 | 26777) << 1) - (r10 ^ 26777)), r4, r13, r11);
                    r4 = (java.lang.String) r11[0];
                    r10 = -(-android.graphics.Color.green(0));
                    r11 = ((r10 | 11) << 1) - (r10 ^ 11);
                    r10 = (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    r15 = -android.view.View.MeasureSpec.getMode(0);
                    r5 = (r15 & 673) + (r15 | 673);
                    r15 = new java.lang.Object[1];
                    b((char) ((r10 ^ 31463) + ((r10 & 31463) << 1)), r11, r5, r15);
                    r5 = (java.lang.String) r15[0];
                    r10 = -(-android.text.TextUtils.getOffsetAfter("", 0));
                    r11 = (r10 & 14) + (r10 | 14);
                    r10 = (char) (36357 - (~(-android.graphics.Color.red(0))));
                    r15 = android.view.KeyEvent.getDeadChar(0, 0);
                    r12 = (r15 ^ 684) + ((r15 & 684) << 1);
                    r15 = new java.lang.Object[1];
                    b(r10, r11, r12, r15);
                    r56 = new java.lang.String[]{r2, r3, r4, r5, (java.lang.String) r15[0]};
                    r2 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                    r3 = (r2 & 16) + (r2 | 16);
                    r2 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    r5 = new java.lang.Object[1];
                    b((char) (((53898 | r2) << 1) - (r2 ^ 53898)), r3, 699 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), r5);
                    r10 = (java.lang.String) r5[0];
                    r2 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1));
                    r25 = 4;
                    r5 = new java.lang.Object[1];
                    b((char) (android.view.ViewConfiguration.getTapTimeout() >> 16), (r2 ^ 4) + ((r2 & 4) << 1), 712 - (~(-(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))), r5);
                    r11 = (java.lang.String) r5[0];
                    r2 = -(-android.text.TextUtils.getTrimmedLength(""));
                    r26 = -1;
                    r5 = new java.lang.Object[1];
                    b((char) ((-1) - android.view.MotionEvent.axisFromString("")), (r2 & 22) + (r2 | 22), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 725, r5);
                    r13 = (java.lang.String) r5[0];
                    r2 = -(-(android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)));
                    r3 = ((r2 | 24) << 1) - (r2 ^ 24);
                    r2 = (char) (android.view.View.MeasureSpec.getMode(0) + 22005);
                    r4 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    r12 = (r4 & 747) + (r4 | 747);
                    r4 = new java.lang.Object[1];
                    b(r2, r3, r12, r4);
                    r2 = (java.lang.String) r4[0];
                    r15 = new java.lang.Object[1];
                    b((char) android.view.View.getDefaultSize(0, 0), android.text.TextUtils.indexOf("", "", 0, 0) + 28, 771 - (~(-(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))), r15);
                    r12 = r24;
                    r29 = 19;
                    r57 = new java.lang.String[]{r10, r11, r12, r13, r2, (java.lang.String) r15[0]};
                    r10 = android.view.View.resolveSizeAndState(0, 0, 0);
                    r11 = (r10 ^ 11) + ((r10 & 11) << 1);
                    r5 = (char) android.text.TextUtils.getCapsMode("", 0, 0);
                    r10 = -(-(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    r13 = ((r10 | 800) << 1) - (r10 ^ 800);
                    r10 = new java.lang.Object[1];
                    b(r5, r11, r13, r10);
                    r10 = (java.lang.String) r10[0];
                    r11 = android.widget.ExpandableListView.getPackedPositionChild(0);
                    r13 = ((r11 | 9) << 1) - (r11 ^ 9);
                    r11 = (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 33003);
                    r14 = -(-android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                    r15 = (r14 & 811) + (r14 | 811);
                    r14 = new java.lang.Object[1];
                    b(r11, r13, r15, r14);
                    r11 = (java.lang.String) r14[0];
                    r13 = 5 - (~android.graphics.Color.red(0));
                    r14 = (char) android.graphics.Color.red(0);
                    r15 = -android.view.KeyEvent.getDeadChar(0, 0);
                    r33 = 2;
                    r2 = ((r15 | 819) << 1) - (r15 ^ 819);
                    r15 = new java.lang.Object[1];
                    b(r14, r13, r2, r15);
                    r2 = (java.lang.String) r15[0];
                    r5 = -android.text.TextUtils.lastIndexOf("", '0', 0);
                    r13 = com.fingerprintjs.android.fpjs_pro_internal.r0.a();
                    r14 = r5 * (-949);
                    r15 = (r14 & (-4745)) + (r14 | (-4745));
                    r14 = ~r13;
                    r3 = ~(((-6) ^ r14) | ((-6) & r14));
                    r9 = ~r5;
                    r9 = ~((r9 ^ r13) | (r9 & r13));
                    r15 = (r15 - (~(-(-(((r3 ^ r9) | (r3 & r9)) * 1900))))) - 1;
                    r3 = ~((r14 ^ r5) | (r14 & r5));
                    r9 = ~((r13 ^ 5) | (r13 & 5));
                    r15 = (r15 - (~(-(-(((r3 ^ r9) | (r3 & r9)) * (-950)))))) - 1;
                    r3 = ~((r14 ^ 5) | (r14 & 5));
                    r5 = ~((r5 & r13) | (r5 ^ r13));
                    r3 = -(-(((r3 & r5) | (r3 ^ r5)) * 950));
                    r5 = ((r15 | r3) << 1) - (r3 ^ r15);
                    r3 = -(-android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0));
                    r9 = -(-android.text.TextUtils.getTrimmedLength(""));
                    r14 = new java.lang.Object[1];
                    b((char) (((r3 | 7584) << 1) - (r3 ^ 7584)), r5, (r9 & 825) + (r9 | 825), r14);
                    r58 = new java.lang.String[]{r10, r11, r2, (java.lang.String) r14[0]};
                    r2 = -(-android.text.TextUtils.indexOf("", "", 0, 0));
                    r3 = ((r2 | 16) << 1) - (r2 ^ 16);
                    r2 = (char) (57831 - (~(-(android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)))));
                    r5 = android.text.AndroidCharacter.getMirror('0');
                    r10 = new java.lang.Object[1];
                    b(r2, r3, (r5 & 783) + (r5 | 783), r10);
                    r2 = (java.lang.String) r10[0];
                    r3 = 7 - (~(-(android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1))));
                    r9 = -android.view.View.MeasureSpec.getMode(0);
                    r10 = -android.text.TextUtils.getOffsetAfter("", 0);
                    r13 = (r10 & 666) + (r10 | 666);
                    r10 = new java.lang.Object[1];
                    b((char) ((r9 ^ 26777) + ((r9 & 26777) << 1)), r3, r13, r10);
                    r3 = (java.lang.String) r10[0];
                    r9 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                    r10 = ((r9 | 8) << 1) - (r9 ^ 8);
                    r9 = (char) ((-2) - ((-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1))) ^ (-1)));
                    r5 = -(-(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    r11 = (r5 ^ 634) + ((r5 & 634) << 1);
                    r5 = new java.lang.Object[1];
                    b(r9, r10, r11, r5);
                    r59 = new java.lang.String[]{r2, r3, (java.lang.String) r5[0]};
                    r2 = android.widget.ExpandableListView.getPackedPositionType(0);
                    r3 = (r2 * 46) + 644;
                    r5 = ~(((-15) ^ r6) | ((-15) & r6));
                    r5 = -(-(((r5 & r2) | (r2 ^ r5)) * (-90)));
                    r9 = (r3 & r5) + (r3 | r5);
                    r3 = ~((-15) | r80);
                    r5 = ~((r2 ^ 14) | (r2 & 14));
                    r3 = (((r3 & r5) | (r3 ^ r5)) * (-45)) + r9;
                    r5 = ~r2;
                    r5 = ~((r5 & r80) | (r5 ^ r80));
                    r5 = (r5 & (-15)) | ((-15) ^ r5);
                    r2 = ~((r2 & r6) | (r6 ^ r2));
                    r2 = ((r2 & r5) | (r5 ^ r2)) * 45;
                    r9 = new java.lang.Object[1];
                    b((char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 25373), ((r3 | r2) << 1) - (r2 ^ r3), 847 - android.text.TextUtils.getCapsMode("", 0, 0), r9);
                    r2 = (java.lang.String) r9[0];
                    r11 = new java.lang.Object[1];
                    b((char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)), 861 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), r11);
                    r60 = new java.lang.String[]{r2, (java.lang.String) r11[0]};
                    r2 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    r10 = new java.lang.Object[1];
                    b((char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), (r2 & 9) + (r2 | 9), 862 - (~(-(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1))))), r10);
                    r2 = (java.lang.String) r10[0];
                    r3 = (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1));
                    r5 = -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1));
                    r9 = com.fingerprintjs.android.fpjs_pro_internal.r0.a();
                    r10 = (r5 * 165) + 163;
                    r11 = ~r9;
                    r13 = -(-(r5 * (-328)));
                    r14 = ((r10 | r13) << 1) - (r10 ^ r13);
                    r9 = (r9 | r5) * 164;
                    r10 = ((r14 | r9) << 1) - (r9 ^ r14);
                    r9 = ~(~r5);
                    r9 = (r9 & r11) | (r9 ^ r11);
                    r5 = (r5 & r11) | (r11 ^ r5);
                    r5 = ~(r5 | (~r5));
                    r5 = ((r5 & r9) | (r9 ^ r5)) * 164;
                    r10 = new java.lang.Object[1];
                    b((char) ((r10 & r5) + (r5 | r10)), r3, 870 - (~(-(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))), r10);
                    r61 = new java.lang.String[]{r2, (java.lang.String) r10[0]};
                    r2 = 16 - (~(-(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)))));
                    r3 = android.view.ViewConfiguration.getPressedStateDuration() >> 16;
                    r5 = android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16;
                    r9 = ((r5 | 872) << 1) - (r5 ^ 872);
                    r5 = new java.lang.Object[1];
                    b((char) ((r3 & 16755) + (r3 | 16755)), r2, r9, r5);
                    r40 = (java.lang.String) r5[0];
                    r2 = -android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0);
                    r3 = com.fingerprintjs.android.fpjs_pro_internal.r0.a();
                    r5 = r2 * 450;
                    r9 = (r5 ^ (-896)) + ((r5 & (-896)) << 1);
                    r5 = ~r2;
                    r10 = ~(r5 | 2);
                    r11 = (-3) | r2;
                    r11 = ((~((r11 & r3) | (r11 ^ r3))) | r10) * 449;
                    r13 = (r9 ^ r11) + ((r9 & r11) << 1);
                    r5 = (~((r5 & 2) | (r5 ^ 2))) * (-1347);
                    r3 = ~r3;
                    r2 = (((~(r2 | (((-3) & r3) | ((-3) ^ r3)))) | r10) * 449) + (((r13 | r5) << 1) - (r5 ^ r13));
                    r3 = (char) android.graphics.Color.argb(0, 0, 0, 0);
                    r5 = android.view.ViewConfiguration.getLongPressTimeout() >> 16;
                    r9 = ((r5 | 714) << 1) - (r5 ^ 714);
                    r5 = new java.lang.Object[1];
                    b(r3, r2, r9, r5);
                    r41 = (java.lang.String) r5[0];
                    r2 = -android.text.AndroidCharacter.getMirror('0');
                    r3 = (r2 ^ 55) + ((r2 & 55) << 1);
                    r2 = (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 54505);
                    r5 = -android.text.AndroidCharacter.getMirror('0');
                    r9 = (r5 & 707) + (r5 | 707);
                    r5 = new java.lang.Object[1];
                    b(r2, r3, r9, r5);
                    r42 = (java.lang.String) r5[0];
                    r2 = -android.graphics.Color.green(0);
                    r3 = (r2 & 8) + (r2 | 8);
                    r5 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                    r9 = ((r5 | 888) << 1) - (r5 ^ 888);
                    r5 = new java.lang.Object[1];
                    b((char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) - 1), r3, r9, r5);
                    r43 = (java.lang.String) r5[0];
                    r9 = new java.lang.Object[1];
                    b((char) (31465 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1))), 10 - (~(-android.view.View.resolveSize(0, 0))), 673 - (android.view.ViewConfiguration.getTapTimeout() >> 16), r9);
                    r44 = (java.lang.String) r9[0];
                    r2 = -android.view.View.resolveSize(0, 0);
                    r3 = ((r2 | 14) << 1) - (r2 ^ 14);
                    r2 = (char) (android.text.TextUtils.indexOf("", "") + 36358);
                    r5 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                    r9 = (r5 & 684) + (r5 | 684);
                    r5 = new java.lang.Object[1];
                    b(r2, r3, r9, r5);
                    r62 = new java.lang.String[]{r40, r41, r42, r43, r44, (java.lang.String) r5[0]};
                    r2 = -(-(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    r3 = (r2 & 20) + (r2 | 20);
                    r2 = (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                    r5 = android.widget.ExpandableListView.getPackedPositionChild(0);
                    r9 = (r5 ^ 897) + ((r5 & 897) << 1);
                    r5 = new java.lang.Object[1];
                    b(r2, r3, r9, r5);
                    r10 = (java.lang.String) r5[0];
                    r2 = -(android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1));
                    r3 = r2 * 51;
                    r5 = (r3 & (-980)) + (r3 | (-980));
                    r3 = -(-(((r2 ^ r80) | (r2 & r80)) * (-50)));
                    r9 = ((r5 | r3) << 1) - (r3 ^ r5);
                    r3 = ~r2;
                    r3 = (r3 & (-21)) | (r3 ^ (-21));
                    r3 = ~((r3 & r80) | (r3 ^ r80));
                    r5 = ((-21) ^ r6) | ((-21) & r6);
                    r11 = ~((r5 ^ r2) | (r5 & r2));
                    r3 = (((r3 & r11) | (r3 ^ r11)) * 50) + r9;
                    r5 = ~r5;
                    r9 = ~(((-21) ^ r2) | ((-21) & r2));
                    r2 = -(-(((~((r2 & r6) | (r6 ^ r2))) | ((r5 & r9) | (r5 ^ r9))) * 50));
                    r5 = ((r3 | r2) << 1) - (r2 ^ r3);
                    r3 = -android.view.View.resolveSizeAndState(0, 0, 0);
                    r11 = new java.lang.Object[1];
                    b((char) (((50263 | r3) << 1) - (r3 ^ 50263)), r5, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 916, r11);
                    r11 = (java.lang.String) r11[0];
                    r2 = -(-(android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                    r14 = new java.lang.Object[1];
                    b((char) (37655 - android.text.TextUtils.indexOf("", "", 0)), ((r2 | 31) << 1) - (r2 ^ 31), android.view.KeyEvent.keyCodeFromString("") + 935, r14);
                    r2 = (java.lang.String) r14[0];
                    r3 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    r5 = (r3 ^ 26) + ((r3 & 26) << 1);
                    r3 = (char) (19345 - (~(-(-(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)))));
                    r9 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                    r13 = (r9 * (-380)) + 369012;
                    r15 = ~r9;
                    r14 = ((r80 | 966) | r15) * (-381);
                    r16 = ((r13 | r14) << 1) - (r13 ^ r14);
                    r13 = (~((r15 ^ (-967)) | (r15 & (-967)))) | (~(r6 | 966));
                    r9 = ~((r9 & 966) | (r9 ^ 966));
                    r9 = -(-(((r9 & r13) | (r13 ^ r9)) * 381));
                    r13 = ((r16 | r9) << 1) - (r16 ^ r9);
                    r9 = (~((r15 ^ 966) | (r15 & 966))) * 381;
                    r14 = ((r13 | r9) << 1) - (r9 ^ r13);
                    r9 = new java.lang.Object[1];
                    b(r3, r5, r14, r9);
                    r13 = (java.lang.String) r9[0];
                    r3 = -((android.os.Process.getThreadPriority(0) + 20) >> 6);
                    r5 = ((r3 | 23) << 1) - (r3 ^ 23);
                    r3 = (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                    r9 = -(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)));
                    r14 = ((r9 | 993) << 1) - (r9 ^ 993);
                    r9 = new java.lang.Object[1];
                    b(r3, r5, r14, r9);
                    r14 = (java.lang.String) r9[0];
                    r5 = (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33;
                    r3 = -(android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1));
                    r15 = -android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0);
                    r4 = ((r15 | 1014) << 1) - (r15 ^ 1014);
                    r15 = new java.lang.Object[1];
                    b((char) ((r3 & 21987) + (r3 | 21987)), r5, r4, r15);
                    r63 = new java.lang.String[]{r10, r11, r2, r13, r14, (java.lang.String) r15[0], r12};
                    r2 = 12 - (~(-android.text.TextUtils.indexOf("", "", 0, 0)));
                    r3 = -android.text.TextUtils.lastIndexOf("", '0');
                    r9 = new java.lang.Object[1];
                    b((char) ((r3 & 1885) + (r3 | 1885)), r2, 1047 - (~(-(-android.view.KeyEvent.normalizeMetaState(0)))), r9);
                    r2 = (java.lang.String) r9[0];
                    r10 = new java.lang.Object[1];
                    b((char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.view.View.combineMeasuredStates(0, 0) + 7, 626 - (~(-(-android.view.KeyEvent.getDeadChar(0, 0)))), r10);
                    r64 = new java.lang.String[]{r2, (java.lang.String) r10[0]};
                    r2 = 29 - (~(-(android.view.ViewConfiguration.getJumpTapTimeout() >> 16)));
                    r3 = -(-android.text.TextUtils.indexOf("", "", 0, 0));
                    r4 = -(-(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > com.socure.docv.capturesdk.common.utils.ConstantsKt.UNSET ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == com.socure.docv.capturesdk.common.utils.ConstantsKt.UNSET ? 0 : -1)));
                    r9 = (r4 & 1061) + (r4 | 1061);
                    r4 = new java.lang.Object[1];
                    b((char) ((r3 & 10232) + (r3 | 10232)), r2, r9, r4);
                    r2 = (java.lang.String) r4[0];
                    r3 = android.view.MotionEvent.axisFromString("") + 12;
                    r4 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
                    r5 = -android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0');
                    r9 = (r5 & 1090) + (r5 | 1090);
                    r5 = new java.lang.Object[1];
                    b((char) ((40953 & r4) + (r4 | 40953)), r3, r9, r5);
                    r65 = new java.lang.String[]{r2, (java.lang.String) r5[0]};
                    r2 = -(-android.text.TextUtils.getCapsMode("", 0, 0));
                    r3 = ((r2 | 19) << 1) - (r2 ^ 19);
                    r2 = (char) ((-1) - android.text.TextUtils.lastIndexOf("", '0', 0, 0));
                    r4 = -android.graphics.Color.red(0);
                    r5 = (r4 & 1102) + (r4 | 1102);
                    r4 = new java.lang.Object[1];
                    b(r2, r3, r5, r4);
                    r2 = (java.lang.String) r4[0];
                    r3 = -android.view.View.resolveSizeAndState(0, 0, 0);
                    r9 = new java.lang.Object[1];
                    b((char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), ((r3 | 5) << 1) - (r3 ^ 5), 1122 - (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)), r9);
                    r66 = new java.lang.String[]{r2, (java.lang.String) r9[0]};
                    r2 = 18 - (~(-(-android.view.View.resolveSize(0, 0))));
                    r3 = (char) (android.os.Process.myTid() >> 22);
                    r4 = -android.text.AndroidCharacter.getMirror('0');
                    r5 = ((r4 | 1174) << 1) - (r4 ^ 1174);
                    r4 = new java.lang.Object[1];
                    b(r3, r2, r5, r4);
                    r67 = new java.lang.String[]{(java.lang.String) r4[0]};
                    r2 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                    r3 = ((r2 | 16) << 1) - (r2 ^ 16);
                    r2 = -android.view.View.MeasureSpec.getMode(0);
                    r4 = -(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                    r5 = (r4 & 1145) + (r4 | 1145);
                    r4 = new java.lang.Object[1];
                    b((char) ((r2 & 7495) + (r2 | 7495)), r3, r5, r4);
                    r68 = new java.lang.String[]{(java.lang.String) r4[0]};
                    r2 = -android.text.TextUtils.getOffsetBefore("", 0);
                    r9 = new java.lang.Object[1];
                    b((char) ((-android.widget.ExpandableListView.getPackedPositionChild(0)) - 1), (r2 & 19) + (r2 | 19), 1160 - (~android.view.View.MeasureSpec.getMode(0)), r9);
                    r69 = new java.lang.String[]{(java.lang.String) r9[0]};
                    r2 = 17 - (~(-(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)))));
                    r3 = (char) android.view.KeyEvent.keyCodeFromString("");
                    r4 = -(-android.graphics.Color.red(0));
                    r9 = (r4 ^ 1180) + ((r4 & 1180) << 1);
                    r4 = new java.lang.Object[1];
                    b(r3, r2, r9, r4);
                    r70 = new java.lang.String[]{(java.lang.String) r4[0]};
                    r2 = 22 - (~(-(android.view.ViewConfiguration.getFadingEdgeLength() >> 16)));
                    r3 = (char) (62213 - android.graphics.Color.green(0));
                    r4 = android.graphics.Color.blue(0);
                    r9 = (r4 & 1199) + (r4 | 1199);
                    r4 = new java.lang.Object[1];
                    b(r3, r2, r9, r4);
                    r71 = new java.lang.String[]{(java.lang.String) r4[0]};
                    r2 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    r3 = (r2 & 21) + (r2 | 21);
                    r2 = (char) (52200 - (~android.text.TextUtils.lastIndexOf("", '0', 0)));
                    r4 = -android.graphics.Color.rgb(0, 0, 0);
                    r9 = ((-16775994) & r4) + (r4 | (-16775994));
                    r4 = new java.lang.Object[1];
                    b(r2, r3, r9, r4);
                    r72 = new java.lang.String[]{(java.lang.String) r4[0]};
                    r2 = 22 - (~(-(-(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))));
                    r3 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    r4 = -android.text.AndroidCharacter.getMirror('0');
                    r5 = (r4 ^ 1291) + ((r4 & 1291) << 1);
                    r4 = new java.lang.Object[1];
                    b((char) ((r3 & 11916) + (r3 | 11916)), r2, r5, r4);
                    r73 = new java.lang.String[]{(java.lang.String) r4[0], r12};
                    r2 = -(-android.view.KeyEvent.getDeadChar(0, 0));
                    r5 = new java.lang.Object[1];
                    b((char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), ((r2 | 28) << 1) - (r2 ^ 28), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 1267, r5);
                    r74 = new java.lang.String[]{(java.lang.String) r5[0], r12};
                    r2 = android.widget.ExpandableListView.getPackedPositionChild(0);
                    r3 = (r2 & 28) + (r2 | 28);
                    r2 = android.text.AndroidCharacter.getMirror('0');
                    r5 = r6 | r2;
                    r4 = (((r2 * 65485) + 1577280) - (~(-(-((~((r5 & 29760) | (r5 ^ 29760))) * 52))))) - 1;
                    r5 = ~(((-29761) ^ r6) | ((-29761) & r6));
                    r9 = ~((35775 ^ r2) | (35775 & r2));
                    r4 = (r4 - (~(-(-((((r5 & r9) | (r5 ^ r9)) | (~((r6 ^ r2) | (r6 & r2)))) * (-52)))))) - 1;
                    r2 = ~r2;
                    r5 = ~((r2 ^ r6) | (r2 & r6));
                    r2 = ~(r2 | 29760);
                    r2 = ((r2 & r5) | (r5 ^ r2)) * 52;
                    r5 = new java.lang.Object[1];
                    b((char) ((r4 ^ r2) + ((r2 & r4) << 1)), r3, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 1295, r5);
                    r75 = new java.lang.String[]{(java.lang.String) r5[0], r12};
                    r2 = -android.view.KeyEvent.keyCodeFromString("");
                    r3 = (r2 ^ 31) + ((r2 & 31) << 1);
                    r4 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                    r9 = (r4 ^ 1322) + ((r4 & 1322) << 1);
                    r4 = new java.lang.Object[1];
                    b((char) ((-(-(android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)))) - 1), r3, r9, r4);
                    r76 = new java.lang.String[]{(java.lang.String) r4[0], r12};
                    r2 = -(-android.view.View.MeasureSpec.getMode(0));
                    r3 = ((r2 | 27) << 1) - (r2 ^ 27);
                    r2 = (char) (android.os.Process.myPid() >> 22);
                    r4 = -(-(android.view.ViewConfiguration.getTapTimeout() >> 16));
                    r5 = ((r4 | 1353) << 1) - (r4 ^ 1353);
                    r4 = new java.lang.Object[1];
                    b(r2, r3, r5, r4);
                    r5 = 0;
                    r77 = new java.lang.String[]{(java.lang.String) r4[0], r12};
                    r2 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
                    r3 = (r2 & 32) + (r2 | 32);
                    r2 = android.view.View.MeasureSpec.getSize(0);
                    r4 = -(-android.view.View.MeasureSpec.getSize(0));
                    r9 = ((r4 | 1380) << 1) - (r4 ^ 1380);
                    r4 = new java.lang.Object[1];
                    b((char) ((r2 ^ 25060) + ((r2 & 25060) << 1)), r3, r9, r4);
                    r2 = new java.lang.String[][]{r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, new java.lang.String[]{(java.lang.String) r4[0], r12}};
                    r3 = new java.util.ArrayList();
                    r10 = r80;
                    r4 = 0;
                    r9 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:307:0x265f, code lost:
                
                    r11 = r2[r4];
                 */
                /* JADX WARN: Code restructure failed: missing block: B:308:0x2663, code lost:
                
                    r12 = new java.lang.Object[]{r11[r5]};
                    r13 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.f(-417469134);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:309:0x266b, code lost:
                
                    if (r13 == null) goto L264;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:310:0x266d, code lost:
                
                    r13 = 6202 - android.graphics.Color.green(r5);
                    r14 = (char) android.view.KeyEvent.keyCodeFromString("");
                    r42 = 51 - android.view.View.MeasureSpec.getSize(r5);
                    r16 = r2;
                    r2 = new java.lang.Object[1];
                    c(r5, r5, r33, r2);
                    r13 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.g(r13, r14, r42, 1857630294, (java.lang.String) r2[r5], new java.lang.Class[]{java.lang.String.class});
                 */
                /* JADX WARN: Code restructure failed: missing block: B:311:0x26a0, code lost:
                
                    r5 = (java.lang.String) ((java.lang.reflect.Method) r13).invoke(null, r12);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:312:0x26a9, code lost:
                
                    r2 = (java.lang.String[]) java.util.Arrays.copyOfRange(r11, 1, r11.length);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:313:0x26b1, code lost:
                
                    if (r5 != null) goto L269;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:317:0x26ba, code lost:
                
                    if (r11.length != 1) goto L273;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:318:0x26bc, code lost:
                
                    r11 = r2.length;
                    r12 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:320:0x26c0, code lost:
                
                    com.fingerprintjs.android.fpjs_pro_internal.r0.a();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:321:0x26c9, code lost:
                
                    if (r5.contains(r2[r12]) != false) goto L434;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:322:0x26d4, code lost:
                
                    r12 = r12 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:324:0x26cb, code lost:
                
                    com.fingerprintjs.android.fpjs_pro_internal.P29109$2.k = (com.fingerprintjs.android.fpjs_pro_internal.P29109$2.l + 71) % 128;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:326:0x271e, code lost:
                
                    r4 = r4 + 1;
                    r2 = r16;
                    r5 = 0;
                    r33 = 2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:327:0x26d7, code lost:
                
                    r2 = (r9 ^ 1) + ((r9 & 1) << 1);
                    r10 = r80 ^ (r4 + 10);
                    r9 = new java.lang.StringBuilder(r5);
                    r11 = (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1));
                    r14 = (char) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 1);
                    r15 = android.os.Process.getThreadPriority(0);
                    r12 = new java.lang.Object[1];
                    b(r14, r11, 1412 - (((r15 ^ 20) + ((r15 & 20) << 1)) >> 6), r12);
                    r9.append((java.lang.String) r12[0]);
                    r9.append(r5);
                    r3.add(r9.toString());
                    r9 = r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:331:0x269e, code lost:
                
                    r16 = r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:334:0x2729, code lost:
                
                    if (r9 > r33) goto L283;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:335:0x272b, code lost:
                
                    com.fingerprintjs.android.fpjs_pro_internal.P29109$2.k = (com.fingerprintjs.android.fpjs_pro_internal.P29109$2.l + 11) % 128;
                    r2 = new java.lang.Object[5];
                    r4 = new int[1];
                    r2[0] = r4;
                    r5 = new int[1];
                    r2[1] = r5;
                    r9 = new int[1];
                    r2[r28] = r9;
                    r5[0] = r80;
                    r4[0] = r10;
                    r2[4] = r3;
                    r2[2] = null;
                    r11 = (-1) - (~((((~(904790346 | r6)) | (-662212719)) * 494) + ((((-34639909) | r6) * 494) + 1932216974)));
                    r3 = r11 << 13;
                    r3 = (r3 | r11) & (~(r11 & r3));
                    r4 = r3 >>> 17;
                    r3 = (r3 | r4) & (~(r3 & r4));
                    r4 = r3 << 5;
                    r52 = 0;
                    r9[0] = ((~r3) & r4) | ((~r4) & r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:336:0x27ff, code lost:
                
                    r3 = ((int[]) r2[r52])[r52];
                 */
                /* JADX WARN: Code restructure failed: missing block: B:337:0x2805, code lost:
                
                    if (r3 != r80) goto L287;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:338:0x2807, code lost:
                
                    r4 = new java.lang.Object[5];
                    r5 = new int[1];
                    r4[r52] = r5;
                    r6 = new int[1];
                    r4[1] = r6;
                    r4[r28] = new int[1];
                    r2 = (java.util.List) r2[4];
                    r6[r52] = r80;
                    r5[r52] = r3;
                    r4[4] = r2;
                    r4[2] = null;
                    r0 = (int) android.os.SystemClock.elapsedRealtime();
                    r0 = defpackage.hdi.d(((~(r0 | (-1101474135))) | 8726800) | (~((~r0) | 1207920990)), 988, (((~((-1092747335) | r2)) | (~(1207920990 | r0))) * 988) - 988039894, 16, r82);
                    r1 = r0 << 13;
                    r0 = ((~r0) & r1) | ((~r1) & r0);
                    r1 = r0 >>> 17;
                    r0 = (r0 | r1) & (~(r0 & r1));
                    r1 = r0 << 5;
                    ((int[]) r4[r28])[0] = (r0 | r1) & (~(r0 & r1));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:339:0x2872, code lost:
                
                    return r4;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:340:0x2873, code lost:
                
                    r5 = r52;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:341:0x2784, code lost:
                
                    r2 = new java.lang.Object[5];
                    r3 = new int[1];
                    r2[0] = r3;
                    r4 = new int[1];
                    r2[1] = r4;
                    r2[r28] = new int[1];
                    r4[0] = r80;
                    r3[0] = r80;
                    r2[4] = null;
                    r2[2] = null;
                    r3 = (int) android.os.Process.getElapsedCpuTime();
                    r4 = ~r3;
                    r3 = -(-((((~(r3 | (-67441281))) | ((~(r4 | 1143306144)) | (~(73341646 | r4)))) * 568) + (((((~((-73341647) | r3)) | (~((-1143306145) | r3))) | (~(1149206510 | r4))) * (-568)) + (((((~((-73341647) | r4)) | 67441280) | (~((-1143306145) | r4))) * (-1136)) + 782857854))));
                    r4 = (r3 << 1) - r3;
                    r3 = (r4 << 13) ^ r4;
                    r4 = r3 >>> 17;
                    r3 = ((~r3) & r4) | ((~r4) & r3);
                    r4 = r3 << 5;
                    r52 = 0;
                    ((int[]) r2[r28])[0] = ((~r3) & r4) | ((~r4) & r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:342:0x18c0, code lost:
                
                    r2 = r80;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:343:0x148b, code lost:
                
                    r2 = r80 ^ 260;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:344:0x1491, code lost:
                
                    r2 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                    r3 = (r2 & 13) + (r2 | 13);
                    r2 = -(-(android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                    r4 = -(-android.text.TextUtils.lastIndexOf("", '0', 0, 0));
                    r11 = ((r4 | 596) << 1) - (r4 ^ 596);
                    r4 = new java.lang.Object[1];
                    b((char) (((r2 | 41060) << 1) - (r2 ^ 41060)), r3, r11, r4);
                    r2 = (java.lang.String) r4[0];
                    r3 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    r4 = com.fingerprintjs.android.fpjs_pro_internal.r0.a();
                    r10 = r3 * (-515);
                    r11 = (r10 ^ 5170) + ((r10 & 5170) << 1);
                    r10 = ~(((-11) & r4) | ((-11) ^ r4));
                    r13 = ~r4;
                    r15 = ~(r13 | r3);
                    r11 = (r11 - (~((((r10 ^ r15) | (r10 & r15)) | (~((r13 ^ 10) | (r13 & 10)))) * (-516)))) - 1;
                    r3 = ~r3;
                    r10 = (r3 ^ (-11)) | (r3 & (-11));
                    r4 = ~((r4 & r10) | (r10 ^ r4));
                    r10 = (r3 ^ r13) | (r3 & r13);
                    r11 = (r11 - (~(-(-((r4 | (~((r10 & 10) | (r10 ^ 10)))) * 516))))) - 1;
                    r3 = ~(r3 | 10);
                    r4 = ~(r13 | 10);
                    r3 = (((r3 & r4) | (r3 ^ r4)) * 516) + r11;
                    r4 = (char) (59520 - (~android.widget.ExpandableListView.getPackedPositionType(0)));
                    r10 = -(android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1));
                    r11 = (r10 ^ 609) + ((r10 & 609) << 1);
                    r10 = new java.lang.Object[1];
                    b(r4, r3, r11, r10);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:345:0x1545, code lost:
                
                    r10 = new java.lang.Object[]{r2, (java.lang.String) r10[0]};
                    r2 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.f(1730286819);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:346:0x1552, code lost:
                
                    if (r2 == null) goto L215;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:347:0x1554, code lost:
                
                    r2 = ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 3265;
                    r4 = (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)));
                    r45 = android.view.View.resolveSizeAndState(0, 0, 0) + 52;
                    r11 = new java.lang.Object[1];
                    c(1, 2, -1, r11);
                    r2 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.g(r2, r4, r45, -293156473, (java.lang.String) r11[0], new java.lang.Class[]{java.lang.String.class, java.lang.String.class});
                 */
                /* JADX WARN: Code restructure failed: missing block: B:348:0x158b, code lost:
                
                    r2 = ((java.lang.Long) ((java.lang.reflect.Method) r2).invoke(null, r10)).longValue();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:349:0x1598, code lost:
                
                    r43 = (253 * r2) - 25832727173L;
                    r10 = r2 ^ (-1);
                    r45 = (102105640 | r10) ^ (-1);
                    r12 = (int) java.lang.Runtime.getRuntime().freeMemory();
                    r10 = r10 | (r12 ^ (-1));
                    r2 = (-102105641) | r2;
                    r12 = (r12 | r2) ^ (-1);
                    r2 = com.fingerprintjs.android.fpjs_pro.g.e(252, ((r10 | (-102105641)) ^ (-1)) | r12, ((-252) * r2) + ((((r45 | (r10 ^ (-1))) | r12) * (-252)) + r43), -1577672755);
                    r4 = ((int) (r2 >> r81)) & defpackage.k84.a(~(android.os.Process.myTid() | (-1141449985)), -1504, (((~((-1276755213) | r10)) | 135305228) * 1504) - 1320242614, 1121869024);
                    r2 = ((int) r2) & defpackage.k84.a((~(52571929 | r80)) | 1351090304, 490, ((1403662233 | r6) * (-490)) - 1322647409, -124137568);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:350:0x1628, code lost:
                
                    if (((r2 & r4) | (r4 ^ r2)) != 0) goto L219;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:351:0x162a, code lost:
                
                    r2 = (r80 & (-262)) | (r6 & 261);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:352:0x1630, code lost:
                
                    r2 = r80;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:354:0x146b, code lost:
                
                    r4 = "";
                 */
                /* JADX WARN: Removed duplicated region for block: B:104:0x0d97  */
                /* JADX WARN: Removed duplicated region for block: B:106:0x0e0f  */
                /* JADX WARN: Removed duplicated region for block: B:119:0x0eeb  */
                /* JADX WARN: Removed duplicated region for block: B:121:0x0f66  */
                /* JADX WARN: Removed duplicated region for block: B:203:0x28b1 A[Catch: all -> 0x37a1, TryCatch #0 {all -> 0x37a1, blocks: (B:6:0x00f3, B:8:0x0100, B:9:0x0136, B:24:0x02de, B:26:0x02e8, B:27:0x031b, B:37:0x0450, B:39:0x045e, B:40:0x0496, B:48:0x073c, B:50:0x0742, B:51:0x0775, B:83:0x0ab4, B:85:0x0abe, B:86:0x0af4, B:95:0x0d19, B:97:0x0d23, B:98:0x0d5b, B:122:0x0f8f, B:124:0x0f99, B:125:0x0fd1, B:364:0x1259, B:366:0x1263, B:367:0x1291, B:137:0x129d, B:139:0x12a7, B:140:0x12d8, B:169:0x16a5, B:171:0x16ab, B:172:0x16dd, B:177:0x17cf, B:179:0x17e0, B:180:0x181a, B:188:0x195d, B:190:0x1967, B:191:0x1996, B:193:0x199f, B:195:0x19b6, B:196:0x19ee, B:201:0x28a7, B:203:0x28b1, B:204:0x28e6, B:214:0x2df4, B:216:0x2dfe, B:217:0x2e30, B:222:0x2efb, B:224:0x2f08, B:225:0x2f3d, B:246:0x3266, B:248:0x3277, B:249:0x32b0, B:278:0x35ad, B:280:0x35b7, B:281:0x35e9, B:298:0x28f2, B:300:0x290c, B:301:0x293e, B:308:0x2663, B:310:0x266d, B:311:0x26a0, B:345:0x1545, B:347:0x1554, B:348:0x158b, B:381:0x0b99, B:383:0x0ba3, B:384:0x0bd7, B:400:0x05ae, B:402:0x05b8, B:403:0x05e7, B:409:0x0668, B:411:0x0672, B:412:0x06a9), top: B:5:0x00f3 }] */
                /* JADX WARN: Removed duplicated region for block: B:206:0x28ef  */
                /* JADX WARN: Removed duplicated region for block: B:213:0x2dea  */
                /* JADX WARN: Removed duplicated region for block: B:230:0x2fe6  */
                /* JADX WARN: Removed duplicated region for block: B:238:0x2fe3 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:243:0x3248  */
                /* JADX WARN: Removed duplicated region for block: B:256:0x339b  */
                /* JADX WARN: Removed duplicated region for block: B:258:0x3404  */
                /* JADX WARN: Removed duplicated region for block: B:275:0x34cd  */
                /* JADX WARN: Removed duplicated region for block: B:277:0x357c  */
                /* JADX WARN: Removed duplicated region for block: B:296:0x3398 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:298:0x28f2 A[Catch: all -> 0x37a1, TryCatch #0 {all -> 0x37a1, blocks: (B:6:0x00f3, B:8:0x0100, B:9:0x0136, B:24:0x02de, B:26:0x02e8, B:27:0x031b, B:37:0x0450, B:39:0x045e, B:40:0x0496, B:48:0x073c, B:50:0x0742, B:51:0x0775, B:83:0x0ab4, B:85:0x0abe, B:86:0x0af4, B:95:0x0d19, B:97:0x0d23, B:98:0x0d5b, B:122:0x0f8f, B:124:0x0f99, B:125:0x0fd1, B:364:0x1259, B:366:0x1263, B:367:0x1291, B:137:0x129d, B:139:0x12a7, B:140:0x12d8, B:169:0x16a5, B:171:0x16ab, B:172:0x16dd, B:177:0x17cf, B:179:0x17e0, B:180:0x181a, B:188:0x195d, B:190:0x1967, B:191:0x1996, B:193:0x199f, B:195:0x19b6, B:196:0x19ee, B:201:0x28a7, B:203:0x28b1, B:204:0x28e6, B:214:0x2df4, B:216:0x2dfe, B:217:0x2e30, B:222:0x2efb, B:224:0x2f08, B:225:0x2f3d, B:246:0x3266, B:248:0x3277, B:249:0x32b0, B:278:0x35ad, B:280:0x35b7, B:281:0x35e9, B:298:0x28f2, B:300:0x290c, B:301:0x293e, B:308:0x2663, B:310:0x266d, B:311:0x26a0, B:345:0x1545, B:347:0x1554, B:348:0x158b, B:381:0x0b99, B:383:0x0ba3, B:384:0x0bd7, B:400:0x05ae, B:402:0x05b8, B:403:0x05e7, B:409:0x0668, B:411:0x0672, B:412:0x06a9), top: B:5:0x00f3 }] */
                /* JADX WARN: Removed duplicated region for block: B:75:0x0987  */
                /* JADX WARN: Removed duplicated region for block: B:77:0x09f8  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Object[] vD14832N6715(Context context, int i2, int i3, int i4) {
                    short s;
                    String str;
                    Object obj;
                    int i5;
                    char c2;
                    int i6;
                    int i7;
                    short s2;
                    int i8;
                    boolean z;
                    int i9;
                    int i10;
                    int i11;
                    int i12;
                    int i13;
                    long j2;
                    int i14;
                    int i15;
                    int i16;
                    int i17;
                    String str2;
                    String str3;
                    int i18 = 0;
                    Object[] objArr2 = new Object[1];
                    b((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7, 716 - (~Color.alpha(0)), objArr2);
                    String str4 = (String) objArr2[0];
                    int i19 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int i20 = ((i19 | 27) << 1) - (i19 ^ 27);
                    int i21 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    short s3 = -1;
                    Object[] objArr3 = new Object[1];
                    b((char) ((i21 & 1) + (i21 | 1)), i20, (-((byte) KeyEvent.getModifierMetaStateMask())) - 1, objArr3);
                    String str5 = (String) objArr3[0];
                    Object[] objArr4 = new Object[1];
                    b((char) (ViewConfiguration.getScrollBarSize() >> 8), 23 - (~(-TextUtils.indexOf((CharSequence) "", '0', 0))), (-16777189) - Color.rgb(0, 0, 0), objArr4);
                    String str6 = (String) objArr4[0];
                    int i22 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                    int i23 = (i22 & 18) + (i22 | 18);
                    char c3 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i24 = -(ViewConfiguration.getEdgeSlop() >> 16);
                    int i25 = (i24 & 52) + (i24 | 52);
                    Object[] objArr5 = new Object[1];
                    b(c3, i23, i25, objArr5);
                    String str7 = (String) objArr5[0];
                    int i26 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int i27 = ((i26 | 29) << 1) - (i26 ^ 29);
                    int i28 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int i29 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                    Object[] objArr6 = new Object[1];
                    b((char) ((i28 ^ 22231) + ((i28 & 22231) << 1)), i27, (i29 & 70) + (i29 | 70), objArr6);
                    String[] strArr = {str5, str6, str7, (String) objArr6[0]};
                    int i30 = 0;
                    while (true) {
                        s = 2;
                        if (i30 >= 4) {
                            str = str4;
                            obj = null;
                            i5 = 4;
                            c2 = ' ';
                            i6 = i2;
                            break;
                        }
                        int i31 = k;
                        c2 = ' ';
                        l = ((i31 & 13) + (i31 | 13)) % 128;
                        try {
                            Object[] objArr7 = {strArr[i30]};
                            Object f = rV4669.f(-1567326429);
                            if (f == null) {
                                i5 = 4;
                                int i32 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6045;
                                char c4 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > ConstantsKt.UNSET ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == ConstantsKt.UNSET ? 0 : -1));
                                int i33 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 52;
                                Object[] objArr8 = new Object[1];
                                c(0, 2, s3, objArr8);
                                f = rV4669.g(i32, c4, i33, 724607559, (String) objArr8[0], new Class[]{String.class});
                            } else {
                                i5 = 4;
                            }
                            long longValue = ((Long) ((Method) f).invoke(null, objArr7)).longValue();
                            obj = null;
                            long j3 = ((-216) * longValue) + 288355679716L;
                            str = str4;
                            long j4 = (int) Runtime.getRuntime().totalMemory();
                            long j5 = j4 ^ (-1);
                            long j6 = longValue ^ (-1);
                            long e = com.fingerprintjs.android.fpjs_pro.g.e(217L, (-665948452) | ((j6 | j5) ^ (-1)), ((((665948451 | j4) ^ (-1)) | ((665948451 | j6) ^ (-1))) * 217) + ((((665948451 | j5) ^ (-1)) | ((j6 | j4) ^ (-1))) * 217) + j3, 1168702691L);
                            int a = ((int) (e >> 32)) & k84.a(~((~((int) Runtime.getRuntime().maxMemory())) | 1985207634), -948, (((~(907136322 | r11)) | 1950604562) * (-948)) - 1492327446, 190611724);
                            int b = hdi.b(846350583);
                            int i34 = ((int) e) & (((~((~b) | (-1159987205))) * 476) + ((~((-1159987205) | b)) * 952) + (((276931153 | r11) * (-476)) - 865111679));
                            if (((i34 & a) | (a ^ i34)) != 0) {
                                int i35 = (i30 & 190) + (i30 | 190);
                                i6 = (i35 & (~i2)) | ((~i35) & i2);
                                break;
                            }
                            i30 = (i30 | 1) + (i30 & 1);
                            str4 = str;
                            s3 = -1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    int i36 = 3;
                    if (i6 != i2) {
                        Object[] objArr9 = new Object[5];
                        int[] iArr = new int[1];
                        objArr9[0] = iArr;
                        int[] iArr2 = new int[1];
                        objArr9[1] = iArr2;
                        int[] iArr3 = new int[1];
                        objArr9[3] = iArr3;
                        iArr2[0] = i2;
                        iArr[0] = i6;
                        objArr9[i5] = obj;
                        objArr9[2] = obj;
                        int i37 = ~i2;
                        int i38 = (((~(i2 | (-397479846))) | (~(i37 | 819167945))) * 979) + ((i2 | 819167945) * (-979)) + ((~((-397479846) | i37)) * 979) + 1732437274;
                        int i39 = -(-((i38 ^ 16) + ((i38 & 16) << 1)));
                        int i40 = ((i4 | i39) << 1) - (i39 ^ i4);
                        int i41 = i40 << 13;
                        int i42 = (i41 & (~i40)) | ((~i41) & i40);
                        int i43 = i42 >>> 17;
                        int i44 = ((~i42) & i43) | ((~i43) & i42);
                        iArr3[0] = i44 ^ (i44 << 5);
                        return objArr9;
                    }
                    int resolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 12;
                    char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                    int i45 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    int i46 = ((i45 | 98) << 1) - (i45 ^ 98);
                    Object[] objArr10 = new Object[1];
                    b(absoluteGravity, resolveSizeAndState, i46, objArr10);
                    String str8 = (String) objArr10[0];
                    int i47 = 12 - (~(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))));
                    char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                    int i48 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    int i49 = (i48 ^ 110) + ((i48 & 110) << 1);
                    Object[] objArr11 = new Object[1];
                    b(offsetBefore, i47, i49, objArr11);
                    String str9 = (String) objArr11[0];
                    int i50 = -(-TextUtils.lastIndexOf("", '0', 0, 0));
                    int i51 = (i50 & 19) + (i50 | 19);
                    char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int i52 = -KeyEvent.keyCodeFromString("");
                    int i53 = ((i52 | 123) << 1) - (i52 ^ 123);
                    Object[] objArr12 = new Object[1];
                    b(scrollDefaultDelay, i51, i53, objArr12);
                    String[] strArr2 = {str8, str9, (String) objArr12[0]};
                    int i54 = 0;
                    while (true) {
                        if (i54 >= i36) {
                            i7 = i36;
                            s2 = s;
                            i8 = i2;
                            break;
                        }
                        Object[] objArr13 = {strArr2[i54]};
                        Object f2 = rV4669.f(-668483483);
                        if (f2 == null) {
                            int resolveSize = View.resolveSize(0, 0) + 6046;
                            char normalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 52;
                            i7 = i36;
                            Object[] objArr14 = new Object[1];
                            c(1, s, (short) -1, objArr14);
                            f2 = rV4669.g(resolveSize, normalizeMetaState, pressedStateDuration, 1367547137, (String) objArr14[0], new Class[]{String.class});
                        } else {
                            i7 = i36;
                        }
                        long longValue2 = ((Long) ((Method) f2).invoke(obj, objArr13)).longValue();
                        short s4 = s;
                        long j7 = i2;
                        long j8 = j7 ^ (-1);
                        long j9 = ((-672) * ((((-1471537406) | j8) ^ (-1)) | ((j7 | longValue2) ^ (-1)))) + ((longValue2 | ((1471537405 | j7) ^ (-1))) * 672) + ((-1343) * longValue2) + 990344673565L;
                        long j10 = longValue2 ^ (-1);
                        long e2 = com.fingerprintjs.android.fpjs_pro.g.e(672L, ((j10 | j8) ^ (-1)) | ((j10 | 1471537405) ^ (-1)), j9, 468012602L);
                        s2 = s4;
                        int i55 = ((int) (e2 >> c2)) & ((((~((~hdi.a()) | 1428479632)) | 1048900) * (-964)) + (((1429261252 | (~(1428479632 | r14))) * (-964)) - 2104260170));
                        int i56 = (((~((-599188946) | i2)) | 43435136) * 345) + 484646344;
                        int i57 = ~i2;
                        int i58 = ((int) e2) & (((~((-43435137) | i2)) * 345) + (((~((-599188946) | i57)) | (-2079850492)) * 345) + i56);
                        if (((i55 & i58) | (i55 ^ i58)) != 0) {
                            int i59 = i54 + 270;
                            i8 = ((~i59) & i2) | (i59 & i57);
                            break;
                        }
                        i54++;
                        i36 = i7;
                        s = s2;
                        obj = null;
                    }
                    if (i8 != i2) {
                        Object[] objArr15 = new Object[5];
                        int[] iArr4 = new int[1];
                        objArr15[0] = iArr4;
                        int[] iArr5 = new int[1];
                        objArr15[1] = iArr5;
                        int[] iArr6 = new int[1];
                        objArr15[i7] = iArr6;
                        iArr5[0] = i2;
                        iArr4[0] = i8;
                        objArr15[i5] = null;
                        objArr15[s2] = null;
                        int i60 = (((~((~i2) | (-846211397))) | 84164616) * 241) + ((((~((-989347286) | r0)) | 143135889) * (-241)) - 1751144601);
                        int i61 = (i60 ^ 16) + ((i60 & 16) << 1) + i4;
                        int i62 = i61 << 13;
                        int i63 = (i62 & (~i61)) | ((~i62) & i61);
                        int i64 = i63 >>> 17;
                        int i65 = ((~i63) & i64) | ((~i64) & i63);
                        int i66 = i65 << 5;
                        iArr6[0] = (i65 | i66) & (~(i65 & i66));
                        return objArr15;
                    }
                    int i67 = -(-TextUtils.indexOf((CharSequence) "", '0'));
                    Object[] objArr16 = new Object[1];
                    b((char) ((-2) - (~(-ExpandableListView.getPackedPositionChild(0L)))), (i67 & 15) + (i67 | 15), 140 - (~Color.alpha(0)), objArr16);
                    Object[] objArr17 = {(String) objArr16[0]};
                    Object f3 = rV4669.f(-1355975516);
                    if (f3 == null) {
                        int i68 = 6047 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        char rgb = (char) ((-16777216) - Color.rgb(0, 0, 0));
                        int normalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 52;
                        Object[] objArr18 = new Object[1];
                        c(0, (byte) (-m[6]), s2, objArr18);
                        f3 = rV4669.g(i68, rgb, normalizeMetaState2, 646556096, (String) objArr18[0], new Class[]{String.class});
                    }
                    long longValue3 = ((Long) ((Method) f3).invoke(null, objArr17)).longValue();
                    long j11 = longValue3 ^ (-1);
                    long elapsedRealtime = (int) SystemClock.elapsedRealtime();
                    long j12 = j11 | (-170003651);
                    long e3 = com.fingerprintjs.android.fpjs_pro.g.e(130L, ((170003650 | longValue3) ^ (-1)) | ((j12 | elapsedRealtime) ^ (-1)), ((j12 ^ (-1)) * (-260)) + ((((j11 | (elapsedRealtime ^ (-1))) | (-170003651)) ^ (-1)) * 130) + (131 * longValue3) + 21930470979L, -170513988L);
                    int i69 = ~i2;
                    int i70 = ((int) (e3 >> c2)) & ((((~(836587331 | i2)) | 811092737) * 49) + (((~(2021153553 | i69)) | 836587331 | (~((-2021153554) | i2))) * (-49)) + (((~(836587331 | i69)) | 1210060816) * 98) + 1566129984);
                    int i71 = ~((-994965716) | i69);
                    int i72 = ((int) e3) & (((i71 | (-996015320)) * 374) + ((1049604 | i71) * (-374)) + 2097867709);
                    if (((i70 & i72) | (i70 ^ i72)) != 0) {
                        int i73 = k;
                        l = ((i73 ^ 21) + ((i73 & 21) << 1)) % 128;
                        i10 = (~(i2 & 266)) & (i2 | 266);
                        i9 = 6;
                        z = 24;
                    } else {
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 24;
                        char combineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        int i74 = -((byte) KeyEvent.getModifierMetaStateMask());
                        int a2 = r0.a();
                        int i75 = (i74 * 960) - 295218;
                        z = 24;
                        int i76 = ~a2;
                        i9 = 6;
                        int i77 = ((~((i74 ^ a2) | (i74 & a2))) | (~(((-155) ^ i76) | ((-155) & i76)))) * 959;
                        Object[] objArr19 = new Object[1];
                        b(combineMeasuredStates, threadPriority, (((~(((-155) & a2) | ((-155) ^ a2))) | (~((i76 & i74) | (i76 ^ i74)))) * 959) + (i75 ^ i77) + ((i77 & i75) << 1) + 148645, objArr19);
                        Object[] objArr20 = {(String) objArr19[0]};
                        Object f4 = rV4669.f(-417469134);
                        if (f4 == null) {
                            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 6202;
                            char c5 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int red = 51 - Color.red(0);
                            Object[] objArr21 = new Object[1];
                            c(0, 0, (short) 2, objArr21);
                            f4 = rV4669.g(offsetAfter, c5, red, 1857630294, (String) objArr21[0], new Class[]{String.class});
                        }
                        String str10 = (String) ((Method) f4).invoke(null, objArr20);
                        if (str10 == null || str10.length() == 0) {
                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24;
                            int i78 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                            int i79 = i78 * (-1975);
                            int i80 = (i79 & 1673388) + (i79 | 1673388);
                            int i81 = ~i78;
                            int i82 = ~((i81 & 1692) | (i81 ^ 1692));
                            int i83 = (((i2 ^ i82) | (i2 & i82)) * 988) + i80;
                            int i84 = ~(((-1693) ^ i78) | ((-1693) & i78));
                            int i85 = ~(i78 | i69);
                            int i86 = -(-(((i85 & i84) | (i84 ^ i85)) * (-1976)));
                            int i87 = (i83 ^ i86) + ((i86 & i83) << 1);
                            int i88 = ~(((-1693) ^ i2) | ((-1693) & i2));
                            int i89 = (i88 & i82) | (i82 ^ i88);
                            int i90 = ~((i69 ^ 1692) | (i69 & 1692));
                            char c6 = (char) ((((i89 & i90) | (i89 ^ i90)) * 988) + i87);
                            int edgeSlop = ViewConfiguration.getEdgeSlop() >> 16;
                            int i91 = (edgeSlop & 179) + (edgeSlop | 179);
                            Object[] objArr22 = new Object[1];
                            b(c6, maximumFlingVelocity, i91, objArr22);
                            Object[] objArr23 = {(String) objArr22[0]};
                            Object f5 = rV4669.f(-417469134);
                            if (f5 == null) {
                                int i92 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6202;
                                char lastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                                int i93 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 51;
                                Object[] objArr24 = new Object[1];
                                c(0, 0, (short) 2, objArr24);
                                f5 = rV4669.g(i92, lastIndexOf, i93, 1857630294, (String) objArr24[0], new Class[]{String.class});
                            }
                            String str11 = (String) ((Method) f5).invoke(null, objArr23);
                            if (str11 == null || str11.length() == 0) {
                                i10 = i2;
                            }
                        }
                        i10 = (~(i2 & 267)) & (i2 | 267);
                    }
                    if (i10 != i2) {
                        k = (l + 33) % 128;
                        Object[] objArr25 = new Object[5];
                        int[] iArr7 = new int[1];
                        objArr25[0] = iArr7;
                        int[] iArr8 = new int[1];
                        objArr25[1] = iArr8;
                        objArr25[i7] = new int[1];
                        iArr8[0] = i2;
                        iArr7[0] = i10;
                        objArr25[i5] = null;
                        objArr25[2] = null;
                        int elapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                        int i94 = ((1215517006 | elapsedRealtime2) * 614) - 229318366;
                        int i95 = ~elapsedRealtime2;
                        int i96 = (((~(i95 | 1216082398)) | (~((-565393) | i95))) * 614) + (((~((-134979799) | i95)) | 134414406 | (~(1081667992 | i95))) * (-1228)) + i94;
                        int i97 = -(-(((i96 | 16) << 1) - (i96 ^ 16)));
                        int i98 = (i4 & i97) + (i97 | i4);
                        int i99 = i98 << 13;
                        int i100 = (i99 | i98) & (~(i98 & i99));
                        int i101 = i100 >>> 17;
                        int i102 = (i100 | i101) & (~(i100 & i101));
                        int i103 = i102 << 5;
                        ((int[]) objArr25[i7])[0] = (i102 | i103) & (~(i102 & i103));
                        return objArr25;
                    }
                    Object f6 = rV4669.f(-409411793);
                    if (f6 == null) {
                        int i104 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6510;
                        char c7 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        int mode = 52 - View.MeasureSpec.getMode(0);
                        Object[] objArr26 = new Object[1];
                        c(1, 2, (short) -1, objArr26);
                        f6 = rV4669.g(i104, c7, mode, 1849426507, (String) objArr26[0], new Class[0]);
                    }
                    long longValue4 = ((Long) ((Method) f6).invoke(null, null)).longValue();
                    long j13 = i2;
                    long j14 = longValue4 | j13;
                    long e4 = com.fingerprintjs.android.fpjs_pro.g.e(465L, j14 | (-1465843508), (930 * (longValue4 | (((-1465843508) | j13) ^ (-1)))) + ((-465) * ((-1465843508) | (j14 ^ (-1)))) + (((-929) * longValue4) - 680151387248L), -1836518605L);
                    int maxMemory = (int) Runtime.getRuntime().maxMemory();
                    int i105 = ((1235331474 | maxMemory) * 614) - 353224130;
                    int i106 = ~maxMemory;
                    int i107 = ((int) (e4 >> c2)) & ((((~(i106 | (-811204706))) | (~(2046536179 | i106))) * 614) + (((~(i106 | (-2035982706))) | (~(821758179 | i106)) | 1224778000) * (-1228)) + i105);
                    int i108 = (int) e4;
                    int i109 = (int) Runtime.getRuntime().totalMemory();
                    int i110 = ~i109;
                    int i111 = i108 & ((((~(i109 | (-1078199301))) | (~(i110 | (-16794002)))) * 210) + (((~(187910555 | i110)) | (~(1249315854 | i109))) * 210) + 137511771);
                    int i112 = (i107 & i111) | (i107 ^ i111);
                    if (i112 != 0) {
                        int i113 = -(-(i112 - 1));
                        i11 = i2 ^ ((i113 ^ 200) + ((i113 & 200) << 1));
                    } else {
                        i11 = i2;
                    }
                    if (i11 != i2) {
                        Object[] objArr27 = new Object[5];
                        int[] iArr9 = new int[1];
                        objArr27[0] = iArr9;
                        int[] iArr10 = new int[1];
                        objArr27[1] = iArr10;
                        objArr27[i7] = new int[1];
                        iArr10[0] = i2;
                        iArr9[0] = i11;
                        objArr27[i5] = null;
                        objArr27[2] = null;
                        int a3 = hdi.a();
                        int i114 = (((~((-739612498) | a3)) | (~((-477035294) | a3))) * 140) + (((537986112 | r2) * (-280)) - 677249314);
                        int i115 = ~((-201626386) | a3);
                        int i116 = ~a3;
                        int i117 = (((~(i116 | (-275408909))) | i115 | (~((-537986113) | i116))) * 140) + i114;
                        int i118 = -(-((i117 & 16) + (i117 | 16)));
                        int i119 = (i4 & i118) + (i118 | i4);
                        int i120 = i119 << 13;
                        int i121 = (i120 & (~i119)) | ((~i120) & i119);
                        int i122 = i121 >>> 17;
                        int i123 = (i121 | i122) & (~(i121 & i122));
                        ((int[]) objArr27[i7])[0] = i123 ^ (i123 << 5);
                        return objArr27;
                    }
                    int i124 = -View.resolveSize(0, 0);
                    int i125 = ((i124 | 20) << 1) - (i124 ^ 20);
                    int trimmedLength = TextUtils.getTrimmedLength("");
                    int i126 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
                    int i127 = ((i126 | MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE) << 1) - (i126 ^ MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE);
                    Object[] objArr28 = new Object[1];
                    b((char) ((trimmedLength & 47242) + (trimmedLength | 47242)), i125, i127, objArr28);
                    String str12 = (String) objArr28[0];
                    Object[] objArr29 = new Object[1];
                    b((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6, TextUtils.getTrimmedLength("") + 223, objArr29);
                    String str13 = (String) objArr29[0];
                    File file = new File(str12);
                    if (file.exists()) {
                        int i128 = k;
                        int i129 = (i128 ^ 121) + ((i128 & 121) << 1);
                        l = i129 % 128;
                        if (i129 % 2 == 0) {
                            file.isFile();
                            throw null;
                        }
                        if (file.isFile()) {
                            try {
                                Scanner scanner = new Scanner(new FileInputStream(file));
                                int i130 = -(-Color.argb(0, 0, 0, 0));
                                int i131 = (i130 & 2) + (i130 | 2);
                                int resolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0);
                                Object[] objArr30 = new Object[1];
                                b((char) (((resolveSizeAndState2 | 54163) << 1) - (resolveSizeAndState2 ^ 54163)), i131, 227 - (~(-Process.getGidForName(""))), objArr30);
                                Scanner useDelimiter = scanner.useDelimiter((String) objArr30[0]);
                                if (useDelimiter.hasNext()) {
                                    str3 = useDelimiter.next();
                                } else {
                                    l = (k + 119) % 128;
                                    str3 = "";
                                }
                                useDelimiter.close();
                            } catch (IOException unused) {
                            }
                            if (str3.contains(str13)) {
                                int i132 = l + 117;
                                k = i132 % 128;
                                i12 = i132 % 2 != 0 ? (i2 & (-11912)) | (i69 & 11911) : i2 ^ 262;
                                if (i12 == i2) {
                                    l = (k + 33) % 128;
                                    Object[] objArr31 = new Object[5];
                                    int[] iArr11 = new int[1];
                                    objArr31[0] = iArr11;
                                    int[] iArr12 = new int[1];
                                    objArr31[1] = iArr12;
                                    objArr31[i7] = new int[1];
                                    iArr12[0] = i2;
                                    iArr11[0] = i12;
                                    objArr31[i5] = null;
                                    objArr31[2] = null;
                                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                    int i133 = -(-k84.a((~(elapsedCpuTime | 551986830)) | (~((-664660961) | elapsedCpuTime)) | 119097696, 623, (((~elapsedCpuTime) | 6423566) * (-623)) + (((~((-119097697) | elapsedCpuTime)) * 623) - 259858464), 16));
                                    int i134 = (i4 & i133) + (i133 | i4);
                                    int i135 = i134 << 13;
                                    int i136 = (i135 & (~i134)) | ((~i135) & i134);
                                    int i137 = i136 >>> 17;
                                    int i138 = ((~i136) & i137) | ((~i137) & i136);
                                    int i139 = i138 << 5;
                                    ((int[]) objArr31[i7])[0] = ((~i138) & i139) | ((~i139) & i138);
                                    return objArr31;
                                }
                                int maximumFlingVelocity2 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                int i140 = (maximumFlingVelocity2 ^ 31) + ((maximumFlingVelocity2 & 31) << 1);
                                char longPressTimeout = (char) (39787 - (ViewConfiguration.getLongPressTimeout() >> 16));
                                int i141 = -ImageFormat.getBitsPerPixel(0);
                                int i142 = (i141 & 230) + (i141 | 230);
                                Object[] objArr32 = new Object[1];
                                b(longPressTimeout, i140, i142, objArr32);
                                String str14 = (String) objArr32[0];
                                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 23;
                                int i143 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                Object[] objArr33 = new Object[1];
                                b((char) (((i143 | 59349) << 1) - (i143 ^ 59349)), touchSlop, 261 - (~(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr33);
                                String str15 = (String) objArr33[0];
                                int i144 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                int i145 = (i144 & 27) + (i144 | 27);
                                char c8 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 18855);
                                int i146 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                int i147 = ((i146 | 285) << 1) - (i146 ^ 285);
                                Object[] objArr34 = new Object[1];
                                b(c8, i145, i147, objArr34);
                                String str16 = (String) objArr34[0];
                                int axisFromString = MotionEvent.axisFromString("") + 15;
                                char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                                int i148 = -TextUtils.getOffsetBefore("", 0);
                                int i149 = ((i148 | 313) << 1) - (i148 ^ 313);
                                Object[] objArr35 = new Object[1];
                                b(maxKeyCode, axisFromString, i149, objArr35);
                                String[] strArr3 = {str14, str15, str16, (String) objArr35[0]};
                                int i150 = 0;
                                while (i150 < i5) {
                                    int i151 = l + 79;
                                    k = i151 % 128;
                                    if (i151 % 2 != 0) {
                                        Object[] objArr36 = {strArr3[i150]};
                                        Object f7 = rV4669.f(-668483483);
                                        if (f7 == null) {
                                            int indexOf = 6046 - TextUtils.indexOf("", "", i18, i18);
                                            char c9 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                            int bitsPerPixel = 51 - ImageFormat.getBitsPerPixel(i18);
                                            Object[] objArr37 = new Object[1];
                                            i13 = i18;
                                            c(1, 2, (short) -1, objArr37);
                                            f7 = rV4669.g(indexOf, c9, bitsPerPixel, 1367547137, (String) objArr37[i13], new Class[]{String.class});
                                        } else {
                                            i13 = i18;
                                        }
                                        long longValue5 = ((Long) ((Method) f7).invoke(null, objArr36)).longValue();
                                        long j15 = ((-864) * longValue5) + 230165499052L;
                                        long j16 = longValue5 ^ (-1);
                                        j2 = j13;
                                        long b2 = hdi.b(228906166);
                                        long j17 = b2 ^ (-1);
                                        long e5 = com.fingerprintjs.android.fpjs_pro.g.e(865L, ((j16 | j17) ^ (-1)) | ((j17 | 265780022) ^ (-1)), (((b2 | 265780022) ^ (-1)) * 865) + ((-865) * (j16 | (((-265780023) | j17) ^ (-1)))) + j15, 1673769985L);
                                        if (((((int) e5) & k84.a((~((~Process.myPid()) | (-273651092))) | 4817169, 933, (((~(1710877501 | r4)) | (-273651092)) * (-933)) - 1871499104, -1678577060)) | (((int) (e5 << 88)) & ((((-1524258296) | i2) * 397) + (((((~((-1550308818) | i69)) | 69566464) | (~((-113082407) | i69))) * (-397)) - 1469503678)))) != 0) {
                                            int i152 = ((i150 | 252) << 1) - (i150 ^ 252);
                                            i14 = (i152 | i2) & (~(i2 & i152));
                                            break;
                                        }
                                        i150++;
                                        i18 = i13;
                                        j13 = j2;
                                        i5 = 4;
                                    } else {
                                        i13 = i18;
                                        j2 = j13;
                                        Object[] objArr38 = {strArr3[i150]};
                                        Object f8 = rV4669.f(-668483483);
                                        if (f8 == null) {
                                            int i153 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6045;
                                            char lastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0') + 1);
                                            int green = 52 - Color.green(i13);
                                            Object[] objArr39 = new Object[1];
                                            c(1, 2, (short) -1, objArr39);
                                            f8 = rV4669.g(i153, lastIndexOf2, green, 1367547137, (String) objArr39[i13], new Class[]{String.class});
                                        }
                                        long longValue6 = ((Long) ((Method) f8).invoke(null, objArr38)).longValue();
                                        long j18 = (((((-3602451) | longValue6) | j2) ^ (-1)) * (-301)) + (302 * longValue6) + 1080735300;
                                        long j19 = longValue6 ^ (-1);
                                        long e6 = com.fingerprintjs.android.fpjs_pro.g.e(301L, j19 | ((3602450 | j2) ^ (-1)), ((-301) * (((j19 | j2) ^ (-1)) | (((j2 ^ (-1)) | (-3602451)) ^ (-1)))) + j18, 1943152458L);
                                        int i154 = ((int) (e6 >> c2)) & ((((~(1773678243 | i69)) | (-2109603580)) * 191) + (((~(1773678243 | i2)) | (-336451833)) * 191) + 745145293);
                                        int i155 = ((int) e6) & (((1481381244 | i69) * 754) + (((~(1525530622 | i2)) | (~((-1481375789) | i69))) * (-754)) + (((((~(1481381244 | i2)) | (-1525530623)) | (~(44154834 | i2))) * (-754)) - 640194649));
                                        if (((i155 & i154) | (i154 ^ i155)) != 0) {
                                            int i1522 = ((i150 | 252) << 1) - (i150 ^ 252);
                                            i14 = (i1522 | i2) & (~(i2 & i1522));
                                            break;
                                        }
                                        i150++;
                                        i18 = i13;
                                        j13 = j2;
                                        i5 = 4;
                                    }
                                }
                                i13 = i18;
                                j2 = j13;
                                i14 = i2;
                                if (i14 != i2) {
                                    r0.a();
                                    Object[] objArr40 = new Object[5];
                                    int[] iArr13 = new int[1];
                                    objArr40[i13] = iArr13;
                                    int[] iArr14 = new int[1];
                                    objArr40[1] = iArr14;
                                    objArr40[i7] = new int[1];
                                    iArr14[i13] = i2;
                                    iArr13[i13] = i14;
                                    objArr40[4] = null;
                                    objArr40[2] = null;
                                    int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                                    int i156 = (((~((~elapsedCpuTime2) | (-1157685136))) | 1183018320) * 398) + (((~((-1157685136) | elapsedCpuTime2)) | 1183018320) * 398) + 2029572956;
                                    int i157 = -(-(((i156 | 16) << 1) - (i156 ^ 16)));
                                    int i158 = (i4 ^ i157) + ((i157 & i4) << 1);
                                    int i159 = (i158 << 13) ^ i158;
                                    int i160 = i159 ^ (i159 >>> 17);
                                    int i161 = i160 << 5;
                                    ((int[]) objArr40[i7])[i13] = (i160 | i161) & (~(i160 & i161));
                                    return objArr40;
                                }
                                int i162 = i13;
                                int i163 = 12 - (~(-View.MeasureSpec.makeMeasureSpec(i162, i162)));
                                int lastIndexOf3 = TextUtils.lastIndexOf("", '0', i162, i162);
                                Object[] objArr41 = new Object[1];
                                b((char) (((lastIndexOf3 | 55246) << 1) - (55246 ^ lastIndexOf3)), i163, (ViewConfiguration.getEdgeSlop() >> 16) + 327, objArr41);
                                Object[] objArr42 = {(String) objArr41[0]};
                                Object f9 = rV4669.f(-417469134);
                                if (f9 == null) {
                                    int deadChar = KeyEvent.getDeadChar(0, 0) + 51;
                                    Object[] objArr43 = new Object[1];
                                    c(0, 0, (short) 2, objArr43);
                                    f9 = rV4669.g(6202 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), deadChar, 1857630294, (String) objArr43[0], new Class[]{String.class});
                                }
                                String str17 = (String) ((Method) f9).invoke(null, objArr42);
                                if (str17 != null) {
                                    int i164 = 8 - (~Color.alpha(0));
                                    char size = (char) View.MeasureSpec.getSize(0);
                                    int i165 = -Process.getGidForName("");
                                    int i166 = (i165 & 339) + (i165 | 339);
                                    Object[] objArr44 = new Object[1];
                                    b(size, i164, i166, objArr44);
                                    if (str17.contains((String) objArr44[0])) {
                                        i15 = (~(i2 & RadarSimpleLogBuffer.PURGE_AMOUNT)) & (i2 | RadarSimpleLogBuffer.PURGE_AMOUNT);
                                        if (i15 == i2) {
                                            int i167 = k;
                                            l = (((i167 | 39) << 1) - (i167 ^ 39)) % 128;
                                            Object[] objArr45 = new Object[5];
                                            int[] iArr15 = new int[1];
                                            objArr45[0] = iArr15;
                                            int[] iArr16 = new int[1];
                                            objArr45[1] = iArr16;
                                            int[] iArr17 = new int[1];
                                            objArr45[i7] = iArr17;
                                            iArr16[0] = i2;
                                            iArr15[0] = i15;
                                            objArr45[4] = null;
                                            objArr45[2] = null;
                                            int i168 = (((~(i2 | 1061420526)) | (~((-222404069) | i69)) | 155227264) * 676) + (((~(994243722 | i69)) | 67176804) * 676) + ((((-67176805) | i2) * (-676)) - 1005756218);
                                            int i169 = (i4 - (~((i168 ^ 16) + ((i168 & 16) << 1)))) - 1;
                                            int i170 = i169 << 13;
                                            int i171 = ((~i169) & i170) | ((~i170) & i169);
                                            int i172 = i171 >>> 17;
                                            int i173 = ((~i171) & i172) | ((~i172) & i171);
                                            int i174 = i173 << 5;
                                            iArr17[0] = ((~i173) & i174) | ((~i174) & i173);
                                            return objArr45;
                                        }
                                        int i175 = 16 - (~(-Color.blue(0)));
                                        int scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
                                        int i176 = -(-View.MeasureSpec.getMode(0));
                                        int i177 = (i176 ^ 349) + ((i176 & 349) << 1);
                                        Object[] objArr46 = new Object[1];
                                        b((char) ((scrollBarSize & 4520) + (scrollBarSize | 4520)), i175, i177, objArr46);
                                        String str18 = (String) objArr46[0];
                                        int i178 = -(-TextUtils.lastIndexOf("", '0', 0));
                                        int i179 = (i178 ^ 7) + ((i178 & 7) << 1);
                                        char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                        int i180 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                        int i181 = (i180 ^ 366) + ((i180 & 366) << 1);
                                        Object[] objArr47 = new Object[1];
                                        b(keyRepeatDelay, i179, i181, objArr47);
                                        String str19 = (String) objArr47[0];
                                        File file2 = new File(str18);
                                        if (file2.exists()) {
                                            k = (l + 17) % 128;
                                            if (file2.isFile()) {
                                                try {
                                                    Scanner scanner2 = new Scanner(new FileInputStream(file2));
                                                    int i182 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                    int i183 = (i182 & 2) + (i182 | 2);
                                                    char myTid = (char) ((Process.myTid() >> 22) + 54163);
                                                    int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                                                    int i184 = (jumpTapTimeout & 229) + (jumpTapTimeout | 229);
                                                    Object[] objArr48 = new Object[1];
                                                    b(myTid, i183, i184, objArr48);
                                                    Scanner useDelimiter2 = scanner2.useDelimiter((String) objArr48[0]);
                                                    if (useDelimiter2.hasNext()) {
                                                        int i185 = l;
                                                        k = ((i185 & 63) + (i185 | 63)) % 128;
                                                        str2 = useDelimiter2.next();
                                                    } else {
                                                        str2 = "";
                                                    }
                                                    useDelimiter2.close();
                                                } catch (IOException unused2) {
                                                }
                                                if (str2.contains(str19)) {
                                                    i16 = (~(i2 & 251)) & (i2 | 251);
                                                    if (i16 != i2) {
                                                        int i186 = -(-(Process.myTid() >> 22));
                                                        int i187 = (i186 & 23) + (i186 | 23);
                                                        char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
                                                        byte modifierMetaStateMask = (byte) KeyEvent.getModifierMetaStateMask();
                                                        int i188 = ((modifierMetaStateMask | 373) << 1) - (modifierMetaStateMask ^ 373);
                                                        Object[] objArr49 = new Object[1];
                                                        b(absoluteGravity2, i187, i188, objArr49);
                                                        Object[] objArr50 = {(String) objArr49[0]};
                                                        Object f10 = rV4669.f(-417469134);
                                                        if (f10 == null) {
                                                            int keyRepeatDelay2 = 6202 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                            char c10 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                                            int i189 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 50;
                                                            Object[] objArr51 = new Object[1];
                                                            c(0, 0, (short) 2, objArr51);
                                                            f10 = rV4669.g(keyRepeatDelay2, c10, i189, 1857630294, (String) objArr51[0], new Class[]{String.class});
                                                        }
                                                        String lowerCase = ((String) ((Method) f10).invoke(null, objArr50)).toLowerCase();
                                                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
                                                        int i190 = (packedPositionGroup & 4) + (packedPositionGroup | 4);
                                                        char red2 = (char) (Color.red(0) + 46980);
                                                        int i191 = -Color.green(0);
                                                        int a4 = r0.a();
                                                        int i192 = i191 * 50;
                                                        int i193 = (i192 ^ (-38315)) + ((i192 & (-38315)) << 1);
                                                        int i194 = ~a4;
                                                        int i195 = ((~((-396) | i191)) | (~(((-396) ^ i194) | ((-396) & i194)))) * 98;
                                                        int i196 = (i193 & i195) + (i195 | i193);
                                                        int i197 = ~i191;
                                                        int i198 = ~((i194 & i197) | (i197 ^ i194));
                                                        int i199 = -(-((((-396) & i198) | ((-396) ^ i198) | (~(i191 | a4))) * (-49)));
                                                        int i200 = (i196 ^ i199) + ((i199 & i196) << 1);
                                                        int i201 = ~(((-396) & a4) | ((-396) ^ a4));
                                                        int i202 = ~((i191 & 395) | (i191 ^ 395));
                                                        int i203 = -(-(((i202 & i201) | (i201 ^ i202)) * 49));
                                                        int i204 = ((i200 | i203) << 1) - (i203 ^ i200);
                                                        Object[] objArr52 = new Object[1];
                                                        b(red2, i190, i204, objArr52);
                                                        int i205 = lowerCase.contains((String) objArr52[0]) ? i2 ^ 264 : i2;
                                                        if (i205 == i2) {
                                                            int mirror = 'Z' - AndroidCharacter.getMirror('0');
                                                            int i206 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                            char mirror2 = AndroidCharacter.getMirror('0');
                                                            int i207 = (mirror2 ^ 351) + ((mirror2 & 351) << 1);
                                                            Object[] objArr53 = new Object[1];
                                                            b((char) (((i206 | 53024) << 1) - (i206 ^ 53024)), mirror, i207, objArr53);
                                                            String str20 = (String) objArr53[0];
                                                            int i208 = 39 - (~(-(-Color.alpha(0))));
                                                            char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                                                            int i209 = -(-TextUtils.getCapsMode("", 0, 0));
                                                            int i210 = ((i209 | 441) << 1) - (i209 ^ 441);
                                                            Object[] objArr54 = new Object[1];
                                                            b(scrollBarSize2, i208, i210, objArr54);
                                                            String str21 = (String) objArr54[0];
                                                            int i211 = -Color.blue(0);
                                                            int a5 = r0.a();
                                                            int i212 = i211 * 868;
                                                            int i213 = (i212 ^ 23436) + ((i212 & 23436) << 1);
                                                            int i214 = ~i211;
                                                            int i215 = ~a5;
                                                            int i216 = ~((i214 ^ i215) | (i214 & i215));
                                                            int i217 = ~(((-28) ^ i215) | ((-28) & i215));
                                                            int i218 = -(-(((i216 & i217) | (i216 ^ i217)) * (-867)));
                                                            int i219 = ((i213 | i218) << 1) - (i213 ^ i218);
                                                            int i220 = ~(i214 | (-28));
                                                            int i221 = ~((i214 ^ a5) | (i214 & a5));
                                                            int i222 = (i220 & i221) | (i220 ^ i221);
                                                            int i223 = ~(((-28) ^ a5) | ((-28) & a5));
                                                            int i224 = (((i222 & i223) | (i222 ^ i223)) * (-1734)) + i219;
                                                            int i225 = (i214 ^ (-28)) | (i214 & (-28));
                                                            int i226 = ~((i215 & i225) | (i225 ^ i215));
                                                            int i227 = (i214 & 27) | (i214 ^ 27);
                                                            int i228 = ~((i227 & a5) | (i227 ^ a5));
                                                            int i229 = (i228 & i226) | (i226 ^ i228);
                                                            int i230 = (i211 & (-28)) | ((-28) ^ i211);
                                                            int i231 = ~((i230 & a5) | (i230 ^ a5));
                                                            int i232 = -(-(((i231 & i229) | (i229 ^ i231)) * 867));
                                                            int i233 = ((i224 | i232) << 1) - (i232 ^ i224);
                                                            int i234 = -Drawable.resolveOpacity(0, 0);
                                                            Object[] objArr55 = new Object[1];
                                                            b((char) ((i234 & 26061) + (i234 | 26061)), i233, (-16776735) - Color.rgb(0, 0, 0), objArr55);
                                                            String str22 = (String) objArr55[0];
                                                            int capsMode = TextUtils.getCapsMode("", 0, 0) + 27;
                                                            int i235 = -(-Process.getGidForName(""));
                                                            int i236 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                                            int i237 = ((i236 | 508) << 1) - (i236 ^ 508);
                                                            Object[] objArr56 = new Object[1];
                                                            b((char) (((i235 | 1) << 1) - (i235 ^ 1)), capsMode, i237, objArr56);
                                                            String str23 = (String) objArr56[0];
                                                            int indexOf2 = 26 - TextUtils.indexOf((CharSequence) "", '0', 0);
                                                            int i238 = -(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                            int i239 = -(KeyEvent.getMaxKeyCode() >> 16);
                                                            int i240 = (i239 & 535) + (i239 | 535);
                                                            Object[] objArr57 = new Object[1];
                                                            b((char) (((i238 | 13831) << 1) - (i238 ^ 13831)), indexOf2, i240, objArr57);
                                                            String str24 = (String) objArr57[0];
                                                            int i241 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                                            int i242 = (i241 ^ 27) + ((i241 & 27) << 1);
                                                            char scrollBarSize3 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                                                            int resolveSize2 = View.resolveSize(0, 0);
                                                            int i243 = (resolveSize2 & 562) + (resolveSize2 | 562);
                                                            Object[] objArr58 = new Object[1];
                                                            b(scrollBarSize3, i242, i243, objArr58);
                                                            String[] strArr4 = {str20, str21, str22, str23, str24, (String) objArr58[0]};
                                                            int i244 = i9;
                                                            int i245 = 0;
                                                            while (true) {
                                                                if (i245 >= i244) {
                                                                    i17 = i2;
                                                                    break;
                                                                }
                                                                int i246 = k + 89;
                                                                l = i246 % 128;
                                                                if (i246 % 2 != 0) {
                                                                    Object[] objArr59 = {strArr4[i245]};
                                                                    Object f11 = rV4669.f(-417469134);
                                                                    if (f11 == null) {
                                                                        int lastIndexOf4 = TextUtils.lastIndexOf("", '0', 0) + 6203;
                                                                        char indexOf3 = (char) TextUtils.indexOf("", "", 0, 0);
                                                                        int myPid = (Process.myPid() >> 22) + 51;
                                                                        Object[] objArr60 = new Object[1];
                                                                        c(0, 0, (short) 2, objArr60);
                                                                        f11 = rV4669.g(lastIndexOf4, indexOf3, myPid, 1857630294, (String) objArr60[0], new Class[]{String.class});
                                                                    }
                                                                    String str25 = (String) ((Method) f11).invoke(null, objArr59);
                                                                    if (str25 != null && str25.length() != 0) {
                                                                        i17 = (~(i2 & 265)) & (i2 | 265);
                                                                        break;
                                                                    }
                                                                    i245++;
                                                                    i244 = 6;
                                                                } else {
                                                                    Object[] objArr61 = {strArr4[i245]};
                                                                    Object f12 = rV4669.f(-417469134);
                                                                    if (f12 == null) {
                                                                        int i247 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 50;
                                                                        Object[] objArr62 = new Object[1];
                                                                        c(0, 0, (short) 2, objArr62);
                                                                        f12 = rV4669.g(6250 - AndroidCharacter.getMirror('0'), (char) (AndroidCharacter.getMirror('0') - '0'), i247, 1857630294, (String) objArr62[0], new Class[]{String.class});
                                                                    }
                                                                    throw null;
                                                                }
                                                            }
                                                        } else {
                                                            r0.a();
                                                            Object[] objArr63 = new Object[5];
                                                            int[] iArr18 = new int[1];
                                                            objArr63[0] = iArr18;
                                                            int[] iArr19 = new int[1];
                                                            objArr63[1] = iArr19;
                                                            int[] iArr20 = new int[1];
                                                            objArr63[i7] = iArr20;
                                                            iArr19[0] = i2;
                                                            iArr18[0] = i205;
                                                            objArr63[4] = null;
                                                            objArr63[2] = null;
                                                            int i248 = (((~(i2 | (-1029715123))) | (~(i69 | 186932668))) * 959) + (((~((-1029715123) | i69)) | (~(i2 | 186932668))) * 959) + 442127011;
                                                            int i249 = (i4 - (~((i248 ^ 16) + ((i248 & 16) << 1)))) - 1;
                                                            int i250 = i249 << 13;
                                                            int i251 = (i249 | i250) & (~(i249 & i250));
                                                            int i252 = i251 >>> 17;
                                                            int i253 = ((~i251) & i252) | ((~i252) & i251);
                                                            int i254 = i253 << 5;
                                                            iArr20[0] = ((~i253) & i254) | ((~i254) & i253);
                                                            return objArr63;
                                                        }
                                                    } else {
                                                        int i255 = k;
                                                        l = (((i255 | 113) << 1) - (i255 ^ 113)) % 128;
                                                        Object[] objArr64 = new Object[5];
                                                        int[] iArr21 = new int[1];
                                                        objArr64[0] = iArr21;
                                                        int[] iArr22 = new int[1];
                                                        objArr64[1] = iArr22;
                                                        objArr64[i7] = new int[1];
                                                        iArr22[0] = i2;
                                                        iArr21[0] = i16;
                                                        objArr64[4] = null;
                                                        objArr64[2] = null;
                                                        int b3 = hdi.b(1568524653);
                                                        int i256 = ~b3;
                                                        int i257 = (((~(b3 | 900616955)) | (~(i256 | (-277222004))) | (-939425788)) * 717) + (((~(i256 | 900616955)) | (-939425788) | (~((-277222004) | b3))) * 717) + 772654831;
                                                        int i258 = (i4 - (~(((i257 | 16) << 1) - (i257 ^ 16)))) - 1;
                                                        int i259 = i258 << 13;
                                                        int i260 = (i258 | i259) & (~(i258 & i259));
                                                        int i261 = i260 >>> 17;
                                                        int i262 = ((~i260) & i261) | ((~i261) & i260);
                                                        int i263 = i262 << 5;
                                                        ((int[]) objArr64[i7])[0] = ((~i262) & i263) | ((~i263) & i262);
                                                        return objArr64;
                                                    }
                                                }
                                            }
                                        }
                                        i16 = i2;
                                        if (i16 != i2) {
                                        }
                                    }
                                }
                                i15 = i2;
                                if (i15 == i2) {
                                }
                            }
                        }
                    }
                    i12 = i2;
                    if (i12 == i2) {
                    }
                }

                public final String d() {
                    k = (l + 85) % 128;
                    int i2 = m0.c;
                    int i3 = ((i2 & 47) + (i2 | 47)) % 2;
                    m0 m0Var = m0.this;
                    bc bcVar = m0Var.a;
                    if (i3 == 0) {
                        int i4 = 78 / 0;
                    }
                    int i5 = i2 + 109;
                    int i6 = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i7 = i6 + 53;
                        m0.c = i7 % 128;
                        int i8 = i7 % 2;
                        Context context = m0Var.b;
                        if (i8 == 0) {
                            String vD14832N6715 = bcVar.vD14832N6715(context);
                            vD14832N6715.getClass();
                            int i9 = l + 111;
                            k = i9 % 128;
                            if (i9 % 2 == 0) {
                                return vD14832N6715;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }

                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ String invoke() {
                    int i2 = l;
                    int i3 = ((i2 | 109) << 1) - (i2 ^ 109);
                    k = i3 % 128;
                    int i4 = i3 % 2;
                    String d = d();
                    if (i4 != 0) {
                        int i5 = 0 / 0;
                    }
                    return d;
                }
            }, 1, null};
            Object f = rV4669.f(-754466100);
            if (f == null) {
                f = rV4669.g(TextUtils.indexOf((CharSequence) "", '0') + 849, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + 53, 1520639912, "setPivotYN16904", new Class[]{Long.TYPE, Function0.class, Integer.TYPE, Object.class});
            }
            return (D8871) ((Method) f).invoke(null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
