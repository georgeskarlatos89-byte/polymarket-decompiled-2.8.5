package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class tgc {
    public static final PointF a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int c(int i) {
        return Math.max(0, Math.min(255, i));
    }

    public static int d(float f, float f2) {
        boolean z;
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        if ((i ^ i2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = i % i2;
        if (!z && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static void e(e1h e1hVar, Path path) {
        Path path2;
        path.reset();
        PointF pointF = e1hVar.b;
        ArrayList arrayList = e1hVar.a;
        path.moveTo(pointF.x, pointF.y);
        float f = pointF.x;
        float f2 = pointF.y;
        PointF pointF2 = a;
        pointF2.set(f, f2);
        int i = 0;
        while (i < arrayList.size()) {
            mf5 mf5Var = (mf5) arrayList.get(i);
            PointF pointF3 = mf5Var.a;
            PointF pointF4 = mf5Var.b;
            PointF pointF5 = mf5Var.c;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i++;
            path = path2;
        }
        Path path3 = path;
        if (e1hVar.c) {
            path3.close();
        }
    }

    public static float f(float f, float f2, float f3) {
        return ix2.a(f2, f, f3, f);
    }

    public static void g(lna lnaVar, int i, ArrayList arrayList, lna lnaVar2, nna nnaVar) {
        if (lnaVar.a(i, nnaVar.getName())) {
            String name = nnaVar.getName();
            lna lnaVar3 = new lna(lnaVar2);
            lnaVar3.a.add(name);
            lna lnaVar4 = new lna(lnaVar3);
            lnaVar4.b = nnaVar;
            arrayList.add(lnaVar4);
        }
    }
}
