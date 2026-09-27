package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class v1h {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public v1h() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f2 = this.d;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 > 180.0f) {
                return;
            }
            float f4 = this.b;
            float f5 = this.c;
            r1h r1hVar = new r1h(f4, f5, f4, f5);
            r1hVar.f = this.d;
            r1hVar.g = f3;
            this.g.add(new p1h(r1hVar));
            this.d = f;
        }
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((t1h) arrayList.get(i)).a(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t1h, java.lang.Object, s1h] */
    public final void c(float f, float f2) {
        ?? t1hVar = new t1h();
        t1hVar.b = f;
        t1hVar.c = f2;
        this.f.add(t1hVar);
        q1h q1hVar = new q1h(t1hVar, this.b, this.c);
        float a = q1hVar.a() + 270.0f;
        float a2 = q1hVar.a() + 270.0f;
        a(a);
        this.g.add(q1hVar);
        this.d = a2;
        this.b = f;
        this.c = f2;
    }

    public final void d(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
