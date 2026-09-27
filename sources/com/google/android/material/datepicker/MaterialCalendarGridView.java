package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.focus.FocusRingDrawable;
import defpackage.a1k;
import defpackage.ahh;
import defpackage.b1h;
import defpackage.k4c;
import defpackage.k9k;
import defpackage.me7;
import defpackage.nhk;
import defpackage.nkc;
import defpackage.p4c;
import defpackage.uen;
import defpackage.w4c;
import defpackage.ysk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class MaterialCalendarGridView extends GridView {
    public final boolean a;
    public me7 b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1k.c(null);
        if (w4c.u(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.polymarket.android.R.id.cancel_button);
            setNextFocusRightId(com.polymarket.android.R.id.confirm_button);
        }
        this.a = w4c.u(getContext(), com.polymarket.android.R.attr.nestedScrollable);
        k9k.j(this, new k4c(2));
    }

    public static void a(MaterialCalendarGridView materialCalendarGridView) {
        nkc nkcVar = (nkc) super.getAdapter();
        Drawable selector = materialCalendarGridView.getSelector();
        if (!(selector instanceof FocusRingDrawable)) {
            Context context = materialCalendarGridView.getContext();
            ColorDrawable colorDrawable = FocusRingDrawable.p;
            if (uen.b(context.getTheme(), com.polymarket.android.R.attr.focusRingsEnabled, false)) {
                selector = new FocusRingDrawable(context, selector);
            }
            if (selector instanceof FocusRingDrawable) {
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) selector;
                ysk yskVar = nkcVar.b;
                if (yskVar != null) {
                    focusRingDrawable.o.t = (b1h) ((nhk) yskVar.a).b;
                }
                materialCalendarGridView.setDrawSelectorOnTop(true);
                materialCalendarGridView.setSelector(focusRingDrawable);
            }
        }
    }

    public final nkc b() {
        return (nkc) super.getAdapter();
    }

    public final boolean c(int i, boolean z) {
        int b;
        me7 me7Var;
        me7 me7Var2;
        if (z) {
            b = ((nkc) super.getAdapter()).a(i);
        } else {
            b = ((nkc) super.getAdapter()).b(i);
        }
        if (b != -1) {
            setSelection(b);
            return true;
        }
        if (!z && (me7Var2 = this.b) != null) {
            return ((p4c) me7Var2.a).m(false);
        }
        if (!z || (me7Var = this.b) == null) {
            return true;
        }
        return ((p4c) me7Var.a).m(true);
    }

    public final boolean d(int i) {
        nkc nkcVar = (nkc) super.getAdapter();
        if (!nkcVar.e(i)) {
            long itemId = nkcVar.getItemId(i);
            for (int i2 = 1; i2 < nkcVar.a.d; i2++) {
                int i3 = i + i2;
                if ((i3 < nkc.e && nkcVar.getItemId(i3) == itemId && nkcVar.e(i3)) || ((i3 = i - i2) >= 0 && nkcVar.getItemId(i3) == itemId && nkcVar.e(i3))) {
                    i = i3;
                    break;
                }
            }
            i = -1;
        }
        if (i != -1) {
            setSelection(i);
            return true;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (nkc) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((nkc) super.getAdapter()).notifyDataSetChanged();
        post(new Runnable() { // from class: com.google.android.material.datepicker.a
            @Override // java.lang.Runnable
            public final void run() {
                MaterialCalendarGridView.a(MaterialCalendarGridView.this);
            }
        });
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        nkc nkcVar = (nkc) super.getAdapter();
        nkcVar.getClass();
        int max = Math.max(nkcVar.c(), getFirstVisiblePosition());
        int min = Math.min(nkcVar.f(), getLastVisiblePosition());
        nkcVar.d(max);
        nkcVar.d(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int b;
        if (z) {
            if (i != 33 && i != 1) {
                if (i != 130 && i != 2) {
                    b = -1;
                } else {
                    nkc nkcVar = (nkc) super.getAdapter();
                    b = nkcVar.a(nkcVar.c() - 1);
                }
            } else {
                nkc nkcVar2 = (nkc) super.getAdapter();
                b = nkcVar2.b(nkcVar2.f() + 1);
            }
            if (b != -1) {
                setSelection(b);
                return;
            } else {
                super.onFocusChanged(true, i, rect);
                return;
            }
        }
        super.onFocusChanged(false, i, rect);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        int a;
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1) {
            return super.onKeyDown(i, keyEvent);
        }
        if (getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (i != 21) {
            if (i != 22) {
                if (i != 61) {
                    if (!super.onKeyDown(i, keyEvent)) {
                        return false;
                    }
                    nkc nkcVar = (nkc) super.getAdapter();
                    int selectedItemPosition2 = getSelectedItemPosition();
                    if (selectedItemPosition2 == -1 || nkcVar.e(selectedItemPosition2)) {
                        return true;
                    }
                    nkc nkcVar2 = (nkc) super.getAdapter();
                    if (!d(selectedItemPosition2)) {
                        if (19 == i) {
                            int numColumns = getNumColumns();
                            while (true) {
                                selectedItemPosition2 -= numColumns;
                                if (selectedItemPosition2 < nkcVar2.c()) {
                                    break;
                                }
                                if (d(selectedItemPosition2)) {
                                    break;
                                }
                                numColumns = getNumColumns();
                            }
                        } else {
                            if (i == 20) {
                                int numColumns2 = getNumColumns();
                                while (true) {
                                    numColumns2 += selectedItemPosition2;
                                    if (numColumns2 > nkcVar2.f()) {
                                        break;
                                    }
                                    if (d(numColumns2)) {
                                        break;
                                    }
                                    selectedItemPosition2 = getNumColumns();
                                }
                            }
                            return false;
                        }
                    }
                    return true;
                }
                if (keyEvent.isShiftPressed()) {
                    a = ((nkc) super.getAdapter()).b(selectedItemPosition);
                } else {
                    a = ((nkc) super.getAdapter()).a(selectedItemPosition);
                }
                if (a == -1) {
                    return false;
                }
                setSelection(a);
                return true;
            }
            return c(selectedItemPosition, !z);
        }
        return c(selectedItemPosition, z);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.a) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    /* renamed from: setAdapter, reason: avoid collision after fix types in other method */
    public final void setAdapter2(ListAdapter listAdapter) {
        if (listAdapter instanceof nkc) {
            super.setAdapter(listAdapter);
        } else {
            ahh.m("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), nkc.class.getCanonicalName()});
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        super.setSelection(Math.max(i, ((nkc) super.getAdapter()).a(r0.c() - 1)));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (nkc) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final /* bridge */ /* synthetic */ void setAdapter(ListAdapter listAdapter) {
        setAdapter2(listAdapter);
    }
}
