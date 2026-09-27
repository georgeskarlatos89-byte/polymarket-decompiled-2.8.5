package defpackage;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.e;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class aah {
    public static final tp g = new tp(20);
    public static final tp h = new tp(21);
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;

    public aah(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f = staggeredGridLayoutManager;
        this.a = new ArrayList();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
        this.e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(float f, int i) {
        z9h z9hVar;
        z9h[] z9hVarArr = (z9h[]) this.f;
        int i2 = this.b;
        ArrayList arrayList = this.a;
        if (i2 != 1) {
            Collections.sort(arrayList, g);
            this.b = 1;
        }
        int i3 = this.e;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.e = i4;
            z9hVar = z9hVarArr[i4];
        } else {
            z9hVar = new Object();
        }
        int i5 = this.c;
        this.c = i5 + 1;
        z9hVar.a = i5;
        z9hVar.b = i;
        z9hVar.c = f;
        arrayList.add(z9hVar);
        this.d += i;
        while (true) {
            int i6 = this.d;
            if (i6 > 2000) {
                int i7 = i6 - 2000;
                z9h z9hVar2 = (z9h) arrayList.get(0);
                int i8 = z9hVar2.b;
                if (i8 <= i7) {
                    this.d -= i8;
                    arrayList.remove(0);
                    int i9 = this.e;
                    if (i9 < 5) {
                        this.e = i9 + 1;
                        z9hVarArr[i9] = z9hVar2;
                    }
                } else {
                    z9hVar2.b = i8 - i7;
                    this.d -= i7;
                }
            } else {
                return;
            }
        }
    }

    public void b() {
        View view = (View) m51.h(1, this.a);
        guh guhVar = (guh) view.getLayoutParams();
        this.c = ((StaggeredGridLayoutManager) this.f).r.b(view);
        guhVar.getClass();
    }

    public void c() {
        this.a.clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public int d() {
        boolean z = ((StaggeredGridLayoutManager) this.f).w;
        ArrayList arrayList = this.a;
        if (z) {
            return f(arrayList.size() - 1, -1);
        }
        return f(0, arrayList.size());
    }

    public int e() {
        boolean z = ((StaggeredGridLayoutManager) this.f).w;
        ArrayList arrayList = this.a;
        if (z) {
            return f(0, arrayList.size());
        }
        return f(arrayList.size() - 1, -1);
    }

    public int f(int i, int i2) {
        int i3;
        boolean z;
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f;
        int k = staggeredGridLayoutManager.r.k();
        int g2 = staggeredGridLayoutManager.r.g();
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View view = (View) this.a.get(i);
            int e = staggeredGridLayoutManager.r.e(view);
            int b = staggeredGridLayoutManager.r.b(view);
            boolean z2 = false;
            if (e <= g2) {
                z = true;
            } else {
                z = false;
            }
            if (b >= k) {
                z2 = true;
            }
            if (z && z2 && (e < k || b > g2)) {
                return e.K(view);
            }
            i += i3;
        }
        return -1;
    }

    public int g(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        b();
        return this.c;
    }

    public View h(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f;
        View view = null;
        ArrayList arrayList = this.a;
        if (i2 == -1) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                View view2 = (View) arrayList.get(i3);
                if ((staggeredGridLayoutManager.w && e.K(view2) <= i) || ((!staggeredGridLayoutManager.w && e.K(view2) >= i) || !view2.hasFocusable())) {
                    break;
                }
                i3++;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size() - 1;
        while (size2 >= 0) {
            View view3 = (View) arrayList.get(size2);
            if ((staggeredGridLayoutManager.w && e.K(view3) >= i) || ((!staggeredGridLayoutManager.w && e.K(view3) <= i) || !view3.hasFocusable())) {
                break;
            }
            size2--;
            view = view3;
        }
        return view;
    }

    public float i() {
        int i = this.b;
        ArrayList arrayList = this.a;
        if (i != 0) {
            Collections.sort(arrayList, h);
            this.b = 0;
        }
        float f = 0.5f * this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            z9h z9hVar = (z9h) arrayList.get(i3);
            i2 += z9hVar.b;
            if (i2 >= f) {
                return z9hVar.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((z9h) m51.h(1, arrayList)).c;
    }

    public int j(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        guh guhVar = (guh) view.getLayoutParams();
        this.b = ((StaggeredGridLayoutManager) this.f).r.e(view);
        guhVar.getClass();
        return this.b;
    }

    public aah() {
        this.f = new z9h[5];
        this.a = new ArrayList();
        this.b = -1;
    }
}
