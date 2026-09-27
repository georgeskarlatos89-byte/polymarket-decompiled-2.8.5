package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class di1 {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public Object d;
    public Object e;

    public di1(Context context, j00 j00Var) {
        this.a = 1;
        this.d = j00Var;
        this.b = 0;
        this.e = new GestureDetector(context, new mu9(this));
    }

    public static di1 c(char c) {
        return new di1(new me7(new ej3(c)), false, cj3.d, bd0.API_PRIORITY_OTHER);
    }

    public t2l a() {
        boolean z;
        if (((pyf) this.d) != null) {
            z = true;
        } else {
            z = false;
        }
        arn.a("execute parameter required", z);
        return new t2l(this, (gw7[]) this.e, this.c, this.b);
    }

    public void b(int i) {
        switch (this.a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.e;
                WeakReference weakReference = bottomSheetBehavior.Z;
                if (weakReference != null && weakReference.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) bottomSheetBehavior.Z.get()).postOnAnimation((in8) this.d);
                        this.c = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.e;
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) sideSheetBehavior.p.get()).postOnAnimation((wvb) this.d);
                        this.c = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public List d(CharSequence charSequence) {
        charSequence.getClass();
        Iterator t = ((me7) this.e).t(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            qhh qhhVar = (qhh) t;
            if (qhhVar.hasNext()) {
                arrayList.add((String) qhhVar.next());
            } else {
                return Collections.unmodifiableList(arrayList);
            }
        }
    }

    public di1(me7 me7Var, boolean z, dj3 dj3Var, int i) {
        this.a = 3;
        this.e = me7Var;
        this.c = z;
        this.d = dj3Var;
        this.b = i;
    }

    public di1(SideSheetBehavior sideSheetBehavior) {
        this.a = 2;
        this.e = sideSheetBehavior;
        this.d = new wvb(this, 19);
    }

    public di1(BottomSheetBehavior bottomSheetBehavior) {
        this.a = 0;
        this.e = bottomSheetBehavior;
        this.d = new in8(this, 7);
    }

    public /* synthetic */ di1() {
        this.a = 4;
    }
}
