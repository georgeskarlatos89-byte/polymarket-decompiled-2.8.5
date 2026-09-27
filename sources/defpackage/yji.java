package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.tabs.TabLayout;
import com.polymarket.android.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class yji extends LinearLayout {
    public static final /* synthetic */ int l = 0;
    public vji a;
    public TextView b;
    public ImageView c;
    public View d;
    public h51 e;
    public View f;
    public TextView g;
    public ImageView h;
    public Drawable i;
    public int j;
    public final /* synthetic */ TabLayout k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yji(TabLayout tabLayout, Context context) {
        super(context);
        this.k = tabLayout;
        this.j = 2;
        e(context);
        setPaddingRelative(tabLayout.e, tabLayout.f, tabLayout.g, tabLayout.h);
        setGravity(17);
        setOrientation(!tabLayout.D ? 1 : 0);
        setClickable(true);
        PointerIcon systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
        WeakHashMap weakHashMap = k9k.a;
        f9k.a(this, systemIcon);
    }

    private h51 getBadge() {
        return this.e;
    }

    private h51 getOrCreateBadge() {
        if (this.e == null) {
            this.e = new h51(getContext());
        }
        b();
        h51 h51Var = this.e;
        if (h51Var != null) {
            return h51Var;
        }
        dmk.n("Unable to create badge");
        return null;
    }

    public final void a() {
        if (this.e != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.d;
            if (view != null) {
                h51 h51Var = this.e;
                if (h51Var != null) {
                    if (h51Var.d() != null) {
                        h51Var.d().setForeground(null);
                    } else {
                        view.getOverlay().remove(h51Var);
                    }
                }
                this.d = null;
            }
        }
    }

    public final void b() {
        if (this.e != null) {
            if (this.f != null) {
                a();
                return;
            }
            TextView textView = this.b;
            if (textView != null && this.a != null) {
                if (this.d != textView) {
                    a();
                    TextView textView2 = this.b;
                    if (this.e != null && textView2 != null) {
                        setClipChildren(false);
                        setClipToPadding(false);
                        ViewGroup viewGroup = (ViewGroup) getParent();
                        if (viewGroup != null) {
                            viewGroup.setClipChildren(false);
                            viewGroup.setClipToPadding(false);
                        }
                        h51 h51Var = this.e;
                        Rect rect = new Rect();
                        textView2.getDrawingRect(rect);
                        h51Var.setBounds(rect);
                        h51Var.i(textView2, null);
                        if (h51Var.d() != null) {
                            h51Var.d().setForeground(h51Var);
                        } else {
                            textView2.getOverlay().add(h51Var);
                        }
                        this.d = textView2;
                        return;
                    }
                    return;
                }
                c(textView);
                return;
            }
            a();
        }
    }

    public final void c(View view) {
        h51 h51Var = this.e;
        if (h51Var != null && view == this.d) {
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            h51Var.setBounds(rect);
            h51Var.i(view, null);
        }
    }

    public final void d() {
        boolean z;
        f();
        vji vjiVar = this.a;
        if (vjiVar != null) {
            TabLayout tabLayout = vjiVar.d;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition != -1 && selectedTabPosition == vjiVar.b) {
                    z = true;
                    setSelected(z);
                }
            } else {
                dmk.v("Tab not attached to a TabLayout");
                return;
            }
        }
        z = false;
        setSelected(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.i;
        if (drawable != null && drawable.isStateful()) {
            z = this.i.setState(drawableState);
        } else {
            z = false;
        }
        if (z) {
            invalidate();
            this.k.invalidate();
        }
    }

    public final void e(Context context) {
        TabLayout tabLayout = this.k;
        int i = tabLayout.t;
        if (i != 0) {
            Drawable b = qen.b(context, i);
            this.i = b;
            if (b != null && b.isStateful()) {
                this.i.setState(getDrawableState());
            }
        } else {
            this.i = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        Drawable drawable = gradientDrawable;
        if (tabLayout.n != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList colorStateList = tabLayout.n;
            int j = tym.j(colorStateList, tym.c);
            int[] iArr = tym.b;
            int j2 = tym.j(colorStateList, iArr);
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{tym.d, iArr, StateSet.NOTHING}, new int[]{j, j2, tym.j(colorStateList, tym.a)});
            if (tabLayout.H) {
                RippleDrawable rippleDrawable = new RippleDrawable(colorStateList2, null, null);
                ColorDrawable colorDrawable = FocusRingDrawable.p;
                drawable = rippleDrawable;
                if (uen.b(context.getTheme(), R.attr.focusRingsEnabled, false)) {
                    drawable = new FocusRingDrawable(context, rippleDrawable);
                }
            } else {
                RippleDrawable rippleDrawable2 = new RippleDrawable(colorStateList2, gradientDrawable, gradientDrawable2);
                FocusRingDrawable.e(context, rippleDrawable2, null);
                drawable = rippleDrawable2;
            }
        }
        setBackground(drawable);
        tabLayout.invalidate();
    }

    public final void f() {
        View view;
        int i;
        ViewParent parent;
        vji vjiVar = this.a;
        if (vjiVar != null) {
            view = vjiVar.c;
        } else {
            view = null;
        }
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.f;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.f);
                }
                addView(view);
            }
            this.f = view;
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.c.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(android.R.id.text1);
            this.g = textView2;
            if (textView2 != null) {
                this.j = textView2.getMaxLines();
            }
            this.h = (ImageView) view.findViewById(android.R.id.icon);
        } else {
            View view3 = this.f;
            if (view3 != null) {
                removeView(view3);
                this.f = null;
            }
            this.g = null;
            this.h = null;
        }
        if (this.f == null) {
            if (this.c == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.c = imageView2;
                addView(imageView2, 0);
            }
            if (this.b == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.b = textView3;
                addView(textView3);
                this.j = this.b.getMaxLines();
            }
            TextView textView4 = this.b;
            TabLayout tabLayout = this.k;
            textView4.setTextAppearance(tabLayout.i);
            if (isSelected() && (i = tabLayout.k) != -1) {
                this.b.setTextAppearance(i);
            } else {
                this.b.setTextAppearance(tabLayout.j);
            }
            ColorStateList colorStateList = tabLayout.l;
            if (colorStateList != null) {
                this.b.setTextColor(colorStateList);
            }
            g(this.b, this.c, true);
            b();
            ImageView imageView3 = this.c;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new xji(this, imageView3));
            }
            TextView textView5 = this.b;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new xji(this, textView5));
            }
        } else {
            TextView textView6 = this.g;
            if (textView6 != null || this.h != null) {
                g(textView6, this.h, false);
            }
        }
        if (vjiVar != null && !TextUtils.isEmpty(null)) {
            setContentDescription(null);
        }
    }

    public final void g(TextView textView, ImageView imageView, boolean z) {
        CharSequence charSequence;
        boolean z2;
        int i;
        CharSequence charSequence2;
        int i2;
        vji vjiVar = this.a;
        CharSequence charSequence3 = null;
        if (vjiVar != null) {
            charSequence = vjiVar.a;
        } else {
            charSequence = null;
        }
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (!isEmpty) {
                this.a.getClass();
                z2 = true;
            } else {
                z2 = false;
            }
            if (!isEmpty) {
                charSequence2 = charSequence;
            } else {
                charSequence2 = null;
            }
            textView.setText(charSequence2);
            if (z2) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView.setVisibility(i2);
            if (!isEmpty) {
                setVisibility(0);
            }
        } else {
            z2 = false;
        }
        if (z && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            if (z2 && imageView.getVisibility() == 0) {
                i = (int) m5n.b(getContext(), 8);
            } else {
                i = 0;
            }
            if (this.k.D) {
                if (i != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(i);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (i != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = i;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        if (!isEmpty) {
            charSequence3 = charSequence;
        }
        m5j.a(this, charSequence3);
    }

    public int getContentHeight() {
        View[] viewArr = {this.b, this.c, this.f};
        int i = 0;
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view = viewArr[i3];
            if (view != null && view.getVisibility() == 0) {
                if (z) {
                    i2 = Math.min(i2, view.getTop());
                } else {
                    i2 = view.getTop();
                }
                if (z) {
                    i = Math.max(i, view.getBottom());
                } else {
                    i = view.getBottom();
                }
                z = true;
            }
        }
        return i - i2;
    }

    public int getContentWidth() {
        View[] viewArr = {this.b, this.c, this.f};
        int i = 0;
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view = viewArr[i3];
            if (view != null && view.getVisibility() == 0) {
                if (z) {
                    i2 = Math.min(i2, view.getLeft());
                } else {
                    i2 = view.getLeft();
                }
                if (z) {
                    i = Math.max(i, view.getRight());
                } else {
                    i = view.getRight();
                }
                z = true;
            }
        }
        return i - i2;
    }

    public vji getTab() {
        return this.a;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        h51 h51Var = this.e;
        if (h51Var != null && h51Var.isVisible()) {
            h51 h51Var2 = this.e;
            q51 q51Var = h51Var2.e;
            CharSequence charSequence = null;
            if (h51Var2.isVisible()) {
                p51 p51Var = q51Var.b;
                if (p51Var.j != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    charSequence = p51Var.o;
                    if (charSequence == null) {
                        charSequence = h51Var2.e.b.j;
                    }
                } else if (h51Var2.g()) {
                    if (p51Var.q != 0 && (context = (Context) h51Var2.a.get()) != null) {
                        if (h51Var2.h != -2) {
                            int e = h51Var2.e();
                            int i = h51Var2.h;
                            if (e > i) {
                                charSequence = context.getString(p51Var.r, Integer.valueOf(i));
                            }
                        }
                        charSequence = context.getResources().getQuantityString(p51Var.q, h51Var2.e(), Integer.valueOf(h51Var2.e()));
                    }
                } else {
                    charSequence = p51Var.p;
                }
            }
            accessibilityNodeInfo.setContentDescription(charSequence);
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) c7.a(isSelected(), 0, 1, this.a.b, 1).a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) x6.e.a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.k;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(tabLayout.u, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.b != null) {
            float f = tabLayout.q;
            if (isSelected() && tabLayout.k != -1) {
                f = tabLayout.r;
            }
            int i3 = this.j;
            ImageView imageView = this.c;
            if (imageView != null && imageView.getVisibility() == 0) {
                i3 = 1;
            } else {
                TextView textView = this.b;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.s;
                }
            }
            float textSize = this.b.getTextSize();
            int lineCount = this.b.getLineCount();
            int maxLines = this.b.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (tabLayout.C == 1 && f > textSize && lineCount == 1) {
                    Layout layout = this.b.getLayout();
                    if (layout != null) {
                        if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.b.setTextSize(0, f);
                this.b.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.a != null) {
            if (!performClick) {
                playSoundEffect(0);
            }
            vji vjiVar = this.a;
            TabLayout tabLayout = vjiVar.d;
            if (tabLayout != null) {
                tabLayout.j(vjiVar, true);
                return true;
            }
            dmk.v("Tab not attached to a TabLayout");
            return false;
        }
        return performClick;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.b;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.f;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(vji vjiVar) {
        if (vjiVar != this.a) {
            this.a = vjiVar;
            d();
        }
    }
}
