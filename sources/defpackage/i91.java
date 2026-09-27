package defpackage;

import android.graphics.BlendMode;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class i91 implements u17, c91, mna {
    public float A;
    public BlurMaskFilter B;
    public final Path a = new Path();
    public final Matrix b = new Matrix();
    public final Matrix c = new Matrix();
    public final hva d = new hva(1, 0);
    public final hva e;
    public final hva f;
    public final hva g;
    public final hva h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final Matrix n;
    public final cwb o;
    public final ewa p;
    public final x99 q;
    public final j88 r;
    public i91 s;
    public i91 t;
    public List u;
    public final ArrayList v;
    public final gbj w;
    public boolean x;
    public boolean y;
    public hva z;

    /* JADX WARN: Type inference failed for: r10v4, types: [j88, g91] */
    public i91(cwb cwbVar, ewa ewaVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new hva(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new hva(mode2);
        hva hvaVar = new hva(1, 0);
        this.g = hvaVar;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        hva hvaVar2 = new hva();
        hvaVar2.setXfermode(new PorterDuffXfermode(mode3));
        this.h = hvaVar2;
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Matrix();
        this.v = new ArrayList();
        this.x = true;
        this.A = 0.0f;
        this.o = cwbVar;
        this.p = ewaVar;
        List list = ewaVar.h;
        if (ewaVar.u == dwa.INVERT) {
            hvaVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            hvaVar.setXfermode(new PorterDuffXfermode(mode));
        }
        g80 g80Var = ewaVar.i;
        g80Var.getClass();
        gbj gbjVar = new gbj(g80Var);
        this.w = gbjVar;
        gbjVar.b(this);
        if (list != null && !list.isEmpty()) {
            x99 x99Var = new x99(list, 8);
            this.q = x99Var;
            Iterator it = ((ArrayList) x99Var.b).iterator();
            while (it.hasNext()) {
                ((g91) it.next()).a(this);
            }
            Iterator it2 = ((ArrayList) this.q.c).iterator();
            while (it2.hasNext()) {
                g91 g91Var = (g91) it2.next();
                g(g91Var);
                g91Var.a(this);
            }
        }
        ewa ewaVar2 = this.p;
        if (!ewaVar2.t.isEmpty()) {
            ?? g91Var2 = new g91(ewaVar2.t);
            this.r = g91Var2;
            g91Var2.b = true;
            g91Var2.a(new fbj(this, 3));
            boolean z = ((Float) this.r.f()).floatValue() == 1.0f;
            if (z != this.x) {
                this.x = z;
                this.o.invalidateSelf();
            }
            g(this.r);
            return;
        }
        if (true != this.x) {
            this.x = true;
            this.o.invalidateSelf();
        }
    }

    @Override // defpackage.c91
    public final void a() {
        this.o.invalidateSelf();
    }

    public void c(Integer num, x4 x4Var) {
        this.w.c(num, x4Var);
    }

    @Override // defpackage.mna
    public final void d(lna lnaVar, int i, ArrayList arrayList, lna lnaVar2) {
        i91 i91Var = this.s;
        ewa ewaVar = this.p;
        if (i91Var != null) {
            String str = i91Var.p.c;
            lna lnaVar3 = new lna(lnaVar2);
            lnaVar3.a.add(str);
            if (lnaVar.a(i, this.s.p.c)) {
                i91 i91Var2 = this.s;
                lna lnaVar4 = new lna(lnaVar3);
                lnaVar4.b = i91Var2;
                arrayList.add(lnaVar4);
            }
            if (lnaVar.c(i, this.s.p.c) && lnaVar.d(i, ewaVar.c)) {
                this.s.o(lnaVar, lnaVar.b(i, this.s.p.c) + i, arrayList, lnaVar3);
            }
        }
        String str2 = ewaVar.c;
        String str3 = ewaVar.c;
        if (lnaVar.c(i, str2)) {
            if (!"__container".equals(str3)) {
                lna lnaVar5 = new lna(lnaVar2);
                lnaVar5.a.add(str3);
                if (lnaVar.a(i, str3)) {
                    lna lnaVar6 = new lna(lnaVar5);
                    lnaVar6.b = this;
                    arrayList.add(lnaVar6);
                }
                lnaVar2 = lnaVar5;
            }
            if (lnaVar.d(i, str3)) {
                o(lnaVar, lnaVar.b(i, str3) + i, arrayList, lnaVar2);
            }
        }
    }

    @Override // defpackage.u17
    public void f(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        i();
        Matrix matrix2 = this.n;
        matrix2.set(matrix);
        if (z) {
            List list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((i91) this.u.get(size)).w.e());
                }
            } else {
                i91 i91Var = this.t;
                if (i91Var != null) {
                    matrix2.preConcat(i91Var.w.e());
                }
            }
        }
        matrix2.preConcat(this.w.e());
    }

    public final void g(g91 g91Var) {
        if (g91Var == null) {
            return;
        }
        this.v.add(g91Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03c4  */
    @Override // defpackage.u17
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Canvas canvas, Matrix matrix, int i, p27 p27Var) {
        int i2;
        float f;
        int i3;
        int i4;
        hva hvaVar;
        pf1 pf1Var;
        BlendMode blendMode;
        float f2;
        Integer num;
        no0 no0Var = hua.a;
        if (this.x) {
            ewa ewaVar = this.p;
            boolean z = ewaVar.v;
            jua juaVar = ewaVar.y;
            if (!z) {
                i();
                Matrix matrix2 = this.b;
                matrix2.reset();
                matrix2.set(matrix);
                for (int size = this.u.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((i91) this.u.get(size)).w.e());
                }
                no0 no0Var2 = hua.a;
                gbj gbjVar = this.w;
                g91 g91Var = gbjVar.p;
                if (g91Var != null && (num = (Integer) g91Var.f()) != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 100;
                }
                int i5 = (int) ((((i / 255.0f) * i2) / 100.0f) * 255.0f);
                if (this.s == null && !l() && juaVar == jua.NORMAL) {
                    matrix2.preConcat(gbjVar.e());
                    j(canvas, matrix2, i5, p27Var);
                    m();
                    return;
                }
                RectF rectF = this.i;
                f(rectF, matrix2, false);
                if (this.s != null && ewaVar.u != dwa.INVERT) {
                    RectF rectF2 = this.l;
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                    this.s.f(rectF2, matrix, true);
                    if (!rectF.intersect(rectF2)) {
                        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                }
                matrix2.preConcat(gbjVar.e());
                RectF rectF3 = this.k;
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                boolean l = l();
                x99 x99Var = this.q;
                Path path = this.a;
                if (l) {
                    int size2 = ((List) x99Var.d).size();
                    int i6 = 0;
                    while (true) {
                        if (i6 < size2) {
                            k3c k3cVar = (k3c) ((List) x99Var.d).get(i6);
                            Path path2 = (Path) ((g91) ((ArrayList) x99Var.b).get(i6)).f();
                            if (path2 == null) {
                                i3 = size2;
                            } else {
                                path.set(path2);
                                path.transform(matrix2);
                                i3 = size2;
                                int i7 = h91.b[k3cVar.a.ordinal()];
                                if (i7 == 1 || i7 == 2 || ((i7 == 3 || i7 == 4) && k3cVar.d)) {
                                    break;
                                }
                                RectF rectF4 = this.m;
                                path.computeBounds(rectF4, false);
                                if (i6 == 0) {
                                    rectF3.set(rectF4);
                                } else {
                                    i4 = i6;
                                    rectF3.set(Math.min(rectF3.left, rectF4.left), Math.min(rectF3.top, rectF4.top), Math.max(rectF3.right, rectF4.right), Math.max(rectF3.bottom, rectF4.bottom));
                                    i6 = i4 + 1;
                                    size2 = i3;
                                }
                            }
                            i4 = i6;
                            i6 = i4 + 1;
                            size2 = i3;
                        } else if (!rectF.intersect(rectF3)) {
                            f = 0.0f;
                            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                    }
                }
                f = 0.0f;
                float width = canvas.getWidth();
                float height = canvas.getHeight();
                RectF rectF5 = this.j;
                rectF5.set(f, f, width, height);
                Matrix matrix3 = this.c;
                canvas.getMatrix(matrix3);
                if (!matrix3.isIdentity()) {
                    matrix3.invert(matrix3);
                    matrix3.mapRect(rectF5);
                }
                if (!rectF.intersect(rectF5)) {
                    rectF.set(f, f, f, f);
                }
                no0 no0Var3 = hua.a;
                if (rectF.width() >= 1.0f && rectF.height() >= 1.0f) {
                    hva hvaVar2 = this.d;
                    hvaVar2.setAlpha(255);
                    juaVar.getClass();
                    switch (iua.a[juaVar.ordinal()]) {
                        case 2:
                            pf1Var = pf1.MULTIPLY;
                            break;
                        case 3:
                            pf1Var = pf1.SCREEN;
                            break;
                        case 4:
                            pf1Var = pf1.OVERLAY;
                            break;
                        case 5:
                            pf1Var = pf1.DARKEN;
                            break;
                        case 6:
                            pf1Var = pf1.LIGHTEN;
                            break;
                        case 7:
                            pf1Var = pf1.PLUS;
                            break;
                        default:
                            pf1Var = null;
                            break;
                    }
                    if (pf1Var != null) {
                        switch (qf1.a[pf1Var.ordinal()]) {
                            case 1:
                                blendMode = BlendMode.CLEAR;
                                break;
                            case 2:
                                blendMode = BlendMode.SRC;
                                break;
                            case 3:
                                blendMode = BlendMode.DST;
                                break;
                            case 4:
                                blendMode = BlendMode.SRC_OVER;
                                break;
                            case 5:
                                blendMode = BlendMode.DST_OVER;
                                break;
                            case 6:
                                blendMode = BlendMode.SRC_IN;
                                break;
                            case 7:
                                blendMode = BlendMode.DST_IN;
                                break;
                            case 8:
                                blendMode = BlendMode.SRC_OUT;
                                break;
                            case 9:
                                blendMode = BlendMode.DST_OUT;
                                break;
                            case 10:
                                blendMode = BlendMode.SRC_ATOP;
                                break;
                            case 11:
                                blendMode = BlendMode.DST_ATOP;
                                break;
                            case 12:
                                blendMode = BlendMode.XOR;
                                break;
                            case 13:
                                blendMode = BlendMode.PLUS;
                                break;
                            case 14:
                                blendMode = BlendMode.MODULATE;
                                break;
                            case 15:
                                blendMode = BlendMode.SCREEN;
                                break;
                            case 16:
                                blendMode = BlendMode.OVERLAY;
                                break;
                            case 17:
                                blendMode = BlendMode.DARKEN;
                                break;
                            case MlKitException.UNSUPPORTED /* 18 */:
                                blendMode = BlendMode.LIGHTEN;
                                break;
                            case zh4.REMOTE_EXCEPTION /* 19 */:
                                blendMode = BlendMode.COLOR_DODGE;
                                break;
                            case 20:
                                blendMode = BlendMode.COLOR_BURN;
                                break;
                            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                                blendMode = BlendMode.HARD_LIGHT;
                                break;
                            case 22:
                                blendMode = BlendMode.SOFT_LIGHT;
                                break;
                            case 23:
                                blendMode = BlendMode.DIFFERENCE;
                                break;
                            case 24:
                                blendMode = BlendMode.EXCLUSION;
                                break;
                            case 25:
                                blendMode = BlendMode.MULTIPLY;
                                break;
                            case 26:
                                blendMode = BlendMode.HUE;
                                break;
                            case 27:
                                blendMode = BlendMode.SATURATION;
                                break;
                            case 28:
                                blendMode = BlendMode.COLOR;
                                break;
                            case 29:
                                blendMode = BlendMode.LUMINOSITY;
                                break;
                        }
                        hvaVar2.setBlendMode(blendMode);
                        z1k.e(canvas, rectF, hvaVar2);
                        if (juaVar == jua.MULTIPLY) {
                            f2 = 1.0f;
                            canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.h);
                        } else {
                            f2 = 1.0f;
                        }
                        j(canvas, matrix2, i5, p27Var);
                        if (l()) {
                            hva hvaVar3 = this.e;
                            canvas.saveLayer(rectF, hvaVar3);
                            int i8 = 0;
                            while (true) {
                                List list = (List) x99Var.d;
                                ArrayList arrayList = (ArrayList) x99Var.b;
                                if (i8 < list.size()) {
                                    k3c k3cVar2 = (k3c) list.get(i8);
                                    g91 g91Var2 = (g91) arrayList.get(i8);
                                    g91 g91Var3 = (g91) ((ArrayList) x99Var.c).get(i8);
                                    int[] iArr = h91.b;
                                    j3c j3cVar = k3cVar2.a;
                                    boolean z2 = k3cVar2.d;
                                    int i9 = iArr[j3cVar.ordinal()];
                                    int i10 = i8;
                                    if (i9 != 1) {
                                        hva hvaVar4 = this.f;
                                        if (i9 != 2) {
                                            if (i9 != 3) {
                                                if (i9 == 4) {
                                                    if (z2) {
                                                        z1k.e(canvas, rectF, hvaVar2);
                                                        canvas.drawRect(rectF, hvaVar2);
                                                        path.set((Path) g91Var2.f());
                                                        path.transform(matrix2);
                                                        hvaVar2.setAlpha((int) (((Integer) g91Var3.f()).intValue() * 2.55f));
                                                        canvas.drawPath(path, hvaVar4);
                                                        canvas.restore();
                                                    } else {
                                                        path.set((Path) g91Var2.f());
                                                        path.transform(matrix2);
                                                        hvaVar2.setAlpha((int) (((Integer) g91Var3.f()).intValue() * 2.55f));
                                                        canvas.drawPath(path, hvaVar2);
                                                    }
                                                }
                                            } else if (z2) {
                                                z1k.e(canvas, rectF, hvaVar3);
                                                canvas.drawRect(rectF, hvaVar2);
                                                hvaVar4.setAlpha((int) (((Integer) g91Var3.f()).intValue() * 2.55f));
                                                path.set((Path) g91Var2.f());
                                                path.transform(matrix2);
                                                canvas.drawPath(path, hvaVar4);
                                                canvas.restore();
                                            } else {
                                                z1k.e(canvas, rectF, hvaVar3);
                                                path.set((Path) g91Var2.f());
                                                path.transform(matrix2);
                                                hvaVar2.setAlpha((int) (((Integer) g91Var3.f()).intValue() * 2.55f));
                                                canvas.drawPath(path, hvaVar2);
                                                canvas.restore();
                                            }
                                        } else {
                                            if (i10 == 0) {
                                                hvaVar2.setColor(-16777216);
                                                hvaVar2.setAlpha(255);
                                                canvas.drawRect(rectF, hvaVar2);
                                            }
                                            if (z2) {
                                                z1k.e(canvas, rectF, hvaVar4);
                                                canvas.drawRect(rectF, hvaVar2);
                                                hvaVar4.setAlpha((int) (((Integer) g91Var3.f()).intValue() * 2.55f));
                                                path.set((Path) g91Var2.f());
                                                path.transform(matrix2);
                                                canvas.drawPath(path, hvaVar4);
                                                canvas.restore();
                                            } else {
                                                path.set((Path) g91Var2.f());
                                                path.transform(matrix2);
                                                canvas.drawPath(path, hvaVar4);
                                            }
                                        }
                                    } else if (!arrayList.isEmpty()) {
                                        for (int i11 = 0; i11 < list.size(); i11++) {
                                            if (((k3c) list.get(i11)).a == j3c.MASK_MODE_NONE) {
                                            }
                                        }
                                        hvaVar2.setAlpha(255);
                                        canvas.drawRect(rectF, hvaVar2);
                                        i8 = i10 + 1;
                                    }
                                    i8 = i10 + 1;
                                } else {
                                    no0 no0Var4 = hua.a;
                                    canvas.restore();
                                }
                            }
                        }
                        if (this.s != null) {
                            canvas.saveLayer(rectF, this.g);
                            canvas.drawRect(rectF.left - f2, rectF.top - f2, rectF.right + f2, rectF.bottom + f2, this.h);
                            this.s.h(canvas, matrix, i, null);
                            canvas.restore();
                        }
                        canvas.restore();
                    }
                    blendMode = null;
                    hvaVar2.setBlendMode(blendMode);
                    z1k.e(canvas, rectF, hvaVar2);
                    if (juaVar == jua.MULTIPLY) {
                    }
                    j(canvas, matrix2, i5, p27Var);
                    if (l()) {
                    }
                    if (this.s != null) {
                    }
                    canvas.restore();
                }
                if (this.y && (hvaVar = this.z) != null) {
                    hvaVar.setStyle(Paint.Style.STROKE);
                    this.z.setColor(-251901);
                    this.z.setStrokeWidth(4.0f);
                    canvas.drawRect(rectF, this.z);
                    this.z.setStyle(Paint.Style.FILL);
                    this.z.setColor(1357638635);
                    canvas.drawRect(rectF, this.z);
                }
                m();
            }
        }
    }

    public final void i() {
        if (this.u == null) {
            if (this.t == null) {
                this.u = Collections.EMPTY_LIST;
                return;
            }
            this.u = new ArrayList();
            for (i91 i91Var = this.t; i91Var != null; i91Var = i91Var.t) {
                this.u.add(i91Var);
            }
        }
    }

    public abstract void j(Canvas canvas, Matrix matrix, int i, p27 p27Var);

    public jw8 k() {
        return this.p.w;
    }

    public final boolean l() {
        x99 x99Var = this.q;
        if (x99Var != null && !((ArrayList) x99Var.b).isEmpty()) {
            return true;
        }
        return false;
    }

    public final void m() {
        ci5 ci5Var = this.o.a.a;
        String str = this.p.c;
    }

    public final void n(g91 g91Var) {
        this.v.remove(g91Var);
    }

    public void p(boolean z) {
        if (z && this.z == null) {
            this.z = new hva();
        }
        this.y = z;
    }

    public void q(float f) {
        no0 no0Var = hua.a;
        gbj gbjVar = this.w;
        g91 g91Var = gbjVar.p;
        if (g91Var != null) {
            g91Var.j(f);
        }
        g91 g91Var2 = gbjVar.v;
        if (g91Var2 != null) {
            g91Var2.j(f);
        }
        g91 g91Var3 = gbjVar.w;
        if (g91Var3 != null) {
            g91Var3.j(f);
        }
        g91 g91Var4 = gbjVar.l;
        if (g91Var4 != null) {
            g91Var4.j(f);
        }
        g91 g91Var5 = gbjVar.m;
        if (g91Var5 != null) {
            g91Var5.j(f);
        }
        g91 g91Var6 = gbjVar.n;
        if (g91Var6 != null) {
            g91Var6.j(f);
        }
        g91 g91Var7 = gbjVar.o;
        if (g91Var7 != null) {
            g91Var7.j(f);
        }
        j88 j88Var = gbjVar.q;
        if (j88Var != null) {
            j88Var.j(f);
        }
        j88 j88Var2 = gbjVar.r;
        if (j88Var2 != null) {
            j88Var2.j(f);
        }
        j88 j88Var3 = gbjVar.s;
        if (j88Var3 != null) {
            j88Var3.j(f);
        }
        j88 j88Var4 = gbjVar.t;
        if (j88Var4 != null) {
            j88Var4.j(f);
        }
        j88 j88Var5 = gbjVar.u;
        if (j88Var5 != null) {
            j88Var5.j(f);
        }
        int i = 0;
        x99 x99Var = this.q;
        if (x99Var != null) {
            ArrayList arrayList = (ArrayList) x99Var.b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((g91) arrayList.get(i2)).j(f);
            }
            no0 no0Var2 = hua.a;
        }
        j88 j88Var6 = this.r;
        if (j88Var6 != null) {
            j88Var6.j(f);
        }
        i91 i91Var = this.s;
        if (i91Var != null) {
            i91Var.q(f);
        }
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i < arrayList2.size()) {
                ((g91) arrayList2.get(i)).j(f);
                i++;
            } else {
                no0 no0Var3 = hua.a;
                return;
            }
        }
    }

    @Override // defpackage.w25
    public final void b(List list, List list2) {
    }

    public void o(lna lnaVar, int i, ArrayList arrayList, lna lnaVar2) {
    }
}
