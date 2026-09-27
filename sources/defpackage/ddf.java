package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import io.ably.lib.util.AgentHeaderCreator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ddf {
    public final ArrayList a = new ArrayList();
    public final gii b;
    public fz9 c;
    public fz9 d;
    public int e;
    public boolean f;

    public ddf(gii giiVar, ArrayList arrayList) {
        fz9 fz9Var = fz9.e;
        this.c = fz9Var;
        this.d = fz9Var;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList2 = giiVar.b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            fz9 fz9Var2 = giiVar.c;
            fz9 fz9Var3 = giiVar.d;
            this.c = fz9Var2;
            this.d = fz9Var3;
            c();
            b(giiVar.e);
        }
        this.b = giiVar;
    }

    public final void a(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ub4 ub4Var = (ub4) list.get(i);
            ub4Var.getClass();
            if (true == z) {
                ddf ddfVar = ub4Var.e;
                if (ddfVar == null) {
                    ub4Var.e = this;
                    this.a.add(ub4Var);
                } else {
                    throw new IllegalStateException(ub4Var + " (" + (i + 1) + AgentHeaderCreator.AGENT_DIVIDER + size + ") is already controlled by " + ddfVar + " but is still added to " + this);
                }
            }
        }
    }

    public final void b(int i) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ub4 ub4Var = (ub4) arrayList.get(size);
            if (!ub4Var.g) {
                ColorDrawable colorDrawable = ub4Var.f;
                if (ub4Var.h != i) {
                    ub4Var.h = i;
                    colorDrawable.setColor(i);
                    cdf cdfVar = ub4Var.b;
                    cdfVar.e = colorDrawable;
                    ss9 ss9Var = cdfVar.i;
                    if (ss9Var != null) {
                        ((View) ss9Var.c).setBackground(colorDrawable);
                    }
                }
            }
        }
    }

    public final void c() {
        int i;
        fz9 c;
        boolean z;
        float f;
        ArrayList arrayList = this.a;
        fz9 fz9Var = fz9.e;
        fz9 fz9Var2 = fz9Var;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ub4 ub4Var = (ub4) arrayList.get(size);
            fz9 fz9Var3 = this.c;
            fz9 fz9Var4 = this.d;
            ub4Var.c = fz9Var3;
            cdf cdfVar = ub4Var.b;
            ub4Var.d = fz9Var4;
            if (!cdfVar.c.equals(fz9Var2)) {
                cdfVar.c = fz9Var2;
                ss9 ss9Var = cdfVar.i;
                if (ss9Var != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ss9Var.b;
                    layoutParams.leftMargin = fz9Var2.a;
                    layoutParams.topMargin = fz9Var2.b;
                    layoutParams.rightMargin = fz9Var2.c;
                    layoutParams.bottomMargin = fz9Var2.d;
                    ((View) ss9Var.c).setLayoutParams(layoutParams);
                }
            }
            int i2 = ub4Var.a;
            int i3 = 8;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 != 8) {
                            c = fz9Var;
                            i = 0;
                        } else {
                            i = ub4Var.c.d;
                            int i4 = ub4Var.d.d;
                            if (cdfVar.b != i4) {
                                cdfVar.b = i4;
                                ss9 ss9Var2 = cdfVar.i;
                                if (ss9Var2 != null) {
                                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ss9Var2.b;
                                    layoutParams2.height = i4;
                                    ((View) ss9Var2.c).setLayoutParams(layoutParams2);
                                }
                            }
                            c = fz9.c(0, 0, 0, i);
                        }
                    } else {
                        i = ub4Var.c.c;
                        int i5 = ub4Var.d.c;
                        if (cdfVar.a != i5) {
                            cdfVar.a = i5;
                            ss9 ss9Var3 = cdfVar.i;
                            if (ss9Var3 != null) {
                                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ss9Var3.b;
                                layoutParams3.width = i5;
                                ((View) ss9Var3.c).setLayoutParams(layoutParams3);
                            }
                        }
                        c = fz9.c(0, 0, i, 0);
                    }
                } else {
                    i = ub4Var.c.b;
                    int i6 = ub4Var.d.b;
                    if (cdfVar.b != i6) {
                        cdfVar.b = i6;
                        ss9 ss9Var4 = cdfVar.i;
                        if (ss9Var4 != null) {
                            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ss9Var4.b;
                            layoutParams4.height = i6;
                            ((View) ss9Var4.c).setLayoutParams(layoutParams4);
                        }
                    }
                    c = fz9.c(0, i, 0, 0);
                }
            } else {
                i = ub4Var.c.a;
                int i7 = ub4Var.d.a;
                if (cdfVar.a != i7) {
                    cdfVar.a = i7;
                    ss9 ss9Var5 = cdfVar.i;
                    if (ss9Var5 != null) {
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ss9Var5.b;
                        layoutParams5.width = i7;
                        ((View) ss9Var5.c).setLayoutParams(layoutParams5);
                    }
                }
                c = fz9.c(i, 0, 0, 0);
            }
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            if (cdfVar.d != z) {
                cdfVar.d = z;
                ss9 ss9Var6 = cdfVar.i;
                if (ss9Var6 != null) {
                    View view = (View) ss9Var6.c;
                    if (z) {
                        i3 = 0;
                    }
                    view.setVisibility(i3);
                }
            }
            float f2 = 0.0f;
            if (i > 0) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ub4Var.a(f);
            if (i > 0) {
                f2 = 1.0f;
            }
            ub4Var.b(f2);
            fz9Var2 = fz9.a(fz9Var2, c);
        }
    }
}
