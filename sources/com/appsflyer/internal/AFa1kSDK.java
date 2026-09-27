package com.appsflyer.internal;

import java.util.Map;

/* loaded from: classes.dex */
public class AFa1kSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    public static final Map AFInAppEventType;
    private static int afDebugLog;
    private static long afErrorLog;
    private static int afInfoLog;
    private static int afLogForce;
    private static byte[] d;
    private static Object e;
    private static long force;
    public static final Map i;
    private static byte[] unregisterClient;
    private static long v;
    private static Object w;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0035 -> B:4:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i2, byte b, byte b2) {
        int i3;
        int i4;
        byte[] bArr = $$a;
        int i5 = b2 + 1;
        int i6 = 119 - b;
        int i7 = i2 + 4;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            $12 = ($13 + 65) % 128;
            int i8 = i6;
            i4 = 0;
            int i9 = i7;
            int i10 = i9 + 1;
            i6 = (i7 + (-i8)) - 1;
            i7 = i10;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
                String str = new String(bArr2, 0);
                int i11 = $12 + 71;
                $13 = i11 % 128;
                if (i11 % 2 != 0) {
                    return str;
                }
                throw null;
            }
            i8 = bArr[i7];
            int i12 = i6;
            i9 = i7;
            i7 = i12;
            int i102 = i9 + 1;
            i6 = (i7 + (-i8)) - 1;
            i7 = i102;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r9v42 ?? I:int), method size: 6646
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    static {
        /*
            Method dump skipped, instructions count: 6646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1kSDK.<clinit>():void");
    }

    private AFa1kSDK() {
    }

    public static Object getMediationNetwork(char c, int i2, int i3) {
        int i4 = $10 + 33;
        int i5 = i4 % 128;
        $11 = i5;
        if (i4 % 2 != 0) {
            Object obj = w;
            $10 = ((i5 & 109) + (i5 | 109)) % 128;
            try {
                Object[] objArr = {Character.valueOf(c), Integer.valueOf(i2), Integer.valueOf(i3)};
                byte[] bArr = $$a;
                Class<?> cls = Class.forName($$c(563, bArr[200], bArr[175]), true, (ClassLoader) e);
                String $$c = $$c(595, (byte) (-bArr[188]), bArr[43]);
                Class cls2 = Character.TYPE;
                Class cls3 = Integer.TYPE;
                return cls.getMethod($$c, cls2, cls3, cls3).invoke(obj, objArr);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        throw null;
    }

    private static void getMonetizationNetwork(int i2, int i3) {
        int i4 = $10 + 67;
        $11 = i4 % 128;
        if (i4 % 2 != 0) {
        } else {
            throw null;
        }
    }

    public static int getRevenue(int i2) {
        int i3 = $10;
        int i4 = (i3 ^ 91) + ((i3 & 91) << 1);
        $11 = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = w;
            int i5 = ((i3 & 95) + (i3 | 95)) % 128;
            $11 = i5;
            $10 = (((i5 | 25) << 1) - (i5 ^ 25)) % 128;
            try {
                int intValue = ((Integer) Class.forName($$c(563, r0[200], r0[175]), true, (ClassLoader) e).getMethod($$c(595, (byte) (-$$a[188]), r0[43]), Integer.TYPE).invoke(obj, Integer.valueOf(i2))).intValue();
                int i6 = $11 + 115;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 11 / 0;
                }
                return intValue;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        throw null;
    }

    public static void init$0() {
        int i2;
        int i3 = $10 + 97;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            byte[] bArr = new byte[1153];
            System.arraycopy("j¢®Pò\tñ\u0002\u0005\u00045Æô\u0010ð\u0007þ\u0005ïDêÓ\u0002üü\n\u0004ó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<íúã0·%\u000eø÷ÿó\u0001>Ìðÿü\fùò\u0013òò\tñ\u0002\u0005\u00045ÌðÿAìÝî\nò\fôú$ëõ\f\u0003üí\u0002ÿ\föù2Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000ò\tñ\u0002\u0005\u00045ÌðÿAìÐÿ(Úü\f\u0000ôø\u0001ð*Ú\u0004ô\n\u0007ô*Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000\u0001ð-Üü\u0006ñ.Úö\u0001ð0Ó\nþ!áýú\u0002 Úö\u0001ð0áýú\u0002 ÚöÊ\u0002ì\u00121Ê\u0002ì\u00121\bê\u00142Äù@çÜü\u0006\bê\u00142Äù@¹\u0006ü\u000búö\bê\u00142Á\nò\u00068ÚÙ\u0005þ\u000e÷\u0001ð#Ý\u0002þ\nòýúó\nþ\u0005û\u0001ýú\u0002ò\tñ\u0002\u0005\u00045¾ûDëÌ\u000bü\u0007?Í\u0010òþ\tù\u0000\u000eøë\u0015úù\u0001ò\u0016ä\bô\u000e\u0014ù\u0015÷\bê\u00142Äù@äù\tÌ\u0014ýôû\nù\u0000í\u0002ÿ\föù\u001fêû\u0007\u0017ãüÿ\u0002õ\bê\u00142Äù@çÜü\u0006\u0015Ù\u0000\u0003ú\u0000 Þ\u0001\f\u0003óöüû\r\u0014ü\u0012÷Ííÿ\rð\u0000CËó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<ú\u0002Ë1úÿÓý5Í/Ë-ÿþ\u0000Ö3\u0001ð!ìñ\u0003ù\u0002\u000eý\bê\u00142¿\bðEØ\u0002\u0005\u0001ð#îì\u000b\bê\u00142Äù@ëÌ\u000eÿ\u0000ò\f\u0000\u001aÚýú\u0000 Þ\u0001\f\u0003ó\bê\u00142Äù@äÚýú\u0000 Þ\u0001\f\u0003ó\bê\u00142Äù@éâì\u0012\u0017Úýú\u0000 Þ\u0001\f\u0003ó\f\u0003ü\u001dÐ\bÿò\bê\u00142Äù@ëÈ\u0004\u000e#Îÿ\u0010ç/Úýú\u0000 Þ\u0001\f\u0003óó\u0001>Ìðÿü\fùò\u0013òCÄúù\u000eò\u0003\fô=ìúÚ9¼ \u000eøó\u0001>Ìðÿü\fùò\u0013òCÄúù\u000eò\u0003\fô=ìúã0·%\u000eø÷ÿú\u0004Ü\u0011ìî\u0010öø\u000f âì\u0012\u0007\u0001ø\f\u0003ü\rð!ì\u0003ü\u0014à\u0001ò\u0014û\u0013÷\u0004\bô\u000e\u0001ð-\u0001\bê\u00142Äù@çÜü\u0006 Þñ\u000fð\bøû\u0004üù\n\n\u0002ôõ\fý<ºù\u0005þ\u000e÷>éÞì1Üü\u0006ü\rü\u001fÞì\u0001ð2Þî\u0003\u0002ö\u0000\u000e\u0014îì\u000bþø\u0006ð\u000e\u0001ð0Ö\níÿ&Ü\rüþò\bê\u00142¸\u0000\nü=³\u0010øAÓðø&Úýú\u0000 Þ\u0001\f\u0003ó\u0001ð%èì\u0003.Öù\u0001ø\bê\u00142¸\u0000\nü=³\u0010øAÓðø*Öù\u0001ø\u0001ð éî\u0014\bê\u00142Äù@ëÈ\u0004\u000e#Îÿ\u0010ç)Ù\u0000\u0003ú\u0000 Þ\u0001\f\u0003ó\u0004,È\u0004\u000e#Îÿ\u0010ç\bê\u00142Äù@êÖüû\r\u0003þõ\u0006\u0002ôõ\fý<ºù\u0005þ\u000e÷>äÚ ç÷ýüø4Þì4Ö\níÿ&Ü\rüþò\bê\u00142¿\u0004ù@ëÈ\u0004\u000e\"Ì\u000eÿ\u0000ò\bê\u00142Á\nò\u00068êÖ\níÿ&Ü\rüþò\u0004\u0010ð\u0002ôõ\fý<ºù\u0005þ\u000e÷>ëàí\r Þì4Ö\níÿ&Ü\rüþò\u000eì\u000b\u001bâõþ\fì\nò\u0010\u0018â\u0006ï\u0010îø4Úö\f\u0001î\u0004ü\b\u0003ñ\fì\nò\u0010\u0018â\u0006ï\u0010îø(îì\u000b\"Ø\u0006÷\u0007öù\u0000\u0001ð0Ó\u0001ü\u0000\u0000\böù\u001fÚ\b\n\u0014÷\u0017÷ü\rü Ö\níÿó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<íúä/Å\u0017\u000eø&¯Ííÿ\rð\u0000CËó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<úÍ\u0002+\u0005þù\u0003ÿÑ,Ð3ø\u0006öÖ4\u0014ø\u0016÷¹þN¹\u0004ôÿ\t\u0000ý÷÷R³\u0006þñJ\u0001ð0Í\u0002ÿ\fö\né/Õ\u0003:\u0001\u0000ùóÓ\nþ".getBytes("ISO-8859-1"), 0, bArr, 0, 1153);
            $$a = bArr;
            i2 = 24963;
        } else {
            byte[] bArr2 = new byte[1153];
            System.arraycopy("j¢®Pò\tñ\u0002\u0005\u00045Æô\u0010ð\u0007þ\u0005ïDêÓ\u0002üü\n\u0004ó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<íúã0·%\u000eø÷ÿó\u0001>Ìðÿü\fùò\u0013òò\tñ\u0002\u0005\u00045ÌðÿAìÝî\nò\fôú$ëõ\f\u0003üí\u0002ÿ\föù2Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000ò\tñ\u0002\u0005\u00045ÌðÿAìÐÿ(Úü\f\u0000ôø\u0001ð*Ú\u0004ô\n\u0007ô*Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000\u0001ð-Üü\u0006ñ.Úö\u0001ð0Ó\nþ!áýú\u0002 Úö\u0001ð0áýú\u0002 ÚöÊ\u0002ì\u00121Ê\u0002ì\u00121\bê\u00142Äù@çÜü\u0006\bê\u00142Äù@¹\u0006ü\u000búö\bê\u00142Á\nò\u00068ÚÙ\u0005þ\u000e÷\u0001ð#Ý\u0002þ\nòýúó\nþ\u0005û\u0001ýú\u0002ò\tñ\u0002\u0005\u00045¾ûDëÌ\u000bü\u0007?Í\u0010òþ\tù\u0000\u000eøë\u0015úù\u0001ò\u0016ä\bô\u000e\u0014ù\u0015÷\bê\u00142Äù@äù\tÌ\u0014ýôû\nù\u0000í\u0002ÿ\föù\u001fêû\u0007\u0017ãüÿ\u0002õ\bê\u00142Äù@çÜü\u0006\u0015Ù\u0000\u0003ú\u0000 Þ\u0001\f\u0003óöüû\r\u0014ü\u0012÷Ííÿ\rð\u0000CËó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<ú\u0002Ë1úÿÓý5Í/Ë-ÿþ\u0000Ö3\u0001ð!ìñ\u0003ù\u0002\u000eý\bê\u00142¿\bðEØ\u0002\u0005\u0001ð#îì\u000b\bê\u00142Äù@ëÌ\u000eÿ\u0000ò\f\u0000\u001aÚýú\u0000 Þ\u0001\f\u0003ó\bê\u00142Äù@äÚýú\u0000 Þ\u0001\f\u0003ó\bê\u00142Äù@éâì\u0012\u0017Úýú\u0000 Þ\u0001\f\u0003ó\f\u0003ü\u001dÐ\bÿò\bê\u00142Äù@ëÈ\u0004\u000e#Îÿ\u0010ç/Úýú\u0000 Þ\u0001\f\u0003óó\u0001>Ìðÿü\fùò\u0013òCÄúù\u000eò\u0003\fô=ìúÚ9¼ \u000eøó\u0001>Ìðÿü\fùò\u0013òCÄúù\u000eò\u0003\fô=ìúã0·%\u000eø÷ÿú\u0004Ü\u0011ìî\u0010öø\u000f âì\u0012\u0007\u0001ø\f\u0003ü\rð!ì\u0003ü\u0014à\u0001ò\u0014û\u0013÷\u0004\bô\u000e\u0001ð-\u0001\bê\u00142Äù@çÜü\u0006 Þñ\u000fð\bøû\u0004üù\n\n\u0002ôõ\fý<ºù\u0005þ\u000e÷>éÞì1Üü\u0006ü\rü\u001fÞì\u0001ð2Þî\u0003\u0002ö\u0000\u000e\u0014îì\u000bþø\u0006ð\u000e\u0001ð0Ö\níÿ&Ü\rüþò\bê\u00142¸\u0000\nü=³\u0010øAÓðø&Úýú\u0000 Þ\u0001\f\u0003ó\u0001ð%èì\u0003.Öù\u0001ø\bê\u00142¸\u0000\nü=³\u0010øAÓðø*Öù\u0001ø\u0001ð éî\u0014\bê\u00142Äù@ëÈ\u0004\u000e#Îÿ\u0010ç)Ù\u0000\u0003ú\u0000 Þ\u0001\f\u0003ó\u0004,È\u0004\u000e#Îÿ\u0010ç\bê\u00142Äù@êÖüû\r\u0003þõ\u0006\u0002ôõ\fý<ºù\u0005þ\u000e÷>äÚ ç÷ýüø4Þì4Ö\níÿ&Ü\rüþò\bê\u00142¿\u0004ù@ëÈ\u0004\u000e\"Ì\u000eÿ\u0000ò\bê\u00142Á\nò\u00068êÖ\níÿ&Ü\rüþò\u0004\u0010ð\u0002ôõ\fý<ºù\u0005þ\u000e÷>ëàí\r Þì4Ö\níÿ&Ü\rüþò\u000eì\u000b\u001bâõþ\fì\nò\u0010\u0018â\u0006ï\u0010îø4Úö\f\u0001î\u0004ü\b\u0003ñ\fì\nò\u0010\u0018â\u0006ï\u0010îø(îì\u000b\"Ø\u0006÷\u0007öù\u0000\u0001ð0Ó\u0001ü\u0000\u0000\böù\u001fÚ\b\n\u0014÷\u0017÷ü\rü Ö\níÿó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<íúä/Å\u0017\u000eø&¯Ííÿ\rð\u0000CËó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<úÍ\u0002+\u0005þù\u0003ÿÑ,Ð3ø\u0006öÖ4\u0014ø\u0016÷¹þN¹\u0004ôÿ\t\u0000ý÷÷R³\u0006þñJ\u0001ð0Í\u0002ÿ\fö\né/Õ\u0003:\u0001\u0000ùóÓ\nþ".getBytes("ISO-8859-1"), 0, bArr2, 0, 1153);
            $$a = bArr2;
            i2 = 172;
        }
        $$b = i2;
    }

    public static int getMediationNetwork(Object obj) {
        int i2 = $10;
        Object obj2 = w;
        int i3 = ((i2 & 53) + (i2 | 53)) % 128;
        $11 = i3;
        $10 = (i3 + 33) % 128;
        try {
            byte[] bArr = $$a;
            return ((Integer) Class.forName($$c(563, bArr[200], bArr[175]), true, (ClassLoader) e).getMethod($$c(1128, bArr[13], bArr[282]), Object.class).invoke(obj2, obj)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
