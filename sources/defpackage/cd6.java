package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;
import android.os.Trace;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class cd6 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public cd6(int i) {
        switch (i) {
            case 2:
                this.a = new v1h[4];
                this.b = new Matrix[4];
                this.c = new Matrix[4];
                this.d = new PointF();
                this.e = new Path();
                this.f = new Path();
                this.g = new v1h();
                this.h = new float[2];
                this.i = new float[2];
                this.j = new Path();
                this.k = new Path();
                for (int i2 = 0; i2 < 4; i2++) {
                    ((v1h[]) this.a)[i2] = new v1h();
                    ((Matrix[]) this.b)[i2] = new Matrix();
                    ((Matrix[]) this.c)[i2] = new Matrix();
                }
                return;
            default:
                zqc zqcVar = new zqc(new xr8[16]);
                this.c = zqcVar;
                this.d = hig.a();
                this.e = zqcVar;
                this.f = new zqc(new Object[16]);
                this.g = new zqc(new Function0[16]);
                return;
        }
    }

    public static final boolean g(xr8 xr8Var, zqc zqcVar) {
        Object[] objArr = zqcVar.a;
        int i = zqcVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ayf ayfVar = ((xr8) objArr[i2]).a;
            if (ayfVar instanceof wyd) {
                zqc zqcVar2 = ((wyd) ayfVar).b;
                if (zqcVar2.j(xr8Var) || g(xr8Var, zqcVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static cd6 h() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return c1h.a;
        }
        return new cd6(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v6 */
    public void a(b1h b1hVar, float[] fArr, float f, RectF rectF, ba6 ba6Var, Path path) {
        int i;
        boolean z;
        float f2;
        m67 m67Var;
        ba6 ba6Var2;
        boolean z2;
        x75 m34Var;
        gsn gsnVar;
        ba6 ba6Var3 = ba6Var;
        Matrix[] matrixArr = (Matrix[]) this.c;
        float[] fArr2 = (float[]) this.h;
        v1h[] v1hVarArr = (v1h[]) this.a;
        Matrix[] matrixArr2 = (Matrix[]) this.b;
        path.rewind();
        Path path2 = (Path) this.e;
        path2.rewind();
        Path path3 = (Path) this.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            z = 0;
            if (i2 >= 4) {
                break;
            }
            PointF pointF = (PointF) this.d;
            if (fArr == null) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            m34Var = b1hVar.f;
                        } else {
                            m34Var = b1hVar.e;
                        }
                    } else {
                        m34Var = b1hVar.h;
                    }
                } else {
                    m34Var = b1hVar.g;
                }
            } else {
                m34Var = new m34(fArr[i2]);
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        gsnVar = b1hVar.b;
                    } else {
                        gsnVar = b1hVar.a;
                    }
                } else {
                    gsnVar = b1hVar.d;
                }
            } else {
                gsnVar = b1hVar.c;
            }
            v1h v1hVar = v1hVarArr[i2];
            gsnVar.getClass();
            Matrix[] matrixArr3 = matrixArr;
            gsnVar.a(v1hVar, f, m34Var.a(rectF));
            int i3 = i2 + 1;
            float f3 = (i3 % 4) * 90;
            matrixArr2[i2].reset();
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        pointF.set(rectF.right, rectF.top);
                    } else {
                        pointF.set(rectF.left, rectF.top);
                    }
                } else {
                    pointF.set(rectF.left, rectF.bottom);
                }
            } else {
                pointF.set(rectF.right, rectF.bottom);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f3);
            v1h v1hVar2 = v1hVarArr[i2];
            fArr2[0] = v1hVar2.b;
            fArr2[1] = v1hVar2.c;
            matrixArr2[i2].mapPoints(fArr2);
            matrixArr3[i2].reset();
            matrixArr3[i2].setTranslate(fArr2[0], fArr2[1]);
            matrixArr3[i2].preRotate(f3);
            i2 = i3;
            matrixArr = matrixArr3;
        }
        Matrix[] matrixArr4 = matrixArr;
        int i4 = 0;
        for (i = 4; i4 < i; i = 4) {
            v1h v1hVar3 = v1hVarArr[i4];
            v1hVar3.getClass();
            fArr2[z] = 0.0f;
            fArr2[1] = v1hVar3.a;
            matrixArr2[i4].mapPoints(fArr2);
            if (i4 == 0) {
                path.moveTo(fArr2[z], fArr2[1]);
            } else {
                path.lineTo(fArr2[z], fArr2[1]);
            }
            v1hVarArr[i4].b(matrixArr2[i4], path);
            if (ba6Var3 != null) {
                v1h v1hVar4 = v1hVarArr[i4];
                Matrix matrix = matrixArr2[i4];
                a5c a5cVar = (a5c) ba6Var3.b;
                BitSet bitSet = a5cVar.e;
                v1hVar4.getClass();
                f2 = 0.0f;
                bitSet.set(i4, z);
                u1h[] u1hVarArr = a5cVar.c;
                v1hVar4.a(v1hVar4.e);
                u1hVarArr[i4] = new p1h(new ArrayList(v1hVar4.g), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            Path path4 = (Path) this.j;
            v1h v1hVar5 = (v1h) this.g;
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            v1h v1hVar6 = v1hVarArr[i4];
            fArr2[0] = v1hVar6.b;
            fArr2[1] = v1hVar6.c;
            matrixArr2[i4].mapPoints(fArr2);
            float[] fArr3 = (float[]) this.i;
            v1h v1hVar7 = v1hVarArr[i6];
            v1hVar7.getClass();
            fArr3[0] = f2;
            fArr3[1] = v1hVar7.a;
            matrixArr2[i6].mapPoints(fArr3);
            v1h[] v1hVarArr2 = v1hVarArr;
            Matrix[] matrixArr5 = matrixArr2;
            float max = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f2);
            v1h v1hVar8 = v1hVarArr2[i4];
            fArr2[0] = v1hVar8.b;
            fArr2[1] = v1hVar8.c;
            matrixArr5[i4].mapPoints(fArr2);
            if (i4 != 1 && i4 != 3) {
                Math.abs(rectF.centerY() - fArr2[1]);
            } else {
                Math.abs(rectF.centerX() - fArr2[0]);
            }
            v1hVar5.d(0.0f, 270.0f, 0.0f);
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        m67Var = b1hVar.j;
                    } else {
                        m67Var = b1hVar.i;
                    }
                } else {
                    m67Var = b1hVar.l;
                }
            } else {
                m67Var = b1hVar.k;
            }
            m67Var.getClass();
            v1hVar5.c(max, 0.0f);
            path4.reset();
            v1hVar5.b(matrixArr4[i4], path4);
            if (!i(path4, i4) && !i(path4, i6)) {
                v1hVar5.b(matrixArr4[i4], path);
            } else {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = v1hVar5.a;
                matrixArr4[i4].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                v1hVar5.b(matrixArr4[i4], path2);
            }
            if (ba6Var != null) {
                Matrix matrix2 = matrixArr4[i4];
                ba6Var2 = ba6Var;
                a5c a5cVar2 = (a5c) ba6Var2.b;
                z2 = false;
                a5cVar2.e.set(i4 + 4, false);
                u1h[] u1hVarArr2 = a5cVar2.d;
                v1hVar5.a(v1hVar5.e);
                u1hVarArr2[i4] = new p1h(new ArrayList(v1hVar5.g), new Matrix(matrix2));
            } else {
                ba6Var2 = ba6Var;
                z2 = false;
            }
            z = z2;
            ba6Var3 = ba6Var2;
            i4 = i5;
            v1hVarArr = v1hVarArr2;
            matrixArr2 = matrixArr5;
        }
        path.close();
        path2.close();
        if (!path2.isEmpty()) {
            path.op(path2, Path.Op.UNION);
        }
    }

    public void b() {
        this.a = null;
        this.b = null;
        zqc zqcVar = (zqc) this.c;
        zqcVar.g();
        ((jqc) this.d).e();
        this.e = zqcVar;
        ((zqc) this.f).g();
        ((zqc) this.g).g();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public void c() {
        Set set = (Set) this.a;
        if (set != null && !set.isEmpty()) {
            Trace.beginSection("Compose:abandons");
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ayf ayfVar = (ayf) it.next();
                    it.remove();
                    ayfVar.b();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public void d() {
        zqc zqcVar = (zqc) this.c;
        zqc zqcVar2 = (zqc) this.f;
        Set set = (Set) this.a;
        if (set != null) {
            this.k = null;
            if (zqcVar2.c != 0) {
                Trace.beginSection("Compose:onForgotten");
                try {
                    jqc jqcVar = (jqc) this.h;
                    int i = zqcVar2.c;
                    while (true) {
                        i--;
                        if (-1 >= i) {
                            break;
                        }
                        Object obj = zqcVar2.a[i];
                        try {
                            if (obj instanceof xr8) {
                                ayf ayfVar = ((xr8) obj).a;
                                set.remove(ayfVar);
                                ayfVar.c();
                            }
                            if (obj instanceof ap4) {
                                if (jqcVar != null && jqcVar.a(obj)) {
                                    ((ap4) obj).e();
                                } else {
                                    ((ap4) obj).a();
                                }
                            }
                        } catch (Throwable th) {
                            pr4 pr4Var = (pr4) this.b;
                            if (pr4Var != null) {
                                pp4.a(new wu3(19, (qr4) pr4Var, obj), th);
                            }
                            throw th;
                        }
                    }
                } finally {
                    Trace.endSection();
                }
            }
            if (zqcVar.c != 0) {
                Trace.beginSection("Compose:onRemembered");
                try {
                    Set set2 = (Set) this.a;
                    if (set2 != null) {
                        Object[] objArr = zqcVar.a;
                        int i2 = zqcVar.c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            xr8 xr8Var = (xr8) objArr[i3];
                            ayf ayfVar2 = xr8Var.a;
                            set2.remove(ayfVar2);
                            try {
                                ayfVar2.a();
                            } catch (Throwable th2) {
                                pr4 pr4Var2 = (pr4) this.b;
                                if (pr4Var2 != null) {
                                    pp4.a(new wu3(19, (qr4) pr4Var2, xr8Var), th2);
                                }
                                throw th2;
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }

    public void e() {
        zqc zqcVar = (zqc) this.g;
        if (zqcVar.c != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = zqcVar.a;
                int i = zqcVar.c;
                for (int i2 = 0; i2 < i; i2++) {
                    ((Function0) objArr[i2]).invoke();
                }
                zqcVar.g();
            } finally {
                Trace.endSection();
            }
        }
    }

    public void f(xr8 xr8Var) {
        zqc zqcVar = (zqc) this.c;
        if (((jqc) this.d).a(xr8Var)) {
            ((jqc) this.d).l(xr8Var);
            if (!((zqc) this.e).j(xr8Var) && !zqcVar.j(xr8Var)) {
                g(xr8Var, zqcVar);
            }
            Set set = (Set) this.a;
            if (set != null) {
                set.add(xr8Var.a);
                return;
            }
            return;
        }
        gig gigVar = (gig) this.k;
        if (gigVar != null && gigVar.a(xr8Var)) {
            return;
        }
        ((zqc) this.f).b(xr8Var);
    }

    public boolean i(Path path, int i) {
        Path path2 = (Path) this.k;
        path2.reset();
        ((v1h[]) this.a)[i].b(((Matrix[]) this.b)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f)) {
            return true;
        }
        return false;
    }

    public void j(Set set, qr4 qr4Var) {
        b();
        this.a = set;
        this.b = qr4Var;
    }
}
