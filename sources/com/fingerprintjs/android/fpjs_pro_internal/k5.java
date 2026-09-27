package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext;
import com.fingerprintjs.android.fpjs_pro_internal.C1722;
import com.fingerprintjs.android.fpjs_pro_internal.d0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http.HttpStatusCodesKt;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001bJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/location/LastKnownMockedLocationsInfoProvider;", "", "", "Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/location/LastKnownMockedLocationInfo;", "getFrameworkLastKnownMockedLocationsInfo", "()Ljava/util/List;", "getGoogleLastKnownMockedLocationInfo", "()Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/location/LastKnownMockedLocationInfo;", "Lcom/fingerprintjs/android/fpjs_pro/config/Config;", "config", "Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/location/LastKnownMockedLocationsInfoResult;", "getLastKnownMockedLocationsInfo", "(Lcom/fingerprintjs/android/fpjs_pro/config/Config;)Ljava/util/List;", "Landroid/location/Location;", "", "elapsedTimeMs", "(Landroid/location/Location;)J", "", "providerName", "toLastKnownMockedLocationInfo", "(Landroid/location/Location;Ljava/lang/String;)Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/location/LastKnownMockedLocationInfo;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Landroid/location/LocationManager;", "frameworkLocationManager", "Landroid/location/LocationManager;", "Companion", "fpjs-pro_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k5 {
    private static final a c = new a(null);
    public static int d = 0;
    public static int e = 1;
    public final Context a;
    public final LocationManager b;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/k5$a;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public k5(Context context, LocationManager locationManager) {
        this.a = context;
        this.b = locationManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0210, code lost:
    
        if (r1.i != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02fd, code lost:
    
        if (com.fingerprintjs.android.fpjs_pro_internal.e2.b(r0) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0319, code lost:
    
        com.fingerprintjs.android.fpjs_pro_internal.k5.e = (com.fingerprintjs.android.fpjs_pro_internal.k5.d + 95) % 128;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0306, code lost:
    
        r2 = (com.fingerprintjs.android.fpjs_pro_internal.k5.d + 73) % 128;
        com.fingerprintjs.android.fpjs_pro_internal.k5.e = r2;
        com.fingerprintjs.android.fpjs_pro_internal.k5.d = ((r2 ^ 71) + ((r2 & 71) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0304, code lost:
    
        if (com.fingerprintjs.android.fpjs_pro_internal.e2.b(r0) != false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object b(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        Object m882constructorimpl;
        int i7;
        long j = 0;
        int i8 = ~i4;
        int i9 = ~i5;
        int i10 = ~i6;
        int i11 = (~(i9 | i10)) | i8;
        int i12 = ~(i6 | i5);
        int i13 = i11 | i12;
        int i14 = (~(i8 | i5)) | (~(i8 | i10)) | (~(i10 | i5));
        int i15 = ((-1249902592) * i) + ((-1100480512) * i2) + (1885863936 * i3) + ((-1165201990) * i14) + (i12 * (-1165201990)) + (1165201990 * i13) + ((-1243901369) * i4) + (720661947 * i5) + 1572077568;
        int a2 = com.fingerprintjs.android.fpjs_pro.g.a(i, 266941808, (669352129 * i2) + i5 + i4 + i3);
        int i16 = i14 * 582;
        int i17 = 1244927807 * i2;
        int i18 = i * (-404665712);
        int c2 = com.fingerprintjs.android.fpjs_pro.g.c(a2, -45350912, i18 + i17 + (1617401855 * i3) + i16 + (i12 * 582) + (i13 * (-582)) + (i4 * 1617401273) + (i5 * 1617402437) + 56426783, 1565261824, ((-491520000) * a2) + i15);
        char c3 = 3;
        char c4 = 4;
        if (c2 != 1) {
            if (c2 != 2) {
                k5 k5Var = (k5) objArr[0];
                try {
                    Object[] objArr2 = {0L, r14, r14, new i5(k5Var), 7, null};
                    Boolean bool = Boolean.FALSE;
                    Object f = rV4669.f(942509419);
                    if (f == null) {
                        int resolveSize = 848 - View.resolveSize(0, 0);
                        i7 = 942509419;
                        char c5 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        int i19 = 53 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        Class cls = Long.TYPE;
                        Class cls2 = Boolean.TYPE;
                        f = rV4669.g(resolveSize, c5, i19, -1316401137, "setPivotYN16904", new Class[]{cls, cls2, cls2, Function1.class, Integer.TYPE, Object.class});
                    } else {
                        i7 = 942509419;
                    }
                    List<String> list = (List) component9.D8871((D8871) ((Method) f).invoke(null, objArr2), CollectionsKt.emptyList());
                    ArrayList arrayList = new ArrayList();
                    int i20 = e;
                    d = ((i20 & 61) + (i20 | 61)) % 128;
                    for (String str : list) {
                        char c6 = c3;
                        j5 j5Var = new j5(k5Var, str);
                        char c7 = c4;
                        Object[] objArr3 = new Object[6];
                        objArr3[5] = null;
                        objArr3[c7] = 7;
                        objArr3[c6] = j5Var;
                        Boolean bool2 = Boolean.FALSE;
                        objArr3[2] = bool2;
                        objArr3[1] = bool2;
                        objArr3[0] = 0L;
                        Object f2 = rV4669.f(i7);
                        if (f2 == null) {
                            int packedPositionType = ExpandableListView.getPackedPositionType(j) + 848;
                            char resolveSize2 = (char) View.resolveSize(0, 0);
                            int trimmedLength = TextUtils.getTrimmedLength("") + 52;
                            Class cls3 = Long.TYPE;
                            Class cls4 = Boolean.TYPE;
                            f2 = rV4669.g(packedPositionType, resolveSize2, trimmedLength, -1316401137, "setPivotYN16904", new Class[]{cls3, cls4, cls4, Function1.class, Integer.TYPE, Object.class});
                        }
                        e4 e4Var = (e4) b(new Object[]{(Location) component9.D8871((D8871) ((Method) f2).invoke(null, objArr3), null), str}, d0.Companion.a(), d0.Companion.a(), d0.Companion.a(), 443640599, -443640598, d0.Companion.a());
                        if (e4Var != null) {
                            int i21 = d;
                            e = ((i21 & 75) + (i21 | 75)) % 128;
                            arrayList.add(e4Var);
                            int i22 = e;
                            d = ((i22 ^ 85) + ((i22 & 85) << 1)) % 128;
                        }
                        c3 = c6;
                        c4 = c7;
                        j = 0;
                    }
                    return arrayList;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            k5 k5Var2 = (k5) objArr[0];
            unregisterForContextMenu unregisterforcontextmenu = (unregisterForContextMenu) objArr[1];
            int i23 = e;
            int i24 = ((i23 | 33) << 1) - (i23 ^ 33);
            d = i24 % 128;
            try {
            } catch (Throwable th2) {
                Result.Companion companion = Result.INSTANCE;
                m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th2));
            }
            if (i24 % 2 != 0) {
                Result.Companion companion2 = Result.INSTANCE;
                int i25 = 49 / 0;
                if (unregisterforcontextmenu.i) {
                    ArrayList i0 = CollectionsKt.i0((List) b(new Object[]{k5Var2}, d0.Companion.a(), d0.Companion.a(), d0.Companion.a(), 1844462322, -1844462322, d0.Companion.a()), CollectionsKt.T(k5Var2.a()));
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = i0.iterator();
                    while (it.hasNext()) {
                        int i26 = d + 43;
                        e = i26 % 128;
                        if (i26 % 2 != 0) {
                            Object next = it.next();
                            if (((e4) next).a() < 5000) {
                                int i27 = d;
                                int i28 = (i27 & 39) + (i27 | 39);
                                e = i28 % 128;
                                if (i28 % 2 != 0) {
                                    arrayList2.add(next);
                                } else {
                                    arrayList2.add(next);
                                    throw null;
                                }
                            } else {
                                int i29 = e;
                                d = ((i29 ^ 109) + ((i29 & 109) << 1)) % 128;
                            }
                        } else {
                            ((e4) it.next()).a();
                            throw null;
                        }
                    }
                    m882constructorimpl = Result.m882constructorimpl(arrayList2);
                    e = (d + 1) % 128;
                    return (List) component9.D8871(bf.D8871(m882constructorimpl), CollectionsKt.emptyList());
                }
                throw new Exception();
            }
            Result.Companion companion3 = Result.INSTANCE;
        } else {
            final Location location = (Location) objArr[0];
            String str2 = (String) objArr[1];
            int i30 = (e + HttpStatusCodesKt.HTTP_EARLY_HINTS) % 128;
            d = i30;
            if (location != null) {
                int i31 = i30 + 9;
                e = i31 % 128;
                if (i31 % 2 == 0) {
                    int i32 = 64 / 0;
                }
                if (location != null) {
                    try {
                        Object[] objArr4 = {0L, r3, r3, new Function1<SafeWithTimeoutProContext, Long>() { // from class: com.fingerprintjs.android.fpjs_pro_internal.pV7834$2
                            public static final long i;
                            public static final int j;
                            public static final char k;
                            public static int l;
                            public static int m;
                            public static int n;
                            public static int o;
                            public static final byte[] p = null;

                            static {
                                b();
                                n = 0;
                                o = 1;
                                l = 0;
                                m = 1;
                                i = 4511368160188510747L;
                                j = 1890851610;
                                k = (char) 6938;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public static void a(char c8, int i33, String str3, String str4, Object[] objArr5) {
                                int i34;
                                int i35;
                                char[] charArray = "⤁྿\u20ce㤒".toCharArray();
                                o = (n + 25) % 128;
                                char[] charArray2 = str4.toCharArray();
                                n = (o + 37) % 128;
                                char[] cArr = charArray2;
                                char[] charArray3 = str3.toCharArray();
                                cu cuVar = new cu();
                                int length = cArr.length;
                                char[] cArr2 = new char[length];
                                int length2 = charArray.length;
                                char[] cArr3 = new char[length2];
                                int i36 = 0;
                                System.arraycopy(cArr, 0, cArr2, 0, length);
                                System.arraycopy(charArray, 0, cArr3, 0, length2);
                                cArr2[0] = (char) (cArr2[0] ^ c8);
                                cArr3[2] = (char) (cArr3[2] + ((char) i33));
                                int length3 = charArray3.length;
                                char[] cArr4 = new char[length3];
                                cuVar.component9 = 0;
                                while (cuVar.component9 < length3) {
                                    o = (n + 91) % 128;
                                    try {
                                        Object[] objArr6 = {cuVar};
                                        Object f3 = rV4669.f(-156886158);
                                        if (f3 == null) {
                                            int mirror = 3521 - AndroidCharacter.getMirror('0');
                                            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 52;
                                            byte[] bArr = new byte[1];
                                            if (p == null) {
                                                i35 = 4;
                                            } else {
                                                i35 = 121;
                                            }
                                            bArr[i36] = (byte) i35;
                                            f3 = rV4669.g(mirror, touchSlop, minimumFlingVelocity, 2130888214, new String(bArr, i36), new Class[]{Object.class});
                                        }
                                        int intValue = ((Integer) ((Method) f3).invoke(null, objArr6)).intValue();
                                        Object[] objArr7 = {cuVar};
                                        Object f4 = rV4669.f(-671190211);
                                        if (f4 == null) {
                                            f4 = rV4669.g(1937 - View.resolveSize(i36, i36), (char) ((-16777216) - Color.rgb(i36, i36, i36)), 53 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1583001177, "w", new Class[]{Object.class});
                                        }
                                        int intValue2 = ((Integer) ((Method) f4).invoke(null, objArr7)).intValue();
                                        int i37 = cArr2[cuVar.component9 % 4] * 32718;
                                        Object[] objArr8 = new Object[3];
                                        objArr8[2] = Integer.valueOf(cArr3[intValue]);
                                        objArr8[1] = Integer.valueOf(i37);
                                        objArr8[i36] = cuVar;
                                        Object f5 = rV4669.f(669877551);
                                        Class cls5 = Integer.TYPE;
                                        if (f5 == null) {
                                            i34 = i36;
                                            f5 = rV4669.g(2196 - ExpandableListView.getPackedPositionType(0L), (char) (36090 - ExpandableListView.getPackedPositionGroup(0L)), 52 - (Process.myTid() >> 22), -1370924981, "x", new Class[]{Object.class, cls5, cls5});
                                        } else {
                                            i34 = i36;
                                        }
                                        ((Method) f5).invoke(null, objArr8);
                                        int i38 = cArr2[intValue2] * 32718;
                                        Object[] objArr9 = new Object[2];
                                        objArr9[1] = Integer.valueOf(cArr3[intValue]);
                                        objArr9[i34] = Integer.valueOf(i38);
                                        Object f6 = rV4669.f(1085930810);
                                        if (f6 == null) {
                                            int i39 = i34;
                                            f6 = rV4669.g(ExpandableListView.getPackedPositionGroup(0L) + 900, (char) (21350 - TextUtils.lastIndexOf("", '0', i39, i39)), 59 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -920838050, "D", new Class[]{cls5, cls5});
                                        }
                                        cArr3[intValue2] = ((Character) ((Method) f6).invoke(null, objArr9)).charValue();
                                        cArr2[intValue2] = cuVar.vD14832N6715;
                                        int i40 = cuVar.component9;
                                        cArr4[i40] = (char) ((((r6 ^ charArray3[i40]) ^ (i ^ 543169457660631834L)) ^ ((int) (j ^ 543169457660631834L))) ^ ((char) (k ^ 543169457660631834L)));
                                        cuVar.component9 = i40 + 1;
                                        i36 = 0;
                                    } catch (Throwable th3) {
                                        Throwable cause2 = th3.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th3;
                                    }
                                }
                                objArr5[0] = new String(cArr4);
                            }

                            public static void b() {
                                p = new byte[]{81, MessagePack.Code.EXT16, -121, 89};
                            }

                            public static void setPivotYN16904(long j2, long j3) {
                                long j4 = j2 ^ (j3 << 32);
                                af.class.getField("a").get(null);
                                m = (l + 99) % 128;
                                try {
                                    Object[] objArr5 = {Long.valueOf(j4)};
                                    Object[] objArr6 = new Object[1];
                                    a((char) (KeyEvent.getMaxKeyCode() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 276216332, "ﴅ儖릅\u0e66\ue9fe䱙蝆", "ഏ皺ᜐ\udb5c", objArr6);
                                    Method method = Long.class.getMethod((String) objArr6[0], Long.TYPE);
                                    method.setAccessible(true);
                                    Object invoke = method.invoke(null, objArr5);
                                    Object obj = ah.class.getField("INSTANCE").get(null);
                                    Method method2 = ah.class.getMethod("component5", null);
                                    method2.setAccessible(true);
                                    Object invoke2 = method2.invoke(obj, null);
                                    Object[] objArr7 = new Object[1];
                                    a((char) (5531 - TextUtils.indexOf("", "", 0, 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 686912172, "㍰\uf206ꧥ", "厣ຍ鯗圕", objArr7);
                                    Object[] objArr8 = {(String) objArr7[0], invoke};
                                    Object[] objArr9 = new Object[1];
                                    a((char) (18506 - TextUtils.indexOf("", "")), (-1637517230) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "遘镍랏", "兼數䪞뙈", objArr9);
                                    Method method3 = Map.class.getMethod((String) objArr9[0], Object.class, Object.class);
                                    method3.setAccessible(true);
                                    method3.invoke(invoke2, objArr8);
                                    m = (l + 109) % 128;
                                } catch (Throwable th3) {
                                    Throwable cause2 = th3.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th3;
                                }
                            }

                            public final Long c(SafeWithTimeoutProContext safeWithTimeoutProContext) {
                                m = (l + 115) % 128;
                                Long valueOf = Long.valueOf((SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000);
                                l = (m + 93) % 128;
                                return valueOf;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final /* synthetic */ Long invoke(SafeWithTimeoutProContext safeWithTimeoutProContext) {
                                m = (l + 35) % 128;
                                Long c8 = c(safeWithTimeoutProContext);
                                int i33 = l + 31;
                                m = i33 % 128;
                                if (i33 % 2 != 0) {
                                    return c8;
                                }
                                throw null;
                            }
                        }, 7, null};
                        Boolean bool3 = Boolean.FALSE;
                        Object f3 = rV4669.f(942509419);
                        if (f3 == null) {
                            int red = 848 - Color.red(0);
                            char c8 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int i33 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 52;
                            Class cls5 = Long.TYPE;
                            Class cls6 = Boolean.TYPE;
                            f3 = rV4669.g(red, c8, i33, -1316401137, "setPivotYN16904", new Class[]{cls5, cls6, cls6, Function1.class, Integer.TYPE, Object.class});
                        }
                        long longValue = ((Number) component9.D8871((D8871) ((Method) f3).invoke(null, objArr4), 0L)).longValue();
                        d = (e + 29) % 128;
                        return new e4(str2, longValue);
                    } catch (Throwable th3) {
                        Throwable cause2 = th3.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th3;
                    }
                }
            }
            return null;
        }
    }

    public final e4 a() {
        try {
            Object[] objArr = {0L, r1, r1, new h5(this), 7, null};
            Boolean bool = Boolean.FALSE;
            Object f = rV4669.f(942509419);
            if (f == null) {
                int i = 849 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                char resolveSize = (char) View.resolveSize(0, 0);
                int indexOf = 52 - TextUtils.indexOf("", "");
                Class cls = Long.TYPE;
                Class cls2 = Boolean.TYPE;
                f = rV4669.g(i, resolveSize, indexOf, -1316401137, "setPivotYN16904", new Class[]{cls, cls2, cls2, Function1.class, Integer.TYPE, Object.class});
            }
            Object[] objArr2 = {(Location) component9.D8871((D8871) ((Method) f).invoke(null, objArr), null), C1722.l2.e.setPivotYN16904()};
            int a2 = d0.Companion.a();
            e4 e4Var = (e4) b(objArr2, d0.Companion.a(), d0.Companion.a(), d0.Companion.a(), 443640599, -443640598, a2);
            int i2 = d;
            e = ((i2 & 19) + (i2 | 19)) % 128;
            return e4Var;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
