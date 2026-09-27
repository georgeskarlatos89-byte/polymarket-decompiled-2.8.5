package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract class cz1 {
    public static final void a(long j, kjc kjcVar, List list, ubc ubcVar, boolean z, pq4 pq4Var, int i, int i2) {
        int i3;
        ubc ubcVar2;
        boolean z2;
        List list2;
        ubc ubcVar3;
        List emptyList;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.g0(-924632359);
        if ((i & 6) == 0) {
            if (sr8Var.h(null)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i3 = i10 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (sr8Var.h(null)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i3 |= i9;
        }
        if ((i & 384) == 0) {
            if (sr8Var.i(false)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        }
        if ((i & 3072) == 0) {
            if (sr8Var.g(j)) {
                i7 = 2048;
            } else {
                i7 = Barcode.FORMAT_UPC_E;
            }
            i3 |= i7;
        }
        if ((i & 24576) == 0) {
            if (sr8Var.h(kjcVar)) {
                i6 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        int i11 = i3 | 196608;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                ubcVar2 = ubcVar;
                if (sr8Var.h(ubcVar2)) {
                    i5 = 1048576;
                    i11 |= i5;
                }
            } else {
                ubcVar2 = ubcVar;
            }
            i5 = 524288;
            i11 |= i5;
        } else {
            ubcVar2 = ubcVar;
        }
        if ((12582912 & i) == 0) {
            if (sr8Var.i(z)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i11 |= i4;
        }
        if ((4793491 & i11) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sr8Var.V(i11 & 1, z2)) {
            sr8Var.a0();
            if ((i & 1) != 0 && !sr8Var.D()) {
                sr8Var.Y();
                if ((i2 & 64) != 0) {
                    i11 &= -3670017;
                }
                emptyList = list;
            } else {
                emptyList = CollectionsKt.emptyList();
                if ((i2 & 64) != 0) {
                    ubcVar2 = new ubc(0.0f, 0.0f, 63);
                    i11 &= -3670017;
                }
            }
            ubc ubcVar4 = ubcVar2;
            sr8Var.t();
            sr8Var.e0(-2096884468);
            sr8Var.s(false);
            ArrayList arrayList = new ArrayList();
            sr8Var.e0(-2096611575);
            sr8Var.s(false);
            arrayList.addAll(emptyList);
            b(j, kjcVar, arrayList, ubcVar4, z, sr8Var, (i11 >> 9) & 64624, 0);
            list2 = emptyList;
            ubcVar3 = ubcVar4;
        } else {
            sr8Var.Y();
            list2 = list;
            ubcVar3 = ubcVar2;
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new az1(j, kjcVar, list2, ubcVar3, z, i, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(long j, kjc kjcVar, List list, ubc ubcVar, boolean z, pq4 pq4Var, int i, int i2) {
        long j2;
        int i3;
        List list2;
        int i4;
        ubc ubcVar2;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        sr8 sr8Var;
        nrf u;
        List list3;
        boolean z4;
        boolean z5;
        int i7;
        int i8;
        int i9;
        sr8 sr8Var2 = (sr8) pq4Var;
        sr8Var2.g0(-1680342121);
        if ((i & 6) == 0) {
            j2 = j;
            if (sr8Var2.g(j2)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i;
        } else {
            j2 = j;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (sr8Var2.h(kjcVar)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            list2 = list;
            if (sr8Var2.j(list2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    ubcVar2 = ubcVar;
                    if (sr8Var2.h(ubcVar2)) {
                        i7 = 2048;
                        i3 |= i7;
                    }
                } else {
                    ubcVar2 = ubcVar;
                }
                i7 = Barcode.FORMAT_UPC_E;
                i3 |= i7;
            } else {
                ubcVar2 = ubcVar;
            }
            i5 = i2 & 16;
            if (i5 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z2 = z;
                if (sr8Var2.i(z2)) {
                    i6 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
                if ((i3 & 9363) != 9362) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (sr8Var2.V(i3 & 1, z3)) {
                    sr8Var2.a0();
                    if ((i & 1) != 0 && !sr8Var2.D()) {
                        sr8Var2.Y();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        list3 = list2;
                    } else {
                        if (i10 != 0) {
                            list3 = CollectionsKt.emptyList();
                        } else {
                            list3 = list2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            ubcVar2 = new ubc(0.0f, 0.0f, 63);
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                    }
                    sr8Var2.t();
                    Context applicationContext = ((Context) sr8Var2.l(AndroidCompositionLocals_androidKt.b)).getApplicationContext();
                    boolean h = sr8Var2.h(applicationContext);
                    Object Q = sr8Var2.Q();
                    uwn uwnVar = oq4.a;
                    if (h || Q == uwnVar) {
                        Q = (ActivityManager) applicationContext.getSystemService(ActivityManager.class);
                        sr8Var2.o0(Q);
                    }
                    ActivityManager activityManager = (ActivityManager) Q;
                    boolean h2 = sr8Var2.h(applicationContext);
                    Object Q2 = sr8Var2.Q();
                    if (h2 || Q2 == uwnVar) {
                        Q2 = (PowerManager) applicationContext.getSystemService(PowerManager.class);
                        sr8Var2.o0(Q2);
                    }
                    PowerManager powerManager = (PowerManager) Q2;
                    boolean h3 = sr8Var2.h(activityManager);
                    Object Q3 = sr8Var2.Q();
                    if (h3 || Q3 == uwnVar) {
                        if (activityManager != null) {
                            z4 = activityManager.isLowRamDevice();
                        } else {
                            z4 = false;
                        }
                        Q3 = Boolean.valueOf(z4);
                        sr8Var2.o0(Q3);
                    }
                    Boolean bool = (Boolean) Q3;
                    bool.getClass();
                    boolean h4 = sr8Var2.h(powerManager);
                    Object Q4 = sr8Var2.Q();
                    if (h4 || Q4 == uwnVar) {
                        if (powerManager != null) {
                            z5 = powerManager.isPowerSaveMode();
                        } else {
                            z5 = false;
                        }
                        Q4 = ikl.c(Boolean.valueOf(z5));
                        sr8Var2.o0(Q4);
                    }
                    qqc qqcVar = (qqc) Q4;
                    boolean h5 = sr8Var2.h(qqcVar) | sr8Var2.j(powerManager) | sr8Var2.j(applicationContext);
                    Object Q5 = sr8Var2.Q();
                    if (h5 || Q5 == uwnVar) {
                        Q5 = new h7(applicationContext, powerManager, qqcVar, 7);
                        sr8Var2.o0(Q5);
                    }
                    hrl.a(applicationContext, powerManager, (Function1) Q5, sr8Var2);
                    Boolean bool2 = (Boolean) qqcVar.getValue();
                    bool2.getClass();
                    boolean booleanValue = bool.booleanValue();
                    boolean booleanValue2 = bool2.booleanValue();
                    if (Build.VERSION.SDK_INT >= 33 && !booleanValue && !booleanValue2) {
                        sr8Var2.e0(-1227893975);
                        List list4 = list3;
                        sr8Var = sr8Var2;
                        tin.a(j2, kjcVar, list4, ubc.a(ubcVar2, z2), sr8Var, i3 & 1022);
                        list2 = list4;
                        sr8Var.s(false);
                    } else {
                        list2 = list3;
                        sr8Var2.e0(-1227690088);
                        uin.a(j, kjcVar, ubc.a(ubcVar2, z2), sr8Var2, i3 & WebSocketProtocol.PAYLOAD_SHORT);
                        sr8Var = sr8Var2;
                        sr8Var.s(false);
                    }
                } else {
                    sr8Var = sr8Var2;
                    sr8Var.Y();
                }
                sr8 sr8Var3 = sr8Var;
                List list5 = list2;
                ubc ubcVar3 = ubcVar2;
                boolean z6 = z2;
                u = sr8Var3.u();
                if (u != null) {
                    u.d = new az1(j, kjcVar, list5, ubcVar3, z6, i, i2, 1);
                    return;
                }
                return;
            }
            z2 = z;
            if ((i3 & 9363) != 9362) {
            }
            if (sr8Var2.V(i3 & 1, z3)) {
            }
            sr8 sr8Var32 = sr8Var;
            List list52 = list2;
            ubc ubcVar32 = ubcVar2;
            boolean z62 = z2;
            u = sr8Var32.u();
            if (u != null) {
            }
        }
        list2 = list;
        if ((i & 3072) != 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i3 & 9363) != 9362) {
        }
        if (sr8Var2.V(i3 & 1, z3)) {
        }
        sr8 sr8Var322 = sr8Var;
        List list522 = list2;
        ubc ubcVar322 = ubcVar2;
        boolean z622 = z2;
        u = sr8Var322.u();
        if (u != null) {
        }
    }
}
