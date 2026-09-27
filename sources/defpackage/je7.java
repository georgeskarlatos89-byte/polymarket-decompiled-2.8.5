package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.polymarket.android.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class je7 extends LinearLayout {
    public final TextInputLayout a;
    public final FrameLayout b;
    public final CheckableImageButton c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public View.OnLongClickListener f;
    public final CheckableImageButton g;
    public final hj1 h;
    public int i;
    public final LinkedHashSet j;
    public ColorStateList k;
    public PorterDuff.Mode l;
    public int m;
    public ImageView.ScaleType n;
    public View.OnLongClickListener o;
    public CharSequence p;
    public final AppCompatTextView q;
    public boolean r;
    public EditText s;
    public final AccessibilityManager t;
    public AccessibilityManager.TouchExplorationStateChangeListener u;
    public final he7 v;

    public je7(TextInputLayout textInputLayout, bm9 bm9Var) {
        super(textInputLayout.getContext());
        final int i = 0;
        this.i = 0;
        this.j = new LinkedHashSet();
        this.v = new he7(this);
        ie7 ie7Var = new ie7(this);
        this.t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a = a(this, from, R.id.text_input_error_icon);
        this.c = a;
        CheckableImageButton a2 = a(frameLayout, from, R.id.text_input_end_icon);
        this.g = a2;
        this.h = new hj1(this, bm9Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.q = appCompatTextView;
        TypedArray typedArray = (TypedArray) bm9Var.c;
        if (typedArray.hasValue(38)) {
            this.d = wen.a(getContext(), bm9Var, 38);
        }
        if (typedArray.hasValue(39)) {
            this.e = m5n.c(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            j(bm9Var.p(37));
        }
        a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        a.setImportantForAccessibility(2);
        a.setClickable(false);
        a.setPressable(false);
        a.setCheckable(false);
        a.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.k = wen.a(getContext(), bm9Var, 32);
            }
            if (typedArray.hasValue(33)) {
                this.l = m5n.c(typedArray.getInt(33, -1), null);
            }
        }
        final int i2 = 1;
        if (typedArray.hasValue(30)) {
            h(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27)) {
                g(typedArray.getText(27));
            }
            a2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.k = wen.a(getContext(), bm9Var, 55);
            }
            if (typedArray.hasValue(56)) {
                this.l = m5n.c(typedArray.getInt(56, -1), null);
            }
            h(typedArray.getBoolean(54, false) ? 1 : 0);
            g(typedArray.getText(52));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.m) {
                this.m = dimensionPixelSize;
                a2.setMinimumWidth(dimensionPixelSize);
                a2.setMinimumHeight(dimensionPixelSize);
                a.setMinimumWidth(dimensionPixelSize);
                a.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(31)) {
                ImageView.ScaleType b = j4m.b(typedArray.getInt(31, -1));
                this.n = b;
                a2.setScaleType(b);
                a.setScaleType(b);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(R.id.textinput_suffix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            appCompatTextView.setAccessibilityLiveRegion(1);
            appCompatTextView.setTextAppearance(typedArray.getResourceId(73, 0));
            if (typedArray.hasValue(74)) {
                appCompatTextView.setTextColor(bm9Var.o(74));
            }
            CharSequence text = typedArray.getText(72);
            this.p = TextUtils.isEmpty(text) ? null : text;
            appCompatTextView.setText(text);
            o();
            frameLayout.addView(a2);
            addView(appCompatTextView);
            addView(frameLayout);
            addView(a);
            a.setOnFocusableChangedListener(new fy3(this) { // from class: ge7
                public final /* synthetic */ je7 b;

                {
                    this.b = this;
                }

                @Override // defpackage.fy3
                public final void b() {
                    int i3 = i;
                    je7 je7Var = this.b;
                    switch (i3) {
                        case 0:
                            CheckableImageButton checkableImageButton = je7Var.c;
                            j4m.f(checkableImageButton, checkableImageButton.getContentDescription());
                            return;
                        default:
                            CheckableImageButton checkableImageButton2 = je7Var.g;
                            j4m.f(checkableImageButton2, checkableImageButton2.getContentDescription());
                            return;
                    }
                }
            });
            a2.setOnFocusableChangedListener(new fy3(this) { // from class: ge7
                public final /* synthetic */ je7 b;

                {
                    this.b = this;
                }

                @Override // defpackage.fy3
                public final void b() {
                    int i3 = i2;
                    je7 je7Var = this.b;
                    switch (i3) {
                        case 0:
                            CheckableImageButton checkableImageButton = je7Var.c;
                            j4m.f(checkableImageButton, checkableImageButton.getContentDescription());
                            return;
                        default:
                            CheckableImageButton checkableImageButton2 = je7Var.g;
                            j4m.f(checkableImageButton2, checkableImageButton2.getContentDescription());
                            return;
                    }
                }
            });
            textInputLayout.s1.add(ie7Var);
            if (textInputLayout.e != null) {
                ie7Var.a(textInputLayout);
            }
            addOnAttachStateChangeListener(new t20(this, 2));
            return;
        }
        dmk.v("endIconSize cannot be less than 0");
        throw null;
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (wen.e(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final ke7 b() {
        ke7 og5Var;
        int i = this.i;
        hj1 hj1Var = this.h;
        SparseArray sparseArray = (SparseArray) hj1Var.d;
        ke7 ke7Var = (ke7) sparseArray.get(i);
        if (ke7Var == null) {
            je7 je7Var = (je7) hj1Var.e;
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                og5Var = new m37(je7Var);
                            } else {
                                dmk.v(ace.f(i, "Invalid end icon mode: "));
                                return null;
                            }
                        } else {
                            og5Var = new j54(je7Var);
                        }
                    } else {
                        og5Var = new ixd(je7Var, hj1Var.c);
                    }
                } else {
                    og5Var = new og5(je7Var, 1);
                }
            } else {
                og5Var = new og5(je7Var, 0);
            }
            sparseArray.append(i, og5Var);
            return og5Var;
        }
        return ke7Var;
    }

    public final int c() {
        int marginStart;
        if (!d() && !e()) {
            marginStart = 0;
        } else {
            CheckableImageButton checkableImageButton = this.g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        }
        return this.q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        if (this.b.getVisibility() == 0 && this.g.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.c.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean z3;
        ke7 b = b();
        boolean j = b.j();
        CheckableImageButton checkableImageButton = this.g;
        boolean z4 = true;
        if (j && (z3 = checkableImageButton.d) != b.k()) {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        } else {
            z2 = false;
        }
        if ((b instanceof m37) && (isActivated = checkableImageButton.isActivated()) != ((m37) b).l) {
            checkableImageButton.setActivated(!isActivated);
        } else {
            z4 = z2;
        }
        if (!z && !z4) {
            return;
        }
        j4m.d(this.a, checkableImageButton, this.k);
    }

    public final void g(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            j4m.f(checkableImageButton, charSequence);
        }
    }

    public final void h(int i) {
        boolean z;
        Drawable drawable;
        if (this.i == i) {
            return;
        }
        ke7 b = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.u;
        AccessibilityManager accessibilityManager = this.t;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        CharSequence charSequence = null;
        this.u = null;
        b.r();
        this.i = i;
        Iterator it = this.j.iterator();
        if (!it.hasNext()) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            i(z);
            ke7 b2 = b();
            int i2 = this.h.b;
            if (i2 == 0) {
                i2 = b2.d();
            }
            if (i2 != 0) {
                drawable = qen.b(getContext(), i2);
            } else {
                drawable = null;
            }
            CheckableImageButton checkableImageButton = this.g;
            checkableImageButton.setImageDrawable(drawable);
            TextInputLayout textInputLayout = this.a;
            if (drawable != null) {
                j4m.a(textInputLayout, checkableImageButton, this.k, this.l);
                j4m.d(textInputLayout, checkableImageButton, this.k);
            }
            checkableImageButton.setCheckable(b2.j());
            if (b2.i(textInputLayout.getBoxBackgroundMode())) {
                b2.q();
                AccessibilityManager.TouchExplorationStateChangeListener h = b2.h();
                this.u = h;
                if (h != null && accessibilityManager != null && isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(this.u);
                }
                View.OnClickListener f = b2.f();
                View.OnLongClickListener onLongClickListener = this.o;
                checkableImageButton.setOnClickListener(f);
                j4m.e(checkableImageButton, onLongClickListener);
                int c = b2.c();
                if (c != 0) {
                    charSequence = getResources().getText(c);
                }
                g(charSequence);
                EditText editText = this.s;
                if (editText != null) {
                    b2.l(editText);
                    k(b2);
                }
                j4m.a(textInputLayout, checkableImageButton, this.k, this.l);
                f(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        throw m51.g(it);
    }

    public final void i(boolean z) {
        int i;
        EditText editText;
        if (d() != z) {
            CheckableImageButton checkableImageButton = this.g;
            if (!z && checkableImageButton.hasFocus() && (editText = this.s) != null) {
                editText.requestFocus();
            }
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            l();
            n();
            this.a.s();
        }
    }

    public final void j(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.c;
        checkableImageButton.setImageDrawable(drawable);
        m();
        j4m.a(this.a, checkableImageButton, this.d, this.e);
    }

    public final void k(ke7 ke7Var) {
        if (this.s != null) {
            if (ke7Var.e() != null) {
                this.s.setOnFocusChangeListener(ke7Var.e());
            }
            if (ke7Var.g() != null) {
                this.g.setOnFocusChangeListener(ke7Var.g());
            }
        }
    }

    public final void l() {
        int i;
        boolean z;
        int i2 = 8;
        if (this.g.getVisibility() == 0 && !e()) {
            i = 0;
        } else {
            i = 8;
        }
        this.b.setVisibility(i);
        if (this.p != null && !this.r) {
            z = false;
        } else {
            z = 8;
        }
        if (d() || e() || !z) {
            i2 = 0;
        }
        setVisibility(i2);
    }

    public final void m() {
        int i;
        CheckableImageButton checkableImageButton = this.c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.a;
        if (drawable != null && textInputLayout.k.q && textInputLayout.o()) {
            i = 0;
        } else {
            i = 8;
        }
        checkableImageButton.setVisibility(i);
        l();
        n();
        if (this.i != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void n() {
        int i;
        TextInputLayout textInputLayout = this.a;
        if (textInputLayout.e == null) {
            return;
        }
        if (!d() && !e()) {
            i = textInputLayout.e.getPaddingEnd();
        } else {
            i = 0;
        }
        this.q.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.e.getPaddingTop(), i, textInputLayout.e.getPaddingBottom());
    }

    public final void o() {
        int i;
        AppCompatTextView appCompatTextView = this.q;
        int visibility = appCompatTextView.getVisibility();
        boolean z = false;
        if (this.p != null && !this.r) {
            i = 0;
        } else {
            i = 8;
        }
        if (visibility != i) {
            ke7 b = b();
            if (i == 0) {
                z = true;
            }
            b.o(z);
        }
        l();
        appCompatTextView.setVisibility(i);
        this.a.s();
    }
}
