package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.mlkit.vision.barcode.common.Barcode;
import defpackage.qp7;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.zip.ZipFile;
import org.msgpack.core.MessagePack;

/* loaded from: classes.dex */
public class rV4669 {
    public static final Object a;
    public static final Object b;
    public static final HashMap c;
    public static final int d;
    public static final boolean e;
    public static final int f;
    public static final int g;
    public static final byte[] h = null;
    public static final byte[] i = null;
    public static final int j = 0;
    public static int k = 0;
    public static int l = 1;
    public static final int m;
    public static final int n;
    public static int o = 0;
    public static int p = 1;

    /* JADX WARN: Can't wrap try/catch for region: R(44:1093|1094|1083|1084|1085|(2:1086|1087)|(40:1074|1075|1076|1077|1078|(0)|27|28|(0)|30|31|32|(0)|34|35|(0)(0)|(0)|52|53|54|55|56|(0)(0)|59|(0)|62|(0)(0)|65|66|(0)(0)|69|(0)(0)|72|(0)(0)|75|76|77|(0)|1012|1013)|24|25|(0)|27|28|(0)|30|31|32|(0)|34|35|(0)(0)|(0)|52|53|54|55|56|(0)(0)|59|(0)|62|(0)(0)|65|66|(0)(0)|69|(0)(0)|72|(0)(0)|75|76|77|(0)|1012|1013) */
    /* JADX WARN: Code restructure failed: missing block: B:1022:0x03a8, code lost:
    
        r0 = r22 ? 1 : 0;
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0421, code lost:
    
        if (((java.lang.Boolean) r8.getMethod(b(r10, r9, 944), null).invoke(r7, null)).booleanValue() != false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x18b3, code lost:
    
        if (r64[r11] != false) goto L1112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x18c0, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x18b5, code lost:
    
        com.fingerprintjs.android.fpjs_pro_internal.rV4669.a = null;
        com.fingerprintjs.android.fpjs_pro_internal.rV4669.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x18bb, code lost:
    
        r22 = false;
        r1 = r1;
        r3 = r3;
        r10 = r10;
        r57 = r57;
        r72 = r72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0120, code lost:
    
        if (r5 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x184c, code lost:
    
        r15.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x1539, code lost:
    
        r15 = r79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x153b, code lost:
    
        r0 = r71.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r0.setAccessible(true);
        com.fingerprintjs.android.fpjs_pro_internal.rV4669.a = r0.newInstance(r2, java.lang.Boolean.valueOf(!r48));
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x155d, code lost:
    
        if (r15 == null) goto L634;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x156d, code lost:
    
        if (r39 == 0) goto L644;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x156f, code lost:
    
        r0 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.n + 73;
        com.fingerprintjs.android.fpjs_pro_internal.rV4669.m = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x157b, code lost:
    
        if ((r0 % 2) == 0) goto L641;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x157d, code lost:
    
        r1 = r39;
        r1 = r1;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x1583, code lost:
    
        if (r1 < 110(0x6e, float:1.54E-43)) goto L640;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x1586, code lost:
    
        r10 = 4;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x1626, code lost:
    
        r2 = r74;
        r9 = 1;
        r22 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x1594, code lost:
    
        r0 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.m + 59;
        com.fingerprintjs.android.fpjs_pro_internal.rV4669.n = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x15a6, code lost:
    
        if ((r0 % 2) != 0) goto L653;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x15a8, code lost:
    
        r10 = 4;
        r10 = 4;
        r10 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x15a9, code lost:
    
        r0 = new java.lang.Object[4];
        r0[0] = -751562147;
        r0[1] = 722384067;
        r2 = f(1219382621);
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x15c2, code lost:
    
        if (r2 != null) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x15c4, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x15e4, code lost:
    
        r2 = android.text.TextUtils.getCapsMode("", r5, r5) + 3809;
        r5 = (char) (36304 - (~(-(-android.graphics.Color.green(r5)))));
        r60 = 63 - (~(-(android.view.ViewConfiguration.getScrollBarSize() >> 8)));
        r8 = com.fingerprintjs.android.fpjs_pro_internal.rV4669.h[1];
        r9 = r8;
        r62 = a(r9, r8, r9);
        r8 = r75;
        r2 = g(r2, r5, r60, -1056272327, r62, new java.lang.Class[]{r8, r8});
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x1620, code lost:
    
        ((java.lang.reflect.Method) r2).invoke(null, r0);
        r1 = r1;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x15c6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x1631, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x1635, code lost:
    
        if (r2 != null) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x1637, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x163d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x1638, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x1639, code lost:
    
        r2 = r74;
        r1 = r1;
        r3 = r3;
        r72 = r72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x15c8, code lost:
    
        r10 = 4;
        r10 = 4;
        r0 = new java.lang.Object[]{722384067, -751562147};
        r5 = 0;
        r2 = f(1219382621);
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x15e2, code lost:
    
        if (r2 != null) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x1589, code lost:
    
        r1 = r39;
        r1 = r1;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x158d, code lost:
    
        if (r1 < 26) goto L640;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x1590, code lost:
    
        r1 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x155f, code lost:
    
        r15.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x1563, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x1564, code lost:
    
        r1 = r39;
        r2 = r74;
        r10 = 4;
        r3 = r3;
        r72 = r72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x163e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x163f, code lost:
    
        r15 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1015:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:1016:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:1017:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:1019:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:1020:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:1023:0x0225 A[Catch: Exception -> 0x1973, TRY_ENTER, TRY_LEAVE, TryCatch #88 {Exception -> 0x1973, blocks: (B:8:0x00c3, B:10:0x00d6, B:11:0x00ea, B:41:0x0295, B:47:0x02dc, B:49:0x02e2, B:51:0x02e3, B:52:0x02e4, B:55:0x0338, B:66:0x0386, B:69:0x038f, B:72:0x039a, B:75:0x03a3, B:82:0x03c5, B:125:0x18b1, B:129:0x18b5, B:134:0x1937, B:137:0x18d4, B:144:0x1910, B:146:0x1916, B:147:0x1917, B:1023:0x0225, B:1030:0x1959, B:1032:0x195f, B:1033:0x1960, B:1036:0x1962, B:1038:0x1968, B:1039:0x1969, B:1042:0x01e3, B:1047:0x196b, B:1049:0x1971, B:1050:0x1972, B:1027:0x0265, B:1025:0x0238, B:1044:0x01fb, B:44:0x02a8, B:140:0x18e6, B:141:0x190e), top: B:7:0x00c3, inners: #33, #37, #45, #105, #124 }] */
    /* JADX WARN: Removed duplicated region for block: B:1040:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:1051:0x01ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1060:0x0181 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1074:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x18b1 A[Catch: Exception -> 0x1973, TRY_ENTER, TryCatch #88 {Exception -> 0x1973, blocks: (B:8:0x00c3, B:10:0x00d6, B:11:0x00ea, B:41:0x0295, B:47:0x02dc, B:49:0x02e2, B:51:0x02e3, B:52:0x02e4, B:55:0x0338, B:66:0x0386, B:69:0x038f, B:72:0x039a, B:75:0x03a3, B:82:0x03c5, B:125:0x18b1, B:129:0x18b5, B:134:0x1937, B:137:0x18d4, B:144:0x1910, B:146:0x1916, B:147:0x1917, B:1023:0x0225, B:1030:0x1959, B:1032:0x195f, B:1033:0x1960, B:1036:0x1962, B:1038:0x1968, B:1039:0x1969, B:1042:0x01e3, B:1047:0x196b, B:1049:0x1971, B:1050:0x1972, B:1027:0x0265, B:1025:0x0238, B:1044:0x01fb, B:44:0x02a8, B:140:0x18e6, B:141:0x190e), top: B:7:0x00c3, inners: #33, #37, #45, #105, #124 }] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x13b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x184c A[Catch: all -> 0x1850, TRY_ENTER, TryCatch #26 {all -> 0x1850, blocks: (B:332:0x184c, B:333:0x1853, B:846:0x187c, B:848:0x1882, B:849:0x1883, B:857:0x1885, B:859:0x189c, B:860:0x189d, B:152:0x07cc), top: B:151:0x07cc, inners: #63 }] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x1539 A[EDGE_INSN: B:338:0x1539->B:339:0x1539 BREAK  A[LOOP:2: B:186:0x0956->B:304:0x14f9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0288 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x17a0 A[Catch: all -> 0x16f2, TryCatch #112 {all -> 0x16f2, blocks: (B:659:0x16eb, B:661:0x16f1, B:662:0x16f5, B:700:0x173a, B:702:0x1740, B:703:0x1741, B:711:0x1759, B:713:0x175f, B:714:0x1760, B:731:0x179a, B:733:0x17a0, B:734:0x17a1, B:786:0x17de, B:788:0x17e4, B:789:0x17e5, B:803:0x17e7, B:805:0x17fb, B:806:0x17fc, B:809:0x17fe, B:811:0x1812, B:812:0x1813, B:815:0x1815, B:817:0x1829, B:818:0x182a, B:824:0x1842, B:826:0x1848, B:827:0x1849, B:184:0x0929, B:182:0x08f9, B:180:0x08c5), top: B:183:0x0929, inners: #110, #116, #125 }] */
    /* JADX WARN: Removed duplicated region for block: B:734:0x17a1 A[Catch: all -> 0x16f2, TryCatch #112 {all -> 0x16f2, blocks: (B:659:0x16eb, B:661:0x16f1, B:662:0x16f5, B:700:0x173a, B:702:0x1740, B:703:0x1741, B:711:0x1759, B:713:0x175f, B:714:0x1760, B:731:0x179a, B:733:0x17a0, B:734:0x17a1, B:786:0x17de, B:788:0x17e4, B:789:0x17e5, B:803:0x17e7, B:805:0x17fb, B:806:0x17fc, B:809:0x17fe, B:811:0x1812, B:812:0x1813, B:815:0x1815, B:817:0x1829, B:818:0x182a, B:824:0x1842, B:826:0x1848, B:827:0x1849, B:184:0x0929, B:182:0x08f9, B:180:0x08c5), top: B:183:0x0929, inners: #110, #116, #125 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:788:0x17e4 A[Catch: all -> 0x16f2, TryCatch #112 {all -> 0x16f2, blocks: (B:659:0x16eb, B:661:0x16f1, B:662:0x16f5, B:700:0x173a, B:702:0x1740, B:703:0x1741, B:711:0x1759, B:713:0x175f, B:714:0x1760, B:731:0x179a, B:733:0x17a0, B:734:0x17a1, B:786:0x17de, B:788:0x17e4, B:789:0x17e5, B:803:0x17e7, B:805:0x17fb, B:806:0x17fc, B:809:0x17fe, B:811:0x1812, B:812:0x1813, B:815:0x1815, B:817:0x1829, B:818:0x182a, B:824:0x1842, B:826:0x1848, B:827:0x1849, B:184:0x0929, B:182:0x08f9, B:180:0x08c5), top: B:183:0x0929, inners: #110, #116, #125 }] */
    /* JADX WARN: Removed duplicated region for block: B:789:0x17e5 A[Catch: all -> 0x16f2, TryCatch #112 {all -> 0x16f2, blocks: (B:659:0x16eb, B:661:0x16f1, B:662:0x16f5, B:700:0x173a, B:702:0x1740, B:703:0x1741, B:711:0x1759, B:713:0x175f, B:714:0x1760, B:731:0x179a, B:733:0x17a0, B:734:0x17a1, B:786:0x17de, B:788:0x17e4, B:789:0x17e5, B:803:0x17e7, B:805:0x17fb, B:806:0x17fc, B:809:0x17fe, B:811:0x1812, B:812:0x1813, B:815:0x1815, B:817:0x1829, B:818:0x182a, B:824:0x1842, B:826:0x1848, B:827:0x1849, B:184:0x0929, B:182:0x08f9, B:180:0x08c5), top: B:183:0x0929, inners: #110, #116, #125 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:990:0x043d A[Catch: all -> 0x043e, TryCatch #17 {all -> 0x043e, blocks: (B:107:0x045b, B:114:0x04ad, B:116:0x04b3, B:117:0x04b4, B:862:0x04bf, B:867:0x0507, B:872:0x0530, B:879:0x055e, B:881:0x0568, B:882:0x0573, B:884:0x058b, B:885:0x056e, B:886:0x0578, B:890:0x0598, B:892:0x0599, B:904:0x05e4, B:906:0x05ea, B:907:0x05eb, B:917:0x0642, B:919:0x0648, B:920:0x0649, B:928:0x0687, B:930:0x068d, B:931:0x068e, B:942:0x0729, B:944:0x072f, B:945:0x0732, B:960:0x073c, B:968:0x0793, B:970:0x0799, B:971:0x079a, B:948:0x0734, B:950:0x073a, B:951:0x073b, B:954:0x079c, B:956:0x07a2, B:957:0x07a3, B:150:0x07bc, B:982:0x07ad, B:984:0x07b3, B:985:0x07b4, B:988:0x0437, B:990:0x043d, B:991:0x0452, B:938:0x06f8, B:912:0x0606, B:924:0x064d, B:963:0x076d, B:964:0x0791, B:934:0x0690, B:865:0x04cf, B:109:0x0489, B:110:0x04ab, B:896:0x05a0), top: B:861:0x04bf, inners: #5, #18, #65, #71, #77, #86, #87, #106, #107 }] */
    /* JADX WARN: Removed duplicated region for block: B:991:0x0452 A[Catch: all -> 0x043e, TryCatch #17 {all -> 0x043e, blocks: (B:107:0x045b, B:114:0x04ad, B:116:0x04b3, B:117:0x04b4, B:862:0x04bf, B:867:0x0507, B:872:0x0530, B:879:0x055e, B:881:0x0568, B:882:0x0573, B:884:0x058b, B:885:0x056e, B:886:0x0578, B:890:0x0598, B:892:0x0599, B:904:0x05e4, B:906:0x05ea, B:907:0x05eb, B:917:0x0642, B:919:0x0648, B:920:0x0649, B:928:0x0687, B:930:0x068d, B:931:0x068e, B:942:0x0729, B:944:0x072f, B:945:0x0732, B:960:0x073c, B:968:0x0793, B:970:0x0799, B:971:0x079a, B:948:0x0734, B:950:0x073a, B:951:0x073b, B:954:0x079c, B:956:0x07a2, B:957:0x07a3, B:150:0x07bc, B:982:0x07ad, B:984:0x07b3, B:985:0x07b4, B:988:0x0437, B:990:0x043d, B:991:0x0452, B:938:0x06f8, B:912:0x0606, B:924:0x064d, B:963:0x076d, B:964:0x0791, B:934:0x0690, B:865:0x04cf, B:109:0x0489, B:110:0x04ab, B:896:0x05a0), top: B:861:0x04bf, inners: #5, #18, #65, #71, #77, #86, #87, #106, #107 }] */
    /* JADX WARN: Type inference failed for: r0v248, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v343, types: [int] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r10v66 */
    /* JADX WARN: Type inference failed for: r10v68 */
    /* JADX WARN: Type inference failed for: r10v71, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r15v104 */
    /* JADX WARN: Type inference failed for: r15v107 */
    /* JADX WARN: Type inference failed for: r15v119 */
    /* JADX WARN: Type inference failed for: r15v166 */
    /* JADX WARN: Type inference failed for: r15v167 */
    /* JADX WARN: Type inference failed for: r15v168 */
    /* JADX WARN: Type inference failed for: r15v169 */
    /* JADX WARN: Type inference failed for: r15v170 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v88 */
    /* JADX WARN: Type inference failed for: r15v92 */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r22v13 */
    /* JADX WARN: Type inference failed for: r22v39 */
    /* JADX WARN: Type inference failed for: r22v9, types: [int] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v40 */
    /* JADX WARN: Type inference failed for: r39v11 */
    /* JADX WARN: Type inference failed for: r39v7 */
    /* JADX WARN: Type inference failed for: r39v8 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARN: Type inference failed for: r3v83 */
    /* JADX WARN: Type inference failed for: r5v63, types: [java.lang.Object] */
    static {
        char c2;
        String str;
        boolean z;
        char c3;
        Object obj;
        int i2;
        Class<?> cls;
        byte[] bArr;
        byte b2;
        char c4;
        short s;
        Object invoke;
        Class<?> cls2;
        byte[] bArr2;
        char c5;
        boolean z2;
        Object invoke2;
        boolean z3;
        Class<?> cls3;
        byte[] bArr3;
        int i3;
        Object invoke3;
        char c6;
        char c7;
        char c8;
        short s2;
        ?? r0;
        boolean z4;
        int i4;
        Class<byte[]> cls4;
        Class<byte[]> cls5;
        boolean z5;
        int i5;
        String str2;
        int i6;
        Object[] objArr;
        boolean[] zArr;
        boolean[] zArr2;
        int i7;
        ZipFile zipFile;
        boolean z6;
        Class cls6;
        Class<byte[]> cls7;
        boolean[] zArr3;
        int i8;
        Class cls8;
        Class<byte[]> cls9;
        int i9;
        boolean[] zArr4;
        int i10;
        Class<byte[]> cls10;
        Class<byte[]> cls11;
        boolean z7;
        Object obj2;
        boolean z8;
        Random random;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        int i11;
        Random random2;
        Object obj12;
        int i12;
        Object obj13;
        boolean z9;
        ZipFile zipFile2;
        boolean[] zArr5;
        ?? r15;
        InputStream resourceAsStream;
        Throwable cause;
        ZipFile zipFile3;
        Class cls12;
        Object newInstance;
        ?? r39;
        String str3;
        ZipFile zipFile4;
        ZipFile zipFile5;
        char c9;
        ZipFile zipFile6;
        Class<Throwable> cls13;
        Class cls14;
        byte[] bArr4;
        byte[] bArr5;
        Class<?> cls15;
        Class<?> cls16;
        byte b3;
        ?? r152;
        Object obj14;
        ZipFile zipFile7;
        Class cls17;
        ZipFile zipFile8;
        InputStream resourceAsStream2;
        Object obj15;
        Object obj16;
        Class cls18;
        Class cls19;
        Class cls20;
        Throwable cause2;
        Throwable cause3;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Class<Throwable> cls21 = Throwable.class;
        Class<rV4669> cls22 = rV4669.class;
        d();
        c();
        try {
            Object[] objArr2 = {Float.valueOf(0.31430024f), Float.valueOf(0.18097651f)};
            byte[] bArr6 = i;
            Class<?> cls23 = Class.forName(b(bArr6[609], bArr6[82], (short) 1292));
            byte b4 = bArr6[303];
            byte b5 = bArr6[1193];
            String b6 = b((byte) ((b5 ^ (-1)) + (b5 << 1)), b4, (short) 1270);
            Class cls24 = Float.TYPE;
            int i13 = (((Float) cls23.getMethod(b6, cls24, cls24).invoke(null, objArr2)).floatValue() > 0.5614543f ? 1 : (((Float) cls23.getMethod(b6, cls24, cls24).invoke(null, objArr2)).floatValue() == 0.5614543f ? 0 : -1));
            int i14 = ~i13;
            int i15 = -(-(((i14 & (-2094004955)) | (i14 ^ (-2094004955))) * 1324));
            int i16 = ((-1286081978) ^ i15) + ((i15 & (-1286081978)) << 1);
            int i17 = ~(((-1011577563) & i13) | ((-1011577563) ^ i13));
            int i18 = ~(((-1150204627) ^ i13) | (i13 & (-1150204627)));
            int i19 = ((i18 & i17) | (i17 ^ i18)) * (-1324);
            if ((i16 ^ i19) + ((i19 & i16) << 1) + 1332954288 != 0) {
                f = -744300636;
                g = 653205776;
                new HashMap();
                c = new HashMap();
                try {
                    String b7 = b(bArr6[7], bArr6[61], (short) 1265);
                    if (a == null) {
                        c2 = 303;
                        str = b(bArr6[299], bArr6[61], (short) 1191);
                    } else {
                        c2 = 303;
                        str = null;
                    }
                    d = -1985684124;
                    try {
                        c3 = 1193;
                        try {
                            z = false;
                            try {
                                obj = Class.forName(b((byte) (-bArr6[495]), bArr6[82], (short) 1158)).getMethod(b(bArr6[1254], bArr6[61], (short) 1133), null).invoke(null, null);
                                c3 = 1193;
                            } catch (Exception unused) {
                                obj = null;
                                c3 = c3;
                                try {
                                    byte[] bArr7 = i;
                                    i2 = 3;
                                    try {
                                        obj = Class.forName(b(bArr7[48], bArr7[82], (short) 1116)).getMethod(b(bArr7[122], bArr7[3], (short) 1095), null).invoke(null, null);
                                    } catch (Exception unused2) {
                                    }
                                } catch (Exception unused3) {
                                    i2 = 3;
                                    if (obj != null) {
                                    }
                                    c4 = 293;
                                    invoke = null;
                                    if (obj != null) {
                                    }
                                    z2 = true;
                                    c5 = 11;
                                    invoke2 = null;
                                    z3 = z2;
                                    if (obj != null) {
                                    }
                                    i3 = -1;
                                    invoke3 = null;
                                    if (invoke == null) {
                                    }
                                    c6 = 810;
                                    c7 = 148;
                                    if (invoke3 == null) {
                                    }
                                    if (invoke2 == null) {
                                    }
                                    byte[] bArr8 = i;
                                    Object[] objArr3 = (Object[]) Array.newInstance(Class.forName(b((byte) (-bArr8[c7]), bArr8[57], (short) 1031)), 7);
                                    objArr3[z ? 1 : 0] = null;
                                    objArr3[z3 ? 1 : 0] = invoke2;
                                    objArr3[2] = invoke;
                                    objArr3[i2] = invoke3;
                                    objArr3[4] = invoke2;
                                    objArr3[5] = invoke;
                                    objArr3[6] = invoke3;
                                    boolean[] zArr6 = {false, true, true, true, true, true, true};
                                    boolean[] zArr7 = {false, false, false, false, true, true, true};
                                    int i20 = 4;
                                    boolean[] zArr8 = new boolean[7];
                                    zArr8[z ? 1 : 0] = z;
                                    zArr8[z3 ? 1 : 0] = z;
                                    zArr8[2] = z3;
                                    zArr8[i2] = z3;
                                    zArr8[4] = z;
                                    zArr8[5] = z3;
                                    zArr8[6] = z3;
                                    int i21 = 6;
                                    Class<?> cls25 = Class.forName(b((byte) (-bArr8[10]), bArr8[82], (short) 973));
                                    byte b8 = bArr8[415];
                                    r0 = cls25.getDeclaredField(b(bArr8[330], b8, (short) ((b8 & 914) | (b8 ^ 914)))).getInt(cls25);
                                    if (r0 < 34) {
                                    }
                                    if (r0 == 29) {
                                    }
                                    if (r0 < 26) {
                                    }
                                    zArr8[z ? 1 : 0] = z10;
                                    if (r0 >= 26) {
                                    }
                                    e = z11;
                                    if (r0 < 21) {
                                    }
                                    zArr8[z3 ? 1 : 0] = z12;
                                    if (r0 < 21) {
                                    }
                                    zArr8[4] = z13;
                                    boolean z14 = z4;
                                    Class<byte[]> cls26 = r0;
                                    i4 = z ? 1 : 0;
                                    int i22 = i4;
                                    Class<byte[]> cls27 = byte[].class;
                                    ?? r3 = Class.class;
                                    boolean[] zArr9 = zArr6;
                                    boolean z15 = z;
                                    int i23 = z3;
                                    loop0: while (i4 == 0) {
                                    }
                                }
                                if (obj != null) {
                                    try {
                                        cls = obj.getClass();
                                        bArr = i;
                                        b2 = bArr[i2];
                                        c4 = 293;
                                        s = (short) (b2 | 1059);
                                    } catch (Exception unused4) {
                                        c4 = 293;
                                        invoke = null;
                                        if (obj != null) {
                                            try {
                                                cls2 = obj.getClass();
                                                bArr2 = i;
                                                c5 = 11;
                                                try {
                                                    z2 = true;
                                                } catch (Exception unused5) {
                                                    z2 = true;
                                                }
                                            } catch (Exception unused6) {
                                                z2 = true;
                                                c5 = 11;
                                                invoke2 = null;
                                                z3 = z2;
                                                if (obj != null) {
                                                    try {
                                                        cls3 = obj.getClass();
                                                        bArr3 = i;
                                                        i3 = -1;
                                                    } catch (Exception unused7) {
                                                        i3 = -1;
                                                        invoke3 = null;
                                                        if (invoke == null) {
                                                        }
                                                        c6 = 810;
                                                        c7 = 148;
                                                        if (invoke3 == null) {
                                                        }
                                                        if (invoke2 == null) {
                                                        }
                                                        byte[] bArr82 = i;
                                                        Object[] objArr32 = (Object[]) Array.newInstance(Class.forName(b((byte) (-bArr82[c7]), bArr82[57], (short) 1031)), 7);
                                                        objArr32[z ? 1 : 0] = null;
                                                        objArr32[z3 ? 1 : 0] = invoke2;
                                                        objArr32[2] = invoke;
                                                        objArr32[i2] = invoke3;
                                                        objArr32[4] = invoke2;
                                                        objArr32[5] = invoke;
                                                        objArr32[6] = invoke3;
                                                        boolean[] zArr62 = {false, true, true, true, true, true, true};
                                                        boolean[] zArr72 = {false, false, false, false, true, true, true};
                                                        int i202 = 4;
                                                        boolean[] zArr82 = new boolean[7];
                                                        zArr82[z ? 1 : 0] = z;
                                                        zArr82[z3 ? 1 : 0] = z;
                                                        zArr82[2] = z3;
                                                        zArr82[i2] = z3;
                                                        zArr82[4] = z;
                                                        zArr82[5] = z3;
                                                        zArr82[6] = z3;
                                                        int i212 = 6;
                                                        Class<?> cls252 = Class.forName(b((byte) (-bArr82[10]), bArr82[82], (short) 973));
                                                        byte b82 = bArr82[415];
                                                        r0 = cls252.getDeclaredField(b(bArr82[330], b82, (short) ((b82 & 914) | (b82 ^ 914)))).getInt(cls252);
                                                        if (r0 < 34) {
                                                        }
                                                        if (r0 == 29) {
                                                        }
                                                        if (r0 < 26) {
                                                        }
                                                        zArr82[z ? 1 : 0] = z10;
                                                        if (r0 >= 26) {
                                                        }
                                                        e = z11;
                                                        if (r0 < 21) {
                                                        }
                                                        zArr82[z3 ? 1 : 0] = z12;
                                                        if (r0 < 21) {
                                                        }
                                                        zArr82[4] = z13;
                                                        boolean z142 = z4;
                                                        Class<byte[]> cls262 = r0;
                                                        i4 = z ? 1 : 0;
                                                        int i222 = i4;
                                                        Class<byte[]> cls272 = byte[].class;
                                                        ?? r32 = Class.class;
                                                        boolean[] zArr92 = zArr62;
                                                        boolean z152 = z;
                                                        int i232 = z3;
                                                        loop0: while (i4 == 0) {
                                                        }
                                                    }
                                                    try {
                                                        byte b9 = bArr3[i2];
                                                        invoke3 = cls3.getMethod(b((byte) ((-2) - (bArr3[c4] ^ (-1))), b9, (short) (b9 | 1035)), null).invoke(obj, null);
                                                    } catch (Exception unused8) {
                                                        invoke3 = null;
                                                        if (invoke == null) {
                                                        }
                                                        c6 = 810;
                                                        c7 = 148;
                                                        if (invoke3 == null) {
                                                        }
                                                        if (invoke2 == null) {
                                                        }
                                                        byte[] bArr822 = i;
                                                        Object[] objArr322 = (Object[]) Array.newInstance(Class.forName(b((byte) (-bArr822[c7]), bArr822[57], (short) 1031)), 7);
                                                        objArr322[z ? 1 : 0] = null;
                                                        objArr322[z3 ? 1 : 0] = invoke2;
                                                        objArr322[2] = invoke;
                                                        objArr322[i2] = invoke3;
                                                        objArr322[4] = invoke2;
                                                        objArr322[5] = invoke;
                                                        objArr322[6] = invoke3;
                                                        boolean[] zArr622 = {false, true, true, true, true, true, true};
                                                        boolean[] zArr722 = {false, false, false, false, true, true, true};
                                                        int i2022 = 4;
                                                        boolean[] zArr822 = new boolean[7];
                                                        zArr822[z ? 1 : 0] = z;
                                                        zArr822[z3 ? 1 : 0] = z;
                                                        zArr822[2] = z3;
                                                        zArr822[i2] = z3;
                                                        zArr822[4] = z;
                                                        zArr822[5] = z3;
                                                        zArr822[6] = z3;
                                                        int i2122 = 6;
                                                        Class<?> cls2522 = Class.forName(b((byte) (-bArr822[10]), bArr822[82], (short) 973));
                                                        byte b822 = bArr822[415];
                                                        r0 = cls2522.getDeclaredField(b(bArr822[330], b822, (short) ((b822 & 914) | (b822 ^ 914)))).getInt(cls2522);
                                                        if (r0 < 34) {
                                                        }
                                                        if (r0 == 29) {
                                                        }
                                                        if (r0 < 26) {
                                                        }
                                                        zArr822[z ? 1 : 0] = z10;
                                                        if (r0 >= 26) {
                                                        }
                                                        e = z11;
                                                        if (r0 < 21) {
                                                        }
                                                        zArr822[z3 ? 1 : 0] = z12;
                                                        if (r0 < 21) {
                                                        }
                                                        zArr822[4] = z13;
                                                        boolean z1422 = z4;
                                                        Class<byte[]> cls2622 = r0;
                                                        i4 = z ? 1 : 0;
                                                        int i2222 = i4;
                                                        Class<byte[]> cls2722 = byte[].class;
                                                        ?? r322 = Class.class;
                                                        boolean[] zArr922 = zArr622;
                                                        boolean z1522 = z;
                                                        int i2322 = z3;
                                                        loop0: while (i4 == 0) {
                                                        }
                                                    }
                                                    if (invoke == null) {
                                                        if (str == null) {
                                                            invoke = null;
                                                        } else {
                                                            c6 = 810;
                                                            c7 = 148;
                                                            try {
                                                                invoke = Class.forName(b((byte) (-i[148]), r8[57], (short) 1031)).getDeclaredConstructor(String.class).newInstance(b((byte) (r8[c4] - 1), r8[810], (short) 1041).concat(str));
                                                                if (invoke3 == null) {
                                                                    s2 = 338;
                                                                    c8 = 'J';
                                                                } else {
                                                                    byte[] bArr9 = i;
                                                                    c8 = 'J';
                                                                    s2 = 338;
                                                                    try {
                                                                        Object[] objArr4 = {b((byte) (-bArr9[338]), bArr9[57], (short) 1020)};
                                                                        byte b10 = bArr9[57];
                                                                        try {
                                                                            invoke3 = Class.forName(b((byte) (-bArr9[c7]), bArr9[57], (short) 1031)).getDeclaredConstructor(String.class).newInstance(Class.forName(b(bArr9[74], b10, (short) ((b10 & 994) | (b10 ^ 994)))).getMethod(b(64, bArr9[i2], (short) 992), String.class).invoke(null, objArr4));
                                                                        } catch (Throwable th) {
                                                                            Throwable cause4 = th.getCause();
                                                                            if (cause4 != null) {
                                                                                throw cause4;
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    } catch (Throwable th2) {
                                                                        Throwable cause5 = th2.getCause();
                                                                        if (cause5 != null) {
                                                                            throw cause5;
                                                                        }
                                                                        throw th2;
                                                                    }
                                                                }
                                                                if (invoke2 == null && invoke != null) {
                                                                    int i24 = m;
                                                                    n = ((i24 & 43) + (i24 | 43)) % 128;
                                                                    byte[] bArr10 = i;
                                                                    byte b11 = bArr10[61];
                                                                    try {
                                                                        Object[] objArr5 = new Object[2];
                                                                        objArr5[z3 ? 1 : 0] = b(bArr10[c4], b11, (short) ((b11 ^ MessagePack.Code.FALSE) | (b11 & MessagePack.Code.FALSE)));
                                                                        objArr5[z ? 1 : 0] = invoke;
                                                                        invoke2 = Class.forName(b((byte) (-bArr10[c7]), bArr10[57], (short) 1031)).getDeclaredConstructor(Class.forName(b((byte) (-bArr10[c7]), bArr10[57], (short) 1031)), String.class).newInstance(objArr5);
                                                                    } catch (Throwable th3) {
                                                                        Throwable cause6 = th3.getCause();
                                                                        if (cause6 != null) {
                                                                            throw cause6;
                                                                        }
                                                                        throw th3;
                                                                    }
                                                                }
                                                                byte[] bArr8222 = i;
                                                                Object[] objArr3222 = (Object[]) Array.newInstance(Class.forName(b((byte) (-bArr8222[c7]), bArr8222[57], (short) 1031)), 7);
                                                                objArr3222[z ? 1 : 0] = null;
                                                                objArr3222[z3 ? 1 : 0] = invoke2;
                                                                objArr3222[2] = invoke;
                                                                objArr3222[i2] = invoke3;
                                                                objArr3222[4] = invoke2;
                                                                objArr3222[5] = invoke;
                                                                objArr3222[6] = invoke3;
                                                                boolean[] zArr6222 = {false, true, true, true, true, true, true};
                                                                boolean[] zArr7222 = {false, false, false, false, true, true, true};
                                                                int i20222 = 4;
                                                                boolean[] zArr8222 = new boolean[7];
                                                                zArr8222[z ? 1 : 0] = z;
                                                                zArr8222[z3 ? 1 : 0] = z;
                                                                zArr8222[2] = z3;
                                                                zArr8222[i2] = z3;
                                                                zArr8222[4] = z;
                                                                zArr8222[5] = z3;
                                                                zArr8222[6] = z3;
                                                                int i21222 = 6;
                                                                Class<?> cls25222 = Class.forName(b((byte) (-bArr8222[10]), bArr8222[82], (short) 973));
                                                                byte b8222 = bArr8222[415];
                                                                r0 = cls25222.getDeclaredField(b(bArr8222[330], b8222, (short) ((b8222 & 914) | (b8222 ^ 914)))).getInt(cls25222);
                                                                if (r0 < 34) {
                                                                    z4 = z3 ? 1 : 0;
                                                                } else {
                                                                    z4 = z ? 1 : 0;
                                                                }
                                                                if (r0 == 29) {
                                                                    int i25 = n;
                                                                    m = (((i25 | 75) << 1) - (i25 ^ 75)) % 128;
                                                                }
                                                                if (r0 < 26) {
                                                                    z10 = z3 ? 1 : 0;
                                                                } else {
                                                                    z10 = z ? 1 : 0;
                                                                }
                                                                zArr8222[z ? 1 : 0] = z10;
                                                                if (r0 >= 26) {
                                                                    z11 = z3 ? 1 : 0;
                                                                } else {
                                                                    z11 = z ? 1 : 0;
                                                                }
                                                                e = z11;
                                                                if (r0 < 21) {
                                                                    z12 = z3 ? 1 : 0;
                                                                } else {
                                                                    z12 = z ? 1 : 0;
                                                                }
                                                                zArr8222[z3 ? 1 : 0] = z12;
                                                                if (r0 < 21) {
                                                                    z13 = z3 ? 1 : 0;
                                                                } else {
                                                                    z13 = z ? 1 : 0;
                                                                }
                                                                zArr8222[4] = z13;
                                                                boolean z14222 = z4;
                                                                Class<byte[]> cls26222 = r0;
                                                                i4 = z ? 1 : 0;
                                                                int i22222 = i4;
                                                                Class<byte[]> cls27222 = byte[].class;
                                                                ?? r3222 = Class.class;
                                                                boolean[] zArr9222 = zArr6222;
                                                                boolean z15222 = z;
                                                                int i23222 = z3;
                                                                loop0: while (i4 == 0) {
                                                                    int i26 = n;
                                                                    boolean[] zArr10 = zArr7222;
                                                                    m = (i26 + 25) % 128;
                                                                    if (i22222 < 9) {
                                                                        m = (i26 + 43) % 128;
                                                                        if (zArr8222[i22222]) {
                                                                            try {
                                                                                z7 = zArr9222[i22222];
                                                                                obj2 = objArr3222[i22222];
                                                                                z8 = zArr10[i22222];
                                                                                if (z7) {
                                                                                    int i27 = ((i26 & 97) + (i26 | 97)) % 128;
                                                                                    m = i27;
                                                                                    if (obj2 != null) {
                                                                                        i26 = (i27 + 125) % 128;
                                                                                        n = i26;
                                                                                        try {
                                                                                            byte[] bArr11 = i;
                                                                                            z5 = z14222;
                                                                                            try {
                                                                                                i5 = i4;
                                                                                                try {
                                                                                                    str2 = b7;
                                                                                                    try {
                                                                                                        Class<?> cls28 = Class.forName(b((byte) (-bArr11[c7]), bArr11[57], (short) 1031));
                                                                                                        byte b12 = bArr11[61];
                                                                                                        byte b13 = bArr11[510];
                                                                                                        i6 = i22222;
                                                                                                        try {
                                                                                                        } catch (Throwable th4) {
                                                                                                            th = th4;
                                                                                                            cause3 = th.getCause();
                                                                                                            if (cause3 == null) {
                                                                                                                throw cause3;
                                                                                                            }
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } catch (Throwable th5) {
                                                                                                        th = th5;
                                                                                                        cause3 = th.getCause();
                                                                                                        if (cause3 == null) {
                                                                                                        }
                                                                                                    }
                                                                                                } catch (Throwable th6) {
                                                                                                    th = th6;
                                                                                                    cause3 = th.getCause();
                                                                                                    if (cause3 == null) {
                                                                                                    }
                                                                                                }
                                                                                            } catch (Throwable th7) {
                                                                                                th = th7;
                                                                                                cause3 = th.getCause();
                                                                                                if (cause3 == null) {
                                                                                                }
                                                                                            }
                                                                                        } catch (Throwable th8) {
                                                                                            th = th8;
                                                                                        }
                                                                                    } else {
                                                                                        z5 = z14222;
                                                                                        i5 = i4;
                                                                                        str2 = b7;
                                                                                        i6 = i22222;
                                                                                    }
                                                                                    StringBuilder sb = new StringBuilder();
                                                                                    byte[] bArr12 = i;
                                                                                    sb.append(b(bArr12[c3], bArr12[170], (short) 937));
                                                                                    sb.append(obj2);
                                                                                    sb.append(b(bArr12[866], (byte) (j | 68), (short) 933));
                                                                                    try {
                                                                                        throw ((Throwable) Class.forName(b(bArr12[255], bArr12[57], (short) 933)).getDeclaredConstructor(String.class).newInstance(sb.toString()));
                                                                                        break;
                                                                                    } catch (Throwable th9) {
                                                                                        Throwable cause7 = th9.getCause();
                                                                                        if (cause7 != null) {
                                                                                            throw cause7;
                                                                                        }
                                                                                        throw th9;
                                                                                    }
                                                                                }
                                                                                z5 = z14222;
                                                                                i5 = i4;
                                                                                str2 = b7;
                                                                                i6 = i22222;
                                                                            } catch (Throwable th10) {
                                                                                th = th10;
                                                                                cls4 = cls27222;
                                                                                cls7 = cls26222;
                                                                                z5 = z14222;
                                                                                i5 = i4;
                                                                                str2 = b7;
                                                                                i6 = i22222;
                                                                            }
                                                                            if (z7) {
                                                                                try {
                                                                                    random = new Random();
                                                                                    m = (((i26 | 119) << 1) - (i26 ^ 119)) % 128;
                                                                                    try {
                                                                                        byte b14 = i[57];
                                                                                        random.setSeed(((Long) Class.forName(b(r0[c8], b14, (short) ((b14 & 994) | (b14 ^ 994)))).getMethod(b(r0[34], r0[61], (short) 915), null).invoke(null, null)).longValue() ^ 1810919117);
                                                                                        obj3 = null;
                                                                                        obj4 = null;
                                                                                        obj5 = null;
                                                                                        obj6 = null;
                                                                                    } catch (Throwable th11) {
                                                                                        Throwable cause8 = th11.getCause();
                                                                                        if (cause8 != null) {
                                                                                            throw cause8;
                                                                                        }
                                                                                        throw th11;
                                                                                    }
                                                                                } catch (Throwable th12) {
                                                                                    th = th12;
                                                                                    cls4 = cls27222;
                                                                                    cls7 = cls26222;
                                                                                    objArr = objArr3222;
                                                                                    cls11 = cls7;
                                                                                    zArr = zArr8222;
                                                                                    zArr4 = zArr9222;
                                                                                    i10 = i20222;
                                                                                    cls10 = cls11;
                                                                                    cls9 = cls10;
                                                                                    cls8 = r3222;
                                                                                    i8 = i10;
                                                                                    zArr3 = zArr4;
                                                                                    i9 = i6 + 1;
                                                                                    while (i9 < 7) {
                                                                                    }
                                                                                    int i28 = m;
                                                                                    n = (((i28 | 15) << 1) - (i28 ^ 15)) % 128;
                                                                                    byte[] bArr13 = i;
                                                                                    try {
                                                                                        throw ((Throwable) Class.forName(b(bArr13[255], bArr13[57], (short) 933)).getDeclaredConstructor(String.class, cls21).newInstance(b(bArr13[609], bArr13[170], bArr13[892]), th));
                                                                                    } catch (Throwable th13) {
                                                                                        Throwable cause9 = th13.getCause();
                                                                                        if (cause9 != null) {
                                                                                            throw cause9;
                                                                                        }
                                                                                        throw th13;
                                                                                    }
                                                                                }
                                                                                while (obj3 == null) {
                                                                                    if (obj4 == null) {
                                                                                        objArr = obj2;
                                                                                        n = (m + 97) % 128;
                                                                                        obj11 = obj4;
                                                                                        i11 = i21222;
                                                                                    } else {
                                                                                        objArr = obj2;
                                                                                        obj11 = obj4;
                                                                                        if (obj5 == null) {
                                                                                            i11 = 5;
                                                                                        } else if (obj6 == null) {
                                                                                            i11 = i20222;
                                                                                        } else {
                                                                                            i11 = i2;
                                                                                        }
                                                                                    }
                                                                                    Object obj17 = obj5;
                                                                                    StringBuilder sb2 = new StringBuilder(((i11 | 1) << 1) - (i11 ^ 1));
                                                                                    sb2.append('.');
                                                                                    int i29 = z15222 ? 1 : 0;
                                                                                    while (i29 < i11) {
                                                                                        int i30 = i11;
                                                                                        int i31 = n + 99;
                                                                                        int i32 = i29;
                                                                                        m = i31 % 128;
                                                                                        if (i31 % 2 == 0) {
                                                                                            if (z8) {
                                                                                                int nextInt = random.nextInt(26);
                                                                                                if (random.nextBoolean()) {
                                                                                                    i12 = 64 - (~(-(-nextInt)));
                                                                                                } else {
                                                                                                    i12 = (nextInt & 96) + (nextInt | 96);
                                                                                                }
                                                                                                sb2.append((char) i12);
                                                                                            } else {
                                                                                                int i33 = -(-random.nextInt(12));
                                                                                                sb2.append((char) (((i33 | 8192) << 1) - (i33 ^ 8192)));
                                                                                            }
                                                                                            i29 = ((i32 | 1) << 1) - (i32 ^ 1);
                                                                                            i11 = i30;
                                                                                        } else {
                                                                                            throw null;
                                                                                        }
                                                                                    }
                                                                                    String sb3 = sb2.toString();
                                                                                    if (obj11 == null) {
                                                                                        try {
                                                                                            Object[] objArr6 = new Object[2];
                                                                                            objArr6[i23222] = sb3;
                                                                                            objArr6[z15222 ? 1 : 0] = objArr;
                                                                                            byte[] bArr14 = i;
                                                                                            random2 = random;
                                                                                            obj12 = obj6;
                                                                                            obj4 = Class.forName(b((byte) (-bArr14[c7]), bArr14[57], (short) 1031)).getDeclaredConstructor(Class.forName(b((byte) (-bArr14[c7]), bArr14[57], (short) 1031)), String.class).newInstance(objArr6);
                                                                                        } catch (Throwable th14) {
                                                                                            Throwable cause10 = th14.getCause();
                                                                                            if (cause10 != null) {
                                                                                                throw cause10;
                                                                                            }
                                                                                            throw th14;
                                                                                        }
                                                                                    } else {
                                                                                        random2 = random;
                                                                                        obj12 = obj6;
                                                                                        if (obj17 == null) {
                                                                                            int i34 = m;
                                                                                            n = (i34 + 47) % 128;
                                                                                            n = (((i34 | 33) << 1) - (i34 ^ 33)) % 128;
                                                                                            try {
                                                                                                Object[] objArr7 = new Object[2];
                                                                                                objArr7[i23222] = sb3;
                                                                                                objArr7[z15222 ? 1 : 0] = objArr;
                                                                                                byte[] bArr15 = i;
                                                                                                obj5 = Class.forName(b((byte) (-bArr15[c7]), bArr15[57], (short) 1031)).getDeclaredConstructor(Class.forName(b((byte) (-bArr15[c7]), bArr15[57], (short) 1031)), String.class).newInstance(objArr7);
                                                                                                obj4 = obj11;
                                                                                                obj6 = obj12;
                                                                                                obj2 = objArr;
                                                                                                random = random2;
                                                                                            } catch (Throwable th15) {
                                                                                                Throwable cause11 = th15.getCause();
                                                                                                if (cause11 != null) {
                                                                                                    throw cause11;
                                                                                                }
                                                                                                throw th15;
                                                                                            }
                                                                                        } else if (obj12 == null) {
                                                                                            try {
                                                                                                Object[] objArr8 = new Object[2];
                                                                                                objArr8[i23222] = sb3;
                                                                                                objArr8[z15222 ? 1 : 0] = objArr;
                                                                                                byte[] bArr16 = i;
                                                                                                obj6 = Class.forName(b((byte) (-bArr16[c7]), bArr16[57], (short) 1031)).getDeclaredConstructor(Class.forName(b((byte) (-bArr16[c7]), bArr16[57], (short) 1031)), String.class).newInstance(objArr8);
                                                                                                obj4 = obj11;
                                                                                                obj5 = obj17;
                                                                                                obj2 = objArr;
                                                                                                random = random2;
                                                                                            } catch (Throwable th16) {
                                                                                                Throwable cause12 = th16.getCause();
                                                                                                if (cause12 != null) {
                                                                                                    throw cause12;
                                                                                                }
                                                                                                throw th16;
                                                                                            }
                                                                                        } else {
                                                                                            try {
                                                                                                try {
                                                                                                    Object[] objArr9 = new Object[2];
                                                                                                    objArr9[i23222] = sb3;
                                                                                                    objArr9[z15222 ? 1 : 0] = objArr;
                                                                                                    byte[] bArr17 = i;
                                                                                                    Object newInstance2 = Class.forName(b((byte) (-bArr17[c7]), bArr17[57], (short) 1031)).getDeclaredConstructor(Class.forName(b((byte) (-bArr17[c7]), bArr17[57], (short) 1031)), String.class).newInstance(objArr9);
                                                                                                    try {
                                                                                                        try {
                                                                                                            Class.forName(b((byte) (-bArr17[10]), bArr17[57], (short) 899)).getMethod(b(bArr17[c3], bArr17[61], (short) 876), null).invoke(Class.forName(b((byte) (-bArr17[10]), bArr17[57], (short) 899)).getDeclaredConstructor(Class.forName(b((byte) (-bArr17[c7]), bArr17[57], (short) 1031))).newInstance(newInstance2), null);
                                                                                                            obj3 = newInstance2;
                                                                                                            obj4 = obj11;
                                                                                                        } catch (Throwable th17) {
                                                                                                            Throwable cause13 = th17.getCause();
                                                                                                            if (cause13 != null) {
                                                                                                                throw cause13;
                                                                                                            }
                                                                                                            throw th17;
                                                                                                        }
                                                                                                    } catch (Throwable th18) {
                                                                                                        Throwable cause14 = th18.getCause();
                                                                                                        if (cause14 != null) {
                                                                                                            throw cause14;
                                                                                                        }
                                                                                                        throw th18;
                                                                                                    }
                                                                                                } catch (Throwable th19) {
                                                                                                    Throwable cause15 = th19.getCause();
                                                                                                    if (cause15 != null) {
                                                                                                        throw cause15;
                                                                                                    }
                                                                                                    throw th19;
                                                                                                }
                                                                                            } catch (Exception e2) {
                                                                                                StringBuilder sb4 = new StringBuilder();
                                                                                                byte[] bArr18 = i;
                                                                                                sb4.append(b(bArr18[c3], bArr18[170], (short) 872));
                                                                                                sb4.append((Object) 2);
                                                                                                sb4.append(b(bArr18[866], (byte) (j ^ 68), (short) 933));
                                                                                                String sb5 = sb4.toString();
                                                                                                try {
                                                                                                    Object[] objArr10 = new Object[2];
                                                                                                    objArr10[i23222] = e2;
                                                                                                    objArr10[z15222 ? 1 : 0] = sb5;
                                                                                                    throw ((Throwable) Class.forName(b(bArr18[255], bArr18[57], (short) 933)).getDeclaredConstructor(String.class, cls21).newInstance(objArr10));
                                                                                                    break;
                                                                                                } catch (Throwable th20) {
                                                                                                    Throwable cause16 = th20.getCause();
                                                                                                    if (cause16 != null) {
                                                                                                        throw cause16;
                                                                                                    }
                                                                                                    throw th20;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        th = th12;
                                                                                        cls4 = cls27222;
                                                                                        cls7 = cls26222;
                                                                                        objArr = objArr3222;
                                                                                        cls11 = cls7;
                                                                                        zArr = zArr8222;
                                                                                        zArr4 = zArr9222;
                                                                                        i10 = i20222;
                                                                                        cls10 = cls11;
                                                                                        cls9 = cls10;
                                                                                        cls8 = r3222;
                                                                                        i8 = i10;
                                                                                        zArr3 = zArr4;
                                                                                        i9 = i6 + 1;
                                                                                        while (i9 < 7) {
                                                                                        }
                                                                                        int i282 = m;
                                                                                        n = (((i282 | 15) << 1) - (i282 ^ 15)) % 128;
                                                                                        byte[] bArr132 = i;
                                                                                        throw ((Throwable) Class.forName(b(bArr132[255], bArr132[57], (short) 933)).getDeclaredConstructor(String.class, cls21).newInstance(b(bArr132[609], bArr132[170], bArr132[892]), th));
                                                                                    }
                                                                                    obj6 = obj12;
                                                                                    obj5 = obj17;
                                                                                    obj2 = objArr;
                                                                                    random = random2;
                                                                                }
                                                                                obj7 = obj4;
                                                                                obj8 = obj5;
                                                                                obj9 = obj6;
                                                                                obj10 = obj3;
                                                                            } else {
                                                                                obj10 = null;
                                                                                obj7 = null;
                                                                                obj9 = null;
                                                                                obj8 = null;
                                                                            }
                                                                            byte[] bArr19 = i;
                                                                            ?? r10 = 868;
                                                                            String b15 = b(bArr19[35], bArr19[c6], (short) 868);
                                                                            try {
                                                                                try {
                                                                                    obj13 = obj10;
                                                                                    r10 = new Class[]{String.class};
                                                                                } catch (Throwable th21) {
                                                                                    th = th21;
                                                                                    cls9 = cls27222;
                                                                                    cls8 = r3222;
                                                                                    i8 = r10;
                                                                                    zArr3 = zArr2;
                                                                                }
                                                                                try {
                                                                                    objArr = objArr3222;
                                                                                    try {
                                                                                        String str4 = (String) Class.forName(b((byte) (-bArr19[c7]), bArr19[57], (short) 790)).getMethod(b(bArr19[330], bArr19[i2], (short) (j | 769)), null).invoke(r3222.getMethod(b((byte) (bArr19[c4] - 1), bArr19[i2], (short) 800), r10).invoke(cls22, b15), null);
                                                                                        try {
                                                                                        } catch (Throwable th22) {
                                                                                            th = th22;
                                                                                            cls4 = cls27222;
                                                                                            cls11 = cls26222;
                                                                                            objArr = objArr;
                                                                                            zArr = zArr8222;
                                                                                            zArr4 = zArr9222;
                                                                                            i10 = i20222;
                                                                                            cls10 = cls11;
                                                                                            cls9 = cls10;
                                                                                            cls8 = r3222;
                                                                                            i8 = i10;
                                                                                            zArr3 = zArr4;
                                                                                            i9 = i6 + 1;
                                                                                            while (i9 < 7) {
                                                                                            }
                                                                                            int i2822 = m;
                                                                                            n = (((i2822 | 15) << 1) - (i2822 ^ 15)) % 128;
                                                                                            byte[] bArr1322 = i;
                                                                                            throw ((Throwable) Class.forName(b(bArr1322[255], bArr1322[57], (short) 933)).getDeclaredConstructor(String.class, cls21).newInstance(b(bArr1322[609], bArr1322[170], bArr1322[892]), th));
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                zipFile2 = new ZipFile(str4.substring(5, str4.lastIndexOf(b(bArr19[866], (short) 86, (short) 773) + b15)));
                                                                                                z9 = i23222;
                                                                                            } catch (IOException unused9) {
                                                                                                z9 = z15222 ? 1 : 0;
                                                                                                zipFile2 = null;
                                                                                            }
                                                                                        } catch (Throwable th23) {
                                                                                            th = th23;
                                                                                            cls4 = cls27222;
                                                                                            cls10 = cls26222;
                                                                                            zArr = zArr8222;
                                                                                            zArr4 = zArr9222;
                                                                                            i10 = i20222;
                                                                                            cls9 = cls10;
                                                                                            cls8 = r3222;
                                                                                            i8 = i10;
                                                                                            zArr3 = zArr4;
                                                                                            i9 = i6 + 1;
                                                                                            while (i9 < 7) {
                                                                                            }
                                                                                            int i28222 = m;
                                                                                            n = (((i28222 | 15) << 1) - (i28222 ^ 15)) % 128;
                                                                                            byte[] bArr13222 = i;
                                                                                            throw ((Throwable) Class.forName(b(bArr13222[255], bArr13222[57], (short) 933)).getDeclaredConstructor(String.class, cls21).newInstance(b(bArr13222[609], bArr13222[170], bArr13222[892]), th));
                                                                                        }
                                                                                        try {
                                                                                            byte[] bArr20 = new byte[22592];
                                                                                            if (z9) {
                                                                                                int i35 = n;
                                                                                                m = ((i35 ^ 101) + ((i35 & 101) << 1)) % 128;
                                                                                                resourceAsStream = zipFile2.getInputStream(zipFile2.getEntry(b15.substring(i23222)));
                                                                                            } else {
                                                                                                resourceAsStream = cls22.getResourceAsStream(b15);
                                                                                            }
                                                                                            try {
                                                                                                Object[] objArr11 = {resourceAsStream};
                                                                                                byte[] bArr21 = i;
                                                                                                boolean z16 = z9;
                                                                                                Class<?> cls29 = Class.forName(b((byte) (-bArr21[169]), bArr21[57], (short) 773));
                                                                                                byte b16 = bArr21[57];
                                                                                                int i36 = j;
                                                                                                zArr = zArr8222;
                                                                                                try {
                                                                                                    try {
                                                                                                        Object newInstance3 = Class.forName(b(bArr21[609], bArr21[57], (short) 729)).getDeclaredConstructor(Class.forName(b(bArr21[255], bArr21[57], (short) ((i36 & 737) | (i36 ^ 737))))).newInstance(cls29.getDeclaredConstructor(Class.forName(b(bArr21[255], b16, (short) (i36 | 737)))).newInstance(objArr11));
                                                                                                        try {
                                                                                                            Class.forName(b(bArr21[609], bArr21[57], (short) 729)).getMethod(b((byte) (-bArr21[19]), bArr21[41], (short) 707), cls27222).invoke(newInstance3, bArr20);
                                                                                                            try {
                                                                                                                try {
                                                                                                                    Class.forName(b(bArr21[609], bArr21[57], (short) 729)).getMethod(b(bArr21[c3], bArr21[61], (short) 876), null).invoke(newInstance3, null);
                                                                                                                    int i37 = 22555;
                                                                                                                    String str5 = str2;
                                                                                                                    Class cls30 = null;
                                                                                                                    int i38 = 16;
                                                                                                                    Class<byte[]> cls31 = cls27222;
                                                                                                                    Class cls32 = r3222;
                                                                                                                    boolean[] zArr11 = zArr9222;
                                                                                                                    byte b17 = z15222;
                                                                                                                    while (true) {
                                                                                                                        try {
                                                                                                                            int length = bArr20.length;
                                                                                                                            long j2 = 1;
                                                                                                                            int i39 = b17;
                                                                                                                            while (i39 < length) {
                                                                                                                                j2 = ((bArr20[i39] + (j2 << i21222)) + (j2 << 16)) - j2;
                                                                                                                                i39 = (i39 & 1) + (i39 | 1);
                                                                                                                                length = length;
                                                                                                                                i37 = i37;
                                                                                                                            }
                                                                                                                            int i40 = i37;
                                                                                                                            byte b18 = bArr20[(i38 & 22575) + (i38 | 22575)];
                                                                                                                            bArr20[(i38 & 109) + (i38 | 109)] = (byte) ((b18 & 26) + (b18 | 26));
                                                                                                                            try {
                                                                                                                                Object[] objArr12 = new Object[i2];
                                                                                                                                try {
                                                                                                                                    objArr12[2] = Integer.valueOf(bArr20.length - i38);
                                                                                                                                    objArr12[1] = Integer.valueOf(i38);
                                                                                                                                    objArr12[b17] = bArr20;
                                                                                                                                    byte[] bArr22 = i;
                                                                                                                                    byte b19 = bArr22[57];
                                                                                                                                    int i41 = j;
                                                                                                                                    int i42 = i38;
                                                                                                                                    zArr2 = zArr11;
                                                                                                                                    try {
                                                                                                                                        Class<?> cls33 = Class.forName(b(bArr22[78], b19, (short) (i41 | 689)));
                                                                                                                                        Class cls34 = Integer.TYPE;
                                                                                                                                        Object newInstance4 = cls33.getDeclaredConstructor(cls31, cls34, cls34).newInstance(objArr12);
                                                                                                                                        try {
                                                                                                                                            Object obj18 = a;
                                                                                                                                            if (obj18 == null) {
                                                                                                                                                try {
                                                                                                                                                    cls12 = cls30;
                                                                                                                                                    ZipFile zipFile9 = zipFile2;
                                                                                                                                                    int zoomControlsTimeout = (int) (j2 ^ ((ViewConfiguration.getZoomControlsTimeout() >> 32) + 1534744477114635326L));
                                                                                                                                                    try {
                                                                                                                                                        int i43 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                                                                                                                                                        int i44 = (i43 & (-148474317)) + (i43 | (-148474317));
                                                                                                                                                        int i45 = -TextUtils.getTrimmedLength("");
                                                                                                                                                        byte b20 = (byte) ((i45 & 8) + (i45 | 8));
                                                                                                                                                        int i46 = f;
                                                                                                                                                        int i47 = g;
                                                                                                                                                        try {
                                                                                                                                                            Object[] objArr13 = new Object[i21222];
                                                                                                                                                            try {
                                                                                                                                                                objArr13[5] = Integer.valueOf(i44);
                                                                                                                                                                objArr13[i20222] = Integer.valueOf(i47);
                                                                                                                                                                objArr13[3] = Short.valueOf(b20);
                                                                                                                                                                objArr13[2] = Integer.valueOf(zoomControlsTimeout);
                                                                                                                                                                objArr13[1] = Integer.valueOf(i46);
                                                                                                                                                                objArr13[b17] = newInstance4;
                                                                                                                                                                Class<?> cls35 = Class.forName(b((byte) (-bArr22[387]), bArr22[61], (short) 672));
                                                                                                                                                                zipFile = zipFile9;
                                                                                                                                                                try {
                                                                                                                                                                    Class<?>[] clsArr = {Class.forName(b(bArr22[255], bArr22[57], (short) ((i41 ^ 737) | (i41 & 737)))), cls34, cls34, Short.TYPE, cls34, cls34};
                                                                                                                                                                    cls34 = cls34;
                                                                                                                                                                    newInstance = cls35.getDeclaredConstructor(clsArr).newInstance(objArr13);
                                                                                                                                                                    r39 = cls26222;
                                                                                                                                                                    str3 = str5;
                                                                                                                                                                } catch (Throwable th24) {
                                                                                                                                                                    th = th24;
                                                                                                                                                                    Throwable cause17 = th.getCause();
                                                                                                                                                                    if (cause17 != null) {
                                                                                                                                                                        throw cause17;
                                                                                                                                                                    }
                                                                                                                                                                    throw th;
                                                                                                                                                                }
                                                                                                                                                            } catch (Throwable th25) {
                                                                                                                                                                th = th25;
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th26) {
                                                                                                                                                            th = th26;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th27) {
                                                                                                                                                        th = th27;
                                                                                                                                                        zipFile4 = zipFile9;
                                                                                                                                                        zipFile5 = zipFile4;
                                                                                                                                                        zipFile3 = zipFile5;
                                                                                                                                                        r15 = zipFile3;
                                                                                                                                                        if (r15 != 0) {
                                                                                                                                                        }
                                                                                                                                                        throw th;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th28) {
                                                                                                                                                    th = th28;
                                                                                                                                                    zipFile = zipFile2;
                                                                                                                                                    zipFile4 = zipFile;
                                                                                                                                                    zipFile5 = zipFile4;
                                                                                                                                                    zipFile3 = zipFile5;
                                                                                                                                                    r15 = zipFile3;
                                                                                                                                                    if (r15 != 0) {
                                                                                                                                                    }
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                try {
                                                                                                                                                    cls12 = cls30;
                                                                                                                                                    zipFile = zipFile2;
                                                                                                                                                    byte mode = (byte) (View.MeasureSpec.getMode(b17) + 8);
                                                                                                                                                    int uptimeMillis = (int) (j2 ^ ((-5935165257843636172L) - (SystemClock.uptimeMillis() >> 48)));
                                                                                                                                                    try {
                                                                                                                                                        Object[] objArr14 = new Object[i20222];
                                                                                                                                                        try {
                                                                                                                                                        } catch (Throwable th29) {
                                                                                                                                                            th = th29;
                                                                                                                                                        }
                                                                                                                                                        try {
                                                                                                                                                            objArr14[3] = Integer.valueOf((int) (j2 ^ (5935165258570968559L - (ViewConfiguration.getZoomControlsTimeout() >> 32))));
                                                                                                                                                            objArr14[2] = Integer.valueOf(uptimeMillis);
                                                                                                                                                            objArr14[1] = Short.valueOf(mode);
                                                                                                                                                            objArr14[b17] = newInstance4;
                                                                                                                                                            r39 = cls26222;
                                                                                                                                                            try {
                                                                                                                                                                str3 = str5;
                                                                                                                                                                newInstance = Class.forName(b(bArr22[7], bArr22[61], (short) 627), true, (ClassLoader) b).getMethod(b(bArr22[c4], bArr22[61], (short) 553), Class.forName(b(bArr22[255], bArr22[57], (short) ((i41 ^ 737) | (i41 & 737)))), Short.TYPE, cls34, cls34).invoke(obj18, objArr14);
                                                                                                                                                            } catch (Throwable th30) {
                                                                                                                                                                th = th30;
                                                                                                                                                                cause2 = th.getCause();
                                                                                                                                                                if (cause2 == null) {
                                                                                                                                                                    throw cause2;
                                                                                                                                                                }
                                                                                                                                                                throw th;
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th31) {
                                                                                                                                                            th = th31;
                                                                                                                                                            cause2 = th.getCause();
                                                                                                                                                            if (cause2 == null) {
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th32) {
                                                                                                                                                        th = th32;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th33) {
                                                                                                                                                    th = th33;
                                                                                                                                                    zipFile4 = zipFile;
                                                                                                                                                    zipFile5 = zipFile4;
                                                                                                                                                    zipFile3 = zipFile5;
                                                                                                                                                    r15 = zipFile3;
                                                                                                                                                    if (r15 != 0) {
                                                                                                                                                    }
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            try {
                                                                                                                                                short s3 = (short) ((i41 ^ 737) | (i41 & 737));
                                                                                                                                                Class<?> cls36 = Class.forName(b(bArr22[255], bArr22[57], s3));
                                                                                                                                                byte b21 = bArr22[16];
                                                                                                                                                byte b22 = bArr22[c6];
                                                                                                                                                cls36.getMethod(b((byte) ((b22 ^ (-1)) + (b22 << 1)), b21, (short) 544), Long.TYPE).invoke(newInstance, 17);
                                                                                                                                                Class cls37 = Integer.TYPE;
                                                                                                                                                if (z7) {
                                                                                                                                                    if (obj18 == null) {
                                                                                                                                                        obj15 = obj7;
                                                                                                                                                    } else {
                                                                                                                                                        obj15 = obj8;
                                                                                                                                                    }
                                                                                                                                                    if (obj18 == null) {
                                                                                                                                                        obj16 = obj9;
                                                                                                                                                    } else {
                                                                                                                                                        obj16 = obj13;
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        c9 = 18;
                                                                                                                                                        Class<?> cls38 = Class.forName(b(bArr22[255], bArr22[57], s3));
                                                                                                                                                        byte b23 = bArr22[41];
                                                                                                                                                        cls13 = cls21;
                                                                                                                                                        try {
                                                                                                                                                            Method method = cls38.getMethod(b((byte) ((-2) - (bArr22[c6] ^ (-1))), b23, (short) ((b23 ^ 536) | (b23 & 536))), cls31, cls34, cls34);
                                                                                                                                                            Class<?> cls39 = Class.forName(b((byte) (-bArr22[10]), bArr22[57], (short) 899));
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    Class<rV4669> cls40 = cls22;
                                                                                                                                                                    try {
                                                                                                                                                                        Object newInstance5 = cls39.getConstructor(Class.forName(b((byte) (-bArr22[c7]), bArr22[57], (short) 1031))).newInstance(obj15);
                                                                                                                                                                        if (z5 != 0) {
                                                                                                                                                                            try {
                                                                                                                                                                                cls18 = cls32;
                                                                                                                                                                                try {
                                                                                                                                                                                    Class<?> cls41 = Class.forName(b((byte) (-bArr22[c7]), bArr22[57], (short) 1031));
                                                                                                                                                                                    byte b24 = bArr22[c4];
                                                                                                                                                                                    ((Boolean) cls41.getMethod(b((byte) ((b24 ^ (-1)) + (b24 << 1)), bArr22[16], (short) (i41 | 528)), null).invoke(obj15, null)).getClass();
                                                                                                                                                                                    cls19 = cls18;
                                                                                                                                                                                } catch (Throwable th34) {
                                                                                                                                                                                    th = th34;
                                                                                                                                                                                    try {
                                                                                                                                                                                        Throwable cause18 = th.getCause();
                                                                                                                                                                                        if (cause18 != null) {
                                                                                                                                                                                            throw cause18;
                                                                                                                                                                                        }
                                                                                                                                                                                        throw th;
                                                                                                                                                                                    } catch (Exception e3) {
                                                                                                                                                                                        e = e3;
                                                                                                                                                                                        StringBuilder sb6 = new StringBuilder();
                                                                                                                                                                                        byte[] bArr23 = i;
                                                                                                                                                                                        sb6.append(b(bArr23[c3], bArr23[170], (short) 528));
                                                                                                                                                                                        sb6.append(obj15);
                                                                                                                                                                                        sb6.append(b(bArr23[866], (byte) (j ^ 68), (short) 933));
                                                                                                                                                                                        String sb7 = sb6.toString();
                                                                                                                                                                                        try {
                                                                                                                                                                                            Object[] objArr15 = new Object[2];
                                                                                                                                                                                            objArr15[1] = e;
                                                                                                                                                                                            objArr15[b17] = sb7;
                                                                                                                                                                                            try {
                                                                                                                                                                                                throw ((Throwable) Class.forName(b(bArr23[255], bArr23[57], (short) 933)).getDeclaredConstructor(String.class, cls13).newInstance(objArr15));
                                                                                                                                                                                            } catch (Throwable th35) {
                                                                                                                                                                                                th = th35;
                                                                                                                                                                                                try {
                                                                                                                                                                                                    Throwable cause19 = th.getCause();
                                                                                                                                                                                                    if (cause19 != null) {
                                                                                                                                                                                                        throw cause19;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    throw th;
                                                                                                                                                                                                } catch (Throwable th36) {
                                                                                                                                                                                                    th = th36;
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        byte[] bArr24 = i;
                                                                                                                                                                                                    } catch (Throwable th37) {
                                                                                                                                                                                                        th = th37;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        ((Boolean) Class.forName(b((byte) (-bArr24[c7]), bArr24[57], (short) 1031)).getMethod(b((byte) (bArr24[c3] - 1), bArr24[18], (short) 452), null).invoke(obj15, null)).getClass();
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                ((Boolean) Class.forName(b((byte) (-bArr24[c7]), bArr24[57], (short) 1031)).getMethod(b((byte) ((-2) - (bArr24[c3] ^ (-1))), bArr24[18], (short) 452), null).invoke(obj16, null)).getClass();
                                                                                                                                                                                                                throw th;
                                                                                                                                                                                                            } catch (Throwable th38) {
                                                                                                                                                                                                                th = th38;
                                                                                                                                                                                                                Throwable cause20 = th.getCause();
                                                                                                                                                                                                                if (cause20 != null) {
                                                                                                                                                                                                                    throw cause20;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                throw th;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        } catch (Throwable th39) {
                                                                                                                                                                                                            th = th39;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    } catch (Throwable th40) {
                                                                                                                                                                                                        th = th40;
                                                                                                                                                                                                        Throwable cause21 = th.getCause();
                                                                                                                                                                                                        if (cause21 != null) {
                                                                                                                                                                                                            throw cause21;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        throw th;
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        } catch (Throwable th41) {
                                                                                                                                                                                            th = th41;
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            } catch (Throwable th42) {
                                                                                                                                                                                th = th42;
                                                                                                                                                                                cls18 = cls32;
                                                                                                                                                                            }
                                                                                                                                                                        } else {
                                                                                                                                                                            cls19 = cls32;
                                                                                                                                                                        }
                                                                                                                                                                        int i48 = n;
                                                                                                                                                                        m = ((i48 & 71) + (i48 | 71)) % 128;
                                                                                                                                                                        int i49 = Barcode.FORMAT_UPC_E;
                                                                                                                                                                        try {
                                                                                                                                                                            byte[] bArr25 = new byte[Barcode.FORMAT_UPC_E];
                                                                                                                                                                            byte b25 = bArr22[7];
                                                                                                                                                                            Method method2 = cls39.getMethod(b(bArr22[c3], b25, (short) (b25 | 524)), cls31, cls34, cls34);
                                                                                                                                                                            int i50 = i40;
                                                                                                                                                                            while (i50 > 0) {
                                                                                                                                                                                try {
                                                                                                                                                                                    Integer num = (Integer) method.invoke(newInstance, bArr25, 0, Integer.valueOf(Math.min(i49, i50)));
                                                                                                                                                                                    int intValue = num.intValue();
                                                                                                                                                                                    if (intValue == i3) {
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    method2.invoke(newInstance5, bArr25, 0, num);
                                                                                                                                                                                    i50 = (i50 - (~(-intValue))) - 1;
                                                                                                                                                                                    i49 = Barcode.FORMAT_UPC_E;
                                                                                                                                                                                    i3 = -1;
                                                                                                                                                                                } catch (Throwable th43) {
                                                                                                                                                                                    th = th43;
                                                                                                                                                                                    byte[] bArr242 = i;
                                                                                                                                                                                    ((Boolean) Class.forName(b((byte) (-bArr242[c7]), bArr242[57], (short) 1031)).getMethod(b((byte) (bArr242[c3] - 1), bArr242[18], (short) 452), null).invoke(obj15, null)).getClass();
                                                                                                                                                                                    ((Boolean) Class.forName(b((byte) (-bArr242[c7]), bArr242[57], (short) 1031)).getMethod(b((byte) ((-2) - (bArr242[c3] ^ (-1))), bArr242[18], (short) 452), null).invoke(obj16, null)).getClass();
                                                                                                                                                                                    throw th;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            if (e) {
                                                                                                                                                                                byte[] bArr26 = i;
                                                                                                                                                                                Object invoke4 = cls39.getMethod(b(bArr26[c3], bArr26[3], (short) 520), null).invoke(newInstance5, null);
                                                                                                                                                                                Class<?> cls42 = Class.forName(b(bArr26[48], bArr26[57], (short) 516));
                                                                                                                                                                                byte b26 = bArr26[16];
                                                                                                                                                                                short s4 = (short) ((b26 ^ 491) | (b26 & 491));
                                                                                                                                                                                cls42.getMethod(b((byte) (s4 & 87), b26, s4), null).invoke(invoke4, null);
                                                                                                                                                                            }
                                                                                                                                                                            byte[] bArr27 = i;
                                                                                                                                                                            cls39.getMethod(b(bArr27[c3], bArr27[61], (short) 876), null).invoke(newInstance5, null);
                                                                                                                                                                            Method declaredMethod = Class.forName(b(bArr27[122], bArr27[18], (short) 492)).getDeclaredMethod(b(bArr27[330], bArr27[c2], (short) 472), String.class, String.class, cls37);
                                                                                                                                                                            try {
                                                                                                                                                                                Class<?> cls43 = Class.forName(b((byte) (-bArr27[c7]), bArr27[57], (short) 1031));
                                                                                                                                                                                byte b27 = bArr27[3];
                                                                                                                                                                                Object invoke5 = cls43.getMethod(b(bArr27[c5], b27, (short) ((b27 ^ MessagePack.Code.FALSE) | (b27 & MessagePack.Code.FALSE))), null).invoke(obj15, null);
                                                                                                                                                                                int i51 = n;
                                                                                                                                                                                m = (i51 + 41) % 128;
                                                                                                                                                                                try {
                                                                                                                                                                                    Class<?> cls44 = Class.forName(b((byte) (-bArr27[c7]), bArr27[57], (short) 1031));
                                                                                                                                                                                    byte b28 = bArr27[3];
                                                                                                                                                                                    obj14 = declaredMethod.invoke(null, invoke5, cls44.getMethod(b(bArr27[c5], b28, (short) ((b28 ^ MessagePack.Code.FALSE) | (b28 & MessagePack.Code.FALSE))), null).invoke(obj16, null), 0);
                                                                                                                                                                                    try {
                                                                                                                                                                                        Class<?> cls45 = Class.forName(b((byte) (-bArr27[c7]), bArr27[57], (short) 1031));
                                                                                                                                                                                        byte b29 = bArr27[18];
                                                                                                                                                                                        byte b30 = bArr27[c3];
                                                                                                                                                                                        ((Boolean) cls45.getMethod(b((byte) ((b30 ^ (-1)) + (b30 << 1)), b29, (short) 452), null).invoke(obj15, null)).getClass();
                                                                                                                                                                                        try {
                                                                                                                                                                                            ((Boolean) Class.forName(b((byte) (-bArr27[c7]), bArr27[57], (short) 1031)).getMethod(b((byte) (bArr27[c3] - 1), bArr27[18], (short) 452), null).invoke(obj16, null)).getClass();
                                                                                                                                                                                            int i52 = (((i51 | 125) << 1) - (i51 ^ 125)) % 128;
                                                                                                                                                                                            m = i52;
                                                                                                                                                                                            try {
                                                                                                                                                                                                if (b == null) {
                                                                                                                                                                                                    n = ((i52 ^ 107) + ((i52 & 107) << 1)) % 128;
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        byte b31 = bArr27[3];
                                                                                                                                                                                                        String b32 = b((byte) (-bArr27[s2]), b31, (short) (b31 | 431));
                                                                                                                                                                                                        Class cls46 = cls19;
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            cls22 = cls40;
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    b = cls46.getMethod(b32, null).invoke(cls22, null);
                                                                                                                                                                                                                    cls20 = cls46;
                                                                                                                                                                                                                } catch (Throwable th44) {
                                                                                                                                                                                                                    th = th44;
                                                                                                                                                                                                                    zipFile6 = zipFile;
                                                                                                                                                                                                                    zipFile3 = zipFile6;
                                                                                                                                                                                                                    r15 = zipFile3;
                                                                                                                                                                                                                    if (r15 != 0) {
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    throw th;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            } catch (Throwable th45) {
                                                                                                                                                                                                                th = th45;
                                                                                                                                                                                                                Throwable cause22 = th.getCause();
                                                                                                                                                                                                                if (cause22 != null) {
                                                                                                                                                                                                                    throw cause22;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                throw th;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        } catch (Throwable th46) {
                                                                                                                                                                                                            th = th46;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    } catch (Throwable th47) {
                                                                                                                                                                                                        th = th47;
                                                                                                                                                                                                    }
                                                                                                                                                                                                } else {
                                                                                                                                                                                                    cls22 = cls40;
                                                                                                                                                                                                    cls20 = cls19;
                                                                                                                                                                                                }
                                                                                                                                                                                                cls4 = cls31;
                                                                                                                                                                                                cls14 = cls37;
                                                                                                                                                                                                i3 = -1;
                                                                                                                                                                                                cls6 = cls20;
                                                                                                                                                                                            } catch (Throwable th48) {
                                                                                                                                                                                                th = th48;
                                                                                                                                                                                                zipFile6 = zipFile;
                                                                                                                                                                                                zipFile3 = zipFile6;
                                                                                                                                                                                                r15 = zipFile3;
                                                                                                                                                                                                if (r15 != 0) {
                                                                                                                                                                                                }
                                                                                                                                                                                                throw th;
                                                                                                                                                                                            }
                                                                                                                                                                                        } catch (Throwable th49) {
                                                                                                                                                                                            Throwable cause23 = th49.getCause();
                                                                                                                                                                                            if (cause23 != null) {
                                                                                                                                                                                                throw cause23;
                                                                                                                                                                                            }
                                                                                                                                                                                            throw th49;
                                                                                                                                                                                        }
                                                                                                                                                                                    } catch (Throwable th50) {
                                                                                                                                                                                        Throwable cause24 = th50.getCause();
                                                                                                                                                                                        if (cause24 != null) {
                                                                                                                                                                                            throw cause24;
                                                                                                                                                                                        }
                                                                                                                                                                                        throw th50;
                                                                                                                                                                                    }
                                                                                                                                                                                } catch (Throwable th51) {
                                                                                                                                                                                    Throwable cause25 = th51.getCause();
                                                                                                                                                                                    if (cause25 != null) {
                                                                                                                                                                                        throw cause25;
                                                                                                                                                                                    }
                                                                                                                                                                                    throw th51;
                                                                                                                                                                                }
                                                                                                                                                                            } catch (Throwable th52) {
                                                                                                                                                                                Throwable cause26 = th52.getCause();
                                                                                                                                                                                if (cause26 != null) {
                                                                                                                                                                                    throw cause26;
                                                                                                                                                                                }
                                                                                                                                                                                throw th52;
                                                                                                                                                                            }
                                                                                                                                                                        } catch (Throwable th53) {
                                                                                                                                                                            th = th53;
                                                                                                                                                                            byte[] bArr2422 = i;
                                                                                                                                                                            ((Boolean) Class.forName(b((byte) (-bArr2422[c7]), bArr2422[57], (short) 1031)).getMethod(b((byte) (bArr2422[c3] - 1), bArr2422[18], (short) 452), null).invoke(obj15, null)).getClass();
                                                                                                                                                                            ((Boolean) Class.forName(b((byte) (-bArr2422[c7]), bArr2422[57], (short) 1031)).getMethod(b((byte) ((-2) - (bArr2422[c3] ^ (-1))), bArr2422[18], (short) 452), null).invoke(obj16, null)).getClass();
                                                                                                                                                                            throw th;
                                                                                                                                                                        }
                                                                                                                                                                    } catch (Exception e4) {
                                                                                                                                                                        e = e4;
                                                                                                                                                                    } catch (Throwable th54) {
                                                                                                                                                                        th = th54;
                                                                                                                                                                    }
                                                                                                                                                                } catch (Exception e5) {
                                                                                                                                                                    e = e5;
                                                                                                                                                                }
                                                                                                                                                            } catch (Throwable th55) {
                                                                                                                                                                th = th55;
                                                                                                                                                                byte[] bArr24222 = i;
                                                                                                                                                                ((Boolean) Class.forName(b((byte) (-bArr24222[c7]), bArr24222[57], (short) 1031)).getMethod(b((byte) (bArr24222[c3] - 1), bArr24222[18], (short) 452), null).invoke(obj15, null)).getClass();
                                                                                                                                                                ((Boolean) Class.forName(b((byte) (-bArr24222[c7]), bArr24222[57], (short) 1031)).getMethod(b((byte) ((-2) - (bArr24222[c3] ^ (-1))), bArr24222[18], (short) 452), null).invoke(obj16, null)).getClass();
                                                                                                                                                                throw th;
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th56) {
                                                                                                                                                            th = th56;
                                                                                                                                                            zipFile6 = zipFile;
                                                                                                                                                            zipFile3 = zipFile6;
                                                                                                                                                            r15 = zipFile3;
                                                                                                                                                            if (r15 != 0) {
                                                                                                                                                            }
                                                                                                                                                            throw th;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th57) {
                                                                                                                                                        th = th57;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    try {
                                                                                                                                                        c9 = 18;
                                                                                                                                                        Class<?> cls47 = Class.forName(b(bArr22[78], bArr22[57], (short) 434));
                                                                                                                                                        Class<?> cls48 = Class.forName(b(bArr22[255], bArr22[57], s3));
                                                                                                                                                        Object newInstance6 = cls47.getConstructor(cls48).newInstance(newInstance);
                                                                                                                                                        try {
                                                                                                                                                            byte b33 = bArr22[3];
                                                                                                                                                            Object invoke6 = cls47.getMethod(b((byte) (-bArr22[c7]), b33, (short) ((b33 ^ 391) | (b33 & 391))), null).invoke(newInstance6, null);
                                                                                                                                                            Class<?> cls49 = Class.forName(b(bArr22[48], bArr22[57], (short) 396));
                                                                                                                                                            byte b34 = bArr22[3];
                                                                                                                                                            Method method3 = cls49.getMethod(b(bArr22[330], b34, (short) (b34 | 359)), null);
                                                                                                                                                            byte b35 = bArr22[41];
                                                                                                                                                            i3 = -1;
                                                                                                                                                            Method method4 = cls48.getMethod(b((byte) ((-2) - (bArr22[c6] ^ (-1))), b35, (short) ((b35 ^ 536) | (b35 & 536))), cls31);
                                                                                                                                                            try {
                                                                                                                                                                cls13 = cls21;
                                                                                                                                                                try {
                                                                                                                                                                    Object newInstance7 = Class.forName(b((byte) (-bArr22[169]), bArr22[57], (short) 773)).getDeclaredConstructor(Class.forName(b(bArr22[255], bArr22[57], (short) (i41 | 737)))).newInstance(newInstance6);
                                                                                                                                                                    try {
                                                                                                                                                                        byte b36 = bArr22[3];
                                                                                                                                                                        try {
                                                                                                                                                                            Object invoke7 = cls32.getMethod(b((byte) (-bArr22[s2]), b36, (short) ((b36 ^ 431) | (b36 & 431))), null).invoke(cls22, null);
                                                                                                                                                                            try {
                                                                                                                                                                                int longValue = (int) ((Long) method3.invoke(invoke6, null)).longValue();
                                                                                                                                                                                Class<?> cls50 = Class.forName(b(bArr22[255], bArr22[57], (short) 369));
                                                                                                                                                                                byte b37 = bArr22[82];
                                                                                                                                                                                Object invoke8 = cls50.getMethod(b((byte) (-bArr22[s2]), b37, (short) (b37 | 329)), cls34).invoke(null, Integer.valueOf(longValue));
                                                                                                                                                                                cls14 = cls37;
                                                                                                                                                                                try {
                                                                                                                                                                                    try {
                                                                                                                                                                                        Method method5 = cls50.getMethod(b(bArr22[c6], bArr22[318], s2), cls31, cls34, cls34);
                                                                                                                                                                                        try {
                                                                                                                                                                                            Method method6 = Class.forName(b(bArr22[34], bArr22[57], (short) 336)).getMethod(b(bArr22[c3], bArr22[61], (short) 876), null);
                                                                                                                                                                                            bArr4 = new byte[Barcode.FORMAT_UPC_E];
                                                                                                                                                                                            int i53 = b17;
                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                Integer num2 = (Integer) method4.invoke(newInstance7, bArr4);
                                                                                                                                                                                                int intValue2 = num2.intValue();
                                                                                                                                                                                                if (intValue2 <= 0 || i53 >= longValue) {
                                                                                                                                                                                                    break;
                                                                                                                                                                                                }
                                                                                                                                                                                                method5.invoke(invoke8, bArr4, 0, num2);
                                                                                                                                                                                                i53 = ((i53 | intValue2) << 1) - (i53 ^ intValue2);
                                                                                                                                                                                            }
                                                                                                                                                                                            try {
                                                                                                                                                                                                method6.invoke(newInstance7, null);
                                                                                                                                                                                            } catch (Exception unused10) {
                                                                                                                                                                                            }
                                                                                                                                                                                            bArr5 = i;
                                                                                                                                                                                            cls15 = Class.forName(b((byte) (bArr5[89] - 1), bArr5[18], (short) 320));
                                                                                                                                                                                            cls16 = Class.forName(b(bArr5[255], bArr5[57], (short) 369));
                                                                                                                                                                                            b3 = bArr5[57];
                                                                                                                                                                                            r152 = b3 ^ 272;
                                                                                                                                                                                            cls4 = cls31;
                                                                                                                                                                                        } catch (Throwable th58) {
                                                                                                                                                                                            th = th58;
                                                                                                                                                                                        }
                                                                                                                                                                                        try {
                                                                                                                                                                                            try {
                                                                                                                                                                                                Constructor<?> declaredConstructor = cls15.getDeclaredConstructor(cls16, Class.forName(b(bArr5[122], b3, (short) ((b3 & 272) | r152))));
                                                                                                                                                                                                Method method7 = cls50.getMethod(b(bArr5[510], bArr5[318], (short) 265), cls14);
                                                                                                                                                                                                method7.invoke(invoke8, 0);
                                                                                                                                                                                                Object newInstance8 = declaredConstructor.newInstance(invoke8, invoke7);
                                                                                                                                                                                                method7.invoke(invoke8, 0);
                                                                                                                                                                                                Arrays.fill(bArr4, b17);
                                                                                                                                                                                                method5.invoke(invoke8, bArr4, 0, Integer.valueOf(Math.min(256, longValue)));
                                                                                                                                                                                                try {
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        Field declaredField = Class.forName(b((byte) (-bArr5[25]), bArr5[18], (short) 258)).getDeclaredField(b(bArr5[510], bArr5[318], (short) 227));
                                                                                                                                                                                                        declaredField.setAccessible(true);
                                                                                                                                                                                                        Object obj19 = declaredField.get(invoke7);
                                                                                                                                                                                                        Class<?> cls51 = obj19.getClass();
                                                                                                                                                                                                        Field declaredField2 = cls51.getDeclaredField(b((byte) (-bArr5[10]), bArr5[24], (short) 220));
                                                                                                                                                                                                        declaredField2.setAccessible(true);
                                                                                                                                                                                                        Field declaredField3 = cls51.getDeclaredField(b(bArr5[170], bArr5[24], (short) 197));
                                                                                                                                                                                                        declaredField3.setAccessible(true);
                                                                                                                                                                                                        Object obj20 = declaredField2.get(obj19);
                                                                                                                                                                                                        Object obj21 = declaredField3.get(obj19);
                                                                                                                                                                                                        Object obj22 = declaredField.get(newInstance8);
                                                                                                                                                                                                        ArrayList arrayList = new ArrayList((List) obj20);
                                                                                                                                                                                                        Class<?> cls52 = obj21.getClass();
                                                                                                                                                                                                        int i54 = (m + 71) % 128;
                                                                                                                                                                                                        n = i54;
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                Class cls53 = (Class) cls32.getMethod(b(bArr5[c8], bArr5[3], (short) 173), null).invoke(cls52, null);
                                                                                                                                                                                                                int length2 = Array.getLength(obj21);
                                                                                                                                                                                                                Object newInstance9 = Array.newInstance((Class<?>) cls53, length2);
                                                                                                                                                                                                                m = (i54 + 29) % 128;
                                                                                                                                                                                                                for (int i55 = 0; i55 < length2; i55 = ((i55 & 1) << 1) + (i55 ^ 1)) {
                                                                                                                                                                                                                    Array.set(newInstance9, i55, Array.get(obj21, i55));
                                                                                                                                                                                                                }
                                                                                                                                                                                                                declaredField2.set(obj22, arrayList);
                                                                                                                                                                                                                declaredField3.set(obj22, newInstance9);
                                                                                                                                                                                                                int i56 = n;
                                                                                                                                                                                                                int i57 = (i56 & 59) + (i56 | 59);
                                                                                                                                                                                                                m = i57 % 128;
                                                                                                                                                                                                                if (i57 % 2 == 0) {
                                                                                                                                                                                                                    if (b == null) {
                                                                                                                                                                                                                        b = newInstance8;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    obj14 = newInstance8;
                                                                                                                                                                                                                    cls6 = cls32;
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            } catch (Throwable th59) {
                                                                                                                                                                                                                th = th59;
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    Throwable cause27 = th.getCause();
                                                                                                                                                                                                                    if (cause27 != null) {
                                                                                                                                                                                                                        throw cause27;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    throw th;
                                                                                                                                                                                                                } catch (Exception e6) {
                                                                                                                                                                                                                    e = e6;
                                                                                                                                                                                                                    StringBuilder sb8 = new StringBuilder();
                                                                                                                                                                                                                    byte b38 = i[170];
                                                                                                                                                                                                                    int i58 = j;
                                                                                                                                                                                                                    sb8.append(b(r5[c3], b38, (short) (i58 | 148)));
                                                                                                                                                                                                                    sb8.append(invoke7);
                                                                                                                                                                                                                    sb8.append(b(r5[866], (byte) (i58 ^ 68), (short) 933));
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            throw ((Throwable) Class.forName(b(r5[255], r5[57], (short) 933)).getDeclaredConstructor(String.class, cls13).newInstance(sb8.toString(), e));
                                                                                                                                                                                                                        } catch (Throwable th60) {
                                                                                                                                                                                                                            th = th60;
                                                                                                                                                                                                                            Throwable cause28 = th.getCause();
                                                                                                                                                                                                                            if (cause28 != null) {
                                                                                                                                                                                                                                throw cause28;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            throw th;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    } catch (Throwable th61) {
                                                                                                                                                                                                                        th = th61;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        } catch (Throwable th62) {
                                                                                                                                                                                                            th = th62;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    } catch (Throwable th63) {
                                                                                                                                                                                                        th = th63;
                                                                                                                                                                                                        r152 = zipFile;
                                                                                                                                                                                                        r15 = r152;
                                                                                                                                                                                                        if (r15 != 0) {
                                                                                                                                                                                                        }
                                                                                                                                                                                                        throw th;
                                                                                                                                                                                                    }
                                                                                                                                                                                                } catch (Exception e7) {
                                                                                                                                                                                                    e = e7;
                                                                                                                                                                                                }
                                                                                                                                                                                            } catch (Throwable th64) {
                                                                                                                                                                                                th = th64;
                                                                                                                                                                                            }
                                                                                                                                                                                        } catch (Throwable th65) {
                                                                                                                                                                                            th = th65;
                                                                                                                                                                                            r15 = zipFile;
                                                                                                                                                                                            if (r15 != 0) {
                                                                                                                                                                                            }
                                                                                                                                                                                            throw th;
                                                                                                                                                                                        }
                                                                                                                                                                                    } catch (Throwable th66) {
                                                                                                                                                                                        th = th66;
                                                                                                                                                                                        zipFile3 = zipFile;
                                                                                                                                                                                        r15 = zipFile3;
                                                                                                                                                                                        if (r15 != 0) {
                                                                                                                                                                                        }
                                                                                                                                                                                        throw th;
                                                                                                                                                                                    }
                                                                                                                                                                                } catch (Throwable th67) {
                                                                                                                                                                                    th = th67;
                                                                                                                                                                                    zipFile5 = zipFile;
                                                                                                                                                                                    zipFile3 = zipFile5;
                                                                                                                                                                                    r15 = zipFile3;
                                                                                                                                                                                    if (r15 != 0) {
                                                                                                                                                                                    }
                                                                                                                                                                                    throw th;
                                                                                                                                                                                }
                                                                                                                                                                            } catch (Throwable th68) {
                                                                                                                                                                                th = th68;
                                                                                                                                                                            }
                                                                                                                                                                        } catch (Throwable th69) {
                                                                                                                                                                            th = th69;
                                                                                                                                                                            Throwable cause29 = th.getCause();
                                                                                                                                                                            if (cause29 != null) {
                                                                                                                                                                                throw cause29;
                                                                                                                                                                            }
                                                                                                                                                                            throw th;
                                                                                                                                                                        }
                                                                                                                                                                    } catch (Throwable th70) {
                                                                                                                                                                        th = th70;
                                                                                                                                                                    }
                                                                                                                                                                } catch (Throwable th71) {
                                                                                                                                                                    th = th71;
                                                                                                                                                                    Throwable cause30 = th.getCause();
                                                                                                                                                                    if (cause30 != null) {
                                                                                                                                                                        throw cause30;
                                                                                                                                                                    }
                                                                                                                                                                    throw th;
                                                                                                                                                                }
                                                                                                                                                            } catch (Throwable th72) {
                                                                                                                                                                th = th72;
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th73) {
                                                                                                                                                            th = th73;
                                                                                                                                                            zipFile6 = zipFile;
                                                                                                                                                            zipFile3 = zipFile6;
                                                                                                                                                            r15 = zipFile3;
                                                                                                                                                            if (r15 != 0) {
                                                                                                                                                            }
                                                                                                                                                            throw th;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th74) {
                                                                                                                                                        th = th74;
                                                                                                                                                        zipFile6 = zipFile;
                                                                                                                                                        zipFile3 = zipFile6;
                                                                                                                                                        r15 = zipFile3;
                                                                                                                                                        if (r15 != 0) {
                                                                                                                                                        }
                                                                                                                                                        throw th;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                if (z7) {
                                                                                                                                                    try {
                                                                                                                                                        byte[] bArr28 = i;
                                                                                                                                                        Class<?> cls54 = Class.forName(b(bArr28[122], bArr28[c9], (short) 492));
                                                                                                                                                        String b39 = b((byte) (-bArr28[19]), bArr28[c2], (short) (j ^ 144));
                                                                                                                                                        byte b40 = bArr28[57];
                                                                                                                                                        Method declaredMethod2 = cls54.getDeclaredMethod(b39, String.class, Class.forName(b(bArr28[122], b40, (short) (b40 | 272))));
                                                                                                                                                        declaredMethod2.setAccessible(true);
                                                                                                                                                        i2 = 3;
                                                                                                                                                        try {
                                                                                                                                                            byte b41 = bArr28[3];
                                                                                                                                                            s2 = 338;
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    ?? invoke9 = declaredMethod2.invoke(obj14, str3, cls6.getMethod(b((byte) (-bArr28[338]), b41, (short) ((b41 ^ 431) | (b41 & 431))), null).invoke(cls22, null));
                                                                                                                                                                    if (invoke9 != null) {
                                                                                                                                                                        cls54.getDeclaredMethod(b(bArr28[c3], bArr28[61], (short) 876), null).invoke(obj14, null);
                                                                                                                                                                    }
                                                                                                                                                                    cls17 = invoke9;
                                                                                                                                                                } catch (Throwable th75) {
                                                                                                                                                                    th = th75;
                                                                                                                                                                    zipFile7 = zipFile;
                                                                                                                                                                    r15 = zipFile7;
                                                                                                                                                                    if (r15 != 0) {
                                                                                                                                                                    }
                                                                                                                                                                    throw th;
                                                                                                                                                                }
                                                                                                                                                            } catch (Throwable th76) {
                                                                                                                                                                th = th76;
                                                                                                                                                                Throwable cause31 = th.getCause();
                                                                                                                                                                if (cause31 != null) {
                                                                                                                                                                    throw cause31;
                                                                                                                                                                }
                                                                                                                                                                throw th;
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th77) {
                                                                                                                                                            th = th77;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th78) {
                                                                                                                                                        th = th78;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    String str6 = str3;
                                                                                                                                                    i2 = 3;
                                                                                                                                                    s2 = 338;
                                                                                                                                                    try {
                                                                                                                                                        byte[] bArr29 = i;
                                                                                                                                                        byte b42 = bArr29[57];
                                                                                                                                                        Method declaredMethod3 = Class.forName(b(bArr29[122], b42, (short) ((b42 ^ 272) | (b42 & 272)))).getDeclaredMethod(b((byte) (-bArr29[19]), bArr29[c2], (short) (j ^ 144)), String.class);
                                                                                                                                                        try {
                                                                                                                                                            declaredMethod3.setAccessible(true);
                                                                                                                                                            cls17 = declaredMethod3.invoke(obj14, str6);
                                                                                                                                                        } catch (InvocationTargetException e8) {
                                                                                                                                                            try {
                                                                                                                                                                throw ((Exception) e8.getCause());
                                                                                                                                                                break loop0;
                                                                                                                                                            } catch (ClassNotFoundException unused11) {
                                                                                                                                                                cls17 = null;
                                                                                                                                                                if (cls17 != null) {
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th79) {
                                                                                                                                                        th = th79;
                                                                                                                                                        r152 = zipFile;
                                                                                                                                                        r15 = r152;
                                                                                                                                                        if (r15 != 0) {
                                                                                                                                                        }
                                                                                                                                                        throw th;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                if (cls17 != null) {
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                try {
                                                                                                                                                    cls30 = cls17;
                                                                                                                                                    byte[] bArr30 = i;
                                                                                                                                                    str5 = b(bArr30[158], bArr30[61], (short) 146);
                                                                                                                                                    Constructor declaredConstructor2 = cls30.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                                                                                    declaredConstructor2.setAccessible(true);
                                                                                                                                                    a = declaredConstructor2.newInstance(obj14, Boolean.valueOf(!z7));
                                                                                                                                                    byte[] bArr31 = new byte[452568];
                                                                                                                                                    if (z16) {
                                                                                                                                                        byte b43 = bArr30[c6];
                                                                                                                                                        zipFile8 = zipFile;
                                                                                                                                                        try {
                                                                                                                                                            resourceAsStream2 = zipFile8.getInputStream(zipFile8.getEntry(b(bArr30[41], b43, (short) ((b43 ^ 23) | (b43 & 23))).substring(1)));
                                                                                                                                                            zipFile8 = zipFile8;
                                                                                                                                                        } catch (Throwable th80) {
                                                                                                                                                            th = th80;
                                                                                                                                                            zipFile7 = zipFile8;
                                                                                                                                                            r15 = zipFile7;
                                                                                                                                                            if (r15 != 0) {
                                                                                                                                                            }
                                                                                                                                                            throw th;
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        zipFile8 = zipFile;
                                                                                                                                                        byte b44 = bArr30[c6];
                                                                                                                                                        resourceAsStream2 = cls22.getResourceAsStream(b(bArr30[41], b44, (short) ((b44 ^ 23) | (b44 & 23))));
                                                                                                                                                    }
                                                                                                                                                    int i59 = n;
                                                                                                                                                    int i60 = (((i59 | 109) << 1) - (i59 ^ 109)) % 128;
                                                                                                                                                    m = i60;
                                                                                                                                                    try {
                                                                                                                                                        Class<?> cls55 = Class.forName(b((byte) (-bArr30[169]), bArr30[57], (short) 773));
                                                                                                                                                        byte b45 = bArr30[57];
                                                                                                                                                        int i61 = j;
                                                                                                                                                        short s5 = (short) ((i61 & 737) | (i61 ^ 737));
                                                                                                                                                        Object newInstance10 = cls55.getDeclaredConstructor(Class.forName(b(bArr30[255], b45, s5))).newInstance(resourceAsStream2);
                                                                                                                                                        n = (i60 + 41) % 128;
                                                                                                                                                        try {
                                                                                                                                                            Object newInstance11 = Class.forName(b(bArr30[609], bArr30[57], (short) 729)).getDeclaredConstructor(Class.forName(b(bArr30[255], bArr30[57], s5))).newInstance(newInstance10);
                                                                                                                                                            try {
                                                                                                                                                                Class.forName(b(bArr30[609], bArr30[57], (short) 729)).getMethod(b((byte) (-bArr30[19]), bArr30[41], (short) 707), cls4).invoke(newInstance11, bArr31);
                                                                                                                                                                try {
                                                                                                                                                                    Class.forName(b(bArr30[609], bArr30[57], (short) 729)).getMethod(b(bArr30[c3], bArr30[61], (short) 876), null).invoke(newInstance11, null);
                                                                                                                                                                    i37 = 452532;
                                                                                                                                                                    zipFile2 = zipFile8;
                                                                                                                                                                    cls26222 = r39;
                                                                                                                                                                    zArr11 = zArr2;
                                                                                                                                                                    cls21 = cls13;
                                                                                                                                                                    b17 = 0;
                                                                                                                                                                    i20222 = 4;
                                                                                                                                                                    i21222 = 6;
                                                                                                                                                                    i38 = Math.abs(i42);
                                                                                                                                                                    bArr20 = bArr31;
                                                                                                                                                                    cls31 = cls4;
                                                                                                                                                                    cls32 = cls6;
                                                                                                                                                                } catch (Throwable th81) {
                                                                                                                                                                    Throwable cause32 = th81.getCause();
                                                                                                                                                                    if (cause32 != null) {
                                                                                                                                                                        throw cause32;
                                                                                                                                                                    }
                                                                                                                                                                    throw th81;
                                                                                                                                                                }
                                                                                                                                                            } catch (Throwable th82) {
                                                                                                                                                                Throwable cause33 = th82.getCause();
                                                                                                                                                                if (cause33 != null) {
                                                                                                                                                                    throw cause33;
                                                                                                                                                                }
                                                                                                                                                                throw th82;
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th83) {
                                                                                                                                                            Throwable cause34 = th83.getCause();
                                                                                                                                                            if (cause34 != null) {
                                                                                                                                                                throw cause34;
                                                                                                                                                            }
                                                                                                                                                            throw th83;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th84) {
                                                                                                                                                        Throwable cause35 = th84.getCause();
                                                                                                                                                        if (cause35 != null) {
                                                                                                                                                            throw cause35;
                                                                                                                                                        }
                                                                                                                                                        throw th84;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th85) {
                                                                                                                                                    th = th85;
                                                                                                                                                    zipFile8 = zipFile;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th86) {
                                                                                                                                                th = th86;
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th87) {
                                                                                                                                            th = th87;
                                                                                                                                            zipFile3 = zipFile2;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th88) {
                                                                                                                                        th = th88;
                                                                                                                                        cause = th.getCause();
                                                                                                                                        if (cause == null) {
                                                                                                                                            throw cause;
                                                                                                                                        }
                                                                                                                                        throw th;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th89) {
                                                                                                                                    th = th89;
                                                                                                                                    cause = th.getCause();
                                                                                                                                    if (cause == null) {
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } catch (Throwable th90) {
                                                                                                                                th = th90;
                                                                                                                            }
                                                                                                                        } catch (Throwable th91) {
                                                                                                                            th = th91;
                                                                                                                            zArr5 = zArr11;
                                                                                                                            r15 = zipFile2;
                                                                                                                            if (r15 != 0) {
                                                                                                                            }
                                                                                                                            throw th;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    int i62 = i6 + 41;
                                                                                                                    i23222 = 1;
                                                                                                                    i22222 = ((i62 & (-40)) << 1) + (i62 ^ (-40));
                                                                                                                    cls26222 = cls5;
                                                                                                                    i20222 = i7;
                                                                                                                    zArr7222 = zArr10;
                                                                                                                    z14222 = z5;
                                                                                                                    b7 = str2;
                                                                                                                    objArr3222 = objArr;
                                                                                                                    zArr8222 = zArr;
                                                                                                                    cls27222 = cls4;
                                                                                                                    zArr9222 = zArr2;
                                                                                                                    i21222 = 6;
                                                                                                                    r3222 = cls6;
                                                                                                                    z15222 = z6;
                                                                                                                } catch (Throwable th92) {
                                                                                                                    Throwable cause36 = th92.getCause();
                                                                                                                    if (cause36 != null) {
                                                                                                                        throw cause36;
                                                                                                                    }
                                                                                                                    throw th92;
                                                                                                                }
                                                                                                            } catch (Throwable th93) {
                                                                                                                th = th93;
                                                                                                                r15 = zArr9222;
                                                                                                            }
                                                                                                        } catch (Throwable th94) {
                                                                                                            Throwable cause37 = th94.getCause();
                                                                                                            if (cause37 != null) {
                                                                                                                throw cause37;
                                                                                                            }
                                                                                                            throw th94;
                                                                                                        }
                                                                                                    } catch (Throwable th95) {
                                                                                                        Throwable cause38 = th95.getCause();
                                                                                                        if (cause38 != null) {
                                                                                                            throw cause38;
                                                                                                        }
                                                                                                        throw th95;
                                                                                                    }
                                                                                                } catch (Throwable th96) {
                                                                                                    th = th96;
                                                                                                    Throwable cause39 = th.getCause();
                                                                                                    if (cause39 != null) {
                                                                                                        throw cause39;
                                                                                                    }
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (Throwable th97) {
                                                                                                th = th97;
                                                                                            }
                                                                                        } catch (Throwable th98) {
                                                                                            th = th98;
                                                                                            zArr5 = zArr9222;
                                                                                        }
                                                                                    } catch (Throwable th99) {
                                                                                        th = th99;
                                                                                        Throwable cause40 = th.getCause();
                                                                                        if (cause40 != null) {
                                                                                            throw cause40;
                                                                                        }
                                                                                        throw th;
                                                                                    }
                                                                                } catch (Throwable th100) {
                                                                                    th = th100;
                                                                                }
                                                                            } catch (Throwable th101) {
                                                                                Throwable cause41 = th101.getCause();
                                                                                if (cause41 != null) {
                                                                                    throw cause41;
                                                                                }
                                                                                throw th101;
                                                                            }
                                                                        } else {
                                                                            cls4 = cls27222;
                                                                            cls5 = cls26222;
                                                                            z5 = z14222;
                                                                            i5 = i4;
                                                                            str2 = b7;
                                                                            i6 = i22222;
                                                                            objArr = objArr3222;
                                                                            zArr = zArr8222;
                                                                            zArr2 = zArr9222;
                                                                            i7 = i20222;
                                                                            cls6 = r3222;
                                                                            z6 = z15222;
                                                                        }
                                                                        i4 = i5;
                                                                        int i622 = i6 + 41;
                                                                        i23222 = 1;
                                                                        i22222 = ((i622 & (-40)) << 1) + (i622 ^ (-40));
                                                                        cls26222 = cls5;
                                                                        i20222 = i7;
                                                                        zArr7222 = zArr10;
                                                                        z14222 = z5;
                                                                        b7 = str2;
                                                                        objArr3222 = objArr;
                                                                        zArr8222 = zArr;
                                                                        cls27222 = cls4;
                                                                        zArr9222 = zArr2;
                                                                        i21222 = 6;
                                                                        r3222 = cls6;
                                                                        z15222 = z6;
                                                                    } else {
                                                                        return;
                                                                    }
                                                                }
                                                            } catch (Throwable th102) {
                                                                Throwable cause42 = th102.getCause();
                                                                if (cause42 != null) {
                                                                    throw cause42;
                                                                }
                                                                throw th102;
                                                            }
                                                        }
                                                    }
                                                    c6 = 810;
                                                    c7 = 148;
                                                    if (invoke3 == null) {
                                                    }
                                                    if (invoke2 == null) {
                                                        int i242 = m;
                                                        n = ((i242 & 43) + (i242 | 43)) % 128;
                                                        byte[] bArr102 = i;
                                                        byte b112 = bArr102[61];
                                                        Object[] objArr52 = new Object[2];
                                                        objArr52[z3 ? 1 : 0] = b(bArr102[c4], b112, (short) ((b112 ^ MessagePack.Code.FALSE) | (b112 & MessagePack.Code.FALSE)));
                                                        objArr52[z ? 1 : 0] = invoke;
                                                        invoke2 = Class.forName(b((byte) (-bArr102[c7]), bArr102[57], (short) 1031)).getDeclaredConstructor(Class.forName(b((byte) (-bArr102[c7]), bArr102[57], (short) 1031)), String.class).newInstance(objArr52);
                                                    }
                                                    byte[] bArr82222 = i;
                                                    Object[] objArr32222 = (Object[]) Array.newInstance(Class.forName(b((byte) (-bArr82222[c7]), bArr82222[57], (short) 1031)), 7);
                                                    objArr32222[z ? 1 : 0] = null;
                                                    objArr32222[z3 ? 1 : 0] = invoke2;
                                                    objArr32222[2] = invoke;
                                                    objArr32222[i2] = invoke3;
                                                    objArr32222[4] = invoke2;
                                                    objArr32222[5] = invoke;
                                                    objArr32222[6] = invoke3;
                                                    boolean[] zArr62222 = {false, true, true, true, true, true, true};
                                                    boolean[] zArr72222 = {false, false, false, false, true, true, true};
                                                    int i202222 = 4;
                                                    boolean[] zArr82222 = new boolean[7];
                                                    zArr82222[z ? 1 : 0] = z;
                                                    zArr82222[z3 ? 1 : 0] = z;
                                                    zArr82222[2] = z3;
                                                    zArr82222[i2] = z3;
                                                    zArr82222[4] = z;
                                                    zArr82222[5] = z3;
                                                    zArr82222[6] = z3;
                                                    int i212222 = 6;
                                                    Class<?> cls252222 = Class.forName(b((byte) (-bArr82222[10]), bArr82222[82], (short) 973));
                                                    byte b82222 = bArr82222[415];
                                                    r0 = cls252222.getDeclaredField(b(bArr82222[330], b82222, (short) ((b82222 & 914) | (b82222 ^ 914)))).getInt(cls252222);
                                                    if (r0 < 34) {
                                                    }
                                                    if (r0 == 29) {
                                                    }
                                                    if (r0 < 26) {
                                                    }
                                                    zArr82222[z ? 1 : 0] = z10;
                                                    if (r0 >= 26) {
                                                    }
                                                    e = z11;
                                                    if (r0 < 21) {
                                                    }
                                                    zArr82222[z3 ? 1 : 0] = z12;
                                                    if (r0 < 21) {
                                                    }
                                                    zArr82222[4] = z13;
                                                    boolean z142222 = z4;
                                                    Class<byte[]> cls262222 = r0;
                                                    i4 = z ? 1 : 0;
                                                    int i222222 = i4;
                                                    Class<byte[]> cls272222 = byte[].class;
                                                    ?? r32222 = Class.class;
                                                    boolean[] zArr92222 = zArr62222;
                                                    boolean z152222 = z;
                                                    int i232222 = z3;
                                                    loop0: while (i4 == 0) {
                                                    }
                                                }
                                                i3 = -1;
                                                invoke3 = null;
                                                if (invoke == null) {
                                                }
                                                c6 = 810;
                                                c7 = 148;
                                                if (invoke3 == null) {
                                                }
                                                if (invoke2 == null) {
                                                }
                                                byte[] bArr822222 = i;
                                                Object[] objArr322222 = (Object[]) Array.newInstance(Class.forName(b((byte) (-bArr822222[c7]), bArr822222[57], (short) 1031)), 7);
                                                objArr322222[z ? 1 : 0] = null;
                                                objArr322222[z3 ? 1 : 0] = invoke2;
                                                objArr322222[2] = invoke;
                                                objArr322222[i2] = invoke3;
                                                objArr322222[4] = invoke2;
                                                objArr322222[5] = invoke;
                                                objArr322222[6] = invoke3;
                                                boolean[] zArr622222 = {false, true, true, true, true, true, true};
                                                boolean[] zArr722222 = {false, false, false, false, true, true, true};
                                                int i2022222 = 4;
                                                boolean[] zArr822222 = new boolean[7];
                                                zArr822222[z ? 1 : 0] = z;
                                                zArr822222[z3 ? 1 : 0] = z;
                                                zArr822222[2] = z3;
                                                zArr822222[i2] = z3;
                                                zArr822222[4] = z;
                                                zArr822222[5] = z3;
                                                zArr822222[6] = z3;
                                                int i2122222 = 6;
                                                Class<?> cls2522222 = Class.forName(b((byte) (-bArr822222[10]), bArr822222[82], (short) 973));
                                                byte b822222 = bArr822222[415];
                                                r0 = cls2522222.getDeclaredField(b(bArr822222[330], b822222, (short) ((b822222 & 914) | (b822222 ^ 914)))).getInt(cls2522222);
                                                if (r0 < 34) {
                                                }
                                                if (r0 == 29) {
                                                }
                                                if (r0 < 26) {
                                                }
                                                zArr822222[z ? 1 : 0] = z10;
                                                if (r0 >= 26) {
                                                }
                                                e = z11;
                                                if (r0 < 21) {
                                                }
                                                zArr822222[z3 ? 1 : 0] = z12;
                                                if (r0 < 21) {
                                                }
                                                zArr822222[4] = z13;
                                                boolean z1422222 = z4;
                                                Class<byte[]> cls2622222 = r0;
                                                i4 = z ? 1 : 0;
                                                int i2222222 = i4;
                                                Class<byte[]> cls2722222 = byte[].class;
                                                ?? r322222 = Class.class;
                                                boolean[] zArr922222 = zArr622222;
                                                boolean z1522222 = z;
                                                int i2322222 = z3;
                                                loop0: while (i4 == 0) {
                                                }
                                            }
                                            try {
                                                invoke2 = cls2.getMethod(b(bArr2[11], bArr2[i2], (short) 1065), null).invoke(obj, null);
                                                z3 = true;
                                            } catch (Exception unused12) {
                                                invoke2 = null;
                                                z3 = z2;
                                                if (obj != null) {
                                                }
                                                i3 = -1;
                                                invoke3 = null;
                                                if (invoke == null) {
                                                }
                                                c6 = 810;
                                                c7 = 148;
                                                if (invoke3 == null) {
                                                }
                                                if (invoke2 == null) {
                                                }
                                                byte[] bArr8222222 = i;
                                                Object[] objArr3222222 = (Object[]) Array.newInstance(Class.forName(b((byte) (-bArr8222222[c7]), bArr8222222[57], (short) 1031)), 7);
                                                objArr3222222[z ? 1 : 0] = null;
                                                objArr3222222[z3 ? 1 : 0] = invoke2;
                                                objArr3222222[2] = invoke;
                                                objArr3222222[i2] = invoke3;
                                                objArr3222222[4] = invoke2;
                                                objArr3222222[5] = invoke;
                                                objArr3222222[6] = invoke3;
                                                boolean[] zArr6222222 = {false, true, true, true, true, true, true};
                                                boolean[] zArr7222222 = {false, false, false, false, true, true, true};
                                                int i20222222 = 4;
                                                boolean[] zArr8222222 = new boolean[7];
                                                zArr8222222[z ? 1 : 0] = z;
                                                zArr8222222[z3 ? 1 : 0] = z;
                                                zArr8222222[2] = z3;
                                                zArr8222222[i2] = z3;
                                                zArr8222222[4] = z;
                                                zArr8222222[5] = z3;
                                                zArr8222222[6] = z3;
                                                int i21222222 = 6;
                                                Class<?> cls25222222 = Class.forName(b((byte) (-bArr8222222[10]), bArr8222222[82], (short) 973));
                                                byte b8222222 = bArr8222222[415];
                                                r0 = cls25222222.getDeclaredField(b(bArr8222222[330], b8222222, (short) ((b8222222 & 914) | (b8222222 ^ 914)))).getInt(cls25222222);
                                                if (r0 < 34) {
                                                }
                                                if (r0 == 29) {
                                                }
                                                if (r0 < 26) {
                                                }
                                                zArr8222222[z ? 1 : 0] = z10;
                                                if (r0 >= 26) {
                                                }
                                                e = z11;
                                                if (r0 < 21) {
                                                }
                                                zArr8222222[z3 ? 1 : 0] = z12;
                                                if (r0 < 21) {
                                                }
                                                zArr8222222[4] = z13;
                                                boolean z14222222 = z4;
                                                Class<byte[]> cls26222222 = r0;
                                                i4 = z ? 1 : 0;
                                                int i22222222 = i4;
                                                Class<byte[]> cls27222222 = byte[].class;
                                                ?? r3222222 = Class.class;
                                                boolean[] zArr9222222 = zArr6222222;
                                                boolean z15222222 = z;
                                                int i23222222 = z3;
                                                loop0: while (i4 == 0) {
                                                }
                                            }
                                            if (obj != null) {
                                            }
                                            i3 = -1;
                                            invoke3 = null;
                                            if (invoke == null) {
                                            }
                                            c6 = 810;
                                            c7 = 148;
                                            if (invoke3 == null) {
                                            }
                                            if (invoke2 == null) {
                                            }
                                            byte[] bArr82222222 = i;
                                            Object[] objArr32222222 = (Object[]) Array.newInstance(Class.forName(b((byte) (-bArr82222222[c7]), bArr82222222[57], (short) 1031)), 7);
                                            objArr32222222[z ? 1 : 0] = null;
                                            objArr32222222[z3 ? 1 : 0] = invoke2;
                                            objArr32222222[2] = invoke;
                                            objArr32222222[i2] = invoke3;
                                            objArr32222222[4] = invoke2;
                                            objArr32222222[5] = invoke;
                                            objArr32222222[6] = invoke3;
                                            boolean[] zArr62222222 = {false, true, true, true, true, true, true};
                                            boolean[] zArr72222222 = {false, false, false, false, true, true, true};
                                            int i202222222 = 4;
                                            boolean[] zArr82222222 = new boolean[7];
                                            zArr82222222[z ? 1 : 0] = z;
                                            zArr82222222[z3 ? 1 : 0] = z;
                                            zArr82222222[2] = z3;
                                            zArr82222222[i2] = z3;
                                            zArr82222222[4] = z;
                                            zArr82222222[5] = z3;
                                            zArr82222222[6] = z3;
                                            int i212222222 = 6;
                                            Class<?> cls252222222 = Class.forName(b((byte) (-bArr82222222[10]), bArr82222222[82], (short) 973));
                                            byte b82222222 = bArr82222222[415];
                                            r0 = cls252222222.getDeclaredField(b(bArr82222222[330], b82222222, (short) ((b82222222 & 914) | (b82222222 ^ 914)))).getInt(cls252222222);
                                            if (r0 < 34) {
                                            }
                                            if (r0 == 29) {
                                            }
                                            if (r0 < 26) {
                                            }
                                            zArr82222222[z ? 1 : 0] = z10;
                                            if (r0 >= 26) {
                                            }
                                            e = z11;
                                            if (r0 < 21) {
                                            }
                                            zArr82222222[z3 ? 1 : 0] = z12;
                                            if (r0 < 21) {
                                            }
                                            zArr82222222[4] = z13;
                                            boolean z142222222 = z4;
                                            Class<byte[]> cls262222222 = r0;
                                            i4 = z ? 1 : 0;
                                            int i222222222 = i4;
                                            Class<byte[]> cls272222222 = byte[].class;
                                            ?? r32222222 = Class.class;
                                            boolean[] zArr92222222 = zArr62222222;
                                            boolean z152222222 = z;
                                            int i232222222 = z3;
                                            loop0: while (i4 == 0) {
                                            }
                                        }
                                        z2 = true;
                                        c5 = 11;
                                        invoke2 = null;
                                        z3 = z2;
                                        if (obj != null) {
                                        }
                                        i3 = -1;
                                        invoke3 = null;
                                        if (invoke == null) {
                                        }
                                        c6 = 810;
                                        c7 = 148;
                                        if (invoke3 == null) {
                                        }
                                        if (invoke2 == null) {
                                        }
                                        byte[] bArr822222222 = i;
                                        Object[] objArr322222222 = (Object[]) Array.newInstance(Class.forName(b((byte) (-bArr822222222[c7]), bArr822222222[57], (short) 1031)), 7);
                                        objArr322222222[z ? 1 : 0] = null;
                                        objArr322222222[z3 ? 1 : 0] = invoke2;
                                        objArr322222222[2] = invoke;
                                        objArr322222222[i2] = invoke3;
                                        objArr322222222[4] = invoke2;
                                        objArr322222222[5] = invoke;
                                        objArr322222222[6] = invoke3;
                                        boolean[] zArr622222222 = {false, true, true, true, true, true, true};
                                        boolean[] zArr722222222 = {false, false, false, false, true, true, true};
                                        int i2022222222 = 4;
                                        boolean[] zArr822222222 = new boolean[7];
                                        zArr822222222[z ? 1 : 0] = z;
                                        zArr822222222[z3 ? 1 : 0] = z;
                                        zArr822222222[2] = z3;
                                        zArr822222222[i2] = z3;
                                        zArr822222222[4] = z;
                                        zArr822222222[5] = z3;
                                        zArr822222222[6] = z3;
                                        int i2122222222 = 6;
                                        Class<?> cls2522222222 = Class.forName(b((byte) (-bArr822222222[10]), bArr822222222[82], (short) 973));
                                        byte b822222222 = bArr822222222[415];
                                        r0 = cls2522222222.getDeclaredField(b(bArr822222222[330], b822222222, (short) ((b822222222 & 914) | (b822222222 ^ 914)))).getInt(cls2522222222);
                                        if (r0 < 34) {
                                        }
                                        if (r0 == 29) {
                                        }
                                        if (r0 < 26) {
                                        }
                                        zArr822222222[z ? 1 : 0] = z10;
                                        if (r0 >= 26) {
                                        }
                                        e = z11;
                                        if (r0 < 21) {
                                        }
                                        zArr822222222[z3 ? 1 : 0] = z12;
                                        if (r0 < 21) {
                                        }
                                        zArr822222222[4] = z13;
                                        boolean z1422222222 = z4;
                                        Class<byte[]> cls2622222222 = r0;
                                        i4 = z ? 1 : 0;
                                        int i2222222222 = i4;
                                        Class<byte[]> cls2722222222 = byte[].class;
                                        ?? r322222222 = Class.class;
                                        boolean[] zArr922222222 = zArr622222222;
                                        boolean z1522222222 = z;
                                        int i2322222222 = z3;
                                        loop0: while (i4 == 0) {
                                        }
                                    }
                                    try {
                                        byte b46 = bArr[293];
                                        invoke = cls.getMethod(b((byte) ((b46 ^ (-1)) + (b46 << 1)), b2, s), null).invoke(obj, null);
                                    } catch (Exception unused13) {
                                        invoke = null;
                                        if (obj != null) {
                                        }
                                        z2 = true;
                                        c5 = 11;
                                        invoke2 = null;
                                        z3 = z2;
                                        if (obj != null) {
                                        }
                                        i3 = -1;
                                        invoke3 = null;
                                        if (invoke == null) {
                                        }
                                        c6 = 810;
                                        c7 = 148;
                                        if (invoke3 == null) {
                                        }
                                        if (invoke2 == null) {
                                        }
                                        byte[] bArr8222222222 = i;
                                        Object[] objArr3222222222 = (Object[]) Array.newInstance(Class.forName(b((byte) (-bArr8222222222[c7]), bArr8222222222[57], (short) 1031)), 7);
                                        objArr3222222222[z ? 1 : 0] = null;
                                        objArr3222222222[z3 ? 1 : 0] = invoke2;
                                        objArr3222222222[2] = invoke;
                                        objArr3222222222[i2] = invoke3;
                                        objArr3222222222[4] = invoke2;
                                        objArr3222222222[5] = invoke;
                                        objArr3222222222[6] = invoke3;
                                        boolean[] zArr6222222222 = {false, true, true, true, true, true, true};
                                        boolean[] zArr7222222222 = {false, false, false, false, true, true, true};
                                        int i20222222222 = 4;
                                        boolean[] zArr8222222222 = new boolean[7];
                                        zArr8222222222[z ? 1 : 0] = z;
                                        zArr8222222222[z3 ? 1 : 0] = z;
                                        zArr8222222222[2] = z3;
                                        zArr8222222222[i2] = z3;
                                        zArr8222222222[4] = z;
                                        zArr8222222222[5] = z3;
                                        zArr8222222222[6] = z3;
                                        int i21222222222 = 6;
                                        Class<?> cls25222222222 = Class.forName(b((byte) (-bArr8222222222[10]), bArr8222222222[82], (short) 973));
                                        byte b8222222222 = bArr8222222222[415];
                                        r0 = cls25222222222.getDeclaredField(b(bArr8222222222[330], b8222222222, (short) ((b8222222222 & 914) | (b8222222222 ^ 914)))).getInt(cls25222222222);
                                        if (r0 < 34) {
                                        }
                                        if (r0 == 29) {
                                        }
                                        if (r0 < 26) {
                                        }
                                        zArr8222222222[z ? 1 : 0] = z10;
                                        if (r0 >= 26) {
                                        }
                                        e = z11;
                                        if (r0 < 21) {
                                        }
                                        zArr8222222222[z3 ? 1 : 0] = z12;
                                        if (r0 < 21) {
                                        }
                                        zArr8222222222[4] = z13;
                                        boolean z14222222222 = z4;
                                        Class<byte[]> cls26222222222 = r0;
                                        i4 = z ? 1 : 0;
                                        int i22222222222 = i4;
                                        Class<byte[]> cls27222222222 = byte[].class;
                                        ?? r3222222222 = Class.class;
                                        boolean[] zArr9222222222 = zArr6222222222;
                                        boolean z15222222222 = z;
                                        int i23222222222 = z3;
                                        loop0: while (i4 == 0) {
                                        }
                                    }
                                    if (obj != null) {
                                    }
                                    z2 = true;
                                    c5 = 11;
                                    invoke2 = null;
                                    z3 = z2;
                                    if (obj != null) {
                                    }
                                    i3 = -1;
                                    invoke3 = null;
                                    if (invoke == null) {
                                    }
                                    c6 = 810;
                                    c7 = 148;
                                    if (invoke3 == null) {
                                    }
                                    if (invoke2 == null) {
                                    }
                                    byte[] bArr82222222222 = i;
                                    Object[] objArr32222222222 = (Object[]) Array.newInstance(Class.forName(b((byte) (-bArr82222222222[c7]), bArr82222222222[57], (short) 1031)), 7);
                                    objArr32222222222[z ? 1 : 0] = null;
                                    objArr32222222222[z3 ? 1 : 0] = invoke2;
                                    objArr32222222222[2] = invoke;
                                    objArr32222222222[i2] = invoke3;
                                    objArr32222222222[4] = invoke2;
                                    objArr32222222222[5] = invoke;
                                    objArr32222222222[6] = invoke3;
                                    boolean[] zArr62222222222 = {false, true, true, true, true, true, true};
                                    boolean[] zArr72222222222 = {false, false, false, false, true, true, true};
                                    int i202222222222 = 4;
                                    boolean[] zArr82222222222 = new boolean[7];
                                    zArr82222222222[z ? 1 : 0] = z;
                                    zArr82222222222[z3 ? 1 : 0] = z;
                                    zArr82222222222[2] = z3;
                                    zArr82222222222[i2] = z3;
                                    zArr82222222222[4] = z;
                                    zArr82222222222[5] = z3;
                                    zArr82222222222[6] = z3;
                                    int i212222222222 = 6;
                                    Class<?> cls252222222222 = Class.forName(b((byte) (-bArr82222222222[10]), bArr82222222222[82], (short) 973));
                                    byte b82222222222 = bArr82222222222[415];
                                    r0 = cls252222222222.getDeclaredField(b(bArr82222222222[330], b82222222222, (short) ((b82222222222 & 914) | (b82222222222 ^ 914)))).getInt(cls252222222222);
                                    if (r0 < 34) {
                                    }
                                    if (r0 == 29) {
                                    }
                                    if (r0 < 26) {
                                    }
                                    zArr82222222222[z ? 1 : 0] = z10;
                                    if (r0 >= 26) {
                                    }
                                    e = z11;
                                    if (r0 < 21) {
                                    }
                                    zArr82222222222[z3 ? 1 : 0] = z12;
                                    if (r0 < 21) {
                                    }
                                    zArr82222222222[4] = z13;
                                    boolean z142222222222 = z4;
                                    Class<byte[]> cls262222222222 = r0;
                                    i4 = z ? 1 : 0;
                                    int i222222222222 = i4;
                                    Class<byte[]> cls272222222222 = byte[].class;
                                    ?? r32222222222 = Class.class;
                                    boolean[] zArr92222222222 = zArr62222222222;
                                    boolean z152222222222 = z;
                                    int i232222222222 = z3;
                                    loop0: while (i4 == 0) {
                                    }
                                }
                                c4 = 293;
                                invoke = null;
                                if (obj != null) {
                                }
                                z2 = true;
                                c5 = 11;
                                invoke2 = null;
                                z3 = z2;
                                if (obj != null) {
                                }
                                i3 = -1;
                                invoke3 = null;
                                if (invoke == null) {
                                }
                                c6 = 810;
                                c7 = 148;
                                if (invoke3 == null) {
                                }
                                if (invoke2 == null) {
                                }
                                byte[] bArr822222222222 = i;
                                Object[] objArr322222222222 = (Object[]) Array.newInstance(Class.forName(b((byte) (-bArr822222222222[c7]), bArr822222222222[57], (short) 1031)), 7);
                                objArr322222222222[z ? 1 : 0] = null;
                                objArr322222222222[z3 ? 1 : 0] = invoke2;
                                objArr322222222222[2] = invoke;
                                objArr322222222222[i2] = invoke3;
                                objArr322222222222[4] = invoke2;
                                objArr322222222222[5] = invoke;
                                objArr322222222222[6] = invoke3;
                                boolean[] zArr622222222222 = {false, true, true, true, true, true, true};
                                boolean[] zArr722222222222 = {false, false, false, false, true, true, true};
                                int i2022222222222 = 4;
                                boolean[] zArr822222222222 = new boolean[7];
                                zArr822222222222[z ? 1 : 0] = z;
                                zArr822222222222[z3 ? 1 : 0] = z;
                                zArr822222222222[2] = z3;
                                zArr822222222222[i2] = z3;
                                zArr822222222222[4] = z;
                                zArr822222222222[5] = z3;
                                zArr822222222222[6] = z3;
                                int i2122222222222 = 6;
                                Class<?> cls2522222222222 = Class.forName(b((byte) (-bArr822222222222[10]), bArr822222222222[82], (short) 973));
                                byte b822222222222 = bArr822222222222[415];
                                r0 = cls2522222222222.getDeclaredField(b(bArr822222222222[330], b822222222222, (short) ((b822222222222 & 914) | (b822222222222 ^ 914)))).getInt(cls2522222222222);
                                if (r0 < 34) {
                                }
                                if (r0 == 29) {
                                }
                                if (r0 < 26) {
                                }
                                zArr822222222222[z ? 1 : 0] = z10;
                                if (r0 >= 26) {
                                }
                                e = z11;
                                if (r0 < 21) {
                                }
                                zArr822222222222[z3 ? 1 : 0] = z12;
                                if (r0 < 21) {
                                }
                                zArr822222222222[4] = z13;
                                boolean z1422222222222 = z4;
                                Class<byte[]> cls2622222222222 = r0;
                                i4 = z ? 1 : 0;
                                int i2222222222222 = i4;
                                Class<byte[]> cls2722222222222 = byte[].class;
                                ?? r322222222222 = Class.class;
                                boolean[] zArr922222222222 = zArr622222222222;
                                boolean z1522222222222 = z;
                                int i2322222222222 = z3;
                                loop0: while (i4 == 0) {
                                }
                            }
                        } catch (Exception unused14) {
                            z = false;
                        }
                    } catch (Exception unused15) {
                        z = false;
                        c3 = 1193;
                    }
                } catch (Exception e9) {
                    qp7.n(e9);
                }
            }
        } catch (Throwable th103) {
            Throwable cause43 = th103.getCause();
            if (cause43 != null) {
                throw cause43;
            }
            throw th103;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
    
        r1 = r1 + 93;
        com.fingerprintjs.android.fpjs_pro_internal.rV4669.p = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        r1 = 90 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        r1 = r0;
        r0 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        r9 = (-r7) + r0;
        r7 = r7 + 1;
        r8 = r8;
        r0 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(byte b2, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        byte[] bArr;
        int i7 = p + 51;
        int i8 = i7 % 128;
        o = i8;
        int i9 = i7 % 2;
        byte[] bArr2 = h;
        int i10 = -1;
        if (i9 != 0) {
            i5 = (i3 * 2) + 115;
            i6 = 3 >> (5 - b2);
            bArr = new byte[95 - i2];
            i4 = 164 - i2;
        } else {
            i4 = i2 * 3;
            i5 = (i3 * 4) + 101;
            i6 = 4 - (b2 * 4);
            bArr = new byte[i4 + 1];
        }
        while (true) {
            i10++;
            bArr[i10] = (byte) i5;
            if (i10 == i4) {
                return new String(bArr, 0);
            }
            int i11 = i4;
            int i12 = i6;
            byte[] bArr3 = bArr;
            i5 = (-bArr2[i6]) + i5;
            i6 = i12 + 1;
            i4 = i11;
            bArr = bArr3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x002d -> B:4:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(int i2, short s, short s2) {
        int i3;
        int i4;
        int i5 = 75 - i2;
        int i6 = 1296 - s2;
        int i7 = 119 - s;
        byte[] bArr = new byte[i5];
        byte[] bArr2 = i;
        if (bArr2 == null) {
            i4 = 0;
            byte[] bArr3 = bArr2;
            int i8 = i6;
            i7 = (i7 + i6) - 3;
            i6 = i8 + 1;
            p = (o + 125) % 128;
            bArr2 = bArr3;
            i3 = i4;
            i4 = i3 + 1;
            bArr[i3] = (byte) i7;
            if (i4 == i5) {
                String str = new String(bArr, 0);
                int i9 = p + 15;
                o = i9 % 128;
                if (i9 % 2 == 0) {
                    return str;
                }
                throw null;
            }
            byte b2 = bArr2[i6];
            byte[] bArr4 = bArr2;
            i8 = i6;
            i6 = b2;
            bArr3 = bArr4;
            i7 = (i7 + i6) - 3;
            i6 = i8 + 1;
            p = (o + 125) % 128;
            bArr2 = bArr3;
            i3 = i4;
            i4 = i3 + 1;
            bArr[i3] = (byte) i7;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr[i3] = (byte) i7;
            if (i4 == i5) {
            }
        }
    }

    public static void c() {
        int i2 = l + 53;
        k = i2 % 128;
        if (i2 % 2 != 0) {
            h = new byte[]{50, 0, -102, 44};
        } else {
            h = new byte[]{50, 0, -102, 44};
        }
    }

    public static int component5(int i2) {
        Object obj = a;
        int i3 = l + 61;
        int i4 = i3 % 128;
        k = i4;
        if (i3 % 2 != 0) {
            int i5 = 91 / 0;
        }
        l = (((i4 | 87) << 1) - (i4 ^ 87)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i2)};
            byte[] bArr = i;
            int intValue = ((Integer) Class.forName(b(bArr[7], bArr[61], (short) 627), true, (ClassLoader) b).getMethod(b(bArr[293], bArr[61], bArr[7]), Integer.TYPE).invoke(obj, objArr)).intValue();
            l = (k + 59) % 128;
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int component9(Object obj) {
        Object obj2 = a;
        int i2 = l + 35;
        k = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 3 / 0;
        }
        try {
            int intValue = ((Integer) Class.forName(b(r1[7], r1[61], (short) 627), true, (ClassLoader) b).getMethod(b(r1[1193], (byte) (-i[10]), r1[16]), Object.class).invoke(obj2, obj)).intValue();
            int i4 = k;
            l = ((i4 & 85) + (i4 | 85)) % 128;
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void d() {
        int i2;
        int i3 = l + 111;
        k = i3 % 128;
        if (i3 % 2 != 0) {
            byte[] bArr = new byte[1305];
            System.arraycopy("yS±\u0010\u0010ù\u0011\u0000ýþÍ<\u000eò\u0012û\u0004ý\u0013¾%\"ý\b\tÕü\fü\u0010÷\u000f\u0001Å:\u0006\bü\u0001\u0010\u0001\u0005ú\b\tù\f¿5\u0010ù\u0011\u0000ýþÎ:\rý\fï\u0014\u0005\u0000ó\r\b\tô\u0010ÿö\u000eÆ;\u0001\u0012Ò/\u0002\tô\u0016ÿÜ\u001b\f\n×(û\fÕô\u0002\u0003\u0003\t\u0011õþ\tþ#\u0003\u000f\u0001Ä;\u0006\bü\u0001\u0010\u0001\u0005ú\b\tù\f¾6\u0010ù\u0011\u0000ýþÍ;\rý\fï\u0014\u0005\u0000\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0001\u0012Õ&\u0006ü\u0011Ô(\f\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\u0001\u0012Ò!\u0005\b\u0000â(\f8\u0000\u0016ðÑ8\u0000\u0016ðÑú\u0018îÐ>\tÂ\u001b&\u0006üú\u0018îÐ>\tÂIü\u0006÷\b\fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ô\n\u0017í\b\t\u0001\u0010ì\u001eú\u000eôî\tí\u000bú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\f\u0006\u0007õî\u0006ð\u000b5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å:\u0006\bü\u0001\u0010\u0001\u0005ú\b\tù\f¿5\u0010ù\u0011\u0000ýþÎ:\rý\fï\u0014\u0005\u0000ó\r\b\tô\u0010ÿö\u000eÆ\u000b\u0001\u0004\u0005\u0002.Ô5Ó/\u0003\u0005Ó\u0007\u0001/Ï\u0001\u0012á\u0016\u0011ÿ\t\u0000ô\u0005ú\u0018îÐCú\u0012½*\u0000ý\u0001\u0012ß\u0014\u0016÷ú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000föÿ\u0006å2ú\u0003\u0010ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u000f\u0001Ä;\u0006\bü\u0001\u0010\u0001\u0005ú\b\tù\f¾6\u0010ù\u0011\u0000ýþÍ;\rý\fï\u0014\u0005\u0000ó\r\b\tô\u0010ÿö\u000eÅ8\u0007\u000f\u0001Ä;\u0006\bü\u0001\u0010\u0001\u0005ú\b\tù\f¾6\u0010ù\u0011\u0000ýþÍ;\rý\fï\u0014\u0005\u0000ó\r\b\tô\u0010ÿö\u000eÅ<\u0001\u0012Ò/\u0002\tô\u0016ÿÜ\u001b\f\n×(û\fÕô\u0002\u0003\u0003\t\u0011õþ\tþ#\u0003\u000f\u0001\u0006\u0002\u0002ú\f\tÈû\u0001\nöÿ\u0006õ\u0012á\u0016ÿ\u0006î\"\u0001\u0010î\u0007ï\u000bþú\u000eô\u0001\u0012Õ\u0001ú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006\tøø\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u0006õ\u0006ã$\u0016\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0004\nü\u0012ô\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nÜ(\u0005\b\u0002â$\u0001öÿ\u000f\u0001\u0012Ý\u001a\u0016ÿÔ,\t\u0001\nú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nØ,\t\u0001\n\u0001\u0012â\u0019\u0014îú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010\u000e\u0003\u0006÷\u0001\u0016ôâ(\fö\u0001\u0014\b\u0002ú\u0018îÐ>\tÂ\u0018,\u0006\u0007õÿ\u0004\rü\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0002\u0007ù\u000eø\t\u0002\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ô\u0016÷ç \r\u0004ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\u0001\u0012Ò/\u0001\u0006\u0002\u0002ú\f\tã(úøî\u000bë\u000b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Å:\u0006\bü\u0001\u0010\u0001\u0005ú\b\tù\f¿5\u0010ù\u0011\u0000ýþÎ:\rý\fï\u0014\u0005\u0000ó\r\b\tô\u0010ÿö\u000eÆFçá\u0005\u0003\u0006îD5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å:\u0006\bü\u0001\u0010\u0001\u0005ú\b\tù\f¿5\u0010ù\u0011\u0000ýþÎ:\rý\fï\u0014\u0005\u0000ó\r\b\tô\u0010ÿö\u000eÆ\u0007\u00009\u0000×ü\u00044Ö4Î\b\u0005ÿ2\u0006ÿÎî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸÷\u0003\u0002ý\u000f\u0001\u0006\u0002\u0002ú\f\tÄ".getBytes("ISO-8859-1"), 0, bArr, 0, 1305);
            i = bArr;
            i2 = 35;
        } else {
            byte[] bArr2 = new byte[1305];
            System.arraycopy("yS±\u0010\u0010ù\u0011\u0000ýþÍ<\u000eò\u0012û\u0004ý\u0013¾%\"ý\b\tÕü\fü\u0010÷\u000f\u0001Å:\u0006\bü\u0001\u0010\u0001\u0005ú\b\tù\f¿5\u0010ù\u0011\u0000ýþÎ:\rý\fï\u0014\u0005\u0000ó\r\b\tô\u0010ÿö\u000eÆ;\u0001\u0012Ò/\u0002\tô\u0016ÿÜ\u001b\f\n×(û\fÕô\u0002\u0003\u0003\t\u0011õþ\tþ#\u0003\u000f\u0001Ä;\u0006\bü\u0001\u0010\u0001\u0005ú\b\tù\f¾6\u0010ù\u0011\u0000ýþÍ;\rý\fï\u0014\u0005\u0000\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0001\u0012Õ&\u0006ü\u0011Ô(\f\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\u0001\u0012Ò!\u0005\b\u0000â(\f8\u0000\u0016ðÑ8\u0000\u0016ðÑú\u0018îÐ>\tÂ\u001b&\u0006üú\u0018îÐ>\tÂIü\u0006÷\b\fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ô\n\u0017í\b\t\u0001\u0010ì\u001eú\u000eôî\tí\u000bú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\f\u0006\u0007õî\u0006ð\u000b5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å:\u0006\bü\u0001\u0010\u0001\u0005ú\b\tù\f¿5\u0010ù\u0011\u0000ýþÎ:\rý\fï\u0014\u0005\u0000ó\r\b\tô\u0010ÿö\u000eÆ\u000b\u0001\u0004\u0005\u0002.Ô5Ó/\u0003\u0005Ó\u0007\u0001/Ï\u0001\u0012á\u0016\u0011ÿ\t\u0000ô\u0005ú\u0018îÐCú\u0012½*\u0000ý\u0001\u0012ß\u0014\u0016÷ú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000föÿ\u0006å2ú\u0003\u0010ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u000f\u0001Ä;\u0006\bü\u0001\u0010\u0001\u0005ú\b\tù\f¾6\u0010ù\u0011\u0000ýþÍ;\rý\fï\u0014\u0005\u0000ó\r\b\tô\u0010ÿö\u000eÅ8\u0007\u000f\u0001Ä;\u0006\bü\u0001\u0010\u0001\u0005ú\b\tù\f¾6\u0010ù\u0011\u0000ýþÍ;\rý\fï\u0014\u0005\u0000ó\r\b\tô\u0010ÿö\u000eÅ<\u0001\u0012Ò/\u0002\tô\u0016ÿÜ\u001b\f\n×(û\fÕô\u0002\u0003\u0003\t\u0011õþ\tþ#\u0003\u000f\u0001\u0006\u0002\u0002ú\f\tÈû\u0001\nöÿ\u0006õ\u0012á\u0016ÿ\u0006î\"\u0001\u0010î\u0007ï\u000bþú\u000eô\u0001\u0012Õ\u0001ú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006\tøø\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u0006õ\u0006ã$\u0016\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0004\nü\u0012ô\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nÜ(\u0005\b\u0002â$\u0001öÿ\u000f\u0001\u0012Ý\u001a\u0016ÿÔ,\t\u0001\nú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nØ,\t\u0001\n\u0001\u0012â\u0019\u0014îú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010\u000e\u0003\u0006÷\u0001\u0016ôâ(\fö\u0001\u0014\b\u0002ú\u0018îÐ>\tÂ\u0018,\u0006\u0007õÿ\u0004\rü\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0002\u0007ù\u000eø\t\u0002\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ô\u0016÷ç \r\u0004ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\u0001\u0012Ò/\u0001\u0006\u0002\u0002ú\f\tã(úøî\u000bë\u000b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Å:\u0006\bü\u0001\u0010\u0001\u0005ú\b\tù\f¿5\u0010ù\u0011\u0000ýþÎ:\rý\fï\u0014\u0005\u0000ó\r\b\tô\u0010ÿö\u000eÆFçá\u0005\u0003\u0006îD5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å:\u0006\bü\u0001\u0010\u0001\u0005ú\b\tù\f¿5\u0010ù\u0011\u0000ýþÎ:\rý\fï\u0014\u0005\u0000ó\r\b\tô\u0010ÿö\u000eÆ\u0007\u00009\u0000×ü\u00044Ö4Î\b\u0005ÿ2\u0006ÿÎî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸÷\u0003\u0002ý\u000f\u0001\u0006\u0002\u0002ú\f\tÄ".getBytes("ISO-8859-1"), 0, bArr2, 0, 1305);
            i = bArr2;
            i2 = 10;
        }
        j = i2;
        int i4 = l;
        int i5 = (i4 & 11) + (i4 | 11);
        k = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
    }

    public static Object e(char c2, int i2, int i3) {
        int i4 = l;
        Object obj = a;
        k = ((i4 & 39) + (i4 | 39)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i2), Character.valueOf(c2), Integer.valueOf(i3)};
            byte[] bArr = i;
            Class<?> cls = Class.forName(b(bArr[7], bArr[61], (short) 627), true, (ClassLoader) b);
            String b2 = b(bArr[1193], (byte) (-bArr[10]), bArr[16]);
            Class cls2 = Integer.TYPE;
            Object invoke = cls.getMethod(b2, cls2, Character.TYPE, cls2).invoke(obj, objArr);
            k = (l + 101) % 128;
            return invoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object f(int i2) {
        l = (k + 123) % 128;
        int i3 = d;
        Object obj = c.get(Integer.valueOf(((~i2) & i3) | ((~i3) & i2)));
        int i4 = k;
        l = ((i4 & 13) + (i4 | 13)) % 128;
        return obj;
    }

    public static Object g(int i2, char c2, int i3, int i4, String str, Class[] clsArr) {
        Object method;
        l = (k + 45) % 128;
        Integer valueOf = Integer.valueOf(i4);
        HashMap hashMap = c;
        Object obj = hashMap.get(valueOf);
        if (obj != null) {
            return obj;
        }
        Integer valueOf2 = Integer.valueOf(i4);
        Object obj2 = a;
        try {
            Object[] objArr = {Integer.valueOf(i2), Character.valueOf(c2), Integer.valueOf(i3)};
            byte[] bArr = i;
            Class<?> cls = Class.forName(b(bArr[7], bArr[61], (short) 627), true, (ClassLoader) b);
            String b2 = b(bArr[1193], (byte) (-bArr[10]), bArr[16]);
            Class cls2 = Integer.TYPE;
            Class cls3 = (Class) cls.getMethod(b2, cls2, Character.TYPE, cls2).invoke(obj2, objArr);
            if (str == null) {
                method = cls3.getConstructor(clsArr);
            } else if (clsArr == null) {
                l = (k + 33) % 128;
                method = cls3.getField(str);
                int i5 = (l + 21) % 128;
                k = i5;
                l = (i5 + 5) % 128;
            } else {
                method = cls3.getMethod(str, clsArr);
                int i6 = l;
                k = ((i6 ^ 107) + ((i6 & 107) << 1)) % 128;
            }
            hashMap.put(valueOf2, method);
            return method;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
