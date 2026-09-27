package com.google.mlkit.vision.text.internal;

import android.graphics.Point;
import android.graphics.Rect;
import defpackage.pwl;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zza {
    public static Rect zza(List list) {
        Iterator it = list.iterator();
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            i2 = Math.min(i2, point.x);
            i = Math.max(i, point.x);
            i3 = Math.min(i3, point.y);
            i4 = Math.max(i4, point.y);
        }
        return new Rect(i2, i3, i, i4);
    }

    public static List zzb(pwl pwlVar) {
        double sin = Math.sin(Math.toRadians(pwlVar.e));
        double cos = Math.cos(Math.toRadians(pwlVar.e));
        int i = pwlVar.a;
        int i2 = pwlVar.b;
        double d = pwlVar.c;
        Point point = new Point((int) (i + (d * cos)), (int) ((d * sin) + i2));
        double d2 = point.x;
        int i3 = pwlVar.d;
        double d3 = i3 * sin;
        double d4 = i3 * cos;
        Point point2 = r0[0];
        int i4 = point2.x;
        Point point3 = r0[2];
        int i5 = point3.x;
        Point point4 = r0[1];
        Point[] pointArr = {new Point(i, i2), point, new Point((int) (d2 - d3), (int) (d4 + pointArr[1].y)), new Point((i5 - point4.x) + i4, (point3.y - point4.y) + point2.y)};
        return Arrays.asList(pointArr);
    }
}
