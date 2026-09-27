package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.collection.SparseArrayCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mvb {
    public HashMap c;
    public HashMap d;
    public float e;
    public HashMap f;
    public ArrayList g;
    public SparseArrayCompat h;
    public fub i;
    public ArrayList j;
    public Rect k;
    public float l;
    public float m;
    public float n;
    public final ci5 a = new ci5();
    public final HashSet b = new HashSet();
    public int o = 0;

    public final void a(String str) {
        wrb.a(str);
        this.b.add(str);
    }

    public final float b() {
        return ((this.m - this.l) / this.n) * 1000.0f;
    }

    public final Map c() {
        float c = z1k.c();
        if (c != this.e) {
            for (Map.Entry entry : this.d.entrySet()) {
                HashMap hashMap = this.d;
                String str = (String) entry.getKey();
                hwb hwbVar = (hwb) entry.getValue();
                float f = this.e / c;
                int i = (int) (hwbVar.a * f);
                int i2 = (int) (hwbVar.b * f);
                hwb hwbVar2 = new hwb(i, hwbVar.c, i2, hwbVar.d, hwbVar.e);
                Bitmap bitmap = hwbVar.f;
                if (bitmap != null) {
                    hwbVar2.f = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                }
                hashMap.put(str, hwbVar2);
            }
        }
        this.e = c;
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            sb.append(((ewa) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
