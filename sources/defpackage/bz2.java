package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class bz2 {
    public int a;
    public boolean b;
    public boolean c;
    public final Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;

    public bz2(g33 g33Var) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = wpc.p();
        this.a = -1;
        this.b = false;
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.c = false;
        this.g = uqc.a();
        hashSet.addAll(g33Var.a);
        this.e = wpc.s(g33Var.b);
        this.a = g33Var.c;
        arrayList.addAll(g33Var.e);
        this.c = g33Var.f;
        oki okiVar = g33Var.g;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = okiVar.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        this.g = new oki(arrayMap);
        this.b = g33Var.d;
    }

    public static boolean j(TotalCaptureResult totalCaptureResult, boolean z) {
        wz2 wz2Var;
        boolean z2;
        uz2 uz2Var;
        boolean z3;
        boolean z4;
        yz2 yz2Var;
        boolean z5;
        if (totalCaptureResult != null) {
            r66 r66Var = new r66(21, oki.b, totalCaptureResult);
            Set set = x55.a;
            Integer num = (Integer) ((CaptureResult) r66Var.c).get(CaptureResult.CONTROL_AF_MODE);
            if (num == null) {
                wz2Var = wz2.UNKNOWN;
            } else {
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1 && intValue != 2) {
                        if (intValue != 3 && intValue != 4) {
                            if (intValue != 5) {
                                o9n.b("C2CameraCaptureResult", "Undefined af mode: " + num);
                                wz2Var = wz2.UNKNOWN;
                            }
                        } else {
                            wz2Var = wz2.ON_CONTINUOUS_AUTO;
                        }
                    } else {
                        wz2Var = wz2.ON_MANUAL_AUTO;
                    }
                }
                wz2Var = wz2.OFF;
            }
            if (wz2Var != wz2.OFF && !x55.a.contains(r66Var.n())) {
                z2 = false;
            } else {
                z2 = true;
            }
            Integer num2 = (Integer) ((CaptureResult) r66Var.c).get(CaptureResult.CONTROL_AE_MODE);
            if (num2 == null) {
                uz2Var = uz2.UNKNOWN;
            } else {
                int intValue2 = num2.intValue();
                if (intValue2 != 0) {
                    if (intValue2 != 1) {
                        if (intValue2 != 2) {
                            if (intValue2 != 3) {
                                if (intValue2 != 4) {
                                    if (intValue2 != 5) {
                                        uz2Var = uz2.UNKNOWN;
                                    } else {
                                        uz2Var = uz2.ON_EXTERNAL_FLASH;
                                    }
                                } else {
                                    uz2Var = uz2.ON_AUTO_FLASH_REDEYE;
                                }
                            } else {
                                uz2Var = uz2.ON_ALWAYS_FLASH;
                            }
                        } else {
                            uz2Var = uz2.ON_AUTO_FLASH;
                        }
                    } else {
                        uz2Var = uz2.ON;
                    }
                } else {
                    uz2Var = uz2.OFF;
                }
            }
            if (uz2Var == uz2.OFF) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z ? !(z3 || x55.c.contains(r66Var.s())) : !(z3 || x55.d.contains(r66Var.s()))) {
                z4 = false;
            } else {
                z4 = true;
            }
            Integer num3 = (Integer) ((CaptureResult) r66Var.c).get(CaptureResult.CONTROL_AWB_MODE);
            if (num3 == null) {
                yz2Var = yz2.UNKNOWN;
            } else {
                switch (num3.intValue()) {
                    case 0:
                        yz2Var = yz2.OFF;
                        break;
                    case 1:
                        yz2Var = yz2.AUTO;
                        break;
                    case 2:
                        yz2Var = yz2.INCANDESCENT;
                        break;
                    case 3:
                        yz2Var = yz2.FLUORESCENT;
                        break;
                    case 4:
                        yz2Var = yz2.WARM_FLUORESCENT;
                        break;
                    case 5:
                        yz2Var = yz2.DAYLIGHT;
                        break;
                    case 6:
                        yz2Var = yz2.CLOUDY_DAYLIGHT;
                        break;
                    case 7:
                        yz2Var = yz2.TWILIGHT;
                        break;
                    case 8:
                        yz2Var = yz2.SHADE;
                        break;
                    default:
                        yz2Var = yz2.UNKNOWN;
                        break;
                }
            }
            if (yz2Var == yz2.OFF || x55.b.contains(r66Var.r())) {
                z5 = true;
            } else {
                z5 = false;
            }
            Objects.toString(r66Var.s());
            Objects.toString(r66Var.n());
            Objects.toString(r66Var.r());
            o9n.e(3, "ConvergenceUtils");
            if (z2 && z4 && z5) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(int i, TotalCaptureResult totalCaptureResult) {
        Integer num;
        o9n.e(3, "Camera2CapturePipeline");
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return false;
                }
                if (i != 3) {
                    throw new AssertionError(i);
                }
            }
            return true;
        }
        if (totalCaptureResult != null) {
            num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        } else {
            num = null;
        }
        o9n.e(3, "Camera2CapturePipeline");
        if (num == null || num.intValue() != 4) {
            return false;
        }
        return true;
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b((qz2) it.next());
        }
    }

    public void b(qz2 qz2Var) {
        ArrayList arrayList = (ArrayList) this.f;
        if (arrayList.contains(qz2Var)) {
            return;
        }
        arrayList.add(qz2Var);
    }

    public void c(ws4 ws4Var) {
        for (ow0 ow0Var : ws4Var.b()) {
            ((wpc) this.e).a(ow0Var, null);
            ((wpc) this.e).t(ow0Var, ws4Var.f(ow0Var), ws4Var.h(ow0Var));
        }
    }

    public void d(gi6 gi6Var) {
        ((HashSet) this.d).add(gi6Var);
    }

    public g33 e() {
        ArrayList arrayList = new ArrayList((HashSet) this.d);
        lld g = lld.g((wpc) this.e);
        int i = this.a;
        boolean z = this.b;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.f);
        boolean z2 = this.c;
        uqc uqcVar = (uqc) this.g;
        oki okiVar = oki.b;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : uqcVar.a.keySet()) {
            arrayMap.put(str, uqcVar.a.get(str));
        }
        return new g33(arrayList, g, i, z, arrayList2, z2, new oki(arrayMap), (c03) this.h);
    }

    public void f() {
        ArrayDeque arrayDeque = (ArrayDeque) this.g;
        arrayDeque.getClass();
        arrayDeque.clear();
        xah xahVar = (xah) this.h;
        xahVar.getClass();
        xahVar.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r10 > 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sy2 g(int i, int i2, int i3) {
        px2 px2Var = (px2) this.d;
        c80 c80Var = (c80) this.f;
        nv0 nv0Var = new nv0(c80Var, 2);
        int i4 = this.a;
        vwg vwgVar = (vwg) this.g;
        y39 y39Var = (y39) this.h;
        sy2 sy2Var = new sy2(i4, vwgVar, y39Var, px2Var, this.c, nv0Var);
        ArrayList arrayList = sy2Var.h;
        if (i == 0) {
            arrayList.add(new ly2(px2Var));
        }
        if (i2 == 3) {
            arrayList.add(new yy2(px2Var, vwgVar, y39Var, new e3g(c80Var)));
        } else if (this.b) {
            boolean z = ((us4) this.e).b;
            boolean z2 = true;
            if (!z && this.a != 3 && i3 != 1) {
                arrayList.add(new ky2(px2Var, i2, nv0Var));
            } else {
                if (!z) {
                    int i5 = px2Var.p.a.get();
                    o9n.e(3, "Camera2CameraControlImp");
                }
                z2 = false;
                arrayList.add(new az2(px2Var, i2, vwgVar, y39Var, z2));
            }
        }
        Objects.toString(arrayList);
        o9n.e(3, "Camera2CapturePipeline");
        return sy2Var;
    }

    public boolean h(mta mtaVar, mta mtaVar2) {
        return true;
    }

    public void i() {
        if (((ArrayDeque) this.g) == null) {
            this.g = new ArrayDeque(4);
        }
        if (((xah) this.h) == null) {
            this.h = new o4();
        }
    }

    public mta l(mta mtaVar) {
        mtaVar.getClass();
        return ((o7n) this.e).e(mtaVar);
    }

    public bz2(px2 px2Var, g03 g03Var, c80 c80Var, vwg vwgVar, y39 y39Var) {
        this.a = 1;
        this.d = px2Var;
        Integer num = (Integer) g03Var.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.c = num != null && num.intValue() == 2;
        this.g = vwgVar;
        this.h = y39Var;
        this.f = c80Var;
        this.e = new us4(c80Var, 7);
        this.b = gjl.b(new a5e(g03Var, 11));
    }

    public bz2() {
        this.d = new HashSet();
        this.e = wpc.p();
        this.a = -1;
        this.b = false;
        this.f = new ArrayList();
        this.c = false;
        this.g = uqc.a();
    }

    public bz2(boolean z, boolean z2, boolean z3, gij gijVar, o7n o7nVar, r7n r7nVar) {
        gijVar.getClass();
        o7nVar.getClass();
        r7nVar.getClass();
        this.b = z;
        this.c = z2;
        this.d = gijVar;
        this.e = o7nVar;
        this.f = r7nVar;
    }
}
