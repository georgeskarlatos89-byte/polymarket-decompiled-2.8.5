package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.location.Address;
import android.location.Criteria;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.mlkit.common.MlKitException;
import defpackage.hdi;
import defpackage.k84;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http.HttpStatusCodesKt;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/o3;", "", com.socure.idplus.device.internal.mediaDevice.manager.d.d, "a"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o3 {
    private static final a d = new a(null);
    public static final List e = CollectionsKt.listOf("gps", "network", "passive");
    public static int f = 0;
    public static int g = 1;
    public final Context a;
    public final LocationManager b;
    public final Geocoder c;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/o3$a;", "", "", "", "setPivotYN16904", "Ljava/util/List;", "D8871"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public o3(Context context, LocationManager locationManager, Geocoder geocoder) {
        this.a = context;
        this.b = locationManager;
        this.c = geocoder;
    }

    public static final /* synthetic */ LocationManager a(o3 o3Var) {
        int i = g;
        int i2 = ((i ^ 7) + ((i & 7) << 1)) % 128;
        f = i2;
        LocationManager locationManager = o3Var.b;
        int i3 = i2 + 113;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            return locationManager;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d2, code lost:
    
        if (r13.isLocationEnabled() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e9, code lost:
    
        r11 = new com.fingerprintjs.android.fpjs_pro_internal.i3(r9, r8);
        r8 = new com.fingerprintjs.android.fpjs_pro_internal.ax();
        r11.invoke(r8);
        r8 = (android.location.Location) r8.a();
        r9 = com.fingerprintjs.android.fpjs_pro_internal.o3.f + 95;
        com.fingerprintjs.android.fpjs_pro_internal.o3.g = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0105, code lost:
    
        if ((r9 % 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0107, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0108, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e0, code lost:
    
        com.fingerprintjs.android.fpjs_pro_internal.o3.g = (com.fingerprintjs.android.fpjs_pro_internal.o3.f + 85) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e8, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00de, code lost:
    
        if (r11.isLocationEnabled() == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object b(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        String str;
        int i7 = ~i5;
        int i8 = i7 | i2;
        int i9 = ~(i8 | i3);
        int i10 = (~i3) | (~((~i2) | i5));
        int i11 = (~(i3 | i2)) | (~(i7 | i3)) | (~i8);
        int i12 = 1394081792 * i6;
        int i13 = (-1703411712) * i;
        int i14 = (1961361408 * i4) + i13 + i12 + ((-342977397) * i11) + (342977397 * i10) + (i9 * (-342977397)) + (1051104396 * i2) + (1737059190 * i5) + 1765277696;
        int a2 = com.fingerprintjs.android.fpjs_pro.g.a(i4, -1992133889, ((-953487067) * i) + i5 + i2 + i6);
        int i15 = i10 * (-413);
        int i16 = i11 * 413;
        int i17 = i6 * 272662391;
        int i18 = i * 2077717299;
        int i19 = i4 * 1957688713;
        int c = com.fingerprintjs.android.fpjs_pro.g.c(a2, 166854656, i19 + i18 + i17 + i16 + i15 + (i9 * 413) + (i2 * 272662804) + ((i5 * 272661978) - 2115615402), -213778432, (907935744 * a2) + i14);
        if (c != 1) {
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        if (c != 5) {
                            o3 o3Var = (o3) objArr[0];
                            String str2 = (String) objArr[1];
                            int i20 = g;
                            int i21 = ((i20 | 105) << 1) - (i20 ^ 105);
                            f = i21 % 128;
                            int i22 = i21 % 2;
                            LocationManager locationManager = o3Var.b;
                            locationManager.getClass();
                            if (i22 == 0) {
                                return locationManager.getLastKnownLocation(str2);
                            }
                            locationManager.getLastKnownLocation(str2);
                            throw null;
                        }
                        o3 o3Var2 = (o3) objArr[0];
                        String str3 = (String) objArr[1];
                        int i23 = g;
                        int i24 = (i23 ^ 25) + ((i23 & 25) << 1);
                        f = i24 % 128;
                        if (i24 % 2 != 0) {
                            LocationManager locationManager2 = o3Var2.b;
                            locationManager2.getClass();
                            int i25 = 31 / 0;
                        } else {
                            LocationManager locationManager3 = o3Var2.b;
                            locationManager3.getClass();
                        }
                    } else {
                        o3 o3Var3 = (o3) objArr[0];
                        double doubleValue = ((Number) objArr[1]).doubleValue();
                        double doubleValue2 = ((Number) objArr[2]).doubleValue();
                        int intValue = ((Number) objArr[3]).intValue();
                        Geocoder geocoder = o3Var3.c;
                        geocoder.getClass();
                        List<Address> fromLocation = geocoder.getFromLocation(doubleValue, doubleValue2, intValue);
                        fromLocation.getClass();
                        ArrayList arrayList = new ArrayList();
                        int i26 = g;
                        f = ((i26 ^ 9) + ((i26 & 9) << 1)) % 128;
                        for (Address address : fromLocation) {
                            g = (f + 115) % 128;
                            if (address != null) {
                                f = (g + 107) % 128;
                                str = address.getCountryCode();
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                int i27 = f;
                                g = ((i27 ^ 63) + ((i27 & 63) << 1)) % 128;
                                arrayList.add(str);
                                int i28 = f;
                                g = ((i28 & 97) + (i28 | 97)) % 128;
                            }
                        }
                        int i29 = g + 77;
                        f = i29 % 128;
                        if (i29 % 2 != 0) {
                            int i30 = 5 / 0;
                        }
                        return arrayList;
                    }
                } else {
                    f = (g + 65) % 128;
                    boolean isPresent = Geocoder.isPresent();
                    g = (f + 105) % 128;
                    return Boolean.valueOf(isPresent);
                }
            } else {
                final o3 o3Var4 = (o3) objArr[0];
                int i31 = f;
                int i32 = ((i31 | 125) << 1) - (i31 ^ 125);
                g = i32 % 128;
                if (i32 % 2 != 0) {
                    if (!((Boolean) b(new Object[]{o3Var4}, a0.b(), -27217817, a0.b(), a0.b(), 27217818, a0.b())).booleanValue()) {
                        int i33 = g;
                        int i34 = ((i33 | 121) << 1) - (i33 ^ 121);
                        f = i34 % 128;
                        if (i34 % 2 != 0) {
                            int i35 = 80 / 0;
                        }
                        return null;
                    }
                    Function1<f2, Unit> function1 = new Function1<f2, Unit>() { // from class: com.fingerprintjs.android.fpjs_pro_internal.fQ24217$4
                        public static final char[] i;
                        public static final int j;
                        public static final boolean k;
                        public static final boolean l;
                        public static int m;
                        public static int n;
                        public static final byte[] o = null;
                        public static int p;
                        public static int q;
                        public static final byte[] r = null;

                        static {
                            e();
                            p = 0;
                            q = 1;
                            d();
                            m = 0;
                            n = 1;
                            i = new char[]{39005, 38986, 38992, 38990, 38987, 38997, 39306, 39007, 38976, 38993, 39039, 38980, 38995, 39037, 38988, 38984, 39029, 38994, 38985, 38991, 39307, 38999, 39305, 39006, 38977, 39309};
                            j = -1996121668;
                            k = true;
                            l = true;
                        }

                        {
                            super(1);
                        }

                        public static String a(byte b) {
                            int i36 = b + 107;
                            byte[] bArr = new byte[1];
                            if (r == null) {
                                i36 = b + 110;
                            }
                            bArr[0] = (byte) i36;
                            return new String(bArr, 0);
                        }

                        public static void b(int i36, String str4, Object[] objArr2) {
                            byte[] bytes;
                            char[] cArr;
                            int i37 = q + 105;
                            p = i37 % 128;
                            if (i37 % 2 != 0) {
                                bytes = str4.getBytes("ISO-8859-1");
                                int i38 = 93 / 0;
                            } else {
                                bytes = str4.getBytes("ISO-8859-1");
                            }
                            byte[] bArr = bytes;
                            cn cnVar = new cn();
                            Class cls = Integer.TYPE;
                            char[] cArr2 = i;
                            if (cArr2 != null) {
                                q = (p + 53) % 128;
                                int length = cArr2.length;
                                char[] cArr3 = new char[length];
                                int i39 = 0;
                                while (i39 < length) {
                                    try {
                                        Object[] objArr3 = {Integer.valueOf(cArr2[i39])};
                                        Object f2 = rV4669.f(-1231974710);
                                        if (f2 == null) {
                                            f2 = rV4669.g(View.resolveSize(0, 0) + 4455, (char) ((Process.myPid() >> 22) + 55064), 52 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1060459438, a((byte) 0), new Class[]{cls});
                                        }
                                        cArr3[i39] = ((Character) ((Method) f2).invoke(null, objArr3)).charValue();
                                        i39++;
                                        q = (p + 93) % 128;
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                }
                                cArr2 = cArr3;
                            }
                            Object[] objArr4 = {Integer.valueOf(j)};
                            Object f3 = rV4669.f(910422024);
                            if (f3 == null) {
                                f3 = rV4669.g(TextUtils.lastIndexOf("", '0', 0, 0) + 6409, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 41547), TextUtils.indexOf((CharSequence) "", '0', 0) + 52, -1075368596, a((byte) r.length), new Class[]{cls});
                            }
                            int intValue2 = ((Integer) ((Method) f3).invoke(null, objArr4)).intValue();
                            if (l) {
                                int i40 = q + 1;
                                p = i40 % 128;
                                if (i40 % 2 != 0) {
                                    int length2 = bArr.length;
                                    cnVar.D8871 = length2;
                                    cArr = new char[length2];
                                    cnVar.setPivotYN16904 = 1;
                                } else {
                                    int length3 = bArr.length;
                                    cnVar.D8871 = length3;
                                    cArr = new char[length3];
                                    cnVar.setPivotYN16904 = 0;
                                }
                                while (true) {
                                    int i41 = cnVar.setPivotYN16904;
                                    int i42 = cnVar.D8871;
                                    if (i41 < i42) {
                                        cArr[i41] = (char) (cArr2[bArr[(i42 - 1) - i41] + i36] - intValue2);
                                        Object[] objArr5 = {cnVar, cnVar};
                                        Object f4 = rV4669.f(1050500938);
                                        if (f4 == null) {
                                            f4 = rV4669.g((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6510, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 52 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1220967890, a((byte) 1), new Class[]{Object.class, Object.class});
                                        }
                                        ((Method) f4).invoke(null, objArr5);
                                    } else {
                                        objArr2[0] = new String(cArr);
                                        return;
                                    }
                                }
                            } else {
                                if (k) {
                                    p = (q + 105) % 128;
                                    throw null;
                                }
                                throw null;
                            }
                        }

                        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                        /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002b). Please report as a decompilation issue!!! */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public static void c(byte b, byte b2, short s, Object[] objArr2) {
                            int i36;
                            int i37;
                            int i38 = b + 97;
                            int i39 = 12 - s;
                            int i40 = b2 + 4;
                            byte[] bArr = new byte[i39];
                            byte[] bArr2 = o;
                            if (bArr2 == null) {
                                i37 = 0;
                                byte[] bArr3 = bArr2;
                                int i41 = i40;
                                int i42 = i39;
                                i38 = (i42 + (-i38)) - 17;
                                i40 = i41;
                                bArr2 = bArr3;
                                i36 = i37;
                                i37 = i36 + 1;
                                int i43 = i40 + 1;
                                bArr[i36] = (byte) i38;
                                if (i37 == i39) {
                                    objArr2[0] = new String(bArr, 0);
                                    return;
                                }
                                byte b3 = bArr2[i43];
                                i42 = i38;
                                i38 = b3;
                                bArr3 = bArr2;
                                i41 = i43;
                                i38 = (i42 + (-i38)) - 17;
                                i40 = i41;
                                bArr2 = bArr3;
                                i36 = i37;
                                i37 = i36 + 1;
                                int i432 = i40 + 1;
                                bArr[i36] = (byte) i38;
                                if (i37 == i39) {
                                }
                            } else {
                                i36 = 0;
                                i37 = i36 + 1;
                                int i4322 = i40 + 1;
                                bArr[i36] = (byte) i38;
                                if (i37 == i39) {
                                }
                            }
                        }

                        public static void d() {
                            o = new byte[]{65, MessagePack.Code.UINT16, -28, -122, -29, -15, -20, -16, -16, -8, -26, -23, 46, -29, -15, -20, -16, -16, -8, -26, -23, 42, 33, 2, -20, -21, -12, -16, MessagePack.Code.INT64, 7, -18, -11, -21, -29, -18, -26};
                        }

                        public static void e() {
                            r = new byte[]{115, 120, 102, -31};
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:85:0x0700, code lost:
                        
                            if (((r0 & r3) | (r0 ^ r3)) == 1) goto L76;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:17:0x03aa  */
                        /* JADX WARN: Removed duplicated region for block: B:19:0x03b7  */
                        /* JADX WARN: Removed duplicated region for block: B:66:0x07a5  */
                        /* JADX WARN: Removed duplicated region for block: B:68:0x0854  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public static Object[] setPivotYN16904(Context context, int i36, int i37, int i38) {
                            Object[] objArr2;
                            int i39;
                            Object[] objArr3;
                            int i40;
                            char c2;
                            char c3;
                            boolean z;
                            int i41;
                            int i42 = m;
                            n = (i42 + 51) % 128;
                            if (context == null) {
                                Object[] objArr4 = {r3, null, r4, new int[1]};
                                int[] iArr = {i36};
                                int[] iArr2 = {i36};
                                int a3 = k84.a((~(i36 | 1484802441)) | (~((-542885892) | i36)) | 542867458, -69, (((~((-18434) | i36)) | (~(2027669899 | i36))) * 69) + 1459955822, -629118552);
                                int D8871 = fQ24217$5$5.D8871();
                                int i43 = a3 * 246;
                                int i44 = ~a3;
                                int i45 = (((~((~D8871) | i44)) | (~i44)) * (-245)) + i43;
                                int i46 = ~((i44 & D8871) | (i44 ^ D8871));
                                int i47 = (((i45 - (~(i46 * (-245)))) - 1) - (~(i46 * 245))) - 1;
                                int D88712 = fQ24217$5$5.D8871();
                                int i48 = i47 * 615;
                                int i49 = i38 * (-613);
                                int i50 = (i48 ^ i49) + ((i48 & i49) << 1);
                                int i51 = ~i47;
                                int i52 = ~((i51 ^ i38) | (i51 & i38));
                                int i53 = ~i38;
                                int i54 = ((i52 & D88712) | (D88712 ^ i52) | (~((i53 ^ i47) | (i53 & i47)))) * 614;
                                int i55 = (i50 ^ i54) + ((i54 & i50) << 1);
                                int i56 = ~D88712;
                                int i57 = (~((i51 ^ i56) | (i51 & i56))) | (~(i51 | i38));
                                int i58 = ~((i56 ^ i38) | (i56 & i38));
                                int i59 = -(-(((i57 & i58) | (i57 ^ i58)) * (-1228)));
                                int i60 = ((i55 | i59) << 1) - (i59 ^ i55);
                                int i61 = i51 | i53;
                                int i62 = ~((i61 & i56) | (i61 ^ i56));
                                int i63 = i56 | i47;
                                int i64 = ~((i63 & i38) | (i63 ^ i38));
                                int i65 = ((i64 & i62) | (i62 ^ i64)) * 614;
                                int i66 = (i60 ^ i65) + ((i65 & i60) << 1);
                                int i67 = i66 << 13;
                                int i68 = (i67 | i66) & (~(i66 & i67));
                                int i69 = i68 >>> 17;
                                int i70 = ((~i68) & i69) | ((~i69) & i68);
                                int i71 = i70 << 5;
                                ((int[]) objArr4[3])[0] = ((~i70) & i71) | ((~i71) & i70);
                                return objArr4;
                            }
                            int i72 = ((i42 & 11) + (i42 | 11)) % 128;
                            n = i72;
                            m = (i72 + 5) % 128;
                            try {
                                int i73 = -AndroidCharacter.getMirror('0');
                                int i74 = (i73 * (-337)) - (-59325);
                                int i75 = ~i73;
                                int i76 = ~i36;
                                int i77 = ~(i75 | i76);
                                int i78 = ~(((-176) ^ i73) | ((-176) & i73));
                                int i79 = ((i77 ^ i78) | (i78 & i77) | (~((i73 ^ i36) | (i73 & i36)))) * (-338);
                                int i80 = ((~(i75 | 175)) * 338) + (i74 ^ i79) + ((i79 & i74) << 1);
                                int i81 = (i73 & 175) | (i73 ^ 175);
                                int i82 = -(-(((~((i81 & i36) | (i81 ^ i36))) | (~((i75 ^ i76) | (i75 & i76)))) * 338));
                                int i83 = (i80 & i82) + (i80 | i82);
                                Object[] objArr5 = new Object[1];
                                b(i83, "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr5);
                                Class<?> cls = Class.forName((String) objArr5[0]);
                                int i84 = -TextUtils.getTrimmedLength("");
                                int i85 = i84 * 471;
                                int i86 = (i85 ^ 59817) + ((i85 & 59817) << 1);
                                int i87 = -(-(((i84 ^ 127) | (i84 & 127)) * (-470)));
                                int i88 = ((i86 | i87) << 1) - (i87 ^ i86);
                                int i89 = ~i84;
                                int i90 = ~((i89 & (-128)) | (i89 ^ (-128)));
                                int i91 = ~(((-128) ^ i36) | ((-128) & i36));
                                int i92 = (i90 ^ i91) | (i90 & i91);
                                int i93 = (i76 ^ i84) | (i76 & i84);
                                int i94 = ~((i93 ^ 127) | (i93 & 127));
                                int i95 = (((i92 ^ i94) | (i92 & i94)) * (-470)) + i88;
                                int i96 = ((-128) ^ i84) | ((-128) & i84);
                                int i97 = i84 | i76;
                                int i98 = -(-(((~((i97 & 127) | (i97 ^ 127))) | (~((i96 & i36) | (i96 ^ i36)))) * 470));
                                int i99 = (i95 ^ i98) + ((i98 & i95) << 1);
                                Object[] objArr6 = new Object[1];
                                b(i99, "\u0085\u0092\u0082\u0091\u0082\u0085\u0086\u0089\u0081\u0088\u0086\u0090\u008f\u008f\u008e\u0089\u008a\u008d", objArr6);
                                Object invoke = cls.getMethod((String) objArr6[0], null).invoke(context, null);
                                int i100 = -View.resolveSize(0, 0);
                                int D88713 = fQ24217$5$5.D8871();
                                int i101 = i100 * 934;
                                int i102 = ((i101 | (-118364)) << 1) - (i101 ^ (-118364));
                                int i103 = ~i100;
                                int i104 = ~D88713;
                                int i105 = ~((i103 & i104) | (i103 ^ i104));
                                int i106 = -(-((((-128) & i105) | ((-128) ^ i105)) * (-933)));
                                int i107 = ((i102 | i106) << 1) - (i106 ^ i102);
                                int i108 = ~(((-128) & i104) | ((-128) ^ i104));
                                int i109 = ~(((-128) ^ i100) | ((-128) & i100));
                                int i110 = -(-(((i108 & i109) | (i108 ^ i109)) * 933));
                                int i111 = ((~((i100 & 127) | (i100 ^ 127))) * 933) + (i107 ^ i110) + ((i110 & i107) << 1);
                                Object[] objArr7 = new Object[1];
                                b(i111, "\u0085\u0092\u0082\u0091\u0082\u0085\u0086\u0089\u0081\u0088\u0086\u0090\u008f\u008f\u008e\u0087\u0093\u008f\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr7);
                                Class<?> cls2 = Class.forName((String) objArr7[0]);
                                int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                                int D88714 = fQ24217$5$5.D8871();
                                int i112 = windowTouchSlop * 284;
                                int i113 = (i112 & (-35814)) + (i112 | (-35814));
                                int i114 = ~windowTouchSlop;
                                int i115 = (((((~((i114 ^ D88714) | (i114 & D88714))) | (~((i114 ^ 127) | (i114 & 127)))) * (-283)) + i113) - (~(-(-((~(((-128) & windowTouchSlop) | ((-128) ^ windowTouchSlop))) * 283))))) - 1;
                                int i116 = (i114 ^ (-128)) | (i114 & (-128));
                                int i117 = (i115 - (~(-(-((~((i116 & D88714) | (i116 ^ D88714))) * 283))))) - 1;
                                Object[] objArr8 = new Object[1];
                                b(i117, "\u0094\u008d\u0081\u0090\u0092", objArr8);
                                if ((cls2.getField((String) objArr8[0]).getInt(invoke) & 2) != 0) {
                                    int i118 = m;
                                    int i119 = i118 + 37;
                                    n = i119 % 128;
                                    if (i119 % 2 == 0) {
                                        objArr2 = null;
                                        i39 = 1919452748;
                                    } else {
                                        i39 = 1919452748;
                                        objArr2 = null;
                                        objArr3 = new Object[]{r15, null, r7, r8};
                                        int[] iArr3 = {i36};
                                        int[] iArr4 = {i36 ^ 1};
                                        int a4 = k84.a((-1416423377) | (~(611264956 | i36)), 529, (((~(i76 | 611264956)) | (-1953492989)) * 529) + 932993018, 16);
                                        int i120 = (i38 * 302) + (a4 * (-300));
                                        int i121 = (a4 ^ i38) | (a4 & i38);
                                        int i122 = -(-((~((i121 ^ i36) | (i121 & i36))) * (-301)));
                                        int i123 = (i120 & i122) + (i122 | i120);
                                        int i124 = ~i38;
                                        int i125 = ~((i124 ^ i36) | (i124 & i36));
                                        int i126 = ~((i76 ^ a4) | (i76 & a4));
                                        int i127 = (((i125 ^ i126) | (i126 & i125)) * (-301)) + i123;
                                        int i128 = ~((~a4) | i36);
                                        int i129 = -(-(((i128 & i124) | (i124 ^ i128)) * MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE));
                                        int i130 = (i127 ^ i129) + ((i129 & i127) << 1);
                                        int i131 = i130 << 13;
                                        int i132 = (i131 & (~i130)) | ((~i131) & i130);
                                        int i133 = i132 >>> 17;
                                        int i134 = (i132 | i133) & (~(i132 & i133));
                                        int i135 = i134 << 5;
                                        int[] iArr5 = {(i134 | i135) & (~(i134 & i135))};
                                        n = (((i118 | 119) << 1) - (i118 ^ 119)) % 128;
                                        if (((int[]) objArr3[0])[0] == i36) {
                                            int i136 = m;
                                            n = ((i136 ^ 125) + ((i136 & 125) << 1)) % 128;
                                            return objArr3;
                                        }
                                        try {
                                            Object f2 = rV4669.f(-448558154);
                                            byte[] bArr = o;
                                            if (f2 == null) {
                                                int i137 = 5252 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                char longPressTimeout = (char) (37470 - (ViewConfiguration.getLongPressTimeout() >> 16));
                                                int lastIndexOf = TextUtils.lastIndexOf("", '0') + 53;
                                                byte b = bArr[23];
                                                byte b2 = b;
                                                i40 = 37470;
                                                c2 = 23;
                                                Object[] objArr9 = new Object[1];
                                                c(b, (byte) (b2 - 3), b2, objArr9);
                                                f2 = rV4669.g(i137, longPressTimeout, lastIndexOf, 1827100370, (String) objArr9[0], new Class[0]);
                                            } else {
                                                i40 = 37470;
                                                c2 = 23;
                                            }
                                            Object[] objArr10 = objArr2;
                                            Set set = (Set) ((Method) f2).invoke(objArr10, objArr10);
                                            Object f3 = rV4669.f(-1563369761);
                                            if (f3 == null) {
                                                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 5252;
                                                char fadingEdgeLength = (char) (i40 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                                                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 52;
                                                byte b3 = bArr[c2];
                                                c3 = '\t';
                                                Object[] objArr11 = new Object[1];
                                                c(b3, (byte) (-bArr[9]), b3, objArr11);
                                                f3 = rV4669.g(edgeSlop, fadingEdgeLength, threadPriority, 729023419, (String) objArr11[0], null);
                                            } else {
                                                c3 = '\t';
                                            }
                                            if (!set.contains(((Field) f3).get(null))) {
                                                int i138 = n + 107;
                                                m = i138 % 128;
                                                if (i138 % 2 != 0) {
                                                    Object f4 = rV4669.f(-665084816);
                                                    if (f4 == null) {
                                                        int myTid = 5252 - (Process.myTid() >> 22);
                                                        char size = (char) (i40 - View.MeasureSpec.getSize(0));
                                                        int jumpTapTimeout = 52 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                                        Object[] objArr12 = new Object[1];
                                                        c((byte) (-bArr[25]), (byte) 17, (short) 0, objArr12);
                                                        f4 = rV4669.g(myTid, size, jumpTapTimeout, 1375682836, (String) objArr12[0], null);
                                                    }
                                                    set.contains(((Field) f4).get(null));
                                                    throw null;
                                                }
                                                Object f5 = rV4669.f(-665084816);
                                                if (f5 == null) {
                                                    int lastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 5253;
                                                    char indexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 37471);
                                                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 52;
                                                    Object[] objArr13 = new Object[1];
                                                    c((byte) (-bArr[25]), (byte) 17, (short) 0, objArr13);
                                                    f5 = rV4669.g(lastIndexOf2, indexOf, keyRepeatDelay, 1375682836, (String) objArr13[0], null);
                                                }
                                                set.contains(((Field) f5).get(null));
                                            }
                                            if ((i37 & 32) == 0) {
                                                if (Build.VERSION.SDK_INT > 33) {
                                                    int i139 = n;
                                                    int i140 = (i139 ^ 77) + ((i139 & 77) << 1);
                                                    m = i140 % 128;
                                                    if (i140 % 2 != 0) {
                                                        Object[] objArr14 = new Object[1];
                                                        b(81 >>> (ViewConfiguration.getMinimumFlingVelocity() >> 10), "\u0088\u0084\u0087\u008a\u0090\u0098\u0081\u008d\u008d\u0099\u0098\u008a\u0083\u0097\u0083\u0096\u0090\u0090\u0095\u0089\u0086\u0082\u0086\u0095\u0088\u0089\u008a\u0095", objArr14);
                                                        try {
                                                            Object[] objArr15 = {(String) objArr14[0]};
                                                            Object f6 = rV4669.f(-668483483);
                                                            if (f6 == null) {
                                                                int rgb = (-16771170) - Color.rgb(0, 0, 0);
                                                                char indexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                                                                int resolveOpacity = 52 - Drawable.resolveOpacity(0, 0);
                                                                byte b4 = bArr[c2];
                                                                byte b5 = (byte) (-bArr[c3]);
                                                                byte b6 = (byte) (-bArr[2]);
                                                                Object[] objArr16 = new Object[1];
                                                                c(b4, b6, b5, objArr16);
                                                                f6 = rV4669.g(rgb, indexOf2, resolveOpacity, 1367547137, (String) objArr16[0], new Class[]{String.class});
                                                            }
                                                            long longValue = ((Long) ((Method) f6).invoke(null, objArr15)).longValue();
                                                            long j2 = ((-712563789) | (longValue ^ (-1))) ^ (-1);
                                                            long j3 = (1512 * j2) + (((-755) * longValue) - 537985659940L);
                                                            long j4 = 712563788 | longValue;
                                                            long j5 = i36;
                                                            long e2 = com.fingerprintjs.android.fpjs_pro.g.e(756L, j4 | (j5 ^ (-1)), ((-756) * (j2 | ((j4 | j5) ^ (-1)))) + j3, 1226986219L);
                                                            int i141 = ((int) (e2 >>> 95)) & ((((-1078464675) | i36) * 465) + (((-1825422076) | (~(1032318809 | i36))) * 930) + (((~((-1825422076) | i36)) | 1032318809) * (-465)) + 1559584668);
                                                            int myUid = Process.myUid();
                                                            int i142 = ((int) e2) & ((((~(myUid | (-545876252))) | (~((~myUid) | (-1983102662)))) * 333) + ((((~((-545876252) | r6)) | (~((-1983102662) | myUid))) * 333) - 1773614091));
                                                            if (((i141 & i142) | (i141 ^ i142)) == 0) {
                                                                z = true;
                                                            }
                                                            int i143 = n;
                                                            m = ((i143 & 97) + (i143 | 97)) % 128;
                                                            z = false;
                                                        } catch (Throwable th) {
                                                            Throwable cause = th.getCause();
                                                            if (cause != null) {
                                                                throw cause;
                                                            }
                                                            throw th;
                                                        }
                                                    } else {
                                                        int i144 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                        int i145 = ((i144 | 127) << 1) - (i144 ^ 127);
                                                        Object[] objArr17 = new Object[1];
                                                        b(i145, "\u0088\u0084\u0087\u008a\u0090\u0098\u0081\u008d\u008d\u0099\u0098\u008a\u0083\u0097\u0083\u0096\u0090\u0090\u0095\u0089\u0086\u0082\u0086\u0095\u0088\u0089\u008a\u0095", objArr17);
                                                        try {
                                                            Object[] objArr18 = {(String) objArr17[0]};
                                                            Object f7 = rV4669.f(-668483483);
                                                            if (f7 == null) {
                                                                int rgb2 = (-16771170) - Color.rgb(0, 0, 0);
                                                                char mode = (char) View.MeasureSpec.getMode(0);
                                                                int normalizeMetaState = KeyEvent.normalizeMetaState(0) + 52;
                                                                byte b7 = bArr[c2];
                                                                byte b8 = (byte) (-bArr[c3]);
                                                                byte b9 = (byte) (-bArr[2]);
                                                                Object[] objArr19 = new Object[1];
                                                                c(b7, b9, b8, objArr19);
                                                                f7 = rV4669.g(rgb2, mode, normalizeMetaState, 1367547137, (String) objArr19[0], new Class[]{String.class});
                                                            }
                                                            long longValue2 = ((Long) ((Method) f7).invoke(null, objArr18)).longValue();
                                                            long j6 = ((-657) * longValue2) + 1003374289000L;
                                                            long j7 = ((-1522571001) | longValue2) ^ (-1);
                                                            long j8 = ((longValue2 ^ (-1)) | 1522571000) ^ (-1);
                                                            long j9 = (1522571000 | i36) ^ (-1);
                                                            long e3 = com.fingerprintjs.android.fpjs_pro.g.e(658L, j8 | j9, (658 * j8) + ((-658) * (j7 | j8 | j9)) + j6, 416979007L);
                                                            int i146 = ((int) (e3 >> 32)) & ((((~((-482126352) | i76)) | 270838282) * 191) + ((((~((-482126352) | i36)) | 1919352762) * 191) - 1978750797));
                                                            int i147 = ((int) e3) & ((((~(1085967165 | i76)) | 1771773720) * 216) + (((-687936513) | i76) * (-216)) + ((~(1085967165 | i36)) * 216) + 752413069);
                                                        } catch (Throwable th2) {
                                                            Throwable cause2 = th2.getCause();
                                                            if (cause2 != null) {
                                                                throw cause2;
                                                            }
                                                            throw th2;
                                                        }
                                                    }
                                                    if (!z) {
                                                        n = (m + 91) % 128;
                                                        Object[] objArr20 = {r4, null, r5, new int[1]};
                                                        int[] iArr6 = {i36};
                                                        int[] iArr7 = {(i36 & (-11)) | (i76 & 10)};
                                                        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                                        int a5 = k84.a(~(elapsedCpuTime | (-851642449)), -1504, (((~((-868715615) | elapsedCpuTime)) | 17073166) * 1504) + i39, 199997696);
                                                        int i148 = ((a5 | 16) << 1) - (a5 ^ 16);
                                                        int D88715 = fQ24217$5$5.D8871();
                                                        int i149 = i148 * 624;
                                                        int i150 = i38 * (-622);
                                                        int i151 = ((i149 | i150) << 1) - (i149 ^ i150);
                                                        int i152 = ~i38;
                                                        int i153 = -(-((~(i152 | i148 | D88715)) * 623));
                                                        int i154 = ((i151 | i153) << 1) - (i153 ^ i151);
                                                        int i155 = ~D88715;
                                                        int i156 = ~i148;
                                                        int i157 = ~((i38 & i156) | (i156 ^ i38));
                                                        int i158 = -(-(((i157 & i155) | (i155 ^ i157)) * (-623)));
                                                        int i159 = (i154 & i158) + (i158 | i154);
                                                        int i160 = (~((i152 ^ i148) | (i152 & i148))) | (~((i152 & D88715) | (i152 ^ D88715)));
                                                        int i161 = ~((D88715 & i148) | (i148 ^ D88715));
                                                        int i162 = ((i161 & i160) | (i160 ^ i161)) * 623;
                                                        int i163 = (i159 & i162) + (i162 | i159);
                                                        int i164 = i163 << 13;
                                                        int i165 = (i164 | i163) & (~(i163 & i164));
                                                        int i166 = i165 >>> 17;
                                                        int i167 = (i165 | i166) & (~(i165 & i166));
                                                        int i168 = i167 << 5;
                                                        ((int[]) objArr20[3])[0] = (i167 | i168) & (~(i167 & i168));
                                                        return objArr20;
                                                    }
                                                    i41 = 4;
                                                } else {
                                                    int i169 = -(-View.resolveSize(0, 0));
                                                    Object[] objArr21 = new Object[1];
                                                    b((i169 & 127) + (i169 | 127), "\u008a\u0090\u0098\u0081\u008d\u008d\u0099\u0098\u008a\u0083\u0087\u0085\u0084", objArr21);
                                                    try {
                                                        Object[] objArr22 = {(String) objArr21[0]};
                                                        Object f8 = rV4669.f(-417469134);
                                                        if (f8 == null) {
                                                            int blue = Color.blue(0) + 6202;
                                                            char jumpTapTimeout2 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                                            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 51;
                                                            byte b10 = (byte) (-bArr[31]);
                                                            Object[] objArr23 = new Object[1];
                                                            c((byte) 0, (byte) (b10 | 20), b10, objArr23);
                                                            f8 = rV4669.g(blue, jumpTapTimeout2, doubleTapTimeout, 1857630294, (String) objArr23[0], new Class[]{String.class});
                                                        }
                                                        Object invoke2 = ((Method) f8).invoke(null, objArr22);
                                                        Object[] objArr24 = new Object[1];
                                                        b(126 - (~(-(-(ViewConfiguration.getWindowTouchSlop() >> 8)))), "\u009a", objArr24);
                                                        z = invoke2.equals((String) objArr24[0]);
                                                        if (!z) {
                                                        }
                                                    } catch (Throwable th3) {
                                                        Throwable cause3 = th3.getCause();
                                                        if (cause3 != null) {
                                                            throw cause3;
                                                        }
                                                        throw th3;
                                                    }
                                                }
                                            } else {
                                                i41 = 4;
                                            }
                                            Object[] objArr25 = new Object[i41];
                                            int[] iArr8 = new int[1];
                                            objArr25[0] = iArr8;
                                            int[] iArr9 = new int[1];
                                            objArr25[2] = iArr9;
                                            int[] iArr10 = new int[1];
                                            objArr25[3] = iArr10;
                                            iArr9[0] = i36;
                                            iArr8[0] = i36;
                                            objArr25[1] = null;
                                            int i170 = -(-((((~(840070111 | i76)) | (~((-1187618222) | i76)) | 1154059296) * 50) + (((~(i36 | (-33558926))) | (~((-1154059297) | i76))) * 50) + ((i36 | 840070111) * (-50)) + 1830152016));
                                            int i171 = ((i38 | i170) << 1) - (i170 ^ i38);
                                            int i172 = (i171 << 13) ^ i171;
                                            int i173 = i172 >>> 17;
                                            int i174 = (i172 | i173) & (~(i172 & i173));
                                            iArr10[0] = i174 ^ (i174 << 5);
                                            return objArr25;
                                        } catch (Throwable th4) {
                                            Throwable cause4 = th4.getCause();
                                            if (cause4 != null) {
                                                throw cause4;
                                            }
                                            throw th4;
                                        }
                                    }
                                } else {
                                    objArr2 = null;
                                    i39 = 1919452748;
                                    int i175 = m;
                                    n = ((i175 & 115) + (i175 | 115)) % 128;
                                }
                                objArr3 = new Object[]{r0, objArr2, r7, new int[1]};
                                int[] iArr11 = {i36};
                                int[] iArr12 = {i36};
                                int b11 = hdi.b(1155261003);
                                int i176 = (i38 - (~(-(-k84.a(~(b11 | (-269000705)), -1504, (((~((-304657410) | b11)) | 35656705) * 1504) + i39, -1979841184))))) - 1;
                                int i177 = i176 << 13;
                                int i178 = (i176 | i177) & (~(i176 & i177));
                                int i179 = i178 >>> 17;
                                int i180 = (i178 | i179) & (~(i178 & i179));
                                int i181 = i180 << 5;
                                ((int[]) objArr3[3])[0] = ((~i180) & i181) | ((~i181) & i180);
                                if (((int[]) objArr3[0])[0] == i36) {
                                }
                            } catch (Throwable th5) {
                                Throwable cause5 = th5.getCause();
                                if (cause5 != null) {
                                    throw cause5;
                                }
                                throw th5;
                            }
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, android.location.LocationListener, com.fingerprintjs.android.fpjs_pro_internal.m3] */
                        public final void f(f2 f2Var) {
                            Criteria criteria = new Criteria();
                            criteria.setAccuracy(1);
                            criteria.setPowerRequirement(3);
                            criteria.setCostAllowed(true);
                            criteria.setAltitudeRequired(true);
                            criteria.setBearingRequired(false);
                            criteria.setSpeedRequired(false);
                            criteria.setHorizontalAccuracy(3);
                            criteria.setVerticalAccuracy(3);
                            ?? obj = new Object();
                            obj.a = f2Var;
                            o3 o3Var5 = o3.this;
                            obj.b = o3Var5;
                            LocationManager a3 = o3.a(o3Var5);
                            a3.getClass();
                            a3.requestSingleUpdate(criteria, (LocationListener) obj, Looper.getMainLooper());
                            n = (m + 99) % 128;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ Unit invoke(f2 f2Var) {
                            int i36 = m;
                            int i37 = (i36 ^ HttpStatusCodesKt.HTTP_EARLY_HINTS) + ((i36 & HttpStatusCodesKt.HTTP_EARLY_HINTS) << 1);
                            n = i37 % 128;
                            int i38 = i37 % 2;
                            f(f2Var);
                            if (i38 != 0) {
                                return Unit.INSTANCE;
                            }
                            throw null;
                        }
                    };
                    ax axVar = new ax();
                    function1.invoke(axVar);
                    return (Location) axVar.a();
                }
                ((Boolean) b(new Object[]{o3Var4}, a0.b(), -27217817, a0.b(), a0.b(), 27217818, a0.b())).getClass();
                throw null;
            }
        } else {
            o3 o3Var5 = (o3) objArr[0];
            int i36 = g + 117;
            f = i36 % 128;
            if (i36 % 2 == 0) {
                LocationManager locationManager4 = o3Var5.b;
                locationManager4.getClass();
                if (!locationManager4.isProviderEnabled("gps")) {
                    LocationManager locationManager5 = o3Var5.b;
                    locationManager5.getClass();
                    if (!locationManager5.isProviderEnabled("network")) {
                        int i37 = g;
                        f = ((i37 ^ 73) + ((i37 & 73) << 1)) % 128;
                        return Boolean.FALSE;
                    }
                }
                return Boolean.TRUE;
            }
            LocationManager locationManager6 = o3Var5.b;
            locationManager6.getClass();
            locationManager6.isProviderEnabled("gps");
            throw null;
        }
    }

    public final ArrayList c() {
        int i = f + 67;
        g = i % 128;
        int i2 = i % 2;
        LocationManager locationManager = this.b;
        locationManager.getClass();
        List<String> allProviders = locationManager.getAllProviders();
        allProviders.getClass();
        ArrayList C = CollectionsKt.C(allProviders);
        if (i2 == 0) {
            int i3 = 97 / 0;
        }
        return C;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Location d() {
        int i;
        int i2;
        Object obj;
        String str;
        Location location;
        int i3;
        int i4;
        int i5 = f + HttpStatusCodesKt.HTTP_EARLY_HINTS;
        g = i5 % 128;
        if (i5 % 2 == 0 && Build.VERSION.SDK_INT < 38) {
            Location location2 = (Location) b(new Object[]{this}, a0.b(), -2043596642, a0.b(), a0.b(), 2043596644, a0.b());
            int i6 = f;
            g = (((i6 | 115) << 1) - (i6 ^ 115)) % 128;
            return location2;
        }
        g = (f + 75) % 128;
        ArrayList c = c();
        Iterator it = e.iterator();
        while (it.hasNext()) {
            int i7 = g;
            int i8 = (i7 ^ 79) + ((i7 & 79) << 1);
            f = i8 % 128;
            if (i8 % 2 != 0) {
                obj = it.next();
                int i9 = 54 / 0;
                if (c.contains((String) obj)) {
                    i2 = f;
                    i4 = i2 + 123;
                    i = i4 % 128;
                    g = i;
                    if (i4 % 2 == 0) {
                        throw null;
                    }
                }
            } else {
                obj = it.next();
                if (c.contains((String) obj)) {
                    i2 = f;
                    i4 = i2 + 123;
                    i = i4 % 128;
                    g = i;
                    if (i4 % 2 == 0) {
                    }
                }
            }
            str = (String) obj;
            if (str == null) {
                int i10 = i + 43;
                f = i10 % 128;
                if (i10 % 2 == 0) {
                    location = (Location) b(new Object[]{this, str}, a0.b(), 758318157, a0.b(), a0.b(), -758318152, a0.b());
                } else {
                    throw null;
                }
            } else {
                g = ((i2 & 69) + (i2 | 69)) % 128;
                location = null;
            }
            int i11 = f;
            i3 = (i11 & 5) + (i11 | 5);
            g = i3 % 128;
            if (i3 % 2 == 0) {
                return location;
            }
            throw null;
        }
        i = g;
        i2 = (i + 71) % 128;
        f = i2;
        obj = null;
        str = (String) obj;
        if (str == null) {
        }
        int i112 = f;
        i3 = (i112 & 5) + (i112 | 5);
        g = i3 % 128;
        if (i3 % 2 == 0) {
        }
    }
}
